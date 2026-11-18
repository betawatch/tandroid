package oi;

import android.view.View;
import hi.t6;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class c3 implements w5 {
    public final /* synthetic */ s3 a;

    public c3(s3 s3Var) {
        this.a = s3Var;
    }

    public final int a(a aVar) {
        int i7;
        s3 s3Var = this.a;
        int indexOf = s3Var.t3.indexOf(aVar);
        return org.telegram.messenger.g0.L((indexOf < 0 || (i7 = indexOf + 1) >= s3Var.t3.size() || ((a) s3Var.t3.get(i7)).c <= 0) ? 11.0f : 5.0f);
    }

    public final int b(a aVar) {
        s3 s3Var = this.a;
        int indexOf = s3Var.t3.indexOf(aVar);
        return org.telegram.messenger.g0.L((indexOf <= 0 || ((a) s3Var.t3.get(indexOf + (-1))).c <= 0) ? 8.0f : 2.0f);
    }

    public final void c(a aVar, int i7) {
        s3 s3Var = this.a;
        q3 q3Var = s3Var.p3;
        if (i7 == 7) {
            s3Var.U4(aVar, new TL_iv.pageBlockButtonRow(), 0, 0, false, false);
        }
        s3Var.j4 = null;
        s3Var.k4 = aVar;
        e2 e2Var = s3Var.R3;
        if (e2Var != null) {
            e2Var.d();
        }
        if (aVar != null) {
            z5.e(aVar.b, "");
            View C1 = s3Var.C1(aVar);
            if (C1 instanceof z5) {
                ((z5) C1).getEditText().setTextSilently("");
            }
        }
        e2 e2Var2 = s3Var.R3;
        if (e2Var2 != null) {
            e2Var2.h();
        }
        switch (i7) {
            case 1:
                q3Var.D(3);
                break;
            case 2:
                q3Var.D(6);
                break;
            case 3:
                o.Z(s3Var.getContext(), "", new t6(s3Var, 18), s3Var.o3);
                break;
            case 4:
            case 5:
                q3Var.D(1);
                break;
            case 6:
                s3Var.w3();
                break;
        }
    }

    public final void d(a aVar, TL_iv.PageBlock pageBlock, int i7, int i10, boolean z10, boolean z11) {
        boolean z12 = pageBlock instanceof TL_iv.pageBlockBlockquote;
        s3 s3Var = this.a;
        if (!z12) {
            s3Var.U4(aVar, pageBlock, i7, i10, z10, z11);
            return;
        }
        if (aVar == null) {
            aVar = s3Var.a5();
        }
        if (aVar != null) {
            ArrayList arrayList = aVar.k;
            if (s3Var.t3.indexOf(aVar) < 0 || s3.A3(aVar) || aVar.i) {
                return;
            }
            e2 e2Var = s3Var.R3;
            if (e2Var != null) {
                e2Var.d();
            }
            boolean z13 = arrayList.isEmpty() && !z5.p(aVar.b);
            if (z13) {
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                aVar.b = pageblockblockquote;
            } else {
                if (z5.p(aVar.b)) {
                    long a10 = l0.a();
                    TL_iv.RichText j3 = z5.j(aVar.b);
                    if (j3 != null && !(j3 instanceof TL_iv.textEmpty)) {
                        s3Var.u3.put(Long.valueOf(a10), j3);
                    }
                    arrayList.add(Long.valueOf(a10));
                }
                aVar.b = new TL_iv.pageBlockParagraph();
                arrayList.add(Long.valueOf(l0.a()));
            }
            s3Var.v4();
            if (z13 && (s3Var.findFocus() instanceof e1)) {
                s3Var.b2();
                e2 e2Var2 = s3Var.R3;
                if (e2Var2 != null) {
                    e2Var2.h();
                }
                s3Var.g3(aVar);
                return;
            }
            s3Var.g3.O(false);
            e2 e2Var3 = s3Var.R3;
            if (e2Var3 != null) {
                e2Var3.h();
            }
            s3Var.post(new x2(s3Var, aVar, 5));
        }
    }
}
