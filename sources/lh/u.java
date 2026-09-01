package lh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.sa;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ u(Context context, g6 g6Var, long j10, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.a = 2;
        this.c = context;
        this.d = g6Var;
        this.b = j10;
        this.f = starGift;
        this.e = arrayList;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                f0.Q((f0) this.f, this.b, this.c, (g6) this.d, (Runnable) this.e);
                break;
            case 1:
                m0 m0Var = (m0) this.f;
                g6 g6Var = (g6) this.d;
                Runnable runnable = (Runnable) this.e;
                m0Var.getClass();
                s sVar = new s(this.c, g6Var, new r(this.b, true, null), m0Var.a0);
                sVar.show();
                sVar.k0 = runnable;
                m0Var.dismiss();
                break;
            case 2:
                new m0(this.c, (g6) this.d, this.b, (TL_stars.StarGift) this.f, (ArrayList) this.e, null, true).show();
                break;
            default:
                e6.S((e6) this.f, this.b, this.c, (Runnable) this.e, (TL_stars.StarGift) this.d);
                break;
        }
    }

    public /* synthetic */ u(e6 e6Var, long j10, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.a = 3;
        this.f = e6Var;
        this.b = j10;
        this.c = context;
        this.e = runnable;
        this.d = starGift;
    }

    public /* synthetic */ u(sa saVar, long j10, Context context, g6 g6Var, Runnable runnable, int i10) {
        this.a = i10;
        this.f = saVar;
        this.b = j10;
        this.c = context;
        this.d = g6Var;
        this.e = runnable;
    }
}
