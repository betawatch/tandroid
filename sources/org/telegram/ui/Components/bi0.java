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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class bi0 extends sg.b {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ bi0(Object obj, int i3) {
        this.d = i3;
        this.e = obj;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        switch (this.d) {
            case 0:
                return false;
            case 1:
                org.telegram.ui.at atVar = (org.telegram.ui.at) ((org.telegram.ui.et) this.e).k3.get(d1Var.b());
                int i3 = atVar.a;
                return i3 == 5 || (i3 == 2 && atVar.h != -1);
            default:
                int i10 = d1Var.f;
                return i10 == 4 || i10 == 3 || i10 == 5;
        }
    }

    @Override // u4.h0
    public final int b() {
        switch (this.d) {
            case 0:
                return ((li0) this.e).d.size();
            case 1:
                return ((org.telegram.ui.et) this.e).k3.size();
            default:
                return ((org.telegram.ui.t90) this.e).s.size();
        }
    }

    @Override // u4.h0
    public final int d(int i3) {
        switch (this.d) {
            case 0:
                return ((ci0) ((li0) this.e).d.get(i3)).a;
            case 1:
                return ((org.telegram.ui.at) ((org.telegram.ui.et) this.e).k3.get(i3)).a;
            default:
                org.telegram.ui.t90 t90Var = (org.telegram.ui.t90) this.e;
                if (i3 < 0 || i3 >= t90Var.s.size()) {
                    return 2;
                }
                return ((org.telegram.ui.o90) t90Var.s.get(i3)).a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0217  */
    @Override // u4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u4.d1 d1Var, int i3) {
        Boolean bool;
        boolean z10;
        float f10;
        switch (this.d) {
            case 0:
                int i10 = d1Var.f;
                if (i10 == 0 || i10 == 3) {
                    ji0 ji0Var = (ji0) d1Var.a;
                    ji0Var.setScaleX(1.0f);
                    ji0Var.setScaleY(1.0f);
                    ji0.a(ji0Var, ((ci0) ((li0) this.e).d.get(i3)).c, i3);
                    break;
                }
                break;
            case 1:
                org.telegram.ui.et etVar = (org.telegram.ui.et) this.e;
                ArrayList arrayList = etVar.k3;
                int b10 = d1Var.b();
                View view = d1Var.a;
                org.telegram.ui.at atVar = (org.telegram.ui.at) arrayList.get(b10);
                int i11 = d1Var.f;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 != 4) {
                                    if (i11 != 5) {
                                        if (i11 == 6) {
                                            ((org.telegram.ui.ft) view).setTop(true);
                                            break;
                                        }
                                    } else {
                                        ((org.telegram.ui.Cells.l8) view).k(atVar.f.toString(), false);
                                        break;
                                    }
                                } else {
                                    ((org.telegram.ui.Cells.n4) view).setText(atVar.f);
                                    break;
                                }
                            } else {
                                ((org.telegram.ui.Cells.y8) view).setText(atVar.f);
                                break;
                            }
                        } else {
                            org.telegram.ui.ys ysVar = (org.telegram.ui.ys) view;
                            int i12 = atVar.d;
                            int i13 = atVar.e;
                            int i14 = atVar.c;
                            CharSequence charSequence = atVar.f;
                            CharSequence charSequence2 = atVar.g;
                            int i15 = i3 + 1;
                            boolean z11 = i15 < b() && ((org.telegram.ui.at) arrayList.get(i15)).a == i11;
                            ImageView imageView = ysVar.a;
                            if (i14 == 0) {
                                imageView.setVisibility(8);
                            } else {
                                imageView.setVisibility(0);
                                boolean q10 = org.telegram.ui.ActionBar.k6.I.q();
                                y90 y90Var = new y90(1);
                                y90Var.b(i12, i13);
                                y90Var.b = q10;
                                imageView.setBackground(y90Var);
                                imageView.setImageResource(i14);
                            }
                            ysVar.b.setText(charSequence);
                            ysVar.d.setText(charSequence2);
                            ysVar.e = z11;
                            ysVar.setWillNotDraw(!z11);
                            int i16 = atVar.h;
                            if (i16 >= 0) {
                                org.telegram.ui.dt[] dtVarArr = etVar.o3;
                                if (i16 >= dtVarArr.length || dtVarArr[i16].c > 0) {
                                    bool = Boolean.valueOf(etVar.q3[i16]);
                                    ImageView imageView2 = ysVar.c;
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
                            ImageView imageView22 = ysVar.c;
                            if (bool == null) {
                            }
                        }
                    } else {
                        ((org.telegram.ui.gt) view).a.setText(atVar.f);
                        break;
                    }
                } else {
                    lc lcVar = (lc) view;
                    if (etVar.o3 != null) {
                        lcVar.f(etVar.r3, etVar.f3, etVar.p3);
                    }
                    etVar.f3 = false;
                    break;
                }
                break;
            default:
                ArrayList arrayList2 = ((org.telegram.ui.t90) this.e).s;
                if (i3 >= 0 && i3 < arrayList2.size()) {
                    org.telegram.ui.o90 o90Var = (org.telegram.ui.o90) arrayList2.get(i3);
                    int i17 = d1Var.f;
                    View view2 = d1Var.a;
                    if (i17 != 0) {
                        if (i17 != 1) {
                            if (i17 != 2) {
                                if (i17 != 3 && i17 != 4) {
                                    if (i17 == 5) {
                                        org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view2;
                                        if (o90Var.f == 1) {
                                            l8Var.l(o90Var.c, org.telegram.messenger.hp.e1().getBoolean("view_animations", true), false);
                                            break;
                                        }
                                    }
                                } else {
                                    int i18 = i3 + 1;
                                    boolean z12 = i18 < arrayList2.size() && ((org.telegram.ui.o90) arrayList2.get(i18)).a != 2;
                                    org.telegram.ui.s90 s90Var = (org.telegram.ui.s90) view2;
                                    Switch r32 = s90Var.f;
                                    ImageView imageView3 = s90Var.e;
                                    h6 h6Var = s90Var.d;
                                    ImageView imageView4 = s90Var.a;
                                    wo woVar = s90Var.h;
                                    ci.ec ecVar = s90Var.c;
                                    int i19 = o90Var.a;
                                    CharSequence charSequence3 = o90Var.c;
                                    int i20 = o90Var.e;
                                    if (i19 == 3) {
                                        woVar.setVisibility(8);
                                        imageView4.setVisibility(0);
                                        imageView4.setImageResource(o90Var.d);
                                        ecVar.setText(charSequence3);
                                        boolean z13 = Integer.bitCount(i20) > 1;
                                        s90Var.w = z13;
                                        if (z13) {
                                            s90Var.c(o90Var, false);
                                            h6Var.setVisibility(0);
                                            imageView3.setVisibility(0);
                                        } else {
                                            h6Var.setVisibility(8);
                                            imageView3.setVisibility(8);
                                        }
                                        ecVar.setTranslationX(0.0f);
                                        r32.setVisibility(0);
                                        r32.c(org.telegram.messenger.lc.e(i20), false);
                                        z10 = true;
                                        s90Var.r = Integer.bitCount(i20) > 1;
                                    } else {
                                        z10 = true;
                                        woVar.setVisibility(0);
                                        woVar.a(org.telegram.messenger.lc.e(i20), false);
                                        imageView4.setVisibility(8);
                                        r32.setVisibility(8);
                                        h6Var.setVisibility(8);
                                        imageView3.setVisibility(8);
                                        ecVar.setText(charSequence3);
                                        ecVar.setTranslationX(org.telegram.messenger.g0.L(41.0f) * (org.telegram.messenger.bd.a0 ? -2.2f : 1.0f));
                                        s90Var.w = false;
                                        s90Var.r = false;
                                    }
                                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) s90Var.b.getLayoutParams();
                                    if (o90Var.a == 3) {
                                        f10 = (org.telegram.messenger.bd.a0 ? 64 : 75) + 4;
                                    } else {
                                        f10 = 8.0f;
                                    }
                                    marginLayoutParams.rightMargin = org.telegram.messenger.g0.L(f10);
                                    s90Var.n = z12;
                                    s90Var.setWillNotDraw((z12 || s90Var.r) ? false : z10);
                                    s90Var.b(org.telegram.messenger.lc.f(), false);
                                    break;
                                }
                            } else {
                                org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view2;
                                CharSequence charSequence4 = o90Var.c;
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
                            ((org.telegram.ui.r90) view2).a();
                            break;
                        }
                    } else {
                        ((org.telegram.ui.Cells.n4) view2).setText(o90Var.c);
                        break;
                    }
                }
                break;
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View view;
        View view2;
        int i10 = this.d;
        final int i11 = 0;
        View view3 = null;
        Object obj = this.e;
        final int i12 = 1;
        switch (i10) {
            case 0:
                li0 li0Var = (li0) obj;
                if (i3 == 1) {
                    li0Var.S = new FrameLayout(li0Var.getContext());
                    vg.y0 y0Var = new vg.y0(0, li0Var.getContext(), null);
                    li0Var.v0 = y0Var;
                    int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.F8, false);
                    int i13 = org.telegram.ui.ActionBar.k6.h5;
                    y0Var.setColor(i0.a.f(0.7f, x02, org.telegram.ui.ActionBar.k6.x0(null, i13, false)));
                    org.telegram.ui.ActionBar.r6.t(li0Var.v0, i13, null, PorterDuff.Mode.MULTIPLY);
                    li0Var.v0.setScaleX(0.0f);
                    li0Var.v0.setScaleY(0.0f);
                    li0Var.v0.setPadding(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
                    li0Var.S.addView(li0Var.v0, b8.mf.e(26, 26, 17));
                    li0Var.v0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ai0
                        public final /* synthetic */ bi0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view4) {
                            switch (i11) {
                                case 0:
                                    bi0 bi0Var = this.b;
                                    bi0Var.getClass();
                                    view4.getLocationOnScreen(new int[2]);
                                    li0 li0Var2 = (li0) bi0Var.e;
                                    view4.getMeasuredWidth();
                                    view4.getMeasuredHeight();
                                    li0Var2.getClass();
                                    new vg.v0(li0Var2.u0, 4, true).show();
                                    break;
                                default:
                                    li0.a((li0) this.b.e);
                                    break;
                            }
                        }
                    });
                    view = li0Var.S;
                } else if (i3 != 2) {
                    view = new ji0(li0Var, li0Var.getContext());
                } else {
                    li0Var.T = new ai.c0(li0Var, li0Var.getContext());
                    zq zqVar = new zq(li0Var, li0Var.getContext());
                    li0Var.w0 = zqVar;
                    zqVar.setImageResource(R.drawable.msg_reactions_expand);
                    li0Var.w0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    int i14 = li0Var.N0;
                    if (i14 == 1 || i14 == 2 || i14 == 4) {
                        li0Var.w0.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
                    } else {
                        org.telegram.ui.ActionBar.r6.t(li0Var.w0, org.telegram.ui.ActionBar.k6.h5, null, PorterDuff.Mode.MULTIPLY);
                    }
                    zq zqVar2 = li0Var.w0;
                    int L = org.telegram.messenger.g0.L(28.0f);
                    int i15 = org.telegram.ui.ActionBar.k6.i6;
                    org.telegram.ui.ActionBar.r6.R(zqVar2, org.telegram.ui.ActionBar.k6.j0(L, 0, i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i15, false), 40)), null, org.telegram.ui.ActionBar.r6.h(i15, 40), null);
                    li0Var.w0.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
                    li0Var.w0.setContentDescription(org.telegram.messenger.bd.M0(2131754883, null));
                    li0Var.T.addView(li0Var.w0, b8.mf.e(30, 30, 17));
                    li0Var.w0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ai0
                        public final /* synthetic */ bi0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view4) {
                            switch (i12) {
                                case 0:
                                    bi0 bi0Var = this.b;
                                    bi0Var.getClass();
                                    view4.getLocationOnScreen(new int[2]);
                                    li0 li0Var2 = (li0) bi0Var.e;
                                    view4.getMeasuredWidth();
                                    view4.getMeasuredHeight();
                                    li0Var2.getClass();
                                    new vg.v0(li0Var2.u0, 4, true).show();
                                    break;
                                default:
                                    li0.a((li0) this.b.e);
                                    break;
                            }
                        }
                    });
                    view = li0Var.T;
                }
                int topOffset = ((li0Var.getLayoutParams().height - ((int) li0Var.getTopOffset())) - li0Var.getPaddingTop()) - li0Var.getPaddingBottom();
                view.setLayoutParams(new u4.p0(topOffset - org.telegram.messenger.g0.L(12.0f), topOffset));
                return new bj0(view);
            case 1:
                org.telegram.ui.et etVar = (org.telegram.ui.et) obj;
                org.telegram.ui.ActionBar.e6 e6Var = etVar.o2;
                if (i3 == 0) {
                    Context context = etVar.getContext();
                    int[] iArr = org.telegram.ui.ht.s;
                    org.telegram.ui.ct ctVar = new org.telegram.ui.ct(this, context, iArr.length, iArr, org.telegram.ui.ht.w);
                    etVar.v3 = ctVar;
                    ctVar.setInterceptTouch(false);
                    View view4 = etVar.v3;
                    view4.setTag(-33024);
                    view2 = view4;
                } else if (i3 == 1) {
                    Context context2 = etVar.getContext();
                    org.telegram.ui.gt gtVar = new org.telegram.ui.gt(context2);
                    TextView textView = new TextView(context2);
                    gtVar.a = textView;
                    textView.setGravity(17);
                    textView.setTextSize(1, 13.0f);
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.y6, null);
                    gtVar.addView(textView, b8.mf.d(-1, -2.0f, org.telegram.messenger.hs.E1, 24.0f, 0.0f, 24.0f, 14.0f));
                    gtVar.setTag(-33024);
                    view2 = gtVar;
                } else if (i3 == 3) {
                    view2 = new org.telegram.ui.Cells.y8(etVar.getContext());
                } else if (i3 == 4) {
                    View n4Var = new org.telegram.ui.Cells.n4(etVar.getContext());
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, n4Var, e6Var);
                    view2 = n4Var;
                } else if (i3 == 5) {
                    org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(etVar.getContext());
                    org.telegram.ui.ActionBar.r6.Y(l8Var.getTextView(), org.telegram.ui.ActionBar.k6.p7, e6Var);
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, l8Var, e6Var);
                    view2 = l8Var;
                } else if (i3 == 6) {
                    org.telegram.ui.ft ftVar = new org.telegram.ui.ft(etVar.getContext());
                    ftVar.a = new Path();
                    Paint paint = new Paint(1);
                    ftVar.b = paint;
                    ftVar.c = true;
                    paint.setShadowLayer(org.telegram.messenger.g0.L(1.0f), 0.0f, org.telegram.messenger.g0.L(-0.66f), 251658240);
                    paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false));
                    view2 = ftVar;
                } else if (i3 != 7) {
                    view2 = new org.telegram.ui.ys(etVar.w3, etVar.getContext());
                } else {
                    View smVar = new sm(etVar.getContext(), 14);
                    int i16 = org.telegram.ui.ActionBar.k6.d6;
                    int i17 = org.telegram.ui.et.x3;
                    org.telegram.ui.ActionBar.r6.i(i16, smVar, etVar.o2);
                    view2 = smVar;
                }
                return new bj0(view2);
            default:
                org.telegram.ui.t90 t90Var = (org.telegram.ui.t90) obj;
                Context context3 = viewGroup.getContext();
                if (i3 == 0) {
                    view3 = new org.telegram.ui.Cells.n4(context3);
                } else if (i3 == 1) {
                    view3 = new org.telegram.ui.r90(t90Var, context3);
                } else if (i3 == 2) {
                    view3 = new org.telegram.ui.n90(context3);
                } else if (i3 == 3 || i3 == 4) {
                    view3 = new org.telegram.ui.s90(t90Var, context3);
                } else if (i3 == 5) {
                    view3 = new org.telegram.ui.Cells.l8(23, context3, null, false, true);
                }
                return new bj0(view3);
        }
    }

    @Override // u4.h0
    public void y(u4.d1 d1Var) {
        int b10;
        switch (this.d) {
            case 0:
                ArrayList arrayList = ((li0) this.e).d;
                int i3 = d1Var.f;
                if ((i3 == 0 || i3 == 3) && (b10 = d1Var.b()) >= 0 && b10 < arrayList.size()) {
                    ((ji0) d1Var.a).f(((ci0) arrayList.get(b10)).c, false);
                    break;
                }
                break;
        }
    }
}
