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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class rt implements xx {
    public final /* synthetic */ tt a;

    public rt(tt ttVar) {
        this.a = ttVar;
    }

    @Override // org.telegram.ui.Components.xx
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.Components.xx
    public final /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Components.xx
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Components.xx
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Components.xx
    public final /* synthetic */ int f() {
        return 0;
    }

    @Override // org.telegram.ui.Components.xx
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.Components.xx
    public final void i(int i10) {
        tt ttVar = this.a;
        if (ttVar.b()) {
            ttVar.x = i10 != 0;
            ttVar.y();
            zu0 zu0Var = ttVar.f;
            if (zu0Var != null) {
                zu0Var.S();
            }
        }
    }

    @Override // org.telegram.ui.Components.xx
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.xx
    public final boolean k() {
        ot otVar = this.a.a;
        if (otVar.length() == 0) {
            return false;
        }
        otVar.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // org.telegram.ui.Components.xx
    public final void l(String str) {
        ot otVar = this.a.a;
        int selectionEnd = otVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence replaceEmoji = Emoji.replaceEmoji(str, otVar.getPaint().getFontMetricsInt(), false);
            otVar.setText(otVar.getText().insert(selectionEnd, replaceEmoji));
            int length = selectionEnd + replaceEmoji.length();
            otVar.setSelection(length, length);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    @Override // org.telegram.ui.Components.xx
    public final void n() {
        tt ttVar = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ttVar.getContext(), 0, ttVar.I);
        alertDialog$Builder.a.N = LocaleController.getString(R.string.ClearRecentEmojiTitle);
        alertDialog$Builder.a.P = LocaleController.getString(R.string.ClearRecentEmojiText);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new y71(this));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.n2 n2Var = ttVar.h;
        if (n2Var != null) {
            n2Var.showDialog(alertDialog$Builder.a);
        } else {
            alertDialog$Builder.o();
        }
    }

    @Override // org.telegram.ui.Components.xx
    public final /* synthetic */ float p() {
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.xx
    public final void q() {
        org.telegram.ui.ActionBar.n2 n2Var = this.a.h;
        if (n2Var == null) {
            new ag.g2((org.telegram.ui.ActionBar.n2) new ag.r2(this, 8), 11, false).show();
        } else {
            n2Var.showDialog(new ag.g2(n2Var, 11, false));
        }
    }

    @Override // org.telegram.ui.Components.xx
    public final void x(long j10, TLRPC.Document document, String str, boolean z10) {
        tt ttVar = this.a;
        ot otVar = ttVar.a;
        int selectionEnd = otVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            t5 t5Var = document != null ? new t5(document, otVar.getPaint().getFontMetricsInt()) : new t5(j10, otVar.getPaint().getFontMetricsInt());
            t5Var.cacheType = ttVar.d.c;
            spannableString.setSpan(t5Var, 0, spannableString.length(), 33);
            otVar.setText(otVar.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            otVar.setSelection(length, length);
        } catch (Exception e9) {
            FileLog.e(e9);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // org.telegram.ui.Components.xx
    public final boolean z() {
        return this.a.x;
    }

    @Override // org.telegram.ui.Components.xx
    public final /* synthetic */ void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.xx
    public final /* synthetic */ void o(j41 j41Var) {
    }

    @Override // org.telegram.ui.Components.xx
    public final /* synthetic */ void r(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.xx
    public final /* synthetic */ void s(int i10) {
    }

    @Override // org.telegram.ui.Components.xx
    public final /* synthetic */ void t(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.xx
    public final /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Components.xx
    public final /* synthetic */ void w() {
    }

    @Override // org.telegram.ui.Components.xx
    public final /* synthetic */ void y(long j10) {
    }

    @Override // org.telegram.ui.Components.xx
    public final /* synthetic */ void e(Object obj, Object obj2) {
    }

    @Override // org.telegram.ui.Components.xx
    public final /* synthetic */ void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.Components.xx
    public final /* synthetic */ void m(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10) {
    }

    @Override // org.telegram.ui.Components.xx
    public final /* synthetic */ void v(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11) {
    }
}
