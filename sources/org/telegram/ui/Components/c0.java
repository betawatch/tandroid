package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class c0 extends n39 {
    public final Context c;
    public int d;
    public ArrayList e = new ArrayList();
    public ArrayList f = new ArrayList();
    public t79 h;
    public String n;
    public final /* synthetic */ ThemeEditorView.EditorAlert r;

    public c0(ThemeEditorView.EditorAlert editorAlert, Context context) {
        this.r = editorAlert;
        this.c = context;
    }

    public static CharSequence E(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String trim = str.trim();
        String lowerCase = trim.toLowerCase();
        int i = 0;
        while (true) {
            int indexOf = lowerCase.indexOf(str2, i);
            if (indexOf == -1) {
                break;
            }
            int length = str2.length() + indexOf;
            if (i != 0) {
                if (i != indexOf + 1) {
                    spannableStringBuilder.append((CharSequence) trim.substring(i, indexOf));
                }
            } else if (indexOf != 0) {
                spannableStringBuilder.append((CharSequence) trim.substring(0, indexOf));
            }
            String substring = trim.substring(indexOf, Math.min(trim.length(), length));
            if (substring.startsWith(" ")) {
                spannableStringBuilder.append((CharSequence) " ");
            }
            String trim2 = substring.trim();
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) trim2);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(-11697229), length2, trim2.length() + length2, 33);
            i = length;
        }
        if (i != -1 && i < trim.length()) {
            spannableStringBuilder.append((CharSequence) trim.substring(i));
        }
        return spannableStringBuilder;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        return true;
    }

    @Override // w39
    public final int b() {
        if (this.e.isEmpty()) {
            return 0;
        }
        return this.e.size() + 1;
    }

    @Override // w39
    public final int d(int i) {
        return i == 0 ? 1 : 0;
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        if (s49Var.f == 0) {
            int i2 = i - 1;
            blb blbVar = (blb) ((ArrayList) this.e.get(i2)).get(0);
            int c = blbVar.e == bkb.De ? 0 : blbVar.c();
            dhb dhbVar = (dhb) s49Var.a;
            dhbVar.a.setText((CharSequence) this.f.get(i2));
            dhbVar.b = c;
            dhbVar.setWillNotDraw(c == 0);
            dhbVar.invalidate();
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        View dhbVar;
        Context context = this.c;
        if (i != 0) {
            dhbVar = new View(context);
            dhbVar.setLayoutParams(new e49(-1, gl.L(56.0f)));
        } else {
            dhbVar = new dhb(context);
            dhbVar.setLayoutParams(new e49(-1, -2));
        }
        return new y29(dhbVar);
    }
}
