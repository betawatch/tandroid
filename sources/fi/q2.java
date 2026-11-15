package fi;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.dz;
import org.telegram.messenger.ez;
import org.telegram.messenger.ff;
import org.telegram.messenger.mw;
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.vg;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class q2 implements ii {
    public final /* synthetic */ b4 a;

    public q2(b4 b4Var) {
        this.a = b4Var;
    }

    @Override // org.telegram.ui.Components.ii
    public final void K0() {
        this.a.L1.S();
    }

    @Override // org.telegram.ui.Components.ii
    public final /* synthetic */ boolean V1() {
        return false;
    }

    @Override // org.telegram.ui.Components.ii
    public final void b2(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
        org.telegram.messenger.c accountInstance;
        b4 b4Var = this.a;
        TL_stories.StoryItem storyItem = b4Var.y1.a;
        if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        accountInstance = b4Var.getAccountInstance();
        CharSequence charSequence2 = charSequence != null ? charSequence : null;
        long j11 = b4Var.l1;
        org.telegram.messenger.p5 p5Var = ez.J;
        new Thread(new mw(null, arrayList, j11, accountInstance, charSequence2, false, null, null, null, null, z10, i7, i10, storyItem, null, j3, z11, j10, null)).start();
        b4Var.i0(j10 <= 0);
    }

    @Override // org.telegram.ui.Components.ii
    public final void d0(vg vgVar) {
        ns.f(this.a.m2).d(vgVar);
    }

    @Override // org.telegram.ui.Components.ii
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
    @Override // org.telegram.ui.Components.ii
    public final void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
        TL_stories.StoryItem storyItem;
        org.telegram.messenger.c accountInstance;
        boolean z14;
        ?? r12;
        String str;
        b4 b4Var = this.a;
        if (!b4Var.t0.n0 || (storyItem = b4Var.y1.a) == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        if (i7 != 8 && i7 != 7 && (i7 != 4 || b4Var.s2.e2.getSelectedPhotos().isEmpty())) {
            p2 p2Var = b4Var.s2;
            if (p2Var != null) {
                p2Var.M(i7);
                return;
            }
            return;
        }
        boolean z15 = true;
        if (i7 != 8) {
            b4Var.s2.a(true);
        }
        HashMap<Object, Object> selectedPhotos = b4Var.s2.e2.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = b4Var.s2.e2.getSelectedPhotosOrder();
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
                    dz dzVar = new dz();
                    boolean z16 = ffVar.b;
                    if (z16 || (str = ffVar.h) == null) {
                        String str2 = ffVar.I;
                        if (str2 != null) {
                            dzVar.c = str2;
                        }
                    } else {
                        dzVar.c = str;
                    }
                    dzVar.e = ffVar.c;
                    dzVar.f = ffVar.g;
                    dzVar.o = z16;
                    CharSequence charSequence = ffVar.a;
                    dzVar.d = charSequence != null ? charSequence.toString() : null;
                    dzVar.i = ffVar.n;
                    dzVar.j = ffVar.r;
                    dzVar.h = ffVar.x;
                    dzVar.k = ffVar.s;
                    dzVar.r = ffVar.L;
                    dzVar.t = ez.h(ffVar.a);
                    dzVar.u = ffVar.M;
                    arrayList.add(dzVar);
                    ffVar.e();
                }
            }
            boolean z17 = i12 == 0 ? ((dz) arrayList.get(r72)).t : r72;
            HashMap<Object, Object> hashMap = selectedPhotos;
            accountInstance = b4Var.getAccountInstance();
            ArrayList<Object> arrayList2 = selectedPhotosOrder;
            int i16 = r72;
            long j11 = b4Var.l1;
            if (i7 == 4 || z13) {
                z14 = 4;
                r12 = 1;
            } else {
                z14 = 4;
                r12 = i16;
            }
            ez.X(accountInstance, arrayList, j11, null, null, storyItem, null, r12, z10, null, null, z11, i10, i11, z17, null, null, 0L, false, 0L, b4Var.L1.getSendMonoForumPeerId(), b4Var.L1.getSendMessageSuggestionParams(), null, false);
            i12++;
            z15 = true;
            selectedPhotos = hashMap;
            selectedPhotosOrder = arrayList2;
            r72 = i16;
        }
        boolean z18 = z15;
        boolean z19 = r72;
        b4Var.L1.setFieldText("");
        b4Var.i0(j10 <= 0 ? z18 : z19);
    }

    @Override // org.telegram.ui.Components.ii
    public final /* synthetic */ void R0(Object obj) {
    }

    @Override // org.telegram.ui.Components.ii
    public final /* synthetic */ void h1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.ii
    public final /* synthetic */ void v0() {
    }
}
