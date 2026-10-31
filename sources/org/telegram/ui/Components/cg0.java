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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class cg0 extends FrameLayout {
    public final jg.z2 D;
    public final g9 E;
    public final TextView F;
    public final TextView G;
    public final vh.d H;
    public final TextView I;
    public boolean J;
    public int K;
    public int L;
    public boolean M;
    public boolean N;
    public int O;
    public boolean P;
    public boolean Q;
    public dq R;
    public dq S;
    public org.telegram.messenger.u T;
    public final dq[] U;
    public final zf0 V;
    public final org.telegram.ui.ay a;
    public final int b;
    public final u51 c;
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

    public cg0(Context context, org.telegram.ui.ay ayVar) {
        super(context);
        this.e = new ArrayList();
        this.n = new ArrayList();
        this.K = -1;
        this.L = 0;
        this.O = -1;
        this.U = new dq[1];
        this.V = new zf0(this, 1);
        this.a = ayVar;
        int currentAccount = ayVar.getCurrentAccount();
        this.b = currentAccount;
        u51 u51Var = new u51(context, currentAccount, 0, false, new d(this, 18), new px(this, 12), null, null);
        this.c = u51Var;
        u51Var.j(new bi.t3(5, this, ayVar));
        addView(u51Var, w7.b6.e(-1, -1, org.telegram.messenger.zs.E1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.y = frameLayout;
        jg.z2 z2Var = new jg.z2(context, 8);
        this.D = z2Var;
        z2Var.setOrientation(1);
        frameLayout.addView(z2Var, w7.b6.d(-2, -2.0f, 17, 32.0f, 0.0f, 32.0f, 0.0f));
        g9 g9Var = new g9(context);
        this.E = g9Var;
        g9Var.setVisibility(8);
        z2Var.addView(g9Var, w7.b6.t(org.telegram.messenger.zs.O1, org.telegram.messenger.zs.O1, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        this.F = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setGravity(17);
        textView.setSingleLine(false);
        textView.setMaxLines(4);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        z2Var.addView(textView, w7.b6.r(-2, -2, 1));
        TextView textView2 = new TextView(context);
        this.G = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setSingleLine(false);
        textView2.setMaxLines(4);
        textView2.setEllipsize(truncateAt);
        z2Var.addView(textView2, w7.b6.t(-2, -2, 1, 0, 9, 0, 0));
        vh.d i10 = org.telegram.messenger.z20.i(24, context, null, true);
        this.H = i10;
        z2Var.addView(i10, w7.b6.t(-1, 44, 7, 0, 19, 0, 0));
        TextView textView3 = new TextView(context);
        this.I = textView3;
        textView3.setTextSize(1, 12.0f);
        textView3.setGravity(17);
        z2Var.addView(textView3, w7.b6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        addView(frameLayout, w7.b6.e(-1, -1, org.telegram.messenger.zs.E1));
        u51Var.setHideIfEmpty(false);
        u51Var.setEmptyView(frameLayout);
        u51Var.W1 = true;
        u51Var.X1 = 0;
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
                int i10 = this.b;
                org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(i10);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                tL_channels_searchPosts.flags |= 2;
                tL_channels_searchPosts.query = this.x;
                tL_channels_searchPosts.limit = 30;
                if (isEmpty) {
                    ArrayList arrayList = this.e;
                    if (arrayList.isEmpty()) {
                        tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    } else {
                        org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) i0.a.g(1, arrayList);
                        tL_channels_searchPosts.offset_rate = this.f;
                        tL_channels_searchPosts.offset_id = jjVar.M1();
                        tL_channels_searchPosts.offset_peer = r12.l1(jjVar.k.peer_id);
                    }
                } else {
                    ArrayList arrayList2 = this.n;
                    if (arrayList2.isEmpty()) {
                        tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    } else {
                        org.telegram.messenger.jj jjVar2 = (org.telegram.messenger.jj) i0.a.g(1, arrayList2);
                        tL_channels_searchPosts.offset_rate = this.r;
                        tL_channels_searchPosts.offset_id = jjVar2.M1();
                        tL_channels_searchPosts.offset_peer = r12.l1(jjVar2.k.peer_id);
                    }
                }
                if (!z10 || (searchPostsFlood = this.d) == null) {
                    j10 = 0;
                } else {
                    tL_channels_searchPosts.flags |= 4;
                    j10 = searchPostsFlood.stars_amount;
                    tL_channels_searchPosts.allow_paid_stars = j10;
                }
                this.K = connectionsManager.sendRequest(tL_channels_searchPosts, new x6(this, r12, isEmpty, tL_channels_searchPosts, z10, j10, connectionsManager), 1024);
                d();
                this.c.f3.O(true);
            }
        }
    }

    public final void b(String str) {
        int i10 = this.O;
        int i11 = this.b;
        if (i10 >= 0) {
            ConnectionsManager.getInstance(i11).cancelRequest(this.O, true);
            this.O = -1;
        }
        if (!this.M) {
            this.N = this.Q && !(this.n.isEmpty() && this.s);
        }
        this.M = true;
        TLRPC.TL_channels_checkSearchPostsFlood tL_channels_checkSearchPostsFlood = new TLRPC.TL_channels_checkSearchPostsFlood();
        if (!TextUtils.isEmpty(str)) {
            tL_channels_checkSearchPostsFlood.flags = 1 | tL_channels_checkSearchPostsFlood.flags;
            tL_channels_checkSearchPostsFlood.query = str;
        }
        this.O = ConnectionsManager.getInstance(i11).sendRequest(tL_channels_checkSearchPostsFlood, new x1(this, 8));
    }

    public final void c() {
        this.y.setBackgroundColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.d6, false));
        this.F.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false));
        int i10 = org.telegram.ui.ActionBar.t6.y6;
        this.I.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i10, false));
        this.G.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i10, false));
        u51 u51Var = this.c;
        u51Var.setAdapter(null);
        u51Var.setAdapter(u51Var.f3);
        if (this.T != null) {
            this.T = null;
            d();
        }
    }

    public final void d() {
        TLRPC.SearchPostsFlood searchPostsFlood;
        zf0 zf0Var = this.V;
        org.telegram.messenger.i0.r(zf0Var);
        int i10 = this.b;
        int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        boolean q6 = org.telegram.messenger.d20.i(i10).q();
        TextView textView = this.G;
        TextView textView2 = this.F;
        g9 g9Var = this.E;
        TextView textView3 = this.I;
        final int i11 = 1;
        final int i12 = 0;
        vh.d dVar = this.H;
        if (!q6) {
            g9Var.setVisibility(8);
            textView2.setText(org.telegram.messenger.cd.L0(2131745730, null));
            textView.setText(org.telegram.messenger.cd.L0(2131745731, null));
            dVar.setVisibility(0);
            dVar.i(org.telegram.messenger.cd.L0(2131745745, null), true, true);
            dVar.g(null, true);
            dVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ag0
                public final /* synthetic */ cg0 b;

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
                            cg0 cg0Var = this.b;
                            cg0Var.H.setLoading(true);
                            cg0Var.a(true);
                            break;
                        default:
                            cg0 cg0Var2 = this.b;
                            cg0Var2.H.setLoading(true);
                            cg0Var2.a(false);
                            break;
                    }
                }
            });
            textView3.setVisibility(0);
            textView3.setText(org.telegram.messenger.cd.L0(2131745732, null));
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(this.x);
        ArrayList arrayList = this.n;
        if (!isEmpty && arrayList.isEmpty() && this.s) {
            if (g9Var.getImageReceiver().S == null) {
                g9Var.setImageDrawable(new bi0(R.raw.utyan_empty, org.telegram.messenger.i0.L(130.0f), org.telegram.messenger.i0.L(130.0f)));
            }
            g9Var.setVisibility(0);
            textView2.setText(org.telegram.messenger.cd.L0(2131745734, null));
            textView.setText(org.telegram.messenger.cd.a0(null, null, 2131745733, TextUtils.ellipsize(this.x, textView.getPaint(), org.telegram.messenger.i0.L(100.0f), TextUtils.TruncateAt.END)));
            dVar.setVisibility(8);
            textView3.setVisibility(8);
            return;
        }
        final int i13 = 2;
        if (!TextUtils.isEmpty(this.x) && (searchPostsFlood = this.d) != null && (searchPostsFlood.flags & 2) != 0 && currentTime < searchPostsFlood.wait_till) {
            g9Var.setVisibility(8);
            textView2.setText(org.telegram.messenger.cd.L0(2131745738, null));
            textView.setText(org.telegram.messenger.cd.H(',', "SearchPostsLimitReachedText", this.d.total_daily));
            int i14 = this.d.wait_till - currentTime;
            int i15 = i14 / 3600;
            int i16 = i14 - (i15 * 3600);
            int i17 = i16 / 60;
            int i18 = i16 - (i17 * 60);
            dVar.setVisibility(0);
            dVar.i(rh.h8.T0(org.telegram.messenger.cd.H(',', "SearchPostsButtonPay", (int) this.d.stars_amount), 1.13f, this.U), true, true);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i15 > 0 ? a1.g.k(i15, ":") : "");
            sb2.append(i17 < 10 ? i0.a.i(i17, "0") : Integer.valueOf(i17));
            sb2.append(":");
            sb2.append(i18 < 10 ? i0.a.i(i18, "0") : Integer.valueOf(i18));
            dVar.g(org.telegram.messenger.cd.a0(null, null, 2131745744, sb2.toString()), true);
            dVar.e.r(false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ag0
                public final /* synthetic */ cg0 b;

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
                            cg0 cg0Var = this.b;
                            cg0Var.H.setLoading(true);
                            cg0Var.a(true);
                            break;
                        default:
                            cg0 cg0Var2 = this.b;
                            cg0Var2.H.setLoading(true);
                            cg0Var2.a(false);
                            break;
                    }
                }
            });
            org.telegram.messenger.i0.h3(zf0Var, 1000L);
            textView3.setVisibility(8);
            return;
        }
        if (!arrayList.isEmpty() || this.w || TextUtils.isEmpty(this.x)) {
            g9Var.setVisibility(8);
            textView2.setText(org.telegram.messenger.cd.L0(2131745730, null));
            textView.setText(org.telegram.messenger.cd.L0(2131745731, null));
            dVar.setVisibility(8);
            if (this.d == null) {
                textView3.setVisibility(8);
                return;
            }
            textView3.setVisibility(0);
            TLRPC.SearchPostsFlood searchPostsFlood2 = this.d;
            int i19 = searchPostsFlood2.remains;
            if (i19 < 1) {
                i19 = searchPostsFlood2.total_daily;
            }
            textView3.setText(org.telegram.messenger.cd.H(',', "SearchPostsFreeSearches", i19));
            return;
        }
        g9Var.setVisibility(8);
        textView2.setText(org.telegram.messenger.cd.L0(2131745730, null));
        textView.setText(org.telegram.messenger.cd.L0(2131745731, null));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("s ");
        if (this.R == null) {
            dq dqVar = new dq(R.drawable.smiles_tab_search, 0);
            this.R = dqVar;
            dqVar.H = 0.79f;
            dqVar.I = 0.79f;
        }
        if (this.T == null) {
            this.T = new org.telegram.messenger.u(org.telegram.ui.ActionBar.t6.w(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ci, false), org.telegram.ui.ActionBar.t6.r1(0.75f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Gi, false))), 3, false);
        }
        spannableStringBuilder.setSpan(this.R, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.cd.L0(2131745749, null));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(TextUtils.ellipsize(this.x, dVar.getTextPaint(), org.telegram.messenger.i0.L(100.0f), TextUtils.TruncateAt.END));
        spannableStringBuilder.setSpan(this.T, length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) " >");
        if (this.S == null) {
            dq dqVar2 = new dq(R.drawable.msg_mini_forumarrow, 0);
            this.S = dqVar2;
            dqVar2.H = 1.05f;
            dqVar2.I = 1.05f;
        }
        spannableStringBuilder.setSpan(this.S, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        dVar.setVisibility(0);
        dVar.i(spannableStringBuilder, true, true);
        dVar.d.r(false, false);
        dVar.g(null, true);
        dVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ag0
            public final /* synthetic */ cg0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        this.b.a.presentFragment(new PremiumPreviewFragment(0, "search"));
                        break;
                    case 1:
                        cg0 cg0Var = this.b;
                        cg0Var.H.setLoading(true);
                        cg0Var.a(true);
                        break;
                    default:
                        cg0 cg0Var2 = this.b;
                        cg0Var2.H.setLoading(true);
                        cg0Var2.a(false);
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
        int i20 = searchPostsFlood3.remains;
        if (i20 < 1) {
            i20 = searchPostsFlood3.total_daily;
        }
        textView3.setText(org.telegram.messenger.cd.H(',', "SearchPostsFreeSearches", i20));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d == null) {
            b(null);
        }
        if (this.P) {
            return;
        }
        this.P = true;
        org.telegram.messenger.vp.d1().edit().putInt("searchpostsnew", org.telegram.messenger.vp.d1().getInt("searchpostsnew", 0) + 1).apply();
        rh.e6.y(this.b, false).p();
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.J) {
            return;
        }
        super.requestLayout();
    }

    public void setKeyboardHeight(int i10) {
        this.D.animate().translationY((-i10) / 2.0f).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.m1.w).start();
    }
}
