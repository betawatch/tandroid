package ci;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.tr;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes4.dex */
public final class pc {
    public int a;
    public boolean b;
    public tc c;
    public String d;
    public long e;
    public long f;
    public float g;
    public float h;
    public float i;
    public final RectF j = new RectF();
    public final org.telegram.ui.Components.e6 k;
    public final /* synthetic */ vc l;

    public pc(vc vcVar) {
        this.l = vcVar;
        this.k = new org.telegram.ui.Components.e6(vcVar, 360L, tr.h);
    }

    public static void a(pc pcVar, boolean z10) {
        vc vcVar = pcVar.l;
        if (vcVar.getMeasuredWidth() > 0) {
            tc tcVar = pcVar.c;
            if (tcVar == null || z10) {
                if (tcVar != null) {
                    tcVar.b();
                    pcVar.c = null;
                }
                vc vcVar2 = pcVar.l;
                boolean z11 = pcVar.b;
                String str = pcVar.d;
                int i10 = vcVar2.v1;
                int i11 = vcVar2.y1;
                int i12 = (i10 - i11) - i11;
                int dp = AndroidUtilities.dp(38.0f);
                long j3 = pcVar.e;
                pcVar.c = new tc(vcVar2, z11, str, i12, dp, j3 > 2 ? Long.valueOf(j3) : null, vcVar.getMaxScrollDuration(), vcVar.Z0, vcVar.a1, new androidx.fragment.app.a0(pcVar, 29));
            }
        }
    }

    public static void b(pc pcVar) {
        vc vcVar = pcVar.l;
        int i10 = pcVar.a;
        if (i10 >= 0) {
            ArrayList arrayList = vcVar.r;
            if (i10 >= arrayList.size()) {
                return;
            }
            nc ncVar = (nc) arrayList.get(pcVar.a);
            if (vcVar.getMeasuredWidth() <= 0 || ncVar != null) {
                return;
            }
            if (ncVar != null) {
                ncVar.a();
            }
            arrayList.set(pcVar.a, new nc(vcVar, pcVar.d, (vcVar.getMeasuredWidth() - vcVar.getPaddingLeft()) - vcVar.getPaddingRight()));
        }
    }
}
