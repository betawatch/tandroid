package org.telegram.ui.Components;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import org.telegram.messenger.BringAppForegroundService;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ut extends org.telegram.ui.ActionBar.t2 {
    public static ut K1;
    public String A1;
    public boolean B1;
    public String C1;
    public int D1;
    public boolean E1;
    public boolean F1;
    public boolean G1;
    public int H1;
    public int I1;
    public ot J1;
    public pt j1;
    public d71 k1;
    public View l1;
    public FrameLayout m1;
    public WebChromeClient.CustomViewCallback n1;
    public View o1;
    public RadialProgressView p1;
    public Activity q1;
    public LinearLayout r1;
    public TextView s1;
    public ai.o2 t1;
    public ImageView u1;
    public boolean v1;
    public int[] w1;
    public st x1;
    public int y1;
    public int z1;

    public static void K0(org.telegram.ui.ActionBar.d2 d2Var, org.telegram.messenger.zi ziVar, org.telegram.ui.eq0 eq0Var, String str, String str2, String str3, String str4, int i3, int i10, int i11, boolean z10) {
        float f10;
        int i12;
        TLRPC.MessageMedia messageMedia;
        ut utVar = K1;
        if (utVar != null) {
            utVar.I0();
        }
        if (((ziVar == null || (messageMedia = ziVar.k.media) == null || messageMedia.webpage == null) ? null : d71.e(str4)) != null) {
            PhotoViewer.v1().N2(null, d2Var, null);
            PhotoViewer.v1().h2(ziVar, null, null, null, null, null, null, 0, eq0Var, null, 0L, 0L, 0L, true, null, Integer.valueOf(i11));
            return;
        }
        Activity parentActivity = d2Var.getParentActivity();
        int i13 = 0;
        final ut utVar2 = new ut(parentActivity, false);
        final int i14 = 2;
        utVar2.w1 = new int[2];
        utVar2.D1 = -2;
        utVar2.J1 = new ot(utVar2);
        int i15 = 1;
        utVar2.V = true;
        utVar2.v0 = false;
        utVar2.w0 = false;
        utVar2.I1 = i11;
        if (parentActivity != null) {
            utVar2.q1 = parentActivity;
        }
        utVar2.C1 = str4;
        boolean z11 = str2 != null && str2.length() > 0;
        utVar2.B1 = z11;
        utVar2.A1 = str3;
        utVar2.y1 = i3;
        utVar2.z1 = i10;
        if (i3 == 0 || i10 == 0) {
            Point point = org.telegram.messenger.g0.q;
            utVar2.y1 = point.x;
            utVar2.z1 = point.y / 2;
        }
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        utVar2.m1 = frameLayout;
        frameLayout.setKeepScreenOn(true);
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.setFitsSystemWindows(true);
        frameLayout.setOnTouchListener(new fi.a(17));
        utVar2.c.addView(frameLayout, b8.mf.c(-1.0f, -1));
        frameLayout.setVisibility(4);
        ai.o2 o2Var = new ai.o2(19, parentActivity, utVar2);
        utVar2.t1 = o2Var;
        o2Var.setOnTouchListener(new fi.a(17));
        utVar2.O = o2Var;
        pt ptVar = new pt(utVar2, parentActivity, parentActivity, i13);
        utVar2.j1 = ptVar;
        ptVar.getSettings().setJavaScriptEnabled(true);
        ptVar.getSettings().setDomStorageEnabled(true);
        ptVar.getSettings().setMediaPlaybackRequiresUserGesture(false);
        ptVar.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(ptVar, true);
        ptVar.setWebChromeClient(new org.telegram.ui.n1(utVar2, i15));
        ptVar.setWebViewClient(new org.telegram.ui.o1(utVar2, i15));
        o2Var.addView(ptVar, b8.mf.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 84));
        d71 d71Var = new d71(parentActivity, true, new qt(utVar2));
        utVar2.k1 = d71Var;
        d71Var.setVisibility(4);
        o2Var.addView(d71Var, b8.mf.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 74));
        View view = new View(parentActivity);
        utVar2.o1 = view;
        view.setBackgroundColor(-16777216);
        view.setVisibility(4);
        o2Var.addView(view, b8.mf.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 84));
        RadialProgressView radialProgressView = new RadialProgressView(parentActivity, null);
        utVar2.p1 = radialProgressView;
        radialProgressView.setVisibility(4);
        o2Var.addView(radialProgressView, b8.mf.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, ((z11 ? 22 : 0) + 84) / 2));
        if (z11) {
            TextView textView = new TextView(parentActivity);
            f10 = 18.0f;
            textView.setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.j5, null);
            textView.setText(str2);
            textView.setSingleLine(true);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
            o2Var.addView(textView, b8.mf.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 77.0f));
        } else {
            f10 = 18.0f;
        }
        TextView textView2 = new TextView(parentActivity);
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.p5, null);
        textView2.setText(str);
        textView2.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setPadding(org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(f10), 0);
        o2Var.addView(textView2, b8.mf.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 57.0f));
        View view2 = new View(parentActivity);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.K5, view2, null);
        o2Var.addView(view2, new FrameLayout.LayoutParams(-1, 1, 83));
        ((FrameLayout.LayoutParams) view2.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(48.0f);
        FrameLayout frameLayout2 = new FrameLayout(parentActivity);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.h5, frameLayout2, null);
        o2Var.addView(frameLayout2, b8.mf.e(-1, 48, 83));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        frameLayout2.addView(linearLayout, b8.mf.e(-2, -1, 53));
        TextView textView3 = new TextView(parentActivity);
        textView3.setTextSize(1, 14.0f);
        int i16 = org.telegram.ui.ActionBar.k6.o5;
        org.telegram.ui.ActionBar.r6.V(textView3, i16, null);
        textView3.setGravity(17);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        int i17 = org.telegram.ui.ActionBar.k6.I5;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i17, false), 0, -1);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i17);
        textView3.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(textView3, h02, null, N, null);
        textView3.setPadding(org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(f10), 0);
        textView3.setText(org.telegram.messenger.bd.M0(2131752041, null).toUpperCase());
        textView3.setTypeface(org.telegram.messenger.g0.o());
        frameLayout2.addView(textView3, b8.mf.r(-2, -1, 51));
        final int i18 = 0;
        textView3.setOnClickListener(new View.OnClickListener(utVar2) { // from class: org.telegram.ui.Components.mt
            public final /* synthetic */ ut b;

            {
                this.b = utVar2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i18) {
                    case 0:
                        this.b.dismiss();
                        break;
                    case 1:
                        ut utVar3 = this.b;
                        ie0 ie0Var = ie0.q0;
                        if (!ie0Var.Q) {
                            boolean z12 = utVar3.v1 && "inapp".equals(org.telegram.messenger.hp.s1(utVar3.a).B3);
                            if (!z12) {
                                Activity activity = utVar3.q1;
                                if (activity != null) {
                                    if (!Settings.canDrawOverlays(activity)) {
                                        t4.A(activity, null, false);
                                        break;
                                    }
                                }
                            }
                            if (utVar3.p1.getVisibility() != 0) {
                                if (ie0.x(z12, utVar3.q1, null, utVar3.j1, utVar3.y1, utVar3.z1, false)) {
                                    ie0Var.V = utVar3;
                                }
                                if (utVar3.v1) {
                                    utVar3.j1.evaluateJavascript("hideControls();", null);
                                }
                                utVar3.b.setTranslationY(0.0f);
                                utVar3.K();
                                break;
                            }
                        } else {
                            ie0.b(false);
                            Objects.requireNonNull(view3);
                            org.telegram.messenger.g0.i3(new nt(0, view3), 300L);
                            break;
                        }
                        break;
                    case 2:
                        ut utVar4 = this.b;
                        try {
                            ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", utVar4.A1));
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        Activity activity2 = utVar4.q1;
                        if (activity2 instanceof LaunchActivity) {
                            ((LaunchActivity) activity2).H0(new a3(14));
                        }
                        utVar4.dismiss();
                        break;
                    default:
                        ut utVar5 = this.b;
                        sf.c.t(utVar5.q1, utVar5.A1);
                        utVar5.dismiss();
                        break;
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(parentActivity);
        utVar2.r1 = linearLayout2;
        linearLayout2.setVisibility(4);
        frameLayout2.addView(linearLayout2, b8.mf.e(-2, -1, 17));
        ImageView imageView = new ImageView(parentActivity);
        utVar2.u1 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.ic_goinline);
        imageView.setContentDescription(org.telegram.messenger.bd.M0(2131754808, null));
        imageView.setEnabled(false);
        imageView.setAlpha(0.5f);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.t(imageView, i16, null, mode);
        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i17, false), 0, -1);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i17);
        imageView.setBackground(h03);
        org.telegram.ui.ActionBar.r6.k(imageView, h03, null, N2, null);
        linearLayout2.addView(imageView, b8.mf.d(48, 48.0f, 51, 0.0f, 0.0f, 4.0f, 0.0f));
        final int i19 = 1;
        imageView.setOnClickListener(new View.OnClickListener(utVar2) { // from class: org.telegram.ui.Components.mt
            public final /* synthetic */ ut b;

            {
                this.b = utVar2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i19) {
                    case 0:
                        this.b.dismiss();
                        break;
                    case 1:
                        ut utVar3 = this.b;
                        ie0 ie0Var = ie0.q0;
                        if (!ie0Var.Q) {
                            boolean z12 = utVar3.v1 && "inapp".equals(org.telegram.messenger.hp.s1(utVar3.a).B3);
                            if (!z12) {
                                Activity activity = utVar3.q1;
                                if (activity != null) {
                                    if (!Settings.canDrawOverlays(activity)) {
                                        t4.A(activity, null, false);
                                        break;
                                    }
                                }
                            }
                            if (utVar3.p1.getVisibility() != 0) {
                                if (ie0.x(z12, utVar3.q1, null, utVar3.j1, utVar3.y1, utVar3.z1, false)) {
                                    ie0Var.V = utVar3;
                                }
                                if (utVar3.v1) {
                                    utVar3.j1.evaluateJavascript("hideControls();", null);
                                }
                                utVar3.b.setTranslationY(0.0f);
                                utVar3.K();
                                break;
                            }
                        } else {
                            ie0.b(false);
                            Objects.requireNonNull(view3);
                            org.telegram.messenger.g0.i3(new nt(0, view3), 300L);
                            break;
                        }
                        break;
                    case 2:
                        ut utVar4 = this.b;
                        try {
                            ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", utVar4.A1));
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        Activity activity2 = utVar4.q1;
                        if (activity2 instanceof LaunchActivity) {
                            ((LaunchActivity) activity2).H0(new a3(14));
                        }
                        utVar4.dismiss();
                        break;
                    default:
                        ut utVar5 = this.b;
                        sf.c.t(utVar5.q1, utVar5.A1);
                        utVar5.dismiss();
                        break;
                }
            }
        });
        View.OnClickListener onClickListener = new View.OnClickListener(utVar2) { // from class: org.telegram.ui.Components.mt
            public final /* synthetic */ ut b;

            {
                this.b = utVar2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i14) {
                    case 0:
                        this.b.dismiss();
                        break;
                    case 1:
                        ut utVar3 = this.b;
                        ie0 ie0Var = ie0.q0;
                        if (!ie0Var.Q) {
                            boolean z12 = utVar3.v1 && "inapp".equals(org.telegram.messenger.hp.s1(utVar3.a).B3);
                            if (!z12) {
                                Activity activity = utVar3.q1;
                                if (activity != null) {
                                    if (!Settings.canDrawOverlays(activity)) {
                                        t4.A(activity, null, false);
                                        break;
                                    }
                                }
                            }
                            if (utVar3.p1.getVisibility() != 0) {
                                if (ie0.x(z12, utVar3.q1, null, utVar3.j1, utVar3.y1, utVar3.z1, false)) {
                                    ie0Var.V = utVar3;
                                }
                                if (utVar3.v1) {
                                    utVar3.j1.evaluateJavascript("hideControls();", null);
                                }
                                utVar3.b.setTranslationY(0.0f);
                                utVar3.K();
                                break;
                            }
                        } else {
                            ie0.b(false);
                            Objects.requireNonNull(view3);
                            org.telegram.messenger.g0.i3(new nt(0, view3), 300L);
                            break;
                        }
                        break;
                    case 2:
                        ut utVar4 = this.b;
                        try {
                            ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", utVar4.A1));
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        Activity activity2 = utVar4.q1;
                        if (activity2 instanceof LaunchActivity) {
                            ((LaunchActivity) activity2).H0(new a3(14));
                        }
                        utVar4.dismiss();
                        break;
                    default:
                        ut utVar5 = this.b;
                        sf.c.t(utVar5.q1, utVar5.A1);
                        utVar5.dismiss();
                        break;
                }
            }
        };
        ImageView imageView2 = new ImageView(parentActivity);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.msg_copy);
        imageView2.setContentDescription(org.telegram.messenger.bd.M0(2131751762, null));
        org.telegram.ui.ActionBar.r6.t(imageView2, i16, null, mode);
        org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i17, false), 0, -1);
        org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i17);
        imageView2.setBackground(h04);
        org.telegram.ui.ActionBar.r6.k(imageView2, h04, null, N3, null);
        linearLayout2.addView(imageView2, b8.mf.e(48, 48, 51));
        imageView2.setOnClickListener(onClickListener);
        TextView textView4 = new TextView(parentActivity);
        utVar2.s1 = textView4;
        textView4.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(textView4, i16, null);
        textView4.setGravity(17);
        textView4.setSingleLine(true);
        textView4.setEllipsize(truncateAt);
        org.telegram.ui.Cells.y h05 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i17, false), 0, -1);
        org.telegram.ui.ActionBar.n6 N4 = org.telegram.ui.ActionBar.r6.N(i17);
        textView4.setBackground(h05);
        org.telegram.ui.ActionBar.r6.k(textView4, h05, null, N4, null);
        textView4.setPadding(org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(f10), 0);
        textView4.setText(org.telegram.messenger.bd.M0(2131751767, null).toUpperCase());
        textView4.setTypeface(org.telegram.messenger.g0.o());
        linearLayout.addView(textView4, b8.mf.e(-2, -1, 51));
        textView4.setOnClickListener(onClickListener);
        TextView textView5 = new TextView(parentActivity);
        textView5.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(textView5, i16, null);
        textView5.setGravity(17);
        textView5.setSingleLine(true);
        textView5.setEllipsize(truncateAt);
        org.telegram.ui.Cells.y h06 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i17, false), 0, -1);
        org.telegram.ui.ActionBar.n6 N5 = org.telegram.ui.ActionBar.r6.N(i17);
        textView5.setBackground(h06);
        org.telegram.ui.ActionBar.r6.k(textView5, h06, null, N5, null);
        textView5.setPadding(org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(f10), 0);
        textView5.setText(org.telegram.messenger.bd.M0(2131747806, null).toUpperCase());
        textView5.setTypeface(org.telegram.messenger.g0.o());
        linearLayout.addView(textView5, b8.mf.e(-2, -1, 51));
        final int i20 = 3;
        textView5.setOnClickListener(new View.OnClickListener(utVar2) { // from class: org.telegram.ui.Components.mt
            public final /* synthetic */ ut b;

            {
                this.b = utVar2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i20) {
                    case 0:
                        this.b.dismiss();
                        break;
                    case 1:
                        ut utVar3 = this.b;
                        ie0 ie0Var = ie0.q0;
                        if (!ie0Var.Q) {
                            boolean z12 = utVar3.v1 && "inapp".equals(org.telegram.messenger.hp.s1(utVar3.a).B3);
                            if (!z12) {
                                Activity activity = utVar3.q1;
                                if (activity != null) {
                                    if (!Settings.canDrawOverlays(activity)) {
                                        t4.A(activity, null, false);
                                        break;
                                    }
                                }
                            }
                            if (utVar3.p1.getVisibility() != 0) {
                                if (ie0.x(z12, utVar3.q1, null, utVar3.j1, utVar3.y1, utVar3.z1, false)) {
                                    ie0Var.V = utVar3;
                                }
                                if (utVar3.v1) {
                                    utVar3.j1.evaluateJavascript("hideControls();", null);
                                }
                                utVar3.b.setTranslationY(0.0f);
                                utVar3.K();
                                break;
                            }
                        } else {
                            ie0.b(false);
                            Objects.requireNonNull(view3);
                            org.telegram.messenger.g0.i3(new nt(0, view3), 300L);
                            break;
                        }
                        break;
                    case 2:
                        ut utVar4 = this.b;
                        try {
                            ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", utVar4.A1));
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        Activity activity2 = utVar4.q1;
                        if (activity2 instanceof LaunchActivity) {
                            ((LaunchActivity) activity2).H0(new a3(14));
                        }
                        utVar4.dismiss();
                        break;
                    default:
                        ut utVar5 = this.b;
                        sf.c.t(utVar5.q1, utVar5.A1);
                        utVar5.dismiss();
                        break;
                }
            }
        });
        boolean z12 = d71.a(str4) || d71.a(str3);
        d71Var.setVisibility(z12 ? 0 : 4);
        if (z12) {
            z61 z61Var = d71Var.g0;
            z61Var.setVisibility(4);
            i12 = 0;
            z61Var.d(false, false);
            d71Var.j(true, false);
        } else {
            i12 = 0;
        }
        utVar2.z0 = new rt(utVar2, z12);
        utVar2.x1 = new st(i12, org.telegram.messenger.t0.b, utVar2);
        String e10 = d71.e(str4);
        if (e10 != null || !z12) {
            radialProgressView.setVisibility(i12);
            ptVar.setVisibility(i12);
            linearLayout2.setVisibility(i12);
            if (e10 != null) {
                view.setVisibility(i12);
            }
            textView4.setVisibility(4);
            ptVar.setKeepScreenOn(true);
            d71Var.setVisibility(4);
            d71Var.getControlsView().setVisibility(4);
            d71Var.getTextureView().setVisibility(4);
            if (d71Var.getTextureImageView() != null) {
                d71Var.getTextureImageView().setVisibility(4);
            }
            if (e10 != null && "disabled".equals(org.telegram.messenger.hp.s1(utVar2.a).B3)) {
                imageView.setVisibility(8);
            }
        }
        if (utVar2.x1.canDetectOrientation()) {
            utVar2.x1.enable();
        } else {
            utVar2.x1.disable();
            utVar2.x1 = null;
        }
        K1 = utVar2;
        utVar2.i0 = z10;
        utVar2.n = z10;
        utVar2.show();
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final boolean G() {
        d71 d71Var = this.k1;
        return (d71Var.getVisibility() == 0 && d71Var.U) ? false : true;
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final boolean H() {
        return this.m1.getVisibility() != 0;
    }

    public final void I0() {
        pt ptVar = this.j1;
        if (ptVar != null && ptVar.getVisibility() == 0) {
            this.t1.removeView(ptVar);
            ptVar.stopLoading();
            ptVar.loadUrl("about:blank");
            ptVar.destroy();
        }
        ie0.b(false);
        d71 d71Var = this.k1;
        if (d71Var != null) {
            d71Var.b();
        }
        K1 = null;
        K();
    }

    public final void J0() {
        if (this.j1 == null || !ie0.q0.Q) {
            return;
        }
        if (org.telegram.messenger.t0.x) {
            try {
                this.q1.startService(new Intent(org.telegram.messenger.t0.b, (Class<?>) BringAppForegroundService.class));
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
            }
        }
        if (this.v1) {
            this.j1.evaluateJavascript("showControls();", null);
        }
        ViewGroup viewGroup = (ViewGroup) this.j1.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this.j1);
        }
        this.t1.addView(this.j1, 0, b8.mf.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (this.B1 ? 22 : 0) + 84));
        this.f0 = true;
        show();
        ie0.b(true);
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void K() {
        super.K();
        st stVar = this.x1;
        if (stVar != null) {
            stVar.disable();
            this.x1 = null;
        }
    }

    public final void L0() {
        d71 d71Var = this.k1;
        View aspectRatioView = d71Var.getAspectRatioView();
        int[] iArr = this.w1;
        aspectRatioView.getLocationInWindow(iArr);
        iArr[0] = iArr[0] - S();
        if (!d71Var.f() && !this.G1) {
            TextureView textureView = d71Var.getTextureView();
            textureView.setTranslationX(iArr[0]);
            textureView.setTranslationY(iArr[1]);
            ImageView textureImageView = d71Var.getTextureImageView();
            if (textureImageView != null) {
                textureImageView.setTranslationX(iArr[0]);
                textureImageView.setTranslationY(iArr[1]);
            }
        }
        View controlsView = d71Var.getControlsView();
        if (controlsView.getParent() == this.c) {
            controlsView.setTranslationY(iArr[1]);
        } else {
            controlsView.setTranslationY(0.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void c0(Configuration configuration) {
        d71 d71Var = this.k1;
        if (d71Var.getVisibility() == 0 && d71Var.x && !d71Var.f()) {
            if (configuration.orientation == 2) {
                boolean z10 = d71Var.U;
                if (z10 || z10) {
                    return;
                }
                d71Var.U = true;
                d71Var.m();
                d71Var.l(false);
                return;
            }
            boolean z11 = d71Var.U;
            if (z11 && z11) {
                d71Var.U = false;
                d71Var.m();
                d71Var.l(false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void d0() {
        int i3 = this.H1;
        if (i3 != 0) {
            int i10 = i3 - 1;
            this.H1 = i10;
            if (i10 != 0) {
                this.c.invalidate();
                return;
            }
            d71 d71Var = this.k1;
            TextureView textureView = d71Var.d;
            ImageView imageView = d71Var.e;
            if (imageView != null) {
                try {
                    int width = textureView.getWidth();
                    int height = textureView.getHeight();
                    Bitmap.Config config = Bitmap.Config.ARGB_8888;
                    Bitmap c2 = org.telegram.messenger.sr.c(width, height);
                    d71Var.h = c2;
                    d71Var.n.getBitmap(c2);
                } catch (Throwable th2) {
                    Bitmap bitmap = d71Var.h;
                    if (bitmap != null) {
                        bitmap.recycle();
                        d71Var.h = null;
                    }
                    org.telegram.messenger.a8.g(th2, true);
                }
                if (d71Var.h != null) {
                    imageView.setVisibility(0);
                    imageView.setImageBitmap(d71Var.h);
                } else {
                    imageView.setImageDrawable(null);
                }
            }
            ie0.b(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void g0(float f10) {
        L0();
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final boolean k0(View view, int i3, int i10, int i11, int i12) {
        if (view != this.k1.getControlsView()) {
            return false;
        }
        L0();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final boolean l0(View view, int i3, int i10) {
        d71 d71Var = this.k1;
        if (view == d71Var.getControlsView()) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = d71Var.getMeasuredWidth();
            layoutParams.height = d71Var.getAspectRatioView().getMeasuredHeight() + (d71Var.U ? 0 : org.telegram.messenger.g0.L(10.0f));
        }
        return false;
    }
}
