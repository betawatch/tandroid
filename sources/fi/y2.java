package fi;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cz;
import org.telegram.messenger.ez;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.si;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.xb;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class y2 implements z10 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ y2(z2 z2Var, boolean z10, ch.p0 p0Var, View view) {
        this.c = z2Var;
        this.b = z10;
        this.d = p0Var;
        this.e = view;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        int i7;
        ch.l0 l0Var;
        TLRPC.Document e10;
        cc ccVar;
        int i10;
        int i11;
        int i12 = this.a;
        boolean z10 = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i12) {
            case 0:
                z2 z2Var = (z2) obj4;
                ch.p0 p0Var = (ch.p0) obj3;
                View view = (View) obj2;
                Long l10 = (Long) obj;
                b4 b4Var = z2Var.a;
                if (!z10 || p0Var.f == null) {
                    i7 = 0;
                    l0Var = new ch.l0(view.getContext(), null, b4Var.P1, null, view, b4Var.getMeasuredWidth() / 2.0f, b4Var.getMeasuredHeight() / 2.0f, p0Var, b4Var.m2, 2, true);
                    p0Var = p0Var;
                } else {
                    try {
                        b4Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    i7 = 0;
                    l0Var = new ch.l0(view.getContext(), null, b4Var.P1, null, view, b4Var.getMeasuredWidth() / 2.0f, b4Var.getMeasuredHeight() / 2.0f, p0Var, b4Var.m2, 0, true);
                }
                ch.l0.B = l0Var;
                ch.i0 i0Var = l0Var.i;
                i0Var.setTag(R.id.parent_tag, 1);
                b4Var.addView(i0Var);
                z3 z3Var = b4Var.y1;
                l0Var.s = true;
                l0Var.y = System.currentTimeMillis();
                if (p0Var.f != null) {
                    e10 = si.b0(b4Var.m2).T(p0Var.f);
                    cz a10 = cz.a(b4Var.l1, p0Var.f);
                    a10.H = z3Var.a;
                    a10.Q = l10.longValue();
                    ez.C(b4Var.m2).r0(a10);
                } else {
                    e10 = org.telegram.ui.Components.g5.e(b4Var.m2, p0Var.g);
                    String V = gj.V(e10, null, null);
                    if (V == null) {
                        if (b4Var.P1.getReactionsWindow() != null) {
                            b4Var.P1.getReactionsWindow().e();
                        }
                        b4Var.q0();
                        break;
                    } else {
                        cz a11 = cz.a(b4Var.l1, V);
                        a11.w = new ArrayList();
                        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                        tL_messageEntityCustomEmoji.document_id = p0Var.g;
                        tL_messageEntityCustomEmoji.offset = i7;
                        tL_messageEntityCustomEmoji.length = V.length();
                        a11.w.add(tL_messageEntityCustomEmoji);
                        a11.H = z3Var.a;
                        a11.Q = l10.longValue();
                        ez.C(b4Var.m2).r0(a11);
                    }
                }
                if (l10.longValue() <= 0) {
                    xb r10 = new cc(b4Var.M0, b4Var.l0).r(e10, hd.M0(2131746389, null), hd.M0(2131743552, null), new c1(z2Var, 3));
                    r10.j = 5000;
                    r10.j();
                }
                if (b4Var.P1.getReactionsWindow() != null) {
                    b4Var.P1.getReactionsWindow().e();
                }
                b4Var.q0();
                break;
            case 1:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj2;
                b4 b4Var2 = ((t3) obj4).x;
                e3 e3Var = b4Var2.M0;
                if (((Boolean) obj).booleanValue()) {
                    storyItem.pinned = z10;
                    boolean z11 = b4Var2.m1;
                    i10 = R.raw.chats_archived;
                    if (z11) {
                        cc ccVar2 = new cc(e3Var, e6Var);
                        if (z10) {
                            i10 = R.raw.contact_check;
                        }
                        ccVar2.Q(i10, 36, hd.M0(z10 ? 2131744582 : 2131744727, null)).j();
                        break;
                    } else if (z10) {
                        new cc(e3Var, e6Var).I(R.raw.contact_check, hd.M0(2131744584, null), hd.M0(2131744583, null)).j();
                        break;
                    } else {
                        ccVar = new cc(e3Var, e6Var);
                        i11 = 2131744454;
                    }
                } else {
                    ccVar = new cc(e3Var, e6Var);
                    i10 = R.raw.error;
                    i11 = 2131743879;
                }
                org.telegram.messenger.k5.n(null, i11, ccVar, i10, 36);
                break;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                int i13 = ChatActivityEnterView.N6;
                ((org.telegram.ui.ActionBar.t1) obj3).dismiss();
                bi.s2 s2Var = new bi.s2(chatActivityEnterView.getContext(), chatActivityEnterView.R, ((TLRPC.User) obj2).id, wg.q.c(wg.q.b(1, (List) obj)), null);
                s2Var.e1(z10);
                s2Var.show();
                break;
        }
    }

    public /* synthetic */ y2(t3 t3Var, TL_stories.StoryItem storyItem, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        this.c = t3Var;
        this.d = storyItem;
        this.b = z10;
        this.e = e6Var;
    }

    public /* synthetic */ y2(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.ActionBar.t1 t1Var, TLRPC.User user, boolean z10) {
        this.c = chatActivityEnterView;
        this.d = t1Var;
        this.e = user;
        this.b = z10;
    }
}
