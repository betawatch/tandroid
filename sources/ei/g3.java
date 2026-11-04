package ei;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.li;
import org.telegram.messenger.u10;
import org.telegram.messenger.wy;
import org.telegram.messenger.yy;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.fc;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g3 implements u10 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ g3(h3 h3Var, boolean z10, dh.n0 n0Var, View view) {
        this.c = h3Var;
        this.b = z10;
        this.d = n0Var;
        this.e = view;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        int i3;
        dh.j0 j0Var;
        TLRPC.Document e10;
        fc fcVar;
        int i10;
        int i11;
        int i12 = this.a;
        boolean z10 = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i12) {
            case 0:
                h3 h3Var = (h3) obj4;
                dh.n0 n0Var = (dh.n0) obj3;
                View view = (View) obj2;
                Long l10 = (Long) obj;
                j4 j4Var = h3Var.a;
                if (!z10 || n0Var.f == null) {
                    i3 = 0;
                    j0Var = new dh.j0(view.getContext(), null, j4Var.P1, null, view, j4Var.getMeasuredWidth() / 2.0f, j4Var.getMeasuredHeight() / 2.0f, n0Var, j4Var.m2, 2, true);
                    n0Var = n0Var;
                } else {
                    try {
                        j4Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    i3 = 0;
                    j0Var = new dh.j0(view.getContext(), null, j4Var.P1, null, view, j4Var.getMeasuredWidth() / 2.0f, j4Var.getMeasuredHeight() / 2.0f, n0Var, j4Var.m2, 0, true);
                }
                dh.j0.B = j0Var;
                dh.g0 g0Var = j0Var.i;
                g0Var.setTag(R.id.parent_tag, 1);
                j4Var.addView(g0Var);
                h4 h4Var = j4Var.y1;
                j0Var.s = true;
                j0Var.y = System.currentTimeMillis();
                if (n0Var.f != null) {
                    e10 = li.b0(j4Var.m2).T(n0Var.f);
                    wy a10 = wy.a(j4Var.l1, n0Var.f);
                    a10.H = h4Var.a;
                    a10.Q = l10.longValue();
                    yy.C(j4Var.m2).r0(a10);
                } else {
                    e10 = org.telegram.ui.Components.g5.e(j4Var.m2, n0Var.g);
                    String V = zi.V(e10, null, null);
                    if (V == null) {
                        if (j4Var.P1.getReactionsWindow() != null) {
                            j4Var.P1.getReactionsWindow().e();
                        }
                        j4Var.q0();
                        break;
                    } else {
                        wy a11 = wy.a(j4Var.l1, V);
                        a11.w = new ArrayList();
                        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                        tL_messageEntityCustomEmoji.document_id = n0Var.g;
                        tL_messageEntityCustomEmoji.offset = i3;
                        tL_messageEntityCustomEmoji.length = V.length();
                        a11.w.add(tL_messageEntityCustomEmoji);
                        a11.H = h4Var.a;
                        a11.Q = l10.longValue();
                        yy.C(j4Var.m2).r0(a11);
                    }
                }
                if (l10.longValue() <= 0) {
                    ac r5 = new fc(j4Var.M0, j4Var.l0).r(e10, bd.M0(2131746397, null), bd.M0(2131743562, null), new ci.d1(h3Var, 24));
                    r5.j = 5000;
                    r5.j();
                }
                if (j4Var.P1.getReactionsWindow() != null) {
                    j4Var.P1.getReactionsWindow().e();
                }
                j4Var.q0();
                break;
            case 1:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj2;
                j4 j4Var2 = ((b4) obj4).x;
                m3 m3Var = j4Var2.M0;
                if (((Boolean) obj).booleanValue()) {
                    storyItem.pinned = z10;
                    boolean z11 = j4Var2.m1;
                    i10 = R.raw.chats_archived;
                    if (z11) {
                        fc fcVar2 = new fc(m3Var, e6Var);
                        if (z10) {
                            i10 = R.raw.contact_check;
                        }
                        fcVar2.Q(i10, 36, bd.M0(z10 ? 2131744592 : 2131744737, null)).j();
                        break;
                    } else if (z10) {
                        new fc(m3Var, e6Var).I(R.raw.contact_check, bd.M0(2131744594, null), bd.M0(2131744593, null)).j();
                        break;
                    } else {
                        fcVar = new fc(m3Var, e6Var);
                        i11 = 2131744464;
                    }
                } else {
                    fcVar = new fc(m3Var, e6Var);
                    i10 = R.raw.error;
                    i11 = 2131743889;
                }
                org.telegram.messenger.k5.o(null, i11, fcVar, i10, 36);
                break;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                int i13 = ChatActivityEnterView.t5;
                ((org.telegram.ui.ActionBar.s1) obj3).dismiss();
                ai.b3 b3Var = new ai.b3(chatActivityEnterView.getContext(), chatActivityEnterView.R, ((TLRPC.User) obj2).id, xg.s.c(xg.s.b(1, (List) obj)), null);
                b3Var.e1(z10);
                b3Var.show();
                break;
        }
    }

    public /* synthetic */ g3(b4 b4Var, TL_stories.StoryItem storyItem, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        this.c = b4Var;
        this.d = storyItem;
        this.b = z10;
        this.e = e6Var;
    }

    public /* synthetic */ g3(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.ActionBar.s1 s1Var, TLRPC.User user, boolean z10) {
        this.c = chatActivityEnterView;
        this.d = s1Var;
        this.e = user;
        this.b = z10;
    }
}
