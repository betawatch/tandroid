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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class yf0 extends vk0 {
    public final Context r;
    public final /* synthetic */ cg0 s;

    public yf0(cg0 cg0Var, Context context) {
        this.s = cg0Var;
        this.r = context;
    }

    @Override // org.telegram.ui.Components.jk0
    public final String F(int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.jk0
    public final void G(zk0 zk0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.vk0
    public final int M(int i10) {
        int i11 = 1;
        if (i10 == 0) {
            return 1;
        }
        bg0 bg0Var = (bg0) this.s.x.get(i10 - 1);
        int b10 = bg0Var.b() + 1;
        if (TextUtils.isEmpty(bg0Var.c) && !bg0Var.e) {
            i11 = 0;
        }
        return b10 + i11;
    }

    @Override // org.telegram.ui.Components.vk0
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
            cg0 cg0Var = this.s;
            if (i13 < cg0Var.x.size() && (i12 = i11 - 1) < ((bg0) cg0Var.x.get(i13)).b()) {
                return Integer.valueOf(Objects.hash(Long.valueOf(DialogObject.getPeerDialogId(((TLRPC.MessagePeerVote) ((bg0) cg0Var.x.get(i13)).b.get(i12)).peer))));
            }
        }
        return -182734;
    }

    @Override // org.telegram.ui.Components.vk0
    public final int P(int i10, int i11) {
        if (i10 == 0) {
            return 1;
        }
        if (i11 == 0) {
            return 2;
        }
        return i11 + (-1) < ((bg0) this.s.x.get(i10 + (-1))).b() ? 0 : 3;
    }

    @Override // org.telegram.ui.Components.vk0
    public final int R() {
        return this.s.x.size() + 1;
    }

    @Override // org.telegram.ui.Components.vk0
    public final View T(int i10, View view) {
        TLRPC.Message message;
        cg0 cg0Var = this.s;
        TLRPC.Poll poll = cg0Var.r;
        MessageObject messageObject = cg0Var.n;
        if (view == null) {
            view = new xf0(this, this.r);
        }
        ag0 ag0Var = (ag0) view;
        if (i10 == 0) {
            ag0Var.setAlpha(0.0f);
            return view;
        }
        view.setAlpha(1.0f);
        bg0 bg0Var = (bg0) cg0Var.x.get(i10 - 1);
        int size = poll.answers.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i12);
            if (Arrays.equals(pollAnswer.option, bg0Var.d) && ((zf0) cg0Var.w.get(bg0Var)) != null) {
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
                ag0Var.a(tL_textWithEntities == null ? "" : tL_textWithEntities.text, tL_textWithEntities == null ? null : tL_textWithEntities.entities, cg0Var.P(bg0Var.d), bg0Var.a, bg0Var.a(), false);
                ag0Var.setTag(R.id.object_tag, bg0Var);
                return view;
            }
        }
        return view;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean V(int i10, int i11, f2.o1 o1Var) {
        if (i10 == 0 || i11 == 0) {
            return false;
        }
        ArrayList arrayList = this.s.B;
        return arrayList == null || arrayList.isEmpty();
    }

    @Override // org.telegram.ui.Components.vk0
    public final void W(int i10, int i11, f2.o1 o1Var) {
        TLRPC.Message message;
        cg0 cg0Var = this.s;
        TLRPC.Poll poll = cg0Var.r;
        ArrayList arrayList = cg0Var.x;
        MessageObject messageObject = cg0Var.n;
        int i12 = o1Var.f;
        View view = o1Var.a;
        int i13 = 0;
        if (i12 != 2) {
            if (i12 != 3) {
                return;
            }
            bg0 bg0Var = (bg0) arrayList.get(i10 - 1);
            ((org.telegram.ui.Cells.l8) view).m(R.drawable.arrow_more, LocaleController.formatPluralString("ShowVotes", bg0Var.a - bg0Var.b(), new Object[0]), false);
            return;
        }
        ag0 ag0Var = (ag0) view;
        bg0 bg0Var2 = (bg0) arrayList.get(i10 - 1);
        ArrayList arrayList2 = bg0Var2.b;
        byte[] bArr = bg0Var2.d;
        int size = poll.answers.size();
        for (int i14 = 0; i14 < size; i14++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i14);
            if (Arrays.equals(pollAnswer.option, bArr) && ((zf0) cg0Var.w.get(bg0Var2)) != null) {
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
                ag0Var.a(tL_textWithEntities == null ? "" : tL_textWithEntities.text, tL_textWithEntities == null ? null : tL_textWithEntities.entities, cg0Var.P(bArr), bg0Var2.a, bg0Var2.a(), false);
                ag0Var.setTag(R.id.object_tag, bg0Var2);
                return;
            }
        }
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View view;
        cg0 cg0Var = this.s;
        View view2 = cg0Var.y;
        Context context = this.r;
        if (i10 == 0) {
            view = new PollVotesAlert$UserCell(cg0Var, context);
        } else if (i10 == 1) {
            ViewParent parent = view2.getParent();
            view = view2;
            if (parent != null) {
                ((ViewGroup) view2.getParent()).removeView(view2);
                view = view2;
            }
        } else if (i10 != 2) {
            org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(23, context, true);
            l8Var.setOffsetFromImage(65);
            l8Var.setBackgroundColor(cg0Var.getThemedColor(org.telegram.ui.ActionBar.g6.h5));
            l8Var.e(org.telegram.ui.ActionBar.g6.N6, org.telegram.ui.ActionBar.g6.q6);
            view = l8Var;
        } else {
            View xf0Var = new xf0(this, context);
            xf0Var.setTag(-33024);
            view = xf0Var;
        }
        return new lk0(view);
    }

    @Override // f2.q0
    public final void y(f2.o1 o1Var) {
        TLRPC.Chat chat;
        boolean z10;
        org.telegram.ui.ActionBar.c6 c6Var;
        if (o1Var.f == 0) {
            int b10 = o1Var.b();
            int S = S(b10);
            int Q = Q(b10) - 1;
            PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) o1Var.a;
            cg0 cg0Var = this.s;
            bg0 bg0Var = (bg0) cg0Var.x.get(S - 1);
            TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) bg0Var.b.get(Q);
            TLObject userOrChat = cg0Var.Q().getUserOrChat(DialogObject.getPeerDialogId(messagePeerVote.peer));
            int i10 = messagePeerVote.date;
            boolean z11 = (Q == bg0Var.b() - 1 && TextUtils.isEmpty(bg0Var.c) && !bg0Var.e) ? false : true;
            n9 n9Var = pollVotesAlert$UserCell.a;
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
                n9Var.setImageDrawable(null);
            } else {
                int i11 = pollVotesAlert$UserCell.s;
                y8 y8Var = pollVotesAlert$UserCell.e;
                TLRPC.User user = pollVotesAlert$UserCell.h;
                if ((user == null || user.photo == null) && (chat = pollVotesAlert$UserCell.n) != null) {
                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                }
                if (user != null) {
                    y8Var.m(i11, user);
                    TLRPC.UserStatus userStatus = pollVotesAlert$UserCell.h.status;
                } else {
                    TLRPC.Chat chat2 = pollVotesAlert$UserCell.n;
                    if (chat2 != null) {
                        y8Var.k(i11, chat2);
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
                uv0 uv0Var = pollVotesAlert$UserCell.f;
                TLRPC.User user3 = pollVotesAlert$UserCell.h;
                TLRPC.Chat chat4 = pollVotesAlert$UserCell.n;
                int i12 = org.telegram.ui.ActionBar.g6.z9;
                c6Var = ((org.telegram.ui.ActionBar.e3) pollVotesAlert$UserCell.B).resourcesProvider;
                h5Var.i(uv0Var.a(user3, chat4, org.telegram.ui.ActionBar.g6.v0(i12, c6Var), z10));
                TLRPC.Chat chat5 = pollVotesAlert$UserCell.n;
                if (chat5 != null) {
                    n9Var.e(chat5, y8Var);
                } else {
                    TLRPC.User user4 = pollVotesAlert$UserCell.h;
                    if (user4 != null) {
                        n9Var.e(user4, y8Var);
                    } else {
                        n9Var.setImageDrawable(y8Var);
                    }
                }
            }
            ArrayList arrayList = pollVotesAlert$UserCell.A;
            if (arrayList == null) {
                if (pollVotesAlert$UserCell.x) {
                    return;
                }
                pollVotesAlert$UserCell.y = 0.0f;
            } else {
                Property property = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(n9Var, (Property<n9, Float>) property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.A.add(ObjectAnimator.ofFloat(h5Var, (Property<org.telegram.ui.ActionBar.h5, Float>) property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.A.add(ObjectAnimator.ofFloat(pollVotesAlert$UserCell, cg0.K, 1.0f, 0.0f));
            }
        }
    }
}
