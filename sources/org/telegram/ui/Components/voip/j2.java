package org.telegram.ui.Components.voip;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.transition.TransitionSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import i7.f6;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.x3;
import org.telegram.ui.Components.bw0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class j2 extends LinearLayout {
    public HashMap a;
    public ArrayList b;
    public ArrayList c;
    public TransitionSet d;
    public boolean e;
    public boolean f;
    public Runnable h;
    public o1 n;
    public TextPaint r;

    public final void a(int i10, String str, String str2) {
        HashMap hashMap = this.a;
        if (hashMap.get(str2) != null) {
            return;
        }
        i2 i2Var = new i2(getContext(), this.n, i10);
        i2Var.a = str2;
        int dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(120.0f);
        TextView textView = i2Var.c;
        StaticLayout c3 = bw0.c(str, textView.getPaint(), dp, Layout.Alignment.ALIGN_NORMAL, 0.0f, false, TextUtils.TruncateAt.END, dp, 10, true);
        if (c3 != null) {
            dp = 0;
            for (int i11 = 0; i11 < c3.getLineCount(); i11++) {
                dp = (int) Math.max(dp, Math.ceil(c3.getLineWidth(i11)));
            }
        }
        textView.setMaxWidth(dp);
        textView.setText(str);
        i2Var.b.setImageResource(i10);
        hashMap.put(str2, i2Var);
        if (this.e) {
            this.b.add(i2Var);
        } else {
            this.f = true;
            addView(i2Var, f6.t(-2, -2, 1, 4, 0, 0, 4));
        }
    }

    public final CharSequence b(String str) {
        return str == null ? "" : TextUtils.ellipsize(str, this.r, AndroidUtilities.dp(300.0f), TextUtils.TruncateAt.END);
    }

    public final void c(String str) {
        i2 i2Var = (i2) this.a.remove(str);
        this.n.m.remove(i2Var);
        if (i2Var != null) {
            if (!this.e) {
                this.f = true;
                removeView(i2Var);
            } else {
                if (this.b.remove(i2Var)) {
                    return;
                }
                this.c.add(i2Var);
            }
        }
    }

    public int getChildsHight() {
        int childCount = getChildCount();
        return x3.D(32.0f, childCount, childCount > 0 ? AndroidUtilities.dp(16.0f) : 0);
    }

    public void setOnViewsUpdated(Runnable runnable) {
        this.h = runnable;
    }
}
