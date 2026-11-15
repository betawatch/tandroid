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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public class ChatAttachAlertPhotoLayout extends ci implements org.telegram.messenger.is {
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
    public final ql F;
    public final Rect F0;
    public final gi.g G;
    public float G0;
    public final am H;
    public boolean H0;
    public final ny I;
    public boolean I0;
    public final yj0 J;
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
    public xl Q;
    public boolean Q0;
    public final yl R;
    public boolean R0;
    public final vl S;
    public boolean S0;
    public final ImageView[] T;
    public int T0;
    public boolean U;
    public org.telegram.messenger.ve U0;
    public final float[] V;
    public org.telegram.messenger.ve V0;
    public final int[] W;
    public ArrayList W0;
    public float X0;
    public boolean Y0;
    public final org.telegram.ui.ActionBar.z0 Z0;
    public float a0;
    public final org.telegram.ui.ActionBar.z0 a1;
    public float b0;
    public final org.telegram.ui.ActionBar.z0 b1;
    public boolean c0;
    public final org.telegram.ui.ActionBar.z0 c1;
    public boolean d0;
    public final org.telegram.ui.ActionBar.z0 d1;
    public boolean e0;
    public final ja0 e1;
    public float f0;
    public final boolean f1;
    public final int[] g0;
    public final h2.f g1;
    public int h0;
    public boolean h1;
    public nl i0;
    public final tl i1;
    public final DecelerateInterpolator j0;
    public boolean j1;
    public final bi.g2 k0;
    public float k1;
    public final ShutterButton l0;
    public float l1;
    public final s71 m0;
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
    public final ql r;
    public final TextView r0;
    public final jg.b0 s;
    public final ImageView s0;
    public boolean t0;
    public boolean u0;
    public boolean v0;
    public final am w;
    public boolean w0;
    public final hi.u2 x;
    public boolean x0;
    public final TextView y;
    public boolean y0;
    public boolean z0;

    /* JADX WARN: Multi-variable type inference failed */
    public ChatAttachAlertPhotoLayout(ki kiVar, Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var, kiVar);
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
        this.i1 = new tl(this);
        this.f1 = z10;
        this.n = z11;
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.r2);
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.l4);
        org.telegram.ui.ActionBar.k2 k2Var = kiVar.c;
        ki kiVar2 = this.b;
        final int i12 = 0;
        this.h1 = kiVar2.O2 != 0;
        hi.u2 u2Var = new hi.u2(this, context, kiVar2.V2.s(), e6Var, 1);
        this.x = u2Var;
        u2Var.setSubMenuOpenSide(1);
        FrameLayout.LayoutParams d = c8.ja.d(-2, -1.0f, 51, 60.0f, 0.0f, 40.0f, 0.0f);
        d.topMargin = org.telegram.messenger.g0.m;
        this.b.V2.addView(u2Var, 0, d);
        u2Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.el
            public final /* synthetic */ ChatAttachAlertPhotoLayout b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xl xlVar;
                xl xlVar2;
                int i13 = i7;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                int i14 = 0;
                switch (i13) {
                    case 0:
                        if (!chatAttachAlertPhotoLayout.t0 && (xlVar = chatAttachAlertPhotoLayout.Q) != null && xlVar.isInited()) {
                            chatAttachAlertPhotoLayout.d0 = false;
                            chatAttachAlertPhotoLayout.Q.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.s0, (Property<ImageView, Float>) View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new pl(chatAttachAlertPhotoLayout, i14));
                            duration.start();
                            break;
                        }
                        break;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.U && (xlVar2 = chatAttachAlertPhotoLayout.Q) != null && xlVar2.isInited() && chatAttachAlertPhotoLayout.c0) {
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
                                animatorSet.setInterpolator(er.f);
                                animatorSet.addListener(new fi.c3(chatAttachAlertPhotoLayout, view, imageView, 4));
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
        int i13 = org.telegram.ui.ActionBar.j6.j5;
        org.telegram.ui.ActionBar.q6.U(textView, i13, e6Var);
        textView.setText(org.telegram.messenger.hd.M0(2131752238, null));
        textView.setTypeface(org.telegram.messenger.g0.o());
        Drawable g10 = i5.c.g(context, R.drawable.ic_arrow_drop_down);
        this.E = g10;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.q6.x(this, g10, i13, e6Var, mode);
        textView.setPadding(0, 0, org.telegram.messenger.g0.L(10.0f), 0);
        u2Var.addView(textView, c8.ja.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
        X(false);
        ja0 ja0Var = new ja0(context, R.raw.position_below, org.telegram.messenger.hd.M0(2131752560, null), R.raw.position_above, org.telegram.messenger.hd.M0(2131752559, null), e6Var);
        this.e1 = ja0Var;
        ja0Var.a(!this.b.X1, false);
        this.d1 = this.b.Y2.e(7, R.drawable.msg_view_file, org.telegram.messenger.hd.M0(2131753957, null));
        this.b.Y2.a(5);
        this.b.Y2.e(4, R.drawable.msg_openin, org.telegram.messenger.hd.M0(2131747796, null));
        this.a1 = this.b.Y2.e(1, R.drawable.msg_filehq, org.telegram.messenger.hd.M0(2131745585, null));
        this.b.Y2.e(0, R.drawable.msg_ungroup, org.telegram.messenger.hd.M0(2131745584, null));
        this.b.Y2.a(6);
        this.Z0 = this.b.Y2.e(3, R.drawable.msg_spoiler, org.telegram.messenger.hd.M0(2131751154, null));
        this.b1 = this.b.Y2.e(2, R.drawable.menu_quality_hd, org.telegram.messenger.hd.M0(2131745621, null));
        org.telegram.ui.ActionBar.q0 q0Var = this.b.Y2;
        q0Var.q();
        ja0Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        ja0Var.setTag(8);
        q0Var.b.addView(ja0Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) ja0Var.getLayoutParams();
        if (org.telegram.messenger.hd.a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = org.telegram.messenger.g0.L(48.0f);
        ja0Var.setLayoutParams(layoutParams);
        ja0Var.setOnClickListener(new org.telegram.ui.ActionBar.a0(q0Var, 2));
        this.c1 = this.b.Y2.e(9, R.drawable.menu_feature_paid, org.telegram.messenger.hd.M0(2131747730, null));
        this.b.Y2.setFitSubItems(true);
        ql qlVar = new ql(this, context, e6Var, i11);
        this.F = qlVar;
        qlVar.setFastScrollEnabled(1);
        qlVar.setFastScrollVisible(true);
        qlVar.getFastScroll().setAlpha(0.0f);
        qlVar.getFastScroll().a = false;
        qlVar.getFastScroll().i0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        am amVar = new am(this, context, z11);
        this.H = amVar;
        qlVar.setAdapter(amVar);
        yl ylVar = new yl(this, qlVar);
        this.R = ylVar;
        qlVar.i(ylVar);
        int i14 = 0;
        for (int i15 = 8; i14 < i15; i15 = 8) {
            amVar.h.add(amVar.L());
            i14++;
        }
        qlVar.setClipToPadding(false);
        qlVar.setItemAnimator(null);
        qlVar.setLayoutAnimation(null);
        qlVar.setVerticalScrollBarEnabled(false);
        org.telegram.ui.ActionBar.q6.l(qlVar, 21, org.telegram.ui.ActionBar.j6.A5, e6Var);
        addView(qlVar, c8.ja.d(-1, -1.0f, org.telegram.messenger.ns.E1, 0.0f, 0.0f, 0.0f, -48.0f));
        qlVar.setOnScrollListener(new hi.f8(i11, this));
        gi.g gVar = new gi.g(this, this.L0, i10);
        this.G = gVar;
        gVar.O = new bi.y1(this, 10);
        qlVar.setLayoutManager(gVar);
        qlVar.setOnItemClickListener(new ab.j(this, z11, e6Var, 7));
        qlVar.setOnItemLongClickListener(new fl(this, 2));
        yj0 yj0Var = new yj0(new cf(this));
        this.J = yj0Var;
        qlVar.F.add(yj0Var);
        setBlur3Capture(qlVar);
        this.d = qlVar;
        this.f = true;
        ny nyVar = new ny(context, e6Var);
        this.I = nyVar;
        nyVar.setText(org.telegram.messenger.hd.M0(2131748180, null));
        nyVar.setOnTouchListener(null);
        int i16 = 16;
        nyVar.setTextSize(16);
        addView(nyVar, c8.ja.c(-2.0f, -1));
        if (this.Y0) {
            nyVar.b();
        } else {
            nyVar.c();
        }
        Paint paint = new Paint(1);
        paint.setColor(-2468275);
        vl vlVar = new vl(context, paint);
        this.S = vlVar;
        org.telegram.messenger.g0.Y3(vlVar, false, 1.0f, true, false);
        vlVar.setBackgroundResource(R.drawable.system);
        vlVar.getBackground().setColorFilter(new PorterDuffColorFilter(1711276032, mode));
        vlVar.setTextSize(1, 15.0f);
        vlVar.setTypeface(org.telegram.messenger.g0.o());
        vlVar.setAlpha(0.0f);
        vlVar.setTextColor(-1);
        vlVar.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(5.0f));
        k2Var.addView(vlVar, c8.ja.d(-2, -2.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
        bi.g2 g2Var = new bi.g2(i16, context, this);
        this.k0 = g2Var;
        g2Var.setVisibility(8);
        g2Var.setAlpha(0.0f);
        k2Var.addView(g2Var, c8.ja.e(-1, org.telegram.messenger.ns.K1, 83));
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
        k2Var.addView(textView2, c8.ja.d(-2, 38.0f, 51, 0.0f, 0.0f, 0.0f, 116.0f));
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.el
            public final /* synthetic */ ChatAttachAlertPhotoLayout b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xl xlVar;
                xl xlVar2;
                int i132 = i10;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                int i142 = 0;
                switch (i132) {
                    case 0:
                        if (!chatAttachAlertPhotoLayout.t0 && (xlVar = chatAttachAlertPhotoLayout.Q) != null && xlVar.isInited()) {
                            chatAttachAlertPhotoLayout.d0 = false;
                            chatAttachAlertPhotoLayout.Q.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.s0, (Property<ImageView, Float>) View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new pl(chatAttachAlertPhotoLayout, i142));
                            duration.start();
                            break;
                        }
                        break;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.U && (xlVar2 = chatAttachAlertPhotoLayout.Q) != null && xlVar2.isInited() && chatAttachAlertPhotoLayout.c0) {
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
                                animatorSet.setInterpolator(er.f);
                                animatorSet.addListener(new fi.c3(chatAttachAlertPhotoLayout, view, imageView, 4));
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
        s71 s71Var = new s71(context);
        this.m0 = s71Var;
        s71Var.setVisibility(8);
        s71Var.setAlpha(0.0f);
        k2Var.addView(s71Var, c8.ja.d(-2, 50.0f, 51, 0.0f, 0.0f, 0.0f, 116.0f));
        s71Var.setDelegate(new fl(this, i10));
        ShutterButton shutterButton = new ShutterButton(context);
        shutterButton.b = new DecelerateInterpolator();
        shutterButton.x = new zj(shutterButton, 17);
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
        shutterButton.f = dt0.a;
        this.l0 = shutterButton;
        g2Var.addView(shutterButton, c8.ja.e(84, 84, 17));
        shutterButton.setDelegate(new ol(this, e6Var, k2Var));
        shutterButton.setFocusable(true);
        shutterButton.setContentDescription(org.telegram.messenger.hd.M0(2131754760, null));
        ImageView imageView = new ImageView(context);
        this.s0 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        g2Var.addView(imageView, c8.ja.e(48, 48, 21));
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.el
            public final /* synthetic */ ChatAttachAlertPhotoLayout b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xl xlVar;
                xl xlVar2;
                int i132 = i12;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                int i142 = 0;
                switch (i132) {
                    case 0:
                        if (!chatAttachAlertPhotoLayout.t0 && (xlVar = chatAttachAlertPhotoLayout.Q) != null && xlVar.isInited()) {
                            chatAttachAlertPhotoLayout.d0 = false;
                            chatAttachAlertPhotoLayout.Q.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.s0, (Property<ImageView, Float>) View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new pl(chatAttachAlertPhotoLayout, i142));
                            duration.start();
                            break;
                        }
                        break;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.U && (xlVar2 = chatAttachAlertPhotoLayout.Q) != null && xlVar2.isInited() && chatAttachAlertPhotoLayout.c0) {
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
                                animatorSet.setInterpolator(er.f);
                                animatorSet.addListener(new fi.c3(chatAttachAlertPhotoLayout, view, imageView2, 4));
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
        imageView.setContentDescription(org.telegram.messenger.hd.M0(2131754752, null));
        for (int i17 = 0; i17 < 2; i17++) {
            this.T[i17] = new ImageView(context);
            this.T[i17].setScaleType(ImageView.ScaleType.CENTER);
            this.T[i17].setVisibility(4);
            this.k0.addView(this.T[i17], c8.ja.e(48, 48, 51));
            this.T[i17].setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.el
                public final /* synthetic */ ChatAttachAlertPhotoLayout b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    xl xlVar;
                    xl xlVar2;
                    int i132 = i11;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                    int i142 = 0;
                    switch (i132) {
                        case 0:
                            if (!chatAttachAlertPhotoLayout.t0 && (xlVar = chatAttachAlertPhotoLayout.Q) != null && xlVar.isInited()) {
                                chatAttachAlertPhotoLayout.d0 = false;
                                chatAttachAlertPhotoLayout.Q.switchCamera();
                                ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.s0, (Property<ImageView, Float>) View.SCALE_X, 0.0f).setDuration(100L);
                                duration.addListener(new pl(chatAttachAlertPhotoLayout, i142));
                                duration.start();
                                break;
                            }
                            break;
                        case 1:
                            if (!chatAttachAlertPhotoLayout.U && (xlVar2 = chatAttachAlertPhotoLayout.Q) != null && xlVar2.isInited() && chatAttachAlertPhotoLayout.c0) {
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
                                    animatorSet.setInterpolator(er.f);
                                    animatorSet.addListener(new fi.c3(chatAttachAlertPhotoLayout, view, imageView2, 4));
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
        textView3.setText(org.telegram.messenger.hd.M0(2131744270, null));
        textView3.setShadowLayer(org.telegram.messenger.g0.L(3.33333f), 0.0f, org.telegram.messenger.g0.L(0.666f), 1275068416);
        textView3.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), 0);
        this.k0.addView(textView3, c8.ja.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        ql qlVar2 = new ql(this, context, e6Var, null == true ? 1 : 0);
        this.r = qlVar2;
        qlVar2.setVerticalScrollBarEnabled(true);
        am amVar2 = new am(this, context, false);
        this.w = amVar2;
        qlVar2.setAdapter(amVar2);
        for (int i18 = 0; i18 < 8; i18++) {
            amVar2.h.add(amVar2.L());
        }
        qlVar2.setClipToPadding(false);
        qlVar2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        qlVar2.setItemAnimator(null);
        qlVar2.setLayoutAnimation(null);
        qlVar2.setOverScrollMode(2);
        qlVar2.setVisibility(4);
        qlVar2.setAlpha(0.0f);
        k2Var.addView(qlVar2, c8.ja.c(80.0f, -1));
        jg.b0 b0Var = new jg.b0(null == true ? 1 : 0, null == true ? 1 : 0, 7);
        this.s = b0Var;
        qlVar2.setLayoutManager(b0Var);
        qlVar2.setOnItemClickListener(new bi.a(i10));
    }

    public static org.telegram.ui.Cells.q5 P(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i7) {
        ql qlVar = chatAttachAlertPhotoLayout.F;
        int childCount = qlVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = qlVar.getChildAt(i10);
            if (childAt.getTop() < qlVar.getMeasuredHeight() - chatAttachAlertPhotoLayout.b.Z0() && (childAt instanceof org.telegram.ui.Cells.q5)) {
                org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                if (q5Var.getImageView().getTag() != null && ((Integer) q5Var.getImageView().getTag()).intValue() == i7) {
                    return q5Var;
                }
            }
        }
        return null;
    }

    public static int R(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        ki kiVar = chatAttachAlertPhotoLayout.b;
        org.telegram.ui.ActionBar.e2 e2Var = kiVar.a2;
        return ((e2Var instanceof org.telegram.ui.an) && ((org.telegram.ui.an) e2Var).g4 == 5) ? ((org.telegram.messenger.j0) e2Var.getMessagesController().y7.d0.b).c - ((org.telegram.ui.an) kiVar.a2).L6.size() : ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    public static boolean V() {
        HashMap hashMap = t1;
        if (hashMap.isEmpty()) {
            return false;
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (entry.getValue() instanceof org.telegram.messenger.ff) {
                org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) entry.getValue();
                if (ffVar.d() && ffVar.j()) {
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
            if (!TextUtils.isEmpty(obj instanceof org.telegram.messenger.ff ? ((org.telegram.messenger.ff) obj).a : obj instanceof org.telegram.messenger.jf ? ((org.telegram.messenger.jf) obj).I : null)) {
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
            if ((entry.getValue() instanceof org.telegram.messenger.ff) && ((org.telegram.messenger.ff) entry.getValue()).d()) {
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

    @Override // org.telegram.ui.Components.ci
    public final void A() {
        ShutterButton shutterButton = this.l0;
        if (shutterButton == null) {
            return;
        }
        boolean z10 = this.R0;
        dt0 dt0Var = dt0.a;
        dt0 dt0Var2 = dt0.b;
        if (z10) {
            if (this.Q != null && shutterButton.getState() == dt0Var2) {
                shutterButton.a(dt0Var);
            }
            this.R0 = false;
            return;
        }
        if (this.Q != null && shutterButton.getState() == dt0Var2) {
            o0();
            CameraController.getInstance().stopVideoRecording(this.Q.getCameraSession(), false);
            shutterButton.a(dt0Var);
        }
        if (this.c0) {
            d0(false);
        }
        g0(true);
    }

    public final void A0() {
        ArrayList arrayList;
        am amVar;
        HashMap hashMap;
        ki kiVar = this.b;
        org.telegram.ui.ActionBar.e2 e2Var = kiVar.a2;
        org.telegram.ui.ActionBar.e2 e2Var2 = kiVar.a2;
        if (e2Var instanceof org.telegram.ui.an) {
            ql qlVar = this.F;
            int childCount = qlVar.getChildCount();
            int i7 = 0;
            while (true) {
                arrayList = u1;
                amVar = this.H;
                hashMap = t1;
                if (i7 >= childCount) {
                    break;
                }
                View childAt = qlVar.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.q5) {
                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                    int R = RecyclerView.R(childAt);
                    if (amVar.f && R > this.N0) {
                        R--;
                    }
                    if (amVar.d && this.U0 == this.V0) {
                        R--;
                    }
                    org.telegram.messenger.ff e02 = e0(R);
                    q5Var.setHasSpoiler(e02 != null && e02.M);
                    q5Var.setHighQuality(e02 != null && e02.c());
                    if ((e2Var2 instanceof org.telegram.ui.an) && kiVar.R3) {
                        q5Var.b(e02 != null ? arrayList.indexOf(Integer.valueOf(e02.C)) : -1, e02 != null && hashMap.containsKey(Integer.valueOf(e02.C)), true);
                    } else {
                        q5Var.b(-1, e02 != null && hashMap.containsKey(Integer.valueOf(e02.C)), true);
                    }
                }
                i7++;
            }
            ql qlVar2 = this.r;
            int childCount2 = qlVar2.getChildCount();
            for (int i10 = 0; i10 < childCount2; i10++) {
                View childAt2 = qlVar2.getChildAt(i10);
                if (childAt2 instanceof org.telegram.ui.Cells.q5) {
                    org.telegram.ui.Cells.q5 q5Var2 = (org.telegram.ui.Cells.q5) childAt2;
                    int R2 = RecyclerView.R(childAt2);
                    if (amVar.f && R2 > this.N0) {
                        R2--;
                    }
                    if (amVar.d && this.U0 == this.V0) {
                        R2--;
                    }
                    org.telegram.messenger.ff e03 = e0(R2);
                    q5Var2.setHasSpoiler(e03 != null && e03.M);
                    q5Var2.setHighQuality(e03 != null && e03.c());
                    if ((e2Var2 instanceof org.telegram.ui.an) && kiVar.R3) {
                        q5Var2.b(e03 != null ? arrayList.indexOf(Integer.valueOf(e03.C)) : -1, e03 != null && hashMap.containsKey(Integer.valueOf(e03.C)), true);
                    } else {
                        q5Var2.b(-1, e03 != null && hashMap.containsKey(Integer.valueOf(e03.C)), true);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00db  */
    @Override // org.telegram.ui.Components.ci
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
        ql qlVar = this.F;
        ((FrameLayout.LayoutParams) qlVar.getLayoutParams()).topMargin = -this.q1;
        int L2 = (i7 - org.telegram.messenger.g0.L(4.0f)) - org.telegram.messenger.g0.L(4.0f);
        int i13 = this.N0;
        int i14 = L2 / i13;
        this.L0 = i14;
        if (this.M0 != i14 || i12 != i13) {
            this.M0 = i14;
            org.telegram.messenger.g0.h3(new jl(this, 4));
        }
        this.G.y1(Math.max(1, ((this.N0 - 1) * org.telegram.messenger.g0.L(2.0f)) + (this.L0 * this.N0)));
        am amVar = this.H;
        int ceil = (int) Math.ceil((amVar.b() - 1) / this.N0);
        if (this.Q0) {
            D = org.telegram.messenger.g0.L(400.0f);
        } else {
            D = org.telegram.messenger.k5.D(2.0f, ceil - 1, this.L0 * ceil);
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        int b10 = org.telegram.messenger.k5.b(6.0f, (((i10 - D) - currentActionBarHeight) - org.telegram.messenger.g0.n) - org.telegram.messenger.g0.L(12.0f), 0);
        if (this.K != b10) {
            this.K = b10;
            amVar.f();
        }
        if (!org.telegram.messenger.g0.Q1()) {
            Point point2 = org.telegram.messenger.g0.q;
            if (point2.x > point2.y) {
                i11 = (int) (i10 / 3.5f);
                L = ((i11 + currentActionBarHeight) - org.telegram.messenger.g0.L(52.0f)) + this.q1;
                if (L < 0) {
                    L = 0;
                }
                if (qlVar.getPaddingTop() == L || qlVar.getPaddingBottom() != this.e) {
                    qlVar.setPadding(org.telegram.messenger.g0.L(2.0f), L, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(48.0f) + this.e);
                }
                this.y.setTextSize(17.0f);
                this.S0 = false;
            }
        }
        i11 = (i10 / 5) * 2;
        L = ((i11 + currentActionBarHeight) - org.telegram.messenger.g0.L(52.0f)) + this.q1;
        if (L < 0) {
        }
        if (qlVar.getPaddingTop() == L) {
        }
        qlVar.setPadding(org.telegram.messenger.g0.L(2.0f), L, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(48.0f) + this.e);
        this.y.setTextSize(17.0f);
        this.S0 = false;
    }

    public final void B0(boolean z10) {
        TextView textView = this.q0;
        if (textView != null) {
            ki kiVar = this.b;
            int i7 = kiVar.O2;
            TextView textView2 = kiVar.h3;
            if (i7 != 0 || kiVar.R2 || kiVar.C1) {
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
                if (((org.telegram.messenger.ff) ((Map.Entry) it.next()).getValue()).b) {
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
                textView.setText(org.telegram.messenger.hd.G(hashMap.size(), "Media", new Object[0]).toUpperCase());
                if (max != this.N || z10) {
                    textView2.setText(org.telegram.messenger.hd.G(max, "MediaSelected", new Object[0]));
                }
            } else if (z11) {
                textView.setText(org.telegram.messenger.hd.G(hashMap.size(), "Videos", new Object[0]).toUpperCase());
                if (max != this.N || z10) {
                    textView2.setText(org.telegram.messenger.hd.G(max, "VideosSelected", new Object[0]));
                }
            } else {
                textView.setText(org.telegram.messenger.hd.G(hashMap.size(), "Photos", new Object[0]).toUpperCase());
                if (max != this.N || z10) {
                    textView2.setText(org.telegram.messenger.hd.G(max, "PhotosSelected", new Object[0]));
                }
            }
            boolean z13 = max > 1;
            kiVar.H1 = z13;
            kiVar.k3.setVisibility((!z13 || kiVar.O2 == 2) ? 8 : 0);
            this.N = max;
        }
    }

    @Override // org.telegram.ui.Components.ci
    public final void C() {
        ki kiVar = this.b;
        if (!kiVar.isShowing() || kiVar.J || PhotoViewer.p1().P1()) {
            return;
        }
        X(false);
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
    @Override // org.telegram.ui.Components.ci
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
        org.telegram.ui.ActionBar.e2 e2Var;
        TLRPC.ChatFull chatFull;
        boolean z16;
        ki kiVar = this.b;
        if (i7 > 1) {
            org.telegram.messenger.gj gjVar = kiVar.F3;
            org.telegram.ui.ActionBar.q0 q0Var = kiVar.Y2;
            if (gjVar == null) {
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
                        kiVar.Y2.u(4);
                    }
                    org.telegram.ui.ActionBar.z0 z0Var = this.a1;
                    if (i7 <= 1) {
                        kiVar.Y2.T(5);
                        kiVar.Y2.T(7);
                        z0Var.setText(org.telegram.messenger.hd.M0(2131745635, null));
                    } else {
                        kiVar.Y2.u(5);
                        kiVar.Y2.u(7);
                        if (i7 != 0) {
                            z0Var.setText(org.telegram.messenger.hd.M0(2131745636, null));
                        }
                    }
                    if (i7 > 0 && getStarsPrice() <= 0) {
                        if (kiVar != null) {
                            org.telegram.ui.ActionBar.e2 e2Var2 = kiVar.a2;
                            if (e2Var2 instanceof org.telegram.ui.an) {
                            }
                        }
                        z12 = true;
                        if (i7 > 0 || kiVar == null) {
                            j3 = 0;
                            z13 = z10;
                        } else {
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = kiVar.e2;
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
                                                CharSequence charSequence = ((org.telegram.messenger.ff) selectedPhotos.get(selectedPhotosOrder.get(i13))).a;
                                                String charSequence2 = charSequence == null ? "" : charSequence.toString();
                                                if (kiVar.a1() != null && TextUtils.isEmpty(charSequence2) && i12 == 0) {
                                                    charSequence2 = kiVar.a1().getText().toString();
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
                            if (z16 && (kiVar.a2 instanceof org.telegram.ui.an)) {
                                z14 = true;
                                if (i7 > 0 && kiVar != null) {
                                    e2Var = kiVar.a2;
                                    if ((e2Var instanceof org.telegram.ui.an) && org.telegram.messenger.t3.V(((org.telegram.ui.an) e2Var).e) && (chatFull = ((org.telegram.ui.an) e2Var).q8) != null && chatFull.paid_media_allowed) {
                                        z15 = true;
                                        if (!z12) {
                                            String M0 = org.telegram.messenger.hd.M0(2131751154, null);
                                            org.telegram.ui.ActionBar.z0 z0Var2 = this.Z0;
                                            z0Var2.setText(M0);
                                            z0Var2.setAnimatedIcon(R.raw.photo_spoiler);
                                            kiVar.Y2.u(3);
                                        } else if (kiVar != null) {
                                            kiVar.Y2.T(3);
                                        }
                                        if (kiVar != null) {
                                            org.telegram.ui.ActionBar.q0 q0Var2 = kiVar.Y2;
                                            if (getSelectedPhotosCount() == i7) {
                                                int selectedPhotosHighQualityCount = getSelectedPhotosHighQualityCount();
                                                org.telegram.ui.ActionBar.z0 z0Var3 = this.b1;
                                                if (selectedPhotosHighQualityCount > 0) {
                                                    z0Var3.setText(org.telegram.messenger.hd.M0(2131745620, null));
                                                    z0Var3.setIcon(R.drawable.menu_quality_sd);
                                                } else {
                                                    z0Var3.setText(org.telegram.messenger.hd.M0(2131745621, null));
                                                    z0Var3.setIcon(R.drawable.menu_quality_hd);
                                                }
                                                q0Var2.T(2);
                                            } else {
                                                q0Var2.u(2);
                                            }
                                        }
                                        ja0 ja0Var = this.e1;
                                        if (z14) {
                                            ja0Var.setVisibility(0);
                                        } else {
                                            ja0Var.setVisibility(8);
                                        }
                                        if ((!z12 || z14) && (z11 || z13)) {
                                            kiVar.Y2.T(6);
                                        } else {
                                            kiVar.Y2.u(6);
                                        }
                                        if (!z15) {
                                            kiVar.Y2.u(9);
                                            return;
                                        }
                                        org.telegram.ui.ActionBar.z0 z0Var4 = this.c1;
                                        if (z0Var4 != null) {
                                            long starsPrice = getStarsPrice();
                                            if (starsPrice > j3) {
                                                z0Var4.setText(org.telegram.messenger.hd.M0(2131747728, null));
                                                z0Var4.setSubtext(org.telegram.messenger.hd.G((int) starsPrice, "Stars", new Object[0]));
                                            } else {
                                                z0Var4.setText(org.telegram.messenger.hd.M0(2131747730, null));
                                                z0Var4.setSubtext(null);
                                            }
                                        }
                                        this.F.M(new org.telegram.ui.gq(1));
                                        kiVar.Y2.T(9);
                                        return;
                                    }
                                }
                                z15 = false;
                                if (!z12) {
                                }
                                if (kiVar != null) {
                                }
                                ja0 ja0Var2 = this.e1;
                                if (z14) {
                                }
                                if (z12) {
                                }
                                kiVar.Y2.T(6);
                                if (!z15) {
                                }
                            }
                        }
                        z14 = false;
                        if (i7 > 0) {
                            e2Var = kiVar.a2;
                            if (e2Var instanceof org.telegram.ui.an) {
                                z15 = true;
                                if (!z12) {
                                }
                                if (kiVar != null) {
                                }
                                ja0 ja0Var22 = this.e1;
                                if (z14) {
                                }
                                if (z12) {
                                }
                                kiVar.Y2.T(6);
                                if (!z15) {
                                }
                            }
                        }
                        z15 = false;
                        if (!z12) {
                        }
                        if (kiVar != null) {
                        }
                        ja0 ja0Var222 = this.e1;
                        if (z14) {
                        }
                        if (z12) {
                        }
                        kiVar.Y2.T(6);
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
                    if (kiVar != null) {
                    }
                    ja0 ja0Var2222 = this.e1;
                    if (z14) {
                    }
                    if (z12) {
                    }
                    kiVar.Y2.T(6);
                    if (!z15) {
                    }
                } else {
                    q0Var.T(1);
                    z11 = true;
                    if (i7 != 0) {
                    }
                    org.telegram.ui.ActionBar.z0 z0Var5 = this.a1;
                    if (i7 <= 1) {
                    }
                    if (i7 > 0) {
                        if (kiVar != null) {
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
                        if (kiVar != null) {
                        }
                        ja0 ja0Var22222 = this.e1;
                        if (z14) {
                        }
                        if (z12) {
                        }
                        kiVar.Y2.T(6);
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
                    if (kiVar != null) {
                    }
                    ja0 ja0Var222222 = this.e1;
                    if (z14) {
                    }
                    if (z12) {
                    }
                    kiVar.Y2.T(6);
                    if (!z15) {
                    }
                }
            }
        }
        org.telegram.ui.ActionBar.q0 q0Var3 = kiVar.Y2;
        org.telegram.ui.ActionBar.q0 q0Var4 = kiVar.Y2;
        q0Var3.u(0);
        if (i7 == 0) {
            q0Var4.T(4);
            q0Var4.u(1);
        } else if (this.A0 && getStarsPrice() <= 0 && kiVar.F3 == null) {
            q0Var4.T(1);
            z10 = false;
            z11 = true;
            if (i7 != 0) {
            }
            org.telegram.ui.ActionBar.z0 z0Var52 = this.a1;
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
            if (kiVar != null) {
            }
            ja0 ja0Var2222222 = this.e1;
            if (z14) {
            }
            if (z12) {
            }
            kiVar.Y2.T(6);
            if (!z15) {
            }
        } else {
            q0Var4.u(1);
        }
        z10 = false;
        z11 = false;
        if (i7 != 0) {
        }
        org.telegram.ui.ActionBar.z0 z0Var522 = this.a1;
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
        if (kiVar != null) {
        }
        ja0 ja0Var22222222 = this.e1;
        if (z14) {
        }
        if (z12) {
        }
        kiVar.Y2.T(6);
        if (!z15) {
        }
    }

    @Override // org.telegram.ui.Components.ci
    public final boolean H(int i7) {
        if (!this.c0) {
            return false;
        }
        if (i7 != 24 && i7 != 25 && i7 != 79 && i7 != 85) {
            return false;
        }
        ((ol) this.l0.getDelegate()).a();
        return true;
    }

    @Override // org.telegram.ui.Components.ci
    public final void I(ci ciVar) {
        ViewPropertyAnimator viewPropertyAnimator = this.p1;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.x.setVisibility(0);
        boolean z10 = ciVar instanceof im;
        TextView textView = this.y;
        if (z10) {
            ViewPropertyAnimator interpolator = textView.animate().alpha(1.0f).setDuration(150L).setInterpolator(er.j);
            this.p1 = interpolator;
            interpolator.start();
        } else {
            c0();
            textView.setAlpha(1.0f);
        }
        this.b.V2.setTitle("");
        this.G.h1(0, 0);
        if (z10) {
            this.F.post(new od(18, this, ciVar));
        }
        Y();
        p0();
    }

    @Override // org.telegram.ui.Components.ci
    public final void J() {
        this.O = false;
        xl xlVar = this.Q;
        if (xlVar != null) {
            xlVar.setVisibility(0);
        }
        if (this.v0) {
            this.v0 = false;
            X(true);
        }
    }

    @Override // org.telegram.ui.Components.ci
    public final void K() {
        this.F.y0(0);
    }

    public final int T(org.telegram.messenger.ff ffVar, int i7) {
        Integer valueOf = Integer.valueOf(ffVar.C);
        HashMap hashMap = t1;
        boolean containsKey = hashMap.containsKey(valueOf);
        ArrayList arrayList = u1;
        if (containsKey) {
            ffVar.N = 0L;
            ffVar.M = false;
            ffVar.O = null;
            ffVar.z = null;
            hashMap.remove(valueOf);
            int indexOf = arrayList.indexOf(valueOf);
            if (indexOf >= 0) {
                arrayList.remove(indexOf);
            }
            B0(false);
            z0();
            if (i7 >= 0) {
                ffVar.e();
                this.i1.X(i7);
            }
            return indexOf;
        }
        ffVar.N = getStarsPrice();
        ffVar.M = getStarsPrice() > 0;
        ffVar.R = false;
        if (f0()) {
            ffVar.O = Boolean.valueOf(!V());
        }
        ffVar.z = Boolean.valueOf(ffVar.c());
        boolean Z = Z(true);
        hashMap.put(valueOf, ffVar);
        arrayList.add(valueOf);
        if (Z) {
            A0();
            return -1;
        }
        B0(true);
        return -1;
    }

    public final void U() {
        xl xlVar = this.Q;
        if (xlVar != null) {
            if (!this.c0) {
                xlVar.setTranslationX(this.V[0]);
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
            org.telegram.messenger.g0.h3(new od(19, this, layoutParams));
        }
    }

    public final void X(boolean z10) {
        am amVar;
        ki kiVar = this.b;
        boolean z11 = kiVar.Q1;
        org.telegram.ui.ActionBar.e2 e2Var = kiVar.a2;
        if (z11 || !this.n) {
            return;
        }
        boolean z12 = this.O0;
        boolean z13 = this.P0;
        org.telegram.ui.ActionBar.e2 Q = e2Var == null ? LaunchActivity.Q() : e2Var;
        if (Q == null || Q.getParentActivity() == null) {
            return;
        }
        if (org.telegram.messenger.gz.y0) {
            boolean z14 = Q.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0;
            this.P0 = z14;
            if (z14) {
                if (z10) {
                    try {
                        e2Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE"}, 17);
                    } catch (Exception unused) {
                    }
                }
                this.O0 = false;
            } else {
                if (z10 || org.telegram.messenger.gz.P0) {
                    CameraController.getInstance().initCamera(null);
                }
                this.O0 = CameraController.getInstance().isCameraInitied();
            }
        } else {
            this.O0 = false;
        }
        if ((z12 != this.O0 || z13 != this.P0) && (amVar = this.H) != null) {
            amVar.f();
        }
        if (kiVar.Q1 || !kiVar.isShowing() || !this.O0 || ((Paint) kiVar.Z.b).getAlpha() == 0 || this.c0) {
            return;
        }
        v0();
    }

    public final void Y() {
        v4.e1 K;
        float[] fArr;
        if (PhotoViewer.A1() && PhotoViewer.p1().p5 != null && PhotoViewer.p1().p5.W) {
            return;
        }
        xl xlVar = this.Q;
        if (xlVar != null) {
            xlVar.invalidateOutline();
        }
        int i7 = this.N0 - 1;
        ql qlVar = this.F;
        v4.e1 K2 = qlVar.K(i7);
        if (K2 != null) {
            K2.a.invalidateOutline();
        }
        if ((!this.H.d || !this.O0 || this.U0 != this.V0) && (K = qlVar.K(0)) != null) {
            K.a.invalidateOutline();
        }
        xl xlVar2 = this.Q;
        if (xlVar2 != null) {
            xlVar2.invalidate();
        }
        vl vlVar = this.S;
        if (vlVar != null) {
            ((ViewGroup.MarginLayoutParams) vlVar.getLayoutParams()).topMargin = getRootWindowInsets() == null ? org.telegram.messenger.g0.L(16.0f) : getRootWindowInsets().getSystemWindowInsetTop() + org.telegram.messenger.g0.L(2.0f);
        }
        if (this.O0) {
            int childCount = qlVar.getChildCount();
            int i10 = 0;
            while (true) {
                fArr = this.V;
                if (i10 >= childCount) {
                    break;
                }
                View childAt = qlVar.getChildAt(i10);
                if (!(childAt instanceof org.telegram.ui.Cells.k5)) {
                    i10++;
                } else if (childAt.isAttachedToWindow()) {
                    float y10 = getY() + qlVar.getY() + childAt.getY();
                    ki kiVar = this.b;
                    ViewGroup viewGroup = kiVar.b;
                    lh lhVar = kiVar.w3;
                    ai.k0 k0Var = kiVar.M2;
                    float y11 = viewGroup.getY() + y10;
                    float x10 = (kiVar.b.getX() + (getX() + (qlVar.getX() + childAt.getX()))) - getRootWindowInsets().getSystemWindowInsetLeft();
                    float alpha = (k0Var.getAlpha() * k0Var.getMeasuredHeight()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (!kiVar.b2 ? org.telegram.messenger.g0.m : 0);
                    hi.i iVar = kiVar.C4;
                    if (iVar != null && iVar.g()) {
                        alpha = Math.max(alpha, (kiVar.C4.e() + kiVar.C4.getY()) - kiVar.j4);
                    }
                    float f10 = y10 < alpha ? alpha - y10 : 0.0f;
                    if (f10 != this.a0) {
                        this.a0 = f10;
                        xl xlVar3 = this.Q;
                        if (xlVar3 != null) {
                            xlVar3.invalidateOutline();
                            this.Q.invalidate();
                        }
                    }
                    float translationY = (int) (lhVar.getTranslationY() + (kiVar.b.getMeasuredHeight() - lhVar.getMeasuredHeight()));
                    hi.i iVar2 = kiVar.C4;
                    if (iVar2 != null) {
                        translationY -= iVar2.d() - org.telegram.messenger.g0.L(6.0f);
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
                xl xlVar4 = this.Q;
                if (xlVar4 != null) {
                    xlVar4.invalidateOutline();
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
            if (!(obj instanceof org.telegram.messenger.ff)) {
                break;
            }
            T((org.telegram.messenger.ff) obj, -1);
            z11 = true;
        }
        return z11;
    }

    @Override // org.telegram.ui.Components.ci
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
                if (obj3 instanceof org.telegram.messenger.ff) {
                    org.telegram.messenger.ff clone = ((org.telegram.messenger.ff) obj3).clone();
                    CharSequence[] charSequenceArr = {charSequence};
                    clone.n = org.telegram.messenger.si.b0(org.telegram.messenger.m10.t0).W(charSequenceArr, false, true);
                    clone.a = charSequenceArr[0];
                    obj = clone;
                } else {
                    boolean z10 = obj3 instanceof org.telegram.messenger.jf;
                    obj = obj3;
                    if (z10) {
                        org.telegram.messenger.jf clone2 = ((org.telegram.messenger.jf) obj3).clone();
                        CharSequence[] charSequenceArr2 = {charSequence};
                        clone2.n = org.telegram.messenger.si.b0(org.telegram.messenger.m10.t0).W(charSequenceArr2, false, true);
                        clone2.I = charSequenceArr2[0];
                        obj = clone2;
                    }
                }
                hashMap.put(obj2, obj);
            }
            i7++;
        }
    }

    public final boolean a0(org.telegram.messenger.ff ffVar) {
        boolean z10 = this.x0;
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        ki kiVar = this.b;
        if (z10 || !ffVar.b) {
            if (this.y0 || ffVar.b) {
                return false;
            }
            if (!kiVar.N0()) {
                org.telegram.messenger.k5.o(null, 2131749542, new cc(kiVar.p3, e6Var), null);
                return true;
            }
        } else if (!kiVar.N0()) {
            org.telegram.messenger.k5.o(null, 2131749538, new cc(kiVar.p3, e6Var), null);
            return true;
        }
        return true;
    }

    @Override // org.telegram.ui.Components.ci
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

    @Override // org.telegram.ui.Components.ci
    public final boolean c() {
        Iterator it = t1.entrySet().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof org.telegram.messenger.ff) {
                if (((org.telegram.messenger.ff) value).x != 0) {
                    return false;
                }
            } else if ((value instanceof org.telegram.messenger.jf) && ((org.telegram.messenger.jf) value).x != 0) {
                return false;
            }
        }
        return true;
    }

    public final void c0() {
        String M0 = org.telegram.messenger.hd.M0(2131751154, null);
        org.telegram.ui.ActionBar.z0 z0Var = this.Z0;
        z0Var.setText(M0);
        z0Var.setAnimatedIcon(R.raw.photo_spoiler);
        this.b.Y2.T(1);
        HashMap hashMap = t1;
        if (!hashMap.isEmpty()) {
            Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                ((org.telegram.messenger.ff) ((Map.Entry) it.next()).getValue()).e();
            }
            hashMap.clear();
            u1.clear();
        }
        ArrayList arrayList = s1;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) arrayList.get(i7);
                new File(ffVar.I).delete();
                if (ffVar.h != null) {
                    new File(ffVar.h).delete();
                }
                if (ffVar.c != null) {
                    new File(ffVar.c).delete();
                }
            }
            arrayList.clear();
        }
        this.H.f();
        this.w.f();
    }

    @Override // org.telegram.ui.Components.ci
    public final void d() {
        boolean z10 = this.f1;
        int i7 = z10 ? org.telegram.ui.ActionBar.j6.Yg : org.telegram.ui.ActionBar.j6.j5;
        int i10 = org.telegram.ui.ActionBar.j6.c7;
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        this.I.setTextColor(org.telegram.ui.ActionBar.j6.w0(i10, e6Var));
        int i11 = org.telegram.ui.ActionBar.j6.A5;
        ql qlVar = this.F;
        org.telegram.ui.ActionBar.q6.H(qlVar, i11, e6Var);
        qlVar.K(0);
        org.telegram.ui.ActionBar.q6.U(this.y, i7, e6Var);
        int w02 = org.telegram.ui.ActionBar.j6.w0(z10 ? org.telegram.ui.ActionBar.j6.Yg : org.telegram.ui.ActionBar.j6.E8, e6Var);
        hi.u2 u2Var = this.x;
        u2Var.P(w02, false);
        u2Var.P(org.telegram.ui.ActionBar.j6.w0(z10 ? org.telegram.ui.ActionBar.j6.Yg : org.telegram.ui.ActionBar.j6.E8, e6Var), true);
        u2Var.I(org.telegram.ui.ActionBar.j6.w0(z10 ? org.telegram.ui.ActionBar.j6.ah : org.telegram.ui.ActionBar.j6.G8, e6Var));
        org.telegram.ui.ActionBar.j6.C1(org.telegram.ui.ActionBar.j6.w0(i7, e6Var), this.E);
    }

    public final void d0(boolean z10) {
        xl xlVar;
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
        org.telegram.messenger.g0.n3(this.b, ((double) org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.a7, this.a))) > 0.721d);
        TextView textView = this.q0;
        ql qlVar = this.r;
        bi.g2 g2Var = this.k0;
        ql qlVar2 = this.F;
        ImageView[] imageViewArr = this.T;
        s71 s71Var = this.m0;
        if (z10) {
            this.k1 = this.Q.getTranslationY();
            this.e0 = true;
            if (qlVar2 != null) {
                qlVar2.invalidate();
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this, "cameraOpenProgress", 0.0f));
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(g2Var, (Property<bi.g2, Float>) property, 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(s71Var, (Property<s71, Float>) property, 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(qlVar, (Property<ql, Float>) property, 0.0f));
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
            animatorSet.setInterpolator(er.f);
            animatorSet.addListener(new pl(this, 3));
            animatorSet.start();
        } else {
            this.j1 = false;
            setAlertKeepScreenOn(false);
            setCameraOpenProgress(0.0f);
            iArr[0] = 0;
            setCameraOpenProgress(0.0f);
            g2Var.setAlpha(0.0f);
            g2Var.setVisibility(8);
            s71Var.setAlpha(0.0f);
            s71Var.setTag(null);
            s71Var.setVisibility(8);
            qlVar.setAlpha(0.0f);
            textView.setAlpha(0.0f);
            qlVar.setVisibility(8);
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
            xl xlVar2 = this.Q;
            if (xlVar2 != null) {
                xlVar2.setFpsLimit(30);
                this.Q.setSystemUiVisibility(1024);
            }
            if (qlVar2 != null) {
                qlVar2.invalidate();
            }
        }
        xl xlVar3 = this.Q;
        if (xlVar3 != null) {
            xlVar3.setImportantForAccessibility(0);
        }
        qlVar2.setImportantForAccessibility(0);
        if (org.telegram.messenger.qc.e(360928) || (xlVar = this.Q) == null) {
            return;
        }
        xlVar.showTexture(false, z10);
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        ki kiVar;
        if (i7 != org.telegram.messenger.ns.r2) {
            if (i7 == org.telegram.messenger.ns.l4) {
                X(false);
                return;
            }
            return;
        }
        am amVar = this.H;
        if (amVar != null) {
            if (t0()) {
                this.V0 = MediaController.a2;
            } else {
                this.V0 = MediaController.b2;
            }
            if (this.U0 == null || ((kiVar = this.b) != null && kiVar.B1)) {
                this.U0 = this.V0;
            } else if (t0()) {
                int i11 = 0;
                while (true) {
                    if (i11 >= MediaController.c2.size()) {
                        break;
                    }
                    org.telegram.messenger.ve veVar = (org.telegram.messenger.ve) MediaController.c2.get(i11);
                    int i12 = veVar.a;
                    org.telegram.messenger.ve veVar2 = this.U0;
                    if (i12 == veVar2.a && veVar.b == veVar2.b) {
                        this.U0 = veVar;
                        break;
                    }
                    i11++;
                }
            }
            this.Y0 = false;
            this.I.c();
            amVar.f();
            this.w.f();
            ArrayList arrayList = u1;
            if (!arrayList.isEmpty() && this.V0 != null) {
                int size = arrayList.size();
                for (int i13 = 0; i13 < size; i13++) {
                    Integer num = (Integer) arrayList.get(i13);
                    HashMap hashMap = t1;
                    Object obj = hashMap.get(num);
                    org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) this.V0.f.get(num.intValue());
                    if (ffVar != null) {
                        if (obj instanceof org.telegram.messenger.ff) {
                            ffVar.g((org.telegram.messenger.ff) obj);
                        }
                        hashMap.put(num, ffVar);
                    }
                }
            }
            x0();
        }
    }

    public final org.telegram.messenger.ff e0(int i7) {
        if (i7 < 0) {
            return null;
        }
        ArrayList arrayList = s1;
        int size = arrayList.size();
        if (i7 < size) {
            return (org.telegram.messenger.ff) arrayList.get(i7);
        }
        int i10 = i7 - size;
        org.telegram.messenger.ve veVar = this.U0;
        if (veVar == null || i10 >= veVar.e.size()) {
            return null;
        }
        return (org.telegram.messenger.ff) this.U0.e.get(i10);
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
        org.telegram.messenger.g0.i3(new jl(this, 0), 300L);
        this.d0 = false;
    }

    public ArrayList<Object> getAllPhotosArray() {
        org.telegram.messenger.ve veVar = this.U0;
        ArrayList<Object> arrayList = s1;
        if (veVar == null) {
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

    @Override // org.telegram.ui.Components.ci
    public int getButtonsHideOffset() {
        return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + super.getButtonsHideOffset();
    }

    public float getCameraOpenProgress() {
        return this.f0;
    }

    @Override // org.telegram.ui.Components.ci
    public int getCurrentItemTop() {
        ql qlVar = this.F;
        int childCount = qlVar.getChildCount();
        ny nyVar = this.I;
        if (childCount <= 0) {
            qlVar.setTopGlowOffset(qlVar.getPaddingTop());
            nyVar.setTranslationY(0.0f);
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = qlVar.getChildAt(0);
        cj0 cj0Var = (cj0) qlVar.G(childAt);
        int top = childAt.getTop() - this.q1;
        int L = org.telegram.messenger.g0.L(7.0f);
        if (top < org.telegram.messenger.g0.L(7.0f) || cj0Var == null || cj0Var.b() != 0) {
            top = L;
        }
        nyVar.setTranslationY(((((getMeasuredHeight() - top) - org.telegram.messenger.g0.L(50.0f)) - nyVar.getMeasuredHeight()) / 2.0f) + top);
        qlVar.setTopGlowOffset(top);
        return top;
    }

    @Override // org.telegram.ui.Components.ci
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.ci
    public int getListTopPadding() {
        return this.F.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.ci
    public int getSelectedItemsCount() {
        return u1.size();
    }

    public HashMap<Object, Object> getSelectedPhotos() {
        return t1;
    }

    public int getSelectedPhotosCount() {
        int i7 = 0;
        for (Object obj : t1.values()) {
            if (obj instanceof org.telegram.messenger.ff) {
                org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) obj;
                if (!ffVar.b && ffVar.s == null) {
                    i7++;
                }
            }
        }
        return i7;
    }

    public int getSelectedPhotosHighQualityCount() {
        int i7 = 0;
        for (Object obj : t1.values()) {
            if (obj instanceof org.telegram.messenger.ff) {
                org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) obj;
                if (ffVar.c() && !ffVar.b && ffVar.s == null) {
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
            return ((org.telegram.messenger.ff) ((Map.Entry) it.next()).getValue()).N;
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

    @Override // org.telegram.ui.Components.ci
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
        ki kiVar = this.b;
        boolean z10 = kiVar.Q1;
        org.telegram.ui.ActionBar.e2 e2Var = kiVar.a2;
        if (z10) {
            return;
        }
        r1 = true;
        File file = null;
        MediaMetadataRetriever mediaMetadataRetriever3 = null;
        if (i7 == 0) {
            PhotoViewer.p1().I2(e2Var.getParentActivity(), null, this.a);
            PhotoViewer p12 = PhotoViewer.p1();
            int i12 = kiVar.Q3;
            boolean z11 = kiVar.R3;
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
                    org.telegram.messenger.ff ffVar = new org.telegram.messenger.ff(i14, str, ((Integer) N0.first).intValue(), false, i13, i11);
                    ffVar.n(N0);
                    ffVar.L = true;
                    m0(ffVar, false, true);
                    return;
                }
            } catch (Exception unused2) {
                i10 = 0;
            }
            int i132 = i10;
            int i142 = v1;
            v1 = i142 - 1;
            org.telegram.messenger.ff ffVar2 = new org.telegram.messenger.ff(i142, str, ((Integer) N0.first).intValue(), false, i132, i11);
            ffVar2.n(N0);
            ffVar2.L = true;
            m0(ffVar2, false, true);
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
                if (!(e2Var instanceof org.telegram.ui.an) || !((org.telegram.ui.an) e2Var).z()) {
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
                Bitmap r10 = org.telegram.messenger.ez.r(1, str4);
                String str5 = "-2147483648_" + org.telegram.messenger.gz.p() + ".jpg";
                file = org.telegram.messenger.w7.z(4);
                File file2 = new File(file, str5);
                r10.compress(Bitmap.CompressFormat.JPEG, 55, new FileOutputStream(file2));
                org.telegram.messenger.gz.y();
                int i15 = v1;
                v1 = i15 - 1;
                org.telegram.messenger.ff ffVar3 = new org.telegram.messenger.ff(i15, str4, 0, true, r10.getWidth(), r10.getHeight());
                ffVar3.E = (int) r13;
                ffVar3.c = file2.getAbsolutePath();
                m0(ffVar3, false, true);
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
            Bitmap r102 = org.telegram.messenger.ez.r(1, str4);
            String str52 = "-2147483648_" + org.telegram.messenger.gz.p() + ".jpg";
            file = org.telegram.messenger.w7.z(4);
            File file22 = new File(file, str52);
            r102.compress(Bitmap.CompressFormat.JPEG, 55, new FileOutputStream(file22));
            org.telegram.messenger.gz.y();
            int i152 = v1;
            v1 = i152 - 1;
            org.telegram.messenger.ff ffVar32 = new org.telegram.messenger.ff(i152, str4, 0, true, r102.getWidth(), r102.getHeight());
            ffVar32.E = (int) r13;
            ffVar32.c = file22.getAbsolutePath();
            m0(ffVar32, false, true);
        }
    }

    public final void k0(boolean z10) {
        xl xlVar;
        xl xlVar2 = this.Q;
        if (xlVar2 == null || this.P != null) {
            return;
        }
        ki kiVar = this.b;
        if (kiVar.J) {
            return;
        }
        xlVar2.initTexture();
        boolean t02 = t0();
        TextView textView = this.r0;
        int i7 = 0;
        if (t02) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        boolean isEmpty = s1.isEmpty();
        ql qlVar = this.r;
        TextView textView2 = this.q0;
        if (isEmpty) {
            textView2.setVisibility(4);
            qlVar.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            qlVar.setVisibility(0);
        }
        if (kiVar.a1().w && isFocusable()) {
            kiVar.a1().d();
        }
        s71 s71Var = this.m0;
        s71Var.setVisibility(0);
        s71Var.setAlpha(0.0f);
        bi.g2 g2Var = this.k0;
        g2Var.setVisibility(0);
        g2Var.setTag(null);
        int[] iArr = this.g0;
        iArr[0] = 0;
        int i10 = this.L0;
        iArr[1] = i10;
        int i11 = 2;
        iArr[2] = org.telegram.messenger.g0.L(2.0f) + (i10 * 2);
        this.k1 = 0.0f;
        this.j1 = true;
        xl xlVar3 = this.Q;
        if (xlVar3 != null) {
            xlVar3.setFpsLimit(-1);
        }
        org.telegram.messenger.g0.v1(this);
        org.telegram.messenger.g0.n3(kiVar, false);
        setAlertKeepScreenOn(true);
        ql qlVar2 = this.F;
        ImageView[] imageViewArr = this.T;
        if (z10) {
            setCameraOpenProgress(0.0f);
            this.e0 = true;
            if (qlVar2 != null) {
                qlVar2.invalidate();
            }
            this.g1.d();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this, "cameraOpenProgress", 0.0f, 1.0f));
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(g2Var, (Property<bi.g2, Float>) property, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(qlVar, (Property<ql, Float>) property, 1.0f));
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
            animatorSet.setInterpolator(er.f);
            animatorSet.addListener(new pl(this, i11));
            animatorSet.start();
        } else {
            setCameraOpenProgress(1.0f);
            g2Var.setAlpha(1.0f);
            textView2.setAlpha(1.0f);
            qlVar.setAlpha(1.0f);
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
            kiVar.X3.K0();
            xl xlVar4 = this.Q;
            if (xlVar4 != null) {
                xlVar4.setSystemUiVisibility(1028);
            }
        }
        this.c0 = true;
        xl xlVar5 = this.Q;
        if (xlVar5 != null) {
            xlVar5.setImportantForAccessibility(2);
        }
        qlVar2.setImportantForAccessibility(4);
        qlVar2.invalidate();
        if (org.telegram.messenger.qc.e(360928) || (xlVar = this.Q) == null || !xlVar.isInited()) {
            return;
        }
        this.Q.showTexture(true, z10);
    }

    @Override // org.telegram.ui.Components.ci
    public final void l() {
        Y();
        invalidate();
    }

    public final void l0() {
        if (org.telegram.messenger.gz.y0) {
            k0(true);
            return;
        }
        ki kiVar = this.b;
        ii iiVar = kiVar.X3;
        if (iiVar != null) {
            iiVar.y1(0, false, true, 0, 0, 0L, kiVar.f1(), false, 0L);
        }
    }

    @Override // org.telegram.ui.Components.ci
    public final void m(float f10) {
        this.X0 = f10;
        Y();
        xl xlVar = this.Q;
        if (xlVar != null) {
            xlVar.invalidateOutline();
            this.Q.invalidate();
        }
        invalidate();
    }

    public final void m0(org.telegram.messenger.ff ffVar, boolean z10, boolean z11) {
        int i7;
        org.telegram.ui.an anVar;
        org.telegram.ui.an anVar2;
        ArrayList<Object> arrayList;
        int i10;
        ArrayList arrayList2 = s1;
        ki kiVar = this.b;
        if (ffVar != null) {
            int i11 = ffVar.C;
            arrayList2.add(ffVar);
            t1.put(Integer.valueOf(i11), ffVar);
            u1.add(Integer.valueOf(i11));
            kiVar.K1(0);
            this.H.f();
            this.w.f();
        }
        if (ffVar != null && !z11 && arrayList2.size() > 1) {
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
        org.telegram.ui.ActionBar.e2 e2Var = kiVar.a2;
        org.telegram.ui.ActionBar.e2 e2Var2 = kiVar.a2;
        if (e2Var == null) {
            e2Var = LaunchActivity.Q();
        }
        if (e2Var == null) {
            return;
        }
        PhotoViewer.p1().I2(e2Var.getParentActivity(), null, this.a);
        PhotoViewer.p1().J2(kiVar);
        PhotoViewer p12 = PhotoViewer.p1();
        int i12 = kiVar.Q3;
        boolean z12 = kiVar.R3;
        p12.h = i12;
        p12.n = z12;
        if (kiVar.A1 && kiVar.B1) {
            anVar = (org.telegram.ui.an) e2Var2;
            i7 = 11;
        } else {
            if (kiVar.O2 != 0) {
                i7 = 1;
            } else if (e2Var2 instanceof org.telegram.ui.an) {
                anVar = (org.telegram.ui.an) e2Var2;
                i7 = 2;
            } else {
                i7 = 5;
            }
            anVar = null;
        }
        boolean z13 = kiVar.C1;
        if (z13) {
            i7 = 13;
            anVar2 = null;
        } else {
            anVar2 = anVar;
        }
        int i13 = i7;
        if (kiVar.O2 != 0 || z13) {
            arrayList = new ArrayList<>();
            arrayList.add(ffVar);
            i10 = 0;
        } else {
            arrayList = getAllPhotosArray();
            i10 = arrayList2.size() - 1;
        }
        ArrayList<Object> arrayList3 = arrayList;
        k30 k30Var = kiVar.L1;
        if (k30Var != null && ffVar != null) {
            k30Var.e = ffVar.b;
        }
        PhotoViewer.p1().f2(arrayList3, i10, i13, false, new rl(this, z10), anVar2);
        PhotoViewer.p1().v2(kiVar.L1);
        if (kiVar.B1) {
            PhotoViewer.p1().S0(null, null, false, kiVar.E1);
            PhotoViewer.p1().k2();
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

    @Override // org.telegram.ui.Components.ci
    public final boolean o(MotionEvent motionEvent) {
        xl xlVar;
        if (!this.e0) {
            if (this.c0 && motionEvent != null) {
                boolean z10 = this.H0;
                s71 s71Var = this.m0;
                if ((!z10 && motionEvent.getActionMasked() == 0) || motionEvent.getActionMasked() == 5) {
                    Rect rect = this.F0;
                    s71Var.getHitRect(rect);
                    if (s71Var.getTag() == null || !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
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
                    ql qlVar = this.r;
                    TextView textView = this.q0;
                    Property property = View.ALPHA;
                    ImageView[] imageViewArr = this.T;
                    bi.g2 g2Var = this.k0;
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
                                    s71Var.b(false, this.C0);
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
                            } else if (this.J0 && (xlVar = this.Q) != null) {
                                xlVar.setTranslationY(xlVar.getTranslationY() + f11);
                                this.G0 = y10;
                                s71Var.setTag(null);
                                Runnable runnable = this.o0;
                                if (runnable != null) {
                                    org.telegram.messenger.g0.r(runnable);
                                    this.o0 = null;
                                }
                                if (g2Var.getTag() == null) {
                                    g2Var.setTag(1);
                                    AnimatorSet animatorSet = new AnimatorSet();
                                    animatorSet.playTogether(ObjectAnimator.ofFloat(g2Var, (Property<bi.g2, Float>) property, 0.0f), ObjectAnimator.ofFloat(s71Var, (Property<s71, Float>) property, 0.0f), ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f), ObjectAnimator.ofFloat(imageViewArr[0], (Property<ImageView, Float>) property, 0.0f), ObjectAnimator.ofFloat(imageViewArr[1], (Property<ImageView, Float>) property, 0.0f), ObjectAnimator.ofFloat(qlVar, (Property<ql, Float>) property, 0.0f));
                                    animatorSet.setDuration(220L);
                                    animatorSet.setInterpolator(er.f);
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
                            xl xlVar2 = this.Q;
                            if (xlVar2 != null) {
                                if (Math.abs(xlVar2.getTranslationY()) > this.Q.getMeasuredHeight() / 6.0f) {
                                    d0(true);
                                    return true;
                                }
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.Q, (Property<xl, Float>) View.TRANSLATION_Y, 0.0f), ObjectAnimator.ofFloat(g2Var, (Property<bi.g2, Float>) property, 1.0f), ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 1.0f), ObjectAnimator.ofFloat(imageViewArr[0], (Property<ImageView, Float>) property, 1.0f), ObjectAnimator.ofFloat(imageViewArr[1], (Property<ImageView, Float>) property, 1.0f), ObjectAnimator.ofFloat(qlVar, (Property<ql, Float>) property, 1.0f));
                                animatorSet2.setDuration(250L);
                                animatorSet2.setInterpolator(this.j0);
                                animatorSet2.start();
                                g2Var.setTag(null);
                                return true;
                            }
                        } else {
                            xl xlVar3 = this.Q;
                            if (xlVar3 != null && !this.E0) {
                                xlVar3.getLocationOnScreen(this.W);
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
            this.T[i7].animate().alpha(1.0f).translationX(0.0f).setDuration(150L).setInterpolator(er.f).start();
        }
        ViewPropertyAnimator duration = this.s0.animate().alpha(1.0f).translationX(0.0f).setDuration(150L);
        er erVar = er.f;
        duration.setInterpolator(erVar).start();
        this.r0.animate().alpha(1.0f).setDuration(150L).setInterpolator(erVar).start();
        org.telegram.messenger.g0.W3(this.S, false);
        org.telegram.messenger.g0.r(this.i0);
        this.i0 = null;
        org.telegram.messenger.g0.P3(org.telegram.messenger.g0.W(getContext()));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13 = i11 - i7;
        if (this.T0 != i13) {
            this.T0 = i13;
            am amVar = this.H;
            if (amVar != null) {
                amVar.f();
            }
        }
        super.onLayout(z10, i7, i10, i11, i12);
        Y();
    }

    @Override // org.telegram.ui.Components.ci
    public final void p() {
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.l4);
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.r2);
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

    @Override // org.telegram.ui.Components.ci
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

    @Override // org.telegram.ui.Components.ci
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
        if (arrayList == null || arrayList.isEmpty() || i7 >= arrayList.size() || !(arrayList.get(i7) instanceof org.telegram.messenger.ff) || !((org.telegram.messenger.ff) arrayList.get(i7)).M) {
            return;
        }
        final org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) arrayList.get(i7);
        this.F.M(new q0.a() { // from class: org.telegram.ui.Components.kl
            @Override // q0.a
            public final void accept(Object obj) {
                View view = (View) obj;
                boolean z11 = ChatAttachAlertPhotoLayout.r1;
                if (view instanceof org.telegram.ui.Cells.q5) {
                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) view;
                    if (q5Var.getPhotoEntry() == ffVar) {
                        q5Var.c(z10, Float.valueOf(250.0f));
                        q5Var.f(ChatAttachAlertPhotoLayout.this.getStarsPrice(), ChatAttachAlertPhotoLayout.t1.size() > 1);
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
        ki kiVar = this.b;
        float width = kiVar.c.getWidth();
        float height = kiVar.c.getHeight();
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
                org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) ((Map.Entry) it.next()).getValue();
                ffVar.N = j3;
                ffVar.M = j3 > 0;
                ffVar.R = false;
            }
        }
        D(getSelectedItemsCount());
        if (Z(false)) {
            A0();
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        ki kiVar = this.b;
        if (kiVar.B0 == 1) {
            float f11 = (f10 / 40.0f) * (-0.1f);
            ql qlVar = this.F;
            int childCount = qlVar.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = qlVar.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.q5) {
                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                    float f12 = 1.0f + f11;
                    q5Var.getCheckBox().setScaleX(f12);
                    q5Var.getCheckBox().setScaleY(f12);
                }
            }
        }
        super.setTranslationY(f10);
        kiVar.b.invalidate();
        invalidate();
    }

    @Override // org.telegram.ui.Components.ci
    public final void t() {
        xl xlVar = this.Q;
        if (xlVar != null) {
            xlVar.setVisibility(8);
        }
        for (Map.Entry entry : t1.entrySet()) {
            if (entry.getValue() instanceof org.telegram.messenger.ff) {
                ((org.telegram.messenger.ff) entry.getValue()).getClass();
            }
        }
        this.H.f();
    }

    public final boolean t0() {
        if (this.z0) {
            return true;
        }
        ki kiVar = this.b;
        if (kiVar.A1) {
            return false;
        }
        return (kiVar.a2 instanceof org.telegram.ui.an) || kiVar.R2 || kiVar.O2 == 2;
    }

    @Override // org.telegram.ui.Components.ci
    public final void u() {
        this.O = true;
        ql qlVar = this.F;
        int childCount = qlVar.getChildCount();
        int i7 = 0;
        while (true) {
            if (i7 >= childCount) {
                break;
            }
            if (qlVar.getChildAt(i7) instanceof org.telegram.ui.Cells.k5) {
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
        ViewPropertyAnimator withEndAction = this.y.animate().alpha(0.0f).setDuration(150L).setInterpolator(er.j).withEndAction(new jl(this, 3));
        this.p1 = withEndAction;
        withEndAction.start();
        n0();
    }

    public final void u0(s8 s8Var, TLRPC.VideoSize videoSize, long j3) {
        ki kiVar = this.b;
        q8 q8Var = new q8(kiVar.P1, kiVar.L1);
        k30 k30Var = kiVar.L1;
        q8Var.R = k30Var == null || k30Var.c != 2;
        kiVar.a2.presentFragment(q8Var);
        if (s8Var != null) {
            q8Var.r0(s8Var);
        }
        if (videoSize != null) {
            q8Var.q0(videoSize);
        }
        if (j3 != 0) {
            q8Var.p0(j3);
        }
        q8Var.J = new f1(11, this, q8Var);
    }

    @Override // org.telegram.ui.Components.ci
    public final void v(float f10) {
        xl xlVar = this.Q;
        if (xlVar != null) {
            xlVar.setAlpha(f10);
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
        ki kiVar = this.b;
        if (!kiVar.d4 && this.w0 && CameraView.isCameraAllowed()) {
            if (this.Q == null) {
                boolean z10 = !org.telegram.messenger.qc.e(360928);
                Context context = getContext();
                Boolean bool = this.p0;
                xl xlVar = new xl(this, context, bool != null ? bool.booleanValue() : kiVar.S3, z10);
                this.Q = xlVar;
                org.telegram.ui.ActionBar.e2 e2Var = kiVar.a2;
                xlVar.setRecordFile(org.telegram.messenger.g0.s0((e2Var instanceof org.telegram.ui.an) && ((org.telegram.ui.an) e2Var).z()));
                this.Q.setFocusable(true);
                this.Q.setFpsLimit(30);
                this.Q.setOutlineProvider(new fh.a(this, 2));
                this.Q.setClipToOutline(true);
                this.Q.setContentDescription(org.telegram.messenger.hd.M0(2131754852, null));
                org.telegram.ui.ActionBar.k2 k2Var = kiVar.c;
                xl xlVar2 = this.Q;
                int i7 = this.L0;
                k2Var.addView(xlVar2, 1, new FrameLayout.LayoutParams(i7, i7));
                this.Q.setDelegate(new sl(this));
                this.Q.setAlpha(this.w0 ? 1.0f : 0.2f);
                this.Q.setEnabled(this.w0);
                if (this.O) {
                    this.Q.setVisibility(8);
                }
                if (!this.c0) {
                    Y();
                }
                ql qlVar = this.F;
                if (qlVar != null) {
                    qlVar.invalidate();
                }
                invalidate();
            }
            s71 s71Var = this.m0;
            if (s71Var != null) {
                s71Var.b(false, 0.0f);
                this.C0 = 0.0f;
            }
            if (this.c0) {
                return;
            }
            this.Q.setTranslationX(this.V[0]);
        }
    }

    @Override // org.telegram.ui.Components.ci
    public final void w(int i7) {
        TLRPC.Chat Y0;
        boolean z10;
        boolean z11;
        char c10 = 1;
        char c11 = 1;
        char c12 = 1;
        char c13 = 1;
        ki kiVar = this.b;
        if (i7 == 8) {
            kiVar.v1(!kiVar.X1, true);
            this.e1.a(!kiVar.X1, true);
            return;
        }
        if ((i7 == 0 || i7 == 1) && kiVar.Q3 > 0 && u1.size() > 1 && (Y0 = kiVar.Y0()) != null && !org.telegram.messenger.t3.N(Y0) && Y0.slowmode_enabled) {
            t4.L(getContext(), org.telegram.messenger.hd.M0(2131745310, null), org.telegram.messenger.hd.M0(2131745302, null), null, null, this.a).p();
            return;
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        HashMap hashMap = t1;
        final int i10 = 0;
        if (i7 == 0) {
            org.telegram.messenger.gj gjVar = kiVar.F3;
            org.telegram.ui.ActionBar.e2 e2Var = kiVar.a2;
            if (gjVar == null && (e2Var instanceof org.telegram.ui.an) && ((org.telegram.ui.an) e2Var).c()) {
                t4.J(getContext(), ((org.telegram.ui.an) e2Var).a(), new fl(this, i10), e6Var);
                return;
            } else {
                t4.X(kiVar.H3, kiVar.X0() + hashMap.size(), kiVar.b1(), new org.telegram.messenger.z10(this) { // from class: org.telegram.ui.Components.gl
                    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.messenger.z10
                    public final void a(Object obj) {
                        int i11 = i10;
                        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                        Long l10 = (Long) obj;
                        switch (i11) {
                            case 0:
                                boolean z12 = ChatAttachAlertPhotoLayout.r1;
                                ki kiVar2 = chatAttachAlertPhotoLayout.b;
                                kiVar2.M0();
                                kiVar2.X3.y1(7, false, true, 0, 0, 0L, kiVar2.f1(), false, l10.longValue());
                                break;
                            default:
                                boolean z13 = ChatAttachAlertPhotoLayout.r1;
                                ki kiVar3 = chatAttachAlertPhotoLayout.b;
                                kiVar3.M0();
                                kiVar3.X3.y1(4, true, true, 0, 0, 0L, kiVar3.f1(), false, l10.longValue());
                                break;
                        }
                    }
                });
                return;
            }
        }
        if (i7 == 1) {
            org.telegram.messenger.gj gjVar2 = kiVar.F3;
            org.telegram.ui.ActionBar.e2 e2Var2 = kiVar.a2;
            if (gjVar2 == null && (e2Var2 instanceof org.telegram.ui.an) && ((org.telegram.ui.an) e2Var2).c()) {
                t4.J(getContext(), ((org.telegram.ui.an) e2Var2).a(), new fl(this, c13 == true ? 1 : 0), e6Var);
                return;
            }
            int i11 = kiVar.H3;
            long b12 = kiVar.b1();
            int X0 = kiVar.X0() + hashMap.size();
            final char c14 = c12 == true ? 1 : 0;
            t4.X(i11, X0, b12, new org.telegram.messenger.z10(this) { // from class: org.telegram.ui.Components.gl
                public final /* synthetic */ ChatAttachAlertPhotoLayout b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.z10
                public final void a(Object obj) {
                    int i112 = c14;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                    Long l10 = (Long) obj;
                    switch (i112) {
                        case 0:
                            boolean z12 = ChatAttachAlertPhotoLayout.r1;
                            ki kiVar2 = chatAttachAlertPhotoLayout.b;
                            kiVar2.M0();
                            kiVar2.X3.y1(7, false, true, 0, 0, 0L, kiVar2.f1(), false, l10.longValue());
                            break;
                        default:
                            boolean z13 = ChatAttachAlertPhotoLayout.r1;
                            ki kiVar3 = chatAttachAlertPhotoLayout.b;
                            kiVar3.M0();
                            kiVar3.X3.y1(4, true, true, 0, 0, 0L, kiVar3.f1(), false, l10.longValue());
                            break;
                    }
                }
            });
            return;
        }
        am amVar = this.H;
        ql qlVar = this.F;
        if (i7 == 3) {
            im imVar = kiVar.l2;
            if (imVar != null) {
                imVar.P();
            }
            Iterator it = hashMap.entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((org.telegram.messenger.ff) ((Map.Entry) it.next()).getValue()).M) {
                        z11 = true;
                        break;
                    }
                } else {
                    z11 = false;
                    break;
                }
            }
            final boolean z12 = !z11;
            org.telegram.messenger.g0.i3(new Runnable(this) { // from class: org.telegram.ui.Components.hl
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
                            ki kiVar2 = chatAttachAlertPhotoLayout.b;
                            org.telegram.ui.ActionBar.z0 z0Var = chatAttachAlertPhotoLayout.Z0;
                            z0Var.setText(org.telegram.messenger.hd.M0(z13 ? 2131751430 : 2131751154, null));
                            if (z13) {
                                z0Var.setIcon(R.drawable.msg_spoiler_off);
                            } else {
                                z0Var.setAnimatedIcon(R.raw.photo_spoiler);
                            }
                            if (!z13) {
                                kiVar2.Y2.T(1);
                                if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                    kiVar2.Y2.T(6);
                                    break;
                                }
                            } else {
                                kiVar2.Y2.u(1);
                                if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                    kiVar2.Y2.u(6);
                                    break;
                                }
                            }
                            break;
                        default:
                            org.telegram.ui.ActionBar.z0 z0Var2 = chatAttachAlertPhotoLayout.b1;
                            z0Var2.setText(org.telegram.messenger.hd.M0(z13 ? 2131745620 : 2131745621, null));
                            if (!z13) {
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
                if (entry.getValue() instanceof org.telegram.messenger.ff) {
                    org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) entry.getValue();
                    ffVar.M = z12;
                    ffVar.R = false;
                    arrayList.add(Integer.valueOf(ffVar.C));
                }
            }
            qlVar.M(new il(i10, arrayList, z12));
            if (kiVar.w2 != this) {
                amVar.f();
            }
            im imVar2 = kiVar.l2;
            if (imVar2 != null) {
                imVar2.w.invalidate();
                return;
            }
            return;
        }
        if (i7 == 2) {
            im imVar3 = kiVar.l2;
            if (imVar3 != null) {
                imVar3.P();
            }
            Iterator it2 = hashMap.entrySet().iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((org.telegram.messenger.ff) ((Map.Entry) it2.next()).getValue()).c()) {
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
            org.telegram.messenger.g0.i3(new Runnable(this) { // from class: org.telegram.ui.Components.hl
                public final /* synthetic */ ChatAttachAlertPhotoLayout b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i12 = c15;
                    boolean z132 = z13;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                    switch (i12) {
                        case 0:
                            boolean z14 = ChatAttachAlertPhotoLayout.r1;
                            ki kiVar2 = chatAttachAlertPhotoLayout.b;
                            org.telegram.ui.ActionBar.z0 z0Var = chatAttachAlertPhotoLayout.Z0;
                            z0Var.setText(org.telegram.messenger.hd.M0(z132 ? 2131751430 : 2131751154, null));
                            if (z132) {
                                z0Var.setIcon(R.drawable.msg_spoiler_off);
                            } else {
                                z0Var.setAnimatedIcon(R.raw.photo_spoiler);
                            }
                            if (!z132) {
                                kiVar2.Y2.T(1);
                                if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                    kiVar2.Y2.T(6);
                                    break;
                                }
                            } else {
                                kiVar2.Y2.u(1);
                                if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                    kiVar2.Y2.u(6);
                                    break;
                                }
                            }
                            break;
                        default:
                            org.telegram.ui.ActionBar.z0 z0Var2 = chatAttachAlertPhotoLayout.b1;
                            z0Var2.setText(org.telegram.messenger.hd.M0(z132 ? 2131745620 : 2131745621, null));
                            if (!z132) {
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
                if (entry2.getValue() instanceof org.telegram.messenger.ff) {
                    org.telegram.messenger.ff ffVar2 = (org.telegram.messenger.ff) entry2.getValue();
                    ffVar2.z = Boolean.valueOf(z13);
                    ffVar2.R = false;
                    arrayList2.add(Integer.valueOf(ffVar2.C));
                }
            }
            qlVar.M(new il(c10 == true ? 1 : 0, arrayList2, z13));
            if (kiVar.w2 != this) {
                amVar.f();
            }
            im imVar4 = kiVar.l2;
            if (imVar4 != null) {
                imVar4.w.invalidate();
                return;
            }
            return;
        }
        if (i7 != 4) {
            if (i7 == 7) {
                kiVar.O1(kiVar.w2 != kiVar.l2);
                return;
            }
            if (i7 == 9) {
                di.lb.j1(getContext(), getStarsPrice(), true, new d(this, 6), this.a);
                return;
            }
            if (i7 >= 10) {
                org.telegram.messenger.ve veVar = (org.telegram.messenger.ve) this.W0.get(i7 - 10);
                this.U0 = veVar;
                org.telegram.messenger.ve veVar2 = this.V0;
                TextView textView = this.y;
                if (veVar == veVar2) {
                    textView.setText(org.telegram.messenger.hd.M0(2131752238, null));
                } else {
                    textView.setText(veVar.c);
                }
                amVar.f();
                this.w.f();
                this.G.h1(0, -(qlVar.getPaddingTop() - getTopScrollOffset()));
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
                int i12 = kiVar.O2;
                org.telegram.ui.ActionBar.e2 e2Var3 = kiVar.a2;
                if (i12 != 0) {
                    e2Var3.startActivityForResult(createChooser, 14);
                } else {
                    e2Var3.startActivityForResult(createChooser, 1);
                }
            } else {
                Intent intent3 = new Intent("android.intent.action.PICK");
                intent3.setType("image/*");
                int i13 = kiVar.O2;
                org.telegram.ui.ActionBar.e2 e2Var4 = kiVar.a2;
                if (i13 != 0) {
                    e2Var4.startActivityForResult(intent3, 14);
                } else {
                    e2Var4.startActivityForResult(intent3, 1);
                }
            }
            kiVar.a(true);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void w0(boolean z10) {
        s71 s71Var = this.m0;
        int i7 = 1;
        if ((s71Var.getTag() != null && z10) || (s71Var.getTag() == null && !z10)) {
            if (z10) {
                Runnable runnable = this.o0;
                if (runnable != null) {
                    org.telegram.messenger.g0.r(runnable);
                }
                jl jlVar = new jl(this, i7);
                this.o0 = jlVar;
                org.telegram.messenger.g0.i3(jlVar, 2000L);
                return;
            }
            return;
        }
        AnimatorSet animatorSet = this.n0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        s71Var.setTag(z10 ? 1 : null);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.n0 = animatorSet2;
        animatorSet2.setDuration(180L);
        this.n0.playTogether(ObjectAnimator.ofFloat(s71Var, (Property<s71, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
        this.n0.addListener(new pl(this, i7));
        this.n0.start();
        if (z10) {
            jl jlVar2 = new jl(this, 2);
            this.o0 = jlVar2;
            org.telegram.messenger.g0.i3(jlVar2, 2000L);
        }
    }

    @Override // org.telegram.ui.Components.ci
    public final void x() {
        ki kiVar = this.b;
        X(kiVar != null && (kiVar.a2 instanceof org.telegram.ui.an));
    }

    public final void x0() {
        hi.u2 u2Var = this.x;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = u2Var.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        if (this.w0) {
            ArrayList arrayList = t0() ? MediaController.c2 : MediaController.d2;
            ArrayList arrayList2 = new ArrayList(arrayList);
            this.W0 = arrayList2;
            Collections.sort(arrayList2, new ll(arrayList, 0));
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
            org.telegram.messenger.ve veVar = (org.telegram.messenger.ve) this.W0.get(i7);
            hi.a aVar = new hi.a(getContext(), veVar.d, veVar.c, veVar.e.size(), this.a);
            u2Var.getPopupLayout().addView(aVar);
            aVar.setOnClickListener(new ci.q(this, i7 + 10, 11));
        }
    }

    public final void y0() {
        ql qlVar = this.F;
        if (qlVar != null) {
            for (int i7 = 0; i7 < qlVar.getChildCount(); i7++) {
                View childAt = qlVar.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.q5) {
                    ((org.telegram.ui.Cells.q5) childAt).a.invalidate();
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.ci
    public final void z(int i7, boolean z10) {
        Y();
        xl xlVar = this.Q;
        if (xlVar != null) {
            xlVar.invalidateOutline();
            this.Q.invalidate();
        }
    }

    public final void z0() {
        ArrayList arrayList;
        if (this.b.a2 instanceof org.telegram.ui.an) {
            ql qlVar = this.F;
            int childCount = qlVar.getChildCount();
            int i7 = 0;
            while (true) {
                arrayList = u1;
                if (i7 >= childCount) {
                    break;
                }
                View childAt = qlVar.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.q5) {
                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                    org.telegram.messenger.ff e02 = e0(((Integer) q5Var.getTag()).intValue());
                    if (e02 != null) {
                        q5Var.setNum(arrayList.indexOf(Integer.valueOf(e02.C)));
                    }
                }
                i7++;
            }
            ql qlVar2 = this.r;
            int childCount2 = qlVar2.getChildCount();
            for (int i10 = 0; i10 < childCount2; i10++) {
                View childAt2 = qlVar2.getChildAt(i10);
                if (childAt2 instanceof org.telegram.ui.Cells.q5) {
                    org.telegram.ui.Cells.q5 q5Var2 = (org.telegram.ui.Cells.q5) childAt2;
                    org.telegram.messenger.ff e03 = e0(((Integer) q5Var2.getTag()).intValue());
                    if (e03 != null) {
                        q5Var2.setNum(arrayList.indexOf(Integer.valueOf(e03.C)));
                    }
                }
            }
        }
    }
}
