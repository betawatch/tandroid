package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.view.KeyEvent;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class xh implements TextWatcher {
    public final /* synthetic */ int a;
    public boolean b;
    public boolean c;
    public final /* synthetic */ KeyEvent.Callback d;

    public /* synthetic */ xh(KeyEvent.Callback callback, int i7) {
        this.a = i7;
        this.d = callback;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        int i7;
        switch (this.a) {
            case 0:
                ti tiVar = (ti) this.d;
                n6 n6Var = tiVar.v1;
                wh whVar = tiVar.C2;
                n6 n6Var2 = tiVar.u1;
                if (this.c != TextUtils.isEmpty(editable)) {
                    li liVar = tiVar.w2;
                    if (liVar != null) {
                        liVar.D(liVar.getSelectedItemsCount());
                    }
                    this.c = !this.c;
                }
                boolean z11 = false;
                if (this.b) {
                    for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                        editable.removeSpan(imageSpan);
                    }
                    org.telegram.messenger.j6.l(editable, whVar.getEditText().getPaint().getFontMetricsInt(), false);
                    this.b = false;
                }
                int codePointCount = Character.codePointCount(editable, 0, editable.length());
                tiVar.G1 = codePointCount;
                tiVar.p1.a(codePointCount > 0, true);
                int i10 = tiVar.F1;
                if (i10 <= 0 || (i7 = i10 - tiVar.G1) > 100) {
                    n6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new x(this, 9));
                    n6Var.setAlpha(0.0f);
                    z10 = true;
                } else {
                    if (i7 < -9999) {
                        i7 = -9999;
                    }
                    long j3 = i7;
                    n6Var2.c(org.telegram.messenger.gd.E(j3, ','), n6Var2.getVisibility() == 0, true);
                    if (n6Var2.getVisibility() != 0) {
                        n6Var2.setVisibility(0);
                        n6Var2.setAlpha(0.0f);
                        n6Var2.setScaleX(0.5f);
                        n6Var2.setScaleY(0.5f);
                    }
                    n6Var2.animate().setListener(null).cancel();
                    n6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                    if (i7 < 0) {
                        org.telegram.ui.ActionBar.u6.Y(n6Var2, org.telegram.ui.ActionBar.n6.p7, tiVar.J0);
                        z10 = false;
                    } else {
                        org.telegram.ui.ActionBar.u6.Y(n6Var2, org.telegram.ui.ActionBar.n6.y6, tiVar.J0);
                        z10 = true;
                    }
                    n6Var.c(org.telegram.messenger.gd.E(j3, ','), false, true);
                    n6Var.setAlpha(1.0f);
                }
                if (tiVar.S2 != z10) {
                    tiVar.S2 = z10;
                    tiVar.G2.invalidate();
                }
                if (!tiVar.X1) {
                    if (whVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(whVar.getText().toString().trim())) {
                        z11 = true;
                    }
                    tiVar.C1(z11);
                }
                tiVar.R0(true);
                return;
            default:
                org.telegram.ui.Wallet.da daVar = (org.telegram.ui.Wallet.da) this.d;
                if (!this.b) {
                    daVar.f(editable);
                    return;
                }
                this.b = false;
                this.c = true;
                try {
                    editable.append('.');
                    this.c = false;
                    daVar.c.setSelection(editable.length());
                    return;
                } catch (Throwable th2) {
                    this.c = false;
                    throw th2;
                }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        switch (this.a) {
            case 0:
                break;
            default:
                org.telegram.ui.Wallet.da daVar = (org.telegram.ui.Wallet.da) this.d;
                org.telegram.ui.Wallet.z9 z9Var = daVar.c;
                if (charSequence.length() > 0 && i10 == charSequence.length() && i11 == 0 && z9Var.getLayout() != null) {
                    daVar.O = z9Var.getLayout().getLineLeft(0) - z9Var.getScrollX();
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        switch (this.a) {
            case 0:
                ti tiVar = (ti) this.d;
                if (i11 - i10 >= 1) {
                    this.b = true;
                }
                if (tiVar.C4 == null) {
                    ti.L0(tiVar);
                }
                if (tiVar.C4.getAdapter() != null) {
                    tiVar.C4.setReversed(false);
                    tiVar.C4.getAdapter().U(charSequence, tiVar.C2.getEditText().getSelectionStart(), null, false, false);
                    tiVar.K1();
                    break;
                }
                break;
            default:
                boolean z10 = false;
                this.b = i11 > 0 && TextUtils.equals(charSequence, "0");
                org.telegram.ui.Wallet.da daVar = (org.telegram.ui.Wallet.da) this.d;
                if (!daVar.S && !this.c) {
                    if (i10 != 0 || i11 != 0) {
                        org.telegram.ui.Wallet.n7 n7Var = daVar.d;
                        if (i11 > 0 && i11 >= i10) {
                            z10 = true;
                        }
                        if (n7Var.y && n7Var.r && n7Var.E == -1) {
                            qh0 qh0Var = n7Var.h;
                            if (qh0Var == null) {
                                n7Var.e0 = org.telegram.messenger.m10.A(n7Var.e0, z10 ? -160.0f : 160.0f, 360.0f, -360.0f);
                                break;
                            } else if (!qh0Var.b()) {
                                n7Var.h.setProgress(0.0f);
                                n7Var.h.d();
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }

    private final void a(int i7, int i10, int i11, CharSequence charSequence) {
    }
}
