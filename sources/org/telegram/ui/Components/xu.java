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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class xu implements az {
    public final /* synthetic */ zu a;

    public xu(zu zuVar) {
        this.a = zuVar;
    }

    @Override // org.telegram.ui.Components.az
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.Components.az
    public final /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Components.az
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Components.az
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Components.az
    public final /* synthetic */ int f() {
        return 0;
    }

    @Override // org.telegram.ui.Components.az
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.Components.az
    public final void i(int i10) {
        zu zuVar = this.a;
        if (zuVar.b()) {
            zuVar.x = i10 != 0;
            zuVar.y();
            sw0 sw0Var = zuVar.f;
            if (sw0Var != null) {
                sw0Var.S();
            }
        }
    }

    @Override // org.telegram.ui.Components.az
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.az
    public final boolean k() {
        uu uuVar = this.a.a;
        if (uuVar.length() == 0) {
            return false;
        }
        uuVar.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // org.telegram.ui.Components.az
    public final void l(String str) {
        uu uuVar = this.a.a;
        int selectionEnd = uuVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence replaceEmoji = Emoji.replaceEmoji(str, uuVar.getPaint().getFontMetricsInt(), false);
            uuVar.setText(uuVar.getText().insert(selectionEnd, replaceEmoji));
            int length = selectionEnd + replaceEmoji.length();
            uuVar.setSelection(length, length);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override // org.telegram.ui.Components.az
    public final void n() {
        zu zuVar = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zuVar.getContext(), 0, zuVar.M);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.ClearRecentEmojiTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.ClearRecentEmojiText);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new s(this, 29));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.n2 n2Var = zuVar.h;
        if (n2Var != null) {
            n2Var.showDialog(alertDialog$Builder.a);
        } else {
            alertDialog$Builder.o();
        }
    }

    @Override // org.telegram.ui.Components.az
    public final /* synthetic */ float p() {
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.az
    public final void q() {
        org.telegram.ui.ActionBar.n2 n2Var = this.a.h;
        if (n2Var == null) {
            new rg.y0((org.telegram.ui.ActionBar.n2) new ai.z3(this, 4), 11, false).show();
        } else {
            n2Var.showDialog(new rg.y0(n2Var, 11, false));
        }
    }

    @Override // org.telegram.ui.Components.az
    public final void x(long j3, TLRPC.Document document, String str, boolean z10) {
        zu zuVar = this.a;
        uu uuVar = zuVar.a;
        int selectionEnd = uuVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            b6 b6Var = document != null ? new b6(document, uuVar.getPaint().getFontMetricsInt()) : new b6(j3, uuVar.getPaint().getFontMetricsInt());
            b6Var.cacheType = zuVar.d.c;
            spannableString.setSpan(b6Var, 0, spannableString.length(), 33);
            uuVar.setText(uuVar.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            uuVar.setSelection(length, length);
        } catch (Exception e7) {
            FileLog.e(e7);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // org.telegram.ui.Components.az
    public final boolean z() {
        return this.a.x;
    }

    @Override // org.telegram.ui.Components.az
    public final /* synthetic */ void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.az
    public final /* synthetic */ void o(l61 l61Var) {
    }

    @Override // org.telegram.ui.Components.az
    public final /* synthetic */ void r(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.az
    public final /* synthetic */ void s(int i10) {
    }

    @Override // org.telegram.ui.Components.az
    public final /* synthetic */ void t(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.az
    public final /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Components.az
    public final /* synthetic */ void w() {
    }

    @Override // org.telegram.ui.Components.az
    public final /* synthetic */ void y(long j3) {
    }

    @Override // org.telegram.ui.Components.az
    public final /* synthetic */ void e(Object obj, Object obj2) {
    }

    @Override // org.telegram.ui.Components.az
    public final /* synthetic */ void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.Components.az
    public final /* synthetic */ void m(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10) {
    }

    @Override // org.telegram.ui.Components.az
    public final /* synthetic */ void v(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11) {
    }
}
