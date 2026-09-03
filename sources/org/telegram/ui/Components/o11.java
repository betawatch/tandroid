package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class o11 extends rl0 {
    public final Context c;
    public int d;
    public ArrayList e = new ArrayList();
    public ArrayList f = new ArrayList();
    public gy h;
    public String n;
    public final /* synthetic */ ThemeEditorView.EditorAlert r;

    public o11(ThemeEditorView.EditorAlert editorAlert, Context context) {
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
        int i10 = 0;
        while (true) {
            int indexOf = lowerCase.indexOf(str2, i10);
            if (indexOf == -1) {
                break;
            }
            int length = str2.length() + indexOf;
            if (i10 != 0 && i10 != indexOf + 1) {
                spannableStringBuilder.append((CharSequence) trim.substring(i10, indexOf));
            } else if (i10 == 0 && indexOf != 0) {
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
            i10 = length;
        }
        if (i10 != -1 && i10 < trim.length()) {
            spannableStringBuilder.append((CharSequence) trim.substring(i10));
        }
        return spannableStringBuilder;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.m1 m1Var) {
        return true;
    }

    @Override // f2.p0
    public final int h() {
        if (this.e.isEmpty()) {
            return 0;
        }
        return this.e.size() + 1;
    }

    @Override // f2.p0
    public final int j(int i10) {
        return i10 == 0 ? 1 : 0;
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        if (m1Var.f == 0) {
            int i11 = i10 - 1;
            org.telegram.ui.ActionBar.m6 m6Var = (org.telegram.ui.ActionBar.m6) ((ArrayList) this.e.get(i11)).get(0);
            int b10 = m6Var.f == org.telegram.ui.ActionBar.k6.Nd ? 0 : m6Var.b();
            org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) m1Var.a;
            v8Var.a.setText((CharSequence) this.f.get(i11));
            v8Var.b = b10;
            v8Var.setWillNotDraw(b10 == 0);
            v8Var.invalidate();
        }
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View v8Var;
        Context context = this.c;
        if (i10 != 0) {
            v8Var = new View(context);
            v8Var.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(56.0f)));
        } else {
            v8Var = new org.telegram.ui.Cells.v8(context);
            v8Var.setLayoutParams(new f2.x0(-1, -2));
        }
        return new el0(v8Var);
    }
}
