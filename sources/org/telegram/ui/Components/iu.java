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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class iu implements ly {
    public final /* synthetic */ ku a;

    public iu(ku kuVar) {
        this.a = kuVar;
    }

    @Override // org.telegram.ui.Components.ly
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.Components.ly
    public final /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Components.ly
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Components.ly
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Components.ly
    public final /* synthetic */ int f() {
        return 0;
    }

    @Override // org.telegram.ui.Components.ly
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.Components.ly
    public final void i(int i10) {
        ku kuVar = this.a;
        if (kuVar.b()) {
            kuVar.x = i10 != 0;
            kuVar.y();
            pv0 pv0Var = kuVar.f;
            if (pv0Var != null) {
                pv0Var.S();
            }
        }
    }

    @Override // org.telegram.ui.Components.ly
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.ly
    public final boolean k() {
        fu fuVar = this.a.a;
        if (fuVar.length() == 0) {
            return false;
        }
        fuVar.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // org.telegram.ui.Components.ly
    public final void l(String str) {
        fu fuVar = this.a.a;
        int selectionEnd = fuVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence replaceEmoji = Emoji.replaceEmoji(str, fuVar.getPaint().getFontMetricsInt(), false);
            fuVar.setText(fuVar.getText().insert(selectionEnd, replaceEmoji));
            int length = selectionEnd + replaceEmoji.length();
            fuVar.setSelection(length, length);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Components.ly
    public final void n() {
        ku kuVar = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kuVar.getContext(), 0, kuVar.M);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.ClearRecentEmojiTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.ClearRecentEmojiText);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new q81(this));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.n2 n2Var = kuVar.h;
        if (n2Var != null) {
            n2Var.showDialog(alertDialog$Builder.a);
        } else {
            alertDialog$Builder.o();
        }
    }

    @Override // org.telegram.ui.Components.ly
    public final /* synthetic */ float p() {
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.ly
    public final void q() {
        org.telegram.ui.ActionBar.n2 n2Var = this.a.h;
        if (n2Var == null) {
            new rg.x0((org.telegram.ui.ActionBar.n2) new ai.y3(this, 4), 11, false).show();
        } else {
            n2Var.showDialog(new rg.x0(n2Var, 11, false));
        }
    }

    @Override // org.telegram.ui.Components.ly
    public final void x(long j3, TLRPC.Document document, String str, boolean z10) {
        ku kuVar = this.a;
        fu fuVar = kuVar.a;
        int selectionEnd = fuVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            z5 z5Var = document != null ? new z5(document, fuVar.getPaint().getFontMetricsInt()) : new z5(j3, fuVar.getPaint().getFontMetricsInt());
            z5Var.cacheType = kuVar.d.c;
            spannableString.setSpan(z5Var, 0, spannableString.length(), 33);
            fuVar.setText(fuVar.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            fuVar.setSelection(length, length);
        } catch (Exception e) {
            FileLog.e(e);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // org.telegram.ui.Components.ly
    public final boolean z() {
        return this.a.x;
    }

    @Override // org.telegram.ui.Components.ly
    public final /* synthetic */ void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.ly
    public final /* synthetic */ void o(d51 d51Var) {
    }

    @Override // org.telegram.ui.Components.ly
    public final /* synthetic */ void r(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.ly
    public final /* synthetic */ void s(int i10) {
    }

    @Override // org.telegram.ui.Components.ly
    public final /* synthetic */ void t(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.ly
    public final /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Components.ly
    public final /* synthetic */ void w() {
    }

    @Override // org.telegram.ui.Components.ly
    public final /* synthetic */ void y(long j3) {
    }

    @Override // org.telegram.ui.Components.ly
    public final /* synthetic */ void e(Object obj, Object obj2) {
    }

    @Override // org.telegram.ui.Components.ly
    public final /* synthetic */ void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.Components.ly
    public final /* synthetic */ void m(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10) {
    }

    @Override // org.telegram.ui.Components.ly
    public final /* synthetic */ void v(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11) {
    }
}
