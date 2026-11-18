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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public class ng0 extends org.telegram.ui.ActionBar.h2 implements org.telegram.messenger.fs {
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
    public org.telegram.ui.Components.ph0 T;
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
    public ig0 c0;
    public lg0 d;
    public lg.f d0;
    public org.telegram.ui.Components.ty e;
    public final boolean e0;
    public org.telegram.ui.Components.ck0 f;
    public z41 f0;
    public v4.c0 h;
    public final org.telegram.messenger.fj n;
    public o41 r;
    public o41 s;
    public final h2.j0 w;
    public b51 x;
    public final ArrayList y;

    public ng0(long j3, org.telegram.messenger.fj fjVar, boolean z10) {
        super(null);
        this.w = new h2.j0(15, 2);
        this.y = new ArrayList();
        this.H = null;
        this.S = new a0.g(0);
        this.a0 = new m4(this, 12);
        this.n = fjVar;
        this.c = 0;
        this.b = j3;
        this.a = getMessagesController().P0(j3);
        this.e0 = z10;
    }

    public static void Z(ng0 ng0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        TL_stats.StatsGraph statsGraph;
        TL_stats.StatsGraph statsGraph2;
        ng0Var.E = true;
        if (tL_error != null) {
            ng0Var.m0();
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
        ng0Var.r = c51.i0(statsGraph, org.telegram.messenger.gd.M0(2131743293, null), 1, false);
        ng0Var.s = c51.i0(statsGraph2, org.telegram.messenger.gd.M0(2131746190, null), 2, false);
        o41 o41Var = ng0Var.r;
        if (o41Var == null || o41Var.d.a.length > 5) {
            ng0Var.m0();
            return;
        }
        ng0Var.E = false;
        TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
        o41 o41Var2 = ng0Var.r;
        tL_loadAsyncGraph.token = o41Var2.g;
        long[] jArr = o41Var2.d.a;
        tL_loadAsyncGraph.x = jArr[jArr.length - 1];
        tL_loadAsyncGraph.flags |= 1;
        ConnectionsManager.getInstance(ng0Var.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(ng0Var.currentAccount).sendRequest(tL_loadAsyncGraph, new z9(ng0Var, ng0Var.r.g + "_" + tL_loadAsyncGraph.x, tL_loadAsyncGraph, 24), null, null, 0, ng0Var.a.stats_dc, 1, true), ng0Var.classGuid);
    }

    public static /* synthetic */ void a0(ng0 ng0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        ArrayList arrayList = ng0Var.y;
        if (tL_error == null) {
            TL_stats.TL_publicForwards tL_publicForwards = (TL_stats.TL_publicForwards) tLObject;
            if ((tL_publicForwards.flags & 1) != 0) {
                ng0Var.H = tL_publicForwards.next_offset;
            } else {
                ng0Var.H = null;
            }
            int i7 = tL_publicForwards.count;
            if (i7 != 0) {
                ng0Var.V = i7;
            } else if (ng0Var.V == 0) {
                ng0Var.V = tL_publicForwards.forwards.size();
            }
            ng0Var.W = ng0Var.H == null;
            ng0Var.getMessagesController().Z3(tL_publicForwards.chats, false);
            ng0Var.getMessagesController().f4(tL_publicForwards.users, false);
            ArrayList<TL_stats.PublicForward> arrayList2 = tL_publicForwards.forwards;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                TL_stats.PublicForward publicForward = arrayList2.get(i10);
                i10++;
                TL_stats.PublicForward publicForward2 = publicForward;
                if (publicForward2 instanceof TL_stories.TL_publicForwardStory) {
                    TL_stories.TL_publicForwardStory tL_publicForwardStory = (TL_stories.TL_publicForwardStory) publicForward2;
                    tL_publicForwardStory.story.dialogId = org.telegram.messenger.n5.o(tL_publicForwardStory.peer);
                    TL_stories.StoryItem storyItem = tL_publicForwardStory.story;
                    storyItem.messageId = storyItem.id;
                    org.telegram.messenger.fj fjVar = new org.telegram.messenger.fj(ng0Var.currentAccount, storyItem);
                    fjVar.r0(false);
                    arrayList.add(fjVar);
                } else if (publicForward2 instanceof TL_stats.TL_publicForwardMessage) {
                    arrayList.add(new org.telegram.messenger.fj(ng0Var.currentAccount, ((TL_stats.TL_publicForwardMessage) publicForward2).message, false, true));
                }
            }
            org.telegram.ui.Components.ty tyVar = ng0Var.e;
            if (tyVar != null) {
                tyVar.c();
            }
        }
        ng0Var.G = true;
        ng0Var.F = false;
        ng0Var.m0();
    }

    public static /* synthetic */ void b0(ng0 ng0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        ArrayList arrayList = ng0Var.y;
        if (tL_error == null) {
            TL_stats.TL_publicForwards tL_publicForwards = (TL_stats.TL_publicForwards) tLObject;
            if ((tL_publicForwards.flags & 1) != 0) {
                ng0Var.H = tL_publicForwards.next_offset;
            } else {
                ng0Var.H = null;
            }
            int i7 = tL_publicForwards.count;
            if (i7 != 0) {
                ng0Var.V = i7;
            } else if (ng0Var.V == 0) {
                ng0Var.V = tL_publicForwards.forwards.size();
            }
            ng0Var.W = ng0Var.H == null;
            ng0Var.getMessagesController().Z3(tL_publicForwards.chats, false);
            ng0Var.getMessagesController().f4(tL_publicForwards.users, false);
            ArrayList<TL_stats.PublicForward> arrayList2 = tL_publicForwards.forwards;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                TL_stats.PublicForward publicForward = arrayList2.get(i10);
                i10++;
                TL_stats.PublicForward publicForward2 = publicForward;
                if (publicForward2 instanceof TL_stories.TL_publicForwardStory) {
                    TL_stories.TL_publicForwardStory tL_publicForwardStory = (TL_stories.TL_publicForwardStory) publicForward2;
                    tL_publicForwardStory.story.dialogId = org.telegram.messenger.n5.o(tL_publicForwardStory.peer);
                    TL_stories.StoryItem storyItem = tL_publicForwardStory.story;
                    storyItem.messageId = storyItem.id;
                    org.telegram.messenger.fj fjVar = new org.telegram.messenger.fj(ng0Var.currentAccount, storyItem);
                    fjVar.r0(false);
                    arrayList.add(fjVar);
                } else if (publicForward2 instanceof TL_stats.TL_publicForwardMessage) {
                    arrayList.add(new org.telegram.messenger.fj(ng0Var.currentAccount, ((TL_stats.TL_publicForwardMessage) publicForward2).message, false, true));
                }
            }
            org.telegram.ui.Components.ty tyVar = ng0Var.e;
            if (tyVar != null) {
                tyVar.c();
            }
        }
        ng0Var.G = true;
        ng0Var.F = false;
        ng0Var.m0();
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.ik));
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final View createView(Context context) {
        CharSequence charSequence;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.a7, frameLayout, getResourceProvider());
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.ty tyVar = new org.telegram.ui.Components.ty(context, null);
        this.e = tyVar;
        tyVar.setText(org.telegram.messenger.gd.M0(2131747975, null));
        this.e.setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.U = linearLayout;
        linearLayout.setOrientation(1);
        org.telegram.ui.Components.ph0 ph0Var = new org.telegram.ui.Components.ph0(context);
        this.T = ph0Var;
        ph0Var.setAutoRepeat(true);
        this.T.f(R.raw.statistic_preload, 120, 120, null);
        this.T.d();
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        int i7 = org.telegram.ui.ActionBar.n6.Fj;
        org.telegram.ui.ActionBar.u6.U(textView, i7, getResourceProvider());
        textView.setTag(Integer.valueOf(i7));
        textView.setText(org.telegram.messenger.gd.M0(2131748585, null));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i10 = org.telegram.ui.ActionBar.n6.Gj;
        org.telegram.ui.ActionBar.u6.U(textView2, i10, getResourceProvider());
        textView2.setTag(Integer.valueOf(i10));
        textView2.setText(org.telegram.messenger.gd.M0(2131748584, null));
        textView2.setGravity(1);
        this.U.addView(this.T, c8.ma.t(120, 120, 1, 0, 0, 0, 20));
        this.U.addView(textView, c8.ma.t(-2, -2, 1, 0, 0, 0, 10));
        this.U.addView(textView2, c8.ma.r(-2, -2, 1));
        this.U.setAlpha(0.0f);
        frameLayout2.addView(this.U, c8.ma.d(org.telegram.messenger.ks.P3, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        org.telegram.ui.Components.ck0 ck0Var = new org.telegram.ui.Components.ck0(context, getResourceProvider());
        this.f = ck0Var;
        ck0Var.r1();
        org.telegram.ui.Components.ck0 ck0Var2 = this.f;
        v4.c0 c0Var = new v4.c0(1, false);
        this.h = c0Var;
        ck0Var2.setLayoutManager(c0Var);
        ((v4.h1) this.f.getItemAnimator()).m = false;
        org.telegram.ui.Components.ck0 ck0Var3 = this.f;
        lg0 lg0Var = new lg0(this, context);
        this.d = lg0Var;
        ck0Var3.setAdapter(lg0Var);
        this.f.setVerticalScrollbarPosition(org.telegram.messenger.gd.a0 ? 1 : 2);
        this.actionBar.setAdaptiveBackground(this.f);
        this.f.setOnItemClickListener(new h(this, 18));
        this.f.setOnItemLongClickListener(new zr(this, 23));
        this.f.setOnScrollListener(new g3(this, 20));
        this.e.c();
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.b0 = frameLayout3;
        frameLayout3.addView(this.f, c8.ma.c(-1.0f, -1));
        this.b0.addView(this.e, c8.ma.c(-1.0f, -1));
        this.b0.setVisibility(8);
        frameLayout2.addView(this.b0, c8.ma.c(-1.0f, -1));
        org.telegram.messenger.g0.h3(this.a0, 300L);
        m0();
        this.f.setEmptyView(this.e);
        this.c0 = new ig0(this, context);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.X = imageReceiver;
        imageReceiver.H0(this.c0);
        this.X.J0(org.telegram.messenger.g0.L(9.0f));
        this.Z = false;
        org.telegram.messenger.fj fjVar = this.n;
        int i11 = 50;
        if (!fjVar.x4()) {
            if (!fjVar.m5() && (org.telegram.messenger.fj.S3(fjVar.k) || fjVar.L3() || org.telegram.messenger.fj.L4(fjVar.k))) {
                String str = fjVar.Z4() ? fjVar.k.media.webpage.type : null;
                if (!"app".equals(str) && !"profile".equals(str) && !"article".equals(str) && (str == null || !str.startsWith("telegram_"))) {
                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(fjVar.p0, 50, false, null, false);
                    TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(fjVar.p0, org.telegram.messenger.g0.Z0(false), false, null, false);
                    if (w10 == w11) {
                        w11 = null;
                    }
                    if (w10 != null) {
                        this.Z = true;
                        this.Y = org.telegram.messenger.fj.L4(fjVar.k);
                        String r10 = org.telegram.messenger.w7.r(null, w11);
                        if (fjVar.z0 || org.telegram.messenger.a6.q(this.currentAccount).d(fjVar) || org.telegram.messenger.w7.G(this.currentAccount).S(r10)) {
                            this.X.r0(org.telegram.messenger.fc.f(w11, fjVar.n0), "50_50", org.telegram.messenger.fc.f(w10, fjVar.n0), "50_50", null, (fjVar.D != 1 || w11 == null) ? 0 : w11.size, null, this.n, 0);
                        } else {
                            this.X.s0(null, null, org.telegram.messenger.fc.f(w10, fjVar.n0), "50_50", null, this.n, 0);
                        }
                    }
                }
            }
            if (!TextUtils.isEmpty(fjVar.z)) {
                charSequence = fjVar.z;
            } else if (TextUtils.isEmpty(fjVar.k.message)) {
                charSequence = fjVar.v;
            } else {
                CharSequence charSequence2 = fjVar.v;
                if (charSequence2.length() > 150) {
                    charSequence2 = charSequence2.subSequence(0, org.telegram.messenger.ks.g2);
                }
                charSequence = org.telegram.messenger.j6.m(charSequence2, this.c0.getSubtitlePaint().getFontMetricsInt(), false, null, 0);
            }
            if (org.telegram.messenger.fj.L4(fjVar.k) || org.telegram.messenger.fj.S3(fjVar.k)) {
                ig0 ig0Var = this.c0;
                if (ig0Var.getSubtitleTextView() != null) {
                    ig0Var.getSubtitleTextView().setVisibility(8);
                }
            } else {
                this.c0.setSubtitle(charSequence);
            }
        }
        if (this.Z || fjVar.x4()) {
            this.c0.setRightAvatarPadding(-org.telegram.messenger.g0.L(3.0f));
        } else {
            i11 = 56;
        }
        this.actionBar.addView(this.c0, 0, c8.ma.d(-2, -1.0f, 51, this.inPreviewMode ? 0.0f : i11, 0.0f, 40.0f, 0.0f));
        k0();
        this.c0.i(org.telegram.ui.ActionBar.n6.w0(i7, getResourceProvider()), org.telegram.ui.ActionBar.n6.w0(i10, getResourceProvider()));
        View subtitleTextView = this.c0.getSubtitleTextView();
        if (subtitleTextView instanceof org.telegram.ui.ActionBar.n5) {
            ((org.telegram.ui.ActionBar.n5) subtitleTextView).setLinkTextColor(org.telegram.ui.ActionBar.n6.w0(i10, getResourceProvider()));
        }
        org.telegram.ui.ActionBar.u6.l(this.actionBar, 1, org.telegram.ui.ActionBar.n6.G6, getResourceProvider());
        org.telegram.ui.ActionBar.u6.l(this.actionBar, 3, org.telegram.ui.ActionBar.n6.z8, getResourceProvider());
        this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        this.actionBar.setActionBarMenuOnItemClick(new dv(this, 20));
        this.c0.setOnClickListener(new j40(this, 11));
        l0();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.T) {
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
        org.telegram.ui.Components.ck0 ck0Var = this.f;
        if (ck0Var != null) {
            int childCount = ck0Var.getChildCount();
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
        ig0 ig0Var = this.c0;
        View subtitleTextView = ig0Var == null ? null : ig0Var.getSubtitleTextView();
        if (subtitleTextView instanceof org.telegram.ui.ActionBar.n5) {
            ((org.telegram.ui.ActionBar.n5) subtitleTextView).setLinkTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Gj, getResourceProvider()));
        }
    }

    public final boolean g0(org.telegram.messenger.fj fjVar) {
        if (!fjVar.x4() || !(fjVar.l instanceof TL_stories.TL_storyItemDeleted)) {
            return false;
        }
        org.telegram.messenger.f3.n(null, 2131744371, org.telegram.ui.Components.lc.b0(this), R.raw.story_bomb1, 36);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f6 f6Var = new f6(13, this);
        ig0 ig0Var = this.c0;
        arrayList.add(new org.telegram.ui.ActionBar.w6(ig0Var != null ? ig0Var.getTitleTextView() : null, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Fj));
        ig0 ig0Var2 = this.c0;
        arrayList.add(new org.telegram.ui.ActionBar.w6(org.telegram.ui.ActionBar.n6.Gj, ig0Var2 != null ? ig0Var2.getSubtitleTextView() : null));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.n6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.n6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, TLObject.FLAG_31, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, TLObject.FLAG_30, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.F8));
        c51.n0(this.r, arrayList, f6Var);
        c51.n0(this.s, arrayList, f6Var);
        return arrayList;
    }

    public final void h0() {
        if (this.F) {
            return;
        }
        this.F = true;
        lg0 lg0Var = this.d;
        if (lg0Var != null) {
            lg0Var.f();
        }
        org.telegram.messenger.fj fjVar = this.n;
        if (fjVar.x4()) {
            TL_stats.TL_getStoryPublicForwards tL_getStoryPublicForwards = new TL_stats.TL_getStoryPublicForwards();
            tL_getStoryPublicForwards.limit = 100;
            tL_getStoryPublicForwards.id = fjVar.l.id;
            tL_getStoryPublicForwards.peer = getMessagesController().l1(-this.b);
            String str = this.H;
            tL_getStoryPublicForwards.offset = str != null ? str : "";
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getStoryPublicForwards, new gg0(this, 1), null, null, 0, this.a.stats_dc, 1, true), this.classGuid);
            return;
        }
        TL_stats.TL_getMessagePublicForwards tL_getMessagePublicForwards = new TL_stats.TL_getMessagePublicForwards();
        tL_getMessagePublicForwards.limit = 100;
        TLRPC.MessageFwdHeader messageFwdHeader = fjVar.k.fwd_from;
        if (messageFwdHeader != null) {
            tL_getMessagePublicForwards.msg_id = messageFwdHeader.saved_from_msg_id;
            tL_getMessagePublicForwards.channel = getMessagesController().j1(-fjVar.Z0());
        } else {
            tL_getMessagePublicForwards.msg_id = fjVar.e1();
            tL_getMessagePublicForwards.channel = getMessagesController().j1(-org.telegram.messenger.fj.B0(fjVar.k));
        }
        String str2 = this.H;
        tL_getMessagePublicForwards.offset = str2 != null ? str2 : "";
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getMessagePublicForwards, new gg0(this, 2), null, null, 0, this.a.stats_dc, 1, true), this.classGuid);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i0() {
        TL_stats.TL_getMessageStats tL_getMessageStats;
        org.telegram.messenger.fj fjVar = this.n;
        if (fjVar.x4()) {
            TL_stories.TL_stats_getStoryStats tL_stats_getStoryStats = new TL_stories.TL_stats_getStoryStats();
            tL_stats_getStoryStats.id = fjVar.l.id;
            tL_stats_getStoryStats.peer = getMessagesController().l1(-this.b);
            tL_getMessageStats = tL_stats_getStoryStats;
        } else {
            TL_stats.TL_getMessageStats tL_getMessageStats2 = new TL_stats.TL_getMessageStats();
            TLRPC.MessageFwdHeader messageFwdHeader = fjVar.k.fwd_from;
            if (messageFwdHeader != null) {
                tL_getMessageStats2.msg_id = messageFwdHeader.saved_from_msg_id;
                tL_getMessageStats2.channel = getMessagesController().j1(-fjVar.Z0());
                tL_getMessageStats = tL_getMessageStats2;
            } else {
                tL_getMessageStats2.msg_id = fjVar.e1();
                tL_getMessageStats2.channel = getMessagesController().j1(-org.telegram.messenger.fj.B0(fjVar.k));
                tL_getMessageStats = tL_getMessageStats2;
            }
        }
        getConnectionsManager().sendRequest(tL_getMessageStats, new gg0(this, 0), null, null, 0, this.a.stats_dc, 1, true);
    }

    @Override // org.telegram.ui.ActionBar.h2
    public boolean isLightStatusBar() {
        return i0.a.h(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.d6, getResourceProvider())) > 0.699999988079071d;
    }

    public final void j0(View view) {
        if (view instanceof org.telegram.ui.Cells.a5) {
            org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.y6, getResourceProvider());
            int w03 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.n6, getResourceProvider());
            a5Var.P = true;
            a5Var.I = w02;
            a5Var.J = w03;
            a5Var.d(0);
        } else if (view instanceof m41) {
            ((m41) view).d();
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, view, getResourceProvider());
        } else {
            boolean z10 = view instanceof org.telegram.ui.Cells.y6;
            if (z10 && (view.getBackground() instanceof org.telegram.ui.Components.mq) && (((org.telegram.ui.Components.mq) view.getBackground()).a instanceof ColorDrawable)) {
                ((ColorDrawable) ((org.telegram.ui.Components.mq) view.getBackground()).a).setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.a7, getResourceProvider()));
                view.invalidate();
            } else if (z10) {
                org.telegram.ui.Components.mq mqVar = new org.telegram.ui.Components.mq(new ColorDrawable(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.a7, getResourceProvider())), org.telegram.ui.ActionBar.n6.Y0(org.telegram.messenger.t0.b, R.drawable.greydivider, org.telegram.ui.ActionBar.n6.b7), 0, 0);
                mqVar.x = true;
                view.setBackground(mqVar);
            } else if (view instanceof ng.c) {
                ((ng.c) view).a();
            } else if (view instanceof mg0) {
                int i7 = mg0.d;
                ((mg0) view).a();
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, view, getResourceProvider());
            }
        }
        if (view instanceof org.telegram.ui.Cells.m3) {
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, view, getResourceProvider());
        }
    }

    public final void k0() {
        org.telegram.messenger.fj fjVar = this.n;
        if (!fjVar.x4()) {
            this.c0.setTitle(org.telegram.messenger.gd.M0(2131746904, null));
            TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(this.b));
            if (O0 == null || this.Z) {
                return;
            }
            this.c0.setChatAvatar(O0);
            return;
        }
        this.c0.setTitle(org.telegram.messenger.gd.M0(2131744223, null));
        ig0 ig0Var = this.c0;
        if (ig0Var.getSubtitleTextView() != null) {
            ig0Var.getSubtitleTextView().setVisibility(8);
        }
        ig0 ig0Var2 = this.c0;
        ig0Var2.b = true;
        ig0Var2.setStoriesForceState(1);
        ArrayList arrayList = fjVar.p0;
        if (arrayList != null) {
            this.c0.getAvatarImageView().l(org.telegram.messenger.fc.f(org.telegram.messenger.w7.w(arrayList, org.telegram.messenger.g0.Z0(false), false, null, false), fjVar.n0), "50_50", org.telegram.messenger.fc.f(org.telegram.messenger.w7.w(fjVar.p0, 50, false, null, false), fjVar.n0), "b1", 0, this.n);
            this.c0.setClipChildren(false);
            this.c0.getAvatarImageView().setScaleX(0.96f);
            this.c0.getAvatarImageView().setScaleY(0.96f);
        }
    }

    public final void l0() {
        TLRPC.ChatFull chatFull;
        if (this.e0 && (chatFull = this.a) != null && chatFull.can_view_stats) {
            org.telegram.ui.ActionBar.z t6 = this.actionBar.t();
            ArrayList arrayList = t6.e;
            if (arrayList != null) {
                arrayList.clear();
            }
            t6.removeAllViews();
            t6.a(0, R.drawable.ic_ab_other).e(1, R.drawable.msg_stats, org.telegram.messenger.gd.M0(2131743322, null));
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
                this.U.animate().alpha(0.0f).setListener(new ay(this, 6));
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
        lg0 lg0Var = this.d;
        if (lg0Var != null) {
            lg0Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        if (this.a != null) {
            i0();
            h0();
        } else {
            org.telegram.messenger.mp.u1(this.currentAccount).b3(this.classGuid, this.b, true);
        }
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.T);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.T);
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onResume() {
        super.onResume();
        org.telegram.messenger.g0.Z2(getParentActivity(), this.classGuid);
        lg0 lg0Var = this.d;
        if (lg0Var != null) {
            lg0Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            ig0 ig0Var = this.c0;
            if (ig0Var != null) {
                ig0Var.i(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fj, getResourceProvider()), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Gj, getResourceProvider()));
            }
            f0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public ng0(org.telegram.messenger.fj fjVar) {
        super(null);
        this.w = new h2.j0(15, 2);
        this.y = new ArrayList();
        this.H = null;
        this.S = new a0.g(0);
        this.a0 = new m4(this, 12);
        this.n = fjVar;
        if (fjVar.k.fwd_from == null) {
            this.b = fjVar.x0();
            this.c = fjVar.e1();
        } else {
            this.b = -fjVar.Z0();
            this.c = fjVar.k.fwd_msg_id;
        }
        this.a = getMessagesController().P0(this.b);
    }
}
