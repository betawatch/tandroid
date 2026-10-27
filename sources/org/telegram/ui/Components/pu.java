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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class pu implements ty {
    public final /* synthetic */ ru a;

    public pu(ru ruVar) {
        this.a = ruVar;
    }

    @Override // org.telegram.ui.Components.ty
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.Components.ty
    public final /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Components.ty
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Components.ty
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Components.ty
    public final /* synthetic */ int f() {
        return 0;
    }

    @Override // org.telegram.ui.Components.ty
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.Components.ty
    public final void i(int i10) {
        ru ruVar = this.a;
        if (ruVar.b()) {
            ruVar.x = i10 != 0;
            ruVar.y();
            ww0 ww0Var = ruVar.f;
            if (ww0Var != null) {
                ww0Var.R();
            }
        }
    }

    @Override // org.telegram.ui.Components.ty
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.ty
    public final boolean k() {
        mu muVar = this.a.a;
        if (muVar.length() == 0) {
            return false;
        }
        muVar.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // org.telegram.ui.Components.ty
    public final void l(String str) {
        mu muVar = this.a.a;
        int selectionEnd = muVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence replaceEmoji = Emoji.replaceEmoji(str, muVar.getPaint().getFontMetricsInt(), false);
            muVar.setText(muVar.getText().insert(selectionEnd, replaceEmoji));
            int length = selectionEnd + replaceEmoji.length();
            muVar.setSelection(length, length);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Components.ty
    public final void n() {
        ru ruVar = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ruVar.getContext(), 0, ruVar.M);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.ClearRecentEmojiTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.ClearRecentEmojiText);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new s(this, 29));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.r2 r2Var = ruVar.h;
        if (r2Var != null) {
            r2Var.showDialog(alertDialog$Builder.a);
        } else {
            alertDialog$Builder.p();
        }
    }

    @Override // org.telegram.ui.Components.ty
    public final /* synthetic */ float p() {
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.ty
    public final void q() {
        org.telegram.ui.ActionBar.r2 r2Var = this.a.h;
        if (r2Var == null) {
            new tg.y0((org.telegram.ui.ActionBar.r2) new bi.v4(this, 5), 11, false).show();
        } else {
            r2Var.showDialog(new tg.y0(r2Var, 11, false));
        }
    }

    @Override // org.telegram.ui.Components.ty
    public final void x(long j10, TLRPC.Document document, String str, boolean z10) {
        ru ruVar = this.a;
        mu muVar = ruVar.a;
        int selectionEnd = muVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            c6 c6Var = document != null ? new c6(document, muVar.getPaint().getFontMetricsInt()) : new c6(j10, muVar.getPaint().getFontMetricsInt());
            c6Var.cacheType = ruVar.d.c;
            spannableString.setSpan(c6Var, 0, spannableString.length(), 33);
            muVar.setText(muVar.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            muVar.setSelection(length, length);
        } catch (Exception e) {
            FileLog.e(e);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // org.telegram.ui.Components.ty
    public final boolean z() {
        return this.a.x;
    }

    @Override // org.telegram.ui.Components.ty
    public final /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Components.ty
    public final /* synthetic */ void w() {
    }

    @Override // org.telegram.ui.Components.ty
    public final /* synthetic */ void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.ty
    public final /* synthetic */ void o(q61 q61Var) {
    }

    @Override // org.telegram.ui.Components.ty
    public final /* synthetic */ void r(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.ty
    public final /* synthetic */ void s(int i10) {
    }

    @Override // org.telegram.ui.Components.ty
    public final /* synthetic */ void t(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.ty
    public final /* synthetic */ void y(long j10) {
    }

    @Override // org.telegram.ui.Components.ty
    public final /* synthetic */ void e(Object obj, Object obj2) {
    }

    @Override // org.telegram.ui.Components.ty
    public final /* synthetic */ void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.Components.ty
    public final /* synthetic */ void m(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10) {
    }

    @Override // org.telegram.ui.Components.ty
    public final /* synthetic */ void v(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11) {
    }
}
