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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class pe0 extends pj0 {
    public final Context r;
    public final /* synthetic */ te0 s;

    public pe0(te0 te0Var, Context context) {
        this.s = te0Var;
        this.r = context;
    }

    @Override // org.telegram.ui.Components.aj0
    public final String F(int i7) {
        return null;
    }

    @Override // org.telegram.ui.Components.aj0
    public final void G(uj0 uj0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.pj0
    public final int M(int i7) {
        int i10 = 1;
        if (i7 == 0) {
            return 1;
        }
        se0 se0Var = (se0) this.s.x1.get(i7 - 1);
        int b10 = se0Var.b() + 1;
        if (TextUtils.isEmpty(se0Var.c) && !se0Var.e) {
            i10 = 0;
        }
        return b10 + i10;
    }

    @Override // org.telegram.ui.Components.pj0
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
            te0 te0Var = this.s;
            if (i12 < te0Var.x1.size() && (i11 = i10 - 1) < ((se0) te0Var.x1.get(i12)).b()) {
                return Integer.valueOf(Objects.hash(Long.valueOf(org.telegram.messenger.m5.o(((TLRPC.MessagePeerVote) ((se0) te0Var.x1.get(i12)).b.get(i11)).peer))));
            }
        }
        return -182734;
    }

    @Override // org.telegram.ui.Components.pj0
    public final int P(int i7, int i10) {
        if (i7 == 0) {
            return 1;
        }
        if (i10 == 0) {
            return 2;
        }
        return i10 + (-1) < ((se0) this.s.x1.get(i7 + (-1))).b() ? 0 : 3;
    }

    @Override // org.telegram.ui.Components.pj0
    public final int R() {
        return this.s.x1.size() + 1;
    }

    @Override // org.telegram.ui.Components.pj0
    public final View T(int i7, View view) {
        TLRPC.Message message;
        te0 te0Var = this.s;
        TLRPC.Poll poll = te0Var.t1;
        org.telegram.messenger.gj gjVar = te0Var.s1;
        if (view == null) {
            view = new oe0(this, this.r);
        }
        re0 re0Var = (re0) view;
        if (i7 == 0) {
            re0Var.setAlpha(0.0f);
            return view;
        }
        view.setAlpha(1.0f);
        se0 se0Var = (se0) te0Var.x1.get(i7 - 1);
        int size = poll.answers.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i11);
            if (Arrays.equals(pollAnswer.option, se0Var.d) && ((qe0) te0Var.w1.get(se0Var)) != null) {
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
                re0Var.a(tL_textWithEntities == null ? "" : tL_textWithEntities.text, tL_textWithEntities == null ? null : tL_textWithEntities.entities, te0Var.K0(se0Var.d), se0Var.a, se0Var.a(), false);
                re0Var.setTag(R.id.object_tag, se0Var);
                return view;
            }
        }
        return view;
    }

    @Override // org.telegram.ui.Components.pj0
    public final boolean V(int i7, int i10, v4.e1 e1Var) {
        if (i7 == 0 || i10 == 0) {
            return false;
        }
        ArrayList arrayList = this.s.A1;
        return arrayList == null || arrayList.isEmpty();
    }

    @Override // org.telegram.ui.Components.pj0
    public final void W(int i7, int i10, v4.e1 e1Var) {
        TLRPC.Message message;
        te0 te0Var = this.s;
        TLRPC.Poll poll = te0Var.t1;
        ArrayList arrayList = te0Var.x1;
        org.telegram.messenger.gj gjVar = te0Var.s1;
        int i11 = e1Var.f;
        View view = e1Var.a;
        int i12 = 0;
        if (i11 != 2) {
            if (i11 != 3) {
                return;
            }
            se0 se0Var = (se0) arrayList.get(i7 - 1);
            ((org.telegram.ui.Cells.l8) view).o(R.drawable.arrow_more, org.telegram.messenger.hd.G(se0Var.a - se0Var.b(), "ShowVotes", new Object[0]), false);
            return;
        }
        re0 re0Var = (re0) view;
        se0 se0Var2 = (se0) arrayList.get(i7 - 1);
        ArrayList arrayList2 = se0Var2.b;
        byte[] bArr = se0Var2.d;
        int size = poll.answers.size();
        for (int i13 = 0; i13 < size; i13++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i13);
            if (Arrays.equals(pollAnswer.option, bArr) && ((qe0) te0Var.w1.get(se0Var2)) != null) {
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
                re0Var.a(tL_textWithEntities == null ? "" : tL_textWithEntities.text, tL_textWithEntities == null ? null : tL_textWithEntities.entities, te0Var.K0(bArr), se0Var2.a, se0Var2.a(), false);
                re0Var.setTag(R.id.object_tag, se0Var2);
                return;
            }
        }
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View view;
        te0 te0Var = this.s;
        View view2 = te0Var.y1;
        Context context = this.r;
        if (i7 == 0) {
            view = new PollVotesAlert$UserCell(te0Var, context);
        } else if (i7 == 1) {
            ViewParent parent = view2.getParent();
            view = view2;
            if (parent != null) {
                ((ViewGroup) view2.getParent()).removeView(view2);
                view = view2;
            }
        } else if (i7 != 2) {
            org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(23, context, true);
            l8Var.setOffsetFromImage(65);
            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.h5, l8Var, te0Var.J0);
            l8Var.g(org.telegram.ui.ActionBar.j6.N6, org.telegram.ui.ActionBar.j6.q6);
            view = l8Var;
        } else {
            View oe0Var = new oe0(this, context);
            oe0Var.setTag(-33024);
            view = oe0Var;
        }
        return new cj0(view);
    }

    @Override // v4.h0
    public final void y(v4.e1 e1Var) {
        TLRPC.Chat chat;
        boolean z10;
        if (e1Var.f == 0) {
            int b10 = e1Var.b();
            int S = S(b10);
            int Q = Q(b10) - 1;
            PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) e1Var.a;
            te0 te0Var = this.s;
            se0 se0Var = (se0) te0Var.x1.get(S - 1);
            TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) se0Var.b.get(Q);
            TLObject e22 = org.telegram.messenger.np.s1(te0Var.a).e2(org.telegram.messenger.m5.o(messagePeerVote.peer));
            int i7 = messagePeerVote.date;
            boolean z11 = (Q == se0Var.b() - 1 && TextUtils.isEmpty(se0Var.c) && !se0Var.e) ? false : true;
            i9 i9Var = pollVotesAlert$UserCell.a;
            org.telegram.ui.ActionBar.j5 j5Var = pollVotesAlert$UserCell.b;
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
            pollVotesAlert$UserCell.s = z11;
            pollVotesAlert$UserCell.x = e22 == null;
            pollVotesAlert$UserCell.w = Q;
            if (e22 == null) {
                j5Var.l("", false);
                i9Var.setImageDrawable(null);
            } else {
                t8 t8Var = pollVotesAlert$UserCell.e;
                TLRPC.User user = pollVotesAlert$UserCell.h;
                if ((user == null || user.photo == null) && (chat = pollVotesAlert$UserCell.n) != null) {
                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                }
                if (user != null) {
                    t8Var.r(user);
                    TLRPC.UserStatus userStatus = pollVotesAlert$UserCell.h.status;
                } else {
                    TLRPC.Chat chat2 = pollVotesAlert$UserCell.n;
                    if (chat2 != null) {
                        t8Var.q(chat2);
                    }
                }
                TLRPC.User user2 = pollVotesAlert$UserCell.h;
                if (user2 != null) {
                    String p10 = org.telegram.messenger.q10.p(user2);
                    pollVotesAlert$UserCell.r = p10;
                    z10 = false;
                    pollVotesAlert$UserCell.r = org.telegram.messenger.j6.m(p10, j5Var.getPaint().getFontMetricsInt(), false, null, 0);
                } else {
                    z10 = false;
                    TLRPC.Chat chat3 = pollVotesAlert$UserCell.n;
                    if (chat3 != null) {
                        String str = chat3.title;
                        pollVotesAlert$UserCell.r = str;
                        pollVotesAlert$UserCell.r = org.telegram.messenger.j6.m(str, j5Var.getPaint().getFontMetricsInt(), false, null, 0);
                    } else {
                        pollVotesAlert$UserCell.r = "";
                    }
                }
                j5Var.l(pollVotesAlert$UserCell.r, z10);
                pu0 pu0Var = pollVotesAlert$UserCell.f;
                TLRPC.User user3 = pollVotesAlert$UserCell.h;
                TLRPC.Chat chat4 = pollVotesAlert$UserCell.n;
                int i10 = org.telegram.ui.ActionBar.j6.z9;
                te0 te0Var2 = pollVotesAlert$UserCell.F;
                org.telegram.ui.Cells.n8 n8Var = te0.M1;
                j5Var.i(pu0Var.b(user3, chat4, org.telegram.ui.ActionBar.j6.w0(i10, te0Var2.J0), z10));
                TLRPC.Chat chat5 = pollVotesAlert$UserCell.n;
                if (chat5 != null) {
                    i9Var.f(chat5, t8Var);
                } else {
                    TLRPC.User user4 = pollVotesAlert$UserCell.h;
                    if (user4 != null) {
                        i9Var.f(user4, t8Var);
                    } else {
                        i9Var.setImageDrawable(t8Var);
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
                arrayList.add(ObjectAnimator.ofFloat(i9Var, (Property<i9, Float>) property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.E.add(ObjectAnimator.ofFloat(j5Var, (Property<org.telegram.ui.ActionBar.j5, Float>) property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.E.add(ObjectAnimator.ofFloat(pollVotesAlert$UserCell, te0.M1, 1.0f, 0.0f));
            }
        }
    }
}
