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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class pf0 extends ok0 {
    public final Context r;
    public final /* synthetic */ tf0 s;

    public pf0(tf0 tf0Var, Context context) {
        this.s = tf0Var;
        this.r = context;
    }

    @Override // org.telegram.ui.Components.ak0
    public final String F(int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.ak0
    public final void G(tk0 tk0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.ok0
    public final int M(int i10) {
        int i11 = 1;
        if (i10 == 0) {
            return 1;
        }
        sf0 sf0Var = (sf0) this.s.t1.get(i10 - 1);
        int b10 = sf0Var.b() + 1;
        if (TextUtils.isEmpty(sf0Var.c) && !sf0Var.e) {
            i11 = 0;
        }
        return b10 + i11;
    }

    @Override // org.telegram.ui.Components.ok0
    public final Object O(int i10, int i11) {
        int i12;
        if (i10 == 0) {
            return 293145;
        }
        int i13 = i10 - 1;
        if (i11 == 0) {
            return -928312;
        }
        if (i13 >= 0) {
            tf0 tf0Var = this.s;
            if (i13 < tf0Var.t1.size() && (i12 = i11 - 1) < ((sf0) tf0Var.t1.get(i13)).b()) {
                return Integer.valueOf(Objects.hash(Long.valueOf(org.telegram.messenger.o5.o(((TLRPC.MessagePeerVote) ((sf0) tf0Var.t1.get(i13)).b.get(i12)).peer))));
            }
        }
        return -182734;
    }

    @Override // org.telegram.ui.Components.ok0
    public final int P(int i10, int i11) {
        if (i10 == 0) {
            return 1;
        }
        if (i11 == 0) {
            return 2;
        }
        return i11 + (-1) < ((sf0) this.s.t1.get(i10 + (-1))).b() ? 0 : 3;
    }

    @Override // org.telegram.ui.Components.ok0
    public final int R() {
        return this.s.t1.size() + 1;
    }

    @Override // org.telegram.ui.Components.ok0
    public final View T(int i10, View view) {
        TLRPC.Message message;
        tf0 tf0Var = this.s;
        TLRPC.Poll poll = tf0Var.p1;
        org.telegram.messenger.jj jjVar = tf0Var.o1;
        if (view == null) {
            view = new of0(this, this.r);
        }
        rf0 rf0Var = (rf0) view;
        if (i10 == 0) {
            rf0Var.setAlpha(0.0f);
            return view;
        }
        view.setAlpha(1.0f);
        sf0 sf0Var = (sf0) tf0Var.t1.get(i10 - 1);
        int size = poll.answers.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i12);
            if (Arrays.equals(pollAnswer.option, sf0Var.d) && ((qf0) tf0Var.s1.get(sf0Var)) != null) {
                TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                if (jjVar != null && jjVar.J2 && (message = jjVar.k) != null && message.translatedPoll != null) {
                    while (true) {
                        if (i11 >= jjVar.k.translatedPoll.b.size()) {
                            break;
                        }
                        TLRPC.PollAnswer pollAnswer2 = (TLRPC.PollAnswer) jjVar.k.translatedPoll.b.get(i11);
                        if (Arrays.equals(pollAnswer2.option, pollAnswer.option)) {
                            tL_textWithEntities = pollAnswer2.text;
                            break;
                        }
                        i11++;
                    }
                }
                rf0Var.a(tL_textWithEntities == null ? "" : tL_textWithEntities.text, tL_textWithEntities == null ? null : tL_textWithEntities.entities, tf0Var.K0(sf0Var.d), sf0Var.a, sf0Var.a(), false);
                rf0Var.setTag(R.id.object_tag, sf0Var);
                return view;
            }
        }
        return view;
    }

    @Override // org.telegram.ui.Components.ok0
    public final boolean V(int i10, int i11, s4.c1 c1Var) {
        if (i10 == 0 || i11 == 0) {
            return false;
        }
        ArrayList arrayList = this.s.w1;
        return arrayList == null || arrayList.isEmpty();
    }

    @Override // org.telegram.ui.Components.ok0
    public final void W(int i10, int i11, s4.c1 c1Var) {
        TLRPC.Message message;
        tf0 tf0Var = this.s;
        TLRPC.Poll poll = tf0Var.p1;
        ArrayList arrayList = tf0Var.t1;
        org.telegram.messenger.jj jjVar = tf0Var.o1;
        int i12 = c1Var.f;
        View view = c1Var.a;
        int i13 = 0;
        if (i12 != 2) {
            if (i12 != 3) {
                return;
            }
            sf0 sf0Var = (sf0) arrayList.get(i10 - 1);
            ((org.telegram.ui.Cells.p8) view).o(R.drawable.arrow_more, org.telegram.messenger.cd.G(sf0Var.a - sf0Var.b(), "ShowVotes", new Object[0]), false);
            return;
        }
        rf0 rf0Var = (rf0) view;
        sf0 sf0Var2 = (sf0) arrayList.get(i10 - 1);
        ArrayList arrayList2 = sf0Var2.b;
        byte[] bArr = sf0Var2.d;
        int size = poll.answers.size();
        for (int i14 = 0; i14 < size; i14++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i14);
            if (Arrays.equals(pollAnswer.option, bArr) && ((qf0) tf0Var.s1.get(sf0Var2)) != null) {
                TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                if (jjVar != null && jjVar.J2 && (message = jjVar.k) != null && message.translatedPoll != null) {
                    while (true) {
                        if (i13 >= jjVar.k.translatedPoll.b.size()) {
                            break;
                        }
                        TLRPC.PollAnswer pollAnswer2 = (TLRPC.PollAnswer) jjVar.k.translatedPoll.b.get(i13);
                        if (Arrays.equals(pollAnswer2.option, pollAnswer.option)) {
                            tL_textWithEntities = pollAnswer2.text;
                            break;
                        }
                        i13++;
                    }
                }
                rf0Var.a(tL_textWithEntities == null ? "" : tL_textWithEntities.text, tL_textWithEntities == null ? null : tL_textWithEntities.entities, tf0Var.K0(bArr), sf0Var2.a, sf0Var2.a(), false);
                rf0Var.setTag(R.id.object_tag, sf0Var2);
                return;
            }
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View view;
        tf0 tf0Var = this.s;
        View view2 = tf0Var.u1;
        Context context = this.r;
        if (i10 == 0) {
            view = new PollVotesAlert$UserCell(tf0Var, context);
        } else if (i10 == 1) {
            ViewParent parent = view2.getParent();
            view = view2;
            if (parent != null) {
                ((ViewGroup) view2.getParent()).removeView(view2);
                view = view2;
            }
        } else if (i10 != 2) {
            org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(23, context, true);
            p8Var.setOffsetFromImage(65);
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.h5, p8Var, tf0Var.I0);
            p8Var.g(org.telegram.ui.ActionBar.t6.N6, org.telegram.ui.ActionBar.t6.q6);
            view = p8Var;
        } else {
            View of0Var = new of0(this, context);
            of0Var.setTag(-33024);
            view = of0Var;
        }
        return new ck0(view);
    }

    @Override // s4.g0
    public final void y(s4.c1 c1Var) {
        TLRPC.Chat chat;
        boolean z10;
        if (c1Var.f == 0) {
            int b10 = c1Var.b();
            int S = S(b10);
            int Q = Q(b10) - 1;
            PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) c1Var.a;
            tf0 tf0Var = this.s;
            sf0 sf0Var = (sf0) tf0Var.t1.get(S - 1);
            TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) sf0Var.b.get(Q);
            TLObject d22 = org.telegram.messenger.vp.r1(tf0Var.a).d2(org.telegram.messenger.o5.o(messagePeerVote.peer));
            int i10 = messagePeerVote.date;
            boolean z11 = (Q == sf0Var.b() - 1 && TextUtils.isEmpty(sf0Var.c) && !sf0Var.e) ? false : true;
            g9 g9Var = pollVotesAlert$UserCell.a;
            org.telegram.ui.ActionBar.u5 u5Var = pollVotesAlert$UserCell.b;
            if (d22 instanceof TLRPC.User) {
                pollVotesAlert$UserCell.h = (TLRPC.User) d22;
                pollVotesAlert$UserCell.n = null;
            } else if (d22 instanceof TLRPC.Chat) {
                pollVotesAlert$UserCell.n = (TLRPC.Chat) d22;
                pollVotesAlert$UserCell.h = null;
            } else {
                pollVotesAlert$UserCell.h = null;
                pollVotesAlert$UserCell.n = null;
            }
            long j10 = i10;
            pollVotesAlert$UserCell.d.setText(org.telegram.messenger.cd.D0().o0().format(j10 * 1000));
            pollVotesAlert$UserCell.c.setText(org.telegram.messenger.cd.r(j10, true));
            pollVotesAlert$UserCell.s = z11;
            pollVotesAlert$UserCell.x = d22 == null;
            pollVotesAlert$UserCell.w = Q;
            if (d22 == null) {
                u5Var.l("", false);
                g9Var.setImageDrawable(null);
            } else {
                r8 r8Var = pollVotesAlert$UserCell.e;
                TLRPC.User user = pollVotesAlert$UserCell.h;
                if ((user == null || user.photo == null) && (chat = pollVotesAlert$UserCell.n) != null) {
                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                }
                if (user != null) {
                    r8Var.r(user);
                    TLRPC.UserStatus userStatus = pollVotesAlert$UserCell.h.status;
                } else {
                    TLRPC.Chat chat2 = pollVotesAlert$UserCell.n;
                    if (chat2 != null) {
                        r8Var.q(chat2);
                    }
                }
                TLRPC.User user2 = pollVotesAlert$UserCell.h;
                if (user2 != null) {
                    String p5 = org.telegram.messenger.h20.p(user2);
                    pollVotesAlert$UserCell.r = p5;
                    z10 = false;
                    pollVotesAlert$UserCell.r = org.telegram.messenger.k6.m(p5, u5Var.getPaint().getFontMetricsInt(), false, null, 0);
                } else {
                    z10 = false;
                    TLRPC.Chat chat3 = pollVotesAlert$UserCell.n;
                    if (chat3 != null) {
                        String str = chat3.title;
                        pollVotesAlert$UserCell.r = str;
                        pollVotesAlert$UserCell.r = org.telegram.messenger.k6.m(str, u5Var.getPaint().getFontMetricsInt(), false, null, 0);
                    } else {
                        pollVotesAlert$UserCell.r = "";
                    }
                }
                u5Var.l(pollVotesAlert$UserCell.r, z10);
                pv0 pv0Var = pollVotesAlert$UserCell.f;
                TLRPC.User user3 = pollVotesAlert$UserCell.h;
                TLRPC.Chat chat4 = pollVotesAlert$UserCell.n;
                int i11 = org.telegram.ui.ActionBar.t6.z9;
                tf0 tf0Var2 = pollVotesAlert$UserCell.E;
                mh.g gVar = tf0.I1;
                u5Var.i(pv0Var.b(user3, chat4, org.telegram.ui.ActionBar.t6.w0(i11, tf0Var2.I0), z10));
                TLRPC.Chat chat5 = pollVotesAlert$UserCell.n;
                if (chat5 != null) {
                    g9Var.e(chat5, r8Var);
                } else {
                    TLRPC.User user4 = pollVotesAlert$UserCell.h;
                    if (user4 != null) {
                        g9Var.e(user4, r8Var);
                    } else {
                        g9Var.setImageDrawable(r8Var);
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
                arrayList.add(ObjectAnimator.ofFloat(g9Var, (Property<g9, Float>) property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.D.add(ObjectAnimator.ofFloat(u5Var, (Property<org.telegram.ui.ActionBar.u5, Float>) property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.D.add(ObjectAnimator.ofFloat(pollVotesAlert$UserCell, tf0.I1, 1.0f, 0.0f));
            }
        }
    }
}
