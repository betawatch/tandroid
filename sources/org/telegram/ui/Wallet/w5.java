package org.telegram.ui.Wallet;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.cd;
import org.telegram.ui.Components.z60;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class w5 extends ClickableSpan {
    public final /* synthetic */ int a = 0;
    public final int b;
    public final Object c;
    public final Object d;

    public w5(xh.z2 z2Var, int i10, rh.p pVar) {
        this.d = z2Var;
        this.b = i10;
        this.c = pVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        int i10 = this.a;
        Object obj = this.d;
        switch (i10) {
            case 0:
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                final rh.p pVar = (rh.p) this.c;
                z60 H = z60.H((xh.z2) obj, view);
                final int i11 = 0;
                char c10 = 1;
                int i12 = this.b;
                H.i(new Runnable() { // from class: xh.t2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                rh.p pVar2 = pVar;
                                if (pVar2.g != 3) {
                                    pVar2.g = 3;
                                    pVar2.c = 0;
                                    pVar2.d = false;
                                    pVar2.i = false;
                                    pVar2.f = 0L;
                                    pVar2.j = null;
                                    pVar2.h = false;
                                    pVar2.a();
                                    break;
                                }
                                break;
                            case 1:
                                rh.p pVar3 = pVar;
                                if (pVar3.g != 2) {
                                    pVar3.g = 2;
                                    pVar3.c = 0;
                                    pVar3.d = false;
                                    pVar3.i = false;
                                    pVar3.f = 0L;
                                    pVar3.j = null;
                                    pVar3.h = false;
                                    pVar3.a();
                                    break;
                                }
                                break;
                            default:
                                rh.p pVar4 = pVar;
                                if (pVar4.g != 1) {
                                    pVar4.g = 1;
                                    pVar4.c = 0;
                                    pVar4.d = false;
                                    pVar4.i = false;
                                    pVar4.f = 0L;
                                    pVar4.j = null;
                                    pVar4.h = false;
                                    pVar4.a();
                                    break;
                                }
                                break;
                        }
                    }
                }, cd.L0(2131752478, null), i12 == 3);
                final int i13 = 2;
                boolean z10 = i12 == 2;
                String L0 = cd.L0(2131752476, null);
                final char c11 = c10 == true ? 1 : 0;
                H.i(new Runnable() { // from class: xh.t2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (c11) {
                            case 0:
                                rh.p pVar2 = pVar;
                                if (pVar2.g != 3) {
                                    pVar2.g = 3;
                                    pVar2.c = 0;
                                    pVar2.d = false;
                                    pVar2.i = false;
                                    pVar2.f = 0L;
                                    pVar2.j = null;
                                    pVar2.h = false;
                                    pVar2.a();
                                    break;
                                }
                                break;
                            case 1:
                                rh.p pVar3 = pVar;
                                if (pVar3.g != 2) {
                                    pVar3.g = 2;
                                    pVar3.c = 0;
                                    pVar3.d = false;
                                    pVar3.i = false;
                                    pVar3.f = 0L;
                                    pVar3.j = null;
                                    pVar3.h = false;
                                    pVar3.a();
                                    break;
                                }
                                break;
                            default:
                                rh.p pVar4 = pVar;
                                if (pVar4.g != 1) {
                                    pVar4.g = 1;
                                    pVar4.c = 0;
                                    pVar4.d = false;
                                    pVar4.i = false;
                                    pVar4.f = 0L;
                                    pVar4.j = null;
                                    pVar4.h = false;
                                    pVar4.a();
                                    break;
                                }
                                break;
                        }
                    }
                }, L0, z10);
                H.i(new Runnable() { // from class: xh.t2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                rh.p pVar2 = pVar;
                                if (pVar2.g != 3) {
                                    pVar2.g = 3;
                                    pVar2.c = 0;
                                    pVar2.d = false;
                                    pVar2.i = false;
                                    pVar2.f = 0L;
                                    pVar2.j = null;
                                    pVar2.h = false;
                                    pVar2.a();
                                    break;
                                }
                                break;
                            case 1:
                                rh.p pVar3 = pVar;
                                if (pVar3.g != 2) {
                                    pVar3.g = 2;
                                    pVar3.c = 0;
                                    pVar3.d = false;
                                    pVar3.i = false;
                                    pVar3.f = 0L;
                                    pVar3.j = null;
                                    pVar3.h = false;
                                    pVar3.a();
                                    break;
                                }
                                break;
                            default:
                                rh.p pVar4 = pVar;
                                if (pVar4.g != 1) {
                                    pVar4.g = 1;
                                    pVar4.c = 0;
                                    pVar4.d = false;
                                    pVar4.i = false;
                                    pVar4.f = 0L;
                                    pVar4.j = null;
                                    pVar4.h = false;
                                    pVar4.a();
                                    break;
                                }
                                break;
                        }
                    }
                }, cd.L0(2131752477, null), i12 == 1);
                H.V(5);
                H.t = false;
                H.s = 0;
                H.a0(org.telegram.messenger.i0.L(24.0f), -org.telegram.messenger.i0.L(24.0f));
                H.Z();
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(this.b, (org.telegram.ui.ActionBar.p6) this.c));
                break;
            default:
                textPaint.setUnderlineText(false);
                textPaint.setColor(textPaint.linkColor);
                break;
        }
    }

    public w5(int i10, org.telegram.ui.ActionBar.p6 p6Var, Runnable runnable) {
        this.b = i10;
        this.c = p6Var;
        this.d = runnable;
    }
}
