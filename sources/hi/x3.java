package hi;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.k80;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class x3 extends ClickableSpan {
    public final /* synthetic */ int a;
    public final /* synthetic */ bi.k0 b;
    public final /* synthetic */ d4 c;

    public x3(d4 d4Var, int i10, bi.k0 k0Var) {
        this.c = d4Var;
        this.a = i10;
        this.b = k0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        k80 H = k80.H(this.c, view);
        int i10 = this.a;
        boolean z10 = i10 == 3;
        String string = LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortDate);
        final int i11 = 0;
        final bi.k0 k0Var = this.b;
        H.i(new Runnable() { // from class: hi.w3
            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        bi.k0 k0Var2 = k0Var;
                        if (k0Var2.g != 3) {
                            k0Var2.g = 3;
                            k0Var2.c = 0;
                            k0Var2.d = false;
                            k0Var2.i = false;
                            k0Var2.f = 0L;
                            k0Var2.j = null;
                            k0Var2.h = false;
                            k0Var2.a();
                            break;
                        }
                        break;
                    case 1:
                        bi.k0 k0Var3 = k0Var;
                        if (k0Var3.g != 2) {
                            k0Var3.g = 2;
                            k0Var3.c = 0;
                            k0Var3.d = false;
                            k0Var3.i = false;
                            k0Var3.f = 0L;
                            k0Var3.j = null;
                            k0Var3.h = false;
                            k0Var3.a();
                            break;
                        }
                        break;
                    default:
                        bi.k0 k0Var4 = k0Var;
                        if (k0Var4.g != 1) {
                            k0Var4.g = 1;
                            k0Var4.c = 0;
                            k0Var4.d = false;
                            k0Var4.i = false;
                            k0Var4.f = 0L;
                            k0Var4.j = null;
                            k0Var4.h = false;
                            k0Var4.a();
                            break;
                        }
                        break;
                }
            }
        }, string, z10);
        final int i12 = 1;
        H.i(new Runnable() { // from class: hi.w3
            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        bi.k0 k0Var2 = k0Var;
                        if (k0Var2.g != 3) {
                            k0Var2.g = 3;
                            k0Var2.c = 0;
                            k0Var2.d = false;
                            k0Var2.i = false;
                            k0Var2.f = 0L;
                            k0Var2.j = null;
                            k0Var2.h = false;
                            k0Var2.a();
                            break;
                        }
                        break;
                    case 1:
                        bi.k0 k0Var3 = k0Var;
                        if (k0Var3.g != 2) {
                            k0Var3.g = 2;
                            k0Var3.c = 0;
                            k0Var3.d = false;
                            k0Var3.i = false;
                            k0Var3.f = 0L;
                            k0Var3.j = null;
                            k0Var3.h = false;
                            k0Var3.a();
                            break;
                        }
                        break;
                    default:
                        bi.k0 k0Var4 = k0Var;
                        if (k0Var4.g != 1) {
                            k0Var4.g = 1;
                            k0Var4.c = 0;
                            k0Var4.d = false;
                            k0Var4.i = false;
                            k0Var4.f = 0L;
                            k0Var4.j = null;
                            k0Var4.h = false;
                            k0Var4.a();
                            break;
                        }
                        break;
                }
            }
        }, LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortRevenue), i10 == 2);
        final int i13 = 2;
        H.i(new Runnable() { // from class: hi.w3
            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        bi.k0 k0Var2 = k0Var;
                        if (k0Var2.g != 3) {
                            k0Var2.g = 3;
                            k0Var2.c = 0;
                            k0Var2.d = false;
                            k0Var2.i = false;
                            k0Var2.f = 0L;
                            k0Var2.j = null;
                            k0Var2.h = false;
                            k0Var2.a();
                            break;
                        }
                        break;
                    case 1:
                        bi.k0 k0Var3 = k0Var;
                        if (k0Var3.g != 2) {
                            k0Var3.g = 2;
                            k0Var3.c = 0;
                            k0Var3.d = false;
                            k0Var3.i = false;
                            k0Var3.f = 0L;
                            k0Var3.j = null;
                            k0Var3.h = false;
                            k0Var3.a();
                            break;
                        }
                        break;
                    default:
                        bi.k0 k0Var4 = k0Var;
                        if (k0Var4.g != 1) {
                            k0Var4.g = 1;
                            k0Var4.c = 0;
                            k0Var4.d = false;
                            k0Var4.i = false;
                            k0Var4.f = 0L;
                            k0Var4.j = null;
                            k0Var4.h = false;
                            k0Var4.a();
                            break;
                        }
                        break;
                }
            }
        }, LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortProfitability), i10 == 1);
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
