// default package

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
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class o93 extends ka {
    public final /* synthetic */ byte d;
    public final /* synthetic */ Object e;

    public /* synthetic */ o93(Object obj, byte b) {
        this.d = b;
        this.e = obj;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        switch (this.d) {
            case 0:
                l93 l93Var = (l93) ((q93) this.e).k3.get(u69Var.b());
                int i = l93Var.a;
                if (i != 5) {
                    if (i != 2 || l93Var.h == -1) {
                        break;
                    }
                }
                break;
            case 1:
                int i2 = u69Var.f;
                if (i2 != 4 && i2 != 3 && i2 != 5) {
                    break;
                }
                break;
        }
        return false;
    }

    @Override // y59
    public final int b() {
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 0:
                return ((q93) obj).k3.size();
            case 1:
                return ((m86) obj).s.size();
            default:
                return ((v29) obj).d.size();
        }
    }

    @Override // y59
    public final int d(int i) {
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 0:
                return ((l93) ((q93) obj).k3.get(i)).a;
            case 1:
                ArrayList arrayList = ((m86) obj).s;
                if (i < 0 || i >= arrayList.size()) {
                    return 2;
                }
                return ((g86) arrayList.get(i)).a;
            default:
                return ((l29) ((v29) obj).d.get(i)).a;
        }
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        float f;
        byte b = this.d;
        Boolean bool = null;
        Object obj = this.e;
        switch (b) {
            case 0:
                q93 q93Var = (q93) obj;
                ArrayList arrayList = q93Var.k3;
                int b2 = u69Var.b();
                View view = u69Var.a;
                l93 l93Var = (l93) arrayList.get(b2);
                int i2 = u69Var.f;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 != 4) {
                                    if (i2 != 5) {
                                        if (i2 == 6) {
                                            ((r93) view).setTop(true);
                                            break;
                                        }
                                    } else {
                                        ((xib) view).k(l93Var.f.toString(), false);
                                        break;
                                    }
                                } else {
                                    ((jf5) view).setText(l93Var.f);
                                    break;
                                }
                            } else {
                                ((njb) view).setText(l93Var.f);
                                break;
                            }
                        } else {
                            j93 j93Var = (j93) view;
                            int i3 = l93Var.d;
                            int i4 = l93Var.e;
                            int i5 = l93Var.c;
                            CharSequence charSequence = l93Var.f;
                            String str = l93Var.g;
                            int i6 = i + 1;
                            boolean z = i6 < b() && ((l93) arrayList.get(i6)).a == i2;
                            ImageView imageView = j93Var.a;
                            if (i5 == 0) {
                                imageView.setVisibility(8);
                            } else {
                                imageView.setVisibility(0);
                                boolean o = cmb.I.o();
                                g57 g57Var = new g57((byte) 1);
                                g57Var.b(i3, i4);
                                g57Var.b = o;
                                imageView.setBackground(g57Var);
                                imageView.setImageResource(i5);
                            }
                            j93Var.b.setText(charSequence);
                            j93Var.d.setText(str);
                            j93Var.e = z;
                            j93Var.setWillNotDraw(!z);
                            int i7 = l93Var.h;
                            if (i7 >= 0) {
                                p93[] p93VarArr = q93Var.o3;
                                if (i7 >= p93VarArr.length || p93VarArr[i7].c > 0) {
                                    bool = Boolean.valueOf(q93Var.q3[i7]);
                                }
                            }
                            ImageView imageView2 = j93Var.c;
                            if (bool != null) {
                                imageView2.setVisibility(0);
                                imageView2.animate().rotation(bool.booleanValue() ? 0.0f : 180.0f).setDuration(360L).setInterpolator(d53.h).start();
                                break;
                            } else {
                                imageView2.setVisibility(8);
                                break;
                            }
                        }
                    } else {
                        ((s93) view).a.setText(l93Var.f);
                        break;
                    }
                } else {
                    y61 y61Var = (y61) view;
                    if (q93Var.o3 != null) {
                        y61Var.e(q93Var.r3, q93Var.f3, q93Var.p3);
                    }
                    q93Var.f3 = false;
                    break;
                }
                break;
            case 1:
                ArrayList arrayList2 = ((m86) obj).s;
                if (i >= 0 && i < arrayList2.size()) {
                    g86 g86Var = (g86) arrayList2.get(i);
                    int i8 = u69Var.f;
                    View view2 = u69Var.a;
                    if (i8 != 0) {
                        if (i8 != 1) {
                            if (i8 != 2) {
                                if (i8 != 3 && i8 != 4) {
                                    if (i8 == 5) {
                                        xib xibVar = (xib) view2;
                                        if (g86Var.f) {
                                            xibVar.l(g86Var.c, oc7.d1().getBoolean("view_animations", true), false);
                                            break;
                                        }
                                    }
                                } else {
                                    int i9 = i + 1;
                                    boolean z2 = i9 < arrayList2.size() && ((g86) arrayList2.get(i9)).a != 2;
                                    l86 l86Var = (l86) view2;
                                    Switch r2 = l86Var.f;
                                    ImageView imageView3 = l86Var.e;
                                    io ioVar = l86Var.d;
                                    ImageView imageView4 = l86Var.a;
                                    wb wbVar = l86Var.c;
                                    int i10 = g86Var.a;
                                    String str2 = g86Var.c;
                                    int i11 = g86Var.e;
                                    jh2 jh2Var = l86Var.h;
                                    if (i10 == 3) {
                                        jh2Var.setVisibility(8);
                                        imageView4.setVisibility(0);
                                        imageView4.setImageResource(g86Var.d);
                                        wbVar.setText(str2);
                                        boolean z3 = Integer.bitCount(i11) > 1;
                                        l86Var.w = z3;
                                        if (z3) {
                                            l86Var.c(g86Var, false);
                                            ioVar.setVisibility(0);
                                            imageView3.setVisibility(0);
                                        } else {
                                            ioVar.setVisibility(8);
                                            imageView3.setVisibility(8);
                                        }
                                        wbVar.setTranslationX(0.0f);
                                        r2.setVisibility(0);
                                        r2.c(e86.e(i11), false);
                                        l86Var.r = Integer.bitCount(i11) > 1;
                                    } else {
                                        jh2Var.setVisibility(0);
                                        jh2Var.a(e86.e(i11), false);
                                        imageView4.setVisibility(8);
                                        r2.setVisibility(8);
                                        ioVar.setVisibility(8);
                                        imageView3.setVisibility(8);
                                        wbVar.setText(str2);
                                        wbVar.setTranslationX(gm.L(41.0f) * (jb6.a0 ? -2.2f : 1.0f));
                                        l86Var.w = false;
                                        l86Var.r = false;
                                    }
                                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) l86Var.b.getLayoutParams();
                                    if (g86Var.a == 3) {
                                        f = (jb6.a0 ? 64 : 75) + 4;
                                    } else {
                                        f = 8.0f;
                                    }
                                    marginLayoutParams.rightMargin = gm.L(f);
                                    l86Var.n = z2;
                                    l86Var.setWillNotDraw((z2 || l86Var.r) ? false : true);
                                    l86Var.b(e86.f(), false);
                                    break;
                                }
                            } else {
                                njb njbVar = (njb) view2;
                                String str3 = g86Var.c;
                                if (TextUtils.isEmpty(str3)) {
                                    njbVar.setFixedSize(12);
                                } else {
                                    njbVar.setFixedSize(0);
                                }
                                njbVar.setText(str3);
                                njbVar.setContentDescription(str3);
                                njbVar.setBackground(null);
                                break;
                            }
                        } else {
                            ((k86) view2).a();
                            break;
                        }
                    } else {
                        ((jf5) view2).setText(g86Var.c);
                        break;
                    }
                }
                break;
            default:
                int i12 = u69Var.f;
                if (i12 == 0 || i12 == 3) {
                    t29 t29Var = (t29) u69Var.a;
                    t29Var.setScaleX(1.0f);
                    t29Var.setScaleY(1.0f);
                    t29Var.d(i, ((l29) ((v29) obj).d.get(i)).c);
                    break;
                }
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        View view;
        View view2;
        byte b = this.d;
        Object obj = this.e;
        View view3 = null;
        final byte b2 = 0;
        final byte b3 = 1;
        switch (b) {
            case 0:
                q93 q93Var = (q93) obj;
                ylb ylbVar = q93Var.o2;
                if (i == 0) {
                    Context context = q93Var.getContext();
                    int[] iArr = t93.s;
                    n93 n93Var = new n93(this, context, iArr.length, iArr, t93.w);
                    q93Var.v3 = n93Var;
                    n93Var.setInterceptTouch(false);
                    View view4 = q93Var.v3;
                    view4.setTag(-33024);
                    view = view4;
                } else if (i == 1) {
                    Context context2 = q93Var.getContext();
                    s93 s93Var = new s93(context2);
                    TextView textView = new TextView(context2);
                    s93Var.a = textView;
                    textView.setGravity(17);
                    textView.setTextSize(1, 13.0f);
                    anb.X(textView, cmb.x6, null);
                    s93Var.addView(textView, qoe.d(-1, -2.0f, nm7.D1, 24.0f, 0.0f, 24.0f, 14.0f));
                    s93Var.setTag(-33024);
                    view = s93Var;
                } else if (i == 3) {
                    view = new njb(q93Var.getContext());
                } else if (i == 4) {
                    View jf5Var = new jf5(q93Var.getContext());
                    anb.h(cmb.c6, ylbVar, jf5Var);
                    view = jf5Var;
                } else if (i != 5) {
                    byte b4 = 6;
                    if (i == 6) {
                        r93 r93Var = new r93(q93Var.getContext());
                        r93Var.a = new Path();
                        Paint paint = new Paint(1);
                        r93Var.b = paint;
                        r93Var.c = true;
                        paint.setShadowLayer(gm.L(1.0f), 0.0f, gm.L(-0.66f), 251658240);
                        paint.setColor(cmb.w0(null, cmb.c6, false));
                        view = r93Var;
                    } else if (i != 7) {
                        view = new j93(q93Var.w3, q93Var.getContext());
                    } else {
                        View o72Var = new o72(q93Var.getContext(), b4);
                        int i2 = cmb.c6;
                        int i3 = q93.x3;
                        anb.h(i2, q93Var.o2, o72Var);
                        view = o72Var;
                    }
                } else {
                    xib xibVar = new xib(q93Var.getContext());
                    anb.W(xibVar.getTextView(), cmb.o7, ylbVar);
                    anb.h(cmb.c6, ylbVar, xibVar);
                    view = xibVar;
                }
                return new b59(view);
            case 1:
                m86 m86Var = (m86) obj;
                Context context3 = viewGroup.getContext();
                if (i == 0) {
                    view3 = new jf5(context3);
                } else if (i == 1) {
                    view3 = new k86(m86Var, context3);
                } else if (i == 2) {
                    view3 = new f86(context3);
                } else if (i == 3 || i == 4) {
                    view3 = new l86(m86Var, context3);
                } else if (i == 5) {
                    view3 = new xib(23, null, context3, false, true);
                }
                return new b59(view3);
            default:
                v29 v29Var = (v29) obj;
                if (i == 1) {
                    v29Var.S = new FrameLayout(v29Var.getContext());
                    pj8 pj8Var = new pj8(0, null, v29Var.getContext());
                    v29Var.v0 = pj8Var;
                    int w0 = cmb.w0(null, cmb.E8, false);
                    int i4 = cmb.g5;
                    pj8Var.setColor(on2.f(0.7f, w0, cmb.w0(null, i4, false)));
                    anb.s(v29Var.v0, i4, null, PorterDuff.Mode.MULTIPLY);
                    v29Var.v0.setScaleX(0.0f);
                    v29Var.v0.setScaleY(0.0f);
                    v29Var.v0.setPadding(gm.L(1.0f), gm.L(1.0f), gm.L(1.0f), gm.L(1.0f));
                    v29Var.S.addView(v29Var.v0, qoe.e(26, 26, 17));
                    v29Var.v0.setOnClickListener(new View.OnClickListener(this) { // from class: k29
                        public final /* synthetic */ o93 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view5) {
                            byte b5 = b2;
                            o93 o93Var = this.b;
                            switch (b5) {
                                case 0:
                                    view5.getLocationOnScreen(new int[2]);
                                    v29 v29Var2 = (v29) o93Var.e;
                                    view5.getMeasuredWidth();
                                    view5.getMeasuredHeight();
                                    new kj8(v29Var2.u0, 4, true).show();
                                    break;
                                default:
                                    ((v29) o93Var.e).o();
                                    break;
                            }
                        }
                    });
                    view2 = v29Var.S;
                } else if (i != 2) {
                    view2 = new t29(v29Var, v29Var.getContext());
                } else {
                    v29Var.T = new su(v29Var, v29Var.getContext());
                    b63 b63Var = new b63(v29Var, v29Var.getContext());
                    v29Var.w0 = b63Var;
                    b63Var.setImageResource(R.drawable.msg_reactions_expand);
                    v29Var.w0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    byte b5 = v29Var.N0;
                    if (b5 == 1 || b5 == 2 || b5 == 4) {
                        v29Var.w0.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
                    } else {
                        anb.s(v29Var.w0, cmb.g5, null, PorterDuff.Mode.MULTIPLY);
                    }
                    b63 b63Var2 = v29Var.w0;
                    int L = gm.L(28.0f);
                    int i5 = cmb.h6;
                    anb.R(b63Var2, cmb.h0(L, 0, on2.p(cmb.w0(null, i5, false), 40)), null, anb.g(i5, 40), null);
                    v29Var.w0.setPadding(gm.L(2.0f), gm.L(2.0f), gm.L(2.0f), gm.L(2.0f));
                    v29Var.w0.setContentDescription(jb6.M0(2131754883, null));
                    v29Var.T.addView(v29Var.w0, qoe.e(30, 30, 17));
                    v29Var.w0.setOnClickListener(new View.OnClickListener(this) { // from class: k29
                        public final /* synthetic */ o93 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view5) {
                            byte b52 = b3;
                            o93 o93Var = this.b;
                            switch (b52) {
                                case 0:
                                    view5.getLocationOnScreen(new int[2]);
                                    v29 v29Var2 = (v29) o93Var.e;
                                    view5.getMeasuredWidth();
                                    view5.getMeasuredHeight();
                                    new kj8(v29Var2.u0, 4, true).show();
                                    break;
                                default:
                                    ((v29) o93Var.e).o();
                                    break;
                            }
                        }
                    });
                    view2 = v29Var.T;
                }
                int topOffset = ((v29Var.getLayoutParams().height - ((int) v29Var.getTopOffset())) - v29Var.getPaddingTop()) - v29Var.getPaddingBottom();
                view2.setLayoutParams(new g69(topOffset - gm.L(12.0f), topOffset));
                return new b59(view2);
        }
    }

    @Override // y59
    public final void y(u69 u69Var) {
        int b;
        switch (this.d) {
            case 2:
                ArrayList arrayList = ((v29) this.e).d;
                int i = u69Var.f;
                if ((i == 0 || i == 3) && (b = u69Var.b()) >= 0 && b < arrayList.size()) {
                    ((t29) u69Var.a).f(((l29) arrayList.get(b)).c, false);
                    break;
                }
                break;
        }
    }
}
