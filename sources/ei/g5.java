package ei;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import b8.pf;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.ga0;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.ja0;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.s51;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class g5 extends sj0 {
    public final ArrayList c = new ArrayList();
    public final /* synthetic */ k5 d;

    public g5(k5 k5Var) {
        this.d = k5Var;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return d1Var.f == 1;
    }

    public final void E() {
        ArrayList arrayList = this.c;
        arrayList.clear();
        k5 k5Var = this.d;
        j5 j5Var = k5Var.F;
        int i3 = 0;
        if (k5Var.R) {
            arrayList.add(new b5(0));
            arrayList.add(new b5(6));
        } else {
            arrayList.add(new b5(0));
            if (j5Var != null) {
                w4 w4Var = j5Var.s;
                boolean z10 = j5Var.j;
                if (j5Var.b() <= 0 && (z10 || (!j5Var.e && !j5Var.m))) {
                    if (!TextUtils.isEmpty(w4Var.c)) {
                        arrayList.add(new b5(7));
                    } else if (z10) {
                        arrayList.add(new b5(5));
                    } else {
                        int i10 = j5Var.a;
                        if (i10 > 0 && w4Var.b) {
                            arrayList.add(new b5(8));
                        } else if (i10 > 0) {
                            arrayList.add(new b5(10));
                        } else {
                            arrayList.add(new b5(5));
                        }
                    }
                }
            }
            if (j5Var != null) {
                ArrayList arrayList2 = j5Var.g;
                ArrayList arrayList3 = j5Var.i;
                if (j5Var.f) {
                    while (i3 < arrayList3.size()) {
                        arrayList.add(new b5((TL_stories.StoryReaction) arrayList3.get(i3)));
                        i3++;
                    }
                } else {
                    while (i3 < arrayList2.size()) {
                        arrayList.add(new b5((TL_stories.StoryView) arrayList2.get(i3)));
                        i3++;
                    }
                }
            }
            if (j5Var == null || !(j5Var.e || j5Var.m)) {
                if (j5Var != null && j5Var.k) {
                    arrayList.add(new b5(11));
                } else if (j5Var != null) {
                    w4 w4Var2 = j5Var.s;
                    if (j5Var.b() < j5Var.a && TextUtils.isEmpty(w4Var2.c) && !w4Var2.b) {
                        arrayList.add(new b5(12));
                    }
                }
            } else if (j5Var.b() <= 0) {
                arrayList.add(new b5(6));
            } else {
                arrayList.add(new b5(4));
            }
        }
        arrayList.add(new b5(9));
        f();
    }

    @Override // u4.h0
    public final int b() {
        return this.c.size();
    }

    @Override // u4.h0
    public final int d(int i3) {
        return ((b5) this.c.get(i3)).a;
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        TLRPC.Peer peer;
        TLRPC.Message message;
        long j10;
        TLRPC.Chat M0;
        TLRPC.User user;
        int i10;
        String str;
        long j11;
        boolean z10;
        int i11;
        int i12;
        String str2;
        TLRPC.Message message2;
        k5 k5Var = this.d;
        int i13 = k5Var.w;
        if (d1Var.f != 1 || i3 < 0) {
            return;
        }
        ArrayList arrayList = this.c;
        if (i3 >= arrayList.size()) {
            return;
        }
        b5 b5Var = (b5) arrayList.get(i3);
        org.telegram.ui.Cells.l6 l6Var = (org.telegram.ui.Cells.l6) d1Var.a;
        TL_stories.StoryView storyView = b5Var.b;
        TL_stories.StoryReaction storyReaction = b5Var.c;
        if (storyView != null) {
            if (storyView instanceof TL_stories.TL_storyViewPublicRepost) {
                peer = storyView.peer_id;
            } else if (!(storyView instanceof TL_stories.TL_storyViewPublicForward) || (message2 = storyView.message) == null) {
                peer = new TLRPC.TL_peerUser();
                peer.user_id = storyView.user_id;
            } else {
                peer = message2.peer_id;
            }
        } else if (storyReaction != null) {
            peer = storyReaction.peer_id;
            if ((storyReaction instanceof TL_stories.TL_storyReactionPublicForward) && (message = storyReaction.message) != null) {
                peer = message.peer_id;
            }
        } else {
            peer = null;
        }
        long o10 = org.telegram.messenger.m5.o(peer);
        if (o10 >= 0) {
            user = hp.s1(i13).a2(Long.valueOf(o10));
            j10 = o10;
            M0 = null;
        } else {
            j10 = o10;
            M0 = hp.s1(i13).M0(Long.valueOf(-o10));
            user = null;
        }
        boolean remove = k5Var.G.p.remove(Long.valueOf(j10));
        if (storyView != null) {
            TLRPC.Reaction reaction = storyView.reaction;
            if (reaction == null || (str2 = dh.n0.d(reaction).f) == null || !str2.equals("❤")) {
                j11 = 0;
                z10 = false;
            } else {
                j11 = 0;
                z10 = true;
            }
            if (storyView instanceof TL_stories.TL_storyViewPublicRepost) {
                TLRPC.User user2 = user;
                i12 = 11;
                i11 = 12;
                l6Var.c(user2, null, null, z10, 0L, storyView.story, false, true, remove);
            } else {
                TLRPC.User user3 = user;
                i11 = 12;
                i12 = 11;
                if (storyView instanceof TL_stories.TL_storyViewPublicForward) {
                    long j12 = storyView.message != null ? r10.date : j11;
                    r5 r5Var = k5Var.E;
                    l6Var.c(user3, null, null, z10, j12, r5Var == null ? null : r5Var.a, true, true, remove);
                } else {
                    l6Var.c(user3, null, z10 ? null : storyView.reaction, z10, storyView.date, null, false, true, remove);
                }
            }
            int i14 = i3 < arrayList.size() + (-1) ? ((b5) arrayList.get(i3 + 1)).a : -1;
            l6Var.a = i14 == 1 || i14 == i12 || i14 == i11;
            l6Var.a(false, k5Var.d(storyView) ? 1.0f : 0.5f);
            return;
        }
        TLRPC.User user4 = user;
        if (storyReaction != null) {
            if (storyReaction instanceof TL_stories.TL_storyReaction) {
                TL_stories.TL_storyReaction tL_storyReaction = (TL_stories.TL_storyReaction) storyReaction;
                TLRPC.Reaction reaction2 = tL_storyReaction.reaction;
                boolean z11 = (reaction2 == null || (str = dh.n0.d(reaction2).f) == null || !str.equals("❤")) ? false : true;
                i10 = 12;
                l6Var.c(user4, M0, z11 ? null : tL_storyReaction.reaction, z11, tL_storyReaction.date, null, false, true, remove);
            } else {
                i10 = 12;
                if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                    l6Var.c(user4, M0, null, false, 0L, ((TL_stories.TL_storyReactionPublicRepost) storyReaction).story, false, true, remove);
                } else if (storyReaction instanceof TL_stories.TL_storyReactionPublicForward) {
                    long j13 = storyReaction.message != null ? r7.date : 0L;
                    r5 r5Var2 = k5Var.E;
                    l6Var.c(user4, M0, null, false, j13, r5Var2 == null ? null : r5Var2.a, true, true, remove);
                }
            }
            boolean z12 = true;
            int i15 = i3 < arrayList.size() - 1 ? ((b5) arrayList.get(i3 + 1)).a : -1;
            if (i15 != 1 && i15 != 11 && i15 != i10) {
                z12 = false;
            }
            l6Var.a = z12;
            l6Var.a(false, 1.0f);
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View view;
        final k5 k5Var = this.d;
        int i10 = k5Var.w;
        b bVar = k5Var.s;
        final int i11 = 1;
        final int i12 = 0;
        switch (i3) {
            case 0:
                view = new d5(this, k5Var.getContext(), i12);
                break;
            case 1:
                ja0 ja0Var = org.telegram.ui.Cells.l6.I;
                view = new e5(i10, k5Var.getContext(), bVar, this);
                break;
            case 2:
            case 9:
            default:
                view = new d5(this, k5Var.getContext(), i11);
                break;
            case 3:
                view = new org.telegram.ui.Cells.v3(k5Var.getContext(), 70);
                break;
            case 4:
                iz izVar = new iz(k5Var.getContext(), bVar);
                izVar.setIsSingleCell(true);
                izVar.setViewType(28);
                izVar.x = false;
                view = izVar;
                break;
            case 5:
            case 7:
            case 8:
            case 10:
                f5 f5Var = new f5(k5Var.G.j ? 12 : (i3 == 10 || i3 == 7 || i3 == 8 || i3 == 5) ? 1 : 0, k5Var.getContext(), bVar, this);
                yh.l lVar = f5Var.d;
                if (i3 == 7) {
                    lVar.setVisibility(8);
                    f5Var.setSubtitle(bd.M0(2131748175, null));
                } else if (i3 == 8) {
                    lVar.setVisibility(8);
                    f5Var.setSubtitle(bd.M0(2131748230, null));
                } else if (i3 == 10) {
                    lVar.setVisibility(0);
                    lVar.setText(bd.M0(2131745572, null));
                    f5Var.setSubtitle(bd.M0(2131745574, null));
                } else if (k5Var.G.j) {
                    lVar.setVisibility(8);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(bd.M0(2131750872, null)));
                    boolean D3 = hp.s1(i10).D3();
                    s70 s70Var = f5Var.e;
                    if (!D3) {
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.U2(bd.M0(2131750871, null), new Runnable() { // from class: ei.c5
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i12) {
                                    case 0:
                                        k5.a(k5Var);
                                        break;
                                    default:
                                        k5.a(k5Var);
                                        break;
                                }
                            }
                        }));
                        String M0 = bd.M0(2131749018, null);
                        Runnable runnable = new Runnable() { // from class: ei.c5
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        k5.a(k5Var);
                                        break;
                                    default:
                                        k5.a(k5Var);
                                        break;
                                }
                            }
                        };
                        ((LinearLayout.LayoutParams) s70Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(12.0f);
                        TextView textView = new TextView(f5Var.getContext());
                        textView.setText(M0);
                        int i13 = org.telegram.ui.ActionBar.k6.Gi;
                        org.telegram.ui.ActionBar.e6 e6Var = f5Var.n;
                        org.telegram.ui.ActionBar.r6.V(textView, i13, e6Var);
                        textView.setPadding(org.telegram.messenger.g0.L(45.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(45.0f), org.telegram.messenger.g0.L(12.0f));
                        textView.setGravity(17);
                        textView.setTypeface(org.telegram.messenger.g0.o());
                        textView.setTextSize(1, 15.0f);
                        ai.d2 d2Var = new ai.d2(f5Var.getContext(), 22);
                        d2Var.setOnClickListener(new ga0(runnable, 16));
                        int L = org.telegram.messenger.g0.L(8.0f);
                        int i14 = org.telegram.ui.ActionBar.k6.Ci;
                        int w02 = org.telegram.ui.ActionBar.k6.w0(i14, e6Var);
                        int o10 = i0.a.o(org.telegram.ui.ActionBar.k6.w0(i13, e6Var), 30);
                        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.k6.k0(L, L, L, L, w02, o10, o10);
                        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i14);
                        org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i13, 30);
                        d2Var.setBackground(k02);
                        org.telegram.ui.ActionBar.r6.k(d2Var, k02, N, h, e6Var);
                        pf.b(d2Var, 0.05f, 1.5f);
                        d2Var.addView(textView);
                        s51 s51Var = f5Var.a;
                        s51Var.setClipChildren(false);
                        s51Var.addView(d2Var, mf.t(-2, -2, 1, 0, 28, 0, 4));
                    }
                    s70Var.setText(spannableStringBuilder);
                } else {
                    lVar.setVisibility(0);
                    if (k5Var.G.f) {
                        lVar.setText(bd.M0(2131748183, null));
                        f5Var.setSubtitle(bd.M0(2131748181, null));
                    } else {
                        lVar.setText(bd.M0(2131748140, null));
                        f5Var.setSubtitle(bd.M0(2131748139, null));
                    }
                }
                f5Var.e(false, false);
                view = f5Var;
                break;
            case 6:
                iz izVar2 = new iz(k5Var.getContext(), bVar);
                izVar2.setIsSingleCell(true);
                izVar2.setIgnoreHeightCheck(true);
                izVar2.setItemsCount(20);
                izVar2.setViewType(28);
                izVar2.x = false;
                view = izVar2;
                break;
            case 11:
            case 12:
                s70 s70Var2 = new s70(k5Var.getContext(), null);
                s70Var2.setTextSize(1, 13.0f);
                org.telegram.ui.ActionBar.r6.V(s70Var2, org.telegram.ui.ActionBar.k6.y6, bVar);
                org.telegram.ui.ActionBar.r6.H(s70Var2, org.telegram.ui.ActionBar.k6.J6, bVar);
                int L2 = org.telegram.messenger.g0.L(16.0f);
                int L3 = org.telegram.messenger.g0.L(21.0f);
                s70Var2.setPadding(L3, L2, L3, L2);
                s70Var2.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
                s70Var2.setGravity(17);
                s70Var2.setDisablePaddingsOffsetY(true);
                if (i3 == 11) {
                    s70Var2.setText(org.telegram.messenger.g0.U2(bd.M0(2131744456, null), new ci.d1(this, 28)));
                } else {
                    s70Var2.setText(bd.M0(2131745573, null));
                }
                s70Var2.setLayoutParams(new u4.p0(-1, -2));
                view = s70Var2;
                break;
        }
        return new bj0(view);
    }
}
