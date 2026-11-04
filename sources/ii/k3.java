package ii;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.bd;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.f60;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class k3 extends ClickableSpan {
    public final /* synthetic */ int a = 1;
    public final int b;
    public final Object c;
    public final Object d;

    public k3(q3 q3Var, int i3, ci.g0 g0Var) {
        this.d = q3Var;
        this.b = i3;
        this.c = g0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        int i3 = this.a;
        Object obj = this.d;
        switch (i3) {
            case 0:
                final ci.g0 g0Var = (ci.g0) this.c;
                f60 H = f60.H((q3) obj, view);
                final int i10 = 0;
                char c2 = 1;
                int i11 = this.b;
                H.i(new Runnable() { // from class: ii.j3
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                ci.g0 g0Var2 = g0Var;
                                if (g0Var2.g != 3) {
                                    g0Var2.g = 3;
                                    g0Var2.c = 0;
                                    g0Var2.d = false;
                                    g0Var2.i = false;
                                    g0Var2.f = 0L;
                                    g0Var2.j = null;
                                    g0Var2.h = false;
                                    g0Var2.a();
                                    break;
                                }
                                break;
                            case 1:
                                ci.g0 g0Var3 = g0Var;
                                if (g0Var3.g != 2) {
                                    g0Var3.g = 2;
                                    g0Var3.c = 0;
                                    g0Var3.d = false;
                                    g0Var3.i = false;
                                    g0Var3.f = 0L;
                                    g0Var3.j = null;
                                    g0Var3.h = false;
                                    g0Var3.a();
                                    break;
                                }
                                break;
                            default:
                                ci.g0 g0Var4 = g0Var;
                                if (g0Var4.g != 1) {
                                    g0Var4.g = 1;
                                    g0Var4.c = 0;
                                    g0Var4.d = false;
                                    g0Var4.i = false;
                                    g0Var4.f = 0L;
                                    g0Var4.j = null;
                                    g0Var4.h = false;
                                    g0Var4.a();
                                    break;
                                }
                                break;
                        }
                    }
                }, bd.M0(2131752478, null), i11 == 3);
                final int i12 = 2;
                boolean z10 = i11 == 2;
                String M0 = bd.M0(2131752476, null);
                final char c10 = c2 == true ? 1 : 0;
                H.i(new Runnable() { // from class: ii.j3
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (c10) {
                            case 0:
                                ci.g0 g0Var2 = g0Var;
                                if (g0Var2.g != 3) {
                                    g0Var2.g = 3;
                                    g0Var2.c = 0;
                                    g0Var2.d = false;
                                    g0Var2.i = false;
                                    g0Var2.f = 0L;
                                    g0Var2.j = null;
                                    g0Var2.h = false;
                                    g0Var2.a();
                                    break;
                                }
                                break;
                            case 1:
                                ci.g0 g0Var3 = g0Var;
                                if (g0Var3.g != 2) {
                                    g0Var3.g = 2;
                                    g0Var3.c = 0;
                                    g0Var3.d = false;
                                    g0Var3.i = false;
                                    g0Var3.f = 0L;
                                    g0Var3.j = null;
                                    g0Var3.h = false;
                                    g0Var3.a();
                                    break;
                                }
                                break;
                            default:
                                ci.g0 g0Var4 = g0Var;
                                if (g0Var4.g != 1) {
                                    g0Var4.g = 1;
                                    g0Var4.c = 0;
                                    g0Var4.d = false;
                                    g0Var4.i = false;
                                    g0Var4.f = 0L;
                                    g0Var4.j = null;
                                    g0Var4.h = false;
                                    g0Var4.a();
                                    break;
                                }
                                break;
                        }
                    }
                }, M0, z10);
                H.i(new Runnable() { // from class: ii.j3
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                ci.g0 g0Var2 = g0Var;
                                if (g0Var2.g != 3) {
                                    g0Var2.g = 3;
                                    g0Var2.c = 0;
                                    g0Var2.d = false;
                                    g0Var2.i = false;
                                    g0Var2.f = 0L;
                                    g0Var2.j = null;
                                    g0Var2.h = false;
                                    g0Var2.a();
                                    break;
                                }
                                break;
                            case 1:
                                ci.g0 g0Var3 = g0Var;
                                if (g0Var3.g != 2) {
                                    g0Var3.g = 2;
                                    g0Var3.c = 0;
                                    g0Var3.d = false;
                                    g0Var3.i = false;
                                    g0Var3.f = 0L;
                                    g0Var3.j = null;
                                    g0Var3.h = false;
                                    g0Var3.a();
                                    break;
                                }
                                break;
                            default:
                                ci.g0 g0Var4 = g0Var;
                                if (g0Var4.g != 1) {
                                    g0Var4.g = 1;
                                    g0Var4.c = 0;
                                    g0Var4.d = false;
                                    g0Var4.i = false;
                                    g0Var4.f = 0L;
                                    g0Var4.j = null;
                                    g0Var4.h = false;
                                    g0Var4.a();
                                    break;
                                }
                                break;
                        }
                    }
                }, bd.M0(2131752477, null), i11 == 1);
                H.V(5);
                H.t = false;
                H.s = 0;
                H.a0(org.telegram.messenger.g0.L(24.0f), -org.telegram.messenger.g0.L(24.0f));
                H.Z();
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
                textPaint.setColor(k6.w0(this.b, (e6) this.c));
                break;
        }
    }

    public k3(int i3, e6 e6Var, Runnable runnable) {
        this.b = i3;
        this.c = e6Var;
        this.d = runnable;
    }
}
