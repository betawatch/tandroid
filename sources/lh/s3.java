package lh;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f4 b;

    public /* synthetic */ s3(f4 f4Var, int i10) {
        this.a = i10;
        this.b = f4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        d4 d4Var;
        int i10 = this.a;
        boolean z4 = true;
        f4 f4Var = this.b;
        switch (i10) {
            case 0:
                if (f4Var.M.getAlpha() >= 1.0f) {
                    f4Var.d0.run();
                    break;
                }
                break;
            case 1:
                if (f4Var.M.getAlpha() >= 1.0f) {
                    f4Var.d0.run();
                    break;
                }
                break;
            case 2:
                f4Var.getClass();
                f4Var.b((u3) view);
                break;
            case 3:
                f4Var.getClass();
                f4Var.b((u3) view);
                break;
            case 4:
                f4 f4Var2 = this.b;
                LinearLayout linearLayout = f4Var2.D;
                d4[] d4VarArr = f4Var2.n;
                if (f4Var2.getAlpha() >= 1.0f && !f4Var2.e0) {
                    if (f4Var2.g0) {
                        f4Var2.a(f4Var2.T, f4Var2.U, f4Var2.V, f4Var2.W);
                        break;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (d4 d4Var2 : d4VarArr) {
                            if (d4Var2 != null) {
                                TL_stars.StarGift starGift = d4Var2.h;
                                if ((starGift != null ? starGift : null) != null) {
                                    if (starGift == null) {
                                        starGift = null;
                                    }
                                    arrayList.add(starGift);
                                }
                            }
                        }
                        if (!arrayList.isEmpty() && f4Var2.b0 != null) {
                            TextView textView = f4Var2.H;
                            f4Var2.e0 = true;
                            f4Var2.g0 = false;
                            ph.f3 f3Var = f4Var2.Q;
                            if (f3Var != null) {
                                f3Var.e(true);
                                f4Var2.Q = null;
                            }
                            textView.setText("");
                            f4Var2.I.setText(LocaleController.formatString(R.string.GiftCraftProgressSuccessChance, rh.k.G0(f4Var2.getGiftsSuccessChance())));
                            for (int i11 = 0; i11 < d4VarArr.length; i11++) {
                                d4 d4Var3 = d4VarArr[i11];
                                if (d4Var3 != null) {
                                    d4Var3.setClickable(false);
                                    d4 d4Var4 = d4VarArr[i11];
                                    TL_stars.StarGift starGift2 = d4Var4.h;
                                    if (starGift2 == null) {
                                        starGift2 = null;
                                    }
                                    if (starGift2 == null) {
                                        d4Var4.animate().alpha(0.0f).start();
                                    }
                                }
                            }
                            int i12 = 0;
                            while (true) {
                                if (i12 < d4VarArr.length) {
                                    d4 d4Var5 = d4VarArr[i12];
                                    if (d4Var5 != null) {
                                        TL_stars.StarGift starGift3 = d4Var5.h;
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
                            f4Var2.N.animate().alpha(0.0f).start();
                            linearLayout.animate().alpha(0.0f).start();
                            f4Var2.O.animate().alpha(1.0f).start();
                            f4Var2.M.animate().alpha(0.25f).start();
                            f4Var2.G.d();
                            ArrayList arrayList2 = new ArrayList();
                            for (d4 d4Var6 : d4VarArr) {
                                TL_stars.StarGift starGift4 = d4Var6.h;
                                if ((starGift4 != null ? starGift4 : null) != null) {
                                    if (starGift4 == null) {
                                        starGift4 = null;
                                    }
                                    arrayList2.add(starGift4);
                                }
                            }
                            f4Var2.b0.run(arrayList2, new dh.v(3, f4Var2, arrayList2), new b(f4Var2, 6));
                            break;
                        } else {
                            AndroidUtilities.shakeViewSpring(linearLayout);
                            break;
                        }
                    }
                }
                break;
            default:
                d4 d4Var7 = (d4) view;
                TL_stars.StarGift starGift5 = d4Var7.h;
                if (starGift5 == null) {
                    starGift5 = null;
                }
                if (starGift5 != null && !d4Var7.n) {
                    d4Var7.a(null, true);
                    f4Var.d(true);
                    break;
                } else {
                    int i13 = 0;
                    while (true) {
                        d4[] d4VarArr2 = f4Var.n;
                        if (i13 < d4VarArr2.length && (d4Var = d4VarArr2[i13]) != view) {
                            if (d4Var != null) {
                                TL_stars.StarGift starGift6 = d4Var.h;
                                if (starGift6 == null) {
                                    starGift6 = null;
                                }
                                if (starGift6 != null) {
                                    z4 = false;
                                }
                            }
                            i13++;
                        }
                    }
                    f4Var.c0.run(new kh.a1(6, f4Var, d4Var7), Boolean.valueOf(z4));
                    break;
                }
                break;
        }
    }
}
