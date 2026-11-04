package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.view.KeyEvent;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class eh implements TextWatcher {
    public final /* synthetic */ int a;
    public boolean b;
    public boolean c;
    public final /* synthetic */ KeyEvent.Callback d;

    public /* synthetic */ eh(KeyEvent.Callback callback, int i3) {
        this.a = i3;
        this.d = callback;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        int i3;
        switch (this.a) {
            case 0:
                bi biVar = (bi) this.d;
                h6 h6Var = biVar.s1;
                dh dhVar = biVar.z2;
                h6 h6Var2 = biVar.r1;
                if (this.c != TextUtils.isEmpty(editable)) {
                    th thVar = biVar.t2;
                    if (thVar != null) {
                        thVar.D(thVar.getSelectedItemsCount());
                    }
                    this.c = !this.c;
                }
                boolean z11 = false;
                if (this.b) {
                    for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                        editable.removeSpan(imageSpan);
                    }
                    org.telegram.messenger.i6.l(editable, dhVar.getEditText().getPaint().getFontMetricsInt(), false);
                    this.b = false;
                }
                int codePointCount = Character.codePointCount(editable, 0, editable.length());
                biVar.D1 = codePointCount;
                biVar.m1.a(codePointCount > 0, true);
                int i10 = biVar.C1;
                if (i10 <= 0 || (i3 = i10 - biVar.D1) > 100) {
                    h6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new x5(this, 8));
                    h6Var.setAlpha(0.0f);
                    z10 = true;
                } else {
                    if (i3 < -9999) {
                        i3 = -9999;
                    }
                    long j10 = i3;
                    h6Var2.c(org.telegram.messenger.bd.E(j10, ','), h6Var2.getVisibility() == 0, true);
                    if (h6Var2.getVisibility() != 0) {
                        h6Var2.setVisibility(0);
                        h6Var2.setAlpha(0.0f);
                        h6Var2.setScaleX(0.5f);
                        h6Var2.setScaleY(0.5f);
                    }
                    h6Var2.animate().setListener(null).cancel();
                    h6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                    if (i3 < 0) {
                        org.telegram.ui.ActionBar.r6.Z(h6Var2, org.telegram.ui.ActionBar.k6.p7, biVar.J0);
                        z10 = false;
                    } else {
                        org.telegram.ui.ActionBar.r6.Z(h6Var2, org.telegram.ui.ActionBar.k6.y6, biVar.J0);
                        z10 = true;
                    }
                    h6Var.c(org.telegram.messenger.bd.E(j10, ','), false, true);
                    h6Var.setAlpha(1.0f);
                }
                if (biVar.P2 != z10) {
                    biVar.P2 = z10;
                    biVar.D2.invalidate();
                }
                if (!biVar.U1) {
                    if (dhVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(dhVar.getText().toString().trim())) {
                        z11 = true;
                    }
                    biVar.B1(z11);
                }
                biVar.Q0(true);
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
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        switch (this.a) {
            case 0:
                break;
            default:
                org.telegram.ui.Wallet.l9 l9Var = (org.telegram.ui.Wallet.l9) this.d;
                org.telegram.ui.Wallet.h9 h9Var = l9Var.c;
                if (charSequence.length() > 0 && i10 == charSequence.length() && i11 == 0 && h9Var.getLayout() != null) {
                    l9Var.O = h9Var.getLayout().getLineLeft(0) - h9Var.getScrollX();
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        switch (this.a) {
            case 0:
                bi biVar = (bi) this.d;
                if (i11 - i10 >= 1) {
                    this.b = true;
                }
                if (biVar.z4 == null) {
                    bi.K0(biVar);
                }
                if (biVar.z4.getAdapter() != null) {
                    biVar.z4.setReversed(false);
                    biVar.z4.getAdapter().U(charSequence, biVar.z2.getEditText().getSelectionStart(), null, false, false);
                    biVar.J1();
                    break;
                }
                break;
            default:
                boolean z10 = false;
                this.b = i11 > 0 && TextUtils.equals(charSequence, "0");
                org.telegram.ui.Wallet.l9 l9Var = (org.telegram.ui.Wallet.l9) this.d;
                if (!l9Var.S && !this.c) {
                    if (i10 != 0 || i11 != 0) {
                        org.telegram.ui.Wallet.u6 u6Var = l9Var.d;
                        if (i11 > 0 && i11 >= i10) {
                            z10 = true;
                        }
                        if (u6Var.y && u6Var.r && u6Var.E == -1) {
                            fh0 fh0Var = u6Var.h;
                            if (fh0Var == null) {
                                u6Var.e0 = org.telegram.messenger.camera.q.z(u6Var.e0, z10 ? -160.0f : 160.0f, 360.0f, -360.0f);
                                break;
                            } else if (!fh0Var.b()) {
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

    private final void a(int i3, int i10, int i11, CharSequence charSequence) {
    }
}
