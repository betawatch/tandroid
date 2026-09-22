package org.telegram.ui.Cells;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.oh;
import org.telegram.ui.Components.vc;
import org.telegram.ui.be1;
import org.telegram.ui.ep;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class i extends ClickableSpan {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                j jVar = (j) this.c;
                jVar.d((ClickableSpan) this.b, jVar.a, 0.0f);
                break;
            case 1:
                w0 w0Var = (w0) this.c;
                if (w0Var.X0 != null) {
                    w0Var.Q((CharacterStyle) this.b);
                    break;
                }
                break;
            case 2:
                CharacterStyle characterStyle = (CharacterStyle) this.b;
                if (!(characterStyle instanceof p1)) {
                    t1 t1Var = ((q1) this.c).d;
                    k1 k1Var = t1Var.Jc;
                    if (k1Var != null) {
                        k1Var.V0(t1Var, characterStyle, false);
                        break;
                    }
                } else {
                    ((p1) characterStyle).onClick(view);
                    break;
                }
                break;
            case 3:
                try {
                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.b));
                    if (vc.a((org.telegram.ui.qa) this.c)) {
                        vc.j((org.telegram.ui.qa) this.c).j();
                        break;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 4:
                nf.f.s(((x1) this.c).getContext(), "https://fragment.com/username/" + ((String) this.b));
                break;
            case 5:
                nf.f.s(((ep) this.c).getContext(), "https://fragment.com/username/" + ((String) this.b));
                break;
            case 6:
                ((oh) this.c).run();
                break;
            case 7:
                AndroidUtilities.addToClipboard((CharSequence) this.b);
                ((Runnable) this.c).run();
                break;
            default:
                try {
                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.b));
                    if (vc.a((be1) this.c)) {
                        vc.j((be1) this.c).j();
                        break;
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
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
                textPaint.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Gi, (org.telegram.ui.ActionBar.e6) this.b));
                break;
            case 7:
                textPaint.setColor(textPaint.linkColor);
                break;
            case 8:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                break;
            default:
                super.updateDrawState(textPaint);
                break;
        }
    }

    public /* synthetic */ i(Object obj, Runnable runnable, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = runnable;
    }

    public /* synthetic */ i(String str, org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        this.a = i10;
        this.c = n2Var;
        this.b = str;
    }
}
