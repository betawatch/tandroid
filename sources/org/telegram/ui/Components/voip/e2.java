package org.telegram.ui.Components.voip;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.transition.TransitionSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ja;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.k5;
import org.telegram.ui.Components.ou0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class e2 extends LinearLayout {
    public HashMap a;
    public ArrayList b;
    public ArrayList c;
    public TransitionSet d;
    public boolean e;
    public boolean f;
    public Runnable h;
    public m1 n;
    public TextPaint r;

    public final void a(int i7, String str, String str2) {
        HashMap hashMap = this.a;
        if (hashMap.get(str2) != null) {
            return;
        }
        d2 d2Var = new d2(getContext(), this.n, i7);
        d2Var.a = str2;
        int L = org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(120.0f);
        TextView textView = d2Var.c;
        StaticLayout c10 = ou0.c(str, textView.getPaint(), L, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.END, L, 10, true);
        if (c10 != null) {
            L = 0;
            for (int i10 = 0; i10 < c10.getLineCount(); i10++) {
                L = (int) Math.max(L, Math.ceil(c10.getLineWidth(i10)));
            }
        }
        textView.setMaxWidth(L);
        textView.setText(str);
        d2Var.b.setImageResource(i7);
        hashMap.put(str2, d2Var);
        if (this.e) {
            this.b.add(d2Var);
        } else {
            this.f = true;
            addView(d2Var, ja.t(-2, -2, 1, 4, 0, 0, 4));
        }
    }

    public final CharSequence b(String str) {
        return str == null ? "" : TextUtils.ellipsize(str, this.r, org.telegram.messenger.g0.L(300.0f), TextUtils.TruncateAt.END);
    }

    public final void c(String str) {
        d2 d2Var = (d2) this.a.remove(str);
        this.n.m.remove(d2Var);
        if (d2Var != null) {
            if (!this.e) {
                this.f = true;
                removeView(d2Var);
            } else {
                if (this.b.remove(d2Var)) {
                    return;
                }
                this.c.add(d2Var);
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
