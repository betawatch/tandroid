package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class c0 extends c79 {
    public final Context c;
    public int d;
    public ArrayList e = new ArrayList();
    public ArrayList f = new ArrayList();
    public a39 h;
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

    @Override // c79
    public final boolean D(f89 f89Var) {
        return true;
    }

    @Override // j79
    public final int b() {
        if (this.e.isEmpty()) {
            return 0;
        }
        return this.e.size() + 1;
    }

    @Override // j79
    public final int d(int i) {
        return i == 0 ? 1 : 0;
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        if (f89Var.f == 0) {
            int i2 = i - 1;
            apb apbVar = (apb) ((ArrayList) this.e.get(i2)).get(0);
            int c = apbVar.e == aob.Ee ? 0 : apbVar.c();
            zkb zkbVar = (zkb) f89Var.a;
            zkbVar.a.setText((CharSequence) this.f.get(i2));
            zkbVar.b = c;
            zkbVar.setWillNotDraw(c == 0);
            zkbVar.invalidate();
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        View zkbVar;
        Context context = this.c;
        if (i != 0) {
            zkbVar = new View(context);
            zkbVar.setLayoutParams(new r79(-1, hl.L(56.0f)));
        } else {
            zkbVar = new zkb(context);
            zkbVar.setLayoutParams(new r79(-1, -2));
        }
        return new n69(zkbVar);
    }
}
