package ei;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.b80;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final class z3 extends ClickableSpan {
    public final /* synthetic */ int a;
    public final /* synthetic */ yh.n b;
    public final /* synthetic */ f4 c;

    public z3(f4 f4Var, int i10, yh.n nVar) {
        this.c = f4Var;
        this.a = i10;
        this.b = nVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        b80 H = b80.H(this.c, view);
        int i10 = this.a;
        boolean z10 = i10 == 3;
        String string = LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortDate);
        final int i11 = 0;
        final yh.n nVar = this.b;
        H.i(new Runnable() { // from class: ei.y3
            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        yh.n nVar2 = nVar;
                        if (nVar2.g != 3) {
                            nVar2.g = 3;
                            nVar2.c = 0;
                            nVar2.d = false;
                            nVar2.i = false;
                            nVar2.f = 0L;
                            nVar2.j = null;
                            nVar2.h = false;
                            nVar2.a();
                            break;
                        }
                        break;
                    case 1:
                        yh.n nVar3 = nVar;
                        if (nVar3.g != 2) {
                            nVar3.g = 2;
                            nVar3.c = 0;
                            nVar3.d = false;
                            nVar3.i = false;
                            nVar3.f = 0L;
                            nVar3.j = null;
                            nVar3.h = false;
                            nVar3.a();
                            break;
                        }
                        break;
                    default:
                        yh.n nVar4 = nVar;
                        if (nVar4.g != 1) {
                            nVar4.g = 1;
                            nVar4.c = 0;
                            nVar4.d = false;
                            nVar4.i = false;
                            nVar4.f = 0L;
                            nVar4.j = null;
                            nVar4.h = false;
                            nVar4.a();
                            break;
                        }
                        break;
                }
            }
        }, string, z10);
        final int i12 = 1;
        H.i(new Runnable() { // from class: ei.y3
            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        yh.n nVar2 = nVar;
                        if (nVar2.g != 3) {
                            nVar2.g = 3;
                            nVar2.c = 0;
                            nVar2.d = false;
                            nVar2.i = false;
                            nVar2.f = 0L;
                            nVar2.j = null;
                            nVar2.h = false;
                            nVar2.a();
                            break;
                        }
                        break;
                    case 1:
                        yh.n nVar3 = nVar;
                        if (nVar3.g != 2) {
                            nVar3.g = 2;
                            nVar3.c = 0;
                            nVar3.d = false;
                            nVar3.i = false;
                            nVar3.f = 0L;
                            nVar3.j = null;
                            nVar3.h = false;
                            nVar3.a();
                            break;
                        }
                        break;
                    default:
                        yh.n nVar4 = nVar;
                        if (nVar4.g != 1) {
                            nVar4.g = 1;
                            nVar4.c = 0;
                            nVar4.d = false;
                            nVar4.i = false;
                            nVar4.f = 0L;
                            nVar4.j = null;
                            nVar4.h = false;
                            nVar4.a();
                            break;
                        }
                        break;
                }
            }
        }, LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortRevenue), i10 == 2);
        final int i13 = 2;
        H.i(new Runnable() { // from class: ei.y3
            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        yh.n nVar2 = nVar;
                        if (nVar2.g != 3) {
                            nVar2.g = 3;
                            nVar2.c = 0;
                            nVar2.d = false;
                            nVar2.i = false;
                            nVar2.f = 0L;
                            nVar2.j = null;
                            nVar2.h = false;
                            nVar2.a();
                            break;
                        }
                        break;
                    case 1:
                        yh.n nVar3 = nVar;
                        if (nVar3.g != 2) {
                            nVar3.g = 2;
                            nVar3.c = 0;
                            nVar3.d = false;
                            nVar3.i = false;
                            nVar3.f = 0L;
                            nVar3.j = null;
                            nVar3.h = false;
                            nVar3.a();
                            break;
                        }
                        break;
                    default:
                        yh.n nVar4 = nVar;
                        if (nVar4.g != 1) {
                            nVar4.g = 1;
                            nVar4.c = 0;
                            nVar4.d = false;
                            nVar4.i = false;
                            nVar4.f = 0L;
                            nVar4.j = null;
                            nVar4.h = false;
                            nVar4.a();
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
