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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class xf implements wx {
    public final /* synthetic */ ChatActivityEnterView a;

    public xf(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.wx
    public final boolean A() {
        return this.a.u3;
    }

    public final void B(View view, Object obj, String str, Object obj2, boolean z10, int i9, int i10, MediaController.PhotoEntry photoEntry, boolean z11) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        mg mgVar = chatActivityEnterView.B0;
        org.telegram.ui.qn qnVar = chatActivityEnterView.K2;
        org.telegram.ui.gn gnVar = chatActivityEnterView.Q2;
        if (gnVar != null && qnVar != null && gnVar.f) {
            qnVar.Rb();
            return;
        }
        if (c() && i9 == 0) {
            y4.M(chatActivityEnterView.J2, qnVar.a(), new org.telegram.ui.hq(this, view, obj, str, obj2, photoEntry, z11), chatActivityEnterView.R3);
            return;
        }
        if (chatActivityEnterView.C0 <= 0 || c()) {
            y4.a0(chatActivityEnterView.M, 1, chatActivityEnterView.L2, new vd(this, obj, photoEntry, z10, i9, i10, z11, str, obj2));
            return;
        }
        eg egVar = chatActivityEnterView.U2;
        if (egVar != null) {
            egVar.k1(view != null ? view : mgVar, mgVar.a.getText(), true);
        }
    }

    @Override // org.telegram.ui.Components.wx
    public final long a() {
        return this.a.L2;
    }

    @Override // org.telegram.ui.Components.wx
    public final boolean b() {
        org.telegram.ui.qn qnVar = this.a.K2;
        return qnVar != null && qnVar.D6();
    }

    @Override // org.telegram.ui.Components.wx
    public final boolean c() {
        org.telegram.ui.qn qnVar = this.a.K2;
        return qnVar != null && qnVar.c();
    }

    @Override // org.telegram.ui.Components.wx
    public final void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        wf wfVar = chatActivityEnterView.V2;
        if (wfVar != null && !wfVar.isDismissed()) {
            chatActivityEnterView.V2.e.b(stickerSet, inputStickerSet);
            return;
        }
        org.telegram.ui.ActionBar.o2 o2Var = chatActivityEnterView.K2;
        if (o2Var == null) {
            o2Var = LaunchActivity.R();
        }
        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
        if (o2Var2 == null || chatActivityEnterView.J2 == null) {
            return;
        }
        if (stickerSet != null) {
            inputStickerSet = new TLRPC.TL_inputStickerSetID();
            inputStickerSet.access_hash = stickerSet.access_hash;
            inputStickerSet.id = stickerSet.id;
        }
        cx0 cx0Var = new cx0(chatActivityEnterView.J2, o2Var2, inputStickerSet, null, chatActivityEnterView, chatActivityEnterView.R3);
        o2Var2.showDialog(cx0Var);
        if (z10) {
            cx0Var.o0();
        }
    }

    @Override // org.telegram.ui.Components.wx
    public final void e(Object obj, Object obj2) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        org.telegram.ui.qn qnVar = chatActivityEnterView.K2;
        if (qnVar == null) {
            return;
        }
        PhotoViewer.t1().K2(null, qnVar, qnVar.aa);
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
        PhotoViewer.t1().f2(arrayList, 0, 12, false, new vf(this, obj, obj2, photoEntry), chatActivityEnterView.K2);
    }

    @Override // org.telegram.ui.Components.wx
    public final int f() {
        int threadMessageId;
        threadMessageId = this.a.getThreadMessageId();
        return threadMessageId;
    }

    @Override // org.telegram.ui.Components.wx
    public final boolean g() {
        ChatActivityEnterView chatActivityEnterView = this.a;
        return chatActivityEnterView.L2 == UserConfig.getInstance(chatActivityEnterView.M).getClientUserId();
    }

    @Override // org.telegram.ui.Components.wx
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        MediaDataController.getInstance(chatActivityEnterView.M).toggleStickerSet(chatActivityEnterView.J2, stickerSetCovered, 0, chatActivityEnterView.K2, false, false);
    }

    @Override // org.telegram.ui.Components.wx
    public final void i(int i9) {
        int i10 = ChatActivityEnterView.i5;
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.m1(i9, true);
        if (i9 != 0) {
            chatActivityEnterView.n1(true, true, false, i9 == 1);
        }
        if (chatActivityEnterView.t3 && chatActivityEnterView.M1 == 2) {
            chatActivityEnterView.K();
        }
    }

    @Override // org.telegram.ui.Components.wx
    public final boolean j() {
        return true;
    }

    @Override // org.telegram.ui.Components.wx
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

    @Override // org.telegram.ui.Components.wx
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
        } catch (Exception e10) {
            FileLog.e(e10);
        } finally {
            chatActivityEnterView.N2 = 0;
        }
    }

    @Override // org.telegram.ui.Components.wx
    public final void m(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i9) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        mg mgVar = chatActivityEnterView.B0;
        if (chatActivityEnterView.g5) {
            return;
        }
        wf wfVar = chatActivityEnterView.V2;
        if (wfVar != null) {
            wfVar.dismiss();
            chatActivityEnterView.V2 = null;
        }
        if (chatActivityEnterView.C0 > 0 && !c()) {
            eg egVar = chatActivityEnterView.U2;
            if (egVar != null) {
                if (view == null) {
                    view = mgVar;
                }
                egVar.k1(view, mgVar.a.getText(), true);
                return;
            }
            return;
        }
        if (chatActivityEnterView.u3) {
            if (chatActivityEnterView.M1 != 0) {
                chatActivityEnterView.m1(0, true);
                chatActivityEnterView.Q0.s(MessageObject.getStickerSetId(document), true);
                chatActivityEnterView.Q0.A();
            }
            chatActivityEnterView.n1(false, true, false, true);
        }
        chatActivityEnterView.a(document, str, obj, sendAnimationData, false, z10, i9, 0);
        if (DialogObject.isEncryptedDialog(chatActivityEnterView.L2) && MessageObject.isGifDocument(document)) {
            chatActivityEnterView.N.getMessagesController().saveGif(obj, document);
        }
    }

    @Override // org.telegram.ui.Components.wx
    public final void n() {
        Activity activity;
        ChatActivityEnterView chatActivityEnterView = this.a;
        org.telegram.ui.qn qnVar = chatActivityEnterView.K2;
        if (qnVar == null || (activity = chatActivityEnterView.J2) == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, chatActivityEnterView.R3);
        alertDialog$Builder.a.N = LocaleController.getString(R.string.ClearRecentEmojiTitle);
        alertDialog$Builder.a.P = LocaleController.getString(R.string.ClearRecentEmojiText);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new s(this, 17));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        qnVar.showDialog(alertDialog$Builder.a);
    }

    @Override // org.telegram.ui.Components.wx
    public final void o(h41 h41Var) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        org.telegram.ui.ActionBar.o2 o2Var = chatActivityEnterView.K2;
        if (o2Var == null) {
            o2Var = LaunchActivity.R();
        }
        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
        if (o2Var2 != null) {
            chatActivityEnterView.V2 = new wf(this, chatActivityEnterView.getContext(), o2Var2, h41Var, chatActivityEnterView.R3);
            eg egVar = chatActivityEnterView.U2;
            if (egVar != null) {
                egVar.p(true);
            }
            o2Var2.showDialog(chatActivityEnterView.V2);
        }
    }

    @Override // org.telegram.ui.Components.wx
    public final float p() {
        return this.a.s0;
    }

    @Override // org.telegram.ui.Components.wx
    public final void q() {
        org.telegram.ui.ActionBar.o2 o2Var = this.a.K2;
        if (o2Var == null) {
            o2Var = LaunchActivity.R();
        }
        o2Var.showDialog(new zf.x0(o2Var, 11, false));
    }

    @Override // org.telegram.ui.Components.wx
    public final void r(TLRPC.StickerSetCovered stickerSetCovered) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        MediaDataController.getInstance(chatActivityEnterView.M).toggleStickerSet(chatActivityEnterView.J2, stickerSetCovered, 2, chatActivityEnterView.K2, false, false);
    }

    @Override // org.telegram.ui.Components.wx
    public final void s(int i9) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.U2.G();
        chatActivityEnterView.U2.T1(i9 == 3);
        chatActivityEnterView.post(chatActivityEnterView.n3);
    }

    @Override // org.telegram.ui.Components.wx
    public final void t(ArrayList arrayList) {
        org.telegram.ui.qn qnVar = this.a.K2;
        if (qnVar != null) {
            qnVar.presentFragment(new StickersActivity(5, arrayList));
        }
    }

    @Override // org.telegram.ui.Components.wx
    public final void u() {
        this.a.invalidate();
    }

    @Override // org.telegram.ui.Components.wx
    public final void v(View view, Object obj, String str, Object obj2, boolean z10, int i9, int i10) {
        B(view, obj, str, obj2, z10, i9, i10, null, false);
    }

    @Override // org.telegram.ui.Components.wx
    public final void w() {
        org.telegram.ui.qn qnVar = this.a.K2;
        if (qnVar != null) {
            qnVar.presentFragment(new StickersActivity(0, null));
        }
    }

    @Override // org.telegram.ui.Components.wx
    public final void x(long j10, TLRPC.Document document, String str, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        EditTextBoldCursor editTextBoldCursor = chatActivityEnterView.P4;
        if (editTextBoldCursor == null) {
            editTextBoldCursor = chatActivityEnterView.A0;
        }
        AndroidUtilities.runOnUIThread(new gh.i(this, editTextBoldCursor, str, document, j10, z10));
    }

    @Override // org.telegram.ui.Components.wx
    public final void y(long j10) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        org.telegram.ui.qn qnVar = chatActivityEnterView.K2;
        if (qnVar != null) {
            if (AndroidUtilities.isTablet()) {
                chatActivityEnterView.l0(false);
            }
            org.telegram.ui.z60 z60Var = new org.telegram.ui.z60(j10);
            z60Var.d0(chatActivityEnterView.Y1);
            qnVar.presentFragment(z60Var);
        }
    }

    @Override // org.telegram.ui.Components.wx
    public final boolean z() {
        return this.a.M1 != 0;
    }
}
