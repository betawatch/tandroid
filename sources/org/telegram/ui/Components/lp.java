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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class lp extends org.telegram.ui.ActionBar.x2 implements org.telegram.messenger.fs {
    public static final /* synthetic */ int g2 = 0;
    public final org.telegram.ui.xc A1;
    public final gp B1;
    public final View C1;
    public final n6 D1;
    public final n6 E1;
    public final TextView F1;
    public kp G1;
    public boolean H1;
    public boolean I1;
    public boolean J1;
    public int K1;
    public g01 L1;
    public float M1;
    public ValueAnimator N1;
    public j30 O1;
    public boolean P1;
    public org.telegram.ui.ActionBar.t3 Q1;
    public org.telegram.ui.ActionBar.h2 R1;
    public si S1;
    public ai.k0 T1;
    public n6 U1;
    public boolean V1;
    public lq W1;
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
    public final org.telegram.ui.ActionBar.y1 n1;
    public final TextView o1;
    public final TextView p1;
    public TLRPC.WallPaper q1;
    public final jp r1;
    public final org.telegram.ui.zm s1;
    public final org.telegram.ui.ActionBar.t3 t1;
    public final boolean u1;
    public final org.telegram.ui.bn v1;
    public final ck0 w1;
    public final v4.c0 x1;
    public final wz y1;
    public final mh0 z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lp(org.telegram.ui.bn bnVar, org.telegram.ui.zm zmVar) {
        super(1, (Context) bnVar.getParentActivity(), (org.telegram.ui.ActionBar.i6) zmVar, true);
        String str;
        int i7 = 1;
        this.K1 = -1;
        this.X1 = false;
        this.Y1 = false;
        this.a2 = 0.0f;
        this.v1 = bnVar;
        this.s1 = zmVar;
        this.t1 = zmVar.f;
        this.q1 = zmVar.g;
        this.u1 = org.telegram.ui.ActionBar.n6.I.q();
        jp jpVar = new jp(this.a, bnVar.a(), zmVar, 0);
        this.r1 = jpVar;
        this.p0 = false;
        this.c0 = false;
        this.w0 = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.G0 = -1;
            int i10 = org.telegram.ui.ActionBar.n6.i5;
            this.H0 = org.telegram.ui.ActionBar.n6.w0(i10, this.J0);
            org.telegram.messenger.g0.s3(this, org.telegram.ui.ActionBar.n6.w0(i10, this.J0), false, null);
            org.telegram.messenger.g0.m3(this, ((double) org.telegram.messenger.g0.B(this.H0)) > 0.721d);
        } else {
            Q(org.telegram.ui.ActionBar.n6.i5);
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.O = frameLayout;
        TextView textView = new TextView(getContext());
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setText(org.telegram.messenger.gd.M0(2131745456, null));
        org.telegram.messenger.f3.l(textView, org.telegram.ui.ActionBar.n6.j5, this.J0, 1, 20.0f);
        textView.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f));
        ImageView imageView = new ImageView(getContext());
        this.m1 = imageView;
        int L = org.telegram.messenger.g0.L(10.0f);
        imageView.setPadding(L, L, L, L);
        org.telegram.ui.ActionBar.y1 y1Var = new org.telegram.ui.ActionBar.y1(false);
        this.n1 = y1Var;
        imageView.setImageDrawable(y1Var);
        imageView.setOnClickListener(new vo(this, i7));
        frameLayout.addView(imageView, c8.ma.d(44, 44.0f, 8388659, 4.0f, -2.0f, 62.0f, 12.0f));
        frameLayout.addView(textView, c8.ma.d(-1, -2.0f, 8388659, 44.0f, 0.0f, 62.0f, 0.0f));
        int i11 = org.telegram.ui.ActionBar.n6.Fi;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i11, this.J0);
        int L2 = org.telegram.messenger.g0.L(28.0f);
        mh0 mh0Var = new mh0(R.raw.sun_outline, L2, L2, false, null);
        this.z1 = mh0Var;
        this.H1 = !org.telegram.ui.ActionBar.n6.I.q();
        V0(org.telegram.ui.ActionBar.n6.I.q(), false);
        mh0Var.J(true);
        mh0Var.h = true;
        this.e2 = w02;
        mh0Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.xc xcVar = new org.telegram.ui.xc(1, getContext(), this);
        this.A1 = xcVar;
        xcVar.setAnimation(mh0Var);
        xcVar.setScaleType(ImageView.ScaleType.CENTER);
        xcVar.setOnClickListener(new vo(this, 2));
        frameLayout.addView(xcVar, c8.ma.d(44, 44.0f, 8388661, 0.0f, -2.0f, 7.0f, 0.0f));
        this.B1 = new gp(getContext());
        ck0 ck0Var = new ck0(getContext(), null);
        this.w1 = ck0Var;
        ck0Var.setAdapter(jpVar);
        ck0Var.setDrawSelection(false);
        ck0Var.setClipChildren(false);
        ck0Var.setClipToPadding(false);
        ck0Var.setHasFixedSize(true);
        ck0Var.setItemAnimator(null);
        ck0Var.setNestedScrollingEnabled(false);
        getContext();
        v4.c0 c0Var = new v4.c0(0, false);
        this.x1 = c0Var;
        ck0Var.setLayoutManager(c0Var);
        ck0Var.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        int i12 = 3;
        ck0Var.setOnItemClickListener(new n(this, i12));
        ck0Var.setOnScrollListener(new oa(this, 8));
        wz wzVar = new wz(getContext(), this.J0);
        this.y1 = wzVar;
        wzVar.setViewType(14);
        wzVar.setVisibility(0);
        frameLayout.addView(wzVar, c8.ma.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        frameLayout.addView(ck0Var, c8.ma.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        View view = new View(getContext());
        this.C1 = view;
        int L3 = org.telegram.messenger.g0.L(6.0f);
        int w03 = org.telegram.ui.ActionBar.n6.w0(i11, this.J0);
        int i13 = org.telegram.ui.ActionBar.n6.Hi;
        int w04 = org.telegram.ui.ActionBar.n6.w0(i13, this.J0);
        Drawable k02 = org.telegram.ui.ActionBar.n6.k0(L3, L3, L3, L3, w03, w04, w04);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i11);
        org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i13);
        org.telegram.ui.ActionBar.i6 i6Var = this.J0;
        view.setBackground(k02);
        org.telegram.ui.ActionBar.u6.j(view, k02, M, M2, i6Var);
        view.setOnClickListener(new vo(this, i12));
        frameLayout.addView(view, c8.ma.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(getContext());
        this.F1 = textView2;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(17);
        textView2.setLines(1);
        textView2.setSingleLine(true);
        if (this.q1 == null) {
            textView2.setText(org.telegram.messenger.gd.M0(2131752127, null));
        } else {
            textView2.setText(org.telegram.messenger.gd.M0(2131752129, null));
        }
        textView2.setTextSize(1, 15.0f);
        textView2.setOnClickListener(new androidx.mediarouter.app.w(this, 9));
        frameLayout.addView(textView2, c8.ma.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        n6 n6Var = new n6(getContext(), true, true, true);
        this.D1 = n6Var;
        n6Var.getDrawable().q(true);
        n6Var.n = false;
        n6Var.setGravity(17);
        int i14 = org.telegram.ui.ActionBar.n6.Ji;
        org.telegram.ui.ActionBar.u6.Y(n6Var, i14, this.J0);
        n6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        n6Var.setTypeface(org.telegram.messenger.g0.o());
        frameLayout.addView(n6Var, c8.ma.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        n6 n6Var2 = new n6(getContext(), true, true, true);
        this.E1 = n6Var2;
        n6Var2.getDrawable().q(true);
        n6Var2.n = false;
        n6Var2.setGravity(17);
        org.telegram.ui.ActionBar.u6.Y(n6Var2, i14, this.J0);
        n6Var2.setTextSize(org.telegram.messenger.g0.L(12.0f));
        n6Var2.setAlpha(0.0f);
        n6Var2.setTranslationY(org.telegram.messenger.g0.L(11.0f));
        frameLayout.addView(n6Var2, c8.ma.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        if (this.q1 != null) {
            TextView textView3 = new TextView(getContext());
            this.o1 = textView3;
            textView3.setEllipsize(truncateAt);
            textView3.setGravity(17);
            textView3.setLines(1);
            textView3.setSingleLine(true);
            textView3.setText(org.telegram.messenger.gd.M0(2131745890, null));
            textView3.setTextSize(1, 15.0f);
            textView3.setOnClickListener(new y7(6, this, bnVar));
            frameLayout.addView(textView3, c8.ma.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
            TextView textView4 = new TextView(getContext());
            this.p1 = textView4;
            textView4.setEllipsize(truncateAt);
            textView4.setGravity(17);
            textView4.setLines(1);
            textView4.setSingleLine(true);
            if (bnVar.j() != null) {
                str = org.telegram.messenger.o10.k(bnVar.j(), true);
            } else {
                TLRPC.Chat chat = bnVar.e;
                str = chat != null ? chat.title : "";
            }
            textView4.setText(org.telegram.messenger.gd.a0("ChatThemeApplyHint", null, 2131752195, str));
            textView4.setTextSize(1, 15.0f);
            frameLayout.addView(textView4, c8.ma.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
        }
        Z0();
        a1(false);
    }

    public static void J0(lp lpVar, org.telegram.ui.x71 x71Var) {
        org.telegram.ui.ActionBar.f2 f2Var = new org.telegram.ui.ActionBar.f2();
        f2Var.a = true;
        org.telegram.ui.bn bnVar = lpVar.v1;
        x71Var.a.a = bnVar.getResourceProvider();
        x71Var.r1 = new fp(lpVar);
        int i7 = 5;
        f2Var.c = new me(i7);
        f2Var.d = new uo(lpVar, i7);
        f2Var.b = new uo(lpVar, 6);
        f2Var.e = true;
        lpVar.R1 = x71Var;
        bnVar.showAsSheet(x71Var, f2Var);
    }

    public static org.telegram.ui.ActionBar.m6 K0(boolean z10) {
        SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("themeconfig", 0);
        String str = "Blue";
        String string = sharedPreferences.getString("lastDayTheme", "Blue");
        if (org.telegram.ui.ActionBar.n6.Q0(string) != null && !org.telegram.ui.ActionBar.n6.Q0(string).q()) {
            str = string;
        }
        String str2 = "Dark Blue";
        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
        if (org.telegram.ui.ActionBar.n6.Q0(string2) != null && org.telegram.ui.ActionBar.n6.Q0(string2).q()) {
            str2 = string2;
        }
        return z10 ? org.telegram.ui.ActionBar.n6.Q0(str2) : org.telegram.ui.ActionBar.n6.Q0(str);
    }

    public static void X0(g01 g01Var) {
        if (g01Var == null) {
            return;
        }
        float width = g01Var.getWidth() / 2.0f;
        float width2 = g01Var.getWidth();
        float height = g01Var.getHeight();
        float max = Math.max(width, width2 - width);
        float max2 = Math.max(0.0f, height - 0.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(g01Var, g01.x, 0.0f, ((float) Math.sqrt((max2 * max2) + (max * max))) / 0.6f);
        ofFloat.setDuration(450L);
        ofFloat.setInterpolator(xs.e);
        ofFloat.addListener(new x(g01Var, 18));
        ofFloat.start();
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final void E(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.i5));
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
    public final void L0(boolean z10) {
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
        org.telegram.ui.bn bnVar = this.v1;
        if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < bnVar.getMessagesController().w5) {
            bnVar.getMessagesController().I0().b(bnVar.a(), this.Z1, new wo(this, i7));
            return;
        }
        org.telegram.ui.ActionBar.t3 t3Var = this.G1.a;
        gc gcVar = null;
        if (t3Var != this.Q1) {
            TLRPC.ChatTheme chatTheme2 = !t3Var.a ? t3Var.d : null;
            if (t3Var.d instanceof TLRPC.TL_chatThemeUniqueGift) {
                Long l10 = (Long) org.telegram.messenger.f4.f(t3Var.g).r.get(((TLRPC.TL_chatThemeUniqueGift) t3Var.d).gift.slug);
                if (l10 != null) {
                    j3 = l10.longValue();
                    chatTheme = t3Var.d;
                    if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                        TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                        if (starGift instanceof TL_stars.TL_starGiftUnique) {
                            tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                            if (j3 == 0 && tL_starGiftUnique != null && !z10) {
                                b5.k0(getContext(), this.J0, this.a, tL_starGiftUnique, j3, new uo(this, i7));
                                return;
                            }
                            org.telegram.messenger.f4.f(this.a).a(bnVar.a(), false, false);
                            org.telegram.messenger.f4.f(this.a).s(bnVar.a(), ig.b.c(chatTheme2), chatTheme2, true);
                            TLRPC.WallPaper wallPaper = Q0() ? null : this.s1.g;
                            boolean z12 = this.H1;
                            boolean z13 = this.u1;
                            g01 M0 = z12 != z13 ? M0() : null;
                            if (t3Var.a) {
                                c10 = 0;
                                this.s1.r(null, wallPaper, M0 == null, Boolean.valueOf(z13), false);
                            } else {
                                c10 = 0;
                                this.s1.r(t3Var, wallPaper, M0 == null, Boolean.valueOf(z13), false);
                            }
                            X0(M0);
                            this.I1 = true;
                            j10 = bnVar.j();
                            if (j10 != null && !j10.self) {
                                z11 = t3Var.a;
                                mv0 mv0Var = new mv0(getContext(), null, 1, -1, t3Var.e(), bnVar.getResourceProvider());
                                mv0Var.c.setVisibility(8);
                                TextView textView = mv0Var.b;
                                if (z11) {
                                    Object[] objArr = new Object[1];
                                    objArr[c10] = j10.first_name;
                                    org.telegram.messenger.f3.q("ThemeAlsoAppliedForHint", null, 2131743954, objArr, textView);
                                } else {
                                    Object[] objArr2 = new Object[1];
                                    objArr2[c10] = j10.first_name;
                                    org.telegram.messenger.f3.q("ThemeAlsoDisabledForHint", null, 2131743953, objArr2, textView);
                                }
                                textView.setTypeface(null);
                                gcVar = gc.g(bnVar, mv0Var, 2750);
                            }
                        }
                    }
                    tL_starGiftUnique = null;
                    if (j3 == 0) {
                    }
                    org.telegram.messenger.f4.f(this.a).a(bnVar.a(), false, false);
                    org.telegram.messenger.f4.f(this.a).s(bnVar.a(), ig.b.c(chatTheme2), chatTheme2, true);
                    if (Q0()) {
                    }
                    boolean z122 = this.H1;
                    boolean z132 = this.u1;
                    if (z122 != z132) {
                    }
                    if (t3Var.a) {
                    }
                    X0(M0);
                    this.I1 = true;
                    j10 = bnVar.j();
                    if (j10 != null) {
                        z11 = t3Var.a;
                        mv0 mv0Var2 = new mv0(getContext(), null, 1, -1, t3Var.e(), bnVar.getResourceProvider());
                        mv0Var2.c.setVisibility(8);
                        TextView textView2 = mv0Var2.b;
                        if (z11) {
                        }
                        textView2.setTypeface(null);
                        gcVar = gc.g(bnVar, mv0Var2, 2750);
                    }
                }
            }
            j3 = 0;
            chatTheme = t3Var.d;
            if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
            }
            tL_starGiftUnique = null;
            if (j3 == 0) {
            }
            org.telegram.messenger.f4.f(this.a).a(bnVar.a(), false, false);
            org.telegram.messenger.f4.f(this.a).s(bnVar.a(), ig.b.c(chatTheme2), chatTheme2, true);
            if (Q0()) {
            }
            boolean z1222 = this.H1;
            boolean z1322 = this.u1;
            if (z1222 != z1322) {
            }
            if (t3Var.a) {
            }
            X0(M0);
            this.I1 = true;
            j10 = bnVar.j();
            if (j10 != null) {
            }
        }
        dismiss();
        if (gcVar != null) {
            gcVar.j();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final g01 M0() {
        Bitmap bitmap;
        Bitmap bitmap2;
        org.telegram.ui.bn bnVar = this.v1;
        Activity parentActivity = bnVar != null ? bnVar.getParentActivity() : null;
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
                    bitmap2 = org.telegram.messenger.g0.L3(frameLayout);
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
        g01 g01Var = new g01(parentActivity);
        g01Var.setScaleType(ImageView.ScaleType.MATRIX);
        g01Var.setImageBitmap(bitmap2);
        g01Var.b(frameLayout.getWidth() / 2.0f, 0.0f, true);
        g01Var.setRadius(0.0f);
        frameLayout.addView(g01Var, new FrameLayout.LayoutParams(-1, -1));
        return g01Var;
    }

    public final void N0() {
        if (!Q0()) {
            dismiss();
            return;
        }
        final int i7 = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.J0);
        String M0 = org.telegram.messenger.gd.M0(2131752185, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.S = M0;
        u1Var.U = org.telegram.messenger.gd.M0(2131752186, null);
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131752188, null), new org.telegram.ui.ActionBar.r1(this) { // from class: org.telegram.ui.Components.xo
            public final /* synthetic */ lp b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.r1
            public final void h(org.telegram.ui.ActionBar.u1 u1Var2, int i10) {
                switch (i7) {
                    case 0:
                        this.b.L0(false);
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        final int i10 = 1;
        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752187, null), new org.telegram.ui.ActionBar.r1(this) { // from class: org.telegram.ui.Components.xo
            public final /* synthetic */ lp b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.r1
            public final void h(org.telegram.ui.ActionBar.u1 u1Var2, int i102) {
                switch (i10) {
                    case 0:
                        this.b.L0(false);
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        alertDialog$Builder.p();
    }

    public final void O0() {
        try {
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, this.J0);
            mh0 mh0Var = this.z1;
            if (mh0Var != null && w02 != this.e2) {
                this.e2 = w02;
                mh0Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
            }
            org.telegram.ui.ActionBar.y1 y1Var = this.n1;
            if (y1Var != null) {
                int i7 = org.telegram.ui.ActionBar.n6.j5;
                y1Var.a(org.telegram.ui.ActionBar.n6.w0(i7, this.J0));
                y1Var.b(org.telegram.ui.ActionBar.n6.w0(i7, this.J0));
                ImageView imageView = this.m1;
                if (imageView != null) {
                    imageView.invalidate();
                }
            }
            int w03 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.h5, this.J0);
            if (w03 != this.f2) {
                this.f2 = w03;
                v0(w03);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void P0() {
        if (this.J || this.I1) {
            return;
        }
        org.telegram.ui.ActionBar.n6.b = false;
        TLRPC.WallPaper wallPaper = Q0() ? null : this.s1.g;
        org.telegram.ui.ActionBar.t3 t3Var = this.G1.a;
        if (t3Var.a) {
            this.s1.r(null, wallPaper, false, Boolean.valueOf(this.H1), true);
        } else {
            this.s1.r(t3Var, wallPaper, false, Boolean.valueOf(this.H1), true);
        }
        si siVar = this.S1;
        if (siVar != null) {
            fj fjVar = siVar.m2;
            if (fjVar != null) {
                boolean z10 = this.H1;
                qa qaVar = fjVar.w;
                ((ArrayList) qaVar.e).clear();
                WallpapersListActivity.E0((ArrayList) qaVar.e, z10);
                qaVar.f();
            }
            this.S1.Q0();
        }
        jp jpVar = this.r1;
        if (jpVar == null || jpVar.d == null) {
            return;
        }
        for (int i7 = 0; i7 < jpVar.d.size(); i7++) {
            ((kp) jpVar.d.get(i7)).c = this.H1 ? 1 : 0;
        }
        jpVar.f();
    }

    public final boolean Q0() {
        if (this.G1 == null) {
            return false;
        }
        org.telegram.ui.ActionBar.t3 t3Var = this.Q1;
        ig.b bVar = t3Var != null ? t3Var.c : null;
        if (bVar == null) {
            bVar = ig.b.d("❌");
        }
        org.telegram.ui.ActionBar.t3 t3Var2 = this.G1.a;
        ig.b bVar2 = t3Var2 != null ? t3Var2.c : null;
        if (bVar2 == null) {
            bVar2 = ig.b.d("❌");
        }
        return !ig.b.a(bVar, bVar2);
    }

    public final void R0() {
        ArrayList arrayList;
        if (this.V1) {
            return;
        }
        org.telegram.messenger.f4 f10 = org.telegram.messenger.f4.f(this.a);
        if (!f10.f.c || (arrayList = f10.b) == null || arrayList.isEmpty()) {
            this.V1 = true;
            if (f10.f.c) {
                f10.q(new hp(this, f10), false);
                return;
            }
            ip ipVar = new ip(this, f10);
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
                org.telegram.messenger.q5 q5Var = org.telegram.messenger.f4.s;
                Objects.requireNonNull(q5Var);
                connectionsManager.sendRequestTyped(tl_getUniqueGiftChatThemes, new org.telegram.messenger.x3(q5Var), new org.telegram.messenger.z3(0, f10, ipVar));
            }
        }
    }

    public final void S0(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        kp kpVar = new kp((org.telegram.ui.ActionBar.t3) arrayList.get(0));
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        if (!this.P1) {
            org.telegram.ui.ActionBar.t3 t3Var = this.s1.f;
            this.Q1 = t3Var;
            if (t3Var != null) {
                t3Var.k();
            }
        }
        arrayList2.add(0, kpVar);
        if (!this.P1) {
            this.G1 = kpVar;
        }
        org.telegram.ui.ActionBar.t3 t3Var2 = this.Q1;
        ig.b bVar = t3Var2 != null ? t3Var2.c : null;
        boolean z10 = false;
        int i7 = 1;
        while (i7 < arrayList.size()) {
            org.telegram.ui.ActionBar.t3 t3Var3 = (org.telegram.ui.ActionBar.t3) arrayList.get(i7);
            kp kpVar2 = new kp(t3Var3);
            t3Var3.m(this.a);
            kpVar2.c = this.H1 ? 1 : 0;
            if (ig.b.a(t3Var3.c, bVar)) {
                arrayList2.add(1, kpVar2);
                z10 = true;
            } else {
                arrayList2.add(kpVar2);
            }
            i7++;
            z10 = z10;
        }
        org.telegram.ui.ActionBar.t3 t3Var4 = this.Q1;
        if (t3Var4 != null && !z10) {
            kp kpVar3 = new kp(t3Var4);
            t3Var4.m(this.a);
            kpVar3.c = this.H1 ? 1 : 0;
            arrayList2.add(1, kpVar3);
        }
        jp jpVar = this.r1;
        jpVar.d = arrayList2;
        jpVar.f();
        this.A1.setVisibility(0);
        if (!this.P1) {
            U0(false);
            this.w1.animate().alpha(1.0f).setDuration(150L).start();
        }
        this.P1 = true;
        a1(true);
    }

    public final void T0() {
        if (this.J || this.I1) {
            return;
        }
        this.J1 = false;
        this.v1.getClass();
        TLRPC.WallPaper wallPaper = Q0() ? null : this.q1;
        org.telegram.ui.ActionBar.t3 t3Var = this.G1.a;
        if (t3Var.a) {
            this.s1.r(null, wallPaper, true, Boolean.valueOf(this.H1), false);
        } else {
            this.s1.r(t3Var, wallPaper, true, Boolean.valueOf(this.H1), false);
        }
    }

    public final void U0(boolean z10) {
        jp jpVar = this.r1;
        ArrayList arrayList = jpVar.d;
        org.telegram.ui.ActionBar.t3 t3Var = this.Q1;
        v4.c0 c0Var = this.x1;
        ck0 ck0Var = this.w1;
        if (t3Var != null) {
            int i7 = 0;
            while (true) {
                if (i7 == arrayList.size()) {
                    i7 = -1;
                    break;
                } else {
                    if (ig.b.a(((kp) arrayList.get(i7)).a.c, this.Q1.c)) {
                        this.G1 = (kp) arrayList.get(i7);
                        break;
                    }
                    i7++;
                }
            }
            if (i7 != -1) {
                this.K1 = i7;
                jpVar.E(i7);
                if (i7 > 0 && i7 < arrayList.size() / 2) {
                    i7--;
                }
                int min = Math.min(i7, jpVar.d.size() - 1);
                if (z10) {
                    ck0Var.y0(min);
                } else {
                    c0Var.h1(min, 0);
                }
            }
        } else {
            this.G1 = (kp) arrayList.get(0);
            jpVar.E(0);
            if (z10) {
                ck0Var.y0(0);
            } else {
                c0Var.h1(0, 0);
            }
        }
        T0();
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final ArrayList V() {
        yo yoVar = new yo(this);
        ArrayList arrayList = new ArrayList();
        if (this.v1.w7) {
            org.telegram.ui.ActionBar.h2 h2Var = this.R1;
            if (h2Var instanceof org.telegram.ui.x71) {
                arrayList.addAll(((org.telegram.ui.x71) h2Var).X0());
                return arrayList;
            }
        }
        si siVar = this.S1;
        if (siVar != null) {
            arrayList.addAll(siVar.V());
        }
        int i7 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 32, (Class[]) null, (Paint) null, new Drawable[]{this.s0}, yoVar, org.telegram.ui.ActionBar.n6.h5));
        int i10 = org.telegram.ui.ActionBar.n6.Fi;
        View view = this.C1;
        arrayList.add(new org.telegram.ui.ActionBar.w6(view, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.w6(view, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Hi));
        int size = arrayList.size();
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((org.telegram.ui.ActionBar.w6) obj).n = this.s1;
        }
        return arrayList;
    }

    public final void V0(boolean z10, boolean z11) {
        if (this.H1 == z10) {
            return;
        }
        this.H1 = z10;
        org.telegram.ui.xc xcVar = this.A1;
        mh0 mh0Var = this.z1;
        if (z11) {
            mh0Var.P(z10 ? mh0Var.e[0] : 0);
            if (xcVar != null) {
                xcVar.d();
                return;
            }
            return;
        }
        int i7 = z10 ? mh0Var.e[0] - 1 : 0;
        mh0Var.N(i7, false, true);
        mh0Var.P(i7);
        if (xcVar != null) {
            xcVar.invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W0(boolean z10) {
        Bitmap bitmap;
        if (this.J || this.c2) {
            return;
        }
        ValueAnimator valueAnimator = this.N1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        org.telegram.ui.bn bnVar = this.v1;
        FrameLayout frameLayout = (FrameLayout) bnVar.getParentActivity().getWindow().getDecorView();
        FrameLayout frameLayout2 = (FrameLayout) getWindow().getDecorView();
        Window window = bnVar.getParentActivity().getWindow();
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
                    g01.a(bitmap, null, xcVar);
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
                org.telegram.ui.Cells.h1 h1Var = g01.x;
                float max = Math.max(measuredWidth, width - measuredWidth);
                float max2 = Math.max(measuredHeight, height - measuredHeight);
                float sqrt = ((float) Math.sqrt((max2 * max2) + (max * max))) / 0.6f;
                g01 g01Var = new g01(getContext());
                g01Var.setScaleType(ImageView.ScaleType.MATRIX);
                g01Var.setImageBitmap(bitmap);
                g01Var.b(measuredWidth, measuredHeight, z10);
                ColorFilter colorFilter = this.z1.getColorFilter();
                g01Var.n = xcVar;
                g01Var.r = colorFilter;
                g01Var.setRadius(!z10 ? 0.0f : sqrt);
                this.L1 = g01Var;
                g01Var.setOnTouchListener(new gi.a(17));
                this.M1 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.N1 = ofFloat;
                ofFloat.addUpdateListener(new zo(this, g01Var, sqrt, z10));
                this.N1.addListener(new x(this, 17));
                this.N1.setDuration(400L);
                this.N1.setInterpolator(xs.e);
                this.N1.start();
                frameLayout2.addView(this.L1, new ViewGroup.LayoutParams(-1, -1));
                org.telegram.messenger.g0.g3(new ch.k(23, this, z10));
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
        org.telegram.ui.Cells.h1 h1Var2 = g01.x;
        float max3 = Math.max(measuredWidth2, width2 - measuredWidth2);
        float max22 = Math.max(measuredHeight2, height2 - measuredHeight2);
        float sqrt2 = ((float) Math.sqrt((max22 * max22) + (max3 * max3))) / 0.6f;
        g01 g01Var2 = new g01(getContext());
        g01Var2.setScaleType(ImageView.ScaleType.MATRIX);
        g01Var2.setImageBitmap(bitmap);
        g01Var2.b(measuredWidth2, measuredHeight2, z10);
        ColorFilter colorFilter2 = this.z1.getColorFilter();
        g01Var2.n = xcVar2;
        g01Var2.r = colorFilter2;
        g01Var2.setRadius(!z10 ? 0.0f : sqrt2);
        this.L1 = g01Var2;
        g01Var2.setOnTouchListener(new gi.a(17));
        this.M1 = 0.0f;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.N1 = ofFloat2;
        ofFloat2.addUpdateListener(new zo(this, g01Var2, sqrt2, z10));
        this.N1.addListener(new x(this, 17));
        this.N1.setDuration(400L);
        this.N1.setInterpolator(xs.e);
        this.N1.start();
        frameLayout2.addView(this.L1, new ViewGroup.LayoutParams(-1, -1));
        org.telegram.messenger.g0.g3(new ch.k(23, this, z10));
    }

    public final void Y0(org.telegram.ui.ActionBar.m6 m6Var) {
        if (m6Var == null || m6Var == org.telegram.ui.ActionBar.n6.I) {
            return;
        }
        this.c2 = true;
        try {
            org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.w4, m6Var, Boolean.FALSE, null, -1);
        } finally {
            this.c2 = false;
        }
    }

    public final void Z0() {
        TextView textView = this.p1;
        if (textView != null) {
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.p5, this.J0);
            int L = org.telegram.messenger.g0.L(6.0f);
            int i7 = org.telegram.ui.ActionBar.n6.Fi;
            int o4 = i0.a.o(org.telegram.ui.ActionBar.n6.w0(i7, this.J0), 76);
            org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.n6.k0(L, L, L, L, 0, o4, o4);
            org.telegram.ui.ActionBar.q6 g10 = org.telegram.ui.ActionBar.u6.g(i7, 76);
            org.telegram.ui.ActionBar.i6 i6Var = this.J0;
            textView.setBackground(k02);
            org.telegram.ui.ActionBar.u6.j(textView, k02, null, g10, i6Var);
        }
        TextView textView2 = this.o1;
        if (textView2 != null) {
            int i10 = org.telegram.ui.ActionBar.n6.p7;
            org.telegram.ui.ActionBar.u6.U(textView2, i10, this.J0);
            int L2 = org.telegram.messenger.g0.L(6.0f);
            int o10 = i0.a.o(org.telegram.ui.ActionBar.n6.w0(i10, this.J0), 76);
            org.telegram.ui.Cells.y k03 = org.telegram.ui.ActionBar.n6.k0(L2, L2, L2, L2, 0, o10, o10);
            org.telegram.ui.ActionBar.q6 g11 = org.telegram.ui.ActionBar.u6.g(i10, 76);
            org.telegram.ui.ActionBar.i6 i6Var2 = this.J0;
            textView2.setBackground(k03);
            org.telegram.ui.ActionBar.u6.j(textView2, k03, null, g11, i6Var2);
        }
        int i11 = org.telegram.ui.ActionBar.n6.j5;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(i0.a.o(org.telegram.ui.ActionBar.n6.w0(i11, this.J0), 30), 1, -1);
        org.telegram.ui.ActionBar.q6 g12 = org.telegram.ui.ActionBar.u6.g(i11, 30);
        org.telegram.ui.ActionBar.i6 i6Var3 = this.J0;
        ImageView imageView = this.m1;
        org.telegram.ui.ActionBar.u6.Q(imageView, h02, null, g12, i6Var3);
        int w02 = org.telegram.ui.ActionBar.n6.w0(i11, this.J0);
        org.telegram.ui.ActionBar.y1 y1Var = this.n1;
        y1Var.a(w02);
        y1Var.b(org.telegram.ui.ActionBar.n6.w0(i11, this.J0));
        imageView.invalidate();
        int i12 = org.telegram.ui.ActionBar.n6.Fi;
        org.telegram.ui.ActionBar.u6.Q(this.A1, org.telegram.ui.ActionBar.n6.h0(i0.a.o(org.telegram.ui.ActionBar.n6.w0(i12, this.J0), 30), 1, -1), null, org.telegram.ui.ActionBar.u6.g(i12, 30), this.J0);
        int i13 = org.telegram.ui.ActionBar.n6.m5;
        org.telegram.ui.ActionBar.i6 i6Var4 = this.J0;
        TextView textView3 = this.F1;
        org.telegram.ui.ActionBar.u6.U(textView3, i13, i6Var4);
        int L3 = org.telegram.messenger.g0.L(6.0f);
        int o11 = i0.a.o(org.telegram.ui.ActionBar.n6.w0(i12, this.J0), 76);
        org.telegram.ui.ActionBar.u6.Q(textView3, org.telegram.ui.ActionBar.n6.k0(L3, L3, L3, L3, 0, o11, o11), null, org.telegram.ui.ActionBar.u6.g(i12, 76), this.J0);
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
    public final void a1(boolean z10) {
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus;
        ?? r17;
        boolean z11;
        boolean z12;
        ValueAnimator valueAnimator;
        org.telegram.ui.ActionBar.t3 t3Var;
        org.telegram.ui.bn bnVar = this.v1;
        TLRPC.Chat chat = bnVar.e;
        int i7 = 0;
        if (chat != null && !this.X1 && !this.Y1 && this.Z1 == null) {
            this.X1 = true;
            bnVar.getMessagesController().I0().a(bnVar.a(), new wo(this, i7));
        }
        boolean z13 = this.P1;
        wz wzVar = this.y1;
        TextView textView = this.p1;
        n6 n6Var = this.E1;
        TextView textView2 = this.o1;
        TextView textView3 = this.F1;
        org.telegram.ui.ActionBar.y1 y1Var = this.n1;
        View view = this.C1;
        n6 n6Var2 = this.D1;
        if (!z13) {
            y1Var.c(z10, 1.0f);
            view.setEnabled(false);
            org.telegram.messenger.g0.X3(textView3, false, 0.9f, false, z10);
            org.telegram.messenger.g0.X3(textView2, false, 0.9f, false, z10);
            org.telegram.messenger.g0.X3(view, false, 1.0f, false, z10);
            org.telegram.messenger.g0.X3(n6Var2, false, 0.9f, false, z10);
            org.telegram.messenger.g0.X3(n6Var, false, 0.9f, false, z10);
            org.telegram.messenger.g0.X3(textView, false, 0.9f, false, z10);
            org.telegram.messenger.g0.X3(wzVar, true, 1.0f, true, z10);
            return;
        }
        org.telegram.messenger.g0.X3(wzVar, false, 1.0f, true, z10);
        if (!Q0()) {
            y1Var.c(z10, 1.0f);
            view.setEnabled(false);
            org.telegram.messenger.g0.X3(textView3, true, 0.9f, false, z10);
            org.telegram.messenger.g0.X3(textView2, true, 0.9f, false, z10);
            org.telegram.messenger.g0.X3(view, false, 1.0f, false, z10);
            org.telegram.messenger.g0.X3(n6Var2, false, 0.9f, false, z10);
            org.telegram.messenger.g0.X3(n6Var, false, 0.9f, false, z10);
            org.telegram.messenger.g0.X3(textView, false, 0.9f, false, z10);
            return;
        }
        y1Var.c(z10, 0.0f);
        view.setEnabled(true);
        kp kpVar = this.G1;
        if (kpVar == null || (t3Var = kpVar.a) == null || !t3Var.a) {
            n6Var2.setText(org.telegram.messenger.gd.M0(2131752236, null));
            if (chat != null && (tL_premium_boostsStatus = this.Z1) != null && tL_premium_boostsStatus.level < bnVar.getMessagesController().w5) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
                if (this.W1 == null) {
                    lq lqVar = new lq(R.drawable.mini_switch_lock, 0);
                    this.W1 = lqVar;
                    lqVar.n = 1;
                }
                spannableStringBuilder.setSpan(this.W1, 0, 1, 33);
                r17 = 1;
                spannableStringBuilder.append((CharSequence) " ").append((CharSequence) org.telegram.messenger.gd.G(bnVar.getMessagesController().w5, "ReactionLevelRequiredBtn", new Object[0]));
                n6Var.setText(spannableStringBuilder);
                z11 = true;
                z12 = (z10 || n6Var2.getAlpha() <= 0.8f) ? false : r17;
                valueAnimator = this.b2;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.b2 = null;
                }
                if (z12) {
                    this.a2 = z11 ? 1.0f : 0.0f;
                    n6Var2.setTranslationY((-org.telegram.messenger.g0.L(7.0f)) * this.a2);
                } else {
                    float f10 = this.a2;
                    float f11 = z11 ? 1.0f : 0.0f;
                    float[] fArr = new float[2];
                    fArr[0] = f10;
                    fArr[r17] = f11;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                    this.b2 = ofFloat;
                    ofFloat.addUpdateListener(new w(this, 15));
                    this.b2.addListener(new org.telegram.ui.on(6, this, z11));
                    this.b2.start();
                }
                org.telegram.messenger.g0.X3(textView3, false, 0.9f, false, z10);
                org.telegram.messenger.g0.X3(textView2, false, 0.9f, false, z10);
                boolean z14 = r17;
                org.telegram.messenger.g0.X3(view, z14, 1.0f, false, z10);
                org.telegram.messenger.g0.X3(n6Var2, z14, 0.9f, false, z10);
                org.telegram.messenger.g0.W3(n6Var, z11, 0.9f, false, 0.7f, z10, null);
                org.telegram.messenger.g0.X3(textView, z14, 0.9f, false, z10);
            }
        } else {
            n6Var2.setText(org.telegram.messenger.gd.M0(2131752203, null));
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
        org.telegram.messenger.g0.X3(textView3, false, 0.9f, false, z10);
        org.telegram.messenger.g0.X3(textView2, false, 0.9f, false, z10);
        boolean z142 = r17;
        org.telegram.messenger.g0.X3(view, z142, 1.0f, false, z10);
        org.telegram.messenger.g0.X3(n6Var2, z142, 0.9f, false, z10);
        org.telegram.messenger.g0.W3(n6Var, z11, 0.9f, false, 0.7f, z10, null);
        org.telegram.messenger.g0.X3(textView, z142, 0.9f, false, z10);
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.l4) {
            org.telegram.messenger.ks.f(this.a).d(new uo(this, 0));
        }
    }

    @Override // org.telegram.ui.ActionBar.x2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.d2
    public final void dismiss() {
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.l4);
        super.dismiss();
        this.v1.getClass();
        boolean z10 = this.I1;
        boolean z11 = this.u1;
        g01 M0 = (z10 || this.H1 == z11) ? null : M0();
        if (!this.I1) {
            org.telegram.ui.zm zmVar = this.s1;
            TLRPC.WallPaper wallPaper = zmVar.g;
            if (wallPaper == null) {
                wallPaper = this.q1;
            }
            zmVar.r(this.t1, wallPaper, M0 == null, Boolean.valueOf(z11), false);
        }
        if (this.H1 != z11) {
            org.telegram.ui.ActionBar.m6 K0 = org.telegram.ui.ActionBar.n6.I.q() == z11 ? org.telegram.ui.ActionBar.n6.I : K0(z11);
            if (this.d2) {
                Y0(K0);
            } else {
                org.telegram.ui.ActionBar.n6.u(K0, false, z11);
            }
        }
        this.d2 = false;
        X0(M0);
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final boolean f0(MotionEvent motionEvent) {
        if (motionEvent == null || !Q0()) {
            return false;
        }
        int x10 = (int) motionEvent.getX();
        if (((int) motionEvent.getY()) >= this.b.getTop() && x10 >= this.b.getLeft() && x10 <= this.b.getRight()) {
            return false;
        }
        this.v1.getFragmentView().dispatchTouchEvent(motionEvent);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final void g0(float f10) {
        j30 j30Var = this.O1;
        if (j30Var != null) {
            j30Var.a();
        }
    }

    @Override // org.telegram.ui.ActionBar.x2, android.app.Dialog
    public final void onBackPressed() {
        N0();
    }

    @Override // org.telegram.ui.ActionBar.x2, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        ArrayList arrayList;
        super.onCreate(bundle);
        org.telegram.messenger.f4 f10 = org.telegram.messenger.f4.f(this.a);
        f10.m(true);
        f10.m(false);
        f10.l(true);
        f10.l(false);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.l4);
        this.I1 = false;
        int i7 = 7;
        if (!f10.f.c || (arrayList = f10.b) == null || arrayList.isEmpty()) {
            R0();
        } else {
            S0(f10.e(7));
        }
        if (this.v1.j() == null || org.telegram.messenger.bz.e1 <= 0 || this.v1.j().self) {
            return;
        }
        org.telegram.messenger.bz.e1--;
        org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit().putInt("dayNightThemeSwitchHintCount", org.telegram.messenger.bz.e1).apply();
        j30 j30Var = new j30(9, getContext(), this.v1.getResourceProvider(), false);
        this.O1 = j30Var;
        j30Var.setVisibility(4);
        this.O1.setShowingDuration(5000L);
        this.O1.setBottomOffset(-org.telegram.messenger.g0.L(8.0f));
        if (this.H1) {
            this.O1.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("ChatThemeDaySwitchTooltip", null, 2131752192, new Object[0])));
        } else {
            this.O1.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("ChatThemeNightSwitchTooltip", null, 2131752189, new Object[0])));
        }
        org.telegram.messenger.g0.h3(new uo(this, i7), 1500L);
        this.c.addView(this.O1, c8.ma.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final void s0() {
        int w02;
        super.s0();
        O0();
        try {
            if (Build.VERSION.SDK_INT < 30 || this.G0 != -1 || this.H0 == (w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.i5, this.J0))) {
                return;
            }
            this.H0 = w02;
            org.telegram.messenger.g0.s3(this, w02, false, null);
            org.telegram.messenger.g0.m3(this, ((double) org.telegram.messenger.g0.B(w02)) > 0.721d);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
