package org.telegram.ui.Cells;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.z10;
import org.telegram.ui.Components.b31;
import org.telegram.ui.Components.gb;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.mf;
import org.telegram.ui.Components.ob;
import org.telegram.ui.Components.s41;
import org.telegram.ui.a81;
import org.telegram.ui.co;
import org.telegram.ui.kt0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
        gc b10;
        switch (this.a) {
            case 0:
                j jVar = (j) this.c;
                jVar.d((ClickableSpan) this.b, jVar.a, 0.0f);
                break;
            case 1:
                v0 v0Var = (v0) this.c;
                if (v0Var.g1 != null) {
                    v0Var.d0((CharacterStyle) this.b);
                    break;
                }
                break;
            case 2:
                CharacterStyle characterStyle = (CharacterStyle) this.b;
                if (!(characterStyle instanceof a1)) {
                    r1 r1Var = ((b1) this.c).a;
                    m1 m1Var = r1Var.Sa;
                    if (m1Var != null) {
                        m1Var.T0(r1Var, characterStyle, false);
                        break;
                    }
                } else {
                    ((a1) characterStyle).onClick(view);
                    break;
                }
                break;
            case 3:
                try {
                    ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.b));
                    if (lc.a((org.telegram.ui.la) this.c)) {
                        lc.j((org.telegram.ui.la) this.c).j();
                        break;
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
                break;
            case 4:
                vf.c.t(((c2) this.c).getContext(), "https://fragment.com/username/" + ((String) this.b));
                break;
            case 5:
                vf.c.t(((co) this.c).getContext(), "https://fragment.com/username/" + ((String) this.b));
                break;
            case 6:
                ((mf) this.c).run();
                break;
            case 7:
                URLSpan uRLSpan = (URLSpan) this.b;
                b31 b31Var = (b31) this.c;
                z10 z10Var = b31Var.O1;
                if (z10Var == null) {
                    org.telegram.ui.ActionBar.g2 g2Var = b31Var.N1;
                    if (g2Var != null) {
                        org.telegram.ui.Components.c5.n0(g2Var, uRLSpan.getURL(), false, false);
                        break;
                    }
                } else if (((Boolean) z10Var.a(uRLSpan)).booleanValue()) {
                    b31Var.dismiss();
                    break;
                }
                break;
            case 8:
                ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.b));
                lc b02 = lc.b0(((kt0) this.c).d);
                String N0 = hd.N0(2131748728, null);
                org.telegram.ui.ActionBar.h6 resourceProvider = ((kt0) this.c).d.getResourceProvider();
                b02.getClass();
                if (org.telegram.messenger.g0.G3()) {
                    ob obVar = new ob(b02.X(), resourceProvider);
                    obVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
                    obVar.b.setText(N0);
                    b10 = b02.b(obVar, 1500);
                } else {
                    b10 = new gb();
                }
                b10.j();
                break;
            case 9:
                try {
                    ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.b));
                    if (lc.a((a81) this.c)) {
                        lc.j((a81) this.c).j();
                        break;
                    }
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
                break;
            default:
                org.telegram.messenger.g0.g((String) this.b);
                ((Runnable) this.c).run();
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
                textPaint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.xj, (org.telegram.ui.ActionBar.h6) this.b));
                break;
            case 7:
                int min = Math.min(textPaint.getAlpha(), (textPaint.getColor() >> 24) & ls.e4);
                if (!(((URLSpan) this.b) instanceof s41)) {
                    textPaint.setUnderlineText(true);
                }
                textPaint.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.k5, false));
                textPaint.setAlpha(min);
                break;
            case 8:
            default:
                super.updateDrawState(textPaint);
                break;
            case 9:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                break;
            case 10:
                textPaint.setUnderlineText(false);
                break;
        }
    }

    public /* synthetic */ h(Object obj, Runnable runnable, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = runnable;
    }

    public /* synthetic */ h(org.telegram.ui.ActionBar.g2 g2Var, String str, int i7) {
        this.a = i7;
        this.c = g2Var;
        this.b = str;
    }
}
