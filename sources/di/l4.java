package di;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class l4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ y4 b;

    public /* synthetic */ l4(y4 y4Var, int i7) {
        this.a = i7;
        this.b = y4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        w4 w4Var;
        int i7 = this.a;
        boolean z10 = false;
        y4 y4Var = this.b;
        switch (i7) {
            case 0:
                if (y4Var.Q.getAlpha() >= 1.0f) {
                    y4Var.h0.run();
                    break;
                }
                break;
            case 1:
                if (y4Var.Q.getAlpha() >= 1.0f) {
                    y4Var.h0.run();
                    break;
                }
                break;
            case 2:
                y4Var.getClass();
                y4Var.b((n4) view);
                break;
            case 3:
                y4Var.getClass();
                y4Var.b((n4) view);
                break;
            case 4:
                y4 y4Var2 = this.b;
                LinearLayout linearLayout = y4Var2.H;
                w4[] w4VarArr = y4Var2.n;
                if (y4Var2.getAlpha() >= 1.0f && !y4Var2.i0) {
                    if (y4Var2.k0) {
                        y4Var2.a(y4Var2.a0, y4Var2.b0, y4Var2.c0, y4Var2.d0);
                        break;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (w4 w4Var2 : w4VarArr) {
                            if (w4Var2 != null) {
                                TL_stars.StarGift starGift = w4Var2.h;
                                if ((starGift != null ? starGift : null) != null) {
                                    if (starGift == null) {
                                        starGift = null;
                                    }
                                    arrayList.add(starGift);
                                }
                            }
                        }
                        if (!arrayList.isEmpty() && y4Var2.f0 != null) {
                            TextView textView = y4Var2.L;
                            y4Var2.i0 = true;
                            y4Var2.k0 = false;
                            hi.l3 l3Var = y4Var2.U;
                            if (l3Var != null) {
                                l3Var.f(true);
                                y4Var2.U = null;
                            }
                            textView.setText("");
                            y4Var2.M.setText(hd.a0(null, null, 2131749776, ki.k.J0(y4Var2.getGiftsSuccessChance())));
                            for (int i10 = 0; i10 < w4VarArr.length; i10++) {
                                w4 w4Var3 = w4VarArr[i10];
                                if (w4Var3 != null) {
                                    w4Var3.setClickable(false);
                                    w4 w4Var4 = w4VarArr[i10];
                                    TL_stars.StarGift starGift2 = w4Var4.h;
                                    if (starGift2 == null) {
                                        starGift2 = null;
                                    }
                                    if (starGift2 == null) {
                                        w4Var4.animate().alpha(0.0f).start();
                                    }
                                }
                            }
                            int i11 = 0;
                            while (true) {
                                if (i11 < w4VarArr.length) {
                                    w4 w4Var5 = w4VarArr[i11];
                                    if (w4Var5 != null) {
                                        TL_stars.StarGift starGift3 = w4Var5.h;
                                        if ((starGift3 != null ? starGift3 : null) != null) {
                                            if (starGift3 == null) {
                                                starGift3 = null;
                                            }
                                            textView.setText(starGift3.title + " #" + hd.E(starGift3.num, ','));
                                        }
                                    }
                                    i11++;
                                }
                            }
                            y4Var2.R.animate().alpha(0.0f).start();
                            linearLayout.animate().alpha(0.0f).start();
                            y4Var2.S.animate().alpha(1.0f).start();
                            y4Var2.Q.animate().alpha(0.25f).start();
                            y4Var2.K.d();
                            ArrayList arrayList2 = new ArrayList();
                            for (w4 w4Var6 : w4VarArr) {
                                TL_stars.StarGift starGift4 = w4Var6.h;
                                if ((starGift4 != null ? starGift4 : null) != null) {
                                    if (starGift4 == null) {
                                        starGift4 = null;
                                    }
                                    arrayList2.add(starGift4);
                                }
                            }
                            y4Var2.f0.a(arrayList2, new bi.e4(1, y4Var2, arrayList2), new ch.w(y4Var2, 14));
                            break;
                        } else {
                            org.telegram.messenger.g0.G3(linearLayout);
                            break;
                        }
                    }
                }
                break;
            default:
                w4 w4Var7 = (w4) view;
                TL_stars.StarGift starGift5 = w4Var7.h;
                if (starGift5 == null) {
                    starGift5 = null;
                }
                if (starGift5 != null && !w4Var7.n) {
                    w4Var7.a(null, true);
                    y4Var.d(true);
                    break;
                } else {
                    int i12 = 0;
                    while (true) {
                        w4[] w4VarArr2 = y4Var.n;
                        if (i12 < w4VarArr2.length && (w4Var = w4VarArr2[i12]) != view) {
                            if (w4Var != null) {
                                TL_stars.StarGift starGift6 = w4Var.h;
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
                    y4Var.g0.a(new ai.v1(9, y4Var, w4Var7), Boolean.valueOf(z10));
                    break;
                }
                break;
        }
    }
}
