// default package

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class l7c extends ka {
    public mg0 F;
    public i7c J;
    public i7c K;
    public int L;
    public boolean M;
    public jac N;
    public boolean O;
    public final r59 d;
    public final Context e;
    public final int f;
    public final int h;
    public final boolean n;
    public boolean s;
    public jac w;
    public final ylb x;
    public boolean r = true;
    public final ArrayList y = new ArrayList();
    public final ArrayList E = new ArrayList();
    public boolean G = false;
    public final ArrayList H = new ArrayList();
    public final ArrayList I = new ArrayList();
    public final fe P = new fe(this, 5);

    public l7c(r59 r59Var, Context context, int i, int i2, boolean z, jac jacVar, ylb ylbVar) {
        this.d = r59Var;
        this.e = context;
        this.f = i;
        this.h = i2;
        this.n = z;
        this.w = jacVar;
        this.x = ylbVar;
        O(false);
    }

    public static boolean K(int i) {
        if (i < 10000) {
            return i == 7 || i == 8 || i == 38 || i == 31 || i == -4 || i == 28 || i == 2 || i == -2;
        }
        b6c G = c6c.G(i);
        return G != null && G.g();
    }

    @Override // q59
    public boolean D(u69 u69Var) {
        int i = u69Var.f;
        c6c G = G(u69Var.b());
        if (i >= 10000) {
            b6c G2 = c6c.G(i);
            if (G2 == null || !G2.f()) {
                return false;
            }
        } else if (i != 3 && i != 5 && i != 6 && i != 30 && i != 4 && i != 10 && i != 44 && i != 11 && i != 12 && i != 17 && i != 16 && i != 29 && i != 25 && i != 27 && i != 32 && i != 33 && i != 35 && i != 36 && i != 37 && i != 41 && i != 39 && i != 40 && i != 38) {
            return false;
        }
        return G == null || G.g;
    }

    public final void F(int i) {
        if (i >= 0) {
            ArrayList arrayList = this.I;
            if (i < arrayList.size()) {
                i7c i7cVar = (i7c) arrayList.get(i);
                this.N.a(Integer.valueOf(i), new ArrayList(this.E.subList(i7cVar.a, i7cVar.b + 1)));
                this.M = false;
            }
        }
    }

    public final c6c G(int i) {
        if (i < 0) {
            return null;
        }
        ArrayList arrayList = this.E;
        if (i < arrayList.size()) {
            return (c6c) arrayList.get(i);
        }
        return null;
    }

    public final int H(int i) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.I;
            if (i2 >= arrayList.size()) {
                return -1;
            }
            i7c i7cVar = (i7c) arrayList.get(i2);
            if (i >= i7cVar.a && i <= i7cVar.b) {
                return i2;
            }
            i2++;
        }
    }

    public int I(int i) {
        return cmb.v0(i, this.x);
    }

    public final boolean J(int i) {
        c6c G = G(i);
        c6c G2 = G(i + 1);
        return (G == null || G.j || G2 == null || K(G2.a) != K(G.a)) ? false : true;
    }

    public final void L() {
        i7c i7cVar = this.K;
        if (i7cVar != null) {
            i7cVar.b = Math.max(0, this.E.size() - 1);
        }
    }

    public final int M() {
        i7c i7cVar = new i7c();
        this.K = i7cVar;
        i7cVar.a = this.E.size();
        i7c i7cVar2 = this.K;
        i7cVar2.b = -1;
        this.I.add(i7cVar2);
        return r2.size() - 1;
    }

    public final boolean N(int i) {
        if (!this.r) {
            return false;
        }
        r59 r59Var = this.d;
        if (r59Var != null && r59Var.c1() && r59Var.getSectionsDrawBackground()) {
            return false;
        }
        if (i >= 10000) {
            return true;
        }
        switch (i) {
            case -5:
            case -3:
            case 0:
            case 1:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 27:
            case 28:
            case 29:
            case nm7.S /* 30 */:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
                return true;
            case -4:
            case -2:
            case -1:
            case 2:
            case 7:
            case 8:
            case 26:
            case 31:
            case 38:
            default:
                return false;
        }
    }

    public void O(boolean z) {
        r59 r59Var = this.d;
        if (r59Var == null || !r59Var.d0()) {
            Q(z);
        } else {
            r59Var.post(new n28((byte) 24, (Object) this, z));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void P(u69 u69Var) {
        View view = u69Var.a;
        if (view instanceof vlb) {
            ((vlb) view).updateColors();
            Object tag = view.getTag(R.id.theme_generation);
            int i = anb.b;
            if (N(u69Var.f) && (!(tag instanceof Integer) || ((Integer) tag).intValue() != i)) {
                view.setBackgroundColor(I(this.n ? cmb.g5 : cmb.c6));
            }
            view.setTag(R.id.theme_generation, Integer.valueOf(i));
        }
    }

    public final void Q(boolean z) {
        r59 r59Var = this.d;
        if (r59Var == null || !r59Var.d0()) {
            ArrayList arrayList = this.y;
            arrayList.clear();
            ArrayList arrayList2 = this.E;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            this.J = null;
            this.H.clear();
            this.I.clear();
            jac jacVar = this.w;
            if (jacVar != null) {
                jacVar.a(arrayList2, this);
                S();
                if (z) {
                    E(arrayList, arrayList2);
                } else {
                    f();
                }
            }
        }
    }

    public final void R(u69 u69Var, boolean z) {
        if (u69Var != null) {
            View view = u69Var.a;
            int i = u69Var.f;
            if (i < 10000) {
                if (i != 16) {
                    return;
                }
                ((kz8) view).setReorder(z);
            } else {
                b6c G = c6c.G(i);
                if (G != null) {
                    G.a(this.d, view, G(u69Var.b()));
                }
            }
        }
    }

    public final void S() {
        r59 r59Var = this.d;
        if (r59Var != null) {
            ArrayList arrayList = r59Var.L2;
            if (arrayList == null) {
                r59Var.L2 = new ArrayList();
            } else {
                arrayList.clear();
            }
            ArrayList arrayList2 = this.H;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                i7c i7cVar = (i7c) obj;
                r59Var.L2.add(Long.valueOf(gm.u2(i7cVar.a, i7cVar.b)));
            }
        }
    }

    public final void T() {
        ArrayList arrayList = this.y;
        arrayList.clear();
        ArrayList arrayList2 = this.E;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        this.H.clear();
        this.I.clear();
        jac jacVar = this.w;
        if (jacVar != null) {
            jacVar.a(arrayList2, this);
        }
        S();
    }

    public final void U() {
        i7c i7cVar = this.J;
        if (i7cVar != null) {
            i7cVar.b = Math.max(0, (this.E.size() + (this.G ? 1 : 0)) - 1);
            i7c i7cVar2 = this.J;
            if (i7cVar2.a == i7cVar2.b) {
                this.H.remove(i7cVar2);
            }
            this.J = null;
        }
    }

    public final void V() {
        i7c i7cVar = new i7c();
        this.J = i7cVar;
        i7cVar.a = this.E.size() + (this.G ? 1 : 0);
        i7c i7cVar2 = this.J;
        i7cVar2.b = -1;
        this.H.add(i7cVar2);
    }

    @Override // y59
    public final int b() {
        return this.E.size();
    }

    @Override // y59
    public final int d(int i) {
        c6c G = G(i);
        if (G == null) {
            return 0;
        }
        return G.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x022f  */
    @Override // y59
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void t(u69 u69Var, int i) {
        String str;
        njb njbVar;
        ImageReceiver imageReceiver;
        long j;
        gn5 gn5Var;
        String str2;
        c6c c6cVar;
        long j2;
        boolean z;
        char c;
        long j3;
        CharSequence concat;
        int i2;
        int i3 = this.f;
        r59 r59Var = this.d;
        ylb ylbVar = this.x;
        c6c G = G(i);
        c6c G2 = G(i + 1);
        c6c G3 = G(i - 1);
        if (G != null) {
            int i4 = u69Var.f;
            View view = u69Var.a;
            boolean J = J(i);
            P(u69Var);
            if (i4 < 10000) {
                long j4 = 0;
                byte b = 2;
                str = "";
                switch (i4) {
                    case -5:
                        z69 z69Var = (z69) view;
                        if (z69Var.getChildCount() != (G.c == null ? 0 : 1) || z69Var.getChildAt(0) != G.c) {
                            z69Var.removeAllViews();
                            View view2 = G.c;
                            if (view2 != null) {
                                gm.B2(view2);
                                z69Var.addView(G.c, qoe.c(-1.0f, -1));
                                break;
                            }
                        }
                        break;
                    case -4:
                    case -2:
                    case -1:
                        FrameLayout frameLayout = (FrameLayout) view;
                        frameLayout.setClipChildren(!G.e);
                        frameLayout.setClipToPadding(!G.e);
                        if (frameLayout.getChildCount() != (G.c == null ? 0 : 1) || frameLayout.getChildAt(0) != G.c) {
                            frameLayout.removeAllViews();
                            View view3 = G.c;
                            if (view3 != null) {
                                gm.B2(view3);
                                frameLayout.addView(G.c, (i4 == -1 || i4 == -4) ? qoe.c(G.A, -1) : qoe.c(-2.0f, -2));
                                break;
                            }
                        }
                        break;
                    case -3:
                        h7c h7cVar = (h7c) view;
                        h7cVar.setMinusHeight(G.A);
                        h7cVar.setMinusPadding(iqd.a(G.z, 1));
                        if (h7cVar.getChildCount() != (G.c == null ? 0 : 1) || h7cVar.getChildAt(0) != G.c) {
                            h7cVar.removeAllViews();
                            View view4 = G.c;
                            if (view4 != null) {
                                gm.B2(view4);
                                h7cVar.addView(G.c, qoe.c(-1.0f, -1));
                                break;
                            }
                        }
                        break;
                    case 0:
                    case 1:
                    case 26:
                        jf5 jf5Var = (jf5) view;
                        jf5Var.setText(G.m);
                        jf5Var.b(G.g);
                        break;
                    case 2:
                        pvb pvbVar = (pvb) view;
                        int i5 = G.k;
                        if (i5 == 0) {
                            int i6 = G.A;
                            if (i6 != 0) {
                                pvbVar.setEmojiSize(i6);
                            }
                            String charSequence = G.n.toString();
                            String charSequence2 = G.o.toString();
                            pvbVar.getClass();
                            hs6.d0(z8c.t0).e2(pvbVar.b, charSequence, charSequence2, "90_90");
                        } else if (G.r) {
                            pvbVar.setEmojiStatic(i5);
                        } else {
                            pvbVar.setEmoji(i5);
                        }
                        boolean isEmpty = TextUtils.isEmpty(G.p);
                        CharSequence charSequence3 = G.m;
                        if (!isEmpty) {
                            pvbVar.a(charSequence3, G.p);
                            break;
                        } else {
                            pvbVar.setText(charSequence3);
                            break;
                        }
                    case 3:
                        xib xibVar = (xib) view;
                        Object obj = G.H;
                        if (obj instanceof TLRPC.Document) {
                            CharSequence charSequence4 = G.m;
                            TLRPC.Document document = (TLRPC.Document) obj;
                            xibVar.x = xibVar.getDefaultImageLeft();
                            xibVar.s = xibVar.c(false);
                            lka lkaVar = xibVar.a;
                            lkaVar.l(charSequence4, false);
                            lkaVar.i(null);
                            io ioVar = xibVar.c;
                            xibVar.R = null;
                            ioVar.c(null, false, true);
                            xibVar.h.setVisibility(8);
                            ioVar.setVisibility(8);
                            xibVar.d.setVisibility(8);
                            s09 s09Var = xibVar.e;
                            s09Var.setVisibility(8);
                            s09Var.setPadding(0, gm.L(7.0f), 0, 0);
                            xibVar.r = J;
                            xibVar.setWillNotDraw(!J);
                            Switch r0 = xibVar.f;
                            if (r0 != null) {
                                r0.setVisibility(8);
                            }
                            xibVar.setValueSticker(document);
                        } else if (obj instanceof String) {
                            CharSequence charSequence5 = G.m;
                            String str3 = (String) obj;
                            xibVar.x = xibVar.getDefaultImageLeft();
                            xibVar.s = xibVar.c(false);
                            lka lkaVar2 = xibVar.a;
                            lkaVar2.l(charSequence5, false);
                            lkaVar2.i(null);
                            io ioVar2 = xibVar.c;
                            xibVar.R = null;
                            ioVar2.c(null, false, true);
                            xibVar.h.setVisibility(8);
                            ioVar2.setVisibility(8);
                            xibVar.d.setVisibility(8);
                            s09 s09Var2 = xibVar.e;
                            s09Var2.setVisibility(8);
                            s09Var2.setPadding(0, gm.L(7.0f), 0, 0);
                            xibVar.r = J;
                            xibVar.setWillNotDraw(!J);
                            Switch r02 = xibVar.f;
                            if (r02 != null) {
                                r02.setVisibility(8);
                            }
                            xibVar.setValueSticker(str3);
                        } else {
                            boolean isEmpty2 = TextUtils.isEmpty(G.o);
                            Object obj2 = G.H;
                            if (isEmpty2) {
                                if (obj2 instanceof Drawable) {
                                    xibVar.p(G.m, (Drawable) obj2, J);
                                } else {
                                    int i7 = G.k;
                                    CharSequence charSequence6 = G.m;
                                    if (i7 == 0) {
                                        xibVar.k(charSequence6, J);
                                    } else {
                                        xibVar.o(i7, charSequence6, J);
                                    }
                                }
                            } else if (obj2 instanceof Drawable) {
                                xibVar.t(G.m, G.o, (Drawable) obj2, J);
                            } else {
                                int i8 = G.k;
                                CharSequence charSequence7 = G.m;
                                CharSequence charSequence8 = G.o;
                                if (i8 == 0) {
                                    xibVar.q(charSequence7, charSequence8, false, J);
                                } else {
                                    xibVar.u(charSequence7, charSequence8, false, i8, J);
                                }
                            }
                        }
                        if (G.r) {
                            int i9 = cmb.p6;
                            xibVar.g(i9, i9);
                        } else if (G.s) {
                            xibVar.g(cmb.p7, cmb.o7);
                        } else {
                            xibVar.g(cmb.l6, cmb.F6);
                        }
                        xibVar.h(45, G.u, true);
                        xibVar.i(G.g, true);
                        break;
                    case 4:
                    case 9:
                        bjb bjbVar = (bjb) view;
                        if (bjbVar.b == G.d) {
                            bjbVar.setChecked(G.e);
                        }
                        bjbVar.e(null, G.g);
                        bjbVar.f(G.m, G.e, J);
                        bjbVar.b = G.d;
                        if (i4 == 9) {
                            anb.h(G.e ? cmb.e6 : cmb.d6, null, view);
                            break;
                        }
                        break;
                    case 5:
                        yn7 yn7Var = (yn7) view;
                        CharSequence charSequence9 = G.n;
                        yn7Var.b(G.m, G.n, 0, G.e, 0, charSequence9 != null && charSequence9.toString().contains("\n"), J, false);
                        break;
                    case 6:
                        ((yn7) view).b(G.m, G.n, 0, G.e, 0, false, J, false);
                        break;
                    case 7:
                    case 8:
                    case 38:
                        if (i4 == 7 || i4 == 8) {
                            njb njbVar2 = (njb) view;
                            if (TextUtils.isEmpty(G.m)) {
                                njbVar2.setFixedSize(i4 == 8 ? nm7.w3 : 12);
                                njbVar2.setText("");
                            } else {
                                njbVar2.setFixedSize(0);
                                njbVar2.setText(G.m);
                            }
                            if (G.r) {
                                njbVar2.setTextGravity(17);
                                njbVar2.getTextView().setWidth(Math.min(hg5.a(njbVar2.getText(), njbVar2.getTextView().getPaint()), gm.q.x - gm.L(60.0f)));
                                njbVar2.getTextView().setPadding(0, gm.L(17.0f), 0, gm.L(17.0f));
                                njbVar = njbVar2;
                            } else {
                                njbVar2.setTextGravity(8388611);
                                njbVar2.getTextView().setMinWidth(0);
                                njbVar2.getTextView().setMaxWidth(gm.q.x);
                                njbVar2.getTextView().setPadding(0, gm.L(10.0f), 0, gm.L(17.0f));
                                njbVar = njbVar2;
                            }
                        } else if (i4 == 38) {
                            dm2 dm2Var = (dm2) view;
                            CharSequence charSequence10 = G.p;
                            boolean z2 = G.f;
                            dm2Var.a.setText(charSequence10);
                            View view5 = dm2Var.b;
                            view5.animate().cancel();
                            view5.animate().rotation(z2 ? 0.0f : 180.0f).setDuration(340L).setInterpolator(d53.h).start();
                            if (G.r) {
                                dm2Var.setColor(cmb.p6);
                                njbVar = dm2Var;
                            } else if (G.s) {
                                dm2Var.setColor(cmb.o7);
                                njbVar = dm2Var;
                            } else {
                                dm2Var.setColor(cmb.F6);
                                njbVar = dm2Var;
                            }
                        } else {
                            njbVar = null;
                        }
                        boolean z3 = (G3 == null || K(G3.a)) ? false : true;
                        boolean z4 = (G2 == null || K(G2.a)) ? false : true;
                        if (!r59Var.c1()) {
                            Drawable V0 = cmb.V0(this.e, z3 ? z4 ? R.drawable.greydivider : R.drawable.greydivider_bottom : z4 ? R.drawable.greydivider_top : R.drawable.field_carret_empty, cmb.v0(cmb.a7, ylbVar));
                            if (!this.n) {
                                njbVar.setBackground(V0);
                                break;
                            } else {
                                int i10 = cmb.h5;
                                njbVar.setBackground(new LayerDrawable(new Drawable[]{I(i10) == cmb.v0(i10, ylbVar) ? new k7c(i10, ylbVar) : new ColorDrawable(I(i10)), V0}));
                                break;
                            }
                        } else {
                            njbVar.setBackground(null);
                            break;
                        }
                        break;
                    case 10:
                        vg3 vg3Var = (vg3) view;
                        int i11 = vg3Var.a;
                        TextView textView = vg3Var.b;
                        TextView textView2 = vg3Var.c;
                        RadioButton radioButton = vg3Var.d;
                        if (i11 == G.d) {
                            radioButton.a(G.e, true);
                            vg3Var.a(G.g, true);
                        } else {
                            vg3Var.a(G.g, false);
                        }
                        boolean isEmpty3 = TextUtils.isEmpty(G.o);
                        CharSequence charSequence11 = G.m;
                        if (isEmpty3) {
                            boolean z5 = G.e;
                            textView2.setVisibility(8);
                            textView.setText(charSequence11);
                            radioButton.a(z5, false);
                            vg3Var.e = J;
                            vg3Var.b();
                            vg3Var.setWillNotDraw(!J);
                        } else {
                            CharSequence charSequence12 = G.o;
                            boolean z6 = G.e;
                            textView2.setVisibility(0);
                            textView2.setText(charSequence12);
                            textView.setText(charSequence11);
                            radioButton.a(z6, false);
                            vg3Var.e = J;
                            vg3Var.b();
                            vg3Var.setWillNotDraw(!J);
                        }
                        vg3Var.a = G.d;
                        break;
                    case 11:
                    case 12:
                        w8c w8cVar = (w8c) view;
                        w8cVar.g(i3, G, J);
                        if (i4 == 12) {
                            w8cVar.c(G.e, false);
                            break;
                        }
                        break;
                    case 13:
                        w8c w8cVar2 = (w8c) view;
                        w8cVar2.g(i3, G, J);
                        CharSequence charSequence13 = G.o;
                        w8cVar2.setQuery(charSequence13 == null ? null : charSequence13.toString().toLowerCase());
                        w8cVar2.setAddButtonVisible(!G.e);
                        w8cVar2.setCloseIcon(G.E);
                        break;
                    case 14:
                        hla hlaVar = (hla) view;
                        hlaVar.b(G.A, null, G.q);
                        hlaVar.setMinAllowedIndex((int) G.C);
                        hlaVar.setCallback(new wta(G, (byte) 25));
                        break;
                    case 15:
                        jla jlaVar = (jla) view;
                        jlaVar.d(G.A, (ila) G.H, G.D);
                        jlaVar.setMinValueAllowed((int) G.C);
                        break;
                    case 16:
                        kz8 kz8Var = (kz8) view;
                        kz8Var.d.a(G.e, false);
                        kz8Var.setReorder(this.O);
                        Object obj3 = G.H;
                        if (obj3 instanceof oz8) {
                            kz8Var.a((oz8) obj3, null, J);
                            break;
                        }
                        break;
                    case 17:
                        jz8 jz8Var = (jz8) view;
                        jz8Var.e.a(G.e, false);
                        Object obj4 = G.H;
                        if (obj4 instanceof oz8) {
                            oz8 oz8Var = (oz8) obj4;
                            pc0 pc0Var = jz8Var.a;
                            int[] iArr = jz8Var.r;
                            TextView textView3 = jz8Var.d;
                            ImageReceiver imageReceiver2 = jz8Var.b;
                            int i12 = z8c.t0;
                            jz8Var.c.setText(oc7.r1(i12).z1(z8c.h(i12).e(), false));
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            k47 k47Var = oz8Var.e;
                            if (k47Var != null) {
                                spannableStringBuilder.append(gw3.m(k47Var.v, textView3.getPaint().getFontMetricsInt(), false, null, 0));
                            }
                            if (oz8Var.a() > 1) {
                                spannableStringBuilder.append((CharSequence) "  ");
                                int L = gm.q.x - gm.L(80.0f);
                                int a = oz8Var.a() - 1;
                                int i13 = s0.d;
                                SpannableString spannableString = new SpannableString("+");
                                s0 s0Var = new s0(a);
                                iArr[0] = (int) (((uib) s0Var.c).c + gm.L(10.0f));
                                spannableString.setSpan(s0Var, 0, spannableString.length(), 33);
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(TextUtils.ellipsize(spannableStringBuilder, textView3.getPaint(), (L * 1.5f) - iArr[0], TextUtils.TruncateAt.END));
                                if (spannableStringBuilder2.length() > 0 && spannableStringBuilder2.charAt(spannableStringBuilder2.length() - 1) == 8230) {
                                    spannableStringBuilder2.append((CharSequence) "  ");
                                }
                                spannableStringBuilder2.append((CharSequence) spannableString);
                                spannableStringBuilder = spannableStringBuilder2;
                            }
                            textView3.setText(spannableStringBuilder);
                            TLRPC.MessageMedia m1 = k47.m1(oz8Var.e);
                            if (m1 != null) {
                                TLRPC.Photo photo = m1.photo;
                                if (photo != null) {
                                    TLRPC.PhotoSize w = bc4.w(photo.sizes, gm.L(36.0f), true, null, true);
                                    gn5 f = gn5.f(w, m1.photo);
                                    k47 k47Var2 = oz8Var.e;
                                    imageReceiver2.c0(f, "36_36", k47Var2.I1, w == null ? 0L : w.size, null, k47Var2, 0);
                                    imageReceiver2.q0(gm.L(6.0f));
                                } else {
                                    ImageReceiver imageReceiver3 = imageReceiver2;
                                    TLRPC.Document document2 = m1.document;
                                    imageReceiver = imageReceiver3;
                                    if (document2 != null) {
                                        TLRPC.PhotoSize w2 = bc4.w(document2.thumbs, gm.L(36.0f), true, null, true);
                                        TLRPC.Document document3 = m1.document;
                                        if (w2 == null) {
                                            gn5 b2 = gn5.b(document3);
                                            j = m1.document.size;
                                            str2 = "g";
                                            gn5Var = b2;
                                        } else {
                                            gn5 f2 = gn5.f(w2, document3);
                                            j = w2.size;
                                            gn5Var = f2;
                                            str2 = "36_36";
                                        }
                                        long j5 = j;
                                        k47 k47Var3 = oz8Var.e;
                                        imageReceiver3.c0(gn5Var, str2, k47Var3.I1, j5, null, k47Var3, 0);
                                        imageReceiver3.q0(gm.L(6.0f));
                                    }
                                }
                                jz8Var.s = J;
                                jz8Var.invalidate();
                                break;
                            } else {
                                imageReceiver = imageReceiver2;
                            }
                            pc0Var.q(z8c.h(i12).f());
                            imageReceiver.U(z8c.h(i12).f(), pc0Var, null);
                            imageReceiver.q0(gm.L(56.0f));
                            jz8Var.s = J;
                            jz8Var.invalidate();
                        }
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        vza vzaVar = (vza) view;
                        int i14 = G.A;
                        jza jzaVar = (jza) G.H;
                        sp1 sp1Var = new sp1(this, G, b);
                        vzaVar.y = i14;
                        vzaVar.E = sp1Var;
                        vzaVar.e(jzaVar, false);
                        break;
                    case 24:
                        ((gk1) view).set((fk1) G.H);
                        break;
                    case 25:
                        hk1 hk1Var = (hk1) view;
                        TL_stats.BroadcastRevenueTransaction broadcastRevenueTransaction = (TL_stats.BroadcastRevenueTransaction) G.H;
                        fn fnVar = hk1Var.b;
                        ylb ylbVar2 = hk1Var.a;
                        TextView textView4 = hk1Var.c;
                        TextView textView5 = hk1Var.d;
                        if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionWithdrawal) {
                            TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
                            textView4.setText(jb6.M0(2131748112, null));
                            if (tL_broadcastRevenueTransactionWithdrawal.pending) {
                                textView5.setText(jb6.M0(2131748115, null));
                                z = false;
                                c6cVar = G;
                            } else {
                                z = tL_broadcastRevenueTransactionWithdrawal.failed;
                                c6cVar = G;
                                textView5.setText(jb6.Q(tL_broadcastRevenueTransactionWithdrawal.date).concat(z ? " — ".concat(jb6.M0(2131748116, null)) : ""));
                            }
                            j2 = tL_broadcastRevenueTransactionWithdrawal.amount;
                            c = 65535;
                        } else {
                            c6cVar = G;
                            if (!(broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionProceeds)) {
                                if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionRefund) {
                                    textView4.setText(jb6.M0(2131748113, null));
                                    textView5.setText(jb6.Q(r4.from_date));
                                    j2 = ((TL_stats.TL_broadcastRevenueTransactionRefund) broadcastRevenueTransaction).amount;
                                }
                                G = c6cVar;
                                break;
                            } else {
                                textView4.setText(jb6.M0(2131748114, null));
                                textView5.setText(jb6.Q(r4.from_date) + " - " + jb6.Q(r4.to_date));
                                j2 = ((TL_stats.TL_broadcastRevenueTransactionProceeds) broadcastRevenueTransaction).amount;
                            }
                            z = false;
                            c = 1;
                        }
                        anb.X(textView5, z ? cmb.o7 : cmb.x6, ylbVar2);
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                        spannableStringBuilder3.append((CharSequence) (c < 0 ? "-" : "+"));
                        spannableStringBuilder3.append((CharSequence) "TON ");
                        spannableStringBuilder3.append((CharSequence) hk1Var.e.format(Math.abs(j2) / 1.0E9d));
                        int indexOf = TextUtils.indexOf(spannableStringBuilder3, ".");
                        if (indexOf >= 0) {
                            spannableStringBuilder3.setSpan(new RelativeSizeSpan(1.15f), 0, indexOf + 1, 33);
                        }
                        fnVar.setText(ik1.L(spannableStringBuilder3, fnVar.getPaint(), 1.1f, gm.L(0.33f), false));
                        anb.X(fnVar, c < 0 ? cmb.p7 : cmb.k8, ylbVar2);
                        hk1Var.f = J;
                        hk1Var.setWillNotDraw(!J);
                        G = c6cVar;
                    case 27:
                        z7b z7bVar = (z7b) view;
                        long j6 = z7bVar.y;
                        Object obj5 = G.H;
                        if (!(obj5 instanceof TLRPC.User)) {
                            if (obj5 instanceof TLRPC.Chat) {
                                j3 = -((TLRPC.Chat) obj5).id;
                            }
                            boolean z7 = j6 != j4;
                            z7bVar.d(false, true);
                            z7bVar.set(G.H);
                            z7bVar.f.setVisibility(8);
                            z7bVar.h.setVisibility(0);
                            z7bVar.c(G.e, z7);
                            z7bVar.setDivider(J);
                            break;
                        } else {
                            j3 = ((TLRPC.User) obj5).id;
                        }
                        j4 = j3;
                        if (j6 != j4) {
                        }
                        z7bVar.d(false, true);
                        z7bVar.set(G.H);
                        z7bVar.f.setVisibility(8);
                        z7bVar.h.setVisibility(0);
                        z7bVar.c(G.e, z7);
                        z7bVar.setDivider(J);
                    case 28:
                        if (G.t) {
                            anb.q(view);
                            view.setBackgroundColor(0);
                        } else if (G.k != 0) {
                            anb.q(view);
                            view.setBackgroundColor(G.k);
                        }
                        view.setId(G.d);
                        ((j7c) view).setHeight(G.A);
                        break;
                    case 29:
                        k51 k51Var = (k51) view;
                        Object obj6 = G.H;
                        if (obj6 instanceof l51) {
                            lka lkaVar3 = k51Var.c;
                            xna xnaVar = k51Var.b;
                            k51Var.e = J;
                            TL_account.TL_businessChatLink tL_businessChatLink = ((l51) obj6).a;
                            k51Var.f = tL_businessChatLink;
                            boolean isEmpty4 = TextUtils.isEmpty(tL_businessChatLink.title);
                            lka lkaVar4 = k51Var.a;
                            TL_account.TL_businessChatLink tL_businessChatLink2 = k51Var.f;
                            if (isEmpty4) {
                                String str4 = tL_businessChatLink2.link;
                                q51[] q51VarArr = q51.e;
                                if (str4.startsWith("https://")) {
                                    str4 = str4.substring(8);
                                }
                                lkaVar4.l(str4, false);
                            } else {
                                lkaVar4.l(tL_businessChatLink2.title, false);
                            }
                            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(k51Var.f.message);
                            TL_account.TL_businessChatLink tL_businessChatLink3 = k51Var.f;
                            hs6.h(tL_businessChatLink3.entities, tL_businessChatLink3.message, spannableStringBuilder4, -1);
                            CharSequence m = gw3.m(spannableStringBuilder4, xnaVar.getPaint().getFontMetricsInt(), false, null, 0);
                            k47.A5(m, k51Var.f.entities, xnaVar.getPaint().getFontMetricsInt(), false);
                            xnaVar.setText(m);
                            int i15 = k51Var.f.views;
                            if (i15 == 0) {
                                lkaVar3.l(jb6.a0(null, null, 2131747961, new Object[0]), false);
                            } else {
                                lkaVar3.l(jb6.G(i15, "Clicks", new Object[0]), false);
                            }
                            lkaVar3.requestLayout();
                            k51Var.invalidate();
                            break;
                        }
                        break;
                    case nm7.S /* 30 */:
                        ckb ckbVar = (ckb) view;
                        CharSequence charSequence14 = G.m;
                        int i16 = G.k;
                        ckbVar.b.l(charSequence14, false);
                        ckbVar.a.setImageResource(i16);
                        ckbVar.setDivider(J);
                        anb.h(cmb.g5, this.P, ckbVar);
                        break;
                    case 31:
                        l55 l55Var = (l55) view;
                        if (!TextUtils.equals(l55Var.getText(), G.m)) {
                            l55Var.b(G.m, G.n, G.E);
                            break;
                        } else {
                            l55Var.a(G.n, G.E);
                            break;
                        }
                    case 32:
                        ut8 ut8Var = (ut8) view;
                        Object obj7 = G.H;
                        if (G.r && (obj7 instanceof TLRPC.User) && (i2 = ((TLRPC.User) obj7).bot_active_users) != 0) {
                            if (i2 != 0) {
                                concat = jb6.H(' ', "BotUsers", i2);
                                if (!(obj7 instanceof TLRPC.Chat)) {
                                }
                                String str5 = str;
                                boolean z8 = G.u;
                                Object obj8 = G.I;
                                if (obj8 instanceof qac) {
                                }
                                ut8Var.C0 = z8;
                                ut8Var.D0 = r11;
                                ut8Var.setRectangularAvatar(G.s);
                                CharSequence charSequence15 = G.n;
                                ut8Var.x(obj7, null, str5, charSequence15 == null ? charSequence15 : concat, false, false);
                                ut8Var.w(G.e, false);
                                ut8Var.N = J;
                            }
                            concat = "";
                            if (!(obj7 instanceof TLRPC.Chat)) {
                            }
                            String str52 = str;
                            boolean z82 = G.u;
                            Object obj82 = G.I;
                            if (obj82 instanceof qac) {
                            }
                            ut8Var.C0 = z82;
                            ut8Var.D0 = r11;
                            ut8Var.setRectangularAvatar(G.s);
                            CharSequence charSequence152 = G.n;
                            ut8Var.x(obj7, null, str52, charSequence152 == null ? charSequence152 : concat, false, false);
                            ut8Var.w(G.e, false);
                            ut8Var.N = J;
                        } else {
                            if (G.J) {
                                String p = obj7 instanceof TLRPC.User ? m9c.p((TLRPC.User) obj7) : obj7 instanceof TLRPC.Chat ? sd2.K((TLRPC.Chat) obj7, false) : null;
                                if (p != null) {
                                    concat = "@".concat(p);
                                    if (!(obj7 instanceof TLRPC.Chat)) {
                                        TLRPC.Chat chat = (TLRPC.Chat) obj7;
                                        if (chat.participants_count != 0) {
                                            String H = (!sd2.T(chat) || chat.megagroup) ? jb6.H(' ', "Members", chat.participants_count) : jb6.H(' ', "Subscribers", chat.participants_count);
                                            concat = !TextUtils.isEmpty(concat) ? TextUtils.concat(concat, ", ", H) : H;
                                        }
                                        str = chat.title;
                                    } else if (obj7 instanceof TLRPC.User) {
                                        str = m9c.r((TLRPC.User) obj7);
                                    }
                                    String str522 = str;
                                    boolean z822 = G.u;
                                    Object obj822 = G.I;
                                    qac qacVar = obj822 instanceof qac ? (qac) obj822 : null;
                                    ut8Var.C0 = z822;
                                    ut8Var.D0 = qacVar;
                                    ut8Var.setRectangularAvatar(G.s);
                                    CharSequence charSequence1522 = G.n;
                                    ut8Var.x(obj7, null, str522, charSequence1522 == null ? charSequence1522 : concat, false, false);
                                    ut8Var.w(G.e, false);
                                    ut8Var.N = J;
                                    break;
                                }
                            }
                            concat = "";
                            if (!(obj7 instanceof TLRPC.Chat)) {
                            }
                            String str5222 = str;
                            boolean z8222 = G.u;
                            Object obj8222 = G.I;
                            if (obj8222 instanceof qac) {
                            }
                            ut8Var.C0 = z8222;
                            ut8Var.D0 = qacVar;
                            ut8Var.setRectangularAvatar(G.s);
                            CharSequence charSequence15222 = G.n;
                            ut8Var.x(obj7, null, str5222, charSequence15222 == null ? charSequence15222 : concat, false, false);
                            ut8Var.w(G.e, false);
                            ut8Var.N = J;
                        }
                        break;
                    case 33:
                        hg3 hg3Var = (hg3) view;
                        Object obj9 = G.H;
                        k47 k47Var4 = obj9 instanceof k47 ? (k47) obj9 : null;
                        hg3Var.t2 = J;
                        if (k47Var4 != null) {
                            hg3Var.e0(k47.B0(k47Var4.k), k47Var4, k47Var4.k.date, false, false);
                            break;
                        } else {
                            hg3Var.e0(0L, null, 0, false, false);
                            break;
                        }
                    case 34:
                        ((tk4) view).setViewType(G.A);
                        break;
                    case 35:
                    case 36:
                    case 41:
                        oh2 oh2Var = (oh2) view;
                        oh2Var.setPad(G.i);
                        oh2Var.e(G.m, "", G.e, J, oh2Var.a == G.d);
                        oh2Var.a = G.d;
                        oh2Var.setIcon(G.u ? R.drawable.permission_locked : 0);
                        if (i4 == 36 || i4 == 41) {
                            boolean z9 = G.f;
                            CharSequence charSequence16 = G.p;
                            View.OnClickListener onClickListener = G.E;
                            nh2 nh2Var = oh2Var.w;
                            if (nh2Var != null) {
                                io ioVar3 = (io) nh2Var.c;
                                ioVar3.a();
                                ioVar3.setText(charSequence16);
                                View view6 = nh2Var.d;
                                view6.animate().cancel();
                                view6.animate().rotation(z9 ? 0.0f : 180.0f).setDuration(340L).setInterpolator(d53.h).start();
                                if (onClickListener != null) {
                                    nh2Var.setOnClickListener(onClickListener);
                                    break;
                                }
                            }
                        }
                        break;
                    case 37:
                        oh2 oh2Var2 = (oh2) view;
                        oh2Var2.setPad(G.i);
                        oh2Var2.setUserOrChat((TLObject) G.H);
                        oh2Var2.c(G.e, oh2Var2.a == G.d);
                        oh2Var2.a = G.d;
                        oh2Var2.setNeedDivider(J);
                        break;
                    case 39:
                    case 40:
                        ajb ajbVar = (ajb) view;
                        ajbVar.d(G.m.toString(), G.e, J, ajbVar.a == G.d);
                        ajbVar.getCheckBox().setDrawIconType(G.A);
                        Switch checkBox = ajbVar.getCheckBox();
                        int i17 = G.A == 0 ? cmb.L6 : cmb.q7;
                        int i18 = cmb.M6;
                        int i19 = cmb.c6;
                        checkBox.d(i17, i18, i19, i19);
                        ajbVar.a = G.d;
                        ajbVar.setIcon(G.u ? R.drawable.permission_locked : 0);
                        if (i4 == 40) {
                            if (!TextUtils.isEmpty(G.p)) {
                                ajbVar.a(new x4c(G, ajbVar, (byte) 5), G.p.toString(), G.f);
                                break;
                            } else {
                                LinearLayout linearLayout = ajbVar.f;
                                if (linearLayout != null) {
                                    linearLayout.setVisibility(8);
                                    break;
                                }
                            }
                        }
                        break;
                    case 42:
                        jf5 jf5Var2 = (jf5) view;
                        jf5Var2.c(G.p, jf5Var2.a == G.d);
                        jf5Var2.a = G.d;
                        break;
                    case 43:
                        vkb vkbVar = (vkb) view;
                        vkbVar.getValueBackupImageView().setImageDrawable(null);
                        CharSequence charSequence17 = G.m;
                        if (charSequence17 != null) {
                            CharSequence charSequence18 = G.n;
                            if (charSequence18 != null) {
                                vkbVar.c(charSequence17, charSequence18, false, J);
                            } else {
                                vkbVar.b(charSequence17, J);
                            }
                        }
                        vkbVar.setIcon(G.k);
                        break;
                    case 44:
                        ((v09) view).b(G.m.toString(), G.o.toString(), J, G.e);
                        break;
                }
            } else {
                b6c G4 = c6c.G(i4);
                if (G4 != null) {
                    G4.b(u69Var.a, G, J, this, r59Var instanceof q7c ? (q7c) r59Var : null);
                }
            }
            qac qacVar2 = G.G;
            if (qacVar2 != null) {
                qacVar2.a(view);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // y59
    public u69 x(ViewGroup viewGroup, int i) {
        View z69Var;
        View jf5Var;
        View jf5Var2;
        View yn7Var;
        int i2;
        jf5 jf5Var3;
        boolean z = this.n;
        int i3 = z ? cmb.g5 : cmb.c6;
        r59 r59Var = this.d;
        ylb ylbVar = this.x;
        Context context = this.e;
        if (i < 10000) {
            int i4 = 8;
            switch (i) {
                case -5:
                    z69Var = new z69(context);
                    z69Var.setTag(-33024);
                    jf5Var = z69Var;
                    break;
                case -4:
                case -1:
                    z69Var = new ct8(context, (byte) 19);
                    if (i == -4) {
                        z69Var.setTag(-33024);
                    }
                    jf5Var = z69Var;
                    break;
                case -3:
                    h7c h7cVar = new h7c(context);
                    h7cVar.a = 0;
                    jf5Var = h7cVar;
                    break;
                case -2:
                    jf5Var = new ct8(context, (byte) 20);
                    break;
                case 0:
                    if (!z) {
                        jf5Var = new jf5(context, ylbVar);
                        break;
                    } else {
                        jf5Var = new jf5(this.e, cmb.K6, 21, 15, 0, false, false, this.x);
                        break;
                    }
                case 1:
                    jf5Var2 = new jf5(this.e, cmb.F6, 17, 15, false, this.x);
                    jf5Var = jf5Var2;
                    break;
                case 2:
                    jf5Var = new pvb(context, ylbVar);
                    break;
                case 3:
                    xib xibVar = new xib(context, ylbVar);
                    xibVar.setCompactLayout(this.s);
                    jf5Var = xibVar;
                    break;
                case 4:
                case 9:
                    bjb bjbVar = new bjb(context, ylbVar);
                    if (i == 9) {
                        bjbVar.setDrawCheckRipple(true);
                        bjbVar.d(cmb.f6, cmb.N6, cmb.O6, cmb.P6, cmb.Q6);
                        bjbVar.setTypeface(gm.o());
                        bjbVar.setHeight(56);
                    }
                    jf5Var = bjbVar;
                    break;
                case 5:
                case 6:
                    yn7Var = new yn7(this.e, 21, 60, i == 6, this.x);
                    jf5Var = yn7Var;
                    break;
                case 7:
                case 8:
                default:
                    jf5Var = new njb(context, ylbVar);
                    break;
                case 10:
                    vg3 vg3Var = new vg3(context);
                    vg3Var.f = 23;
                    TextView textView = new TextView(context);
                    vg3Var.b = textView;
                    anb.X(textView, cmb.F6, null);
                    wi8.w(textView, 1, 16.0f, 1, 1);
                    textView.setSingleLine(true);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView.setEllipsize(truncateAt);
                    textView.setGravity((jb6.a0 ? 5 : 3) | 16);
                    boolean z2 = jb6.a0;
                    vg3Var.addView(textView, qoe.d(-1, -1.0f, (z2 ? 5 : 3) | 48, z2 ? 61.0f : 23.0f, 0.0f, z2 ? 23.0f : 61.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    vg3Var.c = textView2;
                    anb.X(textView2, cmb.H6, null);
                    wi8.w(textView2, 1, 16.0f, 1, 1);
                    textView2.setSingleLine(true);
                    textView2.setEllipsize(truncateAt);
                    textView2.setGravity((jb6.a0 ? 3 : 5) | 16);
                    textView2.setVisibility(8);
                    vg3Var.addView(textView2, qoe.d(-2, -1.0f, (jb6.a0 ? 3 : 5) | 48, 23.0f, 0.0f, 23.0f, 0.0f));
                    RadioButton radioButton = new RadioButton(context);
                    vg3Var.d = radioButton;
                    radioButton.setSize(gm.L(20.0f));
                    anb.O(radioButton, cmb.f7, cmb.g7, null);
                    vg3Var.addView(radioButton, qoe.d(22, 22.0f, (jb6.a0 ? 3 : 5) | 48, 20.0f, 15.0f, 20.0f, 0.0f));
                    vg3Var.b();
                    vg3Var.setHorizontalPadding(21);
                    jf5Var = vg3Var;
                    break;
                case 11:
                case 12:
                    w8c w8cVar = new w8c(context, 6, i != 12 ? 0 : 3, false);
                    w8cVar.setSelfAsSavedMessages(true);
                    jf5Var = w8cVar;
                    break;
                case 13:
                    jf5Var2 = new w8c(6, 0, null, this.e, false, true);
                    jf5Var = jf5Var2;
                    break;
                case 14:
                    jf5Var = new hla(context, ylbVar);
                    break;
                case 15:
                    jf5Var = new jla(context, ylbVar);
                    break;
                case 16:
                    jf5Var = new kz8(ylbVar, context, this.N != null);
                    break;
                case 17:
                    jf5Var = new jz8(context, ylbVar);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    if (this.F == null) {
                        this.F = new mg0((ylb) null);
                    }
                    yn7Var = new vza(this.e, this.f, i - 18, this.F, this.h);
                    jf5Var = yn7Var;
                    break;
                case 24:
                    jf5Var = new gk1(context, ylbVar);
                    break;
                case 25:
                    jf5Var = new hk1(context, ylbVar);
                    break;
                case 26:
                    jf5 jf5Var4 = new jf5(this.e, cmb.F6, 23, 20, 0, false, false, this.x);
                    jf5Var4.setTextSize(20.0f);
                    jf5Var3 = jf5Var4;
                    jf5Var = jf5Var3;
                    break;
                case 27:
                    z7b z7bVar = new z7b(context, ylbVar);
                    z7bVar.d(false, false);
                    jf5Var = z7bVar;
                    break;
                case 28:
                    z69Var = new j7c(context);
                    z69Var.setTag(-33024);
                    jf5Var = z69Var;
                    break;
                case 29:
                    jf5Var = new k51(context, ylbVar);
                    break;
                case nm7.S /* 30 */:
                    jf5Var = new ckb(context, ylbVar);
                    break;
                case 31:
                    if (r59Var != null && r59Var.c1()) {
                        l55 l55Var = new l55(28, ylbVar, context);
                        l55Var.setNoBackground(true);
                        jf5Var = l55Var;
                        break;
                    } else {
                        jf5Var = new l55(context, ylbVar);
                        break;
                    }
                    break;
                case 32:
                    jf5Var = new ut8(context, null);
                    break;
                case 33:
                    jf5Var = new hg3(context, true);
                    break;
                case 34:
                    tk4 tk4Var = new tk4(context, ylbVar);
                    tk4Var.setIsSingleCell(true);
                    jf5Var = tk4Var;
                    break;
                case 35:
                case 36:
                case 37:
                case 41:
                    if (i != 35) {
                        if (i == 36) {
                            i2 = 6;
                        } else if (i == 37) {
                            i4 = 7;
                        } else if (i != 41) {
                            i2 = 0;
                        }
                        oh2 oh2Var = new oh2(this.e, i2, 21, true, this.x);
                        oh2Var.getCheckBoxRound().b(cmb.U6, cmb.f7, cmb.j7);
                        jf5Var3 = oh2Var;
                        jf5Var = jf5Var3;
                        break;
                    } else {
                        i4 = 4;
                    }
                    i2 = i4;
                    oh2 oh2Var2 = new oh2(this.e, i2, 21, true, this.x);
                    oh2Var2.getCheckBoxRound().b(cmb.U6, cmb.f7, cmb.j7);
                    jf5Var3 = oh2Var2;
                    jf5Var = jf5Var3;
                case 38:
                    jf5Var = new dm2(context, ylbVar);
                    break;
                case 39:
                case 40:
                    jf5Var = new ajb(context);
                    break;
                case 42:
                    jf5Var3 = new jf5(this.e, cmb.K6, 21, 15, 0, false, true, this.x);
                    jf5Var = jf5Var3;
                    break;
                case 43:
                    jf5Var = new vkb(0, ylbVar, context);
                    break;
                case 44:
                    jf5Var = new v09(context, false);
                    break;
            }
        } else {
            b6c G = c6c.G(i);
            jf5Var = G != null ? G.d(context, r59Var, this.f, ylbVar) : new View(context);
        }
        if (N(i)) {
            anb.h(i3, this.P, jf5Var);
        }
        return new b59(jf5Var);
    }

    @Override // y59
    public void y(u69 u69Var) {
        R(u69Var, this.O);
        P(u69Var);
    }
}
