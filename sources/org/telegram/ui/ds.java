package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ds extends hs {
    public final /* synthetic */ int M;
    public final /* synthetic */ int N;
    public final /* synthetic */ fs O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ds(fs fsVar, Context context, int i10, int i11) {
        super(context);
        this.O = fsVar;
        this.M = i10;
        this.N = i11;
        this.e = 1.0f;
        this.f = new o1.k(this, hs.I);
        this.h = new o1.k(this, hs.J);
        this.n = new o1.k(this, hs.K);
        this.r = new o1.k(this, hs.L);
        this.s = true;
        this.v = 1.0f;
        this.w = 1.0f;
        this.H = false;
        setBackground(null);
        setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        setMovementMethod(null);
        addTextChangedListener(new m0(this, 5));
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        fs fsVar = this.O;
        int length = fsVar.f.length;
        int i10 = this.M;
        if (i10 >= length) {
            return false;
        }
        if (keyEvent.getAction() != 1) {
            return isFocused();
        }
        if (keyCode == 67 && fsVar.f[i10].length() == 1) {
            fsVar.f[i10].m();
            fsVar.f[i10].setText("");
            return true;
        }
        if (keyCode == 67 && fsVar.f[i10].length() == 0 && i10 > 0) {
            hs[] hsVarArr = fsVar.f;
            hsVarArr[i10 - 1].setSelection(hsVarArr[i10 - 1].length());
            for (int i11 = 0; i11 < i10; i11++) {
                if (i11 == i10 - 1) {
                    fsVar.f[i10 - 1].requestFocus();
                } else {
                    fsVar.f[i11].clearFocus();
                }
            }
            fsVar.f[i10 - 1].m();
            fsVar.f[i10 - 1].setText("");
            return true;
        }
        if (keyCode >= 7 && keyCode <= 16) {
            String num = Integer.toString(keyCode - 7);
            if (fsVar.f[i10].getText() != null && num.equals(fsVar.f[i10].getText().toString())) {
                if (i10 >= this.N - 1) {
                    fsVar.a();
                } else {
                    fsVar.f[i10 + 1].requestFocus();
                }
                return true;
            }
            if (fsVar.f[i10].length() > 0) {
                fsVar.f[i10].m();
            }
            fsVar.f[i10].setText(num);
        }
        return true;
    }
}
