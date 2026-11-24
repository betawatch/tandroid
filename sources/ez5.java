// default package

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ez5 implements vc7 {
    public final /* synthetic */ LaunchActivity a;
    public final /* synthetic */ int b;
    public final /* synthetic */ cj3 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ Uri f;
    public final /* synthetic */ hd h;

    public /* synthetic */ ez5(LaunchActivity launchActivity, int i, cj3 cj3Var, boolean z, ArrayList arrayList, Uri uri, hd hdVar) {
        this.a = launchActivity;
        this.b = i;
        this.c = cj3Var;
        this.d = z;
        this.e = arrayList;
        this.f = uri;
        this.h = hdVar;
    }

    @Override // vc7
    public final void run(long j) {
        hd hdVar = this.h;
        String str = LaunchActivity.C1;
        LaunchActivity launchActivity = this.a;
        if (j != 0) {
            Bundle l = ir2.l("scrollToTopOnResume", true);
            if (!gl.O1()) {
                kk7.f(this.b).k(kk7.s, new Object[0]);
            }
            if (cf3.D(j)) {
                l.putLong("user_id", j);
            } else {
                l.putLong("chat_id", -j);
            }
            mu1 mu1Var = new mu1(l);
            mu1Var.O9 = true;
            ui5 N = launchActivity.N();
            cj3 cj3Var = this.c;
            ((ActionBarLayout) N).U(mu1Var, cj3Var != null || this.d, cj3Var == null);
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
            hdVar.dismiss();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
