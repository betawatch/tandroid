package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class c01 extends dk0 {
    public final Context c;
    public int d;
    public ArrayList e = new ArrayList();
    public ArrayList f = new ArrayList();
    public org.telegram.ui.f0 h;
    public String n;
    public final /* synthetic */ ThemeEditorView.EditorAlert r;

    public c01(ThemeEditorView.EditorAlert editorAlert, Context context) {
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
        int i7 = 0;
        while (true) {
            int indexOf = lowerCase.indexOf(str2, i7);
            if (indexOf == -1) {
                break;
            }
            int length = str2.length() + indexOf;
            if (i7 != 0 && i7 != indexOf + 1) {
                spannableStringBuilder.append((CharSequence) trim.substring(i7, indexOf));
            } else if (i7 == 0 && indexOf != 0) {
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
            i7 = length;
        }
        if (i7 != -1 && i7 < trim.length()) {
            spannableStringBuilder.append((CharSequence) trim.substring(i7));
        }
        return spannableStringBuilder;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    @Override // v4.i0
    public final int b() {
        if (this.e.isEmpty()) {
            return 0;
        }
        return this.e.size() + 1;
    }

    @Override // v4.i0
    public final int d(int i7) {
        return i7 == 0 ? 1 : 0;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        if (f1Var.f == 0) {
            int i10 = i7 - 1;
            org.telegram.ui.ActionBar.v6 v6Var = (org.telegram.ui.ActionBar.v6) ((ArrayList) this.e.get(i10)).get(0);
            int c10 = v6Var.e == org.telegram.ui.ActionBar.m6.Ee ? 0 : v6Var.c();
            org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) f1Var.a;
            v8Var.a.setText((CharSequence) this.f.get(i10));
            v8Var.b = c10;
            v8Var.setWillNotDraw(c10 == 0);
            v8Var.invalidate();
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View v8Var;
        Context context = this.c;
        if (i7 != 0) {
            v8Var = new View(context);
            v8Var.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(56.0f)));
        } else {
            v8Var = new org.telegram.ui.Cells.v8(context);
            v8Var.setLayoutParams(new v4.q0(-1, -2));
        }
        return new mj0(v8Var);
    }
}
