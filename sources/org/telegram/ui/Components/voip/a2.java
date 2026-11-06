package org.telegram.ui.Components.voip;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.transition.TransitionSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ha;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.k5;
import org.telegram.ui.Components.mu0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class a2 extends LinearLayout {
    public HashMap a;
    public ArrayList b;
    public ArrayList c;
    public TransitionSet d;
    public boolean e;
    public boolean f;
    public Runnable h;
    public i1 n;
    public TextPaint r;

    public final void a(int i7, String str, String str2) {
        HashMap hashMap = this.a;
        if (hashMap.get(str2) != null) {
            return;
        }
        z1 z1Var = new z1(getContext(), this.n, i7);
        z1Var.a = str2;
        int L = org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(120.0f);
        TextView textView = z1Var.c;
        StaticLayout c10 = mu0.c(str, textView.getPaint(), L, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.END, L, 10, true);
        if (c10 != null) {
            L = 0;
            for (int i10 = 0; i10 < c10.getLineCount(); i10++) {
                L = (int) Math.max(L, Math.ceil(c10.getLineWidth(i10)));
            }
        }
        textView.setMaxWidth(L);
        textView.setText(str);
        z1Var.b.setImageResource(i7);
        hashMap.put(str2, z1Var);
        if (this.e) {
            this.b.add(z1Var);
        } else {
            this.f = true;
            addView(z1Var, ha.t(-2, -2, 1, 4, 0, 0, 4));
        }
    }

    public final CharSequence b(String str) {
        return str == null ? "" : TextUtils.ellipsize(str, this.r, org.telegram.messenger.g0.L(300.0f), TextUtils.TruncateAt.END);
    }

    public final void c(String str) {
        z1 z1Var = (z1) this.a.remove(str);
        this.n.m.remove(z1Var);
        if (z1Var != null) {
            if (!this.e) {
                this.f = true;
                removeView(z1Var);
            } else {
                if (this.b.remove(z1Var)) {
                    return;
                }
                this.c.add(z1Var);
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
