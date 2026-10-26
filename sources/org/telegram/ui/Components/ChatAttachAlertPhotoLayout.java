package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public class ChatAttachAlertPhotoLayout extends li implements NotificationCenter.NotificationCenterDelegate {
    public static boolean q1;
    public static final ArrayList r1 = new ArrayList();
    public static final HashMap s1 = new HashMap();
    public static final ArrayList t1 = new ArrayList();
    public static int u1 = -1;
    public float A0;
    public float B0;
    public boolean C0;
    public boolean D0;
    public final fm E;
    public final Rect E0;
    public final ei.k F;
    public float F0;
    public final tm G;
    public boolean G0;
    public final uz H;
    public boolean H0;
    public final qm0 I;
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
    public pm P;
    public boolean P0;
    public final qm Q;
    public boolean Q0;
    public final nm R;
    public boolean R0;
    public final ImageView[] S;
    public int S0;
    public boolean T;
    public MediaController.AlbumEntry T0;
    public final float[] U;
    public MediaController.AlbumEntry U0;
    public final int[] V;
    public ArrayList V0;
    public float W;
    public float W0;
    public boolean X0;
    public final org.telegram.ui.ActionBar.g1 Y0;
    public final org.telegram.ui.ActionBar.g1 Z0;
    public float a0;
    public final org.telegram.ui.ActionBar.g1 a1;
    public boolean b0;
    public final org.telegram.ui.ActionBar.g1 b1;
    public boolean c0;
    public final org.telegram.ui.ActionBar.g1 c1;
    public boolean d0;
    public final mc0 d1;
    public float e0;
    public final boolean e1;
    public final int[] f0;
    public final AnimationNotificationsLocker f1;
    public int g0;
    public boolean g1;
    public cm h0;
    public final jm h1;
    public final DecelerateInterpolator i0;
    public boolean i1;
    public final bh.r j0;
    public float j1;
    public final ShutterButton k0;
    public float k1;
    public final fc1 l0;
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
    public final fm r;
    public final ImageView r0;
    public final ig.a0 s;
    public boolean s0;
    public boolean t0;
    public boolean u0;
    public final tm v;
    public boolean v0;
    public final km w;
    public boolean w0;
    public final TextView x;
    public boolean x0;
    public final Drawable y;
    public boolean y0;
    public boolean z0;

    /* JADX WARN: Multi-variable type inference failed */
    public ChatAttachAlertPhotoLayout(ti tiVar, Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var, tiVar);
        this.S = new ImageView[2];
        this.U = new float[2];
        this.V = new int[2];
        this.f0 = new int[5];
        this.i0 = new DecelerateInterpolator(1.5f);
        this.o0 = null;
        this.E0 = new Rect();
        int dp = AndroidUtilities.dp(80.0f);
        this.K0 = dp;
        this.L0 = dp;
        this.M0 = 3;
        this.X0 = true;
        this.f1 = new AnimationNotificationsLocker();
        this.h1 = new jm(this);
        this.e1 = z10;
        this.n = z11;
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.cameraInitied);
        org.telegram.ui.ActionBar.h3 container = tiVar.getContainer();
        ti tiVar2 = this.b;
        int i10 = 0;
        this.g1 = tiVar2.T0 != 0;
        km kmVar = new km(this, context, tiVar2.a1.l(), u6Var, 0);
        this.w = kmVar;
        kmVar.setSubMenuOpenSide(1);
        FrameLayout.LayoutParams h = gb1.h(-2, -1.0f, 51, 60.0f, 0.0f, 40.0f, 0.0f);
        h.topMargin = AndroidUtilities.statusBarHeight;
        this.b.a1.addView(kmVar, 0, h);
        final int i11 = 3;
        kmVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.tl
            public final /* synthetic */ ChatAttachAlertPhotoLayout b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                pm pmVar;
                pm pmVar2;
                int i12 = i11;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                switch (i12) {
                    case 0:
                        if (chatAttachAlertPhotoLayout.P != null) {
                            chatAttachAlertPhotoLayout.j0(null, false, false);
                            CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.P.getCameraSessionObject());
                            break;
                        }
                        break;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.s0 && (pmVar = chatAttachAlertPhotoLayout.P) != null && pmVar.isInited()) {
                            chatAttachAlertPhotoLayout.c0 = false;
                            chatAttachAlertPhotoLayout.P.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.r0, (Property<ImageView, Float>) View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new em(chatAttachAlertPhotoLayout));
                            duration.start();
                            break;
                        }
                        break;
                    case 2:
                        if (!chatAttachAlertPhotoLayout.T && (pmVar2 = chatAttachAlertPhotoLayout.P) != null && pmVar2.isInited() && chatAttachAlertPhotoLayout.b0) {
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
                                ChatAttachAlertPhotoLayout.o0(imageView, nextFlashMode);
                                AnimatorSet animatorSet = new AnimatorSet();
                                Property property = View.TRANSLATION_Y;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 0.0f, AndroidUtilities.dp(48.0f));
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, -AndroidUtilities.dp(48.0f), 0.0f);
                                Property property2 = View.ALPHA;
                                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property2, 0.0f, 1.0f));
                                animatorSet.setDuration(220L);
                                animatorSet.setInterpolator(ds.f);
                                animatorSet.addListener(new di.o3(chatAttachAlertPhotoLayout, view, imageView, 3));
                                animatorSet.start();
                                break;
                            }
                        }
                        break;
                    default:
                        chatAttachAlertPhotoLayout.w.U(null, null);
                        break;
                }
            }
        });
        TextView textView = new TextView(context);
        this.x = textView;
        textView.setImportantForAccessibility(2);
        textView.setGravity(3);
        textView.setSingleLine(true);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        int i12 = org.telegram.ui.ActionBar.y6.j5;
        org.telegram.ui.ActionBar.f7.V(textView, i12, u6Var);
        textView.setText(LocaleController.getString(R.string.ChatGallery));
        textView.setTypeface(AndroidUtilities.bold());
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_arrow_drop_down).mutate();
        this.y = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.f7.y(this, mutate, i12, u6Var, mode);
        textView.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
        kmVar.addView(textView, gb1.h(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
        U(false);
        mc0 mc0Var = new mc0(context, R.raw.position_below, LocaleController.getString(R.string.CaptionAbove), R.raw.position_above, LocaleController.getString(R.string.CaptionBelow), u6Var);
        this.d1 = mc0Var;
        mc0Var.a(!this.b.c0, false);
        this.c1 = this.b.d1.e(7, R.drawable.msg_view_file, LocaleController.getString(R.string.AttachMediaPreviewButton));
        this.b.d1.a(5);
        this.b.d1.e(4, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp));
        this.Z0 = this.b.d1.e(1, R.drawable.msg_filehq, LocaleController.getString(R.string.SendWithoutCompression));
        this.b.d1.e(0, R.drawable.msg_ungroup, LocaleController.getString(R.string.SendWithoutGrouping));
        this.b.d1.a(6);
        this.Y0 = this.b.d1.e(3, R.drawable.msg_spoiler, LocaleController.getString(R.string.EnablePhotoSpoiler));
        this.a1 = this.b.d1.e(2, R.drawable.menu_quality_hd, LocaleController.getString(R.string.SendInHighQuality));
        org.telegram.ui.ActionBar.w0 w0Var = this.b.d1;
        w0Var.p();
        mc0Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
        mc0Var.setTag(8);
        w0Var.b.addView(mc0Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) mc0Var.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(48.0f);
        mc0Var.setLayoutParams(layoutParams);
        mc0Var.setOnClickListener(new org.telegram.ui.ActionBar.b0(w0Var, 2));
        this.b1 = this.b.d1.e(9, R.drawable.menu_feature_paid, LocaleController.getString(R.string.PaidMediaButton));
        this.b.d1.setFitSubItems(true);
        fm fmVar = new fm(this, context, u6Var, 1);
        this.E = fmVar;
        fmVar.setFastScrollEnabled(1);
        fmVar.setFastScrollVisible(true);
        fmVar.getFastScroll().setAlpha(0.0f);
        fmVar.getFastScroll().a = false;
        fmVar.getFastScroll().h0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        tm tmVar = new tm(this, context, z11);
        this.G = tmVar;
        fmVar.setAdapter(tmVar);
        qm qmVar = new qm(this, fmVar);
        this.Q = qmVar;
        fmVar.i(qmVar);
        for (int i13 = 0; i13 < 8; i13++) {
            tmVar.h.add(tmVar.L());
        }
        fmVar.setClipToPadding(false);
        fmVar.setItemAnimator(null);
        fmVar.setLayoutAnimation(null);
        fmVar.setVerticalScrollBarEnabled(false);
        org.telegram.ui.ActionBar.f7.m(fmVar, 21, org.telegram.ui.ActionBar.y6.A5, u6Var);
        addView(fmVar, gb1.h(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, -48.0f));
        fmVar.setOnScrollListener(new fi.a9(1, this));
        ei.k kVar = new ei.k(this, this.K0, 2);
        this.F = kVar;
        kVar.O = new ai.l(this, 5);
        fmVar.setLayoutManager(kVar);
        fmVar.setOnItemClickListener(new bi.z3(this, z11, u6Var, 7));
        fmVar.setOnItemLongClickListener(new ul(this, 3));
        qm0 qm0Var = new qm0(new mm(this));
        this.I = qm0Var;
        fmVar.E.add(qm0Var);
        setBlur3Capture(fmVar);
        this.d = fmVar;
        this.f = true;
        uz uzVar = new uz(context, u6Var);
        this.H = uzVar;
        uzVar.setText(LocaleController.getString(R.string.NoPhotos));
        uzVar.setOnTouchListener(null);
        uzVar.setTextSize(16);
        addView(uzVar, gb1.g(-2.0f, -1));
        if (this.X0) {
            uzVar.b();
        } else {
            uzVar.c();
        }
        Paint paint = new Paint(1);
        paint.setColor(-2468275);
        nm nmVar = new nm(context, paint);
        this.R = nmVar;
        AndroidUtilities.updateViewVisibilityAnimated(nmVar, false, 1.0f, false);
        nmVar.setBackgroundResource(R.drawable.system);
        nmVar.getBackground().setColorFilter(new PorterDuffColorFilter(1711276032, mode));
        nmVar.setTextSize(1, 15.0f);
        nmVar.setTypeface(AndroidUtilities.bold());
        nmVar.setAlpha(0.0f);
        nmVar.setTextColor(-1);
        nmVar.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f));
        container.addView(nmVar, gb1.h(-2, -2.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
        bh.r rVar = new bh.r(this, context, 13);
        this.j0 = rVar;
        rVar.setVisibility(8);
        rVar.setAlpha(0.0f);
        container.addView(rVar, gb1.i(-1, 126, 83));
        TextView textView2 = new TextView(context);
        this.p0 = textView2;
        textView2.setBackgroundResource(R.drawable.photos_rounded);
        textView2.setVisibility(8);
        textView2.setTextColor(-1);
        textView2.setGravity(17);
        textView2.setPivotX(0.0f);
        textView2.setPivotY(0.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.photos_arrow, 0);
        textView2.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
        textView2.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        container.addView(textView2, gb1.h(-2, 38.0f, 51, 0.0f, 0.0f, 0.0f, 116.0f));
        final int i14 = 0;
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.tl
            public final /* synthetic */ ChatAttachAlertPhotoLayout b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                pm pmVar;
                pm pmVar2;
                int i122 = i14;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                switch (i122) {
                    case 0:
                        if (chatAttachAlertPhotoLayout.P != null) {
                            chatAttachAlertPhotoLayout.j0(null, false, false);
                            CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.P.getCameraSessionObject());
                            break;
                        }
                        break;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.s0 && (pmVar = chatAttachAlertPhotoLayout.P) != null && pmVar.isInited()) {
                            chatAttachAlertPhotoLayout.c0 = false;
                            chatAttachAlertPhotoLayout.P.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.r0, (Property<ImageView, Float>) View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new em(chatAttachAlertPhotoLayout));
                            duration.start();
                            break;
                        }
                        break;
                    case 2:
                        if (!chatAttachAlertPhotoLayout.T && (pmVar2 = chatAttachAlertPhotoLayout.P) != null && pmVar2.isInited() && chatAttachAlertPhotoLayout.b0) {
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
                                ChatAttachAlertPhotoLayout.o0(imageView, nextFlashMode);
                                AnimatorSet animatorSet = new AnimatorSet();
                                Property property = View.TRANSLATION_Y;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 0.0f, AndroidUtilities.dp(48.0f));
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, -AndroidUtilities.dp(48.0f), 0.0f);
                                Property property2 = View.ALPHA;
                                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property2, 0.0f, 1.0f));
                                animatorSet.setDuration(220L);
                                animatorSet.setInterpolator(ds.f);
                                animatorSet.addListener(new di.o3(chatAttachAlertPhotoLayout, view, imageView, 3));
                                animatorSet.start();
                                break;
                            }
                        }
                        break;
                    default:
                        chatAttachAlertPhotoLayout.w.U(null, null);
                        break;
                }
            }
        });
        fc1 fc1Var = new fc1(context);
        this.l0 = fc1Var;
        fc1Var.setVisibility(8);
        fc1Var.setAlpha(0.0f);
        container.addView(fc1Var, gb1.h(-2, 50.0f, 51, 0.0f, 0.0f, 0.0f, 116.0f));
        fc1Var.setDelegate(new ul(this, i14));
        ShutterButton shutterButton = new ShutterButton(context);
        shutterButton.b = new DecelerateInterpolator();
        shutterButton.w = new m.g3(shutterButton, 28);
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
        shutterButton.f = gw0.a;
        this.k0 = shutterButton;
        rVar.addView(shutterButton, gb1.i(84, 84, 17));
        shutterButton.setDelegate(new dm(this, u6Var, container));
        shutterButton.setFocusable(true);
        shutterButton.setContentDescription(LocaleController.getString(R.string.AccDescrShutter));
        ImageView imageView = new ImageView(context);
        this.r0 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        rVar.addView(imageView, gb1.i(48, 48, 21));
        final int i15 = 1;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.tl
            public final /* synthetic */ ChatAttachAlertPhotoLayout b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                pm pmVar;
                pm pmVar2;
                int i122 = i15;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                switch (i122) {
                    case 0:
                        if (chatAttachAlertPhotoLayout.P != null) {
                            chatAttachAlertPhotoLayout.j0(null, false, false);
                            CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.P.getCameraSessionObject());
                            break;
                        }
                        break;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.s0 && (pmVar = chatAttachAlertPhotoLayout.P) != null && pmVar.isInited()) {
                            chatAttachAlertPhotoLayout.c0 = false;
                            chatAttachAlertPhotoLayout.P.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.r0, (Property<ImageView, Float>) View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new em(chatAttachAlertPhotoLayout));
                            duration.start();
                            break;
                        }
                        break;
                    case 2:
                        if (!chatAttachAlertPhotoLayout.T && (pmVar2 = chatAttachAlertPhotoLayout.P) != null && pmVar2.isInited() && chatAttachAlertPhotoLayout.b0) {
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
                                ChatAttachAlertPhotoLayout.o0(imageView2, nextFlashMode);
                                AnimatorSet animatorSet = new AnimatorSet();
                                Property property = View.TRANSLATION_Y;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 0.0f, AndroidUtilities.dp(48.0f));
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, -AndroidUtilities.dp(48.0f), 0.0f);
                                Property property2 = View.ALPHA;
                                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 0.0f, 1.0f));
                                animatorSet.setDuration(220L);
                                animatorSet.setInterpolator(ds.f);
                                animatorSet.addListener(new di.o3(chatAttachAlertPhotoLayout, view, imageView2, 3));
                                animatorSet.start();
                                break;
                            }
                        }
                        break;
                    default:
                        chatAttachAlertPhotoLayout.w.U(null, null);
                        break;
                }
            }
        });
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        for (int i16 = 0; i16 < 2; i16++) {
            this.S[i16] = new ImageView(context);
            this.S[i16].setScaleType(ImageView.ScaleType.CENTER);
            this.S[i16].setVisibility(4);
            this.j0.addView(this.S[i16], gb1.i(48, 48, 51));
            final int i17 = 2;
            this.S[i16].setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.tl
                public final /* synthetic */ ChatAttachAlertPhotoLayout b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    pm pmVar;
                    pm pmVar2;
                    int i122 = i17;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                    switch (i122) {
                        case 0:
                            if (chatAttachAlertPhotoLayout.P != null) {
                                chatAttachAlertPhotoLayout.j0(null, false, false);
                                CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.P.getCameraSessionObject());
                                break;
                            }
                            break;
                        case 1:
                            if (!chatAttachAlertPhotoLayout.s0 && (pmVar = chatAttachAlertPhotoLayout.P) != null && pmVar.isInited()) {
                                chatAttachAlertPhotoLayout.c0 = false;
                                chatAttachAlertPhotoLayout.P.switchCamera();
                                ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.r0, (Property<ImageView, Float>) View.SCALE_X, 0.0f).setDuration(100L);
                                duration.addListener(new em(chatAttachAlertPhotoLayout));
                                duration.start();
                                break;
                            }
                            break;
                        case 2:
                            if (!chatAttachAlertPhotoLayout.T && (pmVar2 = chatAttachAlertPhotoLayout.P) != null && pmVar2.isInited() && chatAttachAlertPhotoLayout.b0) {
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
                                    ChatAttachAlertPhotoLayout.o0(imageView2, nextFlashMode);
                                    AnimatorSet animatorSet = new AnimatorSet();
                                    Property property = View.TRANSLATION_Y;
                                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 0.0f, AndroidUtilities.dp(48.0f));
                                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, -AndroidUtilities.dp(48.0f), 0.0f);
                                    Property property2 = View.ALPHA;
                                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 0.0f, 1.0f));
                                    animatorSet.setDuration(220L);
                                    animatorSet.setInterpolator(ds.f);
                                    animatorSet.addListener(new di.o3(chatAttachAlertPhotoLayout, view, imageView2, 3));
                                    animatorSet.start();
                                    break;
                                }
                            }
                            break;
                        default:
                            chatAttachAlertPhotoLayout.w.U(null, null);
                            break;
                    }
                }
            });
            this.S[i16].setContentDescription("flash mode " + i16);
        }
        TextView textView3 = new TextView(context);
        this.q0 = textView3;
        textView3.setTextSize(1, 15.0f);
        textView3.setTextColor(-1);
        textView3.setShadowLayer(org.telegram.ui.d3.h(3.33333f, R.string.TapForVideo, textView3), 0.0f, AndroidUtilities.dp(0.666f), 1275068416);
        textView3.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        this.j0.addView(textView3, gb1.h(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        fm fmVar2 = new fm(this, context, u6Var, 0);
        this.r = fmVar2;
        fmVar2.setVerticalScrollBarEnabled(true);
        tm tmVar2 = new tm(this, context, false);
        this.v = tmVar2;
        fmVar2.setAdapter(tmVar2);
        for (int i18 = 0; i18 < 8; i18++) {
            tmVar2.h.add(tmVar2.L());
        }
        fmVar2.setClipToPadding(false);
        fmVar2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        fmVar2.setItemAnimator(null);
        fmVar2.setLayoutAnimation(null);
        fmVar2.setOverScrollMode(2);
        fmVar2.setVisibility(4);
        fmVar2.setAlpha(0.0f);
        container.addView(fmVar2, gb1.g(80.0f, -1));
        ig.a0 a0Var = new ig.a0(i10, null == true ? 1 : 0, 7);
        this.s = a0Var;
        fmVar2.setLayoutManager(a0Var);
        fmVar2.setOnItemClickListener(new p7(1));
    }

    public static org.telegram.ui.Cells.x5 N(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        fm fmVar = chatAttachAlertPhotoLayout.E;
        int childCount = fmVar.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = fmVar.getChildAt(i11);
            if (childAt.getTop() < fmVar.getMeasuredHeight() - chatAttachAlertPhotoLayout.b.q1() && (childAt instanceof org.telegram.ui.Cells.x5)) {
                org.telegram.ui.Cells.x5 x5Var = (org.telegram.ui.Cells.x5) childAt;
                if (x5Var.getImageView().getTag() != null && ((Integer) x5Var.getImageView().getTag()).intValue() == i10) {
                    return x5Var;
                }
            }
        }
        return null;
    }

    public static int P(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        ti tiVar = chatAttachAlertPhotoLayout.b;
        org.telegram.ui.ActionBar.r2 r2Var = tiVar.f0;
        return ((r2Var instanceof org.telegram.ui.un) && ((org.telegram.ui.un) r2Var).d4 == 5) ? r2Var.getMessagesController().config.quickReplyMessagesLimit.get() - ((org.telegram.ui.un) tiVar.f0).G6.size() : ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    public static boolean S() {
        HashMap hashMap = s1;
        if (hashMap.isEmpty()) {
            return false;
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (entry.getValue() instanceof MediaController.PhotoEntry) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) entry.getValue();
                if (photoEntry.isLivePhoto() && photoEntry.isUnalivePhoto()) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean T() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = t1;
            if (i10 >= arrayList.size()) {
                break;
            }
            Object obj = s1.get(arrayList.get(i10));
            if (!TextUtils.isEmpty(obj instanceof MediaController.PhotoEntry ? ((MediaController.PhotoEntry) obj).caption : obj instanceof MediaController.SearchImage ? ((MediaController.SearchImage) obj).caption : null)) {
                i11++;
            }
            i10++;
        }
        return i11 <= 1;
    }

    public static boolean c0() {
        HashMap hashMap = s1;
        if (hashMap.isEmpty()) {
            return false;
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if ((entry.getValue() instanceof MediaController.PhotoEntry) && ((MediaController.PhotoEntry) entry.getValue()).isLivePhoto()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTopScrollOffset() {
        return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.dp(7.0f) + this.p1;
    }

    public static void o0(ImageView imageView, String str) {
        str.getClass();
        switch (str) {
            case "on":
                imageView.setImageResource(R.drawable.flash_on);
                imageView.setContentDescription(LocaleController.getString(R.string.AccDescrCameraFlashOn));
                break;
            case "off":
                imageView.setImageResource(R.drawable.flash_off);
                imageView.setContentDescription(LocaleController.getString(R.string.AccDescrCameraFlashOff));
                break;
            case "auto":
                imageView.setImageResource(R.drawable.flash_auto);
                imageView.setContentDescription(LocaleController.getString(R.string.AccDescrCameraFlashAuto));
                break;
        }
    }

    @Override // org.telegram.ui.Components.li
    public final void A() {
        ShutterButton shutterButton = this.k0;
        if (shutterButton == null) {
            return;
        }
        boolean z10 = this.Q0;
        gw0 gw0Var = gw0.a;
        gw0 gw0Var2 = gw0.b;
        if (z10) {
            if (this.P != null && shutterButton.getState() == gw0Var2) {
                shutterButton.a(gw0Var);
            }
            this.Q0 = false;
            return;
        }
        if (this.P != null && shutterButton.getState() == gw0Var2) {
            l0();
            CameraController.getInstance().stopVideoRecording(this.P.getCameraSession(), false);
            shutterButton.a(gw0Var);
        }
        if (this.b0) {
            a0(false);
        }
        d0(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00db  */
    @Override // org.telegram.ui.Components.li
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i10, int i11) {
        int b10;
        int i12;
        int dp;
        this.R0 = true;
        int i13 = this.M0;
        if (AndroidUtilities.isTablet()) {
            this.M0 = 4;
        } else {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                this.M0 = 4;
            } else {
                this.M0 = 3;
            }
        }
        this.p1 = AndroidUtilities.dp(48.0f) + AndroidUtilities.navigationBarHeight;
        fm fmVar = this.E;
        ((FrameLayout.LayoutParams) fmVar.getLayoutParams()).topMargin = -this.p1;
        int dp2 = (i10 - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(4.0f);
        int i14 = this.M0;
        int i15 = dp2 / i14;
        this.K0 = i15;
        if (this.L0 != i15 || i13 != i14) {
            this.L0 = i15;
            AndroidUtilities.runOnUIThread(new xl(this, 2));
        }
        this.F.z1(Math.max(1, ((this.M0 - 1) * AndroidUtilities.dp(2.0f)) + (this.K0 * this.M0)));
        tm tmVar = this.G;
        int ceil = (int) Math.ceil((tmVar.h() - 1) / this.M0);
        if (this.P0) {
            b10 = AndroidUtilities.dp(400.0f);
        } else {
            b10 = org.telegram.messenger.vh.b(2.0f, ceil - 1, this.K0 * ceil);
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        int z10 = org.telegram.messenger.t.z(6.0f, (((i11 - b10) - currentActionBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(12.0f), 0);
        if (this.J != z10) {
            this.J = z10;
            tmVar.l();
        }
        if (!AndroidUtilities.isTablet()) {
            Point point2 = AndroidUtilities.displaySize;
            if (point2.x > point2.y) {
                i12 = (int) (i11 / 3.5f);
                dp = ((i12 + currentActionBarHeight) - AndroidUtilities.dp(52.0f)) + this.p1;
                if (dp < 0) {
                    dp = 0;
                }
                if (fmVar.getPaddingTop() == dp || fmVar.getPaddingBottom() != this.e) {
                    fmVar.setPadding(AndroidUtilities.dp(2.0f), dp, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(48.0f) + this.e);
                }
                this.x.setTextSize(17.0f);
                this.R0 = false;
            }
        }
        i12 = (i11 / 5) * 2;
        dp = ((i12 + currentActionBarHeight) - AndroidUtilities.dp(52.0f)) + this.p1;
        if (dp < 0) {
        }
        if (fmVar.getPaddingTop() == dp) {
        }
        fmVar.setPadding(AndroidUtilities.dp(2.0f), dp, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(48.0f) + this.e);
        this.x.setTextSize(17.0f);
        this.R0 = false;
    }

    @Override // org.telegram.ui.Components.li
    public final void C() {
        ti tiVar = this.b;
        if (!tiVar.isShowing() || tiVar.isDismissed() || PhotoViewer.u1().T1()) {
            return;
        }
        U(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b4, code lost:
    
        if (((org.telegram.ui.un) r2).w() == false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x015a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0193  */
    @Override // org.telegram.ui.Components.li
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
        org.telegram.ui.ActionBar.r2 r2Var;
        TLRPC.ChatFull chatFull;
        boolean z15;
        long j11 = 0;
        ti tiVar = this.b;
        if (i10 > 1) {
            MessageObject messageObject = tiVar.K1;
            org.telegram.ui.ActionBar.w0 w0Var = tiVar.d1;
            if (messageObject == null) {
                if (getStarsPrice() <= 0) {
                    w0Var.S(0);
                    z10 = true;
                } else {
                    w0Var.t(0);
                    z10 = false;
                }
                if (!this.z0 || getStarsPrice() > 0) {
                    w0Var.t(1);
                    z11 = false;
                    if (i10 != 0) {
                        tiVar.d1.t(4);
                    }
                    org.telegram.ui.ActionBar.g1 g1Var = this.Z0;
                    if (i10 <= 1) {
                        tiVar.d1.S(5);
                        tiVar.d1.S(7);
                        g1Var.setText(LocaleController.getString(R.string.SendAsFiles));
                    } else {
                        tiVar.d1.t(5);
                        tiVar.d1.t(7);
                        if (i10 != 0) {
                            g1Var.setText(LocaleController.getString(R.string.SendAsFile));
                        }
                    }
                    if (i10 > 0 && getStarsPrice() <= 0) {
                        if (tiVar != null) {
                            org.telegram.ui.ActionBar.r2 r2Var2 = tiVar.f0;
                            if (r2Var2 instanceof org.telegram.ui.un) {
                            }
                        }
                        z12 = true;
                        if (i10 > 0 || tiVar == null) {
                            j10 = 0;
                        } else {
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = tiVar.j0;
                            if (chatAttachAlertPhotoLayout != null) {
                                HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
                                ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                                if (!selectedPhotos.isEmpty()) {
                                    int i11 = 0;
                                    z15 = false;
                                    loop0: while (true) {
                                        j10 = j11;
                                        if (i11 >= Math.ceil(selectedPhotos.size() / 10.0f)) {
                                            break;
                                        }
                                        int i12 = i11 * 10;
                                        int min = Math.min(10, selectedPhotos.size() - i12);
                                        Utilities.random.nextLong();
                                        for (int i13 = 0; i13 < min; i13++) {
                                            int i14 = i12 + i13;
                                            if (i14 < selectedPhotosOrder.size()) {
                                                CharSequence charSequence = ((MediaController.PhotoEntry) selectedPhotos.get(selectedPhotosOrder.get(i14))).caption;
                                                String charSequence2 = charSequence == null ? "" : charSequence.toString();
                                                if (tiVar.r1() != null && TextUtils.isEmpty(charSequence2) && i13 == 0) {
                                                    charSequence2 = tiVar.r1().getText().toString();
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
                                        i11++;
                                        j11 = j10;
                                    }
                                    z15 = false;
                                    if (z15 && (tiVar.f0 instanceof org.telegram.ui.un)) {
                                        z13 = true;
                                        if (i10 > 0 && tiVar != null) {
                                            r2Var = tiVar.f0;
                                            if ((r2Var instanceof org.telegram.ui.un) && ChatObject.isChannelAndNotMegaGroup(((org.telegram.ui.un) r2Var).e) && (chatFull = ((org.telegram.ui.un) r2Var).l8) != null && chatFull.paid_media_allowed) {
                                                z14 = true;
                                                if (z12) {
                                                    String string = LocaleController.getString(R.string.EnablePhotoSpoiler);
                                                    org.telegram.ui.ActionBar.g1 g1Var2 = this.Y0;
                                                    g1Var2.setText(string);
                                                    g1Var2.setAnimatedIcon(R.raw.photo_spoiler);
                                                    tiVar.d1.t(3);
                                                } else if (tiVar != null) {
                                                    tiVar.d1.S(3);
                                                }
                                                if (tiVar != null) {
                                                    org.telegram.ui.ActionBar.w0 w0Var2 = tiVar.d1;
                                                    if (getSelectedPhotosCount() == i10) {
                                                        int selectedPhotosHighQualityCount = getSelectedPhotosHighQualityCount();
                                                        org.telegram.ui.ActionBar.g1 g1Var3 = this.a1;
                                                        if (selectedPhotosHighQualityCount > 0) {
                                                            g1Var3.setText(LocaleController.getString(R.string.SendInStandardQuality));
                                                            g1Var3.setIcon(R.drawable.menu_quality_sd);
                                                        } else {
                                                            g1Var3.setText(LocaleController.getString(R.string.SendInHighQuality));
                                                            g1Var3.setIcon(R.drawable.menu_quality_hd);
                                                        }
                                                        w0Var2.S(2);
                                                    } else {
                                                        w0Var2.t(2);
                                                    }
                                                }
                                                mc0 mc0Var = this.d1;
                                                if (z13) {
                                                    mc0Var.setVisibility(8);
                                                } else {
                                                    mc0Var.setVisibility(0);
                                                }
                                                if ((!z12 || z13) && (z11 || z10)) {
                                                    tiVar.d1.S(6);
                                                } else {
                                                    tiVar.d1.t(6);
                                                }
                                                if (z14) {
                                                    tiVar.d1.t(9);
                                                    return;
                                                }
                                                org.telegram.ui.ActionBar.g1 g1Var4 = this.b1;
                                                if (g1Var4 != null) {
                                                    long starsPrice = getStarsPrice();
                                                    if (starsPrice > j10) {
                                                        g1Var4.setText(LocaleController.getString(R.string.PaidMediaPriceButton));
                                                        g1Var4.setSubtext(LocaleController.formatPluralString("Stars", (int) starsPrice, new Object[0]));
                                                    } else {
                                                        g1Var4.setText(LocaleController.getString(R.string.PaidMediaButton));
                                                        g1Var4.setSubtext(null);
                                                    }
                                                }
                                                this.E.M(new org.telegram.ui.ar(1));
                                                tiVar.d1.S(9);
                                                return;
                                            }
                                        }
                                        z14 = false;
                                        if (z12) {
                                        }
                                        if (tiVar != null) {
                                        }
                                        mc0 mc0Var2 = this.d1;
                                        if (z13) {
                                        }
                                        if (z12) {
                                        }
                                        tiVar.d1.S(6);
                                        if (z14) {
                                        }
                                    }
                                }
                            }
                            j10 = 0;
                            z15 = false;
                            if (z15) {
                                z13 = true;
                                if (i10 > 0) {
                                    r2Var = tiVar.f0;
                                    if (r2Var instanceof org.telegram.ui.un) {
                                        z14 = true;
                                        if (z12) {
                                        }
                                        if (tiVar != null) {
                                        }
                                        mc0 mc0Var22 = this.d1;
                                        if (z13) {
                                        }
                                        if (z12) {
                                        }
                                        tiVar.d1.S(6);
                                        if (z14) {
                                        }
                                    }
                                }
                                z14 = false;
                                if (z12) {
                                }
                                if (tiVar != null) {
                                }
                                mc0 mc0Var222 = this.d1;
                                if (z13) {
                                }
                                if (z12) {
                                }
                                tiVar.d1.S(6);
                                if (z14) {
                                }
                            }
                        }
                        z13 = false;
                        if (i10 > 0) {
                        }
                        z14 = false;
                        if (z12) {
                        }
                        if (tiVar != null) {
                        }
                        mc0 mc0Var2222 = this.d1;
                        if (z13) {
                        }
                        if (z12) {
                        }
                        tiVar.d1.S(6);
                        if (z14) {
                        }
                    }
                    z12 = false;
                    if (i10 > 0) {
                    }
                    j10 = 0;
                    z13 = false;
                    if (i10 > 0) {
                    }
                    z14 = false;
                    if (z12) {
                    }
                    if (tiVar != null) {
                    }
                    mc0 mc0Var22222 = this.d1;
                    if (z13) {
                    }
                    if (z12) {
                    }
                    tiVar.d1.S(6);
                    if (z14) {
                    }
                } else {
                    w0Var.S(1);
                    z11 = true;
                    if (i10 != 0) {
                    }
                    org.telegram.ui.ActionBar.g1 g1Var5 = this.Z0;
                    if (i10 <= 1) {
                    }
                    if (i10 > 0) {
                        if (tiVar != null) {
                        }
                        z12 = true;
                        if (i10 > 0) {
                        }
                        j10 = 0;
                        z13 = false;
                        if (i10 > 0) {
                        }
                        z14 = false;
                        if (z12) {
                        }
                        if (tiVar != null) {
                        }
                        mc0 mc0Var222222 = this.d1;
                        if (z13) {
                        }
                        if (z12) {
                        }
                        tiVar.d1.S(6);
                        if (z14) {
                        }
                    }
                    z12 = false;
                    if (i10 > 0) {
                    }
                    j10 = 0;
                    z13 = false;
                    if (i10 > 0) {
                    }
                    z14 = false;
                    if (z12) {
                    }
                    if (tiVar != null) {
                    }
                    mc0 mc0Var2222222 = this.d1;
                    if (z13) {
                    }
                    if (z12) {
                    }
                    tiVar.d1.S(6);
                    if (z14) {
                    }
                }
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var3 = tiVar.d1;
        org.telegram.ui.ActionBar.w0 w0Var4 = tiVar.d1;
        w0Var3.t(0);
        if (i10 == 0) {
            w0Var4.S(4);
            w0Var4.t(1);
        } else if (this.z0 && getStarsPrice() <= 0 && tiVar.K1 == null) {
            w0Var4.S(1);
            z10 = false;
            z11 = true;
            if (i10 != 0) {
            }
            org.telegram.ui.ActionBar.g1 g1Var52 = this.Z0;
            if (i10 <= 1) {
            }
            if (i10 > 0) {
            }
            z12 = false;
            if (i10 > 0) {
            }
            j10 = 0;
            z13 = false;
            if (i10 > 0) {
            }
            z14 = false;
            if (z12) {
            }
            if (tiVar != null) {
            }
            mc0 mc0Var22222222 = this.d1;
            if (z13) {
            }
            if (z12) {
            }
            tiVar.d1.S(6);
            if (z14) {
            }
        } else {
            w0Var4.t(1);
        }
        z10 = false;
        z11 = false;
        if (i10 != 0) {
        }
        org.telegram.ui.ActionBar.g1 g1Var522 = this.Z0;
        if (i10 <= 1) {
        }
        if (i10 > 0) {
        }
        z12 = false;
        if (i10 > 0) {
        }
        j10 = 0;
        z13 = false;
        if (i10 > 0) {
        }
        z14 = false;
        if (z12) {
        }
        if (tiVar != null) {
        }
        mc0 mc0Var222222222 = this.d1;
        if (z13) {
        }
        if (z12) {
        }
        tiVar.d1.S(6);
        if (z14) {
        }
    }

    @Override // org.telegram.ui.Components.li
    public final boolean F(int i10) {
        if (!this.b0) {
            return false;
        }
        if (i10 != 24 && i10 != 25 && i10 != 79 && i10 != 85) {
            return false;
        }
        ((dm) this.k0.getDelegate()).a();
        return true;
    }

    @Override // org.telegram.ui.Components.li
    public final void G(li liVar) {
        ViewPropertyAnimator viewPropertyAnimator = this.o1;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.w.setVisibility(0);
        boolean z10 = liVar instanceof cn;
        TextView textView = this.x;
        if (z10) {
            ViewPropertyAnimator interpolator = textView.animate().alpha(1.0f).setDuration(150L).setInterpolator(ds.j);
            this.o1 = interpolator;
            interpolator.start();
        } else {
            Z();
            textView.setAlpha(1.0f);
        }
        this.b.a1.setTitle("");
        this.F.h1(0, 0);
        if (z10) {
            this.E.post(new org.telegram.ui.ip(27, this, liVar));
        }
        V();
        m0();
    }

    @Override // org.telegram.ui.Components.li
    public final void H() {
        this.N = false;
        pm pmVar = this.P;
        if (pmVar != null) {
            pmVar.setVisibility(0);
        }
        if (this.u0) {
            this.u0 = false;
            U(true);
        }
    }

    @Override // org.telegram.ui.Components.li
    public final void J() {
        this.E.y0(0);
    }

    public final int Q(MediaController.PhotoEntry photoEntry, int i10) {
        Integer valueOf = Integer.valueOf(photoEntry.imageId);
        HashMap hashMap = s1;
        boolean containsKey = hashMap.containsKey(valueOf);
        ArrayList arrayList = t1;
        if (containsKey) {
            photoEntry.starsAmount = 0L;
            photoEntry.hasSpoiler = false;
            photoEntry.discardLivePhoto = null;
            photoEntry.highQuality = null;
            hashMap.remove(valueOf);
            int indexOf = arrayList.indexOf(valueOf);
            if (indexOf >= 0) {
                arrayList.remove(indexOf);
            }
            y0(false);
            w0();
            if (i10 >= 0) {
                photoEntry.reset();
                this.h1.X(i10);
            }
            return indexOf;
        }
        photoEntry.starsAmount = getStarsPrice();
        photoEntry.hasSpoiler = getStarsPrice() > 0;
        photoEntry.isChatPreviewSpoilerRevealed = false;
        photoEntry.isAttachSpoilerRevealed = false;
        if (c0()) {
            photoEntry.discardLivePhoto = Boolean.valueOf(!S());
        }
        photoEntry.highQuality = Boolean.valueOf(photoEntry.isHighQuality());
        boolean W = W(true);
        hashMap.put(valueOf, photoEntry);
        arrayList.add(valueOf);
        if (W) {
            x0();
            return -1;
        }
        y0(true);
        return -1;
    }

    public final void R() {
        pm pmVar = this.P;
        if (pmVar != null) {
            if (!this.b0) {
                pmVar.setTranslationX(this.U[0]);
            }
            int i10 = this.K0;
            int dp = AndroidUtilities.dp(2.0f) + (i10 * 2);
            if (this.b0) {
                return;
            }
            this.P.setClipTop((int) this.W);
            this.P.setClipBottom((int) this.a0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.P.getLayoutParams();
            if (layoutParams.height == dp && layoutParams.width == i10) {
                return;
            }
            layoutParams.width = i10;
            layoutParams.height = dp;
            this.P.setLayoutParams(layoutParams);
            AndroidUtilities.runOnUIThread(new org.telegram.ui.ip(28, this, layoutParams));
        }
    }

    public final void U(boolean z10) {
        tm tmVar;
        ti tiVar = this.b;
        boolean z11 = tiVar.V;
        org.telegram.ui.ActionBar.r2 r2Var = tiVar.f0;
        if (z11 || !this.n) {
            return;
        }
        boolean z12 = this.N0;
        boolean z13 = this.O0;
        org.telegram.ui.ActionBar.r2 R = r2Var == null ? LaunchActivity.R() : r2Var;
        if (R == null || R.getParentActivity() == null) {
            return;
        }
        if (SharedConfig.inappCamera) {
            boolean z14 = R.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0;
            this.O0 = z14;
            if (z14) {
                if (z10) {
                    try {
                        r2Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE"}, 17);
                    } catch (Exception unused) {
                    }
                }
                this.N0 = false;
            } else {
                if (z10 || SharedConfig.hasCameraCache) {
                    CameraController.getInstance().initCamera(null);
                }
                this.N0 = CameraController.getInstance().isCameraInitied();
            }
        } else {
            this.N0 = false;
        }
        if ((z12 != this.N0 || z13 != this.O0) && (tmVar = this.G) != null) {
            tmVar.l();
        }
        if (tiVar.V || !tiVar.isShowing() || !this.N0 || tiVar.getBackDrawable().getAlpha() == 0 || this.b0) {
            return;
        }
        s0();
    }

    public final void V() {
        s4.e1 K;
        float[] fArr;
        if (PhotoViewer.E1() && PhotoViewer.u1().p5 != null && PhotoViewer.u1().p5.V) {
            return;
        }
        pm pmVar = this.P;
        if (pmVar != null) {
            pmVar.invalidateOutline();
        }
        int i10 = this.M0 - 1;
        fm fmVar = this.E;
        s4.e1 K2 = fmVar.K(i10);
        if (K2 != null) {
            K2.a.invalidateOutline();
        }
        if ((!this.G.d || !this.N0 || this.T0 != this.U0) && (K = fmVar.K(0)) != null) {
            K.a.invalidateOutline();
        }
        pm pmVar2 = this.P;
        if (pmVar2 != null) {
            pmVar2.invalidate();
        }
        nm nmVar = this.R;
        if (nmVar != null) {
            ((ViewGroup.MarginLayoutParams) nmVar.getLayoutParams()).topMargin = getRootWindowInsets() == null ? AndroidUtilities.dp(16.0f) : getRootWindowInsets().getSystemWindowInsetTop() + AndroidUtilities.dp(2.0f);
        }
        if (this.N0) {
            int childCount = fmVar.getChildCount();
            int i11 = 0;
            while (true) {
                fArr = this.U;
                if (i11 >= childCount) {
                    break;
                }
                View childAt = fmVar.getChildAt(i11);
                if (!(childAt instanceof org.telegram.ui.Cells.q5)) {
                    i11++;
                } else if (childAt.isAttachedToWindow()) {
                    float y3 = getY() + fmVar.getY() + childAt.getY();
                    ti tiVar = this.b;
                    ViewGroup sheetContainer = tiVar.getSheetContainer();
                    uh uhVar = tiVar.B1;
                    bh.p pVar = tiVar.R0;
                    float y10 = sheetContainer.getY() + y3;
                    float x9 = (tiVar.getSheetContainer().getX() + (getX() + (fmVar.getX() + childAt.getX()))) - getRootWindowInsets().getSystemWindowInsetLeft();
                    float alpha = (pVar.getAlpha() * pVar.getMeasuredHeight()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (!tiVar.g0 ? AndroidUtilities.statusBarHeight : 0);
                    fi.i iVar = tiVar.H2;
                    if (iVar != null && iVar.g()) {
                        alpha = Math.max(alpha, (tiVar.H2.e() + tiVar.H2.getY()) - tiVar.o2);
                    }
                    float f7 = y3 < alpha ? alpha - y3 : 0.0f;
                    if (f7 != this.W) {
                        this.W = f7;
                        pm pmVar3 = this.P;
                        if (pmVar3 != null) {
                            pmVar3.invalidateOutline();
                            this.P.invalidate();
                        }
                    }
                    float translationY = (int) (uhVar.getTranslationY() + (tiVar.getSheetContainer().getMeasuredHeight() - uhVar.getMeasuredHeight()));
                    fi.i iVar2 = tiVar.H2;
                    if (iVar2 != null) {
                        translationY -= iVar2.d() - AndroidUtilities.dp(6.0f);
                    }
                    if (childAt.getMeasuredHeight() + y3 > translationY) {
                        this.a0 = Math.min(-AndroidUtilities.dp(5.0f), y3 - translationY) + childAt.getMeasuredHeight();
                    } else {
                        this.a0 = 0.0f;
                    }
                    fArr[0] = x9;
                    fArr[1] = y10;
                    R();
                    return;
                }
            }
            if (this.W != 0.0f) {
                this.W = 0.0f;
                pm pmVar4 = this.P;
                if (pmVar4 != null) {
                    pmVar4.invalidateOutline();
                    this.P.invalidate();
                }
            }
            fArr[0] = AndroidUtilities.dp(-400.0f);
            fArr[1] = 0.0f;
            R();
        }
    }

    public final boolean W(boolean z10) {
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
            if (!(obj instanceof MediaController.PhotoEntry)) {
                break;
            }
            Q((MediaController.PhotoEntry) obj, -1);
            z11 = true;
        }
        return z11;
    }

    public final boolean X(MediaController.PhotoEntry photoEntry) {
        boolean z10 = this.w0;
        org.telegram.ui.ActionBar.u6 u6Var = this.a;
        ti tiVar = this.b;
        if (z10 || !photoEntry.isVideo) {
            if (this.x0 || photoEntry.isVideo) {
                return false;
            }
            if (!tiVar.f1()) {
                org.telegram.messenger.vh.n(R.string.GlobalAttachPhotoRestricted, new wc(tiVar.u1, u6Var), null);
                return true;
            }
        } else if (!tiVar.f1()) {
            org.telegram.messenger.vh.n(R.string.GlobalAttachVideoRestricted, new wc(tiVar.u1, u6Var), null);
            return true;
        }
        return true;
    }

    public final void Y() {
        if (this.P0) {
            boolean e02 = e0();
            this.P0 = e02;
            if (!e02) {
                f0();
            }
            this.G.l();
            this.v.l();
        }
    }

    public final void Z() {
        String string = LocaleController.getString(R.string.EnablePhotoSpoiler);
        org.telegram.ui.ActionBar.g1 g1Var = this.Y0;
        g1Var.setText(string);
        g1Var.setAnimatedIcon(R.raw.photo_spoiler);
        this.b.d1.S(1);
        HashMap hashMap = s1;
        if (!hashMap.isEmpty()) {
            Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                ((MediaController.PhotoEntry) ((Map.Entry) it.next()).getValue()).reset();
            }
            hashMap.clear();
            t1.clear();
        }
        ArrayList arrayList = r1;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList.get(i10);
                new File(photoEntry.path).delete();
                if (photoEntry.imagePath != null) {
                    new File(photoEntry.imagePath).delete();
                }
                if (photoEntry.thumbPath != null) {
                    new File(photoEntry.thumbPath).delete();
                }
            }
            arrayList.clear();
        }
        this.G.l();
        this.v.l();
    }

    @Override // org.telegram.ui.Components.li
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
                if (obj3 instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry clone = ((MediaController.PhotoEntry) obj3).clone();
                    CharSequence[] charSequenceArr = {charSequence};
                    clone.entities = MediaDataController.getInstance(UserConfig.selectedAccount).getEntities(charSequenceArr, false);
                    clone.caption = charSequenceArr[0];
                    obj = clone;
                } else {
                    boolean z10 = obj3 instanceof MediaController.SearchImage;
                    obj = obj3;
                    if (z10) {
                        MediaController.SearchImage clone2 = ((MediaController.SearchImage) obj3).clone();
                        CharSequence[] charSequenceArr2 = {charSequence};
                        clone2.entities = MediaDataController.getInstance(UserConfig.selectedAccount).getEntities(charSequenceArr2, false);
                        clone2.caption = charSequenceArr2[0];
                        obj = clone2;
                    }
                }
                hashMap.put(obj2, obj);
            }
            i10++;
        }
    }

    public final void a0(boolean z10) {
        pm pmVar;
        if (this.s0 || this.P == null) {
            return;
        }
        int i10 = this.K0;
        int[] iArr = this.f0;
        iArr[1] = i10;
        int i11 = 2;
        iArr[2] = AndroidUtilities.dp(2.0f) + (i10 * 2);
        Runnable runnable = this.n0;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.n0 = null;
        }
        boolean z11 = ((double) AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.a7, this.a))) > 0.721d;
        ti tiVar = this.b;
        AndroidUtilities.setLightNavigationBar(tiVar, z11);
        TextView textView = this.p0;
        fm fmVar = this.r;
        bh.r rVar = this.j0;
        fm fmVar2 = this.E;
        ImageView[] imageViewArr = this.S;
        fc1 fc1Var = this.l0;
        if (z10) {
            this.j1 = this.P.getTranslationY();
            this.d0 = true;
            if (fmVar2 != null) {
                fmVar2.invalidate();
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this, "cameraOpenProgress", 0.0f));
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(rVar, (Property<bh.r, Float>) property, 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(fc1Var, (Property<fc1, Float>) property, 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(fmVar, (Property<fm, Float>) property, 0.0f));
            int i12 = 0;
            while (true) {
                if (i12 >= 2) {
                    break;
                }
                if (imageViewArr[i12].getVisibility() == 0) {
                    arrayList.add(ObjectAnimator.ofFloat(imageViewArr[i12], (Property<ImageView, Float>) property, 0.0f));
                    break;
                }
                i12++;
            }
            this.f1.lock();
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(220L);
            animatorSet.setInterpolator(ds.f);
            animatorSet.addListener(new hm(this, i11));
            animatorSet.start();
        } else {
            this.i1 = false;
            tiVar.getWindow().clearFlags(128);
            setCameraOpenProgress(0.0f);
            iArr[0] = 0;
            setCameraOpenProgress(0.0f);
            rVar.setAlpha(0.0f);
            rVar.setVisibility(8);
            fc1Var.setAlpha(0.0f);
            fc1Var.setTag(null);
            fc1Var.setVisibility(8);
            fmVar.setAlpha(0.0f);
            textView.setAlpha(0.0f);
            fmVar.setVisibility(8);
            int i13 = 0;
            while (true) {
                if (i13 >= 2) {
                    break;
                }
                if (imageViewArr[i13].getVisibility() == 0) {
                    imageViewArr[i13].setAlpha(0.0f);
                    break;
                }
                i13++;
            }
            this.b0 = false;
            pm pmVar2 = this.P;
            if (pmVar2 != null) {
                pmVar2.setFpsLimit(30);
                this.P.setSystemUiVisibility(1024);
            }
            if (fmVar2 != null) {
                fmVar2.invalidate();
            }
        }
        pm pmVar3 = this.P;
        if (pmVar3 != null) {
            pmVar3.setImportantForAccessibility(0);
        }
        fmVar2.setImportantForAccessibility(0);
        if (LiteMode.isEnabled(LiteMode.FLAGS_CHAT) || (pmVar = this.P) == null) {
            return;
        }
        pmVar.showTexture(false, z10);
    }

    @Override // org.telegram.ui.Components.li
    public final boolean b() {
        return !this.b0;
    }

    public final MediaController.PhotoEntry b0(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = r1;
        int size = arrayList.size();
        if (i10 < size) {
            return (MediaController.PhotoEntry) arrayList.get(i10);
        }
        int i11 = i10 - size;
        MediaController.AlbumEntry albumEntry = this.T0;
        if (albumEntry == null || i11 >= albumEntry.photos.size()) {
            return null;
        }
        return this.T0.photos.get(i11);
    }

    @Override // org.telegram.ui.Components.li
    public final boolean c() {
        Iterator it = s1.entrySet().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof MediaController.PhotoEntry) {
                if (((MediaController.PhotoEntry) value).ttl != 0) {
                    return false;
                }
            } else if ((value instanceof MediaController.SearchImage) && ((MediaController.SearchImage) value).ttl != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.li
    public final void d() {
        boolean z10 = this.e1;
        int i10 = z10 ? org.telegram.ui.ActionBar.y6.hg : org.telegram.ui.ActionBar.y6.j5;
        int i11 = org.telegram.ui.ActionBar.y6.c7;
        org.telegram.ui.ActionBar.u6 u6Var = this.a;
        this.H.setTextColor(org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
        int i12 = org.telegram.ui.ActionBar.y6.A5;
        fm fmVar = this.E;
        org.telegram.ui.ActionBar.f7.I(fmVar, i12, u6Var);
        fmVar.K(0);
        org.telegram.ui.ActionBar.f7.V(this.x, i10, u6Var);
        int w02 = org.telegram.ui.ActionBar.y6.w0(z10 ? org.telegram.ui.ActionBar.y6.hg : org.telegram.ui.ActionBar.y6.E8, u6Var);
        km kmVar = this.w;
        kmVar.O(w02, false);
        kmVar.O(org.telegram.ui.ActionBar.y6.w0(z10 ? org.telegram.ui.ActionBar.y6.hg : org.telegram.ui.ActionBar.y6.E8, u6Var), true);
        kmVar.H(org.telegram.ui.ActionBar.y6.w0(z10 ? org.telegram.ui.ActionBar.y6.jg : org.telegram.ui.ActionBar.y6.G8, u6Var));
        org.telegram.ui.ActionBar.y6.z1(org.telegram.ui.ActionBar.y6.w0(i10, u6Var), this.y);
    }

    public final void d0(boolean z10) {
        if (!this.N0 || this.P == null) {
            return;
        }
        n0();
        this.Q.i();
        this.P.destroy(z10, null);
        AnimatorSet animatorSet = this.O;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.O = null;
        }
        AndroidUtilities.runOnUIThread(new xl(this, 0), 300L);
        this.c0 = false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ti tiVar;
        if (i10 != NotificationCenter.albumsDidLoad) {
            if (i10 == NotificationCenter.cameraInitied) {
                U(false);
                return;
            }
            return;
        }
        tm tmVar = this.G;
        if (tmVar != null) {
            if (q0()) {
                this.U0 = MediaController.allMediaAlbumEntry;
            } else {
                this.U0 = MediaController.allPhotosAlbumEntry;
            }
            if (this.T0 == null || ((tiVar = this.b) != null && tiVar.G)) {
                this.T0 = this.U0;
            } else if (q0()) {
                int i12 = 0;
                while (true) {
                    if (i12 >= MediaController.allMediaAlbums.size()) {
                        break;
                    }
                    MediaController.AlbumEntry albumEntry = MediaController.allMediaAlbums.get(i12);
                    int i13 = albumEntry.bucketId;
                    MediaController.AlbumEntry albumEntry2 = this.T0;
                    if (i13 == albumEntry2.bucketId && albumEntry.videoOnly == albumEntry2.videoOnly) {
                        this.T0 = albumEntry;
                        break;
                    }
                    i12++;
                }
            }
            this.X0 = false;
            this.H.c();
            tmVar.l();
            this.v.l();
            ArrayList arrayList = t1;
            if (!arrayList.isEmpty() && this.U0 != null) {
                int size = arrayList.size();
                for (int i14 = 0; i14 < size; i14++) {
                    Integer num = (Integer) arrayList.get(i14);
                    HashMap hashMap = s1;
                    Object obj = hashMap.get(num);
                    MediaController.PhotoEntry photoEntry = this.U0.photosByIds.get(num.intValue());
                    if (photoEntry != null) {
                        if (obj instanceof MediaController.PhotoEntry) {
                            photoEntry.copyFrom((MediaController.PhotoEntry) obj);
                        }
                        hashMap.put(num, photoEntry);
                    }
                }
            }
            u0();
        }
    }

    public final boolean e0() {
        Activity findActivity = AndroidUtilities.findActivity(getContext());
        if (findActivity == null) {
            findActivity = this.b.f0.getParentActivity();
        }
        int i10 = Build.VERSION.SDK_INT;
        if (findActivity == null) {
            return true;
        }
        if (i10 < 33 || (findActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0 && findActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0)) {
            return i10 < 33 && findActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0;
        }
        return true;
    }

    public final void f0() {
        if ((q0() ? MediaController.allMediaAlbumEntry : MediaController.allPhotosAlbumEntry) == null) {
            MediaController.loadGalleryPhotosAlbums(0);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:22|(1:24)|(1:98)(1:29)|(6:31|(5:33|(1:35)|36|(1:38)|(1:40))|96|42|(1:95)|46)(1:97)|(1:94)|51|(2:52|53)|(4:55|56|(2:58|59)|61)|62|63|64|65|66|67) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00db, code lost:
    
        if (org.telegram.ui.Components.b10.t(r0) != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x016c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x016d, code lost:
    
        org.telegram.messenger.FileLog.e(r0);
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x012b -> B:60:0x013a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g0(int i10, Intent intent, String str) {
        String str2;
        MediaMetadataRetriever mediaMetadataRetriever;
        int i11;
        int i12;
        String str3 = str;
        ti tiVar = this.b;
        boolean z10 = tiVar.V;
        org.telegram.ui.ActionBar.r2 r2Var = tiVar.f0;
        if (z10) {
            return;
        }
        q1 = true;
        MediaMetadataRetriever mediaMetadataRetriever2 = null;
        if (i10 == 0) {
            PhotoViewer.u1().M2(r2Var.getParentActivity(), null, this.a);
            PhotoViewer u12 = PhotoViewer.u1();
            int i13 = tiVar.V1;
            boolean z11 = tiVar.W1;
            u12.h = i13;
            u12.n = z11;
            Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(str3);
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(new File(str3).getAbsolutePath(), options);
                i11 = options.outWidth;
                try {
                    i12 = options.outHeight;
                } catch (Exception unused) {
                    i12 = 0;
                    int i14 = i11;
                    int i15 = u1;
                    u1 = i15 - 1;
                    MediaController.PhotoEntry orientation = new MediaController.PhotoEntry(0, i15, 0L, str3, ((Integer) imageOrientation.first).intValue(), false, i14, i12, 0L).setOrientation(imageOrientation);
                    orientation.canDeleteAfter = true;
                    j0(orientation, false, true);
                    return;
                }
            } catch (Exception unused2) {
                i11 = 0;
            }
            int i142 = i11;
            int i152 = u1;
            u1 = i152 - 1;
            MediaController.PhotoEntry orientation2 = new MediaController.PhotoEntry(0, i152, 0L, str3, ((Integer) imageOrientation.first).intValue(), false, i142, i12, 0L).setOrientation(imageOrientation);
            orientation2.canDeleteAfter = true;
            j0(orientation2, false, true);
            return;
        }
        if (i10 == 2) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("pic path " + str3);
            }
            Intent intent2 = (intent == null || str3 == null || !b10.t(str3)) ? intent : null;
            if (intent2 != null) {
                Uri data = intent2.getData();
                if (data != null) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("video record uri " + data.toString());
                    }
                    str2 = AndroidUtilities.getPath(data);
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("resolved path = " + str2);
                    }
                    if (str2 != null) {
                    }
                }
                str2 = str3;
                if (!(r2Var instanceof org.telegram.ui.un) || !((org.telegram.ui.un) r2Var).w()) {
                    AndroidUtilities.addMediaToGallery(str3);
                }
                str3 = null;
            } else {
                str2 = null;
            }
            if (str2 != null || str3 == null || !b10.t(str3)) {
                str3 = str2;
            }
            try {
                try {
                    try {
                        mediaMetadataRetriever = new MediaMetadataRetriever();
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                } catch (Exception e10) {
                    e = e10;
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                mediaMetadataRetriever.setDataSource(str3);
                r4 = mediaMetadataRetriever.extractMetadata(9) != null ? (int) Math.ceil(Long.parseLong(r0) / 1000.0f) : 0L;
                mediaMetadataRetriever.release();
            } catch (Exception e11) {
                e = e11;
                mediaMetadataRetriever2 = mediaMetadataRetriever;
                FileLog.e(e);
                if (mediaMetadataRetriever2 != null) {
                    mediaMetadataRetriever2.release();
                }
                Bitmap createVideoThumbnail = SendMessagesHelper.createVideoThumbnail(str3, 1);
                File file = new File(FileLoader.getDirectory(4), "-2147483648_" + SharedConfig.getLastLocalId() + ".jpg");
                createVideoThumbnail.compress(Bitmap.CompressFormat.JPEG, 55, new FileOutputStream(file));
                SharedConfig.saveConfig();
                int i16 = u1;
                u1 = i16 - 1;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, i16, 0L, str3, 0, true, createVideoThumbnail.getWidth(), createVideoThumbnail.getHeight(), 0L);
                photoEntry.duration = (int) r4;
                photoEntry.thumbPath = file.getAbsolutePath();
                j0(photoEntry, false, true);
            } catch (Throwable th3) {
                th = th3;
                mediaMetadataRetriever2 = mediaMetadataRetriever;
                Throwable th4 = th;
                if (mediaMetadataRetriever2 == null) {
                    throw th4;
                }
                try {
                    mediaMetadataRetriever2.release();
                    throw th4;
                } catch (Exception e12) {
                    FileLog.e(e12);
                    throw th4;
                }
            }
            Bitmap createVideoThumbnail2 = SendMessagesHelper.createVideoThumbnail(str3, 1);
            File file2 = new File(FileLoader.getDirectory(4), "-2147483648_" + SharedConfig.getLastLocalId() + ".jpg");
            createVideoThumbnail2.compress(Bitmap.CompressFormat.JPEG, 55, new FileOutputStream(file2));
            SharedConfig.saveConfig();
            int i162 = u1;
            u1 = i162 - 1;
            MediaController.PhotoEntry photoEntry2 = new MediaController.PhotoEntry(0, i162, 0L, str3, 0, true, createVideoThumbnail2.getWidth(), createVideoThumbnail2.getHeight(), 0L);
            photoEntry2.duration = (int) r4;
            photoEntry2.thumbPath = file2.getAbsolutePath();
            j0(photoEntry2, false, true);
        }
    }

    public ArrayList<Object> getAllPhotosArray() {
        MediaController.AlbumEntry albumEntry = this.T0;
        ArrayList<Object> arrayList = r1;
        if (albumEntry == null) {
            return !arrayList.isEmpty() ? arrayList : new ArrayList<>(0);
        }
        if (arrayList.isEmpty()) {
            return this.T0.photos;
        }
        ArrayList<Object> arrayList2 = new ArrayList<>(arrayList.size() + this.T0.photos.size());
        arrayList2.addAll(arrayList);
        arrayList2.addAll(this.T0.photos);
        return arrayList2;
    }

    @Override // org.telegram.ui.Components.li
    public int getButtonsHideOffset() {
        return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + super.getButtonsHideOffset();
    }

    public float getCameraOpenProgress() {
        return this.e0;
    }

    @Override // org.telegram.ui.Components.li
    public int getCurrentItemTop() {
        fm fmVar = this.E;
        int childCount = fmVar.getChildCount();
        uz uzVar = this.H;
        if (childCount <= 0) {
            fmVar.setTopGlowOffset(fmVar.getPaddingTop());
            uzVar.setTranslationY(0.0f);
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = fmVar.getChildAt(0);
        vl0 vl0Var = (vl0) fmVar.G(childAt);
        int top = childAt.getTop() - this.p1;
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || vl0Var == null || vl0Var.b() != 0) {
            top = dp;
        }
        uzVar.setTranslationY(((((getMeasuredHeight() - top) - AndroidUtilities.dp(50.0f)) - uzVar.getMeasuredHeight()) / 2.0f) + top);
        fmVar.setTopGlowOffset(top);
        return top;
    }

    @Override // org.telegram.ui.Components.li
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.li
    public int getListTopPadding() {
        return this.E.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.li
    public int getSelectedItemsCount() {
        return t1.size();
    }

    public HashMap<Object, Object> getSelectedPhotos() {
        return s1;
    }

    public int getSelectedPhotosCount() {
        int i10 = 0;
        for (Object obj : s1.values()) {
            if (obj instanceof MediaController.PhotoEntry) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                if (!photoEntry.isVideo && photoEntry.editedInfo == null) {
                    i10++;
                }
            }
        }
        return i10;
    }

    public int getSelectedPhotosHighQualityCount() {
        int i10 = 0;
        for (Object obj : s1.values()) {
            if (obj instanceof MediaController.PhotoEntry) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                if (photoEntry.isHighQuality() && !photoEntry.isVideo && photoEntry.editedInfo == null) {
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
            return ((MediaController.PhotoEntry) ((Map.Entry) it.next()).getValue()).starsAmount;
        }
        return 0L;
    }

    public final void h0(boolean z10) {
        pm pmVar;
        if (this.P == null || this.O != null) {
            return;
        }
        ti tiVar = this.b;
        if (tiVar.isDismissed()) {
            return;
        }
        this.P.initTexture();
        boolean q02 = q0();
        TextView textView = this.q0;
        int i10 = 0;
        if (q02) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        boolean isEmpty = r1.isEmpty();
        fm fmVar = this.r;
        TextView textView2 = this.p0;
        if (isEmpty) {
            textView2.setVisibility(4);
            fmVar.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            fmVar.setVisibility(0);
        }
        if (tiVar.r1().v && isFocusable()) {
            tiVar.r1().d();
        }
        fc1 fc1Var = this.l0;
        fc1Var.setVisibility(0);
        fc1Var.setAlpha(0.0f);
        bh.r rVar = this.j0;
        rVar.setVisibility(0);
        rVar.setTag(null);
        int[] iArr = this.f0;
        iArr[0] = 0;
        int i11 = this.K0;
        int i12 = 1;
        iArr[1] = i11;
        iArr[2] = AndroidUtilities.dp(2.0f) + (i11 * 2);
        this.j1 = 0.0f;
        this.i1 = true;
        pm pmVar2 = this.P;
        if (pmVar2 != null) {
            pmVar2.setFpsLimit(-1);
        }
        AndroidUtilities.hideKeyboard(this);
        AndroidUtilities.setLightNavigationBar((Dialog) tiVar, false);
        tiVar.getWindow().addFlags(128);
        fm fmVar2 = this.E;
        ImageView[] imageViewArr = this.S;
        if (z10) {
            setCameraOpenProgress(0.0f);
            this.d0 = true;
            if (fmVar2 != null) {
                fmVar2.invalidate();
            }
            this.f1.lock();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this, "cameraOpenProgress", 0.0f, 1.0f));
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(rVar, (Property<bh.r, Float>) property, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(fmVar, (Property<fm, Float>) property, 1.0f));
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
            animatorSet.setInterpolator(ds.f);
            animatorSet.addListener(new hm(this, i12));
            animatorSet.start();
        } else {
            setCameraOpenProgress(1.0f);
            rVar.setAlpha(1.0f);
            textView2.setAlpha(1.0f);
            fmVar.setAlpha(1.0f);
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
            tiVar.c2.R();
            pm pmVar3 = this.P;
            if (pmVar3 != null) {
                pmVar3.setSystemUiVisibility(1028);
            }
        }
        this.b0 = true;
        pm pmVar4 = this.P;
        if (pmVar4 != null) {
            pmVar4.setImportantForAccessibility(2);
        }
        fmVar2.setImportantForAccessibility(4);
        fmVar2.invalidate();
        if (LiteMode.isEnabled(LiteMode.FLAGS_CHAT) || (pmVar = this.P) == null || !pmVar.isInited()) {
            return;
        }
        this.P.showTexture(true, z10);
    }

    @Override // org.telegram.ui.Components.li
    public final int i() {
        return 1;
    }

    public final void i0() {
        if (SharedConfig.inappCamera) {
            h0(true);
            return;
        }
        ti tiVar = this.b;
        ri riVar = tiVar.c2;
        if (riVar != null) {
            riVar.p0(0, false, true, 0, 0, 0L, tiVar.w1(), false, 0L);
        }
    }

    public final void j0(MediaController.PhotoEntry photoEntry, boolean z10, boolean z11) {
        int i10;
        org.telegram.ui.un unVar;
        org.telegram.ui.un unVar2;
        ArrayList<Object> arrayList;
        int i11;
        ArrayList arrayList2 = r1;
        ti tiVar = this.b;
        if (photoEntry != null) {
            arrayList2.add(photoEntry);
            s1.put(Integer.valueOf(photoEntry.imageId), photoEntry);
            t1.add(Integer.valueOf(photoEntry.imageId));
            tiVar.c2(0);
            this.G.l();
            this.v.l();
        }
        if (photoEntry != null && !z11 && arrayList2.size() > 1) {
            y0(false);
            if (this.P != null) {
                this.l0.b(0.0f, false);
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
        org.telegram.ui.ActionBar.r2 r2Var = tiVar.f0;
        org.telegram.ui.ActionBar.r2 r2Var2 = tiVar.f0;
        if (r2Var == null) {
            r2Var = LaunchActivity.R();
        }
        if (r2Var == null) {
            return;
        }
        PhotoViewer.u1().M2(r2Var.getParentActivity(), null, this.a);
        PhotoViewer.u1().N2(tiVar);
        PhotoViewer u12 = PhotoViewer.u1();
        int i12 = tiVar.V1;
        boolean z12 = tiVar.W1;
        u12.h = i12;
        u12.n = z12;
        if (tiVar.F && tiVar.G) {
            unVar = (org.telegram.ui.un) r2Var2;
            i10 = 11;
        } else {
            if (tiVar.T0 != 0) {
                i10 = 1;
            } else if (r2Var2 instanceof org.telegram.ui.un) {
                unVar = (org.telegram.ui.un) r2Var2;
                i10 = 2;
            } else {
                i10 = 5;
            }
            unVar = null;
        }
        boolean z13 = tiVar.H;
        if (z13) {
            i10 = 13;
            unVar2 = null;
        } else {
            unVar2 = unVar;
        }
        int i13 = i10;
        if (tiVar.T0 != 0 || z13) {
            arrayList = new ArrayList<>();
            arrayList.add(photoEntry);
            i11 = 0;
        } else {
            arrayList = getAllPhotosArray();
            i11 = arrayList2.size() - 1;
        }
        ArrayList<Object> arrayList3 = arrayList;
        e50 e50Var = tiVar.Q;
        if (e50Var != null && photoEntry != null) {
            e50Var.e = photoEntry.isVideo;
        }
        PhotoViewer.u1().i2(arrayList3, i11, i13, false, new gm(this, z10), unVar2);
        PhotoViewer.u1().z2(tiVar.Q);
        if (tiVar.G) {
            PhotoViewer.u1().Y0(null, null, false, tiVar.J);
            PhotoViewer.u1().o2();
        }
    }

    @Override // org.telegram.ui.Components.li
    public final void k() {
        V();
        invalidate();
    }

    public final void k0() {
        try {
            if (this.P != null) {
                CameraController.getInstance().stopPreview(this.P.getCameraSessionObject());
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Components.li
    public final void l(float f7) {
        this.W0 = f7;
        V();
        pm pmVar = this.P;
        if (pmVar != null) {
            pmVar.invalidateOutline();
            this.P.invalidate();
        }
        invalidate();
    }

    public final void l0() {
        if (this.b.V) {
            return;
        }
        for (int i10 = 0; i10 < 2; i10++) {
            this.S[i10].animate().alpha(1.0f).translationX(0.0f).setDuration(150L).setInterpolator(ds.f).start();
        }
        ViewPropertyAnimator duration = this.r0.animate().alpha(1.0f).translationX(0.0f).setDuration(150L);
        ds dsVar = ds.f;
        duration.setInterpolator(dsVar).start();
        this.q0.animate().alpha(1.0f).setDuration(150L).setInterpolator(dsVar).start();
        AndroidUtilities.updateViewVisibilityAnimated(this.R, false);
        AndroidUtilities.cancelRunOnUIThread(this.h0);
        this.h0 = null;
        AndroidUtilities.unlockOrientation(AndroidUtilities.findActivity(getContext()));
    }

    public final void m0() {
        try {
            U(false);
            if (this.P != null) {
                CameraController.getInstance().startPreview(this.P.getCameraSessionObject());
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Components.li
    public final boolean n(MotionEvent motionEvent) {
        pm pmVar;
        if (!this.d0) {
            if (this.b0 && motionEvent != null) {
                boolean z10 = this.G0;
                fc1 fc1Var = this.l0;
                if ((!z10 && motionEvent.getActionMasked() == 0) || motionEvent.getActionMasked() == 5) {
                    Rect rect = this.E0;
                    fc1Var.getHitRect(rect);
                    if (fc1Var.getTag() == null || !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
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
                    fm fmVar = this.r;
                    TextView textView = this.p0;
                    Property property = View.ALPHA;
                    ImageView[] imageViewArr = this.S;
                    bh.r rVar = this.j0;
                    if (actionMasked == 2) {
                        if (this.C0 && motionEvent.getPointerCount() == 2 && !this.I0) {
                            float hypot = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                            if (this.D0) {
                                if (this.P != null) {
                                    float dp = (hypot - this.A0) / AndroidUtilities.dp(100.0f);
                                    this.A0 = hypot;
                                    float f7 = this.B0 + dp;
                                    this.B0 = f7;
                                    if (f7 < 0.0f) {
                                        this.B0 = 0.0f;
                                    } else if (f7 > 1.0f) {
                                        this.B0 = 1.0f;
                                    }
                                    fc1Var.b(this.B0, false);
                                    this.b.getSheetContainer().invalidate();
                                    this.P.setZoom(this.B0);
                                    t0(true);
                                    return true;
                                }
                            } else if (Math.abs(hypot - this.A0) >= AndroidUtilities.getPixelsInCM(0.4f, false)) {
                                this.A0 = hypot;
                                this.D0 = true;
                                return true;
                            }
                        } else {
                            float y3 = motionEvent.getY();
                            float f10 = y3 - this.F0;
                            if (this.H0) {
                                if (Math.abs(f10) > AndroidUtilities.getPixelsInCM(0.4f, false)) {
                                    this.H0 = false;
                                    this.I0 = true;
                                    return true;
                                }
                            } else if (this.I0 && (pmVar = this.P) != null) {
                                pmVar.setTranslationY(pmVar.getTranslationY() + f10);
                                this.F0 = y3;
                                fc1Var.setTag(null);
                                Runnable runnable = this.n0;
                                if (runnable != null) {
                                    AndroidUtilities.cancelRunOnUIThread(runnable);
                                    this.n0 = null;
                                }
                                if (rVar.getTag() == null) {
                                    rVar.setTag(1);
                                    AnimatorSet animatorSet = new AnimatorSet();
                                    animatorSet.playTogether(ObjectAnimator.ofFloat(rVar, (Property<bh.r, Float>) property, 0.0f), ObjectAnimator.ofFloat(fc1Var, (Property<fc1, Float>) property, 0.0f), ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f), ObjectAnimator.ofFloat(imageViewArr[0], (Property<ImageView, Float>) property, 0.0f), ObjectAnimator.ofFloat(imageViewArr[1], (Property<ImageView, Float>) property, 0.0f), ObjectAnimator.ofFloat(fmVar, (Property<fm, Float>) property, 0.0f));
                                    animatorSet.setDuration(220L);
                                    animatorSet.setInterpolator(ds.f);
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
                            pm pmVar2 = this.P;
                            if (pmVar2 != null) {
                                if (Math.abs(pmVar2.getTranslationY()) > this.P.getMeasuredHeight() / 6.0f) {
                                    a0(true);
                                    return true;
                                }
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.P, (Property<pm, Float>) View.TRANSLATION_Y, 0.0f), ObjectAnimator.ofFloat(rVar, (Property<bh.r, Float>) property, 1.0f), ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 1.0f), ObjectAnimator.ofFloat(imageViewArr[0], (Property<ImageView, Float>) property, 1.0f), ObjectAnimator.ofFloat(imageViewArr[1], (Property<ImageView, Float>) property, 1.0f), ObjectAnimator.ofFloat(fmVar, (Property<fm, Float>) property, 1.0f));
                                animatorSet2.setDuration(250L);
                                animatorSet2.setInterpolator(this.i0);
                                animatorSet2.start();
                                rVar.setTag(null);
                                return true;
                            }
                        } else {
                            pm pmVar3 = this.P;
                            if (pmVar3 != null && !this.D0) {
                                pmVar3.getLocationOnScreen(this.V);
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
                        FileOutputStream fileOutputStream = new FileOutputStream(new File(ApplicationLoader.getFilesDirFixed(), "cthumb.jpg"));
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
    public final void o() {
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.cameraInitied);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.albumsDidLoad);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        if (this.S0 != i14) {
            this.S0 = i14;
            tm tmVar = this.G;
            if (tmVar != null) {
                tmVar.l();
            }
        }
        super.onLayout(z10, i10, i11, i12, i13);
        V();
    }

    @Override // org.telegram.ui.Components.li
    public final boolean p() {
        if (this.d0) {
            return true;
        }
        if (this.b0) {
            a0(true);
            return true;
        }
        d0(true);
        return false;
    }

    public final void p0(int i10, final boolean z10) {
        PhotoViewer u12 = PhotoViewer.u1();
        if (i10 == -1) {
            i10 = u12.P4;
        }
        ArrayList arrayList = u12.g7;
        if (arrayList == null || arrayList.isEmpty() || i10 >= arrayList.size() || !(arrayList.get(i10) instanceof MediaController.PhotoEntry) || !((MediaController.PhotoEntry) arrayList.get(i10)).hasSpoiler) {
            return;
        }
        final MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList.get(i10);
        this.E.M(new q0.a() { // from class: org.telegram.ui.Components.zl
            @Override // q0.a
            public final void accept(Object obj) {
                View view = (View) obj;
                boolean z11 = ChatAttachAlertPhotoLayout.q1;
                if (view instanceof org.telegram.ui.Cells.x5) {
                    org.telegram.ui.Cells.x5 x5Var = (org.telegram.ui.Cells.x5) view;
                    if (x5Var.getPhotoEntry() == photoEntry) {
                        x5Var.c(z10, Float.valueOf(250.0f));
                        x5Var.f(ChatAttachAlertPhotoLayout.this.getStarsPrice(), ChatAttachAlertPhotoLayout.s1.size() > 1);
                    }
                }
            }
        });
    }

    @Override // org.telegram.ui.Components.li
    public final void q(int i10) {
        d0((i10 == 0 || i10 == 2) ? false : true);
    }

    public final boolean q0() {
        if (this.y0) {
            return true;
        }
        ti tiVar = this.b;
        if (tiVar.F) {
            return false;
        }
        return (tiVar.f0 instanceof org.telegram.ui.un) || tiVar.W0 || tiVar.T0 == 2;
    }

    public final void r0(i9 i9Var, TLRPC.VideoSize videoSize, long j10) {
        ti tiVar = this.b;
        g9 g9Var = new g9(tiVar.U, tiVar.Q);
        e50 e50Var = tiVar.Q;
        g9Var.Q = e50Var == null || e50Var.c != 2;
        tiVar.f0.presentFragment(g9Var);
        if (i9Var != null) {
            g9Var.n0(i9Var);
        }
        if (videoSize != null) {
            g9Var.m0(videoSize);
        }
        if (j10 != 0) {
            g9Var.l0(j10);
        }
        g9Var.I = new p1(13, this, g9Var);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.R0) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.li
    public final void s() {
        pm pmVar = this.P;
        if (pmVar != null) {
            pmVar.setVisibility(8);
        }
        for (Map.Entry entry : s1.entrySet()) {
            if (entry.getValue() instanceof MediaController.PhotoEntry) {
                ((MediaController.PhotoEntry) entry.getValue()).isAttachSpoilerRevealed = false;
            }
        }
        this.G.l();
    }

    public final void s0() {
        ti tiVar = this.b;
        if (!tiVar.i2 && this.v0 && CameraView.isCameraAllowed()) {
            if (this.P == null) {
                boolean z10 = !LiteMode.isEnabled(LiteMode.FLAGS_CHAT);
                Context context = getContext();
                Boolean bool = this.o0;
                pm pmVar = new pm(this, context, bool != null ? bool.booleanValue() : tiVar.X1, z10);
                this.P = pmVar;
                org.telegram.ui.ActionBar.r2 r2Var = tiVar.f0;
                pmVar.setRecordFile(AndroidUtilities.generateVideoPath((r2Var instanceof org.telegram.ui.un) && ((org.telegram.ui.un) r2Var).w()));
                this.P.setFocusable(true);
                this.P.setFpsLimit(30);
                this.P.setOutlineProvider(new eh.b(this, 1));
                this.P.setClipToOutline(true);
                this.P.setContentDescription(LocaleController.getString(R.string.AccDescrInstantCamera));
                org.telegram.ui.ActionBar.h3 container = tiVar.getContainer();
                pm pmVar2 = this.P;
                int i10 = this.K0;
                container.addView(pmVar2, 1, new FrameLayout.LayoutParams(i10, i10));
                this.P.setDelegate(new im(this));
                this.P.setAlpha(this.v0 ? 1.0f : 0.2f);
                this.P.setEnabled(this.v0);
                if (this.N) {
                    this.P.setVisibility(8);
                }
                if (!this.b0) {
                    V();
                }
                fm fmVar = this.E;
                if (fmVar != null) {
                    fmVar.invalidate();
                }
                invalidate();
            }
            fc1 fc1Var = this.l0;
            if (fc1Var != null) {
                fc1Var.b(0.0f, false);
                this.B0 = 0.0f;
            }
            if (this.b0) {
                return;
            }
            this.P.setTranslationX(this.U[0]);
        }
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
        int i12 = AndroidUtilities.displaySize.x;
        ti tiVar = this.b;
        float width = (tiVar.getContainer().getWidth() - tiVar.getLeftInset()) - tiVar.getRightInset();
        float height = tiVar.getContainer().getHeight();
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
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) ((Map.Entry) it.next()).getValue();
                photoEntry.starsAmount = j10;
                photoEntry.hasSpoiler = j10 > 0;
                photoEntry.isChatPreviewSpoilerRevealed = false;
                photoEntry.isAttachSpoilerRevealed = false;
            }
        }
        D(getSelectedItemsCount());
        if (W(false)) {
            x0();
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        ti tiVar = this.b;
        if (tiVar.getSheetAnimationType() == 1) {
            float f10 = (f7 / 40.0f) * (-0.1f);
            fm fmVar = this.E;
            int childCount = fmVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = fmVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.x5) {
                    org.telegram.ui.Cells.x5 x5Var = (org.telegram.ui.Cells.x5) childAt;
                    float f11 = 1.0f + f10;
                    x5Var.getCheckBox().setScaleX(f11);
                    x5Var.getCheckBox().setScaleY(f11);
                }
            }
        }
        super.setTranslationY(f7);
        tiVar.getSheetContainer().invalidate();
        invalidate();
    }

    @Override // org.telegram.ui.Components.li
    public final void t() {
        this.N = true;
        fm fmVar = this.E;
        int childCount = fmVar.getChildCount();
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            }
            if (fmVar.getChildAt(i10) instanceof org.telegram.ui.Cells.q5) {
                n0();
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
        ViewPropertyAnimator withEndAction = this.x.animate().alpha(0.0f).setDuration(150L).setInterpolator(ds.j).withEndAction(new xl(this, 1));
        this.o1 = withEndAction;
        withEndAction.start();
        k0();
    }

    public final void t0(boolean z10) {
        fc1 fc1Var = this.l0;
        if ((fc1Var.getTag() != null && z10) || (fc1Var.getTag() == null && !z10)) {
            if (z10) {
                Runnable runnable = this.n0;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                xl xlVar = new xl(this, 3);
                this.n0 = xlVar;
                AndroidUtilities.runOnUIThread(xlVar, 2000L);
                return;
            }
            return;
        }
        AnimatorSet animatorSet = this.m0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        fc1Var.setTag(z10 ? 1 : null);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.m0 = animatorSet2;
        animatorSet2.setDuration(180L);
        this.m0.playTogether(ObjectAnimator.ofFloat(fc1Var, (Property<fc1, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
        this.m0.addListener(new hm(this, 0));
        this.m0.start();
        if (z10) {
            xl xlVar2 = new xl(this, 4);
            this.n0 = xlVar2;
            AndroidUtilities.runOnUIThread(xlVar2, 2000L);
        }
    }

    @Override // org.telegram.ui.Components.li
    public final void u(float f7) {
        pm pmVar = this.P;
        if (pmVar != null) {
            pmVar.setAlpha(f7);
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

    public final void u0() {
        km kmVar = this.w;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = kmVar.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        if (this.v0) {
            ArrayList<MediaController.AlbumEntry> arrayList = q0() ? MediaController.allMediaAlbums : MediaController.allPhotoAlbums;
            ArrayList arrayList2 = new ArrayList(arrayList);
            this.V0 = arrayList2;
            Collections.sort(arrayList2, new am(arrayList, 0));
        } else {
            this.V0 = new ArrayList();
        }
        boolean isEmpty = this.V0.isEmpty();
        TextView textView = this.x;
        if (isEmpty) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.y, (Drawable) null);
        int size = this.V0.size();
        for (int i10 = 0; i10 < size; i10++) {
            MediaController.AlbumEntry albumEntry = (MediaController.AlbumEntry) this.V0.get(i10);
            fi.a aVar = new fi.a(getContext(), albumEntry.coverPhoto, albumEntry.bucketName, albumEntry.photos.size(), this.a);
            kmVar.getPopupLayout().addView(aVar);
            aVar.setOnClickListener(new ai.w(this, i10 + 10, 12));
        }
    }

    @Override // org.telegram.ui.Components.li
    public final void v(int i10) {
        TLRPC.Chat p12;
        boolean z10;
        boolean z11;
        char c10 = 1;
        char c11 = 1;
        char c12 = 1;
        char c13 = 1;
        ti tiVar = this.b;
        if (i10 == 8) {
            tiVar.N1(!tiVar.c0, true);
            this.d1.a(!tiVar.c0, true);
            return;
        }
        if ((i10 == 0 || i10 == 1) && tiVar.V1 > 0 && t1.size() > 1 && (p12 = tiVar.p1()) != null && !ChatObject.hasAdminRights(p12) && p12.slowmode_enabled) {
            g5.N(getContext(), LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSendError), null, null, this.a).p();
            return;
        }
        org.telegram.ui.ActionBar.u6 u6Var = this.a;
        HashMap hashMap = s1;
        final int i11 = 0;
        if (i10 == 0) {
            MessageObject messageObject = tiVar.K1;
            org.telegram.ui.ActionBar.r2 r2Var = tiVar.f0;
            if (messageObject == null && (r2Var instanceof org.telegram.ui.un) && ((org.telegram.ui.un) r2Var).c()) {
                g5.L(getContext(), ((org.telegram.ui.un) r2Var).a(), new ul(this, c13 == true ? 1 : 0), u6Var);
                return;
            } else {
                g5.Z(tiVar.M1, tiVar.o1() + hashMap.size(), tiVar.s1(), new Utilities.Callback(this) { // from class: org.telegram.ui.Components.vl
                    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        int i12 = i11;
                        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                        Long l4 = (Long) obj;
                        switch (i12) {
                            case 0:
                                boolean z12 = ChatAttachAlertPhotoLayout.q1;
                                ti tiVar2 = chatAttachAlertPhotoLayout.b;
                                tiVar2.e1();
                                tiVar2.c2.p0(7, false, true, 0, 0, 0L, tiVar2.w1(), false, l4.longValue());
                                break;
                            default:
                                boolean z13 = ChatAttachAlertPhotoLayout.q1;
                                ti tiVar3 = chatAttachAlertPhotoLayout.b;
                                tiVar3.e1();
                                tiVar3.c2.p0(4, true, true, 0, 0, 0L, tiVar3.w1(), false, l4.longValue());
                                break;
                        }
                    }
                });
                return;
            }
        }
        int i12 = 2;
        if (i10 == 1) {
            MessageObject messageObject2 = tiVar.K1;
            org.telegram.ui.ActionBar.r2 r2Var2 = tiVar.f0;
            if (messageObject2 == null && (r2Var2 instanceof org.telegram.ui.un) && ((org.telegram.ui.un) r2Var2).c()) {
                g5.L(getContext(), ((org.telegram.ui.un) r2Var2).a(), new ul(this, i12), u6Var);
                return;
            }
            int i13 = tiVar.M1;
            long s12 = tiVar.s1();
            int o12 = tiVar.o1() + hashMap.size();
            final char c14 = c12 == true ? 1 : 0;
            g5.Z(i13, o12, s12, new Utilities.Callback(this) { // from class: org.telegram.ui.Components.vl
                public final /* synthetic */ ChatAttachAlertPhotoLayout b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    int i122 = c14;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                    Long l4 = (Long) obj;
                    switch (i122) {
                        case 0:
                            boolean z12 = ChatAttachAlertPhotoLayout.q1;
                            ti tiVar2 = chatAttachAlertPhotoLayout.b;
                            tiVar2.e1();
                            tiVar2.c2.p0(7, false, true, 0, 0, 0L, tiVar2.w1(), false, l4.longValue());
                            break;
                        default:
                            boolean z13 = ChatAttachAlertPhotoLayout.q1;
                            ti tiVar3 = chatAttachAlertPhotoLayout.b;
                            tiVar3.e1();
                            tiVar3.c2.p0(4, true, true, 0, 0, 0L, tiVar3.w1(), false, l4.longValue());
                            break;
                    }
                }
            });
            return;
        }
        tm tmVar = this.G;
        fm fmVar = this.E;
        if (i10 == 3) {
            cn cnVar = tiVar.q0;
            if (cnVar != null) {
                cnVar.N();
            }
            Iterator it = hashMap.entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((MediaController.PhotoEntry) ((Map.Entry) it.next()).getValue()).hasSpoiler) {
                        z11 = true;
                        break;
                    }
                } else {
                    z11 = false;
                    break;
                }
            }
            final boolean z12 = !z11;
            AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.Components.wl
                public final /* synthetic */ ChatAttachAlertPhotoLayout b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i14 = i11;
                    boolean z13 = z12;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                    switch (i14) {
                        case 0:
                            boolean z14 = ChatAttachAlertPhotoLayout.q1;
                            ti tiVar2 = chatAttachAlertPhotoLayout.b;
                            org.telegram.ui.ActionBar.g1 g1Var = chatAttachAlertPhotoLayout.Y0;
                            g1Var.setText(LocaleController.getString(z13 ? R.string.DisablePhotoSpoiler : R.string.EnablePhotoSpoiler));
                            if (z13) {
                                g1Var.setIcon(R.drawable.msg_spoiler_off);
                            } else {
                                g1Var.setAnimatedIcon(R.raw.photo_spoiler);
                            }
                            if (!z13) {
                                tiVar2.d1.S(1);
                                if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                    tiVar2.d1.S(6);
                                    break;
                                }
                            } else {
                                tiVar2.d1.t(1);
                                if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                    tiVar2.d1.t(6);
                                    break;
                                }
                            }
                            break;
                        default:
                            org.telegram.ui.ActionBar.g1 g1Var2 = chatAttachAlertPhotoLayout.a1;
                            g1Var2.setText(LocaleController.getString(z13 ? R.string.SendInStandardQuality : R.string.SendInHighQuality));
                            if (!z13) {
                                g1Var2.setIcon(R.drawable.menu_quality_hd);
                                break;
                            } else {
                                g1Var2.setIcon(R.drawable.menu_quality_sd);
                                break;
                            }
                    }
                }
            }, 200L);
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : hashMap.entrySet()) {
                if (entry.getValue() instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) entry.getValue();
                    photoEntry.hasSpoiler = z12;
                    photoEntry.isChatPreviewSpoilerRevealed = false;
                    photoEntry.isAttachSpoilerRevealed = false;
                    arrayList.add(Integer.valueOf(photoEntry.imageId));
                }
            }
            fmVar.M(new yl(i11, arrayList, z12));
            if (tiVar.B0 != this) {
                tmVar.l();
            }
            cn cnVar2 = tiVar.q0;
            if (cnVar2 != null) {
                cnVar2.v.invalidate();
                return;
            }
            return;
        }
        if (i10 == 2) {
            cn cnVar3 = tiVar.q0;
            if (cnVar3 != null) {
                cnVar3.N();
            }
            Iterator it2 = hashMap.entrySet().iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((MediaController.PhotoEntry) ((Map.Entry) it2.next()).getValue()).isHighQuality()) {
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
            AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.Components.wl
                public final /* synthetic */ ChatAttachAlertPhotoLayout b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i14 = c15;
                    boolean z132 = z13;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                    switch (i14) {
                        case 0:
                            boolean z14 = ChatAttachAlertPhotoLayout.q1;
                            ti tiVar2 = chatAttachAlertPhotoLayout.b;
                            org.telegram.ui.ActionBar.g1 g1Var = chatAttachAlertPhotoLayout.Y0;
                            g1Var.setText(LocaleController.getString(z132 ? R.string.DisablePhotoSpoiler : R.string.EnablePhotoSpoiler));
                            if (z132) {
                                g1Var.setIcon(R.drawable.msg_spoiler_off);
                            } else {
                                g1Var.setAnimatedIcon(R.raw.photo_spoiler);
                            }
                            if (!z132) {
                                tiVar2.d1.S(1);
                                if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                    tiVar2.d1.S(6);
                                    break;
                                }
                            } else {
                                tiVar2.d1.t(1);
                                if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                    tiVar2.d1.t(6);
                                    break;
                                }
                            }
                            break;
                        default:
                            org.telegram.ui.ActionBar.g1 g1Var2 = chatAttachAlertPhotoLayout.a1;
                            g1Var2.setText(LocaleController.getString(z132 ? R.string.SendInStandardQuality : R.string.SendInHighQuality));
                            if (!z132) {
                                g1Var2.setIcon(R.drawable.menu_quality_hd);
                                break;
                            } else {
                                g1Var2.setIcon(R.drawable.menu_quality_sd);
                                break;
                            }
                    }
                }
            }, 200L);
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry entry2 : hashMap.entrySet()) {
                if (entry2.getValue() instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry2 = (MediaController.PhotoEntry) entry2.getValue();
                    photoEntry2.highQuality = Boolean.valueOf(z13);
                    photoEntry2.isChatPreviewSpoilerRevealed = false;
                    photoEntry2.isAttachSpoilerRevealed = false;
                    arrayList2.add(Integer.valueOf(photoEntry2.imageId));
                }
            }
            fmVar.M(new yl(c10 == true ? 1 : 0, arrayList2, z13));
            if (tiVar.B0 != this) {
                tmVar.l();
            }
            cn cnVar4 = tiVar.q0;
            if (cnVar4 != null) {
                cnVar4.v.invalidate();
                return;
            }
            return;
        }
        if (i10 != 4) {
            if (i10 == 7) {
                tiVar.g2(tiVar.B0 != tiVar.q0);
                return;
            }
            if (i10 == 9) {
                bi.dd.f1(getContext(), getStarsPrice(), true, new d(this, 6), this.a);
                return;
            }
            if (i10 >= 10) {
                MediaController.AlbumEntry albumEntry = (MediaController.AlbumEntry) this.V0.get(i10 - 10);
                this.T0 = albumEntry;
                MediaController.AlbumEntry albumEntry2 = this.U0;
                TextView textView = this.x;
                if (albumEntry == albumEntry2) {
                    textView.setText(LocaleController.getString(R.string.ChatGallery));
                } else {
                    textView.setText(albumEntry.bucketName);
                }
                tmVar.l();
                this.v.l();
                this.F.h1(0, -(fmVar.getPaddingTop() - getTopScrollOffset()));
                return;
            }
            return;
        }
        try {
            if (q0()) {
                Intent intent = new Intent();
                intent.setType("video/*");
                intent.setAction("android.intent.action.GET_CONTENT");
                intent.putExtra("android.intent.extra.sizeLimit", FileLoader.DEFAULT_MAX_FILE_SIZE);
                Intent intent2 = new Intent("android.intent.action.PICK");
                intent2.setType("image/*");
                Intent createChooser = Intent.createChooser(intent2, null);
                createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", new Intent[]{intent});
                int i14 = tiVar.T0;
                org.telegram.ui.ActionBar.r2 r2Var3 = tiVar.f0;
                if (i14 != 0) {
                    r2Var3.startActivityForResult(createChooser, 14);
                } else {
                    r2Var3.startActivityForResult(createChooser, 1);
                }
            } else {
                Intent intent3 = new Intent("android.intent.action.PICK");
                intent3.setType("image/*");
                int i15 = tiVar.T0;
                org.telegram.ui.ActionBar.r2 r2Var4 = tiVar.f0;
                if (i15 != 0) {
                    r2Var4.startActivityForResult(intent3, 14);
                } else {
                    r2Var4.startActivityForResult(intent3, 1);
                }
            }
            tiVar.dismiss(true);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void v0() {
        fm fmVar = this.E;
        if (fmVar != null) {
            for (int i10 = 0; i10 < fmVar.getChildCount(); i10++) {
                View childAt = fmVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.x5) {
                    ((org.telegram.ui.Cells.x5) childAt).a.invalidate();
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.li
    public final void w() {
        ti tiVar = this.b;
        U(tiVar != null && (tiVar.f0 instanceof org.telegram.ui.un));
    }

    public final void w0() {
        ArrayList arrayList;
        if (this.b.f0 instanceof org.telegram.ui.un) {
            fm fmVar = this.E;
            int childCount = fmVar.getChildCount();
            int i10 = 0;
            while (true) {
                arrayList = t1;
                if (i10 >= childCount) {
                    break;
                }
                View childAt = fmVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.x5) {
                    org.telegram.ui.Cells.x5 x5Var = (org.telegram.ui.Cells.x5) childAt;
                    MediaController.PhotoEntry b02 = b0(((Integer) x5Var.getTag()).intValue());
                    if (b02 != null) {
                        x5Var.setNum(arrayList.indexOf(Integer.valueOf(b02.imageId)));
                    }
                }
                i10++;
            }
            fm fmVar2 = this.r;
            int childCount2 = fmVar2.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                View childAt2 = fmVar2.getChildAt(i11);
                if (childAt2 instanceof org.telegram.ui.Cells.x5) {
                    org.telegram.ui.Cells.x5 x5Var2 = (org.telegram.ui.Cells.x5) childAt2;
                    MediaController.PhotoEntry b03 = b0(((Integer) x5Var2.getTag()).intValue());
                    if (b03 != null) {
                        x5Var2.setNum(arrayList.indexOf(Integer.valueOf(b03.imageId)));
                    }
                }
            }
        }
    }

    public final void x0() {
        ArrayList arrayList;
        tm tmVar;
        HashMap hashMap;
        ti tiVar = this.b;
        org.telegram.ui.ActionBar.r2 r2Var = tiVar.f0;
        org.telegram.ui.ActionBar.r2 r2Var2 = tiVar.f0;
        if (r2Var instanceof org.telegram.ui.un) {
            fm fmVar = this.E;
            int childCount = fmVar.getChildCount();
            int i10 = 0;
            while (true) {
                arrayList = t1;
                tmVar = this.G;
                hashMap = s1;
                if (i10 >= childCount) {
                    break;
                }
                View childAt = fmVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.x5) {
                    org.telegram.ui.Cells.x5 x5Var = (org.telegram.ui.Cells.x5) childAt;
                    int R = RecyclerView.R(childAt);
                    if (tmVar.f && R > this.M0) {
                        R--;
                    }
                    if (tmVar.d && this.T0 == this.U0) {
                        R--;
                    }
                    MediaController.PhotoEntry b02 = b0(R);
                    x5Var.setHasSpoiler(b02 != null && b02.hasSpoiler);
                    x5Var.setHighQuality(b02 != null && b02.isHighQuality());
                    if ((r2Var2 instanceof org.telegram.ui.un) && tiVar.W1) {
                        x5Var.b(b02 != null ? arrayList.indexOf(Integer.valueOf(b02.imageId)) : -1, b02 != null && hashMap.containsKey(Integer.valueOf(b02.imageId)), true);
                    } else {
                        x5Var.b(-1, b02 != null && hashMap.containsKey(Integer.valueOf(b02.imageId)), true);
                    }
                }
                i10++;
            }
            fm fmVar2 = this.r;
            int childCount2 = fmVar2.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                View childAt2 = fmVar2.getChildAt(i11);
                if (childAt2 instanceof org.telegram.ui.Cells.x5) {
                    org.telegram.ui.Cells.x5 x5Var2 = (org.telegram.ui.Cells.x5) childAt2;
                    int R2 = RecyclerView.R(childAt2);
                    if (tmVar.f && R2 > this.M0) {
                        R2--;
                    }
                    if (tmVar.d && this.T0 == this.U0) {
                        R2--;
                    }
                    MediaController.PhotoEntry b03 = b0(R2);
                    x5Var2.setHasSpoiler(b03 != null && b03.hasSpoiler);
                    x5Var2.setHighQuality(b03 != null && b03.isHighQuality());
                    if ((r2Var2 instanceof org.telegram.ui.un) && tiVar.W1) {
                        x5Var2.b(b03 != null ? arrayList.indexOf(Integer.valueOf(b03.imageId)) : -1, b03 != null && hashMap.containsKey(Integer.valueOf(b03.imageId)), true);
                    } else {
                        x5Var2.b(-1, b03 != null && hashMap.containsKey(Integer.valueOf(b03.imageId)), true);
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.li
    public final void y(int i10, boolean z10) {
        V();
        pm pmVar = this.P;
        if (pmVar != null) {
            pmVar.invalidateOutline();
            this.P.invalidate();
        }
    }

    public final void y0(boolean z10) {
        TextView textView = this.p0;
        if (textView != null) {
            ti tiVar = this.b;
            int i10 = tiVar.T0;
            TextView textView2 = tiVar.m1;
            if (i10 != 0 || tiVar.W0 || tiVar.H) {
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
                if (((MediaController.PhotoEntry) ((Map.Entry) it.next()).getValue()).isVideo) {
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
                textView.setText(LocaleController.formatPluralString("Media", hashMap.size(), new Object[0]).toUpperCase());
                if (max != this.M || z10) {
                    textView2.setText(LocaleController.formatPluralString("MediaSelected", max, new Object[0]));
                }
            } else if (z11) {
                textView.setText(LocaleController.formatPluralString("Videos", hashMap.size(), new Object[0]).toUpperCase());
                if (max != this.M || z10) {
                    textView2.setText(LocaleController.formatPluralString("VideosSelected", max, new Object[0]));
                }
            } else {
                textView.setText(LocaleController.formatPluralString("Photos", hashMap.size(), new Object[0]).toUpperCase());
                if (max != this.M || z10) {
                    textView2.setText(LocaleController.formatPluralString("PhotosSelected", max, new Object[0]));
                }
            }
            boolean z13 = max > 1;
            tiVar.M = z13;
            tiVar.p1.setVisibility((!z13 || tiVar.T0 == 2) ? 8 : 0);
            this.M = max;
        }
    }
}
