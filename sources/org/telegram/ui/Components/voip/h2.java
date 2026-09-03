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
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.y3;
import org.telegram.ui.Components.kw0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class h2 extends LinearLayout {
    public HashMap a;
    public ArrayList b;
    public ArrayList c;
    public TransitionSet d;
    public boolean e;
    public boolean f;
    public Runnable h;
    public n1 n;
    public TextPaint r;

    public final void a(int i10, String str, String str2) {
        HashMap hashMap = this.a;
        if (hashMap.get(str2) != null) {
            return;
        }
        g2 g2Var = new g2(getContext(), this.n, i10);
        g2Var.a = str2;
        int dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(120.0f);
        TextView textView = g2Var.c;
        StaticLayout c3 = kw0.c(str, textView.getPaint(), dp, Layout.Alignment.ALIGN_NORMAL, 0.0f, false, TextUtils.TruncateAt.END, dp, 10, true);
        if (c3 != null) {
            dp = 0;
            for (int i11 = 0; i11 < c3.getLineCount(); i11++) {
                dp = (int) Math.max(dp, Math.ceil(c3.getLineWidth(i11)));
            }
        }
        textView.setMaxWidth(dp);
        textView.setText(str);
        g2Var.b.setImageResource(i10);
        hashMap.put(str2, g2Var);
        if (this.e) {
            this.b.add(g2Var);
        } else {
            this.f = true;
            addView(g2Var, b6.t(-2, -2, 1, 4, 0, 0, 4));
        }
    }

    public final CharSequence b(String str) {
        return str == null ? "" : TextUtils.ellipsize(str, this.r, AndroidUtilities.dp(300.0f), TextUtils.TruncateAt.END);
    }

    public final void c(String str) {
        g2 g2Var = (g2) this.a.remove(str);
        this.n.m.remove(g2Var);
        if (g2Var != null) {
            if (!this.e) {
                this.f = true;
                removeView(g2Var);
            } else {
                if (this.b.remove(g2Var)) {
                    return;
                }
                this.c.add(g2Var);
            }
        }
    }

    public int getChildsHight() {
        int childCount = getChildCount();
        return y3.D(32.0f, childCount, childCount > 0 ? AndroidUtilities.dp(16.0f) : 0);
    }

    public void setOnViewsUpdated(Runnable runnable) {
        this.h = runnable;
    }
}
