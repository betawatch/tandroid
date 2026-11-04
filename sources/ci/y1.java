package ci;

import android.graphics.Bitmap;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.cs;
import org.telegram.messenger.hp;
import org.telegram.messenger.n10;
import org.telegram.messenger.p10;
import org.telegram.messenger.ye;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y1 implements p10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cs b;

    public /* synthetic */ y1(cs csVar, int i3) {
        this.a = i3;
        this.b = csVar;
    }

    @Override // org.telegram.messenger.p10
    public final void a(Object obj, Object obj2, Object obj3) {
        int i3;
        gi.t tVar;
        switch (this.a) {
            case 0:
                ((l6) this.b).p2((View) obj2, (CharSequence) obj, ((Boolean) obj3).booleanValue());
                break;
            case 1:
                l6 l6Var = (l6) this.b;
                ArrayList arrayList = (ArrayList) obj;
                n10 n10Var = (n10) obj2;
                Runnable runnable = (Runnable) obj3;
                ai.g6 g6Var = l6Var.P2;
                if (g6Var != null) {
                    g6Var.b();
                    l6Var.P2 = null;
                }
                TL_stars.craftStarGift craftstargift = new TL_stars.craftStarGift();
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj4 = arrayList.get(i10);
                    i10++;
                    TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
                    tL_inputSavedStarGiftSlug.slug = ((TL_stars.StarGift) obj4).slug;
                    craftstargift.stargift.add(tL_inputSavedStarGiftSlug);
                }
                ConnectionsManager.getInstance(l6Var.a).sendRequestTyped(craftstargift, new c3.b(1), new h2(l6Var, n10Var, arrayList, runnable, 0));
                break;
            default:
                gi.va vaVar = (gi.va) this.b;
                Boolean bool = (Boolean) obj;
                ArrayList arrayList2 = (ArrayList) obj2;
                ArrayList arrayList3 = (ArrayList) obj3;
                if (vaVar.g0 == 0 && arrayList2 != null && !arrayList2.isEmpty() && vaVar.q2 == null && !vaVar.X && vaVar.I()) {
                    vaVar.I1 = null;
                    vaVar.J1 = null;
                    vaVar.K1 = null;
                    if (bool.booleanValue()) {
                        if (arrayList2.size() + vaVar.B0.getFilledCount() > vaVar.B0.getTotalCount()) {
                            int size2 = arrayList2.size() + vaVar.B0.getFilledCount();
                            ArrayList a10 = gi.t.a();
                            int size3 = a10.size();
                            int i11 = 0;
                            while (true) {
                                if (i11 < size3) {
                                    Object obj5 = a10.get(i11);
                                    i11++;
                                    tVar = (gi.t) obj5;
                                    if (tVar.e.size() >= size2) {
                                    }
                                } else {
                                    tVar = null;
                                }
                            }
                            if (tVar == null) {
                                vaVar.B0.o(null);
                                vaVar.B0.c();
                                vaVar.J0.setSelected((gi.t) null);
                                gi.y9 y9Var = vaVar.C0;
                                if (y9Var != null) {
                                    y9Var.recordHevc = !vaVar.B0.j();
                                }
                                vaVar.J0.a(false, true);
                                vaVar.l0(true);
                                break;
                            } else {
                                gi.ia iaVar = vaVar.B0;
                                vaVar.A0 = tVar;
                                iaVar.o(tVar);
                                vaVar.J0.setSelected(tVar);
                                int indexOf = gi.t.a().indexOf(tVar);
                                if (indexOf >= 0) {
                                    vaVar.J0.a.v0(indexOf);
                                }
                                gi.y9 y9Var2 = vaVar.C0;
                                if (y9Var2 != null) {
                                    y9Var2.recordHevc = !vaVar.B0.j();
                                }
                                vaVar.H0.setDrawable(new gi.u(tVar, false));
                                vaVar.b0(vaVar.I0, vaVar.J0.e, true);
                                vaVar.P0.e(true, vaVar.B0.j() ? vaVar.B0.getFilledProgress() : 0.0f);
                            }
                        }
                    }
                    vaVar.M1 = true;
                    int i12 = 0;
                    while (true) {
                        if (i12 < arrayList2.size()) {
                            gi.f7 l10 = gi.f7.l((ye) arrayList2.get(i12));
                            l10.M0 = (Bitmap) arrayList3.get(i12);
                            l10.J0 = vaVar.w0;
                            l10.K0 = vaVar.x0;
                            l10.A();
                            if (!bool.booleanValue()) {
                                if (vaVar.L1 == null) {
                                    vaVar.L1 = l10;
                                } else {
                                    if (vaVar.I1 == null) {
                                        ArrayList arrayList4 = new ArrayList();
                                        vaVar.I1 = arrayList4;
                                        arrayList4.add(vaVar.L1);
                                    }
                                    if (vaVar.I1.size() < 10) {
                                        vaVar.I1.add(l10);
                                    }
                                }
                                i12++;
                            } else if (vaVar.B0.l(l10)) {
                                vaVar.L1 = gi.f7.a(vaVar.B0.getLayout(), vaVar.B0.getContent());
                            } else {
                                i12++;
                            }
                        }
                    }
                    if (vaVar.I1 != null) {
                        vaVar.h0(false, true);
                        vaVar.R0.a(vaVar.P1);
                        gi.h6 h6Var = vaVar.P0;
                        boolean z10 = vaVar.P1 == 1;
                        h6Var.o0 = -1.0f;
                        h6Var.p0 = z10;
                        h6Var.invalidate();
                        vaVar.J1 = new ArrayList();
                        vaVar.K1 = new ArrayList();
                        for (int i13 = 0; i13 < vaVar.I1.size(); i13 = com.google.android.recaptcha.internal.a.f(i13, i13, 1, vaVar.K1)) {
                            vaVar.J1.add(Integer.valueOf(i13));
                        }
                        vaVar.B0.n(null);
                        vaVar.J0.a(false, true);
                        vaVar.l0(true);
                        vaVar.e(false);
                        vaVar.J(1, true);
                        gi.o9 o9Var = vaVar.e1;
                        if (o9Var != null) {
                            ei.z5 z5Var = o9Var.h;
                            if (!o9Var.J && !o9Var.N && (i3 = hp.e1().getInt("multistorieshint", 0)) < 3) {
                                hp.e1().edit().putInt("multistorieshint", i3 + 1).apply();
                                org.telegram.messenger.g0.r(z5Var);
                                o9Var.J = true;
                                o9Var.invalidate();
                                org.telegram.messenger.g0.i3(z5Var, 5500L);
                            }
                        }
                        gi.g3 g3Var = vaVar.N0;
                        if (g3Var != null) {
                            vaVar.m2 = g3Var.e.e0();
                            vaVar.n2 = vaVar.N0.getSelectedAlbum();
                            break;
                        }
                    } else {
                        gi.f7 f7Var = vaVar.L1;
                        if (f7Var != null) {
                            f7Var.B();
                        }
                        vaVar.J0.a(false, true);
                        vaVar.l0(true);
                        vaVar.e(false);
                        gi.g3 g3Var2 = vaVar.N0;
                        if (g3Var2 != null) {
                            vaVar.m2 = g3Var2.e.e0();
                            vaVar.n2 = vaVar.N0.getSelectedAlbum();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
