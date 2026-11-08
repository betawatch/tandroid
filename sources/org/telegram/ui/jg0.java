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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public class jg0 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public boolean D;
    public boolean E;
    public boolean F;
    public String G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public final a0.g R;
    public org.telegram.ui.Components.ch0 S;
    public LinearLayout T;
    public int U;
    public boolean V;
    public ImageReceiver W;
    public boolean X;
    public boolean Y;
    public final m4 Z;
    public TLRPC.ChatFull a;
    public FrameLayout a0;
    public final long b;
    public fg0 b0;
    public final int c;
    public lg.f c0;
    public hg0 d;
    public final boolean d0;
    public org.telegram.ui.Components.jy e;
    public z41 e0;
    public org.telegram.ui.Components.pj0 f;
    public v4.b0 h;
    public final org.telegram.messenger.ij n;
    public o41 r;
    public o41 s;
    public final h2.j0 w;
    public b51 x;
    public final ArrayList y;

    public jg0(long j3, org.telegram.messenger.ij ijVar, boolean z9) {
        super(null);
        this.w = new h2.j0(15, 2);
        this.y = new ArrayList();
        this.G = null;
        this.R = new a0.g(0);
        this.Z = new m4(this, 12);
        this.n = ijVar;
        this.c = 0;
        this.b = j3;
        this.a = getMessagesController().N0(j3);
        this.d0 = z9;
    }

    public static void Z(jg0 jg0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        TL_stats.StatsGraph statsGraph;
        TL_stats.StatsGraph statsGraph2;
        jg0Var.D = true;
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
        jg0Var.r = c51.i0(statsGraph, org.telegram.messenger.id.M0(2131743533, null), 1, false);
        jg0Var.s = c51.i0(statsGraph2, org.telegram.messenger.id.M0(2131746386, null), 2, false);
        o41 o41Var = jg0Var.r;
        if (o41Var == null || o41Var.d.a.length > 5) {
            jg0Var.m0();
            return;
        }
        jg0Var.D = false;
        TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
        o41 o41Var2 = jg0Var.r;
        tL_loadAsyncGraph.token = o41Var2.g;
        long[] jArr = o41Var2.d.a;
        tL_loadAsyncGraph.x = jArr[jArr.length - 1];
        tL_loadAsyncGraph.flags |= 1;
        ConnectionsManager.getInstance(jg0Var.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(jg0Var.currentAccount).sendRequest(tL_loadAsyncGraph, new z9(jg0Var, jg0Var.r.g + "_" + tL_loadAsyncGraph.x, tL_loadAsyncGraph, 24), null, null, 0, jg0Var.a.stats_dc, 1, true), jg0Var.classGuid);
    }

    public static /* synthetic */ void a0(jg0 jg0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        ArrayList arrayList = jg0Var.y;
        if (tL_error == null) {
            TL_stats.TL_publicForwards tL_publicForwards = (TL_stats.TL_publicForwards) tLObject;
            if ((tL_publicForwards.flags & 1) != 0) {
                jg0Var.G = tL_publicForwards.next_offset;
            } else {
                jg0Var.G = null;
            }
            int i7 = tL_publicForwards.count;
            if (i7 != 0) {
                jg0Var.U = i7;
            } else if (jg0Var.U == 0) {
                jg0Var.U = tL_publicForwards.forwards.size();
            }
            jg0Var.V = jg0Var.G == null;
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
                    org.telegram.messenger.ij ijVar = new org.telegram.messenger.ij(jg0Var.currentAccount, storyItem);
                    ijVar.r0(false);
                    arrayList.add(ijVar);
                } else if (publicForward2 instanceof TL_stats.TL_publicForwardMessage) {
                    arrayList.add(new org.telegram.messenger.ij(jg0Var.currentAccount, ((TL_stats.TL_publicForwardMessage) publicForward2).message, false, true));
                }
            }
            org.telegram.ui.Components.jy jyVar = jg0Var.e;
            if (jyVar != null) {
                jyVar.c();
            }
        }
        jg0Var.F = true;
        jg0Var.E = false;
        jg0Var.m0();
    }

    public static /* synthetic */ void b0(jg0 jg0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        ArrayList arrayList = jg0Var.y;
        if (tL_error == null) {
            TL_stats.TL_publicForwards tL_publicForwards = (TL_stats.TL_publicForwards) tLObject;
            if ((tL_publicForwards.flags & 1) != 0) {
                jg0Var.G = tL_publicForwards.next_offset;
            } else {
                jg0Var.G = null;
            }
            int i7 = tL_publicForwards.count;
            if (i7 != 0) {
                jg0Var.U = i7;
            } else if (jg0Var.U == 0) {
                jg0Var.U = tL_publicForwards.forwards.size();
            }
            jg0Var.V = jg0Var.G == null;
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
                    org.telegram.messenger.ij ijVar = new org.telegram.messenger.ij(jg0Var.currentAccount, storyItem);
                    ijVar.r0(false);
                    arrayList.add(ijVar);
                } else if (publicForward2 instanceof TL_stats.TL_publicForwardMessage) {
                    arrayList.add(new org.telegram.messenger.ij(jg0Var.currentAccount, ((TL_stats.TL_publicForwardMessage) publicForward2).message, false, true));
                }
            }
            org.telegram.ui.Components.jy jyVar = jg0Var.e;
            if (jyVar != null) {
                jyVar.c();
            }
        }
        jg0Var.F = true;
        jg0Var.E = false;
        jg0Var.m0();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.fk));
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02b3  */
    @Override // org.telegram.ui.ActionBar.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        int i7;
        CharSequence charSequence;
        fg0 fg0Var;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.a7, frameLayout, getResourceProvider());
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.jy jyVar = new org.telegram.ui.Components.jy(context, null);
        this.e = jyVar;
        jyVar.setText(org.telegram.messenger.id.M0(2131748168, null));
        this.e.setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.T = linearLayout;
        linearLayout.setOrientation(1);
        org.telegram.ui.Components.ch0 ch0Var = new org.telegram.ui.Components.ch0(context);
        this.S = ch0Var;
        ch0Var.setAutoRepeat(true);
        this.S.f(R.raw.statistic_preload, 120, 120, null);
        this.S.d();
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        int i10 = org.telegram.ui.ActionBar.k6.Cj;
        org.telegram.ui.ActionBar.r6.V(textView, i10, getResourceProvider());
        textView.setTag(Integer.valueOf(i10));
        textView.setText(org.telegram.messenger.id.M0(2131748778, null));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i11 = org.telegram.ui.ActionBar.k6.Dj;
        org.telegram.ui.ActionBar.r6.V(textView2, i11, getResourceProvider());
        textView2.setTag(Integer.valueOf(i11));
        textView2.setText(org.telegram.messenger.id.M0(2131748777, null));
        textView2.setGravity(1);
        this.T.addView(this.S, c8.ha.t(120, 120, 1, 0, 0, 0, 20));
        this.T.addView(textView, c8.ha.t(-2, -2, 1, 0, 0, 0, 10));
        this.T.addView(textView2, c8.ha.r(-2, -2, 1));
        this.T.setAlpha(0.0f);
        frameLayout2.addView(this.T, c8.ha.d(org.telegram.messenger.qs.P3, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, getResourceProvider());
        this.f = pj0Var;
        pj0Var.r1();
        org.telegram.ui.Components.pj0 pj0Var2 = this.f;
        v4.b0 b0Var = new v4.b0(1, false);
        this.h = b0Var;
        pj0Var2.setLayoutManager(b0Var);
        ((v4.f1) this.f.getItemAnimator()).m = false;
        org.telegram.ui.Components.pj0 pj0Var3 = this.f;
        hg0 hg0Var = new hg0(this, context);
        this.d = hg0Var;
        pj0Var3.setAdapter(hg0Var);
        this.f.setVerticalScrollbarPosition(org.telegram.messenger.id.a0 ? 1 : 2);
        this.actionBar.setAdaptiveBackground(this.f);
        this.f.setOnItemClickListener(new h(this, 18));
        this.f.setOnItemLongClickListener(new wr(this, 23));
        this.f.setOnScrollListener(new g3(this, 20));
        this.e.c();
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.a0 = frameLayout3;
        frameLayout3.addView(this.f, c8.ha.c(-1.0f, -1));
        this.a0.addView(this.e, c8.ha.c(-1.0f, -1));
        this.a0.setVisibility(8);
        frameLayout2.addView(this.a0, c8.ha.c(-1.0f, -1));
        org.telegram.messenger.g0.i3(this.Z, 300L);
        m0();
        this.f.setEmptyView(this.e);
        this.b0 = new fg0(this, context);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.W = imageReceiver;
        imageReceiver.H0(this.b0);
        this.W.J0(org.telegram.messenger.g0.L(9.0f));
        this.Y = false;
        org.telegram.messenger.ij ijVar = this.n;
        int i12 = 50;
        if (ijVar.y4()) {
            i7 = i11;
        } else {
            if (!ijVar.n5() && (org.telegram.messenger.ij.T3(ijVar.k) || ijVar.M3() || org.telegram.messenger.ij.M4(ijVar.k))) {
                String str = ijVar.a5() ? ijVar.k.media.webpage.type : null;
                if (!"app".equals(str) && !"profile".equals(str) && !"article".equals(str) && (str == null || !str.startsWith("telegram_"))) {
                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(ijVar.n0, 50, false, null, false);
                    TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(ijVar.n0, org.telegram.messenger.g0.Z0(false), false, null, false);
                    if (w10 == w11) {
                        w11 = null;
                    }
                    if (w10 != null) {
                        this.Y = true;
                        this.X = org.telegram.messenger.ij.M4(ijVar.k);
                        String r10 = org.telegram.messenger.w7.r(null, w11);
                        if (ijVar.x0 || org.telegram.messenger.z5.q(this.currentAccount).d(ijVar) || org.telegram.messenger.w7.G(this.currentAccount).S(r10)) {
                            int i13 = (ijVar.D != 1 || w11 == null) ? 0 : w11.size;
                            ImageReceiver imageReceiver2 = this.W;
                            org.telegram.messenger.hc f10 = org.telegram.messenger.hc.f(w11, ijVar.l0);
                            org.telegram.messenger.hc f11 = org.telegram.messenger.hc.f(w10, ijVar.l0);
                            i7 = i11;
                            imageReceiver2.r0(f10, "50_50", f11, "50_50", null, i13, null, this.n, 0);
                            if (TextUtils.isEmpty(ijVar.z)) {
                                charSequence = ijVar.z;
                            } else if (TextUtils.isEmpty(ijVar.k.message)) {
                                charSequence = ijVar.v;
                            } else {
                                CharSequence charSequence2 = ijVar.v;
                                if (charSequence2.length() > 150) {
                                    charSequence2 = charSequence2.subSequence(0, org.telegram.messenger.qs.g2);
                                }
                                charSequence = org.telegram.messenger.i6.m(charSequence2, this.b0.getSubtitlePaint().getFontMetricsInt(), false, null, 0);
                            }
                            if (!org.telegram.messenger.ij.M4(ijVar.k) || org.telegram.messenger.ij.T3(ijVar.k)) {
                                fg0Var = this.b0;
                                if (fg0Var.getSubtitleTextView() != null) {
                                    fg0Var.getSubtitleTextView().setVisibility(8);
                                }
                            } else {
                                this.b0.setSubtitle(charSequence);
                            }
                        } else {
                            this.W.s0(null, null, org.telegram.messenger.hc.f(w10, ijVar.l0), "50_50", null, this.n, 0);
                        }
                    }
                }
            }
            i7 = i11;
            if (TextUtils.isEmpty(ijVar.z)) {
            }
            if (org.telegram.messenger.ij.M4(ijVar.k)) {
            }
            fg0Var = this.b0;
            if (fg0Var.getSubtitleTextView() != null) {
            }
        }
        if (this.Y || ijVar.y4()) {
            this.b0.setRightAvatarPadding(-org.telegram.messenger.g0.L(3.0f));
        } else {
            i12 = 56;
        }
        this.actionBar.addView(this.b0, 0, c8.ha.d(-2, -1.0f, 51, !this.inPreviewMode ? i12 : 0.0f, 0.0f, 40.0f, 0.0f));
        k0();
        this.b0.i(org.telegram.ui.ActionBar.k6.w0(i10, getResourceProvider()), org.telegram.ui.ActionBar.k6.w0(i7, getResourceProvider()));
        View subtitleTextView = this.b0.getSubtitleTextView();
        if (subtitleTextView instanceof org.telegram.ui.ActionBar.k5) {
            ((org.telegram.ui.ActionBar.k5) subtitleTextView).setLinkTextColor(org.telegram.ui.ActionBar.k6.w0(i7, getResourceProvider()));
        }
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 1, org.telegram.ui.ActionBar.k6.G6, getResourceProvider());
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 3, org.telegram.ui.ActionBar.k6.z8, getResourceProvider());
        this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        this.actionBar.setActionBarMenuOnItemClick(new ux(this, 17));
        this.b0.setOnClickListener(new g40(this, 11));
        l0();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.T) {
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
        org.telegram.ui.Components.pj0 pj0Var = this.f;
        if (pj0Var != null) {
            int childCount = pj0Var.getChildCount();
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
        lg.f fVar = this.c0;
        if (fVar != null) {
            fVar.c = true;
        }
        fg0 fg0Var = this.b0;
        View subtitleTextView = fg0Var == null ? null : fg0Var.getSubtitleTextView();
        if (subtitleTextView instanceof org.telegram.ui.ActionBar.k5) {
            ((org.telegram.ui.ActionBar.k5) subtitleTextView).setLinkTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Dj, getResourceProvider()));
        }
    }

    public final boolean g0(org.telegram.messenger.ij ijVar) {
        if (!ijVar.y4() || !(ijVar.l instanceof TL_stories.TL_storyItemDeleted)) {
            return false;
        }
        org.telegram.messenger.k5.o(null, 2131744609, org.telegram.ui.Components.hc.a0(this), R.raw.story_bomb1, 36);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f6 f6Var = new f6(13, this);
        fg0 fg0Var = this.b0;
        arrayList.add(new org.telegram.ui.ActionBar.t6(fg0Var != null ? fg0Var.getTitleTextView() : null, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Cj));
        fg0 fg0Var2 = this.b0;
        arrayList.add(new org.telegram.ui.ActionBar.t6(org.telegram.ui.ActionBar.k6.Dj, fg0Var2 != null ? fg0Var2.getSubtitleTextView() : null));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.k6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.k6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, TLObject.FLAG_31, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, TLObject.FLAG_30, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.F8));
        c51.n0(this.r, arrayList, f6Var);
        c51.n0(this.s, arrayList, f6Var);
        return arrayList;
    }

    public final void h0() {
        if (this.E) {
            return;
        }
        this.E = true;
        hg0 hg0Var = this.d;
        if (hg0Var != null) {
            hg0Var.f();
        }
        org.telegram.messenger.ij ijVar = this.n;
        if (ijVar.y4()) {
            TL_stats.TL_getStoryPublicForwards tL_getStoryPublicForwards = new TL_stats.TL_getStoryPublicForwards();
            tL_getStoryPublicForwards.limit = 100;
            tL_getStoryPublicForwards.id = ijVar.l.id;
            tL_getStoryPublicForwards.peer = getMessagesController().j1(-this.b);
            String str = this.G;
            tL_getStoryPublicForwards.offset = str != null ? str : "";
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getStoryPublicForwards, new dg0(this, 1), null, null, 0, this.a.stats_dc, 1, true), this.classGuid);
            return;
        }
        TL_stats.TL_getMessagePublicForwards tL_getMessagePublicForwards = new TL_stats.TL_getMessagePublicForwards();
        tL_getMessagePublicForwards.limit = 100;
        TLRPC.MessageFwdHeader messageFwdHeader = ijVar.k.fwd_from;
        if (messageFwdHeader != null) {
            tL_getMessagePublicForwards.msg_id = messageFwdHeader.saved_from_msg_id;
            tL_getMessagePublicForwards.channel = getMessagesController().h1(-ijVar.Z0());
        } else {
            tL_getMessagePublicForwards.msg_id = ijVar.f1();
            tL_getMessagePublicForwards.channel = getMessagesController().h1(-org.telegram.messenger.ij.B0(ijVar.k));
        }
        String str2 = this.G;
        tL_getMessagePublicForwards.offset = str2 != null ? str2 : "";
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getMessagePublicForwards, new dg0(this, 2), null, null, 0, this.a.stats_dc, 1, true), this.classGuid);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i0() {
        TL_stats.TL_getMessageStats tL_getMessageStats;
        org.telegram.messenger.ij ijVar = this.n;
        if (ijVar.y4()) {
            TL_stories.TL_stats_getStoryStats tL_stats_getStoryStats = new TL_stories.TL_stats_getStoryStats();
            tL_stats_getStoryStats.id = ijVar.l.id;
            tL_stats_getStoryStats.peer = getMessagesController().j1(-this.b);
            tL_getMessageStats = tL_stats_getStoryStats;
        } else {
            TL_stats.TL_getMessageStats tL_getMessageStats2 = new TL_stats.TL_getMessageStats();
            TLRPC.MessageFwdHeader messageFwdHeader = ijVar.k.fwd_from;
            if (messageFwdHeader != null) {
                tL_getMessageStats2.msg_id = messageFwdHeader.saved_from_msg_id;
                tL_getMessageStats2.channel = getMessagesController().h1(-ijVar.Z0());
                tL_getMessageStats = tL_getMessageStats2;
            } else {
                tL_getMessageStats2.msg_id = ijVar.f1();
                tL_getMessageStats2.channel = getMessagesController().h1(-org.telegram.messenger.ij.B0(ijVar.k));
                tL_getMessageStats = tL_getMessageStats2;
            }
        }
        getConnectionsManager().sendRequest(tL_getMessageStats, new dg0(this, 0), null, null, 0, this.a.stats_dc, 1, true);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public boolean isLightStatusBar() {
        return i0.a.h(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, getResourceProvider())) > 0.699999988079071d;
    }

    public final void j0(View view) {
        if (view instanceof org.telegram.ui.Cells.a5) {
            org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.y6, getResourceProvider());
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.n6, getResourceProvider());
            a5Var.O = true;
            a5Var.H = w02;
            a5Var.I = w03;
            a5Var.d(0);
        } else if (view instanceof l41) {
            ((l41) view).d();
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, view, getResourceProvider());
        } else {
            boolean z9 = view instanceof org.telegram.ui.Cells.y6;
            if (z9 && (view.getBackground() instanceof org.telegram.ui.Components.xp) && (((org.telegram.ui.Components.xp) view.getBackground()).a instanceof ColorDrawable)) {
                ((ColorDrawable) ((org.telegram.ui.Components.xp) view.getBackground()).a).setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, getResourceProvider()));
                view.invalidate();
            } else if (z9) {
                org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(new ColorDrawable(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, getResourceProvider())), org.telegram.ui.ActionBar.k6.Y0(org.telegram.messenger.t0.b, R.drawable.greydivider, org.telegram.ui.ActionBar.k6.b7), 0, 0);
                xpVar.x = true;
                view.setBackground(xpVar);
            } else if (view instanceof ng.c) {
                ((ng.c) view).a();
            } else if (view instanceof ig0) {
                int i7 = ig0.d;
                ((ig0) view).a();
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, view, getResourceProvider());
            }
        }
        if (view instanceof org.telegram.ui.Cells.m3) {
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, view, getResourceProvider());
        }
    }

    public final void k0() {
        org.telegram.messenger.ij ijVar = this.n;
        if (!ijVar.y4()) {
            this.b0.setTitle(org.telegram.messenger.id.M0(2131747098, null));
            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.b));
            if (M0 == null || this.Y) {
                return;
            }
            this.b0.setChatAvatar(M0);
            return;
        }
        this.b0.setTitle(org.telegram.messenger.id.M0(2131744461, null));
        fg0 fg0Var = this.b0;
        if (fg0Var.getSubtitleTextView() != null) {
            fg0Var.getSubtitleTextView().setVisibility(8);
        }
        fg0 fg0Var2 = this.b0;
        fg0Var2.b = true;
        fg0Var2.setStoriesForceState(1);
        ArrayList arrayList = ijVar.n0;
        if (arrayList != null) {
            this.b0.getAvatarImageView().l(org.telegram.messenger.hc.f(org.telegram.messenger.w7.w(arrayList, org.telegram.messenger.g0.Z0(false), false, null, false), ijVar.l0), "50_50", org.telegram.messenger.hc.f(org.telegram.messenger.w7.w(ijVar.n0, 50, false, null, false), ijVar.l0), "b1", 0, this.n);
            this.b0.setClipChildren(false);
            this.b0.getAvatarImageView().setScaleX(0.96f);
            this.b0.getAvatarImageView().setScaleY(0.96f);
        }
    }

    public final void l0() {
        TLRPC.ChatFull chatFull;
        if (this.d0 && (chatFull = this.a) != null && chatFull.can_view_stats) {
            org.telegram.ui.ActionBar.y q10 = this.actionBar.q();
            ArrayList arrayList = q10.e;
            if (arrayList != null) {
                arrayList.clear();
            }
            q10.removeAllViews();
            q10.a(0, R.drawable.ic_ab_other).e(1, R.drawable.msg_stats, org.telegram.messenger.id.M0(2131743562, null));
        }
    }

    public final void m0() {
        a0.g gVar = this.R;
        gVar.clear();
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.O = -1;
        this.N = -1;
        this.Q = 0;
        if (this.F && this.D) {
            org.telegram.messenger.g0.r(this.Z);
            if (this.a0.getVisibility() == 8) {
                this.T.animate().alpha(0.0f).setListener(new d30(this, 5));
                this.a0.setVisibility(0);
                this.a0.setAlpha(0.0f);
                this.a0.animate().alpha(1.0f).start();
            }
            int i7 = this.Q;
            this.O = i7;
            this.N = i7 + 1;
            this.Q = i7 + 3;
            gVar.add(Integer.valueOf(i7 + 2));
            if (this.r != null) {
                int i10 = this.Q;
                this.L = i10;
                this.Q = i10 + 2;
                gVar.add(Integer.valueOf(i10 + 1));
            }
            if (this.s != null) {
                int i11 = this.Q;
                this.M = i11;
                this.Q = i11 + 2;
                gVar.add(Integer.valueOf(i11 + 1));
            }
            ArrayList arrayList = this.y;
            if (!arrayList.isEmpty()) {
                int i12 = this.Q;
                int i13 = i12 + 1;
                this.Q = i13;
                this.H = i12;
                this.I = i13;
                int size = arrayList.size() + i13;
                this.J = size;
                this.P = size;
                this.Q = size + 2;
                gVar.add(Integer.valueOf(size + 1));
                if (!this.V) {
                    int i14 = this.Q;
                    this.Q = i14 + 1;
                    this.K = i14;
                }
            }
        }
        hg0 hg0Var = this.d;
        if (hg0Var != null) {
            hg0Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        if (this.a != null) {
            i0();
            h0();
        } else {
            org.telegram.messenger.qp.s1(this.currentAccount).V2(this.classGuid, this.b, true);
        }
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.T);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.T);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onResume() {
        super.onResume();
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        hg0 hg0Var = this.d;
        if (hg0Var != null) {
            hg0Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            fg0 fg0Var = this.b0;
            if (fg0Var != null) {
                fg0Var.i(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Cj, getResourceProvider()), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Dj, getResourceProvider()));
            }
            f0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public jg0(org.telegram.messenger.ij ijVar) {
        super(null);
        this.w = new h2.j0(15, 2);
        this.y = new ArrayList();
        this.G = null;
        this.R = new a0.g(0);
        this.Z = new m4(this, 12);
        this.n = ijVar;
        if (ijVar.k.fwd_from == null) {
            this.b = ijVar.x0();
            this.c = ijVar.f1();
        } else {
            this.b = -ijVar.Z0();
            this.c = ijVar.k.fwd_msg_id;
        }
        this.a = getMessagesController().N0(this.b);
    }
}
