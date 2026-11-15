package org.telegram.ui.Components;

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class pt implements mx {
    public final /* synthetic */ rt a;

    public pt(rt rtVar) {
        this.a = rtVar;
    }

    @Override // org.telegram.ui.Components.mx
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.Components.mx
    public final /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Components.mx
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Components.mx
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Components.mx
    public final /* synthetic */ int f() {
        return 0;
    }

    @Override // org.telegram.ui.Components.mx
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.Components.mx
    public final void i(int i7) {
        rt rtVar = this.a;
        if (rtVar.b()) {
            rtVar.y = i7 != 0;
            rtVar.y();
            st0 st0Var = rtVar.f;
            if (st0Var != null) {
                st0Var.R();
            }
        }
    }

    @Override // org.telegram.ui.Components.mx
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.mx
    public final boolean k() {
        mt mtVar = this.a.a;
        if (mtVar.length() == 0) {
            return false;
        }
        mtVar.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // org.telegram.ui.Components.mx
    public final void l(String str) {
        mt mtVar = this.a.a;
        int selectionEnd = mtVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence m10 = org.telegram.messenger.j6.m(str, mtVar.getPaint().getFontMetricsInt(), false, null, 0);
            mtVar.setText(mtVar.getText().insert(selectionEnd, m10));
            int length = selectionEnd + m10.length();
            mtVar.setSelection(length, length);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.mx
    public final void n() {
        rt rtVar = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, rtVar.getContext(), rtVar.N);
        String M0 = org.telegram.messenger.hd.M0(2131752068, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = M0;
        t1Var.U = org.telegram.messenger.hd.M0(2131752069, null);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752099, null), new s(this, 28));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        org.telegram.ui.ActionBar.e2 e2Var = rtVar.h;
        if (e2Var != null) {
            e2Var.showDialog(t1Var);
        } else {
            alertDialog$Builder.p();
        }
    }

    @Override // org.telegram.ui.Components.mx
    public final /* synthetic */ float p() {
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.mx
    public final void q() {
        org.telegram.ui.ActionBar.e2 e2Var = this.a.h;
        if (e2Var == null) {
            new ug.x0((org.telegram.ui.ActionBar.e2) new bi.t6(this, 6), 11, false).show();
        } else {
            e2Var.showDialog(new ug.x0(e2Var, 11, false));
        }
    }

    @Override // org.telegram.ui.Components.mx
    public final void x(long j3, TLRPC.Document document, String str, boolean z10) {
        rt rtVar = this.a;
        mt mtVar = rtVar.a;
        int selectionEnd = mtVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            p5 p5Var = document != null ? new p5(document, mtVar.getPaint().getFontMetricsInt()) : new p5(j3, mtVar.getPaint().getFontMetricsInt());
            p5Var.cacheType = rtVar.d.c;
            spannableString.setSpan(p5Var, 0, spannableString.length(), 33);
            mtVar.setText(mtVar.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            mtVar.setSelection(length, length);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // org.telegram.ui.Components.mx
    public final boolean z() {
        return this.a.y;
    }

    @Override // org.telegram.ui.Components.mx
    public final /* synthetic */ void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.mx
    public final /* synthetic */ void o(x31 x31Var) {
    }

    @Override // org.telegram.ui.Components.mx
    public final /* synthetic */ void r(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.mx
    public final /* synthetic */ void s(int i7) {
    }

    @Override // org.telegram.ui.Components.mx
    public final /* synthetic */ void t(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.mx
    public final /* synthetic */ void y(long j3) {
    }

    @Override // org.telegram.ui.Components.mx
    public final /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Components.mx
    public final /* synthetic */ void w() {
    }

    @Override // org.telegram.ui.Components.mx
    public final /* synthetic */ void e(Object obj, Object obj2) {
    }

    @Override // org.telegram.ui.Components.mx
    public final /* synthetic */ void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.Components.mx
    public final /* synthetic */ void m(View view, TLRPC.Document document, String str, Object obj, org.telegram.messenger.cj cjVar, boolean z10, int i7) {
    }

    @Override // org.telegram.ui.Components.mx
    public final /* synthetic */ void v(View view, Object obj, String str, Object obj2, boolean z10, int i7, int i10) {
    }
}
