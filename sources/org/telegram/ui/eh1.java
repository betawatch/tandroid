package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class eh1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mh1 b;

    public /* synthetic */ eh1(mh1 mh1Var, int i10) {
        this.a = i10;
        this.b = mh1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                mh1 mh1Var = this.b;
                EditTextBoldCursor editTextBoldCursor = mh1Var.n;
                if (editTextBoldCursor != null && editTextBoldCursor.getVisibility() == 0) {
                    mh1Var.n.requestFocus();
                    AndroidUtilities.showKeyboard(mh1Var.n);
                    break;
                }
                break;
            case 1:
                mh1 mh1Var2 = this.b;
                de0 de0Var = mh1Var2.w;
                if (de0Var != null && de0Var.getVisibility() == 0) {
                    mh1Var2.w.f[0].requestFocus();
                    break;
                }
                break;
            case 2:
                int i10 = 0;
                while (true) {
                    hs[] hsVarArr = this.b.w.f;
                    if (i10 >= hsVarArr.length) {
                        break;
                    } else {
                        hsVarArr[i10].i(0.0f);
                        i10++;
                    }
                }
            case 3:
                mh1 mh1Var3 = this.b;
                EditTextBoldCursor editTextBoldCursor2 = mh1Var3.n;
                if (editTextBoldCursor2 != null) {
                    if (editTextBoldCursor2.length() != 0) {
                        mh1Var3.f0[2].P(49);
                        mh1Var3.f0[2].S(0.0f, false);
                        mh1Var3.a.d();
                        break;
                    } else {
                        mh1Var3.F0(true);
                        break;
                    }
                }
                break;
            case 4:
                mh1 mh1Var4 = this.b;
                if (mh1Var4.g0 != null) {
                    mh1Var4.F0(false);
                    break;
                }
                break;
            case 5:
                mh1.f0(this.b);
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new eh1(this.b, 7), 150L);
                break;
            default:
                for (hs hsVar : this.b.w.f) {
                    hsVar.i(0.0f);
                }
                break;
        }
    }
}
