package org.telegram.ui.Components;

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class ou implements uy {
    public final /* synthetic */ qu a;

    public ou(qu quVar) {
        this.a = quVar;
    }

    @Override // org.telegram.ui.Components.uy
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.Components.uy
    public final /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Components.uy
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Components.uy
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Components.uy
    public final /* synthetic */ int f() {
        return 0;
    }

    @Override // org.telegram.ui.Components.uy
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.Components.uy
    public final void i(int i10) {
        qu quVar = this.a;
        if (quVar.b()) {
            quVar.x = i10 != 0;
            quVar.y();
            jw0 jw0Var = quVar.f;
            if (jw0Var != null) {
                jw0Var.S();
            }
        }
    }

    @Override // org.telegram.ui.Components.uy
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.uy
    public final boolean k() {
        lu luVar = this.a.a;
        if (luVar.length() == 0) {
            return false;
        }
        luVar.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // org.telegram.ui.Components.uy
    public final void l(String str) {
        lu luVar = this.a.a;
        int selectionEnd = luVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence replaceEmoji = Emoji.replaceEmoji(str, luVar.getPaint().getFontMetricsInt(), false);
            luVar.setText(luVar.getText().insert(selectionEnd, replaceEmoji));
            int length = selectionEnd + replaceEmoji.length();
            luVar.setSelection(length, length);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Components.uy
    public final void n() {
        qu quVar = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(quVar.getContext(), 0, quVar.M);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.ClearRecentEmojiTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.ClearRecentEmojiText);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new s(this, 29));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.n2 n2Var = quVar.h;
        if (n2Var != null) {
            n2Var.showDialog(alertDialog$Builder.a);
        } else {
            alertDialog$Builder.o();
        }
    }

    @Override // org.telegram.ui.Components.uy
    public final /* synthetic */ float p() {
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.uy
    public final void q() {
        org.telegram.ui.ActionBar.n2 n2Var = this.a.h;
        if (n2Var == null) {
            new sg.x0((org.telegram.ui.ActionBar.n2) new ai.z4(this, 5), 11, false).show();
        } else {
            n2Var.showDialog(new sg.x0(n2Var, 11, false));
        }
    }

    @Override // org.telegram.ui.Components.uy
    public final void x(long j10, TLRPC.Document document, String str, boolean z10) {
        qu quVar = this.a;
        lu luVar = quVar.a;
        int selectionEnd = luVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            a6 a6Var = document != null ? new a6(document, luVar.getPaint().getFontMetricsInt()) : new a6(j10, luVar.getPaint().getFontMetricsInt());
            a6Var.cacheType = quVar.d.c;
            spannableString.setSpan(a6Var, 0, spannableString.length(), 33);
            luVar.setText(luVar.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            luVar.setSelection(length, length);
        } catch (Exception e) {
            FileLog.e(e);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // org.telegram.ui.Components.uy
    public final boolean z() {
        return this.a.x;
    }

    @Override // org.telegram.ui.Components.uy
    public final /* synthetic */ void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.uy
    public final /* synthetic */ void o(b61 b61Var) {
    }

    @Override // org.telegram.ui.Components.uy
    public final /* synthetic */ void r(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.uy
    public final /* synthetic */ void s(int i10) {
    }

    @Override // org.telegram.ui.Components.uy
    public final /* synthetic */ void t(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.uy
    public final /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Components.uy
    public final /* synthetic */ void w() {
    }

    @Override // org.telegram.ui.Components.uy
    public final /* synthetic */ void y(long j10) {
    }

    @Override // org.telegram.ui.Components.uy
    public final /* synthetic */ void e(Object obj, Object obj2) {
    }

    @Override // org.telegram.ui.Components.uy
    public final /* synthetic */ void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.Components.uy
    public final /* synthetic */ void m(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10) {
    }

    @Override // org.telegram.ui.Components.uy
    public final /* synthetic */ void v(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11) {
    }
}
