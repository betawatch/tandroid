package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public class jg0 extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is {
    public boolean E;
    public boolean F;
    public boolean G;
    public String H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public final a0.g S;
    public org.telegram.ui.Components.fh0 T;
    public LinearLayout U;
    public int V;
    public boolean W;
    public ImageReceiver X;
    public boolean Y;
    public boolean Z;
    public TLRPC.ChatFull a;
    public final m4 a0;
    public final long b;
    public FrameLayout b0;
    public final int c;
    public fg0 c0;
    public hg0 d;
    public lg.f d0;
    public org.telegram.ui.Components.ny e;
    public final boolean e0;
    public org.telegram.ui.Components.uj0 f;
    public w41 f0;
    public v4.b0 h;
    public final org.telegram.messenger.gj n;
    public l41 r;
    public l41 s;
    public final h2.j0 w;
    public y41 x;
    public final ArrayList y;

    public jg0(long j3, org.telegram.messenger.gj gjVar, boolean z10) {
        super(null);
        this.w = new h2.j0(15, 2);
        this.y = new ArrayList();
        this.H = null;
        this.S = new a0.g(0);
        this.a0 = new m4(this, 12);
        this.n = gjVar;
        this.c = 0;
        this.b = j3;
        this.a = getMessagesController().N0(j3);
        this.e0 = z10;
    }

    public static void Z(jg0 jg0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        TL_stats.StatsGraph statsGraph;
        TL_stats.StatsGraph statsGraph2;
        jg0Var.E = true;
        if (tL_error != null) {
            jg0Var.m0();
            return;
        }
        if (tLObject instanceof TL_stories.TL_stats_storyStats) {
            TL_stories.TL_stats_storyStats tL_stats_storyStats = (TL_stories.TL_stats_storyStats) tLObject;
            statsGraph = tL_stats_storyStats.views_graph;
            statsGraph2 = tL_stats_storyStats.reactions_by_emotion_graph;
        } else {
            TL_stats.TL_messageStats tL_messageStats = (TL_stats.TL_messageStats) tLObject;
            statsGraph = tL_messageStats.views_graph;
            statsGraph2 = tL_messageStats.reactions_by_emotion_graph;
        }
        jg0Var.r = z41.i0(statsGraph, org.telegram.messenger.hd.M0(2131743530, null), 1, false);
        jg0Var.s = z41.i0(statsGraph2, org.telegram.messenger.hd.M0(2131746385, null), 2, false);
        l41 l41Var = jg0Var.r;
        if (l41Var == null || l41Var.d.a.length > 5) {
            jg0Var.m0();
            return;
        }
        jg0Var.E = false;
        TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
        l41 l41Var2 = jg0Var.r;
        tL_loadAsyncGraph.token = l41Var2.g;
        long[] jArr = l41Var2.d.a;
        tL_loadAsyncGraph.x = jArr[jArr.length - 1];
        tL_loadAsyncGraph.flags |= 1;
        ConnectionsManager.getInstance(jg0Var.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(jg0Var.currentAccount).sendRequest(tL_loadAsyncGraph, new z9(jg0Var, jg0Var.r.g + "_" + tL_loadAsyncGraph.x, tL_loadAsyncGraph, 24), null, null, 0, jg0Var.a.stats_dc, 1, true), jg0Var.classGuid);
    }

    public static /* synthetic */ void a0(jg0 jg0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        ArrayList arrayList = jg0Var.y;
        if (tL_error == null) {
            TL_stats.TL_publicForwards tL_publicForwards = (TL_stats.TL_publicForwards) tLObject;
            if ((tL_publicForwards.flags & 1) != 0) {
                jg0Var.H = tL_publicForwards.next_offset;
            } else {
                jg0Var.H = null;
            }
            int i7 = tL_publicForwards.count;
            if (i7 != 0) {
                jg0Var.V = i7;
            } else if (jg0Var.V == 0) {
                jg0Var.V = tL_publicForwards.forwards.size();
            }
            jg0Var.W = jg0Var.H == null;
            jg0Var.getMessagesController().S3(tL_publicForwards.chats, false);
            jg0Var.getMessagesController().Y3(tL_publicForwards.users, false);
            ArrayList<TL_stats.PublicForward> arrayList2 = tL_publicForwards.forwards;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                TL_stats.PublicForward publicForward = arrayList2.get(i10);
                i10++;
                TL_stats.PublicForward publicForward2 = publicForward;
                if (publicForward2 instanceof TL_stories.TL_publicForwardStory) {
                    TL_stories.TL_publicForwardStory tL_publicForwardStory = (TL_stories.TL_publicForwardStory) publicForward2;
                    tL_publicForwardStory.story.dialogId = org.telegram.messenger.m5.o(tL_publicForwardStory.peer);
                    TL_stories.StoryItem storyItem = tL_publicForwardStory.story;
                    storyItem.messageId = storyItem.id;
                    org.telegram.messenger.gj gjVar = new org.telegram.messenger.gj(jg0Var.currentAccount, storyItem);
                    gjVar.r0(false);
                    arrayList.add(gjVar);
                } else if (publicForward2 instanceof TL_stats.TL_publicForwardMessage) {
                    arrayList.add(new org.telegram.messenger.gj(jg0Var.currentAccount, ((TL_stats.TL_publicForwardMessage) publicForward2).message, false, true));
                }
            }
            org.telegram.ui.Components.ny nyVar = jg0Var.e;
            if (nyVar != null) {
                nyVar.c();
            }
        }
        jg0Var.G = true;
        jg0Var.F = false;
        jg0Var.m0();
    }

    public static /* synthetic */ void b0(jg0 jg0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        ArrayList arrayList = jg0Var.y;
        if (tL_error == null) {
            TL_stats.TL_publicForwards tL_publicForwards = (TL_stats.TL_publicForwards) tLObject;
            if ((tL_publicForwards.flags & 1) != 0) {
                jg0Var.H = tL_publicForwards.next_offset;
            } else {
                jg0Var.H = null;
            }
            int i7 = tL_publicForwards.count;
            if (i7 != 0) {
                jg0Var.V = i7;
            } else if (jg0Var.V == 0) {
                jg0Var.V = tL_publicForwards.forwards.size();
            }
            jg0Var.W = jg0Var.H == null;
            jg0Var.getMessagesController().S3(tL_publicForwards.chats, false);
            jg0Var.getMessagesController().Y3(tL_publicForwards.users, false);
            ArrayList<TL_stats.PublicForward> arrayList2 = tL_publicForwards.forwards;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                TL_stats.PublicForward publicForward = arrayList2.get(i10);
                i10++;
                TL_stats.PublicForward publicForward2 = publicForward;
                if (publicForward2 instanceof TL_stories.TL_publicForwardStory) {
                    TL_stories.TL_publicForwardStory tL_publicForwardStory = (TL_stories.TL_publicForwardStory) publicForward2;
                    tL_publicForwardStory.story.dialogId = org.telegram.messenger.m5.o(tL_publicForwardStory.peer);
                    TL_stories.StoryItem storyItem = tL_publicForwardStory.story;
                    storyItem.messageId = storyItem.id;
                    org.telegram.messenger.gj gjVar = new org.telegram.messenger.gj(jg0Var.currentAccount, storyItem);
                    gjVar.r0(false);
                    arrayList.add(gjVar);
                } else if (publicForward2 instanceof TL_stats.TL_publicForwardMessage) {
                    arrayList.add(new org.telegram.messenger.gj(jg0Var.currentAccount, ((TL_stats.TL_publicForwardMessage) publicForward2).message, false, true));
                }
            }
            org.telegram.ui.Components.ny nyVar = jg0Var.e;
            if (nyVar != null) {
                nyVar.c();
            }
        }
        jg0Var.G = true;
        jg0Var.F = false;
        jg0Var.m0();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.ik));
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final View createView(Context context) {
        CharSequence charSequence;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.a7, frameLayout, getResourceProvider());
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.ny nyVar = new org.telegram.ui.Components.ny(context, null);
        this.e = nyVar;
        nyVar.setText(org.telegram.messenger.hd.M0(2131748167, null));
        this.e.setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.U = linearLayout;
        linearLayout.setOrientation(1);
        org.telegram.ui.Components.fh0 fh0Var = new org.telegram.ui.Components.fh0(context);
        this.T = fh0Var;
        fh0Var.setAutoRepeat(true);
        this.T.f(R.raw.statistic_preload, 120, 120, null);
        this.T.d();
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        int i7 = org.telegram.ui.ActionBar.j6.Fj;
        org.telegram.ui.ActionBar.q6.U(textView, i7, getResourceProvider());
        textView.setTag(Integer.valueOf(i7));
        textView.setText(org.telegram.messenger.hd.M0(2131748777, null));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i10 = org.telegram.ui.ActionBar.j6.Gj;
        org.telegram.ui.ActionBar.q6.U(textView2, i10, getResourceProvider());
        textView2.setTag(Integer.valueOf(i10));
        textView2.setText(org.telegram.messenger.hd.M0(2131748776, null));
        textView2.setGravity(1);
        this.U.addView(this.T, c8.ja.t(120, 120, 1, 0, 0, 0, 20));
        this.U.addView(textView, c8.ja.t(-2, -2, 1, 0, 0, 0, 10));
        this.U.addView(textView2, c8.ja.r(-2, -2, 1));
        this.U.setAlpha(0.0f);
        frameLayout2.addView(this.U, c8.ja.d(org.telegram.messenger.ns.P3, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(context, getResourceProvider());
        this.f = uj0Var;
        uj0Var.r1();
        org.telegram.ui.Components.uj0 uj0Var2 = this.f;
        v4.b0 b0Var = new v4.b0(1, false);
        this.h = b0Var;
        uj0Var2.setLayoutManager(b0Var);
        ((v4.g1) this.f.getItemAnimator()).m = false;
        org.telegram.ui.Components.uj0 uj0Var3 = this.f;
        hg0 hg0Var = new hg0(this, context);
        this.d = hg0Var;
        uj0Var3.setAdapter(hg0Var);
        this.f.setVerticalScrollbarPosition(org.telegram.messenger.hd.a0 ? 1 : 2);
        this.actionBar.setAdaptiveBackground(this.f);
        this.f.setOnItemClickListener(new h(this, 18));
        this.f.setOnItemLongClickListener(new zr(this, 23));
        this.f.setOnScrollListener(new g3(this, 20));
        this.e.c();
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.b0 = frameLayout3;
        frameLayout3.addView(this.f, c8.ja.c(-1.0f, -1));
        this.b0.addView(this.e, c8.ja.c(-1.0f, -1));
        this.b0.setVisibility(8);
        frameLayout2.addView(this.b0, c8.ja.c(-1.0f, -1));
        org.telegram.messenger.g0.i3(this.a0, 300L);
        m0();
        this.f.setEmptyView(this.e);
        this.c0 = new fg0(this, context);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.X = imageReceiver;
        imageReceiver.H0(this.c0);
        this.X.J0(org.telegram.messenger.g0.L(9.0f));
        this.Z = false;
        org.telegram.messenger.gj gjVar = this.n;
        int i11 = 50;
        if (!gjVar.x4()) {
            if (!gjVar.m5() && (org.telegram.messenger.gj.S3(gjVar.k) || gjVar.L3() || org.telegram.messenger.gj.L4(gjVar.k))) {
                String str = gjVar.Z4() ? gjVar.k.media.webpage.type : null;
                if (!"app".equals(str) && !"profile".equals(str) && !"article".equals(str) && (str == null || !str.startsWith("telegram_"))) {
                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(gjVar.p0, 50, false, null, false);
                    TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(gjVar.p0, org.telegram.messenger.g0.Z0(false), false, null, false);
                    if (w10 == w11) {
                        w11 = null;
                    }
                    if (w10 != null) {
                        this.Z = true;
                        this.Y = org.telegram.messenger.gj.L4(gjVar.k);
                        String r10 = org.telegram.messenger.w7.r(null, w11);
                        if (gjVar.z0 || org.telegram.messenger.z5.q(this.currentAccount).d(gjVar) || org.telegram.messenger.w7.G(this.currentAccount).S(r10)) {
                            this.X.r0(org.telegram.messenger.gc.f(w11, gjVar.n0), "50_50", org.telegram.messenger.gc.f(w10, gjVar.n0), "50_50", null, (gjVar.D != 1 || w11 == null) ? 0 : w11.size, null, this.n, 0);
                        } else {
                            this.X.s0(null, null, org.telegram.messenger.gc.f(w10, gjVar.n0), "50_50", null, this.n, 0);
                        }
                    }
                }
            }
            if (!TextUtils.isEmpty(gjVar.z)) {
                charSequence = gjVar.z;
            } else if (TextUtils.isEmpty(gjVar.k.message)) {
                charSequence = gjVar.v;
            } else {
                CharSequence charSequence2 = gjVar.v;
                if (charSequence2.length() > 150) {
                    charSequence2 = charSequence2.subSequence(0, org.telegram.messenger.ns.g2);
                }
                charSequence = org.telegram.messenger.j6.m(charSequence2, this.c0.getSubtitlePaint().getFontMetricsInt(), false, null, 0);
            }
            if (org.telegram.messenger.gj.L4(gjVar.k) || org.telegram.messenger.gj.S3(gjVar.k)) {
                fg0 fg0Var = this.c0;
                if (fg0Var.getSubtitleTextView() != null) {
                    fg0Var.getSubtitleTextView().setVisibility(8);
                }
            } else {
                this.c0.setSubtitle(charSequence);
            }
        }
        if (this.Z || gjVar.x4()) {
            this.c0.setRightAvatarPadding(-org.telegram.messenger.g0.L(3.0f));
        } else {
            i11 = 56;
        }
        this.actionBar.addView(this.c0, 0, c8.ja.d(-2, -1.0f, 51, this.inPreviewMode ? 0.0f : i11, 0.0f, 40.0f, 0.0f));
        k0();
        this.c0.i(org.telegram.ui.ActionBar.j6.w0(i7, getResourceProvider()), org.telegram.ui.ActionBar.j6.w0(i10, getResourceProvider()));
        View subtitleTextView = this.c0.getSubtitleTextView();
        if (subtitleTextView instanceof org.telegram.ui.ActionBar.j5) {
            ((org.telegram.ui.ActionBar.j5) subtitleTextView).setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(i10, getResourceProvider()));
        }
        org.telegram.ui.ActionBar.q6.l(this.actionBar, 1, org.telegram.ui.ActionBar.j6.G6, getResourceProvider());
        org.telegram.ui.ActionBar.q6.l(this.actionBar, 3, org.telegram.ui.ActionBar.j6.z8, getResourceProvider());
        this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        this.actionBar.setActionBarMenuOnItemClick(new lx(this, 18));
        this.c0.setOnClickListener(new g40(this, 11));
        l0();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (this.a == null && chatFull.id == this.b) {
                k0();
                this.a = chatFull;
                i0();
                h0();
                l0();
            }
        }
    }

    public final void f0() {
        org.telegram.ui.Components.uj0 uj0Var = this.f;
        if (uj0Var != null) {
            int childCount = uj0Var.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                j0(this.f.getChildAt(i7));
            }
            int hiddenChildCount = this.f.getHiddenChildCount();
            for (int i10 = 0; i10 < hiddenChildCount; i10++) {
                j0(this.f.V(i10));
            }
            int cachedChildCount = this.f.getCachedChildCount();
            for (int i11 = 0; i11 < cachedChildCount; i11++) {
                j0(this.f.P(i11));
            }
            int attachedScrapChildCount = this.f.getAttachedScrapChildCount();
            for (int i12 = 0; i12 < attachedScrapChildCount; i12++) {
                j0(this.f.O(i12));
            }
            this.f.getRecycledViewPool().a();
        }
        lg.f fVar = this.d0;
        if (fVar != null) {
            fVar.c = true;
        }
        fg0 fg0Var = this.c0;
        View subtitleTextView = fg0Var == null ? null : fg0Var.getSubtitleTextView();
        if (subtitleTextView instanceof org.telegram.ui.ActionBar.j5) {
            ((org.telegram.ui.ActionBar.j5) subtitleTextView).setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Gj, getResourceProvider()));
        }
    }

    public final boolean g0(org.telegram.messenger.gj gjVar) {
        if (!gjVar.x4() || !(gjVar.l instanceof TL_stories.TL_storyItemDeleted)) {
            return false;
        }
        org.telegram.messenger.k5.n(null, 2131744606, org.telegram.ui.Components.cc.a0(this), R.raw.story_bomb1, 36);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        g6 g6Var = new g6(13, this);
        fg0 fg0Var = this.c0;
        arrayList.add(new org.telegram.ui.ActionBar.s6(fg0Var != null ? fg0Var.getTitleTextView() : null, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Fj));
        fg0 fg0Var2 = this.c0;
        arrayList.add(new org.telegram.ui.ActionBar.s6(org.telegram.ui.ActionBar.j6.Gj, fg0Var2 != null ? fg0Var2.getSubtitleTextView() : null));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.j6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.j6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.actionBar, TLObject.FLAG_31, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.actionBar, TLObject.FLAG_30, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.F8));
        z41.n0(this.r, arrayList, g6Var);
        z41.n0(this.s, arrayList, g6Var);
        return arrayList;
    }

    public final void h0() {
        if (this.F) {
            return;
        }
        this.F = true;
        hg0 hg0Var = this.d;
        if (hg0Var != null) {
            hg0Var.f();
        }
        org.telegram.messenger.gj gjVar = this.n;
        if (gjVar.x4()) {
            TL_stats.TL_getStoryPublicForwards tL_getStoryPublicForwards = new TL_stats.TL_getStoryPublicForwards();
            tL_getStoryPublicForwards.limit = 100;
            tL_getStoryPublicForwards.id = gjVar.l.id;
            tL_getStoryPublicForwards.peer = getMessagesController().j1(-this.b);
            String str = this.H;
            tL_getStoryPublicForwards.offset = str != null ? str : "";
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getStoryPublicForwards, new dg0(this, 1), null, null, 0, this.a.stats_dc, 1, true), this.classGuid);
            return;
        }
        TL_stats.TL_getMessagePublicForwards tL_getMessagePublicForwards = new TL_stats.TL_getMessagePublicForwards();
        tL_getMessagePublicForwards.limit = 100;
        TLRPC.MessageFwdHeader messageFwdHeader = gjVar.k.fwd_from;
        if (messageFwdHeader != null) {
            tL_getMessagePublicForwards.msg_id = messageFwdHeader.saved_from_msg_id;
            tL_getMessagePublicForwards.channel = getMessagesController().h1(-gjVar.Z0());
        } else {
            tL_getMessagePublicForwards.msg_id = gjVar.e1();
            tL_getMessagePublicForwards.channel = getMessagesController().h1(-org.telegram.messenger.gj.B0(gjVar.k));
        }
        String str2 = this.H;
        tL_getMessagePublicForwards.offset = str2 != null ? str2 : "";
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getMessagePublicForwards, new dg0(this, 2), null, null, 0, this.a.stats_dc, 1, true), this.classGuid);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i0() {
        TL_stats.TL_getMessageStats tL_getMessageStats;
        org.telegram.messenger.gj gjVar = this.n;
        if (gjVar.x4()) {
            TL_stories.TL_stats_getStoryStats tL_stats_getStoryStats = new TL_stories.TL_stats_getStoryStats();
            tL_stats_getStoryStats.id = gjVar.l.id;
            tL_stats_getStoryStats.peer = getMessagesController().j1(-this.b);
            tL_getMessageStats = tL_stats_getStoryStats;
        } else {
            TL_stats.TL_getMessageStats tL_getMessageStats2 = new TL_stats.TL_getMessageStats();
            TLRPC.MessageFwdHeader messageFwdHeader = gjVar.k.fwd_from;
            if (messageFwdHeader != null) {
                tL_getMessageStats2.msg_id = messageFwdHeader.saved_from_msg_id;
                tL_getMessageStats2.channel = getMessagesController().h1(-gjVar.Z0());
                tL_getMessageStats = tL_getMessageStats2;
            } else {
                tL_getMessageStats2.msg_id = gjVar.e1();
                tL_getMessageStats2.channel = getMessagesController().h1(-org.telegram.messenger.gj.B0(gjVar.k));
                tL_getMessageStats = tL_getMessageStats2;
            }
        }
        getConnectionsManager().sendRequest(tL_getMessageStats, new dg0(this, 0), null, null, 0, this.a.stats_dc, 1, true);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public boolean isLightStatusBar() {
        return i0.a.h(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.d6, getResourceProvider())) > 0.699999988079071d;
    }

    public final void j0(View view) {
        if (view instanceof org.telegram.ui.Cells.a5) {
            org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
            int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.y6, getResourceProvider());
            int w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.n6, getResourceProvider());
            a5Var.P = true;
            a5Var.I = w02;
            a5Var.J = w03;
            a5Var.d(0);
        } else if (view instanceof j41) {
            ((j41) view).d();
            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, view, getResourceProvider());
        } else {
            boolean z10 = view instanceof org.telegram.ui.Cells.x6;
            if (z10 && (view.getBackground() instanceof org.telegram.ui.Components.fq) && (((org.telegram.ui.Components.fq) view.getBackground()).a instanceof ColorDrawable)) {
                ((ColorDrawable) ((org.telegram.ui.Components.fq) view.getBackground()).a).setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.a7, getResourceProvider()));
                view.invalidate();
            } else if (z10) {
                org.telegram.ui.Components.fq fqVar = new org.telegram.ui.Components.fq(new ColorDrawable(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.a7, getResourceProvider())), org.telegram.ui.ActionBar.j6.Y0(org.telegram.messenger.t0.b, R.drawable.greydivider, org.telegram.ui.ActionBar.j6.b7), 0, 0);
                fqVar.x = true;
                view.setBackground(fqVar);
            } else if (view instanceof ng.c) {
                ((ng.c) view).a();
            } else if (view instanceof ig0) {
                int i7 = ig0.d;
                ((ig0) view).a();
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, view, getResourceProvider());
            }
        }
        if (view instanceof org.telegram.ui.Cells.m3) {
            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, view, getResourceProvider());
        }
    }

    public final void k0() {
        org.telegram.messenger.gj gjVar = this.n;
        if (!gjVar.x4()) {
            this.c0.setTitle(org.telegram.messenger.hd.M0(2131747097, null));
            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.b));
            if (M0 == null || this.Z) {
                return;
            }
            this.c0.setChatAvatar(M0);
            return;
        }
        this.c0.setTitle(org.telegram.messenger.hd.M0(2131744458, null));
        fg0 fg0Var = this.c0;
        if (fg0Var.getSubtitleTextView() != null) {
            fg0Var.getSubtitleTextView().setVisibility(8);
        }
        fg0 fg0Var2 = this.c0;
        fg0Var2.b = true;
        fg0Var2.setStoriesForceState(1);
        ArrayList arrayList = gjVar.p0;
        if (arrayList != null) {
            this.c0.getAvatarImageView().l(org.telegram.messenger.gc.f(org.telegram.messenger.w7.w(arrayList, org.telegram.messenger.g0.Z0(false), false, null, false), gjVar.n0), "50_50", org.telegram.messenger.gc.f(org.telegram.messenger.w7.w(gjVar.p0, 50, false, null, false), gjVar.n0), "b1", 0, this.n);
            this.c0.setClipChildren(false);
            this.c0.getAvatarImageView().setScaleX(0.96f);
            this.c0.getAvatarImageView().setScaleY(0.96f);
        }
    }

    public final void l0() {
        TLRPC.ChatFull chatFull;
        if (this.e0 && (chatFull = this.a) != null && chatFull.can_view_stats) {
            org.telegram.ui.ActionBar.y s5 = this.actionBar.s();
            ArrayList arrayList = s5.e;
            if (arrayList != null) {
                arrayList.clear();
            }
            s5.removeAllViews();
            s5.a(0, R.drawable.ic_ab_other).e(1, R.drawable.msg_stats, org.telegram.messenger.hd.M0(2131743559, null));
        }
    }

    public final void m0() {
        a0.g gVar = this.S;
        gVar.clear();
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.P = -1;
        this.O = -1;
        this.R = 0;
        if (this.G && this.E) {
            org.telegram.messenger.g0.r(this.a0);
            if (this.b0.getVisibility() == 8) {
                this.U.animate().alpha(0.0f).setListener(new xx(this, 6));
                this.b0.setVisibility(0);
                this.b0.setAlpha(0.0f);
                this.b0.animate().alpha(1.0f).start();
            }
            int i7 = this.R;
            this.P = i7;
            this.O = i7 + 1;
            this.R = i7 + 3;
            gVar.add(Integer.valueOf(i7 + 2));
            if (this.r != null) {
                int i10 = this.R;
                this.M = i10;
                this.R = i10 + 2;
                gVar.add(Integer.valueOf(i10 + 1));
            }
            if (this.s != null) {
                int i11 = this.R;
                this.N = i11;
                this.R = i11 + 2;
                gVar.add(Integer.valueOf(i11 + 1));
            }
            ArrayList arrayList = this.y;
            if (!arrayList.isEmpty()) {
                int i12 = this.R;
                int i13 = i12 + 1;
                this.R = i13;
                this.I = i12;
                this.J = i13;
                int size = arrayList.size() + i13;
                this.K = size;
                this.Q = size;
                this.R = size + 2;
                gVar.add(Integer.valueOf(size + 1));
                if (!this.W) {
                    int i14 = this.R;
                    this.R = i14 + 1;
                    this.L = i14;
                }
            }
        }
        hg0 hg0Var = this.d;
        if (hg0Var != null) {
            hg0Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        if (this.a != null) {
            i0();
            h0();
        } else {
            org.telegram.messenger.np.s1(this.currentAccount).V2(this.classGuid, this.b, true);
        }
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.T);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.T);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onResume() {
        super.onResume();
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        hg0 hg0Var = this.d;
        if (hg0Var != null) {
            hg0Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            fg0 fg0Var = this.c0;
            if (fg0Var != null) {
                fg0Var.i(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fj, getResourceProvider()), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Gj, getResourceProvider()));
            }
            f0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public jg0(org.telegram.messenger.gj gjVar) {
        super(null);
        this.w = new h2.j0(15, 2);
        this.y = new ArrayList();
        this.H = null;
        this.S = new a0.g(0);
        this.a0 = new m4(this, 12);
        this.n = gjVar;
        if (gjVar.k.fwd_from == null) {
            this.b = gjVar.x0();
            this.c = gjVar.e1();
        } else {
            this.b = -gjVar.Z0();
            this.c = gjVar.k.fwd_msg_id;
        }
        this.a = getMessagesController().N0(this.b);
    }
}
