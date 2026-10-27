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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public class k71 extends qg.b {
    public kg.g E;
    public g71 I;
    public g71 J;
    public int K;
    public boolean L;
    public Utilities.Callback2 M;
    public boolean N;
    public final nm0 d;
    public final Context e;
    public final int f;
    public final int h;
    public final boolean n;
    public boolean s;
    public Utilities.Callback2 v;
    public final org.telegram.ui.ActionBar.u6 w;
    public boolean r = true;
    public final ArrayList x = new ArrayList();
    public final ArrayList y = new ArrayList();
    public int F = 0;
    public final ArrayList G = new ArrayList();
    public final ArrayList H = new ArrayList();
    public final j71 O = new j71(this);

    public k71(nm0 nm0Var, Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, org.telegram.ui.ActionBar.u6 u6Var) {
        this.d = nm0Var;
        this.e = context;
        this.f = i10;
        this.h = i11;
        this.n = z10;
        this.v = callback2;
        this.w = u6Var;
        O(false);
    }

    public static boolean K(int i10) {
        if (i10 < 10000) {
            return i10 == 7 || i10 == 8 || i10 == 38 || i10 == 31 || i10 == -4 || i10 == 28 || i10 == 2 || i10 == -2;
        }
        t61 G = u61.G(i10);
        return G != null && G.isShadow();
    }

    @Override // org.telegram.ui.Components.mm0
    public boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f;
        u61 G = G(e1Var.b());
        if (i10 >= 10000) {
            t61 G2 = u61.G(i10);
            if (G2 == null || !G2.isClickable()) {
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
            g71 g71Var = (g71) arrayList.get(i10);
            this.M.run(Integer.valueOf(i10), new ArrayList(this.y.subList(g71Var.a, g71Var.b + 1)));
            this.L = false;
        }
    }

    public final u61 G(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = this.y;
        if (i10 >= arrayList.size()) {
            return null;
        }
        return (u61) arrayList.get(i10);
    }

    public final int H(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i11 >= arrayList.size()) {
                return -1;
            }
            g71 g71Var = (g71) arrayList.get(i11);
            if (i10 >= g71Var.a && i10 <= g71Var.b) {
                return i11;
            }
            i11++;
        }
    }

    public int I(int i10) {
        return org.telegram.ui.ActionBar.y6.w0(i10, this.w);
    }

    public final boolean J(int i10) {
        u61 G = G(i10);
        u61 G2 = G(i10 + 1);
        return (G == null || G.j || G2 == null || K(G2.a) != K(G.a)) ? false : true;
    }

    public final void L() {
        g71 g71Var = this.J;
        if (g71Var != null) {
            g71Var.b = Math.max(0, this.y.size() - 1);
        }
    }

    public final int M() {
        g71 g71Var = new g71();
        this.J = g71Var;
        g71Var.a = this.y.size();
        g71 g71Var2 = this.J;
        g71Var2.b = -1;
        this.H.add(g71Var2);
        return r1.size() - 1;
    }

    public final boolean N(int i10) {
        if (!this.r) {
            return false;
        }
        nm0 nm0Var = this.d;
        if (nm0Var != null && nm0Var.b1() && nm0Var.getSectionsDrawBackground()) {
            return false;
        }
        if (i10 >= 10000) {
            return true;
        }
        switch (i10) {
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
            case MessageObject.TYPE_GIFT_STARS /* 30 */:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case Maneuver.TYPE_DESTINATION /* 39 */:
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
            case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                return true;
            case -4:
            case -2:
            case -1:
            case 2:
            case 7:
            case 8:
            case 26:
            case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
            case 38:
            default:
                return false;
        }
    }

    public void O(boolean z10) {
        nm0 nm0Var = this.d;
        if (nm0Var == null || !nm0Var.c0()) {
            Q(z10);
        } else {
            nm0Var.post(new d60(9, this, z10));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void P(s4.e1 e1Var) {
        View view = e1Var.a;
        if (view instanceof org.telegram.ui.ActionBar.p6) {
            ((org.telegram.ui.ActionBar.p6) view).updateColors();
            Object tag = view.getTag(R.id.theme_generation);
            int i10 = org.telegram.ui.ActionBar.f7.b;
            if (N(e1Var.f) && (!(tag instanceof Integer) || ((Integer) tag).intValue() != i10)) {
                view.setBackgroundColor(I(this.n ? org.telegram.ui.ActionBar.y6.h5 : org.telegram.ui.ActionBar.y6.d6));
            }
            view.setTag(R.id.theme_generation, Integer.valueOf(i10));
        }
    }

    public final void Q(boolean z10) {
        nm0 nm0Var = this.d;
        if (nm0Var == null || !nm0Var.c0()) {
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
                S();
                if (z10) {
                    E(arrayList, arrayList2);
                } else {
                    l();
                }
            }
        }
    }

    public final void R(s4.e1 e1Var, boolean z10) {
        if (e1Var == null) {
            return;
        }
        View view = e1Var.a;
        int i10 = e1Var.f;
        if (i10 < 10000) {
            if (i10 != 16) {
                return;
            }
            ((jg.y1) view).setReorder(z10);
        } else {
            t61 G = u61.G(i10);
            if (G != null) {
                G.attachedView(this.d, view, G(e1Var.b()));
            }
        }
    }

    public final void S() {
        nm0 nm0Var = this.d;
        if (nm0Var == null) {
            return;
        }
        ArrayList arrayList = nm0Var.K2;
        if (arrayList == null) {
            nm0Var.K2 = new ArrayList();
        } else {
            arrayList.clear();
        }
        ArrayList arrayList2 = this.G;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            g71 g71Var = (g71) obj;
            nm0Var.K2.add(Long.valueOf(AndroidUtilities.pack(g71Var.a, g71Var.b)));
        }
    }

    public final void T() {
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
        S();
    }

    public final void U() {
        g71 g71Var = this.I;
        if (g71Var != null) {
            g71Var.b = Math.max(0, (this.y.size() + this.F) - 1);
            g71 g71Var2 = this.I;
            if (g71Var2.a == g71Var2.b) {
                this.G.remove(g71Var2);
            }
            this.I = null;
        }
    }

    public final void V() {
        g71 g71Var = new g71();
        this.I = g71Var;
        g71Var.a = this.y.size() + this.F;
        g71 g71Var2 = this.I;
        g71Var2.b = -1;
        this.G.add(g71Var2);
    }

    @Override // s4.h0
    public final int h() {
        return this.y.size();
    }

    @Override // s4.h0
    public final int j(int i10) {
        u61 G = G(i10);
        if (G == null) {
            return 0;
        }
        return G.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0236  */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v15 */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void v(s4.e1 e1Var, int i10) {
        String str;
        org.telegram.ui.Cells.i9 i9Var;
        ?? r14;
        ImageReceiver imageReceiver;
        TLRPC.Document document;
        long j10;
        ImageLocation imageLocation;
        String str2;
        TLRPC.Photo photo;
        u61 u61Var;
        long j11;
        boolean z10;
        char c10;
        long j12;
        CharSequence concat;
        int i11;
        int i12 = this.f;
        nm0 nm0Var = this.d;
        org.telegram.ui.ActionBar.u6 u6Var = this.w;
        u61 G = G(i10);
        u61 G2 = G(i10 + 1);
        u61 G3 = G(i10 - 1);
        if (G == null) {
            return;
        }
        int i13 = e1Var.f;
        View view = e1Var.a;
        boolean J = J(i10);
        P(e1Var);
        if (i13 < 10000) {
            long j13 = 0;
            str = "";
            int i14 = 1;
            switch (i13) {
                case -5:
                    sm0 sm0Var = (sm0) view;
                    if (sm0Var.getChildCount() != (G.c == null ? 0 : 1) || sm0Var.getChildAt(0) != G.c) {
                        sm0Var.removeAllViews();
                        View view2 = G.c;
                        if (view2 != null) {
                            AndroidUtilities.removeFromParent(view2);
                            sm0Var.addView(G.c, kb1.g(-1.0f, -1));
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
                            AndroidUtilities.removeFromParent(view3);
                            frameLayout.addView(G.c, (i13 == -1 || i13 == -4) ? kb1.g(G.z, -1) : kb1.g(-2.0f, -2));
                            break;
                        }
                    }
                    break;
                case -3:
                    f71 f71Var = (f71) view;
                    f71Var.setMinusHeight(G.z);
                    f71Var.setMinusPadding(a8.pf.a(G.y, 1));
                    if (f71Var.getChildCount() != (G.c == null ? 0 : 1) || f71Var.getChildAt(0) != G.c) {
                        f71Var.removeAllViews();
                        View view4 = G.c;
                        if (view4 != null) {
                            AndroidUtilities.removeFromParent(view4);
                            f71Var.addView(G.c, kb1.g(-1.0f, -1));
                            break;
                        }
                    }
                    break;
                case 0:
                case 1:
                case 26:
                    org.telegram.ui.Cells.q4 q4Var = (org.telegram.ui.Cells.q4) view;
                    q4Var.setText(G.l);
                    q4Var.b(G.g);
                    break;
                case 2:
                    k31 k31Var = (k31) view;
                    int i15 = G.k;
                    if (i15 == 0) {
                        int i16 = G.z;
                        if (i16 != 0) {
                            k31Var.setEmojiSize(i16);
                        }
                        String charSequence = G.m.toString();
                        String charSequence2 = G.n.toString();
                        k31Var.getClass();
                        MediaDataController.getInstance(UserConfig.selectedAccount).setPlaceholderImage(k31Var.b, charSequence, charSequence2, "90_90");
                    } else if (G.q) {
                        k31Var.setEmojiStatic(i15);
                    } else {
                        k31Var.setEmoji(i15);
                    }
                    if (!TextUtils.isEmpty(G.o)) {
                        k31Var.a(G.l, G.o);
                        break;
                    } else {
                        k31Var.setText(G.l);
                        break;
                    }
                case 3:
                    org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
                    Object obj = G.G;
                    if (obj instanceof TLRPC.Document) {
                        CharSequence charSequence3 = G.l;
                        TLRPC.Document document2 = (TLRPC.Document) obj;
                        v8Var.w = v8Var.getDefaultImageLeft();
                        v8Var.s = v8Var.c(false);
                        org.telegram.ui.ActionBar.b6 b6Var = v8Var.a;
                        b6Var.l(charSequence3, false);
                        b6Var.i(null);
                        s6 s6Var = v8Var.c;
                        v8Var.Q = null;
                        s6Var.c(null, false, true);
                        v8Var.h.setVisibility(8);
                        s6Var.setVisibility(8);
                        v8Var.d.setVisibility(8);
                        bk0 bk0Var = v8Var.e;
                        bk0Var.setVisibility(8);
                        bk0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
                        v8Var.r = J;
                        v8Var.setWillNotDraw(!J);
                        Switch r12 = v8Var.f;
                        if (r12 != null) {
                            r12.setVisibility(8);
                        }
                        v8Var.setValueSticker(document2);
                    } else if (obj instanceof String) {
                        CharSequence charSequence4 = G.l;
                        String str3 = (String) obj;
                        v8Var.w = v8Var.getDefaultImageLeft();
                        v8Var.s = v8Var.c(false);
                        org.telegram.ui.ActionBar.b6 b6Var2 = v8Var.a;
                        b6Var2.l(charSequence4, false);
                        b6Var2.i(null);
                        s6 s6Var2 = v8Var.c;
                        v8Var.Q = null;
                        s6Var2.c(null, false, true);
                        v8Var.h.setVisibility(8);
                        s6Var2.setVisibility(8);
                        v8Var.d.setVisibility(8);
                        bk0 bk0Var2 = v8Var.e;
                        bk0Var2.setVisibility(8);
                        bk0Var2.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
                        v8Var.r = J;
                        v8Var.setWillNotDraw(!J);
                        Switch r13 = v8Var.f;
                        if (r13 != null) {
                            r13.setVisibility(8);
                        }
                        v8Var.setValueSticker(str3);
                    } else if (TextUtils.isEmpty(G.n)) {
                        Object obj2 = G.G;
                        if (obj2 instanceof Drawable) {
                            v8Var.p(G.l, (Drawable) obj2, J);
                        } else {
                            int i17 = G.k;
                            if (i17 == 0) {
                                v8Var.k(G.l, J);
                            } else {
                                v8Var.o(i17, G.l, J);
                            }
                        }
                    } else {
                        Object obj3 = G.G;
                        if (obj3 instanceof Drawable) {
                            v8Var.t(G.l, G.n, (Drawable) obj3, J);
                        } else {
                            int i18 = G.k;
                            if (i18 == 0) {
                                v8Var.q(G.l, G.n, false, J);
                            } else {
                                v8Var.u(G.l, G.n, false, i18, J);
                            }
                        }
                    }
                    if (G.q) {
                        int i19 = org.telegram.ui.ActionBar.y6.q6;
                        v8Var.g(i19, i19);
                    } else if (G.r) {
                        v8Var.g(org.telegram.ui.ActionBar.y6.q7, org.telegram.ui.ActionBar.y6.p7);
                    } else {
                        v8Var.g(org.telegram.ui.ActionBar.y6.m6, org.telegram.ui.ActionBar.y6.G6);
                    }
                    v8Var.h(45, G.t, true);
                    v8Var.i(G.g, true);
                    break;
                case 4:
                case 9:
                    org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                    if (a9Var.b == G.d) {
                        a9Var.setChecked(G.e);
                    }
                    a9Var.e(null, G.g);
                    a9Var.f(G.l, G.e, J);
                    a9Var.b = G.d;
                    if (i13 == 9) {
                        org.telegram.ui.ActionBar.f7.i(G.e ? org.telegram.ui.ActionBar.y6.f6 : org.telegram.ui.ActionBar.y6.e6, view, null);
                        break;
                    }
                    break;
                case 5:
                    org.telegram.ui.Cells.n5 n5Var = (org.telegram.ui.Cells.n5) view;
                    CharSequence charSequence5 = G.m;
                    n5Var.b(G.l, G.m, 0, G.e, 0, charSequence5 != null && charSequence5.toString().contains("\n"), J, false);
                    break;
                case 6:
                    ((org.telegram.ui.Cells.n5) view).b(G.l, G.m, 0, G.e, 0, false, J, false);
                    break;
                case 7:
                case 8:
                case 38:
                    if (i13 == 7 || i13 == 8) {
                        org.telegram.ui.Cells.i9 i9Var2 = (org.telegram.ui.Cells.i9) view;
                        if (TextUtils.isEmpty(G.l)) {
                            i9Var2.setFixedSize(i13 == 8 ? 220 : 12);
                            i9Var2.setText("");
                        } else {
                            i9Var2.setFixedSize(0);
                            i9Var2.setText(G.l);
                        }
                        if (G.q) {
                            i9Var2.setTextGravity(17);
                            i9Var2.getTextView().setWidth(Math.min(fi.v3.a(i9Var2.getText(), i9Var2.getTextView().getPaint()), AndroidUtilities.displaySize.x - AndroidUtilities.dp(60.0f)));
                            i9Var2.getTextView().setPadding(0, AndroidUtilities.dp(17.0f), 0, AndroidUtilities.dp(17.0f));
                            i9Var = i9Var2;
                        } else {
                            i9Var2.setTextGravity(8388611);
                            i9Var2.getTextView().setMinWidth(0);
                            i9Var2.getTextView().setMaxWidth(AndroidUtilities.displaySize.x);
                            i9Var2.getTextView().setPadding(0, AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(17.0f));
                            i9Var = i9Var2;
                        }
                    } else if (i13 == 38) {
                        org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) view;
                        CharSequence charSequence6 = G.o;
                        boolean z11 = G.f;
                        z1Var.a.setText(charSequence6);
                        View view5 = z1Var.b;
                        view5.animate().cancel();
                        view5.animate().rotation(z11 ? 0.0f : 180.0f).setDuration(340L).setInterpolator(ds.h).start();
                        if (G.q) {
                            z1Var.setColor(org.telegram.ui.ActionBar.y6.q6);
                            i9Var = z1Var;
                        } else if (G.r) {
                            z1Var.setColor(org.telegram.ui.ActionBar.y6.p7);
                            i9Var = z1Var;
                        } else {
                            z1Var.setColor(org.telegram.ui.ActionBar.y6.G6);
                            i9Var = z1Var;
                        }
                    } else {
                        i9Var = null;
                    }
                    boolean z12 = (G3 == null || K(G3.a)) ? false : true;
                    boolean z13 = (G2 == null || K(G2.a)) ? false : true;
                    if (!nm0Var.b1()) {
                        Drawable W0 = org.telegram.ui.ActionBar.y6.W0(this.e, (z12 && z13) ? R.drawable.greydivider : z12 ? R.drawable.greydivider_bottom : z13 ? R.drawable.greydivider_top : R.drawable.field_carret_empty, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.b7, u6Var));
                        if (!this.n) {
                            i9Var.setBackground(W0);
                            break;
                        } else {
                            int i20 = org.telegram.ui.ActionBar.y6.i5;
                            i9Var.setBackground(new LayerDrawable(new Drawable[]{I(i20) == org.telegram.ui.ActionBar.y6.w0(i20, u6Var) ? new i71(i20, u6Var) : new ColorDrawable(I(i20)), W0}));
                            break;
                        }
                    } else {
                        i9Var.setBackground(null);
                        break;
                    }
                    break;
                case 10:
                    org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
                    int i21 = r2Var.a;
                    TextView textView = r2Var.b;
                    TextView textView2 = r2Var.c;
                    RadioButton radioButton = r2Var.d;
                    if (i21 == G.d) {
                        radioButton.a(G.e, true);
                        r2Var.a(G.g, true);
                        r14 = 0;
                    } else {
                        r14 = 0;
                        r2Var.a(G.g, false);
                    }
                    if (TextUtils.isEmpty(G.n)) {
                        CharSequence charSequence7 = G.l;
                        boolean z14 = G.e;
                        textView2.setVisibility(8);
                        textView.setText(charSequence7);
                        radioButton.a(z14, r14);
                        r2Var.e = J;
                        r2Var.b();
                        r2Var.setWillNotDraw(!J);
                    } else {
                        CharSequence charSequence8 = G.l;
                        CharSequence charSequence9 = G.n;
                        boolean z15 = G.e;
                        textView2.setVisibility(r14);
                        textView2.setText(charSequence9);
                        textView.setText(charSequence8);
                        radioButton.a(z15, r14);
                        r2Var.e = J;
                        r2Var.b();
                        r2Var.setWillNotDraw(!J);
                    }
                    r2Var.a = G.d;
                    break;
                case 11:
                case 12:
                    org.telegram.ui.Cells.ab abVar = (org.telegram.ui.Cells.ab) view;
                    abVar.g(i12, G, J);
                    if (i13 == 12) {
                        abVar.c(G.e, false);
                        break;
                    }
                    break;
                case 13:
                    org.telegram.ui.Cells.ab abVar2 = (org.telegram.ui.Cells.ab) view;
                    abVar2.g(i12, G, J);
                    CharSequence charSequence10 = G.n;
                    abVar2.setQuery(charSequence10 == null ? null : charSequence10.toString().toLowerCase());
                    abVar2.setAddButtonVisible(!G.e);
                    abVar2.setCloseIcon(G.D);
                    break;
                case 14:
                    ax0 ax0Var = (ax0) view;
                    ax0Var.b(G.z, null, G.p);
                    ax0Var.setMinAllowedIndex((int) G.B);
                    ax0Var.setCallback(new tv(G, 28));
                    break;
                case 15:
                    org.telegram.ui.Cells.c8 c8Var = (org.telegram.ui.Cells.c8) view;
                    c8Var.d(G.z, (org.telegram.ui.Cells.b8) G.G, G.C);
                    c8Var.setMinValueAllowed((int) G.B);
                    break;
                case 16:
                    jg.y1 y1Var = (jg.y1) view;
                    y1Var.d.a(G.e, false);
                    y1Var.setReorder(this.N);
                    Object obj4 = G.G;
                    if (obj4 instanceof jg.b2) {
                        y1Var.a((jg.b2) obj4, null, J);
                        break;
                    }
                    break;
                case 17:
                    jg.w1 w1Var = (jg.w1) view;
                    w1Var.e.a(G.e, false);
                    Object obj5 = G.G;
                    if (obj5 instanceof jg.b2) {
                        jg.b2 b2Var = (jg.b2) obj5;
                        j9 j9Var = w1Var.a;
                        int[] iArr = w1Var.r;
                        TextView textView3 = w1Var.d;
                        ImageReceiver imageReceiver2 = w1Var.b;
                        int i22 = UserConfig.selectedAccount;
                        w1Var.c.setText(MessagesController.getInstance(i22).getPeerName(UserConfig.getInstance(i22).getClientUserId()));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        MessageObject messageObject = b2Var.e;
                        if (messageObject != null) {
                            spannableStringBuilder.append(Emoji.replaceEmoji(messageObject.messageText, textView3.getPaint().getFontMetricsInt(), false));
                        }
                        if (b2Var.a() > 1) {
                            spannableStringBuilder.append((CharSequence) "  ");
                            int dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(80.0f);
                            int a2 = b2Var.a() - 1;
                            int i23 = jg.x1.d;
                            SpannableString spannableString = new SpannableString("+");
                            jg.x1 x1Var = new jg.x1(a2);
                            iArr[0] = (int) (((r11) x1Var.c).c + AndroidUtilities.dp(10.0f));
                            imageReceiver = imageReceiver2;
                            spannableString.setSpan(x1Var, 0, spannableString.length(), 33);
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
                        TLRPC.MessageMedia media = MessageObject.getMedia(b2Var.e);
                        if (media == null || (photo = media.photo) == null) {
                            ImageReceiver imageReceiver3 = imageReceiver;
                            if (media == null || (document = media.document) == null) {
                                j9Var.r(UserConfig.getInstance(i22).getCurrentUser());
                                imageReceiver3.setForUserOrChat(UserConfig.getInstance(i22).getCurrentUser(), j9Var);
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
                                MessageObject messageObject2 = b2Var.e;
                                imageReceiver3.setImage(imageLocation, str2, messageObject2.strippedThumb, j14, (String) null, messageObject2, 0);
                                imageReceiver3.setRoundRadius(AndroidUtilities.dp(6.0f));
                            }
                        } else {
                            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(36.0f), true, null, true);
                            ImageLocation forObject2 = ImageLocation.getForObject(closestPhotoSizeWithSize2, media.photo);
                            MessageObject messageObject3 = b2Var.e;
                            ImageReceiver imageReceiver4 = imageReceiver;
                            imageReceiver4.setImage(forObject2, "36_36", messageObject3.strippedThumb, closestPhotoSizeWithSize2 == null ? 0L : closestPhotoSizeWithSize2.size, (String) null, messageObject3, 0);
                            imageReceiver4.setRoundRadius(AndroidUtilities.dp(6.0f));
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
                    org.telegram.ui.w91 w91Var = (org.telegram.ui.w91) view;
                    int i24 = G.z;
                    org.telegram.ui.k91 k91Var = (org.telegram.ui.k91) G.G;
                    org.telegram.ui.rh rhVar = new org.telegram.ui.rh(i14, this, G);
                    w91Var.x = i24;
                    w91Var.y = rhVar;
                    w91Var.e(k91Var, false);
                    break;
                case 24:
                    ((org.telegram.ui.ie) view).set((org.telegram.ui.he) G.G);
                    break;
                case 25:
                    org.telegram.ui.je jeVar = (org.telegram.ui.je) view;
                    TL_stats.BroadcastRevenueTransaction broadcastRevenueTransaction = (TL_stats.BroadcastRevenueTransaction) G.G;
                    b6 b6Var3 = jeVar.b;
                    org.telegram.ui.ActionBar.u6 u6Var2 = jeVar.a;
                    TextView textView4 = jeVar.c;
                    TextView textView5 = jeVar.d;
                    if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionWithdrawal) {
                        TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
                        textView4.setText(LocaleController.getString(R.string.MonetizationTransactionWithdraw));
                        if (tL_broadcastRevenueTransactionWithdrawal.pending) {
                            textView5.setText(LocaleController.getString(R.string.MonetizationTransactionPending));
                            z10 = false;
                            u61Var = G;
                        } else {
                            z10 = tL_broadcastRevenueTransactionWithdrawal.failed;
                            StringBuilder sb2 = new StringBuilder();
                            u61Var = G;
                            sb2.append(LocaleController.formatShortDateTime(tL_broadcastRevenueTransactionWithdrawal.date));
                            sb2.append(z10 ? org.telegram.messenger.t.h(R.string.MonetizationTransactionNotCompleted, new StringBuilder(" — ")) : "");
                            textView5.setText(sb2.toString());
                        }
                        j11 = tL_broadcastRevenueTransactionWithdrawal.amount;
                        c10 = 65535;
                    } else {
                        u61Var = G;
                        if (!(broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionProceeds)) {
                            if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionRefund) {
                                textView4.setText(LocaleController.getString(R.string.MonetizationTransactionRefund));
                                textView5.setText(LocaleController.formatShortDateTime(r5.from_date));
                                j11 = ((TL_stats.TL_broadcastRevenueTransactionRefund) broadcastRevenueTransaction).amount;
                            }
                            G = u61Var;
                            break;
                        } else {
                            textView4.setText(LocaleController.getString(R.string.MonetizationTransactionProceed));
                            textView5.setText(LocaleController.formatShortDateTime(r5.from_date) + " - " + LocaleController.formatShortDateTime(r5.to_date));
                            j11 = ((TL_stats.TL_broadcastRevenueTransactionProceeds) broadcastRevenueTransaction).amount;
                        }
                        z10 = false;
                        c10 = 1;
                    }
                    org.telegram.ui.ActionBar.f7.V(textView5, z10 ? org.telegram.ui.ActionBar.y6.p7 : org.telegram.ui.ActionBar.y6.y6, u6Var2);
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                    spannableStringBuilder3.append((CharSequence) (c10 < 0 ? "-" : "+"));
                    spannableStringBuilder3.append((CharSequence) "TON ");
                    spannableStringBuilder3.append((CharSequence) jeVar.e.format(Math.abs(j11) / 1.0E9d));
                    int indexOf = TextUtils.indexOf(spannableStringBuilder3, ".");
                    if (indexOf >= 0) {
                        spannableStringBuilder3.setSpan(new RelativeSizeSpan(1.15f), 0, indexOf + 1, 33);
                    }
                    b6Var3.setText(org.telegram.ui.ke.K(spannableStringBuilder3, b6Var3.getPaint(), 1.1f, AndroidUtilities.dp(0.33f), false));
                    org.telegram.ui.ActionBar.f7.V(b6Var3, c10 < 0 ? org.telegram.ui.ActionBar.y6.q7 : org.telegram.ui.ActionBar.y6.l8, u6Var2);
                    jeVar.f = J;
                    jeVar.setWillNotDraw(!J);
                    G = u61Var;
                case 27:
                    fi.m9 m9Var = (fi.m9) view;
                    long j15 = m9Var.x;
                    Object obj6 = G.G;
                    if (!(obj6 instanceof TLRPC.User)) {
                        if (obj6 instanceof TLRPC.Chat) {
                            j12 = -((TLRPC.Chat) obj6).id;
                        }
                        boolean z16 = j15 != j13;
                        m9Var.d(false, true);
                        m9Var.set(G.G);
                        m9Var.f.setVisibility(8);
                        m9Var.h.setVisibility(0);
                        m9Var.c(G.e, z16);
                        m9Var.setDivider(J);
                        break;
                    } else {
                        j12 = ((TLRPC.User) obj6).id;
                    }
                    j13 = j12;
                    if (j15 != j13) {
                    }
                    m9Var.d(false, true);
                    m9Var.set(G.G);
                    m9Var.f.setVisibility(8);
                    m9Var.h.setVisibility(0);
                    m9Var.c(G.e, z16);
                    m9Var.setDivider(J);
                case 28:
                    if (G.s) {
                        org.telegram.ui.ActionBar.f7.r(view);
                        view.setBackgroundColor(0);
                    } else if (G.k != 0) {
                        org.telegram.ui.ActionBar.f7.r(view);
                        view.setBackgroundColor(G.k);
                    }
                    view.setId(G.d);
                    ((h71) view).setHeight(G.z);
                    break;
                case 29:
                    jg.u uVar = (jg.u) view;
                    Object obj7 = G.G;
                    if (obj7 instanceof jg.v) {
                        org.telegram.ui.ActionBar.b6 b6Var4 = uVar.a;
                        org.telegram.ui.ActionBar.b6 b6Var5 = uVar.c;
                        xh.n nVar = uVar.b;
                        uVar.e = J;
                        TL_account.TL_businessChatLink tL_businessChatLink = ((jg.v) obj7).a;
                        uVar.f = tL_businessChatLink;
                        if (TextUtils.isEmpty(tL_businessChatLink.title)) {
                            String str4 = uVar.f.link;
                            jg.z[] zVarArr = jg.z.e;
                            if (str4.startsWith("https://")) {
                                str4 = str4.substring(8);
                            }
                            b6Var4.l(str4, false);
                        } else {
                            b6Var4.l(uVar.f.title, false);
                        }
                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(uVar.f.message);
                        TL_account.TL_businessChatLink tL_businessChatLink2 = uVar.f;
                        MediaDataController.addTextStyleRuns(tL_businessChatLink2.entities, tL_businessChatLink2.message, spannableStringBuilder4);
                        CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder4, nVar.getPaint().getFontMetricsInt(), false);
                        MessageObject.replaceAnimatedEmoji(replaceEmoji, uVar.f.entities, nVar.getPaint().getFontMetricsInt());
                        nVar.setText(replaceEmoji);
                        int i25 = uVar.f.views;
                        if (i25 == 0) {
                            b6Var5.l(LocaleController.formatString(R.string.NoClicks, new Object[0]), false);
                        } else {
                            b6Var5.l(LocaleController.formatPluralString("Clicks", i25, new Object[0]), false);
                        }
                        b6Var5.requestLayout();
                        uVar.invalidate();
                        break;
                    }
                    break;
                case MessageObject.TYPE_GIFT_STARS /* 30 */:
                    org.telegram.ui.Cells.l9 l9Var = (org.telegram.ui.Cells.l9) view;
                    CharSequence charSequence11 = G.l;
                    int i26 = G.k;
                    l9Var.b.l(charSequence11, false);
                    l9Var.a.setImageResource(i26);
                    l9Var.setDivider(J);
                    org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.h5, l9Var, this.O);
                    break;
                case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                    org.telegram.ui.Cells.z3 z3Var = (org.telegram.ui.Cells.z3) view;
                    if (!TextUtils.equals(z3Var.getText(), G.l)) {
                        z3Var.b(G.l, G.m, G.D);
                        break;
                    } else {
                        z3Var.a(G.m, G.D);
                        break;
                    }
                case 32:
                    org.telegram.ui.Cells.m6 m6Var = (org.telegram.ui.Cells.m6) view;
                    Object obj8 = G.G;
                    if (G.q && (obj8 instanceof TLRPC.User) && (i11 = ((TLRPC.User) obj8).bot_active_users) != 0) {
                        if (i11 != 0) {
                            concat = LocaleController.formatPluralStringSpaced("BotUsers", i11);
                            if (!(obj8 instanceof TLRPC.Chat)) {
                            }
                            String str5 = str;
                            boolean z17 = G.t;
                            Object obj9 = G.H;
                            if (obj9 instanceof Utilities.Callback) {
                            }
                            m6Var.B0 = z17;
                            m6Var.C0 = r11;
                            m6Var.setRectangularAvatar(G.r);
                            CharSequence charSequence12 = G.m;
                            m6Var.s(obj8, null, str5, charSequence12 == null ? charSequence12 : concat, false, false);
                            m6Var.r(G.e, false);
                            m6Var.M = J;
                        }
                        concat = "";
                        if (!(obj8 instanceof TLRPC.Chat)) {
                        }
                        String str52 = str;
                        boolean z172 = G.t;
                        Object obj92 = G.H;
                        if (obj92 instanceof Utilities.Callback) {
                        }
                        m6Var.B0 = z172;
                        m6Var.C0 = r11;
                        m6Var.setRectangularAvatar(G.r);
                        CharSequence charSequence122 = G.m;
                        m6Var.s(obj8, null, str52, charSequence122 == null ? charSequence122 : concat, false, false);
                        m6Var.r(G.e, false);
                        m6Var.M = J;
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
                                boolean z1722 = G.t;
                                Object obj922 = G.H;
                                Utilities.Callback callback = obj922 instanceof Utilities.Callback ? (Utilities.Callback) obj922 : null;
                                m6Var.B0 = z1722;
                                m6Var.C0 = callback;
                                m6Var.setRectangularAvatar(G.r);
                                CharSequence charSequence1222 = G.m;
                                m6Var.s(obj8, null, str522, charSequence1222 == null ? charSequence1222 : concat, false, false);
                                m6Var.r(G.e, false);
                                m6Var.M = J;
                                break;
                            }
                        }
                        concat = "";
                        if (!(obj8 instanceof TLRPC.Chat)) {
                        }
                        String str5222 = str;
                        boolean z17222 = G.t;
                        Object obj9222 = G.H;
                        if (obj9222 instanceof Utilities.Callback) {
                        }
                        m6Var.B0 = z17222;
                        m6Var.C0 = callback;
                        m6Var.setRectangularAvatar(G.r);
                        CharSequence charSequence12222 = G.m;
                        m6Var.s(obj8, null, str5222, charSequence12222 == null ? charSequence12222 : concat, false, false);
                        m6Var.r(G.e, false);
                        m6Var.M = J;
                    }
                    break;
                case 33:
                    org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) view;
                    Object obj10 = G.G;
                    MessageObject messageObject4 = obj10 instanceof MessageObject ? (MessageObject) obj10 : null;
                    p2Var.s2 = J;
                    if (messageObject4 != null) {
                        p2Var.V(messageObject4.getDialogId(), messageObject4, messageObject4.messageOwner.date, false, false);
                        break;
                    } else {
                        p2Var.V(0L, null, 0, false, false);
                        break;
                    }
                case 34:
                    ((c10) view).setViewType(G.z);
                    break;
                case 35:
                case 36:
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    org.telegram.ui.Cells.y1 y1Var2 = (org.telegram.ui.Cells.y1) view;
                    y1Var2.setPad(G.i);
                    y1Var2.e(G.l, "", G.e, J, y1Var2.a == G.d);
                    y1Var2.a = G.d;
                    y1Var2.setIcon(G.t ? R.drawable.permission_locked : 0);
                    if (i13 == 36 || i13 == 41) {
                        boolean z18 = G.f;
                        CharSequence charSequence13 = G.o;
                        View.OnClickListener onClickListener = G.D;
                        org.telegram.ui.Cells.x1 x1Var2 = y1Var2.v;
                        if (x1Var2 != null) {
                            s6 s6Var3 = x1Var2.b;
                            s6Var3.a();
                            s6Var3.setText(charSequence13);
                            View view6 = x1Var2.c;
                            view6.animate().cancel();
                            view6.animate().rotation(z18 ? 0.0f : 180.0f).setDuration(340L).setInterpolator(ds.h).start();
                            if (onClickListener != null) {
                                x1Var2.setOnClickListener(onClickListener);
                                break;
                            }
                        }
                    }
                    break;
                case 37:
                    org.telegram.ui.Cells.y1 y1Var3 = (org.telegram.ui.Cells.y1) view;
                    y1Var3.setPad(G.i);
                    y1Var3.setUserOrChat((TLObject) G.G);
                    y1Var3.c(G.e, y1Var3.a == G.d);
                    y1Var3.a = G.d;
                    y1Var3.setNeedDivider(J);
                    break;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                    z8Var.d(G.l.toString(), G.e, J, z8Var.a == G.d);
                    z8Var.getCheckBox().setDrawIconType(G.z);
                    Switch checkBox = z8Var.getCheckBox();
                    int i27 = G.z == 0 ? org.telegram.ui.ActionBar.y6.M6 : org.telegram.ui.ActionBar.y6.r7;
                    int i28 = org.telegram.ui.ActionBar.y6.N6;
                    int i29 = org.telegram.ui.ActionBar.y6.d6;
                    checkBox.d(i27, i28, i29, i29);
                    z8Var.a = G.d;
                    z8Var.setIcon(G.t ? R.drawable.permission_locked : 0);
                    if (i13 == 40) {
                        if (!TextUtils.isEmpty(G.o)) {
                            z8Var.a(new d71(i14, G, z8Var), G.o.toString(), G.f);
                            break;
                        } else {
                            LinearLayout linearLayout = z8Var.f;
                            if (linearLayout != null) {
                                linearLayout.setVisibility(8);
                                break;
                            }
                        }
                    }
                    break;
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    org.telegram.ui.Cells.q4 q4Var2 = (org.telegram.ui.Cells.q4) view;
                    q4Var2.c(G.o, q4Var2.a == G.d);
                    q4Var2.a = G.d;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) view;
                    gaVar.getValueBackupImageView().setImageDrawable(null);
                    CharSequence charSequence14 = G.l;
                    if (charSequence14 != null) {
                        CharSequence charSequence15 = G.m;
                        if (charSequence15 != null) {
                            gaVar.c(charSequence14, charSequence15, false, J);
                        } else {
                            gaVar.b(charSequence14, J);
                        }
                    }
                    gaVar.setIcon(G.k);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    ((org.telegram.ui.Cells.n6) view).b(G.l.toString(), G.n.toString(), J, G.e);
                    break;
            }
        } else {
            t61 G4 = u61.G(i13);
            if (G4 != null) {
                G4.bindView(e1Var.a, G, J, this, nm0Var instanceof s71 ? (s71) nm0Var : null);
            }
        }
        Utilities.Callback callback2 = G.F;
        if (callback2 != null) {
            callback2.run(view);
        }
    }

    @Override // s4.h0
    public s4.e1 x(ViewGroup viewGroup, int i10) {
        View sm0Var;
        View q4Var;
        org.telegram.ui.Cells.a9 a9Var;
        View view;
        int i11;
        View view2;
        boolean z10 = this.n;
        int i12 = z10 ? org.telegram.ui.ActionBar.y6.h5 : org.telegram.ui.ActionBar.y6.d6;
        Context context = this.e;
        if (i10 < 10000) {
            int i13 = 8;
            org.telegram.ui.ActionBar.u6 u6Var = this.w;
            switch (i10) {
                case -5:
                    sm0Var = new sm0(context);
                    sm0Var.setTag(-33024);
                    view = sm0Var;
                    break;
                case -4:
                case -1:
                    sm0Var = new di.i4(context, 20);
                    if (i10 == -4) {
                        sm0Var.setTag(-33024);
                    }
                    view = sm0Var;
                    break;
                case -3:
                    f71 f71Var = new f71(context);
                    f71Var.a = 0;
                    view = f71Var;
                    break;
                case -2:
                    view = new di.i4(context, 21);
                    break;
                case 0:
                    if (!z10) {
                        view = new org.telegram.ui.Cells.q4(context, u6Var);
                        break;
                    } else {
                        q4Var = new org.telegram.ui.Cells.q4(this.e, org.telegram.ui.ActionBar.y6.L6, 21, 15, 0, false, false, this.w);
                        view = q4Var;
                        break;
                    }
                case 1:
                    view2 = new org.telegram.ui.Cells.q4(this.e, org.telegram.ui.ActionBar.y6.G6, 17, 15, false, this.w);
                    view = view2;
                    break;
                case 2:
                    view = new k31(context, u6Var);
                    break;
                case 3:
                    org.telegram.ui.Cells.v8 v8Var = new org.telegram.ui.Cells.v8(context, u6Var);
                    v8Var.setCompactLayout(this.s);
                    view = v8Var;
                    break;
                case 4:
                case 9:
                    org.telegram.ui.Cells.a9 a9Var2 = new org.telegram.ui.Cells.a9(context, u6Var);
                    if (i10 == 9) {
                        a9Var2.setDrawCheckRipple(true);
                        a9Var = a9Var2;
                        a9Var.d(org.telegram.ui.ActionBar.y6.g6, org.telegram.ui.ActionBar.y6.O6, org.telegram.ui.ActionBar.y6.P6, org.telegram.ui.ActionBar.y6.Q6, org.telegram.ui.ActionBar.y6.R6);
                        a9Var.setTypeface(AndroidUtilities.bold());
                        a9Var.setHeight(56);
                    } else {
                        a9Var = a9Var2;
                    }
                    view = a9Var;
                    break;
                case 5:
                case 6:
                    q4Var = new org.telegram.ui.Cells.n5(21, 60, this.e, this.w, i10 == 6);
                    view = q4Var;
                    break;
                case 7:
                case 8:
                default:
                    view = new org.telegram.ui.Cells.i9(context, u6Var);
                    break;
                case 10:
                    org.telegram.ui.Cells.r2 r2Var = new org.telegram.ui.Cells.r2(context);
                    r2Var.f = 23;
                    TextView textView = new TextView(context);
                    r2Var.b = textView;
                    org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.G6, null);
                    org.telegram.messenger.wh.r(textView, 1, 16.0f, 1, 1);
                    textView.setSingleLine(true);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView.setEllipsize(truncateAt);
                    textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                    boolean z11 = LocaleController.isRTL;
                    r2Var.addView(textView, kb1.h(-1, -1.0f, (z11 ? 5 : 3) | 48, z11 ? 61.0f : 23.0f, 0.0f, z11 ? 23.0f : 61.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    r2Var.c = textView2;
                    org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.I6, null);
                    org.telegram.messenger.wh.r(textView2, 1, 16.0f, 1, 1);
                    textView2.setSingleLine(true);
                    textView2.setEllipsize(truncateAt);
                    textView2.setGravity((LocaleController.isRTL ? 3 : 5) | 16);
                    textView2.setVisibility(8);
                    r2Var.addView(textView2, kb1.h(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 23.0f, 0.0f, 23.0f, 0.0f));
                    RadioButton radioButton = new RadioButton(context);
                    r2Var.d = radioButton;
                    radioButton.setSize(AndroidUtilities.dp(20.0f));
                    org.telegram.ui.ActionBar.f7.P(radioButton, org.telegram.ui.ActionBar.y6.g7, org.telegram.ui.ActionBar.y6.h7, null);
                    r2Var.addView(radioButton, kb1.h(22, 22.0f, (LocaleController.isRTL ? 3 : 5) | 48, 20.0f, 15.0f, 20.0f, 0.0f));
                    r2Var.b();
                    r2Var.setHorizontalPadding(21);
                    view = r2Var;
                    break;
                case 11:
                case 12:
                    org.telegram.ui.Cells.ab abVar = new org.telegram.ui.Cells.ab(context, 6, i10 != 12 ? 0 : 3, false);
                    abVar.setSelfAsSavedMessages(true);
                    view = abVar;
                    break;
                case 13:
                    view2 = new org.telegram.ui.Cells.ab(6, 0, this.e, null, false, true);
                    view = view2;
                    break;
                case 14:
                    view = new ax0(context, u6Var);
                    break;
                case 15:
                    view = new org.telegram.ui.Cells.c8(context, u6Var);
                    break;
                case 16:
                    view = new jg.y1(context, u6Var, this.M != null);
                    break;
                case 17:
                    view = new jg.w1(context, u6Var);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    if (this.E == null) {
                        this.E = new kg.g(null);
                    }
                    view = new org.telegram.ui.w91(this.e, this.f, i10 - 18, this.E, this.h);
                    break;
                case 24:
                    view = new org.telegram.ui.ie(context, u6Var);
                    break;
                case 25:
                    view = new org.telegram.ui.je(context, u6Var);
                    break;
                case 26:
                    org.telegram.ui.Cells.q4 q4Var2 = new org.telegram.ui.Cells.q4(this.e, org.telegram.ui.ActionBar.y6.G6, 23, 20, 0, false, false, this.w);
                    q4Var2.setTextSize(20.0f);
                    view2 = q4Var2;
                    view = view2;
                    break;
                case 27:
                    fi.m9 m9Var = new fi.m9(context, u6Var);
                    m9Var.d(false, false);
                    view = m9Var;
                    break;
                case 28:
                    sm0Var = new h71(context);
                    sm0Var.setTag(-33024);
                    view = sm0Var;
                    break;
                case 29:
                    view = new jg.u(context, u6Var);
                    break;
                case MessageObject.TYPE_GIFT_STARS /* 30 */:
                    view = new org.telegram.ui.Cells.l9(context, u6Var);
                    break;
                case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                    nm0 nm0Var = this.d;
                    if (nm0Var != null && nm0Var.b1()) {
                        org.telegram.ui.Cells.z3 z3Var = new org.telegram.ui.Cells.z3(context, 28, u6Var);
                        z3Var.setNoBackground(true);
                        view = z3Var;
                        break;
                    } else {
                        view = new org.telegram.ui.Cells.z3(context, u6Var);
                        break;
                    }
                    break;
                case 32:
                    view = new org.telegram.ui.Cells.m6(context, null);
                    break;
                case 33:
                    view = new org.telegram.ui.Cells.p2(context, true);
                    break;
                case 34:
                    c10 c10Var = new c10(context, u6Var);
                    c10Var.setIsSingleCell(true);
                    view = c10Var;
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
                        org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(i11, 21, this.e, this.w, true);
                        y1Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.y6.V6, org.telegram.ui.ActionBar.y6.g7, org.telegram.ui.ActionBar.y6.k7);
                        view = y1Var;
                        break;
                    } else {
                        i13 = 4;
                    }
                    i11 = i13;
                    org.telegram.ui.Cells.y1 y1Var2 = new org.telegram.ui.Cells.y1(i11, 21, this.e, this.w, true);
                    y1Var2.getCheckBoxRound().b(org.telegram.ui.ActionBar.y6.V6, org.telegram.ui.ActionBar.y6.g7, org.telegram.ui.ActionBar.y6.k7);
                    view = y1Var2;
                case 38:
                    view = new org.telegram.ui.Cells.z1(context, u6Var);
                    break;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    view = new org.telegram.ui.Cells.z8(context);
                    break;
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    view2 = new org.telegram.ui.Cells.q4(this.e, org.telegram.ui.ActionBar.y6.L6, 21, 15, 0, false, true, this.w);
                    view = view2;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    view = new org.telegram.ui.Cells.ga(context, 0, u6Var);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    view = new org.telegram.ui.Cells.n6(context, false);
                    break;
            }
        } else {
            t61 G = u61.G(i10);
            view = G != null ? G.createView(this.e, this.d, this.f, this.h, this.w) : new View(context);
        }
        if (N(i10)) {
            org.telegram.ui.ActionBar.f7.i(i12, view, this.O);
        }
        return new wl0(view);
    }

    @Override // s4.h0
    public void y(s4.e1 e1Var) {
        R(e1Var, this.N);
        P(e1Var);
    }
}
