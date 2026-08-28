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
import org.telegram.ui.e91;
import org.telegram.ui.q91;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class z41 extends wf.b {
    public x41 D;
    public x41 E;
    public int F;
    public boolean G;
    public Utilities.Callback2 H;
    public boolean I;
    public final wk0 d;
    public final Context e;
    public final int f;
    public final int h;
    public final boolean n;
    public Utilities.Callback2 s;
    public final org.telegram.ui.ActionBar.b6 v;
    public qf.f y;
    public boolean r = true;
    public final ArrayList w = new ArrayList();
    public final ArrayList x = new ArrayList();
    public int A = 0;
    public final ArrayList B = new ArrayList();
    public final ArrayList C = new ArrayList();

    public z41(wk0 wk0Var, Context context, int i9, int i10, boolean z10, Utilities.Callback2 callback2, org.telegram.ui.ActionBar.b6 b6Var) {
        this.d = wk0Var;
        this.e = context;
        this.f = i9;
        this.h = i10;
        this.n = z10;
        this.s = callback2;
        this.v = b6Var;
        N(false);
    }

    public static boolean K(int i9) {
        if (i9 < 10000) {
            return i9 == 7 || i9 == 8 || i9 == 38 || i9 == 31 || i9 == -4 || i9 == 28 || i9 == 2 || i9 == -2;
        }
        k41 F = l41.F(i9);
        return F != null && F.isShadow();
    }

    @Override // org.telegram.ui.Components.vk0
    public boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f;
        l41 G = G(q1Var.b());
        if (i9 >= 10000) {
            k41 F = l41.F(i9);
            if (F == null || !F.isClickable()) {
                return false;
            }
        } else if (i9 != 3 && i9 != 5 && i9 != 6 && i9 != 30 && i9 != 4 && i9 != 10 && i9 != 44 && i9 != 11 && i9 != 12 && i9 != 17 && i9 != 16 && i9 != 29 && i9 != 25 && i9 != 27 && i9 != 32 && i9 != 33 && i9 != 35 && i9 != 36 && i9 != 37 && i9 != 41 && i9 != 39 && i9 != 40 && i9 != 38) {
            return false;
        }
        return G == null || G.g;
    }

    public final void F(int i9) {
        if (i9 >= 0) {
            ArrayList arrayList = this.C;
            if (i9 >= arrayList.size()) {
                return;
            }
            x41 x41Var = (x41) arrayList.get(i9);
            this.H.run(Integer.valueOf(i9), new ArrayList(this.x.subList(x41Var.a, x41Var.b + 1)));
            this.G = false;
        }
    }

    public final l41 G(int i9) {
        if (i9 < 0) {
            return null;
        }
        ArrayList arrayList = this.x;
        if (i9 >= arrayList.size()) {
            return null;
        }
        return (l41) arrayList.get(i9);
    }

    public final int H(int i9) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.C;
            if (i10 >= arrayList.size()) {
                return -1;
            }
            x41 x41Var = (x41) arrayList.get(i10);
            if (i9 >= x41Var.a && i9 <= x41Var.b) {
                return i10;
            }
            i10++;
        }
    }

    public int I(int i9) {
        return org.telegram.ui.ActionBar.f6.v0(i9, this.v);
    }

    public final boolean J(int i9) {
        l41 G = G(i9);
        l41 G2 = G(i9 + 1);
        return (G == null || G.j || G2 == null || K(G2.a) != K(G.a)) ? false : true;
    }

    public final void L() {
        x41 x41Var = this.E;
        if (x41Var != null) {
            x41Var.b = Math.max(0, this.x.size() - 1);
        }
    }

    public final int M() {
        x41 x41Var = new x41();
        this.E = x41Var;
        x41Var.a = this.x.size();
        x41 x41Var2 = this.E;
        x41Var2.b = -1;
        this.C.add(x41Var2);
        return r1.size() - 1;
    }

    public void N(boolean z10) {
        wk0 wk0Var = this.d;
        if (wk0Var == null || !wk0Var.b0()) {
            P(z10);
        } else {
            wk0Var.post(new a50(9, this, z10));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void O(f2.q1 q1Var) {
        View view = q1Var.a;
        if (view instanceof org.telegram.ui.ActionBar.w5) {
            ((org.telegram.ui.ActionBar.w5) view).d();
            int i9 = q1Var.f;
            if (this.r) {
                if (i9 < 10000) {
                    switch (i9) {
                    }
                }
                view.setBackgroundColor(I(this.n ? org.telegram.ui.ActionBar.f6.h5 : org.telegram.ui.ActionBar.f6.d6));
            }
        }
    }

    public final void P(boolean z10) {
        wk0 wk0Var = this.d;
        if (wk0Var == null || !wk0Var.b0()) {
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

    public final void Q(f2.q1 q1Var, boolean z10) {
        if (q1Var == null) {
            return;
        }
        View view = q1Var.a;
        int i9 = q1Var.f;
        if (i9 < 10000) {
            if (i9 != 16) {
                return;
            }
            ((pf.m1) view).setReorder(z10);
        } else {
            k41 F = l41.F(i9);
            if (F != null) {
                F.attachedView(this.d, view, G(q1Var.b()));
            }
        }
    }

    public final void R() {
        wk0 wk0Var = this.d;
        if (wk0Var == null) {
            return;
        }
        ArrayList arrayList = wk0Var.G2;
        if (arrayList == null) {
            wk0Var.G2 = new ArrayList();
        } else {
            arrayList.clear();
        }
        ArrayList arrayList2 = this.B;
        int size = arrayList2.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList2.get(i9);
            i9++;
            x41 x41Var = (x41) obj;
            wk0Var.G2.add(Long.valueOf(AndroidUtilities.pack(x41Var.a, x41Var.b)));
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
        x41 x41Var = this.D;
        if (x41Var != null) {
            x41Var.b = Math.max(0, (this.x.size() + this.A) - 1);
            x41 x41Var2 = this.D;
            if (x41Var2.a == x41Var2.b) {
                this.B.remove(x41Var2);
            }
            this.D = null;
        }
    }

    public final void U() {
        x41 x41Var = new x41();
        this.D = x41Var;
        x41Var.a = this.x.size() + this.A;
        x41 x41Var2 = this.D;
        x41Var2.b = -1;
        this.B.add(x41Var2);
    }

    @Override // f2.r0
    public final int h() {
        return this.x.size();
    }

    @Override // f2.r0
    public final int j(int i9) {
        l41 G = G(i9);
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
    @Override // f2.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void v(f2.q1 q1Var, int i9) {
        String str;
        org.telegram.ui.Cells.b9 b9Var;
        ?? r10;
        TLRPC.Document document;
        long j10;
        String str2;
        ImageLocation imageLocation;
        TLRPC.Photo photo;
        String str3;
        long j11;
        boolean z10;
        char c10;
        boolean z11;
        long j12;
        long j13;
        CharSequence concat;
        int i10;
        int i11 = this.f;
        wk0 wk0Var = this.d;
        l41 G = G(i9);
        l41 G2 = G(i9 + 1);
        l41 G3 = G(i9 - 1);
        if (G == null) {
            return;
        }
        int i12 = q1Var.f;
        View view = q1Var.a;
        boolean J = J(i9);
        O(q1Var);
        if (i12 < 10000) {
            str = "";
            switch (i12) {
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
                            frameLayout.addView(G.c, (i12 == -1 || i12 == -4) ? g7.e6.c(G.z, -1) : g7.e6.c(-2.0f, -2));
                            break;
                        }
                    }
                    break;
                case -3:
                    w41 w41Var = (w41) view;
                    w41Var.a = G.z;
                    w41Var.b = g7.z7.a(G.y, 1);
                    if (w41Var.getChildCount() != (G.c == null ? 0 : 1) || w41Var.getChildAt(0) != G.c) {
                        w41Var.removeAllViews();
                        View view3 = G.c;
                        if (view3 != null) {
                            AndroidUtilities.removeFromParent(view3);
                            w41Var.addView(G.c, g7.e6.c(-1.0f, -1));
                            break;
                        }
                    }
                    break;
                case 0:
                case 1:
                case 26:
                    org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                    m4Var.setText(G.l);
                    m4Var.b(G.g);
                    break;
                case 2:
                    f11 f11Var = (f11) view;
                    int i13 = G.k;
                    if (i13 == 0) {
                        int i14 = G.z;
                        if (i14 != 0) {
                            f11Var.setEmojiSize(i14);
                        }
                        String charSequence = G.m.toString();
                        String charSequence2 = G.n.toString();
                        f11Var.getClass();
                        MediaDataController.getInstance(UserConfig.selectedAccount).setPlaceholderImage(f11Var.b, charSequence, charSequence2, "90_90");
                    } else if (G.q) {
                        f11Var.setEmojiStatic(i13);
                    } else {
                        f11Var.setEmoji(i13);
                    }
                    if (!TextUtils.isEmpty(G.o)) {
                        CharSequence charSequence3 = G.l;
                        CharSequence charSequence4 = G.o;
                        l80 l80Var = f11Var.c;
                        l80Var.setText(charSequence3);
                        l80Var.setVisibility(0);
                        l80 l80Var2 = f11Var.d;
                        l80Var2.setText(charSequence4);
                        l80Var2.setMaxWidth(kh.x3.a(charSequence4, l80Var2.getPaint()));
                        l80Var2.requestLayout();
                        f11Var.d();
                        break;
                    } else {
                        f11Var.setText(G.l);
                        break;
                    }
                case 3:
                    org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
                    Object obj = G.G;
                    if (obj instanceof TLRPC.Document) {
                        CharSequence charSequence5 = G.l;
                        TLRPC.Document document2 = (TLRPC.Document) obj;
                        p8Var.w = 16;
                        p8Var.s = 58;
                        org.telegram.ui.ActionBar.h5 h5Var = p8Var.a;
                        h5Var.l(charSequence5, false);
                        h5Var.i(null);
                        j6 j6Var = p8Var.c;
                        p8Var.I = null;
                        j6Var.c(null, false, true);
                        p8Var.h.setVisibility(8);
                        j6Var.setVisibility(8);
                        p8Var.d.setVisibility(8);
                        pi0 pi0Var = p8Var.e;
                        pi0Var.setVisibility(8);
                        pi0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
                        p8Var.r = J;
                        p8Var.setWillNotDraw(!J);
                        Switch r12 = p8Var.f;
                        if (r12 != null) {
                            r12.setVisibility(8);
                        }
                        p8Var.setValueSticker(document2);
                    } else if (obj instanceof String) {
                        CharSequence charSequence6 = G.l;
                        String str4 = (String) obj;
                        p8Var.w = 16;
                        p8Var.s = 58;
                        org.telegram.ui.ActionBar.h5 h5Var2 = p8Var.a;
                        h5Var2.l(charSequence6, false);
                        h5Var2.i(null);
                        j6 j6Var2 = p8Var.c;
                        p8Var.I = null;
                        j6Var2.c(null, false, true);
                        p8Var.h.setVisibility(8);
                        j6Var2.setVisibility(8);
                        p8Var.d.setVisibility(8);
                        pi0 pi0Var2 = p8Var.e;
                        pi0Var2.setVisibility(8);
                        pi0Var2.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
                        p8Var.r = J;
                        p8Var.setWillNotDraw(!J);
                        Switch r13 = p8Var.f;
                        if (r13 != null) {
                            r13.setVisibility(8);
                        }
                        p8Var.setValueSticker(str4);
                    } else if (TextUtils.isEmpty(G.n)) {
                        Object obj2 = G.G;
                        if (obj2 instanceof Drawable) {
                            p8Var.n(G.l, (Drawable) obj2, J);
                        } else {
                            int i15 = G.k;
                            if (i15 == 0) {
                                p8Var.i(G.l, J);
                            } else {
                                p8Var.m(i15, G.l, J);
                            }
                        }
                    } else {
                        Object obj3 = G.G;
                        if (obj3 instanceof Drawable) {
                            p8Var.r(G.l, G.n, (Drawable) obj3, J);
                        } else {
                            int i16 = G.k;
                            if (i16 == 0) {
                                p8Var.o(G.l, G.n, false, J);
                            } else {
                                p8Var.s(G.l, G.n, false, i16, J);
                            }
                        }
                    }
                    if (G.q) {
                        int i17 = org.telegram.ui.ActionBar.f6.q6;
                        p8Var.e(i17, i17);
                    } else if (G.r) {
                        p8Var.e(org.telegram.ui.ActionBar.f6.q7, org.telegram.ui.ActionBar.f6.p7);
                    } else {
                        p8Var.e(org.telegram.ui.ActionBar.f6.m6, org.telegram.ui.ActionBar.f6.G6);
                    }
                    p8Var.g(G.g);
                    break;
                case 4:
                case 9:
                    org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
                    if (t8Var.b == G.d) {
                        t8Var.setChecked(G.e);
                    }
                    t8Var.e(null, G.g);
                    t8Var.f(G.l, G.e, J);
                    t8Var.b = G.d;
                    if (i12 == 9) {
                        view.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, G.e ? org.telegram.ui.ActionBar.f6.f6 : org.telegram.ui.ActionBar.f6.e6, false));
                        break;
                    }
                    break;
                case 5:
                    org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) view;
                    CharSequence charSequence7 = G.m;
                    j5Var.b(G.l, G.m, 0, G.e, 0, charSequence7 != null && charSequence7.toString().contains("\n"), J, false);
                    break;
                case 6:
                    ((org.telegram.ui.Cells.j5) view).b(G.l, G.m, 0, G.e, 0, false, J, false);
                    break;
                case 7:
                case 8:
                case 38:
                    if (i12 == 7 || i12 == 8) {
                        org.telegram.ui.Cells.b9 b9Var2 = (org.telegram.ui.Cells.b9) view;
                        if (TextUtils.isEmpty(G.l)) {
                            b9Var2.setFixedSize(i12 == 8 ? 220 : 12);
                            b9Var2.setText("");
                        } else {
                            b9Var2.setFixedSize(0);
                            b9Var2.setText(G.l);
                        }
                        if (G.q) {
                            b9Var2.setTextGravity(17);
                            b9Var2.getTextView().setWidth(Math.min(kh.x3.a(b9Var2.getText(), b9Var2.getTextView().getPaint()), AndroidUtilities.displaySize.x - AndroidUtilities.dp(60.0f)));
                            b9Var2.getTextView().setPadding(0, AndroidUtilities.dp(17.0f), 0, AndroidUtilities.dp(17.0f));
                            b9Var = b9Var2;
                        } else {
                            b9Var2.setTextGravity(8388611);
                            b9Var2.getTextView().setMinWidth(0);
                            b9Var2.getTextView().setMaxWidth(AndroidUtilities.displaySize.x);
                            b9Var2.getTextView().setPadding(0, AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(17.0f));
                            b9Var = b9Var2;
                        }
                    } else if (i12 == 38) {
                        org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) view;
                        CharSequence charSequence8 = G.o;
                        boolean z12 = G.f;
                        a2Var.a.setText(charSequence8);
                        View view4 = a2Var.b;
                        view4.animate().cancel();
                        view4.animate().rotation(z12 ? 0.0f : 180.0f).setDuration(340L).setInterpolator(gr.h).start();
                        if (G.q) {
                            a2Var.setColor(org.telegram.ui.ActionBar.f6.q6);
                            b9Var = a2Var;
                        } else if (G.r) {
                            a2Var.setColor(org.telegram.ui.ActionBar.f6.p7);
                            b9Var = a2Var;
                        } else {
                            a2Var.setColor(org.telegram.ui.ActionBar.f6.G6);
                            b9Var = a2Var;
                        }
                    } else {
                        b9Var = null;
                    }
                    boolean z13 = (G3 == null || K(G3.a)) ? false : true;
                    boolean z14 = (G2 == null || K(G2.a)) ? false : true;
                    if (!wk0Var.b1()) {
                        Drawable U0 = org.telegram.ui.ActionBar.f6.U0(this.e, (z13 && z14) ? R.drawable.greydivider : z13 ? R.drawable.greydivider_bottom : z14 ? R.drawable.greydivider_top : R.drawable.field_carret_empty, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.b7, this.v));
                        if (!this.n) {
                            b9Var.setBackground(U0);
                            break;
                        } else {
                            b9Var.setBackground(new LayerDrawable(new Drawable[]{new ColorDrawable(I(org.telegram.ui.ActionBar.f6.i5)), U0}));
                            break;
                        }
                    } else {
                        b9Var.setBackground(null);
                        break;
                    }
                    break;
                case 10:
                    org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
                    int i18 = t2Var.a;
                    TextView textView = t2Var.b;
                    TextView textView2 = t2Var.c;
                    RadioButton radioButton = t2Var.d;
                    if (i18 == G.d) {
                        radioButton.a(G.e, true);
                        t2Var.a(G.g, true);
                        r10 = 0;
                    } else {
                        r10 = 0;
                        t2Var.a(G.g, false);
                    }
                    if (TextUtils.isEmpty(G.n)) {
                        CharSequence charSequence9 = G.l;
                        boolean z15 = G.e;
                        textView2.setVisibility(8);
                        textView.setText(charSequence9);
                        radioButton.a(z15, r10);
                        t2Var.e = J;
                        t2Var.b();
                        t2Var.setWillNotDraw(!J);
                    } else {
                        CharSequence charSequence10 = G.l;
                        CharSequence charSequence11 = G.n;
                        boolean z16 = G.e;
                        textView2.setVisibility(r10);
                        textView2.setText(charSequence11);
                        textView.setText(charSequence10);
                        radioButton.a(z16, r10);
                        t2Var.e = J;
                        t2Var.b();
                        t2Var.setWillNotDraw(!J);
                    }
                    t2Var.a = G.d;
                    break;
                case 11:
                case 12:
                    org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) view;
                    vaVar.h(i11, G, J);
                    if (i12 == 12) {
                        vaVar.c(G.e, false);
                        break;
                    }
                    break;
                case 13:
                    org.telegram.ui.Cells.va vaVar2 = (org.telegram.ui.Cells.va) view;
                    vaVar2.h(i11, G, J);
                    CharSequence charSequence12 = G.n;
                    vaVar2.setQuery(charSequence12 == null ? null : charSequence12.toString().toLowerCase());
                    vaVar2.setAddButtonVisible(!G.e);
                    vaVar2.setCloseIcon(G.D);
                    break;
                case 14:
                    bv0 bv0Var = (bv0) view;
                    bv0Var.b(G.z, null, G.p);
                    bv0Var.setMinAllowedIndex((int) G.B);
                    bv0Var.setCallback(new wu(G, 26));
                    break;
                case 15:
                    org.telegram.ui.Cells.x7 x7Var = (org.telegram.ui.Cells.x7) view;
                    x7Var.d(G.z, (org.telegram.ui.Cells.w7) G.G, G.C);
                    x7Var.setMinValueAllowed((int) G.B);
                    break;
                case 16:
                    pf.m1 m1Var = (pf.m1) view;
                    m1Var.d.a(G.e, false);
                    m1Var.setReorder(this.I);
                    Object obj4 = G.G;
                    if (obj4 instanceof pf.q1) {
                        m1Var.a((pf.q1) obj4, null, J);
                        break;
                    }
                    break;
                case 17:
                    pf.l1 l1Var = (pf.l1) view;
                    l1Var.e.a(G.e, false);
                    Object obj5 = G.G;
                    if (obj5 instanceof pf.q1) {
                        pf.q1 q1Var2 = (pf.q1) obj5;
                        z8 z8Var = l1Var.a;
                        int[] iArr = l1Var.r;
                        TextView textView3 = l1Var.d;
                        ImageReceiver imageReceiver = l1Var.b;
                        int i19 = UserConfig.selectedAccount;
                        l1Var.c.setText(MessagesController.getInstance(i19).getPeerName(UserConfig.getInstance(i19).getClientUserId()));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        MessageObject messageObject = q1Var2.e;
                        if (messageObject != null) {
                            spannableStringBuilder.append(Emoji.replaceEmoji(messageObject.messageText, textView3.getPaint().getFontMetricsInt(), false));
                        }
                        if (q1Var2.a() > 1) {
                            spannableStringBuilder.append((CharSequence) "  ");
                            int dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(80.0f);
                            int a2 = q1Var2.a() - 1;
                            int i20 = z.d;
                            SpannableString spannableString = new SpannableString("+");
                            z zVar = new z(a2);
                            iArr[0] = (int) (((nz0) zVar.c).c + AndroidUtilities.dp(10.0f));
                            spannableString.setSpan(zVar, 0, spannableString.length(), 33);
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(TextUtils.ellipsize(spannableStringBuilder, textView3.getPaint(), (dp * 1.5f) - iArr[0], TextUtils.TruncateAt.END));
                            if (spannableStringBuilder2.length() > 0 && spannableStringBuilder2.charAt(spannableStringBuilder2.length() - 1) == 8230) {
                                spannableStringBuilder2.append((CharSequence) "  ");
                            }
                            spannableStringBuilder2.append((CharSequence) spannableString);
                            spannableStringBuilder = spannableStringBuilder2;
                        }
                        textView3.setText(spannableStringBuilder);
                        TLRPC.MessageMedia media = MessageObject.getMedia(q1Var2.e);
                        if (media != null && (photo = media.photo) != null) {
                            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(36.0f), true, null, true);
                            ImageLocation forObject = ImageLocation.getForObject(closestPhotoSizeWithSize, media.photo);
                            MessageObject messageObject2 = q1Var2.e;
                            imageReceiver.setImage(forObject, "36_36", messageObject2.strippedThumb, closestPhotoSizeWithSize == null ? 0L : closestPhotoSizeWithSize.size, (String) null, messageObject2, 0);
                            imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
                        } else if (media == null || (document = media.document) == null) {
                            z8Var.r(UserConfig.getInstance(i19).getCurrentUser());
                            imageReceiver.setForUserOrChat(UserConfig.getInstance(i19).getCurrentUser(), z8Var);
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
                            MessageObject messageObject3 = q1Var2.e;
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
                    q91 q91Var = (q91) view;
                    int i21 = G.z;
                    e91 e91Var = (e91) G.G;
                    v41 v41Var = new v41(0, this, G);
                    q91Var.x = i21;
                    q91Var.y = v41Var;
                    q91Var.e(e91Var, false);
                    break;
                case 24:
                    ((org.telegram.ui.de) view).set((org.telegram.ui.ce) G.G);
                    break;
                case 25:
                    org.telegram.ui.ee eeVar = (org.telegram.ui.ee) view;
                    TL_stats.BroadcastRevenueTransaction broadcastRevenueTransaction = (TL_stats.BroadcastRevenueTransaction) G.G;
                    s5 s5Var = eeVar.b;
                    org.telegram.ui.ActionBar.b6 b6Var = eeVar.a;
                    TextView textView4 = eeVar.c;
                    TextView textView5 = eeVar.d;
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
                            sb2.append(z10 ? org.telegram.messenger.l0.h(R.string.MonetizationTransactionNotCompleted, new StringBuilder(" — ")) : "");
                            textView5.setText(sb2.toString());
                        }
                        j11 = tL_broadcastRevenueTransactionWithdrawal.amount;
                        str3 = "+";
                        c10 = 65535;
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
                        c10 = 1;
                    }
                    textView5.setTextColor(org.telegram.ui.ActionBar.f6.v0(z10 ? org.telegram.ui.ActionBar.f6.p7 : org.telegram.ui.ActionBar.f6.y6, b6Var));
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                    spannableStringBuilder3.append((CharSequence) (c10 < 0 ? "-" : str3));
                    spannableStringBuilder3.append((CharSequence) "TON ");
                    spannableStringBuilder3.append((CharSequence) eeVar.e.format(Math.abs(j11) / 1.0E9d));
                    int indexOf = TextUtils.indexOf(spannableStringBuilder3, ".");
                    if (indexOf >= 0) {
                        z11 = false;
                        spannableStringBuilder3.setSpan(new RelativeSizeSpan(1.15f), 0, indexOf + 1, 33);
                    } else {
                        z11 = false;
                    }
                    s5Var.setText(org.telegram.ui.fe.f0(spannableStringBuilder3, s5Var.getPaint(), 1.1f, AndroidUtilities.dp(0.33f), z11));
                    s5Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(c10 < 0 ? org.telegram.ui.ActionBar.f6.q7 : org.telegram.ui.ActionBar.f6.l8, b6Var));
                    eeVar.f = J;
                    eeVar.setWillNotDraw(!J);
                    break;
                case 27:
                    kh.s9 s9Var = (kh.s9) view;
                    long j15 = s9Var.x;
                    Object obj6 = G.G;
                    if (!(obj6 instanceof TLRPC.User)) {
                        if (!(obj6 instanceof TLRPC.Chat)) {
                            j12 = 0;
                            boolean z17 = j15 != j12;
                            s9Var.d(false, true);
                            s9Var.set(G.G);
                            s9Var.f.setVisibility(8);
                            s9Var.h.setVisibility(0);
                            s9Var.c(G.e, z17);
                            s9Var.setDivider(J);
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
                    s9Var.d(false, true);
                    s9Var.set(G.G);
                    s9Var.f.setVisibility(8);
                    s9Var.h.setVisibility(0);
                    s9Var.c(G.e, z17);
                    s9Var.setDivider(J);
                case 28:
                    if (G.s) {
                        view.setBackgroundColor(0);
                    } else {
                        int i22 = G.k;
                        if (i22 != 0) {
                            view.setBackgroundColor(i22);
                        }
                    }
                    view.setId(G.d);
                    ((y41) view).setHeight(G.z);
                    break;
                case 29:
                    pf.p pVar = (pf.p) view;
                    Object obj7 = G.G;
                    if (obj7 instanceof pf.q) {
                        org.telegram.ui.ActionBar.h5 h5Var3 = pVar.a;
                        org.telegram.ui.ActionBar.h5 h5Var4 = pVar.c;
                        dh.u uVar = pVar.b;
                        pVar.e = J;
                        TL_account.TL_businessChatLink tL_businessChatLink = ((pf.q) obj7).a;
                        pVar.f = tL_businessChatLink;
                        if (TextUtils.isEmpty(tL_businessChatLink.title)) {
                            String str5 = pVar.f.link;
                            pf.u[] uVarArr = pf.u.e;
                            if (str5.startsWith("https://")) {
                                str5 = str5.substring(8);
                            }
                            h5Var3.l(str5, false);
                        } else {
                            h5Var3.l(pVar.f.title, false);
                        }
                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(pVar.f.message);
                        TL_account.TL_businessChatLink tL_businessChatLink2 = pVar.f;
                        MediaDataController.addTextStyleRuns(tL_businessChatLink2.entities, tL_businessChatLink2.message, spannableStringBuilder4);
                        CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder4, uVar.getPaint().getFontMetricsInt(), false);
                        MessageObject.replaceAnimatedEmoji(replaceEmoji, pVar.f.entities, uVar.getPaint().getFontMetricsInt());
                        uVar.setText(replaceEmoji);
                        int i23 = pVar.f.views;
                        if (i23 == 0) {
                            h5Var4.l(LocaleController.formatString(R.string.NoClicks, new Object[0]), false);
                        } else {
                            h5Var4.l(LocaleController.formatPluralString("Clicks", i23, new Object[0]), false);
                        }
                        h5Var4.requestLayout();
                        pVar.invalidate();
                        break;
                    }
                    break;
                case MessageObject.TYPE_GIFT_STARS /* 30 */:
                    org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                    CharSequence charSequence13 = G.l;
                    int i24 = G.k;
                    e9Var.b.l(charSequence13, false);
                    e9Var.a.setImageResource(i24);
                    e9Var.setDivider(J);
                    e9Var.setBackgroundColor(I(org.telegram.ui.ActionBar.f6.h5));
                    break;
                case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                    org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view;
                    if (!TextUtils.equals(v3Var.getText(), G.l)) {
                        v3Var.c(G.l, G.m, G.D);
                        break;
                    } else {
                        v3Var.b(G.m, G.D);
                        break;
                    }
                case 32:
                    org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
                    Object obj8 = G.G;
                    if (G.q && (obj8 instanceof TLRPC.User) && (i10 = ((TLRPC.User) obj8).bot_active_users) != 0) {
                        if (i10 != 0) {
                            concat = LocaleController.formatPluralStringSpaced("BotUsers", i10);
                            if (!(obj8 instanceof TLRPC.Chat)) {
                            }
                            String str6 = str;
                            boolean z18 = G.t;
                            Object obj9 = G.H;
                            if (obj9 instanceof Utilities.Callback) {
                            }
                            h6Var.x0 = z18;
                            h6Var.y0 = r10;
                            h6Var.setRectangularAvatar(G.r);
                            CharSequence charSequence14 = G.m;
                            h6Var.t(obj8, null, str6, charSequence14 == null ? charSequence14 : concat, false, false);
                            h6Var.s(G.e, false);
                            h6Var.I = J;
                        }
                        concat = "";
                        if (!(obj8 instanceof TLRPC.Chat)) {
                        }
                        String str62 = str;
                        boolean z182 = G.t;
                        Object obj92 = G.H;
                        if (obj92 instanceof Utilities.Callback) {
                        }
                        h6Var.x0 = z182;
                        h6Var.y0 = r10;
                        h6Var.setRectangularAvatar(G.r);
                        CharSequence charSequence142 = G.m;
                        h6Var.t(obj8, null, str62, charSequence142 == null ? charSequence142 : concat, false, false);
                        h6Var.s(G.e, false);
                        h6Var.I = J;
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
                                h6Var.x0 = z1822;
                                h6Var.y0 = callback;
                                h6Var.setRectangularAvatar(G.r);
                                CharSequence charSequence1422 = G.m;
                                h6Var.t(obj8, null, str622, charSequence1422 == null ? charSequence1422 : concat, false, false);
                                h6Var.s(G.e, false);
                                h6Var.I = J;
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
                        h6Var.x0 = z18222;
                        h6Var.y0 = callback;
                        h6Var.setRectangularAvatar(G.r);
                        CharSequence charSequence14222 = G.m;
                        h6Var.t(obj8, null, str6222, charSequence14222 == null ? charSequence14222 : concat, false, false);
                        h6Var.s(G.e, false);
                        h6Var.I = J;
                    }
                    break;
                case 33:
                    org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
                    Object obj10 = G.G;
                    MessageObject messageObject4 = obj10 instanceof MessageObject ? (MessageObject) obj10 : null;
                    r2Var.o2 = J;
                    if (messageObject4 != null) {
                        r2Var.V(messageObject4.getDialogId(), messageObject4, messageObject4.messageOwner.date, false, false);
                        break;
                    } else {
                        r2Var.V(0L, null, 0, false, false);
                        break;
                    }
                case 34:
                    ((e00) view).setViewType(G.z);
                    break;
                case 35:
                case 36:
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) view;
                    z1Var.setPad(G.i);
                    z1Var.e(G.l, "", G.e, J, z1Var.a == G.d);
                    z1Var.a = G.d;
                    z1Var.setIcon(G.t ? R.drawable.permission_locked : 0);
                    if (i12 == 36 || i12 == 41) {
                        boolean z19 = G.f;
                        CharSequence charSequence15 = G.o;
                        View.OnClickListener onClickListener = G.D;
                        org.telegram.ui.Cells.y1 y1Var = z1Var.v;
                        if (y1Var != null) {
                            j6 j6Var3 = y1Var.b;
                            j6Var3.a();
                            j6Var3.setText(charSequence15);
                            View view5 = y1Var.c;
                            view5.animate().cancel();
                            view5.animate().rotation(z19 ? 0.0f : 180.0f).setDuration(340L).setInterpolator(gr.h).start();
                            if (onClickListener != null) {
                                y1Var.setOnClickListener(onClickListener);
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
                    org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                    s8Var.d(G.l.toString(), G.e, J, s8Var.a == G.d);
                    s8Var.getCheckBox().setDrawIconType(G.z);
                    Switch checkBox = s8Var.getCheckBox();
                    int i25 = G.z == 0 ? org.telegram.ui.ActionBar.f6.M6 : org.telegram.ui.ActionBar.f6.r7;
                    int i26 = org.telegram.ui.ActionBar.f6.N6;
                    int i27 = org.telegram.ui.ActionBar.f6.d6;
                    checkBox.d(i25, i26, i27, i27);
                    s8Var.a = G.d;
                    s8Var.setIcon(G.t ? R.drawable.permission_locked : 0);
                    if (i12 == 40) {
                        if (!TextUtils.isEmpty(G.o)) {
                            s8Var.a(new jg0(27, G, s8Var), G.o.toString(), G.f);
                            break;
                        } else {
                            LinearLayout linearLayout = s8Var.f;
                            if (linearLayout != null) {
                                linearLayout.setVisibility(8);
                                break;
                            }
                        }
                    }
                    break;
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    org.telegram.ui.Cells.m4 m4Var2 = (org.telegram.ui.Cells.m4) view;
                    m4Var2.c(G.o, m4Var2.a == G.d);
                    m4Var2.a = G.d;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) view;
                    baVar.getValueBackupImageView().setImageDrawable(null);
                    CharSequence charSequence16 = G.l;
                    if (charSequence16 != null) {
                        CharSequence charSequence17 = G.m;
                        if (charSequence17 != null) {
                            baVar.c(charSequence16, charSequence17, false, J);
                        } else {
                            baVar.b(charSequence16, J);
                        }
                    }
                    baVar.setIcon(G.k);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    ((org.telegram.ui.Cells.i6) view).b(G.l.toString(), G.n.toString(), J, G.e);
                    break;
            }
        } else {
            k41 F = l41.F(i12);
            if (F != null) {
                F.bindView(q1Var.a, G, J, this, wk0Var instanceof i51 ? (i51) wk0Var : null);
            }
        }
        org.telegram.ui.w3 w3Var = G.F;
        if (w3Var != null) {
            w3Var.run(view);
        }
    }

    @Override // f2.r0
    public f2.q1 x(ViewGroup viewGroup, int i9) {
        View gVar;
        View m4Var;
        View view;
        View view2;
        org.telegram.ui.Cells.m4 m4Var2;
        boolean z10 = this.n;
        int i10 = z10 ? org.telegram.ui.ActionBar.f6.h5 : org.telegram.ui.ActionBar.f6.d6;
        Context context = this.e;
        if (i9 < 10000) {
            org.telegram.ui.ActionBar.b6 b6Var = this.v;
            switch (i9) {
                case -4:
                case -1:
                    gVar = new dh.g(context, 20);
                    if (i9 == -4) {
                        gVar.setTag(-33024);
                    }
                    view2 = gVar;
                    break;
                case -3:
                    w41 w41Var = new w41(context);
                    w41Var.a = 0;
                    view2 = w41Var;
                    break;
                case -2:
                    view2 = new dh.g(context, 21);
                    break;
                case 0:
                    if (!z10) {
                        view2 = new org.telegram.ui.Cells.m4(context, b6Var);
                        break;
                    } else {
                        view = new org.telegram.ui.Cells.m4(this.e, org.telegram.ui.ActionBar.f6.L6, 21, 15, 0, false, false, this.v);
                        view2 = view;
                        break;
                    }
                case 1:
                    m4Var = new org.telegram.ui.Cells.m4(this.e, org.telegram.ui.ActionBar.f6.G6, 17, 15, false, this.v);
                    view2 = m4Var;
                    break;
                case 2:
                    view2 = new f11(context, b6Var);
                    break;
                case 3:
                    view2 = new org.telegram.ui.Cells.p8(context, b6Var);
                    break;
                case 4:
                case 9:
                    org.telegram.ui.Cells.t8 t8Var = new org.telegram.ui.Cells.t8(context, b6Var);
                    view = t8Var;
                    if (i9 == 9) {
                        t8Var.setDrawCheckRipple(true);
                        t8Var.d(org.telegram.ui.ActionBar.f6.g6, org.telegram.ui.ActionBar.f6.O6, org.telegram.ui.ActionBar.f6.P6, org.telegram.ui.ActionBar.f6.Q6, org.telegram.ui.ActionBar.f6.R6);
                        t8Var.setTypeface(AndroidUtilities.bold());
                        t8Var.setHeight(56);
                        view = t8Var;
                    }
                    view2 = view;
                    break;
                case 5:
                case 6:
                    m4Var = new org.telegram.ui.Cells.j5(21, 60, this.e, this.v, i9 == 6);
                    view2 = m4Var;
                    break;
                case 7:
                case 8:
                default:
                    view2 = new org.telegram.ui.Cells.b9(context, b6Var);
                    break;
                case 10:
                    org.telegram.ui.Cells.t2 t2Var = new org.telegram.ui.Cells.t2(context);
                    TextView textView = new TextView(context);
                    t2Var.b = textView;
                    org.telegram.messenger.ll.s(textView, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false), 1, 16.0f, 1);
                    textView.setMaxLines(1);
                    textView.setSingleLine(true);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView.setEllipsize(truncateAt);
                    textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                    boolean z11 = LocaleController.isRTL;
                    t2Var.addView(textView, g7.e6.d(-1, -1.0f, (z11 ? 5 : 3) | 48, z11 ? 61.0f : 23.0f, 0.0f, z11 ? 23.0f : 61.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    t2Var.c = textView2;
                    org.telegram.messenger.ll.s(textView2, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.I6, false), 1, 16.0f, 1);
                    textView2.setMaxLines(1);
                    textView2.setSingleLine(true);
                    textView2.setEllipsize(truncateAt);
                    textView2.setGravity((LocaleController.isRTL ? 3 : 5) | 16);
                    textView2.setVisibility(8);
                    t2Var.addView(textView2, g7.e6.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 23.0f, 0.0f, 23.0f, 0.0f));
                    RadioButton radioButton = new RadioButton(context);
                    t2Var.d = radioButton;
                    radioButton.setSize(AndroidUtilities.dp(20.0f));
                    radioButton.b(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.g7, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.h7, false));
                    t2Var.addView(radioButton, g7.e6.d(22, 22.0f, (LocaleController.isRTL ? 3 : 5) | 48, 20.0f, 15.0f, 20.0f, 0.0f));
                    t2Var.b();
                    view2 = t2Var;
                    break;
                case 11:
                case 12:
                    org.telegram.ui.Cells.va vaVar = new org.telegram.ui.Cells.va(context, 6, i9 != 12 ? 0 : 3, false);
                    vaVar.setSelfAsSavedMessages(true);
                    view2 = vaVar;
                    break;
                case 13:
                    m4Var = new org.telegram.ui.Cells.va(6, 0, this.e, null, false, true);
                    view2 = m4Var;
                    break;
                case 14:
                    view2 = new bv0(context, b6Var);
                    break;
                case 15:
                    view2 = new org.telegram.ui.Cells.x7(context, b6Var);
                    break;
                case 16:
                    view2 = new pf.m1(context, b6Var, this.H != null);
                    break;
                case 17:
                    view2 = new pf.l1(context, b6Var);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    if (this.y == null) {
                        this.y = new qf.f(null);
                    }
                    view2 = new q91(this.e, this.f, i9 - 18, this.y, this.h);
                    break;
                case 24:
                    view2 = new org.telegram.ui.de(context, b6Var);
                    break;
                case 25:
                    view2 = new org.telegram.ui.ee(context, b6Var);
                    break;
                case 26:
                    m4Var2 = new org.telegram.ui.Cells.m4(this.e, org.telegram.ui.ActionBar.f6.G6, 23, 20, 0, false, false, this.v);
                    m4Var2.setTextSize(20.0f);
                    view2 = m4Var2;
                    break;
                case 27:
                    kh.s9 s9Var = new kh.s9(context, b6Var);
                    s9Var.d(false, false);
                    view2 = s9Var;
                    break;
                case 28:
                    gVar = new y41(context);
                    gVar.setTag(-33024);
                    view2 = gVar;
                    break;
                case 29:
                    view2 = new pf.p(context, b6Var);
                    break;
                case MessageObject.TYPE_GIFT_STARS /* 30 */:
                    view2 = new org.telegram.ui.Cells.e9(context, b6Var);
                    break;
                case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                    wk0 wk0Var = this.d;
                    if (wk0Var != null && wk0Var.b1()) {
                        org.telegram.ui.Cells.v3 v3Var = new org.telegram.ui.Cells.v3(context, 28, b6Var);
                        v3Var.setNoBackground(true);
                        view2 = v3Var;
                        break;
                    } else {
                        view2 = new org.telegram.ui.Cells.v3(context, b6Var);
                        break;
                    }
                    break;
                case 32:
                    view2 = new org.telegram.ui.Cells.h6(context, null);
                    break;
                case 33:
                    view2 = new org.telegram.ui.Cells.r2(context, true);
                    break;
                case 34:
                    e00 e00Var = new e00(context, b6Var);
                    e00Var.setIsSingleCell(true);
                    view2 = e00Var;
                    break;
                case 35:
                case 36:
                case 37:
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(i9 == 35 ? 4 : i9 == 36 ? 6 : i9 == 37 ? 7 : i9 == 41 ? 8 : 0, 21, this.e, this.v, true);
                    z1Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.f6.V6, org.telegram.ui.ActionBar.f6.g7, org.telegram.ui.ActionBar.f6.k7);
                    view2 = z1Var;
                    break;
                case 38:
                    view2 = new org.telegram.ui.Cells.a2(context, b6Var);
                    break;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    view2 = new org.telegram.ui.Cells.s8(context);
                    break;
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    m4Var2 = new org.telegram.ui.Cells.m4(this.e, org.telegram.ui.ActionBar.f6.L6, 21, 15, 0, false, true, this.v);
                    view2 = m4Var2;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    view2 = new org.telegram.ui.Cells.ba(context, 0, b6Var);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    view2 = new org.telegram.ui.Cells.i6(context, false);
                    break;
            }
        } else {
            k41 F = l41.F(i9);
            view2 = F != null ? F.createView(this.e, this.d, this.f, this.h, this.v) : new View(context);
        }
        if (this.r) {
            if (i9 < 10000) {
                switch (i9) {
                }
            }
            view2.setBackgroundColor(I(i10));
        }
        return new ik0(view2);
    }

    @Override // f2.r0
    public void y(f2.q1 q1Var) {
        Q(q1Var, this.I);
        O(q1Var);
    }
}
