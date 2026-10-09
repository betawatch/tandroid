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
import org.telegram.ui.Components.ad0;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.b90;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.j10;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.dc1;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class f7 extends pm0 {
    public final ArrayList c = new ArrayList();
    public final /* synthetic */ l7 d;

    public f7(l7 l7Var) {
        this.d = l7Var;
    }

    @Override // org.telegram.ui.Components.pm0
    public final boolean D(s4.d1 d1Var) {
        return d1Var.f == 1;
    }

    public final void E() {
        ArrayList arrayList = this.c;
        arrayList.clear();
        l7 l7Var = this.d;
        k7 k7Var = l7Var.E;
        int i10 = 0;
        if (l7Var.Q) {
            arrayList.add(new a7(0));
            arrayList.add(new a7(6));
        } else {
            arrayList.add(new a7(0));
            if (k7Var != null) {
                v6 v6Var = k7Var.s;
                boolean z10 = k7Var.j;
                if (k7Var.b() <= 0 && (z10 || (!k7Var.e && !k7Var.m))) {
                    if (!TextUtils.isEmpty(v6Var.c)) {
                        arrayList.add(new a7(7));
                    } else if (z10) {
                        arrayList.add(new a7(5));
                    } else {
                        int i11 = k7Var.a;
                        if (i11 > 0 && v6Var.b) {
                            arrayList.add(new a7(8));
                        } else if (i11 > 0) {
                            arrayList.add(new a7(10));
                        } else {
                            arrayList.add(new a7(5));
                        }
                    }
                }
            }
            if (k7Var != null) {
                ArrayList arrayList2 = k7Var.g;
                ArrayList arrayList3 = k7Var.i;
                if (k7Var.f) {
                    while (i10 < arrayList3.size()) {
                        arrayList.add(new a7((TL_stories.StoryReaction) arrayList3.get(i10)));
                        i10++;
                    }
                } else {
                    while (i10 < arrayList2.size()) {
                        arrayList.add(new a7((TL_stories.StoryView) arrayList2.get(i10)));
                        i10++;
                    }
                }
            }
            if (k7Var == null || !(k7Var.e || k7Var.m)) {
                if (k7Var != null && k7Var.k) {
                    arrayList.add(new a7(11));
                } else if (k7Var != null) {
                    v6 v6Var2 = k7Var.s;
                    if (k7Var.b() < k7Var.a && TextUtils.isEmpty(v6Var2.c) && !v6Var2.b) {
                        arrayList.add(new a7(12));
                    }
                }
            } else if (k7Var.b() <= 0) {
                arrayList.add(new a7(6));
            } else {
                arrayList.add(new a7(4));
            }
        }
        arrayList.add(new a7(9));
        l();
    }

    @Override // s4.i0
    public final int h() {
        return this.c.size();
    }

    @Override // s4.i0
    public final int j(int i10) {
        return ((a7) this.c.get(i10)).a;
    }

    @Override // s4.i0
    public final void v(s4.d1 d1Var, int i10) {
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
        l7 l7Var = this.d;
        int i14 = l7Var.v;
        if (d1Var.f != 1 || i10 < 0) {
            return;
        }
        ArrayList arrayList = this.c;
        if (i10 >= arrayList.size()) {
            return;
        }
        a7 a7Var = (a7) arrayList.get(i10);
        org.telegram.ui.Cells.o6 o6Var = (org.telegram.ui.Cells.o6) d1Var.a;
        TL_stories.StoryView storyView = a7Var.b;
        TL_stories.StoryReaction storyReaction = a7Var.c;
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
        boolean remove = l7Var.F.p.remove(Long.valueOf(j3));
        if (storyView != null) {
            TLRPC.Reaction reaction = storyView.reaction;
            if (reaction == null || (str2 = zg.n0.d(reaction).f) == null || !str2.equals("❤")) {
                j10 = 0;
                z10 = false;
            } else {
                j10 = 0;
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
                    long j11 = storyView.message != null ? r10.date : j10;
                    s7 s7Var = l7Var.y;
                    o6Var.c(user3, null, null, z10, j11, s7Var == null ? null : s7Var.a, true, true, remove);
                } else {
                    o6Var.c(user3, null, z10 ? null : storyView.reaction, z10, storyView.date, null, false, true, remove);
                }
            }
            int i15 = i10 < arrayList.size() + (-1) ? ((a7) arrayList.get(i10 + 1)).a : -1;
            o6Var.a = i15 == 1 || i15 == i13 || i15 == i12;
            o6Var.a(l7Var.d(storyView) ? 1.0f : 0.5f, false);
            return;
        }
        TLRPC.User user4 = user;
        if (storyReaction != null) {
            if (storyReaction instanceof TL_stories.TL_storyReaction) {
                TL_stories.TL_storyReaction tL_storyReaction = (TL_stories.TL_storyReaction) storyReaction;
                TLRPC.Reaction reaction2 = tL_storyReaction.reaction;
                boolean z11 = (reaction2 == null || (str = zg.n0.d(reaction2).f) == null || !str.equals("❤")) ? false : true;
                i11 = 12;
                o6Var.c(user4, chat, z11 ? null : tL_storyReaction.reaction, z11, tL_storyReaction.date, null, false, true, remove);
            } else {
                i11 = 12;
                if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                    o6Var.c(user4, chat, null, false, 0L, ((TL_stories.TL_storyReactionPublicRepost) storyReaction).story, false, true, remove);
                } else if (storyReaction instanceof TL_stories.TL_storyReactionPublicForward) {
                    long j12 = storyReaction.message != null ? r7.date : 0L;
                    s7 s7Var2 = l7Var.y;
                    o6Var.c(user4, chat, null, false, j12, s7Var2 == null ? null : s7Var2.a, true, true, remove);
                }
            }
            boolean z12 = true;
            int i16 = i10 < arrayList.size() - 1 ? ((a7) arrayList.get(i10 + 1)).a : -1;
            if (i16 != 1 && i16 != 11 && i16 != i11) {
                z12 = false;
            }
            o6Var.a = z12;
            o6Var.a(1.0f, false);
        }
    }

    @Override // s4.i0
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View view;
        final l7 l7Var = this.d;
        int i11 = l7Var.v;
        d dVar = l7Var.s;
        final int i12 = 1;
        final int i13 = 0;
        switch (i10) {
            case 0:
                view = new c7(this, l7Var.getContext(), i13);
                break;
            case 1:
                ad0 ad0Var = org.telegram.ui.Cells.o6.H;
                view = new d7(i11, dVar, this, l7Var.getContext());
                break;
            case 2:
            case 9:
            default:
                view = new c7(this, l7Var.getContext(), i12);
                break;
            case 3:
                view = new org.telegram.ui.Cells.t3(l7Var.getContext(), 70);
                break;
            case 4:
                j10 j10Var = new j10(l7Var.getContext(), dVar);
                j10Var.setIsSingleCell(true);
                j10Var.setViewType(28);
                j10Var.w = false;
                view = j10Var;
                break;
            case 5:
            case 7:
            case 8:
            case 10:
                e7 e7Var = new e7(l7Var.F.j ? 12 : (i10 == 10 || i10 == 7 || i10 == 8 || i10 == 5) ? 1 : 0, dVar, this, l7Var.getContext());
                vh.n nVar = e7Var.d;
                if (i10 == 7) {
                    nVar.setVisibility(8);
                    e7Var.setSubtitle(LocaleController.getString(R.string.NoResult));
                } else if (i10 == 8) {
                    nVar.setVisibility(8);
                    e7Var.setSubtitle(LocaleController.getString(R.string.NoContactsViewed));
                } else if (i10 == 10) {
                    nVar.setVisibility(0);
                    nVar.setText(LocaleController.getString(R.string.ServerErrorViewersTitle));
                    e7Var.setSubtitle(LocaleController.getString(R.string.ServerErrorViewers));
                } else if (l7Var.F.j) {
                    nVar.setVisibility(8);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.ExpiredViewsStub)));
                    boolean premiumFeaturesBlocked = MessagesController.getInstance(i11).premiumFeaturesBlocked();
                    ea0 ea0Var = e7Var.e;
                    if (!premiumFeaturesBlocked) {
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ExpiredViewsStubPremiumDescription), new Runnable() { // from class: ai.b7
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i13) {
                                    case 0:
                                        l7.a(l7Var);
                                        break;
                                    default:
                                        l7.a(l7Var);
                                        break;
                                }
                            }
                        }));
                        String string = LocaleController.getString(R.string.LearnMore);
                        Runnable runnable = new Runnable() { // from class: ai.b7
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i12) {
                                    case 0:
                                        l7.a(l7Var);
                                        break;
                                    default:
                                        l7.a(l7Var);
                                        break;
                                }
                            }
                        };
                        ((LinearLayout.LayoutParams) ea0Var.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
                        TextView textView = new TextView(e7Var.getContext());
                        textView.setText(string);
                        int i14 = org.telegram.ui.ActionBar.i6.Sh;
                        org.telegram.ui.ActionBar.e6 e6Var = e7Var.n;
                        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(i14, e6Var));
                        textView.setPadding(AndroidUtilities.dp(45.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(45.0f), AndroidUtilities.dp(12.0f));
                        textView.setGravity(17);
                        textView.setTypeface(AndroidUtilities.bold());
                        textView.setTextSize(1, 15.0f);
                        x5 x5Var = new x5(e7Var.getContext(), 19);
                        x5Var.setOnClickListener(new b90(runnable, 18));
                        int dp = AndroidUtilities.dp(8.0f);
                        int w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Oh, e6Var);
                        int k10 = i0.a.k(org.telegram.ui.ActionBar.i6.w0(i14, e6Var), 30);
                        x5Var.setBackground(org.telegram.ui.ActionBar.i6.j0(dp, dp, dp, dp, w02, k10, k10));
                        w7.z5.b(x5Var, 0.05f, 1.5f);
                        x5Var.addView(textView);
                        dc1 dc1Var = e7Var.a;
                        dc1Var.setClipChildren(false);
                        dc1Var.addView(x5Var, w7.x5.t(-2, -2, 1, 0, 28, 0, 4));
                    }
                    ea0Var.setText(spannableStringBuilder);
                } else {
                    nVar.setVisibility(0);
                    if (l7Var.F.f) {
                        nVar.setText(LocaleController.getString(R.string.NoReactions));
                        e7Var.setSubtitle(LocaleController.getString(R.string.NoReactionsStub));
                    } else {
                        nVar.setText(LocaleController.getString(R.string.NoViews));
                        e7Var.setSubtitle(LocaleController.getString(R.string.NoViewsStub));
                    }
                }
                e7Var.e(false, false);
                view = e7Var;
                break;
            case 6:
                j10 j10Var2 = new j10(l7Var.getContext(), dVar);
                j10Var2.setIsSingleCell(true);
                j10Var2.setIgnoreHeightCheck(true);
                j10Var2.setItemsCount(20);
                j10Var2.setViewType(28);
                j10Var2.w = false;
                view = j10Var2;
                break;
            case 11:
            case 12:
                ea0 ea0Var2 = new ea0(l7Var.getContext(), null);
                ea0Var2.setTextSize(1, 13.0f);
                ea0Var2.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.y6, dVar));
                ea0Var2.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.J6, dVar));
                int dp2 = AndroidUtilities.dp(16.0f);
                int dp3 = AndroidUtilities.dp(21.0f);
                ea0Var2.setPadding(dp3, dp2, dp3, dp2);
                ea0Var2.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
                ea0Var2.setGravity(17);
                ea0Var2.setDisablePaddingsOffsetY(true);
                if (i10 == 11) {
                    ea0Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryViewsPremiumHint), new a3.d(this, 10)));
                } else {
                    ea0Var2.setText(LocaleController.getString(R.string.ServerErrorViewersFull));
                }
                ea0Var2.setLayoutParams(new s4.q0(-1, -2));
                view = ea0Var2;
                break;
        }
        return new am0(view);
    }
}
