package org.telegram.ui.Components;

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ut implements vx {
    public final /* synthetic */ wt a;

    public ut(wt wtVar) {
        this.a = wtVar;
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ int f() {
        return 0;
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.Components.vx
    public final void i(int i10) {
        wt wtVar = this.a;
        if (wtVar.b()) {
            wtVar.y = i10 != 0;
            wtVar.y();
            uu0 uu0Var = wtVar.f;
            if (uu0Var != null) {
                uu0Var.R();
            }
        }
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.vx
    public final boolean k() {
        rt rtVar = this.a.a;
        if (rtVar.length() == 0) {
            return false;
        }
        rtVar.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // org.telegram.ui.Components.vx
    public final void l(String str) {
        rt rtVar = this.a.a;
        int selectionEnd = rtVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence m10 = org.telegram.messenger.k6.m(str, rtVar.getPaint().getFontMetricsInt(), false, null, 0);
            rtVar.setText(rtVar.getText().insert(selectionEnd, m10));
            int length = selectionEnd + m10.length();
            rtVar.setSelection(length, length);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.Components.vx
    public final void n() {
        wt wtVar = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wtVar.getContext(), wtVar.M);
        String L0 = org.telegram.messenger.cd.L0(2131752068, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = L0;
        x1Var.T = org.telegram.messenger.cd.L0(2131752069, null);
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131752099, null), new t(this, 28));
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
        org.telegram.ui.ActionBar.k2 k2Var = wtVar.h;
        if (k2Var != null) {
            k2Var.showDialog(x1Var);
        } else {
            alertDialog$Builder.p();
        }
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ float p() {
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.vx
    public final void q() {
        org.telegram.ui.ActionBar.k2 k2Var = this.a.h;
        if (k2Var == null) {
            new kg.i1((org.telegram.ui.ActionBar.k2) new kg.q1(this, 2), 11, false).show();
        } else {
            k2Var.showDialog(new kg.i1(k2Var, 11, false));
        }
    }

    @Override // org.telegram.ui.Components.vx
    public final void x(long j10, TLRPC.Document document, String str, boolean z10) {
        wt wtVar = this.a;
        rt rtVar = wtVar.a;
        int selectionEnd = rtVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            o5 o5Var = document != null ? new o5(document, rtVar.getPaint().getFontMetricsInt()) : new o5(j10, rtVar.getPaint().getFontMetricsInt());
            o5Var.cacheType = wtVar.d.c;
            spannableString.setSpan(o5Var, 0, spannableString.length(), 33);
            rtVar.setText(rtVar.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            rtVar.setSelection(length, length);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // org.telegram.ui.Components.vx
    public final boolean z() {
        return this.a.y;
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ void o(w41 w41Var) {
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ void r(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ void s(int i10) {
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ void t(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ void y(long j10) {
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ void w() {
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ void e(Object obj, Object obj2) {
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ void m(View view, TLRPC.Document document, String str, Object obj, org.telegram.messenger.fj fjVar, boolean z10, int i10) {
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ void v(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11) {
    }
}
