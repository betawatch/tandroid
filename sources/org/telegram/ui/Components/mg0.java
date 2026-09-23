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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class mg0 extends il0 {
    public final Context r;
    public final /* synthetic */ qg0 s;

    public mg0(qg0 qg0Var, Context context) {
        this.s = qg0Var;
        this.r = context;
    }

    @Override // org.telegram.ui.Components.uk0
    public final String F(int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.uk0
    public final void G(ml0 ml0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.il0
    public final int M(int i10) {
        int i11 = 1;
        if (i10 == 0) {
            return 1;
        }
        pg0 pg0Var = (pg0) this.s.x.get(i10 - 1);
        int b10 = pg0Var.b() + 1;
        if (TextUtils.isEmpty(pg0Var.c) && !pg0Var.e) {
            i11 = 0;
        }
        return b10 + i11;
    }

    @Override // org.telegram.ui.Components.il0
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
            qg0 qg0Var = this.s;
            if (i13 < qg0Var.x.size() && (i12 = i11 - 1) < ((pg0) qg0Var.x.get(i13)).b()) {
                return Integer.valueOf(Objects.hash(Long.valueOf(DialogObject.getPeerDialogId(((TLRPC.MessagePeerVote) ((pg0) qg0Var.x.get(i13)).b.get(i12)).peer))));
            }
        }
        return -182734;
    }

    @Override // org.telegram.ui.Components.il0
    public final int P(int i10, int i11) {
        if (i10 == 0) {
            return 1;
        }
        if (i11 == 0) {
            return 2;
        }
        return i11 + (-1) < ((pg0) this.s.x.get(i10 + (-1))).b() ? 0 : 3;
    }

    @Override // org.telegram.ui.Components.il0
    public final int R() {
        return this.s.x.size() + 1;
    }

    @Override // org.telegram.ui.Components.il0
    public final View T(int i10, View view) {
        TLRPC.Message message;
        qg0 qg0Var = this.s;
        TLRPC.Poll poll = qg0Var.r;
        MessageObject messageObject = qg0Var.n;
        if (view == null) {
            view = new lg0(this, this.r);
        }
        og0 og0Var = (og0) view;
        if (i10 == 0) {
            og0Var.setAlpha(0.0f);
            return view;
        }
        view.setAlpha(1.0f);
        pg0 pg0Var = (pg0) qg0Var.x.get(i10 - 1);
        int size = poll.answers.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i12);
            if (Arrays.equals(pollAnswer.option, pg0Var.d) && ((ng0) qg0Var.w.get(pg0Var)) != null) {
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
                og0Var.a(tL_textWithEntities == null ? "" : tL_textWithEntities.text, tL_textWithEntities == null ? null : tL_textWithEntities.entities, qg0Var.P(pg0Var.d), pg0Var.a, pg0Var.a(), false);
                og0Var.setTag(R.id.object_tag, pg0Var);
                return view;
            }
        }
        return view;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean V(int i10, int i11, s4.c1 c1Var) {
        if (i10 == 0 || i11 == 0) {
            return false;
        }
        ArrayList arrayList = this.s.F;
        return arrayList == null || arrayList.isEmpty();
    }

    @Override // org.telegram.ui.Components.il0
    public final void W(int i10, int i11, s4.c1 c1Var) {
        TLRPC.Message message;
        qg0 qg0Var = this.s;
        TLRPC.Poll poll = qg0Var.r;
        ArrayList arrayList = qg0Var.x;
        MessageObject messageObject = qg0Var.n;
        int i12 = c1Var.f;
        View view = c1Var.a;
        int i13 = 0;
        if (i12 != 2) {
            if (i12 != 3) {
                return;
            }
            pg0 pg0Var = (pg0) arrayList.get(i10 - 1);
            ((org.telegram.ui.Cells.s8) view).m(R.drawable.arrow_more, LocaleController.formatPluralString("ShowVotes", pg0Var.a - pg0Var.b(), new Object[0]), false);
            return;
        }
        og0 og0Var = (og0) view;
        pg0 pg0Var2 = (pg0) arrayList.get(i10 - 1);
        ArrayList arrayList2 = pg0Var2.b;
        byte[] bArr = pg0Var2.d;
        int size = poll.answers.size();
        for (int i14 = 0; i14 < size; i14++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i14);
            if (Arrays.equals(pollAnswer.option, bArr) && ((ng0) qg0Var.w.get(pg0Var2)) != null) {
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
                og0Var.a(tL_textWithEntities == null ? "" : tL_textWithEntities.text, tL_textWithEntities == null ? null : tL_textWithEntities.entities, qg0Var.P(bArr), pg0Var2.a, pg0Var2.a(), false);
                og0Var.setTag(R.id.object_tag, pg0Var2);
                return;
            }
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        qg0 qg0Var = this.s;
        View view2 = qg0Var.y;
        Context context = this.r;
        if (i10 == 0) {
            view = new PollVotesAlert$UserCell(qg0Var, context);
        } else if (i10 == 1) {
            ViewParent parent = view2.getParent();
            view = view2;
            if (parent != null) {
                ((ViewGroup) view2.getParent()).removeView(view2);
                view = view2;
            }
        } else if (i10 != 2) {
            org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(23, context, true);
            s8Var.setOffsetFromImage(65);
            s8Var.setBackgroundColor(qg0Var.getThemedColor(org.telegram.ui.ActionBar.h6.h5));
            s8Var.e(org.telegram.ui.ActionBar.h6.N6, org.telegram.ui.ActionBar.h6.q6);
            view = s8Var;
        } else {
            View lg0Var = new lg0(this, context);
            lg0Var.setTag(-33024);
            view = lg0Var;
        }
        return new wk0(view);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        TLRPC.Chat chat;
        boolean z10;
        org.telegram.ui.ActionBar.d6 d6Var;
        if (c1Var.f == 0) {
            int b10 = c1Var.b();
            int S = S(b10);
            int Q = Q(b10) - 1;
            PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) c1Var.a;
            qg0 qg0Var = this.s;
            pg0 pg0Var = (pg0) qg0Var.x.get(S - 1);
            TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) pg0Var.b.get(Q);
            TLObject userOrChat = qg0Var.Q().getUserOrChat(DialogObject.getPeerDialogId(messagePeerVote.peer));
            int i10 = messagePeerVote.date;
            boolean z11 = (Q == pg0Var.b() - 1 && TextUtils.isEmpty(pg0Var.c) && !pg0Var.e) ? false : true;
            w9 w9Var = pollVotesAlert$UserCell.a;
            org.telegram.ui.ActionBar.i5 i5Var = pollVotesAlert$UserCell.b;
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
            long j3 = i10;
            pollVotesAlert$UserCell.d.setText(LocaleController.getInstance().getFormatterDay().format(j3 * 1000));
            pollVotesAlert$UserCell.c.setText(LocaleController.formatDate(j3, true));
            pollVotesAlert$UserCell.v = z11;
            pollVotesAlert$UserCell.x = userOrChat == null;
            pollVotesAlert$UserCell.w = Q;
            if (userOrChat == null) {
                i5Var.l("", false);
                w9Var.setImageDrawable(null);
            } else {
                int i11 = pollVotesAlert$UserCell.s;
                h9 h9Var = pollVotesAlert$UserCell.e;
                TLRPC.User user = pollVotesAlert$UserCell.h;
                if ((user == null || user.photo == null) && (chat = pollVotesAlert$UserCell.n) != null) {
                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                }
                if (user != null) {
                    h9Var.m(i11, user);
                    TLRPC.UserStatus userStatus = pollVotesAlert$UserCell.h.status;
                } else {
                    TLRPC.Chat chat2 = pollVotesAlert$UserCell.n;
                    if (chat2 != null) {
                        h9Var.k(i11, chat2);
                    }
                }
                TLRPC.User user2 = pollVotesAlert$UserCell.h;
                if (user2 != null) {
                    String userName = UserObject.getUserName(user2);
                    pollVotesAlert$UserCell.r = userName;
                    z10 = false;
                    pollVotesAlert$UserCell.r = Emoji.replaceEmoji(userName, i5Var.getPaint().getFontMetricsInt(), false);
                } else {
                    z10 = false;
                    TLRPC.Chat chat3 = pollVotesAlert$UserCell.n;
                    if (chat3 != null) {
                        String str = chat3.title;
                        pollVotesAlert$UserCell.r = str;
                        pollVotesAlert$UserCell.r = Emoji.replaceEmoji(str, i5Var.getPaint().getFontMetricsInt(), false);
                    } else {
                        pollVotesAlert$UserCell.r = "";
                    }
                }
                i5Var.l(pollVotesAlert$UserCell.r, z10);
                kw0 kw0Var = pollVotesAlert$UserCell.f;
                TLRPC.User user3 = pollVotesAlert$UserCell.h;
                TLRPC.Chat chat4 = pollVotesAlert$UserCell.n;
                int i12 = org.telegram.ui.ActionBar.h6.z9;
                d6Var = ((org.telegram.ui.ActionBar.f3) pollVotesAlert$UserCell.F).resourcesProvider;
                i5Var.i(kw0Var.a(user3, chat4, org.telegram.ui.ActionBar.h6.v0(i12, d6Var), z10));
                TLRPC.Chat chat5 = pollVotesAlert$UserCell.n;
                if (chat5 != null) {
                    w9Var.e(chat5, h9Var);
                } else {
                    TLRPC.User user4 = pollVotesAlert$UserCell.h;
                    if (user4 != null) {
                        w9Var.e(user4, h9Var);
                    } else {
                        w9Var.setImageDrawable(h9Var);
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
                arrayList.add(ObjectAnimator.ofFloat(w9Var, (Property<w9, Float>) property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.E.add(ObjectAnimator.ofFloat(i5Var, (Property<org.telegram.ui.ActionBar.i5, Float>) property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.E.add(ObjectAnimator.ofFloat(pollVotesAlert$UserCell, qg0.O, 1.0f, 0.0f));
            }
        }
    }
}
