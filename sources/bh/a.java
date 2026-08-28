package bh;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import n5.a0;
import org.telegram.ui.Components.jn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;

    public /* synthetic */ a(j jVar, int i9) {
        this.a = i9;
        this.b = jVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i9 = this.a;
        j jVar = this.b;
        switch (i9) {
            case 0:
                a0 a0Var = jVar.g0;
                if (a0Var != null) {
                    ArrayList arrayList = new ArrayList(jVar.f0.keySet());
                    jn jnVar = (jn) a0Var.b;
                    ArrayList arrayList2 = jnVar.L0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int i10 = jnVar.H0;
                    if (i10 >= 0) {
                        jnVar.r.m(i10);
                    }
                }
                jVar.dismiss();
                break;
            case 1:
                a0 a0Var2 = jVar.g0;
                if (a0Var2 != null) {
                    ArrayList arrayList3 = new ArrayList(jVar.f0.keySet());
                    jn jnVar2 = (jn) a0Var2.b;
                    ArrayList arrayList4 = jnVar2.L0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    int i11 = jnVar2.H0;
                    if (i11 >= 0) {
                        jnVar2.r.m(i11);
                    }
                }
                jVar.dismiss();
                break;
            case 2:
                HashMap hashMap = jVar.f0;
                hashMap.clear();
                jVar.d0.b();
                jVar.Z.N(true);
                jVar.a0.c(hashMap.size(), true);
                break;
            case 3:
                jVar.R(view);
                break;
            default:
                int i12 = j.n0;
                jVar.R(view);
                break;
        }
    }
}
