package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public class ChatAttachAlertPhotoLayout extends f12 implements fn7 {
    public static boolean r1;
    public static final ArrayList s1 = new ArrayList();
    public static final HashMap t1 = new HashMap();
    public static final ArrayList u1 = new ArrayList();
    public static int v1 = -1;
    public boolean A0;
    public float B0;
    public float C0;
    public boolean D0;
    public final Drawable E;
    public boolean E0;
    public final i52 F;
    public final Rect F0;
    public final ar0 G;
    public float G0;
    public final u52 H;
    public boolean H0;
    public final b34 I;
    public boolean I0;
    public final j89 J;
    public boolean J0;
    public int K;
    public boolean K0;
    public boolean L;
    public int L0;
    public byte M;
    public int M0;
    public int N;
    public byte N0;
    public boolean O;
    public boolean O0;
    public AnimatorSet P;
    public boolean P0;
    public r52 Q;
    public boolean Q0;
    public final s52 R;
    public boolean R0;
    public final p52 S;
    public boolean S0;
    public final ImageView[] T;
    public int T0;
    public boolean U;
    public do6 U0;
    public final float[] V;
    public do6 V0;
    public final int[] W;
    public ArrayList W0;
    public float X0;
    public boolean Y0;
    public final b8 Z0;
    public float a0;
    public final b8 a1;
    public float b0;
    public final b8 b1;
    public boolean c0;
    public final b8 c1;
    public boolean d0;
    public final b8 d1;
    public boolean e0;
    public final r57 e1;
    public float f0;
    public final boolean f1;
    public final int[] g0;
    public final pn g1;
    public int h0;
    public boolean h1;
    public f52 i0;
    public final l52 i1;
    public final DecelerateInterpolator j0;
    public boolean j1;
    public final zc k0;
    public float k1;
    public final ShutterButton l0;
    public float l1;
    public final r3d m0;
    public float m1;
    public final boolean n;
    public AnimatorSet n0;
    public float n1;
    public Runnable o0;
    public float o1;
    public Boolean p0;
    public ViewPropertyAnimator p1;
    public final TextView q0;
    public int q1;
    public final i52 r;
    public final TextView r0;
    public final as s;
    public final ImageView s0;
    public boolean t0;
    public boolean u0;
    public boolean v0;
    public final u52 w;
    public boolean w0;
    public final m52 x;
    public boolean x0;
    public final TextView y;
    public boolean y0;
    public boolean z0;

    /* JADX WARN: Multi-variable type inference failed */
    public ChatAttachAlertPhotoLayout(n12 n12Var, Context context, boolean z, boolean z2, vnb vnbVar) {
        super(n12Var, vnbVar, context);
        final byte b = 2;
        this.T = new ImageView[2];
        this.V = new float[2];
        this.W = new int[2];
        byte b2 = 5;
        this.g0 = new int[5];
        this.j0 = new DecelerateInterpolator(1.5f);
        this.p0 = null;
        this.F0 = new Rect();
        int L = hl.L(80.0f);
        this.L0 = L;
        this.M0 = L;
        byte b3 = 3;
        this.N0 = (byte) 3;
        final byte b4 = 1;
        this.Y0 = true;
        this.g1 = new pn(null);
        this.i1 = new l52(this);
        this.f1 = z;
        this.n = z2;
        jn7.e().b(this, jn7.r2);
        jn7.e().b(this, jn7.o4);
        ex0 ex0Var = n12Var.c;
        n12 n12Var2 = this.b;
        byte b5 = 0;
        this.h1 = n12Var2.N2 != 0;
        m52 m52Var = new m52(this, context, n12Var2.U2.u(), vnbVar, (byte) 0);
        this.x = m52Var;
        m52Var.setSubMenuOpenSide(1);
        FrameLayout.LayoutParams d = tre.d(-2, -1.0f, 51, 60.0f, 0.0f, 40.0f, 0.0f);
        d.topMargin = hl.m;
        this.b.U2.addView(m52Var, 0, d);
        m52Var.setOnClickListener(new View.OnClickListener(this) { // from class: u42
            public final /* synthetic */ ChatAttachAlertPhotoLayout b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r52 r52Var;
                r52 r52Var2;
                byte b6 = b;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                byte b7 = 0;
                switch (b6) {
                    case 0:
                        boolean z3 = ChatAttachAlertPhotoLayout.r1;
                        if (!chatAttachAlertPhotoLayout.t0 && (r52Var = chatAttachAlertPhotoLayout.Q) != null && r52Var.isInited()) {
                            chatAttachAlertPhotoLayout.d0 = false;
                            chatAttachAlertPhotoLayout.Q.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.s0, (Property<ImageView, Float>) View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new h52(chatAttachAlertPhotoLayout, b7));
                            duration.start();
                            break;
                        }
                        break;
                    case 1:
                        boolean z4 = ChatAttachAlertPhotoLayout.r1;
                        if (!chatAttachAlertPhotoLayout.U && (r52Var2 = chatAttachAlertPhotoLayout.Q) != null && r52Var2.isInited() && chatAttachAlertPhotoLayout.c0) {
                            String currentFlashMode = chatAttachAlertPhotoLayout.Q.getCameraSession().getCurrentFlashMode();
                            String nextFlashMode = chatAttachAlertPhotoLayout.Q.getCameraSession().getNextFlashMode();
                            if (!currentFlashMode.equals(nextFlashMode)) {
                                chatAttachAlertPhotoLayout.Q.getCameraSession().setCurrentFlashMode(nextFlashMode);
                                chatAttachAlertPhotoLayout.U = true;
                                ImageView[] imageViewArr = chatAttachAlertPhotoLayout.T;
                                ImageView imageView = imageViewArr[0];
                                if (imageView == view) {
                                    imageView = imageViewArr[1];
                                }
                                imageView.setVisibility(0);
                                ChatAttachAlertPhotoLayout.q0(imageView, nextFlashMode);
                                AnimatorSet animatorSet = new AnimatorSet();
                                Property property = View.TRANSLATION_Y;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 0.0f, hl.L(48.0f));
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, -hl.L(48.0f), 0.0f);
                                Property property2 = View.ALPHA;
                                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property2, 0.0f, 1.0f));
                                animatorSet.setDuration(220L);
                                animatorSet.setInterpolator(k43.f);
                                animatorSet.addListener(new j8(chatAttachAlertPhotoLayout, view, imageView));
                                animatorSet.start();
                                break;
                            }
                        }
                        break;
                    case 2:
                        boolean z5 = ChatAttachAlertPhotoLayout.r1;
                        chatAttachAlertPhotoLayout.x.U(null, null);
                        break;
                    default:
                        boolean z6 = ChatAttachAlertPhotoLayout.r1;
                        if (chatAttachAlertPhotoLayout.Q != null) {
                            chatAttachAlertPhotoLayout.l0(null, false, false);
                            CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.Q.getCameraSessionObject());
                            break;
                        }
                        break;
                }
            }
        });
        TextView textView = new TextView(context);
        this.y = textView;
        textView.setImportantForAccessibility(2);
        textView.setGravity(3);
        textView.setSingleLine(true);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        int i = aob.j5;
        yob.X(textView, i, vnbVar);
        textView.setText(ob6.M0(2131752203, null));
        textView.setTypeface(hl.o());
        Drawable e = c00.e(context, R.drawable.ic_arrow_drop_down);
        this.E = e;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        yob.x(this, e, i, vnbVar, mode);
        textView.setPadding(0, 0, hl.L(10.0f), 0);
        m52Var.addView(textView, tre.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
        U(false);
        r57 r57Var = new r57(context, R.raw.position_below, ob6.M0(2131752541, null), R.raw.position_above, ob6.M0(2131752540, null), vnbVar);
        this.e1 = r57Var;
        r57Var.a(!this.b.W1, false);
        this.d1 = this.b.X2.e(7, R.drawable.msg_view_file, ob6.M0(2131753950, null));
        this.b.X2.a(5);
        this.b.X2.e(4, R.drawable.msg_openin, ob6.M0(2131747523, null));
        this.a1 = this.b.X2.e(1, R.drawable.msg_filehq, ob6.M0(2131745313, null));
        this.b.X2.e(0, R.drawable.msg_ungroup, ob6.M0(2131745312, null));
        this.b.X2.a(6);
        this.Z0 = this.b.X2.e(3, R.drawable.msg_spoiler, ob6.M0(2131751119, null));
        this.b1 = this.b.X2.e(2, R.drawable.menu_quality_hd, ob6.M0(2131745349, null));
        s7 s7Var = this.b.X2;
        s7Var.q();
        r57Var.setMinimumWidth(hl.L(196.0f));
        r57Var.setTag(8);
        s7Var.b.addView(r57Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) r57Var.getLayoutParams();
        if (ob6.a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = hl.L(48.0f);
        r57Var.setLayoutParams(layoutParams);
        r57Var.setOnClickListener(new t6(s7Var, b3));
        this.c1 = this.b.X2.e(9, R.drawable.menu_feature_paid, ob6.M0(2131747457, null));
        this.b.X2.setFitSubItems(true);
        i52 i52Var = new i52(this, context, vnbVar, b4);
        this.F = i52Var;
        i52Var.setFastScrollEnabled(1);
        i52Var.setFastScrollVisible(true);
        i52Var.getFastScroll().setAlpha(0.0f);
        i52Var.getFastScroll().a = false;
        i52Var.getFastScroll().i0 = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight();
        u52 u52Var = new u52(this, context, z2);
        this.H = u52Var;
        i52Var.setAdapter(u52Var);
        s52 s52Var = new s52(this, i52Var);
        this.R = s52Var;
        i52Var.i(s52Var);
        int i2 = 0;
        for (int i3 = 8; i2 < i3; i3 = 8) {
            u52Var.h.add(u52Var.L());
            i2++;
        }
        i52Var.setClipToPadding(false);
        i52Var.setItemAnimator(null);
        i52Var.setLayoutAnimation(null);
        i52Var.setVerticalScrollBarEnabled(false);
        yob.l(i52Var, 21, aob.A5, vnbVar);
        addView(i52Var, tre.d(-1, -1.0f, jn7.D1, 0.0f, 0.0f, 0.0f, -48.0f));
        i52Var.setOnScrollListener(new n52(this, b5));
        byte b6 = 2;
        ar0 ar0Var = new ar0(this, this.L0, b6);
        this.G = ar0Var;
        ar0Var.O = new ar1(this, b6);
        i52Var.setLayoutManager(ar0Var);
        i52Var.setOnItemClickListener(new bh(this, z2, vnbVar, b2));
        i52Var.setOnItemLongClickListener(new v42(this, b6));
        j89 j89Var = new j89(new zm9((Object) this, (byte) 19));
        this.J = j89Var;
        i52Var.F.add(j89Var);
        setBlur3Capture(i52Var);
        this.d = i52Var;
        this.f = true;
        b34 b34Var = new b34(context, vnbVar);
        this.I = b34Var;
        b34Var.setText(ob6.M0(2131747911, null));
        b34Var.setOnTouchListener(null);
        b34Var.setTextSize(16);
        addView(b34Var, tre.c(-2.0f, -1));
        if (this.Y0) {
            b34Var.b();
        } else {
            b34Var.c();
        }
        Paint paint = new Paint(1);
        paint.setColor(-2468275);
        p52 p52Var = new p52(context, paint);
        this.S = p52Var;
        hl.T3(p52Var, false, 1.0f, true, false);
        p52Var.setBackgroundResource(R.drawable.system);
        p52Var.getBackground().setColorFilter(new PorterDuffColorFilter(1711276032, mode));
        p52Var.setTextSize(1, 15.0f);
        p52Var.setTypeface(hl.o());
        p52Var.setAlpha(0.0f);
        p52Var.setTextColor(-1);
        p52Var.setPadding(hl.L(24.0f), hl.L(5.0f), hl.L(10.0f), hl.L(5.0f));
        ex0Var.addView(p52Var, tre.d(-2, -2.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
        zc zcVar = new zc((byte) 11, context, (Object) this);
        this.k0 = zcVar;
        zcVar.setVisibility(8);
        zcVar.setAlpha(0.0f);
        ex0Var.addView(zcVar, tre.e(-1, jn7.J1, 83));
        TextView textView2 = new TextView(context);
        this.q0 = textView2;
        textView2.setBackgroundResource(R.drawable.photos_rounded);
        textView2.setVisibility(8);
        textView2.setTextColor(-1);
        textView2.setGravity(17);
        textView2.setPivotX(0.0f);
        textView2.setPivotY(0.0f);
        textView2.setTypeface(hl.o());
        textView2.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.photos_arrow, 0);
        textView2.setCompoundDrawablePadding(hl.L(4.0f));
        textView2.setPadding(hl.L(16.0f), 0, hl.L(16.0f), 0);
        ex0Var.addView(textView2, tre.d(-2, 38.0f, 51, 0.0f, 0.0f, 0.0f, 116.0f));
        final byte b7 = 3;
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: u42
            public final /* synthetic */ ChatAttachAlertPhotoLayout b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r52 r52Var;
                r52 r52Var2;
                byte b62 = b7;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                byte b72 = 0;
                switch (b62) {
                    case 0:
                        boolean z3 = ChatAttachAlertPhotoLayout.r1;
                        if (!chatAttachAlertPhotoLayout.t0 && (r52Var = chatAttachAlertPhotoLayout.Q) != null && r52Var.isInited()) {
                            chatAttachAlertPhotoLayout.d0 = false;
                            chatAttachAlertPhotoLayout.Q.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.s0, (Property<ImageView, Float>) View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new h52(chatAttachAlertPhotoLayout, b72));
                            duration.start();
                            break;
                        }
                        break;
                    case 1:
                        boolean z4 = ChatAttachAlertPhotoLayout.r1;
                        if (!chatAttachAlertPhotoLayout.U && (r52Var2 = chatAttachAlertPhotoLayout.Q) != null && r52Var2.isInited() && chatAttachAlertPhotoLayout.c0) {
                            String currentFlashMode = chatAttachAlertPhotoLayout.Q.getCameraSession().getCurrentFlashMode();
                            String nextFlashMode = chatAttachAlertPhotoLayout.Q.getCameraSession().getNextFlashMode();
                            if (!currentFlashMode.equals(nextFlashMode)) {
                                chatAttachAlertPhotoLayout.Q.getCameraSession().setCurrentFlashMode(nextFlashMode);
                                chatAttachAlertPhotoLayout.U = true;
                                ImageView[] imageViewArr = chatAttachAlertPhotoLayout.T;
                                ImageView imageView = imageViewArr[0];
                                if (imageView == view) {
                                    imageView = imageViewArr[1];
                                }
                                imageView.setVisibility(0);
                                ChatAttachAlertPhotoLayout.q0(imageView, nextFlashMode);
                                AnimatorSet animatorSet = new AnimatorSet();
                                Property property = View.TRANSLATION_Y;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 0.0f, hl.L(48.0f));
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, -hl.L(48.0f), 0.0f);
                                Property property2 = View.ALPHA;
                                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property2, 0.0f, 1.0f));
                                animatorSet.setDuration(220L);
                                animatorSet.setInterpolator(k43.f);
                                animatorSet.addListener(new j8(chatAttachAlertPhotoLayout, view, imageView));
                                animatorSet.start();
                                break;
                            }
                        }
                        break;
                    case 2:
                        boolean z5 = ChatAttachAlertPhotoLayout.r1;
                        chatAttachAlertPhotoLayout.x.U(null, null);
                        break;
                    default:
                        boolean z6 = ChatAttachAlertPhotoLayout.r1;
                        if (chatAttachAlertPhotoLayout.Q != null) {
                            chatAttachAlertPhotoLayout.l0(null, false, false);
                            CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.Q.getCameraSessionObject());
                            break;
                        }
                        break;
                }
            }
        });
        r3d r3dVar = new r3d(context);
        this.m0 = r3dVar;
        r3dVar.setVisibility(8);
        r3dVar.setAlpha(0.0f);
        ex0Var.addView(r3dVar, tre.d(-2, 50.0f, 51, 0.0f, 0.0f, 0.0f, 116.0f));
        r3dVar.setDelegate(new v42(this, (byte) 3));
        ShutterButton shutterButton = new ShutterButton(context);
        shutterButton.b = new DecelerateInterpolator();
        shutterButton.x = new li7(shutterButton, (byte) 29);
        shutterButton.a = shutterButton.getResources().getDrawable(R.drawable.camera_btn);
        Paint paint2 = new Paint(1);
        shutterButton.c = paint2;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        paint2.setColor(-1);
        Paint paint3 = new Paint(1);
        shutterButton.d = paint3;
        paint3.setStyle(style);
        paint3.setColor(-3324089);
        shutterButton.f = rka.a;
        this.l0 = shutterButton;
        zcVar.addView(shutterButton, tre.e(84, 84, 17));
        shutterButton.setDelegate(new g52(this, vnbVar, ex0Var));
        shutterButton.setFocusable(true);
        shutterButton.setContentDescription(ob6.M0(2131754755, null));
        ImageView imageView = new ImageView(context);
        this.s0 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        zcVar.addView(imageView, tre.e(48, 48, 21));
        final Object[] objArr = null == true ? 1 : 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: u42
            public final /* synthetic */ ChatAttachAlertPhotoLayout b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r52 r52Var;
                r52 r52Var2;
                byte b62 = objArr;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                byte b72 = 0;
                switch (b62) {
                    case 0:
                        boolean z3 = ChatAttachAlertPhotoLayout.r1;
                        if (!chatAttachAlertPhotoLayout.t0 && (r52Var = chatAttachAlertPhotoLayout.Q) != null && r52Var.isInited()) {
                            chatAttachAlertPhotoLayout.d0 = false;
                            chatAttachAlertPhotoLayout.Q.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.s0, (Property<ImageView, Float>) View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new h52(chatAttachAlertPhotoLayout, b72));
                            duration.start();
                            break;
                        }
                        break;
                    case 1:
                        boolean z4 = ChatAttachAlertPhotoLayout.r1;
                        if (!chatAttachAlertPhotoLayout.U && (r52Var2 = chatAttachAlertPhotoLayout.Q) != null && r52Var2.isInited() && chatAttachAlertPhotoLayout.c0) {
                            String currentFlashMode = chatAttachAlertPhotoLayout.Q.getCameraSession().getCurrentFlashMode();
                            String nextFlashMode = chatAttachAlertPhotoLayout.Q.getCameraSession().getNextFlashMode();
                            if (!currentFlashMode.equals(nextFlashMode)) {
                                chatAttachAlertPhotoLayout.Q.getCameraSession().setCurrentFlashMode(nextFlashMode);
                                chatAttachAlertPhotoLayout.U = true;
                                ImageView[] imageViewArr = chatAttachAlertPhotoLayout.T;
                                ImageView imageView2 = imageViewArr[0];
                                if (imageView2 == view) {
                                    imageView2 = imageViewArr[1];
                                }
                                imageView2.setVisibility(0);
                                ChatAttachAlertPhotoLayout.q0(imageView2, nextFlashMode);
                                AnimatorSet animatorSet = new AnimatorSet();
                                Property property = View.TRANSLATION_Y;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 0.0f, hl.L(48.0f));
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, -hl.L(48.0f), 0.0f);
                                Property property2 = View.ALPHA;
                                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 0.0f, 1.0f));
                                animatorSet.setDuration(220L);
                                animatorSet.setInterpolator(k43.f);
                                animatorSet.addListener(new j8(chatAttachAlertPhotoLayout, view, imageView2));
                                animatorSet.start();
                                break;
                            }
                        }
                        break;
                    case 2:
                        boolean z5 = ChatAttachAlertPhotoLayout.r1;
                        chatAttachAlertPhotoLayout.x.U(null, null);
                        break;
                    default:
                        boolean z6 = ChatAttachAlertPhotoLayout.r1;
                        if (chatAttachAlertPhotoLayout.Q != null) {
                            chatAttachAlertPhotoLayout.l0(null, false, false);
                            CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.Q.getCameraSessionObject());
                            break;
                        }
                        break;
                }
            }
        });
        imageView.setContentDescription(ob6.M0(2131754747, null));
        for (int i4 = 0; i4 < 2; i4++) {
            this.T[i4] = new ImageView(context);
            this.T[i4].setScaleType(ImageView.ScaleType.CENTER);
            this.T[i4].setVisibility(4);
            this.k0.addView(this.T[i4], tre.e(48, 48, 51));
            this.T[i4].setOnClickListener(new View.OnClickListener(this) { // from class: u42
                public final /* synthetic */ ChatAttachAlertPhotoLayout b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    r52 r52Var;
                    r52 r52Var2;
                    byte b62 = b4;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                    byte b72 = 0;
                    switch (b62) {
                        case 0:
                            boolean z3 = ChatAttachAlertPhotoLayout.r1;
                            if (!chatAttachAlertPhotoLayout.t0 && (r52Var = chatAttachAlertPhotoLayout.Q) != null && r52Var.isInited()) {
                                chatAttachAlertPhotoLayout.d0 = false;
                                chatAttachAlertPhotoLayout.Q.switchCamera();
                                ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.s0, (Property<ImageView, Float>) View.SCALE_X, 0.0f).setDuration(100L);
                                duration.addListener(new h52(chatAttachAlertPhotoLayout, b72));
                                duration.start();
                                break;
                            }
                            break;
                        case 1:
                            boolean z4 = ChatAttachAlertPhotoLayout.r1;
                            if (!chatAttachAlertPhotoLayout.U && (r52Var2 = chatAttachAlertPhotoLayout.Q) != null && r52Var2.isInited() && chatAttachAlertPhotoLayout.c0) {
                                String currentFlashMode = chatAttachAlertPhotoLayout.Q.getCameraSession().getCurrentFlashMode();
                                String nextFlashMode = chatAttachAlertPhotoLayout.Q.getCameraSession().getNextFlashMode();
                                if (!currentFlashMode.equals(nextFlashMode)) {
                                    chatAttachAlertPhotoLayout.Q.getCameraSession().setCurrentFlashMode(nextFlashMode);
                                    chatAttachAlertPhotoLayout.U = true;
                                    ImageView[] imageViewArr = chatAttachAlertPhotoLayout.T;
                                    ImageView imageView2 = imageViewArr[0];
                                    if (imageView2 == view) {
                                        imageView2 = imageViewArr[1];
                                    }
                                    imageView2.setVisibility(0);
                                    ChatAttachAlertPhotoLayout.q0(imageView2, nextFlashMode);
                                    AnimatorSet animatorSet = new AnimatorSet();
                                    Property property = View.TRANSLATION_Y;
                                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 0.0f, hl.L(48.0f));
                                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, -hl.L(48.0f), 0.0f);
                                    Property property2 = View.ALPHA;
                                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 0.0f, 1.0f));
                                    animatorSet.setDuration(220L);
                                    animatorSet.setInterpolator(k43.f);
                                    animatorSet.addListener(new j8(chatAttachAlertPhotoLayout, view, imageView2));
                                    animatorSet.start();
                                    break;
                                }
                            }
                            break;
                        case 2:
                            boolean z5 = ChatAttachAlertPhotoLayout.r1;
                            chatAttachAlertPhotoLayout.x.U(null, null);
                            break;
                        default:
                            boolean z6 = ChatAttachAlertPhotoLayout.r1;
                            if (chatAttachAlertPhotoLayout.Q != null) {
                                chatAttachAlertPhotoLayout.l0(null, false, false);
                                CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.Q.getCameraSessionObject());
                                break;
                            }
                            break;
                    }
                }
            });
            this.T[i4].setContentDescription("flash mode " + i4);
        }
        TextView textView3 = new TextView(context);
        this.r0 = textView3;
        textView3.setTextSize(1, 15.0f);
        textView3.setTextColor(-1);
        textView3.setText(ob6.M0(2131743923, null));
        textView3.setShadowLayer(hl.L(3.33333f), 0.0f, hl.L(0.666f), 1275068416);
        textView3.setPadding(hl.L(6.0f), 0, hl.L(6.0f), 0);
        this.k0.addView(textView3, tre.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        i52 i52Var2 = new i52(this, context, vnbVar, null == true ? 1 : 0);
        this.r = i52Var2;
        i52Var2.setVerticalScrollBarEnabled(true);
        u52 u52Var2 = new u52(this, context, false);
        this.w = u52Var2;
        i52Var2.setAdapter(u52Var2);
        for (int i5 = 0; i5 < 8; i5++) {
            u52Var2.h.add(u52Var2.L());
        }
        i52Var2.setClipToPadding(false);
        i52Var2.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
        i52Var2.setItemAnimator(null);
        i52Var2.setLayoutAnimation(null);
        i52Var2.setOverScrollMode(2);
        i52Var2.setVisibility(4);
        i52Var2.setAlpha(0.0f);
        ex0Var.addView(i52Var2, tre.c(80.0f, -1));
        as asVar = new as((byte) 3, null == true ? 1 : 0, null == true ? 1 : 0);
        this.s = asVar;
        i52Var2.setLayoutManager(asVar);
        i52Var2.setOnItemClickListener(new m5((byte) 2));
    }

    public static boolean S() {
        HashMap hashMap = t1;
        if (hashMap.isEmpty()) {
            return false;
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (entry.getValue() instanceof no6) {
                no6 no6Var = (no6) entry.getValue();
                if (no6Var.d() && no6Var.j()) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean T() {
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = u1;
            if (i >= arrayList.size()) {
                break;
            }
            Object obj = t1.get(arrayList.get(i));
            if (!TextUtils.isEmpty(obj instanceof no6 ? ((no6) obj).a : obj instanceof ro6 ? ((ro6) obj).I : null)) {
                i2++;
            }
            i++;
        }
        return i2 <= 1;
    }

    public static boolean d0() {
        HashMap hashMap = t1;
        if (hashMap.isEmpty()) {
            return false;
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if ((entry.getValue() instanceof no6) && ((no6) entry.getValue()).d()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTopScrollOffset() {
        return org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + hl.L(7.0f) + this.q1;
    }

    public static void q0(ImageView imageView, String str) {
        str.getClass();
        switch (str) {
            case "on":
                imageView.setImageResource(R.drawable.flash_on);
                imageView.setContentDescription(ob6.M0(2131754909, null));
                break;
            case "off":
                imageView.setImageResource(R.drawable.flash_off);
                imageView.setContentDescription(ob6.M0(2131754910, null));
                break;
            case "auto":
                imageView.setImageResource(R.drawable.flash_auto);
                imageView.setContentDescription(ob6.M0(2131754911, null));
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlertKeepScreenOn(boolean z) {
        Window window = this.b.getWindow();
        if (window != null) {
            View peekDecorView = window.peekDecorView();
            if (peekDecorView == null || peekDecorView.isAttachedToWindow()) {
                if (z) {
                    window.addFlags(128);
                } else {
                    window.clearFlags(128);
                }
            }
        }
    }

    @Override // f12
    public final void A(int i, boolean z) {
        V();
        r52 r52Var = this.Q;
        if (r52Var != null) {
            r52Var.invalidateOutline();
            this.Q.invalidate();
        }
    }

    public final void A0() {
        ArrayList arrayList;
        u52 u52Var;
        HashMap hashMap;
        n12 n12Var = this.b;
        org.telegram.ui.ActionBar.e eVar = n12Var.Z1;
        org.telegram.ui.ActionBar.e eVar2 = n12Var.Z1;
        if (eVar instanceof zu1) {
            i52 i52Var = this.F;
            int childCount = i52Var.getChildCount();
            int i = 0;
            while (true) {
                arrayList = u1;
                u52Var = this.H;
                hashMap = t1;
                if (i >= childCount) {
                    break;
                }
                View childAt = i52Var.getChildAt(i);
                if (childAt instanceof d88) {
                    d88 d88Var = (d88) childAt;
                    int S = RecyclerView.S(childAt);
                    if (u52Var.f && S > this.N0) {
                        S--;
                    }
                    if (u52Var.d && this.U0 == this.V0) {
                        S--;
                    }
                    no6 c0 = c0(S);
                    d88Var.setHasSpoiler(c0 != null && c0.M);
                    d88Var.setHighQuality(c0 != null && c0.c());
                    if ((eVar2 instanceof zu1) && n12Var.Q3) {
                        d88Var.b(c0 != null ? arrayList.indexOf(Integer.valueOf(c0.C)) : -1, c0 != null && hashMap.containsKey(Integer.valueOf(c0.C)), true);
                    } else {
                        d88Var.b(-1, c0 != null && hashMap.containsKey(Integer.valueOf(c0.C)), true);
                    }
                }
                i++;
            }
            i52 i52Var2 = this.r;
            int childCount2 = i52Var2.getChildCount();
            for (int i2 = 0; i2 < childCount2; i2++) {
                View childAt2 = i52Var2.getChildAt(i2);
                if (childAt2 instanceof d88) {
                    d88 d88Var2 = (d88) childAt2;
                    int S2 = RecyclerView.S(childAt2);
                    if (u52Var.f && S2 > this.N0) {
                        S2--;
                    }
                    if (u52Var.d && this.U0 == this.V0) {
                        S2--;
                    }
                    no6 c02 = c0(S2);
                    d88Var2.setHasSpoiler(c02 != null && c02.M);
                    d88Var2.setHighQuality(c02 != null && c02.c());
                    if ((eVar2 instanceof zu1) && n12Var.Q3) {
                        d88Var2.b(c02 != null ? arrayList.indexOf(Integer.valueOf(c02.C)) : -1, c02 != null && hashMap.containsKey(Integer.valueOf(c02.C)), true);
                    } else {
                        d88Var2.b(-1, c02 != null && hashMap.containsKey(Integer.valueOf(c02.C)), true);
                    }
                }
            }
        }
    }

    @Override // f12
    public final void B() {
        ShutterButton shutterButton = this.l0;
        if (shutterButton == null) {
            return;
        }
        boolean z = this.R0;
        r52 r52Var = this.Q;
        rka rkaVar = rka.a;
        rka rkaVar2 = rka.b;
        if (z) {
            if (r52Var != null && shutterButton.getState() == rkaVar2) {
                shutterButton.a(rkaVar);
            }
            this.R0 = false;
            return;
        }
        if (r52Var != null && shutterButton.getState() == rkaVar2) {
            n0();
            CameraController.getInstance().stopVideoRecording(this.Q.getCameraSession(), false);
            shutterButton.a(rkaVar);
        }
        if (this.c0) {
            a0(false);
        }
        e0(true);
    }

    public final void B0(boolean z) {
        TextView textView = this.q0;
        if (textView != null) {
            n12 n12Var = this.b;
            byte b = n12Var.N2;
            TextView textView2 = n12Var.g3;
            if (b != 0 || n12Var.Q2 || n12Var.B1) {
                return;
            }
            HashMap hashMap = t1;
            Iterator it = hashMap.entrySet().iterator();
            boolean z2 = false;
            boolean z3 = false;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((no6) ((Map.Entry) it.next()).getValue()).b) {
                    z2 = true;
                } else {
                    z3 = true;
                }
                if (z2 && z3) {
                    break;
                }
            }
            int max = Math.max(1, hashMap.size());
            if (!z2) {
                textView.setText(ob6.G(hashMap.size(), "Photos", new Object[0]).toUpperCase());
                if (max != this.N || z) {
                    textView2.setText(ob6.G(max, "PhotosSelected", new Object[0]));
                }
            } else if (z3) {
                textView.setText(ob6.G(hashMap.size(), "Media", new Object[0]).toUpperCase());
                if (max != this.N || z) {
                    textView2.setText(ob6.G(max, "MediaSelected", new Object[0]));
                }
            } else {
                textView.setText(ob6.G(hashMap.size(), "Videos", new Object[0]).toUpperCase());
                if (max != this.N || z) {
                    textView2.setText(ob6.G(max, "VideosSelected", new Object[0]));
                }
            }
            boolean z4 = max > 1;
            n12Var.G1 = z4;
            n12Var.j3.setVisibility((!z4 || n12Var.N2 == 2) ? 8 : 0);
            this.N = max;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00da  */
    @Override // f12
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C(int i, int i2) {
        int y;
        int i3;
        int L;
        this.S0 = true;
        byte b = this.N0;
        byte b2 = 4;
        if (hl.O1()) {
            this.N0 = (byte) 4;
        } else {
            Point point = hl.q;
            if (point.x > point.y) {
                this.N0 = (byte) 4;
            } else {
                this.N0 = (byte) 3;
            }
        }
        this.q1 = hl.L(48.0f) + hl.n;
        i52 i52Var = this.F;
        ((FrameLayout.LayoutParams) i52Var.getLayoutParams()).topMargin = -this.q1;
        int L2 = (i - hl.L(4.0f)) - hl.L(4.0f);
        byte b3 = this.N0;
        int i4 = L2 / b3;
        this.L0 = i4;
        if (this.M0 != i4 || b != b3) {
            this.M0 = i4;
            hl.c3(new z42(this, b2));
        }
        this.G.x1(Math.max(1, ((this.N0 - 1) * hl.L(2.0f)) + (this.L0 * this.N0)));
        u52 u52Var = this.H;
        int ceil = (int) Math.ceil((u52Var.b() - 1) / this.N0);
        if (this.Q0) {
            y = hl.L(400.0f);
        } else {
            y = uh9.y(2.0f, ceil - 1, this.L0 * ceil);
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight();
        int e = qu6.e(6.0f, qd4.f(i2, y, currentActionBarHeight, hl.n) - hl.L(12.0f), 0);
        if (this.K != e) {
            this.K = e;
            u52Var.f();
        }
        if (!hl.O1()) {
            Point point2 = hl.q;
            if (point2.x > point2.y) {
                i3 = (int) (i2 / 3.5f);
                L = ((i3 + currentActionBarHeight) - hl.L(52.0f)) + this.q1;
                if (L < 0) {
                    L = 0;
                }
                if (i52Var.getPaddingTop() == L || i52Var.getPaddingBottom() != this.e) {
                    i52Var.setPadding(hl.L(2.0f), L, hl.L(2.0f), hl.L(48.0f) + this.e);
                }
                this.y.setTextSize(17.0f);
                this.S0 = false;
            }
        }
        i3 = (i2 / 5) << 1;
        L = ((i3 + currentActionBarHeight) - hl.L(52.0f)) + this.q1;
        if (L < 0) {
        }
        if (i52Var.getPaddingTop() == L) {
        }
        i52Var.setPadding(hl.L(2.0f), L, hl.L(2.0f), hl.L(48.0f) + this.e);
        this.y.setTextSize(17.0f);
        this.S0 = false;
    }

    @Override // f12
    public final void D() {
        n12 n12Var = this.b;
        if (!n12Var.isShowing() || n12Var.J || PhotoViewer.q0().V0()) {
            return;
        }
        U(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b6, code lost:
    
        if (((zu1) r2).y() == false) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0156 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01e6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01fb  */
    @Override // f12
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        long j;
        boolean z4;
        boolean z5;
        org.telegram.ui.ActionBar.e eVar;
        TLRPC.ChatFull chatFull;
        boolean z6;
        byte b = 0;
        n12 n12Var = this.b;
        if (i > 1) {
            r47 r47Var = n12Var.E3;
            s7 s7Var = n12Var.X2;
            if (r47Var == null) {
                if (getStarsPrice() <= 0) {
                    s7Var.S(0);
                    z = true;
                } else {
                    s7Var.u(0);
                    z = false;
                }
                if (!this.A0 || getStarsPrice() > 0) {
                    s7Var.u(1);
                    z2 = false;
                    if (i != 0) {
                        n12Var.X2.u(4);
                    }
                    b8 b8Var = this.a1;
                    if (i <= 1) {
                        n12Var.X2.S(5);
                        n12Var.X2.S(7);
                        b8Var.setText(ob6.M0(2131745363, null));
                    } else {
                        n12Var.X2.u(5);
                        n12Var.X2.u(7);
                        if (i != 0) {
                            b8Var.setText(ob6.M0(2131745364, null));
                        }
                    }
                    if (i > 0 && getStarsPrice() <= 0) {
                        if (n12Var != null) {
                            org.telegram.ui.ActionBar.e eVar2 = n12Var.Z1;
                            if (eVar2 instanceof zu1) {
                            }
                        }
                        z3 = true;
                        if (i > 0 || n12Var == null) {
                            j = 0;
                        } else {
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = n12Var.d2;
                            if (chatAttachAlertPhotoLayout != null) {
                                HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
                                ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                                if (!selectedPhotos.isEmpty()) {
                                    j = 0;
                                    int i2 = 0;
                                    z6 = false;
                                    loop0: while (true) {
                                        int i3 = i2;
                                        if (i2 >= Math.ceil(selectedPhotos.size() / 10.0f)) {
                                            break;
                                        }
                                        int i4 = i3 * 10;
                                        int min = Math.min(10, selectedPhotos.size() - i4);
                                        Utilities.b.nextLong();
                                        for (int i5 = 0; i5 < min; i5++) {
                                            int i6 = i4 + i5;
                                            if (i6 < selectedPhotosOrder.size()) {
                                                CharSequence charSequence = ((no6) selectedPhotos.get(selectedPhotosOrder.get(i6))).a;
                                                String charSequence2 = charSequence == null ? "" : charSequence.toString();
                                                if (n12Var.V0() != null && TextUtils.isEmpty(charSequence2) && i5 == 0) {
                                                    charSequence2 = n12Var.V0().getText().toString();
                                                }
                                                if (TextUtils.isEmpty(charSequence2)) {
                                                    continue;
                                                } else if (z6) {
                                                    break loop0;
                                                } else {
                                                    z6 = true;
                                                }
                                            }
                                        }
                                        i2 = i3 + 1;
                                    }
                                    z6 = false;
                                    if (z6 && (n12Var.Z1 instanceof zu1)) {
                                        z4 = true;
                                        if (i > 0 && n12Var != null) {
                                            eVar = n12Var.Z1;
                                            if ((eVar instanceof zu1) && xc2.V(((zu1) eVar).e) && (chatFull = ((zu1) eVar).r8) != null && chatFull.paid_media_allowed) {
                                                z5 = true;
                                                if (z3) {
                                                    String M0 = ob6.M0(2131751119, null);
                                                    b8 b8Var2 = this.Z0;
                                                    b8Var2.setText(M0);
                                                    b8Var2.setAnimatedIcon(R.raw.photo_spoiler);
                                                    n12Var.X2.u(3);
                                                } else if (n12Var != null) {
                                                    n12Var.X2.S(3);
                                                }
                                                if (n12Var != null) {
                                                    s7 s7Var2 = n12Var.X2;
                                                    if (getSelectedPhotosCount() == i) {
                                                        int selectedPhotosHighQualityCount = getSelectedPhotosHighQualityCount();
                                                        b8 b8Var3 = this.b1;
                                                        if (selectedPhotosHighQualityCount > 0) {
                                                            b8Var3.setText(ob6.M0(2131745348, null));
                                                            b8Var3.setIcon(R.drawable.menu_quality_sd);
                                                        } else {
                                                            b8Var3.setText(ob6.M0(2131745349, null));
                                                            b8Var3.setIcon(R.drawable.menu_quality_hd);
                                                        }
                                                        s7Var2.S(2);
                                                    } else {
                                                        s7Var2.u(2);
                                                    }
                                                }
                                                r57 r57Var = this.e1;
                                                if (z4) {
                                                    r57Var.setVisibility(8);
                                                } else {
                                                    r57Var.setVisibility(0);
                                                }
                                                if ((!z3 || z4) && (z2 || z)) {
                                                    n12Var.X2.S(6);
                                                } else {
                                                    n12Var.X2.u(6);
                                                }
                                                if (z5) {
                                                    n12Var.X2.u(9);
                                                    return;
                                                }
                                                b8 b8Var4 = this.c1;
                                                if (b8Var4 != null) {
                                                    long starsPrice = getStarsPrice();
                                                    if (starsPrice > j) {
                                                        b8Var4.setText(ob6.M0(2131747455, null));
                                                        b8Var4.setSubtext(ob6.G((int) starsPrice, "Stars", new Object[0]));
                                                    } else {
                                                        b8Var4.setText(ob6.M0(2131747457, null));
                                                        b8Var4.setSubtext(null);
                                                    }
                                                }
                                                this.F.N(new t42(b));
                                                n12Var.X2.S(9);
                                                return;
                                            }
                                        }
                                        z5 = false;
                                        if (z3) {
                                        }
                                        if (n12Var != null) {
                                        }
                                        r57 r57Var2 = this.e1;
                                        if (z4) {
                                        }
                                        if (z3) {
                                        }
                                        n12Var.X2.S(6);
                                        if (z5) {
                                        }
                                    }
                                }
                            }
                            j = 0;
                            z6 = false;
                            if (z6) {
                                z4 = true;
                                if (i > 0) {
                                    eVar = n12Var.Z1;
                                    if (eVar instanceof zu1) {
                                        z5 = true;
                                        if (z3) {
                                        }
                                        if (n12Var != null) {
                                        }
                                        r57 r57Var22 = this.e1;
                                        if (z4) {
                                        }
                                        if (z3) {
                                        }
                                        n12Var.X2.S(6);
                                        if (z5) {
                                        }
                                    }
                                }
                                z5 = false;
                                if (z3) {
                                }
                                if (n12Var != null) {
                                }
                                r57 r57Var222 = this.e1;
                                if (z4) {
                                }
                                if (z3) {
                                }
                                n12Var.X2.S(6);
                                if (z5) {
                                }
                            }
                        }
                        z4 = false;
                        if (i > 0) {
                        }
                        z5 = false;
                        if (z3) {
                        }
                        if (n12Var != null) {
                        }
                        r57 r57Var2222 = this.e1;
                        if (z4) {
                        }
                        if (z3) {
                        }
                        n12Var.X2.S(6);
                        if (z5) {
                        }
                    }
                    z3 = false;
                    if (i > 0) {
                    }
                    j = 0;
                    z4 = false;
                    if (i > 0) {
                    }
                    z5 = false;
                    if (z3) {
                    }
                    if (n12Var != null) {
                    }
                    r57 r57Var22222 = this.e1;
                    if (z4) {
                    }
                    if (z3) {
                    }
                    n12Var.X2.S(6);
                    if (z5) {
                    }
                } else {
                    s7Var.S(1);
                    z2 = true;
                    if (i != 0) {
                    }
                    b8 b8Var5 = this.a1;
                    if (i <= 1) {
                    }
                    if (i > 0) {
                        if (n12Var != null) {
                        }
                        z3 = true;
                        if (i > 0) {
                        }
                        j = 0;
                        z4 = false;
                        if (i > 0) {
                        }
                        z5 = false;
                        if (z3) {
                        }
                        if (n12Var != null) {
                        }
                        r57 r57Var222222 = this.e1;
                        if (z4) {
                        }
                        if (z3) {
                        }
                        n12Var.X2.S(6);
                        if (z5) {
                        }
                    }
                    z3 = false;
                    if (i > 0) {
                    }
                    j = 0;
                    z4 = false;
                    if (i > 0) {
                    }
                    z5 = false;
                    if (z3) {
                    }
                    if (n12Var != null) {
                    }
                    r57 r57Var2222222 = this.e1;
                    if (z4) {
                    }
                    if (z3) {
                    }
                    n12Var.X2.S(6);
                    if (z5) {
                    }
                }
            }
        }
        s7 s7Var3 = n12Var.X2;
        s7 s7Var4 = n12Var.X2;
        s7Var3.u(0);
        if (i == 0) {
            s7Var4.S(4);
            s7Var4.u(1);
        } else if (this.A0 && getStarsPrice() <= 0 && n12Var.E3 == null) {
            s7Var4.S(1);
            z = false;
            z2 = true;
            if (i != 0) {
            }
            b8 b8Var52 = this.a1;
            if (i <= 1) {
            }
            if (i > 0) {
            }
            z3 = false;
            if (i > 0) {
            }
            j = 0;
            z4 = false;
            if (i > 0) {
            }
            z5 = false;
            if (z3) {
            }
            if (n12Var != null) {
            }
            r57 r57Var22222222 = this.e1;
            if (z4) {
            }
            if (z3) {
            }
            n12Var.X2.S(6);
            if (z5) {
            }
        } else {
            s7Var4.u(1);
        }
        z = false;
        z2 = false;
        if (i != 0) {
        }
        b8 b8Var522 = this.a1;
        if (i <= 1) {
        }
        if (i > 0) {
        }
        z3 = false;
        if (i > 0) {
        }
        j = 0;
        z4 = false;
        if (i > 0) {
        }
        z5 = false;
        if (z3) {
        }
        if (n12Var != null) {
        }
        r57 r57Var222222222 = this.e1;
        if (z4) {
        }
        if (z3) {
        }
        n12Var.X2.S(6);
        if (z5) {
        }
    }

    @Override // f12
    public final boolean G(int i) {
        if (!this.c0) {
            return false;
        }
        if (i != 24 && i != 25 && i != 79 && i != 85) {
            return false;
        }
        ((g52) this.l0.getDelegate()).a();
        return true;
    }

    @Override // f12
    public final void H(f12 f12Var) {
        ViewPropertyAnimator viewPropertyAnimator = this.p1;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.x.setVisibility(0);
        boolean z = f12Var instanceof c62;
        TextView textView = this.y;
        if (z) {
            ViewPropertyAnimator interpolator = textView.animate().alpha(1.0f).setDuration(150L).setInterpolator(k43.j);
            this.p1 = interpolator;
            interpolator.start();
        } else {
            Z();
            textView.setAlpha(1.0f);
        }
        this.b.U2.setTitle("");
        this.G.g1(0, 0);
        if (z) {
            this.F.post(new dy1(this, f12Var, (byte) 19));
        }
        V();
        o0();
    }

    @Override // f12
    public final void I() {
        this.O = false;
        r52 r52Var = this.Q;
        if (r52Var != null) {
            r52Var.setVisibility(0);
        }
        if (this.v0) {
            this.v0 = false;
            U(true);
        }
    }

    @Override // f12
    public final void J() {
        this.F.A0(0);
    }

    public final int Q(no6 no6Var, int i) {
        Integer valueOf = Integer.valueOf(no6Var.C);
        HashMap hashMap = t1;
        boolean containsKey = hashMap.containsKey(valueOf);
        ArrayList arrayList = u1;
        if (containsKey) {
            no6Var.N = 0L;
            no6Var.M = false;
            no6Var.O = null;
            no6Var.z = null;
            hashMap.remove(valueOf);
            int indexOf = arrayList.indexOf(valueOf);
            if (indexOf >= 0) {
                arrayList.remove(indexOf);
            }
            B0(false);
            z0();
            if (i >= 0) {
                no6Var.e();
                this.i1.X(i);
            }
            return indexOf;
        }
        no6Var.N = getStarsPrice();
        no6Var.M = getStarsPrice() > 0;
        no6Var.R = false;
        if (d0()) {
            no6Var.O = Boolean.valueOf(!S());
        }
        no6Var.z = Boolean.valueOf(no6Var.c());
        boolean W = W(true);
        hashMap.put(valueOf, no6Var);
        arrayList.add(valueOf);
        if (W) {
            A0();
            return -1;
        }
        B0(true);
        return -1;
    }

    public final void R() {
        r52 r52Var = this.Q;
        if (r52Var != null) {
            if (!this.c0) {
                r52Var.setTranslationX(this.V[0]);
            }
            int i = this.L0;
            int L = hl.L(2.0f) + (i << 1);
            if (this.c0) {
                return;
            }
            this.Q.setClipTop((int) this.a0);
            this.Q.setClipBottom((int) this.b0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.Q.getLayoutParams();
            if (layoutParams.height == L && layoutParams.width == i) {
                return;
            }
            layoutParams.width = i;
            layoutParams.height = L;
            this.Q.setLayoutParams(layoutParams);
            hl.c3(new dy1(this, layoutParams, (byte) 20));
        }
    }

    public final void U(boolean z) {
        u52 u52Var;
        n12 n12Var = this.b;
        boolean z2 = n12Var.P1;
        org.telegram.ui.ActionBar.e eVar = n12Var.Z1;
        if (z2 || !this.n) {
            return;
        }
        boolean z3 = this.O0;
        boolean z4 = this.P0;
        org.telegram.ui.ActionBar.e Q = eVar == null ? LaunchActivity.Q() : eVar;
        if (Q == null || Q.getParentActivity() == null) {
            return;
        }
        boolean z5 = false;
        if (xea.v0) {
            boolean z6 = Q.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0;
            this.P0 = z6;
            if (z6) {
                if (z) {
                    try {
                        eVar.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE"}, 17);
                    } catch (Exception unused) {
                    }
                }
                this.O0 = false;
            } else {
                if (z || xea.L0) {
                    CameraController.getInstance().initCamera(null);
                }
                z5 = CameraController.getInstance().isCameraInitied();
                this.O0 = z5;
            }
        } else {
            this.O0 = false;
        }
        if ((z3 != z5 || z4 != this.P0) && (u52Var = this.H) != null) {
            u52Var.f();
        }
        if (n12Var.P1 || !n12Var.isShowing() || !this.O0 || ((Paint) n12Var.Z.b).getAlpha() == 0 || this.c0) {
            return;
        }
        u0();
    }

    public final void V() {
        f89 L;
        float[] fArr;
        if (PhotoViewer.C0() && PhotoViewer.q0().o5 != null && PhotoViewer.q0().o5.W) {
            return;
        }
        r52 r52Var = this.Q;
        if (r52Var != null) {
            r52Var.invalidateOutline();
        }
        int i = this.N0 - 1;
        i52 i52Var = this.F;
        f89 L2 = i52Var.L(i);
        if (L2 != null) {
            L2.a.invalidateOutline();
        }
        if ((!this.H.d || !this.O0 || this.U0 != this.V0) && (L = i52Var.L(0)) != null) {
            L.a.invalidateOutline();
        }
        r52 r52Var2 = this.Q;
        if (r52Var2 != null) {
            r52Var2.invalidate();
        }
        p52 p52Var = this.S;
        if (p52Var != null) {
            ((ViewGroup.MarginLayoutParams) p52Var.getLayoutParams()).topMargin = getRootWindowInsets() == null ? hl.L(16.0f) : getRootWindowInsets().getSystemWindowInsetTop() + hl.L(2.0f);
        }
        if (this.O0) {
            int childCount = i52Var.getChildCount();
            int i2 = 0;
            while (true) {
                fArr = this.V;
                if (i2 >= childCount) {
                    break;
                }
                View childAt = i52Var.getChildAt(i2);
                if (!(childAt instanceof x78)) {
                    i2++;
                } else if (childAt.isAttachedToWindow()) {
                    float y = getY() + i52Var.getY() + childAt.getY();
                    n12 n12Var = this.b;
                    ViewGroup viewGroup = n12Var.b;
                    n02 n02Var = n12Var.v3;
                    tt ttVar = n12Var.L2;
                    float y2 = viewGroup.getY() + y;
                    float x = (n12Var.b.getX() + (getX() + (i52Var.getX() + childAt.getX()))) - getRootWindowInsets().getSystemWindowInsetLeft();
                    float alpha = (ttVar.getAlpha() * ttVar.getMeasuredHeight()) + org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + (!n12Var.a2 ? hl.m : 0);
                    mb1 mb1Var = n12Var.B4;
                    if (mb1Var != null && mb1Var.g()) {
                        alpha = Math.max(alpha, (n12Var.B4.e() + n12Var.B4.getY()) - n12Var.i4);
                    }
                    float f = y < alpha ? alpha - y : 0.0f;
                    if (f != this.a0) {
                        this.a0 = f;
                        r52 r52Var3 = this.Q;
                        if (r52Var3 != null) {
                            r52Var3.invalidateOutline();
                            this.Q.invalidate();
                        }
                    }
                    float translationY = (int) (n02Var.getTranslationY() + (n12Var.b.getMeasuredHeight() - n02Var.getMeasuredHeight()));
                    mb1 mb1Var2 = n12Var.B4;
                    if (mb1Var2 != null) {
                        translationY -= mb1Var2.d() - hl.L(6.0f);
                    }
                    if (childAt.getMeasuredHeight() + y > translationY) {
                        this.b0 = Math.min(-hl.L(5.0f), y - translationY) + childAt.getMeasuredHeight();
                    } else {
                        this.b0 = 0.0f;
                    }
                    fArr[0] = x;
                    fArr[1] = y2;
                    R();
                    return;
                }
            }
            if (this.a0 != 0.0f) {
                this.a0 = 0.0f;
                r52 r52Var4 = this.Q;
                if (r52Var4 != null) {
                    r52Var4.invalidateOutline();
                    this.Q.invalidate();
                }
            }
            fArr[0] = hl.L(-400.0f);
            fArr[1] = 0.0f;
            R();
        }
    }

    public final boolean W(boolean z) {
        if (getStarsPrice() <= 0) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            HashMap hashMap = t1;
            if (hashMap.size() <= 10 - (z ? 1 : 0)) {
                break;
            }
            ArrayList arrayList = u1;
            if (!arrayList.isEmpty()) {
                Object obj = hashMap.get(arrayList.get(0));
                if (!(obj instanceof no6)) {
                    break;
                }
                Q((no6) obj, -1);
                z2 = true;
            } else {
                break;
            }
        }
        return z2;
    }

    public final boolean X(no6 no6Var) {
        boolean z = this.x0;
        vnb vnbVar = this.a;
        n12 n12Var = this.b;
        if (z || !no6Var.b) {
            if (this.y0 || no6Var.b) {
                return false;
            }
            if (!n12Var.G0()) {
                xnb.x(null, 2131749313, new d31(n12Var.o3, vnbVar), null);
                return true;
            }
        } else if (!n12Var.G0()) {
            xnb.x(null, 2131749309, new d31(n12Var.o3, vnbVar), null);
            return true;
        }
        return true;
    }

    public final void Y() {
        if (this.Q0) {
            boolean f0 = f0();
            this.Q0 = f0;
            if (!f0) {
                g0();
            }
            this.H.f();
            this.w.f();
        }
    }

    public final void Z() {
        String M0 = ob6.M0(2131751119, null);
        b8 b8Var = this.Z0;
        b8Var.setText(M0);
        b8Var.setAnimatedIcon(R.raw.photo_spoiler);
        this.b.X2.S(1);
        HashMap hashMap = t1;
        if (!hashMap.isEmpty()) {
            Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                ((no6) ((Map.Entry) it.next()).getValue()).e();
            }
            hashMap.clear();
            u1.clear();
        }
        ArrayList arrayList = s1;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                no6 no6Var = (no6) arrayList.get(i);
                new File(no6Var.I).delete();
                if (no6Var.h != null) {
                    new File(no6Var.h).delete();
                }
                if (no6Var.c != null) {
                    new File(no6Var.c).delete();
                }
            }
            arrayList.clear();
        }
        this.H.f();
        this.w.f();
    }

    @Override // f12
    public final void a(Editable editable) {
        Object obj;
        int i = 0;
        while (true) {
            ArrayList arrayList = u1;
            if (i >= arrayList.size()) {
                return;
            }
            if (i == 0) {
                Object obj2 = arrayList.get(i);
                HashMap hashMap = t1;
                Object obj3 = hashMap.get(obj2);
                if (obj3 instanceof no6) {
                    no6 clone = ((no6) obj3).clone();
                    CharSequence[] charSequenceArr = {editable};
                    clone.n = ls6.d0(yac.t0).Y(charSequenceArr, false, true);
                    clone.a = charSequenceArr[0];
                    obj = clone;
                } else {
                    boolean z = obj3 instanceof ro6;
                    obj = obj3;
                    if (z) {
                        ro6 clone2 = ((ro6) obj3).clone();
                        CharSequence[] charSequenceArr2 = {editable};
                        clone2.n = ls6.d0(yac.t0).Y(charSequenceArr2, false, true);
                        clone2.I = charSequenceArr2[0];
                        obj = clone2;
                    }
                }
                hashMap.put(obj2, obj);
            }
            i++;
        }
    }

    public final void a0(boolean z) {
        r52 r52Var;
        if (this.t0 || this.Q == null) {
            return;
        }
        int i = this.L0;
        int[] iArr = this.g0;
        iArr[1] = i;
        iArr[2] = hl.L(2.0f) + (i << 1);
        Runnable runnable = this.o0;
        if (runnable != null) {
            hl.r(runnable);
            this.o0 = null;
        }
        hl.i3(this.b, ((double) hl.B(aob.v0(aob.a7, this.a))) > 0.721d);
        TextView textView = this.q0;
        i52 i52Var = this.r;
        zc zcVar = this.k0;
        i52 i52Var2 = this.F;
        ImageView[] imageViewArr = this.T;
        r3d r3dVar = this.m0;
        if (z) {
            this.k1 = this.Q.getTranslationY();
            this.e0 = true;
            if (i52Var2 != null) {
                i52Var2.invalidate();
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this, "cameraOpenProgress", 0.0f));
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(zcVar, (Property<zc, Float>) property, 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(r3dVar, (Property<r3d, Float>) property, 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(i52Var, (Property<i52, Float>) property, 0.0f));
            int i2 = 0;
            while (true) {
                if (i2 >= 2) {
                    break;
                }
                if (imageViewArr[i2].getVisibility() == 0) {
                    arrayList.add(ObjectAnimator.ofFloat(imageViewArr[i2], (Property<ImageView, Float>) property, 0.0f));
                    break;
                }
                i2++;
            }
            this.g1.d();
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(220L);
            animatorSet.setInterpolator(k43.f);
            animatorSet.addListener(new h52(this, (byte) 3));
            animatorSet.start();
        } else {
            this.j1 = false;
            setAlertKeepScreenOn(false);
            setCameraOpenProgress(0.0f);
            iArr[0] = 0;
            setCameraOpenProgress(0.0f);
            zcVar.setAlpha(0.0f);
            zcVar.setVisibility(8);
            r3dVar.setAlpha(0.0f);
            r3dVar.setTag(null);
            r3dVar.setVisibility(8);
            i52Var.setAlpha(0.0f);
            textView.setAlpha(0.0f);
            i52Var.setVisibility(8);
            int i3 = 0;
            while (true) {
                if (i3 >= 2) {
                    break;
                }
                if (imageViewArr[i3].getVisibility() == 0) {
                    imageViewArr[i3].setAlpha(0.0f);
                    break;
                }
                i3++;
            }
            this.c0 = false;
            r52 r52Var2 = this.Q;
            if (r52Var2 != null) {
                r52Var2.setFpsLimit(30);
                this.Q.setSystemUiVisibility(1024);
            }
            if (i52Var2 != null) {
                i52Var2.invalidate();
            }
        }
        r52 r52Var3 = this.Q;
        if (r52Var3 != null) {
            r52Var3.setImportantForAccessibility(0);
        }
        i52Var2.setImportantForAccessibility(0);
        if (i86.e(360928) || (r52Var = this.Q) == null) {
            return;
        }
        r52Var.showTexture(false, z);
    }

    @Override // f12
    public final boolean b() {
        return !this.c0;
    }

    public final d88 b0(int i) {
        i52 i52Var = this.F;
        int childCount = i52Var.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = i52Var.getChildAt(i2);
            if (childAt.getTop() < i52Var.getMeasuredHeight() - this.b.U0() && (childAt instanceof d88)) {
                d88 d88Var = (d88) childAt;
                if (d88Var.getImageView().getTag() != null && ((Integer) d88Var.getImageView().getTag()).intValue() == i) {
                    return d88Var;
                }
            }
        }
        return null;
    }

    @Override // f12
    public final boolean c() {
        Iterator it = t1.entrySet().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof no6) {
                if (((no6) value).x != 0) {
                    return false;
                }
            } else if ((value instanceof ro6) && ((ro6) value).x != 0) {
                return false;
            }
        }
        return true;
    }

    public final no6 c0(int i) {
        if (i < 0) {
            return null;
        }
        ArrayList arrayList = s1;
        int size = arrayList.size();
        if (i < size) {
            return (no6) arrayList.get(i);
        }
        int i2 = i - size;
        do6 do6Var = this.U0;
        if (do6Var == null || i2 >= do6Var.e.size()) {
            return null;
        }
        return (no6) this.U0.e.get(i2);
    }

    @Override // f12
    public final void d() {
        boolean z = this.f1;
        int i = z ? aob.Yg : aob.j5;
        int i2 = aob.c7;
        vnb vnbVar = this.a;
        this.I.setTextColor(aob.v0(i2, vnbVar));
        int i3 = aob.A5;
        i52 i52Var = this.F;
        yob.H(i52Var, i3, vnbVar);
        i52Var.L(0);
        yob.X(this.y, i, vnbVar);
        int v0 = aob.v0(z ? aob.Yg : aob.E8, vnbVar);
        m52 m52Var = this.x;
        m52Var.O(v0, false);
        m52Var.O(aob.v0(z ? aob.Yg : aob.E8, vnbVar), true);
        m52Var.I(aob.v0(z ? aob.ah : aob.G8, vnbVar));
        aob.A1(aob.v0(i, vnbVar), this.E);
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        do6 do6Var;
        n12 n12Var;
        if (i != jn7.r2) {
            if (i == jn7.o4) {
                U(false);
                return;
            }
            return;
        }
        u52 u52Var = this.H;
        if (u52Var != null) {
            if (s0()) {
                do6Var = MediaController.a2;
                this.V0 = do6Var;
            } else {
                do6Var = MediaController.b2;
                this.V0 = do6Var;
            }
            if (this.U0 == null || ((n12Var = this.b) != null && n12Var.A1)) {
                this.U0 = do6Var;
            } else if (s0()) {
                int i3 = 0;
                while (true) {
                    if (i3 >= MediaController.c2.size()) {
                        break;
                    }
                    do6 do6Var2 = (do6) MediaController.c2.get(i3);
                    int i4 = do6Var2.a;
                    do6 do6Var3 = this.U0;
                    if (i4 == do6Var3.a && do6Var2.b == do6Var3.b) {
                        this.U0 = do6Var2;
                        break;
                    }
                    i3++;
                }
            }
            this.Y0 = false;
            this.I.c();
            u52Var.f();
            this.w.f();
            ArrayList arrayList = u1;
            if (!arrayList.isEmpty() && this.V0 != null) {
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    Integer num = (Integer) arrayList.get(i5);
                    HashMap hashMap = t1;
                    Object obj = hashMap.get(num);
                    no6 no6Var = (no6) this.V0.f.get(num.intValue());
                    if (no6Var != null) {
                        if (obj instanceof no6) {
                            no6Var.g((no6) obj);
                        }
                        hashMap.put(num, no6Var);
                    }
                }
            }
            x0();
        }
    }

    public final void e0(boolean z) {
        if (!this.O0 || this.Q == null) {
            return;
        }
        p0();
        this.R.i();
        this.Q.destroy(z, null);
        AnimatorSet animatorSet = this.P;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.P = null;
        }
        hl.d3(new z42(this, (byte) 0), 300L);
        this.d0 = false;
    }

    public final boolean f0() {
        Activity W = hl.W(getContext());
        if (W == null) {
            W = this.b.Z1.getParentActivity();
        }
        if (W != null) {
            return Build.VERSION.SDK_INT >= 33 ? (W.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0 && W.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0) ? false : true : W.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0;
        }
        return true;
    }

    public final void g0() {
        if ((s0() ? MediaController.a2 : MediaController.b2) == null) {
            MediaController.R(0);
        }
    }

    public ArrayList<Object> getAllPhotosArray() {
        do6 do6Var = this.U0;
        ArrayList<Object> arrayList = s1;
        if (do6Var == null) {
            return !arrayList.isEmpty() ? arrayList : new ArrayList<>(0);
        }
        if (arrayList.isEmpty()) {
            return this.U0.e;
        }
        ArrayList<Object> arrayList2 = new ArrayList<>(arrayList.size() + this.U0.e.size());
        arrayList2.addAll(arrayList);
        arrayList2.addAll(this.U0.e);
        return arrayList2;
    }

    @Override // f12
    public int getButtonsHideOffset() {
        return org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + super.getButtonsHideOffset();
    }

    public float getCameraOpenProgress() {
        return this.f0;
    }

    @Override // f12
    public int getCurrentItemTop() {
        i52 i52Var = this.F;
        int childCount = i52Var.getChildCount();
        b34 b34Var = this.I;
        if (childCount <= 0) {
            i52Var.setTopGlowOffset(i52Var.getPaddingTop());
            b34Var.setTranslationY(0.0f);
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = i52Var.getChildAt(0);
        n69 n69Var = (n69) i52Var.H(childAt);
        int top = childAt.getTop() - this.q1;
        int L = hl.L(7.0f);
        if (top < hl.L(7.0f) || n69Var == null || n69Var.b() != 0) {
            top = L;
        }
        b34Var.setTranslationY(((((getMeasuredHeight() - top) - hl.L(50.0f)) - b34Var.getMeasuredHeight()) / 2.0f) + top);
        i52Var.setTopGlowOffset(top);
        return top;
    }

    @Override // f12
    public int getFirstOffset() {
        return hl.L(56.0f) + getListTopPadding();
    }

    @Override // f12
    public int getListTopPadding() {
        return this.F.getPaddingTop();
    }

    @Override // f12
    public int getSelectedItemsCount() {
        return u1.size();
    }

    public HashMap<Object, Object> getSelectedPhotos() {
        return t1;
    }

    public int getSelectedPhotosCount() {
        int i = 0;
        for (Object obj : t1.values()) {
            if (obj instanceof no6) {
                no6 no6Var = (no6) obj;
                if (!no6Var.b && no6Var.s == null) {
                    i++;
                }
            }
        }
        return i;
    }

    public int getSelectedPhotosHighQualityCount() {
        int i = 0;
        for (Object obj : t1.values()) {
            if (obj instanceof no6) {
                no6 no6Var = (no6) obj;
                if (no6Var.c() && !no6Var.b && no6Var.s == null) {
                    i++;
                }
            }
        }
        return i;
    }

    public ArrayList<Object> getSelectedPhotosOrder() {
        return u1;
    }

    public long getStarsPrice() {
        Iterator it = t1.entrySet().iterator();
        if (it.hasNext()) {
            return ((no6) ((Map.Entry) it.next()).getValue()).N;
        }
        return 0L;
    }

    public final int h0() {
        n12 n12Var = this.b;
        org.telegram.ui.ActionBar.e eVar = n12Var.Z1;
        return ((eVar instanceof zu1) && ((zu1) eVar).g4 == 5) ? eVar.getMessagesController().l4.q0.f() - ((zu1) n12Var.Z1).M6.size() : ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:22|(1:24)|(1:29)|(6:31|(5:33|(1:35)|36|(1:38)|(1:40))|98|42|(1:97)|46)(1:99)|(1:96)(1:51)|52|53|54|55|(4:57|58|(2:60|61)|63)|64|65|66|67|68|69) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cc, code lost:
    
        if (bp1.t(r13) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x015d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x015e, code lost:
    
        cc4.g(r0, true);
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x0127 -> B:62:0x012b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i0(int i, Intent intent, String str) {
        String str2;
        String str3;
        Throwable th;
        MediaMetadataRetriever mediaMetadataRetriever;
        int i2;
        int i3;
        n12 n12Var = this.b;
        boolean z = n12Var.P1;
        org.telegram.ui.ActionBar.e eVar = n12Var.Z1;
        if (z) {
            return;
        }
        r1 = true;
        MediaMetadataRetriever mediaMetadataRetriever2 = null;
        if (i == 0) {
            PhotoViewer.q0().T1(eVar.getParentActivity(), null, this.a);
            PhotoViewer q0 = PhotoViewer.q0();
            int i4 = n12Var.P3;
            boolean z2 = n12Var.Q3;
            q0.h = i4;
            q0.n = z2;
            Pair N0 = hl.N0(str);
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(new File(str).getAbsolutePath(), options);
                i2 = options.outWidth;
                try {
                    i3 = options.outHeight;
                } catch (Exception unused) {
                    i3 = 0;
                    int i5 = i2;
                    int i6 = v1;
                    v1 = i6 - 1;
                    no6 no6Var = new no6(i6, str, ((Integer) N0.first).intValue(), false, i5, i3);
                    no6Var.n(N0);
                    no6Var.L = true;
                    l0(no6Var, false, true);
                    return;
                }
            } catch (Exception unused2) {
                i2 = 0;
            }
            int i52 = i2;
            int i62 = v1;
            v1 = i62 - 1;
            no6 no6Var2 = new no6(i62, str, ((Integer) N0.first).intValue(), false, i52, i3);
            no6Var2.n(N0);
            no6Var2.L = true;
            l0(no6Var2, false, true);
            return;
        }
        if (i == 2) {
            if (f11.a) {
                cc4.b("pic path " + str);
            }
            if (intent != null && str != null && bp1.t(str)) {
                intent = null;
            }
            if (intent != null) {
                Uri data = intent.getData();
                if (data != null) {
                    if (f11.a) {
                        cc4.b("video record uri " + data.toString());
                    }
                    str2 = hl.S0(data);
                    if (f11.a) {
                        cc4.b("resolved path = " + str2);
                    }
                    if (str2 != null) {
                    }
                }
                str2 = str;
                if (!(eVar instanceof zu1) || !((zu1) eVar).y()) {
                    hl.e(str);
                }
                str3 = null;
            } else {
                str2 = null;
                str3 = str;
            }
            String str4 = (str2 == null && str3 != null && bp1.t(str3)) ? str3 : str2;
            try {
                try {
                    try {
                        mediaMetadataRetriever = new MediaMetadataRetriever();
                    } catch (Exception e) {
                        e = e;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e2) {
                cc4.g(e2, true);
            }
            try {
                mediaMetadataRetriever.setDataSource(str4);
                r13 = mediaMetadataRetriever.extractMetadata(9) != null ? (int) Math.ceil(Long.parseLong(r0) / 1000.0f) : 0L;
                mediaMetadataRetriever.release();
            } catch (Exception e3) {
                e = e3;
                mediaMetadataRetriever2 = mediaMetadataRetriever;
                cc4.g(e, true);
                if (mediaMetadataRetriever2 != null) {
                    mediaMetadataRetriever2.release();
                }
                Bitmap q = r7a.q(1, str4);
                File file = new File(xb4.z(4), "-2147483648_" + xea.p() + ".jpg");
                q.compress(Bitmap.CompressFormat.JPEG, 55, new FileOutputStream(file));
                xea.x();
                int i7 = v1;
                v1 = i7 - 1;
                no6 no6Var3 = new no6(i7, str4, 0, true, q.getWidth(), q.getHeight());
                no6Var3.E = (int) r13;
                no6Var3.c = file.getAbsolutePath();
                l0(no6Var3, false, true);
            } catch (Throwable th3) {
                th = th3;
                mediaMetadataRetriever2 = mediaMetadataRetriever;
                if (mediaMetadataRetriever2 == null) {
                    throw th;
                }
                try {
                    mediaMetadataRetriever2.release();
                    throw th;
                } catch (Exception e4) {
                    cc4.g(e4, true);
                    throw th;
                }
            }
            Bitmap q2 = r7a.q(1, str4);
            File file2 = new File(xb4.z(4), "-2147483648_" + xea.p() + ".jpg");
            q2.compress(Bitmap.CompressFormat.JPEG, 55, new FileOutputStream(file2));
            xea.x();
            int i72 = v1;
            v1 = i72 - 1;
            no6 no6Var32 = new no6(i72, str4, 0, true, q2.getWidth(), q2.getHeight());
            no6Var32.E = (int) r13;
            no6Var32.c = file2.getAbsolutePath();
            l0(no6Var32, false, true);
        }
    }

    @Override // f12
    public final int j() {
        return 1;
    }

    public final void j0(boolean z) {
        r52 r52Var;
        r52 r52Var2 = this.Q;
        if (r52Var2 == null || this.P != null) {
            return;
        }
        n12 n12Var = this.b;
        if (n12Var.J) {
            return;
        }
        r52Var2.initTexture();
        boolean s0 = s0();
        int i = 0;
        TextView textView = this.r0;
        if (s0) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        boolean isEmpty = s1.isEmpty();
        TextView textView2 = this.q0;
        i52 i52Var = this.r;
        if (isEmpty) {
            textView2.setVisibility(4);
            i52Var.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            i52Var.setVisibility(0);
        }
        if (n12Var.V0().w && isFocusable()) {
            n12Var.V0().d();
        }
        r3d r3dVar = this.m0;
        r3dVar.setVisibility(0);
        r3dVar.setAlpha(0.0f);
        zc zcVar = this.k0;
        zcVar.setVisibility(0);
        zcVar.setTag(null);
        int[] iArr = this.g0;
        iArr[0] = 0;
        int i2 = this.L0;
        iArr[1] = i2;
        int L = hl.L(2.0f) + (i2 << 1);
        byte b = 2;
        iArr[2] = L;
        this.k1 = 0.0f;
        this.j1 = true;
        r52 r52Var3 = this.Q;
        if (r52Var3 != null) {
            r52Var3.setFpsLimit(-1);
        }
        hl.t1(this);
        hl.i3(n12Var, false);
        setAlertKeepScreenOn(true);
        i52 i52Var2 = this.F;
        ImageView[] imageViewArr = this.T;
        if (z) {
            setCameraOpenProgress(0.0f);
            this.e0 = true;
            if (i52Var2 != null) {
                i52Var2.invalidate();
            }
            this.g1.d();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this, "cameraOpenProgress", 0.0f, 1.0f));
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(zcVar, (Property<zc, Float>) property, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(i52Var, (Property<i52, Float>) property, 1.0f));
            int i3 = 0;
            while (true) {
                if (i3 >= 2) {
                    break;
                }
                if (imageViewArr[i3].getVisibility() == 0) {
                    arrayList.add(ObjectAnimator.ofFloat(imageViewArr[i3], (Property<ImageView, Float>) property, 1.0f));
                    break;
                }
                i3++;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(350L);
            animatorSet.setInterpolator(k43.f);
            animatorSet.addListener(new h52(this, b));
            animatorSet.start();
        } else {
            setCameraOpenProgress(1.0f);
            zcVar.setAlpha(1.0f);
            textView2.setAlpha(1.0f);
            i52Var.setAlpha(1.0f);
            while (true) {
                if (i >= 2) {
                    break;
                }
                if (imageViewArr[i].getVisibility() == 0) {
                    imageViewArr[i].setAlpha(1.0f);
                    break;
                }
                i++;
            }
            n12Var.W3.V();
            r52 r52Var4 = this.Q;
            if (r52Var4 != null) {
                r52Var4.setSystemUiVisibility(1028);
            }
        }
        this.c0 = true;
        r52 r52Var5 = this.Q;
        if (r52Var5 != null) {
            r52Var5.setImportantForAccessibility(2);
        }
        i52Var2.setImportantForAccessibility(4);
        i52Var2.invalidate();
        if (i86.e(360928) || (r52Var = this.Q) == null || !r52Var.isInited()) {
            return;
        }
        this.Q.showTexture(true, z);
    }

    public final void k0() {
        if (xea.v0) {
            j0(true);
            return;
        }
        n12 n12Var = this.b;
        l12 l12Var = n12Var.W3;
        if (l12Var != null) {
            l12Var.z0(0, false, true, 0, 0, 0L, n12Var.b1(), false, 0L);
        }
    }

    @Override // f12
    public final void l() {
        V();
        invalidate();
    }

    public final void l0(no6 no6Var, boolean z, boolean z2) {
        int i;
        zu1 zu1Var;
        zu1 zu1Var2;
        ArrayList<Object> arrayList;
        int i2;
        ArrayList arrayList2 = s1;
        n12 n12Var = this.b;
        if (no6Var != null) {
            int i3 = no6Var.C;
            arrayList2.add(no6Var);
            t1.put(Integer.valueOf(i3), no6Var);
            u1.add(Integer.valueOf(i3));
            n12Var.G1(0);
            this.H.f();
            this.w.f();
            if (!z2 && arrayList2.size() > 1) {
                B0(false);
                if (this.Q != null) {
                    this.m0.b(false, 0.0f);
                    this.C0 = 0.0f;
                    this.Q.setZoom(0.0f);
                    CameraController.getInstance().startPreview(this.Q.getCameraSessionObject());
                    return;
                }
                return;
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        this.u0 = true;
        org.telegram.ui.ActionBar.e eVar = n12Var.Z1;
        org.telegram.ui.ActionBar.e eVar2 = n12Var.Z1;
        if (eVar == null) {
            eVar = LaunchActivity.Q();
        }
        if (eVar != null) {
            PhotoViewer.q0().T1(eVar.getParentActivity(), null, this.a);
            PhotoViewer.q0().U1(n12Var);
            PhotoViewer q0 = PhotoViewer.q0();
            int i4 = n12Var.P3;
            boolean z3 = n12Var.Q3;
            q0.h = i4;
            q0.n = z3;
            if (n12Var.z1 && n12Var.A1) {
                zu1Var = (zu1) eVar2;
                i = 11;
            } else {
                if (n12Var.N2 != 0) {
                    i = 1;
                } else if (eVar2 instanceof zu1) {
                    zu1Var = (zu1) eVar2;
                    i = 2;
                } else {
                    i = 5;
                }
                zu1Var = null;
            }
            boolean z4 = n12Var.B1;
            if (z4) {
                i = 13;
                zu1Var2 = null;
            } else {
                zu1Var2 = zu1Var;
            }
            int i5 = i;
            if (n12Var.N2 != 0 || z4) {
                arrayList = new ArrayList<>();
                arrayList.add(no6Var);
                i2 = 0;
            } else {
                arrayList = getAllPhotosArray();
                i2 = arrayList2.size() - 1;
            }
            ArrayList<Object> arrayList3 = arrayList;
            xn5 xn5Var = n12Var.K1;
            if (xn5Var != null && no6Var != null) {
                xn5Var.e = no6Var.b;
            }
            PhotoViewer.q0().o1(arrayList3, i2, i5, false, new j52(this, z), zu1Var2);
            PhotoViewer.q0().G1(n12Var.K1);
            if (n12Var.A1) {
                PhotoViewer.q0().U(null, null, false, n12Var.D1);
                PhotoViewer.q0().u1();
            }
        }
    }

    @Override // f12
    public final void m(float f) {
        this.X0 = f;
        V();
        r52 r52Var = this.Q;
        if (r52Var != null) {
            r52Var.invalidateOutline();
            this.Q.invalidate();
        }
        invalidate();
    }

    public final void m0() {
        try {
            if (this.Q != null) {
                CameraController.getInstance().stopPreview(this.Q.getCameraSessionObject());
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final void n0() {
        if (this.b.P1) {
            return;
        }
        for (int i = 0; i < 2; i++) {
            this.T[i].animate().alpha(1.0f).translationX(0.0f).setDuration(150L).setInterpolator(k43.f).start();
        }
        ViewPropertyAnimator duration = this.s0.animate().alpha(1.0f).translationX(0.0f).setDuration(150L);
        k43 k43Var = k43.f;
        duration.setInterpolator(k43Var).start();
        this.r0.animate().alpha(1.0f).setDuration(150L).setInterpolator(k43Var).start();
        hl.R3(this.S, false);
        hl.r(this.i0);
        this.i0 = null;
        hl.K3(hl.W(getContext()));
    }

    @Override // f12
    public final boolean o(MotionEvent motionEvent) {
        r52 r52Var;
        if (!this.e0) {
            if (this.c0 && motionEvent != null) {
                boolean z = this.H0;
                r3d r3dVar = this.m0;
                if ((!z && motionEvent.getActionMasked() == 0) || motionEvent.getActionMasked() == 5) {
                    Rect rect = this.F0;
                    r3dVar.getHitRect(rect);
                    if (r3dVar.getTag() == null || !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        if (!this.t0 && !this.J0) {
                            if (motionEvent.getPointerCount() == 2) {
                                this.B0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                this.D0 = true;
                            } else {
                                this.I0 = true;
                                this.G0 = motionEvent.getY();
                                this.D0 = false;
                            }
                            this.E0 = false;
                            this.H0 = true;
                            return true;
                        }
                    }
                } else if (this.H0) {
                    int actionMasked = motionEvent.getActionMasked();
                    i52 i52Var = this.r;
                    TextView textView = this.q0;
                    Property property = View.ALPHA;
                    ImageView[] imageViewArr = this.T;
                    zc zcVar = this.k0;
                    float f = 1.0f;
                    if (actionMasked == 2) {
                        if (this.D0 && motionEvent.getPointerCount() == 2 && !this.J0) {
                            float hypot = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                            if (this.E0) {
                                if (this.Q != null) {
                                    float L = (hypot - this.B0) / hl.L(100.0f);
                                    this.B0 = hypot;
                                    float f2 = this.C0 + L;
                                    this.C0 = f2;
                                    if (f2 < 0.0f) {
                                        this.C0 = 0.0f;
                                        f = 0.0f;
                                    } else if (f2 > 1.0f) {
                                        this.C0 = 1.0f;
                                    } else {
                                        f = f2;
                                    }
                                    r3dVar.b(false, f);
                                    this.b.b.invalidate();
                                    this.Q.setZoom(this.C0);
                                    w0(true);
                                    return true;
                                }
                            } else if (Math.abs(hypot - this.B0) >= hl.Z0(false, 0.4f)) {
                                this.B0 = hypot;
                                this.E0 = true;
                                return true;
                            }
                        } else {
                            float y = motionEvent.getY();
                            float f3 = y - this.G0;
                            if (this.I0) {
                                if (Math.abs(f3) > hl.Z0(false, 0.4f)) {
                                    this.I0 = false;
                                    this.J0 = true;
                                    return true;
                                }
                            } else if (this.J0 && (r52Var = this.Q) != null) {
                                r52Var.setTranslationY(r52Var.getTranslationY() + f3);
                                this.G0 = y;
                                r3dVar.setTag(null);
                                Runnable runnable = this.o0;
                                if (runnable != null) {
                                    hl.r(runnable);
                                    this.o0 = null;
                                }
                                if (zcVar.getTag() == null) {
                                    zcVar.setTag(1);
                                    AnimatorSet animatorSet = new AnimatorSet();
                                    animatorSet.playTogether(ObjectAnimator.ofFloat(zcVar, (Property<zc, Float>) property, 0.0f), ObjectAnimator.ofFloat(r3dVar, (Property<r3d, Float>) property, 0.0f), ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f), ObjectAnimator.ofFloat(imageViewArr[0], (Property<ImageView, Float>) property, 0.0f), ObjectAnimator.ofFloat(imageViewArr[1], (Property<ImageView, Float>) property, 0.0f), ObjectAnimator.ofFloat(i52Var, (Property<i52, Float>) property, 0.0f));
                                    animatorSet.setDuration(220L);
                                    animatorSet.setInterpolator(k43.f);
                                    animatorSet.start();
                                    return true;
                                }
                            }
                        }
                    } else if (motionEvent.getActionMasked() == 3 || motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 6) {
                        this.H0 = false;
                        this.D0 = false;
                        if (this.J0) {
                            this.J0 = false;
                            r52 r52Var2 = this.Q;
                            if (r52Var2 != null) {
                                if (Math.abs(r52Var2.getTranslationY()) > this.Q.getMeasuredHeight() / 6.0f) {
                                    a0(true);
                                    return true;
                                }
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.Q, (Property<r52, Float>) View.TRANSLATION_Y, 0.0f), ObjectAnimator.ofFloat(zcVar, (Property<zc, Float>) property, 1.0f), ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 1.0f), ObjectAnimator.ofFloat(imageViewArr[0], (Property<ImageView, Float>) property, 1.0f), ObjectAnimator.ofFloat(imageViewArr[1], (Property<ImageView, Float>) property, 1.0f), ObjectAnimator.ofFloat(i52Var, (Property<i52, Float>) property, 1.0f));
                                animatorSet2.setDuration(250L);
                                animatorSet2.setInterpolator(this.j0);
                                animatorSet2.start();
                                zcVar.setTag(null);
                                return true;
                            }
                        } else {
                            r52 r52Var3 = this.Q;
                            if (r52Var3 != null && !this.E0) {
                                r52Var3.getLocationOnScreen(this.W);
                                this.Q.focusToPoint((int) (motionEvent.getRawX() - r5[0]), (int) (motionEvent.getRawY() - r5[1]));
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void o0() {
        try {
            U(false);
            if (this.Q != null) {
                CameraController.getInstance().startPreview(this.Q.getCameraSessionObject());
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        if (this.T0 != i5) {
            this.T0 = i5;
            u52 u52Var = this.H;
            if (u52Var != null) {
                u52Var.f();
            }
        }
        super.onLayout(z, i, i2, i3, i4);
        V();
    }

    @Override // f12
    public final void p() {
        jn7.e().n(this, jn7.o4);
        jn7.e().n(this, jn7.r2);
    }

    public final void p0() {
        if (this.d0) {
            try {
                Bitmap bitmap = this.Q.getTextureView().getBitmap();
                if (bitmap != null) {
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), this.Q.getMatrix(), true);
                    bitmap.recycle();
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 80, (int) (createBitmap.getHeight() / (createBitmap.getWidth() / 80.0f)), true);
                    if (createScaledBitmap != null) {
                        if (createScaledBitmap != createBitmap) {
                            createBitmap.recycle();
                        }
                        Utilities.blurBitmap(createScaledBitmap, 7);
                        FileOutputStream fileOutputStream = new FileOutputStream(new File(org.telegram.messenger.a.h(), "cthumb.jpg"));
                        createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                        createScaledBitmap.recycle();
                        fileOutputStream.close();
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // f12
    public final boolean q() {
        if (this.e0) {
            return true;
        }
        if (this.c0) {
            a0(true);
            return true;
        }
        e0(true);
        return false;
    }

    @Override // f12
    public final void r(int i) {
        e0((i == 0 || i == 2) ? false : true);
    }

    public final void r0(int i, final boolean z) {
        PhotoViewer q0 = PhotoViewer.q0();
        if (i == -1) {
            i = q0.O4;
        }
        ArrayList arrayList = q0.f7;
        if (arrayList == null || arrayList.isEmpty() || i >= arrayList.size() || !(arrayList.get(i) instanceof no6) || !((no6) arrayList.get(i)).M) {
            return;
        }
        final no6 no6Var = (no6) arrayList.get(i);
        this.F.N(new pt2() { // from class: b52
            @Override // pt2
            public final void accept(Object obj) {
                View view = (View) obj;
                boolean z2 = ChatAttachAlertPhotoLayout.r1;
                if (view instanceof d88) {
                    d88 d88Var = (d88) view;
                    if (d88Var.getPhotoEntry() == no6Var) {
                        d88Var.c(z, Float.valueOf(250.0f));
                        d88Var.f(ChatAttachAlertPhotoLayout.this.getStarsPrice(), ChatAttachAlertPhotoLayout.t1.size() > 1);
                    }
                }
            }
        });
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.S0) {
            return;
        }
        super.requestLayout();
    }

    public final boolean s0() {
        if (this.z0) {
            return true;
        }
        n12 n12Var = this.b;
        if (n12Var.z1) {
            return false;
        }
        return (n12Var.Z1 instanceof zu1) || n12Var.Q2 || n12Var.N2 == 2;
    }

    public void setCameraOpenProgress(float f) {
        int i;
        int i2;
        if (this.Q == null) {
            return;
        }
        this.f0 = f;
        int[] iArr = this.g0;
        float f2 = iArr[1];
        float f3 = iArr[2];
        int i3 = hl.q.x;
        n12 n12Var = this.b;
        float width = n12Var.c.getWidth();
        float height = n12Var.c.getHeight();
        float[] fArr = this.V;
        float f4 = fArr[0];
        float f5 = fArr[1];
        float f6 = this.k1;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.Q.getLayoutParams();
        float textureHeight = this.Q.getTextureHeight(f2, f3) / this.Q.getTextureHeight(width, height);
        float f7 = f3 / height;
        float f8 = f2 / width;
        boolean z = this.j1;
        r52 r52Var = this.Q;
        if (z) {
            i = (int) width;
            i2 = (int) height;
            float f9 = 1.0f - f;
            float f10 = (textureHeight * f9) + f;
            r52Var.getTextureView().setScaleX(f10);
            this.Q.getTextureView().setScaleY(f10);
            float f11 = f4 * f9;
            this.Q.setTranslationX(((0.0f * f) + f11) - (((1.0f - ((f8 * f9) + f)) * width) / 2.0f));
            float f12 = f5 * f9;
            this.Q.setTranslationY(((f6 * f) + f12) - (((1.0f - ((f7 * f9) + f)) * height) / 2.0f));
            this.l1 = f12 - this.Q.getTranslationY();
            this.m1 = (height * f) + (((f5 + f3) * f9) - this.Q.getTranslationY());
            this.o1 = f11 - this.Q.getTranslationX();
            this.n1 = (width * f) + (((f4 + f2) * f9) - this.Q.getTranslationX());
        } else {
            i = (int) f2;
            i2 = (int) f3;
            r52Var.getTextureView().setScaleX(1.0f);
            this.Q.getTextureView().setScaleY(1.0f);
            this.l1 = 0.0f;
            this.m1 = height;
            this.o1 = 0.0f;
            this.n1 = width;
            this.Q.setTranslationX(f4);
            this.Q.setTranslationY(f5);
        }
        if (layoutParams.width != i || layoutParams.height != i2) {
            layoutParams.width = i;
            layoutParams.height = i2;
            this.Q.requestLayout();
        }
        this.Q.invalidateOutline();
        this.Q.invalidate();
    }

    public void setCheckCameraWhenShown(boolean z) {
        this.v0 = z;
    }

    public void setIncludeVideosInGallery(boolean z) {
        this.z0 = z;
    }

    public void setStarsPrice(long j) {
        HashMap hashMap = t1;
        if (!hashMap.isEmpty()) {
            Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                no6 no6Var = (no6) ((Map.Entry) it.next()).getValue();
                no6Var.N = j;
                no6Var.M = j > 0;
                no6Var.R = false;
            }
        }
        E(getSelectedItemsCount());
        if (W(false)) {
            A0();
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        n12 n12Var = this.b;
        if (n12Var.B0 == 1) {
            float f2 = (f / 40.0f) * (-0.1f);
            i52 i52Var = this.F;
            int childCount = i52Var.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = i52Var.getChildAt(i);
                if (childAt instanceof d88) {
                    d88 d88Var = (d88) childAt;
                    float f3 = 1.0f + f2;
                    d88Var.getCheckBox().setScaleX(f3);
                    d88Var.getCheckBox().setScaleY(f3);
                }
            }
        }
        super.setTranslationY(f);
        n12Var.b.invalidate();
        invalidate();
    }

    public final void t0(qb0 qb0Var, TLRPC.VideoSize videoSize, long j) {
        n12 n12Var = this.b;
        ob0 ob0Var = new ob0(n12Var.O1, n12Var.K1);
        xn5 xn5Var = n12Var.K1;
        ob0Var.R = xn5Var == null || xn5Var.c != 2;
        n12Var.Z1.presentFragment(ob0Var);
        if (qb0Var != null) {
            ob0Var.p0(qb0Var);
        }
        if (videoSize != null) {
            ob0Var.q0(videoSize);
        }
        if (j != 0) {
            ob0Var.o0(j);
        }
        ob0Var.J = new h01((Object) this, (Object) ob0Var, (byte) 25);
    }

    @Override // f12
    public final void u() {
        r52 r52Var = this.Q;
        if (r52Var != null) {
            r52Var.setVisibility(8);
        }
        for (Map.Entry entry : t1.entrySet()) {
            if (entry.getValue() instanceof no6) {
                ((no6) entry.getValue()).getClass();
            }
        }
        this.H.f();
    }

    public final void u0() {
        n12 n12Var = this.b;
        if (!n12Var.c4 && this.w0 && CameraView.isCameraAllowed()) {
            if (this.Q == null) {
                boolean z = !i86.e(360928);
                Context context = getContext();
                Boolean bool = this.p0;
                r52 r52Var = new r52(this, context, bool != null ? bool.booleanValue() : n12Var.R3, z);
                this.Q = r52Var;
                org.telegram.ui.ActionBar.e eVar = n12Var.Z1;
                r52Var.setRecordFile(hl.s0((eVar instanceof zu1) && ((zu1) eVar).y()));
                this.Q.setFocusable(true);
                this.Q.setFpsLimit(30);
                this.Q.setOutlineProvider(new dl0(this, (byte) 4));
                this.Q.setClipToOutline(true);
                this.Q.setContentDescription(ob6.M0(2131754847, null));
                ex0 ex0Var = n12Var.c;
                r52 r52Var2 = this.Q;
                int i = this.L0;
                ex0Var.addView(r52Var2, 1, new FrameLayout.LayoutParams(i, i));
                this.Q.setDelegate(new k52(this));
                this.Q.setAlpha(this.w0 ? 1.0f : 0.2f);
                this.Q.setEnabled(this.w0);
                if (this.O) {
                    this.Q.setVisibility(8);
                }
                if (!this.c0) {
                    V();
                }
                i52 i52Var = this.F;
                if (i52Var != null) {
                    i52Var.invalidate();
                }
                invalidate();
            }
            r3d r3dVar = this.m0;
            if (r3dVar != null) {
                r3dVar.b(false, 0.0f);
                this.C0 = 0.0f;
            }
            if (this.c0) {
                return;
            }
            this.Q.setTranslationX(this.V[0]);
        }
    }

    @Override // f12
    public final void v() {
        byte b = 1;
        this.O = true;
        i52 i52Var = this.F;
        int childCount = i52Var.getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            if (i52Var.getChildAt(i) instanceof x78) {
                p0();
                break;
            } else {
                this.R.i();
                i++;
            }
        }
        ViewPropertyAnimator viewPropertyAnimator = this.p1;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator withEndAction = this.y.animate().alpha(0.0f).setDuration(150L).setInterpolator(k43.j).withEndAction(new z42(this, b));
        this.p1 = withEndAction;
        withEndAction.start();
        m0();
    }

    @Override // f12
    public final void w(float f) {
        r52 r52Var = this.Q;
        if (r52Var != null) {
            r52Var.setAlpha(f);
            if (f != 0.0f && this.Q.getVisibility() != 0) {
                this.Q.setVisibility(0);
            } else {
                if (f != 0.0f || this.Q.getVisibility() == 4) {
                    return;
                }
                this.Q.setVisibility(4);
            }
        }
    }

    public final void w0(boolean z) {
        r3d r3dVar = this.m0;
        if (r3dVar.getTag() != null && z) {
            Runnable runnable = this.o0;
            if (runnable != null) {
                hl.r(runnable);
            }
            z42 z42Var = new z42(this, (byte) 2);
            this.o0 = z42Var;
            hl.d3(z42Var, 2000L);
            return;
        }
        if (r3dVar.getTag() != null || z) {
            AnimatorSet animatorSet = this.n0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            byte b = 1;
            r3dVar.setTag(z ? 1 : null);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.n0 = animatorSet2;
            animatorSet2.setDuration(180L);
            this.n0.playTogether(ObjectAnimator.ofFloat(r3dVar, (Property<r3d, Float>) View.ALPHA, z ? 1.0f : 0.0f));
            this.n0.addListener(new h52(this, b));
            this.n0.start();
            if (z) {
                z42 z42Var2 = new z42(this, (byte) 3);
                this.o0 = z42Var2;
                hl.d3(z42Var2, 2000L);
            }
        }
    }

    @Override // f12
    public final void x(int i) {
        TLRPC.Chat T0;
        boolean z;
        boolean z2;
        char c = 1;
        char c2 = 1;
        char c3 = 1;
        char c4 = 1;
        n12 n12Var = this.b;
        if (i == 8) {
            n12Var.r1(!n12Var.W1, true);
            this.e1.a(!n12Var.W1, true);
            return;
        }
        if ((i == 0 || i == 1) && n12Var.P3 > 0 && u1.size() > 1 && (T0 = n12Var.T0()) != null && !xc2.N(T0) && T0.slowmode_enabled) {
            jj.L(getContext(), ob6.M0(2131745038, null), ob6.M0(2131745030, null), null, null, this.a).o();
            return;
        }
        vnb vnbVar = this.a;
        HashMap hashMap = t1;
        final byte b = 0;
        if (i == 0) {
            r47 r47Var = n12Var.E3;
            org.telegram.ui.ActionBar.e eVar = n12Var.Z1;
            if (r47Var == null && (eVar instanceof zu1) && ((zu1) eVar).X7()) {
                jj.J(getContext(), ((zu1) eVar).a(), new v42(this, b), vnbVar);
                return;
            } else {
                jj.X(n12Var.G3, n12Var.W0(), n12Var.S0() + hashMap.size(), new pcc(this) { // from class: w42
                    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

                    {
                        this.b = this;
                    }

                    @Override // pcc
                    public final void a(Object obj) {
                        byte b2 = b;
                        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                        Long l = (Long) obj;
                        switch (b2) {
                            case 0:
                                boolean z3 = ChatAttachAlertPhotoLayout.r1;
                                n12 n12Var2 = chatAttachAlertPhotoLayout.b;
                                n12Var2.F0();
                                n12Var2.W3.z0(7, false, true, 0, 0, 0L, n12Var2.b1(), false, l.longValue());
                                break;
                            default:
                                boolean z4 = ChatAttachAlertPhotoLayout.r1;
                                n12 n12Var3 = chatAttachAlertPhotoLayout.b;
                                n12Var3.F0();
                                n12Var3.W3.z0(4, true, true, 0, 0, 0L, n12Var3.b1(), false, l.longValue());
                                break;
                        }
                    }
                });
                return;
            }
        }
        if (i == 1) {
            r47 r47Var2 = n12Var.E3;
            org.telegram.ui.ActionBar.e eVar2 = n12Var.Z1;
            if (r47Var2 == null && (eVar2 instanceof zu1) && ((zu1) eVar2).X7()) {
                jj.J(getContext(), ((zu1) eVar2).a(), new v42(this, c4 == true ? 1 : 0), vnbVar);
                return;
            }
            int i2 = n12Var.G3;
            long W0 = n12Var.W0();
            int S0 = n12Var.S0() + hashMap.size();
            final char c5 = c3 == true ? 1 : 0;
            jj.X(i2, W0, S0, new pcc(this) { // from class: w42
                public final /* synthetic */ ChatAttachAlertPhotoLayout b;

                {
                    this.b = this;
                }

                @Override // pcc
                public final void a(Object obj) {
                    byte b2 = c5;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                    Long l = (Long) obj;
                    switch (b2) {
                        case 0:
                            boolean z3 = ChatAttachAlertPhotoLayout.r1;
                            n12 n12Var2 = chatAttachAlertPhotoLayout.b;
                            n12Var2.F0();
                            n12Var2.W3.z0(7, false, true, 0, 0, 0L, n12Var2.b1(), false, l.longValue());
                            break;
                        default:
                            boolean z4 = ChatAttachAlertPhotoLayout.r1;
                            n12 n12Var3 = chatAttachAlertPhotoLayout.b;
                            n12Var3.F0();
                            n12Var3.W3.z0(4, true, true, 0, 0, 0L, n12Var3.b1(), false, l.longValue());
                            break;
                    }
                }
            });
            return;
        }
        u52 u52Var = this.H;
        i52 i52Var = this.F;
        if (i == 3) {
            c62 c62Var = n12Var.k2;
            if (c62Var != null) {
                c62Var.O();
            }
            Iterator it = hashMap.entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((no6) ((Map.Entry) it.next()).getValue()).M) {
                        z2 = true;
                        break;
                    }
                } else {
                    z2 = false;
                    break;
                }
            }
            final boolean z3 = !z2;
            hl.d3(new Runnable(this) { // from class: x42
                public final /* synthetic */ ChatAttachAlertPhotoLayout b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b2 = b;
                    boolean z4 = z3;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                    switch (b2) {
                        case 0:
                            boolean z5 = ChatAttachAlertPhotoLayout.r1;
                            n12 n12Var2 = chatAttachAlertPhotoLayout.b;
                            b8 b8Var = chatAttachAlertPhotoLayout.Z0;
                            b8Var.setText(ob6.M0(z4 ? 2131751395 : 2131751119, null));
                            if (!z4) {
                                b8Var.setAnimatedIcon(R.raw.photo_spoiler);
                                n12Var2.X2.S(1);
                                if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                    n12Var2.X2.S(6);
                                    break;
                                }
                            } else {
                                b8Var.setIcon(R.drawable.msg_spoiler_off);
                                n12Var2.X2.u(1);
                                if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                    n12Var2.X2.u(6);
                                    break;
                                }
                            }
                            break;
                        default:
                            boolean z6 = ChatAttachAlertPhotoLayout.r1;
                            b8 b8Var2 = chatAttachAlertPhotoLayout.b1;
                            b8Var2.setText(ob6.M0(z4 ? 2131745348 : 2131745349, null));
                            if (!z4) {
                                b8Var2.setIcon(R.drawable.menu_quality_hd);
                                break;
                            } else {
                                b8Var2.setIcon(R.drawable.menu_quality_sd);
                                break;
                            }
                    }
                }
            }, 200L);
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : hashMap.entrySet()) {
                if (entry.getValue() instanceof no6) {
                    no6 no6Var = (no6) entry.getValue();
                    no6Var.M = z3;
                    no6Var.R = false;
                    arrayList.add(Integer.valueOf(no6Var.C));
                }
            }
            i52Var.N(new y42(b, arrayList, z3));
            if (n12Var.v2 != this) {
                u52Var.f();
            }
            c62 c62Var2 = n12Var.k2;
            if (c62Var2 != null) {
                c62Var2.w.invalidate();
                return;
            }
            return;
        }
        if (i == 2) {
            c62 c62Var3 = n12Var.k2;
            if (c62Var3 != null) {
                c62Var3.O();
            }
            Iterator it2 = hashMap.entrySet().iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((no6) ((Map.Entry) it2.next()).getValue()).c()) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            final boolean z4 = !z;
            final char c6 = c2 == true ? 1 : 0;
            hl.d3(new Runnable(this) { // from class: x42
                public final /* synthetic */ ChatAttachAlertPhotoLayout b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b2 = c6;
                    boolean z42 = z4;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                    switch (b2) {
                        case 0:
                            boolean z5 = ChatAttachAlertPhotoLayout.r1;
                            n12 n12Var2 = chatAttachAlertPhotoLayout.b;
                            b8 b8Var = chatAttachAlertPhotoLayout.Z0;
                            b8Var.setText(ob6.M0(z42 ? 2131751395 : 2131751119, null));
                            if (!z42) {
                                b8Var.setAnimatedIcon(R.raw.photo_spoiler);
                                n12Var2.X2.S(1);
                                if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                    n12Var2.X2.S(6);
                                    break;
                                }
                            } else {
                                b8Var.setIcon(R.drawable.msg_spoiler_off);
                                n12Var2.X2.u(1);
                                if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                    n12Var2.X2.u(6);
                                    break;
                                }
                            }
                            break;
                        default:
                            boolean z6 = ChatAttachAlertPhotoLayout.r1;
                            b8 b8Var2 = chatAttachAlertPhotoLayout.b1;
                            b8Var2.setText(ob6.M0(z42 ? 2131745348 : 2131745349, null));
                            if (!z42) {
                                b8Var2.setIcon(R.drawable.menu_quality_hd);
                                break;
                            } else {
                                b8Var2.setIcon(R.drawable.menu_quality_sd);
                                break;
                            }
                    }
                }
            }, 200L);
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry entry2 : hashMap.entrySet()) {
                if (entry2.getValue() instanceof no6) {
                    no6 no6Var2 = (no6) entry2.getValue();
                    no6Var2.z = Boolean.valueOf(z4);
                    no6Var2.R = false;
                    arrayList2.add(Integer.valueOf(no6Var2.C));
                }
            }
            i52Var.N(new y42(c == true ? 1 : 0, arrayList2, z4));
            if (n12Var.v2 != this) {
                u52Var.f();
            }
            c62 c62Var4 = n12Var.k2;
            if (c62Var4 != null) {
                c62Var4.w.invalidate();
                return;
            }
            return;
        }
        if (i != 4) {
            if (i == 7) {
                n12Var.K1(n12Var.v2 != n12Var.k2);
                return;
            }
            if (i == 9) {
                nza.k1(getContext(), getStarsPrice(), true, new c(this, (byte) 28), this.a);
                return;
            }
            if (i >= 10) {
                do6 do6Var = (do6) this.W0.get(i - 10);
                this.U0 = do6Var;
                do6 do6Var2 = this.V0;
                TextView textView = this.y;
                if (do6Var == do6Var2) {
                    textView.setText(ob6.M0(2131752203, null));
                } else {
                    textView.setText(do6Var.c);
                }
                u52Var.f();
                this.w.f();
                this.G.g1(0, -(i52Var.getPaddingTop() - getTopScrollOffset()));
                return;
            }
            return;
        }
        try {
            if (s0()) {
                Intent intent = new Intent();
                intent.setType("video/*");
                intent.setAction("android.intent.action.GET_CONTENT");
                intent.putExtra("android.intent.extra.sizeLimit", 2097152000L);
                Intent intent2 = new Intent("android.intent.action.PICK");
                intent2.setType("image/*");
                Intent createChooser = Intent.createChooser(intent2, null);
                createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", new Intent[]{intent});
                byte b2 = n12Var.N2;
                org.telegram.ui.ActionBar.e eVar3 = n12Var.Z1;
                if (b2 != 0) {
                    eVar3.startActivityForResult(createChooser, 14);
                } else {
                    eVar3.startActivityForResult(createChooser, 1);
                }
            } else {
                Intent intent3 = new Intent("android.intent.action.PICK");
                intent3.setType("image/*");
                byte b3 = n12Var.N2;
                org.telegram.ui.ActionBar.e eVar4 = n12Var.Z1;
                if (b3 != 0) {
                    eVar4.startActivityForResult(intent3, 14);
                } else {
                    eVar4.startActivityForResult(intent3, 1);
                }
            }
            n12Var.a(true);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x0() {
        m52 m52Var = this.x;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = m52Var.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        Object[] objArr = 0;
        if (this.w0) {
            ArrayList arrayList = s0() ? MediaController.c2 : MediaController.d2;
            ArrayList arrayList2 = new ArrayList(arrayList);
            this.W0 = arrayList2;
            Collections.sort(arrayList2, new c52(arrayList, objArr == true ? 1 : 0));
        } else {
            this.W0 = new ArrayList();
        }
        boolean isEmpty = this.W0.isEmpty();
        TextView textView = this.y;
        if (isEmpty) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.E, (Drawable) null);
        int size = this.W0.size();
        for (int i = 0; i < size; i++) {
            do6 do6Var = (do6) this.W0.get(i);
            lc lcVar = new lc(getContext(), do6Var.d, do6Var.c, do6Var.e.size(), this.a);
            m52Var.getPopupLayout().addView(lcVar);
            lcVar.setOnClickListener(new w0(this, i + 10, (byte) 4));
        }
    }

    @Override // f12
    public final void y() {
        n12 n12Var = this.b;
        U(n12Var != null && (n12Var.Z1 instanceof zu1));
    }

    public final void y0() {
        i52 i52Var = this.F;
        if (i52Var != null) {
            for (int i = 0; i < i52Var.getChildCount(); i++) {
                View childAt = i52Var.getChildAt(i);
                if (childAt instanceof d88) {
                    ((d88) childAt).a.invalidate();
                }
            }
        }
    }

    public final void z0() {
        ArrayList arrayList;
        if (this.b.Z1 instanceof zu1) {
            i52 i52Var = this.F;
            int childCount = i52Var.getChildCount();
            int i = 0;
            while (true) {
                arrayList = u1;
                if (i >= childCount) {
                    break;
                }
                View childAt = i52Var.getChildAt(i);
                if (childAt instanceof d88) {
                    d88 d88Var = (d88) childAt;
                    no6 c0 = c0(((Integer) d88Var.getTag()).intValue());
                    if (c0 != null) {
                        d88Var.setNum(arrayList.indexOf(Integer.valueOf(c0.C)));
                    }
                }
                i++;
            }
            i52 i52Var2 = this.r;
            int childCount2 = i52Var2.getChildCount();
            for (int i2 = 0; i2 < childCount2; i2++) {
                View childAt2 = i52Var2.getChildAt(i2);
                if (childAt2 instanceof d88) {
                    d88 d88Var2 = (d88) childAt2;
                    no6 c02 = c0(((Integer) d88Var2.getTag()).intValue());
                    if (c02 != null) {
                        d88Var2.setNum(arrayList.indexOf(Integer.valueOf(c02.C)));
                    }
                }
            }
        }
    }
}
