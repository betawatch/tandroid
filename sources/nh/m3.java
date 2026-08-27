package nh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.b70;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class m3 extends ClickableSpan {
    public final /* synthetic */ int a;
    public final /* synthetic */ hh.a0 b;
    public final /* synthetic */ s3 c;

    public m3(s3 s3Var, int i10, hh.a0 a0Var) {
        this.c = s3Var;
        this.a = i10;
        this.b = a0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        b70 H = b70.H(this.c, view);
        int i10 = this.a;
        boolean z10 = i10 == 3;
        String string = LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortDate);
        final int i11 = 0;
        final hh.a0 a0Var = this.b;
        H.i(new Runnable() { // from class: nh.l3
            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        hh.a0 a0Var2 = a0Var;
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
                        hh.a0 a0Var3 = a0Var;
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
                        hh.a0 a0Var4 = a0Var;
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
        final int i12 = 1;
        H.i(new Runnable() { // from class: nh.l3
            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        hh.a0 a0Var2 = a0Var;
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
                        hh.a0 a0Var3 = a0Var;
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
                        hh.a0 a0Var4 = a0Var;
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
        }, LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortRevenue), i10 == 2);
        final int i13 = 2;
        H.i(new Runnable() { // from class: nh.l3
            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        hh.a0 a0Var2 = a0Var;
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
                        hh.a0 a0Var3 = a0Var;
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
                        hh.a0 a0Var4 = a0Var;
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
