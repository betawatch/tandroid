package fi;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ma;
import c8.ra;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ab0;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.Components.yz;
import org.telegram.ui.d61;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class x4 extends dk0 {
    public final ArrayList c = new ArrayList();
    public final /* synthetic */ b5 d;

    public x4(b5 b5Var) {
        this.d = b5Var;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        return f1Var.f == 1;
    }

    public final void E() {
        ArrayList arrayList = this.c;
        arrayList.clear();
        b5 b5Var = this.d;
        a5 a5Var = b5Var.F;
        int i7 = 0;
        if (b5Var.R) {
            arrayList.add(new s4(0));
            arrayList.add(new s4(6));
        } else {
            arrayList.add(new s4(0));
            if (a5Var != null) {
                n4 n4Var = a5Var.s;
                boolean z10 = a5Var.j;
                if (a5Var.b() <= 0 && (z10 || (!a5Var.e && !a5Var.m))) {
                    if (!TextUtils.isEmpty(n4Var.c)) {
                        arrayList.add(new s4(7));
                    } else if (z10) {
                        arrayList.add(new s4(5));
                    } else {
                        int i10 = a5Var.a;
                        if (i10 > 0 && n4Var.b) {
                            arrayList.add(new s4(8));
                        } else if (i10 > 0) {
                            arrayList.add(new s4(10));
                        } else {
                            arrayList.add(new s4(5));
                        }
                    }
                }
            }
            if (a5Var != null) {
                ArrayList arrayList2 = a5Var.g;
                ArrayList arrayList3 = a5Var.i;
                if (a5Var.f) {
                    while (i7 < arrayList3.size()) {
                        arrayList.add(new s4((TL_stories.StoryReaction) arrayList3.get(i7)));
                        i7++;
                    }
                } else {
                    while (i7 < arrayList2.size()) {
                        arrayList.add(new s4((TL_stories.StoryView) arrayList2.get(i7)));
                        i7++;
                    }
                }
            }
            if (a5Var == null || !(a5Var.e || a5Var.m)) {
                if (a5Var != null && a5Var.k) {
                    arrayList.add(new s4(11));
                } else if (a5Var != null) {
                    n4 n4Var2 = a5Var.s;
                    if (a5Var.b() < a5Var.a && TextUtils.isEmpty(n4Var2.c) && !n4Var2.b) {
                        arrayList.add(new s4(12));
                    }
                }
            } else if (a5Var.b() <= 0) {
                arrayList.add(new s4(6));
            } else {
                arrayList.add(new s4(4));
            }
        }
        arrayList.add(new s4(9));
        f();
    }

    @Override // v4.i0
    public final int b() {
        return this.c.size();
    }

    @Override // v4.i0
    public final int d(int i7) {
        return ((s4) this.c.get(i7)).a;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        TLRPC.Peer peer;
        TLRPC.Message message;
        long j3;
        TLRPC.Chat O0;
        TLRPC.User user;
        int i10;
        String str;
        long j10;
        boolean z10;
        int i11;
        int i12;
        String str2;
        TLRPC.Message message2;
        b5 b5Var = this.d;
        int i13 = b5Var.w;
        if (f1Var.f != 1 || i7 < 0) {
            return;
        }
        ArrayList arrayList = this.c;
        if (i7 >= arrayList.size()) {
            return;
        }
        s4 s4Var = (s4) arrayList.get(i7);
        org.telegram.ui.Cells.n6 n6Var = (org.telegram.ui.Cells.n6) f1Var.a;
        TL_stories.StoryView storyView = s4Var.b;
        TL_stories.StoryReaction storyReaction = s4Var.c;
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
        long o4 = org.telegram.messenger.n5.o(peer);
        if (o4 >= 0) {
            user = np.u1(i13).c2(Long.valueOf(o4));
            j3 = o4;
            O0 = null;
        } else {
            j3 = o4;
            O0 = np.u1(i13).O0(Long.valueOf(-o4));
            user = null;
        }
        boolean remove = b5Var.G.p.remove(Long.valueOf(j3));
        if (storyView != null) {
            TLRPC.Reaction reaction = storyView.reaction;
            if (reaction == null || (str2 = ch.p0.d(reaction).f) == null || !str2.equals("❤")) {
                j10 = 0;
                z10 = false;
            } else {
                j10 = 0;
                z10 = true;
            }
            if (storyView instanceof TL_stories.TL_storyViewPublicRepost) {
                TLRPC.User user2 = user;
                i12 = 11;
                i11 = 12;
                n6Var.c(user2, null, null, z10, 0L, storyView.story, false, true, remove);
            } else {
                TLRPC.User user3 = user;
                i11 = 12;
                i12 = 11;
                if (storyView instanceof TL_stories.TL_storyViewPublicForward) {
                    long j11 = storyView.message != null ? r10.date : j10;
                    i5 i5Var = b5Var.E;
                    n6Var.c(user3, null, null, z10, j11, i5Var == null ? null : i5Var.a, true, true, remove);
                } else {
                    n6Var.c(user3, null, z10 ? null : storyView.reaction, z10, storyView.date, null, false, true, remove);
                }
            }
            int i14 = i7 < arrayList.size() + (-1) ? ((s4) arrayList.get(i7 + 1)).a : -1;
            n6Var.a = i14 == 1 || i14 == i12 || i14 == i11;
            n6Var.a(false, b5Var.d(storyView) ? 1.0f : 0.5f);
            return;
        }
        TLRPC.User user4 = user;
        if (storyReaction != null) {
            if (storyReaction instanceof TL_stories.TL_storyReaction) {
                TL_stories.TL_storyReaction tL_storyReaction = (TL_stories.TL_storyReaction) storyReaction;
                TLRPC.Reaction reaction2 = tL_storyReaction.reaction;
                boolean z11 = (reaction2 == null || (str = ch.p0.d(reaction2).f) == null || !str.equals("❤")) ? false : true;
                i10 = 12;
                n6Var.c(user4, O0, z11 ? null : tL_storyReaction.reaction, z11, tL_storyReaction.date, null, false, true, remove);
            } else {
                i10 = 12;
                if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                    n6Var.c(user4, O0, null, false, 0L, ((TL_stories.TL_storyReactionPublicRepost) storyReaction).story, false, true, remove);
                } else if (storyReaction instanceof TL_stories.TL_storyReactionPublicForward) {
                    long j12 = storyReaction.message != null ? r7.date : 0L;
                    i5 i5Var2 = b5Var.E;
                    n6Var.c(user4, O0, null, false, j12, i5Var2 == null ? null : i5Var2.a, true, true, remove);
                }
            }
            boolean z12 = true;
            int i15 = i7 < arrayList.size() - 1 ? ((s4) arrayList.get(i7 + 1)).a : -1;
            if (i15 != 1 && i15 != 11 && i15 != i10) {
                z12 = false;
            }
            n6Var.a = z12;
            n6Var.a(false, 1.0f);
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View view;
        final b5 b5Var = this.d;
        int i10 = b5Var.w;
        b bVar = b5Var.s;
        final int i11 = 1;
        final int i12 = 0;
        switch (i7) {
            case 0:
                view = new u4(this, b5Var.getContext(), i12);
                break;
            case 1:
                ab0 ab0Var = org.telegram.ui.Cells.n6.I;
                view = new v4(i10, b5Var.getContext(), bVar, this);
                break;
            case 2:
            case 9:
            default:
                view = new u4(this, b5Var.getContext(), i11);
                break;
            case 3:
                view = new org.telegram.ui.Cells.w3(b5Var.getContext(), 70);
                break;
            case 4:
                yz yzVar = new yz(b5Var.getContext(), bVar);
                yzVar.setIsSingleCell(true);
                yzVar.setViewType(28);
                yzVar.x = false;
                view = yzVar;
                break;
            case 5:
            case 7:
            case 8:
            case 10:
                w4 w4Var = new w4(b5Var.G.j ? 12 : (i7 == 10 || i7 == 7 || i7 == 8 || i7 == 5) ? 1 : 0, b5Var.getContext(), bVar, this);
                xh.l lVar = w4Var.d;
                if (i7 == 7) {
                    lVar.setVisibility(8);
                    w4Var.setSubtitle(hd.N0(2131747974, null));
                } else if (i7 == 8) {
                    lVar.setVisibility(8);
                    w4Var.setSubtitle(hd.N0(2131748029, null));
                } else if (i7 == 10) {
                    lVar.setVisibility(0);
                    lVar.setText(hd.N0(2131745366, null));
                    w4Var.setSubtitle(hd.N0(2131745368, null));
                } else if (b5Var.G.j) {
                    lVar.setVisibility(8);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.W2(hd.N0(2131750859, null)));
                    boolean K3 = np.u1(i10).K3();
                    m80 m80Var = w4Var.e;
                    if (!K3) {
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.T2(hd.N0(2131750858, null), new Runnable() { // from class: fi.t4
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i12) {
                                    case 0:
                                        b5.a(b5Var);
                                        break;
                                    default:
                                        b5.a(b5Var);
                                        break;
                                }
                            }
                        }));
                        String N0 = hd.N0(2131748817, null);
                        Runnable runnable = new Runnable() { // from class: fi.t4
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        b5.a(b5Var);
                                        break;
                                    default:
                                        b5.a(b5Var);
                                        break;
                                }
                            }
                        };
                        ((LinearLayout.LayoutParams) m80Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(12.0f);
                        TextView textView = new TextView(w4Var.getContext());
                        textView.setText(N0);
                        int i13 = org.telegram.ui.ActionBar.m6.Ji;
                        org.telegram.ui.ActionBar.h6 h6Var = w4Var.n;
                        org.telegram.ui.ActionBar.t6.U(textView, i13, h6Var);
                        textView.setPadding(org.telegram.messenger.g0.L(45.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(45.0f), org.telegram.messenger.g0.L(12.0f));
                        textView.setGravity(17);
                        textView.setTypeface(org.telegram.messenger.g0.o());
                        textView.setTextSize(1, 15.0f);
                        bi.t2 t2Var = new bi.t2(w4Var.getContext(), 22);
                        t2Var.setOnClickListener(new j70(runnable, 18));
                        int L = org.telegram.messenger.g0.L(8.0f);
                        int i14 = org.telegram.ui.ActionBar.m6.Fi;
                        int w02 = org.telegram.ui.ActionBar.m6.w0(i14, h6Var);
                        int o4 = i0.a.o(org.telegram.ui.ActionBar.m6.w0(i13, h6Var), 30);
                        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.m6.k0(L, L, L, L, w02, o4, o4);
                        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i14);
                        org.telegram.ui.ActionBar.p6 g10 = org.telegram.ui.ActionBar.t6.g(i13, 30);
                        t2Var.setBackground(k02);
                        org.telegram.ui.ActionBar.t6.j(t2Var, k02, M, g10, h6Var);
                        ra.b(t2Var, 0.05f, 1.5f);
                        t2Var.addView(textView);
                        d61 d61Var = w4Var.a;
                        d61Var.setClipChildren(false);
                        d61Var.addView(t2Var, ma.t(-2, -2, 1, 0, 28, 0, 4));
                    }
                    m80Var.setText(spannableStringBuilder);
                } else {
                    lVar.setVisibility(0);
                    if (b5Var.G.f) {
                        lVar.setText(hd.N0(2131747982, null));
                        w4Var.setSubtitle(hd.N0(2131747980, null));
                    } else {
                        lVar.setText(hd.N0(2131747939, null));
                        w4Var.setSubtitle(hd.N0(2131747938, null));
                    }
                }
                w4Var.e(false, false);
                view = w4Var;
                break;
            case 6:
                yz yzVar2 = new yz(b5Var.getContext(), bVar);
                yzVar2.setIsSingleCell(true);
                yzVar2.setIgnoreHeightCheck(true);
                yzVar2.setItemsCount(20);
                yzVar2.setViewType(28);
                yzVar2.x = false;
                view = yzVar2;
                break;
            case 11:
            case 12:
                m80 m80Var2 = new m80(b5Var.getContext(), null);
                m80Var2.setTextSize(1, 13.0f);
                org.telegram.ui.ActionBar.t6.U(m80Var2, org.telegram.ui.ActionBar.m6.y6, bVar);
                org.telegram.ui.ActionBar.t6.G(m80Var2, org.telegram.ui.ActionBar.m6.J6, bVar);
                int L2 = org.telegram.messenger.g0.L(16.0f);
                int L3 = org.telegram.messenger.g0.L(21.0f);
                m80Var2.setPadding(L3, L2, L3, L2);
                m80Var2.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
                m80Var2.setGravity(17);
                m80Var2.setDisablePaddingsOffsetY(true);
                if (i7 == 11) {
                    m80Var2.setText(org.telegram.messenger.g0.T2(hd.N0(2131744203, null), new f2.a(this, 10)));
                } else {
                    m80Var2.setText(hd.N0(2131745367, null));
                }
                m80Var2.setLayoutParams(new v4.q0(-1, -2));
                view = m80Var2;
                break;
        }
        return new mj0(view);
    }
}
