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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public class ChatAttachAlertPhotoLayout extends p02 implements gk7 {
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
    public final s42 F;
    public final Rect F0;
    public final ar0 G;
    public float G0;
    public final e52 H;
    public boolean H0;
    public final g24 I;
    public boolean I0;
    public final w49 J;
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
    public b52 Q;
    public boolean Q0;
    public final c52 R;
    public boolean R0;
    public final z42 S;
    public boolean S0;
    public final ImageView[] T;
    public int T0;
    public boolean U;
    public xl6 U0;
    public final float[] V;
    public xl6 V0;
    public final int[] W;
    public ArrayList W0;
    public float X0;
    public boolean Y0;
    public final a8 Z0;
    public float a0;
    public final a8 a1;
    public float b0;
    public final a8 b1;
    public boolean c0;
    public final a8 c1;
    public boolean d0;
    public final a8 d1;
    public boolean e0;
    public final k37 e1;
    public float f0;
    public final boolean f1;
    public final int[] g0;
    public final on g1;
    public int h0;
    public boolean h1;
    public p42 i0;
    public final v42 i1;
    public final DecelerateInterpolator j0;
    public boolean j1;
    public final yc k0;
    public float k1;
    public final ShutterButton l0;
    public float l1;
    public final azc m0;
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
    public final s42 r;
    public final TextView r0;
    public final zr s;
    public final ImageView s0;
    public boolean t0;
    public boolean u0;
    public boolean v0;
    public final e52 w;
    public boolean w0;
    public final w42 x;
    public boolean x0;
    public final TextView y;
    public boolean y0;
    public boolean z0;

    /* JADX WARN: Multi-variable type inference failed */
    public ChatAttachAlertPhotoLayout(x02 x02Var, Context context, boolean z, boolean z2, wjb wjbVar) {
        super(x02Var, wjbVar, context);
        final byte b = 2;
        this.T = new ImageView[2];
        this.V = new float[2];
        this.W = new int[2];
        byte b2 = 5;
        this.g0 = new int[5];
        this.j0 = new DecelerateInterpolator(1.5f);
        this.p0 = null;
        this.F0 = new Rect();
        int L = gl.L(80.0f);
        this.L0 = L;
        this.M0 = L;
        this.N0 = (byte) 3;
        final byte b3 = 1;
        this.Y0 = true;
        this.g1 = new on(null);
        this.i1 = new v42(this);
        this.f1 = z;
        this.n = z2;
        kk7.e().b(this, kk7.q2);
        kk7.e().b(this, kk7.n4);
        ww0 ww0Var = x02Var.c;
        x02 x02Var2 = this.b;
        byte b4 = 0;
        this.h1 = x02Var2.N2 != 0;
        w42 w42Var = new w42(this, context, x02Var2.U2.t(), wjbVar, (byte) 0);
        this.x = w42Var;
        w42Var.setSubMenuOpenSide(1);
        FrameLayout.LayoutParams d = nme.d(-2, -1.0f, 51, 60.0f, 0.0f, 40.0f, 0.0f);
        d.topMargin = gl.m;
        this.b.U2.addView(w42Var, 0, d);
        w42Var.setOnClickListener(new View.OnClickListener(this) { // from class: e42
            public final /* synthetic */ ChatAttachAlertPhotoLayout b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b52 b52Var;
                b52 b52Var2;
                byte b5 = b;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                byte b6 = 0;
                switch (b5) {
                    case 0:
                        boolean z3 = ChatAttachAlertPhotoLayout.r1;
                        if (!chatAttachAlertPhotoLayout.t0 && (b52Var = chatAttachAlertPhotoLayout.Q) != null && b52Var.isInited()) {
                            chatAttachAlertPhotoLayout.d0 = false;
                            chatAttachAlertPhotoLayout.Q.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.s0, (Property<ImageView, Float>) View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new r42(chatAttachAlertPhotoLayout, b6));
                            duration.start();
                            break;
                        }
                        break;
                    case 1:
                        boolean z4 = ChatAttachAlertPhotoLayout.r1;
                        if (!chatAttachAlertPhotoLayout.U && (b52Var2 = chatAttachAlertPhotoLayout.Q) != null && b52Var2.isInited() && chatAttachAlertPhotoLayout.c0) {
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
                                ChatAttachAlertPhotoLayout.r0(imageView, nextFlashMode);
                                AnimatorSet animatorSet = new AnimatorSet();
                                Property property = View.TRANSLATION_Y;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 0.0f, gl.L(48.0f));
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, -gl.L(48.0f), 0.0f);
                                Property property2 = View.ALPHA;
                                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property2, 0.0f, 1.0f));
                                animatorSet.setDuration(220L);
                                animatorSet.setInterpolator(s33.f);
                                animatorSet.addListener(new i8(chatAttachAlertPhotoLayout, view, imageView));
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
                            chatAttachAlertPhotoLayout.m0(null, false, false);
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
        int i = bkb.i5;
        zkb.X(textView, i, wjbVar);
        textView.setText(k96.M0(2131752226, null));
        textView.setTypeface(gl.o());
        Drawable d2 = b00.d(context, R.drawable.ic_arrow_drop_down);
        this.E = d2;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        zkb.x(this, d2, i, wjbVar, mode);
        textView.setPadding(0, 0, gl.L(10.0f), 0);
        w42Var.addView(textView, nme.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
        V(false);
        k37 k37Var = new k37(context, R.raw.position_below, k96.M0(2131752548, null), R.raw.position_above, k96.M0(2131752547, null), wjbVar);
        this.e1 = k37Var;
        k37Var.a(!this.b.W1, false);
        this.d1 = this.b.X2.e(7, R.drawable.msg_view_file, k96.M0(2131753954, null));
        this.b.X2.a(5);
        this.b.X2.e(4, R.drawable.msg_openin, k96.M0(2131747603, null));
        this.a1 = this.b.X2.e(1, R.drawable.msg_filehq, k96.M0(2131745393, null));
        this.b.X2.e(0, R.drawable.msg_ungroup, k96.M0(2131745392, null));
        this.b.X2.a(6);
        this.Z0 = this.b.X2.e(3, R.drawable.msg_spoiler, k96.M0(2131751142, null));
        this.b1 = this.b.X2.e(2, R.drawable.menu_quality_hd, k96.M0(2131745429, null));
        r7 r7Var = this.b.X2;
        r7Var.q();
        k37Var.setMinimumWidth(gl.L(196.0f));
        k37Var.setTag(8);
        r7Var.b.addView(k37Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) k37Var.getLayoutParams();
        if (k96.a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = gl.L(48.0f);
        k37Var.setLayoutParams(layoutParams);
        k37Var.setOnClickListener(new s6(r7Var, (byte) 2));
        this.c1 = this.b.X2.e(9, R.drawable.menu_feature_paid, k96.M0(2131747537, null));
        this.b.X2.setFitSubItems(true);
        s42 s42Var = new s42(this, context, wjbVar, b3);
        this.F = s42Var;
        s42Var.setFastScrollEnabled(1);
        s42Var.setFastScrollVisible(true);
        s42Var.getFastScroll().setAlpha(0.0f);
        s42Var.getFastScroll().a = false;
        s42Var.getFastScroll().i0 = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight();
        e52 e52Var = new e52(this, context, z2);
        this.H = e52Var;
        s42Var.setAdapter(e52Var);
        c52 c52Var = new c52(this, s42Var);
        this.R = c52Var;
        s42Var.i(c52Var);
        int i2 = 0;
        for (int i3 = 8; i2 < i3; i3 = 8) {
            e52Var.h.add(e52Var.L());
            i2++;
        }
        s42Var.setClipToPadding(false);
        s42Var.setItemAnimator(null);
        s42Var.setLayoutAnimation(null);
        s42Var.setVerticalScrollBarEnabled(false);
        zkb.l(s42Var, 21, bkb.z5, wjbVar);
        addView(s42Var, nme.d(-1, -1.0f, kk7.D1, 0.0f, 0.0f, 0.0f, -48.0f));
        s42Var.setOnScrollListener(new x42(this, b4));
        byte b5 = 2;
        ar0 ar0Var = new ar0(this, this.L0, b5);
        this.G = ar0Var;
        ar0Var.O = new nq1(this, b5);
        s42Var.setLayoutManager(ar0Var);
        s42Var.setOnItemClickListener(new ch(this, z2, wjbVar, b2));
        s42Var.setOnItemLongClickListener(new f42(this, b5));
        w49 w49Var = new w49(new i4d(this));
        this.J = w49Var;
        s42Var.F.add(w49Var);
        setBlur3Capture(s42Var);
        this.d = s42Var;
        this.f = true;
        g24 g24Var = new g24(context, wjbVar);
        this.I = g24Var;
        g24Var.setText(k96.M0(2131747988, null));
        g24Var.setOnTouchListener(null);
        g24Var.setTextSize(16);
        addView(g24Var, nme.c(-2.0f, -1));
        if (this.Y0) {
            g24Var.b();
        } else {
            g24Var.c();
        }
        Paint paint = new Paint(1);
        paint.setColor(-2468275);
        z42 z42Var = new z42(context, paint);
        this.S = z42Var;
        gl.U3(z42Var, false, 1.0f, true, false);
        z42Var.setBackgroundResource(R.drawable.system);
        z42Var.getBackground().setColorFilter(new PorterDuffColorFilter(1711276032, mode));
        z42Var.setTextSize(1, 15.0f);
        z42Var.setTypeface(gl.o());
        z42Var.setAlpha(0.0f);
        z42Var.setTextColor(-1);
        z42Var.setPadding(gl.L(24.0f), gl.L(5.0f), gl.L(10.0f), gl.L(5.0f));
        ww0Var.addView(z42Var, nme.d(-2, -2.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
        yc ycVar = new yc((byte) 11, context, (Object) this);
        this.k0 = ycVar;
        ycVar.setVisibility(8);
        ycVar.setAlpha(0.0f);
        ww0Var.addView(ycVar, nme.e(-1, kk7.J1, 83));
        TextView textView2 = new TextView(context);
        this.q0 = textView2;
        textView2.setBackgroundResource(R.drawable.photos_rounded);
        textView2.setVisibility(8);
        textView2.setTextColor(-1);
        textView2.setGravity(17);
        textView2.setPivotX(0.0f);
        textView2.setPivotY(0.0f);
        textView2.setTypeface(gl.o());
        textView2.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.photos_arrow, 0);
        textView2.setCompoundDrawablePadding(gl.L(4.0f));
        textView2.setPadding(gl.L(16.0f), 0, gl.L(16.0f), 0);
        ww0Var.addView(textView2, nme.d(-2, 38.0f, 51, 0.0f, 0.0f, 0.0f, 116.0f));
        final byte b6 = 3;
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: e42
            public final /* synthetic */ ChatAttachAlertPhotoLayout b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b52 b52Var;
                b52 b52Var2;
                byte b52 = b6;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                byte b62 = 0;
                switch (b52) {
                    case 0:
                        boolean z3 = ChatAttachAlertPhotoLayout.r1;
                        if (!chatAttachAlertPhotoLayout.t0 && (b52Var = chatAttachAlertPhotoLayout.Q) != null && b52Var.isInited()) {
                            chatAttachAlertPhotoLayout.d0 = false;
                            chatAttachAlertPhotoLayout.Q.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.s0, (Property<ImageView, Float>) View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new r42(chatAttachAlertPhotoLayout, b62));
                            duration.start();
                            break;
                        }
                        break;
                    case 1:
                        boolean z4 = ChatAttachAlertPhotoLayout.r1;
                        if (!chatAttachAlertPhotoLayout.U && (b52Var2 = chatAttachAlertPhotoLayout.Q) != null && b52Var2.isInited() && chatAttachAlertPhotoLayout.c0) {
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
                                ChatAttachAlertPhotoLayout.r0(imageView, nextFlashMode);
                                AnimatorSet animatorSet = new AnimatorSet();
                                Property property = View.TRANSLATION_Y;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 0.0f, gl.L(48.0f));
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, -gl.L(48.0f), 0.0f);
                                Property property2 = View.ALPHA;
                                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property2, 0.0f, 1.0f));
                                animatorSet.setDuration(220L);
                                animatorSet.setInterpolator(s33.f);
                                animatorSet.addListener(new i8(chatAttachAlertPhotoLayout, view, imageView));
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
                            chatAttachAlertPhotoLayout.m0(null, false, false);
                            CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.Q.getCameraSessionObject());
                            break;
                        }
                        break;
                }
            }
        });
        azc azcVar = new azc(context);
        this.m0 = azcVar;
        azcVar.setVisibility(8);
        azcVar.setAlpha(0.0f);
        ww0Var.addView(azcVar, nme.d(-2, 50.0f, 51, 0.0f, 0.0f, 0.0f, 116.0f));
        azcVar.setDelegate(new f42(this, (byte) 3));
        ShutterButton shutterButton = new ShutterButton(context);
        shutterButton.b = new DecelerateInterpolator();
        shutterButton.x = new bg7(shutterButton, (byte) 29);
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
        shutterButton.f = yga.a;
        this.l0 = shutterButton;
        ycVar.addView(shutterButton, nme.e(84, 84, 17));
        shutterButton.setDelegate(new q42(this, wjbVar, ww0Var));
        shutterButton.setFocusable(true);
        shutterButton.setContentDescription(k96.M0(2131754759, null));
        ImageView imageView = new ImageView(context);
        this.s0 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ycVar.addView(imageView, nme.e(48, 48, 21));
        final Object[] objArr = null == true ? 1 : 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: e42
            public final /* synthetic */ ChatAttachAlertPhotoLayout b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b52 b52Var;
                b52 b52Var2;
                byte b52 = objArr;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                byte b62 = 0;
                switch (b52) {
                    case 0:
                        boolean z3 = ChatAttachAlertPhotoLayout.r1;
                        if (!chatAttachAlertPhotoLayout.t0 && (b52Var = chatAttachAlertPhotoLayout.Q) != null && b52Var.isInited()) {
                            chatAttachAlertPhotoLayout.d0 = false;
                            chatAttachAlertPhotoLayout.Q.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.s0, (Property<ImageView, Float>) View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new r42(chatAttachAlertPhotoLayout, b62));
                            duration.start();
                            break;
                        }
                        break;
                    case 1:
                        boolean z4 = ChatAttachAlertPhotoLayout.r1;
                        if (!chatAttachAlertPhotoLayout.U && (b52Var2 = chatAttachAlertPhotoLayout.Q) != null && b52Var2.isInited() && chatAttachAlertPhotoLayout.c0) {
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
                                ChatAttachAlertPhotoLayout.r0(imageView2, nextFlashMode);
                                AnimatorSet animatorSet = new AnimatorSet();
                                Property property = View.TRANSLATION_Y;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 0.0f, gl.L(48.0f));
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, -gl.L(48.0f), 0.0f);
                                Property property2 = View.ALPHA;
                                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 0.0f, 1.0f));
                                animatorSet.setDuration(220L);
                                animatorSet.setInterpolator(s33.f);
                                animatorSet.addListener(new i8(chatAttachAlertPhotoLayout, view, imageView2));
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
                            chatAttachAlertPhotoLayout.m0(null, false, false);
                            CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.Q.getCameraSessionObject());
                            break;
                        }
                        break;
                }
            }
        });
        imageView.setContentDescription(k96.M0(2131754751, null));
        for (int i4 = 0; i4 < 2; i4++) {
            this.T[i4] = new ImageView(context);
            this.T[i4].setScaleType(ImageView.ScaleType.CENTER);
            this.T[i4].setVisibility(4);
            this.k0.addView(this.T[i4], nme.e(48, 48, 51));
            this.T[i4].setOnClickListener(new View.OnClickListener(this) { // from class: e42
                public final /* synthetic */ ChatAttachAlertPhotoLayout b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b52 b52Var;
                    b52 b52Var2;
                    byte b52 = b3;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                    byte b62 = 0;
                    switch (b52) {
                        case 0:
                            boolean z3 = ChatAttachAlertPhotoLayout.r1;
                            if (!chatAttachAlertPhotoLayout.t0 && (b52Var = chatAttachAlertPhotoLayout.Q) != null && b52Var.isInited()) {
                                chatAttachAlertPhotoLayout.d0 = false;
                                chatAttachAlertPhotoLayout.Q.switchCamera();
                                ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.s0, (Property<ImageView, Float>) View.SCALE_X, 0.0f).setDuration(100L);
                                duration.addListener(new r42(chatAttachAlertPhotoLayout, b62));
                                duration.start();
                                break;
                            }
                            break;
                        case 1:
                            boolean z4 = ChatAttachAlertPhotoLayout.r1;
                            if (!chatAttachAlertPhotoLayout.U && (b52Var2 = chatAttachAlertPhotoLayout.Q) != null && b52Var2.isInited() && chatAttachAlertPhotoLayout.c0) {
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
                                    ChatAttachAlertPhotoLayout.r0(imageView2, nextFlashMode);
                                    AnimatorSet animatorSet = new AnimatorSet();
                                    Property property = View.TRANSLATION_Y;
                                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 0.0f, gl.L(48.0f));
                                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, -gl.L(48.0f), 0.0f);
                                    Property property2 = View.ALPHA;
                                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 0.0f, 1.0f));
                                    animatorSet.setDuration(220L);
                                    animatorSet.setInterpolator(s33.f);
                                    animatorSet.addListener(new i8(chatAttachAlertPhotoLayout, view, imageView2));
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
                                chatAttachAlertPhotoLayout.m0(null, false, false);
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
        textView3.setText(k96.M0(2131744029, null));
        textView3.setShadowLayer(gl.L(3.33333f), 0.0f, gl.L(0.666f), 1275068416);
        textView3.setPadding(gl.L(6.0f), 0, gl.L(6.0f), 0);
        this.k0.addView(textView3, nme.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        s42 s42Var2 = new s42(this, context, wjbVar, null == true ? 1 : 0);
        this.r = s42Var2;
        s42Var2.setVerticalScrollBarEnabled(true);
        e52 e52Var2 = new e52(this, context, false);
        this.w = e52Var2;
        s42Var2.setAdapter(e52Var2);
        for (int i5 = 0; i5 < 8; i5++) {
            e52Var2.h.add(e52Var2.L());
        }
        s42Var2.setClipToPadding(false);
        s42Var2.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
        s42Var2.setItemAnimator(null);
        s42Var2.setLayoutAnimation(null);
        s42Var2.setOverScrollMode(2);
        s42Var2.setVisibility(4);
        s42Var2.setAlpha(0.0f);
        ww0Var.addView(s42Var2, nme.c(80.0f, -1));
        zr zrVar = new zr((byte) 3, null == true ? 1 : 0, null == true ? 1 : 0);
        this.s = zrVar;
        s42Var2.setLayoutManager(zrVar);
        s42Var2.setOnItemClickListener(new l5((byte) 2));
    }

    public static boolean T() {
        HashMap hashMap = t1;
        if (hashMap.isEmpty()) {
            return false;
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (entry.getValue() instanceof jm6) {
                jm6 jm6Var = (jm6) entry.getValue();
                if (jm6Var.d() && jm6Var.j()) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean U() {
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = u1;
            if (i >= arrayList.size()) {
                break;
            }
            Object obj = t1.get(arrayList.get(i));
            if (!TextUtils.isEmpty(obj instanceof jm6 ? ((jm6) obj).a : obj instanceof nm6 ? ((nm6) obj).I : null)) {
                i2++;
            }
            i++;
        }
        return i2 <= 1;
    }

    public static boolean e0() {
        HashMap hashMap = t1;
        if (hashMap.isEmpty()) {
            return false;
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if ((entry.getValue() instanceof jm6) && ((jm6) entry.getValue()).d()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTopScrollOffset() {
        return org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + gl.L(7.0f) + this.q1;
    }

    public static void r0(ImageView imageView, String str) {
        str.getClass();
        switch (str) {
            case "on":
                imageView.setImageResource(R.drawable.flash_on);
                imageView.setContentDescription(k96.M0(2131754913, null));
                break;
            case "off":
                imageView.setImageResource(R.drawable.flash_off);
                imageView.setContentDescription(k96.M0(2131754914, null));
                break;
            case "auto":
                imageView.setImageResource(R.drawable.flash_auto);
                imageView.setContentDescription(k96.M0(2131754915, null));
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

    @Override // p02
    public final void A(int i, boolean z) {
        W();
        b52 b52Var = this.Q;
        if (b52Var != null) {
            b52Var.invalidateOutline();
            this.Q.invalidate();
        }
    }

    public final void A0() {
        ArrayList arrayList;
        e52 e52Var;
        HashMap hashMap;
        x02 x02Var = this.b;
        org.telegram.ui.ActionBar.d dVar = x02Var.Z1;
        org.telegram.ui.ActionBar.d dVar2 = x02Var.Z1;
        if (dVar instanceof mu1) {
            s42 s42Var = this.F;
            int childCount = s42Var.getChildCount();
            int i = 0;
            while (true) {
                arrayList = u1;
                e52Var = this.H;
                hashMap = t1;
                if (i >= childCount) {
                    break;
                }
                View childAt = s42Var.getChildAt(i);
                if (childAt instanceof o48) {
                    o48 o48Var = (o48) childAt;
                    int R = RecyclerView.R(childAt);
                    if (e52Var.f && R > this.N0) {
                        R--;
                    }
                    if (e52Var.d && this.U0 == this.V0) {
                        R--;
                    }
                    jm6 d0 = d0(R);
                    o48Var.setHasSpoiler(d0 != null && d0.M);
                    o48Var.setHighQuality(d0 != null && d0.c());
                    if ((dVar2 instanceof mu1) && x02Var.Q3) {
                        o48Var.b(d0 != null ? arrayList.indexOf(Integer.valueOf(d0.C)) : -1, d0 != null && hashMap.containsKey(Integer.valueOf(d0.C)), true);
                    } else {
                        o48Var.b(-1, d0 != null && hashMap.containsKey(Integer.valueOf(d0.C)), true);
                    }
                }
                i++;
            }
            s42 s42Var2 = this.r;
            int childCount2 = s42Var2.getChildCount();
            for (int i2 = 0; i2 < childCount2; i2++) {
                View childAt2 = s42Var2.getChildAt(i2);
                if (childAt2 instanceof o48) {
                    o48 o48Var2 = (o48) childAt2;
                    int R2 = RecyclerView.R(childAt2);
                    if (e52Var.f && R2 > this.N0) {
                        R2--;
                    }
                    if (e52Var.d && this.U0 == this.V0) {
                        R2--;
                    }
                    jm6 d02 = d0(R2);
                    o48Var2.setHasSpoiler(d02 != null && d02.M);
                    o48Var2.setHighQuality(d02 != null && d02.c());
                    if ((dVar2 instanceof mu1) && x02Var.Q3) {
                        o48Var2.b(d02 != null ? arrayList.indexOf(Integer.valueOf(d02.C)) : -1, d02 != null && hashMap.containsKey(Integer.valueOf(d02.C)), true);
                    } else {
                        o48Var2.b(-1, d02 != null && hashMap.containsKey(Integer.valueOf(d02.C)), true);
                    }
                }
            }
        }
    }

    @Override // p02
    public final void B() {
        ShutterButton shutterButton = this.l0;
        if (shutterButton == null) {
            return;
        }
        boolean z = this.R0;
        b52 b52Var = this.Q;
        yga ygaVar = yga.a;
        yga ygaVar2 = yga.b;
        if (z) {
            if (b52Var != null && shutterButton.getState() == ygaVar2) {
                shutterButton.a(ygaVar);
            }
            this.R0 = false;
            return;
        }
        if (b52Var != null && shutterButton.getState() == ygaVar2) {
            o0();
            CameraController.getInstance().stopVideoRecording(this.Q.getCameraSession(), false);
            shutterButton.a(ygaVar);
        }
        if (this.c0) {
            b0(false);
        }
        f0(true);
    }

    public final void B0(boolean z) {
        TextView textView = this.q0;
        if (textView != null) {
            x02 x02Var = this.b;
            byte b = x02Var.N2;
            TextView textView2 = x02Var.g3;
            if (b != 0 || x02Var.Q2 || x02Var.B1) {
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
                if (((jm6) ((Map.Entry) it.next()).getValue()).b) {
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
                textView.setText(k96.G(hashMap.size(), "Photos", new Object[0]).toUpperCase());
                if (max != this.N || z) {
                    textView2.setText(k96.G(max, "PhotosSelected", new Object[0]));
                }
            } else if (z3) {
                textView.setText(k96.G(hashMap.size(), "Media", new Object[0]).toUpperCase());
                if (max != this.N || z) {
                    textView2.setText(k96.G(max, "MediaSelected", new Object[0]));
                }
            } else {
                textView.setText(k96.G(hashMap.size(), "Videos", new Object[0]).toUpperCase());
                if (max != this.N || z) {
                    textView2.setText(k96.G(max, "VideosSelected", new Object[0]));
                }
            }
            boolean z4 = max > 1;
            x02Var.G1 = z4;
            x02Var.j3.setVisibility((!z4 || x02Var.N2 == 2) ? 8 : 0);
            this.N = max;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00da  */
    @Override // p02
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
        if (gl.O1()) {
            this.N0 = (byte) 4;
        } else {
            Point point = gl.q;
            if (point.x > point.y) {
                this.N0 = (byte) 4;
            } else {
                this.N0 = (byte) 3;
            }
        }
        this.q1 = gl.L(48.0f) + gl.n;
        s42 s42Var = this.F;
        ((FrameLayout.LayoutParams) s42Var.getLayoutParams()).topMargin = -this.q1;
        int L2 = (i - gl.L(4.0f)) - gl.L(4.0f);
        byte b3 = this.N0;
        int i4 = L2 / b3;
        this.L0 = i4;
        if (this.M0 != i4 || b != b3) {
            this.M0 = i4;
            gl.d3(new j42(this, b2));
        }
        this.G.x1(Math.max(1, ((this.N0 - 1) * gl.L(2.0f)) + (this.L0 * this.N0)));
        e52 e52Var = this.H;
        int ceil = (int) Math.ceil((e52Var.b() - 1) / this.N0);
        if (this.Q0) {
            y = gl.L(400.0f);
        } else {
            y = de9.y(2.0f, ceil - 1, this.L0 * ceil);
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight();
        int e = ls6.e(6.0f, tb4.f(i2, y, currentActionBarHeight, gl.n) - gl.L(12.0f), 0);
        if (this.K != e) {
            this.K = e;
            e52Var.f();
        }
        if (!gl.O1()) {
            Point point2 = gl.q;
            if (point2.x > point2.y) {
                i3 = (int) (i2 / 3.5f);
                L = ((i3 + currentActionBarHeight) - gl.L(52.0f)) + this.q1;
                if (L < 0) {
                    L = 0;
                }
                if (s42Var.getPaddingTop() == L || s42Var.getPaddingBottom() != this.e) {
                    s42Var.setPadding(gl.L(2.0f), L, gl.L(2.0f), gl.L(48.0f) + this.e);
                }
                this.y.setTextSize(17.0f);
                this.S0 = false;
            }
        }
        i3 = (i2 / 5) << 1;
        L = ((i3 + currentActionBarHeight) - gl.L(52.0f)) + this.q1;
        if (L < 0) {
        }
        if (s42Var.getPaddingTop() == L) {
        }
        s42Var.setPadding(gl.L(2.0f), L, gl.L(2.0f), gl.L(48.0f) + this.e);
        this.y.setTextSize(17.0f);
        this.S0 = false;
    }

    @Override // p02
    public final void E() {
        x02 x02Var = this.b;
        if (!x02Var.isShowing() || x02Var.J || PhotoViewer.r0().U0()) {
            return;
        }
        V(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b6, code lost:
    
        if (((mu1) r2).y() == false) goto L45;
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
    @Override // p02
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        long j;
        boolean z4;
        boolean z5;
        org.telegram.ui.ActionBar.d dVar;
        TLRPC.ChatFull chatFull;
        boolean z6;
        byte b = 0;
        x02 x02Var = this.b;
        if (i > 1) {
            k27 k27Var = x02Var.E3;
            r7 r7Var = x02Var.X2;
            if (k27Var == null) {
                if (getStarsPrice() <= 0) {
                    r7Var.S(0);
                    z = true;
                } else {
                    r7Var.u(0);
                    z = false;
                }
                if (!this.A0 || getStarsPrice() > 0) {
                    r7Var.u(1);
                    z2 = false;
                    if (i != 0) {
                        x02Var.X2.u(4);
                    }
                    a8 a8Var = this.a1;
                    if (i <= 1) {
                        x02Var.X2.S(5);
                        x02Var.X2.S(7);
                        a8Var.setText(k96.M0(2131745443, null));
                    } else {
                        x02Var.X2.u(5);
                        x02Var.X2.u(7);
                        if (i != 0) {
                            a8Var.setText(k96.M0(2131745444, null));
                        }
                    }
                    if (i > 0 && getStarsPrice() <= 0) {
                        if (x02Var != null) {
                            org.telegram.ui.ActionBar.d dVar2 = x02Var.Z1;
                            if (dVar2 instanceof mu1) {
                            }
                        }
                        z3 = true;
                        if (i > 0 || x02Var == null) {
                            j = 0;
                        } else {
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = x02Var.d2;
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
                                                CharSequence charSequence = ((jm6) selectedPhotos.get(selectedPhotosOrder.get(i6))).a;
                                                String charSequence2 = charSequence == null ? "" : charSequence.toString();
                                                if (x02Var.U0() != null && TextUtils.isEmpty(charSequence2) && i5 == 0) {
                                                    charSequence2 = x02Var.U0().getText().toString();
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
                                    if (z6 && (x02Var.Z1 instanceof mu1)) {
                                        z4 = true;
                                        if (i > 0 && x02Var != null) {
                                            dVar = x02Var.Z1;
                                            if ((dVar instanceof mu1) && hc2.V(((mu1) dVar).e) && (chatFull = ((mu1) dVar).r8) != null && chatFull.paid_media_allowed) {
                                                z5 = true;
                                                if (z3) {
                                                    String M0 = k96.M0(2131751142, null);
                                                    a8 a8Var2 = this.Z0;
                                                    a8Var2.setText(M0);
                                                    a8Var2.setAnimatedIcon(R.raw.photo_spoiler);
                                                    x02Var.X2.u(3);
                                                } else if (x02Var != null) {
                                                    x02Var.X2.S(3);
                                                }
                                                if (x02Var != null) {
                                                    r7 r7Var2 = x02Var.X2;
                                                    if (getSelectedPhotosCount() == i) {
                                                        int selectedPhotosHighQualityCount = getSelectedPhotosHighQualityCount();
                                                        a8 a8Var3 = this.b1;
                                                        if (selectedPhotosHighQualityCount > 0) {
                                                            a8Var3.setText(k96.M0(2131745428, null));
                                                            a8Var3.setIcon(R.drawable.menu_quality_sd);
                                                        } else {
                                                            a8Var3.setText(k96.M0(2131745429, null));
                                                            a8Var3.setIcon(R.drawable.menu_quality_hd);
                                                        }
                                                        r7Var2.S(2);
                                                    } else {
                                                        r7Var2.u(2);
                                                    }
                                                }
                                                k37 k37Var = this.e1;
                                                if (z4) {
                                                    k37Var.setVisibility(8);
                                                } else {
                                                    k37Var.setVisibility(0);
                                                }
                                                if ((!z3 || z4) && (z2 || z)) {
                                                    x02Var.X2.S(6);
                                                } else {
                                                    x02Var.X2.u(6);
                                                }
                                                if (z5) {
                                                    x02Var.X2.u(9);
                                                    return;
                                                }
                                                a8 a8Var4 = this.c1;
                                                if (a8Var4 != null) {
                                                    long starsPrice = getStarsPrice();
                                                    if (starsPrice > j) {
                                                        a8Var4.setText(k96.M0(2131747535, null));
                                                        a8Var4.setSubtext(k96.G((int) starsPrice, "Stars", new Object[0]));
                                                    } else {
                                                        a8Var4.setText(k96.M0(2131747537, null));
                                                        a8Var4.setSubtext(null);
                                                    }
                                                }
                                                this.F.M(new d42(b));
                                                x02Var.X2.S(9);
                                                return;
                                            }
                                        }
                                        z5 = false;
                                        if (z3) {
                                        }
                                        if (x02Var != null) {
                                        }
                                        k37 k37Var2 = this.e1;
                                        if (z4) {
                                        }
                                        if (z3) {
                                        }
                                        x02Var.X2.S(6);
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
                                    dVar = x02Var.Z1;
                                    if (dVar instanceof mu1) {
                                        z5 = true;
                                        if (z3) {
                                        }
                                        if (x02Var != null) {
                                        }
                                        k37 k37Var22 = this.e1;
                                        if (z4) {
                                        }
                                        if (z3) {
                                        }
                                        x02Var.X2.S(6);
                                        if (z5) {
                                        }
                                    }
                                }
                                z5 = false;
                                if (z3) {
                                }
                                if (x02Var != null) {
                                }
                                k37 k37Var222 = this.e1;
                                if (z4) {
                                }
                                if (z3) {
                                }
                                x02Var.X2.S(6);
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
                        if (x02Var != null) {
                        }
                        k37 k37Var2222 = this.e1;
                        if (z4) {
                        }
                        if (z3) {
                        }
                        x02Var.X2.S(6);
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
                    if (x02Var != null) {
                    }
                    k37 k37Var22222 = this.e1;
                    if (z4) {
                    }
                    if (z3) {
                    }
                    x02Var.X2.S(6);
                    if (z5) {
                    }
                } else {
                    r7Var.S(1);
                    z2 = true;
                    if (i != 0) {
                    }
                    a8 a8Var5 = this.a1;
                    if (i <= 1) {
                    }
                    if (i > 0) {
                        if (x02Var != null) {
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
                        if (x02Var != null) {
                        }
                        k37 k37Var222222 = this.e1;
                        if (z4) {
                        }
                        if (z3) {
                        }
                        x02Var.X2.S(6);
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
                    if (x02Var != null) {
                    }
                    k37 k37Var2222222 = this.e1;
                    if (z4) {
                    }
                    if (z3) {
                    }
                    x02Var.X2.S(6);
                    if (z5) {
                    }
                }
            }
        }
        r7 r7Var3 = x02Var.X2;
        r7 r7Var4 = x02Var.X2;
        r7Var3.u(0);
        if (i == 0) {
            r7Var4.S(4);
            r7Var4.u(1);
        } else if (this.A0 && getStarsPrice() <= 0 && x02Var.E3 == null) {
            r7Var4.S(1);
            z = false;
            z2 = true;
            if (i != 0) {
            }
            a8 a8Var52 = this.a1;
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
            if (x02Var != null) {
            }
            k37 k37Var22222222 = this.e1;
            if (z4) {
            }
            if (z3) {
            }
            x02Var.X2.S(6);
            if (z5) {
            }
        } else {
            r7Var4.u(1);
        }
        z = false;
        z2 = false;
        if (i != 0) {
        }
        a8 a8Var522 = this.a1;
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
        if (x02Var != null) {
        }
        k37 k37Var222222222 = this.e1;
        if (z4) {
        }
        if (z3) {
        }
        x02Var.X2.S(6);
        if (z5) {
        }
    }

    @Override // p02
    public final boolean H(int i) {
        if (!this.c0) {
            return false;
        }
        if (i != 24 && i != 25 && i != 79 && i != 85) {
            return false;
        }
        ((q42) this.l0.getDelegate()).a();
        return true;
    }

    @Override // p02
    public final void I(p02 p02Var) {
        ViewPropertyAnimator viewPropertyAnimator = this.p1;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.x.setVisibility(0);
        boolean z = p02Var instanceof m52;
        TextView textView = this.y;
        if (z) {
            ViewPropertyAnimator interpolator = textView.animate().alpha(1.0f).setDuration(150L).setInterpolator(s33.j);
            this.p1 = interpolator;
            interpolator.start();
        } else {
            a0();
            textView.setAlpha(1.0f);
        }
        this.b.U2.setTitle("");
        this.G.g1(0, 0);
        if (z) {
            this.F.post(new kx1(this, p02Var, (byte) 19));
        }
        W();
        p0();
    }

    @Override // p02
    public final void J() {
        this.O = false;
        b52 b52Var = this.Q;
        if (b52Var != null) {
            b52Var.setVisibility(0);
        }
        if (this.v0) {
            this.v0 = false;
            V(true);
        }
    }

    @Override // p02
    public final void K() {
        this.F.z0(0);
    }

    public final int R(jm6 jm6Var, int i) {
        Integer valueOf = Integer.valueOf(jm6Var.C);
        HashMap hashMap = t1;
        boolean containsKey = hashMap.containsKey(valueOf);
        ArrayList arrayList = u1;
        if (containsKey) {
            jm6Var.N = 0L;
            jm6Var.M = false;
            jm6Var.O = null;
            jm6Var.z = null;
            hashMap.remove(valueOf);
            int indexOf = arrayList.indexOf(valueOf);
            if (indexOf >= 0) {
                arrayList.remove(indexOf);
            }
            B0(false);
            z0();
            if (i >= 0) {
                jm6Var.e();
                this.i1.X(i);
            }
            return indexOf;
        }
        jm6Var.N = getStarsPrice();
        jm6Var.M = getStarsPrice() > 0;
        jm6Var.R = false;
        if (e0()) {
            jm6Var.O = Boolean.valueOf(!T());
        }
        jm6Var.z = Boolean.valueOf(jm6Var.c());
        boolean X = X(true);
        hashMap.put(valueOf, jm6Var);
        arrayList.add(valueOf);
        if (X) {
            A0();
            return -1;
        }
        B0(true);
        return -1;
    }

    public final void S() {
        b52 b52Var = this.Q;
        if (b52Var != null) {
            if (!this.c0) {
                b52Var.setTranslationX(this.V[0]);
            }
            int i = this.L0;
            int L = gl.L(2.0f) + (i << 1);
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
            gl.d3(new kx1(this, layoutParams, (byte) 20));
        }
    }

    public final void V(boolean z) {
        e52 e52Var;
        x02 x02Var = this.b;
        boolean z2 = x02Var.P1;
        org.telegram.ui.ActionBar.d dVar = x02Var.Z1;
        if (z2 || !this.n) {
            return;
        }
        boolean z3 = this.O0;
        boolean z4 = this.P0;
        org.telegram.ui.ActionBar.d Q = dVar == null ? LaunchActivity.Q() : dVar;
        if (Q == null || Q.getParentActivity() == null) {
            return;
        }
        boolean z5 = false;
        if (gba.v0) {
            boolean z6 = Q.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0;
            this.P0 = z6;
            if (z6) {
                if (z) {
                    try {
                        dVar.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE"}, 17);
                    } catch (Exception unused) {
                    }
                }
                this.O0 = false;
            } else {
                if (z || gba.M0) {
                    CameraController.getInstance().initCamera(null);
                }
                z5 = CameraController.getInstance().isCameraInitied();
                this.O0 = z5;
            }
        } else {
            this.O0 = false;
        }
        if ((z3 != z5 || z4 != this.P0) && (e52Var = this.H) != null) {
            e52Var.f();
        }
        if (x02Var.P1 || !x02Var.isShowing() || !this.O0 || ((Paint) x02Var.Z.b).getAlpha() == 0 || this.c0) {
            return;
        }
        v0();
    }

    public final void W() {
        s49 K;
        float[] fArr;
        if (PhotoViewer.C0() && PhotoViewer.r0().p5 != null && PhotoViewer.r0().p5.W) {
            return;
        }
        b52 b52Var = this.Q;
        if (b52Var != null) {
            b52Var.invalidateOutline();
        }
        int i = this.N0 - 1;
        s42 s42Var = this.F;
        s49 K2 = s42Var.K(i);
        if (K2 != null) {
            K2.a.invalidateOutline();
        }
        if ((!this.H.d || !this.O0 || this.U0 != this.V0) && (K = s42Var.K(0)) != null) {
            K.a.invalidateOutline();
        }
        b52 b52Var2 = this.Q;
        if (b52Var2 != null) {
            b52Var2.invalidate();
        }
        z42 z42Var = this.S;
        if (z42Var != null) {
            ((ViewGroup.MarginLayoutParams) z42Var.getLayoutParams()).topMargin = getRootWindowInsets() == null ? gl.L(16.0f) : getRootWindowInsets().getSystemWindowInsetTop() + gl.L(2.0f);
        }
        if (this.O0) {
            int childCount = s42Var.getChildCount();
            int i2 = 0;
            while (true) {
                fArr = this.V;
                if (i2 >= childCount) {
                    break;
                }
                View childAt = s42Var.getChildAt(i2);
                if (!(childAt instanceof h48)) {
                    i2++;
                } else if (childAt.isAttachedToWindow()) {
                    float y = getY() + s42Var.getY() + childAt.getY();
                    x02 x02Var = this.b;
                    ViewGroup viewGroup = x02Var.b;
                    xz1 xz1Var = x02Var.v3;
                    st stVar = x02Var.L2;
                    float y2 = viewGroup.getY() + y;
                    float x = (x02Var.b.getX() + (getX() + (s42Var.getX() + childAt.getX()))) - getRootWindowInsets().getSystemWindowInsetLeft();
                    float alpha = (stVar.getAlpha() * stVar.getMeasuredHeight()) + org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + (!x02Var.a2 ? gl.m : 0);
                    eb1 eb1Var = x02Var.B4;
                    if (eb1Var != null && eb1Var.g()) {
                        alpha = Math.max(alpha, (x02Var.B4.e() + x02Var.B4.getY()) - x02Var.i4);
                    }
                    float f = y < alpha ? alpha - y : 0.0f;
                    if (f != this.a0) {
                        this.a0 = f;
                        b52 b52Var3 = this.Q;
                        if (b52Var3 != null) {
                            b52Var3.invalidateOutline();
                            this.Q.invalidate();
                        }
                    }
                    float translationY = (int) (xz1Var.getTranslationY() + (x02Var.b.getMeasuredHeight() - xz1Var.getMeasuredHeight()));
                    eb1 eb1Var2 = x02Var.B4;
                    if (eb1Var2 != null) {
                        translationY -= eb1Var2.d() - gl.L(6.0f);
                    }
                    if (childAt.getMeasuredHeight() + y > translationY) {
                        this.b0 = Math.min(-gl.L(5.0f), y - translationY) + childAt.getMeasuredHeight();
                    } else {
                        this.b0 = 0.0f;
                    }
                    fArr[0] = x;
                    fArr[1] = y2;
                    S();
                    return;
                }
            }
            if (this.a0 != 0.0f) {
                this.a0 = 0.0f;
                b52 b52Var4 = this.Q;
                if (b52Var4 != null) {
                    b52Var4.invalidateOutline();
                    this.Q.invalidate();
                }
            }
            fArr[0] = gl.L(-400.0f);
            fArr[1] = 0.0f;
            S();
        }
    }

    public final boolean X(boolean z) {
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
                if (!(obj instanceof jm6)) {
                    break;
                }
                R((jm6) obj, -1);
                z2 = true;
            } else {
                break;
            }
        }
        return z2;
    }

    public final boolean Y(jm6 jm6Var) {
        boolean z = this.x0;
        wjb wjbVar = this.a;
        x02 x02Var = this.b;
        if (z || !jm6Var.b) {
            if (this.y0 || jm6Var.b) {
                return false;
            }
            if (!x02Var.F0()) {
                yjb.x(null, 2131749367, new u21(x02Var.o3, wjbVar), null);
                return true;
            }
        } else if (!x02Var.F0()) {
            yjb.x(null, 2131749363, new u21(x02Var.o3, wjbVar), null);
            return true;
        }
        return true;
    }

    public final void Z() {
        if (this.Q0) {
            boolean g0 = g0();
            this.Q0 = g0;
            if (!g0) {
                h0();
            }
            this.H.f();
            this.w.f();
        }
    }

    @Override // p02
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
                if (obj3 instanceof jm6) {
                    jm6 clone = ((jm6) obj3).clone();
                    CharSequence[] charSequenceArr = {editable};
                    clone.n = hq6.d0(y6c.t0).Y(charSequenceArr, false, true);
                    clone.a = charSequenceArr[0];
                    obj = clone;
                } else {
                    boolean z = obj3 instanceof nm6;
                    obj = obj3;
                    if (z) {
                        nm6 clone2 = ((nm6) obj3).clone();
                        CharSequence[] charSequenceArr2 = {editable};
                        clone2.n = hq6.d0(y6c.t0).Y(charSequenceArr2, false, true);
                        clone2.I = charSequenceArr2[0];
                        obj = clone2;
                    }
                }
                hashMap.put(obj2, obj);
            }
            i++;
        }
    }

    public final void a0() {
        String M0 = k96.M0(2131751142, null);
        a8 a8Var = this.Z0;
        a8Var.setText(M0);
        a8Var.setAnimatedIcon(R.raw.photo_spoiler);
        this.b.X2.S(1);
        HashMap hashMap = t1;
        if (!hashMap.isEmpty()) {
            Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                ((jm6) ((Map.Entry) it.next()).getValue()).e();
            }
            hashMap.clear();
            u1.clear();
        }
        ArrayList arrayList = s1;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                jm6 jm6Var = (jm6) arrayList.get(i);
                new File(jm6Var.I).delete();
                if (jm6Var.h != null) {
                    new File(jm6Var.h).delete();
                }
                if (jm6Var.c != null) {
                    new File(jm6Var.c).delete();
                }
            }
            arrayList.clear();
        }
        this.H.f();
        this.w.f();
    }

    @Override // p02
    public final boolean b() {
        return !this.c0;
    }

    public final void b0(boolean z) {
        b52 b52Var;
        if (this.t0 || this.Q == null) {
            return;
        }
        int i = this.L0;
        int[] iArr = this.g0;
        iArr[1] = i;
        iArr[2] = gl.L(2.0f) + (i << 1);
        Runnable runnable = this.o0;
        if (runnable != null) {
            gl.r(runnable);
            this.o0 = null;
        }
        gl.j3(this.b, ((double) gl.B(bkb.v0(bkb.Z6, this.a))) > 0.721d);
        TextView textView = this.q0;
        s42 s42Var = this.r;
        yc ycVar = this.k0;
        s42 s42Var2 = this.F;
        ImageView[] imageViewArr = this.T;
        azc azcVar = this.m0;
        if (z) {
            this.k1 = this.Q.getTranslationY();
            this.e0 = true;
            if (s42Var2 != null) {
                s42Var2.invalidate();
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this, "cameraOpenProgress", 0.0f));
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(ycVar, (Property<yc, Float>) property, 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(azcVar, (Property<azc, Float>) property, 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(s42Var, (Property<s42, Float>) property, 0.0f));
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
            animatorSet.setInterpolator(s33.f);
            animatorSet.addListener(new r42(this, (byte) 3));
            animatorSet.start();
        } else {
            this.j1 = false;
            setAlertKeepScreenOn(false);
            setCameraOpenProgress(0.0f);
            iArr[0] = 0;
            setCameraOpenProgress(0.0f);
            ycVar.setAlpha(0.0f);
            ycVar.setVisibility(8);
            azcVar.setAlpha(0.0f);
            azcVar.setTag(null);
            azcVar.setVisibility(8);
            s42Var.setAlpha(0.0f);
            textView.setAlpha(0.0f);
            s42Var.setVisibility(8);
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
            b52 b52Var2 = this.Q;
            if (b52Var2 != null) {
                b52Var2.setFpsLimit(30);
                this.Q.setSystemUiVisibility(1024);
            }
            if (s42Var2 != null) {
                s42Var2.invalidate();
            }
        }
        b52 b52Var3 = this.Q;
        if (b52Var3 != null) {
            b52Var3.setImportantForAccessibility(0);
        }
        s42Var2.setImportantForAccessibility(0);
        if (e66.e(360928) || (b52Var = this.Q) == null) {
            return;
        }
        b52Var.showTexture(false, z);
    }

    @Override // p02
    public final boolean c() {
        Iterator it = t1.entrySet().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof jm6) {
                if (((jm6) value).x != 0) {
                    return false;
                }
            } else if ((value instanceof nm6) && ((nm6) value).x != 0) {
                return false;
            }
        }
        return true;
    }

    public final o48 c0(int i) {
        s42 s42Var = this.F;
        int childCount = s42Var.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = s42Var.getChildAt(i2);
            if (childAt.getTop() < s42Var.getMeasuredHeight() - this.b.T0() && (childAt instanceof o48)) {
                o48 o48Var = (o48) childAt;
                if (o48Var.getImageView().getTag() != null && ((Integer) o48Var.getImageView().getTag()).intValue() == i) {
                    return o48Var;
                }
            }
        }
        return null;
    }

    @Override // p02
    public final void d() {
        boolean z = this.f1;
        int i = z ? bkb.Xg : bkb.i5;
        int i2 = bkb.b7;
        wjb wjbVar = this.a;
        this.I.setTextColor(bkb.v0(i2, wjbVar));
        int i3 = bkb.z5;
        s42 s42Var = this.F;
        zkb.H(s42Var, i3, wjbVar);
        s42Var.K(0);
        zkb.X(this.y, i, wjbVar);
        int v0 = bkb.v0(z ? bkb.Xg : bkb.D8, wjbVar);
        w42 w42Var = this.x;
        w42Var.O(v0, false);
        w42Var.O(bkb.v0(z ? bkb.Xg : bkb.D8, wjbVar), true);
        w42Var.I(bkb.v0(z ? bkb.Zg : bkb.F8, wjbVar));
        bkb.A1(bkb.v0(i, wjbVar), this.E);
    }

    public final jm6 d0(int i) {
        if (i < 0) {
            return null;
        }
        ArrayList arrayList = s1;
        int size = arrayList.size();
        if (i < size) {
            return (jm6) arrayList.get(i);
        }
        int i2 = i - size;
        xl6 xl6Var = this.U0;
        if (xl6Var == null || i2 >= xl6Var.e.size()) {
            return null;
        }
        return (jm6) this.U0.e.get(i2);
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        xl6 xl6Var;
        x02 x02Var;
        if (i != kk7.q2) {
            if (i == kk7.n4) {
                V(false);
                return;
            }
            return;
        }
        e52 e52Var = this.H;
        if (e52Var != null) {
            if (t0()) {
                xl6Var = MediaController.a2;
                this.V0 = xl6Var;
            } else {
                xl6Var = MediaController.b2;
                this.V0 = xl6Var;
            }
            if (this.U0 == null || ((x02Var = this.b) != null && x02Var.A1)) {
                this.U0 = xl6Var;
            } else if (t0()) {
                int i3 = 0;
                while (true) {
                    if (i3 >= MediaController.c2.size()) {
                        break;
                    }
                    xl6 xl6Var2 = (xl6) MediaController.c2.get(i3);
                    int i4 = xl6Var2.a;
                    xl6 xl6Var3 = this.U0;
                    if (i4 == xl6Var3.a && xl6Var2.b == xl6Var3.b) {
                        this.U0 = xl6Var2;
                        break;
                    }
                    i3++;
                }
            }
            this.Y0 = false;
            this.I.c();
            e52Var.f();
            this.w.f();
            ArrayList arrayList = u1;
            if (!arrayList.isEmpty() && this.V0 != null) {
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    Integer num = (Integer) arrayList.get(i5);
                    HashMap hashMap = t1;
                    Object obj = hashMap.get(num);
                    jm6 jm6Var = (jm6) this.V0.f.get(num.intValue());
                    if (jm6Var != null) {
                        if (obj instanceof jm6) {
                            jm6Var.g((jm6) obj);
                        }
                        hashMap.put(num, jm6Var);
                    }
                }
            }
            x0();
        }
    }

    public final void f0(boolean z) {
        if (!this.O0 || this.Q == null) {
            return;
        }
        q0();
        this.R.i();
        this.Q.destroy(z, null);
        AnimatorSet animatorSet = this.P;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.P = null;
        }
        gl.e3(new j42(this, (byte) 0), 300L);
        this.d0 = false;
    }

    public final boolean g0() {
        Activity W = gl.W(getContext());
        if (W == null) {
            W = this.b.Z1.getParentActivity();
        }
        if (W != null) {
            return Build.VERSION.SDK_INT >= 33 ? (W.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0 && W.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0) ? false : true : W.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0;
        }
        return true;
    }

    public ArrayList<Object> getAllPhotosArray() {
        xl6 xl6Var = this.U0;
        ArrayList<Object> arrayList = s1;
        if (xl6Var == null) {
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

    @Override // p02
    public int getButtonsHideOffset() {
        return org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + super.getButtonsHideOffset();
    }

    public float getCameraOpenProgress() {
        return this.f0;
    }

    @Override // p02
    public int getCurrentItemTop() {
        s42 s42Var = this.F;
        int childCount = s42Var.getChildCount();
        g24 g24Var = this.I;
        if (childCount <= 0) {
            s42Var.setTopGlowOffset(s42Var.getPaddingTop());
            g24Var.setTranslationY(0.0f);
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = s42Var.getChildAt(0);
        y29 y29Var = (y29) s42Var.G(childAt);
        int top = childAt.getTop() - this.q1;
        int L = gl.L(7.0f);
        if (top < gl.L(7.0f) || y29Var == null || y29Var.b() != 0) {
            top = L;
        }
        g24Var.setTranslationY(((((getMeasuredHeight() - top) - gl.L(50.0f)) - g24Var.getMeasuredHeight()) / 2.0f) + top);
        s42Var.setTopGlowOffset(top);
        return top;
    }

    @Override // p02
    public int getFirstOffset() {
        return gl.L(56.0f) + getListTopPadding();
    }

    @Override // p02
    public int getListTopPadding() {
        return this.F.getPaddingTop();
    }

    @Override // p02
    public int getSelectedItemsCount() {
        return u1.size();
    }

    public HashMap<Object, Object> getSelectedPhotos() {
        return t1;
    }

    public int getSelectedPhotosCount() {
        int i = 0;
        for (Object obj : t1.values()) {
            if (obj instanceof jm6) {
                jm6 jm6Var = (jm6) obj;
                if (!jm6Var.b && jm6Var.s == null) {
                    i++;
                }
            }
        }
        return i;
    }

    public int getSelectedPhotosHighQualityCount() {
        int i = 0;
        for (Object obj : t1.values()) {
            if (obj instanceof jm6) {
                jm6 jm6Var = (jm6) obj;
                if (jm6Var.c() && !jm6Var.b && jm6Var.s == null) {
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
            return ((jm6) ((Map.Entry) it.next()).getValue()).N;
        }
        return 0L;
    }

    public final void h0() {
        if ((t0() ? MediaController.a2 : MediaController.b2) == null) {
            MediaController.N(0);
        }
    }

    public final int i0() {
        x02 x02Var = this.b;
        org.telegram.ui.ActionBar.d dVar = x02Var.Z1;
        return ((dVar instanceof mu1) && ((mu1) dVar).g4 == 5) ? dVar.getMessagesController().k4.i0.f() - ((mu1) x02Var.Z1).M6.size() : ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    @Override // p02
    public final int j() {
        return 1;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:22|(1:24)|(1:29)|(6:31|(5:33|(1:35)|36|(1:38)|(1:40))|98|42|(1:97)|46)(1:99)|(1:96)(1:51)|52|53|54|55|(4:57|58|(2:60|61)|63)|64|65|66|67|68|69) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cc, code lost:
    
        if (oo1.t(r13) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x015d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x015e, code lost:
    
        fa4.g(r0, true);
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x0127 -> B:62:0x012b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j0(int i, Intent intent, String str) {
        String str2;
        String str3;
        Throwable th;
        MediaMetadataRetriever mediaMetadataRetriever;
        int i2;
        int i3;
        x02 x02Var = this.b;
        boolean z = x02Var.P1;
        org.telegram.ui.ActionBar.d dVar = x02Var.Z1;
        if (z) {
            return;
        }
        r1 = true;
        MediaMetadataRetriever mediaMetadataRetriever2 = null;
        if (i == 0) {
            PhotoViewer.r0().S1(dVar.getParentActivity(), null, this.a);
            PhotoViewer r0 = PhotoViewer.r0();
            int i4 = x02Var.P3;
            boolean z2 = x02Var.Q3;
            r0.h = i4;
            r0.n = z2;
            Pair N0 = gl.N0(str);
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
                    jm6 jm6Var = new jm6(i6, str, ((Integer) N0.first).intValue(), false, i5, i3);
                    jm6Var.n(N0);
                    jm6Var.L = true;
                    m0(jm6Var, false, true);
                    return;
                }
            } catch (Exception unused2) {
                i2 = 0;
            }
            int i52 = i2;
            int i62 = v1;
            v1 = i62 - 1;
            jm6 jm6Var2 = new jm6(i62, str, ((Integer) N0.first).intValue(), false, i52, i3);
            jm6Var2.n(N0);
            jm6Var2.L = true;
            m0(jm6Var2, false, true);
            return;
        }
        if (i == 2) {
            if (w01.a) {
                fa4.b("pic path " + str);
            }
            if (intent != null && str != null && oo1.t(str)) {
                intent = null;
            }
            if (intent != null) {
                Uri data = intent.getData();
                if (data != null) {
                    if (w01.a) {
                        fa4.b("video record uri " + data.toString());
                    }
                    str2 = gl.S0(data);
                    if (w01.a) {
                        fa4.b("resolved path = " + str2);
                    }
                    if (str2 != null) {
                    }
                }
                str2 = str;
                if (!(dVar instanceof mu1) || !((mu1) dVar).y()) {
                    gl.e(str);
                }
                str3 = null;
            } else {
                str2 = null;
                str3 = str;
            }
            String str4 = (str2 == null && str3 != null && oo1.t(str3)) ? str3 : str2;
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
                fa4.g(e2, true);
            }
            try {
                mediaMetadataRetriever.setDataSource(str4);
                r13 = mediaMetadataRetriever.extractMetadata(9) != null ? (int) Math.ceil(Long.parseLong(r0) / 1000.0f) : 0L;
                mediaMetadataRetriever.release();
            } catch (Exception e3) {
                e = e3;
                mediaMetadataRetriever2 = mediaMetadataRetriever;
                fa4.g(e, true);
                if (mediaMetadataRetriever2 != null) {
                    mediaMetadataRetriever2.release();
                }
                Bitmap q = z3a.q(1, str4);
                File file = new File(ba4.z(4), "-2147483648_" + gba.p() + ".jpg");
                q.compress(Bitmap.CompressFormat.JPEG, 55, new FileOutputStream(file));
                gba.x();
                int i7 = v1;
                v1 = i7 - 1;
                jm6 jm6Var3 = new jm6(i7, str4, 0, true, q.getWidth(), q.getHeight());
                jm6Var3.E = (int) r13;
                jm6Var3.c = file.getAbsolutePath();
                m0(jm6Var3, false, true);
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
                    fa4.g(e4, true);
                    throw th;
                }
            }
            Bitmap q2 = z3a.q(1, str4);
            File file2 = new File(ba4.z(4), "-2147483648_" + gba.p() + ".jpg");
            q2.compress(Bitmap.CompressFormat.JPEG, 55, new FileOutputStream(file2));
            gba.x();
            int i72 = v1;
            v1 = i72 - 1;
            jm6 jm6Var32 = new jm6(i72, str4, 0, true, q2.getWidth(), q2.getHeight());
            jm6Var32.E = (int) r13;
            jm6Var32.c = file2.getAbsolutePath();
            m0(jm6Var32, false, true);
        }
    }

    public final void k0(boolean z) {
        b52 b52Var;
        b52 b52Var2 = this.Q;
        if (b52Var2 == null || this.P != null) {
            return;
        }
        x02 x02Var = this.b;
        if (x02Var.J) {
            return;
        }
        b52Var2.initTexture();
        boolean t0 = t0();
        int i = 0;
        TextView textView = this.r0;
        if (t0) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        boolean isEmpty = s1.isEmpty();
        TextView textView2 = this.q0;
        s42 s42Var = this.r;
        if (isEmpty) {
            textView2.setVisibility(4);
            s42Var.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            s42Var.setVisibility(0);
        }
        if (x02Var.U0().w && isFocusable()) {
            x02Var.U0().d();
        }
        azc azcVar = this.m0;
        azcVar.setVisibility(0);
        azcVar.setAlpha(0.0f);
        yc ycVar = this.k0;
        ycVar.setVisibility(0);
        ycVar.setTag(null);
        int[] iArr = this.g0;
        iArr[0] = 0;
        int i2 = this.L0;
        iArr[1] = i2;
        int L = gl.L(2.0f) + (i2 << 1);
        byte b = 2;
        iArr[2] = L;
        this.k1 = 0.0f;
        this.j1 = true;
        b52 b52Var3 = this.Q;
        if (b52Var3 != null) {
            b52Var3.setFpsLimit(-1);
        }
        gl.t1(this);
        gl.j3(x02Var, false);
        setAlertKeepScreenOn(true);
        s42 s42Var2 = this.F;
        ImageView[] imageViewArr = this.T;
        if (z) {
            setCameraOpenProgress(0.0f);
            this.e0 = true;
            if (s42Var2 != null) {
                s42Var2.invalidate();
            }
            this.g1.d();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this, "cameraOpenProgress", 0.0f, 1.0f));
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(ycVar, (Property<yc, Float>) property, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(s42Var, (Property<s42, Float>) property, 1.0f));
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
            animatorSet.setInterpolator(s33.f);
            animatorSet.addListener(new r42(this, b));
            animatorSet.start();
        } else {
            setCameraOpenProgress(1.0f);
            ycVar.setAlpha(1.0f);
            textView2.setAlpha(1.0f);
            s42Var.setAlpha(1.0f);
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
            x02Var.W3.I0();
            b52 b52Var4 = this.Q;
            if (b52Var4 != null) {
                b52Var4.setSystemUiVisibility(1028);
            }
        }
        this.c0 = true;
        b52 b52Var5 = this.Q;
        if (b52Var5 != null) {
            b52Var5.setImportantForAccessibility(2);
        }
        s42Var2.setImportantForAccessibility(4);
        s42Var2.invalidate();
        if (e66.e(360928) || (b52Var = this.Q) == null || !b52Var.isInited()) {
            return;
        }
        this.Q.showTexture(true, z);
    }

    @Override // p02
    public final void l() {
        W();
        invalidate();
    }

    public final void l0() {
        if (gba.v0) {
            k0(true);
            return;
        }
        x02 x02Var = this.b;
        v02 v02Var = x02Var.W3;
        if (v02Var != null) {
            v02Var.B1(0, false, true, 0, 0, 0L, x02Var.a1(), false, 0L);
        }
    }

    @Override // p02
    public final void m(float f) {
        this.X0 = f;
        W();
        b52 b52Var = this.Q;
        if (b52Var != null) {
            b52Var.invalidateOutline();
            this.Q.invalidate();
        }
        invalidate();
    }

    public final void m0(jm6 jm6Var, boolean z, boolean z2) {
        int i;
        mu1 mu1Var;
        mu1 mu1Var2;
        ArrayList<Object> arrayList;
        int i2;
        ArrayList arrayList2 = s1;
        x02 x02Var = this.b;
        if (jm6Var != null) {
            int i3 = jm6Var.C;
            arrayList2.add(jm6Var);
            t1.put(Integer.valueOf(i3), jm6Var);
            u1.add(Integer.valueOf(i3));
            x02Var.F1(0);
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
        org.telegram.ui.ActionBar.d dVar = x02Var.Z1;
        org.telegram.ui.ActionBar.d dVar2 = x02Var.Z1;
        if (dVar == null) {
            dVar = LaunchActivity.Q();
        }
        if (dVar != null) {
            PhotoViewer.r0().S1(dVar.getParentActivity(), null, this.a);
            PhotoViewer.r0().T1(x02Var);
            PhotoViewer r0 = PhotoViewer.r0();
            int i4 = x02Var.P3;
            boolean z3 = x02Var.Q3;
            r0.h = i4;
            r0.n = z3;
            if (x02Var.z1 && x02Var.A1) {
                mu1Var = (mu1) dVar2;
                i = 11;
            } else {
                if (x02Var.N2 != 0) {
                    i = 1;
                } else if (dVar2 instanceof mu1) {
                    mu1Var = (mu1) dVar2;
                    i = 2;
                } else {
                    i = 5;
                }
                mu1Var = null;
            }
            boolean z4 = x02Var.B1;
            if (z4) {
                i = 13;
                mu1Var2 = null;
            } else {
                mu1Var2 = mu1Var;
            }
            int i5 = i;
            if (x02Var.N2 != 0 || z4) {
                arrayList = new ArrayList<>();
                arrayList.add(jm6Var);
                i2 = 0;
            } else {
                arrayList = getAllPhotosArray();
                i2 = arrayList2.size() - 1;
            }
            ArrayList<Object> arrayList3 = arrayList;
            ul5 ul5Var = x02Var.K1;
            if (ul5Var != null && jm6Var != null) {
                ul5Var.e = jm6Var.b;
            }
            PhotoViewer.r0().n1(arrayList3, i2, i5, false, new t42(this, z), mu1Var2);
            PhotoViewer.r0().F1(x02Var.K1);
            if (x02Var.A1) {
                PhotoViewer.r0().V(null, null, false, x02Var.D1);
                PhotoViewer.r0().t1();
            }
        }
    }

    public final void n0() {
        try {
            if (this.Q != null) {
                CameraController.getInstance().stopPreview(this.Q.getCameraSessionObject());
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // p02
    public final boolean o(MotionEvent motionEvent) {
        b52 b52Var;
        if (!this.e0) {
            if (this.c0 && motionEvent != null) {
                boolean z = this.H0;
                azc azcVar = this.m0;
                if ((!z && motionEvent.getActionMasked() == 0) || motionEvent.getActionMasked() == 5) {
                    Rect rect = this.F0;
                    azcVar.getHitRect(rect);
                    if (azcVar.getTag() == null || !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
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
                    s42 s42Var = this.r;
                    TextView textView = this.q0;
                    Property property = View.ALPHA;
                    ImageView[] imageViewArr = this.T;
                    yc ycVar = this.k0;
                    float f = 1.0f;
                    if (actionMasked == 2) {
                        if (this.D0 && motionEvent.getPointerCount() == 2 && !this.J0) {
                            float hypot = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                            if (this.E0) {
                                if (this.Q != null) {
                                    float L = (hypot - this.B0) / gl.L(100.0f);
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
                                    azcVar.b(false, f);
                                    this.b.b.invalidate();
                                    this.Q.setZoom(this.C0);
                                    w0(true);
                                    return true;
                                }
                            } else if (Math.abs(hypot - this.B0) >= gl.Z0(false, 0.4f)) {
                                this.B0 = hypot;
                                this.E0 = true;
                                return true;
                            }
                        } else {
                            float y = motionEvent.getY();
                            float f3 = y - this.G0;
                            if (this.I0) {
                                if (Math.abs(f3) > gl.Z0(false, 0.4f)) {
                                    this.I0 = false;
                                    this.J0 = true;
                                    return true;
                                }
                            } else if (this.J0 && (b52Var = this.Q) != null) {
                                b52Var.setTranslationY(b52Var.getTranslationY() + f3);
                                this.G0 = y;
                                azcVar.setTag(null);
                                Runnable runnable = this.o0;
                                if (runnable != null) {
                                    gl.r(runnable);
                                    this.o0 = null;
                                }
                                if (ycVar.getTag() == null) {
                                    ycVar.setTag(1);
                                    AnimatorSet animatorSet = new AnimatorSet();
                                    animatorSet.playTogether(ObjectAnimator.ofFloat(ycVar, (Property<yc, Float>) property, 0.0f), ObjectAnimator.ofFloat(azcVar, (Property<azc, Float>) property, 0.0f), ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f), ObjectAnimator.ofFloat(imageViewArr[0], (Property<ImageView, Float>) property, 0.0f), ObjectAnimator.ofFloat(imageViewArr[1], (Property<ImageView, Float>) property, 0.0f), ObjectAnimator.ofFloat(s42Var, (Property<s42, Float>) property, 0.0f));
                                    animatorSet.setDuration(220L);
                                    animatorSet.setInterpolator(s33.f);
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
                            b52 b52Var2 = this.Q;
                            if (b52Var2 != null) {
                                if (Math.abs(b52Var2.getTranslationY()) > this.Q.getMeasuredHeight() / 6.0f) {
                                    b0(true);
                                    return true;
                                }
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.Q, (Property<b52, Float>) View.TRANSLATION_Y, 0.0f), ObjectAnimator.ofFloat(ycVar, (Property<yc, Float>) property, 1.0f), ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 1.0f), ObjectAnimator.ofFloat(imageViewArr[0], (Property<ImageView, Float>) property, 1.0f), ObjectAnimator.ofFloat(imageViewArr[1], (Property<ImageView, Float>) property, 1.0f), ObjectAnimator.ofFloat(s42Var, (Property<s42, Float>) property, 1.0f));
                                animatorSet2.setDuration(250L);
                                animatorSet2.setInterpolator(this.j0);
                                animatorSet2.start();
                                ycVar.setTag(null);
                                return true;
                            }
                        } else {
                            b52 b52Var3 = this.Q;
                            if (b52Var3 != null && !this.E0) {
                                b52Var3.getLocationOnScreen(this.W);
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
        if (this.b.P1) {
            return;
        }
        for (int i = 0; i < 2; i++) {
            this.T[i].animate().alpha(1.0f).translationX(0.0f).setDuration(150L).setInterpolator(s33.f).start();
        }
        ViewPropertyAnimator duration = this.s0.animate().alpha(1.0f).translationX(0.0f).setDuration(150L);
        s33 s33Var = s33.f;
        duration.setInterpolator(s33Var).start();
        this.r0.animate().alpha(1.0f).setDuration(150L).setInterpolator(s33Var).start();
        gl.S3(this.S, false);
        gl.r(this.i0);
        this.i0 = null;
        gl.L3(gl.W(getContext()));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        if (this.T0 != i5) {
            this.T0 = i5;
            e52 e52Var = this.H;
            if (e52Var != null) {
                e52Var.f();
            }
        }
        super.onLayout(z, i, i2, i3, i4);
        W();
    }

    public final void p0() {
        try {
            V(false);
            if (this.Q != null) {
                CameraController.getInstance().startPreview(this.Q.getCameraSessionObject());
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // p02
    public final void q() {
        kk7.e().n(this, kk7.n4);
        kk7.e().n(this, kk7.q2);
    }

    public final void q0() {
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

    @Override // p02
    public final boolean r() {
        if (this.e0) {
            return true;
        }
        if (this.c0) {
            b0(true);
            return true;
        }
        f0(true);
        return false;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.S0) {
            return;
        }
        super.requestLayout();
    }

    @Override // p02
    public final void s(int i) {
        f0((i == 0 || i == 2) ? false : true);
    }

    public final void s0(int i, final boolean z) {
        PhotoViewer r0 = PhotoViewer.r0();
        if (i == -1) {
            i = r0.P4;
        }
        ArrayList arrayList = r0.g7;
        if (arrayList == null || arrayList.isEmpty() || i >= arrayList.size() || !(arrayList.get(i) instanceof jm6) || !((jm6) arrayList.get(i)).M) {
            return;
        }
        final jm6 jm6Var = (jm6) arrayList.get(i);
        this.F.M(new vs2() { // from class: l42
            @Override // vs2
            public final void accept(Object obj) {
                View view = (View) obj;
                boolean z2 = ChatAttachAlertPhotoLayout.r1;
                if (view instanceof o48) {
                    o48 o48Var = (o48) view;
                    if (o48Var.getPhotoEntry() == jm6Var) {
                        o48Var.c(z, Float.valueOf(250.0f));
                        o48Var.f(ChatAttachAlertPhotoLayout.this.getStarsPrice(), ChatAttachAlertPhotoLayout.t1.size() > 1);
                    }
                }
            }
        });
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
        int i3 = gl.q.x;
        x02 x02Var = this.b;
        float width = x02Var.c.getWidth();
        float height = x02Var.c.getHeight();
        float[] fArr = this.V;
        float f4 = fArr[0];
        float f5 = fArr[1];
        float f6 = this.k1;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.Q.getLayoutParams();
        float textureHeight = this.Q.getTextureHeight(f2, f3) / this.Q.getTextureHeight(width, height);
        float f7 = f3 / height;
        float f8 = f2 / width;
        boolean z = this.j1;
        b52 b52Var = this.Q;
        if (z) {
            i = (int) width;
            i2 = (int) height;
            float f9 = 1.0f - f;
            float f10 = (textureHeight * f9) + f;
            b52Var.getTextureView().setScaleX(f10);
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
            b52Var.getTextureView().setScaleX(1.0f);
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
                jm6 jm6Var = (jm6) ((Map.Entry) it.next()).getValue();
                jm6Var.N = j;
                jm6Var.M = j > 0;
                jm6Var.R = false;
            }
        }
        F(getSelectedItemsCount());
        if (X(false)) {
            A0();
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        x02 x02Var = this.b;
        if (x02Var.B0 == 1) {
            float f2 = (f / 40.0f) * (-0.1f);
            s42 s42Var = this.F;
            int childCount = s42Var.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = s42Var.getChildAt(i);
                if (childAt instanceof o48) {
                    o48 o48Var = (o48) childAt;
                    float f3 = 1.0f + f2;
                    o48Var.getCheckBox().setScaleX(f3);
                    o48Var.getCheckBox().setScaleY(f3);
                }
            }
        }
        super.setTranslationY(f);
        x02Var.b.invalidate();
        invalidate();
    }

    public final boolean t0() {
        if (this.z0) {
            return true;
        }
        x02 x02Var = this.b;
        if (x02Var.z1) {
            return false;
        }
        return (x02Var.Z1 instanceof mu1) || x02Var.Q2 || x02Var.N2 == 2;
    }

    @Override // p02
    public final void u() {
        b52 b52Var = this.Q;
        if (b52Var != null) {
            b52Var.setVisibility(8);
        }
        for (Map.Entry entry : t1.entrySet()) {
            if (entry.getValue() instanceof jm6) {
                ((jm6) entry.getValue()).getClass();
            }
        }
        this.H.f();
    }

    public final void u0(ob0 ob0Var, TLRPC.VideoSize videoSize, long j) {
        x02 x02Var = this.b;
        mb0 mb0Var = new mb0(x02Var.O1, x02Var.K1);
        ul5 ul5Var = x02Var.K1;
        mb0Var.R = ul5Var == null || ul5Var.c != 2;
        x02Var.Z1.presentFragment(mb0Var);
        if (ob0Var != null) {
            mb0Var.p0(ob0Var);
        }
        if (videoSize != null) {
            mb0Var.q0(videoSize);
        }
        if (j != 0) {
            mb0Var.o0(j);
        }
        mb0Var.J = new q31((Object) this, (Object) mb0Var, (byte) 23);
    }

    @Override // p02
    public final void v() {
        this.O = true;
        s42 s42Var = this.F;
        int childCount = s42Var.getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            if (s42Var.getChildAt(i) instanceof h48) {
                q0();
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
        ViewPropertyAnimator withEndAction = this.y.animate().alpha(0.0f).setDuration(150L).setInterpolator(s33.j).withEndAction(new j42(this, (byte) 3));
        this.p1 = withEndAction;
        withEndAction.start();
        n0();
    }

    public final void v0() {
        x02 x02Var = this.b;
        if (!x02Var.c4 && this.w0 && CameraView.isCameraAllowed()) {
            if (this.Q == null) {
                boolean z = !e66.e(360928);
                Context context = getContext();
                Boolean bool = this.p0;
                b52 b52Var = new b52(this, context, bool != null ? bool.booleanValue() : x02Var.R3, z);
                this.Q = b52Var;
                org.telegram.ui.ActionBar.d dVar = x02Var.Z1;
                b52Var.setRecordFile(gl.s0((dVar instanceof mu1) && ((mu1) dVar).y()));
                this.Q.setFocusable(true);
                this.Q.setFpsLimit(30);
                this.Q.setOutlineProvider(new cl0(this, (byte) 3));
                this.Q.setClipToOutline(true);
                this.Q.setContentDescription(k96.M0(2131754851, null));
                ww0 ww0Var = x02Var.c;
                b52 b52Var2 = this.Q;
                int i = this.L0;
                ww0Var.addView(b52Var2, 1, new FrameLayout.LayoutParams(i, i));
                this.Q.setDelegate(new u42(this));
                this.Q.setAlpha(this.w0 ? 1.0f : 0.2f);
                this.Q.setEnabled(this.w0);
                if (this.O) {
                    this.Q.setVisibility(8);
                }
                if (!this.c0) {
                    W();
                }
                s42 s42Var = this.F;
                if (s42Var != null) {
                    s42Var.invalidate();
                }
                invalidate();
            }
            azc azcVar = this.m0;
            if (azcVar != null) {
                azcVar.b(false, 0.0f);
                this.C0 = 0.0f;
            }
            if (this.c0) {
                return;
            }
            this.Q.setTranslationX(this.V[0]);
        }
    }

    @Override // p02
    public final void w(float f) {
        b52 b52Var = this.Q;
        if (b52Var != null) {
            b52Var.setAlpha(f);
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
        azc azcVar = this.m0;
        byte b = 1;
        if (azcVar.getTag() != null && z) {
            Runnable runnable = this.o0;
            if (runnable != null) {
                gl.r(runnable);
            }
            j42 j42Var = new j42(this, b);
            this.o0 = j42Var;
            gl.e3(j42Var, 2000L);
            return;
        }
        if (azcVar.getTag() != null || z) {
            AnimatorSet animatorSet = this.n0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            azcVar.setTag(z ? 1 : null);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.n0 = animatorSet2;
            animatorSet2.setDuration(180L);
            this.n0.playTogether(ObjectAnimator.ofFloat(azcVar, (Property<azc, Float>) View.ALPHA, z ? 1.0f : 0.0f));
            this.n0.addListener(new r42(this, b));
            this.n0.start();
            if (z) {
                j42 j42Var2 = new j42(this, (byte) 2);
                this.o0 = j42Var2;
                gl.e3(j42Var2, 2000L);
            }
        }
    }

    @Override // p02
    public final void x(int i) {
        TLRPC.Chat S0;
        boolean z;
        boolean z2;
        char c = 1;
        char c2 = 1;
        char c3 = 1;
        char c4 = 1;
        x02 x02Var = this.b;
        if (i == 8) {
            x02Var.q1(!x02Var.W1, true);
            this.e1.a(!x02Var.W1, true);
            return;
        }
        if ((i == 0 || i == 1) && x02Var.P3 > 0 && u1.size() > 1 && (S0 = x02Var.S0()) != null && !hc2.N(S0) && S0.slowmode_enabled) {
            ij.L(getContext(), k96.M0(2131745118, null), k96.M0(2131745110, null), null, null, this.a).o();
            return;
        }
        wjb wjbVar = this.a;
        HashMap hashMap = t1;
        final byte b = 0;
        if (i == 0) {
            k27 k27Var = x02Var.E3;
            org.telegram.ui.ActionBar.d dVar = x02Var.Z1;
            if (k27Var == null && (dVar instanceof mu1) && ((mu1) dVar).N7()) {
                ij.J(getContext(), ((mu1) dVar).a(), new f42(this, b), wjbVar);
                return;
            } else {
                ij.X(x02Var.G3, x02Var.V0(), x02Var.R0() + hashMap.size(), new p8c(this) { // from class: g42
                    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

                    {
                        this.b = this;
                    }

                    @Override // p8c
                    public final void a(Object obj) {
                        byte b2 = b;
                        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                        Long l = (Long) obj;
                        switch (b2) {
                            case 0:
                                boolean z3 = ChatAttachAlertPhotoLayout.r1;
                                x02 x02Var2 = chatAttachAlertPhotoLayout.b;
                                x02Var2.E0();
                                x02Var2.W3.B1(7, false, true, 0, 0, 0L, x02Var2.a1(), false, l.longValue());
                                break;
                            default:
                                boolean z4 = ChatAttachAlertPhotoLayout.r1;
                                x02 x02Var3 = chatAttachAlertPhotoLayout.b;
                                x02Var3.E0();
                                x02Var3.W3.B1(4, true, true, 0, 0, 0L, x02Var3.a1(), false, l.longValue());
                                break;
                        }
                    }
                });
                return;
            }
        }
        if (i == 1) {
            k27 k27Var2 = x02Var.E3;
            org.telegram.ui.ActionBar.d dVar2 = x02Var.Z1;
            if (k27Var2 == null && (dVar2 instanceof mu1) && ((mu1) dVar2).N7()) {
                ij.J(getContext(), ((mu1) dVar2).a(), new f42(this, c4 == true ? 1 : 0), wjbVar);
                return;
            }
            int i2 = x02Var.G3;
            long V0 = x02Var.V0();
            int R0 = x02Var.R0() + hashMap.size();
            final char c5 = c3 == true ? 1 : 0;
            ij.X(i2, V0, R0, new p8c(this) { // from class: g42
                public final /* synthetic */ ChatAttachAlertPhotoLayout b;

                {
                    this.b = this;
                }

                @Override // p8c
                public final void a(Object obj) {
                    byte b2 = c5;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                    Long l = (Long) obj;
                    switch (b2) {
                        case 0:
                            boolean z3 = ChatAttachAlertPhotoLayout.r1;
                            x02 x02Var2 = chatAttachAlertPhotoLayout.b;
                            x02Var2.E0();
                            x02Var2.W3.B1(7, false, true, 0, 0, 0L, x02Var2.a1(), false, l.longValue());
                            break;
                        default:
                            boolean z4 = ChatAttachAlertPhotoLayout.r1;
                            x02 x02Var3 = chatAttachAlertPhotoLayout.b;
                            x02Var3.E0();
                            x02Var3.W3.B1(4, true, true, 0, 0, 0L, x02Var3.a1(), false, l.longValue());
                            break;
                    }
                }
            });
            return;
        }
        e52 e52Var = this.H;
        s42 s42Var = this.F;
        if (i == 3) {
            m52 m52Var = x02Var.k2;
            if (m52Var != null) {
                m52Var.P();
            }
            Iterator it = hashMap.entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((jm6) ((Map.Entry) it.next()).getValue()).M) {
                        z2 = true;
                        break;
                    }
                } else {
                    z2 = false;
                    break;
                }
            }
            final boolean z3 = !z2;
            gl.e3(new Runnable(this) { // from class: h42
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
                            x02 x02Var2 = chatAttachAlertPhotoLayout.b;
                            a8 a8Var = chatAttachAlertPhotoLayout.Z0;
                            a8Var.setText(k96.M0(z4 ? 2131751418 : 2131751142, null));
                            if (!z4) {
                                a8Var.setAnimatedIcon(R.raw.photo_spoiler);
                                x02Var2.X2.S(1);
                                if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                    x02Var2.X2.S(6);
                                    break;
                                }
                            } else {
                                a8Var.setIcon(R.drawable.msg_spoiler_off);
                                x02Var2.X2.u(1);
                                if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                    x02Var2.X2.u(6);
                                    break;
                                }
                            }
                            break;
                        default:
                            boolean z6 = ChatAttachAlertPhotoLayout.r1;
                            a8 a8Var2 = chatAttachAlertPhotoLayout.b1;
                            a8Var2.setText(k96.M0(z4 ? 2131745428 : 2131745429, null));
                            if (!z4) {
                                a8Var2.setIcon(R.drawable.menu_quality_hd);
                                break;
                            } else {
                                a8Var2.setIcon(R.drawable.menu_quality_sd);
                                break;
                            }
                    }
                }
            }, 200L);
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : hashMap.entrySet()) {
                if (entry.getValue() instanceof jm6) {
                    jm6 jm6Var = (jm6) entry.getValue();
                    jm6Var.M = z3;
                    jm6Var.R = false;
                    arrayList.add(Integer.valueOf(jm6Var.C));
                }
            }
            s42Var.M(new i42(b, arrayList, z3));
            if (x02Var.v2 != this) {
                e52Var.f();
            }
            m52 m52Var2 = x02Var.k2;
            if (m52Var2 != null) {
                m52Var2.w.invalidate();
                return;
            }
            return;
        }
        if (i == 2) {
            m52 m52Var3 = x02Var.k2;
            if (m52Var3 != null) {
                m52Var3.P();
            }
            Iterator it2 = hashMap.entrySet().iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((jm6) ((Map.Entry) it2.next()).getValue()).c()) {
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
            gl.e3(new Runnable(this) { // from class: h42
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
                            x02 x02Var2 = chatAttachAlertPhotoLayout.b;
                            a8 a8Var = chatAttachAlertPhotoLayout.Z0;
                            a8Var.setText(k96.M0(z42 ? 2131751418 : 2131751142, null));
                            if (!z42) {
                                a8Var.setAnimatedIcon(R.raw.photo_spoiler);
                                x02Var2.X2.S(1);
                                if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                    x02Var2.X2.S(6);
                                    break;
                                }
                            } else {
                                a8Var.setIcon(R.drawable.msg_spoiler_off);
                                x02Var2.X2.u(1);
                                if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                    x02Var2.X2.u(6);
                                    break;
                                }
                            }
                            break;
                        default:
                            boolean z6 = ChatAttachAlertPhotoLayout.r1;
                            a8 a8Var2 = chatAttachAlertPhotoLayout.b1;
                            a8Var2.setText(k96.M0(z42 ? 2131745428 : 2131745429, null));
                            if (!z42) {
                                a8Var2.setIcon(R.drawable.menu_quality_hd);
                                break;
                            } else {
                                a8Var2.setIcon(R.drawable.menu_quality_sd);
                                break;
                            }
                    }
                }
            }, 200L);
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry entry2 : hashMap.entrySet()) {
                if (entry2.getValue() instanceof jm6) {
                    jm6 jm6Var2 = (jm6) entry2.getValue();
                    jm6Var2.z = Boolean.valueOf(z4);
                    jm6Var2.R = false;
                    arrayList2.add(Integer.valueOf(jm6Var2.C));
                }
            }
            s42Var.M(new i42(c == true ? 1 : 0, arrayList2, z4));
            if (x02Var.v2 != this) {
                e52Var.f();
            }
            m52 m52Var4 = x02Var.k2;
            if (m52Var4 != null) {
                m52Var4.w.invalidate();
                return;
            }
            return;
        }
        if (i != 4) {
            if (i == 7) {
                x02Var.J1(x02Var.v2 != x02Var.k2);
                return;
            }
            if (i == 9) {
                jva.j1(getContext(), getStarsPrice(), true, new f(this, (byte) 28), this.a);
                return;
            }
            if (i >= 10) {
                xl6 xl6Var = (xl6) this.W0.get(i - 10);
                this.U0 = xl6Var;
                xl6 xl6Var2 = this.V0;
                TextView textView = this.y;
                if (xl6Var == xl6Var2) {
                    textView.setText(k96.M0(2131752226, null));
                } else {
                    textView.setText(xl6Var.c);
                }
                e52Var.f();
                this.w.f();
                this.G.g1(0, -(s42Var.getPaddingTop() - getTopScrollOffset()));
                return;
            }
            return;
        }
        try {
            if (t0()) {
                Intent intent = new Intent();
                intent.setType("video/*");
                intent.setAction("android.intent.action.GET_CONTENT");
                intent.putExtra("android.intent.extra.sizeLimit", 2097152000L);
                Intent intent2 = new Intent("android.intent.action.PICK");
                intent2.setType("image/*");
                Intent createChooser = Intent.createChooser(intent2, null);
                createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", new Intent[]{intent});
                byte b2 = x02Var.N2;
                org.telegram.ui.ActionBar.d dVar3 = x02Var.Z1;
                if (b2 != 0) {
                    dVar3.startActivityForResult(createChooser, 14);
                } else {
                    dVar3.startActivityForResult(createChooser, 1);
                }
            } else {
                Intent intent3 = new Intent("android.intent.action.PICK");
                intent3.setType("image/*");
                byte b3 = x02Var.N2;
                org.telegram.ui.ActionBar.d dVar4 = x02Var.Z1;
                if (b3 != 0) {
                    dVar4.startActivityForResult(intent3, 14);
                } else {
                    dVar4.startActivityForResult(intent3, 1);
                }
            }
            x02Var.a(true);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x0() {
        w42 w42Var = this.x;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = w42Var.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        Object[] objArr = 0;
        if (this.w0) {
            ArrayList arrayList = t0() ? MediaController.c2 : MediaController.d2;
            ArrayList arrayList2 = new ArrayList(arrayList);
            this.W0 = arrayList2;
            Collections.sort(arrayList2, new m42(arrayList, objArr == true ? 1 : 0));
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
            xl6 xl6Var = (xl6) this.W0.get(i);
            kc kcVar = new kc(getContext(), xl6Var.d, xl6Var.c, xl6Var.e.size(), this.a);
            w42Var.getPopupLayout().addView(kcVar);
            kcVar.setOnClickListener(new v0(this, i + 10, (byte) 4));
        }
    }

    @Override // p02
    public final void y() {
        x02 x02Var = this.b;
        V(x02Var != null && (x02Var.Z1 instanceof mu1));
    }

    public final void y0() {
        s42 s42Var = this.F;
        if (s42Var != null) {
            for (int i = 0; i < s42Var.getChildCount(); i++) {
                View childAt = s42Var.getChildAt(i);
                if (childAt instanceof o48) {
                    ((o48) childAt).a.invalidate();
                }
            }
        }
    }

    public final void z0() {
        ArrayList arrayList;
        if (this.b.Z1 instanceof mu1) {
            s42 s42Var = this.F;
            int childCount = s42Var.getChildCount();
            int i = 0;
            while (true) {
                arrayList = u1;
                if (i >= childCount) {
                    break;
                }
                View childAt = s42Var.getChildAt(i);
                if (childAt instanceof o48) {
                    o48 o48Var = (o48) childAt;
                    jm6 d0 = d0(((Integer) o48Var.getTag()).intValue());
                    if (d0 != null) {
                        o48Var.setNum(arrayList.indexOf(Integer.valueOf(d0.C)));
                    }
                }
                i++;
            }
            s42 s42Var2 = this.r;
            int childCount2 = s42Var2.getChildCount();
            for (int i2 = 0; i2 < childCount2; i2++) {
                View childAt2 = s42Var2.getChildAt(i2);
                if (childAt2 instanceof o48) {
                    o48 o48Var2 = (o48) childAt2;
                    jm6 d02 = d0(((Integer) o48Var2.getTag()).intValue());
                    if (d02 != null) {
                        o48Var2.setNum(arrayList.indexOf(Integer.valueOf(d02.C)));
                    }
                }
            }
        }
    }
}
