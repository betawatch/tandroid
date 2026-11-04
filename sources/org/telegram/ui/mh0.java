package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.util.SparseArray;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class mh0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ph0 b;

    public mh0(ph0 ph0Var, Context context) {
        this.b = ph0Var;
        this.a = context;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i3) {
        int i10;
        int i11;
        org.telegram.ui.ActionBar.y4 y4Var;
        ph0 ph0Var = this.b;
        org.telegram.ui.ActionBar.e6 e6Var = ph0Var.f;
        SparseArray sparseArray = ph0Var.J;
        if (i3 == -1) {
            y4Var = ((org.telegram.ui.ActionBar.d2) ph0Var).simpleActionBar;
            if (y4Var.s()) {
                ph0.b0(ph0Var);
                return;
            } else {
                ph0Var.finishFragment();
                return;
            }
        }
        if (i3 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ph0Var.getParentActivity(), e6Var);
            String G = org.telegram.messenger.bd.G(sparseArray.size(), "DeleteTones", new Object[0]);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
            s1Var.S = G;
            s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.G(sparseArray.size(), "DeleteTonesMessage", new Object[0]));
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), new u70(2));
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751599, null), new ur(this, 29));
            TextView textView = (TextView) alertDialog$Builder.p().d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, e6Var);
                return;
            }
            return;
        }
        if (i3 == 2) {
            int size = sparseArray.size();
            Context context = this.a;
            if (size == 1) {
                Intent intent = new Intent(context, (Class<?>) LaunchActivity.class);
                intent.setAction("android.intent.action.SEND");
                nh0 nh0Var = (nh0) sparseArray.valueAt(0);
                i11 = ((org.telegram.ui.ActionBar.d2) ph0Var).currentAccount;
                Uri a10 = nh0Var.a(i11);
                if (a10 != null) {
                    intent.putExtra("android.intent.extra.STREAM", a10);
                    context.startActivity(intent);
                }
            } else {
                Intent intent2 = new Intent(context, (Class<?>) LaunchActivity.class);
                intent2.setAction("android.intent.action.SEND_MULTIPLE");
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                    nh0 nh0Var2 = (nh0) sparseArray.valueAt(i12);
                    i10 = ((org.telegram.ui.ActionBar.d2) ph0Var).currentAccount;
                    Uri a11 = nh0Var2.a(i10);
                    if (a11 != null) {
                        arrayList.add(a11);
                    }
                }
                if (!arrayList.isEmpty()) {
                    intent2.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                    context.startActivity(intent2);
                }
            }
            ph0.b0(ph0Var);
            ph0Var.i0();
            ph0Var.e.f();
        }
    }
}
