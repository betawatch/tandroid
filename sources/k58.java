// default package

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class k58 implements l12 {
    public final /* synthetic */ o68 a;

    public k58(o68 o68Var) {
        this.a = o68Var;
    }

    @Override // l12
    public final boolean E0() {
        return false;
    }

    @Override // l12
    public final void O0(vq0 vq0Var) {
        jn7.f(this.a.m2).d(vq0Var);
    }

    @Override // l12
    public final void V() {
        this.a.L1.U();
    }

    @Override // l12
    public final void f0(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
        k5 accountInstance;
        o68 o68Var = this.a;
        TL_stories.StoryItem storyItem = o68Var.y1.a;
        if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        accountInstance = o68Var.getAccountInstance();
        Editable editable2 = editable != null ? editable : null;
        long j3 = o68Var.l1;
        to3 to3Var = r7a.J;
        new Thread(new o5a(null, arrayList, j3, accountInstance, editable2, false, null, null, null, null, z, i, i2, storyItem, null, j, z2, j2, null)).start();
        o68Var.a0(j2 <= 0);
    }

    @Override // l12
    public final boolean o() {
        return this.a.G0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [int] */
    /* JADX WARN: Type inference failed for: r6v3 */
    @Override // l12
    public final void z0(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
        TL_stories.StoryItem storyItem;
        k5 accountInstance;
        boolean z5;
        String str;
        o68 o68Var = this.a;
        if (!o68Var.t0.n0 || (storyItem = o68Var.y1.a) == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        if (i != 8 && i != 7 && (i != 4 || o68Var.s2.d2.getSelectedPhotos().isEmpty())) {
            f41 f41Var = o68Var.s2;
            if (f41Var != null) {
                f41Var.I(i);
                return;
            }
            return;
        }
        boolean z6 = true;
        if (i != 8) {
            o68Var.s2.a(true);
        }
        HashMap<Object, Object> selectedPhotos = o68Var.s2.d2.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = o68Var.s2.d2.getSelectedPhotosOrder();
        if (selectedPhotos.isEmpty()) {
            return;
        }
        ?? r6 = 0;
        int i4 = 0;
        while (i4 < Math.ceil(selectedPhotos.size() / 10.0f)) {
            int i5 = i4 * 10;
            int min = Math.min(10, selectedPhotos.size() - i5);
            ?? arrayList = new ArrayList();
            for (int i6 = r6; i6 < min; i6++) {
                int i7 = i5 + i6;
                if (i7 < selectedPhotosOrder.size()) {
                    no6 no6Var = (no6) selectedPhotos.get(selectedPhotosOrder.get(i7));
                    q7a q7aVar = new q7a();
                    boolean z7 = no6Var.b;
                    if (z7 || (str = no6Var.h) == null) {
                        String str2 = no6Var.I;
                        if (str2 != null) {
                            q7aVar.c = str2;
                        }
                    } else {
                        q7aVar.c = str;
                    }
                    q7aVar.e = no6Var.c;
                    q7aVar.f = no6Var.g;
                    q7aVar.o = z7;
                    CharSequence charSequence = no6Var.a;
                    q7aVar.d = charSequence != null ? charSequence.toString() : null;
                    q7aVar.i = no6Var.n;
                    q7aVar.j = no6Var.r;
                    q7aVar.h = no6Var.x;
                    q7aVar.k = no6Var.s;
                    q7aVar.r = no6Var.L;
                    q7aVar.t = r7a.h(no6Var.a);
                    q7aVar.u = no6Var.M;
                    arrayList.add(q7aVar);
                    no6Var.e();
                }
            }
            boolean z8 = i4 == 0 ? ((q7a) arrayList.get(r6)).t : r6;
            HashMap<Object, Object> hashMap = selectedPhotos;
            accountInstance = o68Var.getAccountInstance();
            ArrayList<Object> arrayList2 = selectedPhotosOrder;
            boolean z9 = r6;
            long j3 = o68Var.l1;
            if (i == 4 || z4) {
                z5 = z9;
                z9 = true;
            } else {
                z5 = z9;
            }
            r7a.W(accountInstance, arrayList, j3, null, null, storyItem, null, z9, z, null, null, z2, i2, i3, z8, null, null, 0L, false, 0L, o68Var.L1.getSendMonoForumPeerId(), o68Var.L1.getSendMessageSuggestionParams(), null, false);
            i4++;
            z6 = true;
            selectedPhotos = hashMap;
            selectedPhotosOrder = arrayList2;
            r6 = z5;
        }
        boolean z10 = z6;
        boolean z11 = r6;
        o68Var.L1.setFieldText("");
        o68Var.a0(j2 <= 0 ? z10 : z11);
    }

    @Override // l12
    public final void R() {
    }

    @Override // l12
    public final void e0(Object obj) {
    }

    @Override // l12
    public final void i0(TLRPC.User user) {
    }
}
