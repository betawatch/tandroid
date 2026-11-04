package org.telegram.ui.Components.voip;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.transition.TransitionSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.k5;
import org.telegram.ui.Components.lu0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class p1 extends LinearLayout {
    public HashMap a;
    public ArrayList b;
    public ArrayList c;
    public TransitionSet d;
    public boolean e;
    public boolean f;
    public Runnable h;
    public x0 n;
    public TextPaint r;

    public final void a(int i3, String str, String str2) {
        HashMap hashMap = this.a;
        if (hashMap.get(str2) != null) {
            return;
        }
        o1 o1Var = new o1(getContext(), this.n, i3);
        o1Var.a = str2;
        int L = org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(120.0f);
        TextView textView = o1Var.c;
        StaticLayout c2 = lu0.c(str, textView.getPaint(), L, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.END, L, 10, true);
        if (c2 != null) {
            L = 0;
            for (int i10 = 0; i10 < c2.getLineCount(); i10++) {
                L = (int) Math.max(L, Math.ceil(c2.getLineWidth(i10)));
            }
        }
        textView.setMaxWidth(L);
        textView.setText(str);
        o1Var.b.setImageResource(i3);
        hashMap.put(str2, o1Var);
        if (this.e) {
            this.b.add(o1Var);
        } else {
            this.f = true;
            addView(o1Var, mf.t(-2, -2, 1, 4, 0, 0, 4));
        }
    }

    public final CharSequence b(String str) {
        return str == null ? "" : TextUtils.ellipsize(str, this.r, org.telegram.messenger.g0.L(300.0f), TextUtils.TruncateAt.END);
    }

    public final void c(String str) {
        o1 o1Var = (o1) this.a.remove(str);
        this.n.m.remove(o1Var);
        if (o1Var != null) {
            if (!this.e) {
                this.f = true;
                removeView(o1Var);
            } else {
                if (this.b.remove(o1Var)) {
                    return;
                }
                this.c.add(o1Var);
            }
        }
    }

    public int getChildsHight() {
        int childCount = getChildCount();
        return k5.D(32.0f, childCount, childCount > 0 ? org.telegram.messenger.g0.L(16.0f) : 0);
    }

    public void setOnViewsUpdated(Runnable runnable) {
        this.h = runnable;
    }
}
