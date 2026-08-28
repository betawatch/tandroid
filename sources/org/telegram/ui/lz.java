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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class lz extends org.telegram.ui.ActionBar.o2 {
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
    public org.telegram.ui.Components.k00 L;
    public cz M;
    public final ri N;
    public ValueAnimator O;
    public float P;
    public va1 a;
    public kz b;
    public final MessagesController.DialogFilter c;
    public final TL_chatlists.TL_exportedChatlistInvite d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList h;
    public org.telegram.ui.Components.fr n;
    public org.telegram.ui.ActionBar.w0 r;
    public int s;
    public long v;
    public long w;
    public Utilities.Callback x;
    public Utilities.Callback y;

    public lz(MessagesController.DialogFilter dialogFilter, TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
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
        this.N = new ri(this, 28);
        this.P = 1.0f;
        this.c = dialogFilter;
        this.d = tL_exportedChatlistInvite;
    }

    public static void T(lz lzVar, TLRPC.TL_error tL_error) {
        lzVar.d0(false);
        lzVar.A = false;
        if (tL_error != null && "INVITES_TOO_MUCH".equals(tL_error.text)) {
            lzVar.showDialog(new zf.j0(12, lzVar.currentAccount, lzVar.getParentActivity(), lzVar, null));
            return;
        }
        if (tL_error != null && "INVITE_PEERS_TOO_MUCH".equals(tL_error.text)) {
            lzVar.showDialog(new zf.j0(4, lzVar.currentAccount, lzVar.getParentActivity(), lzVar, null));
        } else if (tL_error == null || !"CHATLISTS_TOO_MUCH".equals(tL_error.text)) {
            lzVar.finishFragment();
        } else {
            lzVar.showDialog(new zf.j0(13, lzVar.currentAccount, lzVar.getParentActivity(), lzVar, null));
        }
    }

    public static void U(lz lzVar, View view, int i9) {
        String str;
        lz lzVar2;
        ArrayList arrayList = lzVar.e;
        if (lzVar.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.g4)) {
            Long l10 = (Long) lzVar.h.get(i9 - lzVar.I);
            long longValue = l10.longValue();
            if (arrayList.contains(l10)) {
                arrayList.remove(l10);
                lzVar.C = true;
                lzVar.W();
                ((org.telegram.ui.Cells.g4) view).c(false, true);
                lzVar2 = lzVar;
            } else {
                if (!lzVar.f.contains(l10)) {
                    int i10 = -lzVar.s;
                    lzVar.s = i10;
                    AndroidUtilities.shakeViewSpring(view, i10);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    ArrayList arrayList2 = new ArrayList();
                    if (longValue >= 0) {
                        arrayList2.add(lzVar.getMessagesController().getUser(l10));
                        TLRPC.User user = lzVar.getMessagesController().getUser(l10);
                        str = (user == null || !user.bot) ? LocaleController.getString(R.string.FilterInviteUserToast) : LocaleController.getString(R.string.FilterInviteBotToast);
                    } else {
                        TLRPC.Chat chat = lzVar.getMessagesController().getChat(Long.valueOf(-longValue));
                        String string = ChatObject.isChannelAndNotMegaGroup(chat) ? ChatObject.isPublic(chat) ? LocaleController.getString(R.string.FilterInviteChannelToast) : LocaleController.getString(R.string.FilterInvitePrivateChannelToast) : ChatObject.isPublic(chat) ? LocaleController.getString(R.string.FilterInviteGroupToast) : LocaleController.getString(R.string.FilterInvitePrivateGroupToast);
                        arrayList2.add(chat);
                        str = string;
                    }
                    if (lzVar.v != longValue || System.currentTimeMillis() - lzVar.w > 1500) {
                        lzVar.v = longValue;
                        lzVar.w = System.currentTimeMillis();
                        org.telegram.ui.Components.oc.a0(lzVar).g(str, arrayList2).j();
                        return;
                    }
                    return;
                }
                if (arrayList.size() + 1 > lzVar.Z()) {
                    lzVar.showDialog(new zf.j0(4, lzVar.currentAccount, lzVar.getParentActivity(), lzVar, null));
                    return;
                }
                lzVar2 = lzVar;
                arrayList.add(l10);
                lzVar2.C = true;
                lzVar2.W();
                ((org.telegram.ui.Cells.g4) view).c(true, true);
            }
            lzVar2.X();
            lzVar2.e0(true);
            lzVar2.f0();
        }
    }

    public final boolean V(boolean z10) {
        if (this.e.isEmpty() || !this.C) {
            return true;
        }
        if (!z10) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.N = LocaleController.getString(R.string.UnsavedChanges);
        alertDialog$Builder.a.P = LocaleController.getString(R.string.UnsavedChangesMessage);
        final int i9 = 0;
        alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.bz
            public final /* synthetic */ lz b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.b2
            public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
                switch (i9) {
                    case 0:
                        this.b.b0();
                        break;
                    default:
                        this.b.finishFragment();
                        break;
                }
            }
        });
        final int i10 = 1;
        alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.bz
            public final /* synthetic */ lz b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.b2
            public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i102) {
                switch (i10) {
                    case 0:
                        this.b.b0();
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

    public final void W() {
        float f10 = this.C ? !this.e.isEmpty() ? 1.0f : 0.5f : 0.0f;
        if (Math.abs(this.P - f10) > 0.1f) {
            this.r.clearAnimation();
            ViewPropertyAnimator animate = this.r.animate();
            this.P = f10;
            animate.alpha(f10).setDuration(320L).setInterpolator(org.telegram.ui.Components.gr.h).start();
        }
    }

    public final void X() {
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite == null || tL_exportedChatlistInvite.url == null || !this.C) {
            return;
        }
        ArrayList arrayList = this.e;
        boolean z10 = true;
        boolean z11 = arrayList.size() != tL_exportedChatlistInvite.peers.size();
        if (!z11) {
            for (int i9 = 0; i9 < tL_exportedChatlistInvite.peers.size(); i9++) {
                if (!arrayList.contains(Long.valueOf(DialogObject.getPeerDialogId(tL_exportedChatlistInvite.peers.get(i9))))) {
                    break;
                }
            }
        }
        z10 = z11;
        if (z10) {
            return;
        }
        this.C = false;
        W();
    }

    public final void Y(org.telegram.ui.Components.k00 k00Var, boolean z10) {
        ArrayList arrayList = this.e;
        arrayList.clear();
        ArrayList arrayList2 = this.f;
        if (!z10) {
            arrayList.addAll(arrayList2.subList(0, Math.min(Z(), arrayList2.size())));
        }
        k00Var.a(LocaleController.getString(arrayList.size() >= Math.min(Z(), arrayList2.size()) ? R.string.DeselectAll : R.string.SelectAll), new gh.u5(this, k00Var, z10, 24));
        this.C = true;
        X();
        W();
        e0(true);
        f0();
        for (int i9 = 0; i9 < this.a.getChildCount(); i9++) {
            View childAt = this.a.getChildAt(i9);
            if (childAt instanceof org.telegram.ui.Cells.g4) {
                Object tag = childAt.getTag();
                if (tag instanceof Long) {
                    ((org.telegram.ui.Cells.g4) childAt).c(arrayList.contains((Long) tag), true);
                }
            }
        }
    }

    public final int Z() {
        return getUserConfig().isPremium() ? getMessagesController().dialogFiltersChatsLimitPremium : getMessagesController().dialogFiltersChatsLimitDefault;
    }

    public final String a0() {
        String str;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite == null || (str = tL_exportedChatlistInvite.url) == null) {
            return null;
        }
        return str.substring(str.lastIndexOf(47) + 1);
    }

    public final void b0() {
        ArrayList arrayList;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite == null || this.A || !this.C) {
            return;
        }
        d0(true);
        this.A = true;
        tL_exportedChatlistInvite.peers.clear();
        int i9 = 0;
        while (true) {
            arrayList = this.e;
            if (i9 >= arrayList.size()) {
                break;
            }
            tL_exportedChatlistInvite.peers.add(getMessagesController().getPeer(((Long) arrayList.get(i9)).longValue()));
            i9++;
        }
        TL_chatlists.TL_chatlists_editExportedInvite tL_chatlists_editExportedInvite = new TL_chatlists.TL_chatlists_editExportedInvite();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_editExportedInvite.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = this.c.id;
        tL_chatlists_editExportedInvite.slug = a0();
        tL_chatlists_editExportedInvite.revoked = tL_exportedChatlistInvite.revoked;
        tL_chatlists_editExportedInvite.flags |= 4;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            tL_chatlists_editExportedInvite.peers.add(getMessagesController().getInputPeer(((Long) arrayList.get(i10)).longValue()));
        }
        getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new az(this, 1));
        Utilities.Callback callback = this.y;
        if (callback != null) {
            callback.run(tL_exportedChatlistInvite);
        }
    }

    public final void c0(boolean z10) {
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        String string = TextUtils.isEmpty(tL_exportedChatlistInvite == null ? null : tL_exportedChatlistInvite.title) ? LocaleController.getString(R.string.FilterShare) : tL_exportedChatlistInvite.title;
        if (z10) {
            this.actionBar.I(string, false, 220L, null);
        } else {
            this.actionBar.setTitle(string);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean canBeginSlide() {
        return V(true);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        c0(false);
        this.actionBar.setActionBarMenuOnItemClick(new tq(this, 17));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i9 = org.telegram.ui.ActionBar.f6.v8;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i9, false), PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.Components.fr frVar = new org.telegram.ui.Components.fr(mutate, new org.telegram.ui.Components.jp(org.telegram.ui.ActionBar.f6.w0(null, i9, false)));
        this.n = frVar;
        this.r = n10.i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), frVar);
        W();
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.a7, false));
        va1 va1Var = new va1(context, 9, null);
        this.a = va1Var;
        va1Var.setLayoutManager(new f2.m0(1, false));
        this.a.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.a, g7.e6.c(-1.0f, -1));
        va1 va1Var2 = this.a;
        kz kzVar = new kz(this);
        this.b = kzVar;
        va1Var2.setAdapter(kzVar);
        this.a.setOnItemClickListener(new i(this, 8));
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
                    z10 = n00.f0(getMessagesController().getChat(Long.valueOf(-dialog.id)));
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
            int i13 = this.D;
            int i14 = i13 + 1;
            this.H = i13;
            int i15 = i13 + 2;
            this.D = i15;
            this.I = i14;
            int size = (arrayList.size() - 1) + i15;
            this.J = size;
            this.D = size + 1;
            this.K = size;
        }
        kz kzVar2 = this.b;
        if (kzVar2 != null) {
            kzVar2.l();
        }
        return this.fragmentView;
    }

    public final void d0(boolean z10) {
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
            ofFloat.addUpdateListener(new f3(this, 12));
            this.O.setDuration((long) (Math.abs(this.n.c - (z10 ? 1.0f : 0.0f)) * 200.0f));
            this.O.setInterpolator(org.telegram.ui.Components.gr.f);
            this.O.start();
        }
    }

    public final void e0(boolean z10) {
        org.telegram.ui.Components.k00 k00Var = this.L;
        if (k00Var == null) {
            return;
        }
        ArrayList arrayList = this.e;
        k00Var.b(arrayList.size() <= 0 ? LocaleController.getString("FilterInviteHeaderChatsEmpty") : LocaleController.formatPluralString("FilterInviteHeaderChats", arrayList.size(), new Object[0]), z10);
        ArrayList arrayList2 = this.f;
        if (arrayList2.size() > 1) {
            boolean z11 = arrayList.size() >= Math.min(Z(), arrayList2.size());
            this.L.a(LocaleController.getString(!z11 ? R.string.SelectAll : R.string.DeselectAll), new org.telegram.ui.Components.a50(10, this, z11));
        } else {
            this.L.a("", null);
        }
        if (z10) {
            AndroidUtilities.makeAccessibilityAnnouncement(((Object) this.L.a.getText()) + ", " + ((Object) this.L.b.getText()));
        }
    }

    public final void f0() {
        cz czVar = this.M;
        if (czVar == null) {
            return;
        }
        if (this.d == null) {
            String string = LocaleController.getString(R.string.FilterInviteHeaderNo);
            dh.u uVar = czVar.a;
            uVar.setText(string);
            uVar.h = 0;
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = czVar.getSubtitleTextView().getPaint().getFontMetricsInt();
        MessagesController.DialogFilter dialogFilter = this.c;
        Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, fontMetricsInt, false), dialogFilter.entities, fontMetricsInt);
        cz czVar2 = this.M;
        CharSequence replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralSpannable("FilterInviteHeader", this.e.size(), replaceAnimatedEmoji));
        boolean z10 = dialogFilter.title_noanimate;
        dh.u uVar2 = czVar2.a;
        uVar2.setText(replaceTags);
        uVar2.h = z10 ? 26 : 0;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onBackPressed(boolean z10) {
        return V(z10);
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
