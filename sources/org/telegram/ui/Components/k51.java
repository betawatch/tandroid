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
import org.telegram.ui.f91;
import org.telegram.ui.r91;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class k51 extends zf.b {
    public i51 D;
    public i51 E;
    public int F;
    public boolean G;
    public Utilities.Callback2 H;
    public boolean I;
    public final jl0 d;
    public final Context e;
    public final int f;
    public final int h;
    public final boolean n;
    public Utilities.Callback2 s;
    public final org.telegram.ui.ActionBar.c6 v;
    public tf.f y;
    public boolean r = true;
    public final ArrayList w = new ArrayList();
    public final ArrayList x = new ArrayList();
    public int A = 0;
    public final ArrayList B = new ArrayList();
    public final ArrayList C = new ArrayList();

    public k51(jl0 jl0Var, Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, org.telegram.ui.ActionBar.c6 c6Var) {
        this.d = jl0Var;
        this.e = context;
        this.f = i10;
        this.h = i11;
        this.n = z10;
        this.s = callback2;
        this.v = c6Var;
        N(false);
    }

    public static boolean K(int i10) {
        if (i10 < 10000) {
            return i10 == 7 || i10 == 8 || i10 == 38 || i10 == 31 || i10 == -4 || i10 == 28 || i10 == 2 || i10 == -2;
        }
        v41 F = w41.F(i10);
        return F != null && F.isShadow();
    }

    @Override // org.telegram.ui.Components.il0
    public boolean D(f2.n1 n1Var) {
        int i10 = n1Var.f;
        w41 G = G(n1Var.b());
        if (i10 >= 10000) {
            v41 F = w41.F(i10);
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
            ArrayList arrayList = this.C;
            if (i10 >= arrayList.size()) {
                return;
            }
            i51 i51Var = (i51) arrayList.get(i10);
            this.H.run(Integer.valueOf(i10), new ArrayList(this.x.subList(i51Var.a, i51Var.b + 1)));
            this.G = false;
        }
    }

    public final w41 G(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = this.x;
        if (i10 >= arrayList.size()) {
            return null;
        }
        return (w41) arrayList.get(i10);
    }

    public final int H(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.C;
            if (i11 >= arrayList.size()) {
                return -1;
            }
            i51 i51Var = (i51) arrayList.get(i11);
            if (i10 >= i51Var.a && i10 <= i51Var.b) {
                return i11;
            }
            i11++;
        }
    }

    public int I(int i10) {
        return org.telegram.ui.ActionBar.g6.v0(i10, this.v);
    }

    public final boolean J(int i10) {
        w41 G = G(i10);
        w41 G2 = G(i10 + 1);
        return (G == null || G.j || G2 == null || K(G2.a) != K(G.a)) ? false : true;
    }

    public final void L() {
        i51 i51Var = this.E;
        if (i51Var != null) {
            i51Var.b = Math.max(0, this.x.size() - 1);
        }
    }

    public final int M() {
        i51 i51Var = new i51();
        this.E = i51Var;
        i51Var.a = this.x.size();
        i51 i51Var2 = this.E;
        i51Var2.b = -1;
        this.C.add(i51Var2);
        return r1.size() - 1;
    }

    public void N(boolean z10) {
        jl0 jl0Var = this.d;
        if (jl0Var == null || !jl0Var.b0()) {
            P(z10);
        } else {
            jl0Var.post(new p90(8, this, z10));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void O(f2.n1 n1Var) {
        View view = n1Var.a;
        if (view instanceof org.telegram.ui.ActionBar.x5) {
            ((org.telegram.ui.ActionBar.x5) view).e();
            int i10 = n1Var.f;
            if (this.r) {
                if (i10 < 10000) {
                    switch (i10) {
                    }
                }
                view.setBackgroundColor(I(this.n ? org.telegram.ui.ActionBar.g6.h5 : org.telegram.ui.ActionBar.g6.d6));
            }
        }
    }

    public final void P(boolean z10) {
        jl0 jl0Var = this.d;
        if (jl0Var == null || !jl0Var.b0()) {
            ArrayList arrayList = this.w;
            arrayList.clear();
            ArrayList arrayList2 = this.x;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            this.D = null;
            this.B.clear();
            this.C.clear();
            Utilities.Callback2 callback2 = this.s;
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

    public final void Q(f2.n1 n1Var, boolean z10) {
        if (n1Var == null) {
            return;
        }
        View view = n1Var.a;
        int i10 = n1Var.f;
        if (i10 < 10000) {
            if (i10 != 16) {
                return;
            }
            ((sf.m1) view).setReorder(z10);
        } else {
            v41 F = w41.F(i10);
            if (F != null) {
                F.attachedView(this.d, view, G(n1Var.b()));
            }
        }
    }

    public final void R() {
        jl0 jl0Var = this.d;
        if (jl0Var == null) {
            return;
        }
        ArrayList arrayList = jl0Var.G2;
        if (arrayList == null) {
            jl0Var.G2 = new ArrayList();
        } else {
            arrayList.clear();
        }
        ArrayList arrayList2 = this.B;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            i51 i51Var = (i51) obj;
            jl0Var.G2.add(Long.valueOf(AndroidUtilities.pack(i51Var.a, i51Var.b)));
        }
    }

    public final void S() {
        ArrayList arrayList = this.w;
        arrayList.clear();
        ArrayList arrayList2 = this.x;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        this.B.clear();
        this.C.clear();
        Utilities.Callback2 callback2 = this.s;
        if (callback2 != null) {
            callback2.run(arrayList2, this);
        }
        R();
    }

    public final void T() {
        i51 i51Var = this.D;
        if (i51Var != null) {
            i51Var.b = Math.max(0, (this.x.size() + this.A) - 1);
            i51 i51Var2 = this.D;
            if (i51Var2.a == i51Var2.b) {
                this.B.remove(i51Var2);
            }
            this.D = null;
        }
    }

    public final void U() {
        i51 i51Var = new i51();
        this.D = i51Var;
        i51Var.a = this.x.size() + this.A;
        i51 i51Var2 = this.D;
        i51Var2.b = -1;
        this.B.add(i51Var2);
    }

    @Override // f2.p0
    public final int h() {
        return this.x.size();
    }

    @Override // f2.p0
    public final int j(int i10) {
        w41 G = G(i10);
        if (G == null) {
            return 0;
        }
        return G.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x022c  */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v16 */
    @Override // f2.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void v(f2.n1 n1Var, int i10) {
        String str;
        org.telegram.ui.Cells.y8 y8Var;
        ?? r10;
        TLRPC.Document document;
        long j10;
        String str2;
        ImageLocation imageLocation;
        TLRPC.Photo photo;
        String str3;
        long j11;
        boolean z10;
        char c3;
        boolean z11;
        long j12;
        long j13;
        CharSequence concat;
        int i11;
        int i12 = this.f;
        jl0 jl0Var = this.d;
        w41 G = G(i10);
        w41 G2 = G(i10 + 1);
        w41 G3 = G(i10 - 1);
        if (G == null) {
            return;
        }
        int i13 = n1Var.f;
        View view = n1Var.a;
        boolean J = J(i10);
        O(n1Var);
        if (i13 < 10000) {
            str = "";
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
                            frameLayout.addView(G.c, (i13 == -1 || i13 == -4) ? i7.f6.c(G.z, -1) : i7.f6.c(-2.0f, -2));
                            break;
                        }
                    }
                    break;
                case -3:
                    h51 h51Var = (h51) view;
                    h51Var.a = G.z;
                    h51Var.b = i7.n8.a(G.y, 1);
                    if (h51Var.getChildCount() != (G.c == null ? 0 : 1) || h51Var.getChildAt(0) != G.c) {
                        h51Var.removeAllViews();
                        View view3 = G.c;
                        if (view3 != null) {
                            AndroidUtilities.removeFromParent(view3);
                            h51Var.addView(G.c, i7.f6.c(-1.0f, -1));
                            break;
                        }
                    }
                    break;
                case 0:
                case 1:
                case 26:
                    org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
                    k4Var.setText(G.l);
                    k4Var.b(G.g);
                    break;
                case 2:
                    r11 r11Var = (r11) view;
                    int i14 = G.k;
                    if (i14 == 0) {
                        int i15 = G.z;
                        if (i15 != 0) {
                            r11Var.setEmojiSize(i15);
                        }
                        String charSequence = G.m.toString();
                        String charSequence2 = G.n.toString();
                        r11Var.getClass();
                        MediaDataController.getInstance(UserConfig.selectedAccount).setPlaceholderImage(r11Var.b, charSequence, charSequence2, "90_90");
                    } else if (G.q) {
                        r11Var.setEmojiStatic(i14);
                    } else {
                        r11Var.setEmoji(i14);
                    }
                    if (!TextUtils.isEmpty(G.o)) {
                        CharSequence charSequence3 = G.l;
                        CharSequence charSequence4 = G.o;
                        y80 y80Var = r11Var.c;
                        y80Var.setText(charSequence3);
                        y80Var.setVisibility(0);
                        y80 y80Var2 = r11Var.d;
                        y80Var2.setText(charSequence4);
                        y80Var2.setMaxWidth(nh.t3.a(charSequence4, y80Var2.getPaint()));
                        y80Var2.requestLayout();
                        r11Var.e();
                        break;
                    } else {
                        r11Var.setText(G.l);
                        break;
                    }
                case 3:
                    org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
                    Object obj = G.G;
                    if (obj instanceof TLRPC.Document) {
                        CharSequence charSequence5 = G.l;
                        TLRPC.Document document2 = (TLRPC.Document) obj;
                        m8Var.w = 16;
                        m8Var.s = 58;
                        org.telegram.ui.ActionBar.h5 h5Var = m8Var.a;
                        h5Var.l(charSequence5, false);
                        h5Var.i(null);
                        o6 o6Var = m8Var.c;
                        m8Var.I = null;
                        o6Var.c(null, false, true);
                        m8Var.h.setVisibility(8);
                        o6Var.setVisibility(8);
                        m8Var.d.setVisibility(8);
                        aj0 aj0Var = m8Var.e;
                        aj0Var.setVisibility(8);
                        aj0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
                        m8Var.r = J;
                        m8Var.setWillNotDraw(!J);
                        Switch r12 = m8Var.f;
                        if (r12 != null) {
                            r12.setVisibility(8);
                        }
                        m8Var.setValueSticker(document2);
                    } else if (obj instanceof String) {
                        CharSequence charSequence6 = G.l;
                        String str4 = (String) obj;
                        m8Var.w = 16;
                        m8Var.s = 58;
                        org.telegram.ui.ActionBar.h5 h5Var2 = m8Var.a;
                        h5Var2.l(charSequence6, false);
                        h5Var2.i(null);
                        o6 o6Var2 = m8Var.c;
                        m8Var.I = null;
                        o6Var2.c(null, false, true);
                        m8Var.h.setVisibility(8);
                        o6Var2.setVisibility(8);
                        m8Var.d.setVisibility(8);
                        aj0 aj0Var2 = m8Var.e;
                        aj0Var2.setVisibility(8);
                        aj0Var2.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
                        m8Var.r = J;
                        m8Var.setWillNotDraw(!J);
                        Switch r13 = m8Var.f;
                        if (r13 != null) {
                            r13.setVisibility(8);
                        }
                        m8Var.setValueSticker(str4);
                    } else if (TextUtils.isEmpty(G.n)) {
                        Object obj2 = G.G;
                        if (obj2 instanceof Drawable) {
                            m8Var.n(G.l, (Drawable) obj2, J);
                        } else {
                            int i16 = G.k;
                            if (i16 == 0) {
                                m8Var.i(G.l, J);
                            } else {
                                m8Var.m(i16, G.l, J);
                            }
                        }
                    } else {
                        Object obj3 = G.G;
                        if (obj3 instanceof Drawable) {
                            m8Var.r(G.l, G.n, (Drawable) obj3, J);
                        } else {
                            int i17 = G.k;
                            if (i17 == 0) {
                                m8Var.o(G.l, G.n, false, J);
                            } else {
                                m8Var.s(G.l, G.n, false, i17, J);
                            }
                        }
                    }
                    if (G.q) {
                        int i18 = org.telegram.ui.ActionBar.g6.q6;
                        m8Var.e(i18, i18);
                    } else if (G.r) {
                        m8Var.e(org.telegram.ui.ActionBar.g6.q7, org.telegram.ui.ActionBar.g6.p7);
                    } else {
                        m8Var.e(org.telegram.ui.ActionBar.g6.m6, org.telegram.ui.ActionBar.g6.G6);
                    }
                    m8Var.g(G.g);
                    break;
                case 4:
                case 9:
                    org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                    if (q8Var.b == G.d) {
                        q8Var.setChecked(G.e);
                    }
                    q8Var.e(null, G.g);
                    q8Var.f(G.l, G.e, J);
                    q8Var.b = G.d;
                    if (i13 == 9) {
                        view.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, G.e ? org.telegram.ui.ActionBar.g6.f6 : org.telegram.ui.ActionBar.g6.e6, false));
                        break;
                    }
                    break;
                case 5:
                    org.telegram.ui.Cells.h5 h5Var3 = (org.telegram.ui.Cells.h5) view;
                    CharSequence charSequence7 = G.m;
                    h5Var3.b(G.l, G.m, 0, G.e, 0, charSequence7 != null && charSequence7.toString().contains("\n"), J, false);
                    break;
                case 6:
                    ((org.telegram.ui.Cells.h5) view).b(G.l, G.m, 0, G.e, 0, false, J, false);
                    break;
                case 7:
                case 8:
                case 38:
                    if (i13 == 7 || i13 == 8) {
                        org.telegram.ui.Cells.y8 y8Var2 = (org.telegram.ui.Cells.y8) view;
                        if (TextUtils.isEmpty(G.l)) {
                            y8Var2.setFixedSize(i13 == 8 ? 220 : 12);
                            y8Var2.setText("");
                        } else {
                            y8Var2.setFixedSize(0);
                            y8Var2.setText(G.l);
                        }
                        if (G.q) {
                            y8Var2.setTextGravity(17);
                            y8Var2.getTextView().setWidth(Math.min(nh.t3.a(y8Var2.getText(), y8Var2.getTextView().getPaint()), AndroidUtilities.displaySize.x - AndroidUtilities.dp(60.0f)));
                            y8Var2.getTextView().setPadding(0, AndroidUtilities.dp(17.0f), 0, AndroidUtilities.dp(17.0f));
                            y8Var = y8Var2;
                        } else {
                            y8Var2.setTextGravity(8388611);
                            y8Var2.getTextView().setMinWidth(0);
                            y8Var2.getTextView().setMaxWidth(AndroidUtilities.displaySize.x);
                            y8Var2.getTextView().setPadding(0, AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(17.0f));
                            y8Var = y8Var2;
                        }
                    } else if (i13 == 38) {
                        org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) view;
                        CharSequence charSequence8 = G.o;
                        boolean z12 = G.f;
                        z1Var.a.setText(charSequence8);
                        View view4 = z1Var.b;
                        view4.animate().cancel();
                        view4.animate().rotation(z12 ? 0.0f : 180.0f).setDuration(340L).setInterpolator(jr.h).start();
                        if (G.q) {
                            z1Var.setColor(org.telegram.ui.ActionBar.g6.q6);
                            y8Var = z1Var;
                        } else if (G.r) {
                            z1Var.setColor(org.telegram.ui.ActionBar.g6.p7);
                            y8Var = z1Var;
                        } else {
                            z1Var.setColor(org.telegram.ui.ActionBar.g6.G6);
                            y8Var = z1Var;
                        }
                    } else {
                        y8Var = null;
                    }
                    boolean z13 = (G3 == null || K(G3.a)) ? false : true;
                    boolean z14 = (G2 == null || K(G2.a)) ? false : true;
                    if (!jl0Var.b1()) {
                        Drawable U0 = org.telegram.ui.ActionBar.g6.U0(this.e, (z13 && z14) ? R.drawable.greydivider : z13 ? R.drawable.greydivider_bottom : z14 ? R.drawable.greydivider_top : R.drawable.field_carret_empty, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.b7, this.v));
                        if (!this.n) {
                            y8Var.setBackground(U0);
                            break;
                        } else {
                            y8Var.setBackground(new LayerDrawable(new Drawable[]{new ColorDrawable(I(org.telegram.ui.ActionBar.g6.i5)), U0}));
                            break;
                        }
                    } else {
                        y8Var.setBackground(null);
                        break;
                    }
                    break;
                case 10:
                    org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
                    int i19 = r2Var.a;
                    TextView textView = r2Var.b;
                    TextView textView2 = r2Var.c;
                    RadioButton radioButton = r2Var.d;
                    if (i19 == G.d) {
                        radioButton.a(G.e, true);
                        r2Var.a(G.g, true);
                        r10 = 0;
                    } else {
                        r10 = 0;
                        r2Var.a(G.g, false);
                    }
                    if (TextUtils.isEmpty(G.n)) {
                        CharSequence charSequence9 = G.l;
                        boolean z15 = G.e;
                        textView2.setVisibility(8);
                        textView.setText(charSequence9);
                        radioButton.a(z15, r10);
                        r2Var.e = J;
                        r2Var.b();
                        r2Var.setWillNotDraw(!J);
                    } else {
                        CharSequence charSequence10 = G.l;
                        CharSequence charSequence11 = G.n;
                        boolean z16 = G.e;
                        textView2.setVisibility(r10);
                        textView2.setText(charSequence11);
                        textView.setText(charSequence10);
                        radioButton.a(z16, r10);
                        r2Var.e = J;
                        r2Var.b();
                        r2Var.setWillNotDraw(!J);
                    }
                    r2Var.a = G.d;
                    break;
                case 11:
                case 12:
                    org.telegram.ui.Cells.sa saVar = (org.telegram.ui.Cells.sa) view;
                    saVar.h(i12, G, J);
                    if (i13 == 12) {
                        saVar.c(G.e, false);
                        break;
                    }
                    break;
                case 13:
                    org.telegram.ui.Cells.sa saVar2 = (org.telegram.ui.Cells.sa) view;
                    saVar2.h(i12, G, J);
                    CharSequence charSequence12 = G.n;
                    saVar2.setQuery(charSequence12 == null ? null : charSequence12.toString().toLowerCase());
                    saVar2.setAddButtonVisible(!G.e);
                    saVar2.setCloseIcon(G.D);
                    break;
                case 14:
                    lv0 lv0Var = (lv0) view;
                    lv0Var.b(G.z, null, G.p);
                    lv0Var.setMinAllowedIndex((int) G.B);
                    lv0Var.setCallback(new cv(G, 26));
                    break;
                case 15:
                    org.telegram.ui.Cells.v7 v7Var = (org.telegram.ui.Cells.v7) view;
                    v7Var.d(G.z, (org.telegram.ui.Cells.u7) G.G, G.C);
                    v7Var.setMinValueAllowed((int) G.B);
                    break;
                case 16:
                    sf.m1 m1Var = (sf.m1) view;
                    m1Var.d.a(G.e, false);
                    m1Var.setReorder(this.I);
                    Object obj4 = G.G;
                    if (obj4 instanceof sf.r1) {
                        m1Var.a((sf.r1) obj4, null, J);
                        break;
                    }
                    break;
                case 17:
                    sf.l1 l1Var = (sf.l1) view;
                    l1Var.e.a(G.e, false);
                    Object obj5 = G.G;
                    if (obj5 instanceof sf.r1) {
                        sf.r1 r1Var = (sf.r1) obj5;
                        e9 e9Var = l1Var.a;
                        int[] iArr = l1Var.r;
                        TextView textView3 = l1Var.d;
                        ImageReceiver imageReceiver = l1Var.b;
                        int i20 = UserConfig.selectedAccount;
                        l1Var.c.setText(MessagesController.getInstance(i20).getPeerName(UserConfig.getInstance(i20).getClientUserId()));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        MessageObject messageObject = r1Var.e;
                        if (messageObject != null) {
                            spannableStringBuilder.append(Emoji.replaceEmoji(messageObject.messageText, textView3.getPaint().getFontMetricsInt(), false));
                        }
                        if (r1Var.a() > 1) {
                            spannableStringBuilder.append((CharSequence) "  ");
                            int dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(80.0f);
                            int a2 = r1Var.a() - 1;
                            int i21 = b0.d;
                            SpannableString spannableString = new SpannableString("+");
                            b0 b0Var = new b0(a2);
                            iArr[0] = (int) (((zz0) b0Var.c).c + AndroidUtilities.dp(10.0f));
                            spannableString.setSpan(b0Var, 0, spannableString.length(), 33);
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(TextUtils.ellipsize(spannableStringBuilder, textView3.getPaint(), (dp * 1.5f) - iArr[0], TextUtils.TruncateAt.END));
                            if (spannableStringBuilder2.length() > 0 && spannableStringBuilder2.charAt(spannableStringBuilder2.length() - 1) == 8230) {
                                spannableStringBuilder2.append((CharSequence) "  ");
                            }
                            spannableStringBuilder2.append((CharSequence) spannableString);
                            spannableStringBuilder = spannableStringBuilder2;
                        }
                        textView3.setText(spannableStringBuilder);
                        TLRPC.MessageMedia media = MessageObject.getMedia(r1Var.e);
                        if (media != null && (photo = media.photo) != null) {
                            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(36.0f), true, null, true);
                            ImageLocation forObject = ImageLocation.getForObject(closestPhotoSizeWithSize, media.photo);
                            MessageObject messageObject2 = r1Var.e;
                            imageReceiver.setImage(forObject, "36_36", messageObject2.strippedThumb, closestPhotoSizeWithSize == null ? 0L : closestPhotoSizeWithSize.size, (String) null, messageObject2, 0);
                            imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
                        } else if (media == null || (document = media.document) == null) {
                            e9Var.r(UserConfig.getInstance(i20).getCurrentUser());
                            imageReceiver.setForUserOrChat(UserConfig.getInstance(i20).getCurrentUser(), e9Var);
                            imageReceiver.setRoundRadius(AndroidUtilities.dp(56.0f));
                        } else {
                            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(36.0f), true, null, true);
                            if (closestPhotoSizeWithSize2 == null) {
                                ImageLocation forDocument = ImageLocation.getForDocument(media.document);
                                j10 = media.document.size;
                                imageLocation = forDocument;
                                str2 = ImageLoader.AUTOPLAY_FILTER;
                            } else {
                                ImageLocation forObject2 = ImageLocation.getForObject(closestPhotoSizeWithSize2, media.document);
                                j10 = closestPhotoSizeWithSize2.size;
                                str2 = "36_36";
                                imageLocation = forObject2;
                            }
                            long j14 = j10;
                            MessageObject messageObject3 = r1Var.e;
                            imageReceiver.setImage(imageLocation, str2, messageObject3.strippedThumb, j14, (String) null, messageObject3, 0);
                            imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
                        }
                        l1Var.s = J;
                        l1Var.invalidate();
                        break;
                    }
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    r91 r91Var = (r91) view;
                    int i22 = G.z;
                    f91 f91Var = (f91) G.G;
                    g51 g51Var = new g51(0, this, G);
                    r91Var.x = i22;
                    r91Var.y = g51Var;
                    r91Var.e(f91Var, false);
                    break;
                case 24:
                    ((org.telegram.ui.be) view).set((org.telegram.ui.ae) G.G);
                    break;
                case 25:
                    org.telegram.ui.ce ceVar = (org.telegram.ui.ce) view;
                    TL_stats.BroadcastRevenueTransaction broadcastRevenueTransaction = (TL_stats.BroadcastRevenueTransaction) G.G;
                    x5 x5Var = ceVar.b;
                    org.telegram.ui.ActionBar.c6 c6Var = ceVar.a;
                    TextView textView4 = ceVar.c;
                    TextView textView5 = ceVar.d;
                    if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionWithdrawal) {
                        TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
                        textView4.setText(LocaleController.getString(R.string.MonetizationTransactionWithdraw));
                        if (tL_broadcastRevenueTransactionWithdrawal.pending) {
                            textView5.setText(LocaleController.getString(R.string.MonetizationTransactionPending));
                            z10 = false;
                        } else {
                            z10 = tL_broadcastRevenueTransactionWithdrawal.failed;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(LocaleController.formatShortDateTime(tL_broadcastRevenueTransactionWithdrawal.date));
                            sb2.append(z10 ? org.telegram.messenger.x3.i(R.string.MonetizationTransactionNotCompleted, new StringBuilder(" — ")) : "");
                            textView5.setText(sb2.toString());
                        }
                        j11 = tL_broadcastRevenueTransactionWithdrawal.amount;
                        str3 = "+";
                        c3 = 65535;
                    } else {
                        if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionProceeds) {
                            textView4.setText(LocaleController.getString(R.string.MonetizationTransactionProceed));
                            StringBuilder sb3 = new StringBuilder();
                            str3 = "+";
                            sb3.append(LocaleController.formatShortDateTime(r5.from_date));
                            sb3.append(" - ");
                            sb3.append(LocaleController.formatShortDateTime(r5.to_date));
                            textView5.setText(sb3.toString());
                            j11 = ((TL_stats.TL_broadcastRevenueTransactionProceeds) broadcastRevenueTransaction).amount;
                        } else {
                            str3 = "+";
                            if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionRefund) {
                                textView4.setText(LocaleController.getString(R.string.MonetizationTransactionRefund));
                                textView5.setText(LocaleController.formatShortDateTime(r5.from_date));
                                j11 = ((TL_stats.TL_broadcastRevenueTransactionRefund) broadcastRevenueTransaction).amount;
                            }
                        }
                        z10 = false;
                        c3 = 1;
                    }
                    textView5.setTextColor(org.telegram.ui.ActionBar.g6.v0(z10 ? org.telegram.ui.ActionBar.g6.p7 : org.telegram.ui.ActionBar.g6.y6, c6Var));
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                    spannableStringBuilder3.append((CharSequence) (c3 < 0 ? "-" : str3));
                    spannableStringBuilder3.append((CharSequence) "TON ");
                    spannableStringBuilder3.append((CharSequence) ceVar.e.format(Math.abs(j11) / 1.0E9d));
                    int indexOf = TextUtils.indexOf(spannableStringBuilder3, ".");
                    if (indexOf >= 0) {
                        z11 = false;
                        spannableStringBuilder3.setSpan(new RelativeSizeSpan(1.15f), 0, indexOf + 1, 33);
                    } else {
                        z11 = false;
                    }
                    x5Var.setText(org.telegram.ui.de.f0(spannableStringBuilder3, x5Var.getPaint(), 1.1f, AndroidUtilities.dp(0.33f), z11));
                    x5Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(c3 < 0 ? org.telegram.ui.ActionBar.g6.q7 : org.telegram.ui.ActionBar.g6.l8, c6Var));
                    ceVar.f = J;
                    ceVar.setWillNotDraw(!J);
                    break;
                case 27:
                    nh.d9 d9Var = (nh.d9) view;
                    long j15 = d9Var.x;
                    Object obj6 = G.G;
                    if (!(obj6 instanceof TLRPC.User)) {
                        if (!(obj6 instanceof TLRPC.Chat)) {
                            j12 = 0;
                            boolean z17 = j15 != j12;
                            d9Var.d(false, true);
                            d9Var.set(G.G);
                            d9Var.f.setVisibility(8);
                            d9Var.h.setVisibility(0);
                            d9Var.c(G.e, z17);
                            d9Var.setDivider(J);
                            break;
                        } else {
                            j13 = -((TLRPC.Chat) obj6).id;
                        }
                    } else {
                        j13 = ((TLRPC.User) obj6).id;
                    }
                    j12 = j13;
                    if (j15 != j12) {
                    }
                    d9Var.d(false, true);
                    d9Var.set(G.G);
                    d9Var.f.setVisibility(8);
                    d9Var.h.setVisibility(0);
                    d9Var.c(G.e, z17);
                    d9Var.setDivider(J);
                case 28:
                    if (G.s) {
                        view.setBackgroundColor(0);
                    } else {
                        int i23 = G.k;
                        if (i23 != 0) {
                            view.setBackgroundColor(i23);
                        }
                    }
                    view.setId(G.d);
                    ((j51) view).setHeight(G.z);
                    break;
                case 29:
                    sf.p pVar = (sf.p) view;
                    Object obj7 = G.G;
                    if (obj7 instanceof sf.q) {
                        org.telegram.ui.ActionBar.h5 h5Var4 = pVar.a;
                        org.telegram.ui.ActionBar.h5 h5Var5 = pVar.c;
                        gh.s sVar = pVar.b;
                        pVar.e = J;
                        TL_account.TL_businessChatLink tL_businessChatLink = ((sf.q) obj7).a;
                        pVar.f = tL_businessChatLink;
                        if (TextUtils.isEmpty(tL_businessChatLink.title)) {
                            String str5 = pVar.f.link;
                            sf.u[] uVarArr = sf.u.e;
                            if (str5.startsWith("https://")) {
                                str5 = str5.substring(8);
                            }
                            h5Var4.l(str5, false);
                        } else {
                            h5Var4.l(pVar.f.title, false);
                        }
                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(pVar.f.message);
                        TL_account.TL_businessChatLink tL_businessChatLink2 = pVar.f;
                        MediaDataController.addTextStyleRuns(tL_businessChatLink2.entities, tL_businessChatLink2.message, spannableStringBuilder4);
                        CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder4, sVar.getPaint().getFontMetricsInt(), false);
                        MessageObject.replaceAnimatedEmoji(replaceEmoji, pVar.f.entities, sVar.getPaint().getFontMetricsInt());
                        sVar.setText(replaceEmoji);
                        int i24 = pVar.f.views;
                        if (i24 == 0) {
                            h5Var5.l(LocaleController.formatString(R.string.NoClicks, new Object[0]), false);
                        } else {
                            h5Var5.l(LocaleController.formatPluralString("Clicks", i24, new Object[0]), false);
                        }
                        h5Var5.requestLayout();
                        pVar.invalidate();
                        break;
                    }
                    break;
                case MessageObject.TYPE_GIFT_STARS /* 30 */:
                    org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
                    CharSequence charSequence13 = G.l;
                    int i25 = G.k;
                    b9Var.b.l(charSequence13, false);
                    b9Var.a.setImageResource(i25);
                    b9Var.setDivider(J);
                    b9Var.setBackgroundColor(I(org.telegram.ui.ActionBar.g6.h5));
                    break;
                case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                    org.telegram.ui.Cells.s3 s3Var = (org.telegram.ui.Cells.s3) view;
                    if (!TextUtils.equals(s3Var.getText(), G.l)) {
                        s3Var.c(G.l, G.m, G.D);
                        break;
                    } else {
                        s3Var.b(G.m, G.D);
                        break;
                    }
                case 32:
                    org.telegram.ui.Cells.f6 f6Var = (org.telegram.ui.Cells.f6) view;
                    Object obj8 = G.G;
                    if (G.q && (obj8 instanceof TLRPC.User) && (i11 = ((TLRPC.User) obj8).bot_active_users) != 0) {
                        if (i11 != 0) {
                            concat = LocaleController.formatPluralStringSpaced("BotUsers", i11);
                            if (!(obj8 instanceof TLRPC.Chat)) {
                            }
                            String str6 = str;
                            boolean z18 = G.t;
                            Object obj9 = G.H;
                            if (obj9 instanceof Utilities.Callback) {
                            }
                            f6Var.x0 = z18;
                            f6Var.y0 = r10;
                            f6Var.setRectangularAvatar(G.r);
                            CharSequence charSequence14 = G.m;
                            f6Var.t(obj8, null, str6, charSequence14 == null ? charSequence14 : concat, false, false);
                            f6Var.s(G.e, false);
                            f6Var.I = J;
                        }
                        concat = "";
                        if (!(obj8 instanceof TLRPC.Chat)) {
                        }
                        String str62 = str;
                        boolean z182 = G.t;
                        Object obj92 = G.H;
                        if (obj92 instanceof Utilities.Callback) {
                        }
                        f6Var.x0 = z182;
                        f6Var.y0 = r10;
                        f6Var.setRectangularAvatar(G.r);
                        CharSequence charSequence142 = G.m;
                        f6Var.t(obj8, null, str62, charSequence142 == null ? charSequence142 : concat, false, false);
                        f6Var.s(G.e, false);
                        f6Var.I = J;
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
                                String str622 = str;
                                boolean z1822 = G.t;
                                Object obj922 = G.H;
                                Utilities.Callback callback = obj922 instanceof Utilities.Callback ? (Utilities.Callback) obj922 : null;
                                f6Var.x0 = z1822;
                                f6Var.y0 = callback;
                                f6Var.setRectangularAvatar(G.r);
                                CharSequence charSequence1422 = G.m;
                                f6Var.t(obj8, null, str622, charSequence1422 == null ? charSequence1422 : concat, false, false);
                                f6Var.s(G.e, false);
                                f6Var.I = J;
                                break;
                            }
                        }
                        concat = "";
                        if (!(obj8 instanceof TLRPC.Chat)) {
                        }
                        String str6222 = str;
                        boolean z18222 = G.t;
                        Object obj9222 = G.H;
                        if (obj9222 instanceof Utilities.Callback) {
                        }
                        f6Var.x0 = z18222;
                        f6Var.y0 = callback;
                        f6Var.setRectangularAvatar(G.r);
                        CharSequence charSequence14222 = G.m;
                        f6Var.t(obj8, null, str6222, charSequence14222 == null ? charSequence14222 : concat, false, false);
                        f6Var.s(G.e, false);
                        f6Var.I = J;
                    }
                    break;
                case 33:
                    org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) view;
                    Object obj10 = G.G;
                    MessageObject messageObject4 = obj10 instanceof MessageObject ? (MessageObject) obj10 : null;
                    p2Var.o2 = J;
                    if (messageObject4 != null) {
                        p2Var.W(messageObject4.getDialogId(), messageObject4, messageObject4.messageOwner.date, false, false);
                        break;
                    } else {
                        p2Var.W(0L, null, 0, false, false);
                        break;
                    }
                case 34:
                    ((p00) view).setViewType(G.z);
                    break;
                case 35:
                case 36:
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) view;
                    y1Var.setPad(G.i);
                    y1Var.e(G.l, "", G.e, J, y1Var.a == G.d);
                    y1Var.a = G.d;
                    y1Var.setIcon(G.t ? R.drawable.permission_locked : 0);
                    if (i13 == 36 || i13 == 41) {
                        boolean z19 = G.f;
                        CharSequence charSequence15 = G.o;
                        View.OnClickListener onClickListener = G.D;
                        org.telegram.ui.Cells.x1 x1Var = y1Var.v;
                        if (x1Var != null) {
                            o6 o6Var3 = x1Var.b;
                            o6Var3.a();
                            o6Var3.setText(charSequence15);
                            View view5 = x1Var.c;
                            view5.animate().cancel();
                            view5.animate().rotation(z19 ? 0.0f : 180.0f).setDuration(340L).setInterpolator(jr.h).start();
                            if (onClickListener != null) {
                                x1Var.setOnClickListener(onClickListener);
                                break;
                            }
                        }
                    }
                    break;
                case 37:
                    org.telegram.ui.Cells.y1 y1Var2 = (org.telegram.ui.Cells.y1) view;
                    y1Var2.setPad(G.i);
                    y1Var2.setUserOrChat((TLObject) G.G);
                    y1Var2.c(G.e, y1Var2.a == G.d);
                    y1Var2.a = G.d;
                    y1Var2.setNeedDivider(J);
                    break;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
                    p8Var.d(G.l.toString(), G.e, J, p8Var.a == G.d);
                    p8Var.getCheckBox().setDrawIconType(G.z);
                    Switch checkBox = p8Var.getCheckBox();
                    int i26 = G.z == 0 ? org.telegram.ui.ActionBar.g6.M6 : org.telegram.ui.ActionBar.g6.r7;
                    int i27 = org.telegram.ui.ActionBar.g6.N6;
                    int i28 = org.telegram.ui.ActionBar.g6.d6;
                    checkBox.d(i26, i27, i28, i28);
                    p8Var.a = G.d;
                    p8Var.setIcon(G.t ? R.drawable.permission_locked : 0);
                    if (i13 == 40) {
                        if (!TextUtils.isEmpty(G.o)) {
                            p8Var.a(new ii0(24, G, p8Var), G.o.toString(), G.f);
                            break;
                        } else {
                            LinearLayout linearLayout = p8Var.f;
                            if (linearLayout != null) {
                                linearLayout.setVisibility(8);
                                break;
                            }
                        }
                    }
                    break;
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    org.telegram.ui.Cells.k4 k4Var2 = (org.telegram.ui.Cells.k4) view;
                    k4Var2.c(G.o, k4Var2.a == G.d);
                    k4Var2.a = G.d;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    org.telegram.ui.Cells.y9 y9Var = (org.telegram.ui.Cells.y9) view;
                    y9Var.getValueBackupImageView().setImageDrawable(null);
                    CharSequence charSequence16 = G.l;
                    if (charSequence16 != null) {
                        CharSequence charSequence17 = G.m;
                        if (charSequence17 != null) {
                            y9Var.c(charSequence16, charSequence17, false, J);
                        } else {
                            y9Var.b(charSequence16, J);
                        }
                    }
                    y9Var.setIcon(G.k);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    ((org.telegram.ui.Cells.g6) view).b(G.l.toString(), G.n.toString(), J, G.e);
                    break;
            }
        } else {
            v41 F = w41.F(i13);
            if (F != null) {
                F.bindView(n1Var.a, G, J, this, jl0Var instanceof u51 ? (u51) jl0Var : null);
            }
        }
        org.telegram.ui.x3 x3Var = G.F;
        if (x3Var != null) {
            x3Var.run(view);
        }
    }

    @Override // f2.p0
    public f2.n1 x(ViewGroup viewGroup, int i10) {
        View dVar;
        View k4Var;
        View view;
        View view2;
        org.telegram.ui.Cells.k4 k4Var2;
        boolean z10 = this.n;
        int i11 = z10 ? org.telegram.ui.ActionBar.g6.h5 : org.telegram.ui.ActionBar.g6.d6;
        Context context = this.e;
        if (i10 < 10000) {
            org.telegram.ui.ActionBar.c6 c6Var = this.v;
            switch (i10) {
                case -4:
                case -1:
                    dVar = new bh.d(context, 22);
                    if (i10 == -4) {
                        dVar.setTag(-33024);
                    }
                    view2 = dVar;
                    break;
                case -3:
                    h51 h51Var = new h51(context);
                    h51Var.a = 0;
                    view2 = h51Var;
                    break;
                case -2:
                    view2 = new bh.d(context, 23);
                    break;
                case 0:
                    if (!z10) {
                        view2 = new org.telegram.ui.Cells.k4(context, c6Var);
                        break;
                    } else {
                        view = new org.telegram.ui.Cells.k4(this.e, org.telegram.ui.ActionBar.g6.L6, 21, 15, 0, false, false, this.v);
                        view2 = view;
                        break;
                    }
                case 1:
                    k4Var = new org.telegram.ui.Cells.k4(this.e, org.telegram.ui.ActionBar.g6.G6, 17, 15, false, this.v);
                    view2 = k4Var;
                    break;
                case 2:
                    view2 = new r11(context, c6Var);
                    break;
                case 3:
                    view2 = new org.telegram.ui.Cells.m8(context, c6Var);
                    break;
                case 4:
                case 9:
                    org.telegram.ui.Cells.q8 q8Var = new org.telegram.ui.Cells.q8(context, c6Var);
                    view = q8Var;
                    if (i10 == 9) {
                        q8Var.setDrawCheckRipple(true);
                        q8Var.d(org.telegram.ui.ActionBar.g6.g6, org.telegram.ui.ActionBar.g6.O6, org.telegram.ui.ActionBar.g6.P6, org.telegram.ui.ActionBar.g6.Q6, org.telegram.ui.ActionBar.g6.R6);
                        q8Var.setTypeface(AndroidUtilities.bold());
                        q8Var.setHeight(56);
                        view = q8Var;
                    }
                    view2 = view;
                    break;
                case 5:
                case 6:
                    k4Var = new org.telegram.ui.Cells.h5(21, 60, this.e, this.v, i10 == 6);
                    view2 = k4Var;
                    break;
                case 7:
                case 8:
                default:
                    view2 = new org.telegram.ui.Cells.y8(context, c6Var);
                    break;
                case 10:
                    org.telegram.ui.Cells.r2 r2Var = new org.telegram.ui.Cells.r2(context);
                    TextView textView = new TextView(context);
                    r2Var.b = textView;
                    org.telegram.ui.b.r(textView, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false), 1, 16.0f, 1);
                    textView.setMaxLines(1);
                    textView.setSingleLine(true);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView.setEllipsize(truncateAt);
                    textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                    boolean z11 = LocaleController.isRTL;
                    r2Var.addView(textView, i7.f6.d(-1, -1.0f, (z11 ? 5 : 3) | 48, z11 ? 61.0f : 23.0f, 0.0f, z11 ? 23.0f : 61.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    r2Var.c = textView2;
                    org.telegram.ui.b.r(textView2, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.I6, false), 1, 16.0f, 1);
                    textView2.setMaxLines(1);
                    textView2.setSingleLine(true);
                    textView2.setEllipsize(truncateAt);
                    textView2.setGravity((LocaleController.isRTL ? 3 : 5) | 16);
                    textView2.setVisibility(8);
                    r2Var.addView(textView2, i7.f6.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 23.0f, 0.0f, 23.0f, 0.0f));
                    RadioButton radioButton = new RadioButton(context);
                    r2Var.d = radioButton;
                    radioButton.setSize(AndroidUtilities.dp(20.0f));
                    radioButton.b(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.g7, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.h7, false));
                    r2Var.addView(radioButton, i7.f6.d(22, 22.0f, (LocaleController.isRTL ? 3 : 5) | 48, 20.0f, 15.0f, 20.0f, 0.0f));
                    r2Var.b();
                    view2 = r2Var;
                    break;
                case 11:
                case 12:
                    org.telegram.ui.Cells.sa saVar = new org.telegram.ui.Cells.sa(context, 6, i10 != 12 ? 0 : 3, false);
                    saVar.setSelfAsSavedMessages(true);
                    view2 = saVar;
                    break;
                case 13:
                    k4Var = new org.telegram.ui.Cells.sa(6, 0, this.e, null, false, true);
                    view2 = k4Var;
                    break;
                case 14:
                    view2 = new lv0(context, c6Var);
                    break;
                case 15:
                    view2 = new org.telegram.ui.Cells.v7(context, c6Var);
                    break;
                case 16:
                    view2 = new sf.m1(context, c6Var, this.H != null);
                    break;
                case 17:
                    view2 = new sf.l1(context, c6Var);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    if (this.y == null) {
                        this.y = new tf.f(null);
                    }
                    view2 = new r91(this.e, this.f, i10 - 18, this.y, this.h);
                    break;
                case 24:
                    view2 = new org.telegram.ui.be(context, c6Var);
                    break;
                case 25:
                    view2 = new org.telegram.ui.ce(context, c6Var);
                    break;
                case 26:
                    k4Var2 = new org.telegram.ui.Cells.k4(this.e, org.telegram.ui.ActionBar.g6.G6, 23, 20, 0, false, false, this.v);
                    k4Var2.setTextSize(20.0f);
                    view2 = k4Var2;
                    break;
                case 27:
                    nh.d9 d9Var = new nh.d9(context, c6Var);
                    d9Var.d(false, false);
                    view2 = d9Var;
                    break;
                case 28:
                    dVar = new j51(context);
                    dVar.setTag(-33024);
                    view2 = dVar;
                    break;
                case 29:
                    view2 = new sf.p(context, c6Var);
                    break;
                case MessageObject.TYPE_GIFT_STARS /* 30 */:
                    view2 = new org.telegram.ui.Cells.b9(context, c6Var);
                    break;
                case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                    jl0 jl0Var = this.d;
                    if (jl0Var != null && jl0Var.b1()) {
                        org.telegram.ui.Cells.s3 s3Var = new org.telegram.ui.Cells.s3(context, 28, c6Var);
                        s3Var.setNoBackground(true);
                        view2 = s3Var;
                        break;
                    } else {
                        view2 = new org.telegram.ui.Cells.s3(context, c6Var);
                        break;
                    }
                    break;
                case 32:
                    view2 = new org.telegram.ui.Cells.f6(context, null);
                    break;
                case 33:
                    view2 = new org.telegram.ui.Cells.p2(context, true);
                    break;
                case 34:
                    p00 p00Var = new p00(context, c6Var);
                    p00Var.setIsSingleCell(true);
                    view2 = p00Var;
                    break;
                case 35:
                case 36:
                case 37:
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(i10 == 35 ? 4 : i10 == 36 ? 6 : i10 == 37 ? 7 : i10 == 41 ? 8 : 0, 21, this.e, this.v, true);
                    y1Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.g6.V6, org.telegram.ui.ActionBar.g6.g7, org.telegram.ui.ActionBar.g6.k7);
                    view2 = y1Var;
                    break;
                case 38:
                    view2 = new org.telegram.ui.Cells.z1(context, c6Var);
                    break;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    view2 = new org.telegram.ui.Cells.p8(context);
                    break;
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    k4Var2 = new org.telegram.ui.Cells.k4(this.e, org.telegram.ui.ActionBar.g6.L6, 21, 15, 0, false, true, this.v);
                    view2 = k4Var2;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    view2 = new org.telegram.ui.Cells.y9(context, 0, c6Var);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    view2 = new org.telegram.ui.Cells.g6(context, false);
                    break;
            }
        } else {
            v41 F = w41.F(i10);
            view2 = F != null ? F.createView(this.e, this.d, this.f, this.h, this.v) : new View(context);
        }
        if (this.r) {
            if (i10 < 10000) {
                switch (i10) {
                }
            }
            view2.setBackgroundColor(I(i11));
        }
        return new vk0(view2);
    }

    @Override // f2.p0
    public void y(f2.n1 n1Var) {
        Q(n1Var, this.I);
        O(n1Var);
    }
}
