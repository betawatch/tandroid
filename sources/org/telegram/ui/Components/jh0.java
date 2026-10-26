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
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class jh0 extends hm0 {
    public final Context r;
    public final /* synthetic */ nh0 s;

    public jh0(nh0 nh0Var, Context context) {
        this.s = nh0Var;
        this.r = context;
    }

    @Override // org.telegram.ui.Components.tl0
    public final String F(int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.tl0
    public final void G(mm0 mm0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.hm0
    public final int M(int i10) {
        int i11 = 1;
        if (i10 == 0) {
            return 1;
        }
        mh0 mh0Var = (mh0) this.s.x.get(i10 - 1);
        int b10 = mh0Var.b() + 1;
        if (TextUtils.isEmpty(mh0Var.c) && !mh0Var.e) {
            i11 = 0;
        }
        return b10 + i11;
    }

    @Override // org.telegram.ui.Components.hm0
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
            nh0 nh0Var = this.s;
            if (i13 < nh0Var.x.size() && (i12 = i11 - 1) < ((mh0) nh0Var.x.get(i13)).b()) {
                return Integer.valueOf(Objects.hash(Long.valueOf(DialogObject.getPeerDialogId(((TLRPC.MessagePeerVote) ((mh0) nh0Var.x.get(i13)).b.get(i12)).peer))));
            }
        }
        return -182734;
    }

    @Override // org.telegram.ui.Components.hm0
    public final int P(int i10, int i11) {
        if (i10 == 0) {
            return 1;
        }
        if (i11 == 0) {
            return 2;
        }
        return i11 + (-1) < ((mh0) this.s.x.get(i10 + (-1))).b() ? 0 : 3;
    }

    @Override // org.telegram.ui.Components.hm0
    public final int R() {
        return this.s.x.size() + 1;
    }

    @Override // org.telegram.ui.Components.hm0
    public final View T(int i10, View view) {
        TLRPC.Message message;
        nh0 nh0Var = this.s;
        TLRPC.Poll poll = nh0Var.r;
        MessageObject messageObject = nh0Var.n;
        if (view == null) {
            view = new ih0(this, this.r);
        }
        lh0 lh0Var = (lh0) view;
        if (i10 == 0) {
            lh0Var.setAlpha(0.0f);
            return view;
        }
        view.setAlpha(1.0f);
        mh0 mh0Var = (mh0) nh0Var.x.get(i10 - 1);
        int size = poll.answers.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i12);
            if (Arrays.equals(pollAnswer.option, mh0Var.d) && ((kh0) nh0Var.w.get(mh0Var)) != null) {
                TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                if (messageObject != null && messageObject.translated && (message = messageObject.messageOwner) != null && message.translatedPoll != null) {
                    while (true) {
                        if (i11 >= messageObject.messageOwner.translatedPoll.answers.size()) {
                            break;
                        }
                        TLRPC.PollAnswer pollAnswer2 = messageObject.messageOwner.translatedPoll.answers.get(i11);
                        if (Arrays.equals(pollAnswer2.option, pollAnswer.option)) {
                            tL_textWithEntities = pollAnswer2.text;
                            break;
                        }
                        i11++;
                    }
                }
                lh0Var.a(tL_textWithEntities == null ? "" : tL_textWithEntities.text, tL_textWithEntities == null ? null : tL_textWithEntities.entities, nh0Var.R(mh0Var.d), mh0Var.a, mh0Var.a(), false);
                lh0Var.setTag(R.id.object_tag, mh0Var);
                return view;
            }
        }
        return view;
    }

    @Override // org.telegram.ui.Components.hm0
    public final boolean V(int i10, int i11, s4.e1 e1Var) {
        if (i10 == 0 || i11 == 0) {
            return false;
        }
        ArrayList arrayList = this.s.F;
        return arrayList == null || arrayList.isEmpty();
    }

    @Override // org.telegram.ui.Components.hm0
    public final void W(int i10, int i11, s4.e1 e1Var) {
        TLRPC.Message message;
        nh0 nh0Var = this.s;
        TLRPC.Poll poll = nh0Var.r;
        ArrayList arrayList = nh0Var.x;
        MessageObject messageObject = nh0Var.n;
        int i12 = e1Var.f;
        View view = e1Var.a;
        int i13 = 0;
        if (i12 != 2) {
            if (i12 != 3) {
                return;
            }
            mh0 mh0Var = (mh0) arrayList.get(i10 - 1);
            ((org.telegram.ui.Cells.v8) view).o(R.drawable.arrow_more, LocaleController.formatPluralString("ShowVotes", mh0Var.a - mh0Var.b(), new Object[0]), false);
            return;
        }
        lh0 lh0Var = (lh0) view;
        mh0 mh0Var2 = (mh0) arrayList.get(i10 - 1);
        ArrayList arrayList2 = mh0Var2.b;
        byte[] bArr = mh0Var2.d;
        int size = poll.answers.size();
        for (int i14 = 0; i14 < size; i14++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i14);
            if (Arrays.equals(pollAnswer.option, bArr) && ((kh0) nh0Var.w.get(mh0Var2)) != null) {
                TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                if (messageObject != null && messageObject.translated && (message = messageObject.messageOwner) != null && message.translatedPoll != null) {
                    while (true) {
                        if (i13 >= messageObject.messageOwner.translatedPoll.answers.size()) {
                            break;
                        }
                        TLRPC.PollAnswer pollAnswer2 = messageObject.messageOwner.translatedPoll.answers.get(i13);
                        if (Arrays.equals(pollAnswer2.option, pollAnswer.option)) {
                            tL_textWithEntities = pollAnswer2.text;
                            break;
                        }
                        i13++;
                    }
                }
                lh0Var.a(tL_textWithEntities == null ? "" : tL_textWithEntities.text, tL_textWithEntities == null ? null : tL_textWithEntities.entities, nh0Var.R(bArr), mh0Var2.a, mh0Var2.a(), false);
                lh0Var.setTag(R.id.object_tag, mh0Var2);
                return;
            }
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View view;
        org.telegram.ui.ActionBar.u6 u6Var;
        nh0 nh0Var = this.s;
        View view2 = nh0Var.y;
        Context context = this.r;
        if (i10 == 0) {
            view = new PollVotesAlert$UserCell(nh0Var, context);
        } else if (i10 == 1) {
            ViewParent parent = view2.getParent();
            view = view2;
            if (parent != null) {
                ((ViewGroup) view2.getParent()).removeView(view2);
                view = view2;
            }
        } else if (i10 != 2) {
            org.telegram.ui.Cells.v8 v8Var = new org.telegram.ui.Cells.v8(23, context, true);
            v8Var.setOffsetFromImage(65);
            int i11 = org.telegram.ui.ActionBar.y6.h5;
            u6Var = ((org.telegram.ui.ActionBar.k3) nh0Var).resourcesProvider;
            org.telegram.ui.ActionBar.f7.i(i11, v8Var, u6Var);
            v8Var.g(org.telegram.ui.ActionBar.y6.N6, org.telegram.ui.ActionBar.y6.q6);
            view = v8Var;
        } else {
            View ih0Var = new ih0(this, context);
            ih0Var.setTag(-33024);
            view = ih0Var;
        }
        return new vl0(view);
    }

    @Override // s4.h0
    public final void y(s4.e1 e1Var) {
        TLRPC.Chat chat;
        boolean z10;
        org.telegram.ui.ActionBar.u6 u6Var;
        if (e1Var.f == 0) {
            int b10 = e1Var.b();
            int S = S(b10);
            int Q = Q(b10) - 1;
            PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) e1Var.a;
            nh0 nh0Var = this.s;
            mh0 mh0Var = (mh0) nh0Var.x.get(S - 1);
            TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) mh0Var.b.get(Q);
            TLObject userOrChat = nh0Var.S().getUserOrChat(DialogObject.getPeerDialogId(messagePeerVote.peer));
            int i10 = messagePeerVote.date;
            boolean z11 = (Q == mh0Var.b() - 1 && TextUtils.isEmpty(mh0Var.c) && !mh0Var.e) ? false : true;
            y9 y9Var = pollVotesAlert$UserCell.a;
            org.telegram.ui.ActionBar.b6 b6Var = pollVotesAlert$UserCell.b;
            if (userOrChat instanceof TLRPC.User) {
                pollVotesAlert$UserCell.h = (TLRPC.User) userOrChat;
                pollVotesAlert$UserCell.n = null;
            } else if (userOrChat instanceof TLRPC.Chat) {
                pollVotesAlert$UserCell.n = (TLRPC.Chat) userOrChat;
                pollVotesAlert$UserCell.h = null;
            } else {
                pollVotesAlert$UserCell.h = null;
                pollVotesAlert$UserCell.n = null;
            }
            long j10 = i10;
            pollVotesAlert$UserCell.d.setText(LocaleController.getInstance().getFormatterDay().format(j10 * 1000));
            pollVotesAlert$UserCell.c.setText(LocaleController.formatDate(j10, true));
            pollVotesAlert$UserCell.v = z11;
            pollVotesAlert$UserCell.x = userOrChat == null;
            pollVotesAlert$UserCell.w = Q;
            if (userOrChat == null) {
                b6Var.l("", false);
                y9Var.setImageDrawable(null);
            } else {
                int i11 = pollVotesAlert$UserCell.s;
                j9 j9Var = pollVotesAlert$UserCell.e;
                TLRPC.User user = pollVotesAlert$UserCell.h;
                if ((user == null || user.photo == null) && (chat = pollVotesAlert$UserCell.n) != null) {
                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                }
                if (user != null) {
                    j9Var.m(i11, user);
                    TLRPC.UserStatus userStatus = pollVotesAlert$UserCell.h.status;
                } else {
                    TLRPC.Chat chat2 = pollVotesAlert$UserCell.n;
                    if (chat2 != null) {
                        j9Var.k(i11, chat2);
                    }
                }
                TLRPC.User user2 = pollVotesAlert$UserCell.h;
                if (user2 != null) {
                    String userName = UserObject.getUserName(user2);
                    pollVotesAlert$UserCell.r = userName;
                    z10 = false;
                    pollVotesAlert$UserCell.r = Emoji.replaceEmoji(userName, b6Var.getPaint().getFontMetricsInt(), false);
                } else {
                    z10 = false;
                    TLRPC.Chat chat3 = pollVotesAlert$UserCell.n;
                    if (chat3 != null) {
                        String str = chat3.title;
                        pollVotesAlert$UserCell.r = str;
                        pollVotesAlert$UserCell.r = Emoji.replaceEmoji(str, b6Var.getPaint().getFontMetricsInt(), false);
                    } else {
                        pollVotesAlert$UserCell.r = "";
                    }
                }
                b6Var.l(pollVotesAlert$UserCell.r, z10);
                qx0 qx0Var = pollVotesAlert$UserCell.f;
                TLRPC.User user3 = pollVotesAlert$UserCell.h;
                TLRPC.Chat chat4 = pollVotesAlert$UserCell.n;
                int i12 = org.telegram.ui.ActionBar.y6.z9;
                u6Var = ((org.telegram.ui.ActionBar.k3) pollVotesAlert$UserCell.F).resourcesProvider;
                b6Var.i(qx0Var.b(user3, chat4, org.telegram.ui.ActionBar.y6.w0(i12, u6Var), z10));
                TLRPC.Chat chat5 = pollVotesAlert$UserCell.n;
                if (chat5 != null) {
                    y9Var.f(chat5, j9Var);
                } else {
                    TLRPC.User user4 = pollVotesAlert$UserCell.h;
                    if (user4 != null) {
                        y9Var.f(user4, j9Var);
                    } else {
                        y9Var.setImageDrawable(j9Var);
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
                arrayList.add(ObjectAnimator.ofFloat(y9Var, (Property<y9, Float>) property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.E.add(ObjectAnimator.ofFloat(b6Var, (Property<org.telegram.ui.ActionBar.b6, Float>) property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.E.add(ObjectAnimator.ofFloat(pollVotesAlert$UserCell, nh0.R, 1.0f, 0.0f));
            }
        }
    }
}
