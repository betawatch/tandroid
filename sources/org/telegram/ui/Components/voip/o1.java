package org.telegram.ui.Components.voip;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.transition.TransitionSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.m5;
import org.telegram.ui.Components.ov0;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class o1 extends LinearLayout {
    public HashMap a;
    public ArrayList b;
    public ArrayList c;
    public TransitionSet d;
    public boolean e;
    public boolean f;
    public Runnable h;
    public x0 n;
    public TextPaint r;

    public final void a(int i10, String str, String str2) {
        HashMap hashMap = this.a;
        if (hashMap.get(str2) != null) {
            return;
        }
        n1 n1Var = new n1(getContext(), this.n, i10);
        n1Var.a = str2;
        int L = org.telegram.messenger.i0.q.x - org.telegram.messenger.i0.L(120.0f);
        TextView textView = n1Var.c;
        StaticLayout c10 = ov0.c(str, textView.getPaint(), L, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.END, L, 10, true);
        if (c10 != null) {
            L = 0;
            for (int i11 = 0; i11 < c10.getLineCount(); i11++) {
                L = (int) Math.max(L, Math.ceil(c10.getLineWidth(i11)));
            }
        }
        textView.setMaxWidth(L);
        textView.setText(str);
        n1Var.b.setImageResource(i10);
        hashMap.put(str2, n1Var);
        if (this.e) {
            this.b.add(n1Var);
        } else {
            this.f = true;
            addView(n1Var, b6.t(-2, -2, 1, 4, 0, 0, 4));
        }
    }

    public final CharSequence b(String str) {
        return str == null ? "" : TextUtils.ellipsize(str, this.r, org.telegram.messenger.i0.L(300.0f), TextUtils.TruncateAt.END);
    }

    public final void c(String str) {
        n1 n1Var = (n1) this.a.remove(str);
        this.n.m.remove(n1Var);
        if (n1Var != null) {
            if (!this.e) {
                this.f = true;
                removeView(n1Var);
            } else {
                if (this.b.remove(n1Var)) {
                    return;
                }
                this.c.add(n1Var);
            }
        }
    }

    public int getChildsHight() {
        int childCount = getChildCount();
        return m5.D(32.0f, childCount, childCount > 0 ? org.telegram.messenger.i0.L(16.0f) : 0);
    }

    public void setOnViewsUpdated(Runnable runnable) {
        this.h = runnable;
    }
}
