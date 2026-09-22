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
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.mc0;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.dc1;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class e7 extends xl0 {
    public final ArrayList c = new ArrayList();
    public final /* synthetic */ j7 d;

    public e7(j7 j7Var) {
        this.d = j7Var;
    }

    @Override // org.telegram.ui.Components.xl0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 1;
    }

    public final void E() {
        ArrayList arrayList = this.c;
        arrayList.clear();
        j7 j7Var = this.d;
        i7 i7Var = j7Var.E;
        int i10 = 0;
        if (j7Var.Q) {
            arrayList.add(new z6(0));
            arrayList.add(new z6(6));
        } else {
            arrayList.add(new z6(0));
            if (i7Var != null) {
                u6 u6Var = i7Var.s;
                boolean z10 = i7Var.j;
                if (i7Var.b() <= 0 && (z10 || (!i7Var.e && !i7Var.m))) {
                    if (!TextUtils.isEmpty(u6Var.c)) {
                        arrayList.add(new z6(7));
                    } else if (z10) {
                        arrayList.add(new z6(5));
                    } else {
                        int i11 = i7Var.a;
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
            if (i7Var != null) {
                ArrayList arrayList2 = i7Var.g;
                ArrayList arrayList3 = i7Var.i;
                if (i7Var.f) {
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
            if (i7Var == null || !(i7Var.e || i7Var.m)) {
                if (i7Var != null && i7Var.k) {
                    arrayList.add(new z6(11));
                } else if (i7Var != null) {
                    u6 u6Var2 = i7Var.s;
                    if (i7Var.b() < i7Var.a && TextUtils.isEmpty(u6Var2.c) && !u6Var2.b) {
                        arrayList.add(new z6(12));
                    }
                }
            } else if (i7Var.b() <= 0) {
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
        j7 j7Var = this.d;
        int i14 = j7Var.v;
        if (c1Var.f != 1 || i10 < 0) {
            return;
        }
        ArrayList arrayList = this.c;
        if (i10 >= arrayList.size()) {
            return;
        }
        z6 z6Var = (z6) arrayList.get(i10);
        org.telegram.ui.Cells.p6 p6Var = (org.telegram.ui.Cells.p6) c1Var.a;
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
        boolean remove = j7Var.F.p.remove(Long.valueOf(j3));
        if (storyView != null) {
            TLRPC.Reaction reaction = storyView.reaction;
            if (reaction == null || (str2 = zg.p0.d(reaction).f) == null || !str2.equals("❤")) {
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
                p6Var.c(user2, null, null, z10, 0L, storyView.story, false, true, remove);
            } else {
                TLRPC.User user3 = user;
                i12 = 11;
                i13 = 12;
                if (storyView instanceof TL_stories.TL_storyViewPublicForward) {
                    long j11 = storyView.message != null ? r10.date : j10;
                    q7 q7Var = j7Var.y;
                    p6Var.c(user3, null, null, z10, j11, q7Var == null ? null : q7Var.a, true, true, remove);
                } else {
                    p6Var.c(user3, null, z10 ? null : storyView.reaction, z10, storyView.date, null, false, true, remove);
                }
            }
            int i15 = i10 < arrayList.size() + (-1) ? ((z6) arrayList.get(i10 + 1)).a : -1;
            p6Var.a = i15 == 1 || i15 == i12 || i15 == i13;
            p6Var.a(j7Var.d(storyView) ? 1.0f : 0.5f, false);
            return;
        }
        TLRPC.User user4 = user;
        if (storyReaction != null) {
            if (storyReaction instanceof TL_stories.TL_storyReaction) {
                TL_stories.TL_storyReaction tL_storyReaction = (TL_stories.TL_storyReaction) storyReaction;
                TLRPC.Reaction reaction2 = tL_storyReaction.reaction;
                boolean z11 = (reaction2 == null || (str = zg.p0.d(reaction2).f) == null || !str.equals("❤")) ? false : true;
                i11 = 12;
                p6Var.c(user4, chat, z11 ? null : tL_storyReaction.reaction, z11, tL_storyReaction.date, null, false, true, remove);
            } else {
                i11 = 12;
                if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                    p6Var.c(user4, chat, null, false, 0L, ((TL_stories.TL_storyReactionPublicRepost) storyReaction).story, false, true, remove);
                } else if (storyReaction instanceof TL_stories.TL_storyReactionPublicForward) {
                    long j12 = storyReaction.message != null ? r7.date : 0L;
                    q7 q7Var2 = j7Var.y;
                    p6Var.c(user4, chat, null, false, j12, q7Var2 == null ? null : q7Var2.a, true, true, remove);
                }
            }
            boolean z12 = true;
            int i16 = i10 < arrayList.size() - 1 ? ((z6) arrayList.get(i10 + 1)).a : -1;
            if (i16 != 1 && i16 != 11 && i16 != i11) {
                z12 = false;
            }
            p6Var.a = z12;
            p6Var.a(1.0f, false);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        final j7 j7Var = this.d;
        int i11 = j7Var.v;
        d dVar = j7Var.s;
        final int i12 = 1;
        final int i13 = 0;
        switch (i10) {
            case 0:
                view = new b7(this, j7Var.getContext(), i13);
                break;
            case 1:
                mc0 mc0Var = org.telegram.ui.Cells.p6.G;
                view = new c7(i11, dVar, this, j7Var.getContext());
                break;
            case 2:
            case 9:
            default:
                view = new b7(this, j7Var.getContext(), i12);
                break;
            case 3:
                view = new org.telegram.ui.Cells.u3(j7Var.getContext(), 70);
                break;
            case 4:
                t00 t00Var = new t00(j7Var.getContext(), dVar);
                t00Var.setIsSingleCell(true);
                t00Var.setViewType(28);
                t00Var.w = false;
                view = t00Var;
                break;
            case 5:
            case 7:
            case 8:
            case 10:
                d7 d7Var = new d7(j7Var.F.j ? 12 : (i10 == 10 || i10 == 7 || i10 == 8 || i10 == 5) ? 1 : 0, dVar, this, j7Var.getContext());
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
                } else if (j7Var.F.j) {
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
                                        j7.a(j7Var);
                                        break;
                                    default:
                                        j7.a(j7Var);
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
                                        j7.a(j7Var);
                                        break;
                                    default:
                                        j7.a(j7Var);
                                        break;
                                }
                            }
                        };
                        ((LinearLayout.LayoutParams) n90Var.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
                        TextView textView = new TextView(d7Var.getContext());
                        textView.setText(string);
                        int i14 = org.telegram.ui.ActionBar.j6.Sh;
                        org.telegram.ui.ActionBar.f6 f6Var = d7Var.n;
                        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i14, f6Var));
                        textView.setPadding(AndroidUtilities.dp(45.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(45.0f), AndroidUtilities.dp(12.0f));
                        textView.setGravity(17);
                        textView.setTypeface(AndroidUtilities.bold());
                        textView.setTextSize(1, 15.0f);
                        x5 x5Var = new x5(d7Var.getContext(), 19);
                        x5Var.setOnClickListener(new i80(runnable, 19));
                        int dp = AndroidUtilities.dp(8.0f);
                        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var);
                        int k10 = i0.a.k(org.telegram.ui.ActionBar.j6.v0(i14, f6Var), 30);
                        x5Var.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, v02, k10, k10));
                        w7.a6.b(x5Var, 0.05f, 1.5f);
                        x5Var.addView(textView);
                        dc1 dc1Var = d7Var.a;
                        dc1Var.setClipChildren(false);
                        dc1Var.addView(x5Var, w7.y5.t(-2, -2, 1, 0, 28, 0, 4));
                    }
                    n90Var.setText(spannableStringBuilder);
                } else {
                    nVar.setVisibility(0);
                    if (j7Var.F.f) {
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
                t00 t00Var2 = new t00(j7Var.getContext(), dVar);
                t00Var2.setIsSingleCell(true);
                t00Var2.setIgnoreHeightCheck(true);
                t00Var2.setItemsCount(20);
                t00Var2.setViewType(28);
                t00Var2.w = false;
                view = t00Var2;
                break;
            case 11:
            case 12:
                n90 n90Var2 = new n90(j7Var.getContext(), null);
                n90Var2.setTextSize(1, 13.0f);
                n90Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.y6, dVar));
                n90Var2.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.J6, dVar));
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
        return new il0(view);
    }
}
