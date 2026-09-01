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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class d10 extends sa {
    public long A0;
    public long B0;
    public String U;
    public int V;
    public TL_chatlists.chatlist_ChatlistInvite W;
    public TL_chatlists.TL_chatlists_chatlistUpdates X;
    public final boolean Y;
    public String Z;
    public ArrayList a0;
    public boolean b0;
    public CharSequence c0;
    public ArrayList d0;
    public ArrayList e0;
    public ArrayList f0;
    public ArrayList g0;
    public FrameLayout h0;
    public z00 i0;
    public View j0;
    public c10 k0;
    public int l0;
    public int m0;
    public int n0;
    public int o0;
    public int p0;
    public int q0;
    public int r0;
    public int s0;
    public int t0;
    public int u0;
    public a10 v0;
    public int w0;
    public boolean x0;
    public Utilities.Callback y0;
    public int z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d10(org.telegram.ui.ActionBar.p2 p2Var, int i10, ArrayList arrayList) {
        super(p2Var, false);
        MessagesController.DialogFilter dialogFilter;
        TLRPC.Chat chat;
        this.V = -1;
        this.Z = "";
        this.a0 = new ArrayList();
        this.c0 = "";
        this.e0 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.f0 = arrayList2;
        this.w0 = -1;
        this.z0 = -5;
        this.V = i10;
        this.Y = true;
        this.d0 = new ArrayList();
        arrayList2.clear();
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        ArrayList<MessagesController.DialogFilter> arrayList3 = p2Var.getMessagesController().dialogFilters;
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
            this.Z = dialogFilter.name;
            this.a0 = dialogFilter.entities;
            this.b0 = dialogFilter.title_noanimate;
            for (int i12 = 0; i12 < this.f0.size(); i12++) {
                TLRPC.Peer peer = p2Var.getMessagesController().getPeer(((Long) this.f0.get(i12)).longValue());
                if ((peer instanceof TLRPC.TL_peerChat) || (peer instanceof TLRPC.TL_peerChannel)) {
                    this.d0.add(peer);
                }
            }
            for (int i13 = 0; i13 < dialogFilter.alwaysShow.size(); i13++) {
                Long l10 = dialogFilter.alwaysShow.get(i13);
                long longValue = l10.longValue();
                if (!this.f0.contains(l10)) {
                    TLRPC.Peer peer2 = p2Var.getMessagesController().getPeer(longValue);
                    if (((peer2 instanceof TLRPC.TL_peerChat) || (peer2 instanceof TLRPC.TL_peerChannel)) && ((chat = p2Var.getMessagesController().getChat(Long.valueOf(-longValue))) == null || !ChatObject.isNotInChat(chat))) {
                        this.d0.add(peer2);
                    }
                }
            }
        }
        S();
    }

    public static void T(org.telegram.ui.ActionBar.p2 p2Var, int i10, Utilities.Callback callback) {
        MessagesController.DialogFilter dialogFilter;
        ArrayList<MessagesController.DialogFilter> arrayList = p2Var.getMessagesController().dialogFilters;
        if (arrayList != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (arrayList.get(i11).id == i10) {
                    dialogFilter = arrayList.get(i11);
                    break;
                }
            }
        }
        dialogFilter = null;
        gy gyVar = new gy(i10, p2Var, callback, 1);
        if (dialogFilter == null || !dialogFilter.isMyChatlist()) {
            gyVar.run();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p2Var.getContext());
        alertDialog$Builder.a.O = LocaleController.getString(R.string.FilterDelete);
        alertDialog$Builder.a.Q = LocaleController.getString(R.string.FilterDeleteAlertLinks);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new tm(callback));
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new hv(gyVar, 4));
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        p2Var.showDialog(d2Var);
        TextView textView = (TextView) d2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.q7, false));
        }
    }

    @Override // org.telegram.ui.Components.sa
    public final void F(qv0 qv0Var) {
        tl0 tl0Var = this.d;
        tl0Var.setOverScrollMode(2);
        tl0Var.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(this.i0 != null ? 68.0f : 0.0f));
        tl0Var.setOnItemClickListener(new k(this, 8));
    }

    public final void Q(boolean z4) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(LocaleController.formatPluralString("FilterInviteHeaderChats", this.f0.size(), new Object[0]));
        if (!z4 || this.v0 == null) {
            str = "";
        } else {
            str = ", " + ((Object) this.v0.b.getText());
        }
        sb.append(str);
        AndroidUtilities.makeAccessibilityAnnouncement(sb.toString());
    }

    public final void R(a10 a10Var, boolean z4) {
        ArrayList arrayList = this.d0;
        ArrayList arrayList2 = this.f0;
        arrayList2.clear();
        arrayList2.addAll(this.e0);
        int i10 = 0;
        if (!z4) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                long peerDialogId = DialogObject.getPeerDialogId((TLRPC.Peer) arrayList.get(i11));
                if (!arrayList2.contains(Long.valueOf(peerDialogId))) {
                    arrayList2.add(Long.valueOf(peerDialogId));
                }
            }
        }
        U(true);
        a10Var.a(LocaleController.getString(z4 ? R.string.SelectAll : R.string.DeselectAll), new mh.r5(this, a10Var, z4, 14));
        Q(true);
        while (true) {
            tl0 tl0Var = this.d;
            if (i10 >= tl0Var.getChildCount()) {
                return;
            }
            View childAt = tl0Var.getChildAt(i10);
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
    public final void S() {
        long j10;
        boolean isNotInChat;
        boolean z4;
        ArrayList arrayList = this.g0;
        this.c0 = AndroidUtilities.replaceCharSequence("*", this.Z, "✱");
        ArrayList arrayList2 = this.d0;
        if (arrayList2 != null) {
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                TLRPC.Peer peer = (TLRPC.Peer) arrayList2.get(i10);
                if (peer != null) {
                    if (peer instanceof TLRPC.TL_peerUser) {
                        j10 = peer.user_id;
                    } else {
                        boolean z10 = peer instanceof TLRPC.TL_peerChat;
                        org.telegram.ui.ActionBar.p2 p2Var = this.n;
                        if (z10) {
                            j10 = -peer.chat_id;
                            isNotInChat = ChatObject.isNotInChat(p2Var.getMessagesController().getChat(Long.valueOf(-j10)));
                        } else if (peer instanceof TLRPC.TL_peerChannel) {
                            j10 = -peer.channel_id;
                            isNotInChat = ChatObject.isNotInChat(p2Var.getMessagesController().getChat(Long.valueOf(-j10)));
                        } else {
                            j10 = 0;
                        }
                        z4 = !isNotInChat;
                        if (j10 != 0 && !this.Y) {
                            if (z4) {
                                this.e0.add(Long.valueOf(j10));
                            }
                            this.f0.add(Long.valueOf(j10));
                        }
                    }
                    z4 = false;
                    if (j10 != 0) {
                        if (z4) {
                        }
                        this.f0.add(Long.valueOf(j10));
                    }
                }
            }
        }
        this.l0 = 1;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            this.m0 = -1;
            this.n0 = -1;
            this.o0 = -1;
            this.p0 = -1;
        } else {
            int i11 = this.l0;
            int i12 = i11 + 1;
            this.m0 = i11;
            int i13 = i11 + 2;
            this.l0 = i13;
            this.n0 = i12;
            this.o0 = i13;
            int size = arrayList2.size() + i13;
            this.l0 = size;
            this.p0 = size;
        }
        int i14 = this.l0;
        this.l0 = i14 + 1;
        this.q0 = i14;
        if (arrayList == null || arrayList.isEmpty()) {
            this.r0 = -1;
            this.s0 = -1;
            this.t0 = -1;
            this.u0 = -1;
        } else {
            int i15 = this.l0;
            int i16 = i15 + 1;
            this.l0 = i16;
            this.r0 = i15;
            this.s0 = i16;
            int size2 = arrayList.size() + i16;
            this.t0 = size2;
            this.l0 = size2 + 1;
            this.u0 = size2;
        }
        Context context = getContext();
        z00 z00Var = new z00(context);
        pr prVar = pr.h;
        z00Var.e = new z5(350L, prVar);
        z00Var.h = 0.0f;
        z00Var.s = 1.0f;
        z00Var.x = 1.0f;
        z00Var.y = true;
        View view = new View(context);
        z00Var.f = view;
        int i17 = org.telegram.ui.ActionBar.k6.Oh;
        view.setBackground(org.telegram.ui.ActionBar.a6.d(new float[]{8.0f}, 0, org.telegram.ui.ActionBar.a6.b(org.telegram.ui.ActionBar.k6.w0(null, i17, false))));
        z00Var.addView(view, k7.c6.c(-1.0f, -1));
        z00Var.setBackground(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(8.0f), org.telegram.ui.ActionBar.k6.w0(null, i17, false)));
        Paint paint = new Paint(1);
        z00Var.a = paint;
        int i18 = org.telegram.ui.ActionBar.k6.Sh;
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(null, i18, false));
        j6 j6Var = new j6(true, true, false, false);
        z00Var.b = j6Var;
        j6Var.k(0.3f, 250L, prVar);
        j6Var.setCallback(z00Var);
        j6Var.t(AndroidUtilities.dp(14.0f));
        j6Var.u(AndroidUtilities.bold());
        j6Var.r(org.telegram.ui.ActionBar.k6.w0(null, i18, false));
        j6Var.q("", true, true);
        j6Var.b = 1;
        j6 j6Var2 = new j6(false, false, true, false);
        z00Var.c = j6Var2;
        j6Var2.k(0.3f, 250L, prVar);
        j6Var2.setCallback(z00Var);
        j6Var2.t(AndroidUtilities.dp(12.0f));
        j6Var2.u(AndroidUtilities.bold());
        j6Var2.r(org.telegram.ui.ActionBar.k6.w0(null, i17, false));
        j6Var2.q("", true, true);
        j6Var2.b = 1;
        z00Var.setWillNotDraw(false);
        this.i0 = z00Var;
        z00Var.setOnClickListener(new g0(this, 16));
        this.containerView.addView(this.i0, k7.c6.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 10.0f));
        View view2 = new View(getContext());
        this.j0 = view2;
        view2.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.a7, false));
        this.containerView.addView(this.j0, k7.c6.d(-1, 1.0f / AndroidUtilities.density, 87, 6.0f, 0.0f, 6.0f, 68.0f));
        this.d.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(this.i0 != null ? 68.0f : 0.0f));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.h0 = frameLayout;
        this.containerView.addView(frameLayout, k7.c6.d(-1, 100.0f, 87, 6.0f, 0.0f, 6.0f, 68.0f));
        fixNavigationBar(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.h5, false));
        U(false);
        this.e.setTitle(y());
    }

    public final void U(boolean z4) {
        int i10;
        TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = this.W;
        int size = this.f0.size();
        z00 z00Var = this.i0;
        if (z00Var != null) {
            if (this.Y) {
                z00Var.b(LocaleController.getString(size > 0 ? R.string.FolderLinkButtonRemoveChats : R.string.FolderLinkButtonRemove), z4);
            } else {
                ArrayList arrayList = this.d0;
                if (arrayList == null || arrayList.isEmpty()) {
                    this.i0.b(LocaleController.getString(R.string.OK), z4);
                } else {
                    if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                        this.i0.b(LocaleController.formatSpannable(R.string.FolderLinkButtonAdd, MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(this.Z, this.i0.b.a.getFontMetricsInt(), false), this.a0, this.i0.b.a.getFontMetricsInt())), z4);
                        this.i0.b.l = this.b0 ? 26 : 0;
                    } else {
                        this.i0.b(size > 0 ? LocaleController.formatPluralString("FolderLinkButtonJoinPlural", size, new Object[0]) : LocaleController.getString(R.string.FolderLinkButtonNone), z4);
                    }
                }
            }
            z00 z00Var2 = this.i0;
            j6 j6Var = z00Var2.c;
            if (z4) {
                j6Var.b();
            }
            if (z4 && size != (i10 = z00Var2.w) && size > 0 && i10 > 0) {
                ValueAnimator valueAnimator = z00Var2.v;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    z00Var2.v = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                z00Var2.v = ofFloat;
                ofFloat.addUpdateListener(new y00(z00Var2, 1));
                z00Var2.v.addListener(new a9(z00Var2, 22));
                z00Var2.v.setInterpolator(new OvershootInterpolator(2.0f));
                z00Var2.v.setDuration(200L);
                z00Var2.v.start();
            }
            z00Var2.w = size;
            z00Var2.d = size != 0 ? 1.0f : 0.0f;
            j6Var.q("" + size, z4, true);
            z00Var2.invalidate();
            if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                this.i0.setEnabled(!r1.isEmpty());
            }
        }
        c10 c10Var = this.k0;
        if (c10Var != null) {
            c10Var.a();
        }
    }

    public final void V() {
        ArrayList arrayList = this.e0;
        ArrayList arrayList2 = this.d0;
        a10 a10Var = this.v0;
        if (a10Var == null) {
            return;
        }
        if (this.Y) {
            a10Var.b(LocaleController.formatPluralString("FolderLinkHeaderChatsQuit", arrayList2.size(), new Object[0]), false);
        } else {
            a10Var.b(LocaleController.formatPluralString("FolderLinkHeaderChatsJoin", arrayList2.size(), new Object[0]), false);
        }
        if (arrayList2 == null || arrayList2.size() - arrayList.size() <= 1) {
            this.v0.a("", null);
        } else {
            boolean z4 = this.f0.size() >= arrayList2.size() - arrayList.size();
            this.v0.a(LocaleController.getString(z4 ? R.string.DeselectAll : R.string.SelectAll), new kh.f(21, this, z4));
        }
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        super.dismiss();
        if (this.w0 >= 0) {
            this.n.getConnectionsManager().cancelRequest(this.w0, true);
        }
        Utilities.Callback callback = this.y0;
        if (callback != null) {
            callback.run(Boolean.valueOf(this.x0));
            this.y0 = null;
        }
    }

    @Override // org.telegram.ui.Components.sa
    public final sl0 v(tl0 tl0Var) {
        return new x00(this);
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        if (this.Y) {
            return LocaleController.getString(R.string.FolderLinkTitleRemove);
        }
        if (this.W instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
            return LocaleController.getString(R.string.FolderLinkTitleAdd);
        }
        ArrayList arrayList = this.d0;
        return (arrayList == null || arrayList.isEmpty()) ? LocaleController.getString(R.string.FolderLinkTitleAlready) : LocaleController.getString(R.string.FolderLinkTitleAddChats);
    }
}
