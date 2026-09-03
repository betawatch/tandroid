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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class fh0 extends FrameLayout {
    public final p9 B;
    public final TextView C;
    public final TextView D;
    public final ph.d E;
    public final TextView F;
    public boolean G;
    public int H;
    public int I;
    public boolean J;
    public boolean K;
    public int L;
    public boolean M;
    public boolean N;
    public lq O;
    public lq P;
    public eu Q;
    public final lq[] R;
    public final ch0 S;
    public final org.telegram.ui.qy a;
    public final int b;
    public final g61 c;
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
    public final dg.u3 y;

    public fh0(Context context, org.telegram.ui.qy qyVar) {
        super(context);
        this.e = new ArrayList();
        this.n = new ArrayList();
        this.H = -1;
        this.I = 0;
        this.L = -1;
        this.R = new lq[1];
        this.S = new ch0(this, 1);
        this.a = qyVar;
        int currentAccount = qyVar.getCurrentAccount();
        this.b = currentAccount;
        g61 g61Var = new g61(context, currentAccount, 0, false, new d(this, 18), new ev(this, 11), null, null);
        this.c = g61Var;
        g61Var.j(new jh.l(4, this, qyVar));
        addView(g61Var, k7.b6.e(-1, -1, 119));
        FrameLayout frameLayout = new FrameLayout(context);
        this.x = frameLayout;
        dg.u3 u3Var = new dg.u3(context, 6);
        this.y = u3Var;
        u3Var.setOrientation(1);
        frameLayout.addView(u3Var, k7.b6.d(-2, -2.0f, 17, 32.0f, 0.0f, 32.0f, 0.0f));
        p9 p9Var = new p9(context);
        this.B = p9Var;
        p9Var.setVisibility(8);
        u3Var.addView(p9Var, k7.b6.t(130, 130, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        this.C = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setSingleLine(false);
        textView.setMaxLines(4);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        u3Var.addView(textView, k7.b6.q(-2, -2, 1));
        TextView textView2 = new TextView(context);
        this.D = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setSingleLine(false);
        textView2.setMaxLines(4);
        textView2.setEllipsize(truncateAt);
        u3Var.addView(textView2, k7.b6.t(-2, -2, 1, 0, 9, 0, 0));
        ph.d p10 = org.telegram.messenger.y3.p(24, context, null, true);
        this.E = p10;
        u3Var.addView(p10, k7.b6.t(-1, 44, 7, 0, 19, 0, 0));
        TextView textView3 = new TextView(context);
        this.F = textView3;
        textView3.setTextSize(1, 12.0f);
        textView3.setGravity(17);
        u3Var.addView(textView3, k7.b6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        addView(frameLayout, k7.b6.e(-1, -1, 119));
        g61Var.setHideIfEmpty(false);
        g61Var.setEmptyView(frameLayout);
        g61Var.V1 = true;
        g61Var.W1 = 0;
        c();
        d();
    }

    public final void a(boolean z4) {
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
                int i10 = this.b;
                MessagesController messagesController = MessagesController.getInstance(i10);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                tL_channels_searchPosts.flags |= 2;
                tL_channels_searchPosts.query = this.w;
                tL_channels_searchPosts.limit = 30;
                if (isEmpty) {
                    ArrayList arrayList = this.e;
                    if (arrayList.isEmpty()) {
                        tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    } else {
                        MessageObject messageObject = (MessageObject) kf.k0.i(1, arrayList);
                        tL_channels_searchPosts.offset_rate = this.f;
                        tL_channels_searchPosts.offset_id = messageObject.getRealId();
                        tL_channels_searchPosts.offset_peer = messagesController.getInputPeer(messageObject.messageOwner.peer_id);
                    }
                } else {
                    ArrayList arrayList2 = this.n;
                    if (arrayList2.isEmpty()) {
                        tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    } else {
                        MessageObject messageObject2 = (MessageObject) kf.k0.i(1, arrayList2);
                        tL_channels_searchPosts.offset_rate = this.r;
                        tL_channels_searchPosts.offset_id = messageObject2.getRealId();
                        tL_channels_searchPosts.offset_peer = messagesController.getInputPeer(messageObject2.messageOwner.peer_id);
                    }
                }
                if (!z4 || (searchPostsFlood = this.d) == null) {
                    j10 = 0;
                } else {
                    tL_channels_searchPosts.flags |= 4;
                    j10 = searchPostsFlood.stars_amount;
                    tL_channels_searchPosts.allow_paid_stars = j10;
                }
                this.H = connectionsManager.sendRequest(tL_channels_searchPosts, new c7(this, messagesController, isEmpty, tL_channels_searchPosts, z4, j10, connectionsManager), 1024);
                d();
                this.c.V2.N(true);
            }
        }
    }

    public final void b(String str) {
        int i10 = this.L;
        int i11 = this.b;
        if (i10 >= 0) {
            ConnectionsManager.getInstance(i11).cancelRequest(this.L, true);
            this.L = -1;
        }
        if (!this.J) {
            this.K = this.N && !(this.n.isEmpty() && this.s);
        }
        this.J = true;
        TLRPC.TL_channels_checkSearchPostsFlood tL_channels_checkSearchPostsFlood = new TLRPC.TL_channels_checkSearchPostsFlood();
        if (!TextUtils.isEmpty(str)) {
            tL_channels_checkSearchPostsFlood.flags = 1 | tL_channels_checkSearchPostsFlood.flags;
            tL_channels_checkSearchPostsFlood.query = str;
        }
        this.L = ConnectionsManager.getInstance(i11).sendRequest(tL_channels_checkSearchPostsFlood, new y1(this, 9));
    }

    public final void c() {
        this.x.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
        this.C.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        int i10 = org.telegram.ui.ActionBar.j6.y6;
        this.F.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.D.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        g61 g61Var = this.c;
        g61Var.setAdapter(null);
        g61Var.setAdapter(g61Var.V2);
        if (this.Q != null) {
            this.Q = null;
            d();
        }
    }

    public final void d() {
        float f10;
        TLRPC.SearchPostsFlood searchPostsFlood;
        ch0 ch0Var = this.S;
        AndroidUtilities.cancelRunOnUIThread(ch0Var);
        int i10 = this.b;
        int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        boolean isPremium = UserConfig.getInstance(i10).isPremium();
        TextView textView = this.D;
        TextView textView2 = this.C;
        p9 p9Var = this.B;
        TextView textView3 = this.F;
        final int i11 = 1;
        ph.d dVar = this.E;
        final int i12 = 0;
        if (!isPremium) {
            p9Var.setVisibility(8);
            textView2.setText(LocaleController.getString(R.string.SearchPostsTitle));
            textView.setText(LocaleController.getString(R.string.SearchPostsText));
            dVar.setVisibility(0);
            dVar.g(LocaleController.getString(R.string.SearchPostsButtonPremium), true, true);
            dVar.f(null, true);
            dVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.dh0
                public final /* synthetic */ fh0 b;

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
                            fh0 fh0Var = this.b;
                            fh0Var.E.setLoading(true);
                            fh0Var.a(true);
                            break;
                        default:
                            fh0 fh0Var2 = this.b;
                            fh0Var2.E.setLoading(true);
                            fh0Var2.a(false);
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
            if (p9Var.getImageReceiver().getImageDrawable() == null) {
                p9Var.setImageDrawable(new gj0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), AndroidUtilities.dp(130.0f)));
            }
            p9Var.setVisibility(0);
            textView2.setText(LocaleController.getString(R.string.SearchPostsNotFound));
            textView.setText(LocaleController.formatString(R.string.SearchPostsNotFoundText, TextUtils.ellipsize(this.w, textView.getPaint(), AndroidUtilities.dp(100.0f), TextUtils.TruncateAt.END)));
            dVar.setVisibility(8);
            textView3.setVisibility(8);
            return;
        }
        final int i13 = 2;
        if (TextUtils.isEmpty(this.w) || (searchPostsFlood = this.d) == null) {
            f10 = 100.0f;
        } else {
            f10 = 100.0f;
            if ((searchPostsFlood.flags & 2) != 0 && currentTime < searchPostsFlood.wait_till) {
                p9Var.setVisibility(8);
                textView2.setText(LocaleController.getString(R.string.SearchPostsLimitReached));
                textView.setText(LocaleController.formatPluralStringComma("SearchPostsLimitReachedText", this.d.total_daily));
                int i14 = this.d.wait_till - currentTime;
                int i15 = i14 / 3600;
                int i16 = i14 - (i15 * 3600);
                int i17 = i16 / 60;
                int i18 = i16 - (i17 * 60);
                dVar.setVisibility(0);
                dVar.g(lh.ja.R0(LocaleController.formatPluralStringComma("SearchPostsButtonPay", (int) this.d.stars_amount), 1.13f, this.R), true, true);
                int i19 = R.string.SearchPostsFreeSearchUnlocksIn;
                StringBuilder sb = new StringBuilder();
                sb.append(i15 > 0 ? android.support.v4.media.a.l(i15, ":") : "");
                sb.append(i17 < 10 ? kf.k0.j(i17, "0") : Integer.valueOf(i17));
                sb.append(":");
                sb.append(i18 < 10 ? kf.k0.j(i18, "0") : Integer.valueOf(i18));
                dVar.f(LocaleController.formatString(i19, sb.toString()), true);
                dVar.e.o(false, true, false);
                dVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.dh0
                    public final /* synthetic */ fh0 b;

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
                                fh0 fh0Var = this.b;
                                fh0Var.E.setLoading(true);
                                fh0Var.a(true);
                                break;
                            default:
                                fh0 fh0Var2 = this.b;
                                fh0Var2.E.setLoading(true);
                                fh0Var2.a(false);
                                break;
                        }
                    }
                });
                AndroidUtilities.runOnUIThread(ch0Var, 1000L);
                textView3.setVisibility(8);
                return;
            }
        }
        if (!arrayList.isEmpty() || this.v || TextUtils.isEmpty(this.w)) {
            p9Var.setVisibility(8);
            textView2.setText(LocaleController.getString(R.string.SearchPostsTitle));
            textView.setText(LocaleController.getString(R.string.SearchPostsText));
            dVar.setVisibility(8);
            if (this.d == null) {
                textView3.setVisibility(8);
                return;
            }
            textView3.setVisibility(0);
            TLRPC.SearchPostsFlood searchPostsFlood2 = this.d;
            int i20 = searchPostsFlood2.remains;
            if (i20 < 1) {
                i20 = searchPostsFlood2.total_daily;
            }
            textView3.setText(LocaleController.formatPluralStringComma("SearchPostsFreeSearches", i20));
            return;
        }
        p9Var.setVisibility(8);
        textView2.setText(LocaleController.getString(R.string.SearchPostsTitle));
        textView.setText(LocaleController.getString(R.string.SearchPostsText));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("s ");
        if (this.O == null) {
            lq lqVar = new lq(R.drawable.smiles_tab_search, 0);
            this.O = lqVar;
            lqVar.setScale(0.79f, 0.79f);
        }
        if (this.Q == null) {
            this.Q = new eu(org.telegram.ui.ActionBar.j6.v(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false), org.telegram.ui.ActionBar.j6.l1(0.75f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false))), i11);
        }
        spannableStringBuilder.setSpan(this.O, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.SearchPostsButton));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(TextUtils.ellipsize(this.w, dVar.getTextPaint(), AndroidUtilities.dp(f10), TextUtils.TruncateAt.END));
        spannableStringBuilder.setSpan(this.Q, length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) " >");
        if (this.P == null) {
            lq lqVar2 = new lq(R.drawable.msg_mini_forumarrow, 0);
            this.P = lqVar2;
            lqVar2.setScale(1.05f, 1.05f);
        }
        spannableStringBuilder.setSpan(this.P, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        dVar.setVisibility(0);
        dVar.g(spannableStringBuilder, true, true);
        dVar.d.o(false, false, false);
        dVar.f(null, true);
        dVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.dh0
            public final /* synthetic */ fh0 b;

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
                        fh0 fh0Var = this.b;
                        fh0Var.E.setLoading(true);
                        fh0Var.a(true);
                        break;
                    default:
                        fh0 fh0Var2 = this.b;
                        fh0Var2.E.setLoading(true);
                        fh0Var2.a(false);
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
        int i21 = searchPostsFlood3.remains;
        if (i21 < 1) {
            i21 = searchPostsFlood3.total_daily;
        }
        textView3.setText(LocaleController.formatPluralStringComma("SearchPostsFreeSearches", i21));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d == null) {
            b(null);
        }
        if (this.M) {
            return;
        }
        this.M = true;
        MessagesController.getGlobalMainSettings().edit().putInt("searchpostsnew", MessagesController.getGlobalMainSettings().getInt("searchpostsnew", 0) + 1).apply();
        lh.t7.y(this.b, false).p();
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.G) {
            return;
        }
        super.requestLayout();
    }

    public void setKeyboardHeight(int i10) {
        this.y.animate().translationY((-i10) / 2.0f).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.r1.w).start();
    }
}
