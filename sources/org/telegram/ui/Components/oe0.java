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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class oe0 extends oj0 {
    public final Context r;
    public final /* synthetic */ se0 s;

    public oe0(se0 se0Var, Context context) {
        this.s = se0Var;
        this.r = context;
    }

    @Override // org.telegram.ui.Components.zi0
    public final String F(int i3) {
        return null;
    }

    @Override // org.telegram.ui.Components.zi0
    public final void G(tj0 tj0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.oj0
    public final int M(int i3) {
        int i10 = 1;
        if (i3 == 0) {
            return 1;
        }
        re0 re0Var = (re0) this.s.u1.get(i3 - 1);
        int b10 = re0Var.b() + 1;
        if (TextUtils.isEmpty(re0Var.c) && !re0Var.e) {
            i10 = 0;
        }
        return b10 + i10;
    }

    @Override // org.telegram.ui.Components.oj0
    public final Object O(int i3, int i10) {
        int i11;
        if (i3 == 0) {
            return 293145;
        }
        int i12 = i3 - 1;
        if (i10 == 0) {
            return -928312;
        }
        if (i12 >= 0) {
            se0 se0Var = this.s;
            if (i12 < se0Var.u1.size() && (i11 = i10 - 1) < ((re0) se0Var.u1.get(i12)).b()) {
                return Integer.valueOf(Objects.hash(Long.valueOf(org.telegram.messenger.m5.o(((TLRPC.MessagePeerVote) ((re0) se0Var.u1.get(i12)).b.get(i11)).peer))));
            }
        }
        return -182734;
    }

    @Override // org.telegram.ui.Components.oj0
    public final int P(int i3, int i10) {
        if (i3 == 0) {
            return 1;
        }
        if (i10 == 0) {
            return 2;
        }
        return i10 + (-1) < ((re0) this.s.u1.get(i3 + (-1))).b() ? 0 : 3;
    }

    @Override // org.telegram.ui.Components.oj0
    public final int R() {
        return this.s.u1.size() + 1;
    }

    @Override // org.telegram.ui.Components.oj0
    public final View T(int i3, View view) {
        TLRPC.Message message;
        se0 se0Var = this.s;
        TLRPC.Poll poll = se0Var.q1;
        org.telegram.messenger.zi ziVar = se0Var.p1;
        if (view == null) {
            view = new ne0(this, this.r);
        }
        qe0 qe0Var = (qe0) view;
        if (i3 == 0) {
            qe0Var.setAlpha(0.0f);
            return view;
        }
        view.setAlpha(1.0f);
        re0 re0Var = (re0) se0Var.u1.get(i3 - 1);
        int size = poll.answers.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i11);
            if (Arrays.equals(pollAnswer.option, re0Var.d) && ((pe0) se0Var.t1.get(re0Var)) != null) {
                TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                if (ziVar != null && ziVar.J2 && (message = ziVar.k) != null && message.translatedPoll != null) {
                    while (true) {
                        if (i10 >= ziVar.k.translatedPoll.b.size()) {
                            break;
                        }
                        TLRPC.PollAnswer pollAnswer2 = (TLRPC.PollAnswer) ziVar.k.translatedPoll.b.get(i10);
                        if (Arrays.equals(pollAnswer2.option, pollAnswer.option)) {
                            tL_textWithEntities = pollAnswer2.text;
                            break;
                        }
                        i10++;
                    }
                }
                qe0Var.a(tL_textWithEntities == null ? "" : tL_textWithEntities.text, tL_textWithEntities == null ? null : tL_textWithEntities.entities, se0Var.K0(re0Var.d), re0Var.a, re0Var.a(), false);
                qe0Var.setTag(R.id.object_tag, re0Var);
                return view;
            }
        }
        return view;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean V(int i3, int i10, u4.d1 d1Var) {
        if (i3 == 0 || i10 == 0) {
            return false;
        }
        ArrayList arrayList = this.s.x1;
        return arrayList == null || arrayList.isEmpty();
    }

    @Override // org.telegram.ui.Components.oj0
    public final void W(int i3, int i10, u4.d1 d1Var) {
        TLRPC.Message message;
        se0 se0Var = this.s;
        TLRPC.Poll poll = se0Var.q1;
        ArrayList arrayList = se0Var.u1;
        org.telegram.messenger.zi ziVar = se0Var.p1;
        int i11 = d1Var.f;
        View view = d1Var.a;
        int i12 = 0;
        if (i11 != 2) {
            if (i11 != 3) {
                return;
            }
            re0 re0Var = (re0) arrayList.get(i3 - 1);
            ((org.telegram.ui.Cells.l8) view).o(R.drawable.arrow_more, org.telegram.messenger.bd.G(re0Var.a - re0Var.b(), "ShowVotes", new Object[0]), false);
            return;
        }
        qe0 qe0Var = (qe0) view;
        re0 re0Var2 = (re0) arrayList.get(i3 - 1);
        ArrayList arrayList2 = re0Var2.b;
        byte[] bArr = re0Var2.d;
        int size = poll.answers.size();
        for (int i13 = 0; i13 < size; i13++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i13);
            if (Arrays.equals(pollAnswer.option, bArr) && ((pe0) se0Var.t1.get(re0Var2)) != null) {
                TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                if (ziVar != null && ziVar.J2 && (message = ziVar.k) != null && message.translatedPoll != null) {
                    while (true) {
                        if (i12 >= ziVar.k.translatedPoll.b.size()) {
                            break;
                        }
                        TLRPC.PollAnswer pollAnswer2 = (TLRPC.PollAnswer) ziVar.k.translatedPoll.b.get(i12);
                        if (Arrays.equals(pollAnswer2.option, pollAnswer.option)) {
                            tL_textWithEntities = pollAnswer2.text;
                            break;
                        }
                        i12++;
                    }
                }
                qe0Var.a(tL_textWithEntities == null ? "" : tL_textWithEntities.text, tL_textWithEntities == null ? null : tL_textWithEntities.entities, se0Var.K0(bArr), re0Var2.a, re0Var2.a(), false);
                qe0Var.setTag(R.id.object_tag, re0Var2);
                return;
            }
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View view;
        se0 se0Var = this.s;
        View view2 = se0Var.v1;
        Context context = this.r;
        if (i3 == 0) {
            view = new PollVotesAlert$UserCell(se0Var, context);
        } else if (i3 == 1) {
            ViewParent parent = view2.getParent();
            view = view2;
            if (parent != null) {
                ((ViewGroup) view2.getParent()).removeView(view2);
                view = view2;
            }
        } else if (i3 != 2) {
            org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(23, context, true);
            l8Var.setOffsetFromImage(65);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.h5, l8Var, se0Var.J0);
            l8Var.g(org.telegram.ui.ActionBar.k6.N6, org.telegram.ui.ActionBar.k6.q6);
            view = l8Var;
        } else {
            View ne0Var = new ne0(this, context);
            ne0Var.setTag(-33024);
            view = ne0Var;
        }
        return new bj0(view);
    }

    @Override // u4.h0
    public final void y(u4.d1 d1Var) {
        TLRPC.Chat chat;
        boolean z10;
        if (d1Var.f == 0) {
            int b10 = d1Var.b();
            int S = S(b10);
            int Q = Q(b10) - 1;
            PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) d1Var.a;
            se0 se0Var = this.s;
            re0 re0Var = (re0) se0Var.u1.get(S - 1);
            TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) re0Var.b.get(Q);
            TLObject e22 = org.telegram.messenger.hp.s1(se0Var.a).e2(org.telegram.messenger.m5.o(messagePeerVote.peer));
            int i3 = messagePeerVote.date;
            boolean z11 = (Q == re0Var.b() - 1 && TextUtils.isEmpty(re0Var.c) && !re0Var.e) ? false : true;
            k9 k9Var = pollVotesAlert$UserCell.a;
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
            long j10 = i3;
            pollVotesAlert$UserCell.d.setText(org.telegram.messenger.bd.E0().p0().format(j10 * 1000));
            pollVotesAlert$UserCell.c.setText(org.telegram.messenger.bd.r(j10, true));
            pollVotesAlert$UserCell.s = z11;
            pollVotesAlert$UserCell.x = e22 == null;
            pollVotesAlert$UserCell.w = Q;
            if (e22 == null) {
                k5Var.l("", false);
                k9Var.setImageDrawable(null);
            } else {
                u8 u8Var = pollVotesAlert$UserCell.e;
                TLRPC.User user = pollVotesAlert$UserCell.h;
                if ((user == null || user.photo == null) && (chat = pollVotesAlert$UserCell.n) != null) {
                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                }
                if (user != null) {
                    u8Var.r(user);
                    TLRPC.UserStatus userStatus = pollVotesAlert$UserCell.h.status;
                } else {
                    TLRPC.Chat chat2 = pollVotesAlert$UserCell.n;
                    if (chat2 != null) {
                        u8Var.q(chat2);
                    }
                }
                TLRPC.User user2 = pollVotesAlert$UserCell.h;
                if (user2 != null) {
                    String p10 = org.telegram.messenger.l10.p(user2);
                    pollVotesAlert$UserCell.r = p10;
                    z10 = false;
                    pollVotesAlert$UserCell.r = org.telegram.messenger.i6.m(p10, k5Var.getPaint().getFontMetricsInt(), false, null, 0);
                } else {
                    z10 = false;
                    TLRPC.Chat chat3 = pollVotesAlert$UserCell.n;
                    if (chat3 != null) {
                        String str = chat3.title;
                        pollVotesAlert$UserCell.r = str;
                        pollVotesAlert$UserCell.r = org.telegram.messenger.i6.m(str, k5Var.getPaint().getFontMetricsInt(), false, null, 0);
                    } else {
                        pollVotesAlert$UserCell.r = "";
                    }
                }
                k5Var.l(pollVotesAlert$UserCell.r, z10);
                mu0 mu0Var = pollVotesAlert$UserCell.f;
                TLRPC.User user3 = pollVotesAlert$UserCell.h;
                TLRPC.Chat chat4 = pollVotesAlert$UserCell.n;
                int i10 = org.telegram.ui.ActionBar.k6.z9;
                se0 se0Var2 = pollVotesAlert$UserCell.F;
                org.telegram.ui.Cells.n8 n8Var = se0.J1;
                k5Var.i(mu0Var.b(user3, chat4, org.telegram.ui.ActionBar.k6.w0(i10, se0Var2.J0), z10));
                TLRPC.Chat chat5 = pollVotesAlert$UserCell.n;
                if (chat5 != null) {
                    k9Var.e(chat5, u8Var);
                } else {
                    TLRPC.User user4 = pollVotesAlert$UserCell.h;
                    if (user4 != null) {
                        k9Var.e(user4, u8Var);
                    } else {
                        k9Var.setImageDrawable(u8Var);
                    }
                }
            }
            ArrayList arrayList = pollVotesAlert$UserCell.E;
            if (arrayList == null) {
                if (pollVotesAlert$UserCell.x) {
                    return;
                }
                pollVotesAlert$UserCell.y = 0.0f;
            } else {
                Property property = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(k9Var, (Property<k9, Float>) property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.E.add(ObjectAnimator.ofFloat(k5Var, (Property<org.telegram.ui.ActionBar.k5, Float>) property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.E.add(ObjectAnimator.ofFloat(pollVotesAlert$UserCell, se0.J1, 1.0f, 0.0f));
            }
        }
    }
}
