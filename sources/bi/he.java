package bi;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.wr;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class he {
    public int a;
    public boolean b;
    public ke c;
    public String d;
    public long e;
    public long f;
    public float g;
    public float h;
    public float i;
    public final RectF j = new RectF();
    public final org.telegram.ui.Components.d6 k;
    public final /* synthetic */ me l;

    public he(me meVar) {
        this.l = meVar;
        this.k = new org.telegram.ui.Components.d6(meVar, 360L, wr.h);
    }

    public static void a(he heVar, boolean z10) {
        me meVar = heVar.l;
        if (meVar.getMeasuredWidth() > 0) {
            ke keVar = heVar.c;
            if (keVar == null || z10) {
                if (keVar != null) {
                    keVar.b();
                    heVar.c = null;
                }
                me meVar2 = heVar.l;
                boolean z11 = heVar.b;
                String str = heVar.d;
                int i10 = meVar2.v1;
                int i11 = meVar2.y1;
                int i12 = (i10 - i11) - i11;
                int dp = AndroidUtilities.dp(38.0f);
                long j3 = heVar.e;
                heVar.c = new ke(meVar2, z11, str, i12, dp, j3 > 2 ? Long.valueOf(j3) : null, meVar.getMaxScrollDuration(), meVar.Z0, meVar.a1, new wc(heVar, 5));
            }
        }
    }

    public static void b(he heVar) {
        me meVar = heVar.l;
        int i10 = heVar.a;
        if (i10 >= 0) {
            ArrayList arrayList = meVar.r;
            if (i10 >= arrayList.size()) {
                return;
            }
            fe feVar = (fe) arrayList.get(heVar.a);
            if (meVar.getMeasuredWidth() <= 0 || feVar != null) {
                return;
            }
            if (feVar != null) {
                feVar.a();
            }
            arrayList.set(heVar.a, new fe(meVar, heVar.d, (meVar.getMeasuredWidth() - meVar.getPaddingLeft()) - meVar.getPaddingRight()));
        }
    }
}
