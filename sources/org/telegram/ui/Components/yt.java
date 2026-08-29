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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class yt implements fy {
    public final /* synthetic */ au a;

    public yt(au auVar) {
        this.a = auVar;
    }

    @Override // org.telegram.ui.Components.fy
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.Components.fy
    public final /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Components.fy
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Components.fy
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Components.fy
    public final /* synthetic */ int f() {
        return 0;
    }

    @Override // org.telegram.ui.Components.fy
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.Components.fy
    public final void i(int i10) {
        au auVar = this.a;
        if (auVar.b()) {
            auVar.x = i10 != 0;
            auVar.y();
            hv0 hv0Var = auVar.f;
            if (hv0Var != null) {
                hv0Var.S();
            }
        }
    }

    @Override // org.telegram.ui.Components.fy
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.fy
    public final boolean k() {
        vt vtVar = this.a.a;
        if (vtVar.length() == 0) {
            return false;
        }
        vtVar.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // org.telegram.ui.Components.fy
    public final void l(String str) {
        vt vtVar = this.a.a;
        int selectionEnd = vtVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence replaceEmoji = Emoji.replaceEmoji(str, vtVar.getPaint().getFontMetricsInt(), false);
            vtVar.setText(vtVar.getText().insert(selectionEnd, replaceEmoji));
            int length = selectionEnd + replaceEmoji.length();
            vtVar.setSelection(length, length);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override // org.telegram.ui.Components.fy
    public final void n() {
        au auVar = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(auVar.getContext(), 0, auVar.I);
        alertDialog$Builder.a.N = LocaleController.getString(R.string.ClearRecentEmojiTitle);
        alertDialog$Builder.a.P = LocaleController.getString(R.string.ClearRecentEmojiText);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new i81(this));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.o2 o2Var = auVar.h;
        if (o2Var != null) {
            o2Var.showDialog(alertDialog$Builder.a);
        } else {
            alertDialog$Builder.o();
        }
    }

    @Override // org.telegram.ui.Components.fy
    public final /* synthetic */ float p() {
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.fy
    public final void q() {
        org.telegram.ui.ActionBar.o2 o2Var = this.a.h;
        if (o2Var == null) {
            new cg.p1((org.telegram.ui.ActionBar.o2) new cg.z1(this, 8), 11, false).show();
        } else {
            o2Var.showDialog(new cg.p1(o2Var, 11, false));
        }
    }

    @Override // org.telegram.ui.Components.fy
    public final void x(long j10, TLRPC.Document document, String str, boolean z10) {
        au auVar = this.a;
        vt vtVar = auVar.a;
        int selectionEnd = vtVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            y5 y5Var = document != null ? new y5(document, vtVar.getPaint().getFontMetricsInt()) : new y5(j10, vtVar.getPaint().getFontMetricsInt());
            y5Var.cacheType = auVar.d.c;
            spannableString.setSpan(y5Var, 0, spannableString.length(), 33);
            vtVar.setText(vtVar.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            vtVar.setSelection(length, length);
        } catch (Exception e10) {
            FileLog.e(e10);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // org.telegram.ui.Components.fy
    public final boolean z() {
        return this.a.x;
    }

    @Override // org.telegram.ui.Components.fy
    public final /* synthetic */ void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.fy
    public final /* synthetic */ void o(s41 s41Var) {
    }

    @Override // org.telegram.ui.Components.fy
    public final /* synthetic */ void r(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.fy
    public final /* synthetic */ void s(int i10) {
    }

    @Override // org.telegram.ui.Components.fy
    public final /* synthetic */ void t(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.fy
    public final /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Components.fy
    public final /* synthetic */ void w() {
    }

    @Override // org.telegram.ui.Components.fy
    public final /* synthetic */ void y(long j10) {
    }

    @Override // org.telegram.ui.Components.fy
    public final /* synthetic */ void e(Object obj, Object obj2) {
    }

    @Override // org.telegram.ui.Components.fy
    public final /* synthetic */ void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.Components.fy
    public final /* synthetic */ void m(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10) {
    }

    @Override // org.telegram.ui.Components.fy
    public final /* synthetic */ void v(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11) {
    }
}
