package k3;

import android.media.AudioDeviceInfo;
import android.os.Bundle;
import android.view.WindowManager;
import j3.t0;
import java.util.ArrayList;
import l4.j1;
import l4.k1;
import l4.p;
import lh.i1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.Components.yu0;
import org.telegram.ui.Components.zu0;
import q8.l0;
import q8.x;
import q8.z;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements f5.j, j3.f, NativeInstance.AudioLevelsCallback, yu0, zu0, b2 {
    public final /* synthetic */ int a;

    public /* synthetic */ d(int i10) {
        this.a = i10;
    }

    public static /* bridge */ /* synthetic */ AudioDeviceInfo a(Object obj) {
        return (AudioDeviceInfo) obj;
    }

    @Override // org.telegram.ui.Components.zu0
    public void b(Object obj, float f9) {
        i1 i1Var = (i1) obj;
        switch (this.a) {
            case 22:
                WindowManager.LayoutParams layoutParams = i1Var.c;
                i1Var.J = f9;
                layoutParams.x = (int) f9;
                AndroidUtilities.updateViewLayout(i1Var.b, i1Var.d, layoutParams);
                break;
            default:
                WindowManager.LayoutParams layoutParams2 = i1Var.c;
                i1Var.K = f9;
                layoutParams2.y = (int) f9;
                AndroidUtilities.updateViewLayout(i1Var.b, i1Var.d, layoutParams2);
                break;
        }
    }

    @Override // j3.f
    public j3.g c(Bundle bundle) {
        l0 s10;
        m4.b[] bVarArr;
        switch (this.a) {
            case 18:
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(j1.f);
                if (parcelableArrayList == null) {
                    x xVar = z.b;
                    s10 = l0.e;
                } else {
                    s10 = f5.a.s(t0.F0, parcelableArrayList);
                }
                return new j1(bundle.getString(j1.h, ""), (t0[]) s10.toArray(new t0[0]));
            case 19:
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(k1.e);
                return parcelableArrayList2 == null ? new k1(new j1[0]) : new k1((j1[]) f5.a.s(j1.n, parcelableArrayList2).toArray(new j1[0]));
            default:
                ArrayList parcelableArrayList3 = bundle.getParcelableArrayList(m4.c.n);
                if (parcelableArrayList3 == null) {
                    bVarArr = new m4.b[0];
                } else {
                    m4.b[] bVarArr2 = new m4.b[parcelableArrayList3.size()];
                    for (int i10 = 0; i10 < parcelableArrayList3.size(); i10++) {
                        bVarArr2[i10] = (m4.b) m4.b.C.c((Bundle) parcelableArrayList3.get(i10));
                    }
                    bVarArr = bVarArr2;
                }
                return new m4.c(bVarArr, bundle.getLong(m4.c.r, 0L), bundle.getLong(m4.c.s, -9223372036854775807L), bundle.getInt(m4.c.v, 0));
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(c2 c2Var, int i10) {
        switch (this.a) {
            case 25:
                c2Var.dismiss();
                break;
            default:
                c2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.yu0
    public float get(Object obj) {
        i1 i1Var = (i1) obj;
        switch (this.a) {
            case 21:
                return i1Var.J;
            default:
                return i1Var.K;
        }
    }

    @Override // f5.j
    public void invoke(Object obj) {
        b bVar = (b) obj;
        switch (this.a) {
            case 0:
                bVar.getClass();
                break;
            case 1:
                bVar.getClass();
                break;
            case 2:
                bVar.getClass();
                break;
            case 3:
                bVar.getClass();
                break;
            case 4:
                bVar.getClass();
                break;
            case 5:
                bVar.getClass();
                break;
            case 6:
                bVar.getClass();
                break;
            case 7:
                bVar.getClass();
                break;
            case 8:
                bVar.getClass();
                break;
            case 9:
                bVar.getClass();
                break;
            case 10:
                bVar.getClass();
                break;
            case 11:
                bVar.getClass();
                break;
            case 12:
                bVar.getClass();
                break;
            case 13:
                bVar.getClass();
                break;
            case 14:
                bVar.getClass();
                break;
            default:
                bVar.getClass();
                break;
        }
    }

    public /* synthetic */ d(a aVar) {
        this.a = 10;
    }

    public /* synthetic */ d(a aVar, float f9) {
        this.a = 4;
    }

    public /* synthetic */ d(a aVar, int i10) {
        this.a = 3;
    }

    public /* synthetic */ d(a aVar, int i10, boolean z10) {
        this.a = 7;
    }

    public /* synthetic */ d(a aVar, Object obj, int i10) {
        this.a = i10;
    }

    public /* synthetic */ d(a aVar, p pVar, l4.x xVar) {
        this.a = 11;
    }

    public /* synthetic */ d(a aVar, boolean z10, int i10) {
        this.a = i10;
    }

    @Override // org.telegram.messenger.voip.NativeInstance.AudioLevelsCallback
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
    }
}
