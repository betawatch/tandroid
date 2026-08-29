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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class y00 extends xa {
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
    public u00 h0;
    public View i0;
    public x00 j0;
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
    public v00 u0;
    public int v0;
    public boolean w0;
    public Utilities.Callback x0;
    public int y0;
    public long z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y00(org.telegram.ui.ActionBar.o2 o2Var, int i10, ArrayList arrayList) {
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
        this.U = i10;
        this.X = true;
        this.c0 = new ArrayList();
        arrayList2.clear();
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        ArrayList<MessagesController.DialogFilter> arrayList3 = o2Var.getMessagesController().dialogFilters;
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
            this.Y = dialogFilter.name;
            this.Z = dialogFilter.entities;
            this.a0 = dialogFilter.title_noanimate;
            for (int i12 = 0; i12 < this.e0.size(); i12++) {
                TLRPC.Peer peer = o2Var.getMessagesController().getPeer(((Long) this.e0.get(i12)).longValue());
                if ((peer instanceof TLRPC.TL_peerChat) || (peer instanceof TLRPC.TL_peerChannel)) {
                    this.c0.add(peer);
                }
            }
            for (int i13 = 0; i13 < dialogFilter.alwaysShow.size(); i13++) {
                Long l10 = dialogFilter.alwaysShow.get(i13);
                long longValue = l10.longValue();
                if (!this.e0.contains(l10)) {
                    TLRPC.Peer peer2 = o2Var.getMessagesController().getPeer(longValue);
                    if (((peer2 instanceof TLRPC.TL_peerChat) || (peer2 instanceof TLRPC.TL_peerChannel)) && ((chat = o2Var.getMessagesController().getChat(Long.valueOf(-longValue))) == null || !ChatObject.isNotInChat(chat))) {
                        this.c0.add(peer2);
                    }
                }
            }
        }
        S();
    }

    public static void T(org.telegram.ui.ActionBar.o2 o2Var, int i10, Utilities.Callback callback) {
        MessagesController.DialogFilter dialogFilter;
        ArrayList<MessagesController.DialogFilter> arrayList = o2Var.getMessagesController().dialogFilters;
        if (arrayList != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (arrayList.get(i11).id == i10) {
                    dialogFilter = arrayList.get(i11);
                    break;
                }
            }
        }
        dialogFilter = null;
        rm rmVar = new rm(i10, o2Var, callback, 3);
        if (dialogFilter == null || !dialogFilter.isMyChatlist()) {
            rmVar.run();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getContext());
        alertDialog$Builder.a.N = LocaleController.getString(R.string.FilterDelete);
        alertDialog$Builder.a.P = LocaleController.getString(R.string.FilterDeleteAlertLinks);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new om(callback));
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new cv(rmVar, 4));
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        o2Var.showDialog(c2Var);
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, false));
        }
    }

    @Override // org.telegram.ui.Components.xa
    public final void F(hv0 hv0Var) {
        jl0 jl0Var = this.d;
        jl0Var.setOverScrollMode(2);
        jl0Var.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(this.h0 != null ? 68.0f : 0.0f));
        jl0Var.setOnItemClickListener(new k(this, 8));
    }

    public final void Q(boolean z10) {
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

    public final void R(v00 v00Var, boolean z10) {
        ArrayList arrayList = this.c0;
        ArrayList arrayList2 = this.e0;
        arrayList2.clear();
        arrayList2.addAll(this.d0);
        int i10 = 0;
        if (!z10) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                long peerDialogId = DialogObject.getPeerDialogId((TLRPC.Peer) arrayList.get(i11));
                if (!arrayList2.contains(Long.valueOf(peerDialogId))) {
                    arrayList2.add(Long.valueOf(peerDialogId));
                }
            }
        }
        U(true);
        v00Var.a(LocaleController.getString(z10 ? R.string.SelectAll : R.string.DeselectAll), new jh.r5(this, v00Var, z10, 16));
        Q(true);
        while (true) {
            jl0 jl0Var = this.d;
            if (i10 >= jl0Var.getChildCount()) {
                return;
            }
            View childAt = jl0Var.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.e4) {
                Object tag = childAt.getTag();
                if (tag instanceof Long) {
                    ((org.telegram.ui.Cells.e4) childAt).c(arrayList2.contains((Long) tag), true);
                }
            }
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S() {
        long j10;
        boolean isNotInChat;
        boolean z10;
        ArrayList arrayList = this.f0;
        this.b0 = AndroidUtilities.replaceCharSequence("*", this.Y, "✱");
        ArrayList arrayList2 = this.c0;
        if (arrayList2 != null) {
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                TLRPC.Peer peer = (TLRPC.Peer) arrayList2.get(i10);
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
            int i11 = this.k0;
            int i12 = i11 + 1;
            this.l0 = i11;
            int i13 = i11 + 2;
            this.k0 = i13;
            this.m0 = i12;
            this.n0 = i13;
            int size = arrayList2.size() + i13;
            this.k0 = size;
            this.o0 = size;
        }
        int i14 = this.k0;
        this.k0 = i14 + 1;
        this.p0 = i14;
        if (arrayList == null || arrayList.isEmpty()) {
            this.q0 = -1;
            this.r0 = -1;
            this.s0 = -1;
            this.t0 = -1;
        } else {
            int i15 = this.k0;
            int i16 = i15 + 1;
            this.k0 = i16;
            this.q0 = i15;
            this.r0 = i16;
            int size2 = arrayList.size() + i16;
            this.s0 = size2;
            this.k0 = size2 + 1;
            this.t0 = size2;
        }
        Context context = getContext();
        u00 u00Var = new u00(context);
        jr jrVar = jr.h;
        u00Var.e = new d6(350L, jrVar);
        u00Var.h = 0.0f;
        u00Var.s = 1.0f;
        u00Var.x = 1.0f;
        u00Var.y = true;
        View view = new View(context);
        u00Var.f = view;
        int i17 = org.telegram.ui.ActionBar.g6.Oh;
        view.setBackground(org.telegram.ui.ActionBar.w5.d(new float[]{8.0f}, 0, org.telegram.ui.ActionBar.w5.b(org.telegram.ui.ActionBar.g6.w0(null, i17, false))));
        u00Var.addView(view, i7.f6.c(-1.0f, -1));
        u00Var.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(8.0f), org.telegram.ui.ActionBar.g6.w0(null, i17, false)));
        Paint paint = new Paint(1);
        u00Var.a = paint;
        int i18 = org.telegram.ui.ActionBar.g6.Sh;
        paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, i18, false));
        n6 n6Var = new n6(true, true, false, false);
        u00Var.b = n6Var;
        n6Var.k(0.3f, 250L, jrVar);
        n6Var.setCallback(u00Var);
        n6Var.t(AndroidUtilities.dp(14.0f));
        n6Var.u(AndroidUtilities.bold());
        n6Var.r(org.telegram.ui.ActionBar.g6.w0(null, i18, false));
        n6Var.q("", true, true);
        n6Var.b = 1;
        n6 n6Var2 = new n6(false, false, true, false);
        u00Var.c = n6Var2;
        n6Var2.k(0.3f, 250L, jrVar);
        n6Var2.setCallback(u00Var);
        n6Var2.t(AndroidUtilities.dp(12.0f));
        n6Var2.u(AndroidUtilities.bold());
        n6Var2.r(org.telegram.ui.ActionBar.g6.w0(null, i17, false));
        n6Var2.q("", true, true);
        n6Var2.b = 1;
        u00Var.setWillNotDraw(false);
        this.h0 = u00Var;
        u00Var.setOnClickListener(new h0(this, 16));
        this.containerView.addView(this.h0, i7.f6.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 10.0f));
        View view2 = new View(getContext());
        this.i0 = view2;
        view2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.a7, false));
        this.containerView.addView(this.i0, i7.f6.d(-1, 1.0f / AndroidUtilities.density, 87, 6.0f, 0.0f, 6.0f, 68.0f));
        this.d.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(this.h0 != null ? 68.0f : 0.0f));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.g0 = frameLayout;
        this.containerView.addView(frameLayout, i7.f6.d(-1, 100.0f, 87, 6.0f, 0.0f, 6.0f, 68.0f));
        fixNavigationBar(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.h5, false));
        U(false);
        this.e.setTitle(y());
    }

    public final void U(boolean z10) {
        int i10;
        TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = this.V;
        int size = this.e0.size();
        u00 u00Var = this.h0;
        if (u00Var != null) {
            int i11 = 1;
            if (this.X) {
                u00Var.b(LocaleController.getString(size > 0 ? R.string.FolderLinkButtonRemoveChats : R.string.FolderLinkButtonRemove), z10);
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
            u00 u00Var2 = this.h0;
            n6 n6Var = u00Var2.c;
            if (z10) {
                n6Var.b();
            }
            if (z10 && size != (i10 = u00Var2.w) && size > 0 && i10 > 0) {
                ValueAnimator valueAnimator = u00Var2.v;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    u00Var2.v = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                u00Var2.v = ofFloat;
                ofFloat.addUpdateListener(new t00(u00Var2, 1));
                u00Var2.v.addListener(new zz(u00Var2, i11));
                u00Var2.v.setInterpolator(new OvershootInterpolator(2.0f));
                u00Var2.v.setDuration(200L);
                u00Var2.v.start();
            }
            u00Var2.w = size;
            u00Var2.d = size != 0 ? 1.0f : 0.0f;
            n6Var.q("" + size, z10, true);
            u00Var2.invalidate();
            if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                this.h0.setEnabled(!r1.isEmpty());
            }
        }
        x00 x00Var = this.j0;
        if (x00Var != null) {
            x00Var.a();
        }
    }

    public final void V() {
        ArrayList arrayList = this.d0;
        ArrayList arrayList2 = this.c0;
        v00 v00Var = this.u0;
        if (v00Var == null) {
            return;
        }
        if (this.X) {
            v00Var.b(LocaleController.formatPluralString("FolderLinkHeaderChatsQuit", arrayList2.size(), new Object[0]), false);
        } else {
            v00Var.b(LocaleController.formatPluralString("FolderLinkHeaderChatsJoin", arrayList2.size(), new Object[0]), false);
        }
        if (arrayList2 == null || arrayList2.size() - arrayList.size() <= 1) {
            this.u0.a("", null);
        } else {
            boolean z10 = this.e0.size() >= arrayList2.size() - arrayList.size();
            this.u0.a(LocaleController.getString(z10 ? R.string.DeselectAll : R.string.SelectAll), new hh.f(27, this, z10));
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

    @Override // org.telegram.ui.Components.xa
    public final il0 v(jl0 jl0Var) {
        return new s00(this);
    }

    @Override // org.telegram.ui.Components.xa
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
