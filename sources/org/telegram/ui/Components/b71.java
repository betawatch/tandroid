package org.telegram.ui.Components;

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
import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public class b71 extends pg.b {
    public jg.f E;
    public x61 I;
    public x61 J;
    public int K;
    public boolean L;
    public Utilities.Callback2 M;
    public boolean N;
    public final mm0 d;
    public final Context e;
    public final int f;
    public final int h;
    public final boolean n;
    public boolean s;
    public Utilities.Callback2 v;
    public final org.telegram.ui.ActionBar.g6 w;
    public boolean r = true;
    public final ArrayList x = new ArrayList();
    public final ArrayList y = new ArrayList();
    public int F = 0;
    public final ArrayList G = new ArrayList();
    public final ArrayList H = new ArrayList();
    public final a71 O = new a71(this);

    public b71(mm0 mm0Var, Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, org.telegram.ui.ActionBar.g6 g6Var) {
        this.d = mm0Var;
        this.e = context;
        this.f = i10;
        this.h = i11;
        this.n = z10;
        this.v = callback2;
        this.w = g6Var;
        N(false);
    }

    public static boolean K(int i10) {
        if (i10 < 10000) {
            return i10 == 7 || i10 == 8 || i10 == 38 || i10 == 31 || i10 == -4 || i10 == 28 || i10 == 2 || i10 == -2;
        }
        l61 F = m61.F(i10);
        return F != null && F.isShadow();
    }

    @Override // org.telegram.ui.Components.lm0
    public boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f;
        m61 G = G(b1Var.b());
        if (i10 >= 10000) {
            l61 F = m61.F(i10);
            if (F == null || !F.isClickable()) {
                return false;
            }
        } else if (i10 != 3 && i10 != 5 && i10 != 6 && i10 != 30 && i10 != 4 && i10 != 10 && i10 != 44 && i10 != 11 && i10 != 12 && i10 != 17 && i10 != 16 && i10 != 29 && i10 != 25 && i10 != 27 && i10 != 32 && i10 != 33 && i10 != 35 && i10 != 36 && i10 != 37 && i10 != 41 && i10 != 39 && i10 != 40 && i10 != 38) {
            return false;
        }
        return G == null || G.g;
    }

    public final void F(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.H;
            if (i10 >= arrayList.size()) {
                return;
            }
            x61 x61Var = (x61) arrayList.get(i10);
            this.M.run(Integer.valueOf(i10), new ArrayList(this.y.subList(x61Var.a, x61Var.b + 1)));
            this.L = false;
        }
    }

    public final m61 G(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = this.y;
        if (i10 >= arrayList.size()) {
            return null;
        }
        return (m61) arrayList.get(i10);
    }

    public final int H(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i11 >= arrayList.size()) {
                return -1;
            }
            x61 x61Var = (x61) arrayList.get(i11);
            if (i10 >= x61Var.a && i10 <= x61Var.b) {
                return i11;
            }
            i11++;
        }
    }

    public int I(int i10) {
        return org.telegram.ui.ActionBar.k6.w0(i10, this.w);
    }

    public final boolean J(int i10) {
        m61 G = G(i10);
        m61 G2 = G(i10 + 1);
        return (G == null || G.j || G2 == null || K(G2.a) != K(G.a)) ? false : true;
    }

    public final void L() {
        x61 x61Var = this.J;
        if (x61Var != null) {
            x61Var.b = Math.max(0, this.y.size() - 1);
        }
    }

    public final int M() {
        x61 x61Var = new x61();
        this.J = x61Var;
        x61Var.a = this.y.size();
        x61 x61Var2 = this.J;
        x61Var2.b = -1;
        this.H.add(x61Var2);
        return r1.size() - 1;
    }

    public void N(boolean z10) {
        mm0 mm0Var = this.d;
        if (mm0Var == null || !mm0Var.b0()) {
            P(z10);
        } else {
            mm0Var.post(new b60(9, this, z10));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void O(s4.b1 b1Var) {
        View view = b1Var.a;
        if (view instanceof org.telegram.ui.ActionBar.b6) {
            ((org.telegram.ui.ActionBar.b6) view).updateColors();
            Object tag = view.getTag(R.id.theme_generation);
            int i10 = org.telegram.ui.ActionBar.r6.b;
            int i11 = b1Var.f;
            if (this.r) {
                if (i11 < 10000) {
                    switch (i11) {
                    }
                }
                if (!(tag instanceof Integer) || ((Integer) tag).intValue() != i10) {
                    view.setBackgroundColor(I(this.n ? org.telegram.ui.ActionBar.k6.h5 : org.telegram.ui.ActionBar.k6.d6));
                }
            }
            view.setTag(R.id.theme_generation, Integer.valueOf(i10));
        }
    }

    public final void P(boolean z10) {
        mm0 mm0Var = this.d;
        if (mm0Var == null || !mm0Var.b0()) {
            ArrayList arrayList = this.x;
            arrayList.clear();
            ArrayList arrayList2 = this.y;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            this.I = null;
            this.G.clear();
            this.H.clear();
            Utilities.Callback2 callback2 = this.v;
            if (callback2 != null) {
                callback2.run(arrayList2, this);
                R();
                if (z10) {
                    E(arrayList, arrayList2);
                } else {
                    l();
                }
            }
        }
    }

    public final void Q(s4.b1 b1Var, boolean z10) {
        if (b1Var == null) {
            return;
        }
        View view = b1Var.a;
        int i10 = b1Var.f;
        if (i10 < 10000) {
            if (i10 != 16) {
                return;
            }
            ((ig.v1) view).setReorder(z10);
        } else {
            l61 F = m61.F(i10);
            if (F != null) {
                F.attachedView(this.d, view, G(b1Var.b()));
            }
        }
    }

    public final void R() {
        mm0 mm0Var = this.d;
        if (mm0Var == null) {
            return;
        }
        ArrayList arrayList = mm0Var.J2;
        if (arrayList == null) {
            mm0Var.J2 = new ArrayList();
        } else {
            arrayList.clear();
        }
        ArrayList arrayList2 = this.G;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            x61 x61Var = (x61) obj;
            mm0Var.J2.add(Long.valueOf(AndroidUtilities.pack(x61Var.a, x61Var.b)));
        }
    }

    public final void S() {
        ArrayList arrayList = this.x;
        arrayList.clear();
        ArrayList arrayList2 = this.y;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        this.G.clear();
        this.H.clear();
        Utilities.Callback2 callback2 = this.v;
        if (callback2 != null) {
            callback2.run(arrayList2, this);
        }
        R();
    }

    public final void T() {
        x61 x61Var = this.I;
        if (x61Var != null) {
            x61Var.b = Math.max(0, (this.y.size() + this.F) - 1);
            x61 x61Var2 = this.I;
            if (x61Var2.a == x61Var2.b) {
                this.G.remove(x61Var2);
            }
            this.I = null;
        }
    }

    public final void U() {
        x61 x61Var = new x61();
        this.I = x61Var;
        x61Var.a = this.y.size() + this.F;
        x61 x61Var2 = this.I;
        x61Var2.b = -1;
        this.G.add(x61Var2);
    }

    @Override // s4.g0
    public final int h() {
        return this.y.size();
    }

    @Override // s4.g0
    public final int j(int i10) {
        m61 G = G(i10);
        if (G == null) {
            return 0;
        }
        return G.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0237  */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v14 */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void v(s4.b1 b1Var, int i10) {
        String str;
        org.telegram.ui.Cells.e9 e9Var;
        ?? r14;
        ImageReceiver imageReceiver;
        TLRPC.Document document;
        long j10;
        ImageLocation imageLocation;
        String str2;
        TLRPC.Photo photo;
        m61 m61Var;
        long j11;
        boolean z10;
        char c10;
        long j12;
        CharSequence concat;
        int i11;
        int i12 = this.f;
        mm0 mm0Var = this.d;
        org.telegram.ui.ActionBar.g6 g6Var = this.w;
        m61 G = G(i10);
        m61 G2 = G(i10 + 1);
        m61 G3 = G(i10 - 1);
        if (G == null) {
            return;
        }
        int i13 = b1Var.f;
        View view = b1Var.a;
        boolean J = J(i10);
        O(b1Var);
        if (i13 < 10000) {
            long j13 = 0;
            str = "";
            boolean z11 = true;
            switch (i13) {
                case -4:
                case -2:
                case -1:
                    FrameLayout frameLayout = (FrameLayout) view;
                    frameLayout.setClipChildren(!G.e);
                    frameLayout.setClipToPadding(!G.e);
                    if (frameLayout.getChildCount() != (G.c == null ? 0 : 1) || frameLayout.getChildAt(0) != G.c) {
                        frameLayout.removeAllViews();
                        View view2 = G.c;
                        if (view2 != null) {
                            AndroidUtilities.removeFromParent(view2);
                            frameLayout.addView(G.c, (i13 == -1 || i13 == -4) ? w7.z5.c(G.z, -1) : w7.z5.c(-2.0f, -2));
                            break;
                        }
                    }
                    break;
                case -3:
                    w61 w61Var = (w61) view;
                    w61Var.a = G.z;
                    w61Var.b = w7.j6.a(G.y, 1);
                    if (w61Var.getChildCount() != (G.c == null ? 0 : 1) || w61Var.getChildAt(0) != G.c) {
                        w61Var.removeAllViews();
                        View view3 = G.c;
                        if (view3 != null) {
                            AndroidUtilities.removeFromParent(view3);
                            w61Var.addView(G.c, w7.z5.c(-1.0f, -1));
                            break;
                        }
                    }
                    break;
                case 0:
                case 1:
                case 26:
                    org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
                    l4Var.setText(G.l);
                    l4Var.b(G.g);
                    break;
                case 2:
                    a31 a31Var = (a31) view;
                    int i14 = G.k;
                    if (i14 == 0) {
                        int i15 = G.z;
                        if (i15 != 0) {
                            a31Var.setEmojiSize(i15);
                        }
                        String charSequence = G.m.toString();
                        String charSequence2 = G.n.toString();
                        a31Var.getClass();
                        MediaDataController.getInstance(UserConfig.selectedAccount).setPlaceholderImage(a31Var.b, charSequence, charSequence2, "90_90");
                    } else if (G.q) {
                        a31Var.setEmojiStatic(i14);
                    } else {
                        a31Var.setEmoji(i14);
                    }
                    if (!TextUtils.isEmpty(G.o)) {
                        a31Var.a(G.l, G.o);
                        break;
                    } else {
                        a31Var.setText(G.l);
                        break;
                    }
                case 3:
                    org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                    Object obj = G.G;
                    if (obj instanceof TLRPC.Document) {
                        CharSequence charSequence3 = G.l;
                        TLRPC.Document document2 = (TLRPC.Document) obj;
                        r8Var.w = r8Var.getDefaultImageLeft();
                        r8Var.s = r8Var.c(false);
                        org.telegram.ui.ActionBar.n5 n5Var = r8Var.a;
                        n5Var.l(charSequence3, false);
                        n5Var.i(null);
                        q6 q6Var = r8Var.c;
                        r8Var.Q = null;
                        q6Var.c(null, false, true);
                        r8Var.h.setVisibility(8);
                        q6Var.setVisibility(8);
                        r8Var.d.setVisibility(8);
                        bk0 bk0Var = r8Var.e;
                        bk0Var.setVisibility(8);
                        bk0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
                        r8Var.r = J;
                        r8Var.setWillNotDraw(!J);
                        Switch r12 = r8Var.f;
                        if (r12 != null) {
                            r12.setVisibility(8);
                        }
                        r8Var.setValueSticker(document2);
                    } else if (obj instanceof String) {
                        CharSequence charSequence4 = G.l;
                        String str3 = (String) obj;
                        r8Var.w = r8Var.getDefaultImageLeft();
                        r8Var.s = r8Var.c(false);
                        org.telegram.ui.ActionBar.n5 n5Var2 = r8Var.a;
                        n5Var2.l(charSequence4, false);
                        n5Var2.i(null);
                        q6 q6Var2 = r8Var.c;
                        r8Var.Q = null;
                        q6Var2.c(null, false, true);
                        r8Var.h.setVisibility(8);
                        q6Var2.setVisibility(8);
                        r8Var.d.setVisibility(8);
                        bk0 bk0Var2 = r8Var.e;
                        bk0Var2.setVisibility(8);
                        bk0Var2.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
                        r8Var.r = J;
                        r8Var.setWillNotDraw(!J);
                        Switch r13 = r8Var.f;
                        if (r13 != null) {
                            r13.setVisibility(8);
                        }
                        r8Var.setValueSticker(str3);
                    } else if (TextUtils.isEmpty(G.n)) {
                        Object obj2 = G.G;
                        if (obj2 instanceof Drawable) {
                            r8Var.p(G.l, (Drawable) obj2, J);
                        } else {
                            int i16 = G.k;
                            if (i16 == 0) {
                                r8Var.k(G.l, J);
                            } else {
                                r8Var.o(i16, G.l, J);
                            }
                        }
                    } else {
                        Object obj3 = G.G;
                        if (obj3 instanceof Drawable) {
                            r8Var.t(G.l, G.n, (Drawable) obj3, J);
                        } else {
                            int i17 = G.k;
                            if (i17 == 0) {
                                r8Var.q(G.l, G.n, false, J);
                            } else {
                                r8Var.u(G.l, G.n, false, i17, J);
                            }
                        }
                    }
                    if (G.q) {
                        int i18 = org.telegram.ui.ActionBar.k6.q6;
                        r8Var.g(i18, i18);
                    } else if (G.r) {
                        r8Var.g(org.telegram.ui.ActionBar.k6.q7, org.telegram.ui.ActionBar.k6.p7);
                    } else {
                        r8Var.g(org.telegram.ui.ActionBar.k6.m6, org.telegram.ui.ActionBar.k6.G6);
                    }
                    r8Var.h(45, G.t, true);
                    r8Var.i(G.g, true);
                    break;
                case 4:
                case 9:
                    org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                    if (w8Var.b == G.d) {
                        w8Var.setChecked(G.e);
                    }
                    w8Var.e(null, G.g);
                    w8Var.f(G.l, G.e, J);
                    w8Var.b = G.d;
                    if (i13 == 9) {
                        org.telegram.ui.ActionBar.r6.i(G.e ? org.telegram.ui.ActionBar.k6.f6 : org.telegram.ui.ActionBar.k6.e6, view, null);
                        break;
                    }
                    break;
                case 5:
                    org.telegram.ui.Cells.i5 i5Var = (org.telegram.ui.Cells.i5) view;
                    CharSequence charSequence5 = G.m;
                    i5Var.b(G.l, G.m, 0, G.e, 0, charSequence5 != null && charSequence5.toString().contains("\n"), J, false);
                    break;
                case 6:
                    ((org.telegram.ui.Cells.i5) view).b(G.l, G.m, 0, G.e, 0, false, J, false);
                    break;
                case 7:
                case 8:
                case 38:
                    if (i13 == 7 || i13 == 8) {
                        org.telegram.ui.Cells.e9 e9Var2 = (org.telegram.ui.Cells.e9) view;
                        if (TextUtils.isEmpty(G.l)) {
                            e9Var2.setFixedSize(i13 == 8 ? 220 : 12);
                            e9Var2.setText("");
                        } else {
                            e9Var2.setFixedSize(0);
                            e9Var2.setText(G.l);
                        }
                        if (G.q) {
                            e9Var2.setTextGravity(17);
                            e9Var2.getTextView().setWidth(Math.min(ei.x3.a(e9Var2.getText(), e9Var2.getTextView().getPaint()), AndroidUtilities.displaySize.x - AndroidUtilities.dp(60.0f)));
                            e9Var2.getTextView().setPadding(0, AndroidUtilities.dp(17.0f), 0, AndroidUtilities.dp(17.0f));
                            e9Var = e9Var2;
                        } else {
                            e9Var2.setTextGravity(8388611);
                            e9Var2.getTextView().setMinWidth(0);
                            e9Var2.getTextView().setMaxWidth(AndroidUtilities.displaySize.x);
                            e9Var2.getTextView().setPadding(0, AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(17.0f));
                            e9Var = e9Var2;
                        }
                    } else if (i13 == 38) {
                        org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) view;
                        CharSequence charSequence6 = G.o;
                        boolean z12 = G.f;
                        a2Var.a.setText(charSequence6);
                        View view4 = a2Var.b;
                        view4.animate().cancel();
                        view4.animate().rotation(z12 ? 0.0f : 180.0f).setDuration(340L).setInterpolator(bs.h).start();
                        if (G.q) {
                            a2Var.setColor(org.telegram.ui.ActionBar.k6.q6);
                            e9Var = a2Var;
                        } else if (G.r) {
                            a2Var.setColor(org.telegram.ui.ActionBar.k6.p7);
                            e9Var = a2Var;
                        } else {
                            a2Var.setColor(org.telegram.ui.ActionBar.k6.G6);
                            e9Var = a2Var;
                        }
                    } else {
                        e9Var = null;
                    }
                    boolean z13 = (G3 == null || K(G3.a)) ? false : true;
                    boolean z14 = (G2 == null || K(G2.a)) ? false : true;
                    if (!mm0Var.c1()) {
                        Drawable W0 = org.telegram.ui.ActionBar.k6.W0(this.e, (z13 && z14) ? R.drawable.greydivider : z13 ? R.drawable.greydivider_bottom : z14 ? R.drawable.greydivider_top : R.drawable.field_carret_empty, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.b7, g6Var));
                        if (!this.n) {
                            e9Var.setBackground(W0);
                            break;
                        } else {
                            int i19 = org.telegram.ui.ActionBar.k6.i5;
                            e9Var.setBackground(new LayerDrawable(new Drawable[]{I(i19) == org.telegram.ui.ActionBar.k6.w0(i19, g6Var) ? new z61(i19, g6Var) : new ColorDrawable(I(i19)), W0}));
                            break;
                        }
                    } else {
                        e9Var.setBackground(null);
                        break;
                    }
                    break;
                case 10:
                    org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
                    int i20 = s2Var.a;
                    TextView textView = s2Var.b;
                    TextView textView2 = s2Var.c;
                    RadioButton radioButton = s2Var.d;
                    if (i20 == G.d) {
                        radioButton.a(G.e, true);
                        s2Var.a(G.g, true);
                        r14 = 0;
                    } else {
                        r14 = 0;
                        s2Var.a(G.g, false);
                    }
                    if (TextUtils.isEmpty(G.n)) {
                        CharSequence charSequence7 = G.l;
                        boolean z15 = G.e;
                        textView2.setVisibility(8);
                        textView.setText(charSequence7);
                        radioButton.a(z15, r14);
                        s2Var.e = J;
                        s2Var.b();
                        s2Var.setWillNotDraw(!J);
                    } else {
                        CharSequence charSequence8 = G.l;
                        CharSequence charSequence9 = G.n;
                        boolean z16 = G.e;
                        textView2.setVisibility(r14);
                        textView2.setText(charSequence9);
                        textView.setText(charSequence8);
                        radioButton.a(z16, r14);
                        s2Var.e = J;
                        s2Var.b();
                        s2Var.setWillNotDraw(!J);
                    }
                    s2Var.a = G.d;
                    break;
                case 11:
                case 12:
                    org.telegram.ui.Cells.wa waVar = (org.telegram.ui.Cells.wa) view;
                    waVar.g(i12, G, J);
                    if (i13 == 12) {
                        waVar.c(G.e, false);
                        break;
                    }
                    break;
                case 13:
                    org.telegram.ui.Cells.wa waVar2 = (org.telegram.ui.Cells.wa) view;
                    waVar2.g(i12, G, J);
                    CharSequence charSequence10 = G.n;
                    waVar2.setQuery(charSequence10 == null ? null : charSequence10.toString().toLowerCase());
                    waVar2.setAddButtonVisible(!G.e);
                    waVar2.setCloseIcon(G.D);
                    break;
                case 14:
                    sw0 sw0Var = (sw0) view;
                    sw0Var.b(G.z, null, G.p);
                    sw0Var.setMinAllowedIndex((int) G.B);
                    sw0Var.setCallback(new tv(G, 27));
                    break;
                case 15:
                    org.telegram.ui.Cells.y7 y7Var = (org.telegram.ui.Cells.y7) view;
                    y7Var.d(G.z, (org.telegram.ui.Cells.x7) G.G, G.C);
                    y7Var.setMinValueAllowed((int) G.B);
                    break;
                case 16:
                    ig.v1 v1Var = (ig.v1) view;
                    v1Var.d.a(G.e, false);
                    v1Var.setReorder(this.N);
                    Object obj4 = G.G;
                    if (obj4 instanceof ig.y1) {
                        v1Var.a((ig.y1) obj4, null, J);
                        break;
                    }
                    break;
                case 17:
                    ig.t1 t1Var = (ig.t1) view;
                    t1Var.e.a(G.e, false);
                    Object obj5 = G.G;
                    if (obj5 instanceof ig.y1) {
                        ig.y1 y1Var = (ig.y1) obj5;
                        h9 h9Var = t1Var.a;
                        int[] iArr = t1Var.r;
                        TextView textView3 = t1Var.d;
                        ImageReceiver imageReceiver2 = t1Var.b;
                        int i21 = UserConfig.selectedAccount;
                        t1Var.c.setText(MessagesController.getInstance(i21).getPeerName(UserConfig.getInstance(i21).getClientUserId()));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        MessageObject messageObject = y1Var.e;
                        if (messageObject != null) {
                            spannableStringBuilder.append(Emoji.replaceEmoji(messageObject.messageText, textView3.getPaint().getFontMetricsInt(), false));
                        }
                        if (y1Var.a() > 1) {
                            spannableStringBuilder.append((CharSequence) "  ");
                            int dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(80.0f);
                            int a2 = y1Var.a() - 1;
                            int i22 = ig.u1.d;
                            SpannableString spannableString = new SpannableString("+");
                            ig.u1 u1Var = new ig.u1(a2);
                            iArr[0] = (int) (((i11) u1Var.c).c + AndroidUtilities.dp(10.0f));
                            imageReceiver = imageReceiver2;
                            spannableString.setSpan(u1Var, 0, spannableString.length(), 33);
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(TextUtils.ellipsize(spannableStringBuilder, textView3.getPaint(), (dp * 1.5f) - iArr[0], TextUtils.TruncateAt.END));
                            if (spannableStringBuilder2.length() > 0 && spannableStringBuilder2.charAt(spannableStringBuilder2.length() - 1) == 8230) {
                                spannableStringBuilder2.append((CharSequence) "  ");
                            }
                            spannableStringBuilder2.append((CharSequence) spannableString);
                            spannableStringBuilder = spannableStringBuilder2;
                        } else {
                            imageReceiver = imageReceiver2;
                        }
                        textView3.setText(spannableStringBuilder);
                        TLRPC.MessageMedia media = MessageObject.getMedia(y1Var.e);
                        if (media == null || (photo = media.photo) == null) {
                            ImageReceiver imageReceiver3 = imageReceiver;
                            if (media == null || (document = media.document) == null) {
                                h9Var.r(UserConfig.getInstance(i21).getCurrentUser());
                                imageReceiver3.setForUserOrChat(UserConfig.getInstance(i21).getCurrentUser(), h9Var);
                                imageReceiver3.setRoundRadius(AndroidUtilities.dp(56.0f));
                            } else {
                                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(36.0f), true, null, true);
                                if (closestPhotoSizeWithSize == null) {
                                    ImageLocation forDocument = ImageLocation.getForDocument(media.document);
                                    j10 = media.document.size;
                                    str2 = ImageLoader.AUTOPLAY_FILTER;
                                    imageLocation = forDocument;
                                } else {
                                    ImageLocation forObject = ImageLocation.getForObject(closestPhotoSizeWithSize, media.document);
                                    j10 = closestPhotoSizeWithSize.size;
                                    imageLocation = forObject;
                                    str2 = "36_36";
                                }
                                long j14 = j10;
                                MessageObject messageObject2 = y1Var.e;
                                imageReceiver3.setImage(imageLocation, str2, messageObject2.strippedThumb, j14, (String) null, messageObject2, 0);
                                imageReceiver3.setRoundRadius(AndroidUtilities.dp(6.0f));
                            }
                        } else {
                            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(36.0f), true, null, true);
                            ImageLocation forObject2 = ImageLocation.getForObject(closestPhotoSizeWithSize2, media.photo);
                            MessageObject messageObject3 = y1Var.e;
                            ImageReceiver imageReceiver4 = imageReceiver;
                            imageReceiver4.setImage(forObject2, "36_36", messageObject3.strippedThumb, closestPhotoSizeWithSize2 == null ? 0L : closestPhotoSizeWithSize2.size, (String) null, messageObject3, 0);
                            imageReceiver4.setRoundRadius(AndroidUtilities.dp(6.0f));
                        }
                        t1Var.s = J;
                        t1Var.invalidate();
                        break;
                    }
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    org.telegram.ui.s91 s91Var = (org.telegram.ui.s91) view;
                    int i23 = G.z;
                    org.telegram.ui.g91 g91Var = (org.telegram.ui.g91) G.G;
                    org.telegram.ui.oh ohVar = new org.telegram.ui.oh(z11 ? 1 : 0, this, G);
                    s91Var.x = i23;
                    s91Var.y = ohVar;
                    s91Var.e(g91Var, false);
                    break;
                case 24:
                    ((org.telegram.ui.ge) view).set((org.telegram.ui.fe) G.G);
                    break;
                case 25:
                    org.telegram.ui.he heVar = (org.telegram.ui.he) view;
                    TL_stats.BroadcastRevenueTransaction broadcastRevenueTransaction = (TL_stats.BroadcastRevenueTransaction) G.G;
                    z5 z5Var = heVar.b;
                    org.telegram.ui.ActionBar.g6 g6Var2 = heVar.a;
                    TextView textView4 = heVar.c;
                    TextView textView5 = heVar.d;
                    if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionWithdrawal) {
                        TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
                        textView4.setText(LocaleController.getString(R.string.MonetizationTransactionWithdraw));
                        if (tL_broadcastRevenueTransactionWithdrawal.pending) {
                            textView5.setText(LocaleController.getString(R.string.MonetizationTransactionPending));
                            z10 = false;
                            m61Var = G;
                        } else {
                            z10 = tL_broadcastRevenueTransactionWithdrawal.failed;
                            StringBuilder sb2 = new StringBuilder();
                            m61Var = G;
                            sb2.append(LocaleController.formatShortDateTime(tL_broadcastRevenueTransactionWithdrawal.date));
                            sb2.append(z10 ? org.telegram.messenger.v0.h(R.string.MonetizationTransactionNotCompleted, new StringBuilder(" — ")) : "");
                            textView5.setText(sb2.toString());
                        }
                        j11 = tL_broadcastRevenueTransactionWithdrawal.amount;
                        c10 = 65535;
                    } else {
                        m61Var = G;
                        if (!(broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionProceeds)) {
                            if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionRefund) {
                                textView4.setText(LocaleController.getString(R.string.MonetizationTransactionRefund));
                                textView5.setText(LocaleController.formatShortDateTime(r5.from_date));
                                j11 = ((TL_stats.TL_broadcastRevenueTransactionRefund) broadcastRevenueTransaction).amount;
                            }
                            G = m61Var;
                            break;
                        } else {
                            textView4.setText(LocaleController.getString(R.string.MonetizationTransactionProceed));
                            textView5.setText(LocaleController.formatShortDateTime(r5.from_date) + " - " + LocaleController.formatShortDateTime(r5.to_date));
                            j11 = ((TL_stats.TL_broadcastRevenueTransactionProceeds) broadcastRevenueTransaction).amount;
                        }
                        z10 = false;
                        c10 = 1;
                    }
                    org.telegram.ui.ActionBar.r6.W(textView5, z10 ? org.telegram.ui.ActionBar.k6.p7 : org.telegram.ui.ActionBar.k6.y6, g6Var2);
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                    spannableStringBuilder3.append((CharSequence) (c10 < 0 ? "-" : "+"));
                    spannableStringBuilder3.append((CharSequence) "TON ");
                    spannableStringBuilder3.append((CharSequence) heVar.e.format(Math.abs(j11) / 1.0E9d));
                    int indexOf = TextUtils.indexOf(spannableStringBuilder3, ".");
                    if (indexOf >= 0) {
                        spannableStringBuilder3.setSpan(new RelativeSizeSpan(1.15f), 0, indexOf + 1, 33);
                    }
                    z5Var.setText(org.telegram.ui.ie.e0(spannableStringBuilder3, z5Var.getPaint(), 1.1f, AndroidUtilities.dp(0.33f), false));
                    org.telegram.ui.ActionBar.r6.W(z5Var, c10 < 0 ? org.telegram.ui.ActionBar.k6.q7 : org.telegram.ui.ActionBar.k6.l8, g6Var2);
                    heVar.f = J;
                    heVar.setWillNotDraw(!J);
                    G = m61Var;
                case 27:
                    ei.q9 q9Var = (ei.q9) view;
                    long j15 = q9Var.x;
                    Object obj6 = G.G;
                    if (!(obj6 instanceof TLRPC.User)) {
                        if (obj6 instanceof TLRPC.Chat) {
                            j12 = -((TLRPC.Chat) obj6).id;
                        }
                        boolean z17 = j15 != j13;
                        q9Var.d(false, true);
                        q9Var.set(G.G);
                        q9Var.f.setVisibility(8);
                        q9Var.h.setVisibility(0);
                        q9Var.c(G.e, z17);
                        q9Var.setDivider(J);
                        break;
                    } else {
                        j12 = ((TLRPC.User) obj6).id;
                    }
                    j13 = j12;
                    if (j15 != j13) {
                    }
                    q9Var.d(false, true);
                    q9Var.set(G.G);
                    q9Var.f.setVisibility(8);
                    q9Var.h.setVisibility(0);
                    q9Var.c(G.e, z17);
                    q9Var.setDivider(J);
                case 28:
                    if (G.s) {
                        org.telegram.ui.ActionBar.r6.r(view);
                        view.setBackgroundColor(0);
                    } else if (G.k != 0) {
                        org.telegram.ui.ActionBar.r6.r(view);
                        view.setBackgroundColor(G.k);
                    }
                    view.setId(G.d);
                    ((y61) view).setHeight(G.z);
                    break;
                case 29:
                    ig.t tVar = (ig.t) view;
                    Object obj7 = G.G;
                    if (obj7 instanceof ig.u) {
                        org.telegram.ui.ActionBar.n5 n5Var3 = tVar.a;
                        org.telegram.ui.ActionBar.n5 n5Var4 = tVar.c;
                        wh.n nVar = tVar.b;
                        tVar.e = J;
                        TL_account.TL_businessChatLink tL_businessChatLink = ((ig.u) obj7).a;
                        tVar.f = tL_businessChatLink;
                        if (TextUtils.isEmpty(tL_businessChatLink.title)) {
                            String str4 = tVar.f.link;
                            ig.y[] yVarArr = ig.y.e;
                            if (str4.startsWith("https://")) {
                                str4 = str4.substring(8);
                            }
                            n5Var3.l(str4, false);
                        } else {
                            n5Var3.l(tVar.f.title, false);
                        }
                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(tVar.f.message);
                        TL_account.TL_businessChatLink tL_businessChatLink2 = tVar.f;
                        MediaDataController.addTextStyleRuns(tL_businessChatLink2.entities, tL_businessChatLink2.message, spannableStringBuilder4);
                        CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder4, nVar.getPaint().getFontMetricsInt(), false);
                        MessageObject.replaceAnimatedEmoji(replaceEmoji, tVar.f.entities, nVar.getPaint().getFontMetricsInt());
                        nVar.setText(replaceEmoji);
                        int i24 = tVar.f.views;
                        if (i24 == 0) {
                            n5Var4.l(LocaleController.formatString(R.string.NoClicks, new Object[0]), false);
                        } else {
                            n5Var4.l(LocaleController.formatPluralString("Clicks", i24, new Object[0]), false);
                        }
                        n5Var4.requestLayout();
                        tVar.invalidate();
                        break;
                    }
                    break;
                case MessageObject.TYPE_GIFT_STARS /* 30 */:
                    org.telegram.ui.Cells.h9 h9Var2 = (org.telegram.ui.Cells.h9) view;
                    CharSequence charSequence11 = G.l;
                    int i25 = G.k;
                    h9Var2.b.l(charSequence11, false);
                    h9Var2.a.setImageResource(i25);
                    h9Var2.setDivider(J);
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.h5, h9Var2, this.O);
                    break;
                case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                    org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
                    if (!TextUtils.equals(u3Var.getText(), G.l)) {
                        u3Var.b(G.l, G.m, G.D);
                        break;
                    } else {
                        u3Var.a(G.m, G.D);
                        break;
                    }
                case 32:
                    org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) view;
                    Object obj8 = G.G;
                    if (G.q && (obj8 instanceof TLRPC.User) && (i11 = ((TLRPC.User) obj8).bot_active_users) != 0) {
                        if (i11 != 0) {
                            concat = LocaleController.formatPluralStringSpaced("BotUsers", i11);
                            if (!(obj8 instanceof TLRPC.Chat)) {
                            }
                            String str5 = str;
                            boolean z18 = G.t;
                            Object obj9 = G.H;
                            if (obj9 instanceof Utilities.Callback) {
                            }
                            i6Var.B0 = z18;
                            i6Var.C0 = r11;
                            i6Var.setRectangularAvatar(G.r);
                            CharSequence charSequence12 = G.m;
                            i6Var.t(obj8, null, str5, charSequence12 == null ? charSequence12 : concat, false, false);
                            i6Var.s(G.e, false);
                            i6Var.M = J;
                        }
                        concat = "";
                        if (!(obj8 instanceof TLRPC.Chat)) {
                        }
                        String str52 = str;
                        boolean z182 = G.t;
                        Object obj92 = G.H;
                        if (obj92 instanceof Utilities.Callback) {
                        }
                        i6Var.B0 = z182;
                        i6Var.C0 = r11;
                        i6Var.setRectangularAvatar(G.r);
                        CharSequence charSequence122 = G.m;
                        i6Var.t(obj8, null, str52, charSequence122 == null ? charSequence122 : concat, false, false);
                        i6Var.s(G.e, false);
                        i6Var.M = J;
                    } else {
                        if (G.I) {
                            String publicUsername = obj8 instanceof TLRPC.User ? UserObject.getPublicUsername((TLRPC.User) obj8) : obj8 instanceof TLRPC.Chat ? ChatObject.getPublicUsername((TLRPC.Chat) obj8) : null;
                            if (publicUsername != null) {
                                concat = "@".concat(publicUsername);
                                if (!(obj8 instanceof TLRPC.Chat)) {
                                    TLRPC.Chat chat = (TLRPC.Chat) obj8;
                                    if (chat.participants_count != 0) {
                                        String formatPluralStringSpaced = (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.formatPluralStringSpaced("Members", chat.participants_count) : LocaleController.formatPluralStringSpaced("Subscribers", chat.participants_count);
                                        concat = !TextUtils.isEmpty(concat) ? TextUtils.concat(concat, ", ", formatPluralStringSpaced) : formatPluralStringSpaced;
                                    }
                                    str = chat.title;
                                } else if (obj8 instanceof TLRPC.User) {
                                    str = UserObject.getUserName((TLRPC.User) obj8);
                                }
                                String str522 = str;
                                boolean z1822 = G.t;
                                Object obj922 = G.H;
                                Utilities.Callback callback = obj922 instanceof Utilities.Callback ? (Utilities.Callback) obj922 : null;
                                i6Var.B0 = z1822;
                                i6Var.C0 = callback;
                                i6Var.setRectangularAvatar(G.r);
                                CharSequence charSequence1222 = G.m;
                                i6Var.t(obj8, null, str522, charSequence1222 == null ? charSequence1222 : concat, false, false);
                                i6Var.s(G.e, false);
                                i6Var.M = J;
                                break;
                            }
                        }
                        concat = "";
                        if (!(obj8 instanceof TLRPC.Chat)) {
                        }
                        String str5222 = str;
                        boolean z18222 = G.t;
                        Object obj9222 = G.H;
                        if (obj9222 instanceof Utilities.Callback) {
                        }
                        i6Var.B0 = z18222;
                        i6Var.C0 = callback;
                        i6Var.setRectangularAvatar(G.r);
                        CharSequence charSequence12222 = G.m;
                        i6Var.t(obj8, null, str5222, charSequence12222 == null ? charSequence12222 : concat, false, false);
                        i6Var.s(G.e, false);
                        i6Var.M = J;
                    }
                    break;
                case 33:
                    org.telegram.ui.Cells.q2 q2Var = (org.telegram.ui.Cells.q2) view;
                    Object obj10 = G.G;
                    MessageObject messageObject4 = obj10 instanceof MessageObject ? (MessageObject) obj10 : null;
                    q2Var.s2 = J;
                    if (messageObject4 != null) {
                        q2Var.V(messageObject4.getDialogId(), messageObject4, messageObject4.messageOwner.date, false, false);
                        break;
                    } else {
                        q2Var.V(0L, null, 0, false, false);
                        break;
                    }
                case 34:
                    ((b10) view).setViewType(G.z);
                    break;
                case 35:
                case 36:
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) view;
                    z1Var.setPad(G.i);
                    z1Var.e(G.l, "", G.e, J, z1Var.a == G.d);
                    z1Var.a = G.d;
                    z1Var.setIcon(G.t ? R.drawable.permission_locked : 0);
                    if (i13 == 36 || i13 == 41) {
                        boolean z19 = G.f;
                        CharSequence charSequence13 = G.o;
                        View.OnClickListener onClickListener = G.D;
                        org.telegram.ui.Cells.y1 y1Var2 = z1Var.v;
                        if (y1Var2 != null) {
                            q6 q6Var3 = y1Var2.b;
                            q6Var3.a();
                            q6Var3.setText(charSequence13);
                            View view5 = y1Var2.c;
                            view5.animate().cancel();
                            view5.animate().rotation(z19 ? 0.0f : 180.0f).setDuration(340L).setInterpolator(bs.h).start();
                            if (onClickListener != null) {
                                y1Var2.setOnClickListener(onClickListener);
                                break;
                            }
                        }
                    }
                    break;
                case 37:
                    org.telegram.ui.Cells.z1 z1Var2 = (org.telegram.ui.Cells.z1) view;
                    z1Var2.setPad(G.i);
                    z1Var2.setUserOrChat((TLObject) G.G);
                    z1Var2.c(G.e, z1Var2.a == G.d);
                    z1Var2.a = G.d;
                    z1Var2.setNeedDivider(J);
                    break;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
                    v8Var.d(G.l.toString(), G.e, J, v8Var.a == G.d);
                    v8Var.getCheckBox().setDrawIconType(G.z);
                    Switch checkBox = v8Var.getCheckBox();
                    int i26 = G.z == 0 ? org.telegram.ui.ActionBar.k6.M6 : org.telegram.ui.ActionBar.k6.r7;
                    int i27 = org.telegram.ui.ActionBar.k6.N6;
                    int i28 = org.telegram.ui.ActionBar.k6.d6;
                    checkBox.d(i26, i27, i28, i28);
                    v8Var.a = G.d;
                    v8Var.setIcon(G.t ? R.drawable.permission_locked : 0);
                    if (i13 == 40) {
                        if (!TextUtils.isEmpty(G.o)) {
                            v8Var.a(new ko0(20, G, v8Var), G.o.toString(), G.f);
                            break;
                        } else {
                            LinearLayout linearLayout = v8Var.f;
                            if (linearLayout != null) {
                                linearLayout.setVisibility(8);
                                break;
                            }
                        }
                    }
                    break;
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    org.telegram.ui.Cells.l4 l4Var2 = (org.telegram.ui.Cells.l4) view;
                    l4Var2.c(G.o, l4Var2.a == G.d);
                    l4Var2.a = G.d;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    org.telegram.ui.Cells.ca caVar = (org.telegram.ui.Cells.ca) view;
                    caVar.getValueBackupImageView().setImageDrawable(null);
                    CharSequence charSequence14 = G.l;
                    if (charSequence14 != null) {
                        CharSequence charSequence15 = G.m;
                        if (charSequence15 != null) {
                            caVar.c(charSequence14, charSequence15, false, J);
                        } else {
                            caVar.b(charSequence14, J);
                        }
                    }
                    caVar.setIcon(G.k);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    ((org.telegram.ui.Cells.j6) view).b(G.l.toString(), G.n.toString(), J, G.e);
                    break;
            }
        } else {
            l61 F = m61.F(i13);
            if (F != null) {
                F.bindView(b1Var.a, G, J, this, mm0Var instanceof j71 ? (j71) mm0Var : null);
            }
        }
        Utilities.Callback callback2 = G.F;
        if (callback2 != null) {
            callback2.run(view);
        }
    }

    @Override // s4.g0
    public s4.b1 x(ViewGroup viewGroup, int i10) {
        View h4Var;
        View l4Var;
        View view;
        View view2;
        org.telegram.ui.Cells.l4 l4Var2;
        int i11;
        boolean z10 = this.n;
        int i12 = z10 ? org.telegram.ui.ActionBar.k6.h5 : org.telegram.ui.ActionBar.k6.d6;
        Context context = this.e;
        if (i10 < 10000) {
            int i13 = 8;
            org.telegram.ui.ActionBar.g6 g6Var = this.w;
            switch (i10) {
                case -4:
                case -1:
                    h4Var = new ci.h4(context, 21);
                    if (i10 == -4) {
                        h4Var.setTag(-33024);
                    }
                    view2 = h4Var;
                    break;
                case -3:
                    w61 w61Var = new w61(context);
                    w61Var.a = 0;
                    view2 = w61Var;
                    break;
                case -2:
                    view2 = new ci.h4(context, 22);
                    break;
                case 0:
                    if (!z10) {
                        view2 = new org.telegram.ui.Cells.l4(context, g6Var);
                        break;
                    } else {
                        view = new org.telegram.ui.Cells.l4(this.e, org.telegram.ui.ActionBar.k6.L6, 21, 15, 0, false, false, this.w);
                        view2 = view;
                        break;
                    }
                case 1:
                    l4Var = new org.telegram.ui.Cells.l4(this.e, org.telegram.ui.ActionBar.k6.G6, 17, 15, false, this.w);
                    view2 = l4Var;
                    break;
                case 2:
                    view2 = new a31(context, g6Var);
                    break;
                case 3:
                    org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(context, g6Var);
                    r8Var.setCompactLayout(this.s);
                    view2 = r8Var;
                    break;
                case 4:
                case 9:
                    org.telegram.ui.Cells.w8 w8Var = new org.telegram.ui.Cells.w8(context, g6Var);
                    view = w8Var;
                    if (i10 == 9) {
                        w8Var.setDrawCheckRipple(true);
                        w8Var.d(org.telegram.ui.ActionBar.k6.g6, org.telegram.ui.ActionBar.k6.O6, org.telegram.ui.ActionBar.k6.P6, org.telegram.ui.ActionBar.k6.Q6, org.telegram.ui.ActionBar.k6.R6);
                        w8Var.setTypeface(AndroidUtilities.bold());
                        w8Var.setHeight(56);
                        view = w8Var;
                    }
                    view2 = view;
                    break;
                case 5:
                case 6:
                    l4Var = new org.telegram.ui.Cells.i5(21, 60, this.e, this.w, i10 == 6);
                    view2 = l4Var;
                    break;
                case 7:
                case 8:
                default:
                    view2 = new org.telegram.ui.Cells.e9(context, g6Var);
                    break;
                case 10:
                    org.telegram.ui.Cells.s2 s2Var = new org.telegram.ui.Cells.s2(context);
                    TextView textView = new TextView(context);
                    s2Var.b = textView;
                    org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.G6, null);
                    org.telegram.messenger.sl.u(textView, 1, 16.0f, 1, 1);
                    textView.setSingleLine(true);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView.setEllipsize(truncateAt);
                    textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                    boolean z11 = LocaleController.isRTL;
                    s2Var.addView(textView, w7.z5.d(-1, -1.0f, (z11 ? 5 : 3) | 48, z11 ? 61.0f : 23.0f, 0.0f, z11 ? 23.0f : 61.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    s2Var.c = textView2;
                    org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.I6, null);
                    org.telegram.messenger.sl.u(textView2, 1, 16.0f, 1, 1);
                    textView2.setSingleLine(true);
                    textView2.setEllipsize(truncateAt);
                    textView2.setGravity((LocaleController.isRTL ? 3 : 5) | 16);
                    textView2.setVisibility(8);
                    s2Var.addView(textView2, w7.z5.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 23.0f, 0.0f, 23.0f, 0.0f));
                    RadioButton radioButton = new RadioButton(context);
                    s2Var.d = radioButton;
                    radioButton.setSize(AndroidUtilities.dp(20.0f));
                    org.telegram.ui.ActionBar.r6.Q(radioButton, org.telegram.ui.ActionBar.k6.g7, org.telegram.ui.ActionBar.k6.h7, null);
                    s2Var.addView(radioButton, w7.z5.d(22, 22.0f, (LocaleController.isRTL ? 3 : 5) | 48, 20.0f, 15.0f, 20.0f, 0.0f));
                    s2Var.b();
                    view2 = s2Var;
                    break;
                case 11:
                case 12:
                    org.telegram.ui.Cells.wa waVar = new org.telegram.ui.Cells.wa(context, 6, i10 != 12 ? 0 : 3, false);
                    waVar.setSelfAsSavedMessages(true);
                    view2 = waVar;
                    break;
                case 13:
                    l4Var = new org.telegram.ui.Cells.wa(6, 0, this.e, null, false, true);
                    view2 = l4Var;
                    break;
                case 14:
                    view2 = new sw0(context, g6Var);
                    break;
                case 15:
                    view2 = new org.telegram.ui.Cells.y7(context, g6Var);
                    break;
                case 16:
                    view2 = new ig.v1(context, g6Var, this.M != null);
                    break;
                case 17:
                    view2 = new ig.t1(context, g6Var);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    if (this.E == null) {
                        this.E = new jg.f(null);
                    }
                    view2 = new org.telegram.ui.s91(this.e, this.f, i10 - 18, this.E, this.h);
                    break;
                case 24:
                    view2 = new org.telegram.ui.ge(context, g6Var);
                    break;
                case 25:
                    view2 = new org.telegram.ui.he(context, g6Var);
                    break;
                case 26:
                    l4Var2 = new org.telegram.ui.Cells.l4(this.e, org.telegram.ui.ActionBar.k6.G6, 23, 20, 0, false, false, this.w);
                    l4Var2.setTextSize(20.0f);
                    view2 = l4Var2;
                    break;
                case 27:
                    ei.q9 q9Var = new ei.q9(context, g6Var);
                    q9Var.d(false, false);
                    view2 = q9Var;
                    break;
                case 28:
                    h4Var = new y61(context);
                    h4Var.setTag(-33024);
                    view2 = h4Var;
                    break;
                case 29:
                    view2 = new ig.t(context, g6Var);
                    break;
                case MessageObject.TYPE_GIFT_STARS /* 30 */:
                    view2 = new org.telegram.ui.Cells.h9(context, g6Var);
                    break;
                case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                    mm0 mm0Var = this.d;
                    if (mm0Var != null && mm0Var.c1()) {
                        org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(context, 28, g6Var);
                        u3Var.setNoBackground(true);
                        view2 = u3Var;
                        break;
                    } else {
                        view2 = new org.telegram.ui.Cells.u3(context, g6Var);
                        break;
                    }
                    break;
                case 32:
                    view2 = new org.telegram.ui.Cells.i6(context, null);
                    break;
                case 33:
                    view2 = new org.telegram.ui.Cells.q2(context, true);
                    break;
                case 34:
                    b10 b10Var = new b10(context, g6Var);
                    b10Var.setIsSingleCell(true);
                    view2 = b10Var;
                    break;
                case 35:
                case 36:
                case 37:
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    if (i10 != 35) {
                        if (i10 == 36) {
                            i11 = 6;
                        } else if (i10 == 37) {
                            i13 = 7;
                        } else if (i10 != 41) {
                            i11 = 0;
                        }
                        org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(i11, 21, this.e, this.w, true);
                        z1Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.k6.V6, org.telegram.ui.ActionBar.k6.g7, org.telegram.ui.ActionBar.k6.k7);
                        view2 = z1Var;
                        break;
                    } else {
                        i13 = 4;
                    }
                    i11 = i13;
                    org.telegram.ui.Cells.z1 z1Var2 = new org.telegram.ui.Cells.z1(i11, 21, this.e, this.w, true);
                    z1Var2.getCheckBoxRound().b(org.telegram.ui.ActionBar.k6.V6, org.telegram.ui.ActionBar.k6.g7, org.telegram.ui.ActionBar.k6.k7);
                    view2 = z1Var2;
                case 38:
                    view2 = new org.telegram.ui.Cells.a2(context, g6Var);
                    break;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    view2 = new org.telegram.ui.Cells.v8(context);
                    break;
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    l4Var2 = new org.telegram.ui.Cells.l4(this.e, org.telegram.ui.ActionBar.k6.L6, 21, 15, 0, false, true, this.w);
                    view2 = l4Var2;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    view2 = new org.telegram.ui.Cells.ca(context, 0, g6Var);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    view2 = new org.telegram.ui.Cells.j6(context, false);
                    break;
            }
        } else {
            l61 F = m61.F(i10);
            view2 = F != null ? F.createView(this.e, this.d, this.f, this.h, this.w) : new View(context);
        }
        if (this.r) {
            if (i10 < 10000) {
                switch (i10) {
                }
            }
            org.telegram.ui.ActionBar.r6.i(i12, view2, this.O);
        }
        return new wl0(view2);
    }

    @Override // s4.g0
    public void y(s4.b1 b1Var) {
        Q(b1Var, this.N);
        O(b1Var);
    }
}
