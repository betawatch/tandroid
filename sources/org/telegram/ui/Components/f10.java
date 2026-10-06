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

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class f10 extends cb {
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
    public b10 l0;
    public View m0;
    public e10 n0;
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
    public c10 y0;
    public int z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f10(org.telegram.ui.ActionBar.n2 n2Var, int i10, ArrayList arrayList) {
        super(n2Var, false);
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
        ArrayList<MessagesController.DialogFilter> arrayList3 = n2Var.getMessagesController().dialogFilters;
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
                TLRPC.Peer peer = n2Var.getMessagesController().getPeer(((Long) this.i0.get(i12)).longValue());
                if ((peer instanceof TLRPC.TL_peerChat) || (peer instanceof TLRPC.TL_peerChannel)) {
                    this.g0.add(peer);
                }
            }
            for (int i13 = 0; i13 < dialogFilter.alwaysShow.size(); i13++) {
                Long l4 = dialogFilter.alwaysShow.get(i13);
                long longValue = l4.longValue();
                if (!this.i0.contains(l4)) {
                    TLRPC.Peer peer2 = n2Var.getMessagesController().getPeer(longValue);
                    if (((peer2 instanceof TLRPC.TL_peerChat) || (peer2 instanceof TLRPC.TL_peerChannel)) && ((chat = n2Var.getMessagesController().getChat(Long.valueOf(-longValue))) == null || !ChatObject.isNotInChat(chat))) {
                        this.g0.add(peer2);
                    }
                }
            }
        }
        Q();
    }

    public static void R(org.telegram.ui.ActionBar.n2 n2Var, int i10, Utilities.Callback callback) {
        MessagesController.DialogFilter dialogFilter;
        ArrayList<MessagesController.DialogFilter> arrayList = n2Var.getMessagesController().dialogFilters;
        if (arrayList != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (arrayList.get(i11).id == i10) {
                    dialogFilter = arrayList.get(i11);
                    break;
                }
            }
        }
        dialogFilter = null;
        zm zmVar = new zm(i10, n2Var, callback, 3);
        if (dialogFilter == null || !dialogFilter.isMyChatlist()) {
            zmVar.run();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getContext());
        alertDialog$Builder.a.R = LocaleController.getString(R.string.FilterDelete);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.FilterDeleteAlertLinks);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new wm(callback));
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new pv(zmVar, 4));
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        n2Var.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.q7, false));
        }
    }

    @Override // org.telegram.ui.Components.cb
    public final void E(mw0 mw0Var) {
        zl0 zl0Var = this.d;
        zl0Var.setOverScrollMode(2);
        zl0Var.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(this.l0 != null ? 68.0f : 0.0f));
        zl0Var.setOnItemClickListener(new j(this, 8));
    }

    public final void O(boolean z10) {
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

    public final void P(c10 c10Var, boolean z10) {
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
        S(true);
        c10Var.a(LocaleController.getString(z10 ? R.string.SelectAll : R.string.DeselectAll), new ci.y0(this, c10Var, z10, 19));
        O(true);
        while (true) {
            zl0 zl0Var = this.d;
            if (i10 >= zl0Var.getChildCount()) {
                return;
            }
            View childAt = zl0Var.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.g4) {
                Object tag = childAt.getTag();
                if (tag instanceof Long) {
                    ((org.telegram.ui.Cells.g4) childAt).c(arrayList2.contains((Long) tag), true);
                }
            }
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q() {
        long j3;
        boolean isNotInChat;
        boolean z10;
        ArrayList arrayList = this.j0;
        this.f0 = AndroidUtilities.replaceCharSequence("*", this.c0, "✱");
        ArrayList arrayList2 = this.g0;
        if (arrayList2 != null) {
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                TLRPC.Peer peer = (TLRPC.Peer) arrayList2.get(i10);
                if (peer != null) {
                    if (peer instanceof TLRPC.TL_peerUser) {
                        j3 = peer.user_id;
                    } else {
                        boolean z11 = peer instanceof TLRPC.TL_peerChat;
                        org.telegram.ui.ActionBar.n2 n2Var = this.n;
                        if (z11) {
                            j3 = -peer.chat_id;
                            isNotInChat = ChatObject.isNotInChat(n2Var.getMessagesController().getChat(Long.valueOf(-j3)));
                        } else if (peer instanceof TLRPC.TL_peerChannel) {
                            j3 = -peer.channel_id;
                            isNotInChat = ChatObject.isNotInChat(n2Var.getMessagesController().getChat(Long.valueOf(-j3)));
                        } else {
                            j3 = 0;
                        }
                        z10 = !isNotInChat;
                        if (j3 != 0 && !this.b0) {
                            if (z10) {
                                this.h0.add(Long.valueOf(j3));
                            }
                            this.i0.add(Long.valueOf(j3));
                        }
                    }
                    z10 = false;
                    if (j3 != 0) {
                        if (z10) {
                        }
                        this.i0.add(Long.valueOf(j3));
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
        b10 b10Var = new b10(context);
        tr trVar = tr.h;
        b10Var.e = new e6(350L, trVar);
        b10Var.h = 0.0f;
        b10Var.s = 1.0f;
        b10Var.x = 1.0f;
        b10Var.y = true;
        View view = new View(context);
        b10Var.f = view;
        int i17 = org.telegram.ui.ActionBar.i6.Oh;
        view.setBackground(org.telegram.ui.ActionBar.x5.d(new float[]{8.0f}, 0, org.telegram.ui.ActionBar.x5.b(org.telegram.ui.ActionBar.i6.w0(null, i17, false))));
        b10Var.addView(view, w7.z5.c(-1.0f, -1));
        b10Var.setBackground(org.telegram.ui.ActionBar.i6.b0(AndroidUtilities.dp(8.0f), org.telegram.ui.ActionBar.i6.w0(null, i17, false)));
        Paint paint = new Paint(1);
        b10Var.a = paint;
        int i18 = org.telegram.ui.ActionBar.i6.Sh;
        paint.setColor(org.telegram.ui.ActionBar.i6.w0(null, i18, false));
        o6 o6Var = new o6(true, true, false, false);
        b10Var.b = o6Var;
        o6Var.k(0.3f, 250L, trVar);
        o6Var.setCallback(b10Var);
        o6Var.t(AndroidUtilities.dp(14.0f));
        o6Var.u(AndroidUtilities.bold());
        o6Var.r(org.telegram.ui.ActionBar.i6.w0(null, i18, false));
        o6Var.q("", true, true);
        o6Var.b = 1;
        o6 o6Var2 = new o6(false, false, true, false);
        b10Var.c = o6Var2;
        o6Var2.k(0.3f, 250L, trVar);
        o6Var2.setCallback(b10Var);
        o6Var2.t(AndroidUtilities.dp(12.0f));
        o6Var2.u(AndroidUtilities.bold());
        o6Var2.r(org.telegram.ui.ActionBar.i6.w0(null, i17, false));
        o6Var2.q("", true, true);
        o6Var2.b = 1;
        b10Var.setWillNotDraw(false);
        this.l0 = b10Var;
        b10Var.setOnClickListener(new f0(this, 16));
        this.containerView.addView(this.l0, w7.z5.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 10.0f));
        View view2 = new View(getContext());
        this.m0 = view2;
        view2.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.a7, false));
        this.containerView.addView(this.m0, w7.z5.d(-1, 1.0f / AndroidUtilities.density, 87, 6.0f, 0.0f, 6.0f, 68.0f));
        this.d.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(this.l0 != null ? 68.0f : 0.0f));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.k0 = frameLayout;
        this.containerView.addView(frameLayout, w7.z5.d(-1, 100.0f, 87, 6.0f, 0.0f, 6.0f, 68.0f));
        fixNavigationBar(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.h5, false));
        S(false);
        this.e.setTitle(y());
    }

    public final void S(boolean z10) {
        int i10;
        TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = this.Z;
        int size = this.i0.size();
        b10 b10Var = this.l0;
        if (b10Var != null) {
            if (this.b0) {
                b10Var.b(LocaleController.getString(size > 0 ? R.string.FolderLinkButtonRemoveChats : R.string.FolderLinkButtonRemove), z10);
            } else {
                ArrayList arrayList = this.g0;
                if (arrayList == null || arrayList.isEmpty()) {
                    this.l0.b(LocaleController.getString(R.string.OK), z10);
                } else {
                    if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                        this.l0.b(LocaleController.formatSpannable(R.string.FolderLinkButtonAdd, MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(this.c0, this.l0.b.a.getFontMetricsInt(), false), this.d0, this.l0.b.a.getFontMetricsInt())), z10);
                        this.l0.b.l = this.e0 ? 26 : 0;
                    } else {
                        this.l0.b(size > 0 ? LocaleController.formatPluralString("FolderLinkButtonJoinPlural", size, new Object[0]) : LocaleController.getString(R.string.FolderLinkButtonNone), z10);
                    }
                }
            }
            b10 b10Var2 = this.l0;
            o6 o6Var = b10Var2.c;
            if (z10) {
                o6Var.b();
            }
            if (z10 && size != (i10 = b10Var2.w) && size > 0 && i10 > 0) {
                ValueAnimator valueAnimator = b10Var2.v;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    b10Var2.v = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                b10Var2.v = ofFloat;
                ofFloat.addUpdateListener(new a10(b10Var2, 1));
                b10Var2.v.addListener(new r8(b10Var2, 23));
                b10Var2.v.setInterpolator(new OvershootInterpolator(2.0f));
                b10Var2.v.setDuration(200L);
                b10Var2.v.start();
            }
            b10Var2.w = size;
            b10Var2.d = size != 0 ? 1.0f : 0.0f;
            o6Var.q("" + size, z10, true);
            b10Var2.invalidate();
            if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                this.l0.setEnabled(!r1.isEmpty());
            }
        }
        e10 e10Var = this.n0;
        if (e10Var != null) {
            e10Var.a();
        }
    }

    public final void T() {
        ArrayList arrayList = this.h0;
        ArrayList arrayList2 = this.g0;
        c10 c10Var = this.y0;
        if (c10Var == null) {
            return;
        }
        if (this.b0) {
            c10Var.b(LocaleController.formatPluralString("FolderLinkHeaderChatsQuit", arrayList2.size(), new Object[0]), false);
        } else {
            c10Var.b(LocaleController.formatPluralString("FolderLinkHeaderChatsJoin", arrayList2.size(), new Object[0]), false);
        }
        if (arrayList2 == null || arrayList2.size() - arrayList.size() <= 1) {
            this.y0.a("", null);
        } else {
            boolean z10 = this.i0.size() >= arrayList2.size() - arrayList.size();
            this.y0.a(LocaleController.getString(z10 ? R.string.DeselectAll : R.string.SelectAll), new bi.f(24, this, z10));
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
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

    @Override // org.telegram.ui.Components.cb
    public final yl0 v(zl0 zl0Var) {
        return new z00(this);
    }

    @Override // org.telegram.ui.Components.cb
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
