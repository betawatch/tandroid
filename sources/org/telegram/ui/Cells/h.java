package org.telegram.ui.Cells;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.d20;
import org.telegram.messenger.id;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.jb;
import org.telegram.ui.Components.k21;
import org.telegram.ui.Components.ro;
import org.telegram.ui.a81;
import org.telegram.ui.bo;
import org.telegram.ui.mt0;
import org.telegram.ui.sb1;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class h extends ClickableSpan {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        bc b10;
        switch (this.a) {
            case 0:
                j jVar = (j) this.c;
                jVar.d((ClickableSpan) this.b, jVar.a, 0.0f);
                break;
            case 1:
                t0 t0Var = (t0) this.c;
                if (t0Var.f1 != null) {
                    t0Var.a0((CharacterStyle) this.b);
                    break;
                }
                break;
            case 2:
                CharacterStyle characterStyle = (CharacterStyle) this.b;
                if (!(characterStyle instanceof y0)) {
                    q1 q1Var = ((z0) this.c).a;
                    l1 l1Var = q1Var.Ra;
                    if (l1Var != null) {
                        l1Var.N0(q1Var, characterStyle, false);
                        break;
                    }
                } else {
                    ((y0) characterStyle).onClick(view);
                    break;
                }
                break;
            case 3:
                try {
                    ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.b));
                    if (gc.a((org.telegram.ui.la) this.c)) {
                        gc.j((org.telegram.ui.la) this.c).j();
                        break;
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
                break;
            case 4:
                vf.c.t(((b2) this.c).getContext(), "https://fragment.com/username/" + ((String) this.b));
                break;
            case 5:
                vf.c.t(((bo) this.c).getContext(), "https://fragment.com/username/" + ((String) this.b));
                break;
            case 6:
                ((ro) this.c).run();
                break;
            case 7:
                org.telegram.messenger.g0.g((CharSequence) this.b);
                ((Runnable) this.c).run();
                break;
            case 8:
                URLSpan uRLSpan = (URLSpan) this.b;
                k21 k21Var = (k21) this.c;
                d20 d20Var = k21Var.N1;
                if (d20Var == null) {
                    org.telegram.ui.ActionBar.f2 f2Var = k21Var.M1;
                    if (f2Var != null) {
                        org.telegram.ui.Components.u4.n0(f2Var, uRLSpan.getURL(), false, false);
                        break;
                    }
                } else if (((Boolean) d20Var.a(uRLSpan)).booleanValue()) {
                    k21Var.dismiss();
                    break;
                }
                break;
            case 9:
                ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.b));
                gc a02 = gc.a0(((mt0) this.c).d);
                String M0 = id.M0(2131748921, null);
                org.telegram.ui.ActionBar.h6 resourceProvider = ((mt0) this.c).d.getResourceProvider();
                a02.getClass();
                if (org.telegram.messenger.g0.I3()) {
                    jb jbVar = new jb(a02.W(), resourceProvider);
                    jbVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
                    jbVar.b.setText(M0);
                    b10 = a02.b(jbVar, 1500);
                } else {
                    b10 = new ab();
                }
                b10.j();
                break;
            case 10:
                try {
                    ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.b));
                    if (gc.a((a81) this.c)) {
                        gc.j((a81) this.c).j();
                        break;
                    }
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
                break;
            default:
                org.telegram.messenger.g0.g((String) this.b);
                ((sb1) this.c).run();
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 3:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                break;
            case 4:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                break;
            case 5:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                break;
            case 6:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                textPaint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.uj, (org.telegram.ui.ActionBar.h6) this.b));
                break;
            case 7:
                textPaint.setColor(textPaint.linkColor);
                break;
            case 8:
                int min = Math.min(textPaint.getAlpha(), (textPaint.getColor() >> 24) & qs.e4);
                if (!(((URLSpan) this.b) instanceof b41)) {
                    textPaint.setUnderlineText(true);
                }
                textPaint.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.k5, false));
                textPaint.setAlpha(min);
                break;
            case 9:
            default:
                super.updateDrawState(textPaint);
                break;
            case 10:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                break;
            case 11:
                textPaint.setUnderlineText(false);
                break;
        }
    }

    public /* synthetic */ h(Object obj, Runnable runnable, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = runnable;
    }

    public /* synthetic */ h(org.telegram.ui.ActionBar.f2 f2Var, String str, int i7) {
        this.a = i7;
        this.c = f2Var;
        this.b = str;
    }
}
