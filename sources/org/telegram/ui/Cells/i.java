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
import org.telegram.ui.Components.so;
import org.telegram.ui.Components.wc;
import org.telegram.ui.ad1;
import org.telegram.ui.wo;
import org.telegram.ui.yc1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                if (v0Var.f1 != null) {
                    v0Var.S((CharacterStyle) this.b);
                    break;
                }
                break;
            case 2:
                CharacterStyle characterStyle = (CharacterStyle) this.b;
                if (!(characterStyle instanceof o1)) {
                    s1 s1Var = ((p1) this.c).d;
                    j1 j1Var = s1Var.Jc;
                    if (j1Var != null) {
                        j1Var.I0(s1Var, characterStyle, false);
                        break;
                    }
                } else {
                    ((o1) characterStyle).onClick(view);
                    break;
                }
                break;
            case 3:
                try {
                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.b));
                    if (wc.a((org.telegram.ui.ta) this.c)) {
                        wc.j((org.telegram.ui.ta) this.c).j();
                        break;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 4:
                qf.d.r(((w1) this.c).getContext(), "https://fragment.com/username/" + ((String) this.b));
                break;
            case 5:
                qf.d.r(((wo) this.c).getContext(), "https://fragment.com/username/" + ((String) this.b));
                break;
            case 6:
                ((so) this.c).run();
                break;
            case 7:
                AndroidUtilities.addToClipboard((CharSequence) this.b);
                ((Runnable) this.c).run();
                break;
            case 8:
                try {
                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.b));
                    if (wc.a((ad1) this.c)) {
                        wc.j((ad1) this.c).j();
                        break;
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
                break;
            default:
                AndroidUtilities.addToClipboard((String) this.b);
                ((yc1) this.c).run();
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
                textPaint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Gi, (org.telegram.ui.ActionBar.u6) this.b));
                break;
            case 7:
                textPaint.setColor(textPaint.linkColor);
                break;
            case 8:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                break;
            case 9:
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

    public /* synthetic */ i(String str, org.telegram.ui.ActionBar.r2 r2Var, int i10) {
        this.a = i10;
        this.c = r2Var;
        this.b = str;
    }
}
