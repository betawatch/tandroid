package org.telegram.messenger;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.ui.Components.qy0;
import org.telegram.ui.o50;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class v extends ClickableSpan {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ v(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                Runnable runnable = (Runnable) this.b;
                if (runnable != null) {
                    runnable.run();
                }
                vf.c.t(t0.b, (String) this.c);
                break;
            case 1:
                ((o50) this.b).a((org.telegram.ui.e4) this.c, (qy0) this.d);
                break;
            default:
                org.telegram.ui.ActionBar.u1 u1Var = ((org.telegram.ui.ActionBar.u1[]) this.b)[0];
                if (u1Var != null) {
                    u1Var.dismiss();
                }
                vf.c.t((Context) this.d, "https://t.me/" + ((String) this.c));
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Uc, (org.telegram.ui.ActionBar.f6) this.d));
                textPaint.setUnderlineText(false);
                break;
            case 1:
            default:
                super.updateDrawState(textPaint);
                break;
            case 2:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                break;
        }
    }

    public v(org.telegram.ui.ActionBar.u1[] u1VarArr, Context context, String str) {
        this.a = 2;
        this.b = u1VarArr;
        this.d = context;
        this.c = str;
    }
}
