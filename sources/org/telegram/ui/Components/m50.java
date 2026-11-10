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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class m50 extends org.telegram.ui.ActionBar.w2 {
    public static final /* synthetic */ int h2 = 0;
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
    public boolean K1;
    public boolean L1;
    public int M1;
    public final h50 N1;
    public final org.telegram.ui.ActionBar.f2 O1;
    public final z40 P1;
    public final TextView Q1;
    public AnimatorSet R1;
    public final View S1;
    public int T1;
    public boolean U1;
    public final boolean V1;
    public final boolean W1;
    public final ArrayList X1;
    public final ArrayList Y1;
    public final ArrayList Z1;
    public final long a2;
    public final boolean b2;
    public final long c2;
    public org.telegram.ui.bb d2;
    public boolean e2;
    public boolean f2;
    public int g2;
    public final TLRPC.TL_chatInviteExported l1;
    public final HashMap m1;
    public final TLRPC.ChatFull n1;
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

    public m50(final Context context, final TLRPC.TL_chatInviteExported tL_chatInviteExported, final TLRPC.ChatFull chatFull, final HashMap hashMap, final org.telegram.ui.ActionBar.f2 f2Var, final long j3, boolean z9, boolean z10) {
        super(context, false);
        this.X1 = new ArrayList();
        this.Y1 = new ArrayList();
        this.Z1 = new ArrayList();
        this.e2 = true;
        this.f2 = false;
        this.l1 = tL_chatInviteExported;
        this.m1 = hashMap;
        this.O1 = f2Var;
        this.n1 = chatFull;
        this.a2 = j3;
        this.V1 = z9;
        this.b2 = z10;
        int i7 = org.telegram.ui.ActionBar.m6.a7;
        v0(org.telegram.ui.ActionBar.m6.w0(i7, this.I0));
        P(i7);
        this.g2 = this.G0;
        this.a0 = -1;
        if (hashMap == null) {
            this.m1 = new HashMap();
        }
        this.c2 = ConnectionsManager.getInstance(this.a).getCurrentTime() - (System.currentTimeMillis() / 1000);
        y40 y40Var = new y40(this, context);
        this.b = y40Var;
        y40Var.setWillNotDraw(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 51);
        layoutParams.topMargin = org.telegram.messenger.g0.L(48.0f);
        View view = new View(context);
        this.S1 = view;
        view.setAlpha(0.0f);
        view.setVisibility(4);
        view.setTag(1);
        this.b.addView(view, layoutParams);
        z40 z40Var = new z40(this, context);
        this.P1 = z40Var;
        z40Var.r1();
        z40Var.setTag(14);
        getContext();
        v4.b0 b0Var = new v4.b0(1, false);
        z40Var.setLayoutManager(b0Var);
        h50 h50Var = new h50(this);
        this.N1 = h50Var;
        z40Var.setAdapter(h50Var);
        z40Var.setVerticalScrollBarEnabled(false);
        z40Var.setClipToPadding(false);
        z40Var.setNestedScrollingEnabled(true);
        z40Var.setOnScrollListener(new a50(this, b0Var));
        z40Var.setOnItemClickListener(new bj0() { // from class: org.telegram.ui.Components.v40
            /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
            /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
            @Override // org.telegram.ui.Components.bj0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void c(int i10, View view2) {
                HashMap hashMap2;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter2;
                TLRPC.User user;
                TLRPC.ChannelParticipant channelParticipant;
                m50 m50Var = m50.this;
                int i11 = m50Var.r1;
                TLRPC.TL_chatInviteExported tL_chatInviteExported2 = tL_chatInviteExported;
                if (i10 == i11 && tL_chatInviteExported2.admin_id == org.telegram.messenger.p10.i(m50Var.a).n) {
                    return;
                }
                int i12 = m50Var.w1;
                boolean z11 = i10 >= i12 && i10 < m50Var.x1;
                int i13 = m50Var.z1;
                boolean z12 = i10 >= i13 && i10 < m50Var.A1;
                int i14 = m50Var.I1;
                boolean z13 = i10 >= i14 && i10 < m50Var.J1;
                if ((i10 != m50Var.r1 && !z11 && !z13) || (hashMap2 = hashMap) == null) {
                    return;
                }
                long j10 = tL_chatInviteExported2.admin_id;
                if (z11) {
                    tL_chatInviteImporter2 = (TLRPC.TL_chatInviteImporter) m50Var.X1.get(i10 - i12);
                    j10 = tL_chatInviteImporter2.user_id;
                } else if (z12) {
                    tL_chatInviteImporter2 = (TLRPC.TL_chatInviteImporter) m50Var.Y1.get(i10 - i13);
                    j10 = tL_chatInviteImporter2.user_id;
                } else {
                    if (!z13) {
                        tL_chatInviteImporter = null;
                        user = (TLRPC.User) hashMap2.get(Long.valueOf(j10));
                        if (user == null) {
                            org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).X3(user, false, false);
                            if (!z11 || tL_chatInviteExported2.subscription_pricing == null) {
                                org.telegram.messenger.g0.i3(new mg(m50Var, user, f2Var, 8), 100L);
                                m50Var.dismiss();
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
                                m50.M0(context2, m50Var.a, -j11, tL_chatInviteExported2.subscription_pricing, tL_chatInviteImporter, channelParticipant, m50Var.I0);
                                return;
                            }
                            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, context2, null);
                            u1Var.r(120L);
                            org.telegram.messenger.qp.s1(m50Var.a).K0(org.telegram.messenger.qp.s1(m50Var.a).M0(Long.valueOf(j11)), user, new bi.q3(m50Var, u1Var, context2, j11, tL_chatInviteExported2, tL_chatInviteImporter, 2));
                            return;
                        }
                        return;
                    }
                    tL_chatInviteImporter2 = (TLRPC.TL_chatInviteImporter) m50Var.Z1.get(i10 - i14);
                    j10 = tL_chatInviteImporter2.user_id;
                }
                tL_chatInviteImporter = tL_chatInviteImporter2;
                user = (TLRPC.User) hashMap2.get(Long.valueOf(j10));
                if (user == null) {
                }
            }
        });
        TextView textView = new TextView(context);
        this.Q1 = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setTextSize(1, 20.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(org.telegram.messenger.g0.L(23.0f), 0, org.telegram.messenger.g0.L(23.0f), 0);
        textView.setGravity(16);
        textView.setTypeface(org.telegram.messenger.g0.o());
        if (z9) {
            textView.setText(org.telegram.messenger.id.M0(2131749149, null));
            this.W1 = false;
            textView.setVisibility(4);
            textView.setAlpha(0.0f);
        } else {
            if (tL_chatInviteExported.expired) {
                textView.setText(org.telegram.messenger.id.M0(2131750875, null));
            } else if (tL_chatInviteExported.revoked) {
                textView.setText(org.telegram.messenger.id.M0(2131746014, null));
            } else {
                textView.setText(org.telegram.messenger.id.M0(2131749149, null));
            }
            this.W1 = true;
        }
        if (!TextUtils.isEmpty(tL_chatInviteExported.title)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
            org.telegram.messenger.i6.l(spannableStringBuilder, textView.getPaint().getFontMetricsInt(), false);
            textView.setText(spannableStringBuilder);
        }
        this.b.addView(z40Var, c8.ha.d(-1, -1.0f, 51, 0.0f, !this.W1 ? 0.0f : 44.0f, 0.0f, 0.0f));
        this.b.addView(textView, c8.ha.d(-1, this.W1 ? 50.0f : 44.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        O0();
        K0();
        if (hashMap == null || hashMap.get(Long.valueOf(tL_chatInviteExported.admin_id)) == null) {
            TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
            tL_users_getUsers.id.add(org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).o1(tL_chatInviteExported.admin_id));
            ConnectionsManager.getInstance(org.telegram.messenger.p10.s0).sendRequest(tL_users_getUsers, new w1(this, 5));
        }
        updateColors();
    }

    public static void I0(m50 m50Var) {
        View view = m50Var.S1;
        TextView textView = m50Var.Q1;
        z40 z40Var = m50Var.P1;
        if (z40Var.getChildCount() <= 0) {
            int paddingTop = z40Var.getPaddingTop();
            m50Var.T1 = paddingTop;
            z40Var.setTopGlowOffset(paddingTop);
            textView.setTranslationY(m50Var.T1);
            view.setTranslationY(m50Var.T1);
            m50Var.b.invalidate();
            return;
        }
        int i7 = 0;
        View childAt = z40Var.getChildAt(0);
        xi0 xi0Var = (xi0) z40Var.G(childAt);
        int top = childAt.getTop();
        if (top < 0 || xi0Var == null || xi0Var.b() != 0) {
            m50Var.L0(true);
        } else {
            m50Var.L0(false);
            i7 = top;
        }
        if (m50Var.T1 != i7) {
            m50Var.T1 = i7;
            z40Var.setTopGlowOffset(i7);
            if (textView != null) {
                textView.setTranslationY(m50Var.T1);
            }
            view.setTranslationY(m50Var.T1);
            m50Var.b.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r12v3, types: [android.view.View, org.telegram.ui.Components.k9] */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r1v17, types: [android.view.View, org.telegram.ui.Components.tx0] */
    /* JADX WARN: Type inference failed for: r2v13, types: [android.view.View, android.widget.TextView, org.telegram.ui.Components.w70] */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    public static void M0(Context context, int i7, long j3, TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant, org.telegram.ui.ActionBar.h6 h6Var) {
        boolean z9;
        Object obj;
        int i10;
        String str;
        org.telegram.ui.ActionBar.w2 l10 = org.telegram.messenger.k5.l(1, context, h6Var, false);
        org.telegram.ui.ActionBar.w2[] w2VarArr = new org.telegram.ui.ActionBar.w2[1];
        ?? f10 = org.telegram.messenger.k5.f(context, 1);
        f10.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(4.0f));
        f10.setClipChildren(false);
        f10.setClipToPadding(false);
        ?? frameLayout = new FrameLayout(context);
        f10.addView(frameLayout, c8.ha.t(-1, -2, 7, 0, 0, 0, 10));
        ?? k9Var = new k9(context);
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(50.0f));
        v8 v8Var = new v8((org.telegram.ui.ActionBar.h6) null);
        if (j3 >= 0) {
            z9 = 0;
            TLRPC.User a22 = org.telegram.messenger.qp.s1(i7).a2(Long.valueOf(j3));
            v8Var.r(a22);
            k9Var.e(a22, v8Var);
        } else {
            z9 = 0;
            TLRPC.Chat M0 = org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(-j3));
            v8Var.q(M0);
            k9Var.e(M0, v8Var);
        }
        frameLayout.addView(k9Var, c8.ha.e(100, 100, 17));
        Drawable drawable = context.getResources().getDrawable(R.drawable.star_small_outline);
        int i11 = org.telegram.ui.ActionBar.m6.h5;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i11, h6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
        Drawable drawable2 = context.getResources().getDrawable(R.drawable.star_small_inner);
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(drawable);
        org.telegram.ui.ActionBar.t6.x(imageView, drawable, i11, h6Var, mode);
        frameLayout.addView(imageView, c8.ha.e(28, 28, 17));
        imageView.setTranslationX(org.telegram.messenger.g0.L(34.0f));
        imageView.setTranslationY(org.telegram.messenger.g0.L(35.0f));
        imageView.setScaleX(1.1f);
        imageView.setScaleY(1.1f);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(drawable2);
        frameLayout.addView(imageView2, c8.ha.e(28, 28, 17));
        imageView2.setTranslationX(org.telegram.messenger.g0.L(34.0f));
        imageView2.setTranslationY(org.telegram.messenger.g0.L(35.0f));
        TextView textView = new TextView(context);
        org.telegram.messenger.k5.n(textView, org.telegram.ui.ActionBar.m6.j5, h6Var, 1, 20.0f);
        org.telegram.messenger.k5.m(textView, 17, null, 2131744971);
        TextView f11 = org.telegram.messenger.camera.q.f(f10, textView, c8.ha.t(-1, -2, 17, 20, 0, 20, 4), context);
        f11.setTextSize(1, 14.0f);
        f11.setGravity(17);
        int i12 = org.telegram.ui.ActionBar.m6.B6;
        org.telegram.ui.ActionBar.t6.U(f11, i12, h6Var);
        int i13 = tL_starsSubscriptionPricing.period;
        if (i13 == 2592000) {
            obj = "min";
            Object[] objArr = new Object[1];
            objArr[z9] = Long.valueOf(tL_starsSubscriptionPricing.amount);
            f11.setText(bi.dd.a1(z9, org.telegram.messenger.id.a0(null, null, 2131744983, objArr), 0.8f, null));
            i10 = i12;
        } else {
            obj = "min";
            boolean z10 = z9;
            Object obj2 = i13 == 300 ? "5min" : obj;
            Locale locale = Locale.US;
            i10 = i12;
            Object[] objArr2 = new Object[2];
            objArr2[z10 ? 1 : 0] = Long.valueOf(tL_starsSubscriptionPricing.amount);
            objArr2[1] = obj2;
            f11.setText(bi.dd.a1(z10, String.format(locale, "⭐%1$d/%2$s", objArr2), 0.8f, null));
        }
        TextView f12 = org.telegram.messenger.camera.q.f(f10, f11, c8.ha.t(-1, -2, 17, 20, 0, 20, 4), context);
        f12.setTextSize(1, 14.0f);
        f12.setGravity(17);
        org.telegram.ui.ActionBar.t6.U(f12, i10, h6Var);
        int i14 = tL_starsSubscriptionPricing.period;
        if (i14 == 2592000) {
            f12.setText(org.telegram.messenger.id.a0(null, null, 2131745058, org.telegram.messenger.r1.i().f((int) ((tL_starsSubscriptionPricing.amount / 1000.0d) * org.telegram.messenger.qp.s1(i7).c6), "USD")));
        } else {
            f12.setText(String.format(Locale.US, "appx. %1$s per %2$s", org.telegram.messenger.r1.i().f((int) (org.telegram.messenger.qp.s1(i7).c6 * (tL_starsSubscriptionPricing.amount / 1000.0d)), "USD"), i14 == 300 ? "5min" : obj));
        }
        f10.addView(f12, c8.ha.t(-1, -2, 17, 20, 0, 20, 4));
        ?? tx0Var = new tx0(context, h6Var);
        ?? w70Var = new w70(context, h6Var);
        w70Var.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        w70Var.setEllipsize(TextUtils.TruncateAt.END);
        int i15 = org.telegram.ui.ActionBar.m6.Uc;
        org.telegram.ui.ActionBar.t6.U(w70Var, i15, h6Var);
        org.telegram.ui.ActionBar.t6.G(w70Var, i15, h6Var);
        w70Var.setTextSize(1, 14.0f);
        w70Var.setSingleLine(true);
        w70Var.setDisablePaddingsOffsetY(true);
        org.telegram.ui.f5 f5Var = new org.telegram.ui.f5(24.0f, i7, w70Var);
        TLRPC.User a23 = org.telegram.messenger.qp.s1(i7).a2(Long.valueOf(tL_chatInviteImporter.user_id));
        boolean z11 = a23 == null;
        String p10 = org.telegram.messenger.t10.p(a23);
        f5Var.e(a23);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) p10));
        spannableStringBuilder.setSpan(f5Var, 0, 1, 33);
        spannableStringBuilder.setSpan(new b50(w2VarArr, tL_chatInviteImporter), 3, spannableStringBuilder.length(), 33);
        w70Var.setText(spannableStringBuilder);
        if (z11) {
            str = null;
        } else {
            str = null;
            tx0Var.l(w70Var, org.telegram.messenger.id.M0(2131745059, null));
        }
        tx0Var.c(org.telegram.messenger.id.M0(2131745054, str), org.telegram.messenger.id.a0(null, null, 2131742783, org.telegram.messenger.id.E0().s0().format(new Date(tL_chatInviteImporter.date * 1000)), org.telegram.messenger.id.E0().p0().format(new Date(tL_chatInviteImporter.date * 1000))), null, null);
        int currentTime = ConnectionsManager.getInstance(i7).getCurrentTime();
        if (channelParticipant != null) {
            tx0Var.c(org.telegram.messenger.id.M0(channelParticipant.subscription_until_date > currentTime ? 2131745055 : 2131745057, null), org.telegram.messenger.id.a0(null, null, 2131742783, org.telegram.messenger.id.E0().s0().format(new Date(channelParticipant.subscription_until_date * 1000)), org.telegram.messenger.id.E0().p0().format(new Date(channelParticipant.subscription_until_date * 1000))), null, null);
        }
        f10.addView(tx0Var, c8.ha.k(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
        w70 w70Var2 = new w70(context, h6Var);
        org.telegram.ui.ActionBar.t6.U(w70Var2, org.telegram.ui.ActionBar.m6.z6, h6Var);
        org.telegram.ui.ActionBar.t6.G(w70Var2, i15, h6Var);
        w70Var2.setTextSize(1, 14.0f);
        w70Var2.setText(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131744926, null), new r10(context, 1)));
        w70Var2.setGravity(17);
        f10.addView(w70Var2, c8.ha.k(14.0f, 15.0f, 14.0f, 15.0f, -1, -2));
        fi.d dVar = new fi.d(context, h6Var, true);
        dVar.i(org.telegram.messenger.id.M0(2131747831, null), false, true);
        f10.addView(dVar, c8.ha.o(-1, 48));
        dVar.setOnClickListener(new h2(w2VarArr, 2));
        l10.N = f10;
        w2VarArr[0] = l10;
        l10.T0 = false;
        l10.N();
        w2VarArr[0].show();
    }

    public static void N0(View view) {
        if (view instanceof org.telegram.ui.Cells.n4) {
            ((org.telegram.ui.Cells.n4) view).getTextView().setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.L6, false));
            return;
        }
        if (view instanceof q70) {
            ((q70) view).f();
        } else if (view instanceof org.telegram.ui.Cells.z8) {
            org.telegram.ui.ActionBar.t6.U(((org.telegram.ui.Cells.z8) view).getTextView(), org.telegram.ui.ActionBar.m6.B6, null);
        } else if (view instanceof org.telegram.ui.Cells.pa) {
            ((org.telegram.ui.Cells.pa) view).i(0);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean G() {
        return false;
    }

    public final void J0() {
        TextView textView = this.Q1;
        if (textView != null) {
            try {
                textView.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.j5, false));
                textView.setLinkTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.k5, false));
                textView.setHighlightColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.l5, false));
                if (!this.W1) {
                    textView.setBackgroundColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.d6, false));
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        z40 z40Var = this.P1;
        if (z40Var != null) {
            z40Var.setGlowColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.A5, false));
        }
        View view = this.S1;
        if (view != null) {
            view.setBackgroundColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.V5, false));
        }
    }

    public final void K0() {
        final boolean z9;
        final boolean z10;
        if (this.K1) {
            return;
        }
        TLRPC.TL_chatInviteExported tL_chatInviteExported = this.l1;
        int i7 = tL_chatInviteExported.usage;
        ArrayList arrayList = this.X1;
        boolean z11 = i7 > arrayList.size();
        int i10 = tL_chatInviteExported.subscription_expired;
        ArrayList arrayList2 = this.Y1;
        final boolean z12 = i10 > arrayList2.size();
        boolean z13 = tL_chatInviteExported.request_needed;
        ArrayList arrayList3 = this.Z1;
        final boolean z14 = z13 && tL_chatInviteExported.requested > arrayList3.size();
        if (z11) {
            z10 = false;
            z9 = false;
        } else if (z12) {
            z10 = false;
            z9 = true;
        } else {
            if (!z14) {
                return;
            }
            z9 = false;
            z10 = true;
        }
        final ArrayList arrayList4 = z10 ? arrayList3 : z9 ? arrayList2 : arrayList;
        TLRPC.TL_messages_getChatInviteImporters tL_messages_getChatInviteImporters = new TLRPC.TL_messages_getChatInviteImporters();
        tL_messages_getChatInviteImporters.flags |= 2;
        tL_messages_getChatInviteImporters.link = tL_chatInviteExported.link;
        tL_messages_getChatInviteImporters.peer = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).j1(-this.a2);
        tL_messages_getChatInviteImporters.requested = z10;
        tL_messages_getChatInviteImporters.subscription_expired = z9;
        if (arrayList4.isEmpty()) {
            tL_messages_getChatInviteImporters.offset_user = new TLRPC.TL_inputUserEmpty();
        } else {
            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) arrayList4.get(arrayList4.size() - 1);
            tL_messages_getChatInviteImporters.offset_user = org.telegram.messenger.qp.s1(this.a).q1((TLRPC.User) this.m1.get(Long.valueOf(tL_chatInviteImporter.user_id)));
            tL_messages_getChatInviteImporters.offset_date = tL_chatInviteImporter.date;
        }
        this.K1 = true;
        ConnectionsManager.getInstance(org.telegram.messenger.p10.s0).sendRequest(tL_messages_getChatInviteImporters, new RequestDelegate() { // from class: org.telegram.ui.Components.w40
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final m50 m50Var = m50.this;
                final ArrayList arrayList5 = arrayList4;
                final boolean z15 = z10;
                final boolean z16 = z9;
                final boolean z17 = z14;
                final boolean z18 = z12;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.Components.x40
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
                        m50 m50Var2 = m50.this;
                        if (tL_error == null) {
                            TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) tLObject;
                            ArrayList<TLRPC.TL_chatInviteImporter> arrayList6 = tL_messages_chatInviteImporters.importers;
                            ArrayList arrayList7 = arrayList5;
                            arrayList7.addAll(arrayList6);
                            for (int i11 = 0; i11 < tL_messages_chatInviteImporters.users.size(); i11++) {
                                TLRPC.User user = tL_messages_chatInviteImporters.users.get(i11);
                                m50Var2.m1.put(Long.valueOf(user.id), user);
                            }
                            boolean z19 = true;
                            if (!z15) {
                                boolean z20 = z16;
                                boolean z21 = z17;
                                if (z20) {
                                    m50Var2.L1 = z19;
                                    m50Var2.O0();
                                } else {
                                    m50Var2.L1 = z19;
                                    m50Var2.O0();
                                }
                            }
                        }
                        m50Var2.K1 = false;
                    }
                });
            }
        });
    }

    public final void L0(boolean z9) {
        View view = this.S1;
        if ((!z9 || view.getTag() == null) && (z9 || view.getTag() != null)) {
            return;
        }
        view.setTag(z9 ? null : 1);
        TextView textView = this.Q1;
        if (z9) {
            view.setVisibility(0);
            textView.setVisibility(0);
        }
        AnimatorSet animatorSet = this.R1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.R1 = animatorSet2;
        Property property = View.ALPHA;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, z9 ? 1.0f : 0.0f));
        if (!this.W1) {
            this.R1.playTogether(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, z9 ? 1.0f : 0.0f));
        }
        this.R1.setDuration(150L);
        this.R1.addListener(new s9(12, this, z9));
        this.R1.start();
    }

    public final void O0() {
        boolean z9 = false;
        this.M1 = 0;
        this.s1 = -1;
        this.t1 = -1;
        this.u1 = -1;
        this.v1 = -1;
        this.w1 = -1;
        this.x1 = -1;
        this.E1 = -1;
        this.F1 = -1;
        this.B1 = -1;
        this.C1 = -1;
        this.G1 = -1;
        this.H1 = -1;
        this.I1 = -1;
        this.J1 = -1;
        this.D1 = -1;
        this.o1 = -1;
        this.p1 = -1;
        this.y1 = -1;
        this.z1 = -1;
        this.A1 = -1;
        boolean z10 = true;
        if (!this.V1) {
            this.B1 = 0;
            this.M1 = 2;
            this.C1 = 1;
        }
        TLRPC.TL_chatInviteExported tL_chatInviteExported = this.l1;
        if (tL_chatInviteExported.subscription_pricing != null) {
            int i7 = this.M1;
            this.o1 = i7;
            this.M1 = i7 + 2;
            this.p1 = i7 + 1;
        }
        int i10 = this.M1;
        this.q1 = i10;
        this.M1 = i10 + 2;
        this.r1 = i10 + 1;
        int i11 = tL_chatInviteExported.usage;
        boolean z11 = i11 > 0 || tL_chatInviteExported.usage_limit > 0 || tL_chatInviteExported.requested > 0 || tL_chatInviteExported.subscription_expired > 0;
        ArrayList arrayList = this.X1;
        int size = arrayList.size();
        ArrayList arrayList2 = this.Z1;
        ArrayList arrayList3 = this.Y1;
        boolean z12 = i11 > size || tL_chatInviteExported.subscription_expired > arrayList3.size() || (tL_chatInviteExported.request_needed && tL_chatInviteExported.requested > arrayList2.size());
        if (!arrayList.isEmpty()) {
            int i12 = this.M1;
            int i13 = i12 + 1;
            this.M1 = i13;
            this.v1 = i12;
            this.w1 = i13;
            int size2 = arrayList.size() + i13;
            this.M1 = size2;
            this.x1 = size2;
            z9 = true;
        }
        if (!arrayList3.isEmpty()) {
            int i14 = this.M1;
            int i15 = i14 + 1;
            this.M1 = i15;
            this.y1 = i14;
            this.z1 = i15;
            int size3 = arrayList3.size() + i15;
            this.M1 = size3;
            this.A1 = size3;
            z9 = true;
        }
        if (arrayList2.isEmpty()) {
            z10 = z9;
        } else {
            int i16 = this.M1;
            int i17 = i16 + 1;
            this.M1 = i17;
            this.H1 = i16;
            this.I1 = i17;
            int size4 = arrayList2.size() + i17;
            this.M1 = size4;
            this.J1 = size4;
        }
        if ((z11 || z12) && !z10) {
            int i18 = this.M1;
            this.s1 = i18;
            this.D1 = i18 + 1;
            this.M1 = i18 + 3;
            this.E1 = i18 + 2;
        }
        this.N1.f();
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void s0() {
        int i7;
        super.s0();
        try {
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.a7, this.I0);
            if (this.r0 != null) {
                v0(w02);
            }
            if (this.F0 < 0 && (i7 = this.G0) == this.g2 && w02 != i7) {
                this.G0 = w02;
                this.g2 = w02;
                E0(w02);
            }
            J0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void show() {
        super.show();
        this.f2 = false;
    }

    public final void updateColors() {
        TextView textView = this.Q1;
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.j5, false));
            textView.setLinkTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.k5, false));
            textView.setHighlightColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.l5, false));
            if (!this.W1) {
                textView.setBackgroundColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.d6, false));
            }
        }
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.A5, false);
        z40 z40Var = this.P1;
        z40Var.setGlowColor(x02);
        this.S1.setBackgroundColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.V5, false));
        v0(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.a7, false));
        int hiddenChildCount = z40Var.getHiddenChildCount();
        for (int i7 = 0; i7 < z40Var.getChildCount(); i7++) {
            N0(z40Var.getChildAt(i7));
        }
        for (int i10 = 0; i10 < hiddenChildCount; i10++) {
            N0(z40Var.V(i10));
        }
        int cachedChildCount = z40Var.getCachedChildCount();
        for (int i11 = 0; i11 < cachedChildCount; i11++) {
            N0(z40Var.P(i11));
        }
        int attachedScrapChildCount = z40Var.getAttachedScrapChildCount();
        for (int i12 = 0; i12 < attachedScrapChildCount; i12++) {
            N0(z40Var.O(i12));
        }
        this.b.invalidate();
    }
}
