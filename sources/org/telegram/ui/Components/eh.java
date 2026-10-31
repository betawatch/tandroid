package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.view.KeyEvent;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class eh implements TextWatcher {
    public final /* synthetic */ int a;
    public boolean b;
    public boolean c;
    public final /* synthetic */ KeyEvent.Callback d;

    public /* synthetic */ eh(KeyEvent.Callback callback, int i10) {
        this.a = i10;
        this.d = callback;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        int i10;
        switch (this.a) {
            case 0:
                bi biVar = (bi) this.d;
                f6 f6Var = biVar.r1;
                dh dhVar = biVar.y2;
                f6 f6Var2 = biVar.q1;
                if (this.c != TextUtils.isEmpty(editable)) {
                    uh uhVar = biVar.s2;
                    if (uhVar != null) {
                        uhVar.D(uhVar.getSelectedItemsCount());
                    }
                    this.c = !this.c;
                }
                boolean z11 = false;
                if (this.b) {
                    for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                        editable.removeSpan(imageSpan);
                    }
                    org.telegram.messenger.k6.l(editable, dhVar.getEditText().getPaint().getFontMetricsInt(), false);
                    this.b = false;
                }
                int codePointCount = Character.codePointCount(editable, 0, editable.length());
                biVar.C1 = codePointCount;
                biVar.l1.a(codePointCount > 0, true);
                int i11 = biVar.B1;
                if (i11 <= 0 || (i10 = i11 - biVar.C1) > 100) {
                    f6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new w5(this, 8));
                    f6Var.setAlpha(0.0f);
                    z10 = true;
                } else {
                    if (i10 < -9999) {
                        i10 = -9999;
                    }
                    long j10 = i10;
                    f6Var2.c(org.telegram.messenger.cd.E(j10, ','), f6Var2.getVisibility() == 0, true);
                    if (f6Var2.getVisibility() != 0) {
                        f6Var2.setVisibility(0);
                        f6Var2.setAlpha(0.0f);
                        f6Var2.setScaleX(0.5f);
                        f6Var2.setScaleY(0.5f);
                    }
                    f6Var2.animate().setListener(null).cancel();
                    f6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                    if (i10 < 0) {
                        org.telegram.ui.ActionBar.a7.Z(f6Var2, org.telegram.ui.ActionBar.t6.p7, biVar.I0);
                        z10 = false;
                    } else {
                        org.telegram.ui.ActionBar.a7.Z(f6Var2, org.telegram.ui.ActionBar.t6.y6, biVar.I0);
                        z10 = true;
                    }
                    f6Var.c(org.telegram.messenger.cd.E(j10, ','), false, true);
                    f6Var.setAlpha(1.0f);
                }
                if (biVar.O2 != z10) {
                    biVar.O2 = z10;
                    biVar.C2.invalidate();
                }
                if (!biVar.T1) {
                    if (dhVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(dhVar.getText().toString().trim())) {
                        z11 = true;
                    }
                    biVar.A1(z11);
                }
                biVar.Q0(true);
                return;
            default:
                org.telegram.ui.Wallet.q9 q9Var = (org.telegram.ui.Wallet.q9) this.d;
                if (!this.b) {
                    q9Var.f(editable);
                    return;
                }
                this.b = false;
                this.c = true;
                try {
                    editable.append('.');
                    this.c = false;
                    q9Var.c.setSelection(editable.length());
                    return;
                } catch (Throwable th2) {
                    this.c = false;
                    throw th2;
                }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.a) {
            case 0:
                break;
            default:
                org.telegram.ui.Wallet.q9 q9Var = (org.telegram.ui.Wallet.q9) this.d;
                org.telegram.ui.Wallet.m9 m9Var = q9Var.c;
                if (charSequence.length() > 0 && i11 == charSequence.length() && i12 == 0 && m9Var.getLayout() != null) {
                    q9Var.N = m9Var.getLayout().getLineLeft(0) - m9Var.getScrollX();
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.a) {
            case 0:
                bi biVar = (bi) this.d;
                if (i12 - i11 >= 1) {
                    this.b = true;
                }
                if (biVar.y4 == null) {
                    bi.K0(biVar);
                }
                if (biVar.y4.getAdapter() != null) {
                    biVar.y4.setReversed(false);
                    biVar.y4.getAdapter().U(charSequence, biVar.y2.getEditText().getSelectionStart(), null, false, false);
                    biVar.I1();
                    break;
                }
                break;
            default:
                boolean z10 = false;
                this.b = i12 > 0 && TextUtils.equals(charSequence, "0");
                org.telegram.ui.Wallet.q9 q9Var = (org.telegram.ui.Wallet.q9) this.d;
                if (!q9Var.R && !this.c) {
                    if (i11 != 0 || i12 != 0) {
                        org.telegram.ui.Wallet.a7 a7Var = q9Var.d;
                        if (i12 > 0 && i12 >= i11) {
                            z10 = true;
                        }
                        if (a7Var.y && a7Var.r && a7Var.D == -1) {
                            ei0 ei0Var = a7Var.h;
                            if (ei0Var == null) {
                                a7Var.d0 = org.telegram.messenger.z20.z(a7Var.d0, z10 ? -160.0f : 160.0f, 360.0f, -360.0f);
                                break;
                            } else if (!ei0Var.b()) {
                                a7Var.h.setProgress(0.0f);
                                a7Var.h.d();
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
