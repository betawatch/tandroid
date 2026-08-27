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
import org.telegram.ui.c91;
import org.telegram.ui.o91;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public class b51 extends xf.b {
    public z41 D;
    public z41 E;
    public int F;
    public boolean G;
    public Utilities.Callback2 H;
    public boolean I;
    public final zk0 d;
    public final Context e;
    public final int f;
    public final int h;
    public final boolean n;
    public Utilities.Callback2 s;
    public final org.telegram.ui.ActionBar.c6 v;
    public rf.f y;
    public boolean r = true;
    public final ArrayList w = new ArrayList();
    public final ArrayList x = new ArrayList();
    public int A = 0;
    public final ArrayList B = new ArrayList();
    public final ArrayList C = new ArrayList();

    public b51(zk0 zk0Var, Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, org.telegram.ui.ActionBar.c6 c6Var) {
        this.d = zk0Var;
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
        m41 F = n41.F(i10);
        return F != null && F.isShadow();
    }

    @Override // org.telegram.ui.Components.yk0
    public boolean D(f2.o1 o1Var) {
        int i10 = o1Var.f;
        n41 G = G(o1Var.b());
        if (i10 >= 10000) {
            m41 F = n41.F(i10);
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
            z41 z41Var = (z41) arrayList.get(i10);
            this.H.run(Integer.valueOf(i10), new ArrayList(this.x.subList(z41Var.a, z41Var.b + 1)));
            this.G = false;
        }
    }

    public final n41 G(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = this.x;
        if (i10 >= arrayList.size()) {
            return null;
        }
        return (n41) arrayList.get(i10);
    }

    public final int H(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.C;
            if (i11 >= arrayList.size()) {
                return -1;
            }
            z41 z41Var = (z41) arrayList.get(i11);
            if (i10 >= z41Var.a && i10 <= z41Var.b) {
                return i11;
            }
            i11++;
        }
    }

    public int I(int i10) {
        return org.telegram.ui.ActionBar.g6.v0(i10, this.v);
    }

    public final boolean J(int i10) {
        n41 G = G(i10);
        n41 G2 = G(i10 + 1);
        return (G == null || G.j || G2 == null || K(G2.a) != K(G.a)) ? false : true;
    }

    public final void L() {
        z41 z41Var = this.E;
        if (z41Var != null) {
            z41Var.b = Math.max(0, this.x.size() - 1);
        }
    }

    public final int M() {
        z41 z41Var = new z41();
        this.E = z41Var;
        z41Var.a = this.x.size();
        z41 z41Var2 = this.E;
        z41Var2.b = -1;
        this.C.add(z41Var2);
        return r1.size() - 1;
    }

    public void N(boolean z10) {
        zk0 zk0Var = this.d;
        if (zk0Var == null || !zk0Var.b0()) {
            P(z10);
        } else {
            zk0Var.post(new f50(9, this, z10));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void O(f2.o1 o1Var) {
        View view = o1Var.a;
        if (view instanceof org.telegram.ui.ActionBar.x5) {
            ((org.telegram.ui.ActionBar.x5) view).d();
            int i10 = o1Var.f;
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
        zk0 zk0Var = this.d;
        if (zk0Var == null || !zk0Var.b0()) {
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

    public final void Q(f2.o1 o1Var, boolean z10) {
        if (o1Var == null) {
            return;
        }
        View view = o1Var.a;
        int i10 = o1Var.f;
        if (i10 < 10000) {
            if (i10 != 16) {
                return;
            }
            ((qf.m1) view).setReorder(z10);
        } else {
            m41 F = n41.F(i10);
            if (F != null) {
                F.attachedView(this.d, view, G(o1Var.b()));
            }
        }
    }

    public final void R() {
        zk0 zk0Var = this.d;
        if (zk0Var == null) {
            return;
        }
        ArrayList arrayList = zk0Var.G2;
        if (arrayList == null) {
            zk0Var.G2 = new ArrayList();
        } else {
            arrayList.clear();
        }
        ArrayList arrayList2 = this.B;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            z41 z41Var = (z41) obj;
            zk0Var.G2.add(Long.valueOf(AndroidUtilities.pack(z41Var.a, z41Var.b)));
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
        z41 z41Var = this.D;
        if (z41Var != null) {
            z41Var.b = Math.max(0, (this.x.size() + this.A) - 1);
            z41 z41Var2 = this.D;
            if (z41Var2.a == z41Var2.b) {
                this.B.remove(z41Var2);
            }
            this.D = null;
        }
    }

    public final void U() {
        z41 z41Var = new z41();
        this.D = z41Var;
        z41Var.a = this.x.size() + this.A;
        z41 z41Var2 = this.D;
        z41Var2.b = -1;
        this.B.add(z41Var2);
    }

    @Override // f2.q0
    public final int h() {
        return this.x.size();
    }

    @Override // f2.q0
    public final int j(int i10) {
        n41 G = G(i10);
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
    @Override // f2.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void v(f2.o1 o1Var, int i10) {
        String str;
        org.telegram.ui.Cells.x8 x8Var;
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
        int i11;
        int i12 = this.f;
        zk0 zk0Var = this.d;
        n41 G = G(i10);
        n41 G2 = G(i10 + 1);
        n41 G3 = G(i10 - 1);
        if (G == null) {
            return;
        }
        int i13 = o1Var.f;
        View view = o1Var.a;
        boolean J = J(i10);
        O(o1Var);
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
                            frameLayout.addView(G.c, (i13 == -1 || i13 == -4) ? h7.z5.c(G.z, -1) : h7.z5.c(-2.0f, -2));
                            break;
                        }
                    }
                    break;
                case -3:
                    y41 y41Var = (y41) view;
                    y41Var.a = G.z;
                    y41Var.b = h7.a8.a(G.y, 1);
                    if (y41Var.getChildCount() != (G.c == null ? 0 : 1) || y41Var.getChildAt(0) != G.c) {
                        y41Var.removeAllViews();
                        View view3 = G.c;
                        if (view3 != null) {
                            AndroidUtilities.removeFromParent(view3);
                            y41Var.addView(G.c, h7.z5.c(-1.0f, -1));
                            break;
                        }
                    }
                    break;
                case 0:
                case 1:
                case 26:
                    org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
                    j4Var.setText(G.l);
                    j4Var.b(G.g);
                    break;
                case 2:
                    h11 h11Var = (h11) view;
                    int i14 = G.k;
                    if (i14 == 0) {
                        int i15 = G.z;
                        if (i15 != 0) {
                            h11Var.setEmojiSize(i15);
                        }
                        String charSequence = G.m.toString();
                        String charSequence2 = G.n.toString();
                        h11Var.getClass();
                        MediaDataController.getInstance(UserConfig.selectedAccount).setPlaceholderImage(h11Var.b, charSequence, charSequence2, "90_90");
                    } else if (G.q) {
                        h11Var.setEmojiStatic(i14);
                    } else {
                        h11Var.setEmoji(i14);
                    }
                    if (!TextUtils.isEmpty(G.o)) {
                        CharSequence charSequence3 = G.l;
                        CharSequence charSequence4 = G.o;
                        p80 p80Var = h11Var.c;
                        p80Var.setText(charSequence3);
                        p80Var.setVisibility(0);
                        p80 p80Var2 = h11Var.d;
                        p80Var2.setText(charSequence4);
                        p80Var2.setMaxWidth(lh.w3.a(charSequence4, p80Var2.getPaint()));
                        p80Var2.requestLayout();
                        h11Var.d();
                        break;
                    } else {
                        h11Var.setText(G.l);
                        break;
                    }
                case 3:
                    org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
                    Object obj = G.G;
                    if (obj instanceof TLRPC.Document) {
                        CharSequence charSequence5 = G.l;
                        TLRPC.Document document2 = (TLRPC.Document) obj;
                        l8Var.w = 16;
                        l8Var.s = 58;
                        org.telegram.ui.ActionBar.h5 h5Var = l8Var.a;
                        h5Var.l(charSequence5, false);
                        h5Var.i(null);
                        j6 j6Var = l8Var.c;
                        l8Var.I = null;
                        j6Var.c(null, false, true);
                        l8Var.h.setVisibility(8);
                        j6Var.setVisibility(8);
                        l8Var.d.setVisibility(8);
                        ri0 ri0Var = l8Var.e;
                        ri0Var.setVisibility(8);
                        ri0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
                        l8Var.r = J;
                        l8Var.setWillNotDraw(!J);
                        Switch r12 = l8Var.f;
                        if (r12 != null) {
                            r12.setVisibility(8);
                        }
                        l8Var.setValueSticker(document2);
                    } else if (obj instanceof String) {
                        CharSequence charSequence6 = G.l;
                        String str4 = (String) obj;
                        l8Var.w = 16;
                        l8Var.s = 58;
                        org.telegram.ui.ActionBar.h5 h5Var2 = l8Var.a;
                        h5Var2.l(charSequence6, false);
                        h5Var2.i(null);
                        j6 j6Var2 = l8Var.c;
                        l8Var.I = null;
                        j6Var2.c(null, false, true);
                        l8Var.h.setVisibility(8);
                        j6Var2.setVisibility(8);
                        l8Var.d.setVisibility(8);
                        ri0 ri0Var2 = l8Var.e;
                        ri0Var2.setVisibility(8);
                        ri0Var2.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
                        l8Var.r = J;
                        l8Var.setWillNotDraw(!J);
                        Switch r13 = l8Var.f;
                        if (r13 != null) {
                            r13.setVisibility(8);
                        }
                        l8Var.setValueSticker(str4);
                    } else if (TextUtils.isEmpty(G.n)) {
                        Object obj2 = G.G;
                        if (obj2 instanceof Drawable) {
                            l8Var.n(G.l, (Drawable) obj2, J);
                        } else {
                            int i16 = G.k;
                            if (i16 == 0) {
                                l8Var.i(G.l, J);
                            } else {
                                l8Var.m(i16, G.l, J);
                            }
                        }
                    } else {
                        Object obj3 = G.G;
                        if (obj3 instanceof Drawable) {
                            l8Var.r(G.l, G.n, (Drawable) obj3, J);
                        } else {
                            int i17 = G.k;
                            if (i17 == 0) {
                                l8Var.o(G.l, G.n, false, J);
                            } else {
                                l8Var.s(G.l, G.n, false, i17, J);
                            }
                        }
                    }
                    if (G.q) {
                        int i18 = org.telegram.ui.ActionBar.g6.q6;
                        l8Var.e(i18, i18);
                    } else if (G.r) {
                        l8Var.e(org.telegram.ui.ActionBar.g6.q7, org.telegram.ui.ActionBar.g6.p7);
                    } else {
                        l8Var.e(org.telegram.ui.ActionBar.g6.m6, org.telegram.ui.ActionBar.g6.G6);
                    }
                    l8Var.g(G.g);
                    break;
                case 4:
                case 9:
                    org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
                    if (p8Var.b == G.d) {
                        p8Var.setChecked(G.e);
                    }
                    p8Var.e(null, G.g);
                    p8Var.f(G.l, G.e, J);
                    p8Var.b = G.d;
                    if (i13 == 9) {
                        view.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, G.e ? org.telegram.ui.ActionBar.g6.f6 : org.telegram.ui.ActionBar.g6.e6, false));
                        break;
                    }
                    break;
                case 5:
                    org.telegram.ui.Cells.g5 g5Var = (org.telegram.ui.Cells.g5) view;
                    CharSequence charSequence7 = G.m;
                    g5Var.b(G.l, G.m, 0, G.e, 0, charSequence7 != null && charSequence7.toString().contains("\n"), J, false);
                    break;
                case 6:
                    ((org.telegram.ui.Cells.g5) view).b(G.l, G.m, 0, G.e, 0, false, J, false);
                    break;
                case 7:
                case 8:
                case 38:
                    if (i13 == 7 || i13 == 8) {
                        org.telegram.ui.Cells.x8 x8Var2 = (org.telegram.ui.Cells.x8) view;
                        if (TextUtils.isEmpty(G.l)) {
                            x8Var2.setFixedSize(i13 == 8 ? 220 : 12);
                            x8Var2.setText("");
                        } else {
                            x8Var2.setFixedSize(0);
                            x8Var2.setText(G.l);
                        }
                        if (G.q) {
                            x8Var2.setTextGravity(17);
                            x8Var2.getTextView().setWidth(Math.min(lh.w3.a(x8Var2.getText(), x8Var2.getTextView().getPaint()), AndroidUtilities.displaySize.x - AndroidUtilities.dp(60.0f)));
                            x8Var2.getTextView().setPadding(0, AndroidUtilities.dp(17.0f), 0, AndroidUtilities.dp(17.0f));
                            x8Var = x8Var2;
                        } else {
                            x8Var2.setTextGravity(8388611);
                            x8Var2.getTextView().setMinWidth(0);
                            x8Var2.getTextView().setMaxWidth(AndroidUtilities.displaySize.x);
                            x8Var2.getTextView().setPadding(0, AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(17.0f));
                            x8Var = x8Var2;
                        }
                    } else if (i13 == 38) {
                        org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) view;
                        CharSequence charSequence8 = G.o;
                        boolean z12 = G.f;
                        z1Var.a.setText(charSequence8);
                        View view4 = z1Var.b;
                        view4.animate().cancel();
                        view4.animate().rotation(z12 ? 0.0f : 180.0f).setDuration(340L).setInterpolator(er.h).start();
                        if (G.q) {
                            z1Var.setColor(org.telegram.ui.ActionBar.g6.q6);
                            x8Var = z1Var;
                        } else if (G.r) {
                            z1Var.setColor(org.telegram.ui.ActionBar.g6.p7);
                            x8Var = z1Var;
                        } else {
                            z1Var.setColor(org.telegram.ui.ActionBar.g6.G6);
                            x8Var = z1Var;
                        }
                    } else {
                        x8Var = null;
                    }
                    boolean z13 = (G3 == null || K(G3.a)) ? false : true;
                    boolean z14 = (G2 == null || K(G2.a)) ? false : true;
                    if (!zk0Var.b1()) {
                        Drawable U0 = org.telegram.ui.ActionBar.g6.U0(this.e, (z13 && z14) ? R.drawable.greydivider : z13 ? R.drawable.greydivider_bottom : z14 ? R.drawable.greydivider_top : R.drawable.field_carret_empty, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.b7, this.v));
                        if (!this.n) {
                            x8Var.setBackground(U0);
                            break;
                        } else {
                            x8Var.setBackground(new LayerDrawable(new Drawable[]{new ColorDrawable(I(org.telegram.ui.ActionBar.g6.i5)), U0}));
                            break;
                        }
                    } else {
                        x8Var.setBackground(null);
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
                    dv0 dv0Var = (dv0) view;
                    dv0Var.b(G.z, null, G.p);
                    dv0Var.setMinAllowedIndex((int) G.B);
                    dv0Var.setCallback(new vu(G, 26));
                    break;
                case 15:
                    org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
                    u7Var.d(G.z, (org.telegram.ui.Cells.t7) G.G, G.C);
                    u7Var.setMinValueAllowed((int) G.B);
                    break;
                case 16:
                    qf.m1 m1Var = (qf.m1) view;
                    m1Var.d.a(G.e, false);
                    m1Var.setReorder(this.I);
                    Object obj4 = G.G;
                    if (obj4 instanceof qf.p1) {
                        m1Var.a((qf.p1) obj4, null, J);
                        break;
                    }
                    break;
                case 17:
                    qf.l1 l1Var = (qf.l1) view;
                    l1Var.e.a(G.e, false);
                    Object obj5 = G.G;
                    if (obj5 instanceof qf.p1) {
                        qf.p1 p1Var = (qf.p1) obj5;
                        y8 y8Var = l1Var.a;
                        int[] iArr = l1Var.r;
                        TextView textView3 = l1Var.d;
                        ImageReceiver imageReceiver = l1Var.b;
                        int i20 = UserConfig.selectedAccount;
                        l1Var.c.setText(MessagesController.getInstance(i20).getPeerName(UserConfig.getInstance(i20).getClientUserId()));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        MessageObject messageObject = p1Var.e;
                        if (messageObject != null) {
                            spannableStringBuilder.append(Emoji.replaceEmoji(messageObject.messageText, textView3.getPaint().getFontMetricsInt(), false));
                        }
                        if (p1Var.a() > 1) {
                            spannableStringBuilder.append((CharSequence) "  ");
                            int dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(80.0f);
                            int a2 = p1Var.a() - 1;
                            int i21 = z.d;
                            SpannableString spannableString = new SpannableString("+");
                            z zVar = new z(a2);
                            iArr[0] = (int) (((pz0) zVar.c).c + AndroidUtilities.dp(10.0f));
                            spannableString.setSpan(zVar, 0, spannableString.length(), 33);
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(TextUtils.ellipsize(spannableStringBuilder, textView3.getPaint(), (dp * 1.5f) - iArr[0], TextUtils.TruncateAt.END));
                            if (spannableStringBuilder2.length() > 0 && spannableStringBuilder2.charAt(spannableStringBuilder2.length() - 1) == 8230) {
                                spannableStringBuilder2.append((CharSequence) "  ");
                            }
                            spannableStringBuilder2.append((CharSequence) spannableString);
                            spannableStringBuilder = spannableStringBuilder2;
                        }
                        textView3.setText(spannableStringBuilder);
                        TLRPC.MessageMedia media = MessageObject.getMedia(p1Var.e);
                        if (media != null && (photo = media.photo) != null) {
                            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(36.0f), true, null, true);
                            ImageLocation forObject = ImageLocation.getForObject(closestPhotoSizeWithSize, media.photo);
                            MessageObject messageObject2 = p1Var.e;
                            imageReceiver.setImage(forObject, "36_36", messageObject2.strippedThumb, closestPhotoSizeWithSize == null ? 0L : closestPhotoSizeWithSize.size, (String) null, messageObject2, 0);
                            imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
                        } else if (media == null || (document = media.document) == null) {
                            y8Var.r(UserConfig.getInstance(i20).getCurrentUser());
                            imageReceiver.setForUserOrChat(UserConfig.getInstance(i20).getCurrentUser(), y8Var);
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
                            MessageObject messageObject3 = p1Var.e;
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
                    o91 o91Var = (o91) view;
                    int i22 = G.z;
                    c91 c91Var = (c91) G.G;
                    x41 x41Var = new x41(0, this, G);
                    o91Var.x = i22;
                    o91Var.y = x41Var;
                    o91Var.e(c91Var, false);
                    break;
                case 24:
                    ((org.telegram.ui.de) view).set((org.telegram.ui.ce) G.G);
                    break;
                case 25:
                    org.telegram.ui.ee eeVar = (org.telegram.ui.ee) view;
                    TL_stats.BroadcastRevenueTransaction broadcastRevenueTransaction = (TL_stats.BroadcastRevenueTransaction) G.G;
                    s5 s5Var = eeVar.b;
                    org.telegram.ui.ActionBar.c6 c6Var = eeVar.a;
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
                            sb2.append(z10 ? org.telegram.messenger.y1.i(R.string.MonetizationTransactionNotCompleted, new StringBuilder(" — ")) : "");
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
                    textView5.setTextColor(org.telegram.ui.ActionBar.g6.v0(z10 ? org.telegram.ui.ActionBar.g6.p7 : org.telegram.ui.ActionBar.g6.y6, c6Var));
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
                    s5Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(c10 < 0 ? org.telegram.ui.ActionBar.g6.q7 : org.telegram.ui.ActionBar.g6.l8, c6Var));
                    eeVar.f = J;
                    eeVar.setWillNotDraw(!J);
                    break;
                case 27:
                    lh.p9 p9Var = (lh.p9) view;
                    long j15 = p9Var.x;
                    Object obj6 = G.G;
                    if (!(obj6 instanceof TLRPC.User)) {
                        if (!(obj6 instanceof TLRPC.Chat)) {
                            j12 = 0;
                            boolean z17 = j15 != j12;
                            p9Var.d(false, true);
                            p9Var.set(G.G);
                            p9Var.f.setVisibility(8);
                            p9Var.h.setVisibility(0);
                            p9Var.c(G.e, z17);
                            p9Var.setDivider(J);
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
                    p9Var.d(false, true);
                    p9Var.set(G.G);
                    p9Var.f.setVisibility(8);
                    p9Var.h.setVisibility(0);
                    p9Var.c(G.e, z17);
                    p9Var.setDivider(J);
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
                    ((a51) view).setHeight(G.z);
                    break;
                case 29:
                    qf.q qVar = (qf.q) view;
                    Object obj7 = G.G;
                    if (obj7 instanceof qf.r) {
                        org.telegram.ui.ActionBar.h5 h5Var3 = qVar.a;
                        org.telegram.ui.ActionBar.h5 h5Var4 = qVar.c;
                        eh.s sVar = qVar.b;
                        qVar.e = J;
                        TL_account.TL_businessChatLink tL_businessChatLink = ((qf.r) obj7).a;
                        qVar.f = tL_businessChatLink;
                        if (TextUtils.isEmpty(tL_businessChatLink.title)) {
                            String str5 = qVar.f.link;
                            qf.v[] vVarArr = qf.v.e;
                            if (str5.startsWith("https://")) {
                                str5 = str5.substring(8);
                            }
                            h5Var3.l(str5, false);
                        } else {
                            h5Var3.l(qVar.f.title, false);
                        }
                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(qVar.f.message);
                        TL_account.TL_businessChatLink tL_businessChatLink2 = qVar.f;
                        MediaDataController.addTextStyleRuns(tL_businessChatLink2.entities, tL_businessChatLink2.message, spannableStringBuilder4);
                        CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder4, sVar.getPaint().getFontMetricsInt(), false);
                        MessageObject.replaceAnimatedEmoji(replaceEmoji, qVar.f.entities, sVar.getPaint().getFontMetricsInt());
                        sVar.setText(replaceEmoji);
                        int i24 = qVar.f.views;
                        if (i24 == 0) {
                            h5Var4.l(LocaleController.formatString(R.string.NoClicks, new Object[0]), false);
                        } else {
                            h5Var4.l(LocaleController.formatPluralString("Clicks", i24, new Object[0]), false);
                        }
                        h5Var4.requestLayout();
                        qVar.invalidate();
                        break;
                    }
                    break;
                case MessageObject.TYPE_GIFT_STARS /* 30 */:
                    org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                    CharSequence charSequence13 = G.l;
                    int i25 = G.k;
                    a9Var.b.l(charSequence13, false);
                    a9Var.a.setImageResource(i25);
                    a9Var.setDivider(J);
                    a9Var.setBackgroundColor(I(org.telegram.ui.ActionBar.g6.h5));
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
                    org.telegram.ui.Cells.e6 e6Var = (org.telegram.ui.Cells.e6) view;
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
                            e6Var.x0 = z18;
                            e6Var.y0 = r10;
                            e6Var.setRectangularAvatar(G.r);
                            CharSequence charSequence14 = G.m;
                            e6Var.u(obj8, null, str6, charSequence14 == null ? charSequence14 : concat, false, false);
                            e6Var.t(G.e, false);
                            e6Var.I = J;
                        }
                        concat = "";
                        if (!(obj8 instanceof TLRPC.Chat)) {
                        }
                        String str62 = str;
                        boolean z182 = G.t;
                        Object obj92 = G.H;
                        if (obj92 instanceof Utilities.Callback) {
                        }
                        e6Var.x0 = z182;
                        e6Var.y0 = r10;
                        e6Var.setRectangularAvatar(G.r);
                        CharSequence charSequence142 = G.m;
                        e6Var.u(obj8, null, str62, charSequence142 == null ? charSequence142 : concat, false, false);
                        e6Var.t(G.e, false);
                        e6Var.I = J;
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
                                e6Var.x0 = z1822;
                                e6Var.y0 = callback;
                                e6Var.setRectangularAvatar(G.r);
                                CharSequence charSequence1422 = G.m;
                                e6Var.u(obj8, null, str622, charSequence1422 == null ? charSequence1422 : concat, false, false);
                                e6Var.t(G.e, false);
                                e6Var.I = J;
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
                        e6Var.x0 = z18222;
                        e6Var.y0 = callback;
                        e6Var.setRectangularAvatar(G.r);
                        CharSequence charSequence14222 = G.m;
                        e6Var.u(obj8, null, str6222, charSequence14222 == null ? charSequence14222 : concat, false, false);
                        e6Var.t(G.e, false);
                        e6Var.I = J;
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
                    ((h00) view).setViewType(G.z);
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
                            j6 j6Var3 = x1Var.b;
                            j6Var3.a();
                            j6Var3.setText(charSequence15);
                            View view5 = x1Var.c;
                            view5.animate().cancel();
                            view5.animate().rotation(z19 ? 0.0f : 180.0f).setDuration(340L).setInterpolator(er.h).start();
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
                    org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view;
                    o8Var.d(G.l.toString(), G.e, J, o8Var.a == G.d);
                    o8Var.getCheckBox().setDrawIconType(G.z);
                    Switch checkBox = o8Var.getCheckBox();
                    int i26 = G.z == 0 ? org.telegram.ui.ActionBar.g6.M6 : org.telegram.ui.ActionBar.g6.r7;
                    int i27 = org.telegram.ui.ActionBar.g6.N6;
                    int i28 = org.telegram.ui.ActionBar.g6.d6;
                    checkBox.d(i26, i27, i28, i28);
                    o8Var.a = G.d;
                    o8Var.setIcon(G.t ? R.drawable.permission_locked : 0);
                    if (i13 == 40) {
                        if (!TextUtils.isEmpty(G.o)) {
                            o8Var.a(new lg0(27, G, o8Var), G.o.toString(), G.f);
                            break;
                        } else {
                            LinearLayout linearLayout = o8Var.f;
                            if (linearLayout != null) {
                                linearLayout.setVisibility(8);
                                break;
                            }
                        }
                    }
                    break;
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    org.telegram.ui.Cells.j4 j4Var2 = (org.telegram.ui.Cells.j4) view;
                    j4Var2.c(G.o, j4Var2.a == G.d);
                    j4Var2.a = G.d;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
                    x9Var.getValueBackupImageView().setImageDrawable(null);
                    CharSequence charSequence16 = G.l;
                    if (charSequence16 != null) {
                        CharSequence charSequence17 = G.m;
                        if (charSequence17 != null) {
                            x9Var.c(charSequence16, charSequence17, false, J);
                        } else {
                            x9Var.b(charSequence16, J);
                        }
                    }
                    x9Var.setIcon(G.k);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    ((org.telegram.ui.Cells.f6) view).b(G.l.toString(), G.n.toString(), J, G.e);
                    break;
            }
        } else {
            m41 F = n41.F(i13);
            if (F != null) {
                F.bindView(o1Var.a, G, J, this, zk0Var instanceof k51 ? (k51) zk0Var : null);
            }
        }
        org.telegram.ui.x3 x3Var = G.F;
        if (x3Var != null) {
            x3Var.run(view);
        }
    }

    @Override // f2.q0
    public f2.o1 x(ViewGroup viewGroup, int i10) {
        View dVar;
        View j4Var;
        View view;
        View view2;
        org.telegram.ui.Cells.j4 j4Var2;
        boolean z10 = this.n;
        int i11 = z10 ? org.telegram.ui.ActionBar.g6.h5 : org.telegram.ui.ActionBar.g6.d6;
        Context context = this.e;
        if (i10 < 10000) {
            org.telegram.ui.ActionBar.c6 c6Var = this.v;
            switch (i10) {
                case -4:
                case -1:
                    dVar = new ag.d(context, 20);
                    if (i10 == -4) {
                        dVar.setTag(-33024);
                    }
                    view2 = dVar;
                    break;
                case -3:
                    y41 y41Var = new y41(context);
                    y41Var.a = 0;
                    view2 = y41Var;
                    break;
                case -2:
                    view2 = new ag.d(context, 21);
                    break;
                case 0:
                    if (!z10) {
                        view2 = new org.telegram.ui.Cells.j4(context, c6Var);
                        break;
                    } else {
                        view = new org.telegram.ui.Cells.j4(this.e, org.telegram.ui.ActionBar.g6.L6, 21, 15, 0, false, false, this.v);
                        view2 = view;
                        break;
                    }
                case 1:
                    j4Var = new org.telegram.ui.Cells.j4(this.e, org.telegram.ui.ActionBar.g6.G6, 17, 15, false, this.v);
                    view2 = j4Var;
                    break;
                case 2:
                    view2 = new h11(context, c6Var);
                    break;
                case 3:
                    view2 = new org.telegram.ui.Cells.l8(context, c6Var);
                    break;
                case 4:
                case 9:
                    org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(context, c6Var);
                    view = p8Var;
                    if (i10 == 9) {
                        p8Var.setDrawCheckRipple(true);
                        p8Var.d(org.telegram.ui.ActionBar.g6.g6, org.telegram.ui.ActionBar.g6.O6, org.telegram.ui.ActionBar.g6.P6, org.telegram.ui.ActionBar.g6.Q6, org.telegram.ui.ActionBar.g6.R6);
                        p8Var.setTypeface(AndroidUtilities.bold());
                        p8Var.setHeight(56);
                        view = p8Var;
                    }
                    view2 = view;
                    break;
                case 5:
                case 6:
                    j4Var = new org.telegram.ui.Cells.g5(21, 60, this.e, this.v, i10 == 6);
                    view2 = j4Var;
                    break;
                case 7:
                case 8:
                default:
                    view2 = new org.telegram.ui.Cells.x8(context, c6Var);
                    break;
                case 10:
                    org.telegram.ui.Cells.r2 r2Var = new org.telegram.ui.Cells.r2(context);
                    TextView textView = new TextView(context);
                    r2Var.b = textView;
                    org.telegram.messenger.rl.p(textView, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false), 1, 16.0f, 1);
                    textView.setMaxLines(1);
                    textView.setSingleLine(true);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView.setEllipsize(truncateAt);
                    textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                    boolean z11 = LocaleController.isRTL;
                    r2Var.addView(textView, h7.z5.d(-1, -1.0f, (z11 ? 5 : 3) | 48, z11 ? 61.0f : 23.0f, 0.0f, z11 ? 23.0f : 61.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    r2Var.c = textView2;
                    org.telegram.messenger.rl.p(textView2, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.I6, false), 1, 16.0f, 1);
                    textView2.setMaxLines(1);
                    textView2.setSingleLine(true);
                    textView2.setEllipsize(truncateAt);
                    textView2.setGravity((LocaleController.isRTL ? 3 : 5) | 16);
                    textView2.setVisibility(8);
                    r2Var.addView(textView2, h7.z5.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 23.0f, 0.0f, 23.0f, 0.0f));
                    RadioButton radioButton = new RadioButton(context);
                    r2Var.d = radioButton;
                    radioButton.setSize(AndroidUtilities.dp(20.0f));
                    radioButton.b(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.g7, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.h7, false));
                    r2Var.addView(radioButton, h7.z5.d(22, 22.0f, (LocaleController.isRTL ? 3 : 5) | 48, 20.0f, 15.0f, 20.0f, 0.0f));
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
                    j4Var = new org.telegram.ui.Cells.sa(6, 0, this.e, null, false, true);
                    view2 = j4Var;
                    break;
                case 14:
                    view2 = new dv0(context, c6Var);
                    break;
                case 15:
                    view2 = new org.telegram.ui.Cells.u7(context, c6Var);
                    break;
                case 16:
                    view2 = new qf.m1(context, c6Var, this.H != null);
                    break;
                case 17:
                    view2 = new qf.l1(context, c6Var);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    if (this.y == null) {
                        this.y = new rf.f(null);
                    }
                    view2 = new o91(this.e, this.f, i10 - 18, this.y, this.h);
                    break;
                case 24:
                    view2 = new org.telegram.ui.de(context, c6Var);
                    break;
                case 25:
                    view2 = new org.telegram.ui.ee(context, c6Var);
                    break;
                case 26:
                    j4Var2 = new org.telegram.ui.Cells.j4(this.e, org.telegram.ui.ActionBar.g6.G6, 23, 20, 0, false, false, this.v);
                    j4Var2.setTextSize(20.0f);
                    view2 = j4Var2;
                    break;
                case 27:
                    lh.p9 p9Var = new lh.p9(context, c6Var);
                    p9Var.d(false, false);
                    view2 = p9Var;
                    break;
                case 28:
                    dVar = new a51(context);
                    dVar.setTag(-33024);
                    view2 = dVar;
                    break;
                case 29:
                    view2 = new qf.q(context, c6Var);
                    break;
                case MessageObject.TYPE_GIFT_STARS /* 30 */:
                    view2 = new org.telegram.ui.Cells.a9(context, c6Var);
                    break;
                case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                    zk0 zk0Var = this.d;
                    if (zk0Var != null && zk0Var.b1()) {
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
                    view2 = new org.telegram.ui.Cells.e6(context, null);
                    break;
                case 33:
                    view2 = new org.telegram.ui.Cells.p2(context, true);
                    break;
                case 34:
                    h00 h00Var = new h00(context, c6Var);
                    h00Var.setIsSingleCell(true);
                    view2 = h00Var;
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
                    view2 = new org.telegram.ui.Cells.o8(context);
                    break;
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    j4Var2 = new org.telegram.ui.Cells.j4(this.e, org.telegram.ui.ActionBar.g6.L6, 21, 15, 0, false, true, this.v);
                    view2 = j4Var2;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    view2 = new org.telegram.ui.Cells.x9(context, 0, c6Var);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    view2 = new org.telegram.ui.Cells.f6(context, false);
                    break;
            }
        } else {
            m41 F = n41.F(i10);
            view2 = F != null ? F.createView(this.e, this.d, this.f, this.h, this.v) : new View(context);
        }
        if (this.r) {
            if (i10 < 10000) {
                switch (i10) {
                }
            }
            view2.setBackgroundColor(I(i11));
        }
        return new lk0(view2);
    }

    @Override // f2.q0
    public void y(f2.o1 o1Var) {
        Q(o1Var, this.I);
        O(o1Var);
    }
}
