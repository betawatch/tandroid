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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class hu extends org.telegram.ui.ActionBar.z2 {
    public static hu J1;
    public boolean A1;
    public String B1;
    public int C1;
    public boolean D1;
    public boolean E1;
    public boolean F1;
    public int G1;
    public int H1;
    public bu I1;
    public cu i1;
    public m81 j1;
    public View k1;
    public FrameLayout l1;
    public WebChromeClient.CustomViewCallback m1;
    public View n1;
    public RadialProgressView o1;
    public Activity p1;
    public LinearLayout q1;
    public TextView r1;
    public jg.l0 s1;
    public ImageView t1;
    public boolean u1;
    public int[] v1;
    public fu w1;
    public int x1;
    public int y1;
    public String z1;

    public static void K0(org.telegram.ui.ActionBar.k2 k2Var, org.telegram.messenger.jj jjVar, org.telegram.ui.yr0 yr0Var, String str, String str2, String str3, String str4, int i10, int i11, int i12, boolean z10) {
        float f7;
        int i13;
        TLRPC.MessageMedia messageMedia;
        hu huVar = J1;
        if (huVar != null) {
            huVar.I0();
        }
        if (((jjVar == null || (messageMedia = jjVar.k.media) == null || messageMedia.webpage == null) ? null : m81.e(str4)) != null) {
            PhotoViewer.v1().N2(null, k2Var, null);
            PhotoViewer.v1().h2(jjVar, null, null, null, null, null, null, 0, yr0Var, null, 0L, 0L, 0L, true, null, Integer.valueOf(i12));
            return;
        }
        Activity parentActivity = k2Var.getParentActivity();
        int i14 = 0;
        final hu huVar2 = new hu(parentActivity, false);
        final int i15 = 2;
        huVar2.v1 = new int[2];
        huVar2.C1 = -2;
        huVar2.I1 = new bu(huVar2);
        int i16 = 1;
        huVar2.U = true;
        huVar2.u0 = false;
        huVar2.v0 = false;
        huVar2.H1 = i12;
        if (parentActivity != null) {
            huVar2.p1 = parentActivity;
        }
        huVar2.B1 = str4;
        boolean z11 = str2 != null && str2.length() > 0;
        huVar2.A1 = z11;
        huVar2.z1 = str3;
        huVar2.x1 = i10;
        huVar2.y1 = i11;
        if (i10 == 0 || i11 == 0) {
            Point point = org.telegram.messenger.i0.q;
            huVar2.x1 = point.x;
            huVar2.y1 = point.y / 2;
        }
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        huVar2.l1 = frameLayout;
        frameLayout.setKeepScreenOn(true);
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.setFitsSystemWindows(true);
        frameLayout.setOnTouchListener(new org.telegram.ui.ActionBar.n2(16));
        huVar2.c.addView(frameLayout, w7.b6.c(-1.0f, -1));
        frameLayout.setVisibility(4);
        jg.l0 l0Var = new jg.l0(huVar2, parentActivity, 16);
        huVar2.s1 = l0Var;
        l0Var.setOnTouchListener(new org.telegram.ui.ActionBar.n2(16));
        huVar2.N = l0Var;
        cu cuVar = new cu(huVar2, parentActivity, parentActivity, i14);
        huVar2.i1 = cuVar;
        cuVar.getSettings().setJavaScriptEnabled(true);
        cuVar.getSettings().setDomStorageEnabled(true);
        cuVar.getSettings().setMediaPlaybackRequiresUserGesture(false);
        cuVar.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(cuVar, true);
        cuVar.setWebChromeClient(new org.telegram.ui.o1(huVar2, i16));
        cuVar.setWebViewClient(new ji.i(huVar2, i15));
        l0Var.addView(cuVar, w7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 84));
        m81 m81Var = new m81(parentActivity, true, new du(huVar2));
        huVar2.j1 = m81Var;
        m81Var.setVisibility(4);
        l0Var.addView(m81Var, w7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 74));
        View view = new View(parentActivity);
        huVar2.n1 = view;
        view.setBackgroundColor(-16777216);
        view.setVisibility(4);
        l0Var.addView(view, w7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z11 ? 22 : 0) + 84));
        RadialProgressView radialProgressView = new RadialProgressView(parentActivity, null);
        huVar2.o1 = radialProgressView;
        radialProgressView.setVisibility(4);
        l0Var.addView(radialProgressView, w7.b6.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, ((z11 ? 22 : 0) + 84) / 2));
        if (z11) {
            TextView textView = new TextView(parentActivity);
            f7 = 18.0f;
            textView.setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.j5, null);
            textView.setText(str2);
            textView.setSingleLine(true);
            textView.setTypeface(org.telegram.messenger.i0.o());
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setPadding(org.telegram.messenger.i0.L(18.0f), 0, org.telegram.messenger.i0.L(18.0f), 0);
            l0Var.addView(textView, w7.b6.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 77.0f));
        } else {
            f7 = 18.0f;
        }
        TextView textView2 = new TextView(parentActivity);
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.p5, null);
        textView2.setText(str);
        textView2.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setPadding(org.telegram.messenger.i0.L(f7), 0, org.telegram.messenger.i0.L(f7), 0);
        l0Var.addView(textView2, w7.b6.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 57.0f));
        View view2 = new View(parentActivity);
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.K5, view2, null);
        l0Var.addView(view2, new FrameLayout.LayoutParams(-1, 1, 83));
        ((FrameLayout.LayoutParams) view2.getLayoutParams()).bottomMargin = org.telegram.messenger.i0.L(48.0f);
        FrameLayout frameLayout2 = new FrameLayout(parentActivity);
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.h5, frameLayout2, null);
        l0Var.addView(frameLayout2, w7.b6.e(-1, 48, 83));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        frameLayout2.addView(linearLayout, w7.b6.e(-2, -1, 53));
        TextView textView3 = new TextView(parentActivity);
        textView3.setTextSize(1, 14.0f);
        int i17 = org.telegram.ui.ActionBar.t6.o5;
        org.telegram.ui.ActionBar.a7.V(textView3, i17, null);
        textView3.setGravity(17);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        int i18 = org.telegram.ui.ActionBar.t6.I5;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i18, false), 0, -1);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i18);
        textView3.setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(textView3, h02, null, N, null);
        textView3.setPadding(org.telegram.messenger.i0.L(f7), 0, org.telegram.messenger.i0.L(f7), 0);
        textView3.setText(org.telegram.messenger.cd.L0(2131752041, null).toUpperCase());
        textView3.setTypeface(org.telegram.messenger.i0.o());
        frameLayout2.addView(textView3, w7.b6.r(-2, -1, 51));
        final int i19 = 0;
        textView3.setOnClickListener(new View.OnClickListener(huVar2) { // from class: org.telegram.ui.Components.yt
            public final /* synthetic */ hu b;

            {
                this.b = huVar2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i19) {
                    case 0:
                        this.b.dismiss();
                        break;
                    case 1:
                        hu huVar3 = this.b;
                        jf0 jf0Var = jf0.p0;
                        if (!jf0Var.P) {
                            boolean z12 = huVar3.u1 && "inapp".equals(org.telegram.messenger.vp.r1(huVar3.a).A3);
                            if (!z12) {
                                Activity activity = huVar3.p1;
                                if (activity != null) {
                                    if (!Settings.canDrawOverlays(activity)) {
                                        s4.A(activity, null, false);
                                        break;
                                    }
                                }
                            }
                            if (huVar3.o1.getVisibility() != 0) {
                                if (jf0.x(z12, huVar3.p1, null, huVar3.i1, huVar3.x1, huVar3.y1, false)) {
                                    jf0Var.U = huVar3;
                                }
                                if (huVar3.u1) {
                                    huVar3.i1.evaluateJavascript("hideControls();", null);
                                }
                                huVar3.b.setTranslationY(0.0f);
                                huVar3.L();
                                break;
                            }
                        } else {
                            jf0.b(false);
                            Objects.requireNonNull(view3);
                            org.telegram.messenger.i0.h3(new zt(0, view3), 300L);
                            break;
                        }
                        break;
                    case 2:
                        hu huVar4 = this.b;
                        try {
                            ((ClipboardManager) org.telegram.messenger.w0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", huVar4.z1));
                        } catch (Exception e) {
                            org.telegram.messenger.f8.g(e, true);
                        }
                        Activity activity2 = huVar4.p1;
                        if (activity2 instanceof LaunchActivity) {
                            ((LaunchActivity) activity2).H0(new au(0));
                        }
                        huVar4.dismiss();
                        break;
                    default:
                        hu huVar5 = this.b;
                        gf.f.r(huVar5.p1, huVar5.z1);
                        huVar5.dismiss();
                        break;
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(parentActivity);
        huVar2.q1 = linearLayout2;
        linearLayout2.setVisibility(4);
        frameLayout2.addView(linearLayout2, w7.b6.e(-2, -1, 17));
        ImageView imageView = new ImageView(parentActivity);
        huVar2.t1 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.ic_goinline);
        imageView.setContentDescription(org.telegram.messenger.cd.L0(2131754808, null));
        imageView.setEnabled(false);
        imageView.setAlpha(0.5f);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.a7.t(imageView, i17, null, mode);
        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i18, false), 0, -1);
        org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i18);
        imageView.setBackground(h03);
        org.telegram.ui.ActionBar.a7.k(imageView, h03, null, N2, null);
        linearLayout2.addView(imageView, w7.b6.d(48, 48.0f, 51, 0.0f, 0.0f, 4.0f, 0.0f));
        final int i20 = 1;
        imageView.setOnClickListener(new View.OnClickListener(huVar2) { // from class: org.telegram.ui.Components.yt
            public final /* synthetic */ hu b;

            {
                this.b = huVar2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i20) {
                    case 0:
                        this.b.dismiss();
                        break;
                    case 1:
                        hu huVar3 = this.b;
                        jf0 jf0Var = jf0.p0;
                        if (!jf0Var.P) {
                            boolean z12 = huVar3.u1 && "inapp".equals(org.telegram.messenger.vp.r1(huVar3.a).A3);
                            if (!z12) {
                                Activity activity = huVar3.p1;
                                if (activity != null) {
                                    if (!Settings.canDrawOverlays(activity)) {
                                        s4.A(activity, null, false);
                                        break;
                                    }
                                }
                            }
                            if (huVar3.o1.getVisibility() != 0) {
                                if (jf0.x(z12, huVar3.p1, null, huVar3.i1, huVar3.x1, huVar3.y1, false)) {
                                    jf0Var.U = huVar3;
                                }
                                if (huVar3.u1) {
                                    huVar3.i1.evaluateJavascript("hideControls();", null);
                                }
                                huVar3.b.setTranslationY(0.0f);
                                huVar3.L();
                                break;
                            }
                        } else {
                            jf0.b(false);
                            Objects.requireNonNull(view3);
                            org.telegram.messenger.i0.h3(new zt(0, view3), 300L);
                            break;
                        }
                        break;
                    case 2:
                        hu huVar4 = this.b;
                        try {
                            ((ClipboardManager) org.telegram.messenger.w0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", huVar4.z1));
                        } catch (Exception e) {
                            org.telegram.messenger.f8.g(e, true);
                        }
                        Activity activity2 = huVar4.p1;
                        if (activity2 instanceof LaunchActivity) {
                            ((LaunchActivity) activity2).H0(new au(0));
                        }
                        huVar4.dismiss();
                        break;
                    default:
                        hu huVar5 = this.b;
                        gf.f.r(huVar5.p1, huVar5.z1);
                        huVar5.dismiss();
                        break;
                }
            }
        });
        View.OnClickListener onClickListener = new View.OnClickListener(huVar2) { // from class: org.telegram.ui.Components.yt
            public final /* synthetic */ hu b;

            {
                this.b = huVar2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i15) {
                    case 0:
                        this.b.dismiss();
                        break;
                    case 1:
                        hu huVar3 = this.b;
                        jf0 jf0Var = jf0.p0;
                        if (!jf0Var.P) {
                            boolean z12 = huVar3.u1 && "inapp".equals(org.telegram.messenger.vp.r1(huVar3.a).A3);
                            if (!z12) {
                                Activity activity = huVar3.p1;
                                if (activity != null) {
                                    if (!Settings.canDrawOverlays(activity)) {
                                        s4.A(activity, null, false);
                                        break;
                                    }
                                }
                            }
                            if (huVar3.o1.getVisibility() != 0) {
                                if (jf0.x(z12, huVar3.p1, null, huVar3.i1, huVar3.x1, huVar3.y1, false)) {
                                    jf0Var.U = huVar3;
                                }
                                if (huVar3.u1) {
                                    huVar3.i1.evaluateJavascript("hideControls();", null);
                                }
                                huVar3.b.setTranslationY(0.0f);
                                huVar3.L();
                                break;
                            }
                        } else {
                            jf0.b(false);
                            Objects.requireNonNull(view3);
                            org.telegram.messenger.i0.h3(new zt(0, view3), 300L);
                            break;
                        }
                        break;
                    case 2:
                        hu huVar4 = this.b;
                        try {
                            ((ClipboardManager) org.telegram.messenger.w0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", huVar4.z1));
                        } catch (Exception e) {
                            org.telegram.messenger.f8.g(e, true);
                        }
                        Activity activity2 = huVar4.p1;
                        if (activity2 instanceof LaunchActivity) {
                            ((LaunchActivity) activity2).H0(new au(0));
                        }
                        huVar4.dismiss();
                        break;
                    default:
                        hu huVar5 = this.b;
                        gf.f.r(huVar5.p1, huVar5.z1);
                        huVar5.dismiss();
                        break;
                }
            }
        };
        ImageView imageView2 = new ImageView(parentActivity);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.msg_copy);
        imageView2.setContentDescription(org.telegram.messenger.cd.L0(2131751762, null));
        org.telegram.ui.ActionBar.a7.t(imageView2, i17, null, mode);
        org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i18, false), 0, -1);
        org.telegram.ui.ActionBar.w6 N3 = org.telegram.ui.ActionBar.a7.N(i18);
        imageView2.setBackground(h04);
        org.telegram.ui.ActionBar.a7.k(imageView2, h04, null, N3, null);
        linearLayout2.addView(imageView2, w7.b6.e(48, 48, 51));
        imageView2.setOnClickListener(onClickListener);
        TextView textView4 = new TextView(parentActivity);
        huVar2.r1 = textView4;
        textView4.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.a7.V(textView4, i17, null);
        textView4.setGravity(17);
        textView4.setSingleLine(true);
        textView4.setEllipsize(truncateAt);
        org.telegram.ui.Cells.y h05 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i18, false), 0, -1);
        org.telegram.ui.ActionBar.w6 N4 = org.telegram.ui.ActionBar.a7.N(i18);
        textView4.setBackground(h05);
        org.telegram.ui.ActionBar.a7.k(textView4, h05, null, N4, null);
        textView4.setPadding(org.telegram.messenger.i0.L(f7), 0, org.telegram.messenger.i0.L(f7), 0);
        textView4.setText(org.telegram.messenger.cd.L0(2131751767, null).toUpperCase());
        textView4.setTypeface(org.telegram.messenger.i0.o());
        linearLayout.addView(textView4, w7.b6.e(-2, -1, 51));
        textView4.setOnClickListener(onClickListener);
        TextView textView5 = new TextView(parentActivity);
        textView5.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.a7.V(textView5, i17, null);
        textView5.setGravity(17);
        textView5.setSingleLine(true);
        textView5.setEllipsize(truncateAt);
        org.telegram.ui.Cells.y h06 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i18, false), 0, -1);
        org.telegram.ui.ActionBar.w6 N5 = org.telegram.ui.ActionBar.a7.N(i18);
        textView5.setBackground(h06);
        org.telegram.ui.ActionBar.a7.k(textView5, h06, null, N5, null);
        textView5.setPadding(org.telegram.messenger.i0.L(f7), 0, org.telegram.messenger.i0.L(f7), 0);
        textView5.setText(org.telegram.messenger.cd.L0(2131747814, null).toUpperCase());
        textView5.setTypeface(org.telegram.messenger.i0.o());
        linearLayout.addView(textView5, w7.b6.e(-2, -1, 51));
        final int i21 = 3;
        textView5.setOnClickListener(new View.OnClickListener(huVar2) { // from class: org.telegram.ui.Components.yt
            public final /* synthetic */ hu b;

            {
                this.b = huVar2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i21) {
                    case 0:
                        this.b.dismiss();
                        break;
                    case 1:
                        hu huVar3 = this.b;
                        jf0 jf0Var = jf0.p0;
                        if (!jf0Var.P) {
                            boolean z12 = huVar3.u1 && "inapp".equals(org.telegram.messenger.vp.r1(huVar3.a).A3);
                            if (!z12) {
                                Activity activity = huVar3.p1;
                                if (activity != null) {
                                    if (!Settings.canDrawOverlays(activity)) {
                                        s4.A(activity, null, false);
                                        break;
                                    }
                                }
                            }
                            if (huVar3.o1.getVisibility() != 0) {
                                if (jf0.x(z12, huVar3.p1, null, huVar3.i1, huVar3.x1, huVar3.y1, false)) {
                                    jf0Var.U = huVar3;
                                }
                                if (huVar3.u1) {
                                    huVar3.i1.evaluateJavascript("hideControls();", null);
                                }
                                huVar3.b.setTranslationY(0.0f);
                                huVar3.L();
                                break;
                            }
                        } else {
                            jf0.b(false);
                            Objects.requireNonNull(view3);
                            org.telegram.messenger.i0.h3(new zt(0, view3), 300L);
                            break;
                        }
                        break;
                    case 2:
                        hu huVar4 = this.b;
                        try {
                            ((ClipboardManager) org.telegram.messenger.w0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", huVar4.z1));
                        } catch (Exception e) {
                            org.telegram.messenger.f8.g(e, true);
                        }
                        Activity activity2 = huVar4.p1;
                        if (activity2 instanceof LaunchActivity) {
                            ((LaunchActivity) activity2).H0(new au(0));
                        }
                        huVar4.dismiss();
                        break;
                    default:
                        hu huVar5 = this.b;
                        gf.f.r(huVar5.p1, huVar5.z1);
                        huVar5.dismiss();
                        break;
                }
            }
        });
        boolean z12 = m81.a(str4) || m81.a(str3);
        m81Var.setVisibility(z12 ? 0 : 4);
        if (z12) {
            i81 i81Var = m81Var.f0;
            i81Var.setVisibility(4);
            i13 = 0;
            i81Var.d(false, false);
            m81Var.j(true, false);
        } else {
            i13 = 0;
        }
        huVar2.y0 = new eu(huVar2, z12);
        huVar2.w1 = new fu(huVar2, org.telegram.messenger.w0.b, i13);
        String e = m81.e(str4);
        if (e != null || !z12) {
            radialProgressView.setVisibility(i13);
            cuVar.setVisibility(i13);
            linearLayout2.setVisibility(i13);
            if (e != null) {
                view.setVisibility(i13);
            }
            textView4.setVisibility(4);
            cuVar.setKeepScreenOn(true);
            m81Var.setVisibility(4);
            m81Var.getControlsView().setVisibility(4);
            m81Var.getTextureView().setVisibility(4);
            if (m81Var.getTextureImageView() != null) {
                m81Var.getTextureImageView().setVisibility(4);
            }
            if (e != null && "disabled".equals(org.telegram.messenger.vp.r1(huVar2.a).A3)) {
                imageView.setVisibility(8);
            }
        }
        if (huVar2.w1.canDetectOrientation()) {
            huVar2.w1.enable();
        } else {
            huVar2.w1.disable();
            huVar2.w1 = null;
        }
        J1 = huVar2;
        huVar2.h0 = z10;
        huVar2.n = z10;
        huVar2.show();
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final boolean H() {
        m81 m81Var = this.j1;
        return (m81Var.getVisibility() == 0 && m81Var.T) ? false : true;
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final boolean I() {
        return this.l1.getVisibility() != 0;
    }

    public final void I0() {
        cu cuVar = this.i1;
        if (cuVar != null && cuVar.getVisibility() == 0) {
            this.s1.removeView(cuVar);
            cuVar.stopLoading();
            cuVar.loadUrl("about:blank");
            cuVar.destroy();
        }
        jf0.b(false);
        m81 m81Var = this.j1;
        if (m81Var != null) {
            m81Var.b();
        }
        J1 = null;
        L();
    }

    public final void J0() {
        if (this.i1 == null || !jf0.p0.P) {
            return;
        }
        if (org.telegram.messenger.w0.x) {
            try {
                this.p1.startService(new Intent(org.telegram.messenger.w0.b, (Class<?>) BringAppForegroundService.class));
            } catch (Throwable th2) {
                org.telegram.messenger.f8.g(th2, true);
            }
        }
        if (this.u1) {
            this.i1.evaluateJavascript("showControls();", null);
        }
        ViewGroup viewGroup = (ViewGroup) this.i1.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this.i1);
        }
        this.s1.addView(this.i1, 0, w7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (this.A1 ? 22 : 0) + 84));
        this.e0 = true;
        show();
        jf0.b(true);
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void L() {
        super.L();
        fu fuVar = this.w1;
        if (fuVar != null) {
            fuVar.disable();
            this.w1 = null;
        }
    }

    public final void L0() {
        m81 m81Var = this.j1;
        View aspectRatioView = m81Var.getAspectRatioView();
        int[] iArr = this.v1;
        aspectRatioView.getLocationInWindow(iArr);
        iArr[0] = iArr[0] - T();
        if (!m81Var.f() && !this.F1) {
            TextureView textureView = m81Var.getTextureView();
            textureView.setTranslationX(iArr[0]);
            textureView.setTranslationY(iArr[1]);
            ImageView textureImageView = m81Var.getTextureImageView();
            if (textureImageView != null) {
                textureImageView.setTranslationX(iArr[0]);
                textureImageView.setTranslationY(iArr[1]);
            }
        }
        View controlsView = m81Var.getControlsView();
        if (controlsView.getParent() == this.c) {
            controlsView.setTranslationY(iArr[1]);
        } else {
            controlsView.setTranslationY(0.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void c0(Configuration configuration) {
        m81 m81Var = this.j1;
        if (m81Var.getVisibility() == 0 && m81Var.x && !m81Var.f()) {
            if (configuration.orientation == 2) {
                boolean z10 = m81Var.T;
                if (z10 || z10) {
                    return;
                }
                m81Var.T = true;
                m81Var.m();
                m81Var.l(false);
                return;
            }
            boolean z11 = m81Var.T;
            if (z11 && z11) {
                m81Var.T = false;
                m81Var.m();
                m81Var.l(false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void d0() {
        int i10 = this.G1;
        if (i10 != 0) {
            int i11 = i10 - 1;
            this.G1 = i11;
            if (i11 != 0) {
                this.c.invalidate();
                return;
            }
            m81 m81Var = this.j1;
            TextureView textureView = m81Var.d;
            ImageView imageView = m81Var.e;
            if (imageView != null) {
                try {
                    int width = textureView.getWidth();
                    int height = textureView.getHeight();
                    Bitmap.Config config = Bitmap.Config.ARGB_8888;
                    Bitmap b10 = org.telegram.messenger.js.b(width, height);
                    m81Var.h = b10;
                    m81Var.n.getBitmap(b10);
                } catch (Throwable th2) {
                    Bitmap bitmap = m81Var.h;
                    if (bitmap != null) {
                        bitmap.recycle();
                        m81Var.h = null;
                    }
                    org.telegram.messenger.f8.g(th2, true);
                }
                if (m81Var.h != null) {
                    imageView.setVisibility(0);
                    imageView.setImageBitmap(m81Var.h);
                } else {
                    imageView.setImageDrawable(null);
                }
            }
            jf0.b(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void g0(float f7) {
        L0();
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final boolean k0(View view, int i10, int i11, int i12, int i13) {
        if (view != this.j1.getControlsView()) {
            return false;
        }
        L0();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final boolean l0(View view, int i10, int i11) {
        m81 m81Var = this.j1;
        if (view == m81Var.getControlsView()) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = m81Var.getMeasuredWidth();
            layoutParams.height = m81Var.getAspectRatioView().getMeasuredHeight() + (m81Var.T ? 0 : org.telegram.messenger.i0.L(10.0f));
        }
        return false;
    }
}
