package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
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
public final class n00 extends sa {
    public long A0;
    public String T;
    public int U;
    public TL_chatlists.chatlist_ChatlistInvite V;
    public TL_chatlists.TL_chatlists_chatlistUpdates W;
    public final boolean X;
    public String Y;
    public ArrayList Z;
    public boolean a0;
    public CharSequence b0;
    public ArrayList c0;
    public ArrayList d0;
    public ArrayList e0;
    public ArrayList f0;
    public FrameLayout g0;
    public j00 h0;
    public View i0;
    public m00 j0;
    public int k0;
    public int l0;
    public int m0;
    public int n0;
    public int o0;
    public int p0;
    public int q0;
    public int r0;
    public int s0;
    public int t0;
    public k00 u0;
    public int v0;
    public boolean w0;
    public Utilities.Callback x0;
    public int y0;
    public long z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n00(org.telegram.ui.ActionBar.o2 o2Var, int i9, ArrayList arrayList) {
        super(o2Var, false);
        MessagesController.DialogFilter dialogFilter;
        TLRPC.Chat chat;
        this.U = -1;
        this.Y = "";
        this.Z = new ArrayList();
        this.b0 = "";
        this.d0 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.e0 = arrayList2;
        this.v0 = -1;
        this.y0 = -5;
        this.U = i9;
        this.X = true;
        this.c0 = new ArrayList();
        arrayList2.clear();
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        ArrayList<MessagesController.DialogFilter> arrayList3 = o2Var.getMessagesController().dialogFilters;
        if (arrayList3 != null) {
            for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                if (arrayList3.get(i10).id == i9) {
                    dialogFilter = arrayList3.get(i10);
                    break;
                }
            }
        }
        dialogFilter = null;
        if (dialogFilter != null) {
            this.Y = dialogFilter.name;
            this.Z = dialogFilter.entities;
            this.a0 = dialogFilter.title_noanimate;
            for (int i11 = 0; i11 < this.e0.size(); i11++) {
                TLRPC.Peer peer = o2Var.getMessagesController().getPeer(((Long) this.e0.get(i11)).longValue());
                if ((peer instanceof TLRPC.TL_peerChat) || (peer instanceof TLRPC.TL_peerChannel)) {
                    this.c0.add(peer);
                }
            }
            for (int i12 = 0; i12 < dialogFilter.alwaysShow.size(); i12++) {
                Long l10 = dialogFilter.alwaysShow.get(i12);
                long longValue = l10.longValue();
                if (!this.e0.contains(l10)) {
                    TLRPC.Peer peer2 = o2Var.getMessagesController().getPeer(longValue);
                    if (((peer2 instanceof TLRPC.TL_peerChat) || (peer2 instanceof TLRPC.TL_peerChannel)) && ((chat = o2Var.getMessagesController().getChat(Long.valueOf(-longValue))) == null || !ChatObject.isNotInChat(chat))) {
                        this.c0.add(peer2);
                    }
                }
            }
        }
        R();
    }

    public static void S(org.telegram.ui.ActionBar.o2 o2Var, int i9, Utilities.Callback callback) {
        MessagesController.DialogFilter dialogFilter;
        ArrayList<MessagesController.DialogFilter> arrayList = o2Var.getMessagesController().dialogFilters;
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (arrayList.get(i10).id == i9) {
                    dialogFilter = arrayList.get(i10);
                    break;
                }
            }
        }
        dialogFilter = null;
        org.telegram.ui.rl rlVar = new org.telegram.ui.rl(i9, o2Var, callback, 4);
        if (dialogFilter == null || !dialogFilter.isMyChatlist()) {
            rlVar.run();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getContext());
        alertDialog$Builder.a.N = LocaleController.getString(R.string.FilterDelete);
        alertDialog$Builder.a.P = LocaleController.getString(R.string.FilterDeleteAlertLinks);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new km(callback));
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new wu(rlVar, 4));
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        o2Var.showDialog(c2Var);
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false));
        }
    }

    @Override // org.telegram.ui.Components.sa
    public final void F(xu0 xu0Var) {
        wk0 wk0Var = this.d;
        wk0Var.setOverScrollMode(2);
        wk0Var.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(this.h0 != null ? 68.0f : 0.0f));
        wk0Var.setOnItemClickListener(new j(this, 8));
    }

    public final void P(boolean z10) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(LocaleController.formatPluralString("FilterInviteHeaderChats", this.e0.size(), new Object[0]));
        if (!z10 || this.u0 == null) {
            str = "";
        } else {
            str = ", " + ((Object) this.u0.b.getText());
        }
        sb2.append(str);
        AndroidUtilities.makeAccessibilityAnnouncement(sb2.toString());
    }

    public final void Q(k00 k00Var, boolean z10) {
        ArrayList arrayList = this.c0;
        ArrayList arrayList2 = this.e0;
        arrayList2.clear();
        arrayList2.addAll(this.d0);
        int i9 = 0;
        if (!z10) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                long peerDialogId = DialogObject.getPeerDialogId((TLRPC.Peer) arrayList.get(i10));
                if (!arrayList2.contains(Long.valueOf(peerDialogId))) {
                    arrayList2.add(Long.valueOf(peerDialogId));
                }
            }
        }
        T(true);
        k00Var.a(LocaleController.getString(z10 ? R.string.SelectAll : R.string.DeselectAll), new gh.u5(this, k00Var, z10, 16));
        P(true);
        while (true) {
            wk0 wk0Var = this.d;
            if (i9 >= wk0Var.getChildCount()) {
                return;
            }
            View childAt = wk0Var.getChildAt(i9);
            if (childAt instanceof org.telegram.ui.Cells.g4) {
                Object tag = childAt.getTag();
                if (tag instanceof Long) {
                    ((org.telegram.ui.Cells.g4) childAt).c(arrayList2.contains((Long) tag), true);
                }
            }
            i9++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R() {
        long j10;
        boolean isNotInChat;
        boolean z10;
        ArrayList arrayList = this.f0;
        this.b0 = AndroidUtilities.replaceCharSequence("*", this.Y, "✱");
        ArrayList arrayList2 = this.c0;
        if (arrayList2 != null) {
            for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                TLRPC.Peer peer = (TLRPC.Peer) arrayList2.get(i9);
                if (peer != null) {
                    if (peer instanceof TLRPC.TL_peerUser) {
                        j10 = peer.user_id;
                    } else {
                        boolean z11 = peer instanceof TLRPC.TL_peerChat;
                        org.telegram.ui.ActionBar.o2 o2Var = this.n;
                        if (z11) {
                            j10 = -peer.chat_id;
                            isNotInChat = ChatObject.isNotInChat(o2Var.getMessagesController().getChat(Long.valueOf(-j10)));
                        } else if (peer instanceof TLRPC.TL_peerChannel) {
                            j10 = -peer.channel_id;
                            isNotInChat = ChatObject.isNotInChat(o2Var.getMessagesController().getChat(Long.valueOf(-j10)));
                        } else {
                            j10 = 0;
                        }
                        z10 = !isNotInChat;
                        if (j10 != 0 && !this.X) {
                            if (z10) {
                                this.d0.add(Long.valueOf(j10));
                            }
                            this.e0.add(Long.valueOf(j10));
                        }
                    }
                    z10 = false;
                    if (j10 != 0) {
                        if (z10) {
                        }
                        this.e0.add(Long.valueOf(j10));
                    }
                }
            }
        }
        this.k0 = 1;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            this.l0 = -1;
            this.m0 = -1;
            this.n0 = -1;
            this.o0 = -1;
        } else {
            int i10 = this.k0;
            int i11 = i10 + 1;
            this.l0 = i10;
            int i12 = i10 + 2;
            this.k0 = i12;
            this.m0 = i11;
            this.n0 = i12;
            int size = arrayList2.size() + i12;
            this.k0 = size;
            this.o0 = size;
        }
        int i13 = this.k0;
        this.k0 = i13 + 1;
        this.p0 = i13;
        if (arrayList == null || arrayList.isEmpty()) {
            this.q0 = -1;
            this.r0 = -1;
            this.s0 = -1;
            this.t0 = -1;
        } else {
            int i14 = this.k0;
            int i15 = i14 + 1;
            this.k0 = i15;
            this.q0 = i14;
            this.r0 = i15;
            int size2 = arrayList.size() + i15;
            this.s0 = size2;
            this.k0 = size2 + 1;
            this.t0 = size2;
        }
        Context context = getContext();
        j00 j00Var = new j00(context);
        gr grVar = gr.h;
        j00Var.e = new y5(350L, grVar);
        j00Var.h = 0.0f;
        j00Var.s = 1.0f;
        j00Var.x = 1.0f;
        j00Var.y = true;
        View view = new View(context);
        j00Var.f = view;
        int i16 = org.telegram.ui.ActionBar.f6.Oh;
        view.setBackground(org.telegram.ui.ActionBar.v5.d(new float[]{8.0f}, 0, org.telegram.ui.ActionBar.v5.b(org.telegram.ui.ActionBar.f6.w0(null, i16, false))));
        j00Var.addView(view, g7.e6.c(-1.0f, -1));
        j00Var.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(8.0f), org.telegram.ui.ActionBar.f6.w0(null, i16, false)));
        Paint paint = new Paint(1);
        j00Var.a = paint;
        int i17 = org.telegram.ui.ActionBar.f6.Sh;
        paint.setColor(org.telegram.ui.ActionBar.f6.w0(null, i17, false));
        i6 i6Var = new i6(true, true, false, false);
        j00Var.b = i6Var;
        i6Var.k(0.3f, 250L, grVar);
        i6Var.setCallback(j00Var);
        i6Var.t(AndroidUtilities.dp(14.0f));
        i6Var.u(AndroidUtilities.bold());
        i6Var.r(org.telegram.ui.ActionBar.f6.w0(null, i17, false));
        i6Var.q("", true, true);
        i6Var.b = 1;
        i6 i6Var2 = new i6(false, false, true, false);
        j00Var.c = i6Var2;
        i6Var2.k(0.3f, 250L, grVar);
        i6Var2.setCallback(j00Var);
        i6Var2.t(AndroidUtilities.dp(12.0f));
        i6Var2.u(AndroidUtilities.bold());
        i6Var2.r(org.telegram.ui.ActionBar.f6.w0(null, i16, false));
        i6Var2.q("", true, true);
        i6Var2.b = 1;
        j00Var.setWillNotDraw(false);
        this.h0 = j00Var;
        j00Var.setOnClickListener(new f0(this, 16));
        this.containerView.addView(this.h0, g7.e6.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 10.0f));
        View view2 = new View(getContext());
        this.i0 = view2;
        view2.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.a7, false));
        this.containerView.addView(this.i0, g7.e6.d(-1, 1.0f / AndroidUtilities.density, 87, 6.0f, 0.0f, 6.0f, 68.0f));
        this.d.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(this.h0 != null ? 68.0f : 0.0f));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.g0 = frameLayout;
        this.containerView.addView(frameLayout, g7.e6.d(-1, 100.0f, 87, 6.0f, 0.0f, 6.0f, 68.0f));
        fixNavigationBar(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.h5, false));
        T(false);
        this.e.setTitle(y());
    }

    public final void T(boolean z10) {
        int i9;
        TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = this.V;
        int size = this.e0.size();
        j00 j00Var = this.h0;
        if (j00Var != null) {
            if (this.X) {
                j00Var.b(LocaleController.getString(size > 0 ? R.string.FolderLinkButtonRemoveChats : R.string.FolderLinkButtonRemove), z10);
            } else {
                ArrayList arrayList = this.c0;
                if (arrayList == null || arrayList.isEmpty()) {
                    this.h0.b(LocaleController.getString(R.string.OK), z10);
                } else {
                    if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                        this.h0.b(LocaleController.formatSpannable(R.string.FolderLinkButtonAdd, MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(this.Y, this.h0.b.a.getFontMetricsInt(), false), this.Z, this.h0.b.a.getFontMetricsInt())), z10);
                        this.h0.b.l = this.a0 ? 26 : 0;
                    } else {
                        this.h0.b(size > 0 ? LocaleController.formatPluralString("FolderLinkButtonJoinPlural", size, new Object[0]) : LocaleController.getString(R.string.FolderLinkButtonNone), z10);
                    }
                }
            }
            j00 j00Var2 = this.h0;
            i6 i6Var = j00Var2.c;
            if (z10) {
                i6Var.b();
            }
            if (z10 && size != (i9 = j00Var2.w) && size > 0 && i9 > 0) {
                ValueAnimator valueAnimator = j00Var2.v;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    j00Var2.v = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                j00Var2.v = ofFloat;
                ofFloat.addUpdateListener(new i00(j00Var2, 1));
                j00Var2.v.addListener(new org.telegram.ui.xp(j00Var2, 29));
                j00Var2.v.setInterpolator(new OvershootInterpolator(2.0f));
                j00Var2.v.setDuration(200L);
                j00Var2.v.start();
            }
            j00Var2.w = size;
            j00Var2.d = size != 0 ? 1.0f : 0.0f;
            i6Var.q("" + size, z10, true);
            j00Var2.invalidate();
            if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                this.h0.setEnabled(!r1.isEmpty());
            }
        }
        m00 m00Var = this.j0;
        if (m00Var != null) {
            m00Var.a();
        }
    }

    public final void U() {
        ArrayList arrayList = this.d0;
        ArrayList arrayList2 = this.c0;
        k00 k00Var = this.u0;
        if (k00Var == null) {
            return;
        }
        if (this.X) {
            k00Var.b(LocaleController.formatPluralString("FolderLinkHeaderChatsQuit", arrayList2.size(), new Object[0]), false);
        } else {
            k00Var.b(LocaleController.formatPluralString("FolderLinkHeaderChatsJoin", arrayList2.size(), new Object[0]), false);
        }
        if (arrayList2 == null || arrayList2.size() - arrayList.size() <= 1) {
            this.u0.a("", null);
        } else {
            boolean z10 = this.e0.size() >= arrayList2.size() - arrayList.size();
            this.u0.a(LocaleController.getString(z10 ? R.string.DeselectAll : R.string.SelectAll), new eh.f(28, this, z10));
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        super.dismiss();
        if (this.v0 >= 0) {
            this.n.getConnectionsManager().cancelRequest(this.v0, true);
        }
        Utilities.Callback callback = this.x0;
        if (callback != null) {
            callback.run(Boolean.valueOf(this.w0));
            this.x0 = null;
        }
    }

    @Override // org.telegram.ui.Components.sa
    public final vk0 v(wk0 wk0Var) {
        return new h00(this);
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        if (this.X) {
            return LocaleController.getString(R.string.FolderLinkTitleRemove);
        }
        if (this.V instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
            return LocaleController.getString(R.string.FolderLinkTitleAdd);
        }
        ArrayList arrayList = this.c0;
        return (arrayList == null || arrayList.isEmpty()) ? LocaleController.getString(R.string.FolderLinkTitleAlready) : LocaleController.getString(R.string.FolderLinkTitleAddChats);
    }
}
