// default package

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.view.KeyEvent;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class l12 implements TextWatcher {
    public final /* synthetic */ byte a;
    public boolean b;
    public boolean c;
    public final /* synthetic */ KeyEvent.Callback d;

    public /* synthetic */ l12(KeyEvent.Callback callback, byte b) {
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
                i22 i22Var = (i22) callback;
                io ioVar = i22Var.u1;
                k12 k12Var = i22Var.B2;
                io ioVar2 = i22Var.t1;
                if (this.c != TextUtils.isEmpty(editable)) {
                    a22 a22Var = i22Var.v2;
                    if (a22Var != null) {
                        a22Var.E(a22Var.getSelectedItemsCount());
                    }
                    this.c = !this.c;
                }
                if (this.b) {
                    for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                        editable.removeSpan(imageSpan);
                    }
                    gw3.l(editable, k12Var.getEditText().getPaint().getFontMetricsInt(), false);
                    this.b = false;
                }
                int codePointCount = Character.codePointCount(editable, 0, editable.length());
                i22Var.F1 = codePointCount;
                i22Var.o1.a(codePointCount > 0, true);
                int i2 = i22Var.E1;
                if (i2 <= 0 || (i = i2 - i22Var.F1) > 100) {
                    ioVar2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new b91((Object) this, (byte) 13));
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
                if (!i22Var.W1) {
                    if (k12Var.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(k12Var.getText().toString().trim())) {
                        z2 = true;
                    }
                    i22Var.w1(z2);
                }
                i22Var.I0(true);
                return;
            default:
                qrc qrcVar = (qrc) callback;
                if (!this.b) {
                    qrcVar.f(editable);
                    return;
                }
                this.b = false;
                this.c = true;
                try {
                    editable.append('.');
                    this.c = false;
                    qrcVar.c.setSelection(editable.length());
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
                qrc qrcVar = (qrc) this.d;
                mrc mrcVar = qrcVar.c;
                if (charSequence.length() > 0 && i2 == charSequence.length() && i3 == 0 && mrcVar.getLayout() != null) {
                    qrcVar.O = mrcVar.getLayout().getLineLeft(0) - mrcVar.getScrollX();
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
                i22 i22Var = (i22) callback;
                if (i3 - i2 >= 1) {
                    this.b = true;
                }
                if (i22Var.B4 == null) {
                    i22Var.O0();
                }
                if (i22Var.B4.getAdapter() != null) {
                    i22Var.B4.setReversed(false);
                    i22Var.B4.getAdapter().U(charSequence, i22Var.B2.getEditText().getSelectionStart(), null, false, false);
                    i22Var.E1();
                    break;
                }
                break;
            default:
                this.b = i3 > 0 && TextUtils.equals(charSequence, "0");
                qrc qrcVar = (qrc) callback;
                if (!qrcVar.S && !this.c) {
                    if (i2 != 0 || i3 != 0) {
                        npc npcVar = qrcVar.d;
                        boolean z = i3 > 0 && i3 >= i2;
                        if (npcVar.y && npcVar.r && npcVar.E == -1) {
                            s09 s09Var = npcVar.h;
                            if (s09Var == null) {
                                npcVar.e0 = mlb.f(npcVar.e0, z ? -160.0f : 160.0f, 360.0f, -360.0f);
                                break;
                            } else if (!s09Var.b()) {
                                npcVar.h.setProgress(0.0f);
                                npcVar.h.d();
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
