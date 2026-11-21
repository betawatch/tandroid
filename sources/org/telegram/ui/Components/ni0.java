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

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
                org.telegram.ui.ht htVar = (org.telegram.ui.ht) ((org.telegram.ui.mt) this.e).k3.get(f1Var.b());
                int i7 = htVar.a;
                return i7 == 5 || (i7 == 2 && htVar.h != -1);
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
                return ((org.telegram.ui.mt) this.e).k3.size();
            default:
                return ((org.telegram.ui.z90) this.e).s.size();
        }
    }

    @Override // v4.i0
    public final int d(int i7) {
        switch (this.d) {
            case 0:
                return ((oi0) ((xi0) this.e).d.get(i7)).a;
            case 1:
                return ((org.telegram.ui.ht) ((org.telegram.ui.mt) this.e).k3.get(i7)).a;
            default:
                org.telegram.ui.z90 z90Var = (org.telegram.ui.z90) this.e;
                if (i7 < 0 || i7 >= z90Var.s.size()) {
                    return 2;
                }
                return ((org.telegram.ui.u90) z90Var.s.get(i7)).a;
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
                org.telegram.ui.mt mtVar = (org.telegram.ui.mt) this.e;
                ArrayList arrayList = mtVar.k3;
                int b10 = f1Var.b();
                View view = f1Var.a;
                org.telegram.ui.ht htVar = (org.telegram.ui.ht) arrayList.get(b10);
                int i11 = f1Var.f;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 != 4) {
                                    if (i11 != 5) {
                                        if (i11 == 6) {
                                            ((org.telegram.ui.nt) view).setTop(true);
                                            break;
                                        }
                                    } else {
                                        ((org.telegram.ui.Cells.n8) view).k(htVar.f.toString(), false);
                                        break;
                                    }
                                } else {
                                    ((org.telegram.ui.Cells.o4) view).setText(htVar.f);
                                    break;
                                }
                            } else {
                                ((org.telegram.ui.Cells.a9) view).setText(htVar.f);
                                break;
                            }
                        } else {
                            org.telegram.ui.ft ftVar = (org.telegram.ui.ft) view;
                            int i12 = htVar.d;
                            int i13 = htVar.e;
                            int i14 = htVar.c;
                            CharSequence charSequence = htVar.f;
                            CharSequence charSequence2 = htVar.g;
                            int i15 = i7 + 1;
                            boolean z11 = i15 < b() && ((org.telegram.ui.ht) arrayList.get(i15)).a == i11;
                            ImageView imageView = ftVar.a;
                            if (i14 == 0) {
                                imageView.setVisibility(8);
                            } else {
                                imageView.setVisibility(0);
                                boolean q10 = org.telegram.ui.ActionBar.m6.I.q();
                                ra0 ra0Var = new ra0(1);
                                ra0Var.b(i12, i13);
                                ra0Var.b = q10;
                                imageView.setBackground(ra0Var);
                                imageView.setImageResource(i14);
                            }
                            ftVar.b.setText(charSequence);
                            ftVar.d.setText(charSequence2);
                            ftVar.e = z11;
                            ftVar.setWillNotDraw(!z11);
                            int i16 = htVar.h;
                            if (i16 >= 0) {
                                org.telegram.ui.lt[] ltVarArr = mtVar.o3;
                                if (i16 >= ltVarArr.length || ltVarArr[i16].c > 0) {
                                    bool = Boolean.valueOf(mtVar.q3[i16]);
                                    ImageView imageView2 = ftVar.c;
                                    if (bool == null) {
                                        imageView2.setVisibility(0);
                                        imageView2.animate().rotation(bool.booleanValue() ? 0.0f : 180.0f).setDuration(360L).setInterpolator(nr.h).start();
                                        break;
                                    } else {
                                        imageView2.setVisibility(8);
                                        break;
                                    }
                                }
                            }
                            bool = null;
                            ImageView imageView22 = ftVar.c;
                            if (bool == null) {
                            }
                        }
                    } else {
                        ((org.telegram.ui.ot) view).a.setText(htVar.f);
                        break;
                    }
                } else {
                    rc rcVar = (rc) view;
                    if (mtVar.o3 != null) {
                        rcVar.f(mtVar.r3, mtVar.f3, mtVar.p3);
                    }
                    mtVar.f3 = false;
                    break;
                }
                break;
            default:
                ArrayList arrayList2 = ((org.telegram.ui.z90) this.e).s;
                if (i7 >= 0 && i7 < arrayList2.size()) {
                    org.telegram.ui.u90 u90Var = (org.telegram.ui.u90) arrayList2.get(i7);
                    int i17 = f1Var.f;
                    View view2 = f1Var.a;
                    if (i17 != 0) {
                        if (i17 != 1) {
                            if (i17 != 2) {
                                if (i17 != 3 && i17 != 4) {
                                    if (i17 == 5) {
                                        org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view2;
                                        if (u90Var.f == 1) {
                                            n8Var.l(u90Var.c, org.telegram.messenger.mp.g1().getBoolean("view_animations", true), false);
                                            break;
                                        }
                                    }
                                } else {
                                    int i18 = i7 + 1;
                                    boolean z12 = i18 < arrayList2.size() && ((org.telegram.ui.u90) arrayList2.get(i18)).a != 2;
                                    org.telegram.ui.y90 y90Var = (org.telegram.ui.y90) view2;
                                    Switch r32 = y90Var.f;
                                    ImageView imageView3 = y90Var.e;
                                    o6 o6Var = y90Var.d;
                                    ImageView imageView4 = y90Var.a;
                                    op opVar = y90Var.h;
                                    di.xb xbVar = y90Var.c;
                                    int i19 = u90Var.a;
                                    CharSequence charSequence3 = u90Var.c;
                                    int i20 = u90Var.e;
                                    if (i19 == 3) {
                                        opVar.setVisibility(8);
                                        imageView4.setVisibility(0);
                                        imageView4.setImageResource(u90Var.d);
                                        xbVar.setText(charSequence3);
                                        boolean z13 = Integer.bitCount(i20) > 1;
                                        y90Var.w = z13;
                                        if (z13) {
                                            y90Var.c(u90Var, false);
                                            o6Var.setVisibility(0);
                                            imageView3.setVisibility(0);
                                        } else {
                                            o6Var.setVisibility(8);
                                            imageView3.setVisibility(8);
                                        }
                                        xbVar.setTranslationX(0.0f);
                                        r32.setVisibility(0);
                                        r32.c(org.telegram.messenger.pc.e(i20), false);
                                        z10 = true;
                                        y90Var.r = Integer.bitCount(i20) > 1;
                                    } else {
                                        z10 = true;
                                        opVar.setVisibility(0);
                                        opVar.a(org.telegram.messenger.pc.e(i20), false);
                                        imageView4.setVisibility(8);
                                        r32.setVisibility(8);
                                        o6Var.setVisibility(8);
                                        imageView3.setVisibility(8);
                                        xbVar.setText(charSequence3);
                                        xbVar.setTranslationX(org.telegram.messenger.g0.L(41.0f) * (org.telegram.messenger.gd.a0 ? -2.2f : 1.0f));
                                        y90Var.w = false;
                                        y90Var.r = false;
                                    }
                                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) y90Var.b.getLayoutParams();
                                    if (u90Var.a == 3) {
                                        f10 = (org.telegram.messenger.gd.a0 ? 64 : 75) + 4;
                                    } else {
                                        f10 = 8.0f;
                                    }
                                    marginLayoutParams.rightMargin = org.telegram.messenger.g0.L(f10);
                                    y90Var.n = z12;
                                    y90Var.setWillNotDraw((z12 || y90Var.r) ? false : z10);
                                    y90Var.b(org.telegram.messenger.pc.f(), false);
                                    break;
                                }
                            } else {
                                org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view2;
                                CharSequence charSequence4 = u90Var.c;
                                if (TextUtils.isEmpty(charSequence4)) {
                                    a9Var.setFixedSize(12);
                                } else {
                                    a9Var.setFixedSize(0);
                                }
                                a9Var.setText(charSequence4);
                                a9Var.setContentDescription(charSequence4);
                                a9Var.setBackground(null);
                                break;
                            }
                        } else {
                            ((org.telegram.ui.x90) view2).a();
                            break;
                        }
                    } else {
                        ((org.telegram.ui.Cells.o4) view2).setText(u90Var.c);
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
                    int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.F8, false);
                    int i13 = org.telegram.ui.ActionBar.m6.h5;
                    b1Var.setColor(i0.a.f(0.7f, x02, org.telegram.ui.ActionBar.m6.x0(null, i13, false)));
                    org.telegram.ui.ActionBar.t6.s(xi0Var.v0, i13, null, PorterDuff.Mode.MULTIPLY);
                    xi0Var.v0.setScaleX(0.0f);
                    xi0Var.v0.setScaleY(0.0f);
                    xi0Var.v0.setPadding(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
                    xi0Var.S.addView(xi0Var.v0, c8.ma.e(26, 26, 17));
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
                    xi0Var.T = new ai.l0(xi0Var, xi0Var.getContext());
                    pr prVar = new pr(xi0Var, xi0Var.getContext());
                    xi0Var.w0 = prVar;
                    prVar.setImageResource(R.drawable.msg_reactions_expand);
                    xi0Var.w0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    int i14 = xi0Var.N0;
                    if (i14 == 1 || i14 == 2 || i14 == 4) {
                        xi0Var.w0.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
                    } else {
                        org.telegram.ui.ActionBar.t6.s(xi0Var.w0, org.telegram.ui.ActionBar.m6.h5, null, PorterDuff.Mode.MULTIPLY);
                    }
                    pr prVar2 = xi0Var.w0;
                    int L = org.telegram.messenger.g0.L(28.0f);
                    int i15 = org.telegram.ui.ActionBar.m6.i6;
                    org.telegram.ui.ActionBar.t6.Q(prVar2, org.telegram.ui.ActionBar.m6.j0(L, 0, i0.a.o(org.telegram.ui.ActionBar.m6.x0(null, i15, false), 40)), null, org.telegram.ui.ActionBar.t6.g(i15, 40), null);
                    xi0Var.w0.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
                    xi0Var.w0.setContentDescription(org.telegram.messenger.gd.N0(2131754883, null));
                    xi0Var.T.addView(xi0Var.w0, c8.ma.e(30, 30, 17));
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
                org.telegram.ui.mt mtVar = (org.telegram.ui.mt) obj;
                org.telegram.ui.ActionBar.h6 h6Var = mtVar.o2;
                if (i7 == 0) {
                    Context context = mtVar.getContext();
                    int[] iArr = org.telegram.ui.pt.s;
                    org.telegram.ui.kt ktVar = new org.telegram.ui.kt(this, context, iArr.length, iArr, org.telegram.ui.pt.w);
                    mtVar.v3 = ktVar;
                    ktVar.setInterceptTouch(false);
                    View view4 = mtVar.v3;
                    view4.setTag(-33024);
                    view2 = view4;
                } else if (i7 == 1) {
                    Context context2 = mtVar.getContext();
                    org.telegram.ui.ot otVar = new org.telegram.ui.ot(context2);
                    TextView textView = new TextView(context2);
                    otVar.a = textView;
                    textView.setGravity(17);
                    textView.setTextSize(1, 13.0f);
                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.y6, null);
                    otVar.addView(textView, c8.ma.d(-1, -2.0f, org.telegram.messenger.ks.E1, 24.0f, 0.0f, 24.0f, 14.0f));
                    otVar.setTag(-33024);
                    view2 = otVar;
                } else if (i7 == 3) {
                    view2 = new org.telegram.ui.Cells.a9(mtVar.getContext());
                } else if (i7 == 4) {
                    View o4Var = new org.telegram.ui.Cells.o4(mtVar.getContext());
                    org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, o4Var, h6Var);
                    view2 = o4Var;
                } else if (i7 == 5) {
                    org.telegram.ui.Cells.n8 n8Var = new org.telegram.ui.Cells.n8(mtVar.getContext());
                    org.telegram.ui.ActionBar.t6.X(n8Var.getTextView(), org.telegram.ui.ActionBar.m6.p7, h6Var);
                    org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, n8Var, h6Var);
                    view2 = n8Var;
                } else if (i7 == 6) {
                    org.telegram.ui.nt ntVar = new org.telegram.ui.nt(mtVar.getContext());
                    ntVar.a = new Path();
                    Paint paint = new Paint(1);
                    ntVar.b = paint;
                    ntVar.c = true;
                    paint.setShadowLayer(org.telegram.messenger.g0.L(1.0f), 0.0f, org.telegram.messenger.g0.L(-0.66f), 251658240);
                    paint.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.d6, false));
                    view2 = ntVar;
                } else if (i7 != 7) {
                    view2 = new org.telegram.ui.ft(mtVar.w3, mtVar.getContext());
                } else {
                    View lnVar = new ln(mtVar.getContext(), 13);
                    int i16 = org.telegram.ui.ActionBar.m6.d6;
                    int i17 = org.telegram.ui.mt.x3;
                    org.telegram.ui.ActionBar.t6.h(i16, lnVar, mtVar.o2);
                    view2 = lnVar;
                }
                return new mj0(view2);
            default:
                org.telegram.ui.z90 z90Var = (org.telegram.ui.z90) obj;
                Context context3 = viewGroup.getContext();
                if (i7 == 0) {
                    view3 = new org.telegram.ui.Cells.o4(context3);
                } else if (i7 == 1) {
                    view3 = new org.telegram.ui.x90(z90Var, context3);
                } else if (i7 == 2) {
                    view3 = new org.telegram.ui.t90(context3);
                } else if (i7 == 3 || i7 == 4) {
                    view3 = new org.telegram.ui.y90(z90Var, context3);
                } else if (i7 == 5) {
                    view3 = new org.telegram.ui.Cells.n8(23, context3, null, false, true);
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
