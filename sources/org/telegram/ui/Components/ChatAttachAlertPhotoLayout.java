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
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public class ChatAttachAlertPhotoLayout extends vh implements org.telegram.messenger.ls {
    public static boolean q1;
    public static final ArrayList r1 = new ArrayList();
    public static final HashMap s1 = new HashMap();
    public static final ArrayList t1 = new ArrayList();
    public static int u1 = -1;
    public float A0;
    public float B0;
    public boolean C0;
    public final Drawable D;
    public boolean D0;
    public final jl E;
    public final Rect E0;
    public final ei.h F;
    public float F0;
    public final tl G;
    public boolean G0;
    public final iy H;
    public boolean H0;
    public final tj0 I;
    public boolean I0;
    public int J;
    public boolean J0;
    public boolean K;
    public int K0;
    public int L;
    public int L0;
    public int M;
    public int M0;
    public boolean N;
    public boolean N0;
    public AnimatorSet O;
    public boolean O0;
    public ql P;
    public boolean P0;
    public final rl Q;
    public boolean Q0;
    public final ol R;
    public boolean R0;
    public final ImageView[] S;
    public int S0;
    public boolean T;
    public org.telegram.messenger.we T0;
    public final float[] U;
    public org.telegram.messenger.we U0;
    public final int[] V;
    public ArrayList V0;
    public float W;
    public float W0;
    public boolean X0;
    public final org.telegram.ui.ActionBar.z0 Y0;
    public final org.telegram.ui.ActionBar.z0 Z0;
    public float a0;
    public final org.telegram.ui.ActionBar.z0 a1;
    public boolean b0;
    public final org.telegram.ui.ActionBar.z0 b1;
    public boolean c0;
    public final org.telegram.ui.ActionBar.z0 c1;
    public boolean d0;
    public final ha0 d1;
    public float e0;
    public final boolean e1;
    public final int[] f0;
    public final h2.f f1;
    public int g0;
    public boolean g1;
    public gl h0;
    public final ml h1;
    public final DecelerateInterpolator i0;
    public boolean i1;
    public final bi.e5 j0;
    public float j1;
    public final ShutterButton k0;
    public float k1;
    public final r71 l0;
    public float l1;
    public AnimatorSet m0;
    public float m1;
    public final boolean n;
    public Runnable n0;
    public float n1;
    public Boolean o0;
    public ViewPropertyAnimator o1;
    public final TextView p0;
    public int p1;
    public final TextView q0;
    public final jl r;
    public final ImageView r0;
    public final jg.b0 s;
    public boolean s0;
    public boolean t0;
    public boolean u0;
    public boolean v0;
    public final tl w;
    public boolean w0;
    public final fi.w2 x;
    public boolean x0;
    public final TextView y;
    public boolean y0;
    public boolean z0;

    /* JADX WARN: Multi-variable type inference failed */
    public ChatAttachAlertPhotoLayout(di diVar, Context context, boolean z9, boolean z10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var, diVar);
        final int i7 = 2;
        this.S = new ImageView[2];
        this.U = new float[2];
        this.V = new int[2];
        this.f0 = new int[5];
        this.i0 = new DecelerateInterpolator(1.5f);
        this.o0 = null;
        this.E0 = new Rect();
        int L = org.telegram.messenger.g0.L(80.0f);
        this.K0 = L;
        this.L0 = L;
        final int i10 = 3;
        this.M0 = 3;
        final int i11 = 1;
        this.X0 = true;
        this.f1 = new h2.f((int[]) null);
        this.h1 = new ml(this);
        this.e1 = z9;
        this.n = z10;
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.r2);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.l4);
        org.telegram.ui.ActionBar.l2 l2Var = diVar.c;
        di diVar2 = this.b;
        final int i12 = 0;
        this.g1 = diVar2.K2 != 0;
        fi.w2 w2Var = new fi.w2(this, context, diVar2.R2.q(), f6Var, 1);
        this.x = w2Var;
        w2Var.setSubMenuOpenSide(1);
        FrameLayout.LayoutParams d = c8.ha.d(-2, -1.0f, 51, 60.0f, 0.0f, 40.0f, 0.0f);
        d.topMargin = org.telegram.messenger.g0.m;
        this.b.R2.addView(w2Var, 0, d);
        w2Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xk
            public final /* synthetic */ ChatAttachAlertPhotoLayout b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ql qlVar;
                ql qlVar2;
                int i13 = i7;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                int i14 = 0;
                switch (i13) {
                    case 0:
                        if (!chatAttachAlertPhotoLayout.s0 && (qlVar = chatAttachAlertPhotoLayout.P) != null && qlVar.isInited()) {
                            chatAttachAlertPhotoLayout.c0 = false;
                            chatAttachAlertPhotoLayout.P.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.r0, (Property<ImageView, Float>) View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new il(chatAttachAlertPhotoLayout, i14));
                            duration.start();
                            break;
                        }
                        break;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.T && (qlVar2 = chatAttachAlertPhotoLayout.P) != null && qlVar2.isInited() && chatAttachAlertPhotoLayout.b0) {
                            String currentFlashMode = chatAttachAlertPhotoLayout.P.getCameraSession().getCurrentFlashMode();
                            String nextFlashMode = chatAttachAlertPhotoLayout.P.getCameraSession().getNextFlashMode();
                            if (!currentFlashMode.equals(nextFlashMode)) {
                                chatAttachAlertPhotoLayout.P.getCameraSession().setCurrentFlashMode(nextFlashMode);
                                chatAttachAlertPhotoLayout.T = true;
                                ImageView[] imageViewArr = chatAttachAlertPhotoLayout.S;
                                ImageView imageView = imageViewArr[0];
                                if (imageView == view) {
                                    imageView = imageViewArr[1];
                                }
                                imageView.setVisibility(0);
                                ChatAttachAlertPhotoLayout.r0(imageView, nextFlashMode);
                                AnimatorSet animatorSet = new AnimatorSet();
                                Property property = View.TRANSLATION_Y;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 0.0f, org.telegram.messenger.g0.L(48.0f));
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, -org.telegram.messenger.g0.L(48.0f), 0.0f);
                                Property property2 = View.ALPHA;
                                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property2, 0.0f, 1.0f));
                                animatorSet.setDuration(220L);
                                animatorSet.setInterpolator(xq.f);
                                animatorSet.addListener(new di.h3(chatAttachAlertPhotoLayout, view, imageView, 4));
                                animatorSet.start();
                                break;
                            }
                        }
                        break;
                    case 2:
                        chatAttachAlertPhotoLayout.x.U(null, null);
                        break;
                    default:
                        if (chatAttachAlertPhotoLayout.P != null) {
                            chatAttachAlertPhotoLayout.m0(null, false, false);
                            CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.P.getCameraSessionObject());
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
        int i13 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.r6.V(textView, i13, f6Var);
        textView.setText(org.telegram.messenger.hd.M0(2131752238, null));
        textView.setTypeface(org.telegram.messenger.g0.o());
        Drawable h = jg.g.h(context, R.drawable.ic_arrow_drop_down);
        this.D = h;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.y(this, h, i13, f6Var, mode);
        textView.setPadding(0, 0, org.telegram.messenger.g0.L(10.0f), 0);
        w2Var.addView(textView, c8.ha.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
        W(false);
        ha0 ha0Var = new ha0(context, R.raw.position_below, org.telegram.messenger.hd.M0(2131752560, null), R.raw.position_above, org.telegram.messenger.hd.M0(2131752559, null), f6Var);
        this.d1 = ha0Var;
        ha0Var.a(!this.b.T1, false);
        this.c1 = this.b.U2.e(7, R.drawable.msg_view_file, org.telegram.messenger.hd.M0(2131753957, null));
        this.b.U2.a(5);
        this.b.U2.e(4, R.drawable.msg_openin, org.telegram.messenger.hd.M0(2131747795, null));
        this.Z0 = this.b.U2.e(1, R.drawable.msg_filehq, org.telegram.messenger.hd.M0(2131745586, null));
        this.b.U2.e(0, R.drawable.msg_ungroup, org.telegram.messenger.hd.M0(2131745585, null));
        this.b.U2.a(6);
        this.Y0 = this.b.U2.e(3, R.drawable.msg_spoiler, org.telegram.messenger.hd.M0(2131751155, null));
        this.a1 = this.b.U2.e(2, R.drawable.menu_quality_hd, org.telegram.messenger.hd.M0(2131745622, null));
        org.telegram.ui.ActionBar.r0 r0Var = this.b.U2;
        r0Var.p();
        ha0Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        ha0Var.setTag(8);
        r0Var.b.addView(ha0Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) ha0Var.getLayoutParams();
        if (org.telegram.messenger.hd.a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = org.telegram.messenger.g0.L(48.0f);
        ha0Var.setLayoutParams(layoutParams);
        ha0Var.setOnClickListener(new org.telegram.ui.ActionBar.z(r0Var, 2));
        this.b1 = this.b.U2.e(9, R.drawable.menu_feature_paid, org.telegram.messenger.hd.M0(2131747729, null));
        this.b.U2.setFitSubItems(true);
        jl jlVar = new jl(this, context, f6Var, i11);
        this.E = jlVar;
        jlVar.setFastScrollEnabled(1);
        jlVar.setFastScrollVisible(true);
        jlVar.getFastScroll().setAlpha(0.0f);
        jlVar.getFastScroll().a = false;
        jlVar.getFastScroll().h0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        tl tlVar = new tl(this, context, z10);
        this.G = tlVar;
        jlVar.setAdapter(tlVar);
        rl rlVar = new rl(this, jlVar);
        this.Q = rlVar;
        jlVar.i(rlVar);
        int i14 = 0;
        for (int i15 = 8; i14 < i15; i15 = 8) {
            tlVar.h.add(tlVar.L());
            i14++;
        }
        jlVar.setClipToPadding(false);
        jlVar.setItemAnimator(null);
        jlVar.setLayoutAnimation(null);
        jlVar.setVerticalScrollBarEnabled(false);
        org.telegram.ui.ActionBar.r6.m(jlVar, 21, org.telegram.ui.ActionBar.k6.A5, f6Var);
        addView(jlVar, c8.ha.d(-1, -1.0f, org.telegram.messenger.qs.E1, 0.0f, 0.0f, 0.0f, -48.0f));
        jlVar.setOnScrollListener(new fi.h8(i11, this));
        ei.h hVar = new ei.h(this, this.K0, i10);
        this.F = hVar;
        int i16 = 7;
        hVar.O = new ai.l(this, i16);
        jlVar.setLayoutManager(hVar);
        jlVar.setOnItemClickListener(new ab.j(this, z10, f6Var, i16));
        jlVar.setOnItemLongClickListener(new yk(this, 2));
        tj0 tj0Var = new tj0(new n(this));
        this.I = tj0Var;
        jlVar.E.add(tj0Var);
        setBlur3Capture(jlVar);
        this.d = jlVar;
        this.f = true;
        iy iyVar = new iy(context, f6Var);
        this.H = iyVar;
        iyVar.setText(org.telegram.messenger.hd.M0(2131748179, null));
        iyVar.setOnTouchListener(null);
        iyVar.setTextSize(16);
        addView(iyVar, c8.ha.c(-2.0f, -1));
        if (this.X0) {
            iyVar.b();
        } else {
            iyVar.c();
        }
        Paint paint = new Paint(1);
        paint.setColor(-2468275);
        ol olVar = new ol(context, paint);
        this.R = olVar;
        org.telegram.messenger.g0.Z3(olVar, false, 1.0f, true, false);
        olVar.setBackgroundResource(R.drawable.system);
        olVar.getBackground().setColorFilter(new PorterDuffColorFilter(1711276032, mode));
        olVar.setTextSize(1, 15.0f);
        olVar.setTypeface(org.telegram.messenger.g0.o());
        olVar.setAlpha(0.0f);
        olVar.setTextColor(-1);
        olVar.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(5.0f));
        l2Var.addView(olVar, c8.ha.d(-2, -2.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
        bi.e5 e5Var = new bi.e5(15, context, this);
        this.j0 = e5Var;
        e5Var.setVisibility(8);
        e5Var.setAlpha(0.0f);
        l2Var.addView(e5Var, c8.ha.e(-1, org.telegram.messenger.qs.K1, 83));
        TextView textView2 = new TextView(context);
        this.p0 = textView2;
        textView2.setBackgroundResource(R.drawable.photos_rounded);
        textView2.setVisibility(8);
        textView2.setTextColor(-1);
        textView2.setGravity(17);
        textView2.setPivotX(0.0f);
        textView2.setPivotY(0.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.photos_arrow, 0);
        textView2.setCompoundDrawablePadding(org.telegram.messenger.g0.L(4.0f));
        textView2.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        l2Var.addView(textView2, c8.ha.d(-2, 38.0f, 51, 0.0f, 0.0f, 0.0f, 116.0f));
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xk
            public final /* synthetic */ ChatAttachAlertPhotoLayout b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ql qlVar;
                ql qlVar2;
                int i132 = i10;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                int i142 = 0;
                switch (i132) {
                    case 0:
                        if (!chatAttachAlertPhotoLayout.s0 && (qlVar = chatAttachAlertPhotoLayout.P) != null && qlVar.isInited()) {
                            chatAttachAlertPhotoLayout.c0 = false;
                            chatAttachAlertPhotoLayout.P.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.r0, (Property<ImageView, Float>) View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new il(chatAttachAlertPhotoLayout, i142));
                            duration.start();
                            break;
                        }
                        break;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.T && (qlVar2 = chatAttachAlertPhotoLayout.P) != null && qlVar2.isInited() && chatAttachAlertPhotoLayout.b0) {
                            String currentFlashMode = chatAttachAlertPhotoLayout.P.getCameraSession().getCurrentFlashMode();
                            String nextFlashMode = chatAttachAlertPhotoLayout.P.getCameraSession().getNextFlashMode();
                            if (!currentFlashMode.equals(nextFlashMode)) {
                                chatAttachAlertPhotoLayout.P.getCameraSession().setCurrentFlashMode(nextFlashMode);
                                chatAttachAlertPhotoLayout.T = true;
                                ImageView[] imageViewArr = chatAttachAlertPhotoLayout.S;
                                ImageView imageView = imageViewArr[0];
                                if (imageView == view) {
                                    imageView = imageViewArr[1];
                                }
                                imageView.setVisibility(0);
                                ChatAttachAlertPhotoLayout.r0(imageView, nextFlashMode);
                                AnimatorSet animatorSet = new AnimatorSet();
                                Property property = View.TRANSLATION_Y;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 0.0f, org.telegram.messenger.g0.L(48.0f));
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, -org.telegram.messenger.g0.L(48.0f), 0.0f);
                                Property property2 = View.ALPHA;
                                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property2, 0.0f, 1.0f));
                                animatorSet.setDuration(220L);
                                animatorSet.setInterpolator(xq.f);
                                animatorSet.addListener(new di.h3(chatAttachAlertPhotoLayout, view, imageView, 4));
                                animatorSet.start();
                                break;
                            }
                        }
                        break;
                    case 2:
                        chatAttachAlertPhotoLayout.x.U(null, null);
                        break;
                    default:
                        if (chatAttachAlertPhotoLayout.P != null) {
                            chatAttachAlertPhotoLayout.m0(null, false, false);
                            CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.P.getCameraSessionObject());
                            break;
                        }
                        break;
                }
            }
        });
        r71 r71Var = new r71(context);
        this.l0 = r71Var;
        r71Var.setVisibility(8);
        r71Var.setAlpha(0.0f);
        l2Var.addView(r71Var, c8.ha.d(-2, 50.0f, 51, 0.0f, 0.0f, 0.0f, 116.0f));
        r71Var.setDelegate(new yk(this, i10));
        ShutterButton shutterButton = new ShutterButton(context);
        shutterButton.b = new DecelerateInterpolator();
        shutterButton.x = new dt(shutterButton, 14);
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
        shutterButton.f = ct0.a;
        this.k0 = shutterButton;
        e5Var.addView(shutterButton, c8.ha.e(84, 84, 17));
        shutterButton.setDelegate(new hl(this, f6Var, l2Var));
        shutterButton.setFocusable(true);
        shutterButton.setContentDescription(org.telegram.messenger.hd.M0(2131754760, null));
        ImageView imageView = new ImageView(context);
        this.r0 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        e5Var.addView(imageView, c8.ha.e(48, 48, 21));
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xk
            public final /* synthetic */ ChatAttachAlertPhotoLayout b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ql qlVar;
                ql qlVar2;
                int i132 = i12;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                int i142 = 0;
                switch (i132) {
                    case 0:
                        if (!chatAttachAlertPhotoLayout.s0 && (qlVar = chatAttachAlertPhotoLayout.P) != null && qlVar.isInited()) {
                            chatAttachAlertPhotoLayout.c0 = false;
                            chatAttachAlertPhotoLayout.P.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.r0, (Property<ImageView, Float>) View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new il(chatAttachAlertPhotoLayout, i142));
                            duration.start();
                            break;
                        }
                        break;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.T && (qlVar2 = chatAttachAlertPhotoLayout.P) != null && qlVar2.isInited() && chatAttachAlertPhotoLayout.b0) {
                            String currentFlashMode = chatAttachAlertPhotoLayout.P.getCameraSession().getCurrentFlashMode();
                            String nextFlashMode = chatAttachAlertPhotoLayout.P.getCameraSession().getNextFlashMode();
                            if (!currentFlashMode.equals(nextFlashMode)) {
                                chatAttachAlertPhotoLayout.P.getCameraSession().setCurrentFlashMode(nextFlashMode);
                                chatAttachAlertPhotoLayout.T = true;
                                ImageView[] imageViewArr = chatAttachAlertPhotoLayout.S;
                                ImageView imageView2 = imageViewArr[0];
                                if (imageView2 == view) {
                                    imageView2 = imageViewArr[1];
                                }
                                imageView2.setVisibility(0);
                                ChatAttachAlertPhotoLayout.r0(imageView2, nextFlashMode);
                                AnimatorSet animatorSet = new AnimatorSet();
                                Property property = View.TRANSLATION_Y;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 0.0f, org.telegram.messenger.g0.L(48.0f));
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, -org.telegram.messenger.g0.L(48.0f), 0.0f);
                                Property property2 = View.ALPHA;
                                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 0.0f, 1.0f));
                                animatorSet.setDuration(220L);
                                animatorSet.setInterpolator(xq.f);
                                animatorSet.addListener(new di.h3(chatAttachAlertPhotoLayout, view, imageView2, 4));
                                animatorSet.start();
                                break;
                            }
                        }
                        break;
                    case 2:
                        chatAttachAlertPhotoLayout.x.U(null, null);
                        break;
                    default:
                        if (chatAttachAlertPhotoLayout.P != null) {
                            chatAttachAlertPhotoLayout.m0(null, false, false);
                            CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.P.getCameraSessionObject());
                            break;
                        }
                        break;
                }
            }
        });
        imageView.setContentDescription(org.telegram.messenger.hd.M0(2131754752, null));
        for (int i17 = 0; i17 < 2; i17++) {
            this.S[i17] = new ImageView(context);
            this.S[i17].setScaleType(ImageView.ScaleType.CENTER);
            this.S[i17].setVisibility(4);
            this.j0.addView(this.S[i17], c8.ha.e(48, 48, 51));
            this.S[i17].setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xk
                public final /* synthetic */ ChatAttachAlertPhotoLayout b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ql qlVar;
                    ql qlVar2;
                    int i132 = i11;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                    int i142 = 0;
                    switch (i132) {
                        case 0:
                            if (!chatAttachAlertPhotoLayout.s0 && (qlVar = chatAttachAlertPhotoLayout.P) != null && qlVar.isInited()) {
                                chatAttachAlertPhotoLayout.c0 = false;
                                chatAttachAlertPhotoLayout.P.switchCamera();
                                ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.r0, (Property<ImageView, Float>) View.SCALE_X, 0.0f).setDuration(100L);
                                duration.addListener(new il(chatAttachAlertPhotoLayout, i142));
                                duration.start();
                                break;
                            }
                            break;
                        case 1:
                            if (!chatAttachAlertPhotoLayout.T && (qlVar2 = chatAttachAlertPhotoLayout.P) != null && qlVar2.isInited() && chatAttachAlertPhotoLayout.b0) {
                                String currentFlashMode = chatAttachAlertPhotoLayout.P.getCameraSession().getCurrentFlashMode();
                                String nextFlashMode = chatAttachAlertPhotoLayout.P.getCameraSession().getNextFlashMode();
                                if (!currentFlashMode.equals(nextFlashMode)) {
                                    chatAttachAlertPhotoLayout.P.getCameraSession().setCurrentFlashMode(nextFlashMode);
                                    chatAttachAlertPhotoLayout.T = true;
                                    ImageView[] imageViewArr = chatAttachAlertPhotoLayout.S;
                                    ImageView imageView2 = imageViewArr[0];
                                    if (imageView2 == view) {
                                        imageView2 = imageViewArr[1];
                                    }
                                    imageView2.setVisibility(0);
                                    ChatAttachAlertPhotoLayout.r0(imageView2, nextFlashMode);
                                    AnimatorSet animatorSet = new AnimatorSet();
                                    Property property = View.TRANSLATION_Y;
                                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 0.0f, org.telegram.messenger.g0.L(48.0f));
                                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, -org.telegram.messenger.g0.L(48.0f), 0.0f);
                                    Property property2 = View.ALPHA;
                                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 0.0f, 1.0f));
                                    animatorSet.setDuration(220L);
                                    animatorSet.setInterpolator(xq.f);
                                    animatorSet.addListener(new di.h3(chatAttachAlertPhotoLayout, view, imageView2, 4));
                                    animatorSet.start();
                                    break;
                                }
                            }
                            break;
                        case 2:
                            chatAttachAlertPhotoLayout.x.U(null, null);
                            break;
                        default:
                            if (chatAttachAlertPhotoLayout.P != null) {
                                chatAttachAlertPhotoLayout.m0(null, false, false);
                                CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.P.getCameraSessionObject());
                                break;
                            }
                            break;
                    }
                }
            });
            this.S[i17].setContentDescription("flash mode " + i17);
        }
        TextView textView3 = new TextView(context);
        this.q0 = textView3;
        textView3.setTextSize(1, 15.0f);
        textView3.setTextColor(-1);
        textView3.setText(org.telegram.messenger.hd.M0(2131744271, null));
        textView3.setShadowLayer(org.telegram.messenger.g0.L(3.33333f), 0.0f, org.telegram.messenger.g0.L(0.666f), 1275068416);
        textView3.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), 0);
        this.j0.addView(textView3, c8.ha.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        jl jlVar2 = new jl(this, context, f6Var, null == true ? 1 : 0);
        this.r = jlVar2;
        jlVar2.setVerticalScrollBarEnabled(true);
        tl tlVar2 = new tl(this, context, false);
        this.w = tlVar2;
        jlVar2.setAdapter(tlVar2);
        for (int i18 = 0; i18 < 8; i18++) {
            tlVar2.h.add(tlVar2.L());
        }
        jlVar2.setClipToPadding(false);
        jlVar2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        jlVar2.setItemAnimator(null);
        jlVar2.setLayoutAnimation(null);
        jlVar2.setOverScrollMode(2);
        jlVar2.setVisibility(4);
        jlVar2.setAlpha(0.0f);
        l2Var.addView(jlVar2, c8.ha.c(80.0f, -1));
        jg.b0 b0Var = new jg.b0(null == true ? 1 : 0, null == true ? 1 : 0, 7);
        this.s = b0Var;
        jlVar2.setLayoutManager(b0Var);
        jlVar2.setOnItemClickListener(new g7(i11));
    }

    public static org.telegram.ui.Cells.q5 O(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i7) {
        jl jlVar = chatAttachAlertPhotoLayout.E;
        int childCount = jlVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = jlVar.getChildAt(i10);
            if (childAt.getTop() < jlVar.getMeasuredHeight() - chatAttachAlertPhotoLayout.b.Z0() && (childAt instanceof org.telegram.ui.Cells.q5)) {
                org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                if (q5Var.getImageView().getTag() != null && ((Integer) q5Var.getImageView().getTag()).intValue() == i7) {
                    return q5Var;
                }
            }
        }
        return null;
    }

    public static int Q(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        di diVar = chatAttachAlertPhotoLayout.b;
        org.telegram.ui.ActionBar.f2 f2Var = diVar.W1;
        return ((f2Var instanceof org.telegram.ui.an) && ((org.telegram.ui.an) f2Var).f4 == 5) ? ((org.telegram.messenger.j0) f2Var.getMessagesController().x7.d0.b).c - ((org.telegram.ui.an) diVar.W1).K6.size() : ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    public static boolean U() {
        HashMap hashMap = s1;
        if (hashMap.isEmpty()) {
            return false;
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (entry.getValue() instanceof org.telegram.messenger.gf) {
                org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) entry.getValue();
                if (gfVar.d() && gfVar.j()) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean V() {
        int i7 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = t1;
            if (i7 >= arrayList.size()) {
                break;
            }
            Object obj = s1.get(arrayList.get(i7));
            if (!TextUtils.isEmpty(obj instanceof org.telegram.messenger.gf ? ((org.telegram.messenger.gf) obj).a : obj instanceof org.telegram.messenger.kf ? ((org.telegram.messenger.kf) obj).I : null)) {
                i10++;
            }
            i7++;
        }
        return i10 <= 1;
    }

    public static boolean f0() {
        HashMap hashMap = s1;
        if (hashMap.isEmpty()) {
            return false;
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if ((entry.getValue() instanceof org.telegram.messenger.gf) && ((org.telegram.messenger.gf) entry.getValue()).d()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTopScrollOffset() {
        return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.L(7.0f) + this.p1;
    }

    public static void r0(ImageView imageView, String str) {
        str.getClass();
        switch (str) {
            case "on":
                imageView.setImageResource(R.drawable.flash_on);
                imageView.setContentDescription(org.telegram.messenger.hd.M0(2131754913, null));
                break;
            case "off":
                imageView.setImageResource(R.drawable.flash_off);
                imageView.setContentDescription(org.telegram.messenger.hd.M0(2131754914, null));
                break;
            case "auto":
                imageView.setImageResource(R.drawable.flash_auto);
                imageView.setContentDescription(org.telegram.messenger.hd.M0(2131754915, null));
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlertKeepScreenOn(boolean z9) {
        Window window = this.b.getWindow();
        if (window == null) {
            return;
        }
        View peekDecorView = window.peekDecorView();
        if (peekDecorView == null || peekDecorView.isAttachedToWindow()) {
            if (z9) {
                window.addFlags(128);
            } else {
                window.clearFlags(128);
            }
        }
    }

    @Override // org.telegram.ui.Components.vh
    public final void A() {
        ShutterButton shutterButton = this.k0;
        if (shutterButton == null) {
            return;
        }
        boolean z9 = this.Q0;
        ct0 ct0Var = ct0.a;
        ct0 ct0Var2 = ct0.b;
        if (z9) {
            if (this.P != null && shutterButton.getState() == ct0Var2) {
                shutterButton.a(ct0Var);
            }
            this.Q0 = false;
            return;
        }
        if (this.P != null && shutterButton.getState() == ct0Var2) {
            o0();
            CameraController.getInstance().stopVideoRecording(this.P.getCameraSession(), false);
            shutterButton.a(ct0Var);
        }
        if (this.b0) {
            d0(false);
        }
        g0(true);
    }

    public final void A0() {
        ArrayList arrayList;
        tl tlVar;
        HashMap hashMap;
        di diVar = this.b;
        org.telegram.ui.ActionBar.f2 f2Var = diVar.W1;
        org.telegram.ui.ActionBar.f2 f2Var2 = diVar.W1;
        if (f2Var instanceof org.telegram.ui.an) {
            jl jlVar = this.E;
            int childCount = jlVar.getChildCount();
            int i7 = 0;
            while (true) {
                arrayList = t1;
                tlVar = this.G;
                hashMap = s1;
                if (i7 >= childCount) {
                    break;
                }
                View childAt = jlVar.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.q5) {
                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                    int R = RecyclerView.R(childAt);
                    if (tlVar.f && R > this.M0) {
                        R--;
                    }
                    if (tlVar.d && this.T0 == this.U0) {
                        R--;
                    }
                    org.telegram.messenger.gf e02 = e0(R);
                    q5Var.setHasSpoiler(e02 != null && e02.M);
                    q5Var.setHighQuality(e02 != null && e02.c());
                    if ((f2Var2 instanceof org.telegram.ui.an) && diVar.N3) {
                        q5Var.b(e02 != null ? arrayList.indexOf(Integer.valueOf(e02.C)) : -1, e02 != null && hashMap.containsKey(Integer.valueOf(e02.C)), true);
                    } else {
                        q5Var.b(-1, e02 != null && hashMap.containsKey(Integer.valueOf(e02.C)), true);
                    }
                }
                i7++;
            }
            jl jlVar2 = this.r;
            int childCount2 = jlVar2.getChildCount();
            for (int i10 = 0; i10 < childCount2; i10++) {
                View childAt2 = jlVar2.getChildAt(i10);
                if (childAt2 instanceof org.telegram.ui.Cells.q5) {
                    org.telegram.ui.Cells.q5 q5Var2 = (org.telegram.ui.Cells.q5) childAt2;
                    int R2 = RecyclerView.R(childAt2);
                    if (tlVar.f && R2 > this.M0) {
                        R2--;
                    }
                    if (tlVar.d && this.T0 == this.U0) {
                        R2--;
                    }
                    org.telegram.messenger.gf e03 = e0(R2);
                    q5Var2.setHasSpoiler(e03 != null && e03.M);
                    q5Var2.setHighQuality(e03 != null && e03.c());
                    if ((f2Var2 instanceof org.telegram.ui.an) && diVar.N3) {
                        q5Var2.b(e03 != null ? arrayList.indexOf(Integer.valueOf(e03.C)) : -1, e03 != null && hashMap.containsKey(Integer.valueOf(e03.C)), true);
                    } else {
                        q5Var2.b(-1, e03 != null && hashMap.containsKey(Integer.valueOf(e03.C)), true);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00db  */
    @Override // org.telegram.ui.Components.vh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i7, int i10) {
        int D;
        int i11;
        int L;
        this.R0 = true;
        int i12 = this.M0;
        if (org.telegram.messenger.g0.Q1()) {
            this.M0 = 4;
        } else {
            Point point = org.telegram.messenger.g0.q;
            if (point.x > point.y) {
                this.M0 = 4;
            } else {
                this.M0 = 3;
            }
        }
        this.p1 = org.telegram.messenger.g0.L(48.0f) + org.telegram.messenger.g0.n;
        jl jlVar = this.E;
        ((FrameLayout.LayoutParams) jlVar.getLayoutParams()).topMargin = -this.p1;
        int L2 = (i7 - org.telegram.messenger.g0.L(4.0f)) - org.telegram.messenger.g0.L(4.0f);
        int i13 = this.M0;
        int i14 = L2 / i13;
        this.K0 = i14;
        if (this.L0 != i14 || i12 != i13) {
            this.L0 = i14;
            org.telegram.messenger.g0.h3(new cl(this, 4));
        }
        this.F.y1(Math.max(1, ((this.M0 - 1) * org.telegram.messenger.g0.L(2.0f)) + (this.K0 * this.M0)));
        tl tlVar = this.G;
        int ceil = (int) Math.ceil((tlVar.b() - 1) / this.M0);
        if (this.P0) {
            D = org.telegram.messenger.g0.L(400.0f);
        } else {
            D = org.telegram.messenger.k5.D(2.0f, ceil - 1, this.K0 * ceil);
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        int b10 = org.telegram.messenger.k5.b(6.0f, (((i10 - D) - currentActionBarHeight) - org.telegram.messenger.g0.n) - org.telegram.messenger.g0.L(12.0f), 0);
        if (this.J != b10) {
            this.J = b10;
            tlVar.f();
        }
        if (!org.telegram.messenger.g0.Q1()) {
            Point point2 = org.telegram.messenger.g0.q;
            if (point2.x > point2.y) {
                i11 = (int) (i10 / 3.5f);
                L = ((i11 + currentActionBarHeight) - org.telegram.messenger.g0.L(52.0f)) + this.p1;
                if (L < 0) {
                    L = 0;
                }
                if (jlVar.getPaddingTop() == L || jlVar.getPaddingBottom() != this.e) {
                    jlVar.setPadding(org.telegram.messenger.g0.L(2.0f), L, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(48.0f) + this.e);
                }
                this.y.setTextSize(17.0f);
                this.R0 = false;
            }
        }
        i11 = (i10 / 5) * 2;
        L = ((i11 + currentActionBarHeight) - org.telegram.messenger.g0.L(52.0f)) + this.p1;
        if (L < 0) {
        }
        if (jlVar.getPaddingTop() == L) {
        }
        jlVar.setPadding(org.telegram.messenger.g0.L(2.0f), L, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(48.0f) + this.e);
        this.y.setTextSize(17.0f);
        this.R0 = false;
    }

    public final void B0(boolean z9) {
        TextView textView = this.p0;
        if (textView != null) {
            di diVar = this.b;
            int i7 = diVar.K2;
            TextView textView2 = diVar.d3;
            if (i7 != 0 || diVar.N2 || diVar.y1) {
                return;
            }
            HashMap hashMap = s1;
            Iterator it = hashMap.entrySet().iterator();
            boolean z10 = false;
            boolean z11 = false;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((org.telegram.messenger.gf) ((Map.Entry) it.next()).getValue()).b) {
                    z10 = true;
                } else {
                    z11 = true;
                }
                if (z10 && z11) {
                    break;
                }
            }
            int max = Math.max(1, hashMap.size());
            if (z10 && z11) {
                textView.setText(org.telegram.messenger.hd.G(hashMap.size(), "Media", new Object[0]).toUpperCase());
                if (max != this.M || z9) {
                    textView2.setText(org.telegram.messenger.hd.G(max, "MediaSelected", new Object[0]));
                }
            } else if (z10) {
                textView.setText(org.telegram.messenger.hd.G(hashMap.size(), "Videos", new Object[0]).toUpperCase());
                if (max != this.M || z9) {
                    textView2.setText(org.telegram.messenger.hd.G(max, "VideosSelected", new Object[0]));
                }
            } else {
                textView.setText(org.telegram.messenger.hd.G(hashMap.size(), "Photos", new Object[0]).toUpperCase());
                if (max != this.M || z9) {
                    textView2.setText(org.telegram.messenger.hd.G(max, "PhotosSelected", new Object[0]));
                }
            }
            boolean z12 = max > 1;
            diVar.D1 = z12;
            diVar.g3.setVisibility((!z12 || diVar.K2 == 2) ? 8 : 0);
            this.M = max;
        }
    }

    @Override // org.telegram.ui.Components.vh
    public final void C() {
        di diVar = this.b;
        if (!diVar.isShowing() || diVar.I || PhotoViewer.p1().P1()) {
            return;
        }
        W(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b7, code lost:
    
        if (((org.telegram.ui.an) r2).z() == false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00be A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01f9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a7  */
    @Override // org.telegram.ui.Components.vh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(int i7) {
        boolean z9;
        boolean z10;
        boolean z11;
        long j3;
        boolean z12;
        boolean z13;
        boolean z14;
        org.telegram.ui.ActionBar.f2 f2Var;
        TLRPC.ChatFull chatFull;
        boolean z15;
        di diVar = this.b;
        if (i7 > 1) {
            org.telegram.messenger.ij ijVar = diVar.B3;
            org.telegram.ui.ActionBar.r0 r0Var = diVar.U2;
            if (ijVar == null) {
                if (getStarsPrice() <= 0) {
                    r0Var.S(0);
                    z9 = true;
                } else {
                    r0Var.t(0);
                    z9 = false;
                }
                if (!this.z0 || getStarsPrice() > 0) {
                    r0Var.t(1);
                    z10 = false;
                    if (i7 != 0) {
                        diVar.U2.t(4);
                    }
                    org.telegram.ui.ActionBar.z0 z0Var = this.Z0;
                    if (i7 <= 1) {
                        diVar.U2.S(5);
                        diVar.U2.S(7);
                        z0Var.setText(org.telegram.messenger.hd.M0(2131745636, null));
                    } else {
                        diVar.U2.t(5);
                        diVar.U2.t(7);
                        if (i7 != 0) {
                            z0Var.setText(org.telegram.messenger.hd.M0(2131745637, null));
                        }
                    }
                    if (i7 > 0 && getStarsPrice() <= 0) {
                        if (diVar != null) {
                            org.telegram.ui.ActionBar.f2 f2Var2 = diVar.W1;
                            if (f2Var2 instanceof org.telegram.ui.an) {
                            }
                        }
                        z11 = true;
                        if (i7 > 0 || diVar == null) {
                            j3 = 0;
                            z12 = z9;
                        } else {
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = diVar.a2;
                            if (chatAttachAlertPhotoLayout == null) {
                                j3 = 0;
                                z15 = false;
                                z12 = z9;
                            } else {
                                HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
                                ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                                if (!selectedPhotos.isEmpty()) {
                                    long j10 = 0;
                                    int i10 = 0;
                                    z15 = false;
                                    loop0: while (true) {
                                        j3 = j10;
                                        z12 = z9;
                                        if (i10 >= Math.ceil(selectedPhotos.size() / 10.0f)) {
                                            break;
                                        }
                                        int i11 = i10 * 10;
                                        int min = Math.min(10, selectedPhotos.size() - i11);
                                        Utilities.b.nextLong();
                                        for (int i12 = 0; i12 < min; i12++) {
                                            int i13 = i11 + i12;
                                            if (i13 < selectedPhotosOrder.size()) {
                                                CharSequence charSequence = ((org.telegram.messenger.gf) selectedPhotos.get(selectedPhotosOrder.get(i13))).a;
                                                String charSequence2 = charSequence == null ? "" : charSequence.toString();
                                                if (diVar.a1() != null && TextUtils.isEmpty(charSequence2) && i12 == 0) {
                                                    charSequence2 = diVar.a1().getText().toString();
                                                }
                                                if (TextUtils.isEmpty(charSequence2)) {
                                                    continue;
                                                } else if (z15) {
                                                    break loop0;
                                                } else {
                                                    z15 = true;
                                                }
                                            }
                                        }
                                        i10++;
                                        j10 = j3;
                                        z9 = z12;
                                    }
                                } else {
                                    j3 = 0;
                                    z12 = z9;
                                }
                                z15 = false;
                            }
                            if (z15 && (diVar.W1 instanceof org.telegram.ui.an)) {
                                z13 = true;
                                if (i7 > 0 && diVar != null) {
                                    f2Var = diVar.W1;
                                    if ((f2Var instanceof org.telegram.ui.an) && org.telegram.messenger.t3.V(((org.telegram.ui.an) f2Var).e) && (chatFull = ((org.telegram.ui.an) f2Var).p8) != null && chatFull.paid_media_allowed) {
                                        z14 = true;
                                        if (!z11) {
                                            String M0 = org.telegram.messenger.hd.M0(2131751155, null);
                                            org.telegram.ui.ActionBar.z0 z0Var2 = this.Y0;
                                            z0Var2.setText(M0);
                                            z0Var2.setAnimatedIcon(R.raw.photo_spoiler);
                                            diVar.U2.t(3);
                                        } else if (diVar != null) {
                                            diVar.U2.S(3);
                                        }
                                        if (diVar != null) {
                                            org.telegram.ui.ActionBar.r0 r0Var2 = diVar.U2;
                                            if (getSelectedPhotosCount() == i7) {
                                                int selectedPhotosHighQualityCount = getSelectedPhotosHighQualityCount();
                                                org.telegram.ui.ActionBar.z0 z0Var3 = this.a1;
                                                if (selectedPhotosHighQualityCount > 0) {
                                                    z0Var3.setText(org.telegram.messenger.hd.M0(2131745621, null));
                                                    z0Var3.setIcon(R.drawable.menu_quality_sd);
                                                } else {
                                                    z0Var3.setText(org.telegram.messenger.hd.M0(2131745622, null));
                                                    z0Var3.setIcon(R.drawable.menu_quality_hd);
                                                }
                                                r0Var2.S(2);
                                            } else {
                                                r0Var2.t(2);
                                            }
                                        }
                                        ha0 ha0Var = this.d1;
                                        if (z13) {
                                            ha0Var.setVisibility(0);
                                        } else {
                                            ha0Var.setVisibility(8);
                                        }
                                        if ((!z11 || z13) && (z10 || z12)) {
                                            diVar.U2.S(6);
                                        } else {
                                            diVar.U2.t(6);
                                        }
                                        if (!z14) {
                                            diVar.U2.t(9);
                                            return;
                                        }
                                        org.telegram.ui.ActionBar.z0 z0Var4 = this.b1;
                                        if (z0Var4 != null) {
                                            long starsPrice = getStarsPrice();
                                            if (starsPrice > j3) {
                                                z0Var4.setText(org.telegram.messenger.hd.M0(2131747727, null));
                                                z0Var4.setSubtext(org.telegram.messenger.hd.G((int) starsPrice, "Stars", new Object[0]));
                                            } else {
                                                z0Var4.setText(org.telegram.messenger.hd.M0(2131747729, null));
                                                z0Var4.setSubtext(null);
                                            }
                                        }
                                        this.E.M(new org.telegram.ui.eq(1));
                                        diVar.U2.S(9);
                                        return;
                                    }
                                }
                                z14 = false;
                                if (!z11) {
                                }
                                if (diVar != null) {
                                }
                                ha0 ha0Var2 = this.d1;
                                if (z13) {
                                }
                                if (z11) {
                                }
                                diVar.U2.S(6);
                                if (!z14) {
                                }
                            }
                        }
                        z13 = false;
                        if (i7 > 0) {
                            f2Var = diVar.W1;
                            if (f2Var instanceof org.telegram.ui.an) {
                                z14 = true;
                                if (!z11) {
                                }
                                if (diVar != null) {
                                }
                                ha0 ha0Var22 = this.d1;
                                if (z13) {
                                }
                                if (z11) {
                                }
                                diVar.U2.S(6);
                                if (!z14) {
                                }
                            }
                        }
                        z14 = false;
                        if (!z11) {
                        }
                        if (diVar != null) {
                        }
                        ha0 ha0Var222 = this.d1;
                        if (z13) {
                        }
                        if (z11) {
                        }
                        diVar.U2.S(6);
                        if (!z14) {
                        }
                    }
                    z11 = false;
                    if (i7 > 0) {
                    }
                    j3 = 0;
                    z12 = z9;
                    z13 = false;
                    if (i7 > 0) {
                    }
                    z14 = false;
                    if (!z11) {
                    }
                    if (diVar != null) {
                    }
                    ha0 ha0Var2222 = this.d1;
                    if (z13) {
                    }
                    if (z11) {
                    }
                    diVar.U2.S(6);
                    if (!z14) {
                    }
                } else {
                    r0Var.S(1);
                    z10 = true;
                    if (i7 != 0) {
                    }
                    org.telegram.ui.ActionBar.z0 z0Var5 = this.Z0;
                    if (i7 <= 1) {
                    }
                    if (i7 > 0) {
                        if (diVar != null) {
                        }
                        z11 = true;
                        if (i7 > 0) {
                        }
                        j3 = 0;
                        z12 = z9;
                        z13 = false;
                        if (i7 > 0) {
                        }
                        z14 = false;
                        if (!z11) {
                        }
                        if (diVar != null) {
                        }
                        ha0 ha0Var22222 = this.d1;
                        if (z13) {
                        }
                        if (z11) {
                        }
                        diVar.U2.S(6);
                        if (!z14) {
                        }
                    }
                    z11 = false;
                    if (i7 > 0) {
                    }
                    j3 = 0;
                    z12 = z9;
                    z13 = false;
                    if (i7 > 0) {
                    }
                    z14 = false;
                    if (!z11) {
                    }
                    if (diVar != null) {
                    }
                    ha0 ha0Var222222 = this.d1;
                    if (z13) {
                    }
                    if (z11) {
                    }
                    diVar.U2.S(6);
                    if (!z14) {
                    }
                }
            }
        }
        org.telegram.ui.ActionBar.r0 r0Var3 = diVar.U2;
        org.telegram.ui.ActionBar.r0 r0Var4 = diVar.U2;
        r0Var3.t(0);
        if (i7 == 0) {
            r0Var4.S(4);
            r0Var4.t(1);
        } else if (this.z0 && getStarsPrice() <= 0 && diVar.B3 == null) {
            r0Var4.S(1);
            z9 = false;
            z10 = true;
            if (i7 != 0) {
            }
            org.telegram.ui.ActionBar.z0 z0Var52 = this.Z0;
            if (i7 <= 1) {
            }
            if (i7 > 0) {
            }
            z11 = false;
            if (i7 > 0) {
            }
            j3 = 0;
            z12 = z9;
            z13 = false;
            if (i7 > 0) {
            }
            z14 = false;
            if (!z11) {
            }
            if (diVar != null) {
            }
            ha0 ha0Var2222222 = this.d1;
            if (z13) {
            }
            if (z11) {
            }
            diVar.U2.S(6);
            if (!z14) {
            }
        } else {
            r0Var4.t(1);
        }
        z9 = false;
        z10 = false;
        if (i7 != 0) {
        }
        org.telegram.ui.ActionBar.z0 z0Var522 = this.Z0;
        if (i7 <= 1) {
        }
        if (i7 > 0) {
        }
        z11 = false;
        if (i7 > 0) {
        }
        j3 = 0;
        z12 = z9;
        z13 = false;
        if (i7 > 0) {
        }
        z14 = false;
        if (!z11) {
        }
        if (diVar != null) {
        }
        ha0 ha0Var22222222 = this.d1;
        if (z13) {
        }
        if (z11) {
        }
        diVar.U2.S(6);
        if (!z14) {
        }
    }

    @Override // org.telegram.ui.Components.vh
    public final boolean G(int i7) {
        if (!this.b0) {
            return false;
        }
        if (i7 != 24 && i7 != 25 && i7 != 79 && i7 != 85) {
            return false;
        }
        ((hl) this.k0.getDelegate()).a();
        return true;
    }

    @Override // org.telegram.ui.Components.vh
    public final void H(vh vhVar) {
        ViewPropertyAnimator viewPropertyAnimator = this.o1;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.x.setVisibility(0);
        boolean z9 = vhVar instanceof bm;
        TextView textView = this.y;
        if (z9) {
            ViewPropertyAnimator interpolator = textView.animate().alpha(1.0f).setDuration(150L).setInterpolator(xq.j);
            this.o1 = interpolator;
            interpolator.start();
        } else {
            c0();
            textView.setAlpha(1.0f);
        }
        this.b.R2.setTitle("");
        this.F.h1(0, 0);
        if (z9) {
            this.E.post(new f(24, this, vhVar));
        }
        X();
        p0();
    }

    @Override // org.telegram.ui.Components.vh
    public final void I() {
        this.N = false;
        ql qlVar = this.P;
        if (qlVar != null) {
            qlVar.setVisibility(0);
        }
        if (this.u0) {
            this.u0 = false;
            W(true);
        }
    }

    @Override // org.telegram.ui.Components.vh
    public final void J() {
        this.E.y0(0);
    }

    public final int S(org.telegram.messenger.gf gfVar, int i7) {
        Integer valueOf = Integer.valueOf(gfVar.C);
        HashMap hashMap = s1;
        boolean containsKey = hashMap.containsKey(valueOf);
        ArrayList arrayList = t1;
        if (containsKey) {
            gfVar.N = 0L;
            gfVar.M = false;
            gfVar.O = null;
            gfVar.z = null;
            hashMap.remove(valueOf);
            int indexOf = arrayList.indexOf(valueOf);
            if (indexOf >= 0) {
                arrayList.remove(indexOf);
            }
            B0(false);
            z0();
            if (i7 >= 0) {
                gfVar.e();
                this.h1.X(i7);
            }
            return indexOf;
        }
        gfVar.N = getStarsPrice();
        gfVar.M = getStarsPrice() > 0;
        gfVar.R = false;
        if (f0()) {
            gfVar.O = Boolean.valueOf(!U());
        }
        gfVar.z = Boolean.valueOf(gfVar.c());
        boolean Z = Z(true);
        hashMap.put(valueOf, gfVar);
        arrayList.add(valueOf);
        if (Z) {
            A0();
            return -1;
        }
        B0(true);
        return -1;
    }

    public final void T() {
        ql qlVar = this.P;
        if (qlVar != null) {
            if (!this.b0) {
                qlVar.setTranslationX(this.U[0]);
            }
            int i7 = this.K0;
            int L = org.telegram.messenger.g0.L(2.0f) + (i7 * 2);
            if (this.b0) {
                return;
            }
            this.P.setClipTop((int) this.W);
            this.P.setClipBottom((int) this.a0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.P.getLayoutParams();
            if (layoutParams.height == L && layoutParams.width == i7) {
                return;
            }
            layoutParams.width = i7;
            layoutParams.height = L;
            this.P.setLayoutParams(layoutParams);
            org.telegram.messenger.g0.h3(new f(25, this, layoutParams));
        }
    }

    public final void W(boolean z9) {
        tl tlVar;
        di diVar = this.b;
        boolean z10 = diVar.M1;
        org.telegram.ui.ActionBar.f2 f2Var = diVar.W1;
        if (z10 || !this.n) {
            return;
        }
        boolean z11 = this.N0;
        boolean z12 = this.O0;
        org.telegram.ui.ActionBar.f2 Q = f2Var == null ? LaunchActivity.Q() : f2Var;
        if (Q == null || Q.getParentActivity() == null) {
            return;
        }
        if (org.telegram.messenger.iz.y0) {
            boolean z13 = Q.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0;
            this.O0 = z13;
            if (z13) {
                if (z9) {
                    try {
                        f2Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE"}, 17);
                    } catch (Exception unused) {
                    }
                }
                this.N0 = false;
            } else {
                if (z9 || org.telegram.messenger.iz.P0) {
                    CameraController.getInstance().initCamera(null);
                }
                this.N0 = CameraController.getInstance().isCameraInitied();
            }
        } else {
            this.N0 = false;
        }
        if ((z11 != this.N0 || z12 != this.O0) && (tlVar = this.G) != null) {
            tlVar.f();
        }
        if (diVar.M1 || !diVar.isShowing() || !this.N0 || ((Paint) diVar.Y.b).getAlpha() == 0 || this.b0) {
            return;
        }
        v0();
    }

    public final void X() {
        v4.d1 K;
        float[] fArr;
        if (PhotoViewer.A1() && PhotoViewer.p1().o5 != null && PhotoViewer.p1().o5.V) {
            return;
        }
        ql qlVar = this.P;
        if (qlVar != null) {
            qlVar.invalidateOutline();
        }
        int i7 = this.M0 - 1;
        jl jlVar = this.E;
        v4.d1 K2 = jlVar.K(i7);
        if (K2 != null) {
            K2.a.invalidateOutline();
        }
        if ((!this.G.d || !this.N0 || this.T0 != this.U0) && (K = jlVar.K(0)) != null) {
            K.a.invalidateOutline();
        }
        ql qlVar2 = this.P;
        if (qlVar2 != null) {
            qlVar2.invalidate();
        }
        ol olVar = this.R;
        if (olVar != null) {
            ((ViewGroup.MarginLayoutParams) olVar.getLayoutParams()).topMargin = getRootWindowInsets() == null ? org.telegram.messenger.g0.L(16.0f) : getRootWindowInsets().getSystemWindowInsetTop() + org.telegram.messenger.g0.L(2.0f);
        }
        if (this.N0) {
            int childCount = jlVar.getChildCount();
            int i10 = 0;
            while (true) {
                fArr = this.U;
                if (i10 >= childCount) {
                    break;
                }
                View childAt = jlVar.getChildAt(i10);
                if (!(childAt instanceof org.telegram.ui.Cells.k5)) {
                    i10++;
                } else if (childAt.isAttachedToWindow()) {
                    float y10 = getY() + jlVar.getY() + childAt.getY();
                    di diVar = this.b;
                    ViewGroup viewGroup = diVar.b;
                    eh ehVar = diVar.s3;
                    bi.x5 x5Var = diVar.I2;
                    float y11 = viewGroup.getY() + y10;
                    float x10 = (diVar.b.getX() + (getX() + (jlVar.getX() + childAt.getX()))) - getRootWindowInsets().getSystemWindowInsetLeft();
                    float alpha = (x5Var.getAlpha() * x5Var.getMeasuredHeight()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (!diVar.X1 ? org.telegram.messenger.g0.m : 0);
                    fi.i iVar = diVar.y4;
                    if (iVar != null && iVar.g()) {
                        alpha = Math.max(alpha, (diVar.y4.e() + diVar.y4.getY()) - diVar.f4);
                    }
                    float f10 = y10 < alpha ? alpha - y10 : 0.0f;
                    if (f10 != this.W) {
                        this.W = f10;
                        ql qlVar3 = this.P;
                        if (qlVar3 != null) {
                            qlVar3.invalidateOutline();
                            this.P.invalidate();
                        }
                    }
                    float translationY = (int) (ehVar.getTranslationY() + (diVar.b.getMeasuredHeight() - ehVar.getMeasuredHeight()));
                    fi.i iVar2 = diVar.y4;
                    if (iVar2 != null) {
                        translationY -= iVar2.d() - org.telegram.messenger.g0.L(6.0f);
                    }
                    if (childAt.getMeasuredHeight() + y10 > translationY) {
                        this.a0 = Math.min(-org.telegram.messenger.g0.L(5.0f), y10 - translationY) + childAt.getMeasuredHeight();
                    } else {
                        this.a0 = 0.0f;
                    }
                    fArr[0] = x10;
                    fArr[1] = y11;
                    T();
                    return;
                }
            }
            if (this.W != 0.0f) {
                this.W = 0.0f;
                ql qlVar4 = this.P;
                if (qlVar4 != null) {
                    qlVar4.invalidateOutline();
                    this.P.invalidate();
                }
            }
            fArr[0] = org.telegram.messenger.g0.L(-400.0f);
            fArr[1] = 0.0f;
            T();
        }
    }

    public final boolean Z(boolean z9) {
        if (getStarsPrice() <= 0) {
            return false;
        }
        boolean z10 = false;
        while (true) {
            HashMap hashMap = s1;
            if (hashMap.size() <= 10 - (z9 ? 1 : 0)) {
                break;
            }
            ArrayList arrayList = t1;
            if (arrayList.isEmpty()) {
                break;
            }
            Object obj = hashMap.get(arrayList.get(0));
            if (!(obj instanceof org.telegram.messenger.gf)) {
                break;
            }
            S((org.telegram.messenger.gf) obj, -1);
            z10 = true;
        }
        return z10;
    }

    @Override // org.telegram.ui.Components.vh
    public final void a(CharSequence charSequence) {
        Object obj;
        int i7 = 0;
        while (true) {
            ArrayList arrayList = t1;
            if (i7 >= arrayList.size()) {
                return;
            }
            if (i7 == 0) {
                Object obj2 = arrayList.get(i7);
                HashMap hashMap = s1;
                Object obj3 = hashMap.get(obj2);
                if (obj3 instanceof org.telegram.messenger.gf) {
                    org.telegram.messenger.gf clone = ((org.telegram.messenger.gf) obj3).clone();
                    CharSequence[] charSequenceArr = {charSequence};
                    clone.n = org.telegram.messenger.ui.b0(org.telegram.messenger.p10.s0).W(charSequenceArr, false, true);
                    clone.a = charSequenceArr[0];
                    obj = clone;
                } else {
                    boolean z9 = obj3 instanceof org.telegram.messenger.kf;
                    obj = obj3;
                    if (z9) {
                        org.telegram.messenger.kf clone2 = ((org.telegram.messenger.kf) obj3).clone();
                        CharSequence[] charSequenceArr2 = {charSequence};
                        clone2.n = org.telegram.messenger.ui.b0(org.telegram.messenger.p10.s0).W(charSequenceArr2, false, true);
                        clone2.I = charSequenceArr2[0];
                        obj = clone2;
                    }
                }
                hashMap.put(obj2, obj);
            }
            i7++;
        }
    }

    public final boolean a0(org.telegram.messenger.gf gfVar) {
        boolean z9 = this.w0;
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        di diVar = this.b;
        if (z9 || !gfVar.b) {
            if (this.x0 || gfVar.b) {
                return false;
            }
            if (!diVar.N0()) {
                org.telegram.messenger.k5.p(null, 2131749541, new hc(diVar.l3, f6Var), null);
                return true;
            }
        } else if (!diVar.N0()) {
            org.telegram.messenger.k5.p(null, 2131749537, new hc(diVar.l3, f6Var), null);
            return true;
        }
        return true;
    }

    @Override // org.telegram.ui.Components.vh
    public final boolean b() {
        return !this.b0;
    }

    public final void b0() {
        if (this.P0) {
            boolean h02 = h0();
            this.P0 = h02;
            if (!h02) {
                i0();
            }
            this.G.f();
            this.w.f();
        }
    }

    @Override // org.telegram.ui.Components.vh
    public final boolean c() {
        Iterator it = s1.entrySet().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof org.telegram.messenger.gf) {
                if (((org.telegram.messenger.gf) value).x != 0) {
                    return false;
                }
            } else if ((value instanceof org.telegram.messenger.kf) && ((org.telegram.messenger.kf) value).x != 0) {
                return false;
            }
        }
        return true;
    }

    public final void c0() {
        String M0 = org.telegram.messenger.hd.M0(2131751155, null);
        org.telegram.ui.ActionBar.z0 z0Var = this.Y0;
        z0Var.setText(M0);
        z0Var.setAnimatedIcon(R.raw.photo_spoiler);
        this.b.U2.S(1);
        HashMap hashMap = s1;
        if (!hashMap.isEmpty()) {
            Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                ((org.telegram.messenger.gf) ((Map.Entry) it.next()).getValue()).e();
            }
            hashMap.clear();
            t1.clear();
        }
        ArrayList arrayList = r1;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) arrayList.get(i7);
                new File(gfVar.I).delete();
                if (gfVar.h != null) {
                    new File(gfVar.h).delete();
                }
                if (gfVar.c != null) {
                    new File(gfVar.c).delete();
                }
            }
            arrayList.clear();
        }
        this.G.f();
        this.w.f();
    }

    @Override // org.telegram.ui.Components.vh
    public final void d() {
        boolean z9 = this.e1;
        int i7 = z9 ? org.telegram.ui.ActionBar.k6.Vg : org.telegram.ui.ActionBar.k6.j5;
        int i10 = org.telegram.ui.ActionBar.k6.c7;
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        this.H.setTextColor(org.telegram.ui.ActionBar.k6.w0(i10, f6Var));
        int i11 = org.telegram.ui.ActionBar.k6.A5;
        jl jlVar = this.E;
        org.telegram.ui.ActionBar.r6.I(jlVar, i11, f6Var);
        jlVar.K(0);
        org.telegram.ui.ActionBar.r6.V(this.y, i7, f6Var);
        int w02 = org.telegram.ui.ActionBar.k6.w0(z9 ? org.telegram.ui.ActionBar.k6.Vg : org.telegram.ui.ActionBar.k6.E8, f6Var);
        fi.w2 w2Var = this.x;
        w2Var.O(w02, false);
        w2Var.O(org.telegram.ui.ActionBar.k6.w0(z9 ? org.telegram.ui.ActionBar.k6.Vg : org.telegram.ui.ActionBar.k6.E8, f6Var), true);
        w2Var.H(org.telegram.ui.ActionBar.k6.w0(z9 ? org.telegram.ui.ActionBar.k6.Xg : org.telegram.ui.ActionBar.k6.G8, f6Var));
        org.telegram.ui.ActionBar.k6.C1(org.telegram.ui.ActionBar.k6.w0(i7, f6Var), this.D);
    }

    public final void d0(boolean z9) {
        ql qlVar;
        if (this.s0 || this.P == null) {
            return;
        }
        int i7 = this.K0;
        int[] iArr = this.f0;
        iArr[1] = i7;
        iArr[2] = org.telegram.messenger.g0.L(2.0f) + (i7 * 2);
        Runnable runnable = this.n0;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.n0 = null;
        }
        org.telegram.messenger.g0.n3(this.b, ((double) org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, this.a))) > 0.721d);
        TextView textView = this.p0;
        jl jlVar = this.r;
        bi.e5 e5Var = this.j0;
        jl jlVar2 = this.E;
        ImageView[] imageViewArr = this.S;
        r71 r71Var = this.l0;
        if (z9) {
            this.j1 = this.P.getTranslationY();
            this.d0 = true;
            if (jlVar2 != null) {
                jlVar2.invalidate();
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this, "cameraOpenProgress", 0.0f));
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(e5Var, (Property<bi.e5, Float>) property, 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(r71Var, (Property<r71, Float>) property, 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(jlVar, (Property<jl, Float>) property, 0.0f));
            int i10 = 0;
            while (true) {
                if (i10 >= 2) {
                    break;
                }
                if (imageViewArr[i10].getVisibility() == 0) {
                    arrayList.add(ObjectAnimator.ofFloat(imageViewArr[i10], (Property<ImageView, Float>) property, 0.0f));
                    break;
                }
                i10++;
            }
            this.f1.d();
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(220L);
            animatorSet.setInterpolator(xq.f);
            animatorSet.addListener(new il(this, 3));
            animatorSet.start();
        } else {
            this.i1 = false;
            setAlertKeepScreenOn(false);
            setCameraOpenProgress(0.0f);
            iArr[0] = 0;
            setCameraOpenProgress(0.0f);
            e5Var.setAlpha(0.0f);
            e5Var.setVisibility(8);
            r71Var.setAlpha(0.0f);
            r71Var.setTag(null);
            r71Var.setVisibility(8);
            jlVar.setAlpha(0.0f);
            textView.setAlpha(0.0f);
            jlVar.setVisibility(8);
            int i11 = 0;
            while (true) {
                if (i11 >= 2) {
                    break;
                }
                if (imageViewArr[i11].getVisibility() == 0) {
                    imageViewArr[i11].setAlpha(0.0f);
                    break;
                }
                i11++;
            }
            this.b0 = false;
            ql qlVar2 = this.P;
            if (qlVar2 != null) {
                qlVar2.setFpsLimit(30);
                this.P.setSystemUiVisibility(1024);
            }
            if (jlVar2 != null) {
                jlVar2.invalidate();
            }
        }
        ql qlVar3 = this.P;
        if (qlVar3 != null) {
            qlVar3.setImportantForAccessibility(0);
        }
        jlVar2.setImportantForAccessibility(0);
        if (org.telegram.messenger.rc.e(360928) || (qlVar = this.P) == null) {
            return;
        }
        qlVar.showTexture(false, z9);
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        di diVar;
        if (i7 != org.telegram.messenger.qs.r2) {
            if (i7 == org.telegram.messenger.qs.l4) {
                W(false);
                return;
            }
            return;
        }
        tl tlVar = this.G;
        if (tlVar != null) {
            if (t0()) {
                this.U0 = MediaController.Z1;
            } else {
                this.U0 = MediaController.a2;
            }
            if (this.T0 == null || ((diVar = this.b) != null && diVar.x1)) {
                this.T0 = this.U0;
            } else if (t0()) {
                int i11 = 0;
                while (true) {
                    if (i11 >= MediaController.b2.size()) {
                        break;
                    }
                    org.telegram.messenger.we weVar = (org.telegram.messenger.we) MediaController.b2.get(i11);
                    int i12 = weVar.a;
                    org.telegram.messenger.we weVar2 = this.T0;
                    if (i12 == weVar2.a && weVar.b == weVar2.b) {
                        this.T0 = weVar;
                        break;
                    }
                    i11++;
                }
            }
            this.X0 = false;
            this.H.c();
            tlVar.f();
            this.w.f();
            ArrayList arrayList = t1;
            if (!arrayList.isEmpty() && this.U0 != null) {
                int size = arrayList.size();
                for (int i13 = 0; i13 < size; i13++) {
                    Integer num = (Integer) arrayList.get(i13);
                    HashMap hashMap = s1;
                    Object obj = hashMap.get(num);
                    org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) this.U0.f.get(num.intValue());
                    if (gfVar != null) {
                        if (obj instanceof org.telegram.messenger.gf) {
                            gfVar.g((org.telegram.messenger.gf) obj);
                        }
                        hashMap.put(num, gfVar);
                    }
                }
            }
            x0();
        }
    }

    public final org.telegram.messenger.gf e0(int i7) {
        if (i7 < 0) {
            return null;
        }
        ArrayList arrayList = r1;
        int size = arrayList.size();
        if (i7 < size) {
            return (org.telegram.messenger.gf) arrayList.get(i7);
        }
        int i10 = i7 - size;
        org.telegram.messenger.we weVar = this.T0;
        if (weVar == null || i10 >= weVar.e.size()) {
            return null;
        }
        return (org.telegram.messenger.gf) this.T0.e.get(i10);
    }

    public final void g0(boolean z9) {
        if (!this.N0 || this.P == null) {
            return;
        }
        q0();
        this.Q.i();
        this.P.destroy(z9, null);
        AnimatorSet animatorSet = this.O;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.O = null;
        }
        org.telegram.messenger.g0.i3(new cl(this, 0), 300L);
        this.c0 = false;
    }

    public ArrayList<Object> getAllPhotosArray() {
        org.telegram.messenger.we weVar = this.T0;
        ArrayList<Object> arrayList = r1;
        if (weVar == null) {
            return !arrayList.isEmpty() ? arrayList : new ArrayList<>(0);
        }
        if (arrayList.isEmpty()) {
            return this.T0.e;
        }
        ArrayList<Object> arrayList2 = new ArrayList<>(arrayList.size() + this.T0.e.size());
        arrayList2.addAll(arrayList);
        arrayList2.addAll(this.T0.e);
        return arrayList2;
    }

    @Override // org.telegram.ui.Components.vh
    public int getButtonsHideOffset() {
        return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + super.getButtonsHideOffset();
    }

    public float getCameraOpenProgress() {
        return this.e0;
    }

    @Override // org.telegram.ui.Components.vh
    public int getCurrentItemTop() {
        jl jlVar = this.E;
        int childCount = jlVar.getChildCount();
        iy iyVar = this.H;
        if (childCount <= 0) {
            jlVar.setTopGlowOffset(jlVar.getPaddingTop());
            iyVar.setTranslationY(0.0f);
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = jlVar.getChildAt(0);
        xi0 xi0Var = (xi0) jlVar.G(childAt);
        int top = childAt.getTop() - this.p1;
        int L = org.telegram.messenger.g0.L(7.0f);
        if (top < org.telegram.messenger.g0.L(7.0f) || xi0Var == null || xi0Var.b() != 0) {
            top = L;
        }
        iyVar.setTranslationY(((((getMeasuredHeight() - top) - org.telegram.messenger.g0.L(50.0f)) - iyVar.getMeasuredHeight()) / 2.0f) + top);
        jlVar.setTopGlowOffset(top);
        return top;
    }

    @Override // org.telegram.ui.Components.vh
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.vh
    public int getListTopPadding() {
        return this.E.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.vh
    public int getSelectedItemsCount() {
        return t1.size();
    }

    public HashMap<Object, Object> getSelectedPhotos() {
        return s1;
    }

    public int getSelectedPhotosCount() {
        int i7 = 0;
        for (Object obj : s1.values()) {
            if (obj instanceof org.telegram.messenger.gf) {
                org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) obj;
                if (!gfVar.b && gfVar.s == null) {
                    i7++;
                }
            }
        }
        return i7;
    }

    public int getSelectedPhotosHighQualityCount() {
        int i7 = 0;
        for (Object obj : s1.values()) {
            if (obj instanceof org.telegram.messenger.gf) {
                org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) obj;
                if (gfVar.c() && !gfVar.b && gfVar.s == null) {
                    i7++;
                }
            }
        }
        return i7;
    }

    public ArrayList<Object> getSelectedPhotosOrder() {
        return t1;
    }

    public long getStarsPrice() {
        Iterator it = s1.entrySet().iterator();
        if (it.hasNext()) {
            return ((org.telegram.messenger.gf) ((Map.Entry) it.next()).getValue()).N;
        }
        return 0L;
    }

    public final boolean h0() {
        Activity W = org.telegram.messenger.g0.W(getContext());
        if (W == null) {
            W = this.b.W1.getParentActivity();
        }
        int i7 = Build.VERSION.SDK_INT;
        if (W == null) {
            return true;
        }
        if (i7 < 33 || (W.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0 && W.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0)) {
            return i7 < 33 && W.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0;
        }
        return true;
    }

    public final void i0() {
        if ((t0() ? MediaController.Z1 : MediaController.a2) == null) {
            MediaController.O(0);
        }
    }

    @Override // org.telegram.ui.Components.vh
    public final int j() {
        return 1;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:22|(1:24)|(1:29)|(6:31|(5:33|(1:35)|36|(1:38)|(1:40))|98|42|(1:97)|46)(1:99)|(1:96)(1:51)|52|(2:53|(2:54|55))|(4:57|58|(2:60|61)|63)|64|65|66|67|68|69) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ce, code lost:
    
        if (a8.p0.B(r13) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0163, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0164, code lost:
    
        org.telegram.messenger.a8.g(r0, true);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x0120 -> B:62:0x0131). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j0(int i7, Intent intent, String str) {
        String str2;
        String str3;
        Throwable th2;
        MediaMetadataRetriever mediaMetadataRetriever;
        MediaMetadataRetriever mediaMetadataRetriever2;
        int i10;
        int i11;
        di diVar = this.b;
        boolean z9 = diVar.M1;
        org.telegram.ui.ActionBar.f2 f2Var = diVar.W1;
        if (z9) {
            return;
        }
        q1 = true;
        File file = null;
        MediaMetadataRetriever mediaMetadataRetriever3 = null;
        if (i7 == 0) {
            PhotoViewer.p1().H2(f2Var.getParentActivity(), null, this.a);
            PhotoViewer p12 = PhotoViewer.p1();
            int i12 = diVar.M3;
            boolean z10 = diVar.N3;
            p12.h = i12;
            p12.n = z10;
            Pair N0 = org.telegram.messenger.g0.N0(str);
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(new File(str).getAbsolutePath(), options);
                i10 = options.outWidth;
                try {
                    i11 = options.outHeight;
                } catch (Exception unused) {
                    i11 = 0;
                    int i13 = i10;
                    int i14 = u1;
                    u1 = i14 - 1;
                    org.telegram.messenger.gf gfVar = new org.telegram.messenger.gf(i14, str, ((Integer) N0.first).intValue(), false, i13, i11);
                    gfVar.n(N0);
                    gfVar.L = true;
                    m0(gfVar, false, true);
                    return;
                }
            } catch (Exception unused2) {
                i10 = 0;
            }
            int i132 = i10;
            int i142 = u1;
            u1 = i142 - 1;
            org.telegram.messenger.gf gfVar2 = new org.telegram.messenger.gf(i142, str, ((Integer) N0.first).intValue(), false, i132, i11);
            gfVar2.n(N0);
            gfVar2.L = true;
            m0(gfVar2, false, true);
            return;
        }
        if (i7 == 2) {
            if (org.telegram.messenger.r2.a) {
                org.telegram.messenger.a8.b("pic path " + str);
            }
            if (intent != null && str != null && a8.p0.B(str)) {
                intent = null;
            }
            if (intent != null) {
                Uri data = intent.getData();
                if (data != null) {
                    if (org.telegram.messenger.r2.a) {
                        org.telegram.messenger.a8.b("video record uri " + data.toString());
                    }
                    str2 = org.telegram.messenger.g0.T0(data);
                    if (org.telegram.messenger.r2.a) {
                        org.telegram.messenger.a8.b("resolved path = " + str2);
                    }
                    if (str2 != null) {
                    }
                }
                str2 = str;
                if (!(f2Var instanceof org.telegram.ui.an) || !((org.telegram.ui.an) f2Var).z()) {
                    org.telegram.messenger.g0.e(str);
                }
                str3 = null;
            } else {
                str2 = null;
                str3 = str;
            }
            String str4 = (str2 == null && str3 != null && a8.p0.B(str3)) ? str3 : str2;
            try {
                try {
                    try {
                        mediaMetadataRetriever2 = new MediaMetadataRetriever();
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            } catch (Throwable th3) {
                th2 = th3;
                mediaMetadataRetriever = file;
            }
            try {
                mediaMetadataRetriever2.setDataSource(str4);
                r13 = mediaMetadataRetriever2.extractMetadata(9) != null ? (int) Math.ceil(Long.parseLong(r0) / 1000.0f) : 0L;
                mediaMetadataRetriever2.release();
            } catch (Exception e12) {
                e = e12;
                mediaMetadataRetriever3 = mediaMetadataRetriever2;
                org.telegram.messenger.a8.g(e, true);
                if (mediaMetadataRetriever3 != null) {
                    mediaMetadataRetriever3.release();
                }
                Bitmap r10 = org.telegram.messenger.gz.r(1, str4);
                String str5 = "-2147483648_" + org.telegram.messenger.iz.p() + ".jpg";
                file = org.telegram.messenger.w7.z(4);
                File file2 = new File(file, str5);
                r10.compress(Bitmap.CompressFormat.JPEG, 55, new FileOutputStream(file2));
                org.telegram.messenger.iz.y();
                int i15 = u1;
                u1 = i15 - 1;
                org.telegram.messenger.gf gfVar3 = new org.telegram.messenger.gf(i15, str4, 0, true, r10.getWidth(), r10.getHeight());
                gfVar3.E = (int) r13;
                gfVar3.c = file2.getAbsolutePath();
                m0(gfVar3, false, true);
            } catch (Throwable th4) {
                th2 = th4;
                mediaMetadataRetriever = mediaMetadataRetriever2;
                if (mediaMetadataRetriever == 0) {
                    throw th2;
                }
                try {
                    mediaMetadataRetriever.release();
                    throw th2;
                } catch (Exception e13) {
                    org.telegram.messenger.a8.g(e13, true);
                    throw th2;
                }
            }
            Bitmap r102 = org.telegram.messenger.gz.r(1, str4);
            String str52 = "-2147483648_" + org.telegram.messenger.iz.p() + ".jpg";
            file = org.telegram.messenger.w7.z(4);
            File file22 = new File(file, str52);
            r102.compress(Bitmap.CompressFormat.JPEG, 55, new FileOutputStream(file22));
            org.telegram.messenger.iz.y();
            int i152 = u1;
            u1 = i152 - 1;
            org.telegram.messenger.gf gfVar32 = new org.telegram.messenger.gf(i152, str4, 0, true, r102.getWidth(), r102.getHeight());
            gfVar32.E = (int) r13;
            gfVar32.c = file22.getAbsolutePath();
            m0(gfVar32, false, true);
        }
    }

    public final void k0(boolean z9) {
        ql qlVar;
        ql qlVar2 = this.P;
        if (qlVar2 == null || this.O != null) {
            return;
        }
        di diVar = this.b;
        if (diVar.I) {
            return;
        }
        qlVar2.initTexture();
        boolean t02 = t0();
        TextView textView = this.q0;
        int i7 = 0;
        if (t02) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        boolean isEmpty = r1.isEmpty();
        jl jlVar = this.r;
        TextView textView2 = this.p0;
        if (isEmpty) {
            textView2.setVisibility(4);
            jlVar.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            jlVar.setVisibility(0);
        }
        if (diVar.a1().w && isFocusable()) {
            diVar.a1().d();
        }
        r71 r71Var = this.l0;
        r71Var.setVisibility(0);
        r71Var.setAlpha(0.0f);
        bi.e5 e5Var = this.j0;
        e5Var.setVisibility(0);
        e5Var.setTag(null);
        int[] iArr = this.f0;
        iArr[0] = 0;
        int i10 = this.K0;
        iArr[1] = i10;
        int i11 = 2;
        iArr[2] = org.telegram.messenger.g0.L(2.0f) + (i10 * 2);
        this.j1 = 0.0f;
        this.i1 = true;
        ql qlVar3 = this.P;
        if (qlVar3 != null) {
            qlVar3.setFpsLimit(-1);
        }
        org.telegram.messenger.g0.v1(this);
        org.telegram.messenger.g0.n3(diVar, false);
        setAlertKeepScreenOn(true);
        jl jlVar2 = this.E;
        ImageView[] imageViewArr = this.S;
        if (z9) {
            setCameraOpenProgress(0.0f);
            this.d0 = true;
            if (jlVar2 != null) {
                jlVar2.invalidate();
            }
            this.f1.d();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this, "cameraOpenProgress", 0.0f, 1.0f));
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(e5Var, (Property<bi.e5, Float>) property, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(jlVar, (Property<jl, Float>) property, 1.0f));
            int i12 = 0;
            while (true) {
                if (i12 >= 2) {
                    break;
                }
                if (imageViewArr[i12].getVisibility() == 0) {
                    arrayList.add(ObjectAnimator.ofFloat(imageViewArr[i12], (Property<ImageView, Float>) property, 1.0f));
                    break;
                }
                i12++;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(350L);
            animatorSet.setInterpolator(xq.f);
            animatorSet.addListener(new il(this, i11));
            animatorSet.start();
        } else {
            setCameraOpenProgress(1.0f);
            e5Var.setAlpha(1.0f);
            textView2.setAlpha(1.0f);
            jlVar.setAlpha(1.0f);
            while (true) {
                if (i7 >= 2) {
                    break;
                }
                if (imageViewArr[i7].getVisibility() == 0) {
                    imageViewArr[i7].setAlpha(1.0f);
                    break;
                }
                i7++;
            }
            diVar.T3.F0();
            ql qlVar4 = this.P;
            if (qlVar4 != null) {
                qlVar4.setSystemUiVisibility(1028);
            }
        }
        this.b0 = true;
        ql qlVar5 = this.P;
        if (qlVar5 != null) {
            qlVar5.setImportantForAccessibility(2);
        }
        jlVar2.setImportantForAccessibility(4);
        jlVar2.invalidate();
        if (org.telegram.messenger.rc.e(360928) || (qlVar = this.P) == null || !qlVar.isInited()) {
            return;
        }
        this.P.showTexture(true, z9);
    }

    @Override // org.telegram.ui.Components.vh
    public final void l() {
        X();
        invalidate();
    }

    public final void l0() {
        if (org.telegram.messenger.iz.y0) {
            k0(true);
            return;
        }
        di diVar = this.b;
        bi biVar = diVar.T3;
        if (biVar != null) {
            biVar.o1(0, false, true, 0, 0, 0L, diVar.f1(), false, 0L);
        }
    }

    @Override // org.telegram.ui.Components.vh
    public final void m(float f10) {
        this.W0 = f10;
        X();
        ql qlVar = this.P;
        if (qlVar != null) {
            qlVar.invalidateOutline();
            this.P.invalidate();
        }
        invalidate();
    }

    public final void m0(org.telegram.messenger.gf gfVar, boolean z9, boolean z10) {
        int i7;
        org.telegram.ui.an anVar;
        org.telegram.ui.an anVar2;
        ArrayList<Object> arrayList;
        int i10;
        ArrayList arrayList2 = r1;
        di diVar = this.b;
        if (gfVar != null) {
            int i11 = gfVar.C;
            arrayList2.add(gfVar);
            s1.put(Integer.valueOf(i11), gfVar);
            t1.add(Integer.valueOf(i11));
            diVar.K1(0);
            this.G.f();
            this.w.f();
        }
        if (gfVar != null && !z10 && arrayList2.size() > 1) {
            B0(false);
            if (this.P != null) {
                this.l0.b(false, 0.0f);
                this.B0 = 0.0f;
                this.P.setZoom(0.0f);
                CameraController.getInstance().startPreview(this.P.getCameraSessionObject());
                return;
            }
            return;
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        this.t0 = true;
        org.telegram.ui.ActionBar.f2 f2Var = diVar.W1;
        org.telegram.ui.ActionBar.f2 f2Var2 = diVar.W1;
        if (f2Var == null) {
            f2Var = LaunchActivity.Q();
        }
        if (f2Var == null) {
            return;
        }
        PhotoViewer.p1().H2(f2Var.getParentActivity(), null, this.a);
        PhotoViewer.p1().I2(diVar);
        PhotoViewer p12 = PhotoViewer.p1();
        int i12 = diVar.M3;
        boolean z11 = diVar.N3;
        p12.h = i12;
        p12.n = z11;
        if (diVar.w1 && diVar.x1) {
            anVar = (org.telegram.ui.an) f2Var2;
            i7 = 11;
        } else {
            if (diVar.K2 != 0) {
                i7 = 1;
            } else if (f2Var2 instanceof org.telegram.ui.an) {
                anVar = (org.telegram.ui.an) f2Var2;
                i7 = 2;
            } else {
                i7 = 5;
            }
            anVar = null;
        }
        boolean z12 = diVar.y1;
        if (z12) {
            i7 = 13;
            anVar2 = null;
        } else {
            anVar2 = anVar;
        }
        int i13 = i7;
        if (diVar.K2 != 0 || z12) {
            arrayList = new ArrayList<>();
            arrayList.add(gfVar);
            i10 = 0;
        } else {
            arrayList = getAllPhotosArray();
            i10 = arrayList2.size() - 1;
        }
        ArrayList<Object> arrayList3 = arrayList;
        h30 h30Var = diVar.H1;
        if (h30Var != null && gfVar != null) {
            h30Var.e = gfVar.b;
        }
        PhotoViewer.p1().e2(arrayList3, i10, i13, false, new kl(this, z9), anVar2);
        PhotoViewer.p1().u2(diVar.H1);
        if (diVar.x1) {
            PhotoViewer.p1().S0(null, null, false, diVar.A1);
            PhotoViewer.p1().j2();
        }
    }

    public final void n0() {
        try {
            if (this.P != null) {
                CameraController.getInstance().stopPreview(this.P.getCameraSessionObject());
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.vh
    public final boolean o(MotionEvent motionEvent) {
        ql qlVar;
        if (!this.d0) {
            if (this.b0 && motionEvent != null) {
                boolean z9 = this.G0;
                r71 r71Var = this.l0;
                if ((!z9 && motionEvent.getActionMasked() == 0) || motionEvent.getActionMasked() == 5) {
                    Rect rect = this.E0;
                    r71Var.getHitRect(rect);
                    if (r71Var.getTag() == null || !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        if (!this.s0 && !this.I0) {
                            if (motionEvent.getPointerCount() == 2) {
                                this.A0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                this.C0 = true;
                            } else {
                                this.H0 = true;
                                this.F0 = motionEvent.getY();
                                this.C0 = false;
                            }
                            this.D0 = false;
                            this.G0 = true;
                            return true;
                        }
                    }
                } else if (this.G0) {
                    int actionMasked = motionEvent.getActionMasked();
                    jl jlVar = this.r;
                    TextView textView = this.p0;
                    Property property = View.ALPHA;
                    ImageView[] imageViewArr = this.S;
                    bi.e5 e5Var = this.j0;
                    if (actionMasked == 2) {
                        if (this.C0 && motionEvent.getPointerCount() == 2 && !this.I0) {
                            float hypot = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                            if (this.D0) {
                                if (this.P != null) {
                                    float L = (hypot - this.A0) / org.telegram.messenger.g0.L(100.0f);
                                    this.A0 = hypot;
                                    float f10 = this.B0 + L;
                                    this.B0 = f10;
                                    if (f10 < 0.0f) {
                                        this.B0 = 0.0f;
                                    } else if (f10 > 1.0f) {
                                        this.B0 = 1.0f;
                                    }
                                    r71Var.b(false, this.B0);
                                    this.b.b.invalidate();
                                    this.P.setZoom(this.B0);
                                    w0(true);
                                    return true;
                                }
                            } else if (Math.abs(hypot - this.A0) >= org.telegram.messenger.g0.a1(false, 0.4f)) {
                                this.A0 = hypot;
                                this.D0 = true;
                                return true;
                            }
                        } else {
                            float y10 = motionEvent.getY();
                            float f11 = y10 - this.F0;
                            if (this.H0) {
                                if (Math.abs(f11) > org.telegram.messenger.g0.a1(false, 0.4f)) {
                                    this.H0 = false;
                                    this.I0 = true;
                                    return true;
                                }
                            } else if (this.I0 && (qlVar = this.P) != null) {
                                qlVar.setTranslationY(qlVar.getTranslationY() + f11);
                                this.F0 = y10;
                                r71Var.setTag(null);
                                Runnable runnable = this.n0;
                                if (runnable != null) {
                                    org.telegram.messenger.g0.r(runnable);
                                    this.n0 = null;
                                }
                                if (e5Var.getTag() == null) {
                                    e5Var.setTag(1);
                                    AnimatorSet animatorSet = new AnimatorSet();
                                    animatorSet.playTogether(ObjectAnimator.ofFloat(e5Var, (Property<bi.e5, Float>) property, 0.0f), ObjectAnimator.ofFloat(r71Var, (Property<r71, Float>) property, 0.0f), ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f), ObjectAnimator.ofFloat(imageViewArr[0], (Property<ImageView, Float>) property, 0.0f), ObjectAnimator.ofFloat(imageViewArr[1], (Property<ImageView, Float>) property, 0.0f), ObjectAnimator.ofFloat(jlVar, (Property<jl, Float>) property, 0.0f));
                                    animatorSet.setDuration(220L);
                                    animatorSet.setInterpolator(xq.f);
                                    animatorSet.start();
                                    return true;
                                }
                            }
                        }
                    } else if (motionEvent.getActionMasked() == 3 || motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 6) {
                        this.G0 = false;
                        this.C0 = false;
                        if (this.I0) {
                            this.I0 = false;
                            ql qlVar2 = this.P;
                            if (qlVar2 != null) {
                                if (Math.abs(qlVar2.getTranslationY()) > this.P.getMeasuredHeight() / 6.0f) {
                                    d0(true);
                                    return true;
                                }
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.P, (Property<ql, Float>) View.TRANSLATION_Y, 0.0f), ObjectAnimator.ofFloat(e5Var, (Property<bi.e5, Float>) property, 1.0f), ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 1.0f), ObjectAnimator.ofFloat(imageViewArr[0], (Property<ImageView, Float>) property, 1.0f), ObjectAnimator.ofFloat(imageViewArr[1], (Property<ImageView, Float>) property, 1.0f), ObjectAnimator.ofFloat(jlVar, (Property<jl, Float>) property, 1.0f));
                                animatorSet2.setDuration(250L);
                                animatorSet2.setInterpolator(this.i0);
                                animatorSet2.start();
                                e5Var.setTag(null);
                                return true;
                            }
                        } else {
                            ql qlVar3 = this.P;
                            if (qlVar3 != null && !this.D0) {
                                qlVar3.getLocationOnScreen(this.V);
                                this.P.focusToPoint((int) (motionEvent.getRawX() - r5[0]), (int) (motionEvent.getRawY() - r5[1]));
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
        if (this.b.M1) {
            return;
        }
        for (int i7 = 0; i7 < 2; i7++) {
            this.S[i7].animate().alpha(1.0f).translationX(0.0f).setDuration(150L).setInterpolator(xq.f).start();
        }
        ViewPropertyAnimator duration = this.r0.animate().alpha(1.0f).translationX(0.0f).setDuration(150L);
        xq xqVar = xq.f;
        duration.setInterpolator(xqVar).start();
        this.q0.animate().alpha(1.0f).setDuration(150L).setInterpolator(xqVar).start();
        org.telegram.messenger.g0.X3(this.R, false);
        org.telegram.messenger.g0.r(this.h0);
        this.h0 = null;
        org.telegram.messenger.g0.Q3(org.telegram.messenger.g0.W(getContext()));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13 = i11 - i7;
        if (this.S0 != i13) {
            this.S0 = i13;
            tl tlVar = this.G;
            if (tlVar != null) {
                tlVar.f();
            }
        }
        super.onLayout(z9, i7, i10, i11, i12);
        X();
    }

    @Override // org.telegram.ui.Components.vh
    public final void p() {
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.l4);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.r2);
    }

    public final void p0() {
        try {
            W(false);
            if (this.P != null) {
                CameraController.getInstance().startPreview(this.P.getCameraSessionObject());
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.vh
    public final boolean q() {
        if (this.d0) {
            return true;
        }
        if (this.b0) {
            d0(true);
            return true;
        }
        g0(true);
        return false;
    }

    public final void q0() {
        if (this.c0) {
            try {
                Bitmap bitmap = this.P.getTextureView().getBitmap();
                if (bitmap != null) {
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), this.P.getMatrix(), true);
                    bitmap.recycle();
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 80, (int) (createBitmap.getHeight() / (createBitmap.getWidth() / 80.0f)), true);
                    if (createScaledBitmap != null) {
                        if (createScaledBitmap != createBitmap) {
                            createBitmap.recycle();
                        }
                        Utilities.blurBitmap(createScaledBitmap, 7);
                        FileOutputStream fileOutputStream = new FileOutputStream(new File(org.telegram.messenger.t0.h(), "cthumb.jpg"));
                        createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                        createScaledBitmap.recycle();
                        fileOutputStream.close();
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // org.telegram.ui.Components.vh
    public final void r(int i7) {
        g0((i7 == 0 || i7 == 2) ? false : true);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.R0) {
            return;
        }
        super.requestLayout();
    }

    public final void s0(int i7, final boolean z9) {
        PhotoViewer p12 = PhotoViewer.p1();
        if (i7 == -1) {
            i7 = p12.O4;
        }
        ArrayList arrayList = p12.f7;
        if (arrayList == null || arrayList.isEmpty() || i7 >= arrayList.size() || !(arrayList.get(i7) instanceof org.telegram.messenger.gf) || !((org.telegram.messenger.gf) arrayList.get(i7)).M) {
            return;
        }
        final org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) arrayList.get(i7);
        this.E.M(new q0.a() { // from class: org.telegram.ui.Components.dl
            @Override // q0.a
            public final void accept(Object obj) {
                View view = (View) obj;
                boolean z10 = ChatAttachAlertPhotoLayout.q1;
                if (view instanceof org.telegram.ui.Cells.q5) {
                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) view;
                    if (q5Var.getPhotoEntry() == gfVar) {
                        q5Var.c(z9, Float.valueOf(250.0f));
                        q5Var.f(ChatAttachAlertPhotoLayout.this.getStarsPrice(), ChatAttachAlertPhotoLayout.s1.size() > 1);
                    }
                }
            }
        });
    }

    public void setCameraOpenProgress(float f10) {
        int i7;
        int i10;
        if (this.P == null) {
            return;
        }
        this.e0 = f10;
        int[] iArr = this.f0;
        float f11 = iArr[1];
        float f12 = iArr[2];
        int i11 = org.telegram.messenger.g0.q.x;
        di diVar = this.b;
        float width = diVar.c.getWidth();
        float height = diVar.c.getHeight();
        float[] fArr = this.U;
        float f13 = fArr[0];
        float f14 = fArr[1];
        float f15 = this.j1;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.P.getLayoutParams();
        float textureHeight = this.P.getTextureHeight(f11, f12) / this.P.getTextureHeight(width, height);
        float f16 = f12 / height;
        float f17 = f11 / width;
        if (this.i1) {
            i7 = (int) width;
            i10 = (int) height;
            float f18 = 1.0f - f10;
            float f19 = (textureHeight * f18) + f10;
            this.P.getTextureView().setScaleX(f19);
            this.P.getTextureView().setScaleY(f19);
            float f20 = ((1.0f - ((f16 * f18) + f10)) * height) / 2.0f;
            float f21 = ((1.0f - ((f17 * f18) + f10)) * width) / 2.0f;
            float f22 = f13 * f18;
            this.P.setTranslationX(((0.0f * f10) + f22) - f21);
            float f23 = f14 * f18;
            this.P.setTranslationY(((f15 * f10) + f23) - f20);
            this.k1 = f23 - this.P.getTranslationY();
            this.l1 = (height * f10) + (((f14 + f12) * f18) - this.P.getTranslationY());
            this.n1 = f22 - this.P.getTranslationX();
            this.m1 = (width * f10) + (((f13 + f11) * f18) - this.P.getTranslationX());
        } else {
            i7 = (int) f11;
            i10 = (int) f12;
            this.P.getTextureView().setScaleX(1.0f);
            this.P.getTextureView().setScaleY(1.0f);
            this.k1 = 0.0f;
            this.l1 = height;
            this.n1 = 0.0f;
            this.m1 = width;
            this.P.setTranslationX(f13);
            this.P.setTranslationY(f14);
        }
        if (layoutParams.width != i7 || layoutParams.height != i10) {
            layoutParams.width = i7;
            layoutParams.height = i10;
            this.P.requestLayout();
        }
        this.P.invalidateOutline();
        this.P.invalidate();
    }

    public void setCheckCameraWhenShown(boolean z9) {
        this.u0 = z9;
    }

    public void setIncludeVideosInGallery(boolean z9) {
        this.y0 = z9;
    }

    public void setStarsPrice(long j3) {
        HashMap hashMap = s1;
        if (!hashMap.isEmpty()) {
            Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) ((Map.Entry) it.next()).getValue();
                gfVar.N = j3;
                gfVar.M = j3 > 0;
                gfVar.R = false;
            }
        }
        D(getSelectedItemsCount());
        if (Z(false)) {
            A0();
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        di diVar = this.b;
        if (diVar.A0 == 1) {
            float f11 = (f10 / 40.0f) * (-0.1f);
            jl jlVar = this.E;
            int childCount = jlVar.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = jlVar.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.q5) {
                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                    float f12 = 1.0f + f11;
                    q5Var.getCheckBox().setScaleX(f12);
                    q5Var.getCheckBox().setScaleY(f12);
                }
            }
        }
        super.setTranslationY(f10);
        diVar.b.invalidate();
        invalidate();
    }

    @Override // org.telegram.ui.Components.vh
    public final void t() {
        ql qlVar = this.P;
        if (qlVar != null) {
            qlVar.setVisibility(8);
        }
        for (Map.Entry entry : s1.entrySet()) {
            if (entry.getValue() instanceof org.telegram.messenger.gf) {
                ((org.telegram.messenger.gf) entry.getValue()).getClass();
            }
        }
        this.G.f();
    }

    public final boolean t0() {
        if (this.y0) {
            return true;
        }
        di diVar = this.b;
        if (diVar.w1) {
            return false;
        }
        return (diVar.W1 instanceof org.telegram.ui.an) || diVar.N2 || diVar.K2 == 2;
    }

    @Override // org.telegram.ui.Components.vh
    public final void u() {
        this.N = true;
        jl jlVar = this.E;
        int childCount = jlVar.getChildCount();
        int i7 = 0;
        while (true) {
            if (i7 >= childCount) {
                break;
            }
            if (jlVar.getChildAt(i7) instanceof org.telegram.ui.Cells.k5) {
                q0();
                break;
            } else {
                this.Q.i();
                i7++;
            }
        }
        ViewPropertyAnimator viewPropertyAnimator = this.o1;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator withEndAction = this.y.animate().alpha(0.0f).setDuration(150L).setInterpolator(xq.j).withEndAction(new cl(this, 3));
        this.o1 = withEndAction;
        withEndAction.start();
        n0();
    }

    public final void u0(v8 v8Var, TLRPC.VideoSize videoSize, long j3) {
        di diVar = this.b;
        t8 t8Var = new t8(diVar.L1, diVar.H1);
        h30 h30Var = diVar.H1;
        t8Var.Q = h30Var == null || h30Var.c != 2;
        diVar.W1.presentFragment(t8Var);
        if (v8Var != null) {
            t8Var.r0(v8Var);
        }
        if (videoSize != null) {
            t8Var.q0(videoSize);
        }
        if (j3 != 0) {
            t8Var.p0(j3);
        }
        t8Var.I = new f2(7, this, t8Var);
    }

    @Override // org.telegram.ui.Components.vh
    public final void v(float f10) {
        ql qlVar = this.P;
        if (qlVar != null) {
            qlVar.setAlpha(f10);
            if (f10 != 0.0f && this.P.getVisibility() != 0) {
                this.P.setVisibility(0);
            } else {
                if (f10 != 0.0f || this.P.getVisibility() == 4) {
                    return;
                }
                this.P.setVisibility(4);
            }
        }
    }

    public final void v0() {
        di diVar = this.b;
        if (!diVar.Z3 && this.v0 && CameraView.isCameraAllowed()) {
            if (this.P == null) {
                boolean z9 = !org.telegram.messenger.rc.e(360928);
                Context context = getContext();
                Boolean bool = this.o0;
                ql qlVar = new ql(this, context, bool != null ? bool.booleanValue() : diVar.O3, z9);
                this.P = qlVar;
                org.telegram.ui.ActionBar.f2 f2Var = diVar.W1;
                qlVar.setRecordFile(org.telegram.messenger.g0.s0((f2Var instanceof org.telegram.ui.an) && ((org.telegram.ui.an) f2Var).z()));
                this.P.setFocusable(true);
                this.P.setFpsLimit(30);
                this.P.setOutlineProvider(new fh.a(this, 2));
                this.P.setClipToOutline(true);
                this.P.setContentDescription(org.telegram.messenger.hd.M0(2131754852, null));
                org.telegram.ui.ActionBar.l2 l2Var = diVar.c;
                ql qlVar2 = this.P;
                int i7 = this.K0;
                l2Var.addView(qlVar2, 1, new FrameLayout.LayoutParams(i7, i7));
                this.P.setDelegate(new ll(this));
                this.P.setAlpha(this.v0 ? 1.0f : 0.2f);
                this.P.setEnabled(this.v0);
                if (this.N) {
                    this.P.setVisibility(8);
                }
                if (!this.b0) {
                    X();
                }
                jl jlVar = this.E;
                if (jlVar != null) {
                    jlVar.invalidate();
                }
                invalidate();
            }
            r71 r71Var = this.l0;
            if (r71Var != null) {
                r71Var.b(false, 0.0f);
                this.B0 = 0.0f;
            }
            if (this.b0) {
                return;
            }
            this.P.setTranslationX(this.U[0]);
        }
    }

    @Override // org.telegram.ui.Components.vh
    public final void w(int i7) {
        TLRPC.Chat Y0;
        boolean z9;
        boolean z10;
        char c10 = 1;
        char c11 = 1;
        char c12 = 1;
        char c13 = 1;
        di diVar = this.b;
        if (i7 == 8) {
            diVar.v1(!diVar.T1, true);
            this.d1.a(!diVar.T1, true);
            return;
        }
        if ((i7 == 0 || i7 == 1) && diVar.M3 > 0 && t1.size() > 1 && (Y0 = diVar.Y0()) != null && !org.telegram.messenger.t3.N(Y0) && Y0.slowmode_enabled) {
            v4.L(getContext(), org.telegram.messenger.hd.M0(2131745311, null), org.telegram.messenger.hd.M0(2131745303, null), null, null, this.a).p();
            return;
        }
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        HashMap hashMap = s1;
        final int i10 = 0;
        if (i7 == 0) {
            org.telegram.messenger.ij ijVar = diVar.B3;
            org.telegram.ui.ActionBar.f2 f2Var = diVar.W1;
            if (ijVar == null && (f2Var instanceof org.telegram.ui.an) && ((org.telegram.ui.an) f2Var).c()) {
                v4.J(getContext(), ((org.telegram.ui.an) f2Var).a(), new yk(this, i10), f6Var);
                return;
            } else {
                v4.X(diVar.D3, diVar.X0() + hashMap.size(), diVar.b1(), new org.telegram.messenger.c20(this) { // from class: org.telegram.ui.Components.zk
                    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.messenger.c20
                    public final void a(Object obj) {
                        int i11 = i10;
                        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                        Long l10 = (Long) obj;
                        switch (i11) {
                            case 0:
                                boolean z11 = ChatAttachAlertPhotoLayout.q1;
                                di diVar2 = chatAttachAlertPhotoLayout.b;
                                diVar2.M0();
                                diVar2.T3.o1(7, false, true, 0, 0, 0L, diVar2.f1(), false, l10.longValue());
                                break;
                            default:
                                boolean z12 = ChatAttachAlertPhotoLayout.q1;
                                di diVar3 = chatAttachAlertPhotoLayout.b;
                                diVar3.M0();
                                diVar3.T3.o1(4, true, true, 0, 0, 0L, diVar3.f1(), false, l10.longValue());
                                break;
                        }
                    }
                });
                return;
            }
        }
        if (i7 == 1) {
            org.telegram.messenger.ij ijVar2 = diVar.B3;
            org.telegram.ui.ActionBar.f2 f2Var2 = diVar.W1;
            if (ijVar2 == null && (f2Var2 instanceof org.telegram.ui.an) && ((org.telegram.ui.an) f2Var2).c()) {
                v4.J(getContext(), ((org.telegram.ui.an) f2Var2).a(), new yk(this, c13 == true ? 1 : 0), f6Var);
                return;
            }
            int i11 = diVar.D3;
            long b12 = diVar.b1();
            int X0 = diVar.X0() + hashMap.size();
            final char c14 = c12 == true ? 1 : 0;
            v4.X(i11, X0, b12, new org.telegram.messenger.c20(this) { // from class: org.telegram.ui.Components.zk
                public final /* synthetic */ ChatAttachAlertPhotoLayout b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.c20
                public final void a(Object obj) {
                    int i112 = c14;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                    Long l10 = (Long) obj;
                    switch (i112) {
                        case 0:
                            boolean z11 = ChatAttachAlertPhotoLayout.q1;
                            di diVar2 = chatAttachAlertPhotoLayout.b;
                            diVar2.M0();
                            diVar2.T3.o1(7, false, true, 0, 0, 0L, diVar2.f1(), false, l10.longValue());
                            break;
                        default:
                            boolean z12 = ChatAttachAlertPhotoLayout.q1;
                            di diVar3 = chatAttachAlertPhotoLayout.b;
                            diVar3.M0();
                            diVar3.T3.o1(4, true, true, 0, 0, 0L, diVar3.f1(), false, l10.longValue());
                            break;
                    }
                }
            });
            return;
        }
        tl tlVar = this.G;
        jl jlVar = this.E;
        if (i7 == 3) {
            bm bmVar = diVar.h2;
            if (bmVar != null) {
                bmVar.O();
            }
            Iterator it = hashMap.entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((org.telegram.messenger.gf) ((Map.Entry) it.next()).getValue()).M) {
                        z10 = true;
                        break;
                    }
                } else {
                    z10 = false;
                    break;
                }
            }
            final boolean z11 = !z10;
            org.telegram.messenger.g0.i3(new Runnable(this) { // from class: org.telegram.ui.Components.al
                public final /* synthetic */ ChatAttachAlertPhotoLayout b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i12 = i10;
                    boolean z12 = z11;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                    switch (i12) {
                        case 0:
                            boolean z13 = ChatAttachAlertPhotoLayout.q1;
                            di diVar2 = chatAttachAlertPhotoLayout.b;
                            org.telegram.ui.ActionBar.z0 z0Var = chatAttachAlertPhotoLayout.Y0;
                            z0Var.setText(org.telegram.messenger.hd.M0(z12 ? 2131751431 : 2131751155, null));
                            if (z12) {
                                z0Var.setIcon(R.drawable.msg_spoiler_off);
                            } else {
                                z0Var.setAnimatedIcon(R.raw.photo_spoiler);
                            }
                            if (!z12) {
                                diVar2.U2.S(1);
                                if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                    diVar2.U2.S(6);
                                    break;
                                }
                            } else {
                                diVar2.U2.t(1);
                                if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                    diVar2.U2.t(6);
                                    break;
                                }
                            }
                            break;
                        default:
                            org.telegram.ui.ActionBar.z0 z0Var2 = chatAttachAlertPhotoLayout.a1;
                            z0Var2.setText(org.telegram.messenger.hd.M0(z12 ? 2131745621 : 2131745622, null));
                            if (!z12) {
                                z0Var2.setIcon(R.drawable.menu_quality_hd);
                                break;
                            } else {
                                z0Var2.setIcon(R.drawable.menu_quality_sd);
                                break;
                            }
                    }
                }
            }, 200L);
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : hashMap.entrySet()) {
                if (entry.getValue() instanceof org.telegram.messenger.gf) {
                    org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) entry.getValue();
                    gfVar.M = z11;
                    gfVar.R = false;
                    arrayList.add(Integer.valueOf(gfVar.C));
                }
            }
            jlVar.M(new bl(i10, arrayList, z11));
            if (diVar.s2 != this) {
                tlVar.f();
            }
            bm bmVar2 = diVar.h2;
            if (bmVar2 != null) {
                bmVar2.w.invalidate();
                return;
            }
            return;
        }
        if (i7 == 2) {
            bm bmVar3 = diVar.h2;
            if (bmVar3 != null) {
                bmVar3.O();
            }
            Iterator it2 = hashMap.entrySet().iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((org.telegram.messenger.gf) ((Map.Entry) it2.next()).getValue()).c()) {
                        z9 = true;
                        break;
                    }
                } else {
                    z9 = false;
                    break;
                }
            }
            final boolean z12 = !z9;
            final char c15 = c11 == true ? 1 : 0;
            org.telegram.messenger.g0.i3(new Runnable(this) { // from class: org.telegram.ui.Components.al
                public final /* synthetic */ ChatAttachAlertPhotoLayout b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i12 = c15;
                    boolean z122 = z12;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                    switch (i12) {
                        case 0:
                            boolean z13 = ChatAttachAlertPhotoLayout.q1;
                            di diVar2 = chatAttachAlertPhotoLayout.b;
                            org.telegram.ui.ActionBar.z0 z0Var = chatAttachAlertPhotoLayout.Y0;
                            z0Var.setText(org.telegram.messenger.hd.M0(z122 ? 2131751431 : 2131751155, null));
                            if (z122) {
                                z0Var.setIcon(R.drawable.msg_spoiler_off);
                            } else {
                                z0Var.setAnimatedIcon(R.raw.photo_spoiler);
                            }
                            if (!z122) {
                                diVar2.U2.S(1);
                                if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                    diVar2.U2.S(6);
                                    break;
                                }
                            } else {
                                diVar2.U2.t(1);
                                if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                    diVar2.U2.t(6);
                                    break;
                                }
                            }
                            break;
                        default:
                            org.telegram.ui.ActionBar.z0 z0Var2 = chatAttachAlertPhotoLayout.a1;
                            z0Var2.setText(org.telegram.messenger.hd.M0(z122 ? 2131745621 : 2131745622, null));
                            if (!z122) {
                                z0Var2.setIcon(R.drawable.menu_quality_hd);
                                break;
                            } else {
                                z0Var2.setIcon(R.drawable.menu_quality_sd);
                                break;
                            }
                    }
                }
            }, 200L);
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry entry2 : hashMap.entrySet()) {
                if (entry2.getValue() instanceof org.telegram.messenger.gf) {
                    org.telegram.messenger.gf gfVar2 = (org.telegram.messenger.gf) entry2.getValue();
                    gfVar2.z = Boolean.valueOf(z12);
                    gfVar2.R = false;
                    arrayList2.add(Integer.valueOf(gfVar2.C));
                }
            }
            jlVar.M(new bl(c10 == true ? 1 : 0, arrayList2, z12));
            if (diVar.s2 != this) {
                tlVar.f();
            }
            bm bmVar4 = diVar.h2;
            if (bmVar4 != null) {
                bmVar4.w.invalidate();
                return;
            }
            return;
        }
        if (i7 != 4) {
            if (i7 == 7) {
                diVar.O1(diVar.s2 != diVar.h2);
                return;
            }
            if (i7 == 9) {
                bi.dd.j1(getContext(), getStarsPrice(), true, new d(this, 6), this.a);
                return;
            }
            if (i7 >= 10) {
                org.telegram.messenger.we weVar = (org.telegram.messenger.we) this.V0.get(i7 - 10);
                this.T0 = weVar;
                org.telegram.messenger.we weVar2 = this.U0;
                TextView textView = this.y;
                if (weVar == weVar2) {
                    textView.setText(org.telegram.messenger.hd.M0(2131752238, null));
                } else {
                    textView.setText(weVar.c);
                }
                tlVar.f();
                this.w.f();
                this.F.h1(0, -(jlVar.getPaddingTop() - getTopScrollOffset()));
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
                int i12 = diVar.K2;
                org.telegram.ui.ActionBar.f2 f2Var3 = diVar.W1;
                if (i12 != 0) {
                    f2Var3.startActivityForResult(createChooser, 14);
                } else {
                    f2Var3.startActivityForResult(createChooser, 1);
                }
            } else {
                Intent intent3 = new Intent("android.intent.action.PICK");
                intent3.setType("image/*");
                int i13 = diVar.K2;
                org.telegram.ui.ActionBar.f2 f2Var4 = diVar.W1;
                if (i13 != 0) {
                    f2Var4.startActivityForResult(intent3, 14);
                } else {
                    f2Var4.startActivityForResult(intent3, 1);
                }
            }
            diVar.a(true);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void w0(boolean z9) {
        r71 r71Var = this.l0;
        int i7 = 1;
        if ((r71Var.getTag() != null && z9) || (r71Var.getTag() == null && !z9)) {
            if (z9) {
                Runnable runnable = this.n0;
                if (runnable != null) {
                    org.telegram.messenger.g0.r(runnable);
                }
                cl clVar = new cl(this, i7);
                this.n0 = clVar;
                org.telegram.messenger.g0.i3(clVar, 2000L);
                return;
            }
            return;
        }
        AnimatorSet animatorSet = this.m0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        r71Var.setTag(z9 ? 1 : null);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.m0 = animatorSet2;
        animatorSet2.setDuration(180L);
        this.m0.playTogether(ObjectAnimator.ofFloat(r71Var, (Property<r71, Float>) View.ALPHA, z9 ? 1.0f : 0.0f));
        this.m0.addListener(new il(this, i7));
        this.m0.start();
        if (z9) {
            cl clVar2 = new cl(this, 2);
            this.n0 = clVar2;
            org.telegram.messenger.g0.i3(clVar2, 2000L);
        }
    }

    @Override // org.telegram.ui.Components.vh
    public final void x() {
        di diVar = this.b;
        W(diVar != null && (diVar.W1 instanceof org.telegram.ui.an));
    }

    public final void x0() {
        fi.w2 w2Var = this.x;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = w2Var.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        if (this.v0) {
            ArrayList arrayList = t0() ? MediaController.b2 : MediaController.c2;
            ArrayList arrayList2 = new ArrayList(arrayList);
            this.V0 = arrayList2;
            Collections.sort(arrayList2, new el(arrayList, 0));
        } else {
            this.V0 = new ArrayList();
        }
        boolean isEmpty = this.V0.isEmpty();
        TextView textView = this.y;
        if (isEmpty) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.D, (Drawable) null);
        int size = this.V0.size();
        for (int i7 = 0; i7 < size; i7++) {
            org.telegram.messenger.we weVar = (org.telegram.messenger.we) this.V0.get(i7);
            fi.a aVar = new fi.a(getContext(), weVar.d, weVar.c, weVar.e.size(), this.a);
            w2Var.getPopupLayout().addView(aVar);
            aVar.setOnClickListener(new ai.v(this, i7 + 10, 11));
        }
    }

    public final void y0() {
        jl jlVar = this.E;
        if (jlVar != null) {
            for (int i7 = 0; i7 < jlVar.getChildCount(); i7++) {
                View childAt = jlVar.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.q5) {
                    ((org.telegram.ui.Cells.q5) childAt).a.invalidate();
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.vh
    public final void z(int i7, boolean z9) {
        X();
        ql qlVar = this.P;
        if (qlVar != null) {
            qlVar.invalidateOutline();
            this.P.invalidate();
        }
    }

    public final void z0() {
        ArrayList arrayList;
        if (this.b.W1 instanceof org.telegram.ui.an) {
            jl jlVar = this.E;
            int childCount = jlVar.getChildCount();
            int i7 = 0;
            while (true) {
                arrayList = t1;
                if (i7 >= childCount) {
                    break;
                }
                View childAt = jlVar.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.q5) {
                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                    org.telegram.messenger.gf e02 = e0(((Integer) q5Var.getTag()).intValue());
                    if (e02 != null) {
                        q5Var.setNum(arrayList.indexOf(Integer.valueOf(e02.C)));
                    }
                }
                i7++;
            }
            jl jlVar2 = this.r;
            int childCount2 = jlVar2.getChildCount();
            for (int i10 = 0; i10 < childCount2; i10++) {
                View childAt2 = jlVar2.getChildAt(i10);
                if (childAt2 instanceof org.telegram.ui.Cells.q5) {
                    org.telegram.ui.Cells.q5 q5Var2 = (org.telegram.ui.Cells.q5) childAt2;
                    org.telegram.messenger.gf e03 = e0(((Integer) q5Var2.getTag()).intValue());
                    if (e03 != null) {
                        q5Var2.setNum(arrayList.indexOf(Integer.valueOf(e03.C)));
                    }
                }
            }
        }
    }
}
