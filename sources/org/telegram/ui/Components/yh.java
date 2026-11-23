package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.view.KeyEvent;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class yh implements TextWatcher {
    public final /* synthetic */ int a;
    public boolean b;
    public boolean c;
    public final /* synthetic */ KeyEvent.Callback d;

    public /* synthetic */ yh(KeyEvent.Callback callback, int i7) {
        this.a = i7;
        this.d = callback;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        int i7;
        switch (this.a) {
            case 0:
                ui uiVar = (ui) this.d;
                o6 o6Var = uiVar.v1;
                xh xhVar = uiVar.C2;
                o6 o6Var2 = uiVar.u1;
                if (this.c != TextUtils.isEmpty(editable)) {
                    mi miVar = uiVar.w2;
                    if (miVar != null) {
                        miVar.E(miVar.getSelectedItemsCount());
                    }
                    this.c = !this.c;
                }
                boolean z11 = false;
                if (this.b) {
                    for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                        editable.removeSpan(imageSpan);
                    }
                    org.telegram.messenger.j6.l(editable, xhVar.getEditText().getPaint().getFontMetricsInt(), false);
                    this.b = false;
                }
                int codePointCount = Character.codePointCount(editable, 0, editable.length());
                uiVar.G1 = codePointCount;
                uiVar.p1.a(codePointCount > 0, true);
                int i10 = uiVar.F1;
                if (i10 <= 0 || (i7 = i10 - uiVar.G1) > 100) {
                    o6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new y(this, 9));
                    o6Var.setAlpha(0.0f);
                    z10 = true;
                } else {
                    if (i7 < -9999) {
                        i7 = -9999;
                    }
                    long j3 = i7;
                    o6Var2.c(org.telegram.messenger.hd.E(j3, ','), o6Var2.getVisibility() == 0, true);
                    if (o6Var2.getVisibility() != 0) {
                        o6Var2.setVisibility(0);
                        o6Var2.setAlpha(0.0f);
                        o6Var2.setScaleX(0.5f);
                        o6Var2.setScaleY(0.5f);
                    }
                    o6Var2.animate().setListener(null).cancel();
                    o6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                    if (i7 < 0) {
                        org.telegram.ui.ActionBar.t6.Y(o6Var2, org.telegram.ui.ActionBar.m6.p7, uiVar.J0);
                        z10 = false;
                    } else {
                        org.telegram.ui.ActionBar.t6.Y(o6Var2, org.telegram.ui.ActionBar.m6.y6, uiVar.J0);
                        z10 = true;
                    }
                    o6Var.c(org.telegram.messenger.hd.E(j3, ','), false, true);
                    o6Var.setAlpha(1.0f);
                }
                if (uiVar.S2 != z10) {
                    uiVar.S2 = z10;
                    uiVar.G2.invalidate();
                }
                if (!uiVar.X1) {
                    if (xhVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(xhVar.getText().toString().trim())) {
                        z11 = true;
                    }
                    uiVar.C1(z11);
                }
                uiVar.R0(true);
                return;
            default:
                org.telegram.ui.Wallet.ca caVar = (org.telegram.ui.Wallet.ca) this.d;
                if (!this.b) {
                    caVar.f(editable);
                    return;
                }
                this.b = false;
                this.c = true;
                try {
                    editable.append('.');
                    this.c = false;
                    caVar.c.setSelection(editable.length());
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
                org.telegram.ui.Wallet.ca caVar = (org.telegram.ui.Wallet.ca) this.d;
                org.telegram.ui.Wallet.y9 y9Var = caVar.c;
                if (charSequence.length() > 0 && i10 == charSequence.length() && i11 == 0 && y9Var.getLayout() != null) {
                    caVar.O = y9Var.getLayout().getLineLeft(0) - y9Var.getScrollX();
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        switch (this.a) {
            case 0:
                ui uiVar = (ui) this.d;
                if (i11 - i10 >= 1) {
                    this.b = true;
                }
                if (uiVar.C4 == null) {
                    ui.L0(uiVar);
                }
                if (uiVar.C4.getAdapter() != null) {
                    uiVar.C4.setReversed(false);
                    uiVar.C4.getAdapter().U(charSequence, uiVar.C2.getEditText().getSelectionStart(), null, false, false);
                    uiVar.K1();
                    break;
                }
                break;
            default:
                boolean z10 = false;
                this.b = i11 > 0 && TextUtils.equals(charSequence, "0");
                org.telegram.ui.Wallet.ca caVar = (org.telegram.ui.Wallet.ca) this.d;
                if (!caVar.S && !this.c) {
                    if (i10 != 0 || i11 != 0) {
                        org.telegram.ui.Wallet.m7 m7Var = caVar.d;
                        if (i11 > 0 && i11 >= i10) {
                            z10 = true;
                        }
                        if (m7Var.y && m7Var.r && m7Var.E == -1) {
                            rh0 rh0Var = m7Var.h;
                            if (rh0Var == null) {
                                m7Var.e0 = org.telegram.messenger.o10.A(m7Var.e0, z10 ? -160.0f : 160.0f, 360.0f, -360.0f);
                                break;
                            } else if (!rh0Var.b()) {
                                m7Var.h.setProgress(0.0f);
                                m7Var.h.d();
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
