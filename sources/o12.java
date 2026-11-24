// default package

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class o12 implements TextWatcher {
    public boolean a;
    public boolean b;
    public final /* synthetic */ d c;
    public final /* synthetic */ i22 d;

    public o12(i22 i22Var, d dVar) {
        this.d = i22Var;
        this.c = dVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z;
        int i;
        i22 i22Var = this.d;
        io ioVar = i22Var.t1;
        m12 m12Var = i22Var.M2;
        int i2 = i22Var.G3;
        io ioVar2 = i22Var.u1;
        if (this.b != TextUtils.isEmpty(editable)) {
            a22 a22Var = i22Var.v2;
            if (a22Var != null) {
                a22Var.E(a22Var.getSelectedItemsCount());
            }
            this.b = !this.b;
        }
        boolean z2 = false;
        if (this.a) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            gw3.l(editable, m12Var.getEditText().getPaint().getFontMetricsInt(), false);
            this.a = false;
        }
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        i22Var.F1 = codePointCount;
        i22Var.o1.a(codePointCount > 0, true);
        int i3 = i22Var.E1;
        if (i3 <= 0 || (i = i3 - i22Var.F1) > 100) {
            ioVar2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new b91(this, (byte) 14));
            ioVar.setAlpha(0.0f);
            z = true;
        } else {
            if (i < -9999) {
                i = -9999;
            }
            long j = i;
            ioVar2.c(jb6.E(j, ','), ioVar2.getVisibility() == 0, true);
            if (ioVar2.getVisibility() != 0) {
                ioVar2.setVisibility(0);
                ioVar2.setAlpha(0.0f);
                ioVar2.setScaleX(0.5f);
                ioVar2.setScaleY(0.5f);
            }
            ioVar2.animate().setListener(null).cancel();
            ioVar2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            if (i < 0) {
                anb.U(ioVar2, cmb.o7, i22Var.J0);
                z = false;
            } else {
                anb.U(ioVar2, cmb.x6, i22Var.J0);
                z = true;
            }
            ioVar.c(jb6.E(j, ','), false, true);
            ioVar.setAlpha(1.0f);
        }
        if (i22Var.R2 != z) {
            i22Var.R2 = z;
            i22Var.F2.invalidate();
        }
        if (!i22Var.f4 && !oc7.r1(i2).H3() && !z8c.h(i2).p() && i22Var.F1 > oc7.r1(i2).l4.g1.f() && i22Var.F1 < oc7.r1(i2).l4.h1.f()) {
            i22Var.f4 = true;
            i22Var.y1(this.c);
        }
        if (i22Var.W1) {
            if (m12Var.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(m12Var.getText().toString().trim())) {
                z2 = true;
            }
            i22Var.w1(z2);
        }
        i22Var.I0(true);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (i3 - i2 >= 1) {
            this.a = true;
        }
        i22 i22Var = this.d;
        if (i22Var.B4 == null) {
            i22Var.O0();
        }
        if (i22Var.B4.getAdapter() != null) {
            i22Var.B4.setReversed(true);
            i22Var.B4.getAdapter().U(charSequence, i22Var.M2.getEditText().getSelectionStart(), null, false, false);
            i22Var.E1();
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
