package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class iu extends pg.b {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ iu(Object obj, int i10) {
        this.d = i10;
        this.e = obj;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        switch (this.d) {
            case 0:
                fu fuVar = (fu) ((ku) this.e).d3.get(b1Var.b());
                int i10 = fuVar.a;
                if (i10 == 5 || (i10 == 2 && fuVar.h != -1)) {
                }
                break;
            default:
                int i11 = b1Var.f;
                if (i11 == 4 || i11 == 3 || i11 == 5) {
                }
                break;
        }
        return true;
    }

    @Override // s4.g0
    public final int h() {
        switch (this.d) {
            case 0:
                return ((ku) this.e).d3.size();
            default:
                return ((wb0) this.e).s.size();
        }
    }

    @Override // s4.g0
    public final int j(int i10) {
        switch (this.d) {
            case 0:
                return ((fu) ((ku) this.e).d3.get(i10)).a;
            default:
                wb0 wb0Var = (wb0) this.e;
                if (i10 < 0 || i10 >= wb0Var.s.size()) {
                    return 2;
                }
                return ((qb0) wb0Var.s.get(i10)).a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0217  */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.b1 b1Var, int i10) {
        Boolean bool;
        boolean z10;
        float f7;
        switch (this.d) {
            case 0:
                ku kuVar = (ku) this.e;
                ArrayList arrayList = kuVar.d3;
                int b10 = b1Var.b();
                View view = b1Var.a;
                fu fuVar = (fu) arrayList.get(b10);
                int i11 = b1Var.f;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 != 4) {
                                    if (i11 != 5) {
                                        if (i11 == 6) {
                                            ((mu) view).setTop(true);
                                            break;
                                        }
                                    } else {
                                        ((org.telegram.ui.Cells.r8) view).k(fuVar.f.toString(), false);
                                        break;
                                    }
                                } else {
                                    ((org.telegram.ui.Cells.l4) view).setText(fuVar.f);
                                    break;
                                }
                            } else {
                                ((org.telegram.ui.Cells.e9) view).setText(fuVar.f);
                                break;
                            }
                        } else {
                            du duVar = (du) view;
                            int i12 = fuVar.d;
                            int i13 = fuVar.e;
                            int i14 = fuVar.c;
                            CharSequence charSequence = fuVar.f;
                            CharSequence charSequence2 = fuVar.g;
                            int i15 = i10 + 1;
                            boolean z11 = i15 < h() && ((fu) arrayList.get(i15)).a == i11;
                            ImageView imageView = duVar.a;
                            if (i14 == 0) {
                                imageView.setVisibility(8);
                            } else {
                                imageView.setVisibility(0);
                                boolean q6 = org.telegram.ui.ActionBar.k6.I.q();
                                org.telegram.ui.Components.mc0 mc0Var = new org.telegram.ui.Components.mc0(1);
                                mc0Var.b(i12, i13);
                                mc0Var.b = q6;
                                imageView.setBackground(mc0Var);
                                imageView.setImageResource(i14);
                            }
                            duVar.b.setText(charSequence);
                            duVar.d.setText(charSequence2);
                            duVar.e = z11;
                            duVar.setWillNotDraw(!z11);
                            int i16 = fuVar.h;
                            if (i16 >= 0) {
                                ju[] juVarArr = kuVar.h3;
                                if (i16 >= juVarArr.length || juVarArr[i16].c > 0) {
                                    bool = Boolean.valueOf(kuVar.j3[i16]);
                                    ImageView imageView2 = duVar.c;
                                    if (bool == null) {
                                        imageView2.setVisibility(0);
                                        imageView2.animate().rotation(bool.booleanValue() ? 0.0f : 180.0f).setDuration(360L).setInterpolator(org.telegram.ui.Components.bs.h).start();
                                        break;
                                    } else {
                                        imageView2.setVisibility(8);
                                        break;
                                    }
                                }
                            }
                            bool = null;
                            ImageView imageView22 = duVar.c;
                            if (bool == null) {
                            }
                        }
                    } else {
                        ((nu) view).a.setText(fuVar.f);
                        break;
                    }
                } else {
                    org.telegram.ui.Components.dd ddVar = (org.telegram.ui.Components.dd) view;
                    if (kuVar.h3 != null) {
                        ddVar.f(kuVar.k3, kuVar.Y2, kuVar.i3);
                    }
                    kuVar.Y2 = false;
                    break;
                }
                break;
            default:
                ArrayList arrayList2 = ((wb0) this.e).s;
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    qb0 qb0Var = (qb0) arrayList2.get(i10);
                    int i17 = b1Var.f;
                    View view2 = b1Var.a;
                    if (i17 != 0) {
                        if (i17 != 1) {
                            if (i17 != 2) {
                                if (i17 != 3 && i17 != 4) {
                                    if (i17 == 5) {
                                        org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view2;
                                        if (qb0Var.f == 1) {
                                            r8Var.l(qb0Var.c, MessagesController.getGlobalMainSettings().getBoolean("view_animations", true), false);
                                            break;
                                        }
                                    }
                                } else {
                                    int i18 = i10 + 1;
                                    boolean z12 = i18 < arrayList2.size() && ((qb0) arrayList2.get(i18)).a != 2;
                                    vb0 vb0Var = (vb0) view2;
                                    Switch r32 = vb0Var.f;
                                    ImageView imageView3 = vb0Var.e;
                                    org.telegram.ui.Components.q6 q6Var = vb0Var.d;
                                    ImageView imageView4 = vb0Var.a;
                                    org.telegram.ui.Components.xp xpVar = vb0Var.h;
                                    ai.wd wdVar = vb0Var.c;
                                    int i19 = qb0Var.a;
                                    CharSequence charSequence3 = qb0Var.c;
                                    int i20 = qb0Var.e;
                                    if (i19 == 3) {
                                        xpVar.setVisibility(8);
                                        imageView4.setVisibility(0);
                                        imageView4.setImageResource(qb0Var.d);
                                        wdVar.setText(charSequence3);
                                        boolean z13 = Integer.bitCount(i20) > 1;
                                        vb0Var.v = z13;
                                        if (z13) {
                                            vb0Var.c(qb0Var, false);
                                            q6Var.setVisibility(0);
                                            imageView3.setVisibility(0);
                                        } else {
                                            q6Var.setVisibility(8);
                                            imageView3.setVisibility(8);
                                        }
                                        wdVar.setTranslationX(0.0f);
                                        r32.setVisibility(0);
                                        r32.c(LiteMode.isEnabled(i20), false);
                                        z10 = true;
                                        vb0Var.r = Integer.bitCount(i20) > 1;
                                    } else {
                                        z10 = true;
                                        xpVar.setVisibility(0);
                                        xpVar.a(LiteMode.isEnabled(i20), false);
                                        imageView4.setVisibility(8);
                                        r32.setVisibility(8);
                                        q6Var.setVisibility(8);
                                        imageView3.setVisibility(8);
                                        wdVar.setText(charSequence3);
                                        wdVar.setTranslationX(AndroidUtilities.dp(41.0f) * (LocaleController.isRTL ? -2.2f : 1.0f));
                                        vb0Var.v = false;
                                        vb0Var.r = false;
                                    }
                                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) vb0Var.b.getLayoutParams();
                                    if (qb0Var.a == 3) {
                                        f7 = (LocaleController.isRTL ? 64 : 75) + 4;
                                    } else {
                                        f7 = 8.0f;
                                    }
                                    marginLayoutParams.rightMargin = AndroidUtilities.dp(f7);
                                    vb0Var.n = z12;
                                    vb0Var.setWillNotDraw((z12 || vb0Var.r) ? false : z10);
                                    vb0Var.b(LiteMode.isPowerSaverApplied(), false);
                                    break;
                                }
                            } else {
                                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view2;
                                CharSequence charSequence4 = qb0Var.c;
                                if (TextUtils.isEmpty(charSequence4)) {
                                    e9Var.setFixedSize(12);
                                } else {
                                    e9Var.setFixedSize(0);
                                }
                                e9Var.setText(charSequence4);
                                e9Var.setContentDescription(charSequence4);
                                e9Var.setBackground(null);
                                break;
                            }
                        } else {
                            ((ub0) view2).a();
                            break;
                        }
                    } else {
                        ((org.telegram.ui.Cells.l4) view2).setText(qb0Var.c);
                        break;
                    }
                }
                break;
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        int i11 = this.d;
        View view2 = null;
        Object obj = this.e;
        switch (i11) {
            case 0:
                ku kuVar = (ku) obj;
                org.telegram.ui.ActionBar.g6 g6Var = kuVar.n2;
                if (i10 == 0) {
                    Context context = kuVar.getContext();
                    int[] iArr = ou.e;
                    hu huVar = new hu(this, context, iArr.length, iArr, ou.f);
                    kuVar.o3 = huVar;
                    huVar.setInterceptTouch(false);
                    View view3 = kuVar.o3;
                    view3.setTag(-33024);
                    view = view3;
                } else if (i10 == 1) {
                    Context context2 = kuVar.getContext();
                    nu nuVar = new nu(context2);
                    TextView textView = new TextView(context2);
                    nuVar.a = textView;
                    textView.setGravity(17);
                    textView.setTextSize(1, 13.0f);
                    org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.y6, null);
                    nuVar.addView(textView, w7.z5.d(-1, -2.0f, 119, 24.0f, 0.0f, 24.0f, 14.0f));
                    nuVar.setTag(-33024);
                    view = nuVar;
                } else if (i10 == 3) {
                    view = new org.telegram.ui.Cells.e9(kuVar.getContext());
                } else if (i10 == 4) {
                    View l4Var = new org.telegram.ui.Cells.l4(kuVar.getContext());
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, l4Var, g6Var);
                    view = l4Var;
                } else if (i10 == 5) {
                    org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(kuVar.getContext());
                    org.telegram.ui.ActionBar.r6.Z(r8Var.getTextView(), org.telegram.ui.ActionBar.k6.p7, g6Var);
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, r8Var, g6Var);
                    view = r8Var;
                } else if (i10 == 6) {
                    mu muVar = new mu(kuVar.getContext());
                    muVar.a = new Path();
                    Paint paint = new Paint(1);
                    muVar.b = paint;
                    muVar.c = true;
                    paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(-0.66f), 251658240);
                    paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false));
                    view = muVar;
                } else if (i10 != 7) {
                    view = new du(kuVar.p3, kuVar.getContext());
                } else {
                    View unVar = new org.telegram.ui.Components.un(kuVar.getContext(), 14);
                    int i12 = org.telegram.ui.ActionBar.k6.d6;
                    int i13 = ku.q3;
                    org.telegram.ui.ActionBar.r6.i(i12, unVar, kuVar.n2);
                    view = unVar;
                }
                return new org.telegram.ui.Components.wl0(view);
            default:
                wb0 wb0Var = (wb0) obj;
                Context context3 = viewGroup.getContext();
                if (i10 == 0) {
                    view2 = new org.telegram.ui.Cells.l4(context3);
                } else if (i10 == 1) {
                    view2 = new ub0(wb0Var, context3);
                } else if (i10 == 2) {
                    view2 = new pb0(context3);
                } else if (i10 == 3 || i10 == 4) {
                    view2 = new vb0(wb0Var, context3);
                } else if (i10 == 5) {
                    view2 = new org.telegram.ui.Cells.r8(23, context3, null, false, true);
                }
                return new org.telegram.ui.Components.wl0(view2);
        }
    }
}
