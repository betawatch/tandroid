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

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class ig implements oy {
    public final /* synthetic */ ChatActivityEnterView a;

    public ig(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.oy
    public final boolean A() {
        return this.a.z3;
    }

    public final void B(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11, MediaController.PhotoEntry photoEntry, boolean z11) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        xg xgVar = chatActivityEnterView.F0;
        org.telegram.ui.yn ynVar = chatActivityEnterView.P2;
        org.telegram.ui.on onVar = chatActivityEnterView.V2;
        if (onVar != null && ynVar != null && onVar.f) {
            ynVar.Qb();
            return;
        }
        if (c() && i10 == 0) {
            e5.M(chatActivityEnterView.O2, ynVar.a(), new org.telegram.ui.sq(this, view, obj, str, obj2, photoEntry, z11), chatActivityEnterView.W3);
            return;
        }
        if (chatActivityEnterView.G0 <= 0 || c()) {
            e5.a0(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new he(this, obj, photoEntry, z10, i10, i11, z11, str, obj2));
            return;
        }
        pg pgVar = chatActivityEnterView.Z2;
        if (pgVar != null) {
            pgVar.t1(view != null ? view : xgVar, xgVar.a.getText(), true);
        }
    }

    @Override // org.telegram.ui.Components.oy
    public final long a() {
        return this.a.Q2;
    }

    @Override // org.telegram.ui.Components.oy
    public final boolean b() {
        org.telegram.ui.yn ynVar = this.a.P2;
        return ynVar != null && ynVar.D6();
    }

    @Override // org.telegram.ui.Components.oy
    public final boolean c() {
        org.telegram.ui.yn ynVar = this.a.P2;
        return ynVar != null && ynVar.c();
    }

    @Override // org.telegram.ui.Components.oy
    public final void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        hg hgVar = chatActivityEnterView.a3;
        if (hgVar != null && !hgVar.isDismissed()) {
            chatActivityEnterView.a3.e.b(stickerSet, inputStickerSet);
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = chatActivityEnterView.P2;
        if (n2Var == null) {
            n2Var = LaunchActivity.R();
        }
        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
        if (n2Var2 == null || chatActivityEnterView.O2 == null) {
            return;
        }
        if (stickerSet != null) {
            inputStickerSet = new TLRPC.TL_inputStickerSetID();
            inputStickerSet.access_hash = stickerSet.access_hash;
            inputStickerSet.id = stickerSet.id;
        }
        ry0 ry0Var = new ry0(chatActivityEnterView.O2, n2Var2, inputStickerSet, null, chatActivityEnterView, chatActivityEnterView.W3);
        n2Var2.showDialog(ry0Var);
        if (z10) {
            ry0Var.p0();
        }
    }

    @Override // org.telegram.ui.Components.oy
    public final void e(Object obj, Object obj2) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        org.telegram.ui.yn ynVar = chatActivityEnterView.P2;
        if (ynVar == null) {
            return;
        }
        PhotoViewer.t1().K2(null, ynVar, ynVar.ca);
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
        PhotoViewer.t1().g2(arrayList, 0, 12, false, new gg(this, obj, obj2, photoEntry), chatActivityEnterView.P2);
    }

    @Override // org.telegram.ui.Components.oy
    public final int f() {
        int threadMessageId;
        threadMessageId = this.a.getThreadMessageId();
        return threadMessageId;
    }

    @Override // org.telegram.ui.Components.oy
    public final boolean g() {
        ChatActivityEnterView chatActivityEnterView = this.a;
        return chatActivityEnterView.Q2 == UserConfig.getInstance(chatActivityEnterView.Q).getClientUserId();
    }

    @Override // org.telegram.ui.Components.oy
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        MediaDataController.getInstance(chatActivityEnterView.Q).toggleStickerSet(chatActivityEnterView.O2, stickerSetCovered, 0, chatActivityEnterView.P2, false, false);
    }

    @Override // org.telegram.ui.Components.oy
    public final void i(int i10) {
        int i11 = ChatActivityEnterView.n5;
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.l1(i10, true);
        if (i10 != 0) {
            chatActivityEnterView.m1(true, true, false, i10 == 1);
        }
        if (chatActivityEnterView.y3 && chatActivityEnterView.R1 == 2) {
            chatActivityEnterView.J();
        }
    }

    @Override // org.telegram.ui.Components.oy
    public final boolean j() {
        return true;
    }

    @Override // org.telegram.ui.Components.oy
    public final boolean k() {
        ChatActivityEnterView chatActivityEnterView = this.a;
        TextView textView = chatActivityEnterView.U4;
        if (textView == null) {
            textView = chatActivityEnterView.E0;
        }
        if (textView == null || textView.length() == 0) {
            return false;
        }
        textView.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // org.telegram.ui.Components.oy
    public final void l(String str) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        EditText editText = chatActivityEnterView.U4;
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
            chatActivityEnterView.S2 = 2;
            CharSequence replaceEmoji = Emoji.replaceEmoji((CharSequence) str, editText.getPaint().getFontMetricsInt(), false, (int[]) null);
            editText.setText(editText.getText().insert(selectionEnd, replaceEmoji));
            int length = selectionEnd + replaceEmoji.length();
            editText.setSelection(length, length);
        } catch (Exception e7) {
            FileLog.e(e7);
        } finally {
            chatActivityEnterView.S2 = 0;
        }
    }

    @Override // org.telegram.ui.Components.oy
    public final void m(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        xg xgVar = chatActivityEnterView.F0;
        if (chatActivityEnterView.l5) {
            return;
        }
        hg hgVar = chatActivityEnterView.a3;
        if (hgVar != null) {
            hgVar.dismiss();
            chatActivityEnterView.a3 = null;
        }
        if (chatActivityEnterView.G0 > 0 && !c()) {
            pg pgVar = chatActivityEnterView.Z2;
            if (pgVar != null) {
                if (view == null) {
                    view = xgVar;
                }
                pgVar.t1(view, xgVar.a.getText(), true);
                return;
            }
            return;
        }
        if (chatActivityEnterView.z3) {
            if (chatActivityEnterView.R1 != 0) {
                chatActivityEnterView.l1(0, true);
                chatActivityEnterView.U0.s(MessageObject.getStickerSetId(document), true);
                chatActivityEnterView.U0.A();
            }
            chatActivityEnterView.m1(false, true, false, true);
        }
        chatActivityEnterView.d(document, str, obj, sendAnimationData, false, z10, i10, 0);
        if (DialogObject.isEncryptedDialog(chatActivityEnterView.Q2) && MessageObject.isGifDocument(document)) {
            chatActivityEnterView.R.getMessagesController().saveGif(obj, document);
        }
    }

    @Override // org.telegram.ui.Components.oy
    public final void n() {
        Activity activity;
        ChatActivityEnterView chatActivityEnterView = this.a;
        org.telegram.ui.yn ynVar = chatActivityEnterView.P2;
        if (ynVar == null || (activity = chatActivityEnterView.O2) == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, chatActivityEnterView.W3);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.ClearRecentEmojiTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.ClearRecentEmojiText);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new s(this, 17));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        ynVar.showDialog(alertDialog$Builder.a);
    }

    @Override // org.telegram.ui.Components.oy
    public final void o(d61 d61Var) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        org.telegram.ui.ActionBar.n2 n2Var = chatActivityEnterView.P2;
        if (n2Var == null) {
            n2Var = LaunchActivity.R();
        }
        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
        if (n2Var2 != null) {
            chatActivityEnterView.a3 = new hg(this, chatActivityEnterView.getContext(), n2Var2, d61Var, chatActivityEnterView.W3);
            pg pgVar = chatActivityEnterView.Z2;
            if (pgVar != null) {
                pgVar.B(true);
            }
            n2Var2.showDialog(chatActivityEnterView.a3);
        }
    }

    @Override // org.telegram.ui.Components.oy
    public final float p() {
        return this.a.w0;
    }

    @Override // org.telegram.ui.Components.oy
    public final void q() {
        org.telegram.ui.ActionBar.n2 n2Var = this.a.P2;
        if (n2Var == null) {
            n2Var = LaunchActivity.R();
        }
        n2Var.showDialog(new rg.y0(n2Var, 11, false));
    }

    @Override // org.telegram.ui.Components.oy
    public final void r(TLRPC.StickerSetCovered stickerSetCovered) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        MediaDataController.getInstance(chatActivityEnterView.Q).toggleStickerSet(chatActivityEnterView.O2, stickerSetCovered, 2, chatActivityEnterView.P2, false, false);
    }

    @Override // org.telegram.ui.Components.oy
    public final void s(int i10) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.Z2.V();
        chatActivityEnterView.Z2.j2(i10 == 3);
        chatActivityEnterView.post(chatActivityEnterView.s3);
    }

    @Override // org.telegram.ui.Components.oy
    public final void t(ArrayList arrayList) {
        org.telegram.ui.yn ynVar = this.a.P2;
        if (ynVar != null) {
            ynVar.presentFragment(new StickersActivity(5, arrayList));
        }
    }

    @Override // org.telegram.ui.Components.oy
    public final void u() {
        this.a.invalidate();
    }

    @Override // org.telegram.ui.Components.oy
    public final void v(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11) {
        B(view, obj, str, obj2, z10, i10, i11, null, false);
    }

    @Override // org.telegram.ui.Components.oy
    public final void w() {
        org.telegram.ui.yn ynVar = this.a.P2;
        if (ynVar != null) {
            ynVar.presentFragment(new StickersActivity(0, null));
        }
    }

    @Override // org.telegram.ui.Components.oy
    public final void x(long j3, TLRPC.Document document, String str, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        EditTextBoldCursor editTextBoldCursor = chatActivityEnterView.U4;
        if (editTextBoldCursor == null) {
            editTextBoldCursor = chatActivityEnterView.E0;
        }
        AndroidUtilities.runOnUIThread(new ai.h3(this, editTextBoldCursor, str, document, j3, z10));
    }

    @Override // org.telegram.ui.Components.oy
    public final void y(long j3) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        org.telegram.ui.yn ynVar = chatActivityEnterView.P2;
        if (ynVar != null) {
            if (AndroidUtilities.isTablet()) {
                chatActivityEnterView.m0(false);
            }
            org.telegram.ui.s70 s70Var = new org.telegram.ui.s70(j3);
            s70Var.e0(chatActivityEnterView.d2);
            ynVar.presentFragment(s70Var);
        }
    }

    @Override // org.telegram.ui.Components.oy
    public final boolean z() {
        return this.a.R1 != 0;
    }
}
