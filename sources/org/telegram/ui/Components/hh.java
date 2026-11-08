package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.view.KeyEvent;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
                        org.telegram.ui.ActionBar.r6.Z(j6Var2, org.telegram.ui.ActionBar.k6.p7, diVar.I0);
                        z9 = false;
                    } else {
                        org.telegram.ui.ActionBar.r6.Z(j6Var2, org.telegram.ui.ActionBar.k6.y6, diVar.I0);
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
                org.telegram.ui.Wallet.l9 l9Var = (org.telegram.ui.Wallet.l9) this.d;
                if (!this.b) {
                    l9Var.f(editable);
                    return;
                }
                this.b = false;
                this.c = true;
                try {
                    editable.append('.');
                    this.c = false;
                    l9Var.c.setSelection(editable.length());
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
                org.telegram.ui.Wallet.l9 l9Var = (org.telegram.ui.Wallet.l9) this.d;
                org.telegram.ui.Wallet.h9 h9Var = l9Var.c;
                if (charSequence.length() > 0 && i10 == charSequence.length() && i11 == 0 && h9Var.getLayout() != null) {
                    l9Var.N = h9Var.getLayout().getLineLeft(0) - h9Var.getScrollX();
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
                org.telegram.ui.Wallet.l9 l9Var = (org.telegram.ui.Wallet.l9) this.d;
                if (!l9Var.R && !this.c) {
                    if (i10 != 0 || i11 != 0) {
                        org.telegram.ui.Wallet.v6 v6Var = l9Var.d;
                        if (i11 > 0 && i11 >= i10) {
                            z9 = true;
                        }
                        if (v6Var.y && v6Var.r && v6Var.D == -1) {
                            ch0 ch0Var = v6Var.h;
                            if (ch0Var == null) {
                                v6Var.d0 = org.telegram.messenger.camera.q.z(v6Var.d0, z9 ? -160.0f : 160.0f, 360.0f, -360.0f);
                                break;
                            } else if (!ch0Var.b()) {
                                v6Var.h.setProgress(0.0f);
                                v6Var.h.d();
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
