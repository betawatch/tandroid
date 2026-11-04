package org.telegram.ui.Cells;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hs;
import org.telegram.messenger.v10;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.cl;
import org.telegram.ui.Components.f21;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.ib;
import org.telegram.ui.Components.v31;
import org.telegram.ui.at0;
import org.telegram.ui.ma1;
import org.telegram.ui.o71;
import org.telegram.ui.vn;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class h extends ClickableSpan {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        ac b10;
        switch (this.a) {
            case 0:
                j jVar = (j) this.c;
                jVar.d((ClickableSpan) this.b, jVar.a, 0.0f);
                break;
            case 1:
                t0 t0Var = (t0) this.c;
                if (t0Var.g1 != null) {
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
                    if (fc.a((org.telegram.ui.ka) this.c)) {
                        fc.j((org.telegram.ui.ka) this.c).j();
                        break;
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
                break;
            case 4:
                sf.c.t(((b2) this.c).getContext(), "https://fragment.com/username/" + ((String) this.b));
                break;
            case 5:
                sf.c.t(((vn) this.c).getContext(), "https://fragment.com/username/" + ((String) this.b));
                break;
            case 6:
                ((cl) this.c).run();
                break;
            case 7:
                org.telegram.messenger.g0.g((CharSequence) this.b);
                ((Runnable) this.c).run();
                break;
            case 8:
                URLSpan uRLSpan = (URLSpan) this.b;
                f21 f21Var = (f21) this.c;
                v10 v10Var = f21Var.L1;
                if (v10Var == null) {
                    org.telegram.ui.ActionBar.d2 d2Var = f21Var.K1;
                    if (d2Var != null) {
                        org.telegram.ui.Components.t4.p0(d2Var, uRLSpan.getURL(), false, false);
                        break;
                    }
                } else if (((Boolean) v10Var.a(uRLSpan)).booleanValue()) {
                    f21Var.dismiss();
                    break;
                }
                break;
            case 9:
                ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.b));
                fc a02 = fc.a0(((at0) this.c).d);
                String M0 = bd.M0(2131748929, null);
                org.telegram.ui.ActionBar.e6 resourceProvider = ((at0) this.c).d.getResourceProvider();
                a02.getClass();
                if (org.telegram.messenger.g0.I3()) {
                    ib ibVar = new ib(a02.W(), resourceProvider);
                    ibVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
                    ibVar.b.setText(M0);
                    b10 = a02.b(ibVar, 1500);
                } else {
                    b10 = new ab();
                }
                b10.j();
                break;
            case 10:
                try {
                    ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.b));
                    if (fc.a((o71) this.c)) {
                        fc.j((o71) this.c).j();
                        break;
                    }
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
                break;
            default:
                org.telegram.messenger.g0.g((String) this.b);
                ((ma1) this.c).run();
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
                textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.uj, (org.telegram.ui.ActionBar.e6) this.b));
                break;
            case 7:
                textPaint.setColor(textPaint.linkColor);
                break;
            case 8:
                int min = Math.min(textPaint.getAlpha(), (textPaint.getColor() >> 24) & hs.e4);
                if (!(((URLSpan) this.b) instanceof v31)) {
                    textPaint.setUnderlineText(true);
                }
                textPaint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.k5, false));
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

    public /* synthetic */ h(Object obj, Runnable runnable, int i3) {
        this.a = i3;
        this.b = obj;
        this.c = runnable;
    }

    public /* synthetic */ h(org.telegram.ui.ActionBar.d2 d2Var, String str, int i3) {
        this.a = i3;
        this.c = d2Var;
        this.b = str;
    }
}
