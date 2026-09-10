package di;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.w70;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class b4 extends ClickableSpan {
    public final /* synthetic */ int a;
    public final /* synthetic */ xh.n b;
    public final /* synthetic */ h4 c;

    public b4(h4 h4Var, int i10, xh.n nVar) {
        this.c = h4Var;
        this.a = i10;
        this.b = nVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        w70 H = w70.H(this.c, view);
        int i10 = this.a;
        boolean z10 = i10 == 3;
        String string = LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortDate);
        final int i11 = 0;
        final xh.n nVar = this.b;
        H.i(new Runnable() { // from class: di.a4
            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        xh.n nVar2 = nVar;
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
                        xh.n nVar3 = nVar;
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
                        xh.n nVar4 = nVar;
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
        H.i(new Runnable() { // from class: di.a4
            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        xh.n nVar2 = nVar;
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
                        xh.n nVar3 = nVar;
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
                        xh.n nVar4 = nVar;
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
        H.i(new Runnable() { // from class: di.a4
            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        xh.n nVar2 = nVar;
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
                        xh.n nVar3 = nVar;
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
                        xh.n nVar4 = nVar;
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
