package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.util.SparseArray;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class ph0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Context a;
    public final /* synthetic */ sh0 b;

    public ph0(sh0 sh0Var, Context context) {
        this.b = sh0Var;
        this.a = context;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        int i10;
        int i11;
        org.telegram.ui.ActionBar.y4 y4Var;
        sh0 sh0Var = this.b;
        org.telegram.ui.ActionBar.f6 f6Var = sh0Var.f;
        SparseArray sparseArray = sh0Var.I;
        if (i7 == -1) {
            y4Var = ((org.telegram.ui.ActionBar.f2) sh0Var).simpleActionBar;
            if (y4Var.s()) {
                sh0.b0(sh0Var);
                return;
            } else {
                sh0Var.finishFragment();
                return;
            }
        }
        if (i7 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, sh0Var.getParentActivity(), f6Var);
            String G = org.telegram.messenger.hd.G(sparseArray.size(), "DeleteTones", new Object[0]);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.R = G;
            u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G(sparseArray.size(), "DeleteTonesMessage", new Object[0]));
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new org.telegram.ui.Components.il0(27));
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751599, null), new wr(this, 28));
            TextView textView = (TextView) alertDialog$Builder.p().d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, f6Var);
                return;
            }
            return;
        }
        if (i7 == 2) {
            int size = sparseArray.size();
            Context context = this.a;
            if (size == 1) {
                Intent intent = new Intent(context, (Class<?>) LaunchActivity.class);
                intent.setAction("android.intent.action.SEND");
                qh0 qh0Var = (qh0) sparseArray.valueAt(0);
                i11 = ((org.telegram.ui.ActionBar.f2) sh0Var).currentAccount;
                Uri a10 = qh0Var.a(i11);
                if (a10 != null) {
                    intent.putExtra("android.intent.extra.STREAM", a10);
                    context.startActivity(intent);
                }
            } else {
                Intent intent2 = new Intent(context, (Class<?>) LaunchActivity.class);
                intent2.setAction("android.intent.action.SEND_MULTIPLE");
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                    qh0 qh0Var2 = (qh0) sparseArray.valueAt(i12);
                    i10 = ((org.telegram.ui.ActionBar.f2) sh0Var).currentAccount;
                    Uri a11 = qh0Var2.a(i10);
                    if (a11 != null) {
                        arrayList.add(a11);
                    }
                }
                if (!arrayList.isEmpty()) {
                    intent2.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                    context.startActivity(intent2);
                }
            }
            sh0.b0(sh0Var);
            sh0Var.i0();
            sh0Var.e.f();
        }
    }
}
