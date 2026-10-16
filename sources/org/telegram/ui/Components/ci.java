package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.view.KeyEvent;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class ci implements TextWatcher {
    public final /* synthetic */ int a;
    public boolean b;
    public boolean c;
    public final /* synthetic */ KeyEvent.Callback d;

    public /* synthetic */ ci(KeyEvent.Callback callback, int i10) {
        this.a = i10;
        this.d = callback;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        int i10;
        switch (this.a) {
            case 0:
                vi viVar = (vi) this.d;
                s6 s6Var = viVar.v;
                ai aiVar = viVar.H0;
                s6 s6Var2 = viVar.s;
                if (this.c != TextUtils.isEmpty(editable)) {
                    ni niVar = viVar.B0;
                    if (niVar != null) {
                        niVar.E(niVar.getSelectedItemsCount());
                    }
                    this.c = !this.c;
                }
                boolean z11 = false;
                if (this.b) {
                    for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                        editable.removeSpan(imageSpan);
                    }
                    Emoji.replaceEmoji(editable, aiVar.getEditText().getPaint().getFontMetricsInt(), false);
                    this.b = false;
                }
                int codePointCount = Character.codePointCount(editable, 0, editable.length());
                viVar.L = codePointCount;
                viVar.e.a(codePointCount > 0, true);
                int i11 = viVar.K;
                if (i11 <= 0 || (i10 = i11 - viVar.L) > 100) {
                    s6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new l6(this, 7));
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
                        s6Var2.setTextColor(viVar.getThemedColor(org.telegram.ui.ActionBar.g6.p7));
                        z10 = false;
                    } else {
                        s6Var2.setTextColor(viVar.getThemedColor(org.telegram.ui.ActionBar.g6.y6));
                        z10 = true;
                    }
                    s6Var.c(LocaleController.formatNumber(j10, ','), false, true);
                    s6Var.setAlpha(1.0f);
                }
                if (viVar.X0 != z10) {
                    viVar.X0 = z10;
                    viVar.L0.invalidate();
                }
                if (!viVar.c0) {
                    if (aiVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(aiVar.getText().toString().trim())) {
                        z11 = true;
                    }
                    viVar.Q1(z11);
                }
                viVar.f1(true);
                return;
            default:
                org.telegram.ui.Wallet.i8 i8Var = (org.telegram.ui.Wallet.i8) this.d;
                if (!this.b) {
                    i8Var.f(editable);
                    return;
                }
                this.b = false;
                this.c = true;
                try {
                    editable.append('.');
                    this.c = false;
                    i8Var.b.setSelection(editable.length());
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
                org.telegram.ui.Wallet.i8 i8Var = (org.telegram.ui.Wallet.i8) this.d;
                org.telegram.ui.Wallet.e8 e8Var = i8Var.b;
                if (charSequence.length() > 0 && i11 == charSequence.length() && i12 == 0 && e8Var.getLayout() != null) {
                    i8Var.M = e8Var.getLayout().getLineLeft(0) - e8Var.getScrollX();
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.a) {
            case 0:
                vi viVar = (vi) this.d;
                if (i12 - i11 >= 1) {
                    this.b = true;
                }
                if (viVar.E2 == null) {
                    vi.S(viVar);
                }
                if (viVar.E2.getAdapter() != null) {
                    viVar.E2.setReversed(false);
                    viVar.E2.getAdapter().U(charSequence, viVar.H0.getEditText().getSelectionStart(), null, false, false);
                    viVar.Y1();
                    break;
                }
                break;
            default:
                boolean z10 = false;
                this.b = i12 > 0 && TextUtils.equals(charSequence, "0");
                org.telegram.ui.Wallet.i8 i8Var = (org.telegram.ui.Wallet.i8) this.d;
                if (!i8Var.Q && !this.c) {
                    if (i11 != 0 || i12 != 0) {
                        org.telegram.ui.Wallet.c6 c6Var = i8Var.c;
                        if (i12 > 0 && i12 >= i11) {
                            z10 = true;
                        }
                        if (c6Var.x && c6Var.r && c6Var.y == -1) {
                            bk0 bk0Var = c6Var.h;
                            if (bk0Var == null) {
                                c6Var.d0 = Math.max(-360.0f, Math.min(360.0f, c6Var.d0 + (z10 ? -160.0f : 160.0f)));
                                break;
                            } else if (!bk0Var.b()) {
                                c6Var.h.setProgress(0.0f);
                                c6Var.h.d();
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
