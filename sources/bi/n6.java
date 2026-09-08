package bi;

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
import org.telegram.ui.Components.bc0;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.x70;
import org.telegram.ui.cc1;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class n6 extends kl0 {
    public final ArrayList c = new ArrayList();
    public final /* synthetic */ s6 d;

    public n6(s6 s6Var) {
        this.d = s6Var;
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 1;
    }

    public final void E() {
        ArrayList arrayList = this.c;
        arrayList.clear();
        s6 s6Var = this.d;
        r6 r6Var = s6Var.E;
        int i10 = 0;
        if (s6Var.Q) {
            arrayList.add(new i6(0));
            arrayList.add(new i6(6));
        } else {
            arrayList.add(new i6(0));
            if (r6Var != null) {
                d6 d6Var = r6Var.s;
                boolean z10 = r6Var.j;
                if (r6Var.b() <= 0 && (z10 || (!r6Var.e && !r6Var.m))) {
                    if (!TextUtils.isEmpty(d6Var.c)) {
                        arrayList.add(new i6(7));
                    } else if (z10) {
                        arrayList.add(new i6(5));
                    } else {
                        int i11 = r6Var.a;
                        if (i11 > 0 && d6Var.b) {
                            arrayList.add(new i6(8));
                        } else if (i11 > 0) {
                            arrayList.add(new i6(10));
                        } else {
                            arrayList.add(new i6(5));
                        }
                    }
                }
            }
            if (r6Var != null) {
                ArrayList arrayList2 = r6Var.g;
                ArrayList arrayList3 = r6Var.i;
                if (r6Var.f) {
                    while (i10 < arrayList3.size()) {
                        arrayList.add(new i6((TL_stories.StoryReaction) arrayList3.get(i10)));
                        i10++;
                    }
                } else {
                    while (i10 < arrayList2.size()) {
                        arrayList.add(new i6((TL_stories.StoryView) arrayList2.get(i10)));
                        i10++;
                    }
                }
            }
            if (r6Var == null || !(r6Var.e || r6Var.m)) {
                if (r6Var != null && r6Var.k) {
                    arrayList.add(new i6(11));
                } else if (r6Var != null) {
                    d6 d6Var2 = r6Var.s;
                    if (r6Var.b() < r6Var.a && TextUtils.isEmpty(d6Var2.c) && !d6Var2.b) {
                        arrayList.add(new i6(12));
                    }
                }
            } else if (r6Var.b() <= 0) {
                arrayList.add(new i6(6));
            } else {
                arrayList.add(new i6(4));
            }
        }
        arrayList.add(new i6(9));
        l();
    }

    @Override // s4.h0
    public final int h() {
        return this.c.size();
    }

    @Override // s4.h0
    public final int j(int i10) {
        return ((i6) this.c.get(i10)).a;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        TLRPC.Peer peer;
        TLRPC.Message message;
        long j3;
        TLRPC.Chat chat;
        TLRPC.User user;
        int i11;
        String str;
        long j10;
        boolean z10;
        int i12;
        int i13;
        String str2;
        TLRPC.Message message2;
        s6 s6Var = this.d;
        int i14 = s6Var.v;
        if (c1Var.f != 1 || i10 < 0) {
            return;
        }
        ArrayList arrayList = this.c;
        if (i10 >= arrayList.size()) {
            return;
        }
        i6 i6Var = (i6) arrayList.get(i10);
        org.telegram.ui.Cells.n6 n6Var = (org.telegram.ui.Cells.n6) c1Var.a;
        TL_stories.StoryView storyView = i6Var.b;
        TL_stories.StoryReaction storyReaction = i6Var.c;
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
            j3 = peerDialogId;
            chat = null;
        } else {
            j3 = peerDialogId;
            chat = MessagesController.getInstance(i14).getChat(Long.valueOf(-peerDialogId));
            user = null;
        }
        boolean remove = s6Var.F.p.remove(Long.valueOf(j3));
        if (storyView != null) {
            TLRPC.Reaction reaction = storyView.reaction;
            if (reaction == null || (str2 = ah.j1.d(reaction).f) == null || !str2.equals("❤")) {
                j10 = 0;
                z10 = false;
            } else {
                j10 = 0;
                z10 = true;
            }
            if (storyView instanceof TL_stories.TL_storyViewPublicRepost) {
                TLRPC.User user2 = user;
                i12 = 11;
                i13 = 12;
                n6Var.c(user2, null, null, z10, 0L, storyView.story, false, true, remove);
            } else {
                TLRPC.User user3 = user;
                i12 = 11;
                i13 = 12;
                if (storyView instanceof TL_stories.TL_storyViewPublicForward) {
                    long j11 = storyView.message != null ? r10.date : j10;
                    z6 z6Var = s6Var.y;
                    n6Var.c(user3, null, null, z10, j11, z6Var == null ? null : z6Var.a, true, true, remove);
                } else {
                    n6Var.c(user3, null, z10 ? null : storyView.reaction, z10, storyView.date, null, false, true, remove);
                }
            }
            int i15 = i10 < arrayList.size() + (-1) ? ((i6) arrayList.get(i10 + 1)).a : -1;
            n6Var.a = i15 == 1 || i15 == i12 || i15 == i13;
            n6Var.a(s6Var.d(storyView) ? 1.0f : 0.5f, false);
            return;
        }
        TLRPC.User user4 = user;
        if (storyReaction != null) {
            if (storyReaction instanceof TL_stories.TL_storyReaction) {
                TL_stories.TL_storyReaction tL_storyReaction = (TL_stories.TL_storyReaction) storyReaction;
                TLRPC.Reaction reaction2 = tL_storyReaction.reaction;
                boolean z11 = (reaction2 == null || (str = ah.j1.d(reaction2).f) == null || !str.equals("❤")) ? false : true;
                i11 = 12;
                n6Var.c(user4, chat, z11 ? null : tL_storyReaction.reaction, z11, tL_storyReaction.date, null, false, true, remove);
            } else {
                i11 = 12;
                if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                    n6Var.c(user4, chat, null, false, 0L, ((TL_stories.TL_storyReactionPublicRepost) storyReaction).story, false, true, remove);
                } else if (storyReaction instanceof TL_stories.TL_storyReactionPublicForward) {
                    long j12 = storyReaction.message != null ? r7.date : 0L;
                    z6 z6Var2 = s6Var.y;
                    n6Var.c(user4, chat, null, false, j12, z6Var2 == null ? null : z6Var2.a, true, true, remove);
                }
            }
            boolean z12 = true;
            int i16 = i10 < arrayList.size() - 1 ? ((i6) arrayList.get(i10 + 1)).a : -1;
            if (i16 != 1 && i16 != 11 && i16 != i11) {
                z12 = false;
            }
            n6Var.a = z12;
            n6Var.a(1.0f, false);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        final s6 s6Var = this.d;
        int i11 = s6Var.v;
        b bVar = s6Var.s;
        final int i12 = 1;
        final int i13 = 0;
        switch (i10) {
            case 0:
                view = new k6(this, s6Var.getContext(), i13);
                break;
            case 1:
                bc0 bc0Var = org.telegram.ui.Cells.n6.G;
                view = new l6(i11, s6Var.getContext(), bVar, this);
                break;
            case 2:
            case 9:
            default:
                view = new k6(this, s6Var.getContext(), i12);
                break;
            case 3:
                view = new org.telegram.ui.Cells.s3(s6Var.getContext(), 70);
                break;
            case 4:
                t00 t00Var = new t00(s6Var.getContext(), bVar);
                t00Var.setIsSingleCell(true);
                t00Var.setViewType(28);
                t00Var.w = false;
                view = t00Var;
                break;
            case 5:
            case 7:
            case 8:
            case 10:
                m6 m6Var = new m6(s6Var.F.j ? 12 : (i10 == 10 || i10 == 7 || i10 == 8 || i10 == 5) ? 1 : 0, s6Var.getContext(), bVar, this);
                wh.p pVar = m6Var.d;
                if (i10 == 7) {
                    pVar.setVisibility(8);
                    m6Var.setSubtitle(LocaleController.getString(R.string.NoResult));
                } else if (i10 == 8) {
                    pVar.setVisibility(8);
                    m6Var.setSubtitle(LocaleController.getString(R.string.NoContactsViewed));
                } else if (i10 == 10) {
                    pVar.setVisibility(0);
                    pVar.setText(LocaleController.getString(R.string.ServerErrorViewersTitle));
                    m6Var.setSubtitle(LocaleController.getString(R.string.ServerErrorViewers));
                } else if (s6Var.F.j) {
                    pVar.setVisibility(8);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.ExpiredViewsStub)));
                    boolean premiumFeaturesBlocked = MessagesController.getInstance(i11).premiumFeaturesBlocked();
                    d90 d90Var = m6Var.e;
                    if (!premiumFeaturesBlocked) {
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ExpiredViewsStubPremiumDescription), new Runnable() { // from class: bi.j6
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i13) {
                                    case 0:
                                        s6.a(s6Var);
                                        break;
                                    default:
                                        s6.a(s6Var);
                                        break;
                                }
                            }
                        }));
                        String string = LocaleController.getString(R.string.LearnMore);
                        Runnable runnable = new Runnable() { // from class: bi.j6
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i12) {
                                    case 0:
                                        s6.a(s6Var);
                                        break;
                                    default:
                                        s6.a(s6Var);
                                        break;
                                }
                            }
                        };
                        ((LinearLayout.LayoutParams) d90Var.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
                        TextView textView = new TextView(m6Var.getContext());
                        textView.setText(string);
                        int i14 = org.telegram.ui.ActionBar.j6.Sh;
                        org.telegram.ui.ActionBar.f6 f6Var = m6Var.n;
                        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i14, f6Var));
                        textView.setPadding(AndroidUtilities.dp(45.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(45.0f), AndroidUtilities.dp(12.0f));
                        textView.setGravity(17);
                        textView.setTypeface(AndroidUtilities.bold());
                        textView.setTextSize(1, 15.0f);
                        g5 g5Var = new g5(m6Var.getContext(), 19);
                        g5Var.setOnClickListener(new x70(runnable, 19));
                        int dp = AndroidUtilities.dp(8.0f);
                        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var);
                        int k10 = i0.a.k(org.telegram.ui.ActionBar.j6.v0(i14, f6Var), 30);
                        g5Var.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, v02, k10, k10));
                        w7.z5.b(g5Var, 0.05f, 1.5f);
                        g5Var.addView(textView);
                        cc1 cc1Var = m6Var.a;
                        cc1Var.setClipChildren(false);
                        cc1Var.addView(g5Var, w7.x5.t(-2, -2, 1, 0, 28, 0, 4));
                    }
                    d90Var.setText(spannableStringBuilder);
                } else {
                    pVar.setVisibility(0);
                    if (s6Var.F.f) {
                        pVar.setText(LocaleController.getString(R.string.NoReactions));
                        m6Var.setSubtitle(LocaleController.getString(R.string.NoReactionsStub));
                    } else {
                        pVar.setText(LocaleController.getString(R.string.NoViews));
                        m6Var.setSubtitle(LocaleController.getString(R.string.NoViewsStub));
                    }
                }
                m6Var.e(false, false);
                view = m6Var;
                break;
            case 6:
                t00 t00Var2 = new t00(s6Var.getContext(), bVar);
                t00Var2.setIsSingleCell(true);
                t00Var2.setIgnoreHeightCheck(true);
                t00Var2.setItemsCount(20);
                t00Var2.setViewType(28);
                t00Var2.w = false;
                view = t00Var2;
                break;
            case 11:
            case 12:
                d90 d90Var2 = new d90(s6Var.getContext(), null);
                d90Var2.setTextSize(1, 13.0f);
                d90Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.y6, bVar));
                d90Var2.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.J6, bVar));
                int dp2 = AndroidUtilities.dp(16.0f);
                int dp3 = AndroidUtilities.dp(21.0f);
                d90Var2.setPadding(dp3, dp2, dp3, dp2);
                d90Var2.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
                d90Var2.setGravity(17);
                d90Var2.setDisablePaddingsOffsetY(true);
                if (i10 == 11) {
                    d90Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryViewsPremiumHint), new a3.d(this, 20)));
                } else {
                    d90Var2.setText(LocaleController.getString(R.string.ServerErrorViewersFull));
                }
                d90Var2.setLayoutParams(new s4.p0(-1, -2));
                view = d90Var2;
                break;
        }
        return new vk0(view);
    }
}
