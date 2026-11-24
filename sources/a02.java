// default package

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.view.KeyEvent;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class a02 implements TextWatcher {
    public final /* synthetic */ byte a;
    public boolean b;
    public boolean c;
    public final /* synthetic */ KeyEvent.Callback d;

    public /* synthetic */ a02(KeyEvent.Callback callback, byte b) {
        this.a = b;
        this.d = callback;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z;
        int i;
        byte b = this.a;
        boolean z2 = false;
        KeyEvent.Callback callback = this.d;
        switch (b) {
            case 0:
                x02 x02Var = (x02) callback;
                hn hnVar = x02Var.u1;
                zz1 zz1Var = x02Var.B2;
                hn hnVar2 = x02Var.t1;
                if (this.c != TextUtils.isEmpty(editable)) {
                    p02 p02Var = x02Var.v2;
                    if (p02Var != null) {
                        p02Var.E(p02Var.getSelectedItemsCount());
                    }
                    this.c = !this.c;
                }
                if (this.b) {
                    for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                        editable.removeSpan(imageSpan);
                    }
                    vu3.l(editable, zz1Var.getEditText().getPaint().getFontMetricsInt(), false);
                    this.b = false;
                }
                int codePointCount = Character.codePointCount(editable, 0, editable.length());
                x02Var.F1 = codePointCount;
                x02Var.o1.a(codePointCount > 0, true);
                int i2 = x02Var.E1;
                if (i2 <= 0 || (i = i2 - x02Var.F1) > 100) {
                    hnVar2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new bb1((Object) this, (byte) 11));
                    hnVar.setAlpha(0.0f);
                    z = true;
                } else {
                    if (i < -9999) {
                        i = -9999;
                    }
                    long j = i;
                    hnVar2.c(k96.E(j, ','), hnVar2.getVisibility() == 0, true);
                    if (hnVar2.getVisibility() != 0) {
                        hnVar2.setVisibility(0);
                        hnVar2.setAlpha(0.0f);
                        hnVar2.setScaleX(0.5f);
                        hnVar2.setScaleY(0.5f);
                    }
                    hnVar2.animate().setListener(null).cancel();
                    hnVar2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                    if (i < 0) {
                        zkb.U(hnVar2, bkb.o7, x02Var.J0);
                        z = false;
                    } else {
                        zkb.U(hnVar2, bkb.x6, x02Var.J0);
                        z = true;
                    }
                    hnVar.c(k96.E(j, ','), false, true);
                    hnVar.setAlpha(1.0f);
                }
                if (x02Var.R2 != z) {
                    x02Var.R2 = z;
                    x02Var.F2.invalidate();
                }
                if (!x02Var.W1) {
                    if (zz1Var.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(zz1Var.getText().toString().trim())) {
                        z2 = true;
                    }
                    x02Var.w1(z2);
                }
                x02Var.I0(true);
                return;
            default:
                ppc ppcVar = (ppc) callback;
                if (!this.b) {
                    ppcVar.f(editable);
                    return;
                }
                this.b = false;
                this.c = true;
                try {
                    editable.append('.');
                    this.c = false;
                    ppcVar.c.setSelection(editable.length());
                    return;
                } catch (Throwable th) {
                    this.c = false;
                    throw th;
                }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.a) {
            case 0:
                break;
            default:
                ppc ppcVar = (ppc) this.d;
                lpc lpcVar = ppcVar.c;
                if (charSequence.length() > 0 && i2 == charSequence.length() && i3 == 0 && lpcVar.getLayout() != null) {
                    ppcVar.O = lpcVar.getLayout().getLineLeft(0) - lpcVar.getScrollX();
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        byte b = this.a;
        KeyEvent.Callback callback = this.d;
        switch (b) {
            case 0:
                x02 x02Var = (x02) callback;
                if (i3 - i2 >= 1) {
                    this.b = true;
                }
                if (x02Var.B4 == null) {
                    x02Var.O0();
                }
                if (x02Var.B4.getAdapter() != null) {
                    x02Var.B4.setReversed(false);
                    x02Var.B4.getAdapter().U(charSequence, x02Var.B2.getEditText().getSelectionStart(), null, false, false);
                    x02Var.E1();
                    break;
                }
                break;
            default:
                this.b = i3 > 0 && TextUtils.equals(charSequence, "0");
                ppc ppcVar = (ppc) callback;
                if (!ppcVar.S && !this.c) {
                    if (i2 != 0 || i3 != 0) {
                        lnc lncVar = ppcVar.d;
                        boolean z = i3 > 0 && i3 >= i2;
                        if (lncVar.y && lncVar.r && lncVar.E == -1) {
                            ry8 ry8Var = lncVar.h;
                            if (ry8Var == null) {
                                lncVar.e0 = yjb.f(lncVar.e0, z ? -160.0f : 160.0f, 360.0f, -360.0f);
                                break;
                            } else if (!ry8Var.b()) {
                                lncVar.h.setProgress(0.0f);
                                lncVar.h.d();
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }

    private final void a(int i, int i2, int i3, CharSequence charSequence) {
    }
}
