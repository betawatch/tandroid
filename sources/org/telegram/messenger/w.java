package org.telegram.messenger;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.ui.Components.vz0;
import org.telegram.ui.l60;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class w extends ClickableSpan {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ w(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
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
                gf.f.r(w0.b, (String) this.c);
                break;
            case 1:
                ((l60) this.b).a((org.telegram.ui.f4) this.c, (vz0) this.d);
                break;
            default:
                org.telegram.ui.ActionBar.x1 x1Var = ((org.telegram.ui.ActionBar.x1[]) this.b)[0];
                if (x1Var != null) {
                    x1Var.dismiss();
                }
                gf.f.r((Context) this.d, "https://t.me/" + ((String) this.c));
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Uc, (org.telegram.ui.ActionBar.p6) this.d));
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

    public w(org.telegram.ui.ActionBar.x1[] x1VarArr, Context context, String str) {
        this.a = 2;
        this.b = x1VarArr;
        this.d = context;
        this.c = str;
    }
}
