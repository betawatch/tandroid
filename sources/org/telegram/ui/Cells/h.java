package org.telegram.ui.Cells;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.a20;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.ns;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.od;
import org.telegram.ui.Components.p21;
import org.telegram.ui.Components.xa;
import org.telegram.ui.Components.xb;
import org.telegram.ui.ao;
import org.telegram.ui.ht0;
import org.telegram.ui.w71;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
        xb b10;
        switch (this.a) {
            case 0:
                j jVar = (j) this.c;
                jVar.d((ClickableSpan) this.b, jVar.a, 0.0f);
                break;
            case 1:
                t0 t0Var = (t0) this.c;
                if (t0Var.g1 != null) {
                    t0Var.c0((CharacterStyle) this.b);
                    break;
                }
                break;
            case 2:
                CharacterStyle characterStyle = (CharacterStyle) this.b;
                if (!(characterStyle instanceof z0)) {
                    q1 q1Var = ((a1) this.c).a;
                    l1 l1Var = q1Var.Sa;
                    if (l1Var != null) {
                        l1Var.T0(q1Var, characterStyle, false);
                        break;
                    }
                } else {
                    ((z0) characterStyle).onClick(view);
                    break;
                }
                break;
            case 3:
                try {
                    ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.b));
                    if (cc.a((org.telegram.ui.la) this.c)) {
                        cc.j((org.telegram.ui.la) this.c).j();
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
                vf.c.t(((ao) this.c).getContext(), "https://fragment.com/username/" + ((String) this.b));
                break;
            case 6:
                ((od) this.c).run();
                break;
            case 7:
                org.telegram.messenger.g0.g((CharSequence) this.b);
                ((Runnable) this.c).run();
                break;
            case 8:
                URLSpan uRLSpan = (URLSpan) this.b;
                p21 p21Var = (p21) this.c;
                a20 a20Var = p21Var.O1;
                if (a20Var == null) {
                    org.telegram.ui.ActionBar.e2 e2Var = p21Var.N1;
                    if (e2Var != null) {
                        org.telegram.ui.Components.t4.n0(e2Var, uRLSpan.getURL(), false, false);
                        break;
                    }
                } else if (((Boolean) a20Var.a(uRLSpan)).booleanValue()) {
                    p21Var.dismiss();
                    break;
                }
                break;
            case 9:
                ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.b));
                cc a02 = cc.a0(((ht0) this.c).d);
                String M0 = hd.M0(2131748921, null);
                org.telegram.ui.ActionBar.e6 resourceProvider = ((ht0) this.c).d.getResourceProvider();
                a02.getClass();
                if (org.telegram.messenger.g0.H3()) {
                    fb fbVar = new fb(a02.W(), resourceProvider);
                    fbVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
                    fbVar.b.setText(M0);
                    b10 = a02.b(fbVar, 1500);
                } else {
                    b10 = new xa();
                }
                b10.j();
                break;
            case 10:
                try {
                    ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.b));
                    if (cc.a((w71) this.c)) {
                        cc.j((w71) this.c).j();
                        break;
                    }
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
                break;
            default:
                org.telegram.messenger.g0.g((String) this.b);
                ((org.telegram.ui.Wallet.r) this.c).run();
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
                textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.xj, (org.telegram.ui.ActionBar.e6) this.b));
                break;
            case 7:
                textPaint.setColor(textPaint.linkColor);
                break;
            case 8:
                int min = Math.min(textPaint.getAlpha(), (textPaint.getColor() >> 24) & ns.e4);
                if (!(((URLSpan) this.b) instanceof f41)) {
                    textPaint.setUnderlineText(true);
                }
                textPaint.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.k5, false));
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

    public /* synthetic */ h(org.telegram.ui.ActionBar.e2 e2Var, String str, int i7) {
        this.a = i7;
        this.c = e2Var;
        this.b = str;
    }
}
