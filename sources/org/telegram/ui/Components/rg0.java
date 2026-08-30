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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class rg0 extends ol0 {
    public final Context r;
    public final /* synthetic */ vg0 s;

    public rg0(vg0 vg0Var, Context context) {
        this.s = vg0Var;
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
        ug0 ug0Var = (ug0) this.s.x.get(i10 - 1);
        int b10 = ug0Var.b() + 1;
        if (TextUtils.isEmpty(ug0Var.c) && !ug0Var.e) {
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
            vg0 vg0Var = this.s;
            if (i13 < vg0Var.x.size() && (i12 = i11 - 1) < ((ug0) vg0Var.x.get(i13)).b()) {
                return Integer.valueOf(Objects.hash(Long.valueOf(DialogObject.getPeerDialogId(((TLRPC.MessagePeerVote) ((ug0) vg0Var.x.get(i13)).b.get(i12)).peer))));
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
        return i11 + (-1) < ((ug0) this.s.x.get(i10 + (-1))).b() ? 0 : 3;
    }

    @Override // org.telegram.ui.Components.ol0
    public final int R() {
        return this.s.x.size() + 1;
    }

    @Override // org.telegram.ui.Components.ol0
    public final View T(int i10, View view) {
        TLRPC.Message message;
        vg0 vg0Var = this.s;
        TLRPC.Poll poll = vg0Var.r;
        MessageObject messageObject = vg0Var.n;
        if (view == null) {
            view = new qg0(this, this.r);
        }
        tg0 tg0Var = (tg0) view;
        if (i10 == 0) {
            tg0Var.setAlpha(0.0f);
            return view;
        }
        view.setAlpha(1.0f);
        ug0 ug0Var = (ug0) vg0Var.x.get(i10 - 1);
        int size = poll.answers.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i12);
            if (Arrays.equals(pollAnswer.option, ug0Var.d) && ((sg0) vg0Var.w.get(ug0Var)) != null) {
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
                tg0Var.a(tL_textWithEntities == null ? "" : tL_textWithEntities.text, tL_textWithEntities == null ? null : tL_textWithEntities.entities, vg0Var.P(ug0Var.d), ug0Var.a, ug0Var.a(), false);
                tg0Var.setTag(R.id.object_tag, ug0Var);
                return view;
            }
        }
        return view;
    }

    @Override // org.telegram.ui.Components.ol0
    public final boolean V(int i10, int i11, f2.l1 l1Var) {
        if (i10 == 0 || i11 == 0) {
            return false;
        }
        ArrayList arrayList = this.s.C;
        return arrayList == null || arrayList.isEmpty();
    }

    @Override // org.telegram.ui.Components.ol0
    public final void W(int i10, int i11, f2.l1 l1Var) {
        TLRPC.Message message;
        vg0 vg0Var = this.s;
        TLRPC.Poll poll = vg0Var.r;
        ArrayList arrayList = vg0Var.x;
        MessageObject messageObject = vg0Var.n;
        int i12 = l1Var.f;
        View view = l1Var.a;
        int i13 = 0;
        if (i12 != 2) {
            if (i12 != 3) {
                return;
            }
            ug0 ug0Var = (ug0) arrayList.get(i10 - 1);
            ((org.telegram.ui.Cells.o8) view).m(R.drawable.arrow_more, LocaleController.formatPluralString("ShowVotes", ug0Var.a - ug0Var.b(), new Object[0]), false);
            return;
        }
        tg0 tg0Var = (tg0) view;
        ug0 ug0Var2 = (ug0) arrayList.get(i10 - 1);
        ArrayList arrayList2 = ug0Var2.b;
        byte[] bArr = ug0Var2.d;
        int size = poll.answers.size();
        for (int i14 = 0; i14 < size; i14++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i14);
            if (Arrays.equals(pollAnswer.option, bArr) && ((sg0) vg0Var.w.get(ug0Var2)) != null) {
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
                tg0Var.a(tL_textWithEntities == null ? "" : tL_textWithEntities.text, tL_textWithEntities == null ? null : tL_textWithEntities.entities, vg0Var.P(bArr), ug0Var2.a, ug0Var2.a(), false);
                tg0Var.setTag(R.id.object_tag, ug0Var2);
                return;
            }
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View view;
        vg0 vg0Var = this.s;
        View view2 = vg0Var.y;
        Context context = this.r;
        if (i10 == 0) {
            view = new PollVotesAlert$UserCell(vg0Var, context);
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
            o8Var.setBackgroundColor(vg0Var.getThemedColor(org.telegram.ui.ActionBar.j6.h5));
            o8Var.e(org.telegram.ui.ActionBar.j6.N6, org.telegram.ui.ActionBar.j6.q6);
            view = o8Var;
        } else {
            View qg0Var = new qg0(this, context);
            qg0Var.setTag(-33024);
            view = qg0Var;
        }
        return new el0(view);
    }

    @Override // f2.o0
    public final void y(f2.l1 l1Var) {
        TLRPC.Chat chat;
        boolean z4;
        org.telegram.ui.ActionBar.f6 f6Var;
        if (l1Var.f == 0) {
            int b10 = l1Var.b();
            int S = S(b10);
            int Q = Q(b10) - 1;
            PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) l1Var.a;
            vg0 vg0Var = this.s;
            ug0 ug0Var = (ug0) vg0Var.x.get(S - 1);
            TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) ug0Var.b.get(Q);
            TLObject userOrChat = vg0Var.Q().getUserOrChat(DialogObject.getPeerDialogId(messagePeerVote.peer));
            int i10 = messagePeerVote.date;
            boolean z10 = (Q == ug0Var.b() - 1 && TextUtils.isEmpty(ug0Var.c) && !ug0Var.e) ? false : true;
            p9 p9Var = pollVotesAlert$UserCell.a;
            org.telegram.ui.ActionBar.k5 k5Var = pollVotesAlert$UserCell.b;
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
                k5Var.l("", false);
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
                    pollVotesAlert$UserCell.r = Emoji.replaceEmoji(userName, k5Var.getPaint().getFontMetricsInt(), false);
                } else {
                    z4 = false;
                    TLRPC.Chat chat3 = pollVotesAlert$UserCell.n;
                    if (chat3 != null) {
                        String str = chat3.title;
                        pollVotesAlert$UserCell.r = str;
                        pollVotesAlert$UserCell.r = Emoji.replaceEmoji(str, k5Var.getPaint().getFontMetricsInt(), false);
                    } else {
                        pollVotesAlert$UserCell.r = "";
                    }
                }
                k5Var.l(pollVotesAlert$UserCell.r, z4);
                lw0 lw0Var = pollVotesAlert$UserCell.f;
                TLRPC.User user3 = pollVotesAlert$UserCell.h;
                TLRPC.Chat chat4 = pollVotesAlert$UserCell.n;
                int i12 = org.telegram.ui.ActionBar.j6.z9;
                f6Var = ((org.telegram.ui.ActionBar.g3) pollVotesAlert$UserCell.C).resourcesProvider;
                k5Var.i(lw0Var.a(user3, chat4, org.telegram.ui.ActionBar.j6.v0(i12, f6Var), z4));
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
                pollVotesAlert$UserCell.B.add(ObjectAnimator.ofFloat(k5Var, (Property<org.telegram.ui.ActionBar.k5, Float>) property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.B.add(ObjectAnimator.ofFloat(pollVotesAlert$UserCell, vg0.L, 1.0f, 0.0f));
            }
        }
    }
}
