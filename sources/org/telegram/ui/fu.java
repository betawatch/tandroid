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

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class fu extends pg.b {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ fu(Object obj, int i10) {
        this.d = i10;
        this.e = obj;
    }

    @Override // org.telegram.ui.Components.im0
    public final boolean D(s4.b1 b1Var) {
        switch (this.d) {
            case 0:
                cu cuVar = (cu) ((hu) this.e).a3.get(b1Var.b());
                int i10 = cuVar.a;
                if (i10 == 5 || (i10 == 2 && cuVar.h != -1)) {
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
                return ((hu) this.e).a3.size();
            default:
                return ((qb0) this.e).s.size();
        }
    }

    @Override // s4.g0
    public final int j(int i10) {
        switch (this.d) {
            case 0:
                return ((cu) ((hu) this.e).a3.get(i10)).a;
            default:
                qb0 qb0Var = (qb0) this.e;
                if (i10 < 0 || i10 >= qb0Var.s.size()) {
                    return 2;
                }
                return ((kb0) qb0Var.s.get(i10)).a;
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
                hu huVar = (hu) this.e;
                ArrayList arrayList = huVar.a3;
                int b10 = b1Var.b();
                View view = b1Var.a;
                cu cuVar = (cu) arrayList.get(b10);
                int i11 = b1Var.f;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 != 4) {
                                    if (i11 != 5) {
                                        if (i11 == 6) {
                                            ((ju) view).setTop(true);
                                            break;
                                        }
                                    } else {
                                        ((org.telegram.ui.Cells.q8) view).i(cuVar.f.toString(), false);
                                        break;
                                    }
                                } else {
                                    ((org.telegram.ui.Cells.l4) view).setText(cuVar.f);
                                    break;
                                }
                            } else {
                                ((org.telegram.ui.Cells.d9) view).setText(cuVar.f);
                                break;
                            }
                        } else {
                            au auVar = (au) view;
                            int i12 = cuVar.d;
                            int i13 = cuVar.e;
                            int i14 = cuVar.c;
                            CharSequence charSequence = cuVar.f;
                            CharSequence charSequence2 = cuVar.g;
                            int i15 = i10 + 1;
                            boolean z11 = i15 < h() && ((cu) arrayList.get(i15)).a == i11;
                            ImageView imageView = auVar.a;
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
                            auVar.b.setText(charSequence);
                            auVar.d.setText(charSequence2);
                            auVar.e = z11;
                            auVar.setWillNotDraw(!z11);
                            int i16 = cuVar.h;
                            if (i16 >= 0) {
                                gu[] guVarArr = huVar.e3;
                                if (i16 >= guVarArr.length || guVarArr[i16].c > 0) {
                                    bool = Boolean.valueOf(huVar.g3[i16]);
                                    ImageView imageView2 = auVar.c;
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
                            ImageView imageView22 = auVar.c;
                            if (bool == null) {
                            }
                        }
                    } else {
                        ((ku) view).a.setText(cuVar.f);
                        break;
                    }
                } else {
                    org.telegram.ui.Components.dd ddVar = (org.telegram.ui.Components.dd) view;
                    if (huVar.e3 != null) {
                        ddVar.f(huVar.h3, huVar.V2, huVar.f3);
                    }
                    huVar.V2 = false;
                    break;
                }
                break;
            default:
                ArrayList arrayList2 = ((qb0) this.e).s;
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    kb0 kb0Var = (kb0) arrayList2.get(i10);
                    int i17 = b1Var.f;
                    View view2 = b1Var.a;
                    if (i17 != 0) {
                        if (i17 != 1) {
                            if (i17 != 2) {
                                if (i17 != 3 && i17 != 4) {
                                    if (i17 == 5) {
                                        org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view2;
                                        if (kb0Var.f == 1) {
                                            q8Var.j(kb0Var.c, MessagesController.getGlobalMainSettings().getBoolean("view_animations", true), false);
                                            break;
                                        }
                                    }
                                } else {
                                    int i18 = i10 + 1;
                                    boolean z12 = i18 < arrayList2.size() && ((kb0) arrayList2.get(i18)).a != 2;
                                    pb0 pb0Var = (pb0) view2;
                                    Switch r32 = pb0Var.f;
                                    ImageView imageView3 = pb0Var.e;
                                    org.telegram.ui.Components.q6 q6Var = pb0Var.d;
                                    ImageView imageView4 = pb0Var.a;
                                    org.telegram.ui.Components.xp xpVar = pb0Var.h;
                                    ai.vd vdVar = pb0Var.c;
                                    int i19 = kb0Var.a;
                                    CharSequence charSequence3 = kb0Var.c;
                                    int i20 = kb0Var.e;
                                    if (i19 == 3) {
                                        xpVar.setVisibility(8);
                                        imageView4.setVisibility(0);
                                        imageView4.setImageResource(kb0Var.d);
                                        vdVar.setText(charSequence3);
                                        boolean z13 = Integer.bitCount(i20) > 1;
                                        pb0Var.v = z13;
                                        if (z13) {
                                            pb0Var.c(kb0Var, false);
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
                                        pb0Var.r = Integer.bitCount(i20) > 1;
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
                                        pb0Var.v = false;
                                        pb0Var.r = false;
                                    }
                                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) pb0Var.b.getLayoutParams();
                                    if (kb0Var.a == 3) {
                                        f7 = (LocaleController.isRTL ? 64 : 75) + 4;
                                    } else {
                                        f7 = 8.0f;
                                    }
                                    marginLayoutParams.rightMargin = AndroidUtilities.dp(f7);
                                    pb0Var.n = z12;
                                    pb0Var.setWillNotDraw((z12 || pb0Var.r) ? false : z10);
                                    pb0Var.b(LiteMode.isPowerSaverApplied(), false);
                                    break;
                                }
                            } else {
                                org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view2;
                                CharSequence charSequence4 = kb0Var.c;
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
                            ((ob0) view2).a();
                            break;
                        }
                    } else {
                        ((org.telegram.ui.Cells.l4) view2).setText(kb0Var.c);
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
                hu huVar = (hu) obj;
                lu luVar = huVar.m3;
                org.telegram.ui.ActionBar.d6 d6Var = huVar.n2;
                if (i10 == 0) {
                    Context context = huVar.getContext();
                    int[] iArr = lu.e;
                    eu euVar = new eu(this, context, iArr.length, iArr, lu.f);
                    huVar.l3 = euVar;
                    euVar.setInterceptTouch(false);
                    View view3 = huVar.l3;
                    view3.setTag(-33024);
                    view = view3;
                } else if (i10 == 1) {
                    Context context2 = huVar.getContext();
                    ku kuVar = new ku(context2);
                    TextView textView = new TextView(context2);
                    kuVar.a = textView;
                    textView.setGravity(17);
                    textView.setTextSize(1, 13.0f);
                    textView.setTextColor(luVar.getThemedColor(org.telegram.ui.ActionBar.h6.y6));
                    kuVar.addView(textView, w7.z5.d(-1, -2.0f, 119, 24.0f, 0.0f, 24.0f, 14.0f));
                    kuVar.setTag(-33024);
                    view = kuVar;
                } else if (i10 == 3) {
                    view = new org.telegram.ui.Cells.d9(huVar.getContext());
                } else if (i10 == 4) {
                    View l4Var = new org.telegram.ui.Cells.l4(huVar.getContext());
                    l4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.d6, d6Var));
                    view = l4Var;
                } else if (i10 == 5) {
                    org.telegram.ui.Cells.q8 q8Var = new org.telegram.ui.Cells.q8(huVar.getContext());
                    q8Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.p7, d6Var));
                    q8Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.d6, d6Var));
                    view = q8Var;
                } else if (i10 == 6) {
                    ju juVar = new ju(huVar.getContext());
                    juVar.a = new Path();
                    Paint paint = new Paint(1);
                    juVar.b = paint;
                    juVar.c = true;
                    paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(-0.66f), 251658240);
                    paint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false));
                    view = juVar;
                } else if (i10 != 7) {
                    view = new au(luVar, huVar.getContext());
                } else {
                    View unVar = new org.telegram.ui.Components.un(huVar.getContext(), 14);
                    int i12 = org.telegram.ui.ActionBar.h6.d6;
                    int i13 = hu.n3;
                    unVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(i12, huVar.n2));
                    view = unVar;
                }
                return new org.telegram.ui.Components.tl0(view);
            default:
                qb0 qb0Var = (qb0) obj;
                Context context3 = viewGroup.getContext();
                if (i10 == 0) {
                    view2 = new org.telegram.ui.Cells.l4(context3);
                } else if (i10 == 1) {
                    view2 = new ob0(qb0Var, context3);
                } else if (i10 == 2) {
                    view2 = new jb0(context3);
                } else if (i10 == 3 || i10 == 4) {
                    view2 = new pb0(qb0Var, context3);
                } else if (i10 == 5) {
                    view2 = new org.telegram.ui.Cells.q8(23, context3, null, false, true);
                }
                return new org.telegram.ui.Components.tl0(view2);
        }
    }
}
