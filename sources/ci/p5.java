package ci;

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
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.u80;
import org.telegram.ui.Components.uc0;
import org.telegram.ui.Components.x90;
import org.telegram.ui.sa1;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class p5 extends hm0 {
    public final ArrayList c = new ArrayList();
    public final /* synthetic */ u5 d;

    public p5(u5 u5Var) {
        this.d = u5Var;
    }

    @Override // org.telegram.ui.Components.hm0
    public final boolean D(s4.b1 b1Var) {
        return b1Var.f == 1;
    }

    public final void E() {
        ArrayList arrayList = this.c;
        arrayList.clear();
        u5 u5Var = this.d;
        t5 t5Var = u5Var.E;
        int i10 = 0;
        if (u5Var.Q) {
            arrayList.add(new k5(0));
            arrayList.add(new k5(6));
        } else {
            arrayList.add(new k5(0));
            if (t5Var != null) {
                f5 f5Var = t5Var.s;
                boolean z10 = t5Var.j;
                if (t5Var.b() <= 0 && (z10 || (!t5Var.e && !t5Var.m))) {
                    if (!TextUtils.isEmpty(f5Var.c)) {
                        arrayList.add(new k5(7));
                    } else if (z10) {
                        arrayList.add(new k5(5));
                    } else {
                        int i11 = t5Var.a;
                        if (i11 > 0 && f5Var.b) {
                            arrayList.add(new k5(8));
                        } else if (i11 > 0) {
                            arrayList.add(new k5(10));
                        } else {
                            arrayList.add(new k5(5));
                        }
                    }
                }
            }
            if (t5Var != null) {
                ArrayList arrayList2 = t5Var.g;
                ArrayList arrayList3 = t5Var.i;
                if (t5Var.f) {
                    while (i10 < arrayList3.size()) {
                        arrayList.add(new k5((TL_stories.StoryReaction) arrayList3.get(i10)));
                        i10++;
                    }
                } else {
                    while (i10 < arrayList2.size()) {
                        arrayList.add(new k5((TL_stories.StoryView) arrayList2.get(i10)));
                        i10++;
                    }
                }
            }
            if (t5Var == null || !(t5Var.e || t5Var.m)) {
                if (t5Var != null && t5Var.k) {
                    arrayList.add(new k5(11));
                } else if (t5Var != null) {
                    f5 f5Var2 = t5Var.s;
                    if (t5Var.b() < t5Var.a && TextUtils.isEmpty(f5Var2.c) && !f5Var2.b) {
                        arrayList.add(new k5(12));
                    }
                }
            } else if (t5Var.b() <= 0) {
                arrayList.add(new k5(6));
            } else {
                arrayList.add(new k5(4));
            }
        }
        arrayList.add(new k5(9));
        l();
    }

    @Override // s4.g0
    public final int h() {
        return this.c.size();
    }

    @Override // s4.g0
    public final int j(int i10) {
        return ((k5) this.c.get(i10)).a;
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
        u5 u5Var = this.d;
        int i14 = u5Var.v;
        if (b1Var.f != 1 || i10 < 0) {
            return;
        }
        ArrayList arrayList = this.c;
        if (i10 >= arrayList.size()) {
            return;
        }
        k5 k5Var = (k5) arrayList.get(i10);
        org.telegram.ui.Cells.n6 n6Var = (org.telegram.ui.Cells.n6) b1Var.a;
        TL_stories.StoryView storyView = k5Var.b;
        TL_stories.StoryReaction storyReaction = k5Var.c;
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
        boolean remove = u5Var.F.p.remove(Long.valueOf(j10));
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
                n6Var.c(user2, null, null, z10, 0L, storyView.story, false, true, remove);
            } else {
                TLRPC.User user3 = user;
                i12 = 12;
                i13 = 11;
                if (storyView instanceof TL_stories.TL_storyViewPublicForward) {
                    long j12 = storyView.message != null ? r10.date : j11;
                    b6 b6Var = u5Var.y;
                    n6Var.c(user3, null, null, z10, j12, b6Var == null ? null : b6Var.a, true, true, remove);
                } else {
                    n6Var.c(user3, null, z10 ? null : storyView.reaction, z10, storyView.date, null, false, true, remove);
                }
            }
            int i15 = i10 < arrayList.size() + (-1) ? ((k5) arrayList.get(i10 + 1)).a : -1;
            n6Var.a = i15 == 1 || i15 == i13 || i15 == i12;
            n6Var.a(u5Var.d(storyView) ? 1.0f : 0.5f, false);
            return;
        }
        TLRPC.User user4 = user;
        if (storyReaction != null) {
            if (storyReaction instanceof TL_stories.TL_storyReaction) {
                TL_stories.TL_storyReaction tL_storyReaction = (TL_stories.TL_storyReaction) storyReaction;
                TLRPC.Reaction reaction2 = tL_storyReaction.reaction;
                boolean z11 = (reaction2 == null || (str = ah.i1.d(reaction2).f) == null || !str.equals("❤")) ? false : true;
                i11 = 12;
                n6Var.c(user4, chat, z11 ? null : tL_storyReaction.reaction, z11, tL_storyReaction.date, null, false, true, remove);
            } else {
                i11 = 12;
                if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                    n6Var.c(user4, chat, null, false, 0L, ((TL_stories.TL_storyReactionPublicRepost) storyReaction).story, false, true, remove);
                } else if (storyReaction instanceof TL_stories.TL_storyReactionPublicForward) {
                    long j13 = storyReaction.message != null ? r7.date : 0L;
                    b6 b6Var2 = u5Var.y;
                    n6Var.c(user4, chat, null, false, j13, b6Var2 == null ? null : b6Var2.a, true, true, remove);
                }
            }
            boolean z12 = true;
            int i16 = i10 < arrayList.size() - 1 ? ((k5) arrayList.get(i10 + 1)).a : -1;
            if (i16 != 1 && i16 != 11 && i16 != i11) {
                z12 = false;
            }
            n6Var.a = z12;
            n6Var.a(1.0f, false);
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        final u5 u5Var = this.d;
        int i11 = u5Var.v;
        b bVar = u5Var.s;
        final int i12 = 1;
        final int i13 = 0;
        switch (i10) {
            case 0:
                view = new m5(this, u5Var.getContext(), i13);
                break;
            case 1:
                uc0 uc0Var = org.telegram.ui.Cells.n6.H;
                view = new n5(i11, u5Var.getContext(), bVar, this);
                break;
            case 2:
            case 9:
            default:
                view = new m5(this, u5Var.getContext(), i12);
                break;
            case 3:
                view = new org.telegram.ui.Cells.s3(u5Var.getContext(), 70);
                break;
            case 4:
                b10 b10Var = new b10(u5Var.getContext(), bVar);
                b10Var.setIsSingleCell(true);
                b10Var.setViewType(28);
                b10Var.w = false;
                view = b10Var;
                break;
            case 5:
            case 7:
            case 8:
            case 10:
                o5 o5Var = new o5(u5Var.F.j ? 12 : (i10 == 10 || i10 == 7 || i10 == 8 || i10 == 5) ? 1 : 0, u5Var.getContext(), bVar, this);
                wh.n nVar = o5Var.d;
                if (i10 == 7) {
                    nVar.setVisibility(8);
                    o5Var.setSubtitle(LocaleController.getString(R.string.NoResult));
                } else if (i10 == 8) {
                    nVar.setVisibility(8);
                    o5Var.setSubtitle(LocaleController.getString(R.string.NoContactsViewed));
                } else if (i10 == 10) {
                    nVar.setVisibility(0);
                    nVar.setText(LocaleController.getString(R.string.ServerErrorViewersTitle));
                    o5Var.setSubtitle(LocaleController.getString(R.string.ServerErrorViewers));
                } else if (u5Var.F.j) {
                    nVar.setVisibility(8);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.ExpiredViewsStub)));
                    boolean premiumFeaturesBlocked = MessagesController.getInstance(i11).premiumFeaturesBlocked();
                    x90 x90Var = o5Var.e;
                    if (!premiumFeaturesBlocked) {
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ExpiredViewsStubPremiumDescription), new Runnable() { // from class: ci.l5
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i13) {
                                    case 0:
                                        u5.a(u5Var);
                                        break;
                                    default:
                                        u5.a(u5Var);
                                        break;
                                }
                            }
                        }));
                        String string = LocaleController.getString(R.string.LearnMore);
                        Runnable runnable = new Runnable() { // from class: ci.l5
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i12) {
                                    case 0:
                                        u5.a(u5Var);
                                        break;
                                    default:
                                        u5.a(u5Var);
                                        break;
                                }
                            }
                        };
                        ((LinearLayout.LayoutParams) x90Var.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
                        TextView textView = new TextView(o5Var.getContext());
                        textView.setText(string);
                        int i14 = org.telegram.ui.ActionBar.h6.Sh;
                        org.telegram.ui.ActionBar.d6 d6Var = o5Var.n;
                        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(i14, d6Var));
                        textView.setPadding(AndroidUtilities.dp(45.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(45.0f), AndroidUtilities.dp(12.0f));
                        textView.setGravity(17);
                        textView.setTypeface(AndroidUtilities.bold());
                        textView.setTextSize(1, 15.0f);
                        i4 i4Var = new i4(o5Var.getContext(), 19);
                        i4Var.setOnClickListener(new u80(runnable, 18));
                        int dp = AndroidUtilities.dp(8.0f);
                        int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, d6Var);
                        int o10 = i0.a.o(org.telegram.ui.ActionBar.h6.w0(i14, d6Var), 30);
                        i4Var.setBackground(org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, w02, o10, o10));
                        w7.b6.b(i4Var, 0.05f, 1.5f);
                        i4Var.addView(textView);
                        sa1 sa1Var = o5Var.a;
                        sa1Var.setClipChildren(false);
                        sa1Var.addView(i4Var, w7.z5.t(-2, -2, 1, 0, 28, 0, 4));
                    }
                    x90Var.setText(spannableStringBuilder);
                } else {
                    nVar.setVisibility(0);
                    if (u5Var.F.f) {
                        nVar.setText(LocaleController.getString(R.string.NoReactions));
                        o5Var.setSubtitle(LocaleController.getString(R.string.NoReactionsStub));
                    } else {
                        nVar.setText(LocaleController.getString(R.string.NoViews));
                        o5Var.setSubtitle(LocaleController.getString(R.string.NoViewsStub));
                    }
                }
                o5Var.e(false, false);
                view = o5Var;
                break;
            case 6:
                b10 b10Var2 = new b10(u5Var.getContext(), bVar);
                b10Var2.setIsSingleCell(true);
                b10Var2.setIgnoreHeightCheck(true);
                b10Var2.setItemsCount(20);
                b10Var2.setViewType(28);
                b10Var2.w = false;
                view = b10Var2;
                break;
            case 11:
            case 12:
                x90 x90Var2 = new x90(u5Var.getContext(), null);
                x90Var2.setTextSize(1, 13.0f);
                x90Var2.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.y6, bVar));
                x90Var2.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.J6, bVar));
                int dp2 = AndroidUtilities.dp(16.0f);
                int dp3 = AndroidUtilities.dp(21.0f);
                x90Var2.setPadding(dp3, dp2, dp3, dp2);
                x90Var2.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
                x90Var2.setGravity(17);
                x90Var2.setDisablePaddingsOffsetY(true);
                if (i10 == 11) {
                    x90Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryViewsPremiumHint), new androidx.fragment.app.d(this, 14)));
                } else {
                    x90Var2.setText(LocaleController.getString(R.string.ServerErrorViewersFull));
                }
                x90Var2.setLayoutParams(new s4.o0(-1, -2));
                view = x90Var2;
                break;
        }
        return new sl0(view);
    }
}
