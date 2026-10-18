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

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class hu extends pg.b {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ hu(Object obj, int i10) {
        this.d = i10;
        this.e = obj;
    }

    @Override // org.telegram.ui.Components.hm0
    public final boolean D(s4.b1 b1Var) {
        switch (this.d) {
            case 0:
                eu euVar = (eu) ((ju) this.e).a3.get(b1Var.b());
                int i10 = euVar.a;
                if (i10 == 5 || (i10 == 2 && euVar.h != -1)) {
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
                return ((ju) this.e).a3.size();
            default:
                return ((sb0) this.e).s.size();
        }
    }

    @Override // s4.g0
    public final int j(int i10) {
        switch (this.d) {
            case 0:
                return ((eu) ((ju) this.e).a3.get(i10)).a;
            default:
                sb0 sb0Var = (sb0) this.e;
                if (i10 < 0 || i10 >= sb0Var.s.size()) {
                    return 2;
                }
                return ((mb0) sb0Var.s.get(i10)).a;
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
                ju juVar = (ju) this.e;
                ArrayList arrayList = juVar.a3;
                int b10 = b1Var.b();
                View view = b1Var.a;
                eu euVar = (eu) arrayList.get(b10);
                int i11 = b1Var.f;
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
                                        ((org.telegram.ui.Cells.q8) view).i(euVar.f.toString(), false);
                                        break;
                                    }
                                } else {
                                    ((org.telegram.ui.Cells.l4) view).setText(euVar.f);
                                    break;
                                }
                            } else {
                                ((org.telegram.ui.Cells.d9) view).setText(euVar.f);
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
                                boolean q6 = org.telegram.ui.ActionBar.h6.I.q();
                                org.telegram.ui.Components.jc0 jc0Var = new org.telegram.ui.Components.jc0(1);
                                jc0Var.b(i12, i13);
                                jc0Var.b = q6;
                                imageView.setBackground(jc0Var);
                                imageView.setImageResource(i14);
                            }
                            cuVar.b.setText(charSequence);
                            cuVar.d.setText(charSequence2);
                            cuVar.e = z11;
                            cuVar.setWillNotDraw(!z11);
                            int i16 = euVar.h;
                            if (i16 >= 0) {
                                iu[] iuVarArr = juVar.e3;
                                if (i16 >= iuVarArr.length || iuVarArr[i16].c > 0) {
                                    bool = Boolean.valueOf(juVar.g3[i16]);
                                    ImageView imageView2 = cuVar.c;
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
                            ImageView imageView22 = cuVar.c;
                            if (bool == null) {
                            }
                        }
                    } else {
                        ((mu) view).a.setText(euVar.f);
                        break;
                    }
                } else {
                    org.telegram.ui.Components.dd ddVar = (org.telegram.ui.Components.dd) view;
                    if (juVar.e3 != null) {
                        ddVar.f(juVar.h3, juVar.V2, juVar.f3);
                    }
                    juVar.V2 = false;
                    break;
                }
                break;
            default:
                ArrayList arrayList2 = ((sb0) this.e).s;
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    mb0 mb0Var = (mb0) arrayList2.get(i10);
                    int i17 = b1Var.f;
                    View view2 = b1Var.a;
                    if (i17 != 0) {
                        if (i17 != 1) {
                            if (i17 != 2) {
                                if (i17 != 3 && i17 != 4) {
                                    if (i17 == 5) {
                                        org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view2;
                                        if (mb0Var.f == 1) {
                                            q8Var.j(mb0Var.c, MessagesController.getGlobalMainSettings().getBoolean("view_animations", true), false);
                                            break;
                                        }
                                    }
                                } else {
                                    int i18 = i10 + 1;
                                    boolean z12 = i18 < arrayList2.size() && ((mb0) arrayList2.get(i18)).a != 2;
                                    rb0 rb0Var = (rb0) view2;
                                    Switch r32 = rb0Var.f;
                                    ImageView imageView3 = rb0Var.e;
                                    org.telegram.ui.Components.q6 q6Var = rb0Var.d;
                                    ImageView imageView4 = rb0Var.a;
                                    org.telegram.ui.Components.xp xpVar = rb0Var.h;
                                    ai.vd vdVar = rb0Var.c;
                                    int i19 = mb0Var.a;
                                    CharSequence charSequence3 = mb0Var.c;
                                    int i20 = mb0Var.e;
                                    if (i19 == 3) {
                                        xpVar.setVisibility(8);
                                        imageView4.setVisibility(0);
                                        imageView4.setImageResource(mb0Var.d);
                                        vdVar.setText(charSequence3);
                                        boolean z13 = Integer.bitCount(i20) > 1;
                                        rb0Var.v = z13;
                                        if (z13) {
                                            rb0Var.c(mb0Var, false);
                                            q6Var.setVisibility(0);
                                            imageView3.setVisibility(0);
                                        } else {
                                            q6Var.setVisibility(8);
                                            imageView3.setVisibility(8);
                                        }
                                        vdVar.setTranslationX(0.0f);
                                        r32.setVisibility(0);
                                        r32.c(LiteMode.isEnabled(i20), false);
                                        z10 = true;
                                        rb0Var.r = Integer.bitCount(i20) > 1;
                                    } else {
                                        z10 = true;
                                        xpVar.setVisibility(0);
                                        xpVar.a(LiteMode.isEnabled(i20), false);
                                        imageView4.setVisibility(8);
                                        r32.setVisibility(8);
                                        q6Var.setVisibility(8);
                                        imageView3.setVisibility(8);
                                        vdVar.setText(charSequence3);
                                        vdVar.setTranslationX(AndroidUtilities.dp(41.0f) * (LocaleController.isRTL ? -2.2f : 1.0f));
                                        rb0Var.v = false;
                                        rb0Var.r = false;
                                    }
                                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) rb0Var.b.getLayoutParams();
                                    if (mb0Var.a == 3) {
                                        f7 = (LocaleController.isRTL ? 64 : 75) + 4;
                                    } else {
                                        f7 = 8.0f;
                                    }
                                    marginLayoutParams.rightMargin = AndroidUtilities.dp(f7);
                                    rb0Var.n = z12;
                                    rb0Var.setWillNotDraw((z12 || rb0Var.r) ? false : z10);
                                    rb0Var.b(LiteMode.isPowerSaverApplied(), false);
                                    break;
                                }
                            } else {
                                org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view2;
                                CharSequence charSequence4 = mb0Var.c;
                                if (TextUtils.isEmpty(charSequence4)) {
                                    d9Var.setFixedSize(12);
                                } else {
                                    d9Var.setFixedSize(0);
                                }
                                d9Var.setText(charSequence4);
                                d9Var.setContentDescription(charSequence4);
                                d9Var.setBackground(null);
                                break;
                            }
                        } else {
                            ((qb0) view2).a();
                            break;
                        }
                    } else {
                        ((org.telegram.ui.Cells.l4) view2).setText(mb0Var.c);
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
                ju juVar = (ju) obj;
                nu nuVar = juVar.m3;
                org.telegram.ui.ActionBar.d6 d6Var = juVar.n2;
                if (i10 == 0) {
                    Context context = juVar.getContext();
                    int[] iArr = nu.e;
                    gu guVar = new gu(this, context, iArr.length, iArr, nu.f);
                    juVar.l3 = guVar;
                    guVar.setInterceptTouch(false);
                    View view3 = juVar.l3;
                    view3.setTag(-33024);
                    view = view3;
                } else if (i10 == 1) {
                    Context context2 = juVar.getContext();
                    mu muVar = new mu(context2);
                    TextView textView = new TextView(context2);
                    muVar.a = textView;
                    textView.setGravity(17);
                    textView.setTextSize(1, 13.0f);
                    textView.setTextColor(nuVar.getThemedColor(org.telegram.ui.ActionBar.h6.y6));
                    muVar.addView(textView, w7.z5.d(-1, -2.0f, 119, 24.0f, 0.0f, 24.0f, 14.0f));
                    muVar.setTag(-33024);
                    view = muVar;
                } else if (i10 == 3) {
                    view = new org.telegram.ui.Cells.d9(juVar.getContext());
                } else if (i10 == 4) {
                    View l4Var = new org.telegram.ui.Cells.l4(juVar.getContext());
                    l4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.d6, d6Var));
                    view = l4Var;
                } else if (i10 == 5) {
                    org.telegram.ui.Cells.q8 q8Var = new org.telegram.ui.Cells.q8(juVar.getContext());
                    q8Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.p7, d6Var));
                    q8Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.d6, d6Var));
                    view = q8Var;
                } else if (i10 == 6) {
                    lu luVar = new lu(juVar.getContext());
                    luVar.a = new Path();
                    Paint paint = new Paint(1);
                    luVar.b = paint;
                    luVar.c = true;
                    paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(-0.66f), 251658240);
                    paint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false));
                    view = luVar;
                } else if (i10 != 7) {
                    view = new cu(nuVar, juVar.getContext());
                } else {
                    View unVar = new org.telegram.ui.Components.un(juVar.getContext(), 14);
                    int i12 = org.telegram.ui.ActionBar.h6.d6;
                    int i13 = ju.n3;
                    unVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(i12, juVar.n2));
                    view = unVar;
                }
                return new org.telegram.ui.Components.sl0(view);
            default:
                sb0 sb0Var = (sb0) obj;
                Context context3 = viewGroup.getContext();
                if (i10 == 0) {
                    view2 = new org.telegram.ui.Cells.l4(context3);
                } else if (i10 == 1) {
                    view2 = new qb0(sb0Var, context3);
                } else if (i10 == 2) {
                    view2 = new lb0(context3);
                } else if (i10 == 3 || i10 == 4) {
                    view2 = new rb0(sb0Var, context3);
                } else if (i10 == 5) {
                    view2 = new org.telegram.ui.Cells.q8(23, context3, null, false, true);
                }
                return new org.telegram.ui.Components.sl0(view2);
        }
    }
}
