package org.telegram.ui.Components;

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
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.t71;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ep extends org.telegram.ui.ActionBar.u2 implements org.telegram.messenger.is {
    public static final /* synthetic */ int g2 = 0;
    public final org.telegram.ui.xc A1;
    public final zo B1;
    public final View C1;
    public final h6 D1;
    public final h6 E1;
    public final TextView F1;
    public dp G1;
    public boolean H1;
    public boolean I1;
    public boolean J1;
    public int K1;
    public zz0 L1;
    public float M1;
    public ValueAnimator N1;
    public b30 O1;
    public boolean P1;
    public org.telegram.ui.ActionBar.p3 Q1;
    public org.telegram.ui.ActionBar.e2 R1;
    public ki S1;
    public ai.k0 T1;
    public h6 U1;
    public boolean V1;
    public eq W1;
    public boolean X1;
    public boolean Y1;
    public TL_stories.TL_premium_boostsStatus Z1;
    public float a2;
    public ValueAnimator b2;
    public boolean c2;
    public boolean d2;
    public int e2;
    public int f2;
    public final ImageView m1;
    public final org.telegram.ui.ActionBar.x1 n1;
    public final TextView o1;
    public final TextView p1;
    public TLRPC.WallPaper q1;
    public final cp r1;
    public final org.telegram.ui.ym s1;
    public final org.telegram.ui.ActionBar.p3 t1;
    public final boolean u1;
    public final org.telegram.ui.an v1;
    public final uj0 w1;
    public final v4.b0 x1;
    public final pz y1;
    public final ch0 z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ep(org.telegram.ui.an anVar, org.telegram.ui.ym ymVar) {
        super(1, (Context) anVar.getParentActivity(), (org.telegram.ui.ActionBar.e6) ymVar, true);
        String str;
        int i7 = 1;
        this.K1 = -1;
        this.X1 = false;
        this.Y1 = false;
        this.a2 = 0.0f;
        this.v1 = anVar;
        this.s1 = ymVar;
        this.t1 = ymVar.f;
        this.q1 = ymVar.g;
        this.u1 = org.telegram.ui.ActionBar.j6.I.q();
        cp cpVar = new cp(this.a, anVar.a(), ymVar, 0);
        this.r1 = cpVar;
        this.p0 = false;
        this.c0 = false;
        this.w0 = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.G0 = -1;
            int i10 = org.telegram.ui.ActionBar.j6.i5;
            this.H0 = org.telegram.ui.ActionBar.j6.w0(i10, this.J0);
            org.telegram.messenger.g0.t3(this, org.telegram.ui.ActionBar.j6.w0(i10, this.J0), false, null);
            org.telegram.messenger.g0.n3(this, ((double) org.telegram.messenger.g0.B(this.H0)) > 0.721d);
        } else {
            Q(org.telegram.ui.ActionBar.j6.i5);
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.O = frameLayout;
        TextView textView = new TextView(getContext());
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setText(org.telegram.messenger.hd.M0(2131745651, null));
        org.telegram.messenger.k5.m(textView, org.telegram.ui.ActionBar.j6.j5, this.J0, 1, 20.0f);
        textView.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f));
        ImageView imageView = new ImageView(getContext());
        this.m1 = imageView;
        int L = org.telegram.messenger.g0.L(10.0f);
        imageView.setPadding(L, L, L, L);
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(false);
        this.n1 = x1Var;
        imageView.setImageDrawable(x1Var);
        imageView.setOnClickListener(new oo(this, i7));
        frameLayout.addView(imageView, c8.ja.d(44, 44.0f, 8388659, 4.0f, -2.0f, 62.0f, 12.0f));
        frameLayout.addView(textView, c8.ja.d(-1, -2.0f, 8388659, 44.0f, 0.0f, 62.0f, 0.0f));
        int i11 = org.telegram.ui.ActionBar.j6.Fi;
        int w02 = org.telegram.ui.ActionBar.j6.w0(i11, this.J0);
        int L2 = org.telegram.messenger.g0.L(28.0f);
        ch0 ch0Var = new ch0(R.raw.sun_outline, L2, L2, false, null);
        this.z1 = ch0Var;
        this.H1 = !org.telegram.ui.ActionBar.j6.I.q();
        U0(org.telegram.ui.ActionBar.j6.I.q(), false);
        ch0Var.J(true);
        ch0Var.h = true;
        this.e2 = w02;
        ch0Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.xc xcVar = new org.telegram.ui.xc(1, getContext(), this);
        this.A1 = xcVar;
        xcVar.setAnimation(ch0Var);
        xcVar.setScaleType(ImageView.ScaleType.CENTER);
        xcVar.setOnClickListener(new oo(this, 2));
        frameLayout.addView(xcVar, c8.ja.d(44, 44.0f, 8388661, 0.0f, -2.0f, 7.0f, 0.0f));
        this.B1 = new zo(getContext());
        uj0 uj0Var = new uj0(getContext(), null);
        this.w1 = uj0Var;
        uj0Var.setAdapter(cpVar);
        uj0Var.setDrawSelection(false);
        uj0Var.setClipChildren(false);
        uj0Var.setClipToPadding(false);
        uj0Var.setHasFixedSize(true);
        uj0Var.setItemAnimator(null);
        uj0Var.setNestedScrollingEnabled(false);
        getContext();
        v4.b0 b0Var = new v4.b0(0, false);
        this.x1 = b0Var;
        uj0Var.setLayoutManager(b0Var);
        uj0Var.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        int i12 = 3;
        uj0Var.setOnItemClickListener(new j(this, i12));
        uj0Var.setOnScrollListener(new ri(this, 7));
        pz pzVar = new pz(getContext(), this.J0);
        this.y1 = pzVar;
        pzVar.setViewType(14);
        pzVar.setVisibility(0);
        frameLayout.addView(pzVar, c8.ja.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        frameLayout.addView(uj0Var, c8.ja.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        View view = new View(getContext());
        this.C1 = view;
        int L3 = org.telegram.messenger.g0.L(6.0f);
        int w03 = org.telegram.ui.ActionBar.j6.w0(i11, this.J0);
        int i13 = org.telegram.ui.ActionBar.j6.Hi;
        int w04 = org.telegram.ui.ActionBar.j6.w0(i13, this.J0);
        Drawable k02 = org.telegram.ui.ActionBar.j6.k0(L3, L3, L3, L3, w03, w04, w04);
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i11);
        org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i13);
        org.telegram.ui.ActionBar.e6 e6Var = this.J0;
        view.setBackground(k02);
        org.telegram.ui.ActionBar.q6.j(view, k02, M, M2, e6Var);
        view.setOnClickListener(new oo(this, i12));
        frameLayout.addView(view, c8.ja.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(getContext());
        this.F1 = textView2;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(17);
        textView2.setLines(1);
        textView2.setSingleLine(true);
        if (this.q1 == null) {
            textView2.setText(org.telegram.messenger.hd.M0(2131752138, null));
        } else {
            textView2.setText(org.telegram.messenger.hd.M0(2131752140, null));
        }
        textView2.setTextSize(1, 15.0f);
        textView2.setOnClickListener(new androidx.mediarouter.app.w(this, 9));
        frameLayout.addView(textView2, c8.ja.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        h6 h6Var = new h6(getContext(), true, true, true);
        this.D1 = h6Var;
        h6Var.getDrawable().q(true);
        h6Var.n = false;
        h6Var.setGravity(17);
        int i14 = org.telegram.ui.ActionBar.j6.Ji;
        org.telegram.ui.ActionBar.q6.Y(h6Var, i14, this.J0);
        h6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        frameLayout.addView(h6Var, c8.ja.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        h6 h6Var2 = new h6(getContext(), true, true, true);
        this.E1 = h6Var2;
        h6Var2.getDrawable().q(true);
        h6Var2.n = false;
        h6Var2.setGravity(17);
        org.telegram.ui.ActionBar.q6.Y(h6Var2, i14, this.J0);
        h6Var2.setTextSize(org.telegram.messenger.g0.L(12.0f));
        h6Var2.setAlpha(0.0f);
        h6Var2.setTranslationY(org.telegram.messenger.g0.L(11.0f));
        frameLayout.addView(h6Var2, c8.ja.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        if (this.q1 != null) {
            TextView textView3 = new TextView(getContext());
            this.o1 = textView3;
            textView3.setEllipsize(truncateAt);
            textView3.setGravity(17);
            textView3.setLines(1);
            textView3.setSingleLine(true);
            textView3.setText(org.telegram.messenger.hd.M0(2131746085, null));
            textView3.setTextSize(1, 15.0f);
            textView3.setOnClickListener(new n2(10, this, anVar));
            frameLayout.addView(textView3, c8.ja.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
            TextView textView4 = new TextView(getContext());
            this.p1 = textView4;
            textView4.setEllipsize(truncateAt);
            textView4.setGravity(17);
            textView4.setLines(1);
            textView4.setSingleLine(true);
            if (anVar.j() != null) {
                str = org.telegram.messenger.q10.j(anVar.j(), true);
            } else {
                TLRPC.Chat chat = anVar.e;
                str = chat != null ? chat.title : "";
            }
            textView4.setText(org.telegram.messenger.hd.a0("ChatThemeApplyHint", null, 2131752206, str));
            textView4.setTextSize(1, 15.0f);
            frameLayout.addView(textView4, c8.ja.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
        }
        Y0();
        Z0(false);
    }

    public static void I0(ep epVar, t71 t71Var) {
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2();
        c2Var.a = true;
        org.telegram.ui.an anVar = epVar.v1;
        t71Var.a.a = anVar.getResourceProvider();
        t71Var.r1 = new yo(epVar);
        c2Var.c = new ih(3);
        c2Var.d = new no(epVar, 5);
        c2Var.b = new no(epVar, 6);
        c2Var.e = true;
        epVar.R1 = t71Var;
        anVar.showAsSheet(t71Var, c2Var);
    }

    public static org.telegram.ui.ActionBar.i6 J0(boolean z10) {
        SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("themeconfig", 0);
        String str = "Blue";
        String string = sharedPreferences.getString("lastDayTheme", "Blue");
        if (org.telegram.ui.ActionBar.j6.Q0(string) != null && !org.telegram.ui.ActionBar.j6.Q0(string).q()) {
            str = string;
        }
        String str2 = "Dark Blue";
        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
        if (org.telegram.ui.ActionBar.j6.Q0(string2) != null && org.telegram.ui.ActionBar.j6.Q0(string2).q()) {
            str2 = string2;
        }
        return z10 ? org.telegram.ui.ActionBar.j6.Q0(str2) : org.telegram.ui.ActionBar.j6.Q0(str);
    }

    public static void W0(zz0 zz0Var) {
        if (zz0Var == null) {
            return;
        }
        float width = zz0Var.getWidth() / 2.0f;
        float width2 = zz0Var.getWidth();
        float height = zz0Var.getHeight();
        float max = Math.max(width, width2 - width);
        float max2 = Math.max(0.0f, height - 0.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(zz0Var, zz0.x, 0.0f, ((float) Math.sqrt((max2 * max2) + (max * max))) / 0.6f);
        ofFloat.setDuration(450L);
        ofFloat.setInterpolator(qs.e);
        ofFloat.addListener(new x5(zz0Var, 17));
        ofFloat.start();
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void D(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.i5));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K0(boolean z10) {
        long j3;
        TLRPC.ChatTheme chatTheme;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        char c10;
        TLRPC.User j10;
        boolean z11;
        if (this.X1) {
            return;
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.Z1;
        int i7 = 1;
        org.telegram.ui.an anVar = this.v1;
        if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < anVar.getMessagesController().u5) {
            anVar.getMessagesController().G0().b(anVar.a(), this.Z1, new po(this, i7));
            return;
        }
        org.telegram.ui.ActionBar.p3 p3Var = this.G1.a;
        xb xbVar = null;
        if (p3Var != this.Q1) {
            TLRPC.ChatTheme chatTheme2 = !p3Var.a ? p3Var.d : null;
            if (p3Var.d instanceof TLRPC.TL_chatThemeUniqueGift) {
                Long l10 = (Long) org.telegram.messenger.d4.f(p3Var.g).r.get(((TLRPC.TL_chatThemeUniqueGift) p3Var.d).gift.slug);
                if (l10 != null) {
                    j3 = l10.longValue();
                    chatTheme = p3Var.d;
                    if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                        TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                        if (starGift instanceof TL_stars.TL_starGiftUnique) {
                            tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                            if (j3 == 0 && tL_starGiftUnique != null && !z10) {
                                t4.k0(getContext(), this.J0, this.a, tL_starGiftUnique, j3, new no(this, i7));
                                return;
                            }
                            org.telegram.messenger.d4.f(this.a).a(anVar.a(), false, false);
                            org.telegram.messenger.d4.f(this.a).s(anVar.a(), ig.b.c(chatTheme2), chatTheme2, true);
                            TLRPC.WallPaper wallPaper = P0() ? null : this.s1.g;
                            boolean z12 = this.H1;
                            boolean z13 = this.u1;
                            zz0 L0 = z12 != z13 ? L0() : null;
                            if (p3Var.a) {
                                c10 = 0;
                                this.s1.r(null, wallPaper, L0 == null, Boolean.valueOf(z13), false);
                            } else {
                                c10 = 0;
                                this.s1.r(p3Var, wallPaper, L0 == null, Boolean.valueOf(z13), false);
                            }
                            W0(L0);
                            this.I1 = true;
                            j10 = anVar.j();
                            if (j10 != null && !j10.self) {
                                z11 = p3Var.a;
                                ev0 ev0Var = new ev0(getContext(), null, 1, -1, p3Var.e(), anVar.getResourceProvider());
                                ev0Var.c.setVisibility(8);
                                TextView textView = ev0Var.b;
                                if (z11) {
                                    Object[] objArr = new Object[1];
                                    objArr[c10] = j10.first_name;
                                    org.telegram.messenger.k5.q("ThemeAlsoAppliedForHint", null, 2131744189, objArr, textView);
                                } else {
                                    Object[] objArr2 = new Object[1];
                                    objArr2[c10] = j10.first_name;
                                    org.telegram.messenger.k5.q("ThemeAlsoDisabledForHint", null, 2131744188, objArr2, textView);
                                }
                                textView.setTypeface(null);
                                xbVar = xb.g(anVar, ev0Var, 2750);
                            }
                        }
                    }
                    tL_starGiftUnique = null;
                    if (j3 == 0) {
                    }
                    org.telegram.messenger.d4.f(this.a).a(anVar.a(), false, false);
                    org.telegram.messenger.d4.f(this.a).s(anVar.a(), ig.b.c(chatTheme2), chatTheme2, true);
                    if (P0()) {
                    }
                    boolean z122 = this.H1;
                    boolean z132 = this.u1;
                    if (z122 != z132) {
                    }
                    if (p3Var.a) {
                    }
                    W0(L0);
                    this.I1 = true;
                    j10 = anVar.j();
                    if (j10 != null) {
                        z11 = p3Var.a;
                        ev0 ev0Var2 = new ev0(getContext(), null, 1, -1, p3Var.e(), anVar.getResourceProvider());
                        ev0Var2.c.setVisibility(8);
                        TextView textView2 = ev0Var2.b;
                        if (z11) {
                        }
                        textView2.setTypeface(null);
                        xbVar = xb.g(anVar, ev0Var2, 2750);
                    }
                }
            }
            j3 = 0;
            chatTheme = p3Var.d;
            if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
            }
            tL_starGiftUnique = null;
            if (j3 == 0) {
            }
            org.telegram.messenger.d4.f(this.a).a(anVar.a(), false, false);
            org.telegram.messenger.d4.f(this.a).s(anVar.a(), ig.b.c(chatTheme2), chatTheme2, true);
            if (P0()) {
            }
            boolean z1222 = this.H1;
            boolean z1322 = this.u1;
            if (z1222 != z1322) {
            }
            if (p3Var.a) {
            }
            W0(L0);
            this.I1 = true;
            j10 = anVar.j();
            if (j10 != null) {
            }
        }
        dismiss();
        if (xbVar != null) {
            xbVar.j();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zz0 L0() {
        Bitmap bitmap;
        Bitmap bitmap2;
        org.telegram.ui.an anVar = this.v1;
        Activity parentActivity = anVar != null ? anVar.getParentActivity() : null;
        if (parentActivity == null || parentActivity.getWindow() == null || !(parentActivity.getWindow().getDecorView() instanceof FrameLayout)) {
            return null;
        }
        FrameLayout frameLayout = (FrameLayout) parentActivity.getWindow().getDecorView();
        if (frameLayout.getWidth() <= 0 || frameLayout.getHeight() <= 0) {
            return null;
        }
        try {
            bitmap2 = Build.VERSION.SDK_INT >= 26 ? org.telegram.messenger.g0.B0(parentActivity.getWindow()) : null;
            if (bitmap2 == null) {
                try {
                    bitmap2 = org.telegram.messenger.g0.M3(frameLayout);
                } catch (Throwable th2) {
                    bitmap = bitmap2;
                    th = th2;
                    org.telegram.messenger.a8.g(th, true);
                    bitmap2 = bitmap;
                    if (bitmap2 != null) {
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            bitmap = null;
        }
        if (bitmap2 != null) {
            return null;
        }
        zz0 zz0Var = new zz0(parentActivity);
        zz0Var.setScaleType(ImageView.ScaleType.MATRIX);
        zz0Var.setImageBitmap(bitmap2);
        zz0Var.b(frameLayout.getWidth() / 2.0f, 0.0f, true);
        zz0Var.setRadius(0.0f);
        frameLayout.addView(zz0Var, new FrameLayout.LayoutParams(-1, -1));
        return zz0Var;
    }

    public final void M0() {
        if (!P0()) {
            dismiss();
            return;
        }
        final int i7 = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.J0);
        String M0 = org.telegram.messenger.hd.M0(2131752196, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = M0;
        t1Var.U = org.telegram.messenger.hd.M0(2131752197, null);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752199, null), new org.telegram.ui.ActionBar.q1(this) { // from class: org.telegram.ui.Components.qo
            public final /* synthetic */ ep b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.q1
            public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i10) {
                switch (i7) {
                    case 0:
                        this.b.K0(false);
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        final int i10 = 1;
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752198, null), new org.telegram.ui.ActionBar.q1(this) { // from class: org.telegram.ui.Components.qo
            public final /* synthetic */ ep b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.q1
            public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i102) {
                switch (i10) {
                    case 0:
                        this.b.K0(false);
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        alertDialog$Builder.p();
    }

    public final void N0() {
        try {
            int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fi, this.J0);
            ch0 ch0Var = this.z1;
            if (ch0Var != null && w02 != this.e2) {
                this.e2 = w02;
                ch0Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
            }
            org.telegram.ui.ActionBar.x1 x1Var = this.n1;
            if (x1Var != null) {
                int i7 = org.telegram.ui.ActionBar.j6.j5;
                x1Var.a(org.telegram.ui.ActionBar.j6.w0(i7, this.J0));
                x1Var.b(org.telegram.ui.ActionBar.j6.w0(i7, this.J0));
                ImageView imageView = this.m1;
                if (imageView != null) {
                    imageView.invalidate();
                }
            }
            int w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.h5, this.J0);
            if (w03 != this.f2) {
                this.f2 = w03;
                v0(w03);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void O0() {
        if (this.J || this.I1) {
            return;
        }
        org.telegram.ui.ActionBar.j6.b = false;
        TLRPC.WallPaper wallPaper = P0() ? null : this.s1.g;
        org.telegram.ui.ActionBar.p3 p3Var = this.G1.a;
        if (p3Var.a) {
            this.s1.r(null, wallPaper, false, Boolean.valueOf(this.H1), true);
        } else {
            this.s1.r(p3Var, wallPaper, false, Boolean.valueOf(this.H1), true);
        }
        ki kiVar = this.S1;
        if (kiVar != null) {
            yi yiVar = kiVar.m2;
            if (yiVar != null) {
                boolean z10 = this.H1;
                ha haVar = yiVar.w;
                ((ArrayList) haVar.e).clear();
                WallpapersListActivity.E0((ArrayList) haVar.e, z10);
                haVar.f();
            }
            this.S1.P0();
        }
        cp cpVar = this.r1;
        if (cpVar == null || cpVar.d == null) {
            return;
        }
        for (int i7 = 0; i7 < cpVar.d.size(); i7++) {
            ((dp) cpVar.d.get(i7)).c = this.H1 ? 1 : 0;
        }
        cpVar.f();
    }

    public final boolean P0() {
        if (this.G1 == null) {
            return false;
        }
        org.telegram.ui.ActionBar.p3 p3Var = this.Q1;
        ig.b bVar = p3Var != null ? p3Var.c : null;
        if (bVar == null) {
            bVar = ig.b.d("❌");
        }
        org.telegram.ui.ActionBar.p3 p3Var2 = this.G1.a;
        ig.b bVar2 = p3Var2 != null ? p3Var2.c : null;
        if (bVar2 == null) {
            bVar2 = ig.b.d("❌");
        }
        return !ig.b.a(bVar, bVar2);
    }

    public final void Q0() {
        ArrayList arrayList;
        if (this.V1) {
            return;
        }
        org.telegram.messenger.d4 f10 = org.telegram.messenger.d4.f(this.a);
        if (!f10.f.c || (arrayList = f10.b) == null || arrayList.isEmpty()) {
            this.V1 = true;
            if (f10.f.c) {
                f10.q(new ap(this, f10), false);
                return;
            }
            bp bpVar = new bp(this, f10);
            long currentTimeMillis = System.currentTimeMillis();
            l2.q1 q1Var = f10.f;
            boolean z10 = currentTimeMillis - q1Var.b > 7200000;
            if (((ArrayList) q1Var.d) == null || !q1Var.c || z10) {
                TL_account.Tl_getUniqueGiftChatThemes tl_getUniqueGiftChatThemes = new TL_account.Tl_getUniqueGiftChatThemes();
                l2.q1 q1Var2 = f10.f;
                tl_getUniqueGiftChatThemes.offset = (String) q1Var2.e;
                tl_getUniqueGiftChatThemes.hash = q1Var2.a;
                tl_getUniqueGiftChatThemes.limit = 50;
                ConnectionsManager connectionsManager = f10.getConnectionsManager();
                org.telegram.messenger.p5 p5Var = org.telegram.messenger.d4.s;
                Objects.requireNonNull(p5Var);
                connectionsManager.sendRequestTyped(tl_getUniqueGiftChatThemes, new org.telegram.messenger.v3(p5Var), new org.telegram.messenger.x3(0, f10, bpVar));
            }
        }
    }

    public final void R0(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        dp dpVar = new dp((org.telegram.ui.ActionBar.p3) arrayList.get(0));
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        if (!this.P1) {
            org.telegram.ui.ActionBar.p3 p3Var = this.s1.f;
            this.Q1 = p3Var;
            if (p3Var != null) {
                p3Var.k();
            }
        }
        arrayList2.add(0, dpVar);
        if (!this.P1) {
            this.G1 = dpVar;
        }
        org.telegram.ui.ActionBar.p3 p3Var2 = this.Q1;
        ig.b bVar = p3Var2 != null ? p3Var2.c : null;
        boolean z10 = false;
        int i7 = 1;
        while (i7 < arrayList.size()) {
            org.telegram.ui.ActionBar.p3 p3Var3 = (org.telegram.ui.ActionBar.p3) arrayList.get(i7);
            dp dpVar2 = new dp(p3Var3);
            p3Var3.m(this.a);
            dpVar2.c = this.H1 ? 1 : 0;
            if (ig.b.a(p3Var3.c, bVar)) {
                arrayList2.add(1, dpVar2);
                z10 = true;
            } else {
                arrayList2.add(dpVar2);
            }
            i7++;
            z10 = z10;
        }
        org.telegram.ui.ActionBar.p3 p3Var4 = this.Q1;
        if (p3Var4 != null && !z10) {
            dp dpVar3 = new dp(p3Var4);
            p3Var4.m(this.a);
            dpVar3.c = this.H1 ? 1 : 0;
            arrayList2.add(1, dpVar3);
        }
        cp cpVar = this.r1;
        cpVar.d = arrayList2;
        cpVar.f();
        this.A1.setVisibility(0);
        if (!this.P1) {
            T0(false);
            this.w1.animate().alpha(1.0f).setDuration(150L).start();
        }
        this.P1 = true;
        Z0(true);
    }

    public final void S0() {
        if (this.J || this.I1) {
            return;
        }
        this.J1 = false;
        this.v1.getClass();
        TLRPC.WallPaper wallPaper = P0() ? null : this.q1;
        org.telegram.ui.ActionBar.p3 p3Var = this.G1.a;
        if (p3Var.a) {
            this.s1.r(null, wallPaper, true, Boolean.valueOf(this.H1), false);
        } else {
            this.s1.r(p3Var, wallPaper, true, Boolean.valueOf(this.H1), false);
        }
    }

    public final void T0(boolean z10) {
        cp cpVar = this.r1;
        ArrayList arrayList = cpVar.d;
        org.telegram.ui.ActionBar.p3 p3Var = this.Q1;
        v4.b0 b0Var = this.x1;
        uj0 uj0Var = this.w1;
        if (p3Var != null) {
            int i7 = 0;
            while (true) {
                if (i7 == arrayList.size()) {
                    i7 = -1;
                    break;
                } else {
                    if (ig.b.a(((dp) arrayList.get(i7)).a.c, this.Q1.c)) {
                        this.G1 = (dp) arrayList.get(i7);
                        break;
                    }
                    i7++;
                }
            }
            if (i7 != -1) {
                this.K1 = i7;
                cpVar.E(i7);
                if (i7 > 0 && i7 < arrayList.size() / 2) {
                    i7--;
                }
                int min = Math.min(i7, cpVar.d.size() - 1);
                if (z10) {
                    uj0Var.y0(min);
                } else {
                    b0Var.h1(min, 0);
                }
            }
        } else {
            this.G1 = (dp) arrayList.get(0);
            cpVar.E(0);
            if (z10) {
                uj0Var.y0(0);
            } else {
                b0Var.h1(0, 0);
            }
        }
        S0();
    }

    public final void U0(boolean z10, boolean z11) {
        if (this.H1 == z10) {
            return;
        }
        this.H1 = z10;
        org.telegram.ui.xc xcVar = this.A1;
        ch0 ch0Var = this.z1;
        if (z11) {
            ch0Var.P(z10 ? ch0Var.e[0] : 0);
            if (xcVar != null) {
                xcVar.d();
                return;
            }
            return;
        }
        int i7 = z10 ? ch0Var.e[0] - 1 : 0;
        ch0Var.N(i7, false, true);
        ch0Var.P(i7);
        if (xcVar != null) {
            xcVar.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final ArrayList V() {
        ro roVar = new ro(this);
        ArrayList arrayList = new ArrayList();
        if (this.v1.v7) {
            org.telegram.ui.ActionBar.e2 e2Var = this.R1;
            if (e2Var instanceof t71) {
                arrayList.addAll(((t71) e2Var).X0());
                return arrayList;
            }
        }
        ki kiVar = this.S1;
        if (kiVar != null) {
            arrayList.addAll(kiVar.V());
        }
        int i7 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 32, (Class[]) null, (Paint) null, new Drawable[]{this.s0}, roVar, org.telegram.ui.ActionBar.j6.h5));
        int i10 = org.telegram.ui.ActionBar.j6.Fi;
        View view = this.C1;
        arrayList.add(new org.telegram.ui.ActionBar.s6(view, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.s6(view, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Hi));
        int size = arrayList.size();
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((org.telegram.ui.ActionBar.s6) obj).n = this.s1;
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V0(boolean z10) {
        Bitmap bitmap;
        if (this.J || this.c2) {
            return;
        }
        ValueAnimator valueAnimator = this.N1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        org.telegram.ui.an anVar = this.v1;
        FrameLayout frameLayout = (FrameLayout) anVar.getParentActivity().getWindow().getDecorView();
        FrameLayout frameLayout2 = (FrameLayout) getWindow().getDecorView();
        Window window = anVar.getParentActivity().getWindow();
        Window window2 = getWindow();
        if (Build.VERSION.SDK_INT >= 26 && frameLayout2.getWidth() > 0 && frameLayout2.getHeight() > 0) {
            Bitmap B0 = org.telegram.messenger.g0.B0(window);
            Bitmap B02 = B0 != null ? org.telegram.messenger.g0.B0(window2) : null;
            if (B0 != null && B02 != null) {
                frameLayout.getLocationOnScreen(new int[2]);
                frameLayout2.getLocationOnScreen(new int[2]);
                bitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmap);
                canvas.drawBitmap(B0, r6[0] - r7[0], r6[1] - r7[1], (Paint) null);
                canvas.drawBitmap(B02, 0.0f, 0.0f, (Paint) null);
                B0.recycle();
                B02.recycle();
                org.telegram.ui.xc xcVar = this.A1;
                if (bitmap == null) {
                    zz0.a(bitmap, null, xcVar);
                } else {
                    bitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmap);
                    xcVar.setAlpha(0.0f);
                    frameLayout.draw(canvas2);
                    frameLayout2.draw(canvas2);
                    xcVar.setAlpha(1.0f);
                }
                xcVar.getLocationInWindow(new int[2]);
                float measuredWidth = (xcVar.getMeasuredWidth() / 2.0f) + r3[0];
                float measuredHeight = (xcVar.getMeasuredHeight() / 2.0f) + r3[1];
                float width = bitmap.getWidth();
                float height = bitmap.getHeight();
                org.telegram.ui.Cells.g1 g1Var = zz0.x;
                float max = Math.max(measuredWidth, width - measuredWidth);
                float max2 = Math.max(measuredHeight, height - measuredHeight);
                float sqrt = ((float) Math.sqrt((max2 * max2) + (max * max))) / 0.6f;
                zz0 zz0Var = new zz0(getContext());
                zz0Var.setScaleType(ImageView.ScaleType.MATRIX);
                zz0Var.setImageBitmap(bitmap);
                zz0Var.b(measuredWidth, measuredHeight, z10);
                ColorFilter colorFilter = this.z1.getColorFilter();
                zz0Var.n = xcVar;
                zz0Var.r = colorFilter;
                zz0Var.setRadius(!z10 ? 0.0f : sqrt);
                this.L1 = zz0Var;
                zz0Var.setOnTouchListener(new gi.a(17));
                this.M1 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.N1 = ofFloat;
                ofFloat.addUpdateListener(new so(this, zz0Var, sqrt, z10));
                this.N1.addListener(new x5(this, 16));
                this.N1.setDuration(400L);
                this.N1.setInterpolator(qs.e);
                this.N1.start();
                frameLayout2.addView(this.L1, new ViewGroup.LayoutParams(-1, -1));
                org.telegram.messenger.g0.h3(new ai.q(23, this, z10));
            }
            if (B0 != null) {
                B0.recycle();
            }
        }
        bitmap = null;
        org.telegram.ui.xc xcVar2 = this.A1;
        if (bitmap == null) {
        }
        xcVar2.getLocationInWindow(new int[2]);
        float measuredWidth2 = (xcVar2.getMeasuredWidth() / 2.0f) + r3[0];
        float measuredHeight2 = (xcVar2.getMeasuredHeight() / 2.0f) + r3[1];
        float width2 = bitmap.getWidth();
        float height2 = bitmap.getHeight();
        org.telegram.ui.Cells.g1 g1Var2 = zz0.x;
        float max3 = Math.max(measuredWidth2, width2 - measuredWidth2);
        float max22 = Math.max(measuredHeight2, height2 - measuredHeight2);
        float sqrt2 = ((float) Math.sqrt((max22 * max22) + (max3 * max3))) / 0.6f;
        zz0 zz0Var2 = new zz0(getContext());
        zz0Var2.setScaleType(ImageView.ScaleType.MATRIX);
        zz0Var2.setImageBitmap(bitmap);
        zz0Var2.b(measuredWidth2, measuredHeight2, z10);
        ColorFilter colorFilter2 = this.z1.getColorFilter();
        zz0Var2.n = xcVar2;
        zz0Var2.r = colorFilter2;
        zz0Var2.setRadius(!z10 ? 0.0f : sqrt2);
        this.L1 = zz0Var2;
        zz0Var2.setOnTouchListener(new gi.a(17));
        this.M1 = 0.0f;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.N1 = ofFloat2;
        ofFloat2.addUpdateListener(new so(this, zz0Var2, sqrt2, z10));
        this.N1.addListener(new x5(this, 16));
        this.N1.setDuration(400L);
        this.N1.setInterpolator(qs.e);
        this.N1.start();
        frameLayout2.addView(this.L1, new ViewGroup.LayoutParams(-1, -1));
        org.telegram.messenger.g0.h3(new ai.q(23, this, z10));
    }

    public final void X0(org.telegram.ui.ActionBar.i6 i6Var) {
        if (i6Var == null || i6Var == org.telegram.ui.ActionBar.j6.I) {
            return;
        }
        this.c2 = true;
        try {
            org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.t4, i6Var, Boolean.FALSE, null, -1);
        } finally {
            this.c2 = false;
        }
    }

    public final void Y0() {
        TextView textView = this.p1;
        if (textView != null) {
            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.p5, this.J0);
            int L = org.telegram.messenger.g0.L(6.0f);
            int i7 = org.telegram.ui.ActionBar.j6.Fi;
            int o4 = i0.a.o(org.telegram.ui.ActionBar.j6.w0(i7, this.J0), 76);
            org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.j6.k0(L, L, L, L, 0, o4, o4);
            org.telegram.ui.ActionBar.m6 g10 = org.telegram.ui.ActionBar.q6.g(i7, 76);
            org.telegram.ui.ActionBar.e6 e6Var = this.J0;
            textView.setBackground(k02);
            org.telegram.ui.ActionBar.q6.j(textView, k02, null, g10, e6Var);
        }
        TextView textView2 = this.o1;
        if (textView2 != null) {
            int i10 = org.telegram.ui.ActionBar.j6.p7;
            org.telegram.ui.ActionBar.q6.U(textView2, i10, this.J0);
            int L2 = org.telegram.messenger.g0.L(6.0f);
            int o10 = i0.a.o(org.telegram.ui.ActionBar.j6.w0(i10, this.J0), 76);
            org.telegram.ui.Cells.y k03 = org.telegram.ui.ActionBar.j6.k0(L2, L2, L2, L2, 0, o10, o10);
            org.telegram.ui.ActionBar.m6 g11 = org.telegram.ui.ActionBar.q6.g(i10, 76);
            org.telegram.ui.ActionBar.e6 e6Var2 = this.J0;
            textView2.setBackground(k03);
            org.telegram.ui.ActionBar.q6.j(textView2, k03, null, g11, e6Var2);
        }
        int i11 = org.telegram.ui.ActionBar.j6.j5;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(i0.a.o(org.telegram.ui.ActionBar.j6.w0(i11, this.J0), 30), 1, -1);
        org.telegram.ui.ActionBar.m6 g12 = org.telegram.ui.ActionBar.q6.g(i11, 30);
        org.telegram.ui.ActionBar.e6 e6Var3 = this.J0;
        ImageView imageView = this.m1;
        org.telegram.ui.ActionBar.q6.Q(imageView, h02, null, g12, e6Var3);
        int w02 = org.telegram.ui.ActionBar.j6.w0(i11, this.J0);
        org.telegram.ui.ActionBar.x1 x1Var = this.n1;
        x1Var.a(w02);
        x1Var.b(org.telegram.ui.ActionBar.j6.w0(i11, this.J0));
        imageView.invalidate();
        int i12 = org.telegram.ui.ActionBar.j6.Fi;
        org.telegram.ui.ActionBar.q6.Q(this.A1, org.telegram.ui.ActionBar.j6.h0(i0.a.o(org.telegram.ui.ActionBar.j6.w0(i12, this.J0), 30), 1, -1), null, org.telegram.ui.ActionBar.q6.g(i12, 30), this.J0);
        int i13 = org.telegram.ui.ActionBar.j6.m5;
        org.telegram.ui.ActionBar.e6 e6Var4 = this.J0;
        TextView textView3 = this.F1;
        org.telegram.ui.ActionBar.q6.U(textView3, i13, e6Var4);
        int L3 = org.telegram.messenger.g0.L(6.0f);
        int o11 = i0.a.o(org.telegram.ui.ActionBar.j6.w0(i12, this.J0), 76);
        org.telegram.ui.ActionBar.q6.Q(textView3, org.telegram.ui.ActionBar.j6.k0(L3, L3, L3, L3, 0, o11, o11), null, org.telegram.ui.ActionBar.q6.g(i12, 76), this.J0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0136  */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z0(boolean z10) {
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus;
        ?? r17;
        boolean z11;
        boolean z12;
        ValueAnimator valueAnimator;
        org.telegram.ui.ActionBar.p3 p3Var;
        org.telegram.ui.an anVar = this.v1;
        TLRPC.Chat chat = anVar.e;
        int i7 = 0;
        if (chat != null && !this.X1 && !this.Y1 && this.Z1 == null) {
            this.X1 = true;
            anVar.getMessagesController().G0().a(anVar.a(), new po(this, i7));
        }
        boolean z13 = this.P1;
        pz pzVar = this.y1;
        TextView textView = this.p1;
        h6 h6Var = this.E1;
        TextView textView2 = this.o1;
        TextView textView3 = this.F1;
        org.telegram.ui.ActionBar.x1 x1Var = this.n1;
        View view = this.C1;
        h6 h6Var2 = this.D1;
        if (!z13) {
            x1Var.c(z10, 1.0f);
            view.setEnabled(false);
            org.telegram.messenger.g0.Y3(textView3, false, 0.9f, false, z10);
            org.telegram.messenger.g0.Y3(textView2, false, 0.9f, false, z10);
            org.telegram.messenger.g0.Y3(view, false, 1.0f, false, z10);
            org.telegram.messenger.g0.Y3(h6Var2, false, 0.9f, false, z10);
            org.telegram.messenger.g0.Y3(h6Var, false, 0.9f, false, z10);
            org.telegram.messenger.g0.Y3(textView, false, 0.9f, false, z10);
            org.telegram.messenger.g0.Y3(pzVar, true, 1.0f, true, z10);
            return;
        }
        org.telegram.messenger.g0.Y3(pzVar, false, 1.0f, true, z10);
        if (!P0()) {
            x1Var.c(z10, 1.0f);
            view.setEnabled(false);
            org.telegram.messenger.g0.Y3(textView3, true, 0.9f, false, z10);
            org.telegram.messenger.g0.Y3(textView2, true, 0.9f, false, z10);
            org.telegram.messenger.g0.Y3(view, false, 1.0f, false, z10);
            org.telegram.messenger.g0.Y3(h6Var2, false, 0.9f, false, z10);
            org.telegram.messenger.g0.Y3(h6Var, false, 0.9f, false, z10);
            org.telegram.messenger.g0.Y3(textView, false, 0.9f, false, z10);
            return;
        }
        x1Var.c(z10, 0.0f);
        view.setEnabled(true);
        dp dpVar = this.G1;
        if (dpVar == null || (p3Var = dpVar.a) == null || !p3Var.a) {
            h6Var2.setText(org.telegram.messenger.hd.M0(2131752247, null));
            if (chat != null && (tL_premium_boostsStatus = this.Z1) != null && tL_premium_boostsStatus.level < anVar.getMessagesController().u5) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
                if (this.W1 == null) {
                    eq eqVar = new eq(R.drawable.mini_switch_lock, 0);
                    this.W1 = eqVar;
                    eqVar.n = 1;
                }
                spannableStringBuilder.setSpan(this.W1, 0, 1, 33);
                r17 = 1;
                spannableStringBuilder.append((CharSequence) " ").append((CharSequence) org.telegram.messenger.hd.G(anVar.getMessagesController().u5, "ReactionLevelRequiredBtn", new Object[0]));
                h6Var.setText(spannableStringBuilder);
                z11 = true;
                z12 = (z10 || h6Var2.getAlpha() <= 0.8f) ? false : r17;
                valueAnimator = this.b2;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.b2 = null;
                }
                if (z12) {
                    this.a2 = z11 ? 1.0f : 0.0f;
                    h6Var2.setTranslationY((-org.telegram.messenger.g0.L(7.0f)) * this.a2);
                } else {
                    float f10 = this.a2;
                    float f11 = z11 ? 1.0f : 0.0f;
                    float[] fArr = new float[2];
                    fArr[0] = f10;
                    fArr[r17] = f11;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                    this.b2 = ofFloat;
                    ofFloat.addUpdateListener(new c6(this, 14));
                    this.b2.addListener(new org.telegram.ui.nn(6, this, z11));
                    this.b2.start();
                }
                org.telegram.messenger.g0.Y3(textView3, false, 0.9f, false, z10);
                org.telegram.messenger.g0.Y3(textView2, false, 0.9f, false, z10);
                boolean z14 = r17;
                org.telegram.messenger.g0.Y3(view, z14, 1.0f, false, z10);
                org.telegram.messenger.g0.Y3(h6Var2, z14, 0.9f, false, z10);
                org.telegram.messenger.g0.X3(h6Var, z11, 0.9f, false, 0.7f, z10, null);
                org.telegram.messenger.g0.Y3(textView, z14, 0.9f, false, z10);
            }
        } else {
            h6Var2.setText(org.telegram.messenger.hd.M0(2131752214, null));
        }
        r17 = 1;
        z11 = false;
        if (z10) {
        }
        valueAnimator = this.b2;
        if (valueAnimator != null) {
        }
        if (z12) {
        }
        org.telegram.messenger.g0.Y3(textView3, false, 0.9f, false, z10);
        org.telegram.messenger.g0.Y3(textView2, false, 0.9f, false, z10);
        boolean z142 = r17;
        org.telegram.messenger.g0.Y3(view, z142, 1.0f, false, z10);
        org.telegram.messenger.g0.Y3(h6Var2, z142, 0.9f, false, z10);
        org.telegram.messenger.g0.X3(h6Var, z11, 0.9f, false, 0.7f, z10, null);
        org.telegram.messenger.g0.Y3(textView, z142, 0.9f, false, z10);
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.i4) {
            org.telegram.messenger.ns.f(this.a).d(new no(this, 0));
        }
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.a2
    public final void dismiss() {
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.i4);
        super.dismiss();
        this.v1.getClass();
        boolean z10 = this.I1;
        boolean z11 = this.u1;
        zz0 L0 = (z10 || this.H1 == z11) ? null : L0();
        if (!this.I1) {
            org.telegram.ui.ym ymVar = this.s1;
            TLRPC.WallPaper wallPaper = ymVar.g;
            if (wallPaper == null) {
                wallPaper = this.q1;
            }
            ymVar.r(this.t1, wallPaper, L0 == null, Boolean.valueOf(z11), false);
        }
        if (this.H1 != z11) {
            org.telegram.ui.ActionBar.i6 J0 = org.telegram.ui.ActionBar.j6.I.q() == z11 ? org.telegram.ui.ActionBar.j6.I : J0(z11);
            if (this.d2) {
                X0(J0);
            } else {
                org.telegram.ui.ActionBar.j6.u(J0, false, z11);
            }
        }
        this.d2 = false;
        W0(L0);
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final boolean f0(MotionEvent motionEvent) {
        if (motionEvent == null || !P0()) {
            return false;
        }
        int x10 = (int) motionEvent.getX();
        if (((int) motionEvent.getY()) >= this.b.getTop() && x10 >= this.b.getLeft() && x10 <= this.b.getRight()) {
            return false;
        }
        this.v1.getFragmentView().dispatchTouchEvent(motionEvent);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void g0(float f10) {
        b30 b30Var = this.O1;
        if (b30Var != null) {
            b30Var.a();
        }
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog
    public final void onBackPressed() {
        M0();
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        ArrayList arrayList;
        super.onCreate(bundle);
        org.telegram.messenger.d4 f10 = org.telegram.messenger.d4.f(this.a);
        f10.m(true);
        f10.m(false);
        f10.l(true);
        f10.l(false);
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.i4);
        this.I1 = false;
        int i7 = 7;
        if (!f10.f.c || (arrayList = f10.b) == null || arrayList.isEmpty()) {
            Q0();
        } else {
            R0(f10.e(7));
        }
        if (this.v1.j() == null || org.telegram.messenger.gz.e1 <= 0 || this.v1.j().self) {
            return;
        }
        org.telegram.messenger.gz.e1--;
        org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit().putInt("dayNightThemeSwitchHintCount", org.telegram.messenger.gz.e1).apply();
        b30 b30Var = new b30(9, getContext(), this.v1.getResourceProvider(), false);
        this.O1 = b30Var;
        b30Var.setVisibility(4);
        this.O1.setShowingDuration(5000L);
        this.O1.setBottomOffset(-org.telegram.messenger.g0.L(8.0f));
        if (this.H1) {
            this.O1.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("ChatThemeDaySwitchTooltip", null, 2131752203, new Object[0])));
        } else {
            this.O1.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("ChatThemeNightSwitchTooltip", null, 2131752200, new Object[0])));
        }
        org.telegram.messenger.g0.i3(new no(this, i7), 1500L);
        this.c.addView(this.O1, c8.ja.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void s0() {
        int w02;
        super.s0();
        N0();
        try {
            if (Build.VERSION.SDK_INT < 30 || this.G0 != -1 || this.H0 == (w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.i5, this.J0))) {
                return;
            }
            this.H0 = w02;
            org.telegram.messenger.g0.t3(this, w02, false, null);
            org.telegram.messenger.g0.n3(this, ((double) org.telegram.messenger.g0.B(w02)) > 0.721d);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
