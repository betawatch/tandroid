package di;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.fz;
import org.telegram.messenger.gf;
import org.telegram.messenger.gz;
import org.telegram.messenger.ow;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.qg;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class v2 implements bi {
    public final /* synthetic */ j4 a;

    public v2(j4 j4Var) {
        this.a = j4Var;
    }

    @Override // org.telegram.ui.Components.bi
    public final void F0() {
        this.a.K1.L();
    }

    @Override // org.telegram.ui.Components.bi
    public final /* synthetic */ boolean G1() {
        return false;
    }

    @Override // org.telegram.ui.Components.bi
    public final void M1(ArrayList arrayList, CharSequence charSequence, boolean z9, int i7, int i10, long j3, boolean z10, long j10) {
        org.telegram.messenger.c accountInstance;
        j4 j4Var = this.a;
        TL_stories.StoryItem storyItem = j4Var.x1.a;
        if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        accountInstance = j4Var.getAccountInstance();
        CharSequence charSequence2 = charSequence != null ? charSequence : null;
        long j11 = j4Var.k1;
        org.telegram.messenger.p5 p5Var = gz.I;
        new Thread(new ow(null, arrayList, j11, accountInstance, charSequence2, false, null, null, null, null, z9, i7, i10, storyItem, null, j3, z10, j10, null)).start();
        j4Var.i0(j10 <= 0);
    }

    @Override // org.telegram.ui.Components.bi
    public final void c0(qg qgVar) {
        qs.f(this.a.l2).d(qgVar);
    }

    @Override // org.telegram.ui.Components.bi
    public final boolean f0() {
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
    @Override // org.telegram.ui.Components.bi
    public final void o1(int i7, boolean z9, boolean z10, int i10, int i11, long j3, boolean z11, boolean z12, long j10) {
        TL_stories.StoryItem storyItem;
        org.telegram.messenger.c accountInstance;
        boolean z13;
        ?? r12;
        String str;
        j4 j4Var = this.a;
        if (!j4Var.s0.m0 || (storyItem = j4Var.x1.a) == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        if (i7 != 8 && i7 != 7 && (i7 != 4 || j4Var.r2.a2.getSelectedPhotos().isEmpty())) {
            u2 u2Var = j4Var.r2;
            if (u2Var != null) {
                u2Var.L(i7);
                return;
            }
            return;
        }
        boolean z14 = true;
        if (i7 != 8) {
            j4Var.r2.a(true);
        }
        HashMap<Object, Object> selectedPhotos = j4Var.r2.a2.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = j4Var.r2.a2.getSelectedPhotosOrder();
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
                    gf gfVar = (gf) selectedPhotos.get(selectedPhotosOrder.get(i15));
                    fz fzVar = new fz();
                    boolean z15 = gfVar.b;
                    if (z15 || (str = gfVar.h) == null) {
                        String str2 = gfVar.I;
                        if (str2 != null) {
                            fzVar.c = str2;
                        }
                    } else {
                        fzVar.c = str;
                    }
                    fzVar.e = gfVar.c;
                    fzVar.f = gfVar.g;
                    fzVar.o = z15;
                    CharSequence charSequence = gfVar.a;
                    fzVar.d = charSequence != null ? charSequence.toString() : null;
                    fzVar.i = gfVar.n;
                    fzVar.j = gfVar.r;
                    fzVar.h = gfVar.x;
                    fzVar.k = gfVar.s;
                    fzVar.r = gfVar.L;
                    fzVar.t = gz.h(gfVar.a);
                    fzVar.u = gfVar.M;
                    arrayList.add(fzVar);
                    gfVar.e();
                }
            }
            boolean z16 = i12 == 0 ? ((fz) arrayList.get(r72)).t : r72;
            HashMap<Object, Object> hashMap = selectedPhotos;
            accountInstance = j4Var.getAccountInstance();
            ArrayList<Object> arrayList2 = selectedPhotosOrder;
            int i16 = r72;
            long j11 = j4Var.k1;
            if (i7 == 4 || z12) {
                z13 = 4;
                r12 = 1;
            } else {
                z13 = 4;
                r12 = i16;
            }
            gz.X(accountInstance, arrayList, j11, null, null, storyItem, null, r12, z9, null, null, z10, i10, i11, z16, null, null, 0L, false, 0L, j4Var.K1.getSendMonoForumPeerId(), j4Var.K1.getSendMessageSuggestionParams(), null, false);
            i12++;
            z14 = true;
            selectedPhotos = hashMap;
            selectedPhotosOrder = arrayList2;
            r72 = i16;
        }
        boolean z17 = z14;
        boolean z18 = r72;
        j4Var.K1.setFieldText("");
        j4Var.i0(j10 <= 0 ? z17 : z18);
    }

    @Override // org.telegram.ui.Components.bi
    public final /* synthetic */ void M0(Object obj) {
    }

    @Override // org.telegram.ui.Components.bi
    public final /* synthetic */ void Y0(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.bi
    public final /* synthetic */ void t0() {
    }
}
