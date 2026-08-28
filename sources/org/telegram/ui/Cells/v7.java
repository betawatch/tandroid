package org.telegram.ui.Cells;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.on0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class v7 implements on0 {
    public final /* synthetic */ x7 a;

    public v7(x7 x7Var) {
        this.a = x7Var;
    }

    @Override // org.telegram.ui.Components.on0
    public final void Q(float f10, boolean z10) {
        int round;
        x7 x7Var = this.a;
        w7 w7Var = x7Var.r;
        if (w7Var == null || x7Var.n == null) {
            return;
        }
        if (w7Var.c != null) {
            double length = f10 * (r1.length - 1);
            int clamp = Utilities.clamp((int) Math.floor(length), x7Var.r.c.length - 1, 0);
            int clamp2 = Utilities.clamp((int) Math.ceil(length), x7Var.r.c.length - 1, 0);
            int[] iArr = x7Var.r.c;
            round = Math.round(AndroidUtilities.lerp(iArr[clamp], iArr[clamp2], Math.round(((float) (length - Math.floor(length))) * x7Var.r.d) / x7Var.r.d));
        } else {
            round = Math.round(((x7Var.r.a() - x7Var.r.b()) * f10) + w7Var.b());
        }
        int i9 = x7Var.h;
        if (i9 != Integer.MIN_VALUE) {
            round = Math.max(round, i9);
        }
        int i10 = x7Var.f;
        if (i10 != round) {
            if (x7Var.c(i10) != x7Var.c(round)) {
                AndroidUtilities.vibrateCursor(x7Var.e);
            }
            x7Var.f = round;
            x7Var.e(round, true);
            Utilities.Callback callback = x7Var.n;
            if (callback != null) {
                callback.run(Integer.valueOf(x7Var.f));
            }
        }
    }

    @Override // org.telegram.ui.Components.on0
    public final int c0() {
        w7 w7Var = this.a.r;
        if (w7Var == null) {
            return 0;
        }
        return w7Var.c != null ? (r1.length - 1) * w7Var.d : w7Var.a() - w7Var.b();
    }

    @Override // org.telegram.ui.Components.on0
    public final CharSequence getContentDescription() {
        Utilities.Callback2Return callback2Return;
        x7 x7Var = this.a;
        try {
            StringBuilder sb2 = new StringBuilder();
            if (!TextUtils.isEmpty(x7Var.s)) {
                sb2.append(x7Var.s);
            }
            w7 w7Var = x7Var.r;
            if (w7Var != null && (callback2Return = w7Var.e) != null) {
                CharSequence charSequence = (CharSequence) callback2Return.run(0, Integer.valueOf(x7Var.f));
                if (!TextUtils.isEmpty(charSequence)) {
                    if (sb2.length() > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(charSequence);
                }
                CharSequence charSequence2 = (CharSequence) x7Var.r.e.run(-1, Integer.valueOf(x7Var.r.b()));
                CharSequence charSequence3 = (CharSequence) x7Var.r.e.run(1, Integer.valueOf(x7Var.r.a()));
                if (!TextUtils.isEmpty(charSequence2) && !TextUtils.isEmpty(charSequence3)) {
                    if (sb2.length() > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(charSequence2);
                    sb2.append(" – ");
                    sb2.append(charSequence3);
                }
            }
            if (sb2.length() > 0) {
                return sb2.toString();
            }
            return null;
        } catch (Throwable th) {
            FileLog.e(th);
            return x7Var.s;
        }
    }

    @Override // org.telegram.ui.Components.on0
    public final /* synthetic */ void n() {
    }
}
