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
import org.telegram.ui.ea1;
import org.telegram.ui.qa1;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public class j61 extends og.b {
    public h61 H;
    public h61 I;
    public int J;
    public boolean K;
    public Utilities.Callback2 L;
    public boolean M;
    public final wl0 d;
    public final Context e;
    public final int f;
    public final int h;
    public final boolean n;
    public Utilities.Callback2 s;
    public final org.telegram.ui.ActionBar.d6 v;
    public ig.f y;
    public boolean r = true;
    public final ArrayList w = new ArrayList();
    public final ArrayList x = new ArrayList();
    public int E = 0;
    public final ArrayList F = new ArrayList();
    public final ArrayList G = new ArrayList();

    public j61(wl0 wl0Var, Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, org.telegram.ui.ActionBar.d6 d6Var) {
        this.d = wl0Var;
        this.e = context;
        this.f = i10;
        this.h = i11;
        this.n = z10;
        this.s = callback2;
        this.v = d6Var;
        N(false);
    }

    public static boolean K(int i10) {
        if (i10 < 10000) {
            return i10 == 7 || i10 == 8 || i10 == 38 || i10 == 31 || i10 == -4 || i10 == 28 || i10 == 2 || i10 == -2;
        }
        u51 F = v51.F(i10);
        return F != null && F.isShadow();
    }

    @Override // org.telegram.ui.Components.vl0
    public boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        v51 G = G(c1Var.b());
        if (i10 >= 10000) {
            u51 F = v51.F(i10);
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
            h61 h61Var = (h61) arrayList.get(i10);
            this.L.run(Integer.valueOf(i10), new ArrayList(this.x.subList(h61Var.a, h61Var.b + 1)));
            this.K = false;
        }
    }

    public final v51 G(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = this.x;
        if (i10 >= arrayList.size()) {
            return null;
        }
        return (v51) arrayList.get(i10);
    }

    public final int H(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.G;
            if (i11 >= arrayList.size()) {
                return -1;
            }
            h61 h61Var = (h61) arrayList.get(i11);
            if (i10 >= h61Var.a && i10 <= h61Var.b) {
                return i11;
            }
            i11++;
        }
    }

    public int I(int i10) {
        return org.telegram.ui.ActionBar.h6.v0(i10, this.v);
    }

    public final boolean J(int i10) {
        v51 G = G(i10);
        v51 G2 = G(i10 + 1);
        return (G == null || G.j || G2 == null || K(G2.a) != K(G.a)) ? false : true;
    }

    public final void L() {
        h61 h61Var = this.I;
        if (h61Var != null) {
            h61Var.b = Math.max(0, this.x.size() - 1);
        }
    }

    public final int M() {
        h61 h61Var = new h61();
        this.I = h61Var;
        h61Var.a = this.x.size();
        h61 h61Var2 = this.I;
        h61Var2.b = -1;
        this.G.add(h61Var2);
        return r1.size() - 1;
    }

    public void N(boolean z10) {
        wl0 wl0Var = this.d;
        if (wl0Var == null || !wl0Var.b0()) {
            P(z10);
        } else {
            wl0Var.post(new yr0(5, this, z10));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void O(s4.c1 c1Var) {
        View view = c1Var.a;
        if (view instanceof org.telegram.ui.ActionBar.x5) {
            ((org.telegram.ui.ActionBar.x5) view).e();
            int i10 = c1Var.f;
            if (this.r) {
                if (i10 < 10000) {
                    switch (i10) {
                    }
                }
                view.setBackgroundColor(I(this.n ? org.telegram.ui.ActionBar.h6.h5 : org.telegram.ui.ActionBar.h6.d6));
            }
        }
    }

    public final void P(boolean z10) {
        wl0 wl0Var = this.d;
        if (wl0Var == null || !wl0Var.b0()) {
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
            ((hg.y1) view).setReorder(z10);
        } else {
            u51 F = v51.F(i10);
            if (F != null) {
                F.attachedView(this.d, view, G(c1Var.b()));
            }
        }
    }

    public final void R() {
        wl0 wl0Var = this.d;
        if (wl0Var == null) {
            return;
        }
        ArrayList arrayList = wl0Var.K2;
        if (arrayList == null) {
            wl0Var.K2 = new ArrayList();
        } else {
            arrayList.clear();
        }
        ArrayList arrayList2 = this.F;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            h61 h61Var = (h61) obj;
            wl0Var.K2.add(Long.valueOf(AndroidUtilities.pack(h61Var.a, h61Var.b)));
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
        h61 h61Var = this.H;
        if (h61Var != null) {
            h61Var.b = Math.max(0, (this.x.size() + this.E) - 1);
            h61 h61Var2 = this.H;
            if (h61Var2.a == h61Var2.b) {
                this.F.remove(h61Var2);
            }
            this.H = null;
        }
    }

    public final void U() {
        h61 h61Var = new h61();
        this.H = h61Var;
        h61Var.a = this.x.size() + this.E;
        h61 h61Var2 = this.H;
        h61Var2.b = -1;
        this.F.add(h61Var2);
    }

    @Override // s4.h0
    public final int h() {
        return this.x.size();
    }

    @Override // s4.h0
    public final int j(int i10) {
        v51 G = G(i10);
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
        org.telegram.ui.Cells.e9 e9Var;
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
        wl0 wl0Var = this.d;
        v51 G = G(i10);
        v51 G2 = G(i10 + 1);
        v51 G3 = G(i10 - 1);
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
                    g61 g61Var = (g61) view;
                    g61Var.a = G.z;
                    g61Var.b = w7.d0.a(G.y, 1);
                    if (g61Var.getChildCount() != (G.c == null ? 0 : 1) || g61Var.getChildAt(0) != G.c) {
                        g61Var.removeAllViews();
                        View view3 = G.c;
                        if (view3 != null) {
                            AndroidUtilities.removeFromParent(view3);
                            g61Var.addView(G.c, w7.y5.c(-1.0f, -1));
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
                    m21 m21Var = (m21) view;
                    int i14 = G.k;
                    if (i14 == 0) {
                        int i15 = G.z;
                        if (i15 != 0) {
                            m21Var.setEmojiSize(i15);
                        }
                        String charSequence = G.m.toString();
                        String charSequence2 = G.n.toString();
                        m21Var.getClass();
                        MediaDataController.getInstance(UserConfig.selectedAccount).setPlaceholderImage(m21Var.b, charSequence, charSequence2, "90_90");
                    } else if (G.q) {
                        m21Var.setEmojiStatic(i14);
                    } else {
                        m21Var.setEmoji(i14);
                    }
                    if (!TextUtils.isEmpty(G.o)) {
                        CharSequence charSequence3 = G.l;
                        CharSequence charSequence4 = G.o;
                        n90 n90Var = m21Var.c;
                        n90Var.setText(charSequence3);
                        n90Var.setVisibility(0);
                        n90 n90Var2 = m21Var.d;
                        n90Var2.setText(charSequence4);
                        n90Var2.setMaxWidth(ci.e4.a(charSequence4, n90Var2.getPaint()));
                        n90Var2.requestLayout();
                        m21Var.e();
                        break;
                    } else {
                        m21Var.setText(G.l);
                        break;
                    }
                case 3:
                    org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                    Object obj = G.G;
                    if (obj instanceof TLRPC.Document) {
                        CharSequence charSequence5 = G.l;
                        TLRPC.Document document2 = (TLRPC.Document) obj;
                        r8Var.w = 16;
                        r8Var.s = 58;
                        org.telegram.ui.ActionBar.h5 h5Var = r8Var.a;
                        h5Var.l(charSequence5, false);
                        h5Var.i(null);
                        p6 p6Var = r8Var.c;
                        r8Var.M = null;
                        p6Var.c(null, false, true);
                        r8Var.h.setVisibility(8);
                        p6Var.setVisibility(8);
                        r8Var.d.setVisibility(8);
                        lj0 lj0Var = r8Var.e;
                        lj0Var.setVisibility(8);
                        lj0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
                        r8Var.r = J;
                        r8Var.setWillNotDraw(!J);
                        Switch r12 = r8Var.f;
                        if (r12 != null) {
                            r12.setVisibility(8);
                        }
                        r8Var.setValueSticker(document2);
                    } else if (obj instanceof String) {
                        CharSequence charSequence6 = G.l;
                        String str4 = (String) obj;
                        r8Var.w = 16;
                        r8Var.s = 58;
                        org.telegram.ui.ActionBar.h5 h5Var2 = r8Var.a;
                        h5Var2.l(charSequence6, false);
                        h5Var2.i(null);
                        p6 p6Var2 = r8Var.c;
                        r8Var.M = null;
                        p6Var2.c(null, false, true);
                        r8Var.h.setVisibility(8);
                        p6Var2.setVisibility(8);
                        r8Var.d.setVisibility(8);
                        lj0 lj0Var2 = r8Var.e;
                        lj0Var2.setVisibility(8);
                        lj0Var2.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
                        r8Var.r = J;
                        r8Var.setWillNotDraw(!J);
                        Switch r13 = r8Var.f;
                        if (r13 != null) {
                            r13.setVisibility(8);
                        }
                        r8Var.setValueSticker(str4);
                    } else if (TextUtils.isEmpty(G.n)) {
                        Object obj2 = G.G;
                        if (obj2 instanceof Drawable) {
                            r8Var.n(G.l, (Drawable) obj2, J);
                        } else {
                            int i16 = G.k;
                            if (i16 == 0) {
                                r8Var.i(G.l, J);
                            } else {
                                r8Var.m(i16, G.l, J);
                            }
                        }
                    } else {
                        Object obj3 = G.G;
                        if (obj3 instanceof Drawable) {
                            r8Var.r(G.l, G.n, (Drawable) obj3, J);
                        } else {
                            int i17 = G.k;
                            if (i17 == 0) {
                                r8Var.o(G.l, G.n, false, J);
                            } else {
                                r8Var.s(G.l, G.n, false, i17, J);
                            }
                        }
                    }
                    if (G.q) {
                        int i18 = org.telegram.ui.ActionBar.h6.q6;
                        r8Var.e(i18, i18);
                    } else if (G.r) {
                        r8Var.e(org.telegram.ui.ActionBar.h6.q7, org.telegram.ui.ActionBar.h6.p7);
                    } else {
                        r8Var.e(org.telegram.ui.ActionBar.h6.m6, org.telegram.ui.ActionBar.h6.G6);
                    }
                    r8Var.g(G.g);
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
                        view.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, G.e ? org.telegram.ui.ActionBar.h6.f6 : org.telegram.ui.ActionBar.h6.e6, false));
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
                            e9Var2.getTextView().setWidth(Math.min(ci.e4.a(e9Var2.getText(), e9Var2.getTextView().getPaint()), AndroidUtilities.displaySize.x - AndroidUtilities.dp(60.0f)));
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
                        org.telegram.ui.Cells.b2 b2Var = (org.telegram.ui.Cells.b2) view;
                        CharSequence charSequence8 = G.o;
                        boolean z12 = G.f;
                        b2Var.a.setText(charSequence8);
                        View view4 = b2Var.b;
                        view4.animate().cancel();
                        view4.animate().rotation(z12 ? 0.0f : 180.0f).setDuration(340L).setInterpolator(rr.h).start();
                        if (G.q) {
                            b2Var.setColor(org.telegram.ui.ActionBar.h6.q6);
                            e9Var = b2Var;
                        } else if (G.r) {
                            b2Var.setColor(org.telegram.ui.ActionBar.h6.p7);
                            e9Var = b2Var;
                        } else {
                            b2Var.setColor(org.telegram.ui.ActionBar.h6.G6);
                            e9Var = b2Var;
                        }
                    } else {
                        e9Var = null;
                    }
                    boolean z13 = (G3 == null || K(G3.a)) ? false : true;
                    boolean z14 = (G2 == null || K(G2.a)) ? false : true;
                    if (!wl0Var.b1()) {
                        Drawable U0 = org.telegram.ui.ActionBar.h6.U0(this.e, (z13 && z14) ? R.drawable.greydivider : z13 ? R.drawable.greydivider_bottom : z14 ? R.drawable.greydivider_top : R.drawable.field_carret_empty, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.b7, this.v));
                        if (!this.n) {
                            e9Var.setBackground(U0);
                            break;
                        } else {
                            e9Var.setBackground(new LayerDrawable(new Drawable[]{new ColorDrawable(I(org.telegram.ui.ActionBar.h6.i5)), U0}));
                            break;
                        }
                    } else {
                        e9Var.setBackground(null);
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
                    org.telegram.ui.Cells.za zaVar = (org.telegram.ui.Cells.za) view;
                    zaVar.h(i12, G, J);
                    if (i13 == 12) {
                        zaVar.c(G.e, false);
                        break;
                    }
                    break;
                case 13:
                    org.telegram.ui.Cells.za zaVar2 = (org.telegram.ui.Cells.za) view;
                    zaVar2.h(i12, G, J);
                    CharSequence charSequence12 = G.n;
                    zaVar2.setQuery(charSequence12 == null ? null : charSequence12.toString().toLowerCase());
                    zaVar2.setAddButtonVisible(!G.e);
                    zaVar2.setCloseIcon(G.D);
                    break;
                case 14:
                    ew0 ew0Var = (ew0) view;
                    ew0Var.b(G.z, null, G.p);
                    ew0Var.setMinAllowedIndex((int) G.B);
                    ew0Var.setCallback(new nv(G, 27));
                    break;
                case 15:
                    org.telegram.ui.Cells.z7 z7Var = (org.telegram.ui.Cells.z7) view;
                    z7Var.d(G.z, (org.telegram.ui.Cells.y7) G.G, G.C);
                    z7Var.setMinValueAllowed((int) G.B);
                    break;
                case 16:
                    hg.y1 y1Var = (hg.y1) view;
                    y1Var.d.a(G.e, false);
                    y1Var.setReorder(this.M);
                    Object obj4 = G.G;
                    if (obj4 instanceof hg.b2) {
                        y1Var.a((hg.b2) obj4, null, J);
                        break;
                    }
                    break;
                case 17:
                    hg.w1 w1Var = (hg.w1) view;
                    w1Var.e.a(G.e, false);
                    Object obj5 = G.G;
                    if (obj5 instanceof hg.b2) {
                        hg.b2 b2Var2 = (hg.b2) obj5;
                        h9 h9Var = w1Var.a;
                        int[] iArr = w1Var.r;
                        TextView textView3 = w1Var.d;
                        ImageReceiver imageReceiver = w1Var.b;
                        int i20 = UserConfig.selectedAccount;
                        w1Var.c.setText(MessagesController.getInstance(i20).getPeerName(UserConfig.getInstance(i20).getClientUserId()));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        MessageObject messageObject = b2Var2.e;
                        if (messageObject != null) {
                            spannableStringBuilder.append(Emoji.replaceEmoji(messageObject.messageText, textView3.getPaint().getFontMetricsInt(), false));
                        }
                        if (b2Var2.a() > 1) {
                            spannableStringBuilder.append((CharSequence) "  ");
                            int dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(80.0f);
                            int a2 = b2Var2.a() - 1;
                            int i21 = hg.x1.d;
                            SpannableString spannableString = new SpannableString("+");
                            hg.x1 x1Var = new hg.x1(a2);
                            iArr[0] = (int) (((t01) x1Var.c).c + AndroidUtilities.dp(10.0f));
                            spannableString.setSpan(x1Var, 0, spannableString.length(), 33);
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(TextUtils.ellipsize(spannableStringBuilder, textView3.getPaint(), (dp * 1.5f) - iArr[0], TextUtils.TruncateAt.END));
                            if (spannableStringBuilder2.length() > 0 && spannableStringBuilder2.charAt(spannableStringBuilder2.length() - 1) == 8230) {
                                spannableStringBuilder2.append((CharSequence) "  ");
                            }
                            spannableStringBuilder2.append((CharSequence) spannableString);
                            spannableStringBuilder = spannableStringBuilder2;
                        }
                        textView3.setText(spannableStringBuilder);
                        TLRPC.MessageMedia media = MessageObject.getMedia(b2Var2.e);
                        if (media != null && (photo = media.photo) != null) {
                            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(36.0f), true, null, true);
                            ImageLocation forObject = ImageLocation.getForObject(closestPhotoSizeWithSize, media.photo);
                            MessageObject messageObject2 = b2Var2.e;
                            imageReceiver.setImage(forObject, "36_36", messageObject2.strippedThumb, closestPhotoSizeWithSize == null ? 0L : closestPhotoSizeWithSize.size, (String) null, messageObject2, 0);
                            imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
                        } else if (media == null || (document = media.document) == null) {
                            h9Var.r(UserConfig.getInstance(i20).getCurrentUser());
                            imageReceiver.setForUserOrChat(UserConfig.getInstance(i20).getCurrentUser(), h9Var);
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
                            MessageObject messageObject3 = b2Var2.e;
                            imageReceiver.setImage(imageLocation, str2, messageObject3.strippedThumb, j13, (String) null, messageObject3, 0);
                            imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
                        }
                        w1Var.s = J;
                        w1Var.invalidate();
                        break;
                    }
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    qa1 qa1Var = (qa1) view;
                    int i22 = G.z;
                    ea1 ea1Var = (ea1) G.G;
                    f61 f61Var = new f61(0, this, G);
                    qa1Var.x = i22;
                    qa1Var.y = f61Var;
                    qa1Var.e(ea1Var, false);
                    break;
                case 24:
                    ((org.telegram.ui.he) view).set((org.telegram.ui.ge) G.G);
                    break;
                case 25:
                    org.telegram.ui.ie ieVar = (org.telegram.ui.ie) view;
                    TL_stats.BroadcastRevenueTransaction broadcastRevenueTransaction = (TL_stats.BroadcastRevenueTransaction) G.G;
                    y5 y5Var = ieVar.b;
                    org.telegram.ui.ActionBar.d6 d6Var = ieVar.a;
                    TextView textView4 = ieVar.c;
                    TextView textView5 = ieVar.d;
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
                            sb2.append(z10 ? org.telegram.messenger.f0.g(R.string.MonetizationTransactionNotCompleted, new StringBuilder(" — ")) : "");
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
                    textView5.setTextColor(org.telegram.ui.ActionBar.h6.v0(z10 ? org.telegram.ui.ActionBar.h6.p7 : org.telegram.ui.ActionBar.h6.y6, d6Var));
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                    spannableStringBuilder3.append((CharSequence) (c10 < 0 ? "-" : str3));
                    spannableStringBuilder3.append((CharSequence) "TON ");
                    spannableStringBuilder3.append((CharSequence) ieVar.e.format(Math.abs(j10) / 1.0E9d));
                    int indexOf = TextUtils.indexOf(spannableStringBuilder3, ".");
                    if (indexOf >= 0) {
                        z11 = false;
                        spannableStringBuilder3.setSpan(new RelativeSizeSpan(1.15f), 0, indexOf + 1, 33);
                    } else {
                        z11 = false;
                    }
                    y5Var.setText(org.telegram.ui.je.f0(spannableStringBuilder3, y5Var.getPaint(), 1.1f, AndroidUtilities.dp(0.33f), z11));
                    y5Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(c10 < 0 ? org.telegram.ui.ActionBar.h6.q7 : org.telegram.ui.ActionBar.h6.l8, d6Var));
                    ieVar.f = J;
                    ieVar.setWillNotDraw(!J);
                    break;
                case 27:
                    ci.ea eaVar = (ci.ea) view;
                    long j14 = eaVar.x;
                    Object obj6 = G.G;
                    if (!(obj6 instanceof TLRPC.User)) {
                        if (!(obj6 instanceof TLRPC.Chat)) {
                            j11 = 0;
                            boolean z17 = j14 != j11;
                            eaVar.d(false, true);
                            eaVar.set(G.G);
                            eaVar.f.setVisibility(8);
                            eaVar.h.setVisibility(0);
                            eaVar.c(G.e, z17);
                            eaVar.setDivider(J);
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
                    eaVar.d(false, true);
                    eaVar.set(G.G);
                    eaVar.f.setVisibility(8);
                    eaVar.h.setVisibility(0);
                    eaVar.c(G.e, z17);
                    eaVar.setDivider(J);
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
                    ((i61) view).setHeight(G.z);
                    break;
                case 29:
                    hg.v vVar = (hg.v) view;
                    Object obj7 = G.G;
                    if (obj7 instanceof hg.w) {
                        org.telegram.ui.ActionBar.h5 h5Var3 = vVar.a;
                        org.telegram.ui.ActionBar.h5 h5Var4 = vVar.c;
                        vh.n nVar = vVar.b;
                        vVar.e = J;
                        TL_account.TL_businessChatLink tL_businessChatLink = ((hg.w) obj7).a;
                        vVar.f = tL_businessChatLink;
                        if (TextUtils.isEmpty(tL_businessChatLink.title)) {
                            String str5 = vVar.f.link;
                            hg.a0[] a0VarArr = hg.a0.e;
                            if (str5.startsWith("https://")) {
                                str5 = str5.substring(8);
                            }
                            h5Var3.l(str5, false);
                        } else {
                            h5Var3.l(vVar.f.title, false);
                        }
                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(vVar.f.message);
                        TL_account.TL_businessChatLink tL_businessChatLink2 = vVar.f;
                        MediaDataController.addTextStyleRuns(tL_businessChatLink2.entities, tL_businessChatLink2.message, spannableStringBuilder4);
                        CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder4, nVar.getPaint().getFontMetricsInt(), false);
                        MessageObject.replaceAnimatedEmoji(replaceEmoji, vVar.f.entities, nVar.getPaint().getFontMetricsInt());
                        nVar.setText(replaceEmoji);
                        int i24 = vVar.f.views;
                        if (i24 == 0) {
                            h5Var4.l(LocaleController.formatString(R.string.NoClicks, new Object[0]), false);
                        } else {
                            h5Var4.l(LocaleController.formatPluralString("Clicks", i24, new Object[0]), false);
                        }
                        h5Var4.requestLayout();
                        vVar.invalidate();
                        break;
                    }
                    break;
                case MessageObject.TYPE_GIFT_STARS /* 30 */:
                    org.telegram.ui.Cells.h9 h9Var2 = (org.telegram.ui.Cells.h9) view;
                    CharSequence charSequence13 = G.l;
                    int i25 = G.k;
                    h9Var2.b.l(charSequence13, false);
                    h9Var2.a.setImageResource(i25);
                    h9Var2.setDivider(J);
                    h9Var2.setBackgroundColor(I(org.telegram.ui.ActionBar.h6.h5));
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
                    org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) view;
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
                            i6Var.B0 = z18;
                            i6Var.C0 = r10;
                            i6Var.setRectangularAvatar(G.r);
                            CharSequence charSequence14 = G.m;
                            i6Var.t(obj8, null, str6, charSequence14 == null ? charSequence14 : concat, false, false);
                            i6Var.s(G.e, false);
                            i6Var.M = J;
                        }
                        concat = "";
                        if (!(obj8 instanceof TLRPC.Chat)) {
                        }
                        String str62 = str;
                        boolean z182 = G.t;
                        Object obj92 = G.H;
                        if (obj92 instanceof Utilities.Callback) {
                        }
                        i6Var.B0 = z182;
                        i6Var.C0 = r10;
                        i6Var.setRectangularAvatar(G.r);
                        CharSequence charSequence142 = G.m;
                        i6Var.t(obj8, null, str62, charSequence142 == null ? charSequence142 : concat, false, false);
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
                                String str622 = str;
                                boolean z1822 = G.t;
                                Object obj922 = G.H;
                                Utilities.Callback callback = obj922 instanceof Utilities.Callback ? (Utilities.Callback) obj922 : null;
                                i6Var.B0 = z1822;
                                i6Var.C0 = callback;
                                i6Var.setRectangularAvatar(G.r);
                                CharSequence charSequence1422 = G.m;
                                i6Var.t(obj8, null, str622, charSequence1422 == null ? charSequence1422 : concat, false, false);
                                i6Var.s(G.e, false);
                                i6Var.M = J;
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
                        i6Var.B0 = z18222;
                        i6Var.C0 = callback;
                        i6Var.setRectangularAvatar(G.r);
                        CharSequence charSequence14222 = G.m;
                        i6Var.t(obj8, null, str6222, charSequence14222 == null ? charSequence14222 : concat, false, false);
                        i6Var.s(G.e, false);
                        i6Var.M = J;
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
                    ((u00) view).setViewType(G.z);
                    break;
                case 35:
                case 36:
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) view;
                    a2Var.setPad(G.i);
                    a2Var.e(G.l, "", G.e, J, a2Var.a == G.d);
                    a2Var.a = G.d;
                    a2Var.setIcon(G.t ? R.drawable.permission_locked : 0);
                    if (i13 == 36 || i13 == 41) {
                        boolean z19 = G.f;
                        CharSequence charSequence15 = G.o;
                        View.OnClickListener onClickListener = G.D;
                        org.telegram.ui.Cells.z1 z1Var = a2Var.v;
                        if (z1Var != null) {
                            p6 p6Var3 = z1Var.b;
                            p6Var3.a();
                            p6Var3.setText(charSequence15);
                            View view5 = z1Var.c;
                            view5.animate().cancel();
                            view5.animate().rotation(z19 ? 0.0f : 180.0f).setDuration(340L).setInterpolator(rr.h).start();
                            if (onClickListener != null) {
                                z1Var.setOnClickListener(onClickListener);
                                break;
                            }
                        }
                    }
                    break;
                case 37:
                    org.telegram.ui.Cells.a2 a2Var2 = (org.telegram.ui.Cells.a2) view;
                    a2Var2.setPad(G.i);
                    a2Var2.setUserOrChat((TLObject) G.G);
                    a2Var2.c(G.e, a2Var2.a == G.d);
                    a2Var2.a = G.d;
                    a2Var2.setNeedDivider(J);
                    break;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
                    v8Var.d(G.l.toString(), G.e, J, v8Var.a == G.d);
                    v8Var.getCheckBox().setDrawIconType(G.z);
                    Switch checkBox = v8Var.getCheckBox();
                    int i26 = G.z == 0 ? org.telegram.ui.ActionBar.h6.M6 : org.telegram.ui.ActionBar.h6.r7;
                    int i27 = org.telegram.ui.ActionBar.h6.N6;
                    int i28 = org.telegram.ui.ActionBar.h6.d6;
                    checkBox.d(i26, i27, i28, i28);
                    v8Var.a = G.d;
                    v8Var.setIcon(G.t ? R.drawable.permission_locked : 0);
                    if (i13 == 40) {
                        if (!TextUtils.isEmpty(G.o)) {
                            v8Var.a(new wn0(21, G, v8Var), G.o.toString(), G.f);
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
                    org.telegram.ui.Cells.m4 m4Var2 = (org.telegram.ui.Cells.m4) view;
                    m4Var2.c(G.o, m4Var2.a == G.d);
                    m4Var2.a = G.d;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    org.telegram.ui.Cells.ea eaVar2 = (org.telegram.ui.Cells.ea) view;
                    eaVar2.getValueBackupImageView().setImageDrawable(null);
                    CharSequence charSequence16 = G.l;
                    if (charSequence16 != null) {
                        CharSequence charSequence17 = G.m;
                        if (charSequence17 != null) {
                            eaVar2.c(charSequence16, charSequence17, false, J);
                        } else {
                            eaVar2.b(charSequence16, J);
                        }
                    }
                    eaVar2.setIcon(G.k);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    ((org.telegram.ui.Cells.j6) view).b(G.l.toString(), G.n.toString(), J, G.e);
                    break;
            }
        } else {
            u51 F = v51.F(i13);
            if (F != null) {
                F.bindView(c1Var.a, G, J, this, wl0Var instanceof r61 ? (r61) wl0Var : null);
            }
        }
        org.telegram.ui.t3 t3Var = G.F;
        if (t3Var != null) {
            t3Var.run(view);
        }
    }

    @Override // s4.h0
    public s4.c1 x(ViewGroup viewGroup, int i10) {
        View w5Var;
        View m4Var;
        View view;
        View view2;
        org.telegram.ui.Cells.m4 m4Var2;
        boolean z10 = this.n;
        int i11 = z10 ? org.telegram.ui.ActionBar.h6.h5 : org.telegram.ui.ActionBar.h6.d6;
        Context context = this.e;
        if (i10 < 10000) {
            org.telegram.ui.ActionBar.d6 d6Var = this.v;
            switch (i10) {
                case -4:
                case -1:
                    w5Var = new ai.w5(context, 21);
                    if (i10 == -4) {
                        w5Var.setTag(-33024);
                    }
                    view2 = w5Var;
                    break;
                case -3:
                    g61 g61Var = new g61(context);
                    g61Var.a = 0;
                    view2 = g61Var;
                    break;
                case -2:
                    view2 = new ai.w5(context, 22);
                    break;
                case 0:
                    if (!z10) {
                        view2 = new org.telegram.ui.Cells.m4(context, d6Var);
                        break;
                    } else {
                        view = new org.telegram.ui.Cells.m4(this.e, org.telegram.ui.ActionBar.h6.L6, 21, 15, 0, false, false, this.v);
                        view2 = view;
                        break;
                    }
                case 1:
                    m4Var = new org.telegram.ui.Cells.m4(this.e, org.telegram.ui.ActionBar.h6.G6, 17, 15, false, this.v);
                    view2 = m4Var;
                    break;
                case 2:
                    view2 = new m21(context, d6Var);
                    break;
                case 3:
                    view2 = new org.telegram.ui.Cells.r8(context, d6Var);
                    break;
                case 4:
                case 9:
                    org.telegram.ui.Cells.w8 w8Var = new org.telegram.ui.Cells.w8(context, d6Var);
                    view = w8Var;
                    if (i10 == 9) {
                        w8Var.setDrawCheckRipple(true);
                        w8Var.d(org.telegram.ui.ActionBar.h6.g6, org.telegram.ui.ActionBar.h6.O6, org.telegram.ui.ActionBar.h6.P6, org.telegram.ui.ActionBar.h6.Q6, org.telegram.ui.ActionBar.h6.R6);
                        w8Var.setTypeface(AndroidUtilities.bold());
                        w8Var.setHeight(56);
                        view = w8Var;
                    }
                    view2 = view;
                    break;
                case 5:
                case 6:
                    m4Var = new org.telegram.ui.Cells.j5(21, 60, this.e, this.v, i10 == 6);
                    view2 = m4Var;
                    break;
                case 7:
                case 8:
                default:
                    view2 = new org.telegram.ui.Cells.e9(context, d6Var);
                    break;
                case 10:
                    org.telegram.ui.Cells.u2 u2Var = new org.telegram.ui.Cells.u2(context);
                    TextView textView = new TextView(context);
                    u2Var.b = textView;
                    org.telegram.messenger.ok.t(textView, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.G6, false), 1, 16.0f, 1);
                    textView.setMaxLines(1);
                    textView.setSingleLine(true);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView.setEllipsize(truncateAt);
                    textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                    boolean z11 = LocaleController.isRTL;
                    u2Var.addView(textView, w7.y5.d(-1, -1.0f, (z11 ? 5 : 3) | 48, z11 ? 61.0f : 23.0f, 0.0f, z11 ? 23.0f : 61.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    u2Var.c = textView2;
                    org.telegram.messenger.ok.t(textView2, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.I6, false), 1, 16.0f, 1);
                    textView2.setMaxLines(1);
                    textView2.setSingleLine(true);
                    textView2.setEllipsize(truncateAt);
                    textView2.setGravity((LocaleController.isRTL ? 3 : 5) | 16);
                    textView2.setVisibility(8);
                    u2Var.addView(textView2, w7.y5.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 23.0f, 0.0f, 23.0f, 0.0f));
                    RadioButton radioButton = new RadioButton(context);
                    u2Var.d = radioButton;
                    radioButton.setSize(AndroidUtilities.dp(20.0f));
                    radioButton.b(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.g7, false), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.h7, false));
                    u2Var.addView(radioButton, w7.y5.d(22, 22.0f, (LocaleController.isRTL ? 3 : 5) | 48, 20.0f, 15.0f, 20.0f, 0.0f));
                    u2Var.b();
                    view2 = u2Var;
                    break;
                case 11:
                case 12:
                    org.telegram.ui.Cells.za zaVar = new org.telegram.ui.Cells.za(context, 6, i10 != 12 ? 0 : 3, false);
                    zaVar.setSelfAsSavedMessages(true);
                    view2 = zaVar;
                    break;
                case 13:
                    m4Var = new org.telegram.ui.Cells.za(6, 0, this.e, null, false, true);
                    view2 = m4Var;
                    break;
                case 14:
                    view2 = new ew0(context, d6Var);
                    break;
                case 15:
                    view2 = new org.telegram.ui.Cells.z7(context, d6Var);
                    break;
                case 16:
                    view2 = new hg.y1(context, d6Var, this.L != null);
                    break;
                case 17:
                    view2 = new hg.w1(context, d6Var);
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
                    view2 = new qa1(this.e, this.f, i10 - 18, this.y, this.h);
                    break;
                case 24:
                    view2 = new org.telegram.ui.he(context, d6Var);
                    break;
                case 25:
                    view2 = new org.telegram.ui.ie(context, d6Var);
                    break;
                case 26:
                    m4Var2 = new org.telegram.ui.Cells.m4(this.e, org.telegram.ui.ActionBar.h6.G6, 23, 20, 0, false, false, this.v);
                    m4Var2.setTextSize(20.0f);
                    view2 = m4Var2;
                    break;
                case 27:
                    ci.ea eaVar = new ci.ea(context, d6Var);
                    eaVar.d(false, false);
                    view2 = eaVar;
                    break;
                case 28:
                    w5Var = new i61(context);
                    w5Var.setTag(-33024);
                    view2 = w5Var;
                    break;
                case 29:
                    view2 = new hg.v(context, d6Var);
                    break;
                case MessageObject.TYPE_GIFT_STARS /* 30 */:
                    view2 = new org.telegram.ui.Cells.h9(context, d6Var);
                    break;
                case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                    wl0 wl0Var = this.d;
                    if (wl0Var != null && wl0Var.b1()) {
                        org.telegram.ui.Cells.v3 v3Var = new org.telegram.ui.Cells.v3(context, 28, d6Var);
                        v3Var.setNoBackground(true);
                        view2 = v3Var;
                        break;
                    } else {
                        view2 = new org.telegram.ui.Cells.v3(context, d6Var);
                        break;
                    }
                    break;
                case 32:
                    view2 = new org.telegram.ui.Cells.i6(context, null);
                    break;
                case 33:
                    view2 = new org.telegram.ui.Cells.s2(context, true);
                    break;
                case 34:
                    u00 u00Var = new u00(context, d6Var);
                    u00Var.setIsSingleCell(true);
                    view2 = u00Var;
                    break;
                case 35:
                case 36:
                case 37:
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(i10 == 35 ? 4 : i10 == 36 ? 6 : i10 == 37 ? 7 : i10 == 41 ? 8 : 0, 21, this.e, this.v, true);
                    a2Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.h6.V6, org.telegram.ui.ActionBar.h6.g7, org.telegram.ui.ActionBar.h6.k7);
                    view2 = a2Var;
                    break;
                case 38:
                    view2 = new org.telegram.ui.Cells.b2(context, d6Var);
                    break;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    view2 = new org.telegram.ui.Cells.v8(context);
                    break;
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    m4Var2 = new org.telegram.ui.Cells.m4(this.e, org.telegram.ui.ActionBar.h6.L6, 21, 15, 0, false, true, this.v);
                    view2 = m4Var2;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    view2 = new org.telegram.ui.Cells.ea(context, 0, d6Var);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    view2 = new org.telegram.ui.Cells.j6(context, false);
                    break;
            }
        } else {
            u51 F = v51.F(i10);
            view2 = F != null ? F.createView(this.e, this.d, this.f, this.h, this.v) : new View(context);
        }
        if (this.r) {
            if (i10 < 10000) {
                switch (i10) {
                }
            }
            view2.setBackgroundColor(I(i11));
        }
        return new gl0(view2);
    }

    @Override // s4.h0
    public void y(s4.c1 c1Var) {
        Q(c1Var, this.M);
        O(c1Var);
    }
}
