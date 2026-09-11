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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class hg implements ly {
    public final /* synthetic */ ChatActivityEnterView a;

    public hg(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.ly
    public final boolean A() {
        return this.a.y3;
    }

    public final void B(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11, MediaController.PhotoEntry photoEntry, boolean z11) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        wg wgVar = chatActivityEnterView.F0;
        org.telegram.ui.co coVar = chatActivityEnterView.O2;
        org.telegram.ui.sn snVar = chatActivityEnterView.U2;
        if (snVar != null && coVar != null && snVar.f) {
            coVar.Rb();
            return;
        }
        if (c() && i10 == 0) {
            e5.M(chatActivityEnterView.N2, coVar.a(), new org.telegram.ui.wq(this, view, obj, str, obj2, photoEntry, z11), chatActivityEnterView.V3);
            return;
        }
        if (chatActivityEnterView.G0 <= 0 || c()) {
            e5.a0(chatActivityEnterView.Q, 1, chatActivityEnterView.P2, new fe(this, obj, photoEntry, z10, i10, i11, z11, str, obj2));
            return;
        }
        og ogVar = chatActivityEnterView.Y2;
        if (ogVar != null) {
            ogVar.n1(view != null ? view : wgVar, wgVar.a.getText(), true);
        }
    }

    @Override // org.telegram.ui.Components.ly
    public final long a() {
        return this.a.P2;
    }

    @Override // org.telegram.ui.Components.ly
    public final boolean b() {
        org.telegram.ui.co coVar = this.a.O2;
        return coVar != null && coVar.D6();
    }

    @Override // org.telegram.ui.Components.ly
    public final boolean c() {
        org.telegram.ui.co coVar = this.a.O2;
        return coVar != null && coVar.c();
    }

    @Override // org.telegram.ui.Components.ly
    public final void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        gg ggVar = chatActivityEnterView.Z2;
        if (ggVar != null && !ggVar.isDismissed()) {
            chatActivityEnterView.Z2.e.b(stickerSet, inputStickerSet);
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = chatActivityEnterView.O2;
        if (n2Var == null) {
            n2Var = LaunchActivity.R();
        }
        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
        if (n2Var2 == null || chatActivityEnterView.N2 == null) {
            return;
        }
        if (stickerSet != null) {
            inputStickerSet = new TLRPC.TL_inputStickerSetID();
            inputStickerSet.access_hash = stickerSet.access_hash;
            inputStickerSet.id = stickerSet.id;
        }
        ux0 ux0Var = new ux0(chatActivityEnterView.N2, n2Var2, inputStickerSet, null, chatActivityEnterView, chatActivityEnterView.V3);
        n2Var2.showDialog(ux0Var);
        if (z10) {
            ux0Var.p0();
        }
    }

    @Override // org.telegram.ui.Components.ly
    public final void e(Object obj, Object obj2) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        org.telegram.ui.co coVar = chatActivityEnterView.O2;
        if (coVar == null) {
            return;
        }
        PhotoViewer.t1().K2(null, coVar, coVar.ea);
        File pathToAttach = obj instanceof TLRPC.Document ? FileLoader.getInstance(chatActivityEnterView.Q).getPathToAttach((TLRPC.Document) obj) : null;
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
        PhotoViewer.t1().f2(arrayList, 0, 12, false, new fg(this, obj, obj2, photoEntry), chatActivityEnterView.O2);
    }

    @Override // org.telegram.ui.Components.ly
    public final int f() {
        int threadMessageId;
        threadMessageId = this.a.getThreadMessageId();
        return threadMessageId;
    }

    @Override // org.telegram.ui.Components.ly
    public final boolean g() {
        ChatActivityEnterView chatActivityEnterView = this.a;
        return chatActivityEnterView.P2 == UserConfig.getInstance(chatActivityEnterView.Q).getClientUserId();
    }

    @Override // org.telegram.ui.Components.ly
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        MediaDataController.getInstance(chatActivityEnterView.Q).toggleStickerSet(chatActivityEnterView.N2, stickerSetCovered, 0, chatActivityEnterView.O2, false, false);
    }

    @Override // org.telegram.ui.Components.ly
    public final void i(int i10) {
        int i11 = ChatActivityEnterView.m5;
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.m1(i10, true);
        if (i10 != 0) {
            chatActivityEnterView.n1(true, true, false, i10 == 1);
        }
        if (chatActivityEnterView.x3 && chatActivityEnterView.Q1 == 2) {
            chatActivityEnterView.L();
        }
    }

    @Override // org.telegram.ui.Components.ly
    public final boolean j() {
        return true;
    }

    @Override // org.telegram.ui.Components.ly
    public final boolean k() {
        ChatActivityEnterView chatActivityEnterView = this.a;
        TextView textView = chatActivityEnterView.T4;
        if (textView == null) {
            textView = chatActivityEnterView.E0;
        }
        if (textView == null || textView.length() == 0) {
            return false;
        }
        textView.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // org.telegram.ui.Components.ly
    public final void l(String str) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        EditText editText = chatActivityEnterView.T4;
        if (editText == null) {
            editText = chatActivityEnterView.E0;
        }
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            chatActivityEnterView.R2 = 2;
            CharSequence replaceEmoji = Emoji.replaceEmoji((CharSequence) str, editText.getPaint().getFontMetricsInt(), false, (int[]) null);
            editText.setText(editText.getText().insert(selectionEnd, replaceEmoji));
            int length = selectionEnd + replaceEmoji.length();
            editText.setSelection(length, length);
        } catch (Exception e7) {
            FileLog.e(e7);
        } finally {
            chatActivityEnterView.R2 = 0;
        }
    }

    @Override // org.telegram.ui.Components.ly
    public final void m(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        wg wgVar = chatActivityEnterView.F0;
        if (chatActivityEnterView.k5) {
            return;
        }
        gg ggVar = chatActivityEnterView.Z2;
        if (ggVar != null) {
            ggVar.dismiss();
            chatActivityEnterView.Z2 = null;
        }
        if (chatActivityEnterView.G0 > 0 && !c()) {
            og ogVar = chatActivityEnterView.Y2;
            if (ogVar != null) {
                if (view == null) {
                    view = wgVar;
                }
                ogVar.n1(view, wgVar.a.getText(), true);
                return;
            }
            return;
        }
        if (chatActivityEnterView.y3) {
            if (chatActivityEnterView.Q1 != 0) {
                chatActivityEnterView.m1(0, true);
                chatActivityEnterView.U0.s(MessageObject.getStickerSetId(document), true);
                chatActivityEnterView.U0.B();
            }
            chatActivityEnterView.n1(false, true, false, true);
        }
        chatActivityEnterView.a(document, str, obj, sendAnimationData, false, z10, i10, 0);
        if (DialogObject.isEncryptedDialog(chatActivityEnterView.P2) && MessageObject.isGifDocument(document)) {
            chatActivityEnterView.R.getMessagesController().saveGif(obj, document);
        }
    }

    @Override // org.telegram.ui.Components.ly
    public final void n() {
        Activity activity;
        ChatActivityEnterView chatActivityEnterView = this.a;
        org.telegram.ui.co coVar = chatActivityEnterView.O2;
        if (coVar == null || (activity = chatActivityEnterView.N2) == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, chatActivityEnterView.V3);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.ClearRecentEmojiTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.ClearRecentEmojiText);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new t(this, 17));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        coVar.showDialog(alertDialog$Builder.a);
    }

    @Override // org.telegram.ui.Components.ly
    public final void o(d51 d51Var) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        org.telegram.ui.ActionBar.n2 n2Var = chatActivityEnterView.O2;
        if (n2Var == null) {
            n2Var = LaunchActivity.R();
        }
        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
        if (n2Var2 != null) {
            chatActivityEnterView.Z2 = new gg(this, chatActivityEnterView.getContext(), n2Var2, d51Var, chatActivityEnterView.V3);
            og ogVar = chatActivityEnterView.Y2;
            if (ogVar != null) {
                ogVar.z(true);
            }
            n2Var2.showDialog(chatActivityEnterView.Z2);
        }
    }

    @Override // org.telegram.ui.Components.ly
    public final float p() {
        return this.a.w0;
    }

    @Override // org.telegram.ui.Components.ly
    public final void q() {
        org.telegram.ui.ActionBar.n2 n2Var = this.a.O2;
        if (n2Var == null) {
            n2Var = LaunchActivity.R();
        }
        n2Var.showDialog(new sg.a1(n2Var, 11, false));
    }

    @Override // org.telegram.ui.Components.ly
    public final void r(TLRPC.StickerSetCovered stickerSetCovered) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        MediaDataController.getInstance(chatActivityEnterView.Q).toggleStickerSet(chatActivityEnterView.N2, stickerSetCovered, 2, chatActivityEnterView.O2, false, false);
    }

    @Override // org.telegram.ui.Components.ly
    public final void s(int i10) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.Y2.U();
        chatActivityEnterView.Y2.b2(i10 == 3);
        chatActivityEnterView.post(chatActivityEnterView.r3);
    }

    @Override // org.telegram.ui.Components.ly
    public final void t(ArrayList arrayList) {
        org.telegram.ui.co coVar = this.a.O2;
        if (coVar != null) {
            coVar.presentFragment(new StickersActivity(5, arrayList));
        }
    }

    @Override // org.telegram.ui.Components.ly
    public final void u() {
        this.a.invalidate();
    }

    @Override // org.telegram.ui.Components.ly
    public final void v(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11) {
        B(view, obj, str, obj2, z10, i10, i11, null, false);
    }

    @Override // org.telegram.ui.Components.ly
    public final void w() {
        org.telegram.ui.co coVar = this.a.O2;
        if (coVar != null) {
            coVar.presentFragment(new StickersActivity(0, null));
        }
    }

    @Override // org.telegram.ui.Components.ly
    public final void x(long j3, TLRPC.Document document, String str, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        EditTextBoldCursor editTextBoldCursor = chatActivityEnterView.T4;
        if (editTextBoldCursor == null) {
            editTextBoldCursor = chatActivityEnterView.E0;
        }
        AndroidUtilities.runOnUIThread(new bi.u2(this, editTextBoldCursor, str, document, j3, z10));
    }

    @Override // org.telegram.ui.Components.ly
    public final void y(long j3) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        org.telegram.ui.co coVar = chatActivityEnterView.O2;
        if (coVar != null) {
            if (AndroidUtilities.isTablet()) {
                chatActivityEnterView.m0(false);
            }
            org.telegram.ui.u70 u70Var = new org.telegram.ui.u70(j3);
            u70Var.e0(chatActivityEnterView.c2);
            coVar.presentFragment(u70Var);
        }
    }

    @Override // org.telegram.ui.Components.ly
    public final boolean z() {
        return this.a.Q1 != 0;
    }
}
