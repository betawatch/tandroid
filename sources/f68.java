// default package

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class f68 implements u78 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ HashMap b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ j68 d;

    public /* synthetic */ f68(j68 j68Var, HashMap hashMap, ArrayList arrayList, byte b) {
        this.a = b;
        this.d = j68Var;
        this.b = hashMap;
        this.c = arrayList;
    }

    @Override // u78
    public final boolean c() {
        byte b = this.a;
        return true;
    }

    @Override // u78
    public final void e() {
        byte b = this.a;
    }

    @Override // u78
    public final void i(Editable editable) {
        byte b = this.a;
        j68 j68Var = this.d;
        switch (b) {
            case 0:
                cv3 cv3Var = j68Var.N;
                j68Var.a = editable;
                cv3Var.setText(editable);
                break;
            default:
                cv3 cv3Var2 = j68Var.N;
                j68Var.a = editable;
                cv3Var2.setText(editable);
                break;
        }
    }

    @Override // u78
    public final void j() {
        byte b = this.a;
    }

    @Override // u78
    public final void k(int i, boolean z, boolean z2) {
        byte b = this.a;
        ArrayList arrayList = this.c;
        HashMap hashMap = this.b;
        j68 j68Var = this.d;
        switch (b) {
            case 0:
                j68Var.removeSelfFromStack();
                if (!z) {
                    j68Var.a0(hashMap, arrayList, z2, i);
                    break;
                }
                break;
            default:
                j68Var.removeSelfFromStack();
                if (!z) {
                    j68Var.a0(hashMap, arrayList, z2, i);
                    break;
                }
                break;
        }
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void d() {
    }

    private final void f() {
    }
}
