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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class hu implements ky {
    public final /* synthetic */ ju a;

    public hu(ju juVar) {
        this.a = juVar;
    }

    @Override // org.telegram.ui.Components.ky
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.Components.ky
    public final /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Components.ky
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Components.ky
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Components.ky
    public final /* synthetic */ int f() {
        return 0;
    }

    @Override // org.telegram.ui.Components.ky
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.Components.ky
    public final void i(int i10) {
        ju juVar = this.a;
        if (juVar.b()) {
            juVar.x = i10 != 0;
            juVar.y();
            qv0 qv0Var = juVar.f;
            if (qv0Var != null) {
                qv0Var.S();
            }
        }
    }

    @Override // org.telegram.ui.Components.ky
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.ky
    public final boolean k() {
        eu euVar = this.a.a;
        if (euVar.length() == 0) {
            return false;
        }
        euVar.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // org.telegram.ui.Components.ky
    public final void l(String str) {
        eu euVar = this.a.a;
        int selectionEnd = euVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence replaceEmoji = Emoji.replaceEmoji(str, euVar.getPaint().getFontMetricsInt(), false);
            euVar.setText(euVar.getText().insert(selectionEnd, replaceEmoji));
            int length = selectionEnd + replaceEmoji.length();
            euVar.setSelection(length, length);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Components.ky
    public final void n() {
        ju juVar = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(juVar.getContext(), 0, juVar.M);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.ClearRecentEmojiTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.ClearRecentEmojiText);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new s81(this));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.o2 o2Var = juVar.h;
        if (o2Var != null) {
            o2Var.showDialog(alertDialog$Builder.a);
        } else {
            alertDialog$Builder.o();
        }
    }

    @Override // org.telegram.ui.Components.ky
    public final /* synthetic */ float p() {
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.ky
    public final void q() {
        org.telegram.ui.ActionBar.o2 o2Var = this.a.h;
        if (o2Var == null) {
            new rg.x0((org.telegram.ui.ActionBar.o2) new ai.y3(this, 4), 11, false).show();
        } else {
            o2Var.showDialog(new rg.x0(o2Var, 11, false));
        }
    }

    @Override // org.telegram.ui.Components.ky
    public final void x(long j3, TLRPC.Document document, String str, boolean z10) {
        ju juVar = this.a;
        eu euVar = juVar.a;
        int selectionEnd = euVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            x5 x5Var = document != null ? new x5(document, euVar.getPaint().getFontMetricsInt()) : new x5(j3, euVar.getPaint().getFontMetricsInt());
            x5Var.cacheType = juVar.d.c;
            spannableString.setSpan(x5Var, 0, spannableString.length(), 33);
            euVar.setText(euVar.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            euVar.setSelection(length, length);
        } catch (Exception e) {
            FileLog.e(e);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // org.telegram.ui.Components.ky
    public final boolean z() {
        return this.a.x;
    }

    @Override // org.telegram.ui.Components.ky
    public final /* synthetic */ void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.ky
    public final /* synthetic */ void o(f51 f51Var) {
    }

    @Override // org.telegram.ui.Components.ky
    public final /* synthetic */ void r(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.ky
    public final /* synthetic */ void s(int i10) {
    }

    @Override // org.telegram.ui.Components.ky
    public final /* synthetic */ void t(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.ky
    public final /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Components.ky
    public final /* synthetic */ void w() {
    }

    @Override // org.telegram.ui.Components.ky
    public final /* synthetic */ void y(long j3) {
    }

    @Override // org.telegram.ui.Components.ky
    public final /* synthetic */ void e(Object obj, Object obj2) {
    }

    @Override // org.telegram.ui.Components.ky
    public final /* synthetic */ void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.Components.ky
    public final /* synthetic */ void m(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10) {
    }

    @Override // org.telegram.ui.Components.ky
    public final /* synthetic */ void v(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11) {
    }
}
