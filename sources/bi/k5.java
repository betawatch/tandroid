package bi;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ z5 b;

    public /* synthetic */ k5(z5 z5Var, int i10) {
        this.a = i10;
        this.b = z5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        x5 x5Var;
        int i10 = this.a;
        boolean z10 = true;
        z5 z5Var = this.b;
        switch (i10) {
            case 0:
                if (z5Var.P.getAlpha() >= 1.0f) {
                    z5Var.g0.run();
                    break;
                }
                break;
            case 1:
                if (z5Var.P.getAlpha() >= 1.0f) {
                    z5Var.g0.run();
                    break;
                }
                break;
            case 2:
                z5Var.getClass();
                z5Var.b((n5) view);
                break;
            case 3:
                z5Var.getClass();
                z5Var.b((n5) view);
                break;
            case 4:
                z5 z5Var2 = this.b;
                LinearLayout linearLayout = z5Var2.G;
                x5[] x5VarArr = z5Var2.n;
                if (z5Var2.getAlpha() >= 1.0f && !z5Var2.h0) {
                    if (z5Var2.j0) {
                        z5Var2.a(z5Var2.W, z5Var2.a0, z5Var2.b0, z5Var2.c0);
                        break;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (x5 x5Var2 : x5VarArr) {
                            if (x5Var2 != null) {
                                TL_stars.StarGift starGift = x5Var2.h;
                                if ((starGift != null ? starGift : null) != null) {
                                    if (starGift == null) {
                                        starGift = null;
                                    }
                                    arrayList.add(starGift);
                                }
                            }
                        }
                        if (!arrayList.isEmpty() && z5Var2.e0 != null) {
                            TextView textView = z5Var2.K;
                            z5Var2.h0 = true;
                            z5Var2.j0 = false;
                            fi.v3 v3Var = z5Var2.T;
                            if (v3Var != null) {
                                v3Var.e(true);
                                z5Var2.T = null;
                            }
                            textView.setText("");
                            z5Var2.L.setText(LocaleController.formatString(R.string.GiftCraftProgressSuccessChance, hi.k.F0(z5Var2.getGiftsSuccessChance())));
                            for (int i11 = 0; i11 < x5VarArr.length; i11++) {
                                x5 x5Var3 = x5VarArr[i11];
                                if (x5Var3 != null) {
                                    x5Var3.setClickable(false);
                                    x5 x5Var4 = x5VarArr[i11];
                                    TL_stars.StarGift starGift2 = x5Var4.h;
                                    if (starGift2 == null) {
                                        starGift2 = null;
                                    }
                                    if (starGift2 == null) {
                                        x5Var4.animate().alpha(0.0f).start();
                                    }
                                }
                            }
                            int i12 = 0;
                            while (true) {
                                if (i12 < x5VarArr.length) {
                                    x5 x5Var5 = x5VarArr[i12];
                                    if (x5Var5 != null) {
                                        TL_stars.StarGift starGift3 = x5Var5.h;
                                        if ((starGift3 != null ? starGift3 : null) != null) {
                                            if (starGift3 == null) {
                                                starGift3 = null;
                                            }
                                            textView.setText(starGift3.title + " #" + LocaleController.formatNumber(starGift3.num, ','));
                                        }
                                    }
                                    i12++;
                                }
                            }
                            z5Var2.Q.animate().alpha(0.0f).start();
                            linearLayout.animate().alpha(0.0f).start();
                            z5Var2.R.animate().alpha(1.0f).start();
                            z5Var2.P.animate().alpha(0.25f).start();
                            z5Var2.J.d();
                            ArrayList arrayList2 = new ArrayList();
                            for (x5 x5Var6 : x5VarArr) {
                                TL_stars.StarGift starGift4 = x5Var6.h;
                                if ((starGift4 != null ? starGift4 : null) != null) {
                                    if (starGift4 == null) {
                                        starGift4 = null;
                                    }
                                    arrayList2.add(starGift4);
                                }
                            }
                            z5Var2.e0.run(arrayList2, new m5(0, z5Var2, arrayList2), new a3.d(z5Var2, 25));
                            break;
                        } else {
                            AndroidUtilities.shakeViewSpring(linearLayout);
                            break;
                        }
                    }
                }
                break;
            default:
                x5 x5Var7 = (x5) view;
                TL_stars.StarGift starGift5 = x5Var7.h;
                if (starGift5 == null) {
                    starGift5 = null;
                }
                if (starGift5 != null && !x5Var7.n) {
                    x5Var7.a(null, true);
                    z5Var.d(true);
                    break;
                } else {
                    int i13 = 0;
                    while (true) {
                        x5[] x5VarArr2 = z5Var.n;
                        if (i13 < x5VarArr2.length && (x5Var = x5VarArr2[i13]) != view) {
                            if (x5Var != null) {
                                TL_stars.StarGift starGift6 = x5Var.h;
                                if (starGift6 == null) {
                                    starGift6 = null;
                                }
                                if (starGift6 != null) {
                                    z10 = false;
                                }
                            }
                            i13++;
                        }
                    }
                    z5Var.f0.run(new ai.n1(4, z5Var, x5Var7), Boolean.valueOf(z10));
                    break;
                }
                break;
        }
    }
}
