package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class bf0 extends FrameLayout {
    public final ci.q E;
    public final k9 F;
    public final TextView G;
    public final TextView H;
    public final gi.d I;
    public final TextView J;
    public boolean K;
    public int L;
    public int M;
    public boolean N;
    public boolean O;
    public int P;
    public boolean Q;
    public boolean R;
    public wp S;
    public wp T;
    public org.telegram.messenger.t U;
    public final wp[] V;
    public final ye0 W;
    public final org.telegram.ui.uw a;
    public final int b;
    public final l41 c;
    public TLRPC.SearchPostsFlood d;
    public final ArrayList e;
    public int f;
    public boolean h;
    public final ArrayList n;
    public int r;
    public boolean s;
    public boolean w;
    public String x;
    public final FrameLayout y;

    public bf0(Context context, org.telegram.ui.uw uwVar) {
        super(context);
        this.e = new ArrayList();
        this.n = new ArrayList();
        this.L = -1;
        this.M = 0;
        this.P = -1;
        this.V = new wp[1];
        this.W = new ye0(this, 1);
        this.a = uwVar;
        int currentAccount = uwVar.getCurrentAccount();
        this.b = currentAccount;
        l41 l41Var = new l41(context, currentAccount, 0, false, new e(this, 18), new zw(this, 12), null, null);
        this.c = l41Var;
        l41Var.j(new ai.i4(5, this, uwVar));
        addView(l41Var, b8.mf.e(-1, -1, org.telegram.messenger.hs.E1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.y = frameLayout;
        ci.q qVar = new ci.q(context, 8);
        this.E = qVar;
        qVar.setOrientation(1);
        frameLayout.addView(qVar, b8.mf.d(-2, -2.0f, 17, 32.0f, 0.0f, 32.0f, 0.0f));
        k9 k9Var = new k9(context);
        this.F = k9Var;
        k9Var.setVisibility(8);
        qVar.addView(k9Var, b8.mf.t(org.telegram.messenger.hs.O1, org.telegram.messenger.hs.O1, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        this.G = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setSingleLine(false);
        textView.setMaxLines(4);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        qVar.addView(textView, b8.mf.r(-2, -2, 1));
        TextView textView2 = new TextView(context);
        this.H = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setSingleLine(false);
        textView2.setMaxLines(4);
        textView2.setEllipsize(truncateAt);
        qVar.addView(textView2, b8.mf.t(-2, -2, 1, 0, 9, 0, 0));
        gi.d h = org.telegram.messenger.k5.h(24, context, null, true);
        this.I = h;
        qVar.addView(h, b8.mf.t(-1, 44, 7, 0, 19, 0, 0));
        TextView textView3 = new TextView(context);
        this.J = textView3;
        textView3.setTextSize(1, 12.0f);
        textView3.setGravity(17);
        qVar.addView(textView3, b8.mf.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        addView(frameLayout, b8.mf.e(-1, -1, org.telegram.messenger.hs.E1));
        l41Var.setHideIfEmpty(false);
        l41Var.setEmptyView(frameLayout);
        l41Var.X1 = true;
        l41Var.Y1 = 0;
        c();
        d();
    }

    public final void a(boolean z10) {
        long j10;
        TLRPC.SearchPostsFlood searchPostsFlood;
        if (this.w) {
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(this.x);
        if (isEmpty && this.h) {
            return;
        }
        if (isEmpty || !this.s) {
            if (isEmpty || this.d != null) {
                this.w = true;
                int i3 = this.b;
                org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i3);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i3);
                TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                tL_channels_searchPosts.flags |= 2;
                tL_channels_searchPosts.query = this.x;
                tL_channels_searchPosts.limit = 30;
                if (isEmpty) {
                    ArrayList arrayList = this.e;
                    if (arrayList.isEmpty()) {
                        tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    } else {
                        org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) k2.p1.h(1, arrayList);
                        tL_channels_searchPosts.offset_rate = this.f;
                        tL_channels_searchPosts.offset_id = ziVar.M1();
                        tL_channels_searchPosts.offset_peer = s12.m1(ziVar.k.peer_id);
                    }
                } else {
                    ArrayList arrayList2 = this.n;
                    if (arrayList2.isEmpty()) {
                        tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    } else {
                        org.telegram.messenger.zi ziVar2 = (org.telegram.messenger.zi) k2.p1.h(1, arrayList2);
                        tL_channels_searchPosts.offset_rate = this.r;
                        tL_channels_searchPosts.offset_id = ziVar2.M1();
                        tL_channels_searchPosts.offset_peer = s12.m1(ziVar2.k.peer_id);
                    }
                }
                if (!z10 || (searchPostsFlood = this.d) == null) {
                    j10 = 0;
                } else {
                    tL_channels_searchPosts.flags |= 4;
                    j10 = searchPostsFlood.stars_amount;
                    tL_channels_searchPosts.allow_paid_stars = j10;
                }
                this.L = connectionsManager.sendRequest(tL_channels_searchPosts, new z6(this, s12, isEmpty, tL_channels_searchPosts, z10, j10, connectionsManager), 1024);
                d();
                this.c.g3.O(true);
            }
        }
    }

    public final void b(String str) {
        int i3 = this.P;
        int i10 = this.b;
        if (i3 >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.P, true);
            this.P = -1;
        }
        if (!this.N) {
            this.O = this.R && !(this.n.isEmpty() && this.s);
        }
        this.N = true;
        TLRPC.TL_channels_checkSearchPostsFlood tL_channels_checkSearchPostsFlood = new TLRPC.TL_channels_checkSearchPostsFlood();
        if (!TextUtils.isEmpty(str)) {
            tL_channels_checkSearchPostsFlood.flags = 1 | tL_channels_checkSearchPostsFlood.flags;
            tL_channels_checkSearchPostsFlood.query = str;
        }
        this.P = ConnectionsManager.getInstance(i10).sendRequest(tL_channels_checkSearchPostsFlood, new w1(this, 8));
    }

    public final void c() {
        this.y.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false));
        this.G.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
        int i3 = org.telegram.ui.ActionBar.k6.y6;
        this.J.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i3, false));
        this.H.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i3, false));
        l41 l41Var = this.c;
        l41Var.setAdapter(null);
        l41Var.setAdapter(l41Var.g3);
        if (this.U != null) {
            this.U = null;
            d();
        }
    }

    public final void d() {
        TLRPC.SearchPostsFlood searchPostsFlood;
        ye0 ye0Var = this.W;
        org.telegram.messenger.g0.r(ye0Var);
        int i3 = this.b;
        int currentTime = ConnectionsManager.getInstance(i3).getCurrentTime();
        boolean q10 = org.telegram.messenger.h10.i(i3).q();
        TextView textView = this.H;
        TextView textView2 = this.G;
        k9 k9Var = this.F;
        TextView textView3 = this.J;
        final int i10 = 1;
        final int i11 = 0;
        gi.d dVar = this.I;
        if (!q10) {
            k9Var.setVisibility(8);
            textView2.setText(org.telegram.messenger.bd.M0(2131745723, null));
            textView.setText(org.telegram.messenger.bd.M0(2131745724, null));
            dVar.setVisibility(0);
            dVar.i(org.telegram.messenger.bd.M0(2131745738, null), true, true);
            dVar.g(null, true);
            dVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ze0
                public final /* synthetic */ bf0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            this.b.a.presentFragment(new PremiumPreviewFragment(0, "search"));
                            break;
                        case 1:
                            bf0 bf0Var = this.b;
                            bf0Var.I.setLoading(true);
                            bf0Var.a(true);
                            break;
                        default:
                            bf0 bf0Var2 = this.b;
                            bf0Var2.I.setLoading(true);
                            bf0Var2.a(false);
                            break;
                    }
                }
            });
            textView3.setVisibility(0);
            textView3.setText(org.telegram.messenger.bd.M0(2131745725, null));
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(this.x);
        ArrayList arrayList = this.n;
        if (!isEmpty && arrayList.isEmpty() && this.s) {
            if (k9Var.getImageReceiver().T == null) {
                k9Var.setImageDrawable(new ch0(R.raw.utyan_empty, org.telegram.messenger.g0.L(130.0f), org.telegram.messenger.g0.L(130.0f)));
            }
            k9Var.setVisibility(0);
            textView2.setText(org.telegram.messenger.bd.M0(2131745727, null));
            textView.setText(org.telegram.messenger.bd.a0(null, null, 2131745726, TextUtils.ellipsize(this.x, textView.getPaint(), org.telegram.messenger.g0.L(100.0f), TextUtils.TruncateAt.END)));
            dVar.setVisibility(8);
            textView3.setVisibility(8);
            return;
        }
        final int i12 = 2;
        if (!TextUtils.isEmpty(this.x) && (searchPostsFlood = this.d) != null && (searchPostsFlood.flags & 2) != 0 && currentTime < searchPostsFlood.wait_till) {
            k9Var.setVisibility(8);
            textView2.setText(org.telegram.messenger.bd.M0(2131745731, null));
            textView.setText(org.telegram.messenger.bd.H(',', "SearchPostsLimitReachedText", this.d.total_daily));
            int i13 = this.d.wait_till - currentTime;
            int i14 = i13 / 3600;
            int i15 = i13 - (i14 * 3600);
            int i16 = i15 / 60;
            int i17 = i15 - (i16 * 60);
            dVar.setVisibility(0);
            dVar.i(ci.wb.U0(org.telegram.messenger.bd.H(',', "SearchPostsButtonPay", (int) this.d.stars_amount), 1.13f, this.V), true, true);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i14 > 0 ? com.google.android.recaptcha.internal.a.h(i14, ":") : "");
            sb2.append(i16 < 10 ? k2.p1.i(i16, "0") : Integer.valueOf(i16));
            sb2.append(":");
            sb2.append(i17 < 10 ? k2.p1.i(i17, "0") : Integer.valueOf(i17));
            dVar.g(org.telegram.messenger.bd.a0(null, null, 2131745737, sb2.toString()), true);
            dVar.e.r(false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ze0
                public final /* synthetic */ bf0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            this.b.a.presentFragment(new PremiumPreviewFragment(0, "search"));
                            break;
                        case 1:
                            bf0 bf0Var = this.b;
                            bf0Var.I.setLoading(true);
                            bf0Var.a(true);
                            break;
                        default:
                            bf0 bf0Var2 = this.b;
                            bf0Var2.I.setLoading(true);
                            bf0Var2.a(false);
                            break;
                    }
                }
            });
            org.telegram.messenger.g0.i3(ye0Var, 1000L);
            textView3.setVisibility(8);
            return;
        }
        if (!arrayList.isEmpty() || this.w || TextUtils.isEmpty(this.x)) {
            k9Var.setVisibility(8);
            textView2.setText(org.telegram.messenger.bd.M0(2131745723, null));
            textView.setText(org.telegram.messenger.bd.M0(2131745724, null));
            dVar.setVisibility(8);
            if (this.d == null) {
                textView3.setVisibility(8);
                return;
            }
            textView3.setVisibility(0);
            TLRPC.SearchPostsFlood searchPostsFlood2 = this.d;
            int i18 = searchPostsFlood2.remains;
            if (i18 < 1) {
                i18 = searchPostsFlood2.total_daily;
            }
            textView3.setText(org.telegram.messenger.bd.H(',', "SearchPostsFreeSearches", i18));
            return;
        }
        k9Var.setVisibility(8);
        textView2.setText(org.telegram.messenger.bd.M0(2131745723, null));
        textView.setText(org.telegram.messenger.bd.M0(2131745724, null));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("s ");
        if (this.S == null) {
            wp wpVar = new wp(R.drawable.smiles_tab_search, 0);
            this.S = wpVar;
            wpVar.I = 0.79f;
            wpVar.J = 0.79f;
        }
        if (this.U == null) {
            this.U = new org.telegram.messenger.t(org.telegram.ui.ActionBar.k6.w(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false), org.telegram.ui.ActionBar.k6.r1(0.75f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Gi, false))), 3, false);
        }
        spannableStringBuilder.setSpan(this.S, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.bd.M0(2131745742, null));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(TextUtils.ellipsize(this.x, dVar.getTextPaint(), org.telegram.messenger.g0.L(100.0f), TextUtils.TruncateAt.END));
        spannableStringBuilder.setSpan(this.U, length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) " >");
        if (this.T == null) {
            wp wpVar2 = new wp(R.drawable.msg_mini_forumarrow, 0);
            this.T = wpVar2;
            wpVar2.I = 1.05f;
            wpVar2.J = 1.05f;
        }
        spannableStringBuilder.setSpan(this.T, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        dVar.setVisibility(0);
        dVar.i(spannableStringBuilder, true, true);
        dVar.d.r(false, false);
        dVar.g(null, true);
        dVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ze0
            public final /* synthetic */ bf0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.b.a.presentFragment(new PremiumPreviewFragment(0, "search"));
                        break;
                    case 1:
                        bf0 bf0Var = this.b;
                        bf0Var.I.setLoading(true);
                        bf0Var.a(true);
                        break;
                    default:
                        bf0 bf0Var2 = this.b;
                        bf0Var2.I.setLoading(true);
                        bf0Var2.a(false);
                        break;
                }
            }
        });
        if (this.d == null) {
            textView3.setVisibility(8);
            return;
        }
        textView3.setVisibility(0);
        TLRPC.SearchPostsFlood searchPostsFlood3 = this.d;
        int i19 = searchPostsFlood3.remains;
        if (i19 < 1) {
            i19 = searchPostsFlood3.total_daily;
        }
        textView3.setText(org.telegram.messenger.bd.H(',', "SearchPostsFreeSearches", i19));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d == null) {
            b(null);
        }
        if (this.Q) {
            return;
        }
        this.Q = true;
        org.telegram.messenger.hp.e1().edit().putInt("searchpostsnew", org.telegram.messenger.hp.e1().getInt("searchpostsnew", 0) + 1).apply();
        ci.e9.y(this.b, false).p();
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.K) {
            return;
        }
        super.requestLayout();
    }

    public void setKeyboardHeight(int i3) {
        this.E.animate().translationY((-i3) / 2.0f).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.h1.w).start();
    }
}
