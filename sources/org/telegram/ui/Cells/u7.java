package org.telegram.ui.Cells;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.io0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class u7 implements io0 {
    public final /* synthetic */ w7 a;

    public u7(w7 w7Var) {
        this.a = w7Var;
    }

    @Override // org.telegram.ui.Components.io0
    public final void Y(float f10, boolean z4) {
        int round;
        w7 w7Var = this.a;
        v7 v7Var = w7Var.r;
        if (v7Var == null || w7Var.n == null) {
            return;
        }
        if (v7Var.c != null) {
            double length = f10 * (r1.length - 1);
            int clamp = Utilities.clamp((int) Math.floor(length), w7Var.r.c.length - 1, 0);
            int clamp2 = Utilities.clamp((int) Math.ceil(length), w7Var.r.c.length - 1, 0);
            int[] iArr = w7Var.r.c;
            round = Math.round(AndroidUtilities.lerp(iArr[clamp], iArr[clamp2], Math.round(((float) (length - Math.floor(length))) * w7Var.r.d) / w7Var.r.d));
        } else {
            round = Math.round(((w7Var.r.a() - w7Var.r.b()) * f10) + v7Var.b());
        }
        int i10 = w7Var.h;
        if (i10 != Integer.MIN_VALUE) {
            round = Math.max(round, i10);
        }
        int i11 = w7Var.f;
        if (i11 != round) {
            if (w7Var.c(i11) != w7Var.c(round)) {
                AndroidUtilities.vibrateCursor(w7Var.e);
            }
            w7Var.f = round;
            w7Var.e(round, true);
            Utilities.Callback callback = w7Var.n;
            if (callback != null) {
                callback.run(Integer.valueOf(w7Var.f));
            }
        }
    }

    @Override // org.telegram.ui.Components.io0
    public final CharSequence getContentDescription() {
        Utilities.Callback2Return callback2Return;
        w7 w7Var = this.a;
        try {
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(w7Var.s)) {
                sb.append(w7Var.s);
            }
            v7 v7Var = w7Var.r;
            if (v7Var != null && (callback2Return = v7Var.e) != null) {
                CharSequence charSequence = (CharSequence) callback2Return.run(0, Integer.valueOf(w7Var.f));
                if (!TextUtils.isEmpty(charSequence)) {
                    if (sb.length() > 0) {
                        sb.append(", ");
                    }
                    sb.append(charSequence);
                }
                CharSequence charSequence2 = (CharSequence) w7Var.r.e.run(-1, Integer.valueOf(w7Var.r.b()));
                CharSequence charSequence3 = (CharSequence) w7Var.r.e.run(1, Integer.valueOf(w7Var.r.a()));
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
            return w7Var.s;
        }
    }

    @Override // org.telegram.ui.Components.io0
    public final int j0() {
        v7 v7Var = this.a.r;
        if (v7Var == null) {
            return 0;
        }
        return v7Var.c != null ? (r1.length - 1) * v7Var.d : v7Var.a() - v7Var.b();
    }

    @Override // org.telegram.ui.Components.io0
    public final /* synthetic */ void B() {
    }
}
