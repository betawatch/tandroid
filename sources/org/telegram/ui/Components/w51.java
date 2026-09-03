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
import org.telegram.ui.aa1;
import org.telegram.ui.ma1;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public class w51 extends bg.c {
    public u51 E;
    public u51 F;
    public int G;
    public boolean H;
    public Utilities.Callback2 I;
    public boolean J;
    public final rl0 d;
    public final Context e;
    public final int f;
    public final int h;
    public final boolean n;
    public Utilities.Callback2 s;
    public final org.telegram.ui.ActionBar.f6 v;
    public vf.f y;
    public boolean r = true;
    public final ArrayList w = new ArrayList();
    public final ArrayList x = new ArrayList();
    public int B = 0;
    public final ArrayList C = new ArrayList();
    public final ArrayList D = new ArrayList();

    public w51(rl0 rl0Var, Context context, int i10, int i11, boolean z4, Utilities.Callback2 callback2, org.telegram.ui.ActionBar.f6 f6Var) {
        this.d = rl0Var;
        this.e = context;
        this.f = i10;
        this.h = i11;
        this.n = z4;
        this.s = callback2;
        this.v = f6Var;
        N(false);
    }

    public static boolean K(int i10) {
        if (i10 < 10000) {
            return i10 == 7 || i10 == 8 || i10 == 38 || i10 == 31 || i10 == -4 || i10 == 28 || i10 == 2 || i10 == -2;
        }
        h51 F = i51.F(i10);
        return F != null && F.isShadow();
    }

    @Override // org.telegram.ui.Components.ql0
    public boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f;
        i51 G = G(l1Var.b());
        if (i10 >= 10000) {
            h51 F = i51.F(i10);
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
            ArrayList arrayList = this.D;
            if (i10 >= arrayList.size()) {
                return;
            }
            u51 u51Var = (u51) arrayList.get(i10);
            this.I.run(Integer.valueOf(i10), new ArrayList(this.x.subList(u51Var.a, u51Var.b + 1)));
            this.H = false;
        }
    }

    public final i51 G(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = this.x;
        if (i10 >= arrayList.size()) {
            return null;
        }
        return (i51) arrayList.get(i10);
    }

    public final int H(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.D;
            if (i11 >= arrayList.size()) {
                return -1;
            }
            u51 u51Var = (u51) arrayList.get(i11);
            if (i10 >= u51Var.a && i10 <= u51Var.b) {
                return i11;
            }
            i11++;
        }
    }

    public int I(int i10) {
        return org.telegram.ui.ActionBar.j6.v0(i10, this.v);
    }

    public final boolean J(int i10) {
        i51 G = G(i10);
        i51 G2 = G(i10 + 1);
        return (G == null || G.j || G2 == null || K(G2.a) != K(G.a)) ? false : true;
    }

    public final void L() {
        u51 u51Var = this.F;
        if (u51Var != null) {
            u51Var.b = Math.max(0, this.x.size() - 1);
        }
    }

    public final int M() {
        u51 u51Var = new u51();
        this.F = u51Var;
        u51Var.a = this.x.size();
        u51 u51Var2 = this.F;
        u51Var2.b = -1;
        this.D.add(u51Var2);
        return r1.size() - 1;
    }

    public void N(boolean z4) {
        rl0 rl0Var = this.d;
        if (rl0Var == null || !rl0Var.b0()) {
            P(z4);
        } else {
            rl0Var.post(new kv0(3, this, z4));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void O(f2.l1 l1Var) {
        View view = l1Var.a;
        if (view instanceof org.telegram.ui.ActionBar.a6) {
            ((org.telegram.ui.ActionBar.a6) view).e();
            int i10 = l1Var.f;
            if (this.r) {
                if (i10 < 10000) {
                    switch (i10) {
                    }
                }
                view.setBackgroundColor(I(this.n ? org.telegram.ui.ActionBar.j6.h5 : org.telegram.ui.ActionBar.j6.d6));
            }
        }
    }

    public final void P(boolean z4) {
        rl0 rl0Var = this.d;
        if (rl0Var == null || !rl0Var.b0()) {
            ArrayList arrayList = this.w;
            arrayList.clear();
            ArrayList arrayList2 = this.x;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            this.E = null;
            this.C.clear();
            this.D.clear();
            Utilities.Callback2 callback2 = this.s;
            if (callback2 != null) {
                callback2.run(arrayList2, this);
                R();
                if (z4) {
                    E(arrayList, arrayList2);
                } else {
                    l();
                }
            }
        }
    }

    public final void Q(f2.l1 l1Var, boolean z4) {
        if (l1Var == null) {
            return;
        }
        View view = l1Var.a;
        int i10 = l1Var.f;
        if (i10 < 10000) {
            if (i10 != 16) {
                return;
            }
            ((uf.l1) view).setReorder(z4);
        } else {
            h51 F = i51.F(i10);
            if (F != null) {
                F.attachedView(this.d, view, G(l1Var.b()));
            }
        }
    }

    public final void R() {
        rl0 rl0Var = this.d;
        if (rl0Var == null) {
            return;
        }
        ArrayList arrayList = rl0Var.H2;
        if (arrayList == null) {
            rl0Var.H2 = new ArrayList();
        } else {
            arrayList.clear();
        }
        ArrayList arrayList2 = this.C;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            u51 u51Var = (u51) obj;
            rl0Var.H2.add(Long.valueOf(AndroidUtilities.pack(u51Var.a, u51Var.b)));
        }
    }

    public final void S() {
        ArrayList arrayList = this.w;
        arrayList.clear();
        ArrayList arrayList2 = this.x;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        this.C.clear();
        this.D.clear();
        Utilities.Callback2 callback2 = this.s;
        if (callback2 != null) {
            callback2.run(arrayList2, this);
        }
        R();
    }

    public final void T() {
        u51 u51Var = this.E;
        if (u51Var != null) {
            u51Var.b = Math.max(0, (this.x.size() + this.B) - 1);
            u51 u51Var2 = this.E;
            if (u51Var2.a == u51Var2.b) {
                this.C.remove(u51Var2);
            }
            this.E = null;
        }
    }

    public final void U() {
        u51 u51Var = new u51();
        this.E = u51Var;
        u51Var.a = this.x.size() + this.B;
        u51 u51Var2 = this.E;
        u51Var2.b = -1;
        this.C.add(u51Var2);
    }

    @Override // f2.o0
    public final int h() {
        return this.x.size();
    }

    @Override // f2.o0
    public final int j(int i10) {
        i51 G = G(i10);
        if (G == null) {
            return 0;
        }
        return G.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0229  */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v16 */
    @Override // f2.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void v(f2.l1 l1Var, int i10) {
        String str;
        org.telegram.ui.Cells.z8 z8Var;
        ?? r10;
        int i11;
        TLRPC.Document document;
        long j10;
        String str2;
        ImageLocation imageLocation;
        TLRPC.Photo photo;
        String str3;
        long j11;
        boolean z4;
        char c3;
        boolean z10;
        long j12;
        long j13;
        CharSequence concat;
        int i12;
        int i13 = this.f;
        rl0 rl0Var = this.d;
        i51 G = G(i10);
        i51 G2 = G(i10 + 1);
        i51 G3 = G(i10 - 1);
        if (G == null) {
            return;
        }
        int i14 = l1Var.f;
        View view = l1Var.a;
        boolean J = J(i10);
        O(l1Var);
        if (i14 < 10000) {
            str = "";
            switch (i14) {
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
                            frameLayout.addView(G.c, (i14 == -1 || i14 == -4) ? k7.b6.c(G.z, -1) : k7.b6.c(-2.0f, -2));
                            break;
                        }
                    }
                    break;
                case -3:
                    t51 t51Var = (t51) view;
                    t51Var.a = G.z;
                    t51Var.b = k7.w8.a(G.y, 1);
                    if (t51Var.getChildCount() != (G.c == null ? 0 : 1) || t51Var.getChildAt(0) != G.c) {
                        t51Var.removeAllViews();
                        View view3 = G.c;
                        if (view3 != null) {
                            AndroidUtilities.removeFromParent(view3);
                            t51Var.addView(G.c, k7.b6.c(-1.0f, -1));
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
                    b21 b21Var = (b21) view;
                    int i15 = G.k;
                    if (i15 == 0) {
                        int i16 = G.z;
                        if (i16 != 0) {
                            b21Var.setEmojiSize(i16);
                        }
                        String charSequence = G.m.toString();
                        String charSequence2 = G.n.toString();
                        b21Var.getClass();
                        MediaDataController.getInstance(UserConfig.selectedAccount).setPlaceholderImage(b21Var.b, charSequence, charSequence2, "90_90");
                    } else if (G.q) {
                        b21Var.setEmojiStatic(i15);
                    } else {
                        b21Var.setEmoji(i15);
                    }
                    if (!TextUtils.isEmpty(G.o)) {
                        CharSequence charSequence3 = G.l;
                        CharSequence charSequence4 = G.o;
                        f90 f90Var = b21Var.c;
                        f90Var.setText(charSequence3);
                        f90Var.setVisibility(0);
                        f90 f90Var2 = b21Var.d;
                        f90Var2.setText(charSequence4);
                        f90Var2.setMaxWidth(ph.f3.a(charSequence4, f90Var2.getPaint()));
                        f90Var2.requestLayout();
                        b21Var.e();
                        break;
                    } else {
                        b21Var.setText(G.l);
                        break;
                    }
                case 3:
                    org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
                    Object obj = G.G;
                    if (obj instanceof TLRPC.Document) {
                        CharSequence charSequence5 = G.l;
                        TLRPC.Document document2 = (TLRPC.Document) obj;
                        n8Var.w = 16;
                        n8Var.s = 58;
                        org.telegram.ui.ActionBar.k5 k5Var = n8Var.a;
                        k5Var.l(charSequence5, false);
                        k5Var.i(null);
                        k6 k6Var = n8Var.c;
                        n8Var.J = null;
                        k6Var.c(null, false, true);
                        n8Var.h.setVisibility(8);
                        k6Var.setVisibility(8);
                        n8Var.d.setVisibility(8);
                        jj0 jj0Var = n8Var.e;
                        jj0Var.setVisibility(8);
                        jj0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
                        n8Var.r = J;
                        n8Var.setWillNotDraw(!J);
                        Switch r12 = n8Var.f;
                        if (r12 != null) {
                            r12.setVisibility(8);
                        }
                        n8Var.setValueSticker(document2);
                    } else if (obj instanceof String) {
                        CharSequence charSequence6 = G.l;
                        String str4 = (String) obj;
                        n8Var.w = 16;
                        n8Var.s = 58;
                        org.telegram.ui.ActionBar.k5 k5Var2 = n8Var.a;
                        k5Var2.l(charSequence6, false);
                        k5Var2.i(null);
                        k6 k6Var2 = n8Var.c;
                        n8Var.J = null;
                        k6Var2.c(null, false, true);
                        n8Var.h.setVisibility(8);
                        k6Var2.setVisibility(8);
                        n8Var.d.setVisibility(8);
                        jj0 jj0Var2 = n8Var.e;
                        jj0Var2.setVisibility(8);
                        jj0Var2.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
                        n8Var.r = J;
                        n8Var.setWillNotDraw(!J);
                        Switch r13 = n8Var.f;
                        if (r13 != null) {
                            r13.setVisibility(8);
                        }
                        n8Var.setValueSticker(str4);
                    } else if (TextUtils.isEmpty(G.n)) {
                        Object obj2 = G.G;
                        if (obj2 instanceof Drawable) {
                            n8Var.n(G.l, (Drawable) obj2, J);
                        } else {
                            int i17 = G.k;
                            if (i17 == 0) {
                                n8Var.i(G.l, J);
                            } else {
                                n8Var.m(i17, G.l, J);
                            }
                        }
                    } else {
                        Object obj3 = G.G;
                        if (obj3 instanceof Drawable) {
                            n8Var.r(G.l, G.n, (Drawable) obj3, J);
                        } else {
                            int i18 = G.k;
                            if (i18 == 0) {
                                n8Var.o(G.l, G.n, false, J);
                            } else {
                                n8Var.s(G.l, G.n, false, i18, J);
                            }
                        }
                    }
                    if (G.q) {
                        int i19 = org.telegram.ui.ActionBar.j6.q6;
                        n8Var.e(i19, i19);
                    } else if (G.r) {
                        n8Var.e(org.telegram.ui.ActionBar.j6.q7, org.telegram.ui.ActionBar.j6.p7);
                    } else {
                        n8Var.e(org.telegram.ui.ActionBar.j6.m6, org.telegram.ui.ActionBar.j6.G6);
                    }
                    n8Var.g(G.g);
                    break;
                case 4:
                case 9:
                    org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                    if (r8Var.b == G.d) {
                        r8Var.setChecked(G.e);
                    }
                    r8Var.e(null, G.g);
                    r8Var.f(G.l, G.e, J);
                    r8Var.b = G.d;
                    if (i14 == 9) {
                        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, G.e ? org.telegram.ui.ActionBar.j6.f6 : org.telegram.ui.ActionBar.j6.e6, false));
                        break;
                    }
                    break;
                case 5:
                    org.telegram.ui.Cells.i5 i5Var = (org.telegram.ui.Cells.i5) view;
                    CharSequence charSequence7 = G.m;
                    i5Var.b(G.l, G.m, 0, G.e, 0, charSequence7 != null && charSequence7.toString().contains("\n"), J, false);
                    break;
                case 6:
                    ((org.telegram.ui.Cells.i5) view).b(G.l, G.m, 0, G.e, 0, false, J, false);
                    break;
                case 7:
                case 8:
                case 38:
                    if (i14 == 7 || i14 == 8) {
                        org.telegram.ui.Cells.z8 z8Var2 = (org.telegram.ui.Cells.z8) view;
                        if (TextUtils.isEmpty(G.l)) {
                            z8Var2.setFixedSize(i14 == 8 ? 220 : 12);
                            z8Var2.setText("");
                        } else {
                            z8Var2.setFixedSize(0);
                            z8Var2.setText(G.l);
                        }
                        if (G.q) {
                            z8Var2.setTextGravity(17);
                            z8Var2.getTextView().setWidth(Math.min(ph.f3.a(z8Var2.getText(), z8Var2.getTextView().getPaint()), AndroidUtilities.displaySize.x - AndroidUtilities.dp(60.0f)));
                            z8Var2.getTextView().setPadding(0, AndroidUtilities.dp(17.0f), 0, AndroidUtilities.dp(17.0f));
                            z8Var = z8Var2;
                        } else {
                            z8Var2.setTextGravity(8388611);
                            z8Var2.getTextView().setMinWidth(0);
                            z8Var2.getTextView().setMaxWidth(AndroidUtilities.displaySize.x);
                            z8Var2.getTextView().setPadding(0, AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(17.0f));
                            z8Var = z8Var2;
                        }
                    } else if (i14 == 38) {
                        org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) view;
                        CharSequence charSequence8 = G.o;
                        boolean z11 = G.f;
                        z1Var.a.setText(charSequence8);
                        View view4 = z1Var.b;
                        view4.animate().cancel();
                        view4.animate().rotation(z11 ? 0.0f : 180.0f).setDuration(340L).setInterpolator(mr.h).start();
                        if (G.q) {
                            z1Var.setColor(org.telegram.ui.ActionBar.j6.q6);
                            z8Var = z1Var;
                        } else if (G.r) {
                            z1Var.setColor(org.telegram.ui.ActionBar.j6.p7);
                            z8Var = z1Var;
                        } else {
                            z1Var.setColor(org.telegram.ui.ActionBar.j6.G6);
                            z8Var = z1Var;
                        }
                    } else {
                        z8Var = null;
                    }
                    boolean z12 = (G3 == null || K(G3.a)) ? false : true;
                    boolean z13 = (G2 == null || K(G2.a)) ? false : true;
                    if (!rl0Var.a1()) {
                        Drawable U0 = org.telegram.ui.ActionBar.j6.U0(this.e, (z12 && z13) ? R.drawable.greydivider : z12 ? R.drawable.greydivider_bottom : z13 ? R.drawable.greydivider_top : R.drawable.field_carret_empty, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.b7, this.v));
                        if (!this.n) {
                            z8Var.setBackground(U0);
                            break;
                        } else {
                            z8Var.setBackground(new LayerDrawable(new Drawable[]{new ColorDrawable(I(org.telegram.ui.ActionBar.j6.i5)), U0}));
                            break;
                        }
                    } else {
                        z8Var.setBackground(null);
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
                        r10 = 0;
                    } else {
                        r10 = 0;
                        s2Var.a(G.g, false);
                    }
                    if (TextUtils.isEmpty(G.n)) {
                        CharSequence charSequence9 = G.l;
                        boolean z14 = G.e;
                        textView2.setVisibility(8);
                        textView.setText(charSequence9);
                        radioButton.a(z14, r10);
                        s2Var.e = J;
                        s2Var.b();
                        s2Var.setWillNotDraw(!J);
                    } else {
                        CharSequence charSequence10 = G.l;
                        CharSequence charSequence11 = G.n;
                        boolean z15 = G.e;
                        textView2.setVisibility(r10);
                        textView2.setText(charSequence11);
                        textView.setText(charSequence10);
                        radioButton.a(z15, r10);
                        s2Var.e = J;
                        s2Var.b();
                        s2Var.setWillNotDraw(!J);
                    }
                    s2Var.a = G.d;
                    break;
                case 11:
                case 12:
                    org.telegram.ui.Cells.ua uaVar = (org.telegram.ui.Cells.ua) view;
                    uaVar.h(i13, G, J);
                    if (i14 == 12) {
                        uaVar.c(G.e, false);
                        break;
                    }
                    break;
                case 13:
                    org.telegram.ui.Cells.ua uaVar2 = (org.telegram.ui.Cells.ua) view;
                    uaVar2.h(i13, G, J);
                    CharSequence charSequence12 = G.n;
                    uaVar2.setQuery(charSequence12 == null ? null : charSequence12.toString().toLowerCase());
                    uaVar2.setAddButtonVisible(!G.e);
                    uaVar2.setCloseIcon(G.D);
                    break;
                case 14:
                    uv0 uv0Var = (uv0) view;
                    uv0Var.b(G.z, null, G.p);
                    uv0Var.setMinAllowedIndex((int) G.B);
                    uv0Var.setCallback(new ev(G, 26));
                    break;
                case 15:
                    org.telegram.ui.Cells.w7 w7Var = (org.telegram.ui.Cells.w7) view;
                    w7Var.d(G.z, (org.telegram.ui.Cells.v7) G.G, G.C);
                    w7Var.setMinValueAllowed((int) G.B);
                    break;
                case 16:
                    uf.l1 l1Var2 = (uf.l1) view;
                    l1Var2.d.a(G.e, false);
                    l1Var2.setReorder(this.J);
                    Object obj4 = G.G;
                    if (obj4 instanceof uf.o1) {
                        l1Var2.a((uf.o1) obj4, null, J);
                        break;
                    }
                    break;
                case 17:
                    uf.k1 k1Var = (uf.k1) view;
                    k1Var.e.a(G.e, false);
                    Object obj5 = G.G;
                    if (obj5 instanceof uf.o1) {
                        uf.o1 o1Var = (uf.o1) obj5;
                        z8 z8Var3 = k1Var.a;
                        int[] iArr = k1Var.r;
                        TextView textView3 = k1Var.d;
                        ImageReceiver imageReceiver = k1Var.b;
                        int i21 = UserConfig.selectedAccount;
                        k1Var.c.setText(MessagesController.getInstance(i21).getPeerName(UserConfig.getInstance(i21).getClientUserId()));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        MessageObject messageObject = o1Var.e;
                        if (messageObject != null) {
                            spannableStringBuilder.append(Emoji.replaceEmoji(messageObject.messageText, textView3.getPaint().getFontMetricsInt(), false));
                        }
                        if (o1Var.a() > 1) {
                            spannableStringBuilder.append((CharSequence) "  ");
                            int dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(80.0f);
                            int a2 = o1Var.a() - 1;
                            int i22 = a0.d;
                            SpannableString spannableString = new SpannableString("+");
                            a0 a0Var = new a0(a2);
                            iArr[0] = (int) (((k01) a0Var.c).c + AndroidUtilities.dp(10.0f));
                            i11 = i21;
                            spannableString.setSpan(a0Var, 0, spannableString.length(), 33);
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(TextUtils.ellipsize(spannableStringBuilder, textView3.getPaint(), (dp * 1.5f) - iArr[0], TextUtils.TruncateAt.END));
                            if (spannableStringBuilder2.length() > 0 && spannableStringBuilder2.charAt(spannableStringBuilder2.length() - 1) == 8230) {
                                spannableStringBuilder2.append((CharSequence) "  ");
                            }
                            spannableStringBuilder2.append((CharSequence) spannableString);
                            spannableStringBuilder = spannableStringBuilder2;
                        } else {
                            i11 = i21;
                        }
                        textView3.setText(spannableStringBuilder);
                        TLRPC.MessageMedia media = MessageObject.getMedia(o1Var.e);
                        if (media != null && (photo = media.photo) != null) {
                            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(36.0f), true, null, true);
                            ImageLocation forObject = ImageLocation.getForObject(closestPhotoSizeWithSize, media.photo);
                            MessageObject messageObject2 = o1Var.e;
                            imageReceiver.setImage(forObject, "36_36", messageObject2.strippedThumb, closestPhotoSizeWithSize == null ? 0L : closestPhotoSizeWithSize.size, (String) null, messageObject2, 0);
                            imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
                        } else if (media == null || (document = media.document) == null) {
                            z8Var3.r(UserConfig.getInstance(i11).getCurrentUser());
                            imageReceiver.setForUserOrChat(UserConfig.getInstance(i11).getCurrentUser(), z8Var3);
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
                            MessageObject messageObject3 = o1Var.e;
                            imageReceiver.setImage(imageLocation, str2, messageObject3.strippedThumb, j14, (String) null, messageObject3, 0);
                            imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
                        }
                        k1Var.s = J;
                        k1Var.invalidate();
                        break;
                    }
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    ma1 ma1Var = (ma1) view;
                    int i23 = G.z;
                    aa1 aa1Var = (aa1) G.G;
                    s51 s51Var = new s51(0, this, G);
                    ma1Var.x = i23;
                    ma1Var.y = s51Var;
                    ma1Var.e(aa1Var, false);
                    break;
                case 24:
                    ((org.telegram.ui.ke) view).set((org.telegram.ui.je) G.G);
                    break;
                case 25:
                    org.telegram.ui.le leVar = (org.telegram.ui.le) view;
                    TL_stats.BroadcastRevenueTransaction broadcastRevenueTransaction = (TL_stats.BroadcastRevenueTransaction) G.G;
                    t5 t5Var = leVar.b;
                    org.telegram.ui.ActionBar.f6 f6Var = leVar.a;
                    TextView textView4 = leVar.c;
                    TextView textView5 = leVar.d;
                    if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionWithdrawal) {
                        TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
                        textView4.setText(LocaleController.getString(R.string.MonetizationTransactionWithdraw));
                        if (tL_broadcastRevenueTransactionWithdrawal.pending) {
                            textView5.setText(LocaleController.getString(R.string.MonetizationTransactionPending));
                            z4 = false;
                        } else {
                            z4 = tL_broadcastRevenueTransactionWithdrawal.failed;
                            StringBuilder sb = new StringBuilder();
                            sb.append(LocaleController.formatShortDateTime(tL_broadcastRevenueTransactionWithdrawal.date));
                            sb.append(z4 ? org.telegram.messenger.y3.h(R.string.MonetizationTransactionNotCompleted, new StringBuilder(" — ")) : "");
                            textView5.setText(sb.toString());
                        }
                        j11 = tL_broadcastRevenueTransactionWithdrawal.amount;
                        str3 = "+";
                        c3 = 65535;
                    } else {
                        if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionProceeds) {
                            textView4.setText(LocaleController.getString(R.string.MonetizationTransactionProceed));
                            StringBuilder sb2 = new StringBuilder();
                            str3 = "+";
                            sb2.append(LocaleController.formatShortDateTime(r5.from_date));
                            sb2.append(" - ");
                            sb2.append(LocaleController.formatShortDateTime(r5.to_date));
                            textView5.setText(sb2.toString());
                            j11 = ((TL_stats.TL_broadcastRevenueTransactionProceeds) broadcastRevenueTransaction).amount;
                        } else {
                            str3 = "+";
                            if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionRefund) {
                                textView4.setText(LocaleController.getString(R.string.MonetizationTransactionRefund));
                                textView5.setText(LocaleController.formatShortDateTime(r5.from_date));
                                j11 = ((TL_stats.TL_broadcastRevenueTransactionRefund) broadcastRevenueTransaction).amount;
                            }
                        }
                        z4 = false;
                        c3 = 1;
                    }
                    textView5.setTextColor(org.telegram.ui.ActionBar.j6.v0(z4 ? org.telegram.ui.ActionBar.j6.p7 : org.telegram.ui.ActionBar.j6.y6, f6Var));
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                    spannableStringBuilder3.append((CharSequence) (c3 < 0 ? "-" : str3));
                    spannableStringBuilder3.append((CharSequence) "TON ");
                    spannableStringBuilder3.append((CharSequence) leVar.e.format(Math.abs(j11) / 1.0E9d));
                    int indexOf = TextUtils.indexOf(spannableStringBuilder3, ".");
                    if (indexOf >= 0) {
                        z10 = false;
                        spannableStringBuilder3.setSpan(new RelativeSizeSpan(1.15f), 0, indexOf + 1, 33);
                    } else {
                        z10 = false;
                    }
                    t5Var.setText(org.telegram.ui.me.f0(spannableStringBuilder3, t5Var.getPaint(), 1.1f, AndroidUtilities.dp(0.33f), z10));
                    t5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(c3 < 0 ? org.telegram.ui.ActionBar.j6.q7 : org.telegram.ui.ActionBar.j6.l8, f6Var));
                    leVar.f = J;
                    leVar.setWillNotDraw(!J);
                    break;
                case 27:
                    ph.d8 d8Var = (ph.d8) view;
                    long j15 = d8Var.x;
                    Object obj6 = G.G;
                    if (!(obj6 instanceof TLRPC.User)) {
                        if (!(obj6 instanceof TLRPC.Chat)) {
                            j12 = 0;
                            boolean z16 = j15 != j12;
                            d8Var.d(false, true);
                            d8Var.set(G.G);
                            d8Var.f.setVisibility(8);
                            d8Var.h.setVisibility(0);
                            d8Var.c(G.e, z16);
                            d8Var.setDivider(J);
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
                    d8Var.d(false, true);
                    d8Var.set(G.G);
                    d8Var.f.setVisibility(8);
                    d8Var.h.setVisibility(0);
                    d8Var.c(G.e, z16);
                    d8Var.setDivider(J);
                case 28:
                    if (G.s) {
                        view.setBackgroundColor(0);
                    } else {
                        int i24 = G.k;
                        if (i24 != 0) {
                            view.setBackgroundColor(i24);
                        }
                    }
                    view.setId(G.d);
                    ((v51) view).setHeight(G.z);
                    break;
                case 29:
                    uf.o oVar = (uf.o) view;
                    Object obj7 = G.G;
                    if (obj7 instanceof uf.p) {
                        org.telegram.ui.ActionBar.k5 k5Var3 = oVar.a;
                        org.telegram.ui.ActionBar.k5 k5Var4 = oVar.c;
                        ih.s sVar = oVar.b;
                        oVar.e = J;
                        TL_account.TL_businessChatLink tL_businessChatLink = ((uf.p) obj7).a;
                        oVar.f = tL_businessChatLink;
                        if (TextUtils.isEmpty(tL_businessChatLink.title)) {
                            String str5 = oVar.f.link;
                            uf.t[] tVarArr = uf.t.e;
                            if (str5.startsWith("https://")) {
                                str5 = str5.substring(8);
                            }
                            k5Var3.l(str5, false);
                        } else {
                            k5Var3.l(oVar.f.title, false);
                        }
                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(oVar.f.message);
                        TL_account.TL_businessChatLink tL_businessChatLink2 = oVar.f;
                        MediaDataController.addTextStyleRuns(tL_businessChatLink2.entities, tL_businessChatLink2.message, spannableStringBuilder4);
                        CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder4, sVar.getPaint().getFontMetricsInt(), false);
                        MessageObject.replaceAnimatedEmoji(replaceEmoji, oVar.f.entities, sVar.getPaint().getFontMetricsInt());
                        sVar.setText(replaceEmoji);
                        int i25 = oVar.f.views;
                        if (i25 == 0) {
                            k5Var4.l(LocaleController.formatString(R.string.NoClicks, new Object[0]), false);
                        } else {
                            k5Var4.l(LocaleController.formatPluralString("Clicks", i25, new Object[0]), false);
                        }
                        k5Var4.requestLayout();
                        oVar.invalidate();
                        break;
                    }
                    break;
                case MessageObject.TYPE_GIFT_STARS /* 30 */:
                    org.telegram.ui.Cells.c9 c9Var = (org.telegram.ui.Cells.c9) view;
                    CharSequence charSequence13 = G.l;
                    int i26 = G.k;
                    c9Var.b.l(charSequence13, false);
                    c9Var.a.setImageResource(i26);
                    c9Var.setDivider(J);
                    c9Var.setBackgroundColor(I(org.telegram.ui.ActionBar.j6.h5));
                    break;
                case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                    org.telegram.ui.Cells.t3 t3Var = (org.telegram.ui.Cells.t3) view;
                    if (!TextUtils.equals(t3Var.getText(), G.l)) {
                        t3Var.c(G.l, G.m, G.D);
                        break;
                    } else {
                        t3Var.b(G.m, G.D);
                        break;
                    }
                case 32:
                    org.telegram.ui.Cells.g6 g6Var = (org.telegram.ui.Cells.g6) view;
                    Object obj8 = G.G;
                    if (G.q && (obj8 instanceof TLRPC.User) && (i12 = ((TLRPC.User) obj8).bot_active_users) != 0) {
                        if (i12 != 0) {
                            concat = LocaleController.formatPluralStringSpaced("BotUsers", i12);
                            if (!(obj8 instanceof TLRPC.Chat)) {
                            }
                            String str6 = str;
                            boolean z17 = G.t;
                            Object obj9 = G.H;
                            if (obj9 instanceof Utilities.Callback) {
                            }
                            g6Var.y0 = z17;
                            g6Var.z0 = r10;
                            g6Var.setRectangularAvatar(G.r);
                            CharSequence charSequence14 = G.m;
                            g6Var.t(obj8, null, str6, charSequence14 == null ? charSequence14 : concat, false, false);
                            g6Var.s(G.e, false);
                            g6Var.J = J;
                        }
                        concat = "";
                        if (!(obj8 instanceof TLRPC.Chat)) {
                        }
                        String str62 = str;
                        boolean z172 = G.t;
                        Object obj92 = G.H;
                        if (obj92 instanceof Utilities.Callback) {
                        }
                        g6Var.y0 = z172;
                        g6Var.z0 = r10;
                        g6Var.setRectangularAvatar(G.r);
                        CharSequence charSequence142 = G.m;
                        g6Var.t(obj8, null, str62, charSequence142 == null ? charSequence142 : concat, false, false);
                        g6Var.s(G.e, false);
                        g6Var.J = J;
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
                                boolean z1722 = G.t;
                                Object obj922 = G.H;
                                Utilities.Callback callback = obj922 instanceof Utilities.Callback ? (Utilities.Callback) obj922 : null;
                                g6Var.y0 = z1722;
                                g6Var.z0 = callback;
                                g6Var.setRectangularAvatar(G.r);
                                CharSequence charSequence1422 = G.m;
                                g6Var.t(obj8, null, str622, charSequence1422 == null ? charSequence1422 : concat, false, false);
                                g6Var.s(G.e, false);
                                g6Var.J = J;
                                break;
                            }
                        }
                        concat = "";
                        if (!(obj8 instanceof TLRPC.Chat)) {
                        }
                        String str6222 = str;
                        boolean z17222 = G.t;
                        Object obj9222 = G.H;
                        if (obj9222 instanceof Utilities.Callback) {
                        }
                        g6Var.y0 = z17222;
                        g6Var.z0 = callback;
                        g6Var.setRectangularAvatar(G.r);
                        CharSequence charSequence14222 = G.m;
                        g6Var.t(obj8, null, str6222, charSequence14222 == null ? charSequence14222 : concat, false, false);
                        g6Var.s(G.e, false);
                        g6Var.J = J;
                    }
                    break;
                case 33:
                    org.telegram.ui.Cells.q2 q2Var = (org.telegram.ui.Cells.q2) view;
                    Object obj10 = G.G;
                    MessageObject messageObject4 = obj10 instanceof MessageObject ? (MessageObject) obj10 : null;
                    q2Var.p2 = J;
                    if (messageObject4 != null) {
                        q2Var.W(messageObject4.getDialogId(), messageObject4, messageObject4.messageOwner.date, false, false);
                        break;
                    } else {
                        q2Var.W(0L, null, 0, false, false);
                        break;
                    }
                case 34:
                    ((u00) view).setViewType(G.z);
                    break;
                case 35:
                case 36:
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) view;
                    y1Var.setPad(G.i);
                    y1Var.e(G.l, "", G.e, J, y1Var.a == G.d);
                    y1Var.a = G.d;
                    y1Var.setIcon(G.t ? R.drawable.permission_locked : 0);
                    if (i14 == 36 || i14 == 41) {
                        boolean z18 = G.f;
                        CharSequence charSequence15 = G.o;
                        View.OnClickListener onClickListener = G.D;
                        org.telegram.ui.Cells.x1 x1Var = y1Var.v;
                        if (x1Var != null) {
                            k6 k6Var3 = x1Var.b;
                            k6Var3.a();
                            k6Var3.setText(charSequence15);
                            View view5 = x1Var.c;
                            view5.animate().cancel();
                            view5.animate().rotation(z18 ? 0.0f : 180.0f).setDuration(340L).setInterpolator(mr.h).start();
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
                    org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                    q8Var.d(G.l.toString(), G.e, J, q8Var.a == G.d);
                    q8Var.getCheckBox().setDrawIconType(G.z);
                    Switch checkBox = q8Var.getCheckBox();
                    int i27 = G.z == 0 ? org.telegram.ui.ActionBar.j6.M6 : org.telegram.ui.ActionBar.j6.r7;
                    int i28 = org.telegram.ui.ActionBar.j6.N6;
                    int i29 = org.telegram.ui.ActionBar.j6.d6;
                    checkBox.d(i27, i28, i29, i29);
                    q8Var.a = G.d;
                    q8Var.setIcon(G.t ? R.drawable.permission_locked : 0);
                    if (i14 == 40) {
                        if (!TextUtils.isEmpty(G.o)) {
                            q8Var.a(new k41(2, G, q8Var), G.o.toString(), G.f);
                            break;
                        } else {
                            LinearLayout linearLayout = q8Var.f;
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
                    org.telegram.ui.Cells.z9 z9Var = (org.telegram.ui.Cells.z9) view;
                    z9Var.getValueBackupImageView().setImageDrawable(null);
                    CharSequence charSequence16 = G.l;
                    if (charSequence16 != null) {
                        CharSequence charSequence17 = G.m;
                        if (charSequence17 != null) {
                            z9Var.c(charSequence16, charSequence17, false, J);
                        } else {
                            z9Var.b(charSequence16, J);
                        }
                    }
                    z9Var.setIcon(G.k);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    ((org.telegram.ui.Cells.h6) view).b(G.l.toString(), G.n.toString(), J, G.e);
                    break;
            }
        } else {
            h51 F = i51.F(i14);
            if (F != null) {
                F.bindView(l1Var.a, G, J, this, rl0Var instanceof g61 ? (g61) rl0Var : null);
            }
        }
        org.telegram.ui.y3 y3Var = G.F;
        if (y3Var != null) {
            y3Var.run(view);
        }
    }

    @Override // f2.o0
    public f2.l1 x(ViewGroup viewGroup, int i10) {
        View dVar;
        View l4Var;
        View view;
        View view2;
        org.telegram.ui.Cells.l4 l4Var2;
        boolean z4 = this.n;
        int i11 = z4 ? org.telegram.ui.ActionBar.j6.h5 : org.telegram.ui.ActionBar.j6.d6;
        Context context = this.e;
        if (i10 < 10000) {
            org.telegram.ui.ActionBar.f6 f6Var = this.v;
            switch (i10) {
                case -4:
                case -1:
                    dVar = new dh.d(context, 21);
                    if (i10 == -4) {
                        dVar.setTag(-33024);
                    }
                    view2 = dVar;
                    break;
                case -3:
                    t51 t51Var = new t51(context);
                    t51Var.a = 0;
                    view2 = t51Var;
                    break;
                case -2:
                    view2 = new dh.d(context, 22);
                    break;
                case 0:
                    if (!z4) {
                        view2 = new org.telegram.ui.Cells.l4(context, f6Var);
                        break;
                    } else {
                        view = new org.telegram.ui.Cells.l4(this.e, org.telegram.ui.ActionBar.j6.L6, 21, 15, 0, false, false, this.v);
                        view2 = view;
                        break;
                    }
                case 1:
                    l4Var = new org.telegram.ui.Cells.l4(this.e, org.telegram.ui.ActionBar.j6.G6, 17, 15, false, this.v);
                    view2 = l4Var;
                    break;
                case 2:
                    view2 = new b21(context, f6Var);
                    break;
                case 3:
                    view2 = new org.telegram.ui.Cells.n8(context, f6Var);
                    break;
                case 4:
                case 9:
                    org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(context, f6Var);
                    view = r8Var;
                    if (i10 == 9) {
                        r8Var.setDrawCheckRipple(true);
                        r8Var.d(org.telegram.ui.ActionBar.j6.g6, org.telegram.ui.ActionBar.j6.O6, org.telegram.ui.ActionBar.j6.P6, org.telegram.ui.ActionBar.j6.Q6, org.telegram.ui.ActionBar.j6.R6);
                        r8Var.setTypeface(AndroidUtilities.bold());
                        r8Var.setHeight(56);
                        view = r8Var;
                    }
                    view2 = view;
                    break;
                case 5:
                case 6:
                    l4Var = new org.telegram.ui.Cells.i5(21, 60, this.e, this.v, i10 == 6);
                    view2 = l4Var;
                    break;
                case 7:
                case 8:
                default:
                    view2 = new org.telegram.ui.Cells.z8(context, f6Var);
                    break;
                case 10:
                    org.telegram.ui.Cells.s2 s2Var = new org.telegram.ui.Cells.s2(context);
                    TextView textView = new TextView(context);
                    s2Var.b = textView;
                    org.telegram.ui.b.q(textView, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false), 1, 16.0f, 1);
                    textView.setMaxLines(1);
                    textView.setSingleLine(true);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView.setEllipsize(truncateAt);
                    textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                    boolean z10 = LocaleController.isRTL;
                    s2Var.addView(textView, k7.b6.d(-1, -1.0f, (z10 ? 5 : 3) | 48, z10 ? 61.0f : 23.0f, 0.0f, z10 ? 23.0f : 61.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    s2Var.c = textView2;
                    org.telegram.ui.b.q(textView2, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I6, false), 1, 16.0f, 1);
                    textView2.setMaxLines(1);
                    textView2.setSingleLine(true);
                    textView2.setEllipsize(truncateAt);
                    textView2.setGravity((LocaleController.isRTL ? 3 : 5) | 16);
                    textView2.setVisibility(8);
                    s2Var.addView(textView2, k7.b6.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 23.0f, 0.0f, 23.0f, 0.0f));
                    RadioButton radioButton = new RadioButton(context);
                    s2Var.d = radioButton;
                    radioButton.setSize(AndroidUtilities.dp(20.0f));
                    radioButton.b(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.g7, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.h7, false));
                    s2Var.addView(radioButton, k7.b6.d(22, 22.0f, (LocaleController.isRTL ? 3 : 5) | 48, 20.0f, 15.0f, 20.0f, 0.0f));
                    s2Var.b();
                    view2 = s2Var;
                    break;
                case 11:
                case 12:
                    org.telegram.ui.Cells.ua uaVar = new org.telegram.ui.Cells.ua(context, 6, i10 != 12 ? 0 : 3, false);
                    uaVar.setSelfAsSavedMessages(true);
                    view2 = uaVar;
                    break;
                case 13:
                    l4Var = new org.telegram.ui.Cells.ua(6, 0, this.e, null, false, true);
                    view2 = l4Var;
                    break;
                case 14:
                    view2 = new uv0(context, f6Var);
                    break;
                case 15:
                    view2 = new org.telegram.ui.Cells.w7(context, f6Var);
                    break;
                case 16:
                    view2 = new uf.l1(context, f6Var, this.I != null);
                    break;
                case 17:
                    view2 = new uf.k1(context, f6Var);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    if (this.y == null) {
                        this.y = new vf.f(null);
                    }
                    view2 = new ma1(this.e, this.f, i10 - 18, this.y, this.h);
                    break;
                case 24:
                    view2 = new org.telegram.ui.ke(context, f6Var);
                    break;
                case 25:
                    view2 = new org.telegram.ui.le(context, f6Var);
                    break;
                case 26:
                    l4Var2 = new org.telegram.ui.Cells.l4(this.e, org.telegram.ui.ActionBar.j6.G6, 23, 20, 0, false, false, this.v);
                    l4Var2.setTextSize(20.0f);
                    view2 = l4Var2;
                    break;
                case 27:
                    ph.d8 d8Var = new ph.d8(context, f6Var);
                    d8Var.d(false, false);
                    view2 = d8Var;
                    break;
                case 28:
                    dVar = new v51(context);
                    dVar.setTag(-33024);
                    view2 = dVar;
                    break;
                case 29:
                    view2 = new uf.o(context, f6Var);
                    break;
                case MessageObject.TYPE_GIFT_STARS /* 30 */:
                    view2 = new org.telegram.ui.Cells.c9(context, f6Var);
                    break;
                case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                    rl0 rl0Var = this.d;
                    if (rl0Var != null && rl0Var.a1()) {
                        org.telegram.ui.Cells.t3 t3Var = new org.telegram.ui.Cells.t3(context, 28, f6Var);
                        t3Var.setNoBackground(true);
                        view2 = t3Var;
                        break;
                    } else {
                        view2 = new org.telegram.ui.Cells.t3(context, f6Var);
                        break;
                    }
                    break;
                case 32:
                    view2 = new org.telegram.ui.Cells.g6(context, null);
                    break;
                case 33:
                    view2 = new org.telegram.ui.Cells.q2(context, true);
                    break;
                case 34:
                    u00 u00Var = new u00(context, f6Var);
                    u00Var.setIsSingleCell(true);
                    view2 = u00Var;
                    break;
                case 35:
                case 36:
                case 37:
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(i10 == 35 ? 4 : i10 == 36 ? 6 : i10 == 37 ? 7 : i10 == 41 ? 8 : 0, 21, this.e, this.v, true);
                    y1Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.j6.V6, org.telegram.ui.ActionBar.j6.g7, org.telegram.ui.ActionBar.j6.k7);
                    view2 = y1Var;
                    break;
                case 38:
                    view2 = new org.telegram.ui.Cells.z1(context, f6Var);
                    break;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    view2 = new org.telegram.ui.Cells.q8(context);
                    break;
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    l4Var2 = new org.telegram.ui.Cells.l4(this.e, org.telegram.ui.ActionBar.j6.L6, 21, 15, 0, false, true, this.v);
                    view2 = l4Var2;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    view2 = new org.telegram.ui.Cells.z9(context, 0, f6Var);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    view2 = new org.telegram.ui.Cells.h6(context, false);
                    break;
            }
        } else {
            h51 F = i51.F(i10);
            view2 = F != null ? F.createView(this.e, this.d, this.f, this.h, this.v) : new View(context);
        }
        if (this.r) {
            if (i10 < 10000) {
                switch (i10) {
                }
            }
            view2.setBackgroundColor(I(i11));
        }
        return new dl0(view2);
    }

    @Override // f2.o0
    public void y(f2.l1 l1Var) {
        Q(l1Var, this.J);
        O(l1Var);
    }
}
