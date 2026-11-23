package fi;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.az;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.si;
import org.telegram.messenger.y10;
import org.telegram.messenger.yy;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class w2 implements y10 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ w2(x2 x2Var, boolean z10, ch.p0 p0Var, View view) {
        this.c = x2Var;
        this.b = z10;
        this.d = p0Var;
        this.e = view;
    }

    @Override // org.telegram.messenger.y10
    public final void a(Object obj) {
        int i7;
        ch.l0 l0Var;
        TLRPC.Document e10;
        lc lcVar;
        int i10;
        int i11;
        int i12 = this.a;
        boolean z10 = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i12) {
            case 0:
                x2 x2Var = (x2) obj4;
                ch.p0 p0Var = (ch.p0) obj3;
                View view = (View) obj2;
                Long l10 = (Long) obj;
                z3 z3Var = x2Var.a;
                if (!z10 || p0Var.f == null) {
                    i7 = 0;
                    l0Var = new ch.l0(view.getContext(), null, z3Var.P1, null, view, z3Var.getMeasuredWidth() / 2.0f, z3Var.getMeasuredHeight() / 2.0f, p0Var, z3Var.m2, 2, true);
                    p0Var = p0Var;
                } else {
                    try {
                        z3Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    i7 = 0;
                    l0Var = new ch.l0(view.getContext(), null, z3Var.P1, null, view, z3Var.getMeasuredWidth() / 2.0f, z3Var.getMeasuredHeight() / 2.0f, p0Var, z3Var.m2, 0, true);
                }
                ch.l0.B = l0Var;
                ch.i0 i0Var = l0Var.i;
                i0Var.setTag(R.id.parent_tag, 1);
                z3Var.addView(i0Var);
                x3 x3Var = z3Var.y1;
                l0Var.s = true;
                l0Var.y = System.currentTimeMillis();
                if (p0Var.f != null) {
                    e10 = si.d0(z3Var.m2).V(p0Var.f);
                    yy a10 = yy.a(z3Var.l1, p0Var.f);
                    a10.H = x3Var.a;
                    a10.Q = l10.longValue();
                    az.C(z3Var.m2).r0(a10);
                } else {
                    e10 = org.telegram.ui.Components.p5.e(z3Var.m2, p0Var.g);
                    String V = gj.V(e10, null, null);
                    if (V == null) {
                        if (z3Var.P1.getReactionsWindow() != null) {
                            z3Var.P1.getReactionsWindow().e();
                        }
                        z3Var.q0();
                        break;
                    } else {
                        yy a11 = yy.a(z3Var.l1, V);
                        a11.w = new ArrayList();
                        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                        tL_messageEntityCustomEmoji.document_id = p0Var.g;
                        tL_messageEntityCustomEmoji.offset = i7;
                        tL_messageEntityCustomEmoji.length = V.length();
                        a11.w.add(tL_messageEntityCustomEmoji);
                        a11.H = x3Var.a;
                        a11.Q = l10.longValue();
                        az.C(z3Var.m2).r0(a11);
                    }
                }
                if (l10.longValue() <= 0) {
                    gc r10 = new lc(z3Var.M0, z3Var.l0).r(e10, hd.N0(2131746193, null), hd.N0(2131743307, null), new f2.a(x2Var, 7));
                    r10.j = 5000;
                    r10.j();
                }
                if (z3Var.P1.getReactionsWindow() != null) {
                    z3Var.P1.getReactionsWindow().e();
                }
                z3Var.q0();
                break;
            case 1:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj2;
                z3 z3Var2 = ((r3) obj4).x;
                c3 c3Var = z3Var2.M0;
                if (((Boolean) obj).booleanValue()) {
                    storyItem.pinned = z10;
                    boolean z11 = z3Var2.m1;
                    i10 = R.raw.chats_archived;
                    if (z11) {
                        lc lcVar2 = new lc(c3Var, h6Var);
                        if (z10) {
                            i10 = R.raw.contact_check;
                        }
                        lcVar2.Q(i10, 36, hd.N0(z10 ? 2131744339 : 2131744484, null)).j();
                        break;
                    } else if (z10) {
                        new lc(c3Var, h6Var).I(R.raw.contact_check, hd.N0(2131744341, null), hd.N0(2131744340, null)).j();
                        break;
                    } else {
                        lcVar = new lc(c3Var, h6Var);
                        i11 = 2131744211;
                    }
                } else {
                    lcVar = new lc(c3Var, h6Var);
                    i10 = R.raw.error;
                    i11 = 2131743634;
                }
                org.telegram.messenger.f3.n(null, i11, lcVar, i10, 36);
                break;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                int i13 = ChatActivityEnterView.s7;
                ((org.telegram.ui.ActionBar.t1) obj3).dismiss();
                bi.n3 n3Var = new bi.n3(chatActivityEnterView.getContext(), chatActivityEnterView.R, ((TLRPC.User) obj2).id, wg.s.c(wg.s.b(1, (List) obj)), null);
                n3Var.g1(z10);
                n3Var.show();
                break;
        }
    }

    public /* synthetic */ w2(r3 r3Var, TL_stories.StoryItem storyItem, boolean z10, org.telegram.ui.ActionBar.h6 h6Var) {
        this.c = r3Var;
        this.d = storyItem;
        this.b = z10;
        this.e = h6Var;
    }

    public /* synthetic */ w2(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.ActionBar.t1 t1Var, TLRPC.User user, boolean z10) {
        this.c = chatActivityEnterView;
        this.d = t1Var;
        this.e = user;
        this.b = z10;
    }
}
