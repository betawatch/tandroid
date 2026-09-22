package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class bs extends gs {
    public final /* synthetic */ int M;
    public final /* synthetic */ int N;
    public final /* synthetic */ ds O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bs(ds dsVar, Context context, int i10, int i11) {
        super(context);
        this.O = dsVar;
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
        ds dsVar = this.O;
        int length = dsVar.f.length;
        int i10 = this.M;
        if (i10 >= length) {
            return false;
        }
        if (keyEvent.getAction() != 1) {
            return isFocused();
        }
        if (keyCode == 67 && dsVar.f[i10].length() == 1) {
            dsVar.f[i10].m();
            dsVar.f[i10].setText("");
            return true;
        }
        if (keyCode == 67 && dsVar.f[i10].length() == 0 && i10 > 0) {
            gs[] gsVarArr = dsVar.f;
            gsVarArr[i10 - 1].setSelection(gsVarArr[i10 - 1].length());
            for (int i11 = 0; i11 < i10; i11++) {
                if (i11 == i10 - 1) {
                    dsVar.f[i10 - 1].requestFocus();
                } else {
                    dsVar.f[i11].clearFocus();
                }
            }
            dsVar.f[i10 - 1].m();
            dsVar.f[i10 - 1].setText("");
            return true;
        }
        if (keyCode >= 7 && keyCode <= 16) {
            String num = Integer.toString(keyCode - 7);
            if (dsVar.f[i10].getText() != null && num.equals(dsVar.f[i10].getText().toString())) {
                if (i10 >= this.N - 1) {
                    dsVar.a();
                } else {
                    dsVar.f[i10 + 1].requestFocus();
                }
                return true;
            }
            if (dsVar.f[i10].length() > 0) {
                dsVar.f[i10].m();
            }
            dsVar.f[i10].setText(num);
        }
        return true;
    }
}
