package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.view.KeyEvent;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class fi implements TextWatcher {
    public final /* synthetic */ int a;
    public boolean b;
    public boolean c;
    public final /* synthetic */ KeyEvent.Callback d;

    public /* synthetic */ fi(KeyEvent.Callback callback, int i10) {
        this.a = i10;
        this.d = callback;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        int i10;
        switch (this.a) {
            case 0:
                yi yiVar = (yi) this.d;
                r6 r6Var = yiVar.v;
                di diVar = yiVar.H0;
                r6 r6Var2 = yiVar.s;
                if (this.c != TextUtils.isEmpty(editable)) {
                    qi qiVar = yiVar.B0;
                    if (qiVar != null) {
                        qiVar.E(qiVar.getSelectedItemsCount());
                    }
                    this.c = !this.c;
                }
                boolean z11 = false;
                if (this.b) {
                    for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                        editable.removeSpan(imageSpan);
                    }
                    Emoji.replaceEmoji(editable, diVar.getEditText().getPaint().getFontMetricsInt(), false);
                    this.b = false;
                }
                int codePointCount = Character.codePointCount(editable, 0, editable.length());
                yiVar.L = codePointCount;
                yiVar.e.a(codePointCount > 0, true);
                int i11 = yiVar.K;
                if (i11 <= 0 || (i10 = i11 - yiVar.L) > 100) {
                    r6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new t8(this, 4));
                    r6Var.setAlpha(0.0f);
                    z10 = true;
                } else {
                    if (i10 < -9999) {
                        i10 = -9999;
                    }
                    long j3 = i10;
                    r6Var2.c(LocaleController.formatNumber(j3, ','), r6Var2.getVisibility() == 0, true);
                    if (r6Var2.getVisibility() != 0) {
                        r6Var2.setVisibility(0);
                        r6Var2.setAlpha(0.0f);
                        r6Var2.setScaleX(0.5f);
                        r6Var2.setScaleY(0.5f);
                    }
                    r6Var2.animate().setListener(null).cancel();
                    r6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                    if (i10 < 0) {
                        r6Var2.setTextColor(yiVar.getThemedColor(org.telegram.ui.ActionBar.i6.p7));
                        z10 = false;
                    } else {
                        r6Var2.setTextColor(yiVar.getThemedColor(org.telegram.ui.ActionBar.i6.y6));
                        z10 = true;
                    }
                    r6Var.c(LocaleController.formatNumber(j3, ','), false, true);
                    r6Var.setAlpha(1.0f);
                }
                if (yiVar.X0 != z10) {
                    yiVar.X0 = z10;
                    yiVar.L0.invalidate();
                }
                if (!yiVar.c0) {
                    if (diVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(diVar.getText().toString().trim())) {
                        z11 = true;
                    }
                    yiVar.Q1(z11);
                }
                yiVar.f1(true);
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
                yi yiVar = (yi) this.d;
                if (i12 - i11 >= 1) {
                    this.b = true;
                }
                if (yiVar.E2 == null) {
                    yi.S(yiVar);
                }
                if (yiVar.E2.getAdapter() != null) {
                    yiVar.E2.setReversed(false);
                    yiVar.E2.getAdapter().U(charSequence, yiVar.H0.getEditText().getSelectionStart(), null, false, false);
                    yiVar.Y1();
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
                            fk0 fk0Var = c6Var.h;
                            if (fk0Var == null) {
                                c6Var.d0 = Math.max(-360.0f, Math.min(360.0f, c6Var.d0 + (z10 ? -160.0f : 160.0f)));
                                break;
                            } else if (!fk0Var.b()) {
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
