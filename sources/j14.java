// default package

import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class j14 extends mz3 {
    public final /* synthetic */ e34 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j14(e34 e34Var, Context context, ylb ylbVar, boolean z, vz3 vz3Var, boolean z2) {
        super(context, ylbVar, true, false, true, z, 0, vz3Var, cmb.v0(cmb.u6, ylbVar), z2);
        this.g0 = e34Var;
    }

    @Override // mz3
    public final boolean d() {
        return this.g0.V0;
    }

    @Override // mz3
    public final void e() {
        e34 e34Var = this.g0;
        ArrayList arrayList = e34Var.o1;
        if (arrayList.size() <= 0 || ((TLRPC.StickerSetCovered) arrayList.get(0)).set == null || oc7.r1(e34Var.d1).Y3.getLong("emoji_featured_hidden", 0L) == ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id) {
            return;
        }
        z8c.h(z8c.t0);
    }

    @Override // mz3
    public final boolean g(s14 s14Var) {
        return s14Var.f || this.g0.q1.contains(Long.valueOf(s14Var.b.id));
    }

    @Override // mz3
    public final ColorFilter getEmojiColorFilter() {
        return this.g0.f2;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0093  */
    @Override // mz3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(int i) {
        Integer num;
        int i2;
        r24 r24Var;
        e34 e34Var = this.g0;
        ArrayList arrayList = e34Var.r1;
        o14 o14Var = e34Var.S;
        if (e34Var.g0) {
            return false;
        }
        e24 e24Var = e34Var.T;
        if (e24Var != null) {
            e24Var.E(null, true);
        }
        d04 d04Var = e34Var.W;
        if (d04Var != null && (r24Var = d04Var.r) != null) {
            r24Var.I1(null);
        }
        if (i == 0) {
            num = Integer.valueOf(e34Var.e0 ? 1 : 0);
        } else {
            i--;
            num = null;
        }
        if (num == null) {
            char[] cArr = zx3.a;
            if (i < 8 && o14Var.s.indexOfKey(i) >= 0) {
                num = Integer.valueOf(o14Var.s.get(i));
            }
        }
        if (num == null) {
            ArrayList<s14> emojipacks = e34Var.getEmojipacks();
            char[] cArr2 = zx3.a;
            int i3 = i - 8;
            if (emojipacks != null && i3 >= 0 && i3 < emojipacks.size()) {
                int i4 = 0;
                while (true) {
                    if (i4 >= arrayList.size()) {
                        i4 = -1;
                        break;
                    }
                    if (((s14) arrayList.get(i4)).b.id == emojipacks.get(i3).b.id) {
                        break;
                    }
                    i4++;
                }
                SparseIntArray sparseIntArray = o14Var.s;
                char[] cArr3 = zx3.a;
                num = Integer.valueOf(sparseIntArray.get(i4 + 8));
                i2 = gm.L(-9.0f);
                if (num != null) {
                    e34Var.Q.D0();
                    e34Var.U(num.intValue());
                    e34Var.E(num.intValue(), i2);
                    e34Var.j(0, null);
                }
                return true;
            }
        }
        i2 = 0;
        if (num != null) {
        }
        return true;
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        if (getTranslationY() != f) {
            super.setTranslationY(f);
            e34 e34Var = this.g0;
            View view = e34Var.P;
            if (view != null) {
                view.setTranslationY(f);
            }
            e34Var.K.invalidate();
        }
    }
}
