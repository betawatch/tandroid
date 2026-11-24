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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class c83 extends ka {
    public final /* synthetic */ byte d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c83(Object obj, byte b) {
        this.d = b;
        this.e = obj;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        switch (this.d) {
            case 0:
                z73 z73Var = (z73) ((e83) this.e).k3.get(s49Var.b());
                int i = z73Var.a;
                if (i != 5) {
                    if (i != 2 || z73Var.h == -1) {
                        break;
                    }
                }
                break;
            case 1:
                int i2 = s49Var.f;
                if (i2 != 4 && i2 != 3 && i2 != 5) {
                    break;
                }
                break;
        }
        return false;
    }

    @Override // w39
    public final int b() {
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 0:
                return ((e83) obj).k3.size();
            case 1:
                return ((m66) obj).s.size();
            default:
                return ((t09) obj).d.size();
        }
    }

    @Override // w39
    public final int d(int i) {
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 0:
                return ((z73) ((e83) obj).k3.get(i)).a;
            case 1:
                ArrayList arrayList = ((m66) obj).s;
                if (i < 0 || i >= arrayList.size()) {
                    return 2;
                }
                return ((g66) arrayList.get(i)).a;
            default:
                return ((k09) ((t09) obj).d.get(i)).a;
        }
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        float f;
        byte b = this.d;
        Boolean bool = null;
        Object obj = this.e;
        switch (b) {
            case 0:
                e83 e83Var = (e83) obj;
                ArrayList arrayList = e83Var.k3;
                int b2 = s49Var.b();
                View view = s49Var.a;
                z73 z73Var = (z73) arrayList.get(b2);
                int i2 = s49Var.f;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 != 4) {
                                    if (i2 != 5) {
                                        if (i2 == 6) {
                                            ((f83) view).setTop(true);
                                            break;
                                        }
                                    } else {
                                        ((wgb) view).k(z73Var.f.toString(), false);
                                        break;
                                    }
                                } else {
                                    ((ld5) view).setText(z73Var.f);
                                    break;
                                }
                            } else {
                                ((mhb) view).setText(z73Var.f);
                                break;
                            }
                        } else {
                            x73 x73Var = (x73) view;
                            int i3 = z73Var.d;
                            int i4 = z73Var.e;
                            int i5 = z73Var.c;
                            CharSequence charSequence = z73Var.f;
                            String str = z73Var.g;
                            int i6 = i + 1;
                            boolean z = i6 < b() && ((z73) arrayList.get(i6)).a == i2;
                            ImageView imageView = x73Var.a;
                            if (i5 == 0) {
                                imageView.setVisibility(8);
                            } else {
                                imageView.setVisibility(0);
                                boolean o = bkb.I.o();
                                g37 g37Var = new g37((byte) 1);
                                g37Var.b(i3, i4);
                                g37Var.b = o;
                                imageView.setBackground(g37Var);
                                imageView.setImageResource(i5);
                            }
                            x73Var.b.setText(charSequence);
                            x73Var.d.setText(str);
                            x73Var.e = z;
                            x73Var.setWillNotDraw(!z);
                            int i7 = z73Var.h;
                            if (i7 >= 0) {
                                d83[] d83VarArr = e83Var.o3;
                                if (i7 >= d83VarArr.length || d83VarArr[i7].c > 0) {
                                    bool = Boolean.valueOf(e83Var.q3[i7]);
                                }
                            }
                            ImageView imageView2 = x73Var.c;
                            if (bool != null) {
                                imageView2.setVisibility(0);
                                imageView2.animate().rotation(bool.booleanValue() ? 0.0f : 180.0f).setDuration(360L).setInterpolator(s33.h).start();
                                break;
                            } else {
                                imageView2.setVisibility(8);
                                break;
                            }
                        }
                    } else {
                        ((g83) view).a.setText(z73Var.f);
                        break;
                    }
                } else {
                    r51 r51Var = (r51) view;
                    if (e83Var.o3 != null) {
                        r51Var.e(e83Var.r3, e83Var.f3, e83Var.p3);
                    }
                    e83Var.f3 = false;
                    break;
                }
                break;
            case 1:
                ArrayList arrayList2 = ((m66) obj).s;
                if (i >= 0 && i < arrayList2.size()) {
                    g66 g66Var = (g66) arrayList2.get(i);
                    int i8 = s49Var.f;
                    View view2 = s49Var.a;
                    if (i8 != 0) {
                        if (i8 != 1) {
                            if (i8 != 2) {
                                if (i8 != 3 && i8 != 4) {
                                    if (i8 == 5) {
                                        wgb wgbVar = (wgb) view2;
                                        if (g66Var.f) {
                                            wgbVar.l(g66Var.c, na7.c1().getBoolean("view_animations", true), false);
                                            break;
                                        }
                                    }
                                } else {
                                    int i9 = i + 1;
                                    boolean z2 = i9 < arrayList2.size() && ((g66) arrayList2.get(i9)).a != 2;
                                    l66 l66Var = (l66) view2;
                                    Switch r2 = l66Var.f;
                                    ImageView imageView3 = l66Var.e;
                                    hn hnVar = l66Var.d;
                                    ImageView imageView4 = l66Var.a;
                                    wb wbVar = l66Var.c;
                                    int i10 = g66Var.a;
                                    String str2 = g66Var.c;
                                    int i11 = g66Var.e;
                                    wf2 wf2Var = l66Var.h;
                                    if (i10 == 3) {
                                        wf2Var.setVisibility(8);
                                        imageView4.setVisibility(0);
                                        imageView4.setImageResource(g66Var.d);
                                        wbVar.setText(str2);
                                        boolean z3 = Integer.bitCount(i11) > 1;
                                        l66Var.w = z3;
                                        if (z3) {
                                            l66Var.c(g66Var, false);
                                            hnVar.setVisibility(0);
                                            imageView3.setVisibility(0);
                                        } else {
                                            hnVar.setVisibility(8);
                                            imageView3.setVisibility(8);
                                        }
                                        wbVar.setTranslationX(0.0f);
                                        r2.setVisibility(0);
                                        r2.c(e66.e(i11), false);
                                        l66Var.r = Integer.bitCount(i11) > 1;
                                    } else {
                                        wf2Var.setVisibility(0);
                                        wf2Var.a(e66.e(i11), false);
                                        imageView4.setVisibility(8);
                                        r2.setVisibility(8);
                                        hnVar.setVisibility(8);
                                        imageView3.setVisibility(8);
                                        wbVar.setText(str2);
                                        wbVar.setTranslationX(gl.L(41.0f) * (k96.a0 ? -2.2f : 1.0f));
                                        l66Var.w = false;
                                        l66Var.r = false;
                                    }
                                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) l66Var.b.getLayoutParams();
                                    if (g66Var.a == 3) {
                                        f = (k96.a0 ? 64 : 75) + 4;
                                    } else {
                                        f = 8.0f;
                                    }
                                    marginLayoutParams.rightMargin = gl.L(f);
                                    l66Var.n = z2;
                                    l66Var.setWillNotDraw((z2 || l66Var.r) ? false : true);
                                    l66Var.b(e66.f(), false);
                                    break;
                                }
                            } else {
                                mhb mhbVar = (mhb) view2;
                                String str3 = g66Var.c;
                                if (TextUtils.isEmpty(str3)) {
                                    mhbVar.setFixedSize(12);
                                } else {
                                    mhbVar.setFixedSize(0);
                                }
                                mhbVar.setText(str3);
                                mhbVar.setContentDescription(str3);
                                mhbVar.setBackground(null);
                                break;
                            }
                        } else {
                            ((k66) view2).a();
                            break;
                        }
                    } else {
                        ((ld5) view2).setText(g66Var.c);
                        break;
                    }
                }
                break;
            default:
                int i12 = s49Var.f;
                if (i12 == 0 || i12 == 3) {
                    r09 r09Var = (r09) s49Var.a;
                    r09Var.setScaleX(1.0f);
                    r09Var.setScaleY(1.0f);
                    r09Var.d(i, ((k09) ((t09) obj).d.get(i)).c);
                    break;
                }
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        View view;
        View view2;
        byte b = this.d;
        Object obj = this.e;
        View view3 = null;
        final byte b2 = 0;
        final byte b3 = 1;
        switch (b) {
            case 0:
                e83 e83Var = (e83) obj;
                wjb wjbVar = e83Var.o2;
                if (i == 0) {
                    Context context = e83Var.getContext();
                    int[] iArr = h83.s;
                    b83 b83Var = new b83(this, context, iArr.length, iArr, h83.w);
                    e83Var.v3 = b83Var;
                    b83Var.setInterceptTouch(false);
                    View view4 = e83Var.v3;
                    view4.setTag(-33024);
                    view = view4;
                } else if (i == 1) {
                    Context context2 = e83Var.getContext();
                    g83 g83Var = new g83(context2);
                    TextView textView = new TextView(context2);
                    g83Var.a = textView;
                    textView.setGravity(17);
                    textView.setTextSize(1, 13.0f);
                    zkb.X(textView, bkb.x6, null);
                    g83Var.addView(textView, nme.d(-1, -2.0f, kk7.D1, 24.0f, 0.0f, 24.0f, 14.0f));
                    g83Var.setTag(-33024);
                    view = g83Var;
                } else if (i == 3) {
                    view = new mhb(e83Var.getContext());
                } else if (i == 4) {
                    View ld5Var = new ld5(e83Var.getContext());
                    zkb.h(bkb.c6, wjbVar, ld5Var);
                    view = ld5Var;
                } else if (i != 5) {
                    byte b4 = 6;
                    if (i == 6) {
                        f83 f83Var = new f83(e83Var.getContext());
                        f83Var.a = new Path();
                        Paint paint = new Paint(1);
                        f83Var.b = paint;
                        f83Var.c = true;
                        paint.setShadowLayer(gl.L(1.0f), 0.0f, gl.L(-0.66f), 251658240);
                        paint.setColor(bkb.w0(null, bkb.c6, false));
                        view = f83Var;
                    } else if (i != 7) {
                        view = new x73(e83Var.w3, e83Var.getContext());
                    } else {
                        View d62Var = new d62(e83Var.getContext(), b4);
                        int i2 = bkb.c6;
                        int i3 = e83.x3;
                        zkb.h(i2, e83Var.o2, d62Var);
                        view = d62Var;
                    }
                } else {
                    wgb wgbVar = new wgb(e83Var.getContext());
                    zkb.W(wgbVar.getTextView(), bkb.o7, wjbVar);
                    zkb.h(bkb.c6, wjbVar, wgbVar);
                    view = wgbVar;
                }
                return new y29(view);
            case 1:
                m66 m66Var = (m66) obj;
                Context context3 = viewGroup.getContext();
                if (i == 0) {
                    view3 = new ld5(context3);
                } else if (i == 1) {
                    view3 = new k66(m66Var, context3);
                } else if (i == 2) {
                    view3 = new f66(context3);
                } else if (i == 3 || i == 4) {
                    view3 = new l66(m66Var, context3);
                } else if (i == 5) {
                    view3 = new wgb(23, null, context3, false, true);
                }
                return new y29(view3);
            default:
                t09 t09Var = (t09) obj;
                if (i == 1) {
                    t09Var.S = new FrameLayout(t09Var.getContext());
                    oh8 oh8Var = new oh8(0, null, t09Var.getContext());
                    t09Var.v0 = oh8Var;
                    int w0 = bkb.w0(null, bkb.E8, false);
                    int i4 = bkb.g5;
                    oh8Var.setColor(bm2.f(0.7f, w0, bkb.w0(null, i4, false)));
                    zkb.s(t09Var.v0, i4, null, PorterDuff.Mode.MULTIPLY);
                    t09Var.v0.setScaleX(0.0f);
                    t09Var.v0.setScaleY(0.0f);
                    t09Var.v0.setPadding(gl.L(1.0f), gl.L(1.0f), gl.L(1.0f), gl.L(1.0f));
                    t09Var.S.addView(t09Var.v0, nme.e(26, 26, 17));
                    t09Var.v0.setOnClickListener(new View.OnClickListener(this) { // from class: j09
                        public final /* synthetic */ c83 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view5) {
                            byte b5 = b2;
                            c83 c83Var = this.b;
                            switch (b5) {
                                case 0:
                                    view5.getLocationOnScreen(new int[2]);
                                    t09 t09Var2 = (t09) c83Var.e;
                                    view5.getMeasuredWidth();
                                    view5.getMeasuredHeight();
                                    new jh8(t09Var2.u0, 4, true).show();
                                    break;
                                default:
                                    ((t09) c83Var.e).o();
                                    break;
                            }
                        }
                    });
                    view2 = t09Var.S;
                } else if (i != 2) {
                    view2 = new r09(t09Var, t09Var.getContext());
                } else {
                    t09Var.T = new st(t09Var, t09Var.getContext());
                    q43 q43Var = new q43(t09Var, t09Var.getContext());
                    t09Var.w0 = q43Var;
                    q43Var.setImageResource(R.drawable.msg_reactions_expand);
                    t09Var.w0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    byte b5 = t09Var.N0;
                    if (b5 == 1 || b5 == 2 || b5 == 4) {
                        t09Var.w0.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
                    } else {
                        zkb.s(t09Var.w0, bkb.g5, null, PorterDuff.Mode.MULTIPLY);
                    }
                    q43 q43Var2 = t09Var.w0;
                    int L = gl.L(28.0f);
                    int i5 = bkb.h6;
                    zkb.R(q43Var2, bkb.h0(L, 0, bm2.o(bkb.w0(null, i5, false), 40)), null, zkb.g(i5, 40), null);
                    t09Var.w0.setPadding(gl.L(2.0f), gl.L(2.0f), gl.L(2.0f), gl.L(2.0f));
                    t09Var.w0.setContentDescription(k96.M0(2131754883, null));
                    t09Var.T.addView(t09Var.w0, nme.e(30, 30, 17));
                    t09Var.w0.setOnClickListener(new View.OnClickListener(this) { // from class: j09
                        public final /* synthetic */ c83 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view5) {
                            byte b52 = b3;
                            c83 c83Var = this.b;
                            switch (b52) {
                                case 0:
                                    view5.getLocationOnScreen(new int[2]);
                                    t09 t09Var2 = (t09) c83Var.e;
                                    view5.getMeasuredWidth();
                                    view5.getMeasuredHeight();
                                    new jh8(t09Var2.u0, 4, true).show();
                                    break;
                                default:
                                    ((t09) c83Var.e).o();
                                    break;
                            }
                        }
                    });
                    view2 = t09Var.T;
                }
                int topOffset = ((t09Var.getLayoutParams().height - ((int) t09Var.getTopOffset())) - t09Var.getPaddingTop()) - t09Var.getPaddingBottom();
                view2.setLayoutParams(new e49(topOffset - gl.L(12.0f), topOffset));
                return new y29(view2);
        }
    }

    @Override // w39
    public final void y(s49 s49Var) {
        int b;
        switch (this.d) {
            case 2:
                ArrayList arrayList = ((t09) this.e).d;
                int i = s49Var.f;
                if ((i == 0 || i == 3) && (b = s49Var.b()) >= 0 && b < arrayList.size()) {
                    ((r09) s49Var.a).f(((k09) arrayList.get(b)).c, false);
                    break;
                }
                break;
        }
    }
}
