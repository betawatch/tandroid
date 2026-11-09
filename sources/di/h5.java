package di;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.ab;
import c8.ha;
import c8.ka;
import java.util.ArrayList;
import org.telegram.messenger.id;
import org.telegram.messenger.qp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ma0;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.pa0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.x70;
import org.telegram.ui.Components.yi0;
import org.telegram.ui.d61;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class h5 extends pj0 {
    public final ArrayList c = new ArrayList();
    public final /* synthetic */ l5 d;

    public h5(l5 l5Var) {
        this.d = l5Var;
    }

    @Override // org.telegram.ui.Components.pj0
    public final boolean D(v4.d1 d1Var) {
        return d1Var.f == 1;
    }

    public final void E() {
        ArrayList arrayList = this.c;
        arrayList.clear();
        l5 l5Var = this.d;
        k5 k5Var = l5Var.E;
        int i7 = 0;
        if (l5Var.Q) {
            arrayList.add(new c5(0));
            arrayList.add(new c5(6));
        } else {
            arrayList.add(new c5(0));
            if (k5Var != null) {
                x4 x4Var = k5Var.s;
                boolean z9 = k5Var.j;
                if (k5Var.b() <= 0 && (z9 || (!k5Var.e && !k5Var.m))) {
                    if (!TextUtils.isEmpty(x4Var.c)) {
                        arrayList.add(new c5(7));
                    } else if (z9) {
                        arrayList.add(new c5(5));
                    } else {
                        int i10 = k5Var.a;
                        if (i10 > 0 && x4Var.b) {
                            arrayList.add(new c5(8));
                        } else if (i10 > 0) {
                            arrayList.add(new c5(10));
                        } else {
                            arrayList.add(new c5(5));
                        }
                    }
                }
            }
            if (k5Var != null) {
                ArrayList arrayList2 = k5Var.g;
                ArrayList arrayList3 = k5Var.i;
                if (k5Var.f) {
                    while (i7 < arrayList3.size()) {
                        arrayList.add(new c5((TL_stories.StoryReaction) arrayList3.get(i7)));
                        i7++;
                    }
                } else {
                    while (i7 < arrayList2.size()) {
                        arrayList.add(new c5((TL_stories.StoryView) arrayList2.get(i7)));
                        i7++;
                    }
                }
            }
            if (k5Var == null || !(k5Var.e || k5Var.m)) {
                if (k5Var != null && k5Var.k) {
                    arrayList.add(new c5(11));
                } else if (k5Var != null) {
                    x4 x4Var2 = k5Var.s;
                    if (k5Var.b() < k5Var.a && TextUtils.isEmpty(x4Var2.c) && !x4Var2.b) {
                        arrayList.add(new c5(12));
                    }
                }
            } else if (k5Var.b() <= 0) {
                arrayList.add(new c5(6));
            } else {
                arrayList.add(new c5(4));
            }
        }
        arrayList.add(new c5(9));
        f();
    }

    @Override // v4.g0
    public final int b() {
        return this.c.size();
    }

    @Override // v4.g0
    public final int d(int i7) {
        return ((c5) this.c.get(i7)).a;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        TLRPC.Peer peer;
        TLRPC.Message message;
        long j3;
        TLRPC.Chat M0;
        TLRPC.User user;
        int i10;
        String str;
        long j10;
        boolean z9;
        int i11;
        int i12;
        String str2;
        TLRPC.Message message2;
        l5 l5Var = this.d;
        int i13 = l5Var.w;
        if (d1Var.f != 1 || i7 < 0) {
            return;
        }
        ArrayList arrayList = this.c;
        if (i7 >= arrayList.size()) {
            return;
        }
        c5 c5Var = (c5) arrayList.get(i7);
        org.telegram.ui.Cells.m6 m6Var = (org.telegram.ui.Cells.m6) d1Var.a;
        TL_stories.StoryView storyView = c5Var.b;
        TL_stories.StoryReaction storyReaction = c5Var.c;
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
        long o4 = org.telegram.messenger.m5.o(peer);
        if (o4 >= 0) {
            user = qp.s1(i13).a2(Long.valueOf(o4));
            j3 = o4;
            M0 = null;
        } else {
            j3 = o4;
            M0 = qp.s1(i13).M0(Long.valueOf(-o4));
            user = null;
        }
        boolean remove = l5Var.F.p.remove(Long.valueOf(j3));
        if (storyView != null) {
            TLRPC.Reaction reaction = storyView.reaction;
            if (reaction == null || (str2 = ch.o0.d(reaction).f) == null || !str2.equals("❤")) {
                j10 = 0;
                z9 = false;
            } else {
                j10 = 0;
                z9 = true;
            }
            if (storyView instanceof TL_stories.TL_storyViewPublicRepost) {
                TLRPC.User user2 = user;
                i12 = 11;
                i11 = 12;
                m6Var.c(user2, null, null, z9, 0L, storyView.story, false, true, remove);
            } else {
                TLRPC.User user3 = user;
                i11 = 12;
                i12 = 11;
                if (storyView instanceof TL_stories.TL_storyViewPublicForward) {
                    long j11 = storyView.message != null ? r10.date : j10;
                    s5 s5Var = l5Var.D;
                    m6Var.c(user3, null, null, z9, j11, s5Var == null ? null : s5Var.a, true, true, remove);
                } else {
                    m6Var.c(user3, null, z9 ? null : storyView.reaction, z9, storyView.date, null, false, true, remove);
                }
            }
            int i14 = i7 < arrayList.size() + (-1) ? ((c5) arrayList.get(i7 + 1)).a : -1;
            m6Var.a = i14 == 1 || i14 == i12 || i14 == i11;
            m6Var.a(false, l5Var.d(storyView) ? 1.0f : 0.5f);
            return;
        }
        TLRPC.User user4 = user;
        if (storyReaction != null) {
            if (storyReaction instanceof TL_stories.TL_storyReaction) {
                TL_stories.TL_storyReaction tL_storyReaction = (TL_stories.TL_storyReaction) storyReaction;
                TLRPC.Reaction reaction2 = tL_storyReaction.reaction;
                boolean z10 = (reaction2 == null || (str = ch.o0.d(reaction2).f) == null || !str.equals("❤")) ? false : true;
                i10 = 12;
                m6Var.c(user4, M0, z10 ? null : tL_storyReaction.reaction, z10, tL_storyReaction.date, null, false, true, remove);
            } else {
                i10 = 12;
                if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                    m6Var.c(user4, M0, null, false, 0L, ((TL_stories.TL_storyReactionPublicRepost) storyReaction).story, false, true, remove);
                } else if (storyReaction instanceof TL_stories.TL_storyReactionPublicForward) {
                    long j12 = storyReaction.message != null ? r7.date : 0L;
                    s5 s5Var2 = l5Var.D;
                    m6Var.c(user4, M0, null, false, j12, s5Var2 == null ? null : s5Var2.a, true, true, remove);
                }
            }
            boolean z11 = true;
            int i15 = i7 < arrayList.size() - 1 ? ((c5) arrayList.get(i7 + 1)).a : -1;
            if (i15 != 1 && i15 != 11 && i15 != i10) {
                z11 = false;
            }
            m6Var.a = z11;
            m6Var.a(false, 1.0f);
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View view;
        final l5 l5Var = this.d;
        int i10 = l5Var.w;
        b bVar = l5Var.s;
        final int i11 = 1;
        final int i12 = 0;
        switch (i7) {
            case 0:
                view = new e5(this, l5Var.getContext(), i12);
                break;
            case 1:
                pa0 pa0Var = org.telegram.ui.Cells.m6.H;
                view = new f5(i10, l5Var.getContext(), bVar, this);
                break;
            case 2:
            case 9:
            default:
                view = new e5(this, l5Var.getContext(), i11);
                break;
            case 3:
                view = new org.telegram.ui.Cells.v3(l5Var.getContext(), 70);
                break;
            case 4:
                mz mzVar = new mz(l5Var.getContext(), bVar);
                mzVar.setIsSingleCell(true);
                mzVar.setViewType(28);
                mzVar.x = false;
                view = mzVar;
                break;
            case 5:
            case 7:
            case 8:
            case 10:
                g5 g5Var = new g5(l5Var.F.j ? 12 : (i7 == 10 || i7 == 7 || i7 == 8 || i7 == 5) ? 1 : 0, l5Var.getContext(), bVar, this);
                xh.l lVar = g5Var.d;
                if (i7 == 7) {
                    lVar.setVisibility(8);
                    g5Var.setSubtitle(id.M0(2131748167, null));
                } else if (i7 == 8) {
                    lVar.setVisibility(8);
                    g5Var.setSubtitle(id.M0(2131748222, null));
                } else if (i7 == 10) {
                    lVar.setVisibility(0);
                    lVar.setText(id.M0(2131745562, null));
                    g5Var.setSubtitle(id.M0(2131745564, null));
                } else if (l5Var.F.j) {
                    lVar.setVisibility(8);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(id.M0(2131750871, null)));
                    boolean D3 = qp.s1(i10).D3();
                    x70 x70Var = g5Var.e;
                    if (!D3) {
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.U2(id.M0(2131750870, null), new Runnable() { // from class: di.d5
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i12) {
                                    case 0:
                                        l5.a(l5Var);
                                        break;
                                    default:
                                        l5.a(l5Var);
                                        break;
                                }
                            }
                        }));
                        String M0 = id.M0(2131749010, null);
                        Runnable runnable = new Runnable() { // from class: di.d5
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        l5.a(l5Var);
                                        break;
                                    default:
                                        l5.a(l5Var);
                                        break;
                                }
                            }
                        };
                        ((LinearLayout.LayoutParams) x70Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(12.0f);
                        TextView textView = new TextView(g5Var.getContext());
                        textView.setText(M0);
                        int i13 = org.telegram.ui.ActionBar.l6.Gi;
                        org.telegram.ui.ActionBar.g6 g6Var = g5Var.n;
                        org.telegram.ui.ActionBar.s6.U(textView, i13, g6Var);
                        textView.setPadding(org.telegram.messenger.g0.L(45.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(45.0f), org.telegram.messenger.g0.L(12.0f));
                        textView.setGravity(17);
                        textView.setTypeface(org.telegram.messenger.g0.o());
                        textView.setTextSize(1, 15.0f);
                        b4 b4Var = new b4(g5Var.getContext(), 20);
                        b4Var.setOnClickListener(new ma0(runnable, 15));
                        int L = org.telegram.messenger.g0.L(8.0f);
                        int i14 = org.telegram.ui.ActionBar.l6.Ci;
                        int w02 = org.telegram.ui.ActionBar.l6.w0(i14, g6Var);
                        int o4 = i0.a.o(org.telegram.ui.ActionBar.l6.w0(i13, g6Var), 30);
                        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.l6.k0(L, L, L, L, w02, o4, o4);
                        org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i14);
                        org.telegram.ui.ActionBar.o6 g10 = org.telegram.ui.ActionBar.s6.g(i13, 30);
                        b4Var.setBackground(k02);
                        org.telegram.ui.ActionBar.s6.j(b4Var, k02, M, g10, g6Var);
                        ka.b(b4Var, 0.05f, 1.5f);
                        b4Var.addView(textView);
                        d61 d61Var = g5Var.a;
                        d61Var.setClipChildren(false);
                        d61Var.addView(b4Var, ha.t(-2, -2, 1, 0, 28, 0, 4));
                    }
                    x70Var.setText(spannableStringBuilder);
                } else {
                    lVar.setVisibility(0);
                    if (l5Var.F.f) {
                        lVar.setText(id.M0(2131748175, null));
                        g5Var.setSubtitle(id.M0(2131748173, null));
                    } else {
                        lVar.setText(id.M0(2131748132, null));
                        g5Var.setSubtitle(id.M0(2131748131, null));
                    }
                }
                g5Var.e(false, false);
                view = g5Var;
                break;
            case 6:
                mz mzVar2 = new mz(l5Var.getContext(), bVar);
                mzVar2.setIsSingleCell(true);
                mzVar2.setIgnoreHeightCheck(true);
                mzVar2.setItemsCount(20);
                mzVar2.setViewType(28);
                mzVar2.x = false;
                view = mzVar2;
                break;
            case 11:
            case 12:
                x70 x70Var2 = new x70(l5Var.getContext(), null);
                x70Var2.setTextSize(1, 13.0f);
                org.telegram.ui.ActionBar.s6.U(x70Var2, org.telegram.ui.ActionBar.l6.y6, bVar);
                org.telegram.ui.ActionBar.s6.G(x70Var2, org.telegram.ui.ActionBar.l6.J6, bVar);
                int L2 = org.telegram.messenger.g0.L(16.0f);
                int L3 = org.telegram.messenger.g0.L(21.0f);
                x70Var2.setPadding(L3, L2, L3, L2);
                x70Var2.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
                x70Var2.setGravity(17);
                x70Var2.setDisablePaddingsOffsetY(true);
                if (i7 == 11) {
                    x70Var2.setText(org.telegram.messenger.g0.U2(id.M0(2131744446, null), new ab(this, 22)));
                } else {
                    x70Var2.setText(id.M0(2131745563, null));
                }
                x70Var2.setLayoutParams(new v4.o0(-1, -2));
                view = x70Var2;
                break;
        }
        return new yi0(view);
    }
}
