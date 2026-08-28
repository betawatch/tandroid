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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class iu extends wf.b {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ iu(Object obj, int i9) {
        this.d = i9;
        this.e = obj;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        switch (this.d) {
            case 0:
                fu fuVar = (fu) ((ku) this.e).Y2.get(q1Var.b());
                int i9 = fuVar.a;
                if (i9 == 5 || (i9 == 2 && fuVar.h != -1)) {
                }
                break;
            default:
                int i10 = q1Var.f;
                if (i10 == 4 || i10 == 3 || i10 == 5) {
                }
                break;
        }
        return true;
    }

    @Override // f2.r0
    public final int h() {
        switch (this.d) {
            case 0:
                return ((ku) this.e).Y2.size();
            default:
                return ((sb0) this.e).s.size();
        }
    }

    @Override // f2.r0
    public final int j(int i9) {
        switch (this.d) {
            case 0:
                return ((fu) ((ku) this.e).Y2.get(i9)).a;
            default:
                sb0 sb0Var = (sb0) this.e;
                if (i9 < 0 || i9 >= sb0Var.s.size()) {
                    return 2;
                }
                return ((mb0) sb0Var.s.get(i9)).a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0218  */
    @Override // f2.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.q1 q1Var, int i9) {
        Boolean bool;
        float f10;
        switch (this.d) {
            case 0:
                ku kuVar = (ku) this.e;
                ArrayList arrayList = kuVar.Y2;
                int b10 = q1Var.b();
                View view = q1Var.a;
                fu fuVar = (fu) arrayList.get(b10);
                int i10 = q1Var.f;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 != 4) {
                                    if (i10 != 5) {
                                        if (i10 == 6) {
                                            ((mu) view).setTop(true);
                                            break;
                                        }
                                    } else {
                                        ((org.telegram.ui.Cells.p8) view).i(fuVar.f.toString(), false);
                                        break;
                                    }
                                } else {
                                    ((org.telegram.ui.Cells.m4) view).setText(fuVar.f);
                                    break;
                                }
                            } else {
                                ((org.telegram.ui.Cells.b9) view).setText(fuVar.f);
                                break;
                            }
                        } else {
                            du duVar = (du) view;
                            int i11 = fuVar.d;
                            int i12 = fuVar.e;
                            int i13 = fuVar.c;
                            CharSequence charSequence = fuVar.f;
                            CharSequence charSequence2 = fuVar.g;
                            int i14 = i9 + 1;
                            boolean z10 = i14 < h() && ((fu) arrayList.get(i14)).a == i10;
                            ImageView imageView = duVar.a;
                            if (i13 == 0) {
                                imageView.setVisibility(8);
                            } else {
                                imageView.setVisibility(0);
                                boolean q10 = org.telegram.ui.ActionBar.f6.I.q();
                                org.telegram.ui.Components.xa0 xa0Var = new org.telegram.ui.Components.xa0(1);
                                xa0Var.b(i11, i12);
                                xa0Var.b = q10;
                                imageView.setBackground(xa0Var);
                                imageView.setImageResource(i13);
                            }
                            duVar.b.setText(charSequence);
                            duVar.d.setText(charSequence2);
                            duVar.e = z10;
                            duVar.setWillNotDraw(!z10);
                            int i15 = fuVar.h;
                            if (i15 >= 0) {
                                ju[] juVarArr = kuVar.c3;
                                if (i15 >= juVarArr.length || juVarArr[i15].c > 0) {
                                    bool = Boolean.valueOf(kuVar.e3[i15]);
                                    ImageView imageView2 = duVar.c;
                                    if (bool == null) {
                                        imageView2.setVisibility(0);
                                        imageView2.animate().rotation(bool.booleanValue() ? 0.0f : 180.0f).setDuration(360L).setInterpolator(org.telegram.ui.Components.gr.h).start();
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
                    org.telegram.ui.Components.uc ucVar = (org.telegram.ui.Components.uc) view;
                    if (kuVar.c3 != null) {
                        ucVar.f(kuVar.f3, kuVar.T2, kuVar.d3);
                    }
                    kuVar.T2 = false;
                    break;
                }
                break;
            default:
                ArrayList arrayList2 = ((sb0) this.e).s;
                if (i9 >= 0 && i9 < arrayList2.size()) {
                    mb0 mb0Var = (mb0) arrayList2.get(i9);
                    int i16 = q1Var.f;
                    View view2 = q1Var.a;
                    if (i16 != 0) {
                        if (i16 != 1) {
                            if (i16 != 2) {
                                if (i16 != 3 && i16 != 4) {
                                    if (i16 == 5) {
                                        org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view2;
                                        if (mb0Var.f == 1) {
                                            p8Var.j(mb0Var.c, MessagesController.getGlobalMainSettings().getBoolean("view_animations", true), false);
                                            break;
                                        }
                                    }
                                } else {
                                    int i17 = i9 + 1;
                                    boolean z11 = i17 < arrayList2.size() && ((mb0) arrayList2.get(i17)).a != 2;
                                    rb0 rb0Var = (rb0) view2;
                                    Switch r32 = rb0Var.f;
                                    ImageView imageView3 = rb0Var.e;
                                    org.telegram.ui.Components.j6 j6Var = rb0Var.d;
                                    ImageView imageView4 = rb0Var.a;
                                    org.telegram.ui.Components.dp dpVar = rb0Var.h;
                                    bg.t tVar = rb0Var.c;
                                    int i18 = mb0Var.a;
                                    CharSequence charSequence3 = mb0Var.c;
                                    int i19 = mb0Var.e;
                                    if (i18 == 3) {
                                        dpVar.setVisibility(8);
                                        imageView4.setVisibility(0);
                                        imageView4.setImageResource(mb0Var.d);
                                        tVar.setText(charSequence3);
                                        boolean z12 = Integer.bitCount(i19) > 1;
                                        rb0Var.v = z12;
                                        if (z12) {
                                            rb0Var.c(mb0Var, false);
                                            j6Var.setVisibility(0);
                                            imageView3.setVisibility(0);
                                        } else {
                                            j6Var.setVisibility(8);
                                            imageView3.setVisibility(8);
                                        }
                                        tVar.setTranslationX(0.0f);
                                        r32.setVisibility(0);
                                        r32.c(LiteMode.isEnabled(i19), false);
                                        rb0Var.r = Integer.bitCount(i19) > 1;
                                    } else {
                                        dpVar.setVisibility(0);
                                        dpVar.a(LiteMode.isEnabled(i19), false);
                                        imageView4.setVisibility(8);
                                        r32.setVisibility(8);
                                        j6Var.setVisibility(8);
                                        imageView3.setVisibility(8);
                                        tVar.setText(charSequence3);
                                        tVar.setTranslationX(AndroidUtilities.dp(41.0f) * (LocaleController.isRTL ? -2.2f : 1.0f));
                                        rb0Var.v = false;
                                        rb0Var.r = false;
                                    }
                                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) rb0Var.b.getLayoutParams();
                                    if (mb0Var.a == 3) {
                                        f10 = (LocaleController.isRTL ? 64 : 75) + 4;
                                    } else {
                                        f10 = 8.0f;
                                    }
                                    marginLayoutParams.rightMargin = AndroidUtilities.dp(f10);
                                    rb0Var.n = z11;
                                    rb0Var.setWillNotDraw((z11 || rb0Var.r) ? false : true);
                                    rb0Var.b(LiteMode.isPowerSaverApplied(), false);
                                    break;
                                }
                            } else {
                                org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view2;
                                CharSequence charSequence4 = mb0Var.c;
                                if (TextUtils.isEmpty(charSequence4)) {
                                    b9Var.setFixedSize(12);
                                } else {
                                    b9Var.setFixedSize(0);
                                }
                                b9Var.setText(charSequence4);
                                b9Var.setContentDescription(charSequence4);
                                b9Var.setBackground(null);
                                break;
                            }
                        } else {
                            ((qb0) view2).a();
                            break;
                        }
                    } else {
                        ((org.telegram.ui.Cells.m4) view2).setText(mb0Var.c);
                        break;
                    }
                }
                break;
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View view;
        int i10 = this.d;
        View view2 = null;
        Object obj = this.e;
        switch (i10) {
            case 0:
                ku kuVar = (ku) obj;
                ou ouVar = kuVar.k3;
                org.telegram.ui.ActionBar.b6 b6Var = kuVar.l2;
                if (i9 == 0) {
                    Context context = kuVar.getContext();
                    int[] iArr = ou.e;
                    hu huVar = new hu(this, context, iArr.length, iArr, ou.f);
                    kuVar.j3 = huVar;
                    huVar.setInterceptTouch(false);
                    View view3 = kuVar.j3;
                    view3.setTag(-33024);
                    view = view3;
                } else if (i9 == 1) {
                    Context context2 = kuVar.getContext();
                    nu nuVar = new nu(context2);
                    TextView textView = new TextView(context2);
                    nuVar.a = textView;
                    textView.setGravity(17);
                    textView.setTextSize(1, 13.0f);
                    textView.setTextColor(ouVar.getThemedColor(org.telegram.ui.ActionBar.f6.y6));
                    nuVar.addView(textView, g7.e6.d(-1, -2.0f, 119, 24.0f, 0.0f, 24.0f, 14.0f));
                    nuVar.setTag(-33024);
                    view = nuVar;
                } else if (i9 == 3) {
                    view = new org.telegram.ui.Cells.b9(kuVar.getContext());
                } else if (i9 == 4) {
                    View m4Var = new org.telegram.ui.Cells.m4(kuVar.getContext());
                    m4Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.d6, b6Var));
                    view = m4Var;
                } else if (i9 == 5) {
                    org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(kuVar.getContext());
                    p8Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.p7, b6Var));
                    p8Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.d6, b6Var));
                    view = p8Var;
                } else if (i9 == 6) {
                    mu muVar = new mu(kuVar.getContext());
                    muVar.a = new Path();
                    Paint paint = new Paint(1);
                    muVar.b = paint;
                    muVar.c = true;
                    paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(-0.66f), 251658240);
                    paint.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
                    view = muVar;
                } else if (i9 != 7) {
                    view = new du(ouVar, kuVar.getContext());
                } else {
                    View anVar = new org.telegram.ui.Components.an(kuVar.getContext(), 15);
                    int i11 = org.telegram.ui.ActionBar.f6.d6;
                    int i12 = ku.l3;
                    anVar.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(i11, kuVar.l2));
                    view = anVar;
                }
                return new org.telegram.ui.Components.ik0(view);
            default:
                sb0 sb0Var = (sb0) obj;
                Context context3 = viewGroup.getContext();
                if (i9 == 0) {
                    view2 = new org.telegram.ui.Cells.m4(context3);
                } else if (i9 == 1) {
                    view2 = new qb0(sb0Var, context3);
                } else if (i9 == 2) {
                    view2 = new lb0(context3);
                } else if (i9 == 3 || i9 == 4) {
                    view2 = new rb0(sb0Var, context3);
                } else if (i9 == 5) {
                    view2 = new org.telegram.ui.Cells.p8(23, context3, null, false, true);
                }
                return new org.telegram.ui.Components.ik0(view2);
        }
    }
}
