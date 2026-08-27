package org.telegram.ui.Cells;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.pn0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class s7 implements pn0 {
    public final /* synthetic */ u7 a;

    public s7(u7 u7Var) {
        this.a = u7Var;
    }

    @Override // org.telegram.ui.Components.pn0
    public final void P(float f10, boolean z10) {
        int round;
        u7 u7Var = this.a;
        t7 t7Var = u7Var.r;
        if (t7Var == null || u7Var.n == null) {
            return;
        }
        if (t7Var.c != null) {
            double length = f10 * (r1.length - 1);
            int clamp = Utilities.clamp((int) Math.floor(length), u7Var.r.c.length - 1, 0);
            int clamp2 = Utilities.clamp((int) Math.ceil(length), u7Var.r.c.length - 1, 0);
            int[] iArr = u7Var.r.c;
            round = Math.round(AndroidUtilities.lerp(iArr[clamp], iArr[clamp2], Math.round(((float) (length - Math.floor(length))) * u7Var.r.d) / u7Var.r.d));
        } else {
            round = Math.round(((u7Var.r.a() - u7Var.r.b()) * f10) + t7Var.b());
        }
        int i10 = u7Var.h;
        if (i10 != Integer.MIN_VALUE) {
            round = Math.max(round, i10);
        }
        int i11 = u7Var.f;
        if (i11 != round) {
            if (u7Var.c(i11) != u7Var.c(round)) {
                AndroidUtilities.vibrateCursor(u7Var.e);
            }
            u7Var.f = round;
            u7Var.e(round, true);
            Utilities.Callback callback = u7Var.n;
            if (callback != null) {
                callback.run(Integer.valueOf(u7Var.f));
            }
        }
    }

    @Override // org.telegram.ui.Components.pn0
    public final int a0() {
        t7 t7Var = this.a.r;
        if (t7Var == null) {
            return 0;
        }
        return t7Var.c != null ? (r1.length - 1) * t7Var.d : t7Var.a() - t7Var.b();
    }

    @Override // org.telegram.ui.Components.pn0
    public final CharSequence getContentDescription() {
        Utilities.Callback2Return callback2Return;
        u7 u7Var = this.a;
        try {
            StringBuilder sb2 = new StringBuilder();
            if (!TextUtils.isEmpty(u7Var.s)) {
                sb2.append(u7Var.s);
            }
            t7 t7Var = u7Var.r;
            if (t7Var != null && (callback2Return = t7Var.e) != null) {
                CharSequence charSequence = (CharSequence) callback2Return.run(0, Integer.valueOf(u7Var.f));
                if (!TextUtils.isEmpty(charSequence)) {
                    if (sb2.length() > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(charSequence);
                }
                CharSequence charSequence2 = (CharSequence) u7Var.r.e.run(-1, Integer.valueOf(u7Var.r.b()));
                CharSequence charSequence3 = (CharSequence) u7Var.r.e.run(1, Integer.valueOf(u7Var.r.a()));
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
            return u7Var.s;
        }
    }

    @Override // org.telegram.ui.Components.pn0
    public final /* synthetic */ void r() {
    }
}
