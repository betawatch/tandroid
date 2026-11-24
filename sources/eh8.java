// default package

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
import org.telegram.ui.Components.PollVotesAlert$UserCell;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class eh8 extends m59 {
    public final Context r;
    public final /* synthetic */ ih8 s;

    public eh8(ih8 ih8Var, Context context) {
        this.s = ih8Var;
        this.r = context;
    }

    @Override // z49
    public final String F(int i) {
        return null;
    }

    @Override // z49
    public final void G(r59 r59Var, float f, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // m59
    public final int M(int i) {
        int i2 = 1;
        if (i == 0) {
            return 1;
        }
        hh8 hh8Var = (hh8) this.s.w1.get(i - 1);
        int b = hh8Var.b() + 1;
        if (TextUtils.isEmpty(hh8Var.c) && !hh8Var.e) {
            i2 = 0;
        }
        return b + i2;
    }

    @Override // m59
    public final Object O(int i, int i2) {
        int i3;
        ArrayList arrayList = this.s.w1;
        if (i == 0) {
            return 293145;
        }
        int i4 = i - 1;
        if (i2 == 0) {
            return -928312;
        }
        if (i4 < 0 || i4 >= arrayList.size() || (i3 = i2 - 1) >= ((hh8) arrayList.get(i4)).b()) {
            return -182734;
        }
        return Integer.valueOf(Objects.hash(Long.valueOf(pg3.n(((TLRPC.MessagePeerVote) ((hh8) arrayList.get(i4)).b.get(i3)).peer))));
    }

    @Override // m59
    public final int P(int i, int i2) {
        if (i == 0) {
            return 1;
        }
        if (i2 == 0) {
            return 2;
        }
        return i2 + (-1) < ((hh8) this.s.w1.get(i + (-1))).b() ? 0 : 3;
    }

    @Override // m59
    public final int R() {
        return this.s.w1.size() + 1;
    }

    @Override // m59
    public final View T(int i, View view) {
        ArrayList<TLRPC.MessageEntity> arrayList;
        String str;
        TLRPC.Message message;
        ih8 ih8Var = this.s;
        TLRPC.Poll poll = ih8Var.s1;
        k47 k47Var = ih8Var.r1;
        if (view == null) {
            view = new dh8(this, this.r);
        }
        gh8 gh8Var = (gh8) view;
        if (i == 0) {
            gh8Var.setAlpha(0.0f);
            return view;
        }
        view.setAlpha(1.0f);
        hh8 hh8Var = (hh8) ih8Var.w1.get(i - 1);
        int size = poll.answers.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i3);
            if (Arrays.equals(pollAnswer.option, hh8Var.d) && ((fh8) ih8Var.v1.get(hh8Var)) != null) {
                TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                if (k47Var != null && k47Var.L2 && (message = k47Var.k) != null && message.translatedPoll != null) {
                    while (true) {
                        if (i2 >= k47Var.k.translatedPoll.b.size()) {
                            break;
                        }
                        TLRPC.PollAnswer pollAnswer2 = (TLRPC.PollAnswer) k47Var.k.translatedPoll.b.get(i2);
                        if (Arrays.equals(pollAnswer2.option, pollAnswer.option)) {
                            tL_textWithEntities = pollAnswer2.text;
                            break;
                        }
                        i2++;
                    }
                }
                if (tL_textWithEntities == null) {
                    str = "";
                    arrayList = null;
                } else {
                    String str2 = tL_textWithEntities.text;
                    arrayList = tL_textWithEntities.entities;
                    str = str2;
                }
                gh8Var.a(str, arrayList, ih8Var.E0(hh8Var.d), hh8Var.a, hh8Var.a(), false);
                gh8Var.setTag(R.id.object_tag, hh8Var);
                return view;
            }
        }
        return view;
    }

    @Override // m59
    public final boolean V(int i, int i2, u69 u69Var) {
        if (i == 0 || i2 == 0) {
            return false;
        }
        ArrayList arrayList = this.s.z1;
        return arrayList == null || arrayList.isEmpty();
    }

    @Override // m59
    public final void W(int i, int i2, u69 u69Var) {
        ArrayList<TLRPC.MessageEntity> arrayList;
        String str;
        TLRPC.Message message;
        ih8 ih8Var = this.s;
        TLRPC.Poll poll = ih8Var.s1;
        ArrayList arrayList2 = ih8Var.w1;
        k47 k47Var = ih8Var.r1;
        int i3 = u69Var.f;
        View view = u69Var.a;
        int i4 = 0;
        if (i3 != 2) {
            if (i3 == 3) {
                hh8 hh8Var = (hh8) arrayList2.get(i - 1);
                ((xib) view).o(R.drawable.arrow_more, jb6.G(hh8Var.a - hh8Var.b(), "ShowVotes", new Object[0]), false);
                return;
            }
            return;
        }
        gh8 gh8Var = (gh8) view;
        hh8 hh8Var2 = (hh8) arrayList2.get(i - 1);
        ArrayList arrayList3 = hh8Var2.b;
        byte[] bArr = hh8Var2.d;
        int size = poll.answers.size();
        for (int i5 = 0; i5 < size; i5++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i5);
            if (Arrays.equals(pollAnswer.option, bArr) && ((fh8) ih8Var.v1.get(hh8Var2)) != null) {
                TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                if (k47Var != null && k47Var.L2 && (message = k47Var.k) != null && message.translatedPoll != null) {
                    while (true) {
                        if (i4 >= k47Var.k.translatedPoll.b.size()) {
                            break;
                        }
                        TLRPC.PollAnswer pollAnswer2 = (TLRPC.PollAnswer) k47Var.k.translatedPoll.b.get(i4);
                        if (Arrays.equals(pollAnswer2.option, pollAnswer.option)) {
                            tL_textWithEntities = pollAnswer2.text;
                            break;
                        }
                        i4++;
                    }
                }
                if (tL_textWithEntities == null) {
                    str = "";
                    arrayList = null;
                } else {
                    String str2 = tL_textWithEntities.text;
                    arrayList = tL_textWithEntities.entities;
                    str = str2;
                }
                gh8Var.a(str, arrayList, ih8Var.E0(bArr), hh8Var2.a, hh8Var2.a(), false);
                gh8Var.setTag(R.id.object_tag, hh8Var2);
                return;
            }
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        View view;
        ih8 ih8Var = this.s;
        View view2 = ih8Var.x1;
        Context context = this.r;
        if (i == 0) {
            view = new PollVotesAlert$UserCell(ih8Var, context);
        } else if (i == 1) {
            ViewParent parent = view2.getParent();
            view = view2;
            if (parent != null) {
                ((ViewGroup) view2.getParent()).removeView(view2);
                view = view2;
            }
        } else if (i != 2) {
            xib xibVar = new xib(23, context, true);
            xibVar.setOffsetFromImage(65);
            anb.h(cmb.g5, ih8Var.J0, xibVar);
            xibVar.g(cmb.M6, cmb.p6);
            view = xibVar;
        } else {
            View dh8Var = new dh8(this, context);
            dh8Var.setTag(-33024);
            view = dh8Var;
        }
        return new b59(view);
    }

    @Override // y59
    public final void y(u69 u69Var) {
        if (u69Var.f == 0) {
            int b = u69Var.b();
            int S = S(b);
            int Q = Q(b) - 1;
            PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) u69Var.a;
            ih8 ih8Var = this.s;
            hh8 hh8Var = (hh8) ih8Var.w1.get(S - 1);
            TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) hh8Var.b.get(Q);
            TLObject a2 = oc7.r1(ih8Var.a).a2(pg3.n(messagePeerVote.peer));
            int i = messagePeerVote.date;
            boolean z = (Q == hh8Var.b() - 1 && TextUtils.isEmpty(hh8Var.c) && !hh8Var.e) ? false : true;
            bf0 bf0Var = pollVotesAlert$UserCell.a;
            lka lkaVar = pollVotesAlert$UserCell.b;
            if (a2 instanceof TLRPC.User) {
                pollVotesAlert$UserCell.h = (TLRPC.User) a2;
                pollVotesAlert$UserCell.n = null;
            } else if (a2 instanceof TLRPC.Chat) {
                pollVotesAlert$UserCell.n = (TLRPC.Chat) a2;
                pollVotesAlert$UserCell.h = null;
            } else {
                pollVotesAlert$UserCell.h = null;
                pollVotesAlert$UserCell.n = null;
            }
            long j = i;
            pollVotesAlert$UserCell.d.setText(jb6.D0().o0().format(1000 * j));
            pollVotesAlert$UserCell.c.setText(jb6.r(j, true));
            pollVotesAlert$UserCell.s = z;
            pollVotesAlert$UserCell.x = a2 == null;
            pollVotesAlert$UserCell.w = Q;
            if (a2 == null) {
                lkaVar.l("", false);
                bf0Var.setImageDrawable(null);
            } else {
                pc0 pc0Var = pollVotesAlert$UserCell.e;
                TLRPC.User user = pollVotesAlert$UserCell.h;
                if (user != null) {
                    pc0Var.q(user);
                    TLRPC.UserStatus userStatus = pollVotesAlert$UserCell.h.status;
                } else {
                    TLRPC.Chat chat = pollVotesAlert$UserCell.n;
                    if (chat != null) {
                        pc0Var.p(chat);
                    }
                }
                TLRPC.User user2 = pollVotesAlert$UserCell.h;
                if (user2 != null) {
                    String r = m9c.r(user2);
                    pollVotesAlert$UserCell.r = r;
                    pollVotesAlert$UserCell.r = b10.e(lkaVar, r, false, null, 0);
                } else {
                    TLRPC.Chat chat2 = pollVotesAlert$UserCell.n;
                    if (chat2 != null) {
                        String str = chat2.title;
                        pollVotesAlert$UserCell.r = str;
                        pollVotesAlert$UserCell.r = b10.e(lkaVar, str, false, null, 0);
                    } else {
                        pollVotesAlert$UserCell.r = "";
                    }
                }
                lkaVar.l(pollVotesAlert$UserCell.r, false);
                d0b d0bVar = pollVotesAlert$UserCell.f;
                TLRPC.User user3 = pollVotesAlert$UserCell.h;
                TLRPC.Chat chat3 = pollVotesAlert$UserCell.n;
                int i2 = cmb.y9;
                ih8 ih8Var2 = pollVotesAlert$UserCell.F;
                pn pnVar = ih8.L1;
                lkaVar.i(d0bVar.b(user3, chat3, cmb.v0(i2, ih8Var2.J0), false));
                TLRPC.Chat chat4 = pollVotesAlert$UserCell.n;
                if (chat4 != null) {
                    bf0Var.f(chat4, pc0Var);
                } else {
                    TLRPC.User user4 = pollVotesAlert$UserCell.h;
                    if (user4 != null) {
                        bf0Var.f(user4, pc0Var);
                    } else {
                        bf0Var.setImageDrawable(pc0Var);
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
                arrayList.add(ObjectAnimator.ofFloat(bf0Var, (Property<bf0, Float>) property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.E.add(ObjectAnimator.ofFloat(lkaVar, (Property<lka, Float>) property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.E.add(ObjectAnimator.ofFloat(pollVotesAlert$UserCell, ih8.L1, 1.0f, 0.0f));
            }
        }
    }
}
