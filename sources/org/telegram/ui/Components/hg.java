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

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class hg implements my {
    public final /* synthetic */ ChatActivityEnterView a;

    public hg(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.my
    public final boolean A() {
        return this.a.z3;
    }

    public final void B(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11, MediaController.PhotoEntry photoEntry, boolean z11) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        wg wgVar = chatActivityEnterView.F0;
        org.telegram.ui.wn wnVar = chatActivityEnterView.P2;
        org.telegram.ui.mn mnVar = chatActivityEnterView.V2;
        if (mnVar != null && wnVar != null && mnVar.f) {
            wnVar.Rb();
            return;
        }
        if (c() && i10 == 0) {
            e5.M(chatActivityEnterView.O2, wnVar.a(), new org.telegram.ui.qq(this, view, obj, str, obj2, photoEntry, z11), chatActivityEnterView.W3);
            return;
        }
        if (chatActivityEnterView.G0 <= 0 || c()) {
            e5.a0(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new ge(this, obj, photoEntry, z10, i10, i11, z11, str, obj2));
            return;
        }
        og ogVar = chatActivityEnterView.Z2;
        if (ogVar != null) {
            ogVar.t1(view != null ? view : wgVar, wgVar.a.getText(), true);
        }
    }

    @Override // org.telegram.ui.Components.my
    public final long a() {
        return this.a.Q2;
    }

    @Override // org.telegram.ui.Components.my
    public final boolean b() {
        org.telegram.ui.wn wnVar = this.a.P2;
        return wnVar != null && wnVar.D6();
    }

    @Override // org.telegram.ui.Components.my
    public final boolean c() {
        org.telegram.ui.wn wnVar = this.a.P2;
        return wnVar != null && wnVar.c();
    }

    @Override // org.telegram.ui.Components.my
    public final void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        gg ggVar = chatActivityEnterView.a3;
        if (ggVar != null && !ggVar.isDismissed()) {
            chatActivityEnterView.a3.e.b(stickerSet, inputStickerSet);
            return;
        }
        org.telegram.ui.ActionBar.m2 m2Var = chatActivityEnterView.P2;
        if (m2Var == null) {
            m2Var = LaunchActivity.R();
        }
        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
        if (m2Var2 == null || chatActivityEnterView.O2 == null) {
            return;
        }
        if (stickerSet != null) {
            inputStickerSet = new TLRPC.TL_inputStickerSetID();
            inputStickerSet.access_hash = stickerSet.access_hash;
            inputStickerSet.id = stickerSet.id;
        }
        fy0 fy0Var = new fy0(chatActivityEnterView.O2, m2Var2, inputStickerSet, null, chatActivityEnterView, chatActivityEnterView.W3);
        m2Var2.showDialog(fy0Var);
        if (z10) {
            fy0Var.p0();
        }
    }

    @Override // org.telegram.ui.Components.my
    public final void e(Object obj, Object obj2) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        org.telegram.ui.wn wnVar = chatActivityEnterView.P2;
        if (wnVar == null) {
            return;
        }
        PhotoViewer.t1().J2(null, wnVar, wnVar.ea);
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
        PhotoViewer.t1().f2(arrayList, 0, 12, false, new fg(this, obj, obj2, photoEntry), chatActivityEnterView.P2);
    }

    @Override // org.telegram.ui.Components.my
    public final int f() {
        int threadMessageId;
        threadMessageId = this.a.getThreadMessageId();
        return threadMessageId;
    }

    @Override // org.telegram.ui.Components.my
    public final boolean g() {
        ChatActivityEnterView chatActivityEnterView = this.a;
        return chatActivityEnterView.Q2 == UserConfig.getInstance(chatActivityEnterView.Q).getClientUserId();
    }

    @Override // org.telegram.ui.Components.my
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        MediaDataController.getInstance(chatActivityEnterView.Q).toggleStickerSet(chatActivityEnterView.O2, stickerSetCovered, 0, chatActivityEnterView.P2, false, false);
    }

    @Override // org.telegram.ui.Components.my
    public final void i(int i10) {
        int i11 = ChatActivityEnterView.n5;
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.m1(i10, true);
        if (i10 != 0) {
            chatActivityEnterView.n1(true, true, false, i10 == 1);
        }
        if (chatActivityEnterView.y3 && chatActivityEnterView.R1 == 2) {
            chatActivityEnterView.L();
        }
    }

    @Override // org.telegram.ui.Components.my
    public final boolean j() {
        return true;
    }

    @Override // org.telegram.ui.Components.my
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

    @Override // org.telegram.ui.Components.my
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
        } catch (Exception e) {
            FileLog.e(e);
        } finally {
            chatActivityEnterView.S2 = 0;
        }
    }

    @Override // org.telegram.ui.Components.my
    public final void m(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        wg wgVar = chatActivityEnterView.F0;
        if (chatActivityEnterView.l5) {
            return;
        }
        gg ggVar = chatActivityEnterView.a3;
        if (ggVar != null) {
            ggVar.dismiss();
            chatActivityEnterView.a3 = null;
        }
        if (chatActivityEnterView.G0 > 0 && !c()) {
            og ogVar = chatActivityEnterView.Z2;
            if (ogVar != null) {
                if (view == null) {
                    view = wgVar;
                }
                ogVar.t1(view, wgVar.a.getText(), true);
                return;
            }
            return;
        }
        if (chatActivityEnterView.z3) {
            if (chatActivityEnterView.R1 != 0) {
                chatActivityEnterView.m1(0, true);
                chatActivityEnterView.U0.s(MessageObject.getStickerSetId(document), true);
                chatActivityEnterView.U0.A();
            }
            chatActivityEnterView.n1(false, true, false, true);
        }
        chatActivityEnterView.d(document, str, obj, sendAnimationData, false, z10, i10, 0);
        if (DialogObject.isEncryptedDialog(chatActivityEnterView.Q2) && MessageObject.isGifDocument(document)) {
            chatActivityEnterView.R.getMessagesController().saveGif(obj, document);
        }
    }

    @Override // org.telegram.ui.Components.my
    public final void n() {
        Activity activity;
        ChatActivityEnterView chatActivityEnterView = this.a;
        org.telegram.ui.wn wnVar = chatActivityEnterView.P2;
        if (wnVar == null || (activity = chatActivityEnterView.O2) == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, chatActivityEnterView.W3);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.ClearRecentEmojiTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.ClearRecentEmojiText);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new s(this, 17));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        wnVar.showDialog(alertDialog$Builder.a);
    }

    @Override // org.telegram.ui.Components.my
    public final void o(r51 r51Var) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        org.telegram.ui.ActionBar.m2 m2Var = chatActivityEnterView.P2;
        if (m2Var == null) {
            m2Var = LaunchActivity.R();
        }
        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
        if (m2Var2 != null) {
            chatActivityEnterView.a3 = new gg(this, chatActivityEnterView.getContext(), m2Var2, r51Var, chatActivityEnterView.W3);
            og ogVar = chatActivityEnterView.Z2;
            if (ogVar != null) {
                ogVar.B(true);
            }
            m2Var2.showDialog(chatActivityEnterView.a3);
        }
    }

    @Override // org.telegram.ui.Components.my
    public final float p() {
        return this.a.w0;
    }

    @Override // org.telegram.ui.Components.my
    public final void q() {
        org.telegram.ui.ActionBar.m2 m2Var = this.a.P2;
        if (m2Var == null) {
            m2Var = LaunchActivity.R();
        }
        m2Var.showDialog(new rg.x0(m2Var, 11, false));
    }

    @Override // org.telegram.ui.Components.my
    public final void r(TLRPC.StickerSetCovered stickerSetCovered) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        MediaDataController.getInstance(chatActivityEnterView.Q).toggleStickerSet(chatActivityEnterView.O2, stickerSetCovered, 2, chatActivityEnterView.P2, false, false);
    }

    @Override // org.telegram.ui.Components.my
    public final void s(int i10) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.Z2.W();
        chatActivityEnterView.Z2.j2(i10 == 3);
        chatActivityEnterView.post(chatActivityEnterView.s3);
    }

    @Override // org.telegram.ui.Components.my
    public final void t(ArrayList arrayList) {
        org.telegram.ui.wn wnVar = this.a.P2;
        if (wnVar != null) {
            wnVar.presentFragment(new StickersActivity(5, arrayList));
        }
    }

    @Override // org.telegram.ui.Components.my
    public final void u() {
        this.a.invalidate();
    }

    @Override // org.telegram.ui.Components.my
    public final void v(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11) {
        B(view, obj, str, obj2, z10, i10, i11, null, false);
    }

    @Override // org.telegram.ui.Components.my
    public final void w() {
        org.telegram.ui.wn wnVar = this.a.P2;
        if (wnVar != null) {
            wnVar.presentFragment(new StickersActivity(0, null));
        }
    }

    @Override // org.telegram.ui.Components.my
    public final void x(long j3, TLRPC.Document document, String str, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        EditTextBoldCursor editTextBoldCursor = chatActivityEnterView.U4;
        if (editTextBoldCursor == null) {
            editTextBoldCursor = chatActivityEnterView.E0;
        }
        AndroidUtilities.runOnUIThread(new ai.h3(this, editTextBoldCursor, str, document, j3, z10));
    }

    @Override // org.telegram.ui.Components.my
    public final void y(long j3) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        org.telegram.ui.wn wnVar = chatActivityEnterView.P2;
        if (wnVar != null) {
            if (AndroidUtilities.isTablet()) {
                chatActivityEnterView.m0(false);
            }
            org.telegram.ui.o70 o70Var = new org.telegram.ui.o70(j3);
            o70Var.e0(chatActivityEnterView.d2);
            wnVar.presentFragment(o70Var);
        }
    }

    @Override // org.telegram.ui.Components.my
    public final boolean z() {
        return this.a.R1 != 0;
    }
}
