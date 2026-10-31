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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class c60 extends org.telegram.ui.ActionBar.z2 {
    public static final /* synthetic */ int e2 = 0;
    public int A1;
    public int B1;
    public int C1;
    public int D1;
    public int E1;
    public int F1;
    public int G1;
    public boolean H1;
    public boolean I1;
    public int J1;
    public final x50 K1;
    public final org.telegram.ui.ActionBar.k2 L1;
    public final p50 M1;
    public final TextView N1;
    public AnimatorSet O1;
    public final View P1;
    public int Q1;
    public boolean R1;
    public final boolean S1;
    public final boolean T1;
    public final ArrayList U1;
    public final ArrayList V1;
    public final ArrayList W1;
    public final long X1;
    public final boolean Y1;
    public final long Z1;
    public org.telegram.ui.gb a2;
    public boolean b2;
    public boolean c2;
    public int d2;
    public final TLRPC.TL_chatInviteExported i1;
    public final HashMap j1;
    public final TLRPC.ChatFull k1;
    public int l1;
    public int m1;
    public int n1;
    public int o1;
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

    public c60(final Context context, final TLRPC.TL_chatInviteExported tL_chatInviteExported, final TLRPC.ChatFull chatFull, final HashMap hashMap, final org.telegram.ui.ActionBar.k2 k2Var, final long j10, boolean z10, boolean z11) {
        super(context, false);
        this.U1 = new ArrayList();
        this.V1 = new ArrayList();
        this.W1 = new ArrayList();
        this.b2 = true;
        this.c2 = false;
        this.i1 = tL_chatInviteExported;
        this.j1 = hashMap;
        this.L1 = k2Var;
        this.k1 = chatFull;
        this.X1 = j10;
        this.S1 = z10;
        this.Y1 = z11;
        int i10 = org.telegram.ui.ActionBar.t6.a7;
        v0(org.telegram.ui.ActionBar.t6.w0(i10, this.I0));
        Q(i10);
        this.d2 = this.G0;
        this.a0 = -1;
        if (hashMap == null) {
            this.j1 = new HashMap();
        }
        this.Z1 = ConnectionsManager.getInstance(this.a).getCurrentTime() - (System.currentTimeMillis() / 1000);
        o50 o50Var = new o50(this, context);
        this.b = o50Var;
        o50Var.setWillNotDraw(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.i0.f1(), 51);
        layoutParams.topMargin = org.telegram.messenger.i0.L(48.0f);
        View view = new View(context);
        this.P1 = view;
        view.setAlpha(0.0f);
        view.setVisibility(4);
        view.setTag(1);
        this.b.addView(view, layoutParams);
        p50 p50Var = new p50(this, context);
        this.M1 = p50Var;
        p50Var.r1();
        p50Var.setTag(14);
        getContext();
        s4.a0 a0Var = new s4.a0(1, false);
        p50Var.setLayoutManager(a0Var);
        x50 x50Var = new x50(this);
        this.K1 = x50Var;
        p50Var.setAdapter(x50Var);
        p50Var.setVerticalScrollBarEnabled(false);
        p50Var.setClipToPadding(false);
        p50Var.setNestedScrollingEnabled(true);
        p50Var.setOnScrollListener(new q50(this, a0Var));
        p50Var.setOnItemClickListener(new gk0() { // from class: org.telegram.ui.Components.l50
            /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
            /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
            @Override // org.telegram.ui.Components.gk0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void f(int i11, View view2) {
                HashMap hashMap2;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter2;
                TLRPC.User user;
                TLRPC.ChannelParticipant channelParticipant;
                c60 c60Var = c60.this;
                int i12 = c60Var.o1;
                TLRPC.TL_chatInviteExported tL_chatInviteExported2 = tL_chatInviteExported;
                if (i11 == i12 && tL_chatInviteExported2.admin_id == org.telegram.messenger.d20.i(c60Var.a).n) {
                    return;
                }
                int i13 = c60Var.t1;
                boolean z12 = i11 >= i13 && i11 < c60Var.u1;
                int i14 = c60Var.w1;
                boolean z13 = i11 >= i14 && i11 < c60Var.x1;
                int i15 = c60Var.F1;
                boolean z14 = i11 >= i15 && i11 < c60Var.G1;
                if ((i11 != c60Var.o1 && !z12 && !z14) || (hashMap2 = hashMap) == null) {
                    return;
                }
                long j11 = tL_chatInviteExported2.admin_id;
                if (z12) {
                    tL_chatInviteImporter2 = (TLRPC.TL_chatInviteImporter) c60Var.U1.get(i11 - i13);
                    j11 = tL_chatInviteImporter2.user_id;
                } else if (z13) {
                    tL_chatInviteImporter2 = (TLRPC.TL_chatInviteImporter) c60Var.V1.get(i11 - i14);
                    j11 = tL_chatInviteImporter2.user_id;
                } else {
                    if (!z14) {
                        tL_chatInviteImporter = null;
                        user = (TLRPC.User) hashMap2.get(Long.valueOf(j11));
                        if (user == null) {
                            org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).U3(user, false, false);
                            if (!z12 || tL_chatInviteExported2.subscription_pricing == null) {
                                org.telegram.messenger.i0.h3(new jg(c60Var, user, k2Var, 8), 100L);
                                c60Var.dismiss();
                                return;
                            }
                            TLRPC.ChatFull chatFull2 = chatFull;
                            if (chatFull2 != null && chatFull2.participants != null) {
                                for (int i16 = 0; i16 < chatFull2.participants.participants.size(); i16++) {
                                    if (chatFull2.participants.participants.get(i16).user_id == j11 && (chatFull2.participants.participants.get(i16) instanceof TLRPC.TL_chatChannelParticipant)) {
                                        channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatFull2.participants.participants.get(i16)).channelParticipant;
                                        break;
                                    }
                                }
                            }
                            channelParticipant = null;
                            Context context2 = context;
                            long j12 = j10;
                            if (channelParticipant != null) {
                                c60.M0(context2, c60Var.a, -j12, tL_chatInviteExported2.subscription_pricing, tL_chatInviteImporter, channelParticipant, c60Var.I0);
                                return;
                            }
                            org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, context2, null);
                            x1Var.r(120L);
                            org.telegram.messenger.vp.r1(c60Var.a).J0(org.telegram.messenger.vp.r1(c60Var.a).L0(Long.valueOf(j12)), user, new org.telegram.messenger.rl(c60Var, x1Var, context2, j12, tL_chatInviteExported2, tL_chatInviteImporter, 1));
                            return;
                        }
                        return;
                    }
                    tL_chatInviteImporter2 = (TLRPC.TL_chatInviteImporter) c60Var.W1.get(i11 - i15);
                    j11 = tL_chatInviteImporter2.user_id;
                }
                tL_chatInviteImporter = tL_chatInviteImporter2;
                user = (TLRPC.User) hashMap2.get(Long.valueOf(j11));
                if (user == null) {
                }
            }
        });
        TextView textView = new TextView(context);
        this.N1 = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setTextSize(1, 20.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(org.telegram.messenger.i0.L(23.0f), 0, org.telegram.messenger.i0.L(23.0f), 0);
        textView.setGravity(16);
        textView.setTypeface(org.telegram.messenger.i0.o());
        if (z10) {
            textView.setText(org.telegram.messenger.cd.L0(2131749159, null));
            this.T1 = false;
            textView.setVisibility(4);
            textView.setAlpha(0.0f);
        } else {
            if (tL_chatInviteExported.expired) {
                textView.setText(org.telegram.messenger.cd.L0(2131750876, null));
            } else if (tL_chatInviteExported.revoked) {
                textView.setText(org.telegram.messenger.cd.L0(2131746031, null));
            } else {
                textView.setText(org.telegram.messenger.cd.L0(2131749159, null));
            }
            this.T1 = true;
        }
        if (!TextUtils.isEmpty(tL_chatInviteExported.title)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
            org.telegram.messenger.k6.l(spannableStringBuilder, textView.getPaint().getFontMetricsInt(), false);
            textView.setText(spannableStringBuilder);
        }
        this.b.addView(p50Var, w7.b6.d(-1, -1.0f, 51, 0.0f, !this.T1 ? 0.0f : 44.0f, 0.0f, 0.0f));
        this.b.addView(textView, w7.b6.d(-1, this.T1 ? 50.0f : 44.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        O0();
        K0();
        if (hashMap == null || hashMap.get(Long.valueOf(tL_chatInviteExported.admin_id)) == null) {
            TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
            tL_users_getUsers.id.add(org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).n1(tL_chatInviteExported.admin_id));
            ConnectionsManager.getInstance(org.telegram.messenger.d20.s0).sendRequest(tL_users_getUsers, new x1(this, 5));
        }
        updateColors();
    }

    public static void I0(c60 c60Var) {
        View view = c60Var.P1;
        TextView textView = c60Var.N1;
        p50 p50Var = c60Var.M1;
        if (p50Var.getChildCount() <= 0) {
            int paddingTop = p50Var.getPaddingTop();
            c60Var.Q1 = paddingTop;
            p50Var.setTopGlowOffset(paddingTop);
            textView.setTranslationY(c60Var.Q1);
            view.setTranslationY(c60Var.Q1);
            c60Var.b.invalidate();
            return;
        }
        int i10 = 0;
        View childAt = p50Var.getChildAt(0);
        ck0 ck0Var = (ck0) p50Var.G(childAt);
        int top = childAt.getTop();
        if (top < 0 || ck0Var == null || ck0Var.b() != 0) {
            c60Var.L0(true);
        } else {
            c60Var.L0(false);
            i10 = top;
        }
        if (c60Var.Q1 != i10) {
            c60Var.Q1 = i10;
            p50Var.setTopGlowOffset(i10);
            if (textView != null) {
                textView.setTranslationY(c60Var.Q1);
            }
            view.setTranslationY(c60Var.Q1);
            c60Var.b.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r12v3, types: [android.view.View, org.telegram.ui.Components.g9] */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r1v17, types: [android.view.View, org.telegram.ui.Components.wy0] */
    /* JADX WARN: Type inference failed for: r2v13, types: [android.view.View, android.widget.TextView, org.telegram.ui.Components.p80] */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    public static void M0(Context context, int i10, long j10, TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant, org.telegram.ui.ActionBar.p6 p6Var) {
        boolean z10;
        Object obj;
        int i11;
        String str;
        org.telegram.ui.ActionBar.z2 k10 = org.telegram.messenger.m5.k(1, context, p6Var, false);
        org.telegram.ui.ActionBar.z2[] z2VarArr = new org.telegram.ui.ActionBar.z2[1];
        ?? f7 = org.telegram.messenger.m5.f(context, 1);
        f7.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(4.0f));
        f7.setClipChildren(false);
        f7.setClipToPadding(false);
        ?? frameLayout = new FrameLayout(context);
        f7.addView(frameLayout, w7.b6.t(-1, -2, 7, 0, 0, 0, 10));
        ?? g9Var = new g9(context);
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(50.0f));
        r8 r8Var = new r8((org.telegram.ui.ActionBar.p6) null);
        if (j10 >= 0) {
            z10 = 0;
            TLRPC.User Z1 = org.telegram.messenger.vp.r1(i10).Z1(Long.valueOf(j10));
            r8Var.r(Z1);
            g9Var.e(Z1, r8Var);
        } else {
            z10 = 0;
            TLRPC.Chat L0 = org.telegram.messenger.vp.r1(i10).L0(Long.valueOf(-j10));
            r8Var.q(L0);
            g9Var.e(L0, r8Var);
        }
        frameLayout.addView(g9Var, w7.b6.e(100, 100, 17));
        Drawable drawable = context.getResources().getDrawable(R.drawable.star_small_outline);
        int i12 = org.telegram.ui.ActionBar.t6.h5;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i12, p6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
        Drawable drawable2 = context.getResources().getDrawable(R.drawable.star_small_inner);
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(drawable);
        org.telegram.ui.ActionBar.a7.y(imageView, drawable, i12, p6Var, mode);
        frameLayout.addView(imageView, w7.b6.e(28, 28, 17));
        imageView.setTranslationX(org.telegram.messenger.i0.L(34.0f));
        imageView.setTranslationY(org.telegram.messenger.i0.L(35.0f));
        imageView.setScaleX(1.1f);
        imageView.setScaleY(1.1f);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(drawable2);
        frameLayout.addView(imageView2, w7.b6.e(28, 28, 17));
        imageView2.setTranslationX(org.telegram.messenger.i0.L(34.0f));
        imageView2.setTranslationY(org.telegram.messenger.i0.L(35.0f));
        TextView textView = new TextView(context);
        org.telegram.messenger.m5.m(textView, org.telegram.ui.ActionBar.t6.j5, p6Var, 1, 20.0f);
        org.telegram.messenger.m5.l(textView, 17, null, 2131744989);
        TextView f10 = org.telegram.messenger.z20.f(f7, textView, w7.b6.t(-1, -2, 17, 20, 0, 20, 4), context);
        f10.setTextSize(1, 14.0f);
        f10.setGravity(17);
        int i13 = org.telegram.ui.ActionBar.t6.B6;
        org.telegram.ui.ActionBar.a7.V(f10, i13, p6Var);
        int i14 = tL_starsSubscriptionPricing.period;
        if (i14 == 2592000) {
            obj = "min";
            Object[] objArr = new Object[1];
            objArr[z10] = Long.valueOf(tL_starsSubscriptionPricing.amount);
            f10.setText(rh.h8.Z0(z10, org.telegram.messenger.cd.a0(null, null, 2131745001, objArr), 0.8f, null));
            i11 = i13;
        } else {
            obj = "min";
            boolean z11 = z10;
            Object obj2 = i14 == 300 ? "5min" : obj;
            Locale locale = Locale.US;
            i11 = i13;
            Object[] objArr2 = new Object[2];
            objArr2[z11 ? 1 : 0] = Long.valueOf(tL_starsSubscriptionPricing.amount);
            objArr2[1] = obj2;
            f10.setText(rh.h8.Z0(z11, String.format(locale, "⭐%1$d/%2$s", objArr2), 0.8f, null));
        }
        TextView f11 = org.telegram.messenger.z20.f(f7, f10, w7.b6.t(-1, -2, 17, 20, 0, 20, 4), context);
        f11.setTextSize(1, 14.0f);
        f11.setGravity(17);
        org.telegram.ui.ActionBar.a7.V(f11, i11, p6Var);
        int i15 = tL_starsSubscriptionPricing.period;
        if (i15 == 2592000) {
            f11.setText(org.telegram.messenger.cd.a0(null, null, 2131745076, org.telegram.messenger.u1.i().f((int) ((tL_starsSubscriptionPricing.amount / 1000.0d) * org.telegram.messenger.vp.r1(i10).d6), "USD")));
        } else {
            f11.setText(String.format(Locale.US, "appx. %1$s per %2$s", org.telegram.messenger.u1.i().f((int) (org.telegram.messenger.vp.r1(i10).d6 * (tL_starsSubscriptionPricing.amount / 1000.0d)), "USD"), i15 == 300 ? "5min" : obj));
        }
        f7.addView(f11, w7.b6.t(-1, -2, 17, 20, 0, 20, 4));
        ?? wy0Var = new wy0(context, p6Var);
        ?? p80Var = new p80(context, p6Var);
        p80Var.setPadding(org.telegram.messenger.i0.L(12.66f), org.telegram.messenger.i0.L(9.33f), org.telegram.messenger.i0.L(12.66f), org.telegram.messenger.i0.L(9.33f));
        p80Var.setEllipsize(TextUtils.TruncateAt.END);
        int i16 = org.telegram.ui.ActionBar.t6.Uc;
        org.telegram.ui.ActionBar.a7.V(p80Var, i16, p6Var);
        org.telegram.ui.ActionBar.a7.H(p80Var, i16, p6Var);
        p80Var.setTextSize(1, 14.0f);
        p80Var.setSingleLine(true);
        p80Var.setDisablePaddingsOffsetY(true);
        org.telegram.ui.e5 e5Var = new org.telegram.ui.e5(24.0f, i10, p80Var);
        TLRPC.User Z12 = org.telegram.messenger.vp.r1(i10).Z1(Long.valueOf(tL_chatInviteImporter.user_id));
        boolean z12 = Z12 == null;
        String p5 = org.telegram.messenger.h20.p(Z12);
        e5Var.e(Z12);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) p5));
        spannableStringBuilder.setSpan(e5Var, 0, 1, 33);
        spannableStringBuilder.setSpan(new r50(z2VarArr, tL_chatInviteImporter), 3, spannableStringBuilder.length(), 33);
        p80Var.setText(spannableStringBuilder);
        if (z12) {
            str = null;
        } else {
            str = null;
            wy0Var.l(p80Var, org.telegram.messenger.cd.L0(2131745077, null));
        }
        wy0Var.c(org.telegram.messenger.cd.L0(2131745072, str), org.telegram.messenger.cd.a0(null, null, 2131742808, org.telegram.messenger.cd.D0().r0().format(new Date(tL_chatInviteImporter.date * 1000)), org.telegram.messenger.cd.D0().o0().format(new Date(tL_chatInviteImporter.date * 1000))), null, null);
        int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        if (channelParticipant != null) {
            wy0Var.c(org.telegram.messenger.cd.L0(channelParticipant.subscription_until_date > currentTime ? 2131745073 : 2131745075, null), org.telegram.messenger.cd.a0(null, null, 2131742808, org.telegram.messenger.cd.D0().r0().format(new Date(channelParticipant.subscription_until_date * 1000)), org.telegram.messenger.cd.D0().o0().format(new Date(channelParticipant.subscription_until_date * 1000))), null, null);
        }
        f7.addView(wy0Var, w7.b6.k(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
        p80 p80Var2 = new p80(context, p6Var);
        org.telegram.ui.ActionBar.a7.V(p80Var2, org.telegram.ui.ActionBar.t6.z6, p6Var);
        org.telegram.ui.ActionBar.a7.H(p80Var2, i16, p6Var);
        p80Var2.setTextSize(1, 14.0f);
        p80Var2.setText(org.telegram.messenger.i0.T2(org.telegram.messenger.cd.L0(2131744944, null), new i20(context, 1)));
        p80Var2.setGravity(17);
        f7.addView(p80Var2, w7.b6.k(14.0f, 15.0f, 14.0f, 15.0f, -1, -2));
        vh.d dVar = new vh.d(context, p6Var, true);
        dVar.i(org.telegram.messenger.cd.L0(2131747847, null), false, true);
        f7.addView(dVar, w7.b6.o(-1, 48));
        dVar.setOnClickListener(new j2(z2VarArr, 2));
        k10.N = f7;
        z2VarArr[0] = k10;
        k10.T0 = false;
        k10.O();
        z2VarArr[0].show();
    }

    public static void N0(View view) {
        if (view instanceof org.telegram.ui.Cells.p4) {
            ((org.telegram.ui.Cells.p4) view).getTextView().setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.L6, false));
            return;
        }
        if (view instanceof j80) {
            ((j80) view).f();
        } else if (view instanceof org.telegram.ui.Cells.b9) {
            org.telegram.ui.ActionBar.a7.V(((org.telegram.ui.Cells.b9) view).getTextView(), org.telegram.ui.ActionBar.t6.B6, null);
        } else if (view instanceof org.telegram.ui.Cells.pa) {
            ((org.telegram.ui.Cells.pa) view).i(0);
        }
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final boolean H() {
        return false;
    }

    public final void J0() {
        TextView textView = this.N1;
        if (textView != null) {
            try {
                textView.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.j5, false));
                textView.setLinkTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.k5, false));
                textView.setHighlightColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.l5, false));
                if (!this.T1) {
                    textView.setBackgroundColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.d6, false));
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
                return;
            }
        }
        p50 p50Var = this.M1;
        if (p50Var != null) {
            p50Var.setGlowColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.A5, false));
        }
        View view = this.P1;
        if (view != null) {
            view.setBackgroundColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.V5, false));
        }
    }

    public final void K0() {
        final boolean z10;
        final boolean z11;
        if (this.H1) {
            return;
        }
        TLRPC.TL_chatInviteExported tL_chatInviteExported = this.i1;
        int i10 = tL_chatInviteExported.usage;
        ArrayList arrayList = this.U1;
        boolean z12 = i10 > arrayList.size();
        int i11 = tL_chatInviteExported.subscription_expired;
        ArrayList arrayList2 = this.V1;
        final boolean z13 = i11 > arrayList2.size();
        boolean z14 = tL_chatInviteExported.request_needed;
        ArrayList arrayList3 = this.W1;
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
        tL_messages_getChatInviteImporters.peer = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).i1(-this.X1);
        tL_messages_getChatInviteImporters.requested = z11;
        tL_messages_getChatInviteImporters.subscription_expired = z10;
        if (arrayList4.isEmpty()) {
            tL_messages_getChatInviteImporters.offset_user = new TLRPC.TL_inputUserEmpty();
        } else {
            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) arrayList4.get(arrayList4.size() - 1);
            tL_messages_getChatInviteImporters.offset_user = org.telegram.messenger.vp.r1(this.a).p1((TLRPC.User) this.j1.get(Long.valueOf(tL_chatInviteImporter.user_id)));
            tL_messages_getChatInviteImporters.offset_date = tL_chatInviteImporter.date;
        }
        this.H1 = true;
        ConnectionsManager.getInstance(org.telegram.messenger.d20.s0).sendRequest(tL_messages_getChatInviteImporters, new RequestDelegate() { // from class: org.telegram.ui.Components.m50
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final c60 c60Var = c60.this;
                final ArrayList arrayList5 = arrayList4;
                final boolean z16 = z11;
                final boolean z17 = z10;
                final boolean z18 = z15;
                final boolean z19 = z13;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.Components.n50
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
                        c60 c60Var2 = c60.this;
                        if (tL_error == null) {
                            TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) tLObject;
                            ArrayList<TLRPC.TL_chatInviteImporter> arrayList6 = tL_messages_chatInviteImporters.importers;
                            ArrayList arrayList7 = arrayList5;
                            arrayList7.addAll(arrayList6);
                            for (int i12 = 0; i12 < tL_messages_chatInviteImporters.users.size(); i12++) {
                                TLRPC.User user = tL_messages_chatInviteImporters.users.get(i12);
                                c60Var2.j1.put(Long.valueOf(user.id), user);
                            }
                            boolean z20 = true;
                            if (!z16) {
                                boolean z21 = z17;
                                boolean z22 = z18;
                                if (z21) {
                                    c60Var2.I1 = z20;
                                    c60Var2.O0();
                                } else {
                                    c60Var2.I1 = z20;
                                    c60Var2.O0();
                                }
                            }
                        }
                        c60Var2.H1 = false;
                    }
                });
            }
        });
    }

    public final void L0(boolean z10) {
        View view = this.P1;
        if ((!z10 || view.getTag() == null) && (z10 || view.getTag() != null)) {
            return;
        }
        view.setTag(z10 ? null : 1);
        TextView textView = this.N1;
        if (z10) {
            view.setVisibility(0);
            textView.setVisibility(0);
        }
        AnimatorSet animatorSet = this.O1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.O1 = animatorSet2;
        Property property = View.ALPHA;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, z10 ? 1.0f : 0.0f));
        if (!this.T1) {
            this.O1.playTogether(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, z10 ? 1.0f : 0.0f));
        }
        this.O1.setDuration(150L);
        this.O1.addListener(new eg.m(28, this, z10));
        this.O1.start();
    }

    public final void O0() {
        boolean z10 = false;
        this.J1 = 0;
        this.p1 = -1;
        this.q1 = -1;
        this.r1 = -1;
        this.s1 = -1;
        this.t1 = -1;
        this.u1 = -1;
        this.B1 = -1;
        this.C1 = -1;
        this.y1 = -1;
        this.z1 = -1;
        this.D1 = -1;
        this.E1 = -1;
        this.F1 = -1;
        this.G1 = -1;
        this.A1 = -1;
        this.l1 = -1;
        this.m1 = -1;
        this.v1 = -1;
        this.w1 = -1;
        this.x1 = -1;
        boolean z11 = true;
        if (!this.S1) {
            this.y1 = 0;
            this.J1 = 2;
            this.z1 = 1;
        }
        TLRPC.TL_chatInviteExported tL_chatInviteExported = this.i1;
        if (tL_chatInviteExported.subscription_pricing != null) {
            int i10 = this.J1;
            this.l1 = i10;
            this.J1 = i10 + 2;
            this.m1 = i10 + 1;
        }
        int i11 = this.J1;
        this.n1 = i11;
        this.J1 = i11 + 2;
        this.o1 = i11 + 1;
        int i12 = tL_chatInviteExported.usage;
        boolean z12 = i12 > 0 || tL_chatInviteExported.usage_limit > 0 || tL_chatInviteExported.requested > 0 || tL_chatInviteExported.subscription_expired > 0;
        ArrayList arrayList = this.U1;
        int size = arrayList.size();
        ArrayList arrayList2 = this.W1;
        ArrayList arrayList3 = this.V1;
        boolean z13 = i12 > size || tL_chatInviteExported.subscription_expired > arrayList3.size() || (tL_chatInviteExported.request_needed && tL_chatInviteExported.requested > arrayList2.size());
        if (!arrayList.isEmpty()) {
            int i13 = this.J1;
            int i14 = i13 + 1;
            this.J1 = i14;
            this.s1 = i13;
            this.t1 = i14;
            int size2 = arrayList.size() + i14;
            this.J1 = size2;
            this.u1 = size2;
            z10 = true;
        }
        if (!arrayList3.isEmpty()) {
            int i15 = this.J1;
            int i16 = i15 + 1;
            this.J1 = i16;
            this.v1 = i15;
            this.w1 = i16;
            int size3 = arrayList3.size() + i16;
            this.J1 = size3;
            this.x1 = size3;
            z10 = true;
        }
        if (arrayList2.isEmpty()) {
            z11 = z10;
        } else {
            int i17 = this.J1;
            int i18 = i17 + 1;
            this.J1 = i18;
            this.E1 = i17;
            this.F1 = i18;
            int size4 = arrayList2.size() + i18;
            this.J1 = size4;
            this.G1 = size4;
        }
        if ((z12 || z13) && !z11) {
            int i19 = this.J1;
            this.p1 = i19;
            this.A1 = i19 + 1;
            this.J1 = i19 + 3;
            this.B1 = i19 + 2;
        }
        this.K1.f();
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void s0() {
        int i10;
        super.s0();
        try {
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.a7, this.I0);
            if (this.r0 != null) {
                v0(w02);
            }
            if (this.F0 < 0 && (i10 = this.G0) == this.d2 && w02 != i10) {
                this.G0 = w02;
                this.d2 = w02;
                E0(w02);
            }
            J0();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog
    public final void show() {
        super.show();
        this.c2 = false;
    }

    public final void updateColors() {
        TextView textView = this.N1;
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.j5, false));
            textView.setLinkTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.k5, false));
            textView.setHighlightColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.l5, false));
            if (!this.T1) {
                textView.setBackgroundColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.d6, false));
            }
        }
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.A5, false);
        p50 p50Var = this.M1;
        p50Var.setGlowColor(x02);
        this.P1.setBackgroundColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.V5, false));
        v0(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.a7, false));
        int hiddenChildCount = p50Var.getHiddenChildCount();
        for (int i10 = 0; i10 < p50Var.getChildCount(); i10++) {
            N0(p50Var.getChildAt(i10));
        }
        for (int i11 = 0; i11 < hiddenChildCount; i11++) {
            N0(p50Var.V(i11));
        }
        int cachedChildCount = p50Var.getCachedChildCount();
        for (int i12 = 0; i12 < cachedChildCount; i12++) {
            N0(p50Var.P(i12));
        }
        int attachedScrapChildCount = p50Var.getAttachedScrapChildCount();
        for (int i13 = 0; i13 < attachedScrapChildCount; i13++) {
            N0(p50Var.O(i13));
        }
        this.b.invalidate();
    }
}
