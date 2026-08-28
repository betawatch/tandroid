package mh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.x60;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class o3 extends ClickableSpan {
    public final /* synthetic */ int a;
    public final /* synthetic */ gh.a0 b;
    public final /* synthetic */ u3 c;

    public o3(u3 u3Var, int i9, gh.a0 a0Var) {
        this.c = u3Var;
        this.a = i9;
        this.b = a0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        x60 H = x60.H(this.c, view);
        int i9 = this.a;
        boolean z10 = i9 == 3;
        String string = LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortDate);
        final int i10 = 0;
        final gh.a0 a0Var = this.b;
        H.i(new Runnable() { // from class: mh.n3
            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        gh.a0 a0Var2 = a0Var;
                        if (a0Var2.g != 3) {
                            a0Var2.g = 3;
                            a0Var2.c = 0;
                            a0Var2.d = false;
                            a0Var2.i = false;
                            a0Var2.f = 0L;
                            a0Var2.j = null;
                            a0Var2.h = false;
                            a0Var2.a();
                            break;
                        }
                        break;
                    case 1:
                        gh.a0 a0Var3 = a0Var;
                        if (a0Var3.g != 2) {
                            a0Var3.g = 2;
                            a0Var3.c = 0;
                            a0Var3.d = false;
                            a0Var3.i = false;
                            a0Var3.f = 0L;
                            a0Var3.j = null;
                            a0Var3.h = false;
                            a0Var3.a();
                            break;
                        }
                        break;
                    default:
                        gh.a0 a0Var4 = a0Var;
                        if (a0Var4.g != 1) {
                            a0Var4.g = 1;
                            a0Var4.c = 0;
                            a0Var4.d = false;
                            a0Var4.i = false;
                            a0Var4.f = 0L;
                            a0Var4.j = null;
                            a0Var4.h = false;
                            a0Var4.a();
                            break;
                        }
                        break;
                }
            }
        }, string, z10);
        final int i11 = 1;
        H.i(new Runnable() { // from class: mh.n3
            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        gh.a0 a0Var2 = a0Var;
                        if (a0Var2.g != 3) {
                            a0Var2.g = 3;
                            a0Var2.c = 0;
                            a0Var2.d = false;
                            a0Var2.i = false;
                            a0Var2.f = 0L;
                            a0Var2.j = null;
                            a0Var2.h = false;
                            a0Var2.a();
                            break;
                        }
                        break;
                    case 1:
                        gh.a0 a0Var3 = a0Var;
                        if (a0Var3.g != 2) {
                            a0Var3.g = 2;
                            a0Var3.c = 0;
                            a0Var3.d = false;
                            a0Var3.i = false;
                            a0Var3.f = 0L;
                            a0Var3.j = null;
                            a0Var3.h = false;
                            a0Var3.a();
                            break;
                        }
                        break;
                    default:
                        gh.a0 a0Var4 = a0Var;
                        if (a0Var4.g != 1) {
                            a0Var4.g = 1;
                            a0Var4.c = 0;
                            a0Var4.d = false;
                            a0Var4.i = false;
                            a0Var4.f = 0L;
                            a0Var4.j = null;
                            a0Var4.h = false;
                            a0Var4.a();
                            break;
                        }
                        break;
                }
            }
        }, LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortRevenue), i9 == 2);
        final int i12 = 2;
        H.i(new Runnable() { // from class: mh.n3
            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        gh.a0 a0Var2 = a0Var;
                        if (a0Var2.g != 3) {
                            a0Var2.g = 3;
                            a0Var2.c = 0;
                            a0Var2.d = false;
                            a0Var2.i = false;
                            a0Var2.f = 0L;
                            a0Var2.j = null;
                            a0Var2.h = false;
                            a0Var2.a();
                            break;
                        }
                        break;
                    case 1:
                        gh.a0 a0Var3 = a0Var;
                        if (a0Var3.g != 2) {
                            a0Var3.g = 2;
                            a0Var3.c = 0;
                            a0Var3.d = false;
                            a0Var3.i = false;
                            a0Var3.f = 0L;
                            a0Var3.j = null;
                            a0Var3.h = false;
                            a0Var3.a();
                            break;
                        }
                        break;
                    default:
                        gh.a0 a0Var4 = a0Var;
                        if (a0Var4.g != 1) {
                            a0Var4.g = 1;
                            a0Var4.c = 0;
                            a0Var4.d = false;
                            a0Var4.i = false;
                            a0Var4.f = 0L;
                            a0Var4.j = null;
                            a0Var4.h = false;
                            a0Var4.a();
                            break;
                        }
                        break;
                }
            }
        }, LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortProfitability), i9 == 1);
        H.V(5);
        H.t = false;
        H.s = 0;
        H.a0(AndroidUtilities.dp(24.0f), -AndroidUtilities.dp(24.0f));
        H.Z();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setColor(textPaint.linkColor);
    }
}
