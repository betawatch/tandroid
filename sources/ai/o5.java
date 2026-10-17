package ai;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ d6 b;

    public /* synthetic */ o5(d6 d6Var, int i10) {
        this.a = i10;
        this.b = d6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        b6 b6Var;
        int i10 = this.a;
        boolean z10 = true;
        d6 d6Var = this.b;
        switch (i10) {
            case 0:
                if (d6Var.P.getAlpha() >= 1.0f) {
                    d6Var.g0.run();
                    break;
                }
                break;
            case 1:
                if (d6Var.P.getAlpha() >= 1.0f) {
                    d6Var.g0.run();
                    break;
                }
                break;
            case 2:
                d6Var.getClass();
                d6Var.b((r5) view);
                break;
            case 3:
                d6Var.getClass();
                d6Var.b((r5) view);
                break;
            case 4:
                d6 d6Var2 = this.b;
                LinearLayout linearLayout = d6Var2.G;
                b6[] b6VarArr = d6Var2.n;
                if (d6Var2.getAlpha() >= 1.0f && !d6Var2.h0) {
                    if (d6Var2.j0) {
                        d6Var2.a(d6Var2.W, d6Var2.a0, d6Var2.b0, d6Var2.c0);
                        break;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (b6 b6Var2 : b6VarArr) {
                            if (b6Var2 != null) {
                                TL_stars.StarGift starGift = b6Var2.h;
                                if ((starGift != null ? starGift : null) != null) {
                                    if (starGift == null) {
                                        starGift = null;
                                    }
                                    arrayList.add(starGift);
                                }
                            }
                        }
                        if (!arrayList.isEmpty() && d6Var2.e0 != null) {
                            TextView textView = d6Var2.K;
                            d6Var2.h0 = true;
                            d6Var2.j0 = false;
                            ei.x3 x3Var = d6Var2.T;
                            if (x3Var != null) {
                                x3Var.e(true);
                                d6Var2.T = null;
                            }
                            textView.setText("");
                            d6Var2.L.setText(LocaleController.formatString(R.string.GiftCraftProgressSuccessChance, gi.l.H0(d6Var2.getGiftsSuccessChance())));
                            for (int i11 = 0; i11 < b6VarArr.length; i11++) {
                                b6 b6Var3 = b6VarArr[i11];
                                if (b6Var3 != null) {
                                    b6Var3.setClickable(false);
                                    b6 b6Var4 = b6VarArr[i11];
                                    TL_stars.StarGift starGift2 = b6Var4.h;
                                    if (starGift2 == null) {
                                        starGift2 = null;
                                    }
                                    if (starGift2 == null) {
                                        b6Var4.animate().alpha(0.0f).start();
                                    }
                                }
                            }
                            int i12 = 0;
                            while (true) {
                                if (i12 < b6VarArr.length) {
                                    b6 b6Var5 = b6VarArr[i12];
                                    if (b6Var5 != null) {
                                        TL_stars.StarGift starGift3 = b6Var5.h;
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
                            d6Var2.Q.animate().alpha(0.0f).start();
                            linearLayout.animate().alpha(0.0f).start();
                            d6Var2.R.animate().alpha(1.0f).start();
                            d6Var2.P.animate().alpha(0.25f).start();
                            d6Var2.J.d();
                            ArrayList arrayList2 = new ArrayList();
                            for (b6 b6Var6 : b6VarArr) {
                                TL_stars.StarGift starGift4 = b6Var6.h;
                                if ((starGift4 != null ? starGift4 : null) != null) {
                                    if (starGift4 == null) {
                                        starGift4 = null;
                                    }
                                    arrayList2.add(starGift4);
                                }
                            }
                            d6Var2.e0.run(arrayList2, new q5(0, d6Var2, arrayList2), new a3.d(d6Var2, 14));
                            break;
                        } else {
                            AndroidUtilities.shakeViewSpring(linearLayout);
                            break;
                        }
                    }
                }
                break;
            default:
                b6 b6Var7 = (b6) view;
                TL_stars.StarGift starGift5 = b6Var7.h;
                if (starGift5 == null) {
                    starGift5 = null;
                }
                if (starGift5 != null && !b6Var7.n) {
                    b6Var7.a(null, true);
                    d6Var.d(true);
                    break;
                } else {
                    int i13 = 0;
                    while (true) {
                        b6[] b6VarArr2 = d6Var.n;
                        if (i13 < b6VarArr2.length && (b6Var = b6VarArr2[i13]) != view) {
                            if (b6Var != null) {
                                TL_stars.StarGift starGift6 = b6Var.h;
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
                    d6Var.f0.run(new n2(3, d6Var, b6Var7), Boolean.valueOf(z10));
                    break;
                }
                break;
        }
    }
}
