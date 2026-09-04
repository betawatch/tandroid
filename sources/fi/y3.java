package fi;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.n70;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class y3 extends ClickableSpan {
    public final /* synthetic */ int a;
    public final /* synthetic */ zh.m b;
    public final /* synthetic */ e4 c;

    public y3(e4 e4Var, int i10, zh.m mVar) {
        this.c = e4Var;
        this.a = i10;
        this.b = mVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        n70 H = n70.H(this.c, view);
        int i10 = this.a;
        boolean z10 = i10 == 3;
        String string = LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortDate);
        final int i11 = 0;
        final zh.m mVar = this.b;
        H.i(new Runnable() { // from class: fi.x3
            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        zh.m mVar2 = mVar;
                        if (mVar2.g != 3) {
                            mVar2.g = 3;
                            mVar2.c = 0;
                            mVar2.d = false;
                            mVar2.i = false;
                            mVar2.f = 0L;
                            mVar2.j = null;
                            mVar2.h = false;
                            mVar2.a();
                            break;
                        }
                        break;
                    case 1:
                        zh.m mVar3 = mVar;
                        if (mVar3.g != 2) {
                            mVar3.g = 2;
                            mVar3.c = 0;
                            mVar3.d = false;
                            mVar3.i = false;
                            mVar3.f = 0L;
                            mVar3.j = null;
                            mVar3.h = false;
                            mVar3.a();
                            break;
                        }
                        break;
                    default:
                        zh.m mVar4 = mVar;
                        if (mVar4.g != 1) {
                            mVar4.g = 1;
                            mVar4.c = 0;
                            mVar4.d = false;
                            mVar4.i = false;
                            mVar4.f = 0L;
                            mVar4.j = null;
                            mVar4.h = false;
                            mVar4.a();
                            break;
                        }
                        break;
                }
            }
        }, string, z10);
        final int i12 = 1;
        H.i(new Runnable() { // from class: fi.x3
            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        zh.m mVar2 = mVar;
                        if (mVar2.g != 3) {
                            mVar2.g = 3;
                            mVar2.c = 0;
                            mVar2.d = false;
                            mVar2.i = false;
                            mVar2.f = 0L;
                            mVar2.j = null;
                            mVar2.h = false;
                            mVar2.a();
                            break;
                        }
                        break;
                    case 1:
                        zh.m mVar3 = mVar;
                        if (mVar3.g != 2) {
                            mVar3.g = 2;
                            mVar3.c = 0;
                            mVar3.d = false;
                            mVar3.i = false;
                            mVar3.f = 0L;
                            mVar3.j = null;
                            mVar3.h = false;
                            mVar3.a();
                            break;
                        }
                        break;
                    default:
                        zh.m mVar4 = mVar;
                        if (mVar4.g != 1) {
                            mVar4.g = 1;
                            mVar4.c = 0;
                            mVar4.d = false;
                            mVar4.i = false;
                            mVar4.f = 0L;
                            mVar4.j = null;
                            mVar4.h = false;
                            mVar4.a();
                            break;
                        }
                        break;
                }
            }
        }, LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortRevenue), i10 == 2);
        final int i13 = 2;
        H.i(new Runnable() { // from class: fi.x3
            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        zh.m mVar2 = mVar;
                        if (mVar2.g != 3) {
                            mVar2.g = 3;
                            mVar2.c = 0;
                            mVar2.d = false;
                            mVar2.i = false;
                            mVar2.f = 0L;
                            mVar2.j = null;
                            mVar2.h = false;
                            mVar2.a();
                            break;
                        }
                        break;
                    case 1:
                        zh.m mVar3 = mVar;
                        if (mVar3.g != 2) {
                            mVar3.g = 2;
                            mVar3.c = 0;
                            mVar3.d = false;
                            mVar3.i = false;
                            mVar3.f = 0L;
                            mVar3.j = null;
                            mVar3.h = false;
                            mVar3.a();
                            break;
                        }
                        break;
                    default:
                        zh.m mVar4 = mVar;
                        if (mVar4.g != 1) {
                            mVar4.g = 1;
                            mVar4.c = 0;
                            mVar4.d = false;
                            mVar4.i = false;
                            mVar4.f = 0L;
                            mVar4.j = null;
                            mVar4.h = false;
                            mVar4.a();
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
