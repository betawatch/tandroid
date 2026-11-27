// default package

import android.graphics.Bitmap;
import android.view.View;
import android.view.animation.BaseInterpolator;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class bjc implements gjf {
    public long a;
    public boolean b;
    public final Object c;
    public Object d;
    public Object e;
    public final Object f;

    public bjc() {
        this.a = -1L;
        this.f = new ajc(this);
        this.c = new ArrayList();
    }

    public final void a() {
        if (this.b) {
            ArrayList arrayList = (ArrayList) this.c;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((zic) obj).b();
            }
            this.b = false;
        }
    }

    public final void b() {
        View view;
        if (this.b) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            zic zicVar = (zic) obj;
            long j = this.a;
            if (j >= 0) {
                zicVar.c(j);
            }
            BaseInterpolator baseInterpolator = (BaseInterpolator) this.d;
            if (baseInterpolator != null && (view = (View) zicVar.a.get()) != null) {
                view.animate().setInterpolator(baseInterpolator);
            }
            if (((djc) this.e) != null) {
                zicVar.d((ajc) this.f);
            }
            View view2 = (View) zicVar.a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.b = true;
    }

    @Override // gjf
    public final rx zza() {
        mre mreVar = (mre) this.c;
        long j = this.a;
        daf dafVar = (daf) this.d;
        boolean z = this.b;
        jq5 jq5Var = (jq5) this.e;
        jkf jkfVar = (jkf) this.f;
        boolean z2 = false;
        am2 am2Var = new am2((byte) 23, z2);
        htd htdVar = new htd((byte) 9);
        htdVar.b = Long.valueOf(j & Long.MAX_VALUE);
        htdVar.c = dafVar;
        htdVar.d = Boolean.valueOf(z);
        am2Var.b = new r8f(htdVar);
        mre.l.getClass();
        Bitmap bitmap = jq5Var.a;
        xve.h(bitmap);
        int allocationByteCount = bitmap.getAllocationByteCount();
        zhc zhcVar = new zhc((byte) 19, z2);
        zhcVar.b = d8f.b;
        zhcVar.c = Integer.valueOf(allocationByteCount & ConnectionsManager.DEFAULT_DATACENTER_ID);
        am2Var.c = new g8f(zhcVar);
        am2Var.d = mreVar.e.a();
        if (jkfVar != null) {
            ArrayList arrayList = jkfVar.d;
            ded dedVar = ted.f;
            Object[] array = arrayList.toArray();
            int length = array.length;
            z4f.a(length, array);
            am2Var.f = ted.m(length, array);
            ArrayList arrayList2 = jkfVar.a;
            if (!arrayList2.isEmpty()) {
                Object[] objArr = new Object[4];
                int size = arrayList2.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    hkf hkfVar = (hkf) obj;
                    lyc lycVar = new lyc((byte) 20, z2);
                    lycVar.b = Integer.valueOf(hkfVar.c & ConnectionsManager.DEFAULT_DATACENTER_ID);
                    lycVar.c = Integer.valueOf(hkfVar.d & ConnectionsManager.DEFAULT_DATACENTER_ID);
                    lycVar.d = Integer.valueOf(hkfVar.e & ConnectionsManager.DEFAULT_DATACENTER_ID);
                    lycVar.e = Integer.valueOf(hkfVar.f & ConnectionsManager.DEFAULT_DATACENTER_ID);
                    bhf bhfVar = new bhf(lycVar);
                    int i3 = i + 1;
                    int length2 = objArr.length;
                    if (length2 < i3) {
                        int i4 = length2 + (length2 >> 1) + 1;
                        if (i4 < i3) {
                            i4 = Integer.highestOneBit(i) << 1;
                        }
                        if (i4 < 0) {
                            i4 = Integer.MAX_VALUE;
                        }
                        objArr = Arrays.copyOf(objArr, i4);
                    }
                    objArr[i] = bhfVar;
                    i = i3;
                }
                am2Var.e = ted.m(i, objArr);
            }
        }
        oxb oxbVar = new oxb();
        oxbVar.c = m9f.b;
        oxbVar.f = new zff(am2Var);
        return new rx(oxbVar, 0);
    }

    public /* synthetic */ bjc(mre mreVar, long j, daf dafVar, boolean z, jq5 jq5Var, jkf jkfVar) {
        this.c = mreVar;
        this.a = j;
        this.d = dafVar;
        this.b = z;
        this.e = jq5Var;
        this.f = jkfVar;
    }
}
