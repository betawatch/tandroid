package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class cs extends gs {
    public final /* synthetic */ int M;
    public final /* synthetic */ int N;
    public final /* synthetic */ es O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cs(es esVar, Context context, int i10, int i11) {
        super(context);
        this.O = esVar;
        this.M = i10;
        this.N = i11;
        this.e = 1.0f;
        this.f = new o1.k(this, gs.I);
        this.h = new o1.k(this, gs.J);
        this.n = new o1.k(this, gs.K);
        this.r = new o1.k(this, gs.L);
        this.s = true;
        this.v = 1.0f;
        this.w = 1.0f;
        this.H = false;
        setBackground(null);
        setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        setMovementMethod(null);
        addTextChangedListener(new l0(this, 5));
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        es esVar = this.O;
        int length = esVar.f.length;
        int i10 = this.M;
        if (i10 >= length) {
            return false;
        }
        if (keyEvent.getAction() != 1) {
            return isFocused();
        }
        if (keyCode == 67 && esVar.f[i10].length() == 1) {
            esVar.f[i10].m();
            esVar.f[i10].setText("");
            return true;
        }
        if (keyCode == 67 && esVar.f[i10].length() == 0 && i10 > 0) {
            gs[] gsVarArr = esVar.f;
            gsVarArr[i10 - 1].setSelection(gsVarArr[i10 - 1].length());
            for (int i11 = 0; i11 < i10; i11++) {
                if (i11 == i10 - 1) {
                    esVar.f[i10 - 1].requestFocus();
                } else {
                    esVar.f[i11].clearFocus();
                }
            }
            esVar.f[i10 - 1].m();
            esVar.f[i10 - 1].setText("");
            return true;
        }
        if (keyCode >= 7 && keyCode <= 16) {
            String num = Integer.toString(keyCode - 7);
            if (esVar.f[i10].getText() != null && num.equals(esVar.f[i10].getText().toString())) {
                if (i10 >= this.N - 1) {
                    esVar.a();
                } else {
                    esVar.f[i10 + 1].requestFocus();
                }
                return true;
            }
            if (esVar.f[i10].length() > 0) {
                esVar.f[i10].m();
            }
            esVar.f[i10].setText(num);
        }
        return true;
    }
}
