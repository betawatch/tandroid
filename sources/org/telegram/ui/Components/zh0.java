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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class zh0 extends rg.b {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ zh0(Object obj, int i7) {
        this.d = i7;
        this.e = obj;
    }

    @Override // org.telegram.ui.Components.pj0
    public final boolean D(v4.d1 d1Var) {
        switch (this.d) {
            case 0:
                return false;
            case 1:
                org.telegram.ui.et etVar = (org.telegram.ui.et) ((org.telegram.ui.jt) this.e).j3.get(d1Var.b());
                int i7 = etVar.a;
                return i7 == 5 || (i7 == 2 && etVar.h != -1);
            default:
                int i10 = d1Var.f;
                return i10 == 4 || i10 == 3 || i10 == 5;
        }
    }

    @Override // v4.g0
    public final int b() {
        switch (this.d) {
            case 0:
                return ((ji0) this.e).d.size();
            case 1:
                return ((org.telegram.ui.jt) this.e).j3.size();
            default:
                return ((org.telegram.ui.y90) this.e).s.size();
        }
    }

    @Override // v4.g0
    public final int d(int i7) {
        switch (this.d) {
            case 0:
                return ((ai0) ((ji0) this.e).d.get(i7)).a;
            case 1:
                return ((org.telegram.ui.et) ((org.telegram.ui.jt) this.e).j3.get(i7)).a;
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
                    hi0 hi0Var = (hi0) d1Var.a;
                    hi0Var.setScaleX(1.0f);
                    hi0Var.setScaleY(1.0f);
                    hi0.a(hi0Var, ((ai0) ((ji0) this.e).d.get(i7)).c, i7);
                    break;
                }
                break;
            case 1:
                org.telegram.ui.jt jtVar = (org.telegram.ui.jt) this.e;
                ArrayList arrayList = jtVar.j3;
                int b10 = d1Var.b();
                View view = d1Var.a;
                org.telegram.ui.et etVar = (org.telegram.ui.et) arrayList.get(b10);
                int i11 = d1Var.f;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 != 4) {
                                    if (i11 != 5) {
                                        if (i11 == 6) {
                                            ((org.telegram.ui.kt) view).setTop(true);
                                            break;
                                        }
                                    } else {
                                        ((org.telegram.ui.Cells.m8) view).k(etVar.f.toString(), false);
                                        break;
                                    }
                                } else {
                                    ((org.telegram.ui.Cells.n4) view).setText(etVar.f);
                                    break;
                                }
                            } else {
                                ((org.telegram.ui.Cells.z8) view).setText(etVar.f);
                                break;
                            }
                        } else {
                            org.telegram.ui.ct ctVar = (org.telegram.ui.ct) view;
                            int i12 = etVar.d;
                            int i13 = etVar.e;
                            int i14 = etVar.c;
                            CharSequence charSequence = etVar.f;
                            CharSequence charSequence2 = etVar.g;
                            int i15 = i7 + 1;
                            boolean z10 = i15 < b() && ((org.telegram.ui.et) arrayList.get(i15)).a == i11;
                            ImageView imageView = ctVar.a;
                            if (i14 == 0) {
                                imageView.setVisibility(8);
                            } else {
                                imageView.setVisibility(0);
                                boolean q10 = org.telegram.ui.ActionBar.l6.I.q();
                                ea0 ea0Var = new ea0(1);
                                ea0Var.b(i12, i13);
                                ea0Var.b = q10;
                                imageView.setBackground(ea0Var);
                                imageView.setImageResource(i14);
                            }
                            ctVar.b.setText(charSequence);
                            ctVar.d.setText(charSequence2);
                            ctVar.e = z10;
                            ctVar.setWillNotDraw(!z10);
                            int i16 = etVar.h;
                            if (i16 >= 0) {
                                org.telegram.ui.ht[] htVarArr = jtVar.n3;
                                if (i16 >= htVarArr.length || htVarArr[i16].c > 0) {
                                    bool = Boolean.valueOf(jtVar.p3[i16]);
                                    ImageView imageView2 = ctVar.c;
                                    if (bool == null) {
                                        imageView2.setVisibility(0);
                                        imageView2.animate().rotation(bool.booleanValue() ? 0.0f : 180.0f).setDuration(360L).setInterpolator(xq.h).start();
                                        break;
                                    } else {
                                        imageView2.setVisibility(8);
                                        break;
                                    }
                                }
                            }
                            bool = null;
                            ImageView imageView22 = ctVar.c;
                            if (bool == null) {
                            }
                        }
                    } else {
                        ((org.telegram.ui.lt) view).a.setText(etVar.f);
                        break;
                    }
                } else {
                    nc ncVar = (nc) view;
                    if (jtVar.n3 != null) {
                        ncVar.f(jtVar.q3, jtVar.e3, jtVar.o3);
                    }
                    jtVar.e3 = false;
                    break;
                }
                break;
            default:
                ArrayList arrayList2 = ((org.telegram.ui.y90) this.e).s;
                if (i7 >= 0 && i7 < arrayList2.size()) {
                    org.telegram.ui.t90 t90Var = (org.telegram.ui.t90) arrayList2.get(i7);
                    int i17 = d1Var.f;
                    View view2 = d1Var.a;
                    if (i17 != 0) {
                        if (i17 != 1) {
                            if (i17 != 2) {
                                if (i17 != 3 && i17 != 4) {
                                    if (i17 == 5) {
                                        org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view2;
                                        if (t90Var.f == 1) {
                                            m8Var.l(t90Var.c, org.telegram.messenger.qp.e1().getBoolean("view_animations", true), false);
                                            break;
                                        }
                                    }
                                } else {
                                    int i18 = i7 + 1;
                                    boolean z11 = i18 < arrayList2.size() && ((org.telegram.ui.t90) arrayList2.get(i18)).a != 2;
                                    org.telegram.ui.x90 x90Var = (org.telegram.ui.x90) view2;
                                    Switch r32 = x90Var.f;
                                    ImageView imageView3 = x90Var.e;
                                    j6 j6Var = x90Var.d;
                                    ImageView imageView4 = x90Var.a;
                                    wo woVar = x90Var.h;
                                    bi.md mdVar = x90Var.c;
                                    int i19 = t90Var.a;
                                    CharSequence charSequence3 = t90Var.c;
                                    int i20 = t90Var.e;
                                    if (i19 == 3) {
                                        woVar.setVisibility(8);
                                        imageView4.setVisibility(0);
                                        imageView4.setImageResource(t90Var.d);
                                        mdVar.setText(charSequence3);
                                        boolean z12 = Integer.bitCount(i20) > 1;
                                        x90Var.w = z12;
                                        if (z12) {
                                            x90Var.c(t90Var, false);
                                            j6Var.setVisibility(0);
                                            imageView3.setVisibility(0);
                                        } else {
                                            j6Var.setVisibility(8);
                                            imageView3.setVisibility(8);
                                        }
                                        mdVar.setTranslationX(0.0f);
                                        r32.setVisibility(0);
                                        r32.c(org.telegram.messenger.sc.e(i20), false);
                                        z9 = true;
                                        x90Var.r = Integer.bitCount(i20) > 1;
                                    } else {
                                        z9 = true;
                                        woVar.setVisibility(0);
                                        woVar.a(org.telegram.messenger.sc.e(i20), false);
                                        imageView4.setVisibility(8);
                                        r32.setVisibility(8);
                                        j6Var.setVisibility(8);
                                        imageView3.setVisibility(8);
                                        mdVar.setText(charSequence3);
                                        mdVar.setTranslationX(org.telegram.messenger.g0.L(41.0f) * (org.telegram.messenger.id.a0 ? -2.2f : 1.0f));
                                        x90Var.w = false;
                                        x90Var.r = false;
                                    }
                                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) x90Var.b.getLayoutParams();
                                    if (t90Var.a == 3) {
                                        f10 = (org.telegram.messenger.id.a0 ? 64 : 75) + 4;
                                    } else {
                                        f10 = 8.0f;
                                    }
                                    marginLayoutParams.rightMargin = org.telegram.messenger.g0.L(f10);
                                    x90Var.n = z11;
                                    x90Var.setWillNotDraw((z11 || x90Var.r) ? false : z9);
                                    x90Var.b(org.telegram.messenger.sc.f(), false);
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
                        ((org.telegram.ui.Cells.n4) view2).setText(t90Var.c);
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
                ji0 ji0Var = (ji0) obj;
                if (i7 == 1) {
                    ji0Var.R = new FrameLayout(ji0Var.getContext());
                    ug.z0 z0Var = new ug.z0(0, ji0Var.getContext(), null);
                    ji0Var.u0 = z0Var;
                    int x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.F8, false);
                    int i13 = org.telegram.ui.ActionBar.l6.h5;
                    z0Var.setColor(i0.a.f(0.7f, x02, org.telegram.ui.ActionBar.l6.x0(null, i13, false)));
                    org.telegram.ui.ActionBar.s6.s(ji0Var.u0, i13, null, PorterDuff.Mode.MULTIPLY);
                    ji0Var.u0.setScaleX(0.0f);
                    ji0Var.u0.setScaleY(0.0f);
                    ji0Var.u0.setPadding(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
                    ji0Var.R.addView(ji0Var.u0, c8.ha.e(26, 26, 17));
                    ji0Var.u0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.yh0
                        public final /* synthetic */ zh0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view4) {
                            switch (i11) {
                                case 0:
                                    zh0 zh0Var = this.b;
                                    zh0Var.getClass();
                                    view4.getLocationOnScreen(new int[2]);
                                    ji0 ji0Var2 = (ji0) zh0Var.e;
                                    view4.getMeasuredWidth();
                                    view4.getMeasuredHeight();
                                    ji0Var2.getClass();
                                    new ug.w0(ji0Var2.t0, 4, true).show();
                                    break;
                                default:
                                    ji0.a((ji0) this.b.e);
                                    break;
                            }
                        }
                    });
                    view = ji0Var.R;
                } else if (i7 != 2) {
                    view = new hi0(ji0Var, ji0Var.getContext());
                } else {
                    ji0Var.S = new bi.x5(ji0Var, ji0Var.getContext());
                    zq zqVar = new zq(ji0Var, ji0Var.getContext());
                    ji0Var.v0 = zqVar;
                    zqVar.setImageResource(R.drawable.msg_reactions_expand);
                    ji0Var.v0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    int i14 = ji0Var.M0;
                    if (i14 == 1 || i14 == 2 || i14 == 4) {
                        ji0Var.v0.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
                    } else {
                        org.telegram.ui.ActionBar.s6.s(ji0Var.v0, org.telegram.ui.ActionBar.l6.h5, null, PorterDuff.Mode.MULTIPLY);
                    }
                    zq zqVar2 = ji0Var.v0;
                    int L = org.telegram.messenger.g0.L(28.0f);
                    int i15 = org.telegram.ui.ActionBar.l6.i6;
                    org.telegram.ui.ActionBar.s6.Q(zqVar2, org.telegram.ui.ActionBar.l6.j0(L, 0, i0.a.o(org.telegram.ui.ActionBar.l6.x0(null, i15, false), 40)), null, org.telegram.ui.ActionBar.s6.g(i15, 40), null);
                    ji0Var.v0.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
                    ji0Var.v0.setContentDescription(org.telegram.messenger.id.M0(2131754883, null));
                    ji0Var.S.addView(ji0Var.v0, c8.ha.e(30, 30, 17));
                    ji0Var.v0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.yh0
                        public final /* synthetic */ zh0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view4) {
                            switch (i12) {
                                case 0:
                                    zh0 zh0Var = this.b;
                                    zh0Var.getClass();
                                    view4.getLocationOnScreen(new int[2]);
                                    ji0 ji0Var2 = (ji0) zh0Var.e;
                                    view4.getMeasuredWidth();
                                    view4.getMeasuredHeight();
                                    ji0Var2.getClass();
                                    new ug.w0(ji0Var2.t0, 4, true).show();
                                    break;
                                default:
                                    ji0.a((ji0) this.b.e);
                                    break;
                            }
                        }
                    });
                    view = ji0Var.S;
                }
                int topOffset = ((ji0Var.getLayoutParams().height - ((int) ji0Var.getTopOffset())) - ji0Var.getPaddingTop()) - ji0Var.getPaddingBottom();
                view.setLayoutParams(new v4.o0(topOffset - org.telegram.messenger.g0.L(12.0f), topOffset));
                return new yi0(view);
            case 1:
                org.telegram.ui.jt jtVar = (org.telegram.ui.jt) obj;
                org.telegram.ui.ActionBar.g6 g6Var = jtVar.n2;
                if (i7 == 0) {
                    Context context = jtVar.getContext();
                    int[] iArr = org.telegram.ui.mt.s;
                    org.telegram.ui.gt gtVar = new org.telegram.ui.gt(this, context, iArr.length, iArr, org.telegram.ui.mt.w);
                    jtVar.u3 = gtVar;
                    gtVar.setInterceptTouch(false);
                    View view4 = jtVar.u3;
                    view4.setTag(-33024);
                    view2 = view4;
                } else if (i7 == 1) {
                    Context context2 = jtVar.getContext();
                    org.telegram.ui.lt ltVar = new org.telegram.ui.lt(context2);
                    TextView textView = new TextView(context2);
                    ltVar.a = textView;
                    textView.setGravity(17);
                    textView.setTextSize(1, 13.0f);
                    org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.y6, null);
                    ltVar.addView(textView, c8.ha.d(-1, -2.0f, org.telegram.messenger.qs.E1, 24.0f, 0.0f, 24.0f, 14.0f));
                    ltVar.setTag(-33024);
                    view2 = ltVar;
                } else if (i7 == 3) {
                    view2 = new org.telegram.ui.Cells.z8(jtVar.getContext());
                } else if (i7 == 4) {
                    View n4Var = new org.telegram.ui.Cells.n4(jtVar.getContext());
                    org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.d6, n4Var, g6Var);
                    view2 = n4Var;
                } else if (i7 == 5) {
                    org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(jtVar.getContext());
                    org.telegram.ui.ActionBar.s6.X(m8Var.getTextView(), org.telegram.ui.ActionBar.l6.p7, g6Var);
                    org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.d6, m8Var, g6Var);
                    view2 = m8Var;
                } else if (i7 == 6) {
                    org.telegram.ui.kt ktVar = new org.telegram.ui.kt(jtVar.getContext());
                    ktVar.a = new Path();
                    Paint paint = new Paint(1);
                    ktVar.b = paint;
                    ktVar.c = true;
                    paint.setShadowLayer(org.telegram.messenger.g0.L(1.0f), 0.0f, org.telegram.messenger.g0.L(-0.66f), 251658240);
                    paint.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.d6, false));
                    view2 = ktVar;
                } else if (i7 != 7) {
                    view2 = new org.telegram.ui.ct(jtVar.v3, jtVar.getContext());
                } else {
                    View tmVar = new tm(jtVar.getContext(), 13);
                    int i16 = org.telegram.ui.ActionBar.l6.d6;
                    int i17 = org.telegram.ui.jt.w3;
                    org.telegram.ui.ActionBar.s6.h(i16, tmVar, jtVar.n2);
                    view2 = tmVar;
                }
                return new yi0(view2);
            default:
                org.telegram.ui.y90 y90Var = (org.telegram.ui.y90) obj;
                Context context3 = viewGroup.getContext();
                if (i7 == 0) {
                    view3 = new org.telegram.ui.Cells.n4(context3);
                } else if (i7 == 1) {
                    view3 = new org.telegram.ui.w90(y90Var, context3);
                } else if (i7 == 2) {
                    view3 = new org.telegram.ui.s90(context3);
                } else if (i7 == 3 || i7 == 4) {
                    view3 = new org.telegram.ui.x90(y90Var, context3);
                } else if (i7 == 5) {
                    view3 = new org.telegram.ui.Cells.m8(23, context3, null, false, true);
                }
                return new yi0(view3);
        }
    }

    @Override // v4.g0
    public void y(v4.d1 d1Var) {
        int b10;
        switch (this.d) {
            case 0:
                ArrayList arrayList = ((ji0) this.e).d;
                int i7 = d1Var.f;
                if ((i7 == 0 || i7 == 3) && (b10 = d1Var.b()) >= 0 && b10 < arrayList.size()) {
                    ((hi0) d1Var.a).f(((ai0) arrayList.get(b10)).c, false);
                    break;
                }
                break;
        }
    }
}
