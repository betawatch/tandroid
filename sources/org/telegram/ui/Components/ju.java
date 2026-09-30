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

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class ju implements ny {
    public final /* synthetic */ lu a;

    public ju(lu luVar) {
        this.a = luVar;
    }

    @Override // org.telegram.ui.Components.ny
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.Components.ny
    public final /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Components.ny
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Components.ny
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Components.ny
    public final /* synthetic */ int f() {
        return 0;
    }

    @Override // org.telegram.ui.Components.ny
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.Components.ny
    public final void i(int i10) {
        lu luVar = this.a;
        if (luVar.b()) {
            luVar.x = i10 != 0;
            luVar.y();
            cw0 cw0Var = luVar.f;
            if (cw0Var != null) {
                cw0Var.S();
            }
        }
    }

    @Override // org.telegram.ui.Components.ny
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.ny
    public final boolean k() {
        gu guVar = this.a.a;
        if (guVar.length() == 0) {
            return false;
        }
        guVar.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // org.telegram.ui.Components.ny
    public final void l(String str) {
        gu guVar = this.a.a;
        int selectionEnd = guVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence replaceEmoji = Emoji.replaceEmoji(str, guVar.getPaint().getFontMetricsInt(), false);
            guVar.setText(guVar.getText().insert(selectionEnd, replaceEmoji));
            int length = selectionEnd + replaceEmoji.length();
            guVar.setSelection(length, length);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Components.ny
    public final void n() {
        lu luVar = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(luVar.getContext(), 0, luVar.M);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.ClearRecentEmojiTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.ClearRecentEmojiText);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new s(this, 29));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.m2 m2Var = luVar.h;
        if (m2Var != null) {
            m2Var.showDialog(alertDialog$Builder.a);
        } else {
            alertDialog$Builder.o();
        }
    }

    @Override // org.telegram.ui.Components.ny
    public final /* synthetic */ float p() {
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.ny
    public final void q() {
        org.telegram.ui.ActionBar.m2 m2Var = this.a.h;
        if (m2Var == null) {
            new rg.x0((org.telegram.ui.ActionBar.m2) new ai.y3(this, 4), 11, false).show();
        } else {
            m2Var.showDialog(new rg.x0(m2Var, 11, false));
        }
    }

    @Override // org.telegram.ui.Components.ny
    public final void x(long j3, TLRPC.Document document, String str, boolean z10) {
        lu luVar = this.a;
        gu guVar = luVar.a;
        int selectionEnd = guVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            z5 z5Var = document != null ? new z5(document, guVar.getPaint().getFontMetricsInt()) : new z5(j3, guVar.getPaint().getFontMetricsInt());
            z5Var.cacheType = luVar.d.c;
            spannableString.setSpan(z5Var, 0, spannableString.length(), 33);
            guVar.setText(guVar.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            guVar.setSelection(length, length);
        } catch (Exception e) {
            FileLog.e(e);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // org.telegram.ui.Components.ny
    public final boolean z() {
        return this.a.x;
    }

    @Override // org.telegram.ui.Components.ny
    public final /* synthetic */ void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.ny
    public final /* synthetic */ void o(t51 t51Var) {
    }

    @Override // org.telegram.ui.Components.ny
    public final /* synthetic */ void r(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.ny
    public final /* synthetic */ void s(int i10) {
    }

    @Override // org.telegram.ui.Components.ny
    public final /* synthetic */ void t(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.ny
    public final /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Components.ny
    public final /* synthetic */ void w() {
    }

    @Override // org.telegram.ui.Components.ny
    public final /* synthetic */ void y(long j3) {
    }

    @Override // org.telegram.ui.Components.ny
    public final /* synthetic */ void e(Object obj, Object obj2) {
    }

    @Override // org.telegram.ui.Components.ny
    public final /* synthetic */ void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.Components.ny
    public final /* synthetic */ void m(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10) {
    }

    @Override // org.telegram.ui.Components.ny
    public final /* synthetic */ void v(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11) {
    }
}
