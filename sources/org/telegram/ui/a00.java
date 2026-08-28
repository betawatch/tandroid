package org.telegram.ui;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class a00 extends org.telegram.ui.Components.sa {
    public final MessagesController.DialogFilter T;
    public final ArrayList U;
    public final FrameLayout V;
    public yz W;
    public final TextView X;
    public final ArrayList Y;
    public final ArrayList Z;

    public a00(org.telegram.ui.ActionBar.o2 o2Var, MessagesController.DialogFilter dialogFilter, ArrayList arrayList) {
        super(o2Var, false);
        ArrayList arrayList2 = new ArrayList();
        this.U = arrayList2;
        this.Y = new ArrayList();
        this.Z = new ArrayList();
        this.T = dialogFilter;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        T(false);
        this.e.setTitle(Q(null));
        fixNavigationBar(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.h5, false));
        TextView textView = new TextView(getContext());
        this.X = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sh, false));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setBackground(org.telegram.ui.ActionBar.v5.f(new float[]{8.0f}, org.telegram.ui.ActionBar.f6.Oh));
        textView.setText(LocaleController.getString(R.string.FolderLinkShareButton));
        textView.setGravity(17);
        textView.setOnClickListener(new a(this, 22));
        FrameLayout.LayoutParams d = g7.e6.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 10.0f);
        int i9 = d.leftMargin;
        int i10 = this.backgroundPaddingLeft;
        d.leftMargin = i9 + i10;
        d.rightMargin += i10;
        this.containerView.addView(textView, d);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.V = frameLayout;
        this.containerView.addView(frameLayout, g7.e6.d(-1, 100.0f, 80, 6.0f, 0.0f, 6.0f, 0.0f));
        S();
    }

    public static void R(org.telegram.ui.ActionBar.o2 o2Var, MessagesController.DialogFilter dialogFilter, o00 o00Var) {
        long currentTimeMillis = System.currentTimeMillis();
        TL_chatlists.TL_chatlists_getExportedInvites tL_chatlists_getExportedInvites = new TL_chatlists.TL_chatlists_getExportedInvites();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_getExportedInvites.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = dialogFilter.id;
        o2Var.getConnectionsManager().sendRequest(tL_chatlists_getExportedInvites, new gh.w(o2Var, dialogFilter, o00Var, currentTimeMillis, 8));
    }

    @Override // org.telegram.ui.Components.sa
    public final void F(org.telegram.ui.Components.xu0 xu0Var) {
        org.telegram.ui.Components.wk0 wk0Var = this.d;
        wk0Var.setOverScrollMode(2);
        wk0Var.setOnItemClickListener(new i(this, 10));
        f2.n nVar = new f2.n();
        nVar.m = false;
        nVar.C = false;
        nVar.o(org.telegram.ui.Components.gr.h);
        nVar.n(350L);
        wk0Var.setItemAnimator(nVar);
    }

    public final void P() {
        MessagesController.DialogFilter dialogFilter;
        org.telegram.ui.ActionBar.o2 o2Var;
        ArrayList<TLRPC.InputPeer> arrayList = new ArrayList<>();
        int i9 = 0;
        while (true) {
            dialogFilter = this.T;
            int size = dialogFilter.alwaysShow.size();
            o2Var = this.n;
            if (i9 >= size) {
                break;
            }
            long longValue = dialogFilter.alwaysShow.get(i9).longValue();
            if (longValue < 0 && n00.f0(o2Var.getMessagesController().getChat(Long.valueOf(-longValue)))) {
                arrayList.add(o2Var.getMessagesController().getInputPeer(longValue));
            }
            i9++;
        }
        if (arrayList.isEmpty()) {
            dismiss();
            o2Var.presentFragment(new lz(dialogFilter, null));
            return;
        }
        TL_chatlists.TL_chatlists_exportChatlistInvite tL_chatlists_exportChatlistInvite = new TL_chatlists.TL_chatlists_exportChatlistInvite();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_exportChatlistInvite.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = dialogFilter.id;
        tL_chatlists_exportChatlistInvite.peers = arrayList;
        tL_chatlists_exportChatlistInvite.title = "";
        o2Var.getConnectionsManager().sendRequest(tL_chatlists_exportChatlistInvite, new m(this, 7));
    }

    public final CharSequence Q(dh.u uVar) {
        Object obj;
        MessagesController.DialogFilter dialogFilter = this.T;
        if (dialogFilter != null) {
            Paint.FontMetricsInt fontMetricsInt = uVar == null ? null : uVar.getPaint().getFontMetricsInt();
            obj = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(new SpannableStringBuilder(dialogFilter.name), fontMetricsInt, false), dialogFilter.entities, fontMetricsInt);
        } else {
            obj = "";
        }
        return LocaleController.formatSpannable(R.string.FolderLinkShareTitle2, obj);
    }

    public final void S() {
        ArrayList arrayList = this.U;
        this.X.setVisibility(arrayList.isEmpty() ? 0 : 8);
        this.d.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), arrayList.isEmpty() ? AndroidUtilities.dp(68.0f) : 0);
    }

    public final void T(boolean z10) {
        ArrayList arrayList = this.Y;
        arrayList.clear();
        ArrayList arrayList2 = this.Z;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        e00 e00Var = new e00(0, false);
        e00Var.d = null;
        arrayList2.add(e00Var);
        ArrayList arrayList3 = this.U;
        if (!arrayList3.isEmpty()) {
            arrayList2.add(e00.d(null));
            arrayList2.add(new e00(8, false));
            for (int i9 = 0; i9 < arrayList3.size(); i9++) {
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = (TL_chatlists.TL_exportedChatlistInvite) arrayList3.get(i9);
                e00 e00Var2 = new e00(7, false);
                e00Var2.m = tL_exportedChatlistInvite;
                arrayList2.add(e00Var2);
            }
        }
        yz yzVar = this.W;
        if (yzVar != null) {
            if (z10) {
                yzVar.E(arrayList, arrayList2);
            } else {
                this.d.getAdapter().l();
            }
        }
    }

    @Override // org.telegram.ui.Components.sa
    public final org.telegram.ui.Components.vk0 v(org.telegram.ui.Components.wk0 wk0Var) {
        yz yzVar = new yz(this);
        this.W = yzVar;
        return yzVar;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        return Q(null);
    }
}
