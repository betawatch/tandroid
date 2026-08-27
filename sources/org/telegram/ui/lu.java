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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class lu extends xf.b {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ lu(Object obj, int i10) {
        this.d = i10;
        this.e = obj;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        switch (this.d) {
            case 0:
                iu iuVar = (iu) ((nu) this.e).Y2.get(o1Var.b());
                int i10 = iuVar.a;
                if (i10 == 5 || (i10 == 2 && iuVar.h != -1)) {
                }
                break;
            default:
                int i11 = o1Var.f;
                if (i11 == 4 || i11 == 3 || i11 == 5) {
                }
                break;
        }
        return true;
    }

    @Override // f2.q0
    public final int h() {
        switch (this.d) {
            case 0:
                return ((nu) this.e).Y2.size();
            default:
                return ((xb0) this.e).s.size();
        }
    }

    @Override // f2.q0
    public final int j(int i10) {
        switch (this.d) {
            case 0:
                return ((iu) ((nu) this.e).Y2.get(i10)).a;
            default:
                xb0 xb0Var = (xb0) this.e;
                if (i10 < 0 || i10 >= xb0Var.s.size()) {
                    return 2;
                }
                return ((rb0) xb0Var.s.get(i10)).a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0218  */
    @Override // f2.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.o1 o1Var, int i10) {
        Boolean bool;
        float f10;
        switch (this.d) {
            case 0:
                nu nuVar = (nu) this.e;
                ArrayList arrayList = nuVar.Y2;
                int b10 = o1Var.b();
                View view = o1Var.a;
                iu iuVar = (iu) arrayList.get(b10);
                int i11 = o1Var.f;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 != 4) {
                                    if (i11 != 5) {
                                        if (i11 == 6) {
                                            ((pu) view).setTop(true);
                                            break;
                                        }
                                    } else {
                                        ((org.telegram.ui.Cells.l8) view).i(iuVar.f.toString(), false);
                                        break;
                                    }
                                } else {
                                    ((org.telegram.ui.Cells.j4) view).setText(iuVar.f);
                                    break;
                                }
                            } else {
                                ((org.telegram.ui.Cells.x8) view).setText(iuVar.f);
                                break;
                            }
                        } else {
                            gu guVar = (gu) view;
                            int i12 = iuVar.d;
                            int i13 = iuVar.e;
                            int i14 = iuVar.c;
                            CharSequence charSequence = iuVar.f;
                            CharSequence charSequence2 = iuVar.g;
                            int i15 = i10 + 1;
                            boolean z10 = i15 < h() && ((iu) arrayList.get(i15)).a == i11;
                            ImageView imageView = guVar.a;
                            if (i14 == 0) {
                                imageView.setVisibility(8);
                            } else {
                                imageView.setVisibility(0);
                                boolean q6 = org.telegram.ui.ActionBar.g6.I.q();
                                org.telegram.ui.Components.bb0 bb0Var = new org.telegram.ui.Components.bb0(1);
                                bb0Var.b(i12, i13);
                                bb0Var.b = q6;
                                imageView.setBackground(bb0Var);
                                imageView.setImageResource(i14);
                            }
                            guVar.b.setText(charSequence);
                            guVar.d.setText(charSequence2);
                            guVar.e = z10;
                            guVar.setWillNotDraw(!z10);
                            int i16 = iuVar.h;
                            if (i16 >= 0) {
                                mu[] muVarArr = nuVar.c3;
                                if (i16 >= muVarArr.length || muVarArr[i16].c > 0) {
                                    bool = Boolean.valueOf(nuVar.e3[i16]);
                                    ImageView imageView2 = guVar.c;
                                    if (bool == null) {
                                        imageView2.setVisibility(0);
                                        imageView2.animate().rotation(bool.booleanValue() ? 0.0f : 180.0f).setDuration(360L).setInterpolator(org.telegram.ui.Components.er.h).start();
                                        break;
                                    } else {
                                        imageView2.setVisibility(8);
                                        break;
                                    }
                                }
                            }
                            bool = null;
                            ImageView imageView22 = guVar.c;
                            if (bool == null) {
                            }
                        }
                    } else {
                        ((qu) view).a.setText(iuVar.f);
                        break;
                    }
                } else {
                    org.telegram.ui.Components.sc scVar = (org.telegram.ui.Components.sc) view;
                    if (nuVar.c3 != null) {
                        scVar.f(nuVar.f3, nuVar.T2, nuVar.d3);
                    }
                    nuVar.T2 = false;
                    break;
                }
                break;
            default:
                ArrayList arrayList2 = ((xb0) this.e).s;
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    rb0 rb0Var = (rb0) arrayList2.get(i10);
                    int i17 = o1Var.f;
                    View view2 = o1Var.a;
                    if (i17 != 0) {
                        if (i17 != 1) {
                            if (i17 != 2) {
                                if (i17 != 3 && i17 != 4) {
                                    if (i17 == 5) {
                                        org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view2;
                                        if (rb0Var.f == 1) {
                                            l8Var.j(rb0Var.c, MessagesController.getGlobalMainSettings().getBoolean("view_animations", true), false);
                                            break;
                                        }
                                    }
                                } else {
                                    int i18 = i10 + 1;
                                    boolean z11 = i18 < arrayList2.size() && ((rb0) arrayList2.get(i18)).a != 2;
                                    wb0 wb0Var = (wb0) view2;
                                    Switch r32 = wb0Var.f;
                                    ImageView imageView3 = wb0Var.e;
                                    org.telegram.ui.Components.j6 j6Var = wb0Var.d;
                                    ImageView imageView4 = wb0Var.a;
                                    org.telegram.ui.Components.bp bpVar = wb0Var.h;
                                    cg.q qVar = wb0Var.c;
                                    int i19 = rb0Var.a;
                                    CharSequence charSequence3 = rb0Var.c;
                                    int i20 = rb0Var.e;
                                    if (i19 == 3) {
                                        bpVar.setVisibility(8);
                                        imageView4.setVisibility(0);
                                        imageView4.setImageResource(rb0Var.d);
                                        qVar.setText(charSequence3);
                                        boolean z12 = Integer.bitCount(i20) > 1;
                                        wb0Var.v = z12;
                                        if (z12) {
                                            wb0Var.c(rb0Var, false);
                                            j6Var.setVisibility(0);
                                            imageView3.setVisibility(0);
                                        } else {
                                            j6Var.setVisibility(8);
                                            imageView3.setVisibility(8);
                                        }
                                        qVar.setTranslationX(0.0f);
                                        r32.setVisibility(0);
                                        r32.c(LiteMode.isEnabled(i20), false);
                                        wb0Var.r = Integer.bitCount(i20) > 1;
                                    } else {
                                        bpVar.setVisibility(0);
                                        bpVar.a(LiteMode.isEnabled(i20), false);
                                        imageView4.setVisibility(8);
                                        r32.setVisibility(8);
                                        j6Var.setVisibility(8);
                                        imageView3.setVisibility(8);
                                        qVar.setText(charSequence3);
                                        qVar.setTranslationX(AndroidUtilities.dp(41.0f) * (LocaleController.isRTL ? -2.2f : 1.0f));
                                        wb0Var.v = false;
                                        wb0Var.r = false;
                                    }
                                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) wb0Var.b.getLayoutParams();
                                    if (rb0Var.a == 3) {
                                        f10 = (LocaleController.isRTL ? 64 : 75) + 4;
                                    } else {
                                        f10 = 8.0f;
                                    }
                                    marginLayoutParams.rightMargin = AndroidUtilities.dp(f10);
                                    wb0Var.n = z11;
                                    wb0Var.setWillNotDraw((z11 || wb0Var.r) ? false : true);
                                    wb0Var.b(LiteMode.isPowerSaverApplied(), false);
                                    break;
                                }
                            } else {
                                org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view2;
                                CharSequence charSequence4 = rb0Var.c;
                                if (TextUtils.isEmpty(charSequence4)) {
                                    x8Var.setFixedSize(12);
                                } else {
                                    x8Var.setFixedSize(0);
                                }
                                x8Var.setText(charSequence4);
                                x8Var.setContentDescription(charSequence4);
                                x8Var.setBackground(null);
                                break;
                            }
                        } else {
                            ((vb0) view2).a();
                            break;
                        }
                    } else {
                        ((org.telegram.ui.Cells.j4) view2).setText(rb0Var.c);
                        break;
                    }
                }
                break;
        }
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View view;
        int i11 = this.d;
        View view2 = null;
        Object obj = this.e;
        switch (i11) {
            case 0:
                nu nuVar = (nu) obj;
                ru ruVar = nuVar.k3;
                org.telegram.ui.ActionBar.c6 c6Var = nuVar.l2;
                if (i10 == 0) {
                    Context context = nuVar.getContext();
                    int[] iArr = ru.e;
                    ku kuVar = new ku(this, context, iArr.length, iArr, ru.f);
                    nuVar.j3 = kuVar;
                    kuVar.setInterceptTouch(false);
                    View view3 = nuVar.j3;
                    view3.setTag(-33024);
                    view = view3;
                } else if (i10 == 1) {
                    Context context2 = nuVar.getContext();
                    qu quVar = new qu(context2);
                    TextView textView = new TextView(context2);
                    quVar.a = textView;
                    textView.setGravity(17);
                    textView.setTextSize(1, 13.0f);
                    textView.setTextColor(ruVar.getThemedColor(org.telegram.ui.ActionBar.g6.y6));
                    quVar.addView(textView, h7.z5.d(-1, -2.0f, 119, 24.0f, 0.0f, 24.0f, 14.0f));
                    quVar.setTag(-33024);
                    view = quVar;
                } else if (i10 == 3) {
                    view = new org.telegram.ui.Cells.x8(nuVar.getContext());
                } else if (i10 == 4) {
                    View j4Var = new org.telegram.ui.Cells.j4(nuVar.getContext());
                    j4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d6, c6Var));
                    view = j4Var;
                } else if (i10 == 5) {
                    org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(nuVar.getContext());
                    l8Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.p7, c6Var));
                    l8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d6, c6Var));
                    view = l8Var;
                } else if (i10 == 6) {
                    pu puVar = new pu(nuVar.getContext());
                    puVar.a = new Path();
                    Paint paint = new Paint(1);
                    puVar.b = paint;
                    puVar.c = true;
                    paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(-0.66f), 251658240);
                    paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
                    view = puVar;
                } else if (i10 != 7) {
                    view = new gu(ruVar, nuVar.getContext());
                } else {
                    View zmVar = new org.telegram.ui.Components.zm(nuVar.getContext(), 13);
                    int i12 = org.telegram.ui.ActionBar.g6.d6;
                    int i13 = nu.l3;
                    zmVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(i12, nuVar.l2));
                    view = zmVar;
                }
                return new org.telegram.ui.Components.lk0(view);
            default:
                xb0 xb0Var = (xb0) obj;
                Context context3 = viewGroup.getContext();
                if (i10 == 0) {
                    view2 = new org.telegram.ui.Cells.j4(context3);
                } else if (i10 == 1) {
                    view2 = new vb0(xb0Var, context3);
                } else if (i10 == 2) {
                    view2 = new qb0(context3);
                } else if (i10 == 3 || i10 == 4) {
                    view2 = new wb0(xb0Var, context3);
                } else if (i10 == 5) {
                    view2 = new org.telegram.ui.Cells.l8(23, context3, null, false, true);
                }
                return new org.telegram.ui.Components.lk0(view2);
        }
    }
}
