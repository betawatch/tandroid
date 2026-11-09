package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.view.KeyEvent;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class hh implements TextWatcher {
    public final /* synthetic */ int a;
    public boolean b;
    public boolean c;
    public final /* synthetic */ KeyEvent.Callback d;

    public /* synthetic */ hh(KeyEvent.Callback callback, int i7) {
        this.a = i7;
        this.d = callback;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z9;
        int i7;
        switch (this.a) {
            case 0:
                di diVar = (di) this.d;
                j6 j6Var = diVar.r1;
                gh ghVar = diVar.y2;
                j6 j6Var2 = diVar.q1;
                if (this.c != TextUtils.isEmpty(editable)) {
                    vh vhVar = diVar.s2;
                    if (vhVar != null) {
                        vhVar.D(vhVar.getSelectedItemsCount());
                    }
                    this.c = !this.c;
                }
                boolean z10 = false;
                if (this.b) {
                    for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                        editable.removeSpan(imageSpan);
                    }
                    org.telegram.messenger.i6.l(editable, ghVar.getEditText().getPaint().getFontMetricsInt(), false);
                    this.b = false;
                }
                int codePointCount = Character.codePointCount(editable, 0, editable.length());
                diVar.C1 = codePointCount;
                diVar.l1.a(codePointCount > 0, true);
                int i10 = diVar.B1;
                if (i10 <= 0 || (i7 = i10 - diVar.C1) > 100) {
                    j6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new z5(this, 8));
                    j6Var.setAlpha(0.0f);
                    z9 = true;
                } else {
                    if (i7 < -9999) {
                        i7 = -9999;
                    }
                    long j3 = i7;
                    j6Var2.c(org.telegram.messenger.id.E(j3, ','), j6Var2.getVisibility() == 0, true);
                    if (j6Var2.getVisibility() != 0) {
                        j6Var2.setVisibility(0);
                        j6Var2.setAlpha(0.0f);
                        j6Var2.setScaleX(0.5f);
                        j6Var2.setScaleY(0.5f);
                    }
                    j6Var2.animate().setListener(null).cancel();
                    j6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                    if (i7 < 0) {
                        org.telegram.ui.ActionBar.s6.Y(j6Var2, org.telegram.ui.ActionBar.l6.p7, diVar.I0);
                        z9 = false;
                    } else {
                        org.telegram.ui.ActionBar.s6.Y(j6Var2, org.telegram.ui.ActionBar.l6.y6, diVar.I0);
                        z9 = true;
                    }
                    j6Var.c(org.telegram.messenger.id.E(j3, ','), false, true);
                    j6Var.setAlpha(1.0f);
                }
                if (diVar.O2 != z9) {
                    diVar.O2 = z9;
                    diVar.C2.invalidate();
                }
                if (!diVar.T1) {
                    if (ghVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(ghVar.getText().toString().trim())) {
                        z10 = true;
                    }
                    diVar.B1(z10);
                }
                diVar.Q0(true);
                return;
            default:
                org.telegram.ui.Wallet.k9 k9Var = (org.telegram.ui.Wallet.k9) this.d;
                if (!this.b) {
                    k9Var.f(editable);
                    return;
                }
                this.b = false;
                this.c = true;
                try {
                    editable.append('.');
                    this.c = false;
                    k9Var.c.setSelection(editable.length());
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
                org.telegram.ui.Wallet.k9 k9Var = (org.telegram.ui.Wallet.k9) this.d;
                org.telegram.ui.Wallet.g9 g9Var = k9Var.c;
                if (charSequence.length() > 0 && i10 == charSequence.length() && i11 == 0 && g9Var.getLayout() != null) {
                    k9Var.N = g9Var.getLayout().getLineLeft(0) - g9Var.getScrollX();
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        switch (this.a) {
            case 0:
                di diVar = (di) this.d;
                if (i11 - i10 >= 1) {
                    this.b = true;
                }
                if (diVar.y4 == null) {
                    di.K0(diVar);
                }
                if (diVar.y4.getAdapter() != null) {
                    diVar.y4.setReversed(false);
                    diVar.y4.getAdapter().U(charSequence, diVar.y2.getEditText().getSelectionStart(), null, false, false);
                    diVar.J1();
                    break;
                }
                break;
            default:
                boolean z9 = false;
                this.b = i11 > 0 && TextUtils.equals(charSequence, "0");
                org.telegram.ui.Wallet.k9 k9Var = (org.telegram.ui.Wallet.k9) this.d;
                if (!k9Var.R && !this.c) {
                    if (i10 != 0 || i11 != 0) {
                        org.telegram.ui.Wallet.u6 u6Var = k9Var.d;
                        if (i11 > 0 && i11 >= i10) {
                            z9 = true;
                        }
                        if (u6Var.y && u6Var.r && u6Var.D == -1) {
                            dh0 dh0Var = u6Var.h;
                            if (dh0Var == null) {
                                u6Var.d0 = org.telegram.messenger.camera.q.z(u6Var.d0, z9 ? -160.0f : 160.0f, 360.0f, -360.0f);
                                break;
                            } else if (!dh0Var.b()) {
                                u6Var.h.setProgress(0.0f);
                                u6Var.h.d();
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
