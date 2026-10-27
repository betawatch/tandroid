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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class hu extends qg.b {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ hu(Object obj, int i10) {
        this.d = i10;
        this.e = obj;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        switch (this.d) {
            case 0:
                eu euVar = (eu) ((ju) this.e).k3.get(e1Var.b());
                int i10 = euVar.a;
                if (i10 == 5 || (i10 == 2 && euVar.h != -1)) {
                }
                break;
            default:
                int i11 = e1Var.f;
                if (i11 == 4 || i11 == 3 || i11 == 5) {
                }
                break;
        }
        return true;
    }

    @Override // s4.h0
    public final int h() {
        switch (this.d) {
            case 0:
                return ((ju) this.e).k3.size();
            default:
                return ((wb0) this.e).s.size();
        }
    }

    @Override // s4.h0
    public final int j(int i10) {
        switch (this.d) {
            case 0:
                return ((eu) ((ju) this.e).k3.get(i10)).a;
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
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.e1 e1Var, int i10) {
        Boolean bool;
        boolean z10;
        float f7;
        switch (this.d) {
            case 0:
                ju juVar = (ju) this.e;
                ArrayList arrayList = juVar.k3;
                int b10 = e1Var.b();
                View view = e1Var.a;
                eu euVar = (eu) arrayList.get(b10);
                int i11 = e1Var.f;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 != 4) {
                                    if (i11 != 5) {
                                        if (i11 == 6) {
                                            ((lu) view).setTop(true);
                                            break;
                                        }
                                    } else {
                                        ((org.telegram.ui.Cells.v8) view).k(euVar.f.toString(), false);
                                        break;
                                    }
                                } else {
                                    ((org.telegram.ui.Cells.q4) view).setText(euVar.f);
                                    break;
                                }
                            } else {
                                ((org.telegram.ui.Cells.i9) view).setText(euVar.f);
                                break;
                            }
                        } else {
                            cu cuVar = (cu) view;
                            int i12 = euVar.d;
                            int i13 = euVar.e;
                            int i14 = euVar.c;
                            CharSequence charSequence = euVar.f;
                            CharSequence charSequence2 = euVar.g;
                            int i15 = i10 + 1;
                            boolean z11 = i15 < h() && ((eu) arrayList.get(i15)).a == i11;
                            ImageView imageView = cuVar.a;
                            if (i14 == 0) {
                                imageView.setVisibility(8);
                            } else {
                                imageView.setVisibility(0);
                                boolean q5 = org.telegram.ui.ActionBar.y6.I.q();
                                org.telegram.ui.Components.jc0 jc0Var = new org.telegram.ui.Components.jc0(1);
                                jc0Var.b(i12, i13);
                                jc0Var.b = q5;
                                imageView.setBackground(jc0Var);
                                imageView.setImageResource(i14);
                            }
                            cuVar.b.setText(charSequence);
                            cuVar.d.setText(charSequence2);
                            cuVar.e = z11;
                            cuVar.setWillNotDraw(!z11);
                            int i16 = euVar.h;
                            if (i16 >= 0) {
                                iu[] iuVarArr = juVar.o3;
                                if (i16 >= iuVarArr.length || iuVarArr[i16].c > 0) {
                                    bool = Boolean.valueOf(juVar.q3[i16]);
                                    ImageView imageView2 = cuVar.c;
                                    if (bool == null) {
                                        imageView2.setVisibility(0);
                                        imageView2.animate().rotation(bool.booleanValue() ? 0.0f : 180.0f).setDuration(360L).setInterpolator(org.telegram.ui.Components.ds.h).start();
                                        break;
                                    } else {
                                        imageView2.setVisibility(8);
                                        break;
                                    }
                                }
                            }
                            bool = null;
                            ImageView imageView22 = cuVar.c;
                            if (bool == null) {
                            }
                        }
                    } else {
                        ((mu) view).a.setText(euVar.f);
                        break;
                    }
                } else {
                    org.telegram.ui.Components.cd cdVar = (org.telegram.ui.Components.cd) view;
                    if (juVar.o3 != null) {
                        cdVar.f(juVar.r3, juVar.f3, juVar.p3);
                    }
                    juVar.f3 = false;
                    break;
                }
                break;
            default:
                ArrayList arrayList2 = ((wb0) this.e).s;
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    qb0 qb0Var = (qb0) arrayList2.get(i10);
                    int i17 = e1Var.f;
                    View view2 = e1Var.a;
                    if (i17 != 0) {
                        if (i17 != 1) {
                            if (i17 != 2) {
                                if (i17 != 3 && i17 != 4) {
                                    if (i17 == 5) {
                                        org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view2;
                                        if (qb0Var.f == 1) {
                                            v8Var.l(qb0Var.c, MessagesController.getGlobalMainSettings().getBoolean("view_animations", true), false);
                                            break;
                                        }
                                    }
                                } else {
                                    int i18 = i10 + 1;
                                    boolean z12 = i18 < arrayList2.size() && ((qb0) arrayList2.get(i18)).a != 2;
                                    vb0 vb0Var = (vb0) view2;
                                    Switch r32 = vb0Var.f;
                                    ImageView imageView3 = vb0Var.e;
                                    org.telegram.ui.Components.s6 s6Var = vb0Var.d;
                                    ImageView imageView4 = vb0Var.a;
                                    org.telegram.ui.Components.aq aqVar = vb0Var.h;
                                    bi.md mdVar = vb0Var.c;
                                    int i19 = qb0Var.a;
                                    CharSequence charSequence3 = qb0Var.c;
                                    int i20 = qb0Var.e;
                                    if (i19 == 3) {
                                        aqVar.setVisibility(8);
                                        imageView4.setVisibility(0);
                                        imageView4.setImageResource(qb0Var.d);
                                        mdVar.setText(charSequence3);
                                        boolean z13 = Integer.bitCount(i20) > 1;
                                        vb0Var.v = z13;
                                        if (z13) {
                                            vb0Var.c(qb0Var, false);
                                            s6Var.setVisibility(0);
                                            imageView3.setVisibility(0);
                                        } else {
                                            s6Var.setVisibility(8);
                                            imageView3.setVisibility(8);
                                        }
                                        mdVar.setTranslationX(0.0f);
                                        r32.setVisibility(0);
                                        r32.c(LiteMode.isEnabled(i20), false);
                                        z10 = true;
                                        vb0Var.r = Integer.bitCount(i20) > 1;
                                    } else {
                                        z10 = true;
                                        aqVar.setVisibility(0);
                                        aqVar.a(LiteMode.isEnabled(i20), false);
                                        imageView4.setVisibility(8);
                                        r32.setVisibility(8);
                                        s6Var.setVisibility(8);
                                        imageView3.setVisibility(8);
                                        mdVar.setText(charSequence3);
                                        mdVar.setTranslationX(AndroidUtilities.dp(41.0f) * (LocaleController.isRTL ? -2.2f : 1.0f));
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
                                org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) view2;
                                CharSequence charSequence4 = qb0Var.c;
                                if (TextUtils.isEmpty(charSequence4)) {
                                    i9Var.setFixedSize(12);
                                } else {
                                    i9Var.setFixedSize(0);
                                }
                                i9Var.setText(charSequence4);
                                i9Var.setContentDescription(charSequence4);
                                i9Var.setBackground(null);
                                break;
                            }
                        } else {
                            ((ub0) view2).a();
                            break;
                        }
                    } else {
                        ((org.telegram.ui.Cells.q4) view2).setText(qb0Var.c);
                        break;
                    }
                }
                break;
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View view;
        int i11 = this.d;
        View view2 = null;
        Object obj = this.e;
        switch (i11) {
            case 0:
                ju juVar = (ju) obj;
                org.telegram.ui.ActionBar.u6 u6Var = juVar.n2;
                if (i10 == 0) {
                    Context context = juVar.getContext();
                    int[] iArr = nu.s;
                    gu guVar = new gu(this, context, iArr.length, iArr, nu.v);
                    juVar.v3 = guVar;
                    guVar.setInterceptTouch(false);
                    View view3 = juVar.v3;
                    view3.setTag(-33024);
                    view = view3;
                } else if (i10 == 1) {
                    Context context2 = juVar.getContext();
                    mu muVar = new mu(context2);
                    TextView textView = new TextView(context2);
                    muVar.a = textView;
                    textView.setGravity(17);
                    textView.setTextSize(1, 13.0f);
                    org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.y6, null);
                    muVar.addView(textView, org.telegram.ui.Components.kb1.h(-1, -2.0f, 119, 24.0f, 0.0f, 24.0f, 14.0f));
                    muVar.setTag(-33024);
                    view = muVar;
                } else if (i10 == 3) {
                    view = new org.telegram.ui.Cells.i9(juVar.getContext());
                } else if (i10 == 4) {
                    View q4Var = new org.telegram.ui.Cells.q4(juVar.getContext());
                    org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, q4Var, u6Var);
                    view = q4Var;
                } else if (i10 == 5) {
                    org.telegram.ui.Cells.v8 v8Var = new org.telegram.ui.Cells.v8(juVar.getContext());
                    org.telegram.ui.ActionBar.f7.Y(v8Var.getTextView(), org.telegram.ui.ActionBar.y6.p7, u6Var);
                    org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, v8Var, u6Var);
                    view = v8Var;
                } else if (i10 == 6) {
                    lu luVar = new lu(juVar.getContext());
                    luVar.a = new Path();
                    Paint paint = new Paint(1);
                    luVar.b = paint;
                    luVar.c = true;
                    paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(-0.66f), 251658240);
                    paint.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.d6, false));
                    view = luVar;
                } else if (i10 != 7) {
                    view = new cu(juVar.w3, juVar.getContext());
                } else {
                    View vnVar = new org.telegram.ui.Components.vn(juVar.getContext(), 14);
                    int i12 = org.telegram.ui.ActionBar.y6.d6;
                    int i13 = ju.x3;
                    org.telegram.ui.ActionBar.f7.i(i12, vnVar, juVar.n2);
                    view = vnVar;
                }
                return new org.telegram.ui.Components.wl0(view);
            default:
                wb0 wb0Var = (wb0) obj;
                Context context3 = viewGroup.getContext();
                if (i10 == 0) {
                    view2 = new org.telegram.ui.Cells.q4(context3);
                } else if (i10 == 1) {
                    view2 = new ub0(wb0Var, context3);
                } else if (i10 == 2) {
                    view2 = new pb0(context3);
                } else if (i10 == 3 || i10 == 4) {
                    view2 = new vb0(wb0Var, context3);
                } else if (i10 == 5) {
                    view2 = new org.telegram.ui.Cells.v8(23, context3, null, false, true);
                }
                return new org.telegram.ui.Components.wl0(view2);
        }
    }
}
