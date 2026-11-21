package org.telegram.ui.Components.voip;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.transition.TransitionSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ma;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.Components.zu0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class d2 extends LinearLayout {
    public HashMap a;
    public ArrayList b;
    public ArrayList c;
    public TransitionSet d;
    public boolean e;
    public boolean f;
    public Runnable h;
    public l1 n;
    public TextPaint r;

    public final void a(int i7, String str, String str2) {
        HashMap hashMap = this.a;
        if (hashMap.get(str2) != null) {
            return;
        }
        c2 c2Var = new c2(getContext(), this.n, i7);
        c2Var.a = str2;
        int L = org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(120.0f);
        TextView textView = c2Var.c;
        StaticLayout c10 = zu0.c(str, textView.getPaint(), L, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.END, L, 10, true);
        if (c10 != null) {
            L = 0;
            for (int i10 = 0; i10 < c10.getLineCount(); i10++) {
                L = (int) Math.max(L, Math.ceil(c10.getLineWidth(i10)));
            }
        }
        textView.setMaxWidth(L);
        textView.setText(str);
        c2Var.b.setImageResource(i7);
        hashMap.put(str2, c2Var);
        if (this.e) {
            this.b.add(c2Var);
        } else {
            this.f = true;
            addView(c2Var, ma.t(-2, -2, 1, 4, 0, 0, 4));
        }
    }

    public final CharSequence b(String str) {
        return str == null ? "" : TextUtils.ellipsize(str, this.r, org.telegram.messenger.g0.L(300.0f), TextUtils.TruncateAt.END);
    }

    public final void c(String str) {
        c2 c2Var = (c2) this.a.remove(str);
        this.n.m.remove(c2Var);
        if (c2Var != null) {
            if (!this.e) {
                this.f = true;
                removeView(c2Var);
            } else {
                if (this.b.remove(c2Var)) {
                    return;
                }
                this.c.add(c2Var);
            }
        }
    }

    public int getChildsHight() {
        int childCount = getChildCount();
        return org.telegram.messenger.f3.D(32.0f, childCount, childCount > 0 ? org.telegram.messenger.g0.L(16.0f) : 0);
    }

    public void setOnViewsUpdated(Runnable runnable) {
        this.h = runnable;
    }
}
