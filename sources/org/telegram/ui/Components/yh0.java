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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class yh0 extends rg.b {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ yh0(Object obj, int i7) {
        this.d = i7;
        this.e = obj;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        switch (this.d) {
            case 0:
                return false;
            case 1:
                org.telegram.ui.ft ftVar = (org.telegram.ui.ft) ((org.telegram.ui.kt) this.e).j3.get(d1Var.b());
                int i7 = ftVar.a;
                return i7 == 5 || (i7 == 2 && ftVar.h != -1);
            default:
                int i10 = d1Var.f;
                return i10 == 4 || i10 == 3 || i10 == 5;
        }
    }

    @Override // v4.g0
    public final int b() {
        switch (this.d) {
            case 0:
                return ((ii0) this.e).d.size();
            case 1:
                return ((org.telegram.ui.kt) this.e).j3.size();
            default:
                return ((org.telegram.ui.z90) this.e).s.size();
        }
    }

    @Override // v4.g0
    public final int d(int i7) {
        switch (this.d) {
            case 0:
                return ((zh0) ((ii0) this.e).d.get(i7)).a;
            case 1:
                return ((org.telegram.ui.ft) ((org.telegram.ui.kt) this.e).j3.get(i7)).a;
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
    @Override // v4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.d1 d1Var, int i7) {
        Boolean bool;
        boolean z9;
        float f10;
        switch (this.d) {
            case 0:
                int i10 = d1Var.f;
                if (i10 == 0 || i10 == 3) {
                    gi0 gi0Var = (gi0) d1Var.a;
                    gi0Var.setScaleX(1.0f);
                    gi0Var.setScaleY(1.0f);
                    gi0.a(gi0Var, ((zh0) ((ii0) this.e).d.get(i7)).c, i7);
                    break;
                }
                break;
            case 1:
                org.telegram.ui.kt ktVar = (org.telegram.ui.kt) this.e;
                ArrayList arrayList = ktVar.j3;
                int b10 = d1Var.b();
                View view = d1Var.a;
                org.telegram.ui.ft ftVar = (org.telegram.ui.ft) arrayList.get(b10);
                int i11 = d1Var.f;
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
                                        ((org.telegram.ui.Cells.m8) view).k(ftVar.f.toString(), false);
                                        break;
                                    }
                                } else {
                                    ((org.telegram.ui.Cells.n4) view).setText(ftVar.f);
                                    break;
                                }
                            } else {
                                ((org.telegram.ui.Cells.z8) view).setText(ftVar.f);
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
                            boolean z10 = i15 < b() && ((org.telegram.ui.ft) arrayList.get(i15)).a == i11;
                            ImageView imageView = dtVar.a;
                            if (i14 == 0) {
                                imageView.setVisibility(8);
                            } else {
                                imageView.setVisibility(0);
                                boolean q10 = org.telegram.ui.ActionBar.m6.I.q();
                                da0 da0Var = new da0(1);
                                da0Var.b(i12, i13);
                                da0Var.b = q10;
                                imageView.setBackground(da0Var);
                                imageView.setImageResource(i14);
                            }
                            dtVar.b.setText(charSequence);
                            dtVar.d.setText(charSequence2);
                            dtVar.e = z10;
                            dtVar.setWillNotDraw(!z10);
                            int i16 = ftVar.h;
                            if (i16 >= 0) {
                                org.telegram.ui.jt[] jtVarArr = ktVar.n3;
                                if (i16 >= jtVarArr.length || jtVarArr[i16].c > 0) {
                                    bool = Boolean.valueOf(ktVar.p3[i16]);
                                    ImageView imageView2 = dtVar.c;
                                    if (bool == null) {
                                        imageView2.setVisibility(0);
                                        imageView2.animate().rotation(bool.booleanValue() ? 0.0f : 180.0f).setDuration(360L).setInterpolator(wq.h).start();
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
                    mc mcVar = (mc) view;
                    if (ktVar.n3 != null) {
                        mcVar.f(ktVar.q3, ktVar.e3, ktVar.o3);
                    }
                    ktVar.e3 = false;
                    break;
                }
                break;
            default:
                ArrayList arrayList2 = ((org.telegram.ui.z90) this.e).s;
                if (i7 >= 0 && i7 < arrayList2.size()) {
                    org.telegram.ui.u90 u90Var = (org.telegram.ui.u90) arrayList2.get(i7);
                    int i17 = d1Var.f;
                    View view2 = d1Var.a;
                    if (i17 != 0) {
                        if (i17 != 1) {
                            if (i17 != 2) {
                                if (i17 != 3 && i17 != 4) {
                                    if (i17 == 5) {
                                        org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view2;
                                        if (u90Var.f == 1) {
                                            m8Var.l(u90Var.c, org.telegram.messenger.qp.e1().getBoolean("view_animations", true), false);
                                            break;
                                        }
                                    }
                                } else {
                                    int i18 = i7 + 1;
                                    boolean z11 = i18 < arrayList2.size() && ((org.telegram.ui.u90) arrayList2.get(i18)).a != 2;
                                    org.telegram.ui.y90 y90Var = (org.telegram.ui.y90) view2;
                                    Switch r32 = y90Var.f;
                                    ImageView imageView3 = y90Var.e;
                                    i6 i6Var = y90Var.d;
                                    ImageView imageView4 = y90Var.a;
                                    wo woVar = y90Var.h;
                                    bi.md mdVar = y90Var.c;
                                    int i19 = u90Var.a;
                                    CharSequence charSequence3 = u90Var.c;
                                    int i20 = u90Var.e;
                                    if (i19 == 3) {
                                        woVar.setVisibility(8);
                                        imageView4.setVisibility(0);
                                        imageView4.setImageResource(u90Var.d);
                                        mdVar.setText(charSequence3);
                                        boolean z12 = Integer.bitCount(i20) > 1;
                                        y90Var.w = z12;
                                        if (z12) {
                                            y90Var.c(u90Var, false);
                                            i6Var.setVisibility(0);
                                            imageView3.setVisibility(0);
                                        } else {
                                            i6Var.setVisibility(8);
                                            imageView3.setVisibility(8);
                                        }
                                        mdVar.setTranslationX(0.0f);
                                        r32.setVisibility(0);
                                        r32.c(org.telegram.messenger.sc.e(i20), false);
                                        z9 = true;
                                        y90Var.r = Integer.bitCount(i20) > 1;
                                    } else {
                                        z9 = true;
                                        woVar.setVisibility(0);
                                        woVar.a(org.telegram.messenger.sc.e(i20), false);
                                        imageView4.setVisibility(8);
                                        r32.setVisibility(8);
                                        i6Var.setVisibility(8);
                                        imageView3.setVisibility(8);
                                        mdVar.setText(charSequence3);
                                        mdVar.setTranslationX(org.telegram.messenger.g0.L(41.0f) * (org.telegram.messenger.id.a0 ? -2.2f : 1.0f));
                                        y90Var.w = false;
                                        y90Var.r = false;
                                    }
                                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) y90Var.b.getLayoutParams();
                                    if (u90Var.a == 3) {
                                        f10 = (org.telegram.messenger.id.a0 ? 64 : 75) + 4;
                                    } else {
                                        f10 = 8.0f;
                                    }
                                    marginLayoutParams.rightMargin = org.telegram.messenger.g0.L(f10);
                                    y90Var.n = z11;
                                    y90Var.setWillNotDraw((z11 || y90Var.r) ? false : z9);
                                    y90Var.b(org.telegram.messenger.sc.f(), false);
                                    break;
                                }
                            } else {
                                org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view2;
                                CharSequence charSequence4 = u90Var.c;
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
                            ((org.telegram.ui.x90) view2).a();
                            break;
                        }
                    } else {
                        ((org.telegram.ui.Cells.n4) view2).setText(u90Var.c);
                        break;
                    }
                }
                break;
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View view;
        View view2;
        int i10 = this.d;
        final int i11 = 0;
        View view3 = null;
        Object obj = this.e;
        final int i12 = 1;
        switch (i10) {
            case 0:
                ii0 ii0Var = (ii0) obj;
                if (i7 == 1) {
                    ii0Var.R = new FrameLayout(ii0Var.getContext());
                    ug.z0 z0Var = new ug.z0(0, ii0Var.getContext(), null);
                    ii0Var.u0 = z0Var;
                    int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.F8, false);
                    int i13 = org.telegram.ui.ActionBar.m6.h5;
                    z0Var.setColor(i0.a.f(0.7f, x02, org.telegram.ui.ActionBar.m6.x0(null, i13, false)));
                    org.telegram.ui.ActionBar.t6.s(ii0Var.u0, i13, null, PorterDuff.Mode.MULTIPLY);
                    ii0Var.u0.setScaleX(0.0f);
                    ii0Var.u0.setScaleY(0.0f);
                    ii0Var.u0.setPadding(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
                    ii0Var.R.addView(ii0Var.u0, c8.ha.e(26, 26, 17));
                    ii0Var.u0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xh0
                        public final /* synthetic */ yh0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view4) {
                            switch (i11) {
                                case 0:
                                    yh0 yh0Var = this.b;
                                    yh0Var.getClass();
                                    view4.getLocationOnScreen(new int[2]);
                                    ii0 ii0Var2 = (ii0) yh0Var.e;
                                    view4.getMeasuredWidth();
                                    view4.getMeasuredHeight();
                                    ii0Var2.getClass();
                                    new ug.w0(ii0Var2.t0, 4, true).show();
                                    break;
                                default:
                                    ii0.a((ii0) this.b.e);
                                    break;
                            }
                        }
                    });
                    view = ii0Var.R;
                } else if (i7 != 2) {
                    view = new gi0(ii0Var, ii0Var.getContext());
                } else {
                    ii0Var.S = new bi.x5(ii0Var, ii0Var.getContext());
                    yq yqVar = new yq(ii0Var, ii0Var.getContext());
                    ii0Var.v0 = yqVar;
                    yqVar.setImageResource(R.drawable.msg_reactions_expand);
                    ii0Var.v0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    int i14 = ii0Var.M0;
                    if (i14 == 1 || i14 == 2 || i14 == 4) {
                        ii0Var.v0.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
                    } else {
                        org.telegram.ui.ActionBar.t6.s(ii0Var.v0, org.telegram.ui.ActionBar.m6.h5, null, PorterDuff.Mode.MULTIPLY);
                    }
                    yq yqVar2 = ii0Var.v0;
                    int L = org.telegram.messenger.g0.L(28.0f);
                    int i15 = org.telegram.ui.ActionBar.m6.i6;
                    org.telegram.ui.ActionBar.t6.Q(yqVar2, org.telegram.ui.ActionBar.m6.j0(L, 0, i0.a.o(org.telegram.ui.ActionBar.m6.x0(null, i15, false), 40)), null, org.telegram.ui.ActionBar.t6.g(i15, 40), null);
                    ii0Var.v0.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
                    ii0Var.v0.setContentDescription(org.telegram.messenger.id.M0(2131754883, null));
                    ii0Var.S.addView(ii0Var.v0, c8.ha.e(30, 30, 17));
                    ii0Var.v0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xh0
                        public final /* synthetic */ yh0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view4) {
                            switch (i12) {
                                case 0:
                                    yh0 yh0Var = this.b;
                                    yh0Var.getClass();
                                    view4.getLocationOnScreen(new int[2]);
                                    ii0 ii0Var2 = (ii0) yh0Var.e;
                                    view4.getMeasuredWidth();
                                    view4.getMeasuredHeight();
                                    ii0Var2.getClass();
                                    new ug.w0(ii0Var2.t0, 4, true).show();
                                    break;
                                default:
                                    ii0.a((ii0) this.b.e);
                                    break;
                            }
                        }
                    });
                    view = ii0Var.S;
                }
                int topOffset = ((ii0Var.getLayoutParams().height - ((int) ii0Var.getTopOffset())) - ii0Var.getPaddingTop()) - ii0Var.getPaddingBottom();
                view.setLayoutParams(new v4.o0(topOffset - org.telegram.messenger.g0.L(12.0f), topOffset));
                return new xi0(view);
            case 1:
                org.telegram.ui.kt ktVar = (org.telegram.ui.kt) obj;
                org.telegram.ui.ActionBar.h6 h6Var = ktVar.n2;
                if (i7 == 0) {
                    Context context = ktVar.getContext();
                    int[] iArr = org.telegram.ui.nt.s;
                    org.telegram.ui.ht htVar = new org.telegram.ui.ht(this, context, iArr.length, iArr, org.telegram.ui.nt.w);
                    ktVar.u3 = htVar;
                    htVar.setInterceptTouch(false);
                    View view4 = ktVar.u3;
                    view4.setTag(-33024);
                    view2 = view4;
                } else if (i7 == 1) {
                    Context context2 = ktVar.getContext();
                    org.telegram.ui.mt mtVar = new org.telegram.ui.mt(context2);
                    TextView textView = new TextView(context2);
                    mtVar.a = textView;
                    textView.setGravity(17);
                    textView.setTextSize(1, 13.0f);
                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.y6, null);
                    mtVar.addView(textView, c8.ha.d(-1, -2.0f, org.telegram.messenger.qs.E1, 24.0f, 0.0f, 24.0f, 14.0f));
                    mtVar.setTag(-33024);
                    view2 = mtVar;
                } else if (i7 == 3) {
                    view2 = new org.telegram.ui.Cells.z8(ktVar.getContext());
                } else if (i7 == 4) {
                    View n4Var = new org.telegram.ui.Cells.n4(ktVar.getContext());
                    org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, n4Var, h6Var);
                    view2 = n4Var;
                } else if (i7 == 5) {
                    org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(ktVar.getContext());
                    org.telegram.ui.ActionBar.t6.X(m8Var.getTextView(), org.telegram.ui.ActionBar.m6.p7, h6Var);
                    org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, m8Var, h6Var);
                    view2 = m8Var;
                } else if (i7 == 6) {
                    org.telegram.ui.lt ltVar = new org.telegram.ui.lt(ktVar.getContext());
                    ltVar.a = new Path();
                    Paint paint = new Paint(1);
                    ltVar.b = paint;
                    ltVar.c = true;
                    paint.setShadowLayer(org.telegram.messenger.g0.L(1.0f), 0.0f, org.telegram.messenger.g0.L(-0.66f), 251658240);
                    paint.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.d6, false));
                    view2 = ltVar;
                } else if (i7 != 7) {
                    view2 = new org.telegram.ui.dt(ktVar.v3, ktVar.getContext());
                } else {
                    View smVar = new sm(ktVar.getContext(), 13);
                    int i16 = org.telegram.ui.ActionBar.m6.d6;
                    int i17 = org.telegram.ui.kt.w3;
                    org.telegram.ui.ActionBar.t6.h(i16, smVar, ktVar.n2);
                    view2 = smVar;
                }
                return new xi0(view2);
            default:
                org.telegram.ui.z90 z90Var = (org.telegram.ui.z90) obj;
                Context context3 = viewGroup.getContext();
                if (i7 == 0) {
                    view3 = new org.telegram.ui.Cells.n4(context3);
                } else if (i7 == 1) {
                    view3 = new org.telegram.ui.x90(z90Var, context3);
                } else if (i7 == 2) {
                    view3 = new org.telegram.ui.t90(context3);
                } else if (i7 == 3 || i7 == 4) {
                    view3 = new org.telegram.ui.y90(z90Var, context3);
                } else if (i7 == 5) {
                    view3 = new org.telegram.ui.Cells.m8(23, context3, null, false, true);
                }
                return new xi0(view3);
        }
    }

    @Override // v4.g0
    public void y(v4.d1 d1Var) {
        int b10;
        switch (this.d) {
            case 0:
                ArrayList arrayList = ((ii0) this.e).d;
                int i7 = d1Var.f;
                if ((i7 == 0 || i7 == 3) && (b10 = d1Var.b()) >= 0 && b10 < arrayList.size()) {
                    ((gi0) d1Var.a).f(((zh0) arrayList.get(b10)).c, false);
                    break;
                }
                break;
        }
    }
}
