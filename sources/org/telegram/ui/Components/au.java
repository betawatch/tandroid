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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class au implements ky {
    public final /* synthetic */ cu a;

    public au(cu cuVar) {
        this.a = cuVar;
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
        cu cuVar = this.a;
        if (cuVar.b()) {
            cuVar.x = i10 != 0;
            cuVar.y();
            qv0 qv0Var = cuVar.f;
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
        xt xtVar = this.a.a;
        if (xtVar.length() == 0) {
            return false;
        }
        xtVar.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // org.telegram.ui.Components.ky
    public final void l(String str) {
        xt xtVar = this.a.a;
        int selectionEnd = xtVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence replaceEmoji = Emoji.replaceEmoji(str, xtVar.getPaint().getFontMetricsInt(), false);
            xtVar.setText(xtVar.getText().insert(selectionEnd, replaceEmoji));
            int length = selectionEnd + replaceEmoji.length();
            xtVar.setSelection(length, length);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Components.ky
    public final void n() {
        cu cuVar = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cuVar.getContext(), 0, cuVar.J);
        alertDialog$Builder.a.O = LocaleController.getString(R.string.ClearRecentEmojiTitle);
        alertDialog$Builder.a.Q = LocaleController.getString(R.string.ClearRecentEmojiText);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new u81(this));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.p2 p2Var = cuVar.h;
        if (p2Var != null) {
            p2Var.showDialog(alertDialog$Builder.a);
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
        org.telegram.ui.ActionBar.p2 p2Var = this.a.h;
        if (p2Var == null) {
            new eg.o1((org.telegram.ui.ActionBar.p2) new eg.y1(this, 6), 11, false).show();
        } else {
            p2Var.showDialog(new eg.o1(p2Var, 11, false));
        }
    }

    @Override // org.telegram.ui.Components.ky
    public final void x(long j10, TLRPC.Document document, String str, boolean z4) {
        cu cuVar = this.a;
        xt xtVar = cuVar.a;
        int selectionEnd = xtVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            u5 u5Var = document != null ? new u5(document, xtVar.getPaint().getFontMetricsInt()) : new u5(j10, xtVar.getPaint().getFontMetricsInt());
            u5Var.cacheType = cuVar.d.c;
            spannableString.setSpan(u5Var, 0, spannableString.length(), 33);
            xtVar.setText(xtVar.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            xtVar.setSelection(length, length);
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
    public final /* synthetic */ void o(e51 e51Var) {
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
    public final /* synthetic */ void y(long j10) {
    }

    @Override // org.telegram.ui.Components.ky
    public final /* synthetic */ void e(Object obj, Object obj2) {
    }

    @Override // org.telegram.ui.Components.ky
    public final /* synthetic */ void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z4) {
    }

    @Override // org.telegram.ui.Components.ky
    public final /* synthetic */ void m(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z4, int i10) {
    }

    @Override // org.telegram.ui.Components.ky
    public final /* synthetic */ void v(View view, Object obj, String str, Object obj2, boolean z4, int i10, int i11) {
    }
}
