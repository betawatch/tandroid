package ei;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.hs;
import org.telegram.messenger.hw;
import org.telegram.messenger.xy;
import org.telegram.messenger.ye;
import org.telegram.messenger.yy;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.zh;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class y2 implements zh {
    public final /* synthetic */ j4 a;

    public y2(j4 j4Var) {
        this.a = j4Var;
    }

    @Override // org.telegram.ui.Components.zh
    public final /* synthetic */ boolean L1() {
        return false;
    }

    @Override // org.telegram.ui.Components.zh
    public final void R1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i3, int i10, long j10, boolean z11, long j11) {
        org.telegram.messenger.c accountInstance;
        j4 j4Var = this.a;
        TL_stories.StoryItem storyItem = j4Var.y1.a;
        if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        accountInstance = j4Var.getAccountInstance();
        CharSequence charSequence2 = charSequence != null ? charSequence : null;
        long j12 = j4Var.l1;
        org.telegram.messenger.p5 p5Var = yy.J;
        new Thread(new hw(null, arrayList, j12, accountInstance, charSequence2, false, null, null, null, null, z10, i3, i10, storyItem, null, j10, z11, j11, null)).start();
        j4Var.i0(j11 <= 0);
    }

    @Override // org.telegram.ui.Components.zh
    public final void Y(ng ngVar) {
        hs.f(this.a.m2).d(ngVar);
    }

    @Override // org.telegram.ui.Components.zh
    public final boolean g0() {
        return this.a.L0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [int] */
    /* JADX WARN: Type inference failed for: r7v3 */
    @Override // org.telegram.ui.Components.zh
    public final void o1(int i3, boolean z10, boolean z11, int i10, int i11, long j10, boolean z12, boolean z13, long j11) {
        TL_stories.StoryItem storyItem;
        org.telegram.messenger.c accountInstance;
        boolean z14;
        ?? r12;
        String str;
        j4 j4Var = this.a;
        if (!j4Var.t0.n0 || (storyItem = j4Var.y1.a) == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        if (i3 != 8 && i3 != 7 && (i3 != 4 || j4Var.s2.b2.getSelectedPhotos().isEmpty())) {
            x2 x2Var = j4Var.s2;
            if (x2Var != null) {
                x2Var.L(i3);
                return;
            }
            return;
        }
        boolean z15 = true;
        if (i3 != 8) {
            j4Var.s2.a(true);
        }
        HashMap<Object, Object> selectedPhotos = j4Var.s2.b2.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = j4Var.s2.b2.getSelectedPhotosOrder();
        if (selectedPhotos.isEmpty()) {
            return;
        }
        ?? r72 = 0;
        int i12 = 0;
        while (i12 < Math.ceil(selectedPhotos.size() / 10.0f)) {
            int i13 = i12 * 10;
            int min = Math.min(10, selectedPhotos.size() - i13);
            ?? arrayList = new ArrayList();
            for (int i14 = r72; i14 < min; i14++) {
                int i15 = i13 + i14;
                if (i15 < selectedPhotosOrder.size()) {
                    ye yeVar = (ye) selectedPhotos.get(selectedPhotosOrder.get(i15));
                    xy xyVar = new xy();
                    boolean z16 = yeVar.b;
                    if (z16 || (str = yeVar.h) == null) {
                        String str2 = yeVar.I;
                        if (str2 != null) {
                            xyVar.c = str2;
                        }
                    } else {
                        xyVar.c = str;
                    }
                    xyVar.e = yeVar.c;
                    xyVar.f = yeVar.g;
                    xyVar.o = z16;
                    CharSequence charSequence = yeVar.a;
                    xyVar.d = charSequence != null ? charSequence.toString() : null;
                    xyVar.i = yeVar.n;
                    xyVar.j = yeVar.r;
                    xyVar.h = yeVar.x;
                    xyVar.k = yeVar.s;
                    xyVar.r = yeVar.L;
                    xyVar.t = yy.h(yeVar.a);
                    xyVar.u = yeVar.M;
                    arrayList.add(xyVar);
                    yeVar.e();
                }
            }
            boolean z17 = i12 == 0 ? ((xy) arrayList.get(r72)).t : r72;
            HashMap<Object, Object> hashMap = selectedPhotos;
            accountInstance = j4Var.getAccountInstance();
            ArrayList<Object> arrayList2 = selectedPhotosOrder;
            int i16 = r72;
            long j12 = j4Var.l1;
            if (i3 == 4 || z13) {
                z14 = 4;
                r12 = 1;
            } else {
                z14 = 4;
                r12 = i16;
            }
            yy.X(accountInstance, arrayList, j12, null, null, storyItem, null, r12, z10, null, null, z11, i10, i11, z17, null, null, 0L, false, 0L, j4Var.L1.getSendMonoForumPeerId(), j4Var.L1.getSendMessageSuggestionParams(), null, false);
            i12++;
            z15 = true;
            selectedPhotos = hashMap;
            selectedPhotosOrder = arrayList2;
            r72 = i16;
        }
        boolean z18 = z15;
        boolean z19 = r72;
        j4Var.L1.setFieldText("");
        j4Var.i0(j11 <= 0 ? z18 : z19);
    }

    @Override // org.telegram.ui.Components.zh
    public final void v0() {
        this.a.L1.L();
    }

    @Override // org.telegram.ui.Components.zh
    public final /* synthetic */ void I0(Object obj) {
    }

    @Override // org.telegram.ui.Components.zh
    public final /* synthetic */ void a1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.zh
    public final /* synthetic */ void r0() {
    }
}
