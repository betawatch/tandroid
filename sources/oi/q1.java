package oi;

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.bj;
import org.telegram.messenger.j6;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.h41;
import org.telegram.ui.Components.rx;
import org.telegram.ui.StickersActivity;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class q1 implements rx {
    public final /* synthetic */ z1 a;

    public q1(z1 z1Var) {
        this.a = z1Var;
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
        e1 focusedEditTextOrNull;
        z1 z1Var = this.a;
        if (i7 != 0 && (focusedEditTextOrNull = z1Var.Q.getFocusedEditTextOrNull()) != null) {
            z1Var.S0 = focusedEditTextOrNull;
            z1Var.T0 = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        }
        boolean z10 = i7 != 0;
        z1Var.D0 = z10;
        z1Var.j0(z10);
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.rx
    public final boolean k() {
        e1 f02 = z1.f0(this.a);
        if (f02 == null || f02.length() == 0) {
            return false;
        }
        f02.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // org.telegram.ui.Components.rx
    public final void l(String str) {
        z1 z1Var = this.a;
        e1 f02 = z1.f0(z1Var);
        if (f02 == null) {
            return;
        }
        int g02 = z1.g0(z1Var, f02);
        try {
            CharSequence m10 = j6.m(str, f02.getPaint().getFontMetricsInt(), false, null, 0);
            f02.setText(f02.getText().insert(g02, m10));
            int length = g02 + m10.length();
            f02.setSelection(length, length);
            if (f02 == z1Var.S0) {
                z1Var.T0 = length;
            }
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ float p() {
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.rx
    public final void t(ArrayList arrayList) {
        this.a.presentFragment(new StickersActivity(5, arrayList));
    }

    @Override // org.telegram.ui.Components.rx
    public final void w() {
        this.a.presentFragment(new StickersActivity(0, null));
    }

    @Override // org.telegram.ui.Components.rx
    public final void x(long j3, TLRPC.Document document, String str, boolean z10) {
        z1 z1Var = this.a;
        e1 f02 = z1.f0(z1Var);
        if (f02 == null) {
            return;
        }
        int g02 = z1.g0(z1Var, f02);
        try {
            if (str == null) {
                str = "😀";
            }
            SpannableString spannableString = new SpannableString(str);
            org.telegram.ui.Components.x5 x5Var = document != null ? new org.telegram.ui.Components.x5(document, f02.getPaint().getFontMetricsInt()) : new org.telegram.ui.Components.x5(j3, f02.getPaint().getFontMetricsInt());
            x5Var.cacheType = org.telegram.ui.Components.o5.f();
            spannableString.setSpan(x5Var, 0, spannableString.length(), 33);
            f02.setText(f02.getText().insert(g02, spannableString));
            int length = g02 + spannableString.length();
            f02.setSelection(length, length);
            if (f02 == z1Var.S0) {
                z1Var.T0 = length;
            }
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.ui.Components.rx
    public final boolean z() {
        return this.a.D0;
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ void n() {
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ void u() {
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
    public final /* synthetic */ void y(long j3) {
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ void e(Object obj, Object obj2) {
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ void m(View view, TLRPC.Document document, String str, Object obj, bj bjVar, boolean z10, int i7) {
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ void v(View view, Object obj, String str, Object obj2, boolean z10, int i7, int i10) {
    }
}
