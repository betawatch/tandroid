package org.telegram.ui.Cells;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.jo0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class v7 implements jo0 {
    public final /* synthetic */ x7 a;

    public v7(x7 x7Var) {
        this.a = x7Var;
    }

    @Override // org.telegram.ui.Components.jo0
    public final void Y(float f10, boolean z4) {
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
        int i10 = x7Var.h;
        if (i10 != Integer.MIN_VALUE) {
            round = Math.max(round, i10);
        }
        int i11 = x7Var.f;
        if (i11 != round) {
            if (x7Var.c(i11) != x7Var.c(round)) {
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

    @Override // org.telegram.ui.Components.jo0
    public final CharSequence getContentDescription() {
        Utilities.Callback2Return callback2Return;
        x7 x7Var = this.a;
        try {
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(x7Var.s)) {
                sb.append(x7Var.s);
            }
            w7 w7Var = x7Var.r;
            if (w7Var != null && (callback2Return = w7Var.e) != null) {
                CharSequence charSequence = (CharSequence) callback2Return.run(0, Integer.valueOf(x7Var.f));
                if (!TextUtils.isEmpty(charSequence)) {
                    if (sb.length() > 0) {
                        sb.append(", ");
                    }
                    sb.append(charSequence);
                }
                CharSequence charSequence2 = (CharSequence) x7Var.r.e.run(-1, Integer.valueOf(x7Var.r.b()));
                CharSequence charSequence3 = (CharSequence) x7Var.r.e.run(1, Integer.valueOf(x7Var.r.a()));
                if (!TextUtils.isEmpty(charSequence2) && !TextUtils.isEmpty(charSequence3)) {
                    if (sb.length() > 0) {
                        sb.append(", ");
                    }
                    sb.append(charSequence2);
                    sb.append(" – ");
                    sb.append(charSequence3);
                }
            }
            if (sb.length() > 0) {
                return sb.toString();
            }
            return null;
        } catch (Throwable th2) {
            FileLog.e(th2);
            return x7Var.s;
        }
    }

    @Override // org.telegram.ui.Components.jo0
    public final int j0() {
        w7 w7Var = this.a.r;
        if (w7Var == null) {
            return 0;
        }
        return w7Var.c != null ? (r1.length - 1) * w7Var.d : w7Var.a() - w7Var.b();
    }

    @Override // org.telegram.ui.Components.jo0
    public final /* synthetic */ void B() {
    }
}
