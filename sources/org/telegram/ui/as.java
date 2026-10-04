package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class as extends es {
    public final /* synthetic */ int M;
    public final /* synthetic */ int N;
    public final /* synthetic */ cs O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public as(cs csVar, Context context, int i10, int i11) {
        super(context);
        this.O = csVar;
        this.M = i10;
        this.N = i11;
        this.e = 1.0f;
        this.f = new o1.k(this, es.I);
        this.h = new o1.k(this, es.J);
        this.n = new o1.k(this, es.K);
        this.r = new o1.k(this, es.L);
        this.s = true;
        this.v = 1.0f;
        this.w = 1.0f;
        this.H = false;
        setBackground(null);
        setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.G6, false));
        setMovementMethod(null);
        addTextChangedListener(new m0(this, 5));
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        cs csVar = this.O;
        int length = csVar.f.length;
        int i10 = this.M;
        if (i10 >= length) {
            return false;
        }
        if (keyEvent.getAction() != 1) {
            return isFocused();
        }
        if (keyCode == 67 && csVar.f[i10].length() == 1) {
            csVar.f[i10].m();
            csVar.f[i10].setText("");
            return true;
        }
        if (keyCode == 67 && csVar.f[i10].length() == 0 && i10 > 0) {
            es[] esVarArr = csVar.f;
            esVarArr[i10 - 1].setSelection(esVarArr[i10 - 1].length());
            for (int i11 = 0; i11 < i10; i11++) {
                if (i11 == i10 - 1) {
                    csVar.f[i10 - 1].requestFocus();
                } else {
                    csVar.f[i11].clearFocus();
                }
            }
            csVar.f[i10 - 1].m();
            csVar.f[i10 - 1].setText("");
            return true;
        }
        if (keyCode >= 7 && keyCode <= 16) {
            String num = Integer.toString(keyCode - 7);
            if (csVar.f[i10].getText() != null && num.equals(csVar.f[i10].getText().toString())) {
                if (i10 >= this.N - 1) {
                    csVar.a();
                } else {
                    csVar.f[i10 + 1].requestFocus();
                }
                return true;
            }
            if (csVar.f[i10].length() > 0) {
                csVar.f[i10].m();
            }
            csVar.f[i10].setText(num);
        }
        return true;
    }
}
