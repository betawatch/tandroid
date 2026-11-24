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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class gx0 extends n39 {
    public final /* synthetic */ byte c;
    public final Object d;

    public gx0(Context context) {
        this.c = (byte) 7;
        this.d = context;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        switch (this.c) {
            case 0:
            case 1:
            case 2:
                return false;
            case 3:
            case 4:
                return true;
            case 5:
                int i = s49Var.f;
                return i == 0 || i == 2;
            case 6:
                return s49Var.f == 1;
            case 7:
                int b = s49Var.b();
                return b == 1 || b == 2 || b == 3 || b == 4 || b == 7;
            case 8:
                int i2 = s49Var.f;
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

    public final k27 E(int i) {
        hs9 hs9Var = (hs9) this.d;
        int i2 = hs9Var.w;
        if (i >= i2 && i < hs9Var.x) {
            return (k27) hs9Var.e.get(i - i2);
        }
        int i3 = hs9Var.E;
        if (i < i3 || i >= hs9Var.F) {
            return null;
        }
        return (k27) hs9Var.f.get(i - i3);
    }

    public final void H(int i, int i2) {
        int[] iArr = ((vqa) this.d).N2;
        if (iArr[0] == i && iArr[1] == i2) {
            return;
        }
        iArr[0] = i;
        iArr[1] = i2;
        f();
    }

    @Override // w39
    public final int b() {
        byte b = this.c;
        Object obj = this.d;
        switch (b) {
            case 0:
                return 1;
            case 1:
                return !((je3) obj).b2.h() ? 3 : 1;
            case 2:
                return ((r84) obj).d.size();
            case 3:
                return ((tf4) obj).f3.size();
            case 4:
                return ((t37) obj).c.size();
            case 5:
                return ((an7) obj).h;
            case 6:
                return ((xh8) obj).a2;
            case 7:
                return 6;
            case 8:
                return ((hs9) obj).r;
            case 9:
                return ((vs9) obj).r.size();
            case 10:
                return ((vqa) obj).N2.length;
            case 11:
                return ((lwb) obj).U.size();
            default:
                return 12;
        }
    }

    @Override // w39
    public final long c(int i) {
        ym7 ym7Var;
        switch (this.c) {
            case 5:
                an7 an7Var = (an7) this.d;
                int i2 = an7Var.E;
                if (i < i2 || i >= an7Var.F) {
                    int i3 = an7Var.n;
                    ym7Var = (i < i3 || i >= an7Var.r) ? null : (ym7) an7Var.a.get(i - i3);
                } else {
                    ym7Var = (ym7) an7Var.b.get(i - i2);
                }
                if (ym7Var != null) {
                    return ym7Var.c;
                }
                if (i == 0) {
                    return 1L;
                }
                if (i == an7Var.y) {
                    return 2L;
                }
                if (i == an7Var.s) {
                    return 3L;
                }
                if (i == an7Var.w) {
                    return 4L;
                }
                if (i == an7Var.x) {
                    return 5L;
                }
                throw new RuntimeException();
            default:
                return super.c(i);
        }
    }

    @Override // w39
    public final int d(int i) {
        byte b = this.c;
        Object obj = this.d;
        switch (b) {
            case 0:
            case 1:
                return i;
            case 2:
                return ((p84) ((r84) obj).d.get(i)).a;
            case 3:
            case 4:
            default:
                return super.d(i);
            case 5:
                an7 an7Var = (an7) obj;
                if (i < an7Var.E || i >= an7Var.F) {
                    if (i == 0 || i == an7Var.y) {
                        return 1;
                    }
                    if (i == an7Var.s) {
                        return 2;
                    }
                    if (i == an7Var.w || i == an7Var.x) {
                        return 3;
                    }
                }
                return 0;
            case 6:
                xh8 xh8Var = (xh8) obj;
                if (i != xh8Var.b2) {
                    if (i >= xh8Var.c2 && i < xh8Var.d2) {
                        return xh8Var.a1();
                    }
                    if (i >= xh8Var.e2 && i < xh8Var.f2) {
                        return 1;
                    }
                    if (i == xh8Var.g2) {
                        return 2;
                    }
                    if (i == xh8Var.h2) {
                        return 3;
                    }
                    if (i == 0) {
                        return 4;
                    }
                    if (i == xh8Var.i2) {
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
                hs9 hs9Var = (hs9) obj;
                if (i == hs9Var.s || i == hs9Var.y) {
                    return 0;
                }
                k27 E = E(i);
                return (E == null || !E.I3()) ? 1 : 2;
        }
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        boolean z;
        ts9 ts9Var;
        ym7 ym7Var = null;
        switch (this.c) {
            case 0:
            case 1:
                break;
            case 2:
                r84 r84Var = (r84) this.d;
                ArrayList arrayList = r84Var.d;
                if (((p84) arrayList.get(i)).a == 1) {
                    q84 q84Var = (q84) s49Var.a;
                    q84Var.c.setColorFilter(new PorterDuffColorFilter(r84Var.e.getPixel(i, 0), PorterDuff.Mode.MULTIPLY));
                    q84Var.c.setImageDrawable(r84Var.getContext().getDrawable(((p84) arrayList.get(i)).b));
                    q84Var.a.setText(((p84) arrayList.get(i)).c);
                    q84Var.b.setText(((p84) arrayList.get(i)).d);
                    break;
                }
                break;
            case 3:
                ((sf4) s49Var).v.setData((rf4) ((tf4) this.d).f3.get(i));
                break;
            case 4:
                s37 s37Var = (s37) s49Var.a;
                t37 t37Var = (t37) this.d;
                s37Var.a((TLObject) t37Var.c.get(i), ((Integer) t37Var.b.get(i)).intValue(), false);
                break;
            case 5:
                an7 an7Var = (an7) this.d;
                wjb wjbVar = an7Var.f;
                int i2 = s49Var.f;
                View view = s49Var.a;
                if (i2 == 0) {
                    zm7 zm7Var = (zm7) view;
                    int i3 = an7Var.E;
                    if (i >= i3 && i < an7Var.F) {
                        ym7Var = (ym7) an7Var.b.get(i - i3);
                    }
                    int i4 = an7Var.n;
                    if (i >= i4 && i < an7Var.r) {
                        ym7Var = (ym7) an7Var.a.get(i - i4);
                    }
                    if (ym7Var != null) {
                        boolean z2 = zm7Var.e == ym7Var;
                        boolean z3 = ym7Var == an7Var.H;
                        boolean z4 = an7Var.J.get(ym7Var.c) != null;
                        zm7Var.e = ym7Var;
                        zm7Var.a.setText(ym7Var.f);
                        zm7Var.d = i != an7Var.F - 1;
                        zm7Var.b.a(z3, z2);
                        zm7Var.c.a(z4, z2);
                        break;
                    }
                } else if (i2 == 1) {
                    ld5 ld5Var = (ld5) view;
                    if (i != 0) {
                        if (i == an7Var.y) {
                            ld5Var.setText(k96.M0(2131744048, null));
                            break;
                        }
                    } else {
                        ld5Var.setText(k96.M0(2131743970, null));
                        break;
                    }
                } else if (i2 == 2) {
                    m13 m13Var = (m13) view;
                    Drawable drawable = m13Var.getContext().getResources().getDrawable(R.drawable.poll_add_circle);
                    Drawable drawable2 = m13Var.getContext().getResources().getDrawable(R.drawable.poll_add_plus);
                    int i5 = bkb.M6;
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    zkb.x(m13Var, drawable, i5, wjbVar, mode);
                    zkb.x(m13Var, drawable2, bkb.j7, wjbVar, mode);
                    fm2 fm2Var = new fm2(drawable, drawable2);
                    m13Var.a.l(k96.M0(2131743564, null), false);
                    m13Var.b.setImageDrawable(fm2Var);
                    m13Var.c = false;
                    break;
                }
                break;
            case 6:
                View view2 = s49Var.a;
                xh8 xh8Var = (xh8) this.d;
                int i6 = xh8Var.e2;
                if (i >= i6 && i < xh8Var.f2) {
                    ((kh8) view2).a((fi8) xh8Var.S1.get(i - i6), i != xh8Var.f2 - 1);
                    break;
                } else if (i >= xh8Var.c2 && i < xh8Var.d2) {
                    xh8Var.b1(view2);
                    break;
                }
                break;
            case 7:
                int i7 = s49Var.f;
                if (i7 != 0) {
                    View view3 = s49Var.a;
                    if (i7 != 1) {
                        if (i7 != 2) {
                            ((mhb) view3).setText(i == 5 ? k96.M0(2131745794, null) : k96.M0(2131745797, null));
                            break;
                        } else {
                            uib uibVar = (uib) view3;
                            if (i != 1) {
                                if (i != 2) {
                                    if (i != 3) {
                                        uibVar.c(k96.M0(2131745804, null), vl9.a0(wcd.g.a()), false, false);
                                        break;
                                    } else {
                                        uibVar.c(k96.M0(2131745796, null), de9.l(new StringBuilder(), ((pl9) wcd.f.a()).a, " FPS"), false, true);
                                        break;
                                    }
                                } else {
                                    String M0 = k96.M0(2131745803, null);
                                    ol9 ol9Var = (ol9) wcd.e.a();
                                    uibVar.c(M0, ol9Var == ol9.a ? k96.M0(2131745802, null) : ol9Var == ol9.b ? k96.M0(2131745800, null) : k96.M0(2131745801, null), false, true);
                                    break;
                                }
                            } else {
                                uibVar.c(k96.M0(2131745793, null), de9.l(new StringBuilder(), ((sl9) wcd.d.a()).a, "p"), false, true);
                                break;
                            }
                        }
                    } else {
                        String M02 = k96.M0(2131745798, null);
                        im0 im0Var = wcd.h;
                        im0Var.a();
                        ((ahb) view3).f(M02, im0Var.d, false);
                        break;
                    }
                } else {
                    ((ld5) s49Var.a).setText(i == 0 ? k96.M0(2131745795, null) : k96.M0(2131745799, null));
                    break;
                }
            case 8:
                hs9 hs9Var = (hs9) this.d;
                se4 se4Var = hs9Var.K;
                int i8 = s49Var.f;
                View view4 = s49Var.a;
                if (i8 != 0) {
                    k27 E = E(i);
                    if (E != null) {
                        boolean z5 = hs9Var.J.t() && i >= hs9Var.w && i < hs9Var.x;
                        if (i8 != 1) {
                            if (i8 == 2) {
                                eba ebaVar = (eba) view4;
                                int e1 = ebaVar.getMessage() == null ? 0 : ebaVar.getMessage().e1();
                                ebaVar.f(E, true);
                                int e12 = ebaVar.getMessage().e1();
                                se4Var.a = k27.B0(ebaVar.getMessage().k);
                                se4Var.b = e12;
                                ebaVar.e(hs9Var.J.b(se4Var), e1 == E.e1());
                                z = e1 == E.e1();
                                if (ebaVar.e0 != z5) {
                                    ebaVar.e0 = z5;
                                    if (!z) {
                                        ebaVar.f0 = z5 ? 1.0f : 0.0f;
                                    }
                                    ebaVar.invalidate();
                                    break;
                                }
                            }
                        } else {
                            es9 es9Var = (es9) view4;
                            zkb.h(bkb.c6, null, es9Var);
                            iba ibaVar = es9Var.a;
                            int e13 = ibaVar.getMessage() == null ? 0 : ibaVar.getMessage().e1();
                            ibaVar.c(E, true);
                            int e14 = ibaVar.getMessage().e1();
                            se4Var.a = k27.B0(ibaVar.getMessage().k);
                            se4Var.b = e14;
                            ibaVar.b(hs9Var.J.b(se4Var), e13 == E.e1());
                            z = e13 == E.e1();
                            if (ibaVar.P != z5) {
                                ibaVar.P = z5;
                                if (!z) {
                                    ibaVar.Q = z5 ? 1.0f : 0.0f;
                                }
                                ibaVar.invalidate();
                                break;
                            }
                        }
                    }
                } else {
                    l35 l35Var = (l35) view4;
                    if (i != hs9Var.s) {
                        if (i == hs9Var.y) {
                            l35Var.b(k96.M0(2131746169, null), k96.M0(2131745303, null), new ik8(this, (byte) 15));
                            break;
                        }
                    } else {
                        String M03 = k96.M0(2131751332, null);
                        boolean equals = l35Var.getText().equals(M03);
                        boolean z6 = hs9Var.I;
                        if (!equals) {
                            l35Var.b(M03, z6 ? k96.M0(2131747240, null) : k96.M0(2131745860, null), new gs9(this));
                            break;
                        } else {
                            String M04 = z6 ? k96.M0(2131747240, null) : k96.M0(2131745860, null);
                            boolean z7 = hs9Var.I;
                            ri riVar = l35Var.b;
                            riVar.c(M04, true, z7);
                            riVar.setVisibility(0);
                            break;
                        }
                    }
                }
                break;
            case 9:
                View view5 = s49Var.a;
                vs9 vs9Var = (vs9) this.d;
                ArrayList arrayList2 = vs9Var.r;
                if (i >= 0 && i < arrayList2.size()) {
                    ss9 ss9Var = (ss9) arrayList2.get(i);
                    us9 us9Var = (us9) view5;
                    h19 h19Var = us9Var.d;
                    boolean z8 = h19Var == null || !h19Var.equals(ss9Var.a);
                    if (z8) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = ss9Var.a.g();
                        tL_reactionCount.count = ss9Var.b;
                        vs9 vs9Var2 = us9Var.s;
                        ts9 ts9Var2 = new ts9(us9Var, vs9Var2.a, us9Var, tL_reactionCount, vs9Var2.c);
                        us9Var.a = ts9Var2;
                        ts9Var2.E.d(gl.L(29.0f), gl.L(100.0f));
                        ts9Var = us9Var.a;
                        ts9Var.p = true;
                        ts9Var.R = true;
                    } else {
                        ts9Var = us9Var.a;
                        ts9Var.v = ss9Var.b;
                    }
                    us9Var.d = ss9Var.a;
                    if (!z8) {
                        ts9Var.e = ts9Var.z;
                    }
                    ts9Var.z = gl.L(44.33f);
                    us9Var.a.t = !TextUtils.isEmpty(ss9Var.c);
                    ts9 ts9Var3 = us9Var.a;
                    boolean z9 = ts9Var3.t;
                    gn gnVar = ts9Var3.F;
                    if (z9) {
                        gnVar.t(vu3.m(ss9Var.c, gnVar.a.getFontMetricsInt(), false, null, 0), !z8, true);
                    } else if (gnVar != null) {
                        gnVar.t("", !z8, true);
                    }
                    us9Var.a.getClass();
                    us9Var.a.E.c(ss9Var.b, !z8);
                    ts9 ts9Var4 = us9Var.a;
                    if (ts9Var4.E != null && (ts9Var4.v > 0 || ts9Var4.t)) {
                        float f = ts9Var4.z;
                        float L = gl.L(us9Var.a.t ? 4.0f : 0.0f) + ((int) Math.ceil(r6.m));
                        ts9 ts9Var5 = us9Var.a;
                        ts9Var4.z = (int) (L + ts9Var5.F.d + f);
                        ts9Var4 = ts9Var5;
                    }
                    if (z8) {
                        ts9Var4.e = ts9Var4.z;
                    }
                    ts9Var4.A = gl.L(28.0f);
                    ts9 ts9Var6 = us9Var.a;
                    ts9Var6.o = us9Var.e;
                    if (us9Var.r) {
                        ts9Var6.a();
                    }
                    if (!z8) {
                        us9Var.requestLayout();
                    }
                    ((us9) view5).a(ss9Var.a.h == vs9Var.h, false);
                    break;
                }
                break;
            case 10:
                int[] iArr = ((vqa) this.d).N2;
                int length = (iArr.length - 1) - i;
                hx0 hx0Var = (hx0) s49Var.a;
                int i9 = iArr[length];
                if (hx0Var.a != i9) {
                    hx0Var.a = i9;
                    hx0Var.requestLayout();
                    break;
                }
                break;
            case 11:
                jwb jwbVar = (jwb) s49Var.a;
                iwb iwbVar = (iwb) ((lwb) this.d).U.get(i);
                lwb lwbVar = jwbVar.s;
                be0 be0Var = jwbVar.a;
                iwb iwbVar2 = jwbVar.e;
                z = iwbVar2 != null && iwbVar2.a == iwbVar.a && Objects.equals(iwbVar2.b, iwbVar.b);
                if (lwbVar.a0 >= 1.0f && lwbVar.k0 == null) {
                    jwbVar.setScaleX(1.0f);
                    jwbVar.setScaleY(1.0f);
                    jwbVar.setAlpha(1.0f);
                }
                jwbVar.e = iwbVar;
                if (!z) {
                    be0Var.setAnimatedEmojiDrawable(null);
                    jwbVar.h = null;
                    jwbVar.n = 0;
                    if (iwbVar.a != 0) {
                        jwbVar.f = null;
                        be0Var.setVisibility(0);
                        vl vlVar = new vl(3, lwbVar.a, iwbVar.a);
                        jwbVar.h = vlVar;
                        be0Var.setAnimatedEmojiDrawable(vlVar);
                    } else {
                        jwbVar.f = k96.M0(iwbVar.b.booleanValue() ? 2131743752 : 2131743751, null);
                        be0Var.setVisibility(8);
                    }
                    jwbVar.setContentDescription(jwbVar.f);
                }
                jwbVar.a(z);
                jwbVar.requestLayout();
                jwbVar.invalidate();
                break;
            default:
                ((jrc) s49Var.a).a = WallpapersListActivity.j0[i];
                break;
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
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
                return new y29(((ix0) obj).S1);
            case 1:
                je3 je3Var = (je3) obj;
                if (i == 0) {
                    view = je3Var.Y1;
                } else if (i == 2) {
                    View view5 = je3Var.Z1;
                    e49 e49Var = new e49(-1, -2);
                    int i2 = je3Var.u0;
                    ((ViewGroup.MarginLayoutParams) e49Var).leftMargin = i2;
                    ((ViewGroup.MarginLayoutParams) e49Var).rightMargin = i2;
                    view5.setLayoutParams(e49Var);
                    view = view5;
                } else {
                    mhb mhbVar = new mhb(viewGroup.getContext());
                    mhbVar.setFixedSize(12);
                    int i3 = bkb.Z6;
                    ColorDrawable colorDrawable = new ColorDrawable(bkb.w0(null, i3, false));
                    zkb.x(mhbVar, colorDrawable, i3, null, PorterDuff.Mode.SRC_IN);
                    fm2 fm2Var = new fm2(colorDrawable, bkb.W0(viewGroup.getContext(), R.drawable.greydivider_bottom, bkb.a7));
                    fm2Var.x = true;
                    mhbVar.setBackgroundDrawable(fm2Var);
                    view = mhbVar;
                }
                return new y29(view);
            case 2:
                r84 r84Var = (r84) obj;
                wjb wjbVar = r84Var.a;
                if (i == 0) {
                    view2 = new o84(r84Var, r84Var.getContext());
                } else if (i == 2) {
                    view2 = new wh4(r84Var.getContext(), 16, (byte) 0);
                } else {
                    Context context = r84Var.getContext();
                    q84 q84Var = new q84(context);
                    ImageView imageView = new ImageView(context);
                    q84Var.c = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    q84Var.addView(imageView, nme.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
                    TextView textView = new TextView(context);
                    q84Var.a = textView;
                    textView.setTypeface(gl.o());
                    zkb.X(textView, bkb.F6, wjbVar);
                    textView.setTextSize(1, 14.0f);
                    q84Var.addView(textView, nme.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    q84Var.b = textView2;
                    zkb.X(textView2, bkb.x6, wjbVar);
                    textView2.setTextSize(1, 14.0f);
                    q84Var.addView(textView2, nme.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
                    view2 = q84Var;
                }
                return ls6.h(view2, view2, -1, -2);
            case 3:
                qf4 qf4Var = new qf4(viewGroup.getContext(), ((tf4) obj).o2);
                sf4 sf4Var = new sf4(qf4Var);
                sf4Var.v = qf4Var;
                qf4Var.setLayoutParams(new e49(-2, gl.L(30.0f)));
                return sf4Var;
            case 4:
                s37 s37Var = new s37(viewGroup.getContext());
                s37Var.setLayoutParams(new e49(-1, gl.L(50.0f)));
                return new y29(s37Var);
            case 5:
                wjb wjbVar2 = ((an7) obj).f;
                Context context2 = viewGroup.getContext();
                if (i == 0) {
                    zm7 zm7Var = new zm7(context2);
                    RadioButton radioButton = new RadioButton(context2);
                    zm7Var.b = radioButton;
                    radioButton.setSize(gl.L(20.0f));
                    zkb.O(radioButton, bkb.f7, bkb.g7, wjbVar2);
                    boolean z = k96.a0;
                    zm7Var.addView(radioButton, nme.d(22, 22.0f, (z ? 5 : 3) | 16, z ? 0 : 20, 0.0f, z ? (byte) 20 : (byte) 0, 0.0f));
                    wf2 wf2Var = new wf2(24, wjbVar2, context2);
                    zm7Var.c = wf2Var;
                    int i4 = bkb.c6;
                    wf2Var.b(-1, i4, bkb.j7);
                    wf2Var.setDrawUnchecked(false);
                    wf2Var.setDrawBackgroundAsArc(3);
                    boolean z2 = k96.a0;
                    zm7Var.addView(wf2Var, nme.d(26, 26.0f, (z2 ? 5 : 3) | 16, z2 ? 0 : 18, 0.0f, z2 ? 18 : 0, 0.0f));
                    wf2Var.a(true, false);
                    TextView textView3 = new TextView(context2);
                    zm7Var.a = textView3;
                    zkb.X(textView3, bkb.F6, wjbVar2);
                    ug8.w(textView3, 1, 16.0f, 1, 1);
                    textView3.setSingleLine(true);
                    textView3.setEllipsize(TextUtils.TruncateAt.END);
                    textView3.setGravity((k96.a0 ? 5 : 3) | 16);
                    boolean z3 = k96.a0;
                    zm7Var.addView(textView3, nme.d(-2, -2.0f, (z3 ? (byte) 5 : (byte) 3) | 16, z3 ? 23 : 61, 0.0f, z3 ? 61 : 23, 0.0f));
                    zkb.h(i4, wjbVar2, zm7Var);
                    view3 = zm7Var;
                } else if (i == 2) {
                    m13 m13Var = new m13(70, wjbVar2, context2);
                    m13Var.d = (byte) 61;
                    zkb.h(bkb.c6, wjbVar2, m13Var);
                    view3 = m13Var;
                } else if (i != 3) {
                    ld5 ld5Var = new ld5(context2, wjbVar2);
                    zkb.h(bkb.c6, wjbVar2, ld5Var);
                    view3 = ld5Var;
                } else {
                    view3 = new b9a(context2, (de9) null);
                }
                return ls6.h(view3, view3, -1, -2);
            case 6:
                Context context3 = viewGroup.getContext();
                xh8 xh8Var = (xh8) obj;
                View c1 = xh8Var.c1(context3, i);
                if (c1 != null) {
                    return ls6.h(c1, c1, -1, -2);
                }
                if (i == 0) {
                    pkb pkbVar = new pkb((byte) 10, context3, this);
                    xh8Var.n2 = pkbVar;
                    pkbVar.setOrientation(1);
                    View view6 = xh8Var.w2;
                    if (view6 == null) {
                        xh8Var.m2 = new n84(context3, b3, b4, r9);
                        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        int i5 = bkb.Ck;
                        canvas.drawColor(bm2.f(0.5f, bkb.v0(i5, xh8Var.J0), bkb.v0(bkb.g5, xh8Var.J0)));
                        xh8Var.m2.setBackgroundBitmap(createBitmap);
                        uq4 uq4Var = xh8Var.m2.b;
                        uq4Var.z = i5;
                        uq4Var.A = bkb.Bk;
                        uq4Var.b();
                        pkbVar.addView(xh8Var.m2, nme.r(kk7.p2, kk7.p2, 1));
                    } else {
                        if (view6.getParent() != null) {
                            ((ViewGroup) xh8Var.w2.getParent()).removeView(xh8Var.w2);
                        }
                        xh8Var.Z0(pkbVar);
                    }
                    if (xh8Var.I2 == null) {
                        FrameLayout frameLayout3 = new FrameLayout(context3);
                        xh8Var.I2 = frameLayout3;
                        frameLayout3.setClipChildren(false);
                        Integer num = xh8Var.p2;
                        new PorterDuffColorFilter(num == null ? bkb.v0(bkb.u6, xh8Var.J0) : num.intValue(), PorterDuff.Mode.SRC_IN);
                        xh8Var.J2 = new l46[2];
                        int i6 = 0;
                        while (i6 < 2) {
                            xh8Var.J2[i6] = new s11(context3, xh8Var.J0, (byte) 5);
                            xh8Var.J2[i6].setVisibility(i6 == 0 ? 0 : 8);
                            xh8Var.J2[i6].setTextSize(1, 16.0f);
                            xh8Var.J2[i6].setTypeface(gl.o());
                            xh8Var.J2[i6].setGravity(1);
                            zkb.X(xh8Var.J2[i6], bkb.F6, xh8Var.J0);
                            zkb.G(xh8Var.J2[i6], bkb.I6, xh8Var.J0);
                            xh8Var.I2.addView(xh8Var.J2[i6], nme.c(-2.0f, -1));
                            i6++;
                        }
                    }
                    if (xh8Var.I2.getParent() != null) {
                        ((ViewGroup) xh8Var.I2.getParent()).removeView(xh8Var.I2);
                    }
                    pkbVar.addView(xh8Var.I2, nme.q(-2, -2, 0.0f, 1, 40, 0, 40, 0));
                    if (xh8Var.K2 == null) {
                        l46 l46Var = new l46(xh8Var.getContext(), xh8Var.J0);
                        xh8Var.K2 = l46Var;
                        l46Var.setTextSize(1, 14.0f);
                        xh8Var.K2.setGravity(1);
                        zkb.X(xh8Var.K2, bkb.F6, xh8Var.J0);
                        zkb.G(xh8Var.K2, bkb.I6, xh8Var.J0);
                    }
                    if (xh8Var.K2.getParent() != null) {
                        ((ViewGroup) xh8Var.K2.getParent()).removeView(xh8Var.K2);
                    }
                    pkbVar.addView(xh8Var.K2, nme.q(-1, -2, 0.0f, 0, 24, 9, 24, 20));
                    xh8Var.e1(false);
                    xh8Var.l2 = new ub(context3, b2);
                    oc6 oc6Var = new oc6((byte) 12, context3, this);
                    oc6Var.setClipChildren(false);
                    oc6Var.addView(xh8Var.l2);
                    oc6Var.addView(pkbVar);
                    n84 n84Var = xh8Var.m2;
                    view4 = oc6Var;
                    if (n84Var != null) {
                        n84Var.setStarParticlesView(xh8Var.l2);
                        view4 = oc6Var;
                    }
                } else if (i == 2) {
                    int i7 = bkb.Z6;
                    b9a b9aVar = new b9a(context3, bkb.v0(i7, xh8Var.J0), 0);
                    zkb.h(i7, xh8Var.J0, b9aVar);
                    view4 = b9aVar;
                } else if (i == 3) {
                    view4 = new d62(context3, r7);
                } else if (i == 4) {
                    view4 = new t1(context3, (byte) 0);
                } else if (i != 5) {
                    view4 = new wh8(this, context3, xh8Var.J0);
                } else {
                    lhb lhbVar = new lhb(context3, xh8Var.J0);
                    lhbVar.setBackground(true);
                    String M0 = k96.M0(2131749490, "GiftPremiumPrivacyPolicyAndTerms");
                    int i8 = bkb.Wc;
                    lhbVar.setText(gl.G2(gl.N2(M0, i8, 0, new Runnable(this) { // from class: vh8
                        public final /* synthetic */ gx0 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b5 = b4;
                            gx0 gx0Var = this.b;
                            switch (b5) {
                                case 0:
                                    d01.t(((xh8) gx0Var.d).o2.getParentActivity(), k96.M0(2131743955, null));
                                    break;
                                default:
                                    d01.t(((xh8) gx0Var.d).o2.getParentActivity(), k96.M0(2131746590, null));
                                    break;
                            }
                        }
                    }, null), gl.N2(k96.M0(2131749491, "GiftPremiumPrivacyPolicy"), i8, 0, new Runnable(this) { // from class: vh8
                        public final /* synthetic */ gx0 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b5 = b3;
                            gx0 gx0Var = this.b;
                            switch (b5) {
                                case 0:
                                    d01.t(((xh8) gx0Var.d).o2.getParentActivity(), k96.M0(2131743955, null));
                                    break;
                                default:
                                    d01.t(((xh8) gx0Var.d).o2.getParentActivity(), k96.M0(2131746590, null));
                                    break;
                            }
                        }
                    }, null), "%1$s"));
                    view4 = lhbVar;
                }
                view4.setLayoutParams(new e49(-1, -2));
                xh8Var.Y0(i, view4);
                return new y29(view4);
            case 7:
                Context context4 = (Context) obj;
                if (i == 0) {
                    frameLayout = new ld5(context4);
                } else if (i == 1) {
                    frameLayout = new ahb(context4);
                } else if (i == 2) {
                    uib uibVar = new uib(context4);
                    uibVar.setCanDisable(true);
                    frameLayout = uibVar;
                } else {
                    frameLayout = new mhb(context4);
                }
                frameLayout.setLayoutParams(new e49(-1, -2));
                return new y29(frameLayout);
            case 8:
                if (i == 0) {
                    frameLayout2 = new l35(viewGroup.getContext(), null);
                } else if (i == 1) {
                    Context context5 = viewGroup.getContext();
                    es9 es9Var = new es9(context5);
                    iba ibaVar = new iba(2, null, context5);
                    es9Var.a = ibaVar;
                    ibaVar.r.setVisibility(8);
                    es9Var.addView(ibaVar);
                    frameLayout2 = es9Var;
                } else {
                    frameLayout2 = new fs9(viewGroup.getContext());
                }
                frameLayout2.setLayoutParams(new e49(-1, -2));
                return new y29(frameLayout2);
            case 9:
                vs9 vs9Var = (vs9) obj;
                return new y29(new us9(vs9Var, vs9Var.getContext()));
            case 10:
                hx0 hx0Var = new hx0(((vqa) obj).getContext());
                hx0Var.a = 0;
                return new y29(hx0Var);
            case 11:
                jwb jwbVar = new jwb((lwb) obj, viewGroup.getContext());
                jwbVar.setLayoutParams(new e49(-2, -1));
                return new y29(jwbVar);
            default:
                orc orcVar = (orc) obj;
                return new y29(new jrc(orcVar.F, orcVar.c));
        }
    }

    @Override // w39
    public final void y(s49 s49Var) {
        switch (this.c) {
            case 9:
                vs9 vs9Var = (vs9) this.d;
                ArrayList arrayList = vs9Var.r;
                int b = s49Var.b();
                if (b >= 0 && b < arrayList.size()) {
                    ((us9) s49Var.a).a(((ss9) arrayList.get(b)).a.h == vs9Var.h, false);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ gx0(Object obj, byte b) {
        this.c = b;
        this.d = obj;
    }

    private final void F(s49 s49Var, int i) {
    }

    private final void G(s49 s49Var, int i) {
    }
}
