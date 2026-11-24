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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class e2a extends q59 {
    public final ArrayList c = new ArrayList();
    public final /* synthetic */ i2a d;

    public e2a(i2a i2aVar) {
        this.d = i2aVar;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        return u69Var.f == 1;
    }

    public final void E() {
        ArrayList arrayList = this.c;
        arrayList.clear();
        i2a i2aVar = this.d;
        h2a h2aVar = i2aVar.F;
        int i = 0;
        if (i2aVar.R) {
            arrayList.add(new a2a(0));
            arrayList.add(new a2a(6));
        } else {
            arrayList.add(new a2a(0));
            if (h2aVar != null) {
                v1a v1aVar = h2aVar.s;
                boolean z = h2aVar.j;
                if (h2aVar.b() <= 0 && (z || (!h2aVar.e && !h2aVar.m))) {
                    if (!TextUtils.isEmpty(v1aVar.c)) {
                        arrayList.add(new a2a(7));
                    } else if (z) {
                        arrayList.add(new a2a(5));
                    } else if (h2aVar.a <= 0) {
                        arrayList.add(new a2a(5));
                    } else if (v1aVar.b) {
                        arrayList.add(new a2a(8));
                    } else {
                        arrayList.add(new a2a(10));
                    }
                }
            }
            if (h2aVar != null) {
                ArrayList arrayList2 = h2aVar.g;
                ArrayList arrayList3 = h2aVar.i;
                if (h2aVar.f) {
                    while (i < arrayList3.size()) {
                        arrayList.add(new a2a((TL_stories.StoryReaction) arrayList3.get(i)));
                        i++;
                    }
                } else {
                    while (i < arrayList2.size()) {
                        arrayList.add(new a2a((TL_stories.StoryView) arrayList2.get(i)));
                        i++;
                    }
                }
            }
            if (h2aVar != null) {
                if (h2aVar.e || h2aVar.m) {
                    if (h2aVar.b() <= 0) {
                        arrayList.add(new a2a(6));
                    } else {
                        arrayList.add(new a2a(4));
                    }
                } else if (h2aVar.k) {
                    arrayList.add(new a2a(11));
                } else {
                    v1a v1aVar2 = h2aVar.s;
                    if (h2aVar.b() < h2aVar.a && TextUtils.isEmpty(v1aVar2.c) && !v1aVar2.b) {
                        arrayList.add(new a2a(12));
                    }
                }
            }
        }
        arrayList.add(new a2a(9));
        f();
    }

    @Override // y59
    public final int b() {
        return this.c.size();
    }

    @Override // y59
    public final int d(int i) {
        return ((a2a) this.c.get(i)).a;
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
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
        if (u69Var.f != 1 || i < 0) {
            return;
        }
        ArrayList arrayList = this.c;
        if (i < arrayList.size()) {
            a2a a2aVar = (a2a) arrayList.get(i);
            r19 r19Var = (r19) u69Var.a;
            TL_stories.StoryView storyView = a2aVar.b;
            TL_stories.StoryReaction storyReaction = a2aVar.c;
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
            long n = pg3.n(peer);
            i2a i2aVar = this.d;
            int i2 = i2aVar.w;
            if (n >= 0) {
                user = oc7.r1(i2).W1(Long.valueOf(n));
                j = n;
                chat = null;
            } else {
                TLRPC.Chat L0 = oc7.r1(i2).L0(Long.valueOf(-n));
                j = n;
                chat = L0;
                user = null;
            }
            boolean remove = i2aVar.G.p.remove(Long.valueOf(j));
            if (storyView == null) {
                TLRPC.Reaction reaction = null;
                TLRPC.User user2 = user;
                if (storyReaction != null) {
                    if (storyReaction instanceof TL_stories.TL_storyReaction) {
                        TL_stories.TL_storyReaction tL_storyReaction = (TL_stories.TL_storyReaction) storyReaction;
                        TLRPC.Reaction reaction2 = tL_storyReaction.reaction;
                        boolean z2 = (reaction2 == null || (str = k39.d(reaction2).f) == null || !str.equals("❤")) ? false : true;
                        if (!z2) {
                            reaction = tL_storyReaction.reaction;
                        }
                        r19Var.c(user2, chat, reaction, z2, tL_storyReaction.date, null, false, true, remove);
                    } else if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                        r19Var.c(user2, chat, null, false, 0L, ((TL_stories.TL_storyReactionPublicRepost) storyReaction).story, false, true, remove);
                    } else if (storyReaction instanceof TL_stories.TL_storyReactionPublicForward) {
                        long j3 = storyReaction.message != null ? r5.date : 0L;
                        o2a o2aVar = i2aVar.E;
                        r19Var.c(user2, chat, null, false, j3, o2aVar == null ? null : o2aVar.a, true, true, remove);
                    }
                    byte b2 = i < arrayList.size() - 1 ? ((a2a) arrayList.get(i + 1)).a : (byte) -1;
                    r19Var.a = b2 == 1 || b2 == 11 || b2 == 12;
                    r19Var.a(false, 1.0f);
                    return;
                }
                return;
            }
            TLRPC.Reaction reaction3 = storyView.reaction;
            if (reaction3 == null || (str2 = k39.d(reaction3).f) == null || !str2.equals("❤")) {
                j2 = 0;
                z = false;
            } else {
                j2 = 0;
                z = true;
            }
            if (storyView instanceof TL_stories.TL_storyViewPublicRepost) {
                f = 1.0f;
                b = 11;
                r19Var.c(user, null, null, z, 0L, storyView.story, false, true, remove);
            } else {
                f = 1.0f;
                b = 11;
                TLRPC.Reaction reaction4 = null;
                TLRPC.User user3 = user;
                if (storyView instanceof TL_stories.TL_storyViewPublicForward) {
                    long j4 = storyView.message != null ? r8.date : j2;
                    o2a o2aVar2 = i2aVar.E;
                    r19Var.c(user3, null, null, z, j4, o2aVar2 == null ? null : o2aVar2.a, true, true, remove);
                } else {
                    if (!z) {
                        reaction4 = storyView.reaction;
                    }
                    r19Var.c(user3, null, reaction4, z, storyView.date, null, false, true, remove);
                }
            }
            byte b3 = i < arrayList.size() + (-1) ? ((a2a) arrayList.get(i + 1)).a : (byte) -1;
            r19Var.a = b3 == 1 || b3 == b || b3 == 12;
            r19Var.a(false, i2aVar.b(storyView) ? f : 0.5f);
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        View view;
        final i2a i2aVar = this.d;
        int i2 = i2aVar.w;
        r63 r63Var = i2aVar.s;
        final byte b = 1;
        final byte b2 = 0;
        switch (i) {
            case 0:
                view = new c2a(this, i2aVar.getContext(), b2);
                break;
            case 1:
                p57 p57Var = r19.I;
                view = new d2a(i2, r63Var, this, i2aVar.getContext());
                break;
            case 2:
            case 9:
            default:
                view = new c2a(this, i2aVar.getContext(), b);
                break;
            case 3:
                view = new ak4(i2aVar.getContext(), 70, (byte) 0);
                break;
            case 4:
                tk4 tk4Var = new tk4(i2aVar.getContext(), r63Var);
                tk4Var.setIsSingleCell(true);
                tk4Var.setViewType(28);
                tk4Var.x = false;
                view = tk4Var;
                break;
            case 5:
            case 7:
            case 8:
            case 10:
                c42 c42Var = new c42(i2aVar.G.j ? 12 : (i == 10 || i == 7 || i == 8 || i == 5) ? 1 : 0, r63Var, this, i2aVar.getContext());
                xna xnaVar = c42Var.d;
                if (i == 7) {
                    xnaVar.setVisibility(8);
                    c42Var.setSubtitle(jb6.M0(2131747901, null));
                } else if (i == 8) {
                    xnaVar.setVisibility(8);
                    c42Var.setSubtitle(jb6.M0(2131747956, null));
                } else if (i == 10) {
                    xnaVar.setVisibility(0);
                    xnaVar.setText(jb6.M0(2131745296, null));
                    c42Var.setSubtitle(jb6.M0(2131745298, null));
                } else if (i2aVar.G.j) {
                    xnaVar.setVisibility(8);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) gm.S2(jb6.M0(2131750808, null)));
                    boolean H3 = oc7.r1(i2).H3();
                    l66 l66Var = c42Var.e;
                    if (!H3) {
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.append((CharSequence) gm.N2(jb6.M0(2131750807, null), -1, 0, new Runnable() { // from class: b2a
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b3 = b2;
                                i2a i2aVar2 = i2aVar;
                                switch (b3) {
                                    case 0:
                                        int i3 = i2a.c0;
                                        new kj8(i2aVar2.L.f, 14, false).show();
                                        break;
                                    default:
                                        int i4 = i2a.c0;
                                        new kj8(i2aVar2.L.f, 14, false).show();
                                        break;
                                }
                            }
                        }, null));
                        String M0 = jb6.M0(2131748767, null);
                        Runnable runnable = new Runnable() { // from class: b2a
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b3 = b;
                                i2a i2aVar2 = i2aVar;
                                switch (b3) {
                                    case 0:
                                        int i3 = i2a.c0;
                                        new kj8(i2aVar2.L.f, 14, false).show();
                                        break;
                                    default:
                                        int i4 = i2a.c0;
                                        new kj8(i2aVar2.L.f, 14, false).show();
                                        break;
                                }
                            }
                        };
                        ((LinearLayout.LayoutParams) l66Var.getLayoutParams()).topMargin = gm.L(12.0f);
                        TextView textView = new TextView(c42Var.getContext());
                        textView.setText(M0);
                        int i3 = cmb.Ii;
                        ylb ylbVar = c42Var.n;
                        anb.X(textView, i3, ylbVar);
                        textView.setPadding(gm.L(45.0f), gm.L(12.0f), gm.L(45.0f), gm.L(12.0f));
                        textView.setGravity(17);
                        textView.setTypeface(gm.o());
                        textView.setTextSize(1, 15.0f);
                        ct8 ct8Var = new ct8(c42Var.getContext(), (byte) 12);
                        ct8Var.setOnClickListener(new oha(runnable, (byte) 12));
                        int L = gm.L(8.0f);
                        int i4 = cmb.Ei;
                        int v0 = cmb.v0(i4, ylbVar);
                        int p = on2.p(cmb.v0(i3, ylbVar), 30);
                        fg0 i0 = cmb.i0(L, L, L, L, v0, p, p);
                        wmb M = anb.M(i4);
                        wmb g = anb.g(i3, 30);
                        ct8Var.setBackground(i0);
                        anb.j(ct8Var, i0, M, g, ylbVar);
                        rve.b(ct8Var, 0.05f, 1.5f);
                        ct8Var.addView(textView);
                        qmb qmbVar = c42Var.a;
                        qmbVar.setClipChildren(false);
                        qmbVar.addView(ct8Var, qoe.t(-2, -2, 1, 0, 28, 0, 4));
                    }
                    l66Var.setText(spannableStringBuilder);
                } else {
                    xnaVar.setVisibility(0);
                    if (i2aVar.G.f) {
                        xnaVar.setText(jb6.M0(2131747909, null));
                        c42Var.setSubtitle(jb6.M0(2131747907, null));
                    } else {
                        xnaVar.setText(jb6.M0(2131747866, null));
                        c42Var.setSubtitle(jb6.M0(2131747865, null));
                    }
                }
                c42Var.e(false, false);
                view = c42Var;
                break;
            case 6:
                tk4 tk4Var2 = new tk4(i2aVar.getContext(), r63Var);
                tk4Var2.setIsSingleCell(true);
                tk4Var2.setIgnoreHeightCheck(true);
                tk4Var2.setItemsCount(20);
                tk4Var2.setViewType(28);
                tk4Var2.x = false;
                view = tk4Var2;
                break;
            case 11:
            case 12:
                l66 l66Var2 = new l66(i2aVar.getContext(), null);
                l66Var2.setTextSize(1, 13.0f);
                anb.X(l66Var2, cmb.x6, r63Var);
                anb.G(l66Var2, cmb.I6, r63Var);
                int L2 = gm.L(16.0f);
                int L3 = gm.L(21.0f);
                l66Var2.setPadding(L3, L2, L3, L2);
                l66Var2.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
                l66Var2.setGravity(17);
                l66Var2.setDisablePaddingsOffsetY(true);
                if (i == 11) {
                    l66Var2.setText(gm.N2(jb6.M0(2131744132, null), -1, 0, new c0a(this, (byte) 2), null));
                } else {
                    l66Var2.setText(jb6.M0(2131745297, null));
                }
                l66Var2.setLayoutParams(new g69(-1, -2));
                view = l66Var2;
                break;
        }
        return new b59(view);
    }
}
