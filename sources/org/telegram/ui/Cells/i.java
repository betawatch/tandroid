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
import org.telegram.ui.Components.oc;
import org.telegram.ui.po;
import org.telegram.ui.tc1;
import org.telegram.ui.wq;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class i extends ClickableSpan {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i(int i9, Object obj, Object obj2) {
        this.a = i9;
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
                if (w0Var.T0 != null) {
                    w0Var.P((CharacterStyle) this.b);
                    break;
                }
                break;
            case 2:
                CharacterStyle characterStyle = (CharacterStyle) this.b;
                if (!(characterStyle instanceof p1)) {
                    t1 t1Var = ((q1) this.c).d;
                    k1 k1Var = t1Var.Fc;
                    if (k1Var != null) {
                        k1Var.R0(t1Var, characterStyle, false);
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
                    if (oc.a((org.telegram.ui.ma) this.c)) {
                        oc.j((org.telegram.ui.ma) this.c).j();
                        break;
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
                break;
            case 4:
                ve.e.s(((x1) this.c).getContext(), "https://fragment.com/username/" + ((String) this.b));
                break;
            case 5:
                ve.e.s(((po) this.c).getContext(), "https://fragment.com/username/" + ((String) this.b));
                break;
            case 6:
                ((wq) this.c).run();
                break;
            case 7:
                AndroidUtilities.addToClipboard((CharSequence) this.b);
                ((Runnable) this.c).run();
                break;
            default:
                try {
                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.b));
                    if (oc.a((tc1) this.c)) {
                        oc.j((tc1) this.c).j();
                        break;
                    }
                } catch (Exception e11) {
                    FileLog.e(e11);
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
                textPaint.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Gi, (org.telegram.ui.ActionBar.b6) this.b));
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

    public /* synthetic */ i(Object obj, Runnable runnable, int i9) {
        this.a = i9;
        this.b = obj;
        this.c = runnable;
    }

    public /* synthetic */ i(String str, org.telegram.ui.ActionBar.o2 o2Var, int i9) {
        this.a = i9;
        this.c = o2Var;
        this.b = str;
    }
}
