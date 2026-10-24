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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class gg implements uy {
    public final /* synthetic */ ChatActivityEnterView a;

    public gg(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.uy
    public final boolean A() {
        return this.a.z3;
    }

    public final void B(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11, MediaController.PhotoEntry photoEntry, boolean z11) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        wg wgVar = chatActivityEnterView.F0;
        org.telegram.ui.sn snVar = chatActivityEnterView.P2;
        org.telegram.ui.in inVar = chatActivityEnterView.V2;
        if (inVar != null && snVar != null && inVar.f) {
            snVar.Xb();
            return;
        }
        if (c() && i10 == 0) {
            f5.M(chatActivityEnterView.O2, snVar.a(), new org.telegram.ui.jq(this, view, obj, str, obj2, photoEntry, z11), chatActivityEnterView.W3);
            return;
        }
        if (chatActivityEnterView.G0 <= 0 || c()) {
            f5.a0(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new fe(this, obj, photoEntry, z10, i10, i11, z11, str, obj2));
            return;
        }
        og ogVar = chatActivityEnterView.Z2;
        if (ogVar != null) {
            ogVar.o1(view != null ? view : wgVar, wgVar.a.getText(), true);
        }
    }

    @Override // org.telegram.ui.Components.uy
    public final long a() {
        return this.a.Q2;
    }

    @Override // org.telegram.ui.Components.uy
    public final boolean b() {
        org.telegram.ui.sn snVar = this.a.P2;
        return snVar != null && snVar.G6();
    }

    @Override // org.telegram.ui.Components.uy
    public final boolean c() {
        org.telegram.ui.sn snVar = this.a.P2;
        return snVar != null && snVar.c();
    }

    @Override // org.telegram.ui.Components.uy
    public final void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        fg fgVar = chatActivityEnterView.a3;
        if (fgVar != null && !fgVar.isDismissed()) {
            chatActivityEnterView.a3.d.b(stickerSet, inputStickerSet);
            return;
        }
        org.telegram.ui.ActionBar.o2 o2Var = chatActivityEnterView.P2;
        if (o2Var == null) {
            o2Var = LaunchActivity.R();
        }
        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
        if (o2Var2 == null || chatActivityEnterView.O2 == null) {
            return;
        }
        if (stickerSet != null) {
            inputStickerSet = new TLRPC.TL_inputStickerSetID();
            inputStickerSet.access_hash = stickerSet.access_hash;
            inputStickerSet.id = stickerSet.id;
        }
        ty0 ty0Var = new ty0(chatActivityEnterView.O2, o2Var2, inputStickerSet, null, chatActivityEnterView, chatActivityEnterView.W3);
        o2Var2.showDialog(ty0Var);
        if (z10) {
            ty0Var.r0();
        }
    }

    @Override // org.telegram.ui.Components.uy
    public final void e(Object obj, Object obj2) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        org.telegram.ui.sn snVar = chatActivityEnterView.P2;
        if (snVar == null) {
            return;
        }
        PhotoViewer.u1().M2(null, snVar, snVar.qa);
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
        PhotoViewer.u1().i2(arrayList, 0, 12, false, new eg(this, obj, obj2, photoEntry), chatActivityEnterView.P2);
    }

    @Override // org.telegram.ui.Components.uy
    public final int f() {
        int threadMessageId;
        threadMessageId = this.a.getThreadMessageId();
        return threadMessageId;
    }

    @Override // org.telegram.ui.Components.uy
    public final boolean g() {
        ChatActivityEnterView chatActivityEnterView = this.a;
        return chatActivityEnterView.Q2 == UserConfig.getInstance(chatActivityEnterView.Q).getClientUserId();
    }

    @Override // org.telegram.ui.Components.uy
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        MediaDataController.getInstance(chatActivityEnterView.Q).toggleStickerSet(chatActivityEnterView.O2, stickerSetCovered, 0, chatActivityEnterView.P2, false, false);
    }

    @Override // org.telegram.ui.Components.uy
    public final void i(int i10) {
        int i11 = ChatActivityEnterView.r5;
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.j1(i10, true);
        if (i10 != 0) {
            chatActivityEnterView.k1(true, true, false, i10 == 1);
        }
        if (chatActivityEnterView.y3 && chatActivityEnterView.R1 == 2) {
            chatActivityEnterView.I();
        }
    }

    @Override // org.telegram.ui.Components.uy
    public final boolean j() {
        return true;
    }

    @Override // org.telegram.ui.Components.uy
    public final boolean k() {
        ChatActivityEnterView chatActivityEnterView = this.a;
        TextView textView = chatActivityEnterView.Y4;
        if (textView == null) {
            textView = chatActivityEnterView.E0;
        }
        if (textView == null || textView.length() == 0) {
            return false;
        }
        textView.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // org.telegram.ui.Components.uy
    public final void l(String str) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        EditText editText = chatActivityEnterView.Y4;
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

    @Override // org.telegram.ui.Components.uy
    public final void m(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        wg wgVar = chatActivityEnterView.F0;
        if (chatActivityEnterView.p5) {
            return;
        }
        fg fgVar = chatActivityEnterView.a3;
        if (fgVar != null) {
            fgVar.dismiss();
            chatActivityEnterView.a3 = null;
        }
        if (chatActivityEnterView.G0 > 0 && !c()) {
            og ogVar = chatActivityEnterView.Z2;
            if (ogVar != null) {
                if (view == null) {
                    view = wgVar;
                }
                ogVar.o1(view, wgVar.a.getText(), true);
                return;
            }
            return;
        }
        if (chatActivityEnterView.z3) {
            if (chatActivityEnterView.R1 != 0) {
                chatActivityEnterView.j1(0, true);
                chatActivityEnterView.U0.t(MessageObject.getStickerSetId(document), true);
                chatActivityEnterView.U0.B();
            }
            chatActivityEnterView.k1(false, true, false, true);
        }
        chatActivityEnterView.a(document, str, obj, sendAnimationData, false, z10, i10, 0);
        if (DialogObject.isEncryptedDialog(chatActivityEnterView.Q2) && MessageObject.isGifDocument(document)) {
            chatActivityEnterView.R.getMessagesController().saveGif(obj, document);
        }
    }

    @Override // org.telegram.ui.Components.uy
    public final void n() {
        Activity activity;
        ChatActivityEnterView chatActivityEnterView = this.a;
        org.telegram.ui.sn snVar = chatActivityEnterView.P2;
        if (snVar == null || (activity = chatActivityEnterView.O2) == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, chatActivityEnterView.W3);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.ClearRecentEmojiTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.ClearRecentEmojiText);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new s(this, 17));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        snVar.showDialog(alertDialog$Builder.a);
    }

    @Override // org.telegram.ui.Components.uy
    public final void o(i61 i61Var) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        org.telegram.ui.ActionBar.o2 o2Var = chatActivityEnterView.P2;
        if (o2Var == null) {
            o2Var = LaunchActivity.R();
        }
        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
        if (o2Var2 != null) {
            chatActivityEnterView.a3 = new fg(this, chatActivityEnterView.getContext(), o2Var2, i61Var, chatActivityEnterView.W3);
            og ogVar = chatActivityEnterView.Z2;
            if (ogVar != null) {
                ogVar.C(true);
            }
            o2Var2.showDialog(chatActivityEnterView.a3);
        }
    }

    @Override // org.telegram.ui.Components.uy
    public final float p() {
        return this.a.w0;
    }

    @Override // org.telegram.ui.Components.uy
    public final void q() {
        org.telegram.ui.ActionBar.o2 o2Var = this.a.P2;
        if (o2Var == null) {
            o2Var = LaunchActivity.R();
        }
        o2Var.showDialog(new sg.y0(o2Var, 11, false));
    }

    @Override // org.telegram.ui.Components.uy
    public final void r(TLRPC.StickerSetCovered stickerSetCovered) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        MediaDataController.getInstance(chatActivityEnterView.Q).toggleStickerSet(chatActivityEnterView.O2, stickerSetCovered, 2, chatActivityEnterView.P2, false, false);
    }

    @Override // org.telegram.ui.Components.uy
    public final void s(int i10) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.Z2.Y();
        chatActivityEnterView.Z2.Z1(i10 == 3);
        chatActivityEnterView.post(chatActivityEnterView.s3);
    }

    @Override // org.telegram.ui.Components.uy
    public final void t(ArrayList arrayList) {
        org.telegram.ui.sn snVar = this.a.P2;
        if (snVar != null) {
            snVar.presentFragment(new StickersActivity(5, arrayList));
        }
    }

    @Override // org.telegram.ui.Components.uy
    public final void u() {
        this.a.invalidate();
    }

    @Override // org.telegram.ui.Components.uy
    public final void v(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11) {
        B(view, obj, str, obj2, z10, i10, i11, null, false);
    }

    @Override // org.telegram.ui.Components.uy
    public final void w() {
        org.telegram.ui.sn snVar = this.a.P2;
        if (snVar != null) {
            snVar.presentFragment(new StickersActivity(0, null));
        }
    }

    @Override // org.telegram.ui.Components.uy
    public final void x(long j10, TLRPC.Document document, String str, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        EditTextBoldCursor editTextBoldCursor = chatActivityEnterView.Y4;
        if (editTextBoldCursor == null) {
            editTextBoldCursor = chatActivityEnterView.E0;
        }
        AndroidUtilities.runOnUIThread(new ai.m(this, editTextBoldCursor, str, document, j10, z10));
    }

    @Override // org.telegram.ui.Components.uy
    public final void y(long j10) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        org.telegram.ui.sn snVar = chatActivityEnterView.P2;
        if (snVar != null) {
            if (AndroidUtilities.isTablet()) {
                chatActivityEnterView.j0(false);
            }
            org.telegram.ui.e70 e70Var = new org.telegram.ui.e70(j10);
            e70Var.e0(chatActivityEnterView.d2);
            snVar.presentFragment(e70Var);
        }
    }

    @Override // org.telegram.ui.Components.uy
    public final boolean z() {
        return this.a.R1 != 0;
    }
}
