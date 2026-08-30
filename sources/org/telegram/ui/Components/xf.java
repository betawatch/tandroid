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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class xf implements ky {
    public final /* synthetic */ ChatActivityEnterView a;

    public xf(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.ky
    public final boolean A() {
        return this.a.v3;
    }

    public final void B(View view, Object obj, String str, Object obj2, boolean z4, int i10, int i11, MediaController.PhotoEntry photoEntry, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        mg mgVar = chatActivityEnterView.C0;
        org.telegram.ui.xn xnVar = chatActivityEnterView.L2;
        org.telegram.ui.nn nnVar = chatActivityEnterView.R2;
        if (nnVar != null && xnVar != null && nnVar.f) {
            xnVar.Rb();
            return;
        }
        if (c() && i10 == 0) {
            z4.M(chatActivityEnterView.K2, xnVar.a(), new org.telegram.ui.pq(this, view, obj, str, obj2, photoEntry, z10), chatActivityEnterView.S3);
            return;
        }
        if (chatActivityEnterView.D0 <= 0 || c()) {
            z4.a0(chatActivityEnterView.N, 1, chatActivityEnterView.M2, new vd(this, obj, photoEntry, z4, i10, i11, z10, str, obj2));
            return;
        }
        eg egVar = chatActivityEnterView.V2;
        if (egVar != null) {
            egVar.v1(view != null ? view : mgVar, mgVar.a.getText(), true);
        }
    }

    @Override // org.telegram.ui.Components.ky
    public final long a() {
        return this.a.M2;
    }

    @Override // org.telegram.ui.Components.ky
    public final boolean b() {
        org.telegram.ui.xn xnVar = this.a.L2;
        return xnVar != null && xnVar.D6();
    }

    @Override // org.telegram.ui.Components.ky
    public final boolean c() {
        org.telegram.ui.xn xnVar = this.a.L2;
        return xnVar != null && xnVar.c();
    }

    @Override // org.telegram.ui.Components.ky
    public final void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z4) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        wf wfVar = chatActivityEnterView.W2;
        if (wfVar != null && !wfVar.isDismissed()) {
            chatActivityEnterView.W2.e.b(stickerSet, inputStickerSet);
            return;
        }
        org.telegram.ui.ActionBar.p2 p2Var = chatActivityEnterView.L2;
        if (p2Var == null) {
            p2Var = LaunchActivity.R();
        }
        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
        if (p2Var2 == null || chatActivityEnterView.K2 == null) {
            return;
        }
        if (stickerSet != null) {
            inputStickerSet = new TLRPC.TL_inputStickerSetID();
            inputStickerSet.access_hash = stickerSet.access_hash;
            inputStickerSet.id = stickerSet.id;
        }
        xx0 xx0Var = new xx0(chatActivityEnterView.K2, p2Var2, inputStickerSet, null, chatActivityEnterView, chatActivityEnterView.S3);
        p2Var2.showDialog(xx0Var);
        if (z4) {
            xx0Var.p0();
        }
    }

    @Override // org.telegram.ui.Components.ky
    public final void e(Object obj, Object obj2) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        org.telegram.ui.xn xnVar = chatActivityEnterView.L2;
        if (xnVar == null) {
            return;
        }
        PhotoViewer.t1().K2(null, xnVar, xnVar.ba);
        File pathToAttach = obj instanceof TLRPC.Document ? FileLoader.getInstance(chatActivityEnterView.N).getPathToAttach((TLRPC.Document) obj) : null;
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
        PhotoViewer.t1().f2(arrayList, 0, 12, false, new vf(this, obj, obj2, photoEntry), chatActivityEnterView.L2);
    }

    @Override // org.telegram.ui.Components.ky
    public final int f() {
        int threadMessageId;
        threadMessageId = this.a.getThreadMessageId();
        return threadMessageId;
    }

    @Override // org.telegram.ui.Components.ky
    public final boolean g() {
        ChatActivityEnterView chatActivityEnterView = this.a;
        return chatActivityEnterView.M2 == UserConfig.getInstance(chatActivityEnterView.N).getClientUserId();
    }

    @Override // org.telegram.ui.Components.ky
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        MediaDataController.getInstance(chatActivityEnterView.N).toggleStickerSet(chatActivityEnterView.K2, stickerSetCovered, 0, chatActivityEnterView.L2, false, false);
    }

    @Override // org.telegram.ui.Components.ky
    public final void i(int i10) {
        int i11 = ChatActivityEnterView.j5;
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.m1(i10, true);
        if (i10 != 0) {
            chatActivityEnterView.n1(true, true, false, i10 == 1);
        }
        if (chatActivityEnterView.u3 && chatActivityEnterView.N1 == 2) {
            chatActivityEnterView.K();
        }
    }

    @Override // org.telegram.ui.Components.ky
    public final boolean j() {
        return true;
    }

    @Override // org.telegram.ui.Components.ky
    public final boolean k() {
        ChatActivityEnterView chatActivityEnterView = this.a;
        TextView textView = chatActivityEnterView.Q4;
        if (textView == null) {
            textView = chatActivityEnterView.B0;
        }
        if (textView == null || textView.length() == 0) {
            return false;
        }
        textView.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // org.telegram.ui.Components.ky
    public final void l(String str) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        EditText editText = chatActivityEnterView.Q4;
        if (editText == null) {
            editText = chatActivityEnterView.B0;
        }
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            chatActivityEnterView.O2 = 2;
            CharSequence replaceEmoji = Emoji.replaceEmoji((CharSequence) str, editText.getPaint().getFontMetricsInt(), false, (int[]) null);
            editText.setText(editText.getText().insert(selectionEnd, replaceEmoji));
            int length = selectionEnd + replaceEmoji.length();
            editText.setSelection(length, length);
        } catch (Exception e) {
            FileLog.e(e);
        } finally {
            chatActivityEnterView.O2 = 0;
        }
    }

    @Override // org.telegram.ui.Components.ky
    public final void m(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z4, int i10) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        mg mgVar = chatActivityEnterView.C0;
        if (chatActivityEnterView.h5) {
            return;
        }
        wf wfVar = chatActivityEnterView.W2;
        if (wfVar != null) {
            wfVar.dismiss();
            chatActivityEnterView.W2 = null;
        }
        if (chatActivityEnterView.D0 > 0 && !c()) {
            eg egVar = chatActivityEnterView.V2;
            if (egVar != null) {
                if (view == null) {
                    view = mgVar;
                }
                egVar.v1(view, mgVar.a.getText(), true);
                return;
            }
            return;
        }
        if (chatActivityEnterView.v3) {
            if (chatActivityEnterView.N1 != 0) {
                chatActivityEnterView.m1(0, true);
                chatActivityEnterView.R0.s(MessageObject.getStickerSetId(document), true);
                chatActivityEnterView.R0.B();
            }
            chatActivityEnterView.n1(false, true, false, true);
        }
        chatActivityEnterView.d(document, str, obj, sendAnimationData, false, z4, i10, 0);
        if (DialogObject.isEncryptedDialog(chatActivityEnterView.M2) && MessageObject.isGifDocument(document)) {
            chatActivityEnterView.O.getMessagesController().saveGif(obj, document);
        }
    }

    @Override // org.telegram.ui.Components.ky
    public final void n() {
        Activity activity;
        ChatActivityEnterView chatActivityEnterView = this.a;
        org.telegram.ui.xn xnVar = chatActivityEnterView.L2;
        if (xnVar == null || (activity = chatActivityEnterView.K2) == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, chatActivityEnterView.S3);
        alertDialog$Builder.a.O = LocaleController.getString(R.string.ClearRecentEmojiTitle);
        alertDialog$Builder.a.Q = LocaleController.getString(R.string.ClearRecentEmojiText);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new t(this, 17));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        xnVar.showDialog(alertDialog$Builder.a);
    }

    @Override // org.telegram.ui.Components.ky
    public final void o(e51 e51Var) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        org.telegram.ui.ActionBar.p2 p2Var = chatActivityEnterView.L2;
        if (p2Var == null) {
            p2Var = LaunchActivity.R();
        }
        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
        if (p2Var2 != null) {
            chatActivityEnterView.W2 = new wf(this, chatActivityEnterView.getContext(), p2Var2, e51Var, chatActivityEnterView.S3);
            eg egVar = chatActivityEnterView.V2;
            if (egVar != null) {
                egVar.z(true);
            }
            p2Var2.showDialog(chatActivityEnterView.W2);
        }
    }

    @Override // org.telegram.ui.Components.ky
    public final float p() {
        return this.a.t0;
    }

    @Override // org.telegram.ui.Components.ky
    public final void q() {
        org.telegram.ui.ActionBar.p2 p2Var = this.a.L2;
        if (p2Var == null) {
            p2Var = LaunchActivity.R();
        }
        p2Var.showDialog(new eg.o1(p2Var, 11, false));
    }

    @Override // org.telegram.ui.Components.ky
    public final void r(TLRPC.StickerSetCovered stickerSetCovered) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        MediaDataController.getInstance(chatActivityEnterView.N).toggleStickerSet(chatActivityEnterView.K2, stickerSetCovered, 2, chatActivityEnterView.L2, false, false);
    }

    @Override // org.telegram.ui.Components.ky
    public final void s(int i10) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.V2.Y();
        chatActivityEnterView.V2.n2(i10 == 3);
        chatActivityEnterView.post(chatActivityEnterView.o3);
    }

    @Override // org.telegram.ui.Components.ky
    public final void t(ArrayList arrayList) {
        org.telegram.ui.xn xnVar = this.a.L2;
        if (xnVar != null) {
            xnVar.presentFragment(new StickersActivity(5, arrayList));
        }
    }

    @Override // org.telegram.ui.Components.ky
    public final void u() {
        this.a.invalidate();
    }

    @Override // org.telegram.ui.Components.ky
    public final void v(View view, Object obj, String str, Object obj2, boolean z4, int i10, int i11) {
        B(view, obj, str, obj2, z4, i10, i11, null, false);
    }

    @Override // org.telegram.ui.Components.ky
    public final void w() {
        org.telegram.ui.xn xnVar = this.a.L2;
        if (xnVar != null) {
            xnVar.presentFragment(new StickersActivity(0, null));
        }
    }

    @Override // org.telegram.ui.Components.ky
    public final void x(long j10, TLRPC.Document document, String str, boolean z4) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        EditTextBoldCursor editTextBoldCursor = chatActivityEnterView.Q4;
        if (editTextBoldCursor == null) {
            editTextBoldCursor = chatActivityEnterView.B0;
        }
        AndroidUtilities.runOnUIThread(new lh.j(this, editTextBoldCursor, str, document, j10, z4));
    }

    @Override // org.telegram.ui.Components.ky
    public final void y(long j10) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        org.telegram.ui.xn xnVar = chatActivityEnterView.L2;
        if (xnVar != null) {
            if (AndroidUtilities.isTablet()) {
                chatActivityEnterView.m0(false);
            }
            org.telegram.ui.m70 m70Var = new org.telegram.ui.m70(j10);
            m70Var.e0(chatActivityEnterView.Z1);
            xnVar.presentFragment(m70Var);
        }
    }

    @Override // org.telegram.ui.Components.ky
    public final boolean z() {
        return this.a.N1 != 0;
    }
}
