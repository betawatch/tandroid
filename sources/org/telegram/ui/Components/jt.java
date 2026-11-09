package org.telegram.ui.Components;

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class jt implements ix {
    public final /* synthetic */ lt a;

    public jt(lt ltVar) {
        this.a = ltVar;
    }

    @Override // org.telegram.ui.Components.ix
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.Components.ix
    public final /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Components.ix
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Components.ix
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Components.ix
    public final /* synthetic */ int f() {
        return 0;
    }

    @Override // org.telegram.ui.Components.ix
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.Components.ix
    public final void i(int i7) {
        lt ltVar = this.a;
        if (ltVar.b()) {
            ltVar.y = i7 != 0;
            ltVar.y();
            tt0 tt0Var = ltVar.f;
            if (tt0Var != null) {
                tt0Var.R();
            }
        }
    }

    @Override // org.telegram.ui.Components.ix
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.ix
    public final boolean k() {
        ft ftVar = this.a.a;
        if (ftVar.length() == 0) {
            return false;
        }
        ftVar.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // org.telegram.ui.Components.ix
    public final void l(String str) {
        ft ftVar = this.a.a;
        int selectionEnd = ftVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence m10 = org.telegram.messenger.i6.m(str, ftVar.getPaint().getFontMetricsInt(), false, null, 0);
            ftVar.setText(ftVar.getText().insert(selectionEnd, m10));
            int length = selectionEnd + m10.length();
            ftVar.setSelection(length, length);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.ix
    public final void n() {
        lt ltVar = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ltVar.getContext(), ltVar.M);
        String M0 = org.telegram.messenger.id.M0(2131752068, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.id.M0(2131752069, null);
        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131752099, null), new u(this, 28));
        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
        org.telegram.ui.ActionBar.f2 f2Var = ltVar.h;
        if (f2Var != null) {
            f2Var.showDialog(u1Var);
        } else {
            alertDialog$Builder.p();
        }
    }

    @Override // org.telegram.ui.Components.ix
    public final /* synthetic */ float p() {
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.ix
    public final void q() {
        org.telegram.ui.ActionBar.f2 f2Var = this.a.h;
        if (f2Var == null) {
            new ug.w0((org.telegram.ui.ActionBar.f2) new bi.w4(this, 5), 11, false).show();
        } else {
            f2Var.showDialog(new ug.w0(f2Var, 11, false));
        }
    }

    @Override // org.telegram.ui.Components.ix
    public final void x(long j3, TLRPC.Document document, String str, boolean z9) {
        lt ltVar = this.a;
        ft ftVar = ltVar.a;
        int selectionEnd = ftVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            r5 r5Var = document != null ? new r5(document, ftVar.getPaint().getFontMetricsInt()) : new r5(j3, ftVar.getPaint().getFontMetricsInt());
            r5Var.cacheType = ltVar.d.c;
            spannableString.setSpan(r5Var, 0, spannableString.length(), 33);
            ftVar.setText(ftVar.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            ftVar.setSelection(length, length);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // org.telegram.ui.Components.ix
    public final boolean z() {
        return this.a.y;
    }

    @Override // org.telegram.ui.Components.ix
    public final /* synthetic */ void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.ix
    public final /* synthetic */ void o(u31 u31Var) {
    }

    @Override // org.telegram.ui.Components.ix
    public final /* synthetic */ void r(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.ix
    public final /* synthetic */ void s(int i7) {
    }

    @Override // org.telegram.ui.Components.ix
    public final /* synthetic */ void t(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.ix
    public final /* synthetic */ void y(long j3) {
    }

    @Override // org.telegram.ui.Components.ix
    public final /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Components.ix
    public final /* synthetic */ void w() {
    }

    @Override // org.telegram.ui.Components.ix
    public final /* synthetic */ void e(Object obj, Object obj2) {
    }

    @Override // org.telegram.ui.Components.ix
    public final /* synthetic */ void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z9) {
    }

    @Override // org.telegram.ui.Components.ix
    public final /* synthetic */ void m(View view, TLRPC.Document document, String str, Object obj, org.telegram.messenger.ej ejVar, boolean z9, int i7) {
    }

    @Override // org.telegram.ui.Components.ix
    public final /* synthetic */ void v(View view, Object obj, String str, Object obj2, boolean z9, int i7, int i10) {
    }
}
