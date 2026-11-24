// default package

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_aicompose;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class h implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a1 b;

    public /* synthetic */ h(a1 a1Var, byte b) {
        this.a = b;
        this.b = a1Var;
    }

    @Override // p8c
    public final void a(Object obj) {
        byte b = this.a;
        int i = 0;
        a1 a1Var = this.b;
        byte b2 = 1;
        switch (b) {
            case 0:
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                z0 z0Var = a1Var.u2;
                je5 je5Var = a1Var.y2;
                if (je5Var != null) {
                    je5Var.f(true);
                }
                if (!(aiComposeTone instanceof t0)) {
                    if (aiComposeTone != null) {
                        if (z0Var.getSelectedTone() != aiComposeTone) {
                            z0Var.d(aiComposeTone, true);
                            a1Var.k1();
                            a1Var.O2.O(true);
                            break;
                        } else {
                            if (a1Var.V2 || a1Var.X1) {
                                a1Var.a1();
                            }
                            z0Var.c(-1, true);
                            a1Var.X1 = false;
                            a1Var.Y1 = null;
                            a1Var.Z1 = null;
                            a1Var.W2[1] = null;
                            if (a1Var.h1() && ec.b(a1Var.a, a1Var.g2) != null) {
                                ec.e(a1Var.a, a1Var.g2, null);
                                uv1 uv1Var = a1Var.R2;
                                if (uv1Var != null) {
                                    uv1Var.run();
                                }
                            }
                            a1Var.s1(true);
                            a1Var.k1();
                            a1Var.O2.O(true);
                            break;
                        }
                    } else {
                        ArrayList arrayList = a1Var.r2.b;
                        int i2 = 0;
                        while (i < arrayList.size()) {
                            if (arrayList.get(i) instanceof TL_aicompose.TL_aiComposeTone) {
                                i2++;
                            }
                            i++;
                        }
                        int i3 = i2 + 1;
                        boolean p = y6c.h(a1Var.a).p();
                        int i4 = a1Var.a;
                        if (i3 <= (p ? na7.q1(i4).k4.X.f() : na7.q1(i4).k4.W.f())) {
                            r0 r0Var = new r0(a1Var.getContext(), a1Var.J0);
                            r0Var.f2 = new h(a1Var, b2);
                            r0Var.show();
                            break;
                        } else {
                            a1.q1(new u21(a1Var.D2, a1Var.J0), a1Var.a);
                            break;
                        }
                    }
                } else {
                    z0Var.d(aiComposeTone, true);
                    a1Var.O2.O(true);
                    gl.e3(new a(a1Var, (byte) 3), 150L);
                    break;
                }
                break;
            case 1:
                TL_aicompose.AiComposeTone aiComposeTone2 = (TL_aicompose.AiComposeTone) obj;
                a1Var.r2.b.add(0, aiComposeTone2);
                a1Var.v1();
                new u21(a1Var.D2, a1Var.J0).p(aiComposeTone2.emoji_id, k96.a0(null, null, 2131754956, aiComposeTone2.title), k96.M0(2131754957, null)).j();
                break;
            case 2:
                TL_aicompose.AiComposeTone aiComposeTone3 = (TL_aicompose.AiComposeTone) obj;
                if (aiComposeTone3 instanceof TL_aicompose.TL_aiComposeTone) {
                    ic icVar = a1Var.r2;
                    TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone3;
                    ArrayList arrayList2 = icVar.b;
                    while (true) {
                        if (i < arrayList2.size()) {
                            if ((arrayList2.get(i) instanceof TL_aicompose.TL_aiComposeTone) && ((TL_aicompose.TL_aiComposeTone) arrayList2.get(i)).id == tL_aiComposeTone.id) {
                                arrayList2.set(i, tL_aiComposeTone);
                                icVar.c();
                            } else {
                                i++;
                            }
                        }
                    }
                }
                a1Var.v1();
                break;
            default:
                int intValue = ((Integer) obj).intValue();
                z0 z0Var2 = a1Var.t2;
                if (z0Var2.getSelectedTab() != intValue) {
                    je5 je5Var2 = a1Var.y2;
                    if (je5Var2 != null) {
                        je5Var2.f(true);
                    }
                    z0Var2.c(intValue, true);
                    a1Var.k1();
                    a1Var.O2.O(true);
                    break;
                }
                break;
        }
    }
}
