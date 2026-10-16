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
import org.telegram.ui.fb1;
import org.telegram.ui.ta1;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public class a71 extends pg.b {
    public y61 H;
    public y61 I;
    public int J;
    public boolean K;
    public Utilities.Callback2 L;
    public boolean M;
    public final mm0 d;
    public final Context e;
    public final int f;
    public final int h;
    public final boolean n;
    public Utilities.Callback2 s;
    public final org.telegram.ui.ActionBar.c6 v;
    public jg.f y;
    public boolean r = true;
    public final ArrayList w = new ArrayList();
    public final ArrayList x = new ArrayList();
    public int E = 0;
    public final ArrayList F = new ArrayList();
    public final ArrayList G = new ArrayList();

    public a71(mm0 mm0Var, Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, org.telegram.ui.ActionBar.c6 c6Var) {
        this.d = mm0Var;
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
            ArrayList arrayList = this.G;
            if (i10 >= arrayList.size()) {
                return;
            }
            y61 y61Var = (y61) arrayList.get(i10);
            this.L.run(Integer.valueOf(i10), new ArrayList(this.x.subList(y61Var.a, y61Var.b + 1)));
            this.K = false;
        }
    }

    public final m61 G(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = this.x;
        if (i10 >= arrayList.size()) {
            return null;
        }
        return (m61) arrayList.get(i10);
    }

    public final int H(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.G;
            if (i11 >= arrayList.size()) {
                return -1;
            }
            y61 y61Var = (y61) arrayList.get(i11);
            if (i10 >= y61Var.a && i10 <= y61Var.b) {
                return i11;
            }
            i11++;
        }
    }

    public int I(int i10) {
        return org.telegram.ui.ActionBar.g6.w0(i10, this.v);
    }

    public final boolean J(int i10) {
        m61 G = G(i10);
        m61 G2 = G(i10 + 1);
        return (G == null || G.j || G2 == null || K(G2.a) != K(G.a)) ? false : true;
    }

    public final void L() {
        y61 y61Var = this.I;
        if (y61Var != null) {
            y61Var.b = Math.max(0, this.x.size() - 1);
        }
    }

    public final int M() {
        y61 y61Var = new y61();
        this.I = y61Var;
        y61Var.a = this.x.size();
        y61 y61Var2 = this.I;
        y61Var2.b = -1;
        this.G.add(y61Var2);
        return r1.size() - 1;
    }

    public void N(boolean z10) {
        mm0 mm0Var = this.d;
        if (mm0Var == null || !mm0Var.b0()) {
            P(z10);
        } else {
            mm0Var.post(new zr0(6, this, z10));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void O(s4.b1 b1Var) {
        View view = b1Var.a;
        if (view instanceof org.telegram.ui.ActionBar.x5) {
            ((org.telegram.ui.ActionBar.x5) view).d();
            int i10 = b1Var.f;
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
        mm0 mm0Var = this.d;
        if (mm0Var == null || !mm0Var.b0()) {
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
            ((ig.x1) view).setReorder(z10);
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
        ArrayList arrayList = mm0Var.I2;
        if (arrayList == null) {
            mm0Var.I2 = new ArrayList();
        } else {
            arrayList.clear();
        }
        ArrayList arrayList2 = this.F;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            y61 y61Var = (y61) obj;
            mm0Var.I2.add(Long.valueOf(AndroidUtilities.pack(y61Var.a, y61Var.b)));
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
        y61 y61Var = this.H;
        if (y61Var != null) {
            y61Var.b = Math.max(0, (this.x.size() + this.E) - 1);
            y61 y61Var2 = this.H;
            if (y61Var2.a == y61Var2.b) {
                this.F.remove(y61Var2);
            }
            this.H = null;
        }
    }

    public final void U() {
        y61 y61Var = new y61();
        this.H = y61Var;
        y61Var.a = this.x.size() + this.E;
        y61 y61Var2 = this.H;
        y61Var2.b = -1;
        this.F.add(y61Var2);
    }

    @Override // s4.g0
    public final int h() {
        return this.x.size();
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
    /* JADX WARN: Removed duplicated region for block: B:107:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x022a  */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v16 */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void v(s4.b1 b1Var, int i10) {
        String str;
        org.telegram.ui.Cells.e9 e9Var;
        ?? r10;
        int i11;
        TLRPC.Document document;
        long j10;
        String str2;
        ImageLocation imageLocation;
        TLRPC.Photo photo;
        String str3;
        long j11;
        char c10;
        boolean z10;
        boolean z11;
        long j12;
        long j13;
        CharSequence concat;
        int i12;
        int i13 = this.f;
        mm0 mm0Var = this.d;
        m61 G = G(i10);
        m61 G2 = G(i10 + 1);
        m61 G3 = G(i10 - 1);
        if (G == null) {
            return;
        }
        int i14 = b1Var.f;
        View view = b1Var.a;
        boolean J = J(i10);
        O(b1Var);
        if (i14 < 10000) {
            str = "";
            boolean z12 = true;
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
                            frameLayout.addView(G.c, (i14 == -1 || i14 == -4) ? w7.z5.d(G.z, -1) : w7.z5.d(-2.0f, -2));
                            break;
                        }
                    }
                    break;
                case -3:
                    x61 x61Var = (x61) view;
                    x61Var.a = G.z;
                    x61Var.b = w7.l6.a(G.y, 1);
                    if (x61Var.getChildCount() != (G.c == null ? 0 : 1) || x61Var.getChildAt(0) != G.c) {
                        x61Var.removeAllViews();
                        View view3 = G.c;
                        if (view3 != null) {
                            AndroidUtilities.removeFromParent(view3);
                            x61Var.addView(G.c, w7.z5.d(-1.0f, -1));
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
                    b31 b31Var = (b31) view;
                    int i15 = G.k;
                    if (i15 == 0) {
                        int i16 = G.z;
                        if (i16 != 0) {
                            b31Var.setEmojiSize(i16);
                        }
                        String charSequence = G.m.toString();
                        String charSequence2 = G.n.toString();
                        b31Var.getClass();
                        MediaDataController.getInstance(UserConfig.selectedAccount).setPlaceholderImage(b31Var.b, charSequence, charSequence2, "90_90");
                    } else if (G.q) {
                        b31Var.setEmojiStatic(i15);
                    } else {
                        b31Var.setEmoji(i15);
                    }
                    if (!TextUtils.isEmpty(G.o)) {
                        b31Var.a(G.l, G.o);
                        break;
                    } else {
                        b31Var.setText(G.l);
                        break;
                    }
                case 3:
                    org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                    Object obj = G.G;
                    if (obj instanceof TLRPC.Document) {
                        CharSequence charSequence3 = G.l;
                        TLRPC.Document document2 = (TLRPC.Document) obj;
                        r8Var.w = 16;
                        r8Var.s = 58;
                        org.telegram.ui.ActionBar.h5 h5Var = r8Var.a;
                        h5Var.l(charSequence3, false);
                        h5Var.i(null);
                        s6 s6Var = r8Var.c;
                        r8Var.M = null;
                        s6Var.c(null, false, true);
                        r8Var.h.setVisibility(8);
                        s6Var.setVisibility(8);
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
                        String str4 = (String) obj;
                        r8Var.w = 16;
                        r8Var.s = 58;
                        org.telegram.ui.ActionBar.h5 h5Var2 = r8Var.a;
                        h5Var2.l(charSequence4, false);
                        h5Var2.i(null);
                        s6 s6Var2 = r8Var.c;
                        r8Var.M = null;
                        s6Var2.c(null, false, true);
                        r8Var.h.setVisibility(8);
                        s6Var2.setVisibility(8);
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
                        r8Var.setValueSticker(str4);
                    } else if (TextUtils.isEmpty(G.n)) {
                        Object obj2 = G.G;
                        if (obj2 instanceof Drawable) {
                            r8Var.n(G.l, (Drawable) obj2, J);
                        } else {
                            int i17 = G.k;
                            if (i17 == 0) {
                                r8Var.i(G.l, J);
                            } else {
                                r8Var.m(i17, G.l, J);
                            }
                        }
                    } else {
                        Object obj3 = G.G;
                        if (obj3 instanceof Drawable) {
                            r8Var.r(G.l, G.n, (Drawable) obj3, J);
                        } else {
                            int i18 = G.k;
                            if (i18 == 0) {
                                r8Var.o(G.l, G.n, false, J);
                            } else {
                                r8Var.s(G.l, G.n, false, i18, J);
                            }
                        }
                    }
                    if (G.q) {
                        int i19 = org.telegram.ui.ActionBar.g6.q6;
                        r8Var.e(i19, i19);
                    } else if (G.r) {
                        r8Var.e(org.telegram.ui.ActionBar.g6.q7, org.telegram.ui.ActionBar.g6.p7);
                    } else {
                        r8Var.e(org.telegram.ui.ActionBar.g6.m6, org.telegram.ui.ActionBar.g6.G6);
                    }
                    r8Var.f(45, G.t, true);
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
                    if (i14 == 9) {
                        view.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, G.e ? org.telegram.ui.ActionBar.g6.f6 : org.telegram.ui.ActionBar.g6.e6, false));
                        break;
                    }
                    break;
                case 5:
                    org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) view;
                    CharSequence charSequence5 = G.m;
                    j5Var.b(G.l, G.m, 0, G.e, 0, charSequence5 != null && charSequence5.toString().contains("\n"), J, false);
                    break;
                case 6:
                    ((org.telegram.ui.Cells.j5) view).b(G.l, G.m, 0, G.e, 0, false, J, false);
                    break;
                case 7:
                case 8:
                case 38:
                    if (i14 == 7 || i14 == 8) {
                        org.telegram.ui.Cells.e9 e9Var2 = (org.telegram.ui.Cells.e9) view;
                        if (TextUtils.isEmpty(G.l)) {
                            e9Var2.setFixedSize(i14 == 8 ? 220 : 12);
                            e9Var2.setText("");
                        } else {
                            e9Var2.setFixedSize(0);
                            e9Var2.setText(G.l);
                        }
                        if (G.q) {
                            e9Var2.setTextGravity(17);
                            e9Var2.getTextView().setWidth(Math.min(di.d4.a(e9Var2.getText(), e9Var2.getTextView().getPaint()), AndroidUtilities.displaySize.x - AndroidUtilities.dp(60.0f)));
                            e9Var2.getTextView().setPadding(0, AndroidUtilities.dp(17.0f), 0, AndroidUtilities.dp(17.0f));
                            e9Var = e9Var2;
                        } else {
                            e9Var2.setTextGravity(8388611);
                            e9Var2.getTextView().setMinWidth(0);
                            e9Var2.getTextView().setMaxWidth(AndroidUtilities.displaySize.x);
                            e9Var2.getTextView().setPadding(0, AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(17.0f));
                            e9Var = e9Var2;
                        }
                    } else if (i14 == 38) {
                        org.telegram.ui.Cells.b2 b2Var = (org.telegram.ui.Cells.b2) view;
                        CharSequence charSequence6 = G.o;
                        boolean z13 = G.f;
                        b2Var.a.setText(charSequence6);
                        View view4 = b2Var.b;
                        view4.animate().cancel();
                        view4.animate().rotation(z13 ? 0.0f : 180.0f).setDuration(340L).setInterpolator(es.h).start();
                        if (G.q) {
                            b2Var.setColor(org.telegram.ui.ActionBar.g6.q6);
                            e9Var = b2Var;
                        } else if (G.r) {
                            b2Var.setColor(org.telegram.ui.ActionBar.g6.p7);
                            e9Var = b2Var;
                        } else {
                            b2Var.setColor(org.telegram.ui.ActionBar.g6.G6);
                            e9Var = b2Var;
                        }
                    } else {
                        e9Var = null;
                    }
                    boolean z14 = (G3 == null || K(G3.a)) ? false : true;
                    boolean z15 = (G2 == null || K(G2.a)) ? false : true;
                    if (!mm0Var.b1()) {
                        Drawable V0 = org.telegram.ui.ActionBar.g6.V0(this.e, (z14 && z15) ? R.drawable.greydivider : z14 ? R.drawable.greydivider_bottom : z15 ? R.drawable.greydivider_top : R.drawable.field_carret_empty, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.b7, this.v));
                        if (!this.n) {
                            e9Var.setBackground(V0);
                            break;
                        } else {
                            e9Var.setBackground(new LayerDrawable(new Drawable[]{new ColorDrawable(I(org.telegram.ui.ActionBar.g6.i5)), V0}));
                            break;
                        }
                    } else {
                        e9Var.setBackground(null);
                        break;
                    }
                    break;
                case 10:
                    org.telegram.ui.Cells.u2 u2Var = (org.telegram.ui.Cells.u2) view;
                    int i20 = u2Var.a;
                    TextView textView = u2Var.b;
                    TextView textView2 = u2Var.c;
                    RadioButton radioButton = u2Var.d;
                    if (i20 == G.d) {
                        radioButton.a(G.e, true);
                        u2Var.a(G.g, true);
                        r10 = 0;
                    } else {
                        r10 = 0;
                        u2Var.a(G.g, false);
                    }
                    if (TextUtils.isEmpty(G.n)) {
                        CharSequence charSequence7 = G.l;
                        boolean z16 = G.e;
                        textView2.setVisibility(8);
                        textView.setText(charSequence7);
                        radioButton.a(z16, r10);
                        u2Var.e = J;
                        u2Var.b();
                        u2Var.setWillNotDraw(!J);
                    } else {
                        CharSequence charSequence8 = G.l;
                        CharSequence charSequence9 = G.n;
                        boolean z17 = G.e;
                        textView2.setVisibility(r10);
                        textView2.setText(charSequence9);
                        textView.setText(charSequence8);
                        radioButton.a(z17, r10);
                        u2Var.e = J;
                        u2Var.b();
                        u2Var.setWillNotDraw(!J);
                    }
                    u2Var.a = G.d;
                    break;
                case 11:
                case 12:
                    org.telegram.ui.Cells.xa xaVar = (org.telegram.ui.Cells.xa) view;
                    xaVar.h(i13, G, J);
                    if (i14 == 12) {
                        xaVar.c(G.e, false);
                        break;
                    }
                    break;
                case 13:
                    org.telegram.ui.Cells.xa xaVar2 = (org.telegram.ui.Cells.xa) view;
                    xaVar2.h(i13, G, J);
                    CharSequence charSequence10 = G.n;
                    xaVar2.setQuery(charSequence10 == null ? null : charSequence10.toString().toLowerCase());
                    xaVar2.setAddButtonVisible(!G.e);
                    xaVar2.setCloseIcon(G.D);
                    break;
                case 14:
                    sw0 sw0Var = (sw0) view;
                    sw0Var.b(G.z, null, G.p);
                    sw0Var.setMinAllowedIndex((int) G.B);
                    sw0Var.setCallback(new xv(G, 27));
                    break;
                case 15:
                    org.telegram.ui.Cells.z7 z7Var = (org.telegram.ui.Cells.z7) view;
                    z7Var.d(G.z, (org.telegram.ui.Cells.y7) G.G, G.C);
                    z7Var.setMinValueAllowed((int) G.B);
                    break;
                case 16:
                    ig.x1 x1Var = (ig.x1) view;
                    x1Var.d.a(G.e, false);
                    x1Var.setReorder(this.M);
                    Object obj4 = G.G;
                    if (obj4 instanceof ig.a2) {
                        x1Var.a((ig.a2) obj4, null, J);
                        break;
                    }
                    break;
                case 17:
                    ig.v1 v1Var = (ig.v1) view;
                    v1Var.e.a(G.e, false);
                    Object obj5 = G.G;
                    if (obj5 instanceof ig.a2) {
                        ig.a2 a2Var = (ig.a2) obj5;
                        k9 k9Var = v1Var.a;
                        int[] iArr = v1Var.r;
                        TextView textView3 = v1Var.d;
                        ImageReceiver imageReceiver = v1Var.b;
                        int i21 = UserConfig.selectedAccount;
                        v1Var.c.setText(MessagesController.getInstance(i21).getPeerName(UserConfig.getInstance(i21).getClientUserId()));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        MessageObject messageObject = a2Var.e;
                        if (messageObject != null) {
                            spannableStringBuilder.append(Emoji.replaceEmoji(messageObject.messageText, textView3.getPaint().getFontMetricsInt(), false));
                        }
                        if (a2Var.a() > 1) {
                            spannableStringBuilder.append((CharSequence) "  ");
                            int dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(80.0f);
                            int a2 = a2Var.a() - 1;
                            int i22 = ig.w1.d;
                            SpannableString spannableString = new SpannableString("+");
                            ig.w1 w1Var = new ig.w1(a2);
                            iArr[0] = (int) (((i11) w1Var.c).c + AndroidUtilities.dp(10.0f));
                            i11 = i21;
                            spannableString.setSpan(w1Var, 0, spannableString.length(), 33);
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
                        TLRPC.MessageMedia media = MessageObject.getMedia(a2Var.e);
                        if (media != null && (photo = media.photo) != null) {
                            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(36.0f), true, null, true);
                            ImageLocation forObject = ImageLocation.getForObject(closestPhotoSizeWithSize, media.photo);
                            MessageObject messageObject2 = a2Var.e;
                            imageReceiver.setImage(forObject, "36_36", messageObject2.strippedThumb, closestPhotoSizeWithSize == null ? 0L : closestPhotoSizeWithSize.size, (String) null, messageObject2, 0);
                            imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
                        } else if (media == null || (document = media.document) == null) {
                            k9Var.r(UserConfig.getInstance(i11).getCurrentUser());
                            imageReceiver.setForUserOrChat(UserConfig.getInstance(i11).getCurrentUser(), k9Var);
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
                            MessageObject messageObject3 = a2Var.e;
                            imageReceiver.setImage(imageLocation, str2, messageObject3.strippedThumb, j14, (String) null, messageObject3, 0);
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
                    fb1 fb1Var = (fb1) view;
                    int i23 = G.z;
                    ta1 ta1Var = (ta1) G.G;
                    org.telegram.ui.bi biVar = new org.telegram.ui.bi(z12 ? 1 : 0, this, G);
                    fb1Var.x = i23;
                    fb1Var.y = biVar;
                    fb1Var.e(ta1Var, false);
                    break;
                case 24:
                    ((org.telegram.ui.oe) view).set((org.telegram.ui.ne) G.G);
                    break;
                case 25:
                    org.telegram.ui.pe peVar = (org.telegram.ui.pe) view;
                    TL_stats.BroadcastRevenueTransaction broadcastRevenueTransaction = (TL_stats.BroadcastRevenueTransaction) G.G;
                    a6 a6Var = peVar.b;
                    org.telegram.ui.ActionBar.c6 c6Var = peVar.a;
                    TextView textView4 = peVar.c;
                    TextView textView5 = peVar.d;
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
                            sb2.append(z10 ? org.telegram.messenger.g0.g(R.string.MonetizationTransactionNotCompleted, new StringBuilder(" — ")) : "");
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
                        c10 = 1;
                        z10 = false;
                    }
                    textView5.setTextColor(org.telegram.ui.ActionBar.g6.w0(z10 ? org.telegram.ui.ActionBar.g6.p7 : org.telegram.ui.ActionBar.g6.y6, c6Var));
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                    spannableStringBuilder3.append((CharSequence) (c10 < 0 ? "-" : str3));
                    spannableStringBuilder3.append((CharSequence) "TON ");
                    spannableStringBuilder3.append((CharSequence) peVar.e.format(Math.abs(j11) / 1.0E9d));
                    int indexOf = TextUtils.indexOf(spannableStringBuilder3, ".");
                    if (indexOf >= 0) {
                        z11 = false;
                        spannableStringBuilder3.setSpan(new RelativeSizeSpan(1.15f), 0, indexOf + 1, 33);
                    } else {
                        z11 = false;
                    }
                    a6Var.setText(org.telegram.ui.qe.f0(spannableStringBuilder3, a6Var.getPaint(), 1.1f, AndroidUtilities.dp(0.33f), z11));
                    a6Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(c10 < 0 ? org.telegram.ui.ActionBar.g6.q7 : org.telegram.ui.ActionBar.g6.l8, c6Var));
                    peVar.f = J;
                    peVar.setWillNotDraw(!J);
                    break;
                case 27:
                    di.da daVar = (di.da) view;
                    long j15 = daVar.x;
                    Object obj6 = G.G;
                    if (!(obj6 instanceof TLRPC.User)) {
                        if (!(obj6 instanceof TLRPC.Chat)) {
                            j12 = 0;
                            boolean z18 = j15 != j12;
                            daVar.d(false, true);
                            daVar.set(G.G);
                            daVar.f.setVisibility(8);
                            daVar.h.setVisibility(0);
                            daVar.c(G.e, z18);
                            daVar.setDivider(J);
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
                    daVar.d(false, true);
                    daVar.set(G.G);
                    daVar.f.setVisibility(8);
                    daVar.h.setVisibility(0);
                    daVar.c(G.e, z18);
                    daVar.setDivider(J);
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
                    ((z61) view).setHeight(G.z);
                    break;
                case 29:
                    ig.t tVar = (ig.t) view;
                    Object obj7 = G.G;
                    if (obj7 instanceof ig.u) {
                        org.telegram.ui.ActionBar.h5 h5Var3 = tVar.a;
                        org.telegram.ui.ActionBar.h5 h5Var4 = tVar.c;
                        wh.n nVar = tVar.b;
                        tVar.e = J;
                        TL_account.TL_businessChatLink tL_businessChatLink = ((ig.u) obj7).a;
                        tVar.f = tL_businessChatLink;
                        if (TextUtils.isEmpty(tL_businessChatLink.title)) {
                            String str5 = tVar.f.link;
                            ig.y[] yVarArr = ig.y.e;
                            if (str5.startsWith("https://")) {
                                str5 = str5.substring(8);
                            }
                            h5Var3.l(str5, false);
                        } else {
                            h5Var3.l(tVar.f.title, false);
                        }
                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(tVar.f.message);
                        TL_account.TL_businessChatLink tL_businessChatLink2 = tVar.f;
                        MediaDataController.addTextStyleRuns(tL_businessChatLink2.entities, tL_businessChatLink2.message, spannableStringBuilder4);
                        CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder4, nVar.getPaint().getFontMetricsInt(), false);
                        MessageObject.replaceAnimatedEmoji(replaceEmoji, tVar.f.entities, nVar.getPaint().getFontMetricsInt());
                        nVar.setText(replaceEmoji);
                        int i25 = tVar.f.views;
                        if (i25 == 0) {
                            h5Var4.l(LocaleController.formatString(R.string.NoClicks, new Object[0]), false);
                        } else {
                            h5Var4.l(LocaleController.formatPluralString("Clicks", i25, new Object[0]), false);
                        }
                        h5Var4.requestLayout();
                        tVar.invalidate();
                        break;
                    }
                    break;
                case MessageObject.TYPE_GIFT_STARS /* 30 */:
                    org.telegram.ui.Cells.h9 h9Var = (org.telegram.ui.Cells.h9) view;
                    CharSequence charSequence11 = G.l;
                    int i26 = G.k;
                    h9Var.b.l(charSequence11, false);
                    h9Var.a.setImageResource(i26);
                    h9Var.setDivider(J);
                    h9Var.setBackgroundColor(I(org.telegram.ui.ActionBar.g6.h5));
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
                    if (G.q && (obj8 instanceof TLRPC.User) && (i12 = ((TLRPC.User) obj8).bot_active_users) != 0) {
                        if (i12 != 0) {
                            concat = LocaleController.formatPluralStringSpaced("BotUsers", i12);
                            if (!(obj8 instanceof TLRPC.Chat)) {
                            }
                            String str6 = str;
                            boolean z19 = G.t;
                            Object obj9 = G.H;
                            if (obj9 instanceof Utilities.Callback) {
                            }
                            i6Var.B0 = z19;
                            i6Var.C0 = r10;
                            i6Var.setRectangularAvatar(G.r);
                            CharSequence charSequence12 = G.m;
                            i6Var.u(obj8, null, str6, charSequence12 == null ? charSequence12 : concat, false, false);
                            i6Var.t(G.e, false);
                            i6Var.M = J;
                        }
                        concat = "";
                        if (!(obj8 instanceof TLRPC.Chat)) {
                        }
                        String str62 = str;
                        boolean z192 = G.t;
                        Object obj92 = G.H;
                        if (obj92 instanceof Utilities.Callback) {
                        }
                        i6Var.B0 = z192;
                        i6Var.C0 = r10;
                        i6Var.setRectangularAvatar(G.r);
                        CharSequence charSequence122 = G.m;
                        i6Var.u(obj8, null, str62, charSequence122 == null ? charSequence122 : concat, false, false);
                        i6Var.t(G.e, false);
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
                                boolean z1922 = G.t;
                                Object obj922 = G.H;
                                Utilities.Callback callback = obj922 instanceof Utilities.Callback ? (Utilities.Callback) obj922 : null;
                                i6Var.B0 = z1922;
                                i6Var.C0 = callback;
                                i6Var.setRectangularAvatar(G.r);
                                CharSequence charSequence1222 = G.m;
                                i6Var.u(obj8, null, str622, charSequence1222 == null ? charSequence1222 : concat, false, false);
                                i6Var.t(G.e, false);
                                i6Var.M = J;
                                break;
                            }
                        }
                        concat = "";
                        if (!(obj8 instanceof TLRPC.Chat)) {
                        }
                        String str6222 = str;
                        boolean z19222 = G.t;
                        Object obj9222 = G.H;
                        if (obj9222 instanceof Utilities.Callback) {
                        }
                        i6Var.B0 = z19222;
                        i6Var.C0 = callback;
                        i6Var.setRectangularAvatar(G.r);
                        CharSequence charSequence12222 = G.m;
                        i6Var.u(obj8, null, str6222, charSequence12222 == null ? charSequence12222 : concat, false, false);
                        i6Var.t(G.e, false);
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
                    ((f10) view).setViewType(G.z);
                    break;
                case 35:
                case 36:
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    org.telegram.ui.Cells.a2 a2Var2 = (org.telegram.ui.Cells.a2) view;
                    a2Var2.setPad(G.i);
                    a2Var2.e(G.l, "", G.e, J, a2Var2.a == G.d);
                    a2Var2.a = G.d;
                    a2Var2.setIcon(G.t ? R.drawable.permission_locked : 0);
                    if (i14 == 36 || i14 == 41) {
                        boolean z20 = G.f;
                        CharSequence charSequence13 = G.o;
                        View.OnClickListener onClickListener = G.D;
                        org.telegram.ui.Cells.z1 z1Var = a2Var2.v;
                        if (z1Var != null) {
                            s6 s6Var3 = z1Var.b;
                            s6Var3.a();
                            s6Var3.setText(charSequence13);
                            View view5 = z1Var.c;
                            view5.animate().cancel();
                            view5.animate().rotation(z20 ? 0.0f : 180.0f).setDuration(340L).setInterpolator(es.h).start();
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
                    org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
                    v8Var.d(G.l.toString(), G.e, J, v8Var.a == G.d);
                    v8Var.getCheckBox().setDrawIconType(G.z);
                    Switch checkBox = v8Var.getCheckBox();
                    int i27 = G.z == 0 ? org.telegram.ui.ActionBar.g6.M6 : org.telegram.ui.ActionBar.g6.r7;
                    int i28 = org.telegram.ui.ActionBar.g6.N6;
                    int i29 = org.telegram.ui.ActionBar.g6.d6;
                    checkBox.d(i27, i28, i29, i29);
                    v8Var.a = G.d;
                    v8Var.setIcon(G.t ? R.drawable.permission_locked : 0);
                    if (i14 == 40) {
                        if (!TextUtils.isEmpty(G.o)) {
                            v8Var.a(new n51(2, G, v8Var), G.o.toString(), G.f);
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
            l61 F = m61.F(i14);
            if (F != null) {
                F.bindView(b1Var.a, G, J, this, mm0Var instanceof i71 ? (i71) mm0Var : null);
            }
        }
        Utilities.Callback callback2 = G.F;
        if (callback2 != null) {
            callback2.run(view);
        }
    }

    @Override // s4.g0
    public s4.b1 x(ViewGroup viewGroup, int i10) {
        View i5Var;
        View m4Var;
        View view;
        View view2;
        org.telegram.ui.Cells.m4 m4Var2;
        int i11;
        boolean z10 = this.n;
        int i12 = z10 ? org.telegram.ui.ActionBar.g6.h5 : org.telegram.ui.ActionBar.g6.d6;
        Context context = this.e;
        if (i10 < 10000) {
            int i13 = 8;
            org.telegram.ui.ActionBar.c6 c6Var = this.v;
            switch (i10) {
                case -4:
                case -1:
                    i5Var = new bi.i5(context, 21);
                    if (i10 == -4) {
                        i5Var.setTag(-33024);
                    }
                    view2 = i5Var;
                    break;
                case -3:
                    x61 x61Var = new x61(context);
                    x61Var.a = 0;
                    view2 = x61Var;
                    break;
                case -2:
                    view2 = new bi.i5(context, 22);
                    break;
                case 0:
                    if (!z10) {
                        view2 = new org.telegram.ui.Cells.m4(context, c6Var);
                        break;
                    } else {
                        view = new org.telegram.ui.Cells.m4(this.e, org.telegram.ui.ActionBar.g6.L6, 21, 15, 0, false, false, this.v);
                        view2 = view;
                        break;
                    }
                case 1:
                    m4Var = new org.telegram.ui.Cells.m4(this.e, org.telegram.ui.ActionBar.g6.G6, 17, 15, false, this.v);
                    view2 = m4Var;
                    break;
                case 2:
                    view2 = new b31(context, c6Var);
                    break;
                case 3:
                    view2 = new org.telegram.ui.Cells.r8(context, c6Var);
                    break;
                case 4:
                case 9:
                    org.telegram.ui.Cells.w8 w8Var = new org.telegram.ui.Cells.w8(context, c6Var);
                    view = w8Var;
                    if (i10 == 9) {
                        w8Var.setDrawCheckRipple(true);
                        w8Var.d(org.telegram.ui.ActionBar.g6.g6, org.telegram.ui.ActionBar.g6.O6, org.telegram.ui.ActionBar.g6.P6, org.telegram.ui.ActionBar.g6.Q6, org.telegram.ui.ActionBar.g6.R6);
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
                    view2 = new org.telegram.ui.Cells.e9(context, c6Var);
                    break;
                case 10:
                    org.telegram.ui.Cells.u2 u2Var = new org.telegram.ui.Cells.u2(context);
                    TextView textView = new TextView(context);
                    u2Var.b = textView;
                    org.telegram.messenger.sk.u(textView, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.G6, false), 1, 16.0f, 1);
                    textView.setMaxLines(1);
                    textView.setSingleLine(true);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView.setEllipsize(truncateAt);
                    textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                    boolean z11 = LocaleController.isRTL;
                    u2Var.addView(textView, w7.z5.a(-1.0f, z11 ? 61.0f : 23.0f, 0.0f, z11 ? 23.0f : 61.0f, 0.0f, -1, (z11 ? 5 : 3) | 48));
                    TextView textView2 = new TextView(context);
                    u2Var.c = textView2;
                    org.telegram.messenger.sk.u(textView2, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.I6, false), 1, 16.0f, 1);
                    textView2.setMaxLines(1);
                    textView2.setSingleLine(true);
                    textView2.setEllipsize(truncateAt);
                    textView2.setGravity((LocaleController.isRTL ? 3 : 5) | 16);
                    textView2.setVisibility(8);
                    u2Var.addView(textView2, w7.z5.a(-1.0f, 23.0f, 0.0f, 23.0f, 0.0f, -2, (LocaleController.isRTL ? 3 : 5) | 48));
                    RadioButton radioButton = new RadioButton(context);
                    u2Var.d = radioButton;
                    radioButton.setSize(AndroidUtilities.dp(20.0f));
                    radioButton.b(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.g7, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.h7, false));
                    u2Var.addView(radioButton, w7.z5.a(22.0f, 20.0f, 15.0f, 20.0f, 0.0f, 22, (LocaleController.isRTL ? 3 : 5) | 48));
                    u2Var.b();
                    view2 = u2Var;
                    break;
                case 11:
                case 12:
                    org.telegram.ui.Cells.xa xaVar = new org.telegram.ui.Cells.xa(6, i10 != 12 ? 0 : 3, context, false);
                    xaVar.setSelfAsSavedMessages(true);
                    view2 = xaVar;
                    break;
                case 13:
                    m4Var = new org.telegram.ui.Cells.xa(6, 0, this.e, null, false, true);
                    view2 = m4Var;
                    break;
                case 14:
                    view2 = new sw0(context, c6Var);
                    break;
                case 15:
                    view2 = new org.telegram.ui.Cells.z7(context, c6Var);
                    break;
                case 16:
                    view2 = new ig.x1(context, c6Var, this.L != null);
                    break;
                case 17:
                    view2 = new ig.v1(context, c6Var);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    if (this.y == null) {
                        this.y = new jg.f(null);
                    }
                    view2 = new fb1(this.e, this.f, i10 - 18, this.y, this.h);
                    break;
                case 24:
                    view2 = new org.telegram.ui.oe(context, c6Var);
                    break;
                case 25:
                    view2 = new org.telegram.ui.pe(context, c6Var);
                    break;
                case 26:
                    m4Var2 = new org.telegram.ui.Cells.m4(this.e, org.telegram.ui.ActionBar.g6.G6, 23, 20, 0, false, false, this.v);
                    m4Var2.setTextSize(20.0f);
                    view2 = m4Var2;
                    break;
                case 27:
                    di.da daVar = new di.da(context, c6Var);
                    daVar.d(false, false);
                    view2 = daVar;
                    break;
                case 28:
                    i5Var = new z61(context);
                    i5Var.setTag(-33024);
                    view2 = i5Var;
                    break;
                case 29:
                    view2 = new ig.t(context, c6Var);
                    break;
                case MessageObject.TYPE_GIFT_STARS /* 30 */:
                    view2 = new org.telegram.ui.Cells.h9(context, c6Var);
                    break;
                case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                    mm0 mm0Var = this.d;
                    if (mm0Var != null && mm0Var.b1()) {
                        org.telegram.ui.Cells.v3 v3Var = new org.telegram.ui.Cells.v3(context, 28, c6Var);
                        v3Var.setNoBackground(true);
                        view2 = v3Var;
                        break;
                    } else {
                        view2 = new org.telegram.ui.Cells.v3(context, c6Var);
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
                    f10 f10Var = new f10(context, c6Var);
                    f10Var.setIsSingleCell(true);
                    view2 = f10Var;
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
                        org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(i11, 21, this.e, this.v, true);
                        a2Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.g6.V6, org.telegram.ui.ActionBar.g6.g7, org.telegram.ui.ActionBar.g6.k7);
                        view2 = a2Var;
                        break;
                    } else {
                        i13 = 4;
                    }
                    i11 = i13;
                    org.telegram.ui.Cells.a2 a2Var2 = new org.telegram.ui.Cells.a2(i11, 21, this.e, this.v, true);
                    a2Var2.getCheckBoxRound().b(org.telegram.ui.ActionBar.g6.V6, org.telegram.ui.ActionBar.g6.g7, org.telegram.ui.ActionBar.g6.k7);
                    view2 = a2Var2;
                case 38:
                    view2 = new org.telegram.ui.Cells.b2(context, c6Var);
                    break;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    view2 = new org.telegram.ui.Cells.v8(context);
                    break;
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    m4Var2 = new org.telegram.ui.Cells.m4(this.e, org.telegram.ui.ActionBar.g6.L6, 21, 15, 0, false, true, this.v);
                    view2 = m4Var2;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    view2 = new org.telegram.ui.Cells.ca(context, 0, c6Var);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    view2 = new org.telegram.ui.Cells.j6(context, false);
                    break;
            }
        } else {
            l61 F = m61.F(i10);
            view2 = F != null ? F.createView(this.e, this.d, this.f, this.h, this.v) : new View(context);
        }
        if (this.r) {
            if (i10 < 10000) {
                switch (i10) {
                }
            }
            view2.setBackgroundColor(I(i12));
        }
        return new wl0(view2);
    }

    @Override // s4.g0
    public void y(s4.b1 b1Var) {
        Q(b1Var, this.M);
        O(b1Var);
    }
}
