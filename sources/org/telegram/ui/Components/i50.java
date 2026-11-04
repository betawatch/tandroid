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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class i50 extends org.telegram.ui.ActionBar.t2 {
    public static final /* synthetic */ int f2 = 0;
    public int A1;
    public int B1;
    public int C1;
    public int D1;
    public int E1;
    public int F1;
    public int G1;
    public int H1;
    public boolean I1;
    public boolean J1;
    public int K1;
    public final d50 L1;
    public final org.telegram.ui.ActionBar.d2 M1;
    public final v40 N1;
    public final TextView O1;
    public AnimatorSet P1;
    public final View Q1;
    public int R1;
    public boolean S1;
    public final boolean T1;
    public final boolean U1;
    public final ArrayList V1;
    public final ArrayList W1;
    public final ArrayList X1;
    public final long Y1;
    public final boolean Z1;
    public final long a2;
    public org.telegram.ui.za b2;
    public boolean c2;
    public boolean d2;
    public int e2;
    public final TLRPC.TL_chatInviteExported j1;
    public final HashMap k1;
    public final TLRPC.ChatFull l1;
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

    public i50(final Context context, final TLRPC.TL_chatInviteExported tL_chatInviteExported, final TLRPC.ChatFull chatFull, final HashMap hashMap, final org.telegram.ui.ActionBar.d2 d2Var, final long j10, boolean z10, boolean z11) {
        super(context, false);
        this.V1 = new ArrayList();
        this.W1 = new ArrayList();
        this.X1 = new ArrayList();
        this.c2 = true;
        this.d2 = false;
        this.j1 = tL_chatInviteExported;
        this.k1 = hashMap;
        this.M1 = d2Var;
        this.l1 = chatFull;
        this.Y1 = j10;
        this.T1 = z10;
        this.Z1 = z11;
        int i3 = org.telegram.ui.ActionBar.k6.a7;
        v0(org.telegram.ui.ActionBar.k6.w0(i3, this.J0));
        P(i3);
        this.e2 = this.H0;
        this.b0 = -1;
        if (hashMap == null) {
            this.k1 = new HashMap();
        }
        this.a2 = ConnectionsManager.getInstance(this.a).getCurrentTime() - (System.currentTimeMillis() / 1000);
        u40 u40Var = new u40(this, context);
        this.b = u40Var;
        u40Var.setWillNotDraw(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 51);
        layoutParams.topMargin = org.telegram.messenger.g0.L(48.0f);
        View view = new View(context);
        this.Q1 = view;
        view.setAlpha(0.0f);
        view.setVisibility(4);
        view.setTag(1);
        this.b.addView(view, layoutParams);
        v40 v40Var = new v40(this, context);
        this.N1 = v40Var;
        v40Var.r1();
        v40Var.setTag(14);
        getContext();
        u4.b0 b0Var = new u4.b0(1, false);
        v40Var.setLayoutManager(b0Var);
        d50 d50Var = new d50(this);
        this.L1 = d50Var;
        v40Var.setAdapter(d50Var);
        v40Var.setVerticalScrollBarEnabled(false);
        v40Var.setClipToPadding(false);
        v40Var.setNestedScrollingEnabled(true);
        v40Var.setOnScrollListener(new w40(this, b0Var));
        v40Var.setOnItemClickListener(new fj0() { // from class: org.telegram.ui.Components.r40
            /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
            /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
            @Override // org.telegram.ui.Components.fj0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void f(int i10, View view2) {
                HashMap hashMap2;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter2;
                TLRPC.User user;
                TLRPC.ChannelParticipant channelParticipant;
                i50 i50Var = i50.this;
                int i11 = i50Var.p1;
                TLRPC.TL_chatInviteExported tL_chatInviteExported2 = tL_chatInviteExported;
                if (i10 == i11 && tL_chatInviteExported2.admin_id == org.telegram.messenger.h10.i(i50Var.a).n) {
                    return;
                }
                int i12 = i50Var.u1;
                boolean z12 = i10 >= i12 && i10 < i50Var.v1;
                int i13 = i50Var.x1;
                boolean z13 = i10 >= i13 && i10 < i50Var.y1;
                int i14 = i50Var.G1;
                boolean z14 = i10 >= i14 && i10 < i50Var.H1;
                if ((i10 != i50Var.p1 && !z12 && !z14) || (hashMap2 = hashMap) == null) {
                    return;
                }
                long j11 = tL_chatInviteExported2.admin_id;
                if (z12) {
                    tL_chatInviteImporter2 = (TLRPC.TL_chatInviteImporter) i50Var.V1.get(i10 - i12);
                    j11 = tL_chatInviteImporter2.user_id;
                } else if (z13) {
                    tL_chatInviteImporter2 = (TLRPC.TL_chatInviteImporter) i50Var.W1.get(i10 - i13);
                    j11 = tL_chatInviteImporter2.user_id;
                } else {
                    if (!z14) {
                        tL_chatInviteImporter = null;
                        user = (TLRPC.User) hashMap2.get(Long.valueOf(j11));
                        if (user == null) {
                            org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).X3(user, false, false);
                            if (!z12 || tL_chatInviteExported2.subscription_pricing == null) {
                                org.telegram.messenger.g0.i3(new e7((Object) i50Var, (Object) user, (Object) d2Var, 12), 100L);
                                i50Var.dismiss();
                                return;
                            }
                            TLRPC.ChatFull chatFull2 = chatFull;
                            if (chatFull2 != null && chatFull2.participants != null) {
                                for (int i15 = 0; i15 < chatFull2.participants.participants.size(); i15++) {
                                    if (chatFull2.participants.participants.get(i15).user_id == j11 && (chatFull2.participants.participants.get(i15) instanceof TLRPC.TL_chatChannelParticipant)) {
                                        channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatFull2.participants.participants.get(i15)).channelParticipant;
                                        break;
                                    }
                                }
                            }
                            channelParticipant = null;
                            Context context2 = context;
                            long j12 = j10;
                            if (channelParticipant != null) {
                                i50.M0(context2, i50Var.a, -j12, tL_chatInviteExported2.subscription_pricing, tL_chatInviteImporter, channelParticipant, i50Var.J0);
                                return;
                            }
                            org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, context2, null);
                            s1Var.r(120L);
                            org.telegram.messenger.hp.s1(i50Var.a).K0(org.telegram.messenger.hp.s1(i50Var.a).M0(Long.valueOf(j12)), user, new ci.d3(i50Var, s1Var, context2, j12, tL_chatInviteExported2, tL_chatInviteImporter, 2));
                            return;
                        }
                        return;
                    }
                    tL_chatInviteImporter2 = (TLRPC.TL_chatInviteImporter) i50Var.X1.get(i10 - i14);
                    j11 = tL_chatInviteImporter2.user_id;
                }
                tL_chatInviteImporter = tL_chatInviteImporter2;
                user = (TLRPC.User) hashMap2.get(Long.valueOf(j11));
                if (user == null) {
                }
            }
        });
        TextView textView = new TextView(context);
        this.O1 = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setTextSize(1, 20.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(org.telegram.messenger.g0.L(23.0f), 0, org.telegram.messenger.g0.L(23.0f), 0);
        textView.setGravity(16);
        textView.setTypeface(org.telegram.messenger.g0.o());
        if (z10) {
            textView.setText(org.telegram.messenger.bd.M0(2131749157, null));
            this.U1 = false;
            textView.setVisibility(4);
            textView.setAlpha(0.0f);
        } else {
            if (tL_chatInviteExported.expired) {
                textView.setText(org.telegram.messenger.bd.M0(2131750876, null));
            } else if (tL_chatInviteExported.revoked) {
                textView.setText(org.telegram.messenger.bd.M0(2131746024, null));
            } else {
                textView.setText(org.telegram.messenger.bd.M0(2131749157, null));
            }
            this.U1 = true;
        }
        if (!TextUtils.isEmpty(tL_chatInviteExported.title)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
            org.telegram.messenger.i6.l(spannableStringBuilder, textView.getPaint().getFontMetricsInt(), false);
            textView.setText(spannableStringBuilder);
        }
        this.b.addView(v40Var, b8.mf.d(-1, -1.0f, 51, 0.0f, !this.U1 ? 0.0f : 44.0f, 0.0f, 0.0f));
        this.b.addView(textView, b8.mf.d(-1, this.U1 ? 50.0f : 44.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        O0();
        K0();
        if (hashMap == null || hashMap.get(Long.valueOf(tL_chatInviteExported.admin_id)) == null) {
            TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
            tL_users_getUsers.id.add(org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).o1(tL_chatInviteExported.admin_id));
            ConnectionsManager.getInstance(org.telegram.messenger.h10.t0).sendRequest(tL_users_getUsers, new w1(this, 5));
        }
        updateColors();
    }

    public static void I0(i50 i50Var) {
        View view = i50Var.Q1;
        TextView textView = i50Var.O1;
        v40 v40Var = i50Var.N1;
        if (v40Var.getChildCount() <= 0) {
            int paddingTop = v40Var.getPaddingTop();
            i50Var.R1 = paddingTop;
            v40Var.setTopGlowOffset(paddingTop);
            textView.setTranslationY(i50Var.R1);
            view.setTranslationY(i50Var.R1);
            i50Var.b.invalidate();
            return;
        }
        int i3 = 0;
        View childAt = v40Var.getChildAt(0);
        bj0 bj0Var = (bj0) v40Var.G(childAt);
        int top = childAt.getTop();
        if (top < 0 || bj0Var == null || bj0Var.b() != 0) {
            i50Var.L0(true);
        } else {
            i50Var.L0(false);
            i3 = top;
        }
        if (i50Var.R1 != i3) {
            i50Var.R1 = i3;
            v40Var.setTopGlowOffset(i3);
            if (textView != null) {
                textView.setTranslationY(i50Var.R1);
            }
            view.setTranslationY(i50Var.R1);
            i50Var.b.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r12v3, types: [android.view.View, org.telegram.ui.Components.k9] */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r1v17, types: [android.view.View, org.telegram.ui.Components.rx0] */
    /* JADX WARN: Type inference failed for: r2v13, types: [android.view.View, android.widget.TextView, org.telegram.ui.Components.s70] */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    public static void M0(Context context, int i3, long j10, TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant, org.telegram.ui.ActionBar.e6 e6Var) {
        boolean z10;
        Object obj;
        int i10;
        String str;
        org.telegram.ui.ActionBar.t2 l10 = org.telegram.messenger.k5.l(1, context, e6Var, false);
        org.telegram.ui.ActionBar.t2[] t2VarArr = new org.telegram.ui.ActionBar.t2[1];
        ?? f10 = org.telegram.messenger.k5.f(context, 1);
        f10.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(4.0f));
        f10.setClipChildren(false);
        f10.setClipToPadding(false);
        ?? frameLayout = new FrameLayout(context);
        f10.addView(frameLayout, b8.mf.t(-1, -2, 7, 0, 0, 0, 10));
        ?? k9Var = new k9(context);
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(50.0f));
        u8 u8Var = new u8((org.telegram.ui.ActionBar.e6) null);
        if (j10 >= 0) {
            z10 = 0;
            TLRPC.User a22 = org.telegram.messenger.hp.s1(i3).a2(Long.valueOf(j10));
            u8Var.r(a22);
            k9Var.e(a22, u8Var);
        } else {
            z10 = 0;
            TLRPC.Chat M0 = org.telegram.messenger.hp.s1(i3).M0(Long.valueOf(-j10));
            u8Var.q(M0);
            k9Var.e(M0, u8Var);
        }
        frameLayout.addView(k9Var, b8.mf.e(100, 100, 17));
        Drawable drawable = context.getResources().getDrawable(R.drawable.star_small_outline);
        int i11 = org.telegram.ui.ActionBar.k6.h5;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i11, e6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
        Drawable drawable2 = context.getResources().getDrawable(R.drawable.star_small_inner);
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(drawable);
        org.telegram.ui.ActionBar.r6.y(imageView, drawable, i11, e6Var, mode);
        frameLayout.addView(imageView, b8.mf.e(28, 28, 17));
        imageView.setTranslationX(org.telegram.messenger.g0.L(34.0f));
        imageView.setTranslationY(org.telegram.messenger.g0.L(35.0f));
        imageView.setScaleX(1.1f);
        imageView.setScaleY(1.1f);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(drawable2);
        frameLayout.addView(imageView2, b8.mf.e(28, 28, 17));
        imageView2.setTranslationX(org.telegram.messenger.g0.L(34.0f));
        imageView2.setTranslationY(org.telegram.messenger.g0.L(35.0f));
        TextView textView = new TextView(context);
        org.telegram.messenger.k5.n(textView, org.telegram.ui.ActionBar.k6.j5, e6Var, 1, 20.0f);
        org.telegram.messenger.k5.m(textView, 17, null, 2131744981);
        TextView f11 = org.telegram.messenger.camera.q.f(f10, textView, b8.mf.t(-1, -2, 17, 20, 0, 20, 4), context);
        f11.setTextSize(1, 14.0f);
        f11.setGravity(17);
        int i12 = org.telegram.ui.ActionBar.k6.B6;
        org.telegram.ui.ActionBar.r6.V(f11, i12, e6Var);
        int i13 = tL_starsSubscriptionPricing.period;
        if (i13 == 2592000) {
            obj = "min";
            Object[] objArr = new Object[1];
            objArr[z10] = Long.valueOf(tL_starsSubscriptionPricing.amount);
            f11.setText(ci.wb.a1(z10, org.telegram.messenger.bd.a0(null, null, 2131744993, objArr), 0.8f, null));
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
            f11.setText(ci.wb.a1(z11, String.format(locale, "⭐%1$d/%2$s", objArr2), 0.8f, null));
        }
        TextView f12 = org.telegram.messenger.camera.q.f(f10, f11, b8.mf.t(-1, -2, 17, 20, 0, 20, 4), context);
        f12.setTextSize(1, 14.0f);
        f12.setGravity(17);
        org.telegram.ui.ActionBar.r6.V(f12, i10, e6Var);
        int i14 = tL_starsSubscriptionPricing.period;
        if (i14 == 2592000) {
            f12.setText(org.telegram.messenger.bd.a0(null, null, 2131745068, org.telegram.messenger.r1.i().f((int) ((tL_starsSubscriptionPricing.amount / 1000.0d) * org.telegram.messenger.hp.s1(i3).c6), "USD")));
        } else {
            f12.setText(String.format(Locale.US, "appx. %1$s per %2$s", org.telegram.messenger.r1.i().f((int) (org.telegram.messenger.hp.s1(i3).c6 * (tL_starsSubscriptionPricing.amount / 1000.0d)), "USD"), i14 == 300 ? "5min" : obj));
        }
        f10.addView(f12, b8.mf.t(-1, -2, 17, 20, 0, 20, 4));
        ?? rx0Var = new rx0(context, e6Var);
        ?? s70Var = new s70(context, e6Var);
        s70Var.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        s70Var.setEllipsize(TextUtils.TruncateAt.END);
        int i15 = org.telegram.ui.ActionBar.k6.Uc;
        org.telegram.ui.ActionBar.r6.V(s70Var, i15, e6Var);
        org.telegram.ui.ActionBar.r6.H(s70Var, i15, e6Var);
        s70Var.setTextSize(1, 14.0f);
        s70Var.setSingleLine(true);
        s70Var.setDisablePaddingsOffsetY(true);
        org.telegram.ui.h5 h5Var = new org.telegram.ui.h5(24.0f, i3, s70Var);
        TLRPC.User a23 = org.telegram.messenger.hp.s1(i3).a2(Long.valueOf(tL_chatInviteImporter.user_id));
        boolean z12 = a23 == null;
        String p10 = org.telegram.messenger.l10.p(a23);
        h5Var.e(a23);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) p10));
        spannableStringBuilder.setSpan(h5Var, 0, 1, 33);
        spannableStringBuilder.setSpan(new x40(t2VarArr, tL_chatInviteImporter), 3, spannableStringBuilder.length(), 33);
        s70Var.setText(spannableStringBuilder);
        if (z12) {
            str = null;
        } else {
            str = null;
            rx0Var.l(s70Var, org.telegram.messenger.bd.M0(2131745069, null));
        }
        rx0Var.c(org.telegram.messenger.bd.M0(2131745064, str), org.telegram.messenger.bd.a0(null, null, 2131742793, org.telegram.messenger.bd.E0().s0().format(new Date(tL_chatInviteImporter.date * 1000)), org.telegram.messenger.bd.E0().p0().format(new Date(tL_chatInviteImporter.date * 1000))), null, null);
        int currentTime = ConnectionsManager.getInstance(i3).getCurrentTime();
        if (channelParticipant != null) {
            rx0Var.c(org.telegram.messenger.bd.M0(channelParticipant.subscription_until_date > currentTime ? 2131745065 : 2131745067, null), org.telegram.messenger.bd.a0(null, null, 2131742793, org.telegram.messenger.bd.E0().s0().format(new Date(channelParticipant.subscription_until_date * 1000)), org.telegram.messenger.bd.E0().p0().format(new Date(channelParticipant.subscription_until_date * 1000))), null, null);
        }
        f10.addView(rx0Var, b8.mf.k(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
        s70 s70Var2 = new s70(context, e6Var);
        org.telegram.ui.ActionBar.r6.V(s70Var2, org.telegram.ui.ActionBar.k6.z6, e6Var);
        org.telegram.ui.ActionBar.r6.H(s70Var2, i15, e6Var);
        s70Var2.setTextSize(1, 14.0f);
        s70Var2.setText(org.telegram.messenger.g0.U2(org.telegram.messenger.bd.M0(2131744936, null), new n10(context, 1)));
        s70Var2.setGravity(17);
        f10.addView(s70Var2, b8.mf.k(14.0f, 15.0f, 14.0f, 15.0f, -1, -2));
        gi.d dVar = new gi.d(context, e6Var, true);
        dVar.i(org.telegram.messenger.bd.M0(2131747839, null), false, true);
        f10.addView(dVar, b8.mf.o(-1, 48));
        dVar.setOnClickListener(new g2(t2VarArr, 2));
        l10.O = f10;
        t2VarArr[0] = l10;
        l10.U0 = false;
        l10.N();
        t2VarArr[0].show();
    }

    public static void N0(View view) {
        if (view instanceof org.telegram.ui.Cells.n4) {
            ((org.telegram.ui.Cells.n4) view).getTextView().setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.L6, false));
            return;
        }
        if (view instanceof m70) {
            ((m70) view).f();
        } else if (view instanceof org.telegram.ui.Cells.y8) {
            org.telegram.ui.ActionBar.r6.V(((org.telegram.ui.Cells.y8) view).getTextView(), org.telegram.ui.ActionBar.k6.B6, null);
        } else if (view instanceof org.telegram.ui.Cells.pa) {
            ((org.telegram.ui.Cells.pa) view).i(0);
        }
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final boolean G() {
        return false;
    }

    public final void J0() {
        TextView textView = this.O1;
        if (textView != null) {
            try {
                textView.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.j5, false));
                textView.setLinkTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.k5, false));
                textView.setHighlightColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.l5, false));
                if (!this.U1) {
                    textView.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false));
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        v40 v40Var = this.N1;
        if (v40Var != null) {
            v40Var.setGlowColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.A5, false));
        }
        View view = this.Q1;
        if (view != null) {
            view.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.V5, false));
        }
    }

    public final void K0() {
        final boolean z10;
        final boolean z11;
        if (this.I1) {
            return;
        }
        TLRPC.TL_chatInviteExported tL_chatInviteExported = this.j1;
        int i3 = tL_chatInviteExported.usage;
        ArrayList arrayList = this.V1;
        boolean z12 = i3 > arrayList.size();
        int i10 = tL_chatInviteExported.subscription_expired;
        ArrayList arrayList2 = this.W1;
        final boolean z13 = i10 > arrayList2.size();
        boolean z14 = tL_chatInviteExported.request_needed;
        ArrayList arrayList3 = this.X1;
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
        tL_messages_getChatInviteImporters.peer = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).j1(-this.Y1);
        tL_messages_getChatInviteImporters.requested = z11;
        tL_messages_getChatInviteImporters.subscription_expired = z10;
        if (arrayList4.isEmpty()) {
            tL_messages_getChatInviteImporters.offset_user = new TLRPC.TL_inputUserEmpty();
        } else {
            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) arrayList4.get(arrayList4.size() - 1);
            tL_messages_getChatInviteImporters.offset_user = org.telegram.messenger.hp.s1(this.a).q1((TLRPC.User) this.k1.get(Long.valueOf(tL_chatInviteImporter.user_id)));
            tL_messages_getChatInviteImporters.offset_date = tL_chatInviteImporter.date;
        }
        this.I1 = true;
        ConnectionsManager.getInstance(org.telegram.messenger.h10.t0).sendRequest(tL_messages_getChatInviteImporters, new RequestDelegate() { // from class: org.telegram.ui.Components.s40
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final i50 i50Var = i50.this;
                final ArrayList arrayList5 = arrayList4;
                final boolean z16 = z11;
                final boolean z17 = z10;
                final boolean z18 = z15;
                final boolean z19 = z13;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.Components.t40
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
                        i50 i50Var2 = i50.this;
                        if (tL_error == null) {
                            TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) tLObject;
                            ArrayList<TLRPC.TL_chatInviteImporter> arrayList6 = tL_messages_chatInviteImporters.importers;
                            ArrayList arrayList7 = arrayList5;
                            arrayList7.addAll(arrayList6);
                            for (int i11 = 0; i11 < tL_messages_chatInviteImporters.users.size(); i11++) {
                                TLRPC.User user = tL_messages_chatInviteImporters.users.get(i11);
                                i50Var2.k1.put(Long.valueOf(user.id), user);
                            }
                            boolean z20 = true;
                            if (!z16) {
                                boolean z21 = z17;
                                boolean z22 = z18;
                                if (z21) {
                                    i50Var2.J1 = z20;
                                    i50Var2.O0();
                                } else {
                                    i50Var2.J1 = z20;
                                    i50Var2.O0();
                                }
                            }
                        }
                        i50Var2.I1 = false;
                    }
                });
            }
        });
    }

    public final void L0(boolean z10) {
        View view = this.Q1;
        if ((!z10 || view.getTag() == null) && (z10 || view.getTag() != null)) {
            return;
        }
        view.setTag(z10 ? null : 1);
        TextView textView = this.O1;
        if (z10) {
            view.setVisibility(0);
            textView.setVisibility(0);
        }
        AnimatorSet animatorSet = this.P1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.P1 = animatorSet2;
        Property property = View.ALPHA;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, z10 ? 1.0f : 0.0f));
        if (!this.U1) {
            this.P1.playTogether(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, z10 ? 1.0f : 0.0f));
        }
        this.P1.setDuration(150L);
        this.P1.addListener(new s9(12, this, z10));
        this.P1.start();
    }

    public final void O0() {
        boolean z10 = false;
        this.K1 = 0;
        this.q1 = -1;
        this.r1 = -1;
        this.s1 = -1;
        this.t1 = -1;
        this.u1 = -1;
        this.v1 = -1;
        this.C1 = -1;
        this.D1 = -1;
        this.z1 = -1;
        this.A1 = -1;
        this.E1 = -1;
        this.F1 = -1;
        this.G1 = -1;
        this.H1 = -1;
        this.B1 = -1;
        this.m1 = -1;
        this.n1 = -1;
        this.w1 = -1;
        this.x1 = -1;
        this.y1 = -1;
        boolean z11 = true;
        if (!this.T1) {
            this.z1 = 0;
            this.K1 = 2;
            this.A1 = 1;
        }
        TLRPC.TL_chatInviteExported tL_chatInviteExported = this.j1;
        if (tL_chatInviteExported.subscription_pricing != null) {
            int i3 = this.K1;
            this.m1 = i3;
            this.K1 = i3 + 2;
            this.n1 = i3 + 1;
        }
        int i10 = this.K1;
        this.o1 = i10;
        this.K1 = i10 + 2;
        this.p1 = i10 + 1;
        int i11 = tL_chatInviteExported.usage;
        boolean z12 = i11 > 0 || tL_chatInviteExported.usage_limit > 0 || tL_chatInviteExported.requested > 0 || tL_chatInviteExported.subscription_expired > 0;
        ArrayList arrayList = this.V1;
        int size = arrayList.size();
        ArrayList arrayList2 = this.X1;
        ArrayList arrayList3 = this.W1;
        boolean z13 = i11 > size || tL_chatInviteExported.subscription_expired > arrayList3.size() || (tL_chatInviteExported.request_needed && tL_chatInviteExported.requested > arrayList2.size());
        if (!arrayList.isEmpty()) {
            int i12 = this.K1;
            int i13 = i12 + 1;
            this.K1 = i13;
            this.t1 = i12;
            this.u1 = i13;
            int size2 = arrayList.size() + i13;
            this.K1 = size2;
            this.v1 = size2;
            z10 = true;
        }
        if (!arrayList3.isEmpty()) {
            int i14 = this.K1;
            int i15 = i14 + 1;
            this.K1 = i15;
            this.w1 = i14;
            this.x1 = i15;
            int size3 = arrayList3.size() + i15;
            this.K1 = size3;
            this.y1 = size3;
            z10 = true;
        }
        if (arrayList2.isEmpty()) {
            z11 = z10;
        } else {
            int i16 = this.K1;
            int i17 = i16 + 1;
            this.K1 = i17;
            this.F1 = i16;
            this.G1 = i17;
            int size4 = arrayList2.size() + i17;
            this.K1 = size4;
            this.H1 = size4;
        }
        if ((z12 || z13) && !z11) {
            int i18 = this.K1;
            this.q1 = i18;
            this.B1 = i18 + 1;
            this.K1 = i18 + 3;
            this.C1 = i18 + 2;
        }
        this.L1.f();
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void s0() {
        int i3;
        super.s0();
        try {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, this.J0);
            if (this.s0 != null) {
                v0(w02);
            }
            if (this.G0 < 0 && (i3 = this.H0) == this.e2 && w02 != i3) {
                this.H0 = w02;
                this.e2 = w02;
                E0(w02);
            }
            J0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog
    public final void show() {
        super.show();
        this.d2 = false;
    }

    public final void updateColors() {
        TextView textView = this.O1;
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.j5, false));
            textView.setLinkTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.k5, false));
            textView.setHighlightColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.l5, false));
            if (!this.U1) {
                textView.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false));
            }
        }
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.A5, false);
        v40 v40Var = this.N1;
        v40Var.setGlowColor(x02);
        this.Q1.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.V5, false));
        v0(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.a7, false));
        int hiddenChildCount = v40Var.getHiddenChildCount();
        for (int i3 = 0; i3 < v40Var.getChildCount(); i3++) {
            N0(v40Var.getChildAt(i3));
        }
        for (int i10 = 0; i10 < hiddenChildCount; i10++) {
            N0(v40Var.V(i10));
        }
        int cachedChildCount = v40Var.getCachedChildCount();
        for (int i11 = 0; i11 < cachedChildCount; i11++) {
            N0(v40Var.P(i11));
        }
        int attachedScrapChildCount = v40Var.getAttachedScrapChildCount();
        for (int i12 = 0; i12 < attachedScrapChildCount; i12++) {
            N0(v40Var.O(i12));
        }
        this.b.invalidate();
    }
}
