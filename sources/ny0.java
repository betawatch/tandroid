// default package

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ny0 extends q59 {
    public final /* synthetic */ byte c;
    public final Object d;

    public ny0(Context context) {
        this.c = (byte) 7;
        this.d = context;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        switch (this.c) {
            case 0:
            case 1:
            case 2:
                return false;
            case 3:
            case 4:
                return true;
            case 5:
                int i = u69Var.f;
                return i == 0 || i == 2;
            case 6:
                return u69Var.f == 1;
            case 7:
                int b = u69Var.b();
                return b == 1 || b == 2 || b == 3 || b == 4 || b == 7;
            case 8:
                int i2 = u69Var.f;
                return i2 == 1 || i2 == 2;
            case 9:
                return true;
            case 10:
                return false;
            case 11:
            default:
                return true;
        }
    }

    public final k47 E(int i) {
        ju9 ju9Var = (ju9) this.d;
        int i2 = ju9Var.w;
        if (i >= i2 && i < ju9Var.x) {
            return (k47) ju9Var.e.get(i - i2);
        }
        int i3 = ju9Var.E;
        if (i < i3 || i >= ju9Var.F) {
            return null;
        }
        return (k47) ju9Var.f.get(i - i3);
    }

    public final void H(int i, int i2) {
        int[] iArr = ((wsa) this.d).N2;
        if (iArr[0] == i && iArr[1] == i2) {
            return;
        }
        iArr[0] = i;
        iArr[1] = i2;
        f();
    }

    @Override // y59
    public final int b() {
        byte b = this.c;
        Object obj = this.d;
        switch (b) {
            case 0:
                return 1;
            case 1:
                return !((wf3) obj).b2.h() ? 3 : 1;
            case 2:
                return ((aa4) obj).d.size();
            case 3:
                return ((uh4) obj).f3.size();
            case 4:
                return ((t57) obj).c.size();
            case 5:
                return ((ep7) obj).h;
            case 6:
                return ((yj8) obj).a2;
            case 7:
                return 6;
            case 8:
                return ((ju9) obj).r;
            case 9:
                return ((xu9) obj).r.size();
            case 10:
                return ((wsa) obj).N2.length;
            case 11:
                return ((oyb) obj).U.size();
            default:
                return 12;
        }
    }

    @Override // y59
    public final long c(int i) {
        cp7 cp7Var;
        switch (this.c) {
            case 5:
                ep7 ep7Var = (ep7) this.d;
                int i2 = ep7Var.E;
                if (i < i2 || i >= ep7Var.F) {
                    int i3 = ep7Var.n;
                    cp7Var = (i < i3 || i >= ep7Var.r) ? null : (cp7) ep7Var.a.get(i - i3);
                } else {
                    cp7Var = (cp7) ep7Var.b.get(i - i2);
                }
                if (cp7Var != null) {
                    return cp7Var.c;
                }
                if (i == 0) {
                    return 1L;
                }
                if (i == ep7Var.y) {
                    return 2L;
                }
                if (i == ep7Var.s) {
                    return 3L;
                }
                if (i == ep7Var.w) {
                    return 4L;
                }
                if (i == ep7Var.x) {
                    return 5L;
                }
                throw new RuntimeException();
            default:
                return super.c(i);
        }
    }

    @Override // y59
    public final int d(int i) {
        byte b = this.c;
        Object obj = this.d;
        switch (b) {
            case 0:
            case 1:
                return i;
            case 2:
                return ((y94) ((aa4) obj).d.get(i)).a;
            case 3:
            case 4:
            default:
                return super.d(i);
            case 5:
                ep7 ep7Var = (ep7) obj;
                if (i < ep7Var.E || i >= ep7Var.F) {
                    if (i == 0 || i == ep7Var.y) {
                        return 1;
                    }
                    if (i == ep7Var.s) {
                        return 2;
                    }
                    if (i == ep7Var.w || i == ep7Var.x) {
                        return 3;
                    }
                }
                return 0;
            case 6:
                yj8 yj8Var = (yj8) obj;
                if (i != yj8Var.b2) {
                    if (i >= yj8Var.c2 && i < yj8Var.d2) {
                        return yj8Var.a1();
                    }
                    if (i >= yj8Var.e2 && i < yj8Var.f2) {
                        return 1;
                    }
                    if (i == yj8Var.g2) {
                        return 2;
                    }
                    if (i == yj8Var.h2) {
                        return 3;
                    }
                    if (i == 0) {
                        return 4;
                    }
                    if (i == yj8Var.i2) {
                        return 5;
                    }
                }
                return 0;
            case 7:
                if (i == 0 || i == 6) {
                    return 0;
                }
                if (i == 7) {
                    return 1;
                }
                return (i == 5 || i == 8) ? 3 : 2;
            case 8:
                ju9 ju9Var = (ju9) obj;
                if (i == ju9Var.s || i == ju9Var.y) {
                    return 0;
                }
                k47 E = E(i);
                return (E == null || !E.I3()) ? 1 : 2;
        }
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        boolean z;
        vu9 vu9Var;
        cp7 cp7Var = null;
        switch (this.c) {
            case 0:
            case 1:
                break;
            case 2:
                aa4 aa4Var = (aa4) this.d;
                ArrayList arrayList = aa4Var.d;
                if (((y94) arrayList.get(i)).a == 1) {
                    z94 z94Var = (z94) u69Var.a;
                    z94Var.c.setColorFilter(new PorterDuffColorFilter(aa4Var.e.getPixel(i, 0), PorterDuff.Mode.MULTIPLY));
                    z94Var.c.setImageDrawable(aa4Var.getContext().getDrawable(((y94) arrayList.get(i)).b));
                    z94Var.a.setText(((y94) arrayList.get(i)).c);
                    z94Var.b.setText(((y94) arrayList.get(i)).d);
                    break;
                }
                break;
            case 3:
                ((th4) u69Var).v.setData((sh4) ((uh4) this.d).f3.get(i));
                break;
            case 4:
                s57 s57Var = (s57) u69Var.a;
                t57 t57Var = (t57) this.d;
                s57Var.a((TLObject) t57Var.c.get(i), ((Integer) t57Var.b.get(i)).intValue(), false);
                break;
            case 5:
                ep7 ep7Var = (ep7) this.d;
                ylb ylbVar = ep7Var.f;
                int i2 = u69Var.f;
                View view = u69Var.a;
                if (i2 == 0) {
                    dp7 dp7Var = (dp7) view;
                    int i3 = ep7Var.E;
                    if (i >= i3 && i < ep7Var.F) {
                        cp7Var = (cp7) ep7Var.b.get(i - i3);
                    }
                    int i4 = ep7Var.n;
                    if (i >= i4 && i < ep7Var.r) {
                        cp7Var = (cp7) ep7Var.a.get(i - i4);
                    }
                    if (cp7Var != null) {
                        boolean z2 = dp7Var.e == cp7Var;
                        boolean z3 = cp7Var == ep7Var.H;
                        boolean z4 = ep7Var.J.get(cp7Var.c) != null;
                        dp7Var.e = cp7Var;
                        dp7Var.a.setText(cp7Var.f);
                        dp7Var.d = i != ep7Var.F - 1;
                        dp7Var.b.a(z3, z2);
                        dp7Var.c.a(z4, z2);
                        break;
                    }
                } else if (i2 == 1) {
                    jf5 jf5Var = (jf5) view;
                    if (i != 0) {
                        if (i == ep7Var.y) {
                            jf5Var.setText(jb6.M0(2131743974, null));
                            break;
                        }
                    } else {
                        jf5Var.setText(jb6.M0(2131743896, null));
                        break;
                    }
                } else if (i2 == 2) {
                    y23 y23Var = (y23) view;
                    Drawable drawable = y23Var.getContext().getResources().getDrawable(R.drawable.poll_add_circle);
                    Drawable drawable2 = y23Var.getContext().getResources().getDrawable(R.drawable.poll_add_plus);
                    int i5 = cmb.M6;
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    anb.x(y23Var, drawable, i5, ylbVar, mode);
                    anb.x(y23Var, drawable2, cmb.j7, ylbVar, mode);
                    sn2 sn2Var = new sn2(drawable, drawable2);
                    y23Var.a.l(jb6.M0(2131743490, null), false);
                    y23Var.b.setImageDrawable(sn2Var);
                    y23Var.c = false;
                    break;
                }
                break;
            case 6:
                View view2 = u69Var.a;
                yj8 yj8Var = (yj8) this.d;
                int i6 = yj8Var.e2;
                if (i >= i6 && i < yj8Var.f2) {
                    ((lj8) view2).a((hk8) yj8Var.S1.get(i - i6), i != yj8Var.f2 - 1);
                    break;
                } else if (i >= yj8Var.c2 && i < yj8Var.d2) {
                    yj8Var.b1(view2);
                    break;
                }
                break;
            case 7:
                int i7 = u69Var.f;
                if (i7 != 0) {
                    View view3 = u69Var.a;
                    if (i7 != 1) {
                        if (i7 != 2) {
                            ((njb) view3).setText(i == 5 ? jb6.M0(2131745720, null) : jb6.M0(2131745723, null));
                            break;
                        } else {
                            vkb vkbVar = (vkb) view3;
                            if (i != 1) {
                                if (i != 2) {
                                    if (i != 3) {
                                        vkbVar.c(jb6.M0(2131745730, null), vn9.b0(yed.g.a()), false, false);
                                        break;
                                    } else {
                                        vkbVar.c(jb6.M0(2131745722, null), hg9.k(new StringBuilder(), ((pn9) yed.f.a()).a, " FPS"), false, true);
                                        break;
                                    }
                                } else {
                                    String M0 = jb6.M0(2131745729, null);
                                    on9 on9Var = (on9) yed.e.a();
                                    vkbVar.c(M0, on9Var == on9.a ? jb6.M0(2131745728, null) : on9Var == on9.b ? jb6.M0(2131745726, null) : jb6.M0(2131745727, null), false, true);
                                    break;
                                }
                            } else {
                                vkbVar.c(jb6.M0(2131745719, null), hg9.k(new StringBuilder(), ((sn9) yed.d.a()).a, "p"), false, true);
                                break;
                            }
                        }
                    } else {
                        String M02 = jb6.M0(2131745724, null);
                        in0 in0Var = yed.h;
                        in0Var.a();
                        ((bjb) view3).f(M02, in0Var.d, false);
                        break;
                    }
                } else {
                    ((jf5) u69Var.a).setText(i == 0 ? jb6.M0(2131745721, null) : jb6.M0(2131745725, null));
                    break;
                }
            case 8:
                ju9 ju9Var = (ju9) this.d;
                ug4 ug4Var = ju9Var.K;
                int i8 = u69Var.f;
                View view4 = u69Var.a;
                if (i8 != 0) {
                    k47 E = E(i);
                    if (E != null) {
                        boolean z5 = ju9Var.J.u() && i >= ju9Var.w && i < ju9Var.x;
                        if (i8 != 1) {
                            if (i8 == 2) {
                                eda edaVar = (eda) view4;
                                int e1 = edaVar.getMessage() == null ? 0 : edaVar.getMessage().e1();
                                edaVar.f(E, true);
                                int e12 = edaVar.getMessage().e1();
                                ug4Var.a = k47.B0(edaVar.getMessage().k);
                                ug4Var.b = e12;
                                edaVar.e(ju9Var.J.e(ug4Var), e1 == E.e1());
                                z = e1 == E.e1();
                                if (edaVar.e0 != z5) {
                                    edaVar.e0 = z5;
                                    if (!z) {
                                        edaVar.f0 = z5 ? 1.0f : 0.0f;
                                    }
                                    edaVar.invalidate();
                                    break;
                                }
                            }
                        } else {
                            gu9 gu9Var = (gu9) view4;
                            anb.h(cmb.c6, null, gu9Var);
                            ida idaVar = gu9Var.a;
                            int e13 = idaVar.getMessage() == null ? 0 : idaVar.getMessage().e1();
                            idaVar.c(E, true);
                            int e14 = idaVar.getMessage().e1();
                            ug4Var.a = k47.B0(idaVar.getMessage().k);
                            ug4Var.b = e14;
                            idaVar.b(ju9Var.J.e(ug4Var), e13 == E.e1());
                            z = e13 == E.e1();
                            if (idaVar.P != z5) {
                                idaVar.P = z5;
                                if (!z) {
                                    idaVar.Q = z5 ? 1.0f : 0.0f;
                                }
                                idaVar.invalidate();
                                break;
                            }
                        }
                    }
                } else {
                    l55 l55Var = (l55) view4;
                    if (i != ju9Var.s) {
                        if (i == ju9Var.y) {
                            l55Var.b(jb6.M0(2131746095, null), jb6.M0(2131745229, null), new wk8(this, (byte) 18));
                            break;
                        }
                    } else {
                        String M03 = jb6.M0(2131751281, null);
                        boolean equals = l55Var.getText().equals(M03);
                        boolean z6 = ju9Var.I;
                        if (!equals) {
                            l55Var.b(M03, z6 ? jb6.M0(2131747166, null) : jb6.M0(2131745786, null), new iu9(this));
                            break;
                        } else {
                            String M04 = z6 ? jb6.M0(2131747166, null) : jb6.M0(2131745786, null);
                            boolean z7 = ju9Var.I;
                            rj rjVar = l55Var.b;
                            rjVar.c(M04, true, z7);
                            rjVar.setVisibility(0);
                            break;
                        }
                    }
                }
                break;
            case 9:
                View view5 = u69Var.a;
                xu9 xu9Var = (xu9) this.d;
                ArrayList arrayList2 = xu9Var.r;
                if (i >= 0 && i < arrayList2.size()) {
                    uu9 uu9Var = (uu9) arrayList2.get(i);
                    wu9 wu9Var = (wu9) view5;
                    k39 k39Var = wu9Var.d;
                    boolean z8 = k39Var == null || !k39Var.equals(uu9Var.a);
                    if (z8) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = uu9Var.a.g();
                        tL_reactionCount.count = uu9Var.b;
                        xu9 xu9Var2 = wu9Var.s;
                        vu9 vu9Var2 = new vu9(wu9Var, xu9Var2.a, wu9Var, tL_reactionCount, xu9Var2.c);
                        wu9Var.a = vu9Var2;
                        vu9Var2.E.d(gm.L(29.0f), gm.L(100.0f));
                        vu9Var = wu9Var.a;
                        vu9Var.p = true;
                        vu9Var.R = true;
                    } else {
                        vu9Var = wu9Var.a;
                        vu9Var.v = uu9Var.b;
                    }
                    wu9Var.d = uu9Var.a;
                    if (!z8) {
                        vu9Var.e = vu9Var.z;
                    }
                    vu9Var.z = gm.L(44.33f);
                    wu9Var.a.t = !TextUtils.isEmpty(uu9Var.c);
                    vu9 vu9Var3 = wu9Var.a;
                    boolean z9 = vu9Var3.t;
                    ho hoVar = vu9Var3.F;
                    if (z9) {
                        hoVar.t(gw3.m(uu9Var.c, hoVar.a.getFontMetricsInt(), false, null, 0), !z8, true);
                    } else if (hoVar != null) {
                        hoVar.t("", !z8, true);
                    }
                    wu9Var.a.getClass();
                    wu9Var.a.E.c(uu9Var.b, !z8);
                    vu9 vu9Var4 = wu9Var.a;
                    if (vu9Var4.E != null && (vu9Var4.v > 0 || vu9Var4.t)) {
                        float f = vu9Var4.z;
                        float L = gm.L(wu9Var.a.t ? 4.0f : 0.0f) + ((int) Math.ceil(r6.m));
                        vu9 vu9Var5 = wu9Var.a;
                        vu9Var4.z = (int) (L + vu9Var5.F.d + f);
                        vu9Var4 = vu9Var5;
                    }
                    if (z8) {
                        vu9Var4.e = vu9Var4.z;
                    }
                    vu9Var4.A = gm.L(28.0f);
                    vu9 vu9Var6 = wu9Var.a;
                    vu9Var6.o = wu9Var.e;
                    if (wu9Var.r) {
                        vu9Var6.a();
                    }
                    if (!z8) {
                        wu9Var.requestLayout();
                    }
                    ((wu9) view5).a(uu9Var.a.h == xu9Var.h, false);
                    break;
                }
                break;
            case 10:
                int[] iArr = ((wsa) this.d).N2;
                int length = (iArr.length - 1) - i;
                oy0 oy0Var = (oy0) u69Var.a;
                int i9 = iArr[length];
                if (oy0Var.a != i9) {
                    oy0Var.a = i9;
                    oy0Var.requestLayout();
                    break;
                }
                break;
            case 11:
                myb mybVar = (myb) u69Var.a;
                lyb lybVar = (lyb) ((oyb) this.d).U.get(i);
                oyb oybVar = mybVar.s;
                bf0 bf0Var = mybVar.a;
                lyb lybVar2 = mybVar.e;
                z = lybVar2 != null && lybVar2.a == lybVar.a && Objects.equals(lybVar2.b, lybVar.b);
                if (oybVar.a0 >= 1.0f && oybVar.k0 == null) {
                    mybVar.setScaleX(1.0f);
                    mybVar.setScaleY(1.0f);
                    mybVar.setAlpha(1.0f);
                }
                mybVar.e = lybVar;
                if (!z) {
                    bf0Var.setAnimatedEmojiDrawable(null);
                    mybVar.h = null;
                    mybVar.n = 0;
                    if (lybVar.a != 0) {
                        mybVar.f = null;
                        bf0Var.setVisibility(0);
                        vm vmVar = new vm(3, oybVar.a, lybVar.a);
                        mybVar.h = vmVar;
                        bf0Var.setAnimatedEmojiDrawable(vmVar);
                    } else {
                        mybVar.f = jb6.M0(lybVar.b.booleanValue() ? 2131743678 : 2131743677, null);
                        bf0Var.setVisibility(8);
                    }
                    mybVar.setContentDescription(mybVar.f);
                }
                mybVar.a(z);
                mybVar.requestLayout();
                mybVar.invalidate();
                break;
            default:
                ((ltc) u69Var.a).a = WallpapersListActivity.j0[i];
                break;
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        View view;
        View view2;
        View view3;
        View view4;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        byte b = this.c;
        byte b2 = 5;
        final byte b3 = 1;
        final byte b4 = 0;
        Object obj = this.d;
        switch (b) {
            case 0:
                return new b59(((py0) obj).S1);
            case 1:
                wf3 wf3Var = (wf3) obj;
                if (i == 0) {
                    view = wf3Var.Y1;
                } else if (i == 2) {
                    View view5 = wf3Var.Z1;
                    g69 g69Var = new g69(-1, -2);
                    int i2 = wf3Var.u0;
                    ((ViewGroup.MarginLayoutParams) g69Var).leftMargin = i2;
                    ((ViewGroup.MarginLayoutParams) g69Var).rightMargin = i2;
                    view5.setLayoutParams(g69Var);
                    view = view5;
                } else {
                    njb njbVar = new njb(viewGroup.getContext());
                    njbVar.setFixedSize(12);
                    int i3 = cmb.Z6;
                    ColorDrawable colorDrawable = new ColorDrawable(cmb.w0(null, i3, false));
                    anb.x(njbVar, colorDrawable, i3, null, PorterDuff.Mode.SRC_IN);
                    sn2 sn2Var = new sn2(colorDrawable, cmb.W0(viewGroup.getContext(), R.drawable.greydivider_bottom, cmb.a7));
                    sn2Var.x = true;
                    njbVar.setBackgroundDrawable(sn2Var);
                    view = njbVar;
                }
                return new b59(view);
            case 2:
                aa4 aa4Var = (aa4) obj;
                ylb ylbVar = aa4Var.a;
                if (i == 0) {
                    view2 = new x94(aa4Var, aa4Var.getContext());
                } else if (i == 2) {
                    view2 = new ak4(aa4Var.getContext(), 16, (byte) 0);
                } else {
                    Context context = aa4Var.getContext();
                    z94 z94Var = new z94(context);
                    ImageView imageView = new ImageView(context);
                    z94Var.c = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    z94Var.addView(imageView, qoe.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
                    TextView textView = new TextView(context);
                    z94Var.a = textView;
                    textView.setTypeface(gm.o());
                    anb.X(textView, cmb.F6, ylbVar);
                    textView.setTextSize(1, 14.0f);
                    z94Var.addView(textView, qoe.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    z94Var.b = textView2;
                    anb.X(textView2, cmb.x6, ylbVar);
                    textView2.setTextSize(1, 14.0f);
                    z94Var.addView(textView2, qoe.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
                    view2 = z94Var;
                }
                return kt6.h(view2, view2, -1, -2);
            case 3:
                rh4 rh4Var = new rh4(viewGroup.getContext(), ((uh4) obj).o2);
                th4 th4Var = new th4(rh4Var);
                th4Var.v = rh4Var;
                rh4Var.setLayoutParams(new g69(-2, gm.L(30.0f)));
                return th4Var;
            case 4:
                s57 s57Var = new s57(viewGroup.getContext());
                s57Var.setLayoutParams(new g69(-1, gm.L(50.0f)));
                return new b59(s57Var);
            case 5:
                ylb ylbVar2 = ((ep7) obj).f;
                Context context2 = viewGroup.getContext();
                if (i == 0) {
                    dp7 dp7Var = new dp7(context2);
                    RadioButton radioButton = new RadioButton(context2);
                    dp7Var.b = radioButton;
                    radioButton.setSize(gm.L(20.0f));
                    anb.O(radioButton, cmb.f7, cmb.g7, ylbVar2);
                    boolean z = jb6.a0;
                    dp7Var.addView(radioButton, qoe.d(22, 22.0f, (z ? 5 : 3) | 16, z ? 0 : 20, 0.0f, z ? (byte) 20 : (byte) 0, 0.0f));
                    jh2 jh2Var = new jh2(24, ylbVar2, context2);
                    dp7Var.c = jh2Var;
                    int i4 = cmb.c6;
                    jh2Var.b(-1, i4, cmb.j7);
                    jh2Var.setDrawUnchecked(false);
                    jh2Var.setDrawBackgroundAsArc(3);
                    boolean z2 = jb6.a0;
                    dp7Var.addView(jh2Var, qoe.d(26, 26.0f, (z2 ? 5 : 3) | 16, z2 ? 0 : 18, 0.0f, z2 ? 18 : 0, 0.0f));
                    jh2Var.a(true, false);
                    TextView textView3 = new TextView(context2);
                    dp7Var.a = textView3;
                    anb.X(textView3, cmb.F6, ylbVar2);
                    wi8.w(textView3, 1, 16.0f, 1, 1);
                    textView3.setSingleLine(true);
                    textView3.setEllipsize(TextUtils.TruncateAt.END);
                    textView3.setGravity((jb6.a0 ? 5 : 3) | 16);
                    boolean z3 = jb6.a0;
                    dp7Var.addView(textView3, qoe.d(-2, -2.0f, (z3 ? (byte) 5 : (byte) 3) | 16, z3 ? 23 : 61, 0.0f, z3 ? 61 : 23, 0.0f));
                    anb.h(i4, ylbVar2, dp7Var);
                    view3 = dp7Var;
                } else if (i == 2) {
                    y23 y23Var = new y23(70, ylbVar2, context2);
                    y23Var.d = (byte) 61;
                    anb.h(cmb.c6, ylbVar2, y23Var);
                    view3 = y23Var;
                } else if (i != 3) {
                    jf5 jf5Var = new jf5(context2, ylbVar2);
                    anb.h(cmb.c6, ylbVar2, jf5Var);
                    view3 = jf5Var;
                } else {
                    view3 = new bba(context2, (hg9) null);
                }
                return kt6.h(view3, view3, -1, -2);
            case 6:
                Context context3 = viewGroup.getContext();
                yj8 yj8Var = (yj8) obj;
                View c1 = yj8Var.c1(context3, i);
                if (c1 != null) {
                    return kt6.h(c1, c1, -1, -2);
                }
                if (i == 0) {
                    qmb qmbVar = new qmb((byte) 10, context3, this);
                    yj8Var.n2 = qmbVar;
                    qmbVar.setOrientation(1);
                    View view6 = yj8Var.w2;
                    if (view6 == null) {
                        yj8Var.m2 = new w94(context3, b3, b4, r9);
                        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        int i5 = cmb.Ck;
                        canvas.drawColor(on2.f(0.5f, cmb.v0(i5, yj8Var.J0), cmb.v0(cmb.g5, yj8Var.J0)));
                        yj8Var.m2.setBackgroundBitmap(createBitmap);
                        vs4 vs4Var = yj8Var.m2.b;
                        vs4Var.z = i5;
                        vs4Var.A = cmb.Bk;
                        vs4Var.b();
                        qmbVar.addView(yj8Var.m2, qoe.r(nm7.p2, nm7.p2, 1));
                    } else {
                        if (view6.getParent() != null) {
                            ((ViewGroup) yj8Var.w2.getParent()).removeView(yj8Var.w2);
                        }
                        yj8Var.Z0(qmbVar);
                    }
                    if (yj8Var.I2 == null) {
                        FrameLayout frameLayout3 = new FrameLayout(context3);
                        yj8Var.I2 = frameLayout3;
                        frameLayout3.setClipChildren(false);
                        Integer num = yj8Var.p2;
                        new PorterDuffColorFilter(num == null ? cmb.v0(cmb.u6, yj8Var.J0) : num.intValue(), PorterDuff.Mode.SRC_IN);
                        yj8Var.J2 = new l66[2];
                        int i6 = 0;
                        while (i6 < 2) {
                            yj8Var.J2[i6] = new a31(context3, yj8Var.J0, (byte) 5);
                            yj8Var.J2[i6].setVisibility(i6 == 0 ? 0 : 8);
                            yj8Var.J2[i6].setTextSize(1, 16.0f);
                            yj8Var.J2[i6].setTypeface(gm.o());
                            yj8Var.J2[i6].setGravity(1);
                            anb.X(yj8Var.J2[i6], cmb.F6, yj8Var.J0);
                            anb.G(yj8Var.J2[i6], cmb.I6, yj8Var.J0);
                            yj8Var.I2.addView(yj8Var.J2[i6], qoe.c(-2.0f, -1));
                            i6++;
                        }
                    }
                    if (yj8Var.I2.getParent() != null) {
                        ((ViewGroup) yj8Var.I2.getParent()).removeView(yj8Var.I2);
                    }
                    qmbVar.addView(yj8Var.I2, qoe.q(-2, -2, 0.0f, 1, 40, 0, 40, 0));
                    if (yj8Var.K2 == null) {
                        l66 l66Var = new l66(yj8Var.getContext(), yj8Var.J0);
                        yj8Var.K2 = l66Var;
                        l66Var.setTextSize(1, 14.0f);
                        yj8Var.K2.setGravity(1);
                        anb.X(yj8Var.K2, cmb.F6, yj8Var.J0);
                        anb.G(yj8Var.K2, cmb.I6, yj8Var.J0);
                    }
                    if (yj8Var.K2.getParent() != null) {
                        ((ViewGroup) yj8Var.K2.getParent()).removeView(yj8Var.K2);
                    }
                    qmbVar.addView(yj8Var.K2, qoe.q(-1, -2, 0.0f, 0, 24, 9, 24, 20));
                    yj8Var.e1(false);
                    yj8Var.l2 = new ub(context3, b2);
                    ne6 ne6Var = new ne6((byte) 12, context3, this);
                    ne6Var.setClipChildren(false);
                    ne6Var.addView(yj8Var.l2);
                    ne6Var.addView(qmbVar);
                    w94 w94Var = yj8Var.m2;
                    view4 = ne6Var;
                    if (w94Var != null) {
                        w94Var.setStarParticlesView(yj8Var.l2);
                        view4 = ne6Var;
                    }
                } else if (i == 2) {
                    int i7 = cmb.Z6;
                    bba bbaVar = new bba(context3, cmb.v0(i7, yj8Var.J0), 0);
                    anb.h(i7, yj8Var.J0, bbaVar);
                    view4 = bbaVar;
                } else if (i == 3) {
                    view4 = new o72(context3, r7);
                } else if (i == 4) {
                    view4 = new t1(context3, (byte) 0);
                } else if (i != 5) {
                    view4 = new xj8(this, context3, yj8Var.J0);
                } else {
                    mjb mjbVar = new mjb(context3, yj8Var.J0);
                    mjbVar.setBackground(true);
                    String M0 = jb6.M0(2131749439, "GiftPremiumPrivacyPolicyAndTerms");
                    int i8 = cmb.Wc;
                    mjbVar.setText(gm.G2(gm.N2(M0, i8, 0, new Runnable(this) { // from class: wj8
                        public final /* synthetic */ ny0 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b5 = b4;
                            ny0 ny0Var = this.b;
                            switch (b5) {
                                case 0:
                                    l11.u(((yj8) ny0Var.d).o2.getParentActivity(), jb6.M0(2131743881, null));
                                    break;
                                default:
                                    l11.u(((yj8) ny0Var.d).o2.getParentActivity(), jb6.M0(2131746516, null));
                                    break;
                            }
                        }
                    }, null), gm.N2(jb6.M0(2131749440, "GiftPremiumPrivacyPolicy"), i8, 0, new Runnable(this) { // from class: wj8
                        public final /* synthetic */ ny0 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b5 = b3;
                            ny0 ny0Var = this.b;
                            switch (b5) {
                                case 0:
                                    l11.u(((yj8) ny0Var.d).o2.getParentActivity(), jb6.M0(2131743881, null));
                                    break;
                                default:
                                    l11.u(((yj8) ny0Var.d).o2.getParentActivity(), jb6.M0(2131746516, null));
                                    break;
                            }
                        }
                    }, null), "%1$s"));
                    view4 = mjbVar;
                }
                view4.setLayoutParams(new g69(-1, -2));
                yj8Var.Y0(i, view4);
                return new b59(view4);
            case 7:
                Context context4 = (Context) obj;
                if (i == 0) {
                    frameLayout = new jf5(context4);
                } else if (i == 1) {
                    frameLayout = new bjb(context4);
                } else if (i == 2) {
                    vkb vkbVar = new vkb(context4);
                    vkbVar.setCanDisable(true);
                    frameLayout = vkbVar;
                } else {
                    frameLayout = new njb(context4);
                }
                frameLayout.setLayoutParams(new g69(-1, -2));
                return new b59(frameLayout);
            case 8:
                if (i == 0) {
                    frameLayout2 = new l55(viewGroup.getContext(), null);
                } else if (i == 1) {
                    Context context5 = viewGroup.getContext();
                    gu9 gu9Var = new gu9(context5);
                    ida idaVar = new ida(2, null, context5);
                    gu9Var.a = idaVar;
                    idaVar.r.setVisibility(8);
                    gu9Var.addView(idaVar);
                    frameLayout2 = gu9Var;
                } else {
                    frameLayout2 = new hu9(viewGroup.getContext());
                }
                frameLayout2.setLayoutParams(new g69(-1, -2));
                return new b59(frameLayout2);
            case 9:
                xu9 xu9Var = (xu9) obj;
                return new b59(new wu9(xu9Var, xu9Var.getContext()));
            case 10:
                oy0 oy0Var = new oy0(((wsa) obj).getContext());
                oy0Var.a = 0;
                return new b59(oy0Var);
            case 11:
                myb mybVar = new myb((oyb) obj, viewGroup.getContext());
                mybVar.setLayoutParams(new g69(-2, -1));
                return new b59(mybVar);
            default:
                qtc qtcVar = (qtc) obj;
                return new b59(new ltc(qtcVar.F, qtcVar.c));
        }
    }

    @Override // y59
    public final void y(u69 u69Var) {
        switch (this.c) {
            case 9:
                xu9 xu9Var = (xu9) this.d;
                ArrayList arrayList = xu9Var.r;
                int b = u69Var.b();
                if (b >= 0 && b < arrayList.size()) {
                    ((wu9) u69Var.a).a(((uu9) arrayList.get(b)).a.h == xu9Var.h, false);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ny0(Object obj, byte b) {
        this.c = b;
        this.d = obj;
    }

    private final void F(u69 u69Var, int i) {
    }

    private final void G(u69 u69Var, int i) {
    }
}
