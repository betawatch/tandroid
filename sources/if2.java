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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class if2 extends my0 implements jm7 {
    public static final /* synthetic */ int f2 = 0;
    public final df2 A1;
    public final View B1;
    public final io C1;
    public final io D1;
    public final TextView E1;
    public hf2 F1;
    public boolean G1;
    public boolean H1;
    public boolean I1;
    public int J1;
    public vob K1;
    public float L1;
    public ValueAnimator M1;
    public ig5 N1;
    public boolean O1;
    public tz3 P1;
    public d Q1;
    public i22 R1;
    public su S1;
    public io T1;
    public boolean U1;
    public pn2 V1;
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
    public final ee0 m1;
    public final TextView n1;
    public final TextView o1;
    public TLRPC.WallPaper p1;
    public final gf2 q1;
    public final wv1 r1;
    public final tz3 s1;
    public final boolean t1;
    public final yv1 u1;
    public final r59 v1;
    public final u46 w1;
    public final tk4 x1;
    public final p09 y1;
    public final cj1 z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public if2(yv1 yv1Var, wv1 wv1Var) {
        super(1, (ylb) wv1Var, (Context) yv1Var.getParentActivity(), true);
        String str;
        byte b = 1;
        this.J1 = -1;
        this.W1 = false;
        this.X1 = false;
        this.Z1 = 0.0f;
        this.u1 = yv1Var;
        this.r1 = wv1Var;
        this.s1 = wv1Var.f;
        this.p1 = wv1Var.g;
        this.t1 = cmb.I.o();
        gf2 gf2Var = new gf2(this.a, yv1Var.a(), wv1Var, 0);
        this.q1 = gf2Var;
        this.p0 = false;
        this.c0 = false;
        this.w0 = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.G0 = -1;
            int i = cmb.h5;
            this.H0 = cmb.v0(i, this.J0);
            gm.o3(this, cmb.v0(i, this.J0), false, null);
            gm.i3(this, ((double) gm.B(this.H0)) > 0.721d);
        } else {
            L(cmb.h5);
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.O = frameLayout;
        TextView textView = new TextView(getContext());
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setText(jb6.M0(2131745385, null));
        td4.x(textView, cmb.i5, this.J0, 1, 20.0f);
        textView.setPadding(gm.L(12.0f), gm.L(6.0f), gm.L(12.0f), gm.L(8.0f));
        ImageView imageView = new ImageView(getContext());
        this.l1 = imageView;
        int L = gm.L(10.0f);
        imageView.setPadding(L, L, L, L);
        ee0 ee0Var = new ee0(false);
        this.m1 = ee0Var;
        imageView.setImageDrawable(ee0Var);
        imageView.setOnClickListener(new se2(this, b));
        frameLayout.addView(imageView, qoe.d(44, 44.0f, 8388659, 4.0f, -2.0f, 62.0f, 12.0f));
        frameLayout.addView(textView, qoe.d(-1, -2.0f, 8388659, 44.0f, 0.0f, 62.0f, 0.0f));
        int i2 = cmb.Ei;
        int v0 = cmb.v0(i2, this.J0);
        int L2 = gm.L(28.0f);
        p09 p09Var = new p09(R.raw.sun_outline, L2, L2, false, null);
        this.y1 = p09Var;
        this.G1 = !cmb.I.o();
        O0(cmb.I.o(), false);
        p09Var.E(true);
        p09Var.h = true;
        this.d2 = v0;
        p09Var.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.MULTIPLY));
        cj1 cj1Var = new cj1((byte) 1, getContext(), this);
        this.z1 = cj1Var;
        cj1Var.setAnimation(p09Var);
        cj1Var.setScaleType(ImageView.ScaleType.CENTER);
        cj1Var.setOnClickListener(new se2(this, (byte) 2));
        frameLayout.addView(cj1Var, qoe.d(44, 44.0f, 8388661, 0.0f, -2.0f, 7.0f, 0.0f));
        this.A1 = new df2(getContext());
        r59 r59Var = new r59(getContext(), null);
        this.v1 = r59Var;
        r59Var.setAdapter(gf2Var);
        r59Var.setDrawSelection(false);
        r59Var.setClipChildren(false);
        r59Var.setClipToPadding(false);
        r59Var.setHasFixedSize(true);
        r59Var.setItemAnimator(null);
        r59Var.setNestedScrollingEnabled(false);
        getContext();
        u46 u46Var = new u46(0, false);
        this.w1 = u46Var;
        r59Var.setLayoutManager(u46Var);
        r59Var.setPadding(gm.L(12.0f), 0, gm.L(12.0f), 0);
        r59Var.setOnItemClickListener(new u(this, (byte) 13));
        r59Var.setOnScrollListener(new y(this, (byte) 27));
        tk4 tk4Var = new tk4(getContext(), this.J0);
        this.x1 = tk4Var;
        tk4Var.setViewType(14);
        tk4Var.setVisibility(0);
        frameLayout.addView(tk4Var, qoe.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        frameLayout.addView(r59Var, qoe.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        View view = new View(getContext());
        this.B1 = view;
        int L3 = gm.L(6.0f);
        int v02 = cmb.v0(i2, this.J0);
        int i3 = cmb.Gi;
        int v03 = cmb.v0(i3, this.J0);
        Drawable i0 = cmb.i0(L3, L3, L3, L3, v02, v03, v03);
        wmb M = anb.M(i2);
        wmb M2 = anb.M(i3);
        ylb ylbVar = this.J0;
        view.setBackground(i0);
        anb.j(view, i0, M, M2, ylbVar);
        view.setOnClickListener(new se2(this, (byte) 3));
        frameLayout.addView(view, qoe.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(getContext());
        this.E1 = textView2;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(17);
        textView2.setLines(1);
        textView2.setSingleLine(true);
        if (this.p1 == null) {
            textView2.setText(jb6.M0(2131752075, null));
        } else {
            textView2.setText(jb6.M0(2131752077, null));
        }
        textView2.setTextSize(1, 15.0f);
        textView2.setOnClickListener(new g6(this, (byte) 4));
        frameLayout.addView(textView2, qoe.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        io ioVar = new io(getContext(), true, true, true);
        this.C1 = ioVar;
        ioVar.getDrawable().q(true);
        ioVar.n = false;
        ioVar.setGravity(17);
        int i4 = cmb.Ii;
        anb.U(ioVar, i4, this.J0);
        ioVar.setTextSize(gm.L(15.0f));
        ioVar.setTypeface(gm.o());
        frameLayout.addView(ioVar, qoe.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        io ioVar2 = new io(getContext(), true, true, true);
        this.D1 = ioVar2;
        ioVar2.getDrawable().q(true);
        ioVar2.n = false;
        ioVar2.setGravity(17);
        anb.U(ioVar2, i4, this.J0);
        ioVar2.setTextSize(gm.L(12.0f));
        ioVar2.setAlpha(0.0f);
        ioVar2.setTranslationY(gm.L(11.0f));
        frameLayout.addView(ioVar2, qoe.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        if (this.p1 != null) {
            TextView textView3 = new TextView(getContext());
            this.n1 = textView3;
            textView3.setEllipsize(truncateAt);
            textView3.setGravity(17);
            textView3.setLines(1);
            textView3.setSingleLine(true);
            textView3.setText(jb6.M0(2131745818, null));
            textView3.setTextSize(1, 15.0f);
            textView3.setOnClickListener(new rc1((Object) this, (Object) yv1Var, (byte) 19));
            frameLayout.addView(textView3, qoe.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
            TextView textView4 = new TextView(getContext());
            this.o1 = textView4;
            textView4.setEllipsize(truncateAt);
            textView4.setGravity(17);
            textView4.setLines(1);
            textView4.setSingleLine(true);
            if (yv1Var.h() != null) {
                str = m9c.k(yv1Var.h(), true);
            } else {
                TLRPC.Chat chat = yv1Var.e;
                str = chat != null ? chat.title : "";
            }
            textView4.setText(jb6.a0("ChatThemeApplyHint", null, 2131752143, str));
            textView4.setTextSize(1, 15.0f);
            frameLayout.addView(textView4, qoe.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
        }
        T0();
        U0(false);
    }

    public static bmb D0(boolean z) {
        SharedPreferences sharedPreferences = a.b.getSharedPreferences("themeconfig", 0);
        String str = "Blue";
        String string = sharedPreferences.getString("lastDayTheme", "Blue");
        if (cmb.O0(string) != null && !cmb.O0(string).o()) {
            str = string;
        }
        String str2 = "Dark Blue";
        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
        if (cmb.O0(string2) != null && cmb.O0(string2).o()) {
            str2 = string2;
        }
        return z ? cmb.O0(str2) : cmb.O0(str);
    }

    public static void R0(vob vobVar) {
        if (vobVar == null) {
            return;
        }
        float width = vobVar.getWidth() / 2.0f;
        float width2 = vobVar.getWidth();
        float height = vobVar.getHeight();
        float max = Math.max(width, width2 - width);
        float max2 = Math.max(0.0f, height - 0.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(vobVar, vob.x, 0.0f, ((float) Math.sqrt((max2 * max2) + (max * max))) / 0.6f);
        ofFloat.setDuration(450L);
        ofFloat.setInterpolator(vt3.e);
        ofFloat.addListener(new b91((Object) vobVar, (byte) 27));
        ofFloat.start();
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
    public final void E0(boolean z) {
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
        yv1 yv1Var = this.u1;
        if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < yv1Var.getMessagesController().l4.f2.f()) {
            yv1Var.getMessagesController().F0().b(yv1Var.a(), this.Y1, new te2(this, b));
            return;
        }
        tz3 tz3Var = this.F1.a;
        u31 u31Var = null;
        if (tz3Var != this.P1) {
            TLRPC.ChatTheme chatTheme2 = !tz3Var.a ? tz3Var.d : null;
            if (tz3Var.d instanceof TLRPC.TL_chatThemeUniqueGift) {
                Long l = (Long) uf2.e(tz3Var.g).r.get(((TLRPC.TL_chatThemeUniqueGift) tz3Var.d).gift.slug);
                if (l != null) {
                    j = l.longValue();
                    chatTheme = tz3Var.d;
                    if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                        TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                        if (starGift instanceof TL_stars.TL_starGiftUnique) {
                            tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                            if (j == 0 && tL_starGiftUnique != null && !z) {
                                ik.k0(getContext(), this.J0, this.a, tL_starGiftUnique, j, new re2(this, b));
                                return;
                            }
                            uf2.e(this.a).a(yv1Var.a(), false, false);
                            uf2.e(this.a).q(yv1Var.a(), fnb.c(chatTheme2), chatTheme2, true);
                            TLRPC.WallPaper wallPaper = J0() ? null : this.r1.g;
                            boolean z4 = this.G1;
                            boolean z5 = this.t1;
                            vob F0 = z4 != z5 ? F0() : null;
                            z2 = tz3Var.a;
                            wv1 wv1Var = this.r1;
                            if (z2) {
                                c = 0;
                                wv1Var.q(null, wallPaper, F0 == null, Boolean.valueOf(z5), false);
                            } else {
                                c = 0;
                                wv1Var.q(tz3Var, wallPaper, F0 == null, Boolean.valueOf(z5), false);
                            }
                            R0(F0);
                            this.H1 = true;
                            h = yv1Var.h();
                            if (h != null && !h.self) {
                                z3 = tz3Var.a;
                                o1b o1bVar = new o1b(getContext(), null, 1, -1, tz3Var.e(), yv1Var.getResourceProvider());
                                o1bVar.c.setVisibility(8);
                                String str = h.first_name;
                                TextView textView = o1bVar.b;
                                if (z3) {
                                    Object[] objArr = new Object[1];
                                    objArr[c] = str;
                                    hg9.q("ThemeAlsoAppliedForHint", null, 2131743874, objArr, textView);
                                } else {
                                    Object[] objArr2 = new Object[1];
                                    objArr2[c] = str;
                                    hg9.q("ThemeAlsoDisabledForHint", null, 2131743873, objArr2, textView);
                                }
                                textView.setTypeface(null);
                                u31Var = u31.g(yv1Var, o1bVar, 2750);
                            }
                        }
                    }
                    tL_starGiftUnique = null;
                    if (j == 0) {
                    }
                    uf2.e(this.a).a(yv1Var.a(), false, false);
                    uf2.e(this.a).q(yv1Var.a(), fnb.c(chatTheme2), chatTheme2, true);
                    if (J0()) {
                    }
                    boolean z42 = this.G1;
                    boolean z52 = this.t1;
                    if (z42 != z52) {
                    }
                    z2 = tz3Var.a;
                    wv1 wv1Var2 = this.r1;
                    if (z2) {
                    }
                    R0(F0);
                    this.H1 = true;
                    h = yv1Var.h();
                    if (h != null) {
                        z3 = tz3Var.a;
                        o1b o1bVar2 = new o1b(getContext(), null, 1, -1, tz3Var.e(), yv1Var.getResourceProvider());
                        o1bVar2.c.setVisibility(8);
                        String str2 = h.first_name;
                        TextView textView2 = o1bVar2.b;
                        if (z3) {
                        }
                        textView2.setTypeface(null);
                        u31Var = u31.g(yv1Var, o1bVar2, 2750);
                    }
                }
            }
            j = 0;
            chatTheme = tz3Var.d;
            if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
            }
            tL_starGiftUnique = null;
            if (j == 0) {
            }
            uf2.e(this.a).a(yv1Var.a(), false, false);
            uf2.e(this.a).q(yv1Var.a(), fnb.c(chatTheme2), chatTheme2, true);
            if (J0()) {
            }
            boolean z422 = this.G1;
            boolean z522 = this.t1;
            if (z422 != z522) {
            }
            z2 = tz3Var.a;
            wv1 wv1Var22 = this.r1;
            if (z2) {
            }
            R0(F0);
            this.H1 = true;
            h = yv1Var.h();
            if (h != null) {
            }
        }
        dismiss();
        if (u31Var != null) {
            u31Var.j();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final vob F0() {
        Bitmap bitmap;
        Bitmap bitmap2;
        yv1 yv1Var = this.u1;
        Activity parentActivity = yv1Var != null ? yv1Var.getParentActivity() : null;
        if (parentActivity == null || parentActivity.getWindow() == null || !(parentActivity.getWindow().getDecorView() instanceof FrameLayout)) {
            return null;
        }
        FrameLayout frameLayout = (FrameLayout) parentActivity.getWindow().getDecorView();
        if (frameLayout.getWidth() <= 0 || frameLayout.getHeight() <= 0) {
            return null;
        }
        try {
            bitmap2 = Build.VERSION.SDK_INT >= 26 ? gm.A0(parentActivity.getWindow()) : null;
            if (bitmap2 == null) {
                try {
                    bitmap2 = gm.H3(frameLayout);
                } catch (Throwable th) {
                    bitmap = bitmap2;
                    th = th;
                    fc4.g(th, true);
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
        vob vobVar = new vob(parentActivity);
        vobVar.setScaleType(ImageView.ScaleType.MATRIX);
        vobVar.setImageBitmap(bitmap2);
        vobVar.b(frameLayout.getWidth() / 2.0f, 0.0f, true);
        vobVar.setRadius(0.0f);
        frameLayout.addView(vobVar, new FrameLayout.LayoutParams(-1, -1));
        return vobVar;
    }

    public final void G0() {
        if (!J0()) {
            dismiss();
            return;
        }
        final byte b = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.J0, getContext());
        String M0 = jb6.M0(2131752133, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        heVar.U = jb6.M0(2131752134, null);
        alertDialog$Builder.j(jb6.M0(2131752136, null), new ee(this) { // from class: ue2
            public final /* synthetic */ if2 b;

            {
                this.b = this;
            }

            @Override // ee
            public final void r(he heVar2, int i) {
                byte b2 = b;
                if2 if2Var = this.b;
                switch (b2) {
                    case 0:
                        if2Var.E0(false);
                        break;
                    default:
                        if2Var.dismiss();
                        break;
                }
            }
        });
        final byte b2 = 1;
        alertDialog$Builder.g(jb6.M0(2131752135, null), new ee(this) { // from class: ue2
            public final /* synthetic */ if2 b;

            {
                this.b = this;
            }

            @Override // ee
            public final void r(he heVar2, int i) {
                byte b22 = b2;
                if2 if2Var = this.b;
                switch (b22) {
                    case 0:
                        if2Var.E0(false);
                        break;
                    default:
                        if2Var.dismiss();
                        break;
                }
            }
        });
        alertDialog$Builder.o();
    }

    public final void H0() {
        try {
            int v0 = cmb.v0(cmb.Ei, this.J0);
            p09 p09Var = this.y1;
            if (p09Var != null && v0 != this.d2) {
                this.d2 = v0;
                p09Var.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.MULTIPLY));
            }
            ee0 ee0Var = this.m1;
            if (ee0Var != null) {
                int i = cmb.i5;
                ee0Var.a(cmb.v0(i, this.J0));
                ee0Var.b(cmb.v0(i, this.J0));
                ImageView imageView = this.l1;
                if (imageView != null) {
                    imageView.invalidate();
                }
            }
            int v02 = cmb.v0(cmb.g5, this.J0);
            if (v02 != this.e2) {
                this.e2 = v02;
                s0(v02);
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void I0() {
        if (this.J || this.H1) {
            return;
        }
        cmb.b = false;
        TLRPC.WallPaper wallPaper = J0() ? null : this.r1.g;
        tz3 tz3Var = this.F1.a;
        boolean z = tz3Var.a;
        boolean z2 = this.G1;
        wv1 wv1Var = this.r1;
        if (z) {
            wv1Var.q(null, wallPaper, false, Boolean.valueOf(z2), true);
        } else {
            wv1Var.q(tz3Var, wallPaper, false, Boolean.valueOf(z2), true);
        }
        i22 i22Var = this.R1;
        if (i22Var != null) {
            h32 h32Var = i22Var.l2;
            if (h32Var != null) {
                boolean z3 = this.G1;
                kz0 kz0Var = h32Var.w;
                ((ArrayList) kz0Var.e).clear();
                WallpapersListActivity.A0((ArrayList) kz0Var.e, z3);
                kz0Var.f();
            }
            this.R1.H0();
        }
        gf2 gf2Var = this.q1;
        if (gf2Var == null || gf2Var.d == null) {
            return;
        }
        for (int i = 0; i < gf2Var.d.size(); i++) {
            ((hf2) gf2Var.d.get(i)).c = this.G1 ? 1 : 0;
        }
        gf2Var.f();
    }

    public final boolean J0() {
        if (this.F1 == null) {
            return false;
        }
        tz3 tz3Var = this.P1;
        fnb fnbVar = tz3Var != null ? tz3Var.c : null;
        if (fnbVar == null) {
            fnbVar = fnb.d("❌");
        }
        tz3 tz3Var2 = this.F1.a;
        fnb fnbVar2 = tz3Var2 != null ? tz3Var2.c : null;
        if (fnbVar2 == null) {
            fnbVar2 = fnb.d("❌");
        }
        return !fnb.a(fnbVar, fnbVar2);
    }

    public final void K0() {
        ArrayList arrayList;
        if (this.U1) {
            return;
        }
        uf2 e = uf2.e(this.a);
        if (!e.f.c || (arrayList = e.b) == null || arrayList.isEmpty()) {
            this.U1 = true;
            byte b = 0;
            if (e.f.c) {
                e.o(new ef2(this, e), false);
                return;
            }
            ff2 ff2Var = new ff2(this, e);
            long currentTimeMillis = System.currentTimeMillis();
            tf2 tf2Var = e.f;
            boolean z = currentTimeMillis - tf2Var.b > 7200000;
            if (((ArrayList) tf2Var.d) == null || !tf2Var.c || z) {
                TL_account.Tl_getUniqueGiftChatThemes tl_getUniqueGiftChatThemes = new TL_account.Tl_getUniqueGiftChatThemes();
                tf2 tf2Var2 = e.f;
                tl_getUniqueGiftChatThemes.offset = (String) tf2Var2.e;
                tl_getUniqueGiftChatThemes.hash = tf2Var2.a;
                tl_getUniqueGiftChatThemes.limit = 50;
                ConnectionsManager connectionsManager = e.getConnectionsManager();
                mp3 mp3Var = uf2.s;
                Objects.requireNonNull(mp3Var);
                connectionsManager.sendRequestTyped(tl_getUniqueGiftChatThemes, new rf2(mp3Var, b), new lf2(e, ff2Var, b));
            }
        }
    }

    public final void L0(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        hf2 hf2Var = new hf2((tz3) arrayList.get(0));
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        if (!this.O1) {
            tz3 tz3Var = this.r1.f;
            this.P1 = tz3Var;
            if (tz3Var != null) {
                tz3Var.k();
            }
        }
        arrayList2.add(0, hf2Var);
        if (!this.O1) {
            this.F1 = hf2Var;
        }
        tz3 tz3Var2 = this.P1;
        fnb fnbVar = tz3Var2 != null ? tz3Var2.c : null;
        boolean z = false;
        int i = 1;
        while (i < arrayList.size()) {
            tz3 tz3Var3 = (tz3) arrayList.get(i);
            hf2 hf2Var2 = new hf2(tz3Var3);
            tz3Var3.m(this.a);
            hf2Var2.c = this.G1 ? 1 : 0;
            if (fnb.a(tz3Var3.c, fnbVar)) {
                arrayList2.add(1, hf2Var2);
                z = true;
            } else {
                arrayList2.add(hf2Var2);
            }
            i++;
            z = z;
        }
        tz3 tz3Var4 = this.P1;
        if (tz3Var4 != null && !z) {
            hf2 hf2Var3 = new hf2(tz3Var4);
            tz3Var4.m(this.a);
            hf2Var3.c = this.G1 ? 1 : 0;
            arrayList2.add(1, hf2Var3);
        }
        gf2 gf2Var = this.q1;
        gf2Var.d = arrayList2;
        gf2Var.f();
        this.z1.setVisibility(0);
        if (!this.O1) {
            N0(false);
            this.v1.animate().alpha(1.0f).setDuration(150L).start();
        }
        this.O1 = true;
        U0(true);
    }

    public final void M0() {
        if (this.J || this.H1) {
            return;
        }
        this.I1 = false;
        this.u1.getClass();
        TLRPC.WallPaper wallPaper = J0() ? null : this.p1;
        tz3 tz3Var = this.F1.a;
        boolean z = tz3Var.a;
        boolean z2 = this.G1;
        wv1 wv1Var = this.r1;
        if (z) {
            wv1Var.q(null, wallPaper, true, Boolean.valueOf(z2), false);
        } else {
            wv1Var.q(tz3Var, wallPaper, true, Boolean.valueOf(z2), false);
        }
    }

    public final void N0(boolean z) {
        gf2 gf2Var = this.q1;
        ArrayList arrayList = gf2Var.d;
        tz3 tz3Var = this.P1;
        u46 u46Var = this.w1;
        r59 r59Var = this.v1;
        if (tz3Var != null) {
            int i = 0;
            while (true) {
                if (i == arrayList.size()) {
                    i = -1;
                    break;
                } else {
                    if (fnb.a(((hf2) arrayList.get(i)).a.c, this.P1.c)) {
                        this.F1 = (hf2) arrayList.get(i);
                        break;
                    }
                    i++;
                }
            }
            if (i != -1) {
                this.J1 = i;
                gf2Var.E(i);
                if (i > 0 && i < arrayList.size() / 2) {
                    i--;
                }
                int min = Math.min(i, gf2Var.d.size() - 1);
                if (z) {
                    r59Var.z0(min);
                } else {
                    u46Var.g1(min, 0);
                }
            }
        } else {
            this.F1 = (hf2) arrayList.get(0);
            gf2Var.E(0);
            if (z) {
                r59Var.z0(0);
            } else {
                u46Var.g1(0, 0);
            }
        }
        M0();
    }

    public final void O0(boolean z, boolean z2) {
        if (this.G1 != z) {
            this.G1 = z;
            cj1 cj1Var = this.z1;
            p09 p09Var = this.y1;
            if (z2) {
                p09Var.K(z ? p09Var.e[0] : 0);
                if (cj1Var != null) {
                    cj1Var.d();
                    return;
                }
                return;
            }
            int i = z ? p09Var.e[0] - 1 : 0;
            p09Var.I(i, false, true);
            p09Var.K(i);
            if (cj1Var != null) {
                cj1Var.invalidate();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P0(boolean z) {
        char c;
        Bitmap bitmap;
        if (this.J || this.b2) {
            return;
        }
        ValueAnimator valueAnimator = this.M1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        yv1 yv1Var = this.u1;
        FrameLayout frameLayout = (FrameLayout) yv1Var.getParentActivity().getWindow().getDecorView();
        FrameLayout frameLayout2 = (FrameLayout) getWindow().getDecorView();
        Window window = yv1Var.getParentActivity().getWindow();
        Window window2 = getWindow();
        byte b = 26;
        if (Build.VERSION.SDK_INT >= 26 && frameLayout2.getWidth() > 0 && frameLayout2.getHeight() > 0) {
            Bitmap A0 = gm.A0(window);
            Bitmap A02 = A0 != null ? gm.A0(window2) : null;
            if (A0 != null) {
                if (A02 != null) {
                    frameLayout.getLocationOnScreen(new int[2]);
                    frameLayout2.getLocationOnScreen(new int[2]);
                    c = 0;
                    bitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmap);
                    canvas.drawBitmap(A0, r6[0] - r13[0], r6[1] - r13[1], (Paint) null);
                    canvas.drawBitmap(A02, 0.0f, 0.0f, (Paint) null);
                    A0.recycle();
                    A02.recycle();
                    cj1 cj1Var = this.z1;
                    if (bitmap == null) {
                        vob.a(bitmap, null, cj1Var);
                    } else {
                        bitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas2 = new Canvas(bitmap);
                        cj1Var.setAlpha(0.0f);
                        frameLayout.draw(canvas2);
                        frameLayout2.draw(canvas2);
                        cj1Var.setAlpha(1.0f);
                    }
                    cj1Var.getLocationInWindow(new int[2]);
                    float measuredWidth = (cj1Var.getMeasuredWidth() / 2.0f) + r3[c];
                    float measuredHeight = (cj1Var.getMeasuredHeight() / 2.0f) + r3[1];
                    float width = bitmap.getWidth();
                    float height = bitmap.getHeight();
                    ny1 ny1Var = vob.x;
                    float max = Math.max(measuredWidth, width - measuredWidth);
                    float max2 = Math.max(measuredHeight, height - measuredHeight);
                    float sqrt = ((float) Math.sqrt((max2 * max2) + (max * max))) / 0.6f;
                    vob vobVar = new vob(getContext());
                    vobVar.setScaleType(ImageView.ScaleType.MATRIX);
                    vobVar.setImageBitmap(bitmap);
                    vobVar.b(measuredWidth, measuredHeight, z);
                    ColorFilter colorFilter = this.y1.getColorFilter();
                    vobVar.n = cj1Var;
                    vobVar.r = colorFilter;
                    vobVar.setRadius(!z ? 0.0f : sqrt);
                    this.K1 = vobVar;
                    vobVar.setOnTouchListener(new w02((byte) 4));
                    this.L1 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.M1 = ofFloat;
                    ofFloat.addUpdateListener(new we2(this, vobVar, sqrt, z));
                    this.M1.addListener(new b91(this, b));
                    this.M1.setDuration(400L);
                    this.M1.setInterpolator(vt3.e);
                    this.M1.start();
                    frameLayout2.addView(this.K1, new ViewGroup.LayoutParams(-1, -1));
                    gm.c3(new y8c((byte) 12, this, z));
                }
                A0.recycle();
            }
        }
        c = 0;
        bitmap = null;
        cj1 cj1Var2 = this.z1;
        if (bitmap == null) {
        }
        cj1Var2.getLocationInWindow(new int[2]);
        float measuredWidth2 = (cj1Var2.getMeasuredWidth() / 2.0f) + r3[c];
        float measuredHeight2 = (cj1Var2.getMeasuredHeight() / 2.0f) + r3[1];
        float width2 = bitmap.getWidth();
        float height2 = bitmap.getHeight();
        ny1 ny1Var2 = vob.x;
        float max3 = Math.max(measuredWidth2, width2 - measuredWidth2);
        float max22 = Math.max(measuredHeight2, height2 - measuredHeight2);
        float sqrt2 = ((float) Math.sqrt((max22 * max22) + (max3 * max3))) / 0.6f;
        vob vobVar2 = new vob(getContext());
        vobVar2.setScaleType(ImageView.ScaleType.MATRIX);
        vobVar2.setImageBitmap(bitmap);
        vobVar2.b(measuredWidth2, measuredHeight2, z);
        ColorFilter colorFilter2 = this.y1.getColorFilter();
        vobVar2.n = cj1Var2;
        vobVar2.r = colorFilter2;
        vobVar2.setRadius(!z ? 0.0f : sqrt2);
        this.K1 = vobVar2;
        vobVar2.setOnTouchListener(new w02((byte) 4));
        this.L1 = 0.0f;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.M1 = ofFloat2;
        ofFloat2.addUpdateListener(new we2(this, vobVar2, sqrt2, z));
        this.M1.addListener(new b91(this, b));
        this.M1.setDuration(400L);
        this.M1.setInterpolator(vt3.e);
        this.M1.start();
        frameLayout2.addView(this.K1, new ViewGroup.LayoutParams(-1, -1));
        gm.c3(new y8c((byte) 12, this, z));
    }

    public final void Q0(rob robVar) {
        bh0 bh0Var = new bh0();
        bh0Var.a = true;
        yv1 yv1Var = this.u1;
        robVar.a.a = yv1Var.getResourceProvider();
        robVar.r1 = new cf2(this);
        bh0Var.c = new jd((byte) 24);
        bh0Var.d = new re2(this, (byte) 5);
        bh0Var.b = new re2(this, (byte) 6);
        bh0Var.e = true;
        this.Q1 = robVar;
        yv1Var.showAsSheet(robVar, bh0Var);
    }

    @Override // my0
    public final ArrayList R() {
        ve2 ve2Var = new ve2(this);
        ArrayList arrayList = new ArrayList();
        if (this.u1.w7) {
            d dVar = this.Q1;
            if (dVar instanceof rob) {
                arrayList.addAll(((rob) dVar).U0());
                return arrayList;
            }
        }
        i22 i22Var = this.R1;
        if (i22Var != null) {
            arrayList.addAll(i22Var.R());
        }
        int i = 0;
        arrayList.add(new cnb((View) null, 32, (Class[]) null, (Paint) null, new Drawable[]{this.s0}, ve2Var, cmb.g5));
        int i2 = cmb.Ei;
        View view = this.B1;
        arrayList.add(new cnb(view, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i2));
        arrayList.add(new cnb(view, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Gi));
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((cnb) obj).n = this.r1;
        }
        return arrayList;
    }

    public final void S0(bmb bmbVar) {
        if (bmbVar == null || bmbVar == cmb.I) {
            return;
        }
        this.b2 = true;
        try {
            nm7.e().k(nm7.x4, bmbVar, Boolean.FALSE, null, -1);
        } finally {
            this.b2 = false;
        }
    }

    public final void T0() {
        TextView textView = this.o1;
        if (textView != null) {
            anb.X(textView, cmb.o5, this.J0);
            int L = gm.L(6.0f);
            int i = cmb.Ei;
            int p = on2.p(cmb.v0(i, this.J0), 76);
            fg0 i0 = cmb.i0(L, L, L, L, 0, p, p);
            wmb g = anb.g(i, 76);
            ylb ylbVar = this.J0;
            textView.setBackground(i0);
            anb.j(textView, i0, null, g, ylbVar);
        }
        TextView textView2 = this.n1;
        if (textView2 != null) {
            int i2 = cmb.o7;
            anb.X(textView2, i2, this.J0);
            int L2 = gm.L(6.0f);
            int p2 = on2.p(cmb.v0(i2, this.J0), 76);
            fg0 i02 = cmb.i0(L2, L2, L2, L2, 0, p2, p2);
            wmb g2 = anb.g(i2, 76);
            ylb ylbVar2 = this.J0;
            textView2.setBackground(i02);
            anb.j(textView2, i02, null, g2, ylbVar2);
        }
        int i3 = cmb.i5;
        fg0 f0 = cmb.f0(on2.p(cmb.v0(i3, this.J0), 30), 1, -1);
        wmb g3 = anb.g(i3, 30);
        ylb ylbVar3 = this.J0;
        ImageView imageView = this.l1;
        anb.R(imageView, f0, null, g3, ylbVar3);
        int v0 = cmb.v0(i3, this.J0);
        ee0 ee0Var = this.m1;
        ee0Var.a(v0);
        ee0Var.b(cmb.v0(i3, this.J0));
        imageView.invalidate();
        int i4 = cmb.Ei;
        anb.R(this.z1, cmb.f0(on2.p(cmb.v0(i4, this.J0), 30), 1, -1), null, anb.g(i4, 30), this.J0);
        int i5 = cmb.l5;
        ylb ylbVar4 = this.J0;
        TextView textView3 = this.E1;
        anb.X(textView3, i5, ylbVar4);
        int L3 = gm.L(6.0f);
        int p3 = on2.p(cmb.v0(i4, this.J0), 76);
        anb.R(textView3, cmb.i0(L3, L3, L3, L3, 0, p3, p3), null, anb.g(i4, 76), this.J0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013f  */
    /* JADX WARN: Type inference failed for: r10v0, types: [android.view.View, io] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U0(boolean z) {
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus;
        ?? r17;
        boolean z2;
        boolean z3;
        ValueAnimator valueAnimator;
        tz3 tz3Var;
        yv1 yv1Var = this.u1;
        TLRPC.Chat chat = yv1Var.e;
        byte b = 0;
        if (chat != null && !this.W1 && !this.X1 && this.Y1 == null) {
            this.W1 = true;
            yv1Var.getMessagesController().F0().a(yv1Var.a(), new te2(this, b));
        }
        boolean z4 = this.O1;
        tk4 tk4Var = this.x1;
        ee0 ee0Var = this.m1;
        TextView textView = this.o1;
        ?? r10 = this.D1;
        TextView textView2 = this.n1;
        TextView textView3 = this.E1;
        View view = this.B1;
        io ioVar = this.C1;
        if (!z4) {
            ee0Var.c(z, 1.0f);
            view.setEnabled(false);
            gm.T3(textView3, false, 0.9f, false, z);
            gm.T3(textView2, false, 0.9f, false, z);
            gm.T3(view, false, 1.0f, false, z);
            gm.T3(ioVar, false, 0.9f, false, z);
            gm.T3(r10, false, 0.9f, false, z);
            gm.T3(textView, false, 0.9f, false, z);
            gm.T3(tk4Var, true, 1.0f, true, z);
            return;
        }
        gm.T3(tk4Var, false, 1.0f, true, z);
        if (!J0()) {
            ee0Var.c(z, 1.0f);
            view.setEnabled(false);
            gm.T3(textView3, true, 0.9f, false, z);
            gm.T3(textView2, true, 0.9f, false, z);
            gm.T3(view, false, 1.0f, false, z);
            gm.T3(ioVar, false, 0.9f, false, z);
            gm.T3(r10, false, 0.9f, false, z);
            gm.T3(textView, false, 0.9f, false, z);
            return;
        }
        ee0Var.c(z, 0.0f);
        view.setEnabled(true);
        hf2 hf2Var = this.F1;
        if (hf2Var == null || (tz3Var = hf2Var.a) == null || !tz3Var.a) {
            ioVar.setText(jb6.M0(2131752184, null));
            if (chat != null && (tL_premium_boostsStatus = this.Y1) != null && tL_premium_boostsStatus.level < yv1Var.getMessagesController().l4.f2.f()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
                pn2 pn2Var = this.V1;
                if (pn2Var == null) {
                    pn2Var = new pn2(R.drawable.mini_switch_lock, 0);
                    this.V1 = pn2Var;
                    pn2Var.n = 1;
                }
                spannableStringBuilder.setSpan(pn2Var, 0, 1, 33);
                r17 = 1;
                spannableStringBuilder.append((CharSequence) " ").append((CharSequence) jb6.G(yv1Var.getMessagesController().l4.f2.f(), "ReactionLevelRequiredBtn", new Object[0]));
                r10.setText(spannableStringBuilder);
                z2 = true;
                z3 = (z || ioVar.getAlpha() <= 0.8f) ? false : r17;
                valueAnimator = this.a2;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.a2 = null;
                }
                if (z3) {
                    this.Z1 = z2 ? 1.0f : 0.0f;
                    ioVar.setTranslationY((-gm.L(7.0f)) * this.Z1);
                } else {
                    float f = this.Z1;
                    float f3 = z2 ? 1.0f : 0.0f;
                    float[] fArr = new float[2];
                    fArr[0] = f;
                    fArr[r17] = f3;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                    this.a2 = ofFloat;
                    ofFloat.addUpdateListener(new et1(this, (byte) 11));
                    this.a2.addListener(new y7((byte) 20, (Object) this, z2));
                    this.a2.start();
                }
                gm.T3(textView3, false, 0.9f, false, z);
                gm.T3(textView2, false, 0.9f, false, z);
                boolean z5 = r17;
                gm.T3(view, z5, 1.0f, false, z);
                gm.T3(ioVar, z5, 0.9f, false, z);
                gm.S3(r10, z2, 0.9f, false, 0.7f, z, null);
                gm.T3(textView, z5, 0.9f, false, z);
            }
        } else {
            ioVar.setText(jb6.M0(2131752151, null));
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
        gm.T3(textView3, false, 0.9f, false, z);
        gm.T3(textView2, false, 0.9f, false, z);
        boolean z52 = r17;
        gm.T3(view, z52, 1.0f, false, z);
        gm.T3(ioVar, z52, 0.9f, false, z);
        gm.S3(r10, z2, 0.9f, false, 0.7f, z, null);
        gm.T3(textView, z52, 0.9f, false, z);
    }

    @Override // my0
    public final boolean c0(MotionEvent motionEvent) {
        if (motionEvent == null || !J0()) {
            return false;
        }
        int x = (int) motionEvent.getX();
        if (((int) motionEvent.getY()) >= this.b.getTop() && x >= this.b.getLeft() && x <= this.b.getRight()) {
            return false;
        }
        this.u1.getFragmentView().dispatchTouchEvent(motionEvent);
        return true;
    }

    @Override // my0
    public final void d0(float f) {
        ig5 ig5Var = this.N1;
        if (ig5Var != null) {
            ig5Var.a();
        }
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.m4) {
            nm7.f(this.a).d(new re2(this, (byte) 0));
        }
    }

    @Override // my0, android.app.Dialog, android.content.DialogInterface, ah0
    public final void dismiss() {
        nm7.e().n(this, nm7.m4);
        super.dismiss();
        this.u1.getClass();
        boolean z = this.H1;
        boolean z2 = this.t1;
        vob F0 = (z || this.G1 == z2) ? null : F0();
        if (!this.H1) {
            wv1 wv1Var = this.r1;
            TLRPC.WallPaper wallPaper = wv1Var.g;
            if (wallPaper == null) {
                wallPaper = this.p1;
            }
            wv1Var.q(this.s1, wallPaper, F0 == null, Boolean.valueOf(z2), false);
        }
        if (this.G1 != z2) {
            bmb D0 = cmb.I.o() == z2 ? cmb.I : D0(z2);
            if (this.c2) {
                S0(D0);
            } else {
                cmb.t(D0, false, z2);
            }
        }
        this.c2 = false;
        R0(F0);
    }

    @Override // my0, android.app.Dialog
    public final void onBackPressed() {
        G0();
    }

    @Override // my0, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        ArrayList arrayList;
        super.onCreate(bundle);
        uf2 e = uf2.e(this.a);
        e.k(true);
        e.k(false);
        e.j(true);
        e.j(false);
        nm7.e().b(this, nm7.m4);
        this.H1 = false;
        byte b = 7;
        if (!e.f.c || (arrayList = e.b) == null || arrayList.isEmpty()) {
            K0();
        } else {
            L0(e.d(7));
        }
        if (this.u1.h() == null || gda.a1 <= 0 || this.u1.h().self) {
            return;
        }
        gda.a1--;
        a.b.getSharedPreferences("mainconfig", 0).edit().putInt("dayNightThemeSwitchHintCount", gda.a1).apply();
        ig5 ig5Var = new ig5(9, this.u1.getResourceProvider(), getContext(), false);
        this.N1 = ig5Var;
        ig5Var.setVisibility(4);
        this.N1.setShowingDuration(5000L);
        this.N1.setBottomOffset(-gm.L(8.0f));
        boolean z = this.G1;
        ig5 ig5Var2 = this.N1;
        if (z) {
            ig5Var2.setText(gm.S2(jb6.a0("ChatThemeDaySwitchTooltip", null, 2131752140, new Object[0])));
        } else {
            ig5Var2.setText(gm.S2(jb6.a0("ChatThemeNightSwitchTooltip", null, 2131752137, new Object[0])));
        }
        gm.d3(new re2(this, b), 1500L);
        this.c.addView(this.N1, qoe.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
    }

    @Override // my0
    public final void p0() {
        int v0;
        super.p0();
        H0();
        try {
            if (Build.VERSION.SDK_INT < 30 || this.G0 != -1 || this.H0 == (v0 = cmb.v0(cmb.h5, this.J0))) {
                return;
            }
            this.H0 = v0;
            gm.o3(this, v0, false, null);
            gm.i3(this, ((double) gm.B(v0)) > 0.721d);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // my0
    public final void z(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.h5));
    }
}
