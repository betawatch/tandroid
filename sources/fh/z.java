package fh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.sa;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class z implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ z(Context context, org.telegram.ui.ActionBar.b6 b6Var, long j10, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.a = 2;
        this.c = context;
        this.d = b6Var;
        this.b = j10;
        this.f = starGift;
        this.e = arrayList;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                k0.P((k0) this.f, this.b, this.c, (org.telegram.ui.ActionBar.b6) this.d, (Runnable) this.e);
                break;
            case 1:
                r0 r0Var = (r0) this.f;
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.d;
                Runnable runnable = (Runnable) this.e;
                r0Var.getClass();
                x xVar = new x(this.c, b6Var, new w(this.b, true, null), r0Var.Z);
                xVar.show();
                xVar.j0 = runnable;
                r0Var.dismiss();
                break;
            case 2:
                new r0(this.c, (org.telegram.ui.ActionBar.b6) this.d, this.b, (TL_stars.StarGift) this.f, (ArrayList) this.e, null, true).show();
                break;
            default:
                u6.R((u6) this.f, this.b, this.c, (Runnable) this.e, (TL_stars.StarGift) this.d);
                break;
        }
    }

    public /* synthetic */ z(u6 u6Var, long j10, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.a = 3;
        this.f = u6Var;
        this.b = j10;
        this.c = context;
        this.e = runnable;
        this.d = starGift;
    }

    public /* synthetic */ z(sa saVar, long j10, Context context, org.telegram.ui.ActionBar.b6 b6Var, Runnable runnable, int i9) {
        this.a = i9;
        this.f = saVar;
        this.b = j10;
        this.c = context;
        this.d = b6Var;
        this.e = runnable;
    }
}
