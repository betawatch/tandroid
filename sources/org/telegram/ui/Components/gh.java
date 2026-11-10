package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.view.KeyEvent;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class gh implements TextWatcher {
    public final /* synthetic */ int a;
    public boolean b;
    public boolean c;
    public final /* synthetic */ KeyEvent.Callback d;

    public /* synthetic */ gh(KeyEvent.Callback callback, int i7) {
        this.a = i7;
        this.d = callback;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z9;
        int i7;
        switch (this.a) {
            case 0:
                ci ciVar = (ci) this.d;
                i6 i6Var = ciVar.u1;
                fh fhVar = ciVar.B2;
                i6 i6Var2 = ciVar.t1;
                if (this.c != TextUtils.isEmpty(editable)) {
                    uh uhVar = ciVar.v2;
                    if (uhVar != null) {
                        uhVar.D(uhVar.getSelectedItemsCount());
                    }
                    this.c = !this.c;
                }
                boolean z10 = false;
                if (this.b) {
                    for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                        editable.removeSpan(imageSpan);
                    }
                    org.telegram.messenger.i6.l(editable, fhVar.getEditText().getPaint().getFontMetricsInt(), false);
                    this.b = false;
                }
                int codePointCount = Character.codePointCount(editable, 0, editable.length());
                ciVar.F1 = codePointCount;
                ciVar.o1.a(codePointCount > 0, true);
                int i10 = ciVar.E1;
                if (i10 <= 0 || (i7 = i10 - ciVar.F1) > 100) {
                    i6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new y5(this, 8));
                    i6Var.setAlpha(0.0f);
                    z9 = true;
                } else {
                    if (i7 < -9999) {
                        i7 = -9999;
                    }
                    long j3 = i7;
                    i6Var2.c(org.telegram.messenger.id.E(j3, ','), i6Var2.getVisibility() == 0, true);
                    if (i6Var2.getVisibility() != 0) {
                        i6Var2.setVisibility(0);
                        i6Var2.setAlpha(0.0f);
                        i6Var2.setScaleX(0.5f);
                        i6Var2.setScaleY(0.5f);
                    }
                    i6Var2.animate().setListener(null).cancel();
                    i6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                    if (i7 < 0) {
                        org.telegram.ui.ActionBar.t6.Y(i6Var2, org.telegram.ui.ActionBar.m6.p7, ciVar.I0);
                        z9 = false;
                    } else {
                        org.telegram.ui.ActionBar.t6.Y(i6Var2, org.telegram.ui.ActionBar.m6.y6, ciVar.I0);
                        z9 = true;
                    }
                    i6Var.c(org.telegram.messenger.id.E(j3, ','), false, true);
                    i6Var.setAlpha(1.0f);
                }
                if (ciVar.R2 != z9) {
                    ciVar.R2 = z9;
                    ciVar.F2.invalidate();
                }
                if (!ciVar.W1) {
                    if (fhVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(fhVar.getText().toString().trim())) {
                        z10 = true;
                    }
                    ciVar.B1(z10);
                }
                ciVar.Q0(true);
                return;
            default:
                org.telegram.ui.Wallet.n9 n9Var = (org.telegram.ui.Wallet.n9) this.d;
                if (!this.b) {
                    n9Var.f(editable);
                    return;
                }
                this.b = false;
                this.c = true;
                try {
                    editable.append('.');
                    this.c = false;
                    n9Var.c.setSelection(editable.length());
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
                org.telegram.ui.Wallet.n9 n9Var = (org.telegram.ui.Wallet.n9) this.d;
                org.telegram.ui.Wallet.j9 j9Var = n9Var.c;
                if (charSequence.length() > 0 && i10 == charSequence.length() && i11 == 0 && j9Var.getLayout() != null) {
                    n9Var.N = j9Var.getLayout().getLineLeft(0) - j9Var.getScrollX();
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        switch (this.a) {
            case 0:
                ci ciVar = (ci) this.d;
                if (i11 - i10 >= 1) {
                    this.b = true;
                }
                if (ciVar.B4 == null) {
                    ci.K0(ciVar);
                }
                if (ciVar.B4.getAdapter() != null) {
                    ciVar.B4.setReversed(false);
                    ciVar.B4.getAdapter().U(charSequence, ciVar.B2.getEditText().getSelectionStart(), null, false, false);
                    ciVar.J1();
                    break;
                }
                break;
            default:
                boolean z9 = false;
                this.b = i11 > 0 && TextUtils.equals(charSequence, "0");
                org.telegram.ui.Wallet.n9 n9Var = (org.telegram.ui.Wallet.n9) this.d;
                if (!n9Var.R && !this.c) {
                    if (i10 != 0 || i11 != 0) {
                        org.telegram.ui.Wallet.x6 x6Var = n9Var.d;
                        if (i11 > 0 && i11 >= i10) {
                            z9 = true;
                        }
                        if (x6Var.y && x6Var.r && x6Var.D == -1) {
                            ch0 ch0Var = x6Var.h;
                            if (ch0Var == null) {
                                x6Var.d0 = org.telegram.messenger.camera.q.z(x6Var.d0, z9 ? -160.0f : 160.0f, 360.0f, -360.0f);
                                break;
                            } else if (!ch0Var.b()) {
                                x6Var.h.setProgress(0.0f);
                                x6Var.h.d();
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
