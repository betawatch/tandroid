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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public class ChatAttachAlertPhotoLayout extends ei implements NotificationCenter.NotificationCenterDelegate {
    public static boolean n1;
    public static final ArrayList o1 = new ArrayList();
    public static final HashMap p1 = new HashMap();
    public static final ArrayList q1 = new ArrayList();
    public static int r1 = -1;
    public boolean A0;
    public final ql B;
    public final Rect B0;
    public final zi C;
    public float C0;
    public final fm D;
    public boolean D0;
    public final oz E;
    public boolean E0;
    public final wl0 F;
    public boolean F0;
    public int G;
    public boolean G0;
    public boolean H;
    public int H0;
    public int I;
    public int I0;
    public int J;
    public int J0;
    public boolean K;
    public boolean K0;
    public AnimatorSet L;
    public boolean L0;
    public bm M;
    public boolean M0;
    public final cm N;
    public boolean N0;
    public final zl O;
    public boolean O0;
    public final ImageView[] P;
    public int P0;
    public boolean Q;
    public MediaController.AlbumEntry Q0;
    public final float[] R;
    public MediaController.AlbumEntry R0;
    public final int[] S;
    public ArrayList S0;
    public float T;
    public float T0;
    public float U;
    public boolean U0;
    public boolean V;
    public final org.telegram.ui.ActionBar.g1 V0;
    public boolean W;
    public final org.telegram.ui.ActionBar.g1 W0;
    public final org.telegram.ui.ActionBar.g1 X0;
    public final org.telegram.ui.ActionBar.g1 Y0;
    public final org.telegram.ui.ActionBar.g1 Z0;
    public boolean a0;
    public final xb0 a1;
    public float b0;
    public final boolean b1;
    public final int[] c0;
    public final AnimationNotificationsLocker c1;
    public int d0;
    public boolean d1;
    public nl e0;
    public final vl e1;
    public final DecelerateInterpolator f0;
    public boolean f1;
    public final eg.s2 g0;
    public float g1;
    public final ShutterButton h0;
    public float h1;
    public final i91 i0;
    public float i1;
    public AnimatorSet j0;
    public float j1;
    public Runnable k0;
    public float k1;
    public Boolean l0;
    public ViewPropertyAnimator l1;
    public final TextView m0;
    public int m1;
    public final boolean n;
    public final TextView n0;
    public final ImageView o0;
    public boolean p0;
    public boolean q0;
    public final ql r;
    public boolean r0;
    public final org.telegram.ui.k s;
    public boolean s0;
    public boolean t0;
    public boolean u0;
    public final fm v;
    public boolean v0;
    public final wl w;
    public boolean w0;
    public final TextView x;
    public float x0;
    public final Drawable y;
    public float y0;
    public boolean z0;

    /* JADX WARN: Multi-variable type inference failed */
    public ChatAttachAlertPhotoLayout(mi miVar, Context context, boolean z4, boolean z10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var, miVar);
        this.P = new ImageView[2];
        this.R = new float[2];
        this.S = new int[2];
        this.c0 = new int[5];
        this.f0 = new DecelerateInterpolator(1.5f);
        this.l0 = null;
        this.B0 = new Rect();
        int dp = AndroidUtilities.dp(80.0f);
        this.H0 = dp;
        this.I0 = dp;
        this.J0 = 3;
        this.U0 = true;
        this.c1 = new AnimationNotificationsLocker();
        this.e1 = new vl(this);
        this.b1 = z4;
        this.n = z10;
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.cameraInitied);
        org.telegram.ui.ActionBar.f3 container = miVar.getContainer();
        mi miVar2 = this.b;
        int i10 = 0;
        this.d1 = miVar2.N0 != 0;
        wl wlVar = new wl(this, context, miVar2.U0.n(), g6Var, 0);
        this.w = wlVar;
        wlVar.setSubMenuOpenSide(1);
        FrameLayout.LayoutParams d = k7.c6.d(-2, -1.0f, 51, 60.0f, 0.0f, 40.0f, 0.0f);
        d.topMargin = AndroidUtilities.statusBarHeight;
        this.b.U0.addView(wlVar, 0, d);
        final int i11 = 3;
        wlVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.dl
            public final /* synthetic */ ChatAttachAlertPhotoLayout b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bm bmVar;
                bm bmVar2;
                int i12 = i11;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                switch (i12) {
                    case 0:
                        if (chatAttachAlertPhotoLayout.M != null) {
                            chatAttachAlertPhotoLayout.j0(null, false, false);
                            CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.M.getCameraSessionObject());
                            break;
                        }
                        break;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.p0 && (bmVar = chatAttachAlertPhotoLayout.M) != null && bmVar.isInited()) {
                            chatAttachAlertPhotoLayout.W = false;
                            chatAttachAlertPhotoLayout.M.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.o0, (Property<ImageView, Float>) View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new pl(chatAttachAlertPhotoLayout));
                            duration.start();
                            break;
                        }
                        break;
                    case 2:
                        if (!chatAttachAlertPhotoLayout.Q && (bmVar2 = chatAttachAlertPhotoLayout.M) != null && bmVar2.isInited() && chatAttachAlertPhotoLayout.V) {
                            String currentFlashMode = chatAttachAlertPhotoLayout.M.getCameraSession().getCurrentFlashMode();
                            String nextFlashMode = chatAttachAlertPhotoLayout.M.getCameraSession().getNextFlashMode();
                            if (!currentFlashMode.equals(nextFlashMode)) {
                                chatAttachAlertPhotoLayout.M.getCameraSession().setCurrentFlashMode(nextFlashMode);
                                chatAttachAlertPhotoLayout.Q = true;
                                ImageView[] imageViewArr = chatAttachAlertPhotoLayout.P;
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
                                animatorSet.setInterpolator(pr.f);
                                animatorSet.addListener(new oh.h3(chatAttachAlertPhotoLayout, view, imageView, 3));
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
        int i12 = org.telegram.ui.ActionBar.k6.j5;
        textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(i12, this.a));
        textView.setText(LocaleController.getString(R.string.ChatGallery));
        textView.setTypeface(AndroidUtilities.bold());
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_arrow_drop_down).mutate();
        this.y = mutate;
        int v02 = org.telegram.ui.ActionBar.k6.v0(i12, this.a);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(v02, mode));
        textView.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
        wlVar.addView(textView, k7.c6.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
        U(false);
        xb0 xb0Var = new xb0(context, R.raw.position_below, LocaleController.getString(R.string.CaptionAbove), R.raw.position_above, LocaleController.getString(R.string.CaptionBelow), g6Var);
        this.a1 = xb0Var;
        xb0Var.a(!this.b.Z, false);
        this.Z0 = this.b.X0.e(7, R.drawable.msg_view_file, LocaleController.getString(R.string.AttachMediaPreviewButton));
        this.b.X0.a(5);
        this.b.X0.e(4, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp));
        this.W0 = this.b.X0.e(1, R.drawable.msg_filehq, LocaleController.getString(R.string.SendWithoutCompression));
        this.b.X0.e(0, R.drawable.msg_ungroup, LocaleController.getString(R.string.SendWithoutGrouping));
        this.b.X0.a(6);
        this.V0 = this.b.X0.e(3, R.drawable.msg_spoiler, LocaleController.getString(R.string.EnablePhotoSpoiler));
        this.X0 = this.b.X0.e(2, R.drawable.menu_quality_hd, LocaleController.getString(R.string.SendInHighQuality));
        org.telegram.ui.ActionBar.w0 w0Var = this.b.X0;
        w0Var.o();
        xb0Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
        xb0Var.setTag(8);
        w0Var.b.addView(xb0Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) xb0Var.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(48.0f);
        xb0Var.setLayoutParams(layoutParams);
        xb0Var.setOnClickListener(new org.telegram.ui.ActionBar.b0(w0Var, 2));
        this.Y0 = this.b.X0.e(9, R.drawable.menu_feature_paid, LocaleController.getString(R.string.PaidMediaButton));
        this.b.X0.setFitSubItems(true);
        ql qlVar = new ql(this, context, g6Var, 1);
        this.B = qlVar;
        qlVar.setFastScrollEnabled(1);
        qlVar.setFastScrollVisible(true);
        qlVar.getFastScroll().setAlpha(0.0f);
        qlVar.getFastScroll().a = false;
        qlVar.getFastScroll().e0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        fm fmVar = new fm(this, context, z10);
        this.D = fmVar;
        qlVar.setAdapter(fmVar);
        cm cmVar = new cm(this, qlVar);
        this.N = cmVar;
        qlVar.i(cmVar);
        for (int i13 = 0; i13 < 8; i13++) {
            fmVar.h.add(fmVar.L());
        }
        qlVar.setClipToPadding(false);
        qlVar.setItemAnimator(null);
        qlVar.setLayoutAnimation(null);
        qlVar.setVerticalScrollBarEnabled(false);
        qlVar.setGlowColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.A5, this.a));
        addView(qlVar, k7.c6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, -48.0f));
        qlVar.setOnScrollListener(new org.telegram.ui.l6(this, 1));
        zi ziVar = new zi(this, this.H0, 1);
        this.C = ziVar;
        ziVar.O = new lh.n5(this, 3);
        qlVar.setLayoutManager(ziVar);
        qlVar.setOnItemClickListener(new com.google.firebase.messaging.i(this, z10, g6Var, 6));
        qlVar.setOnItemLongClickListener(new el(this, 3));
        wl0 wl0Var = new wl0(new yl(this));
        this.F = wl0Var;
        qlVar.B.add(wl0Var);
        this.c = qlVar;
        this.d = qlVar;
        this.f = true;
        oz ozVar = new oz(context, g6Var);
        this.E = ozVar;
        ozVar.setText(LocaleController.getString(R.string.NoPhotos));
        ozVar.setOnTouchListener(null);
        ozVar.setTextSize(16);
        addView(ozVar, k7.c6.c(-2.0f, -1));
        if (this.U0) {
            ozVar.b();
        } else {
            ozVar.c();
        }
        Paint paint = new Paint(1);
        paint.setColor(-2468275);
        zl zlVar = new zl(context, paint);
        this.O = zlVar;
        AndroidUtilities.updateViewVisibilityAnimated(zlVar, false, 1.0f, false);
        zlVar.setBackgroundResource(R.drawable.system);
        zlVar.getBackground().setColorFilter(new PorterDuffColorFilter(1711276032, mode));
        zlVar.setTextSize(1, 15.0f);
        zlVar.setTypeface(AndroidUtilities.bold());
        zlVar.setAlpha(0.0f);
        zlVar.setTextColor(-1);
        zlVar.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f));
        container.addView(zlVar, k7.c6.d(-2, -2.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
        eg.s2 s2Var = new eg.s2(this, context, 16);
        this.g0 = s2Var;
        s2Var.setVisibility(8);
        s2Var.setAlpha(0.0f);
        container.addView(s2Var, k7.c6.e(-1, 126, 83));
        TextView textView2 = new TextView(context);
        this.m0 = textView2;
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
        container.addView(textView2, k7.c6.d(-2, 38.0f, 51, 0.0f, 0.0f, 0.0f, 116.0f));
        final int i14 = 0;
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.dl
            public final /* synthetic */ ChatAttachAlertPhotoLayout b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bm bmVar;
                bm bmVar2;
                int i122 = i14;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                switch (i122) {
                    case 0:
                        if (chatAttachAlertPhotoLayout.M != null) {
                            chatAttachAlertPhotoLayout.j0(null, false, false);
                            CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.M.getCameraSessionObject());
                            break;
                        }
                        break;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.p0 && (bmVar = chatAttachAlertPhotoLayout.M) != null && bmVar.isInited()) {
                            chatAttachAlertPhotoLayout.W = false;
                            chatAttachAlertPhotoLayout.M.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.o0, (Property<ImageView, Float>) View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new pl(chatAttachAlertPhotoLayout));
                            duration.start();
                            break;
                        }
                        break;
                    case 2:
                        if (!chatAttachAlertPhotoLayout.Q && (bmVar2 = chatAttachAlertPhotoLayout.M) != null && bmVar2.isInited() && chatAttachAlertPhotoLayout.V) {
                            String currentFlashMode = chatAttachAlertPhotoLayout.M.getCameraSession().getCurrentFlashMode();
                            String nextFlashMode = chatAttachAlertPhotoLayout.M.getCameraSession().getNextFlashMode();
                            if (!currentFlashMode.equals(nextFlashMode)) {
                                chatAttachAlertPhotoLayout.M.getCameraSession().setCurrentFlashMode(nextFlashMode);
                                chatAttachAlertPhotoLayout.Q = true;
                                ImageView[] imageViewArr = chatAttachAlertPhotoLayout.P;
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
                                animatorSet.setInterpolator(pr.f);
                                animatorSet.addListener(new oh.h3(chatAttachAlertPhotoLayout, view, imageView, 3));
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
        i91 i91Var = new i91(context);
        this.i0 = i91Var;
        i91Var.setVisibility(8);
        i91Var.setAlpha(0.0f);
        container.addView(i91Var, k7.c6.d(-2, 50.0f, 51, 0.0f, 0.0f, 0.0f, 116.0f));
        i91Var.setDelegate(new el(this, i14));
        ShutterButton shutterButton = new ShutterButton(context);
        shutterButton.b = new DecelerateInterpolator();
        shutterButton.w = new ul0(shutterButton, 2);
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
        shutterButton.f = fv0.a;
        this.h0 = shutterButton;
        s2Var.addView(shutterButton, k7.c6.e(84, 84, 17));
        shutterButton.setDelegate(new ol(this, g6Var, container));
        shutterButton.setFocusable(true);
        shutterButton.setContentDescription(LocaleController.getString(R.string.AccDescrShutter));
        ImageView imageView = new ImageView(context);
        this.o0 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        s2Var.addView(imageView, k7.c6.e(48, 48, 21));
        final int i15 = 1;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.dl
            public final /* synthetic */ ChatAttachAlertPhotoLayout b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bm bmVar;
                bm bmVar2;
                int i122 = i15;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                switch (i122) {
                    case 0:
                        if (chatAttachAlertPhotoLayout.M != null) {
                            chatAttachAlertPhotoLayout.j0(null, false, false);
                            CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.M.getCameraSessionObject());
                            break;
                        }
                        break;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.p0 && (bmVar = chatAttachAlertPhotoLayout.M) != null && bmVar.isInited()) {
                            chatAttachAlertPhotoLayout.W = false;
                            chatAttachAlertPhotoLayout.M.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.o0, (Property<ImageView, Float>) View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new pl(chatAttachAlertPhotoLayout));
                            duration.start();
                            break;
                        }
                        break;
                    case 2:
                        if (!chatAttachAlertPhotoLayout.Q && (bmVar2 = chatAttachAlertPhotoLayout.M) != null && bmVar2.isInited() && chatAttachAlertPhotoLayout.V) {
                            String currentFlashMode = chatAttachAlertPhotoLayout.M.getCameraSession().getCurrentFlashMode();
                            String nextFlashMode = chatAttachAlertPhotoLayout.M.getCameraSession().getNextFlashMode();
                            if (!currentFlashMode.equals(nextFlashMode)) {
                                chatAttachAlertPhotoLayout.M.getCameraSession().setCurrentFlashMode(nextFlashMode);
                                chatAttachAlertPhotoLayout.Q = true;
                                ImageView[] imageViewArr = chatAttachAlertPhotoLayout.P;
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
                                animatorSet.setInterpolator(pr.f);
                                animatorSet.addListener(new oh.h3(chatAttachAlertPhotoLayout, view, imageView2, 3));
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
        for (int i16 = 0; i16 < 2; i16++) {
            this.P[i16] = new ImageView(context);
            this.P[i16].setScaleType(ImageView.ScaleType.CENTER);
            this.P[i16].setVisibility(4);
            this.g0.addView(this.P[i16], k7.c6.e(48, 48, 51));
            final int i17 = 2;
            this.P[i16].setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.dl
                public final /* synthetic */ ChatAttachAlertPhotoLayout b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    bm bmVar;
                    bm bmVar2;
                    int i122 = i17;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                    switch (i122) {
                        case 0:
                            if (chatAttachAlertPhotoLayout.M != null) {
                                chatAttachAlertPhotoLayout.j0(null, false, false);
                                CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.M.getCameraSessionObject());
                                break;
                            }
                            break;
                        case 1:
                            if (!chatAttachAlertPhotoLayout.p0 && (bmVar = chatAttachAlertPhotoLayout.M) != null && bmVar.isInited()) {
                                chatAttachAlertPhotoLayout.W = false;
                                chatAttachAlertPhotoLayout.M.switchCamera();
                                ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.o0, (Property<ImageView, Float>) View.SCALE_X, 0.0f).setDuration(100L);
                                duration.addListener(new pl(chatAttachAlertPhotoLayout));
                                duration.start();
                                break;
                            }
                            break;
                        case 2:
                            if (!chatAttachAlertPhotoLayout.Q && (bmVar2 = chatAttachAlertPhotoLayout.M) != null && bmVar2.isInited() && chatAttachAlertPhotoLayout.V) {
                                String currentFlashMode = chatAttachAlertPhotoLayout.M.getCameraSession().getCurrentFlashMode();
                                String nextFlashMode = chatAttachAlertPhotoLayout.M.getCameraSession().getNextFlashMode();
                                if (!currentFlashMode.equals(nextFlashMode)) {
                                    chatAttachAlertPhotoLayout.M.getCameraSession().setCurrentFlashMode(nextFlashMode);
                                    chatAttachAlertPhotoLayout.Q = true;
                                    ImageView[] imageViewArr = chatAttachAlertPhotoLayout.P;
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
                                    animatorSet.setInterpolator(pr.f);
                                    animatorSet.addListener(new oh.h3(chatAttachAlertPhotoLayout, view, imageView2, 3));
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
            this.P[i16].setContentDescription("flash mode " + i16);
        }
        TextView textView3 = new TextView(context);
        this.n0 = textView3;
        textView3.setTextSize(1, 15.0f);
        textView3.setTextColor(-1);
        textView3.setShadowLayer(org.telegram.ui.b.e(3.33333f, R.string.TapForVideo, textView3), 0.0f, AndroidUtilities.dp(0.666f), 1275068416);
        textView3.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        this.g0.addView(textView3, k7.c6.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        ql qlVar2 = new ql(this, context, g6Var, 0);
        this.r = qlVar2;
        qlVar2.setVerticalScrollBarEnabled(true);
        fm fmVar2 = new fm(this, context, false);
        this.v = fmVar2;
        qlVar2.setAdapter(fmVar2);
        for (int i18 = 0; i18 < 8; i18++) {
            fmVar2.h.add(fmVar2.L());
        }
        qlVar2.setClipToPadding(false);
        qlVar2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        qlVar2.setItemAnimator(null);
        qlVar2.setLayoutAnimation(null);
        qlVar2.setOverScrollMode(2);
        qlVar2.setVisibility(4);
        qlVar2.setAlpha(0.0f);
        container.addView(qlVar2, k7.c6.c(80.0f, -1));
        org.telegram.ui.k kVar = new org.telegram.ui.k(i10, null == true ? 1 : 0, 5);
        this.s = kVar;
        qlVar2.setLayoutManager(kVar);
        qlVar2.setOnItemClickListener(new lh.a(3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x015a, code lost:
    
        if (r4.T != false) goto L93;
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
    public static void J(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z4, org.telegram.ui.ActionBar.g6 g6Var, View view, int i10) {
        org.telegram.ui.xn xnVar;
        boolean z10;
        Object obj;
        Object obj2;
        int i11 = i10;
        fm fmVar = chatAttachAlertPhotoLayout.D;
        mi miVar = chatAttachAlertPhotoLayout.b;
        if (chatAttachAlertPhotoLayout.s0) {
            boolean z11 = miVar.S;
            org.telegram.ui.ActionBar.p2 p2Var = miVar.c0;
            if (z11) {
                return;
            }
            org.telegram.ui.ActionBar.p2 R = p2Var == null ? LaunchActivity.R() : p2Var;
            if (R == null || (view instanceof i20)) {
                return;
            }
            int i12 = Build.VERSION.SDK_INT;
            int i13 = 4;
            if (i12 >= 23) {
                try {
                    if (fmVar.d && chatAttachAlertPhotoLayout.Q0 == chatAttachAlertPhotoLayout.R0 && i11 == 0 && chatAttachAlertPhotoLayout.L0) {
                        R.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 18);
                        return;
                    } else if (chatAttachAlertPhotoLayout.M0) {
                        if (i12 >= 33) {
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
            boolean z12 = fmVar.f;
            if (z12 && i11 == chatAttachAlertPhotoLayout.J0) {
                chatAttachAlertPhotoLayout.i0();
                return;
            }
            if (i11 == 0 && z4 && chatAttachAlertPhotoLayout.Q0 == chatAttachAlertPhotoLayout.R0) {
                chatAttachAlertPhotoLayout.i0();
                return;
            }
            if (z12 && i11 > chatAttachAlertPhotoLayout.J0) {
                i11--;
            }
            if (chatAttachAlertPhotoLayout.Q0 == chatAttachAlertPhotoLayout.R0 && z4) {
                i11--;
            }
            org.telegram.ui.xn xnVar2 = null;
            if (chatAttachAlertPhotoLayout.d1) {
                if (i11 == 0) {
                    if (!(view instanceof y8)) {
                        return;
                    }
                    chatAttachAlertPhotoLayout.r0((y8) view, null, 0L);
                    miVar.dismiss();
                }
                i11--;
            }
            ArrayList<Object> allPhotosArray = chatAttachAlertPhotoLayout.getAllPhotosArray();
            if (i11 < 0 || i11 >= allPhotosArray.size()) {
                return;
            }
            ki kiVar = miVar.W1;
            ArrayList arrayList = q1;
            HashMap hashMap = p1;
            if (kiVar != null && kiVar.b2() && (allPhotosArray.get(i11) instanceof MediaController.PhotoEntry)) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) allPhotosArray.get(i11);
                hashMap.clear();
                if (photoEntry != null) {
                    chatAttachAlertPhotoLayout.Q(photoEntry, -1);
                }
                miVar.Y0();
                miVar.W1.I1(7, true, true, 0, 0, 0L, miVar.s1(), false, 0L);
                hashMap.clear();
                o1.clear();
                arrayList.clear();
                hashMap.clear();
                return;
            }
            PhotoViewer.t1().K2(null, R, g6Var);
            PhotoViewer.t1().L2(miVar);
            PhotoViewer t12 = PhotoViewer.t1();
            int i14 = miVar.P1;
            boolean z13 = miVar.Q1;
            t12.h = i14;
            t12.n = z13;
            if (!miVar.C || !miVar.D) {
                if (miVar.N0 != 0) {
                    xnVar = null;
                    i13 = 1;
                } else {
                    if (p2Var instanceof org.telegram.ui.xn) {
                        xnVar2 = (org.telegram.ui.xn) p2Var;
                    }
                    xnVar = xnVar2;
                    i13 = 0;
                }
                if (!miVar.W1.h0()) {
                    AndroidUtilities.hideKeyboard(R.getFragmentView().findFocus());
                    AndroidUtilities.hideKeyboard(miVar.getContainer().findFocus());
                }
                if (hashMap.size() > 0 && arrayList.size() > 0) {
                    obj2 = hashMap.get(arrayList.get(0));
                    if (obj2 instanceof MediaController.PhotoEntry) {
                        ((MediaController.PhotoEntry) obj2).caption = miVar.m1().getText();
                    }
                    if (obj2 instanceof MediaController.SearchImage) {
                        ((MediaController.SearchImage) obj2).caption = miVar.m1().getText();
                    }
                }
                if (miVar.N != null) {
                    miVar.N.e = allPhotosArray.get(i11) instanceof MediaController.PhotoEntry ? ((MediaController.PhotoEntry) allPhotosArray.get(i11)).isVideo : false;
                }
                z10 = !(allPhotosArray.get(i11) instanceof MediaController.PhotoEntry) && ((MediaController.PhotoEntry) allPhotosArray.get(i11)).hasSpoiler;
                obj = allPhotosArray.get(i11);
                if ((obj instanceof MediaController.PhotoEntry) || !chatAttachAlertPhotoLayout.X((MediaController.PhotoEntry) obj)) {
                    if (z10) {
                        chatAttachAlertPhotoLayout.p0(i11, false);
                    }
                    AndroidUtilities.runOnUIThread(new nj(chatAttachAlertPhotoLayout, i13, R, allPhotosArray, i11, xnVar), z10 ? 250L : 0L);
                }
                return;
            }
            i13 = 11;
            if (p2Var instanceof org.telegram.ui.xn) {
                xnVar2 = (org.telegram.ui.xn) p2Var;
            }
            xnVar = xnVar2;
            if (!miVar.W1.h0()) {
            }
            if (hashMap.size() > 0) {
                obj2 = hashMap.get(arrayList.get(0));
                if (obj2 instanceof MediaController.PhotoEntry) {
                }
                if (obj2 instanceof MediaController.SearchImage) {
                }
            }
            if (miVar.N != null) {
            }
            if (allPhotosArray.get(i11) instanceof MediaController.PhotoEntry) {
            }
            obj = allPhotosArray.get(i11);
            if (obj instanceof MediaController.PhotoEntry) {
            }
            if (z10) {
            }
            AndroidUtilities.runOnUIThread(new nj(chatAttachAlertPhotoLayout, i13, R, allPhotosArray, i11, xnVar), z10 ? 250L : 0L);
        }
    }

    public static org.telegram.ui.Cells.t5 K(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        ql qlVar = chatAttachAlertPhotoLayout.B;
        int childCount = qlVar.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = qlVar.getChildAt(i11);
            if (childAt.getTop() < qlVar.getMeasuredHeight() - chatAttachAlertPhotoLayout.b.l1() && (childAt instanceof org.telegram.ui.Cells.t5)) {
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                if (t5Var.getImageView().getTag() != null && ((Integer) t5Var.getImageView().getTag()).intValue() == i10) {
                    return t5Var;
                }
            }
        }
        return null;
    }

    public static int N(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        mi miVar = chatAttachAlertPhotoLayout.b;
        org.telegram.ui.ActionBar.p2 p2Var = miVar.c0;
        return ((p2Var instanceof org.telegram.ui.xn) && ((org.telegram.ui.xn) p2Var).O3 == 5) ? p2Var.getMessagesController().config.quickReplyMessagesLimit.get() - ((org.telegram.ui.xn) miVar.c0).r6.size() : ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    public static void O(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        mi miVar = chatAttachAlertPhotoLayout.b;
        try {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 33) {
                miVar.c0.getParentActivity().requestPermissions(new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES"}, 4);
            } else if (i10 >= 23) {
                miVar.c0.getParentActivity().requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
            }
        } catch (Exception unused) {
        }
    }

    public static void P(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        mi miVar = chatAttachAlertPhotoLayout.b;
        if (Build.VERSION.SDK_INT < 23 || f0.e.b(miVar.c0.getParentActivity(), "android.permission.CAMERA") == 0) {
            chatAttachAlertPhotoLayout.i0();
        } else {
            try {
                miVar.c0.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 18);
            } catch (Exception unused) {
            }
        }
    }

    public static boolean S() {
        HashMap hashMap = p1;
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
            ArrayList arrayList = q1;
            if (i10 >= arrayList.size()) {
                break;
            }
            Object obj = p1.get(arrayList.get(i10));
            if (!TextUtils.isEmpty(obj instanceof MediaController.PhotoEntry ? ((MediaController.PhotoEntry) obj).caption : obj instanceof MediaController.SearchImage ? ((MediaController.SearchImage) obj).caption : null)) {
                i11++;
            }
            i10++;
        }
        return i11 <= 1;
    }

    public static boolean c0() {
        HashMap hashMap = p1;
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
        return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.dp(7.0f) + this.m1;
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

    @Override // org.telegram.ui.Components.ei
    public final void A() {
        mi miVar = this.b;
        if (!miVar.isShowing() || miVar.isDismissed() || PhotoViewer.t1().Q1()) {
            return;
        }
        U(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b3, code lost:
    
        if (((org.telegram.ui.xn) r2).w() == false) goto L47;
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
    @Override // org.telegram.ui.Components.ei
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i10) {
        boolean z4;
        boolean z10;
        boolean z11;
        long j10;
        boolean z12;
        boolean z13;
        org.telegram.ui.ActionBar.p2 p2Var;
        TLRPC.ChatFull chatFull;
        boolean z14;
        long j11 = 0;
        mi miVar = this.b;
        if (i10 > 1) {
            MessageObject messageObject = miVar.E1;
            org.telegram.ui.ActionBar.w0 w0Var = miVar.X0;
            if (messageObject == null) {
                if (getStarsPrice() <= 0) {
                    w0Var.K(0);
                    z4 = true;
                } else {
                    w0Var.r(0);
                    z4 = false;
                }
                if (!this.w0 || getStarsPrice() > 0) {
                    w0Var.r(1);
                    z10 = false;
                    if (i10 != 0) {
                        miVar.X0.r(4);
                    }
                    org.telegram.ui.ActionBar.g1 g1Var = this.W0;
                    if (i10 <= 1) {
                        miVar.X0.K(5);
                        miVar.X0.K(7);
                        g1Var.setText(LocaleController.getString(R.string.SendAsFiles));
                    } else {
                        miVar.X0.r(5);
                        miVar.X0.r(7);
                        if (i10 != 0) {
                            g1Var.setText(LocaleController.getString(R.string.SendAsFile));
                        }
                    }
                    if (i10 > 0 && getStarsPrice() <= 0) {
                        if (miVar != null) {
                            org.telegram.ui.ActionBar.p2 p2Var2 = miVar.c0;
                            if (p2Var2 instanceof org.telegram.ui.xn) {
                            }
                        }
                        z11 = true;
                        if (i10 > 0 || miVar == null) {
                            j10 = 0;
                        } else {
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = miVar.g0;
                            if (chatAttachAlertPhotoLayout != null) {
                                HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
                                ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                                if (!selectedPhotos.isEmpty()) {
                                    int i11 = 0;
                                    z14 = false;
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
                                                if (miVar.m1() != null && TextUtils.isEmpty(charSequence2) && i13 == 0) {
                                                    charSequence2 = miVar.m1().getText().toString();
                                                }
                                                if (TextUtils.isEmpty(charSequence2)) {
                                                    continue;
                                                } else if (z14) {
                                                    break loop0;
                                                } else {
                                                    z14 = true;
                                                }
                                            }
                                        }
                                        i11++;
                                        j11 = j10;
                                    }
                                    z14 = false;
                                    if (z14 && (miVar.c0 instanceof org.telegram.ui.xn)) {
                                        z12 = true;
                                        if (i10 > 0 && miVar != null) {
                                            p2Var = miVar.c0;
                                            if ((p2Var instanceof org.telegram.ui.xn) && ChatObject.isChannelAndNotMegaGroup(((org.telegram.ui.xn) p2Var).e) && (chatFull = ((org.telegram.ui.xn) p2Var).W7) != null && chatFull.paid_media_allowed) {
                                                z13 = true;
                                                if (z11) {
                                                    String string = LocaleController.getString(R.string.EnablePhotoSpoiler);
                                                    org.telegram.ui.ActionBar.g1 g1Var2 = this.V0;
                                                    g1Var2.setText(string);
                                                    g1Var2.setAnimatedIcon(R.raw.photo_spoiler);
                                                    miVar.X0.r(3);
                                                } else if (miVar != null) {
                                                    miVar.X0.K(3);
                                                }
                                                if (miVar != null) {
                                                    org.telegram.ui.ActionBar.w0 w0Var2 = miVar.X0;
                                                    if (getSelectedPhotosCount() == i10) {
                                                        int selectedPhotosHighQualityCount = getSelectedPhotosHighQualityCount();
                                                        org.telegram.ui.ActionBar.g1 g1Var3 = this.X0;
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
                                                xb0 xb0Var = this.a1;
                                                if (z12) {
                                                    xb0Var.setVisibility(8);
                                                } else {
                                                    xb0Var.setVisibility(0);
                                                }
                                                if ((!z11 || z12) && (z10 || z4)) {
                                                    miVar.X0.K(6);
                                                } else {
                                                    miVar.X0.r(6);
                                                }
                                                if (z13) {
                                                    miVar.X0.r(9);
                                                    return;
                                                }
                                                org.telegram.ui.ActionBar.g1 g1Var4 = this.Y0;
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
                                                this.B.M(new org.telegram.ui.gr(1));
                                                miVar.X0.K(9);
                                                return;
                                            }
                                        }
                                        z13 = false;
                                        if (z11) {
                                        }
                                        if (miVar != null) {
                                        }
                                        xb0 xb0Var2 = this.a1;
                                        if (z12) {
                                        }
                                        if (z11) {
                                        }
                                        miVar.X0.K(6);
                                        if (z13) {
                                        }
                                    }
                                }
                            }
                            j10 = 0;
                            z14 = false;
                            if (z14) {
                                z12 = true;
                                if (i10 > 0) {
                                    p2Var = miVar.c0;
                                    if (p2Var instanceof org.telegram.ui.xn) {
                                        z13 = true;
                                        if (z11) {
                                        }
                                        if (miVar != null) {
                                        }
                                        xb0 xb0Var22 = this.a1;
                                        if (z12) {
                                        }
                                        if (z11) {
                                        }
                                        miVar.X0.K(6);
                                        if (z13) {
                                        }
                                    }
                                }
                                z13 = false;
                                if (z11) {
                                }
                                if (miVar != null) {
                                }
                                xb0 xb0Var222 = this.a1;
                                if (z12) {
                                }
                                if (z11) {
                                }
                                miVar.X0.K(6);
                                if (z13) {
                                }
                            }
                        }
                        z12 = false;
                        if (i10 > 0) {
                        }
                        z13 = false;
                        if (z11) {
                        }
                        if (miVar != null) {
                        }
                        xb0 xb0Var2222 = this.a1;
                        if (z12) {
                        }
                        if (z11) {
                        }
                        miVar.X0.K(6);
                        if (z13) {
                        }
                    }
                    z11 = false;
                    if (i10 > 0) {
                    }
                    j10 = 0;
                    z12 = false;
                    if (i10 > 0) {
                    }
                    z13 = false;
                    if (z11) {
                    }
                    if (miVar != null) {
                    }
                    xb0 xb0Var22222 = this.a1;
                    if (z12) {
                    }
                    if (z11) {
                    }
                    miVar.X0.K(6);
                    if (z13) {
                    }
                } else {
                    w0Var.K(1);
                    z10 = true;
                    if (i10 != 0) {
                    }
                    org.telegram.ui.ActionBar.g1 g1Var5 = this.W0;
                    if (i10 <= 1) {
                    }
                    if (i10 > 0) {
                        if (miVar != null) {
                        }
                        z11 = true;
                        if (i10 > 0) {
                        }
                        j10 = 0;
                        z12 = false;
                        if (i10 > 0) {
                        }
                        z13 = false;
                        if (z11) {
                        }
                        if (miVar != null) {
                        }
                        xb0 xb0Var222222 = this.a1;
                        if (z12) {
                        }
                        if (z11) {
                        }
                        miVar.X0.K(6);
                        if (z13) {
                        }
                    }
                    z11 = false;
                    if (i10 > 0) {
                    }
                    j10 = 0;
                    z12 = false;
                    if (i10 > 0) {
                    }
                    z13 = false;
                    if (z11) {
                    }
                    if (miVar != null) {
                    }
                    xb0 xb0Var2222222 = this.a1;
                    if (z12) {
                    }
                    if (z11) {
                    }
                    miVar.X0.K(6);
                    if (z13) {
                    }
                }
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var3 = miVar.X0;
        org.telegram.ui.ActionBar.w0 w0Var4 = miVar.X0;
        w0Var3.r(0);
        if (i10 == 0) {
            w0Var4.K(4);
            w0Var4.r(1);
        } else if (this.w0 && getStarsPrice() <= 0 && miVar.E1 == null) {
            w0Var4.K(1);
            z4 = false;
            z10 = true;
            if (i10 != 0) {
            }
            org.telegram.ui.ActionBar.g1 g1Var52 = this.W0;
            if (i10 <= 1) {
            }
            if (i10 > 0) {
            }
            z11 = false;
            if (i10 > 0) {
            }
            j10 = 0;
            z12 = false;
            if (i10 > 0) {
            }
            z13 = false;
            if (z11) {
            }
            if (miVar != null) {
            }
            xb0 xb0Var22222222 = this.a1;
            if (z12) {
            }
            if (z11) {
            }
            miVar.X0.K(6);
            if (z13) {
            }
        } else {
            w0Var4.r(1);
        }
        z4 = false;
        z10 = false;
        if (i10 != 0) {
        }
        org.telegram.ui.ActionBar.g1 g1Var522 = this.W0;
        if (i10 <= 1) {
        }
        if (i10 > 0) {
        }
        z11 = false;
        if (i10 > 0) {
        }
        j10 = 0;
        z12 = false;
        if (i10 > 0) {
        }
        z13 = false;
        if (z11) {
        }
        if (miVar != null) {
        }
        xb0 xb0Var222222222 = this.a1;
        if (z12) {
        }
        if (z11) {
        }
        miVar.X0.K(6);
        if (z13) {
        }
    }

    @Override // org.telegram.ui.Components.ei
    public final boolean C(int i10) {
        if (!this.V) {
            return false;
        }
        if (i10 != 24 && i10 != 25 && i10 != 79 && i10 != 85) {
            return false;
        }
        ((ol) this.h0.getDelegate()).b();
        return true;
    }

    @Override // org.telegram.ui.Components.ei
    public final void D(ei eiVar) {
        ViewPropertyAnimator viewPropertyAnimator = this.l1;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.w.setVisibility(0);
        boolean z4 = eiVar instanceof qm;
        TextView textView = this.x;
        if (z4) {
            ViewPropertyAnimator interpolator = textView.animate().alpha(1.0f).setDuration(150L).setInterpolator(pr.j);
            this.l1 = interpolator;
            interpolator.start();
        } else {
            Z();
            textView.setAlpha(1.0f);
        }
        this.b.U0.setTitle("");
        this.C.h1(0, 0);
        if (z4) {
            this.B.post(new org.telegram.ui.mp(28, this, eiVar));
        }
        V();
        m0();
    }

    @Override // org.telegram.ui.Components.ei
    public final void E() {
        this.K = false;
        bm bmVar = this.M;
        if (bmVar != null) {
            bmVar.setVisibility(0);
        }
        if (this.r0) {
            this.r0 = false;
            U(true);
        }
    }

    @Override // org.telegram.ui.Components.ei
    public final void F() {
        this.B.x0(0);
    }

    public final int Q(MediaController.PhotoEntry photoEntry, int i10) {
        Integer valueOf = Integer.valueOf(photoEntry.imageId);
        HashMap hashMap = p1;
        boolean containsKey = hashMap.containsKey(valueOf);
        ArrayList arrayList = q1;
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
                this.e1.W(i10);
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
        bm bmVar = this.M;
        if (bmVar != null) {
            if (!this.V) {
                bmVar.setTranslationX(this.R[0]);
            }
            int i10 = this.H0;
            int dp = AndroidUtilities.dp(2.0f) + (i10 * 2);
            if (this.V) {
                return;
            }
            this.M.setClipTop((int) this.T);
            this.M.setClipBottom((int) this.U);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.M.getLayoutParams();
            if (layoutParams.height == dp && layoutParams.width == i10) {
                return;
            }
            layoutParams.width = i10;
            layoutParams.height = dp;
            this.M.setLayoutParams(layoutParams);
            AndroidUtilities.runOnUIThread(new org.telegram.ui.mp(29, this, layoutParams));
        }
    }

    public final void U(boolean z4) {
        fm fmVar;
        mi miVar = this.b;
        boolean z10 = miVar.S;
        org.telegram.ui.ActionBar.p2 p2Var = miVar.c0;
        if (z10 || !this.n) {
            return;
        }
        boolean z11 = this.K0;
        boolean z12 = this.L0;
        org.telegram.ui.ActionBar.p2 R = p2Var == null ? LaunchActivity.R() : p2Var;
        if (R == null || R.getParentActivity() == null) {
            return;
        }
        if (!SharedConfig.inappCamera) {
            this.K0 = false;
        } else if (Build.VERSION.SDK_INT >= 23) {
            boolean z13 = R.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0;
            this.L0 = z13;
            if (z13) {
                if (z4) {
                    try {
                        p2Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE"}, 17);
                    } catch (Exception unused) {
                    }
                }
                this.K0 = false;
            } else {
                if (z4 || SharedConfig.hasCameraCache) {
                    CameraController.getInstance().initCamera(null);
                }
                this.K0 = CameraController.getInstance().isCameraInitied();
            }
        } else {
            if (z4 || SharedConfig.hasCameraCache) {
                CameraController.getInstance().initCamera(null);
            }
            this.K0 = CameraController.getInstance().isCameraInitied();
        }
        if ((z11 != this.K0 || z12 != this.L0) && (fmVar = this.D) != null) {
            fmVar.l();
        }
        if (miVar.S || !miVar.isShowing() || !this.K0 || miVar.getBackDrawable().getAlpha() == 0 || this.V) {
            return;
        }
        s0();
    }

    public final void V() {
        f2.m1 K;
        float[] fArr;
        zl zlVar;
        if (PhotoViewer.C1() && PhotoViewer.t1().m5 != null && PhotoViewer.t1().m5.S) {
            return;
        }
        bm bmVar = this.M;
        if (bmVar != null) {
            bmVar.invalidateOutline();
        }
        int i10 = this.J0 - 1;
        ql qlVar = this.B;
        f2.m1 K2 = qlVar.K(i10);
        if (K2 != null) {
            K2.a.invalidateOutline();
        }
        if ((!this.D.d || !this.K0 || this.Q0 != this.R0) && (K = qlVar.K(0)) != null) {
            K.a.invalidateOutline();
        }
        bm bmVar2 = this.M;
        if (bmVar2 != null) {
            bmVar2.invalidate();
        }
        if (Build.VERSION.SDK_INT >= 23 && (zlVar = this.O) != null) {
            ((ViewGroup.MarginLayoutParams) zlVar.getLayoutParams()).topMargin = getRootWindowInsets() == null ? AndroidUtilities.dp(16.0f) : getRootWindowInsets().getSystemWindowInsetTop() + AndroidUtilities.dp(2.0f);
        }
        if (this.K0) {
            int childCount = qlVar.getChildCount();
            int i11 = 0;
            while (true) {
                fArr = this.R;
                if (i11 >= childCount) {
                    break;
                }
                View childAt = qlVar.getChildAt(i11);
                if (!(childAt instanceof org.telegram.ui.Cells.m5)) {
                    i11++;
                } else if (childAt.isAttachedToWindow()) {
                    float y10 = getY() + qlVar.getY() + childAt.getY();
                    mi miVar = this.b;
                    ViewGroup sheetContainer = miVar.getSheetContainer();
                    nh nhVar = miVar.v1;
                    ag.l lVar = miVar.L0;
                    float y11 = sheetContainer.getY() + y10;
                    float x10 = miVar.getSheetContainer().getX() + getX() + qlVar.getX() + childAt.getX();
                    if (Build.VERSION.SDK_INT >= 23) {
                        x10 -= getRootWindowInsets().getSystemWindowInsetLeft();
                    }
                    float alpha = (lVar.getAlpha() * lVar.getMeasuredHeight()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (!miVar.d0 ? AndroidUtilities.statusBarHeight : 0);
                    zh zhVar = miVar.y2;
                    if (zhVar != null && zhVar.g()) {
                        alpha = Math.max(alpha, (miVar.y2.e() + miVar.y2.getY()) - miVar.i2);
                    }
                    float f10 = y10 < alpha ? alpha - y10 : 0.0f;
                    if (f10 != this.T) {
                        this.T = f10;
                        bm bmVar3 = this.M;
                        if (bmVar3 != null) {
                            bmVar3.invalidateOutline();
                            this.M.invalidate();
                        }
                    }
                    float translationY = (int) (nhVar.getTranslationY() + (miVar.getSheetContainer().getMeasuredHeight() - nhVar.getMeasuredHeight()));
                    zh zhVar2 = miVar.y2;
                    if (zhVar2 != null) {
                        translationY -= zhVar2.d() - AndroidUtilities.dp(6.0f);
                    }
                    if (childAt.getMeasuredHeight() + y10 > translationY) {
                        this.U = Math.min(-AndroidUtilities.dp(5.0f), y10 - translationY) + childAt.getMeasuredHeight();
                    } else {
                        this.U = 0.0f;
                    }
                    fArr[0] = x10;
                    fArr[1] = y11;
                    R();
                    return;
                }
            }
            if (this.T != 0.0f) {
                this.T = 0.0f;
                bm bmVar4 = this.M;
                if (bmVar4 != null) {
                    bmVar4.invalidateOutline();
                    this.M.invalidate();
                }
            }
            fArr[0] = AndroidUtilities.dp(-400.0f);
            fArr[1] = 0.0f;
            R();
        }
    }

    public final boolean W(boolean z4) {
        if (getStarsPrice() <= 0) {
            return false;
        }
        boolean z10 = false;
        while (true) {
            HashMap hashMap = p1;
            if (hashMap.size() <= 10 - (z4 ? 1 : 0)) {
                break;
            }
            ArrayList arrayList = q1;
            if (arrayList.isEmpty()) {
                break;
            }
            Object obj = hashMap.get(arrayList.get(0));
            if (!(obj instanceof MediaController.PhotoEntry)) {
                break;
            }
            Q((MediaController.PhotoEntry) obj, -1);
            z10 = true;
        }
        return z10;
    }

    public final boolean X(MediaController.PhotoEntry photoEntry) {
        boolean z4 = this.t0;
        org.telegram.ui.ActionBar.g6 g6Var = this.a;
        mi miVar = this.b;
        if (z4 || !photoEntry.isVideo) {
            if (this.u0 || photoEntry.isVideo) {
                return false;
            }
            if (!miVar.a1()) {
                org.telegram.messenger.y3.s(R.string.GlobalAttachPhotoRestricted, new qc(miVar.o1, g6Var), null);
                return true;
            }
        } else if (!miVar.a1()) {
            org.telegram.messenger.y3.s(R.string.GlobalAttachVideoRestricted, new qc(miVar.o1, g6Var), null);
            return true;
        }
        return true;
    }

    public final void Y() {
        if (!this.M0 || Build.VERSION.SDK_INT < 23) {
            return;
        }
        boolean e02 = e0();
        this.M0 = e02;
        if (!e02) {
            f0();
        }
        this.D.l();
        this.v.l();
    }

    public final void Z() {
        String string = LocaleController.getString(R.string.EnablePhotoSpoiler);
        org.telegram.ui.ActionBar.g1 g1Var = this.V0;
        g1Var.setText(string);
        g1Var.setAnimatedIcon(R.raw.photo_spoiler);
        this.b.X0.K(1);
        HashMap hashMap = p1;
        if (!hashMap.isEmpty()) {
            Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                ((MediaController.PhotoEntry) ((Map.Entry) it.next()).getValue()).reset();
            }
            hashMap.clear();
            q1.clear();
        }
        ArrayList arrayList = o1;
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
        this.D.l();
        this.v.l();
    }

    @Override // org.telegram.ui.Components.ei
    public final void a(CharSequence charSequence) {
        Object obj;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = q1;
            if (i10 >= arrayList.size()) {
                return;
            }
            if (i10 == 0) {
                Object obj2 = arrayList.get(i10);
                HashMap hashMap = p1;
                Object obj3 = hashMap.get(obj2);
                if (obj3 instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry clone = ((MediaController.PhotoEntry) obj3).clone();
                    CharSequence[] charSequenceArr = {charSequence};
                    clone.entities = MediaDataController.getInstance(UserConfig.selectedAccount).getEntities(charSequenceArr, false);
                    clone.caption = charSequenceArr[0];
                    obj = clone;
                } else {
                    boolean z4 = obj3 instanceof MediaController.SearchImage;
                    obj = obj3;
                    if (z4) {
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

    public final void a0(boolean z4) {
        bm bmVar;
        if (this.p0 || this.M == null) {
            return;
        }
        int i10 = this.H0;
        int[] iArr = this.c0;
        iArr[1] = i10;
        int i11 = 2;
        iArr[2] = AndroidUtilities.dp(2.0f) + (i10 * 2);
        Runnable runnable = this.k0;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.k0 = null;
        }
        boolean z10 = ((double) AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.a7, this.a))) > 0.721d;
        mi miVar = this.b;
        AndroidUtilities.setLightNavigationBar(miVar, z10);
        TextView textView = this.m0;
        ql qlVar = this.r;
        eg.s2 s2Var = this.g0;
        ql qlVar2 = this.B;
        ImageView[] imageViewArr = this.P;
        i91 i91Var = this.i0;
        if (z4) {
            this.g1 = this.M.getTranslationY();
            this.a0 = true;
            if (qlVar2 != null) {
                qlVar2.invalidate();
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this, "cameraOpenProgress", 0.0f));
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(s2Var, (Property<eg.s2, Float>) property, 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(i91Var, (Property<i91, Float>) property, 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(qlVar, (Property<ql, Float>) property, 0.0f));
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
            this.c1.lock();
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(220L);
            animatorSet.setInterpolator(pr.f);
            animatorSet.addListener(new sl(this, i11));
            animatorSet.start();
        } else {
            this.f1 = false;
            miVar.getWindow().clearFlags(128);
            setCameraOpenProgress(0.0f);
            iArr[0] = 0;
            setCameraOpenProgress(0.0f);
            s2Var.setAlpha(0.0f);
            s2Var.setVisibility(8);
            i91Var.setAlpha(0.0f);
            i91Var.setTag(null);
            i91Var.setVisibility(8);
            qlVar.setAlpha(0.0f);
            textView.setAlpha(0.0f);
            qlVar.setVisibility(8);
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
            this.V = false;
            bm bmVar2 = this.M;
            if (bmVar2 != null) {
                bmVar2.setFpsLimit(30);
                this.M.setSystemUiVisibility(1024);
            }
            if (qlVar2 != null) {
                qlVar2.invalidate();
            }
        }
        bm bmVar3 = this.M;
        if (bmVar3 != null) {
            bmVar3.setImportantForAccessibility(0);
        }
        qlVar2.setImportantForAccessibility(0);
        if (LiteMode.isEnabled(LiteMode.FLAGS_CHAT) || (bmVar = this.M) == null) {
            return;
        }
        bmVar.showTexture(false, z4);
    }

    @Override // org.telegram.ui.Components.ei
    public final boolean b() {
        return !this.V;
    }

    public final MediaController.PhotoEntry b0(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = o1;
        int size = arrayList.size();
        if (i10 < size) {
            return (MediaController.PhotoEntry) arrayList.get(i10);
        }
        int i11 = i10 - size;
        MediaController.AlbumEntry albumEntry = this.Q0;
        if (albumEntry == null || i11 >= albumEntry.photos.size()) {
            return null;
        }
        return this.Q0.photos.get(i11);
    }

    @Override // org.telegram.ui.Components.ei
    public final boolean c() {
        Iterator it = p1.entrySet().iterator();
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

    @Override // org.telegram.ui.Components.ei
    public final void d() {
        boolean z4 = this.b1;
        int i10 = z4 ? org.telegram.ui.ActionBar.k6.hg : org.telegram.ui.ActionBar.k6.j5;
        int i11 = org.telegram.ui.ActionBar.k6.c7;
        org.telegram.ui.ActionBar.g6 g6Var = this.a;
        this.E.setTextColor(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
        int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.A5, g6Var);
        ql qlVar = this.B;
        qlVar.setGlowColor(v02);
        qlVar.K(0);
        this.x.setTextColor(org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
        int v03 = org.telegram.ui.ActionBar.k6.v0(z4 ? org.telegram.ui.ActionBar.k6.hg : org.telegram.ui.ActionBar.k6.E8, g6Var);
        wl wlVar = this.w;
        wlVar.G(v03, false);
        wlVar.G(org.telegram.ui.ActionBar.k6.v0(z4 ? org.telegram.ui.ActionBar.k6.hg : org.telegram.ui.ActionBar.k6.E8, g6Var), true);
        wlVar.B(org.telegram.ui.ActionBar.k6.v0(z4 ? org.telegram.ui.ActionBar.k6.jg : org.telegram.ui.ActionBar.k6.G8, g6Var));
        org.telegram.ui.ActionBar.k6.w1(org.telegram.ui.ActionBar.k6.v0(i10, g6Var), this.y);
    }

    public final void d0(boolean z4) {
        if (!this.K0 || this.M == null) {
            return;
        }
        n0();
        this.N.f();
        this.M.destroy(z4, null);
        AnimatorSet animatorSet = this.L;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.L = null;
        }
        AndroidUtilities.runOnUIThread(new hl(this, 0), 300L);
        this.W = false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        mi miVar;
        if (i10 != NotificationCenter.albumsDidLoad) {
            if (i10 == NotificationCenter.cameraInitied) {
                U(false);
                return;
            }
            return;
        }
        fm fmVar = this.D;
        if (fmVar != null) {
            if (q0()) {
                this.R0 = MediaController.allMediaAlbumEntry;
            } else {
                this.R0 = MediaController.allPhotosAlbumEntry;
            }
            if (this.Q0 == null || ((miVar = this.b) != null && miVar.D)) {
                this.Q0 = this.R0;
            } else if (q0()) {
                int i12 = 0;
                while (true) {
                    if (i12 >= MediaController.allMediaAlbums.size()) {
                        break;
                    }
                    MediaController.AlbumEntry albumEntry = MediaController.allMediaAlbums.get(i12);
                    int i13 = albumEntry.bucketId;
                    MediaController.AlbumEntry albumEntry2 = this.Q0;
                    if (i13 == albumEntry2.bucketId && albumEntry.videoOnly == albumEntry2.videoOnly) {
                        this.Q0 = albumEntry;
                        break;
                    }
                    i12++;
                }
            }
            this.U0 = false;
            this.E.c();
            fmVar.l();
            this.v.l();
            ArrayList arrayList = q1;
            if (!arrayList.isEmpty() && this.R0 != null) {
                int size = arrayList.size();
                for (int i14 = 0; i14 < size; i14++) {
                    Integer num = (Integer) arrayList.get(i14);
                    HashMap hashMap = p1;
                    Object obj = hashMap.get(num);
                    MediaController.PhotoEntry photoEntry = this.R0.photosByIds.get(num.intValue());
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
            findActivity = this.b.c0.getParentActivity();
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 23) {
            return false;
        }
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
    
        if (e2.c.t(r0) != false) goto L39;
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
        mi miVar = this.b;
        boolean z4 = miVar.S;
        org.telegram.ui.ActionBar.p2 p2Var = miVar.c0;
        if (z4) {
            return;
        }
        n1 = true;
        MediaMetadataRetriever mediaMetadataRetriever2 = null;
        if (i10 == 0) {
            PhotoViewer.t1().K2(p2Var.getParentActivity(), null, this.a);
            PhotoViewer t12 = PhotoViewer.t1();
            int i13 = miVar.P1;
            boolean z10 = miVar.Q1;
            t12.h = i13;
            t12.n = z10;
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
                    int i15 = r1;
                    r1 = i15 - 1;
                    MediaController.PhotoEntry orientation = new MediaController.PhotoEntry(0, i15, 0L, str3, ((Integer) imageOrientation.first).intValue(), false, i14, i12, 0L).setOrientation(imageOrientation);
                    orientation.canDeleteAfter = true;
                    j0(orientation, false, true);
                    return;
                }
            } catch (Exception unused2) {
                i11 = 0;
            }
            int i142 = i11;
            int i152 = r1;
            r1 = i152 - 1;
            MediaController.PhotoEntry orientation2 = new MediaController.PhotoEntry(0, i152, 0L, str3, ((Integer) imageOrientation.first).intValue(), false, i142, i12, 0L).setOrientation(imageOrientation);
            orientation2.canDeleteAfter = true;
            j0(orientation2, false, true);
            return;
        }
        if (i10 == 2) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("pic path " + str3);
            }
            Intent intent2 = (intent == null || str3 == null || !e2.c.t(str3)) ? intent : null;
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
                if (!(p2Var instanceof org.telegram.ui.xn) || !((org.telegram.ui.xn) p2Var).w()) {
                    AndroidUtilities.addMediaToGallery(str3);
                }
                str3 = null;
            } else {
                str2 = null;
            }
            if (str2 != null || str3 == null || !e2.c.t(str3)) {
                str3 = str2;
            }
            try {
                try {
                    try {
                        mediaMetadataRetriever = new MediaMetadataRetriever();
                    } catch (Exception e6) {
                        FileLog.e(e6);
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
                int i16 = r1;
                r1 = i16 - 1;
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
            int i162 = r1;
            r1 = i162 - 1;
            MediaController.PhotoEntry photoEntry2 = new MediaController.PhotoEntry(0, i162, 0L, str3, 0, true, createVideoThumbnail2.getWidth(), createVideoThumbnail2.getHeight(), 0L);
            photoEntry2.duration = (int) r4;
            photoEntry2.thumbPath = file2.getAbsolutePath();
            j0(photoEntry2, false, true);
        }
    }

    public ArrayList<Object> getAllPhotosArray() {
        MediaController.AlbumEntry albumEntry = this.Q0;
        ArrayList<Object> arrayList = o1;
        if (albumEntry == null) {
            return !arrayList.isEmpty() ? arrayList : new ArrayList<>(0);
        }
        if (arrayList.isEmpty()) {
            return this.Q0.photos;
        }
        ArrayList<Object> arrayList2 = new ArrayList<>(arrayList.size() + this.Q0.photos.size());
        arrayList2.addAll(arrayList);
        arrayList2.addAll(this.Q0.photos);
        return arrayList2;
    }

    @Override // org.telegram.ui.Components.ei
    public int getButtonsHideOffset() {
        return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + super.getButtonsHideOffset();
    }

    public float getCameraOpenProgress() {
        return this.b0;
    }

    @Override // org.telegram.ui.Components.ei
    public int getCurrentItemTop() {
        ql qlVar = this.B;
        int childCount = qlVar.getChildCount();
        oz ozVar = this.E;
        if (childCount <= 0) {
            qlVar.setTopGlowOffset(qlVar.getPaddingTop());
            ozVar.setTranslationY(0.0f);
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = qlVar.getChildAt(0);
        fl0 fl0Var = (fl0) qlVar.G(childAt);
        int top = childAt.getTop() - this.m1;
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || fl0Var == null || fl0Var.b() != 0) {
            top = dp;
        }
        ozVar.setTranslationY(((((getMeasuredHeight() - top) - AndroidUtilities.dp(50.0f)) - ozVar.getMeasuredHeight()) / 2.0f) + top);
        qlVar.setTopGlowOffset(top);
        return top;
    }

    @Override // org.telegram.ui.Components.ei
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.ei
    public int getListTopPadding() {
        return this.B.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.ei
    public int getSelectedItemsCount() {
        return q1.size();
    }

    public HashMap<Object, Object> getSelectedPhotos() {
        return p1;
    }

    public int getSelectedPhotosCount() {
        int i10 = 0;
        for (Object obj : p1.values()) {
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
        for (Object obj : p1.values()) {
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
        return q1;
    }

    public long getStarsPrice() {
        Iterator it = p1.entrySet().iterator();
        if (it.hasNext()) {
            return ((MediaController.PhotoEntry) ((Map.Entry) it.next()).getValue()).starsAmount;
        }
        return 0L;
    }

    @Override // org.telegram.ui.Components.ei
    public final int h() {
        return 1;
    }

    public final void h0(boolean z4) {
        bm bmVar;
        if (this.M == null || this.L != null) {
            return;
        }
        mi miVar = this.b;
        if (miVar.isDismissed()) {
            return;
        }
        this.M.initTexture();
        boolean q02 = q0();
        TextView textView = this.n0;
        int i10 = 0;
        if (q02) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        boolean isEmpty = o1.isEmpty();
        ql qlVar = this.r;
        TextView textView2 = this.m0;
        if (isEmpty) {
            textView2.setVisibility(4);
            qlVar.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            qlVar.setVisibility(0);
        }
        if (miVar.m1().v && isFocusable()) {
            miVar.m1().d();
        }
        i91 i91Var = this.i0;
        i91Var.setVisibility(0);
        i91Var.setAlpha(0.0f);
        eg.s2 s2Var = this.g0;
        s2Var.setVisibility(0);
        s2Var.setTag(null);
        int[] iArr = this.c0;
        iArr[0] = 0;
        int i11 = this.H0;
        int i12 = 1;
        iArr[1] = i11;
        iArr[2] = AndroidUtilities.dp(2.0f) + (i11 * 2);
        this.g1 = 0.0f;
        this.f1 = true;
        bm bmVar2 = this.M;
        if (bmVar2 != null) {
            bmVar2.setFpsLimit(-1);
        }
        AndroidUtilities.hideKeyboard(this);
        AndroidUtilities.setLightNavigationBar((Dialog) miVar, false);
        miVar.getWindow().addFlags(128);
        ql qlVar2 = this.B;
        ImageView[] imageViewArr = this.P;
        if (z4) {
            setCameraOpenProgress(0.0f);
            this.a0 = true;
            if (qlVar2 != null) {
                qlVar2.invalidate();
            }
            this.c1.lock();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this, "cameraOpenProgress", 0.0f, 1.0f));
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(s2Var, (Property<eg.s2, Float>) property, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(qlVar, (Property<ql, Float>) property, 1.0f));
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
            animatorSet.setInterpolator(pr.f);
            animatorSet.addListener(new sl(this, i12));
            animatorSet.start();
        } else {
            setCameraOpenProgress(1.0f);
            s2Var.setAlpha(1.0f);
            textView2.setAlpha(1.0f);
            qlVar.setAlpha(1.0f);
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
            miVar.W1.Q0();
            bm bmVar3 = this.M;
            if (bmVar3 != null) {
                bmVar3.setSystemUiVisibility(1028);
            }
        }
        this.V = true;
        bm bmVar4 = this.M;
        if (bmVar4 != null) {
            bmVar4.setImportantForAccessibility(2);
        }
        qlVar2.setImportantForAccessibility(4);
        qlVar2.invalidate();
        if (LiteMode.isEnabled(LiteMode.FLAGS_CHAT) || (bmVar = this.M) == null || !bmVar.isInited()) {
            return;
        }
        this.M.showTexture(true, z4);
    }

    public final void i0() {
        if (SharedConfig.inappCamera) {
            h0(true);
            return;
        }
        mi miVar = this.b;
        ki kiVar = miVar.W1;
        if (kiVar != null) {
            kiVar.I1(0, false, true, 0, 0, 0L, miVar.s1(), false, 0L);
        }
    }

    @Override // org.telegram.ui.Components.ei
    public final void j() {
        V();
        invalidate();
    }

    public final void j0(MediaController.PhotoEntry photoEntry, boolean z4, boolean z10) {
        int i10;
        org.telegram.ui.xn xnVar;
        int i11;
        org.telegram.ui.xn xnVar2;
        ArrayList<Object> arrayList;
        int i12;
        ArrayList arrayList2 = o1;
        mi miVar = this.b;
        if (photoEntry != null) {
            arrayList2.add(photoEntry);
            p1.put(Integer.valueOf(photoEntry.imageId), photoEntry);
            q1.add(Integer.valueOf(photoEntry.imageId));
            miVar.V1(0);
            this.D.l();
            this.v.l();
        }
        if (photoEntry != null && !z10 && arrayList2.size() > 1) {
            y0(false);
            if (this.M != null) {
                this.i0.b(0.0f, false);
                this.y0 = 0.0f;
                this.M.setZoom(0.0f);
                CameraController.getInstance().startPreview(this.M.getCameraSessionObject());
                return;
            }
            return;
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        this.q0 = true;
        org.telegram.ui.ActionBar.p2 p2Var = miVar.c0;
        org.telegram.ui.ActionBar.p2 p2Var2 = miVar.c0;
        if (p2Var == null) {
            p2Var = LaunchActivity.R();
        }
        if (p2Var == null) {
            return;
        }
        PhotoViewer.t1().K2(p2Var.getParentActivity(), null, this.a);
        PhotoViewer.t1().L2(miVar);
        PhotoViewer t12 = PhotoViewer.t1();
        int i13 = miVar.P1;
        boolean z11 = miVar.Q1;
        t12.h = i13;
        t12.n = z11;
        if (miVar.C && miVar.D) {
            xnVar = (org.telegram.ui.xn) p2Var2;
            i10 = 11;
        } else if (miVar.N0 != 0) {
            xnVar = null;
            i10 = 1;
        } else if (p2Var2 instanceof org.telegram.ui.xn) {
            xnVar = (org.telegram.ui.xn) p2Var2;
            i10 = 2;
        } else {
            i10 = 5;
            xnVar = null;
        }
        boolean z12 = miVar.E;
        if (z12) {
            xnVar2 = null;
            i11 = 13;
        } else {
            i11 = i10;
            xnVar2 = xnVar;
        }
        if (miVar.N0 != 0 || z12) {
            arrayList = new ArrayList<>();
            arrayList.add(photoEntry);
            i12 = 0;
        } else {
            arrayList = getAllPhotosArray();
            i12 = arrayList2.size() - 1;
        }
        ArrayList<Object> arrayList3 = arrayList;
        w40 w40Var = miVar.N;
        if (w40Var != null && photoEntry != null) {
            w40Var.e = photoEntry.isVideo;
        }
        PhotoViewer.t1().f2(arrayList3, i12, i11, false, new rl(this, z4), xnVar2);
        PhotoViewer.t1().x2(miVar.N);
        if (miVar.D) {
            PhotoViewer.t1().Y0(null, null, false, miVar.G);
            PhotoViewer.t1().l2();
        }
    }

    @Override // org.telegram.ui.Components.ei
    public final void k(float f10) {
        this.T0 = f10;
        V();
        bm bmVar = this.M;
        if (bmVar != null) {
            bmVar.invalidateOutline();
            this.M.invalidate();
        }
        invalidate();
    }

    public final void k0() {
        try {
            if (this.M != null) {
                CameraController.getInstance().stopPreview(this.M.getCameraSessionObject());
            }
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override // org.telegram.ui.Components.ei
    public final boolean l(MotionEvent motionEvent) {
        bm bmVar;
        if (!this.a0) {
            if (this.V && motionEvent != null) {
                boolean z4 = this.D0;
                i91 i91Var = this.i0;
                if ((!z4 && motionEvent.getActionMasked() == 0) || motionEvent.getActionMasked() == 5) {
                    Rect rect = this.B0;
                    i91Var.getHitRect(rect);
                    if (i91Var.getTag() == null || !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        if (!this.p0 && !this.F0) {
                            if (motionEvent.getPointerCount() == 2) {
                                this.x0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                this.z0 = true;
                            } else {
                                this.E0 = true;
                                this.C0 = motionEvent.getY();
                                this.z0 = false;
                            }
                            this.A0 = false;
                            this.D0 = true;
                            return true;
                        }
                    }
                } else if (this.D0) {
                    int actionMasked = motionEvent.getActionMasked();
                    ql qlVar = this.r;
                    TextView textView = this.m0;
                    Property property = View.ALPHA;
                    ImageView[] imageViewArr = this.P;
                    eg.s2 s2Var = this.g0;
                    if (actionMasked == 2) {
                        if (this.z0 && motionEvent.getPointerCount() == 2 && !this.F0) {
                            float hypot = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                            if (this.A0) {
                                if (this.M != null) {
                                    float dp = (hypot - this.x0) / AndroidUtilities.dp(100.0f);
                                    this.x0 = hypot;
                                    float f10 = this.y0 + dp;
                                    this.y0 = f10;
                                    if (f10 < 0.0f) {
                                        this.y0 = 0.0f;
                                    } else if (f10 > 1.0f) {
                                        this.y0 = 1.0f;
                                    }
                                    i91Var.b(this.y0, false);
                                    this.b.getSheetContainer().invalidate();
                                    this.M.setZoom(this.y0);
                                    t0(true);
                                    return true;
                                }
                            } else if (Math.abs(hypot - this.x0) >= AndroidUtilities.getPixelsInCM(0.4f, false)) {
                                this.x0 = hypot;
                                this.A0 = true;
                                return true;
                            }
                        } else {
                            float y10 = motionEvent.getY();
                            float f11 = y10 - this.C0;
                            if (this.E0) {
                                if (Math.abs(f11) > AndroidUtilities.getPixelsInCM(0.4f, false)) {
                                    this.E0 = false;
                                    this.F0 = true;
                                    return true;
                                }
                            } else if (this.F0 && (bmVar = this.M) != null) {
                                bmVar.setTranslationY(bmVar.getTranslationY() + f11);
                                this.C0 = y10;
                                i91Var.setTag(null);
                                Runnable runnable = this.k0;
                                if (runnable != null) {
                                    AndroidUtilities.cancelRunOnUIThread(runnable);
                                    this.k0 = null;
                                }
                                if (s2Var.getTag() == null) {
                                    s2Var.setTag(1);
                                    AnimatorSet animatorSet = new AnimatorSet();
                                    animatorSet.playTogether(ObjectAnimator.ofFloat(s2Var, (Property<eg.s2, Float>) property, 0.0f), ObjectAnimator.ofFloat(i91Var, (Property<i91, Float>) property, 0.0f), ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f), ObjectAnimator.ofFloat(imageViewArr[0], (Property<ImageView, Float>) property, 0.0f), ObjectAnimator.ofFloat(imageViewArr[1], (Property<ImageView, Float>) property, 0.0f), ObjectAnimator.ofFloat(qlVar, (Property<ql, Float>) property, 0.0f));
                                    animatorSet.setDuration(220L);
                                    animatorSet.setInterpolator(pr.f);
                                    animatorSet.start();
                                    return true;
                                }
                            }
                        }
                    } else if (motionEvent.getActionMasked() == 3 || motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 6) {
                        this.D0 = false;
                        this.z0 = false;
                        if (this.F0) {
                            this.F0 = false;
                            bm bmVar2 = this.M;
                            if (bmVar2 != null) {
                                if (Math.abs(bmVar2.getTranslationY()) > this.M.getMeasuredHeight() / 6.0f) {
                                    a0(true);
                                    return true;
                                }
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.M, (Property<bm, Float>) View.TRANSLATION_Y, 0.0f), ObjectAnimator.ofFloat(s2Var, (Property<eg.s2, Float>) property, 1.0f), ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 1.0f), ObjectAnimator.ofFloat(imageViewArr[0], (Property<ImageView, Float>) property, 1.0f), ObjectAnimator.ofFloat(imageViewArr[1], (Property<ImageView, Float>) property, 1.0f), ObjectAnimator.ofFloat(qlVar, (Property<ql, Float>) property, 1.0f));
                                animatorSet2.setDuration(250L);
                                animatorSet2.setInterpolator(this.f0);
                                animatorSet2.start();
                                s2Var.setTag(null);
                                return true;
                            }
                        } else {
                            bm bmVar3 = this.M;
                            if (bmVar3 != null && !this.A0) {
                                bmVar3.getLocationOnScreen(this.S);
                                this.M.focusToPoint((int) (motionEvent.getRawX() - r5[0]), (int) (motionEvent.getRawY() - r5[1]));
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
        if (this.b.S) {
            return;
        }
        for (int i10 = 0; i10 < 2; i10++) {
            this.P[i10].animate().alpha(1.0f).translationX(0.0f).setDuration(150L).setInterpolator(pr.f).start();
        }
        ViewPropertyAnimator duration = this.o0.animate().alpha(1.0f).translationX(0.0f).setDuration(150L);
        pr prVar = pr.f;
        duration.setInterpolator(prVar).start();
        this.n0.animate().alpha(1.0f).setDuration(150L).setInterpolator(prVar).start();
        AndroidUtilities.updateViewVisibilityAnimated(this.O, false);
        AndroidUtilities.cancelRunOnUIThread(this.e0);
        this.e0 = null;
        AndroidUtilities.unlockOrientation(AndroidUtilities.findActivity(getContext()));
    }

    @Override // org.telegram.ui.Components.ei
    public final void m() {
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.cameraInitied);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.albumsDidLoad);
    }

    public final void m0() {
        try {
            U(false);
            if (this.M != null) {
                CameraController.getInstance().startPreview(this.M.getCameraSessionObject());
            }
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override // org.telegram.ui.Components.ei
    public final boolean n() {
        if (this.a0) {
            return true;
        }
        if (this.V) {
            a0(true);
            return true;
        }
        d0(true);
        return false;
    }

    public final void n0() {
        if (this.W) {
            try {
                Bitmap bitmap = this.M.getTextureView().getBitmap();
                if (bitmap != null) {
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), this.M.getMatrix(), true);
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

    @Override // org.telegram.ui.Components.ei
    public final void o(int i10) {
        d0((i10 == 0 || i10 == 2) ? false : true);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        if (this.P0 != i14) {
            this.P0 = i14;
            fm fmVar = this.D;
            if (fmVar != null) {
                fmVar.l();
            }
        }
        super.onLayout(z4, i10, i11, i12, i13);
        V();
    }

    public final void p0(int i10, final boolean z4) {
        PhotoViewer t12 = PhotoViewer.t1();
        if (i10 == -1) {
            i10 = t12.M4;
        }
        ArrayList arrayList = t12.d7;
        if (arrayList == null || arrayList.isEmpty() || i10 >= arrayList.size() || !(arrayList.get(i10) instanceof MediaController.PhotoEntry) || !((MediaController.PhotoEntry) arrayList.get(i10)).hasSpoiler) {
            return;
        }
        final MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList.get(i10);
        this.B.M(new q0.a() { // from class: org.telegram.ui.Components.jl
            @Override // q0.a
            public final void accept(Object obj) {
                View view = (View) obj;
                boolean z10 = ChatAttachAlertPhotoLayout.n1;
                if (view instanceof org.telegram.ui.Cells.t5) {
                    org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
                    if (t5Var.getPhotoEntry() == photoEntry) {
                        t5Var.c(z4, Float.valueOf(250.0f));
                        t5Var.f(ChatAttachAlertPhotoLayout.this.getStarsPrice(), ChatAttachAlertPhotoLayout.p1.size() > 1);
                    }
                }
            }
        });
    }

    @Override // org.telegram.ui.Components.ei
    public final void q() {
        bm bmVar = this.M;
        if (bmVar != null) {
            bmVar.setVisibility(8);
        }
        for (Map.Entry entry : p1.entrySet()) {
            if (entry.getValue() instanceof MediaController.PhotoEntry) {
                ((MediaController.PhotoEntry) entry.getValue()).isAttachSpoilerRevealed = false;
            }
        }
        this.D.l();
    }

    public final boolean q0() {
        if (this.v0) {
            return true;
        }
        mi miVar = this.b;
        if (miVar.C) {
            return false;
        }
        return (miVar.c0 instanceof org.telegram.ui.xn) || miVar.Q0 || miVar.N0 == 2;
    }

    @Override // org.telegram.ui.Components.ei
    public final void r() {
        this.K = true;
        ql qlVar = this.B;
        int childCount = qlVar.getChildCount();
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            }
            if (qlVar.getChildAt(i10) instanceof org.telegram.ui.Cells.m5) {
                n0();
                break;
            } else {
                this.N.f();
                i10++;
            }
        }
        ViewPropertyAnimator viewPropertyAnimator = this.l1;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator withEndAction = this.x.animate().alpha(0.0f).setDuration(150L).setInterpolator(pr.j).withEndAction(new hl(this, 1));
        this.l1 = withEndAction;
        withEndAction.start();
        k0();
    }

    public final void r0(y8 y8Var, TLRPC.VideoSize videoSize, long j10) {
        mi miVar = this.b;
        w8 w8Var = new w8(miVar.R, miVar.N);
        w40 w40Var = miVar.N;
        w8Var.N = w40Var == null || w40Var.c != 2;
        miVar.c0.presentFragment(w8Var);
        if (y8Var != null) {
            w8Var.m0(y8Var);
        }
        if (videoSize != null) {
            w8Var.l0(videoSize);
        }
        if (j10 != 0) {
            w8Var.k0(j10);
        }
        w8Var.F = new o1(12, this, w8Var);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.O0) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.ei
    public final void s(float f10) {
        bm bmVar = this.M;
        if (bmVar != null) {
            bmVar.setAlpha(f10);
            if (f10 != 0.0f && this.M.getVisibility() != 0) {
                this.M.setVisibility(0);
            } else {
                if (f10 != 0.0f || this.M.getVisibility() == 4) {
                    return;
                }
                this.M.setVisibility(4);
            }
        }
    }

    public final void s0() {
        mi miVar = this.b;
        if (!miVar.c2 && this.s0 && CameraView.isCameraAllowed()) {
            if (this.M == null) {
                boolean z4 = !LiteMode.isEnabled(LiteMode.FLAGS_CHAT);
                Context context = getContext();
                Boolean bool = this.l0;
                bm bmVar = new bm(this, context, bool != null ? bool.booleanValue() : miVar.R1, z4);
                this.M = bmVar;
                org.telegram.ui.ActionBar.p2 p2Var = miVar.c0;
                bmVar.setRecordFile(AndroidUtilities.generateVideoPath((p2Var instanceof org.telegram.ui.xn) && ((org.telegram.ui.xn) p2Var).w()));
                this.M.setFocusable(true);
                this.M.setFpsLimit(30);
                this.M.setOutlineProvider(new tl(this, 0));
                this.M.setClipToOutline(true);
                this.M.setContentDescription(LocaleController.getString(R.string.AccDescrInstantCamera));
                org.telegram.ui.ActionBar.f3 container = miVar.getContainer();
                bm bmVar2 = this.M;
                int i10 = this.H0;
                container.addView(bmVar2, 1, new FrameLayout.LayoutParams(i10, i10));
                this.M.setDelegate(new ul(this));
                this.M.setAlpha(this.s0 ? 1.0f : 0.2f);
                this.M.setEnabled(this.s0);
                if (this.K) {
                    this.M.setVisibility(8);
                }
                if (!this.V) {
                    V();
                }
                ql qlVar = this.B;
                if (qlVar != null) {
                    qlVar.invalidate();
                }
                invalidate();
            }
            i91 i91Var = this.i0;
            if (i91Var != null) {
                i91Var.b(0.0f, false);
                this.y0 = 0.0f;
            }
            if (this.V) {
                return;
            }
            this.M.setTranslationX(this.R[0]);
        }
    }

    public void setCameraOpenProgress(float f10) {
        int i10;
        int i11;
        if (this.M == null) {
            return;
        }
        this.b0 = f10;
        int[] iArr = this.c0;
        float f11 = iArr[1];
        float f12 = iArr[2];
        int i12 = AndroidUtilities.displaySize.x;
        mi miVar = this.b;
        float width = (miVar.getContainer().getWidth() - miVar.getLeftInset()) - miVar.getRightInset();
        float height = miVar.getContainer().getHeight();
        float[] fArr = this.R;
        float f13 = fArr[0];
        float f14 = fArr[1];
        float f15 = this.g1;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.M.getLayoutParams();
        float textureHeight = this.M.getTextureHeight(f11, f12) / this.M.getTextureHeight(width, height);
        float f16 = f12 / height;
        float f17 = f11 / width;
        if (this.f1) {
            i10 = (int) width;
            i11 = (int) height;
            float f18 = 1.0f - f10;
            float f19 = (textureHeight * f18) + f10;
            this.M.getTextureView().setScaleX(f19);
            this.M.getTextureView().setScaleY(f19);
            float f20 = ((1.0f - ((f16 * f18) + f10)) * height) / 2.0f;
            float f21 = ((1.0f - ((f17 * f18) + f10)) * width) / 2.0f;
            float f22 = f13 * f18;
            this.M.setTranslationX(((0.0f * f10) + f22) - f21);
            float f23 = f14 * f18;
            this.M.setTranslationY(((f15 * f10) + f23) - f20);
            this.h1 = f23 - this.M.getTranslationY();
            this.i1 = (height * f10) + (((f14 + f12) * f18) - this.M.getTranslationY());
            this.k1 = f22 - this.M.getTranslationX();
            this.j1 = (width * f10) + (((f13 + f11) * f18) - this.M.getTranslationX());
        } else {
            i10 = (int) f11;
            i11 = (int) f12;
            this.M.getTextureView().setScaleX(1.0f);
            this.M.getTextureView().setScaleY(1.0f);
            this.h1 = 0.0f;
            this.i1 = height;
            this.k1 = 0.0f;
            this.j1 = width;
            this.M.setTranslationX(f13);
            this.M.setTranslationY(f14);
        }
        if (layoutParams.width != i10 || layoutParams.height != i11) {
            layoutParams.width = i10;
            layoutParams.height = i11;
            this.M.requestLayout();
        }
        this.M.invalidateOutline();
        this.M.invalidate();
    }

    public void setCheckCameraWhenShown(boolean z4) {
        this.r0 = z4;
    }

    public void setIncludeVideosInGallery(boolean z4) {
        this.v0 = z4;
    }

    public void setStarsPrice(long j10) {
        HashMap hashMap = p1;
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
        B(getSelectedItemsCount());
        if (W(false)) {
            x0();
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        mi miVar = this.b;
        if (miVar.getSheetAnimationType() == 1) {
            float f11 = (f10 / 40.0f) * (-0.1f);
            ql qlVar = this.B;
            int childCount = qlVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = qlVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.t5) {
                    org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                    float f12 = 1.0f + f11;
                    t5Var.getCheckBox().setScaleX(f12);
                    t5Var.getCheckBox().setScaleY(f12);
                }
            }
        }
        super.setTranslationY(f10);
        miVar.getSheetContainer().invalidate();
        invalidate();
    }

    @Override // org.telegram.ui.Components.ei
    public final void t(int i10) {
        TLRPC.Chat k12;
        boolean z4;
        boolean z10;
        char c3 = 1;
        char c10 = 1;
        char c11 = 1;
        char c12 = 1;
        mi miVar = this.b;
        if (i10 == 8) {
            miVar.H1(!miVar.Z, true);
            this.a1.a(!miVar.Z, true);
            return;
        }
        if ((i10 == 0 || i10 == 1) && miVar.P1 > 0 && q1.size() > 1 && (k12 = miVar.k1()) != null && !ChatObject.hasAdminRights(k12) && k12.slowmode_enabled) {
            z4.O(getContext(), LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSendError), null, null, this.a).o();
            return;
        }
        org.telegram.ui.ActionBar.g6 g6Var = this.a;
        HashMap hashMap = p1;
        final int i11 = 0;
        if (i10 == 0) {
            MessageObject messageObject = miVar.E1;
            org.telegram.ui.ActionBar.p2 p2Var = miVar.c0;
            if (messageObject == null && (p2Var instanceof org.telegram.ui.xn) && ((org.telegram.ui.xn) p2Var).c()) {
                z4.M(getContext(), ((org.telegram.ui.xn) p2Var).a(), new el(this, c12 == true ? 1 : 0), g6Var);
                return;
            } else {
                z4.a0(miVar.G1, miVar.j1() + hashMap.size(), miVar.n1(), new Utilities.Callback(this) { // from class: org.telegram.ui.Components.fl
                    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        int i12 = i11;
                        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                        Long l10 = (Long) obj;
                        switch (i12) {
                            case 0:
                                boolean z11 = ChatAttachAlertPhotoLayout.n1;
                                mi miVar2 = chatAttachAlertPhotoLayout.b;
                                miVar2.Y0();
                                miVar2.W1.I1(7, false, true, 0, 0, 0L, miVar2.s1(), false, l10.longValue());
                                break;
                            default:
                                boolean z12 = ChatAttachAlertPhotoLayout.n1;
                                mi miVar3 = chatAttachAlertPhotoLayout.b;
                                miVar3.Y0();
                                miVar3.W1.I1(4, true, true, 0, 0, 0L, miVar3.s1(), false, l10.longValue());
                                break;
                        }
                    }
                });
                return;
            }
        }
        int i12 = 2;
        if (i10 == 1) {
            MessageObject messageObject2 = miVar.E1;
            org.telegram.ui.ActionBar.p2 p2Var2 = miVar.c0;
            if (messageObject2 == null && (p2Var2 instanceof org.telegram.ui.xn) && ((org.telegram.ui.xn) p2Var2).c()) {
                z4.M(getContext(), ((org.telegram.ui.xn) p2Var2).a(), new el(this, i12), g6Var);
                return;
            }
            int i13 = miVar.G1;
            long n12 = miVar.n1();
            int j12 = miVar.j1() + hashMap.size();
            final char c13 = c11 == true ? 1 : 0;
            z4.a0(i13, j12, n12, new Utilities.Callback(this) { // from class: org.telegram.ui.Components.fl
                public final /* synthetic */ ChatAttachAlertPhotoLayout b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    int i122 = c13;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                    Long l10 = (Long) obj;
                    switch (i122) {
                        case 0:
                            boolean z11 = ChatAttachAlertPhotoLayout.n1;
                            mi miVar2 = chatAttachAlertPhotoLayout.b;
                            miVar2.Y0();
                            miVar2.W1.I1(7, false, true, 0, 0, 0L, miVar2.s1(), false, l10.longValue());
                            break;
                        default:
                            boolean z12 = ChatAttachAlertPhotoLayout.n1;
                            mi miVar3 = chatAttachAlertPhotoLayout.b;
                            miVar3.Y0();
                            miVar3.W1.I1(4, true, true, 0, 0, 0L, miVar3.s1(), false, l10.longValue());
                            break;
                    }
                }
            });
            return;
        }
        fm fmVar = this.D;
        ql qlVar = this.B;
        if (i10 == 3) {
            qm qmVar = miVar.n0;
            if (qmVar != null) {
                qmVar.J();
            }
            Iterator it = hashMap.entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((MediaController.PhotoEntry) ((Map.Entry) it.next()).getValue()).hasSpoiler) {
                        z10 = true;
                        break;
                    }
                } else {
                    z10 = false;
                    break;
                }
            }
            final boolean z11 = !z10;
            AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.Components.gl
                public final /* synthetic */ ChatAttachAlertPhotoLayout b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i14 = i11;
                    boolean z12 = z11;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                    switch (i14) {
                        case 0:
                            boolean z13 = ChatAttachAlertPhotoLayout.n1;
                            mi miVar2 = chatAttachAlertPhotoLayout.b;
                            org.telegram.ui.ActionBar.g1 g1Var = chatAttachAlertPhotoLayout.V0;
                            g1Var.setText(LocaleController.getString(z12 ? R.string.DisablePhotoSpoiler : R.string.EnablePhotoSpoiler));
                            if (z12) {
                                g1Var.setIcon(R.drawable.msg_spoiler_off);
                            } else {
                                g1Var.setAnimatedIcon(R.raw.photo_spoiler);
                            }
                            if (!z12) {
                                miVar2.X0.K(1);
                                if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                    miVar2.X0.K(6);
                                    break;
                                }
                            } else {
                                miVar2.X0.r(1);
                                if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                    miVar2.X0.r(6);
                                    break;
                                }
                            }
                            break;
                        default:
                            org.telegram.ui.ActionBar.g1 g1Var2 = chatAttachAlertPhotoLayout.X0;
                            g1Var2.setText(LocaleController.getString(z12 ? R.string.SendInStandardQuality : R.string.SendInHighQuality));
                            if (!z12) {
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
                    photoEntry.hasSpoiler = z11;
                    photoEntry.isChatPreviewSpoilerRevealed = false;
                    photoEntry.isAttachSpoilerRevealed = false;
                    arrayList.add(Integer.valueOf(photoEntry.imageId));
                }
            }
            qlVar.M(new il(i11, arrayList, z11));
            if (miVar.v0 != this) {
                fmVar.l();
            }
            qm qmVar2 = miVar.n0;
            if (qmVar2 != null) {
                qmVar2.v.invalidate();
                return;
            }
            return;
        }
        if (i10 == 2) {
            qm qmVar3 = miVar.n0;
            if (qmVar3 != null) {
                qmVar3.J();
            }
            Iterator it2 = hashMap.entrySet().iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((MediaController.PhotoEntry) ((Map.Entry) it2.next()).getValue()).isHighQuality()) {
                        z4 = true;
                        break;
                    }
                } else {
                    z4 = false;
                    break;
                }
            }
            final boolean z12 = !z4;
            final char c14 = c10 == true ? 1 : 0;
            AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.Components.gl
                public final /* synthetic */ ChatAttachAlertPhotoLayout b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i14 = c14;
                    boolean z122 = z12;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                    switch (i14) {
                        case 0:
                            boolean z13 = ChatAttachAlertPhotoLayout.n1;
                            mi miVar2 = chatAttachAlertPhotoLayout.b;
                            org.telegram.ui.ActionBar.g1 g1Var = chatAttachAlertPhotoLayout.V0;
                            g1Var.setText(LocaleController.getString(z122 ? R.string.DisablePhotoSpoiler : R.string.EnablePhotoSpoiler));
                            if (z122) {
                                g1Var.setIcon(R.drawable.msg_spoiler_off);
                            } else {
                                g1Var.setAnimatedIcon(R.raw.photo_spoiler);
                            }
                            if (!z122) {
                                miVar2.X0.K(1);
                                if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                    miVar2.X0.K(6);
                                    break;
                                }
                            } else {
                                miVar2.X0.r(1);
                                if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                    miVar2.X0.r(6);
                                    break;
                                }
                            }
                            break;
                        default:
                            org.telegram.ui.ActionBar.g1 g1Var2 = chatAttachAlertPhotoLayout.X0;
                            g1Var2.setText(LocaleController.getString(z122 ? R.string.SendInStandardQuality : R.string.SendInHighQuality));
                            if (!z122) {
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
                    photoEntry2.highQuality = Boolean.valueOf(z12);
                    photoEntry2.isChatPreviewSpoilerRevealed = false;
                    photoEntry2.isAttachSpoilerRevealed = false;
                    arrayList2.add(Integer.valueOf(photoEntry2.imageId));
                }
            }
            qlVar.M(new il(c3 == true ? 1 : 0, arrayList2, z12));
            if (miVar.v0 != this) {
                fmVar.l();
            }
            qm qmVar4 = miVar.n0;
            if (qmVar4 != null) {
                qmVar4.v.invalidate();
                return;
            }
            return;
        }
        if (i10 != 4) {
            if (i10 == 7) {
                miVar.Z1(miVar.v0 != miVar.n0);
                return;
            }
            if (i10 == 9) {
                mh.ja.g1(getContext(), getStarsPrice(), true, new d(this, 6), this.a);
                return;
            }
            if (i10 >= 10) {
                MediaController.AlbumEntry albumEntry = (MediaController.AlbumEntry) this.S0.get(i10 - 10);
                this.Q0 = albumEntry;
                MediaController.AlbumEntry albumEntry2 = this.R0;
                TextView textView = this.x;
                if (albumEntry == albumEntry2) {
                    textView.setText(LocaleController.getString(R.string.ChatGallery));
                } else {
                    textView.setText(albumEntry.bucketName);
                }
                fmVar.l();
                this.v.l();
                this.C.h1(0, -(qlVar.getPaddingTop() - getTopScrollOffset()));
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
                int i14 = miVar.N0;
                org.telegram.ui.ActionBar.p2 p2Var3 = miVar.c0;
                if (i14 != 0) {
                    p2Var3.startActivityForResult(createChooser, 14);
                } else {
                    p2Var3.startActivityForResult(createChooser, 1);
                }
            } else {
                Intent intent3 = new Intent("android.intent.action.PICK");
                intent3.setType("image/*");
                int i15 = miVar.N0;
                org.telegram.ui.ActionBar.p2 p2Var4 = miVar.c0;
                if (i15 != 0) {
                    p2Var4.startActivityForResult(intent3, 14);
                } else {
                    p2Var4.startActivityForResult(intent3, 1);
                }
            }
            miVar.dismiss(true);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    public final void t0(boolean z4) {
        i91 i91Var = this.i0;
        if ((i91Var.getTag() != null && z4) || (i91Var.getTag() == null && !z4)) {
            if (z4) {
                Runnable runnable = this.k0;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                hl hlVar = new hl(this, 3);
                this.k0 = hlVar;
                AndroidUtilities.runOnUIThread(hlVar, 2000L);
                return;
            }
            return;
        }
        AnimatorSet animatorSet = this.j0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        i91Var.setTag(z4 ? 1 : null);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.j0 = animatorSet2;
        animatorSet2.setDuration(180L);
        this.j0.playTogether(ObjectAnimator.ofFloat(i91Var, (Property<i91, Float>) View.ALPHA, z4 ? 1.0f : 0.0f));
        this.j0.addListener(new sl(this, 0));
        this.j0.start();
        if (z4) {
            hl hlVar2 = new hl(this, 4);
            this.k0 = hlVar2;
            AndroidUtilities.runOnUIThread(hlVar2, 2000L);
        }
    }

    @Override // org.telegram.ui.Components.ei
    public final void u() {
        mi miVar = this.b;
        U(miVar != null && (miVar.c0 instanceof org.telegram.ui.xn));
    }

    public final void u0() {
        wl wlVar = this.w;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = wlVar.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        if (this.s0) {
            ArrayList<MediaController.AlbumEntry> arrayList = q0() ? MediaController.allMediaAlbums : MediaController.allPhotoAlbums;
            ArrayList arrayList2 = new ArrayList(arrayList);
            this.S0 = arrayList2;
            Collections.sort(arrayList2, new kl(arrayList, 0));
        } else {
            this.S0 = new ArrayList();
        }
        boolean isEmpty = this.S0.isEmpty();
        TextView textView = this.x;
        if (isEmpty) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.y, (Drawable) null);
        int size = this.S0.size();
        for (int i10 = 0; i10 < size; i10++) {
            MediaController.AlbumEntry albumEntry = (MediaController.AlbumEntry) this.S0.get(i10);
            qh.a aVar = new qh.a(getContext(), albumEntry.coverPhoto, albumEntry.bucketName, albumEntry.photos.size(), this.a);
            wlVar.getPopupLayout().addView(aVar);
            aVar.setOnClickListener(new mh.x0(this, i10 + 10, 5));
        }
    }

    public final void v0() {
        ql qlVar = this.B;
        if (qlVar != null) {
            for (int i10 = 0; i10 < qlVar.getChildCount(); i10++) {
                View childAt = qlVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.t5) {
                    ((org.telegram.ui.Cells.t5) childAt).a.invalidate();
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.ei
    public final void w(int i10, boolean z4) {
        V();
        bm bmVar = this.M;
        if (bmVar != null) {
            bmVar.invalidateOutline();
            this.M.invalidate();
        }
    }

    public final void w0() {
        ArrayList arrayList;
        if (this.b.c0 instanceof org.telegram.ui.xn) {
            ql qlVar = this.B;
            int childCount = qlVar.getChildCount();
            int i10 = 0;
            while (true) {
                arrayList = q1;
                if (i10 >= childCount) {
                    break;
                }
                View childAt = qlVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.t5) {
                    org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                    MediaController.PhotoEntry b02 = b0(((Integer) t5Var.getTag()).intValue());
                    if (b02 != null) {
                        t5Var.setNum(arrayList.indexOf(Integer.valueOf(b02.imageId)));
                    }
                }
                i10++;
            }
            ql qlVar2 = this.r;
            int childCount2 = qlVar2.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                View childAt2 = qlVar2.getChildAt(i11);
                if (childAt2 instanceof org.telegram.ui.Cells.t5) {
                    org.telegram.ui.Cells.t5 t5Var2 = (org.telegram.ui.Cells.t5) childAt2;
                    MediaController.PhotoEntry b03 = b0(((Integer) t5Var2.getTag()).intValue());
                    if (b03 != null) {
                        t5Var2.setNum(arrayList.indexOf(Integer.valueOf(b03.imageId)));
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.ei
    public final void x() {
        ShutterButton shutterButton = this.h0;
        if (shutterButton == null) {
            return;
        }
        boolean z4 = this.N0;
        fv0 fv0Var = fv0.a;
        fv0 fv0Var2 = fv0.b;
        if (z4) {
            if (this.M != null && shutterButton.getState() == fv0Var2) {
                shutterButton.a(fv0Var);
            }
            this.N0 = false;
            return;
        }
        if (this.M != null && shutterButton.getState() == fv0Var2) {
            l0();
            CameraController.getInstance().stopVideoRecording(this.M.getCameraSession(), false);
            shutterButton.a(fv0Var);
        }
        if (this.V) {
            a0(false);
        }
        d0(true);
    }

    public final void x0() {
        ArrayList arrayList;
        fm fmVar;
        HashMap hashMap;
        mi miVar = this.b;
        org.telegram.ui.ActionBar.p2 p2Var = miVar.c0;
        org.telegram.ui.ActionBar.p2 p2Var2 = miVar.c0;
        if (p2Var instanceof org.telegram.ui.xn) {
            ql qlVar = this.B;
            int childCount = qlVar.getChildCount();
            int i10 = 0;
            while (true) {
                arrayList = q1;
                fmVar = this.D;
                hashMap = p1;
                if (i10 >= childCount) {
                    break;
                }
                View childAt = qlVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.t5) {
                    org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                    int R = RecyclerView.R(childAt);
                    if (fmVar.f && R > this.J0) {
                        R--;
                    }
                    if (fmVar.d && this.Q0 == this.R0) {
                        R--;
                    }
                    MediaController.PhotoEntry b02 = b0(R);
                    t5Var.setHasSpoiler(b02 != null && b02.hasSpoiler);
                    t5Var.setHighQuality(b02 != null && b02.isHighQuality());
                    if ((p2Var2 instanceof org.telegram.ui.xn) && miVar.Q1) {
                        t5Var.b(b02 != null ? arrayList.indexOf(Integer.valueOf(b02.imageId)) : -1, b02 != null && hashMap.containsKey(Integer.valueOf(b02.imageId)), true);
                    } else {
                        t5Var.b(-1, b02 != null && hashMap.containsKey(Integer.valueOf(b02.imageId)), true);
                    }
                }
                i10++;
            }
            ql qlVar2 = this.r;
            int childCount2 = qlVar2.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                View childAt2 = qlVar2.getChildAt(i11);
                if (childAt2 instanceof org.telegram.ui.Cells.t5) {
                    org.telegram.ui.Cells.t5 t5Var2 = (org.telegram.ui.Cells.t5) childAt2;
                    int R2 = RecyclerView.R(childAt2);
                    if (fmVar.f && R2 > this.J0) {
                        R2--;
                    }
                    if (fmVar.d && this.Q0 == this.R0) {
                        R2--;
                    }
                    MediaController.PhotoEntry b03 = b0(R2);
                    t5Var2.setHasSpoiler(b03 != null && b03.hasSpoiler);
                    t5Var2.setHighQuality(b03 != null && b03.isHighQuality());
                    if ((p2Var2 instanceof org.telegram.ui.xn) && miVar.Q1) {
                        t5Var2.b(b03 != null ? arrayList.indexOf(Integer.valueOf(b03.imageId)) : -1, b03 != null && hashMap.containsKey(Integer.valueOf(b03.imageId)), true);
                    } else {
                        t5Var2.b(-1, b03 != null && hashMap.containsKey(Integer.valueOf(b03.imageId)), true);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00de  */
    @Override // org.telegram.ui.Components.ei
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(int i10, int i11) {
        int D;
        int i12;
        int dp;
        this.O0 = true;
        int i13 = this.J0;
        if (AndroidUtilities.isTablet()) {
            this.J0 = 4;
        } else {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                this.J0 = 4;
            } else {
                this.J0 = 3;
            }
        }
        this.m1 = AndroidUtilities.dp(48.0f) + AndroidUtilities.navigationBarHeight;
        ql qlVar = this.B;
        ((FrameLayout.LayoutParams) qlVar.getLayoutParams()).topMargin = -this.m1;
        int dp2 = (i10 - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(4.0f);
        int i14 = this.J0;
        int i15 = dp2 / i14;
        this.H0 = i15;
        if (this.I0 != i15 || i13 != i14) {
            this.I0 = i15;
            AndroidUtilities.runOnUIThread(new hl(this, 2));
        }
        this.C.y1(Math.max(1, ((this.J0 - 1) * AndroidUtilities.dp(2.0f)) + (this.H0 * this.J0)));
        fm fmVar = this.D;
        int ceil = (int) Math.ceil((fmVar.h() - 1) / this.J0);
        if (this.M0) {
            D = AndroidUtilities.dp(400.0f);
        } else {
            D = org.telegram.messenger.y3.D(2.0f, ceil - 1, this.H0 * ceil);
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        int b10 = org.telegram.messenger.y3.b(6.0f, (((i11 - D) - currentActionBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(12.0f), 0);
        if (this.G != b10) {
            this.G = b10;
            fmVar.l();
        }
        if (!AndroidUtilities.isTablet()) {
            Point point2 = AndroidUtilities.displaySize;
            if (point2.x > point2.y) {
                i12 = (int) (i11 / 3.5f);
                dp = ((i12 + currentActionBarHeight) - AndroidUtilities.dp(52.0f)) + this.m1;
                if (dp < 0) {
                    dp = 0;
                }
                if (qlVar.getPaddingTop() == dp || qlVar.getPaddingBottom() != this.e) {
                    qlVar.setPadding(AndroidUtilities.dp(2.0f), dp, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(48.0f) + this.e);
                }
                this.x.setTextSize(17.0f);
                this.O0 = false;
            }
        }
        i12 = (i11 / 5) * 2;
        dp = ((i12 + currentActionBarHeight) - AndroidUtilities.dp(52.0f)) + this.m1;
        if (dp < 0) {
        }
        if (qlVar.getPaddingTop() == dp) {
        }
        qlVar.setPadding(AndroidUtilities.dp(2.0f), dp, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(48.0f) + this.e);
        this.x.setTextSize(17.0f);
        this.O0 = false;
    }

    public final void y0(boolean z4) {
        TextView textView = this.m0;
        if (textView != null) {
            mi miVar = this.b;
            int i10 = miVar.N0;
            TextView textView2 = miVar.g1;
            if (i10 != 0 || miVar.Q0 || miVar.E) {
                return;
            }
            HashMap hashMap = p1;
            Iterator it = hashMap.entrySet().iterator();
            boolean z10 = false;
            boolean z11 = false;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((MediaController.PhotoEntry) ((Map.Entry) it.next()).getValue()).isVideo) {
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
                textView.setText(LocaleController.formatPluralString("Media", hashMap.size(), new Object[0]).toUpperCase());
                if (max != this.J || z4) {
                    textView2.setText(LocaleController.formatPluralString("MediaSelected", max, new Object[0]));
                }
            } else if (z10) {
                textView.setText(LocaleController.formatPluralString("Videos", hashMap.size(), new Object[0]).toUpperCase());
                if (max != this.J || z4) {
                    textView2.setText(LocaleController.formatPluralString("VideosSelected", max, new Object[0]));
                }
            } else {
                textView.setText(LocaleController.formatPluralString("Photos", hashMap.size(), new Object[0]).toUpperCase());
                if (max != this.J || z4) {
                    textView2.setText(LocaleController.formatPluralString("PhotosSelected", max, new Object[0]));
                }
            }
            boolean z12 = max > 1;
            miVar.J = z12;
            miVar.j1.setVisibility((!z12 || miVar.N0 == 2) ? 8 : 0);
            this.J = max;
        }
    }
}
