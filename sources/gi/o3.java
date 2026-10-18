package gi;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.i80;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class o3 extends ClickableSpan {
    public final /* synthetic */ int a;
    public final /* synthetic */ ai.i0 b;
    public final /* synthetic */ u3 c;

    public o3(u3 u3Var, int i10, ai.i0 i0Var) {
        this.c = u3Var;
        this.a = i10;
        this.b = i0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        i80 H = i80.H(this.c, view);
        int i10 = this.a;
        boolean z10 = i10 == 3;
        String string = LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortDate);
        final int i11 = 0;
        final ai.i0 i0Var = this.b;
        H.i(new Runnable() { // from class: gi.n3
            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        ai.i0 i0Var2 = i0Var;
                        if (i0Var2.g != 3) {
                            i0Var2.g = 3;
                            i0Var2.c = 0;
                            i0Var2.d = false;
                            i0Var2.i = false;
                            i0Var2.f = 0L;
                            i0Var2.j = null;
                            i0Var2.h = false;
                            i0Var2.a();
                            break;
                        }
                        break;
                    case 1:
                        ai.i0 i0Var3 = i0Var;
                        if (i0Var3.g != 2) {
                            i0Var3.g = 2;
                            i0Var3.c = 0;
                            i0Var3.d = false;
                            i0Var3.i = false;
                            i0Var3.f = 0L;
                            i0Var3.j = null;
                            i0Var3.h = false;
                            i0Var3.a();
                            break;
                        }
                        break;
                    default:
                        ai.i0 i0Var4 = i0Var;
                        if (i0Var4.g != 1) {
                            i0Var4.g = 1;
                            i0Var4.c = 0;
                            i0Var4.d = false;
                            i0Var4.i = false;
                            i0Var4.f = 0L;
                            i0Var4.j = null;
                            i0Var4.h = false;
                            i0Var4.a();
                            break;
                        }
                        break;
                }
            }
        }, string, z10);
        final int i12 = 1;
        H.i(new Runnable() { // from class: gi.n3
            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        ai.i0 i0Var2 = i0Var;
                        if (i0Var2.g != 3) {
                            i0Var2.g = 3;
                            i0Var2.c = 0;
                            i0Var2.d = false;
                            i0Var2.i = false;
                            i0Var2.f = 0L;
                            i0Var2.j = null;
                            i0Var2.h = false;
                            i0Var2.a();
                            break;
                        }
                        break;
                    case 1:
                        ai.i0 i0Var3 = i0Var;
                        if (i0Var3.g != 2) {
                            i0Var3.g = 2;
                            i0Var3.c = 0;
                            i0Var3.d = false;
                            i0Var3.i = false;
                            i0Var3.f = 0L;
                            i0Var3.j = null;
                            i0Var3.h = false;
                            i0Var3.a();
                            break;
                        }
                        break;
                    default:
                        ai.i0 i0Var4 = i0Var;
                        if (i0Var4.g != 1) {
                            i0Var4.g = 1;
                            i0Var4.c = 0;
                            i0Var4.d = false;
                            i0Var4.i = false;
                            i0Var4.f = 0L;
                            i0Var4.j = null;
                            i0Var4.h = false;
                            i0Var4.a();
                            break;
                        }
                        break;
                }
            }
        }, LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortRevenue), i10 == 2);
        final int i13 = 2;
        H.i(new Runnable() { // from class: gi.n3
            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        ai.i0 i0Var2 = i0Var;
                        if (i0Var2.g != 3) {
                            i0Var2.g = 3;
                            i0Var2.c = 0;
                            i0Var2.d = false;
                            i0Var2.i = false;
                            i0Var2.f = 0L;
                            i0Var2.j = null;
                            i0Var2.h = false;
                            i0Var2.a();
                            break;
                        }
                        break;
                    case 1:
                        ai.i0 i0Var3 = i0Var;
                        if (i0Var3.g != 2) {
                            i0Var3.g = 2;
                            i0Var3.c = 0;
                            i0Var3.d = false;
                            i0Var3.i = false;
                            i0Var3.f = 0L;
                            i0Var3.j = null;
                            i0Var3.h = false;
                            i0Var3.a();
                            break;
                        }
                        break;
                    default:
                        ai.i0 i0Var4 = i0Var;
                        if (i0Var4.g != 1) {
                            i0Var4.g = 1;
                            i0Var4.c = 0;
                            i0Var4.d = false;
                            i0Var4.i = false;
                            i0Var4.f = 0L;
                            i0Var4.j = null;
                            i0Var4.h = false;
                            i0Var4.a();
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
