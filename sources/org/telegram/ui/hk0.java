package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class hk0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hk0(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    private final void a(View view) {
        ug.i0 i0Var = (ug.i0) this.b;
        Context context = (Context) this.c;
        org.telegram.ui.ActionBar.f2 f2Var = i0Var.C2;
        int i7 = i0Var.Z1;
        if (i7 == 11 || i7 == 34) {
            return;
        }
        int i10 = 0;
        if (i7 != 19 && i7 != 32 && !i0Var.s1()) {
            if (i7 == 18 || i7 == 20 || i7 == 24 || i7 == 25 || i7 == 26 || i7 == 29 || i7 == 22 || i7 == 23 || i7 == 21 || i7 == 27 || i7 == 28 || i7 == 30 || i7 == 35) {
                org.telegram.messenger.g0.g(i0Var.k1());
                i0Var.dismiss();
                return;
            }
            if (org.telegram.messenger.p10.i(i0Var.a).q() || org.telegram.messenger.qp.s1(i0Var.a).D3() || i0Var.F2) {
                i0Var.dismiss();
                return;
            } else {
                if (f2Var == null) {
                    return;
                }
                if (f2Var.getVisibleDialog() != null) {
                    f2Var.getVisibleDialog().dismiss();
                }
                f2Var.presentFragment(new PremiumPreviewFragment(0, ug.i0.u1(i7)));
                i0Var.dismiss();
                return;
            }
        }
        org.telegram.messenger.e3 e3Var = i0Var.U1;
        if (e3Var.b) {
            if (org.telegram.messenger.p10.i(i0Var.a).q() && wg.r.i()) {
                wg.h.i(i0Var.S1, i0Var);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i0Var.I0);
            String M0 = org.telegram.messenger.id.M0(2131747032, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(i0Var.r1() ? 2131747030 : 2131747031, null));
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131752152, null), new ug.w(i0Var, i10));
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), new s0.b(28));
            alertDialog$Builder.p();
            return;
        }
        boolean z9 = e3Var.a;
        int i11 = 1;
        if (z9 && e3Var.c == 0) {
            if (!e3Var.e || !wg.r.i()) {
                i0Var.i1();
                return;
            }
            i0Var.X1 = true;
            i0Var.p2.d0 = false;
            org.telegram.ui.ActionBar.f2 f2Var2 = i0Var.o1;
            org.telegram.messenger.e3 e3Var2 = i0Var.U1;
            wg.q0 q0Var = new wg.q0(f2Var2, e3Var2.h, e3Var2.k);
            q0Var.show();
            q0Var.H0 = new bi.eb(i0Var, 13);
            return;
        }
        if (!z9) {
            int i12 = e3Var.f;
            if (i12 != 0) {
                wg.h.g(i12);
                return;
            }
            return;
        }
        FrameLayout frameLayout = new FrameLayout(i0Var.getContext());
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(i0Var.getContext());
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
        frameLayout.addView(l9Var, c8.ha.c(60.0f, 60));
        frameLayout.setClipChildren(false);
        Paint paint = new Paint(1);
        paint.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.h5, false));
        frameLayout.addView(new fi.p5(i0Var.getContext(), paint, i0Var.getContext().getDrawable(R.drawable.filled_limit_boost)), c8.ha.d(28, 28.0f, 0, 34.0f, 34.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(i0Var.getContext());
        imageView.setImageResource(R.drawable.msg_arrow_avatar);
        org.telegram.ui.ActionBar.s6.s(imageView, org.telegram.ui.ActionBar.l6.m6, null, PorterDuff.Mode.SRC_ATOP);
        frameLayout.addView(imageView, c8.ha.e(24, 24, 17));
        org.telegram.ui.Components.l9 l9Var2 = new org.telegram.ui.Components.l9(i0Var.getContext());
        l9Var2.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
        frameLayout.addView(l9Var2, c8.ha.d(60, 60.0f, 0, 96.0f, 0.0f, 0.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(i0Var.getContext());
        frameLayout2.addView(frameLayout, c8.ha.e(-2, 60, 1));
        frameLayout2.setClipChildren(false);
        TextView textView = new TextView(context);
        textView.setLetterSpacing(0.025f);
        org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.j5, null);
        textView.setTextSize(1, 16.0f);
        frameLayout2.addView(textView, c8.ha.t(-1, -2, 0, 24, 80, 24, 0));
        org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.g6) null);
        TLRPC.Chat M02 = org.telegram.messenger.qp.s1(i0Var.a).M0(Long.valueOf(-i0Var.U1.c));
        w8Var.q(M02);
        l9Var.e(M02, w8Var);
        org.telegram.ui.Components.w8 w8Var2 = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.g6) null);
        TLRPC.Chat M03 = org.telegram.messenger.qp.s1(i0Var.a).M0(Long.valueOf(-i0Var.S1));
        w8Var2.q(M03);
        l9Var2.e(M03, w8Var2);
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
        alertDialog$Builder2.o(frameLayout2);
        org.telegram.messenger.k5.r("ReplaceBoostChannelDescription", null, 2131746270, new Object[]{M02.title, M03.title}, textView);
        alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131746272, null), new ug.w(i0Var, i11));
        alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, null), new s0.b(29));
        alertDialog$Builder2.p();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        a8.r7 r7Var;
        boolean z9;
        View view2;
        FrameLayout frameLayout;
        tg.z1 j3;
        int i7 = 9;
        int i10 = 5;
        int i11 = 2;
        h9.f1 f1Var = null;
        int i12 = 0;
        switch (this.a) {
            case 0:
                jl0.m0((jl0) this.b, (String) this.c, view);
                return;
            case 1:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                org.telegram.ui.Components.l60 l60Var = (org.telegram.ui.Components.l60) this.c;
                if (photoViewer.S4 == null) {
                    return;
                }
                l60Var.u();
                org.telegram.ui.ActionBar.f2 f2Var = photoViewer.l4;
                if (f2Var instanceof cn) {
                    ((cn) f2Var).la(photoViewer.S4, false, true);
                }
                vf.c.s(photoViewer.E, Uri.parse(photoViewer.S4.R0), true, false, false, null, null, false, org.telegram.messenger.qp.s1(photoViewer.T).d6, false, false);
                return;
            case 2:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                Activity activity = (Activity) this.c;
                Drawable[] drawableArr = PhotoViewer.Y8;
                if (photoViewer2.F1() || photoViewer2.r) {
                    return;
                }
                int i13 = photoViewer2.O4;
                if (i13 >= 0 && i13 < photoViewer2.f7.size()) {
                    Object obj = photoViewer2.f7.get(photoViewer2.O4);
                    if (obj instanceof org.telegram.messenger.gf) {
                        org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) obj;
                        if (!gfVar.b || gfVar.d()) {
                            gfVar.z = Boolean.valueOf(!gfVar.c());
                            photoViewer2.j1.setPhotoState(gfVar.c());
                            boolean c10 = gfVar.c();
                            fi.m3 m3Var = photoViewer2.k1;
                            if (m3Var != null) {
                                m3Var.f(true);
                                photoViewer2.k1 = null;
                            }
                            if (photoViewer2.E != null) {
                                photoViewer2.k1 = new fi.m3(photoViewer2.E, 3);
                                SpannableStringBuilder append = new SpannableStringBuilder("x ").append((CharSequence) org.telegram.messenger.id.M0(c10 ? 2131747261 : 2131747260, null));
                                append.setSpan(new org.telegram.ui.Components.wp(c10 ? R.drawable.menu_quality_hd_filled : R.drawable.menu_quality_sd_filled, 0), 0, 1, 33);
                                photoViewer2.k1.u(append);
                                photoViewer2.e0.addView(photoViewer2.k1, c8.ha.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 48.0f));
                                photoViewer2.k1.setTranslationY(photoViewer2.P0.getTranslationY());
                                photoViewer2.k1.p(0.0f, (photoViewer2.j1.getWidth() / 2.0f) + photoViewer2.j1.getX() + photoViewer2.H0.getX());
                                fi.m3 m3Var2 = photoViewer2.k1;
                                m3Var2.q0 = new wg(i11, m3Var2);
                                m3Var2.d = 3500L;
                                m3Var2.w();
                            }
                            org.telegram.messenger.iz.h1 = gfVar.c();
                            org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit().putBoolean("photoHighQualityDefault", org.telegram.messenger.iz.h1).apply();
                            return;
                        }
                    }
                }
                if (photoViewer2.j1.getTag() != null) {
                    photoViewer2.V2(true);
                    photoViewer2.m2(1);
                    return;
                }
                if (photoViewer2.j8) {
                    if (photoViewer2.m1 == null) {
                        rq0 rq0Var = photoViewer2.e0;
                        org.telegram.ui.Components.e01 e01Var = new org.telegram.ui.Components.e01(activity);
                        e01Var.d = new org.telegram.ui.Components.kr0(e01Var, 15);
                        e01Var.setBackgroundDrawable(org.telegram.ui.ActionBar.l6.d0(org.telegram.messenger.g0.L(3.0f), -871296751));
                        e01Var.setTextColor(-1);
                        e01Var.setTextSize(1, 14.0f);
                        e01Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(7.0f));
                        e01Var.setGravity(16);
                        rq0Var.addView(e01Var, c8.ha.d(-2, -2.0f, 51, 5.0f, 0.0f, 5.0f, 3.0f));
                        e01Var.setVisibility(8);
                        photoViewer2.m1 = e01Var;
                    }
                    photoViewer2.m1.setText(org.telegram.messenger.id.M0(2131743586, "VideoQualityIsTooLow"));
                    org.telegram.ui.Components.e01 e01Var2 = photoViewer2.m1;
                    org.telegram.ui.Components.g51 g51Var = photoViewer2.j1;
                    org.telegram.ui.Components.kr0 kr0Var = e01Var2.d;
                    if (g51Var == null) {
                        return;
                    }
                    e01Var2.a = g51Var;
                    e01Var2.a();
                    e01Var2.c = true;
                    org.telegram.messenger.g0.r(kr0Var);
                    org.telegram.messenger.g0.i3(kr0Var, 2000L);
                    ViewPropertyAnimator viewPropertyAnimator = e01Var2.b;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.setListener(null);
                        e01Var2.b.cancel();
                        e01Var2.b = null;
                    }
                    if (e01Var2.getVisibility() != 0) {
                        e01Var2.setAlpha(0.0f);
                        e01Var2.setVisibility(0);
                        ViewPropertyAnimator listener = e01Var2.animate().setDuration(300L).alpha(1.0f).setListener(null);
                        e01Var2.b = listener;
                        listener.start();
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ((org.telegram.ui.Components.l60) this.b).K((org.telegram.ui.Components.l60) this.c);
                return;
            case 4:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                ((AlertDialog$Builder) this.c).a.L0.run();
                Integer num = (Integer) view.getTag();
                int i14 = num.intValue() == 0 ? 30 : num.intValue() == 1 ? 90 : num.intValue() == 2 ? org.telegram.messenger.qs.M2 : num.intValue() == 3 ? 365 : num.intValue() == 4 ? 548 : num.intValue() == 5 ? 730 : 0;
                org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, privacySettingsActivity.getParentActivity(), null);
                u1Var.i0 = false;
                u1Var.show();
                TL_account.setAccountTTL setaccountttl = new TL_account.setAccountTTL();
                TLRPC.TL_accountDaysTTL tL_accountDaysTTL = new TLRPC.TL_accountDaysTTL();
                setaccountttl.ttl = tL_accountDaysTTL;
                tL_accountDaysTTL.days = i14;
                privacySettingsActivity.getConnectionsManager().sendRequest(setaccountttl, new no0(privacySettingsActivity, u1Var, setaccountttl, i11));
                return;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                TL_fragment.TL_collectibleInfo tL_collectibleInfo = (TL_fragment.TL_collectibleInfo) this.c;
                RectF rectF = ProfileActivity.V6;
                profileActivity.getClass();
                org.telegram.ui.Components.cc.e();
                vf.c.t(profileActivity.getParentActivity(), tL_collectibleInfo.url);
                return;
            case 6:
                ProfileActivity profileActivity2 = (ProfileActivity) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                long j10 = profileActivity2.d1;
                long j11 = profileActivity2.D1;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = chat.default_banned_rights;
                TLRPC.ChannelParticipant channelParticipant = profileActivity2.F2;
                mp mpVar = new mp(j10, j11, null, tL_chatBannedRights, channelParticipant != null ? channelParticipant.banned_rights : null, "", 1, true, false, null);
                mpVar.X0 = new av0(profileActivity2, chat, mpVar);
                profileActivity2.presentFragment(mpVar);
                return;
            case 7:
                yx0 yx0Var = (yx0) this.b;
                Context context = (Context) this.c;
                StringBuilder sb2 = new StringBuilder();
                String obj2 = yx0Var.a[0].getText().toString();
                String obj3 = yx0Var.a[3].getText().toString();
                String obj4 = yx0Var.a[2].getText().toString();
                String obj5 = yx0Var.a[1].getText().toString();
                String obj6 = yx0Var.a[4].getText().toString();
                try {
                    if (yx0Var.w == 3) {
                        n2.n0 a10 = ui.a.a();
                        a10.p(yx0Var.w);
                        if (obj2 == null) {
                            obj2 = "";
                        }
                        a10.c = obj2;
                        if (obj6 == null) {
                            obj6 = "";
                        }
                        a10.f = obj6;
                        yx0Var.b0(context, a10.d().e());
                        return;
                    }
                    if (!TextUtils.isEmpty(obj2)) {
                        sb2.append("server=");
                        sb2.append(URLEncoder.encode(obj2, "UTF-8"));
                    }
                    if (!TextUtils.isEmpty(obj5)) {
                        if (sb2.length() != 0) {
                            sb2.append("&");
                        }
                        sb2.append("port=");
                        sb2.append(URLEncoder.encode(obj5, "UTF-8"));
                    }
                    if (yx0Var.w == 2) {
                        str = "https://t.me/proxy?";
                        if (sb2.length() != 0) {
                            sb2.append("&");
                        }
                        sb2.append("secret=");
                        sb2.append(URLEncoder.encode(obj6, "UTF-8"));
                    } else {
                        str = "https://t.me/socks?";
                        if (!TextUtils.isEmpty(obj4)) {
                            if (sb2.length() != 0) {
                                sb2.append("&");
                            }
                            sb2.append("user=");
                            sb2.append(URLEncoder.encode(obj4, "UTF-8"));
                        }
                        if (!TextUtils.isEmpty(obj3)) {
                            if (sb2.length() != 0) {
                                sb2.append("&");
                            }
                            sb2.append("pass=");
                            sb2.append(URLEncoder.encode(obj3, "UTF-8"));
                        }
                    }
                    if (sb2.length() == 0) {
                        return;
                    }
                    StringBuilder m10 = com.google.android.recaptcha.internal.a.m(str);
                    m10.append(sb2.toString());
                    yx0Var.b0(context, m10.toString());
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 8:
                i01 i01Var = (i01) this.b;
                Context context2 = (Context) this.c;
                if (i01Var.x != null) {
                    return;
                }
                boolean[] zArr = new boolean[1];
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                nk0 nk0Var = new nk0(13, i01Var, zArr);
                Pattern pattern = org.telegram.ui.Components.v4.a;
                if (context2 != null) {
                    int x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.j5, false);
                    int x03 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.h5, false);
                    org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.xj, false);
                    org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Bj, false);
                    org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.E8, false);
                    org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.G8, false);
                    org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.i6, false);
                    int x04 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Gi, false);
                    int x05 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Ci, false);
                    int x06 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Ei, false);
                    h9.f1 f1Var2 = new h9.f1(context2, (org.telegram.ui.ActionBar.g6) null);
                    ((org.telegram.ui.ActionBar.v2) f1Var2.b).v0 = false;
                    org.telegram.ui.Components.ib0 ib0Var = new org.telegram.ui.Components.ib0(context2, null);
                    ib0Var.setTextColor(x02);
                    ib0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
                    ib0Var.setItemCount(5);
                    org.telegram.ui.Components.c4 c4Var = new org.telegram.ui.Components.c4(context2, null);
                    c4Var.setItemCount(5);
                    c4Var.setTextColor(x02);
                    c4Var.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
                    org.telegram.ui.Components.d4 d4Var = new org.telegram.ui.Components.d4(context2, null);
                    d4Var.setItemCount(5);
                    d4Var.setTextColor(x02);
                    d4Var.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
                    org.telegram.ui.Components.p3 p3Var = new org.telegram.ui.Components.p3(context2, ib0Var, c4Var, d4Var, 4);
                    org.telegram.ui.Components.d4 d4Var2 = d4Var;
                    p3Var.setOrientation(1);
                    FrameLayout frameLayout2 = new FrameLayout(context2);
                    p3Var.addView(frameLayout2, c8.ha.t(-1, -2, 51, 22, 0, 0, 4));
                    TextView textView = new TextView(context2);
                    textView.setText(org.telegram.messenger.id.M0(2131745526, null));
                    textView.setTextColor(x02);
                    com.google.android.recaptcha.internal.a.q(textView, 1, 20.0f);
                    frameLayout2.addView(textView, c8.ha.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                    textView.setOnTouchListener(new ei.b(10));
                    LinearLayout linearLayout = new LinearLayout(context2);
                    linearLayout.setOrientation(0);
                    linearLayout.setWeightSum(1.0f);
                    p3Var.addView(linearLayout, c8.ha.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                    Calendar calendar = Calendar.getInstance();
                    bi.md mdVar = new bi.md(context2, 17);
                    linearLayout.addView(ib0Var, c8.ha.l(0.5f, 0, org.telegram.messenger.qs.t4));
                    ib0Var.setMinValue(0);
                    ib0Var.setMaxValue(365);
                    ib0Var.setWrapSelectorWheel(false);
                    ib0Var.setFormatter(new br(8));
                    a3.h hVar = new a3.h(ib0Var, c4Var, d4Var2, 19);
                    ib0Var.setOnValueChangedListener(hVar);
                    c4Var.setMinValue(0);
                    c4Var.setMaxValue(23);
                    linearLayout.addView(c4Var, c8.ha.l(0.2f, 0, org.telegram.messenger.qs.t4));
                    c4Var.setFormatter(new br(9));
                    c4Var.setOnValueChangedListener(hVar);
                    d4Var2.setMinValue(0);
                    d4Var2.setMaxValue(59);
                    d4Var2.setValue(0);
                    d4Var2.setFormatter(new br(11));
                    linearLayout.addView(d4Var2, c8.ha.l(0.3f, 0, org.telegram.messenger.qs.t4));
                    d4Var2.setOnValueChangedListener(hVar);
                    if (currentTimeMillis > 0 && currentTimeMillis != 2147483646) {
                        long j12 = currentTimeMillis * 1000;
                        calendar.setTimeInMillis(System.currentTimeMillis());
                        calendar.set(12, 0);
                        calendar.set(13, 0);
                        calendar.set(14, 0);
                        calendar.set(11, 0);
                        int timeInMillis = (int) ((j12 - calendar.getTimeInMillis()) / 86400000);
                        calendar.setTimeInMillis(j12);
                        if (timeInMillis >= 0) {
                            d4Var2 = d4Var2;
                            d4Var2.setValue(calendar.get(12));
                            c4Var.setValue(calendar.get(11));
                            ib0Var.setValue(timeInMillis);
                        } else {
                            d4Var2 = d4Var2;
                        }
                    }
                    org.telegram.ui.Components.d4 d4Var3 = d4Var2;
                    org.telegram.ui.Components.v4.g(null, null, 0L, 0L, 0, ib0Var, c4Var, d4Var3);
                    mdVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                    mdVar.setGravity(17);
                    mdVar.setTextColor(x04);
                    mdVar.setTextSize(1, 14.0f);
                    mdVar.setTypeface(org.telegram.messenger.g0.o());
                    int L = org.telegram.messenger.g0.L(8.0f);
                    mdVar.setBackgroundDrawable(org.telegram.ui.ActionBar.l6.k0(L, L, L, L, x05, x06, x06));
                    mdVar.setText(org.telegram.messenger.id.M0(2131745528, null));
                    p3Var.addView(mdVar, c8.ha.t(-1, 48, 83, 16, 15, 16, 16));
                    f1Var = f1Var2;
                    mdVar.setOnClickListener(new org.telegram.ui.Components.n1(ib0Var, c4Var, d4Var3, calendar, nk0Var, f1Var2, 0));
                    org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) f1Var.b;
                    v2Var.N = p3Var;
                    v2Var.show();
                    v2Var.v0(x03);
                    v2Var.O(x03);
                }
                bi.u3 u3Var = new bi.u3(i01Var, zArr, 13);
                org.telegram.ui.ActionBar.v2 v2Var2 = (org.telegram.ui.ActionBar.v2) f1Var.b;
                v2Var2.H0 = u3Var;
                v2Var2.show();
                i01Var.x = v2Var2;
                i01Var.c(false);
                return;
            case 9:
                e21 e21Var = (e21) this.b;
                bi.f4 f4Var = (bi.f4) this.c;
                if (e21Var.R1.g() == 0) {
                    return;
                }
                f4Var.a(new ArrayList(e21Var.S1.values()));
                e21Var.dismiss();
                return;
            case 10:
                SessionsActivity sessionsActivity = (SessionsActivity) this.b;
                ((AlertDialog$Builder) this.c).a.L0.run();
                Integer num2 = (Integer) view.getTag();
                int i15 = num2.intValue() == 0 ? 7 : num2.intValue() == 1 ? 90 : num2.intValue() == 2 ? org.telegram.messenger.qs.N2 : num2.intValue() == 3 ? 365 : 0;
                TL_account.setAuthorizationTTL setauthorizationttl = new TL_account.setAuthorizationTTL();
                setauthorizationttl.authorization_ttl_days = i15;
                sessionsActivity.s = i15;
                a31 a31Var = sessionsActivity.a;
                if (a31Var != null) {
                    a31Var.f();
                }
                sessionsActivity.getConnectionsManager().sendRequest(setauthorizationttl, new di.v5(i7));
                return;
            case 11:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.b;
                editTextBoldCursor.setText(bi.dd.P0(((Long) this.c).longValue()));
                editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                return;
            case 12:
                h41 h41Var = (h41) this.b;
                a51 a51Var = (a51) this.c;
                d51 d51Var = h41Var.d0;
                d51Var.getOrCreateStoryViewer().I(d51Var.getParentActivity(), a51Var.b(), d51Var.C0, di.i7.a(d51Var.S));
                return;
            case 13:
                l41 l41Var = (l41) this.b;
                ng.f fVar = (ng.f) this.c;
                int i16 = l41Var.c;
                m41 m41Var = l41Var.d;
                org.telegram.ui.Components.lz lzVar = l41Var.a;
                if (lzVar.c) {
                    ArrayList arrayList = m41Var.n;
                    lg.g gVar = m41Var.c;
                    int size = arrayList.size();
                    int i17 = 0;
                    while (true) {
                        if (i17 >= size) {
                            i12 = 1;
                        } else if (i17 == i16 || !((l41) arrayList.get(i17)).a.c || !((l41) arrayList.get(i17)).a.b) {
                            i17++;
                        }
                    }
                    m41Var.f();
                    if (i12 != 0) {
                        org.telegram.messenger.g0.F3(lzVar);
                        return;
                    }
                    lzVar.setChecked(!lzVar.b);
                    fVar.n = lzVar.b;
                    m41Var.b.z();
                    if (m41Var.r.c <= 0 || i16 >= gVar.d.size()) {
                        return;
                    }
                    ((ng.f) gVar.d.get(i16)).n = lzVar.b;
                    gVar.z();
                    return;
                }
                return;
            case 14:
                z71 z71Var = (z71) this.b;
                Context context3 = (Context) this.c;
                if (z71Var.getParentActivity() == null) {
                    return;
                }
                h9.f1 f1Var3 = new h9.f1(z71Var.getParentActivity(), (org.telegram.ui.ActionBar.g6) null);
                ((org.telegram.ui.ActionBar.v2) f1Var3.b).v0 = false;
                LinearLayout f10 = org.telegram.messenger.k5.f(context3, 1);
                TextView textView2 = new TextView(context3);
                textView2.setText(org.telegram.messenger.id.M0(2131752112, null));
                org.telegram.messenger.k5.n(textView2, org.telegram.ui.ActionBar.l6.j5, null, 1, 20.0f);
                f10.addView(textView2, c8.ha.t(-1, -2, 51, 22, 12, 22, 4));
                textView2.setOnTouchListener(new ei.b(2));
                ((org.telegram.ui.ActionBar.v2) f1Var3.b).N = f10;
                ArrayList arrayList2 = new ArrayList();
                int size2 = org.telegram.ui.ActionBar.l6.F.size();
                while (i12 < size2) {
                    org.telegram.ui.ActionBar.k6 k6Var = (org.telegram.ui.ActionBar.k6) org.telegram.ui.ActionBar.l6.F.get(i12);
                    TLRPC.TL_theme tL_theme = k6Var.F;
                    if (tL_theme == null || tL_theme.document != null) {
                        arrayList2.add(k6Var);
                    }
                    i12++;
                }
                e61 e61Var = new e61(context3, z71Var, arrayList2, new ArrayList(), f1Var3);
                f10.addView(e61Var, c8.ha.k(0.0f, 7.0f, 0.0f, 1.0f, -1, org.telegram.messenger.qs.e2));
                e61Var.A1(z71Var.fragmentView.getMeasuredWidth());
                z71Var.showDialog((org.telegram.ui.ActionBar.v2) f1Var3.b);
                return;
            case 15:
                ic1 ic1Var = (ic1) this.b;
                Context context4 = (Context) this.c;
                wg.f1 f1Var4 = ic1Var.M;
                if (f1Var4 != null) {
                    f1Var4.dismiss();
                    ic1Var.M = null;
                }
                wg.f1 f1Var5 = new wg.f1(context4, ic1Var.a, null, 4, new di.i0());
                TLRPC.User user = ic1Var.c;
                long j13 = user != null ? user.id : 0L;
                TLRPC.User user2 = ic1Var.d;
                long[] jArr = {j13, user2 != null ? user2.id : 0L};
                for (int i18 = 0; i18 < 2; i18++) {
                    f1Var5.u2.add(Long.valueOf(jArr[i18]));
                }
                f1Var5.o1(false, true);
                f1Var5.v2 = new jh.b(i10);
                ic1Var.M = f1Var5;
                f1Var5.show();
                return;
            case 16:
                org.telegram.ui.Wallet.z1 z1Var = (org.telegram.ui.Wallet.z1) this.b;
                org.telegram.ui.Wallet.x2 x2Var = (org.telegram.ui.Wallet.x2) this.c;
                if (z1Var.m) {
                    return;
                }
                x2Var.dismiss();
                return;
            case 17:
                fi.d dVar = (fi.d) this.b;
                org.telegram.ui.Wallet.y2 y2Var = (org.telegram.ui.Wallet.y2) this.c;
                if (dVar.Q) {
                    return;
                }
                y2Var.dismiss();
                return;
            case 18:
                org.telegram.ui.Wallet.n3 n3Var = (org.telegram.ui.Wallet.n3) this.b;
                org.telegram.ui.ActionBar.f2 f2Var2 = (org.telegram.ui.ActionBar.f2) this.c;
                if (!n3Var.e || n3Var.R) {
                    return;
                }
                org.telegram.ui.Wallet.w5.J0(f2Var2.getCurrentAccount(), n3Var.getContext(), f2Var2.getResourceProvider());
                return;
            case 19:
                org.telegram.ui.Wallet.u4 u4Var = (org.telegram.ui.Wallet.u4) this.b;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) this.c;
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T == null) {
                    return;
                }
                u4Var.dismiss();
                org.telegram.ui.Wallet.v9 v9Var = new org.telegram.ui.Wallet.v9();
                v9Var.n0(nftitem);
                T.presentFragment(v9Var);
                return;
            case 20:
                Runnable runnable = (Runnable) this.b;
                org.telegram.ui.Wallet.y2[] y2VarArr = (org.telegram.ui.Wallet.y2[]) this.c;
                runnable.run();
                y2VarArr[0].dismiss();
                return;
            case 21:
                org.telegram.ui.Wallet.w5.l0((org.telegram.ui.Wallet.w5) this.b, (Context) this.c, view);
                return;
            case 22:
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) this.b;
                TextView textView3 = (TextView) this.c;
                c2Var.c(!c2Var.b(), true);
                textView3.setVisibility(c2Var.b() ? 0 : 8);
                return;
            case 23:
                fi.d dVar2 = (fi.d) this.b;
                int[] iArr = (int[]) this.c;
                if (dVar2.Q || (r7Var = yc1.d) == null) {
                    return;
                }
                dVar2.setLoading(true);
                Context applicationContext = view.getContext().getApplicationContext();
                try {
                    byte[] h = r7Var.h();
                    b9.j0 j0Var = new b9.j0(applicationContext, com.google.android.gms.common.api.i.c);
                    String str2 = (String) r7Var.d;
                    com.google.android.gms.common.api.internal.n0 n0Var = j0Var.i;
                    b9.g0 g0Var = new b9.g0(n0Var, str2, "/tg-wear-auth/answer", h);
                    n0Var.b.d(0, g0Var);
                    q6.m.m(g0Var, b9.i0.a).addOnSuccessListener(new a7(r7Var, dVar2, iArr, 24)).addOnFailureListener(new wc1(dVar2, 0));
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    dVar2.setLoading(false);
                    return;
                }
            case 24:
                org.telegram.ui.web.j jVar = (org.telegram.ui.web.j) this.b;
                x xVar = (x) this.c;
                jVar.b = true;
                xVar.run();
                jVar.x.f3.O(true);
                return;
            case 25:
                sg.q qVar = (sg.q) this.b;
                Context context5 = (Context) this.c;
                androidx.activity.n nVar = qVar.o1;
                switch (nVar.a) {
                    case 1:
                        z9 = nVar.b;
                        break;
                    default:
                        z9 = nVar.b;
                        break;
                }
                if (z9) {
                    return;
                }
                androidx.activity.n nVar2 = qVar.o1;
                switch (nVar2.a) {
                    case 1:
                        view2 = (fi.x9) nVar2.d;
                        break;
                    default:
                        view2 = (wp0) nVar2.d;
                        break;
                }
                Bitmap N3 = org.telegram.messenger.g0.N3(view2);
                Bitmap createBitmap = Bitmap.createBitmap(N3.getWidth(), N3.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawColor(-16777216);
                androidx.activity.n nVar3 = qVar.o1;
                switch (nVar3.a) {
                    case 1:
                        fi.i5 i5Var = ((fi.x9) nVar3.d).x0;
                        Matrix matrix = i5Var.getMatrix();
                        canvas.save();
                        canvas.translate(i5Var.getX(), i5Var.getY());
                        canvas.concat(matrix);
                        i5Var.getWidth();
                        throw null;
                    default:
                        tg.b0 b0Var = ((wp0) nVar3.d).F0;
                        Matrix matrix2 = b0Var.getMatrix();
                        canvas.save();
                        canvas.translate(b0Var.getX(), b0Var.getY());
                        canvas.concat(matrix2);
                        float width = b0Var.getWidth();
                        Bitmap bitmap = (Bitmap) nVar3.c;
                        canvas.scale(width / bitmap.getWidth(), b0Var.getHeight() / bitmap.getHeight(), 0.0f, 0.0f);
                        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                        canvas.restore();
                        canvas.drawBitmap(N3, 0.0f, 0.0f, (Paint) null);
                        N3.recycle();
                        sg.i iVar = new sg.i(qVar, context5, createBitmap);
                        androidx.activity.n nVar4 = qVar.o1;
                        switch (nVar4.a) {
                            case 1:
                                frameLayout = ((fi.x9) nVar4.d).E0;
                                break;
                            default:
                                frameLayout = ((wp0) nVar4.d).N0;
                                break;
                        }
                        frameLayout.addView(iVar, c8.ha.c(-1.0f, -1));
                        androidx.activity.n nVar5 = qVar.o1;
                        Objects.requireNonNull(nVar5);
                        iVar.setColorListener(new bi.q9(nVar5, i10));
                        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                        duration.setInterpolator(org.telegram.ui.Components.xq.f);
                        duration.addUpdateListener(new fi.v3(iVar, 27));
                        duration.start();
                        androidx.activity.n nVar6 = qVar.o1;
                        switch (nVar6.a) {
                            case 1:
                                nVar6.b = true;
                                break;
                            default:
                                nVar6.b = true;
                                break;
                        }
                        qVar.dismiss();
                        return;
                }
            case 26:
                org.telegram.ui.Components.bn.i0((cn) this.c, 41026, new ii.c((sh.c) this.b, 21), null);
                return;
            case 27:
                tg.c2 c2Var2 = (tg.c2) this.b;
                fi.nb nbVar = (fi.nb) this.c;
                tg.z1[] z1VarArr = c2Var2.H;
                if (z1VarArr == null || z1VarArr.length == 0 || c2Var2.I == null || (j3 = c2Var2.j(c2Var2.n0, c2Var2.o0)) == null) {
                    return;
                }
                nbVar.a(j3);
                return;
            case 28:
                a(view);
                return;
            default:
                wg.q0 q0Var = (wg.q0) this.b;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.c;
                ArrayList arrayList3 = q0Var.P1;
                if (arrayList3.isEmpty()) {
                    return;
                }
                wg.d0 d0Var = q0Var.S1;
                if (d0Var.Q) {
                    return;
                }
                d0Var.setLoading(true);
                ArrayList arrayList4 = new ArrayList();
                HashSet hashSet = new HashSet();
                int size3 = arrayList3.size();
                while (i12 < size3) {
                    Object obj7 = arrayList3.get(i12);
                    i12++;
                    TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) obj7;
                    arrayList4.add(Integer.valueOf(tL_myBoost.slot));
                    hashSet.add(Long.valueOf(org.telegram.messenger.m5.o(tL_myBoost.peer)));
                }
                wg.r.a(chat2.id, arrayList4, new di.s2(q0Var, chat2, arrayList4, hashSet, 17), new ii.c(q0Var, 28));
                return;
        }
    }
}
