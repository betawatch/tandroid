package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class n10 extends bb {
    public boolean A0;
    public Utilities.Callback B0;
    public int C0;
    public long D0;
    public long E0;
    public String X;
    public int Y;
    public TL_chatlists.chatlist_ChatlistInvite Z;
    public TL_chatlists.TL_chatlists_chatlistUpdates a0;
    public final boolean b0;
    public String c0;
    public ArrayList d0;
    public boolean e0;
    public CharSequence f0;
    public ArrayList g0;
    public ArrayList h0;
    public ArrayList i0;
    public ArrayList j0;
    public FrameLayout k0;
    public j10 l0;
    public View m0;
    public m10 n0;
    public int o0;
    public int p0;
    public int q0;
    public int r0;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public int w0;
    public int x0;
    public k10 y0;
    public int z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n10(org.telegram.ui.ActionBar.r2 r2Var, int i10, ArrayList arrayList) {
        super(r2Var, false);
        MessagesController.DialogFilter dialogFilter;
        TLRPC.Chat chat;
        this.Y = -1;
        this.c0 = "";
        this.d0 = new ArrayList();
        this.f0 = "";
        this.h0 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.i0 = arrayList2;
        this.z0 = -1;
        this.C0 = -5;
        this.Y = i10;
        this.b0 = true;
        this.g0 = new ArrayList();
        arrayList2.clear();
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        ArrayList<MessagesController.DialogFilter> arrayList3 = r2Var.getMessagesController().dialogFilters;
        if (arrayList3 != null) {
            for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                if (arrayList3.get(i11).id == i10) {
                    dialogFilter = arrayList3.get(i11);
                    break;
                }
            }
        }
        dialogFilter = null;
        if (dialogFilter != null) {
            this.c0 = dialogFilter.name;
            this.d0 = dialogFilter.entities;
            this.e0 = dialogFilter.title_noanimate;
            for (int i12 = 0; i12 < this.i0.size(); i12++) {
                TLRPC.Peer peer = r2Var.getMessagesController().getPeer(((Long) this.i0.get(i12)).longValue());
                if ((peer instanceof TLRPC.TL_peerChat) || (peer instanceof TLRPC.TL_peerChannel)) {
                    this.g0.add(peer);
                }
            }
            for (int i13 = 0; i13 < dialogFilter.alwaysShow.size(); i13++) {
                Long l4 = dialogFilter.alwaysShow.get(i13);
                long longValue = l4.longValue();
                if (!this.i0.contains(l4)) {
                    TLRPC.Peer peer2 = r2Var.getMessagesController().getPeer(longValue);
                    if (((peer2 instanceof TLRPC.TL_peerChat) || (peer2 instanceof TLRPC.TL_peerChannel)) && ((chat = r2Var.getMessagesController().getChat(Long.valueOf(-longValue))) == null || !ChatObject.isNotInChat(chat))) {
                        this.g0.add(peer2);
                    }
                }
            }
        }
        T();
    }

    public static void U(org.telegram.ui.ActionBar.r2 r2Var, int i10, Utilities.Callback callback) {
        MessagesController.DialogFilter dialogFilter;
        ArrayList<MessagesController.DialogFilter> arrayList = r2Var.getMessagesController().dialogFilters;
        if (arrayList != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (arrayList.get(i11).id == i10) {
                    dialogFilter = arrayList.get(i11);
                    break;
                }
            }
        }
        dialogFilter = null;
        org.telegram.ui.g4 g4Var = new org.telegram.ui.g4(i10, r2Var, callback, 9);
        if (dialogFilter == null || !dialogFilter.isMyChatlist()) {
            g4Var.run();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(r2Var.getContext());
        alertDialog$Builder.a.R = LocaleController.getString(R.string.FilterDelete);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.FilterDeleteAlertLinks);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new fn(callback));
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new tv(g4Var, 4));
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
        r2Var.showDialog(e2Var);
        TextView textView = (TextView) e2Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.q7, null);
        }
    }

    @Override // org.telegram.ui.Components.bb
    public final void G(ww0 ww0Var) {
        nm0 nm0Var = this.d;
        nm0Var.setOverScrollMode(2);
        nm0Var.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(this.l0 != null ? 68.0f : 0.0f));
        nm0Var.setOnItemClickListener(new j(this, 8));
    }

    public final void R(boolean z10) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(LocaleController.formatPluralString("FilterInviteHeaderChats", this.i0.size(), new Object[0]));
        if (!z10 || this.y0 == null) {
            str = "";
        } else {
            str = ", " + ((Object) this.y0.b.getText());
        }
        sb2.append(str);
        AndroidUtilities.makeAccessibilityAnnouncement(sb2.toString());
    }

    public final void S(k10 k10Var, boolean z10) {
        ArrayList arrayList = this.g0;
        ArrayList arrayList2 = this.i0;
        arrayList2.clear();
        arrayList2.addAll(this.h0);
        int i10 = 0;
        if (!z10) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                long peerDialogId = DialogObject.getPeerDialogId((TLRPC.Peer) arrayList.get(i11));
                if (!arrayList2.contains(Long.valueOf(peerDialogId))) {
                    arrayList2.add(Long.valueOf(peerDialogId));
                }
            }
        }
        V(true);
        k10Var.a(LocaleController.getString(z10 ? R.string.SelectAll : R.string.DeselectAll), new bi.u7(this, k10Var, z10, 20));
        R(true);
        while (true) {
            nm0 nm0Var = this.d;
            if (i10 >= nm0Var.getChildCount()) {
                return;
            }
            View childAt = nm0Var.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.k4) {
                Object tag = childAt.getTag();
                if (tag instanceof Long) {
                    ((org.telegram.ui.Cells.k4) childAt).c(arrayList2.contains((Long) tag), true);
                }
            }
            i10++;
        }
    }

    public final void T() {
        boolean z10;
        long j10;
        boolean isNotInChat;
        ArrayList arrayList = this.j0;
        this.f0 = AndroidUtilities.replaceCharSequence("*", this.c0, "✱");
        ArrayList arrayList2 = this.g0;
        if (arrayList2 != null) {
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                TLRPC.Peer peer = (TLRPC.Peer) arrayList2.get(i10);
                if (peer != null) {
                    if (peer instanceof TLRPC.TL_peerUser) {
                        j10 = peer.user_id;
                        z10 = false;
                    } else {
                        boolean z11 = peer instanceof TLRPC.TL_peerChat;
                        org.telegram.ui.ActionBar.r2 r2Var = this.n;
                        if (z11) {
                            j10 = -peer.chat_id;
                            isNotInChat = ChatObject.isNotInChat(r2Var.getMessagesController().getChat(Long.valueOf(-j10)));
                        } else if (peer instanceof TLRPC.TL_peerChannel) {
                            j10 = -peer.channel_id;
                            isNotInChat = ChatObject.isNotInChat(r2Var.getMessagesController().getChat(Long.valueOf(-j10)));
                        } else {
                            z10 = false;
                            j10 = 0;
                        }
                        z10 = !isNotInChat;
                    }
                    if (j10 != 0 && !this.b0) {
                        if (z10) {
                            this.h0.add(Long.valueOf(j10));
                        }
                        this.i0.add(Long.valueOf(j10));
                    }
                }
            }
        }
        this.o0 = 1;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            this.p0 = -1;
            this.q0 = -1;
            this.r0 = -1;
            this.s0 = -1;
        } else {
            int i11 = this.o0;
            int i12 = i11 + 1;
            this.p0 = i11;
            int i13 = i11 + 2;
            this.o0 = i13;
            this.q0 = i12;
            this.r0 = i13;
            int size = arrayList2.size() + i13;
            this.o0 = size;
            this.s0 = size;
        }
        int i14 = this.o0;
        this.o0 = i14 + 1;
        this.t0 = i14;
        if (arrayList == null || arrayList.isEmpty()) {
            this.u0 = -1;
            this.v0 = -1;
            this.w0 = -1;
            this.x0 = -1;
        } else {
            int i15 = this.o0;
            int i16 = i15 + 1;
            this.o0 = i16;
            this.u0 = i15;
            this.v0 = i16;
            int size2 = arrayList.size() + i16;
            this.w0 = size2;
            this.o0 = size2 + 1;
            this.x0 = size2;
        }
        Context context = getContext();
        j10 j10Var = new j10(context);
        ds dsVar = ds.h;
        j10Var.e = new h6(350L, dsVar);
        j10Var.n = 0.0f;
        j10Var.v = 1.0f;
        j10Var.y = 1.0f;
        j10Var.E = true;
        j10Var.I = org.telegram.ui.ActionBar.y6.I.q();
        View view = new View(context);
        j10Var.f = view;
        int i17 = org.telegram.ui.ActionBar.y6.Oh;
        view.setBackground(org.telegram.ui.ActionBar.o6.d(new float[]{8.0f}, 0, org.telegram.ui.ActionBar.o6.b(org.telegram.ui.ActionBar.y6.x0(null, i17, false))));
        j10Var.addView(view, kb1.g(-1.0f, -1));
        ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(8.0f), org.telegram.ui.ActionBar.y6.x0(null, i17, false));
        j10Var.h = c02;
        j10Var.setBackground(c02);
        Paint paint = new Paint(1);
        j10Var.a = paint;
        int i18 = org.telegram.ui.ActionBar.y6.Sh;
        paint.setColor(org.telegram.ui.ActionBar.y6.x0(null, i18, false));
        r6 r6Var = new r6(true, true, false);
        j10Var.b = r6Var;
        r6Var.n(0.3f, 250L, dsVar);
        r6Var.setCallback(j10Var);
        r6Var.w(AndroidUtilities.dp(14.0f));
        r6Var.x(AndroidUtilities.bold());
        r6Var.u(org.telegram.ui.ActionBar.y6.x0(null, i18, false));
        r6Var.t("", true, true);
        r6Var.b = 1;
        r6 r6Var2 = new r6(false, false, true);
        j10Var.c = r6Var2;
        r6Var2.n(0.3f, 250L, dsVar);
        r6Var2.setCallback(j10Var);
        r6Var2.w(AndroidUtilities.dp(12.0f));
        r6Var2.x(AndroidUtilities.bold());
        r6Var2.u(org.telegram.ui.ActionBar.y6.x0(null, i17, false));
        r6Var2.t("", true, true);
        r6Var2.b = 1;
        j10Var.setWillNotDraw(false);
        this.l0 = j10Var;
        j10Var.setOnClickListener(new f0(this, 15));
        this.containerView.addView(this.l0, kb1.h(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 10.0f));
        View view2 = new View(getContext());
        this.m0 = view2;
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.a7, view2, null);
        this.containerView.addView(this.m0, kb1.h(-1, 1.0f / AndroidUtilities.density, 87, 6.0f, 0.0f, 6.0f, 68.0f));
        this.d.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(this.l0 != null ? 68.0f : 0.0f));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.k0 = frameLayout;
        this.containerView.addView(frameLayout, kb1.h(-1, 100.0f, 87, 6.0f, 0.0f, 6.0f, 68.0f));
        fixNavigationBar(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.h5, false));
        V(false);
        this.e.setTitle(y());
    }

    public final void V(boolean z10) {
        int i10;
        TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = this.Z;
        int size = this.i0.size();
        j10 j10Var = this.l0;
        if (j10Var != null) {
            int i11 = 0;
            if (this.b0) {
                j10Var.b(LocaleController.getString(size > 0 ? R.string.FolderLinkButtonRemoveChats : R.string.FolderLinkButtonRemove), z10);
            } else {
                ArrayList arrayList = this.g0;
                if (arrayList == null || arrayList.isEmpty()) {
                    this.l0.b(LocaleController.getString(R.string.OK), z10);
                } else if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                    this.l0.b(LocaleController.formatSpannable(R.string.FolderLinkButtonAdd, MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(this.c0, this.l0.b.a.getFontMetricsInt(), false), this.d0, this.l0.b.a.getFontMetricsInt())), z10);
                    this.l0.b.p = this.e0 ? 26 : 0;
                } else {
                    this.l0.b(size > 0 ? LocaleController.formatPluralString("FolderLinkButtonJoinPlural", size, new Object[0]) : LocaleController.getString(R.string.FolderLinkButtonNone), z10);
                }
            }
            j10 j10Var2 = this.l0;
            r6 r6Var = j10Var2.c;
            if (z10) {
                r6Var.a();
            }
            if (z10 && size != (i10 = j10Var2.x) && size > 0 && i10 > 0) {
                ValueAnimator valueAnimator = j10Var2.w;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    j10Var2.w = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                j10Var2.w = ofFloat;
                ofFloat.addUpdateListener(new h10(j10Var2, 1));
                j10Var2.w.addListener(new i10(j10Var2, i11));
                org.telegram.ui.d3.m(2.0f, j10Var2.w);
                j10Var2.w.setDuration(200L);
                j10Var2.w.start();
            }
            j10Var2.x = size;
            j10Var2.d = size != 0 ? 1.0f : 0.0f;
            r6Var.t("" + size, z10, true);
            j10Var2.invalidate();
            if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                this.l0.setEnabled(!r1.isEmpty());
            }
        }
        m10 m10Var = this.n0;
        if (m10Var != null) {
            m10Var.a();
        }
    }

    public final void W() {
        ArrayList arrayList = this.h0;
        ArrayList arrayList2 = this.g0;
        k10 k10Var = this.y0;
        if (k10Var == null) {
            return;
        }
        if (this.b0) {
            k10Var.b(LocaleController.formatPluralString("FolderLinkHeaderChatsQuit", arrayList2.size(), new Object[0]), false);
        } else {
            k10Var.b(LocaleController.formatPluralString("FolderLinkHeaderChatsJoin", arrayList2.size(), new Object[0]), false);
        }
        if (arrayList2 == null || arrayList2.size() - arrayList.size() <= 1) {
            this.y0.a("", null);
        } else {
            boolean z10 = this.i0.size() >= arrayList2.size() - arrayList.size();
            this.y0.a(LocaleController.getString(z10 ? R.string.DeselectAll : R.string.SelectAll), new bh.n(28, this, z10));
        }
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.n2
    public final void dismiss() {
        super.dismiss();
        if (this.z0 >= 0) {
            this.n.getConnectionsManager().cancelRequest(this.z0, true);
        }
        Utilities.Callback callback = this.B0;
        if (callback != null) {
            callback.run(Boolean.valueOf(this.A0));
            this.B0 = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.h5, false);
            if (this.navBarColor != x02) {
                fixNavigationBar(x02);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Components.bb
    public final mm0 v(nm0 nm0Var) {
        return new g10(this);
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence y() {
        if (this.b0) {
            return LocaleController.getString(R.string.FolderLinkTitleRemove);
        }
        if (this.Z instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
            return LocaleController.getString(R.string.FolderLinkTitleAdd);
        }
        ArrayList arrayList = this.g0;
        return (arrayList == null || arrayList.isEmpty()) ? LocaleController.getString(R.string.FolderLinkTitleAlready) : LocaleController.getString(R.string.FolderLinkTitleAddChats);
    }
}
