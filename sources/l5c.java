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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class l5c extends ka {
    public mf0 F;
    public i5c J;
    public i5c K;
    public int L;
    public boolean M;
    public i8c N;
    public boolean O;
    public final o39 d;
    public final Context e;
    public final int f;
    public final int h;
    public final boolean n;
    public boolean s;
    public i8c w;
    public final wjb x;
    public boolean r = true;
    public final ArrayList y = new ArrayList();
    public final ArrayList E = new ArrayList();
    public boolean G = false;
    public final ArrayList H = new ArrayList();
    public final ArrayList I = new ArrayList();
    public final fd P = new fd(this, 5);

    public l5c(o39 o39Var, Context context, int i, int i2, boolean z, i8c i8cVar, wjb wjbVar) {
        this.d = o39Var;
        this.e = context;
        this.f = i;
        this.h = i2;
        this.n = z;
        this.w = i8cVar;
        this.x = wjbVar;
        O(false);
    }

    public static boolean K(int i) {
        if (i < 10000) {
            return i == 7 || i == 8 || i == 38 || i == 31 || i == -4 || i == 28 || i == 2 || i == -2;
        }
        b4c G = c4c.G(i);
        return G != null && G.g();
    }

    @Override // n39
    public boolean D(s49 s49Var) {
        int i = s49Var.f;
        c4c G = G(s49Var.b());
        if (i >= 10000) {
            b4c G2 = c4c.G(i);
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
                i5c i5cVar = (i5c) arrayList.get(i);
                this.N.a(Integer.valueOf(i), new ArrayList(this.E.subList(i5cVar.a, i5cVar.b + 1)));
                this.M = false;
            }
        }
    }

    public final c4c G(int i) {
        if (i < 0) {
            return null;
        }
        ArrayList arrayList = this.E;
        if (i < arrayList.size()) {
            return (c4c) arrayList.get(i);
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
            i5c i5cVar = (i5c) arrayList.get(i2);
            if (i >= i5cVar.a && i <= i5cVar.b) {
                return i2;
            }
            i2++;
        }
    }

    public int I(int i) {
        return bkb.v0(i, this.x);
    }

    public final boolean J(int i) {
        c4c G = G(i);
        c4c G2 = G(i + 1);
        return (G == null || G.j || G2 == null || K(G2.a) != K(G.a)) ? false : true;
    }

    public final void L() {
        i5c i5cVar = this.K;
        if (i5cVar != null) {
            i5cVar.b = Math.max(0, this.E.size() - 1);
        }
    }

    public final int M() {
        i5c i5cVar = new i5c();
        this.K = i5cVar;
        i5cVar.a = this.E.size();
        i5c i5cVar2 = this.K;
        i5cVar2.b = -1;
        this.I.add(i5cVar2);
        return r2.size() - 1;
    }

    public final boolean N(int i) {
        if (!this.r) {
            return false;
        }
        o39 o39Var = this.d;
        if (o39Var != null && o39Var.c1() && o39Var.getSectionsDrawBackground()) {
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
            case kk7.S /* 30 */:
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
        o39 o39Var = this.d;
        if (o39Var == null || !o39Var.d0()) {
            Q(z);
        } else {
            o39Var.post(new k08((byte) 24, (Object) this, z));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void P(s49 s49Var) {
        View view = s49Var.a;
        if (view instanceof tjb) {
            ((tjb) view).updateColors();
            Object tag = view.getTag(R.id.theme_generation);
            int i = zkb.b;
            if (N(s49Var.f) && (!(tag instanceof Integer) || ((Integer) tag).intValue() != i)) {
                view.setBackgroundColor(I(this.n ? bkb.g5 : bkb.c6));
            }
            view.setTag(R.id.theme_generation, Integer.valueOf(i));
        }
    }

    public final void Q(boolean z) {
        o39 o39Var = this.d;
        if (o39Var == null || !o39Var.d0()) {
            ArrayList arrayList = this.y;
            arrayList.clear();
            ArrayList arrayList2 = this.E;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            this.J = null;
            this.H.clear();
            this.I.clear();
            i8c i8cVar = this.w;
            if (i8cVar != null) {
                i8cVar.a(arrayList2, this);
                S();
                if (z) {
                    E(arrayList, arrayList2);
                } else {
                    f();
                }
            }
        }
    }

    public final void R(s49 s49Var, boolean z) {
        if (s49Var != null) {
            View view = s49Var.a;
            int i = s49Var.f;
            if (i < 10000) {
                if (i != 16) {
                    return;
                }
                ((jx8) view).setReorder(z);
            } else {
                b4c G = c4c.G(i);
                if (G != null) {
                    G.a(this.d, view, G(s49Var.b()));
                }
            }
        }
    }

    public final void S() {
        o39 o39Var = this.d;
        if (o39Var != null) {
            ArrayList arrayList = o39Var.L2;
            if (arrayList == null) {
                o39Var.L2 = new ArrayList();
            } else {
                arrayList.clear();
            }
            ArrayList arrayList2 = this.H;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                i5c i5cVar = (i5c) obj;
                o39Var.L2.add(Long.valueOf(gl.u2(i5cVar.a, i5cVar.b)));
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
        i8c i8cVar = this.w;
        if (i8cVar != null) {
            i8cVar.a(arrayList2, this);
        }
        S();
    }

    public final void U() {
        i5c i5cVar = this.J;
        if (i5cVar != null) {
            i5cVar.b = Math.max(0, (this.E.size() + (this.G ? 1 : 0)) - 1);
            i5c i5cVar2 = this.J;
            if (i5cVar2.a == i5cVar2.b) {
                this.H.remove(i5cVar2);
            }
            this.J = null;
        }
    }

    public final void V() {
        i5c i5cVar = new i5c();
        this.J = i5cVar;
        i5cVar.a = this.E.size() + (this.G ? 1 : 0);
        i5c i5cVar2 = this.J;
        i5cVar2.b = -1;
        this.H.add(i5cVar2);
    }

    @Override // w39
    public final int b() {
        return this.E.size();
    }

    @Override // w39
    public final int d(int i) {
        c4c G = G(i);
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
    @Override // w39
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void t(s49 s49Var, int i) {
        String str;
        mhb mhbVar;
        ImageReceiver imageReceiver;
        long j;
        gl5 gl5Var;
        String str2;
        c4c c4cVar;
        long j2;
        boolean z;
        char c;
        long j3;
        CharSequence concat;
        int i2;
        int i3 = this.f;
        o39 o39Var = this.d;
        wjb wjbVar = this.x;
        c4c G = G(i);
        c4c G2 = G(i + 1);
        c4c G3 = G(i - 1);
        if (G != null) {
            int i4 = s49Var.f;
            View view = s49Var.a;
            boolean J = J(i);
            P(s49Var);
            if (i4 < 10000) {
                long j4 = 0;
                byte b = 2;
                str = "";
                switch (i4) {
                    case -5:
                        x49 x49Var = (x49) view;
                        if (x49Var.getChildCount() != (G.c == null ? 0 : 1) || x49Var.getChildAt(0) != G.c) {
                            x49Var.removeAllViews();
                            View view2 = G.c;
                            if (view2 != null) {
                                gl.B2(view2);
                                x49Var.addView(G.c, nme.c(-1.0f, -1));
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
                                gl.B2(view3);
                                frameLayout.addView(G.c, (i4 == -1 || i4 == -4) ? nme.c(G.A, -1) : nme.c(-2.0f, -2));
                                break;
                            }
                        }
                        break;
                    case -3:
                        h5c h5cVar = (h5c) view;
                        h5cVar.setMinusHeight(G.A);
                        h5cVar.setMinusPadding(fod.a(G.z, 1));
                        if (h5cVar.getChildCount() != (G.c == null ? 0 : 1) || h5cVar.getChildAt(0) != G.c) {
                            h5cVar.removeAllViews();
                            View view4 = G.c;
                            if (view4 != null) {
                                gl.B2(view4);
                                h5cVar.addView(G.c, nme.c(-1.0f, -1));
                                break;
                            }
                        }
                        break;
                    case 0:
                    case 1:
                    case 26:
                        ld5 ld5Var = (ld5) view;
                        ld5Var.setText(G.m);
                        ld5Var.b(G.g);
                        break;
                    case 2:
                        otb otbVar = (otb) view;
                        int i5 = G.k;
                        if (i5 == 0) {
                            int i6 = G.A;
                            if (i6 != 0) {
                                otbVar.setEmojiSize(i6);
                            }
                            String charSequence = G.n.toString();
                            String charSequence2 = G.o.toString();
                            otbVar.getClass();
                            hq6.d0(y6c.t0).e2(otbVar.b, charSequence, charSequence2, "90_90");
                        } else if (G.r) {
                            otbVar.setEmojiStatic(i5);
                        } else {
                            otbVar.setEmoji(i5);
                        }
                        boolean isEmpty = TextUtils.isEmpty(G.p);
                        CharSequence charSequence3 = G.m;
                        if (!isEmpty) {
                            otbVar.a(charSequence3, G.p);
                            break;
                        } else {
                            otbVar.setText(charSequence3);
                            break;
                        }
                    case 3:
                        wgb wgbVar = (wgb) view;
                        Object obj = G.H;
                        if (obj instanceof TLRPC.Document) {
                            CharSequence charSequence4 = G.m;
                            TLRPC.Document document = (TLRPC.Document) obj;
                            wgbVar.x = wgbVar.getDefaultImageLeft();
                            wgbVar.s = wgbVar.c(false);
                            jia jiaVar = wgbVar.a;
                            jiaVar.l(charSequence4, false);
                            jiaVar.i(null);
                            hn hnVar = wgbVar.c;
                            wgbVar.R = null;
                            hnVar.c(null, false, true);
                            wgbVar.h.setVisibility(8);
                            hnVar.setVisibility(8);
                            wgbVar.d.setVisibility(8);
                            ry8 ry8Var = wgbVar.e;
                            ry8Var.setVisibility(8);
                            ry8Var.setPadding(0, gl.L(7.0f), 0, 0);
                            wgbVar.r = J;
                            wgbVar.setWillNotDraw(!J);
                            Switch r0 = wgbVar.f;
                            if (r0 != null) {
                                r0.setVisibility(8);
                            }
                            wgbVar.setValueSticker(document);
                        } else if (obj instanceof String) {
                            CharSequence charSequence5 = G.m;
                            String str3 = (String) obj;
                            wgbVar.x = wgbVar.getDefaultImageLeft();
                            wgbVar.s = wgbVar.c(false);
                            jia jiaVar2 = wgbVar.a;
                            jiaVar2.l(charSequence5, false);
                            jiaVar2.i(null);
                            hn hnVar2 = wgbVar.c;
                            wgbVar.R = null;
                            hnVar2.c(null, false, true);
                            wgbVar.h.setVisibility(8);
                            hnVar2.setVisibility(8);
                            wgbVar.d.setVisibility(8);
                            ry8 ry8Var2 = wgbVar.e;
                            ry8Var2.setVisibility(8);
                            ry8Var2.setPadding(0, gl.L(7.0f), 0, 0);
                            wgbVar.r = J;
                            wgbVar.setWillNotDraw(!J);
                            Switch r02 = wgbVar.f;
                            if (r02 != null) {
                                r02.setVisibility(8);
                            }
                            wgbVar.setValueSticker(str3);
                        } else {
                            boolean isEmpty2 = TextUtils.isEmpty(G.o);
                            Object obj2 = G.H;
                            if (isEmpty2) {
                                if (obj2 instanceof Drawable) {
                                    wgbVar.p(G.m, (Drawable) obj2, J);
                                } else {
                                    int i7 = G.k;
                                    CharSequence charSequence6 = G.m;
                                    if (i7 == 0) {
                                        wgbVar.k(charSequence6, J);
                                    } else {
                                        wgbVar.o(i7, charSequence6, J);
                                    }
                                }
                            } else if (obj2 instanceof Drawable) {
                                wgbVar.t(G.m, G.o, (Drawable) obj2, J);
                            } else {
                                int i8 = G.k;
                                CharSequence charSequence7 = G.m;
                                CharSequence charSequence8 = G.o;
                                if (i8 == 0) {
                                    wgbVar.q(charSequence7, charSequence8, false, J);
                                } else {
                                    wgbVar.u(charSequence7, charSequence8, false, i8, J);
                                }
                            }
                        }
                        if (G.r) {
                            int i9 = bkb.p6;
                            wgbVar.g(i9, i9);
                        } else if (G.s) {
                            wgbVar.g(bkb.p7, bkb.o7);
                        } else {
                            wgbVar.g(bkb.l6, bkb.F6);
                        }
                        wgbVar.h(45, G.u, true);
                        wgbVar.i(G.g, true);
                        break;
                    case 4:
                    case 9:
                        ahb ahbVar = (ahb) view;
                        if (ahbVar.b == G.d) {
                            ahbVar.setChecked(G.e);
                        }
                        ahbVar.e(null, G.g);
                        ahbVar.f(G.m, G.e, J);
                        ahbVar.b = G.d;
                        if (i4 == 9) {
                            zkb.h(G.e ? bkb.e6 : bkb.d6, null, view);
                            break;
                        }
                        break;
                    case 5:
                        vl7 vl7Var = (vl7) view;
                        CharSequence charSequence9 = G.n;
                        vl7Var.b(G.m, G.n, 0, G.e, 0, charSequence9 != null && charSequence9.toString().contains("\n"), J, false);
                        break;
                    case 6:
                        ((vl7) view).b(G.m, G.n, 0, G.e, 0, false, J, false);
                        break;
                    case 7:
                    case 8:
                    case 38:
                        if (i4 == 7 || i4 == 8) {
                            mhb mhbVar2 = (mhb) view;
                            if (TextUtils.isEmpty(G.m)) {
                                mhbVar2.setFixedSize(i4 == 8 ? kk7.w3 : 12);
                                mhbVar2.setText("");
                            } else {
                                mhbVar2.setFixedSize(0);
                                mhbVar2.setText(G.m);
                            }
                            if (G.r) {
                                mhbVar2.setTextGravity(17);
                                mhbVar2.getTextView().setWidth(Math.min(je5.a(mhbVar2.getText(), mhbVar2.getTextView().getPaint()), gl.q.x - gl.L(60.0f)));
                                mhbVar2.getTextView().setPadding(0, gl.L(17.0f), 0, gl.L(17.0f));
                                mhbVar = mhbVar2;
                            } else {
                                mhbVar2.setTextGravity(8388611);
                                mhbVar2.getTextView().setMinWidth(0);
                                mhbVar2.getTextView().setMaxWidth(gl.q.x);
                                mhbVar2.getTextView().setPadding(0, gl.L(10.0f), 0, gl.L(17.0f));
                                mhbVar = mhbVar2;
                            }
                        } else if (i4 == 38) {
                            rk2 rk2Var = (rk2) view;
                            CharSequence charSequence10 = G.p;
                            boolean z2 = G.f;
                            rk2Var.a.setText(charSequence10);
                            View view5 = rk2Var.b;
                            view5.animate().cancel();
                            view5.animate().rotation(z2 ? 0.0f : 180.0f).setDuration(340L).setInterpolator(s33.h).start();
                            if (G.r) {
                                rk2Var.setColor(bkb.p6);
                                mhbVar = rk2Var;
                            } else if (G.s) {
                                rk2Var.setColor(bkb.o7);
                                mhbVar = rk2Var;
                            } else {
                                rk2Var.setColor(bkb.F6);
                                mhbVar = rk2Var;
                            }
                        } else {
                            mhbVar = null;
                        }
                        boolean z3 = (G3 == null || K(G3.a)) ? false : true;
                        boolean z4 = (G2 == null || K(G2.a)) ? false : true;
                        if (!o39Var.c1()) {
                            Drawable V0 = bkb.V0(this.e, z3 ? z4 ? R.drawable.greydivider : R.drawable.greydivider_bottom : z4 ? R.drawable.greydivider_top : R.drawable.field_carret_empty, bkb.v0(bkb.a7, wjbVar));
                            if (!this.n) {
                                mhbVar.setBackground(V0);
                                break;
                            } else {
                                int i10 = bkb.h5;
                                mhbVar.setBackground(new LayerDrawable(new Drawable[]{I(i10) == bkb.v0(i10, wjbVar) ? new k5c(i10, wjbVar) : new ColorDrawable(I(i10)), V0}));
                                break;
                            }
                        } else {
                            mhbVar.setBackground(null);
                            break;
                        }
                        break;
                    case 10:
                        if3 if3Var = (if3) view;
                        int i11 = if3Var.a;
                        TextView textView = if3Var.b;
                        TextView textView2 = if3Var.c;
                        RadioButton radioButton = if3Var.d;
                        if (i11 == G.d) {
                            radioButton.a(G.e, true);
                            if3Var.a(G.g, true);
                        } else {
                            if3Var.a(G.g, false);
                        }
                        boolean isEmpty3 = TextUtils.isEmpty(G.o);
                        CharSequence charSequence11 = G.m;
                        if (isEmpty3) {
                            boolean z5 = G.e;
                            textView2.setVisibility(8);
                            textView.setText(charSequence11);
                            radioButton.a(z5, false);
                            if3Var.e = J;
                            if3Var.b();
                            if3Var.setWillNotDraw(!J);
                        } else {
                            CharSequence charSequence12 = G.o;
                            boolean z6 = G.e;
                            textView2.setVisibility(0);
                            textView2.setText(charSequence12);
                            textView.setText(charSequence11);
                            radioButton.a(z6, false);
                            if3Var.e = J;
                            if3Var.b();
                            if3Var.setWillNotDraw(!J);
                        }
                        if3Var.a = G.d;
                        break;
                    case 11:
                    case 12:
                        v6c v6cVar = (v6c) view;
                        v6cVar.g(i3, G, J);
                        if (i4 == 12) {
                            v6cVar.c(G.e, false);
                            break;
                        }
                        break;
                    case 13:
                        v6c v6cVar2 = (v6c) view;
                        v6cVar2.g(i3, G, J);
                        CharSequence charSequence13 = G.o;
                        v6cVar2.setQuery(charSequence13 == null ? null : charSequence13.toString().toLowerCase());
                        v6cVar2.setAddButtonVisible(!G.e);
                        v6cVar2.setCloseIcon(G.E);
                        break;
                    case 14:
                        fja fjaVar = (fja) view;
                        fjaVar.b(G.A, null, G.q);
                        fjaVar.setMinAllowedIndex((int) G.C);
                        fjaVar.setCallback(new hza(G, (byte) 21));
                        break;
                    case 15:
                        ija ijaVar = (ija) view;
                        ijaVar.d(G.A, (hja) G.H, G.D);
                        ijaVar.setMinValueAllowed((int) G.C);
                        break;
                    case 16:
                        jx8 jx8Var = (jx8) view;
                        jx8Var.d.a(G.e, false);
                        jx8Var.setReorder(this.O);
                        Object obj3 = G.H;
                        if (obj3 instanceof nx8) {
                            jx8Var.a((nx8) obj3, null, J);
                            break;
                        }
                        break;
                    case 17:
                        ix8 ix8Var = (ix8) view;
                        ix8Var.e.a(G.e, false);
                        Object obj4 = G.H;
                        if (obj4 instanceof nx8) {
                            nx8 nx8Var = (nx8) obj4;
                            pb0 pb0Var = ix8Var.a;
                            int[] iArr = ix8Var.r;
                            TextView textView3 = ix8Var.d;
                            ImageReceiver imageReceiver2 = ix8Var.b;
                            int i12 = y6c.t0;
                            ix8Var.c.setText(na7.q1(i12).y1(y6c.h(i12).e(), false));
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            k27 k27Var = nx8Var.e;
                            if (k27Var != null) {
                                spannableStringBuilder.append(vu3.m(k27Var.v, textView3.getPaint().getFontMetricsInt(), false, null, 0));
                            }
                            if (nx8Var.a() > 1) {
                                spannableStringBuilder.append((CharSequence) "  ");
                                int L = gl.q.x - gl.L(80.0f);
                                int a = nx8Var.a() - 1;
                                int i13 = s0.d;
                                SpannableString spannableString = new SpannableString("+");
                                s0 s0Var = new s0(a);
                                iArr[0] = (int) (((tgb) s0Var.c).c + gl.L(10.0f));
                                spannableString.setSpan(s0Var, 0, spannableString.length(), 33);
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(TextUtils.ellipsize(spannableStringBuilder, textView3.getPaint(), (L * 1.5f) - iArr[0], TextUtils.TruncateAt.END));
                                if (spannableStringBuilder2.length() > 0 && spannableStringBuilder2.charAt(spannableStringBuilder2.length() - 1) == 8230) {
                                    spannableStringBuilder2.append((CharSequence) "  ");
                                }
                                spannableStringBuilder2.append((CharSequence) spannableString);
                                spannableStringBuilder = spannableStringBuilder2;
                            }
                            textView3.setText(spannableStringBuilder);
                            TLRPC.MessageMedia m1 = k27.m1(nx8Var.e);
                            if (m1 != null) {
                                TLRPC.Photo photo = m1.photo;
                                if (photo != null) {
                                    TLRPC.PhotoSize w = ba4.w(photo.sizes, gl.L(36.0f), true, null, true);
                                    gl5 f = gl5.f(w, m1.photo);
                                    k27 k27Var2 = nx8Var.e;
                                    imageReceiver2.c0(f, "36_36", k27Var2.I1, w == null ? 0L : w.size, null, k27Var2, 0);
                                    imageReceiver2.q0(gl.L(6.0f));
                                } else {
                                    ImageReceiver imageReceiver3 = imageReceiver2;
                                    TLRPC.Document document2 = m1.document;
                                    imageReceiver = imageReceiver3;
                                    if (document2 != null) {
                                        TLRPC.PhotoSize w2 = ba4.w(document2.thumbs, gl.L(36.0f), true, null, true);
                                        TLRPC.Document document3 = m1.document;
                                        if (w2 == null) {
                                            gl5 b2 = gl5.b(document3);
                                            j = m1.document.size;
                                            str2 = "g";
                                            gl5Var = b2;
                                        } else {
                                            gl5 f2 = gl5.f(w2, document3);
                                            j = w2.size;
                                            gl5Var = f2;
                                            str2 = "36_36";
                                        }
                                        long j5 = j;
                                        k27 k27Var3 = nx8Var.e;
                                        imageReceiver3.c0(gl5Var, str2, k27Var3.I1, j5, null, k27Var3, 0);
                                        imageReceiver3.q0(gl.L(6.0f));
                                    }
                                }
                                ix8Var.s = J;
                                ix8Var.invalidate();
                                break;
                            } else {
                                imageReceiver = imageReceiver2;
                            }
                            pb0Var.q(y6c.h(i12).f());
                            imageReceiver.U(y6c.h(i12).f(), pb0Var, null);
                            imageReceiver.q0(gl.L(56.0f));
                            ix8Var.s = J;
                            ix8Var.invalidate();
                        }
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        sxa sxaVar = (sxa) view;
                        int i14 = G.A;
                        gxa gxaVar = (gxa) G.H;
                        fo1 fo1Var = new fo1(this, G, b);
                        sxaVar.y = i14;
                        sxaVar.E = fo1Var;
                        sxaVar.e(gxaVar, false);
                        break;
                    case 24:
                        ((xi1) view).set((wi1) G.H);
                        break;
                    case 25:
                        yi1 yi1Var = (yi1) view;
                        TL_stats.BroadcastRevenueTransaction broadcastRevenueTransaction = (TL_stats.BroadcastRevenueTransaction) G.H;
                        fm fmVar = yi1Var.b;
                        wjb wjbVar2 = yi1Var.a;
                        TextView textView4 = yi1Var.c;
                        TextView textView5 = yi1Var.d;
                        if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionWithdrawal) {
                            TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
                            textView4.setText(k96.M0(2131748163, null));
                            if (tL_broadcastRevenueTransactionWithdrawal.pending) {
                                textView5.setText(k96.M0(2131748166, null));
                                z = false;
                                c4cVar = G;
                            } else {
                                z = tL_broadcastRevenueTransactionWithdrawal.failed;
                                c4cVar = G;
                                textView5.setText(k96.Q(tL_broadcastRevenueTransactionWithdrawal.date).concat(z ? " — ".concat(k96.M0(2131748167, null)) : ""));
                            }
                            j2 = tL_broadcastRevenueTransactionWithdrawal.amount;
                            c = 65535;
                        } else {
                            c4cVar = G;
                            if (!(broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionProceeds)) {
                                if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionRefund) {
                                    textView4.setText(k96.M0(2131748164, null));
                                    textView5.setText(k96.Q(r4.from_date));
                                    j2 = ((TL_stats.TL_broadcastRevenueTransactionRefund) broadcastRevenueTransaction).amount;
                                }
                                G = c4cVar;
                                break;
                            } else {
                                textView4.setText(k96.M0(2131748165, null));
                                textView5.setText(k96.Q(r4.from_date) + " - " + k96.Q(r4.to_date));
                                j2 = ((TL_stats.TL_broadcastRevenueTransactionProceeds) broadcastRevenueTransaction).amount;
                            }
                            z = false;
                            c = 1;
                        }
                        zkb.X(textView5, z ? bkb.o7 : bkb.x6, wjbVar2);
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                        spannableStringBuilder3.append((CharSequence) (c < 0 ? "-" : "+"));
                        spannableStringBuilder3.append((CharSequence) "TON ");
                        spannableStringBuilder3.append((CharSequence) yi1Var.e.format(Math.abs(j2) / 1.0E9d));
                        int indexOf = TextUtils.indexOf(spannableStringBuilder3, ".");
                        if (indexOf >= 0) {
                            spannableStringBuilder3.setSpan(new RelativeSizeSpan(1.15f), 0, indexOf + 1, 33);
                        }
                        fmVar.setText(zi1.L(spannableStringBuilder3, fmVar.getPaint(), 1.1f, gl.L(0.33f), false));
                        zkb.X(fmVar, c < 0 ? bkb.p7 : bkb.k8, wjbVar2);
                        yi1Var.f = J;
                        yi1Var.setWillNotDraw(!J);
                        G = c4cVar;
                    case 27:
                        x5b x5bVar = (x5b) view;
                        long j6 = x5bVar.y;
                        Object obj5 = G.H;
                        if (!(obj5 instanceof TLRPC.User)) {
                            if (obj5 instanceof TLRPC.Chat) {
                                j3 = -((TLRPC.Chat) obj5).id;
                            }
                            boolean z7 = j6 != j4;
                            x5bVar.d(false, true);
                            x5bVar.set(G.H);
                            x5bVar.f.setVisibility(8);
                            x5bVar.h.setVisibility(0);
                            x5bVar.c(G.e, z7);
                            x5bVar.setDivider(J);
                            break;
                        } else {
                            j3 = ((TLRPC.User) obj5).id;
                        }
                        j4 = j3;
                        if (j6 != j4) {
                        }
                        x5bVar.d(false, true);
                        x5bVar.set(G.H);
                        x5bVar.f.setVisibility(8);
                        x5bVar.h.setVisibility(0);
                        x5bVar.c(G.e, z7);
                        x5bVar.setDivider(J);
                    case 28:
                        if (G.t) {
                            zkb.q(view);
                            view.setBackgroundColor(0);
                        } else if (G.k != 0) {
                            zkb.q(view);
                            view.setBackgroundColor(G.k);
                        }
                        view.setId(G.d);
                        ((j5c) view).setHeight(G.A);
                        break;
                    case 29:
                        d41 d41Var = (d41) view;
                        Object obj6 = G.H;
                        if (obj6 instanceof e41) {
                            jia jiaVar3 = d41Var.c;
                            wla wlaVar = d41Var.b;
                            d41Var.e = J;
                            TL_account.TL_businessChatLink tL_businessChatLink = ((e41) obj6).a;
                            d41Var.f = tL_businessChatLink;
                            boolean isEmpty4 = TextUtils.isEmpty(tL_businessChatLink.title);
                            jia jiaVar4 = d41Var.a;
                            TL_account.TL_businessChatLink tL_businessChatLink2 = d41Var.f;
                            if (isEmpty4) {
                                String str4 = tL_businessChatLink2.link;
                                j41[] j41VarArr = j41.e;
                                if (str4.startsWith("https://")) {
                                    str4 = str4.substring(8);
                                }
                                jiaVar4.l(str4, false);
                            } else {
                                jiaVar4.l(tL_businessChatLink2.title, false);
                            }
                            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(d41Var.f.message);
                            TL_account.TL_businessChatLink tL_businessChatLink3 = d41Var.f;
                            hq6.h(tL_businessChatLink3.entities, tL_businessChatLink3.message, spannableStringBuilder4, -1);
                            CharSequence m = vu3.m(spannableStringBuilder4, wlaVar.getPaint().getFontMetricsInt(), false, null, 0);
                            k27.A5(m, d41Var.f.entities, wlaVar.getPaint().getFontMetricsInt(), false);
                            wlaVar.setText(m);
                            int i15 = d41Var.f.views;
                            if (i15 == 0) {
                                jiaVar3.l(k96.a0(null, null, 2131748035, new Object[0]), false);
                            } else {
                                jiaVar3.l(k96.G(i15, "Clicks", new Object[0]), false);
                            }
                            jiaVar3.requestLayout();
                            d41Var.invalidate();
                            break;
                        }
                        break;
                    case kk7.S /* 30 */:
                        aib aibVar = (aib) view;
                        CharSequence charSequence14 = G.m;
                        int i16 = G.k;
                        aibVar.b.l(charSequence14, false);
                        aibVar.a.setImageResource(i16);
                        aibVar.setDivider(J);
                        zkb.h(bkb.g5, this.P, aibVar);
                        break;
                    case 31:
                        l35 l35Var = (l35) view;
                        if (!TextUtils.equals(l35Var.getText(), G.m)) {
                            l35Var.b(G.m, G.n, G.E);
                            break;
                        } else {
                            l35Var.a(G.n, G.E);
                            break;
                        }
                    case 32:
                        rr8 rr8Var = (rr8) view;
                        Object obj7 = G.H;
                        if (G.r && (obj7 instanceof TLRPC.User) && (i2 = ((TLRPC.User) obj7).bot_active_users) != 0) {
                            if (i2 != 0) {
                                concat = k96.H(' ', "BotUsers", i2);
                                if (!(obj7 instanceof TLRPC.Chat)) {
                                }
                                String str5 = str;
                                boolean z8 = G.u;
                                Object obj8 = G.I;
                                if (obj8 instanceof p8c) {
                                }
                                rr8Var.C0 = z8;
                                rr8Var.D0 = r11;
                                rr8Var.setRectangularAvatar(G.s);
                                CharSequence charSequence15 = G.n;
                                rr8Var.z(obj7, null, str5, charSequence15 == null ? charSequence15 : concat, false, false);
                                rr8Var.y(G.e, false);
                                rr8Var.N = J;
                            }
                            concat = "";
                            if (!(obj7 instanceof TLRPC.Chat)) {
                            }
                            String str52 = str;
                            boolean z82 = G.u;
                            Object obj82 = G.I;
                            if (obj82 instanceof p8c) {
                            }
                            rr8Var.C0 = z82;
                            rr8Var.D0 = r11;
                            rr8Var.setRectangularAvatar(G.s);
                            CharSequence charSequence152 = G.n;
                            rr8Var.z(obj7, null, str52, charSequence152 == null ? charSequence152 : concat, false, false);
                            rr8Var.y(G.e, false);
                            rr8Var.N = J;
                        } else {
                            if (G.J) {
                                String p = obj7 instanceof TLRPC.User ? l7c.p((TLRPC.User) obj7) : obj7 instanceof TLRPC.Chat ? hc2.K((TLRPC.Chat) obj7, false) : null;
                                if (p != null) {
                                    concat = "@".concat(p);
                                    if (!(obj7 instanceof TLRPC.Chat)) {
                                        TLRPC.Chat chat = (TLRPC.Chat) obj7;
                                        if (chat.participants_count != 0) {
                                            String H = (!hc2.T(chat) || chat.megagroup) ? k96.H(' ', "Members", chat.participants_count) : k96.H(' ', "Subscribers", chat.participants_count);
                                            concat = !TextUtils.isEmpty(concat) ? TextUtils.concat(concat, ", ", H) : H;
                                        }
                                        str = chat.title;
                                    } else if (obj7 instanceof TLRPC.User) {
                                        str = l7c.r((TLRPC.User) obj7);
                                    }
                                    String str522 = str;
                                    boolean z822 = G.u;
                                    Object obj822 = G.I;
                                    p8c p8cVar = obj822 instanceof p8c ? (p8c) obj822 : null;
                                    rr8Var.C0 = z822;
                                    rr8Var.D0 = p8cVar;
                                    rr8Var.setRectangularAvatar(G.s);
                                    CharSequence charSequence1522 = G.n;
                                    rr8Var.z(obj7, null, str522, charSequence1522 == null ? charSequence1522 : concat, false, false);
                                    rr8Var.y(G.e, false);
                                    rr8Var.N = J;
                                    break;
                                }
                            }
                            concat = "";
                            if (!(obj7 instanceof TLRPC.Chat)) {
                            }
                            String str5222 = str;
                            boolean z8222 = G.u;
                            Object obj8222 = G.I;
                            if (obj8222 instanceof p8c) {
                            }
                            rr8Var.C0 = z8222;
                            rr8Var.D0 = p8cVar;
                            rr8Var.setRectangularAvatar(G.s);
                            CharSequence charSequence15222 = G.n;
                            rr8Var.z(obj7, null, str5222, charSequence15222 == null ? charSequence15222 : concat, false, false);
                            rr8Var.y(G.e, false);
                            rr8Var.N = J;
                        }
                        break;
                    case 33:
                        ue3 ue3Var = (ue3) view;
                        Object obj9 = G.H;
                        k27 k27Var4 = obj9 instanceof k27 ? (k27) obj9 : null;
                        ue3Var.t2 = J;
                        if (k27Var4 != null) {
                            ue3Var.f0(k27.B0(k27Var4.k), k27Var4, k27Var4.k.date, false, false);
                            break;
                        } else {
                            ue3Var.f0(0L, null, 0, false, false);
                            break;
                        }
                    case 34:
                        ((pi4) view).setViewType(G.A);
                        break;
                    case 35:
                    case 36:
                    case 41:
                        ag2 ag2Var = (ag2) view;
                        ag2Var.setPad(G.i);
                        ag2Var.e(G.m, "", G.e, J, ag2Var.a == G.d);
                        ag2Var.a = G.d;
                        ag2Var.setIcon(G.u ? R.drawable.permission_locked : 0);
                        if (i4 == 36 || i4 == 41) {
                            boolean z9 = G.f;
                            CharSequence charSequence16 = G.p;
                            View.OnClickListener onClickListener = G.E;
                            zf2 zf2Var = ag2Var.w;
                            if (zf2Var != null) {
                                hn hnVar3 = (hn) zf2Var.c;
                                hnVar3.a();
                                hnVar3.setText(charSequence16);
                                View view6 = zf2Var.d;
                                view6.animate().cancel();
                                view6.animate().rotation(z9 ? 0.0f : 180.0f).setDuration(340L).setInterpolator(s33.h).start();
                                if (onClickListener != null) {
                                    zf2Var.setOnClickListener(onClickListener);
                                    break;
                                }
                            }
                        }
                        break;
                    case 37:
                        ag2 ag2Var2 = (ag2) view;
                        ag2Var2.setPad(G.i);
                        ag2Var2.setUserOrChat((TLObject) G.H);
                        ag2Var2.c(G.e, ag2Var2.a == G.d);
                        ag2Var2.a = G.d;
                        ag2Var2.setNeedDivider(J);
                        break;
                    case 39:
                    case 40:
                        zgb zgbVar = (zgb) view;
                        zgbVar.d(G.m.toString(), G.e, J, zgbVar.a == G.d);
                        zgbVar.getCheckBox().setDrawIconType(G.A);
                        Switch checkBox = zgbVar.getCheckBox();
                        int i17 = G.A == 0 ? bkb.L6 : bkb.q7;
                        int i18 = bkb.M6;
                        int i19 = bkb.c6;
                        checkBox.d(i17, i18, i19, i19);
                        zgbVar.a = G.d;
                        zgbVar.setIcon(G.u ? R.drawable.permission_locked : 0);
                        if (i4 == 40) {
                            if (!TextUtils.isEmpty(G.p)) {
                                zgbVar.a(new l3c(G, zgbVar, (byte) 3), G.p.toString(), G.f);
                                break;
                            } else {
                                LinearLayout linearLayout = zgbVar.f;
                                if (linearLayout != null) {
                                    linearLayout.setVisibility(8);
                                    break;
                                }
                            }
                        }
                        break;
                    case 42:
                        ld5 ld5Var2 = (ld5) view;
                        ld5Var2.c(G.p, ld5Var2.a == G.d);
                        ld5Var2.a = G.d;
                        break;
                    case 43:
                        uib uibVar = (uib) view;
                        uibVar.getValueBackupImageView().setImageDrawable(null);
                        CharSequence charSequence17 = G.m;
                        if (charSequence17 != null) {
                            CharSequence charSequence18 = G.n;
                            if (charSequence18 != null) {
                                uibVar.c(charSequence17, charSequence18, false, J);
                            } else {
                                uibVar.b(charSequence17, J);
                            }
                        }
                        uibVar.setIcon(G.k);
                        break;
                    case 44:
                        ((uy8) view).b(G.m.toString(), G.o.toString(), J, G.e);
                        break;
                }
            } else {
                b4c G4 = c4c.G(i4);
                if (G4 != null) {
                    G4.b(s49Var.a, G, J, this, o39Var instanceof q5c ? (q5c) o39Var : null);
                }
            }
            p8c p8cVar2 = G.G;
            if (p8cVar2 != null) {
                p8cVar2.a(view);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // w39
    public s49 x(ViewGroup viewGroup, int i) {
        View x49Var;
        View ld5Var;
        View ld5Var2;
        View vl7Var;
        int i2;
        ld5 ld5Var3;
        boolean z = this.n;
        int i3 = z ? bkb.g5 : bkb.c6;
        o39 o39Var = this.d;
        wjb wjbVar = this.x;
        Context context = this.e;
        if (i < 10000) {
            int i4 = 8;
            switch (i) {
                case -5:
                    x49Var = new x49(context);
                    x49Var.setTag(-33024);
                    ld5Var = x49Var;
                    break;
                case -4:
                case -1:
                    x49Var = new ar8(context, (byte) 19);
                    if (i == -4) {
                        x49Var.setTag(-33024);
                    }
                    ld5Var = x49Var;
                    break;
                case -3:
                    h5c h5cVar = new h5c(context);
                    h5cVar.a = 0;
                    ld5Var = h5cVar;
                    break;
                case -2:
                    ld5Var = new ar8(context, (byte) 20);
                    break;
                case 0:
                    if (!z) {
                        ld5Var = new ld5(context, wjbVar);
                        break;
                    } else {
                        ld5Var = new ld5(this.e, bkb.K6, 21, 15, 0, false, false, this.x);
                        break;
                    }
                case 1:
                    ld5Var2 = new ld5(this.e, bkb.F6, 17, 15, false, this.x);
                    ld5Var = ld5Var2;
                    break;
                case 2:
                    ld5Var = new otb(context, wjbVar);
                    break;
                case 3:
                    wgb wgbVar = new wgb(context, wjbVar);
                    wgbVar.setCompactLayout(this.s);
                    ld5Var = wgbVar;
                    break;
                case 4:
                case 9:
                    ahb ahbVar = new ahb(context, wjbVar);
                    if (i == 9) {
                        ahbVar.setDrawCheckRipple(true);
                        ahbVar.d(bkb.f6, bkb.N6, bkb.O6, bkb.P6, bkb.Q6);
                        ahbVar.setTypeface(gl.o());
                        ahbVar.setHeight(56);
                    }
                    ld5Var = ahbVar;
                    break;
                case 5:
                case 6:
                    vl7Var = new vl7(this.e, 21, 60, i == 6, this.x);
                    ld5Var = vl7Var;
                    break;
                case 7:
                case 8:
                default:
                    ld5Var = new mhb(context, wjbVar);
                    break;
                case 10:
                    if3 if3Var = new if3(context);
                    if3Var.f = 23;
                    TextView textView = new TextView(context);
                    if3Var.b = textView;
                    zkb.X(textView, bkb.F6, null);
                    ug8.w(textView, 1, 16.0f, 1, 1);
                    textView.setSingleLine(true);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView.setEllipsize(truncateAt);
                    textView.setGravity((k96.a0 ? 5 : 3) | 16);
                    boolean z2 = k96.a0;
                    if3Var.addView(textView, nme.d(-1, -1.0f, (z2 ? 5 : 3) | 48, z2 ? 61.0f : 23.0f, 0.0f, z2 ? 23.0f : 61.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    if3Var.c = textView2;
                    zkb.X(textView2, bkb.H6, null);
                    ug8.w(textView2, 1, 16.0f, 1, 1);
                    textView2.setSingleLine(true);
                    textView2.setEllipsize(truncateAt);
                    textView2.setGravity((k96.a0 ? 3 : 5) | 16);
                    textView2.setVisibility(8);
                    if3Var.addView(textView2, nme.d(-2, -1.0f, (k96.a0 ? 3 : 5) | 48, 23.0f, 0.0f, 23.0f, 0.0f));
                    RadioButton radioButton = new RadioButton(context);
                    if3Var.d = radioButton;
                    radioButton.setSize(gl.L(20.0f));
                    zkb.O(radioButton, bkb.f7, bkb.g7, null);
                    if3Var.addView(radioButton, nme.d(22, 22.0f, (k96.a0 ? 3 : 5) | 48, 20.0f, 15.0f, 20.0f, 0.0f));
                    if3Var.b();
                    if3Var.setHorizontalPadding(21);
                    ld5Var = if3Var;
                    break;
                case 11:
                case 12:
                    v6c v6cVar = new v6c(context, 6, i != 12 ? 0 : 3, false);
                    v6cVar.setSelfAsSavedMessages(true);
                    ld5Var = v6cVar;
                    break;
                case 13:
                    ld5Var2 = new v6c(6, 0, null, this.e, false, true);
                    ld5Var = ld5Var2;
                    break;
                case 14:
                    ld5Var = new fja(context, wjbVar);
                    break;
                case 15:
                    ld5Var = new ija(context, wjbVar);
                    break;
                case 16:
                    ld5Var = new jx8(wjbVar, context, this.N != null);
                    break;
                case 17:
                    ld5Var = new ix8(context, wjbVar);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    if (this.F == null) {
                        this.F = new mf0((wjb) null);
                    }
                    vl7Var = new sxa(this.e, this.f, i - 18, this.F, this.h);
                    ld5Var = vl7Var;
                    break;
                case 24:
                    ld5Var = new xi1(context, wjbVar);
                    break;
                case 25:
                    ld5Var = new yi1(context, wjbVar);
                    break;
                case 26:
                    ld5 ld5Var4 = new ld5(this.e, bkb.F6, 23, 20, 0, false, false, this.x);
                    ld5Var4.setTextSize(20.0f);
                    ld5Var3 = ld5Var4;
                    ld5Var = ld5Var3;
                    break;
                case 27:
                    x5b x5bVar = new x5b(context, wjbVar);
                    x5bVar.d(false, false);
                    ld5Var = x5bVar;
                    break;
                case 28:
                    x49Var = new j5c(context);
                    x49Var.setTag(-33024);
                    ld5Var = x49Var;
                    break;
                case 29:
                    ld5Var = new d41(context, wjbVar);
                    break;
                case kk7.S /* 30 */:
                    ld5Var = new aib(context, wjbVar);
                    break;
                case 31:
                    if (o39Var != null && o39Var.c1()) {
                        l35 l35Var = new l35(28, wjbVar, context);
                        l35Var.setNoBackground(true);
                        ld5Var = l35Var;
                        break;
                    } else {
                        ld5Var = new l35(context, wjbVar);
                        break;
                    }
                    break;
                case 32:
                    ld5Var = new rr8(context, null);
                    break;
                case 33:
                    ld5Var = new ue3(context, true);
                    break;
                case 34:
                    pi4 pi4Var = new pi4(context, wjbVar);
                    pi4Var.setIsSingleCell(true);
                    ld5Var = pi4Var;
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
                        ag2 ag2Var = new ag2(this.e, i2, 21, true, this.x);
                        ag2Var.getCheckBoxRound().b(bkb.U6, bkb.f7, bkb.j7);
                        ld5Var3 = ag2Var;
                        ld5Var = ld5Var3;
                        break;
                    } else {
                        i4 = 4;
                    }
                    i2 = i4;
                    ag2 ag2Var2 = new ag2(this.e, i2, 21, true, this.x);
                    ag2Var2.getCheckBoxRound().b(bkb.U6, bkb.f7, bkb.j7);
                    ld5Var3 = ag2Var2;
                    ld5Var = ld5Var3;
                case 38:
                    ld5Var = new rk2(context, wjbVar);
                    break;
                case 39:
                case 40:
                    ld5Var = new zgb(context);
                    break;
                case 42:
                    ld5Var3 = new ld5(this.e, bkb.K6, 21, 15, 0, false, true, this.x);
                    ld5Var = ld5Var3;
                    break;
                case 43:
                    ld5Var = new uib(0, wjbVar, context);
                    break;
                case 44:
                    ld5Var = new uy8(context, false);
                    break;
            }
        } else {
            b4c G = c4c.G(i);
            ld5Var = G != null ? G.d(context, o39Var, this.f, wjbVar) : new View(context);
        }
        if (N(i)) {
            zkb.h(i3, this.P, ld5Var);
        }
        return new y29(ld5Var);
    }

    @Override // w39
    public void y(s49 s49Var) {
        R(s49Var, this.O);
        P(s49Var);
    }
}
