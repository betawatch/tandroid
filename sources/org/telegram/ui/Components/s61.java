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

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public class s61 extends pg.b {
    public q61 H;
    public q61 I;
    public int J;
    public boolean K;
    public Utilities.Callback2 L;
    public boolean M;
    public final im0 d;
    public final Context e;
    public final int f;
    public final int h;
    public final boolean n;
    public Utilities.Callback2 s;
    public final org.telegram.ui.ActionBar.d6 v;
    public jg.f y;
    public boolean r = true;
    public final ArrayList w = new ArrayList();
    public final ArrayList x = new ArrayList();
    public int E = 0;
    public final ArrayList F = new ArrayList();
    public final ArrayList G = new ArrayList();

    public s61(im0 im0Var, Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, org.telegram.ui.ActionBar.d6 d6Var) {
        this.d = im0Var;
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
        e61 F = f61.F(i10);
        return F != null && F.isShadow();
    }

    @Override // org.telegram.ui.Components.hm0
    public boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f;
        f61 G = G(b1Var.b());
        if (i10 >= 10000) {
            e61 F = f61.F(i10);
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
            q61 q61Var = (q61) arrayList.get(i10);
            this.L.run(Integer.valueOf(i10), new ArrayList(this.x.subList(q61Var.a, q61Var.b + 1)));
            this.K = false;
        }
    }

    public final f61 G(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = this.x;
        if (i10 >= arrayList.size()) {
            return null;
        }
        return (f61) arrayList.get(i10);
    }

    public final int H(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.G;
            if (i11 >= arrayList.size()) {
                return -1;
            }
            q61 q61Var = (q61) arrayList.get(i11);
            if (i10 >= q61Var.a && i10 <= q61Var.b) {
                return i11;
            }
            i11++;
        }
    }

    public int I(int i10) {
        return org.telegram.ui.ActionBar.h6.w0(i10, this.v);
    }

    public final boolean J(int i10) {
        f61 G = G(i10);
        f61 G2 = G(i10 + 1);
        return (G == null || G.j || G2 == null || K(G2.a) != K(G.a)) ? false : true;
    }

    public final void L() {
        q61 q61Var = this.I;
        if (q61Var != null) {
            q61Var.b = Math.max(0, this.x.size() - 1);
        }
    }

    public final int M() {
        q61 q61Var = new q61();
        this.I = q61Var;
        q61Var.a = this.x.size();
        q61 q61Var2 = this.I;
        q61Var2.b = -1;
        this.G.add(q61Var2);
        return r1.size() - 1;
    }

    public void N(boolean z10) {
        im0 im0Var = this.d;
        if (im0Var == null || !im0Var.b0()) {
            P(z10);
        } else {
            im0Var.post(new b60(9, this, z10));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void O(s4.b1 b1Var) {
        View view = b1Var.a;
        if (view instanceof org.telegram.ui.ActionBar.y5) {
            ((org.telegram.ui.ActionBar.y5) view).d();
            int i10 = b1Var.f;
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
        im0 im0Var = this.d;
        if (im0Var == null || !im0Var.b0()) {
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
            ((ig.w1) view).setReorder(z10);
        } else {
            e61 F = f61.F(i10);
            if (F != null) {
                F.attachedView(this.d, view, G(b1Var.b()));
            }
        }
    }

    public final void R() {
        im0 im0Var = this.d;
        if (im0Var == null) {
            return;
        }
        ArrayList arrayList = im0Var.I2;
        if (arrayList == null) {
            im0Var.I2 = new ArrayList();
        } else {
            arrayList.clear();
        }
        ArrayList arrayList2 = this.F;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            q61 q61Var = (q61) obj;
            im0Var.I2.add(Long.valueOf(AndroidUtilities.pack(q61Var.a, q61Var.b)));
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
        q61 q61Var = this.H;
        if (q61Var != null) {
            q61Var.b = Math.max(0, (this.x.size() + this.E) - 1);
            q61 q61Var2 = this.H;
            if (q61Var2.a == q61Var2.b) {
                this.F.remove(q61Var2);
            }
            this.H = null;
        }
    }

    public final void U() {
        q61 q61Var = new q61();
        this.H = q61Var;
        q61Var.a = this.x.size() + this.E;
        q61 q61Var2 = this.H;
        q61Var2.b = -1;
        this.F.add(q61Var2);
    }

    @Override // s4.g0
    public final int h() {
        return this.x.size();
    }

    @Override // s4.g0
    public final int j(int i10) {
        f61 G = G(i10);
        if (G == null) {
            return 0;
        }
        return G.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x022d  */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v16 */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void v(s4.b1 b1Var, int i10) {
        String str;
        org.telegram.ui.Cells.d9 d9Var;
        ?? r10;
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
        int i11;
        int i12 = this.f;
        im0 im0Var = this.d;
        f61 G = G(i10);
        f61 G2 = G(i10 + 1);
        f61 G3 = G(i10 - 1);
        if (G == null) {
            return;
        }
        int i13 = b1Var.f;
        View view = b1Var.a;
        boolean J = J(i10);
        O(b1Var);
        if (i13 < 10000) {
            str = "";
            boolean z12 = true;
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
                    p61 p61Var = (p61) view;
                    p61Var.a = G.z;
                    p61Var.b = w7.k6.a(G.y, 1);
                    if (p61Var.getChildCount() != (G.c == null ? 0 : 1) || p61Var.getChildAt(0) != G.c) {
                        p61Var.removeAllViews();
                        View view3 = G.c;
                        if (view3 != null) {
                            AndroidUtilities.removeFromParent(view3);
                            p61Var.addView(G.c, w7.z5.c(-1.0f, -1));
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
                    u21 u21Var = (u21) view;
                    int i14 = G.k;
                    if (i14 == 0) {
                        int i15 = G.z;
                        if (i15 != 0) {
                            u21Var.setEmojiSize(i15);
                        }
                        String charSequence = G.m.toString();
                        String charSequence2 = G.n.toString();
                        u21Var.getClass();
                        MediaDataController.getInstance(UserConfig.selectedAccount).setPlaceholderImage(u21Var.b, charSequence, charSequence2, "90_90");
                    } else if (G.q) {
                        u21Var.setEmojiStatic(i14);
                    } else {
                        u21Var.setEmoji(i14);
                    }
                    if (!TextUtils.isEmpty(G.o)) {
                        u21Var.a(G.l, G.o);
                        break;
                    } else {
                        u21Var.setText(G.l);
                        break;
                    }
                case 3:
                    org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                    Object obj = G.G;
                    if (obj instanceof TLRPC.Document) {
                        CharSequence charSequence3 = G.l;
                        TLRPC.Document document2 = (TLRPC.Document) obj;
                        q8Var.w = 16;
                        q8Var.s = 58;
                        org.telegram.ui.ActionBar.j5 j5Var = q8Var.a;
                        j5Var.l(charSequence3, false);
                        j5Var.i(null);
                        q6 q6Var = q8Var.c;
                        q8Var.M = null;
                        q6Var.c(null, false, true);
                        q8Var.h.setVisibility(8);
                        q6Var.setVisibility(8);
                        q8Var.d.setVisibility(8);
                        xj0 xj0Var = q8Var.e;
                        xj0Var.setVisibility(8);
                        xj0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
                        q8Var.r = J;
                        q8Var.setWillNotDraw(!J);
                        Switch r12 = q8Var.f;
                        if (r12 != null) {
                            r12.setVisibility(8);
                        }
                        q8Var.setValueSticker(document2);
                    } else if (obj instanceof String) {
                        CharSequence charSequence4 = G.l;
                        String str4 = (String) obj;
                        q8Var.w = 16;
                        q8Var.s = 58;
                        org.telegram.ui.ActionBar.j5 j5Var2 = q8Var.a;
                        j5Var2.l(charSequence4, false);
                        j5Var2.i(null);
                        q6 q6Var2 = q8Var.c;
                        q8Var.M = null;
                        q6Var2.c(null, false, true);
                        q8Var.h.setVisibility(8);
                        q6Var2.setVisibility(8);
                        q8Var.d.setVisibility(8);
                        xj0 xj0Var2 = q8Var.e;
                        xj0Var2.setVisibility(8);
                        xj0Var2.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
                        q8Var.r = J;
                        q8Var.setWillNotDraw(!J);
                        Switch r13 = q8Var.f;
                        if (r13 != null) {
                            r13.setVisibility(8);
                        }
                        q8Var.setValueSticker(str4);
                    } else if (TextUtils.isEmpty(G.n)) {
                        Object obj2 = G.G;
                        if (obj2 instanceof Drawable) {
                            q8Var.n(G.l, (Drawable) obj2, J);
                        } else {
                            int i16 = G.k;
                            if (i16 == 0) {
                                q8Var.i(G.l, J);
                            } else {
                                q8Var.m(i16, G.l, J);
                            }
                        }
                    } else {
                        Object obj3 = G.G;
                        if (obj3 instanceof Drawable) {
                            q8Var.r(G.l, G.n, (Drawable) obj3, J);
                        } else {
                            int i17 = G.k;
                            if (i17 == 0) {
                                q8Var.o(G.l, G.n, false, J);
                            } else {
                                q8Var.s(G.l, G.n, false, i17, J);
                            }
                        }
                    }
                    if (G.q) {
                        int i18 = org.telegram.ui.ActionBar.h6.q6;
                        q8Var.e(i18, i18);
                    } else if (G.r) {
                        q8Var.e(org.telegram.ui.ActionBar.h6.q7, org.telegram.ui.ActionBar.h6.p7);
                    } else {
                        q8Var.e(org.telegram.ui.ActionBar.h6.m6, org.telegram.ui.ActionBar.h6.G6);
                    }
                    q8Var.f(45, G.t, true);
                    q8Var.g(G.g);
                    break;
                case 4:
                case 9:
                    org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
                    if (v8Var.b == G.d) {
                        v8Var.setChecked(G.e);
                    }
                    v8Var.e(null, G.g);
                    v8Var.f(G.l, G.e, J);
                    v8Var.b = G.d;
                    if (i13 == 9) {
                        view.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, G.e ? org.telegram.ui.ActionBar.h6.f6 : org.telegram.ui.ActionBar.h6.e6, false));
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
                        org.telegram.ui.Cells.d9 d9Var2 = (org.telegram.ui.Cells.d9) view;
                        if (TextUtils.isEmpty(G.l)) {
                            d9Var2.setFixedSize(i13 == 8 ? 220 : 12);
                            d9Var2.setText("");
                        } else {
                            d9Var2.setFixedSize(0);
                            d9Var2.setText(G.l);
                        }
                        if (G.q) {
                            d9Var2.setTextGravity(17);
                            d9Var2.getTextView().setWidth(Math.min(ei.x3.a(d9Var2.getText(), d9Var2.getTextView().getPaint()), AndroidUtilities.displaySize.x - AndroidUtilities.dp(60.0f)));
                            d9Var2.getTextView().setPadding(0, AndroidUtilities.dp(17.0f), 0, AndroidUtilities.dp(17.0f));
                            d9Var = d9Var2;
                        } else {
                            d9Var2.setTextGravity(8388611);
                            d9Var2.getTextView().setMinWidth(0);
                            d9Var2.getTextView().setMaxWidth(AndroidUtilities.displaySize.x);
                            d9Var2.getTextView().setPadding(0, AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(17.0f));
                            d9Var = d9Var2;
                        }
                    } else if (i13 == 38) {
                        org.telegram.ui.Cells.b2 b2Var = (org.telegram.ui.Cells.b2) view;
                        CharSequence charSequence6 = G.o;
                        boolean z13 = G.f;
                        b2Var.a.setText(charSequence6);
                        View view4 = b2Var.b;
                        view4.animate().cancel();
                        view4.animate().rotation(z13 ? 0.0f : 180.0f).setDuration(340L).setInterpolator(bs.h).start();
                        if (G.q) {
                            b2Var.setColor(org.telegram.ui.ActionBar.h6.q6);
                            d9Var = b2Var;
                        } else if (G.r) {
                            b2Var.setColor(org.telegram.ui.ActionBar.h6.p7);
                            d9Var = b2Var;
                        } else {
                            b2Var.setColor(org.telegram.ui.ActionBar.h6.G6);
                            d9Var = b2Var;
                        }
                    } else {
                        d9Var = null;
                    }
                    boolean z14 = (G3 == null || K(G3.a)) ? false : true;
                    boolean z15 = (G2 == null || K(G2.a)) ? false : true;
                    if (!im0Var.b1()) {
                        Drawable V0 = org.telegram.ui.ActionBar.h6.V0(this.e, (z14 && z15) ? R.drawable.greydivider : z14 ? R.drawable.greydivider_bottom : z15 ? R.drawable.greydivider_top : R.drawable.field_carret_empty, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.b7, this.v));
                        if (!this.n) {
                            d9Var.setBackground(V0);
                            break;
                        } else {
                            d9Var.setBackground(new LayerDrawable(new Drawable[]{new ColorDrawable(I(org.telegram.ui.ActionBar.h6.i5)), V0}));
                            break;
                        }
                    } else {
                        d9Var.setBackground(null);
                        break;
                    }
                    break;
                case 10:
                    org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
                    int i19 = t2Var.a;
                    TextView textView = t2Var.b;
                    TextView textView2 = t2Var.c;
                    RadioButton radioButton = t2Var.d;
                    if (i19 == G.d) {
                        radioButton.a(G.e, true);
                        t2Var.a(G.g, true);
                        r10 = 0;
                    } else {
                        r10 = 0;
                        t2Var.a(G.g, false);
                    }
                    if (TextUtils.isEmpty(G.n)) {
                        CharSequence charSequence7 = G.l;
                        boolean z16 = G.e;
                        textView2.setVisibility(8);
                        textView.setText(charSequence7);
                        radioButton.a(z16, r10);
                        t2Var.e = J;
                        t2Var.b();
                        t2Var.setWillNotDraw(!J);
                    } else {
                        CharSequence charSequence8 = G.l;
                        CharSequence charSequence9 = G.n;
                        boolean z17 = G.e;
                        textView2.setVisibility(r10);
                        textView2.setText(charSequence9);
                        textView.setText(charSequence8);
                        radioButton.a(z17, r10);
                        t2Var.e = J;
                        t2Var.b();
                        t2Var.setWillNotDraw(!J);
                    }
                    t2Var.a = G.d;
                    break;
                case 11:
                case 12:
                    org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) view;
                    vaVar.h(i12, G, J);
                    if (i13 == 12) {
                        vaVar.c(G.e, false);
                        break;
                    }
                    break;
                case 13:
                    org.telegram.ui.Cells.va vaVar2 = (org.telegram.ui.Cells.va) view;
                    vaVar2.h(i12, G, J);
                    CharSequence charSequence10 = G.n;
                    vaVar2.setQuery(charSequence10 == null ? null : charSequence10.toString().toLowerCase());
                    vaVar2.setAddButtonVisible(!G.e);
                    vaVar2.setCloseIcon(G.D);
                    break;
                case 14:
                    nw0 nw0Var = (nw0) view;
                    nw0Var.b(G.z, null, G.p);
                    nw0Var.setMinAllowedIndex((int) G.B);
                    nw0Var.setCallback(new tv(G, 27));
                    break;
                case 15:
                    org.telegram.ui.Cells.y7 y7Var = (org.telegram.ui.Cells.y7) view;
                    y7Var.d(G.z, (org.telegram.ui.Cells.x7) G.G, G.C);
                    y7Var.setMinValueAllowed((int) G.B);
                    break;
                case 16:
                    ig.w1 w1Var = (ig.w1) view;
                    w1Var.d.a(G.e, false);
                    w1Var.setReorder(this.M);
                    Object obj4 = G.G;
                    if (obj4 instanceof ig.z1) {
                        w1Var.a((ig.z1) obj4, null, J);
                        break;
                    }
                    break;
                case 17:
                    ig.u1 u1Var = (ig.u1) view;
                    u1Var.e.a(G.e, false);
                    Object obj5 = G.G;
                    if (obj5 instanceof ig.z1) {
                        ig.z1 z1Var = (ig.z1) obj5;
                        h9 h9Var = u1Var.a;
                        int[] iArr = u1Var.r;
                        TextView textView3 = u1Var.d;
                        ImageReceiver imageReceiver = u1Var.b;
                        int i20 = UserConfig.selectedAccount;
                        u1Var.c.setText(MessagesController.getInstance(i20).getPeerName(UserConfig.getInstance(i20).getClientUserId()));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        MessageObject messageObject = z1Var.e;
                        if (messageObject != null) {
                            spannableStringBuilder.append(Emoji.replaceEmoji(messageObject.messageText, textView3.getPaint().getFontMetricsInt(), false));
                        }
                        if (z1Var.a() > 1) {
                            spannableStringBuilder.append((CharSequence) "  ");
                            int dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(80.0f);
                            int a2 = z1Var.a() - 1;
                            int i21 = ig.v1.d;
                            SpannableString spannableString = new SpannableString("+");
                            ig.v1 v1Var = new ig.v1(a2);
                            iArr[0] = (int) (((d11) v1Var.c).c + AndroidUtilities.dp(10.0f));
                            spannableString.setSpan(v1Var, 0, spannableString.length(), 33);
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(TextUtils.ellipsize(spannableStringBuilder, textView3.getPaint(), (dp * 1.5f) - iArr[0], TextUtils.TruncateAt.END));
                            if (spannableStringBuilder2.length() > 0 && spannableStringBuilder2.charAt(spannableStringBuilder2.length() - 1) == 8230) {
                                spannableStringBuilder2.append((CharSequence) "  ");
                            }
                            spannableStringBuilder2.append((CharSequence) spannableString);
                            spannableStringBuilder = spannableStringBuilder2;
                        }
                        textView3.setText(spannableStringBuilder);
                        TLRPC.MessageMedia media = MessageObject.getMedia(z1Var.e);
                        if (media != null && (photo = media.photo) != null) {
                            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(36.0f), true, null, true);
                            ImageLocation forObject = ImageLocation.getForObject(closestPhotoSizeWithSize, media.photo);
                            MessageObject messageObject2 = z1Var.e;
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
                            MessageObject messageObject3 = z1Var.e;
                            imageReceiver.setImage(imageLocation, str2, messageObject3.strippedThumb, j14, (String) null, messageObject3, 0);
                            imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
                        }
                        u1Var.s = J;
                        u1Var.invalidate();
                        break;
                    }
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    org.telegram.ui.p91 p91Var = (org.telegram.ui.p91) view;
                    int i22 = G.z;
                    org.telegram.ui.d91 d91Var = (org.telegram.ui.d91) G.G;
                    org.telegram.ui.qh qhVar = new org.telegram.ui.qh(z12 ? 1 : 0, this, G);
                    p91Var.x = i22;
                    p91Var.y = qhVar;
                    p91Var.e(d91Var, false);
                    break;
                case 24:
                    ((org.telegram.ui.ie) view).set((org.telegram.ui.he) G.G);
                    break;
                case 25:
                    org.telegram.ui.je jeVar = (org.telegram.ui.je) view;
                    TL_stats.BroadcastRevenueTransaction broadcastRevenueTransaction = (TL_stats.BroadcastRevenueTransaction) G.G;
                    z5 z5Var = jeVar.b;
                    org.telegram.ui.ActionBar.d6 d6Var = jeVar.a;
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
                    textView5.setTextColor(org.telegram.ui.ActionBar.h6.w0(z10 ? org.telegram.ui.ActionBar.h6.p7 : org.telegram.ui.ActionBar.h6.y6, d6Var));
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                    spannableStringBuilder3.append((CharSequence) (c10 < 0 ? "-" : str3));
                    spannableStringBuilder3.append((CharSequence) "TON ");
                    spannableStringBuilder3.append((CharSequence) jeVar.e.format(Math.abs(j11) / 1.0E9d));
                    int indexOf = TextUtils.indexOf(spannableStringBuilder3, ".");
                    if (indexOf >= 0) {
                        z11 = false;
                        spannableStringBuilder3.setSpan(new RelativeSizeSpan(1.15f), 0, indexOf + 1, 33);
                    } else {
                        z11 = false;
                    }
                    z5Var.setText(org.telegram.ui.ke.f0(spannableStringBuilder3, z5Var.getPaint(), 1.1f, AndroidUtilities.dp(0.33f), z11));
                    z5Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(c10 < 0 ? org.telegram.ui.ActionBar.h6.q7 : org.telegram.ui.ActionBar.h6.l8, d6Var));
                    jeVar.f = J;
                    jeVar.setWillNotDraw(!J);
                    break;
                case 27:
                    ei.q9 q9Var = (ei.q9) view;
                    long j15 = q9Var.x;
                    Object obj6 = G.G;
                    if (!(obj6 instanceof TLRPC.User)) {
                        if (!(obj6 instanceof TLRPC.Chat)) {
                            j12 = 0;
                            boolean z18 = j15 != j12;
                            q9Var.d(false, true);
                            q9Var.set(G.G);
                            q9Var.f.setVisibility(8);
                            q9Var.h.setVisibility(0);
                            q9Var.c(G.e, z18);
                            q9Var.setDivider(J);
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
                    q9Var.d(false, true);
                    q9Var.set(G.G);
                    q9Var.f.setVisibility(8);
                    q9Var.h.setVisibility(0);
                    q9Var.c(G.e, z18);
                    q9Var.setDivider(J);
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
                    ((r61) view).setHeight(G.z);
                    break;
                case 29:
                    ig.t tVar = (ig.t) view;
                    Object obj7 = G.G;
                    if (obj7 instanceof ig.u) {
                        org.telegram.ui.ActionBar.j5 j5Var3 = tVar.a;
                        org.telegram.ui.ActionBar.j5 j5Var4 = tVar.c;
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
                            j5Var3.l(str5, false);
                        } else {
                            j5Var3.l(tVar.f.title, false);
                        }
                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(tVar.f.message);
                        TL_account.TL_businessChatLink tL_businessChatLink2 = tVar.f;
                        MediaDataController.addTextStyleRuns(tL_businessChatLink2.entities, tL_businessChatLink2.message, spannableStringBuilder4);
                        CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder4, nVar.getPaint().getFontMetricsInt(), false);
                        MessageObject.replaceAnimatedEmoji(replaceEmoji, tVar.f.entities, nVar.getPaint().getFontMetricsInt());
                        nVar.setText(replaceEmoji);
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
                    org.telegram.ui.Cells.g9 g9Var = (org.telegram.ui.Cells.g9) view;
                    CharSequence charSequence11 = G.l;
                    int i25 = G.k;
                    g9Var.b.l(charSequence11, false);
                    g9Var.a.setImageResource(i25);
                    g9Var.setDivider(J);
                    g9Var.setBackgroundColor(I(org.telegram.ui.ActionBar.h6.h5));
                    break;
                case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                    org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
                    if (!TextUtils.equals(u3Var.getText(), G.l)) {
                        u3Var.c(G.l, G.m, G.D);
                        break;
                    } else {
                        u3Var.b(G.m, G.D);
                        break;
                    }
                case 32:
                    org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
                    Object obj8 = G.G;
                    if (G.q && (obj8 instanceof TLRPC.User) && (i11 = ((TLRPC.User) obj8).bot_active_users) != 0) {
                        if (i11 != 0) {
                            concat = LocaleController.formatPluralStringSpaced("BotUsers", i11);
                            if (!(obj8 instanceof TLRPC.Chat)) {
                            }
                            String str6 = str;
                            boolean z19 = G.t;
                            Object obj9 = G.H;
                            if (obj9 instanceof Utilities.Callback) {
                            }
                            h6Var.B0 = z19;
                            h6Var.C0 = r10;
                            h6Var.setRectangularAvatar(G.r);
                            CharSequence charSequence12 = G.m;
                            h6Var.t(obj8, null, str6, charSequence12 == null ? charSequence12 : concat, false, false);
                            h6Var.s(G.e, false);
                            h6Var.M = J;
                        }
                        concat = "";
                        if (!(obj8 instanceof TLRPC.Chat)) {
                        }
                        String str62 = str;
                        boolean z192 = G.t;
                        Object obj92 = G.H;
                        if (obj92 instanceof Utilities.Callback) {
                        }
                        h6Var.B0 = z192;
                        h6Var.C0 = r10;
                        h6Var.setRectangularAvatar(G.r);
                        CharSequence charSequence122 = G.m;
                        h6Var.t(obj8, null, str62, charSequence122 == null ? charSequence122 : concat, false, false);
                        h6Var.s(G.e, false);
                        h6Var.M = J;
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
                                h6Var.B0 = z1922;
                                h6Var.C0 = callback;
                                h6Var.setRectangularAvatar(G.r);
                                CharSequence charSequence1222 = G.m;
                                h6Var.t(obj8, null, str622, charSequence1222 == null ? charSequence1222 : concat, false, false);
                                h6Var.s(G.e, false);
                                h6Var.M = J;
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
                        h6Var.B0 = z19222;
                        h6Var.C0 = callback;
                        h6Var.setRectangularAvatar(G.r);
                        CharSequence charSequence12222 = G.m;
                        h6Var.t(obj8, null, str6222, charSequence12222 == null ? charSequence12222 : concat, false, false);
                        h6Var.s(G.e, false);
                        h6Var.M = J;
                    }
                    break;
                case 33:
                    org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
                    Object obj10 = G.G;
                    MessageObject messageObject4 = obj10 instanceof MessageObject ? (MessageObject) obj10 : null;
                    r2Var.s2 = J;
                    if (messageObject4 != null) {
                        r2Var.W(messageObject4.getDialogId(), messageObject4, messageObject4.messageOwner.date, false, false);
                        break;
                    } else {
                        r2Var.W(0L, null, 0, false, false);
                        break;
                    }
                case 34:
                    ((b10) view).setViewType(G.z);
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
                        boolean z20 = G.f;
                        CharSequence charSequence13 = G.o;
                        View.OnClickListener onClickListener = G.D;
                        org.telegram.ui.Cells.z1 z1Var2 = a2Var.v;
                        if (z1Var2 != null) {
                            q6 q6Var3 = z1Var2.b;
                            q6Var3.a();
                            q6Var3.setText(charSequence13);
                            View view5 = z1Var2.c;
                            view5.animate().cancel();
                            view5.animate().rotation(z20 ? 0.0f : 180.0f).setDuration(340L).setInterpolator(bs.h).start();
                            if (onClickListener != null) {
                                z1Var2.setOnClickListener(onClickListener);
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
                    org.telegram.ui.Cells.u8 u8Var = (org.telegram.ui.Cells.u8) view;
                    u8Var.d(G.l.toString(), G.e, J, u8Var.a == G.d);
                    u8Var.getCheckBox().setDrawIconType(G.z);
                    Switch checkBox = u8Var.getCheckBox();
                    int i26 = G.z == 0 ? org.telegram.ui.ActionBar.h6.M6 : org.telegram.ui.ActionBar.h6.r7;
                    int i27 = org.telegram.ui.ActionBar.h6.N6;
                    int i28 = org.telegram.ui.ActionBar.h6.d6;
                    checkBox.d(i26, i27, i28, i28);
                    u8Var.a = G.d;
                    u8Var.setIcon(G.t ? R.drawable.permission_locked : 0);
                    if (i13 == 40) {
                        if (!TextUtils.isEmpty(G.o)) {
                            u8Var.a(new go0(20, G, u8Var), G.o.toString(), G.f);
                            break;
                        } else {
                            LinearLayout linearLayout = u8Var.f;
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
                    org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) view;
                    baVar.getValueBackupImageView().setImageDrawable(null);
                    CharSequence charSequence14 = G.l;
                    if (charSequence14 != null) {
                        CharSequence charSequence15 = G.m;
                        if (charSequence15 != null) {
                            baVar.c(charSequence14, charSequence15, false, J);
                        } else {
                            baVar.b(charSequence14, J);
                        }
                    }
                    baVar.setIcon(G.k);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    ((org.telegram.ui.Cells.i6) view).b(G.l.toString(), G.n.toString(), J, G.e);
                    break;
            }
        } else {
            e61 F = f61.F(i13);
            if (F != null) {
                F.bindView(b1Var.a, G, J, this, im0Var instanceof a71 ? (a71) im0Var : null);
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
        int i12 = z10 ? org.telegram.ui.ActionBar.h6.h5 : org.telegram.ui.ActionBar.h6.d6;
        Context context = this.e;
        if (i10 < 10000) {
            int i13 = 8;
            org.telegram.ui.ActionBar.d6 d6Var = this.v;
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
                    p61 p61Var = new p61(context);
                    p61Var.a = 0;
                    view2 = p61Var;
                    break;
                case -2:
                    view2 = new ci.h4(context, 22);
                    break;
                case 0:
                    if (!z10) {
                        view2 = new org.telegram.ui.Cells.l4(context, d6Var);
                        break;
                    } else {
                        view = new org.telegram.ui.Cells.l4(this.e, org.telegram.ui.ActionBar.h6.L6, 21, 15, 0, false, false, this.v);
                        view2 = view;
                        break;
                    }
                case 1:
                    l4Var = new org.telegram.ui.Cells.l4(this.e, org.telegram.ui.ActionBar.h6.G6, 17, 15, false, this.v);
                    view2 = l4Var;
                    break;
                case 2:
                    view2 = new u21(context, d6Var);
                    break;
                case 3:
                    view2 = new org.telegram.ui.Cells.q8(context, d6Var);
                    break;
                case 4:
                case 9:
                    org.telegram.ui.Cells.v8 v8Var = new org.telegram.ui.Cells.v8(context, d6Var);
                    view = v8Var;
                    if (i10 == 9) {
                        v8Var.setDrawCheckRipple(true);
                        v8Var.d(org.telegram.ui.ActionBar.h6.g6, org.telegram.ui.ActionBar.h6.O6, org.telegram.ui.ActionBar.h6.P6, org.telegram.ui.ActionBar.h6.Q6, org.telegram.ui.ActionBar.h6.R6);
                        v8Var.setTypeface(AndroidUtilities.bold());
                        v8Var.setHeight(56);
                        view = v8Var;
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
                    view2 = new org.telegram.ui.Cells.d9(context, d6Var);
                    break;
                case 10:
                    org.telegram.ui.Cells.t2 t2Var = new org.telegram.ui.Cells.t2(context);
                    TextView textView = new TextView(context);
                    t2Var.b = textView;
                    org.telegram.messenger.lk.u(textView, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G6, false), 1, 16.0f, 1);
                    textView.setMaxLines(1);
                    textView.setSingleLine(true);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView.setEllipsize(truncateAt);
                    textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                    boolean z11 = LocaleController.isRTL;
                    t2Var.addView(textView, w7.z5.d(-1, -1.0f, (z11 ? 5 : 3) | 48, z11 ? 61.0f : 23.0f, 0.0f, z11 ? 23.0f : 61.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    t2Var.c = textView2;
                    org.telegram.messenger.lk.u(textView2, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.I6, false), 1, 16.0f, 1);
                    textView2.setMaxLines(1);
                    textView2.setSingleLine(true);
                    textView2.setEllipsize(truncateAt);
                    textView2.setGravity((LocaleController.isRTL ? 3 : 5) | 16);
                    textView2.setVisibility(8);
                    t2Var.addView(textView2, w7.z5.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 23.0f, 0.0f, 23.0f, 0.0f));
                    RadioButton radioButton = new RadioButton(context);
                    t2Var.d = radioButton;
                    radioButton.setSize(AndroidUtilities.dp(20.0f));
                    radioButton.b(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.g7, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.h7, false));
                    t2Var.addView(radioButton, w7.z5.d(22, 22.0f, (LocaleController.isRTL ? 3 : 5) | 48, 20.0f, 15.0f, 20.0f, 0.0f));
                    t2Var.b();
                    view2 = t2Var;
                    break;
                case 11:
                case 12:
                    org.telegram.ui.Cells.va vaVar = new org.telegram.ui.Cells.va(context, 6, i10 != 12 ? 0 : 3, false);
                    vaVar.setSelfAsSavedMessages(true);
                    view2 = vaVar;
                    break;
                case 13:
                    l4Var = new org.telegram.ui.Cells.va(6, 0, this.e, null, false, true);
                    view2 = l4Var;
                    break;
                case 14:
                    view2 = new nw0(context, d6Var);
                    break;
                case 15:
                    view2 = new org.telegram.ui.Cells.y7(context, d6Var);
                    break;
                case 16:
                    view2 = new ig.w1(context, d6Var, this.L != null);
                    break;
                case 17:
                    view2 = new ig.u1(context, d6Var);
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
                    view2 = new org.telegram.ui.p91(this.e, this.f, i10 - 18, this.y, this.h);
                    break;
                case 24:
                    view2 = new org.telegram.ui.ie(context, d6Var);
                    break;
                case 25:
                    view2 = new org.telegram.ui.je(context, d6Var);
                    break;
                case 26:
                    l4Var2 = new org.telegram.ui.Cells.l4(this.e, org.telegram.ui.ActionBar.h6.G6, 23, 20, 0, false, false, this.v);
                    l4Var2.setTextSize(20.0f);
                    view2 = l4Var2;
                    break;
                case 27:
                    ei.q9 q9Var = new ei.q9(context, d6Var);
                    q9Var.d(false, false);
                    view2 = q9Var;
                    break;
                case 28:
                    h4Var = new r61(context);
                    h4Var.setTag(-33024);
                    view2 = h4Var;
                    break;
                case 29:
                    view2 = new ig.t(context, d6Var);
                    break;
                case MessageObject.TYPE_GIFT_STARS /* 30 */:
                    view2 = new org.telegram.ui.Cells.g9(context, d6Var);
                    break;
                case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                    im0 im0Var = this.d;
                    if (im0Var != null && im0Var.b1()) {
                        org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(context, 28, d6Var);
                        u3Var.setNoBackground(true);
                        view2 = u3Var;
                        break;
                    } else {
                        view2 = new org.telegram.ui.Cells.u3(context, d6Var);
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
                    b10 b10Var = new b10(context, d6Var);
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
                        org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(i11, 21, this.e, this.v, true);
                        a2Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.h6.V6, org.telegram.ui.ActionBar.h6.g7, org.telegram.ui.ActionBar.h6.k7);
                        view2 = a2Var;
                        break;
                    } else {
                        i13 = 4;
                    }
                    i11 = i13;
                    org.telegram.ui.Cells.a2 a2Var2 = new org.telegram.ui.Cells.a2(i11, 21, this.e, this.v, true);
                    a2Var2.getCheckBoxRound().b(org.telegram.ui.ActionBar.h6.V6, org.telegram.ui.ActionBar.h6.g7, org.telegram.ui.ActionBar.h6.k7);
                    view2 = a2Var2;
                case 38:
                    view2 = new org.telegram.ui.Cells.b2(context, d6Var);
                    break;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    view2 = new org.telegram.ui.Cells.u8(context);
                    break;
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    l4Var2 = new org.telegram.ui.Cells.l4(this.e, org.telegram.ui.ActionBar.h6.L6, 21, 15, 0, false, true, this.v);
                    view2 = l4Var2;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    view2 = new org.telegram.ui.Cells.ba(context, 0, d6Var);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    view2 = new org.telegram.ui.Cells.i6(context, false);
                    break;
            }
        } else {
            e61 F = f61.F(i10);
            view2 = F != null ? F.createView(this.e, this.d, this.f, this.h, this.v) : new View(context);
        }
        if (this.r) {
            if (i10 < 10000) {
                switch (i10) {
                }
            }
            view2.setBackgroundColor(I(i12));
        }
        return new sl0(view2);
    }

    @Override // s4.g0
    public void y(s4.b1 b1Var) {
        Q(b1Var, this.M);
        O(b1Var);
    }
}
