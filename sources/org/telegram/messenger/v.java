package org.telegram.messenger;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.ui.Components.py0;
import org.telegram.ui.i50;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class v extends ClickableSpan {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ v(Object obj, Object obj2, Object obj3, int i3) {
        this.a = i3;
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
                sf.c.t(t0.b, (String) this.c);
                break;
            case 1:
                ((i50) this.b).a((org.telegram.ui.g4) this.c, (py0) this.d);
                break;
            default:
                org.telegram.ui.ActionBar.s1 s1Var = ((org.telegram.ui.ActionBar.s1[]) this.b)[0];
                if (s1Var != null) {
                    s1Var.dismiss();
                }
                sf.c.t((Context) this.d, "https://t.me/" + ((String) this.c));
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Uc, (org.telegram.ui.ActionBar.e6) this.d));
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

    public v(org.telegram.ui.ActionBar.s1[] s1VarArr, Context context, String str) {
        this.a = 2;
        this.b = s1VarArr;
        this.d = context;
        this.c = str;
    }
}
