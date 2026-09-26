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

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class pu extends og.b {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ pu(Object obj, int i10) {
        this.d = i10;
        this.e = obj;
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean D(s4.c1 c1Var) {
        switch (this.d) {
            case 0:
                mu muVar = (mu) ((ru) this.e).c3.get(c1Var.b());
                int i10 = muVar.a;
                if (i10 == 5 || (i10 == 2 && muVar.h != -1)) {
                }
                break;
            default:
                int i11 = c1Var.f;
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
                return ((ru) this.e).c3.size();
            default:
                return ((hc0) this.e).s.size();
        }
    }

    @Override // s4.h0
    public final int j(int i10) {
        switch (this.d) {
            case 0:
                return ((mu) ((ru) this.e).c3.get(i10)).a;
            default:
                hc0 hc0Var = (hc0) this.e;
                if (i10 < 0 || i10 >= hc0Var.s.size()) {
                    return 2;
                }
                return ((bc0) hc0Var.s.get(i10)).a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0218  */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.c1 c1Var, int i10) {
        Boolean bool;
        float f7;
        switch (this.d) {
            case 0:
                ru ruVar = (ru) this.e;
                ArrayList arrayList = ruVar.c3;
                int b10 = c1Var.b();
                View view = c1Var.a;
                mu muVar = (mu) arrayList.get(b10);
                int i11 = c1Var.f;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 != 4) {
                                    if (i11 != 5) {
                                        if (i11 == 6) {
                                            ((tu) view).setTop(true);
                                            break;
                                        }
                                    } else {
                                        ((org.telegram.ui.Cells.r8) view).i(muVar.f.toString(), false);
                                        break;
                                    }
                                } else {
                                    ((org.telegram.ui.Cells.m4) view).setText(muVar.f);
                                    break;
                                }
                            } else {
                                ((org.telegram.ui.Cells.e9) view).setText(muVar.f);
                                break;
                            }
                        } else {
                            ku kuVar = (ku) view;
                            int i12 = muVar.d;
                            int i13 = muVar.e;
                            int i14 = muVar.c;
                            CharSequence charSequence = muVar.f;
                            CharSequence charSequence2 = muVar.g;
                            int i15 = i10 + 1;
                            boolean z10 = i15 < h() && ((mu) arrayList.get(i15)).a == i11;
                            ImageView imageView = kuVar.a;
                            if (i14 == 0) {
                                imageView.setVisibility(8);
                            } else {
                                imageView.setVisibility(0);
                                boolean q6 = org.telegram.ui.ActionBar.h6.I.q();
                                org.telegram.ui.Components.ac0 ac0Var = new org.telegram.ui.Components.ac0(1);
                                ac0Var.b(i12, i13);
                                ac0Var.b = q6;
                                imageView.setBackground(ac0Var);
                                imageView.setImageResource(i14);
                            }
                            kuVar.b.setText(charSequence);
                            kuVar.d.setText(charSequence2);
                            kuVar.e = z10;
                            kuVar.setWillNotDraw(!z10);
                            int i16 = muVar.h;
                            if (i16 >= 0) {
                                qu[] quVarArr = ruVar.g3;
                                if (i16 >= quVarArr.length || quVarArr[i16].c > 0) {
                                    bool = Boolean.valueOf(ruVar.i3[i16]);
                                    ImageView imageView2 = kuVar.c;
                                    if (bool == null) {
                                        imageView2.setVisibility(0);
                                        imageView2.animate().rotation(bool.booleanValue() ? 0.0f : 180.0f).setDuration(360L).setInterpolator(org.telegram.ui.Components.rr.h).start();
                                        break;
                                    } else {
                                        imageView2.setVisibility(8);
                                        break;
                                    }
                                }
                            }
                            bool = null;
                            ImageView imageView22 = kuVar.c;
                            if (bool == null) {
                            }
                        }
                    } else {
                        ((uu) view).a.setText(muVar.f);
                        break;
                    }
                } else {
                    org.telegram.ui.Components.dd ddVar = (org.telegram.ui.Components.dd) view;
                    if (ruVar.g3 != null) {
                        ddVar.f(ruVar.j3, ruVar.X2, ruVar.h3);
                    }
                    ruVar.X2 = false;
                    break;
                }
                break;
            default:
                ArrayList arrayList2 = ((hc0) this.e).s;
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    bc0 bc0Var = (bc0) arrayList2.get(i10);
                    int i17 = c1Var.f;
                    View view2 = c1Var.a;
                    if (i17 != 0) {
                        if (i17 != 1) {
                            if (i17 != 2) {
                                if (i17 != 3 && i17 != 4) {
                                    if (i17 == 5) {
                                        org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view2;
                                        if (bc0Var.f == 1) {
                                            r8Var.j(bc0Var.c, MessagesController.getGlobalMainSettings().getBoolean("view_animations", true), false);
                                            break;
                                        }
                                    }
                                } else {
                                    int i18 = i10 + 1;
                                    boolean z11 = i18 < arrayList2.size() && ((bc0) arrayList2.get(i18)).a != 2;
                                    gc0 gc0Var = (gc0) view2;
                                    Switch r32 = gc0Var.f;
                                    ImageView imageView3 = gc0Var.e;
                                    org.telegram.ui.Components.p6 p6Var = gc0Var.d;
                                    ImageView imageView4 = gc0Var.a;
                                    org.telegram.ui.Components.op opVar = gc0Var.h;
                                    ai.p4 p4Var = gc0Var.c;
                                    int i19 = bc0Var.a;
                                    CharSequence charSequence3 = bc0Var.c;
                                    int i20 = bc0Var.e;
                                    if (i19 == 3) {
                                        opVar.setVisibility(8);
                                        imageView4.setVisibility(0);
                                        imageView4.setImageResource(bc0Var.d);
                                        p4Var.setText(charSequence3);
                                        boolean z12 = Integer.bitCount(i20) > 1;
                                        gc0Var.v = z12;
                                        if (z12) {
                                            gc0Var.c(bc0Var, false);
                                            p6Var.setVisibility(0);
                                            imageView3.setVisibility(0);
                                        } else {
                                            p6Var.setVisibility(8);
                                            imageView3.setVisibility(8);
                                        }
                                        p4Var.setTranslationX(0.0f);
                                        r32.setVisibility(0);
                                        r32.c(LiteMode.isEnabled(i20), false);
                                        gc0Var.r = Integer.bitCount(i20) > 1;
                                    } else {
                                        opVar.setVisibility(0);
                                        opVar.a(LiteMode.isEnabled(i20), false);
                                        imageView4.setVisibility(8);
                                        r32.setVisibility(8);
                                        p6Var.setVisibility(8);
                                        imageView3.setVisibility(8);
                                        p4Var.setText(charSequence3);
                                        p4Var.setTranslationX(AndroidUtilities.dp(41.0f) * (LocaleController.isRTL ? -2.2f : 1.0f));
                                        gc0Var.v = false;
                                        gc0Var.r = false;
                                    }
                                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) gc0Var.b.getLayoutParams();
                                    if (bc0Var.a == 3) {
                                        f7 = (LocaleController.isRTL ? 64 : 75) + 4;
                                    } else {
                                        f7 = 8.0f;
                                    }
                                    marginLayoutParams.rightMargin = AndroidUtilities.dp(f7);
                                    gc0Var.n = z11;
                                    gc0Var.setWillNotDraw((z11 || gc0Var.r) ? false : true);
                                    gc0Var.b(LiteMode.isPowerSaverApplied(), false);
                                    break;
                                }
                            } else {
                                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view2;
                                CharSequence charSequence4 = bc0Var.c;
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
                            ((fc0) view2).a();
                            break;
                        }
                    } else {
                        ((org.telegram.ui.Cells.m4) view2).setText(bc0Var.c);
                        break;
                    }
                }
                break;
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        int i11 = this.d;
        View view2 = null;
        Object obj = this.e;
        switch (i11) {
            case 0:
                ru ruVar = (ru) obj;
                vu vuVar = ruVar.o3;
                org.telegram.ui.ActionBar.d6 d6Var = ruVar.p2;
                if (i10 == 0) {
                    Context context = ruVar.getContext();
                    int[] iArr = vu.e;
                    ou ouVar = new ou(this, context, iArr.length, iArr, vu.f);
                    ruVar.n3 = ouVar;
                    ouVar.setInterceptTouch(false);
                    View view3 = ruVar.n3;
                    view3.setTag(-33024);
                    view = view3;
                } else if (i10 == 1) {
                    Context context2 = ruVar.getContext();
                    uu uuVar = new uu(context2);
                    TextView textView = new TextView(context2);
                    uuVar.a = textView;
                    textView.setGravity(17);
                    textView.setTextSize(1, 13.0f);
                    textView.setTextColor(vuVar.getThemedColor(org.telegram.ui.ActionBar.h6.y6));
                    uuVar.addView(textView, w7.y5.d(-1, -2.0f, 119, 24.0f, 0.0f, 24.0f, 14.0f));
                    uuVar.setTag(-33024);
                    view = uuVar;
                } else if (i10 == 3) {
                    view = new org.telegram.ui.Cells.e9(ruVar.getContext());
                } else if (i10 == 4) {
                    View m4Var = new org.telegram.ui.Cells.m4(ruVar.getContext());
                    m4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.d6, d6Var));
                    view = m4Var;
                } else if (i10 == 5) {
                    org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(ruVar.getContext());
                    r8Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.p7, d6Var));
                    r8Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.d6, d6Var));
                    view = r8Var;
                } else if (i10 == 6) {
                    tu tuVar = new tu(ruVar.getContext());
                    tuVar.a = new Path();
                    Paint paint = new Paint(1);
                    tuVar.b = paint;
                    tuVar.c = true;
                    paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(-0.66f), 251658240);
                    paint.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, false));
                    view = tuVar;
                } else if (i10 != 7) {
                    view = new ku(vuVar, ruVar.getContext());
                } else {
                    View lnVar = new org.telegram.ui.Components.ln(ruVar.getContext(), 14);
                    int i12 = org.telegram.ui.ActionBar.h6.d6;
                    int i13 = ru.p3;
                    lnVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(i12, ruVar.p2));
                    view = lnVar;
                }
                return new org.telegram.ui.Components.gl0(view);
            default:
                hc0 hc0Var = (hc0) obj;
                Context context3 = viewGroup.getContext();
                if (i10 == 0) {
                    view2 = new org.telegram.ui.Cells.m4(context3);
                } else if (i10 == 1) {
                    view2 = new fc0(hc0Var, context3);
                } else if (i10 == 2) {
                    view2 = new ac0(context3);
                } else if (i10 == 3 || i10 == 4) {
                    view2 = new gc0(hc0Var, context3);
                } else if (i10 == 5) {
                    view2 = new org.telegram.ui.Cells.r8(23, context3, null, false, true);
                }
                return new org.telegram.ui.Components.gl0(view2);
        }
    }
}
