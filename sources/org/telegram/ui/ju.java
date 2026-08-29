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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ju extends zf.b {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ju(Object obj, int i10) {
        this.d = i10;
        this.e = obj;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        switch (this.d) {
            case 0:
                gu guVar = (gu) ((lu) this.e).Y2.get(n1Var.b());
                int i10 = guVar.a;
                if (i10 == 5 || (i10 == 2 && guVar.h != -1)) {
                }
                break;
            default:
                int i11 = n1Var.f;
                if (i11 == 4 || i11 == 3 || i11 == 5) {
                }
                break;
        }
        return true;
    }

    @Override // f2.p0
    public final int h() {
        switch (this.d) {
            case 0:
                return ((lu) this.e).Y2.size();
            default:
                return ((ub0) this.e).s.size();
        }
    }

    @Override // f2.p0
    public final int j(int i10) {
        switch (this.d) {
            case 0:
                return ((gu) ((lu) this.e).Y2.get(i10)).a;
            default:
                ub0 ub0Var = (ub0) this.e;
                if (i10 < 0 || i10 >= ub0Var.s.size()) {
                    return 2;
                }
                return ((ob0) ub0Var.s.get(i10)).a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0218  */
    @Override // f2.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.n1 n1Var, int i10) {
        Boolean bool;
        float f9;
        switch (this.d) {
            case 0:
                lu luVar = (lu) this.e;
                ArrayList arrayList = luVar.Y2;
                int b10 = n1Var.b();
                View view = n1Var.a;
                gu guVar = (gu) arrayList.get(b10);
                int i11 = n1Var.f;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 != 4) {
                                    if (i11 != 5) {
                                        if (i11 == 6) {
                                            ((nu) view).setTop(true);
                                            break;
                                        }
                                    } else {
                                        ((org.telegram.ui.Cells.m8) view).i(guVar.f.toString(), false);
                                        break;
                                    }
                                } else {
                                    ((org.telegram.ui.Cells.k4) view).setText(guVar.f);
                                    break;
                                }
                            } else {
                                ((org.telegram.ui.Cells.y8) view).setText(guVar.f);
                                break;
                            }
                        } else {
                            eu euVar = (eu) view;
                            int i12 = guVar.d;
                            int i13 = guVar.e;
                            int i14 = guVar.c;
                            CharSequence charSequence = guVar.f;
                            CharSequence charSequence2 = guVar.g;
                            int i15 = i10 + 1;
                            boolean z10 = i15 < h() && ((gu) arrayList.get(i15)).a == i11;
                            ImageView imageView = euVar.a;
                            if (i14 == 0) {
                                imageView.setVisibility(8);
                            } else {
                                imageView.setVisibility(0);
                                boolean q6 = org.telegram.ui.ActionBar.g6.I.q();
                                org.telegram.ui.Components.mb0 mb0Var = new org.telegram.ui.Components.mb0(1);
                                mb0Var.b(i12, i13);
                                mb0Var.b = q6;
                                imageView.setBackground(mb0Var);
                                imageView.setImageResource(i14);
                            }
                            euVar.b.setText(charSequence);
                            euVar.d.setText(charSequence2);
                            euVar.e = z10;
                            euVar.setWillNotDraw(!z10);
                            int i16 = guVar.h;
                            if (i16 >= 0) {
                                ku[] kuVarArr = luVar.c3;
                                if (i16 >= kuVarArr.length || kuVarArr[i16].c > 0) {
                                    bool = Boolean.valueOf(luVar.e3[i16]);
                                    ImageView imageView2 = euVar.c;
                                    if (bool == null) {
                                        imageView2.setVisibility(0);
                                        imageView2.animate().rotation(bool.booleanValue() ? 0.0f : 180.0f).setDuration(360L).setInterpolator(org.telegram.ui.Components.jr.h).start();
                                        break;
                                    } else {
                                        imageView2.setVisibility(8);
                                        break;
                                    }
                                }
                            }
                            bool = null;
                            ImageView imageView22 = euVar.c;
                            if (bool == null) {
                            }
                        }
                    } else {
                        ((ou) view).a.setText(guVar.f);
                        break;
                    }
                } else {
                    org.telegram.ui.Components.zc zcVar = (org.telegram.ui.Components.zc) view;
                    if (luVar.c3 != null) {
                        zcVar.f(luVar.f3, luVar.T2, luVar.d3);
                    }
                    luVar.T2 = false;
                    break;
                }
                break;
            default:
                ArrayList arrayList2 = ((ub0) this.e).s;
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    ob0 ob0Var = (ob0) arrayList2.get(i10);
                    int i17 = n1Var.f;
                    View view2 = n1Var.a;
                    if (i17 != 0) {
                        if (i17 != 1) {
                            if (i17 != 2) {
                                if (i17 != 3 && i17 != 4) {
                                    if (i17 == 5) {
                                        org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view2;
                                        if (ob0Var.f == 1) {
                                            m8Var.j(ob0Var.c, MessagesController.getGlobalMainSettings().getBoolean("view_animations", true), false);
                                            break;
                                        }
                                    }
                                } else {
                                    int i18 = i10 + 1;
                                    boolean z11 = i18 < arrayList2.size() && ((ob0) arrayList2.get(i18)).a != 2;
                                    tb0 tb0Var = (tb0) view2;
                                    Switch r32 = tb0Var.f;
                                    ImageView imageView3 = tb0Var.e;
                                    org.telegram.ui.Components.o6 o6Var = tb0Var.d;
                                    ImageView imageView4 = tb0Var.a;
                                    org.telegram.ui.Components.hp hpVar = tb0Var.h;
                                    eg.r rVar = tb0Var.c;
                                    int i19 = ob0Var.a;
                                    CharSequence charSequence3 = ob0Var.c;
                                    int i20 = ob0Var.e;
                                    if (i19 == 3) {
                                        hpVar.setVisibility(8);
                                        imageView4.setVisibility(0);
                                        imageView4.setImageResource(ob0Var.d);
                                        rVar.setText(charSequence3);
                                        boolean z12 = Integer.bitCount(i20) > 1;
                                        tb0Var.v = z12;
                                        if (z12) {
                                            tb0Var.c(ob0Var, false);
                                            o6Var.setVisibility(0);
                                            imageView3.setVisibility(0);
                                        } else {
                                            o6Var.setVisibility(8);
                                            imageView3.setVisibility(8);
                                        }
                                        rVar.setTranslationX(0.0f);
                                        r32.setVisibility(0);
                                        r32.c(LiteMode.isEnabled(i20), false);
                                        tb0Var.r = Integer.bitCount(i20) > 1;
                                    } else {
                                        hpVar.setVisibility(0);
                                        hpVar.a(LiteMode.isEnabled(i20), false);
                                        imageView4.setVisibility(8);
                                        r32.setVisibility(8);
                                        o6Var.setVisibility(8);
                                        imageView3.setVisibility(8);
                                        rVar.setText(charSequence3);
                                        rVar.setTranslationX(AndroidUtilities.dp(41.0f) * (LocaleController.isRTL ? -2.2f : 1.0f));
                                        tb0Var.v = false;
                                        tb0Var.r = false;
                                    }
                                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) tb0Var.b.getLayoutParams();
                                    if (ob0Var.a == 3) {
                                        f9 = (LocaleController.isRTL ? 64 : 75) + 4;
                                    } else {
                                        f9 = 8.0f;
                                    }
                                    marginLayoutParams.rightMargin = AndroidUtilities.dp(f9);
                                    tb0Var.n = z11;
                                    tb0Var.setWillNotDraw((z11 || tb0Var.r) ? false : true);
                                    tb0Var.b(LiteMode.isPowerSaverApplied(), false);
                                    break;
                                }
                            } else {
                                org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view2;
                                CharSequence charSequence4 = ob0Var.c;
                                if (TextUtils.isEmpty(charSequence4)) {
                                    y8Var.setFixedSize(12);
                                } else {
                                    y8Var.setFixedSize(0);
                                }
                                y8Var.setText(charSequence4);
                                y8Var.setContentDescription(charSequence4);
                                y8Var.setBackground(null);
                                break;
                            }
                        } else {
                            ((sb0) view2).a();
                            break;
                        }
                    } else {
                        ((org.telegram.ui.Cells.k4) view2).setText(ob0Var.c);
                        break;
                    }
                }
                break;
        }
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View view;
        int i11 = this.d;
        View view2 = null;
        Object obj = this.e;
        switch (i11) {
            case 0:
                lu luVar = (lu) obj;
                pu puVar = luVar.k3;
                org.telegram.ui.ActionBar.c6 c6Var = luVar.l2;
                if (i10 == 0) {
                    Context context = luVar.getContext();
                    int[] iArr = pu.e;
                    iu iuVar = new iu(this, context, iArr.length, iArr, pu.f);
                    luVar.j3 = iuVar;
                    iuVar.setInterceptTouch(false);
                    View view3 = luVar.j3;
                    view3.setTag(-33024);
                    view = view3;
                } else if (i10 == 1) {
                    Context context2 = luVar.getContext();
                    ou ouVar = new ou(context2);
                    TextView textView = new TextView(context2);
                    ouVar.a = textView;
                    textView.setGravity(17);
                    textView.setTextSize(1, 13.0f);
                    textView.setTextColor(puVar.getThemedColor(org.telegram.ui.ActionBar.g6.y6));
                    ouVar.addView(textView, i7.f6.d(-1, -2.0f, 119, 24.0f, 0.0f, 24.0f, 14.0f));
                    ouVar.setTag(-33024);
                    view = ouVar;
                } else if (i10 == 3) {
                    view = new org.telegram.ui.Cells.y8(luVar.getContext());
                } else if (i10 == 4) {
                    View k4Var = new org.telegram.ui.Cells.k4(luVar.getContext());
                    k4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d6, c6Var));
                    view = k4Var;
                } else if (i10 == 5) {
                    org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(luVar.getContext());
                    m8Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.p7, c6Var));
                    m8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d6, c6Var));
                    view = m8Var;
                } else if (i10 == 6) {
                    nu nuVar = new nu(luVar.getContext());
                    nuVar.a = new Path();
                    Paint paint = new Paint(1);
                    nuVar.b = paint;
                    nuVar.c = true;
                    paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(-0.66f), 251658240);
                    paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
                    view = nuVar;
                } else if (i10 != 7) {
                    view = new eu(puVar, luVar.getContext());
                } else {
                    View fnVar = new org.telegram.ui.Components.fn(luVar.getContext(), 12);
                    int i12 = org.telegram.ui.ActionBar.g6.d6;
                    int i13 = lu.l3;
                    fnVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(i12, luVar.l2));
                    view = fnVar;
                }
                return new org.telegram.ui.Components.vk0(view);
            default:
                ub0 ub0Var = (ub0) obj;
                Context context3 = viewGroup.getContext();
                if (i10 == 0) {
                    view2 = new org.telegram.ui.Cells.k4(context3);
                } else if (i10 == 1) {
                    view2 = new sb0(ub0Var, context3);
                } else if (i10 == 2) {
                    view2 = new nb0(context3);
                } else if (i10 == 3 || i10 == 4) {
                    view2 = new tb0(ub0Var, context3);
                } else if (i10 == 5) {
                    view2 = new org.telegram.ui.Cells.m8(23, context3, null, false, true);
                }
                return new org.telegram.ui.Components.vk0(view2);
        }
    }
}
