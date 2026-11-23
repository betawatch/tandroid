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
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class jg0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jg0(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    private final void a(View view) {
        ug.k0 k0Var = (ug.k0) this.b;
        Context context = (Context) this.c;
        org.telegram.ui.ActionBar.g2 g2Var = k0Var.G2;
        int i7 = k0Var.d2;
        if (i7 == 11 || i7 == 34) {
            return;
        }
        int i10 = 0;
        if (i7 != 19 && i7 != 32 && !k0Var.t1()) {
            if (i7 == 18 || i7 == 20 || i7 == 24 || i7 == 25 || i7 == 26 || i7 == 29 || i7 == 22 || i7 == 23 || i7 == 21 || i7 == 27 || i7 == 28 || i7 == 30 || i7 == 35) {
                org.telegram.messenger.g0.g(k0Var.l1());
                k0Var.dismiss();
                return;
            }
            if (org.telegram.messenger.k10.i(k0Var.a).q() || org.telegram.messenger.np.u1(k0Var.a).K3() || k0Var.J2) {
                k0Var.dismiss();
                return;
            } else {
                if (g2Var == null) {
                    return;
                }
                if (g2Var.getVisibleDialog() != null) {
                    g2Var.getVisibleDialog().dismiss();
                }
                g2Var.presentFragment(new PremiumPreviewFragment(0, ug.k0.v1(i7)));
                k0Var.dismiss();
                return;
            }
        }
        org.telegram.messenger.g3 g3Var = k0Var.Y1;
        if (g3Var.b) {
            if (org.telegram.messenger.k10.i(k0Var.a).q() && wg.s.i()) {
                wg.h.i(k0Var.W1, k0Var);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, k0Var.J0);
            String N0 = org.telegram.messenger.hd.N0(2131746838, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            t1Var.S = N0;
            t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(k0Var.s1() ? 2131746836 : 2131746837, null));
            alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131752140, null), new ug.w(k0Var, i10));
            alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), new ug.x(0));
            alertDialog$Builder.p();
            return;
        }
        boolean z10 = g3Var.a;
        int i11 = 1;
        if (z10 && g3Var.c == 0) {
            if (!g3Var.e || !wg.s.i()) {
                k0Var.j1();
                return;
            }
            k0Var.b2 = true;
            k0Var.t2.e0 = false;
            org.telegram.ui.ActionBar.g2 g2Var2 = k0Var.s1;
            org.telegram.messenger.g3 g3Var2 = k0Var.Y1;
            wg.q0 q0Var = new wg.q0(g2Var2, g3Var2.h, g3Var2.k);
            q0Var.show();
            q0Var.I0 = new di.u9(k0Var, 13);
            return;
        }
        if (!z10) {
            int i12 = g3Var.f;
            if (i12 != 0) {
                wg.h.g(i12);
                return;
            }
            return;
        }
        FrameLayout frameLayout = new FrameLayout(k0Var.getContext());
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(k0Var.getContext());
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
        frameLayout.addView(q9Var, c8.ma.c(60.0f, 60));
        frameLayout.setClipChildren(false);
        Paint paint = new Paint(1);
        paint.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.h5, false));
        frameLayout.addView(new hi.l5(k0Var.getContext(), paint, k0Var.getContext().getDrawable(R.drawable.filled_limit_boost)), c8.ma.d(28, 28.0f, 0, 34.0f, 34.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(k0Var.getContext());
        imageView.setImageResource(R.drawable.msg_arrow_avatar);
        org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.m6, null, PorterDuff.Mode.SRC_ATOP);
        frameLayout.addView(imageView, c8.ma.e(24, 24, 17));
        org.telegram.ui.Components.q9 q9Var2 = new org.telegram.ui.Components.q9(k0Var.getContext());
        q9Var2.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
        frameLayout.addView(q9Var2, c8.ma.d(60, 60.0f, 0, 96.0f, 0.0f, 0.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(k0Var.getContext());
        frameLayout2.addView(frameLayout, c8.ma.e(-2, 60, 1));
        frameLayout2.setClipChildren(false);
        TextView textView = new TextView(context);
        textView.setLetterSpacing(0.025f);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.j5, null);
        textView.setTextSize(1, 16.0f);
        frameLayout2.addView(textView, c8.ma.t(-1, -2, 0, 24, 80, 24, 0));
        org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
        TLRPC.Chat O0 = org.telegram.messenger.np.u1(k0Var.a).O0(Long.valueOf(-k0Var.Y1.c));
        b9Var.q(O0);
        q9Var.f(O0, b9Var);
        org.telegram.ui.Components.b9 b9Var2 = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
        TLRPC.Chat O02 = org.telegram.messenger.np.u1(k0Var.a).O0(Long.valueOf(-k0Var.W1));
        b9Var2.q(O02);
        q9Var2.f(O02, b9Var2);
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
        alertDialog$Builder2.o(frameLayout2);
        org.telegram.messenger.f3.q("ReplaceBoostChannelDescription", null, 2131746074, new Object[]{O0.title, O02.title}, textView);
        alertDialog$Builder2.k(org.telegram.messenger.hd.N0(2131746076, null), new ug.w(k0Var, i11));
        alertDialog$Builder2.h(org.telegram.messenger.hd.N0(2131752577, null), new ug.x(1));
        alertDialog$Builder2.p();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        a8.r7 r7Var;
        boolean z10;
        View view2;
        FrameLayout frameLayout;
        tg.c2 j3;
        int i7 = 16;
        int i10 = 5;
        int i11 = 4;
        int i12 = 2;
        hi.w4 w4Var = null;
        int i13 = 0;
        switch (this.a) {
            case 0:
                mg0 mg0Var = (mg0) this.b;
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) this.c;
                og0 og0Var = mg0Var.d;
                if (og0Var.g0(gjVar)) {
                    return;
                }
                og0Var.getOrCreateStoryViewer().L(og0Var.getParentActivity(), gjVar.l, fi.y6.a(og0Var.f));
                return;
            case 1:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                passcodeActivity.getClass();
                atomicBoolean.set(!atomicBoolean.get());
                int selectionStart = passcodeActivity.h.getSelectionStart();
                int selectionEnd = passcodeActivity.h.getSelectionEnd();
                passcodeActivity.h.setInputType((atomicBoolean.get() ? org.telegram.messenger.ls.a2 : 128) | 1);
                passcodeActivity.h.setSelection(selectionStart, selectionEnd);
                org.telegram.ui.ActionBar.t6.s(passcodeActivity.s, atomicBoolean.get() ? org.telegram.ui.ActionBar.m6.l6 : org.telegram.ui.ActionBar.m6.H6, null, PorterDuff.Mode.SRC_ATOP);
                return;
            case 2:
                ml0.m0((ml0) this.b, (String) this.c, view);
                return;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                org.telegram.ui.Components.a70 a70Var = (org.telegram.ui.Components.a70) this.c;
                if (photoViewer.T4 == null) {
                    return;
                }
                a70Var.v();
                org.telegram.ui.ActionBar.g2 g2Var = photoViewer.m4;
                if (g2Var instanceof bn) {
                    ((bn) g2Var).ma(photoViewer.T4, false, true);
                }
                vf.c.s(photoViewer.F, Uri.parse(photoViewer.T4.T0), true, false, false, null, null, false, org.telegram.messenger.np.u1(photoViewer.U).g6, false, false);
                return;
            case 4:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                Activity activity = (Activity) this.c;
                Drawable[] drawableArr = PhotoViewer.Z8;
                if (photoViewer2.F1() || photoViewer2.r) {
                    return;
                }
                int i14 = photoViewer2.P4;
                if (i14 >= 0 && i14 < photoViewer2.g7.size()) {
                    Object obj = photoViewer2.g7.get(photoViewer2.P4);
                    if (obj instanceof org.telegram.messenger.ff) {
                        org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) obj;
                        if (!ffVar.b || ffVar.d()) {
                            ffVar.z = Boolean.valueOf(!ffVar.c());
                            photoViewer2.k1.setPhotoState(ffVar.c());
                            boolean c10 = ffVar.c();
                            hi.l3 l3Var = photoViewer2.l1;
                            if (l3Var != null) {
                                l3Var.f(true);
                                photoViewer2.l1 = null;
                            }
                            if (photoViewer2.F != null) {
                                photoViewer2.l1 = new hi.l3(photoViewer2.F, 3);
                                SpannableStringBuilder append = new SpannableStringBuilder("x ").append((CharSequence) org.telegram.messenger.hd.N0(c10 ? 2131747067 : 2131747066, null));
                                append.setSpan(new org.telegram.ui.Components.nq(c10 ? R.drawable.menu_quality_hd_filled : R.drawable.menu_quality_sd_filled, 0), 0, 1, 33);
                                photoViewer2.l1.v(append);
                                photoViewer2.f0.addView(photoViewer2.l1, c8.ma.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 48.0f));
                                photoViewer2.l1.setTranslationY(photoViewer2.Q0.getTranslationY());
                                photoViewer2.l1.p(0.0f, (photoViewer2.k1.getWidth() / 2.0f) + photoViewer2.k1.getX() + photoViewer2.I0.getX());
                                hi.l3 l3Var2 = photoViewer2.l1;
                                l3Var2.r0 = new sg(i12, l3Var2);
                                l3Var2.d = 3500L;
                                l3Var2.x();
                            }
                            org.telegram.messenger.cz.h1 = ffVar.c();
                            org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit().putBoolean("photoHighQualityDefault", org.telegram.messenger.cz.h1).apply();
                            return;
                        }
                    }
                }
                if (photoViewer2.k1.getTag() != null) {
                    photoViewer2.W2(true);
                    photoViewer2.n2(1);
                    return;
                }
                if (photoViewer2.k8) {
                    if (photoViewer2.n1 == null) {
                        qq0 qq0Var = photoViewer2.f0;
                        org.telegram.ui.Components.o01 o01Var = new org.telegram.ui.Components.o01(activity);
                        o01Var.d = new org.telegram.ui.Components.cp0(o01Var, 18);
                        o01Var.setBackgroundDrawable(org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(3.0f), -871296751));
                        o01Var.setTextColor(-1);
                        o01Var.setTextSize(1, 14.0f);
                        o01Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(7.0f));
                        o01Var.setGravity(16);
                        qq0Var.addView(o01Var, c8.ma.d(-2, -2.0f, 51, 5.0f, 0.0f, 5.0f, 3.0f));
                        o01Var.setVisibility(8);
                        photoViewer2.n1 = o01Var;
                    }
                    photoViewer2.n1.setText(org.telegram.messenger.hd.N0(2131743341, "VideoQualityIsTooLow"));
                    org.telegram.ui.Components.o01 o01Var2 = photoViewer2.n1;
                    org.telegram.ui.Components.v51 v51Var = photoViewer2.k1;
                    org.telegram.ui.Components.cp0 cp0Var = o01Var2.d;
                    if (v51Var == null) {
                        return;
                    }
                    o01Var2.a = v51Var;
                    o01Var2.a();
                    o01Var2.c = true;
                    org.telegram.messenger.g0.r(cp0Var);
                    org.telegram.messenger.g0.h3(cp0Var, 2000L);
                    ViewPropertyAnimator viewPropertyAnimator = o01Var2.b;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.setListener(null);
                        o01Var2.b.cancel();
                        o01Var2.b = null;
                    }
                    if (o01Var2.getVisibility() != 0) {
                        o01Var2.setAlpha(0.0f);
                        o01Var2.setVisibility(0);
                        ViewPropertyAnimator listener = o01Var2.animate().setDuration(300L).alpha(1.0f).setListener(null);
                        o01Var2.b = listener;
                        listener.start();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                ((org.telegram.ui.Components.a70) this.b).L((org.telegram.ui.Components.a70) this.c);
                return;
            case 6:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                ((AlertDialog$Builder) this.c).a.M0.run();
                Integer num = (Integer) view.getTag();
                int i15 = num.intValue() == 0 ? 30 : num.intValue() == 1 ? 90 : num.intValue() == 2 ? org.telegram.messenger.ls.M2 : num.intValue() == 3 ? 365 : num.intValue() == 4 ? 548 : num.intValue() == 5 ? 730 : 0;
                org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, privacySettingsActivity.getParentActivity(), null);
                t1Var.j0 = false;
                t1Var.show();
                TL_account.setAccountTTL setaccountttl = new TL_account.setAccountTTL();
                TLRPC.TL_accountDaysTTL tL_accountDaysTTL = new TLRPC.TL_accountDaysTTL();
                setaccountttl.ttl = tL_accountDaysTTL;
                tL_accountDaysTTL.days = i15;
                privacySettingsActivity.getConnectionsManager().sendRequest(setaccountttl, new mo0(privacySettingsActivity, t1Var, setaccountttl, i12));
                return;
            case 7:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                TL_fragment.TL_collectibleInfo tL_collectibleInfo = (TL_fragment.TL_collectibleInfo) this.c;
                RectF rectF = ProfileActivity.Z6;
                profileActivity.getClass();
                org.telegram.ui.Components.gc.e();
                vf.c.t(profileActivity.getParentActivity(), tL_collectibleInfo.url);
                return;
            case 8:
                ProfileActivity profileActivity2 = (ProfileActivity) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                long j10 = profileActivity2.e1;
                long j11 = profileActivity2.E1;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = chat.default_banned_rights;
                TLRPC.ChannelParticipant channelParticipant = profileActivity2.H2;
                np npVar = new np(j10, j11, null, tL_chatBannedRights, channelParticipant != null ? channelParticipant.banned_rights : null, "", 1, true, false, null);
                npVar.Y0 = new yu0(profileActivity2, chat, npVar);
                profileActivity2.presentFragment(npVar);
                return;
            case 9:
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
                        n2.o0 a10 = xi.a.a();
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
                    StringBuilder m10 = com.google.android.gms.internal.vision.e2.m(str);
                    m10.append(sb2.toString());
                    yx0Var.b0(context, m10.toString());
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 10:
                i01 i01Var = (i01) this.b;
                Context context2 = (Context) this.c;
                if (i01Var.x != null) {
                    return;
                }
                boolean[] zArr = new boolean[1];
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                aj0 aj0Var = new aj0(i7, i01Var, zArr);
                Pattern pattern = org.telegram.ui.Components.c5.a;
                if (context2 != null) {
                    int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.j5, false);
                    int x03 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.h5, false);
                    org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Aj, false);
                    org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ej, false);
                    org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.E8, false);
                    org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.G8, false);
                    org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.i6, false);
                    int x04 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ji, false);
                    int x05 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Fi, false);
                    int x06 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Hi, false);
                    hi.w4 w4Var2 = new hi.w4(context2, (org.telegram.ui.ActionBar.h6) null);
                    ((org.telegram.ui.ActionBar.w2) w4Var2.b).w0 = false;
                    org.telegram.ui.Components.tb0 tb0Var = new org.telegram.ui.Components.tb0(context2, null);
                    tb0Var.setTextColor(x02);
                    tb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
                    tb0Var.setItemCount(5);
                    org.telegram.ui.Components.j4 j4Var = new org.telegram.ui.Components.j4(context2, null);
                    j4Var.setItemCount(5);
                    j4Var.setTextColor(x02);
                    j4Var.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
                    org.telegram.ui.Components.k4 k4Var = new org.telegram.ui.Components.k4(context2, null);
                    k4Var.setItemCount(5);
                    k4Var.setTextColor(x02);
                    k4Var.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
                    org.telegram.ui.Components.w3 w3Var = new org.telegram.ui.Components.w3(context2, tb0Var, j4Var, k4Var, 4);
                    w3Var.setOrientation(1);
                    FrameLayout frameLayout2 = new FrameLayout(context2);
                    w3Var.addView(frameLayout2, c8.ma.t(-1, -2, 51, 22, 0, 0, 4));
                    TextView textView = new TextView(context2);
                    textView.setText(org.telegram.messenger.hd.N0(2131745330, null));
                    textView.setTextColor(x02);
                    i5.c.x(textView, 1, 20.0f);
                    frameLayout2.addView(textView, c8.ma.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                    textView.setOnTouchListener(new gi.a(10));
                    LinearLayout linearLayout = new LinearLayout(context2);
                    linearLayout.setOrientation(0);
                    linearLayout.setWeightSum(1.0f);
                    w3Var.addView(linearLayout, c8.ma.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                    Calendar calendar = Calendar.getInstance();
                    di.xb xbVar = new di.xb(context2, 17);
                    linearLayout.addView(tb0Var, c8.ma.l(0.5f, 0, org.telegram.messenger.ls.t4));
                    tb0Var.setMinValue(0);
                    tb0Var.setMaxValue(365);
                    tb0Var.setWrapSelectorWheel(false);
                    tb0Var.setFormatter(new cr(13));
                    a3.h hVar = new a3.h(tb0Var, j4Var, k4Var, 20);
                    tb0Var.setOnValueChangedListener(hVar);
                    j4Var.setMinValue(0);
                    j4Var.setMaxValue(23);
                    linearLayout.addView(j4Var, c8.ma.l(0.2f, 0, org.telegram.messenger.ls.t4));
                    j4Var.setFormatter(new cr(14));
                    j4Var.setOnValueChangedListener(hVar);
                    k4Var.setMinValue(0);
                    k4Var.setMaxValue(59);
                    k4Var.setValue(0);
                    k4Var.setFormatter(new cr(16));
                    linearLayout.addView(k4Var, c8.ma.l(0.3f, 0, org.telegram.messenger.ls.t4));
                    k4Var.setOnValueChangedListener(hVar);
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
                            k4Var.setValue(calendar.get(12));
                            j4Var.setValue(calendar.get(11));
                            tb0Var.setValue(timeInMillis);
                        }
                    }
                    org.telegram.ui.Components.c5.g(null, null, 0L, 0L, 0, tb0Var, j4Var, k4Var);
                    xbVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                    xbVar.setGravity(17);
                    xbVar.setTextColor(x04);
                    xbVar.setTextSize(1, 14.0f);
                    xbVar.setTypeface(org.telegram.messenger.g0.o());
                    int L = org.telegram.messenger.g0.L(8.0f);
                    xbVar.setBackgroundDrawable(org.telegram.ui.ActionBar.m6.k0(L, L, L, L, x05, x06, x06));
                    xbVar.setText(org.telegram.messenger.hd.N0(2131745332, null));
                    w3Var.addView(xbVar, c8.ma.t(-1, 48, 83, 16, 15, 16, 16));
                    xbVar.setOnClickListener(new org.telegram.ui.Components.w1(tb0Var, j4Var, k4Var, calendar, aj0Var, w4Var2, 0));
                    org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) w4Var2.b;
                    w2Var.O = w3Var;
                    w2Var.show();
                    w2Var.v0(x03);
                    w2Var.P(x03);
                    w4Var = w4Var2;
                }
                di.u1 u1Var = new di.u1(i01Var, zArr, 11);
                org.telegram.ui.ActionBar.w2 w2Var2 = (org.telegram.ui.ActionBar.w2) w4Var.b;
                w2Var2.I0 = u1Var;
                w2Var2.show();
                i01Var.x = w2Var2;
                i01Var.c(false);
                return;
            case 11:
                e21 e21Var = (e21) this.b;
                bi.a5 a5Var = (bi.a5) this.c;
                if (e21Var.V1.g() == 0) {
                    return;
                }
                a5Var.a(new ArrayList(e21Var.W1.values()));
                e21Var.dismiss();
                return;
            case 12:
                SessionsActivity sessionsActivity = (SessionsActivity) this.b;
                ((AlertDialog$Builder) this.c).a.M0.run();
                Integer num2 = (Integer) view.getTag();
                int i16 = num2.intValue() == 0 ? 7 : num2.intValue() == 1 ? 90 : num2.intValue() == 2 ? org.telegram.messenger.ls.N2 : num2.intValue() == 3 ? 365 : 0;
                TL_account.setAuthorizationTTL setauthorizationttl = new TL_account.setAuthorizationTTL();
                setauthorizationttl.authorization_ttl_days = i16;
                sessionsActivity.s = i16;
                a31 a31Var = sessionsActivity.a;
                if (a31Var != null) {
                    a31Var.f();
                }
                sessionsActivity.getConnectionsManager().sendRequest(setauthorizationttl, new fi.l5(9));
                return;
            case 13:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.b;
                editTextBoldCursor.setText(di.pb.P0(((Long) this.c).longValue()));
                editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                return;
            case 14:
                h41 h41Var = (h41) this.b;
                z41 z41Var = (z41) this.c;
                c51 c51Var = h41Var.e0;
                c51Var.getOrCreateStoryViewer().I(c51Var.getParentActivity(), z41Var.b(), c51Var.D0, fi.y6.a(c51Var.T));
                return;
            case 15:
                l41 l41Var = (l41) this.b;
                ng.f fVar = (ng.f) this.c;
                int i17 = l41Var.c;
                m41 m41Var = l41Var.d;
                org.telegram.ui.Components.xz xzVar = l41Var.a;
                if (xzVar.c) {
                    ArrayList arrayList = m41Var.n;
                    lg.g gVar = m41Var.c;
                    int size = arrayList.size();
                    int i18 = 0;
                    while (true) {
                        if (i18 >= size) {
                            i13 = 1;
                        } else if (i18 == i17 || !((l41) arrayList.get(i18)).a.c || !((l41) arrayList.get(i18)).a.b) {
                            i18++;
                        }
                    }
                    m41Var.f();
                    if (i13 != 0) {
                        org.telegram.messenger.g0.D3(xzVar);
                        return;
                    }
                    xzVar.setChecked(!xzVar.b);
                    fVar.n = xzVar.b;
                    m41Var.b.z();
                    if (m41Var.r.c <= 0 || i17 >= gVar.d.size()) {
                        return;
                    }
                    ((ng.f) gVar.d.get(i17)).n = xzVar.b;
                    gVar.z();
                    return;
                }
                return;
            case 16:
                a81 a81Var = (a81) this.b;
                Context context3 = (Context) this.c;
                if (a81Var.getParentActivity() == null) {
                    return;
                }
                hi.w4 w4Var3 = new hi.w4(a81Var.getParentActivity(), (org.telegram.ui.ActionBar.h6) null);
                ((org.telegram.ui.ActionBar.w2) w4Var3.b).w0 = false;
                LinearLayout g10 = org.telegram.messenger.f3.g(context3, 1);
                TextView textView2 = new TextView(context3);
                textView2.setText(org.telegram.messenger.hd.N0(2131752100, null));
                org.telegram.messenger.f3.l(textView2, org.telegram.ui.ActionBar.m6.j5, null, 1, 20.0f);
                g10.addView(textView2, c8.ma.t(-1, -2, 51, 22, 12, 22, 4));
                textView2.setOnTouchListener(new gi.a(2));
                ((org.telegram.ui.ActionBar.w2) w4Var3.b).O = g10;
                ArrayList arrayList2 = new ArrayList();
                int size2 = org.telegram.ui.ActionBar.m6.F.size();
                while (i13 < size2) {
                    org.telegram.ui.ActionBar.l6 l6Var = (org.telegram.ui.ActionBar.l6) org.telegram.ui.ActionBar.m6.F.get(i13);
                    TLRPC.TL_theme tL_theme = l6Var.G;
                    if (tL_theme == null || tL_theme.document != null) {
                        arrayList2.add(l6Var);
                    }
                    i13++;
                }
                e61 e61Var = new e61(context3, a81Var, arrayList2, new ArrayList(), w4Var3);
                g10.addView(e61Var, c8.ma.k(0.0f, 7.0f, 0.0f, 1.0f, -1, org.telegram.messenger.ls.e2));
                e61Var.A1(a81Var.fragmentView.getMeasuredWidth());
                a81Var.showDialog((org.telegram.ui.ActionBar.w2) w4Var3.b);
                return;
            case 17:
                hc1 hc1Var = (hc1) this.b;
                Context context4 = (Context) this.c;
                wg.e1 e1Var = hc1Var.N;
                if (e1Var != null) {
                    e1Var.dismiss();
                    hc1Var.N = null;
                }
                wg.e1 e1Var2 = new wg.e1(context4, hc1Var.a, new fi.h0());
                TLRPC.User user = hc1Var.c;
                long j13 = user != null ? user.id : 0L;
                TLRPC.User user2 = hc1Var.d;
                long[] jArr = {j13, user2 != null ? user2.id : 0L};
                for (int i19 = 0; i19 < 2; i19++) {
                    e1Var2.t2.add(Long.valueOf(jArr[i19]));
                }
                e1Var2.l1(false, true);
                e1Var2.u2 = new jh.b(i10);
                hc1Var.N = e1Var2;
                e1Var2.show();
                return;
            case 18:
                org.telegram.ui.Wallet.h2 h2Var = (org.telegram.ui.Wallet.h2) this.b;
                org.telegram.ui.Wallet.d3 d3Var = (org.telegram.ui.Wallet.d3) this.c;
                if (h2Var.m) {
                    return;
                }
                d3Var.dismiss();
                return;
            case 19:
                hi.e eVar = (hi.e) this.b;
                org.telegram.ui.Wallet.e3 e3Var = (org.telegram.ui.Wallet.e3) this.c;
                if (eVar.R) {
                    return;
                }
                e3Var.dismiss();
                return;
            case 20:
                org.telegram.ui.Wallet.l5 l5Var = (org.telegram.ui.Wallet.l5) this.b;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) this.c;
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T == null) {
                    return;
                }
                l5Var.dismiss();
                org.telegram.ui.Wallet.na naVar = new org.telegram.ui.Wallet.na();
                naVar.n0(nftitem);
                T.presentFragment(naVar);
                return;
            case 21:
                Runnable runnable = (Runnable) this.b;
                org.telegram.ui.Wallet.e3[] e3VarArr = (org.telegram.ui.Wallet.e3[]) this.c;
                runnable.run();
                e3VarArr[0].dismiss();
                return;
            case 22:
                org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) this.b;
                TextView textView3 = (TextView) this.c;
                d2Var.c(!d2Var.b(), true);
                textView3.setVisibility(d2Var.b() ? 0 : 8);
                return;
            case 23:
                hi.e eVar2 = (hi.e) this.b;
                int[] iArr = (int[]) this.c;
                if (eVar2.R || (r7Var = yc1.d) == null) {
                    return;
                }
                eVar2.setLoading(true);
                Context applicationContext = view.getContext().getApplicationContext();
                try {
                    byte[] j14 = r7Var.j();
                    b9.k0 k0Var = new b9.k0(applicationContext, com.google.android.gms.common.api.i.c);
                    String str2 = (String) r7Var.d;
                    com.google.android.gms.common.api.internal.p0 p0Var = k0Var.i;
                    b9.h0 h0Var = new b9.h0(p0Var, str2, "/tg-wear-auth/answer", j14);
                    p0Var.b.d(0, h0Var);
                    q6.m.n(h0Var, b9.j0.a).addOnSuccessListener(new z6(r7Var, eVar2, iArr, 24)).addOnFailureListener(new vc1(eVar2, 0));
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    eVar2.setLoading(false);
                    return;
                }
            case 24:
                org.telegram.ui.web.k kVar = (org.telegram.ui.web.k) this.b;
                w wVar = (w) this.c;
                kVar.b = true;
                wVar.run();
                kVar.x.g3.O(true);
                return;
            case 25:
                sg.q qVar = (sg.q) this.b;
                Context context5 = (Context) this.c;
                androidx.activity.n nVar = qVar.s1;
                switch (nVar.a) {
                    case 1:
                        z10 = nVar.b;
                        break;
                    default:
                        z10 = nVar.b;
                        break;
                }
                if (z10) {
                    return;
                }
                androidx.activity.n nVar2 = qVar.s1;
                switch (nVar2.a) {
                    case 1:
                        view2 = (hi.u9) nVar2.d;
                        break;
                    default:
                        view2 = (vp0) nVar2.d;
                        break;
                }
                Bitmap L3 = org.telegram.messenger.g0.L3(view2);
                Bitmap createBitmap = Bitmap.createBitmap(L3.getWidth(), L3.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawColor(-16777216);
                androidx.activity.n nVar3 = qVar.s1;
                switch (nVar3.a) {
                    case 1:
                        hi.e5 e5Var = ((hi.u9) nVar3.d).y0;
                        Matrix matrix = e5Var.getMatrix();
                        canvas.save();
                        canvas.translate(e5Var.getX(), e5Var.getY());
                        canvas.concat(matrix);
                        e5Var.getWidth();
                        throw null;
                    default:
                        tg.c0 c0Var = ((vp0) nVar3.d).G0;
                        Matrix matrix2 = c0Var.getMatrix();
                        canvas.save();
                        canvas.translate(c0Var.getX(), c0Var.getY());
                        canvas.concat(matrix2);
                        float width = c0Var.getWidth();
                        Bitmap bitmap = (Bitmap) nVar3.c;
                        canvas.scale(width / bitmap.getWidth(), c0Var.getHeight() / bitmap.getHeight(), 0.0f, 0.0f);
                        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                        canvas.restore();
                        canvas.drawBitmap(L3, 0.0f, 0.0f, (Paint) null);
                        L3.recycle();
                        sg.i iVar = new sg.i(qVar, context5, createBitmap);
                        androidx.activity.n nVar4 = qVar.s1;
                        switch (nVar4.a) {
                            case 1:
                                frameLayout = ((hi.u9) nVar4.d).F0;
                                break;
                            default:
                                frameLayout = ((vp0) nVar4.d).O0;
                                break;
                        }
                        frameLayout.addView(iVar, c8.ma.c(-1.0f, -1));
                        androidx.activity.n nVar5 = qVar.s1;
                        Objects.requireNonNull(nVar5);
                        iVar.setColorListener(new bi.r8(nVar5, 6));
                        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                        duration.setInterpolator(org.telegram.ui.Components.nr.f);
                        duration.addUpdateListener(new hi.j3(iVar, 29));
                        duration.start();
                        androidx.activity.n nVar6 = qVar.s1;
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
                org.telegram.ui.Components.tn.i0((bn) this.c, 41026, new hi.s6((sh.b) this.b, 27), null);
                return;
            case 27:
                tg.f2 f2Var = (tg.f2) this.b;
                hi.kb kbVar = (hi.kb) this.c;
                tg.c2[] c2VarArr = f2Var.I;
                if (c2VarArr == null || c2VarArr.length == 0 || f2Var.J == null || (j3 = f2Var.j(f2Var.o0, f2Var.p0)) == null) {
                    return;
                }
                kbVar.a(j3);
                return;
            case 28:
                a(view);
                return;
            default:
                wg.q0 q0Var = (wg.q0) this.b;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.c;
                ArrayList arrayList3 = q0Var.T1;
                if (arrayList3.isEmpty()) {
                    return;
                }
                wg.d0 d0Var = q0Var.W1;
                if (d0Var.R) {
                    return;
                }
                d0Var.setLoading(true);
                ArrayList arrayList4 = new ArrayList();
                HashSet hashSet = new HashSet();
                int size3 = arrayList3.size();
                while (i13 < size3) {
                    Object obj7 = arrayList3.get(i13);
                    i13++;
                    TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) obj7;
                    arrayList4.add(Integer.valueOf(tL_myBoost.slot));
                    hashSet.add(Long.valueOf(org.telegram.messenger.n5.o(tL_myBoost.peer)));
                }
                wg.s.a(chat2.id, arrayList4, new bi.m2(q0Var, chat2, arrayList4, hashSet, 18), new ug.z(q0Var, i11));
                return;
        }
    }
}
