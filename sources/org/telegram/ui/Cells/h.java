package org.telegram.ui.Cells;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.r20;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.cd;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.eb;
import org.telegram.ui.Components.m31;
import org.telegram.ui.Components.va;
import org.telegram.ui.Components.wb;
import org.telegram.ui.p91;
import org.telegram.ui.su0;
import org.telegram.ui.wo;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class h extends ClickableSpan {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        wb b10;
        switch (this.a) {
            case 0:
                i iVar = (i) this.c;
                iVar.d((ClickableSpan) this.b, iVar.a, 0.0f);
                break;
            case 1:
                s0 s0Var = (s0) this.c;
                if (s0Var.f1 != null) {
                    s0Var.a0((CharacterStyle) this.b);
                    break;
                }
                break;
            case 2:
                CharacterStyle characterStyle = (CharacterStyle) this.b;
                if (!(characterStyle instanceof x0)) {
                    q1 q1Var = ((y0) this.c).a;
                    l1 l1Var = q1Var.Qa;
                    if (l1Var != null) {
                        l1Var.L0(q1Var, characterStyle, false);
                        break;
                    }
                } else {
                    ((x0) characterStyle).onClick(view);
                    break;
                }
                break;
            case 3:
                try {
                    ((ClipboardManager) org.telegram.messenger.w0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.b));
                    if (cc.a((org.telegram.ui.oa) this.c)) {
                        cc.j((org.telegram.ui.oa) this.c).j();
                        break;
                    }
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
                break;
            case 4:
                gf.f.r(((b2) this.c).getContext(), "https://fragment.com/username/" + ((String) this.b));
                break;
            case 5:
                gf.f.r(((wo) this.c).getContext(), "https://fragment.com/username/" + ((String) this.b));
                break;
            case 6:
                ((cd) this.c).run();
                break;
            case 7:
                org.telegram.messenger.i0.g((CharSequence) this.b);
                ((Runnable) this.c).run();
                break;
            case 8:
                URLSpan uRLSpan = (URLSpan) this.b;
                m31 m31Var = (m31) this.c;
                r20 r20Var = m31Var.K1;
                if (r20Var == null) {
                    org.telegram.ui.ActionBar.k2 k2Var = m31Var.J1;
                    if (k2Var != null) {
                        org.telegram.ui.Components.s4.p0(k2Var, uRLSpan.getURL(), false, false);
                        break;
                    }
                } else if (((Boolean) r20Var.a(uRLSpan)).booleanValue()) {
                    m31Var.dismiss();
                    break;
                }
                break;
            case 9:
                ((ClipboardManager) org.telegram.messenger.w0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.b));
                cc a02 = cc.a0(((su0) this.c).d);
                String L0 = org.telegram.messenger.cd.L0(2131748931, null);
                org.telegram.ui.ActionBar.p6 resourceProvider = ((su0) this.c).d.getResourceProvider();
                a02.getClass();
                if (org.telegram.messenger.i0.H3()) {
                    eb ebVar = new eb(a02.W(), resourceProvider);
                    ebVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
                    ebVar.b.setText(L0);
                    b10 = a02.b(ebVar, 1500);
                } else {
                    b10 = new va();
                }
                b10.j();
                break;
            case 10:
                try {
                    ((ClipboardManager) org.telegram.messenger.w0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.b));
                    if (cc.a((p91) this.c)) {
                        cc.j((p91) this.c).j();
                        break;
                    }
                } catch (Exception e7) {
                    org.telegram.messenger.f8.g(e7, true);
                    return;
                }
                break;
            default:
                org.telegram.messenger.i0.g((String) this.b);
                ((org.telegram.ui.Wallet.k3) this.c).run();
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
                textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.uj, (org.telegram.ui.ActionBar.p6) this.b));
                break;
            case 7:
                textPaint.setColor(textPaint.linkColor);
                break;
            case 8:
                int min = Math.min(textPaint.getAlpha(), (textPaint.getColor() >> 24) & zs.e4);
                if (!(((URLSpan) this.b) instanceof e51)) {
                    textPaint.setUnderlineText(true);
                }
                textPaint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.k5, false));
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

    public /* synthetic */ h(Object obj, Runnable runnable, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = runnable;
    }

    public /* synthetic */ h(org.telegram.ui.ActionBar.k2 k2Var, String str, int i10) {
        this.a = i10;
        this.c = k2Var;
        this.b = str;
    }
}
