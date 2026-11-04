package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class qz0 extends sj0 {
    public final Context c;
    public int d;
    public ArrayList e = new ArrayList();
    public ArrayList f = new ArrayList();
    public org.telegram.ui.f4 h;
    public String n;
    public final /* synthetic */ ThemeEditorView.EditorAlert r;

    public qz0(ThemeEditorView.EditorAlert editorAlert, Context context) {
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
        int i3 = 0;
        while (true) {
            int indexOf = lowerCase.indexOf(str2, i3);
            if (indexOf == -1) {
                break;
            }
            int length = str2.length() + indexOf;
            if (i3 != 0 && i3 != indexOf + 1) {
                spannableStringBuilder.append((CharSequence) trim.substring(i3, indexOf));
            } else if (i3 == 0 && indexOf != 0) {
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
            i3 = length;
        }
        if (i3 != -1 && i3 < trim.length()) {
            spannableStringBuilder.append((CharSequence) trim.substring(i3));
        }
        return spannableStringBuilder;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return true;
    }

    @Override // u4.h0
    public final int b() {
        if (this.e.isEmpty()) {
            return 0;
        }
        return this.e.size() + 1;
    }

    @Override // u4.h0
    public final int d(int i3) {
        return i3 == 0 ? 1 : 0;
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        if (d1Var.f == 0) {
            int i10 = i3 - 1;
            org.telegram.ui.ActionBar.t6 t6Var = (org.telegram.ui.ActionBar.t6) ((ArrayList) this.e.get(i10)).get(0);
            int c2 = t6Var.e == org.telegram.ui.ActionBar.k6.Be ? 0 : t6Var.c();
            org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) d1Var.a;
            t8Var.a.setText((CharSequence) this.f.get(i10));
            t8Var.b = c2;
            t8Var.setWillNotDraw(c2 == 0);
            t8Var.invalidate();
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View t8Var;
        Context context = this.c;
        if (i3 != 0) {
            t8Var = new View(context);
            t8Var.setLayoutParams(new u4.p0(-1, org.telegram.messenger.g0.L(56.0f)));
        } else {
            t8Var = new org.telegram.ui.Cells.t8(context);
            t8Var.setLayoutParams(new u4.p0(-1, -2));
        }
        return new bj0(t8Var);
    }
}
