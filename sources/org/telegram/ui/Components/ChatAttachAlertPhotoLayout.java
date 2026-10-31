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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class ChatAttachAlertPhotoLayout extends uh implements org.telegram.messenger.us {
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
    public final pl E;
    public final Rect E0;
    public final oi F;
    public float F0;
    public final bm G;
    public boolean G0;
    public final xy H;
    public boolean H0;
    public final xk0 I;
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
    public yl P;
    public boolean P0;
    public final zl Q;
    public boolean Q0;
    public final wl R;
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
    public final org.telegram.ui.ActionBar.b1 Y0;
    public final org.telegram.ui.ActionBar.b1 Z0;
    public float a0;
    public final org.telegram.ui.ActionBar.b1 a1;
    public boolean b0;
    public final org.telegram.ui.ActionBar.b1 b1;
    public boolean c0;
    public final org.telegram.ui.ActionBar.b1 c1;
    public boolean d0;
    public final za0 d1;
    public float e0;
    public final boolean e1;
    public final int[] f0;
    public final e2.f f1;
    public int g0;
    public boolean g1;
    public ml h0;
    public final sl h1;
    public final DecelerateInterpolator i0;
    public boolean i1;
    public final jg.l0 j0;
    public float j1;
    public final ShutterButton k0;
    public float k1;
    public final s81 l0;
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
    public final pl r;
    public final ImageView r0;
    public final dh.f s;
    public boolean s0;
    public boolean t0;
    public boolean u0;
    public boolean v0;
    public final bm w;
    public boolean w0;
    public final tl x;
    public boolean x0;
    public final TextView y;
    public boolean y0;
    public boolean z0;

    /* JADX WARN: Multi-variable type inference failed */
    public ChatAttachAlertPhotoLayout(bi biVar, Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var, biVar);
        final int i10 = 2;
        this.S = new ImageView[2];
        this.U = new float[2];
        this.V = new int[2];
        int i11 = 5;
        this.f0 = new int[5];
        this.i0 = new DecelerateInterpolator(1.5f);
        this.o0 = null;
        this.E0 = new Rect();
        int L = org.telegram.messenger.i0.L(80.0f);
        this.K0 = L;
        this.L0 = L;
        final int i12 = 3;
        this.M0 = 3;
        final int i13 = 1;
        this.X0 = true;
        this.f1 = new e2.f(null);
        this.h1 = new sl(this);
        this.e1 = z10;
        this.n = z11;
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.r2);
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.l4);
        org.telegram.ui.ActionBar.p2 p2Var = biVar.c;
        bi biVar2 = this.b;
        int i14 = 0;
        this.g1 = biVar2.K2 != 0;
        tl tlVar = new tl(this, context, biVar2.R2.p(), p6Var, 0);
        this.x = tlVar;
        tlVar.setSubMenuOpenSide(1);
        FrameLayout.LayoutParams d = w7.b6.d(-2, -1.0f, 51, 60.0f, 0.0f, 40.0f, 0.0f);
        d.topMargin = org.telegram.messenger.i0.m;
        this.b.R2.addView(tlVar, 0, d);
        tlVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.cl
            public final /* synthetic */ ChatAttachAlertPhotoLayout b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                yl ylVar;
                yl ylVar2;
                int i15 = i10;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                int i16 = 0;
                switch (i15) {
                    case 0:
                        if (!chatAttachAlertPhotoLayout.s0 && (ylVar = chatAttachAlertPhotoLayout.P) != null && ylVar.isInited()) {
                            chatAttachAlertPhotoLayout.c0 = false;
                            chatAttachAlertPhotoLayout.P.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.r0, (Property<ImageView, Float>) View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new ol(chatAttachAlertPhotoLayout, i16));
                            duration.start();
                            break;
                        }
                        break;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.T && (ylVar2 = chatAttachAlertPhotoLayout.P) != null && ylVar2.isInited() && chatAttachAlertPhotoLayout.b0) {
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
                                ChatAttachAlertPhotoLayout.p0(imageView, nextFlashMode);
                                AnimatorSet animatorSet = new AnimatorSet();
                                Property property = View.TRANSLATION_Y;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 0.0f, org.telegram.messenger.i0.L(48.0f));
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, -org.telegram.messenger.i0.L(48.0f), 0.0f);
                                Property property2 = View.ALPHA;
                                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property2, 0.0f, 1.0f));
                                animatorSet.setDuration(220L);
                                animatorSet.setInterpolator(gr.f);
                                animatorSet.addListener(new org.telegram.ui.ActionBar.g1(chatAttachAlertPhotoLayout, view, imageView));
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
                            chatAttachAlertPhotoLayout.k0(null, false, false);
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
        int i15 = org.telegram.ui.ActionBar.t6.j5;
        org.telegram.ui.ActionBar.a7.V(textView, i15, p6Var);
        textView.setText(org.telegram.messenger.cd.L0(2131752238, null));
        textView.setTypeface(org.telegram.messenger.i0.o());
        Drawable f7 = i0.a.f(context, R.drawable.ic_arrow_drop_down);
        this.D = f7;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.a7.y(this, f7, i15, p6Var, mode);
        textView.setPadding(0, 0, org.telegram.messenger.i0.L(10.0f), 0);
        tlVar.addView(textView, w7.b6.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
        V(false);
        za0 za0Var = new za0(context, R.raw.position_below, org.telegram.messenger.cd.L0(2131752560, null), R.raw.position_above, org.telegram.messenger.cd.L0(2131752559, null), p6Var);
        this.d1 = za0Var;
        za0Var.a(!this.b.T1, false);
        this.c1 = this.b.U2.e(7, R.drawable.msg_view_file, org.telegram.messenger.cd.L0(2131753957, null));
        this.b.U2.a(5);
        this.b.U2.e(4, R.drawable.msg_openin, org.telegram.messenger.cd.L0(2131747812, null));
        this.Z0 = this.b.U2.e(1, R.drawable.msg_filehq, org.telegram.messenger.cd.L0(2131745602, null));
        this.b.U2.e(0, R.drawable.msg_ungroup, org.telegram.messenger.cd.L0(2131745601, null));
        this.b.U2.a(6);
        this.Y0 = this.b.U2.e(3, R.drawable.msg_spoiler, org.telegram.messenger.cd.L0(2131751155, null));
        this.a1 = this.b.U2.e(2, R.drawable.menu_quality_hd, org.telegram.messenger.cd.L0(2131745638, null));
        org.telegram.ui.ActionBar.t0 t0Var = this.b.U2;
        t0Var.p();
        za0Var.setMinimumWidth(org.telegram.messenger.i0.L(196.0f));
        za0Var.setTag(8);
        t0Var.b.addView(za0Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) za0Var.getLayoutParams();
        if (org.telegram.messenger.cd.X) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = org.telegram.messenger.i0.L(48.0f);
        za0Var.setLayoutParams(layoutParams);
        za0Var.setOnClickListener(new org.telegram.ui.ActionBar.z(t0Var, 2));
        this.b1 = this.b.U2.e(9, R.drawable.menu_feature_paid, org.telegram.messenger.cd.L0(2131747746, null));
        this.b.U2.setFitSubItems(true);
        pl plVar = new pl(this, context, p6Var, i13);
        this.E = plVar;
        plVar.setFastScrollEnabled(1);
        plVar.setFastScrollVisible(true);
        plVar.getFastScroll().setAlpha(0.0f);
        plVar.getFastScroll().a = false;
        plVar.getFastScroll().h0 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        bm bmVar = new bm(this, context, z11);
        this.G = bmVar;
        plVar.setAdapter(bmVar);
        zl zlVar = new zl(this, plVar);
        this.Q = zlVar;
        plVar.i(zlVar);
        int i16 = 0;
        for (int i17 = 8; i16 < i17; i17 = 8) {
            bmVar.h.add(bmVar.L());
            i16++;
        }
        plVar.setClipToPadding(false);
        plVar.setItemAnimator(null);
        plVar.setLayoutAnimation(null);
        plVar.setVerticalScrollBarEnabled(false);
        org.telegram.ui.ActionBar.a7.m(plVar, 21, org.telegram.ui.ActionBar.t6.A5, p6Var);
        addView(plVar, w7.b6.d(-1, -1.0f, org.telegram.messenger.zs.E1, 0.0f, 0.0f, 0.0f, -48.0f));
        plVar.setOnScrollListener(new ul(i14, this));
        oi oiVar = new oi(this, this.K0, i13);
        this.F = oiVar;
        oiVar.O = new jg.h1(this, i12);
        plVar.setLayoutManager(oiVar);
        plVar.setOnItemClickListener(new ag.v0(this, z11, p6Var, i11));
        plVar.setOnItemLongClickListener(new dl(this, 2));
        xk0 xk0Var = new xk0(new m2.t(this, 9));
        this.I = xk0Var;
        plVar.E.add(xk0Var);
        setBlur3Capture(plVar);
        this.d = plVar;
        this.f = true;
        xy xyVar = new xy(context, p6Var);
        this.H = xyVar;
        xyVar.setText(org.telegram.messenger.cd.L0(2131748197, null));
        xyVar.setOnTouchListener(null);
        xyVar.setTextSize(16);
        addView(xyVar, w7.b6.c(-2.0f, -1));
        if (this.X0) {
            xyVar.b();
        } else {
            xyVar.c();
        }
        Paint paint = new Paint(1);
        paint.setColor(-2468275);
        wl wlVar = new wl(context, paint);
        this.R = wlVar;
        org.telegram.messenger.i0.Y3(wlVar, false, 1.0f, true, false);
        wlVar.setBackgroundResource(R.drawable.system);
        wlVar.getBackground().setColorFilter(new PorterDuffColorFilter(1711276032, mode));
        wlVar.setTextSize(1, 15.0f);
        wlVar.setTypeface(org.telegram.messenger.i0.o());
        wlVar.setAlpha(0.0f);
        wlVar.setTextColor(-1);
        wlVar.setPadding(org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(5.0f));
        p2Var.addView(wlVar, w7.b6.d(-2, -2.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
        jg.l0 l0Var = new jg.l0(this, context, 14);
        this.j0 = l0Var;
        l0Var.setVisibility(8);
        l0Var.setAlpha(0.0f);
        p2Var.addView(l0Var, w7.b6.e(-1, org.telegram.messenger.zs.K1, 83));
        TextView textView2 = new TextView(context);
        this.p0 = textView2;
        textView2.setBackgroundResource(R.drawable.photos_rounded);
        textView2.setVisibility(8);
        textView2.setTextColor(-1);
        textView2.setGravity(17);
        textView2.setPivotX(0.0f);
        textView2.setPivotY(0.0f);
        textView2.setTypeface(org.telegram.messenger.i0.o());
        textView2.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.photos_arrow, 0);
        textView2.setCompoundDrawablePadding(org.telegram.messenger.i0.L(4.0f));
        textView2.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), 0);
        p2Var.addView(textView2, w7.b6.d(-2, 38.0f, 51, 0.0f, 0.0f, 0.0f, 116.0f));
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.cl
            public final /* synthetic */ ChatAttachAlertPhotoLayout b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                yl ylVar;
                yl ylVar2;
                int i152 = i12;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                int i162 = 0;
                switch (i152) {
                    case 0:
                        if (!chatAttachAlertPhotoLayout.s0 && (ylVar = chatAttachAlertPhotoLayout.P) != null && ylVar.isInited()) {
                            chatAttachAlertPhotoLayout.c0 = false;
                            chatAttachAlertPhotoLayout.P.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.r0, (Property<ImageView, Float>) View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new ol(chatAttachAlertPhotoLayout, i162));
                            duration.start();
                            break;
                        }
                        break;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.T && (ylVar2 = chatAttachAlertPhotoLayout.P) != null && ylVar2.isInited() && chatAttachAlertPhotoLayout.b0) {
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
                                ChatAttachAlertPhotoLayout.p0(imageView, nextFlashMode);
                                AnimatorSet animatorSet = new AnimatorSet();
                                Property property = View.TRANSLATION_Y;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 0.0f, org.telegram.messenger.i0.L(48.0f));
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, -org.telegram.messenger.i0.L(48.0f), 0.0f);
                                Property property2 = View.ALPHA;
                                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property2, 0.0f, 1.0f));
                                animatorSet.setDuration(220L);
                                animatorSet.setInterpolator(gr.f);
                                animatorSet.addListener(new org.telegram.ui.ActionBar.g1(chatAttachAlertPhotoLayout, view, imageView));
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
                            chatAttachAlertPhotoLayout.k0(null, false, false);
                            CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.P.getCameraSessionObject());
                            break;
                        }
                        break;
                }
            }
        });
        s81 s81Var = new s81(context);
        this.l0 = s81Var;
        s81Var.setVisibility(8);
        s81Var.setAlpha(0.0f);
        p2Var.addView(s81Var, w7.b6.d(-2, 50.0f, 51, 0.0f, 0.0f, 0.0f, 116.0f));
        s81Var.setDelegate(new dl(this, i12));
        ShutterButton shutterButton = new ShutterButton(context);
        shutterButton.b = new DecelerateInterpolator();
        shutterButton.x = new ew(shutterButton, 12);
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
        shutterButton.f = fu0.a;
        this.k0 = shutterButton;
        l0Var.addView(shutterButton, w7.b6.e(84, 84, 17));
        shutterButton.setDelegate(new nl(this, p6Var, p2Var));
        shutterButton.setFocusable(true);
        shutterButton.setContentDescription(org.telegram.messenger.cd.L0(2131754760, null));
        ImageView imageView = new ImageView(context);
        this.r0 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        l0Var.addView(imageView, w7.b6.e(48, 48, 21));
        final Object[] objArr = null == true ? 1 : 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.cl
            public final /* synthetic */ ChatAttachAlertPhotoLayout b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                yl ylVar;
                yl ylVar2;
                int i152 = objArr;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                int i162 = 0;
                switch (i152) {
                    case 0:
                        if (!chatAttachAlertPhotoLayout.s0 && (ylVar = chatAttachAlertPhotoLayout.P) != null && ylVar.isInited()) {
                            chatAttachAlertPhotoLayout.c0 = false;
                            chatAttachAlertPhotoLayout.P.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.r0, (Property<ImageView, Float>) View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new ol(chatAttachAlertPhotoLayout, i162));
                            duration.start();
                            break;
                        }
                        break;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.T && (ylVar2 = chatAttachAlertPhotoLayout.P) != null && ylVar2.isInited() && chatAttachAlertPhotoLayout.b0) {
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
                                ChatAttachAlertPhotoLayout.p0(imageView2, nextFlashMode);
                                AnimatorSet animatorSet = new AnimatorSet();
                                Property property = View.TRANSLATION_Y;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 0.0f, org.telegram.messenger.i0.L(48.0f));
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, -org.telegram.messenger.i0.L(48.0f), 0.0f);
                                Property property2 = View.ALPHA;
                                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 0.0f, 1.0f));
                                animatorSet.setDuration(220L);
                                animatorSet.setInterpolator(gr.f);
                                animatorSet.addListener(new org.telegram.ui.ActionBar.g1(chatAttachAlertPhotoLayout, view, imageView2));
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
                            chatAttachAlertPhotoLayout.k0(null, false, false);
                            CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.P.getCameraSessionObject());
                            break;
                        }
                        break;
                }
            }
        });
        imageView.setContentDescription(org.telegram.messenger.cd.L0(2131754752, null));
        for (int i18 = 0; i18 < 2; i18++) {
            this.S[i18] = new ImageView(context);
            this.S[i18].setScaleType(ImageView.ScaleType.CENTER);
            this.S[i18].setVisibility(4);
            this.j0.addView(this.S[i18], w7.b6.e(48, 48, 51));
            this.S[i18].setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.cl
                public final /* synthetic */ ChatAttachAlertPhotoLayout b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    yl ylVar;
                    yl ylVar2;
                    int i152 = i13;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                    int i162 = 0;
                    switch (i152) {
                        case 0:
                            if (!chatAttachAlertPhotoLayout.s0 && (ylVar = chatAttachAlertPhotoLayout.P) != null && ylVar.isInited()) {
                                chatAttachAlertPhotoLayout.c0 = false;
                                chatAttachAlertPhotoLayout.P.switchCamera();
                                ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.r0, (Property<ImageView, Float>) View.SCALE_X, 0.0f).setDuration(100L);
                                duration.addListener(new ol(chatAttachAlertPhotoLayout, i162));
                                duration.start();
                                break;
                            }
                            break;
                        case 1:
                            if (!chatAttachAlertPhotoLayout.T && (ylVar2 = chatAttachAlertPhotoLayout.P) != null && ylVar2.isInited() && chatAttachAlertPhotoLayout.b0) {
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
                                    ChatAttachAlertPhotoLayout.p0(imageView2, nextFlashMode);
                                    AnimatorSet animatorSet = new AnimatorSet();
                                    Property property = View.TRANSLATION_Y;
                                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 0.0f, org.telegram.messenger.i0.L(48.0f));
                                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, -org.telegram.messenger.i0.L(48.0f), 0.0f);
                                    Property property2 = View.ALPHA;
                                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 0.0f, 1.0f));
                                    animatorSet.setDuration(220L);
                                    animatorSet.setInterpolator(gr.f);
                                    animatorSet.addListener(new org.telegram.ui.ActionBar.g1(chatAttachAlertPhotoLayout, view, imageView2));
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
                                chatAttachAlertPhotoLayout.k0(null, false, false);
                                CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.P.getCameraSessionObject());
                                break;
                            }
                            break;
                    }
                }
            });
            this.S[i18].setContentDescription("flash mode " + i18);
        }
        TextView textView3 = new TextView(context);
        this.q0 = textView3;
        textView3.setTextSize(1, 15.0f);
        textView3.setTextColor(-1);
        textView3.setText(org.telegram.messenger.cd.L0(2131744296, null));
        textView3.setShadowLayer(org.telegram.messenger.i0.L(3.33333f), 0.0f, org.telegram.messenger.i0.L(0.666f), 1275068416);
        textView3.setPadding(org.telegram.messenger.i0.L(6.0f), 0, org.telegram.messenger.i0.L(6.0f), 0);
        this.j0.addView(textView3, w7.b6.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        pl plVar2 = new pl(this, context, p6Var, null == true ? 1 : 0);
        this.r = plVar2;
        plVar2.setVerticalScrollBarEnabled(true);
        bm bmVar2 = new bm(this, context, false);
        this.w = bmVar2;
        plVar2.setAdapter(bmVar2);
        for (int i19 = 0; i19 < 8; i19++) {
            bmVar2.h.add(bmVar2.L());
        }
        plVar2.setClipToPadding(false);
        plVar2.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
        plVar2.setItemAnimator(null);
        plVar2.setLayoutAnimation(null);
        plVar2.setOverScrollMode(2);
        plVar2.setVisibility(4);
        plVar2.setAlpha(0.0f);
        p2Var.addView(plVar2, w7.b6.c(80.0f, -1));
        dh.f fVar = new dh.f(null == true ? 1 : 0, null == true ? 1 : 0, 6);
        this.s = fVar;
        plVar2.setLayoutManager(fVar);
        plVar2.setOnItemClickListener(new c7(i13));
    }

    public static org.telegram.ui.Cells.v5 N(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        pl plVar = chatAttachAlertPhotoLayout.E;
        int childCount = plVar.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = plVar.getChildAt(i11);
            if (childAt.getTop() < plVar.getMeasuredHeight() - chatAttachAlertPhotoLayout.b.Y0() && (childAt instanceof org.telegram.ui.Cells.v5)) {
                org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) childAt;
                if (v5Var.getImageView().getTag() != null && ((Integer) v5Var.getImageView().getTag()).intValue() == i10) {
                    return v5Var;
                }
            }
        }
        return null;
    }

    public static int P(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        bi biVar = chatAttachAlertPhotoLayout.b;
        org.telegram.ui.ActionBar.k2 k2Var = biVar.W1;
        return ((k2Var instanceof org.telegram.ui.un) && ((org.telegram.ui.un) k2Var).f4 == 5) ? ((org.telegram.messenger.l0) k2Var.getMessagesController().y7.d0.a).c - ((org.telegram.ui.un) biVar.W1).K6.size() : ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    public static boolean T() {
        HashMap hashMap = s1;
        if (hashMap.isEmpty()) {
            return false;
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (entry.getValue() instanceof org.telegram.messenger.ef) {
                org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) entry.getValue();
                if (efVar.d() && efVar.i()) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean U() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = t1;
            if (i10 >= arrayList.size()) {
                break;
            }
            Object obj = s1.get(arrayList.get(i10));
            if (!TextUtils.isEmpty(obj instanceof org.telegram.messenger.ef ? ((org.telegram.messenger.ef) obj).a : obj instanceof org.telegram.messenger.hf ? ((org.telegram.messenger.hf) obj).I : null)) {
                i11++;
            }
            i10++;
        }
        return i11 <= 1;
    }

    public static boolean d0() {
        HashMap hashMap = s1;
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
        return org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.L(7.0f) + this.p1;
    }

    public static void p0(ImageView imageView, String str) {
        str.getClass();
        switch (str) {
            case "on":
                imageView.setImageResource(R.drawable.flash_on);
                imageView.setContentDescription(org.telegram.messenger.cd.L0(2131754913, null));
                break;
            case "off":
                imageView.setImageResource(R.drawable.flash_off);
                imageView.setContentDescription(org.telegram.messenger.cd.L0(2131754914, null));
                break;
            case "auto":
                imageView.setImageResource(R.drawable.flash_auto);
                imageView.setContentDescription(org.telegram.messenger.cd.L0(2131754915, null));
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

    @Override // org.telegram.ui.Components.uh
    public final void A() {
        ShutterButton shutterButton = this.k0;
        if (shutterButton == null) {
            return;
        }
        boolean z10 = this.Q0;
        fu0 fu0Var = fu0.a;
        fu0 fu0Var2 = fu0.b;
        if (z10) {
            if (this.P != null && shutterButton.getState() == fu0Var2) {
                shutterButton.a(fu0Var);
            }
            this.Q0 = false;
            return;
        }
        if (this.P != null && shutterButton.getState() == fu0Var2) {
            m0();
            CameraController.getInstance().stopVideoRecording(this.P.getCameraSession(), false);
            shutterButton.a(fu0Var);
        }
        if (this.b0) {
            b0(false);
        }
        e0(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00db  */
    @Override // org.telegram.ui.Components.uh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i10, int i11) {
        int D;
        int i12;
        int L;
        this.R0 = true;
        int i13 = this.M0;
        if (org.telegram.messenger.i0.Q1()) {
            this.M0 = 4;
        } else {
            Point point = org.telegram.messenger.i0.q;
            if (point.x > point.y) {
                this.M0 = 4;
            } else {
                this.M0 = 3;
            }
        }
        this.p1 = org.telegram.messenger.i0.L(48.0f) + org.telegram.messenger.i0.n;
        pl plVar = this.E;
        ((FrameLayout.LayoutParams) plVar.getLayoutParams()).topMargin = -this.p1;
        int L2 = (i10 - org.telegram.messenger.i0.L(4.0f)) - org.telegram.messenger.i0.L(4.0f);
        int i14 = this.M0;
        int i15 = L2 / i14;
        this.K0 = i15;
        if (this.L0 != i15 || i13 != i14) {
            this.L0 = i15;
            org.telegram.messenger.i0.g3(new hl(this, 4));
        }
        this.F.y1(Math.max(1, ((this.M0 - 1) * org.telegram.messenger.i0.L(2.0f)) + (this.K0 * this.M0)));
        bm bmVar = this.G;
        int ceil = (int) Math.ceil((bmVar.b() - 1) / this.M0);
        if (this.P0) {
            D = org.telegram.messenger.i0.L(400.0f);
        } else {
            D = org.telegram.messenger.m5.D(2.0f, ceil - 1, this.K0 * ceil);
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        int b10 = org.telegram.messenger.m5.b(6.0f, (((i11 - D) - currentActionBarHeight) - org.telegram.messenger.i0.n) - org.telegram.messenger.i0.L(12.0f), 0);
        if (this.J != b10) {
            this.J = b10;
            bmVar.f();
        }
        if (!org.telegram.messenger.i0.Q1()) {
            Point point2 = org.telegram.messenger.i0.q;
            if (point2.x > point2.y) {
                i12 = (int) (i11 / 3.5f);
                L = ((i12 + currentActionBarHeight) - org.telegram.messenger.i0.L(52.0f)) + this.p1;
                if (L < 0) {
                    L = 0;
                }
                if (plVar.getPaddingTop() == L || plVar.getPaddingBottom() != this.e) {
                    plVar.setPadding(org.telegram.messenger.i0.L(2.0f), L, org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(48.0f) + this.e);
                }
                this.y.setTextSize(17.0f);
                this.R0 = false;
            }
        }
        i12 = (i11 / 5) * 2;
        L = ((i12 + currentActionBarHeight) - org.telegram.messenger.i0.L(52.0f)) + this.p1;
        if (L < 0) {
        }
        if (plVar.getPaddingTop() == L) {
        }
        plVar.setPadding(org.telegram.messenger.i0.L(2.0f), L, org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(48.0f) + this.e);
        this.y.setTextSize(17.0f);
        this.R0 = false;
    }

    @Override // org.telegram.ui.Components.uh
    public final void C() {
        bi biVar = this.b;
        if (!biVar.isShowing() || biVar.I || PhotoViewer.v1().U1()) {
            return;
        }
        V(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b7, code lost:
    
        if (((org.telegram.ui.un) r2).z() == false) goto L46;
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
    @Override // org.telegram.ui.Components.uh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        long j10;
        boolean z13;
        boolean z14;
        boolean z15;
        org.telegram.ui.ActionBar.k2 k2Var;
        TLRPC.ChatFull chatFull;
        boolean z16;
        bi biVar = this.b;
        if (i10 > 1) {
            org.telegram.messenger.jj jjVar = biVar.B3;
            org.telegram.ui.ActionBar.t0 t0Var = biVar.U2;
            if (jjVar == null) {
                if (getStarsPrice() <= 0) {
                    t0Var.S(0);
                    z10 = true;
                } else {
                    t0Var.t(0);
                    z10 = false;
                }
                if (!this.z0 || getStarsPrice() > 0) {
                    t0Var.t(1);
                    z11 = false;
                    if (i10 != 0) {
                        biVar.U2.t(4);
                    }
                    org.telegram.ui.ActionBar.b1 b1Var = this.Z0;
                    if (i10 <= 1) {
                        biVar.U2.S(5);
                        biVar.U2.S(7);
                        b1Var.setText(org.telegram.messenger.cd.L0(2131745652, null));
                    } else {
                        biVar.U2.t(5);
                        biVar.U2.t(7);
                        if (i10 != 0) {
                            b1Var.setText(org.telegram.messenger.cd.L0(2131745653, null));
                        }
                    }
                    if (i10 > 0 && getStarsPrice() <= 0) {
                        if (biVar != null) {
                            org.telegram.ui.ActionBar.k2 k2Var2 = biVar.W1;
                            if (k2Var2 instanceof org.telegram.ui.un) {
                            }
                        }
                        z12 = true;
                        if (i10 > 0 || biVar == null) {
                            j10 = 0;
                            z13 = z10;
                        } else {
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = biVar.a2;
                            if (chatAttachAlertPhotoLayout == null) {
                                j10 = 0;
                                z16 = false;
                                z13 = z10;
                            } else {
                                HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
                                ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                                if (!selectedPhotos.isEmpty()) {
                                    long j11 = 0;
                                    int i11 = 0;
                                    z16 = false;
                                    loop0: while (true) {
                                        j10 = j11;
                                        z13 = z10;
                                        if (i11 >= Math.ceil(selectedPhotos.size() / 10.0f)) {
                                            break;
                                        }
                                        int i12 = i11 * 10;
                                        int min = Math.min(10, selectedPhotos.size() - i12);
                                        Utilities.b.nextLong();
                                        for (int i13 = 0; i13 < min; i13++) {
                                            int i14 = i12 + i13;
                                            if (i14 < selectedPhotosOrder.size()) {
                                                CharSequence charSequence = ((org.telegram.messenger.ef) selectedPhotos.get(selectedPhotosOrder.get(i14))).a;
                                                String charSequence2 = charSequence == null ? "" : charSequence.toString();
                                                if (biVar.Z0() != null && TextUtils.isEmpty(charSequence2) && i13 == 0) {
                                                    charSequence2 = biVar.Z0().getText().toString();
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
                                        i11++;
                                        j11 = j10;
                                        z10 = z13;
                                    }
                                } else {
                                    j10 = 0;
                                    z13 = z10;
                                }
                                z16 = false;
                            }
                            if (z16 && (biVar.W1 instanceof org.telegram.ui.un)) {
                                z14 = true;
                                if (i10 > 0 && biVar != null) {
                                    k2Var = biVar.W1;
                                    if ((k2Var instanceof org.telegram.ui.un) && org.telegram.messenger.w3.V(((org.telegram.ui.un) k2Var).e) && (chatFull = ((org.telegram.ui.un) k2Var).p8) != null && chatFull.paid_media_allowed) {
                                        z15 = true;
                                        if (!z12) {
                                            String L0 = org.telegram.messenger.cd.L0(2131751155, null);
                                            org.telegram.ui.ActionBar.b1 b1Var2 = this.Y0;
                                            b1Var2.setText(L0);
                                            b1Var2.setAnimatedIcon(R.raw.photo_spoiler);
                                            biVar.U2.t(3);
                                        } else if (biVar != null) {
                                            biVar.U2.S(3);
                                        }
                                        if (biVar != null) {
                                            org.telegram.ui.ActionBar.t0 t0Var2 = biVar.U2;
                                            if (getSelectedPhotosCount() == i10) {
                                                int selectedPhotosHighQualityCount = getSelectedPhotosHighQualityCount();
                                                org.telegram.ui.ActionBar.b1 b1Var3 = this.a1;
                                                if (selectedPhotosHighQualityCount > 0) {
                                                    b1Var3.setText(org.telegram.messenger.cd.L0(2131745637, null));
                                                    b1Var3.setIcon(R.drawable.menu_quality_sd);
                                                } else {
                                                    b1Var3.setText(org.telegram.messenger.cd.L0(2131745638, null));
                                                    b1Var3.setIcon(R.drawable.menu_quality_hd);
                                                }
                                                t0Var2.S(2);
                                            } else {
                                                t0Var2.t(2);
                                            }
                                        }
                                        za0 za0Var = this.d1;
                                        if (z14) {
                                            za0Var.setVisibility(0);
                                        } else {
                                            za0Var.setVisibility(8);
                                        }
                                        if ((!z12 || z14) && (z11 || z13)) {
                                            biVar.U2.S(6);
                                        } else {
                                            biVar.U2.t(6);
                                        }
                                        if (!z15) {
                                            biVar.U2.t(9);
                                            return;
                                        }
                                        org.telegram.ui.ActionBar.b1 b1Var4 = this.b1;
                                        if (b1Var4 != null) {
                                            long starsPrice = getStarsPrice();
                                            if (starsPrice > j10) {
                                                b1Var4.setText(org.telegram.messenger.cd.L0(2131747744, null));
                                                b1Var4.setSubtext(org.telegram.messenger.cd.G((int) starsPrice, "Stars", new Object[0]));
                                            } else {
                                                b1Var4.setText(org.telegram.messenger.cd.L0(2131747746, null));
                                                b1Var4.setSubtext(null);
                                            }
                                        }
                                        this.E.M(new org.telegram.ui.fr(1));
                                        biVar.U2.S(9);
                                        return;
                                    }
                                }
                                z15 = false;
                                if (!z12) {
                                }
                                if (biVar != null) {
                                }
                                za0 za0Var2 = this.d1;
                                if (z14) {
                                }
                                if (z12) {
                                }
                                biVar.U2.S(6);
                                if (!z15) {
                                }
                            }
                        }
                        z14 = false;
                        if (i10 > 0) {
                            k2Var = biVar.W1;
                            if (k2Var instanceof org.telegram.ui.un) {
                                z15 = true;
                                if (!z12) {
                                }
                                if (biVar != null) {
                                }
                                za0 za0Var22 = this.d1;
                                if (z14) {
                                }
                                if (z12) {
                                }
                                biVar.U2.S(6);
                                if (!z15) {
                                }
                            }
                        }
                        z15 = false;
                        if (!z12) {
                        }
                        if (biVar != null) {
                        }
                        za0 za0Var222 = this.d1;
                        if (z14) {
                        }
                        if (z12) {
                        }
                        biVar.U2.S(6);
                        if (!z15) {
                        }
                    }
                    z12 = false;
                    if (i10 > 0) {
                    }
                    j10 = 0;
                    z13 = z10;
                    z14 = false;
                    if (i10 > 0) {
                    }
                    z15 = false;
                    if (!z12) {
                    }
                    if (biVar != null) {
                    }
                    za0 za0Var2222 = this.d1;
                    if (z14) {
                    }
                    if (z12) {
                    }
                    biVar.U2.S(6);
                    if (!z15) {
                    }
                } else {
                    t0Var.S(1);
                    z11 = true;
                    if (i10 != 0) {
                    }
                    org.telegram.ui.ActionBar.b1 b1Var5 = this.Z0;
                    if (i10 <= 1) {
                    }
                    if (i10 > 0) {
                        if (biVar != null) {
                        }
                        z12 = true;
                        if (i10 > 0) {
                        }
                        j10 = 0;
                        z13 = z10;
                        z14 = false;
                        if (i10 > 0) {
                        }
                        z15 = false;
                        if (!z12) {
                        }
                        if (biVar != null) {
                        }
                        za0 za0Var22222 = this.d1;
                        if (z14) {
                        }
                        if (z12) {
                        }
                        biVar.U2.S(6);
                        if (!z15) {
                        }
                    }
                    z12 = false;
                    if (i10 > 0) {
                    }
                    j10 = 0;
                    z13 = z10;
                    z14 = false;
                    if (i10 > 0) {
                    }
                    z15 = false;
                    if (!z12) {
                    }
                    if (biVar != null) {
                    }
                    za0 za0Var222222 = this.d1;
                    if (z14) {
                    }
                    if (z12) {
                    }
                    biVar.U2.S(6);
                    if (!z15) {
                    }
                }
            }
        }
        org.telegram.ui.ActionBar.t0 t0Var3 = biVar.U2;
        org.telegram.ui.ActionBar.t0 t0Var4 = biVar.U2;
        t0Var3.t(0);
        if (i10 == 0) {
            t0Var4.S(4);
            t0Var4.t(1);
        } else if (this.z0 && getStarsPrice() <= 0 && biVar.B3 == null) {
            t0Var4.S(1);
            z10 = false;
            z11 = true;
            if (i10 != 0) {
            }
            org.telegram.ui.ActionBar.b1 b1Var52 = this.Z0;
            if (i10 <= 1) {
            }
            if (i10 > 0) {
            }
            z12 = false;
            if (i10 > 0) {
            }
            j10 = 0;
            z13 = z10;
            z14 = false;
            if (i10 > 0) {
            }
            z15 = false;
            if (!z12) {
            }
            if (biVar != null) {
            }
            za0 za0Var2222222 = this.d1;
            if (z14) {
            }
            if (z12) {
            }
            biVar.U2.S(6);
            if (!z15) {
            }
        } else {
            t0Var4.t(1);
        }
        z10 = false;
        z11 = false;
        if (i10 != 0) {
        }
        org.telegram.ui.ActionBar.b1 b1Var522 = this.Z0;
        if (i10 <= 1) {
        }
        if (i10 > 0) {
        }
        z12 = false;
        if (i10 > 0) {
        }
        j10 = 0;
        z13 = z10;
        z14 = false;
        if (i10 > 0) {
        }
        z15 = false;
        if (!z12) {
        }
        if (biVar != null) {
        }
        za0 za0Var22222222 = this.d1;
        if (z14) {
        }
        if (z12) {
        }
        biVar.U2.S(6);
        if (!z15) {
        }
    }

    @Override // org.telegram.ui.Components.uh
    public final boolean F(int i10) {
        if (!this.b0) {
            return false;
        }
        if (i10 != 24 && i10 != 25 && i10 != 79 && i10 != 85) {
            return false;
        }
        ((nl) this.k0.getDelegate()).a();
        return true;
    }

    @Override // org.telegram.ui.Components.uh
    public final void G(uh uhVar) {
        ViewPropertyAnimator viewPropertyAnimator = this.o1;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.x.setVisibility(0);
        boolean z10 = uhVar instanceof jm;
        TextView textView = this.y;
        if (z10) {
            ViewPropertyAnimator interpolator = textView.animate().alpha(1.0f).setDuration(150L).setInterpolator(gr.j);
            this.o1 = interpolator;
            interpolator.start();
        } else {
            a0();
            textView.setAlpha(1.0f);
        }
        this.b.R2.setTitle("");
        this.F.h1(0, 0);
        if (z10) {
            this.E.post(new cd(18, this, uhVar));
        }
        W();
        n0();
    }

    @Override // org.telegram.ui.Components.uh
    public final void H() {
        this.N = false;
        yl ylVar = this.P;
        if (ylVar != null) {
            ylVar.setVisibility(0);
        }
        if (this.u0) {
            this.u0 = false;
            V(true);
        }
    }

    @Override // org.telegram.ui.Components.uh
    public final void I() {
        this.E.y0(0);
    }

    public final int R(org.telegram.messenger.ef efVar, int i10) {
        Integer valueOf = Integer.valueOf(efVar.C);
        HashMap hashMap = s1;
        boolean containsKey = hashMap.containsKey(valueOf);
        ArrayList arrayList = t1;
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
            z0(false);
            x0();
            if (i10 >= 0) {
                efVar.e();
                this.h1.X(i10);
            }
            return indexOf;
        }
        efVar.N = getStarsPrice();
        efVar.M = getStarsPrice() > 0;
        efVar.R = false;
        if (d0()) {
            efVar.O = Boolean.valueOf(!T());
        }
        efVar.z = Boolean.valueOf(efVar.c());
        boolean X = X(true);
        hashMap.put(valueOf, efVar);
        arrayList.add(valueOf);
        if (X) {
            y0();
            return -1;
        }
        z0(true);
        return -1;
    }

    public final void S() {
        yl ylVar = this.P;
        if (ylVar != null) {
            if (!this.b0) {
                ylVar.setTranslationX(this.U[0]);
            }
            int i10 = this.K0;
            int L = org.telegram.messenger.i0.L(2.0f) + (i10 * 2);
            if (this.b0) {
                return;
            }
            this.P.setClipTop((int) this.W);
            this.P.setClipBottom((int) this.a0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.P.getLayoutParams();
            if (layoutParams.height == L && layoutParams.width == i10) {
                return;
            }
            layoutParams.width = i10;
            layoutParams.height = L;
            this.P.setLayoutParams(layoutParams);
            org.telegram.messenger.i0.g3(new cd(19, this, layoutParams));
        }
    }

    public final void V(boolean z10) {
        bm bmVar;
        bi biVar = this.b;
        boolean z11 = biVar.M1;
        org.telegram.ui.ActionBar.k2 k2Var = biVar.W1;
        if (z11 || !this.n) {
            return;
        }
        boolean z12 = this.N0;
        boolean z13 = this.O0;
        org.telegram.ui.ActionBar.k2 Q = k2Var == null ? LaunchActivity.Q() : k2Var;
        if (Q == null || Q.getParentActivity() == null) {
            return;
        }
        if (org.telegram.messenger.tz.y0) {
            boolean z14 = Q.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0;
            this.O0 = z14;
            if (z14) {
                if (z10) {
                    try {
                        k2Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE"}, 17);
                    } catch (Exception unused) {
                    }
                }
                this.N0 = false;
            } else {
                if (z10 || org.telegram.messenger.tz.P0) {
                    CameraController.getInstance().initCamera(null);
                }
                this.N0 = CameraController.getInstance().isCameraInitied();
            }
        } else {
            this.N0 = false;
        }
        if ((z12 != this.N0 || z13 != this.O0) && (bmVar = this.G) != null) {
            bmVar.f();
        }
        if (biVar.M1 || !biVar.isShowing() || !this.N0 || ((Paint) biVar.Y.b).getAlpha() == 0 || this.b0) {
            return;
        }
        t0();
    }

    public final void W() {
        s4.c1 K;
        float[] fArr;
        if (PhotoViewer.F1() && PhotoViewer.v1().p5 != null && PhotoViewer.v1().p5.V) {
            return;
        }
        yl ylVar = this.P;
        if (ylVar != null) {
            ylVar.invalidateOutline();
        }
        int i10 = this.M0 - 1;
        pl plVar = this.E;
        s4.c1 K2 = plVar.K(i10);
        if (K2 != null) {
            K2.a.invalidateOutline();
        }
        if ((!this.G.d || !this.N0 || this.T0 != this.U0) && (K = plVar.K(0)) != null) {
            K.a.invalidateOutline();
        }
        yl ylVar2 = this.P;
        if (ylVar2 != null) {
            ylVar2.invalidate();
        }
        wl wlVar = this.R;
        if (wlVar != null) {
            ((ViewGroup.MarginLayoutParams) wlVar.getLayoutParams()).topMargin = getRootWindowInsets() == null ? org.telegram.messenger.i0.L(16.0f) : getRootWindowInsets().getSystemWindowInsetTop() + org.telegram.messenger.i0.L(2.0f);
        }
        if (this.N0) {
            int childCount = plVar.getChildCount();
            int i11 = 0;
            while (true) {
                fArr = this.U;
                if (i11 >= childCount) {
                    break;
                }
                View childAt = plVar.getChildAt(i11);
                if (!(childAt instanceof org.telegram.ui.Cells.p5)) {
                    i11++;
                } else if (childAt.isAttachedToWindow()) {
                    float y3 = getY() + plVar.getY() + childAt.getY();
                    bi biVar = this.b;
                    ViewGroup viewGroup = biVar.b;
                    bh bhVar = biVar.s3;
                    fg.i iVar = biVar.I2;
                    float y10 = viewGroup.getY() + y3;
                    float x10 = (biVar.b.getX() + (getX() + (plVar.getX() + childAt.getX()))) - getRootWindowInsets().getSystemWindowInsetLeft();
                    float alpha = (iVar.getAlpha() * iVar.getMeasuredHeight()) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + (!biVar.X1 ? org.telegram.messenger.i0.m : 0);
                    oh ohVar = biVar.y4;
                    if (ohVar != null && ohVar.g()) {
                        alpha = Math.max(alpha, (biVar.y4.e() + biVar.y4.getY()) - biVar.f4);
                    }
                    float f7 = y3 < alpha ? alpha - y3 : 0.0f;
                    if (f7 != this.W) {
                        this.W = f7;
                        yl ylVar3 = this.P;
                        if (ylVar3 != null) {
                            ylVar3.invalidateOutline();
                            this.P.invalidate();
                        }
                    }
                    float translationY = (int) (bhVar.getTranslationY() + (biVar.b.getMeasuredHeight() - bhVar.getMeasuredHeight()));
                    oh ohVar2 = biVar.y4;
                    if (ohVar2 != null) {
                        translationY -= ohVar2.d() - org.telegram.messenger.i0.L(6.0f);
                    }
                    if (childAt.getMeasuredHeight() + y3 > translationY) {
                        this.a0 = Math.min(-org.telegram.messenger.i0.L(5.0f), y3 - translationY) + childAt.getMeasuredHeight();
                    } else {
                        this.a0 = 0.0f;
                    }
                    fArr[0] = x10;
                    fArr[1] = y10;
                    S();
                    return;
                }
            }
            if (this.W != 0.0f) {
                this.W = 0.0f;
                yl ylVar4 = this.P;
                if (ylVar4 != null) {
                    ylVar4.invalidateOutline();
                    this.P.invalidate();
                }
            }
            fArr[0] = org.telegram.messenger.i0.L(-400.0f);
            fArr[1] = 0.0f;
            S();
        }
    }

    public final boolean X(boolean z10) {
        if (getStarsPrice() <= 0) {
            return false;
        }
        boolean z11 = false;
        while (true) {
            HashMap hashMap = s1;
            if (hashMap.size() <= 10 - (z10 ? 1 : 0)) {
                break;
            }
            ArrayList arrayList = t1;
            if (arrayList.isEmpty()) {
                break;
            }
            Object obj = hashMap.get(arrayList.get(0));
            if (!(obj instanceof org.telegram.messenger.ef)) {
                break;
            }
            R((org.telegram.messenger.ef) obj, -1);
            z11 = true;
        }
        return z11;
    }

    public final boolean Y(org.telegram.messenger.ef efVar) {
        boolean z10 = this.w0;
        org.telegram.ui.ActionBar.p6 p6Var = this.a;
        bi biVar = this.b;
        if (z10 || !efVar.b) {
            if (this.x0 || efVar.b) {
                return false;
            }
            if (!biVar.N0()) {
                org.telegram.messenger.m5.o(null, 2131749551, new cc(biVar.l3, p6Var), null);
                return true;
            }
        } else if (!biVar.N0()) {
            org.telegram.messenger.m5.o(null, 2131749547, new cc(biVar.l3, p6Var), null);
            return true;
        }
        return true;
    }

    public final void Z() {
        if (this.P0) {
            boolean f02 = f0();
            this.P0 = f02;
            if (!f02) {
                g0();
            }
            this.G.f();
            this.w.f();
        }
    }

    @Override // org.telegram.ui.Components.uh
    public final void a(CharSequence charSequence) {
        Object obj;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = t1;
            if (i10 >= arrayList.size()) {
                return;
            }
            if (i10 == 0) {
                Object obj2 = arrayList.get(i10);
                HashMap hashMap = s1;
                Object obj3 = hashMap.get(obj2);
                if (obj3 instanceof org.telegram.messenger.ef) {
                    org.telegram.messenger.ef clone = ((org.telegram.messenger.ef) obj3).clone();
                    CharSequence[] charSequenceArr = {charSequence};
                    clone.n = org.telegram.messenger.ui.b0(org.telegram.messenger.d20.s0).W(charSequenceArr, false, true);
                    clone.a = charSequenceArr[0];
                    obj = clone;
                } else {
                    boolean z10 = obj3 instanceof org.telegram.messenger.hf;
                    obj = obj3;
                    if (z10) {
                        org.telegram.messenger.hf clone2 = ((org.telegram.messenger.hf) obj3).clone();
                        CharSequence[] charSequenceArr2 = {charSequence};
                        clone2.n = org.telegram.messenger.ui.b0(org.telegram.messenger.d20.s0).W(charSequenceArr2, false, true);
                        clone2.I = charSequenceArr2[0];
                        obj = clone2;
                    }
                }
                hashMap.put(obj2, obj);
            }
            i10++;
        }
    }

    public final void a0() {
        String L0 = org.telegram.messenger.cd.L0(2131751155, null);
        org.telegram.ui.ActionBar.b1 b1Var = this.Y0;
        b1Var.setText(L0);
        b1Var.setAnimatedIcon(R.raw.photo_spoiler);
        this.b.U2.S(1);
        HashMap hashMap = s1;
        if (!hashMap.isEmpty()) {
            Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                ((org.telegram.messenger.ef) ((Map.Entry) it.next()).getValue()).e();
            }
            hashMap.clear();
            t1.clear();
        }
        ArrayList arrayList = r1;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) arrayList.get(i10);
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
        this.G.f();
        this.w.f();
    }

    @Override // org.telegram.ui.Components.uh
    public final boolean b() {
        return !this.b0;
    }

    public final void b0(boolean z10) {
        yl ylVar;
        if (this.s0 || this.P == null) {
            return;
        }
        int i10 = this.K0;
        int[] iArr = this.f0;
        iArr[1] = i10;
        iArr[2] = org.telegram.messenger.i0.L(2.0f) + (i10 * 2);
        Runnable runnable = this.n0;
        if (runnable != null) {
            org.telegram.messenger.i0.r(runnable);
            this.n0 = null;
        }
        org.telegram.messenger.i0.m3(this.b, ((double) org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.a7, this.a))) > 0.721d);
        TextView textView = this.p0;
        pl plVar = this.r;
        jg.l0 l0Var = this.j0;
        pl plVar2 = this.E;
        ImageView[] imageViewArr = this.S;
        s81 s81Var = this.l0;
        if (z10) {
            this.j1 = this.P.getTranslationY();
            this.d0 = true;
            if (plVar2 != null) {
                plVar2.invalidate();
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this, "cameraOpenProgress", 0.0f));
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(l0Var, (Property<jg.l0, Float>) property, 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(s81Var, (Property<s81, Float>) property, 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(plVar, (Property<pl, Float>) property, 0.0f));
            int i11 = 0;
            while (true) {
                if (i11 >= 2) {
                    break;
                }
                if (imageViewArr[i11].getVisibility() == 0) {
                    arrayList.add(ObjectAnimator.ofFloat(imageViewArr[i11], (Property<ImageView, Float>) property, 0.0f));
                    break;
                }
                i11++;
            }
            this.f1.d();
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(220L);
            animatorSet.setInterpolator(gr.f);
            animatorSet.addListener(new ol(this, 3));
            animatorSet.start();
        } else {
            this.i1 = false;
            setAlertKeepScreenOn(false);
            setCameraOpenProgress(0.0f);
            iArr[0] = 0;
            setCameraOpenProgress(0.0f);
            l0Var.setAlpha(0.0f);
            l0Var.setVisibility(8);
            s81Var.setAlpha(0.0f);
            s81Var.setTag(null);
            s81Var.setVisibility(8);
            plVar.setAlpha(0.0f);
            textView.setAlpha(0.0f);
            plVar.setVisibility(8);
            int i12 = 0;
            while (true) {
                if (i12 >= 2) {
                    break;
                }
                if (imageViewArr[i12].getVisibility() == 0) {
                    imageViewArr[i12].setAlpha(0.0f);
                    break;
                }
                i12++;
            }
            this.b0 = false;
            yl ylVar2 = this.P;
            if (ylVar2 != null) {
                ylVar2.setFpsLimit(30);
                this.P.setSystemUiVisibility(1024);
            }
            if (plVar2 != null) {
                plVar2.invalidate();
            }
        }
        yl ylVar3 = this.P;
        if (ylVar3 != null) {
            ylVar3.setImportantForAccessibility(0);
        }
        plVar2.setImportantForAccessibility(0);
        if (org.telegram.messenger.sc.e(360928) || (ylVar = this.P) == null) {
            return;
        }
        ylVar.showTexture(false, z10);
    }

    @Override // org.telegram.ui.Components.uh
    public final boolean c() {
        Iterator it = s1.entrySet().iterator();
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

    public final org.telegram.messenger.ef c0(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = r1;
        int size = arrayList.size();
        if (i10 < size) {
            return (org.telegram.messenger.ef) arrayList.get(i10);
        }
        int i11 = i10 - size;
        org.telegram.messenger.we weVar = this.T0;
        if (weVar == null || i11 >= weVar.e.size()) {
            return null;
        }
        return (org.telegram.messenger.ef) this.T0.e.get(i11);
    }

    @Override // org.telegram.ui.Components.uh
    public final void d() {
        boolean z10 = this.e1;
        int i10 = z10 ? org.telegram.ui.ActionBar.t6.Vg : org.telegram.ui.ActionBar.t6.j5;
        int i11 = org.telegram.ui.ActionBar.t6.c7;
        org.telegram.ui.ActionBar.p6 p6Var = this.a;
        this.H.setTextColor(org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
        int i12 = org.telegram.ui.ActionBar.t6.A5;
        pl plVar = this.E;
        org.telegram.ui.ActionBar.a7.I(plVar, i12, p6Var);
        plVar.K(0);
        org.telegram.ui.ActionBar.a7.V(this.y, i10, p6Var);
        int w02 = org.telegram.ui.ActionBar.t6.w0(z10 ? org.telegram.ui.ActionBar.t6.Vg : org.telegram.ui.ActionBar.t6.E8, p6Var);
        tl tlVar = this.x;
        tlVar.O(w02, false);
        tlVar.O(org.telegram.ui.ActionBar.t6.w0(z10 ? org.telegram.ui.ActionBar.t6.Vg : org.telegram.ui.ActionBar.t6.E8, p6Var), true);
        tlVar.H(org.telegram.ui.ActionBar.t6.w0(z10 ? org.telegram.ui.ActionBar.t6.Xg : org.telegram.ui.ActionBar.t6.G8, p6Var));
        org.telegram.ui.ActionBar.t6.C1(org.telegram.ui.ActionBar.t6.w0(i10, p6Var), this.D);
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        bi biVar;
        if (i10 != org.telegram.messenger.zs.r2) {
            if (i10 == org.telegram.messenger.zs.l4) {
                V(false);
                return;
            }
            return;
        }
        bm bmVar = this.G;
        if (bmVar != null) {
            if (r0()) {
                this.U0 = MediaController.Y1;
            } else {
                this.U0 = MediaController.Z1;
            }
            if (this.T0 == null || ((biVar = this.b) != null && biVar.x1)) {
                this.T0 = this.U0;
            } else if (r0()) {
                int i12 = 0;
                while (true) {
                    if (i12 >= MediaController.a2.size()) {
                        break;
                    }
                    org.telegram.messenger.we weVar = (org.telegram.messenger.we) MediaController.a2.get(i12);
                    int i13 = weVar.a;
                    org.telegram.messenger.we weVar2 = this.T0;
                    if (i13 == weVar2.a && weVar.b == weVar2.b) {
                        this.T0 = weVar;
                        break;
                    }
                    i12++;
                }
            }
            this.X0 = false;
            this.H.c();
            bmVar.f();
            this.w.f();
            ArrayList arrayList = t1;
            if (!arrayList.isEmpty() && this.U0 != null) {
                int size = arrayList.size();
                for (int i14 = 0; i14 < size; i14++) {
                    Integer num = (Integer) arrayList.get(i14);
                    HashMap hashMap = s1;
                    Object obj = hashMap.get(num);
                    org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) this.U0.f.get(num.intValue());
                    if (efVar != null) {
                        if (obj instanceof org.telegram.messenger.ef) {
                            efVar.g((org.telegram.messenger.ef) obj);
                        }
                        hashMap.put(num, efVar);
                    }
                }
            }
            v0();
        }
    }

    public final void e0(boolean z10) {
        if (!this.N0 || this.P == null) {
            return;
        }
        o0();
        this.Q.i();
        this.P.destroy(z10, null);
        AnimatorSet animatorSet = this.O;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.O = null;
        }
        org.telegram.messenger.i0.h3(new hl(this, 0), 300L);
        this.c0 = false;
    }

    public final boolean f0() {
        Activity W = org.telegram.messenger.i0.W(getContext());
        if (W == null) {
            W = this.b.W1.getParentActivity();
        }
        int i10 = Build.VERSION.SDK_INT;
        if (W == null) {
            return true;
        }
        if (i10 < 33 || (W.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0 && W.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0)) {
            return i10 < 33 && W.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0;
        }
        return true;
    }

    public final void g0() {
        if ((r0() ? MediaController.Y1 : MediaController.Z1) == null) {
            MediaController.O(0);
        }
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

    @Override // org.telegram.ui.Components.uh
    public int getButtonsHideOffset() {
        return org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + super.getButtonsHideOffset();
    }

    public float getCameraOpenProgress() {
        return this.e0;
    }

    @Override // org.telegram.ui.Components.uh
    public int getCurrentItemTop() {
        pl plVar = this.E;
        int childCount = plVar.getChildCount();
        xy xyVar = this.H;
        if (childCount <= 0) {
            plVar.setTopGlowOffset(plVar.getPaddingTop());
            xyVar.setTranslationY(0.0f);
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = plVar.getChildAt(0);
        ck0 ck0Var = (ck0) plVar.G(childAt);
        int top = childAt.getTop() - this.p1;
        int L = org.telegram.messenger.i0.L(7.0f);
        if (top < org.telegram.messenger.i0.L(7.0f) || ck0Var == null || ck0Var.b() != 0) {
            top = L;
        }
        xyVar.setTranslationY(((((getMeasuredHeight() - top) - org.telegram.messenger.i0.L(50.0f)) - xyVar.getMeasuredHeight()) / 2.0f) + top);
        plVar.setTopGlowOffset(top);
        return top;
    }

    @Override // org.telegram.ui.Components.uh
    public int getFirstOffset() {
        return org.telegram.messenger.i0.L(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.uh
    public int getListTopPadding() {
        return this.E.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.uh
    public int getSelectedItemsCount() {
        return t1.size();
    }

    public HashMap<Object, Object> getSelectedPhotos() {
        return s1;
    }

    public int getSelectedPhotosCount() {
        int i10 = 0;
        for (Object obj : s1.values()) {
            if (obj instanceof org.telegram.messenger.ef) {
                org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) obj;
                if (!efVar.b && efVar.s == null) {
                    i10++;
                }
            }
        }
        return i10;
    }

    public int getSelectedPhotosHighQualityCount() {
        int i10 = 0;
        for (Object obj : s1.values()) {
            if (obj instanceof org.telegram.messenger.ef) {
                org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) obj;
                if (efVar.c() && !efVar.b && efVar.s == null) {
                    i10++;
                }
            }
        }
        return i10;
    }

    public ArrayList<Object> getSelectedPhotosOrder() {
        return t1;
    }

    public long getStarsPrice() {
        Iterator it = s1.entrySet().iterator();
        if (it.hasNext()) {
            return ((org.telegram.messenger.ef) ((Map.Entry) it.next()).getValue()).N;
        }
        return 0L;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:22|(1:24)|(1:29)|(6:31|(5:33|(1:35)|36|(1:38)|(1:40))|98|42|(1:97)|46)(1:99)|(1:96)(1:51)|52|(2:53|(2:54|55))|(4:57|58|(2:60|61)|63)|64|65|66|67|68|69) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ce, code lost:
    
        if (sc.e.x(r13) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0163, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0164, code lost:
    
        org.telegram.messenger.f8.g(r0, true);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x0120 -> B:62:0x0131). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h0(int i10, Intent intent, String str) {
        String str2;
        String str3;
        Throwable th2;
        MediaMetadataRetriever mediaMetadataRetriever;
        MediaMetadataRetriever mediaMetadataRetriever2;
        int i11;
        int i12;
        bi biVar = this.b;
        boolean z10 = biVar.M1;
        org.telegram.ui.ActionBar.k2 k2Var = biVar.W1;
        if (z10) {
            return;
        }
        q1 = true;
        File file = null;
        MediaMetadataRetriever mediaMetadataRetriever3 = null;
        if (i10 == 0) {
            PhotoViewer.v1().N2(k2Var.getParentActivity(), null, this.a);
            PhotoViewer v12 = PhotoViewer.v1();
            int i13 = biVar.M3;
            boolean z11 = biVar.N3;
            v12.h = i13;
            v12.n = z11;
            Pair N0 = org.telegram.messenger.i0.N0(str);
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(new File(str).getAbsolutePath(), options);
                i11 = options.outWidth;
                try {
                    i12 = options.outHeight;
                } catch (Exception unused) {
                    i12 = 0;
                    int i14 = i11;
                    int i15 = u1;
                    u1 = i15 - 1;
                    org.telegram.messenger.ef efVar = new org.telegram.messenger.ef(i15, str, ((Integer) N0.first).intValue(), false, i14, i12);
                    efVar.k(N0);
                    efVar.L = true;
                    k0(efVar, false, true);
                    return;
                }
            } catch (Exception unused2) {
                i11 = 0;
            }
            int i142 = i11;
            int i152 = u1;
            u1 = i152 - 1;
            org.telegram.messenger.ef efVar2 = new org.telegram.messenger.ef(i152, str, ((Integer) N0.first).intValue(), false, i142, i12);
            efVar2.k(N0);
            efVar2.L = true;
            k0(efVar2, false, true);
            return;
        }
        if (i10 == 2) {
            if (org.telegram.messenger.v2.a) {
                org.telegram.messenger.f8.b("pic path " + str);
            }
            if (intent != null && str != null && sc.e.x(str)) {
                intent = null;
            }
            if (intent != null) {
                Uri data = intent.getData();
                if (data != null) {
                    if (org.telegram.messenger.v2.a) {
                        org.telegram.messenger.f8.b("video record uri " + data.toString());
                    }
                    str2 = org.telegram.messenger.i0.T0(data);
                    if (org.telegram.messenger.v2.a) {
                        org.telegram.messenger.f8.b("resolved path = " + str2);
                    }
                    if (str2 != null) {
                    }
                }
                str2 = str;
                if (!(k2Var instanceof org.telegram.ui.un) || !((org.telegram.ui.un) k2Var).z()) {
                    org.telegram.messenger.i0.e(str);
                }
                str3 = null;
            } else {
                str2 = null;
                str3 = str;
            }
            String str4 = (str2 == null && str3 != null && sc.e.x(str3)) ? str3 : str2;
            try {
                try {
                    try {
                        mediaMetadataRetriever2 = new MediaMetadataRetriever();
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                    }
                } catch (Exception e7) {
                    e = e7;
                }
            } catch (Throwable th3) {
                th2 = th3;
                mediaMetadataRetriever = file;
            }
            try {
                mediaMetadataRetriever2.setDataSource(str4);
                r13 = mediaMetadataRetriever2.extractMetadata(9) != null ? (int) Math.ceil(Long.parseLong(r0) / 1000.0f) : 0L;
                mediaMetadataRetriever2.release();
            } catch (Exception e10) {
                e = e10;
                mediaMetadataRetriever3 = mediaMetadataRetriever2;
                org.telegram.messenger.f8.g(e, true);
                if (mediaMetadataRetriever3 != null) {
                    mediaMetadataRetriever3.release();
                }
                Bitmap r10 = org.telegram.messenger.qz.r(1, str4);
                String str5 = "-2147483648_" + org.telegram.messenger.tz.p() + ".jpg";
                file = org.telegram.messenger.b8.z(4);
                File file2 = new File(file, str5);
                r10.compress(Bitmap.CompressFormat.JPEG, 55, new FileOutputStream(file2));
                org.telegram.messenger.tz.y();
                int i16 = u1;
                u1 = i16 - 1;
                org.telegram.messenger.ef efVar3 = new org.telegram.messenger.ef(i16, str4, 0, true, r10.getWidth(), r10.getHeight());
                efVar3.E = (int) r13;
                efVar3.c = file2.getAbsolutePath();
                k0(efVar3, false, true);
            } catch (Throwable th4) {
                th2 = th4;
                mediaMetadataRetriever = mediaMetadataRetriever2;
                if (mediaMetadataRetriever == 0) {
                    throw th2;
                }
                try {
                    mediaMetadataRetriever.release();
                    throw th2;
                } catch (Exception e11) {
                    org.telegram.messenger.f8.g(e11, true);
                    throw th2;
                }
            }
            Bitmap r102 = org.telegram.messenger.qz.r(1, str4);
            String str52 = "-2147483648_" + org.telegram.messenger.tz.p() + ".jpg";
            file = org.telegram.messenger.b8.z(4);
            File file22 = new File(file, str52);
            r102.compress(Bitmap.CompressFormat.JPEG, 55, new FileOutputStream(file22));
            org.telegram.messenger.tz.y();
            int i162 = u1;
            u1 = i162 - 1;
            org.telegram.messenger.ef efVar32 = new org.telegram.messenger.ef(i162, str4, 0, true, r102.getWidth(), r102.getHeight());
            efVar32.E = (int) r13;
            efVar32.c = file22.getAbsolutePath();
            k0(efVar32, false, true);
        }
    }

    @Override // org.telegram.ui.Components.uh
    public final int i() {
        return 1;
    }

    public final void i0(boolean z10) {
        yl ylVar;
        yl ylVar2 = this.P;
        if (ylVar2 == null || this.O != null) {
            return;
        }
        bi biVar = this.b;
        if (biVar.I) {
            return;
        }
        ylVar2.initTexture();
        boolean r02 = r0();
        TextView textView = this.q0;
        int i10 = 0;
        if (r02) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        boolean isEmpty = r1.isEmpty();
        pl plVar = this.r;
        TextView textView2 = this.p0;
        if (isEmpty) {
            textView2.setVisibility(4);
            plVar.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            plVar.setVisibility(0);
        }
        if (biVar.Z0().w && isFocusable()) {
            biVar.Z0().d();
        }
        s81 s81Var = this.l0;
        s81Var.setVisibility(0);
        s81Var.setAlpha(0.0f);
        jg.l0 l0Var = this.j0;
        l0Var.setVisibility(0);
        l0Var.setTag(null);
        int[] iArr = this.f0;
        iArr[0] = 0;
        int i11 = this.K0;
        iArr[1] = i11;
        int i12 = 2;
        iArr[2] = org.telegram.messenger.i0.L(2.0f) + (i11 * 2);
        this.j1 = 0.0f;
        this.i1 = true;
        yl ylVar3 = this.P;
        if (ylVar3 != null) {
            ylVar3.setFpsLimit(-1);
        }
        org.telegram.messenger.i0.v1(this);
        org.telegram.messenger.i0.m3(biVar, false);
        setAlertKeepScreenOn(true);
        pl plVar2 = this.E;
        ImageView[] imageViewArr = this.S;
        if (z10) {
            setCameraOpenProgress(0.0f);
            this.d0 = true;
            if (plVar2 != null) {
                plVar2.invalidate();
            }
            this.f1.d();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this, "cameraOpenProgress", 0.0f, 1.0f));
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(l0Var, (Property<jg.l0, Float>) property, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(plVar, (Property<pl, Float>) property, 1.0f));
            int i13 = 0;
            while (true) {
                if (i13 >= 2) {
                    break;
                }
                if (imageViewArr[i13].getVisibility() == 0) {
                    arrayList.add(ObjectAnimator.ofFloat(imageViewArr[i13], (Property<ImageView, Float>) property, 1.0f));
                    break;
                }
                i13++;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(350L);
            animatorSet.setInterpolator(gr.f);
            animatorSet.addListener(new ol(this, i12));
            animatorSet.start();
        } else {
            setCameraOpenProgress(1.0f);
            l0Var.setAlpha(1.0f);
            textView2.setAlpha(1.0f);
            plVar.setAlpha(1.0f);
            while (true) {
                if (i10 >= 2) {
                    break;
                }
                if (imageViewArr[i10].getVisibility() == 0) {
                    imageViewArr[i10].setAlpha(1.0f);
                    break;
                }
                i10++;
            }
            biVar.T3.j0();
            yl ylVar4 = this.P;
            if (ylVar4 != null) {
                ylVar4.setSystemUiVisibility(1028);
            }
        }
        this.b0 = true;
        yl ylVar5 = this.P;
        if (ylVar5 != null) {
            ylVar5.setImportantForAccessibility(2);
        }
        plVar2.setImportantForAccessibility(4);
        plVar2.invalidate();
        if (org.telegram.messenger.sc.e(360928) || (ylVar = this.P) == null || !ylVar.isInited()) {
            return;
        }
        this.P.showTexture(true, z10);
    }

    public final void j0() {
        if (org.telegram.messenger.tz.y0) {
            i0(true);
            return;
        }
        bi biVar = this.b;
        ai aiVar = biVar.T3;
        if (aiVar != null) {
            aiVar.H0(0, false, true, 0, 0, 0L, biVar.e1(), false, 0L);
        }
    }

    @Override // org.telegram.ui.Components.uh
    public final void k() {
        W();
        invalidate();
    }

    public final void k0(org.telegram.messenger.ef efVar, boolean z10, boolean z11) {
        int i10;
        org.telegram.ui.un unVar;
        org.telegram.ui.un unVar2;
        ArrayList<Object> arrayList;
        int i11;
        ArrayList arrayList2 = r1;
        bi biVar = this.b;
        if (efVar != null) {
            int i12 = efVar.C;
            arrayList2.add(efVar);
            s1.put(Integer.valueOf(i12), efVar);
            t1.add(Integer.valueOf(i12));
            biVar.J1(0);
            this.G.f();
            this.w.f();
        }
        if (efVar != null && !z11 && arrayList2.size() > 1) {
            z0(false);
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
        org.telegram.ui.ActionBar.k2 k2Var = biVar.W1;
        org.telegram.ui.ActionBar.k2 k2Var2 = biVar.W1;
        if (k2Var == null) {
            k2Var = LaunchActivity.Q();
        }
        if (k2Var == null) {
            return;
        }
        PhotoViewer.v1().N2(k2Var.getParentActivity(), null, this.a);
        PhotoViewer.v1().O2(biVar);
        PhotoViewer v12 = PhotoViewer.v1();
        int i13 = biVar.M3;
        boolean z12 = biVar.N3;
        v12.h = i13;
        v12.n = z12;
        if (biVar.w1 && biVar.x1) {
            unVar = (org.telegram.ui.un) k2Var2;
            i10 = 11;
        } else {
            if (biVar.K2 != 0) {
                i10 = 1;
            } else if (k2Var2 instanceof org.telegram.ui.un) {
                unVar = (org.telegram.ui.un) k2Var2;
                i10 = 2;
            } else {
                i10 = 5;
            }
            unVar = null;
        }
        boolean z13 = biVar.y1;
        if (z13) {
            i10 = 13;
            unVar2 = null;
        } else {
            unVar2 = unVar;
        }
        int i14 = i10;
        if (biVar.K2 != 0 || z13) {
            arrayList = new ArrayList<>();
            arrayList.add(efVar);
            i11 = 0;
        } else {
            arrayList = getAllPhotosArray();
            i11 = arrayList2.size() - 1;
        }
        ArrayList<Object> arrayList3 = arrayList;
        z30 z30Var = biVar.H1;
        if (z30Var != null && efVar != null) {
            z30Var.e = efVar.b;
        }
        PhotoViewer.v1().j2(arrayList3, i11, i14, false, new ql(this, z10), unVar2);
        PhotoViewer.v1().A2(biVar.H1);
        if (biVar.x1) {
            PhotoViewer.v1().Z0(null, null, false, biVar.A1);
            PhotoViewer.v1().p2();
        }
    }

    @Override // org.telegram.ui.Components.uh
    public final void l(float f7) {
        this.W0 = f7;
        W();
        yl ylVar = this.P;
        if (ylVar != null) {
            ylVar.invalidateOutline();
            this.P.invalidate();
        }
        invalidate();
    }

    public final void l0() {
        try {
            if (this.P != null) {
                CameraController.getInstance().stopPreview(this.P.getCameraSessionObject());
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void m0() {
        if (this.b.M1) {
            return;
        }
        for (int i10 = 0; i10 < 2; i10++) {
            this.S[i10].animate().alpha(1.0f).translationX(0.0f).setDuration(150L).setInterpolator(gr.f).start();
        }
        ViewPropertyAnimator duration = this.r0.animate().alpha(1.0f).translationX(0.0f).setDuration(150L);
        gr grVar = gr.f;
        duration.setInterpolator(grVar).start();
        this.q0.animate().alpha(1.0f).setDuration(150L).setInterpolator(grVar).start();
        org.telegram.messenger.i0.W3(this.R, false);
        org.telegram.messenger.i0.r(this.h0);
        this.h0 = null;
        org.telegram.messenger.i0.P3(org.telegram.messenger.i0.W(getContext()));
    }

    @Override // org.telegram.ui.Components.uh
    public final boolean n(MotionEvent motionEvent) {
        yl ylVar;
        if (!this.d0) {
            if (this.b0 && motionEvent != null) {
                boolean z10 = this.G0;
                s81 s81Var = this.l0;
                if ((!z10 && motionEvent.getActionMasked() == 0) || motionEvent.getActionMasked() == 5) {
                    Rect rect = this.E0;
                    s81Var.getHitRect(rect);
                    if (s81Var.getTag() == null || !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
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
                    pl plVar = this.r;
                    TextView textView = this.p0;
                    Property property = View.ALPHA;
                    ImageView[] imageViewArr = this.S;
                    jg.l0 l0Var = this.j0;
                    if (actionMasked == 2) {
                        if (this.C0 && motionEvent.getPointerCount() == 2 && !this.I0) {
                            float hypot = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                            if (this.D0) {
                                if (this.P != null) {
                                    float L = (hypot - this.A0) / org.telegram.messenger.i0.L(100.0f);
                                    this.A0 = hypot;
                                    float f7 = this.B0 + L;
                                    this.B0 = f7;
                                    if (f7 < 0.0f) {
                                        this.B0 = 0.0f;
                                    } else if (f7 > 1.0f) {
                                        this.B0 = 1.0f;
                                    }
                                    s81Var.b(false, this.B0);
                                    this.b.b.invalidate();
                                    this.P.setZoom(this.B0);
                                    u0(true);
                                    return true;
                                }
                            } else if (Math.abs(hypot - this.A0) >= org.telegram.messenger.i0.a1(false, 0.4f)) {
                                this.A0 = hypot;
                                this.D0 = true;
                                return true;
                            }
                        } else {
                            float y3 = motionEvent.getY();
                            float f10 = y3 - this.F0;
                            if (this.H0) {
                                if (Math.abs(f10) > org.telegram.messenger.i0.a1(false, 0.4f)) {
                                    this.H0 = false;
                                    this.I0 = true;
                                    return true;
                                }
                            } else if (this.I0 && (ylVar = this.P) != null) {
                                ylVar.setTranslationY(ylVar.getTranslationY() + f10);
                                this.F0 = y3;
                                s81Var.setTag(null);
                                Runnable runnable = this.n0;
                                if (runnable != null) {
                                    org.telegram.messenger.i0.r(runnable);
                                    this.n0 = null;
                                }
                                if (l0Var.getTag() == null) {
                                    l0Var.setTag(1);
                                    AnimatorSet animatorSet = new AnimatorSet();
                                    animatorSet.playTogether(ObjectAnimator.ofFloat(l0Var, (Property<jg.l0, Float>) property, 0.0f), ObjectAnimator.ofFloat(s81Var, (Property<s81, Float>) property, 0.0f), ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f), ObjectAnimator.ofFloat(imageViewArr[0], (Property<ImageView, Float>) property, 0.0f), ObjectAnimator.ofFloat(imageViewArr[1], (Property<ImageView, Float>) property, 0.0f), ObjectAnimator.ofFloat(plVar, (Property<pl, Float>) property, 0.0f));
                                    animatorSet.setDuration(220L);
                                    animatorSet.setInterpolator(gr.f);
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
                            yl ylVar2 = this.P;
                            if (ylVar2 != null) {
                                if (Math.abs(ylVar2.getTranslationY()) > this.P.getMeasuredHeight() / 6.0f) {
                                    b0(true);
                                    return true;
                                }
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.P, (Property<yl, Float>) View.TRANSLATION_Y, 0.0f), ObjectAnimator.ofFloat(l0Var, (Property<jg.l0, Float>) property, 1.0f), ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 1.0f), ObjectAnimator.ofFloat(imageViewArr[0], (Property<ImageView, Float>) property, 1.0f), ObjectAnimator.ofFloat(imageViewArr[1], (Property<ImageView, Float>) property, 1.0f), ObjectAnimator.ofFloat(plVar, (Property<pl, Float>) property, 1.0f));
                                animatorSet2.setDuration(250L);
                                animatorSet2.setInterpolator(this.i0);
                                animatorSet2.start();
                                l0Var.setTag(null);
                                return true;
                            }
                        } else {
                            yl ylVar3 = this.P;
                            if (ylVar3 != null && !this.D0) {
                                ylVar3.getLocationOnScreen(this.V);
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

    public final void n0() {
        try {
            V(false);
            if (this.P != null) {
                CameraController.getInstance().startPreview(this.P.getCameraSessionObject());
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.Components.uh
    public final void o() {
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.l4);
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.r2);
    }

    public final void o0() {
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
                        FileOutputStream fileOutputStream = new FileOutputStream(new File(org.telegram.messenger.w0.h(), "cthumb.jpg"));
                        createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                        createScaledBitmap.recycle();
                        fileOutputStream.close();
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        if (this.S0 != i14) {
            this.S0 = i14;
            bm bmVar = this.G;
            if (bmVar != null) {
                bmVar.f();
            }
        }
        super.onLayout(z10, i10, i11, i12, i13);
        W();
    }

    @Override // org.telegram.ui.Components.uh
    public final boolean p() {
        if (this.d0) {
            return true;
        }
        if (this.b0) {
            b0(true);
            return true;
        }
        e0(true);
        return false;
    }

    @Override // org.telegram.ui.Components.uh
    public final void q(int i10) {
        e0((i10 == 0 || i10 == 2) ? false : true);
    }

    public final void q0(int i10, final boolean z10) {
        PhotoViewer v12 = PhotoViewer.v1();
        if (i10 == -1) {
            i10 = v12.P4;
        }
        ArrayList arrayList = v12.g7;
        if (arrayList == null || arrayList.isEmpty() || i10 >= arrayList.size() || !(arrayList.get(i10) instanceof org.telegram.messenger.ef) || !((org.telegram.messenger.ef) arrayList.get(i10)).M) {
            return;
        }
        final org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) arrayList.get(i10);
        this.E.M(new q0.a() { // from class: org.telegram.ui.Components.il
            @Override // q0.a
            public final void accept(Object obj) {
                View view = (View) obj;
                boolean z11 = ChatAttachAlertPhotoLayout.q1;
                if (view instanceof org.telegram.ui.Cells.v5) {
                    org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) view;
                    if (v5Var.getPhotoEntry() == efVar) {
                        v5Var.c(z10, Float.valueOf(250.0f));
                        v5Var.f(ChatAttachAlertPhotoLayout.this.getStarsPrice(), ChatAttachAlertPhotoLayout.s1.size() > 1);
                    }
                }
            }
        });
    }

    public final boolean r0() {
        if (this.y0) {
            return true;
        }
        bi biVar = this.b;
        if (biVar.w1) {
            return false;
        }
        return (biVar.W1 instanceof org.telegram.ui.un) || biVar.N2 || biVar.K2 == 2;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.R0) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.uh
    public final void s() {
        yl ylVar = this.P;
        if (ylVar != null) {
            ylVar.setVisibility(8);
        }
        for (Map.Entry entry : s1.entrySet()) {
            if (entry.getValue() instanceof org.telegram.messenger.ef) {
                ((org.telegram.messenger.ef) entry.getValue()).getClass();
            }
        }
        this.G.f();
    }

    public final void s0(q8 q8Var, TLRPC.VideoSize videoSize, long j10) {
        bi biVar = this.b;
        o8 o8Var = new o8(biVar.L1, biVar.H1);
        z30 z30Var = biVar.H1;
        o8Var.Q = z30Var == null || z30Var.c != 2;
        biVar.W1.presentFragment(o8Var);
        if (q8Var != null) {
            o8Var.q0(q8Var);
        }
        if (videoSize != null) {
            o8Var.p0(videoSize);
        }
        if (j10 != 0) {
            o8Var.o0(j10);
        }
        o8Var.I = new f2(8, this, o8Var);
    }

    public void setCameraOpenProgress(float f7) {
        int i10;
        int i11;
        if (this.P == null) {
            return;
        }
        this.e0 = f7;
        int[] iArr = this.f0;
        float f10 = iArr[1];
        float f11 = iArr[2];
        int i12 = org.telegram.messenger.i0.q.x;
        bi biVar = this.b;
        float width = biVar.c.getWidth();
        float height = biVar.c.getHeight();
        float[] fArr = this.U;
        float f12 = fArr[0];
        float f13 = fArr[1];
        float f14 = this.j1;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.P.getLayoutParams();
        float textureHeight = this.P.getTextureHeight(f10, f11) / this.P.getTextureHeight(width, height);
        float f15 = f11 / height;
        float f16 = f10 / width;
        if (this.i1) {
            i10 = (int) width;
            i11 = (int) height;
            float f17 = 1.0f - f7;
            float f18 = (textureHeight * f17) + f7;
            this.P.getTextureView().setScaleX(f18);
            this.P.getTextureView().setScaleY(f18);
            float f19 = ((1.0f - ((f15 * f17) + f7)) * height) / 2.0f;
            float f20 = ((1.0f - ((f16 * f17) + f7)) * width) / 2.0f;
            float f21 = f12 * f17;
            this.P.setTranslationX(((0.0f * f7) + f21) - f20);
            float f22 = f13 * f17;
            this.P.setTranslationY(((f14 * f7) + f22) - f19);
            this.k1 = f22 - this.P.getTranslationY();
            this.l1 = (height * f7) + (((f13 + f11) * f17) - this.P.getTranslationY());
            this.n1 = f21 - this.P.getTranslationX();
            this.m1 = (width * f7) + (((f12 + f10) * f17) - this.P.getTranslationX());
        } else {
            i10 = (int) f10;
            i11 = (int) f11;
            this.P.getTextureView().setScaleX(1.0f);
            this.P.getTextureView().setScaleY(1.0f);
            this.k1 = 0.0f;
            this.l1 = height;
            this.n1 = 0.0f;
            this.m1 = width;
            this.P.setTranslationX(f12);
            this.P.setTranslationY(f13);
        }
        if (layoutParams.width != i10 || layoutParams.height != i11) {
            layoutParams.width = i10;
            layoutParams.height = i11;
            this.P.requestLayout();
        }
        this.P.invalidateOutline();
        this.P.invalidate();
    }

    public void setCheckCameraWhenShown(boolean z10) {
        this.u0 = z10;
    }

    public void setIncludeVideosInGallery(boolean z10) {
        this.y0 = z10;
    }

    public void setStarsPrice(long j10) {
        HashMap hashMap = s1;
        if (!hashMap.isEmpty()) {
            Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) ((Map.Entry) it.next()).getValue();
                efVar.N = j10;
                efVar.M = j10 > 0;
                efVar.R = false;
            }
        }
        D(getSelectedItemsCount());
        if (X(false)) {
            y0();
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        bi biVar = this.b;
        if (biVar.A0 == 1) {
            float f10 = (f7 / 40.0f) * (-0.1f);
            pl plVar = this.E;
            int childCount = plVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = plVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.v5) {
                    org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) childAt;
                    float f11 = 1.0f + f10;
                    v5Var.getCheckBox().setScaleX(f11);
                    v5Var.getCheckBox().setScaleY(f11);
                }
            }
        }
        super.setTranslationY(f7);
        biVar.b.invalidate();
        invalidate();
    }

    @Override // org.telegram.ui.Components.uh
    public final void t() {
        this.N = true;
        pl plVar = this.E;
        int childCount = plVar.getChildCount();
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            }
            if (plVar.getChildAt(i10) instanceof org.telegram.ui.Cells.p5) {
                o0();
                break;
            } else {
                this.Q.i();
                i10++;
            }
        }
        ViewPropertyAnimator viewPropertyAnimator = this.o1;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator withEndAction = this.y.animate().alpha(0.0f).setDuration(150L).setInterpolator(gr.j).withEndAction(new hl(this, 3));
        this.o1 = withEndAction;
        withEndAction.start();
        l0();
    }

    public final void t0() {
        bi biVar = this.b;
        if (!biVar.Z3 && this.v0 && CameraView.isCameraAllowed()) {
            if (this.P == null) {
                int i10 = 1;
                boolean z10 = !org.telegram.messenger.sc.e(360928);
                Context context = getContext();
                Boolean bool = this.o0;
                yl ylVar = new yl(this, context, bool != null ? bool.booleanValue() : biVar.O3, z10);
                this.P = ylVar;
                org.telegram.ui.ActionBar.k2 k2Var = biVar.W1;
                ylVar.setRecordFile(org.telegram.messenger.i0.s0((k2Var instanceof org.telegram.ui.un) && ((org.telegram.ui.un) k2Var).z()));
                this.P.setFocusable(true);
                this.P.setFpsLimit(30);
                this.P.setOutlineProvider(new org.telegram.ui.ol(this, i10));
                this.P.setClipToOutline(true);
                this.P.setContentDescription(org.telegram.messenger.cd.L0(2131754852, null));
                org.telegram.ui.ActionBar.p2 p2Var = biVar.c;
                yl ylVar2 = this.P;
                int i11 = this.K0;
                p2Var.addView(ylVar2, 1, new FrameLayout.LayoutParams(i11, i11));
                this.P.setDelegate(new rl(this));
                this.P.setAlpha(this.v0 ? 1.0f : 0.2f);
                this.P.setEnabled(this.v0);
                if (this.N) {
                    this.P.setVisibility(8);
                }
                if (!this.b0) {
                    W();
                }
                pl plVar = this.E;
                if (plVar != null) {
                    plVar.invalidate();
                }
                invalidate();
            }
            s81 s81Var = this.l0;
            if (s81Var != null) {
                s81Var.b(false, 0.0f);
                this.B0 = 0.0f;
            }
            if (this.b0) {
                return;
            }
            this.P.setTranslationX(this.U[0]);
        }
    }

    @Override // org.telegram.ui.Components.uh
    public final void u(float f7) {
        yl ylVar = this.P;
        if (ylVar != null) {
            ylVar.setAlpha(f7);
            if (f7 != 0.0f && this.P.getVisibility() != 0) {
                this.P.setVisibility(0);
            } else {
                if (f7 != 0.0f || this.P.getVisibility() == 4) {
                    return;
                }
                this.P.setVisibility(4);
            }
        }
    }

    public final void u0(boolean z10) {
        s81 s81Var = this.l0;
        int i10 = 1;
        if ((s81Var.getTag() != null && z10) || (s81Var.getTag() == null && !z10)) {
            if (z10) {
                Runnable runnable = this.n0;
                if (runnable != null) {
                    org.telegram.messenger.i0.r(runnable);
                }
                hl hlVar = new hl(this, i10);
                this.n0 = hlVar;
                org.telegram.messenger.i0.h3(hlVar, 2000L);
                return;
            }
            return;
        }
        AnimatorSet animatorSet = this.m0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        s81Var.setTag(z10 ? 1 : null);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.m0 = animatorSet2;
        animatorSet2.setDuration(180L);
        this.m0.playTogether(ObjectAnimator.ofFloat(s81Var, (Property<s81, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
        this.m0.addListener(new ol(this, i10));
        this.m0.start();
        if (z10) {
            hl hlVar2 = new hl(this, 2);
            this.n0 = hlVar2;
            org.telegram.messenger.i0.h3(hlVar2, 2000L);
        }
    }

    public final void v0() {
        tl tlVar = this.x;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = tlVar.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        if (this.v0) {
            ArrayList arrayList = r0() ? MediaController.a2 : MediaController.b2;
            ArrayList arrayList2 = new ArrayList(arrayList);
            this.V0 = arrayList2;
            Collections.sort(arrayList2, new jl(arrayList, 0));
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
        for (int i10 = 0; i10 < size; i10++) {
            org.telegram.messenger.we weVar = (org.telegram.messenger.we) this.V0.get(i10);
            vh.a aVar = new vh.a(getContext(), weVar.d, weVar.c, weVar.e.size(), this.a);
            tlVar.getPopupLayout().addView(aVar);
            aVar.setOnClickListener(new bh.f(this, i10 + 10, 6));
        }
    }

    @Override // org.telegram.ui.Components.uh
    public final void w(int i10) {
        TLRPC.Chat X0;
        boolean z10;
        boolean z11;
        char c10 = 1;
        char c11 = 1;
        char c12 = 1;
        char c13 = 1;
        bi biVar = this.b;
        if (i10 == 8) {
            biVar.u1(!biVar.T1, true);
            this.d1.a(!biVar.T1, true);
            return;
        }
        if ((i10 == 0 || i10 == 1) && biVar.M3 > 0 && t1.size() > 1 && (X0 = biVar.X0()) != null && !org.telegram.messenger.w3.N(X0) && X0.slowmode_enabled) {
            s4.N(getContext(), org.telegram.messenger.cd.L0(2131745328, null), org.telegram.messenger.cd.L0(2131745320, null), null, null, this.a).p();
            return;
        }
        org.telegram.ui.ActionBar.p6 p6Var = this.a;
        HashMap hashMap = s1;
        final int i11 = 0;
        if (i10 == 0) {
            org.telegram.messenger.jj jjVar = biVar.B3;
            org.telegram.ui.ActionBar.k2 k2Var = biVar.W1;
            if (jjVar == null && (k2Var instanceof org.telegram.ui.un) && ((org.telegram.ui.un) k2Var).c()) {
                s4.L(getContext(), ((org.telegram.ui.un) k2Var).a(), new dl(this, i11), p6Var);
                return;
            } else {
                s4.Z(biVar.D3, biVar.W0() + hashMap.size(), biVar.a1(), new org.telegram.messenger.q20(this) { // from class: org.telegram.ui.Components.el
                    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.messenger.q20
                    public final void a(Object obj) {
                        int i12 = i11;
                        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                        Long l4 = (Long) obj;
                        switch (i12) {
                            case 0:
                                boolean z12 = ChatAttachAlertPhotoLayout.q1;
                                bi biVar2 = chatAttachAlertPhotoLayout.b;
                                biVar2.M0();
                                biVar2.T3.H0(7, false, true, 0, 0, 0L, biVar2.e1(), false, l4.longValue());
                                break;
                            default:
                                boolean z13 = ChatAttachAlertPhotoLayout.q1;
                                bi biVar3 = chatAttachAlertPhotoLayout.b;
                                biVar3.M0();
                                biVar3.T3.H0(4, true, true, 0, 0, 0L, biVar3.e1(), false, l4.longValue());
                                break;
                        }
                    }
                });
                return;
            }
        }
        if (i10 == 1) {
            org.telegram.messenger.jj jjVar2 = biVar.B3;
            org.telegram.ui.ActionBar.k2 k2Var2 = biVar.W1;
            if (jjVar2 == null && (k2Var2 instanceof org.telegram.ui.un) && ((org.telegram.ui.un) k2Var2).c()) {
                s4.L(getContext(), ((org.telegram.ui.un) k2Var2).a(), new dl(this, c13 == true ? 1 : 0), p6Var);
                return;
            }
            int i12 = biVar.D3;
            long a12 = biVar.a1();
            int W0 = biVar.W0() + hashMap.size();
            final char c14 = c12 == true ? 1 : 0;
            s4.Z(i12, W0, a12, new org.telegram.messenger.q20(this) { // from class: org.telegram.ui.Components.el
                public final /* synthetic */ ChatAttachAlertPhotoLayout b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.q20
                public final void a(Object obj) {
                    int i122 = c14;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                    Long l4 = (Long) obj;
                    switch (i122) {
                        case 0:
                            boolean z12 = ChatAttachAlertPhotoLayout.q1;
                            bi biVar2 = chatAttachAlertPhotoLayout.b;
                            biVar2.M0();
                            biVar2.T3.H0(7, false, true, 0, 0, 0L, biVar2.e1(), false, l4.longValue());
                            break;
                        default:
                            boolean z13 = ChatAttachAlertPhotoLayout.q1;
                            bi biVar3 = chatAttachAlertPhotoLayout.b;
                            biVar3.M0();
                            biVar3.T3.H0(4, true, true, 0, 0, 0L, biVar3.e1(), false, l4.longValue());
                            break;
                    }
                }
            });
            return;
        }
        bm bmVar = this.G;
        pl plVar = this.E;
        if (i10 == 3) {
            jm jmVar = biVar.h2;
            if (jmVar != null) {
                jmVar.N();
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
            org.telegram.messenger.i0.h3(new Runnable(this) { // from class: org.telegram.ui.Components.fl
                public final /* synthetic */ ChatAttachAlertPhotoLayout b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i13 = i11;
                    boolean z13 = z12;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                    switch (i13) {
                        case 0:
                            boolean z14 = ChatAttachAlertPhotoLayout.q1;
                            bi biVar2 = chatAttachAlertPhotoLayout.b;
                            org.telegram.ui.ActionBar.b1 b1Var = chatAttachAlertPhotoLayout.Y0;
                            b1Var.setText(org.telegram.messenger.cd.L0(z13 ? 2131751431 : 2131751155, null));
                            if (z13) {
                                b1Var.setIcon(R.drawable.msg_spoiler_off);
                            } else {
                                b1Var.setAnimatedIcon(R.raw.photo_spoiler);
                            }
                            if (!z13) {
                                biVar2.U2.S(1);
                                if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                    biVar2.U2.S(6);
                                    break;
                                }
                            } else {
                                biVar2.U2.t(1);
                                if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                    biVar2.U2.t(6);
                                    break;
                                }
                            }
                            break;
                        default:
                            org.telegram.ui.ActionBar.b1 b1Var2 = chatAttachAlertPhotoLayout.a1;
                            b1Var2.setText(org.telegram.messenger.cd.L0(z13 ? 2131745637 : 2131745638, null));
                            if (!z13) {
                                b1Var2.setIcon(R.drawable.menu_quality_hd);
                                break;
                            } else {
                                b1Var2.setIcon(R.drawable.menu_quality_sd);
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
            plVar.M(new gl(i11, arrayList, z12));
            if (biVar.s2 != this) {
                bmVar.f();
            }
            jm jmVar2 = biVar.h2;
            if (jmVar2 != null) {
                jmVar2.w.invalidate();
                return;
            }
            return;
        }
        if (i10 == 2) {
            jm jmVar3 = biVar.h2;
            if (jmVar3 != null) {
                jmVar3.N();
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
            final char c15 = c11 == true ? 1 : 0;
            org.telegram.messenger.i0.h3(new Runnable(this) { // from class: org.telegram.ui.Components.fl
                public final /* synthetic */ ChatAttachAlertPhotoLayout b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i13 = c15;
                    boolean z132 = z13;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                    switch (i13) {
                        case 0:
                            boolean z14 = ChatAttachAlertPhotoLayout.q1;
                            bi biVar2 = chatAttachAlertPhotoLayout.b;
                            org.telegram.ui.ActionBar.b1 b1Var = chatAttachAlertPhotoLayout.Y0;
                            b1Var.setText(org.telegram.messenger.cd.L0(z132 ? 2131751431 : 2131751155, null));
                            if (z132) {
                                b1Var.setIcon(R.drawable.msg_spoiler_off);
                            } else {
                                b1Var.setAnimatedIcon(R.raw.photo_spoiler);
                            }
                            if (!z132) {
                                biVar2.U2.S(1);
                                if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                    biVar2.U2.S(6);
                                    break;
                                }
                            } else {
                                biVar2.U2.t(1);
                                if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                    biVar2.U2.t(6);
                                    break;
                                }
                            }
                            break;
                        default:
                            org.telegram.ui.ActionBar.b1 b1Var2 = chatAttachAlertPhotoLayout.a1;
                            b1Var2.setText(org.telegram.messenger.cd.L0(z132 ? 2131745637 : 2131745638, null));
                            if (!z132) {
                                b1Var2.setIcon(R.drawable.menu_quality_hd);
                                break;
                            } else {
                                b1Var2.setIcon(R.drawable.menu_quality_sd);
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
            plVar.M(new gl(c10 == true ? 1 : 0, arrayList2, z13));
            if (biVar.s2 != this) {
                bmVar.f();
            }
            jm jmVar4 = biVar.h2;
            if (jmVar4 != null) {
                jmVar4.w.invalidate();
                return;
            }
            return;
        }
        if (i10 != 4) {
            if (i10 == 7) {
                biVar.N1(biVar.s2 != biVar.h2);
                return;
            }
            if (i10 == 9) {
                rh.h8.i1(getContext(), getStarsPrice(), true, new d(this, 6), this.a);
                return;
            }
            if (i10 >= 10) {
                org.telegram.messenger.we weVar = (org.telegram.messenger.we) this.V0.get(i10 - 10);
                this.T0 = weVar;
                org.telegram.messenger.we weVar2 = this.U0;
                TextView textView = this.y;
                if (weVar == weVar2) {
                    textView.setText(org.telegram.messenger.cd.L0(2131752238, null));
                } else {
                    textView.setText(weVar.c);
                }
                bmVar.f();
                this.w.f();
                this.F.h1(0, -(plVar.getPaddingTop() - getTopScrollOffset()));
                return;
            }
            return;
        }
        try {
            if (r0()) {
                Intent intent = new Intent();
                intent.setType("video/*");
                intent.setAction("android.intent.action.GET_CONTENT");
                intent.putExtra("android.intent.extra.sizeLimit", 2097152000L);
                Intent intent2 = new Intent("android.intent.action.PICK");
                intent2.setType("image/*");
                Intent createChooser = Intent.createChooser(intent2, null);
                createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", new Intent[]{intent});
                int i13 = biVar.K2;
                org.telegram.ui.ActionBar.k2 k2Var3 = biVar.W1;
                if (i13 != 0) {
                    k2Var3.startActivityForResult(createChooser, 14);
                } else {
                    k2Var3.startActivityForResult(createChooser, 1);
                }
            } else {
                Intent intent3 = new Intent("android.intent.action.PICK");
                intent3.setType("image/*");
                int i14 = biVar.K2;
                org.telegram.ui.ActionBar.k2 k2Var4 = biVar.W1;
                if (i14 != 0) {
                    k2Var4.startActivityForResult(intent3, 14);
                } else {
                    k2Var4.startActivityForResult(intent3, 1);
                }
            }
            biVar.a(true);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void w0() {
        pl plVar = this.E;
        if (plVar != null) {
            for (int i10 = 0; i10 < plVar.getChildCount(); i10++) {
                View childAt = plVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.v5) {
                    ((org.telegram.ui.Cells.v5) childAt).a.invalidate();
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.uh
    public final void x() {
        bi biVar = this.b;
        V(biVar != null && (biVar.W1 instanceof org.telegram.ui.un));
    }

    public final void x0() {
        ArrayList arrayList;
        if (this.b.W1 instanceof org.telegram.ui.un) {
            pl plVar = this.E;
            int childCount = plVar.getChildCount();
            int i10 = 0;
            while (true) {
                arrayList = t1;
                if (i10 >= childCount) {
                    break;
                }
                View childAt = plVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.v5) {
                    org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) childAt;
                    org.telegram.messenger.ef c02 = c0(((Integer) v5Var.getTag()).intValue());
                    if (c02 != null) {
                        v5Var.setNum(arrayList.indexOf(Integer.valueOf(c02.C)));
                    }
                }
                i10++;
            }
            pl plVar2 = this.r;
            int childCount2 = plVar2.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                View childAt2 = plVar2.getChildAt(i11);
                if (childAt2 instanceof org.telegram.ui.Cells.v5) {
                    org.telegram.ui.Cells.v5 v5Var2 = (org.telegram.ui.Cells.v5) childAt2;
                    org.telegram.messenger.ef c03 = c0(((Integer) v5Var2.getTag()).intValue());
                    if (c03 != null) {
                        v5Var2.setNum(arrayList.indexOf(Integer.valueOf(c03.C)));
                    }
                }
            }
        }
    }

    public final void y0() {
        ArrayList arrayList;
        bm bmVar;
        HashMap hashMap;
        bi biVar = this.b;
        org.telegram.ui.ActionBar.k2 k2Var = biVar.W1;
        org.telegram.ui.ActionBar.k2 k2Var2 = biVar.W1;
        if (k2Var instanceof org.telegram.ui.un) {
            pl plVar = this.E;
            int childCount = plVar.getChildCount();
            int i10 = 0;
            while (true) {
                arrayList = t1;
                bmVar = this.G;
                hashMap = s1;
                if (i10 >= childCount) {
                    break;
                }
                View childAt = plVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.v5) {
                    org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) childAt;
                    int R = RecyclerView.R(childAt);
                    if (bmVar.f && R > this.M0) {
                        R--;
                    }
                    if (bmVar.d && this.T0 == this.U0) {
                        R--;
                    }
                    org.telegram.messenger.ef c02 = c0(R);
                    v5Var.setHasSpoiler(c02 != null && c02.M);
                    v5Var.setHighQuality(c02 != null && c02.c());
                    if ((k2Var2 instanceof org.telegram.ui.un) && biVar.N3) {
                        v5Var.b(c02 != null ? arrayList.indexOf(Integer.valueOf(c02.C)) : -1, c02 != null && hashMap.containsKey(Integer.valueOf(c02.C)), true);
                    } else {
                        v5Var.b(-1, c02 != null && hashMap.containsKey(Integer.valueOf(c02.C)), true);
                    }
                }
                i10++;
            }
            pl plVar2 = this.r;
            int childCount2 = plVar2.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                View childAt2 = plVar2.getChildAt(i11);
                if (childAt2 instanceof org.telegram.ui.Cells.v5) {
                    org.telegram.ui.Cells.v5 v5Var2 = (org.telegram.ui.Cells.v5) childAt2;
                    int R2 = RecyclerView.R(childAt2);
                    if (bmVar.f && R2 > this.M0) {
                        R2--;
                    }
                    if (bmVar.d && this.T0 == this.U0) {
                        R2--;
                    }
                    org.telegram.messenger.ef c03 = c0(R2);
                    v5Var2.setHasSpoiler(c03 != null && c03.M);
                    v5Var2.setHighQuality(c03 != null && c03.c());
                    if ((k2Var2 instanceof org.telegram.ui.un) && biVar.N3) {
                        v5Var2.b(c03 != null ? arrayList.indexOf(Integer.valueOf(c03.C)) : -1, c03 != null && hashMap.containsKey(Integer.valueOf(c03.C)), true);
                    } else {
                        v5Var2.b(-1, c03 != null && hashMap.containsKey(Integer.valueOf(c03.C)), true);
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.uh
    public final void z(int i10, boolean z10) {
        W();
        yl ylVar = this.P;
        if (ylVar != null) {
            ylVar.invalidateOutline();
            this.P.invalidate();
        }
    }

    public final void z0(boolean z10) {
        TextView textView = this.p0;
        if (textView != null) {
            bi biVar = this.b;
            int i10 = biVar.K2;
            TextView textView2 = biVar.d3;
            if (i10 != 0 || biVar.N2 || biVar.y1) {
                return;
            }
            HashMap hashMap = s1;
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
                textView.setText(org.telegram.messenger.cd.G(hashMap.size(), "Media", new Object[0]).toUpperCase());
                if (max != this.M || z10) {
                    textView2.setText(org.telegram.messenger.cd.G(max, "MediaSelected", new Object[0]));
                }
            } else if (z11) {
                textView.setText(org.telegram.messenger.cd.G(hashMap.size(), "Videos", new Object[0]).toUpperCase());
                if (max != this.M || z10) {
                    textView2.setText(org.telegram.messenger.cd.G(max, "VideosSelected", new Object[0]));
                }
            } else {
                textView.setText(org.telegram.messenger.cd.G(hashMap.size(), "Photos", new Object[0]).toUpperCase());
                if (max != this.M || z10) {
                    textView2.setText(org.telegram.messenger.cd.G(max, "PhotosSelected", new Object[0]));
                }
            }
            boolean z13 = max > 1;
            biVar.D1 = z13;
            biVar.g3.setVisibility((!z13 || biVar.K2 == 2) ? 8 : 0);
            this.M = max;
        }
    }
}
