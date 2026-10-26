package org.telegram.ui.Cells;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.kp0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class a8 implements kp0 {
    public final /* synthetic */ c8 a;

    public a8(c8 c8Var) {
        this.a = c8Var;
    }

    @Override // org.telegram.ui.Components.kp0
    public final void U(float f7, boolean z10) {
        int round;
        c8 c8Var = this.a;
        b8 b8Var = c8Var.r;
        if (b8Var == null || c8Var.n == null) {
            return;
        }
        if (b8Var.c != null) {
            double length = f7 * (r1.length - 1);
            int clamp = Utilities.clamp((int) Math.floor(length), c8Var.r.c.length - 1, 0);
            int clamp2 = Utilities.clamp((int) Math.ceil(length), c8Var.r.c.length - 1, 0);
            int[] iArr = c8Var.r.c;
            round = Math.round(AndroidUtilities.lerp(iArr[clamp], iArr[clamp2], Math.round(((float) (length - Math.floor(length))) * c8Var.r.d) / c8Var.r.d));
        } else {
            round = Math.round(((c8Var.r.a() - c8Var.r.b()) * f7) + b8Var.b());
        }
        int i10 = c8Var.h;
        if (i10 != Integer.MIN_VALUE) {
            round = Math.max(round, i10);
        }
        int i11 = c8Var.f;
        if (i11 != round) {
            if (c8Var.c(i11) != c8Var.c(round)) {
                AndroidUtilities.vibrateCursor(c8Var.e);
            }
            c8Var.f = round;
            c8Var.e(round, true);
            Utilities.Callback callback = c8Var.n;
            if (callback != null) {
                callback.run(Integer.valueOf(c8Var.f));
            }
        }
    }

    @Override // org.telegram.ui.Components.kp0
    public final CharSequence getContentDescription() {
        Utilities.Callback2Return callback2Return;
        c8 c8Var = this.a;
        try {
            StringBuilder sb2 = new StringBuilder();
            if (!TextUtils.isEmpty(c8Var.s)) {
                sb2.append(c8Var.s);
            }
            b8 b8Var = c8Var.r;
            if (b8Var != null && (callback2Return = b8Var.e) != null) {
                CharSequence charSequence = (CharSequence) callback2Return.run(0, Integer.valueOf(c8Var.f));
                if (!TextUtils.isEmpty(charSequence)) {
                    if (sb2.length() > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(charSequence);
                }
                CharSequence charSequence2 = (CharSequence) c8Var.r.e.run(-1, Integer.valueOf(c8Var.r.b()));
                CharSequence charSequence3 = (CharSequence) c8Var.r.e.run(1, Integer.valueOf(c8Var.r.a()));
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
            return c8Var.s;
        }
    }

    @Override // org.telegram.ui.Components.kp0
    public final int k0() {
        b8 b8Var = this.a.r;
        if (b8Var == null) {
            return 0;
        }
        return b8Var.c != null ? (r1.length - 1) * b8Var.d : b8Var.a() - b8Var.b();
    }

    @Override // org.telegram.ui.Components.kp0
    public final /* synthetic */ void y() {
    }
}
