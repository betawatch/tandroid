package org.telegram.ui.Cells;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.bp0;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class w7 implements bp0 {
    public final /* synthetic */ y7 a;

    public w7(y7 y7Var) {
        this.a = y7Var;
    }

    @Override // org.telegram.ui.Components.bp0
    public final void L(float f7, boolean z10) {
        int round;
        y7 y7Var = this.a;
        x7 x7Var = y7Var.r;
        if (x7Var == null || y7Var.n == null) {
            return;
        }
        if (x7Var.c != null) {
            double length = f7 * (r1.length - 1);
            int clamp = Utilities.clamp((int) Math.floor(length), y7Var.r.c.length - 1, 0);
            int clamp2 = Utilities.clamp((int) Math.ceil(length), y7Var.r.c.length - 1, 0);
            int[] iArr = y7Var.r.c;
            round = Math.round(AndroidUtilities.lerp(iArr[clamp], iArr[clamp2], Math.round(((float) (length - Math.floor(length))) * y7Var.r.d) / y7Var.r.d));
        } else {
            round = Math.round(((y7Var.r.a() - y7Var.r.b()) * f7) + x7Var.b());
        }
        int i10 = y7Var.h;
        if (i10 != Integer.MIN_VALUE) {
            round = Math.max(round, i10);
        }
        int i11 = y7Var.f;
        if (i11 != round) {
            if (y7Var.c(i11) != y7Var.c(round)) {
                AndroidUtilities.vibrateCursor(y7Var.e);
            }
            y7Var.f = round;
            y7Var.e(round, true);
            Utilities.Callback callback = y7Var.n;
            if (callback != null) {
                callback.run(Integer.valueOf(y7Var.f));
            }
        }
    }

    @Override // org.telegram.ui.Components.bp0
    public final int Y() {
        x7 x7Var = this.a.r;
        if (x7Var == null) {
            return 0;
        }
        return x7Var.c != null ? (r1.length - 1) * x7Var.d : x7Var.a() - x7Var.b();
    }

    @Override // org.telegram.ui.Components.bp0
    public final CharSequence getContentDescription() {
        Utilities.Callback2Return callback2Return;
        y7 y7Var = this.a;
        try {
            StringBuilder sb2 = new StringBuilder();
            if (!TextUtils.isEmpty(y7Var.s)) {
                sb2.append(y7Var.s);
            }
            x7 x7Var = y7Var.r;
            if (x7Var != null && (callback2Return = x7Var.e) != null) {
                CharSequence charSequence = (CharSequence) callback2Return.run(0, Integer.valueOf(y7Var.f));
                if (!TextUtils.isEmpty(charSequence)) {
                    if (sb2.length() > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(charSequence);
                }
                CharSequence charSequence2 = (CharSequence) y7Var.r.e.run(-1, Integer.valueOf(y7Var.r.b()));
                CharSequence charSequence3 = (CharSequence) y7Var.r.e.run(1, Integer.valueOf(y7Var.r.a()));
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
        } catch (Throwable th2) {
            FileLog.e(th2);
            return y7Var.s;
        }
    }

    @Override // org.telegram.ui.Components.bp0
    public final /* synthetic */ void v() {
    }
}
