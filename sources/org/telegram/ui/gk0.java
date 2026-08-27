package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.util.SparseArray;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class gk0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Context a;
    public final /* synthetic */ kk0 b;

    public gk0(kk0 kk0Var, Context context) {
        this.b = kk0Var;
        this.a = context;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        int i12;
        org.telegram.ui.ActionBar.k kVar;
        kk0 kk0Var = this.b;
        org.telegram.ui.ActionBar.c6 c6Var = kk0Var.h;
        SparseArray sparseArray = kk0Var.F;
        if (i10 == -1) {
            kVar = ((org.telegram.ui.ActionBar.n2) kk0Var).actionBar;
            if (kVar.t()) {
                kk0.W(kk0Var);
                return;
            } else {
                kk0Var.finishFragment();
                return;
            }
        }
        if (i10 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kk0Var.getParentActivity(), 0, c6Var);
            alertDialog$Builder.a.N = LocaleController.formatPluralString("DeleteTones", sparseArray.size(), new Object[0]);
            alertDialog$Builder.a.P = AndroidUtilities.replaceTags(LocaleController.formatPluralString("DeleteTonesMessage", sparseArray.size(), new Object[0]));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new j70(5));
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new zt(this, 28));
            TextView textView = (TextView) alertDialog$Builder.o().d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.q7, c6Var));
                return;
            }
            return;
        }
        if (i10 == 2) {
            int size = sparseArray.size();
            Context context = this.a;
            if (size == 1) {
                Intent intent = new Intent(context, (Class<?>) LaunchActivity.class);
                intent.setAction("android.intent.action.SEND");
                ik0 ik0Var = (ik0) sparseArray.valueAt(0);
                i12 = ((org.telegram.ui.ActionBar.n2) kk0Var).currentAccount;
                Uri a2 = ik0Var.a(i12);
                if (a2 != null) {
                    intent.putExtra("android.intent.extra.STREAM", a2);
                    context.startActivity(intent);
                }
            } else {
                Intent intent2 = new Intent(context, (Class<?>) LaunchActivity.class);
                intent2.setAction("android.intent.action.SEND_MULTIPLE");
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                    ik0 ik0Var2 = (ik0) sparseArray.valueAt(i13);
                    i11 = ((org.telegram.ui.ActionBar.n2) kk0Var).currentAccount;
                    Uri a3 = ik0Var2.a(i11);
                    if (a3 != null) {
                        arrayList.add(a3);
                    }
                }
                if (!arrayList.isEmpty()) {
                    intent2.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                    context.startActivity(intent2);
                }
            }
            kk0.W(kk0Var);
            kk0Var.c0();
            kk0Var.f.l();
        }
    }
}
