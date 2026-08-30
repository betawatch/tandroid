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
import org.telegram.ui.Components.il;
import org.telegram.ui.Components.qc;
import org.telegram.ui.hd1;
import org.telegram.ui.xo;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
                v0 v0Var = (v0) this.c;
                if (v0Var.U0 != null) {
                    v0Var.Q((CharacterStyle) this.b);
                    break;
                }
                break;
            case 2:
                CharacterStyle characterStyle = (CharacterStyle) this.b;
                if (!(characterStyle instanceof p1)) {
                    t1 t1Var = ((q1) this.c).d;
                    k1 k1Var = t1Var.Gc;
                    if (k1Var != null) {
                        k1Var.W0(t1Var, characterStyle, false);
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
                    if (qc.a((org.telegram.ui.pa) this.c)) {
                        qc.j((org.telegram.ui.pa) this.c).j();
                        break;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 4:
                af.g.s(((x1) this.c).getContext(), "https://fragment.com/username/" + ((String) this.b));
                break;
            case 5:
                af.g.s(((xo) this.c).getContext(), "https://fragment.com/username/" + ((String) this.b));
                break;
            case 6:
                ((il) this.c).run();
                break;
            case 7:
                AndroidUtilities.addToClipboard((CharSequence) this.b);
                ((Runnable) this.c).run();
                break;
            default:
                try {
                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.b));
                    if (qc.a((hd1) this.c)) {
                        qc.j((hd1) this.c).j();
                        break;
                    }
                } catch (Exception e6) {
                    FileLog.e(e6);
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
                textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Gi, (org.telegram.ui.ActionBar.f6) this.b));
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

    public /* synthetic */ i(String str, org.telegram.ui.ActionBar.p2 p2Var, int i10) {
        this.a = i10;
        this.c = p2Var;
        this.b = str;
    }
}
