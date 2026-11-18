package org.telegram.ui.Components;

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class ut implements rx {
    public final /* synthetic */ wt a;

    public ut(wt wtVar) {
        this.a = wtVar;
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ int f() {
        return 0;
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.Components.rx
    public final void i(int i7) {
        wt wtVar = this.a;
        if (wtVar.b()) {
            wtVar.y = i7 != 0;
            wtVar.y();
            au0 au0Var = wtVar.f;
            if (au0Var != null) {
                au0Var.R();
            }
        }
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.rx
    public final boolean k() {
        rt rtVar = this.a.a;
        if (rtVar.length() == 0) {
            return false;
        }
        rtVar.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // org.telegram.ui.Components.rx
    public final void l(String str) {
        rt rtVar = this.a.a;
        int selectionEnd = rtVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence m10 = org.telegram.messenger.j6.m(str, rtVar.getPaint().getFontMetricsInt(), false, null, 0);
            rtVar.setText(rtVar.getText().insert(selectionEnd, m10));
            int length = selectionEnd + m10.length();
            rtVar.setSelection(length, length);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.rx
    public final void n() {
        wt wtVar = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wtVar.getContext(), wtVar.N);
        String M0 = org.telegram.messenger.gd.M0(2131752057, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.S = M0;
        u1Var.U = org.telegram.messenger.gd.M0(2131752058, null);
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131752088, null), new b0(this, 27));
        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
        org.telegram.ui.ActionBar.h2 h2Var = wtVar.h;
        if (h2Var != null) {
            h2Var.showDialog(u1Var);
        } else {
            alertDialog$Builder.p();
        }
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ float p() {
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.rx
    public final void q() {
        org.telegram.ui.ActionBar.h2 h2Var = this.a.h;
        if (h2Var == null) {
            new ug.z0((org.telegram.ui.ActionBar.h2) new bi.y8(this, 6), 11, false).show();
        } else {
            h2Var.showDialog(new ug.z0(h2Var, 11, false));
        }
    }

    @Override // org.telegram.ui.Components.rx
    public final void x(long j3, TLRPC.Document document, String str, boolean z10) {
        wt wtVar = this.a;
        rt rtVar = wtVar.a;
        int selectionEnd = rtVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            x5 x5Var = document != null ? new x5(document, rtVar.getPaint().getFontMetricsInt()) : new x5(j3, rtVar.getPaint().getFontMetricsInt());
            x5Var.cacheType = wtVar.d.c;
            spannableString.setSpan(x5Var, 0, spannableString.length(), 33);
            rtVar.setText(rtVar.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            rtVar.setSelection(length, length);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // org.telegram.ui.Components.rx
    public final boolean z() {
        return this.a.y;
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ void o(h41 h41Var) {
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ void r(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ void s(int i7) {
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ void t(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ void y(long j3) {
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ void w() {
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ void e(Object obj, Object obj2) {
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ void m(View view, TLRPC.Document document, String str, Object obj, org.telegram.messenger.bj bjVar, boolean z10, int i7) {
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ void v(View view, Object obj, String str, Object obj2, boolean z10, int i7, int i10) {
    }
}
