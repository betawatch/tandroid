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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class ChatAttachAlertPhotoLayout extends ci implements NotificationCenter.NotificationCenterDelegate {
    public static boolean m1;
    public static final ArrayList n1 = new ArrayList();
    public static final HashMap o1 = new HashMap();
    public static final ArrayList p1 = new ArrayList();
    public static int q1 = -1;
    public final kl A;
    public final Rect A0;
    public final jh.k B;
    public float B0;
    public final yl C;
    public boolean C0;
    public final yy D;
    public boolean D0;
    public final yk0 E;
    public boolean E0;
    public int F;
    public boolean F0;
    public boolean G;
    public int G0;
    public int H;
    public int H0;
    public int I;
    public int I0;
    public boolean J;
    public boolean J0;
    public AnimatorSet K;
    public boolean K0;
    public ul L;
    public boolean L0;
    public final vl M;
    public boolean M0;
    public final sl N;
    public boolean N0;
    public final ImageView[] O;
    public int O0;
    public boolean P;
    public MediaController.AlbumEntry P0;
    public final float[] Q;
    public MediaController.AlbumEntry Q0;
    public final int[] R;
    public ArrayList R0;
    public float S;
    public float S0;
    public float T;
    public boolean T0;
    public boolean U;
    public final org.telegram.ui.ActionBar.g1 U0;
    public boolean V;
    public final org.telegram.ui.ActionBar.g1 V0;
    public boolean W;
    public final org.telegram.ui.ActionBar.g1 W0;
    public final org.telegram.ui.ActionBar.g1 X0;
    public final org.telegram.ui.ActionBar.g1 Y0;
    public final bb0 Z0;
    public float a0;
    public final boolean a1;
    public final int[] b0;
    public final AnimationNotificationsLocker b1;
    public int c0;
    public boolean c1;
    public hl d0;
    public final ol d1;
    public final DecelerateInterpolator e0;
    public boolean e1;
    public final fh.d2 f0;
    public float f1;
    public final ShutterButton g0;
    public float g1;
    public final i81 h0;
    public float h1;
    public AnimatorSet i0;
    public float i1;
    public Runnable j0;
    public float j1;
    public Boolean k0;
    public ViewPropertyAnimator k1;
    public final TextView l0;
    public int l1;
    public final TextView m0;
    public final boolean n;
    public final ImageView n0;
    public boolean o0;
    public boolean p0;
    public boolean q0;
    public final kl r;
    public boolean r0;
    public final of.y s;
    public boolean s0;
    public boolean t0;
    public boolean u0;
    public final yl v;
    public boolean v0;
    public final pl w;
    public float w0;
    public final TextView x;
    public float x0;
    public final Drawable y;
    public boolean y0;
    public boolean z0;

    /* JADX WARN: Multi-variable type inference failed */
    public ChatAttachAlertPhotoLayout(ki kiVar, Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var, kiVar);
        this.O = new ImageView[2];
        this.Q = new float[2];
        this.R = new int[2];
        this.b0 = new int[5];
        this.e0 = new DecelerateInterpolator(1.5f);
        this.k0 = null;
        this.A0 = new Rect();
        int dp = AndroidUtilities.dp(80.0f);
        this.G0 = dp;
        this.H0 = dp;
        this.I0 = 3;
        this.T0 = true;
        this.b1 = new AnimationNotificationsLocker();
        this.d1 = new ol(this);
        this.a1 = z10;
        this.n = z11;
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.cameraInitied);
        org.telegram.ui.ActionBar.d3 container = kiVar.getContainer();
        ki kiVar2 = this.b;
        int i9 = 0;
        this.c1 = kiVar2.M0 != 0;
        pl plVar = new pl(this, context, kiVar2.T0.n(), b6Var, 0);
        this.w = plVar;
        plVar.setSubMenuOpenSide(1);
        FrameLayout.LayoutParams d = g7.e6.d(-2, -1.0f, 51, 60.0f, 0.0f, 40.0f, 0.0f);
        d.topMargin = AndroidUtilities.statusBarHeight;
        this.b.T0.addView(plVar, 0, d);
        final int i10 = 3;
        plVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.yk
            public final /* synthetic */ ChatAttachAlertPhotoLayout b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ul ulVar;
                ul ulVar2;
                int i11 = i10;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                switch (i11) {
                    case 0:
                        if (chatAttachAlertPhotoLayout.L != null) {
                            chatAttachAlertPhotoLayout.i0(null, false, false);
                            CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.L.getCameraSessionObject());
                            break;
                        }
                        break;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.o0 && (ulVar = chatAttachAlertPhotoLayout.L) != null && ulVar.isInited()) {
                            chatAttachAlertPhotoLayout.V = false;
                            chatAttachAlertPhotoLayout.L.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.n0, (Property<ImageView, Float>) View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new jl(chatAttachAlertPhotoLayout));
                            duration.start();
                            break;
                        }
                        break;
                    case 2:
                        if (!chatAttachAlertPhotoLayout.P && (ulVar2 = chatAttachAlertPhotoLayout.L) != null && ulVar2.isInited() && chatAttachAlertPhotoLayout.U) {
                            String currentFlashMode = chatAttachAlertPhotoLayout.L.getCameraSession().getCurrentFlashMode();
                            String nextFlashMode = chatAttachAlertPhotoLayout.L.getCameraSession().getNextFlashMode();
                            if (!currentFlashMode.equals(nextFlashMode)) {
                                chatAttachAlertPhotoLayout.L.getCameraSession().setCurrentFlashMode(nextFlashMode);
                                chatAttachAlertPhotoLayout.P = true;
                                ImageView[] imageViewArr = chatAttachAlertPhotoLayout.O;
                                ImageView imageView = imageViewArr[0];
                                if (imageView == view) {
                                    imageView = imageViewArr[1];
                                }
                                imageView.setVisibility(0);
                                ChatAttachAlertPhotoLayout.n0(imageView, nextFlashMode);
                                AnimatorSet animatorSet = new AnimatorSet();
                                Property property = View.TRANSLATION_Y;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 0.0f, AndroidUtilities.dp(48.0f));
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, -AndroidUtilities.dp(48.0f), 0.0f);
                                Property property2 = View.ALPHA;
                                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property2, 0.0f, 1.0f));
                                animatorSet.setDuration(220L);
                                animatorSet.setInterpolator(gr.f);
                                animatorSet.addListener(new ih.j3(chatAttachAlertPhotoLayout, view, imageView, 3));
                                animatorSet.start();
                                break;
                            }
                        }
                        break;
                    default:
                        chatAttachAlertPhotoLayout.w.M(null, null);
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
        int i11 = org.telegram.ui.ActionBar.f6.j5;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(i11, this.a));
        textView.setText(LocaleController.getString(R.string.ChatGallery));
        textView.setTypeface(AndroidUtilities.bold());
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_arrow_drop_down).mutate();
        this.y = mutate;
        int v02 = org.telegram.ui.ActionBar.f6.v0(i11, this.a);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(v02, mode));
        textView.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
        plVar.addView(textView, g7.e6.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
        T(false);
        bb0 bb0Var = new bb0(context, R.raw.position_below, LocaleController.getString(R.string.CaptionAbove), R.raw.position_above, LocaleController.getString(R.string.CaptionBelow), b6Var);
        this.Z0 = bb0Var;
        bb0Var.a(!this.b.Y, false);
        this.Y0 = this.b.W0.e(7, R.drawable.msg_view_file, LocaleController.getString(R.string.AttachMediaPreviewButton));
        this.b.W0.a(5);
        this.b.W0.e(4, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp));
        this.V0 = this.b.W0.e(1, R.drawable.msg_filehq, LocaleController.getString(R.string.SendWithoutCompression));
        this.b.W0.e(0, R.drawable.msg_ungroup, LocaleController.getString(R.string.SendWithoutGrouping));
        this.b.W0.a(6);
        this.U0 = this.b.W0.e(3, R.drawable.msg_spoiler, LocaleController.getString(R.string.EnablePhotoSpoiler));
        this.W0 = this.b.W0.e(2, R.drawable.menu_quality_hd, LocaleController.getString(R.string.SendInHighQuality));
        org.telegram.ui.ActionBar.w0 w0Var = this.b.W0;
        w0Var.o();
        bb0Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
        bb0Var.setTag(8);
        w0Var.b.addView(bb0Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) bb0Var.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(48.0f);
        bb0Var.setLayoutParams(layoutParams);
        bb0Var.setOnClickListener(new org.telegram.ui.ActionBar.b0(w0Var, 2));
        this.X0 = this.b.W0.e(9, R.drawable.menu_feature_paid, LocaleController.getString(R.string.PaidMediaButton));
        this.b.W0.setFitSubItems(true);
        kl klVar = new kl(this, context, b6Var, 1);
        this.A = klVar;
        klVar.setFastScrollEnabled(1);
        klVar.setFastScrollVisible(true);
        klVar.getFastScroll().setAlpha(0.0f);
        klVar.getFastScroll().a = false;
        klVar.getFastScroll().d0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        yl ylVar = new yl(this, context, z11);
        this.C = ylVar;
        klVar.setAdapter(ylVar);
        vl vlVar = new vl(this, klVar);
        this.M = vlVar;
        klVar.i(vlVar);
        for (int i12 = 0; i12 < 8; i12++) {
            ylVar.h.add(ylVar.L());
        }
        klVar.setClipToPadding(false);
        klVar.setItemAnimator(null);
        klVar.setLayoutAnimation(null);
        klVar.setVerticalScrollBarEnabled(false);
        klVar.setGlowColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.A5, this.a));
        addView(klVar, g7.e6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, -48.0f));
        klVar.setOnScrollListener(new kh.g9(this, 2));
        jh.k kVar = new jh.k(this, this.G0, 2);
        this.B = kVar;
        kVar.O = new fh.c6(this, 5);
        klVar.setLayoutManager(kVar);
        klVar.setOnItemClickListener(new b5.e(this, z11, b6Var, 6));
        klVar.setOnItemLongClickListener(new zk(this, 3));
        yk0 yk0Var = new yk0(new rl(this));
        this.E = yk0Var;
        klVar.A.add(yk0Var);
        this.c = klVar;
        this.d = klVar;
        this.f = true;
        yy yyVar = new yy(context, b6Var);
        this.D = yyVar;
        yyVar.setText(LocaleController.getString(R.string.NoPhotos));
        yyVar.setOnTouchListener(null);
        yyVar.setTextSize(16);
        addView(yyVar, g7.e6.c(-2.0f, -1));
        if (this.T0) {
            yyVar.b();
        } else {
            yyVar.c();
        }
        Paint paint = new Paint(1);
        paint.setColor(-2468275);
        sl slVar = new sl(context, paint);
        this.N = slVar;
        AndroidUtilities.updateViewVisibilityAnimated(slVar, false, 1.0f, false);
        slVar.setBackgroundResource(R.drawable.system);
        slVar.getBackground().setColorFilter(new PorterDuffColorFilter(1711276032, mode));
        slVar.setTextSize(1, 15.0f);
        slVar.setTypeface(AndroidUtilities.bold());
        slVar.setAlpha(0.0f);
        slVar.setTextColor(-1);
        slVar.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f));
        container.addView(slVar, g7.e6.d(-2, -2.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
        fh.d2 d2Var = new fh.d2(this, context, 13);
        this.f0 = d2Var;
        d2Var.setVisibility(8);
        d2Var.setAlpha(0.0f);
        container.addView(d2Var, g7.e6.e(-1, 126, 83));
        TextView textView2 = new TextView(context);
        this.l0 = textView2;
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
        container.addView(textView2, g7.e6.d(-2, 38.0f, 51, 0.0f, 0.0f, 0.0f, 116.0f));
        final int i13 = 0;
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.yk
            public final /* synthetic */ ChatAttachAlertPhotoLayout b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ul ulVar;
                ul ulVar2;
                int i112 = i13;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                switch (i112) {
                    case 0:
                        if (chatAttachAlertPhotoLayout.L != null) {
                            chatAttachAlertPhotoLayout.i0(null, false, false);
                            CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.L.getCameraSessionObject());
                            break;
                        }
                        break;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.o0 && (ulVar = chatAttachAlertPhotoLayout.L) != null && ulVar.isInited()) {
                            chatAttachAlertPhotoLayout.V = false;
                            chatAttachAlertPhotoLayout.L.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.n0, (Property<ImageView, Float>) View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new jl(chatAttachAlertPhotoLayout));
                            duration.start();
                            break;
                        }
                        break;
                    case 2:
                        if (!chatAttachAlertPhotoLayout.P && (ulVar2 = chatAttachAlertPhotoLayout.L) != null && ulVar2.isInited() && chatAttachAlertPhotoLayout.U) {
                            String currentFlashMode = chatAttachAlertPhotoLayout.L.getCameraSession().getCurrentFlashMode();
                            String nextFlashMode = chatAttachAlertPhotoLayout.L.getCameraSession().getNextFlashMode();
                            if (!currentFlashMode.equals(nextFlashMode)) {
                                chatAttachAlertPhotoLayout.L.getCameraSession().setCurrentFlashMode(nextFlashMode);
                                chatAttachAlertPhotoLayout.P = true;
                                ImageView[] imageViewArr = chatAttachAlertPhotoLayout.O;
                                ImageView imageView = imageViewArr[0];
                                if (imageView == view) {
                                    imageView = imageViewArr[1];
                                }
                                imageView.setVisibility(0);
                                ChatAttachAlertPhotoLayout.n0(imageView, nextFlashMode);
                                AnimatorSet animatorSet = new AnimatorSet();
                                Property property = View.TRANSLATION_Y;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 0.0f, AndroidUtilities.dp(48.0f));
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, -AndroidUtilities.dp(48.0f), 0.0f);
                                Property property2 = View.ALPHA;
                                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property2, 0.0f, 1.0f));
                                animatorSet.setDuration(220L);
                                animatorSet.setInterpolator(gr.f);
                                animatorSet.addListener(new ih.j3(chatAttachAlertPhotoLayout, view, imageView, 3));
                                animatorSet.start();
                                break;
                            }
                        }
                        break;
                    default:
                        chatAttachAlertPhotoLayout.w.M(null, null);
                        break;
                }
            }
        });
        i81 i81Var = new i81(context);
        this.h0 = i81Var;
        i81Var.setVisibility(8);
        i81Var.setAlpha(0.0f);
        container.addView(i81Var, g7.e6.d(-2, 50.0f, 51, 0.0f, 0.0f, 0.0f, 116.0f));
        i81Var.setDelegate(new zk(this, i13));
        ShutterButton shutterButton = new ShutterButton(context);
        shutterButton.b = new DecelerateInterpolator();
        shutterButton.w = new ju0(shutterButton, i13);
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
        shutterButton.f = lu0.a;
        this.g0 = shutterButton;
        d2Var.addView(shutterButton, g7.e6.e(84, 84, 17));
        shutterButton.setDelegate(new il(this, b6Var, container));
        shutterButton.setFocusable(true);
        shutterButton.setContentDescription(LocaleController.getString(R.string.AccDescrShutter));
        ImageView imageView = new ImageView(context);
        this.n0 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        d2Var.addView(imageView, g7.e6.e(48, 48, 21));
        final int i14 = 1;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.yk
            public final /* synthetic */ ChatAttachAlertPhotoLayout b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ul ulVar;
                ul ulVar2;
                int i112 = i14;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                switch (i112) {
                    case 0:
                        if (chatAttachAlertPhotoLayout.L != null) {
                            chatAttachAlertPhotoLayout.i0(null, false, false);
                            CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.L.getCameraSessionObject());
                            break;
                        }
                        break;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.o0 && (ulVar = chatAttachAlertPhotoLayout.L) != null && ulVar.isInited()) {
                            chatAttachAlertPhotoLayout.V = false;
                            chatAttachAlertPhotoLayout.L.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.n0, (Property<ImageView, Float>) View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new jl(chatAttachAlertPhotoLayout));
                            duration.start();
                            break;
                        }
                        break;
                    case 2:
                        if (!chatAttachAlertPhotoLayout.P && (ulVar2 = chatAttachAlertPhotoLayout.L) != null && ulVar2.isInited() && chatAttachAlertPhotoLayout.U) {
                            String currentFlashMode = chatAttachAlertPhotoLayout.L.getCameraSession().getCurrentFlashMode();
                            String nextFlashMode = chatAttachAlertPhotoLayout.L.getCameraSession().getNextFlashMode();
                            if (!currentFlashMode.equals(nextFlashMode)) {
                                chatAttachAlertPhotoLayout.L.getCameraSession().setCurrentFlashMode(nextFlashMode);
                                chatAttachAlertPhotoLayout.P = true;
                                ImageView[] imageViewArr = chatAttachAlertPhotoLayout.O;
                                ImageView imageView2 = imageViewArr[0];
                                if (imageView2 == view) {
                                    imageView2 = imageViewArr[1];
                                }
                                imageView2.setVisibility(0);
                                ChatAttachAlertPhotoLayout.n0(imageView2, nextFlashMode);
                                AnimatorSet animatorSet = new AnimatorSet();
                                Property property = View.TRANSLATION_Y;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 0.0f, AndroidUtilities.dp(48.0f));
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, -AndroidUtilities.dp(48.0f), 0.0f);
                                Property property2 = View.ALPHA;
                                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 0.0f, 1.0f));
                                animatorSet.setDuration(220L);
                                animatorSet.setInterpolator(gr.f);
                                animatorSet.addListener(new ih.j3(chatAttachAlertPhotoLayout, view, imageView2, 3));
                                animatorSet.start();
                                break;
                            }
                        }
                        break;
                    default:
                        chatAttachAlertPhotoLayout.w.M(null, null);
                        break;
                }
            }
        });
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        for (int i15 = 0; i15 < 2; i15++) {
            this.O[i15] = new ImageView(context);
            this.O[i15].setScaleType(ImageView.ScaleType.CENTER);
            this.O[i15].setVisibility(4);
            this.f0.addView(this.O[i15], g7.e6.e(48, 48, 51));
            final int i16 = 2;
            this.O[i15].setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.yk
                public final /* synthetic */ ChatAttachAlertPhotoLayout b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ul ulVar;
                    ul ulVar2;
                    int i112 = i16;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                    switch (i112) {
                        case 0:
                            if (chatAttachAlertPhotoLayout.L != null) {
                                chatAttachAlertPhotoLayout.i0(null, false, false);
                                CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.L.getCameraSessionObject());
                                break;
                            }
                            break;
                        case 1:
                            if (!chatAttachAlertPhotoLayout.o0 && (ulVar = chatAttachAlertPhotoLayout.L) != null && ulVar.isInited()) {
                                chatAttachAlertPhotoLayout.V = false;
                                chatAttachAlertPhotoLayout.L.switchCamera();
                                ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.n0, (Property<ImageView, Float>) View.SCALE_X, 0.0f).setDuration(100L);
                                duration.addListener(new jl(chatAttachAlertPhotoLayout));
                                duration.start();
                                break;
                            }
                            break;
                        case 2:
                            if (!chatAttachAlertPhotoLayout.P && (ulVar2 = chatAttachAlertPhotoLayout.L) != null && ulVar2.isInited() && chatAttachAlertPhotoLayout.U) {
                                String currentFlashMode = chatAttachAlertPhotoLayout.L.getCameraSession().getCurrentFlashMode();
                                String nextFlashMode = chatAttachAlertPhotoLayout.L.getCameraSession().getNextFlashMode();
                                if (!currentFlashMode.equals(nextFlashMode)) {
                                    chatAttachAlertPhotoLayout.L.getCameraSession().setCurrentFlashMode(nextFlashMode);
                                    chatAttachAlertPhotoLayout.P = true;
                                    ImageView[] imageViewArr = chatAttachAlertPhotoLayout.O;
                                    ImageView imageView2 = imageViewArr[0];
                                    if (imageView2 == view) {
                                        imageView2 = imageViewArr[1];
                                    }
                                    imageView2.setVisibility(0);
                                    ChatAttachAlertPhotoLayout.n0(imageView2, nextFlashMode);
                                    AnimatorSet animatorSet = new AnimatorSet();
                                    Property property = View.TRANSLATION_Y;
                                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 0.0f, AndroidUtilities.dp(48.0f));
                                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, -AndroidUtilities.dp(48.0f), 0.0f);
                                    Property property2 = View.ALPHA;
                                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 0.0f, 1.0f));
                                    animatorSet.setDuration(220L);
                                    animatorSet.setInterpolator(gr.f);
                                    animatorSet.addListener(new ih.j3(chatAttachAlertPhotoLayout, view, imageView2, 3));
                                    animatorSet.start();
                                    break;
                                }
                            }
                            break;
                        default:
                            chatAttachAlertPhotoLayout.w.M(null, null);
                            break;
                    }
                }
            });
            this.O[i15].setContentDescription("flash mode " + i15);
        }
        TextView textView3 = new TextView(context);
        this.m0 = textView3;
        textView3.setTextSize(1, 15.0f);
        textView3.setTextColor(-1);
        textView3.setShadowLayer(org.telegram.ui.Cells.j2.c(3.33333f, R.string.TapForVideo, textView3), 0.0f, AndroidUtilities.dp(0.666f), 1275068416);
        textView3.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        this.f0.addView(textView3, g7.e6.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        kl klVar2 = new kl(this, context, b6Var, 0);
        this.r = klVar2;
        klVar2.setVerticalScrollBarEnabled(true);
        yl ylVar2 = new yl(this, context, false);
        this.v = ylVar2;
        klVar2.setAdapter(ylVar2);
        for (int i17 = 0; i17 < 8; i17++) {
            ylVar2.h.add(ylVar2.L());
        }
        klVar2.setClipToPadding(false);
        klVar2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        klVar2.setItemAnimator(null);
        klVar2.setLayoutAnimation(null);
        klVar2.setOverScrollMode(2);
        klVar2.setVisibility(4);
        klVar2.setAlpha(0.0f);
        container.addView(klVar2, g7.e6.c(80.0f, -1));
        of.y yVar = new of.y(i9, null == true ? 1 : 0, 6);
        this.s = yVar;
        klVar2.setLayoutManager(yVar);
        klVar2.setOnItemClickListener(new fh.a(3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x015a, code lost:
    
        if (r4.S != false) goto L93;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void J(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10, org.telegram.ui.ActionBar.b6 b6Var, View view, int i9) {
        org.telegram.ui.qn qnVar;
        boolean z11;
        Object obj;
        Object obj2;
        int i10 = i9;
        yl ylVar = chatAttachAlertPhotoLayout.C;
        ki kiVar = chatAttachAlertPhotoLayout.b;
        if (chatAttachAlertPhotoLayout.r0) {
            boolean z12 = kiVar.R;
            org.telegram.ui.ActionBar.o2 o2Var = kiVar.b0;
            if (z12) {
                return;
            }
            org.telegram.ui.ActionBar.o2 R = o2Var == null ? LaunchActivity.R() : o2Var;
            if (R == null || (view instanceof r10)) {
                return;
            }
            int i11 = Build.VERSION.SDK_INT;
            int i12 = 4;
            if (i11 >= 23) {
                try {
                    if (ylVar.d && chatAttachAlertPhotoLayout.P0 == chatAttachAlertPhotoLayout.Q0 && i10 == 0 && chatAttachAlertPhotoLayout.K0) {
                        R.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 18);
                        return;
                    } else if (chatAttachAlertPhotoLayout.L0) {
                        if (i11 >= 33) {
                            R.getParentActivity().requestPermissions(new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES"}, 4);
                            return;
                        } else {
                            R.getParentActivity().requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                            return;
                        }
                    }
                } catch (Exception unused) {
                    return;
                }
            }
            boolean z13 = ylVar.f;
            if (z13 && i10 == chatAttachAlertPhotoLayout.I0) {
                chatAttachAlertPhotoLayout.h0();
                return;
            }
            if (i10 == 0 && z10 && chatAttachAlertPhotoLayout.P0 == chatAttachAlertPhotoLayout.Q0) {
                chatAttachAlertPhotoLayout.h0();
                return;
            }
            if (z13 && i10 > chatAttachAlertPhotoLayout.I0) {
                i10--;
            }
            if (chatAttachAlertPhotoLayout.P0 == chatAttachAlertPhotoLayout.Q0 && z10) {
                i10--;
            }
            org.telegram.ui.qn qnVar2 = null;
            if (chatAttachAlertPhotoLayout.c1) {
                if (i10 == 0) {
                    if (!(view instanceof y8)) {
                        return;
                    }
                    chatAttachAlertPhotoLayout.q0((y8) view, null, 0L);
                    kiVar.dismiss();
                }
                i10--;
            }
            ArrayList<Object> allPhotosArray = chatAttachAlertPhotoLayout.getAllPhotosArray();
            if (i10 < 0 || i10 >= allPhotosArray.size()) {
                return;
            }
            ii iiVar = kiVar.V1;
            ArrayList arrayList = p1;
            HashMap hashMap = o1;
            if (iiVar != null && iiVar.t0() && (allPhotosArray.get(i10) instanceof MediaController.PhotoEntry)) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) allPhotosArray.get(i10);
                hashMap.clear();
                if (photoEntry != null) {
                    chatAttachAlertPhotoLayout.P(photoEntry, -1);
                }
                kiVar.Y0();
                kiVar.V1.L(7, true, true, 0, 0, 0L, kiVar.s1(), false, 0L);
                hashMap.clear();
                n1.clear();
                arrayList.clear();
                hashMap.clear();
                return;
            }
            PhotoViewer.t1().K2(null, R, b6Var);
            PhotoViewer.t1().L2(kiVar);
            PhotoViewer t12 = PhotoViewer.t1();
            int i13 = kiVar.O1;
            boolean z14 = kiVar.P1;
            t12.h = i13;
            t12.n = z14;
            if (!kiVar.B || !kiVar.C) {
                if (kiVar.M0 != 0) {
                    qnVar = null;
                    i12 = 1;
                } else {
                    if (o2Var instanceof org.telegram.ui.qn) {
                        qnVar2 = (org.telegram.ui.qn) o2Var;
                    }
                    qnVar = qnVar2;
                    i12 = 0;
                }
                if (!kiVar.V1.j()) {
                    AndroidUtilities.hideKeyboard(R.getFragmentView().findFocus());
                    AndroidUtilities.hideKeyboard(kiVar.getContainer().findFocus());
                }
                if (hashMap.size() > 0 && arrayList.size() > 0) {
                    obj2 = hashMap.get(arrayList.get(0));
                    if (obj2 instanceof MediaController.PhotoEntry) {
                        ((MediaController.PhotoEntry) obj2).caption = kiVar.m1().getText();
                    }
                    if (obj2 instanceof MediaController.SearchImage) {
                        ((MediaController.SearchImage) obj2).caption = kiVar.m1().getText();
                    }
                }
                if (kiVar.M != null) {
                    kiVar.M.e = allPhotosArray.get(i10) instanceof MediaController.PhotoEntry ? ((MediaController.PhotoEntry) allPhotosArray.get(i10)).isVideo : false;
                }
                z11 = !(allPhotosArray.get(i10) instanceof MediaController.PhotoEntry) && ((MediaController.PhotoEntry) allPhotosArray.get(i10)).hasSpoiler;
                obj = allPhotosArray.get(i10);
                if ((obj instanceof MediaController.PhotoEntry) || !chatAttachAlertPhotoLayout.W((MediaController.PhotoEntry) obj)) {
                    if (z11) {
                        chatAttachAlertPhotoLayout.o0(i10, false);
                    }
                    AndroidUtilities.runOnUIThread(new kj(chatAttachAlertPhotoLayout, i12, R, allPhotosArray, i10, qnVar), z11 ? 250L : 0L);
                }
                return;
            }
            i12 = 11;
            if (o2Var instanceof org.telegram.ui.qn) {
                qnVar2 = (org.telegram.ui.qn) o2Var;
            }
            qnVar = qnVar2;
            if (!kiVar.V1.j()) {
            }
            if (hashMap.size() > 0) {
                obj2 = hashMap.get(arrayList.get(0));
                if (obj2 instanceof MediaController.PhotoEntry) {
                }
                if (obj2 instanceof MediaController.SearchImage) {
                }
            }
            if (kiVar.M != null) {
            }
            if (allPhotosArray.get(i10) instanceof MediaController.PhotoEntry) {
            }
            obj = allPhotosArray.get(i10);
            if (obj instanceof MediaController.PhotoEntry) {
            }
            if (z11) {
            }
            AndroidUtilities.runOnUIThread(new kj(chatAttachAlertPhotoLayout, i12, R, allPhotosArray, i10, qnVar), z11 ? 250L : 0L);
        }
    }

    public static org.telegram.ui.Cells.t5 K(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i9) {
        kl klVar = chatAttachAlertPhotoLayout.A;
        int childCount = klVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = klVar.getChildAt(i10);
            if (childAt.getTop() < klVar.getMeasuredHeight() - chatAttachAlertPhotoLayout.b.l1() && (childAt instanceof org.telegram.ui.Cells.t5)) {
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                if (t5Var.getImageView().getTag() != null && ((Integer) t5Var.getImageView().getTag()).intValue() == i9) {
                    return t5Var;
                }
            }
        }
        return null;
    }

    public static int M(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        ki kiVar = chatAttachAlertPhotoLayout.b;
        org.telegram.ui.ActionBar.o2 o2Var = kiVar.b0;
        return ((o2Var instanceof org.telegram.ui.qn) && ((org.telegram.ui.qn) o2Var).N3 == 5) ? o2Var.getMessagesController().config.quickReplyMessagesLimit.get() - ((org.telegram.ui.qn) kiVar.b0).q6.size() : ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    public static void N(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        ki kiVar = chatAttachAlertPhotoLayout.b;
        try {
            int i9 = Build.VERSION.SDK_INT;
            if (i9 >= 33) {
                kiVar.b0.getParentActivity().requestPermissions(new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES"}, 4);
            } else if (i9 >= 23) {
                kiVar.b0.getParentActivity().requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
            }
        } catch (Exception unused) {
        }
    }

    public static void O(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        ki kiVar = chatAttachAlertPhotoLayout.b;
        if (Build.VERSION.SDK_INT < 23 || f0.e.b(kiVar.b0.getParentActivity(), "android.permission.CAMERA") == 0) {
            chatAttachAlertPhotoLayout.h0();
        } else {
            try {
                kiVar.b0.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 18);
            } catch (Exception unused) {
            }
        }
    }

    public static boolean R() {
        HashMap hashMap = o1;
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

    public static boolean S() {
        int i9 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = p1;
            if (i9 >= arrayList.size()) {
                break;
            }
            Object obj = o1.get(arrayList.get(i9));
            if (!TextUtils.isEmpty(obj instanceof MediaController.PhotoEntry ? ((MediaController.PhotoEntry) obj).caption : obj instanceof MediaController.SearchImage ? ((MediaController.SearchImage) obj).caption : null)) {
                i10++;
            }
            i9++;
        }
        return i10 <= 1;
    }

    public static boolean b0() {
        HashMap hashMap = o1;
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
        return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.dp(7.0f) + this.l1;
    }

    public static void n0(ImageView imageView, String str) {
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

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b3, code lost:
    
        if (((org.telegram.ui.qn) r2).w() == false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ba A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0159 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01e0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0192  */
    @Override // org.telegram.ui.Components.ci
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A(int i9) {
        boolean z10;
        boolean z11;
        boolean z12;
        long j10;
        boolean z13;
        boolean z14;
        org.telegram.ui.ActionBar.o2 o2Var;
        TLRPC.ChatFull chatFull;
        boolean z15;
        long j11 = 0;
        ki kiVar = this.b;
        if (i9 > 1) {
            MessageObject messageObject = kiVar.D1;
            org.telegram.ui.ActionBar.w0 w0Var = kiVar.W0;
            if (messageObject == null) {
                if (getStarsPrice() <= 0) {
                    w0Var.K(0);
                    z10 = true;
                } else {
                    w0Var.r(0);
                    z10 = false;
                }
                if (!this.v0 || getStarsPrice() > 0) {
                    w0Var.r(1);
                    z11 = false;
                    if (i9 != 0) {
                        kiVar.W0.r(4);
                    }
                    org.telegram.ui.ActionBar.g1 g1Var = this.V0;
                    if (i9 <= 1) {
                        kiVar.W0.K(5);
                        kiVar.W0.K(7);
                        g1Var.setText(LocaleController.getString(R.string.SendAsFiles));
                    } else {
                        kiVar.W0.r(5);
                        kiVar.W0.r(7);
                        if (i9 != 0) {
                            g1Var.setText(LocaleController.getString(R.string.SendAsFile));
                        }
                    }
                    if (i9 > 0 && getStarsPrice() <= 0) {
                        if (kiVar != null) {
                            org.telegram.ui.ActionBar.o2 o2Var2 = kiVar.b0;
                            if (o2Var2 instanceof org.telegram.ui.qn) {
                            }
                        }
                        z12 = true;
                        if (i9 > 0 || kiVar == null) {
                            j10 = 0;
                        } else {
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = kiVar.f0;
                            if (chatAttachAlertPhotoLayout != null) {
                                HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
                                ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                                if (!selectedPhotos.isEmpty()) {
                                    int i10 = 0;
                                    z15 = false;
                                    loop0: while (true) {
                                        j10 = j11;
                                        if (i10 >= Math.ceil(selectedPhotos.size() / 10.0f)) {
                                            break;
                                        }
                                        int i11 = i10 * 10;
                                        int min = Math.min(10, selectedPhotos.size() - i11);
                                        Utilities.random.nextLong();
                                        for (int i12 = 0; i12 < min; i12++) {
                                            int i13 = i11 + i12;
                                            if (i13 < selectedPhotosOrder.size()) {
                                                CharSequence charSequence = ((MediaController.PhotoEntry) selectedPhotos.get(selectedPhotosOrder.get(i13))).caption;
                                                String charSequence2 = charSequence == null ? "" : charSequence.toString();
                                                if (kiVar.m1() != null && TextUtils.isEmpty(charSequence2) && i12 == 0) {
                                                    charSequence2 = kiVar.m1().getText().toString();
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
                                        j11 = j10;
                                    }
                                    z15 = false;
                                    if (z15 && (kiVar.b0 instanceof org.telegram.ui.qn)) {
                                        z13 = true;
                                        if (i9 > 0 && kiVar != null) {
                                            o2Var = kiVar.b0;
                                            if ((o2Var instanceof org.telegram.ui.qn) && ChatObject.isChannelAndNotMegaGroup(((org.telegram.ui.qn) o2Var).e) && (chatFull = ((org.telegram.ui.qn) o2Var).V7) != null && chatFull.paid_media_allowed) {
                                                z14 = true;
                                                if (z12) {
                                                    String string = LocaleController.getString(R.string.EnablePhotoSpoiler);
                                                    org.telegram.ui.ActionBar.g1 g1Var2 = this.U0;
                                                    g1Var2.setText(string);
                                                    g1Var2.setAnimatedIcon(R.raw.photo_spoiler);
                                                    kiVar.W0.r(3);
                                                } else if (kiVar != null) {
                                                    kiVar.W0.K(3);
                                                }
                                                if (kiVar != null) {
                                                    org.telegram.ui.ActionBar.w0 w0Var2 = kiVar.W0;
                                                    if (getSelectedPhotosCount() == i9) {
                                                        int selectedPhotosHighQualityCount = getSelectedPhotosHighQualityCount();
                                                        org.telegram.ui.ActionBar.g1 g1Var3 = this.W0;
                                                        if (selectedPhotosHighQualityCount > 0) {
                                                            g1Var3.setText(LocaleController.getString(R.string.SendInStandardQuality));
                                                            g1Var3.setIcon(R.drawable.menu_quality_sd);
                                                        } else {
                                                            g1Var3.setText(LocaleController.getString(R.string.SendInHighQuality));
                                                            g1Var3.setIcon(R.drawable.menu_quality_hd);
                                                        }
                                                        w0Var2.K(2);
                                                    } else {
                                                        w0Var2.r(2);
                                                    }
                                                }
                                                bb0 bb0Var = this.Z0;
                                                if (z13) {
                                                    bb0Var.setVisibility(8);
                                                } else {
                                                    bb0Var.setVisibility(0);
                                                }
                                                if ((!z12 || z13) && (z11 || z10)) {
                                                    kiVar.W0.K(6);
                                                } else {
                                                    kiVar.W0.r(6);
                                                }
                                                if (z14) {
                                                    kiVar.W0.r(9);
                                                    return;
                                                }
                                                org.telegram.ui.ActionBar.g1 g1Var4 = this.X0;
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
                                                this.A.M(new org.telegram.ui.yq(1));
                                                kiVar.W0.K(9);
                                                return;
                                            }
                                        }
                                        z14 = false;
                                        if (z12) {
                                        }
                                        if (kiVar != null) {
                                        }
                                        bb0 bb0Var2 = this.Z0;
                                        if (z13) {
                                        }
                                        if (z12) {
                                        }
                                        kiVar.W0.K(6);
                                        if (z14) {
                                        }
                                    }
                                }
                            }
                            j10 = 0;
                            z15 = false;
                            if (z15) {
                                z13 = true;
                                if (i9 > 0) {
                                    o2Var = kiVar.b0;
                                    if (o2Var instanceof org.telegram.ui.qn) {
                                        z14 = true;
                                        if (z12) {
                                        }
                                        if (kiVar != null) {
                                        }
                                        bb0 bb0Var22 = this.Z0;
                                        if (z13) {
                                        }
                                        if (z12) {
                                        }
                                        kiVar.W0.K(6);
                                        if (z14) {
                                        }
                                    }
                                }
                                z14 = false;
                                if (z12) {
                                }
                                if (kiVar != null) {
                                }
                                bb0 bb0Var222 = this.Z0;
                                if (z13) {
                                }
                                if (z12) {
                                }
                                kiVar.W0.K(6);
                                if (z14) {
                                }
                            }
                        }
                        z13 = false;
                        if (i9 > 0) {
                        }
                        z14 = false;
                        if (z12) {
                        }
                        if (kiVar != null) {
                        }
                        bb0 bb0Var2222 = this.Z0;
                        if (z13) {
                        }
                        if (z12) {
                        }
                        kiVar.W0.K(6);
                        if (z14) {
                        }
                    }
                    z12 = false;
                    if (i9 > 0) {
                    }
                    j10 = 0;
                    z13 = false;
                    if (i9 > 0) {
                    }
                    z14 = false;
                    if (z12) {
                    }
                    if (kiVar != null) {
                    }
                    bb0 bb0Var22222 = this.Z0;
                    if (z13) {
                    }
                    if (z12) {
                    }
                    kiVar.W0.K(6);
                    if (z14) {
                    }
                } else {
                    w0Var.K(1);
                    z11 = true;
                    if (i9 != 0) {
                    }
                    org.telegram.ui.ActionBar.g1 g1Var5 = this.V0;
                    if (i9 <= 1) {
                    }
                    if (i9 > 0) {
                        if (kiVar != null) {
                        }
                        z12 = true;
                        if (i9 > 0) {
                        }
                        j10 = 0;
                        z13 = false;
                        if (i9 > 0) {
                        }
                        z14 = false;
                        if (z12) {
                        }
                        if (kiVar != null) {
                        }
                        bb0 bb0Var222222 = this.Z0;
                        if (z13) {
                        }
                        if (z12) {
                        }
                        kiVar.W0.K(6);
                        if (z14) {
                        }
                    }
                    z12 = false;
                    if (i9 > 0) {
                    }
                    j10 = 0;
                    z13 = false;
                    if (i9 > 0) {
                    }
                    z14 = false;
                    if (z12) {
                    }
                    if (kiVar != null) {
                    }
                    bb0 bb0Var2222222 = this.Z0;
                    if (z13) {
                    }
                    if (z12) {
                    }
                    kiVar.W0.K(6);
                    if (z14) {
                    }
                }
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var3 = kiVar.W0;
        org.telegram.ui.ActionBar.w0 w0Var4 = kiVar.W0;
        w0Var3.r(0);
        if (i9 == 0) {
            w0Var4.K(4);
            w0Var4.r(1);
        } else if (this.v0 && getStarsPrice() <= 0 && kiVar.D1 == null) {
            w0Var4.K(1);
            z10 = false;
            z11 = true;
            if (i9 != 0) {
            }
            org.telegram.ui.ActionBar.g1 g1Var52 = this.V0;
            if (i9 <= 1) {
            }
            if (i9 > 0) {
            }
            z12 = false;
            if (i9 > 0) {
            }
            j10 = 0;
            z13 = false;
            if (i9 > 0) {
            }
            z14 = false;
            if (z12) {
            }
            if (kiVar != null) {
            }
            bb0 bb0Var22222222 = this.Z0;
            if (z13) {
            }
            if (z12) {
            }
            kiVar.W0.K(6);
            if (z14) {
            }
        } else {
            w0Var4.r(1);
        }
        z10 = false;
        z11 = false;
        if (i9 != 0) {
        }
        org.telegram.ui.ActionBar.g1 g1Var522 = this.V0;
        if (i9 <= 1) {
        }
        if (i9 > 0) {
        }
        z12 = false;
        if (i9 > 0) {
        }
        j10 = 0;
        z13 = false;
        if (i9 > 0) {
        }
        z14 = false;
        if (z12) {
        }
        if (kiVar != null) {
        }
        bb0 bb0Var222222222 = this.Z0;
        if (z13) {
        }
        if (z12) {
        }
        kiVar.W0.K(6);
        if (z14) {
        }
    }

    @Override // org.telegram.ui.Components.ci
    public final boolean C(int i9) {
        if (!this.U) {
            return false;
        }
        if (i9 != 24 && i9 != 25 && i9 != 79 && i9 != 85) {
            return false;
        }
        ((il) this.g0.getDelegate()).b();
        return true;
    }

    @Override // org.telegram.ui.Components.ci
    public final void D(ci ciVar) {
        ViewPropertyAnimator viewPropertyAnimator = this.k1;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.w.setVisibility(0);
        boolean z10 = ciVar instanceof hm;
        TextView textView = this.x;
        if (z10) {
            ViewPropertyAnimator interpolator = textView.animate().alpha(1.0f).setDuration(150L).setInterpolator(gr.j);
            this.k1 = interpolator;
            interpolator.start();
        } else {
            Y();
            textView.setAlpha(1.0f);
        }
        this.b.T0.setTitle("");
        this.B.h1(0, 0);
        if (z10) {
            this.A.post(new org.telegram.ui.wq(23, this, ciVar));
        }
        U();
        l0();
    }

    @Override // org.telegram.ui.Components.ci
    public final void E() {
        this.J = false;
        ul ulVar = this.L;
        if (ulVar != null) {
            ulVar.setVisibility(0);
        }
        if (this.q0) {
            this.q0 = false;
            T(true);
        }
    }

    @Override // org.telegram.ui.Components.ci
    public final void F() {
        this.A.x0(0);
    }

    public final int P(MediaController.PhotoEntry photoEntry, int i9) {
        Integer valueOf = Integer.valueOf(photoEntry.imageId);
        HashMap hashMap = o1;
        boolean containsKey = hashMap.containsKey(valueOf);
        ArrayList arrayList = p1;
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
            x0(false);
            v0();
            if (i9 >= 0) {
                photoEntry.reset();
                this.d1.W(i9);
            }
            return indexOf;
        }
        photoEntry.starsAmount = getStarsPrice();
        photoEntry.hasSpoiler = getStarsPrice() > 0;
        photoEntry.isChatPreviewSpoilerRevealed = false;
        photoEntry.isAttachSpoilerRevealed = false;
        if (b0()) {
            photoEntry.discardLivePhoto = Boolean.valueOf(!R());
        }
        photoEntry.highQuality = Boolean.valueOf(photoEntry.isHighQuality());
        boolean V = V(true);
        hashMap.put(valueOf, photoEntry);
        arrayList.add(valueOf);
        if (V) {
            w0();
            return -1;
        }
        x0(true);
        return -1;
    }

    public final void Q() {
        ul ulVar = this.L;
        if (ulVar != null) {
            if (!this.U) {
                ulVar.setTranslationX(this.Q[0]);
            }
            int i9 = this.G0;
            int dp = AndroidUtilities.dp(2.0f) + (i9 * 2);
            if (this.U) {
                return;
            }
            this.L.setClipTop((int) this.S);
            this.L.setClipBottom((int) this.T);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.L.getLayoutParams();
            if (layoutParams.height == dp && layoutParams.width == i9) {
                return;
            }
            layoutParams.width = i9;
            layoutParams.height = dp;
            this.L.setLayoutParams(layoutParams);
            AndroidUtilities.runOnUIThread(new org.telegram.ui.wq(24, this, layoutParams));
        }
    }

    public final void T(boolean z10) {
        yl ylVar;
        ki kiVar = this.b;
        boolean z11 = kiVar.R;
        org.telegram.ui.ActionBar.o2 o2Var = kiVar.b0;
        if (z11 || !this.n) {
            return;
        }
        boolean z12 = this.J0;
        boolean z13 = this.K0;
        org.telegram.ui.ActionBar.o2 R = o2Var == null ? LaunchActivity.R() : o2Var;
        if (R == null || R.getParentActivity() == null) {
            return;
        }
        if (!SharedConfig.inappCamera) {
            this.J0 = false;
        } else if (Build.VERSION.SDK_INT >= 23) {
            boolean z14 = R.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0;
            this.K0 = z14;
            if (z14) {
                if (z10) {
                    try {
                        o2Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE"}, 17);
                    } catch (Exception unused) {
                    }
                }
                this.J0 = false;
            } else {
                if (z10 || SharedConfig.hasCameraCache) {
                    CameraController.getInstance().initCamera(null);
                }
                this.J0 = CameraController.getInstance().isCameraInitied();
            }
        } else {
            if (z10 || SharedConfig.hasCameraCache) {
                CameraController.getInstance().initCamera(null);
            }
            this.J0 = CameraController.getInstance().isCameraInitied();
        }
        if ((z12 != this.J0 || z13 != this.K0) && (ylVar = this.C) != null) {
            ylVar.l();
        }
        if (kiVar.R || !kiVar.isShowing() || !this.J0 || kiVar.getBackDrawable().getAlpha() == 0 || this.U) {
            return;
        }
        r0();
    }

    public final void U() {
        f2.q1 K;
        float[] fArr;
        sl slVar;
        if (PhotoViewer.C1() && PhotoViewer.t1().l5 != null && PhotoViewer.t1().l5.R) {
            return;
        }
        ul ulVar = this.L;
        if (ulVar != null) {
            ulVar.invalidateOutline();
        }
        int i9 = this.I0 - 1;
        kl klVar = this.A;
        f2.q1 K2 = klVar.K(i9);
        if (K2 != null) {
            K2.a.invalidateOutline();
        }
        if ((!this.C.d || !this.J0 || this.P0 != this.Q0) && (K = klVar.K(0)) != null) {
            K.a.invalidateOutline();
        }
        ul ulVar2 = this.L;
        if (ulVar2 != null) {
            ulVar2.invalidate();
        }
        if (Build.VERSION.SDK_INT >= 23 && (slVar = this.N) != null) {
            ((ViewGroup.MarginLayoutParams) slVar.getLayoutParams()).topMargin = getRootWindowInsets() == null ? AndroidUtilities.dp(16.0f) : getRootWindowInsets().getSystemWindowInsetTop() + AndroidUtilities.dp(2.0f);
        }
        if (this.J0) {
            int childCount = klVar.getChildCount();
            int i10 = 0;
            while (true) {
                fArr = this.Q;
                if (i10 >= childCount) {
                    break;
                }
                View childAt = klVar.getChildAt(i10);
                if (!(childAt instanceof org.telegram.ui.Cells.m5)) {
                    i10++;
                } else if (childAt.isAttachedToWindow()) {
                    float y10 = getY() + klVar.getY() + childAt.getY();
                    ki kiVar = this.b;
                    ViewGroup sheetContainer = kiVar.getSheetContainer();
                    nh nhVar = kiVar.u1;
                    fh.v vVar = kiVar.K0;
                    float y11 = sheetContainer.getY() + y10;
                    float x10 = kiVar.getSheetContainer().getX() + getX() + klVar.getX() + childAt.getX();
                    if (Build.VERSION.SDK_INT >= 23) {
                        x10 -= getRootWindowInsets().getSystemWindowInsetLeft();
                    }
                    float alpha = (vVar.getAlpha() * vVar.getMeasuredHeight()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (!kiVar.c0 ? AndroidUtilities.statusBarHeight : 0);
                    kh.i iVar = kiVar.x2;
                    if (iVar != null && iVar.g()) {
                        alpha = Math.max(alpha, (kiVar.x2.e() + kiVar.x2.getY()) - kiVar.h2);
                    }
                    float f10 = y10 < alpha ? alpha - y10 : 0.0f;
                    if (f10 != this.S) {
                        this.S = f10;
                        ul ulVar3 = this.L;
                        if (ulVar3 != null) {
                            ulVar3.invalidateOutline();
                            this.L.invalidate();
                        }
                    }
                    float translationY = (int) (nhVar.getTranslationY() + (kiVar.getSheetContainer().getMeasuredHeight() - nhVar.getMeasuredHeight()));
                    kh.i iVar2 = kiVar.x2;
                    if (iVar2 != null) {
                        translationY -= iVar2.d() - AndroidUtilities.dp(6.0f);
                    }
                    if (childAt.getMeasuredHeight() + y10 > translationY) {
                        this.T = Math.min(-AndroidUtilities.dp(5.0f), y10 - translationY) + childAt.getMeasuredHeight();
                    } else {
                        this.T = 0.0f;
                    }
                    fArr[0] = x10;
                    fArr[1] = y11;
                    Q();
                    return;
                }
            }
            if (this.S != 0.0f) {
                this.S = 0.0f;
                ul ulVar4 = this.L;
                if (ulVar4 != null) {
                    ulVar4.invalidateOutline();
                    this.L.invalidate();
                }
            }
            fArr[0] = AndroidUtilities.dp(-400.0f);
            fArr[1] = 0.0f;
            Q();
        }
    }

    public final boolean V(boolean z10) {
        if (getStarsPrice() <= 0) {
            return false;
        }
        boolean z11 = false;
        while (true) {
            HashMap hashMap = o1;
            if (hashMap.size() <= 10 - (z10 ? 1 : 0)) {
                break;
            }
            ArrayList arrayList = p1;
            if (arrayList.isEmpty()) {
                break;
            }
            Object obj = hashMap.get(arrayList.get(0));
            if (!(obj instanceof MediaController.PhotoEntry)) {
                break;
            }
            P((MediaController.PhotoEntry) obj, -1);
            z11 = true;
        }
        return z11;
    }

    public final boolean W(MediaController.PhotoEntry photoEntry) {
        boolean z10 = this.s0;
        org.telegram.ui.ActionBar.b6 b6Var = this.a;
        ki kiVar = this.b;
        if (z10 || !photoEntry.isVideo) {
            if (this.t0 || photoEntry.isVideo) {
                return false;
            }
            if (!kiVar.a1()) {
                org.telegram.messenger.ll.p(R.string.GlobalAttachPhotoRestricted, new oc(kiVar.n1, b6Var), null);
                return true;
            }
        } else if (!kiVar.a1()) {
            org.telegram.messenger.ll.p(R.string.GlobalAttachVideoRestricted, new oc(kiVar.n1, b6Var), null);
            return true;
        }
        return true;
    }

    public final void X() {
        if (!this.L0 || Build.VERSION.SDK_INT < 23) {
            return;
        }
        boolean d02 = d0();
        this.L0 = d02;
        if (!d02) {
            e0();
        }
        this.C.l();
        this.v.l();
    }

    public final void Y() {
        String string = LocaleController.getString(R.string.EnablePhotoSpoiler);
        org.telegram.ui.ActionBar.g1 g1Var = this.U0;
        g1Var.setText(string);
        g1Var.setAnimatedIcon(R.raw.photo_spoiler);
        this.b.W0.K(1);
        HashMap hashMap = o1;
        if (!hashMap.isEmpty()) {
            Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                ((MediaController.PhotoEntry) ((Map.Entry) it.next()).getValue()).reset();
            }
            hashMap.clear();
            p1.clear();
        }
        ArrayList arrayList = n1;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList.get(i9);
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
        this.C.l();
        this.v.l();
    }

    public final void Z(boolean z10) {
        ul ulVar;
        if (this.o0 || this.L == null) {
            return;
        }
        int i9 = this.G0;
        int[] iArr = this.b0;
        iArr[1] = i9;
        int i10 = 2;
        iArr[2] = AndroidUtilities.dp(2.0f) + (i9 * 2);
        Runnable runnable = this.j0;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.j0 = null;
        }
        boolean z11 = ((double) AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.a7, this.a))) > 0.721d;
        ki kiVar = this.b;
        AndroidUtilities.setLightNavigationBar(kiVar, z11);
        TextView textView = this.l0;
        kl klVar = this.r;
        fh.d2 d2Var = this.f0;
        kl klVar2 = this.A;
        ImageView[] imageViewArr = this.O;
        i81 i81Var = this.h0;
        if (z10) {
            this.f1 = this.L.getTranslationY();
            this.W = true;
            if (klVar2 != null) {
                klVar2.invalidate();
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this, "cameraOpenProgress", 0.0f));
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(d2Var, (Property<fh.d2, Float>) property, 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(i81Var, (Property<i81, Float>) property, 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(klVar, (Property<kl, Float>) property, 0.0f));
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
            this.b1.lock();
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(220L);
            animatorSet.setInterpolator(gr.f);
            animatorSet.addListener(new ml(this, i10));
            animatorSet.start();
        } else {
            this.e1 = false;
            kiVar.getWindow().clearFlags(128);
            setCameraOpenProgress(0.0f);
            iArr[0] = 0;
            setCameraOpenProgress(0.0f);
            d2Var.setAlpha(0.0f);
            d2Var.setVisibility(8);
            i81Var.setAlpha(0.0f);
            i81Var.setTag(null);
            i81Var.setVisibility(8);
            klVar.setAlpha(0.0f);
            textView.setAlpha(0.0f);
            klVar.setVisibility(8);
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
            this.U = false;
            ul ulVar2 = this.L;
            if (ulVar2 != null) {
                ulVar2.setFpsLimit(30);
                this.L.setSystemUiVisibility(1024);
            }
            if (klVar2 != null) {
                klVar2.invalidate();
            }
        }
        ul ulVar3 = this.L;
        if (ulVar3 != null) {
            ulVar3.setImportantForAccessibility(0);
        }
        klVar2.setImportantForAccessibility(0);
        if (LiteMode.isEnabled(LiteMode.FLAGS_CHAT) || (ulVar = this.L) == null) {
            return;
        }
        ulVar.showTexture(false, z10);
    }

    @Override // org.telegram.ui.Components.ci
    public final void a(CharSequence charSequence) {
        Object obj;
        int i9 = 0;
        while (true) {
            ArrayList arrayList = p1;
            if (i9 >= arrayList.size()) {
                return;
            }
            if (i9 == 0) {
                Object obj2 = arrayList.get(i9);
                HashMap hashMap = o1;
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
            i9++;
        }
    }

    public final MediaController.PhotoEntry a0(int i9) {
        if (i9 < 0) {
            return null;
        }
        ArrayList arrayList = n1;
        int size = arrayList.size();
        if (i9 < size) {
            return (MediaController.PhotoEntry) arrayList.get(i9);
        }
        int i10 = i9 - size;
        MediaController.AlbumEntry albumEntry = this.P0;
        if (albumEntry == null || i10 >= albumEntry.photos.size()) {
            return null;
        }
        return this.P0.photos.get(i10);
    }

    @Override // org.telegram.ui.Components.ci
    public final boolean b() {
        return !this.U;
    }

    @Override // org.telegram.ui.Components.ci
    public final boolean c() {
        Iterator it = o1.entrySet().iterator();
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

    public final void c0(boolean z10) {
        if (!this.J0 || this.L == null) {
            return;
        }
        m0();
        this.M.f();
        this.L.destroy(z10, null);
        AnimatorSet animatorSet = this.K;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.K = null;
        }
        AndroidUtilities.runOnUIThread(new cl(this, 0), 300L);
        this.V = false;
    }

    @Override // org.telegram.ui.Components.ci
    public final void d() {
        boolean z10 = this.a1;
        int i9 = z10 ? org.telegram.ui.ActionBar.f6.hg : org.telegram.ui.ActionBar.f6.j5;
        int i10 = org.telegram.ui.ActionBar.f6.c7;
        org.telegram.ui.ActionBar.b6 b6Var = this.a;
        this.D.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.A5, b6Var);
        kl klVar = this.A;
        klVar.setGlowColor(v02);
        klVar.K(0);
        this.x.setTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        int v03 = org.telegram.ui.ActionBar.f6.v0(z10 ? org.telegram.ui.ActionBar.f6.hg : org.telegram.ui.ActionBar.f6.E8, b6Var);
        pl plVar = this.w;
        plVar.G(v03, false);
        plVar.G(org.telegram.ui.ActionBar.f6.v0(z10 ? org.telegram.ui.ActionBar.f6.hg : org.telegram.ui.ActionBar.f6.E8, b6Var), true);
        plVar.B(org.telegram.ui.ActionBar.f6.v0(z10 ? org.telegram.ui.ActionBar.f6.jg : org.telegram.ui.ActionBar.f6.G8, b6Var));
        org.telegram.ui.ActionBar.f6.w1(org.telegram.ui.ActionBar.f6.v0(i9, b6Var), this.y);
    }

    public final boolean d0() {
        Activity findActivity = AndroidUtilities.findActivity(getContext());
        if (findActivity == null) {
            findActivity = this.b.b0.getParentActivity();
        }
        int i9 = Build.VERSION.SDK_INT;
        if (i9 < 23) {
            return false;
        }
        if (findActivity == null) {
            return true;
        }
        if (i9 < 33 || (findActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0 && findActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0)) {
            return i9 < 33 && findActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0;
        }
        return true;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        ki kiVar;
        if (i9 != NotificationCenter.albumsDidLoad) {
            if (i9 == NotificationCenter.cameraInitied) {
                T(false);
                return;
            }
            return;
        }
        yl ylVar = this.C;
        if (ylVar != null) {
            if (p0()) {
                this.Q0 = MediaController.allMediaAlbumEntry;
            } else {
                this.Q0 = MediaController.allPhotosAlbumEntry;
            }
            if (this.P0 == null || ((kiVar = this.b) != null && kiVar.C)) {
                this.P0 = this.Q0;
            } else if (p0()) {
                int i11 = 0;
                while (true) {
                    if (i11 >= MediaController.allMediaAlbums.size()) {
                        break;
                    }
                    MediaController.AlbumEntry albumEntry = MediaController.allMediaAlbums.get(i11);
                    int i12 = albumEntry.bucketId;
                    MediaController.AlbumEntry albumEntry2 = this.P0;
                    if (i12 == albumEntry2.bucketId && albumEntry.videoOnly == albumEntry2.videoOnly) {
                        this.P0 = albumEntry;
                        break;
                    }
                    i11++;
                }
            }
            this.T0 = false;
            this.D.c();
            ylVar.l();
            this.v.l();
            ArrayList arrayList = p1;
            if (!arrayList.isEmpty() && this.Q0 != null) {
                int size = arrayList.size();
                for (int i13 = 0; i13 < size; i13++) {
                    Integer num = (Integer) arrayList.get(i13);
                    HashMap hashMap = o1;
                    Object obj = hashMap.get(num);
                    MediaController.PhotoEntry photoEntry = this.Q0.photosByIds.get(num.intValue());
                    if (photoEntry != null) {
                        if (obj instanceof MediaController.PhotoEntry) {
                            photoEntry.copyFrom((MediaController.PhotoEntry) obj);
                        }
                        hashMap.put(num, photoEntry);
                    }
                }
            }
            t0();
        }
    }

    public final void e0() {
        if ((p0() ? MediaController.allMediaAlbumEntry : MediaController.allPhotosAlbumEntry) == null) {
            MediaController.loadGalleryPhotosAlbums(0);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:22|(1:24)|(1:98)(1:29)|(6:31|(5:33|(1:35)|36|(1:38)|(1:40))|96|42|(1:95)|46)(1:97)|(1:94)|51|(2:52|53)|(4:55|56|(2:58|59)|61)|62|63|64|65|66|67) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00db, code lost:
    
        if (e2.c.w(r0) != false) goto L39;
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
    public final void f0(int i9, Intent intent, String str) {
        String str2;
        MediaMetadataRetriever mediaMetadataRetriever;
        int i10;
        int i11;
        String str3 = str;
        ki kiVar = this.b;
        boolean z10 = kiVar.R;
        org.telegram.ui.ActionBar.o2 o2Var = kiVar.b0;
        if (z10) {
            return;
        }
        m1 = true;
        MediaMetadataRetriever mediaMetadataRetriever2 = null;
        if (i9 == 0) {
            PhotoViewer.t1().K2(o2Var.getParentActivity(), null, this.a);
            PhotoViewer t12 = PhotoViewer.t1();
            int i12 = kiVar.O1;
            boolean z11 = kiVar.P1;
            t12.h = i12;
            t12.n = z11;
            Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(str3);
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(new File(str3).getAbsolutePath(), options);
                i10 = options.outWidth;
                try {
                    i11 = options.outHeight;
                } catch (Exception unused) {
                    i11 = 0;
                    int i13 = i10;
                    int i14 = q1;
                    q1 = i14 - 1;
                    MediaController.PhotoEntry orientation = new MediaController.PhotoEntry(0, i14, 0L, str3, ((Integer) imageOrientation.first).intValue(), false, i13, i11, 0L).setOrientation(imageOrientation);
                    orientation.canDeleteAfter = true;
                    i0(orientation, false, true);
                    return;
                }
            } catch (Exception unused2) {
                i10 = 0;
            }
            int i132 = i10;
            int i142 = q1;
            q1 = i142 - 1;
            MediaController.PhotoEntry orientation2 = new MediaController.PhotoEntry(0, i142, 0L, str3, ((Integer) imageOrientation.first).intValue(), false, i132, i11, 0L).setOrientation(imageOrientation);
            orientation2.canDeleteAfter = true;
            i0(orientation2, false, true);
            return;
        }
        if (i9 == 2) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("pic path " + str3);
            }
            Intent intent2 = (intent == null || str3 == null || !e2.c.w(str3)) ? intent : null;
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
                if (!(o2Var instanceof org.telegram.ui.qn) || !((org.telegram.ui.qn) o2Var).w()) {
                    AndroidUtilities.addMediaToGallery(str3);
                }
                str3 = null;
            } else {
                str2 = null;
            }
            if (str2 != null || str3 == null || !e2.c.w(str3)) {
                str3 = str2;
            }
            try {
                try {
                    try {
                        mediaMetadataRetriever = new MediaMetadataRetriever();
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                mediaMetadataRetriever.setDataSource(str3);
                r4 = mediaMetadataRetriever.extractMetadata(9) != null ? (int) Math.ceil(Long.parseLong(r0) / 1000.0f) : 0L;
                mediaMetadataRetriever.release();
            } catch (Exception e12) {
                e = e12;
                mediaMetadataRetriever2 = mediaMetadataRetriever;
                FileLog.e(e);
                if (mediaMetadataRetriever2 != null) {
                    mediaMetadataRetriever2.release();
                }
                Bitmap createVideoThumbnail = SendMessagesHelper.createVideoThumbnail(str3, 1);
                File file = new File(FileLoader.getDirectory(4), "-2147483648_" + SharedConfig.getLastLocalId() + ".jpg");
                createVideoThumbnail.compress(Bitmap.CompressFormat.JPEG, 55, new FileOutputStream(file));
                SharedConfig.saveConfig();
                int i15 = q1;
                q1 = i15 - 1;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, i15, 0L, str3, 0, true, createVideoThumbnail.getWidth(), createVideoThumbnail.getHeight(), 0L);
                photoEntry.duration = (int) r4;
                photoEntry.thumbPath = file.getAbsolutePath();
                i0(photoEntry, false, true);
            } catch (Throwable th2) {
                th = th2;
                mediaMetadataRetriever2 = mediaMetadataRetriever;
                Throwable th3 = th;
                if (mediaMetadataRetriever2 == null) {
                    throw th3;
                }
                try {
                    mediaMetadataRetriever2.release();
                    throw th3;
                } catch (Exception e13) {
                    FileLog.e(e13);
                    throw th3;
                }
            }
            Bitmap createVideoThumbnail2 = SendMessagesHelper.createVideoThumbnail(str3, 1);
            File file2 = new File(FileLoader.getDirectory(4), "-2147483648_" + SharedConfig.getLastLocalId() + ".jpg");
            createVideoThumbnail2.compress(Bitmap.CompressFormat.JPEG, 55, new FileOutputStream(file2));
            SharedConfig.saveConfig();
            int i152 = q1;
            q1 = i152 - 1;
            MediaController.PhotoEntry photoEntry2 = new MediaController.PhotoEntry(0, i152, 0L, str3, 0, true, createVideoThumbnail2.getWidth(), createVideoThumbnail2.getHeight(), 0L);
            photoEntry2.duration = (int) r4;
            photoEntry2.thumbPath = file2.getAbsolutePath();
            i0(photoEntry2, false, true);
        }
    }

    public final void g0(boolean z10) {
        ul ulVar;
        if (this.L == null || this.K != null) {
            return;
        }
        ki kiVar = this.b;
        if (kiVar.isDismissed()) {
            return;
        }
        this.L.initTexture();
        boolean p02 = p0();
        TextView textView = this.m0;
        int i9 = 0;
        if (p02) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        boolean isEmpty = n1.isEmpty();
        kl klVar = this.r;
        TextView textView2 = this.l0;
        if (isEmpty) {
            textView2.setVisibility(4);
            klVar.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            klVar.setVisibility(0);
        }
        if (kiVar.m1().v && isFocusable()) {
            kiVar.m1().d();
        }
        i81 i81Var = this.h0;
        i81Var.setVisibility(0);
        i81Var.setAlpha(0.0f);
        fh.d2 d2Var = this.f0;
        d2Var.setVisibility(0);
        d2Var.setTag(null);
        int[] iArr = this.b0;
        iArr[0] = 0;
        int i10 = this.G0;
        int i11 = 1;
        iArr[1] = i10;
        iArr[2] = AndroidUtilities.dp(2.0f) + (i10 * 2);
        this.f1 = 0.0f;
        this.e1 = true;
        ul ulVar2 = this.L;
        if (ulVar2 != null) {
            ulVar2.setFpsLimit(-1);
        }
        AndroidUtilities.hideKeyboard(this);
        AndroidUtilities.setLightNavigationBar((Dialog) kiVar, false);
        kiVar.getWindow().addFlags(128);
        kl klVar2 = this.A;
        ImageView[] imageViewArr = this.O;
        if (z10) {
            setCameraOpenProgress(0.0f);
            this.W = true;
            if (klVar2 != null) {
                klVar2.invalidate();
            }
            this.b1.lock();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this, "cameraOpenProgress", 0.0f, 1.0f));
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(d2Var, (Property<fh.d2, Float>) property, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(klVar, (Property<kl, Float>) property, 1.0f));
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
            animatorSet.setInterpolator(gr.f);
            animatorSet.addListener(new ml(this, i11));
            animatorSet.start();
        } else {
            setCameraOpenProgress(1.0f);
            d2Var.setAlpha(1.0f);
            textView2.setAlpha(1.0f);
            klVar.setAlpha(1.0f);
            while (true) {
                if (i9 >= 2) {
                    break;
                }
                if (imageViewArr[i9].getVisibility() == 0) {
                    imageViewArr[i9].setAlpha(1.0f);
                    break;
                }
                i9++;
            }
            kiVar.V1.u();
            ul ulVar3 = this.L;
            if (ulVar3 != null) {
                ulVar3.setSystemUiVisibility(1028);
            }
        }
        this.U = true;
        ul ulVar4 = this.L;
        if (ulVar4 != null) {
            ulVar4.setImportantForAccessibility(2);
        }
        klVar2.setImportantForAccessibility(4);
        klVar2.invalidate();
        if (LiteMode.isEnabled(LiteMode.FLAGS_CHAT) || (ulVar = this.L) == null || !ulVar.isInited()) {
            return;
        }
        this.L.showTexture(true, z10);
    }

    public ArrayList<Object> getAllPhotosArray() {
        MediaController.AlbumEntry albumEntry = this.P0;
        ArrayList<Object> arrayList = n1;
        if (albumEntry == null) {
            return !arrayList.isEmpty() ? arrayList : new ArrayList<>(0);
        }
        if (arrayList.isEmpty()) {
            return this.P0.photos;
        }
        ArrayList<Object> arrayList2 = new ArrayList<>(arrayList.size() + this.P0.photos.size());
        arrayList2.addAll(arrayList);
        arrayList2.addAll(this.P0.photos);
        return arrayList2;
    }

    @Override // org.telegram.ui.Components.ci
    public int getButtonsHideOffset() {
        return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + super.getButtonsHideOffset();
    }

    public float getCameraOpenProgress() {
        return this.a0;
    }

    @Override // org.telegram.ui.Components.ci
    public int getCurrentItemTop() {
        kl klVar = this.A;
        int childCount = klVar.getChildCount();
        yy yyVar = this.D;
        if (childCount <= 0) {
            klVar.setTopGlowOffset(klVar.getPaddingTop());
            yyVar.setTranslationY(0.0f);
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = klVar.getChildAt(0);
        ik0 ik0Var = (ik0) klVar.G(childAt);
        int top = childAt.getTop() - this.l1;
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || ik0Var == null || ik0Var.b() != 0) {
            top = dp;
        }
        yyVar.setTranslationY(((((getMeasuredHeight() - top) - AndroidUtilities.dp(50.0f)) - yyVar.getMeasuredHeight()) / 2.0f) + top);
        klVar.setTopGlowOffset(top);
        return top;
    }

    @Override // org.telegram.ui.Components.ci
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.ci
    public int getListTopPadding() {
        return this.A.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.ci
    public int getSelectedItemsCount() {
        return p1.size();
    }

    public HashMap<Object, Object> getSelectedPhotos() {
        return o1;
    }

    public int getSelectedPhotosCount() {
        int i9 = 0;
        for (Object obj : o1.values()) {
            if (obj instanceof MediaController.PhotoEntry) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                if (!photoEntry.isVideo && photoEntry.editedInfo == null) {
                    i9++;
                }
            }
        }
        return i9;
    }

    public int getSelectedPhotosHighQualityCount() {
        int i9 = 0;
        for (Object obj : o1.values()) {
            if (obj instanceof MediaController.PhotoEntry) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                if (photoEntry.isHighQuality() && !photoEntry.isVideo && photoEntry.editedInfo == null) {
                    i9++;
                }
            }
        }
        return i9;
    }

    public ArrayList<Object> getSelectedPhotosOrder() {
        return p1;
    }

    public long getStarsPrice() {
        Iterator it = o1.entrySet().iterator();
        if (it.hasNext()) {
            return ((MediaController.PhotoEntry) ((Map.Entry) it.next()).getValue()).starsAmount;
        }
        return 0L;
    }

    @Override // org.telegram.ui.Components.ci
    public final int h() {
        return 1;
    }

    public final void h0() {
        if (SharedConfig.inappCamera) {
            g0(true);
            return;
        }
        ki kiVar = this.b;
        ii iiVar = kiVar.V1;
        if (iiVar != null) {
            iiVar.L(0, false, true, 0, 0, 0L, kiVar.s1(), false, 0L);
        }
    }

    public final void i0(MediaController.PhotoEntry photoEntry, boolean z10, boolean z11) {
        int i9;
        org.telegram.ui.qn qnVar;
        int i10;
        org.telegram.ui.qn qnVar2;
        ArrayList<Object> arrayList;
        int i11;
        ArrayList arrayList2 = n1;
        ki kiVar = this.b;
        if (photoEntry != null) {
            arrayList2.add(photoEntry);
            o1.put(Integer.valueOf(photoEntry.imageId), photoEntry);
            p1.add(Integer.valueOf(photoEntry.imageId));
            kiVar.V1(0);
            this.C.l();
            this.v.l();
        }
        if (photoEntry != null && !z11 && arrayList2.size() > 1) {
            x0(false);
            if (this.L != null) {
                this.h0.b(0.0f, false);
                this.x0 = 0.0f;
                this.L.setZoom(0.0f);
                CameraController.getInstance().startPreview(this.L.getCameraSessionObject());
                return;
            }
            return;
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        this.p0 = true;
        org.telegram.ui.ActionBar.o2 o2Var = kiVar.b0;
        org.telegram.ui.ActionBar.o2 o2Var2 = kiVar.b0;
        if (o2Var == null) {
            o2Var = LaunchActivity.R();
        }
        if (o2Var == null) {
            return;
        }
        PhotoViewer.t1().K2(o2Var.getParentActivity(), null, this.a);
        PhotoViewer.t1().L2(kiVar);
        PhotoViewer t12 = PhotoViewer.t1();
        int i12 = kiVar.O1;
        boolean z12 = kiVar.P1;
        t12.h = i12;
        t12.n = z12;
        if (kiVar.B && kiVar.C) {
            qnVar = (org.telegram.ui.qn) o2Var2;
            i9 = 11;
        } else if (kiVar.M0 != 0) {
            qnVar = null;
            i9 = 1;
        } else if (o2Var2 instanceof org.telegram.ui.qn) {
            qnVar = (org.telegram.ui.qn) o2Var2;
            i9 = 2;
        } else {
            i9 = 5;
            qnVar = null;
        }
        boolean z13 = kiVar.D;
        if (z13) {
            qnVar2 = null;
            i10 = 13;
        } else {
            i10 = i9;
            qnVar2 = qnVar;
        }
        if (kiVar.M0 != 0 || z13) {
            arrayList = new ArrayList<>();
            arrayList.add(photoEntry);
            i11 = 0;
        } else {
            arrayList = getAllPhotosArray();
            i11 = arrayList2.size() - 1;
        }
        ArrayList<Object> arrayList3 = arrayList;
        c40 c40Var = kiVar.M;
        if (c40Var != null && photoEntry != null) {
            c40Var.e = photoEntry.isVideo;
        }
        PhotoViewer.t1().f2(arrayList3, i11, i10, false, new ll(this, z10), qnVar2);
        PhotoViewer.t1().x2(kiVar.M);
        if (kiVar.C) {
            PhotoViewer.t1().X0(null, null, false, kiVar.F);
            PhotoViewer.t1().l2();
        }
    }

    @Override // org.telegram.ui.Components.ci
    public final void j() {
        U();
        invalidate();
    }

    public final void j0() {
        try {
            if (this.L != null) {
                CameraController.getInstance().stopPreview(this.L.getCameraSessionObject());
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override // org.telegram.ui.Components.ci
    public final void k(float f10) {
        this.S0 = f10;
        U();
        ul ulVar = this.L;
        if (ulVar != null) {
            ulVar.invalidateOutline();
            this.L.invalidate();
        }
        invalidate();
    }

    public final void k0() {
        if (this.b.R) {
            return;
        }
        for (int i9 = 0; i9 < 2; i9++) {
            this.O[i9].animate().alpha(1.0f).translationX(0.0f).setDuration(150L).setInterpolator(gr.f).start();
        }
        ViewPropertyAnimator duration = this.n0.animate().alpha(1.0f).translationX(0.0f).setDuration(150L);
        gr grVar = gr.f;
        duration.setInterpolator(grVar).start();
        this.m0.animate().alpha(1.0f).setDuration(150L).setInterpolator(grVar).start();
        AndroidUtilities.updateViewVisibilityAnimated(this.N, false);
        AndroidUtilities.cancelRunOnUIThread(this.d0);
        this.d0 = null;
        AndroidUtilities.unlockOrientation(AndroidUtilities.findActivity(getContext()));
    }

    @Override // org.telegram.ui.Components.ci
    public final boolean l(MotionEvent motionEvent) {
        ul ulVar;
        if (!this.W) {
            if (this.U && motionEvent != null) {
                boolean z10 = this.C0;
                i81 i81Var = this.h0;
                if ((!z10 && motionEvent.getActionMasked() == 0) || motionEvent.getActionMasked() == 5) {
                    Rect rect = this.A0;
                    i81Var.getHitRect(rect);
                    if (i81Var.getTag() == null || !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        if (!this.o0 && !this.E0) {
                            if (motionEvent.getPointerCount() == 2) {
                                this.w0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                this.y0 = true;
                            } else {
                                this.D0 = true;
                                this.B0 = motionEvent.getY();
                                this.y0 = false;
                            }
                            this.z0 = false;
                            this.C0 = true;
                            return true;
                        }
                    }
                } else if (this.C0) {
                    int actionMasked = motionEvent.getActionMasked();
                    kl klVar = this.r;
                    TextView textView = this.l0;
                    Property property = View.ALPHA;
                    ImageView[] imageViewArr = this.O;
                    fh.d2 d2Var = this.f0;
                    if (actionMasked == 2) {
                        if (this.y0 && motionEvent.getPointerCount() == 2 && !this.E0) {
                            float hypot = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                            if (this.z0) {
                                if (this.L != null) {
                                    float dp = (hypot - this.w0) / AndroidUtilities.dp(100.0f);
                                    this.w0 = hypot;
                                    float f10 = this.x0 + dp;
                                    this.x0 = f10;
                                    if (f10 < 0.0f) {
                                        this.x0 = 0.0f;
                                    } else if (f10 > 1.0f) {
                                        this.x0 = 1.0f;
                                    }
                                    i81Var.b(this.x0, false);
                                    this.b.getSheetContainer().invalidate();
                                    this.L.setZoom(this.x0);
                                    s0(true);
                                    return true;
                                }
                            } else if (Math.abs(hypot - this.w0) >= AndroidUtilities.getPixelsInCM(0.4f, false)) {
                                this.w0 = hypot;
                                this.z0 = true;
                                return true;
                            }
                        } else {
                            float y10 = motionEvent.getY();
                            float f11 = y10 - this.B0;
                            if (this.D0) {
                                if (Math.abs(f11) > AndroidUtilities.getPixelsInCM(0.4f, false)) {
                                    this.D0 = false;
                                    this.E0 = true;
                                    return true;
                                }
                            } else if (this.E0 && (ulVar = this.L) != null) {
                                ulVar.setTranslationY(ulVar.getTranslationY() + f11);
                                this.B0 = y10;
                                i81Var.setTag(null);
                                Runnable runnable = this.j0;
                                if (runnable != null) {
                                    AndroidUtilities.cancelRunOnUIThread(runnable);
                                    this.j0 = null;
                                }
                                if (d2Var.getTag() == null) {
                                    d2Var.setTag(1);
                                    AnimatorSet animatorSet = new AnimatorSet();
                                    animatorSet.playTogether(ObjectAnimator.ofFloat(d2Var, (Property<fh.d2, Float>) property, 0.0f), ObjectAnimator.ofFloat(i81Var, (Property<i81, Float>) property, 0.0f), ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f), ObjectAnimator.ofFloat(imageViewArr[0], (Property<ImageView, Float>) property, 0.0f), ObjectAnimator.ofFloat(imageViewArr[1], (Property<ImageView, Float>) property, 0.0f), ObjectAnimator.ofFloat(klVar, (Property<kl, Float>) property, 0.0f));
                                    animatorSet.setDuration(220L);
                                    animatorSet.setInterpolator(gr.f);
                                    animatorSet.start();
                                    return true;
                                }
                            }
                        }
                    } else if (motionEvent.getActionMasked() == 3 || motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 6) {
                        this.C0 = false;
                        this.y0 = false;
                        if (this.E0) {
                            this.E0 = false;
                            ul ulVar2 = this.L;
                            if (ulVar2 != null) {
                                if (Math.abs(ulVar2.getTranslationY()) > this.L.getMeasuredHeight() / 6.0f) {
                                    Z(true);
                                    return true;
                                }
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.L, (Property<ul, Float>) View.TRANSLATION_Y, 0.0f), ObjectAnimator.ofFloat(d2Var, (Property<fh.d2, Float>) property, 1.0f), ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 1.0f), ObjectAnimator.ofFloat(imageViewArr[0], (Property<ImageView, Float>) property, 1.0f), ObjectAnimator.ofFloat(imageViewArr[1], (Property<ImageView, Float>) property, 1.0f), ObjectAnimator.ofFloat(klVar, (Property<kl, Float>) property, 1.0f));
                                animatorSet2.setDuration(250L);
                                animatorSet2.setInterpolator(this.e0);
                                animatorSet2.start();
                                d2Var.setTag(null);
                                return true;
                            }
                        } else {
                            ul ulVar3 = this.L;
                            if (ulVar3 != null && !this.z0) {
                                ulVar3.getLocationOnScreen(this.R);
                                this.L.focusToPoint((int) (motionEvent.getRawX() - r5[0]), (int) (motionEvent.getRawY() - r5[1]));
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void l0() {
        try {
            T(false);
            if (this.L != null) {
                CameraController.getInstance().startPreview(this.L.getCameraSessionObject());
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override // org.telegram.ui.Components.ci
    public final void m() {
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.cameraInitied);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.albumsDidLoad);
    }

    public final void m0() {
        if (this.V) {
            try {
                Bitmap bitmap = this.L.getTextureView().getBitmap();
                if (bitmap != null) {
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), this.L.getMatrix(), true);
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

    @Override // org.telegram.ui.Components.ci
    public final boolean n() {
        if (this.W) {
            return true;
        }
        if (this.U) {
            Z(true);
            return true;
        }
        c0(true);
        return false;
    }

    @Override // org.telegram.ui.Components.ci
    public final void o(int i9) {
        c0((i9 == 0 || i9 == 2) ? false : true);
    }

    public final void o0(int i9, final boolean z10) {
        PhotoViewer t12 = PhotoViewer.t1();
        if (i9 == -1) {
            i9 = t12.L4;
        }
        ArrayList arrayList = t12.c7;
        if (arrayList == null || arrayList.isEmpty() || i9 >= arrayList.size() || !(arrayList.get(i9) instanceof MediaController.PhotoEntry) || !((MediaController.PhotoEntry) arrayList.get(i9)).hasSpoiler) {
            return;
        }
        final MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList.get(i9);
        this.A.M(new q0.a() { // from class: org.telegram.ui.Components.el
            @Override // q0.a
            public final void accept(Object obj) {
                View view = (View) obj;
                boolean z11 = ChatAttachAlertPhotoLayout.m1;
                if (view instanceof org.telegram.ui.Cells.t5) {
                    org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
                    if (t5Var.getPhotoEntry() == photoEntry) {
                        t5Var.c(z10, Float.valueOf(250.0f));
                        t5Var.f(ChatAttachAlertPhotoLayout.this.getStarsPrice(), ChatAttachAlertPhotoLayout.o1.size() > 1);
                    }
                }
            }
        });
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13 = i11 - i9;
        if (this.O0 != i13) {
            this.O0 = i13;
            yl ylVar = this.C;
            if (ylVar != null) {
                ylVar.l();
            }
        }
        super.onLayout(z10, i9, i10, i11, i12);
        U();
    }

    public final boolean p0() {
        if (this.u0) {
            return true;
        }
        ki kiVar = this.b;
        if (kiVar.B) {
            return false;
        }
        return (kiVar.b0 instanceof org.telegram.ui.qn) || kiVar.P0 || kiVar.M0 == 2;
    }

    @Override // org.telegram.ui.Components.ci
    public final void q() {
        ul ulVar = this.L;
        if (ulVar != null) {
            ulVar.setVisibility(8);
        }
        for (Map.Entry entry : o1.entrySet()) {
            if (entry.getValue() instanceof MediaController.PhotoEntry) {
                ((MediaController.PhotoEntry) entry.getValue()).isAttachSpoilerRevealed = false;
            }
        }
        this.C.l();
    }

    public final void q0(y8 y8Var, TLRPC.VideoSize videoSize, long j10) {
        ki kiVar = this.b;
        w8 w8Var = new w8(kiVar.Q, kiVar.M);
        c40 c40Var = kiVar.M;
        w8Var.M = c40Var == null || c40Var.c != 2;
        kiVar.b0.presentFragment(w8Var);
        if (y8Var != null) {
            w8Var.l0(y8Var);
        }
        if (videoSize != null) {
            w8Var.k0(videoSize);
        }
        if (j10 != 0) {
            w8Var.j0(j10);
        }
        w8Var.E = new g1(13, this, w8Var);
    }

    @Override // org.telegram.ui.Components.ci
    public final void r() {
        this.J = true;
        kl klVar = this.A;
        int childCount = klVar.getChildCount();
        int i9 = 0;
        while (true) {
            if (i9 >= childCount) {
                break;
            }
            if (klVar.getChildAt(i9) instanceof org.telegram.ui.Cells.m5) {
                m0();
                break;
            } else {
                this.M.f();
                i9++;
            }
        }
        ViewPropertyAnimator viewPropertyAnimator = this.k1;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator withEndAction = this.x.animate().alpha(0.0f).setDuration(150L).setInterpolator(gr.j).withEndAction(new cl(this, 1));
        this.k1 = withEndAction;
        withEndAction.start();
        j0();
    }

    public final void r0() {
        ki kiVar = this.b;
        if (!kiVar.b2 && this.r0 && CameraView.isCameraAllowed()) {
            if (this.L == null) {
                boolean z10 = !LiteMode.isEnabled(LiteMode.FLAGS_CHAT);
                Context context = getContext();
                Boolean bool = this.k0;
                ul ulVar = new ul(this, context, bool != null ? bool.booleanValue() : kiVar.Q1, z10);
                this.L = ulVar;
                org.telegram.ui.ActionBar.o2 o2Var = kiVar.b0;
                ulVar.setRecordFile(AndroidUtilities.generateVideoPath((o2Var instanceof org.telegram.ui.qn) && ((org.telegram.ui.qn) o2Var).w()));
                this.L.setFocusable(true);
                this.L.setFpsLimit(30);
                this.L.setOutlineProvider(new kg.b(this, 1));
                this.L.setClipToOutline(true);
                this.L.setContentDescription(LocaleController.getString(R.string.AccDescrInstantCamera));
                org.telegram.ui.ActionBar.d3 container = kiVar.getContainer();
                ul ulVar2 = this.L;
                int i9 = this.G0;
                container.addView(ulVar2, 1, new FrameLayout.LayoutParams(i9, i9));
                this.L.setDelegate(new nl(this));
                this.L.setAlpha(this.r0 ? 1.0f : 0.2f);
                this.L.setEnabled(this.r0);
                if (this.J) {
                    this.L.setVisibility(8);
                }
                if (!this.U) {
                    U();
                }
                kl klVar = this.A;
                if (klVar != null) {
                    klVar.invalidate();
                }
                invalidate();
            }
            i81 i81Var = this.h0;
            if (i81Var != null) {
                i81Var.b(0.0f, false);
                this.x0 = 0.0f;
            }
            if (this.U) {
                return;
            }
            this.L.setTranslationX(this.Q[0]);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.N0) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.ci
    public final void s(float f10) {
        ul ulVar = this.L;
        if (ulVar != null) {
            ulVar.setAlpha(f10);
            if (f10 != 0.0f && this.L.getVisibility() != 0) {
                this.L.setVisibility(0);
            } else {
                if (f10 != 0.0f || this.L.getVisibility() == 4) {
                    return;
                }
                this.L.setVisibility(4);
            }
        }
    }

    public final void s0(boolean z10) {
        i81 i81Var = this.h0;
        if ((i81Var.getTag() != null && z10) || (i81Var.getTag() == null && !z10)) {
            if (z10) {
                Runnable runnable = this.j0;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                cl clVar = new cl(this, 3);
                this.j0 = clVar;
                AndroidUtilities.runOnUIThread(clVar, 2000L);
                return;
            }
            return;
        }
        AnimatorSet animatorSet = this.i0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        i81Var.setTag(z10 ? 1 : null);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.i0 = animatorSet2;
        animatorSet2.setDuration(180L);
        this.i0.playTogether(ObjectAnimator.ofFloat(i81Var, (Property<i81, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
        this.i0.addListener(new ml(this, 0));
        this.i0.start();
        if (z10) {
            cl clVar2 = new cl(this, 4);
            this.j0 = clVar2;
            AndroidUtilities.runOnUIThread(clVar2, 2000L);
        }
    }

    public void setCameraOpenProgress(float f10) {
        int i9;
        int i10;
        if (this.L == null) {
            return;
        }
        this.a0 = f10;
        int[] iArr = this.b0;
        float f11 = iArr[1];
        float f12 = iArr[2];
        int i11 = AndroidUtilities.displaySize.x;
        ki kiVar = this.b;
        float width = (kiVar.getContainer().getWidth() - kiVar.getLeftInset()) - kiVar.getRightInset();
        float height = kiVar.getContainer().getHeight();
        float[] fArr = this.Q;
        float f13 = fArr[0];
        float f14 = fArr[1];
        float f15 = this.f1;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.L.getLayoutParams();
        float textureHeight = this.L.getTextureHeight(f11, f12) / this.L.getTextureHeight(width, height);
        float f16 = f12 / height;
        float f17 = f11 / width;
        if (this.e1) {
            i9 = (int) width;
            i10 = (int) height;
            float f18 = 1.0f - f10;
            float f19 = (textureHeight * f18) + f10;
            this.L.getTextureView().setScaleX(f19);
            this.L.getTextureView().setScaleY(f19);
            float f20 = ((1.0f - ((f16 * f18) + f10)) * height) / 2.0f;
            float f21 = ((1.0f - ((f17 * f18) + f10)) * width) / 2.0f;
            float f22 = f13 * f18;
            this.L.setTranslationX(((0.0f * f10) + f22) - f21);
            float f23 = f14 * f18;
            this.L.setTranslationY(((f15 * f10) + f23) - f20);
            this.g1 = f23 - this.L.getTranslationY();
            this.h1 = (height * f10) + (((f14 + f12) * f18) - this.L.getTranslationY());
            this.j1 = f22 - this.L.getTranslationX();
            this.i1 = (width * f10) + (((f13 + f11) * f18) - this.L.getTranslationX());
        } else {
            i9 = (int) f11;
            i10 = (int) f12;
            this.L.getTextureView().setScaleX(1.0f);
            this.L.getTextureView().setScaleY(1.0f);
            this.g1 = 0.0f;
            this.h1 = height;
            this.j1 = 0.0f;
            this.i1 = width;
            this.L.setTranslationX(f13);
            this.L.setTranslationY(f14);
        }
        if (layoutParams.width != i9 || layoutParams.height != i10) {
            layoutParams.width = i9;
            layoutParams.height = i10;
            this.L.requestLayout();
        }
        this.L.invalidateOutline();
        this.L.invalidate();
    }

    public void setCheckCameraWhenShown(boolean z10) {
        this.q0 = z10;
    }

    public void setIncludeVideosInGallery(boolean z10) {
        this.u0 = z10;
    }

    public void setStarsPrice(long j10) {
        HashMap hashMap = o1;
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
        A(getSelectedItemsCount());
        if (V(false)) {
            w0();
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        ki kiVar = this.b;
        if (kiVar.getSheetAnimationType() == 1) {
            float f11 = (f10 / 40.0f) * (-0.1f);
            kl klVar = this.A;
            int childCount = klVar.getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = klVar.getChildAt(i9);
                if (childAt instanceof org.telegram.ui.Cells.t5) {
                    org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                    float f12 = 1.0f + f11;
                    t5Var.getCheckBox().setScaleX(f12);
                    t5Var.getCheckBox().setScaleY(f12);
                }
            }
        }
        super.setTranslationY(f10);
        kiVar.getSheetContainer().invalidate();
        invalidate();
    }

    @Override // org.telegram.ui.Components.ci
    public final void t(int i9) {
        TLRPC.Chat k12;
        boolean z10;
        boolean z11;
        char c10 = 1;
        char c11 = 1;
        char c12 = 1;
        char c13 = 1;
        ki kiVar = this.b;
        if (i9 == 8) {
            kiVar.H1(!kiVar.Y, true);
            this.Z0.a(!kiVar.Y, true);
            return;
        }
        if ((i9 == 0 || i9 == 1) && kiVar.O1 > 0 && p1.size() > 1 && (k12 = kiVar.k1()) != null && !ChatObject.hasAdminRights(k12) && k12.slowmode_enabled) {
            y4.O(getContext(), LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSendError), null, null, this.a).o();
            return;
        }
        org.telegram.ui.ActionBar.b6 b6Var = this.a;
        HashMap hashMap = o1;
        final int i10 = 0;
        if (i9 == 0) {
            MessageObject messageObject = kiVar.D1;
            org.telegram.ui.ActionBar.o2 o2Var = kiVar.b0;
            if (messageObject == null && (o2Var instanceof org.telegram.ui.qn) && ((org.telegram.ui.qn) o2Var).c()) {
                y4.M(getContext(), ((org.telegram.ui.qn) o2Var).a(), new zk(this, c13 == true ? 1 : 0), b6Var);
                return;
            } else {
                y4.a0(kiVar.F1, kiVar.j1() + hashMap.size(), kiVar.n1(), new Utilities.Callback(this) { // from class: org.telegram.ui.Components.al
                    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        int i11 = i10;
                        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                        Long l10 = (Long) obj;
                        switch (i11) {
                            case 0:
                                boolean z12 = ChatAttachAlertPhotoLayout.m1;
                                ki kiVar2 = chatAttachAlertPhotoLayout.b;
                                kiVar2.Y0();
                                kiVar2.V1.L(7, false, true, 0, 0, 0L, kiVar2.s1(), false, l10.longValue());
                                break;
                            default:
                                boolean z13 = ChatAttachAlertPhotoLayout.m1;
                                ki kiVar3 = chatAttachAlertPhotoLayout.b;
                                kiVar3.Y0();
                                kiVar3.V1.L(4, true, true, 0, 0, 0L, kiVar3.s1(), false, l10.longValue());
                                break;
                        }
                    }
                });
                return;
            }
        }
        int i11 = 2;
        if (i9 == 1) {
            MessageObject messageObject2 = kiVar.D1;
            org.telegram.ui.ActionBar.o2 o2Var2 = kiVar.b0;
            if (messageObject2 == null && (o2Var2 instanceof org.telegram.ui.qn) && ((org.telegram.ui.qn) o2Var2).c()) {
                y4.M(getContext(), ((org.telegram.ui.qn) o2Var2).a(), new zk(this, i11), b6Var);
                return;
            }
            int i12 = kiVar.F1;
            long n12 = kiVar.n1();
            int j12 = kiVar.j1() + hashMap.size();
            final char c14 = c12 == true ? 1 : 0;
            y4.a0(i12, j12, n12, new Utilities.Callback(this) { // from class: org.telegram.ui.Components.al
                public final /* synthetic */ ChatAttachAlertPhotoLayout b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    int i112 = c14;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                    Long l10 = (Long) obj;
                    switch (i112) {
                        case 0:
                            boolean z12 = ChatAttachAlertPhotoLayout.m1;
                            ki kiVar2 = chatAttachAlertPhotoLayout.b;
                            kiVar2.Y0();
                            kiVar2.V1.L(7, false, true, 0, 0, 0L, kiVar2.s1(), false, l10.longValue());
                            break;
                        default:
                            boolean z13 = ChatAttachAlertPhotoLayout.m1;
                            ki kiVar3 = chatAttachAlertPhotoLayout.b;
                            kiVar3.Y0();
                            kiVar3.V1.L(4, true, true, 0, 0, 0L, kiVar3.s1(), false, l10.longValue());
                            break;
                    }
                }
            });
            return;
        }
        yl ylVar = this.C;
        kl klVar = this.A;
        if (i9 == 3) {
            hm hmVar = kiVar.m0;
            if (hmVar != null) {
                hmVar.J();
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
            AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.Components.bl
                public final /* synthetic */ ChatAttachAlertPhotoLayout b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i13 = i10;
                    boolean z13 = z12;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                    switch (i13) {
                        case 0:
                            boolean z14 = ChatAttachAlertPhotoLayout.m1;
                            ki kiVar2 = chatAttachAlertPhotoLayout.b;
                            org.telegram.ui.ActionBar.g1 g1Var = chatAttachAlertPhotoLayout.U0;
                            g1Var.setText(LocaleController.getString(z13 ? R.string.DisablePhotoSpoiler : R.string.EnablePhotoSpoiler));
                            if (z13) {
                                g1Var.setIcon(R.drawable.msg_spoiler_off);
                            } else {
                                g1Var.setAnimatedIcon(R.raw.photo_spoiler);
                            }
                            if (!z13) {
                                kiVar2.W0.K(1);
                                if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                    kiVar2.W0.K(6);
                                    break;
                                }
                            } else {
                                kiVar2.W0.r(1);
                                if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                    kiVar2.W0.r(6);
                                    break;
                                }
                            }
                            break;
                        default:
                            org.telegram.ui.ActionBar.g1 g1Var2 = chatAttachAlertPhotoLayout.W0;
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
            klVar.M(new dl(i10, arrayList, z12));
            if (kiVar.u0 != this) {
                ylVar.l();
            }
            hm hmVar2 = kiVar.m0;
            if (hmVar2 != null) {
                hmVar2.v.invalidate();
                return;
            }
            return;
        }
        if (i9 == 2) {
            hm hmVar3 = kiVar.m0;
            if (hmVar3 != null) {
                hmVar3.J();
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
            AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.Components.bl
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
                            boolean z14 = ChatAttachAlertPhotoLayout.m1;
                            ki kiVar2 = chatAttachAlertPhotoLayout.b;
                            org.telegram.ui.ActionBar.g1 g1Var = chatAttachAlertPhotoLayout.U0;
                            g1Var.setText(LocaleController.getString(z132 ? R.string.DisablePhotoSpoiler : R.string.EnablePhotoSpoiler));
                            if (z132) {
                                g1Var.setIcon(R.drawable.msg_spoiler_off);
                            } else {
                                g1Var.setAnimatedIcon(R.raw.photo_spoiler);
                            }
                            if (!z132) {
                                kiVar2.W0.K(1);
                                if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                    kiVar2.W0.K(6);
                                    break;
                                }
                            } else {
                                kiVar2.W0.r(1);
                                if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                    kiVar2.W0.r(6);
                                    break;
                                }
                            }
                            break;
                        default:
                            org.telegram.ui.ActionBar.g1 g1Var2 = chatAttachAlertPhotoLayout.W0;
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
            klVar.M(new dl(c10 == true ? 1 : 0, arrayList2, z13));
            if (kiVar.u0 != this) {
                ylVar.l();
            }
            hm hmVar4 = kiVar.m0;
            if (hmVar4 != null) {
                hmVar4.v.invalidate();
                return;
            }
            return;
        }
        if (i9 != 4) {
            if (i9 == 7) {
                kiVar.Z1(kiVar.u0 != kiVar.m0);
                return;
            }
            if (i9 == 9) {
                gh.oa.g1(getContext(), getStarsPrice(), true, new d(this, 6), this.a);
                return;
            }
            if (i9 >= 10) {
                MediaController.AlbumEntry albumEntry = (MediaController.AlbumEntry) this.R0.get(i9 - 10);
                this.P0 = albumEntry;
                MediaController.AlbumEntry albumEntry2 = this.Q0;
                TextView textView = this.x;
                if (albumEntry == albumEntry2) {
                    textView.setText(LocaleController.getString(R.string.ChatGallery));
                } else {
                    textView.setText(albumEntry.bucketName);
                }
                ylVar.l();
                this.v.l();
                this.B.h1(0, -(klVar.getPaddingTop() - getTopScrollOffset()));
                return;
            }
            return;
        }
        try {
            if (p0()) {
                Intent intent = new Intent();
                intent.setType("video/*");
                intent.setAction("android.intent.action.GET_CONTENT");
                intent.putExtra("android.intent.extra.sizeLimit", FileLoader.DEFAULT_MAX_FILE_SIZE);
                Intent intent2 = new Intent("android.intent.action.PICK");
                intent2.setType("image/*");
                Intent createChooser = Intent.createChooser(intent2, null);
                createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", new Intent[]{intent});
                int i13 = kiVar.M0;
                org.telegram.ui.ActionBar.o2 o2Var3 = kiVar.b0;
                if (i13 != 0) {
                    o2Var3.startActivityForResult(createChooser, 14);
                } else {
                    o2Var3.startActivityForResult(createChooser, 1);
                }
            } else {
                Intent intent3 = new Intent("android.intent.action.PICK");
                intent3.setType("image/*");
                int i14 = kiVar.M0;
                org.telegram.ui.ActionBar.o2 o2Var4 = kiVar.b0;
                if (i14 != 0) {
                    o2Var4.startActivityForResult(intent3, 14);
                } else {
                    o2Var4.startActivityForResult(intent3, 1);
                }
            }
            kiVar.dismiss(true);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final void t0() {
        pl plVar = this.w;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = plVar.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        if (this.r0) {
            ArrayList<MediaController.AlbumEntry> arrayList = p0() ? MediaController.allMediaAlbums : MediaController.allPhotoAlbums;
            ArrayList arrayList2 = new ArrayList(arrayList);
            this.R0 = arrayList2;
            Collections.sort(arrayList2, new fl(arrayList, 0));
        } else {
            this.R0 = new ArrayList();
        }
        boolean isEmpty = this.R0.isEmpty();
        TextView textView = this.x;
        if (isEmpty) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.y, (Drawable) null);
        int size = this.R0.size();
        for (int i9 = 0; i9 < size; i9++) {
            MediaController.AlbumEntry albumEntry = (MediaController.AlbumEntry) this.R0.get(i9);
            kh.a aVar = new kh.a(getContext(), albumEntry.coverPhoto, albumEntry.bucketName, albumEntry.photos.size(), this.a);
            plVar.getPopupLayout().addView(aVar);
            aVar.setOnClickListener(new gh.z0(this, i9 + 10, 7));
        }
    }

    @Override // org.telegram.ui.Components.ci
    public final void u() {
        ki kiVar = this.b;
        T(kiVar != null && (kiVar.b0 instanceof org.telegram.ui.qn));
    }

    public final void u0() {
        kl klVar = this.A;
        if (klVar != null) {
            for (int i9 = 0; i9 < klVar.getChildCount(); i9++) {
                View childAt = klVar.getChildAt(i9);
                if (childAt instanceof org.telegram.ui.Cells.t5) {
                    ((org.telegram.ui.Cells.t5) childAt).a.invalidate();
                }
            }
        }
    }

    public final void v0() {
        ArrayList arrayList;
        if (this.b.b0 instanceof org.telegram.ui.qn) {
            kl klVar = this.A;
            int childCount = klVar.getChildCount();
            int i9 = 0;
            while (true) {
                arrayList = p1;
                if (i9 >= childCount) {
                    break;
                }
                View childAt = klVar.getChildAt(i9);
                if (childAt instanceof org.telegram.ui.Cells.t5) {
                    org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                    MediaController.PhotoEntry a02 = a0(((Integer) t5Var.getTag()).intValue());
                    if (a02 != null) {
                        t5Var.setNum(arrayList.indexOf(Integer.valueOf(a02.imageId)));
                    }
                }
                i9++;
            }
            kl klVar2 = this.r;
            int childCount2 = klVar2.getChildCount();
            for (int i10 = 0; i10 < childCount2; i10++) {
                View childAt2 = klVar2.getChildAt(i10);
                if (childAt2 instanceof org.telegram.ui.Cells.t5) {
                    org.telegram.ui.Cells.t5 t5Var2 = (org.telegram.ui.Cells.t5) childAt2;
                    MediaController.PhotoEntry a03 = a0(((Integer) t5Var2.getTag()).intValue());
                    if (a03 != null) {
                        t5Var2.setNum(arrayList.indexOf(Integer.valueOf(a03.imageId)));
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.ci
    public final void w(int i9, boolean z10) {
        U();
        ul ulVar = this.L;
        if (ulVar != null) {
            ulVar.invalidateOutline();
            this.L.invalidate();
        }
    }

    public final void w0() {
        ArrayList arrayList;
        yl ylVar;
        HashMap hashMap;
        ki kiVar = this.b;
        org.telegram.ui.ActionBar.o2 o2Var = kiVar.b0;
        org.telegram.ui.ActionBar.o2 o2Var2 = kiVar.b0;
        if (o2Var instanceof org.telegram.ui.qn) {
            kl klVar = this.A;
            int childCount = klVar.getChildCount();
            int i9 = 0;
            while (true) {
                arrayList = p1;
                ylVar = this.C;
                hashMap = o1;
                if (i9 >= childCount) {
                    break;
                }
                View childAt = klVar.getChildAt(i9);
                if (childAt instanceof org.telegram.ui.Cells.t5) {
                    org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                    int R = RecyclerView.R(childAt);
                    if (ylVar.f && R > this.I0) {
                        R--;
                    }
                    if (ylVar.d && this.P0 == this.Q0) {
                        R--;
                    }
                    MediaController.PhotoEntry a02 = a0(R);
                    t5Var.setHasSpoiler(a02 != null && a02.hasSpoiler);
                    t5Var.setHighQuality(a02 != null && a02.isHighQuality());
                    if ((o2Var2 instanceof org.telegram.ui.qn) && kiVar.P1) {
                        t5Var.b(a02 != null ? arrayList.indexOf(Integer.valueOf(a02.imageId)) : -1, a02 != null && hashMap.containsKey(Integer.valueOf(a02.imageId)), true);
                    } else {
                        t5Var.b(-1, a02 != null && hashMap.containsKey(Integer.valueOf(a02.imageId)), true);
                    }
                }
                i9++;
            }
            kl klVar2 = this.r;
            int childCount2 = klVar2.getChildCount();
            for (int i10 = 0; i10 < childCount2; i10++) {
                View childAt2 = klVar2.getChildAt(i10);
                if (childAt2 instanceof org.telegram.ui.Cells.t5) {
                    org.telegram.ui.Cells.t5 t5Var2 = (org.telegram.ui.Cells.t5) childAt2;
                    int R2 = RecyclerView.R(childAt2);
                    if (ylVar.f && R2 > this.I0) {
                        R2--;
                    }
                    if (ylVar.d && this.P0 == this.Q0) {
                        R2--;
                    }
                    MediaController.PhotoEntry a03 = a0(R2);
                    t5Var2.setHasSpoiler(a03 != null && a03.hasSpoiler);
                    t5Var2.setHighQuality(a03 != null && a03.isHighQuality());
                    if ((o2Var2 instanceof org.telegram.ui.qn) && kiVar.P1) {
                        t5Var2.b(a03 != null ? arrayList.indexOf(Integer.valueOf(a03.imageId)) : -1, a03 != null && hashMap.containsKey(Integer.valueOf(a03.imageId)), true);
                    } else {
                        t5Var2.b(-1, a03 != null && hashMap.containsKey(Integer.valueOf(a03.imageId)), true);
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.ci
    public final void x() {
        ShutterButton shutterButton = this.g0;
        if (shutterButton == null) {
            return;
        }
        boolean z10 = this.M0;
        lu0 lu0Var = lu0.a;
        lu0 lu0Var2 = lu0.b;
        if (z10) {
            if (this.L != null && shutterButton.getState() == lu0Var2) {
                shutterButton.a(lu0Var);
            }
            this.M0 = false;
            return;
        }
        if (this.L != null && shutterButton.getState() == lu0Var2) {
            k0();
            CameraController.getInstance().stopVideoRecording(this.L.getCameraSession(), false);
            shutterButton.a(lu0Var);
        }
        if (this.U) {
            Z(false);
        }
        c0(true);
    }

    public final void x0(boolean z10) {
        TextView textView = this.l0;
        if (textView != null) {
            ki kiVar = this.b;
            int i9 = kiVar.M0;
            TextView textView2 = kiVar.f1;
            if (i9 != 0 || kiVar.P0 || kiVar.D) {
                return;
            }
            HashMap hashMap = o1;
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
                if (max != this.I || z10) {
                    textView2.setText(LocaleController.formatPluralString("MediaSelected", max, new Object[0]));
                }
            } else if (z11) {
                textView.setText(LocaleController.formatPluralString("Videos", hashMap.size(), new Object[0]).toUpperCase());
                if (max != this.I || z10) {
                    textView2.setText(LocaleController.formatPluralString("VideosSelected", max, new Object[0]));
                }
            } else {
                textView.setText(LocaleController.formatPluralString("Photos", hashMap.size(), new Object[0]).toUpperCase());
                if (max != this.I || z10) {
                    textView2.setText(LocaleController.formatPluralString("PhotosSelected", max, new Object[0]));
                }
            }
            boolean z13 = max > 1;
            kiVar.I = z13;
            kiVar.i1.setVisibility((!z13 || kiVar.M0 == 2) ? 8 : 0);
            this.I = max;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00de  */
    @Override // org.telegram.ui.Components.ci
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(int i9, int i10) {
        int D;
        int i11;
        int dp;
        this.N0 = true;
        int i12 = this.I0;
        if (AndroidUtilities.isTablet()) {
            this.I0 = 4;
        } else {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                this.I0 = 4;
            } else {
                this.I0 = 3;
            }
        }
        this.l1 = AndroidUtilities.dp(48.0f) + AndroidUtilities.navigationBarHeight;
        kl klVar = this.A;
        ((FrameLayout.LayoutParams) klVar.getLayoutParams()).topMargin = -this.l1;
        int dp2 = (i9 - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(4.0f);
        int i13 = this.I0;
        int i14 = dp2 / i13;
        this.G0 = i14;
        if (this.H0 != i14 || i12 != i13) {
            this.H0 = i14;
            AndroidUtilities.runOnUIThread(new cl(this, 2));
        }
        this.B.y1(Math.max(1, ((this.I0 - 1) * AndroidUtilities.dp(2.0f)) + (this.G0 * this.I0)));
        yl ylVar = this.C;
        int ceil = (int) Math.ceil((ylVar.h() - 1) / this.I0);
        if (this.L0) {
            D = AndroidUtilities.dp(400.0f);
        } else {
            D = org.telegram.messenger.l0.D(2.0f, ceil - 1, this.G0 * ceil);
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        int z10 = org.telegram.messenger.l0.z(6.0f, (((i10 - D) - currentActionBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(12.0f), 0);
        if (this.F != z10) {
            this.F = z10;
            ylVar.l();
        }
        if (!AndroidUtilities.isTablet()) {
            Point point2 = AndroidUtilities.displaySize;
            if (point2.x > point2.y) {
                i11 = (int) (i10 / 3.5f);
                dp = ((i11 + currentActionBarHeight) - AndroidUtilities.dp(52.0f)) + this.l1;
                if (dp < 0) {
                    dp = 0;
                }
                if (klVar.getPaddingTop() == dp || klVar.getPaddingBottom() != this.e) {
                    klVar.setPadding(AndroidUtilities.dp(2.0f), dp, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(48.0f) + this.e);
                }
                this.x.setTextSize(17.0f);
                this.N0 = false;
            }
        }
        i11 = (i10 / 5) * 2;
        dp = ((i11 + currentActionBarHeight) - AndroidUtilities.dp(52.0f)) + this.l1;
        if (dp < 0) {
        }
        if (klVar.getPaddingTop() == dp) {
        }
        klVar.setPadding(AndroidUtilities.dp(2.0f), dp, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(48.0f) + this.e);
        this.x.setTextSize(17.0f);
        this.N0 = false;
    }

    @Override // org.telegram.ui.Components.ci
    public final void z() {
        ki kiVar = this.b;
        if (!kiVar.isShowing() || kiVar.isDismissed() || PhotoViewer.t1().Q1()) {
            return;
        }
        T(false);
    }
}
