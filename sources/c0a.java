// default package

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class c0a extends n39 {
    public final ArrayList c = new ArrayList();
    public final /* synthetic */ g0a d;

    public c0a(g0a g0aVar) {
        this.d = g0aVar;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        return s49Var.f == 1;
    }

    public final void E() {
        ArrayList arrayList = this.c;
        arrayList.clear();
        g0a g0aVar = this.d;
        f0a f0aVar = g0aVar.F;
        int i = 0;
        if (g0aVar.R) {
            arrayList.add(new yz9(0));
            arrayList.add(new yz9(6));
        } else {
            arrayList.add(new yz9(0));
            if (f0aVar != null) {
                tz9 tz9Var = f0aVar.s;
                boolean z = f0aVar.j;
                if (f0aVar.b() <= 0 && (z || (!f0aVar.e && !f0aVar.m))) {
                    if (!TextUtils.isEmpty(tz9Var.c)) {
                        arrayList.add(new yz9(7));
                    } else if (z) {
                        arrayList.add(new yz9(5));
                    } else if (f0aVar.a <= 0) {
                        arrayList.add(new yz9(5));
                    } else if (tz9Var.b) {
                        arrayList.add(new yz9(8));
                    } else {
                        arrayList.add(new yz9(10));
                    }
                }
            }
            if (f0aVar != null) {
                ArrayList arrayList2 = f0aVar.g;
                ArrayList arrayList3 = f0aVar.i;
                if (f0aVar.f) {
                    while (i < arrayList3.size()) {
                        arrayList.add(new yz9((TL_stories.StoryReaction) arrayList3.get(i)));
                        i++;
                    }
                } else {
                    while (i < arrayList2.size()) {
                        arrayList.add(new yz9((TL_stories.StoryView) arrayList2.get(i)));
                        i++;
                    }
                }
            }
            if (f0aVar != null) {
                if (f0aVar.e || f0aVar.m) {
                    if (f0aVar.b() <= 0) {
                        arrayList.add(new yz9(6));
                    } else {
                        arrayList.add(new yz9(4));
                    }
                } else if (f0aVar.k) {
                    arrayList.add(new yz9(11));
                } else {
                    tz9 tz9Var2 = f0aVar.s;
                    if (f0aVar.b() < f0aVar.a && TextUtils.isEmpty(tz9Var2.c) && !tz9Var2.b) {
                        arrayList.add(new yz9(12));
                    }
                }
            }
        }
        arrayList.add(new yz9(9));
        f();
    }

    @Override // w39
    public final int b() {
        return this.c.size();
    }

    @Override // w39
    public final int d(int i) {
        return ((yz9) this.c.get(i)).a;
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        TLRPC.Peer peer;
        TLRPC.Message message;
        long j;
        TLRPC.Chat chat;
        TLRPC.User user;
        String str;
        long j2;
        boolean z;
        float f;
        byte b;
        String str2;
        TLRPC.Message message2;
        if (s49Var.f != 1 || i < 0) {
            return;
        }
        ArrayList arrayList = this.c;
        if (i < arrayList.size()) {
            yz9 yz9Var = (yz9) arrayList.get(i);
            qz8 qz8Var = (qz8) s49Var.a;
            TL_stories.StoryView storyView = yz9Var.b;
            TL_stories.StoryReaction storyReaction = yz9Var.c;
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
            long n = cf3.n(peer);
            g0a g0aVar = this.d;
            int i2 = g0aVar.w;
            if (n >= 0) {
                user = na7.q1(i2).V1(Long.valueOf(n));
                j = n;
                chat = null;
            } else {
                TLRPC.Chat K0 = na7.q1(i2).K0(Long.valueOf(-n));
                j = n;
                chat = K0;
                user = null;
            }
            boolean remove = g0aVar.G.p.remove(Long.valueOf(j));
            if (storyView == null) {
                TLRPC.Reaction reaction = null;
                TLRPC.User user2 = user;
                if (storyReaction != null) {
                    if (storyReaction instanceof TL_stories.TL_storyReaction) {
                        TL_stories.TL_storyReaction tL_storyReaction = (TL_stories.TL_storyReaction) storyReaction;
                        TLRPC.Reaction reaction2 = tL_storyReaction.reaction;
                        boolean z2 = (reaction2 == null || (str = h19.d(reaction2).f) == null || !str.equals("❤")) ? false : true;
                        if (!z2) {
                            reaction = tL_storyReaction.reaction;
                        }
                        qz8Var.c(user2, chat, reaction, z2, tL_storyReaction.date, null, false, true, remove);
                    } else if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                        qz8Var.c(user2, chat, null, false, 0L, ((TL_stories.TL_storyReactionPublicRepost) storyReaction).story, false, true, remove);
                    } else if (storyReaction instanceof TL_stories.TL_storyReactionPublicForward) {
                        long j3 = storyReaction.message != null ? r5.date : 0L;
                        m0a m0aVar = g0aVar.E;
                        qz8Var.c(user2, chat, null, false, j3, m0aVar == null ? null : m0aVar.a, true, true, remove);
                    }
                    byte b2 = i < arrayList.size() - 1 ? ((yz9) arrayList.get(i + 1)).a : (byte) -1;
                    qz8Var.a = b2 == 1 || b2 == 11 || b2 == 12;
                    qz8Var.a(false, 1.0f);
                    return;
                }
                return;
            }
            TLRPC.Reaction reaction3 = storyView.reaction;
            if (reaction3 == null || (str2 = h19.d(reaction3).f) == null || !str2.equals("❤")) {
                j2 = 0;
                z = false;
            } else {
                j2 = 0;
                z = true;
            }
            if (storyView instanceof TL_stories.TL_storyViewPublicRepost) {
                f = 1.0f;
                b = 11;
                qz8Var.c(user, null, null, z, 0L, storyView.story, false, true, remove);
            } else {
                f = 1.0f;
                b = 11;
                TLRPC.Reaction reaction4 = null;
                TLRPC.User user3 = user;
                if (storyView instanceof TL_stories.TL_storyViewPublicForward) {
                    long j4 = storyView.message != null ? r8.date : j2;
                    m0a m0aVar2 = g0aVar.E;
                    qz8Var.c(user3, null, null, z, j4, m0aVar2 == null ? null : m0aVar2.a, true, true, remove);
                } else {
                    if (!z) {
                        reaction4 = storyView.reaction;
                    }
                    qz8Var.c(user3, null, reaction4, z, storyView.date, null, false, true, remove);
                }
            }
            byte b3 = i < arrayList.size() + (-1) ? ((yz9) arrayList.get(i + 1)).a : (byte) -1;
            qz8Var.a = b3 == 1 || b3 == b || b3 == 12;
            qz8Var.a(false, g0aVar.b(storyView) ? f : 0.5f);
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        View view;
        final g0a g0aVar = this.d;
        int i2 = g0aVar.w;
        f53 f53Var = g0aVar.s;
        final byte b = 1;
        final byte b2 = 0;
        switch (i) {
            case 0:
                view = new a0a(this, g0aVar.getContext(), b2);
                break;
            case 1:
                p37 p37Var = qz8.I;
                view = new b0a(i2, f53Var, this, g0aVar.getContext());
                break;
            case 2:
            case 9:
            default:
                view = new a0a(this, g0aVar.getContext(), b);
                break;
            case 3:
                view = new wh4(g0aVar.getContext(), 70, (byte) 0);
                break;
            case 4:
                pi4 pi4Var = new pi4(g0aVar.getContext(), f53Var);
                pi4Var.setIsSingleCell(true);
                pi4Var.setViewType(28);
                pi4Var.x = false;
                view = pi4Var;
                break;
            case 5:
            case 7:
            case 8:
            case 10:
                q22 q22Var = new q22(g0aVar.G.j ? 12 : (i == 10 || i == 7 || i == 8 || i == 5) ? 1 : 0, f53Var, this, g0aVar.getContext());
                wla wlaVar = q22Var.d;
                if (i == 7) {
                    wlaVar.setVisibility(8);
                    q22Var.setSubtitle(k96.M0(2131747975, null));
                } else if (i == 8) {
                    wlaVar.setVisibility(8);
                    q22Var.setSubtitle(k96.M0(2131748030, null));
                } else if (i == 10) {
                    wlaVar.setVisibility(0);
                    wlaVar.setText(k96.M0(2131745370, null));
                    q22Var.setSubtitle(k96.M0(2131745372, null));
                } else if (g0aVar.G.j) {
                    wlaVar.setVisibility(8);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) gl.T2(k96.M0(2131750859, null)));
                    boolean E3 = na7.q1(i2).E3();
                    l46 l46Var = q22Var.e;
                    if (!E3) {
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.append((CharSequence) gl.O2(k96.M0(2131750858, null), -1, 0, new Runnable() { // from class: zz9
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b3 = b2;
                                g0a g0aVar2 = g0aVar;
                                switch (b3) {
                                    case 0:
                                        int i3 = g0a.c0;
                                        new jh8(g0aVar2.L.f, 14, false).show();
                                        break;
                                    default:
                                        int i4 = g0a.c0;
                                        new jh8(g0aVar2.L.f, 14, false).show();
                                        break;
                                }
                            }
                        }, null));
                        String M0 = k96.M0(2131748818, null);
                        Runnable runnable = new Runnable() { // from class: zz9
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b3 = b;
                                g0a g0aVar2 = g0aVar;
                                switch (b3) {
                                    case 0:
                                        int i3 = g0a.c0;
                                        new jh8(g0aVar2.L.f, 14, false).show();
                                        break;
                                    default:
                                        int i4 = g0a.c0;
                                        new jh8(g0aVar2.L.f, 14, false).show();
                                        break;
                                }
                            }
                        };
                        ((LinearLayout.LayoutParams) l46Var.getLayoutParams()).topMargin = gl.L(12.0f);
                        TextView textView = new TextView(q22Var.getContext());
                        textView.setText(M0);
                        int i3 = bkb.Ii;
                        wjb wjbVar = q22Var.n;
                        zkb.X(textView, i3, wjbVar);
                        textView.setPadding(gl.L(45.0f), gl.L(12.0f), gl.L(45.0f), gl.L(12.0f));
                        textView.setGravity(17);
                        textView.setTypeface(gl.o());
                        textView.setTextSize(1, 15.0f);
                        ar8 ar8Var = new ar8(q22Var.getContext(), (byte) 12);
                        ar8Var.setOnClickListener(new bna(runnable, (byte) 9));
                        int L = gl.L(8.0f);
                        int i4 = bkb.Ei;
                        int v0 = bkb.v0(i4, wjbVar);
                        int o = bm2.o(bkb.v0(i3, wjbVar), 30);
                        ff0 i0 = bkb.i0(L, L, L, L, v0, o, o);
                        vkb M = zkb.M(i4);
                        vkb g = zkb.g(i3, 30);
                        ar8Var.setBackground(i0);
                        zkb.j(ar8Var, i0, M, g, wjbVar);
                        ote.b(ar8Var, 0.05f, 1.5f);
                        ar8Var.addView(textView);
                        pkb pkbVar = q22Var.a;
                        pkbVar.setClipChildren(false);
                        pkbVar.addView(ar8Var, nme.t(-2, -2, 1, 0, 28, 0, 4));
                    }
                    l46Var.setText(spannableStringBuilder);
                } else {
                    wlaVar.setVisibility(0);
                    if (g0aVar.G.f) {
                        wlaVar.setText(k96.M0(2131747983, null));
                        q22Var.setSubtitle(k96.M0(2131747981, null));
                    } else {
                        wlaVar.setText(k96.M0(2131747940, null));
                        q22Var.setSubtitle(k96.M0(2131747939, null));
                    }
                }
                q22Var.e(false, false);
                view = q22Var;
                break;
            case 6:
                pi4 pi4Var2 = new pi4(g0aVar.getContext(), f53Var);
                pi4Var2.setIsSingleCell(true);
                pi4Var2.setIgnoreHeightCheck(true);
                pi4Var2.setItemsCount(20);
                pi4Var2.setViewType(28);
                pi4Var2.x = false;
                view = pi4Var2;
                break;
            case 11:
            case 12:
                l46 l46Var2 = new l46(g0aVar.getContext(), null);
                l46Var2.setTextSize(1, 13.0f);
                zkb.X(l46Var2, bkb.x6, f53Var);
                zkb.G(l46Var2, bkb.I6, f53Var);
                int L2 = gl.L(16.0f);
                int L3 = gl.L(21.0f);
                l46Var2.setPadding(L3, L2, L3, L2);
                l46Var2.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
                l46Var2.setGravity(17);
                l46Var2.setDisablePaddingsOffsetY(true);
                if (i == 11) {
                    l46Var2.setText(gl.O2(k96.M0(2131744206, null), -1, 0, new zk9(this, (byte) 24), null));
                } else {
                    l46Var2.setText(k96.M0(2131745371, null));
                }
                l46Var2.setLayoutParams(new e49(-1, -2));
                view = l46Var2;
                break;
        }
        return new y29(view);
    }
}
