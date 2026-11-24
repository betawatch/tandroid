// default package

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class d48 implements s58 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ HashMap b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ g48 d;

    public /* synthetic */ d48(g48 g48Var, HashMap hashMap, ArrayList arrayList, byte b) {
        this.a = b;
        this.d = g48Var;
        this.b = hashMap;
        this.c = arrayList;
    }

    @Override // s58
    public final boolean c() {
        byte b = this.a;
        return true;
    }

    @Override // s58
    public final void e() {
        byte b = this.a;
    }

    @Override // s58
    public final void j(Editable editable) {
        byte b = this.a;
        g48 g48Var = this.d;
        switch (b) {
            case 0:
                rt3 rt3Var = g48Var.N;
                g48Var.a = editable;
                rt3Var.setText(editable);
                break;
            default:
                rt3 rt3Var2 = g48Var.N;
                g48Var.a = editable;
                rt3Var2.setText(editable);
                break;
        }
    }

    @Override // s58
    public final void k() {
        byte b = this.a;
    }

    @Override // s58
    public final void l(int i, boolean z, boolean z2) {
        byte b = this.a;
        ArrayList arrayList = this.c;
        HashMap hashMap = this.b;
        g48 g48Var = this.d;
        switch (b) {
            case 0:
                g48Var.removeSelfFromStack();
                if (!z) {
                    g48Var.Z(hashMap, arrayList, z2, i);
                    break;
                }
                break;
            default:
                g48Var.removeSelfFromStack();
                if (!z) {
                    g48Var.Z(hashMap, arrayList, z2, i);
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
