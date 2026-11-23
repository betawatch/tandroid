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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class bf0 extends zj0 {
    public final Context r;
    public final /* synthetic */ ff0 s;

    public bf0(ff0 ff0Var, Context context) {
        this.s = ff0Var;
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
        ef0 ef0Var = (ef0) this.s.x1.get(i7 - 1);
        int b10 = ef0Var.b() + 1;
        if (TextUtils.isEmpty(ef0Var.c) && !ef0Var.e) {
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
            ff0 ff0Var = this.s;
            if (i12 < ff0Var.x1.size() && (i11 = i10 - 1) < ((ef0) ff0Var.x1.get(i12)).b()) {
                return Integer.valueOf(Objects.hash(Long.valueOf(org.telegram.messenger.n5.o(((TLRPC.MessagePeerVote) ((ef0) ff0Var.x1.get(i12)).b.get(i11)).peer))));
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
        return i10 + (-1) < ((ef0) this.s.x1.get(i7 + (-1))).b() ? 0 : 3;
    }

    @Override // org.telegram.ui.Components.zj0
    public final int R() {
        return this.s.x1.size() + 1;
    }

    @Override // org.telegram.ui.Components.zj0
    public final View T(int i7, View view) {
        TLRPC.Message message;
        ff0 ff0Var = this.s;
        TLRPC.Poll poll = ff0Var.t1;
        org.telegram.messenger.gj gjVar = ff0Var.s1;
        if (view == null) {
            view = new af0(this, this.r);
        }
        df0 df0Var = (df0) view;
        if (i7 == 0) {
            df0Var.setAlpha(0.0f);
            return view;
        }
        view.setAlpha(1.0f);
        ef0 ef0Var = (ef0) ff0Var.x1.get(i7 - 1);
        int size = poll.answers.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i11);
            if (Arrays.equals(pollAnswer.option, ef0Var.d) && ((cf0) ff0Var.w1.get(ef0Var)) != null) {
                TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                if (gjVar != null && gjVar.L2 && (message = gjVar.k) != null && message.translatedPoll != null) {
                    while (true) {
                        if (i10 >= gjVar.k.translatedPoll.b.size()) {
                            break;
                        }
                        TLRPC.PollAnswer pollAnswer2 = (TLRPC.PollAnswer) gjVar.k.translatedPoll.b.get(i10);
                        if (Arrays.equals(pollAnswer2.option, pollAnswer.option)) {
                            tL_textWithEntities = pollAnswer2.text;
                            break;
                        }
                        i10++;
                    }
                }
                df0Var.a(tL_textWithEntities == null ? "" : tL_textWithEntities.text, tL_textWithEntities == null ? null : tL_textWithEntities.entities, ff0Var.L0(ef0Var.d), ef0Var.a, ef0Var.a(), false);
                df0Var.setTag(R.id.object_tag, ef0Var);
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
        ff0 ff0Var = this.s;
        TLRPC.Poll poll = ff0Var.t1;
        ArrayList arrayList = ff0Var.x1;
        org.telegram.messenger.gj gjVar = ff0Var.s1;
        int i11 = f1Var.f;
        View view = f1Var.a;
        int i12 = 0;
        if (i11 != 2) {
            if (i11 != 3) {
                return;
            }
            ef0 ef0Var = (ef0) arrayList.get(i7 - 1);
            ((org.telegram.ui.Cells.n8) view).o(R.drawable.arrow_more, org.telegram.messenger.hd.G(ef0Var.a - ef0Var.b(), "ShowVotes", new Object[0]), false);
            return;
        }
        df0 df0Var = (df0) view;
        ef0 ef0Var2 = (ef0) arrayList.get(i7 - 1);
        ArrayList arrayList2 = ef0Var2.b;
        byte[] bArr = ef0Var2.d;
        int size = poll.answers.size();
        for (int i13 = 0; i13 < size; i13++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i13);
            if (Arrays.equals(pollAnswer.option, bArr) && ((cf0) ff0Var.w1.get(ef0Var2)) != null) {
                TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                if (gjVar != null && gjVar.L2 && (message = gjVar.k) != null && message.translatedPoll != null) {
                    while (true) {
                        if (i12 >= gjVar.k.translatedPoll.b.size()) {
                            break;
                        }
                        TLRPC.PollAnswer pollAnswer2 = (TLRPC.PollAnswer) gjVar.k.translatedPoll.b.get(i12);
                        if (Arrays.equals(pollAnswer2.option, pollAnswer.option)) {
                            tL_textWithEntities = pollAnswer2.text;
                            break;
                        }
                        i12++;
                    }
                }
                df0Var.a(tL_textWithEntities == null ? "" : tL_textWithEntities.text, tL_textWithEntities == null ? null : tL_textWithEntities.entities, ff0Var.L0(bArr), ef0Var2.a, ef0Var2.a(), false);
                df0Var.setTag(R.id.object_tag, ef0Var2);
                return;
            }
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View view;
        ff0 ff0Var = this.s;
        View view2 = ff0Var.y1;
        Context context = this.r;
        if (i7 == 0) {
            view = new PollVotesAlert$UserCell(ff0Var, context);
        } else if (i7 == 1) {
            ViewParent parent = view2.getParent();
            view = view2;
            if (parent != null) {
                ((ViewGroup) view2.getParent()).removeView(view2);
                view = view2;
            }
        } else if (i7 != 2) {
            org.telegram.ui.Cells.n8 n8Var = new org.telegram.ui.Cells.n8(23, context, true);
            n8Var.setOffsetFromImage(65);
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.h5, n8Var, ff0Var.J0);
            n8Var.g(org.telegram.ui.ActionBar.m6.N6, org.telegram.ui.ActionBar.m6.q6);
            view = n8Var;
        } else {
            View af0Var = new af0(this, context);
            af0Var.setTag(-33024);
            view = af0Var;
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
            ff0 ff0Var = this.s;
            ef0 ef0Var = (ef0) ff0Var.x1.get(S - 1);
            TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) ef0Var.b.get(Q);
            TLObject g22 = org.telegram.messenger.np.u1(ff0Var.a).g2(org.telegram.messenger.n5.o(messagePeerVote.peer));
            int i7 = messagePeerVote.date;
            boolean z11 = (Q == ef0Var.b() - 1 && TextUtils.isEmpty(ef0Var.c) && !ef0Var.e) ? false : true;
            q9 q9Var = pollVotesAlert$UserCell.a;
            org.telegram.ui.ActionBar.m5 m5Var = pollVotesAlert$UserCell.b;
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
            pollVotesAlert$UserCell.d.setText(org.telegram.messenger.hd.E0().p0().format(j3 * 1000));
            pollVotesAlert$UserCell.c.setText(org.telegram.messenger.hd.r(j3, true));
            pollVotesAlert$UserCell.s = z11;
            pollVotesAlert$UserCell.x = g22 == null;
            pollVotesAlert$UserCell.w = Q;
            if (g22 == null) {
                m5Var.l("", false);
                q9Var.setImageDrawable(null);
            } else {
                b9 b9Var = pollVotesAlert$UserCell.e;
                TLRPC.User user = pollVotesAlert$UserCell.h;
                if ((user == null || user.photo == null) && (chat = pollVotesAlert$UserCell.n) != null) {
                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                }
                if (user != null) {
                    b9Var.r(user);
                    TLRPC.UserStatus userStatus = pollVotesAlert$UserCell.h.status;
                } else {
                    TLRPC.Chat chat2 = pollVotesAlert$UserCell.n;
                    if (chat2 != null) {
                        b9Var.q(chat2);
                    }
                }
                TLRPC.User user2 = pollVotesAlert$UserCell.h;
                if (user2 != null) {
                    String q10 = org.telegram.messenger.p10.q(user2);
                    pollVotesAlert$UserCell.r = q10;
                    z10 = false;
                    pollVotesAlert$UserCell.r = org.telegram.messenger.j6.m(q10, m5Var.getPaint().getFontMetricsInt(), false, null, 0);
                } else {
                    z10 = false;
                    TLRPC.Chat chat3 = pollVotesAlert$UserCell.n;
                    if (chat3 != null) {
                        String str = chat3.title;
                        pollVotesAlert$UserCell.r = str;
                        pollVotesAlert$UserCell.r = org.telegram.messenger.j6.m(str, m5Var.getPaint().getFontMetricsInt(), false, null, 0);
                    } else {
                        pollVotesAlert$UserCell.r = "";
                    }
                }
                m5Var.l(pollVotesAlert$UserCell.r, z10);
                av0 av0Var = pollVotesAlert$UserCell.f;
                TLRPC.User user3 = pollVotesAlert$UserCell.h;
                TLRPC.Chat chat4 = pollVotesAlert$UserCell.n;
                int i10 = org.telegram.ui.ActionBar.m6.z9;
                ff0 ff0Var2 = pollVotesAlert$UserCell.F;
                org.telegram.ui.Cells.p8 p8Var = ff0.M1;
                m5Var.i(av0Var.b(user3, chat4, org.telegram.ui.ActionBar.m6.w0(i10, ff0Var2.J0), z10));
                TLRPC.Chat chat5 = pollVotesAlert$UserCell.n;
                if (chat5 != null) {
                    q9Var.f(chat5, b9Var);
                } else {
                    TLRPC.User user4 = pollVotesAlert$UserCell.h;
                    if (user4 != null) {
                        q9Var.f(user4, b9Var);
                    } else {
                        q9Var.setImageDrawable(b9Var);
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
                arrayList.add(ObjectAnimator.ofFloat(q9Var, (Property<q9, Float>) property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.E.add(ObjectAnimator.ofFloat(m5Var, (Property<org.telegram.ui.ActionBar.m5, Float>) property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.E.add(ObjectAnimator.ofFloat(pollVotesAlert$UserCell, ff0.M1, 1.0f, 0.0f));
            }
        }
    }
}
