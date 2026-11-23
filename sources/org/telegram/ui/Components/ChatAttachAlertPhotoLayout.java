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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public class ChatAttachAlertPhotoLayout extends li implements org.telegram.messenger.fs {
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
    public final xl F;
    public final Rect F0;
    public final gi.g G;
    public float G0;
    public final hm H;
    public boolean H0;
    public final sy I;
    public boolean I0;
    public final ik0 J;
    public boolean J0;
    public int K;
    public boolean K0;
    public boolean L;
    public int L0;
    public int M;
    public int M0;
    public int N;
    public int N0;
    public boolean O;
    public boolean O0;
    public AnimatorSet P;
    public boolean P0;
    public em Q;
    public boolean Q0;
    public final fm R;
    public boolean R0;
    public final cm S;
    public boolean S0;
    public final ImageView[] T;
    public int T0;
    public boolean U;
    public org.telegram.messenger.ue U0;
    public final float[] V;
    public org.telegram.messenger.ue V0;
    public final int[] W;
    public ArrayList W0;
    public float X0;
    public boolean Y0;
    public final org.telegram.ui.ActionBar.y0 Z0;
    public float a0;
    public final org.telegram.ui.ActionBar.y0 a1;
    public float b0;
    public final org.telegram.ui.ActionBar.y0 b1;
    public boolean c0;
    public final org.telegram.ui.ActionBar.y0 c1;
    public boolean d0;
    public final org.telegram.ui.ActionBar.y0 d1;
    public boolean e0;
    public final sa0 e1;
    public float f0;
    public final boolean f1;
    public final int[] g0;
    public final h2.f g1;
    public int h0;
    public boolean h1;
    public ul i0;
    public final am i1;
    public final DecelerateInterpolator j0;
    public boolean j1;
    public final bi.g3 k0;
    public float k1;
    public final ShutterButton l0;
    public float l1;
    public final g81 m0;
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
    public final xl r;
    public final TextView r0;
    public final jg.b0 s;
    public final ImageView s0;
    public boolean t0;
    public boolean u0;
    public boolean v0;
    public final hm w;
    public boolean w0;
    public final hi.d3 x;
    public boolean x0;
    public final TextView y;
    public boolean y0;
    public boolean z0;

    /* JADX WARN: Multi-variable type inference failed */
    public ChatAttachAlertPhotoLayout(ti tiVar, Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var, tiVar);
        final int i7 = 2;
        this.T = new ImageView[2];
        this.V = new float[2];
        this.W = new int[2];
        this.g0 = new int[5];
        this.j0 = new DecelerateInterpolator(1.5f);
        this.p0 = null;
        this.F0 = new Rect();
        int L = org.telegram.messenger.g0.L(80.0f);
        this.L0 = L;
        this.M0 = L;
        final int i10 = 3;
        this.N0 = 3;
        final int i11 = 1;
        this.Y0 = true;
        this.g1 = new h2.f((int[]) null);
        this.i1 = new am(this);
        this.f1 = z10;
        this.n = z11;
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.r2);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.o4);
        org.telegram.ui.ActionBar.m2 m2Var = tiVar.c;
        ti tiVar2 = this.b;
        final int i12 = 0;
        this.h1 = tiVar2.O2 != 0;
        hi.d3 d3Var = new hi.d3(this, context, tiVar2.V2.s(), i6Var, 1);
        this.x = d3Var;
        d3Var.setSubMenuOpenSide(1);
        FrameLayout.LayoutParams d = c8.na.d(-2, -1.0f, 51, 60.0f, 0.0f, 40.0f, 0.0f);
        d.topMargin = org.telegram.messenger.g0.m;
        this.b.V2.addView(d3Var, 0, d);
        d3Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ll
            public final /* synthetic */ ChatAttachAlertPhotoLayout b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                em emVar;
                em emVar2;
                int i13 = i7;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                int i14 = 0;
                switch (i13) {
                    case 0:
                        if (!chatAttachAlertPhotoLayout.t0 && (emVar = chatAttachAlertPhotoLayout.Q) != null && emVar.isInited()) {
                            chatAttachAlertPhotoLayout.d0 = false;
                            chatAttachAlertPhotoLayout.Q.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.s0, (Property<ImageView, Float>) View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new wl(chatAttachAlertPhotoLayout, i14));
                            duration.start();
                            break;
                        }
                        break;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.U && (emVar2 = chatAttachAlertPhotoLayout.Q) != null && emVar2.isInited() && chatAttachAlertPhotoLayout.c0) {
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
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 0.0f, org.telegram.messenger.g0.L(48.0f));
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, -org.telegram.messenger.g0.L(48.0f), 0.0f);
                                Property property2 = View.ALPHA;
                                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property2, 0.0f, 1.0f));
                                animatorSet.setDuration(220L);
                                animatorSet.setInterpolator(kr.f);
                                animatorSet.addListener(new fi.a3(chatAttachAlertPhotoLayout, view, imageView, 4));
                                animatorSet.start();
                                break;
                            }
                        }
                        break;
                    case 2:
                        chatAttachAlertPhotoLayout.x.V(null, null);
                        break;
                    default:
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
        int i13 = org.telegram.ui.ActionBar.n6.j5;
        org.telegram.ui.ActionBar.u6.U(textView, i13, i6Var);
        textView.setText(org.telegram.messenger.gd.N0(2131752226, null));
        textView.setTypeface(org.telegram.messenger.g0.o());
        Drawable g10 = i5.c.g(context, R.drawable.ic_arrow_drop_down);
        this.E = g10;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.u6.x(this, g10, i13, i6Var, mode);
        textView.setPadding(0, 0, org.telegram.messenger.g0.L(10.0f), 0);
        d3Var.addView(textView, c8.na.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
        X(false);
        sa0 sa0Var = new sa0(context, R.raw.position_below, org.telegram.messenger.gd.N0(2131752548, null), R.raw.position_above, org.telegram.messenger.gd.N0(2131752547, null), i6Var);
        this.e1 = sa0Var;
        sa0Var.a(!this.b.X1, false);
        this.d1 = this.b.Y2.e(7, R.drawable.msg_view_file, org.telegram.messenger.gd.N0(2131753954, null));
        this.b.Y2.a(5);
        this.b.Y2.e(4, R.drawable.msg_openin, org.telegram.messenger.gd.N0(2131747602, null));
        this.a1 = this.b.Y2.e(1, R.drawable.msg_filehq, org.telegram.messenger.gd.N0(2131745389, null));
        this.b.Y2.e(0, R.drawable.msg_ungroup, org.telegram.messenger.gd.N0(2131745388, null));
        this.b.Y2.a(6);
        this.Z0 = this.b.Y2.e(3, R.drawable.msg_spoiler, org.telegram.messenger.gd.N0(2131751142, null));
        this.b1 = this.b.Y2.e(2, R.drawable.menu_quality_hd, org.telegram.messenger.gd.N0(2131745425, null));
        org.telegram.ui.ActionBar.q0 q0Var = this.b.Y2;
        q0Var.q();
        sa0Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        sa0Var.setTag(8);
        q0Var.b.addView(sa0Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) sa0Var.getLayoutParams();
        if (org.telegram.messenger.gd.a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = org.telegram.messenger.g0.L(48.0f);
        sa0Var.setLayoutParams(layoutParams);
        sa0Var.setOnClickListener(new org.telegram.ui.ActionBar.z(q0Var, 2));
        this.c1 = this.b.Y2.e(9, R.drawable.menu_feature_paid, org.telegram.messenger.gd.N0(2131747536, null));
        this.b.Y2.setFitSubItems(true);
        xl xlVar = new xl(this, context, i6Var, i11);
        this.F = xlVar;
        xlVar.setFastScrollEnabled(1);
        xlVar.setFastScrollVisible(true);
        xlVar.getFastScroll().setAlpha(0.0f);
        xlVar.getFastScroll().a = false;
        xlVar.getFastScroll().i0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        hm hmVar = new hm(this, context, z11);
        this.H = hmVar;
        xlVar.setAdapter(hmVar);
        fm fmVar = new fm(this, xlVar);
        this.R = fmVar;
        xlVar.i(fmVar);
        int i14 = 0;
        for (int i15 = 8; i14 < i15; i15 = 8) {
            hmVar.h.add(hmVar.L());
            i14++;
        }
        xlVar.setClipToPadding(false);
        xlVar.setItemAnimator(null);
        xlVar.setLayoutAnimation(null);
        xlVar.setVerticalScrollBarEnabled(false);
        org.telegram.ui.ActionBar.u6.l(xlVar, 21, org.telegram.ui.ActionBar.n6.A5, i6Var);
        addView(xlVar, c8.na.d(-1, -1.0f, org.telegram.messenger.ks.E1, 0.0f, 0.0f, 0.0f, -48.0f));
        xlVar.setOnScrollListener(new hi.z8(i11, this));
        gi.g gVar = new gi.g(this, this.L0, i10);
        this.G = gVar;
        gVar.O = new bi.y2(this, 10);
        xlVar.setLayoutManager(gVar);
        xlVar.setOnItemClickListener(new ab.j(this, z11, i6Var, 7));
        xlVar.setOnItemLongClickListener(new ml(this, 2));
        ik0 ik0Var = new ik0(new org.telegram.ui.ActionBar.i5(this));
        this.J = ik0Var;
        xlVar.F.add(ik0Var);
        setBlur3Capture(xlVar);
        this.d = xlVar;
        this.f = true;
        sy syVar = new sy(context, i6Var);
        this.I = syVar;
        syVar.setText(org.telegram.messenger.gd.N0(2131747987, null));
        syVar.setOnTouchListener(null);
        int i16 = 16;
        syVar.setTextSize(16);
        addView(syVar, c8.na.c(-2.0f, -1));
        if (this.Y0) {
            syVar.b();
        } else {
            syVar.c();
        }
        Paint paint = new Paint(1);
        paint.setColor(-2468275);
        cm cmVar = new cm(context, paint);
        this.S = cmVar;
        org.telegram.messenger.g0.X3(cmVar, false, 1.0f, true, false);
        cmVar.setBackgroundResource(R.drawable.system);
        cmVar.getBackground().setColorFilter(new PorterDuffColorFilter(1711276032, mode));
        cmVar.setTextSize(1, 15.0f);
        cmVar.setTypeface(org.telegram.messenger.g0.o());
        cmVar.setAlpha(0.0f);
        cmVar.setTextColor(-1);
        cmVar.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(5.0f));
        m2Var.addView(cmVar, c8.na.d(-2, -2.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
        bi.g3 g3Var = new bi.g3(i16, context, this);
        this.k0 = g3Var;
        g3Var.setVisibility(8);
        g3Var.setAlpha(0.0f);
        m2Var.addView(g3Var, c8.na.e(-1, org.telegram.messenger.ks.K1, 83));
        TextView textView2 = new TextView(context);
        this.q0 = textView2;
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
        m2Var.addView(textView2, c8.na.d(-2, 38.0f, 51, 0.0f, 0.0f, 0.0f, 116.0f));
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ll
            public final /* synthetic */ ChatAttachAlertPhotoLayout b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                em emVar;
                em emVar2;
                int i132 = i10;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                int i142 = 0;
                switch (i132) {
                    case 0:
                        if (!chatAttachAlertPhotoLayout.t0 && (emVar = chatAttachAlertPhotoLayout.Q) != null && emVar.isInited()) {
                            chatAttachAlertPhotoLayout.d0 = false;
                            chatAttachAlertPhotoLayout.Q.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.s0, (Property<ImageView, Float>) View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new wl(chatAttachAlertPhotoLayout, i142));
                            duration.start();
                            break;
                        }
                        break;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.U && (emVar2 = chatAttachAlertPhotoLayout.Q) != null && emVar2.isInited() && chatAttachAlertPhotoLayout.c0) {
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
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 0.0f, org.telegram.messenger.g0.L(48.0f));
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, -org.telegram.messenger.g0.L(48.0f), 0.0f);
                                Property property2 = View.ALPHA;
                                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property2, 0.0f, 1.0f));
                                animatorSet.setDuration(220L);
                                animatorSet.setInterpolator(kr.f);
                                animatorSet.addListener(new fi.a3(chatAttachAlertPhotoLayout, view, imageView, 4));
                                animatorSet.start();
                                break;
                            }
                        }
                        break;
                    case 2:
                        chatAttachAlertPhotoLayout.x.V(null, null);
                        break;
                    default:
                        if (chatAttachAlertPhotoLayout.Q != null) {
                            chatAttachAlertPhotoLayout.m0(null, false, false);
                            CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.Q.getCameraSessionObject());
                            break;
                        }
                        break;
                }
            }
        });
        g81 g81Var = new g81(context);
        this.m0 = g81Var;
        g81Var.setVisibility(8);
        g81Var.setAlpha(0.0f);
        m2Var.addView(g81Var, c8.na.d(-2, 50.0f, 51, 0.0f, 0.0f, 0.0f, 116.0f));
        g81Var.setDelegate(new ml(this, i10));
        ShutterButton shutterButton = new ShutterButton(context);
        shutterButton.b = new DecelerateInterpolator();
        shutterButton.x = new rc(shutterButton, 19);
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
        shutterButton.f = nt0.a;
        this.l0 = shutterButton;
        g3Var.addView(shutterButton, c8.na.e(84, 84, 17));
        shutterButton.setDelegate(new vl(this, i6Var, m2Var));
        shutterButton.setFocusable(true);
        shutterButton.setContentDescription(org.telegram.messenger.gd.N0(2131754759, null));
        ImageView imageView = new ImageView(context);
        this.s0 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        g3Var.addView(imageView, c8.na.e(48, 48, 21));
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ll
            public final /* synthetic */ ChatAttachAlertPhotoLayout b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                em emVar;
                em emVar2;
                int i132 = i12;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                int i142 = 0;
                switch (i132) {
                    case 0:
                        if (!chatAttachAlertPhotoLayout.t0 && (emVar = chatAttachAlertPhotoLayout.Q) != null && emVar.isInited()) {
                            chatAttachAlertPhotoLayout.d0 = false;
                            chatAttachAlertPhotoLayout.Q.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.s0, (Property<ImageView, Float>) View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new wl(chatAttachAlertPhotoLayout, i142));
                            duration.start();
                            break;
                        }
                        break;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.U && (emVar2 = chatAttachAlertPhotoLayout.Q) != null && emVar2.isInited() && chatAttachAlertPhotoLayout.c0) {
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
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 0.0f, org.telegram.messenger.g0.L(48.0f));
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, -org.telegram.messenger.g0.L(48.0f), 0.0f);
                                Property property2 = View.ALPHA;
                                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 0.0f, 1.0f));
                                animatorSet.setDuration(220L);
                                animatorSet.setInterpolator(kr.f);
                                animatorSet.addListener(new fi.a3(chatAttachAlertPhotoLayout, view, imageView2, 4));
                                animatorSet.start();
                                break;
                            }
                        }
                        break;
                    case 2:
                        chatAttachAlertPhotoLayout.x.V(null, null);
                        break;
                    default:
                        if (chatAttachAlertPhotoLayout.Q != null) {
                            chatAttachAlertPhotoLayout.m0(null, false, false);
                            CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.Q.getCameraSessionObject());
                            break;
                        }
                        break;
                }
            }
        });
        imageView.setContentDescription(org.telegram.messenger.gd.N0(2131754751, null));
        for (int i17 = 0; i17 < 2; i17++) {
            this.T[i17] = new ImageView(context);
            this.T[i17].setScaleType(ImageView.ScaleType.CENTER);
            this.T[i17].setVisibility(4);
            this.k0.addView(this.T[i17], c8.na.e(48, 48, 51));
            this.T[i17].setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ll
                public final /* synthetic */ ChatAttachAlertPhotoLayout b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    em emVar;
                    em emVar2;
                    int i132 = i11;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                    int i142 = 0;
                    switch (i132) {
                        case 0:
                            if (!chatAttachAlertPhotoLayout.t0 && (emVar = chatAttachAlertPhotoLayout.Q) != null && emVar.isInited()) {
                                chatAttachAlertPhotoLayout.d0 = false;
                                chatAttachAlertPhotoLayout.Q.switchCamera();
                                ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.s0, (Property<ImageView, Float>) View.SCALE_X, 0.0f).setDuration(100L);
                                duration.addListener(new wl(chatAttachAlertPhotoLayout, i142));
                                duration.start();
                                break;
                            }
                            break;
                        case 1:
                            if (!chatAttachAlertPhotoLayout.U && (emVar2 = chatAttachAlertPhotoLayout.Q) != null && emVar2.isInited() && chatAttachAlertPhotoLayout.c0) {
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
                                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 0.0f, org.telegram.messenger.g0.L(48.0f));
                                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, -org.telegram.messenger.g0.L(48.0f), 0.0f);
                                    Property property2 = View.ALPHA;
                                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 0.0f, 1.0f));
                                    animatorSet.setDuration(220L);
                                    animatorSet.setInterpolator(kr.f);
                                    animatorSet.addListener(new fi.a3(chatAttachAlertPhotoLayout, view, imageView2, 4));
                                    animatorSet.start();
                                    break;
                                }
                            }
                            break;
                        case 2:
                            chatAttachAlertPhotoLayout.x.V(null, null);
                            break;
                        default:
                            if (chatAttachAlertPhotoLayout.Q != null) {
                                chatAttachAlertPhotoLayout.m0(null, false, false);
                                CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.Q.getCameraSessionObject());
                                break;
                            }
                            break;
                    }
                }
            });
            this.T[i17].setContentDescription("flash mode " + i17);
        }
        TextView textView3 = new TextView(context);
        this.r0 = textView3;
        textView3.setTextSize(1, 15.0f);
        textView3.setTextColor(-1);
        textView3.setText(org.telegram.messenger.gd.N0(2131744025, null));
        textView3.setShadowLayer(org.telegram.messenger.g0.L(3.33333f), 0.0f, org.telegram.messenger.g0.L(0.666f), 1275068416);
        textView3.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), 0);
        this.k0.addView(textView3, c8.na.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        xl xlVar2 = new xl(this, context, i6Var, null == true ? 1 : 0);
        this.r = xlVar2;
        xlVar2.setVerticalScrollBarEnabled(true);
        hm hmVar2 = new hm(this, context, false);
        this.w = hmVar2;
        xlVar2.setAdapter(hmVar2);
        for (int i18 = 0; i18 < 8; i18++) {
            hmVar2.h.add(hmVar2.L());
        }
        xlVar2.setClipToPadding(false);
        xlVar2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        xlVar2.setItemAnimator(null);
        xlVar2.setLayoutAnimation(null);
        xlVar2.setOverScrollMode(2);
        xlVar2.setVisibility(4);
        xlVar2.setAlpha(0.0f);
        m2Var.addView(xlVar2, c8.na.c(80.0f, -1));
        jg.b0 b0Var = new jg.b0(null == true ? 1 : 0, null == true ? 1 : 0, 7);
        this.s = b0Var;
        xlVar2.setLayoutManager(b0Var);
        xlVar2.setOnItemClickListener(new bi.a(i10));
    }

    public static org.telegram.ui.Cells.r5 P(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i7) {
        xl xlVar = chatAttachAlertPhotoLayout.F;
        int childCount = xlVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = xlVar.getChildAt(i10);
            if (childAt.getTop() < xlVar.getMeasuredHeight() - chatAttachAlertPhotoLayout.b.a1() && (childAt instanceof org.telegram.ui.Cells.r5)) {
                org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) childAt;
                if (r5Var.getImageView().getTag() != null && ((Integer) r5Var.getImageView().getTag()).intValue() == i7) {
                    return r5Var;
                }
            }
        }
        return null;
    }

    public static int R(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        ti tiVar = chatAttachAlertPhotoLayout.b;
        org.telegram.ui.ActionBar.g2 g2Var = tiVar.a2;
        return ((g2Var instanceof org.telegram.ui.bn) && ((org.telegram.ui.bn) g2Var).g4 == 5) ? ((org.telegram.messenger.j0) g2Var.getMessagesController().A7.j0.b).c - ((org.telegram.ui.bn) tiVar.a2).M6.size() : ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    public static boolean V() {
        HashMap hashMap = t1;
        if (hashMap.isEmpty()) {
            return false;
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (entry.getValue() instanceof org.telegram.messenger.ef) {
                org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) entry.getValue();
                if (efVar.d() && efVar.j()) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean W() {
        int i7 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = u1;
            if (i7 >= arrayList.size()) {
                break;
            }
            Object obj = t1.get(arrayList.get(i7));
            if (!TextUtils.isEmpty(obj instanceof org.telegram.messenger.ef ? ((org.telegram.messenger.ef) obj).a : obj instanceof org.telegram.messenger.hf ? ((org.telegram.messenger.hf) obj).I : null)) {
                i10++;
            }
            i7++;
        }
        return i10 <= 1;
    }

    public static boolean f0() {
        HashMap hashMap = t1;
        if (hashMap.isEmpty()) {
            return false;
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if ((entry.getValue() instanceof org.telegram.messenger.ef) && ((org.telegram.messenger.ef) entry.getValue()).d()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTopScrollOffset() {
        return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.L(7.0f) + this.q1;
    }

    public static void r0(ImageView imageView, String str) {
        str.getClass();
        switch (str) {
            case "on":
                imageView.setImageResource(R.drawable.flash_on);
                imageView.setContentDescription(org.telegram.messenger.gd.N0(2131754913, null));
                break;
            case "off":
                imageView.setImageResource(R.drawable.flash_off);
                imageView.setContentDescription(org.telegram.messenger.gd.N0(2131754914, null));
                break;
            case "auto":
                imageView.setImageResource(R.drawable.flash_auto);
                imageView.setContentDescription(org.telegram.messenger.gd.N0(2131754915, null));
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlertKeepScreenOn(boolean z10) {
        Window window = this.b.getWindow();
        if (window == null) {
            return;
        }
        View peekDecorView = window.peekDecorView();
        if (peekDecorView == null || peekDecorView.isAttachedToWindow()) {
            if (z10) {
                window.addFlags(128);
            } else {
                window.clearFlags(128);
            }
        }
    }

    @Override // org.telegram.ui.Components.li
    public final void A() {
        ShutterButton shutterButton = this.l0;
        if (shutterButton == null) {
            return;
        }
        boolean z10 = this.R0;
        nt0 nt0Var = nt0.a;
        nt0 nt0Var2 = nt0.b;
        if (z10) {
            if (this.Q != null && shutterButton.getState() == nt0Var2) {
                shutterButton.a(nt0Var);
            }
            this.R0 = false;
            return;
        }
        if (this.Q != null && shutterButton.getState() == nt0Var2) {
            o0();
            CameraController.getInstance().stopVideoRecording(this.Q.getCameraSession(), false);
            shutterButton.a(nt0Var);
        }
        if (this.c0) {
            d0(false);
        }
        g0(true);
    }

    public final void A0() {
        ArrayList arrayList;
        hm hmVar;
        HashMap hashMap;
        ti tiVar = this.b;
        org.telegram.ui.ActionBar.g2 g2Var = tiVar.a2;
        org.telegram.ui.ActionBar.g2 g2Var2 = tiVar.a2;
        if (g2Var instanceof org.telegram.ui.bn) {
            xl xlVar = this.F;
            int childCount = xlVar.getChildCount();
            int i7 = 0;
            while (true) {
                arrayList = u1;
                hmVar = this.H;
                hashMap = t1;
                if (i7 >= childCount) {
                    break;
                }
                View childAt = xlVar.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.r5) {
                    org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) childAt;
                    int R = RecyclerView.R(childAt);
                    if (hmVar.f && R > this.N0) {
                        R--;
                    }
                    if (hmVar.d && this.U0 == this.V0) {
                        R--;
                    }
                    org.telegram.messenger.ef e02 = e0(R);
                    r5Var.setHasSpoiler(e02 != null && e02.M);
                    r5Var.setHighQuality(e02 != null && e02.c());
                    if ((g2Var2 instanceof org.telegram.ui.bn) && tiVar.R3) {
                        r5Var.b(e02 != null ? arrayList.indexOf(Integer.valueOf(e02.C)) : -1, e02 != null && hashMap.containsKey(Integer.valueOf(e02.C)), true);
                    } else {
                        r5Var.b(-1, e02 != null && hashMap.containsKey(Integer.valueOf(e02.C)), true);
                    }
                }
                i7++;
            }
            xl xlVar2 = this.r;
            int childCount2 = xlVar2.getChildCount();
            for (int i10 = 0; i10 < childCount2; i10++) {
                View childAt2 = xlVar2.getChildAt(i10);
                if (childAt2 instanceof org.telegram.ui.Cells.r5) {
                    org.telegram.ui.Cells.r5 r5Var2 = (org.telegram.ui.Cells.r5) childAt2;
                    int R2 = RecyclerView.R(childAt2);
                    if (hmVar.f && R2 > this.N0) {
                        R2--;
                    }
                    if (hmVar.d && this.U0 == this.V0) {
                        R2--;
                    }
                    org.telegram.messenger.ef e03 = e0(R2);
                    r5Var2.setHasSpoiler(e03 != null && e03.M);
                    r5Var2.setHighQuality(e03 != null && e03.c());
                    if ((g2Var2 instanceof org.telegram.ui.bn) && tiVar.R3) {
                        r5Var2.b(e03 != null ? arrayList.indexOf(Integer.valueOf(e03.C)) : -1, e03 != null && hashMap.containsKey(Integer.valueOf(e03.C)), true);
                    } else {
                        r5Var2.b(-1, e03 != null && hashMap.containsKey(Integer.valueOf(e03.C)), true);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00db  */
    @Override // org.telegram.ui.Components.li
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i7, int i10) {
        int D;
        int i11;
        int L;
        this.S0 = true;
        int i12 = this.N0;
        if (org.telegram.messenger.g0.Q1()) {
            this.N0 = 4;
        } else {
            Point point = org.telegram.messenger.g0.q;
            if (point.x > point.y) {
                this.N0 = 4;
            } else {
                this.N0 = 3;
            }
        }
        this.q1 = org.telegram.messenger.g0.L(48.0f) + org.telegram.messenger.g0.n;
        xl xlVar = this.F;
        ((FrameLayout.LayoutParams) xlVar.getLayoutParams()).topMargin = -this.q1;
        int L2 = (i7 - org.telegram.messenger.g0.L(4.0f)) - org.telegram.messenger.g0.L(4.0f);
        int i13 = this.N0;
        int i14 = L2 / i13;
        this.L0 = i14;
        if (this.M0 != i14 || i12 != i13) {
            this.M0 = i14;
            org.telegram.messenger.g0.g3(new ql(this, 4));
        }
        this.G.y1(Math.max(1, ((this.N0 - 1) * org.telegram.messenger.g0.L(2.0f)) + (this.L0 * this.N0)));
        hm hmVar = this.H;
        int ceil = (int) Math.ceil((hmVar.b() - 1) / this.N0);
        if (this.Q0) {
            D = org.telegram.messenger.g0.L(400.0f);
        } else {
            D = org.telegram.messenger.f3.D(2.0f, ceil - 1, this.L0 * ceil);
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        int b10 = org.telegram.messenger.f3.b(6.0f, (((i10 - D) - currentActionBarHeight) - org.telegram.messenger.g0.n) - org.telegram.messenger.g0.L(12.0f), 0);
        if (this.K != b10) {
            this.K = b10;
            hmVar.f();
        }
        if (!org.telegram.messenger.g0.Q1()) {
            Point point2 = org.telegram.messenger.g0.q;
            if (point2.x > point2.y) {
                i11 = (int) (i10 / 3.5f);
                L = ((i11 + currentActionBarHeight) - org.telegram.messenger.g0.L(52.0f)) + this.q1;
                if (L < 0) {
                    L = 0;
                }
                if (xlVar.getPaddingTop() == L || xlVar.getPaddingBottom() != this.e) {
                    xlVar.setPadding(org.telegram.messenger.g0.L(2.0f), L, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(48.0f) + this.e);
                }
                this.y.setTextSize(17.0f);
                this.S0 = false;
            }
        }
        i11 = (i10 / 5) * 2;
        L = ((i11 + currentActionBarHeight) - org.telegram.messenger.g0.L(52.0f)) + this.q1;
        if (L < 0) {
        }
        if (xlVar.getPaddingTop() == L) {
        }
        xlVar.setPadding(org.telegram.messenger.g0.L(2.0f), L, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(48.0f) + this.e);
        this.y.setTextSize(17.0f);
        this.S0 = false;
    }

    public final void B0(boolean z10) {
        TextView textView = this.q0;
        if (textView != null) {
            ti tiVar = this.b;
            int i7 = tiVar.O2;
            TextView textView2 = tiVar.h3;
            if (i7 != 0 || tiVar.R2 || tiVar.C1) {
                return;
            }
            HashMap hashMap = t1;
            Iterator it = hashMap.entrySet().iterator();
            boolean z11 = false;
            boolean z12 = false;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((org.telegram.messenger.ef) ((Map.Entry) it.next()).getValue()).b) {
                    z11 = true;
                } else {
                    z12 = true;
                }
                if (z11 && z12) {
                    break;
                }
            }
            int max = Math.max(1, hashMap.size());
            if (z11 && z12) {
                textView.setText(org.telegram.messenger.gd.G(hashMap.size(), "Media", new Object[0]).toUpperCase());
                if (max != this.N || z10) {
                    textView2.setText(org.telegram.messenger.gd.G(max, "MediaSelected", new Object[0]));
                }
            } else if (z11) {
                textView.setText(org.telegram.messenger.gd.G(hashMap.size(), "Videos", new Object[0]).toUpperCase());
                if (max != this.N || z10) {
                    textView2.setText(org.telegram.messenger.gd.G(max, "VideosSelected", new Object[0]));
                }
            } else {
                textView.setText(org.telegram.messenger.gd.G(hashMap.size(), "Photos", new Object[0]).toUpperCase());
                if (max != this.N || z10) {
                    textView2.setText(org.telegram.messenger.gd.G(max, "PhotosSelected", new Object[0]));
                }
            }
            boolean z13 = max > 1;
            tiVar.H1 = z13;
            tiVar.k3.setVisibility((!z13 || tiVar.O2 == 2) ? 8 : 0);
            this.N = max;
        }
    }

    @Override // org.telegram.ui.Components.li
    public final void C() {
        ti tiVar = this.b;
        if (!tiVar.isShowing() || tiVar.J || PhotoViewer.p1().Q1()) {
            return;
        }
        X(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b7, code lost:
    
        if (((org.telegram.ui.bn) r2).y() == false) goto L46;
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
    @Override // org.telegram.ui.Components.li
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(int i7) {
        boolean z10;
        boolean z11;
        boolean z12;
        long j3;
        boolean z13;
        boolean z14;
        boolean z15;
        org.telegram.ui.ActionBar.g2 g2Var;
        TLRPC.ChatFull chatFull;
        boolean z16;
        ti tiVar = this.b;
        if (i7 > 1) {
            org.telegram.messenger.fj fjVar = tiVar.F3;
            org.telegram.ui.ActionBar.q0 q0Var = tiVar.Y2;
            if (fjVar == null) {
                if (getStarsPrice() <= 0) {
                    q0Var.T(0);
                    z10 = true;
                } else {
                    q0Var.u(0);
                    z10 = false;
                }
                if (!this.A0 || getStarsPrice() > 0) {
                    q0Var.u(1);
                    z11 = false;
                    if (i7 != 0) {
                        tiVar.Y2.u(4);
                    }
                    org.telegram.ui.ActionBar.y0 y0Var = this.a1;
                    if (i7 <= 1) {
                        tiVar.Y2.T(5);
                        tiVar.Y2.T(7);
                        y0Var.setText(org.telegram.messenger.gd.N0(2131745439, null));
                    } else {
                        tiVar.Y2.u(5);
                        tiVar.Y2.u(7);
                        if (i7 != 0) {
                            y0Var.setText(org.telegram.messenger.gd.N0(2131745440, null));
                        }
                    }
                    if (i7 > 0 && getStarsPrice() <= 0) {
                        if (tiVar != null) {
                            org.telegram.ui.ActionBar.g2 g2Var2 = tiVar.a2;
                            if (g2Var2 instanceof org.telegram.ui.bn) {
                            }
                        }
                        z12 = true;
                        if (i7 > 0 || tiVar == null) {
                            j3 = 0;
                            z13 = z10;
                        } else {
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = tiVar.e2;
                            if (chatAttachAlertPhotoLayout == null) {
                                j3 = 0;
                                z16 = false;
                                z13 = z10;
                            } else {
                                HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
                                ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                                if (!selectedPhotos.isEmpty()) {
                                    long j10 = 0;
                                    int i10 = 0;
                                    z16 = false;
                                    loop0: while (true) {
                                        j3 = j10;
                                        z13 = z10;
                                        if (i10 >= Math.ceil(selectedPhotos.size() / 10.0f)) {
                                            break;
                                        }
                                        int i11 = i10 * 10;
                                        int min = Math.min(10, selectedPhotos.size() - i11);
                                        Utilities.b.nextLong();
                                        for (int i12 = 0; i12 < min; i12++) {
                                            int i13 = i11 + i12;
                                            if (i13 < selectedPhotosOrder.size()) {
                                                CharSequence charSequence = ((org.telegram.messenger.ef) selectedPhotos.get(selectedPhotosOrder.get(i13))).a;
                                                String charSequence2 = charSequence == null ? "" : charSequence.toString();
                                                if (tiVar.b1() != null && TextUtils.isEmpty(charSequence2) && i12 == 0) {
                                                    charSequence2 = tiVar.b1().getText().toString();
                                                }
                                                if (TextUtils.isEmpty(charSequence2)) {
                                                    continue;
                                                } else if (z16) {
                                                    break loop0;
                                                } else {
                                                    z16 = true;
                                                }
                                            }
                                        }
                                        i10++;
                                        j10 = j3;
                                        z10 = z13;
                                    }
                                } else {
                                    j3 = 0;
                                    z13 = z10;
                                }
                                z16 = false;
                            }
                            if (z16 && (tiVar.a2 instanceof org.telegram.ui.bn)) {
                                z14 = true;
                                if (i7 > 0 && tiVar != null) {
                                    g2Var = tiVar.a2;
                                    if ((g2Var instanceof org.telegram.ui.bn) && org.telegram.messenger.v3.V(((org.telegram.ui.bn) g2Var).e) && (chatFull = ((org.telegram.ui.bn) g2Var).r8) != null && chatFull.paid_media_allowed) {
                                        z15 = true;
                                        if (!z12) {
                                            String N0 = org.telegram.messenger.gd.N0(2131751142, null);
                                            org.telegram.ui.ActionBar.y0 y0Var2 = this.Z0;
                                            y0Var2.setText(N0);
                                            y0Var2.setAnimatedIcon(R.raw.photo_spoiler);
                                            tiVar.Y2.u(3);
                                        } else if (tiVar != null) {
                                            tiVar.Y2.T(3);
                                        }
                                        if (tiVar != null) {
                                            org.telegram.ui.ActionBar.q0 q0Var2 = tiVar.Y2;
                                            if (getSelectedPhotosCount() == i7) {
                                                int selectedPhotosHighQualityCount = getSelectedPhotosHighQualityCount();
                                                org.telegram.ui.ActionBar.y0 y0Var3 = this.b1;
                                                if (selectedPhotosHighQualityCount > 0) {
                                                    y0Var3.setText(org.telegram.messenger.gd.N0(2131745424, null));
                                                    y0Var3.setIcon(R.drawable.menu_quality_sd);
                                                } else {
                                                    y0Var3.setText(org.telegram.messenger.gd.N0(2131745425, null));
                                                    y0Var3.setIcon(R.drawable.menu_quality_hd);
                                                }
                                                q0Var2.T(2);
                                            } else {
                                                q0Var2.u(2);
                                            }
                                        }
                                        sa0 sa0Var = this.e1;
                                        if (z14) {
                                            sa0Var.setVisibility(0);
                                        } else {
                                            sa0Var.setVisibility(8);
                                        }
                                        if ((!z12 || z14) && (z11 || z13)) {
                                            tiVar.Y2.T(6);
                                        } else {
                                            tiVar.Y2.u(6);
                                        }
                                        if (!z15) {
                                            tiVar.Y2.u(9);
                                            return;
                                        }
                                        org.telegram.ui.ActionBar.y0 y0Var4 = this.c1;
                                        if (y0Var4 != null) {
                                            long starsPrice = getStarsPrice();
                                            if (starsPrice > j3) {
                                                y0Var4.setText(org.telegram.messenger.gd.N0(2131747534, null));
                                                y0Var4.setSubtext(org.telegram.messenger.gd.G((int) starsPrice, "Stars", new Object[0]));
                                            } else {
                                                y0Var4.setText(org.telegram.messenger.gd.N0(2131747536, null));
                                                y0Var4.setSubtext(null);
                                            }
                                        }
                                        this.F.M(new org.telegram.ui.hq(1));
                                        tiVar.Y2.T(9);
                                        return;
                                    }
                                }
                                z15 = false;
                                if (!z12) {
                                }
                                if (tiVar != null) {
                                }
                                sa0 sa0Var2 = this.e1;
                                if (z14) {
                                }
                                if (z12) {
                                }
                                tiVar.Y2.T(6);
                                if (!z15) {
                                }
                            }
                        }
                        z14 = false;
                        if (i7 > 0) {
                            g2Var = tiVar.a2;
                            if (g2Var instanceof org.telegram.ui.bn) {
                                z15 = true;
                                if (!z12) {
                                }
                                if (tiVar != null) {
                                }
                                sa0 sa0Var22 = this.e1;
                                if (z14) {
                                }
                                if (z12) {
                                }
                                tiVar.Y2.T(6);
                                if (!z15) {
                                }
                            }
                        }
                        z15 = false;
                        if (!z12) {
                        }
                        if (tiVar != null) {
                        }
                        sa0 sa0Var222 = this.e1;
                        if (z14) {
                        }
                        if (z12) {
                        }
                        tiVar.Y2.T(6);
                        if (!z15) {
                        }
                    }
                    z12 = false;
                    if (i7 > 0) {
                    }
                    j3 = 0;
                    z13 = z10;
                    z14 = false;
                    if (i7 > 0) {
                    }
                    z15 = false;
                    if (!z12) {
                    }
                    if (tiVar != null) {
                    }
                    sa0 sa0Var2222 = this.e1;
                    if (z14) {
                    }
                    if (z12) {
                    }
                    tiVar.Y2.T(6);
                    if (!z15) {
                    }
                } else {
                    q0Var.T(1);
                    z11 = true;
                    if (i7 != 0) {
                    }
                    org.telegram.ui.ActionBar.y0 y0Var5 = this.a1;
                    if (i7 <= 1) {
                    }
                    if (i7 > 0) {
                        if (tiVar != null) {
                        }
                        z12 = true;
                        if (i7 > 0) {
                        }
                        j3 = 0;
                        z13 = z10;
                        z14 = false;
                        if (i7 > 0) {
                        }
                        z15 = false;
                        if (!z12) {
                        }
                        if (tiVar != null) {
                        }
                        sa0 sa0Var22222 = this.e1;
                        if (z14) {
                        }
                        if (z12) {
                        }
                        tiVar.Y2.T(6);
                        if (!z15) {
                        }
                    }
                    z12 = false;
                    if (i7 > 0) {
                    }
                    j3 = 0;
                    z13 = z10;
                    z14 = false;
                    if (i7 > 0) {
                    }
                    z15 = false;
                    if (!z12) {
                    }
                    if (tiVar != null) {
                    }
                    sa0 sa0Var222222 = this.e1;
                    if (z14) {
                    }
                    if (z12) {
                    }
                    tiVar.Y2.T(6);
                    if (!z15) {
                    }
                }
            }
        }
        org.telegram.ui.ActionBar.q0 q0Var3 = tiVar.Y2;
        org.telegram.ui.ActionBar.q0 q0Var4 = tiVar.Y2;
        q0Var3.u(0);
        if (i7 == 0) {
            q0Var4.T(4);
            q0Var4.u(1);
        } else if (this.A0 && getStarsPrice() <= 0 && tiVar.F3 == null) {
            q0Var4.T(1);
            z10 = false;
            z11 = true;
            if (i7 != 0) {
            }
            org.telegram.ui.ActionBar.y0 y0Var52 = this.a1;
            if (i7 <= 1) {
            }
            if (i7 > 0) {
            }
            z12 = false;
            if (i7 > 0) {
            }
            j3 = 0;
            z13 = z10;
            z14 = false;
            if (i7 > 0) {
            }
            z15 = false;
            if (!z12) {
            }
            if (tiVar != null) {
            }
            sa0 sa0Var2222222 = this.e1;
            if (z14) {
            }
            if (z12) {
            }
            tiVar.Y2.T(6);
            if (!z15) {
            }
        } else {
            q0Var4.u(1);
        }
        z10 = false;
        z11 = false;
        if (i7 != 0) {
        }
        org.telegram.ui.ActionBar.y0 y0Var522 = this.a1;
        if (i7 <= 1) {
        }
        if (i7 > 0) {
        }
        z12 = false;
        if (i7 > 0) {
        }
        j3 = 0;
        z13 = z10;
        z14 = false;
        if (i7 > 0) {
        }
        z15 = false;
        if (!z12) {
        }
        if (tiVar != null) {
        }
        sa0 sa0Var22222222 = this.e1;
        if (z14) {
        }
        if (z12) {
        }
        tiVar.Y2.T(6);
        if (!z15) {
        }
    }

    @Override // org.telegram.ui.Components.li
    public final boolean F(int i7) {
        if (!this.c0) {
            return false;
        }
        if (i7 != 24 && i7 != 25 && i7 != 79 && i7 != 85) {
            return false;
        }
        ((vl) this.l0.getDelegate()).a();
        return true;
    }

    @Override // org.telegram.ui.Components.li
    public final void H(li liVar) {
        ViewPropertyAnimator viewPropertyAnimator = this.p1;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.x.setVisibility(0);
        boolean z10 = liVar instanceof pm;
        TextView textView = this.y;
        if (z10) {
            ViewPropertyAnimator interpolator = textView.animate().alpha(1.0f).setDuration(150L).setInterpolator(kr.j);
            this.p1 = interpolator;
            interpolator.start();
        } else {
            c0();
            textView.setAlpha(1.0f);
        }
        this.b.V2.setTitle("");
        this.G.h1(0, 0);
        if (z10) {
            this.F.post(new xd(18, this, liVar));
        }
        Y();
        p0();
    }

    @Override // org.telegram.ui.Components.li
    public final void I() {
        this.O = false;
        em emVar = this.Q;
        if (emVar != null) {
            emVar.setVisibility(0);
        }
        if (this.v0) {
            this.v0 = false;
            X(true);
        }
    }

    @Override // org.telegram.ui.Components.li
    public final void J() {
        this.F.y0(0);
    }

    public final int T(org.telegram.messenger.ef efVar, int i7) {
        Integer valueOf = Integer.valueOf(efVar.C);
        HashMap hashMap = t1;
        boolean containsKey = hashMap.containsKey(valueOf);
        ArrayList arrayList = u1;
        if (containsKey) {
            efVar.N = 0L;
            efVar.M = false;
            efVar.O = null;
            efVar.z = null;
            hashMap.remove(valueOf);
            int indexOf = arrayList.indexOf(valueOf);
            if (indexOf >= 0) {
                arrayList.remove(indexOf);
            }
            B0(false);
            z0();
            if (i7 >= 0) {
                efVar.e();
                this.i1.X(i7);
            }
            return indexOf;
        }
        efVar.N = getStarsPrice();
        efVar.M = getStarsPrice() > 0;
        efVar.R = false;
        if (f0()) {
            efVar.O = Boolean.valueOf(!V());
        }
        efVar.z = Boolean.valueOf(efVar.c());
        boolean Z = Z(true);
        hashMap.put(valueOf, efVar);
        arrayList.add(valueOf);
        if (Z) {
            A0();
            return -1;
        }
        B0(true);
        return -1;
    }

    public final void U() {
        em emVar = this.Q;
        if (emVar != null) {
            if (!this.c0) {
                emVar.setTranslationX(this.V[0]);
            }
            int i7 = this.L0;
            int L = org.telegram.messenger.g0.L(2.0f) + (i7 * 2);
            if (this.c0) {
                return;
            }
            this.Q.setClipTop((int) this.a0);
            this.Q.setClipBottom((int) this.b0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.Q.getLayoutParams();
            if (layoutParams.height == L && layoutParams.width == i7) {
                return;
            }
            layoutParams.width = i7;
            layoutParams.height = L;
            this.Q.setLayoutParams(layoutParams);
            org.telegram.messenger.g0.g3(new xd(19, this, layoutParams));
        }
    }

    public final void X(boolean z10) {
        hm hmVar;
        ti tiVar = this.b;
        boolean z11 = tiVar.Q1;
        org.telegram.ui.ActionBar.g2 g2Var = tiVar.a2;
        if (z11 || !this.n) {
            return;
        }
        boolean z12 = this.O0;
        boolean z13 = this.P0;
        org.telegram.ui.ActionBar.g2 Q = g2Var == null ? LaunchActivity.Q() : g2Var;
        if (Q == null || Q.getParentActivity() == null) {
            return;
        }
        if (org.telegram.messenger.bz.y0) {
            boolean z14 = Q.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0;
            this.P0 = z14;
            if (z14) {
                if (z10) {
                    try {
                        g2Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE"}, 17);
                    } catch (Exception unused) {
                    }
                }
                this.O0 = false;
            } else {
                if (z10 || org.telegram.messenger.bz.P0) {
                    CameraController.getInstance().initCamera(null);
                }
                this.O0 = CameraController.getInstance().isCameraInitied();
            }
        } else {
            this.O0 = false;
        }
        if ((z12 != this.O0 || z13 != this.P0) && (hmVar = this.H) != null) {
            hmVar.f();
        }
        if (tiVar.Q1 || !tiVar.isShowing() || !this.O0 || ((Paint) tiVar.Z.b).getAlpha() == 0 || this.c0) {
            return;
        }
        v0();
    }

    public final void Y() {
        v4.f1 K;
        float[] fArr;
        if (PhotoViewer.A1() && PhotoViewer.p1().p5 != null && PhotoViewer.p1().p5.W) {
            return;
        }
        em emVar = this.Q;
        if (emVar != null) {
            emVar.invalidateOutline();
        }
        int i7 = this.N0 - 1;
        xl xlVar = this.F;
        v4.f1 K2 = xlVar.K(i7);
        if (K2 != null) {
            K2.a.invalidateOutline();
        }
        if ((!this.H.d || !this.O0 || this.U0 != this.V0) && (K = xlVar.K(0)) != null) {
            K.a.invalidateOutline();
        }
        em emVar2 = this.Q;
        if (emVar2 != null) {
            emVar2.invalidate();
        }
        cm cmVar = this.S;
        if (cmVar != null) {
            ((ViewGroup.MarginLayoutParams) cmVar.getLayoutParams()).topMargin = getRootWindowInsets() == null ? org.telegram.messenger.g0.L(16.0f) : getRootWindowInsets().getSystemWindowInsetTop() + org.telegram.messenger.g0.L(2.0f);
        }
        if (this.O0) {
            int childCount = xlVar.getChildCount();
            int i10 = 0;
            while (true) {
                fArr = this.V;
                if (i10 >= childCount) {
                    break;
                }
                View childAt = xlVar.getChildAt(i10);
                if (!(childAt instanceof org.telegram.ui.Cells.l5)) {
                    i10++;
                } else if (childAt.isAttachedToWindow()) {
                    float y10 = getY() + xlVar.getY() + childAt.getY();
                    ti tiVar = this.b;
                    ViewGroup viewGroup = tiVar.b;
                    uh uhVar = tiVar.w3;
                    ai.h0 h0Var = tiVar.M2;
                    float y11 = viewGroup.getY() + y10;
                    float x10 = (tiVar.b.getX() + (getX() + (xlVar.getX() + childAt.getX()))) - getRootWindowInsets().getSystemWindowInsetLeft();
                    float alpha = (h0Var.getAlpha() * h0Var.getMeasuredHeight()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (!tiVar.b2 ? org.telegram.messenger.g0.m : 0);
                    hi.j jVar = tiVar.C4;
                    if (jVar != null && jVar.g()) {
                        alpha = Math.max(alpha, (tiVar.C4.e() + tiVar.C4.getY()) - tiVar.j4);
                    }
                    float f10 = y10 < alpha ? alpha - y10 : 0.0f;
                    if (f10 != this.a0) {
                        this.a0 = f10;
                        em emVar3 = this.Q;
                        if (emVar3 != null) {
                            emVar3.invalidateOutline();
                            this.Q.invalidate();
                        }
                    }
                    float translationY = (int) (uhVar.getTranslationY() + (tiVar.b.getMeasuredHeight() - uhVar.getMeasuredHeight()));
                    hi.j jVar2 = tiVar.C4;
                    if (jVar2 != null) {
                        translationY -= jVar2.d() - org.telegram.messenger.g0.L(6.0f);
                    }
                    if (childAt.getMeasuredHeight() + y10 > translationY) {
                        this.b0 = Math.min(-org.telegram.messenger.g0.L(5.0f), y10 - translationY) + childAt.getMeasuredHeight();
                    } else {
                        this.b0 = 0.0f;
                    }
                    fArr[0] = x10;
                    fArr[1] = y11;
                    U();
                    return;
                }
            }
            if (this.a0 != 0.0f) {
                this.a0 = 0.0f;
                em emVar4 = this.Q;
                if (emVar4 != null) {
                    emVar4.invalidateOutline();
                    this.Q.invalidate();
                }
            }
            fArr[0] = org.telegram.messenger.g0.L(-400.0f);
            fArr[1] = 0.0f;
            U();
        }
    }

    public final boolean Z(boolean z10) {
        if (getStarsPrice() <= 0) {
            return false;
        }
        boolean z11 = false;
        while (true) {
            HashMap hashMap = t1;
            if (hashMap.size() <= 10 - (z10 ? 1 : 0)) {
                break;
            }
            ArrayList arrayList = u1;
            if (arrayList.isEmpty()) {
                break;
            }
            Object obj = hashMap.get(arrayList.get(0));
            if (!(obj instanceof org.telegram.messenger.ef)) {
                break;
            }
            T((org.telegram.messenger.ef) obj, -1);
            z11 = true;
        }
        return z11;
    }

    @Override // org.telegram.ui.Components.li
    public final void a(CharSequence charSequence) {
        Object obj;
        int i7 = 0;
        while (true) {
            ArrayList arrayList = u1;
            if (i7 >= arrayList.size()) {
                return;
            }
            if (i7 == 0) {
                Object obj2 = arrayList.get(i7);
                HashMap hashMap = t1;
                Object obj3 = hashMap.get(obj2);
                if (obj3 instanceof org.telegram.messenger.ef) {
                    org.telegram.messenger.ef clone = ((org.telegram.messenger.ef) obj3).clone();
                    CharSequence[] charSequenceArr = {charSequence};
                    clone.n = org.telegram.messenger.ri.d0(org.telegram.messenger.i10.t0).Y(charSequenceArr, false, true);
                    clone.a = charSequenceArr[0];
                    obj = clone;
                } else {
                    boolean z10 = obj3 instanceof org.telegram.messenger.hf;
                    obj = obj3;
                    if (z10) {
                        org.telegram.messenger.hf clone2 = ((org.telegram.messenger.hf) obj3).clone();
                        CharSequence[] charSequenceArr2 = {charSequence};
                        clone2.n = org.telegram.messenger.ri.d0(org.telegram.messenger.i10.t0).Y(charSequenceArr2, false, true);
                        clone2.I = charSequenceArr2[0];
                        obj = clone2;
                    }
                }
                hashMap.put(obj2, obj);
            }
            i7++;
        }
    }

    public final boolean a0(org.telegram.messenger.ef efVar) {
        boolean z10 = this.x0;
        org.telegram.ui.ActionBar.i6 i6Var = this.a;
        ti tiVar = this.b;
        if (z10 || !efVar.b) {
            if (this.y0 || efVar.b) {
                return false;
            }
            if (!tiVar.O0()) {
                org.telegram.messenger.f3.o(null, 2131749366, new kc(tiVar.p3, i6Var), null);
                return true;
            }
        } else if (!tiVar.O0()) {
            org.telegram.messenger.f3.o(null, 2131749362, new kc(tiVar.p3, i6Var), null);
            return true;
        }
        return true;
    }

    @Override // org.telegram.ui.Components.li
    public final boolean b() {
        return !this.c0;
    }

    public final void b0() {
        if (this.Q0) {
            boolean h02 = h0();
            this.Q0 = h02;
            if (!h02) {
                i0();
            }
            this.H.f();
            this.w.f();
        }
    }

    @Override // org.telegram.ui.Components.li
    public final boolean c() {
        Iterator it = t1.entrySet().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof org.telegram.messenger.ef) {
                if (((org.telegram.messenger.ef) value).x != 0) {
                    return false;
                }
            } else if ((value instanceof org.telegram.messenger.hf) && ((org.telegram.messenger.hf) value).x != 0) {
                return false;
            }
        }
        return true;
    }

    public final void c0() {
        String N0 = org.telegram.messenger.gd.N0(2131751142, null);
        org.telegram.ui.ActionBar.y0 y0Var = this.Z0;
        y0Var.setText(N0);
        y0Var.setAnimatedIcon(R.raw.photo_spoiler);
        this.b.Y2.T(1);
        HashMap hashMap = t1;
        if (!hashMap.isEmpty()) {
            Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                ((org.telegram.messenger.ef) ((Map.Entry) it.next()).getValue()).e();
            }
            hashMap.clear();
            u1.clear();
        }
        ArrayList arrayList = s1;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) arrayList.get(i7);
                new File(efVar.I).delete();
                if (efVar.h != null) {
                    new File(efVar.h).delete();
                }
                if (efVar.c != null) {
                    new File(efVar.c).delete();
                }
            }
            arrayList.clear();
        }
        this.H.f();
        this.w.f();
    }

    @Override // org.telegram.ui.Components.li
    public final void d() {
        boolean z10 = this.f1;
        int i7 = z10 ? org.telegram.ui.ActionBar.n6.Yg : org.telegram.ui.ActionBar.n6.j5;
        int i10 = org.telegram.ui.ActionBar.n6.c7;
        org.telegram.ui.ActionBar.i6 i6Var = this.a;
        this.I.setTextColor(org.telegram.ui.ActionBar.n6.w0(i10, i6Var));
        int i11 = org.telegram.ui.ActionBar.n6.A5;
        xl xlVar = this.F;
        org.telegram.ui.ActionBar.u6.H(xlVar, i11, i6Var);
        xlVar.K(0);
        org.telegram.ui.ActionBar.u6.U(this.y, i7, i6Var);
        int w02 = org.telegram.ui.ActionBar.n6.w0(z10 ? org.telegram.ui.ActionBar.n6.Yg : org.telegram.ui.ActionBar.n6.E8, i6Var);
        hi.d3 d3Var = this.x;
        d3Var.P(w02, false);
        d3Var.P(org.telegram.ui.ActionBar.n6.w0(z10 ? org.telegram.ui.ActionBar.n6.Yg : org.telegram.ui.ActionBar.n6.E8, i6Var), true);
        d3Var.I(org.telegram.ui.ActionBar.n6.w0(z10 ? org.telegram.ui.ActionBar.n6.ah : org.telegram.ui.ActionBar.n6.G8, i6Var));
        org.telegram.ui.ActionBar.n6.C1(org.telegram.ui.ActionBar.n6.w0(i7, i6Var), this.E);
    }

    public final void d0(boolean z10) {
        em emVar;
        if (this.t0 || this.Q == null) {
            return;
        }
        int i7 = this.L0;
        int[] iArr = this.g0;
        iArr[1] = i7;
        iArr[2] = org.telegram.messenger.g0.L(2.0f) + (i7 * 2);
        Runnable runnable = this.o0;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.o0 = null;
        }
        org.telegram.messenger.g0.m3(this.b, ((double) org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.a7, this.a))) > 0.721d);
        TextView textView = this.q0;
        xl xlVar = this.r;
        bi.g3 g3Var = this.k0;
        xl xlVar2 = this.F;
        ImageView[] imageViewArr = this.T;
        g81 g81Var = this.m0;
        if (z10) {
            this.k1 = this.Q.getTranslationY();
            this.e0 = true;
            if (xlVar2 != null) {
                xlVar2.invalidate();
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this, "cameraOpenProgress", 0.0f));
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(g3Var, (Property<bi.g3, Float>) property, 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(g81Var, (Property<g81, Float>) property, 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(xlVar, (Property<xl, Float>) property, 0.0f));
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
            this.g1.d();
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(220L);
            animatorSet.setInterpolator(kr.f);
            animatorSet.addListener(new wl(this, 3));
            animatorSet.start();
        } else {
            this.j1 = false;
            setAlertKeepScreenOn(false);
            setCameraOpenProgress(0.0f);
            iArr[0] = 0;
            setCameraOpenProgress(0.0f);
            g3Var.setAlpha(0.0f);
            g3Var.setVisibility(8);
            g81Var.setAlpha(0.0f);
            g81Var.setTag(null);
            g81Var.setVisibility(8);
            xlVar.setAlpha(0.0f);
            textView.setAlpha(0.0f);
            xlVar.setVisibility(8);
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
            this.c0 = false;
            em emVar2 = this.Q;
            if (emVar2 != null) {
                emVar2.setFpsLimit(30);
                this.Q.setSystemUiVisibility(1024);
            }
            if (xlVar2 != null) {
                xlVar2.invalidate();
            }
        }
        em emVar3 = this.Q;
        if (emVar3 != null) {
            emVar3.setImportantForAccessibility(0);
        }
        xlVar2.setImportantForAccessibility(0);
        if (org.telegram.messenger.pc.e(360928) || (emVar = this.Q) == null) {
            return;
        }
        emVar.showTexture(false, z10);
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        ti tiVar;
        if (i7 != org.telegram.messenger.ks.r2) {
            if (i7 == org.telegram.messenger.ks.o4) {
                X(false);
                return;
            }
            return;
        }
        hm hmVar = this.H;
        if (hmVar != null) {
            if (t0()) {
                this.V0 = MediaController.a2;
            } else {
                this.V0 = MediaController.b2;
            }
            if (this.U0 == null || ((tiVar = this.b) != null && tiVar.B1)) {
                this.U0 = this.V0;
            } else if (t0()) {
                int i11 = 0;
                while (true) {
                    if (i11 >= MediaController.c2.size()) {
                        break;
                    }
                    org.telegram.messenger.ue ueVar = (org.telegram.messenger.ue) MediaController.c2.get(i11);
                    int i12 = ueVar.a;
                    org.telegram.messenger.ue ueVar2 = this.U0;
                    if (i12 == ueVar2.a && ueVar.b == ueVar2.b) {
                        this.U0 = ueVar;
                        break;
                    }
                    i11++;
                }
            }
            this.Y0 = false;
            this.I.c();
            hmVar.f();
            this.w.f();
            ArrayList arrayList = u1;
            if (!arrayList.isEmpty() && this.V0 != null) {
                int size = arrayList.size();
                for (int i13 = 0; i13 < size; i13++) {
                    Integer num = (Integer) arrayList.get(i13);
                    HashMap hashMap = t1;
                    Object obj = hashMap.get(num);
                    org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) this.V0.f.get(num.intValue());
                    if (efVar != null) {
                        if (obj instanceof org.telegram.messenger.ef) {
                            efVar.g((org.telegram.messenger.ef) obj);
                        }
                        hashMap.put(num, efVar);
                    }
                }
            }
            x0();
        }
    }

    public final org.telegram.messenger.ef e0(int i7) {
        if (i7 < 0) {
            return null;
        }
        ArrayList arrayList = s1;
        int size = arrayList.size();
        if (i7 < size) {
            return (org.telegram.messenger.ef) arrayList.get(i7);
        }
        int i10 = i7 - size;
        org.telegram.messenger.ue ueVar = this.U0;
        if (ueVar == null || i10 >= ueVar.e.size()) {
            return null;
        }
        return (org.telegram.messenger.ef) this.U0.e.get(i10);
    }

    public final void g0(boolean z10) {
        if (!this.O0 || this.Q == null) {
            return;
        }
        q0();
        this.R.i();
        this.Q.destroy(z10, null);
        AnimatorSet animatorSet = this.P;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.P = null;
        }
        org.telegram.messenger.g0.h3(new ql(this, 0), 300L);
        this.d0 = false;
    }

    public ArrayList<Object> getAllPhotosArray() {
        org.telegram.messenger.ue ueVar = this.U0;
        ArrayList<Object> arrayList = s1;
        if (ueVar == null) {
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

    @Override // org.telegram.ui.Components.li
    public int getButtonsHideOffset() {
        return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + super.getButtonsHideOffset();
    }

    public float getCameraOpenProgress() {
        return this.f0;
    }

    @Override // org.telegram.ui.Components.li
    public int getCurrentItemTop() {
        xl xlVar = this.F;
        int childCount = xlVar.getChildCount();
        sy syVar = this.I;
        if (childCount <= 0) {
            xlVar.setTopGlowOffset(xlVar.getPaddingTop());
            syVar.setTranslationY(0.0f);
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = xlVar.getChildAt(0);
        mj0 mj0Var = (mj0) xlVar.G(childAt);
        int top = childAt.getTop() - this.q1;
        int L = org.telegram.messenger.g0.L(7.0f);
        if (top < org.telegram.messenger.g0.L(7.0f) || mj0Var == null || mj0Var.b() != 0) {
            top = L;
        }
        syVar.setTranslationY(((((getMeasuredHeight() - top) - org.telegram.messenger.g0.L(50.0f)) - syVar.getMeasuredHeight()) / 2.0f) + top);
        xlVar.setTopGlowOffset(top);
        return top;
    }

    @Override // org.telegram.ui.Components.li
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.li
    public int getListTopPadding() {
        return this.F.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.li
    public int getSelectedItemsCount() {
        return u1.size();
    }

    public HashMap<Object, Object> getSelectedPhotos() {
        return t1;
    }

    public int getSelectedPhotosCount() {
        int i7 = 0;
        for (Object obj : t1.values()) {
            if (obj instanceof org.telegram.messenger.ef) {
                org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) obj;
                if (!efVar.b && efVar.s == null) {
                    i7++;
                }
            }
        }
        return i7;
    }

    public int getSelectedPhotosHighQualityCount() {
        int i7 = 0;
        for (Object obj : t1.values()) {
            if (obj instanceof org.telegram.messenger.ef) {
                org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) obj;
                if (efVar.c() && !efVar.b && efVar.s == null) {
                    i7++;
                }
            }
        }
        return i7;
    }

    public ArrayList<Object> getSelectedPhotosOrder() {
        return u1;
    }

    public long getStarsPrice() {
        Iterator it = t1.entrySet().iterator();
        if (it.hasNext()) {
            return ((org.telegram.messenger.ef) ((Map.Entry) it.next()).getValue()).N;
        }
        return 0L;
    }

    public final boolean h0() {
        Activity W = org.telegram.messenger.g0.W(getContext());
        if (W == null) {
            W = this.b.a2.getParentActivity();
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
        if ((t0() ? MediaController.a2 : MediaController.b2) == null) {
            MediaController.O(0);
        }
    }

    @Override // org.telegram.ui.Components.li
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
        ti tiVar = this.b;
        boolean z10 = tiVar.Q1;
        org.telegram.ui.ActionBar.g2 g2Var = tiVar.a2;
        if (z10) {
            return;
        }
        r1 = true;
        File file = null;
        MediaMetadataRetriever mediaMetadataRetriever3 = null;
        if (i7 == 0) {
            PhotoViewer.p1().J2(g2Var.getParentActivity(), null, this.a);
            PhotoViewer p12 = PhotoViewer.p1();
            int i12 = tiVar.Q3;
            boolean z11 = tiVar.R3;
            p12.h = i12;
            p12.n = z11;
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
                    int i14 = v1;
                    v1 = i14 - 1;
                    org.telegram.messenger.ef efVar = new org.telegram.messenger.ef(i14, str, ((Integer) N0.first).intValue(), false, i13, i11);
                    efVar.n(N0);
                    efVar.L = true;
                    m0(efVar, false, true);
                    return;
                }
            } catch (Exception unused2) {
                i10 = 0;
            }
            int i132 = i10;
            int i142 = v1;
            v1 = i142 - 1;
            org.telegram.messenger.ef efVar2 = new org.telegram.messenger.ef(i142, str, ((Integer) N0.first).intValue(), false, i132, i11);
            efVar2.n(N0);
            efVar2.L = true;
            m0(efVar2, false, true);
            return;
        }
        if (i7 == 2) {
            if (org.telegram.messenger.s2.a) {
                org.telegram.messenger.a8.b("pic path " + str);
            }
            if (intent != null && str != null && a8.p0.B(str)) {
                intent = null;
            }
            if (intent != null) {
                Uri data = intent.getData();
                if (data != null) {
                    if (org.telegram.messenger.s2.a) {
                        org.telegram.messenger.a8.b("video record uri " + data.toString());
                    }
                    str2 = org.telegram.messenger.g0.T0(data);
                    if (org.telegram.messenger.s2.a) {
                        org.telegram.messenger.a8.b("resolved path = " + str2);
                    }
                    if (str2 != null) {
                    }
                }
                str2 = str;
                if (!(g2Var instanceof org.telegram.ui.bn) || !((org.telegram.ui.bn) g2Var).y()) {
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
                Bitmap r10 = org.telegram.messenger.zy.r(1, str4);
                String str5 = "-2147483648_" + org.telegram.messenger.bz.p() + ".jpg";
                file = org.telegram.messenger.w7.z(4);
                File file2 = new File(file, str5);
                r10.compress(Bitmap.CompressFormat.JPEG, 55, new FileOutputStream(file2));
                org.telegram.messenger.bz.y();
                int i15 = v1;
                v1 = i15 - 1;
                org.telegram.messenger.ef efVar3 = new org.telegram.messenger.ef(i15, str4, 0, true, r10.getWidth(), r10.getHeight());
                efVar3.E = (int) r13;
                efVar3.c = file2.getAbsolutePath();
                m0(efVar3, false, true);
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
            Bitmap r102 = org.telegram.messenger.zy.r(1, str4);
            String str52 = "-2147483648_" + org.telegram.messenger.bz.p() + ".jpg";
            file = org.telegram.messenger.w7.z(4);
            File file22 = new File(file, str52);
            r102.compress(Bitmap.CompressFormat.JPEG, 55, new FileOutputStream(file22));
            org.telegram.messenger.bz.y();
            int i152 = v1;
            v1 = i152 - 1;
            org.telegram.messenger.ef efVar32 = new org.telegram.messenger.ef(i152, str4, 0, true, r102.getWidth(), r102.getHeight());
            efVar32.E = (int) r13;
            efVar32.c = file22.getAbsolutePath();
            m0(efVar32, false, true);
        }
    }

    public final void k0(boolean z10) {
        em emVar;
        em emVar2 = this.Q;
        if (emVar2 == null || this.P != null) {
            return;
        }
        ti tiVar = this.b;
        if (tiVar.J) {
            return;
        }
        emVar2.initTexture();
        boolean t02 = t0();
        TextView textView = this.r0;
        int i7 = 0;
        if (t02) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        boolean isEmpty = s1.isEmpty();
        xl xlVar = this.r;
        TextView textView2 = this.q0;
        if (isEmpty) {
            textView2.setVisibility(4);
            xlVar.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            xlVar.setVisibility(0);
        }
        if (tiVar.b1().w && isFocusable()) {
            tiVar.b1().d();
        }
        g81 g81Var = this.m0;
        g81Var.setVisibility(0);
        g81Var.setAlpha(0.0f);
        bi.g3 g3Var = this.k0;
        g3Var.setVisibility(0);
        g3Var.setTag(null);
        int[] iArr = this.g0;
        iArr[0] = 0;
        int i10 = this.L0;
        iArr[1] = i10;
        int i11 = 2;
        iArr[2] = org.telegram.messenger.g0.L(2.0f) + (i10 * 2);
        this.k1 = 0.0f;
        this.j1 = true;
        em emVar3 = this.Q;
        if (emVar3 != null) {
            emVar3.setFpsLimit(-1);
        }
        org.telegram.messenger.g0.v1(this);
        org.telegram.messenger.g0.m3(tiVar, false);
        setAlertKeepScreenOn(true);
        xl xlVar2 = this.F;
        ImageView[] imageViewArr = this.T;
        if (z10) {
            setCameraOpenProgress(0.0f);
            this.e0 = true;
            if (xlVar2 != null) {
                xlVar2.invalidate();
            }
            this.g1.d();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this, "cameraOpenProgress", 0.0f, 1.0f));
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(g3Var, (Property<bi.g3, Float>) property, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(xlVar, (Property<xl, Float>) property, 1.0f));
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
            animatorSet.setInterpolator(kr.f);
            animatorSet.addListener(new wl(this, i11));
            animatorSet.start();
        } else {
            setCameraOpenProgress(1.0f);
            g3Var.setAlpha(1.0f);
            textView2.setAlpha(1.0f);
            xlVar.setAlpha(1.0f);
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
            tiVar.X3.B0();
            em emVar4 = this.Q;
            if (emVar4 != null) {
                emVar4.setSystemUiVisibility(1028);
            }
        }
        this.c0 = true;
        em emVar5 = this.Q;
        if (emVar5 != null) {
            emVar5.setImportantForAccessibility(2);
        }
        xlVar2.setImportantForAccessibility(4);
        xlVar2.invalidate();
        if (org.telegram.messenger.pc.e(360928) || (emVar = this.Q) == null || !emVar.isInited()) {
            return;
        }
        this.Q.showTexture(true, z10);
    }

    @Override // org.telegram.ui.Components.li
    public final void l() {
        Y();
        invalidate();
    }

    public final void l0() {
        if (org.telegram.messenger.bz.y0) {
            k0(true);
            return;
        }
        ti tiVar = this.b;
        ri riVar = tiVar.X3;
        if (riVar != null) {
            riVar.y1(0, false, true, 0, 0, 0L, tiVar.g1(), false, 0L);
        }
    }

    @Override // org.telegram.ui.Components.li
    public final void m(float f10) {
        this.X0 = f10;
        Y();
        em emVar = this.Q;
        if (emVar != null) {
            emVar.invalidateOutline();
            this.Q.invalidate();
        }
        invalidate();
    }

    public final void m0(org.telegram.messenger.ef efVar, boolean z10, boolean z11) {
        int i7;
        org.telegram.ui.bn bnVar;
        org.telegram.ui.bn bnVar2;
        ArrayList<Object> arrayList;
        int i10;
        ArrayList arrayList2 = s1;
        ti tiVar = this.b;
        if (efVar != null) {
            int i11 = efVar.C;
            arrayList2.add(efVar);
            t1.put(Integer.valueOf(i11), efVar);
            u1.add(Integer.valueOf(i11));
            tiVar.L1(0);
            this.H.f();
            this.w.f();
        }
        if (efVar != null && !z11 && arrayList2.size() > 1) {
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
        if (arrayList2.isEmpty()) {
            return;
        }
        this.u0 = true;
        org.telegram.ui.ActionBar.g2 g2Var = tiVar.a2;
        org.telegram.ui.ActionBar.g2 g2Var2 = tiVar.a2;
        if (g2Var == null) {
            g2Var = LaunchActivity.Q();
        }
        if (g2Var == null) {
            return;
        }
        PhotoViewer.p1().J2(g2Var.getParentActivity(), null, this.a);
        PhotoViewer.p1().K2(tiVar);
        PhotoViewer p12 = PhotoViewer.p1();
        int i12 = tiVar.Q3;
        boolean z12 = tiVar.R3;
        p12.h = i12;
        p12.n = z12;
        if (tiVar.A1 && tiVar.B1) {
            bnVar = (org.telegram.ui.bn) g2Var2;
            i7 = 11;
        } else {
            if (tiVar.O2 != 0) {
                i7 = 1;
            } else if (g2Var2 instanceof org.telegram.ui.bn) {
                bnVar = (org.telegram.ui.bn) g2Var2;
                i7 = 2;
            } else {
                i7 = 5;
            }
            bnVar = null;
        }
        boolean z13 = tiVar.C1;
        if (z13) {
            i7 = 13;
            bnVar2 = null;
        } else {
            bnVar2 = bnVar;
        }
        int i13 = i7;
        if (tiVar.O2 != 0 || z13) {
            arrayList = new ArrayList<>();
            arrayList.add(efVar);
            i10 = 0;
        } else {
            arrayList = getAllPhotosArray();
            i10 = arrayList2.size() - 1;
        }
        ArrayList<Object> arrayList3 = arrayList;
        s30 s30Var = tiVar.L1;
        if (s30Var != null && efVar != null) {
            s30Var.e = efVar.b;
        }
        PhotoViewer.p1().g2(arrayList3, i10, i13, false, new yl(this, z10), bnVar2);
        PhotoViewer.p1().w2(tiVar.L1);
        if (tiVar.B1) {
            PhotoViewer.p1().T0(null, null, false, tiVar.E1);
            PhotoViewer.p1().l2();
        }
    }

    public final void n0() {
        try {
            if (this.Q != null) {
                CameraController.getInstance().stopPreview(this.Q.getCameraSessionObject());
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.li
    public final boolean o(MotionEvent motionEvent) {
        em emVar;
        if (!this.e0) {
            if (this.c0 && motionEvent != null) {
                boolean z10 = this.H0;
                g81 g81Var = this.m0;
                if ((!z10 && motionEvent.getActionMasked() == 0) || motionEvent.getActionMasked() == 5) {
                    Rect rect = this.F0;
                    g81Var.getHitRect(rect);
                    if (g81Var.getTag() == null || !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
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
                    xl xlVar = this.r;
                    TextView textView = this.q0;
                    Property property = View.ALPHA;
                    ImageView[] imageViewArr = this.T;
                    bi.g3 g3Var = this.k0;
                    if (actionMasked == 2) {
                        if (this.D0 && motionEvent.getPointerCount() == 2 && !this.J0) {
                            float hypot = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                            if (this.E0) {
                                if (this.Q != null) {
                                    float L = (hypot - this.B0) / org.telegram.messenger.g0.L(100.0f);
                                    this.B0 = hypot;
                                    float f10 = this.C0 + L;
                                    this.C0 = f10;
                                    if (f10 < 0.0f) {
                                        this.C0 = 0.0f;
                                    } else if (f10 > 1.0f) {
                                        this.C0 = 1.0f;
                                    }
                                    g81Var.b(false, this.C0);
                                    this.b.b.invalidate();
                                    this.Q.setZoom(this.C0);
                                    w0(true);
                                    return true;
                                }
                            } else if (Math.abs(hypot - this.B0) >= org.telegram.messenger.g0.a1(false, 0.4f)) {
                                this.B0 = hypot;
                                this.E0 = true;
                                return true;
                            }
                        } else {
                            float y10 = motionEvent.getY();
                            float f11 = y10 - this.G0;
                            if (this.I0) {
                                if (Math.abs(f11) > org.telegram.messenger.g0.a1(false, 0.4f)) {
                                    this.I0 = false;
                                    this.J0 = true;
                                    return true;
                                }
                            } else if (this.J0 && (emVar = this.Q) != null) {
                                emVar.setTranslationY(emVar.getTranslationY() + f11);
                                this.G0 = y10;
                                g81Var.setTag(null);
                                Runnable runnable = this.o0;
                                if (runnable != null) {
                                    org.telegram.messenger.g0.r(runnable);
                                    this.o0 = null;
                                }
                                if (g3Var.getTag() == null) {
                                    g3Var.setTag(1);
                                    AnimatorSet animatorSet = new AnimatorSet();
                                    animatorSet.playTogether(ObjectAnimator.ofFloat(g3Var, (Property<bi.g3, Float>) property, 0.0f), ObjectAnimator.ofFloat(g81Var, (Property<g81, Float>) property, 0.0f), ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f), ObjectAnimator.ofFloat(imageViewArr[0], (Property<ImageView, Float>) property, 0.0f), ObjectAnimator.ofFloat(imageViewArr[1], (Property<ImageView, Float>) property, 0.0f), ObjectAnimator.ofFloat(xlVar, (Property<xl, Float>) property, 0.0f));
                                    animatorSet.setDuration(220L);
                                    animatorSet.setInterpolator(kr.f);
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
                            em emVar2 = this.Q;
                            if (emVar2 != null) {
                                if (Math.abs(emVar2.getTranslationY()) > this.Q.getMeasuredHeight() / 6.0f) {
                                    d0(true);
                                    return true;
                                }
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.Q, (Property<em, Float>) View.TRANSLATION_Y, 0.0f), ObjectAnimator.ofFloat(g3Var, (Property<bi.g3, Float>) property, 1.0f), ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 1.0f), ObjectAnimator.ofFloat(imageViewArr[0], (Property<ImageView, Float>) property, 1.0f), ObjectAnimator.ofFloat(imageViewArr[1], (Property<ImageView, Float>) property, 1.0f), ObjectAnimator.ofFloat(xlVar, (Property<xl, Float>) property, 1.0f));
                                animatorSet2.setDuration(250L);
                                animatorSet2.setInterpolator(this.j0);
                                animatorSet2.start();
                                g3Var.setTag(null);
                                return true;
                            }
                        } else {
                            em emVar3 = this.Q;
                            if (emVar3 != null && !this.E0) {
                                emVar3.getLocationOnScreen(this.W);
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
        if (this.b.Q1) {
            return;
        }
        for (int i7 = 0; i7 < 2; i7++) {
            this.T[i7].animate().alpha(1.0f).translationX(0.0f).setDuration(150L).setInterpolator(kr.f).start();
        }
        ViewPropertyAnimator duration = this.s0.animate().alpha(1.0f).translationX(0.0f).setDuration(150L);
        kr krVar = kr.f;
        duration.setInterpolator(krVar).start();
        this.r0.animate().alpha(1.0f).setDuration(150L).setInterpolator(krVar).start();
        org.telegram.messenger.g0.V3(this.S, false);
        org.telegram.messenger.g0.r(this.i0);
        this.i0 = null;
        org.telegram.messenger.g0.O3(org.telegram.messenger.g0.W(getContext()));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13 = i11 - i7;
        if (this.T0 != i13) {
            this.T0 = i13;
            hm hmVar = this.H;
            if (hmVar != null) {
                hmVar.f();
            }
        }
        super.onLayout(z10, i7, i10, i11, i12);
        Y();
    }

    @Override // org.telegram.ui.Components.li
    public final void p() {
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.o4);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.r2);
    }

    public final void p0() {
        try {
            X(false);
            if (this.Q != null) {
                CameraController.getInstance().startPreview(this.Q.getCameraSessionObject());
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.li
    public final boolean q() {
        if (this.e0) {
            return true;
        }
        if (this.c0) {
            d0(true);
            return true;
        }
        g0(true);
        return false;
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

    @Override // org.telegram.ui.Components.li
    public final void r(int i7) {
        g0((i7 == 0 || i7 == 2) ? false : true);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.S0) {
            return;
        }
        super.requestLayout();
    }

    public final void s0(int i7, final boolean z10) {
        PhotoViewer p12 = PhotoViewer.p1();
        if (i7 == -1) {
            i7 = p12.P4;
        }
        ArrayList arrayList = p12.g7;
        if (arrayList == null || arrayList.isEmpty() || i7 >= arrayList.size() || !(arrayList.get(i7) instanceof org.telegram.messenger.ef) || !((org.telegram.messenger.ef) arrayList.get(i7)).M) {
            return;
        }
        final org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) arrayList.get(i7);
        this.F.M(new q0.a() { // from class: org.telegram.ui.Components.rl
            @Override // q0.a
            public final void accept(Object obj) {
                View view = (View) obj;
                boolean z11 = ChatAttachAlertPhotoLayout.r1;
                if (view instanceof org.telegram.ui.Cells.r5) {
                    org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) view;
                    if (r5Var.getPhotoEntry() == efVar) {
                        r5Var.c(z10, Float.valueOf(250.0f));
                        r5Var.f(ChatAttachAlertPhotoLayout.this.getStarsPrice(), ChatAttachAlertPhotoLayout.t1.size() > 1);
                    }
                }
            }
        });
    }

    public void setCameraOpenProgress(float f10) {
        int i7;
        int i10;
        if (this.Q == null) {
            return;
        }
        this.f0 = f10;
        int[] iArr = this.g0;
        float f11 = iArr[1];
        float f12 = iArr[2];
        int i11 = org.telegram.messenger.g0.q.x;
        ti tiVar = this.b;
        float width = tiVar.c.getWidth();
        float height = tiVar.c.getHeight();
        float[] fArr = this.V;
        float f13 = fArr[0];
        float f14 = fArr[1];
        float f15 = this.k1;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.Q.getLayoutParams();
        float textureHeight = this.Q.getTextureHeight(f11, f12) / this.Q.getTextureHeight(width, height);
        float f16 = f12 / height;
        float f17 = f11 / width;
        if (this.j1) {
            i7 = (int) width;
            i10 = (int) height;
            float f18 = 1.0f - f10;
            float f19 = (textureHeight * f18) + f10;
            this.Q.getTextureView().setScaleX(f19);
            this.Q.getTextureView().setScaleY(f19);
            float f20 = ((1.0f - ((f16 * f18) + f10)) * height) / 2.0f;
            float f21 = ((1.0f - ((f17 * f18) + f10)) * width) / 2.0f;
            float f22 = f13 * f18;
            this.Q.setTranslationX(((0.0f * f10) + f22) - f21);
            float f23 = f14 * f18;
            this.Q.setTranslationY(((f15 * f10) + f23) - f20);
            this.l1 = f23 - this.Q.getTranslationY();
            this.m1 = (height * f10) + (((f14 + f12) * f18) - this.Q.getTranslationY());
            this.o1 = f22 - this.Q.getTranslationX();
            this.n1 = (width * f10) + (((f13 + f11) * f18) - this.Q.getTranslationX());
        } else {
            i7 = (int) f11;
            i10 = (int) f12;
            this.Q.getTextureView().setScaleX(1.0f);
            this.Q.getTextureView().setScaleY(1.0f);
            this.l1 = 0.0f;
            this.m1 = height;
            this.o1 = 0.0f;
            this.n1 = width;
            this.Q.setTranslationX(f13);
            this.Q.setTranslationY(f14);
        }
        if (layoutParams.width != i7 || layoutParams.height != i10) {
            layoutParams.width = i7;
            layoutParams.height = i10;
            this.Q.requestLayout();
        }
        this.Q.invalidateOutline();
        this.Q.invalidate();
    }

    public void setCheckCameraWhenShown(boolean z10) {
        this.v0 = z10;
    }

    public void setIncludeVideosInGallery(boolean z10) {
        this.z0 = z10;
    }

    public void setStarsPrice(long j3) {
        HashMap hashMap = t1;
        if (!hashMap.isEmpty()) {
            Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) ((Map.Entry) it.next()).getValue();
                efVar.N = j3;
                efVar.M = j3 > 0;
                efVar.R = false;
            }
        }
        D(getSelectedItemsCount());
        if (Z(false)) {
            A0();
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        ti tiVar = this.b;
        if (tiVar.B0 == 1) {
            float f11 = (f10 / 40.0f) * (-0.1f);
            xl xlVar = this.F;
            int childCount = xlVar.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = xlVar.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.r5) {
                    org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) childAt;
                    float f12 = 1.0f + f11;
                    r5Var.getCheckBox().setScaleX(f12);
                    r5Var.getCheckBox().setScaleY(f12);
                }
            }
        }
        super.setTranslationY(f10);
        tiVar.b.invalidate();
        invalidate();
    }

    @Override // org.telegram.ui.Components.li
    public final void t() {
        em emVar = this.Q;
        if (emVar != null) {
            emVar.setVisibility(8);
        }
        for (Map.Entry entry : t1.entrySet()) {
            if (entry.getValue() instanceof org.telegram.messenger.ef) {
                ((org.telegram.messenger.ef) entry.getValue()).getClass();
            }
        }
        this.H.f();
    }

    public final boolean t0() {
        if (this.z0) {
            return true;
        }
        ti tiVar = this.b;
        if (tiVar.A1) {
            return false;
        }
        return (tiVar.a2 instanceof org.telegram.ui.bn) || tiVar.R2 || tiVar.O2 == 2;
    }

    @Override // org.telegram.ui.Components.li
    public final void u() {
        this.O = true;
        xl xlVar = this.F;
        int childCount = xlVar.getChildCount();
        int i7 = 0;
        while (true) {
            if (i7 >= childCount) {
                break;
            }
            if (xlVar.getChildAt(i7) instanceof org.telegram.ui.Cells.l5) {
                q0();
                break;
            } else {
                this.R.i();
                i7++;
            }
        }
        ViewPropertyAnimator viewPropertyAnimator = this.p1;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator withEndAction = this.y.animate().alpha(0.0f).setDuration(150L).setInterpolator(kr.j).withEndAction(new ql(this, 3));
        this.p1 = withEndAction;
        withEndAction.start();
        n0();
    }

    public final void u0(z8 z8Var, TLRPC.VideoSize videoSize, long j3) {
        ti tiVar = this.b;
        x8 x8Var = new x8(tiVar.P1, tiVar.L1);
        s30 s30Var = tiVar.L1;
        x8Var.R = s30Var == null || s30Var.c != 2;
        tiVar.a2.presentFragment(x8Var);
        if (z8Var != null) {
            x8Var.r0(z8Var);
        }
        if (videoSize != null) {
            x8Var.q0(videoSize);
        }
        if (j3 != 0) {
            x8Var.p0(j3);
        }
        x8Var.J = new g2(10, this, x8Var);
    }

    @Override // org.telegram.ui.Components.li
    public final void v(float f10) {
        em emVar = this.Q;
        if (emVar != null) {
            emVar.setAlpha(f10);
            if (f10 != 0.0f && this.Q.getVisibility() != 0) {
                this.Q.setVisibility(0);
            } else {
                if (f10 != 0.0f || this.Q.getVisibility() == 4) {
                    return;
                }
                this.Q.setVisibility(4);
            }
        }
    }

    public final void v0() {
        ti tiVar = this.b;
        if (!tiVar.d4 && this.w0 && CameraView.isCameraAllowed()) {
            if (this.Q == null) {
                boolean z10 = !org.telegram.messenger.pc.e(360928);
                Context context = getContext();
                Boolean bool = this.p0;
                em emVar = new em(this, context, bool != null ? bool.booleanValue() : tiVar.S3, z10);
                this.Q = emVar;
                org.telegram.ui.ActionBar.g2 g2Var = tiVar.a2;
                emVar.setRecordFile(org.telegram.messenger.g0.s0((g2Var instanceof org.telegram.ui.bn) && ((org.telegram.ui.bn) g2Var).y()));
                this.Q.setFocusable(true);
                this.Q.setFpsLimit(30);
                this.Q.setOutlineProvider(new fh.a(this, 2));
                this.Q.setClipToOutline(true);
                this.Q.setContentDescription(org.telegram.messenger.gd.N0(2131754851, null));
                org.telegram.ui.ActionBar.m2 m2Var = tiVar.c;
                em emVar2 = this.Q;
                int i7 = this.L0;
                m2Var.addView(emVar2, 1, new FrameLayout.LayoutParams(i7, i7));
                this.Q.setDelegate(new zl(this));
                this.Q.setAlpha(this.w0 ? 1.0f : 0.2f);
                this.Q.setEnabled(this.w0);
                if (this.O) {
                    this.Q.setVisibility(8);
                }
                if (!this.c0) {
                    Y();
                }
                xl xlVar = this.F;
                if (xlVar != null) {
                    xlVar.invalidate();
                }
                invalidate();
            }
            g81 g81Var = this.m0;
            if (g81Var != null) {
                g81Var.b(false, 0.0f);
                this.C0 = 0.0f;
            }
            if (this.c0) {
                return;
            }
            this.Q.setTranslationX(this.V[0]);
        }
    }

    @Override // org.telegram.ui.Components.li
    public final void w(int i7) {
        TLRPC.Chat Z0;
        boolean z10;
        boolean z11;
        char c10 = 1;
        char c11 = 1;
        char c12 = 1;
        char c13 = 1;
        ti tiVar = this.b;
        if (i7 == 8) {
            tiVar.w1(!tiVar.X1, true);
            this.e1.a(!tiVar.X1, true);
            return;
        }
        if ((i7 == 0 || i7 == 1) && tiVar.Q3 > 0 && u1.size() > 1 && (Z0 = tiVar.Z0()) != null && !org.telegram.messenger.v3.N(Z0) && Z0.slowmode_enabled) {
            b5.L(getContext(), org.telegram.messenger.gd.N0(2131745114, null), org.telegram.messenger.gd.N0(2131745106, null), null, null, this.a).p();
            return;
        }
        org.telegram.ui.ActionBar.i6 i6Var = this.a;
        HashMap hashMap = t1;
        final int i10 = 0;
        if (i7 == 0) {
            org.telegram.messenger.fj fjVar = tiVar.F3;
            org.telegram.ui.ActionBar.g2 g2Var = tiVar.a2;
            if (fjVar == null && (g2Var instanceof org.telegram.ui.bn) && ((org.telegram.ui.bn) g2Var).c()) {
                b5.J(getContext(), ((org.telegram.ui.bn) g2Var).a(), new ml(this, i10), i6Var);
                return;
            } else {
                b5.X(tiVar.H3, tiVar.Y0() + hashMap.size(), tiVar.c1(), new org.telegram.messenger.w10(this) { // from class: org.telegram.ui.Components.nl
                    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.messenger.w10
                    public final void a(Object obj) {
                        int i11 = i10;
                        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                        Long l10 = (Long) obj;
                        switch (i11) {
                            case 0:
                                boolean z12 = ChatAttachAlertPhotoLayout.r1;
                                ti tiVar2 = chatAttachAlertPhotoLayout.b;
                                tiVar2.N0();
                                tiVar2.X3.y1(7, false, true, 0, 0, 0L, tiVar2.g1(), false, l10.longValue());
                                break;
                            default:
                                boolean z13 = ChatAttachAlertPhotoLayout.r1;
                                ti tiVar3 = chatAttachAlertPhotoLayout.b;
                                tiVar3.N0();
                                tiVar3.X3.y1(4, true, true, 0, 0, 0L, tiVar3.g1(), false, l10.longValue());
                                break;
                        }
                    }
                });
                return;
            }
        }
        if (i7 == 1) {
            org.telegram.messenger.fj fjVar2 = tiVar.F3;
            org.telegram.ui.ActionBar.g2 g2Var2 = tiVar.a2;
            if (fjVar2 == null && (g2Var2 instanceof org.telegram.ui.bn) && ((org.telegram.ui.bn) g2Var2).c()) {
                b5.J(getContext(), ((org.telegram.ui.bn) g2Var2).a(), new ml(this, c13 == true ? 1 : 0), i6Var);
                return;
            }
            int i11 = tiVar.H3;
            long c14 = tiVar.c1();
            int Y0 = tiVar.Y0() + hashMap.size();
            final char c15 = c12 == true ? 1 : 0;
            b5.X(i11, Y0, c14, new org.telegram.messenger.w10(this) { // from class: org.telegram.ui.Components.nl
                public final /* synthetic */ ChatAttachAlertPhotoLayout b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.w10
                public final void a(Object obj) {
                    int i112 = c15;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                    Long l10 = (Long) obj;
                    switch (i112) {
                        case 0:
                            boolean z12 = ChatAttachAlertPhotoLayout.r1;
                            ti tiVar2 = chatAttachAlertPhotoLayout.b;
                            tiVar2.N0();
                            tiVar2.X3.y1(7, false, true, 0, 0, 0L, tiVar2.g1(), false, l10.longValue());
                            break;
                        default:
                            boolean z13 = ChatAttachAlertPhotoLayout.r1;
                            ti tiVar3 = chatAttachAlertPhotoLayout.b;
                            tiVar3.N0();
                            tiVar3.X3.y1(4, true, true, 0, 0, 0L, tiVar3.g1(), false, l10.longValue());
                            break;
                    }
                }
            });
            return;
        }
        hm hmVar = this.H;
        xl xlVar = this.F;
        if (i7 == 3) {
            pm pmVar = tiVar.l2;
            if (pmVar != null) {
                pmVar.P();
            }
            Iterator it = hashMap.entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((org.telegram.messenger.ef) ((Map.Entry) it.next()).getValue()).M) {
                        z11 = true;
                        break;
                    }
                } else {
                    z11 = false;
                    break;
                }
            }
            final boolean z12 = !z11;
            org.telegram.messenger.g0.h3(new Runnable(this) { // from class: org.telegram.ui.Components.ol
                public final /* synthetic */ ChatAttachAlertPhotoLayout b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i12 = i10;
                    boolean z13 = z12;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                    switch (i12) {
                        case 0:
                            boolean z14 = ChatAttachAlertPhotoLayout.r1;
                            ti tiVar2 = chatAttachAlertPhotoLayout.b;
                            org.telegram.ui.ActionBar.y0 y0Var = chatAttachAlertPhotoLayout.Z0;
                            y0Var.setText(org.telegram.messenger.gd.N0(z13 ? 2131751418 : 2131751142, null));
                            if (z13) {
                                y0Var.setIcon(R.drawable.msg_spoiler_off);
                            } else {
                                y0Var.setAnimatedIcon(R.raw.photo_spoiler);
                            }
                            if (!z13) {
                                tiVar2.Y2.T(1);
                                if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                    tiVar2.Y2.T(6);
                                    break;
                                }
                            } else {
                                tiVar2.Y2.u(1);
                                if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                    tiVar2.Y2.u(6);
                                    break;
                                }
                            }
                            break;
                        default:
                            org.telegram.ui.ActionBar.y0 y0Var2 = chatAttachAlertPhotoLayout.b1;
                            y0Var2.setText(org.telegram.messenger.gd.N0(z13 ? 2131745424 : 2131745425, null));
                            if (!z13) {
                                y0Var2.setIcon(R.drawable.menu_quality_hd);
                                break;
                            } else {
                                y0Var2.setIcon(R.drawable.menu_quality_sd);
                                break;
                            }
                    }
                }
            }, 200L);
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : hashMap.entrySet()) {
                if (entry.getValue() instanceof org.telegram.messenger.ef) {
                    org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) entry.getValue();
                    efVar.M = z12;
                    efVar.R = false;
                    arrayList.add(Integer.valueOf(efVar.C));
                }
            }
            xlVar.M(new pl(i10, arrayList, z12));
            if (tiVar.w2 != this) {
                hmVar.f();
            }
            pm pmVar2 = tiVar.l2;
            if (pmVar2 != null) {
                pmVar2.w.invalidate();
                return;
            }
            return;
        }
        if (i7 == 2) {
            pm pmVar3 = tiVar.l2;
            if (pmVar3 != null) {
                pmVar3.P();
            }
            Iterator it2 = hashMap.entrySet().iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((org.telegram.messenger.ef) ((Map.Entry) it2.next()).getValue()).c()) {
                        z10 = true;
                        break;
                    }
                } else {
                    z10 = false;
                    break;
                }
            }
            final boolean z13 = !z10;
            final char c16 = c11 == true ? 1 : 0;
            org.telegram.messenger.g0.h3(new Runnable(this) { // from class: org.telegram.ui.Components.ol
                public final /* synthetic */ ChatAttachAlertPhotoLayout b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i12 = c16;
                    boolean z132 = z13;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                    switch (i12) {
                        case 0:
                            boolean z14 = ChatAttachAlertPhotoLayout.r1;
                            ti tiVar2 = chatAttachAlertPhotoLayout.b;
                            org.telegram.ui.ActionBar.y0 y0Var = chatAttachAlertPhotoLayout.Z0;
                            y0Var.setText(org.telegram.messenger.gd.N0(z132 ? 2131751418 : 2131751142, null));
                            if (z132) {
                                y0Var.setIcon(R.drawable.msg_spoiler_off);
                            } else {
                                y0Var.setAnimatedIcon(R.raw.photo_spoiler);
                            }
                            if (!z132) {
                                tiVar2.Y2.T(1);
                                if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                    tiVar2.Y2.T(6);
                                    break;
                                }
                            } else {
                                tiVar2.Y2.u(1);
                                if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                    tiVar2.Y2.u(6);
                                    break;
                                }
                            }
                            break;
                        default:
                            org.telegram.ui.ActionBar.y0 y0Var2 = chatAttachAlertPhotoLayout.b1;
                            y0Var2.setText(org.telegram.messenger.gd.N0(z132 ? 2131745424 : 2131745425, null));
                            if (!z132) {
                                y0Var2.setIcon(R.drawable.menu_quality_hd);
                                break;
                            } else {
                                y0Var2.setIcon(R.drawable.menu_quality_sd);
                                break;
                            }
                    }
                }
            }, 200L);
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry entry2 : hashMap.entrySet()) {
                if (entry2.getValue() instanceof org.telegram.messenger.ef) {
                    org.telegram.messenger.ef efVar2 = (org.telegram.messenger.ef) entry2.getValue();
                    efVar2.z = Boolean.valueOf(z13);
                    efVar2.R = false;
                    arrayList2.add(Integer.valueOf(efVar2.C));
                }
            }
            xlVar.M(new pl(c10 == true ? 1 : 0, arrayList2, z13));
            if (tiVar.w2 != this) {
                hmVar.f();
            }
            pm pmVar4 = tiVar.l2;
            if (pmVar4 != null) {
                pmVar4.w.invalidate();
                return;
            }
            return;
        }
        if (i7 != 4) {
            int i12 = 7;
            if (i7 == 7) {
                tiVar.P1(tiVar.w2 != tiVar.l2);
                return;
            }
            if (i7 == 9) {
                di.pb.k1(getContext(), getStarsPrice(), true, new d(this, i12), this.a);
                return;
            }
            if (i7 >= 10) {
                org.telegram.messenger.ue ueVar = (org.telegram.messenger.ue) this.W0.get(i7 - 10);
                this.U0 = ueVar;
                org.telegram.messenger.ue ueVar2 = this.V0;
                TextView textView = this.y;
                if (ueVar == ueVar2) {
                    textView.setText(org.telegram.messenger.gd.N0(2131752226, null));
                } else {
                    textView.setText(ueVar.c);
                }
                hmVar.f();
                this.w.f();
                this.G.h1(0, -(xlVar.getPaddingTop() - getTopScrollOffset()));
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
                int i13 = tiVar.O2;
                org.telegram.ui.ActionBar.g2 g2Var3 = tiVar.a2;
                if (i13 != 0) {
                    g2Var3.startActivityForResult(createChooser, 14);
                } else {
                    g2Var3.startActivityForResult(createChooser, 1);
                }
            } else {
                Intent intent3 = new Intent("android.intent.action.PICK");
                intent3.setType("image/*");
                int i14 = tiVar.O2;
                org.telegram.ui.ActionBar.g2 g2Var4 = tiVar.a2;
                if (i14 != 0) {
                    g2Var4.startActivityForResult(intent3, 14);
                } else {
                    g2Var4.startActivityForResult(intent3, 1);
                }
            }
            tiVar.a(true);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void w0(boolean z10) {
        g81 g81Var = this.m0;
        int i7 = 1;
        if ((g81Var.getTag() != null && z10) || (g81Var.getTag() == null && !z10)) {
            if (z10) {
                Runnable runnable = this.o0;
                if (runnable != null) {
                    org.telegram.messenger.g0.r(runnable);
                }
                ql qlVar = new ql(this, i7);
                this.o0 = qlVar;
                org.telegram.messenger.g0.h3(qlVar, 2000L);
                return;
            }
            return;
        }
        AnimatorSet animatorSet = this.n0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        g81Var.setTag(z10 ? 1 : null);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.n0 = animatorSet2;
        animatorSet2.setDuration(180L);
        this.n0.playTogether(ObjectAnimator.ofFloat(g81Var, (Property<g81, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
        this.n0.addListener(new wl(this, i7));
        this.n0.start();
        if (z10) {
            ql qlVar2 = new ql(this, 2);
            this.o0 = qlVar2;
            org.telegram.messenger.g0.h3(qlVar2, 2000L);
        }
    }

    @Override // org.telegram.ui.Components.li
    public final void x() {
        ti tiVar = this.b;
        X(tiVar != null && (tiVar.a2 instanceof org.telegram.ui.bn));
    }

    public final void x0() {
        hi.d3 d3Var = this.x;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = d3Var.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        if (this.w0) {
            ArrayList arrayList = t0() ? MediaController.c2 : MediaController.d2;
            ArrayList arrayList2 = new ArrayList(arrayList);
            this.W0 = arrayList2;
            Collections.sort(arrayList2, new sl(arrayList, 0));
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
        for (int i7 = 0; i7 < size; i7++) {
            org.telegram.messenger.ue ueVar = (org.telegram.messenger.ue) this.W0.get(i7);
            hi.a aVar = new hi.a(getContext(), ueVar.d, ueVar.c, ueVar.e.size(), this.a);
            d3Var.getPopupLayout().addView(aVar);
            aVar.setOnClickListener(new ci.q(this, i7 + 10, 13));
        }
    }

    public final void y0() {
        xl xlVar = this.F;
        if (xlVar != null) {
            for (int i7 = 0; i7 < xlVar.getChildCount(); i7++) {
                View childAt = xlVar.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.r5) {
                    ((org.telegram.ui.Cells.r5) childAt).a.invalidate();
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.li
    public final void z(int i7, boolean z10) {
        Y();
        em emVar = this.Q;
        if (emVar != null) {
            emVar.invalidateOutline();
            this.Q.invalidate();
        }
    }

    public final void z0() {
        ArrayList arrayList;
        if (this.b.a2 instanceof org.telegram.ui.bn) {
            xl xlVar = this.F;
            int childCount = xlVar.getChildCount();
            int i7 = 0;
            while (true) {
                arrayList = u1;
                if (i7 >= childCount) {
                    break;
                }
                View childAt = xlVar.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.r5) {
                    org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) childAt;
                    org.telegram.messenger.ef e02 = e0(((Integer) r5Var.getTag()).intValue());
                    if (e02 != null) {
                        r5Var.setNum(arrayList.indexOf(Integer.valueOf(e02.C)));
                    }
                }
                i7++;
            }
            xl xlVar2 = this.r;
            int childCount2 = xlVar2.getChildCount();
            for (int i10 = 0; i10 < childCount2; i10++) {
                View childAt2 = xlVar2.getChildAt(i10);
                if (childAt2 instanceof org.telegram.ui.Cells.r5) {
                    org.telegram.ui.Cells.r5 r5Var2 = (org.telegram.ui.Cells.r5) childAt2;
                    org.telegram.messenger.ef e03 = e0(((Integer) r5Var2.getTag()).intValue());
                    if (e03 != null) {
                        r5Var2.setNum(arrayList.indexOf(Integer.valueOf(e03.C)));
                    }
                }
            }
        }
    }
}
