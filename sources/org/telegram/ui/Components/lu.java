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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class lu implements sy {
    public final /* synthetic */ nu a;

    public lu(nu nuVar) {
        this.a = nuVar;
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ int f() {
        return 0;
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.Components.sy
    public final void i(int i10) {
        nu nuVar = this.a;
        if (nuVar.b()) {
            nuVar.x = i10 != 0;
            nuVar.y();
            aw0 aw0Var = nuVar.f;
            if (aw0Var != null) {
                aw0Var.S();
            }
        }
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.sy
    public final boolean k() {
        iu iuVar = this.a.a;
        if (iuVar.length() == 0) {
            return false;
        }
        iuVar.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // org.telegram.ui.Components.sy
    public final void l(String str) {
        iu iuVar = this.a.a;
        int selectionEnd = iuVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence replaceEmoji = Emoji.replaceEmoji(str, iuVar.getPaint().getFontMetricsInt(), false);
            iuVar.setText(iuVar.getText().insert(selectionEnd, replaceEmoji));
            int length = selectionEnd + replaceEmoji.length();
            iuVar.setSelection(length, length);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Components.sy
    public final void n() {
        nu nuVar = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(nuVar.getContext(), 0, nuVar.M);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.ClearRecentEmojiTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.ClearRecentEmojiText);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new e91(this));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.p2 p2Var = nuVar.h;
        if (p2Var != null) {
            p2Var.showDialog(alertDialog$Builder.a);
        } else {
            alertDialog$Builder.o();
        }
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ float p() {
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.sy
    public final void q() {
        org.telegram.ui.ActionBar.p2 p2Var = this.a.h;
        if (p2Var == null) {
            new qg.a1((org.telegram.ui.ActionBar.p2) new bi.o1(this, 2), 11, false).show();
        } else {
            p2Var.showDialog(new qg.a1(p2Var, 11, false));
        }
    }

    @Override // org.telegram.ui.Components.sy
    public final void x(long j3, TLRPC.Document document, String str, boolean z10) {
        nu nuVar = this.a;
        iu iuVar = nuVar.a;
        int selectionEnd = iuVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            y5 y5Var = document != null ? new y5(document, iuVar.getPaint().getFontMetricsInt()) : new y5(j3, iuVar.getPaint().getFontMetricsInt());
            y5Var.cacheType = nuVar.d.c;
            spannableString.setSpan(y5Var, 0, spannableString.length(), 33);
            iuVar.setText(iuVar.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            iuVar.setSelection(length, length);
        } catch (Exception e) {
            FileLog.e(e);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // org.telegram.ui.Components.sy
    public final boolean z() {
        return this.a.x;
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ void o(r51 r51Var) {
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ void r(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ void s(int i10) {
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ void t(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ void w() {
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ void y(long j3) {
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ void e(Object obj, Object obj2) {
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ void m(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10) {
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ void v(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11) {
    }
}
