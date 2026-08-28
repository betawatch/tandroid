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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class st implements wx {
    public final /* synthetic */ ut a;

    public st(ut utVar) {
        this.a = utVar;
    }

    @Override // org.telegram.ui.Components.wx
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.Components.wx
    public final /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Components.wx
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Components.wx
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Components.wx
    public final /* synthetic */ int f() {
        return 0;
    }

    @Override // org.telegram.ui.Components.wx
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.Components.wx
    public final void i(int i9) {
        ut utVar = this.a;
        if (utVar.b()) {
            utVar.x = i9 != 0;
            utVar.y();
            xu0 xu0Var = utVar.f;
            if (xu0Var != null) {
                xu0Var.S();
            }
        }
    }

    @Override // org.telegram.ui.Components.wx
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.wx
    public final boolean k() {
        pt ptVar = this.a.a;
        if (ptVar.length() == 0) {
            return false;
        }
        ptVar.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // org.telegram.ui.Components.wx
    public final void l(String str) {
        pt ptVar = this.a.a;
        int selectionEnd = ptVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence replaceEmoji = Emoji.replaceEmoji(str, ptVar.getPaint().getFontMetricsInt(), false);
            ptVar.setText(ptVar.getText().insert(selectionEnd, replaceEmoji));
            int length = selectionEnd + replaceEmoji.length();
            ptVar.setSelection(length, length);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override // org.telegram.ui.Components.wx
    public final void n() {
        ut utVar = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(utVar.getContext(), 0, utVar.I);
        alertDialog$Builder.a.N = LocaleController.getString(R.string.ClearRecentEmojiTitle);
        alertDialog$Builder.a.P = LocaleController.getString(R.string.ClearRecentEmojiText);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new w71(this));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.o2 o2Var = utVar.h;
        if (o2Var != null) {
            o2Var.showDialog(alertDialog$Builder.a);
        } else {
            alertDialog$Builder.o();
        }
    }

    @Override // org.telegram.ui.Components.wx
    public final /* synthetic */ float p() {
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.wx
    public final void q() {
        org.telegram.ui.ActionBar.o2 o2Var = this.a.h;
        if (o2Var == null) {
            new zf.x0((org.telegram.ui.ActionBar.o2) new bg.i1(this, 7), 11, false).show();
        } else {
            o2Var.showDialog(new zf.x0(o2Var, 11, false));
        }
    }

    @Override // org.telegram.ui.Components.wx
    public final void x(long j10, TLRPC.Document document, String str, boolean z10) {
        ut utVar = this.a;
        pt ptVar = utVar.a;
        int selectionEnd = ptVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            t5 t5Var = document != null ? new t5(document, ptVar.getPaint().getFontMetricsInt()) : new t5(j10, ptVar.getPaint().getFontMetricsInt());
            t5Var.cacheType = utVar.d.c;
            spannableString.setSpan(t5Var, 0, spannableString.length(), 33);
            ptVar.setText(ptVar.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            ptVar.setSelection(length, length);
        } catch (Exception e10) {
            FileLog.e(e10);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // org.telegram.ui.Components.wx
    public final boolean z() {
        return this.a.x;
    }

    @Override // org.telegram.ui.Components.wx
    public final /* synthetic */ void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.wx
    public final /* synthetic */ void o(h41 h41Var) {
    }

    @Override // org.telegram.ui.Components.wx
    public final /* synthetic */ void r(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.wx
    public final /* synthetic */ void s(int i9) {
    }

    @Override // org.telegram.ui.Components.wx
    public final /* synthetic */ void t(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.wx
    public final /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Components.wx
    public final /* synthetic */ void w() {
    }

    @Override // org.telegram.ui.Components.wx
    public final /* synthetic */ void y(long j10) {
    }

    @Override // org.telegram.ui.Components.wx
    public final /* synthetic */ void e(Object obj, Object obj2) {
    }

    @Override // org.telegram.ui.Components.wx
    public final /* synthetic */ void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.Components.wx
    public final /* synthetic */ void m(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i9) {
    }

    @Override // org.telegram.ui.Components.wx
    public final /* synthetic */ void v(View view, Object obj, String str, Object obj2, boolean z10, int i9, int i10) {
    }
}
