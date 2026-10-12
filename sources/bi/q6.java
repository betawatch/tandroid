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
import org.telegram.ui.Components.bd0;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.z80;
import org.telegram.ui.ic1;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class q6 extends lm0 {
    public final ArrayList c = new ArrayList();
    public final /* synthetic */ w6 d;

    public q6(w6 w6Var) {
        this.d = w6Var;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        return b1Var.f == 1;
    }

    public final void E() {
        ArrayList arrayList = this.c;
        arrayList.clear();
        w6 w6Var = this.d;
        v6 v6Var = w6Var.E;
        int i10 = 0;
        if (w6Var.Q) {
            arrayList.add(new l6(0));
            arrayList.add(new l6(6));
        } else {
            arrayList.add(new l6(0));
            if (v6Var != null) {
                g6 g6Var = v6Var.s;
                boolean z10 = v6Var.j;
                if (v6Var.b() <= 0 && (z10 || (!v6Var.e && !v6Var.m))) {
                    if (!TextUtils.isEmpty(g6Var.c)) {
                        arrayList.add(new l6(7));
                    } else if (z10) {
                        arrayList.add(new l6(5));
                    } else {
                        int i11 = v6Var.a;
                        if (i11 > 0 && g6Var.b) {
                            arrayList.add(new l6(8));
                        } else if (i11 > 0) {
                            arrayList.add(new l6(10));
                        } else {
                            arrayList.add(new l6(5));
                        }
                    }
                }
            }
            if (v6Var != null) {
                ArrayList arrayList2 = v6Var.g;
                ArrayList arrayList3 = v6Var.i;
                if (v6Var.f) {
                    while (i10 < arrayList3.size()) {
                        arrayList.add(new l6((TL_stories.StoryReaction) arrayList3.get(i10)));
                        i10++;
                    }
                } else {
                    while (i10 < arrayList2.size()) {
                        arrayList.add(new l6((TL_stories.StoryView) arrayList2.get(i10)));
                        i10++;
                    }
                }
            }
            if (v6Var == null || !(v6Var.e || v6Var.m)) {
                if (v6Var != null && v6Var.k) {
                    arrayList.add(new l6(11));
                } else if (v6Var != null) {
                    g6 g6Var2 = v6Var.s;
                    if (v6Var.b() < v6Var.a && TextUtils.isEmpty(g6Var2.c) && !g6Var2.b) {
                        arrayList.add(new l6(12));
                    }
                }
            } else if (v6Var.b() <= 0) {
                arrayList.add(new l6(6));
            } else {
                arrayList.add(new l6(4));
            }
        }
        arrayList.add(new l6(9));
        l();
    }

    @Override // s4.g0
    public final int h() {
        return this.c.size();
    }

    @Override // s4.g0
    public final int j(int i10) {
        return ((l6) this.c.get(i10)).a;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        TLRPC.Peer peer;
        TLRPC.Message message;
        long j10;
        TLRPC.Chat chat;
        TLRPC.User user;
        int i11;
        String str;
        long j11;
        boolean z10;
        int i12;
        int i13;
        String str2;
        TLRPC.Message message2;
        w6 w6Var = this.d;
        int i14 = w6Var.v;
        if (b1Var.f != 1 || i10 < 0) {
            return;
        }
        ArrayList arrayList = this.c;
        if (i10 >= arrayList.size()) {
            return;
        }
        l6 l6Var = (l6) arrayList.get(i10);
        org.telegram.ui.Cells.o6 o6Var = (org.telegram.ui.Cells.o6) b1Var.a;
        TL_stories.StoryView storyView = l6Var.b;
        TL_stories.StoryReaction storyReaction = l6Var.c;
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
        boolean remove = w6Var.F.p.remove(Long.valueOf(j10));
        if (storyView != null) {
            TLRPC.Reaction reaction = storyView.reaction;
            if (reaction == null || (str2 = ah.i1.d(reaction).f) == null || !str2.equals("❤")) {
                j11 = 0;
                z10 = false;
            } else {
                j11 = 0;
                z10 = true;
            }
            if (storyView instanceof TL_stories.TL_storyViewPublicRepost) {
                TLRPC.User user2 = user;
                i13 = 11;
                i12 = 12;
                o6Var.c(user2, null, null, z10, 0L, storyView.story, false, true, remove);
            } else {
                TLRPC.User user3 = user;
                i12 = 12;
                i13 = 11;
                if (storyView instanceof TL_stories.TL_storyViewPublicForward) {
                    long j12 = storyView.message != null ? r10.date : j11;
                    d7 d7Var = w6Var.y;
                    o6Var.c(user3, null, null, z10, j12, d7Var == null ? null : d7Var.a, true, true, remove);
                } else {
                    o6Var.c(user3, null, z10 ? null : storyView.reaction, z10, storyView.date, null, false, true, remove);
                }
            }
            int i15 = i10 < arrayList.size() + (-1) ? ((l6) arrayList.get(i10 + 1)).a : -1;
            o6Var.a = i15 == 1 || i15 == i13 || i15 == i12;
            o6Var.a(w6Var.d(storyView) ? 1.0f : 0.5f, false);
            return;
        }
        TLRPC.User user4 = user;
        if (storyReaction != null) {
            if (storyReaction instanceof TL_stories.TL_storyReaction) {
                TL_stories.TL_storyReaction tL_storyReaction = (TL_stories.TL_storyReaction) storyReaction;
                TLRPC.Reaction reaction2 = tL_storyReaction.reaction;
                boolean z11 = (reaction2 == null || (str = ah.i1.d(reaction2).f) == null || !str.equals("❤")) ? false : true;
                i11 = 12;
                o6Var.c(user4, chat, z11 ? null : tL_storyReaction.reaction, z11, tL_storyReaction.date, null, false, true, remove);
            } else {
                i11 = 12;
                if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                    o6Var.c(user4, chat, null, false, 0L, ((TL_stories.TL_storyReactionPublicRepost) storyReaction).story, false, true, remove);
                } else if (storyReaction instanceof TL_stories.TL_storyReactionPublicForward) {
                    long j13 = storyReaction.message != null ? r7.date : 0L;
                    d7 d7Var2 = w6Var.y;
                    o6Var.c(user4, chat, null, false, j13, d7Var2 == null ? null : d7Var2.a, true, true, remove);
                }
            }
            boolean z12 = true;
            int i16 = i10 < arrayList.size() - 1 ? ((l6) arrayList.get(i10 + 1)).a : -1;
            if (i16 != 1 && i16 != 11 && i16 != i11) {
                z12 = false;
            }
            o6Var.a = z12;
            o6Var.a(1.0f, false);
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        final w6 w6Var = this.d;
        int i11 = w6Var.v;
        b bVar = w6Var.s;
        final int i12 = 1;
        final int i13 = 0;
        switch (i10) {
            case 0:
                view = new n6(this, w6Var.getContext(), i13);
                break;
            case 1:
                bd0 bd0Var = org.telegram.ui.Cells.o6.H;
                view = new o6(i11, w6Var.getContext(), bVar, this);
                break;
            case 2:
            case 9:
            default:
                view = new n6(this, w6Var.getContext(), i12);
                break;
            case 3:
                view = new org.telegram.ui.Cells.t3(w6Var.getContext(), 70);
                break;
            case 4:
                f10 f10Var = new f10(w6Var.getContext(), bVar);
                f10Var.setIsSingleCell(true);
                f10Var.setViewType(28);
                f10Var.w = false;
                view = f10Var;
                break;
            case 5:
            case 7:
            case 8:
            case 10:
                p6 p6Var = new p6(w6Var.F.j ? 12 : (i10 == 10 || i10 == 7 || i10 == 8 || i10 == 5) ? 1 : 0, w6Var.getContext(), bVar, this);
                wh.n nVar = p6Var.d;
                if (i10 == 7) {
                    nVar.setVisibility(8);
                    p6Var.setSubtitle(LocaleController.getString(R.string.NoResult));
                } else if (i10 == 8) {
                    nVar.setVisibility(8);
                    p6Var.setSubtitle(LocaleController.getString(R.string.NoContactsViewed));
                } else if (i10 == 10) {
                    nVar.setVisibility(0);
                    nVar.setText(LocaleController.getString(R.string.ServerErrorViewersTitle));
                    p6Var.setSubtitle(LocaleController.getString(R.string.ServerErrorViewers));
                } else if (w6Var.F.j) {
                    nVar.setVisibility(8);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.ExpiredViewsStub)));
                    boolean premiumFeaturesBlocked = MessagesController.getInstance(i11).premiumFeaturesBlocked();
                    da0 da0Var = p6Var.e;
                    if (!premiumFeaturesBlocked) {
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ExpiredViewsStubPremiumDescription), new Runnable() { // from class: bi.m6
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i13) {
                                    case 0:
                                        w6.a(w6Var);
                                        break;
                                    default:
                                        w6.a(w6Var);
                                        break;
                                }
                            }
                        }));
                        String string = LocaleController.getString(R.string.LearnMore);
                        Runnable runnable = new Runnable() { // from class: bi.m6
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i12) {
                                    case 0:
                                        w6.a(w6Var);
                                        break;
                                    default:
                                        w6.a(w6Var);
                                        break;
                                }
                            }
                        };
                        ((LinearLayout.LayoutParams) da0Var.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
                        TextView textView = new TextView(p6Var.getContext());
                        textView.setText(string);
                        int i14 = org.telegram.ui.ActionBar.g6.Sh;
                        org.telegram.ui.ActionBar.c6 c6Var = p6Var.n;
                        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(i14, c6Var));
                        textView.setPadding(AndroidUtilities.dp(45.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(45.0f), AndroidUtilities.dp(12.0f));
                        textView.setGravity(17);
                        textView.setTypeface(AndroidUtilities.bold());
                        textView.setTextSize(1, 15.0f);
                        i5 i5Var = new i5(p6Var.getContext(), 19);
                        i5Var.setOnClickListener(new z80(runnable, 18));
                        int dp = AndroidUtilities.dp(8.0f);
                        int w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, c6Var);
                        int k10 = i0.a.k(org.telegram.ui.ActionBar.g6.w0(i14, c6Var), 30);
                        i5Var.setBackground(org.telegram.ui.ActionBar.g6.j0(dp, dp, dp, dp, w02, k10, k10));
                        w7.c6.b(i5Var, 0.05f, 1.5f);
                        i5Var.addView(textView);
                        ic1 ic1Var = p6Var.a;
                        ic1Var.setClipChildren(false);
                        ic1Var.addView(i5Var, w7.a6.t(-2, -2, 1, 0, 28, 0, 4));
                    }
                    da0Var.setText(spannableStringBuilder);
                } else {
                    nVar.setVisibility(0);
                    if (w6Var.F.f) {
                        nVar.setText(LocaleController.getString(R.string.NoReactions));
                        p6Var.setSubtitle(LocaleController.getString(R.string.NoReactionsStub));
                    } else {
                        nVar.setText(LocaleController.getString(R.string.NoViews));
                        p6Var.setSubtitle(LocaleController.getString(R.string.NoViewsStub));
                    }
                }
                p6Var.e(false, false);
                view = p6Var;
                break;
            case 6:
                f10 f10Var2 = new f10(w6Var.getContext(), bVar);
                f10Var2.setIsSingleCell(true);
                f10Var2.setIgnoreHeightCheck(true);
                f10Var2.setItemsCount(20);
                f10Var2.setViewType(28);
                f10Var2.w = false;
                view = f10Var2;
                break;
            case 11:
            case 12:
                da0 da0Var2 = new da0(w6Var.getContext(), null);
                da0Var2.setTextSize(1, 13.0f);
                da0Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.y6, bVar));
                da0Var2.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.J6, bVar));
                int dp2 = AndroidUtilities.dp(16.0f);
                int dp3 = AndroidUtilities.dp(21.0f);
                da0Var2.setPadding(dp3, dp2, dp3, dp2);
                da0Var2.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
                da0Var2.setGravity(17);
                da0Var2.setDisablePaddingsOffsetY(true);
                if (i10 == 11) {
                    da0Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryViewsPremiumHint), new a3.d(this, 21)));
                } else {
                    da0Var2.setText(LocaleController.getString(R.string.ServerErrorViewersFull));
                }
                da0Var2.setLayoutParams(new s4.o0(-1, -2));
                view = da0Var2;
                break;
        }
        return new wl0(view);
    }
}
