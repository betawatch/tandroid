package ci;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ h5 b;

    public /* synthetic */ u4(h5 h5Var, int i3) {
        this.a = i3;
        this.b = h5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        f5 f5Var;
        int i3 = this.a;
        boolean z10 = false;
        h5 h5Var = this.b;
        switch (i3) {
            case 0:
                if (h5Var.Q.getAlpha() >= 1.0f) {
                    h5Var.h0.run();
                    break;
                }
                break;
            case 1:
                if (h5Var.Q.getAlpha() >= 1.0f) {
                    h5Var.h0.run();
                    break;
                }
                break;
            case 2:
                h5Var.getClass();
                h5Var.b((w4) view);
                break;
            case 3:
                h5Var.getClass();
                h5Var.b((w4) view);
                break;
            case 4:
                h5 h5Var2 = this.b;
                LinearLayout linearLayout = h5Var2.H;
                f5[] f5VarArr = h5Var2.n;
                if (h5Var2.getAlpha() >= 1.0f && !h5Var2.i0) {
                    if (h5Var2.k0) {
                        h5Var2.a(h5Var2.a0, h5Var2.b0, h5Var2.c0, h5Var2.d0);
                        break;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (f5 f5Var2 : f5VarArr) {
                            if (f5Var2 != null) {
                                TL_stars.StarGift starGift = f5Var2.h;
                                if ((starGift != null ? starGift : null) != null) {
                                    if (starGift == null) {
                                        starGift = null;
                                    }
                                    arrayList.add(starGift);
                                }
                            }
                        }
                        if (!arrayList.isEmpty() && h5Var2.f0 != null) {
                            TextView textView = h5Var2.L;
                            h5Var2.i0 = true;
                            h5Var2.k0 = false;
                            gi.l3 l3Var = h5Var2.U;
                            if (l3Var != null) {
                                l3Var.f(true);
                                h5Var2.U = null;
                            }
                            textView.setText("");
                            h5Var2.M.setText(bd.a0(null, null, 2131749784, ii.k.J0(h5Var2.getGiftsSuccessChance())));
                            for (int i10 = 0; i10 < f5VarArr.length; i10++) {
                                f5 f5Var3 = f5VarArr[i10];
                                if (f5Var3 != null) {
                                    f5Var3.setClickable(false);
                                    f5 f5Var4 = f5VarArr[i10];
                                    TL_stars.StarGift starGift2 = f5Var4.h;
                                    if (starGift2 == null) {
                                        starGift2 = null;
                                    }
                                    if (starGift2 == null) {
                                        f5Var4.animate().alpha(0.0f).start();
                                    }
                                }
                            }
                            int i11 = 0;
                            while (true) {
                                if (i11 < f5VarArr.length) {
                                    f5 f5Var5 = f5VarArr[i11];
                                    if (f5Var5 != null) {
                                        TL_stars.StarGift starGift3 = f5Var5.h;
                                        if ((starGift3 != null ? starGift3 : null) != null) {
                                            if (starGift3 == null) {
                                                starGift3 = null;
                                            }
                                            textView.setText(starGift3.title + " #" + bd.E(starGift3.num, ','));
                                        }
                                    }
                                    i11++;
                                }
                            }
                            h5Var2.R.animate().alpha(0.0f).start();
                            linearLayout.animate().alpha(0.0f).start();
                            h5Var2.S.animate().alpha(1.0f).start();
                            h5Var2.Q.animate().alpha(0.25f).start();
                            h5Var2.K.d();
                            ArrayList arrayList2 = new ArrayList();
                            for (f5 f5Var6 : f5VarArr) {
                                TL_stars.StarGift starGift4 = f5Var6.h;
                                if ((starGift4 != null ? starGift4 : null) != null) {
                                    if (starGift4 == null) {
                                        starGift4 = null;
                                    }
                                    arrayList2.add(starGift4);
                                }
                            }
                            h5Var2.f0.a(arrayList2, new ai.q4(1, h5Var2, arrayList2), new d1(h5Var2, 3));
                            break;
                        } else {
                            org.telegram.messenger.g0.H3(linearLayout);
                            break;
                        }
                    }
                }
                break;
            default:
                f5 f5Var7 = (f5) view;
                TL_stars.StarGift starGift5 = f5Var7.h;
                if (starGift5 == null) {
                    starGift5 = null;
                }
                if (starGift5 != null && !f5Var7.n) {
                    f5Var7.a(null, true);
                    h5Var.d(true);
                    break;
                } else {
                    int i12 = 0;
                    while (true) {
                        f5[] f5VarArr2 = h5Var.n;
                        if (i12 < f5VarArr2.length && (f5Var = f5VarArr2[i12]) != view) {
                            if (f5Var != null) {
                                TL_stars.StarGift starGift6 = f5Var.h;
                                if (starGift6 == null) {
                                    starGift6 = null;
                                }
                                if (starGift6 != null) {
                                }
                            }
                            i12++;
                        }
                    }
                    z10 = true;
                    h5Var.g0.a(new ai.o1(8, h5Var, f5Var7), Boolean.valueOf(z10));
                    break;
                }
                break;
        }
    }
}
