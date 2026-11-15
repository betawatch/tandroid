package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.view.KeyEvent;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class oh implements TextWatcher {
    public final /* synthetic */ int a;
    public boolean b;
    public boolean c;
    public final /* synthetic */ KeyEvent.Callback d;

    public /* synthetic */ oh(KeyEvent.Callback callback, int i7) {
        this.a = i7;
        this.d = callback;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        int i7;
        switch (this.a) {
            case 0:
                ki kiVar = (ki) this.d;
                h6 h6Var = kiVar.v1;
                nh nhVar = kiVar.C2;
                h6 h6Var2 = kiVar.u1;
                if (this.c != TextUtils.isEmpty(editable)) {
                    ci ciVar = kiVar.w2;
                    if (ciVar != null) {
                        ciVar.D(ciVar.getSelectedItemsCount());
                    }
                    this.c = !this.c;
                }
                boolean z11 = false;
                if (this.b) {
                    for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                        editable.removeSpan(imageSpan);
                    }
                    org.telegram.messenger.j6.l(editable, nhVar.getEditText().getPaint().getFontMetricsInt(), false);
                    this.b = false;
                }
                int codePointCount = Character.codePointCount(editable, 0, editable.length());
                kiVar.G1 = codePointCount;
                kiVar.p1.a(codePointCount > 0, true);
                int i10 = kiVar.F1;
                if (i10 <= 0 || (i7 = i10 - kiVar.G1) > 100) {
                    h6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new x5(this, 8));
                    h6Var.setAlpha(0.0f);
                    z10 = true;
                } else {
                    if (i7 < -9999) {
                        i7 = -9999;
                    }
                    long j3 = i7;
                    h6Var2.c(org.telegram.messenger.hd.E(j3, ','), h6Var2.getVisibility() == 0, true);
                    if (h6Var2.getVisibility() != 0) {
                        h6Var2.setVisibility(0);
                        h6Var2.setAlpha(0.0f);
                        h6Var2.setScaleX(0.5f);
                        h6Var2.setScaleY(0.5f);
                    }
                    h6Var2.animate().setListener(null).cancel();
                    h6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                    if (i7 < 0) {
                        org.telegram.ui.ActionBar.q6.Y(h6Var2, org.telegram.ui.ActionBar.j6.p7, kiVar.J0);
                        z10 = false;
                    } else {
                        org.telegram.ui.ActionBar.q6.Y(h6Var2, org.telegram.ui.ActionBar.j6.y6, kiVar.J0);
                        z10 = true;
                    }
                    h6Var.c(org.telegram.messenger.hd.E(j3, ','), false, true);
                    h6Var.setAlpha(1.0f);
                }
                if (kiVar.S2 != z10) {
                    kiVar.S2 = z10;
                    kiVar.G2.invalidate();
                }
                if (!kiVar.X1) {
                    if (nhVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(nhVar.getText().toString().trim())) {
                        z11 = true;
                    }
                    kiVar.B1(z11);
                }
                kiVar.Q0(true);
                return;
            default:
                org.telegram.ui.Wallet.o9 o9Var = (org.telegram.ui.Wallet.o9) this.d;
                if (!this.b) {
                    o9Var.f(editable);
                    return;
                }
                this.b = false;
                this.c = true;
                try {
                    editable.append('.');
                    this.c = false;
                    o9Var.c.setSelection(editable.length());
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
                org.telegram.ui.Wallet.o9 o9Var = (org.telegram.ui.Wallet.o9) this.d;
                org.telegram.ui.Wallet.k9 k9Var = o9Var.c;
                if (charSequence.length() > 0 && i10 == charSequence.length() && i11 == 0 && k9Var.getLayout() != null) {
                    o9Var.O = k9Var.getLayout().getLineLeft(0) - k9Var.getScrollX();
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        switch (this.a) {
            case 0:
                ki kiVar = (ki) this.d;
                if (i11 - i10 >= 1) {
                    this.b = true;
                }
                if (kiVar.C4 == null) {
                    ki.K0(kiVar);
                }
                if (kiVar.C4.getAdapter() != null) {
                    kiVar.C4.setReversed(false);
                    kiVar.C4.getAdapter().U(charSequence, kiVar.C2.getEditText().getSelectionStart(), null, false, false);
                    kiVar.J1();
                    break;
                }
                break;
            default:
                boolean z10 = false;
                this.b = i11 > 0 && TextUtils.equals(charSequence, "0");
                org.telegram.ui.Wallet.o9 o9Var = (org.telegram.ui.Wallet.o9) this.d;
                if (!o9Var.S && !this.c) {
                    if (i10 != 0 || i11 != 0) {
                        org.telegram.ui.Wallet.w6 w6Var = o9Var.d;
                        if (i11 > 0 && i11 >= i10) {
                            z10 = true;
                        }
                        if (w6Var.y && w6Var.r && w6Var.E == -1) {
                            fh0 fh0Var = w6Var.h;
                            if (fh0Var == null) {
                                w6Var.e0 = org.telegram.messenger.i20.z(w6Var.e0, z10 ? -160.0f : 160.0f, 360.0f, -360.0f);
                                break;
                            } else if (!fh0Var.b()) {
                                w6Var.h.setProgress(0.0f);
                                w6Var.h.d();
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
