package oh;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.u00;
import org.telegram.ui.ob1;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class a5 extends rl0 {
    public final ArrayList c = new ArrayList();
    public final /* synthetic */ e5 d;

    public a5(e5 e5Var) {
        this.d = e5Var;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.m1 m1Var) {
        return m1Var.f == 1;
    }

    public final void E() {
        ArrayList arrayList = this.c;
        arrayList.clear();
        e5 e5Var = this.d;
        d5 d5Var = e5Var.B;
        int i10 = 0;
        if (e5Var.N) {
            arrayList.add(new v4(0));
            arrayList.add(new v4(6));
        } else {
            arrayList.add(new v4(0));
            if (d5Var != null) {
                q4 q4Var = d5Var.s;
                boolean z4 = d5Var.j;
                if (d5Var.b() <= 0 && (z4 || (!d5Var.e && !d5Var.m))) {
                    if (!TextUtils.isEmpty(q4Var.c)) {
                        arrayList.add(new v4(7));
                    } else if (z4) {
                        arrayList.add(new v4(5));
                    } else {
                        int i11 = d5Var.a;
                        if (i11 > 0 && q4Var.b) {
                            arrayList.add(new v4(8));
                        } else if (i11 > 0) {
                            arrayList.add(new v4(10));
                        } else {
                            arrayList.add(new v4(5));
                        }
                    }
                }
            }
            if (d5Var != null) {
                ArrayList arrayList2 = d5Var.g;
                ArrayList arrayList3 = d5Var.i;
                if (d5Var.f) {
                    while (i10 < arrayList3.size()) {
                        arrayList.add(new v4((TL_stories.StoryReaction) arrayList3.get(i10)));
                        i10++;
                    }
                } else {
                    while (i10 < arrayList2.size()) {
                        arrayList.add(new v4((TL_stories.StoryView) arrayList2.get(i10)));
                        i10++;
                    }
                }
            }
            if (d5Var == null || !(d5Var.e || d5Var.m)) {
                if (d5Var != null && d5Var.k) {
                    arrayList.add(new v4(11));
                } else if (d5Var != null) {
                    q4 q4Var2 = d5Var.s;
                    if (d5Var.b() < d5Var.a && TextUtils.isEmpty(q4Var2.c) && !q4Var2.b) {
                        arrayList.add(new v4(12));
                    }
                }
            } else if (d5Var.b() <= 0) {
                arrayList.add(new v4(6));
            } else {
                arrayList.add(new v4(4));
            }
        }
        arrayList.add(new v4(9));
        l();
    }

    @Override // f2.p0
    public final int h() {
        return this.c.size();
    }

    @Override // f2.p0
    public final int j(int i10) {
        return ((v4) this.c.get(i10)).a;
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        TLRPC.Peer peer;
        TLRPC.Message message;
        long j10;
        TLRPC.Chat chat;
        TLRPC.User user;
        int i11;
        String str;
        long j11;
        boolean z4;
        int i12;
        int i13;
        String str2;
        TLRPC.Message message2;
        e5 e5Var = this.d;
        int i14 = e5Var.v;
        if (m1Var.f != 1 || i10 < 0) {
            return;
        }
        ArrayList arrayList = this.c;
        if (i10 >= arrayList.size()) {
            return;
        }
        v4 v4Var = (v4) arrayList.get(i10);
        org.telegram.ui.Cells.n6 n6Var = (org.telegram.ui.Cells.n6) m1Var.a;
        TL_stories.StoryView storyView = v4Var.b;
        TL_stories.StoryReaction storyReaction = v4Var.c;
        if (storyView != null) {
            if (storyView instanceof TL_stories.TL_storyViewPublicRepost) {
                peer = storyView.peer_id;
            } else if (!(storyView instanceof TL_stories.TL_storyViewPublicForward) || (message2 = storyView.message) == null) {
                peer = new TLRPC.TL_peerUser();
                peer.user_id = storyView.user_id;
            } else {
                peer = message2.peer_id;
            }
        } else if (storyReaction != null) {
            peer = storyReaction.peer_id;
            if ((storyReaction instanceof TL_stories.TL_storyReactionPublicForward) && (message = storyReaction.message) != null) {
                peer = message.peer_id;
            }
        } else {
            peer = null;
        }
        long peerDialogId = DialogObject.getPeerDialogId(peer);
        if (peerDialogId >= 0) {
            user = MessagesController.getInstance(i14).getUser(Long.valueOf(peerDialogId));
            j10 = peerDialogId;
            chat = null;
        } else {
            j10 = peerDialogId;
            chat = MessagesController.getInstance(i14).getChat(Long.valueOf(-peerDialogId));
            user = null;
        }
        boolean remove = e5Var.C.p.remove(Long.valueOf(j10));
        if (storyView != null) {
            TLRPC.Reaction reaction = storyView.reaction;
            if (reaction == null || (str2 = ng.q0.d(reaction).f) == null || !str2.equals("❤")) {
                j11 = 0;
                z4 = false;
            } else {
                j11 = 0;
                z4 = true;
            }
            if (storyView instanceof TL_stories.TL_storyViewPublicRepost) {
                TLRPC.User user2 = user;
                i12 = 11;
                i13 = 12;
                n6Var.c(user2, null, null, z4, 0L, storyView.story, false, true, remove);
            } else {
                TLRPC.User user3 = user;
                i12 = 11;
                i13 = 12;
                if (storyView instanceof TL_stories.TL_storyViewPublicForward) {
                    long j12 = storyView.message != null ? r10.date : j11;
                    m5 m5Var = e5Var.y;
                    n6Var.c(user3, null, null, z4, j12, m5Var == null ? null : m5Var.a, true, true, remove);
                } else {
                    n6Var.c(user3, null, z4 ? null : storyView.reaction, z4, storyView.date, null, false, true, remove);
                }
            }
            int i15 = i10 < arrayList.size() + (-1) ? ((v4) arrayList.get(i10 + 1)).a : -1;
            n6Var.a = i15 == 1 || i15 == i12 || i15 == i13;
            n6Var.a(e5Var.d(storyView) ? 1.0f : 0.5f, false);
            return;
        }
        TLRPC.User user4 = user;
        if (storyReaction != null) {
            if (storyReaction instanceof TL_stories.TL_storyReaction) {
                TL_stories.TL_storyReaction tL_storyReaction = (TL_stories.TL_storyReaction) storyReaction;
                TLRPC.Reaction reaction2 = tL_storyReaction.reaction;
                boolean z10 = (reaction2 == null || (str = ng.q0.d(reaction2).f) == null || !str.equals("❤")) ? false : true;
                i11 = 12;
                n6Var.c(user4, chat, z10 ? null : tL_storyReaction.reaction, z10, tL_storyReaction.date, null, false, true, remove);
            } else {
                i11 = 12;
                if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                    n6Var.c(user4, chat, null, false, 0L, ((TL_stories.TL_storyReactionPublicRepost) storyReaction).story, false, true, remove);
                } else if (storyReaction instanceof TL_stories.TL_storyReactionPublicForward) {
                    long j13 = storyReaction.message != null ? r7.date : 0L;
                    m5 m5Var2 = e5Var.y;
                    n6Var.c(user4, chat, null, false, j13, m5Var2 == null ? null : m5Var2.a, true, true, remove);
                }
            }
            boolean z11 = true;
            int i16 = i10 < arrayList.size() - 1 ? ((v4) arrayList.get(i10 + 1)).a : -1;
            if (i16 != 1 && i16 != 11 && i16 != i11) {
                z11 = false;
            }
            n6Var.a = z11;
            n6Var.a(1.0f, false);
        }
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View view;
        final e5 e5Var = this.d;
        int i11 = e5Var.v;
        b bVar = e5Var.s;
        final int i12 = 1;
        final int i13 = 0;
        switch (i10) {
            case 0:
                view = new x4(this, e5Var.getContext(), i13);
                break;
            case 1:
                dc0 dc0Var = org.telegram.ui.Cells.n6.D;
                view = new y4(i11, e5Var.getContext(), bVar, this);
                break;
            case 2:
            case 9:
            default:
                view = new x4(this, e5Var.getContext(), i12);
                break;
            case 3:
                view = new org.telegram.ui.Cells.s3(e5Var.getContext(), 70);
                break;
            case 4:
                u00 u00Var = new u00(e5Var.getContext(), bVar);
                u00Var.setIsSingleCell(true);
                u00Var.setViewType(28);
                u00Var.w = false;
                view = u00Var;
                break;
            case 5:
            case 7:
            case 8:
            case 10:
                z4 z4Var = new z4(e5Var.C.j ? 12 : (i10 == 10 || i10 == 7 || i10 == 8 || i10 == 5) ? 1 : 0, e5Var.getContext(), bVar, this);
                jh.s sVar = z4Var.d;
                if (i10 == 7) {
                    sVar.setVisibility(8);
                    z4Var.setSubtitle(LocaleController.getString(R.string.NoResult));
                } else if (i10 == 8) {
                    sVar.setVisibility(8);
                    z4Var.setSubtitle(LocaleController.getString(R.string.NoContactsViewed));
                } else if (i10 == 10) {
                    sVar.setVisibility(0);
                    sVar.setText(LocaleController.getString(R.string.ServerErrorViewersTitle));
                    z4Var.setSubtitle(LocaleController.getString(R.string.ServerErrorViewers));
                } else if (e5Var.C.j) {
                    sVar.setVisibility(8);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.ExpiredViewsStub)));
                    boolean premiumFeaturesBlocked = MessagesController.getInstance(i11).premiumFeaturesBlocked();
                    g90 g90Var = z4Var.e;
                    if (!premiumFeaturesBlocked) {
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ExpiredViewsStubPremiumDescription), new Runnable() { // from class: oh.w4
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i13) {
                                    case 0:
                                        e5.a(e5Var);
                                        break;
                                    default:
                                        e5.a(e5Var);
                                        break;
                                }
                            }
                        }));
                        String string = LocaleController.getString(R.string.LearnMore);
                        Runnable runnable = new Runnable() { // from class: oh.w4
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i12) {
                                    case 0:
                                        e5.a(e5Var);
                                        break;
                                    default:
                                        e5.a(e5Var);
                                        break;
                                }
                            }
                        };
                        ((LinearLayout.LayoutParams) g90Var.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
                        TextView textView = new TextView(z4Var.getContext());
                        textView.setText(string);
                        int i14 = org.telegram.ui.ActionBar.k6.Sh;
                        org.telegram.ui.ActionBar.g6 g6Var = z4Var.n;
                        textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(i14, g6Var));
                        textView.setPadding(AndroidUtilities.dp(45.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(45.0f), AndroidUtilities.dp(12.0f));
                        textView.setGravity(17);
                        textView.setTypeface(AndroidUtilities.bold());
                        textView.setTextSize(1, 15.0f);
                        eh.d dVar = new eh.d(z4Var.getContext(), 19);
                        dVar.setOnClickListener(new b80(runnable, 19));
                        int dp = AndroidUtilities.dp(8.0f);
                        int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Oh, g6Var);
                        int k10 = i0.a.k(org.telegram.ui.ActionBar.k6.v0(i14, g6Var), 30);
                        dVar.setBackground(org.telegram.ui.ActionBar.k6.i0(dp, dp, dp, dp, v02, k10, k10));
                        k7.e6.b(dVar, 0.05f, 1.5f);
                        dVar.addView(textView);
                        ob1 ob1Var = z4Var.a;
                        ob1Var.setClipChildren(false);
                        ob1Var.addView(dVar, k7.c6.t(-2, -2, 1, 0, 28, 0, 4));
                    }
                    g90Var.setText(spannableStringBuilder);
                } else {
                    sVar.setVisibility(0);
                    if (e5Var.C.f) {
                        sVar.setText(LocaleController.getString(R.string.NoReactions));
                        z4Var.setSubtitle(LocaleController.getString(R.string.NoReactionsStub));
                    } else {
                        sVar.setText(LocaleController.getString(R.string.NoViews));
                        z4Var.setSubtitle(LocaleController.getString(R.string.NoViewsStub));
                    }
                }
                z4Var.e(false, false);
                view = z4Var;
                break;
            case 6:
                u00 u00Var2 = new u00(e5Var.getContext(), bVar);
                u00Var2.setIsSingleCell(true);
                u00Var2.setIgnoreHeightCheck(true);
                u00Var2.setItemsCount(20);
                u00Var2.setViewType(28);
                u00Var2.w = false;
                view = u00Var2;
                break;
            case 11:
            case 12:
                g90 g90Var2 = new g90(e5Var.getContext(), null);
                g90Var2.setTextSize(1, 13.0f);
                g90Var2.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.y6, bVar));
                g90Var2.setLinkTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.J6, bVar));
                int dp2 = AndroidUtilities.dp(16.0f);
                int dp3 = AndroidUtilities.dp(21.0f);
                g90Var2.setPadding(dp3, dp2, dp3, dp2);
                g90Var2.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
                g90Var2.setGravity(17);
                g90Var2.setDisablePaddingsOffsetY(true);
                if (i10 == 11) {
                    g90Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryViewsPremiumHint), new t3(this, 2)));
                } else {
                    g90Var2.setText(LocaleController.getString(R.string.ServerErrorViewersFull));
                }
                g90Var2.setLayoutParams(new f2.x0(-1, -2));
                view = g90Var2;
                break;
        }
        return new el0(view);
    }
}
