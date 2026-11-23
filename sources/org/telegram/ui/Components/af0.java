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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class af0 extends zj0 {
    public final Context r;
    public final /* synthetic */ ef0 s;

    public af0(ef0 ef0Var, Context context) {
        this.s = ef0Var;
        this.r = context;
    }

    @Override // org.telegram.ui.Components.kj0
    public final String F(int i7) {
        return null;
    }

    @Override // org.telegram.ui.Components.kj0
    public final void G(ek0 ek0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.zj0
    public final int M(int i7) {
        int i10 = 1;
        if (i7 == 0) {
            return 1;
        }
        df0 df0Var = (df0) this.s.x1.get(i7 - 1);
        int b10 = df0Var.b() + 1;
        if (TextUtils.isEmpty(df0Var.c) && !df0Var.e) {
            i10 = 0;
        }
        return b10 + i10;
    }

    @Override // org.telegram.ui.Components.zj0
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
            ef0 ef0Var = this.s;
            if (i12 < ef0Var.x1.size() && (i11 = i10 - 1) < ((df0) ef0Var.x1.get(i12)).b()) {
                return Integer.valueOf(Objects.hash(Long.valueOf(org.telegram.messenger.n5.o(((TLRPC.MessagePeerVote) ((df0) ef0Var.x1.get(i12)).b.get(i11)).peer))));
            }
        }
        return -182734;
    }

    @Override // org.telegram.ui.Components.zj0
    public final int P(int i7, int i10) {
        if (i7 == 0) {
            return 1;
        }
        if (i10 == 0) {
            return 2;
        }
        return i10 + (-1) < ((df0) this.s.x1.get(i7 + (-1))).b() ? 0 : 3;
    }

    @Override // org.telegram.ui.Components.zj0
    public final int R() {
        return this.s.x1.size() + 1;
    }

    @Override // org.telegram.ui.Components.zj0
    public final View T(int i7, View view) {
        TLRPC.Message message;
        ef0 ef0Var = this.s;
        TLRPC.Poll poll = ef0Var.t1;
        org.telegram.messenger.fj fjVar = ef0Var.s1;
        if (view == null) {
            view = new ze0(this, this.r);
        }
        cf0 cf0Var = (cf0) view;
        if (i7 == 0) {
            cf0Var.setAlpha(0.0f);
            return view;
        }
        view.setAlpha(1.0f);
        df0 df0Var = (df0) ef0Var.x1.get(i7 - 1);
        int size = poll.answers.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i11);
            if (Arrays.equals(pollAnswer.option, df0Var.d) && ((bf0) ef0Var.w1.get(df0Var)) != null) {
                TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                if (fjVar != null && fjVar.L2 && (message = fjVar.k) != null && message.translatedPoll != null) {
                    while (true) {
                        if (i10 >= fjVar.k.translatedPoll.b.size()) {
                            break;
                        }
                        TLRPC.PollAnswer pollAnswer2 = (TLRPC.PollAnswer) fjVar.k.translatedPoll.b.get(i10);
                        if (Arrays.equals(pollAnswer2.option, pollAnswer.option)) {
                            tL_textWithEntities = pollAnswer2.text;
                            break;
                        }
                        i10++;
                    }
                }
                cf0Var.a(tL_textWithEntities == null ? "" : tL_textWithEntities.text, tL_textWithEntities == null ? null : tL_textWithEntities.entities, ef0Var.L0(df0Var.d), df0Var.a, df0Var.a(), false);
                cf0Var.setTag(R.id.object_tag, df0Var);
                return view;
            }
        }
        return view;
    }

    @Override // org.telegram.ui.Components.zj0
    public final boolean V(int i7, int i10, v4.f1 f1Var) {
        if (i7 == 0 || i10 == 0) {
            return false;
        }
        ArrayList arrayList = this.s.A1;
        return arrayList == null || arrayList.isEmpty();
    }

    @Override // org.telegram.ui.Components.zj0
    public final void W(int i7, int i10, v4.f1 f1Var) {
        TLRPC.Message message;
        ef0 ef0Var = this.s;
        TLRPC.Poll poll = ef0Var.t1;
        ArrayList arrayList = ef0Var.x1;
        org.telegram.messenger.fj fjVar = ef0Var.s1;
        int i11 = f1Var.f;
        View view = f1Var.a;
        int i12 = 0;
        if (i11 != 2) {
            if (i11 != 3) {
                return;
            }
            df0 df0Var = (df0) arrayList.get(i7 - 1);
            ((org.telegram.ui.Cells.m8) view).o(R.drawable.arrow_more, org.telegram.messenger.gd.G(df0Var.a - df0Var.b(), "ShowVotes", new Object[0]), false);
            return;
        }
        cf0 cf0Var = (cf0) view;
        df0 df0Var2 = (df0) arrayList.get(i7 - 1);
        ArrayList arrayList2 = df0Var2.b;
        byte[] bArr = df0Var2.d;
        int size = poll.answers.size();
        for (int i13 = 0; i13 < size; i13++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i13);
            if (Arrays.equals(pollAnswer.option, bArr) && ((bf0) ef0Var.w1.get(df0Var2)) != null) {
                TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                if (fjVar != null && fjVar.L2 && (message = fjVar.k) != null && message.translatedPoll != null) {
                    while (true) {
                        if (i12 >= fjVar.k.translatedPoll.b.size()) {
                            break;
                        }
                        TLRPC.PollAnswer pollAnswer2 = (TLRPC.PollAnswer) fjVar.k.translatedPoll.b.get(i12);
                        if (Arrays.equals(pollAnswer2.option, pollAnswer.option)) {
                            tL_textWithEntities = pollAnswer2.text;
                            break;
                        }
                        i12++;
                    }
                }
                cf0Var.a(tL_textWithEntities == null ? "" : tL_textWithEntities.text, tL_textWithEntities == null ? null : tL_textWithEntities.entities, ef0Var.L0(bArr), df0Var2.a, df0Var2.a(), false);
                cf0Var.setTag(R.id.object_tag, df0Var2);
                return;
            }
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View view;
        ef0 ef0Var = this.s;
        View view2 = ef0Var.y1;
        Context context = this.r;
        if (i7 == 0) {
            view = new PollVotesAlert$UserCell(ef0Var, context);
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
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.h5, m8Var, ef0Var.J0);
            m8Var.g(org.telegram.ui.ActionBar.n6.N6, org.telegram.ui.ActionBar.n6.q6);
            view = m8Var;
        } else {
            View ze0Var = new ze0(this, context);
            ze0Var.setTag(-33024);
            view = ze0Var;
        }
        return new mj0(view);
    }

    @Override // v4.i0
    public final void y(v4.f1 f1Var) {
        TLRPC.Chat chat;
        boolean z10;
        if (f1Var.f == 0) {
            int b10 = f1Var.b();
            int S = S(b10);
            int Q = Q(b10) - 1;
            PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) f1Var.a;
            ef0 ef0Var = this.s;
            df0 df0Var = (df0) ef0Var.x1.get(S - 1);
            TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) df0Var.b.get(Q);
            TLObject g22 = org.telegram.messenger.mp.u1(ef0Var.a).g2(org.telegram.messenger.n5.o(messagePeerVote.peer));
            int i7 = messagePeerVote.date;
            boolean z11 = (Q == df0Var.b() - 1 && TextUtils.isEmpty(df0Var.c) && !df0Var.e) ? false : true;
            p9 p9Var = pollVotesAlert$UserCell.a;
            org.telegram.ui.ActionBar.n5 n5Var = pollVotesAlert$UserCell.b;
            if (g22 instanceof TLRPC.User) {
                pollVotesAlert$UserCell.h = (TLRPC.User) g22;
                pollVotesAlert$UserCell.n = null;
            } else if (g22 instanceof TLRPC.Chat) {
                pollVotesAlert$UserCell.n = (TLRPC.Chat) g22;
                pollVotesAlert$UserCell.h = null;
            } else {
                pollVotesAlert$UserCell.h = null;
                pollVotesAlert$UserCell.n = null;
            }
            long j3 = i7;
            pollVotesAlert$UserCell.d.setText(org.telegram.messenger.gd.E0().p0().format(j3 * 1000));
            pollVotesAlert$UserCell.c.setText(org.telegram.messenger.gd.r(j3, true));
            pollVotesAlert$UserCell.s = z11;
            pollVotesAlert$UserCell.x = g22 == null;
            pollVotesAlert$UserCell.w = Q;
            if (g22 == null) {
                n5Var.l("", false);
                p9Var.setImageDrawable(null);
            } else {
                a9 a9Var = pollVotesAlert$UserCell.e;
                TLRPC.User user = pollVotesAlert$UserCell.h;
                if ((user == null || user.photo == null) && (chat = pollVotesAlert$UserCell.n) != null) {
                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                }
                if (user != null) {
                    a9Var.r(user);
                    TLRPC.UserStatus userStatus = pollVotesAlert$UserCell.h.status;
                } else {
                    TLRPC.Chat chat2 = pollVotesAlert$UserCell.n;
                    if (chat2 != null) {
                        a9Var.q(chat2);
                    }
                }
                TLRPC.User user2 = pollVotesAlert$UserCell.h;
                if (user2 != null) {
                    String q10 = org.telegram.messenger.n10.q(user2);
                    pollVotesAlert$UserCell.r = q10;
                    z10 = false;
                    pollVotesAlert$UserCell.r = org.telegram.messenger.j6.m(q10, n5Var.getPaint().getFontMetricsInt(), false, null, 0);
                } else {
                    z10 = false;
                    TLRPC.Chat chat3 = pollVotesAlert$UserCell.n;
                    if (chat3 != null) {
                        String str = chat3.title;
                        pollVotesAlert$UserCell.r = str;
                        pollVotesAlert$UserCell.r = org.telegram.messenger.j6.m(str, n5Var.getPaint().getFontMetricsInt(), false, null, 0);
                    } else {
                        pollVotesAlert$UserCell.r = "";
                    }
                }
                n5Var.l(pollVotesAlert$UserCell.r, z10);
                zu0 zu0Var = pollVotesAlert$UserCell.f;
                TLRPC.User user3 = pollVotesAlert$UserCell.h;
                TLRPC.Chat chat4 = pollVotesAlert$UserCell.n;
                int i10 = org.telegram.ui.ActionBar.n6.z9;
                ef0 ef0Var2 = pollVotesAlert$UserCell.F;
                org.telegram.ui.Cells.o8 o8Var = ef0.M1;
                n5Var.i(zu0Var.b(user3, chat4, org.telegram.ui.ActionBar.n6.w0(i10, ef0Var2.J0), z10));
                TLRPC.Chat chat5 = pollVotesAlert$UserCell.n;
                if (chat5 != null) {
                    p9Var.f(chat5, a9Var);
                } else {
                    TLRPC.User user4 = pollVotesAlert$UserCell.h;
                    if (user4 != null) {
                        p9Var.f(user4, a9Var);
                    } else {
                        p9Var.setImageDrawable(a9Var);
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
                arrayList.add(ObjectAnimator.ofFloat(p9Var, (Property<p9, Float>) property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.E.add(ObjectAnimator.ofFloat(n5Var, (Property<org.telegram.ui.ActionBar.n5, Float>) property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.E.add(ObjectAnimator.ofFloat(pollVotesAlert$UserCell, ef0.M1, 1.0f, 0.0f));
            }
        }
    }
}
