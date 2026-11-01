package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class dj0 extends hg.c {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ dj0(Object obj, int i10) {
        this.d = i10;
        this.e = obj;
    }

    @Override // org.telegram.ui.Components.tk0
    public final boolean D(s4.c1 c1Var) {
        switch (this.d) {
            case 0:
                return false;
            case 1:
                org.telegram.ui.eu euVar = (org.telegram.ui.eu) ((org.telegram.ui.iu) this.e).j3.get(c1Var.b());
                int i10 = euVar.a;
                return i10 == 5 || (i10 == 2 && euVar.h != -1);
            default:
                int i11 = c1Var.f;
                return i11 == 4 || i11 == 3 || i11 == 5;
        }
    }

    @Override // s4.g0
    public final int b() {
        switch (this.d) {
            case 0:
                return ((nj0) this.e).d.size();
            case 1:
                return ((org.telegram.ui.iu) this.e).j3.size();
            default:
                return ((org.telegram.ui.ab0) this.e).s.size();
        }
    }

    @Override // s4.g0
    public final int d(int i10) {
        switch (this.d) {
            case 0:
                return ((ej0) ((nj0) this.e).d.get(i10)).a;
            case 1:
                return ((org.telegram.ui.eu) ((org.telegram.ui.iu) this.e).j3.get(i10)).a;
            default:
                org.telegram.ui.ab0 ab0Var = (org.telegram.ui.ab0) this.e;
                if (i10 < 0 || i10 >= ab0Var.s.size()) {
                    return 2;
                }
                return ((org.telegram.ui.va0) ab0Var.s.get(i10)).a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0217  */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s4.c1 c1Var, int i10) {
        Boolean bool;
        boolean z10;
        float f7;
        switch (this.d) {
            case 0:
                int i11 = c1Var.f;
                if (i11 == 0 || i11 == 3) {
                    lj0 lj0Var = (lj0) c1Var.a;
                    lj0Var.setScaleX(1.0f);
                    lj0Var.setScaleY(1.0f);
                    lj0.a(lj0Var, ((ej0) ((nj0) this.e).d.get(i10)).c, i10);
                    break;
                }
                break;
            case 1:
                org.telegram.ui.iu iuVar = (org.telegram.ui.iu) this.e;
                ArrayList arrayList = iuVar.j3;
                int b10 = c1Var.b();
                View view = c1Var.a;
                org.telegram.ui.eu euVar = (org.telegram.ui.eu) arrayList.get(b10);
                int i12 = c1Var.f;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (i12 != 3) {
                                if (i12 != 4) {
                                    if (i12 != 5) {
                                        if (i12 == 6) {
                                            ((org.telegram.ui.ju) view).setTop(true);
                                            break;
                                        }
                                    } else {
                                        ((org.telegram.ui.Cells.p8) view).k(euVar.f.toString(), false);
                                        break;
                                    }
                                } else {
                                    ((org.telegram.ui.Cells.p4) view).setText(euVar.f);
                                    break;
                                }
                            } else {
                                ((org.telegram.ui.Cells.b9) view).setText(euVar.f);
                                break;
                            }
                        } else {
                            org.telegram.ui.cu cuVar = (org.telegram.ui.cu) view;
                            int i13 = euVar.d;
                            int i14 = euVar.e;
                            int i15 = euVar.c;
                            CharSequence charSequence = euVar.f;
                            CharSequence charSequence2 = euVar.g;
                            int i16 = i10 + 1;
                            boolean z11 = i16 < b() && ((org.telegram.ui.eu) arrayList.get(i16)).a == i12;
                            ImageView imageView = cuVar.a;
                            if (i15 == 0) {
                                imageView.setVisibility(8);
                            } else {
                                imageView.setVisibility(0);
                                boolean q6 = org.telegram.ui.ActionBar.t6.I.q();
                                va0 va0Var = new va0(1);
                                va0Var.b(i13, i14);
                                va0Var.b = q6;
                                imageView.setBackground(va0Var);
                                imageView.setImageResource(i15);
                            }
                            cuVar.b.setText(charSequence);
                            cuVar.d.setText(charSequence2);
                            cuVar.e = z11;
                            cuVar.setWillNotDraw(!z11);
                            int i17 = euVar.h;
                            if (i17 >= 0) {
                                org.telegram.ui.hu[] huVarArr = iuVar.n3;
                                if (i17 >= huVarArr.length || huVarArr[i17].c > 0) {
                                    bool = Boolean.valueOf(iuVar.p3[i17]);
                                    ImageView imageView2 = cuVar.c;
                                    if (bool == null) {
                                        imageView2.setVisibility(0);
                                        imageView2.animate().rotation(bool.booleanValue() ? 0.0f : 180.0f).setDuration(360L).setInterpolator(gr.h).start();
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
                        ((org.telegram.ui.ku) view).a.setText(euVar.f);
                        break;
                    }
                } else {
                    ic icVar = (ic) view;
                    if (iuVar.n3 != null) {
                        icVar.f(iuVar.q3, iuVar.e3, iuVar.o3);
                    }
                    iuVar.e3 = false;
                    break;
                }
                break;
            default:
                ArrayList arrayList2 = ((org.telegram.ui.ab0) this.e).s;
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    org.telegram.ui.va0 va0Var2 = (org.telegram.ui.va0) arrayList2.get(i10);
                    int i18 = c1Var.f;
                    View view2 = c1Var.a;
                    if (i18 != 0) {
                        if (i18 != 1) {
                            if (i18 != 2) {
                                if (i18 != 3 && i18 != 4) {
                                    if (i18 == 5) {
                                        org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view2;
                                        if (va0Var2.f == 1) {
                                            p8Var.l(va0Var2.c, org.telegram.messenger.wp.d1().getBoolean("view_animations", true), false);
                                            break;
                                        }
                                    }
                                } else {
                                    int i19 = i10 + 1;
                                    boolean z12 = i19 < arrayList2.size() && ((org.telegram.ui.va0) arrayList2.get(i19)).a != 2;
                                    org.telegram.ui.za0 za0Var = (org.telegram.ui.za0) view2;
                                    Switch r32 = za0Var.f;
                                    ImageView imageView3 = za0Var.e;
                                    f6 f6Var = za0Var.d;
                                    ImageView imageView4 = za0Var.a;
                                    ep epVar = za0Var.h;
                                    ag.j3 j3Var = za0Var.c;
                                    int i20 = va0Var2.a;
                                    CharSequence charSequence3 = va0Var2.c;
                                    int i21 = va0Var2.e;
                                    if (i20 == 3) {
                                        epVar.setVisibility(8);
                                        imageView4.setVisibility(0);
                                        imageView4.setImageResource(va0Var2.d);
                                        j3Var.setText(charSequence3);
                                        boolean z13 = Integer.bitCount(i21) > 1;
                                        za0Var.w = z13;
                                        if (z13) {
                                            za0Var.c(va0Var2, false);
                                            f6Var.setVisibility(0);
                                            imageView3.setVisibility(0);
                                        } else {
                                            f6Var.setVisibility(8);
                                            imageView3.setVisibility(8);
                                        }
                                        j3Var.setTranslationX(0.0f);
                                        r32.setVisibility(0);
                                        r32.c(org.telegram.messenger.tc.e(i21), false);
                                        z10 = true;
                                        za0Var.r = Integer.bitCount(i21) > 1;
                                    } else {
                                        z10 = true;
                                        epVar.setVisibility(0);
                                        epVar.a(org.telegram.messenger.tc.e(i21), false);
                                        imageView4.setVisibility(8);
                                        r32.setVisibility(8);
                                        f6Var.setVisibility(8);
                                        imageView3.setVisibility(8);
                                        j3Var.setText(charSequence3);
                                        j3Var.setTranslationX(org.telegram.messenger.i0.L(41.0f) * (org.telegram.messenger.dd.X ? -2.2f : 1.0f));
                                        za0Var.w = false;
                                        za0Var.r = false;
                                    }
                                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) za0Var.b.getLayoutParams();
                                    if (va0Var2.a == 3) {
                                        f7 = (org.telegram.messenger.dd.X ? 64 : 75) + 4;
                                    } else {
                                        f7 = 8.0f;
                                    }
                                    marginLayoutParams.rightMargin = org.telegram.messenger.i0.L(f7);
                                    za0Var.n = z12;
                                    za0Var.setWillNotDraw((z12 || za0Var.r) ? false : z10);
                                    za0Var.b(org.telegram.messenger.tc.f(), false);
                                    break;
                                }
                            } else {
                                org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view2;
                                CharSequence charSequence4 = va0Var2.c;
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
                            ((org.telegram.ui.ya0) view2).a();
                            break;
                        }
                    } else {
                        ((org.telegram.ui.Cells.p4) view2).setText(va0Var2.c);
                        break;
                    }
                }
                break;
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        int i11 = this.d;
        final int i12 = 0;
        View view3 = null;
        Object obj = this.e;
        final int i13 = 1;
        switch (i11) {
            case 0:
                nj0 nj0Var = (nj0) obj;
                if (i10 == 1) {
                    nj0Var.R = new FrameLayout(nj0Var.getContext());
                    kg.l1 l1Var = new kg.l1(0, nj0Var.getContext(), null);
                    nj0Var.u0 = l1Var;
                    int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.F8, false);
                    int i14 = org.telegram.ui.ActionBar.t6.h5;
                    l1Var.setColor(i0.b.f(0.7f, x02, org.telegram.ui.ActionBar.t6.x0(null, i14, false)));
                    org.telegram.ui.ActionBar.a7.t(nj0Var.u0, i14, null, PorterDuff.Mode.MULTIPLY);
                    nj0Var.u0.setScaleX(0.0f);
                    nj0Var.u0.setScaleY(0.0f);
                    nj0Var.u0.setPadding(org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f));
                    nj0Var.R.addView(nj0Var.u0, w7.b6.e(26, 26, 17));
                    nj0Var.u0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.cj0
                        public final /* synthetic */ dj0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view4) {
                            switch (i12) {
                                case 0:
                                    dj0 dj0Var = this.b;
                                    dj0Var.getClass();
                                    view4.getLocationOnScreen(new int[2]);
                                    nj0 nj0Var2 = (nj0) dj0Var.e;
                                    view4.getMeasuredWidth();
                                    view4.getMeasuredHeight();
                                    nj0Var2.getClass();
                                    new kg.i1(nj0Var2.t0, 4, true).show();
                                    break;
                                default:
                                    nj0.a((nj0) this.b.e);
                                    break;
                            }
                        }
                    });
                    view = nj0Var.R;
                } else if (i10 != 2) {
                    view = new lj0(nj0Var, nj0Var.getContext());
                } else {
                    nj0Var.S = new fg.i(nj0Var, nj0Var.getContext());
                    ir irVar = new ir(nj0Var, nj0Var.getContext());
                    nj0Var.v0 = irVar;
                    irVar.setImageResource(R.drawable.msg_reactions_expand);
                    nj0Var.v0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    int i15 = nj0Var.M0;
                    if (i15 == 1 || i15 == 2 || i15 == 4) {
                        nj0Var.v0.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
                    } else {
                        org.telegram.ui.ActionBar.a7.t(nj0Var.v0, org.telegram.ui.ActionBar.t6.h5, null, PorterDuff.Mode.MULTIPLY);
                    }
                    ir irVar2 = nj0Var.v0;
                    int L = org.telegram.messenger.i0.L(28.0f);
                    int i16 = org.telegram.ui.ActionBar.t6.i6;
                    org.telegram.ui.ActionBar.a7.R(irVar2, org.telegram.ui.ActionBar.t6.j0(L, 0, i0.b.o(org.telegram.ui.ActionBar.t6.x0(null, i16, false), 40)), null, org.telegram.ui.ActionBar.a7.h(i16, 40), null);
                    nj0Var.v0.setPadding(org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f));
                    nj0Var.v0.setContentDescription(org.telegram.messenger.dd.L0(2131754883, null));
                    nj0Var.S.addView(nj0Var.v0, w7.b6.e(30, 30, 17));
                    nj0Var.v0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.cj0
                        public final /* synthetic */ dj0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view4) {
                            switch (i13) {
                                case 0:
                                    dj0 dj0Var = this.b;
                                    dj0Var.getClass();
                                    view4.getLocationOnScreen(new int[2]);
                                    nj0 nj0Var2 = (nj0) dj0Var.e;
                                    view4.getMeasuredWidth();
                                    view4.getMeasuredHeight();
                                    nj0Var2.getClass();
                                    new kg.i1(nj0Var2.t0, 4, true).show();
                                    break;
                                default:
                                    nj0.a((nj0) this.b.e);
                                    break;
                            }
                        }
                    });
                    view = nj0Var.S;
                }
                int topOffset = ((nj0Var.getLayoutParams().height - ((int) nj0Var.getTopOffset())) - nj0Var.getPaddingTop()) - nj0Var.getPaddingBottom();
                view.setLayoutParams(new s4.o0(topOffset - org.telegram.messenger.i0.L(12.0f), topOffset));
                return new dk0(view);
            case 1:
                org.telegram.ui.iu iuVar = (org.telegram.ui.iu) obj;
                org.telegram.ui.ActionBar.p6 p6Var = iuVar.n2;
                if (i10 == 0) {
                    Context context = iuVar.getContext();
                    int[] iArr = org.telegram.ui.lu.s;
                    org.telegram.ui.gu guVar = new org.telegram.ui.gu(this, context, iArr.length, iArr, org.telegram.ui.lu.w);
                    iuVar.u3 = guVar;
                    guVar.setInterceptTouch(false);
                    View view4 = iuVar.u3;
                    view4.setTag(-33024);
                    view2 = view4;
                } else if (i10 == 1) {
                    Context context2 = iuVar.getContext();
                    org.telegram.ui.ku kuVar = new org.telegram.ui.ku(context2);
                    TextView textView = new TextView(context2);
                    kuVar.a = textView;
                    textView.setGravity(17);
                    textView.setTextSize(1, 13.0f);
                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.y6, null);
                    kuVar.addView(textView, w7.b6.d(-1, -2.0f, org.telegram.messenger.at.E1, 24.0f, 0.0f, 24.0f, 14.0f));
                    kuVar.setTag(-33024);
                    view2 = kuVar;
                } else if (i10 == 3) {
                    view2 = new org.telegram.ui.Cells.b9(iuVar.getContext());
                } else if (i10 == 4) {
                    View p4Var = new org.telegram.ui.Cells.p4(iuVar.getContext());
                    org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, p4Var, p6Var);
                    view2 = p4Var;
                } else if (i10 == 5) {
                    org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(iuVar.getContext());
                    org.telegram.ui.ActionBar.a7.Y(p8Var.getTextView(), org.telegram.ui.ActionBar.t6.p7, p6Var);
                    org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, p8Var, p6Var);
                    view2 = p8Var;
                } else if (i10 == 6) {
                    org.telegram.ui.ju juVar = new org.telegram.ui.ju(iuVar.getContext());
                    juVar.a = new Path();
                    Paint paint = new Paint(1);
                    juVar.b = paint;
                    juVar.c = true;
                    paint.setShadowLayer(org.telegram.messenger.i0.L(1.0f), 0.0f, org.telegram.messenger.i0.L(-0.66f), 251658240);
                    paint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.d6, false));
                    view2 = juVar;
                } else if (i10 != 7) {
                    view2 = new org.telegram.ui.cu(iuVar.v3, iuVar.getContext());
                } else {
                    View bnVar = new bn(iuVar.getContext(), 10);
                    int i17 = org.telegram.ui.ActionBar.t6.d6;
                    int i18 = org.telegram.ui.iu.w3;
                    org.telegram.ui.ActionBar.a7.i(i17, bnVar, iuVar.n2);
                    view2 = bnVar;
                }
                return new dk0(view2);
            default:
                org.telegram.ui.ab0 ab0Var = (org.telegram.ui.ab0) obj;
                Context context3 = viewGroup.getContext();
                if (i10 == 0) {
                    view3 = new org.telegram.ui.Cells.p4(context3);
                } else if (i10 == 1) {
                    view3 = new org.telegram.ui.ya0(ab0Var, context3);
                } else if (i10 == 2) {
                    view3 = new org.telegram.ui.ua0(context3);
                } else if (i10 == 3 || i10 == 4) {
                    view3 = new org.telegram.ui.za0(ab0Var, context3);
                } else if (i10 == 5) {
                    view3 = new org.telegram.ui.Cells.p8(23, context3, null, false, true);
                }
                return new dk0(view3);
        }
    }

    @Override // s4.g0
    public void y(s4.c1 c1Var) {
        int b10;
        switch (this.d) {
            case 0:
                ArrayList arrayList = ((nj0) this.e).d;
                int i10 = c1Var.f;
                if ((i10 == 0 || i10 == 3) && (b10 = c1Var.b()) >= 0 && b10 < arrayList.size()) {
                    ((lj0) c1Var.a).f(((ej0) arrayList.get(b10)).c, false);
                    break;
                }
                break;
        }
    }
}
