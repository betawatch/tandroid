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
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.h70;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.wz;
import org.telegram.ui.Components.za0;
import org.telegram.ui.d61;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class w4 extends bk0 {
    public final ArrayList c = new ArrayList();
    public final /* synthetic */ a5 d;

    public w4(a5 a5Var) {
        this.d = a5Var;
    }

    @Override // org.telegram.ui.Components.bk0
    public final boolean D(v4.f1 f1Var) {
        return f1Var.f == 1;
    }

    public final void E() {
        ArrayList arrayList = this.c;
        arrayList.clear();
        a5 a5Var = this.d;
        z4 z4Var = a5Var.F;
        int i7 = 0;
        if (a5Var.R) {
            arrayList.add(new r4(0));
            arrayList.add(new r4(6));
        } else {
            arrayList.add(new r4(0));
            if (z4Var != null) {
                m4 m4Var = z4Var.s;
                boolean z10 = z4Var.j;
                if (z4Var.b() <= 0 && (z10 || (!z4Var.e && !z4Var.m))) {
                    if (!TextUtils.isEmpty(m4Var.c)) {
                        arrayList.add(new r4(7));
                    } else if (z10) {
                        arrayList.add(new r4(5));
                    } else {
                        int i10 = z4Var.a;
                        if (i10 > 0 && m4Var.b) {
                            arrayList.add(new r4(8));
                        } else if (i10 > 0) {
                            arrayList.add(new r4(10));
                        } else {
                            arrayList.add(new r4(5));
                        }
                    }
                }
            }
            if (z4Var != null) {
                ArrayList arrayList2 = z4Var.g;
                ArrayList arrayList3 = z4Var.i;
                if (z4Var.f) {
                    while (i7 < arrayList3.size()) {
                        arrayList.add(new r4((TL_stories.StoryReaction) arrayList3.get(i7)));
                        i7++;
                    }
                } else {
                    while (i7 < arrayList2.size()) {
                        arrayList.add(new r4((TL_stories.StoryView) arrayList2.get(i7)));
                        i7++;
                    }
                }
            }
            if (z4Var == null || !(z4Var.e || z4Var.m)) {
                if (z4Var != null && z4Var.k) {
                    arrayList.add(new r4(11));
                } else if (z4Var != null) {
                    m4 m4Var2 = z4Var.s;
                    if (z4Var.b() < z4Var.a && TextUtils.isEmpty(m4Var2.c) && !m4Var2.b) {
                        arrayList.add(new r4(12));
                    }
                }
            } else if (z4Var.b() <= 0) {
                arrayList.add(new r4(6));
            } else {
                arrayList.add(new r4(4));
            }
        }
        arrayList.add(new r4(9));
        f();
    }

    @Override // v4.i0
    public final int b() {
        return this.c.size();
    }

    @Override // v4.i0
    public final int d(int i7) {
        return ((r4) this.c.get(i7)).a;
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
        a5 a5Var = this.d;
        int i13 = a5Var.w;
        if (f1Var.f != 1 || i7 < 0) {
            return;
        }
        ArrayList arrayList = this.c;
        if (i7 >= arrayList.size()) {
            return;
        }
        r4 r4Var = (r4) arrayList.get(i7);
        org.telegram.ui.Cells.n6 n6Var = (org.telegram.ui.Cells.n6) f1Var.a;
        TL_stories.StoryView storyView = r4Var.b;
        TL_stories.StoryReaction storyReaction = r4Var.c;
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
            user = mp.u1(i13).c2(Long.valueOf(o4));
            j3 = o4;
            O0 = null;
        } else {
            j3 = o4;
            O0 = mp.u1(i13).O0(Long.valueOf(-o4));
            user = null;
        }
        boolean remove = a5Var.G.p.remove(Long.valueOf(j3));
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
                    h5 h5Var = a5Var.E;
                    n6Var.c(user3, null, null, z10, j11, h5Var == null ? null : h5Var.a, true, true, remove);
                } else {
                    n6Var.c(user3, null, z10 ? null : storyView.reaction, z10, storyView.date, null, false, true, remove);
                }
            }
            int i14 = i7 < arrayList.size() + (-1) ? ((r4) arrayList.get(i7 + 1)).a : -1;
            n6Var.a = i14 == 1 || i14 == i12 || i14 == i11;
            n6Var.a(false, a5Var.d(storyView) ? 1.0f : 0.5f);
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
                    h5 h5Var2 = a5Var.E;
                    n6Var.c(user4, O0, null, false, j12, h5Var2 == null ? null : h5Var2.a, true, true, remove);
                }
            }
            boolean z12 = true;
            int i15 = i7 < arrayList.size() - 1 ? ((r4) arrayList.get(i7 + 1)).a : -1;
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
        final a5 a5Var = this.d;
        int i10 = a5Var.w;
        b bVar = a5Var.s;
        int i11 = 17;
        final int i12 = 1;
        final int i13 = 0;
        switch (i7) {
            case 0:
                view = new t4(this, a5Var.getContext(), i13);
                break;
            case 1:
                za0 za0Var = org.telegram.ui.Cells.n6.I;
                view = new u4(i10, a5Var.getContext(), bVar, this);
                break;
            case 2:
            case 9:
            default:
                view = new t4(this, a5Var.getContext(), i12);
                break;
            case 3:
                view = new org.telegram.ui.Cells.w3(a5Var.getContext(), 70);
                break;
            case 4:
                wz wzVar = new wz(a5Var.getContext(), bVar);
                wzVar.setIsSingleCell(true);
                wzVar.setViewType(28);
                wzVar.x = false;
                view = wzVar;
                break;
            case 5:
            case 7:
            case 8:
            case 10:
                v4 v4Var = new v4(a5Var.G.j ? 12 : (i7 == 10 || i7 == 7 || i7 == 8 || i7 == 5) ? 1 : 0, a5Var.getContext(), bVar, this);
                xh.l lVar = v4Var.d;
                if (i7 == 7) {
                    lVar.setVisibility(8);
                    v4Var.setSubtitle(gd.M0(2131747975, null));
                } else if (i7 == 8) {
                    lVar.setVisibility(8);
                    v4Var.setSubtitle(gd.M0(2131748030, null));
                } else if (i7 == 10) {
                    lVar.setVisibility(0);
                    lVar.setText(gd.M0(2131745367, null));
                    v4Var.setSubtitle(gd.M0(2131745369, null));
                } else if (a5Var.G.j) {
                    lVar.setVisibility(8);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.W2(gd.M0(2131750860, null)));
                    boolean K3 = mp.u1(i10).K3();
                    k80 k80Var = v4Var.e;
                    if (!K3) {
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.T2(gd.M0(2131750859, null), new Runnable() { // from class: fi.s4
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i13) {
                                    case 0:
                                        a5.a(a5Var);
                                        break;
                                    default:
                                        a5.a(a5Var);
                                        break;
                                }
                            }
                        }));
                        String M0 = gd.M0(2131748818, null);
                        Runnable runnable = new Runnable() { // from class: fi.s4
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i12) {
                                    case 0:
                                        a5.a(a5Var);
                                        break;
                                    default:
                                        a5.a(a5Var);
                                        break;
                                }
                            }
                        };
                        ((LinearLayout.LayoutParams) k80Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(12.0f);
                        TextView textView = new TextView(v4Var.getContext());
                        textView.setText(M0);
                        int i14 = org.telegram.ui.ActionBar.n6.Ji;
                        org.telegram.ui.ActionBar.i6 i6Var = v4Var.n;
                        org.telegram.ui.ActionBar.u6.U(textView, i14, i6Var);
                        textView.setPadding(org.telegram.messenger.g0.L(45.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(45.0f), org.telegram.messenger.g0.L(12.0f));
                        textView.setGravity(17);
                        textView.setTypeface(org.telegram.messenger.g0.o());
                        textView.setTextSize(1, 15.0f);
                        bi.p2 p2Var = new bi.p2(v4Var.getContext(), 22);
                        p2Var.setOnClickListener(new h70(runnable, i11));
                        int L = org.telegram.messenger.g0.L(8.0f);
                        int i15 = org.telegram.ui.ActionBar.n6.Fi;
                        int w02 = org.telegram.ui.ActionBar.n6.w0(i15, i6Var);
                        int o4 = i0.a.o(org.telegram.ui.ActionBar.n6.w0(i14, i6Var), 30);
                        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.n6.k0(L, L, L, L, w02, o4, o4);
                        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i15);
                        org.telegram.ui.ActionBar.q6 g10 = org.telegram.ui.ActionBar.u6.g(i14, 30);
                        p2Var.setBackground(k02);
                        org.telegram.ui.ActionBar.u6.j(p2Var, k02, M, g10, i6Var);
                        ra.b(p2Var, 0.05f, 1.5f);
                        p2Var.addView(textView);
                        d61 d61Var = v4Var.a;
                        d61Var.setClipChildren(false);
                        d61Var.addView(p2Var, ma.t(-2, -2, 1, 0, 28, 0, 4));
                    }
                    k80Var.setText(spannableStringBuilder);
                } else {
                    lVar.setVisibility(0);
                    if (a5Var.G.f) {
                        lVar.setText(gd.M0(2131747983, null));
                        v4Var.setSubtitle(gd.M0(2131747981, null));
                    } else {
                        lVar.setText(gd.M0(2131747940, null));
                        v4Var.setSubtitle(gd.M0(2131747939, null));
                    }
                }
                v4Var.e(false, false);
                view = v4Var;
                break;
            case 6:
                wz wzVar2 = new wz(a5Var.getContext(), bVar);
                wzVar2.setIsSingleCell(true);
                wzVar2.setIgnoreHeightCheck(true);
                wzVar2.setItemsCount(20);
                wzVar2.setViewType(28);
                wzVar2.x = false;
                view = wzVar2;
                break;
            case 11:
            case 12:
                k80 k80Var2 = new k80(a5Var.getContext(), null);
                k80Var2.setTextSize(1, 13.0f);
                org.telegram.ui.ActionBar.u6.U(k80Var2, org.telegram.ui.ActionBar.n6.y6, bVar);
                org.telegram.ui.ActionBar.u6.G(k80Var2, org.telegram.ui.ActionBar.n6.J6, bVar);
                int L2 = org.telegram.messenger.g0.L(16.0f);
                int L3 = org.telegram.messenger.g0.L(21.0f);
                k80Var2.setPadding(L3, L2, L3, L2);
                k80Var2.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
                k80Var2.setGravity(17);
                k80Var2.setDisablePaddingsOffsetY(true);
                if (i7 == 11) {
                    k80Var2.setText(org.telegram.messenger.g0.T2(gd.M0(2131744211, null), new f2.a(this, 10)));
                } else {
                    k80Var2.setText(gd.M0(2131745368, null));
                }
                k80Var2.setLayoutParams(new v4.q0(-1, -2));
                view = k80Var2;
                break;
        }
        return new kj0(view);
    }
}
