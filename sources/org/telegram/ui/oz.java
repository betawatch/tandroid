package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
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
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class oz extends org.telegram.ui.ActionBar.o2 {
    public Utilities.Callback E;
    public boolean F;
    public int G;
    public boolean H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public org.telegram.ui.Components.h10 Q;
    public dz R;
    public final ti S;
    public ValueAnimator T;
    public float U;
    public xa1 a;
    public nz b;
    public final MessagesController.DialogFilter c;
    public final TL_chatlists.TL_exportedChatlistInvite d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList h;
    public org.telegram.ui.Components.as n;
    public org.telegram.ui.Components.eq r;
    public org.telegram.ui.ActionBar.u0 s;
    public int v;
    public long w;
    public long x;
    public Utilities.Callback y;

    public oz(MessagesController.DialogFilter dialogFilter, TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        super(null);
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.v = -5;
        this.F = false;
        this.I = 0;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.O = -1;
        this.P = -1;
        this.S = new ti(this, 29);
        this.U = 1.0f;
        this.c = dialogFilter;
        this.d = tL_exportedChatlistInvite;
    }

    public static void U(oz ozVar, TLRPC.TL_error tL_error) {
        ozVar.e0(false);
        ozVar.F = false;
        if (tL_error != null && "INVITES_TOO_MUCH".equals(tL_error.text)) {
            ozVar.showDialog(new sg.j0(12, ozVar.currentAccount, ozVar.getParentActivity(), ozVar, null));
            return;
        }
        if (tL_error != null && "INVITE_PEERS_TOO_MUCH".equals(tL_error.text)) {
            ozVar.showDialog(new sg.j0(4, ozVar.currentAccount, ozVar.getParentActivity(), ozVar, null));
        } else if (tL_error == null || !"CHATLISTS_TOO_MUCH".equals(tL_error.text)) {
            ozVar.finishFragment();
        } else {
            ozVar.showDialog(new sg.j0(13, ozVar.currentAccount, ozVar.getParentActivity(), ozVar, null));
        }
    }

    public static void V(oz ozVar, View view, int i10) {
        String str;
        oz ozVar2;
        ArrayList arrayList = ozVar.e;
        if (ozVar.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.f4)) {
            Long l4 = (Long) ozVar.h.get(i10 - ozVar.N);
            long longValue = l4.longValue();
            if (arrayList.contains(l4)) {
                arrayList.remove(l4);
                ozVar.H = true;
                ozVar.X();
                ((org.telegram.ui.Cells.f4) view).c(false, true);
                ozVar2 = ozVar;
            } else {
                if (!ozVar.f.contains(l4)) {
                    int i11 = -ozVar.v;
                    ozVar.v = i11;
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
                    if (ozVar.w != longValue || System.currentTimeMillis() - ozVar.x > 1500) {
                        ozVar.w = longValue;
                        ozVar.x = System.currentTimeMillis();
                        org.telegram.ui.Components.xc.a0(ozVar).g(str, arrayList2).j();
                        return;
                    }
                    return;
                }
                if (arrayList.size() + 1 > ozVar.a0()) {
                    ozVar.showDialog(new sg.j0(4, ozVar.currentAccount, ozVar.getParentActivity(), ozVar, null));
                    return;
                }
                ozVar2 = ozVar;
                arrayList.add(l4);
                ozVar2.H = true;
                ozVar2.X();
                ((org.telegram.ui.Cells.f4) view).c(true, true);
            }
            ozVar2.Y();
            ozVar2.f0(true);
            ozVar2.g0();
        }
    }

    public final boolean W(boolean z10) {
        if (this.e.isEmpty() || !this.H) {
            return true;
        }
        if (!z10) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.R = LocaleController.getString(R.string.UnsavedChanges);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.UnsavedChangesMessage);
        final int i10 = 0;
        alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.z1(this) { // from class: org.telegram.ui.cz
            public final /* synthetic */ oz b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.z1
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
        alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new org.telegram.ui.ActionBar.z1(this) { // from class: org.telegram.ui.cz
            public final /* synthetic */ oz b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.z1
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
        float f7 = this.H ? !this.e.isEmpty() ? 1.0f : 0.5f : 0.0f;
        if (Math.abs(this.U - f7) > 0.1f) {
            this.s.clearAnimation();
            ViewPropertyAnimator animate = this.s.animate();
            this.U = f7;
            animate.alpha(f7).setDuration(320L).setInterpolator(org.telegram.ui.Components.bs.h).start();
        }
    }

    public final void Y() {
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite == null || tL_exportedChatlistInvite.url == null || !this.H) {
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
        this.H = false;
        X();
    }

    public final void Z(org.telegram.ui.Components.h10 h10Var, boolean z10) {
        ArrayList arrayList = this.e;
        arrayList.clear();
        ArrayList arrayList2 = this.f;
        if (!z10) {
            arrayList.addAll(arrayList2.subList(0, Math.min(a0(), arrayList2.size())));
        }
        h10Var.a(LocaleController.getString(arrayList.size() >= Math.min(a0(), arrayList2.size()) ? R.string.DeselectAll : R.string.SelectAll), new ai.y7(this, h10Var, z10, 28));
        this.H = true;
        Y();
        X();
        f0(true);
        g0();
        for (int i10 = 0; i10 < this.a.getChildCount(); i10++) {
            View childAt = this.a.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.f4) {
                Object tag = childAt.getTag();
                if (tag instanceof Long) {
                    ((org.telegram.ui.Cells.f4) childAt).c(arrayList.contains((Long) tag), true);
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
        if (tL_exportedChatlistInvite == null || this.F || !this.H) {
            return;
        }
        e0(true);
        this.F = true;
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
        getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new bz(this, 1));
        Utilities.Callback callback = this.E;
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
        this.actionBar.setActionBarMenuOnItemClick(new ea(this, 25));
        org.telegram.ui.ActionBar.y m10 = this.actionBar.m();
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.k6.v8;
        org.telegram.ui.ActionBar.r6.z(kVar, mutate, i10, null, PorterDuff.Mode.MULTIPLY);
        org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        this.r = eqVar;
        org.telegram.ui.Components.as asVar = new org.telegram.ui.Components.as(mutate, eqVar);
        this.n = asVar;
        this.s = m10.i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), asVar);
        X();
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.a7, frameLayout, null);
        xa1 xa1Var = new xa1(context, 9, null);
        this.a = xa1Var;
        xa1Var.setLayoutManager(new s4.b0(1, false));
        this.a.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.a, w7.z5.c(-1.0f, -1));
        xa1 xa1Var2 = this.a;
        nz nzVar = new nz(this);
        this.b = nzVar;
        xa1Var2.setAdapter(nzVar);
        this.a.setOnItemClickListener(new h(this, 9));
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
                    z10 = q00.g0(getMessagesController().getChat(Long.valueOf(-dialog.id)));
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
        this.I = 1;
        if (tL_exportedChatlistInvite != null) {
            this.K = 1;
            this.J = 2;
            this.I = 4;
            this.L = 3;
        } else {
            this.K = -1;
            this.J = -1;
            this.L = -1;
        }
        if (tL_exportedChatlistInvite == null && arrayList.isEmpty()) {
            this.M = -1;
            this.N = -1;
            this.O = -1;
            this.P = -1;
        } else {
            int i14 = this.I;
            int i15 = i14 + 1;
            this.M = i14;
            int i16 = i14 + 2;
            this.I = i16;
            this.N = i15;
            int size = (arrayList.size() - 1) + i16;
            this.O = size;
            this.I = size + 1;
            this.P = size;
        }
        nz nzVar2 = this.b;
        if (nzVar2 != null) {
            nzVar2.l();
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
            AndroidUtilities.cancelRunOnUIThread(this.S);
        }
        if (this.n != null) {
            ValueAnimator valueAnimator = this.T;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.n.c, z10 ? 1.0f : 0.0f);
            this.T = ofFloat;
            ofFloat.addUpdateListener(new d3(this, 12));
            this.T.setDuration((long) (Math.abs(this.n.c - (z10 ? 1.0f : 0.0f)) * 200.0f));
            this.T.setInterpolator(org.telegram.ui.Components.bs.f);
            this.T.start();
        }
    }

    public final void f0(boolean z10) {
        org.telegram.ui.Components.h10 h10Var = this.Q;
        if (h10Var == null) {
            return;
        }
        ArrayList arrayList = this.e;
        h10Var.b(arrayList.size() <= 0 ? LocaleController.getString("FilterInviteHeaderChatsEmpty") : LocaleController.formatPluralString("FilterInviteHeaderChats", arrayList.size(), new Object[0]), z10);
        ArrayList arrayList2 = this.f;
        if (arrayList2.size() > 1) {
            boolean z11 = arrayList.size() >= Math.min(a0(), arrayList2.size());
            this.Q.a(LocaleController.getString(!z11 ? R.string.SelectAll : R.string.DeselectAll), new org.telegram.ui.Components.b60(11, this, z11));
        } else {
            this.Q.a("", null);
        }
        if (z10) {
            AndroidUtilities.makeAccessibilityAnnouncement(((Object) this.Q.a.getText()) + ", " + ((Object) this.Q.b.getText()));
        }
    }

    public final void g0() {
        dz dzVar = this.R;
        if (dzVar == null) {
            return;
        }
        if (this.d == null) {
            String string = LocaleController.getString(R.string.FilterInviteHeaderNo);
            wh.n nVar = dzVar.a;
            nVar.setText(string);
            nVar.s = 0;
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = dzVar.getSubtitleTextView().getPaint().getFontMetricsInt();
        MessagesController.DialogFilter dialogFilter = this.c;
        Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, fontMetricsInt, false), dialogFilter.entities, fontMetricsInt);
        dz dzVar2 = this.R;
        CharSequence replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralSpannable("FilterInviteHeader", this.e.size(), replaceAnimatedEmoji));
        boolean z10 = dialogFilter.title_noanimate;
        wh.n nVar2 = dzVar2.a;
        nVar2.setText(replaceTags);
        nVar2.s = z10 ? 26 : 0;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onBackPressed(boolean z10) {
        return W(z10);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.G != 0) {
            getConnectionsManager().cancelRequest(this.G, true);
            this.G = 0;
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.eq eqVar = this.r;
            if (eqVar != null) {
                eqVar.b(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.v8, false));
                org.telegram.ui.Components.as asVar = this.n;
                if (asVar != null) {
                    asVar.invalidateSelf();
                }
                org.telegram.ui.ActionBar.u0 u0Var = this.s;
                if (u0Var != null) {
                    u0Var.invalidate();
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
