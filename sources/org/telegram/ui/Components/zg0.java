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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class zg0 extends FrameLayout {
    public final u9 E;
    public final TextView F;
    public final TextView G;
    public final ci.d H;
    public final TextView I;
    public boolean J;
    public int K;
    public int L;
    public boolean M;
    public boolean N;
    public int O;
    public boolean P;
    public boolean Q;
    public oq R;
    public oq S;
    public lu T;
    public final oq[] U;
    public final wg0 V;
    public final org.telegram.ui.wy a;
    public final int b;
    public final f61 c;
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
    public final org.telegram.ui.zd y;

    public zg0(Context context, org.telegram.ui.wy wyVar) {
        super(context);
        this.e = new ArrayList();
        this.n = new ArrayList();
        this.K = -1;
        this.L = 0;
        this.O = -1;
        this.U = new oq[1];
        this.V = new wg0(this, 1);
        this.a = wyVar;
        int currentAccount = wyVar.getCurrentAccount();
        this.b = currentAccount;
        f61 f61Var = new f61(context, currentAccount, 0, false, new d(this, 18), new lv(this, 11), null, null);
        this.c = f61Var;
        f61Var.j(new ii.m3(3, this, wyVar));
        addView(f61Var, w7.x5.e(-1, -1, 119));
        FrameLayout frameLayout = new FrameLayout(context);
        this.x = frameLayout;
        org.telegram.ui.zd zdVar = new org.telegram.ui.zd(context, 3);
        this.y = zdVar;
        zdVar.setOrientation(1);
        frameLayout.addView(zdVar, w7.x5.d(-2, -2.0f, 17, 32.0f, 0.0f, 32.0f, 0.0f));
        u9 u9Var = new u9(context);
        this.E = u9Var;
        u9Var.setVisibility(8);
        zdVar.addView(u9Var, w7.x5.t(130, 130, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        this.F = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setSingleLine(false);
        textView.setMaxLines(4);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        zdVar.addView(textView, w7.x5.q(-2, -2, 1));
        TextView textView2 = new TextView(context);
        this.G = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setSingleLine(false);
        textView2.setMaxLines(4);
        textView2.setEllipsize(truncateAt);
        zdVar.addView(textView2, w7.x5.t(-2, -2, 1, 0, 9, 0, 0));
        ci.d g10 = org.telegram.messenger.wl.g(24, context, null, true);
        this.H = g10;
        zdVar.addView(g10, w7.x5.t(-1, 44, 7, 0, 19, 0, 0));
        TextView textView3 = new TextView(context);
        this.I = textView3;
        textView3.setTextSize(1, 12.0f);
        textView3.setGravity(17);
        zdVar.addView(textView3, w7.x5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        addView(frameLayout, w7.x5.e(-1, -1, 119));
        f61Var.setHideIfEmpty(false);
        f61Var.setEmptyView(frameLayout);
        f61Var.Y1 = true;
        f61Var.Z1 = 0;
        c();
        d();
    }

    public final void a(boolean z10) {
        long j3;
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
                        MessageObject messageObject = (MessageObject) hg.k0.h(1, arrayList);
                        tL_channels_searchPosts.offset_rate = this.f;
                        tL_channels_searchPosts.offset_id = messageObject.getRealId();
                        tL_channels_searchPosts.offset_peer = messagesController.getInputPeer(messageObject.messageOwner.peer_id);
                    }
                } else {
                    ArrayList arrayList2 = this.n;
                    if (arrayList2.isEmpty()) {
                        tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    } else {
                        MessageObject messageObject2 = (MessageObject) hg.k0.h(1, arrayList2);
                        tL_channels_searchPosts.offset_rate = this.r;
                        tL_channels_searchPosts.offset_id = messageObject2.getRealId();
                        tL_channels_searchPosts.offset_peer = messagesController.getInputPeer(messageObject2.messageOwner.peer_id);
                    }
                }
                if (!z10 || (searchPostsFlood = this.d) == null) {
                    j3 = 0;
                } else {
                    tL_channels_searchPosts.flags |= 4;
                    j3 = searchPostsFlood.stars_amount;
                    tL_channels_searchPosts.allow_paid_stars = j3;
                }
                this.K = connectionsManager.sendRequest(tL_channels_searchPosts, new f7(this, messagesController, isEmpty, tL_channels_searchPosts, z10, j3, connectionsManager), 1024);
                d();
                this.c.Y2.N(true);
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
        this.O = ConnectionsManager.getInstance(i11).sendRequest(tL_channels_checkSearchPostsFlood, new x1(this, 9));
    }

    public final void c() {
        this.x.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
        this.F.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        int i10 = org.telegram.ui.ActionBar.j6.y6;
        this.I.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.G.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        f61 f61Var = this.c;
        f61Var.setAdapter(null);
        f61Var.setAdapter(f61Var.Y2);
        if (this.T != null) {
            this.T = null;
            d();
        }
    }

    public final void d() {
        float f7;
        TLRPC.SearchPostsFlood searchPostsFlood;
        wg0 wg0Var = this.V;
        AndroidUtilities.cancelRunOnUIThread(wg0Var);
        int i10 = this.b;
        int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        boolean isPremium = UserConfig.getInstance(i10).isPremium();
        TextView textView = this.G;
        TextView textView2 = this.F;
        u9 u9Var = this.E;
        TextView textView3 = this.I;
        final int i11 = 1;
        ci.d dVar = this.H;
        final int i12 = 0;
        if (!isPremium) {
            u9Var.setVisibility(8);
            textView2.setText(LocaleController.getString(R.string.SearchPostsTitle));
            textView.setText(LocaleController.getString(R.string.SearchPostsText));
            dVar.setVisibility(0);
            dVar.g(LocaleController.getString(R.string.SearchPostsButtonPremium), true, true);
            dVar.f(null, true);
            dVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xg0
                public final /* synthetic */ zg0 b;

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
                            zg0 zg0Var = this.b;
                            zg0Var.H.setLoading(true);
                            zg0Var.a(true);
                            break;
                        default:
                            zg0 zg0Var2 = this.b;
                            zg0Var2.H.setLoading(true);
                            zg0Var2.a(false);
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
            if (u9Var.getImageReceiver().getImageDrawable() == null) {
                u9Var.setImageDrawable(new yi0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), AndroidUtilities.dp(130.0f)));
            }
            u9Var.setVisibility(0);
            textView2.setText(LocaleController.getString(R.string.SearchPostsNotFound));
            textView.setText(LocaleController.formatString(R.string.SearchPostsNotFoundText, TextUtils.ellipsize(this.w, textView.getPaint(), AndroidUtilities.dp(100.0f), TextUtils.TruncateAt.END)));
            dVar.setVisibility(8);
            textView3.setVisibility(8);
            return;
        }
        final int i13 = 2;
        if (TextUtils.isEmpty(this.w) || (searchPostsFlood = this.d) == null) {
            f7 = 100.0f;
        } else {
            f7 = 100.0f;
            if ((searchPostsFlood.flags & 2) != 0 && currentTime < searchPostsFlood.wait_till) {
                u9Var.setVisibility(8);
                textView2.setText(LocaleController.getString(R.string.SearchPostsLimitReached));
                textView.setText(LocaleController.formatPluralStringComma("SearchPostsLimitReachedText", this.d.total_daily));
                int i14 = this.d.wait_till - currentTime;
                int i15 = i14 / 3600;
                int i16 = i14 - (i15 * 3600);
                int i17 = i16 / 60;
                int i18 = i16 - (i17 * 60);
                dVar.setVisibility(0);
                dVar.g(yh.y7.R0(LocaleController.formatPluralStringComma("SearchPostsButtonPay", (int) this.d.stars_amount), 1.13f, this.U), true, true);
                int i19 = R.string.SearchPostsFreeSearchUnlocksIn;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i15 > 0 ? a4.a.m(i15, ":") : "");
                sb2.append(i17 < 10 ? hg.k0.i(i17, "0") : Integer.valueOf(i17));
                sb2.append(":");
                sb2.append(i18 < 10 ? hg.k0.i(i18, "0") : Integer.valueOf(i18));
                dVar.f(LocaleController.formatString(i19, sb2.toString()), true);
                dVar.e.o(false, true, false);
                dVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xg0
                    public final /* synthetic */ zg0 b;

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
                                zg0 zg0Var = this.b;
                                zg0Var.H.setLoading(true);
                                zg0Var.a(true);
                                break;
                            default:
                                zg0 zg0Var2 = this.b;
                                zg0Var2.H.setLoading(true);
                                zg0Var2.a(false);
                                break;
                        }
                    }
                });
                AndroidUtilities.runOnUIThread(wg0Var, 1000L);
                textView3.setVisibility(8);
                return;
            }
        }
        if (!arrayList.isEmpty() || this.v || TextUtils.isEmpty(this.w)) {
            u9Var.setVisibility(8);
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
        u9Var.setVisibility(8);
        textView2.setText(LocaleController.getString(R.string.SearchPostsTitle));
        textView.setText(LocaleController.getString(R.string.SearchPostsText));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("s ");
        if (this.R == null) {
            oq oqVar = new oq(R.drawable.smiles_tab_search, 0);
            this.R = oqVar;
            oqVar.setScale(0.79f, 0.79f);
        }
        if (this.T == null) {
            this.T = new lu(org.telegram.ui.ActionBar.j6.v(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false), org.telegram.ui.ActionBar.j6.l1(0.75f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false))), 1);
        }
        spannableStringBuilder.setSpan(this.R, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.SearchPostsButton));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(TextUtils.ellipsize(this.w, dVar.getTextPaint(), AndroidUtilities.dp(f7), TextUtils.TruncateAt.END));
        spannableStringBuilder.setSpan(this.T, length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) " >");
        if (this.S == null) {
            oq oqVar2 = new oq(R.drawable.msg_mini_forumarrow, 0);
            this.S = oqVar2;
            oqVar2.setScale(1.05f, 1.05f);
        }
        spannableStringBuilder.setSpan(this.S, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        dVar.setVisibility(0);
        dVar.g(spannableStringBuilder, true, true);
        dVar.d.o(false, false, false);
        dVar.f(null, true);
        dVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xg0
            public final /* synthetic */ zg0 b;

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
                        zg0 zg0Var = this.b;
                        zg0Var.H.setLoading(true);
                        zg0Var.a(true);
                        break;
                    default:
                        zg0 zg0Var2 = this.b;
                        zg0Var2.H.setLoading(true);
                        zg0Var2.a(false);
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
        if (this.P) {
            return;
        }
        this.P = true;
        MessagesController.getGlobalMainSettings().edit().putInt("searchpostsnew", MessagesController.getGlobalMainSettings().getInt("searchpostsnew", 0) + 1).apply();
        yh.v5.y(this.b, false).p();
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.J) {
            return;
        }
        super.requestLayout();
    }

    public void setKeyboardHeight(int i10) {
        this.y.animate().translationY((-i10) / 2.0f).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.q1.w).start();
    }
}
