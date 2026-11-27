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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public class l9c extends la {
    public of0 F;
    public i9c J;
    public i9c K;
    public int L;
    public boolean M;
    public icc N;
    public boolean O;
    public final d79 d;
    public final Context e;
    public final int f;
    public final int h;
    public final boolean n;
    public boolean s;
    public icc w;
    public final vnb x;
    public boolean r = true;
    public final ArrayList y = new ArrayList();
    public final ArrayList E = new ArrayList();
    public boolean G = false;
    public final ArrayList H = new ArrayList();
    public final ArrayList I = new ArrayList();
    public final gd P = new gd(this, 5);

    public l9c(d79 d79Var, Context context, int i, int i2, boolean z, icc iccVar, vnb vnbVar) {
        this.d = d79Var;
        this.e = context;
        this.f = i;
        this.h = i2;
        this.n = z;
        this.w = iccVar;
        this.x = vnbVar;
        O(false);
    }

    public static boolean K(int i) {
        if (i < 10000) {
            return i == 7 || i == 8 || i == 38 || i == 31 || i == -4 || i == 28 || i == 2 || i == -2;
        }
        a8c G = b8c.G(i);
        return G != null && G.g();
    }

    @Override // c79
    public boolean D(f89 f89Var) {
        int i = f89Var.f;
        b8c G = G(f89Var.b());
        if (i >= 10000) {
            a8c G2 = b8c.G(i);
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
                i9c i9cVar = (i9c) arrayList.get(i);
                this.N.a(Integer.valueOf(i), new ArrayList(this.E.subList(i9cVar.a, i9cVar.b + 1)));
                this.M = false;
            }
        }
    }

    public final b8c G(int i) {
        if (i < 0) {
            return null;
        }
        ArrayList arrayList = this.E;
        if (i < arrayList.size()) {
            return (b8c) arrayList.get(i);
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
            i9c i9cVar = (i9c) arrayList.get(i2);
            if (i >= i9cVar.a && i <= i9cVar.b) {
                return i2;
            }
            i2++;
        }
    }

    public int I(int i) {
        return aob.v0(i, this.x);
    }

    public final boolean J(int i) {
        b8c G = G(i);
        b8c G2 = G(i + 1);
        return (G == null || G.j || G2 == null || K(G2.a) != K(G.a)) ? false : true;
    }

    public final void L() {
        i9c i9cVar = this.K;
        if (i9cVar != null) {
            i9cVar.b = Math.max(0, this.E.size() - 1);
        }
    }

    public final int M() {
        i9c i9cVar = new i9c();
        this.K = i9cVar;
        i9cVar.a = this.E.size();
        i9c i9cVar2 = this.K;
        i9cVar2.b = -1;
        this.I.add(i9cVar2);
        return r2.size() - 1;
    }

    public final boolean N(int i) {
        if (!this.r) {
            return false;
        }
        d79 d79Var = this.d;
        if (d79Var != null && d79Var.d1() && d79Var.getSectionsDrawBackground()) {
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
            case jn7.S /* 30 */:
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
        d79 d79Var = this.d;
        if (d79Var == null || !d79Var.e0()) {
            Q(z);
        } else {
            d79Var.post(new q38((byte) 24, (Object) this, z));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void P(f89 f89Var) {
        View view = f89Var.a;
        if (view instanceof snb) {
            ((snb) view).updateColors();
            Object tag = view.getTag(R.id.theme_generation);
            int i = yob.b;
            if (N(f89Var.f) && (!(tag instanceof Integer) || ((Integer) tag).intValue() != i)) {
                view.setBackgroundColor(I(this.n ? aob.h5 : aob.d6));
            }
            view.setTag(R.id.theme_generation, Integer.valueOf(i));
        }
    }

    public final void Q(boolean z) {
        d79 d79Var = this.d;
        if (d79Var == null || !d79Var.e0()) {
            ArrayList arrayList = this.y;
            arrayList.clear();
            ArrayList arrayList2 = this.E;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            this.J = null;
            this.H.clear();
            this.I.clear();
            icc iccVar = this.w;
            if (iccVar != null) {
                iccVar.a(arrayList2, this);
                S();
                if (z) {
                    E(arrayList, arrayList2);
                } else {
                    f();
                }
            }
        }
    }

    public final void R(f89 f89Var, boolean z) {
        if (f89Var != null) {
            View view = f89Var.a;
            int i = f89Var.f;
            if (i < 10000) {
                if (i != 16) {
                    return;
                }
                ((w09) view).setReorder(z);
            } else {
                a8c G = b8c.G(i);
                if (G != null) {
                    G.a(this.d, view, G(f89Var.b()));
                }
            }
        }
    }

    public final void S() {
        d79 d79Var = this.d;
        if (d79Var != null) {
            ArrayList arrayList = d79Var.L2;
            if (arrayList == null) {
                d79Var.L2 = new ArrayList();
            } else {
                arrayList.clear();
            }
            ArrayList arrayList2 = this.H;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                i9c i9cVar = (i9c) obj;
                d79Var.L2.add(Long.valueOf(hl.u2(i9cVar.a, i9cVar.b)));
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
        icc iccVar = this.w;
        if (iccVar != null) {
            iccVar.a(arrayList2, this);
        }
        S();
    }

    public final void U() {
        i9c i9cVar = this.J;
        if (i9cVar != null) {
            i9cVar.b = Math.max(0, (this.E.size() + (this.G ? 1 : 0)) - 1);
            i9c i9cVar2 = this.J;
            if (i9cVar2.a == i9cVar2.b) {
                this.H.remove(i9cVar2);
            }
            this.J = null;
        }
    }

    public final void V() {
        i9c i9cVar = new i9c();
        this.J = i9cVar;
        i9cVar.a = this.E.size() + (this.G ? 1 : 0);
        i9c i9cVar2 = this.J;
        i9cVar2.b = -1;
        this.H.add(i9cVar2);
    }

    @Override // j79
    public final int b() {
        return this.E.size();
    }

    @Override // j79
    public final int d(int i) {
        b8c G = G(i);
        if (G == null) {
            return 0;
        }
        return G.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0230  */
    @Override // j79
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void t(f89 f89Var, int i) {
        String str;
        ilb ilbVar;
        ImageReceiver imageReceiver;
        long j;
        jn5 jn5Var;
        String str2;
        b8c b8cVar;
        long j2;
        boolean z;
        char c;
        long j3;
        CharSequence concat;
        int i2;
        int i3 = this.f;
        d79 d79Var = this.d;
        vnb vnbVar = this.x;
        b8c G = G(i);
        b8c G2 = G(i + 1);
        b8c G3 = G(i - 1);
        if (G != null) {
            int i4 = f89Var.f;
            View view = f89Var.a;
            boolean J = J(i);
            P(f89Var);
            if (i4 < 10000) {
                long j4 = 0;
                byte b = 2;
                str = "";
                byte b2 = 1;
                switch (i4) {
                    case -5:
                        k89 k89Var = (k89) view;
                        if (k89Var.getChildCount() != (G.c == null ? 0 : 1) || k89Var.getChildAt(0) != G.c) {
                            k89Var.removeAllViews();
                            View view2 = G.c;
                            if (view2 != null) {
                                hl.B2(view2);
                                k89Var.addView(G.c, tre.c(-1.0f, -1));
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
                                hl.B2(view3);
                                frameLayout.addView(G.c, (i4 == -1 || i4 == -4) ? tre.c(G.A, -1) : tre.c(-2.0f, -2));
                                break;
                            }
                        }
                        break;
                    case -3:
                        h9c h9cVar = (h9c) view;
                        h9cVar.setMinusHeight(G.A);
                        h9cVar.setMinusPadding(vsd.a(G.z, 1));
                        if (h9cVar.getChildCount() != (G.c == null ? 0 : 1) || h9cVar.getChildAt(0) != G.c) {
                            h9cVar.removeAllViews();
                            View view4 = G.c;
                            if (view4 != null) {
                                hl.B2(view4);
                                h9cVar.addView(G.c, tre.c(-1.0f, -1));
                                break;
                            }
                        }
                        break;
                    case 0:
                    case 1:
                    case 26:
                        mf5 mf5Var = (mf5) view;
                        mf5Var.setText(G.m);
                        mf5Var.b(G.g);
                        break;
                    case 2:
                        pxb pxbVar = (pxb) view;
                        int i5 = G.k;
                        if (i5 == 0) {
                            int i6 = G.A;
                            if (i6 != 0) {
                                pxbVar.setEmojiSize(i6);
                            }
                            String charSequence = G.n.toString();
                            String charSequence2 = G.o.toString();
                            pxbVar.getClass();
                            ls6.d0(yac.t0).e2(pxbVar.b, charSequence, charSequence2, "90_90");
                        } else if (G.r) {
                            pxbVar.setEmojiStatic(i5);
                        } else {
                            pxbVar.setEmoji(i5);
                        }
                        boolean isEmpty = TextUtils.isEmpty(G.p);
                        CharSequence charSequence3 = G.m;
                        if (!isEmpty) {
                            pxbVar.a(charSequence3, G.p);
                            break;
                        } else {
                            pxbVar.setText(charSequence3);
                            break;
                        }
                    case 3:
                        skb skbVar = (skb) view;
                        Object obj = G.H;
                        if (obj instanceof TLRPC.Document) {
                            CharSequence charSequence4 = G.m;
                            TLRPC.Document document = (TLRPC.Document) obj;
                            skbVar.x = skbVar.getDefaultImageLeft();
                            skbVar.s = skbVar.c(false);
                            ema emaVar = skbVar.a;
                            emaVar.l(charSequence4, false);
                            emaVar.i(null);
                            in inVar = skbVar.c;
                            skbVar.R = null;
                            inVar.c(null, false, true);
                            skbVar.h.setVisibility(8);
                            inVar.setVisibility(8);
                            skbVar.d.setVisibility(8);
                            e29 e29Var = skbVar.e;
                            e29Var.setVisibility(8);
                            e29Var.setPadding(0, hl.L(7.0f), 0, 0);
                            skbVar.r = J;
                            skbVar.setWillNotDraw(!J);
                            Switch r0 = skbVar.f;
                            if (r0 != null) {
                                r0.setVisibility(8);
                            }
                            skbVar.setValueSticker(document);
                        } else if (obj instanceof String) {
                            CharSequence charSequence5 = G.m;
                            String str3 = (String) obj;
                            skbVar.x = skbVar.getDefaultImageLeft();
                            skbVar.s = skbVar.c(false);
                            ema emaVar2 = skbVar.a;
                            emaVar2.l(charSequence5, false);
                            emaVar2.i(null);
                            in inVar2 = skbVar.c;
                            skbVar.R = null;
                            inVar2.c(null, false, true);
                            skbVar.h.setVisibility(8);
                            inVar2.setVisibility(8);
                            skbVar.d.setVisibility(8);
                            e29 e29Var2 = skbVar.e;
                            e29Var2.setVisibility(8);
                            e29Var2.setPadding(0, hl.L(7.0f), 0, 0);
                            skbVar.r = J;
                            skbVar.setWillNotDraw(!J);
                            Switch r02 = skbVar.f;
                            if (r02 != null) {
                                r02.setVisibility(8);
                            }
                            skbVar.setValueSticker(str3);
                        } else {
                            boolean isEmpty2 = TextUtils.isEmpty(G.o);
                            Object obj2 = G.H;
                            if (isEmpty2) {
                                if (obj2 instanceof Drawable) {
                                    skbVar.p(G.m, (Drawable) obj2, J);
                                } else {
                                    int i7 = G.k;
                                    CharSequence charSequence6 = G.m;
                                    if (i7 == 0) {
                                        skbVar.k(charSequence6, J);
                                    } else {
                                        skbVar.o(i7, charSequence6, J);
                                    }
                                }
                            } else if (obj2 instanceof Drawable) {
                                skbVar.t(G.m, G.o, (Drawable) obj2, J);
                            } else {
                                int i8 = G.k;
                                CharSequence charSequence7 = G.m;
                                CharSequence charSequence8 = G.o;
                                if (i8 == 0) {
                                    skbVar.q(charSequence7, charSequence8, false, J);
                                } else {
                                    skbVar.u(charSequence7, charSequence8, false, i8, J);
                                }
                            }
                        }
                        if (G.r) {
                            int i9 = aob.q6;
                            skbVar.g(i9, i9);
                        } else if (G.s) {
                            skbVar.g(aob.q7, aob.p7);
                        } else {
                            skbVar.g(aob.m6, aob.G6);
                        }
                        skbVar.h(45, G.u, true);
                        skbVar.i(G.g, true);
                        break;
                    case 4:
                    case 9:
                        wkb wkbVar = (wkb) view;
                        if (wkbVar.b == G.d) {
                            wkbVar.setChecked(G.e);
                        }
                        wkbVar.e(null, G.g);
                        wkbVar.f(G.m, G.e, J);
                        wkbVar.b = G.d;
                        if (i4 == 9) {
                            yob.h(G.e ? aob.f6 : aob.e6, null, view);
                            break;
                        }
                        break;
                    case 5:
                        uo7 uo7Var = (uo7) view;
                        CharSequence charSequence9 = G.n;
                        uo7Var.b(G.m, G.n, 0, G.e, 0, charSequence9 != null && charSequence9.toString().contains("\n"), J, false);
                        break;
                    case 6:
                        ((uo7) view).b(G.m, G.n, 0, G.e, 0, false, J, false);
                        break;
                    case 7:
                    case 8:
                    case 38:
                        if (i4 == 7 || i4 == 8) {
                            ilb ilbVar2 = (ilb) view;
                            if (TextUtils.isEmpty(G.m)) {
                                ilbVar2.setFixedSize(i4 == 8 ? jn7.w3 : 12);
                                ilbVar2.setText("");
                            } else {
                                ilbVar2.setFixedSize(0);
                                ilbVar2.setText(G.m);
                            }
                            if (G.r) {
                                ilbVar2.setTextGravity(17);
                                ilbVar2.getTextView().setWidth(Math.min(kg5.a(ilbVar2.getText(), ilbVar2.getTextView().getPaint()), hl.q.x - hl.L(60.0f)));
                                ilbVar2.getTextView().setPadding(0, hl.L(17.0f), 0, hl.L(17.0f));
                                ilbVar = ilbVar2;
                            } else {
                                ilbVar2.setTextGravity(8388611);
                                ilbVar2.getTextView().setMinWidth(0);
                                ilbVar2.getTextView().setMaxWidth(hl.q.x);
                                ilbVar2.getTextView().setPadding(0, hl.L(10.0f), 0, hl.L(17.0f));
                                ilbVar = ilbVar2;
                            }
                        } else if (i4 == 38) {
                            ll2 ll2Var = (ll2) view;
                            CharSequence charSequence10 = G.p;
                            boolean z2 = G.f;
                            ll2Var.a.setText(charSequence10);
                            View view5 = ll2Var.b;
                            view5.animate().cancel();
                            view5.animate().rotation(z2 ? 0.0f : 180.0f).setDuration(340L).setInterpolator(k43.h).start();
                            if (G.r) {
                                ll2Var.setColor(aob.q6);
                                ilbVar = ll2Var;
                            } else if (G.s) {
                                ll2Var.setColor(aob.p7);
                                ilbVar = ll2Var;
                            } else {
                                ll2Var.setColor(aob.G6);
                                ilbVar = ll2Var;
                            }
                        } else {
                            ilbVar = null;
                        }
                        boolean z3 = (G3 == null || K(G3.a)) ? false : true;
                        boolean z4 = (G2 == null || K(G2.a)) ? false : true;
                        if (!d79Var.d1()) {
                            Drawable V0 = aob.V0(this.e, z3 ? z4 ? R.drawable.greydivider : R.drawable.greydivider_bottom : z4 ? R.drawable.greydivider_top : R.drawable.field_carret_empty, aob.v0(aob.b7, vnbVar));
                            if (!this.n) {
                                ilbVar.setBackground(V0);
                                break;
                            } else {
                                int i10 = aob.i5;
                                ilbVar.setBackground(new LayerDrawable(new Drawable[]{I(i10) == aob.v0(i10, vnbVar) ? new k9c(i10, vnbVar) : new ColorDrawable(I(i10)), V0}));
                                break;
                            }
                        } else {
                            ilbVar.setBackground(null);
                            break;
                        }
                        break;
                    case 10:
                        cg3 cg3Var = (cg3) view;
                        int i11 = cg3Var.a;
                        TextView textView = cg3Var.b;
                        TextView textView2 = cg3Var.c;
                        RadioButton radioButton = cg3Var.d;
                        if (i11 == G.d) {
                            radioButton.a(G.e, true);
                            cg3Var.a(G.g, true);
                        } else {
                            cg3Var.a(G.g, false);
                        }
                        boolean isEmpty3 = TextUtils.isEmpty(G.o);
                        CharSequence charSequence11 = G.m;
                        if (isEmpty3) {
                            boolean z5 = G.e;
                            textView2.setVisibility(8);
                            textView.setText(charSequence11);
                            radioButton.a(z5, false);
                            cg3Var.e = J;
                            cg3Var.b();
                            cg3Var.setWillNotDraw(!J);
                        } else {
                            CharSequence charSequence12 = G.o;
                            boolean z6 = G.e;
                            textView2.setVisibility(0);
                            textView2.setText(charSequence12);
                            textView.setText(charSequence11);
                            radioButton.a(z6, false);
                            cg3Var.e = J;
                            cg3Var.b();
                            cg3Var.setWillNotDraw(!J);
                        }
                        cg3Var.a = G.d;
                        break;
                    case 11:
                    case 12:
                        vac vacVar = (vac) view;
                        vacVar.g(i3, G, J);
                        if (i4 == 12) {
                            vacVar.c(G.e, false);
                            break;
                        }
                        break;
                    case 13:
                        vac vacVar2 = (vac) view;
                        vacVar2.g(i3, G, J);
                        CharSequence charSequence13 = G.o;
                        vacVar2.setQuery(charSequence13 == null ? null : charSequence13.toString().toLowerCase());
                        vacVar2.setAddButtonVisible(!G.e);
                        vacVar2.setCloseIcon(G.E);
                        break;
                    case 14:
                        zma zmaVar = (zma) view;
                        zmaVar.b(G.A, null, G.q);
                        zmaVar.setMinAllowedIndex((int) G.C);
                        zmaVar.setCallback(new ftb(G, (byte) 4));
                        break;
                    case 15:
                        bna bnaVar = (bna) view;
                        bnaVar.d(G.A, (ana) G.H, G.D);
                        bnaVar.setMinValueAllowed((int) G.C);
                        break;
                    case 16:
                        w09 w09Var = (w09) view;
                        w09Var.d.a(G.e, false);
                        w09Var.setReorder(this.O);
                        Object obj3 = G.H;
                        if (obj3 instanceof a19) {
                            w09Var.a((a19) obj3, null, J);
                            break;
                        }
                        break;
                    case 17:
                        v09 v09Var = (v09) view;
                        v09Var.e.a(G.e, false);
                        Object obj4 = G.H;
                        if (obj4 instanceof a19) {
                            a19 a19Var = (a19) obj4;
                            rb0 rb0Var = v09Var.a;
                            int[] iArr = v09Var.r;
                            TextView textView3 = v09Var.d;
                            ImageReceiver imageReceiver2 = v09Var.b;
                            int i12 = yac.t0;
                            v09Var.c.setText(uc7.s1(i12).A1(yac.h(i12).e(), false));
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            r47 r47Var = a19Var.e;
                            if (r47Var != null) {
                                spannableStringBuilder.append(pv3.m(r47Var.v, textView3.getPaint().getFontMetricsInt(), false, null, 0));
                            }
                            if (a19Var.a() > 1) {
                                spannableStringBuilder.append((CharSequence) "  ");
                                int L = hl.q.x - hl.L(80.0f);
                                int a = a19Var.a() - 1;
                                int i13 = t0.d;
                                SpannableString spannableString = new SpannableString("+");
                                t0 t0Var = new t0(a);
                                iArr[0] = (int) (((pkb) t0Var.c).c + hl.L(10.0f));
                                spannableString.setSpan(t0Var, 0, spannableString.length(), 33);
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(TextUtils.ellipsize(spannableStringBuilder, textView3.getPaint(), (L * 1.5f) - iArr[0], TextUtils.TruncateAt.END));
                                if (spannableStringBuilder2.length() > 0 && spannableStringBuilder2.charAt(spannableStringBuilder2.length() - 1) == 8230) {
                                    spannableStringBuilder2.append((CharSequence) "  ");
                                }
                                spannableStringBuilder2.append((CharSequence) spannableString);
                                spannableStringBuilder = spannableStringBuilder2;
                            }
                            textView3.setText(spannableStringBuilder);
                            TLRPC.MessageMedia m1 = r47.m1(a19Var.e);
                            if (m1 != null) {
                                TLRPC.Photo photo = m1.photo;
                                if (photo != null) {
                                    TLRPC.PhotoSize w = xb4.w(photo.sizes, hl.L(36.0f), true, null, true);
                                    jn5 f = jn5.f(w, m1.photo);
                                    r47 r47Var2 = a19Var.e;
                                    imageReceiver2.c0(f, "36_36", r47Var2.I1, w == null ? 0L : w.size, null, r47Var2, 0);
                                    imageReceiver2.q0(hl.L(6.0f));
                                } else {
                                    ImageReceiver imageReceiver3 = imageReceiver2;
                                    TLRPC.Document document2 = m1.document;
                                    imageReceiver = imageReceiver3;
                                    if (document2 != null) {
                                        TLRPC.PhotoSize w2 = xb4.w(document2.thumbs, hl.L(36.0f), true, null, true);
                                        TLRPC.Document document3 = m1.document;
                                        if (w2 == null) {
                                            jn5 b3 = jn5.b(document3);
                                            j = m1.document.size;
                                            str2 = "g";
                                            jn5Var = b3;
                                        } else {
                                            jn5 f2 = jn5.f(w2, document3);
                                            j = w2.size;
                                            jn5Var = f2;
                                            str2 = "36_36";
                                        }
                                        long j5 = j;
                                        r47 r47Var3 = a19Var.e;
                                        imageReceiver3.c0(jn5Var, str2, r47Var3.I1, j5, null, r47Var3, 0);
                                        imageReceiver3.q0(hl.L(6.0f));
                                    }
                                }
                                v09Var.s = J;
                                v09Var.invalidate();
                                break;
                            } else {
                                imageReceiver = imageReceiver2;
                            }
                            rb0Var.q(yac.h(i12).f());
                            imageReceiver.U(yac.h(i12).f(), rb0Var, null);
                            imageReceiver.q0(hl.L(56.0f));
                            v09Var.s = J;
                            v09Var.invalidate();
                        }
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        u1b u1bVar = (u1b) view;
                        int i14 = G.A;
                        i1b i1bVar = (i1b) G.H;
                        vo1 vo1Var = new vo1(this, G, b);
                        u1bVar.y = i14;
                        u1bVar.E = vo1Var;
                        u1bVar.e(i1bVar, false);
                        break;
                    case 24:
                        ((gj1) view).set((fj1) G.H);
                        break;
                    case 25:
                        hj1 hj1Var = (hj1) view;
                        TL_stats.BroadcastRevenueTransaction broadcastRevenueTransaction = (TL_stats.BroadcastRevenueTransaction) G.H;
                        gm gmVar = hj1Var.b;
                        vnb vnbVar2 = hj1Var.a;
                        TextView textView4 = hj1Var.c;
                        TextView textView5 = hj1Var.d;
                        if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionWithdrawal) {
                            TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
                            textView4.setText(ob6.M0(2131748109, null));
                            if (tL_broadcastRevenueTransactionWithdrawal.pending) {
                                textView5.setText(ob6.M0(2131748112, null));
                                z = false;
                                b8cVar = G;
                            } else {
                                z = tL_broadcastRevenueTransactionWithdrawal.failed;
                                b8cVar = G;
                                textView5.setText(ob6.Q(tL_broadcastRevenueTransactionWithdrawal.date).concat(z ? " — ".concat(ob6.M0(2131748113, null)) : ""));
                            }
                            j2 = tL_broadcastRevenueTransactionWithdrawal.amount;
                            c = 65535;
                        } else {
                            b8cVar = G;
                            if (!(broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionProceeds)) {
                                if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionRefund) {
                                    textView4.setText(ob6.M0(2131748110, null));
                                    textView5.setText(ob6.Q(r4.from_date));
                                    j2 = ((TL_stats.TL_broadcastRevenueTransactionRefund) broadcastRevenueTransaction).amount;
                                }
                                G = b8cVar;
                                break;
                            } else {
                                textView4.setText(ob6.M0(2131748111, null));
                                textView5.setText(ob6.Q(r4.from_date) + " - " + ob6.Q(r4.to_date));
                                j2 = ((TL_stats.TL_broadcastRevenueTransactionProceeds) broadcastRevenueTransaction).amount;
                            }
                            z = false;
                            c = 1;
                        }
                        yob.X(textView5, z ? aob.p7 : aob.y6, vnbVar2);
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                        spannableStringBuilder3.append((CharSequence) (c < 0 ? "-" : "+"));
                        spannableStringBuilder3.append((CharSequence) "TON ");
                        spannableStringBuilder3.append((CharSequence) hj1Var.e.format(Math.abs(j2) / 1.0E9d));
                        int indexOf = TextUtils.indexOf(spannableStringBuilder3, ".");
                        if (indexOf >= 0) {
                            spannableStringBuilder3.setSpan(new RelativeSizeSpan(1.15f), 0, indexOf + 1, 33);
                        }
                        gmVar.setText(ij1.L(spannableStringBuilder3, gmVar.getPaint(), 1.1f, hl.L(0.33f), false));
                        yob.X(gmVar, c < 0 ? aob.q7 : aob.l8, vnbVar2);
                        hj1Var.f = J;
                        hj1Var.setWillNotDraw(!J);
                        G = b8cVar;
                    case 27:
                        v9b v9bVar = (v9b) view;
                        long j6 = v9bVar.y;
                        Object obj5 = G.H;
                        if (!(obj5 instanceof TLRPC.User)) {
                            if (obj5 instanceof TLRPC.Chat) {
                                j3 = -((TLRPC.Chat) obj5).id;
                            }
                            boolean z7 = j6 != j4;
                            v9bVar.d(false, true);
                            v9bVar.set(G.H);
                            v9bVar.f.setVisibility(8);
                            v9bVar.h.setVisibility(0);
                            v9bVar.c(G.e, z7);
                            v9bVar.setDivider(J);
                            break;
                        } else {
                            j3 = ((TLRPC.User) obj5).id;
                        }
                        j4 = j3;
                        if (j6 != j4) {
                        }
                        v9bVar.d(false, true);
                        v9bVar.set(G.H);
                        v9bVar.f.setVisibility(8);
                        v9bVar.h.setVisibility(0);
                        v9bVar.c(G.e, z7);
                        v9bVar.setDivider(J);
                    case 28:
                        if (G.t) {
                            yob.q(view);
                            view.setBackgroundColor(0);
                        } else if (G.k != 0) {
                            yob.q(view);
                            view.setBackgroundColor(G.k);
                        }
                        view.setId(G.d);
                        ((j9c) view).setHeight(G.A);
                        break;
                    case 29:
                        l41 l41Var = (l41) view;
                        Object obj6 = G.H;
                        if (obj6 instanceof m41) {
                            ema emaVar3 = l41Var.c;
                            tpa tpaVar = l41Var.b;
                            l41Var.e = J;
                            TL_account.TL_businessChatLink tL_businessChatLink = ((m41) obj6).a;
                            l41Var.f = tL_businessChatLink;
                            boolean isEmpty4 = TextUtils.isEmpty(tL_businessChatLink.title);
                            ema emaVar4 = l41Var.a;
                            TL_account.TL_businessChatLink tL_businessChatLink2 = l41Var.f;
                            if (isEmpty4) {
                                String str4 = tL_businessChatLink2.link;
                                r41[] r41VarArr = r41.e;
                                if (str4.startsWith("https://")) {
                                    str4 = str4.substring(8);
                                }
                                emaVar4.l(str4, false);
                            } else {
                                emaVar4.l(tL_businessChatLink2.title, false);
                            }
                            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(l41Var.f.message);
                            TL_account.TL_businessChatLink tL_businessChatLink3 = l41Var.f;
                            ls6.h(tL_businessChatLink3.entities, tL_businessChatLink3.message, spannableStringBuilder4, -1);
                            CharSequence m = pv3.m(spannableStringBuilder4, tpaVar.getPaint().getFontMetricsInt(), false, null, 0);
                            r47.A5(m, l41Var.f.entities, tpaVar.getPaint().getFontMetricsInt(), false);
                            tpaVar.setText(m);
                            int i15 = l41Var.f.views;
                            if (i15 == 0) {
                                emaVar3.l(ob6.a0(null, null, 2131747958, new Object[0]), false);
                            } else {
                                emaVar3.l(ob6.G(i15, "Clicks", new Object[0]), false);
                            }
                            emaVar3.requestLayout();
                            l41Var.invalidate();
                            break;
                        }
                        break;
                    case jn7.S /* 30 */:
                        wlb wlbVar = (wlb) view;
                        CharSequence charSequence14 = G.m;
                        int i16 = G.k;
                        wlbVar.b.l(charSequence14, false);
                        wlbVar.a.setImageResource(i16);
                        wlbVar.setDivider(J);
                        yob.h(aob.h5, this.P, wlbVar);
                        break;
                    case 31:
                        p55 p55Var = (p55) view;
                        if (!TextUtils.equals(p55Var.getText(), G.m)) {
                            p55Var.b(G.m, G.n, G.E);
                            break;
                        } else {
                            p55Var.a(G.n, G.E);
                            break;
                        }
                    case 32:
                        bv8 bv8Var = (bv8) view;
                        Object obj7 = G.H;
                        if (G.r && (obj7 instanceof TLRPC.User) && (i2 = ((TLRPC.User) obj7).bot_active_users) != 0) {
                            if (i2 != 0) {
                                concat = ob6.H(' ', "BotUsers", i2);
                                if (!(obj7 instanceof TLRPC.Chat)) {
                                }
                                String str5 = str;
                                boolean z8 = G.u;
                                Object obj8 = G.I;
                                if (obj8 instanceof pcc) {
                                }
                                bv8Var.D0 = z8;
                                bv8Var.E0 = r11;
                                bv8Var.setRectangularAvatar(G.s);
                                CharSequence charSequence15 = G.n;
                                bv8Var.C(obj7, null, str5, charSequence15 == null ? charSequence15 : concat, false, false);
                                bv8Var.A(G.e, false);
                                bv8Var.N = J;
                            }
                            concat = "";
                            if (!(obj7 instanceof TLRPC.Chat)) {
                            }
                            String str52 = str;
                            boolean z82 = G.u;
                            Object obj82 = G.I;
                            if (obj82 instanceof pcc) {
                            }
                            bv8Var.D0 = z82;
                            bv8Var.E0 = r11;
                            bv8Var.setRectangularAvatar(G.s);
                            CharSequence charSequence152 = G.n;
                            bv8Var.C(obj7, null, str52, charSequence152 == null ? charSequence152 : concat, false, false);
                            bv8Var.A(G.e, false);
                            bv8Var.N = J;
                        } else {
                            if (G.J) {
                                String p = obj7 instanceof TLRPC.User ? lbc.p((TLRPC.User) obj7) : obj7 instanceof TLRPC.Chat ? xc2.K((TLRPC.Chat) obj7, false) : null;
                                if (p != null) {
                                    concat = "@".concat(p);
                                    if (!(obj7 instanceof TLRPC.Chat)) {
                                        TLRPC.Chat chat = (TLRPC.Chat) obj7;
                                        if (chat.participants_count != 0) {
                                            String H = (!xc2.T(chat) || chat.megagroup) ? ob6.H(' ', "Members", chat.participants_count) : ob6.H(' ', "Subscribers", chat.participants_count);
                                            concat = !TextUtils.isEmpty(concat) ? TextUtils.concat(concat, ", ", H) : H;
                                        }
                                        str = chat.title;
                                    } else if (obj7 instanceof TLRPC.User) {
                                        str = lbc.r((TLRPC.User) obj7);
                                    }
                                    String str522 = str;
                                    boolean z822 = G.u;
                                    Object obj822 = G.I;
                                    pcc pccVar = obj822 instanceof pcc ? (pcc) obj822 : null;
                                    bv8Var.D0 = z822;
                                    bv8Var.E0 = pccVar;
                                    bv8Var.setRectangularAvatar(G.s);
                                    CharSequence charSequence1522 = G.n;
                                    bv8Var.C(obj7, null, str522, charSequence1522 == null ? charSequence1522 : concat, false, false);
                                    bv8Var.A(G.e, false);
                                    bv8Var.N = J;
                                    break;
                                }
                            }
                            concat = "";
                            if (!(obj7 instanceof TLRPC.Chat)) {
                            }
                            String str5222 = str;
                            boolean z8222 = G.u;
                            Object obj8222 = G.I;
                            if (obj8222 instanceof pcc) {
                            }
                            bv8Var.D0 = z8222;
                            bv8Var.E0 = pccVar;
                            bv8Var.setRectangularAvatar(G.s);
                            CharSequence charSequence15222 = G.n;
                            bv8Var.C(obj7, null, str5222, charSequence15222 == null ? charSequence15222 : concat, false, false);
                            bv8Var.A(G.e, false);
                            bv8Var.N = J;
                        }
                        break;
                    case 33:
                        of3 of3Var = (of3) view;
                        Object obj9 = G.H;
                        r47 r47Var4 = obj9 instanceof r47 ? (r47) obj9 : null;
                        of3Var.t2 = J;
                        if (r47Var4 != null) {
                            of3Var.e0(r47.B0(r47Var4.k), r47Var4, r47Var4.k.date, false, false);
                            break;
                        } else {
                            of3Var.e0(0L, null, 0, false, false);
                            break;
                        }
                    case 34:
                        ((tk4) view).setViewType(G.A);
                        break;
                    case 35:
                    case 36:
                    case 41:
                        sg2 sg2Var = (sg2) view;
                        sg2Var.setPad(G.i);
                        sg2Var.e(G.m, "", G.e, J, sg2Var.a == G.d);
                        sg2Var.a = G.d;
                        sg2Var.setIcon(G.u ? R.drawable.permission_locked : 0);
                        if (i4 == 36 || i4 == 41) {
                            boolean z9 = G.f;
                            CharSequence charSequence16 = G.p;
                            View.OnClickListener onClickListener = G.E;
                            rg2 rg2Var = sg2Var.w;
                            if (rg2Var != null) {
                                in inVar3 = (in) rg2Var.c;
                                inVar3.a();
                                inVar3.setText(charSequence16);
                                View view6 = rg2Var.d;
                                view6.animate().cancel();
                                view6.animate().rotation(z9 ? 0.0f : 180.0f).setDuration(340L).setInterpolator(k43.h).start();
                                if (onClickListener != null) {
                                    rg2Var.setOnClickListener(onClickListener);
                                    break;
                                }
                            }
                        }
                        break;
                    case 37:
                        sg2 sg2Var2 = (sg2) view;
                        sg2Var2.setPad(G.i);
                        sg2Var2.setUserOrChat((TLObject) G.H);
                        sg2Var2.c(G.e, sg2Var2.a == G.d);
                        sg2Var2.a = G.d;
                        sg2Var2.setNeedDivider(J);
                        break;
                    case 39:
                    case 40:
                        vkb vkbVar = (vkb) view;
                        vkbVar.d(G.m.toString(), G.e, J, vkbVar.a == G.d);
                        vkbVar.getCheckBox().setDrawIconType(G.A);
                        Switch checkBox = vkbVar.getCheckBox();
                        int i17 = G.A == 0 ? aob.M6 : aob.r7;
                        int i18 = aob.N6;
                        int i19 = aob.d6;
                        checkBox.d(i17, i18, i19, i19);
                        vkbVar.a = G.d;
                        vkbVar.setIcon(G.u ? R.drawable.permission_locked : 0);
                        if (i4 == 40) {
                            if (!TextUtils.isEmpty(G.p)) {
                                vkbVar.a(new c9c(G, vkbVar, b2), G.p.toString(), G.f);
                                break;
                            } else {
                                LinearLayout linearLayout = vkbVar.f;
                                if (linearLayout != null) {
                                    linearLayout.setVisibility(8);
                                    break;
                                }
                            }
                        }
                        break;
                    case 42:
                        mf5 mf5Var2 = (mf5) view;
                        mf5Var2.c(G.p, mf5Var2.a == G.d);
                        mf5Var2.a = G.d;
                        break;
                    case 43:
                        qmb qmbVar = (qmb) view;
                        qmbVar.getValueBackupImageView().setImageDrawable(null);
                        CharSequence charSequence17 = G.m;
                        if (charSequence17 != null) {
                            CharSequence charSequence18 = G.n;
                            if (charSequence18 != null) {
                                qmbVar.c(charSequence17, charSequence18, false, J);
                            } else {
                                qmbVar.b(charSequence17, J);
                            }
                        }
                        qmbVar.setIcon(G.k);
                        break;
                    case 44:
                        ((h29) view).b(G.m.toString(), G.o.toString(), J, G.e);
                        break;
                }
            } else {
                a8c G4 = b8c.G(i4);
                if (G4 != null) {
                    G4.b(f89Var.a, G, J, this, d79Var instanceof q9c ? (q9c) d79Var : null);
                }
            }
            pcc pccVar2 = G.G;
            if (pccVar2 != null) {
                pccVar2.a(view);
            }
        }
    }

    @Override // j79
    public f89 x(ViewGroup viewGroup, int i) {
        View k89Var;
        View mf5Var;
        View mf5Var2;
        wkb wkbVar;
        View view;
        int i2;
        boolean z = this.n;
        int i3 = z ? aob.h5 : aob.d6;
        d79 d79Var = this.d;
        vnb vnbVar = this.x;
        Context context = this.e;
        if (i < 10000) {
            byte b = 21;
            int i4 = 8;
            switch (i) {
                case -5:
                    k89Var = new k89(context);
                    k89Var.setTag(-33024);
                    mf5Var = k89Var;
                    break;
                case -4:
                case -1:
                    k89Var = new ir8(context, (byte) 20);
                    if (i == -4) {
                        k89Var.setTag(-33024);
                    }
                    mf5Var = k89Var;
                    break;
                case -3:
                    h9c h9cVar = new h9c(context);
                    h9cVar.a = 0;
                    mf5Var = h9cVar;
                    break;
                case -2:
                    mf5Var = new ir8(context, b);
                    break;
                case 0:
                    if (!z) {
                        mf5Var = new mf5(context, vnbVar);
                        break;
                    } else {
                        mf5Var = new mf5(this.e, aob.L6, 21, 15, 0, false, false, this.x);
                        break;
                    }
                case 1:
                    mf5Var2 = new mf5(this.e, aob.G6, 17, 15, false, this.x);
                    mf5Var = mf5Var2;
                    break;
                case 2:
                    mf5Var = new pxb(context, vnbVar);
                    break;
                case 3:
                    skb skbVar = new skb(context, vnbVar);
                    skbVar.setCompactLayout(this.s);
                    mf5Var = skbVar;
                    break;
                case 4:
                case 9:
                    wkb wkbVar2 = new wkb(context, vnbVar);
                    if (i == 9) {
                        wkbVar2.setDrawCheckRipple(true);
                        wkbVar = wkbVar2;
                        wkbVar.d(aob.g6, aob.O6, aob.P6, aob.Q6, aob.R6);
                        wkbVar.setTypeface(hl.o());
                        wkbVar.setHeight(56);
                    } else {
                        wkbVar = wkbVar2;
                    }
                    mf5Var = wkbVar;
                    break;
                case 5:
                case 6:
                    mf5Var = new uo7(this.e, 21, 60, i == 6, this.x);
                    break;
                case 7:
                case 8:
                default:
                    mf5Var = new ilb(context, vnbVar);
                    break;
                case 10:
                    cg3 cg3Var = new cg3(context);
                    cg3Var.f = 23;
                    TextView textView = new TextView(context);
                    cg3Var.b = textView;
                    yob.X(textView, aob.G6, null);
                    ik8.w(textView, 1, 16.0f, 1, 1);
                    textView.setSingleLine(true);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView.setEllipsize(truncateAt);
                    textView.setGravity((ob6.a0 ? 5 : 3) | 16);
                    boolean z2 = ob6.a0;
                    cg3Var.addView(textView, tre.d(-1, -1.0f, (z2 ? 5 : 3) | 48, z2 ? 61.0f : 23.0f, 0.0f, z2 ? 23.0f : 61.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    cg3Var.c = textView2;
                    yob.X(textView2, aob.I6, null);
                    ik8.w(textView2, 1, 16.0f, 1, 1);
                    textView2.setSingleLine(true);
                    textView2.setEllipsize(truncateAt);
                    textView2.setGravity((ob6.a0 ? 3 : 5) | 16);
                    textView2.setVisibility(8);
                    cg3Var.addView(textView2, tre.d(-2, -1.0f, (ob6.a0 ? 3 : 5) | 48, 23.0f, 0.0f, 23.0f, 0.0f));
                    RadioButton radioButton = new RadioButton(context);
                    cg3Var.d = radioButton;
                    radioButton.setSize(hl.L(20.0f));
                    yob.O(radioButton, aob.g7, aob.h7, null);
                    cg3Var.addView(radioButton, tre.d(22, 22.0f, (ob6.a0 ? 3 : 5) | 48, 20.0f, 15.0f, 20.0f, 0.0f));
                    cg3Var.b();
                    cg3Var.setHorizontalPadding(21);
                    mf5Var = cg3Var;
                    break;
                case 11:
                case 12:
                    vac vacVar = new vac(context, 6, i != 12 ? 0 : 3, false);
                    vacVar.setSelfAsSavedMessages(true);
                    mf5Var = vacVar;
                    break;
                case 13:
                    mf5Var2 = new vac(6, 0, null, this.e, false, true);
                    mf5Var = mf5Var2;
                    break;
                case 14:
                    mf5Var = new zma(context, vnbVar);
                    break;
                case 15:
                    mf5Var = new bna(context, vnbVar);
                    break;
                case 16:
                    mf5Var = new w09(vnbVar, context, this.N != null);
                    break;
                case 17:
                    mf5Var = new v09(context, vnbVar);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    if (this.F == null) {
                        this.F = new of0((vnb) null);
                    }
                    view = new u1b(this.e, this.f, i - 18, this.F, this.h);
                    mf5Var = view;
                    break;
                case 24:
                    mf5Var = new gj1(context, vnbVar);
                    break;
                case 25:
                    mf5Var = new hj1(context, vnbVar);
                    break;
                case 26:
                    mf5 mf5Var3 = new mf5(this.e, aob.G6, 23, 20, 0, false, false, this.x);
                    mf5Var3.setTextSize(20.0f);
                    mf5Var = mf5Var3;
                    break;
                case 27:
                    v9b v9bVar = new v9b(context, vnbVar);
                    v9bVar.d(false, false);
                    mf5Var = v9bVar;
                    break;
                case 28:
                    k89Var = new j9c(context);
                    k89Var.setTag(-33024);
                    mf5Var = k89Var;
                    break;
                case 29:
                    mf5Var = new l41(context, vnbVar);
                    break;
                case jn7.S /* 30 */:
                    mf5Var = new wlb(context, vnbVar);
                    break;
                case 31:
                    if (d79Var != null && d79Var.d1()) {
                        p55 p55Var = new p55(28, vnbVar, context);
                        p55Var.setNoBackground(true);
                        mf5Var = p55Var;
                        break;
                    } else {
                        mf5Var = new p55(context, vnbVar);
                        break;
                    }
                case 32:
                    mf5Var = new bv8(context, null);
                    break;
                case 33:
                    mf5Var = new of3(context, true);
                    break;
                case 34:
                    tk4 tk4Var = new tk4(context, vnbVar);
                    tk4Var.setIsSingleCell(true);
                    mf5Var = tk4Var;
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
                        sg2 sg2Var = new sg2(this.e, i2, 21, true, this.x);
                        sg2Var.getCheckBoxRound().b(aob.V6, aob.g7, aob.k7);
                        view = sg2Var;
                        mf5Var = view;
                        break;
                    } else {
                        i4 = 4;
                    }
                    i2 = i4;
                    sg2 sg2Var2 = new sg2(this.e, i2, 21, true, this.x);
                    sg2Var2.getCheckBoxRound().b(aob.V6, aob.g7, aob.k7);
                    view = sg2Var2;
                    mf5Var = view;
                case 38:
                    mf5Var = new ll2(context, vnbVar);
                    break;
                case 39:
                case 40:
                    mf5Var = new vkb(context);
                    break;
                case 42:
                    mf5Var = new mf5(this.e, aob.L6, 21, 15, 0, false, true, this.x);
                    break;
                case 43:
                    mf5Var = new qmb(0, vnbVar, context);
                    break;
                case 44:
                    mf5Var = new h29(context, false);
                    break;
            }
        } else {
            a8c G = b8c.G(i);
            mf5Var = G != null ? G.d(context, d79Var, this.f, vnbVar) : new View(context);
        }
        if (N(i)) {
            yob.h(i3, this.P, mf5Var);
        }
        return new n69(mf5Var);
    }

    @Override // j79
    public void y(f89 f89Var) {
        R(f89Var, this.O);
        P(f89Var);
    }
}
