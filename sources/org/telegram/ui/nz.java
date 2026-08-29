package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class nz extends org.telegram.ui.ActionBar.o2 {
    public boolean A;
    public int B;
    public boolean C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public org.telegram.ui.Components.v00 L;
    public ez M;
    public final ui N;
    public ValueAnimator O;
    public float P;
    public wa1 a;
    public mz b;
    public final MessagesController.DialogFilter c;
    public final TL_chatlists.TL_exportedChatlistInvite d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList h;
    public org.telegram.ui.Components.ir n;
    public org.telegram.ui.ActionBar.w0 r;
    public int s;
    public long v;
    public long w;
    public Utilities.Callback x;
    public Utilities.Callback y;

    public nz(MessagesController.DialogFilter dialogFilter, TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        super(null);
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.s = -5;
        this.A = false;
        this.D = 0;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.N = new ui(this, 28);
        this.P = 1.0f;
        this.c = dialogFilter;
        this.d = tL_exportedChatlistInvite;
    }

    public static void U(nz nzVar, TLRPC.TL_error tL_error) {
        nzVar.e0(false);
        nzVar.A = false;
        if (tL_error != null && "INVITES_TOO_MUCH".equals(tL_error.text)) {
            nzVar.showDialog(new cg.v0(12, nzVar.currentAccount, nzVar.getParentActivity(), nzVar, null));
            return;
        }
        if (tL_error != null && "INVITE_PEERS_TOO_MUCH".equals(tL_error.text)) {
            nzVar.showDialog(new cg.v0(4, nzVar.currentAccount, nzVar.getParentActivity(), nzVar, null));
        } else if (tL_error == null || !"CHATLISTS_TOO_MUCH".equals(tL_error.text)) {
            nzVar.finishFragment();
        } else {
            nzVar.showDialog(new cg.v0(13, nzVar.currentAccount, nzVar.getParentActivity(), nzVar, null));
        }
    }

    public static void V(nz nzVar, View view, int i10) {
        String str;
        nz nzVar2;
        ArrayList arrayList = nzVar.e;
        if (nzVar.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.e4)) {
            Long l10 = (Long) nzVar.h.get(i10 - nzVar.I);
            long longValue = l10.longValue();
            if (arrayList.contains(l10)) {
                arrayList.remove(l10);
                nzVar.C = true;
                nzVar.X();
                ((org.telegram.ui.Cells.e4) view).c(false, true);
                nzVar2 = nzVar;
            } else {
                if (!nzVar.f.contains(l10)) {
                    int i11 = -nzVar.s;
                    nzVar.s = i11;
                    AndroidUtilities.shakeViewSpring(view, i11);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    ArrayList arrayList2 = new ArrayList();
                    if (longValue >= 0) {
                        arrayList2.add(nzVar.getMessagesController().getUser(l10));
                        TLRPC.User user = nzVar.getMessagesController().getUser(l10);
                        str = (user == null || !user.bot) ? LocaleController.getString(R.string.FilterInviteUserToast) : LocaleController.getString(R.string.FilterInviteBotToast);
                    } else {
                        TLRPC.Chat chat = nzVar.getMessagesController().getChat(Long.valueOf(-longValue));
                        String string = ChatObject.isChannelAndNotMegaGroup(chat) ? ChatObject.isPublic(chat) ? LocaleController.getString(R.string.FilterInviteChannelToast) : LocaleController.getString(R.string.FilterInvitePrivateChannelToast) : ChatObject.isPublic(chat) ? LocaleController.getString(R.string.FilterInviteGroupToast) : LocaleController.getString(R.string.FilterInvitePrivateGroupToast);
                        arrayList2.add(chat);
                        str = string;
                    }
                    if (nzVar.v != longValue || System.currentTimeMillis() - nzVar.w > 1500) {
                        nzVar.v = longValue;
                        nzVar.w = System.currentTimeMillis();
                        org.telegram.ui.Components.tc.a0(nzVar).g(str, arrayList2).j();
                        return;
                    }
                    return;
                }
                if (arrayList.size() + 1 > nzVar.a0()) {
                    nzVar.showDialog(new cg.v0(4, nzVar.currentAccount, nzVar.getParentActivity(), nzVar, null));
                    return;
                }
                nzVar2 = nzVar;
                arrayList.add(l10);
                nzVar2.C = true;
                nzVar2.X();
                ((org.telegram.ui.Cells.e4) view).c(true, true);
            }
            nzVar2.Y();
            nzVar2.f0(true);
            nzVar2.g0();
        }
    }

    public final boolean W(boolean z10) {
        if (this.e.isEmpty() || !this.C) {
            return true;
        }
        if (!z10) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.N = LocaleController.getString(R.string.UnsavedChanges);
        alertDialog$Builder.a.P = LocaleController.getString(R.string.UnsavedChangesMessage);
        final int i10 = 0;
        alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.dz
            public final /* synthetic */ nz b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.b2
            public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i11) {
                switch (i10) {
                    case 0:
                        this.b.c0();
                        break;
                    default:
                        this.b.finishFragment();
                        break;
                }
            }
        });
        final int i11 = 1;
        alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.dz
            public final /* synthetic */ nz b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.b2
            public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i112) {
                switch (i11) {
                    case 0:
                        this.b.c0();
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

    public final void X() {
        float f9 = this.C ? !this.e.isEmpty() ? 1.0f : 0.5f : 0.0f;
        if (Math.abs(this.P - f9) > 0.1f) {
            this.r.clearAnimation();
            ViewPropertyAnimator animate = this.r.animate();
            this.P = f9;
            animate.alpha(f9).setDuration(320L).setInterpolator(org.telegram.ui.Components.jr.h).start();
        }
    }

    public final void Y() {
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite == null || tL_exportedChatlistInvite.url == null || !this.C) {
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
        this.C = false;
        X();
    }

    public final void Z(org.telegram.ui.Components.v00 v00Var, boolean z10) {
        ArrayList arrayList = this.e;
        arrayList.clear();
        ArrayList arrayList2 = this.f;
        if (!z10) {
            arrayList.addAll(arrayList2.subList(0, Math.min(a0(), arrayList2.size())));
        }
        v00Var.a(LocaleController.getString(arrayList.size() >= Math.min(a0(), arrayList2.size()) ? R.string.DeselectAll : R.string.SelectAll), new jh.r5(this, v00Var, z10, 24));
        this.C = true;
        Y();
        X();
        f0(true);
        g0();
        for (int i10 = 0; i10 < this.a.getChildCount(); i10++) {
            View childAt = this.a.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.e4) {
                Object tag = childAt.getTag();
                if (tag instanceof Long) {
                    ((org.telegram.ui.Cells.e4) childAt).c(arrayList.contains((Long) tag), true);
                }
            }
        }
    }

    public final int a0() {
        return getUserConfig().isPremium() ? getMessagesController().dialogFiltersChatsLimitPremium : getMessagesController().dialogFiltersChatsLimitDefault;
    }

    public final String b0() {
        String str;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite == null || (str = tL_exportedChatlistInvite.url) == null) {
            return null;
        }
        return str.substring(str.lastIndexOf(47) + 1);
    }

    public final void c0() {
        ArrayList arrayList;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite == null || this.A || !this.C) {
            return;
        }
        e0(true);
        this.A = true;
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
        tL_chatlists_editExportedInvite.slug = b0();
        tL_chatlists_editExportedInvite.revoked = tL_exportedChatlistInvite.revoked;
        tL_chatlists_editExportedInvite.flags |= 4;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            tL_chatlists_editExportedInvite.peers.add(getMessagesController().getInputPeer(((Long) arrayList.get(i11)).longValue()));
        }
        getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new cz(this, 1));
        Utilities.Callback callback = this.y;
        if (callback != null) {
            callback.run(tL_exportedChatlistInvite);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean canBeginSlide() {
        return W(true);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        d0(false);
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.m51(this, 9));
        org.telegram.ui.ActionBar.a0 n10 = this.actionBar.n();
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = org.telegram.ui.ActionBar.g6.v8;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.Components.ir irVar = new org.telegram.ui.Components.ir(mutate, new org.telegram.ui.Components.np(org.telegram.ui.ActionBar.g6.w0(null, i10, false)));
        this.n = irVar;
        this.r = n10.i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), irVar);
        X();
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.a7, false));
        wa1 wa1Var = new wa1(context, 8, null);
        this.a = wa1Var;
        wa1Var.setLayoutManager(new f2.j0(1, false));
        this.a.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.a, i7.f6.c(-1.0f, -1));
        wa1 wa1Var2 = this.a;
        mz mzVar = new mz(this);
        this.b = mzVar;
        wa1Var2.setAdapter(mzVar);
        this.a.setOnItemClickListener(new j(this, 8));
        MessagesController messagesController = getMessagesController();
        MessagesController.DialogFilter dialogFilter = this.c;
        messagesController.updateFilterDialogs(dialogFilter);
        ArrayList arrayList = this.h;
        arrayList.clear();
        ArrayList arrayList2 = this.f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite != null) {
            for (int i11 = 0; i11 < tL_exportedChatlistInvite.peers.size(); i11++) {
                long peerDialogId = DialogObject.getPeerDialogId(tL_exportedChatlistInvite.peers.get(i11));
                arrayList.add(Long.valueOf(peerDialogId));
                this.e.add(Long.valueOf(peerDialogId));
                arrayList2.add(Long.valueOf(peerDialogId));
            }
        }
        for (int i12 = 0; i12 < dialogFilter.dialogs.size(); i12++) {
            TLRPC.Dialog dialog = dialogFilter.dialogs.get(i12);
            if (dialog != null && !DialogObject.isEncryptedDialog(dialog.id) && !arrayList.contains(Long.valueOf(dialog.id))) {
                long j10 = dialog.id;
                boolean z10 = j10 < 0;
                if (j10 < 0) {
                    z10 = p00.g0(getMessagesController().getChat(Long.valueOf(-dialog.id)));
                }
                if (z10) {
                    arrayList.add(Long.valueOf(dialog.id));
                    arrayList2.add(Long.valueOf(dialog.id));
                }
            }
        }
        for (int i13 = 0; i13 < dialogFilter.dialogs.size(); i13++) {
            TLRPC.Dialog dialog2 = dialogFilter.dialogs.get(i13);
            if (dialog2 != null && !DialogObject.isEncryptedDialog(dialog2.id) && !arrayList.contains(Long.valueOf(dialog2.id)) && !arrayList2.contains(Long.valueOf(dialog2.id))) {
                arrayList.add(Long.valueOf(dialog2.id));
            }
        }
        this.D = 1;
        if (tL_exportedChatlistInvite != null) {
            this.F = 1;
            this.E = 2;
            this.D = 4;
            this.G = 3;
        } else {
            this.F = -1;
            this.E = -1;
            this.G = -1;
        }
        if (tL_exportedChatlistInvite == null && arrayList.isEmpty()) {
            this.H = -1;
            this.I = -1;
            this.J = -1;
            this.K = -1;
        } else {
            int i14 = this.D;
            int i15 = i14 + 1;
            this.H = i14;
            int i16 = i14 + 2;
            this.D = i16;
            this.I = i15;
            int size = (arrayList.size() - 1) + i16;
            this.J = size;
            this.D = size + 1;
            this.K = size;
        }
        mz mzVar2 = this.b;
        if (mzVar2 != null) {
            mzVar2.l();
        }
        return this.fragmentView;
    }

    public final void d0(boolean z10) {
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        String string = TextUtils.isEmpty(tL_exportedChatlistInvite == null ? null : tL_exportedChatlistInvite.title) ? LocaleController.getString(R.string.FilterShare) : tL_exportedChatlistInvite.title;
        if (z10) {
            this.actionBar.I(string, false, 220L, null);
        } else {
            this.actionBar.setTitle(string);
        }
    }

    public final void e0(boolean z10) {
        if (!z10) {
            AndroidUtilities.cancelRunOnUIThread(this.N);
        }
        if (this.n != null) {
            ValueAnimator valueAnimator = this.O;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.n.c, z10 ? 1.0f : 0.0f);
            this.O = ofFloat;
            ofFloat.addUpdateListener(new g3(this, 12));
            this.O.setDuration((long) (Math.abs(this.n.c - (z10 ? 1.0f : 0.0f)) * 200.0f));
            this.O.setInterpolator(org.telegram.ui.Components.jr.f);
            this.O.start();
        }
    }

    public final void f0(boolean z10) {
        org.telegram.ui.Components.v00 v00Var = this.L;
        if (v00Var == null) {
            return;
        }
        ArrayList arrayList = this.e;
        v00Var.b(arrayList.size() <= 0 ? LocaleController.getString("FilterInviteHeaderChatsEmpty") : LocaleController.formatPluralString("FilterInviteHeaderChats", arrayList.size(), new Object[0]), z10);
        ArrayList arrayList2 = this.f;
        if (arrayList2.size() > 1) {
            boolean z11 = arrayList.size() >= Math.min(a0(), arrayList2.size());
            this.L.a(LocaleController.getString(!z11 ? R.string.SelectAll : R.string.DeselectAll), new org.telegram.ui.Components.p90(9, this, z11));
        } else {
            this.L.a("", null);
        }
        if (z10) {
            AndroidUtilities.makeAccessibilityAnnouncement(((Object) this.L.a.getText()) + ", " + ((Object) this.L.b.getText()));
        }
    }

    public final void g0() {
        ez ezVar = this.M;
        if (ezVar == null) {
            return;
        }
        if (this.d == null) {
            String string = LocaleController.getString(R.string.FilterInviteHeaderNo);
            gh.s sVar = ezVar.a;
            sVar.setText(string);
            sVar.h = 0;
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = ezVar.getSubtitleTextView().getPaint().getFontMetricsInt();
        MessagesController.DialogFilter dialogFilter = this.c;
        Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, fontMetricsInt, false), dialogFilter.entities, fontMetricsInt);
        ez ezVar2 = this.M;
        CharSequence replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralSpannable("FilterInviteHeader", this.e.size(), replaceAnimatedEmoji));
        boolean z10 = dialogFilter.title_noanimate;
        gh.s sVar2 = ezVar2.a;
        sVar2.setText(replaceTags);
        sVar2.h = z10 ? 26 : 0;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onBackPressed(boolean z10) {
        return W(z10);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.B != 0) {
            getConnectionsManager().cancelRequest(this.B, true);
            this.B = 0;
        }
    }
}
