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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class ze0 extends FrameLayout {
    public final bi.t D;
    public final l9 E;
    public final TextView F;
    public final TextView G;
    public final fi.d H;
    public final TextView I;
    public boolean J;
    public int K;
    public int L;
    public boolean M;
    public boolean N;
    public int O;
    public boolean P;
    public boolean Q;
    public wp R;
    public wp S;
    public org.telegram.messenger.t T;
    public final wp[] U;
    public final we0 V;
    public final org.telegram.ui.ww a;
    public final int b;
    public final q41 c;
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

    public ze0(Context context, org.telegram.ui.ww wwVar) {
        super(context);
        this.e = new ArrayList();
        this.n = new ArrayList();
        this.K = -1;
        this.L = 0;
        this.O = -1;
        this.U = new wp[1];
        this.V = new we0(this, 1);
        this.a = wwVar;
        int currentAccount = wwVar.getCurrentAccount();
        this.b = currentAccount;
        q41 q41Var = new q41(context, currentAccount, 0, false, new d(this, 18), new bx(this, 12), null, null);
        this.c = q41Var;
        q41Var.j(new ai.o0(4, this, wwVar));
        addView(q41Var, c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.y = frameLayout;
        bi.t tVar = new bi.t(context, 8);
        this.D = tVar;
        tVar.setOrientation(1);
        frameLayout.addView(tVar, c8.ha.d(-2, -2.0f, 17, 32.0f, 0.0f, 32.0f, 0.0f));
        l9 l9Var = new l9(context);
        this.E = l9Var;
        l9Var.setVisibility(8);
        tVar.addView(l9Var, c8.ha.t(org.telegram.messenger.qs.O1, org.telegram.messenger.qs.O1, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        this.F = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setSingleLine(false);
        textView.setMaxLines(4);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        tVar.addView(textView, c8.ha.r(-2, -2, 1));
        TextView textView2 = new TextView(context);
        this.G = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setSingleLine(false);
        textView2.setMaxLines(4);
        textView2.setEllipsize(truncateAt);
        tVar.addView(textView2, c8.ha.t(-2, -2, 1, 0, 9, 0, 0));
        fi.d h = org.telegram.messenger.k5.h(24, context, null, true);
        this.H = h;
        tVar.addView(h, c8.ha.t(-1, 44, 7, 0, 19, 0, 0));
        TextView textView3 = new TextView(context);
        this.I = textView3;
        textView3.setTextSize(1, 12.0f);
        textView3.setGravity(17);
        tVar.addView(textView3, c8.ha.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        addView(frameLayout, c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
        q41Var.setHideIfEmpty(false);
        q41Var.setEmptyView(frameLayout);
        q41Var.W1 = true;
        q41Var.X1 = 0;
        c();
        d();
    }

    public final void a(boolean z9) {
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
                org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
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
                        org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) jg.g.i(1, arrayList);
                        tL_channels_searchPosts.offset_rate = this.f;
                        tL_channels_searchPosts.offset_id = ijVar.M1();
                        tL_channels_searchPosts.offset_peer = s12.m1(ijVar.k.peer_id);
                    }
                } else {
                    ArrayList arrayList2 = this.n;
                    if (arrayList2.isEmpty()) {
                        tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    } else {
                        org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) jg.g.i(1, arrayList2);
                        tL_channels_searchPosts.offset_rate = this.r;
                        tL_channels_searchPosts.offset_id = ijVar2.M1();
                        tL_channels_searchPosts.offset_peer = s12.m1(ijVar2.k.peer_id);
                    }
                }
                if (!z9 || (searchPostsFlood = this.d) == null) {
                    j3 = 0;
                } else {
                    tL_channels_searchPosts.flags |= 4;
                    j3 = searchPostsFlood.stars_amount;
                    tL_channels_searchPosts.allow_paid_stars = j3;
                }
                this.K = connectionsManager.sendRequest(tL_channels_searchPosts, new b7(this, s12, isEmpty, tL_channels_searchPosts, z9, j3, connectionsManager), 1024);
                d();
                this.c.f3.O(true);
            }
        }
    }

    public final void b(String str) {
        int i7 = this.O;
        int i10 = this.b;
        if (i7 >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.O, true);
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
        this.O = ConnectionsManager.getInstance(i10).sendRequest(tL_channels_checkSearchPostsFlood, new x1(this, 8));
    }

    public final void c() {
        this.y.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false));
        this.F.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
        int i7 = org.telegram.ui.ActionBar.k6.y6;
        this.I.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i7, false));
        this.G.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i7, false));
        q41 q41Var = this.c;
        q41Var.setAdapter(null);
        q41Var.setAdapter(q41Var.f3);
        if (this.T != null) {
            this.T = null;
            d();
        }
    }

    public final void d() {
        TLRPC.SearchPostsFlood searchPostsFlood;
        we0 we0Var = this.V;
        org.telegram.messenger.g0.r(we0Var);
        int i7 = this.b;
        int currentTime = ConnectionsManager.getInstance(i7).getCurrentTime();
        boolean q10 = org.telegram.messenger.p10.i(i7).q();
        TextView textView = this.G;
        TextView textView2 = this.F;
        l9 l9Var = this.E;
        TextView textView3 = this.I;
        final int i10 = 1;
        final int i11 = 0;
        fi.d dVar = this.H;
        if (!q10) {
            l9Var.setVisibility(8);
            textView2.setText(org.telegram.messenger.id.M0(2131745716, null));
            textView.setText(org.telegram.messenger.id.M0(2131745717, null));
            dVar.setVisibility(0);
            dVar.i(org.telegram.messenger.id.M0(2131745731, null), true, true);
            dVar.g(null, true);
            dVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xe0
                public final /* synthetic */ ze0 b;

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
                            ze0 ze0Var = this.b;
                            ze0Var.H.setLoading(true);
                            ze0Var.a(true);
                            break;
                        default:
                            ze0 ze0Var2 = this.b;
                            ze0Var2.H.setLoading(true);
                            ze0Var2.a(false);
                            break;
                    }
                }
            });
            textView3.setVisibility(0);
            textView3.setText(org.telegram.messenger.id.M0(2131745718, null));
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(this.x);
        ArrayList arrayList = this.n;
        if (!isEmpty && arrayList.isEmpty() && this.s) {
            if (l9Var.getImageReceiver().S == null) {
                l9Var.setImageDrawable(new zg0(R.raw.utyan_empty, org.telegram.messenger.g0.L(130.0f), org.telegram.messenger.g0.L(130.0f)));
            }
            l9Var.setVisibility(0);
            textView2.setText(org.telegram.messenger.id.M0(2131745720, null));
            textView.setText(org.telegram.messenger.id.a0(null, null, 2131745719, TextUtils.ellipsize(this.x, textView.getPaint(), org.telegram.messenger.g0.L(100.0f), TextUtils.TruncateAt.END)));
            dVar.setVisibility(8);
            textView3.setVisibility(8);
            return;
        }
        final int i12 = 2;
        if (!TextUtils.isEmpty(this.x) && (searchPostsFlood = this.d) != null && (searchPostsFlood.flags & 2) != 0 && currentTime < searchPostsFlood.wait_till) {
            l9Var.setVisibility(8);
            textView2.setText(org.telegram.messenger.id.M0(2131745724, null));
            textView.setText(org.telegram.messenger.id.H(',', "SearchPostsLimitReachedText", this.d.total_daily));
            int i13 = this.d.wait_till - currentTime;
            int i14 = i13 / 3600;
            int i15 = i13 - (i14 * 3600);
            int i16 = i15 / 60;
            int i17 = i15 - (i16 * 60);
            dVar.setVisibility(0);
            dVar.i(bi.dd.U0(org.telegram.messenger.id.H(',', "SearchPostsButtonPay", (int) this.d.stars_amount), 1.13f, this.U), true, true);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i14 > 0 ? com.google.android.recaptcha.internal.a.i(i14, ":") : "");
            sb2.append(i16 < 10 ? jg.g.j(i16, "0") : Integer.valueOf(i16));
            sb2.append(":");
            sb2.append(i17 < 10 ? jg.g.j(i17, "0") : Integer.valueOf(i17));
            dVar.g(org.telegram.messenger.id.a0(null, null, 2131745730, sb2.toString()), true);
            dVar.e.r(false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xe0
                public final /* synthetic */ ze0 b;

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
                            ze0 ze0Var = this.b;
                            ze0Var.H.setLoading(true);
                            ze0Var.a(true);
                            break;
                        default:
                            ze0 ze0Var2 = this.b;
                            ze0Var2.H.setLoading(true);
                            ze0Var2.a(false);
                            break;
                    }
                }
            });
            org.telegram.messenger.g0.i3(we0Var, 1000L);
            textView3.setVisibility(8);
            return;
        }
        if (!arrayList.isEmpty() || this.w || TextUtils.isEmpty(this.x)) {
            l9Var.setVisibility(8);
            textView2.setText(org.telegram.messenger.id.M0(2131745716, null));
            textView.setText(org.telegram.messenger.id.M0(2131745717, null));
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
            textView3.setText(org.telegram.messenger.id.H(',', "SearchPostsFreeSearches", i18));
            return;
        }
        l9Var.setVisibility(8);
        textView2.setText(org.telegram.messenger.id.M0(2131745716, null));
        textView.setText(org.telegram.messenger.id.M0(2131745717, null));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("s ");
        if (this.R == null) {
            wp wpVar = new wp(R.drawable.smiles_tab_search, 0);
            this.R = wpVar;
            wpVar.H = 0.79f;
            wpVar.I = 0.79f;
        }
        if (this.T == null) {
            this.T = new org.telegram.messenger.t(org.telegram.ui.ActionBar.k6.w(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false), org.telegram.ui.ActionBar.k6.r1(0.75f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Gi, false))), 3, false);
        }
        spannableStringBuilder.setSpan(this.R, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.id.M0(2131745735, null));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(TextUtils.ellipsize(this.x, dVar.getTextPaint(), org.telegram.messenger.g0.L(100.0f), TextUtils.TruncateAt.END));
        spannableStringBuilder.setSpan(this.T, length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) " >");
        if (this.S == null) {
            wp wpVar2 = new wp(R.drawable.msg_mini_forumarrow, 0);
            this.S = wpVar2;
            wpVar2.H = 1.05f;
            wpVar2.I = 1.05f;
        }
        spannableStringBuilder.setSpan(this.S, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        dVar.setVisibility(0);
        dVar.i(spannableStringBuilder, true, true);
        dVar.d.r(false, false);
        dVar.g(null, true);
        dVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xe0
            public final /* synthetic */ ze0 b;

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
                        ze0 ze0Var = this.b;
                        ze0Var.H.setLoading(true);
                        ze0Var.a(true);
                        break;
                    default:
                        ze0 ze0Var2 = this.b;
                        ze0Var2.H.setLoading(true);
                        ze0Var2.a(false);
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
        textView3.setText(org.telegram.messenger.id.H(',', "SearchPostsFreeSearches", i19));
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
        org.telegram.messenger.qp.e1().edit().putInt("searchpostsnew", org.telegram.messenger.qp.e1().getInt("searchpostsnew", 0) + 1).apply();
        bi.ea.y(this.b, false).p();
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.J) {
            return;
        }
        super.requestLayout();
    }

    public void setKeyboardHeight(int i7) {
        this.D.animate().translationY((-i7) / 2.0f).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.i1.w).start();
    }
}
