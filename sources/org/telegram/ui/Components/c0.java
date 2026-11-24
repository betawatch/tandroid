package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class c0 extends q59 {
    public final Context c;
    public int d;
    public ArrayList e = new ArrayList();
    public ArrayList f = new ArrayList();
    public v99 h;
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

    @Override // q59
    public final boolean D(u69 u69Var) {
        return true;
    }

    @Override // y59
    public final int b() {
        if (this.e.isEmpty()) {
            return 0;
        }
        return this.e.size() + 1;
    }

    @Override // y59
    public final int d(int i) {
        return i == 0 ? 1 : 0;
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        if (u69Var.f == 0) {
            int i2 = i - 1;
            cnb cnbVar = (cnb) ((ArrayList) this.e.get(i2)).get(0);
            int c = cnbVar.e == cmb.De ? 0 : cnbVar.c();
            ejb ejbVar = (ejb) u69Var.a;
            ejbVar.a.setText((CharSequence) this.f.get(i2));
            ejbVar.b = c;
            ejbVar.setWillNotDraw(c == 0);
            ejbVar.invalidate();
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        View ejbVar;
        Context context = this.c;
        if (i != 0) {
            ejbVar = new View(context);
            ejbVar.setLayoutParams(new g69(-1, gm.L(56.0f)));
        } else {
            ejbVar = new ejb(context);
            ejbVar.setLayoutParams(new g69(-1, -2));
        }
        return new b59(ejbVar);
    }
}
