package org.telegram.ui;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class n0 extends ClickableSpan {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ n0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ((u70) this.b).c((f4) this.c, (org.telegram.ui.Components.k01) this.d);
                break;
            default:
                org.telegram.ui.ActionBar.b2 b2Var = ((org.telegram.ui.ActionBar.b2[]) this.b)[0];
                if (b2Var != null) {
                    b2Var.dismiss();
                }
                nf.f.s((Context) this.c, "https://t.me/" + ((String) this.d));
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 1:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                break;
            default:
                super.updateDrawState(textPaint);
                break;
        }
    }
}
