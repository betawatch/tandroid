package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.text.Spannable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class oz extends org.telegram.ui.ActionBar.r2 {
    public int E;
    public boolean F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public org.telegram.ui.Components.k10 O;
    public dz P;
    public final xi Q;
    public bb1 a;
    public nz b;
    public final MessagesController.DialogFilter c;
    public final TL_chatlists.TL_exportedChatlistInvite d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList h;
    public org.telegram.ui.ActionBar.u5 n;
    public int r;
    public long s;
    public long v;
    public Utilities.Callback w;
    public Utilities.Callback x;
    public boolean y;

    public oz(MessagesController.DialogFilter dialogFilter, TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        super(null);
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.r = -5;
        this.y = false;
        this.G = 0;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.Q = new xi(this, 28);
        this.c = dialogFilter;
        this.d = tL_exportedChatlistInvite;
    }

    public static void V(oz ozVar, TLRPC.TL_error tL_error) {
        ozVar.f0(false);
        ozVar.y = false;
        if (tL_error != null && "INVITES_TOO_MUCH".equals(tL_error.text)) {
            ozVar.showDialog(new tg.j0(12, ozVar.currentAccount, ozVar.getParentActivity(), ozVar, null));
            return;
        }
        if (tL_error != null && "INVITE_PEERS_TOO_MUCH".equals(tL_error.text)) {
            ozVar.showDialog(new tg.j0(4, ozVar.currentAccount, ozVar.getParentActivity(), ozVar, null));
        } else if (tL_error == null || !"CHATLISTS_TOO_MUCH".equals(tL_error.text)) {
            ozVar.finishFragment();
        } else {
            ozVar.showDialog(new tg.j0(13, ozVar.currentAccount, ozVar.getParentActivity(), ozVar, null));
        }
    }

    public static void W(oz ozVar, View view, int i10) {
        String str;
        oz ozVar2;
        ArrayList arrayList = ozVar.e;
        if (ozVar.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.k4)) {
            Long l4 = (Long) ozVar.h.get(i10 - ozVar.L);
            long longValue = l4.longValue();
            if (arrayList.contains(l4)) {
                arrayList.remove(l4);
                ozVar.F = true;
                ozVar.Y();
                ((org.telegram.ui.Cells.k4) view).c(false, true);
                ozVar2 = ozVar;
            } else {
                if (!ozVar.f.contains(l4)) {
                    int i11 = -ozVar.r;
                    ozVar.r = i11;
                    AndroidUtilities.shakeViewSpring(view, i11);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    ArrayList arrayList2 = new ArrayList();
                    if (longValue >= 0) {
                        arrayList2.add(ozVar.getMessagesController().getUser(l4));
                        TLRPC.User user = ozVar.getMessagesController().getUser(l4);
                        str = (user == null || !user.bot) ? LocaleController.getString(R.string.FilterInviteUserToast) : LocaleController.getString(R.string.FilterInviteBotToast);
                    } else {
                        TLRPC.Chat chat = ozVar.getMessagesController().getChat(Long.valueOf(-longValue));
                        String string = ChatObject.isChannelAndNotMegaGroup(chat) ? ChatObject.isPublic(chat) ? LocaleController.getString(R.string.FilterInviteChannelToast) : LocaleController.getString(R.string.FilterInvitePrivateChannelToast) : ChatObject.isPublic(chat) ? LocaleController.getString(R.string.FilterInviteGroupToast) : LocaleController.getString(R.string.FilterInvitePrivateGroupToast);
                        arrayList2.add(chat);
                        str = string;
                    }
                    if (ozVar.s != longValue || System.currentTimeMillis() - ozVar.v > 1500) {
                        ozVar.s = longValue;
                        ozVar.v = System.currentTimeMillis();
                        org.telegram.ui.Components.wc.b0(ozVar).g(str, arrayList2).j();
                        return;
                    }
                    return;
                }
                if (arrayList.size() + 1 > ozVar.b0()) {
                    ozVar.showDialog(new tg.j0(4, ozVar.currentAccount, ozVar.getParentActivity(), ozVar, null));
                    return;
                }
                ozVar2 = ozVar;
                arrayList.add(l4);
                ozVar2.F = true;
                ozVar2.Y();
                ((org.telegram.ui.Cells.k4) view).c(true, true);
            }
            ozVar2.Z();
            ozVar2.g0(true);
            ozVar2.h0();
        }
    }

    public final boolean X(boolean z10) {
        if (this.e.isEmpty() || !this.F) {
            return true;
        }
        if (!z10) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.R = LocaleController.getString(R.string.UnsavedChanges);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.UnsavedChangesMessage);
        final int i10 = 0;
        alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.bz
            public final /* synthetic */ oz b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.b2
            public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i11) {
                switch (i10) {
                    case 0:
                        this.b.d0();
                        break;
                    default:
                        this.b.finishFragment();
                        break;
                }
            }
        });
        final int i11 = 1;
        alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.bz
            public final /* synthetic */ oz b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.b2
            public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i112) {
                switch (i11) {
                    case 0:
                        this.b.d0();
                        break;
                    default:
                        this.b.finishFragment();
                        break;
                }
            }
        });
        showDialog(alertDialog$Builder.a);
        return false;
    }

    public final void Y() {
        this.n.a(this.F && !this.e.isEmpty(), true);
    }

    public final void Z() {
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite == null || tL_exportedChatlistInvite.url == null || !this.F) {
            return;
        }
        ArrayList arrayList = this.e;
        boolean z10 = true;
        boolean z11 = arrayList.size() != tL_exportedChatlistInvite.peers.size();
        if (!z11) {
            for (int i10 = 0; i10 < tL_exportedChatlistInvite.peers.size(); i10++) {
                if (!arrayList.contains(Long.valueOf(DialogObject.getPeerDialogId(tL_exportedChatlistInvite.peers.get(i10))))) {
                    break;
                }
            }
        }
        z10 = z11;
        if (z10) {
            return;
        }
        this.F = false;
        Y();
    }

    public final void a0(org.telegram.ui.Components.k10 k10Var, boolean z10) {
        ArrayList arrayList = this.e;
        arrayList.clear();
        ArrayList arrayList2 = this.f;
        if (!z10) {
            arrayList.addAll(arrayList2.subList(0, Math.min(b0(), arrayList2.size())));
        }
        k10Var.a(LocaleController.getString(arrayList.size() >= Math.min(b0(), arrayList2.size()) ? R.string.DeselectAll : R.string.SelectAll), new bi.u7(this, k10Var, z10, 29));
        this.F = true;
        Z();
        Y();
        g0(true);
        h0();
        for (int i10 = 0; i10 < this.a.getChildCount(); i10++) {
            View childAt = this.a.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.k4) {
                Object tag = childAt.getTag();
                if (tag instanceof Long) {
                    ((org.telegram.ui.Cells.k4) childAt).c(arrayList.contains((Long) tag), true);
                }
            }
        }
    }

    public final int b0() {
        return getUserConfig().isPremium() ? getMessagesController().dialogFiltersChatsLimitPremium : getMessagesController().dialogFiltersChatsLimitDefault;
    }

    public final String c0() {
        String str;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite == null || (str = tL_exportedChatlistInvite.url) == null) {
            return null;
        }
        return str.substring(str.lastIndexOf(47) + 1);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean canBeginSlide() {
        return X(true);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        e0(false);
        this.simpleActionBar.setActionBarMenuOnItemClick(new ga(this, 27));
        this.n = this.simpleActionBar.i(LocaleController.getString(R.string.Save));
        Y();
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        bb1 bb1Var = new bb1(context, 9, null);
        this.a = bb1Var;
        bb1Var.setLayoutManager(new s4.c0(1, false));
        this.a.setVerticalScrollBarEnabled(false);
        this.a.u1();
        this.a.setSectionsDrawBackground(true);
        frameLayout.addView(this.a, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        bb1 bb1Var2 = this.a;
        nz nzVar = new nz(this);
        this.b = nzVar;
        bb1Var2.setAdapter(nzVar);
        this.a.setOnItemClickListener(new h(this, 9));
        MessagesController messagesController = getMessagesController();
        MessagesController.DialogFilter dialogFilter = this.c;
        messagesController.updateFilterDialogs(dialogFilter);
        ArrayList arrayList = this.h;
        arrayList.clear();
        ArrayList arrayList2 = this.f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite != null) {
            for (int i10 = 0; i10 < tL_exportedChatlistInvite.peers.size(); i10++) {
                long peerDialogId = DialogObject.getPeerDialogId(tL_exportedChatlistInvite.peers.get(i10));
                arrayList.add(Long.valueOf(peerDialogId));
                this.e.add(Long.valueOf(peerDialogId));
                arrayList2.add(Long.valueOf(peerDialogId));
            }
        }
        for (int i11 = 0; i11 < dialogFilter.dialogs.size(); i11++) {
            TLRPC.Dialog dialog = dialogFilter.dialogs.get(i11);
            if (dialog != null && !DialogObject.isEncryptedDialog(dialog.id) && !arrayList.contains(Long.valueOf(dialog.id))) {
                long j10 = dialog.id;
                boolean z10 = j10 < 0;
                if (j10 < 0) {
                    z10 = q00.i0(getMessagesController().getChat(Long.valueOf(-dialog.id)));
                }
                if (z10) {
                    arrayList.add(Long.valueOf(dialog.id));
                    arrayList2.add(Long.valueOf(dialog.id));
                }
            }
        }
        for (int i12 = 0; i12 < dialogFilter.dialogs.size(); i12++) {
            TLRPC.Dialog dialog2 = dialogFilter.dialogs.get(i12);
            if (dialog2 != null && !DialogObject.isEncryptedDialog(dialog2.id) && !arrayList.contains(Long.valueOf(dialog2.id)) && !arrayList2.contains(Long.valueOf(dialog2.id))) {
                arrayList.add(Long.valueOf(dialog2.id));
            }
        }
        this.G = 1;
        if (tL_exportedChatlistInvite != null) {
            this.I = 1;
            this.H = 2;
            this.G = 4;
            this.J = 3;
        } else {
            this.I = -1;
            this.H = -1;
            this.J = -1;
        }
        if (tL_exportedChatlistInvite == null && arrayList.isEmpty()) {
            this.K = -1;
            this.L = -1;
            this.M = -1;
            this.N = -1;
        } else {
            int i13 = this.G;
            int i14 = i13 + 1;
            this.K = i13;
            int i15 = i13 + 2;
            this.G = i15;
            this.L = i14;
            int size = (arrayList.size() - 1) + i15;
            this.M = size;
            this.G = size + 1;
            this.N = size;
        }
        nz nzVar2 = this.b;
        if (nzVar2 != null) {
            nzVar2.l();
        }
        return this.fragmentView;
    }

    public final void d0() {
        ArrayList arrayList;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite == null || this.y || !this.F) {
            return;
        }
        f0(true);
        this.y = true;
        tL_exportedChatlistInvite.peers.clear();
        int i10 = 0;
        while (true) {
            arrayList = this.e;
            if (i10 >= arrayList.size()) {
                break;
            }
            tL_exportedChatlistInvite.peers.add(getMessagesController().getPeer(((Long) arrayList.get(i10)).longValue()));
            i10++;
        }
        TL_chatlists.TL_chatlists_editExportedInvite tL_chatlists_editExportedInvite = new TL_chatlists.TL_chatlists_editExportedInvite();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_editExportedInvite.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = this.c.id;
        tL_chatlists_editExportedInvite.slug = c0();
        tL_chatlists_editExportedInvite.revoked = tL_exportedChatlistInvite.revoked;
        tL_chatlists_editExportedInvite.flags |= 4;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            tL_chatlists_editExportedInvite.peers.add(getMessagesController().getInputPeer(((Long) arrayList.get(i11)).longValue()));
        }
        getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new cz(this, 0));
        Utilities.Callback callback = this.x;
        if (callback != null) {
            callback.run(tL_exportedChatlistInvite);
        }
    }

    public final void e0(boolean z10) {
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        String string = TextUtils.isEmpty(tL_exportedChatlistInvite == null ? null : tL_exportedChatlistInvite.title) ? LocaleController.getString(R.string.FilterShare) : tL_exportedChatlistInvite.title;
        if (!z10) {
            this.simpleActionBar.setTitle(string);
            return;
        }
        org.telegram.ui.ActionBar.r5 r5Var = this.simpleActionBar;
        r5Var.getClass();
        r5Var.w(string, false, 220L, org.telegram.ui.Components.ds.h);
    }

    public final void f0(boolean z10) {
        if (!z10) {
            AndroidUtilities.cancelRunOnUIThread(this.Q);
        }
        org.telegram.ui.ActionBar.u5 u5Var = this.n;
        if (u5Var != null) {
            u5Var.b(z10);
        }
    }

    public final void g0(boolean z10) {
        org.telegram.ui.Components.k10 k10Var = this.O;
        if (k10Var == null) {
            return;
        }
        ArrayList arrayList = this.e;
        k10Var.b(arrayList.size() <= 0 ? LocaleController.getString("FilterInviteHeaderChatsEmpty") : LocaleController.formatPluralString("FilterInviteHeaderChats", arrayList.size(), new Object[0]), z10);
        ArrayList arrayList2 = this.f;
        if (arrayList2.size() > 1) {
            boolean z11 = arrayList.size() >= Math.min(b0(), arrayList2.size());
            this.O.a(LocaleController.getString(!z11 ? R.string.SelectAll : R.string.DeselectAll), new org.telegram.ui.Components.d60(11, this, z11));
        } else {
            this.O.a("", null);
        }
        if (z10) {
            AndroidUtilities.makeAccessibilityAnnouncement(((Object) this.O.a.getText()) + ", " + ((Object) this.O.b.getText()));
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final org.telegram.ui.Components.nm0 getListViewForSimpleGlass() {
        return this.a;
    }

    public final void h0() {
        dz dzVar = this.P;
        if (dzVar == null) {
            return;
        }
        if (this.d == null) {
            String string = LocaleController.getString(R.string.FilterInviteHeaderNo);
            xh.n nVar = dzVar.a;
            nVar.setText(string);
            nVar.s = 0;
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = dzVar.getSubtitleTextView().getPaint().getFontMetricsInt();
        MessagesController.DialogFilter dialogFilter = this.c;
        Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, fontMetricsInt, false), dialogFilter.entities, fontMetricsInt);
        dz dzVar2 = this.P;
        CharSequence replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralSpannable("FilterInviteHeader", this.e.size(), replaceAnimatedEmoji));
        boolean z10 = dialogFilter.title_noanimate;
        xh.n nVar2 = dzVar2.a;
        nVar2.setText(replaceTags);
        nVar2.s = z10 ? 26 : 0;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onBackPressed(boolean z10) {
        return X(z10);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.E != 0) {
            getConnectionsManager().cancelRequest(this.E, true);
            this.E = 0;
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
