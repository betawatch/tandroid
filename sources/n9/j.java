package n9;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import b8.yd;
import com.google.firebase.FirebaseCommonRegistrar;
import java.util.List;
import o4.d0;
import o4.e0;
import o4.e1;
import o4.f1;
import o4.l1;
import o4.n1;
import o4.q;
import o4.r1;
import o4.u;
import o4.v;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements bb.d, d0, f1, g2.k, e1 {
    public final /* synthetic */ int a;

    public /* synthetic */ j(int i3) {
        this.a = i3;
    }

    @Override // bb.d
    public String a(Context context) {
        switch (this.a) {
            case 0:
                return context.getPackageManager().hasSystemFeature("android.hardware.type.television") ? "tv" : context.getPackageManager().hasSystemFeature("android.hardware.type.watch") ? "watch" : context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? "auto" : (Build.VERSION.SDK_INT < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded";
            default:
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                return installerPackageName != null ? FirebaseCommonRegistrar.b(installerPackageName) : "";
        }
    }

    @Override // g2.k
    public void accept(Object obj) {
        l1 l1Var = (l1) obj;
        switch (this.a) {
            case 7:
                l1Var.C0();
                break;
            case 8:
                l1Var.e();
                break;
            case 9:
                l1Var.d0();
                break;
            case 10:
            case 15:
            case 18:
            case 20:
            case 21:
            case 22:
            case 26:
            default:
                l1Var.v();
                break;
            case 11:
                l1Var.D0();
                break;
            case 12:
                l1Var.K0();
                break;
            case 13:
                l1Var.S();
                break;
            case 14:
                l1Var.D();
                break;
            case 16:
                l1Var.J0();
                break;
            case 17:
                l1Var.I0();
                break;
            case 19:
                l1Var.J();
                break;
            case 23:
                l1Var.stop();
                break;
            case 24:
                l1Var.a0();
                break;
            case 25:
                l1Var.F();
                break;
            case 27:
                l1Var.a();
                break;
        }
    }

    @Override // o4.e1
    public void c(l1 l1Var, v vVar, List list) {
        switch (this.a) {
            case 20:
                l1Var.w0(list);
                break;
            default:
                l1Var.w0(list);
                break;
        }
    }

    @Override // o4.d0
    public void d(u uVar, int i3) {
        switch (this.a) {
            case 2:
                uVar.getClass();
                break;
            case 3:
                uVar.b(i3);
                break;
            default:
                uVar.getClass();
                break;
        }
    }

    @Override // o4.f1
    public Object i(e0 e0Var, v vVar, int i3) {
        switch (this.a) {
            case 5:
                e0Var.getClass();
                throw new ClassCastException();
            case 6:
                e0Var.getClass();
                throw new ClassCastException();
            case 10:
                return e0Var.n(vVar);
            case 15:
                e0Var.getClass();
                throw new ClassCastException();
            case 18:
                kb.a aVar = e0Var.e;
                e0Var.s(vVar);
                aVar.getClass();
                return yd.b(new r1(-6));
            case 22:
                e0Var.getClass();
                throw new ClassCastException();
            case 26:
                e0Var.getClass();
                throw new ClassCastException();
            default:
                e0Var.getClass();
                throw new ClassCastException();
        }
    }

    public /* synthetic */ j(Object obj, int i3) {
        this.a = i3;
    }

    public /* synthetic */ j(String str, int i3, int i10, q qVar, int i11) {
        this.a = i11;
    }

    public /* synthetic */ j(String str, int i3, Object obj) {
        this.a = i3;
    }

    public /* synthetic */ j(boolean z10, n1 n1Var, Bundle bundle) {
        this.a = 10;
    }
}
