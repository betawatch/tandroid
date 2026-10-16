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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class mh0 extends im0 {
    public final Context r;
    public final /* synthetic */ qh0 s;

    public mh0(qh0 qh0Var, Context context) {
        this.s = qh0Var;
        this.r = context;
    }

    @Override // org.telegram.ui.Components.ul0
    public final String F(int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.ul0
    public final void G(mm0 mm0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.im0
    public final int M(int i10) {
        int i11 = 1;
        if (i10 == 0) {
            return 1;
        }
        ph0 ph0Var = (ph0) this.s.x.get(i10 - 1);
        int b10 = ph0Var.b() + 1;
        if (TextUtils.isEmpty(ph0Var.c) && !ph0Var.e) {
            i11 = 0;
        }
        return b10 + i11;
    }

    @Override // org.telegram.ui.Components.im0
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
            qh0 qh0Var = this.s;
            if (i13 < qh0Var.x.size() && (i12 = i11 - 1) < ((ph0) qh0Var.x.get(i13)).b()) {
                return Integer.valueOf(Objects.hash(Long.valueOf(DialogObject.getPeerDialogId(((TLRPC.MessagePeerVote) ((ph0) qh0Var.x.get(i13)).b.get(i12)).peer))));
            }
        }
        return -182734;
    }

    @Override // org.telegram.ui.Components.im0
    public final int P(int i10, int i11) {
        if (i10 == 0) {
            return 1;
        }
        if (i11 == 0) {
            return 2;
        }
        return i11 + (-1) < ((ph0) this.s.x.get(i10 + (-1))).b() ? 0 : 3;
    }

    @Override // org.telegram.ui.Components.im0
    public final int R() {
        return this.s.x.size() + 1;
    }

    @Override // org.telegram.ui.Components.im0
    public final View T(int i10, View view) {
        TLRPC.Message message;
        qh0 qh0Var = this.s;
        TLRPC.Poll poll = qh0Var.r;
        MessageObject messageObject = qh0Var.n;
        if (view == null) {
            view = new lh0(this, this.r);
        }
        oh0 oh0Var = (oh0) view;
        if (i10 == 0) {
            oh0Var.setAlpha(0.0f);
            return view;
        }
        view.setAlpha(1.0f);
        ph0 ph0Var = (ph0) qh0Var.x.get(i10 - 1);
        int size = poll.answers.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i12);
            if (Arrays.equals(pollAnswer.option, ph0Var.d) && ((nh0) qh0Var.w.get(ph0Var)) != null) {
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
                oh0Var.a(tL_textWithEntities == null ? "" : tL_textWithEntities.text, tL_textWithEntities == null ? null : tL_textWithEntities.entities, qh0Var.Q(ph0Var.d), ph0Var.a, ph0Var.a(), false);
                oh0Var.setTag(R.id.object_tag, ph0Var);
                return view;
            }
        }
        return view;
    }

    @Override // org.telegram.ui.Components.im0
    public final boolean V(int i10, int i11, s4.b1 b1Var) {
        if (i10 == 0 || i11 == 0) {
            return false;
        }
        ArrayList arrayList = this.s.F;
        return arrayList == null || arrayList.isEmpty();
    }

    @Override // org.telegram.ui.Components.im0
    public final void W(int i10, int i11, s4.b1 b1Var) {
        TLRPC.Message message;
        qh0 qh0Var = this.s;
        TLRPC.Poll poll = qh0Var.r;
        ArrayList arrayList = qh0Var.x;
        MessageObject messageObject = qh0Var.n;
        int i12 = b1Var.f;
        View view = b1Var.a;
        int i13 = 0;
        if (i12 != 2) {
            if (i12 != 3) {
                return;
            }
            ph0 ph0Var = (ph0) arrayList.get(i10 - 1);
            ((org.telegram.ui.Cells.r8) view).m(R.drawable.arrow_more, LocaleController.formatPluralString("ShowVotes", ph0Var.a - ph0Var.b(), new Object[0]), false);
            return;
        }
        oh0 oh0Var = (oh0) view;
        ph0 ph0Var2 = (ph0) arrayList.get(i10 - 1);
        ArrayList arrayList2 = ph0Var2.b;
        byte[] bArr = ph0Var2.d;
        int size = poll.answers.size();
        for (int i14 = 0; i14 < size; i14++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i14);
            if (Arrays.equals(pollAnswer.option, bArr) && ((nh0) qh0Var.w.get(ph0Var2)) != null) {
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
                oh0Var.a(tL_textWithEntities == null ? "" : tL_textWithEntities.text, tL_textWithEntities == null ? null : tL_textWithEntities.entities, qh0Var.Q(bArr), ph0Var2.a, ph0Var2.a(), false);
                oh0Var.setTag(R.id.object_tag, ph0Var2);
                return;
            }
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        qh0 qh0Var = this.s;
        View view2 = qh0Var.y;
        Context context = this.r;
        if (i10 == 0) {
            view = new PollVotesAlert$UserCell(qh0Var, context);
        } else if (i10 == 1) {
            ViewParent parent = view2.getParent();
            view = view2;
            if (parent != null) {
                ((ViewGroup) view2.getParent()).removeView(view2);
                view = view2;
            }
        } else if (i10 != 2) {
            org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(23, context, true);
            r8Var.setOffsetFromImage(65);
            r8Var.setBackgroundColor(qh0Var.getThemedColor(org.telegram.ui.ActionBar.g6.h5));
            r8Var.e(org.telegram.ui.ActionBar.g6.N6, org.telegram.ui.ActionBar.g6.q6);
            view = r8Var;
        } else {
            View lh0Var = new lh0(this, context);
            lh0Var.setTag(-33024);
            view = lh0Var;
        }
        return new wl0(view);
    }

    @Override // s4.g0
    public final void y(s4.b1 b1Var) {
        TLRPC.Chat chat;
        boolean z10;
        org.telegram.ui.ActionBar.c6 c6Var;
        if (b1Var.f == 0) {
            int b10 = b1Var.b();
            int S = S(b10);
            int Q = Q(b10) - 1;
            PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) b1Var.a;
            qh0 qh0Var = this.s;
            ph0 ph0Var = (ph0) qh0Var.x.get(S - 1);
            TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) ph0Var.b.get(Q);
            TLObject userOrChat = qh0Var.R().getUserOrChat(DialogObject.getPeerDialogId(messagePeerVote.peer));
            int i10 = messagePeerVote.date;
            boolean z11 = (Q == ph0Var.b() - 1 && TextUtils.isEmpty(ph0Var.c) && !ph0Var.e) ? false : true;
            z9 z9Var = pollVotesAlert$UserCell.a;
            org.telegram.ui.ActionBar.h5 h5Var = pollVotesAlert$UserCell.b;
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
                h5Var.l("", false);
                z9Var.setImageDrawable(null);
            } else {
                int i11 = pollVotesAlert$UserCell.s;
                k9 k9Var = pollVotesAlert$UserCell.e;
                TLRPC.User user = pollVotesAlert$UserCell.h;
                if ((user == null || user.photo == null) && (chat = pollVotesAlert$UserCell.n) != null) {
                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                }
                if (user != null) {
                    k9Var.m(i11, user);
                    TLRPC.UserStatus userStatus = pollVotesAlert$UserCell.h.status;
                } else {
                    TLRPC.Chat chat2 = pollVotesAlert$UserCell.n;
                    if (chat2 != null) {
                        k9Var.k(i11, chat2);
                    }
                }
                TLRPC.User user2 = pollVotesAlert$UserCell.h;
                if (user2 != null) {
                    String userName = UserObject.getUserName(user2);
                    pollVotesAlert$UserCell.r = userName;
                    z10 = false;
                    pollVotesAlert$UserCell.r = Emoji.replaceEmoji(userName, h5Var.getPaint().getFontMetricsInt(), false);
                } else {
                    z10 = false;
                    TLRPC.Chat chat3 = pollVotesAlert$UserCell.n;
                    if (chat3 != null) {
                        String str = chat3.title;
                        pollVotesAlert$UserCell.r = str;
                        pollVotesAlert$UserCell.r = Emoji.replaceEmoji(str, h5Var.getPaint().getFontMetricsInt(), false);
                    } else {
                        pollVotesAlert$UserCell.r = "";
                    }
                }
                h5Var.l(pollVotesAlert$UserCell.r, z10);
                jx0 jx0Var = pollVotesAlert$UserCell.f;
                TLRPC.User user3 = pollVotesAlert$UserCell.h;
                TLRPC.Chat chat4 = pollVotesAlert$UserCell.n;
                int i12 = org.telegram.ui.ActionBar.g6.z9;
                c6Var = ((org.telegram.ui.ActionBar.e3) pollVotesAlert$UserCell.F).resourcesProvider;
                h5Var.i(jx0Var.a(user3, chat4, org.telegram.ui.ActionBar.g6.w0(i12, c6Var), z10));
                TLRPC.Chat chat5 = pollVotesAlert$UserCell.n;
                if (chat5 != null) {
                    z9Var.e(chat5, k9Var);
                } else {
                    TLRPC.User user4 = pollVotesAlert$UserCell.h;
                    if (user4 != null) {
                        z9Var.e(user4, k9Var);
                    } else {
                        z9Var.setImageDrawable(k9Var);
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
                arrayList.add(ObjectAnimator.ofFloat(z9Var, (Property<z9, Float>) property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.E.add(ObjectAnimator.ofFloat(h5Var, (Property<org.telegram.ui.ActionBar.h5, Float>) property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.E.add(ObjectAnimator.ofFloat(pollVotesAlert$UserCell, qh0.O, 1.0f, 0.0f));
            }
        }
    }
}
