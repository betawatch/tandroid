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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class fu extends qg.b {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ fu(Object obj, int i10) {
        this.d = i10;
        this.e = obj;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.e1 e1Var) {
        switch (this.d) {
            case 0:
                cu cuVar = (cu) ((hu) this.e).k3.get(e1Var.b());
                int i10 = cuVar.a;
                if (i10 == 5 || (i10 == 2 && cuVar.h != -1)) {
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
                return ((hu) this.e).k3.size();
            default:
                return ((tb0) this.e).s.size();
        }
    }

    @Override // s4.h0
    public final int j(int i10) {
        switch (this.d) {
            case 0:
                return ((cu) ((hu) this.e).k3.get(i10)).a;
            default:
                tb0 tb0Var = (tb0) this.e;
                if (i10 < 0 || i10 >= tb0Var.s.size()) {
                    return 2;
                }
                return ((nb0) tb0Var.s.get(i10)).a;
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
                hu huVar = (hu) this.e;
                ArrayList arrayList = huVar.k3;
                int b10 = e1Var.b();
                View view = e1Var.a;
                cu cuVar = (cu) arrayList.get(b10);
                int i11 = e1Var.f;
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
                                        ((org.telegram.ui.Cells.v8) view).k(cuVar.f.toString(), false);
                                        break;
                                    }
                                } else {
                                    ((org.telegram.ui.Cells.q4) view).setText(cuVar.f);
                                    break;
                                }
                            } else {
                                ((org.telegram.ui.Cells.i9) view).setText(cuVar.f);
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
                                boolean q5 = org.telegram.ui.ActionBar.y6.I.q();
                                org.telegram.ui.Components.ic0 ic0Var = new org.telegram.ui.Components.ic0(1);
                                ic0Var.b(i12, i13);
                                ic0Var.b = q5;
                                imageView.setBackground(ic0Var);
                                imageView.setImageResource(i14);
                            }
                            auVar.b.setText(charSequence);
                            auVar.d.setText(charSequence2);
                            auVar.e = z11;
                            auVar.setWillNotDraw(!z11);
                            int i16 = cuVar.h;
                            if (i16 >= 0) {
                                gu[] guVarArr = huVar.o3;
                                if (i16 >= guVarArr.length || guVarArr[i16].c > 0) {
                                    bool = Boolean.valueOf(huVar.q3[i16]);
                                    ImageView imageView2 = auVar.c;
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
                            ImageView imageView22 = auVar.c;
                            if (bool == null) {
                            }
                        }
                    } else {
                        ((ku) view).a.setText(cuVar.f);
                        break;
                    }
                } else {
                    org.telegram.ui.Components.cd cdVar = (org.telegram.ui.Components.cd) view;
                    if (huVar.o3 != null) {
                        cdVar.f(huVar.r3, huVar.f3, huVar.p3);
                    }
                    huVar.f3 = false;
                    break;
                }
                break;
            default:
                ArrayList arrayList2 = ((tb0) this.e).s;
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    nb0 nb0Var = (nb0) arrayList2.get(i10);
                    int i17 = e1Var.f;
                    View view2 = e1Var.a;
                    if (i17 != 0) {
                        if (i17 != 1) {
                            if (i17 != 2) {
                                if (i17 != 3 && i17 != 4) {
                                    if (i17 == 5) {
                                        org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view2;
                                        if (nb0Var.f == 1) {
                                            v8Var.l(nb0Var.c, MessagesController.getGlobalMainSettings().getBoolean("view_animations", true), false);
                                            break;
                                        }
                                    }
                                } else {
                                    int i18 = i10 + 1;
                                    boolean z12 = i18 < arrayList2.size() && ((nb0) arrayList2.get(i18)).a != 2;
                                    sb0 sb0Var = (sb0) view2;
                                    Switch r32 = sb0Var.f;
                                    ImageView imageView3 = sb0Var.e;
                                    org.telegram.ui.Components.s6 s6Var = sb0Var.d;
                                    ImageView imageView4 = sb0Var.a;
                                    org.telegram.ui.Components.zp zpVar = sb0Var.h;
                                    bi.md mdVar = sb0Var.c;
                                    int i19 = nb0Var.a;
                                    CharSequence charSequence3 = nb0Var.c;
                                    int i20 = nb0Var.e;
                                    if (i19 == 3) {
                                        zpVar.setVisibility(8);
                                        imageView4.setVisibility(0);
                                        imageView4.setImageResource(nb0Var.d);
                                        mdVar.setText(charSequence3);
                                        boolean z13 = Integer.bitCount(i20) > 1;
                                        sb0Var.v = z13;
                                        if (z13) {
                                            sb0Var.c(nb0Var, false);
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
                                        sb0Var.r = Integer.bitCount(i20) > 1;
                                    } else {
                                        z10 = true;
                                        zpVar.setVisibility(0);
                                        zpVar.a(LiteMode.isEnabled(i20), false);
                                        imageView4.setVisibility(8);
                                        r32.setVisibility(8);
                                        s6Var.setVisibility(8);
                                        imageView3.setVisibility(8);
                                        mdVar.setText(charSequence3);
                                        mdVar.setTranslationX(AndroidUtilities.dp(41.0f) * (LocaleController.isRTL ? -2.2f : 1.0f));
                                        sb0Var.v = false;
                                        sb0Var.r = false;
                                    }
                                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) sb0Var.b.getLayoutParams();
                                    if (nb0Var.a == 3) {
                                        f7 = (LocaleController.isRTL ? 64 : 75) + 4;
                                    } else {
                                        f7 = 8.0f;
                                    }
                                    marginLayoutParams.rightMargin = AndroidUtilities.dp(f7);
                                    sb0Var.n = z12;
                                    sb0Var.setWillNotDraw((z12 || sb0Var.r) ? false : z10);
                                    sb0Var.b(LiteMode.isPowerSaverApplied(), false);
                                    break;
                                }
                            } else {
                                org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) view2;
                                CharSequence charSequence4 = nb0Var.c;
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
                            ((rb0) view2).a();
                            break;
                        }
                    } else {
                        ((org.telegram.ui.Cells.q4) view2).setText(nb0Var.c);
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
                hu huVar = (hu) obj;
                org.telegram.ui.ActionBar.u6 u6Var = huVar.n2;
                if (i10 == 0) {
                    Context context = huVar.getContext();
                    int[] iArr = lu.s;
                    eu euVar = new eu(this, context, iArr.length, iArr, lu.v);
                    huVar.v3 = euVar;
                    euVar.setInterceptTouch(false);
                    View view3 = huVar.v3;
                    view3.setTag(-33024);
                    view = view3;
                } else if (i10 == 1) {
                    Context context2 = huVar.getContext();
                    ku kuVar = new ku(context2);
                    TextView textView = new TextView(context2);
                    kuVar.a = textView;
                    textView.setGravity(17);
                    textView.setTextSize(1, 13.0f);
                    org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.y6, null);
                    kuVar.addView(textView, org.telegram.ui.Components.gb1.h(-1, -2.0f, 119, 24.0f, 0.0f, 24.0f, 14.0f));
                    kuVar.setTag(-33024);
                    view = kuVar;
                } else if (i10 == 3) {
                    view = new org.telegram.ui.Cells.i9(huVar.getContext());
                } else if (i10 == 4) {
                    View q4Var = new org.telegram.ui.Cells.q4(huVar.getContext());
                    org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, q4Var, u6Var);
                    view = q4Var;
                } else if (i10 == 5) {
                    org.telegram.ui.Cells.v8 v8Var = new org.telegram.ui.Cells.v8(huVar.getContext());
                    org.telegram.ui.ActionBar.f7.Y(v8Var.getTextView(), org.telegram.ui.ActionBar.y6.p7, u6Var);
                    org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, v8Var, u6Var);
                    view = v8Var;
                } else if (i10 == 6) {
                    ju juVar = new ju(huVar.getContext());
                    juVar.a = new Path();
                    Paint paint = new Paint(1);
                    juVar.b = paint;
                    juVar.c = true;
                    paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(-0.66f), 251658240);
                    paint.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.d6, false));
                    view = juVar;
                } else if (i10 != 7) {
                    view = new au(huVar.w3, huVar.getContext());
                } else {
                    View vnVar = new org.telegram.ui.Components.vn(huVar.getContext(), 14);
                    int i12 = org.telegram.ui.ActionBar.y6.d6;
                    int i13 = hu.x3;
                    org.telegram.ui.ActionBar.f7.i(i12, vnVar, huVar.n2);
                    view = vnVar;
                }
                return new org.telegram.ui.Components.vl0(view);
            default:
                tb0 tb0Var = (tb0) obj;
                Context context3 = viewGroup.getContext();
                if (i10 == 0) {
                    view2 = new org.telegram.ui.Cells.q4(context3);
                } else if (i10 == 1) {
                    view2 = new rb0(tb0Var, context3);
                } else if (i10 == 2) {
                    view2 = new mb0(context3);
                } else if (i10 == 3 || i10 == 4) {
                    view2 = new sb0(tb0Var, context3);
                } else if (i10 == 5) {
                    view2 = new org.telegram.ui.Cells.v8(23, context3, null, false, true);
                }
                return new org.telegram.ui.Components.vl0(view2);
        }
    }
}
