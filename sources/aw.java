// default package

import android.text.TextUtils;
import org.telegram.ui.l;
import org.telegram.ui.m;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class aw extends xx0 {
    @Override // xx0
    public final String b() {
        nv0 nv0Var = this.b;
        return (nv0Var == null || TextUtils.isEmpty(nv0Var.getTitle())) ? super.b() : this.b.getTitle();
    }

    public final void c(m mVar) {
        if (mVar != null) {
            l lVar = mVar.f;
            lVar.J();
            this.b = lVar.getWebView();
            this.d = lVar.getProxy();
            nv0 nv0Var = this.b;
            if (nv0Var != null) {
                nv0Var.onPause();
                this.E = this.b.getTitle();
                this.F = this.b.getFavicon();
                this.x = this.b.getUrl();
                this.q = mVar.x;
                this.r = mVar.y;
            }
        }
    }
}
