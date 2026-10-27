package org.telegram.ui;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class d00 extends org.telegram.ui.Components.bb {
    public int X;
    public final MessagesController.DialogFilter Y;
    public final ArrayList Z;
    public final FrameLayout a0;
    public b00 b0;
    public final TextView c0;
    public final ArrayList d0;
    public final ArrayList e0;

    public d00(org.telegram.ui.ActionBar.r2 r2Var, MessagesController.DialogFilter dialogFilter, ArrayList arrayList) {
        super(r2Var, false);
        ArrayList arrayList2 = new ArrayList();
        this.Z = arrayList2;
        this.d0 = new ArrayList();
        this.e0 = new ArrayList();
        this.Y = dialogFilter;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        U(false);
        this.e.setTitle(R(null));
        fixNavigationBar(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.h5, false));
        this.X = this.navBarColor;
        TextView textView = new TextView(getContext());
        this.c0 = textView;
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.Sh, null);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setBackground(org.telegram.ui.ActionBar.o6.f(new float[]{8.0f}, org.telegram.ui.ActionBar.y6.Oh));
        textView.setText(LocaleController.getString(R.string.FolderLinkShareButton));
        textView.setGravity(17);
        textView.setOnClickListener(new a(this, 22));
        FrameLayout.LayoutParams h = org.telegram.ui.Components.kb1.h(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 10.0f);
        int i10 = h.leftMargin;
        int i11 = this.backgroundPaddingLeft;
        h.leftMargin = i10 + i11;
        h.rightMargin += i11;
        this.containerView.addView(textView, h);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.a0 = frameLayout;
        this.containerView.addView(frameLayout, org.telegram.ui.Components.kb1.h(-1, 100.0f, 80, 6.0f, 0.0f, 6.0f, 0.0f));
        T();
    }

    public static void S(org.telegram.ui.ActionBar.r2 r2Var, MessagesController.DialogFilter dialogFilter, r00 r00Var) {
        long currentTimeMillis = System.currentTimeMillis();
        TL_chatlists.TL_chatlists_getExportedInvites tL_chatlists_getExportedInvites = new TL_chatlists.TL_chatlists_getExportedInvites();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_getExportedInvites.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = dialogFilter.id;
        r2Var.getConnectionsManager().sendRequest(tL_chatlists_getExportedInvites, new bi.e0(r2Var, dialogFilter, r00Var, currentTimeMillis, 4));
    }

    @Override // org.telegram.ui.Components.bb
    public final void G(org.telegram.ui.Components.ww0 ww0Var) {
        org.telegram.ui.Components.nm0 nm0Var = this.d;
        nm0Var.setOverScrollMode(2);
        nm0Var.setOnItemClickListener(new h(this, 11));
        s4.l lVar = new s4.l();
        lVar.m = false;
        lVar.C = false;
        lVar.o(org.telegram.ui.Components.ds.h);
        lVar.n(350L);
        nm0Var.setItemAnimator(lVar);
    }

    public final void Q() {
        MessagesController.DialogFilter dialogFilter;
        org.telegram.ui.ActionBar.r2 r2Var;
        ArrayList<TLRPC.InputPeer> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            dialogFilter = this.Y;
            int size = dialogFilter.alwaysShow.size();
            r2Var = this.n;
            if (i10 >= size) {
                break;
            }
            long longValue = dialogFilter.alwaysShow.get(i10).longValue();
            if (longValue < 0 && q00.i0(r2Var.getMessagesController().getChat(Long.valueOf(-longValue)))) {
                arrayList.add(r2Var.getMessagesController().getInputPeer(longValue));
            }
            i10++;
        }
        if (arrayList.isEmpty()) {
            dismiss();
            r2Var.presentFragment(new oz(dialogFilter, null));
            return;
        }
        TL_chatlists.TL_chatlists_exportChatlistInvite tL_chatlists_exportChatlistInvite = new TL_chatlists.TL_chatlists_exportChatlistInvite();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_exportChatlistInvite.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = dialogFilter.id;
        tL_chatlists_exportChatlistInvite.peers = arrayList;
        tL_chatlists_exportChatlistInvite.title = "";
        r2Var.getConnectionsManager().sendRequest(tL_chatlists_exportChatlistInvite, new l(this, 7));
    }

    public final CharSequence R(xh.n nVar) {
        Object obj;
        MessagesController.DialogFilter dialogFilter = this.Y;
        if (dialogFilter != null) {
            Paint.FontMetricsInt fontMetricsInt = nVar == null ? null : nVar.getPaint().getFontMetricsInt();
            obj = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(new SpannableStringBuilder(dialogFilter.name), fontMetricsInt, false), dialogFilter.entities, fontMetricsInt);
        } else {
            obj = "";
        }
        return LocaleController.formatSpannable(R.string.FolderLinkShareTitle2, obj);
    }

    public final void T() {
        ArrayList arrayList = this.Z;
        this.c0.setVisibility(arrayList.isEmpty() ? 0 : 8);
        this.d.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), arrayList.isEmpty() ? AndroidUtilities.dp(68.0f) : 0);
    }

    public final void U(boolean z10) {
        ArrayList arrayList = this.d0;
        arrayList.clear();
        ArrayList arrayList2 = this.e0;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        h00 h00Var = new h00(0, false);
        h00Var.d = null;
        arrayList2.add(h00Var);
        ArrayList arrayList3 = this.Z;
        if (!arrayList3.isEmpty()) {
            arrayList2.add(h00.d(null));
            arrayList2.add(new h00(8, false));
            for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = (TL_chatlists.TL_exportedChatlistInvite) arrayList3.get(i10);
                h00 h00Var2 = new h00(7, false);
                h00Var2.m = tL_exportedChatlistInvite;
                arrayList2.add(h00Var2);
            }
        }
        b00 b00Var = this.b0;
        if (b00Var != null) {
            if (z10) {
                b00Var.E(arrayList, arrayList2);
            } else {
                this.d.getAdapter().l();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void onThemeColorsChanged() {
        int x02;
        super.onThemeColorsChanged();
        try {
            if (this.navBarColor != this.X || (x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.h5, false)) == this.navBarColor) {
                return;
            }
            fixNavigationBar(x02);
            this.X = this.navBarColor;
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Components.bb
    public final org.telegram.ui.Components.mm0 v(org.telegram.ui.Components.nm0 nm0Var) {
        b00 b00Var = new b00(this);
        this.b0 = b00Var;
        return b00Var;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence y() {
        return R(null);
    }
}
