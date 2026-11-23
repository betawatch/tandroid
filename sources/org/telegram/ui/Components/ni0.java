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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ni0 extends rg.b {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ni0(Object obj, int i7) {
        this.d = i7;
        this.e = obj;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        switch (this.d) {
            case 0:
                return false;
            case 1:
                org.telegram.ui.gt gtVar = (org.telegram.ui.gt) ((org.telegram.ui.lt) this.e).k3.get(f1Var.b());
                int i7 = gtVar.a;
                return i7 == 5 || (i7 == 2 && gtVar.h != -1);
            default:
                int i10 = f1Var.f;
                return i10 == 4 || i10 == 3 || i10 == 5;
        }
    }

    @Override // v4.i0
    public final int b() {
        switch (this.d) {
            case 0:
                return ((xi0) this.e).d.size();
            case 1:
                return ((org.telegram.ui.lt) this.e).k3.size();
            default:
                return ((org.telegram.ui.y90) this.e).s.size();
        }
    }

    @Override // v4.i0
    public final int d(int i7) {
        switch (this.d) {
            case 0:
                return ((oi0) ((xi0) this.e).d.get(i7)).a;
            case 1:
                return ((org.telegram.ui.gt) ((org.telegram.ui.lt) this.e).k3.get(i7)).a;
            default:
                org.telegram.ui.y90 y90Var = (org.telegram.ui.y90) this.e;
                if (i7 < 0 || i7 >= y90Var.s.size()) {
                    return 2;
                }
                return ((org.telegram.ui.t90) y90Var.s.get(i7)).a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0217  */
    @Override // v4.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.f1 f1Var, int i7) {
        Boolean bool;
        boolean z10;
        float f10;
        switch (this.d) {
            case 0:
                int i10 = f1Var.f;
                if (i10 == 0 || i10 == 3) {
                    vi0 vi0Var = (vi0) f1Var.a;
                    vi0Var.setScaleX(1.0f);
                    vi0Var.setScaleY(1.0f);
                    vi0.a(vi0Var, ((oi0) ((xi0) this.e).d.get(i7)).c, i7);
                    break;
                }
                break;
            case 1:
                org.telegram.ui.lt ltVar = (org.telegram.ui.lt) this.e;
                ArrayList arrayList = ltVar.k3;
                int b10 = f1Var.b();
                View view = f1Var.a;
                org.telegram.ui.gt gtVar = (org.telegram.ui.gt) arrayList.get(b10);
                int i11 = f1Var.f;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 != 4) {
                                    if (i11 != 5) {
                                        if (i11 == 6) {
                                            ((org.telegram.ui.mt) view).setTop(true);
                                            break;
                                        }
                                    } else {
                                        ((org.telegram.ui.Cells.m8) view).k(gtVar.f.toString(), false);
                                        break;
                                    }
                                } else {
                                    ((org.telegram.ui.Cells.o4) view).setText(gtVar.f);
                                    break;
                                }
                            } else {
                                ((org.telegram.ui.Cells.z8) view).setText(gtVar.f);
                                break;
                            }
                        } else {
                            org.telegram.ui.et etVar = (org.telegram.ui.et) view;
                            int i12 = gtVar.d;
                            int i13 = gtVar.e;
                            int i14 = gtVar.c;
                            CharSequence charSequence = gtVar.f;
                            CharSequence charSequence2 = gtVar.g;
                            int i15 = i7 + 1;
                            boolean z11 = i15 < b() && ((org.telegram.ui.gt) arrayList.get(i15)).a == i11;
                            ImageView imageView = etVar.a;
                            if (i14 == 0) {
                                imageView.setVisibility(8);
                            } else {
                                imageView.setVisibility(0);
                                boolean q10 = org.telegram.ui.ActionBar.n6.I.q();
                                oa0 oa0Var = new oa0(1);
                                oa0Var.b(i12, i13);
                                oa0Var.b = q10;
                                imageView.setBackground(oa0Var);
                                imageView.setImageResource(i14);
                            }
                            etVar.b.setText(charSequence);
                            etVar.d.setText(charSequence2);
                            etVar.e = z11;
                            etVar.setWillNotDraw(!z11);
                            int i16 = gtVar.h;
                            if (i16 >= 0) {
                                org.telegram.ui.kt[] ktVarArr = ltVar.o3;
                                if (i16 >= ktVarArr.length || ktVarArr[i16].c > 0) {
                                    bool = Boolean.valueOf(ltVar.q3[i16]);
                                    ImageView imageView2 = etVar.c;
                                    if (bool == null) {
                                        imageView2.setVisibility(0);
                                        imageView2.animate().rotation(bool.booleanValue() ? 0.0f : 180.0f).setDuration(360L).setInterpolator(kr.h).start();
                                        break;
                                    } else {
                                        imageView2.setVisibility(8);
                                        break;
                                    }
                                }
                            }
                            bool = null;
                            ImageView imageView22 = etVar.c;
                            if (bool == null) {
                            }
                        }
                    } else {
                        ((org.telegram.ui.nt) view).a.setText(gtVar.f);
                        break;
                    }
                } else {
                    qc qcVar = (qc) view;
                    if (ltVar.o3 != null) {
                        qcVar.f(ltVar.r3, ltVar.f3, ltVar.p3);
                    }
                    ltVar.f3 = false;
                    break;
                }
                break;
            default:
                ArrayList arrayList2 = ((org.telegram.ui.y90) this.e).s;
                if (i7 >= 0 && i7 < arrayList2.size()) {
                    org.telegram.ui.t90 t90Var = (org.telegram.ui.t90) arrayList2.get(i7);
                    int i17 = f1Var.f;
                    View view2 = f1Var.a;
                    if (i17 != 0) {
                        if (i17 != 1) {
                            if (i17 != 2) {
                                if (i17 != 3 && i17 != 4) {
                                    if (i17 == 5) {
                                        org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view2;
                                        if (t90Var.f == 1) {
                                            m8Var.l(t90Var.c, org.telegram.messenger.mp.g1().getBoolean("view_animations", true), false);
                                            break;
                                        }
                                    }
                                } else {
                                    int i18 = i7 + 1;
                                    boolean z12 = i18 < arrayList2.size() && ((org.telegram.ui.t90) arrayList2.get(i18)).a != 2;
                                    org.telegram.ui.x90 x90Var = (org.telegram.ui.x90) view2;
                                    Switch r32 = x90Var.f;
                                    ImageView imageView3 = x90Var.e;
                                    n6 n6Var = x90Var.d;
                                    ImageView imageView4 = x90Var.a;
                                    lp lpVar = x90Var.h;
                                    di.xb xbVar = x90Var.c;
                                    int i19 = t90Var.a;
                                    CharSequence charSequence3 = t90Var.c;
                                    int i20 = t90Var.e;
                                    if (i19 == 3) {
                                        lpVar.setVisibility(8);
                                        imageView4.setVisibility(0);
                                        imageView4.setImageResource(t90Var.d);
                                        xbVar.setText(charSequence3);
                                        boolean z13 = Integer.bitCount(i20) > 1;
                                        x90Var.w = z13;
                                        if (z13) {
                                            x90Var.c(t90Var, false);
                                            n6Var.setVisibility(0);
                                            imageView3.setVisibility(0);
                                        } else {
                                            n6Var.setVisibility(8);
                                            imageView3.setVisibility(8);
                                        }
                                        xbVar.setTranslationX(0.0f);
                                        r32.setVisibility(0);
                                        r32.c(org.telegram.messenger.pc.e(i20), false);
                                        z10 = true;
                                        x90Var.r = Integer.bitCount(i20) > 1;
                                    } else {
                                        z10 = true;
                                        lpVar.setVisibility(0);
                                        lpVar.a(org.telegram.messenger.pc.e(i20), false);
                                        imageView4.setVisibility(8);
                                        r32.setVisibility(8);
                                        n6Var.setVisibility(8);
                                        imageView3.setVisibility(8);
                                        xbVar.setText(charSequence3);
                                        xbVar.setTranslationX(org.telegram.messenger.g0.L(41.0f) * (org.telegram.messenger.gd.a0 ? -2.2f : 1.0f));
                                        x90Var.w = false;
                                        x90Var.r = false;
                                    }
                                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) x90Var.b.getLayoutParams();
                                    if (t90Var.a == 3) {
                                        f10 = (org.telegram.messenger.gd.a0 ? 64 : 75) + 4;
                                    } else {
                                        f10 = 8.0f;
                                    }
                                    marginLayoutParams.rightMargin = org.telegram.messenger.g0.L(f10);
                                    x90Var.n = z12;
                                    x90Var.setWillNotDraw((z12 || x90Var.r) ? false : z10);
                                    x90Var.b(org.telegram.messenger.pc.f(), false);
                                    break;
                                }
                            } else {
                                org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view2;
                                CharSequence charSequence4 = t90Var.c;
                                if (TextUtils.isEmpty(charSequence4)) {
                                    z8Var.setFixedSize(12);
                                } else {
                                    z8Var.setFixedSize(0);
                                }
                                z8Var.setText(charSequence4);
                                z8Var.setContentDescription(charSequence4);
                                z8Var.setBackground(null);
                                break;
                            }
                        } else {
                            ((org.telegram.ui.w90) view2).a();
                            break;
                        }
                    } else {
                        ((org.telegram.ui.Cells.o4) view2).setText(t90Var.c);
                        break;
                    }
                }
                break;
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View view;
        View view2;
        int i10 = this.d;
        final int i11 = 0;
        View view3 = null;
        Object obj = this.e;
        final int i12 = 1;
        switch (i10) {
            case 0:
                xi0 xi0Var = (xi0) obj;
                if (i7 == 1) {
                    xi0Var.S = new FrameLayout(xi0Var.getContext());
                    ug.b1 b1Var = new ug.b1(0, xi0Var.getContext(), null);
                    xi0Var.v0 = b1Var;
                    int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.F8, false);
                    int i13 = org.telegram.ui.ActionBar.n6.h5;
                    b1Var.setColor(i0.a.f(0.7f, x02, org.telegram.ui.ActionBar.n6.x0(null, i13, false)));
                    org.telegram.ui.ActionBar.u6.s(xi0Var.v0, i13, null, PorterDuff.Mode.MULTIPLY);
                    xi0Var.v0.setScaleX(0.0f);
                    xi0Var.v0.setScaleY(0.0f);
                    xi0Var.v0.setPadding(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
                    xi0Var.S.addView(xi0Var.v0, c8.na.e(26, 26, 17));
                    xi0Var.v0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.mi0
                        public final /* synthetic */ ni0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view4) {
                            switch (i11) {
                                case 0:
                                    ni0 ni0Var = this.b;
                                    ni0Var.getClass();
                                    view4.getLocationOnScreen(new int[2]);
                                    xi0 xi0Var2 = (xi0) ni0Var.e;
                                    view4.getMeasuredWidth();
                                    view4.getMeasuredHeight();
                                    xi0Var2.getClass();
                                    new ug.y0(xi0Var2.u0, 4, true).show();
                                    break;
                                default:
                                    xi0.a((xi0) this.b.e);
                                    break;
                            }
                        }
                    });
                    view = xi0Var.S;
                } else if (i7 != 2) {
                    view = new vi0(xi0Var, xi0Var.getContext());
                } else {
                    xi0Var.T = new ai.h0(xi0Var, xi0Var.getContext());
                    mr mrVar = new mr(xi0Var, xi0Var.getContext());
                    xi0Var.w0 = mrVar;
                    mrVar.setImageResource(R.drawable.msg_reactions_expand);
                    xi0Var.w0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    int i14 = xi0Var.N0;
                    if (i14 == 1 || i14 == 2 || i14 == 4) {
                        xi0Var.w0.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
                    } else {
                        org.telegram.ui.ActionBar.u6.s(xi0Var.w0, org.telegram.ui.ActionBar.n6.h5, null, PorterDuff.Mode.MULTIPLY);
                    }
                    mr mrVar2 = xi0Var.w0;
                    int L = org.telegram.messenger.g0.L(28.0f);
                    int i15 = org.telegram.ui.ActionBar.n6.i6;
                    org.telegram.ui.ActionBar.u6.Q(mrVar2, org.telegram.ui.ActionBar.n6.j0(L, 0, i0.a.o(org.telegram.ui.ActionBar.n6.x0(null, i15, false), 40)), null, org.telegram.ui.ActionBar.u6.g(i15, 40), null);
                    xi0Var.w0.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
                    xi0Var.w0.setContentDescription(org.telegram.messenger.gd.N0(2131754883, null));
                    xi0Var.T.addView(xi0Var.w0, c8.na.e(30, 30, 17));
                    xi0Var.w0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.mi0
                        public final /* synthetic */ ni0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view4) {
                            switch (i12) {
                                case 0:
                                    ni0 ni0Var = this.b;
                                    ni0Var.getClass();
                                    view4.getLocationOnScreen(new int[2]);
                                    xi0 xi0Var2 = (xi0) ni0Var.e;
                                    view4.getMeasuredWidth();
                                    view4.getMeasuredHeight();
                                    xi0Var2.getClass();
                                    new ug.y0(xi0Var2.u0, 4, true).show();
                                    break;
                                default:
                                    xi0.a((xi0) this.b.e);
                                    break;
                            }
                        }
                    });
                    view = xi0Var.T;
                }
                int topOffset = ((xi0Var.getLayoutParams().height - ((int) xi0Var.getTopOffset())) - xi0Var.getPaddingTop()) - xi0Var.getPaddingBottom();
                view.setLayoutParams(new v4.q0(topOffset - org.telegram.messenger.g0.L(12.0f), topOffset));
                return new mj0(view);
            case 1:
                org.telegram.ui.lt ltVar = (org.telegram.ui.lt) obj;
                org.telegram.ui.ActionBar.i6 i6Var = ltVar.o2;
                if (i7 == 0) {
                    Context context = ltVar.getContext();
                    int[] iArr = org.telegram.ui.ot.s;
                    org.telegram.ui.jt jtVar = new org.telegram.ui.jt(this, context, iArr.length, iArr, org.telegram.ui.ot.w);
                    ltVar.v3 = jtVar;
                    jtVar.setInterceptTouch(false);
                    View view4 = ltVar.v3;
                    view4.setTag(-33024);
                    view2 = view4;
                } else if (i7 == 1) {
                    Context context2 = ltVar.getContext();
                    org.telegram.ui.nt ntVar = new org.telegram.ui.nt(context2);
                    TextView textView = new TextView(context2);
                    ntVar.a = textView;
                    textView.setGravity(17);
                    textView.setTextSize(1, 13.0f);
                    org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.y6, null);
                    ntVar.addView(textView, c8.na.d(-1, -2.0f, org.telegram.messenger.ks.E1, 24.0f, 0.0f, 24.0f, 14.0f));
                    ntVar.setTag(-33024);
                    view2 = ntVar;
                } else if (i7 == 3) {
                    view2 = new org.telegram.ui.Cells.z8(ltVar.getContext());
                } else if (i7 == 4) {
                    View o4Var = new org.telegram.ui.Cells.o4(ltVar.getContext());
                    org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, o4Var, i6Var);
                    view2 = o4Var;
                } else if (i7 == 5) {
                    org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(ltVar.getContext());
                    org.telegram.ui.ActionBar.u6.X(m8Var.getTextView(), org.telegram.ui.ActionBar.n6.p7, i6Var);
                    org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, m8Var, i6Var);
                    view2 = m8Var;
                } else if (i7 == 6) {
                    org.telegram.ui.mt mtVar = new org.telegram.ui.mt(ltVar.getContext());
                    mtVar.a = new Path();
                    Paint paint = new Paint(1);
                    mtVar.b = paint;
                    mtVar.c = true;
                    paint.setShadowLayer(org.telegram.messenger.g0.L(1.0f), 0.0f, org.telegram.messenger.g0.L(-0.66f), 251658240);
                    paint.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.d6, false));
                    view2 = mtVar;
                } else if (i7 != 7) {
                    view2 = new org.telegram.ui.et(ltVar.w3, ltVar.getContext());
                } else {
                    View inVar = new in(ltVar.getContext(), 13);
                    int i16 = org.telegram.ui.ActionBar.n6.d6;
                    int i17 = org.telegram.ui.lt.x3;
                    org.telegram.ui.ActionBar.u6.h(i16, inVar, ltVar.o2);
                    view2 = inVar;
                }
                return new mj0(view2);
            default:
                org.telegram.ui.y90 y90Var = (org.telegram.ui.y90) obj;
                Context context3 = viewGroup.getContext();
                if (i7 == 0) {
                    view3 = new org.telegram.ui.Cells.o4(context3);
                } else if (i7 == 1) {
                    view3 = new org.telegram.ui.w90(y90Var, context3);
                } else if (i7 == 2) {
                    view3 = new org.telegram.ui.s90(context3);
                } else if (i7 == 3 || i7 == 4) {
                    view3 = new org.telegram.ui.x90(y90Var, context3);
                } else if (i7 == 5) {
                    view3 = new org.telegram.ui.Cells.m8(23, context3, null, false, true);
                }
                return new mj0(view3);
        }
    }

    @Override // v4.i0
    public void y(v4.f1 f1Var) {
        int b10;
        switch (this.d) {
            case 0:
                ArrayList arrayList = ((xi0) this.e).d;
                int i7 = f1Var.f;
                if ((i7 == 0 || i7 == 3) && (b10 = f1Var.b()) >= 0 && b10 < arrayList.size()) {
                    ((vi0) f1Var.a).f(((oi0) arrayList.get(b10)).c, false);
                    break;
                }
                break;
        }
    }
}
