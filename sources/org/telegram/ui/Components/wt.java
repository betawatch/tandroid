package org.telegram.ui.Components;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.RectF;
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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class wt extends org.telegram.ui.ActionBar.v2 {
    public static wt O1;
    public final boolean A1;
    public final String B1;
    public int C1;
    public boolean D1;
    public boolean E1;
    public boolean F1;
    public int G1;
    public final int H1;
    public final qt I1;
    public ti.o J1;
    public View K1;
    public int L1;
    public int M1;
    public final rt N1;
    public final st i1;
    public final l71 j1;
    public View k1;
    public final FrameLayout l1;
    public WebChromeClient.CustomViewCallback m1;
    public final View n1;
    public final RadialProgressView o1;
    public final Activity p1;
    public final LinearLayout q1;
    public final TextView r1;
    public final bi.e5 s1;
    public final ImageView t1;
    public boolean u1;
    public final int[] v1;
    public pt w1;
    public final int x1;
    public final int y1;
    public final String z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wt(Activity activity, String str, String str2, String str3, String str4, int i7, int i10, int i11) {
        super(activity, false);
        float f10;
        int i12;
        int i13 = 0;
        final int i14 = 2;
        this.v1 = new int[2];
        this.C1 = -2;
        this.I1 = new qt(this);
        this.N1 = new rt(this, i13);
        int i15 = 1;
        this.U = true;
        this.u0 = false;
        this.v0 = false;
        this.H1 = i11;
        if (com.google.android.recaptcha.internal.a.u(activity)) {
            this.p1 = activity;
        }
        this.B1 = str4;
        boolean z9 = str2 != null && str2.length() > 0;
        this.A1 = z9;
        this.z1 = str3;
        this.x1 = i7;
        this.y1 = i10;
        if (i7 == 0 || i10 == 0) {
            Point point = org.telegram.messenger.g0.q;
            this.x1 = point.x;
            this.y1 = point.y / 2;
        }
        FrameLayout frameLayout = new FrameLayout(activity);
        this.l1 = frameLayout;
        frameLayout.setKeepScreenOn(true);
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.setFitsSystemWindows(true);
        int i16 = 17;
        frameLayout.setOnTouchListener(new ei.b(i16));
        this.c.addView(frameLayout, c8.ha.c(-1.0f, -1));
        frameLayout.setVisibility(4);
        bi.e5 e5Var = new bi.e5(i16, activity, this);
        this.s1 = e5Var;
        e5Var.setOnTouchListener(new ei.b(i16));
        this.N = e5Var;
        st stVar = new st(this, activity, activity, i13);
        this.i1 = stVar;
        stVar.getSettings().setJavaScriptEnabled(true);
        stVar.getSettings().setDomStorageEnabled(true);
        stVar.getSettings().setMediaPlaybackRequiresUserGesture(false);
        stVar.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(stVar, true);
        stVar.setWebChromeClient(new org.telegram.ui.m1(this, i15));
        stVar.setWebViewClient(new org.telegram.ui.n1(this, i15));
        e5Var.addView(stVar, c8.ha.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z9 ? 22 : 0) + 84));
        l71 l71Var = new l71(activity, true, new tt(this));
        this.j1 = l71Var;
        l71Var.setVisibility(4);
        e5Var.addView(l71Var, c8.ha.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z9 ? 22 : 0) + 74));
        View view = new View(activity);
        this.n1 = view;
        view.setBackgroundColor(-16777216);
        view.setVisibility(4);
        e5Var.addView(view, c8.ha.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z9 ? 22 : 0) + 84));
        RadialProgressView radialProgressView = new RadialProgressView(activity, null);
        this.o1 = radialProgressView;
        radialProgressView.setVisibility(4);
        e5Var.addView(radialProgressView, c8.ha.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, ((z9 ? 22 : 0) + 84) / 2));
        if (z9) {
            TextView textView = new TextView(activity);
            f10 = 18.0f;
            textView.setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.j5, null);
            textView.setText(str2);
            textView.setSingleLine(true);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
            e5Var.addView(textView, c8.ha.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 77.0f));
        } else {
            f10 = 18.0f;
        }
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.p5, null);
        textView2.setText(str);
        textView2.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setPadding(org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(f10), 0);
        e5Var.addView(textView2, c8.ha.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 57.0f));
        View view2 = new View(activity);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.K5, view2, null);
        e5Var.addView(view2, new FrameLayout.LayoutParams(-1, 1, 83));
        ((FrameLayout.LayoutParams) view2.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(48.0f);
        FrameLayout frameLayout2 = new FrameLayout(activity);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.h5, frameLayout2, null);
        e5Var.addView(frameLayout2, c8.ha.e(-1, 48, 83));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        frameLayout2.addView(linearLayout, c8.ha.e(-2, -1, 53));
        TextView textView3 = new TextView(activity);
        textView3.setTextSize(1, 14.0f);
        int i17 = org.telegram.ui.ActionBar.k6.o5;
        org.telegram.ui.ActionBar.r6.V(textView3, i17, null);
        textView3.setGravity(17);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        int i18 = org.telegram.ui.ActionBar.k6.I5;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i18, false), 0, -1);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i18);
        textView3.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(textView3, h02, null, N, null);
        textView3.setPadding(org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(f10), 0);
        textView3.setText(org.telegram.messenger.id.M0(2131752041, null).toUpperCase());
        textView3.setTypeface(org.telegram.messenger.g0.o());
        frameLayout2.addView(textView3, c8.ha.r(-2, -1, 51));
        final int i19 = 0;
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.nt
            public final /* synthetic */ wt b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i19) {
                    case 0:
                        this.b.dismiss();
                        break;
                    case 1:
                        wt wtVar = this.b;
                        st stVar2 = wtVar.i1;
                        ti.o c10 = l2.i.d().c();
                        if (c10 == null) {
                            if (wtVar.o1.getVisibility() != 0) {
                                wtVar.O0(stVar2, wtVar.x1, wtVar.y1);
                                if (wtVar.u1) {
                                    stVar2.evaluateJavascript("hideControls();", null);
                                }
                                wtVar.b.setTranslationY(0.0f);
                                wtVar.K();
                                break;
                            }
                        } else {
                            c10.b();
                            Objects.requireNonNull(view3);
                            org.telegram.messenger.g0.i3(new ot(0, view3), 300L);
                            break;
                        }
                        break;
                    case 2:
                        wt wtVar2 = this.b;
                        try {
                            ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", wtVar2.z1));
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        Activity activity2 = wtVar2.p1;
                        if (activity2 instanceof LaunchActivity) {
                            ((LaunchActivity) activity2).H0(new k2(17));
                        }
                        wtVar2.dismiss();
                        break;
                    default:
                        wt wtVar3 = this.b;
                        vf.c.t(wtVar3.p1, wtVar3.z1);
                        wtVar3.dismiss();
                        break;
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(activity);
        this.q1 = linearLayout2;
        linearLayout2.setVisibility(4);
        frameLayout2.addView(linearLayout2, c8.ha.e(-2, -1, 17));
        ImageView imageView = new ImageView(activity);
        this.t1 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.ic_goinline);
        imageView.setContentDescription(org.telegram.messenger.id.M0(2131754808, null));
        imageView.setEnabled(false);
        imageView.setAlpha(0.5f);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.t(imageView, i17, null, mode);
        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i18, false), 0, -1);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i18);
        imageView.setBackground(h03);
        org.telegram.ui.ActionBar.r6.k(imageView, h03, null, N2, null);
        linearLayout2.addView(imageView, c8.ha.d(48, 48.0f, 51, 0.0f, 0.0f, 4.0f, 0.0f));
        final int i20 = 1;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.nt
            public final /* synthetic */ wt b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i20) {
                    case 0:
                        this.b.dismiss();
                        break;
                    case 1:
                        wt wtVar = this.b;
                        st stVar2 = wtVar.i1;
                        ti.o c10 = l2.i.d().c();
                        if (c10 == null) {
                            if (wtVar.o1.getVisibility() != 0) {
                                wtVar.O0(stVar2, wtVar.x1, wtVar.y1);
                                if (wtVar.u1) {
                                    stVar2.evaluateJavascript("hideControls();", null);
                                }
                                wtVar.b.setTranslationY(0.0f);
                                wtVar.K();
                                break;
                            }
                        } else {
                            c10.b();
                            Objects.requireNonNull(view3);
                            org.telegram.messenger.g0.i3(new ot(0, view3), 300L);
                            break;
                        }
                        break;
                    case 2:
                        wt wtVar2 = this.b;
                        try {
                            ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", wtVar2.z1));
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        Activity activity2 = wtVar2.p1;
                        if (activity2 instanceof LaunchActivity) {
                            ((LaunchActivity) activity2).H0(new k2(17));
                        }
                        wtVar2.dismiss();
                        break;
                    default:
                        wt wtVar3 = this.b;
                        vf.c.t(wtVar3.p1, wtVar3.z1);
                        wtVar3.dismiss();
                        break;
                }
            }
        });
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: org.telegram.ui.Components.nt
            public final /* synthetic */ wt b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i14) {
                    case 0:
                        this.b.dismiss();
                        break;
                    case 1:
                        wt wtVar = this.b;
                        st stVar2 = wtVar.i1;
                        ti.o c10 = l2.i.d().c();
                        if (c10 == null) {
                            if (wtVar.o1.getVisibility() != 0) {
                                wtVar.O0(stVar2, wtVar.x1, wtVar.y1);
                                if (wtVar.u1) {
                                    stVar2.evaluateJavascript("hideControls();", null);
                                }
                                wtVar.b.setTranslationY(0.0f);
                                wtVar.K();
                                break;
                            }
                        } else {
                            c10.b();
                            Objects.requireNonNull(view3);
                            org.telegram.messenger.g0.i3(new ot(0, view3), 300L);
                            break;
                        }
                        break;
                    case 2:
                        wt wtVar2 = this.b;
                        try {
                            ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", wtVar2.z1));
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        Activity activity2 = wtVar2.p1;
                        if (activity2 instanceof LaunchActivity) {
                            ((LaunchActivity) activity2).H0(new k2(17));
                        }
                        wtVar2.dismiss();
                        break;
                    default:
                        wt wtVar3 = this.b;
                        vf.c.t(wtVar3.p1, wtVar3.z1);
                        wtVar3.dismiss();
                        break;
                }
            }
        };
        ImageView imageView2 = new ImageView(activity);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.msg_copy);
        imageView2.setContentDescription(org.telegram.messenger.id.M0(2131751762, null));
        org.telegram.ui.ActionBar.r6.t(imageView2, i17, null, mode);
        org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i18, false), 0, -1);
        org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i18);
        imageView2.setBackground(h04);
        org.telegram.ui.ActionBar.r6.k(imageView2, h04, null, N3, null);
        linearLayout2.addView(imageView2, c8.ha.e(48, 48, 51));
        imageView2.setOnClickListener(onClickListener);
        TextView textView4 = new TextView(activity);
        this.r1 = textView4;
        textView4.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(textView4, i17, null);
        textView4.setGravity(17);
        textView4.setSingleLine(true);
        textView4.setEllipsize(truncateAt);
        org.telegram.ui.Cells.y h05 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i18, false), 0, -1);
        org.telegram.ui.ActionBar.n6 N4 = org.telegram.ui.ActionBar.r6.N(i18);
        textView4.setBackground(h05);
        org.telegram.ui.ActionBar.r6.k(textView4, h05, null, N4, null);
        textView4.setPadding(org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(f10), 0);
        textView4.setText(org.telegram.messenger.id.M0(2131751767, null).toUpperCase());
        textView4.setTypeface(org.telegram.messenger.g0.o());
        linearLayout.addView(textView4, c8.ha.e(-2, -1, 51));
        textView4.setOnClickListener(onClickListener);
        TextView textView5 = new TextView(activity);
        textView5.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(textView5, i17, null);
        textView5.setGravity(17);
        textView5.setSingleLine(true);
        textView5.setEllipsize(truncateAt);
        org.telegram.ui.Cells.y h06 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i18, false), 0, -1);
        org.telegram.ui.ActionBar.n6 N5 = org.telegram.ui.ActionBar.r6.N(i18);
        textView5.setBackground(h06);
        org.telegram.ui.ActionBar.r6.k(textView5, h06, null, N5, null);
        textView5.setPadding(org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(f10), 0);
        textView5.setText(org.telegram.messenger.id.M0(2131747799, null).toUpperCase());
        textView5.setTypeface(org.telegram.messenger.g0.o());
        linearLayout.addView(textView5, c8.ha.e(-2, -1, 51));
        final int i21 = 3;
        textView5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.nt
            public final /* synthetic */ wt b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i21) {
                    case 0:
                        this.b.dismiss();
                        break;
                    case 1:
                        wt wtVar = this.b;
                        st stVar2 = wtVar.i1;
                        ti.o c10 = l2.i.d().c();
                        if (c10 == null) {
                            if (wtVar.o1.getVisibility() != 0) {
                                wtVar.O0(stVar2, wtVar.x1, wtVar.y1);
                                if (wtVar.u1) {
                                    stVar2.evaluateJavascript("hideControls();", null);
                                }
                                wtVar.b.setTranslationY(0.0f);
                                wtVar.K();
                                break;
                            }
                        } else {
                            c10.b();
                            Objects.requireNonNull(view3);
                            org.telegram.messenger.g0.i3(new ot(0, view3), 300L);
                            break;
                        }
                        break;
                    case 2:
                        wt wtVar2 = this.b;
                        try {
                            ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", wtVar2.z1));
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        Activity activity2 = wtVar2.p1;
                        if (activity2 instanceof LaunchActivity) {
                            ((LaunchActivity) activity2).H0(new k2(17));
                        }
                        wtVar2.dismiss();
                        break;
                    default:
                        wt wtVar3 = this.b;
                        vf.c.t(wtVar3.p1, wtVar3.z1);
                        wtVar3.dismiss();
                        break;
                }
            }
        });
        boolean z10 = l71.a(str4) || l71.a(str3);
        l71Var.setVisibility(z10 ? 0 : 4);
        if (z10) {
            h71 h71Var = l71Var.f0;
            h71Var.setVisibility(4);
            i12 = 0;
            h71Var.d(false, false);
            l71Var.j(true, false);
        } else {
            i12 = 0;
        }
        this.y0 = new ut(this, z10);
        this.w1 = new pt(i12, org.telegram.messenger.t0.b, this);
        String e10 = l71.e(str4);
        if (e10 != null || !z10) {
            radialProgressView.setVisibility(i12);
            stVar.setVisibility(i12);
            linearLayout2.setVisibility(i12);
            if (e10 != null) {
                view.setVisibility(i12);
            }
            textView4.setVisibility(4);
            stVar.setKeepScreenOn(true);
            l71Var.setVisibility(4);
            l71Var.getControlsView().setVisibility(4);
            l71Var.getTextureView().setVisibility(4);
            if (l71Var.getTextureImageView() != null) {
                l71Var.getTextureImageView().setVisibility(4);
            }
            if (e10 != null && "disabled".equals(org.telegram.messenger.qp.s1(this.a).A3)) {
                imageView.setVisibility(8);
            }
        }
        if (this.w1.canDetectOrientation()) {
            this.w1.enable();
        } else {
            this.w1.disable();
            this.w1 = null;
        }
        O1 = this;
    }

    public static ki0 I0(wt wtVar, boolean z9, float f10) {
        ti.o oVar;
        ti.i iVar;
        RectF rectF = new RectF();
        if (z9 || (oVar = wtVar.J1) == null || (iVar = oVar.e) == null) {
            ti.i.j(rectF, 1000, Math.round(1000.0f / f10));
        } else {
            iVar.g(rectF);
        }
        ki0 ki0Var = new ki0();
        ki0Var.a = rectF.left;
        ki0Var.b = rectF.top;
        ki0Var.c = rectF.width();
        ki0Var.d = rectF.height();
        return ki0Var;
    }

    public static void N0(org.telegram.ui.ActionBar.f2 f2Var, org.telegram.messenger.ij ijVar, org.telegram.ui.nq0 nq0Var, String str, String str2, String str3, String str4, int i7, int i10, int i11, boolean z9) {
        TLRPC.MessageMedia messageMedia;
        wt wtVar = O1;
        if (wtVar != null) {
            wtVar.K0();
        }
        if (((ijVar == null || (messageMedia = ijVar.k.media) == null || messageMedia.webpage == null) ? null : l71.e(str4)) != null) {
            PhotoViewer.p1().H2(null, f2Var, null);
            PhotoViewer.p1().c2(ijVar, null, null, null, null, null, null, 0, nq0Var, null, 0L, 0L, 0L, true, null, Integer.valueOf(i11));
        } else {
            wt wtVar2 = new wt(f2Var.getParentActivity(), str, str2, str3, str4, i7, i10, i11);
            wtVar2.h0 = z9;
            wtVar2.n = z9;
            wtVar2.show();
        }
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final boolean G() {
        l71 l71Var = this.j1;
        return (l71Var.getVisibility() == 0 && l71Var.T) ? false : true;
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final boolean H() {
        return this.l1.getVisibility() != 0;
    }

    public final void J0() {
        ti.o oVar = this.J1;
        if (oVar != null) {
            this.J1 = null;
            oVar.a(new di.e(12));
            oVar.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void K() {
        super.K();
        pt ptVar = this.w1;
        if (ptVar != null) {
            ptVar.disable();
            this.w1 = null;
        }
    }

    public final void K0() {
        st stVar = this.i1;
        if (stVar != null && stVar.getVisibility() == 0) {
            this.s1.removeView(stVar);
            stVar.stopLoading();
            stVar.loadUrl("about:blank");
            stVar.destroy();
        }
        ti.o oVar = this.J1;
        if (oVar != null) {
            this.J1 = null;
            oVar.b();
        }
        l71 l71Var = this.j1;
        if (l71Var != null) {
            l71Var.b();
        }
        O1 = null;
        K();
    }

    public final void L0() {
        ImageView imageView;
        if (this.i1 == null || !M0()) {
            return;
        }
        if (this.K1 != this.i1) {
            l71 l71Var = this.j1;
            if (!l71Var.U || (imageView = l71Var.d0) == null) {
                return;
            }
            imageView.callOnClick();
            return;
        }
        if (org.telegram.messenger.t0.x) {
            try {
                this.p1.startService(new Intent(org.telegram.messenger.t0.b, (Class<?>) BringAppForegroundService.class));
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
            }
        }
        if (this.u1) {
            this.i1.evaluateJavascript("showControls();", null);
        }
        ViewGroup viewGroup = (ViewGroup) this.i1.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this.i1);
        }
        this.s1.addView(this.i1, 0, c8.ha.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (this.A1 ? 22 : 0) + 84));
        this.e0 = true;
        show();
        J0();
    }

    public final boolean M0() {
        ti.o oVar = this.J1;
        return oVar != null && oVar.e();
    }

    public final void O0(View view, int i7, int i10) {
        ti.o c10 = l2.i.d().c();
        if (c10 != null) {
            c10.b();
        }
        this.K1 = view;
        this.L1 = i7;
        this.M1 = i10;
        ti.o k10 = l2.i.d().k(this.N1);
        this.J1 = k10;
        k10.g(this.p1, null, true);
    }

    public final void P0() {
        l71 l71Var = this.j1;
        View aspectRatioView = l71Var.getAspectRatioView();
        int[] iArr = this.v1;
        aspectRatioView.getLocationInWindow(iArr);
        iArr[0] = iArr[0] - S();
        if (!l71Var.f() && !this.F1) {
            TextureView textureView = l71Var.getTextureView();
            textureView.setTranslationX(iArr[0]);
            textureView.setTranslationY(iArr[1]);
            ImageView textureImageView = l71Var.getTextureImageView();
            if (textureImageView != null) {
                textureImageView.setTranslationX(iArr[0]);
                textureImageView.setTranslationY(iArr[1]);
            }
        }
        View controlsView = l71Var.getControlsView();
        if (controlsView.getParent() == this.c) {
            controlsView.setTranslationY(iArr[1]);
        } else {
            controlsView.setTranslationY(0.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void c0(Configuration configuration) {
        l71 l71Var = this.j1;
        if (l71Var.getVisibility() == 0 && l71Var.x && !l71Var.f()) {
            if (configuration.orientation == 2) {
                boolean z9 = l71Var.T;
                if (z9 || z9) {
                    return;
                }
                l71Var.T = true;
                l71Var.m();
                l71Var.l(false);
                return;
            }
            boolean z10 = l71Var.T;
            if (z10 && z10) {
                l71Var.T = false;
                l71Var.m();
                l71Var.l(false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void d0() {
        int i7 = this.G1;
        if (i7 != 0) {
            int i10 = i7 - 1;
            this.G1 = i10;
            if (i10 != 0) {
                this.c.invalidate();
                return;
            }
            l71 l71Var = this.j1;
            TextureView textureView = l71Var.d;
            ImageView imageView = l71Var.e;
            if (imageView != null) {
                try {
                    int width = textureView.getWidth();
                    int height = textureView.getHeight();
                    Bitmap.Config config = Bitmap.Config.ARGB_8888;
                    Bitmap c10 = org.telegram.messenger.as.c(width, height);
                    l71Var.h = c10;
                    l71Var.n.getBitmap(c10);
                } catch (Throwable th2) {
                    Bitmap bitmap = l71Var.h;
                    if (bitmap != null) {
                        bitmap.recycle();
                        l71Var.h = null;
                    }
                    org.telegram.messenger.a8.g(th2, true);
                }
                if (l71Var.h != null) {
                    imageView.setVisibility(0);
                    imageView.setImageBitmap(l71Var.h);
                } else {
                    imageView.setImageDrawable(null);
                }
            }
            J0();
        }
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void g0(float f10) {
        P0();
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final boolean k0(View view, int i7, int i10, int i11, int i12) {
        if (view != this.j1.getControlsView()) {
            return false;
        }
        P0();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final boolean l0(View view, int i7, int i10) {
        l71 l71Var = this.j1;
        if (view == l71Var.getControlsView()) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = l71Var.getMeasuredWidth();
            layoutParams.height = l71Var.getAspectRatioView().getMeasuredHeight() + (l71Var.T ? 0 : org.telegram.messenger.g0.L(10.0f));
        }
        return false;
    }
}
