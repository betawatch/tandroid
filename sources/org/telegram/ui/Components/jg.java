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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class jg implements sy {
    public final /* synthetic */ ChatActivityEnterView a;

    public jg(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.sy
    public final boolean A() {
        return this.a.y3;
    }

    public final void B(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11, MediaController.PhotoEntry photoEntry, boolean z11) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        yg ygVar = chatActivityEnterView.F0;
        org.telegram.ui.eo eoVar = chatActivityEnterView.O2;
        org.telegram.ui.tn tnVar = chatActivityEnterView.U2;
        if (tnVar != null && eoVar != null && tnVar.f) {
            eoVar.Rb();
            return;
        }
        if (c() && i10 == 0) {
            d5.M(chatActivityEnterView.N2, eoVar.a(), new org.telegram.ui.xq(this, view, obj, str, obj2, photoEntry, z11), chatActivityEnterView.V3);
            return;
        }
        if (chatActivityEnterView.G0 <= 0 || c()) {
            d5.a0(chatActivityEnterView.Q, 1, chatActivityEnterView.P2, new fe(this, obj, photoEntry, z10, i10, i11, z11, str, obj2));
            return;
        }
        qg qgVar = chatActivityEnterView.Y2;
        if (qgVar != null) {
            qgVar.s1(view != null ? view : ygVar, ygVar.a.getText(), true);
        }
    }

    @Override // org.telegram.ui.Components.sy
    public final long a() {
        return this.a.P2;
    }

    @Override // org.telegram.ui.Components.sy
    public final boolean b() {
        org.telegram.ui.eo eoVar = this.a.O2;
        return eoVar != null && eoVar.D6();
    }

    @Override // org.telegram.ui.Components.sy
    public final boolean c() {
        org.telegram.ui.eo eoVar = this.a.O2;
        return eoVar != null && eoVar.c();
    }

    @Override // org.telegram.ui.Components.sy
    public final void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        ig igVar = chatActivityEnterView.Z2;
        if (igVar != null && !igVar.isDismissed()) {
            chatActivityEnterView.Z2.e.b(stickerSet, inputStickerSet);
            return;
        }
        org.telegram.ui.ActionBar.p2 p2Var = chatActivityEnterView.O2;
        if (p2Var == null) {
            p2Var = LaunchActivity.R();
        }
        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
        if (p2Var2 == null || chatActivityEnterView.N2 == null) {
            return;
        }
        if (stickerSet != null) {
            inputStickerSet = new TLRPC.TL_inputStickerSetID();
            inputStickerSet.access_hash = stickerSet.access_hash;
            inputStickerSet.id = stickerSet.id;
        }
        hy0 hy0Var = new hy0(chatActivityEnterView.N2, p2Var2, inputStickerSet, null, chatActivityEnterView, chatActivityEnterView.V3);
        p2Var2.showDialog(hy0Var);
        if (z10) {
            hy0Var.p0();
        }
    }

    @Override // org.telegram.ui.Components.sy
    public final void e(Object obj, Object obj2) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        org.telegram.ui.eo eoVar = chatActivityEnterView.O2;
        if (eoVar == null) {
            return;
        }
        PhotoViewer.t1().K2(null, eoVar, eoVar.ea);
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
        PhotoViewer.t1().f2(arrayList, 0, 12, false, new hg(this, obj, obj2, photoEntry), chatActivityEnterView.O2);
    }

    @Override // org.telegram.ui.Components.sy
    public final int f() {
        int threadMessageId;
        threadMessageId = this.a.getThreadMessageId();
        return threadMessageId;
    }

    @Override // org.telegram.ui.Components.sy
    public final boolean g() {
        ChatActivityEnterView chatActivityEnterView = this.a;
        return chatActivityEnterView.P2 == UserConfig.getInstance(chatActivityEnterView.Q).getClientUserId();
    }

    @Override // org.telegram.ui.Components.sy
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        MediaDataController.getInstance(chatActivityEnterView.Q).toggleStickerSet(chatActivityEnterView.N2, stickerSetCovered, 0, chatActivityEnterView.O2, false, false);
    }

    @Override // org.telegram.ui.Components.sy
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

    @Override // org.telegram.ui.Components.sy
    public final boolean j() {
        return true;
    }

    @Override // org.telegram.ui.Components.sy
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

    @Override // org.telegram.ui.Components.sy
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
        } catch (Exception e) {
            FileLog.e(e);
        } finally {
            chatActivityEnterView.R2 = 0;
        }
    }

    @Override // org.telegram.ui.Components.sy
    public final void m(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        yg ygVar = chatActivityEnterView.F0;
        if (chatActivityEnterView.k5) {
            return;
        }
        ig igVar = chatActivityEnterView.Z2;
        if (igVar != null) {
            igVar.dismiss();
            chatActivityEnterView.Z2 = null;
        }
        if (chatActivityEnterView.G0 > 0 && !c()) {
            qg qgVar = chatActivityEnterView.Y2;
            if (qgVar != null) {
                if (view == null) {
                    view = ygVar;
                }
                qgVar.s1(view, ygVar.a.getText(), true);
                return;
            }
            return;
        }
        if (chatActivityEnterView.y3) {
            if (chatActivityEnterView.Q1 != 0) {
                chatActivityEnterView.m1(0, true);
                chatActivityEnterView.U0.s(MessageObject.getStickerSetId(document), true);
                chatActivityEnterView.U0.A();
            }
            chatActivityEnterView.n1(false, true, false, true);
        }
        chatActivityEnterView.d(document, str, obj, sendAnimationData, false, z10, i10, 0);
        if (DialogObject.isEncryptedDialog(chatActivityEnterView.P2) && MessageObject.isGifDocument(document)) {
            chatActivityEnterView.R.getMessagesController().saveGif(obj, document);
        }
    }

    @Override // org.telegram.ui.Components.sy
    public final void n() {
        Activity activity;
        ChatActivityEnterView chatActivityEnterView = this.a;
        org.telegram.ui.eo eoVar = chatActivityEnterView.O2;
        if (eoVar == null || (activity = chatActivityEnterView.N2) == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, chatActivityEnterView.V3);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.ClearRecentEmojiTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.ClearRecentEmojiText);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new t(this, 17));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        eoVar.showDialog(alertDialog$Builder.a);
    }

    @Override // org.telegram.ui.Components.sy
    public final void o(r51 r51Var) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        org.telegram.ui.ActionBar.p2 p2Var = chatActivityEnterView.O2;
        if (p2Var == null) {
            p2Var = LaunchActivity.R();
        }
        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
        if (p2Var2 != null) {
            chatActivityEnterView.Z2 = new ig(this, chatActivityEnterView.getContext(), p2Var2, r51Var, chatActivityEnterView.V3);
            qg qgVar = chatActivityEnterView.Y2;
            if (qgVar != null) {
                qgVar.B(true);
            }
            p2Var2.showDialog(chatActivityEnterView.Z2);
        }
    }

    @Override // org.telegram.ui.Components.sy
    public final float p() {
        return this.a.w0;
    }

    @Override // org.telegram.ui.Components.sy
    public final void q() {
        org.telegram.ui.ActionBar.p2 p2Var = this.a.O2;
        if (p2Var == null) {
            p2Var = LaunchActivity.R();
        }
        p2Var.showDialog(new qg.a1(p2Var, 11, false));
    }

    @Override // org.telegram.ui.Components.sy
    public final void r(TLRPC.StickerSetCovered stickerSetCovered) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        MediaDataController.getInstance(chatActivityEnterView.Q).toggleStickerSet(chatActivityEnterView.N2, stickerSetCovered, 2, chatActivityEnterView.O2, false, false);
    }

    @Override // org.telegram.ui.Components.sy
    public final void s(int i10) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.Y2.W();
        chatActivityEnterView.Y2.h2(i10 == 3);
        chatActivityEnterView.post(chatActivityEnterView.r3);
    }

    @Override // org.telegram.ui.Components.sy
    public final void t(ArrayList arrayList) {
        org.telegram.ui.eo eoVar = this.a.O2;
        if (eoVar != null) {
            eoVar.presentFragment(new StickersActivity(5, arrayList));
        }
    }

    @Override // org.telegram.ui.Components.sy
    public final void u() {
        this.a.invalidate();
    }

    @Override // org.telegram.ui.Components.sy
    public final void v(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11) {
        B(view, obj, str, obj2, z10, i10, i11, null, false);
    }

    @Override // org.telegram.ui.Components.sy
    public final void w() {
        org.telegram.ui.eo eoVar = this.a.O2;
        if (eoVar != null) {
            eoVar.presentFragment(new StickersActivity(0, null));
        }
    }

    @Override // org.telegram.ui.Components.sy
    public final void x(long j3, TLRPC.Document document, String str, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        EditTextBoldCursor editTextBoldCursor = chatActivityEnterView.T4;
        if (editTextBoldCursor == null) {
            editTextBoldCursor = chatActivityEnterView.E0;
        }
        AndroidUtilities.runOnUIThread(new gg(this, editTextBoldCursor, str, document, j3, z10));
    }

    @Override // org.telegram.ui.Components.sy
    public final void y(long j3) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        org.telegram.ui.eo eoVar = chatActivityEnterView.O2;
        if (eoVar != null) {
            if (AndroidUtilities.isTablet()) {
                chatActivityEnterView.m0(false);
            }
            org.telegram.ui.s70 s70Var = new org.telegram.ui.s70(j3);
            s70Var.e0(chatActivityEnterView.c2);
            eoVar.presentFragment(s70Var);
        }
    }

    @Override // org.telegram.ui.Components.sy
    public final boolean z() {
        return this.a.Q1 != 0;
    }
}
