// default package

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class omc implements ee, oac, pac {
    public final /* synthetic */ goc a;

    public /* synthetic */ omc(goc gocVar) {
        this.a = gocVar;
    }

    @Override // pac
    public final Object b(c6c c6cVar, View view, Integer num, Float f, Float f2) {
        return Boolean.valueOf(this.a.c0(c6cVar, view));
    }

    @Override // oac
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        this.a.b0((c6c) obj, (View) obj2);
    }

    @Override // ee
    public final void r(he heVar, int i) {
        goc gocVar = this.a;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + a.b.getPackageName()));
            gocVar.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
