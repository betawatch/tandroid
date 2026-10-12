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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class tu implements wy {
    public final /* synthetic */ vu a;

    public tu(vu vuVar) {
        this.a = vuVar;
    }

    @Override // org.telegram.ui.Components.wy
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.Components.wy
    public final /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Components.wy
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Components.wy
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Components.wy
    public final /* synthetic */ int f() {
        return 0;
    }

    @Override // org.telegram.ui.Components.wy
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.Components.wy
    public final void i(int i10) {
        vu vuVar = this.a;
        if (vuVar.b()) {
            vuVar.x = i10 != 0;
            vuVar.y();
            ow0 ow0Var = vuVar.f;
            if (ow0Var != null) {
                ow0Var.S();
            }
        }
    }

    @Override // org.telegram.ui.Components.wy
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.wy
    public final boolean k() {
        qu quVar = this.a.a;
        if (quVar.length() == 0) {
            return false;
        }
        quVar.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // org.telegram.ui.Components.wy
    public final void l(String str) {
        qu quVar = this.a.a;
        int selectionEnd = quVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence replaceEmoji = Emoji.replaceEmoji(str, quVar.getPaint().getFontMetricsInt(), false);
            quVar.setText(quVar.getText().insert(selectionEnd, replaceEmoji));
            int length = selectionEnd + replaceEmoji.length();
            quVar.setSelection(length, length);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Components.wy
    public final void n() {
        vu vuVar = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vuVar.getContext(), 0, vuVar.M);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.ClearRecentEmojiTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.ClearRecentEmojiText);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new s(this, 29));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.m2 m2Var = vuVar.h;
        if (m2Var != null) {
            m2Var.showDialog(alertDialog$Builder.a);
        } else {
            alertDialog$Builder.o();
        }
    }

    @Override // org.telegram.ui.Components.wy
    public final /* synthetic */ float p() {
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.wy
    public final void q() {
        org.telegram.ui.ActionBar.m2 m2Var = this.a.h;
        if (m2Var == null) {
            new sg.y0((org.telegram.ui.ActionBar.m2) new bi.o3(this, 4), 11, false).show();
        } else {
            m2Var.showDialog(new sg.y0(m2Var, 11, false));
        }
    }

    @Override // org.telegram.ui.Components.wy
    public final void x(long j10, TLRPC.Document document, String str, boolean z10) {
        vu vuVar = this.a;
        qu quVar = vuVar.a;
        int selectionEnd = quVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            b6 b6Var = document != null ? new b6(document, quVar.getPaint().getFontMetricsInt()) : new b6(j10, quVar.getPaint().getFontMetricsInt());
            b6Var.cacheType = vuVar.d.c;
            spannableString.setSpan(b6Var, 0, spannableString.length(), 33);
            quVar.setText(quVar.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            quVar.setSelection(length, length);
        } catch (Exception e) {
            FileLog.e(e);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // org.telegram.ui.Components.wy
    public final boolean z() {
        return this.a.x;
    }

    @Override // org.telegram.ui.Components.wy
    public final /* synthetic */ void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.wy
    public final /* synthetic */ void o(h61 h61Var) {
    }

    @Override // org.telegram.ui.Components.wy
    public final /* synthetic */ void r(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.wy
    public final /* synthetic */ void s(int i10) {
    }

    @Override // org.telegram.ui.Components.wy
    public final /* synthetic */ void t(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.wy
    public final /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Components.wy
    public final /* synthetic */ void w() {
    }

    @Override // org.telegram.ui.Components.wy
    public final /* synthetic */ void y(long j10) {
    }

    @Override // org.telegram.ui.Components.wy
    public final /* synthetic */ void e(Object obj, Object obj2) {
    }

    @Override // org.telegram.ui.Components.wy
    public final /* synthetic */ void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.Components.wy
    public final /* synthetic */ void m(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10) {
    }

    @Override // org.telegram.ui.Components.wy
    public final /* synthetic */ void v(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11) {
    }
}
