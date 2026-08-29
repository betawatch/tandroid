package org.telegram.ui.Cells;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.zn0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class t7 implements zn0 {
    public final /* synthetic */ v7 a;

    public t7(v7 v7Var) {
        this.a = v7Var;
    }

    @Override // org.telegram.ui.Components.zn0
    public final void W(float f9, boolean z10) {
        int round;
        v7 v7Var = this.a;
        u7 u7Var = v7Var.r;
        if (u7Var == null || v7Var.n == null) {
            return;
        }
        if (u7Var.c != null) {
            double length = f9 * (r1.length - 1);
            int clamp = Utilities.clamp((int) Math.floor(length), v7Var.r.c.length - 1, 0);
            int clamp2 = Utilities.clamp((int) Math.ceil(length), v7Var.r.c.length - 1, 0);
            int[] iArr = v7Var.r.c;
            round = Math.round(AndroidUtilities.lerp(iArr[clamp], iArr[clamp2], Math.round(((float) (length - Math.floor(length))) * v7Var.r.d) / v7Var.r.d));
        } else {
            round = Math.round(((v7Var.r.a() - v7Var.r.b()) * f9) + u7Var.b());
        }
        int i10 = v7Var.h;
        if (i10 != Integer.MIN_VALUE) {
            round = Math.max(round, i10);
        }
        int i11 = v7Var.f;
        if (i11 != round) {
            if (v7Var.c(i11) != v7Var.c(round)) {
                AndroidUtilities.vibrateCursor(v7Var.e);
            }
            v7Var.f = round;
            v7Var.e(round, true);
            Utilities.Callback callback = v7Var.n;
            if (callback != null) {
                callback.run(Integer.valueOf(v7Var.f));
            }
        }
    }

    @Override // org.telegram.ui.Components.zn0
    public final CharSequence getContentDescription() {
        Utilities.Callback2Return callback2Return;
        v7 v7Var = this.a;
        try {
            StringBuilder sb2 = new StringBuilder();
            if (!TextUtils.isEmpty(v7Var.s)) {
                sb2.append(v7Var.s);
            }
            u7 u7Var = v7Var.r;
            if (u7Var != null && (callback2Return = u7Var.e) != null) {
                CharSequence charSequence = (CharSequence) callback2Return.run(0, Integer.valueOf(v7Var.f));
                if (!TextUtils.isEmpty(charSequence)) {
                    if (sb2.length() > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(charSequence);
                }
                CharSequence charSequence2 = (CharSequence) v7Var.r.e.run(-1, Integer.valueOf(v7Var.r.b()));
                CharSequence charSequence3 = (CharSequence) v7Var.r.e.run(1, Integer.valueOf(v7Var.r.a()));
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
            return v7Var.s;
        }
    }

    @Override // org.telegram.ui.Components.zn0
    public final int k0() {
        u7 u7Var = this.a.r;
        if (u7Var == null) {
            return 0;
        }
        return u7Var.c != null ? (r1.length - 1) * u7Var.d : u7Var.a() - u7Var.b();
    }

    @Override // org.telegram.ui.Components.zn0
    public final /* synthetic */ void v() {
    }
}
