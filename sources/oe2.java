// default package

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class oe2 extends nx0 implements fn7 {
    public static final /* synthetic */ int f2 = 0;
    public final je2 A1;
    public final View B1;
    public final in C1;
    public final in D1;
    public final TextView E1;
    public ne2 F1;
    public boolean G1;
    public boolean H1;
    public boolean I1;
    public int J1;
    public tqb K1;
    public float L1;
    public ValueAnimator M1;
    public lg5 N1;
    public boolean O1;
    public ez3 P1;
    public e Q1;
    public n12 R1;
    public tt S1;
    public in T1;
    public boolean U1;
    public wm2 V1;
    public boolean W1;
    public boolean X1;
    public TL_stories.TL_premium_boostsStatus Y1;
    public float Z1;
    public ValueAnimator a2;
    public boolean b2;
    public boolean c2;
    public int d2;
    public int e2;
    public final ImageView l1;
    public final gd0 m1;
    public final TextView n1;
    public final TextView o1;
    public TLRPC.WallPaper p1;
    public final me2 q1;
    public final xu1 r1;
    public final ez3 s1;
    public final boolean t1;
    public final zu1 u1;
    public final d79 v1;
    public final x46 w1;
    public final tk4 x1;
    public final b29 y1;
    public final di1 z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oe2(zu1 zu1Var, xu1 xu1Var) {
        super(1, (vnb) xu1Var, (Context) zu1Var.getParentActivity(), true);
        String str;
        byte b = 1;
        this.J1 = -1;
        this.W1 = false;
        this.X1 = false;
        this.Z1 = 0.0f;
        this.u1 = zu1Var;
        this.r1 = xu1Var;
        this.s1 = xu1Var.f;
        this.p1 = xu1Var.g;
        this.t1 = aob.I.o();
        me2 me2Var = new me2(this.a, zu1Var.a(), xu1Var, 0);
        this.q1 = me2Var;
        this.p0 = false;
        this.c0 = false;
        this.w0 = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.G0 = -1;
            int i = aob.i5;
            this.H0 = aob.v0(i, this.J0);
            hl.o3(this, aob.v0(i, this.J0), false, null);
            hl.i3(this, ((double) hl.B(this.H0)) > 0.721d);
        } else {
            L(aob.i5);
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.O = frameLayout;
        TextView textView = new TextView(getContext());
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setText(ob6.M0(2131745379, null));
        qd4.w(textView, aob.j5, this.J0, 1, 20.0f);
        textView.setPadding(hl.L(12.0f), hl.L(6.0f), hl.L(12.0f), hl.L(8.0f));
        ImageView imageView = new ImageView(getContext());
        this.l1 = imageView;
        int L = hl.L(10.0f);
        imageView.setPadding(L, L, L, L);
        gd0 gd0Var = new gd0(false);
        this.m1 = gd0Var;
        imageView.setImageDrawable(gd0Var);
        imageView.setOnClickListener(new zd2(this, b));
        frameLayout.addView(imageView, tre.d(44, 44.0f, 8388659, 4.0f, -2.0f, 62.0f, 12.0f));
        frameLayout.addView(textView, tre.d(-1, -2.0f, 8388659, 44.0f, 0.0f, 62.0f, 0.0f));
        int i2 = aob.Fi;
        int v0 = aob.v0(i2, this.J0);
        int L2 = hl.L(28.0f);
        b29 b29Var = new b29(R.raw.sun_outline, L2, L2, false, null);
        this.y1 = b29Var;
        this.G1 = !aob.I.o();
        P0(aob.I.o(), false);
        b29Var.E(true);
        b29Var.h = true;
        this.d2 = v0;
        b29Var.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.MULTIPLY));
        di1 di1Var = new di1((byte) 1, getContext(), this);
        this.z1 = di1Var;
        di1Var.setAnimation(b29Var);
        di1Var.setScaleType(ImageView.ScaleType.CENTER);
        di1Var.setOnClickListener(new zd2(this, (byte) 2));
        frameLayout.addView(di1Var, tre.d(44, 44.0f, 8388661, 0.0f, -2.0f, 7.0f, 0.0f));
        this.A1 = new je2(getContext());
        d79 d79Var = new d79(getContext(), null);
        this.v1 = d79Var;
        d79Var.setAdapter(me2Var);
        d79Var.setDrawSelection(false);
        d79Var.setClipChildren(false);
        d79Var.setClipToPadding(false);
        d79Var.setHasFixedSize(true);
        d79Var.setItemAnimator(null);
        d79Var.setNestedScrollingEnabled(false);
        getContext();
        x46 x46Var = new x46(0, false);
        this.w1 = x46Var;
        d79Var.setLayoutManager(x46Var);
        d79Var.setPadding(hl.L(12.0f), 0, hl.L(12.0f), 0);
        d79Var.setOnItemClickListener(new u(this, (byte) 12));
        d79Var.setOnScrollListener(new y(this, (byte) 26));
        tk4 tk4Var = new tk4(getContext(), this.J0);
        this.x1 = tk4Var;
        tk4Var.setViewType(14);
        tk4Var.setVisibility(0);
        frameLayout.addView(tk4Var, tre.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        frameLayout.addView(d79Var, tre.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        View view = new View(getContext());
        this.B1 = view;
        int L3 = hl.L(6.0f);
        int v02 = aob.v0(i2, this.J0);
        int i3 = aob.Hi;
        int v03 = aob.v0(i3, this.J0);
        Drawable i0 = aob.i0(L3, L3, L3, L3, v02, v03, v03);
        uob M = yob.M(i2);
        uob M2 = yob.M(i3);
        vnb vnbVar = this.J0;
        view.setBackground(i0);
        yob.j(view, i0, M, M2, vnbVar);
        view.setOnClickListener(new zd2(this, (byte) 3));
        frameLayout.addView(view, tre.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(getContext());
        this.E1 = textView2;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(17);
        textView2.setLines(1);
        textView2.setSingleLine(true);
        if (this.p1 == null) {
            textView2.setText(ob6.M0(2131752103, null));
        } else {
            textView2.setText(ob6.M0(2131752105, null));
        }
        textView2.setTextSize(1, 15.0f);
        textView2.setOnClickListener(new h6(this, (byte) 4));
        frameLayout.addView(textView2, tre.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        in inVar = new in(getContext(), true, true, true);
        this.C1 = inVar;
        inVar.getDrawable().q(true);
        inVar.n = false;
        inVar.setGravity(17);
        int i4 = aob.Ji;
        yob.U(inVar, i4, this.J0);
        inVar.setTextSize(hl.L(15.0f));
        inVar.setTypeface(hl.o());
        frameLayout.addView(inVar, tre.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        in inVar2 = new in(getContext(), true, true, true);
        this.D1 = inVar2;
        inVar2.getDrawable().q(true);
        inVar2.n = false;
        inVar2.setGravity(17);
        yob.U(inVar2, i4, this.J0);
        inVar2.setTextSize(hl.L(12.0f));
        inVar2.setAlpha(0.0f);
        inVar2.setTranslationY(hl.L(11.0f));
        frameLayout.addView(inVar2, tre.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        if (this.p1 != null) {
            TextView textView3 = new TextView(getContext());
            this.n1 = textView3;
            textView3.setEllipsize(truncateAt);
            textView3.setGravity(17);
            textView3.setLines(1);
            textView3.setSingleLine(true);
            textView3.setText(ob6.M0(2131745812, null));
            textView3.setTextSize(1, 15.0f);
            textView3.setOnClickListener(new sb1((Object) this, (Object) zu1Var, (byte) 20));
            frameLayout.addView(textView3, tre.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
            TextView textView4 = new TextView(getContext());
            this.o1 = textView4;
            textView4.setEllipsize(truncateAt);
            textView4.setGravity(17);
            textView4.setLines(1);
            textView4.setSingleLine(true);
            if (zu1Var.h() != null) {
                str = lbc.k(zu1Var.h(), true);
            } else {
                TLRPC.Chat chat = zu1Var.e;
                str = chat != null ? chat.title : "";
            }
            textView4.setText(ob6.a0("ChatThemeApplyHint", null, 2131752171, str));
            textView4.setTextSize(1, 15.0f);
            frameLayout.addView(textView4, tre.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
        }
        U0();
        V0(false);
    }

    public static znb E0(boolean z) {
        SharedPreferences sharedPreferences = a.b.getSharedPreferences("themeconfig", 0);
        String str = "Blue";
        String string = sharedPreferences.getString("lastDayTheme", "Blue");
        if (aob.O0(string) != null && !aob.O0(string).o()) {
            str = string;
        }
        String str2 = "Dark Blue";
        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
        if (aob.O0(string2) != null && aob.O0(string2).o()) {
            str2 = string2;
        }
        return z ? aob.O0(str2) : aob.O0(str);
    }

    public static void S0(tqb tqbVar) {
        if (tqbVar == null) {
            return;
        }
        float width = tqbVar.getWidth() / 2.0f;
        float width2 = tqbVar.getWidth();
        float height = tqbVar.getHeight();
        float max = Math.max(width, width2 - width);
        float max2 = Math.max(0.0f, height - 0.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(tqbVar, tqb.x, 0.0f, ((float) Math.sqrt((max2 * max2) + (max * max))) / 0.6f);
        ofFloat.setDuration(450L);
        ofFloat.setInterpolator(dt3.e);
        ofFloat.addListener(new jb1((Object) tqbVar, (byte) 25));
        ofFloat.start();
    }

    @Override // nx0
    public final void A(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.i5));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0088 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F0(boolean z) {
        long j;
        TLRPC.ChatTheme chatTheme;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        boolean z2;
        char c;
        TLRPC.User h;
        boolean z3;
        if (this.W1) {
            return;
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.Y1;
        byte b = 1;
        zu1 zu1Var = this.u1;
        if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < zu1Var.getMessagesController().k4.n2.f()) {
            zu1Var.getMessagesController().G0().b(zu1Var.a(), this.Y1, new yd2(this, b));
            return;
        }
        ez3 ez3Var = this.F1.a;
        v21 v21Var = null;
        if (ez3Var != this.P1) {
            TLRPC.ChatTheme chatTheme2 = !ez3Var.a ? ez3Var.d : null;
            if (ez3Var.d instanceof TLRPC.TL_chatThemeUniqueGift) {
                Long l = (Long) af2.e(ez3Var.g).r.get(((TLRPC.TL_chatThemeUniqueGift) ez3Var.d).gift.slug);
                if (l != null) {
                    j = l.longValue();
                    chatTheme = ez3Var.d;
                    if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                        TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                        if (starGift instanceof TL_stars.TL_starGiftUnique) {
                            tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                            if (j == 0 && tL_starGiftUnique != null && !z) {
                                jj.k0(getContext(), this.J0, this.a, tL_starGiftUnique, j, new xd2(this, b));
                                return;
                            }
                            af2.e(this.a).a(zu1Var.a(), false, false);
                            af2.e(this.a).q(zu1Var.a(), dpb.c(chatTheme2), chatTheme2, true);
                            TLRPC.WallPaper wallPaper = K0() ? null : this.r1.g;
                            boolean z4 = this.G1;
                            boolean z5 = this.t1;
                            tqb G0 = z4 != z5 ? G0() : null;
                            z2 = ez3Var.a;
                            xu1 xu1Var = this.r1;
                            if (z2) {
                                c = 0;
                                xu1Var.q(null, wallPaper, G0 == null, Boolean.valueOf(z5), false);
                            } else {
                                c = 0;
                                xu1Var.q(ez3Var, wallPaper, G0 == null, Boolean.valueOf(z5), false);
                            }
                            S0(G0);
                            this.H1 = true;
                            h = zu1Var.h();
                            if (h != null && !h.self) {
                                z3 = ez3Var.a;
                                l3b l3bVar = new l3b(getContext(), null, 1, -1, ez3Var.e(), zu1Var.getResourceProvider());
                                l3bVar.c.setVisibility(8);
                                String str = h.first_name;
                                TextView textView = l3bVar.b;
                                if (z3) {
                                    Object[] objArr = new Object[1];
                                    objArr[c] = str;
                                    uh9.r("ThemeAlsoAppliedForHint", null, 2131743842, objArr, textView);
                                } else {
                                    Object[] objArr2 = new Object[1];
                                    objArr2[c] = str;
                                    uh9.r("ThemeAlsoDisabledForHint", null, 2131743841, objArr2, textView);
                                }
                                textView.setTypeface(null);
                                v21Var = v21.g(zu1Var, l3bVar, 2750);
                            }
                        }
                    }
                    tL_starGiftUnique = null;
                    if (j == 0) {
                    }
                    af2.e(this.a).a(zu1Var.a(), false, false);
                    af2.e(this.a).q(zu1Var.a(), dpb.c(chatTheme2), chatTheme2, true);
                    if (K0()) {
                    }
                    boolean z42 = this.G1;
                    boolean z52 = this.t1;
                    if (z42 != z52) {
                    }
                    z2 = ez3Var.a;
                    xu1 xu1Var2 = this.r1;
                    if (z2) {
                    }
                    S0(G0);
                    this.H1 = true;
                    h = zu1Var.h();
                    if (h != null) {
                        z3 = ez3Var.a;
                        l3b l3bVar2 = new l3b(getContext(), null, 1, -1, ez3Var.e(), zu1Var.getResourceProvider());
                        l3bVar2.c.setVisibility(8);
                        String str2 = h.first_name;
                        TextView textView2 = l3bVar2.b;
                        if (z3) {
                        }
                        textView2.setTypeface(null);
                        v21Var = v21.g(zu1Var, l3bVar2, 2750);
                    }
                }
            }
            j = 0;
            chatTheme = ez3Var.d;
            if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
            }
            tL_starGiftUnique = null;
            if (j == 0) {
            }
            af2.e(this.a).a(zu1Var.a(), false, false);
            af2.e(this.a).q(zu1Var.a(), dpb.c(chatTheme2), chatTheme2, true);
            if (K0()) {
            }
            boolean z422 = this.G1;
            boolean z522 = this.t1;
            if (z422 != z522) {
            }
            z2 = ez3Var.a;
            xu1 xu1Var22 = this.r1;
            if (z2) {
            }
            S0(G0);
            this.H1 = true;
            h = zu1Var.h();
            if (h != null) {
            }
        }
        dismiss();
        if (v21Var != null) {
            v21Var.j();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final tqb G0() {
        Bitmap bitmap;
        Bitmap bitmap2;
        zu1 zu1Var = this.u1;
        Activity parentActivity = zu1Var != null ? zu1Var.getParentActivity() : null;
        if (parentActivity == null || parentActivity.getWindow() == null || !(parentActivity.getWindow().getDecorView() instanceof FrameLayout)) {
            return null;
        }
        FrameLayout frameLayout = (FrameLayout) parentActivity.getWindow().getDecorView();
        if (frameLayout.getWidth() <= 0 || frameLayout.getHeight() <= 0) {
            return null;
        }
        try {
            bitmap2 = Build.VERSION.SDK_INT >= 26 ? hl.A0(parentActivity.getWindow()) : null;
            if (bitmap2 == null) {
                try {
                    bitmap2 = hl.H3(frameLayout);
                } catch (Throwable th) {
                    bitmap = bitmap2;
                    th = th;
                    cc4.g(th, true);
                    bitmap2 = bitmap;
                    if (bitmap2 != null) {
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            bitmap = null;
        }
        if (bitmap2 != null) {
            return null;
        }
        tqb tqbVar = new tqb(parentActivity);
        tqbVar.setScaleType(ImageView.ScaleType.MATRIX);
        tqbVar.setImageBitmap(bitmap2);
        tqbVar.b(frameLayout.getWidth() / 2.0f, 0.0f, true);
        tqbVar.setRadius(0.0f);
        frameLayout.addView(tqbVar, new FrameLayout.LayoutParams(-1, -1));
        return tqbVar;
    }

    public final void H0() {
        if (!K0()) {
            dismiss();
            return;
        }
        final byte b = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.J0, getContext());
        String M0 = ob6.M0(2131752161, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        idVar.U = ob6.M0(2131752162, null);
        alertDialog$Builder.j(ob6.M0(2131752164, null), new fd(this) { // from class: ae2
            public final /* synthetic */ oe2 b;

            {
                this.b = this;
            }

            @Override // fd
            public final void w(id idVar2, int i) {
                byte b2 = b;
                oe2 oe2Var = this.b;
                switch (b2) {
                    case 0:
                        oe2Var.F0(false);
                        break;
                    default:
                        oe2Var.dismiss();
                        break;
                }
            }
        });
        final byte b2 = 1;
        alertDialog$Builder.g(ob6.M0(2131752163, null), new fd(this) { // from class: ae2
            public final /* synthetic */ oe2 b;

            {
                this.b = this;
            }

            @Override // fd
            public final void w(id idVar2, int i) {
                byte b22 = b2;
                oe2 oe2Var = this.b;
                switch (b22) {
                    case 0:
                        oe2Var.F0(false);
                        break;
                    default:
                        oe2Var.dismiss();
                        break;
                }
            }
        });
        alertDialog$Builder.o();
    }

    public final void I0() {
        try {
            int v0 = aob.v0(aob.Fi, this.J0);
            b29 b29Var = this.y1;
            if (b29Var != null && v0 != this.d2) {
                this.d2 = v0;
                b29Var.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.MULTIPLY));
            }
            gd0 gd0Var = this.m1;
            if (gd0Var != null) {
                int i = aob.j5;
                gd0Var.a(aob.v0(i, this.J0));
                gd0Var.b(aob.v0(i, this.J0));
                ImageView imageView = this.l1;
                if (imageView != null) {
                    imageView.invalidate();
                }
            }
            int v02 = aob.v0(aob.h5, this.J0);
            if (v02 != this.e2) {
                this.e2 = v02;
                s0(v02);
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final void J0() {
        if (this.J || this.H1) {
            return;
        }
        aob.b = false;
        TLRPC.WallPaper wallPaper = K0() ? null : this.r1.g;
        ez3 ez3Var = this.F1.a;
        boolean z = ez3Var.a;
        boolean z2 = this.G1;
        xu1 xu1Var = this.r1;
        if (z) {
            xu1Var.q(null, wallPaper, false, Boolean.valueOf(z2), true);
        } else {
            xu1Var.q(ez3Var, wallPaper, false, Boolean.valueOf(z2), true);
        }
        n12 n12Var = this.R1;
        if (n12Var != null) {
            m22 m22Var = n12Var.l2;
            if (m22Var != null) {
                boolean z3 = this.G1;
                ly0 ly0Var = m22Var.w;
                ((ArrayList) ly0Var.e).clear();
                WallpapersListActivity.A0((ArrayList) ly0Var.e, z3);
                ly0Var.f();
            }
            this.R1.I0();
        }
        me2 me2Var = this.q1;
        if (me2Var == null || me2Var.d == null) {
            return;
        }
        for (int i = 0; i < me2Var.d.size(); i++) {
            ((ne2) me2Var.d.get(i)).c = this.G1 ? 1 : 0;
        }
        me2Var.f();
    }

    public final boolean K0() {
        if (this.F1 == null) {
            return false;
        }
        ez3 ez3Var = this.P1;
        dpb dpbVar = ez3Var != null ? ez3Var.c : null;
        if (dpbVar == null) {
            dpbVar = dpb.d("❌");
        }
        ez3 ez3Var2 = this.F1.a;
        dpb dpbVar2 = ez3Var2 != null ? ez3Var2.c : null;
        if (dpbVar2 == null) {
            dpbVar2 = dpb.d("❌");
        }
        return !dpb.a(dpbVar, dpbVar2);
    }

    public final void L0() {
        ArrayList arrayList;
        if (this.U1) {
            return;
        }
        af2 e = af2.e(this.a);
        if (!e.f.c || (arrayList = e.b) == null || arrayList.isEmpty()) {
            this.U1 = true;
            byte b = 0;
            if (e.f.c) {
                e.o(new ke2(this, e), false);
                return;
            }
            le2 le2Var = new le2(this, e);
            long currentTimeMillis = System.currentTimeMillis();
            ze2 ze2Var = e.f;
            boolean z = currentTimeMillis - ze2Var.b > 7200000;
            if (((ArrayList) ze2Var.d) == null || !ze2Var.c || z) {
                TL_account.Tl_getUniqueGiftChatThemes tl_getUniqueGiftChatThemes = new TL_account.Tl_getUniqueGiftChatThemes();
                ze2 ze2Var2 = e.f;
                tl_getUniqueGiftChatThemes.offset = (String) ze2Var2.e;
                tl_getUniqueGiftChatThemes.hash = ze2Var2.a;
                tl_getUniqueGiftChatThemes.limit = 50;
                ConnectionsManager connectionsManager = e.getConnectionsManager();
                to3 to3Var = af2.s;
                Objects.requireNonNull(to3Var);
                connectionsManager.sendRequestTyped(tl_getUniqueGiftChatThemes, new pe2(to3Var, b), new qe2(e, le2Var, b));
            }
        }
    }

    public final void M0(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        ne2 ne2Var = new ne2((ez3) arrayList.get(0));
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        if (!this.O1) {
            ez3 ez3Var = this.r1.f;
            this.P1 = ez3Var;
            if (ez3Var != null) {
                ez3Var.k();
            }
        }
        arrayList2.add(0, ne2Var);
        if (!this.O1) {
            this.F1 = ne2Var;
        }
        ez3 ez3Var2 = this.P1;
        dpb dpbVar = ez3Var2 != null ? ez3Var2.c : null;
        boolean z = false;
        int i = 1;
        while (i < arrayList.size()) {
            ez3 ez3Var3 = (ez3) arrayList.get(i);
            ne2 ne2Var2 = new ne2(ez3Var3);
            ez3Var3.m(this.a);
            ne2Var2.c = this.G1 ? 1 : 0;
            if (dpb.a(ez3Var3.c, dpbVar)) {
                arrayList2.add(1, ne2Var2);
                z = true;
            } else {
                arrayList2.add(ne2Var2);
            }
            i++;
            z = z;
        }
        ez3 ez3Var4 = this.P1;
        if (ez3Var4 != null && !z) {
            ne2 ne2Var3 = new ne2(ez3Var4);
            ez3Var4.m(this.a);
            ne2Var3.c = this.G1 ? 1 : 0;
            arrayList2.add(1, ne2Var3);
        }
        me2 me2Var = this.q1;
        me2Var.d = arrayList2;
        me2Var.f();
        this.z1.setVisibility(0);
        if (!this.O1) {
            O0(false);
            this.v1.animate().alpha(1.0f).setDuration(150L).start();
        }
        this.O1 = true;
        V0(true);
    }

    public final void N0() {
        if (this.J || this.H1) {
            return;
        }
        this.I1 = false;
        this.u1.getClass();
        TLRPC.WallPaper wallPaper = K0() ? null : this.p1;
        ez3 ez3Var = this.F1.a;
        boolean z = ez3Var.a;
        boolean z2 = this.G1;
        xu1 xu1Var = this.r1;
        if (z) {
            xu1Var.q(null, wallPaper, true, Boolean.valueOf(z2), false);
        } else {
            xu1Var.q(ez3Var, wallPaper, true, Boolean.valueOf(z2), false);
        }
    }

    public final void O0(boolean z) {
        me2 me2Var = this.q1;
        ArrayList arrayList = me2Var.d;
        ez3 ez3Var = this.P1;
        x46 x46Var = this.w1;
        d79 d79Var = this.v1;
        if (ez3Var != null) {
            int i = 0;
            while (true) {
                if (i == arrayList.size()) {
                    i = -1;
                    break;
                } else {
                    if (dpb.a(((ne2) arrayList.get(i)).a.c, this.P1.c)) {
                        this.F1 = (ne2) arrayList.get(i);
                        break;
                    }
                    i++;
                }
            }
            if (i != -1) {
                this.J1 = i;
                me2Var.E(i);
                if (i > 0 && i < arrayList.size() / 2) {
                    i--;
                }
                int min = Math.min(i, me2Var.d.size() - 1);
                if (z) {
                    d79Var.A0(min);
                } else {
                    x46Var.g1(min, 0);
                }
            }
        } else {
            this.F1 = (ne2) arrayList.get(0);
            me2Var.E(0);
            if (z) {
                d79Var.A0(0);
            } else {
                x46Var.g1(0, 0);
            }
        }
        N0();
    }

    public final void P0(boolean z, boolean z2) {
        if (this.G1 != z) {
            this.G1 = z;
            di1 di1Var = this.z1;
            b29 b29Var = this.y1;
            if (z2) {
                b29Var.K(z ? b29Var.e[0] : 0);
                if (di1Var != null) {
                    di1Var.d();
                    return;
                }
                return;
            }
            int i = z ? b29Var.e[0] - 1 : 0;
            b29Var.I(i, false, true);
            b29Var.K(i);
            if (di1Var != null) {
                di1Var.invalidate();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q0(boolean z) {
        Bitmap bitmap;
        if (this.J || this.b2) {
            return;
        }
        ValueAnimator valueAnimator = this.M1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        zu1 zu1Var = this.u1;
        FrameLayout frameLayout = (FrameLayout) zu1Var.getParentActivity().getWindow().getDecorView();
        FrameLayout frameLayout2 = (FrameLayout) getWindow().getDecorView();
        Window window = zu1Var.getParentActivity().getWindow();
        Window window2 = getWindow();
        if (Build.VERSION.SDK_INT >= 26 && frameLayout2.getWidth() > 0 && frameLayout2.getHeight() > 0) {
            Bitmap A0 = hl.A0(window);
            Bitmap A02 = A0 != null ? hl.A0(window2) : null;
            if (A0 != null) {
                if (A02 != null) {
                    frameLayout.getLocationOnScreen(new int[2]);
                    frameLayout2.getLocationOnScreen(new int[2]);
                    bitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmap);
                    canvas.drawBitmap(A0, r6[0] - r7[0], r6[1] - r7[1], (Paint) null);
                    canvas.drawBitmap(A02, 0.0f, 0.0f, (Paint) null);
                    A0.recycle();
                    A02.recycle();
                    di1 di1Var = this.z1;
                    if (bitmap == null) {
                        tqb.a(bitmap, null, di1Var);
                    } else {
                        bitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas2 = new Canvas(bitmap);
                        di1Var.setAlpha(0.0f);
                        frameLayout.draw(canvas2);
                        frameLayout2.draw(canvas2);
                        di1Var.setAlpha(1.0f);
                    }
                    di1Var.getLocationInWindow(new int[2]);
                    float measuredWidth = (di1Var.getMeasuredWidth() / 2.0f) + r3[0];
                    float measuredHeight = (di1Var.getMeasuredHeight() / 2.0f) + r3[1];
                    float width = bitmap.getWidth();
                    float height = bitmap.getHeight();
                    px1 px1Var = tqb.x;
                    float max = Math.max(measuredWidth, width - measuredWidth);
                    float max2 = Math.max(measuredHeight, height - measuredHeight);
                    float sqrt = ((float) Math.sqrt((max2 * max2) + (max * max))) / 0.6f;
                    tqb tqbVar = new tqb(getContext());
                    tqbVar.setScaleType(ImageView.ScaleType.MATRIX);
                    tqbVar.setImageBitmap(bitmap);
                    tqbVar.b(measuredWidth, measuredHeight, z);
                    ColorFilter colorFilter = this.y1.getColorFilter();
                    tqbVar.n = di1Var;
                    tqbVar.r = colorFilter;
                    tqbVar.setRadius(!z ? 0.0f : sqrt);
                    this.K1 = tqbVar;
                    tqbVar.setOnTouchListener(new b02((byte) 4));
                    this.L1 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.M1 = ofFloat;
                    ofFloat.addUpdateListener(new ce2(this, tqbVar, sqrt, z));
                    this.M1.addListener(new jb1((Object) this, (byte) 24));
                    this.M1.setDuration(400L);
                    this.M1.setInterpolator(dt3.e);
                    this.M1.start();
                    frameLayout2.addView(this.K1, new ViewGroup.LayoutParams(-1, -1));
                    hl.c3(new xac((byte) 12, this, z));
                }
                A0.recycle();
            }
        }
        bitmap = null;
        di1 di1Var2 = this.z1;
        if (bitmap == null) {
        }
        di1Var2.getLocationInWindow(new int[2]);
        float measuredWidth2 = (di1Var2.getMeasuredWidth() / 2.0f) + r3[0];
        float measuredHeight2 = (di1Var2.getMeasuredHeight() / 2.0f) + r3[1];
        float width2 = bitmap.getWidth();
        float height2 = bitmap.getHeight();
        px1 px1Var2 = tqb.x;
        float max3 = Math.max(measuredWidth2, width2 - measuredWidth2);
        float max22 = Math.max(measuredHeight2, height2 - measuredHeight2);
        float sqrt2 = ((float) Math.sqrt((max22 * max22) + (max3 * max3))) / 0.6f;
        tqb tqbVar2 = new tqb(getContext());
        tqbVar2.setScaleType(ImageView.ScaleType.MATRIX);
        tqbVar2.setImageBitmap(bitmap);
        tqbVar2.b(measuredWidth2, measuredHeight2, z);
        ColorFilter colorFilter2 = this.y1.getColorFilter();
        tqbVar2.n = di1Var2;
        tqbVar2.r = colorFilter2;
        tqbVar2.setRadius(!z ? 0.0f : sqrt2);
        this.K1 = tqbVar2;
        tqbVar2.setOnTouchListener(new b02((byte) 4));
        this.L1 = 0.0f;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.M1 = ofFloat2;
        ofFloat2.addUpdateListener(new ce2(this, tqbVar2, sqrt2, z));
        this.M1.addListener(new jb1((Object) this, (byte) 24));
        this.M1.setDuration(400L);
        this.M1.setInterpolator(dt3.e);
        this.M1.start();
        frameLayout2.addView(this.K1, new ViewGroup.LayoutParams(-1, -1));
        hl.c3(new xac((byte) 12, this, z));
    }

    public final void R0(pqb pqbVar) {
        bg0 bg0Var = new bg0();
        bg0Var.a = true;
        zu1 zu1Var = this.u1;
        pqbVar.a.a = zu1Var.getResourceProvider();
        pqbVar.r1 = new ie2(this);
        bg0Var.c = new kc((byte) 24);
        bg0Var.d = new xd2(this, (byte) 5);
        bg0Var.b = new xd2(this, (byte) 6);
        bg0Var.e = true;
        this.Q1 = pqbVar;
        zu1Var.showAsSheet(pqbVar, bg0Var);
    }

    @Override // nx0
    public final ArrayList S() {
        be2 be2Var = new be2(this);
        ArrayList arrayList = new ArrayList();
        if (this.u1.w7) {
            e eVar = this.Q1;
            if (eVar instanceof pqb) {
                arrayList.addAll(((pqb) eVar).U0());
                return arrayList;
            }
        }
        n12 n12Var = this.R1;
        if (n12Var != null) {
            arrayList.addAll(n12Var.S());
        }
        int i = 0;
        arrayList.add(new apb((View) null, 32, (Class[]) null, (Paint) null, new Drawable[]{this.s0}, be2Var, aob.h5));
        int i2 = aob.Fi;
        View view = this.B1;
        arrayList.add(new apb(view, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i2));
        arrayList.add(new apb(view, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Hi));
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((apb) obj).n = this.r1;
        }
        return arrayList;
    }

    public final void T0(znb znbVar) {
        if (znbVar == null || znbVar == aob.I) {
            return;
        }
        this.b2 = true;
        try {
            jn7.e().k(jn7.w4, znbVar, Boolean.FALSE, null, -1);
        } finally {
            this.b2 = false;
        }
    }

    public final void U0() {
        TextView textView = this.o1;
        if (textView != null) {
            yob.X(textView, aob.p5, this.J0);
            int L = hl.L(6.0f);
            int i = aob.Fi;
            int o = vm2.o(aob.v0(i, this.J0), 76);
            hf0 i0 = aob.i0(L, L, L, L, 0, o, o);
            uob g = yob.g(i, 76);
            vnb vnbVar = this.J0;
            textView.setBackground(i0);
            yob.j(textView, i0, null, g, vnbVar);
        }
        TextView textView2 = this.n1;
        if (textView2 != null) {
            int i2 = aob.p7;
            yob.X(textView2, i2, this.J0);
            int L2 = hl.L(6.0f);
            int o2 = vm2.o(aob.v0(i2, this.J0), 76);
            hf0 i02 = aob.i0(L2, L2, L2, L2, 0, o2, o2);
            uob g2 = yob.g(i2, 76);
            vnb vnbVar2 = this.J0;
            textView2.setBackground(i02);
            yob.j(textView2, i02, null, g2, vnbVar2);
        }
        int i3 = aob.j5;
        hf0 f0 = aob.f0(vm2.o(aob.v0(i3, this.J0), 30), 1, -1);
        uob g3 = yob.g(i3, 30);
        vnb vnbVar3 = this.J0;
        ImageView imageView = this.l1;
        yob.R(imageView, f0, null, g3, vnbVar3);
        int v0 = aob.v0(i3, this.J0);
        gd0 gd0Var = this.m1;
        gd0Var.a(v0);
        gd0Var.b(aob.v0(i3, this.J0));
        imageView.invalidate();
        int i4 = aob.Fi;
        yob.R(this.z1, aob.f0(vm2.o(aob.v0(i4, this.J0), 30), 1, -1), null, yob.g(i4, 30), this.J0);
        int i5 = aob.m5;
        vnb vnbVar4 = this.J0;
        TextView textView3 = this.E1;
        yob.X(textView3, i5, vnbVar4);
        int L3 = hl.L(6.0f);
        int o3 = vm2.o(aob.v0(i4, this.J0), 76);
        yob.R(textView3, aob.i0(L3, L3, L3, L3, 0, o3, o3), null, yob.g(i4, 76), this.J0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013f  */
    /* JADX WARN: Type inference failed for: r10v0, types: [android.view.View, in] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V0(boolean z) {
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus;
        ?? r17;
        boolean z2;
        boolean z3;
        ValueAnimator valueAnimator;
        ez3 ez3Var;
        zu1 zu1Var = this.u1;
        TLRPC.Chat chat = zu1Var.e;
        byte b = 0;
        if (chat != null && !this.W1 && !this.X1 && this.Y1 == null) {
            this.W1 = true;
            zu1Var.getMessagesController().G0().a(zu1Var.a(), new yd2(this, b));
        }
        boolean z4 = this.O1;
        tk4 tk4Var = this.x1;
        gd0 gd0Var = this.m1;
        TextView textView = this.o1;
        ?? r10 = this.D1;
        TextView textView2 = this.n1;
        TextView textView3 = this.E1;
        View view = this.B1;
        in inVar = this.C1;
        if (!z4) {
            gd0Var.c(z, 1.0f);
            view.setEnabled(false);
            hl.T3(textView3, false, 0.9f, false, z);
            hl.T3(textView2, false, 0.9f, false, z);
            hl.T3(view, false, 1.0f, false, z);
            hl.T3(inVar, false, 0.9f, false, z);
            hl.T3(r10, false, 0.9f, false, z);
            hl.T3(textView, false, 0.9f, false, z);
            hl.T3(tk4Var, true, 1.0f, true, z);
            return;
        }
        hl.T3(tk4Var, false, 1.0f, true, z);
        if (!K0()) {
            gd0Var.c(z, 1.0f);
            view.setEnabled(false);
            hl.T3(textView3, true, 0.9f, false, z);
            hl.T3(textView2, true, 0.9f, false, z);
            hl.T3(view, false, 1.0f, false, z);
            hl.T3(inVar, false, 0.9f, false, z);
            hl.T3(r10, false, 0.9f, false, z);
            hl.T3(textView, false, 0.9f, false, z);
            return;
        }
        gd0Var.c(z, 0.0f);
        view.setEnabled(true);
        ne2 ne2Var = this.F1;
        if (ne2Var == null || (ez3Var = ne2Var.a) == null || !ez3Var.a) {
            inVar.setText(ob6.M0(2131752212, null));
            if (chat != null && (tL_premium_boostsStatus = this.Y1) != null && tL_premium_boostsStatus.level < zu1Var.getMessagesController().k4.n2.f()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
                wm2 wm2Var = this.V1;
                if (wm2Var == null) {
                    wm2Var = new wm2(R.drawable.mini_switch_lock, 0);
                    this.V1 = wm2Var;
                    wm2Var.n = 1;
                }
                spannableStringBuilder.setSpan(wm2Var, 0, 1, 33);
                r17 = 1;
                spannableStringBuilder.append((CharSequence) " ").append((CharSequence) ob6.G(zu1Var.getMessagesController().k4.n2.f(), "ReactionLevelRequiredBtn", new Object[0]));
                r10.setText(spannableStringBuilder);
                z2 = true;
                z3 = (z || inVar.getAlpha() <= 0.8f) ? false : r17;
                valueAnimator = this.a2;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.a2 = null;
                }
                if (z3) {
                    this.Z1 = z2 ? 1.0f : 0.0f;
                    inVar.setTranslationY((-hl.L(7.0f)) * this.Z1);
                } else {
                    float f = this.Z1;
                    float f3 = z2 ? 1.0f : 0.0f;
                    float[] fArr = new float[2];
                    fArr[0] = f;
                    fArr[r17] = f3;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                    this.a2 = ofFloat;
                    ofFloat.addUpdateListener(new az1(this, (byte) 10));
                    this.a2.addListener(new z7((byte) 20, (Object) this, z2));
                    this.a2.start();
                }
                hl.T3(textView3, false, 0.9f, false, z);
                hl.T3(textView2, false, 0.9f, false, z);
                boolean z5 = r17;
                hl.T3(view, z5, 1.0f, false, z);
                hl.T3(inVar, z5, 0.9f, false, z);
                hl.S3(r10, z2, 0.9f, false, 0.7f, z, null);
                hl.T3(textView, z5, 0.9f, false, z);
            }
        } else {
            inVar.setText(ob6.M0(2131752179, null));
        }
        r17 = 1;
        z2 = false;
        if (z) {
        }
        valueAnimator = this.a2;
        if (valueAnimator != null) {
        }
        if (z3) {
        }
        hl.T3(textView3, false, 0.9f, false, z);
        hl.T3(textView2, false, 0.9f, false, z);
        boolean z52 = r17;
        hl.T3(view, z52, 1.0f, false, z);
        hl.T3(inVar, z52, 0.9f, false, z);
        hl.S3(r10, z2, 0.9f, false, 0.7f, z, null);
        hl.T3(textView, z52, 0.9f, false, z);
    }

    @Override // nx0
    public final boolean c0(MotionEvent motionEvent) {
        if (motionEvent == null || !K0()) {
            return false;
        }
        int x = (int) motionEvent.getX();
        if (((int) motionEvent.getY()) >= this.b.getTop() && x >= this.b.getLeft() && x <= this.b.getRight()) {
            return false;
        }
        this.u1.getFragmentView().dispatchTouchEvent(motionEvent);
        return true;
    }

    @Override // nx0
    public final void d0(float f) {
        lg5 lg5Var = this.N1;
        if (lg5Var != null) {
            lg5Var.a();
        }
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.l4) {
            jn7.f(this.a).d(new xd2(this, (byte) 0));
        }
    }

    @Override // nx0, android.app.Dialog, android.content.DialogInterface, ag0
    public final void dismiss() {
        jn7.e().n(this, jn7.l4);
        super.dismiss();
        this.u1.getClass();
        boolean z = this.H1;
        boolean z2 = this.t1;
        tqb G0 = (z || this.G1 == z2) ? null : G0();
        if (!this.H1) {
            xu1 xu1Var = this.r1;
            TLRPC.WallPaper wallPaper = xu1Var.g;
            if (wallPaper == null) {
                wallPaper = this.p1;
            }
            xu1Var.q(this.s1, wallPaper, G0 == null, Boolean.valueOf(z2), false);
        }
        if (this.G1 != z2) {
            znb E0 = aob.I.o() == z2 ? aob.I : E0(z2);
            if (this.c2) {
                T0(E0);
            } else {
                aob.t(E0, false, z2);
            }
        }
        this.c2 = false;
        S0(G0);
    }

    @Override // nx0, android.app.Dialog
    public final void onBackPressed() {
        H0();
    }

    @Override // nx0, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        ArrayList arrayList;
        super.onCreate(bundle);
        af2 e = af2.e(this.a);
        e.k(true);
        e.k(false);
        e.j(true);
        e.j(false);
        jn7.e().b(this, jn7.l4);
        this.H1 = false;
        byte b = 7;
        if (!e.f.c || (arrayList = e.b) == null || arrayList.isEmpty()) {
            L0();
        } else {
            M0(e.d(7));
        }
        if (this.u1.h() == null || xea.a1 <= 0 || this.u1.h().self) {
            return;
        }
        xea.a1--;
        a.b.getSharedPreferences("mainconfig", 0).edit().putInt("dayNightThemeSwitchHintCount", xea.a1).apply();
        lg5 lg5Var = new lg5(9, this.u1.getResourceProvider(), getContext(), false);
        this.N1 = lg5Var;
        lg5Var.setVisibility(4);
        this.N1.setShowingDuration(5000L);
        this.N1.setBottomOffset(-hl.L(8.0f));
        boolean z = this.G1;
        lg5 lg5Var2 = this.N1;
        if (z) {
            lg5Var2.setText(hl.S2(ob6.a0("ChatThemeDaySwitchTooltip", null, 2131752168, new Object[0])));
        } else {
            lg5Var2.setText(hl.S2(ob6.a0("ChatThemeNightSwitchTooltip", null, 2131752165, new Object[0])));
        }
        hl.d3(new xd2(this, b), 1500L);
        this.c.addView(this.N1, tre.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
    }

    @Override // nx0
    public final void p0() {
        int v0;
        super.p0();
        I0();
        try {
            if (Build.VERSION.SDK_INT < 30 || this.G0 != -1 || this.H0 == (v0 = aob.v0(aob.i5, this.J0))) {
                return;
            }
            this.H0 = v0;
            hl.o3(this, v0, false, null);
            hl.i3(this, ((double) hl.B(v0)) > 0.721d);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
