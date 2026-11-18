package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.view.KeyEvent;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class wh implements TextWatcher {
    public final /* synthetic */ int a;
    public boolean b;
    public boolean c;
    public final /* synthetic */ KeyEvent.Callback d;

    public /* synthetic */ wh(KeyEvent.Callback callback, int i7) {
        this.a = i7;
        this.d = callback;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        int i7;
        switch (this.a) {
            case 0:
                si siVar = (si) this.d;
                n6 n6Var = siVar.v1;
                vh vhVar = siVar.C2;
                n6 n6Var2 = siVar.u1;
                if (this.c != TextUtils.isEmpty(editable)) {
                    ki kiVar = siVar.w2;
                    if (kiVar != null) {
                        kiVar.E(kiVar.getSelectedItemsCount());
                    }
                    this.c = !this.c;
                }
                boolean z11 = false;
                if (this.b) {
                    for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                        editable.removeSpan(imageSpan);
                    }
                    org.telegram.messenger.j6.l(editable, vhVar.getEditText().getPaint().getFontMetricsInt(), false);
                    this.b = false;
                }
                int codePointCount = Character.codePointCount(editable, 0, editable.length());
                siVar.G1 = codePointCount;
                siVar.p1.a(codePointCount > 0, true);
                int i10 = siVar.F1;
                if (i10 <= 0 || (i7 = i10 - siVar.G1) > 100) {
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
                        org.telegram.ui.ActionBar.u6.Y(n6Var2, org.telegram.ui.ActionBar.n6.p7, siVar.J0);
                        z10 = false;
                    } else {
                        org.telegram.ui.ActionBar.u6.Y(n6Var2, org.telegram.ui.ActionBar.n6.y6, siVar.J0);
                        z10 = true;
                    }
                    n6Var.c(org.telegram.messenger.gd.E(j3, ','), false, true);
                    n6Var.setAlpha(1.0f);
                }
                if (siVar.S2 != z10) {
                    siVar.S2 = z10;
                    siVar.G2.invalidate();
                }
                if (!siVar.X1) {
                    if (vhVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(vhVar.getText().toString().trim())) {
                        z11 = true;
                    }
                    siVar.C1(z11);
                }
                siVar.R0(true);
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
                si siVar = (si) this.d;
                if (i11 - i10 >= 1) {
                    this.b = true;
                }
                if (siVar.C4 == null) {
                    si.L0(siVar);
                }
                if (siVar.C4.getAdapter() != null) {
                    siVar.C4.setReversed(false);
                    siVar.C4.getAdapter().U(charSequence, siVar.C2.getEditText().getSelectionStart(), null, false, false);
                    siVar.K1();
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
                            ph0 ph0Var = m7Var.h;
                            if (ph0Var == null) {
                                m7Var.e0 = org.telegram.messenger.n10.A(m7Var.e0, z10 ? -160.0f : 160.0f, 360.0f, -360.0f);
                                break;
                            } else if (!ph0Var.b()) {
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
