// default package

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class jra implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ura b;

    public /* synthetic */ jra(ura uraVar, byte b) {
        this.a = b;
        this.b = uraVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        sra sraVar;
        byte b = this.a;
        boolean z = true;
        ura uraVar = this.b;
        switch (b) {
            case 0:
                if (uraVar.Q.getAlpha() >= 1.0f) {
                    uraVar.h0.run();
                    break;
                }
                break;
            case 1:
                if (uraVar.Q.getAlpha() >= 1.0f) {
                    uraVar.h0.run();
                    break;
                }
                break;
            case 2:
                uraVar.b((kra) view);
                break;
            case 3:
                uraVar.b((kra) view);
                break;
            case 4:
                ura uraVar2 = this.b;
                LinearLayout linearLayout = uraVar2.H;
                sra[] sraVarArr = uraVar2.n;
                if (uraVar2.getAlpha() >= 1.0f && !uraVar2.i0) {
                    if (uraVar2.k0) {
                        uraVar2.a(uraVar2.a0, uraVar2.b0, uraVar2.c0, uraVar2.d0);
                        break;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (sra sraVar2 : sraVarArr) {
                            if (sraVar2 != null) {
                                TL_stars.StarGift starGift = sraVar2.h;
                                if ((starGift != null ? starGift : null) != null) {
                                    if (starGift == null) {
                                        starGift = null;
                                    }
                                    arrayList.add(starGift);
                                }
                            }
                        }
                        if (!arrayList.isEmpty() && uraVar2.f0 != null) {
                            TextView textView = uraVar2.L;
                            uraVar2.i0 = true;
                            uraVar2.k0 = false;
                            hg5 hg5Var = uraVar2.U;
                            if (hg5Var != null) {
                                hg5Var.f(true);
                                uraVar2.U = null;
                            }
                            textView.setText("");
                            uraVar2.M.setText(jb6.a0(null, null, 2131749709, bc.J0(uraVar2.getGiftsSuccessChance())));
                            for (int i = 0; i < sraVarArr.length; i++) {
                                sra sraVar3 = sraVarArr[i];
                                if (sraVar3 != null) {
                                    sraVar3.setClickable(false);
                                    sra sraVar4 = sraVarArr[i];
                                    TL_stars.StarGift starGift2 = sraVar4.h;
                                    if (starGift2 == null) {
                                        starGift2 = null;
                                    }
                                    if (starGift2 == null) {
                                        sraVar4.animate().alpha(0.0f).start();
                                    }
                                }
                            }
                            int i2 = 0;
                            while (true) {
                                if (i2 < sraVarArr.length) {
                                    sra sraVar5 = sraVarArr[i2];
                                    if (sraVar5 != null) {
                                        TL_stars.StarGift starGift3 = sraVar5.h;
                                        if ((starGift3 != null ? starGift3 : null) != null) {
                                            if (starGift3 == null) {
                                                starGift3 = null;
                                            }
                                            textView.setText(starGift3.title + " #" + jb6.E(starGift3.num, ','));
                                        }
                                    }
                                    i2++;
                                }
                            }
                            uraVar2.R.animate().alpha(0.0f).start();
                            linearLayout.animate().alpha(0.0f).start();
                            uraVar2.S.animate().alpha(1.0f).start();
                            uraVar2.Q.animate().alpha(0.25f).start();
                            uraVar2.K.d();
                            ArrayList arrayList2 = new ArrayList();
                            for (sra sraVar6 : sraVarArr) {
                                TL_stars.StarGift starGift4 = sraVar6.h;
                                if ((starGift4 != null ? starGift4 : null) != null) {
                                    if (starGift4 == null) {
                                        starGift4 = null;
                                    }
                                    arrayList2.add(starGift4);
                                }
                            }
                            uraVar2.f0.a(arrayList2, new s87(uraVar2, arrayList2, (byte) 13), new c0a(uraVar2, (byte) 25));
                            break;
                        } else {
                            gm.B3(linearLayout);
                            break;
                        }
                    }
                }
                break;
            default:
                sra sraVar7 = (sra) view;
                TL_stars.StarGift starGift5 = sraVar7.h;
                if (starGift5 == null) {
                    starGift5 = null;
                }
                if (starGift5 != null && !sraVar7.n) {
                    sraVar7.a(null, true);
                    uraVar.d(true);
                    break;
                } else {
                    int i3 = 0;
                    while (true) {
                        sra[] sraVarArr2 = uraVar.n;
                        if (i3 < sraVarArr2.length && (sraVar = sraVarArr2[i3]) != view) {
                            if (sraVar != null) {
                                TL_stars.StarGift starGift6 = sraVar.h;
                                if (starGift6 == null) {
                                    starGift6 = null;
                                }
                                if (starGift6 != null) {
                                    z = false;
                                }
                            }
                            i3++;
                        }
                    }
                    uraVar.g0.a(new ts9(uraVar, sraVar7, (byte) 11), Boolean.valueOf(z));
                    break;
                }
                break;
        }
    }
}
