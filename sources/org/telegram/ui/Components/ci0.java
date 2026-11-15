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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class ci0 extends rg.b {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ci0(Object obj, int i7) {
        this.d = i7;
        this.e = obj;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        switch (this.d) {
            case 0:
                return false;
            case 1:
                org.telegram.ui.ft ftVar = (org.telegram.ui.ft) ((org.telegram.ui.kt) this.e).k3.get(e1Var.b());
                int i7 = ftVar.a;
                return i7 == 5 || (i7 == 2 && ftVar.h != -1);
            default:
                int i10 = e1Var.f;
                return i10 == 4 || i10 == 3 || i10 == 5;
        }
    }

    @Override // v4.h0
    public final int b() {
        switch (this.d) {
            case 0:
                return ((mi0) this.e).d.size();
            case 1:
                return ((org.telegram.ui.kt) this.e).k3.size();
            default:
                return ((org.telegram.ui.x90) this.e).s.size();
        }
    }

    @Override // v4.h0
    public final int d(int i7) {
        switch (this.d) {
            case 0:
                return ((di0) ((mi0) this.e).d.get(i7)).a;
            case 1:
                return ((org.telegram.ui.ft) ((org.telegram.ui.kt) this.e).k3.get(i7)).a;
            default:
                org.telegram.ui.x90 x90Var = (org.telegram.ui.x90) this.e;
                if (i7 < 0 || i7 >= x90Var.s.size()) {
                    return 2;
                }
                return ((org.telegram.ui.s90) x90Var.s.get(i7)).a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0217  */
    @Override // v4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.e1 e1Var, int i7) {
        Boolean bool;
        boolean z10;
        float f10;
        switch (this.d) {
            case 0:
                int i10 = e1Var.f;
                if (i10 == 0 || i10 == 3) {
                    ki0 ki0Var = (ki0) e1Var.a;
                    ki0Var.setScaleX(1.0f);
                    ki0Var.setScaleY(1.0f);
                    ki0.a(ki0Var, ((di0) ((mi0) this.e).d.get(i7)).c, i7);
                    break;
                }
                break;
            case 1:
                org.telegram.ui.kt ktVar = (org.telegram.ui.kt) this.e;
                ArrayList arrayList = ktVar.k3;
                int b10 = e1Var.b();
                View view = e1Var.a;
                org.telegram.ui.ft ftVar = (org.telegram.ui.ft) arrayList.get(b10);
                int i11 = e1Var.f;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 != 4) {
                                    if (i11 != 5) {
                                        if (i11 == 6) {
                                            ((org.telegram.ui.lt) view).setTop(true);
                                            break;
                                        }
                                    } else {
                                        ((org.telegram.ui.Cells.l8) view).k(ftVar.f.toString(), false);
                                        break;
                                    }
                                } else {
                                    ((org.telegram.ui.Cells.n4) view).setText(ftVar.f);
                                    break;
                                }
                            } else {
                                ((org.telegram.ui.Cells.y8) view).setText(ftVar.f);
                                break;
                            }
                        } else {
                            org.telegram.ui.dt dtVar = (org.telegram.ui.dt) view;
                            int i12 = ftVar.d;
                            int i13 = ftVar.e;
                            int i14 = ftVar.c;
                            CharSequence charSequence = ftVar.f;
                            CharSequence charSequence2 = ftVar.g;
                            int i15 = i7 + 1;
                            boolean z11 = i15 < b() && ((org.telegram.ui.ft) arrayList.get(i15)).a == i11;
                            ImageView imageView = dtVar.a;
                            if (i14 == 0) {
                                imageView.setVisibility(8);
                            } else {
                                imageView.setVisibility(0);
                                boolean q10 = org.telegram.ui.ActionBar.j6.I.q();
                                ea0 ea0Var = new ea0(1);
                                ea0Var.b(i12, i13);
                                ea0Var.b = q10;
                                imageView.setBackground(ea0Var);
                                imageView.setImageResource(i14);
                            }
                            dtVar.b.setText(charSequence);
                            dtVar.d.setText(charSequence2);
                            dtVar.e = z11;
                            dtVar.setWillNotDraw(!z11);
                            int i16 = ftVar.h;
                            if (i16 >= 0) {
                                org.telegram.ui.jt[] jtVarArr = ktVar.o3;
                                if (i16 >= jtVarArr.length || jtVarArr[i16].c > 0) {
                                    bool = Boolean.valueOf(ktVar.q3[i16]);
                                    ImageView imageView2 = dtVar.c;
                                    if (bool == null) {
                                        imageView2.setVisibility(0);
                                        imageView2.animate().rotation(bool.booleanValue() ? 0.0f : 180.0f).setDuration(360L).setInterpolator(er.h).start();
                                        break;
                                    } else {
                                        imageView2.setVisibility(8);
                                        break;
                                    }
                                }
                            }
                            bool = null;
                            ImageView imageView22 = dtVar.c;
                            if (bool == null) {
                            }
                        }
                    } else {
                        ((org.telegram.ui.mt) view).a.setText(ftVar.f);
                        break;
                    }
                } else {
                    ic icVar = (ic) view;
                    if (ktVar.o3 != null) {
                        icVar.f(ktVar.r3, ktVar.f3, ktVar.p3);
                    }
                    ktVar.f3 = false;
                    break;
                }
                break;
            default:
                ArrayList arrayList2 = ((org.telegram.ui.x90) this.e).s;
                if (i7 >= 0 && i7 < arrayList2.size()) {
                    org.telegram.ui.s90 s90Var = (org.telegram.ui.s90) arrayList2.get(i7);
                    int i17 = e1Var.f;
                    View view2 = e1Var.a;
                    if (i17 != 0) {
                        if (i17 != 1) {
                            if (i17 != 2) {
                                if (i17 != 3 && i17 != 4) {
                                    if (i17 == 5) {
                                        org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view2;
                                        if (s90Var.f == 1) {
                                            l8Var.l(s90Var.c, org.telegram.messenger.np.e1().getBoolean("view_animations", true), false);
                                            break;
                                        }
                                    }
                                } else {
                                    int i18 = i7 + 1;
                                    boolean z12 = i18 < arrayList2.size() && ((org.telegram.ui.s90) arrayList2.get(i18)).a != 2;
                                    org.telegram.ui.w90 w90Var = (org.telegram.ui.w90) view2;
                                    Switch r32 = w90Var.f;
                                    ImageView imageView3 = w90Var.e;
                                    h6 h6Var = w90Var.d;
                                    ImageView imageView4 = w90Var.a;
                                    fp fpVar = w90Var.h;
                                    di.ub ubVar = w90Var.c;
                                    int i19 = s90Var.a;
                                    CharSequence charSequence3 = s90Var.c;
                                    int i20 = s90Var.e;
                                    if (i19 == 3) {
                                        fpVar.setVisibility(8);
                                        imageView4.setVisibility(0);
                                        imageView4.setImageResource(s90Var.d);
                                        ubVar.setText(charSequence3);
                                        boolean z13 = Integer.bitCount(i20) > 1;
                                        w90Var.w = z13;
                                        if (z13) {
                                            w90Var.c(s90Var, false);
                                            h6Var.setVisibility(0);
                                            imageView3.setVisibility(0);
                                        } else {
                                            h6Var.setVisibility(8);
                                            imageView3.setVisibility(8);
                                        }
                                        ubVar.setTranslationX(0.0f);
                                        r32.setVisibility(0);
                                        r32.c(org.telegram.messenger.qc.e(i20), false);
                                        z10 = true;
                                        w90Var.r = Integer.bitCount(i20) > 1;
                                    } else {
                                        z10 = true;
                                        fpVar.setVisibility(0);
                                        fpVar.a(org.telegram.messenger.qc.e(i20), false);
                                        imageView4.setVisibility(8);
                                        r32.setVisibility(8);
                                        h6Var.setVisibility(8);
                                        imageView3.setVisibility(8);
                                        ubVar.setText(charSequence3);
                                        ubVar.setTranslationX(org.telegram.messenger.g0.L(41.0f) * (org.telegram.messenger.hd.a0 ? -2.2f : 1.0f));
                                        w90Var.w = false;
                                        w90Var.r = false;
                                    }
                                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) w90Var.b.getLayoutParams();
                                    if (s90Var.a == 3) {
                                        f10 = (org.telegram.messenger.hd.a0 ? 64 : 75) + 4;
                                    } else {
                                        f10 = 8.0f;
                                    }
                                    marginLayoutParams.rightMargin = org.telegram.messenger.g0.L(f10);
                                    w90Var.n = z12;
                                    w90Var.setWillNotDraw((z12 || w90Var.r) ? false : z10);
                                    w90Var.b(org.telegram.messenger.qc.f(), false);
                                    break;
                                }
                            } else {
                                org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view2;
                                CharSequence charSequence4 = s90Var.c;
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
                            ((org.telegram.ui.v90) view2).a();
                            break;
                        }
                    } else {
                        ((org.telegram.ui.Cells.n4) view2).setText(s90Var.c);
                        break;
                    }
                }
                break;
        }
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View view;
        View view2;
        int i10 = this.d;
        final int i11 = 0;
        View view3 = null;
        Object obj = this.e;
        final int i12 = 1;
        switch (i10) {
            case 0:
                mi0 mi0Var = (mi0) obj;
                if (i7 == 1) {
                    mi0Var.S = new FrameLayout(mi0Var.getContext());
                    ug.a1 a1Var = new ug.a1(0, mi0Var.getContext(), null);
                    mi0Var.v0 = a1Var;
                    int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.F8, false);
                    int i13 = org.telegram.ui.ActionBar.j6.h5;
                    a1Var.setColor(i0.a.f(0.7f, x02, org.telegram.ui.ActionBar.j6.x0(null, i13, false)));
                    org.telegram.ui.ActionBar.q6.s(mi0Var.v0, i13, null, PorterDuff.Mode.MULTIPLY);
                    mi0Var.v0.setScaleX(0.0f);
                    mi0Var.v0.setScaleY(0.0f);
                    mi0Var.v0.setPadding(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
                    mi0Var.S.addView(mi0Var.v0, c8.ja.e(26, 26, 17));
                    mi0Var.v0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.bi0
                        public final /* synthetic */ ci0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view4) {
                            switch (i11) {
                                case 0:
                                    ci0 ci0Var = this.b;
                                    ci0Var.getClass();
                                    view4.getLocationOnScreen(new int[2]);
                                    mi0 mi0Var2 = (mi0) ci0Var.e;
                                    view4.getMeasuredWidth();
                                    view4.getMeasuredHeight();
                                    mi0Var2.getClass();
                                    new ug.x0(mi0Var2.u0, 4, true).show();
                                    break;
                                default:
                                    mi0.a((mi0) this.b.e);
                                    break;
                            }
                        }
                    });
                    view = mi0Var.S;
                } else if (i7 != 2) {
                    view = new ki0(mi0Var, mi0Var.getContext());
                } else {
                    mi0Var.T = new ai.j0(mi0Var, mi0Var.getContext());
                    gr grVar = new gr(mi0Var, mi0Var.getContext());
                    mi0Var.w0 = grVar;
                    grVar.setImageResource(R.drawable.msg_reactions_expand);
                    mi0Var.w0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    int i14 = mi0Var.N0;
                    if (i14 == 1 || i14 == 2 || i14 == 4) {
                        mi0Var.w0.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
                    } else {
                        org.telegram.ui.ActionBar.q6.s(mi0Var.w0, org.telegram.ui.ActionBar.j6.h5, null, PorterDuff.Mode.MULTIPLY);
                    }
                    gr grVar2 = mi0Var.w0;
                    int L = org.telegram.messenger.g0.L(28.0f);
                    int i15 = org.telegram.ui.ActionBar.j6.i6;
                    org.telegram.ui.ActionBar.q6.Q(grVar2, org.telegram.ui.ActionBar.j6.j0(L, 0, i0.a.o(org.telegram.ui.ActionBar.j6.x0(null, i15, false), 40)), null, org.telegram.ui.ActionBar.q6.g(i15, 40), null);
                    mi0Var.w0.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
                    mi0Var.w0.setContentDescription(org.telegram.messenger.hd.M0(2131754883, null));
                    mi0Var.T.addView(mi0Var.w0, c8.ja.e(30, 30, 17));
                    mi0Var.w0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.bi0
                        public final /* synthetic */ ci0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view4) {
                            switch (i12) {
                                case 0:
                                    ci0 ci0Var = this.b;
                                    ci0Var.getClass();
                                    view4.getLocationOnScreen(new int[2]);
                                    mi0 mi0Var2 = (mi0) ci0Var.e;
                                    view4.getMeasuredWidth();
                                    view4.getMeasuredHeight();
                                    mi0Var2.getClass();
                                    new ug.x0(mi0Var2.u0, 4, true).show();
                                    break;
                                default:
                                    mi0.a((mi0) this.b.e);
                                    break;
                            }
                        }
                    });
                    view = mi0Var.T;
                }
                int topOffset = ((mi0Var.getLayoutParams().height - ((int) mi0Var.getTopOffset())) - mi0Var.getPaddingTop()) - mi0Var.getPaddingBottom();
                view.setLayoutParams(new v4.p0(topOffset - org.telegram.messenger.g0.L(12.0f), topOffset));
                return new cj0(view);
            case 1:
                org.telegram.ui.kt ktVar = (org.telegram.ui.kt) obj;
                org.telegram.ui.ActionBar.e6 e6Var = ktVar.o2;
                if (i7 == 0) {
                    Context context = ktVar.getContext();
                    int[] iArr = org.telegram.ui.nt.s;
                    org.telegram.ui.ht htVar = new org.telegram.ui.ht(this, context, iArr.length, iArr, org.telegram.ui.nt.w);
                    ktVar.v3 = htVar;
                    htVar.setInterceptTouch(false);
                    View view4 = ktVar.v3;
                    view4.setTag(-33024);
                    view2 = view4;
                } else if (i7 == 1) {
                    Context context2 = ktVar.getContext();
                    org.telegram.ui.mt mtVar = new org.telegram.ui.mt(context2);
                    TextView textView = new TextView(context2);
                    mtVar.a = textView;
                    textView.setGravity(17);
                    textView.setTextSize(1, 13.0f);
                    org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.y6, null);
                    mtVar.addView(textView, c8.ja.d(-1, -2.0f, org.telegram.messenger.ns.E1, 24.0f, 0.0f, 24.0f, 14.0f));
                    mtVar.setTag(-33024);
                    view2 = mtVar;
                } else if (i7 == 3) {
                    view2 = new org.telegram.ui.Cells.y8(ktVar.getContext());
                } else if (i7 == 4) {
                    View n4Var = new org.telegram.ui.Cells.n4(ktVar.getContext());
                    org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, n4Var, e6Var);
                    view2 = n4Var;
                } else if (i7 == 5) {
                    org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(ktVar.getContext());
                    org.telegram.ui.ActionBar.q6.X(l8Var.getTextView(), org.telegram.ui.ActionBar.j6.p7, e6Var);
                    org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, l8Var, e6Var);
                    view2 = l8Var;
                } else if (i7 == 6) {
                    org.telegram.ui.lt ltVar = new org.telegram.ui.lt(ktVar.getContext());
                    ltVar.a = new Path();
                    Paint paint = new Paint(1);
                    ltVar.b = paint;
                    ltVar.c = true;
                    paint.setShadowLayer(org.telegram.messenger.g0.L(1.0f), 0.0f, org.telegram.messenger.g0.L(-0.66f), 251658240);
                    paint.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.d6, false));
                    view2 = ltVar;
                } else if (i7 != 7) {
                    view2 = new org.telegram.ui.dt(ktVar.w3, ktVar.getContext());
                } else {
                    View bnVar = new bn(ktVar.getContext(), 13);
                    int i16 = org.telegram.ui.ActionBar.j6.d6;
                    int i17 = org.telegram.ui.kt.x3;
                    org.telegram.ui.ActionBar.q6.h(i16, bnVar, ktVar.o2);
                    view2 = bnVar;
                }
                return new cj0(view2);
            default:
                org.telegram.ui.x90 x90Var = (org.telegram.ui.x90) obj;
                Context context3 = viewGroup.getContext();
                if (i7 == 0) {
                    view3 = new org.telegram.ui.Cells.n4(context3);
                } else if (i7 == 1) {
                    view3 = new org.telegram.ui.v90(x90Var, context3);
                } else if (i7 == 2) {
                    view3 = new org.telegram.ui.r90(context3);
                } else if (i7 == 3 || i7 == 4) {
                    view3 = new org.telegram.ui.w90(x90Var, context3);
                } else if (i7 == 5) {
                    view3 = new org.telegram.ui.Cells.l8(23, context3, null, false, true);
                }
                return new cj0(view3);
        }
    }

    @Override // v4.h0
    public void y(v4.e1 e1Var) {
        int b10;
        switch (this.d) {
            case 0:
                ArrayList arrayList = ((mi0) this.e).d;
                int i7 = e1Var.f;
                if ((i7 == 0 || i7 == 3) && (b10 = e1Var.b()) >= 0 && b10 < arrayList.size()) {
                    ((ki0) e1Var.a).f(((di0) arrayList.get(b10)).c, false);
                    break;
                }
                break;
        }
    }
}
