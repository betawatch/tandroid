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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class r01 extends vk0 {
    public final Context c;
    public int d;
    public ArrayList e = new ArrayList();
    public ArrayList f = new ArrayList();
    public org.telegram.ui.rl h;
    public String n;
    public final /* synthetic */ ThemeEditorView.EditorAlert r;

    public r01(ThemeEditorView.EditorAlert editorAlert, Context context) {
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
        int i9 = 0;
        while (true) {
            int indexOf = lowerCase.indexOf(str2, i9);
            if (indexOf == -1) {
                break;
            }
            int length = str2.length() + indexOf;
            if (i9 != 0 && i9 != indexOf + 1) {
                spannableStringBuilder.append((CharSequence) trim.substring(i9, indexOf));
            } else if (i9 == 0 && indexOf != 0) {
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
            i9 = length;
        }
        if (i9 != -1 && i9 < trim.length()) {
            spannableStringBuilder.append((CharSequence) trim.substring(i9));
        }
        return spannableStringBuilder;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return true;
    }

    @Override // f2.r0
    public final int h() {
        if (this.e.isEmpty()) {
            return 0;
        }
        return this.e.size() + 1;
    }

    @Override // f2.r0
    public final int j(int i9) {
        return i9 == 0 ? 1 : 0;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        if (q1Var.f == 0) {
            int i10 = i9 - 1;
            org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) ((ArrayList) this.e.get(i10)).get(0);
            int b10 = h6Var.f == org.telegram.ui.ActionBar.f6.Nd ? 0 : h6Var.b();
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) q1Var.a;
            w8Var.a.setText((CharSequence) this.f.get(i10));
            w8Var.b = b10;
            w8Var.setWillNotDraw(b10 == 0);
            w8Var.invalidate();
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View w8Var;
        Context context = this.c;
        if (i9 != 0) {
            w8Var = new View(context);
            w8Var.setLayoutParams(new f2.a1(-1, AndroidUtilities.dp(56.0f)));
        } else {
            w8Var = new org.telegram.ui.Cells.w8(context);
            w8Var.setLayoutParams(new f2.a1(-1, -2));
        }
        return new ik0(w8Var);
    }
}
