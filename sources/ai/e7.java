package ai;

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
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.lc0;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.ub1;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final class e7 extends vl0 {
    public final ArrayList c = new ArrayList();
    public final /* synthetic */ k7 d;

    public e7(k7 k7Var) {
        this.d = k7Var;
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 1;
    }

    public final void E() {
        ArrayList arrayList = this.c;
        arrayList.clear();
        k7 k7Var = this.d;
        j7 j7Var = k7Var.E;
        int i10 = 0;
        if (k7Var.Q) {
            arrayList.add(new z6(0));
            arrayList.add(new z6(6));
        } else {
            arrayList.add(new z6(0));
            if (j7Var != null) {
                u6 u6Var = j7Var.s;
                boolean z10 = j7Var.j;
                if (j7Var.b() <= 0 && (z10 || (!j7Var.e && !j7Var.m))) {
                    if (!TextUtils.isEmpty(u6Var.c)) {
                        arrayList.add(new z6(7));
                    } else if (z10) {
                        arrayList.add(new z6(5));
                    } else {
                        int i11 = j7Var.a;
                        if (i11 > 0 && u6Var.b) {
                            arrayList.add(new z6(8));
                        } else if (i11 > 0) {
                            arrayList.add(new z6(10));
                        } else {
                            arrayList.add(new z6(5));
                        }
                    }
                }
            }
            if (j7Var != null) {
                ArrayList arrayList2 = j7Var.g;
                ArrayList arrayList3 = j7Var.i;
                if (j7Var.f) {
                    while (i10 < arrayList3.size()) {
                        arrayList.add(new z6((TL_stories.StoryReaction) arrayList3.get(i10)));
                        i10++;
                    }
                } else {
                    while (i10 < arrayList2.size()) {
                        arrayList.add(new z6((TL_stories.StoryView) arrayList2.get(i10)));
                        i10++;
                    }
                }
            }
            if (j7Var == null || !(j7Var.e || j7Var.m)) {
                if (j7Var != null && j7Var.k) {
                    arrayList.add(new z6(11));
                } else if (j7Var != null) {
                    u6 u6Var2 = j7Var.s;
                    if (j7Var.b() < j7Var.a && TextUtils.isEmpty(u6Var2.c) && !u6Var2.b) {
                        arrayList.add(new z6(12));
                    }
                }
            } else if (j7Var.b() <= 0) {
                arrayList.add(new z6(6));
            } else {
                arrayList.add(new z6(4));
            }
        }
        arrayList.add(new z6(9));
        l();
    }

    @Override // s4.h0
    public final int h() {
        return this.c.size();
    }

    @Override // s4.h0
    public final int j(int i10) {
        return ((z6) this.c.get(i10)).a;
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
        k7 k7Var = this.d;
        int i14 = k7Var.v;
        if (c1Var.f != 1 || i10 < 0) {
            return;
        }
        ArrayList arrayList = this.c;
        if (i10 >= arrayList.size()) {
            return;
        }
        z6 z6Var = (z6) arrayList.get(i10);
        org.telegram.ui.Cells.o6 o6Var = (org.telegram.ui.Cells.o6) c1Var.a;
        TL_stories.StoryView storyView = z6Var.b;
        TL_stories.StoryReaction storyReaction = z6Var.c;
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
        boolean remove = k7Var.F.p.remove(Long.valueOf(j3));
        if (storyView != null) {
            TLRPC.Reaction reaction = storyView.reaction;
            if (reaction == null || (str2 = zg.o0.d(reaction).f) == null || !str2.equals("❤")) {
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
                o6Var.c(user2, null, null, z10, 0L, storyView.story, false, true, remove);
            } else {
                TLRPC.User user3 = user;
                i12 = 11;
                i13 = 12;
                if (storyView instanceof TL_stories.TL_storyViewPublicForward) {
                    long j11 = storyView.message != null ? r10.date : j10;
                    r7 r7Var = k7Var.y;
                    o6Var.c(user3, null, null, z10, j11, r7Var == null ? null : r7Var.a, true, true, remove);
                } else {
                    o6Var.c(user3, null, z10 ? null : storyView.reaction, z10, storyView.date, null, false, true, remove);
                }
            }
            int i15 = i10 < arrayList.size() + (-1) ? ((z6) arrayList.get(i10 + 1)).a : -1;
            o6Var.a = i15 == 1 || i15 == i12 || i15 == i13;
            o6Var.a(k7Var.d(storyView) ? 1.0f : 0.5f, false);
            return;
        }
        TLRPC.User user4 = user;
        if (storyReaction != null) {
            if (storyReaction instanceof TL_stories.TL_storyReaction) {
                TL_stories.TL_storyReaction tL_storyReaction = (TL_stories.TL_storyReaction) storyReaction;
                TLRPC.Reaction reaction2 = tL_storyReaction.reaction;
                boolean z11 = (reaction2 == null || (str = zg.o0.d(reaction2).f) == null || !str.equals("❤")) ? false : true;
                i11 = 12;
                o6Var.c(user4, chat, z11 ? null : tL_storyReaction.reaction, z11, tL_storyReaction.date, null, false, true, remove);
            } else {
                i11 = 12;
                if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                    o6Var.c(user4, chat, null, false, 0L, ((TL_stories.TL_storyReactionPublicRepost) storyReaction).story, false, true, remove);
                } else if (storyReaction instanceof TL_stories.TL_storyReactionPublicForward) {
                    long j12 = storyReaction.message != null ? r7.date : 0L;
                    r7 r7Var2 = k7Var.y;
                    o6Var.c(user4, chat, null, false, j12, r7Var2 == null ? null : r7Var2.a, true, true, remove);
                }
            }
            boolean z12 = true;
            int i16 = i10 < arrayList.size() - 1 ? ((z6) arrayList.get(i10 + 1)).a : -1;
            if (i16 != 1 && i16 != 11 && i16 != i11) {
                z12 = false;
            }
            o6Var.a = z12;
            o6Var.a(1.0f, false);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        final k7 k7Var = this.d;
        int i11 = k7Var.v;
        d dVar = k7Var.s;
        final int i12 = 1;
        final int i13 = 0;
        switch (i10) {
            case 0:
                view = new b7(this, k7Var.getContext(), i13);
                break;
            case 1:
                lc0 lc0Var = org.telegram.ui.Cells.o6.G;
                view = new c7(i11, dVar, this, k7Var.getContext());
                break;
            case 2:
            case 9:
            default:
                view = new b7(this, k7Var.getContext(), i12);
                break;
            case 3:
                view = new org.telegram.ui.Cells.t3(k7Var.getContext(), 70);
                break;
            case 4:
                u00 u00Var = new u00(k7Var.getContext(), dVar);
                u00Var.setIsSingleCell(true);
                u00Var.setViewType(28);
                u00Var.w = false;
                view = u00Var;
                break;
            case 5:
            case 7:
            case 8:
            case 10:
                d7 d7Var = new d7(k7Var.F.j ? 12 : (i10 == 10 || i10 == 7 || i10 == 8 || i10 == 5) ? 1 : 0, dVar, this, k7Var.getContext());
                vh.n nVar = d7Var.d;
                if (i10 == 7) {
                    nVar.setVisibility(8);
                    d7Var.setSubtitle(LocaleController.getString(R.string.NoResult));
                } else if (i10 == 8) {
                    nVar.setVisibility(8);
                    d7Var.setSubtitle(LocaleController.getString(R.string.NoContactsViewed));
                } else if (i10 == 10) {
                    nVar.setVisibility(0);
                    nVar.setText(LocaleController.getString(R.string.ServerErrorViewersTitle));
                    d7Var.setSubtitle(LocaleController.getString(R.string.ServerErrorViewers));
                } else if (k7Var.F.j) {
                    nVar.setVisibility(8);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.ExpiredViewsStub)));
                    boolean premiumFeaturesBlocked = MessagesController.getInstance(i11).premiumFeaturesBlocked();
                    n90 n90Var = d7Var.e;
                    if (!premiumFeaturesBlocked) {
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ExpiredViewsStubPremiumDescription), new Runnable() { // from class: ai.a7
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i13) {
                                    case 0:
                                        k7.a(k7Var);
                                        break;
                                    default:
                                        k7.a(k7Var);
                                        break;
                                }
                            }
                        }));
                        String string = LocaleController.getString(R.string.LearnMore);
                        Runnable runnable = new Runnable() { // from class: ai.a7
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i12) {
                                    case 0:
                                        k7.a(k7Var);
                                        break;
                                    default:
                                        k7.a(k7Var);
                                        break;
                                }
                            }
                        };
                        ((LinearLayout.LayoutParams) n90Var.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
                        TextView textView = new TextView(d7Var.getContext());
                        textView.setText(string);
                        int i14 = org.telegram.ui.ActionBar.h6.Sh;
                        org.telegram.ui.ActionBar.d6 d6Var = d7Var.n;
                        textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(i14, d6Var));
                        textView.setPadding(AndroidUtilities.dp(45.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(45.0f), AndroidUtilities.dp(12.0f));
                        textView.setGravity(17);
                        textView.setTypeface(AndroidUtilities.bold());
                        textView.setTextSize(1, 15.0f);
                        w5 w5Var = new w5(d7Var.getContext(), 19);
                        w5Var.setOnClickListener(new i80(runnable, 19));
                        int dp = AndroidUtilities.dp(8.0f);
                        int v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Oh, d6Var);
                        int k10 = i0.a.k(org.telegram.ui.ActionBar.h6.v0(i14, d6Var), 30);
                        w5Var.setBackground(org.telegram.ui.ActionBar.h6.i0(dp, dp, dp, dp, v02, k10, k10));
                        w7.a6.b(w5Var, 0.05f, 1.5f);
                        w5Var.addView(textView);
                        ub1 ub1Var = d7Var.a;
                        ub1Var.setClipChildren(false);
                        ub1Var.addView(w5Var, w7.y5.t(-2, -2, 1, 0, 28, 0, 4));
                    }
                    n90Var.setText(spannableStringBuilder);
                } else {
                    nVar.setVisibility(0);
                    if (k7Var.F.f) {
                        nVar.setText(LocaleController.getString(R.string.NoReactions));
                        d7Var.setSubtitle(LocaleController.getString(R.string.NoReactionsStub));
                    } else {
                        nVar.setText(LocaleController.getString(R.string.NoViews));
                        d7Var.setSubtitle(LocaleController.getString(R.string.NoViewsStub));
                    }
                }
                d7Var.e(false, false);
                view = d7Var;
                break;
            case 6:
                u00 u00Var2 = new u00(k7Var.getContext(), dVar);
                u00Var2.setIsSingleCell(true);
                u00Var2.setIgnoreHeightCheck(true);
                u00Var2.setItemsCount(20);
                u00Var2.setViewType(28);
                u00Var2.w = false;
                view = u00Var2;
                break;
            case 11:
            case 12:
                n90 n90Var2 = new n90(k7Var.getContext(), null);
                n90Var2.setTextSize(1, 13.0f);
                n90Var2.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.y6, dVar));
                n90Var2.setLinkTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.J6, dVar));
                int dp2 = AndroidUtilities.dp(16.0f);
                int dp3 = AndroidUtilities.dp(21.0f);
                n90Var2.setPadding(dp3, dp2, dp3, dp2);
                n90Var2.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
                n90Var2.setGravity(17);
                n90Var2.setDisablePaddingsOffsetY(true);
                if (i10 == 11) {
                    n90Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryViewsPremiumHint), new a3.d(this, 10)));
                } else {
                    n90Var2.setText(LocaleController.getString(R.string.ServerErrorViewersFull));
                }
                n90Var2.setLayoutParams(new s4.p0(-1, -2));
                view = n90Var2;
                break;
        }
        return new gl0(view);
    }
}
