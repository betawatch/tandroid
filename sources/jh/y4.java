package jh;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import hh.y9;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.h00;
import org.telegram.ui.Components.l70;
import org.telegram.ui.Components.lb0;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.ra1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class y4 extends yk0 {
    public final ArrayList c = new ArrayList();
    public final /* synthetic */ c5 d;

    public y4(c5 c5Var) {
        this.d = c5Var;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        return o1Var.f == 1;
    }

    public final void E() {
        ArrayList arrayList = this.c;
        arrayList.clear();
        c5 c5Var = this.d;
        b5 b5Var = c5Var.A;
        int i10 = 0;
        if (c5Var.M) {
            arrayList.add(new t4(0));
            arrayList.add(new t4(6));
        } else {
            arrayList.add(new t4(0));
            if (b5Var != null) {
                o4 o4Var = b5Var.s;
                boolean z10 = b5Var.j;
                if (b5Var.b() <= 0 && (z10 || (!b5Var.e && !b5Var.m))) {
                    if (!TextUtils.isEmpty(o4Var.c)) {
                        arrayList.add(new t4(7));
                    } else if (z10) {
                        arrayList.add(new t4(5));
                    } else {
                        int i11 = b5Var.a;
                        if (i11 > 0 && o4Var.b) {
                            arrayList.add(new t4(8));
                        } else if (i11 > 0) {
                            arrayList.add(new t4(10));
                        } else {
                            arrayList.add(new t4(5));
                        }
                    }
                }
            }
            if (b5Var != null) {
                ArrayList arrayList2 = b5Var.g;
                ArrayList arrayList3 = b5Var.i;
                if (b5Var.f) {
                    while (i10 < arrayList3.size()) {
                        arrayList.add(new t4((TL_stories.StoryReaction) arrayList3.get(i10)));
                        i10++;
                    }
                } else {
                    while (i10 < arrayList2.size()) {
                        arrayList.add(new t4((TL_stories.StoryView) arrayList2.get(i10)));
                        i10++;
                    }
                }
            }
            if (b5Var == null || !(b5Var.e || b5Var.m)) {
                if (b5Var != null && b5Var.k) {
                    arrayList.add(new t4(11));
                } else if (b5Var != null) {
                    o4 o4Var2 = b5Var.s;
                    if (b5Var.b() < b5Var.a && TextUtils.isEmpty(o4Var2.c) && !o4Var2.b) {
                        arrayList.add(new t4(12));
                    }
                }
            } else if (b5Var.b() <= 0) {
                arrayList.add(new t4(6));
            } else {
                arrayList.add(new t4(4));
            }
        }
        arrayList.add(new t4(9));
        l();
    }

    @Override // f2.q0
    public final int h() {
        return this.c.size();
    }

    @Override // f2.q0
    public final int j(int i10) {
        return ((t4) this.c.get(i10)).a;
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
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
        c5 c5Var = this.d;
        int i14 = c5Var.v;
        if (o1Var.f != 1 || i10 < 0) {
            return;
        }
        ArrayList arrayList = this.c;
        if (i10 >= arrayList.size()) {
            return;
        }
        t4 t4Var = (t4) arrayList.get(i10);
        org.telegram.ui.Cells.k6 k6Var = (org.telegram.ui.Cells.k6) o1Var.a;
        TL_stories.StoryView storyView = t4Var.b;
        TL_stories.StoryReaction storyReaction = t4Var.c;
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
        boolean remove = c5Var.B.p.remove(Long.valueOf(j10));
        if (storyView != null) {
            TLRPC.Reaction reaction = storyView.reaction;
            if (reaction == null || (str2 = ig.q0.d(reaction).f) == null || !str2.equals("❤")) {
                j11 = 0;
                z10 = false;
            } else {
                j11 = 0;
                z10 = true;
            }
            if (storyView instanceof TL_stories.TL_storyViewPublicRepost) {
                TLRPC.User user2 = user;
                i12 = 11;
                i13 = 12;
                k6Var.c(user2, null, null, z10, 0L, storyView.story, false, true, remove);
            } else {
                TLRPC.User user3 = user;
                i12 = 11;
                i13 = 12;
                if (storyView instanceof TL_stories.TL_storyViewPublicForward) {
                    long j12 = storyView.message != null ? r10.date : j11;
                    j5 j5Var = c5Var.y;
                    k6Var.c(user3, null, null, z10, j12, j5Var == null ? null : j5Var.a, true, true, remove);
                } else {
                    k6Var.c(user3, null, z10 ? null : storyView.reaction, z10, storyView.date, null, false, true, remove);
                }
            }
            int i15 = i10 < arrayList.size() + (-1) ? ((t4) arrayList.get(i10 + 1)).a : -1;
            k6Var.a = i15 == 1 || i15 == i12 || i15 == i13;
            k6Var.a(c5Var.d(storyView) ? 1.0f : 0.5f, false);
            return;
        }
        TLRPC.User user4 = user;
        if (storyReaction != null) {
            if (storyReaction instanceof TL_stories.TL_storyReaction) {
                TL_stories.TL_storyReaction tL_storyReaction = (TL_stories.TL_storyReaction) storyReaction;
                TLRPC.Reaction reaction2 = tL_storyReaction.reaction;
                boolean z11 = (reaction2 == null || (str = ig.q0.d(reaction2).f) == null || !str.equals("❤")) ? false : true;
                i11 = 12;
                k6Var.c(user4, chat, z11 ? null : tL_storyReaction.reaction, z11, tL_storyReaction.date, null, false, true, remove);
            } else {
                i11 = 12;
                if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                    k6Var.c(user4, chat, null, false, 0L, ((TL_stories.TL_storyReactionPublicRepost) storyReaction).story, false, true, remove);
                } else if (storyReaction instanceof TL_stories.TL_storyReactionPublicForward) {
                    long j13 = storyReaction.message != null ? r7.date : 0L;
                    j5 j5Var2 = c5Var.y;
                    k6Var.c(user4, chat, null, false, j13, j5Var2 == null ? null : j5Var2.a, true, true, remove);
                }
            }
            boolean z12 = true;
            int i16 = i10 < arrayList.size() - 1 ? ((t4) arrayList.get(i10 + 1)).a : -1;
            if (i16 != 1 && i16 != 11 && i16 != i11) {
                z12 = false;
            }
            k6Var.a = z12;
            k6Var.a(1.0f, false);
        }
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View view;
        final c5 c5Var = this.d;
        int i11 = c5Var.v;
        b bVar = c5Var.s;
        final int i12 = 1;
        final int i13 = 0;
        switch (i10) {
            case 0:
                view = new v4(this, c5Var.getContext(), i13);
                break;
            case 1:
                lb0 lb0Var = org.telegram.ui.Cells.k6.C;
                view = new w4(i11, c5Var.getContext(), bVar, this);
                break;
            case 2:
            case 9:
            default:
                view = new v4(this, c5Var.getContext(), i12);
                break;
            case 3:
                view = new org.telegram.ui.Cells.q3(c5Var.getContext(), 70);
                break;
            case 4:
                h00 h00Var = new h00(c5Var.getContext(), bVar);
                h00Var.setIsSingleCell(true);
                h00Var.setViewType(28);
                h00Var.w = false;
                view = h00Var;
                break;
            case 5:
            case 7:
            case 8:
            case 10:
                x4 x4Var = new x4(c5Var.B.j ? 12 : (i10 == 10 || i10 == 7 || i10 == 8 || i10 == 5) ? 1 : 0, c5Var.getContext(), bVar, this);
                eh.s sVar = x4Var.d;
                if (i10 == 7) {
                    sVar.setVisibility(8);
                    x4Var.setSubtitle(LocaleController.getString(R.string.NoResult));
                } else if (i10 == 8) {
                    sVar.setVisibility(8);
                    x4Var.setSubtitle(LocaleController.getString(R.string.NoContactsViewed));
                } else if (i10 == 10) {
                    sVar.setVisibility(0);
                    sVar.setText(LocaleController.getString(R.string.ServerErrorViewersTitle));
                    x4Var.setSubtitle(LocaleController.getString(R.string.ServerErrorViewers));
                } else if (c5Var.B.j) {
                    sVar.setVisibility(8);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.ExpiredViewsStub)));
                    boolean premiumFeaturesBlocked = MessagesController.getInstance(i11).premiumFeaturesBlocked();
                    p80 p80Var = x4Var.e;
                    if (!premiumFeaturesBlocked) {
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ExpiredViewsStubPremiumDescription), new Runnable() { // from class: jh.u4
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i13) {
                                    case 0:
                                        c5.a(c5Var);
                                        break;
                                    default:
                                        c5.a(c5Var);
                                        break;
                                }
                            }
                        }));
                        String string = LocaleController.getString(R.string.LearnMore);
                        Runnable runnable = new Runnable() { // from class: jh.u4
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i12) {
                                    case 0:
                                        c5.a(c5Var);
                                        break;
                                    default:
                                        c5.a(c5Var);
                                        break;
                                }
                            }
                        };
                        ((LinearLayout.LayoutParams) p80Var.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
                        TextView textView = new TextView(x4Var.getContext());
                        textView.setText(string);
                        int i14 = org.telegram.ui.ActionBar.g6.Sh;
                        org.telegram.ui.ActionBar.c6 c6Var = x4Var.n;
                        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i14, c6Var));
                        textView.setPadding(AndroidUtilities.dp(45.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(45.0f), AndroidUtilities.dp(12.0f));
                        textView.setGravity(17);
                        textView.setTypeface(AndroidUtilities.bold());
                        textView.setTextSize(1, 15.0f);
                        ag.d dVar = new ag.d(x4Var.getContext(), 18);
                        dVar.setOnClickListener(new l70(runnable, 19));
                        int dp = AndroidUtilities.dp(8.0f);
                        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var);
                        int k10 = i0.b.k(org.telegram.ui.ActionBar.g6.v0(i14, c6Var), 30);
                        dVar.setBackground(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, v02, k10, k10));
                        h7.b6.b(dVar, 0.05f, 1.5f);
                        dVar.addView(textView);
                        ra1 ra1Var = x4Var.a;
                        ra1Var.setClipChildren(false);
                        ra1Var.addView(dVar, h7.z5.t(-2, -2, 1, 0, 28, 0, 4));
                    }
                    p80Var.setText(spannableStringBuilder);
                } else {
                    sVar.setVisibility(0);
                    if (c5Var.B.f) {
                        sVar.setText(LocaleController.getString(R.string.NoReactions));
                        x4Var.setSubtitle(LocaleController.getString(R.string.NoReactionsStub));
                    } else {
                        sVar.setText(LocaleController.getString(R.string.NoViews));
                        x4Var.setSubtitle(LocaleController.getString(R.string.NoViewsStub));
                    }
                }
                x4Var.e(false, false);
                view = x4Var;
                break;
            case 6:
                h00 h00Var2 = new h00(c5Var.getContext(), bVar);
                h00Var2.setIsSingleCell(true);
                h00Var2.setIgnoreHeightCheck(true);
                h00Var2.setItemsCount(20);
                h00Var2.setViewType(28);
                h00Var2.w = false;
                view = h00Var2;
                break;
            case 11:
            case 12:
                p80 p80Var2 = new p80(c5Var.getContext(), null);
                p80Var2.setTextSize(1, 13.0f);
                p80Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.y6, bVar));
                p80Var2.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.J6, bVar));
                int dp2 = AndroidUtilities.dp(16.0f);
                int dp3 = AndroidUtilities.dp(21.0f);
                p80Var2.setPadding(dp3, dp2, dp3, dp2);
                p80Var2.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
                p80Var2.setGravity(17);
                p80Var2.setDisablePaddingsOffsetY(true);
                if (i10 == 11) {
                    p80Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryViewsPremiumHint), new y9(this, 15)));
                } else {
                    p80Var2.setText(LocaleController.getString(R.string.ServerErrorViewersFull));
                }
                p80Var2.setLayoutParams(new f2.y0(-1, -2));
                view = p80Var2;
                break;
        }
        return new lk0(view);
    }
}
