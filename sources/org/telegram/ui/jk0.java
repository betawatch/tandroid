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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class jk0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Context a;
    public final /* synthetic */ nk0 b;

    public jk0(nk0 nk0Var, Context context) {
        this.b = nk0Var;
        this.a = context;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        int i12;
        org.telegram.ui.ActionBar.k kVar;
        nk0 nk0Var = this.b;
        org.telegram.ui.ActionBar.g6 g6Var = nk0Var.h;
        SparseArray sparseArray = nk0Var.J;
        if (i10 == -1) {
            kVar = ((org.telegram.ui.ActionBar.o2) nk0Var).actionBar;
            if (kVar.s()) {
                nk0.W(nk0Var);
                return;
            } else {
                nk0Var.finishFragment();
                return;
            }
        }
        if (i10 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(nk0Var.getParentActivity(), 0, g6Var);
            alertDialog$Builder.a.R = LocaleController.formatPluralString("DeleteTones", sparseArray.size(), new Object[0]);
            alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString("DeleteTonesMessage", sparseArray.size(), new Object[0]));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new wv(10));
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new xt(this, 27));
            TextView textView = (TextView) alertDialog$Builder.p().d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.q7, g6Var);
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
                lk0 lk0Var = (lk0) sparseArray.valueAt(0);
                i12 = ((org.telegram.ui.ActionBar.o2) nk0Var).currentAccount;
                Uri a2 = lk0Var.a(i12);
                if (a2 != null) {
                    intent.putExtra("android.intent.extra.STREAM", a2);
                    context.startActivity(intent);
                }
            } else {
                Intent intent2 = new Intent(context, (Class<?>) LaunchActivity.class);
                intent2.setAction("android.intent.action.SEND_MULTIPLE");
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                    lk0 lk0Var2 = (lk0) sparseArray.valueAt(i13);
                    i11 = ((org.telegram.ui.ActionBar.o2) nk0Var).currentAccount;
                    Uri a10 = lk0Var2.a(i11);
                    if (a10 != null) {
                        arrayList.add(a10);
                    }
                }
                if (!arrayList.isEmpty()) {
                    intent2.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                    context.startActivity(intent2);
                }
            }
            nk0.W(nk0Var);
            nk0Var.d0();
            nk0Var.f.l();
        }
    }
}
