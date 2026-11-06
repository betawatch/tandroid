package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class me0 extends kj0 {
    public final Context r;
    public final /* synthetic */ qe0 s;

    public me0(qe0 qe0Var, Context context) {
        this.s = qe0Var;
        this.r = context;
    }

    @Override // org.telegram.ui.Components.vi0
    public final String F(int i7) {
        return null;
    }

    @Override // org.telegram.ui.Components.vi0
    public final void G(pj0 pj0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.kj0
    public final int M(int i7) {
        int i10 = 1;
        if (i7 == 0) {
            return 1;
        }
        pe0 pe0Var = (pe0) this.s.t1.get(i7 - 1);
        int b10 = pe0Var.b() + 1;
        if (TextUtils.isEmpty(pe0Var.c) && !pe0Var.e) {
            i10 = 0;
        }
        return b10 + i10;
    }

    @Override // org.telegram.ui.Components.kj0
    public final Object O(int i7, int i10) {
        int i11;
        if (i7 == 0) {
            return 293145;
        }
        int i12 = i7 - 1;
        if (i10 == 0) {
            return -928312;
        }
        if (i12 >= 0) {
            qe0 qe0Var = this.s;
            if (i12 < qe0Var.t1.size() && (i11 = i10 - 1) < ((pe0) qe0Var.t1.get(i12)).b()) {
                return Integer.valueOf(Objects.hash(Long.valueOf(org.telegram.messenger.m5.o(((TLRPC.MessagePeerVote) ((pe0) qe0Var.t1.get(i12)).b.get(i11)).peer))));
            }
        }
        return -182734;
    }

    @Override // org.telegram.ui.Components.kj0
    public final int P(int i7, int i10) {
        if (i7 == 0) {
            return 1;
        }
        if (i10 == 0) {
            return 2;
        }
        return i10 + (-1) < ((pe0) this.s.t1.get(i7 + (-1))).b() ? 0 : 3;
    }

    @Override // org.telegram.ui.Components.kj0
    public final int R() {
        return this.s.t1.size() + 1;
    }

    @Override // org.telegram.ui.Components.kj0
    public final View T(int i7, View view) {
        TLRPC.Message message;
        qe0 qe0Var = this.s;
        TLRPC.Poll poll = qe0Var.p1;
        org.telegram.messenger.ij ijVar = qe0Var.o1;
        if (view == null) {
            view = new le0(this, this.r);
        }
        oe0 oe0Var = (oe0) view;
        if (i7 == 0) {
            oe0Var.setAlpha(0.0f);
            return view;
        }
        view.setAlpha(1.0f);
        pe0 pe0Var = (pe0) qe0Var.t1.get(i7 - 1);
        int size = poll.answers.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i11);
            if (Arrays.equals(pollAnswer.option, pe0Var.d) && ((ne0) qe0Var.s1.get(pe0Var)) != null) {
                TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                if (ijVar != null && ijVar.J2 && (message = ijVar.k) != null && message.translatedPoll != null) {
                    while (true) {
                        if (i10 >= ijVar.k.translatedPoll.b.size()) {
                            break;
                        }
                        TLRPC.PollAnswer pollAnswer2 = (TLRPC.PollAnswer) ijVar.k.translatedPoll.b.get(i10);
                        if (Arrays.equals(pollAnswer2.option, pollAnswer.option)) {
                            tL_textWithEntities = pollAnswer2.text;
                            break;
                        }
                        i10++;
                    }
                }
                oe0Var.a(tL_textWithEntities == null ? "" : tL_textWithEntities.text, tL_textWithEntities == null ? null : tL_textWithEntities.entities, qe0Var.K0(pe0Var.d), pe0Var.a, pe0Var.a(), false);
                oe0Var.setTag(R.id.object_tag, pe0Var);
                return view;
            }
        }
        return view;
    }

    @Override // org.telegram.ui.Components.kj0
    public final boolean V(int i7, int i10, v4.d1 d1Var) {
        if (i7 == 0 || i10 == 0) {
            return false;
        }
        ArrayList arrayList = this.s.w1;
        return arrayList == null || arrayList.isEmpty();
    }

    @Override // org.telegram.ui.Components.kj0
    public final void W(int i7, int i10, v4.d1 d1Var) {
        TLRPC.Message message;
        qe0 qe0Var = this.s;
        TLRPC.Poll poll = qe0Var.p1;
        ArrayList arrayList = qe0Var.t1;
        org.telegram.messenger.ij ijVar = qe0Var.o1;
        int i11 = d1Var.f;
        View view = d1Var.a;
        int i12 = 0;
        if (i11 != 2) {
            if (i11 != 3) {
                return;
            }
            pe0 pe0Var = (pe0) arrayList.get(i7 - 1);
            ((org.telegram.ui.Cells.m8) view).o(R.drawable.arrow_more, org.telegram.messenger.hd.G(pe0Var.a - pe0Var.b(), "ShowVotes", new Object[0]), false);
            return;
        }
        oe0 oe0Var = (oe0) view;
        pe0 pe0Var2 = (pe0) arrayList.get(i7 - 1);
        ArrayList arrayList2 = pe0Var2.b;
        byte[] bArr = pe0Var2.d;
        int size = poll.answers.size();
        for (int i13 = 0; i13 < size; i13++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i13);
            if (Arrays.equals(pollAnswer.option, bArr) && ((ne0) qe0Var.s1.get(pe0Var2)) != null) {
                TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                if (ijVar != null && ijVar.J2 && (message = ijVar.k) != null && message.translatedPoll != null) {
                    while (true) {
                        if (i12 >= ijVar.k.translatedPoll.b.size()) {
                            break;
                        }
                        TLRPC.PollAnswer pollAnswer2 = (TLRPC.PollAnswer) ijVar.k.translatedPoll.b.get(i12);
                        if (Arrays.equals(pollAnswer2.option, pollAnswer.option)) {
                            tL_textWithEntities = pollAnswer2.text;
                            break;
                        }
                        i12++;
                    }
                }
                oe0Var.a(tL_textWithEntities == null ? "" : tL_textWithEntities.text, tL_textWithEntities == null ? null : tL_textWithEntities.entities, qe0Var.K0(bArr), pe0Var2.a, pe0Var2.a(), false);
                oe0Var.setTag(R.id.object_tag, pe0Var2);
                return;
            }
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View view;
        qe0 qe0Var = this.s;
        View view2 = qe0Var.u1;
        Context context = this.r;
        if (i7 == 0) {
            view = new PollVotesAlert$UserCell(qe0Var, context);
        } else if (i7 == 1) {
            ViewParent parent = view2.getParent();
            view = view2;
            if (parent != null) {
                ((ViewGroup) view2.getParent()).removeView(view2);
                view = view2;
            }
        } else if (i7 != 2) {
            org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(23, context, true);
            m8Var.setOffsetFromImage(65);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.h5, m8Var, qe0Var.I0);
            m8Var.g(org.telegram.ui.ActionBar.k6.N6, org.telegram.ui.ActionBar.k6.q6);
            view = m8Var;
        } else {
            View le0Var = new le0(this, context);
            le0Var.setTag(-33024);
            view = le0Var;
        }
        return new xi0(view);
    }

    @Override // v4.g0
    public final void y(v4.d1 d1Var) {
        TLRPC.Chat chat;
        boolean z9;
        if (d1Var.f == 0) {
            int b10 = d1Var.b();
            int S = S(b10);
            int Q = Q(b10) - 1;
            PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) d1Var.a;
            qe0 qe0Var = this.s;
            pe0 pe0Var = (pe0) qe0Var.t1.get(S - 1);
            TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) pe0Var.b.get(Q);
            TLObject e22 = org.telegram.messenger.qp.s1(qe0Var.a).e2(org.telegram.messenger.m5.o(messagePeerVote.peer));
            int i7 = messagePeerVote.date;
            boolean z10 = (Q == pe0Var.b() - 1 && TextUtils.isEmpty(pe0Var.c) && !pe0Var.e) ? false : true;
            l9 l9Var = pollVotesAlert$UserCell.a;
            org.telegram.ui.ActionBar.k5 k5Var = pollVotesAlert$UserCell.b;
            if (e22 instanceof TLRPC.User) {
                pollVotesAlert$UserCell.h = (TLRPC.User) e22;
                pollVotesAlert$UserCell.n = null;
            } else if (e22 instanceof TLRPC.Chat) {
                pollVotesAlert$UserCell.n = (TLRPC.Chat) e22;
                pollVotesAlert$UserCell.h = null;
            } else {
                pollVotesAlert$UserCell.h = null;
                pollVotesAlert$UserCell.n = null;
            }
            long j3 = i7;
            pollVotesAlert$UserCell.d.setText(org.telegram.messenger.hd.E0().p0().format(j3 * 1000));
            pollVotesAlert$UserCell.c.setText(org.telegram.messenger.hd.r(j3, true));
            pollVotesAlert$UserCell.s = z10;
            pollVotesAlert$UserCell.x = e22 == null;
            pollVotesAlert$UserCell.w = Q;
            if (e22 == null) {
                k5Var.l("", false);
                l9Var.setImageDrawable(null);
            } else {
                w8 w8Var = pollVotesAlert$UserCell.e;
                TLRPC.User user = pollVotesAlert$UserCell.h;
                if ((user == null || user.photo == null) && (chat = pollVotesAlert$UserCell.n) != null) {
                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                }
                if (user != null) {
                    w8Var.r(user);
                    TLRPC.UserStatus userStatus = pollVotesAlert$UserCell.h.status;
                } else {
                    TLRPC.Chat chat2 = pollVotesAlert$UserCell.n;
                    if (chat2 != null) {
                        w8Var.q(chat2);
                    }
                }
                TLRPC.User user2 = pollVotesAlert$UserCell.h;
                if (user2 != null) {
                    String p10 = org.telegram.messenger.t10.p(user2);
                    pollVotesAlert$UserCell.r = p10;
                    z9 = false;
                    pollVotesAlert$UserCell.r = org.telegram.messenger.i6.m(p10, k5Var.getPaint().getFontMetricsInt(), false, null, 0);
                } else {
                    z9 = false;
                    TLRPC.Chat chat3 = pollVotesAlert$UserCell.n;
                    if (chat3 != null) {
                        String str = chat3.title;
                        pollVotesAlert$UserCell.r = str;
                        pollVotesAlert$UserCell.r = org.telegram.messenger.i6.m(str, k5Var.getPaint().getFontMetricsInt(), false, null, 0);
                    } else {
                        pollVotesAlert$UserCell.r = "";
                    }
                }
                k5Var.l(pollVotesAlert$UserCell.r, z9);
                nu0 nu0Var = pollVotesAlert$UserCell.f;
                TLRPC.User user3 = pollVotesAlert$UserCell.h;
                TLRPC.Chat chat4 = pollVotesAlert$UserCell.n;
                int i10 = org.telegram.ui.ActionBar.k6.z9;
                qe0 qe0Var2 = pollVotesAlert$UserCell.E;
                org.telegram.ui.Cells.o8 o8Var = qe0.I1;
                k5Var.i(nu0Var.b(user3, chat4, org.telegram.ui.ActionBar.k6.w0(i10, qe0Var2.I0), z9));
                TLRPC.Chat chat5 = pollVotesAlert$UserCell.n;
                if (chat5 != null) {
                    l9Var.e(chat5, w8Var);
                } else {
                    TLRPC.User user4 = pollVotesAlert$UserCell.h;
                    if (user4 != null) {
                        l9Var.e(user4, w8Var);
                    } else {
                        l9Var.setImageDrawable(w8Var);
                    }
                }
            }
            ArrayList arrayList = pollVotesAlert$UserCell.D;
            if (arrayList == null) {
                if (pollVotesAlert$UserCell.x) {
                    return;
                }
                pollVotesAlert$UserCell.y = 0.0f;
            } else {
                Property property = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(l9Var, (Property<l9, Float>) property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.D.add(ObjectAnimator.ofFloat(k5Var, (Property<org.telegram.ui.ActionBar.k5, Float>) property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.D.add(ObjectAnimator.ofFloat(pollVotesAlert$UserCell, qe0.I1, 1.0f, 0.0f));
            }
        }
    }
}
