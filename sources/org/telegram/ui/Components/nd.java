package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class nd implements org.telegram.messenger.q20 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ nd(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.ActionBar.x1 x1Var, TLRPC.User user, boolean z10) {
        this.c = chatActivityEnterView;
        this.d = x1Var;
        this.e = user;
        this.b = z10;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        int i10;
        sg.k0 k0Var;
        TLRPC.Document e;
        cc ccVar;
        int i11;
        int i12;
        int i13 = this.a;
        Object obj2 = this.e;
        boolean z10 = this.b;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i13) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                int i14 = ChatActivityEnterView.s5;
                ((org.telegram.ui.ActionBar.x1) obj3).dismiss();
                ph.l1 l1Var = new ph.l1(chatActivityEnterView.getContext(), chatActivityEnterView.Q, ((TLRPC.User) obj2).id, mg.k0.c(mg.k0.b(1, (List) obj)), null);
                l1Var.e1(z10);
                l1Var.show();
                break;
            case 1:
                th.d2 d2Var = (th.d2) obj4;
                sg.o0 o0Var = (sg.o0) obj3;
                View view = (View) obj2;
                Long l4 = (Long) obj;
                th.z2 z2Var = d2Var.a;
                if (!z10 || o0Var.f == null) {
                    i10 = 0;
                    k0Var = new sg.k0(view.getContext(), null, z2Var.O1, null, view, z2Var.getMeasuredWidth() / 2.0f, z2Var.getMeasuredHeight() / 2.0f, o0Var, z2Var.l2, 2, true);
                    o0Var = o0Var;
                } else {
                    try {
                        z2Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    i10 = 0;
                    k0Var = new sg.k0(view.getContext(), null, z2Var.O1, null, view, z2Var.getMeasuredWidth() / 2.0f, z2Var.getMeasuredHeight() / 2.0f, o0Var, z2Var.l2, 0, true);
                }
                sg.k0.B = k0Var;
                sg.h0 h0Var = k0Var.i;
                h0Var.setTag(R.id.parent_tag, 1);
                z2Var.addView(h0Var);
                th.y2 y2Var = z2Var.x1;
                k0Var.s = true;
                k0Var.y = System.currentTimeMillis();
                if (o0Var.f != null) {
                    e = org.telegram.messenger.ui.b0(z2Var.l2).T(o0Var.f);
                    org.telegram.messenger.oz a2 = org.telegram.messenger.oz.a(z2Var.k1, o0Var.f);
                    a2.H = y2Var.a;
                    a2.Q = l4.longValue();
                    org.telegram.messenger.qz.C(z2Var.l2).r0(a2);
                } else {
                    e = f5.e(z2Var.l2, o0Var.g);
                    String V = org.telegram.messenger.jj.V(e, null, null);
                    if (V == null) {
                        if (z2Var.O1.getReactionsWindow() != null) {
                            z2Var.O1.getReactionsWindow().e();
                        }
                        z2Var.q0();
                        break;
                    } else {
                        org.telegram.messenger.oz a10 = org.telegram.messenger.oz.a(z2Var.k1, V);
                        a10.w = new ArrayList();
                        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                        tL_messageEntityCustomEmoji.document_id = o0Var.g;
                        tL_messageEntityCustomEmoji.offset = i10;
                        tL_messageEntityCustomEmoji.length = V.length();
                        a10.w.add(tL_messageEntityCustomEmoji);
                        a10.H = y2Var.a;
                        a10.Q = l4.longValue();
                        org.telegram.messenger.qz.C(z2Var.l2).r0(a10);
                    }
                }
                if (l4.longValue() <= 0) {
                    wb r10 = new cc(z2Var.L0, z2Var.k0).r(e, org.telegram.messenger.cd.L0(2131746404, null), org.telegram.messenger.cd.L0(2131743578, null), new sg.v(d2Var, 6));
                    r10.j = 5000;
                    r10.j();
                }
                if (z2Var.O1.getReactionsWindow() != null) {
                    z2Var.O1.getReactionsWindow().e();
                }
                z2Var.q0();
                break;
            default:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) obj2;
                th.z2 z2Var2 = ((th.u2) obj4).x;
                th.g2 g2Var = z2Var2.L0;
                if (((Boolean) obj).booleanValue()) {
                    storyItem.pinned = z10;
                    boolean z11 = z2Var2.l1;
                    i11 = R.raw.chats_archived;
                    if (z11) {
                        cc ccVar2 = new cc(g2Var, p6Var);
                        if (z10) {
                            i11 = R.raw.contact_check;
                        }
                        ccVar2.Q(i11, 36, org.telegram.messenger.cd.L0(z10 ? 2131744601 : 2131744745, null)).j();
                        break;
                    } else if (z10) {
                        new cc(g2Var, p6Var).I(R.raw.contact_check, org.telegram.messenger.cd.L0(2131744603, null), org.telegram.messenger.cd.L0(2131744602, null)).j();
                        break;
                    } else {
                        ccVar = new cc(g2Var, p6Var);
                        i12 = 2131744480;
                    }
                } else {
                    ccVar = new cc(g2Var, p6Var);
                    i11 = R.raw.error;
                    i12 = 2131743904;
                }
                org.telegram.messenger.m5.n(null, i12, ccVar, i11, 36);
                break;
        }
    }

    public /* synthetic */ nd(th.d2 d2Var, boolean z10, sg.o0 o0Var, View view) {
        this.c = d2Var;
        this.b = z10;
        this.d = o0Var;
        this.e = view;
    }

    public /* synthetic */ nd(th.u2 u2Var, TL_stories.StoryItem storyItem, boolean z10, org.telegram.ui.ActionBar.p6 p6Var) {
        this.c = u2Var;
        this.d = storyItem;
        this.b = z10;
        this.e = p6Var;
    }
}
