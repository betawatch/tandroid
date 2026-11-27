// default package

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class e16 implements ef7 {
    public final /* synthetic */ LaunchActivity a;
    public final /* synthetic */ int b;
    public final /* synthetic */ uj3 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ Uri f;
    public final /* synthetic */ id h;

    public /* synthetic */ e16(LaunchActivity launchActivity, int i, uj3 uj3Var, boolean z, ArrayList arrayList, Uri uri, id idVar) {
        this.a = launchActivity;
        this.b = i;
        this.c = uj3Var;
        this.d = z;
        this.e = arrayList;
        this.f = uri;
        this.h = idVar;
    }

    @Override // ef7
    public final void run(long j) {
        id idVar = this.h;
        String str = LaunchActivity.C1;
        LaunchActivity launchActivity = this.a;
        if (j != 0) {
            Bundle l = bs2.l("scrollToTopOnResume", true);
            if (!hl.O1()) {
                jn7.f(this.b).k(jn7.s, new Object[0]);
            }
            if (wf3.D(j)) {
                l.putLong("user_id", j);
            } else {
                l.putLong("chat_id", -j);
            }
            zu1 zu1Var = new zu1(l);
            zu1Var.O9 = true;
            wk5 N = launchActivity.N();
            uj3 uj3Var = this.c;
            ((ActionBarLayout) N).U(zu1Var, uj3Var != null || this.d, uj3Var == null);
        } else {
            ArrayList arrayList = this.e;
            launchActivity.X = arrayList;
            if (arrayList == null) {
                arrayList = new ArrayList();
                launchActivity.X = arrayList;
            }
            arrayList.add(0, this.f);
            launchActivity.j0(true);
        }
        try {
            idVar.dismiss();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
