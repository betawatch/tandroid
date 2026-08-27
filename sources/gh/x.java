package gh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.qa;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ x(Context context, org.telegram.ui.ActionBar.c6 c6Var, long j10, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.a = 2;
        this.c = context;
        this.d = c6Var;
        this.b = j10;
        this.f = starGift;
        this.e = arrayList;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                i0.Q((i0) this.f, this.b, this.c, (org.telegram.ui.ActionBar.c6) this.d, (Runnable) this.e);
                break;
            case 1:
                p0 p0Var = (p0) this.f;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.d;
                Runnable runnable = (Runnable) this.e;
                p0Var.getClass();
                v vVar = new v(this.c, c6Var, new u(this.b, true, null), p0Var.Z);
                vVar.show();
                vVar.j0 = runnable;
                p0Var.dismiss();
                break;
            case 2:
                new p0(this.c, (org.telegram.ui.ActionBar.c6) this.d, this.b, (TL_stars.StarGift) this.f, (ArrayList) this.e, null, true).show();
                break;
            default:
                m6.S((m6) this.f, this.b, this.c, (Runnable) this.e, (TL_stars.StarGift) this.d);
                break;
        }
    }

    public /* synthetic */ x(m6 m6Var, long j10, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.a = 3;
        this.f = m6Var;
        this.b = j10;
        this.c = context;
        this.e = runnable;
        this.d = starGift;
    }

    public /* synthetic */ x(qa qaVar, long j10, Context context, org.telegram.ui.ActionBar.c6 c6Var, Runnable runnable, int i10) {
        this.a = i10;
        this.f = qaVar;
        this.b = j10;
        this.c = context;
        this.d = c6Var;
        this.e = runnable;
    }
}
