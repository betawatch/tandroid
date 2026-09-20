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
import org.telegram.ui.na1;
import org.telegram.ui.za1;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public class k61 extends og.b {
    public i61 H;
    public i61 I;
    public int J;
    public boolean K;
    public Utilities.Callback2 L;
    public boolean M;
    public final vl0 d;
    public final Context e;
    public final int f;
    public final int h;
    public final boolean n;
    public Utilities.Callback2 s;
    public final org.telegram.ui.ActionBar.f6 v;
    public ig.f y;
    public boolean r = true;
    public final ArrayList w = new ArrayList();
    public final ArrayList x = new ArrayList();
    public int E = 0;
    public final ArrayList F = new ArrayList();
    public final ArrayList G = new ArrayList();

    public k61(vl0 vl0Var, Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, org.telegram.ui.ActionBar.f6 f6Var) {
        this.d = vl0Var;
        this.e = context;
        this.f = i10;
        this.h = i11;
        this.n = z10;
        this.s = callback2;
        this.v = f6Var;
        N(false);
    }

    public static boolean K(int i10) {
        if (i10 < 10000) {
            return i10 == 7 || i10 == 8 || i10 == 38 || i10 == 31 || i10 == -4 || i10 == 28 || i10 == 2 || i10 == -2;
        }
        v51 F = w51.F(i10);
        return F != null && F.isShadow();
    }

    @Override // org.telegram.ui.Components.ul0
    public boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        w51 G = G(c1Var.b());
        if (i10 >= 10000) {
            v51 F = w51.F(i10);
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
            ArrayList arrayList = this.G;
            if (i10 >= arrayList.size()) {
                return;
            }
            i61 i61Var = (i61) arrayList.get(i10);
            this.L.run(Integer.valueOf(i10), new ArrayList(this.x.subList(i61Var.a, i61Var.b + 1)));
            this.K = false;
        }
    }

    public final w51 G(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = this.x;
        if (i10 >= arrayList.size()) {
            return null;
        }
        return (w51) arrayList.get(i10);
    }

    public final int H(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.G;
            if (i11 >= arrayList.size()) {
                return -1;
            }
            i61 i61Var = (i61) arrayList.get(i11);
            if (i10 >= i61Var.a && i10 <= i61Var.b) {
                return i11;
            }
            i11++;
        }
    }

    public int I(int i10) {
        return org.telegram.ui.ActionBar.j6.v0(i10, this.v);
    }

    public final boolean J(int i10) {
        w51 G = G(i10);
        w51 G2 = G(i10 + 1);
        return (G == null || G.j || G2 == null || K(G2.a) != K(G.a)) ? false : true;
    }

    public final void L() {
        i61 i61Var = this.I;
        if (i61Var != null) {
            i61Var.b = Math.max(0, this.x.size() - 1);
        }
    }

    public final int M() {
        i61 i61Var = new i61();
        this.I = i61Var;
        i61Var.a = this.x.size();
        i61 i61Var2 = this.I;
        i61Var2.b = -1;
        this.G.add(i61Var2);
        return r1.size() - 1;
    }

    public void N(boolean z10) {
        vl0 vl0Var = this.d;
        if (vl0Var == null || !vl0Var.c0()) {
            P(z10);
        } else {
            vl0Var.post(new ds0(4, this, z10));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void O(s4.c1 c1Var) {
        View view = c1Var.a;
        if (view instanceof org.telegram.ui.ActionBar.z5) {
            ((org.telegram.ui.ActionBar.z5) view).e();
            int i10 = c1Var.f;
            if (this.r) {
                if (i10 < 10000) {
                    switch (i10) {
                    }
                }
                view.setBackgroundColor(I(this.n ? org.telegram.ui.ActionBar.j6.h5 : org.telegram.ui.ActionBar.j6.d6));
            }
        }
    }

    public final void P(boolean z10) {
        vl0 vl0Var = this.d;
        if (vl0Var == null || !vl0Var.c0()) {
            ArrayList arrayList = this.w;
            arrayList.clear();
            ArrayList arrayList2 = this.x;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            this.H = null;
            this.F.clear();
            this.G.clear();
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

    public final void Q(s4.c1 c1Var, boolean z10) {
        if (c1Var == null) {
            return;
        }
        View view = c1Var.a;
        int i10 = c1Var.f;
        if (i10 < 10000) {
            if (i10 != 16) {
                return;
            }
            ((hg.x1) view).setReorder(z10);
        } else {
            v51 F = w51.F(i10);
            if (F != null) {
                F.attachedView(this.d, view, G(c1Var.b()));
            }
        }
    }

    public final void R() {
        vl0 vl0Var = this.d;
        if (vl0Var == null) {
            return;
        }
        ArrayList arrayList = vl0Var.K2;
        if (arrayList == null) {
            vl0Var.K2 = new ArrayList();
        } else {
            arrayList.clear();
        }
        ArrayList arrayList2 = this.F;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            i61 i61Var = (i61) obj;
            vl0Var.K2.add(Long.valueOf(AndroidUtilities.pack(i61Var.a, i61Var.b)));
        }
    }

    public final void S() {
        ArrayList arrayList = this.w;
        arrayList.clear();
        ArrayList arrayList2 = this.x;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        this.F.clear();
        this.G.clear();
        Utilities.Callback2 callback2 = this.s;
        if (callback2 != null) {
            callback2.run(arrayList2, this);
        }
        R();
    }

    public final void T() {
        i61 i61Var = this.H;
        if (i61Var != null) {
            i61Var.b = Math.max(0, (this.x.size() + this.E) - 1);
            i61 i61Var2 = this.H;
            if (i61Var2.a == i61Var2.b) {
                this.F.remove(i61Var2);
            }
            this.H = null;
        }
    }

    public final void U() {
        i61 i61Var = new i61();
        this.H = i61Var;
        i61Var.a = this.x.size() + this.E;
        i61 i61Var2 = this.H;
        i61Var2.b = -1;
        this.F.add(i61Var2);
    }

    @Override // s4.h0
    public final int h() {
        return this.x.size();
    }

    @Override // s4.h0
    public final int j(int i10) {
        w51 G = G(i10);
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
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void v(s4.c1 c1Var, int i10) {
        String str;
        org.telegram.ui.Cells.f9 f9Var;
        ?? r10;
        TLRPC.Document document;
        long j3;
        String str2;
        ImageLocation imageLocation;
        TLRPC.Photo photo;
        String str3;
        long j10;
        boolean z10;
        char c10;
        boolean z11;
        long j11;
        long j12;
        CharSequence concat;
        int i11;
        int i12 = this.f;
        vl0 vl0Var = this.d;
        w51 G = G(i10);
        w51 G2 = G(i10 + 1);
        w51 G3 = G(i10 - 1);
        if (G == null) {
            return;
        }
        int i13 = c1Var.f;
        View view = c1Var.a;
        boolean J = J(i10);
        O(c1Var);
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
                            frameLayout.addView(G.c, (i13 == -1 || i13 == -4) ? w7.y5.c(G.z, -1) : w7.y5.c(-2.0f, -2));
                            break;
                        }
                    }
                    break;
                case -3:
                    h61 h61Var = (h61) view;
                    h61Var.a = G.z;
                    h61Var.b = w7.d0.a(G.y, 1);
                    if (h61Var.getChildCount() != (G.c == null ? 0 : 1) || h61Var.getChildAt(0) != G.c) {
                        h61Var.removeAllViews();
                        View view3 = G.c;
                        if (view3 != null) {
                            AndroidUtilities.removeFromParent(view3);
                            h61Var.addView(G.c, w7.y5.c(-1.0f, -1));
                            break;
                        }
                    }
                    break;
                case 0:
                case 1:
                case 26:
                    org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                    n4Var.setText(G.l);
                    n4Var.b(G.g);
                    break;
                case 2:
                    n21 n21Var = (n21) view;
                    int i14 = G.k;
                    if (i14 == 0) {
                        int i15 = G.z;
                        if (i15 != 0) {
                            n21Var.setEmojiSize(i15);
                        }
                        String charSequence = G.m.toString();
                        String charSequence2 = G.n.toString();
                        n21Var.getClass();
                        MediaDataController.getInstance(UserConfig.selectedAccount).setPlaceholderImage(n21Var.b, charSequence, charSequence2, "90_90");
                    } else if (G.q) {
                        n21Var.setEmojiStatic(i14);
                    } else {
                        n21Var.setEmoji(i14);
                    }
                    if (!TextUtils.isEmpty(G.o)) {
                        CharSequence charSequence3 = G.l;
                        CharSequence charSequence4 = G.o;
                        k90 k90Var = n21Var.c;
                        k90Var.setText(charSequence3);
                        k90Var.setVisibility(0);
                        k90 k90Var2 = n21Var.d;
                        k90Var2.setText(charSequence4);
                        k90Var2.setMaxWidth(ci.f4.a(charSequence4, k90Var2.getPaint()));
                        k90Var2.requestLayout();
                        n21Var.e();
                        break;
                    } else {
                        n21Var.setText(G.l);
                        break;
                    }
                case 3:
                    org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                    Object obj = G.G;
                    if (obj instanceof TLRPC.Document) {
                        CharSequence charSequence5 = G.l;
                        TLRPC.Document document2 = (TLRPC.Document) obj;
                        s8Var.w = 16;
                        s8Var.s = 58;
                        org.telegram.ui.ActionBar.j5 j5Var = s8Var.a;
                        j5Var.l(charSequence5, false);
                        j5Var.i(null);
                        o6 o6Var = s8Var.c;
                        s8Var.M = null;
                        o6Var.c(null, false, true);
                        s8Var.h.setVisibility(8);
                        o6Var.setVisibility(8);
                        s8Var.d.setVisibility(8);
                        kj0 kj0Var = s8Var.e;
                        kj0Var.setVisibility(8);
                        kj0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
                        s8Var.r = J;
                        s8Var.setWillNotDraw(!J);
                        Switch r12 = s8Var.f;
                        if (r12 != null) {
                            r12.setVisibility(8);
                        }
                        s8Var.setValueSticker(document2);
                    } else if (obj instanceof String) {
                        CharSequence charSequence6 = G.l;
                        String str4 = (String) obj;
                        s8Var.w = 16;
                        s8Var.s = 58;
                        org.telegram.ui.ActionBar.j5 j5Var2 = s8Var.a;
                        j5Var2.l(charSequence6, false);
                        j5Var2.i(null);
                        o6 o6Var2 = s8Var.c;
                        s8Var.M = null;
                        o6Var2.c(null, false, true);
                        s8Var.h.setVisibility(8);
                        o6Var2.setVisibility(8);
                        s8Var.d.setVisibility(8);
                        kj0 kj0Var2 = s8Var.e;
                        kj0Var2.setVisibility(8);
                        kj0Var2.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
                        s8Var.r = J;
                        s8Var.setWillNotDraw(!J);
                        Switch r13 = s8Var.f;
                        if (r13 != null) {
                            r13.setVisibility(8);
                        }
                        s8Var.setValueSticker(str4);
                    } else if (TextUtils.isEmpty(G.n)) {
                        Object obj2 = G.G;
                        if (obj2 instanceof Drawable) {
                            s8Var.n(G.l, (Drawable) obj2, J);
                        } else {
                            int i16 = G.k;
                            if (i16 == 0) {
                                s8Var.i(G.l, J);
                            } else {
                                s8Var.m(i16, G.l, J);
                            }
                        }
                    } else {
                        Object obj3 = G.G;
                        if (obj3 instanceof Drawable) {
                            s8Var.r(G.l, G.n, (Drawable) obj3, J);
                        } else {
                            int i17 = G.k;
                            if (i17 == 0) {
                                s8Var.o(G.l, G.n, false, J);
                            } else {
                                s8Var.s(G.l, G.n, false, i17, J);
                            }
                        }
                    }
                    if (G.q) {
                        int i18 = org.telegram.ui.ActionBar.j6.q6;
                        s8Var.e(i18, i18);
                    } else if (G.r) {
                        s8Var.e(org.telegram.ui.ActionBar.j6.q7, org.telegram.ui.ActionBar.j6.p7);
                    } else {
                        s8Var.e(org.telegram.ui.ActionBar.j6.m6, org.telegram.ui.ActionBar.j6.G6);
                    }
                    s8Var.g(G.g);
                    break;
                case 4:
                case 9:
                    org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
                    if (x8Var.b == G.d) {
                        x8Var.setChecked(G.e);
                    }
                    x8Var.e(null, G.g);
                    x8Var.f(G.l, G.e, J);
                    x8Var.b = G.d;
                    if (i13 == 9) {
                        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, G.e ? org.telegram.ui.ActionBar.j6.f6 : org.telegram.ui.ActionBar.j6.e6, false));
                        break;
                    }
                    break;
                case 5:
                    org.telegram.ui.Cells.k5 k5Var = (org.telegram.ui.Cells.k5) view;
                    CharSequence charSequence7 = G.m;
                    k5Var.b(G.l, G.m, 0, G.e, 0, charSequence7 != null && charSequence7.toString().contains("\n"), J, false);
                    break;
                case 6:
                    ((org.telegram.ui.Cells.k5) view).b(G.l, G.m, 0, G.e, 0, false, J, false);
                    break;
                case 7:
                case 8:
                case 38:
                    if (i13 == 7 || i13 == 8) {
                        org.telegram.ui.Cells.f9 f9Var2 = (org.telegram.ui.Cells.f9) view;
                        if (TextUtils.isEmpty(G.l)) {
                            f9Var2.setFixedSize(i13 == 8 ? 220 : 12);
                            f9Var2.setText("");
                        } else {
                            f9Var2.setFixedSize(0);
                            f9Var2.setText(G.l);
                        }
                        if (G.q) {
                            f9Var2.setTextGravity(17);
                            f9Var2.getTextView().setWidth(Math.min(ci.f4.a(f9Var2.getText(), f9Var2.getTextView().getPaint()), AndroidUtilities.displaySize.x - AndroidUtilities.dp(60.0f)));
                            f9Var2.getTextView().setPadding(0, AndroidUtilities.dp(17.0f), 0, AndroidUtilities.dp(17.0f));
                            f9Var = f9Var2;
                        } else {
                            f9Var2.setTextGravity(8388611);
                            f9Var2.getTextView().setMinWidth(0);
                            f9Var2.getTextView().setMaxWidth(AndroidUtilities.displaySize.x);
                            f9Var2.getTextView().setPadding(0, AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(17.0f));
                            f9Var = f9Var2;
                        }
                    } else if (i13 == 38) {
                        org.telegram.ui.Cells.b2 b2Var = (org.telegram.ui.Cells.b2) view;
                        CharSequence charSequence8 = G.o;
                        boolean z12 = G.f;
                        b2Var.a.setText(charSequence8);
                        View view4 = b2Var.b;
                        view4.animate().cancel();
                        view4.animate().rotation(z12 ? 0.0f : 180.0f).setDuration(340L).setInterpolator(qr.h).start();
                        if (G.q) {
                            b2Var.setColor(org.telegram.ui.ActionBar.j6.q6);
                            f9Var = b2Var;
                        } else if (G.r) {
                            b2Var.setColor(org.telegram.ui.ActionBar.j6.p7);
                            f9Var = b2Var;
                        } else {
                            b2Var.setColor(org.telegram.ui.ActionBar.j6.G6);
                            f9Var = b2Var;
                        }
                    } else {
                        f9Var = null;
                    }
                    boolean z13 = (G3 == null || K(G3.a)) ? false : true;
                    boolean z14 = (G2 == null || K(G2.a)) ? false : true;
                    if (!vl0Var.c1()) {
                        Drawable U0 = org.telegram.ui.ActionBar.j6.U0(this.e, (z13 && z14) ? R.drawable.greydivider : z13 ? R.drawable.greydivider_bottom : z14 ? R.drawable.greydivider_top : R.drawable.field_carret_empty, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.b7, this.v));
                        if (!this.n) {
                            f9Var.setBackground(U0);
                            break;
                        } else {
                            f9Var.setBackground(new LayerDrawable(new Drawable[]{new ColorDrawable(I(org.telegram.ui.ActionBar.j6.i5)), U0}));
                            break;
                        }
                    } else {
                        f9Var.setBackground(null);
                        break;
                    }
                    break;
                case 10:
                    org.telegram.ui.Cells.u2 u2Var = (org.telegram.ui.Cells.u2) view;
                    int i19 = u2Var.a;
                    TextView textView = u2Var.b;
                    TextView textView2 = u2Var.c;
                    RadioButton radioButton = u2Var.d;
                    if (i19 == G.d) {
                        radioButton.a(G.e, true);
                        u2Var.a(G.g, true);
                        r10 = 0;
                    } else {
                        r10 = 0;
                        u2Var.a(G.g, false);
                    }
                    if (TextUtils.isEmpty(G.n)) {
                        CharSequence charSequence9 = G.l;
                        boolean z15 = G.e;
                        textView2.setVisibility(8);
                        textView.setText(charSequence9);
                        radioButton.a(z15, r10);
                        u2Var.e = J;
                        u2Var.b();
                        u2Var.setWillNotDraw(!J);
                    } else {
                        CharSequence charSequence10 = G.l;
                        CharSequence charSequence11 = G.n;
                        boolean z16 = G.e;
                        textView2.setVisibility(r10);
                        textView2.setText(charSequence11);
                        textView.setText(charSequence10);
                        radioButton.a(z16, r10);
                        u2Var.e = J;
                        u2Var.b();
                        u2Var.setWillNotDraw(!J);
                    }
                    u2Var.a = G.d;
                    break;
                case 11:
                case 12:
                    org.telegram.ui.Cells.ab abVar = (org.telegram.ui.Cells.ab) view;
                    abVar.h(i12, G, J);
                    if (i13 == 12) {
                        abVar.c(G.e, false);
                        break;
                    }
                    break;
                case 13:
                    org.telegram.ui.Cells.ab abVar2 = (org.telegram.ui.Cells.ab) view;
                    abVar2.h(i12, G, J);
                    CharSequence charSequence12 = G.n;
                    abVar2.setQuery(charSequence12 == null ? null : charSequence12.toString().toLowerCase());
                    abVar2.setAddButtonVisible(!G.e);
                    abVar2.setCloseIcon(G.D);
                    break;
                case 14:
                    ew0 ew0Var = (ew0) view;
                    ew0Var.b(G.z, null, G.p);
                    ew0Var.setMinAllowedIndex((int) G.B);
                    ew0Var.setCallback(new mv(G, 27));
                    break;
                case 15:
                    org.telegram.ui.Cells.a8 a8Var = (org.telegram.ui.Cells.a8) view;
                    a8Var.d(G.z, (org.telegram.ui.Cells.z7) G.G, G.C);
                    a8Var.setMinValueAllowed((int) G.B);
                    break;
                case 16:
                    hg.x1 x1Var = (hg.x1) view;
                    x1Var.d.a(G.e, false);
                    x1Var.setReorder(this.M);
                    Object obj4 = G.G;
                    if (obj4 instanceof hg.a2) {
                        x1Var.a((hg.a2) obj4, null, J);
                        break;
                    }
                    break;
                case 17:
                    hg.v1 v1Var = (hg.v1) view;
                    v1Var.e.a(G.e, false);
                    Object obj5 = G.G;
                    if (obj5 instanceof hg.a2) {
                        hg.a2 a2Var = (hg.a2) obj5;
                        g9 g9Var = v1Var.a;
                        int[] iArr = v1Var.r;
                        TextView textView3 = v1Var.d;
                        ImageReceiver imageReceiver = v1Var.b;
                        int i20 = UserConfig.selectedAccount;
                        v1Var.c.setText(MessagesController.getInstance(i20).getPeerName(UserConfig.getInstance(i20).getClientUserId()));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        MessageObject messageObject = a2Var.e;
                        if (messageObject != null) {
                            spannableStringBuilder.append(Emoji.replaceEmoji(messageObject.messageText, textView3.getPaint().getFontMetricsInt(), false));
                        }
                        if (a2Var.a() > 1) {
                            spannableStringBuilder.append((CharSequence) "  ");
                            int dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(80.0f);
                            int a2 = a2Var.a() - 1;
                            int i21 = hg.w1.d;
                            SpannableString spannableString = new SpannableString("+");
                            hg.w1 w1Var = new hg.w1(a2);
                            iArr[0] = (int) (((u01) w1Var.c).c + AndroidUtilities.dp(10.0f));
                            spannableString.setSpan(w1Var, 0, spannableString.length(), 33);
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(TextUtils.ellipsize(spannableStringBuilder, textView3.getPaint(), (dp * 1.5f) - iArr[0], TextUtils.TruncateAt.END));
                            if (spannableStringBuilder2.length() > 0 && spannableStringBuilder2.charAt(spannableStringBuilder2.length() - 1) == 8230) {
                                spannableStringBuilder2.append((CharSequence) "  ");
                            }
                            spannableStringBuilder2.append((CharSequence) spannableString);
                            spannableStringBuilder = spannableStringBuilder2;
                        }
                        textView3.setText(spannableStringBuilder);
                        TLRPC.MessageMedia media = MessageObject.getMedia(a2Var.e);
                        if (media != null && (photo = media.photo) != null) {
                            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(36.0f), true, null, true);
                            ImageLocation forObject = ImageLocation.getForObject(closestPhotoSizeWithSize, media.photo);
                            MessageObject messageObject2 = a2Var.e;
                            imageReceiver.setImage(forObject, "36_36", messageObject2.strippedThumb, closestPhotoSizeWithSize == null ? 0L : closestPhotoSizeWithSize.size, (String) null, messageObject2, 0);
                            imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
                        } else if (media == null || (document = media.document) == null) {
                            g9Var.r(UserConfig.getInstance(i20).getCurrentUser());
                            imageReceiver.setForUserOrChat(UserConfig.getInstance(i20).getCurrentUser(), g9Var);
                            imageReceiver.setRoundRadius(AndroidUtilities.dp(56.0f));
                        } else {
                            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(36.0f), true, null, true);
                            if (closestPhotoSizeWithSize2 == null) {
                                ImageLocation forDocument = ImageLocation.getForDocument(media.document);
                                j3 = media.document.size;
                                imageLocation = forDocument;
                                str2 = ImageLoader.AUTOPLAY_FILTER;
                            } else {
                                ImageLocation forObject2 = ImageLocation.getForObject(closestPhotoSizeWithSize2, media.document);
                                j3 = closestPhotoSizeWithSize2.size;
                                str2 = "36_36";
                                imageLocation = forObject2;
                            }
                            long j13 = j3;
                            MessageObject messageObject3 = a2Var.e;
                            imageReceiver.setImage(imageLocation, str2, messageObject3.strippedThumb, j13, (String) null, messageObject3, 0);
                            imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
                        }
                        v1Var.s = J;
                        v1Var.invalidate();
                        break;
                    }
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    za1 za1Var = (za1) view;
                    int i22 = G.z;
                    na1 na1Var = (na1) G.G;
                    g61 g61Var = new g61(0, this, G);
                    za1Var.x = i22;
                    za1Var.y = g61Var;
                    za1Var.e(na1Var, false);
                    break;
                case 24:
                    ((org.telegram.ui.ie) view).set((org.telegram.ui.he) G.G);
                    break;
                case 25:
                    org.telegram.ui.je jeVar = (org.telegram.ui.je) view;
                    TL_stats.BroadcastRevenueTransaction broadcastRevenueTransaction = (TL_stats.BroadcastRevenueTransaction) G.G;
                    x5 x5Var = jeVar.b;
                    org.telegram.ui.ActionBar.f6 f6Var = jeVar.a;
                    TextView textView4 = jeVar.c;
                    TextView textView5 = jeVar.d;
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
                            sb2.append(z10 ? org.telegram.messenger.l0.g(R.string.MonetizationTransactionNotCompleted, new StringBuilder(" — ")) : "");
                            textView5.setText(sb2.toString());
                        }
                        j10 = tL_broadcastRevenueTransactionWithdrawal.amount;
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
                            j10 = ((TL_stats.TL_broadcastRevenueTransactionProceeds) broadcastRevenueTransaction).amount;
                        } else {
                            str3 = "+";
                            if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionRefund) {
                                textView4.setText(LocaleController.getString(R.string.MonetizationTransactionRefund));
                                textView5.setText(LocaleController.formatShortDateTime(r5.from_date));
                                j10 = ((TL_stats.TL_broadcastRevenueTransactionRefund) broadcastRevenueTransaction).amount;
                            }
                        }
                        z10 = false;
                        c10 = 1;
                    }
                    textView5.setTextColor(org.telegram.ui.ActionBar.j6.v0(z10 ? org.telegram.ui.ActionBar.j6.p7 : org.telegram.ui.ActionBar.j6.y6, f6Var));
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                    spannableStringBuilder3.append((CharSequence) (c10 < 0 ? "-" : str3));
                    spannableStringBuilder3.append((CharSequence) "TON ");
                    spannableStringBuilder3.append((CharSequence) jeVar.e.format(Math.abs(j10) / 1.0E9d));
                    int indexOf = TextUtils.indexOf(spannableStringBuilder3, ".");
                    if (indexOf >= 0) {
                        z11 = false;
                        spannableStringBuilder3.setSpan(new RelativeSizeSpan(1.15f), 0, indexOf + 1, 33);
                    } else {
                        z11 = false;
                    }
                    x5Var.setText(org.telegram.ui.ke.f0(spannableStringBuilder3, x5Var.getPaint(), 1.1f, AndroidUtilities.dp(0.33f), z11));
                    x5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(c10 < 0 ? org.telegram.ui.ActionBar.j6.q7 : org.telegram.ui.ActionBar.j6.l8, f6Var));
                    jeVar.f = J;
                    jeVar.setWillNotDraw(!J);
                    break;
                case 27:
                    ci.ha haVar = (ci.ha) view;
                    long j14 = haVar.x;
                    Object obj6 = G.G;
                    if (!(obj6 instanceof TLRPC.User)) {
                        if (!(obj6 instanceof TLRPC.Chat)) {
                            j11 = 0;
                            boolean z17 = j14 != j11;
                            haVar.d(false, true);
                            haVar.set(G.G);
                            haVar.f.setVisibility(8);
                            haVar.h.setVisibility(0);
                            haVar.c(G.e, z17);
                            haVar.setDivider(J);
                            break;
                        } else {
                            j12 = -((TLRPC.Chat) obj6).id;
                        }
                    } else {
                        j12 = ((TLRPC.User) obj6).id;
                    }
                    j11 = j12;
                    if (j14 != j11) {
                    }
                    haVar.d(false, true);
                    haVar.set(G.G);
                    haVar.f.setVisibility(8);
                    haVar.h.setVisibility(0);
                    haVar.c(G.e, z17);
                    haVar.setDivider(J);
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
                    ((j61) view).setHeight(G.z);
                    break;
                case 29:
                    hg.t tVar = (hg.t) view;
                    Object obj7 = G.G;
                    if (obj7 instanceof hg.u) {
                        org.telegram.ui.ActionBar.j5 j5Var3 = tVar.a;
                        org.telegram.ui.ActionBar.j5 j5Var4 = tVar.c;
                        vh.o oVar = tVar.b;
                        tVar.e = J;
                        TL_account.TL_businessChatLink tL_businessChatLink = ((hg.u) obj7).a;
                        tVar.f = tL_businessChatLink;
                        if (TextUtils.isEmpty(tL_businessChatLink.title)) {
                            String str5 = tVar.f.link;
                            hg.y[] yVarArr = hg.y.e;
                            if (str5.startsWith("https://")) {
                                str5 = str5.substring(8);
                            }
                            j5Var3.l(str5, false);
                        } else {
                            j5Var3.l(tVar.f.title, false);
                        }
                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(tVar.f.message);
                        TL_account.TL_businessChatLink tL_businessChatLink2 = tVar.f;
                        MediaDataController.addTextStyleRuns(tL_businessChatLink2.entities, tL_businessChatLink2.message, spannableStringBuilder4);
                        CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder4, oVar.getPaint().getFontMetricsInt(), false);
                        MessageObject.replaceAnimatedEmoji(replaceEmoji, tVar.f.entities, oVar.getPaint().getFontMetricsInt());
                        oVar.setText(replaceEmoji);
                        int i24 = tVar.f.views;
                        if (i24 == 0) {
                            j5Var4.l(LocaleController.formatString(R.string.NoClicks, new Object[0]), false);
                        } else {
                            j5Var4.l(LocaleController.formatPluralString("Clicks", i24, new Object[0]), false);
                        }
                        j5Var4.requestLayout();
                        tVar.invalidate();
                        break;
                    }
                    break;
                case MessageObject.TYPE_GIFT_STARS /* 30 */:
                    org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) view;
                    CharSequence charSequence13 = G.l;
                    int i25 = G.k;
                    i9Var.b.l(charSequence13, false);
                    i9Var.a.setImageResource(i25);
                    i9Var.setDivider(J);
                    i9Var.setBackgroundColor(I(org.telegram.ui.ActionBar.j6.h5));
                    break;
                case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                    org.telegram.ui.Cells.w3 w3Var = (org.telegram.ui.Cells.w3) view;
                    if (!TextUtils.equals(w3Var.getText(), G.l)) {
                        w3Var.c(G.l, G.m, G.D);
                        break;
                    } else {
                        w3Var.b(G.m, G.D);
                        break;
                    }
                case 32:
                    org.telegram.ui.Cells.j6 j6Var = (org.telegram.ui.Cells.j6) view;
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
                            j6Var.B0 = z18;
                            j6Var.C0 = r10;
                            j6Var.setRectangularAvatar(G.r);
                            CharSequence charSequence14 = G.m;
                            j6Var.t(obj8, null, str6, charSequence14 == null ? charSequence14 : concat, false, false);
                            j6Var.s(G.e, false);
                            j6Var.M = J;
                        }
                        concat = "";
                        if (!(obj8 instanceof TLRPC.Chat)) {
                        }
                        String str62 = str;
                        boolean z182 = G.t;
                        Object obj92 = G.H;
                        if (obj92 instanceof Utilities.Callback) {
                        }
                        j6Var.B0 = z182;
                        j6Var.C0 = r10;
                        j6Var.setRectangularAvatar(G.r);
                        CharSequence charSequence142 = G.m;
                        j6Var.t(obj8, null, str62, charSequence142 == null ? charSequence142 : concat, false, false);
                        j6Var.s(G.e, false);
                        j6Var.M = J;
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
                                j6Var.B0 = z1822;
                                j6Var.C0 = callback;
                                j6Var.setRectangularAvatar(G.r);
                                CharSequence charSequence1422 = G.m;
                                j6Var.t(obj8, null, str622, charSequence1422 == null ? charSequence1422 : concat, false, false);
                                j6Var.s(G.e, false);
                                j6Var.M = J;
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
                        j6Var.B0 = z18222;
                        j6Var.C0 = callback;
                        j6Var.setRectangularAvatar(G.r);
                        CharSequence charSequence14222 = G.m;
                        j6Var.t(obj8, null, str6222, charSequence14222 == null ? charSequence14222 : concat, false, false);
                        j6Var.s(G.e, false);
                        j6Var.M = J;
                    }
                    break;
                case 33:
                    org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
                    Object obj10 = G.G;
                    MessageObject messageObject4 = obj10 instanceof MessageObject ? (MessageObject) obj10 : null;
                    s2Var.s2 = J;
                    if (messageObject4 != null) {
                        s2Var.W(messageObject4.getDialogId(), messageObject4, messageObject4.messageOwner.date, false, false);
                        break;
                    } else {
                        s2Var.W(0L, null, 0, false, false);
                        break;
                    }
                case 34:
                    ((t00) view).setViewType(G.z);
                    break;
                case 35:
                case 36:
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    org.telegram.ui.Cells.a2 a2Var2 = (org.telegram.ui.Cells.a2) view;
                    a2Var2.setPad(G.i);
                    a2Var2.e(G.l, "", G.e, J, a2Var2.a == G.d);
                    a2Var2.a = G.d;
                    a2Var2.setIcon(G.t ? R.drawable.permission_locked : 0);
                    if (i13 == 36 || i13 == 41) {
                        boolean z19 = G.f;
                        CharSequence charSequence15 = G.o;
                        View.OnClickListener onClickListener = G.D;
                        org.telegram.ui.Cells.z1 z1Var = a2Var2.v;
                        if (z1Var != null) {
                            o6 o6Var3 = z1Var.b;
                            o6Var3.a();
                            o6Var3.setText(charSequence15);
                            View view5 = z1Var.c;
                            view5.animate().cancel();
                            view5.animate().rotation(z19 ? 0.0f : 180.0f).setDuration(340L).setInterpolator(qr.h).start();
                            if (onClickListener != null) {
                                z1Var.setOnClickListener(onClickListener);
                                break;
                            }
                        }
                    }
                    break;
                case 37:
                    org.telegram.ui.Cells.a2 a2Var3 = (org.telegram.ui.Cells.a2) view;
                    a2Var3.setPad(G.i);
                    a2Var3.setUserOrChat((TLObject) G.G);
                    a2Var3.c(G.e, a2Var3.a == G.d);
                    a2Var3.a = G.d;
                    a2Var3.setNeedDivider(J);
                    break;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                    w8Var.d(G.l.toString(), G.e, J, w8Var.a == G.d);
                    w8Var.getCheckBox().setDrawIconType(G.z);
                    Switch checkBox = w8Var.getCheckBox();
                    int i26 = G.z == 0 ? org.telegram.ui.ActionBar.j6.M6 : org.telegram.ui.ActionBar.j6.r7;
                    int i27 = org.telegram.ui.ActionBar.j6.N6;
                    int i28 = org.telegram.ui.ActionBar.j6.d6;
                    checkBox.d(i26, i27, i28, i28);
                    w8Var.a = G.d;
                    w8Var.setIcon(G.t ? R.drawable.permission_locked : 0);
                    if (i13 == 40) {
                        if (!TextUtils.isEmpty(G.o)) {
                            w8Var.a(new wn0(21, G, w8Var), G.o.toString(), G.f);
                            break;
                        } else {
                            LinearLayout linearLayout = w8Var.f;
                            if (linearLayout != null) {
                                linearLayout.setVisibility(8);
                                break;
                            }
                        }
                    }
                    break;
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    org.telegram.ui.Cells.n4 n4Var2 = (org.telegram.ui.Cells.n4) view;
                    n4Var2.c(G.o, n4Var2.a == G.d);
                    n4Var2.a = G.d;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    org.telegram.ui.Cells.fa faVar = (org.telegram.ui.Cells.fa) view;
                    faVar.getValueBackupImageView().setImageDrawable(null);
                    CharSequence charSequence16 = G.l;
                    if (charSequence16 != null) {
                        CharSequence charSequence17 = G.m;
                        if (charSequence17 != null) {
                            faVar.c(charSequence16, charSequence17, false, J);
                        } else {
                            faVar.b(charSequence16, J);
                        }
                    }
                    faVar.setIcon(G.k);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    ((org.telegram.ui.Cells.k6) view).b(G.l.toString(), G.n.toString(), J, G.e);
                    break;
            }
        } else {
            v51 F = w51.F(i13);
            if (F != null) {
                F.bindView(c1Var.a, G, J, this, vl0Var instanceof s61 ? (s61) vl0Var : null);
            }
        }
        org.telegram.ui.s3 s3Var = G.F;
        if (s3Var != null) {
            s3Var.run(view);
        }
    }

    @Override // s4.h0
    public s4.c1 x(ViewGroup viewGroup, int i10) {
        View x5Var;
        View n4Var;
        View view;
        View view2;
        org.telegram.ui.Cells.n4 n4Var2;
        boolean z10 = this.n;
        int i11 = z10 ? org.telegram.ui.ActionBar.j6.h5 : org.telegram.ui.ActionBar.j6.d6;
        Context context = this.e;
        if (i10 < 10000) {
            org.telegram.ui.ActionBar.f6 f6Var = this.v;
            switch (i10) {
                case -4:
                case -1:
                    x5Var = new ai.x5(context, 21);
                    if (i10 == -4) {
                        x5Var.setTag(-33024);
                    }
                    view2 = x5Var;
                    break;
                case -3:
                    h61 h61Var = new h61(context);
                    h61Var.a = 0;
                    view2 = h61Var;
                    break;
                case -2:
                    view2 = new ai.x5(context, 22);
                    break;
                case 0:
                    if (!z10) {
                        view2 = new org.telegram.ui.Cells.n4(context, f6Var);
                        break;
                    } else {
                        view = new org.telegram.ui.Cells.n4(this.e, org.telegram.ui.ActionBar.j6.L6, 21, 15, 0, false, false, this.v);
                        view2 = view;
                        break;
                    }
                case 1:
                    n4Var = new org.telegram.ui.Cells.n4(this.e, org.telegram.ui.ActionBar.j6.G6, 17, 15, false, this.v);
                    view2 = n4Var;
                    break;
                case 2:
                    view2 = new n21(context, f6Var);
                    break;
                case 3:
                    view2 = new org.telegram.ui.Cells.s8(context, f6Var);
                    break;
                case 4:
                case 9:
                    org.telegram.ui.Cells.x8 x8Var = new org.telegram.ui.Cells.x8(context, f6Var);
                    view = x8Var;
                    if (i10 == 9) {
                        x8Var.setDrawCheckRipple(true);
                        x8Var.d(org.telegram.ui.ActionBar.j6.g6, org.telegram.ui.ActionBar.j6.O6, org.telegram.ui.ActionBar.j6.P6, org.telegram.ui.ActionBar.j6.Q6, org.telegram.ui.ActionBar.j6.R6);
                        x8Var.setTypeface(AndroidUtilities.bold());
                        x8Var.setHeight(56);
                        view = x8Var;
                    }
                    view2 = view;
                    break;
                case 5:
                case 6:
                    n4Var = new org.telegram.ui.Cells.k5(21, 60, this.e, this.v, i10 == 6);
                    view2 = n4Var;
                    break;
                case 7:
                case 8:
                default:
                    view2 = new org.telegram.ui.Cells.f9(context, f6Var);
                    break;
                case 10:
                    org.telegram.ui.Cells.u2 u2Var = new org.telegram.ui.Cells.u2(context);
                    TextView textView = new TextView(context);
                    u2Var.b = textView;
                    org.telegram.messenger.rk.t(textView, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false), 1, 16.0f, 1);
                    textView.setMaxLines(1);
                    textView.setSingleLine(true);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView.setEllipsize(truncateAt);
                    textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                    boolean z11 = LocaleController.isRTL;
                    u2Var.addView(textView, w7.y5.d(-1, -1.0f, (z11 ? 5 : 3) | 48, z11 ? 61.0f : 23.0f, 0.0f, z11 ? 23.0f : 61.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    u2Var.c = textView2;
                    org.telegram.messenger.rk.t(textView2, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I6, false), 1, 16.0f, 1);
                    textView2.setMaxLines(1);
                    textView2.setSingleLine(true);
                    textView2.setEllipsize(truncateAt);
                    textView2.setGravity((LocaleController.isRTL ? 3 : 5) | 16);
                    textView2.setVisibility(8);
                    u2Var.addView(textView2, w7.y5.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 23.0f, 0.0f, 23.0f, 0.0f));
                    RadioButton radioButton = new RadioButton(context);
                    u2Var.d = radioButton;
                    radioButton.setSize(AndroidUtilities.dp(20.0f));
                    radioButton.b(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.g7, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.h7, false));
                    u2Var.addView(radioButton, w7.y5.d(22, 22.0f, (LocaleController.isRTL ? 3 : 5) | 48, 20.0f, 15.0f, 20.0f, 0.0f));
                    u2Var.b();
                    view2 = u2Var;
                    break;
                case 11:
                case 12:
                    org.telegram.ui.Cells.ab abVar = new org.telegram.ui.Cells.ab(context, 6, i10 != 12 ? 0 : 3, false);
                    abVar.setSelfAsSavedMessages(true);
                    view2 = abVar;
                    break;
                case 13:
                    n4Var = new org.telegram.ui.Cells.ab(6, 0, this.e, null, false, true);
                    view2 = n4Var;
                    break;
                case 14:
                    view2 = new ew0(context, f6Var);
                    break;
                case 15:
                    view2 = new org.telegram.ui.Cells.a8(context, f6Var);
                    break;
                case 16:
                    view2 = new hg.x1(context, f6Var, this.L != null);
                    break;
                case 17:
                    view2 = new hg.v1(context, f6Var);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    if (this.y == null) {
                        this.y = new ig.f(null);
                    }
                    view2 = new za1(this.e, this.f, i10 - 18, this.y, this.h);
                    break;
                case 24:
                    view2 = new org.telegram.ui.ie(context, f6Var);
                    break;
                case 25:
                    view2 = new org.telegram.ui.je(context, f6Var);
                    break;
                case 26:
                    n4Var2 = new org.telegram.ui.Cells.n4(this.e, org.telegram.ui.ActionBar.j6.G6, 23, 20, 0, false, false, this.v);
                    n4Var2.setTextSize(20.0f);
                    view2 = n4Var2;
                    break;
                case 27:
                    ci.ha haVar = new ci.ha(context, f6Var);
                    haVar.d(false, false);
                    view2 = haVar;
                    break;
                case 28:
                    x5Var = new j61(context);
                    x5Var.setTag(-33024);
                    view2 = x5Var;
                    break;
                case 29:
                    view2 = new hg.t(context, f6Var);
                    break;
                case MessageObject.TYPE_GIFT_STARS /* 30 */:
                    view2 = new org.telegram.ui.Cells.i9(context, f6Var);
                    break;
                case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                    vl0 vl0Var = this.d;
                    if (vl0Var != null && vl0Var.c1()) {
                        org.telegram.ui.Cells.w3 w3Var = new org.telegram.ui.Cells.w3(context, 28, f6Var);
                        w3Var.setNoBackground(true);
                        view2 = w3Var;
                        break;
                    } else {
                        view2 = new org.telegram.ui.Cells.w3(context, f6Var);
                        break;
                    }
                    break;
                case 32:
                    view2 = new org.telegram.ui.Cells.j6(context, null);
                    break;
                case 33:
                    view2 = new org.telegram.ui.Cells.s2(context, true);
                    break;
                case 34:
                    t00 t00Var = new t00(context, f6Var);
                    t00Var.setIsSingleCell(true);
                    view2 = t00Var;
                    break;
                case 35:
                case 36:
                case 37:
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(i10 == 35 ? 4 : i10 == 36 ? 6 : i10 == 37 ? 7 : i10 == 41 ? 8 : 0, 21, this.e, this.v, true);
                    a2Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.j6.V6, org.telegram.ui.ActionBar.j6.g7, org.telegram.ui.ActionBar.j6.k7);
                    view2 = a2Var;
                    break;
                case 38:
                    view2 = new org.telegram.ui.Cells.b2(context, f6Var);
                    break;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    view2 = new org.telegram.ui.Cells.w8(context);
                    break;
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    n4Var2 = new org.telegram.ui.Cells.n4(this.e, org.telegram.ui.ActionBar.j6.L6, 21, 15, 0, false, true, this.v);
                    view2 = n4Var2;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    view2 = new org.telegram.ui.Cells.fa(context, 0, f6Var);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    view2 = new org.telegram.ui.Cells.k6(context, false);
                    break;
            }
        } else {
            v51 F = w51.F(i10);
            view2 = F != null ? F.createView(this.e, this.d, this.f, this.h, this.v) : new View(context);
        }
        if (this.r) {
            if (i10 < 10000) {
                switch (i10) {
                }
            }
            view2.setBackgroundColor(I(i11));
        }
        return new fl0(view2);
    }

    @Override // s4.h0
    public void y(s4.c1 c1Var) {
        Q(c1Var, this.M);
        O(c1Var);
    }
}
