package ih;

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
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.h70;
import org.telegram.ui.Components.hb0;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.ta1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class c5 extends vk0 {
    public final ArrayList c = new ArrayList();
    public final /* synthetic */ g5 d;

    public c5(g5 g5Var) {
        this.d = g5Var;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return q1Var.f == 1;
    }

    public final void E() {
        ArrayList arrayList = this.c;
        arrayList.clear();
        g5 g5Var = this.d;
        f5 f5Var = g5Var.A;
        int i9 = 0;
        if (g5Var.M) {
            arrayList.add(new x4(0));
            arrayList.add(new x4(6));
        } else {
            arrayList.add(new x4(0));
            if (f5Var != null) {
                s4 s4Var = f5Var.s;
                boolean z10 = f5Var.j;
                if (f5Var.b() <= 0 && (z10 || (!f5Var.e && !f5Var.m))) {
                    if (!TextUtils.isEmpty(s4Var.c)) {
                        arrayList.add(new x4(7));
                    } else if (z10) {
                        arrayList.add(new x4(5));
                    } else {
                        int i10 = f5Var.a;
                        if (i10 > 0 && s4Var.b) {
                            arrayList.add(new x4(8));
                        } else if (i10 > 0) {
                            arrayList.add(new x4(10));
                        } else {
                            arrayList.add(new x4(5));
                        }
                    }
                }
            }
            if (f5Var != null) {
                ArrayList arrayList2 = f5Var.g;
                ArrayList arrayList3 = f5Var.i;
                if (f5Var.f) {
                    while (i9 < arrayList3.size()) {
                        arrayList.add(new x4((TL_stories.StoryReaction) arrayList3.get(i9)));
                        i9++;
                    }
                } else {
                    while (i9 < arrayList2.size()) {
                        arrayList.add(new x4((TL_stories.StoryView) arrayList2.get(i9)));
                        i9++;
                    }
                }
            }
            if (f5Var == null || !(f5Var.e || f5Var.m)) {
                if (f5Var != null && f5Var.k) {
                    arrayList.add(new x4(11));
                } else if (f5Var != null) {
                    s4 s4Var2 = f5Var.s;
                    if (f5Var.b() < f5Var.a && TextUtils.isEmpty(s4Var2.c) && !s4Var2.b) {
                        arrayList.add(new x4(12));
                    }
                }
            } else if (f5Var.b() <= 0) {
                arrayList.add(new x4(6));
            } else {
                arrayList.add(new x4(4));
            }
        }
        arrayList.add(new x4(9));
        l();
    }

    @Override // f2.r0
    public final int h() {
        return this.c.size();
    }

    @Override // f2.r0
    public final int j(int i9) {
        return ((x4) this.c.get(i9)).a;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        TLRPC.Peer peer;
        TLRPC.Message message;
        long j10;
        TLRPC.Chat chat;
        TLRPC.User user;
        int i10;
        String str;
        long j11;
        boolean z10;
        int i11;
        int i12;
        String str2;
        TLRPC.Message message2;
        g5 g5Var = this.d;
        int i13 = g5Var.v;
        if (q1Var.f != 1 || i9 < 0) {
            return;
        }
        ArrayList arrayList = this.c;
        if (i9 >= arrayList.size()) {
            return;
        }
        x4 x4Var = (x4) arrayList.get(i9);
        org.telegram.ui.Cells.n6 n6Var = (org.telegram.ui.Cells.n6) q1Var.a;
        TL_stories.StoryView storyView = x4Var.b;
        TL_stories.StoryReaction storyReaction = x4Var.c;
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
            user = MessagesController.getInstance(i13).getUser(Long.valueOf(peerDialogId));
            j10 = peerDialogId;
            chat = null;
        } else {
            j10 = peerDialogId;
            chat = MessagesController.getInstance(i13).getChat(Long.valueOf(-peerDialogId));
            user = null;
        }
        boolean remove = g5Var.B.p.remove(Long.valueOf(j10));
        if (storyView != null) {
            TLRPC.Reaction reaction = storyView.reaction;
            if (reaction == null || (str2 = hg.r0.d(reaction).f) == null || !str2.equals("❤")) {
                j11 = 0;
                z10 = false;
            } else {
                j11 = 0;
                z10 = true;
            }
            if (storyView instanceof TL_stories.TL_storyViewPublicRepost) {
                TLRPC.User user2 = user;
                i11 = 11;
                i12 = 12;
                n6Var.c(user2, null, null, z10, 0L, storyView.story, false, true, remove);
            } else {
                TLRPC.User user3 = user;
                i11 = 11;
                i12 = 12;
                if (storyView instanceof TL_stories.TL_storyViewPublicForward) {
                    long j12 = storyView.message != null ? r10.date : j11;
                    n5 n5Var = g5Var.y;
                    n6Var.c(user3, null, null, z10, j12, n5Var == null ? null : n5Var.a, true, true, remove);
                } else {
                    n6Var.c(user3, null, z10 ? null : storyView.reaction, z10, storyView.date, null, false, true, remove);
                }
            }
            int i14 = i9 < arrayList.size() + (-1) ? ((x4) arrayList.get(i9 + 1)).a : -1;
            n6Var.a = i14 == 1 || i14 == i11 || i14 == i12;
            n6Var.a(g5Var.d(storyView) ? 1.0f : 0.5f, false);
            return;
        }
        TLRPC.User user4 = user;
        if (storyReaction != null) {
            if (storyReaction instanceof TL_stories.TL_storyReaction) {
                TL_stories.TL_storyReaction tL_storyReaction = (TL_stories.TL_storyReaction) storyReaction;
                TLRPC.Reaction reaction2 = tL_storyReaction.reaction;
                boolean z11 = (reaction2 == null || (str = hg.r0.d(reaction2).f) == null || !str.equals("❤")) ? false : true;
                i10 = 12;
                n6Var.c(user4, chat, z11 ? null : tL_storyReaction.reaction, z11, tL_storyReaction.date, null, false, true, remove);
            } else {
                i10 = 12;
                if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                    n6Var.c(user4, chat, null, false, 0L, ((TL_stories.TL_storyReactionPublicRepost) storyReaction).story, false, true, remove);
                } else if (storyReaction instanceof TL_stories.TL_storyReactionPublicForward) {
                    long j13 = storyReaction.message != null ? r7.date : 0L;
                    n5 n5Var2 = g5Var.y;
                    n6Var.c(user4, chat, null, false, j13, n5Var2 == null ? null : n5Var2.a, true, true, remove);
                }
            }
            boolean z12 = true;
            int i15 = i9 < arrayList.size() - 1 ? ((x4) arrayList.get(i9 + 1)).a : -1;
            if (i15 != 1 && i15 != 11 && i15 != i10) {
                z12 = false;
            }
            n6Var.a = z12;
            n6Var.a(1.0f, false);
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View view;
        final g5 g5Var = this.d;
        int i10 = g5Var.v;
        b bVar = g5Var.s;
        int i11 = 8;
        final int i12 = 1;
        final int i13 = 0;
        switch (i9) {
            case 0:
                view = new z4(this, g5Var.getContext(), i13);
                break;
            case 1:
                hb0 hb0Var = org.telegram.ui.Cells.n6.C;
                view = new a5(i10, g5Var.getContext(), bVar, this);
                break;
            case 2:
            case 9:
            default:
                view = new z4(this, g5Var.getContext(), i12);
                break;
            case 3:
                view = new org.telegram.ui.Cells.t3(g5Var.getContext(), 70);
                break;
            case 4:
                e00 e00Var = new e00(g5Var.getContext(), bVar);
                e00Var.setIsSingleCell(true);
                e00Var.setViewType(28);
                e00Var.w = false;
                view = e00Var;
                break;
            case 5:
            case 7:
            case 8:
            case 10:
                b5 b5Var = new b5(g5Var.B.j ? 12 : (i9 == 10 || i9 == 7 || i9 == 8 || i9 == 5) ? 1 : 0, g5Var.getContext(), bVar, this);
                dh.u uVar = b5Var.d;
                if (i9 == 7) {
                    uVar.setVisibility(8);
                    b5Var.setSubtitle(LocaleController.getString(R.string.NoResult));
                } else if (i9 == 8) {
                    uVar.setVisibility(8);
                    b5Var.setSubtitle(LocaleController.getString(R.string.NoContactsViewed));
                } else if (i9 == 10) {
                    uVar.setVisibility(0);
                    uVar.setText(LocaleController.getString(R.string.ServerErrorViewersTitle));
                    b5Var.setSubtitle(LocaleController.getString(R.string.ServerErrorViewers));
                } else if (g5Var.B.j) {
                    uVar.setVisibility(8);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.ExpiredViewsStub)));
                    boolean premiumFeaturesBlocked = MessagesController.getInstance(i10).premiumFeaturesBlocked();
                    l80 l80Var = b5Var.e;
                    if (!premiumFeaturesBlocked) {
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ExpiredViewsStubPremiumDescription), new Runnable() { // from class: ih.y4
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i13) {
                                    case 0:
                                        g5.a(g5Var);
                                        break;
                                    default:
                                        g5.a(g5Var);
                                        break;
                                }
                            }
                        }));
                        String string = LocaleController.getString(R.string.LearnMore);
                        Runnable runnable = new Runnable() { // from class: ih.y4
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i12) {
                                    case 0:
                                        g5.a(g5Var);
                                        break;
                                    default:
                                        g5.a(g5Var);
                                        break;
                                }
                            }
                        };
                        ((LinearLayout.LayoutParams) l80Var.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
                        TextView textView = new TextView(b5Var.getContext());
                        textView.setText(string);
                        int i14 = org.telegram.ui.ActionBar.f6.Sh;
                        org.telegram.ui.ActionBar.b6 b6Var = b5Var.n;
                        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(i14, b6Var));
                        textView.setPadding(AndroidUtilities.dp(45.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(45.0f), AndroidUtilities.dp(12.0f));
                        textView.setGravity(17);
                        textView.setTypeface(AndroidUtilities.bold());
                        textView.setTextSize(1, 15.0f);
                        dh.g gVar = new dh.g(b5Var.getContext(), 18);
                        gVar.setOnClickListener(new h70(runnable, 19));
                        int dp = AndroidUtilities.dp(8.0f);
                        int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, b6Var);
                        int k10 = i0.a.k(org.telegram.ui.ActionBar.f6.v0(i14, b6Var), 30);
                        gVar.setBackground(org.telegram.ui.ActionBar.f6.i0(dp, dp, dp, dp, v02, k10, k10));
                        g7.g6.b(gVar, 0.05f, 1.5f);
                        gVar.addView(textView);
                        ta1 ta1Var = b5Var.a;
                        ta1Var.setClipChildren(false);
                        ta1Var.addView(gVar, g7.e6.t(-2, -2, 1, 0, 28, 0, 4));
                    }
                    l80Var.setText(spannableStringBuilder);
                } else {
                    uVar.setVisibility(0);
                    if (g5Var.B.f) {
                        uVar.setText(LocaleController.getString(R.string.NoReactions));
                        b5Var.setSubtitle(LocaleController.getString(R.string.NoReactionsStub));
                    } else {
                        uVar.setText(LocaleController.getString(R.string.NoViews));
                        b5Var.setSubtitle(LocaleController.getString(R.string.NoViewsStub));
                    }
                }
                b5Var.e(false, false);
                view = b5Var;
                break;
            case 6:
                e00 e00Var2 = new e00(g5Var.getContext(), bVar);
                e00Var2.setIsSingleCell(true);
                e00Var2.setIgnoreHeightCheck(true);
                e00Var2.setItemsCount(20);
                e00Var2.setViewType(28);
                e00Var2.w = false;
                view = e00Var2;
                break;
            case 11:
            case 12:
                l80 l80Var2 = new l80(g5Var.getContext(), null);
                l80Var2.setTextSize(1, 13.0f);
                l80Var2.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.y6, bVar));
                l80Var2.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.J6, bVar));
                int dp2 = AndroidUtilities.dp(16.0f);
                int dp3 = AndroidUtilities.dp(21.0f);
                l80Var2.setPadding(dp3, dp2, dp3, dp2);
                l80Var2.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
                l80Var2.setGravity(17);
                l80Var2.setDisablePaddingsOffsetY(true);
                if (i9 == 11) {
                    l80Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryViewsPremiumHint), new g(this, i11)));
                } else {
                    l80Var2.setText(LocaleController.getString(R.string.ServerErrorViewersFull));
                }
                l80Var2.setLayoutParams(new f2.a1(-1, -2));
                view = l80Var2;
                break;
        }
        return new ik0(view);
    }
}
