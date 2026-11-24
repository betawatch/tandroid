// default package

import android.graphics.Bitmap;
import android.view.View;
import android.view.animation.BaseInterpolator;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class chc implements rgf {
    public long a;
    public boolean b;
    public final Object c;
    public Object d;
    public Object e;
    public final Object f;

    public chc() {
        this.a = -1L;
        this.f = new bhc(this);
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
                ((ahc) obj).b();
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
            ahc ahcVar = (ahc) obj;
            long j = this.a;
            if (j >= 0) {
                ahcVar.c(j);
            }
            BaseInterpolator baseInterpolator = (BaseInterpolator) this.d;
            if (baseInterpolator != null && (view = (View) ahcVar.a.get()) != null) {
                view.animate().setInterpolator(baseInterpolator);
            }
            if (((ehc) this.e) != null) {
                ahcVar.d((bhc) this.f);
            }
            View view2 = (View) ahcVar.a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.b = true;
    }

    @Override // rgf
    public final ry zza() {
        yoe yoeVar = (yoe) this.c;
        long j = this.a;
        o7f o7fVar = (o7f) this.d;
        boolean z = this.b;
        gq5 gq5Var = (gq5) this.e;
        uhf uhfVar = (uhf) this.f;
        boolean z2 = false;
        sm2 sm2Var = new sm2((byte) 24, z2);
        uqd uqdVar = new uqd((byte) 9);
        uqdVar.b = Long.valueOf(j & Long.MAX_VALUE);
        uqdVar.c = o7fVar;
        uqdVar.d = Boolean.valueOf(z);
        sm2Var.b = new c6f(uqdVar);
        yoe.l.getClass();
        Bitmap bitmap = gq5Var.a;
        ite.h(bitmap);
        int allocationByteCount = bitmap.getAllocationByteCount();
        rhb rhbVar = new rhb((byte) 21, z2);
        rhbVar.b = o5f.b;
        rhbVar.c = Integer.valueOf(allocationByteCount & ConnectionsManager.DEFAULT_DATACENTER_ID);
        sm2Var.c = new r5f(rhbVar);
        sm2Var.d = yoeVar.e.a();
        if (uhfVar != null) {
            ArrayList arrayList = uhfVar.d;
            mbd mbdVar = ccd.f;
            Object[] array = arrayList.toArray();
            int length = array.length;
            j2f.a(length, array);
            sm2Var.f = ccd.m(length, array);
            ArrayList arrayList2 = uhfVar.a;
            if (!arrayList2.isEmpty()) {
                Object[] objArr = new Object[4];
                int size = arrayList2.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    shf shfVar = (shf) obj;
                    xvc xvcVar = new xvc((byte) 20, z2);
                    xvcVar.b = Integer.valueOf(shfVar.c & ConnectionsManager.DEFAULT_DATACENTER_ID);
                    xvcVar.c = Integer.valueOf(shfVar.d & ConnectionsManager.DEFAULT_DATACENTER_ID);
                    xvcVar.d = Integer.valueOf(shfVar.e & ConnectionsManager.DEFAULT_DATACENTER_ID);
                    xvcVar.e = Integer.valueOf(shfVar.f & ConnectionsManager.DEFAULT_DATACENTER_ID);
                    mef mefVar = new mef(xvcVar);
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
                    objArr[i] = mefVar;
                    i = i3;
                }
                sm2Var.e = ccd.m(i, objArr);
            }
        }
        ovb ovbVar = new ovb();
        ovbVar.c = x6f.b;
        ovbVar.f = new kdf(sm2Var);
        return new ry(ovbVar, 0);
    }

    public /* synthetic */ chc(yoe yoeVar, long j, o7f o7fVar, boolean z, gq5 gq5Var, uhf uhfVar) {
        this.c = yoeVar;
        this.a = j;
        this.d = o7fVar;
        this.b = z;
        this.e = gq5Var;
        this.f = uhfVar;
    }
}
