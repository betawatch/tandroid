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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class wf0 extends sk0 {
    public final Context r;
    public final /* synthetic */ ag0 s;

    public wf0(ag0 ag0Var, Context context) {
        this.s = ag0Var;
        this.r = context;
    }

    @Override // org.telegram.ui.Components.gk0
    public final String F(int i9) {
        return null;
    }

    @Override // org.telegram.ui.Components.gk0
    public final void G(wk0 wk0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.sk0
    public final int M(int i9) {
        int i10 = 1;
        if (i9 == 0) {
            return 1;
        }
        zf0 zf0Var = (zf0) this.s.x.get(i9 - 1);
        int b10 = zf0Var.b() + 1;
        if (TextUtils.isEmpty(zf0Var.c) && !zf0Var.e) {
            i10 = 0;
        }
        return b10 + i10;
    }

    @Override // org.telegram.ui.Components.sk0
    public final Object O(int i9, int i10) {
        int i11;
        if (i9 == 0) {
            return 293145;
        }
        int i12 = i9 - 1;
        if (i10 == 0) {
            return -928312;
        }
        if (i12 >= 0) {
            ag0 ag0Var = this.s;
            if (i12 < ag0Var.x.size() && (i11 = i10 - 1) < ((zf0) ag0Var.x.get(i12)).b()) {
                return Integer.valueOf(Objects.hash(Long.valueOf(DialogObject.getPeerDialogId(((TLRPC.MessagePeerVote) ((zf0) ag0Var.x.get(i12)).b.get(i11)).peer))));
            }
        }
        return -182734;
    }

    @Override // org.telegram.ui.Components.sk0
    public final int P(int i9, int i10) {
        if (i9 == 0) {
            return 1;
        }
        if (i10 == 0) {
            return 2;
        }
        return i10 + (-1) < ((zf0) this.s.x.get(i9 + (-1))).b() ? 0 : 3;
    }

    @Override // org.telegram.ui.Components.sk0
    public final int R() {
        return this.s.x.size() + 1;
    }

    @Override // org.telegram.ui.Components.sk0
    public final View T(int i9, View view) {
        TLRPC.Message message;
        ag0 ag0Var = this.s;
        TLRPC.Poll poll = ag0Var.r;
        MessageObject messageObject = ag0Var.n;
        if (view == null) {
            view = new vf0(this, this.r);
        }
        yf0 yf0Var = (yf0) view;
        if (i9 == 0) {
            yf0Var.setAlpha(0.0f);
            return view;
        }
        view.setAlpha(1.0f);
        zf0 zf0Var = (zf0) ag0Var.x.get(i9 - 1);
        int size = poll.answers.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i11);
            if (Arrays.equals(pollAnswer.option, zf0Var.d) && ((xf0) ag0Var.w.get(zf0Var)) != null) {
                TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                if (messageObject != null && messageObject.translated && (message = messageObject.messageOwner) != null && message.translatedPoll != null) {
                    while (true) {
                        if (i10 >= messageObject.messageOwner.translatedPoll.answers.size()) {
                            break;
                        }
                        TLRPC.PollAnswer pollAnswer2 = messageObject.messageOwner.translatedPoll.answers.get(i10);
                        if (Arrays.equals(pollAnswer2.option, pollAnswer.option)) {
                            tL_textWithEntities = pollAnswer2.text;
                            break;
                        }
                        i10++;
                    }
                }
                yf0Var.a(tL_textWithEntities == null ? "" : tL_textWithEntities.text, tL_textWithEntities == null ? null : tL_textWithEntities.entities, ag0Var.O(zf0Var.d), zf0Var.a, zf0Var.a(), false);
                yf0Var.setTag(R.id.object_tag, zf0Var);
                return view;
            }
        }
        return view;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean V(int i9, int i10, f2.q1 q1Var) {
        if (i9 == 0 || i10 == 0) {
            return false;
        }
        ArrayList arrayList = this.s.B;
        return arrayList == null || arrayList.isEmpty();
    }

    @Override // org.telegram.ui.Components.sk0
    public final void W(int i9, int i10, f2.q1 q1Var) {
        TLRPC.Message message;
        ag0 ag0Var = this.s;
        TLRPC.Poll poll = ag0Var.r;
        ArrayList arrayList = ag0Var.x;
        MessageObject messageObject = ag0Var.n;
        int i11 = q1Var.f;
        View view = q1Var.a;
        int i12 = 0;
        if (i11 != 2) {
            if (i11 != 3) {
                return;
            }
            zf0 zf0Var = (zf0) arrayList.get(i9 - 1);
            ((org.telegram.ui.Cells.p8) view).m(R.drawable.arrow_more, LocaleController.formatPluralString("ShowVotes", zf0Var.a - zf0Var.b(), new Object[0]), false);
            return;
        }
        yf0 yf0Var = (yf0) view;
        zf0 zf0Var2 = (zf0) arrayList.get(i9 - 1);
        ArrayList arrayList2 = zf0Var2.b;
        byte[] bArr = zf0Var2.d;
        int size = poll.answers.size();
        for (int i13 = 0; i13 < size; i13++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i13);
            if (Arrays.equals(pollAnswer.option, bArr) && ((xf0) ag0Var.w.get(zf0Var2)) != null) {
                TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                if (messageObject != null && messageObject.translated && (message = messageObject.messageOwner) != null && message.translatedPoll != null) {
                    while (true) {
                        if (i12 >= messageObject.messageOwner.translatedPoll.answers.size()) {
                            break;
                        }
                        TLRPC.PollAnswer pollAnswer2 = messageObject.messageOwner.translatedPoll.answers.get(i12);
                        if (Arrays.equals(pollAnswer2.option, pollAnswer.option)) {
                            tL_textWithEntities = pollAnswer2.text;
                            break;
                        }
                        i12++;
                    }
                }
                yf0Var.a(tL_textWithEntities == null ? "" : tL_textWithEntities.text, tL_textWithEntities == null ? null : tL_textWithEntities.entities, ag0Var.O(bArr), zf0Var2.a, zf0Var2.a(), false);
                yf0Var.setTag(R.id.object_tag, zf0Var2);
                return;
            }
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View view;
        ag0 ag0Var = this.s;
        View view2 = ag0Var.y;
        Context context = this.r;
        if (i9 == 0) {
            view = new PollVotesAlert$UserCell(ag0Var, context);
        } else if (i9 == 1) {
            ViewParent parent = view2.getParent();
            view = view2;
            if (parent != null) {
                ((ViewGroup) view2.getParent()).removeView(view2);
                view = view2;
            }
        } else if (i9 != 2) {
            org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(23, context, true);
            p8Var.setOffsetFromImage(65);
            p8Var.setBackgroundColor(ag0Var.getThemedColor(org.telegram.ui.ActionBar.f6.h5));
            p8Var.e(org.telegram.ui.ActionBar.f6.N6, org.telegram.ui.ActionBar.f6.q6);
            view = p8Var;
        } else {
            View vf0Var = new vf0(this, context);
            vf0Var.setTag(-33024);
            view = vf0Var;
        }
        return new ik0(view);
    }

    @Override // f2.r0
    public final void y(f2.q1 q1Var) {
        TLRPC.Chat chat;
        boolean z10;
        org.telegram.ui.ActionBar.b6 b6Var;
        if (q1Var.f == 0) {
            int b10 = q1Var.b();
            int S = S(b10);
            int Q = Q(b10) - 1;
            PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) q1Var.a;
            ag0 ag0Var = this.s;
            zf0 zf0Var = (zf0) ag0Var.x.get(S - 1);
            TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) zf0Var.b.get(Q);
            TLObject userOrChat = ag0Var.P().getUserOrChat(DialogObject.getPeerDialogId(messagePeerVote.peer));
            int i9 = messagePeerVote.date;
            boolean z11 = (Q == zf0Var.b() - 1 && TextUtils.isEmpty(zf0Var.c) && !zf0Var.e) ? false : true;
            o9 o9Var = pollVotesAlert$UserCell.a;
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
            long j10 = i9;
            pollVotesAlert$UserCell.d.setText(LocaleController.getInstance().getFormatterDay().format(j10 * 1000));
            pollVotesAlert$UserCell.c.setText(LocaleController.formatDate(j10, true));
            pollVotesAlert$UserCell.v = z11;
            pollVotesAlert$UserCell.x = userOrChat == null;
            pollVotesAlert$UserCell.w = Q;
            if (userOrChat == null) {
                h5Var.l("", false);
                o9Var.setImageDrawable(null);
            } else {
                int i10 = pollVotesAlert$UserCell.s;
                z8 z8Var = pollVotesAlert$UserCell.e;
                TLRPC.User user = pollVotesAlert$UserCell.h;
                if ((user == null || user.photo == null) && (chat = pollVotesAlert$UserCell.n) != null) {
                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                }
                if (user != null) {
                    z8Var.m(i10, user);
                    TLRPC.UserStatus userStatus = pollVotesAlert$UserCell.h.status;
                } else {
                    TLRPC.Chat chat2 = pollVotesAlert$UserCell.n;
                    if (chat2 != null) {
                        z8Var.k(i10, chat2);
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
                sv0 sv0Var = pollVotesAlert$UserCell.f;
                TLRPC.User user3 = pollVotesAlert$UserCell.h;
                TLRPC.Chat chat4 = pollVotesAlert$UserCell.n;
                int i11 = org.telegram.ui.ActionBar.f6.z9;
                b6Var = ((org.telegram.ui.ActionBar.f3) pollVotesAlert$UserCell.B).resourcesProvider;
                h5Var.i(sv0Var.a(user3, chat4, org.telegram.ui.ActionBar.f6.v0(i11, b6Var), z10));
                TLRPC.Chat chat5 = pollVotesAlert$UserCell.n;
                if (chat5 != null) {
                    o9Var.e(chat5, z8Var);
                } else {
                    TLRPC.User user4 = pollVotesAlert$UserCell.h;
                    if (user4 != null) {
                        o9Var.e(user4, z8Var);
                    } else {
                        o9Var.setImageDrawable(z8Var);
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
                arrayList.add(ObjectAnimator.ofFloat(o9Var, (Property<o9, Float>) property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.A.add(ObjectAnimator.ofFloat(h5Var, (Property<org.telegram.ui.ActionBar.h5, Float>) property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.A.add(ObjectAnimator.ofFloat(pollVotesAlert$UserCell, ag0.K, 1.0f, 0.0f));
            }
        }
    }
}
