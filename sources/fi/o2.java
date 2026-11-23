package fi;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.az;
import org.telegram.messenger.ff;
import org.telegram.messenger.jw;
import org.telegram.messenger.ls;
import org.telegram.messenger.zy;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.si;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class o2 implements si {
    public final /* synthetic */ z3 a;

    public o2(z3 z3Var) {
        this.a = z3Var;
    }

    @Override // org.telegram.ui.Components.si
    public final void K0() {
        this.a.L1.U();
    }

    @Override // org.telegram.ui.Components.si
    public final /* synthetic */ boolean V1() {
        return false;
    }

    @Override // org.telegram.ui.Components.si
    public final void b2(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
        org.telegram.messenger.c accountInstance;
        z3 z3Var = this.a;
        TL_stories.StoryItem storyItem = z3Var.y1.a;
        if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        accountInstance = z3Var.getAccountInstance();
        CharSequence charSequence2 = charSequence != null ? charSequence : null;
        long j11 = z3Var.l1;
        org.telegram.messenger.q5 q5Var = az.J;
        new Thread(new jw(null, arrayList, j11, accountInstance, charSequence2, false, null, null, null, null, z10, i7, i10, storyItem, null, j3, z11, j10, null)).start();
        z3Var.i0(j10 <= 0);
    }

    @Override // org.telegram.ui.Components.si
    public final void f0(gh ghVar) {
        ls.f(this.a.m2).d(ghVar);
    }

    @Override // org.telegram.ui.Components.si
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
    @Override // org.telegram.ui.Components.si
    public final void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
        TL_stories.StoryItem storyItem;
        org.telegram.messenger.c accountInstance;
        boolean z14;
        ?? r12;
        String str;
        z3 z3Var = this.a;
        if (!z3Var.t0.n0 || (storyItem = z3Var.y1.a) == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        if (i7 != 8 && i7 != 7 && (i7 != 4 || z3Var.s2.e2.getSelectedPhotos().isEmpty())) {
            n2 n2Var = z3Var.s2;
            if (n2Var != null) {
                n2Var.M(i7);
                return;
            }
            return;
        }
        boolean z15 = true;
        if (i7 != 8) {
            z3Var.s2.a(true);
        }
        HashMap<Object, Object> selectedPhotos = z3Var.s2.e2.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = z3Var.s2.e2.getSelectedPhotosOrder();
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
                    ff ffVar = (ff) selectedPhotos.get(selectedPhotosOrder.get(i15));
                    zy zyVar = new zy();
                    boolean z16 = ffVar.b;
                    if (z16 || (str = ffVar.h) == null) {
                        String str2 = ffVar.I;
                        if (str2 != null) {
                            zyVar.c = str2;
                        }
                    } else {
                        zyVar.c = str;
                    }
                    zyVar.e = ffVar.c;
                    zyVar.f = ffVar.g;
                    zyVar.o = z16;
                    CharSequence charSequence = ffVar.a;
                    zyVar.d = charSequence != null ? charSequence.toString() : null;
                    zyVar.i = ffVar.n;
                    zyVar.j = ffVar.r;
                    zyVar.h = ffVar.x;
                    zyVar.k = ffVar.s;
                    zyVar.r = ffVar.L;
                    zyVar.t = az.h(ffVar.a);
                    zyVar.u = ffVar.M;
                    arrayList.add(zyVar);
                    ffVar.e();
                }
            }
            boolean z17 = i12 == 0 ? ((zy) arrayList.get(r72)).t : r72;
            HashMap<Object, Object> hashMap = selectedPhotos;
            accountInstance = z3Var.getAccountInstance();
            ArrayList<Object> arrayList2 = selectedPhotosOrder;
            int i16 = r72;
            long j11 = z3Var.l1;
            if (i7 == 4 || z13) {
                z14 = 4;
                r12 = 1;
            } else {
                z14 = 4;
                r12 = i16;
            }
            az.X(accountInstance, arrayList, j11, null, null, storyItem, null, r12, z10, null, null, z11, i10, i11, z17, null, null, 0L, false, 0L, z3Var.L1.getSendMonoForumPeerId(), z3Var.L1.getSendMessageSuggestionParams(), null, false);
            i12++;
            z15 = true;
            selectedPhotos = hashMap;
            selectedPhotosOrder = arrayList2;
            r72 = i16;
        }
        boolean z18 = z15;
        boolean z19 = r72;
        z3Var.L1.setFieldText("");
        z3Var.i0(j10 <= 0 ? z18 : z19);
    }

    @Override // org.telegram.ui.Components.si
    public final /* synthetic */ void v0() {
    }

    @Override // org.telegram.ui.Components.si
    public final /* synthetic */ void R0(Object obj) {
    }

    @Override // org.telegram.ui.Components.si
    public final /* synthetic */ void h1(TLRPC.User user) {
    }
}
