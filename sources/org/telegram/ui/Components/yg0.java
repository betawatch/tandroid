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

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class yg0 extends ul0 {
    public final Context r;
    public final /* synthetic */ ch0 s;

    public yg0(ch0 ch0Var, Context context) {
        this.s = ch0Var;
        this.r = context;
    }

    @Override // org.telegram.ui.Components.gl0
    public final String F(int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.gl0
    public final void G(zl0 zl0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.ul0
    public final int M(int i10) {
        int i11 = 1;
        if (i10 == 0) {
            return 1;
        }
        bh0 bh0Var = (bh0) this.s.x.get(i10 - 1);
        int b10 = bh0Var.b() + 1;
        if (TextUtils.isEmpty(bh0Var.c) && !bh0Var.e) {
            i11 = 0;
        }
        return b10 + i11;
    }

    @Override // org.telegram.ui.Components.ul0
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
            ch0 ch0Var = this.s;
            if (i13 < ch0Var.x.size() && (i12 = i11 - 1) < ((bh0) ch0Var.x.get(i13)).b()) {
                return Integer.valueOf(Objects.hash(Long.valueOf(DialogObject.getPeerDialogId(((TLRPC.MessagePeerVote) ((bh0) ch0Var.x.get(i13)).b.get(i12)).peer))));
            }
        }
        return -182734;
    }

    @Override // org.telegram.ui.Components.ul0
    public final int P(int i10, int i11) {
        if (i10 == 0) {
            return 1;
        }
        if (i11 == 0) {
            return 2;
        }
        return i11 + (-1) < ((bh0) this.s.x.get(i10 + (-1))).b() ? 0 : 3;
    }

    @Override // org.telegram.ui.Components.ul0
    public final int R() {
        return this.s.x.size() + 1;
    }

    @Override // org.telegram.ui.Components.ul0
    public final View T(int i10, View view) {
        TLRPC.Message message;
        ch0 ch0Var = this.s;
        TLRPC.Poll poll = ch0Var.r;
        MessageObject messageObject = ch0Var.n;
        if (view == null) {
            view = new xg0(this, this.r);
        }
        ah0 ah0Var = (ah0) view;
        if (i10 == 0) {
            ah0Var.setAlpha(0.0f);
            return view;
        }
        view.setAlpha(1.0f);
        bh0 bh0Var = (bh0) ch0Var.x.get(i10 - 1);
        int size = poll.answers.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i12);
            if (Arrays.equals(pollAnswer.option, bh0Var.d) && ((zg0) ch0Var.w.get(bh0Var)) != null) {
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
                ah0Var.a(tL_textWithEntities == null ? "" : tL_textWithEntities.text, tL_textWithEntities == null ? null : tL_textWithEntities.entities, ch0Var.N(bh0Var.d), bh0Var.a, bh0Var.a(), false);
                ah0Var.setTag(R.id.object_tag, bh0Var);
                return view;
            }
        }
        return view;
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean V(int i10, int i11, s4.c1 c1Var) {
        if (i10 == 0 || i11 == 0) {
            return false;
        }
        ArrayList arrayList = this.s.F;
        return arrayList == null || arrayList.isEmpty();
    }

    @Override // org.telegram.ui.Components.ul0
    public final void W(int i10, int i11, s4.c1 c1Var) {
        TLRPC.Message message;
        ch0 ch0Var = this.s;
        TLRPC.Poll poll = ch0Var.r;
        ArrayList arrayList = ch0Var.x;
        MessageObject messageObject = ch0Var.n;
        int i12 = c1Var.f;
        View view = c1Var.a;
        int i13 = 0;
        if (i12 != 2) {
            if (i12 != 3) {
                return;
            }
            bh0 bh0Var = (bh0) arrayList.get(i10 - 1);
            ((org.telegram.ui.Cells.r8) view).m(R.drawable.arrow_more, LocaleController.formatPluralString("ShowVotes", bh0Var.a - bh0Var.b(), new Object[0]), false);
            return;
        }
        ah0 ah0Var = (ah0) view;
        bh0 bh0Var2 = (bh0) arrayList.get(i10 - 1);
        ArrayList arrayList2 = bh0Var2.b;
        byte[] bArr = bh0Var2.d;
        int size = poll.answers.size();
        for (int i14 = 0; i14 < size; i14++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i14);
            if (Arrays.equals(pollAnswer.option, bArr) && ((zg0) ch0Var.w.get(bh0Var2)) != null) {
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
                ah0Var.a(tL_textWithEntities == null ? "" : tL_textWithEntities.text, tL_textWithEntities == null ? null : tL_textWithEntities.entities, ch0Var.N(bArr), bh0Var2.a, bh0Var2.a(), false);
                ah0Var.setTag(R.id.object_tag, bh0Var2);
                return;
            }
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        ch0 ch0Var = this.s;
        View view2 = ch0Var.y;
        Context context = this.r;
        if (i10 == 0) {
            view = new PollVotesAlert$UserCell(ch0Var, context);
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
            r8Var.setBackgroundColor(ch0Var.getThemedColor(org.telegram.ui.ActionBar.i6.h5));
            r8Var.e(org.telegram.ui.ActionBar.i6.N6, org.telegram.ui.ActionBar.i6.q6);
            view = r8Var;
        } else {
            View xg0Var = new xg0(this, context);
            xg0Var.setTag(-33024);
            view = xg0Var;
        }
        return new il0(view);
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
            ch0 ch0Var = this.s;
            bh0 bh0Var = (bh0) ch0Var.x.get(S - 1);
            TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) bh0Var.b.get(Q);
            TLObject userOrChat = ch0Var.O().getUserOrChat(DialogObject.getPeerDialogId(messagePeerVote.peer));
            int i10 = messagePeerVote.date;
            boolean z11 = (Q == bh0Var.b() - 1 && TextUtils.isEmpty(bh0Var.c) && !bh0Var.e) ? false : true;
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
                hx0 hx0Var = pollVotesAlert$UserCell.f;
                TLRPC.User user3 = pollVotesAlert$UserCell.h;
                TLRPC.Chat chat4 = pollVotesAlert$UserCell.n;
                int i12 = org.telegram.ui.ActionBar.i6.z9;
                d6Var = ((org.telegram.ui.ActionBar.f3) pollVotesAlert$UserCell.F).resourcesProvider;
                i5Var.i(hx0Var.a(user3, chat4, org.telegram.ui.ActionBar.i6.v0(i12, d6Var), z10));
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
                pollVotesAlert$UserCell.E.add(ObjectAnimator.ofFloat(pollVotesAlert$UserCell, ch0.O, 1.0f, 0.0f));
            }
        }
    }
}
