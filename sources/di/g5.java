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
import org.telegram.messenger.hd;
import org.telegram.messenger.qp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.la0;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.oa0;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.c61;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class g5 extends oj0 {
    public final ArrayList c = new ArrayList();
    public final /* synthetic */ k5 d;

    public g5(k5 k5Var) {
        this.d = k5Var;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        return d1Var.f == 1;
    }

    public final void E() {
        ArrayList arrayList = this.c;
        arrayList.clear();
        k5 k5Var = this.d;
        j5 j5Var = k5Var.E;
        int i7 = 0;
        if (k5Var.Q) {
            arrayList.add(new b5(0));
            arrayList.add(new b5(6));
        } else {
            arrayList.add(new b5(0));
            if (j5Var != null) {
                w4 w4Var = j5Var.s;
                boolean z9 = j5Var.j;
                if (j5Var.b() <= 0 && (z9 || (!j5Var.e && !j5Var.m))) {
                    if (!TextUtils.isEmpty(w4Var.c)) {
                        arrayList.add(new b5(7));
                    } else if (z9) {
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
                    while (i7 < arrayList3.size()) {
                        arrayList.add(new b5((TL_stories.StoryReaction) arrayList3.get(i7)));
                        i7++;
                    }
                } else {
                    while (i7 < arrayList2.size()) {
                        arrayList.add(new b5((TL_stories.StoryView) arrayList2.get(i7)));
                        i7++;
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

    @Override // v4.g0
    public final int b() {
        return this.c.size();
    }

    @Override // v4.g0
    public final int d(int i7) {
        return ((b5) this.c.get(i7)).a;
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
        k5 k5Var = this.d;
        int i13 = k5Var.w;
        if (d1Var.f != 1 || i7 < 0) {
            return;
        }
        ArrayList arrayList = this.c;
        if (i7 >= arrayList.size()) {
            return;
        }
        b5 b5Var = (b5) arrayList.get(i7);
        org.telegram.ui.Cells.m6 m6Var = (org.telegram.ui.Cells.m6) d1Var.a;
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
        boolean remove = k5Var.F.p.remove(Long.valueOf(j3));
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
                    r5 r5Var = k5Var.D;
                    m6Var.c(user3, null, null, z9, j11, r5Var == null ? null : r5Var.a, true, true, remove);
                } else {
                    m6Var.c(user3, null, z9 ? null : storyView.reaction, z9, storyView.date, null, false, true, remove);
                }
            }
            int i14 = i7 < arrayList.size() + (-1) ? ((b5) arrayList.get(i7 + 1)).a : -1;
            m6Var.a = i14 == 1 || i14 == i12 || i14 == i11;
            m6Var.a(false, k5Var.d(storyView) ? 1.0f : 0.5f);
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
                    r5 r5Var2 = k5Var.D;
                    m6Var.c(user4, M0, null, false, j12, r5Var2 == null ? null : r5Var2.a, true, true, remove);
                }
            }
            boolean z11 = true;
            int i15 = i7 < arrayList.size() - 1 ? ((b5) arrayList.get(i7 + 1)).a : -1;
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
        final k5 k5Var = this.d;
        int i10 = k5Var.w;
        b bVar = k5Var.s;
        final int i11 = 1;
        final int i12 = 0;
        switch (i7) {
            case 0:
                view = new d5(this, k5Var.getContext(), i12);
                break;
            case 1:
                oa0 oa0Var = org.telegram.ui.Cells.m6.H;
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
                lz lzVar = new lz(k5Var.getContext(), bVar);
                lzVar.setIsSingleCell(true);
                lzVar.setViewType(28);
                lzVar.x = false;
                view = lzVar;
                break;
            case 5:
            case 7:
            case 8:
            case 10:
                f5 f5Var = new f5(k5Var.F.j ? 12 : (i7 == 10 || i7 == 7 || i7 == 8 || i7 == 5) ? 1 : 0, k5Var.getContext(), bVar, this);
                xh.l lVar = f5Var.d;
                if (i7 == 7) {
                    lVar.setVisibility(8);
                    f5Var.setSubtitle(hd.M0(2131748166, null));
                } else if (i7 == 8) {
                    lVar.setVisibility(8);
                    f5Var.setSubtitle(hd.M0(2131748221, null));
                } else if (i7 == 10) {
                    lVar.setVisibility(0);
                    lVar.setText(hd.M0(2131745563, null));
                    f5Var.setSubtitle(hd.M0(2131745565, null));
                } else if (k5Var.F.j) {
                    lVar.setVisibility(8);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(hd.M0(2131750872, null)));
                    boolean D3 = qp.s1(i10).D3();
                    w70 w70Var = f5Var.e;
                    if (!D3) {
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.U2(hd.M0(2131750871, null), new Runnable() { // from class: di.c5
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
                        String M0 = hd.M0(2131749009, null);
                        Runnable runnable = new Runnable() { // from class: di.c5
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
                        ((LinearLayout.LayoutParams) w70Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(12.0f);
                        TextView textView = new TextView(f5Var.getContext());
                        textView.setText(M0);
                        int i13 = org.telegram.ui.ActionBar.k6.Gi;
                        org.telegram.ui.ActionBar.f6 f6Var = f5Var.n;
                        org.telegram.ui.ActionBar.r6.V(textView, i13, f6Var);
                        textView.setPadding(org.telegram.messenger.g0.L(45.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(45.0f), org.telegram.messenger.g0.L(12.0f));
                        textView.setGravity(17);
                        textView.setTypeface(org.telegram.messenger.g0.o());
                        textView.setTextSize(1, 15.0f);
                        a4 a4Var = new a4(f5Var.getContext(), 20);
                        a4Var.setOnClickListener(new la0(runnable, 15));
                        int L = org.telegram.messenger.g0.L(8.0f);
                        int i14 = org.telegram.ui.ActionBar.k6.Ci;
                        int w02 = org.telegram.ui.ActionBar.k6.w0(i14, f6Var);
                        int o4 = i0.a.o(org.telegram.ui.ActionBar.k6.w0(i13, f6Var), 30);
                        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.k6.k0(L, L, L, L, w02, o4, o4);
                        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i14);
                        org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i13, 30);
                        a4Var.setBackground(k02);
                        org.telegram.ui.ActionBar.r6.k(a4Var, k02, N, h, f6Var);
                        ka.b(a4Var, 0.05f, 1.5f);
                        a4Var.addView(textView);
                        c61 c61Var = f5Var.a;
                        c61Var.setClipChildren(false);
                        c61Var.addView(a4Var, ha.t(-2, -2, 1, 0, 28, 0, 4));
                    }
                    w70Var.setText(spannableStringBuilder);
                } else {
                    lVar.setVisibility(0);
                    if (k5Var.F.f) {
                        lVar.setText(hd.M0(2131748174, null));
                        f5Var.setSubtitle(hd.M0(2131748172, null));
                    } else {
                        lVar.setText(hd.M0(2131748131, null));
                        f5Var.setSubtitle(hd.M0(2131748130, null));
                    }
                }
                f5Var.e(false, false);
                view = f5Var;
                break;
            case 6:
                lz lzVar2 = new lz(k5Var.getContext(), bVar);
                lzVar2.setIsSingleCell(true);
                lzVar2.setIgnoreHeightCheck(true);
                lzVar2.setItemsCount(20);
                lzVar2.setViewType(28);
                lzVar2.x = false;
                view = lzVar2;
                break;
            case 11:
            case 12:
                w70 w70Var2 = new w70(k5Var.getContext(), null);
                w70Var2.setTextSize(1, 13.0f);
                org.telegram.ui.ActionBar.r6.V(w70Var2, org.telegram.ui.ActionBar.k6.y6, bVar);
                org.telegram.ui.ActionBar.r6.H(w70Var2, org.telegram.ui.ActionBar.k6.J6, bVar);
                int L2 = org.telegram.messenger.g0.L(16.0f);
                int L3 = org.telegram.messenger.g0.L(21.0f);
                w70Var2.setPadding(L3, L2, L3, L2);
                w70Var2.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
                w70Var2.setGravity(17);
                w70Var2.setDisablePaddingsOffsetY(true);
                if (i7 == 11) {
                    w70Var2.setText(org.telegram.messenger.g0.U2(hd.M0(2131744447, null), new ab(this, 23)));
                } else {
                    w70Var2.setText(hd.M0(2131745564, null));
                }
                w70Var2.setLayoutParams(new v4.o0(-1, -2));
                view = w70Var2;
                break;
        }
        return new xi0(view);
    }
}
