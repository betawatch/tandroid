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
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.v80;
import org.telegram.ui.Components.wc0;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.y90;
import org.telegram.ui.va1;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class o5 extends lm0 {
    public final ArrayList c = new ArrayList();
    public final /* synthetic */ t5 d;

    public o5(t5 t5Var) {
        this.d = t5Var;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        return b1Var.f == 1;
    }

    public final void E() {
        ArrayList arrayList = this.c;
        arrayList.clear();
        t5 t5Var = this.d;
        s5 s5Var = t5Var.E;
        int i10 = 0;
        if (t5Var.Q) {
            arrayList.add(new j5(0));
            arrayList.add(new j5(6));
        } else {
            arrayList.add(new j5(0));
            if (s5Var != null) {
                e5 e5Var = s5Var.s;
                boolean z10 = s5Var.j;
                if (s5Var.b() <= 0 && (z10 || (!s5Var.e && !s5Var.m))) {
                    if (!TextUtils.isEmpty(e5Var.c)) {
                        arrayList.add(new j5(7));
                    } else if (z10) {
                        arrayList.add(new j5(5));
                    } else {
                        int i11 = s5Var.a;
                        if (i11 > 0 && e5Var.b) {
                            arrayList.add(new j5(8));
                        } else if (i11 > 0) {
                            arrayList.add(new j5(10));
                        } else {
                            arrayList.add(new j5(5));
                        }
                    }
                }
            }
            if (s5Var != null) {
                ArrayList arrayList2 = s5Var.g;
                ArrayList arrayList3 = s5Var.i;
                if (s5Var.f) {
                    while (i10 < arrayList3.size()) {
                        arrayList.add(new j5((TL_stories.StoryReaction) arrayList3.get(i10)));
                        i10++;
                    }
                } else {
                    while (i10 < arrayList2.size()) {
                        arrayList.add(new j5((TL_stories.StoryView) arrayList2.get(i10)));
                        i10++;
                    }
                }
            }
            if (s5Var == null || !(s5Var.e || s5Var.m)) {
                if (s5Var != null && s5Var.k) {
                    arrayList.add(new j5(11));
                } else if (s5Var != null) {
                    e5 e5Var2 = s5Var.s;
                    if (s5Var.b() < s5Var.a && TextUtils.isEmpty(e5Var2.c) && !e5Var2.b) {
                        arrayList.add(new j5(12));
                    }
                }
            } else if (s5Var.b() <= 0) {
                arrayList.add(new j5(6));
            } else {
                arrayList.add(new j5(4));
            }
        }
        arrayList.add(new j5(9));
        l();
    }

    @Override // s4.g0
    public final int h() {
        return this.c.size();
    }

    @Override // s4.g0
    public final int j(int i10) {
        return ((j5) this.c.get(i10)).a;
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
        t5 t5Var = this.d;
        int i14 = t5Var.v;
        if (b1Var.f != 1 || i10 < 0) {
            return;
        }
        ArrayList arrayList = this.c;
        if (i10 >= arrayList.size()) {
            return;
        }
        j5 j5Var = (j5) arrayList.get(i10);
        org.telegram.ui.Cells.o6 o6Var = (org.telegram.ui.Cells.o6) b1Var.a;
        TL_stories.StoryView storyView = j5Var.b;
        TL_stories.StoryReaction storyReaction = j5Var.c;
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
        boolean remove = t5Var.F.p.remove(Long.valueOf(j10));
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
                    a6 a6Var = t5Var.y;
                    o6Var.c(user3, null, null, z10, j12, a6Var == null ? null : a6Var.a, true, true, remove);
                } else {
                    o6Var.c(user3, null, z10 ? null : storyView.reaction, z10, storyView.date, null, false, true, remove);
                }
            }
            int i15 = i10 < arrayList.size() + (-1) ? ((j5) arrayList.get(i10 + 1)).a : -1;
            o6Var.a = i15 == 1 || i15 == i13 || i15 == i12;
            o6Var.a(t5Var.d(storyView) ? 1.0f : 0.5f, false);
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
                    a6 a6Var2 = t5Var.y;
                    o6Var.c(user4, chat, null, false, j13, a6Var2 == null ? null : a6Var2.a, true, true, remove);
                }
            }
            boolean z12 = true;
            int i16 = i10 < arrayList.size() - 1 ? ((j5) arrayList.get(i10 + 1)).a : -1;
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
        final t5 t5Var = this.d;
        int i11 = t5Var.v;
        b bVar = t5Var.s;
        final int i12 = 1;
        final int i13 = 0;
        switch (i10) {
            case 0:
                view = new l5(this, t5Var.getContext(), i13);
                break;
            case 1:
                wc0 wc0Var = org.telegram.ui.Cells.o6.H;
                view = new m5(i11, t5Var.getContext(), bVar, this);
                break;
            case 2:
            case 9:
            default:
                view = new l5(this, t5Var.getContext(), i12);
                break;
            case 3:
                view = new org.telegram.ui.Cells.s3(t5Var.getContext(), 70);
                break;
            case 4:
                b10 b10Var = new b10(t5Var.getContext(), bVar);
                b10Var.setIsSingleCell(true);
                b10Var.setViewType(28);
                b10Var.w = false;
                view = b10Var;
                break;
            case 5:
            case 7:
            case 8:
            case 10:
                n5 n5Var = new n5(t5Var.F.j ? 12 : (i10 == 10 || i10 == 7 || i10 == 8 || i10 == 5) ? 1 : 0, t5Var.getContext(), bVar, this);
                wh.n nVar = n5Var.d;
                if (i10 == 7) {
                    nVar.setVisibility(8);
                    n5Var.setSubtitle(LocaleController.getString(R.string.NoResult));
                } else if (i10 == 8) {
                    nVar.setVisibility(8);
                    n5Var.setSubtitle(LocaleController.getString(R.string.NoContactsViewed));
                } else if (i10 == 10) {
                    nVar.setVisibility(0);
                    nVar.setText(LocaleController.getString(R.string.ServerErrorViewersTitle));
                    n5Var.setSubtitle(LocaleController.getString(R.string.ServerErrorViewers));
                } else if (t5Var.F.j) {
                    nVar.setVisibility(8);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.ExpiredViewsStub)));
                    boolean premiumFeaturesBlocked = MessagesController.getInstance(i11).premiumFeaturesBlocked();
                    y90 y90Var = n5Var.e;
                    if (!premiumFeaturesBlocked) {
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ExpiredViewsStubPremiumDescription), new Runnable() { // from class: ci.k5
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i13) {
                                    case 0:
                                        t5.a(t5Var);
                                        break;
                                    default:
                                        t5.a(t5Var);
                                        break;
                                }
                            }
                        }));
                        String string = LocaleController.getString(R.string.LearnMore);
                        Runnable runnable = new Runnable() { // from class: ci.k5
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i12) {
                                    case 0:
                                        t5.a(t5Var);
                                        break;
                                    default:
                                        t5.a(t5Var);
                                        break;
                                }
                            }
                        };
                        ((LinearLayout.LayoutParams) y90Var.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
                        TextView textView = new TextView(n5Var.getContext());
                        textView.setText(string);
                        int i14 = org.telegram.ui.ActionBar.k6.Sh;
                        org.telegram.ui.ActionBar.g6 g6Var = n5Var.n;
                        org.telegram.ui.ActionBar.r6.W(textView, i14, g6Var);
                        textView.setPadding(AndroidUtilities.dp(45.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(45.0f), AndroidUtilities.dp(12.0f));
                        textView.setGravity(17);
                        textView.setTypeface(AndroidUtilities.bold());
                        textView.setTextSize(1, 15.0f);
                        h4 h4Var = new h4(n5Var.getContext(), 19);
                        h4Var.setOnClickListener(new v80(runnable, 18));
                        int dp = AndroidUtilities.dp(8.0f);
                        int i15 = org.telegram.ui.ActionBar.k6.Oh;
                        int w02 = org.telegram.ui.ActionBar.k6.w0(i15, g6Var);
                        int o10 = i0.a.o(org.telegram.ui.ActionBar.k6.w0(i14, g6Var), 30);
                        org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.k6.j0(dp, dp, dp, dp, w02, o10, o10);
                        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i15);
                        org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i14, 30);
                        h4Var.setBackground(j02);
                        org.telegram.ui.ActionBar.r6.k(h4Var, j02, O, h, g6Var);
                        w7.b6.b(h4Var, 0.05f, 1.5f);
                        h4Var.addView(textView);
                        va1 va1Var = n5Var.a;
                        va1Var.setClipChildren(false);
                        va1Var.addView(h4Var, w7.z5.t(-2, -2, 1, 0, 28, 0, 4));
                    }
                    y90Var.setText(spannableStringBuilder);
                } else {
                    nVar.setVisibility(0);
                    if (t5Var.F.f) {
                        nVar.setText(LocaleController.getString(R.string.NoReactions));
                        n5Var.setSubtitle(LocaleController.getString(R.string.NoReactionsStub));
                    } else {
                        nVar.setText(LocaleController.getString(R.string.NoViews));
                        n5Var.setSubtitle(LocaleController.getString(R.string.NoViewsStub));
                    }
                }
                n5Var.e(false, false);
                view = n5Var;
                break;
            case 6:
                b10 b10Var2 = new b10(t5Var.getContext(), bVar);
                b10Var2.setIsSingleCell(true);
                b10Var2.setIgnoreHeightCheck(true);
                b10Var2.setItemsCount(20);
                b10Var2.setViewType(28);
                b10Var2.w = false;
                view = b10Var2;
                break;
            case 11:
            case 12:
                y90 y90Var2 = new y90(t5Var.getContext(), null);
                y90Var2.setTextSize(1, 13.0f);
                org.telegram.ui.ActionBar.r6.W(y90Var2, org.telegram.ui.ActionBar.k6.y6, bVar);
                org.telegram.ui.ActionBar.r6.I(y90Var2, org.telegram.ui.ActionBar.k6.J6, bVar);
                int dp2 = AndroidUtilities.dp(16.0f);
                int dp3 = AndroidUtilities.dp(21.0f);
                y90Var2.setPadding(dp3, dp2, dp3, dp2);
                y90Var2.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
                y90Var2.setGravity(17);
                y90Var2.setDisablePaddingsOffsetY(true);
                if (i10 == 11) {
                    y90Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryViewsPremiumHint), new androidx.fragment.app.d(this, 14)));
                } else {
                    y90Var2.setText(LocaleController.getString(R.string.ServerErrorViewersFull));
                }
                y90Var2.setLayoutParams(new s4.o0(-1, -2));
                view = y90Var2;
                break;
        }
        return new wl0(view);
    }
}
