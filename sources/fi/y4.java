package fi;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ja;
import c8.na;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.pa0;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.y60;
import org.telegram.ui.Components.z70;
import org.telegram.ui.z51;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class y4 extends tj0 {
    public final ArrayList c = new ArrayList();
    public final /* synthetic */ c5 d;

    public y4(c5 c5Var) {
        this.d = c5Var;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        return e1Var.f == 1;
    }

    public final void E() {
        ArrayList arrayList = this.c;
        arrayList.clear();
        c5 c5Var = this.d;
        b5 b5Var = c5Var.F;
        int i7 = 0;
        if (c5Var.R) {
            arrayList.add(new t4(0));
            arrayList.add(new t4(6));
        } else {
            arrayList.add(new t4(0));
            if (b5Var != null) {
                o4 o4Var = b5Var.s;
                boolean z10 = b5Var.j;
                if (b5Var.b() <= 0 && (z10 || (!b5Var.e && !b5Var.m))) {
                    if (!TextUtils.isEmpty(o4Var.c)) {
                        arrayList.add(new t4(7));
                    } else if (z10) {
                        arrayList.add(new t4(5));
                    } else {
                        int i10 = b5Var.a;
                        if (i10 > 0 && o4Var.b) {
                            arrayList.add(new t4(8));
                        } else if (i10 > 0) {
                            arrayList.add(new t4(10));
                        } else {
                            arrayList.add(new t4(5));
                        }
                    }
                }
            }
            if (b5Var != null) {
                ArrayList arrayList2 = b5Var.g;
                ArrayList arrayList3 = b5Var.i;
                if (b5Var.f) {
                    while (i7 < arrayList3.size()) {
                        arrayList.add(new t4((TL_stories.StoryReaction) arrayList3.get(i7)));
                        i7++;
                    }
                } else {
                    while (i7 < arrayList2.size()) {
                        arrayList.add(new t4((TL_stories.StoryView) arrayList2.get(i7)));
                        i7++;
                    }
                }
            }
            if (b5Var == null || !(b5Var.e || b5Var.m)) {
                if (b5Var != null && b5Var.k) {
                    arrayList.add(new t4(11));
                } else if (b5Var != null) {
                    o4 o4Var2 = b5Var.s;
                    if (b5Var.b() < b5Var.a && TextUtils.isEmpty(o4Var2.c) && !o4Var2.b) {
                        arrayList.add(new t4(12));
                    }
                }
            } else if (b5Var.b() <= 0) {
                arrayList.add(new t4(6));
            } else {
                arrayList.add(new t4(4));
            }
        }
        arrayList.add(new t4(9));
        f();
    }

    @Override // v4.h0
    public final int b() {
        return this.c.size();
    }

    @Override // v4.h0
    public final int d(int i7) {
        return ((t4) this.c.get(i7)).a;
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        TLRPC.Peer peer;
        TLRPC.Message message;
        long j3;
        TLRPC.Chat M0;
        TLRPC.User user;
        int i10;
        String str;
        long j10;
        boolean z10;
        int i11;
        int i12;
        String str2;
        TLRPC.Message message2;
        c5 c5Var = this.d;
        int i13 = c5Var.w;
        if (e1Var.f != 1 || i7 < 0) {
            return;
        }
        ArrayList arrayList = this.c;
        if (i7 >= arrayList.size()) {
            return;
        }
        t4 t4Var = (t4) arrayList.get(i7);
        org.telegram.ui.Cells.l6 l6Var = (org.telegram.ui.Cells.l6) e1Var.a;
        TL_stories.StoryView storyView = t4Var.b;
        TL_stories.StoryReaction storyReaction = t4Var.c;
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
            user = np.s1(i13).a2(Long.valueOf(o4));
            j3 = o4;
            M0 = null;
        } else {
            j3 = o4;
            M0 = np.s1(i13).M0(Long.valueOf(-o4));
            user = null;
        }
        boolean remove = c5Var.G.p.remove(Long.valueOf(j3));
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
                l6Var.c(user2, null, null, z10, 0L, storyView.story, false, true, remove);
            } else {
                TLRPC.User user3 = user;
                i11 = 12;
                i12 = 11;
                if (storyView instanceof TL_stories.TL_storyViewPublicForward) {
                    long j11 = storyView.message != null ? r10.date : j10;
                    j5 j5Var = c5Var.E;
                    l6Var.c(user3, null, null, z10, j11, j5Var == null ? null : j5Var.a, true, true, remove);
                } else {
                    l6Var.c(user3, null, z10 ? null : storyView.reaction, z10, storyView.date, null, false, true, remove);
                }
            }
            int i14 = i7 < arrayList.size() + (-1) ? ((t4) arrayList.get(i7 + 1)).a : -1;
            l6Var.a = i14 == 1 || i14 == i12 || i14 == i11;
            l6Var.a(false, c5Var.d(storyView) ? 1.0f : 0.5f);
            return;
        }
        TLRPC.User user4 = user;
        if (storyReaction != null) {
            if (storyReaction instanceof TL_stories.TL_storyReaction) {
                TL_stories.TL_storyReaction tL_storyReaction = (TL_stories.TL_storyReaction) storyReaction;
                TLRPC.Reaction reaction2 = tL_storyReaction.reaction;
                boolean z11 = (reaction2 == null || (str = ch.p0.d(reaction2).f) == null || !str.equals("❤")) ? false : true;
                i10 = 12;
                l6Var.c(user4, M0, z11 ? null : tL_storyReaction.reaction, z11, tL_storyReaction.date, null, false, true, remove);
            } else {
                i10 = 12;
                if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                    l6Var.c(user4, M0, null, false, 0L, ((TL_stories.TL_storyReactionPublicRepost) storyReaction).story, false, true, remove);
                } else if (storyReaction instanceof TL_stories.TL_storyReactionPublicForward) {
                    long j12 = storyReaction.message != null ? r7.date : 0L;
                    j5 j5Var2 = c5Var.E;
                    l6Var.c(user4, M0, null, false, j12, j5Var2 == null ? null : j5Var2.a, true, true, remove);
                }
            }
            boolean z12 = true;
            int i15 = i7 < arrayList.size() - 1 ? ((t4) arrayList.get(i7 + 1)).a : -1;
            if (i15 != 1 && i15 != 11 && i15 != i10) {
                z12 = false;
            }
            l6Var.a = z12;
            l6Var.a(false, 1.0f);
        }
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View view;
        final c5 c5Var = this.d;
        int i10 = c5Var.w;
        b bVar = c5Var.s;
        final int i11 = 1;
        final int i12 = 0;
        switch (i7) {
            case 0:
                view = new v4(this, c5Var.getContext(), i12);
                break;
            case 1:
                pa0 pa0Var = org.telegram.ui.Cells.l6.I;
                view = new w4(i10, c5Var.getContext(), bVar, this);
                break;
            case 2:
            case 9:
            default:
                view = new v4(this, c5Var.getContext(), i11);
                break;
            case 3:
                view = new org.telegram.ui.Cells.v3(c5Var.getContext(), 70);
                break;
            case 4:
                pz pzVar = new pz(c5Var.getContext(), bVar);
                pzVar.setIsSingleCell(true);
                pzVar.setViewType(28);
                pzVar.x = false;
                view = pzVar;
                break;
            case 5:
            case 7:
            case 8:
            case 10:
                x4 x4Var = new x4(c5Var.G.j ? 12 : (i7 == 10 || i7 == 7 || i7 == 8 || i7 == 5) ? 1 : 0, c5Var.getContext(), bVar, this);
                xh.l lVar = x4Var.d;
                if (i7 == 7) {
                    lVar.setVisibility(8);
                    x4Var.setSubtitle(hd.M0(2131748167, null));
                } else if (i7 == 8) {
                    lVar.setVisibility(8);
                    x4Var.setSubtitle(hd.M0(2131748222, null));
                } else if (i7 == 10) {
                    lVar.setVisibility(0);
                    lVar.setText(hd.M0(2131745562, null));
                    x4Var.setSubtitle(hd.M0(2131745564, null));
                } else if (c5Var.G.j) {
                    lVar.setVisibility(8);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(hd.M0(2131750871, null)));
                    boolean D3 = np.s1(i10).D3();
                    z70 z70Var = x4Var.e;
                    if (!D3) {
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.U2(hd.M0(2131750870, null), new Runnable() { // from class: fi.u4
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i12) {
                                    case 0:
                                        c5.a(c5Var);
                                        break;
                                    default:
                                        c5.a(c5Var);
                                        break;
                                }
                            }
                        }));
                        String M0 = hd.M0(2131749010, null);
                        Runnable runnable = new Runnable() { // from class: fi.u4
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        c5.a(c5Var);
                                        break;
                                    default:
                                        c5.a(c5Var);
                                        break;
                                }
                            }
                        };
                        ((LinearLayout.LayoutParams) z70Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(12.0f);
                        TextView textView = new TextView(x4Var.getContext());
                        textView.setText(M0);
                        int i13 = org.telegram.ui.ActionBar.j6.Ji;
                        org.telegram.ui.ActionBar.e6 e6Var = x4Var.n;
                        org.telegram.ui.ActionBar.q6.U(textView, i13, e6Var);
                        textView.setPadding(org.telegram.messenger.g0.L(45.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(45.0f), org.telegram.messenger.g0.L(12.0f));
                        textView.setGravity(17);
                        textView.setTypeface(org.telegram.messenger.g0.o());
                        textView.setTextSize(1, 15.0f);
                        bi.v1 v1Var = new bi.v1(x4Var.getContext(), 22);
                        v1Var.setOnClickListener(new y60(runnable, 16));
                        int L = org.telegram.messenger.g0.L(8.0f);
                        int i14 = org.telegram.ui.ActionBar.j6.Fi;
                        int w02 = org.telegram.ui.ActionBar.j6.w0(i14, e6Var);
                        int o4 = i0.a.o(org.telegram.ui.ActionBar.j6.w0(i13, e6Var), 30);
                        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.j6.k0(L, L, L, L, w02, o4, o4);
                        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i14);
                        org.telegram.ui.ActionBar.m6 g10 = org.telegram.ui.ActionBar.q6.g(i13, 30);
                        v1Var.setBackground(k02);
                        org.telegram.ui.ActionBar.q6.j(v1Var, k02, M, g10, e6Var);
                        na.b(v1Var, 0.05f, 1.5f);
                        v1Var.addView(textView);
                        z51 z51Var = x4Var.a;
                        z51Var.setClipChildren(false);
                        z51Var.addView(v1Var, ja.t(-2, -2, 1, 0, 28, 0, 4));
                    }
                    z70Var.setText(spannableStringBuilder);
                } else {
                    lVar.setVisibility(0);
                    if (c5Var.G.f) {
                        lVar.setText(hd.M0(2131748175, null));
                        x4Var.setSubtitle(hd.M0(2131748173, null));
                    } else {
                        lVar.setText(hd.M0(2131748132, null));
                        x4Var.setSubtitle(hd.M0(2131748131, null));
                    }
                }
                x4Var.e(false, false);
                view = x4Var;
                break;
            case 6:
                pz pzVar2 = new pz(c5Var.getContext(), bVar);
                pzVar2.setIsSingleCell(true);
                pzVar2.setIgnoreHeightCheck(true);
                pzVar2.setItemsCount(20);
                pzVar2.setViewType(28);
                pzVar2.x = false;
                view = pzVar2;
                break;
            case 11:
            case 12:
                z70 z70Var2 = new z70(c5Var.getContext(), null);
                z70Var2.setTextSize(1, 13.0f);
                org.telegram.ui.ActionBar.q6.U(z70Var2, org.telegram.ui.ActionBar.j6.y6, bVar);
                org.telegram.ui.ActionBar.q6.G(z70Var2, org.telegram.ui.ActionBar.j6.J6, bVar);
                int L2 = org.telegram.messenger.g0.L(16.0f);
                int L3 = org.telegram.messenger.g0.L(21.0f);
                z70Var2.setPadding(L3, L2, L3, L2);
                z70Var2.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
                z70Var2.setGravity(17);
                z70Var2.setDisablePaddingsOffsetY(true);
                if (i7 == 11) {
                    z70Var2.setText(org.telegram.messenger.g0.U2(hd.M0(2131744446, null), new c1(this, 6)));
                } else {
                    z70Var2.setText(hd.M0(2131745563, null));
                }
                z70Var2.setLayoutParams(new v4.p0(-1, -2));
                view = z70Var2;
                break;
        }
        return new cj0(view);
    }
}
