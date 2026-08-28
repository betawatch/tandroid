package org.telegram.ui.Components.voip;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.transition.TransitionSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import g7.e6;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.rv0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class g2 extends LinearLayout {
    public HashMap a;
    public ArrayList b;
    public ArrayList c;
    public TransitionSet d;
    public boolean e;
    public boolean f;
    public Runnable h;
    public n1 n;
    public TextPaint r;

    public final void a(int i9, String str, String str2) {
        HashMap hashMap = this.a;
        if (hashMap.get(str2) != null) {
            return;
        }
        f2 f2Var = new f2(getContext(), this.n, i9);
        f2Var.a = str2;
        int dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(120.0f);
        TextView textView = f2Var.c;
        StaticLayout c10 = rv0.c(str, textView.getPaint(), dp, Layout.Alignment.ALIGN_NORMAL, 0.0f, false, TextUtils.TruncateAt.END, dp, 10, true);
        if (c10 != null) {
            dp = 0;
            for (int i10 = 0; i10 < c10.getLineCount(); i10++) {
                dp = (int) Math.max(dp, Math.ceil(c10.getLineWidth(i10)));
            }
        }
        textView.setMaxWidth(dp);
        textView.setText(str);
        f2Var.b.setImageResource(i9);
        hashMap.put(str2, f2Var);
        if (this.e) {
            this.b.add(f2Var);
        } else {
            this.f = true;
            addView(f2Var, e6.t(-2, -2, 1, 4, 0, 0, 4));
        }
    }

    public final CharSequence b(String str) {
        return str == null ? "" : TextUtils.ellipsize(str, this.r, AndroidUtilities.dp(300.0f), TextUtils.TruncateAt.END);
    }

    public final void c(String str) {
        f2 f2Var = (f2) this.a.remove(str);
        this.n.m.remove(f2Var);
        if (f2Var != null) {
            if (!this.e) {
                this.f = true;
                removeView(f2Var);
            } else {
                if (this.b.remove(f2Var)) {
                    return;
                }
                this.c.add(f2Var);
            }
        }
    }

    public int getChildsHight() {
        int childCount = getChildCount();
        return org.telegram.messenger.l0.D(32.0f, childCount, childCount > 0 ? AndroidUtilities.dp(16.0f) : 0);
    }

    public void setOnViewsUpdated(Runnable runnable) {
        this.h = runnable;
    }
}
