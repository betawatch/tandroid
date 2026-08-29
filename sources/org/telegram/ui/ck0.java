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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ck0 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ Context a;
    public final /* synthetic */ gk0 b;

    public ck0(gk0 gk0Var, Context context) {
        this.b = gk0Var;
        this.a = context;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i10) {
        int i11;
        int i12;
        org.telegram.ui.ActionBar.l lVar;
        gk0 gk0Var = this.b;
        org.telegram.ui.ActionBar.c6 c6Var = gk0Var.h;
        SparseArray sparseArray = gk0Var.F;
        if (i10 == -1) {
            lVar = ((org.telegram.ui.ActionBar.o2) gk0Var).actionBar;
            if (lVar.s()) {
                gk0.W(gk0Var);
                return;
            } else {
                gk0Var.finishFragment();
                return;
            }
        }
        if (i10 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gk0Var.getParentActivity(), 0, c6Var);
            alertDialog$Builder.a.N = LocaleController.formatPluralString("DeleteTones", sparseArray.size(), new Object[0]);
            alertDialog$Builder.a.P = AndroidUtilities.replaceTags(LocaleController.formatPluralString("DeleteTonesMessage", sparseArray.size(), new Object[0]));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.xo0(24));
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new xt(this, 28));
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
                ek0 ek0Var = (ek0) sparseArray.valueAt(0);
                i12 = ((org.telegram.ui.ActionBar.o2) gk0Var).currentAccount;
                Uri a2 = ek0Var.a(i12);
                if (a2 != null) {
                    intent.putExtra("android.intent.extra.STREAM", a2);
                    context.startActivity(intent);
                }
            } else {
                Intent intent2 = new Intent(context, (Class<?>) LaunchActivity.class);
                intent2.setAction("android.intent.action.SEND_MULTIPLE");
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                    ek0 ek0Var2 = (ek0) sparseArray.valueAt(i13);
                    i11 = ((org.telegram.ui.ActionBar.o2) gk0Var).currentAccount;
                    Uri a10 = ek0Var2.a(i11);
                    if (a10 != null) {
                        arrayList.add(a10);
                    }
                }
                if (!arrayList.isEmpty()) {
                    intent2.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                    context.startActivity(intent2);
                }
            }
            gk0.W(gk0Var);
            gk0Var.c0();
            gk0Var.f.l();
        }
    }
}
