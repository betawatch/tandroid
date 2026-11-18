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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class mf0 extends FrameLayout {
    public final ai.r2 E;
    public final q9 F;
    public final TextView G;
    public final TextView H;
    public final hi.d I;
    public final TextView J;
    public boolean K;
    public int L;
    public int M;
    public boolean N;
    public boolean O;
    public int P;
    public boolean Q;
    public boolean R;
    public lq S;
    public lq T;
    public org.telegram.messenger.t U;
    public final lq[] V;
    public final jf0 W;
    public final org.telegram.ui.cx a;
    public final int b;
    public final e51 c;
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

    public mf0(Context context, org.telegram.ui.cx cxVar) {
        super(context);
        this.e = new ArrayList();
        this.n = new ArrayList();
        this.L = -1;
        this.M = 0;
        this.P = -1;
        this.V = new lq[1];
        this.W = new jf0(this, 1);
        this.a = cxVar;
        int currentAccount = cxVar.getCurrentAccount();
        this.b = currentAccount;
        e51 e51Var = new e51(context, currentAccount, 0, false, new d(this, 19), new iy(this, 11), null, null);
        this.c = e51Var;
        e51Var.j(new bi.e6(5, this, cxVar));
        addView(e51Var, c8.ma.e(-1, -1, org.telegram.messenger.ks.E1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.y = frameLayout;
        ai.r2 r2Var = new ai.r2(context, 8);
        this.E = r2Var;
        r2Var.setOrientation(1);
        frameLayout.addView(r2Var, c8.ma.d(-2, -2.0f, 17, 32.0f, 0.0f, 32.0f, 0.0f));
        q9 q9Var = new q9(context);
        this.F = q9Var;
        q9Var.setVisibility(8);
        r2Var.addView(q9Var, c8.ma.t(org.telegram.messenger.ks.O1, org.telegram.messenger.ks.O1, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        this.G = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setSingleLine(false);
        textView.setMaxLines(4);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        r2Var.addView(textView, c8.ma.r(-2, -2, 1));
        TextView textView2 = new TextView(context);
        this.H = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setSingleLine(false);
        textView2.setMaxLines(4);
        textView2.setEllipsize(truncateAt);
        r2Var.addView(textView2, c8.ma.t(-2, -2, 1, 0, 9, 0, 0));
        hi.d g10 = org.telegram.messenger.n10.g(24, context, null, true);
        this.I = g10;
        r2Var.addView(g10, c8.ma.t(-1, 44, 7, 0, 19, 0, 0));
        TextView textView3 = new TextView(context);
        this.J = textView3;
        textView3.setTextSize(1, 12.0f);
        textView3.setGravity(17);
        r2Var.addView(textView3, c8.ma.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        addView(frameLayout, c8.ma.e(-1, -1, org.telegram.messenger.ks.E1));
        e51Var.setHideIfEmpty(false);
        e51Var.setEmptyView(frameLayout);
        e51Var.X1 = true;
        e51Var.Y1 = 0;
        c();
        d();
    }

    public final void a(boolean z10) {
        long j3;
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
                int i7 = this.b;
                org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i7);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i7);
                TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                tL_channels_searchPosts.flags |= 2;
                tL_channels_searchPosts.query = this.x;
                tL_channels_searchPosts.limit = 30;
                if (isEmpty) {
                    ArrayList arrayList = this.e;
                    if (arrayList.isEmpty()) {
                        tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    } else {
                        org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) i5.c.h(1, arrayList);
                        tL_channels_searchPosts.offset_rate = this.f;
                        tL_channels_searchPosts.offset_id = fjVar.L1();
                        tL_channels_searchPosts.offset_peer = u12.o1(fjVar.k.peer_id);
                    }
                } else {
                    ArrayList arrayList2 = this.n;
                    if (arrayList2.isEmpty()) {
                        tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    } else {
                        org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) i5.c.h(1, arrayList2);
                        tL_channels_searchPosts.offset_rate = this.r;
                        tL_channels_searchPosts.offset_id = fjVar2.L1();
                        tL_channels_searchPosts.offset_peer = u12.o1(fjVar2.k.peer_id);
                    }
                }
                if (!z10 || (searchPostsFlood = this.d) == null) {
                    j3 = 0;
                } else {
                    tL_channels_searchPosts.flags |= 4;
                    j3 = searchPostsFlood.stars_amount;
                    tL_channels_searchPosts.allow_paid_stars = j3;
                }
                this.L = connectionsManager.sendRequest(tL_channels_searchPosts, new f7(this, u12, isEmpty, tL_channels_searchPosts, z10, j3, connectionsManager), 1024);
                d();
                this.c.g3.O(true);
            }
        }
    }

    public final void b(String str) {
        int i7 = this.P;
        int i10 = this.b;
        if (i7 >= 0) {
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
        this.P = ConnectionsManager.getInstance(i10).sendRequest(tL_channels_checkSearchPostsFlood, new e2(this, 8));
    }

    public final void c() {
        this.y.setBackgroundColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.d6, false));
        this.G.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false));
        int i7 = org.telegram.ui.ActionBar.n6.y6;
        this.J.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, i7, false));
        this.H.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, i7, false));
        e51 e51Var = this.c;
        e51Var.setAdapter(null);
        e51Var.setAdapter(e51Var.g3);
        if (this.U != null) {
            this.U = null;
            d();
        }
    }

    public final void d() {
        TLRPC.SearchPostsFlood searchPostsFlood;
        jf0 jf0Var = this.W;
        org.telegram.messenger.g0.r(jf0Var);
        int i7 = this.b;
        int currentTime = ConnectionsManager.getInstance(i7).getCurrentTime();
        boolean q10 = org.telegram.messenger.j10.i(i7).q();
        TextView textView = this.H;
        TextView textView2 = this.G;
        q9 q9Var = this.F;
        TextView textView3 = this.J;
        final int i10 = 1;
        final int i11 = 0;
        hi.d dVar = this.I;
        if (!q10) {
            q9Var.setVisibility(8);
            textView2.setText(org.telegram.messenger.gd.M0(2131745518, null));
            textView.setText(org.telegram.messenger.gd.M0(2131745519, null));
            dVar.setVisibility(0);
            dVar.i(org.telegram.messenger.gd.M0(2131745533, null), true, true);
            dVar.g(null, true);
            dVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.kf0
                public final /* synthetic */ mf0 b;

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
                            mf0 mf0Var = this.b;
                            mf0Var.I.setLoading(true);
                            mf0Var.a(true);
                            break;
                        default:
                            mf0 mf0Var2 = this.b;
                            mf0Var2.I.setLoading(true);
                            mf0Var2.a(false);
                            break;
                    }
                }
            });
            textView3.setVisibility(0);
            textView3.setText(org.telegram.messenger.gd.M0(2131745520, null));
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(this.x);
        ArrayList arrayList = this.n;
        if (!isEmpty && arrayList.isEmpty() && this.s) {
            if (q9Var.getImageReceiver().T == null) {
                q9Var.setImageDrawable(new mh0(R.raw.utyan_empty, org.telegram.messenger.g0.L(130.0f), org.telegram.messenger.g0.L(130.0f)));
            }
            q9Var.setVisibility(0);
            textView2.setText(org.telegram.messenger.gd.M0(2131745522, null));
            textView.setText(org.telegram.messenger.gd.a0(null, null, 2131745521, TextUtils.ellipsize(this.x, textView.getPaint(), org.telegram.messenger.g0.L(100.0f), TextUtils.TruncateAt.END)));
            dVar.setVisibility(8);
            textView3.setVisibility(8);
            return;
        }
        final int i12 = 2;
        if (!TextUtils.isEmpty(this.x) && (searchPostsFlood = this.d) != null && (searchPostsFlood.flags & 2) != 0 && currentTime < searchPostsFlood.wait_till) {
            q9Var.setVisibility(8);
            textView2.setText(org.telegram.messenger.gd.M0(2131745526, null));
            textView.setText(org.telegram.messenger.gd.H(',', "SearchPostsLimitReachedText", this.d.total_daily));
            int i13 = this.d.wait_till - currentTime;
            int i14 = i13 / 3600;
            int i15 = i13 - (i14 * 3600);
            int i16 = i15 / 60;
            int i17 = i15 - (i16 * 60);
            dVar.setVisibility(0);
            dVar.i(di.pb.U0(org.telegram.messenger.gd.H(',', "SearchPostsButtonPay", (int) this.d.stars_amount), 1.13f, this.V), true, true);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i14 > 0 ? com.google.android.gms.internal.vision.e2.i(i14, ":") : "");
            sb2.append(i16 < 10 ? i5.c.i(i16, "0") : Integer.valueOf(i16));
            sb2.append(":");
            sb2.append(i17 < 10 ? i5.c.i(i17, "0") : Integer.valueOf(i17));
            dVar.g(org.telegram.messenger.gd.a0(null, null, 2131745532, sb2.toString()), true);
            dVar.e.r(false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.kf0
                public final /* synthetic */ mf0 b;

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
                            mf0 mf0Var = this.b;
                            mf0Var.I.setLoading(true);
                            mf0Var.a(true);
                            break;
                        default:
                            mf0 mf0Var2 = this.b;
                            mf0Var2.I.setLoading(true);
                            mf0Var2.a(false);
                            break;
                    }
                }
            });
            org.telegram.messenger.g0.h3(jf0Var, 1000L);
            textView3.setVisibility(8);
            return;
        }
        if (!arrayList.isEmpty() || this.w || TextUtils.isEmpty(this.x)) {
            q9Var.setVisibility(8);
            textView2.setText(org.telegram.messenger.gd.M0(2131745518, null));
            textView.setText(org.telegram.messenger.gd.M0(2131745519, null));
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
            textView3.setText(org.telegram.messenger.gd.H(',', "SearchPostsFreeSearches", i18));
            return;
        }
        q9Var.setVisibility(8);
        textView2.setText(org.telegram.messenger.gd.M0(2131745518, null));
        textView.setText(org.telegram.messenger.gd.M0(2131745519, null));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("s ");
        if (this.S == null) {
            lq lqVar = new lq(R.drawable.smiles_tab_search, 0);
            this.S = lqVar;
            lqVar.I = 0.79f;
            lqVar.J = 0.79f;
        }
        if (this.U == null) {
            this.U = new org.telegram.messenger.t(org.telegram.ui.ActionBar.n6.w(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Fi, false), org.telegram.ui.ActionBar.n6.r1(0.75f, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ji, false))), 3, false);
        }
        spannableStringBuilder.setSpan(this.S, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.gd.M0(2131745537, null));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(TextUtils.ellipsize(this.x, dVar.getTextPaint(), org.telegram.messenger.g0.L(100.0f), TextUtils.TruncateAt.END));
        spannableStringBuilder.setSpan(this.U, length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) " >");
        if (this.T == null) {
            lq lqVar2 = new lq(R.drawable.msg_mini_forumarrow, 0);
            this.T = lqVar2;
            lqVar2.I = 1.05f;
            lqVar2.J = 1.05f;
        }
        spannableStringBuilder.setSpan(this.T, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        dVar.setVisibility(0);
        dVar.i(spannableStringBuilder, true, true);
        dVar.d.r(false, false);
        dVar.g(null, true);
        dVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.kf0
            public final /* synthetic */ mf0 b;

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
                        mf0 mf0Var = this.b;
                        mf0Var.I.setLoading(true);
                        mf0Var.a(true);
                        break;
                    default:
                        mf0 mf0Var2 = this.b;
                        mf0Var2.I.setLoading(true);
                        mf0Var2.a(false);
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
        textView3.setText(org.telegram.messenger.gd.H(',', "SearchPostsFreeSearches", i19));
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
        org.telegram.messenger.mp.g1().edit().putInt("searchpostsnew", org.telegram.messenger.mp.g1().getInt("searchpostsnew", 0) + 1).apply();
        di.x8.y(this.b, false).p();
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.K) {
            return;
        }
        super.requestLayout();
    }

    public void setKeyboardHeight(int i7) {
        this.E.animate().translationY((-i7) / 2.0f).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.j1.w).start();
    }
}
