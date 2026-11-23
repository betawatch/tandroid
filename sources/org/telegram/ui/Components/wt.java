package org.telegram.ui.Components;

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class wt implements tx {
    public final /* synthetic */ yt a;

    public wt(yt ytVar) {
        this.a = ytVar;
    }

    @Override // org.telegram.ui.Components.tx
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.Components.tx
    public final /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Components.tx
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Components.tx
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Components.tx
    public final /* synthetic */ int f() {
        return 0;
    }

    @Override // org.telegram.ui.Components.tx
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.Components.tx
    public final void i(int i7) {
        yt ytVar = this.a;
        if (ytVar.b()) {
            ytVar.y = i7 != 0;
            ytVar.y();
            du0 du0Var = ytVar.f;
            if (du0Var != null) {
                du0Var.R();
            }
        }
    }

    @Override // org.telegram.ui.Components.tx
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.tx
    public final boolean k() {
        tt ttVar = this.a.a;
        if (ttVar.length() == 0) {
            return false;
        }
        ttVar.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // org.telegram.ui.Components.tx
    public final void l(String str) {
        tt ttVar = this.a.a;
        int selectionEnd = ttVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence m10 = org.telegram.messenger.j6.m(str, ttVar.getPaint().getFontMetricsInt(), false, null, 0);
            ttVar.setText(ttVar.getText().insert(selectionEnd, m10));
            int length = selectionEnd + m10.length();
            ttVar.setSelection(length, length);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.tx
    public final void n() {
        yt ytVar = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ytVar.getContext(), ytVar.N);
        String N0 = org.telegram.messenger.hd.N0(2131752056, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = N0;
        t1Var.U = org.telegram.messenger.hd.N0(2131752057, null);
        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131752087, null), new c0(this, 27));
        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
        org.telegram.ui.ActionBar.g2 g2Var = ytVar.h;
        if (g2Var != null) {
            g2Var.showDialog(t1Var);
        } else {
            alertDialog$Builder.p();
        }
    }

    @Override // org.telegram.ui.Components.tx
    public final /* synthetic */ float p() {
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.tx
    public final void q() {
        org.telegram.ui.ActionBar.g2 g2Var = this.a.h;
        if (g2Var == null) {
            new ug.y0((org.telegram.ui.ActionBar.g2) new bi.b9(this, 6), 11, false).show();
        } else {
            g2Var.showDialog(new ug.y0(g2Var, 11, false));
        }
    }

    @Override // org.telegram.ui.Components.tx
    public final void x(long j3, TLRPC.Document document, String str, boolean z10) {
        yt ytVar = this.a;
        tt ttVar = ytVar.a;
        int selectionEnd = ttVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            y5 y5Var = document != null ? new y5(document, ttVar.getPaint().getFontMetricsInt()) : new y5(j3, ttVar.getPaint().getFontMetricsInt());
            y5Var.cacheType = ytVar.d.c;
            spannableString.setSpan(y5Var, 0, spannableString.length(), 33);
            ttVar.setText(ttVar.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            ttVar.setSelection(length, length);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // org.telegram.ui.Components.tx
    public final boolean z() {
        return this.a.y;
    }

    @Override // org.telegram.ui.Components.tx
    public final /* synthetic */ void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.tx
    public final /* synthetic */ void o(k41 k41Var) {
    }

    @Override // org.telegram.ui.Components.tx
    public final /* synthetic */ void r(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.tx
    public final /* synthetic */ void s(int i7) {
    }

    @Override // org.telegram.ui.Components.tx
    public final /* synthetic */ void t(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.tx
    public final /* synthetic */ void y(long j3) {
    }

    @Override // org.telegram.ui.Components.tx
    public final /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Components.tx
    public final /* synthetic */ void w() {
    }

    @Override // org.telegram.ui.Components.tx
    public final /* synthetic */ void e(Object obj, Object obj2) {
    }

    @Override // org.telegram.ui.Components.tx
    public final /* synthetic */ void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.Components.tx
    public final /* synthetic */ void m(View view, TLRPC.Document document, String str, Object obj, org.telegram.messenger.cj cjVar, boolean z10, int i7) {
    }

    @Override // org.telegram.ui.Components.tx
    public final /* synthetic */ void v(View view, Object obj, String str, Object obj2, boolean z10, int i7, int i10) {
    }
}
