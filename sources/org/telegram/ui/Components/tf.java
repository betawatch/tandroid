package org.telegram.ui.Components;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.StickersActivity;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class tf implements xx {
    public final /* synthetic */ ChatActivityEnterView a;

    public tf(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.xx
    public final boolean A() {
        return this.a.u3;
    }

    public final void B(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11, MediaController.PhotoEntry photoEntry, boolean z11) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        ig igVar = chatActivityEnterView.B0;
        org.telegram.ui.rn rnVar = chatActivityEnterView.K2;
        org.telegram.ui.hn hnVar = chatActivityEnterView.Q2;
        if (hnVar != null && rnVar != null && hnVar.f) {
            rnVar.Rb();
            return;
        }
        if (c() && i10 == 0) {
            y4.M(chatActivityEnterView.J2, rnVar.a(), new org.telegram.ui.jq(this, view, obj, str, obj2, photoEntry, z11), chatActivityEnterView.R3);
            return;
        }
        if (chatActivityEnterView.C0 <= 0 || c()) {
            y4.a0(chatActivityEnterView.M, 1, chatActivityEnterView.L2, new rd(this, obj, photoEntry, z10, i10, i11, z11, str, obj2));
            return;
        }
        ag agVar = chatActivityEnterView.U2;
        if (agVar != null) {
            agVar.l1(view != null ? view : igVar, igVar.a.getText(), true);
        }
    }

    @Override // org.telegram.ui.Components.xx
    public final long a() {
        return this.a.L2;
    }

    @Override // org.telegram.ui.Components.xx
    public final boolean b() {
        org.telegram.ui.rn rnVar = this.a.K2;
        return rnVar != null && rnVar.D6();
    }

    @Override // org.telegram.ui.Components.xx
    public final boolean c() {
        org.telegram.ui.rn rnVar = this.a.K2;
        return rnVar != null && rnVar.c();
    }

    @Override // org.telegram.ui.Components.xx
    public final void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        sf sfVar = chatActivityEnterView.V2;
        if (sfVar != null && !sfVar.isDismissed()) {
            chatActivityEnterView.V2.e.b(stickerSet, inputStickerSet);
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = chatActivityEnterView.K2;
        if (n2Var == null) {
            n2Var = LaunchActivity.R();
        }
        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
        if (n2Var2 == null || chatActivityEnterView.J2 == null) {
            return;
        }
        if (stickerSet != null) {
            inputStickerSet = new TLRPC.TL_inputStickerSetID();
            inputStickerSet.access_hash = stickerSet.access_hash;
            inputStickerSet.id = stickerSet.id;
        }
        ex0 ex0Var = new ex0(chatActivityEnterView.J2, n2Var2, inputStickerSet, null, chatActivityEnterView, chatActivityEnterView.R3);
        n2Var2.showDialog(ex0Var);
        if (z10) {
            ex0Var.p0();
        }
    }

    @Override // org.telegram.ui.Components.xx
    public final void e(Object obj, Object obj2) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        org.telegram.ui.rn rnVar = chatActivityEnterView.K2;
        if (rnVar == null) {
            return;
        }
        PhotoViewer.t1().K2(null, rnVar, rnVar.aa);
        File pathToAttach = obj instanceof TLRPC.Document ? FileLoader.getInstance(chatActivityEnterView.M).getPathToAttach((TLRPC.Document) obj) : null;
        if (pathToAttach == null) {
            return;
        }
        File file = new File(FileLoader.getDirectory(4), pathToAttach.getName());
        if (!pathToAttach.exists()) {
            if (!file.exists()) {
                return;
            } else {
                pathToAttach = file;
            }
        }
        ArrayList arrayList = new ArrayList();
        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, pathToAttach.getAbsolutePath(), 0, false, 0, 0, 0L);
        photoEntry.caption = null;
        photoEntry.isVideo = true;
        arrayList.add(photoEntry);
        PhotoViewer.t1().f2(arrayList, 0, 12, false, new rf(this, obj, obj2, photoEntry), chatActivityEnterView.K2);
    }

    @Override // org.telegram.ui.Components.xx
    public final int f() {
        int threadMessageId;
        threadMessageId = this.a.getThreadMessageId();
        return threadMessageId;
    }

    @Override // org.telegram.ui.Components.xx
    public final boolean g() {
        ChatActivityEnterView chatActivityEnterView = this.a;
        return chatActivityEnterView.L2 == UserConfig.getInstance(chatActivityEnterView.M).getClientUserId();
    }

    @Override // org.telegram.ui.Components.xx
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        MediaDataController.getInstance(chatActivityEnterView.M).toggleStickerSet(chatActivityEnterView.J2, stickerSetCovered, 0, chatActivityEnterView.K2, false, false);
    }

    @Override // org.telegram.ui.Components.xx
    public final void i(int i10) {
        int i11 = ChatActivityEnterView.i5;
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.l1(i10, true);
        if (i10 != 0) {
            chatActivityEnterView.m1(true, true, false, i10 == 1);
        }
        if (chatActivityEnterView.t3 && chatActivityEnterView.M1 == 2) {
            chatActivityEnterView.L();
        }
    }

    @Override // org.telegram.ui.Components.xx
    public final boolean j() {
        return true;
    }

    @Override // org.telegram.ui.Components.xx
    public final boolean k() {
        ChatActivityEnterView chatActivityEnterView = this.a;
        TextView textView = chatActivityEnterView.P4;
        if (textView == null) {
            textView = chatActivityEnterView.A0;
        }
        if (textView == null || textView.length() == 0) {
            return false;
        }
        textView.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // org.telegram.ui.Components.xx
    public final void l(String str) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        EditText editText = chatActivityEnterView.P4;
        if (editText == null) {
            editText = chatActivityEnterView.A0;
        }
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            chatActivityEnterView.N2 = 2;
            CharSequence replaceEmoji = Emoji.replaceEmoji((CharSequence) str, editText.getPaint().getFontMetricsInt(), false, (int[]) null);
            editText.setText(editText.getText().insert(selectionEnd, replaceEmoji));
            int length = selectionEnd + replaceEmoji.length();
            editText.setSelection(length, length);
        } catch (Exception e9) {
            FileLog.e(e9);
        } finally {
            chatActivityEnterView.N2 = 0;
        }
    }

    @Override // org.telegram.ui.Components.xx
    public final void m(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        ig igVar = chatActivityEnterView.B0;
        if (chatActivityEnterView.g5) {
            return;
        }
        sf sfVar = chatActivityEnterView.V2;
        if (sfVar != null) {
            sfVar.dismiss();
            chatActivityEnterView.V2 = null;
        }
        if (chatActivityEnterView.C0 > 0 && !c()) {
            ag agVar = chatActivityEnterView.U2;
            if (agVar != null) {
                if (view == null) {
                    view = igVar;
                }
                agVar.l1(view, igVar.a.getText(), true);
                return;
            }
            return;
        }
        if (chatActivityEnterView.u3) {
            if (chatActivityEnterView.M1 != 0) {
                chatActivityEnterView.l1(0, true);
                chatActivityEnterView.Q0.t(MessageObject.getStickerSetId(document), true);
                chatActivityEnterView.Q0.C();
            }
            chatActivityEnterView.m1(false, true, false, true);
        }
        chatActivityEnterView.e(document, str, obj, sendAnimationData, false, z10, i10, 0);
        if (DialogObject.isEncryptedDialog(chatActivityEnterView.L2) && MessageObject.isGifDocument(document)) {
            chatActivityEnterView.N.getMessagesController().saveGif(obj, document);
        }
    }

    @Override // org.telegram.ui.Components.xx
    public final void n() {
        Activity activity;
        ChatActivityEnterView chatActivityEnterView = this.a;
        org.telegram.ui.rn rnVar = chatActivityEnterView.K2;
        if (rnVar == null || (activity = chatActivityEnterView.J2) == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, chatActivityEnterView.R3);
        alertDialog$Builder.a.N = LocaleController.getString(R.string.ClearRecentEmojiTitle);
        alertDialog$Builder.a.P = LocaleController.getString(R.string.ClearRecentEmojiText);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new s(this, 17));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        rnVar.showDialog(alertDialog$Builder.a);
    }

    @Override // org.telegram.ui.Components.xx
    public final void o(j41 j41Var) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        org.telegram.ui.ActionBar.n2 n2Var = chatActivityEnterView.K2;
        if (n2Var == null) {
            n2Var = LaunchActivity.R();
        }
        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
        if (n2Var2 != null) {
            chatActivityEnterView.V2 = new sf(this, chatActivityEnterView.getContext(), n2Var2, j41Var, chatActivityEnterView.R3);
            ag agVar = chatActivityEnterView.U2;
            if (agVar != null) {
                agVar.r(true);
            }
            n2Var2.showDialog(chatActivityEnterView.V2);
        }
    }

    @Override // org.telegram.ui.Components.xx
    public final float p() {
        return this.a.s0;
    }

    @Override // org.telegram.ui.Components.xx
    public final void q() {
        org.telegram.ui.ActionBar.n2 n2Var = this.a.K2;
        if (n2Var == null) {
            n2Var = LaunchActivity.R();
        }
        n2Var.showDialog(new ag.g2(n2Var, 11, false));
    }

    @Override // org.telegram.ui.Components.xx
    public final void r(TLRPC.StickerSetCovered stickerSetCovered) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        MediaDataController.getInstance(chatActivityEnterView.M).toggleStickerSet(chatActivityEnterView.J2, stickerSetCovered, 2, chatActivityEnterView.K2, false, false);
    }

    @Override // org.telegram.ui.Components.xx
    public final void s(int i10) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.U2.F();
        chatActivityEnterView.U2.W1(i10 == 3);
        chatActivityEnterView.post(chatActivityEnterView.n3);
    }

    @Override // org.telegram.ui.Components.xx
    public final void t(ArrayList arrayList) {
        org.telegram.ui.rn rnVar = this.a.K2;
        if (rnVar != null) {
            rnVar.presentFragment(new StickersActivity(5, arrayList));
        }
    }

    @Override // org.telegram.ui.Components.xx
    public final void u() {
        this.a.invalidate();
    }

    @Override // org.telegram.ui.Components.xx
    public final void v(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11) {
        B(view, obj, str, obj2, z10, i10, i11, null, false);
    }

    @Override // org.telegram.ui.Components.xx
    public final void w() {
        org.telegram.ui.rn rnVar = this.a.K2;
        if (rnVar != null) {
            rnVar.presentFragment(new StickersActivity(0, null));
        }
    }

    @Override // org.telegram.ui.Components.xx
    public final void x(long j10, TLRPC.Document document, String str, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        EditTextBoldCursor editTextBoldCursor = chatActivityEnterView.P4;
        if (editTextBoldCursor == null) {
            editTextBoldCursor = chatActivityEnterView.A0;
        }
        AndroidUtilities.runOnUIThread(new hh.i(this, editTextBoldCursor, str, document, j10, z10));
    }

    @Override // org.telegram.ui.Components.xx
    public final void y(long j10) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        org.telegram.ui.rn rnVar = chatActivityEnterView.K2;
        if (rnVar != null) {
            if (AndroidUtilities.isTablet()) {
                chatActivityEnterView.m0(false);
            }
            org.telegram.ui.c70 c70Var = new org.telegram.ui.c70(j10);
            c70Var.e0(chatActivityEnterView.Y1);
            rnVar.presentFragment(c70Var);
        }
    }

    @Override // org.telegram.ui.Components.xx
    public final boolean z() {
        return this.a.M1 != 0;
    }
}
