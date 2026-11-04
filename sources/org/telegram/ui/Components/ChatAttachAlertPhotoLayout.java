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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class ChatAttachAlertPhotoLayout extends th implements org.telegram.messenger.cs {
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
    public final il F;
    public final Rect F0;
    public final fi.g G;
    public float G0;
    public final sl H;
    public boolean H0;
    public final gy I;
    public boolean I0;
    public final xj0 J;
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
    public pl Q;
    public boolean Q0;
    public final ql R;
    public boolean R0;
    public final nl S;
    public boolean S0;
    public final ImageView[] T;
    public int T0;
    public boolean U;
    public org.telegram.messenger.pe U0;
    public final float[] V;
    public org.telegram.messenger.pe V0;
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
    public final ca0 e1;
    public float f0;
    public final boolean f1;
    public final int[] g0;
    public final g2.g g1;
    public int h0;
    public boolean h1;
    public fl i0;
    public final ll i1;
    public final DecelerateInterpolator j0;
    public boolean j1;
    public final ai.o2 k0;
    public float k1;
    public final ShutterButton l0;
    public float l1;
    public final j71 m0;
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
    public final il r;
    public final TextView r0;
    public final kg.y s;
    public final ImageView s0;
    public boolean t0;
    public boolean u0;
    public boolean v0;
    public final sl w;
    public boolean w0;
    public final gi.u2 x;
    public boolean x0;
    public final TextView y;
    public boolean y0;
    public boolean z0;

    /* JADX WARN: Multi-variable type inference failed */
    public ChatAttachAlertPhotoLayout(bi biVar, Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var, biVar);
        final int i3 = 2;
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
        this.g1 = new g2.g((int[]) null);
        this.i1 = new ll(this);
        this.f1 = z10;
        this.n = z11;
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.r2);
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.l4);
        org.telegram.ui.ActionBar.j2 j2Var = biVar.c;
        bi biVar2 = this.b;
        final int i12 = 0;
        this.h1 = biVar2.L2 != 0;
        gi.u2 u2Var = new gi.u2(this, context, biVar2.S2.q(), e6Var, 1);
        this.x = u2Var;
        u2Var.setSubMenuOpenSide(1);
        FrameLayout.LayoutParams d = b8.mf.d(-2, -1.0f, 51, 60.0f, 0.0f, 40.0f, 0.0f);
        d.topMargin = org.telegram.messenger.g0.m;
        this.b.S2.addView(u2Var, 0, d);
        u2Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.vk
            public final /* synthetic */ ChatAttachAlertPhotoLayout b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                pl plVar;
                pl plVar2;
                int i13 = i3;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                int i14 = 0;
                switch (i13) {
                    case 0:
                        if (!chatAttachAlertPhotoLayout.t0 && (plVar = chatAttachAlertPhotoLayout.Q) != null && plVar.isInited()) {
                            chatAttachAlertPhotoLayout.d0 = false;
                            chatAttachAlertPhotoLayout.Q.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.s0, (Property<ImageView, Float>) View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new hl(chatAttachAlertPhotoLayout, i14));
                            duration.start();
                            break;
                        }
                        break;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.U && (plVar2 = chatAttachAlertPhotoLayout.Q) != null && plVar2.isInited() && chatAttachAlertPhotoLayout.c0) {
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
                                animatorSet.setInterpolator(xq.f);
                                animatorSet.addListener(new ei.k3(chatAttachAlertPhotoLayout, view, imageView, 4));
                                animatorSet.start();
                                break;
                            }
                        }
                        break;
                    case 2:
                        chatAttachAlertPhotoLayout.x.U(null, null);
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
        int i13 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.r6.V(textView, i13, e6Var);
        textView.setText(org.telegram.messenger.bd.M0(2131752238, null));
        textView.setTypeface(org.telegram.messenger.g0.o());
        Drawable g7 = k2.p1.g(context, R.drawable.ic_arrow_drop_down);
        this.E = g7;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.y(this, g7, i13, e6Var, mode);
        textView.setPadding(0, 0, org.telegram.messenger.g0.L(10.0f), 0);
        u2Var.addView(textView, b8.mf.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
        W(false);
        ca0 ca0Var = new ca0(context, R.raw.position_below, org.telegram.messenger.bd.M0(2131752560, null), R.raw.position_above, org.telegram.messenger.bd.M0(2131752559, null), e6Var);
        this.e1 = ca0Var;
        ca0Var.a(!this.b.U1, false);
        this.d1 = this.b.V2.e(7, R.drawable.msg_view_file, org.telegram.messenger.bd.M0(2131753957, null));
        this.b.V2.a(5);
        this.b.V2.e(4, R.drawable.msg_openin, org.telegram.messenger.bd.M0(2131747804, null));
        this.a1 = this.b.V2.e(1, R.drawable.msg_filehq, org.telegram.messenger.bd.M0(2131745595, null));
        this.b.V2.e(0, R.drawable.msg_ungroup, org.telegram.messenger.bd.M0(2131745594, null));
        this.b.V2.a(6);
        this.Z0 = this.b.V2.e(3, R.drawable.msg_spoiler, org.telegram.messenger.bd.M0(2131751155, null));
        this.b1 = this.b.V2.e(2, R.drawable.menu_quality_hd, org.telegram.messenger.bd.M0(2131745631, null));
        org.telegram.ui.ActionBar.q0 q0Var = this.b.V2;
        q0Var.p();
        ca0Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        ca0Var.setTag(8);
        q0Var.b.addView(ca0Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) ca0Var.getLayoutParams();
        if (org.telegram.messenger.bd.a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = org.telegram.messenger.g0.L(48.0f);
        ca0Var.setLayoutParams(layoutParams);
        ca0Var.setOnClickListener(new org.telegram.ui.ActionBar.y(q0Var, 2));
        this.c1 = this.b.V2.e(9, R.drawable.menu_feature_paid, org.telegram.messenger.bd.M0(2131747738, null));
        this.b.V2.setFitSubItems(true);
        il ilVar = new il(this, context, e6Var, i11);
        this.F = ilVar;
        ilVar.setFastScrollEnabled(1);
        ilVar.setFastScrollVisible(true);
        ilVar.getFastScroll().setAlpha(0.0f);
        ilVar.getFastScroll().a = false;
        ilVar.getFastScroll().i0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        sl slVar = new sl(this, context, z11);
        this.H = slVar;
        ilVar.setAdapter(slVar);
        ql qlVar = new ql(this, ilVar);
        this.R = qlVar;
        ilVar.i(qlVar);
        int i14 = 0;
        for (int i15 = 8; i14 < i15; i15 = 8) {
            slVar.h.add(slVar.L());
            i14++;
        }
        ilVar.setClipToPadding(false);
        ilVar.setItemAnimator(null);
        ilVar.setLayoutAnimation(null);
        ilVar.setVerticalScrollBarEnabled(false);
        org.telegram.ui.ActionBar.r6.m(ilVar, 21, org.telegram.ui.ActionBar.k6.A5, e6Var);
        addView(ilVar, b8.mf.d(-1, -1.0f, org.telegram.messenger.hs.E1, 0.0f, 0.0f, 0.0f, -48.0f));
        ilVar.setOnScrollListener(new gi.g8(i11, this));
        fi.g gVar = new fi.g(this, this.L0, i10);
        this.G = gVar;
        gVar.O = new ai.g2(this, 10);
        ilVar.setLayoutManager(gVar);
        ilVar.setOnItemClickListener(new ci.l3(this, z11, e6Var, 6));
        ilVar.setOnItemLongClickListener(new wk(this, 2));
        xj0 xj0Var = new xj0(new i9(this, i11));
        this.J = xj0Var;
        ilVar.F.add(xj0Var);
        setBlur3Capture(ilVar);
        this.d = ilVar;
        this.f = true;
        gy gyVar = new gy(context, e6Var);
        this.I = gyVar;
        gyVar.setText(org.telegram.messenger.bd.M0(2131748188, null));
        gyVar.setOnTouchListener(null);
        gyVar.setTextSize(16);
        addView(gyVar, b8.mf.c(-2.0f, -1));
        if (this.Y0) {
            gyVar.b();
        } else {
            gyVar.c();
        }
        Paint paint = new Paint(1);
        paint.setColor(-2468275);
        nl nlVar = new nl(context, paint);
        this.S = nlVar;
        org.telegram.messenger.g0.Z3(nlVar, false, 1.0f, true, false);
        nlVar.setBackgroundResource(R.drawable.system);
        nlVar.getBackground().setColorFilter(new PorterDuffColorFilter(1711276032, mode));
        nlVar.setTextSize(1, 15.0f);
        nlVar.setTypeface(org.telegram.messenger.g0.o());
        nlVar.setAlpha(0.0f);
        nlVar.setTextColor(-1);
        nlVar.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(5.0f));
        j2Var.addView(nlVar, b8.mf.d(-2, -2.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
        ai.o2 o2Var = new ai.o2(17, context, this);
        this.k0 = o2Var;
        o2Var.setVisibility(8);
        o2Var.setAlpha(0.0f);
        j2Var.addView(o2Var, b8.mf.e(-1, org.telegram.messenger.hs.K1, 83));
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
        j2Var.addView(textView2, b8.mf.d(-2, 38.0f, 51, 0.0f, 0.0f, 0.0f, 116.0f));
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.vk
            public final /* synthetic */ ChatAttachAlertPhotoLayout b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                pl plVar;
                pl plVar2;
                int i132 = i10;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                int i142 = 0;
                switch (i132) {
                    case 0:
                        if (!chatAttachAlertPhotoLayout.t0 && (plVar = chatAttachAlertPhotoLayout.Q) != null && plVar.isInited()) {
                            chatAttachAlertPhotoLayout.d0 = false;
                            chatAttachAlertPhotoLayout.Q.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.s0, (Property<ImageView, Float>) View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new hl(chatAttachAlertPhotoLayout, i142));
                            duration.start();
                            break;
                        }
                        break;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.U && (plVar2 = chatAttachAlertPhotoLayout.Q) != null && plVar2.isInited() && chatAttachAlertPhotoLayout.c0) {
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
                                animatorSet.setInterpolator(xq.f);
                                animatorSet.addListener(new ei.k3(chatAttachAlertPhotoLayout, view, imageView, 4));
                                animatorSet.start();
                                break;
                            }
                        }
                        break;
                    case 2:
                        chatAttachAlertPhotoLayout.x.U(null, null);
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
        j71 j71Var = new j71(context);
        this.m0 = j71Var;
        j71Var.setVisibility(8);
        j71Var.setAlpha(0.0f);
        j2Var.addView(j71Var, b8.mf.d(-2, 50.0f, 51, 0.0f, 0.0f, 0.0f, 116.0f));
        j71Var.setDelegate(new wk(this, i10));
        ShutterButton shutterButton = new ShutterButton(context);
        shutterButton.b = new DecelerateInterpolator();
        shutterButton.x = new lt(shutterButton, 13);
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
        shutterButton.f = bt0.a;
        this.l0 = shutterButton;
        o2Var.addView(shutterButton, b8.mf.e(84, 84, 17));
        shutterButton.setDelegate(new gl(this, e6Var, j2Var));
        shutterButton.setFocusable(true);
        shutterButton.setContentDescription(org.telegram.messenger.bd.M0(2131754760, null));
        ImageView imageView = new ImageView(context);
        this.s0 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        o2Var.addView(imageView, b8.mf.e(48, 48, 21));
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.vk
            public final /* synthetic */ ChatAttachAlertPhotoLayout b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                pl plVar;
                pl plVar2;
                int i132 = i12;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                int i142 = 0;
                switch (i132) {
                    case 0:
                        if (!chatAttachAlertPhotoLayout.t0 && (plVar = chatAttachAlertPhotoLayout.Q) != null && plVar.isInited()) {
                            chatAttachAlertPhotoLayout.d0 = false;
                            chatAttachAlertPhotoLayout.Q.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.s0, (Property<ImageView, Float>) View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new hl(chatAttachAlertPhotoLayout, i142));
                            duration.start();
                            break;
                        }
                        break;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.U && (plVar2 = chatAttachAlertPhotoLayout.Q) != null && plVar2.isInited() && chatAttachAlertPhotoLayout.c0) {
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
                                animatorSet.setInterpolator(xq.f);
                                animatorSet.addListener(new ei.k3(chatAttachAlertPhotoLayout, view, imageView2, 4));
                                animatorSet.start();
                                break;
                            }
                        }
                        break;
                    case 2:
                        chatAttachAlertPhotoLayout.x.U(null, null);
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
        imageView.setContentDescription(org.telegram.messenger.bd.M0(2131754752, null));
        for (int i16 = 0; i16 < 2; i16++) {
            this.T[i16] = new ImageView(context);
            this.T[i16].setScaleType(ImageView.ScaleType.CENTER);
            this.T[i16].setVisibility(4);
            this.k0.addView(this.T[i16], b8.mf.e(48, 48, 51));
            this.T[i16].setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.vk
                public final /* synthetic */ ChatAttachAlertPhotoLayout b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    pl plVar;
                    pl plVar2;
                    int i132 = i11;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                    int i142 = 0;
                    switch (i132) {
                        case 0:
                            if (!chatAttachAlertPhotoLayout.t0 && (plVar = chatAttachAlertPhotoLayout.Q) != null && plVar.isInited()) {
                                chatAttachAlertPhotoLayout.d0 = false;
                                chatAttachAlertPhotoLayout.Q.switchCamera();
                                ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.s0, (Property<ImageView, Float>) View.SCALE_X, 0.0f).setDuration(100L);
                                duration.addListener(new hl(chatAttachAlertPhotoLayout, i142));
                                duration.start();
                                break;
                            }
                            break;
                        case 1:
                            if (!chatAttachAlertPhotoLayout.U && (plVar2 = chatAttachAlertPhotoLayout.Q) != null && plVar2.isInited() && chatAttachAlertPhotoLayout.c0) {
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
                                    animatorSet.setInterpolator(xq.f);
                                    animatorSet.addListener(new ei.k3(chatAttachAlertPhotoLayout, view, imageView2, 4));
                                    animatorSet.start();
                                    break;
                                }
                            }
                            break;
                        case 2:
                            chatAttachAlertPhotoLayout.x.U(null, null);
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
            this.T[i16].setContentDescription("flash mode " + i16);
        }
        TextView textView3 = new TextView(context);
        this.r0 = textView3;
        textView3.setTextSize(1, 15.0f);
        textView3.setTextColor(-1);
        textView3.setText(org.telegram.messenger.bd.M0(2131744280, null));
        textView3.setShadowLayer(org.telegram.messenger.g0.L(3.33333f), 0.0f, org.telegram.messenger.g0.L(0.666f), 1275068416);
        textView3.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), 0);
        this.k0.addView(textView3, b8.mf.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        il ilVar2 = new il(this, context, e6Var, null == true ? 1 : 0);
        this.r = ilVar2;
        ilVar2.setVerticalScrollBarEnabled(true);
        sl slVar2 = new sl(this, context, false);
        this.w = slVar2;
        ilVar2.setAdapter(slVar2);
        for (int i17 = 0; i17 < 8; i17++) {
            slVar2.h.add(slVar2.L());
        }
        ilVar2.setClipToPadding(false);
        ilVar2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        ilVar2.setItemAnimator(null);
        ilVar2.setLayoutAnimation(null);
        ilVar2.setOverScrollMode(2);
        ilVar2.setVisibility(4);
        ilVar2.setAlpha(0.0f);
        j2Var.addView(ilVar2, b8.mf.c(80.0f, -1));
        kg.y yVar = new kg.y(null == true ? 1 : 0, null == true ? 1 : 0, 7);
        this.s = yVar;
        ilVar2.setLayoutManager(yVar);
        ilVar2.setOnItemClickListener(new ai.a(i10));
    }

    public static org.telegram.ui.Cells.q5 O(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i3) {
        il ilVar = chatAttachAlertPhotoLayout.F;
        int childCount = ilVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = ilVar.getChildAt(i10);
            if (childAt.getTop() < ilVar.getMeasuredHeight() - chatAttachAlertPhotoLayout.b.Z0() && (childAt instanceof org.telegram.ui.Cells.q5)) {
                org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                if (q5Var.getImageView().getTag() != null && ((Integer) q5Var.getImageView().getTag()).intValue() == i3) {
                    return q5Var;
                }
            }
        }
        return null;
    }

    public static int Q(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        bi biVar = chatAttachAlertPhotoLayout.b;
        org.telegram.ui.ActionBar.d2 d2Var = biVar.X1;
        return ((d2Var instanceof org.telegram.ui.wm) && ((org.telegram.ui.wm) d2Var).g4 == 5) ? ((org.telegram.messenger.j0) d2Var.getMessagesController().x7.d0.b).c - ((org.telegram.ui.wm) biVar.X1).L6.size() : ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    public static boolean U() {
        HashMap hashMap = t1;
        if (hashMap.isEmpty()) {
            return false;
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (entry.getValue() instanceof org.telegram.messenger.ye) {
                org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) entry.getValue();
                if (yeVar.d() && yeVar.j()) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean V() {
        int i3 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = u1;
            if (i3 >= arrayList.size()) {
                break;
            }
            Object obj = t1.get(arrayList.get(i3));
            if (!TextUtils.isEmpty(obj instanceof org.telegram.messenger.ye ? ((org.telegram.messenger.ye) obj).a : obj instanceof org.telegram.messenger.bf ? ((org.telegram.messenger.bf) obj).I : null)) {
                i10++;
            }
            i3++;
        }
        return i10 <= 1;
    }

    public static boolean f0() {
        HashMap hashMap = t1;
        if (hashMap.isEmpty()) {
            return false;
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if ((entry.getValue() instanceof org.telegram.messenger.ye) && ((org.telegram.messenger.ye) entry.getValue()).d()) {
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
                imageView.setContentDescription(org.telegram.messenger.bd.M0(2131754913, null));
                break;
            case "off":
                imageView.setImageResource(R.drawable.flash_off);
                imageView.setContentDescription(org.telegram.messenger.bd.M0(2131754914, null));
                break;
            case "auto":
                imageView.setImageResource(R.drawable.flash_auto);
                imageView.setContentDescription(org.telegram.messenger.bd.M0(2131754915, null));
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

    @Override // org.telegram.ui.Components.th
    public final void A() {
        ShutterButton shutterButton = this.l0;
        if (shutterButton == null) {
            return;
        }
        boolean z10 = this.R0;
        bt0 bt0Var = bt0.a;
        bt0 bt0Var2 = bt0.b;
        if (z10) {
            if (this.Q != null && shutterButton.getState() == bt0Var2) {
                shutterButton.a(bt0Var);
            }
            this.R0 = false;
            return;
        }
        if (this.Q != null && shutterButton.getState() == bt0Var2) {
            o0();
            CameraController.getInstance().stopVideoRecording(this.Q.getCameraSession(), false);
            shutterButton.a(bt0Var);
        }
        if (this.c0) {
            d0(false);
        }
        g0(true);
    }

    public final void A0() {
        ArrayList arrayList;
        sl slVar;
        HashMap hashMap;
        bi biVar = this.b;
        org.telegram.ui.ActionBar.d2 d2Var = biVar.X1;
        org.telegram.ui.ActionBar.d2 d2Var2 = biVar.X1;
        if (d2Var instanceof org.telegram.ui.wm) {
            il ilVar = this.F;
            int childCount = ilVar.getChildCount();
            int i3 = 0;
            while (true) {
                arrayList = u1;
                slVar = this.H;
                hashMap = t1;
                if (i3 >= childCount) {
                    break;
                }
                View childAt = ilVar.getChildAt(i3);
                if (childAt instanceof org.telegram.ui.Cells.q5) {
                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                    int R = RecyclerView.R(childAt);
                    if (slVar.f && R > this.N0) {
                        R--;
                    }
                    if (slVar.d && this.U0 == this.V0) {
                        R--;
                    }
                    org.telegram.messenger.ye e02 = e0(R);
                    q5Var.setHasSpoiler(e02 != null && e02.M);
                    q5Var.setHighQuality(e02 != null && e02.c());
                    if ((d2Var2 instanceof org.telegram.ui.wm) && biVar.O3) {
                        q5Var.b(e02 != null ? arrayList.indexOf(Integer.valueOf(e02.C)) : -1, e02 != null && hashMap.containsKey(Integer.valueOf(e02.C)), true);
                    } else {
                        q5Var.b(-1, e02 != null && hashMap.containsKey(Integer.valueOf(e02.C)), true);
                    }
                }
                i3++;
            }
            il ilVar2 = this.r;
            int childCount2 = ilVar2.getChildCount();
            for (int i10 = 0; i10 < childCount2; i10++) {
                View childAt2 = ilVar2.getChildAt(i10);
                if (childAt2 instanceof org.telegram.ui.Cells.q5) {
                    org.telegram.ui.Cells.q5 q5Var2 = (org.telegram.ui.Cells.q5) childAt2;
                    int R2 = RecyclerView.R(childAt2);
                    if (slVar.f && R2 > this.N0) {
                        R2--;
                    }
                    if (slVar.d && this.U0 == this.V0) {
                        R2--;
                    }
                    org.telegram.messenger.ye e03 = e0(R2);
                    q5Var2.setHasSpoiler(e03 != null && e03.M);
                    q5Var2.setHighQuality(e03 != null && e03.c());
                    if ((d2Var2 instanceof org.telegram.ui.wm) && biVar.O3) {
                        q5Var2.b(e03 != null ? arrayList.indexOf(Integer.valueOf(e03.C)) : -1, e03 != null && hashMap.containsKey(Integer.valueOf(e03.C)), true);
                    } else {
                        q5Var2.b(-1, e03 != null && hashMap.containsKey(Integer.valueOf(e03.C)), true);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00db  */
    @Override // org.telegram.ui.Components.th
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i3, int i10) {
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
        il ilVar = this.F;
        ((FrameLayout.LayoutParams) ilVar.getLayoutParams()).topMargin = -this.q1;
        int L2 = (i3 - org.telegram.messenger.g0.L(4.0f)) - org.telegram.messenger.g0.L(4.0f);
        int i13 = this.N0;
        int i14 = L2 / i13;
        this.L0 = i14;
        if (this.M0 != i14 || i12 != i13) {
            this.M0 = i14;
            org.telegram.messenger.g0.h3(new al(this, 4));
        }
        this.G.y1(Math.max(1, ((this.N0 - 1) * org.telegram.messenger.g0.L(2.0f)) + (this.L0 * this.N0)));
        sl slVar = this.H;
        int ceil = (int) Math.ceil((slVar.b() - 1) / this.N0);
        if (this.Q0) {
            D = org.telegram.messenger.g0.L(400.0f);
        } else {
            D = org.telegram.messenger.k5.D(2.0f, ceil - 1, this.L0 * ceil);
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        int b10 = org.telegram.messenger.k5.b(6.0f, (((i10 - D) - currentActionBarHeight) - org.telegram.messenger.g0.n) - org.telegram.messenger.g0.L(12.0f), 0);
        if (this.K != b10) {
            this.K = b10;
            slVar.f();
        }
        if (!org.telegram.messenger.g0.Q1()) {
            Point point2 = org.telegram.messenger.g0.q;
            if (point2.x > point2.y) {
                i11 = (int) (i10 / 3.5f);
                L = ((i11 + currentActionBarHeight) - org.telegram.messenger.g0.L(52.0f)) + this.q1;
                if (L < 0) {
                    L = 0;
                }
                if (ilVar.getPaddingTop() == L || ilVar.getPaddingBottom() != this.e) {
                    ilVar.setPadding(org.telegram.messenger.g0.L(2.0f), L, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(48.0f) + this.e);
                }
                this.y.setTextSize(17.0f);
                this.S0 = false;
            }
        }
        i11 = (i10 / 5) * 2;
        L = ((i11 + currentActionBarHeight) - org.telegram.messenger.g0.L(52.0f)) + this.q1;
        if (L < 0) {
        }
        if (ilVar.getPaddingTop() == L) {
        }
        ilVar.setPadding(org.telegram.messenger.g0.L(2.0f), L, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(48.0f) + this.e);
        this.y.setTextSize(17.0f);
        this.S0 = false;
    }

    public final void B0(boolean z10) {
        TextView textView = this.q0;
        if (textView != null) {
            bi biVar = this.b;
            int i3 = biVar.L2;
            TextView textView2 = biVar.e3;
            if (i3 != 0 || biVar.O2 || biVar.z1) {
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
                if (((org.telegram.messenger.ye) ((Map.Entry) it.next()).getValue()).b) {
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
                textView.setText(org.telegram.messenger.bd.G(hashMap.size(), "Media", new Object[0]).toUpperCase());
                if (max != this.N || z10) {
                    textView2.setText(org.telegram.messenger.bd.G(max, "MediaSelected", new Object[0]));
                }
            } else if (z11) {
                textView.setText(org.telegram.messenger.bd.G(hashMap.size(), "Videos", new Object[0]).toUpperCase());
                if (max != this.N || z10) {
                    textView2.setText(org.telegram.messenger.bd.G(max, "VideosSelected", new Object[0]));
                }
            } else {
                textView.setText(org.telegram.messenger.bd.G(hashMap.size(), "Photos", new Object[0]).toUpperCase());
                if (max != this.N || z10) {
                    textView2.setText(org.telegram.messenger.bd.G(max, "PhotosSelected", new Object[0]));
                }
            }
            boolean z13 = max > 1;
            biVar.E1 = z13;
            biVar.h3.setVisibility((!z13 || biVar.L2 == 2) ? 8 : 0);
            this.N = max;
        }
    }

    @Override // org.telegram.ui.Components.th
    public final void C() {
        bi biVar = this.b;
        if (!biVar.isShowing() || biVar.J || PhotoViewer.v1().U1()) {
            return;
        }
        W(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b7, code lost:
    
        if (((org.telegram.ui.wm) r2).z() == false) goto L46;
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
    @Override // org.telegram.ui.Components.th
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(int i3) {
        boolean z10;
        boolean z11;
        boolean z12;
        long j10;
        boolean z13;
        boolean z14;
        boolean z15;
        org.telegram.ui.ActionBar.d2 d2Var;
        TLRPC.ChatFull chatFull;
        boolean z16;
        bi biVar = this.b;
        if (i3 > 1) {
            org.telegram.messenger.zi ziVar = biVar.C3;
            org.telegram.ui.ActionBar.q0 q0Var = biVar.V2;
            if (ziVar == null) {
                if (getStarsPrice() <= 0) {
                    q0Var.S(0);
                    z10 = true;
                } else {
                    q0Var.t(0);
                    z10 = false;
                }
                if (!this.A0 || getStarsPrice() > 0) {
                    q0Var.t(1);
                    z11 = false;
                    if (i3 != 0) {
                        biVar.V2.t(4);
                    }
                    org.telegram.ui.ActionBar.y0 y0Var = this.a1;
                    if (i3 <= 1) {
                        biVar.V2.S(5);
                        biVar.V2.S(7);
                        y0Var.setText(org.telegram.messenger.bd.M0(2131745645, null));
                    } else {
                        biVar.V2.t(5);
                        biVar.V2.t(7);
                        if (i3 != 0) {
                            y0Var.setText(org.telegram.messenger.bd.M0(2131745646, null));
                        }
                    }
                    if (i3 > 0 && getStarsPrice() <= 0) {
                        if (biVar != null) {
                            org.telegram.ui.ActionBar.d2 d2Var2 = biVar.X1;
                            if (d2Var2 instanceof org.telegram.ui.wm) {
                            }
                        }
                        z12 = true;
                        if (i3 > 0 || biVar == null) {
                            j10 = 0;
                            z13 = z10;
                        } else {
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = biVar.b2;
                            if (chatAttachAlertPhotoLayout == null) {
                                j10 = 0;
                                z16 = false;
                                z13 = z10;
                            } else {
                                HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
                                ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                                if (!selectedPhotos.isEmpty()) {
                                    long j11 = 0;
                                    int i10 = 0;
                                    z16 = false;
                                    loop0: while (true) {
                                        j10 = j11;
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
                                                CharSequence charSequence = ((org.telegram.messenger.ye) selectedPhotos.get(selectedPhotosOrder.get(i13))).a;
                                                String charSequence2 = charSequence == null ? "" : charSequence.toString();
                                                if (biVar.a1() != null && TextUtils.isEmpty(charSequence2) && i12 == 0) {
                                                    charSequence2 = biVar.a1().getText().toString();
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
                                        j11 = j10;
                                        z10 = z13;
                                    }
                                } else {
                                    j10 = 0;
                                    z13 = z10;
                                }
                                z16 = false;
                            }
                            if (z16 && (biVar.X1 instanceof org.telegram.ui.wm)) {
                                z14 = true;
                                if (i3 > 0 && biVar != null) {
                                    d2Var = biVar.X1;
                                    if ((d2Var instanceof org.telegram.ui.wm) && org.telegram.messenger.t3.V(((org.telegram.ui.wm) d2Var).e) && (chatFull = ((org.telegram.ui.wm) d2Var).q8) != null && chatFull.paid_media_allowed) {
                                        z15 = true;
                                        if (!z12) {
                                            String M0 = org.telegram.messenger.bd.M0(2131751155, null);
                                            org.telegram.ui.ActionBar.y0 y0Var2 = this.Z0;
                                            y0Var2.setText(M0);
                                            y0Var2.setAnimatedIcon(R.raw.photo_spoiler);
                                            biVar.V2.t(3);
                                        } else if (biVar != null) {
                                            biVar.V2.S(3);
                                        }
                                        if (biVar != null) {
                                            org.telegram.ui.ActionBar.q0 q0Var2 = biVar.V2;
                                            if (getSelectedPhotosCount() == i3) {
                                                int selectedPhotosHighQualityCount = getSelectedPhotosHighQualityCount();
                                                org.telegram.ui.ActionBar.y0 y0Var3 = this.b1;
                                                if (selectedPhotosHighQualityCount > 0) {
                                                    y0Var3.setText(org.telegram.messenger.bd.M0(2131745630, null));
                                                    y0Var3.setIcon(R.drawable.menu_quality_sd);
                                                } else {
                                                    y0Var3.setText(org.telegram.messenger.bd.M0(2131745631, null));
                                                    y0Var3.setIcon(R.drawable.menu_quality_hd);
                                                }
                                                q0Var2.S(2);
                                            } else {
                                                q0Var2.t(2);
                                            }
                                        }
                                        ca0 ca0Var = this.e1;
                                        if (z14) {
                                            ca0Var.setVisibility(0);
                                        } else {
                                            ca0Var.setVisibility(8);
                                        }
                                        if ((!z12 || z14) && (z11 || z13)) {
                                            biVar.V2.S(6);
                                        } else {
                                            biVar.V2.t(6);
                                        }
                                        if (!z15) {
                                            biVar.V2.t(9);
                                            return;
                                        }
                                        org.telegram.ui.ActionBar.y0 y0Var4 = this.c1;
                                        if (y0Var4 != null) {
                                            long starsPrice = getStarsPrice();
                                            if (starsPrice > j10) {
                                                y0Var4.setText(org.telegram.messenger.bd.M0(2131747736, null));
                                                y0Var4.setSubtext(org.telegram.messenger.bd.G((int) starsPrice, "Stars", new Object[0]));
                                            } else {
                                                y0Var4.setText(org.telegram.messenger.bd.M0(2131747738, null));
                                                y0Var4.setSubtext(null);
                                            }
                                        }
                                        this.F.M(new org.telegram.ui.cq(1));
                                        biVar.V2.S(9);
                                        return;
                                    }
                                }
                                z15 = false;
                                if (!z12) {
                                }
                                if (biVar != null) {
                                }
                                ca0 ca0Var2 = this.e1;
                                if (z14) {
                                }
                                if (z12) {
                                }
                                biVar.V2.S(6);
                                if (!z15) {
                                }
                            }
                        }
                        z14 = false;
                        if (i3 > 0) {
                            d2Var = biVar.X1;
                            if (d2Var instanceof org.telegram.ui.wm) {
                                z15 = true;
                                if (!z12) {
                                }
                                if (biVar != null) {
                                }
                                ca0 ca0Var22 = this.e1;
                                if (z14) {
                                }
                                if (z12) {
                                }
                                biVar.V2.S(6);
                                if (!z15) {
                                }
                            }
                        }
                        z15 = false;
                        if (!z12) {
                        }
                        if (biVar != null) {
                        }
                        ca0 ca0Var222 = this.e1;
                        if (z14) {
                        }
                        if (z12) {
                        }
                        biVar.V2.S(6);
                        if (!z15) {
                        }
                    }
                    z12 = false;
                    if (i3 > 0) {
                    }
                    j10 = 0;
                    z13 = z10;
                    z14 = false;
                    if (i3 > 0) {
                    }
                    z15 = false;
                    if (!z12) {
                    }
                    if (biVar != null) {
                    }
                    ca0 ca0Var2222 = this.e1;
                    if (z14) {
                    }
                    if (z12) {
                    }
                    biVar.V2.S(6);
                    if (!z15) {
                    }
                } else {
                    q0Var.S(1);
                    z11 = true;
                    if (i3 != 0) {
                    }
                    org.telegram.ui.ActionBar.y0 y0Var5 = this.a1;
                    if (i3 <= 1) {
                    }
                    if (i3 > 0) {
                        if (biVar != null) {
                        }
                        z12 = true;
                        if (i3 > 0) {
                        }
                        j10 = 0;
                        z13 = z10;
                        z14 = false;
                        if (i3 > 0) {
                        }
                        z15 = false;
                        if (!z12) {
                        }
                        if (biVar != null) {
                        }
                        ca0 ca0Var22222 = this.e1;
                        if (z14) {
                        }
                        if (z12) {
                        }
                        biVar.V2.S(6);
                        if (!z15) {
                        }
                    }
                    z12 = false;
                    if (i3 > 0) {
                    }
                    j10 = 0;
                    z13 = z10;
                    z14 = false;
                    if (i3 > 0) {
                    }
                    z15 = false;
                    if (!z12) {
                    }
                    if (biVar != null) {
                    }
                    ca0 ca0Var222222 = this.e1;
                    if (z14) {
                    }
                    if (z12) {
                    }
                    biVar.V2.S(6);
                    if (!z15) {
                    }
                }
            }
        }
        org.telegram.ui.ActionBar.q0 q0Var3 = biVar.V2;
        org.telegram.ui.ActionBar.q0 q0Var4 = biVar.V2;
        q0Var3.t(0);
        if (i3 == 0) {
            q0Var4.S(4);
            q0Var4.t(1);
        } else if (this.A0 && getStarsPrice() <= 0 && biVar.C3 == null) {
            q0Var4.S(1);
            z10 = false;
            z11 = true;
            if (i3 != 0) {
            }
            org.telegram.ui.ActionBar.y0 y0Var52 = this.a1;
            if (i3 <= 1) {
            }
            if (i3 > 0) {
            }
            z12 = false;
            if (i3 > 0) {
            }
            j10 = 0;
            z13 = z10;
            z14 = false;
            if (i3 > 0) {
            }
            z15 = false;
            if (!z12) {
            }
            if (biVar != null) {
            }
            ca0 ca0Var2222222 = this.e1;
            if (z14) {
            }
            if (z12) {
            }
            biVar.V2.S(6);
            if (!z15) {
            }
        } else {
            q0Var4.t(1);
        }
        z10 = false;
        z11 = false;
        if (i3 != 0) {
        }
        org.telegram.ui.ActionBar.y0 y0Var522 = this.a1;
        if (i3 <= 1) {
        }
        if (i3 > 0) {
        }
        z12 = false;
        if (i3 > 0) {
        }
        j10 = 0;
        z13 = z10;
        z14 = false;
        if (i3 > 0) {
        }
        z15 = false;
        if (!z12) {
        }
        if (biVar != null) {
        }
        ca0 ca0Var22222222 = this.e1;
        if (z14) {
        }
        if (z12) {
        }
        biVar.V2.S(6);
        if (!z15) {
        }
    }

    @Override // org.telegram.ui.Components.th
    public final boolean G(int i3) {
        if (!this.c0) {
            return false;
        }
        if (i3 != 24 && i3 != 25 && i3 != 79 && i3 != 85) {
            return false;
        }
        ((gl) this.l0.getDelegate()).a();
        return true;
    }

    @Override // org.telegram.ui.Components.th
    public final void H(th thVar) {
        ViewPropertyAnimator viewPropertyAnimator = this.p1;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.x.setVisibility(0);
        boolean z10 = thVar instanceof am;
        TextView textView = this.y;
        if (z10) {
            ViewPropertyAnimator interpolator = textView.animate().alpha(1.0f).setDuration(150L).setInterpolator(xq.j);
            this.p1 = interpolator;
            interpolator.start();
        } else {
            c0();
            textView.setAlpha(1.0f);
        }
        this.b.S2.setTitle("");
        this.G.h1(0, 0);
        if (z10) {
            this.F.post(new org.telegram.ui.lo(29, this, thVar));
        }
        X();
        p0();
    }

    @Override // org.telegram.ui.Components.th
    public final void I() {
        this.O = false;
        pl plVar = this.Q;
        if (plVar != null) {
            plVar.setVisibility(0);
        }
        if (this.v0) {
            this.v0 = false;
            W(true);
        }
    }

    @Override // org.telegram.ui.Components.th
    public final void J() {
        this.F.y0(0);
    }

    public final int S(org.telegram.messenger.ye yeVar, int i3) {
        Integer valueOf = Integer.valueOf(yeVar.C);
        HashMap hashMap = t1;
        boolean containsKey = hashMap.containsKey(valueOf);
        ArrayList arrayList = u1;
        if (containsKey) {
            yeVar.N = 0L;
            yeVar.M = false;
            yeVar.O = null;
            yeVar.z = null;
            hashMap.remove(valueOf);
            int indexOf = arrayList.indexOf(valueOf);
            if (indexOf >= 0) {
                arrayList.remove(indexOf);
            }
            B0(false);
            z0();
            if (i3 >= 0) {
                yeVar.e();
                this.i1.X(i3);
            }
            return indexOf;
        }
        yeVar.N = getStarsPrice();
        yeVar.M = getStarsPrice() > 0;
        yeVar.R = false;
        if (f0()) {
            yeVar.O = Boolean.valueOf(!U());
        }
        yeVar.z = Boolean.valueOf(yeVar.c());
        boolean Z = Z(true);
        hashMap.put(valueOf, yeVar);
        arrayList.add(valueOf);
        if (Z) {
            A0();
            return -1;
        }
        B0(true);
        return -1;
    }

    public final void T() {
        pl plVar = this.Q;
        if (plVar != null) {
            if (!this.c0) {
                plVar.setTranslationX(this.V[0]);
            }
            int i3 = this.L0;
            int L = org.telegram.messenger.g0.L(2.0f) + (i3 * 2);
            if (this.c0) {
                return;
            }
            this.Q.setClipTop((int) this.a0);
            this.Q.setClipBottom((int) this.b0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.Q.getLayoutParams();
            if (layoutParams.height == L && layoutParams.width == i3) {
                return;
            }
            layoutParams.width = i3;
            layoutParams.height = L;
            this.Q.setLayoutParams(layoutParams);
            org.telegram.messenger.g0.h3(new cl(0, this, layoutParams));
        }
    }

    public final void W(boolean z10) {
        sl slVar;
        bi biVar = this.b;
        boolean z11 = biVar.N1;
        org.telegram.ui.ActionBar.d2 d2Var = biVar.X1;
        if (z11 || !this.n) {
            return;
        }
        boolean z12 = this.O0;
        boolean z13 = this.P0;
        org.telegram.ui.ActionBar.d2 Q = d2Var == null ? LaunchActivity.Q() : d2Var;
        if (Q == null || Q.getParentActivity() == null) {
            return;
        }
        if (org.telegram.messenger.az.y0) {
            boolean z14 = Q.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0;
            this.P0 = z14;
            if (z14) {
                if (z10) {
                    try {
                        d2Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE"}, 17);
                    } catch (Exception unused) {
                    }
                }
                this.O0 = false;
            } else {
                if (z10 || org.telegram.messenger.az.P0) {
                    CameraController.getInstance().initCamera(null);
                }
                this.O0 = CameraController.getInstance().isCameraInitied();
            }
        } else {
            this.O0 = false;
        }
        if ((z12 != this.O0 || z13 != this.P0) && (slVar = this.H) != null) {
            slVar.f();
        }
        if (biVar.N1 || !biVar.isShowing() || !this.O0 || ((Paint) biVar.Z.b).getAlpha() == 0 || this.c0) {
            return;
        }
        v0();
    }

    public final void X() {
        u4.d1 K;
        float[] fArr;
        if (PhotoViewer.F1() && PhotoViewer.v1().q5 != null && PhotoViewer.v1().q5.W) {
            return;
        }
        pl plVar = this.Q;
        if (plVar != null) {
            plVar.invalidateOutline();
        }
        int i3 = this.N0 - 1;
        il ilVar = this.F;
        u4.d1 K2 = ilVar.K(i3);
        if (K2 != null) {
            K2.a.invalidateOutline();
        }
        if ((!this.H.d || !this.O0 || this.U0 != this.V0) && (K = ilVar.K(0)) != null) {
            K.a.invalidateOutline();
        }
        pl plVar2 = this.Q;
        if (plVar2 != null) {
            plVar2.invalidate();
        }
        nl nlVar = this.S;
        if (nlVar != null) {
            ((ViewGroup.MarginLayoutParams) nlVar.getLayoutParams()).topMargin = getRootWindowInsets() == null ? org.telegram.messenger.g0.L(16.0f) : getRootWindowInsets().getSystemWindowInsetTop() + org.telegram.messenger.g0.L(2.0f);
        }
        if (this.O0) {
            int childCount = ilVar.getChildCount();
            int i10 = 0;
            while (true) {
                fArr = this.V;
                if (i10 >= childCount) {
                    break;
                }
                View childAt = ilVar.getChildAt(i10);
                if (!(childAt instanceof org.telegram.ui.Cells.k5)) {
                    i10++;
                } else if (childAt.isAttachedToWindow()) {
                    float y9 = getY() + ilVar.getY() + childAt.getY();
                    bi biVar = this.b;
                    ViewGroup viewGroup = biVar.b;
                    bh bhVar = biVar.t3;
                    ai.c0 c0Var = biVar.J2;
                    float y10 = viewGroup.getY() + y9;
                    float x10 = (biVar.b.getX() + (getX() + (ilVar.getX() + childAt.getX()))) - getRootWindowInsets().getSystemWindowInsetLeft();
                    float alpha = (c0Var.getAlpha() * c0Var.getMeasuredHeight()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (!biVar.Y1 ? org.telegram.messenger.g0.m : 0);
                    gi.i iVar = biVar.z4;
                    if (iVar != null && iVar.g()) {
                        alpha = Math.max(alpha, (biVar.z4.e() + biVar.z4.getY()) - biVar.g4);
                    }
                    float f10 = y9 < alpha ? alpha - y9 : 0.0f;
                    if (f10 != this.a0) {
                        this.a0 = f10;
                        pl plVar3 = this.Q;
                        if (plVar3 != null) {
                            plVar3.invalidateOutline();
                            this.Q.invalidate();
                        }
                    }
                    float translationY = (int) (bhVar.getTranslationY() + (biVar.b.getMeasuredHeight() - bhVar.getMeasuredHeight()));
                    gi.i iVar2 = biVar.z4;
                    if (iVar2 != null) {
                        translationY -= iVar2.d() - org.telegram.messenger.g0.L(6.0f);
                    }
                    if (childAt.getMeasuredHeight() + y9 > translationY) {
                        this.b0 = Math.min(-org.telegram.messenger.g0.L(5.0f), y9 - translationY) + childAt.getMeasuredHeight();
                    } else {
                        this.b0 = 0.0f;
                    }
                    fArr[0] = x10;
                    fArr[1] = y10;
                    T();
                    return;
                }
            }
            if (this.a0 != 0.0f) {
                this.a0 = 0.0f;
                pl plVar4 = this.Q;
                if (plVar4 != null) {
                    plVar4.invalidateOutline();
                    this.Q.invalidate();
                }
            }
            fArr[0] = org.telegram.messenger.g0.L(-400.0f);
            fArr[1] = 0.0f;
            T();
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
            if (!(obj instanceof org.telegram.messenger.ye)) {
                break;
            }
            S((org.telegram.messenger.ye) obj, -1);
            z11 = true;
        }
        return z11;
    }

    @Override // org.telegram.ui.Components.th
    public final void a(CharSequence charSequence) {
        Object obj;
        int i3 = 0;
        while (true) {
            ArrayList arrayList = u1;
            if (i3 >= arrayList.size()) {
                return;
            }
            if (i3 == 0) {
                Object obj2 = arrayList.get(i3);
                HashMap hashMap = t1;
                Object obj3 = hashMap.get(obj2);
                if (obj3 instanceof org.telegram.messenger.ye) {
                    org.telegram.messenger.ye clone = ((org.telegram.messenger.ye) obj3).clone();
                    CharSequence[] charSequenceArr = {charSequence};
                    clone.n = org.telegram.messenger.li.b0(org.telegram.messenger.h10.t0).W(charSequenceArr, false, true);
                    clone.a = charSequenceArr[0];
                    obj = clone;
                } else {
                    boolean z10 = obj3 instanceof org.telegram.messenger.bf;
                    obj = obj3;
                    if (z10) {
                        org.telegram.messenger.bf clone2 = ((org.telegram.messenger.bf) obj3).clone();
                        CharSequence[] charSequenceArr2 = {charSequence};
                        clone2.n = org.telegram.messenger.li.b0(org.telegram.messenger.h10.t0).W(charSequenceArr2, false, true);
                        clone2.I = charSequenceArr2[0];
                        obj = clone2;
                    }
                }
                hashMap.put(obj2, obj);
            }
            i3++;
        }
    }

    public final boolean a0(org.telegram.messenger.ye yeVar) {
        boolean z10 = this.x0;
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        bi biVar = this.b;
        if (z10 || !yeVar.b) {
            if (this.y0 || yeVar.b) {
                return false;
            }
            if (!biVar.N0()) {
                org.telegram.messenger.k5.p(null, 2131749550, new fc(biVar.m3, e6Var), null);
                return true;
            }
        } else if (!biVar.N0()) {
            org.telegram.messenger.k5.p(null, 2131749546, new fc(biVar.m3, e6Var), null);
            return true;
        }
        return true;
    }

    @Override // org.telegram.ui.Components.th
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

    @Override // org.telegram.ui.Components.th
    public final boolean c() {
        Iterator it = t1.entrySet().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof org.telegram.messenger.ye) {
                if (((org.telegram.messenger.ye) value).x != 0) {
                    return false;
                }
            } else if ((value instanceof org.telegram.messenger.bf) && ((org.telegram.messenger.bf) value).x != 0) {
                return false;
            }
        }
        return true;
    }

    public final void c0() {
        String M0 = org.telegram.messenger.bd.M0(2131751155, null);
        org.telegram.ui.ActionBar.y0 y0Var = this.Z0;
        y0Var.setText(M0);
        y0Var.setAnimatedIcon(R.raw.photo_spoiler);
        this.b.V2.S(1);
        HashMap hashMap = t1;
        if (!hashMap.isEmpty()) {
            Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                ((org.telegram.messenger.ye) ((Map.Entry) it.next()).getValue()).e();
            }
            hashMap.clear();
            u1.clear();
        }
        ArrayList arrayList = s1;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) arrayList.get(i3);
                new File(yeVar.I).delete();
                if (yeVar.h != null) {
                    new File(yeVar.h).delete();
                }
                if (yeVar.c != null) {
                    new File(yeVar.c).delete();
                }
            }
            arrayList.clear();
        }
        this.H.f();
        this.w.f();
    }

    @Override // org.telegram.ui.Components.th
    public final void d() {
        boolean z10 = this.f1;
        int i3 = z10 ? org.telegram.ui.ActionBar.k6.Vg : org.telegram.ui.ActionBar.k6.j5;
        int i10 = org.telegram.ui.ActionBar.k6.c7;
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        this.I.setTextColor(org.telegram.ui.ActionBar.k6.w0(i10, e6Var));
        int i11 = org.telegram.ui.ActionBar.k6.A5;
        il ilVar = this.F;
        org.telegram.ui.ActionBar.r6.I(ilVar, i11, e6Var);
        ilVar.K(0);
        org.telegram.ui.ActionBar.r6.V(this.y, i3, e6Var);
        int w02 = org.telegram.ui.ActionBar.k6.w0(z10 ? org.telegram.ui.ActionBar.k6.Vg : org.telegram.ui.ActionBar.k6.E8, e6Var);
        gi.u2 u2Var = this.x;
        u2Var.O(w02, false);
        u2Var.O(org.telegram.ui.ActionBar.k6.w0(z10 ? org.telegram.ui.ActionBar.k6.Vg : org.telegram.ui.ActionBar.k6.E8, e6Var), true);
        u2Var.H(org.telegram.ui.ActionBar.k6.w0(z10 ? org.telegram.ui.ActionBar.k6.Xg : org.telegram.ui.ActionBar.k6.G8, e6Var));
        org.telegram.ui.ActionBar.k6.C1(org.telegram.ui.ActionBar.k6.w0(i3, e6Var), this.E);
    }

    public final void d0(boolean z10) {
        pl plVar;
        if (this.t0 || this.Q == null) {
            return;
        }
        int i3 = this.L0;
        int[] iArr = this.g0;
        iArr[1] = i3;
        iArr[2] = org.telegram.messenger.g0.L(2.0f) + (i3 * 2);
        Runnable runnable = this.o0;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.o0 = null;
        }
        org.telegram.messenger.g0.n3(this.b, ((double) org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, this.a))) > 0.721d);
        TextView textView = this.q0;
        il ilVar = this.r;
        ai.o2 o2Var = this.k0;
        il ilVar2 = this.F;
        ImageView[] imageViewArr = this.T;
        j71 j71Var = this.m0;
        if (z10) {
            this.k1 = this.Q.getTranslationY();
            this.e0 = true;
            if (ilVar2 != null) {
                ilVar2.invalidate();
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this, "cameraOpenProgress", 0.0f));
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(o2Var, (Property<ai.o2, Float>) property, 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(j71Var, (Property<j71, Float>) property, 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(ilVar, (Property<il, Float>) property, 0.0f));
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
            animatorSet.setInterpolator(xq.f);
            animatorSet.addListener(new hl(this, 3));
            animatorSet.start();
        } else {
            this.j1 = false;
            setAlertKeepScreenOn(false);
            setCameraOpenProgress(0.0f);
            iArr[0] = 0;
            setCameraOpenProgress(0.0f);
            o2Var.setAlpha(0.0f);
            o2Var.setVisibility(8);
            j71Var.setAlpha(0.0f);
            j71Var.setTag(null);
            j71Var.setVisibility(8);
            ilVar.setAlpha(0.0f);
            textView.setAlpha(0.0f);
            ilVar.setVisibility(8);
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
            pl plVar2 = this.Q;
            if (plVar2 != null) {
                plVar2.setFpsLimit(30);
                this.Q.setSystemUiVisibility(1024);
            }
            if (ilVar2 != null) {
                ilVar2.invalidate();
            }
        }
        pl plVar3 = this.Q;
        if (plVar3 != null) {
            plVar3.setImportantForAccessibility(0);
        }
        ilVar2.setImportantForAccessibility(0);
        if (org.telegram.messenger.lc.e(360928) || (plVar = this.Q) == null) {
            return;
        }
        plVar.showTexture(false, z10);
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        bi biVar;
        if (i3 != org.telegram.messenger.hs.r2) {
            if (i3 == org.telegram.messenger.hs.l4) {
                W(false);
                return;
            }
            return;
        }
        sl slVar = this.H;
        if (slVar != null) {
            if (t0()) {
                this.V0 = MediaController.a2;
            } else {
                this.V0 = MediaController.b2;
            }
            if (this.U0 == null || ((biVar = this.b) != null && biVar.y1)) {
                this.U0 = this.V0;
            } else if (t0()) {
                int i11 = 0;
                while (true) {
                    if (i11 >= MediaController.c2.size()) {
                        break;
                    }
                    org.telegram.messenger.pe peVar = (org.telegram.messenger.pe) MediaController.c2.get(i11);
                    int i12 = peVar.a;
                    org.telegram.messenger.pe peVar2 = this.U0;
                    if (i12 == peVar2.a && peVar.b == peVar2.b) {
                        this.U0 = peVar;
                        break;
                    }
                    i11++;
                }
            }
            this.Y0 = false;
            this.I.c();
            slVar.f();
            this.w.f();
            ArrayList arrayList = u1;
            if (!arrayList.isEmpty() && this.V0 != null) {
                int size = arrayList.size();
                for (int i13 = 0; i13 < size; i13++) {
                    Integer num = (Integer) arrayList.get(i13);
                    HashMap hashMap = t1;
                    Object obj = hashMap.get(num);
                    org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) this.V0.f.get(num.intValue());
                    if (yeVar != null) {
                        if (obj instanceof org.telegram.messenger.ye) {
                            yeVar.g((org.telegram.messenger.ye) obj);
                        }
                        hashMap.put(num, yeVar);
                    }
                }
            }
            x0();
        }
    }

    public final org.telegram.messenger.ye e0(int i3) {
        if (i3 < 0) {
            return null;
        }
        ArrayList arrayList = s1;
        int size = arrayList.size();
        if (i3 < size) {
            return (org.telegram.messenger.ye) arrayList.get(i3);
        }
        int i10 = i3 - size;
        org.telegram.messenger.pe peVar = this.U0;
        if (peVar == null || i10 >= peVar.e.size()) {
            return null;
        }
        return (org.telegram.messenger.ye) this.U0.e.get(i10);
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
        org.telegram.messenger.g0.i3(new al(this, 0), 300L);
        this.d0 = false;
    }

    public ArrayList<Object> getAllPhotosArray() {
        org.telegram.messenger.pe peVar = this.U0;
        ArrayList<Object> arrayList = s1;
        if (peVar == null) {
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

    @Override // org.telegram.ui.Components.th
    public int getButtonsHideOffset() {
        return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + super.getButtonsHideOffset();
    }

    public float getCameraOpenProgress() {
        return this.f0;
    }

    @Override // org.telegram.ui.Components.th
    public int getCurrentItemTop() {
        il ilVar = this.F;
        int childCount = ilVar.getChildCount();
        gy gyVar = this.I;
        if (childCount <= 0) {
            ilVar.setTopGlowOffset(ilVar.getPaddingTop());
            gyVar.setTranslationY(0.0f);
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = ilVar.getChildAt(0);
        bj0 bj0Var = (bj0) ilVar.G(childAt);
        int top = childAt.getTop() - this.q1;
        int L = org.telegram.messenger.g0.L(7.0f);
        if (top < org.telegram.messenger.g0.L(7.0f) || bj0Var == null || bj0Var.b() != 0) {
            top = L;
        }
        gyVar.setTranslationY(((((getMeasuredHeight() - top) - org.telegram.messenger.g0.L(50.0f)) - gyVar.getMeasuredHeight()) / 2.0f) + top);
        ilVar.setTopGlowOffset(top);
        return top;
    }

    @Override // org.telegram.ui.Components.th
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.th
    public int getListTopPadding() {
        return this.F.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.th
    public int getSelectedItemsCount() {
        return u1.size();
    }

    public HashMap<Object, Object> getSelectedPhotos() {
        return t1;
    }

    public int getSelectedPhotosCount() {
        int i3 = 0;
        for (Object obj : t1.values()) {
            if (obj instanceof org.telegram.messenger.ye) {
                org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) obj;
                if (!yeVar.b && yeVar.s == null) {
                    i3++;
                }
            }
        }
        return i3;
    }

    public int getSelectedPhotosHighQualityCount() {
        int i3 = 0;
        for (Object obj : t1.values()) {
            if (obj instanceof org.telegram.messenger.ye) {
                org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) obj;
                if (yeVar.c() && !yeVar.b && yeVar.s == null) {
                    i3++;
                }
            }
        }
        return i3;
    }

    public ArrayList<Object> getSelectedPhotosOrder() {
        return u1;
    }

    public long getStarsPrice() {
        Iterator it = t1.entrySet().iterator();
        if (it.hasNext()) {
            return ((org.telegram.messenger.ye) ((Map.Entry) it.next()).getValue()).N;
        }
        return 0L;
    }

    public final boolean h0() {
        Activity W = org.telegram.messenger.g0.W(getContext());
        if (W == null) {
            W = this.b.X1.getParentActivity();
        }
        int i3 = Build.VERSION.SDK_INT;
        if (W == null) {
            return true;
        }
        if (i3 < 33 || (W.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0 && W.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0)) {
            return i3 < 33 && W.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0;
        }
        return true;
    }

    public final void i0() {
        if ((t0() ? MediaController.a2 : MediaController.b2) == null) {
            MediaController.O(0);
        }
    }

    @Override // org.telegram.ui.Components.th
    public final int j() {
        return 1;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:22|(1:24)|(1:29)|(6:31|(5:33|(1:35)|36|(1:38)|(1:40))|98|42|(1:97)|46)(1:99)|(1:96)(1:51)|52|(2:53|(2:54|55))|(4:57|58|(2:60|61)|63)|64|65|66|67|68|69) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ce, code lost:
    
        if (t4.c.p(r13) != false) goto L38;
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
    public final void j0(int i3, Intent intent, String str) {
        String str2;
        String str3;
        Throwable th2;
        MediaMetadataRetriever mediaMetadataRetriever;
        MediaMetadataRetriever mediaMetadataRetriever2;
        int i10;
        int i11;
        bi biVar = this.b;
        boolean z10 = biVar.N1;
        org.telegram.ui.ActionBar.d2 d2Var = biVar.X1;
        if (z10) {
            return;
        }
        r1 = true;
        File file = null;
        MediaMetadataRetriever mediaMetadataRetriever3 = null;
        if (i3 == 0) {
            PhotoViewer.v1().N2(d2Var.getParentActivity(), null, this.a);
            PhotoViewer v12 = PhotoViewer.v1();
            int i12 = biVar.N3;
            boolean z11 = biVar.O3;
            v12.h = i12;
            v12.n = z11;
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
                    org.telegram.messenger.ye yeVar = new org.telegram.messenger.ye(i14, str, ((Integer) N0.first).intValue(), false, i13, i11);
                    yeVar.n(N0);
                    yeVar.L = true;
                    m0(yeVar, false, true);
                    return;
                }
            } catch (Exception unused2) {
                i10 = 0;
            }
            int i132 = i10;
            int i142 = v1;
            v1 = i142 - 1;
            org.telegram.messenger.ye yeVar2 = new org.telegram.messenger.ye(i142, str, ((Integer) N0.first).intValue(), false, i132, i11);
            yeVar2.n(N0);
            yeVar2.L = true;
            m0(yeVar2, false, true);
            return;
        }
        if (i3 == 2) {
            if (org.telegram.messenger.r2.a) {
                org.telegram.messenger.a8.b("pic path " + str);
            }
            if (intent != null && str != null && t4.c.p(str)) {
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
                if (!(d2Var instanceof org.telegram.ui.wm) || !((org.telegram.ui.wm) d2Var).z()) {
                    org.telegram.messenger.g0.e(str);
                }
                str3 = null;
            } else {
                str2 = null;
                str3 = str;
            }
            String str4 = (str2 == null && str3 != null && t4.c.p(str3)) ? str3 : str2;
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
                Bitmap r5 = org.telegram.messenger.yy.r(1, str4);
                String str5 = "-2147483648_" + org.telegram.messenger.az.p() + ".jpg";
                file = org.telegram.messenger.w7.z(4);
                File file2 = new File(file, str5);
                r5.compress(Bitmap.CompressFormat.JPEG, 55, new FileOutputStream(file2));
                org.telegram.messenger.az.y();
                int i15 = v1;
                v1 = i15 - 1;
                org.telegram.messenger.ye yeVar3 = new org.telegram.messenger.ye(i15, str4, 0, true, r5.getWidth(), r5.getHeight());
                yeVar3.E = (int) r13;
                yeVar3.c = file2.getAbsolutePath();
                m0(yeVar3, false, true);
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
            Bitmap r52 = org.telegram.messenger.yy.r(1, str4);
            String str52 = "-2147483648_" + org.telegram.messenger.az.p() + ".jpg";
            file = org.telegram.messenger.w7.z(4);
            File file22 = new File(file, str52);
            r52.compress(Bitmap.CompressFormat.JPEG, 55, new FileOutputStream(file22));
            org.telegram.messenger.az.y();
            int i152 = v1;
            v1 = i152 - 1;
            org.telegram.messenger.ye yeVar32 = new org.telegram.messenger.ye(i152, str4, 0, true, r52.getWidth(), r52.getHeight());
            yeVar32.E = (int) r13;
            yeVar32.c = file22.getAbsolutePath();
            m0(yeVar32, false, true);
        }
    }

    public final void k0(boolean z10) {
        pl plVar;
        pl plVar2 = this.Q;
        if (plVar2 == null || this.P != null) {
            return;
        }
        bi biVar = this.b;
        if (biVar.J) {
            return;
        }
        plVar2.initTexture();
        boolean t02 = t0();
        TextView textView = this.r0;
        int i3 = 0;
        if (t02) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        boolean isEmpty = s1.isEmpty();
        il ilVar = this.r;
        TextView textView2 = this.q0;
        if (isEmpty) {
            textView2.setVisibility(4);
            ilVar.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            ilVar.setVisibility(0);
        }
        if (biVar.a1().w && isFocusable()) {
            biVar.a1().d();
        }
        j71 j71Var = this.m0;
        j71Var.setVisibility(0);
        j71Var.setAlpha(0.0f);
        ai.o2 o2Var = this.k0;
        o2Var.setVisibility(0);
        o2Var.setTag(null);
        int[] iArr = this.g0;
        iArr[0] = 0;
        int i10 = this.L0;
        iArr[1] = i10;
        int i11 = 2;
        iArr[2] = org.telegram.messenger.g0.L(2.0f) + (i10 * 2);
        this.k1 = 0.0f;
        this.j1 = true;
        pl plVar3 = this.Q;
        if (plVar3 != null) {
            plVar3.setFpsLimit(-1);
        }
        org.telegram.messenger.g0.v1(this);
        org.telegram.messenger.g0.n3(biVar, false);
        setAlertKeepScreenOn(true);
        il ilVar2 = this.F;
        ImageView[] imageViewArr = this.T;
        if (z10) {
            setCameraOpenProgress(0.0f);
            this.e0 = true;
            if (ilVar2 != null) {
                ilVar2.invalidate();
            }
            this.g1.d();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this, "cameraOpenProgress", 0.0f, 1.0f));
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(o2Var, (Property<ai.o2, Float>) property, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(ilVar, (Property<il, Float>) property, 1.0f));
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
            animatorSet.addListener(new hl(this, i11));
            animatorSet.start();
        } else {
            setCameraOpenProgress(1.0f);
            o2Var.setAlpha(1.0f);
            textView2.setAlpha(1.0f);
            ilVar.setAlpha(1.0f);
            while (true) {
                if (i3 >= 2) {
                    break;
                }
                if (imageViewArr[i3].getVisibility() == 0) {
                    imageViewArr[i3].setAlpha(1.0f);
                    break;
                }
                i3++;
            }
            biVar.U3.v0();
            pl plVar4 = this.Q;
            if (plVar4 != null) {
                plVar4.setSystemUiVisibility(1028);
            }
        }
        this.c0 = true;
        pl plVar5 = this.Q;
        if (plVar5 != null) {
            plVar5.setImportantForAccessibility(2);
        }
        ilVar2.setImportantForAccessibility(4);
        ilVar2.invalidate();
        if (org.telegram.messenger.lc.e(360928) || (plVar = this.Q) == null || !plVar.isInited()) {
            return;
        }
        this.Q.showTexture(true, z10);
    }

    @Override // org.telegram.ui.Components.th
    public final void l() {
        X();
        invalidate();
    }

    public final void l0() {
        if (org.telegram.messenger.az.y0) {
            k0(true);
            return;
        }
        bi biVar = this.b;
        zh zhVar = biVar.U3;
        if (zhVar != null) {
            zhVar.o1(0, false, true, 0, 0, 0L, biVar.f1(), false, 0L);
        }
    }

    @Override // org.telegram.ui.Components.th
    public final void m(float f10) {
        this.X0 = f10;
        X();
        pl plVar = this.Q;
        if (plVar != null) {
            plVar.invalidateOutline();
            this.Q.invalidate();
        }
        invalidate();
    }

    public final void m0(org.telegram.messenger.ye yeVar, boolean z10, boolean z11) {
        int i3;
        org.telegram.ui.wm wmVar;
        org.telegram.ui.wm wmVar2;
        ArrayList<Object> arrayList;
        int i10;
        ArrayList arrayList2 = s1;
        bi biVar = this.b;
        if (yeVar != null) {
            int i11 = yeVar.C;
            arrayList2.add(yeVar);
            t1.put(Integer.valueOf(i11), yeVar);
            u1.add(Integer.valueOf(i11));
            biVar.K1(0);
            this.H.f();
            this.w.f();
        }
        if (yeVar != null && !z11 && arrayList2.size() > 1) {
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
        org.telegram.ui.ActionBar.d2 d2Var = biVar.X1;
        org.telegram.ui.ActionBar.d2 d2Var2 = biVar.X1;
        if (d2Var == null) {
            d2Var = LaunchActivity.Q();
        }
        if (d2Var == null) {
            return;
        }
        PhotoViewer.v1().N2(d2Var.getParentActivity(), null, this.a);
        PhotoViewer.v1().O2(biVar);
        PhotoViewer v12 = PhotoViewer.v1();
        int i12 = biVar.N3;
        boolean z12 = biVar.O3;
        v12.h = i12;
        v12.n = z12;
        if (biVar.x1 && biVar.y1) {
            wmVar = (org.telegram.ui.wm) d2Var2;
            i3 = 11;
        } else {
            if (biVar.L2 != 0) {
                i3 = 1;
            } else if (d2Var2 instanceof org.telegram.ui.wm) {
                wmVar = (org.telegram.ui.wm) d2Var2;
                i3 = 2;
            } else {
                i3 = 5;
            }
            wmVar = null;
        }
        boolean z13 = biVar.z1;
        if (z13) {
            i3 = 13;
            wmVar2 = null;
        } else {
            wmVar2 = wmVar;
        }
        int i13 = i3;
        if (biVar.L2 != 0 || z13) {
            arrayList = new ArrayList<>();
            arrayList.add(yeVar);
            i10 = 0;
        } else {
            arrayList = getAllPhotosArray();
            i10 = arrayList2.size() - 1;
        }
        ArrayList<Object> arrayList3 = arrayList;
        d30 d30Var = biVar.I1;
        if (d30Var != null && yeVar != null) {
            d30Var.e = yeVar.b;
        }
        PhotoViewer.v1().j2(arrayList3, i10, i13, false, new jl(this, z10), wmVar2);
        PhotoViewer.v1().A2(biVar.I1);
        if (biVar.y1) {
            PhotoViewer.v1().Z0(null, null, false, biVar.B1);
            PhotoViewer.v1().p2();
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

    @Override // org.telegram.ui.Components.th
    public final boolean o(MotionEvent motionEvent) {
        pl plVar;
        if (!this.e0) {
            if (this.c0 && motionEvent != null) {
                boolean z10 = this.H0;
                j71 j71Var = this.m0;
                if ((!z10 && motionEvent.getActionMasked() == 0) || motionEvent.getActionMasked() == 5) {
                    Rect rect = this.F0;
                    j71Var.getHitRect(rect);
                    if (j71Var.getTag() == null || !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
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
                    il ilVar = this.r;
                    TextView textView = this.q0;
                    Property property = View.ALPHA;
                    ImageView[] imageViewArr = this.T;
                    ai.o2 o2Var = this.k0;
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
                                    j71Var.b(false, this.C0);
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
                            float y9 = motionEvent.getY();
                            float f11 = y9 - this.G0;
                            if (this.I0) {
                                if (Math.abs(f11) > org.telegram.messenger.g0.a1(false, 0.4f)) {
                                    this.I0 = false;
                                    this.J0 = true;
                                    return true;
                                }
                            } else if (this.J0 && (plVar = this.Q) != null) {
                                plVar.setTranslationY(plVar.getTranslationY() + f11);
                                this.G0 = y9;
                                j71Var.setTag(null);
                                Runnable runnable = this.o0;
                                if (runnable != null) {
                                    org.telegram.messenger.g0.r(runnable);
                                    this.o0 = null;
                                }
                                if (o2Var.getTag() == null) {
                                    o2Var.setTag(1);
                                    AnimatorSet animatorSet = new AnimatorSet();
                                    animatorSet.playTogether(ObjectAnimator.ofFloat(o2Var, (Property<ai.o2, Float>) property, 0.0f), ObjectAnimator.ofFloat(j71Var, (Property<j71, Float>) property, 0.0f), ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f), ObjectAnimator.ofFloat(imageViewArr[0], (Property<ImageView, Float>) property, 0.0f), ObjectAnimator.ofFloat(imageViewArr[1], (Property<ImageView, Float>) property, 0.0f), ObjectAnimator.ofFloat(ilVar, (Property<il, Float>) property, 0.0f));
                                    animatorSet.setDuration(220L);
                                    animatorSet.setInterpolator(xq.f);
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
                            pl plVar2 = this.Q;
                            if (plVar2 != null) {
                                if (Math.abs(plVar2.getTranslationY()) > this.Q.getMeasuredHeight() / 6.0f) {
                                    d0(true);
                                    return true;
                                }
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.Q, (Property<pl, Float>) View.TRANSLATION_Y, 0.0f), ObjectAnimator.ofFloat(o2Var, (Property<ai.o2, Float>) property, 1.0f), ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 1.0f), ObjectAnimator.ofFloat(imageViewArr[0], (Property<ImageView, Float>) property, 1.0f), ObjectAnimator.ofFloat(imageViewArr[1], (Property<ImageView, Float>) property, 1.0f), ObjectAnimator.ofFloat(ilVar, (Property<il, Float>) property, 1.0f));
                                animatorSet2.setDuration(250L);
                                animatorSet2.setInterpolator(this.j0);
                                animatorSet2.start();
                                o2Var.setTag(null);
                                return true;
                            }
                        } else {
                            pl plVar3 = this.Q;
                            if (plVar3 != null && !this.E0) {
                                plVar3.getLocationOnScreen(this.W);
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
        if (this.b.N1) {
            return;
        }
        for (int i3 = 0; i3 < 2; i3++) {
            this.T[i3].animate().alpha(1.0f).translationX(0.0f).setDuration(150L).setInterpolator(xq.f).start();
        }
        ViewPropertyAnimator duration = this.s0.animate().alpha(1.0f).translationX(0.0f).setDuration(150L);
        xq xqVar = xq.f;
        duration.setInterpolator(xqVar).start();
        this.r0.animate().alpha(1.0f).setDuration(150L).setInterpolator(xqVar).start();
        org.telegram.messenger.g0.X3(this.S, false);
        org.telegram.messenger.g0.r(this.i0);
        this.i0 = null;
        org.telegram.messenger.g0.Q3(org.telegram.messenger.g0.W(getContext()));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13 = i11 - i3;
        if (this.T0 != i13) {
            this.T0 = i13;
            sl slVar = this.H;
            if (slVar != null) {
                slVar.f();
            }
        }
        super.onLayout(z10, i3, i10, i11, i12);
        X();
    }

    @Override // org.telegram.ui.Components.th
    public final void p() {
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.l4);
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.r2);
    }

    public final void p0() {
        try {
            W(false);
            if (this.Q != null) {
                CameraController.getInstance().startPreview(this.Q.getCameraSessionObject());
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.th
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

    @Override // org.telegram.ui.Components.th
    public final void r(int i3) {
        g0((i3 == 0 || i3 == 2) ? false : true);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.S0) {
            return;
        }
        super.requestLayout();
    }

    public final void s0(int i3, final boolean z10) {
        PhotoViewer v12 = PhotoViewer.v1();
        if (i3 == -1) {
            i3 = v12.Q4;
        }
        ArrayList arrayList = v12.h7;
        if (arrayList == null || arrayList.isEmpty() || i3 >= arrayList.size() || !(arrayList.get(i3) instanceof org.telegram.messenger.ye) || !((org.telegram.messenger.ye) arrayList.get(i3)).M) {
            return;
        }
        final org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) arrayList.get(i3);
        this.F.M(new q0.a() { // from class: org.telegram.ui.Components.bl
            @Override // q0.a
            public final void accept(Object obj) {
                View view = (View) obj;
                boolean z11 = ChatAttachAlertPhotoLayout.r1;
                if (view instanceof org.telegram.ui.Cells.q5) {
                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) view;
                    if (q5Var.getPhotoEntry() == yeVar) {
                        q5Var.c(z10, Float.valueOf(250.0f));
                        q5Var.f(ChatAttachAlertPhotoLayout.this.getStarsPrice(), ChatAttachAlertPhotoLayout.t1.size() > 1);
                    }
                }
            }
        });
    }

    public void setCameraOpenProgress(float f10) {
        int i3;
        int i10;
        if (this.Q == null) {
            return;
        }
        this.f0 = f10;
        int[] iArr = this.g0;
        float f11 = iArr[1];
        float f12 = iArr[2];
        int i11 = org.telegram.messenger.g0.q.x;
        bi biVar = this.b;
        float width = biVar.c.getWidth();
        float height = biVar.c.getHeight();
        float[] fArr = this.V;
        float f13 = fArr[0];
        float f14 = fArr[1];
        float f15 = this.k1;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.Q.getLayoutParams();
        float textureHeight = this.Q.getTextureHeight(f11, f12) / this.Q.getTextureHeight(width, height);
        float f16 = f12 / height;
        float f17 = f11 / width;
        if (this.j1) {
            i3 = (int) width;
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
            i3 = (int) f11;
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
        if (layoutParams.width != i3 || layoutParams.height != i10) {
            layoutParams.width = i3;
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

    public void setStarsPrice(long j10) {
        HashMap hashMap = t1;
        if (!hashMap.isEmpty()) {
            Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) ((Map.Entry) it.next()).getValue();
                yeVar.N = j10;
                yeVar.M = j10 > 0;
                yeVar.R = false;
            }
        }
        D(getSelectedItemsCount());
        if (Z(false)) {
            A0();
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        bi biVar = this.b;
        if (biVar.B0 == 1) {
            float f11 = (f10 / 40.0f) * (-0.1f);
            il ilVar = this.F;
            int childCount = ilVar.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = ilVar.getChildAt(i3);
                if (childAt instanceof org.telegram.ui.Cells.q5) {
                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                    float f12 = 1.0f + f11;
                    q5Var.getCheckBox().setScaleX(f12);
                    q5Var.getCheckBox().setScaleY(f12);
                }
            }
        }
        super.setTranslationY(f10);
        biVar.b.invalidate();
        invalidate();
    }

    @Override // org.telegram.ui.Components.th
    public final void t() {
        pl plVar = this.Q;
        if (plVar != null) {
            plVar.setVisibility(8);
        }
        for (Map.Entry entry : t1.entrySet()) {
            if (entry.getValue() instanceof org.telegram.messenger.ye) {
                ((org.telegram.messenger.ye) entry.getValue()).getClass();
            }
        }
        this.H.f();
    }

    public final boolean t0() {
        if (this.z0) {
            return true;
        }
        bi biVar = this.b;
        if (biVar.x1) {
            return false;
        }
        return (biVar.X1 instanceof org.telegram.ui.wm) || biVar.O2 || biVar.L2 == 2;
    }

    @Override // org.telegram.ui.Components.th
    public final void u() {
        this.O = true;
        il ilVar = this.F;
        int childCount = ilVar.getChildCount();
        int i3 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            if (ilVar.getChildAt(i3) instanceof org.telegram.ui.Cells.k5) {
                q0();
                break;
            } else {
                this.R.i();
                i3++;
            }
        }
        ViewPropertyAnimator viewPropertyAnimator = this.p1;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator withEndAction = this.y.animate().alpha(0.0f).setDuration(150L).setInterpolator(xq.j).withEndAction(new al(this, 3));
        this.p1 = withEndAction;
        withEndAction.start();
        n0();
    }

    public final void u0(t8 t8Var, TLRPC.VideoSize videoSize, long j10) {
        bi biVar = this.b;
        r8 r8Var = new r8(biVar.M1, biVar.I1);
        d30 d30Var = biVar.I1;
        r8Var.R = d30Var == null || d30Var.c != 2;
        biVar.X1.presentFragment(r8Var);
        if (t8Var != null) {
            r8Var.r0(t8Var);
        }
        if (videoSize != null) {
            r8Var.q0(videoSize);
        }
        if (j10 != 0) {
            r8Var.p0(j10);
        }
        r8Var.J = new org.telegram.ui.jo(17, this, r8Var);
    }

    @Override // org.telegram.ui.Components.th
    public final void v(float f10) {
        pl plVar = this.Q;
        if (plVar != null) {
            plVar.setAlpha(f10);
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
        bi biVar = this.b;
        if (!biVar.a4 && this.w0 && CameraView.isCameraAllowed()) {
            if (this.Q == null) {
                boolean z10 = !org.telegram.messenger.lc.e(360928);
                Context context = getContext();
                Boolean bool = this.p0;
                pl plVar = new pl(this, context, bool != null ? bool.booleanValue() : biVar.P3, z10);
                this.Q = plVar;
                org.telegram.ui.ActionBar.d2 d2Var = biVar.X1;
                plVar.setRecordFile(org.telegram.messenger.g0.s0((d2Var instanceof org.telegram.ui.wm) && ((org.telegram.ui.wm) d2Var).z()));
                this.Q.setFocusable(true);
                this.Q.setFpsLimit(30);
                this.Q.setOutlineProvider(new gh.a(this, 2));
                this.Q.setClipToOutline(true);
                this.Q.setContentDescription(org.telegram.messenger.bd.M0(2131754852, null));
                org.telegram.ui.ActionBar.j2 j2Var = biVar.c;
                pl plVar2 = this.Q;
                int i3 = this.L0;
                j2Var.addView(plVar2, 1, new FrameLayout.LayoutParams(i3, i3));
                this.Q.setDelegate(new kl(this));
                this.Q.setAlpha(this.w0 ? 1.0f : 0.2f);
                this.Q.setEnabled(this.w0);
                if (this.O) {
                    this.Q.setVisibility(8);
                }
                if (!this.c0) {
                    X();
                }
                il ilVar = this.F;
                if (ilVar != null) {
                    ilVar.invalidate();
                }
                invalidate();
            }
            j71 j71Var = this.m0;
            if (j71Var != null) {
                j71Var.b(false, 0.0f);
                this.C0 = 0.0f;
            }
            if (this.c0) {
                return;
            }
            this.Q.setTranslationX(this.V[0]);
        }
    }

    @Override // org.telegram.ui.Components.th
    public final void w(int i3) {
        TLRPC.Chat Y0;
        boolean z10;
        boolean z11;
        char c2 = 1;
        char c10 = 1;
        char c11 = 1;
        char c12 = 1;
        bi biVar = this.b;
        if (i3 == 8) {
            biVar.v1(!biVar.U1, true);
            this.e1.a(!biVar.U1, true);
            return;
        }
        if ((i3 == 0 || i3 == 1) && biVar.N3 > 0 && u1.size() > 1 && (Y0 = biVar.Y0()) != null && !org.telegram.messenger.t3.N(Y0) && Y0.slowmode_enabled) {
            t4.N(getContext(), org.telegram.messenger.bd.M0(2131745320, null), org.telegram.messenger.bd.M0(2131745312, null), null, null, this.a).p();
            return;
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        HashMap hashMap = t1;
        final int i10 = 0;
        if (i3 == 0) {
            org.telegram.messenger.zi ziVar = biVar.C3;
            org.telegram.ui.ActionBar.d2 d2Var = biVar.X1;
            if (ziVar == null && (d2Var instanceof org.telegram.ui.wm) && ((org.telegram.ui.wm) d2Var).c()) {
                t4.L(getContext(), ((org.telegram.ui.wm) d2Var).a(), new wk(this, i10), e6Var);
                return;
            } else {
                t4.Z(biVar.E3, biVar.X0() + hashMap.size(), biVar.b1(), new org.telegram.messenger.u10(this) { // from class: org.telegram.ui.Components.xk
                    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.messenger.u10
                    public final void a(Object obj) {
                        int i11 = i10;
                        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                        Long l10 = (Long) obj;
                        switch (i11) {
                            case 0:
                                boolean z12 = ChatAttachAlertPhotoLayout.r1;
                                bi biVar2 = chatAttachAlertPhotoLayout.b;
                                biVar2.M0();
                                biVar2.U3.o1(7, false, true, 0, 0, 0L, biVar2.f1(), false, l10.longValue());
                                break;
                            default:
                                boolean z13 = ChatAttachAlertPhotoLayout.r1;
                                bi biVar3 = chatAttachAlertPhotoLayout.b;
                                biVar3.M0();
                                biVar3.U3.o1(4, true, true, 0, 0, 0L, biVar3.f1(), false, l10.longValue());
                                break;
                        }
                    }
                });
                return;
            }
        }
        if (i3 == 1) {
            org.telegram.messenger.zi ziVar2 = biVar.C3;
            org.telegram.ui.ActionBar.d2 d2Var2 = biVar.X1;
            if (ziVar2 == null && (d2Var2 instanceof org.telegram.ui.wm) && ((org.telegram.ui.wm) d2Var2).c()) {
                t4.L(getContext(), ((org.telegram.ui.wm) d2Var2).a(), new wk(this, c12 == true ? 1 : 0), e6Var);
                return;
            }
            int i11 = biVar.E3;
            long b12 = biVar.b1();
            int X0 = biVar.X0() + hashMap.size();
            final char c13 = c11 == true ? 1 : 0;
            t4.Z(i11, X0, b12, new org.telegram.messenger.u10(this) { // from class: org.telegram.ui.Components.xk
                public final /* synthetic */ ChatAttachAlertPhotoLayout b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.u10
                public final void a(Object obj) {
                    int i112 = c13;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                    Long l10 = (Long) obj;
                    switch (i112) {
                        case 0:
                            boolean z12 = ChatAttachAlertPhotoLayout.r1;
                            bi biVar2 = chatAttachAlertPhotoLayout.b;
                            biVar2.M0();
                            biVar2.U3.o1(7, false, true, 0, 0, 0L, biVar2.f1(), false, l10.longValue());
                            break;
                        default:
                            boolean z13 = ChatAttachAlertPhotoLayout.r1;
                            bi biVar3 = chatAttachAlertPhotoLayout.b;
                            biVar3.M0();
                            biVar3.U3.o1(4, true, true, 0, 0, 0L, biVar3.f1(), false, l10.longValue());
                            break;
                    }
                }
            });
            return;
        }
        sl slVar = this.H;
        il ilVar = this.F;
        if (i3 == 3) {
            am amVar = biVar.i2;
            if (amVar != null) {
                amVar.O();
            }
            Iterator it = hashMap.entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((org.telegram.messenger.ye) ((Map.Entry) it.next()).getValue()).M) {
                        z11 = true;
                        break;
                    }
                } else {
                    z11 = false;
                    break;
                }
            }
            final boolean z12 = !z11;
            org.telegram.messenger.g0.i3(new Runnable(this) { // from class: org.telegram.ui.Components.yk
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
                            bi biVar2 = chatAttachAlertPhotoLayout.b;
                            org.telegram.ui.ActionBar.y0 y0Var = chatAttachAlertPhotoLayout.Z0;
                            y0Var.setText(org.telegram.messenger.bd.M0(z13 ? 2131751431 : 2131751155, null));
                            if (z13) {
                                y0Var.setIcon(R.drawable.msg_spoiler_off);
                            } else {
                                y0Var.setAnimatedIcon(R.raw.photo_spoiler);
                            }
                            if (!z13) {
                                biVar2.V2.S(1);
                                if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                    biVar2.V2.S(6);
                                    break;
                                }
                            } else {
                                biVar2.V2.t(1);
                                if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                    biVar2.V2.t(6);
                                    break;
                                }
                            }
                            break;
                        default:
                            org.telegram.ui.ActionBar.y0 y0Var2 = chatAttachAlertPhotoLayout.b1;
                            y0Var2.setText(org.telegram.messenger.bd.M0(z13 ? 2131745630 : 2131745631, null));
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
                if (entry.getValue() instanceof org.telegram.messenger.ye) {
                    org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) entry.getValue();
                    yeVar.M = z12;
                    yeVar.R = false;
                    arrayList.add(Integer.valueOf(yeVar.C));
                }
            }
            ilVar.M(new zk(i10, arrayList, z12));
            if (biVar.t2 != this) {
                slVar.f();
            }
            am amVar2 = biVar.i2;
            if (amVar2 != null) {
                amVar2.w.invalidate();
                return;
            }
            return;
        }
        if (i3 == 2) {
            am amVar3 = biVar.i2;
            if (amVar3 != null) {
                amVar3.O();
            }
            Iterator it2 = hashMap.entrySet().iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((org.telegram.messenger.ye) ((Map.Entry) it2.next()).getValue()).c()) {
                        z10 = true;
                        break;
                    }
                } else {
                    z10 = false;
                    break;
                }
            }
            final boolean z13 = !z10;
            final char c14 = c10 == true ? 1 : 0;
            org.telegram.messenger.g0.i3(new Runnable(this) { // from class: org.telegram.ui.Components.yk
                public final /* synthetic */ ChatAttachAlertPhotoLayout b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i12 = c14;
                    boolean z132 = z13;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                    switch (i12) {
                        case 0:
                            boolean z14 = ChatAttachAlertPhotoLayout.r1;
                            bi biVar2 = chatAttachAlertPhotoLayout.b;
                            org.telegram.ui.ActionBar.y0 y0Var = chatAttachAlertPhotoLayout.Z0;
                            y0Var.setText(org.telegram.messenger.bd.M0(z132 ? 2131751431 : 2131751155, null));
                            if (z132) {
                                y0Var.setIcon(R.drawable.msg_spoiler_off);
                            } else {
                                y0Var.setAnimatedIcon(R.raw.photo_spoiler);
                            }
                            if (!z132) {
                                biVar2.V2.S(1);
                                if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                    biVar2.V2.S(6);
                                    break;
                                }
                            } else {
                                biVar2.V2.t(1);
                                if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                    biVar2.V2.t(6);
                                    break;
                                }
                            }
                            break;
                        default:
                            org.telegram.ui.ActionBar.y0 y0Var2 = chatAttachAlertPhotoLayout.b1;
                            y0Var2.setText(org.telegram.messenger.bd.M0(z132 ? 2131745630 : 2131745631, null));
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
                if (entry2.getValue() instanceof org.telegram.messenger.ye) {
                    org.telegram.messenger.ye yeVar2 = (org.telegram.messenger.ye) entry2.getValue();
                    yeVar2.z = Boolean.valueOf(z13);
                    yeVar2.R = false;
                    arrayList2.add(Integer.valueOf(yeVar2.C));
                }
            }
            ilVar.M(new zk(c2 == true ? 1 : 0, arrayList2, z13));
            if (biVar.t2 != this) {
                slVar.f();
            }
            am amVar4 = biVar.i2;
            if (amVar4 != null) {
                amVar4.w.invalidate();
                return;
            }
            return;
        }
        if (i3 != 4) {
            if (i3 == 7) {
                biVar.O1(biVar.t2 != biVar.i2);
                return;
            }
            if (i3 == 9) {
                ci.wb.j1(getContext(), getStarsPrice(), true, new e(this, 6), this.a);
                return;
            }
            if (i3 >= 10) {
                org.telegram.messenger.pe peVar = (org.telegram.messenger.pe) this.W0.get(i3 - 10);
                this.U0 = peVar;
                org.telegram.messenger.pe peVar2 = this.V0;
                TextView textView = this.y;
                if (peVar == peVar2) {
                    textView.setText(org.telegram.messenger.bd.M0(2131752238, null));
                } else {
                    textView.setText(peVar.c);
                }
                slVar.f();
                this.w.f();
                this.G.h1(0, -(ilVar.getPaddingTop() - getTopScrollOffset()));
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
                int i12 = biVar.L2;
                org.telegram.ui.ActionBar.d2 d2Var3 = biVar.X1;
                if (i12 != 0) {
                    d2Var3.startActivityForResult(createChooser, 14);
                } else {
                    d2Var3.startActivityForResult(createChooser, 1);
                }
            } else {
                Intent intent3 = new Intent("android.intent.action.PICK");
                intent3.setType("image/*");
                int i13 = biVar.L2;
                org.telegram.ui.ActionBar.d2 d2Var4 = biVar.X1;
                if (i13 != 0) {
                    d2Var4.startActivityForResult(intent3, 14);
                } else {
                    d2Var4.startActivityForResult(intent3, 1);
                }
            }
            biVar.a(true);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void w0(boolean z10) {
        j71 j71Var = this.m0;
        int i3 = 1;
        if ((j71Var.getTag() != null && z10) || (j71Var.getTag() == null && !z10)) {
            if (z10) {
                Runnable runnable = this.o0;
                if (runnable != null) {
                    org.telegram.messenger.g0.r(runnable);
                }
                al alVar = new al(this, i3);
                this.o0 = alVar;
                org.telegram.messenger.g0.i3(alVar, 2000L);
                return;
            }
            return;
        }
        AnimatorSet animatorSet = this.n0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        j71Var.setTag(z10 ? 1 : null);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.n0 = animatorSet2;
        animatorSet2.setDuration(180L);
        this.n0.playTogether(ObjectAnimator.ofFloat(j71Var, (Property<j71, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
        this.n0.addListener(new hl(this, i3));
        this.n0.start();
        if (z10) {
            al alVar2 = new al(this, 2);
            this.o0 = alVar2;
            org.telegram.messenger.g0.i3(alVar2, 2000L);
        }
    }

    @Override // org.telegram.ui.Components.th
    public final void x() {
        bi biVar = this.b;
        W(biVar != null && (biVar.X1 instanceof org.telegram.ui.wm));
    }

    public final void x0() {
        gi.u2 u2Var = this.x;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = u2Var.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        if (this.w0) {
            ArrayList arrayList = t0() ? MediaController.c2 : MediaController.d2;
            ArrayList arrayList2 = new ArrayList(arrayList);
            this.W0 = arrayList2;
            Collections.sort(arrayList2, new dl(arrayList, 0));
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
        for (int i3 = 0; i3 < size; i3++) {
            org.telegram.messenger.pe peVar = (org.telegram.messenger.pe) this.W0.get(i3);
            gi.a aVar = new gi.a(getContext(), peVar.d, peVar.c, peVar.e.size(), this.a);
            u2Var.getPopupLayout().addView(aVar);
            aVar.setOnClickListener(new bi.q(this, i3 + 10, 11));
        }
    }

    public final void y0() {
        il ilVar = this.F;
        if (ilVar != null) {
            for (int i3 = 0; i3 < ilVar.getChildCount(); i3++) {
                View childAt = ilVar.getChildAt(i3);
                if (childAt instanceof org.telegram.ui.Cells.q5) {
                    ((org.telegram.ui.Cells.q5) childAt).a.invalidate();
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.th
    public final void z(int i3, boolean z10) {
        X();
        pl plVar = this.Q;
        if (plVar != null) {
            plVar.invalidateOutline();
            this.Q.invalidate();
        }
    }

    public final void z0() {
        ArrayList arrayList;
        if (this.b.X1 instanceof org.telegram.ui.wm) {
            il ilVar = this.F;
            int childCount = ilVar.getChildCount();
            int i3 = 0;
            while (true) {
                arrayList = u1;
                if (i3 >= childCount) {
                    break;
                }
                View childAt = ilVar.getChildAt(i3);
                if (childAt instanceof org.telegram.ui.Cells.q5) {
                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                    org.telegram.messenger.ye e02 = e0(((Integer) q5Var.getTag()).intValue());
                    if (e02 != null) {
                        q5Var.setNum(arrayList.indexOf(Integer.valueOf(e02.C)));
                    }
                }
                i3++;
            }
            il ilVar2 = this.r;
            int childCount2 = ilVar2.getChildCount();
            for (int i10 = 0; i10 < childCount2; i10++) {
                View childAt2 = ilVar2.getChildAt(i10);
                if (childAt2 instanceof org.telegram.ui.Cells.q5) {
                    org.telegram.ui.Cells.q5 q5Var2 = (org.telegram.ui.Cells.q5) childAt2;
                    org.telegram.messenger.ye e03 = e0(((Integer) q5Var2.getTag()).intValue());
                    if (e03 != null) {
                        q5Var2.setNum(arrayList.indexOf(Integer.valueOf(e03.C)));
                    }
                }
            }
        }
    }
}
