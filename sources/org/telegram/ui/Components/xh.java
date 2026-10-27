package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.view.KeyEvent;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class xh implements TextWatcher {
    public final /* synthetic */ int a;
    public boolean b;
    public boolean c;
    public final /* synthetic */ KeyEvent.Callback d;

    public /* synthetic */ xh(KeyEvent.Callback callback, int i10) {
        this.a = i10;
        this.d = callback;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        int i10;
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.ActionBar.u6 u6Var2;
        switch (this.a) {
            case 0:
                ti tiVar = (ti) this.d;
                s6 s6Var = tiVar.v;
                wh whVar = tiVar.H0;
                s6 s6Var2 = tiVar.s;
                if (this.c != TextUtils.isEmpty(editable)) {
                    li liVar = tiVar.B0;
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
                    Emoji.replaceEmoji(editable, whVar.getEditText().getPaint().getFontMetricsInt(), false);
                    this.b = false;
                }
                int codePointCount = Character.codePointCount(editable, 0, editable.length());
                tiVar.L = codePointCount;
                tiVar.e.a(codePointCount > 0, true);
                int i11 = tiVar.K;
                if (i11 <= 0 || (i10 = i11 - tiVar.L) > 100) {
                    s6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new org.telegram.ui.sp(this, 10));
                    s6Var.setAlpha(0.0f);
                    z10 = true;
                } else {
                    if (i10 < -9999) {
                        i10 = -9999;
                    }
                    long j10 = i10;
                    s6Var2.c(LocaleController.formatNumber(j10, ','), s6Var2.getVisibility() == 0, true);
                    if (s6Var2.getVisibility() != 0) {
                        s6Var2.setVisibility(0);
                        s6Var2.setAlpha(0.0f);
                        s6Var2.setScaleX(0.5f);
                        s6Var2.setScaleY(0.5f);
                    }
                    s6Var2.animate().setListener(null).cancel();
                    s6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                    if (i10 < 0) {
                        int i12 = org.telegram.ui.ActionBar.y6.p7;
                        u6Var2 = ((org.telegram.ui.ActionBar.k3) tiVar).resourcesProvider;
                        org.telegram.ui.ActionBar.f7.Z(s6Var2, i12, u6Var2);
                        z10 = false;
                    } else {
                        int i13 = org.telegram.ui.ActionBar.y6.y6;
                        u6Var = ((org.telegram.ui.ActionBar.k3) tiVar).resourcesProvider;
                        org.telegram.ui.ActionBar.f7.Z(s6Var2, i13, u6Var);
                        z10 = true;
                    }
                    s6Var.c(LocaleController.formatNumber(j10, ','), false, true);
                    s6Var.setAlpha(1.0f);
                }
                if (tiVar.X0 != z10) {
                    tiVar.X0 = z10;
                    tiVar.L0.invalidate();
                }
                if (!tiVar.c0) {
                    if (whVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(whVar.getText().toString().trim())) {
                        z11 = true;
                    }
                    tiVar.U1(z11);
                }
                tiVar.j1(true);
                return;
            default:
                org.telegram.ui.Wallet.h9 h9Var = (org.telegram.ui.Wallet.h9) this.d;
                if (!this.b) {
                    h9Var.f(editable);
                    return;
                }
                this.b = false;
                this.c = true;
                try {
                    editable.append('.');
                    this.c = false;
                    h9Var.c.setSelection(editable.length());
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
                org.telegram.ui.Wallet.h9 h9Var = (org.telegram.ui.Wallet.h9) this.d;
                org.telegram.ui.Wallet.d9 d9Var = h9Var.c;
                if (charSequence.length() > 0 && i11 == charSequence.length() && i12 == 0 && d9Var.getLayout() != null) {
                    h9Var.N = d9Var.getLayout().getLineLeft(0) - d9Var.getScrollX();
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.a) {
            case 0:
                ti tiVar = (ti) this.d;
                if (i12 - i11 >= 1) {
                    this.b = true;
                }
                if (tiVar.H2 == null) {
                    ti.M(tiVar);
                }
                if (tiVar.H2.getAdapter() != null) {
                    tiVar.H2.setReversed(false);
                    tiVar.H2.getAdapter().U(charSequence, tiVar.H0.getEditText().getSelectionStart(), null, false, false);
                    tiVar.c2();
                    break;
                }
                break;
            default:
                boolean z10 = false;
                this.b = i12 > 0 && TextUtils.equals(charSequence, "0");
                org.telegram.ui.Wallet.h9 h9Var = (org.telegram.ui.Wallet.h9) this.d;
                if (!h9Var.R && !this.c) {
                    if (i11 != 0 || i12 != 0) {
                        org.telegram.ui.Wallet.m6 m6Var = h9Var.d;
                        if (i12 > 0 && i12 >= i11) {
                            z10 = true;
                        }
                        if (m6Var.x && m6Var.r && m6Var.y == -1) {
                            bk0 bk0Var = m6Var.h;
                            if (bk0Var == null) {
                                m6Var.d0 = org.telegram.messenger.wh.A(m6Var.d0, z10 ? -160.0f : 160.0f, 360.0f, -360.0f);
                                break;
                            } else if (!bk0Var.b()) {
                                m6Var.h.setProgress(0.0f);
                                m6Var.h.d();
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
