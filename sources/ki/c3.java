package ki;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.y60;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class c3 extends ClickableSpan {
    public final /* synthetic */ int a = 1;
    public final int b;
    public final Object c;
    public final Object d;

    public c3(i3 i3Var, int i7, di.c0 c0Var) {
        this.d = i3Var;
        this.b = i7;
        this.c = c0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        int i7 = this.a;
        Object obj = this.d;
        switch (i7) {
            case 0:
                final di.c0 c0Var = (di.c0) this.c;
                y60 I = y60.I((i3) obj, view);
                final int i10 = 0;
                char c10 = 1;
                int i11 = this.b;
                I.i(new Runnable() { // from class: ki.b3
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                di.c0 c0Var2 = c0Var;
                                if (c0Var2.g != 3) {
                                    c0Var2.g = 3;
                                    c0Var2.c = 0;
                                    c0Var2.d = false;
                                    c0Var2.i = false;
                                    c0Var2.f = 0L;
                                    c0Var2.j = null;
                                    c0Var2.h = false;
                                    c0Var2.a();
                                    break;
                                }
                                break;
                            case 1:
                                di.c0 c0Var3 = c0Var;
                                if (c0Var3.g != 2) {
                                    c0Var3.g = 2;
                                    c0Var3.c = 0;
                                    c0Var3.d = false;
                                    c0Var3.i = false;
                                    c0Var3.f = 0L;
                                    c0Var3.j = null;
                                    c0Var3.h = false;
                                    c0Var3.a();
                                    break;
                                }
                                break;
                            default:
                                di.c0 c0Var4 = c0Var;
                                if (c0Var4.g != 1) {
                                    c0Var4.g = 1;
                                    c0Var4.c = 0;
                                    c0Var4.d = false;
                                    c0Var4.i = false;
                                    c0Var4.f = 0L;
                                    c0Var4.j = null;
                                    c0Var4.h = false;
                                    c0Var4.a();
                                    break;
                                }
                                break;
                        }
                    }
                }, gd.M0(2131752467, null), i11 == 3);
                final int i12 = 2;
                boolean z10 = i11 == 2;
                String M0 = gd.M0(2131752465, null);
                final char c11 = c10 == true ? 1 : 0;
                I.i(new Runnable() { // from class: ki.b3
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (c11) {
                            case 0:
                                di.c0 c0Var2 = c0Var;
                                if (c0Var2.g != 3) {
                                    c0Var2.g = 3;
                                    c0Var2.c = 0;
                                    c0Var2.d = false;
                                    c0Var2.i = false;
                                    c0Var2.f = 0L;
                                    c0Var2.j = null;
                                    c0Var2.h = false;
                                    c0Var2.a();
                                    break;
                                }
                                break;
                            case 1:
                                di.c0 c0Var3 = c0Var;
                                if (c0Var3.g != 2) {
                                    c0Var3.g = 2;
                                    c0Var3.c = 0;
                                    c0Var3.d = false;
                                    c0Var3.i = false;
                                    c0Var3.f = 0L;
                                    c0Var3.j = null;
                                    c0Var3.h = false;
                                    c0Var3.a();
                                    break;
                                }
                                break;
                            default:
                                di.c0 c0Var4 = c0Var;
                                if (c0Var4.g != 1) {
                                    c0Var4.g = 1;
                                    c0Var4.c = 0;
                                    c0Var4.d = false;
                                    c0Var4.i = false;
                                    c0Var4.f = 0L;
                                    c0Var4.j = null;
                                    c0Var4.h = false;
                                    c0Var4.a();
                                    break;
                                }
                                break;
                        }
                    }
                }, M0, z10);
                I.i(new Runnable() { // from class: ki.b3
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                di.c0 c0Var2 = c0Var;
                                if (c0Var2.g != 3) {
                                    c0Var2.g = 3;
                                    c0Var2.c = 0;
                                    c0Var2.d = false;
                                    c0Var2.i = false;
                                    c0Var2.f = 0L;
                                    c0Var2.j = null;
                                    c0Var2.h = false;
                                    c0Var2.a();
                                    break;
                                }
                                break;
                            case 1:
                                di.c0 c0Var3 = c0Var;
                                if (c0Var3.g != 2) {
                                    c0Var3.g = 2;
                                    c0Var3.c = 0;
                                    c0Var3.d = false;
                                    c0Var3.i = false;
                                    c0Var3.f = 0L;
                                    c0Var3.j = null;
                                    c0Var3.h = false;
                                    c0Var3.a();
                                    break;
                                }
                                break;
                            default:
                                di.c0 c0Var4 = c0Var;
                                if (c0Var4.g != 1) {
                                    c0Var4.g = 1;
                                    c0Var4.c = 0;
                                    c0Var4.d = false;
                                    c0Var4.i = false;
                                    c0Var4.f = 0L;
                                    c0Var4.j = null;
                                    c0Var4.h = false;
                                    c0Var4.a();
                                    break;
                                }
                                break;
                        }
                    }
                }, gd.M0(2131752466, null), i11 == 1);
                I.W(5);
                I.t = false;
                I.s = 0;
                I.b0(org.telegram.messenger.g0.L(24.0f), -org.telegram.messenger.g0.L(24.0f));
                I.a0();
                break;
            default:
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                textPaint.setUnderlineText(false);
                textPaint.setColor(textPaint.linkColor);
                break;
            default:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                textPaint.setColor(n6.w0(this.b, (i6) this.c));
                break;
        }
    }

    public c3(int i7, i6 i6Var, Runnable runnable) {
        this.b = i7;
        this.c = i6Var;
        this.d = runnable;
    }
}
