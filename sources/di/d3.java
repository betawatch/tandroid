package di;

import android.view.View;
import bi.ab;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.ez;
import org.telegram.messenger.gz;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.gc;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d3 implements c20 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d3(e3 e3Var, boolean z9, ch.o0 o0Var, View view) {
        this.c = e3Var;
        this.b = z9;
        this.d = o0Var;
        this.e = view;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        int i7;
        ch.k0 k0Var;
        TLRPC.Document e10;
        gc gcVar;
        int i10;
        int i11;
        int i12 = this.a;
        boolean z9 = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i12) {
            case 0:
                e3 e3Var = (e3) obj4;
                ch.o0 o0Var = (ch.o0) obj3;
                View view = (View) obj2;
                Long l10 = (Long) obj;
                j4 j4Var = e3Var.a;
                if (!z9 || o0Var.f == null) {
                    i7 = 0;
                    k0Var = new ch.k0(view.getContext(), null, j4Var.O1, null, view, j4Var.getMeasuredWidth() / 2.0f, j4Var.getMeasuredHeight() / 2.0f, o0Var, j4Var.l2, 2, true);
                    o0Var = o0Var;
                } else {
                    try {
                        j4Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    i7 = 0;
                    k0Var = new ch.k0(view.getContext(), null, j4Var.O1, null, view, j4Var.getMeasuredWidth() / 2.0f, j4Var.getMeasuredHeight() / 2.0f, o0Var, j4Var.l2, 0, true);
                }
                ch.k0.B = k0Var;
                ch.h0 h0Var = k0Var.i;
                h0Var.setTag(R.id.parent_tag, 1);
                j4Var.addView(h0Var);
                h4 h4Var = j4Var.x1;
                k0Var.s = true;
                k0Var.y = System.currentTimeMillis();
                if (o0Var.f != null) {
                    e10 = ui.b0(j4Var.l2).T(o0Var.f);
                    ez a10 = ez.a(j4Var.k1, o0Var.f);
                    a10.H = h4Var.a;
                    a10.Q = l10.longValue();
                    gz.C(j4Var.l2).r0(a10);
                } else {
                    e10 = org.telegram.ui.Components.h5.e(j4Var.l2, o0Var.g);
                    String V = ij.V(e10, null, null);
                    if (V == null) {
                        if (j4Var.O1.getReactionsWindow() != null) {
                            j4Var.O1.getReactionsWindow().e();
                        }
                        j4Var.q0();
                        break;
                    } else {
                        ez a11 = ez.a(j4Var.k1, V);
                        a11.w = new ArrayList();
                        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                        tL_messageEntityCustomEmoji.document_id = o0Var.g;
                        tL_messageEntityCustomEmoji.offset = i7;
                        tL_messageEntityCustomEmoji.length = V.length();
                        a11.w.add(tL_messageEntityCustomEmoji);
                        a11.H = h4Var.a;
                        a11.Q = l10.longValue();
                        gz.C(j4Var.l2).r0(a11);
                    }
                }
                if (l10.longValue() <= 0) {
                    bc r10 = new gc(j4Var.L0, j4Var.k0).r(e10, id.M0(2131746389, null), id.M0(2131743552, null), new ab(e3Var, 19));
                    r10.j = 5000;
                    r10.j();
                }
                if (j4Var.O1.getReactionsWindow() != null) {
                    j4Var.O1.getReactionsWindow().e();
                }
                j4Var.q0();
                break;
            case 1:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj2;
                j4 j4Var2 = ((a4) obj4).x;
                j3 j3Var = j4Var2.L0;
                if (((Boolean) obj).booleanValue()) {
                    storyItem.pinned = z9;
                    boolean z10 = j4Var2.l1;
                    i10 = R.raw.chats_archived;
                    if (z10) {
                        gc gcVar2 = new gc(j3Var, h6Var);
                        if (z9) {
                            i10 = R.raw.contact_check;
                        }
                        gcVar2.Q(i10, 36, id.M0(z9 ? 2131744582 : 2131744727, null)).j();
                        break;
                    } else if (z9) {
                        new gc(j3Var, h6Var).I(R.raw.contact_check, id.M0(2131744584, null), id.M0(2131744583, null)).j();
                        break;
                    } else {
                        gcVar = new gc(j3Var, h6Var);
                        i11 = 2131744454;
                    }
                } else {
                    gcVar = new gc(j3Var, h6Var);
                    i10 = R.raw.error;
                    i11 = 2131743879;
                }
                org.telegram.messenger.k5.o(null, i11, gcVar, i10, 36);
                break;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                int i13 = ChatActivityEnterView.s5;
                ((org.telegram.ui.ActionBar.u1) obj3).dismiss();
                zh.g1 g1Var = new zh.g1(chatActivityEnterView.getContext(), chatActivityEnterView.Q, ((TLRPC.User) obj2).id, wg.r.c(wg.r.b(1, (List) obj)), null);
                g1Var.e1(z9);
                g1Var.show();
                break;
        }
    }

    public /* synthetic */ d3(a4 a4Var, TL_stories.StoryItem storyItem, boolean z9, org.telegram.ui.ActionBar.h6 h6Var) {
        this.c = a4Var;
        this.d = storyItem;
        this.b = z9;
        this.e = h6Var;
    }

    public /* synthetic */ d3(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.ActionBar.u1 u1Var, TLRPC.User user, boolean z9) {
        this.c = chatActivityEnterView;
        this.d = u1Var;
        this.e = user;
        this.b = z9;
    }
}
