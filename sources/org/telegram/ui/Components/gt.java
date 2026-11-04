package org.telegram.ui.Components;

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class gt implements fx {
    public final /* synthetic */ jt a;

    public gt(jt jtVar) {
        this.a = jtVar;
    }

    @Override // org.telegram.ui.Components.fx
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.Components.fx
    public final /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Components.fx
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Components.fx
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Components.fx
    public final /* synthetic */ int f() {
        return 0;
    }

    @Override // org.telegram.ui.Components.fx
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.Components.fx
    public final void i(int i3) {
        jt jtVar = this.a;
        if (jtVar.b()) {
            jtVar.y = i3 != 0;
            jtVar.y();
            qt0 qt0Var = jtVar.f;
            if (qt0Var != null) {
                qt0Var.R();
            }
        }
    }

    @Override // org.telegram.ui.Components.fx
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.fx
    public final boolean k() {
        dt dtVar = this.a.a;
        if (dtVar.length() == 0) {
            return false;
        }
        dtVar.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // org.telegram.ui.Components.fx
    public final void l(String str) {
        dt dtVar = this.a.a;
        int selectionEnd = dtVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence m10 = org.telegram.messenger.i6.m(str, dtVar.getPaint().getFontMetricsInt(), false, null, 0);
            dtVar.setText(dtVar.getText().insert(selectionEnd, m10));
            int length = selectionEnd + m10.length();
            dtVar.setSelection(length, length);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.fx
    public final void n() {
        jt jtVar = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, jtVar.getContext(), jtVar.N);
        String M0 = org.telegram.messenger.bd.M0(2131752068, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = M0;
        s1Var.U = org.telegram.messenger.bd.M0(2131752069, null);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131752099, null), new t(this, 28));
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
        org.telegram.ui.ActionBar.d2 d2Var = jtVar.h;
        if (d2Var != null) {
            d2Var.showDialog(s1Var);
        } else {
            alertDialog$Builder.p();
        }
    }

    @Override // org.telegram.ui.Components.fx
    public final /* synthetic */ float p() {
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.fx
    public final void q() {
        org.telegram.ui.ActionBar.d2 d2Var = this.a.h;
        if (d2Var == null) {
            new vg.v0((org.telegram.ui.ActionBar.d2) new ai.c7(this, 6), 11, false).show();
        } else {
            d2Var.showDialog(new vg.v0(d2Var, 11, false));
        }
    }

    @Override // org.telegram.ui.Components.fx
    public final void x(long j10, TLRPC.Document document, String str, boolean z10) {
        jt jtVar = this.a;
        dt dtVar = jtVar.a;
        int selectionEnd = dtVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            p5 p5Var = document != null ? new p5(document, dtVar.getPaint().getFontMetricsInt()) : new p5(j10, dtVar.getPaint().getFontMetricsInt());
            p5Var.cacheType = jtVar.d.c;
            spannableString.setSpan(p5Var, 0, spannableString.length(), 33);
            dtVar.setText(dtVar.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            dtVar.setSelection(length, length);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // org.telegram.ui.Components.fx
    public final boolean z() {
        return this.a.y;
    }

    @Override // org.telegram.ui.Components.fx
    public final /* synthetic */ void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.fx
    public final /* synthetic */ void o(n31 n31Var) {
    }

    @Override // org.telegram.ui.Components.fx
    public final /* synthetic */ void r(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.fx
    public final /* synthetic */ void s(int i3) {
    }

    @Override // org.telegram.ui.Components.fx
    public final /* synthetic */ void t(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.fx
    public final /* synthetic */ void y(long j10) {
    }

    @Override // org.telegram.ui.Components.fx
    public final /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Components.fx
    public final /* synthetic */ void w() {
    }

    @Override // org.telegram.ui.Components.fx
    public final /* synthetic */ void e(Object obj, Object obj2) {
    }

    @Override // org.telegram.ui.Components.fx
    public final /* synthetic */ void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.Components.fx
    public final /* synthetic */ void m(View view, TLRPC.Document document, String str, Object obj, org.telegram.messenger.vi viVar, boolean z10, int i3) {
    }

    @Override // org.telegram.ui.Components.fx
    public final /* synthetic */ void v(View view, Object obj, String str, Object obj2, boolean z10, int i3, int i10) {
    }
}
