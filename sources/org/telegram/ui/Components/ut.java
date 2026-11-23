package org.telegram.ui.Components;

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ut implements qx {
    public final /* synthetic */ wt a;

    public ut(wt wtVar) {
        this.a = wtVar;
    }

    @Override // org.telegram.ui.Components.qx
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.Components.qx
    public final /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Components.qx
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Components.qx
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Components.qx
    public final /* synthetic */ int f() {
        return 0;
    }

    @Override // org.telegram.ui.Components.qx
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.Components.qx
    public final void i(int i7) {
        wt wtVar = this.a;
        if (wtVar.b()) {
            wtVar.y = i7 != 0;
            wtVar.y();
            cu0 cu0Var = wtVar.f;
            if (cu0Var != null) {
                cu0Var.R();
            }
        }
    }

    @Override // org.telegram.ui.Components.qx
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.qx
    public final boolean k() {
        rt rtVar = this.a.a;
        if (rtVar.length() == 0) {
            return false;
        }
        rtVar.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // org.telegram.ui.Components.qx
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

    @Override // org.telegram.ui.Components.qx
    public final void n() {
        wt wtVar = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wtVar.getContext(), wtVar.N);
        String N0 = org.telegram.messenger.gd.N0(2131752056, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = N0;
        t1Var.U = org.telegram.messenger.gd.N0(2131752057, null);
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131752087, null), new b0(this, 27));
        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
        org.telegram.ui.ActionBar.g2 g2Var = wtVar.h;
        if (g2Var != null) {
            g2Var.showDialog(t1Var);
        } else {
            alertDialog$Builder.p();
        }
    }

    @Override // org.telegram.ui.Components.qx
    public final /* synthetic */ float p() {
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.qx
    public final void q() {
        org.telegram.ui.ActionBar.g2 g2Var = this.a.h;
        if (g2Var == null) {
            new ug.y0((org.telegram.ui.ActionBar.g2) new bi.e9(this, 6), 11, false).show();
        } else {
            g2Var.showDialog(new ug.y0(g2Var, 11, false));
        }
    }

    @Override // org.telegram.ui.Components.qx
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

    @Override // org.telegram.ui.Components.qx
    public final boolean z() {
        return this.a.y;
    }

    @Override // org.telegram.ui.Components.qx
    public final /* synthetic */ void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.qx
    public final /* synthetic */ void o(j41 j41Var) {
    }

    @Override // org.telegram.ui.Components.qx
    public final /* synthetic */ void r(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.qx
    public final /* synthetic */ void s(int i7) {
    }

    @Override // org.telegram.ui.Components.qx
    public final /* synthetic */ void t(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.qx
    public final /* synthetic */ void y(long j3) {
    }

    @Override // org.telegram.ui.Components.qx
    public final /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Components.qx
    public final /* synthetic */ void w() {
    }

    @Override // org.telegram.ui.Components.qx
    public final /* synthetic */ void e(Object obj, Object obj2) {
    }

    @Override // org.telegram.ui.Components.qx
    public final /* synthetic */ void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.Components.qx
    public final /* synthetic */ void m(View view, TLRPC.Document document, String str, Object obj, org.telegram.messenger.bj bjVar, boolean z10, int i7) {
    }

    @Override // org.telegram.ui.Components.qx
    public final /* synthetic */ void v(View view, Object obj, String str, Object obj2, boolean z10, int i7, int i10) {
    }
}
