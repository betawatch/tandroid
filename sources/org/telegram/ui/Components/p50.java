package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class p50 extends org.telegram.ui.ActionBar.u2 {
    public static final /* synthetic */ int i2 = 0;
    public int A1;
    public int B1;
    public int C1;
    public int D1;
    public int E1;
    public int F1;
    public int G1;
    public int H1;
    public int I1;
    public int J1;
    public int K1;
    public boolean L1;
    public boolean M1;
    public int N1;
    public final k50 O1;
    public final org.telegram.ui.ActionBar.e2 P1;
    public final c50 Q1;
    public final TextView R1;
    public AnimatorSet S1;
    public final View T1;
    public int U1;
    public boolean V1;
    public final boolean W1;
    public final boolean X1;
    public final ArrayList Y1;
    public final ArrayList Z1;
    public final ArrayList a2;
    public final long b2;
    public final boolean c2;
    public final long d2;
    public org.telegram.ui.ab e2;
    public boolean f2;
    public boolean g2;
    public int h2;
    public final TLRPC.TL_chatInviteExported m1;
    public final HashMap n1;
    public final TLRPC.ChatFull o1;
    public int p1;
    public int q1;
    public int r1;
    public int s1;
    public int t1;
    public int u1;
    public int v1;
    public int w1;
    public int x1;
    public int y1;
    public int z1;

    public p50(final Context context, final TLRPC.TL_chatInviteExported tL_chatInviteExported, final TLRPC.ChatFull chatFull, final HashMap hashMap, final org.telegram.ui.ActionBar.e2 e2Var, final long j3, boolean z10, boolean z11) {
        super(context, false);
        this.Y1 = new ArrayList();
        this.Z1 = new ArrayList();
        this.a2 = new ArrayList();
        this.f2 = true;
        this.g2 = false;
        this.m1 = tL_chatInviteExported;
        this.n1 = hashMap;
        this.P1 = e2Var;
        this.o1 = chatFull;
        this.b2 = j3;
        this.W1 = z10;
        this.c2 = z11;
        int i7 = org.telegram.ui.ActionBar.j6.a7;
        v0(org.telegram.ui.ActionBar.j6.w0(i7, this.J0));
        Q(i7);
        this.h2 = this.H0;
        this.b0 = -1;
        if (hashMap == null) {
            this.n1 = new HashMap();
        }
        this.d2 = ConnectionsManager.getInstance(this.a).getCurrentTime() - (System.currentTimeMillis() / 1000);
        b50 b50Var = new b50(this, context);
        this.b = b50Var;
        b50Var.setWillNotDraw(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 51);
        layoutParams.topMargin = org.telegram.messenger.g0.L(48.0f);
        View view = new View(context);
        this.T1 = view;
        view.setAlpha(0.0f);
        view.setVisibility(4);
        view.setTag(1);
        this.b.addView(view, layoutParams);
        c50 c50Var = new c50(this, context);
        this.Q1 = c50Var;
        c50Var.r1();
        c50Var.setTag(14);
        getContext();
        v4.b0 b0Var = new v4.b0(1, false);
        c50Var.setLayoutManager(b0Var);
        k50 k50Var = new k50(this);
        this.O1 = k50Var;
        c50Var.setAdapter(k50Var);
        c50Var.setVerticalScrollBarEnabled(false);
        c50Var.setClipToPadding(false);
        c50Var.setNestedScrollingEnabled(true);
        c50Var.setOnScrollListener(new d50(this, b0Var));
        c50Var.setOnItemClickListener(new gj0() { // from class: org.telegram.ui.Components.y40
            /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
            /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
            @Override // org.telegram.ui.Components.gj0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void b(int i10, View view2) {
                HashMap hashMap2;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter2;
                TLRPC.User user;
                TLRPC.ChannelParticipant channelParticipant;
                p50 p50Var = p50.this;
                int i11 = p50Var.s1;
                TLRPC.TL_chatInviteExported tL_chatInviteExported2 = tL_chatInviteExported;
                if (i10 == i11 && tL_chatInviteExported2.admin_id == org.telegram.messenger.m10.i(p50Var.a).n) {
                    return;
                }
                int i12 = p50Var.x1;
                boolean z12 = i10 >= i12 && i10 < p50Var.y1;
                int i13 = p50Var.A1;
                boolean z13 = i10 >= i13 && i10 < p50Var.B1;
                int i14 = p50Var.J1;
                boolean z14 = i10 >= i14 && i10 < p50Var.K1;
                if ((i10 != p50Var.s1 && !z12 && !z14) || (hashMap2 = hashMap) == null) {
                    return;
                }
                long j10 = tL_chatInviteExported2.admin_id;
                if (z12) {
                    tL_chatInviteImporter2 = (TLRPC.TL_chatInviteImporter) p50Var.Y1.get(i10 - i12);
                    j10 = tL_chatInviteImporter2.user_id;
                } else if (z13) {
                    tL_chatInviteImporter2 = (TLRPC.TL_chatInviteImporter) p50Var.Z1.get(i10 - i13);
                    j10 = tL_chatInviteImporter2.user_id;
                } else {
                    if (!z14) {
                        tL_chatInviteImporter = null;
                        user = (TLRPC.User) hashMap2.get(Long.valueOf(j10));
                        if (user == null) {
                            org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0).X3(user, false, false);
                            if (!z12 || tL_chatInviteExported2.subscription_pricing == null) {
                                org.telegram.messenger.g0.i3(new yf(p50Var, user, e2Var, 10), 100L);
                                p50Var.dismiss();
                                return;
                            }
                            TLRPC.ChatFull chatFull2 = chatFull;
                            if (chatFull2 != null && chatFull2.participants != null) {
                                for (int i15 = 0; i15 < chatFull2.participants.participants.size(); i15++) {
                                    if (chatFull2.participants.participants.get(i15).user_id == j10 && (chatFull2.participants.participants.get(i15) instanceof TLRPC.TL_chatChannelParticipant)) {
                                        channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatFull2.participants.participants.get(i15)).channelParticipant;
                                        break;
                                    }
                                }
                            }
                            channelParticipant = null;
                            Context context2 = context;
                            long j11 = j3;
                            if (channelParticipant != null) {
                                p50.M0(context2, p50Var.a, -j11, tL_chatInviteExported2.subscription_pricing, tL_chatInviteImporter, channelParticipant, p50Var.J0);
                                return;
                            }
                            org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, context2, null);
                            t1Var.r(120L);
                            org.telegram.messenger.np.s1(p50Var.a).K0(org.telegram.messenger.np.s1(p50Var.a).M0(Long.valueOf(j11)), user, new di.w2(p50Var, t1Var, context2, j11, tL_chatInviteExported2, tL_chatInviteImporter, 2));
                            return;
                        }
                        return;
                    }
                    tL_chatInviteImporter2 = (TLRPC.TL_chatInviteImporter) p50Var.a2.get(i10 - i14);
                    j10 = tL_chatInviteImporter2.user_id;
                }
                tL_chatInviteImporter = tL_chatInviteImporter2;
                user = (TLRPC.User) hashMap2.get(Long.valueOf(j10));
                if (user == null) {
                }
            }
        });
        TextView textView = new TextView(context);
        this.R1 = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setTextSize(1, 20.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(org.telegram.messenger.g0.L(23.0f), 0, org.telegram.messenger.g0.L(23.0f), 0);
        textView.setGravity(16);
        textView.setTypeface(org.telegram.messenger.g0.o());
        if (z10) {
            textView.setText(org.telegram.messenger.hd.M0(2131749149, null));
            this.X1 = false;
            textView.setVisibility(4);
            textView.setAlpha(0.0f);
        } else {
            if (tL_chatInviteExported.expired) {
                textView.setText(org.telegram.messenger.hd.M0(2131750875, null));
            } else if (tL_chatInviteExported.revoked) {
                textView.setText(org.telegram.messenger.hd.M0(2131746014, null));
            } else {
                textView.setText(org.telegram.messenger.hd.M0(2131749149, null));
            }
            this.X1 = true;
        }
        if (!TextUtils.isEmpty(tL_chatInviteExported.title)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
            org.telegram.messenger.j6.l(spannableStringBuilder, textView.getPaint().getFontMetricsInt(), false);
            textView.setText(spannableStringBuilder);
        }
        this.b.addView(c50Var, c8.ja.d(-1, -1.0f, 51, 0.0f, !this.X1 ? 0.0f : 44.0f, 0.0f, 0.0f));
        this.b.addView(textView, c8.ja.d(-1, this.X1 ? 50.0f : 44.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        O0();
        K0();
        if (hashMap == null || hashMap.get(Long.valueOf(tL_chatInviteExported.admin_id)) == null) {
            TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
            tL_users_getUsers.id.add(org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0).o1(tL_chatInviteExported.admin_id));
            ConnectionsManager.getInstance(org.telegram.messenger.m10.t0).sendRequest(tL_users_getUsers, new v1(this, 5));
        }
        updateColors();
    }

    public static void I0(p50 p50Var) {
        View view = p50Var.T1;
        TextView textView = p50Var.R1;
        c50 c50Var = p50Var.Q1;
        if (c50Var.getChildCount() <= 0) {
            int paddingTop = c50Var.getPaddingTop();
            p50Var.U1 = paddingTop;
            c50Var.setTopGlowOffset(paddingTop);
            textView.setTranslationY(p50Var.U1);
            view.setTranslationY(p50Var.U1);
            p50Var.b.invalidate();
            return;
        }
        int i7 = 0;
        View childAt = c50Var.getChildAt(0);
        cj0 cj0Var = (cj0) c50Var.G(childAt);
        int top = childAt.getTop();
        if (top < 0 || cj0Var == null || cj0Var.b() != 0) {
            p50Var.L0(true);
        } else {
            p50Var.L0(false);
            i7 = top;
        }
        if (p50Var.U1 != i7) {
            p50Var.U1 = i7;
            c50Var.setTopGlowOffset(i7);
            if (textView != null) {
                textView.setTranslationY(p50Var.U1);
            }
            view.setTranslationY(p50Var.U1);
            p50Var.b.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r12v3, types: [android.view.View, org.telegram.ui.Components.i9] */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r1v17, types: [android.view.View, org.telegram.ui.Components.vx0] */
    /* JADX WARN: Type inference failed for: r2v13, types: [android.view.View, android.widget.TextView, org.telegram.ui.Components.z70] */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    public static void M0(Context context, int i7, long j3, TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant, org.telegram.ui.ActionBar.e6 e6Var) {
        boolean z10;
        Object obj;
        int i10;
        String str;
        org.telegram.ui.ActionBar.u2 k10 = org.telegram.messenger.k5.k(1, context, e6Var, false);
        org.telegram.ui.ActionBar.u2[] u2VarArr = new org.telegram.ui.ActionBar.u2[1];
        ?? f10 = org.telegram.messenger.k5.f(context, 1);
        f10.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(4.0f));
        f10.setClipChildren(false);
        f10.setClipToPadding(false);
        ?? frameLayout = new FrameLayout(context);
        f10.addView(frameLayout, c8.ja.t(-1, -2, 7, 0, 0, 0, 10));
        ?? i9Var = new i9(context);
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(50.0f));
        t8 t8Var = new t8((org.telegram.ui.ActionBar.e6) null);
        if (j3 >= 0) {
            z10 = 0;
            TLRPC.User a22 = org.telegram.messenger.np.s1(i7).a2(Long.valueOf(j3));
            t8Var.r(a22);
            i9Var.f(a22, t8Var);
        } else {
            z10 = 0;
            TLRPC.Chat M0 = org.telegram.messenger.np.s1(i7).M0(Long.valueOf(-j3));
            t8Var.q(M0);
            i9Var.f(M0, t8Var);
        }
        frameLayout.addView(i9Var, c8.ja.e(100, 100, 17));
        Drawable drawable = context.getResources().getDrawable(R.drawable.star_small_outline);
        int i11 = org.telegram.ui.ActionBar.j6.h5;
        int w02 = org.telegram.ui.ActionBar.j6.w0(i11, e6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
        Drawable drawable2 = context.getResources().getDrawable(R.drawable.star_small_inner);
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(drawable);
        org.telegram.ui.ActionBar.q6.x(imageView, drawable, i11, e6Var, mode);
        frameLayout.addView(imageView, c8.ja.e(28, 28, 17));
        imageView.setTranslationX(org.telegram.messenger.g0.L(34.0f));
        imageView.setTranslationY(org.telegram.messenger.g0.L(35.0f));
        imageView.setScaleX(1.1f);
        imageView.setScaleY(1.1f);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(drawable2);
        frameLayout.addView(imageView2, c8.ja.e(28, 28, 17));
        imageView2.setTranslationX(org.telegram.messenger.g0.L(34.0f));
        imageView2.setTranslationY(org.telegram.messenger.g0.L(35.0f));
        TextView textView = new TextView(context);
        org.telegram.messenger.k5.m(textView, org.telegram.ui.ActionBar.j6.j5, e6Var, 1, 20.0f);
        org.telegram.messenger.k5.l(textView, 17, null, 2131744971);
        TextView f11 = org.telegram.messenger.i20.f(f10, textView, c8.ja.t(-1, -2, 17, 20, 0, 20, 4), context);
        f11.setTextSize(1, 14.0f);
        f11.setGravity(17);
        int i12 = org.telegram.ui.ActionBar.j6.B6;
        org.telegram.ui.ActionBar.q6.U(f11, i12, e6Var);
        int i13 = tL_starsSubscriptionPricing.period;
        if (i13 == 2592000) {
            obj = "min";
            Object[] objArr = new Object[1];
            objArr[z10] = Long.valueOf(tL_starsSubscriptionPricing.amount);
            f11.setText(di.mb.a1(z10, org.telegram.messenger.hd.a0(null, null, 2131744983, objArr), 0.8f, null));
            i10 = i12;
        } else {
            obj = "min";
            boolean z11 = z10;
            Object obj2 = i13 == 300 ? "5min" : obj;
            Locale locale = Locale.US;
            i10 = i12;
            Object[] objArr2 = new Object[2];
            objArr2[z11 ? 1 : 0] = Long.valueOf(tL_starsSubscriptionPricing.amount);
            objArr2[1] = obj2;
            f11.setText(di.mb.a1(z11, String.format(locale, "⭐%1$d/%2$s", objArr2), 0.8f, null));
        }
        TextView f12 = org.telegram.messenger.i20.f(f10, f11, c8.ja.t(-1, -2, 17, 20, 0, 20, 4), context);
        f12.setTextSize(1, 14.0f);
        f12.setGravity(17);
        org.telegram.ui.ActionBar.q6.U(f12, i10, e6Var);
        int i14 = tL_starsSubscriptionPricing.period;
        if (i14 == 2592000) {
            f12.setText(org.telegram.messenger.hd.a0(null, null, 2131745058, org.telegram.messenger.r1.i().f((int) ((tL_starsSubscriptionPricing.amount / 1000.0d) * org.telegram.messenger.np.s1(i7).d6), "USD")));
        } else {
            f12.setText(String.format(Locale.US, "appx. %1$s per %2$s", org.telegram.messenger.r1.i().f((int) (org.telegram.messenger.np.s1(i7).d6 * (tL_starsSubscriptionPricing.amount / 1000.0d)), "USD"), i14 == 300 ? "5min" : obj));
        }
        f10.addView(f12, c8.ja.t(-1, -2, 17, 20, 0, 20, 4));
        ?? vx0Var = new vx0(context, e6Var);
        ?? z70Var = new z70(context, e6Var);
        z70Var.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        z70Var.setEllipsize(TextUtils.TruncateAt.END);
        int i15 = org.telegram.ui.ActionBar.j6.Xc;
        org.telegram.ui.ActionBar.q6.U(z70Var, i15, e6Var);
        org.telegram.ui.ActionBar.q6.G(z70Var, i15, e6Var);
        z70Var.setTextSize(1, 14.0f);
        z70Var.setSingleLine(true);
        z70Var.setDisablePaddingsOffsetY(true);
        org.telegram.ui.f5 f5Var = new org.telegram.ui.f5(24.0f, i7, z70Var);
        TLRPC.User a23 = org.telegram.messenger.np.s1(i7).a2(Long.valueOf(tL_chatInviteImporter.user_id));
        boolean z12 = a23 == null;
        String p10 = org.telegram.messenger.q10.p(a23);
        f5Var.e(a23);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) p10));
        spannableStringBuilder.setSpan(f5Var, 0, 1, 33);
        spannableStringBuilder.setSpan(new e50(u2VarArr, tL_chatInviteImporter), 3, spannableStringBuilder.length(), 33);
        z70Var.setText(spannableStringBuilder);
        if (z12) {
            str = null;
        } else {
            str = null;
            vx0Var.l(z70Var, org.telegram.messenger.hd.M0(2131745059, null));
        }
        vx0Var.c(org.telegram.messenger.hd.M0(2131745054, str), org.telegram.messenger.hd.a0(null, null, 2131742783, org.telegram.messenger.hd.E0().s0().format(new Date(tL_chatInviteImporter.date * 1000)), org.telegram.messenger.hd.E0().p0().format(new Date(tL_chatInviteImporter.date * 1000))), null, null);
        int currentTime = ConnectionsManager.getInstance(i7).getCurrentTime();
        if (channelParticipant != null) {
            vx0Var.c(org.telegram.messenger.hd.M0(channelParticipant.subscription_until_date > currentTime ? 2131745055 : 2131745057, null), org.telegram.messenger.hd.a0(null, null, 2131742783, org.telegram.messenger.hd.E0().s0().format(new Date(channelParticipant.subscription_until_date * 1000)), org.telegram.messenger.hd.E0().p0().format(new Date(channelParticipant.subscription_until_date * 1000))), null, null);
        }
        f10.addView(vx0Var, c8.ja.k(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
        z70 z70Var2 = new z70(context, e6Var);
        org.telegram.ui.ActionBar.q6.U(z70Var2, org.telegram.ui.ActionBar.j6.z6, e6Var);
        org.telegram.ui.ActionBar.q6.G(z70Var2, i15, e6Var);
        z70Var2.setTextSize(1, 14.0f);
        z70Var2.setText(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131744926, null), new u10(context, 1)));
        z70Var2.setGravity(17);
        f10.addView(z70Var2, c8.ja.k(14.0f, 15.0f, 14.0f, 15.0f, -1, -2));
        hi.d dVar = new hi.d(context, e6Var, true);
        dVar.i(org.telegram.messenger.hd.M0(2131747831, null), false, true);
        f10.addView(dVar, c8.ja.o(-1, 48));
        dVar.setOnClickListener(new h2(u2VarArr, 2));
        k10.O = f10;
        u2VarArr[0] = k10;
        k10.U0 = false;
        k10.O();
        u2VarArr[0].show();
    }

    public static void N0(View view) {
        if (view instanceof org.telegram.ui.Cells.n4) {
            ((org.telegram.ui.Cells.n4) view).getTextView().setTextColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.L6, false));
            return;
        }
        if (view instanceof t70) {
            ((t70) view).f();
        } else if (view instanceof org.telegram.ui.Cells.y8) {
            org.telegram.ui.ActionBar.q6.U(((org.telegram.ui.Cells.y8) view).getTextView(), org.telegram.ui.ActionBar.j6.B6, null);
        } else if (view instanceof org.telegram.ui.Cells.pa) {
            ((org.telegram.ui.Cells.pa) view).i(0);
        }
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final boolean H() {
        return false;
    }

    public final void J0() {
        TextView textView = this.R1;
        if (textView != null) {
            try {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.j5, false));
                textView.setLinkTextColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.k5, false));
                textView.setHighlightColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.l5, false));
                if (!this.X1) {
                    textView.setBackgroundColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.d6, false));
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        c50 c50Var = this.Q1;
        if (c50Var != null) {
            c50Var.setGlowColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.A5, false));
        }
        View view = this.T1;
        if (view != null) {
            view.setBackgroundColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.V5, false));
        }
    }

    public final void K0() {
        final boolean z10;
        final boolean z11;
        if (this.L1) {
            return;
        }
        TLRPC.TL_chatInviteExported tL_chatInviteExported = this.m1;
        int i7 = tL_chatInviteExported.usage;
        ArrayList arrayList = this.Y1;
        boolean z12 = i7 > arrayList.size();
        int i10 = tL_chatInviteExported.subscription_expired;
        ArrayList arrayList2 = this.Z1;
        final boolean z13 = i10 > arrayList2.size();
        boolean z14 = tL_chatInviteExported.request_needed;
        ArrayList arrayList3 = this.a2;
        final boolean z15 = z14 && tL_chatInviteExported.requested > arrayList3.size();
        if (z12) {
            z11 = false;
            z10 = false;
        } else if (z13) {
            z11 = false;
            z10 = true;
        } else {
            if (!z15) {
                return;
            }
            z10 = false;
            z11 = true;
        }
        final ArrayList arrayList4 = z11 ? arrayList3 : z10 ? arrayList2 : arrayList;
        TLRPC.TL_messages_getChatInviteImporters tL_messages_getChatInviteImporters = new TLRPC.TL_messages_getChatInviteImporters();
        tL_messages_getChatInviteImporters.flags |= 2;
        tL_messages_getChatInviteImporters.link = tL_chatInviteExported.link;
        tL_messages_getChatInviteImporters.peer = org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0).j1(-this.b2);
        tL_messages_getChatInviteImporters.requested = z11;
        tL_messages_getChatInviteImporters.subscription_expired = z10;
        if (arrayList4.isEmpty()) {
            tL_messages_getChatInviteImporters.offset_user = new TLRPC.TL_inputUserEmpty();
        } else {
            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) arrayList4.get(arrayList4.size() - 1);
            tL_messages_getChatInviteImporters.offset_user = org.telegram.messenger.np.s1(this.a).q1((TLRPC.User) this.n1.get(Long.valueOf(tL_chatInviteImporter.user_id)));
            tL_messages_getChatInviteImporters.offset_date = tL_chatInviteImporter.date;
        }
        this.L1 = true;
        ConnectionsManager.getInstance(org.telegram.messenger.m10.t0).sendRequest(tL_messages_getChatInviteImporters, new RequestDelegate() { // from class: org.telegram.ui.Components.z40
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final p50 p50Var = p50.this;
                final ArrayList arrayList5 = arrayList4;
                final boolean z16 = z11;
                final boolean z17 = z10;
                final boolean z18 = z15;
                final boolean z19 = z13;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.Components.a50
                    /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
                    
                        if (r4.size() < r1.count) goto L25;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
                    
                        r5 = false;
                     */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void run() {
                        p50 p50Var2 = p50.this;
                        if (tL_error == null) {
                            TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) tLObject;
                            ArrayList<TLRPC.TL_chatInviteImporter> arrayList6 = tL_messages_chatInviteImporters.importers;
                            ArrayList arrayList7 = arrayList5;
                            arrayList7.addAll(arrayList6);
                            for (int i11 = 0; i11 < tL_messages_chatInviteImporters.users.size(); i11++) {
                                TLRPC.User user = tL_messages_chatInviteImporters.users.get(i11);
                                p50Var2.n1.put(Long.valueOf(user.id), user);
                            }
                            boolean z20 = true;
                            if (!z16) {
                                boolean z21 = z17;
                                boolean z22 = z18;
                                if (z21) {
                                    p50Var2.M1 = z20;
                                    p50Var2.O0();
                                } else {
                                    p50Var2.M1 = z20;
                                    p50Var2.O0();
                                }
                            }
                        }
                        p50Var2.L1 = false;
                    }
                });
            }
        });
    }

    public final void L0(boolean z10) {
        View view = this.T1;
        if ((!z10 || view.getTag() == null) && (z10 || view.getTag() != null)) {
            return;
        }
        view.setTag(z10 ? null : 1);
        TextView textView = this.R1;
        if (z10) {
            view.setVisibility(0);
            textView.setVisibility(0);
        }
        AnimatorSet animatorSet = this.S1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.S1 = animatorSet2;
        Property property = View.ALPHA;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, z10 ? 1.0f : 0.0f));
        if (!this.X1) {
            this.S1.playTogether(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, z10 ? 1.0f : 0.0f));
        }
        this.S1.setDuration(150L);
        this.S1.addListener(new org.telegram.ui.nn(13, this, z10));
        this.S1.start();
    }

    public final void O0() {
        boolean z10 = false;
        this.N1 = 0;
        this.t1 = -1;
        this.u1 = -1;
        this.v1 = -1;
        this.w1 = -1;
        this.x1 = -1;
        this.y1 = -1;
        this.F1 = -1;
        this.G1 = -1;
        this.C1 = -1;
        this.D1 = -1;
        this.H1 = -1;
        this.I1 = -1;
        this.J1 = -1;
        this.K1 = -1;
        this.E1 = -1;
        this.p1 = -1;
        this.q1 = -1;
        this.z1 = -1;
        this.A1 = -1;
        this.B1 = -1;
        boolean z11 = true;
        if (!this.W1) {
            this.C1 = 0;
            this.N1 = 2;
            this.D1 = 1;
        }
        TLRPC.TL_chatInviteExported tL_chatInviteExported = this.m1;
        if (tL_chatInviteExported.subscription_pricing != null) {
            int i7 = this.N1;
            this.p1 = i7;
            this.N1 = i7 + 2;
            this.q1 = i7 + 1;
        }
        int i10 = this.N1;
        this.r1 = i10;
        this.N1 = i10 + 2;
        this.s1 = i10 + 1;
        int i11 = tL_chatInviteExported.usage;
        boolean z12 = i11 > 0 || tL_chatInviteExported.usage_limit > 0 || tL_chatInviteExported.requested > 0 || tL_chatInviteExported.subscription_expired > 0;
        ArrayList arrayList = this.Y1;
        int size = arrayList.size();
        ArrayList arrayList2 = this.a2;
        ArrayList arrayList3 = this.Z1;
        boolean z13 = i11 > size || tL_chatInviteExported.subscription_expired > arrayList3.size() || (tL_chatInviteExported.request_needed && tL_chatInviteExported.requested > arrayList2.size());
        if (!arrayList.isEmpty()) {
            int i12 = this.N1;
            int i13 = i12 + 1;
            this.N1 = i13;
            this.w1 = i12;
            this.x1 = i13;
            int size2 = arrayList.size() + i13;
            this.N1 = size2;
            this.y1 = size2;
            z10 = true;
        }
        if (!arrayList3.isEmpty()) {
            int i14 = this.N1;
            int i15 = i14 + 1;
            this.N1 = i15;
            this.z1 = i14;
            this.A1 = i15;
            int size3 = arrayList3.size() + i15;
            this.N1 = size3;
            this.B1 = size3;
            z10 = true;
        }
        if (arrayList2.isEmpty()) {
            z11 = z10;
        } else {
            int i16 = this.N1;
            int i17 = i16 + 1;
            this.N1 = i17;
            this.I1 = i16;
            this.J1 = i17;
            int size4 = arrayList2.size() + i17;
            this.N1 = size4;
            this.K1 = size4;
        }
        if ((z12 || z13) && !z11) {
            int i18 = this.N1;
            this.t1 = i18;
            this.E1 = i18 + 1;
            this.N1 = i18 + 3;
            this.F1 = i18 + 2;
        }
        this.O1.f();
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void s0() {
        int i7;
        super.s0();
        try {
            int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.a7, this.J0);
            if (this.s0 != null) {
                v0(w02);
            }
            if (this.G0 < 0 && (i7 = this.H0) == this.h2 && w02 != i7) {
                this.H0 = w02;
                this.h2 = w02;
                E0(w02);
            }
            J0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog
    public final void show() {
        super.show();
        this.g2 = false;
    }

    public final void updateColors() {
        TextView textView = this.R1;
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.j5, false));
            textView.setLinkTextColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.k5, false));
            textView.setHighlightColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.l5, false));
            if (!this.X1) {
                textView.setBackgroundColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.d6, false));
            }
        }
        int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.A5, false);
        c50 c50Var = this.Q1;
        c50Var.setGlowColor(x02);
        this.T1.setBackgroundColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.V5, false));
        v0(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.a7, false));
        int hiddenChildCount = c50Var.getHiddenChildCount();
        for (int i7 = 0; i7 < c50Var.getChildCount(); i7++) {
            N0(c50Var.getChildAt(i7));
        }
        for (int i10 = 0; i10 < hiddenChildCount; i10++) {
            N0(c50Var.V(i10));
        }
        int cachedChildCount = c50Var.getCachedChildCount();
        for (int i11 = 0; i11 < cachedChildCount; i11++) {
            N0(c50Var.P(i11));
        }
        int attachedScrapChildCount = c50Var.getAttachedScrapChildCount();
        for (int i12 = 0; i12 < attachedScrapChildCount; i12++) {
            N0(c50Var.O(i12));
        }
        this.b.invalidate();
    }
}
