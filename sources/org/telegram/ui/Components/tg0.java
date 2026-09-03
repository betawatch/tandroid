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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class tg0 extends ol0 {
    public final Context r;
    public final /* synthetic */ xg0 s;

    public tg0(xg0 xg0Var, Context context) {
        this.s = xg0Var;
        this.r = context;
    }

    @Override // org.telegram.ui.Components.cl0
    public final String F(int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.cl0
    public final void G(sl0 sl0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.ol0
    public final int M(int i10) {
        int i11 = 1;
        if (i10 == 0) {
            return 1;
        }
        wg0 wg0Var = (wg0) this.s.x.get(i10 - 1);
        int b10 = wg0Var.b() + 1;
        if (TextUtils.isEmpty(wg0Var.c) && !wg0Var.e) {
            i11 = 0;
        }
        return b10 + i11;
    }

    @Override // org.telegram.ui.Components.ol0
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
            xg0 xg0Var = this.s;
            if (i13 < xg0Var.x.size() && (i12 = i11 - 1) < ((wg0) xg0Var.x.get(i13)).b()) {
                return Integer.valueOf(Objects.hash(Long.valueOf(DialogObject.getPeerDialogId(((TLRPC.MessagePeerVote) ((wg0) xg0Var.x.get(i13)).b.get(i12)).peer))));
            }
        }
        return -182734;
    }

    @Override // org.telegram.ui.Components.ol0
    public final int P(int i10, int i11) {
        if (i10 == 0) {
            return 1;
        }
        if (i11 == 0) {
            return 2;
        }
        return i11 + (-1) < ((wg0) this.s.x.get(i10 + (-1))).b() ? 0 : 3;
    }

    @Override // org.telegram.ui.Components.ol0
    public final int R() {
        return this.s.x.size() + 1;
    }

    @Override // org.telegram.ui.Components.ol0
    public final View T(int i10, View view) {
        TLRPC.Message message;
        xg0 xg0Var = this.s;
        TLRPC.Poll poll = xg0Var.r;
        MessageObject messageObject = xg0Var.n;
        if (view == null) {
            view = new sg0(this, this.r);
        }
        vg0 vg0Var = (vg0) view;
        if (i10 == 0) {
            vg0Var.setAlpha(0.0f);
            return view;
        }
        view.setAlpha(1.0f);
        wg0 wg0Var = (wg0) xg0Var.x.get(i10 - 1);
        int size = poll.answers.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i12);
            if (Arrays.equals(pollAnswer.option, wg0Var.d) && ((ug0) xg0Var.w.get(wg0Var)) != null) {
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
                vg0Var.a(tL_textWithEntities == null ? "" : tL_textWithEntities.text, tL_textWithEntities == null ? null : tL_textWithEntities.entities, xg0Var.P(wg0Var.d), wg0Var.a, wg0Var.a(), false);
                vg0Var.setTag(R.id.object_tag, wg0Var);
                return view;
            }
        }
        return view;
    }

    @Override // org.telegram.ui.Components.ol0
    public final boolean V(int i10, int i11, f2.m1 m1Var) {
        if (i10 == 0 || i11 == 0) {
            return false;
        }
        ArrayList arrayList = this.s.C;
        return arrayList == null || arrayList.isEmpty();
    }

    @Override // org.telegram.ui.Components.ol0
    public final void W(int i10, int i11, f2.m1 m1Var) {
        TLRPC.Message message;
        xg0 xg0Var = this.s;
        TLRPC.Poll poll = xg0Var.r;
        ArrayList arrayList = xg0Var.x;
        MessageObject messageObject = xg0Var.n;
        int i12 = m1Var.f;
        View view = m1Var.a;
        int i13 = 0;
        if (i12 != 2) {
            if (i12 != 3) {
                return;
            }
            wg0 wg0Var = (wg0) arrayList.get(i10 - 1);
            ((org.telegram.ui.Cells.o8) view).m(R.drawable.arrow_more, LocaleController.formatPluralString("ShowVotes", wg0Var.a - wg0Var.b(), new Object[0]), false);
            return;
        }
        vg0 vg0Var = (vg0) view;
        wg0 wg0Var2 = (wg0) arrayList.get(i10 - 1);
        ArrayList arrayList2 = wg0Var2.b;
        byte[] bArr = wg0Var2.d;
        int size = poll.answers.size();
        for (int i14 = 0; i14 < size; i14++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i14);
            if (Arrays.equals(pollAnswer.option, bArr) && ((ug0) xg0Var.w.get(wg0Var2)) != null) {
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
                vg0Var.a(tL_textWithEntities == null ? "" : tL_textWithEntities.text, tL_textWithEntities == null ? null : tL_textWithEntities.entities, xg0Var.P(bArr), wg0Var2.a, wg0Var2.a(), false);
                vg0Var.setTag(R.id.object_tag, wg0Var2);
                return;
            }
        }
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View view;
        xg0 xg0Var = this.s;
        View view2 = xg0Var.y;
        Context context = this.r;
        if (i10 == 0) {
            view = new PollVotesAlert$UserCell(xg0Var, context);
        } else if (i10 == 1) {
            ViewParent parent = view2.getParent();
            view = view2;
            if (parent != null) {
                ((ViewGroup) view2.getParent()).removeView(view2);
                view = view2;
            }
        } else if (i10 != 2) {
            org.telegram.ui.Cells.o8 o8Var = new org.telegram.ui.Cells.o8(23, context, true);
            o8Var.setOffsetFromImage(65);
            o8Var.setBackgroundColor(xg0Var.getThemedColor(org.telegram.ui.ActionBar.k6.h5));
            o8Var.e(org.telegram.ui.ActionBar.k6.N6, org.telegram.ui.ActionBar.k6.q6);
            view = o8Var;
        } else {
            View sg0Var = new sg0(this, context);
            sg0Var.setTag(-33024);
            view = sg0Var;
        }
        return new el0(view);
    }

    @Override // f2.p0
    public final void y(f2.m1 m1Var) {
        TLRPC.Chat chat;
        boolean z4;
        org.telegram.ui.ActionBar.g6 g6Var;
        if (m1Var.f == 0) {
            int b10 = m1Var.b();
            int S = S(b10);
            int Q = Q(b10) - 1;
            PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) m1Var.a;
            xg0 xg0Var = this.s;
            wg0 wg0Var = (wg0) xg0Var.x.get(S - 1);
            TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) wg0Var.b.get(Q);
            TLObject userOrChat = xg0Var.Q().getUserOrChat(DialogObject.getPeerDialogId(messagePeerVote.peer));
            int i10 = messagePeerVote.date;
            boolean z10 = (Q == wg0Var.b() - 1 && TextUtils.isEmpty(wg0Var.c) && !wg0Var.e) ? false : true;
            p9 p9Var = pollVotesAlert$UserCell.a;
            org.telegram.ui.ActionBar.l5 l5Var = pollVotesAlert$UserCell.b;
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
            pollVotesAlert$UserCell.v = z10;
            pollVotesAlert$UserCell.x = userOrChat == null;
            pollVotesAlert$UserCell.w = Q;
            if (userOrChat == null) {
                l5Var.l("", false);
                p9Var.setImageDrawable(null);
            } else {
                int i11 = pollVotesAlert$UserCell.s;
                z8 z8Var = pollVotesAlert$UserCell.e;
                TLRPC.User user = pollVotesAlert$UserCell.h;
                if ((user == null || user.photo == null) && (chat = pollVotesAlert$UserCell.n) != null) {
                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                }
                if (user != null) {
                    z8Var.m(i11, user);
                    TLRPC.UserStatus userStatus = pollVotesAlert$UserCell.h.status;
                } else {
                    TLRPC.Chat chat2 = pollVotesAlert$UserCell.n;
                    if (chat2 != null) {
                        z8Var.k(i11, chat2);
                    }
                }
                TLRPC.User user2 = pollVotesAlert$UserCell.h;
                if (user2 != null) {
                    String userName = UserObject.getUserName(user2);
                    pollVotesAlert$UserCell.r = userName;
                    z4 = false;
                    pollVotesAlert$UserCell.r = Emoji.replaceEmoji(userName, l5Var.getPaint().getFontMetricsInt(), false);
                } else {
                    z4 = false;
                    TLRPC.Chat chat3 = pollVotesAlert$UserCell.n;
                    if (chat3 != null) {
                        String str = chat3.title;
                        pollVotesAlert$UserCell.r = str;
                        pollVotesAlert$UserCell.r = Emoji.replaceEmoji(str, l5Var.getPaint().getFontMetricsInt(), false);
                    } else {
                        pollVotesAlert$UserCell.r = "";
                    }
                }
                l5Var.l(pollVotesAlert$UserCell.r, z4);
                lw0 lw0Var = pollVotesAlert$UserCell.f;
                TLRPC.User user3 = pollVotesAlert$UserCell.h;
                TLRPC.Chat chat4 = pollVotesAlert$UserCell.n;
                int i12 = org.telegram.ui.ActionBar.k6.z9;
                g6Var = ((org.telegram.ui.ActionBar.h3) pollVotesAlert$UserCell.C).resourcesProvider;
                l5Var.i(lw0Var.a(user3, chat4, org.telegram.ui.ActionBar.k6.v0(i12, g6Var), z4));
                TLRPC.Chat chat5 = pollVotesAlert$UserCell.n;
                if (chat5 != null) {
                    p9Var.e(chat5, z8Var);
                } else {
                    TLRPC.User user4 = pollVotesAlert$UserCell.h;
                    if (user4 != null) {
                        p9Var.e(user4, z8Var);
                    } else {
                        p9Var.setImageDrawable(z8Var);
                    }
                }
            }
            ArrayList arrayList = pollVotesAlert$UserCell.B;
            if (arrayList == null) {
                if (pollVotesAlert$UserCell.x) {
                    return;
                }
                pollVotesAlert$UserCell.y = 0.0f;
            } else {
                Property property = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(p9Var, (Property<p9, Float>) property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.B.add(ObjectAnimator.ofFloat(l5Var, (Property<org.telegram.ui.ActionBar.l5, Float>) property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.B.add(ObjectAnimator.ofFloat(pollVotesAlert$UserCell, xg0.L, 1.0f, 0.0f));
            }
        }
    }
}
