// default package

import android.util.SparseIntArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.ui.FiltersSetupActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class hg4 extends eu5 {
    public final /* synthetic */ byte e = 0;
    public final Runnable f = new a14(this, (byte) 17);
    public final /* synthetic */ Object g;

    public hg4(FiltersSetupActivity filtersSetupActivity) {
        this.g = filtersSetupActivity;
    }

    @Override // eu5
    public final void a(RecyclerView recyclerView, u69 u69Var) {
        switch (this.e) {
            case 0:
                super.a(recyclerView, u69Var);
                View view = u69Var.a;
                view.setPressed(false);
                view.setBackground(null);
                view.setTag(R.id.dragging, null);
                break;
            default:
                super.a(recyclerView, u69Var);
                View view2 = u69Var.a;
                view2.setPressed(false);
                view2.setTag(R.id.dragging, null);
                if (view2 instanceof hh4) {
                    ((hh4) view2).setDragging(false);
                    break;
                }
                break;
        }
    }

    @Override // eu5
    public final int f(RecyclerView recyclerView, u69 u69Var) {
        switch (this.e) {
            case 0:
                ig4 ig4Var = (ig4) this.g;
                return (!oc7.r1(z8c.t0).H3() || (ig4Var.n && !(u69Var.b() == 0 && ((eg4) ig4Var.h.get(0)).e && !z8c.h(z8c.t0).p()))) ? eu5.m(12, 0) : eu5.m(0, 0);
            default:
                return u69Var.f != 2 ? eu5.m(0, 0) : eu5.m(3, 0);
        }
    }

    @Override // eu5
    public final boolean l() {
        switch (this.e) {
            case 0:
                return ((ig4) this.g).n;
            default:
                return true;
        }
    }

    @Override // eu5
    public final boolean o(RecyclerView recyclerView, u69 u69Var, u69 u69Var2) {
        ub7 ub7Var;
        ub7 ub7Var2;
        byte b = this.e;
        Object obj = this.g;
        int i = 0;
        switch (b) {
            case 0:
                if (!oc7.r1(z8c.t0).H3() || ((u69Var.b() != 0 && u69Var2.b() != 0) || z8c.h(z8c.t0).p())) {
                    s30 s30Var = ((ig4) obj).J;
                    int b2 = u69Var.b();
                    int b3 = u69Var2.b();
                    ig4 ig4Var = (ig4) s30Var.e;
                    ArrayList arrayList = ig4Var.h;
                    SparseIntArray sparseIntArray = ig4Var.l0;
                    int size = arrayList.size();
                    if (b2 >= 0 && b3 >= 0 && b2 < size && b3 < size) {
                        ArrayList S0 = oc7.r1(z8c.t0).S0();
                        ub7 ub7Var3 = (ub7) S0.get(b2);
                        ub7 ub7Var4 = (ub7) S0.get(b3);
                        int i2 = ub7Var3.f;
                        ub7Var3.f = ub7Var4.f;
                        ub7Var4.f = i2;
                        S0.set(b2, ub7Var4);
                        S0.set(b3, ub7Var3);
                        eg4 eg4Var = (eg4) arrayList.get(b2);
                        eg4 eg4Var2 = (eg4) arrayList.get(b3);
                        int i3 = eg4Var.a;
                        eg4Var.a = eg4Var2.a;
                        eg4Var2.a = i3;
                        int i4 = sparseIntArray.get(b2);
                        sparseIntArray.put(b2, sparseIntArray.get(b3));
                        sparseIntArray.put(b3, i4);
                        dg4 dg4Var = ig4Var.K;
                        int i5 = eg4Var2.a;
                        int i6 = eg4Var.a;
                        dk3 dk3Var = (dk3) dg4Var;
                        while (true) {
                            mk3[] mk3VarArr = dk3Var.b.f0;
                            if (i < mk3VarArr.length) {
                                mk3 mk3Var = mk3VarArr[i];
                                int i7 = mk3Var.h;
                                if (i7 == i5) {
                                    mk3Var.h = i6;
                                } else if (i7 == i6) {
                                    mk3Var.h = i5;
                                }
                                i++;
                            } else {
                                int i8 = ig4Var.L;
                                if (i8 == b2) {
                                    ig4Var.L = b3;
                                    ig4Var.M = eg4Var.a;
                                } else if (i8 == b3) {
                                    ig4Var.L = b2;
                                    ig4Var.M = eg4Var2.a;
                                }
                                int i9 = ig4Var.r0;
                                if (i9 == b2) {
                                    ig4Var.r0 = b3;
                                    ig4Var.s0 = eg4Var.a;
                                } else if (i9 == b3) {
                                    ig4Var.r0 = b2;
                                    ig4Var.s0 = eg4Var2.a;
                                }
                                arrayList.set(b2, eg4Var2);
                                arrayList.set(b3, eg4Var);
                                ig4Var.m();
                                ig4Var.E = true;
                                ig4Var.G.setItemAnimator(ig4Var.t0);
                                s30Var.j(b2, b3);
                            }
                        }
                    }
                    break;
                }
                break;
            default:
                if (u69Var.f == u69Var2.f) {
                    lh4 lh4Var = ((FiltersSetupActivity) obj).b;
                    int b4 = u69Var.b();
                    int b5 = u69Var2.b();
                    FiltersSetupActivity filtersSetupActivity = lh4Var.e;
                    int i10 = filtersSetupActivity.r;
                    ArrayList arrayList2 = filtersSetupActivity.n;
                    if (b4 >= i10 && b5 >= i10) {
                        jh4 jh4Var = (jh4) arrayList2.get(b4);
                        jh4 jh4Var2 = (jh4) arrayList2.get(b5);
                        if (jh4Var != null && jh4Var2 != null && (ub7Var = jh4Var.d) != null && (ub7Var2 = jh4Var2.d) != null) {
                            int i11 = ub7Var.f;
                            ub7Var.f = ub7Var2.f;
                            ub7Var2.f = i11;
                            ArrayList arrayList3 = filtersSetupActivity.getMessagesController().G0;
                            try {
                                arrayList3.set(b4 - filtersSetupActivity.r, jh4Var2.d);
                                arrayList3.set(b5 - filtersSetupActivity.r, jh4Var.d);
                            } catch (Exception unused) {
                            }
                            filtersSetupActivity.e = true;
                            filtersSetupActivity.g0(true);
                        }
                    }
                    break;
                }
                break;
        }
        return true;
    }

    @Override // eu5
    public final void q(u69 u69Var, int i) {
        byte b = this.e;
        Object obj = this.g;
        Runnable runnable = this.f;
        switch (b) {
            case 0:
                a14 a14Var = (a14) runnable;
                ig4 ig4Var = (ig4) obj;
                if (i != 0) {
                    ig4Var.G.J0(false);
                    u69Var.a.setPressed(true);
                    anb.h(ig4Var.c0, ig4Var.a, u69Var.a);
                } else {
                    gm.r(a14Var);
                    gm.d3(a14Var, 320L);
                }
                if (u69Var != null) {
                    u69Var.a.setTag(R.id.dragging, i == 2 ? Boolean.TRUE : null);
                    break;
                }
                break;
            default:
                a14 a14Var2 = (a14) runnable;
                if (i != 0) {
                    ((FiltersSetupActivity) obj).a.J0(false);
                    u69Var.a.setPressed(true);
                } else {
                    gm.r(a14Var2);
                    gm.d3(a14Var2, 320L);
                }
                if (u69Var != null) {
                    View view = u69Var.a;
                    view.setTag(R.id.dragging, i == 2 ? Boolean.TRUE : null);
                    if (view instanceof hh4) {
                        ((hh4) view).setDragging(i == 2);
                        break;
                    }
                }
                break;
        }
    }

    @Override // eu5
    public final void r(u69 u69Var) {
        byte b = this.e;
    }

    public hg4(ig4 ig4Var) {
        this.g = ig4Var;
    }

    private final void u(u69 u69Var) {
    }

    private final void v(u69 u69Var) {
    }
}
