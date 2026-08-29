package ih;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.xa;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class v implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ v(Context context, org.telegram.ui.ActionBar.c6 c6Var, long j10, TL_stars.StarGift starGift, ArrayList arrayList) {
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
                g0.Q((g0) this.f, this.b, this.c, (org.telegram.ui.ActionBar.c6) this.d, (Runnable) this.e);
                break;
            case 1:
                n0 n0Var = (n0) this.f;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.d;
                Runnable runnable = (Runnable) this.e;
                n0Var.getClass();
                t tVar = new t(this.c, c6Var, new s(this.b, true, null), n0Var.Z);
                tVar.show();
                tVar.j0 = runnable;
                n0Var.dismiss();
                break;
            case 2:
                new n0(this.c, (org.telegram.ui.ActionBar.c6) this.d, this.b, (TL_stars.StarGift) this.f, (ArrayList) this.e, null, true).show();
                break;
            default:
                e6.S((e6) this.f, this.b, this.c, (Runnable) this.e, (TL_stars.StarGift) this.d);
                break;
        }
    }

    public /* synthetic */ v(e6 e6Var, long j10, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.a = 3;
        this.f = e6Var;
        this.b = j10;
        this.c = context;
        this.e = runnable;
        this.d = starGift;
    }

    public /* synthetic */ v(xa xaVar, long j10, Context context, org.telegram.ui.ActionBar.c6 c6Var, Runnable runnable, int i10) {
        this.a = i10;
        this.f = xaVar;
        this.b = j10;
        this.c = context;
        this.d = c6Var;
        this.e = runnable;
    }
}
