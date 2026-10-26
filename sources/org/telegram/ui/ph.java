package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FlagSecureReason;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ph implements FlagSecureReason.FlagSecureCondition, zu0, r0.n, org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ un a;

    public /* synthetic */ ph(un unVar) {
        this.a = unVar;
    }

    @Override // r0.n
    public r0.k1 P0(View view, r0.k1 k1Var) {
        un unVar = this.a;
        r0.k1 C8 = unVar.C8(k1Var);
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(C8, false);
        int i10 = defaultWindowInsets.a;
        int i11 = defaultWindowInsets.c;
        if (unVar.pb != i10 || unVar.qb != i11) {
            unVar.pb = i10;
            unVar.qb = i11;
            unVar.j1.requestLayout();
        }
        unVar.v.j(C8);
        bh.r rVar = unVar.W3;
        if (rVar != null) {
            rVar.setPadding(i10, 0, i11, 0);
        }
        unVar.u7();
        unVar.y7();
        unVar.y9();
        boolean p10 = C8.a.p(8);
        if (unVar.ob != p10) {
            unVar.ob = p10;
            unVar.j1.R();
        }
        fi.h1 h1Var = unVar.C1;
        if (h1Var != null) {
            r0.i0.b(h1Var, C8);
        }
        return r0.k1.b;
    }

    @Override // org.telegram.ui.zu0
    public void a(float[] fArr) {
        un unVar = this.a;
        fArr[1] = unVar.x0.getBottom() - unVar.Na;
        fArr[0] = (unVar.x0.getTop() + unVar.E9) - AndroidUtilities.dp(4.0f);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        un unVar = this.a;
        unVar.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            unVar.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.messenger.FlagSecureReason.FlagSecureCondition
    public boolean run() {
        un unVar = this.a;
        return unVar.h != null || unVar.H9();
    }
}
