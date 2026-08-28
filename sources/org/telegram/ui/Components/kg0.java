package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class kg0 extends FrameLayout {
    public final o9 A;
    public final TextView B;
    public final TextView C;
    public final kh.d D;
    public final TextView E;
    public boolean F;
    public int G;
    public int H;
    public boolean I;
    public boolean J;
    public int K;
    public boolean L;
    public boolean M;
    public eq N;
    public eq O;
    public wt P;
    public final eq[] Q;
    public final gg0 R;
    public final org.telegram.ui.dy a;
    public final int b;
    public final i51 c;
    public TLRPC.SearchPostsFlood d;
    public final ArrayList e;
    public int f;
    public boolean h;
    public final ArrayList n;
    public int r;
    public boolean s;
    public boolean v;
    public String w;
    public final FrameLayout x;
    public final gh.m y;

    public kg0(Context context, org.telegram.ui.dy dyVar) {
        super(context);
        this.e = new ArrayList();
        this.n = new ArrayList();
        this.G = -1;
        this.H = 0;
        this.K = -1;
        this.Q = new eq[1];
        this.R = new gg0(this, 1);
        this.a = dyVar;
        int currentAccount = dyVar.getCurrentAccount();
        this.b = currentAccount;
        i51 i51Var = new i51(context, currentAccount, 0, false, new d(this, 18), new wu(this, 11), null, null);
        this.c = i51Var;
        i51Var.j(new eh.n(4, this, dyVar));
        addView(i51Var, g7.e6.e(-1, -1, 119));
        FrameLayout frameLayout = new FrameLayout(context);
        this.x = frameLayout;
        gh.m mVar = new gh.m(context, 5);
        this.y = mVar;
        mVar.setOrientation(1);
        frameLayout.addView(mVar, g7.e6.d(-2, -2.0f, 17, 32.0f, 0.0f, 32.0f, 0.0f));
        o9 o9Var = new o9(context);
        this.A = o9Var;
        o9Var.setVisibility(8);
        mVar.addView(o9Var, g7.e6.t(130, 130, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        this.B = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setSingleLine(false);
        textView.setMaxLines(4);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        mVar.addView(textView, g7.e6.q(-2, -2, 1));
        TextView textView2 = new TextView(context);
        this.C = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setSingleLine(false);
        textView2.setMaxLines(4);
        textView2.setEllipsize(truncateAt);
        mVar.addView(textView2, g7.e6.t(-2, -2, 1, 0, 9, 0, 0));
        kh.d i9 = org.telegram.messenger.ll.i(24, context, null, true);
        this.D = i9;
        mVar.addView(i9, g7.e6.t(-1, 44, 7, 0, 19, 0, 0));
        TextView textView3 = new TextView(context);
        this.E = textView3;
        textView3.setTextSize(1, 12.0f);
        textView3.setGravity(17);
        mVar.addView(textView3, g7.e6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        addView(frameLayout, g7.e6.e(-1, -1, 119));
        i51Var.setHideIfEmpty(false);
        i51Var.setEmptyView(frameLayout);
        i51Var.U1 = true;
        i51Var.V1 = 0;
        c();
        d();
    }

    public final void a(boolean z10) {
        long j10;
        TLRPC.SearchPostsFlood searchPostsFlood;
        if (this.v) {
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(this.w);
        if (isEmpty && this.h) {
            return;
        }
        if (isEmpty || !this.s) {
            if (isEmpty || this.d != null) {
                this.v = true;
                int i9 = this.b;
                MessagesController messagesController = MessagesController.getInstance(i9);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i9);
                TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                tL_channels_searchPosts.flags |= 2;
                tL_channels_searchPosts.query = this.w;
                tL_channels_searchPosts.limit = 30;
                if (isEmpty) {
                    ArrayList arrayList = this.e;
                    if (arrayList.isEmpty()) {
                        tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    } else {
                        MessageObject messageObject = (MessageObject) j3.r0.j(1, arrayList);
                        tL_channels_searchPosts.offset_rate = this.f;
                        tL_channels_searchPosts.offset_id = messageObject.getRealId();
                        tL_channels_searchPosts.offset_peer = messagesController.getInputPeer(messageObject.messageOwner.peer_id);
                    }
                } else {
                    ArrayList arrayList2 = this.n;
                    if (arrayList2.isEmpty()) {
                        tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    } else {
                        MessageObject messageObject2 = (MessageObject) j3.r0.j(1, arrayList2);
                        tL_channels_searchPosts.offset_rate = this.r;
                        tL_channels_searchPosts.offset_id = messageObject2.getRealId();
                        tL_channels_searchPosts.offset_peer = messagesController.getInputPeer(messageObject2.messageOwner.peer_id);
                    }
                }
                if (!z10 || (searchPostsFlood = this.d) == null) {
                    j10 = 0;
                } else {
                    tL_channels_searchPosts.flags |= 4;
                    j10 = searchPostsFlood.stars_amount;
                    tL_channels_searchPosts.allow_paid_stars = j10;
                }
                this.G = connectionsManager.sendRequest(tL_channels_searchPosts, new b7(this, messagesController, isEmpty, tL_channels_searchPosts, z10, j10, connectionsManager), 1024);
                d();
                this.c.U2.N(true);
            }
        }
    }

    public final void b(String str) {
        int i9 = this.K;
        int i10 = this.b;
        if (i9 >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.K, true);
            this.K = -1;
        }
        if (!this.I) {
            this.J = this.M && !(this.n.isEmpty() && this.s);
        }
        this.I = true;
        TLRPC.TL_channels_checkSearchPostsFlood tL_channels_checkSearchPostsFlood = new TLRPC.TL_channels_checkSearchPostsFlood();
        if (!TextUtils.isEmpty(str)) {
            tL_channels_checkSearchPostsFlood.flags = 1 | tL_channels_checkSearchPostsFlood.flags;
            tL_channels_checkSearchPostsFlood.query = str;
        }
        this.K = ConnectionsManager.getInstance(i10).sendRequest(tL_channels_checkSearchPostsFlood, new w1(this, 9));
    }

    public final void c() {
        this.x.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
        this.B.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
        int i9 = org.telegram.ui.ActionBar.f6.y6;
        this.E.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        this.C.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        i51 i51Var = this.c;
        i51Var.setAdapter(null);
        i51Var.setAdapter(i51Var.U2);
        if (this.P != null) {
            this.P = null;
            d();
        }
    }

    public final void d() {
        float f10;
        TLRPC.SearchPostsFlood searchPostsFlood;
        gg0 gg0Var = this.R;
        AndroidUtilities.cancelRunOnUIThread(gg0Var);
        int i9 = this.b;
        int currentTime = ConnectionsManager.getInstance(i9).getCurrentTime();
        boolean isPremium = UserConfig.getInstance(i9).isPremium();
        TextView textView = this.C;
        TextView textView2 = this.B;
        o9 o9Var = this.A;
        TextView textView3 = this.E;
        final int i10 = 1;
        kh.d dVar = this.D;
        final int i11 = 0;
        if (!isPremium) {
            o9Var.setVisibility(8);
            textView2.setText(LocaleController.getString(R.string.SearchPostsTitle));
            textView.setText(LocaleController.getString(R.string.SearchPostsText));
            dVar.setVisibility(0);
            dVar.g(LocaleController.getString(R.string.SearchPostsButtonPremium), true, true);
            dVar.f(null, true);
            dVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.hg0
                public final /* synthetic */ kg0 b;

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
                            kg0 kg0Var = this.b;
                            kg0Var.D.setLoading(true);
                            kg0Var.a(true);
                            break;
                        default:
                            kg0 kg0Var2 = this.b;
                            kg0Var2.D.setLoading(true);
                            kg0Var2.a(false);
                            break;
                    }
                }
            });
            textView3.setVisibility(0);
            textView3.setText(LocaleController.getString(R.string.SearchPostsPremium));
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(this.w);
        ArrayList arrayList = this.n;
        if (!isEmpty && arrayList.isEmpty() && this.s) {
            if (o9Var.getImageReceiver().getImageDrawable() == null) {
                o9Var.setImageDrawable(new mi0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), "utyan_empty", AndroidUtilities.dp(130.0f)));
            }
            o9Var.setVisibility(0);
            textView2.setText(LocaleController.getString(R.string.SearchPostsNotFound));
            textView.setText(LocaleController.formatString(R.string.SearchPostsNotFoundText, TextUtils.ellipsize(this.w, textView.getPaint(), AndroidUtilities.dp(100.0f), TextUtils.TruncateAt.END)));
            dVar.setVisibility(8);
            textView3.setVisibility(8);
            return;
        }
        final int i12 = 2;
        if (TextUtils.isEmpty(this.w) || (searchPostsFlood = this.d) == null) {
            f10 = 100.0f;
        } else {
            f10 = 100.0f;
            if ((searchPostsFlood.flags & 2) != 0 && currentTime < searchPostsFlood.wait_till) {
                o9Var.setVisibility(8);
                textView2.setText(LocaleController.getString(R.string.SearchPostsLimitReached));
                textView.setText(LocaleController.formatPluralStringComma("SearchPostsLimitReachedText", this.d.total_daily));
                int i13 = this.d.wait_till - currentTime;
                int i14 = i13 / 3600;
                int i15 = i13 - (i14 * 3600);
                int i16 = i15 / 60;
                int i17 = i15 - (i16 * 60);
                dVar.setVisibility(0);
                dVar.g(gh.oa.R0(LocaleController.formatPluralStringComma("SearchPostsButtonPay", (int) this.d.stars_amount), 1.13f, this.Q), true, true);
                int i18 = R.string.SearchPostsFreeSearchUnlocksIn;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i14 > 0 ? ta.b.c(i14, ":") : "");
                sb2.append(i16 < 10 ? j3.r0.l(i16, "0") : Integer.valueOf(i16));
                sb2.append(":");
                sb2.append(i17 < 10 ? j3.r0.l(i17, "0") : Integer.valueOf(i17));
                dVar.f(LocaleController.formatString(i18, sb2.toString()), true);
                dVar.e.o(false, true, false);
                dVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.hg0
                    public final /* synthetic */ kg0 b;

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
                                kg0 kg0Var = this.b;
                                kg0Var.D.setLoading(true);
                                kg0Var.a(true);
                                break;
                            default:
                                kg0 kg0Var2 = this.b;
                                kg0Var2.D.setLoading(true);
                                kg0Var2.a(false);
                                break;
                        }
                    }
                });
                AndroidUtilities.runOnUIThread(gg0Var, 1000L);
                textView3.setVisibility(8);
                return;
            }
        }
        if (!arrayList.isEmpty() || this.v || TextUtils.isEmpty(this.w)) {
            o9Var.setVisibility(8);
            textView2.setText(LocaleController.getString(R.string.SearchPostsTitle));
            textView.setText(LocaleController.getString(R.string.SearchPostsText));
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
            textView3.setText(LocaleController.formatPluralStringComma("SearchPostsFreeSearches", i19));
            return;
        }
        o9Var.setVisibility(8);
        textView2.setText(LocaleController.getString(R.string.SearchPostsTitle));
        textView.setText(LocaleController.getString(R.string.SearchPostsText));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("s ");
        if (this.N == null) {
            eq eqVar = new eq(R.drawable.smiles_tab_search, 0);
            this.N = eqVar;
            eqVar.setScale(0.79f, 0.79f);
        }
        if (this.P == null) {
            this.P = new wt(org.telegram.ui.ActionBar.f6.v(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Oh, false), org.telegram.ui.ActionBar.f6.l1(0.75f, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sh, false))), i10);
        }
        spannableStringBuilder.setSpan(this.N, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.SearchPostsButton));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(TextUtils.ellipsize(this.w, dVar.getTextPaint(), AndroidUtilities.dp(f10), TextUtils.TruncateAt.END));
        spannableStringBuilder.setSpan(this.P, length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) " >");
        if (this.O == null) {
            eq eqVar2 = new eq(R.drawable.msg_mini_forumarrow, 0);
            this.O = eqVar2;
            eqVar2.setScale(1.05f, 1.05f);
        }
        spannableStringBuilder.setSpan(this.O, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        dVar.setVisibility(0);
        dVar.g(spannableStringBuilder, true, true);
        dVar.d.o(false, false, false);
        dVar.f(null, true);
        dVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.hg0
            public final /* synthetic */ kg0 b;

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
                        kg0 kg0Var = this.b;
                        kg0Var.D.setLoading(true);
                        kg0Var.a(true);
                        break;
                    default:
                        kg0 kg0Var2 = this.b;
                        kg0Var2.D.setLoading(true);
                        kg0Var2.a(false);
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
        textView3.setText(LocaleController.formatPluralStringComma("SearchPostsFreeSearches", i20));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d == null) {
            b(null);
        }
        if (this.L) {
            return;
        }
        this.L = true;
        MessagesController.getGlobalMainSettings().edit().putInt("searchpostsnew", MessagesController.getGlobalMainSettings().getInt("searchpostsnew", 0) + 1).apply();
        gh.v7.y(this.b, false).p();
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.F) {
            return;
        }
        super.requestLayout();
    }

    public void setKeyboardHeight(int i9) {
        this.y.animate().translationY((-i9) / 2.0f).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.q1.w).start();
    }
}
