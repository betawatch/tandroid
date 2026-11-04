package ai;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import b8.mf;
import b8.pf;
import java.util.ArrayList;
import org.telegram.messenger.u10;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.s51;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class z2 extends q31 {
    public static final /* synthetic */ int b = 0;

    static {
        q31.h(new z2());
    }

    @Override // org.telegram.ui.Components.q31
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        a3 a3Var = (a3) view;
        int i3 = r31Var.d;
        ArrayList arrayList = (ArrayList) r31Var.G;
        int i10 = r31Var.z;
        u10 u10Var = (u10) r31Var.H;
        s51 s51Var = a3Var.a;
        ArrayList arrayList2 = a3Var.d;
        boolean z11 = a3Var.r == i3;
        a3Var.r = i3;
        if (arrayList2.size() != arrayList.size()) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (i11 >= arrayList2.size()) {
                    break;
                }
                CharSequence charSequence = i12 < arrayList.size() ? (CharSequence) arrayList.get(i12) : null;
                if (charSequence == null) {
                    s51Var.removeView((View) arrayList2.remove(i11));
                    i11--;
                } else {
                    ((TextView) arrayList2.get(i11)).setText(charSequence);
                }
                i12++;
                i11++;
            }
            while (i12 < arrayList.size()) {
                s70 s70Var = new s70(a3Var.getContext(), null);
                s70Var.setGravity(17);
                s70Var.setText((CharSequence) arrayList.get(i12));
                s70Var.setTypeface(org.telegram.messenger.g0.o());
                org.telegram.ui.ActionBar.r6.W(s70Var, org.telegram.ui.ActionBar.r6.q(org.telegram.ui.ActionBar.k6.b6, org.telegram.ui.ActionBar.k6.c6), null);
                s70Var.setTextSize(1, 14.0f);
                s70Var.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
                s70Var.setEllipsize(TextUtils.TruncateAt.END);
                s70Var.setSingleLine();
                s70Var.setMaxLines(1);
                pf.b(s70Var, 0.075f, 1.4f);
                s51Var.addView(s70Var, mf.o(-2, 26));
                arrayList2.add(s70Var);
                i12++;
            }
        }
        a3Var.b = i10;
        if (!z11) {
            a3Var.c.e(true, i10);
        }
        s51Var.invalidate();
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            ((TextView) arrayList2.get(i13)).setOnClickListener(new y2(i13, 0, u10Var));
        }
    }

    @Override // org.telegram.ui.Components.q31
    public final boolean c(r31 r31Var, r31 r31Var2) {
        return r31Var.z == r31Var2.z && r31Var.H == r31Var2.H && e(r31Var, r31Var2);
    }

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        return new a3(context);
    }

    @Override // org.telegram.ui.Components.q31
    public final boolean e(r31 r31Var, r31 r31Var2) {
        if (r31Var.d == r31Var2.d) {
            ArrayList arrayList = (ArrayList) r31Var.G;
            ArrayList arrayList2 = (ArrayList) r31Var2.G;
            if (arrayList == arrayList2) {
                return true;
            }
            if (arrayList == null && arrayList2 == null) {
                return true;
            }
            if (arrayList != null && arrayList2 != null && arrayList.size() == arrayList2.size()) {
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    if (TextUtils.equals((CharSequence) arrayList.get(i3), (CharSequence) arrayList2.get(i3))) {
                    }
                }
                return true;
            }
        }
        return false;
    }
}
