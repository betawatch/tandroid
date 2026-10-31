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
import org.telegram.ui.m91;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class dp extends org.telegram.ui.ActionBar.z2 implements org.telegram.messenger.us {
    public static final /* synthetic */ int c2 = 0;
    public final f6 A1;
    public final TextView B1;
    public cp C1;
    public boolean D1;
    public boolean E1;
    public boolean F1;
    public int G1;
    public b11 H1;
    public float I1;
    public ValueAnimator J1;
    public q30 K1;
    public boolean L1;
    public org.telegram.ui.ActionBar.y3 M1;
    public org.telegram.ui.ActionBar.k2 N1;
    public bi O1;
    public fg.i P1;
    public f6 Q1;
    public boolean R1;
    public dq S1;
    public boolean T1;
    public boolean U1;
    public TL_stories.TL_premium_boostsStatus V1;
    public float W1;
    public ValueAnimator X1;
    public boolean Y1;
    public boolean Z1;
    public int a2;
    public int b2;
    public final ImageView i1;
    public final org.telegram.ui.ActionBar.c2 j1;
    public final TextView k1;
    public final TextView l1;
    public TLRPC.WallPaper m1;
    public final bp n1;
    public final org.telegram.ui.sn o1;
    public final org.telegram.ui.ActionBar.y3 p1;
    public final boolean q1;
    public final org.telegram.ui.un r1;
    public final tk0 s1;
    public final s4.a0 t1;
    public final zz u1;
    public final bi0 v1;
    public final org.telegram.ui.hd w1;
    public final yo x1;
    public final View y1;
    public final f6 z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dp(org.telegram.ui.un unVar, org.telegram.ui.sn snVar) {
        super(1, (Context) unVar.getParentActivity(), (org.telegram.ui.ActionBar.p6) snVar, true);
        String str;
        int i10 = 1;
        this.G1 = -1;
        this.T1 = false;
        this.U1 = false;
        this.W1 = 0.0f;
        this.r1 = unVar;
        this.o1 = snVar;
        this.p1 = snVar.f;
        this.m1 = snVar.g;
        this.q1 = org.telegram.ui.ActionBar.t6.I.q();
        bp bpVar = new bp(this.a, unVar.a(), snVar, 0);
        this.n1 = bpVar;
        this.o0 = false;
        this.b0 = false;
        this.v0 = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.F0 = -1;
            int i11 = org.telegram.ui.ActionBar.t6.i5;
            this.G0 = org.telegram.ui.ActionBar.t6.w0(i11, this.I0);
            org.telegram.messenger.i0.t3(this, org.telegram.ui.ActionBar.t6.w0(i11, this.I0), false, null);
            org.telegram.messenger.i0.m3(this, ((double) org.telegram.messenger.i0.B(this.G0)) > 0.721d);
        } else {
            Q(org.telegram.ui.ActionBar.t6.i5);
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.N = frameLayout;
        TextView textView = new TextView(getContext());
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setText(org.telegram.messenger.cd.L0(2131745668, null));
        org.telegram.messenger.m5.m(textView, org.telegram.ui.ActionBar.t6.j5, this.I0, 1, 20.0f);
        textView.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(8.0f));
        ImageView imageView = new ImageView(getContext());
        this.i1 = imageView;
        int L = org.telegram.messenger.i0.L(10.0f);
        imageView.setPadding(L, L, L, L);
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(false);
        this.j1 = c2Var;
        imageView.setImageDrawable(c2Var);
        imageView.setOnClickListener(new no(this, i10));
        frameLayout.addView(imageView, w7.b6.d(44, 44.0f, 8388659, 4.0f, -2.0f, 62.0f, 12.0f));
        frameLayout.addView(textView, w7.b6.d(-1, -2.0f, 8388659, 44.0f, 0.0f, 62.0f, 0.0f));
        int i12 = org.telegram.ui.ActionBar.t6.Ci;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i12, this.I0);
        int L2 = org.telegram.messenger.i0.L(28.0f);
        bi0 bi0Var = new bi0(R.raw.sun_outline, L2, L2, false, null);
        this.v1 = bi0Var;
        this.D1 = !org.telegram.ui.ActionBar.t6.I.q();
        U0(org.telegram.ui.ActionBar.t6.I.q(), false);
        bi0Var.J(true);
        bi0Var.h = true;
        this.a2 = w02;
        bi0Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.hd hdVar = new org.telegram.ui.hd(this, getContext(), 1);
        this.w1 = hdVar;
        hdVar.setAnimation(bi0Var);
        hdVar.setScaleType(ImageView.ScaleType.CENTER);
        hdVar.setOnClickListener(new no(this, 2));
        frameLayout.addView(hdVar, w7.b6.d(44, 44.0f, 8388661, 0.0f, -2.0f, 7.0f, 0.0f));
        this.x1 = new yo(getContext());
        tk0 tk0Var = new tk0(getContext(), null);
        this.s1 = tk0Var;
        tk0Var.setAdapter(bpVar);
        tk0Var.setDrawSelection(false);
        tk0Var.setClipChildren(false);
        tk0Var.setClipToPadding(false);
        tk0Var.setHasFixedSize(true);
        tk0Var.setItemAnimator(null);
        tk0Var.setNestedScrollingEnabled(false);
        getContext();
        s4.a0 a0Var = new s4.a0(0, false);
        this.t1 = a0Var;
        tk0Var.setLayoutManager(a0Var);
        tk0Var.setPadding(org.telegram.messenger.i0.L(12.0f), 0, org.telegram.messenger.i0.L(12.0f), 0);
        int i13 = 3;
        tk0Var.setOnItemClickListener(new k(this, i13));
        tk0Var.setOnScrollListener(new ag.u(this, 20));
        zz zzVar = new zz(getContext(), this.I0);
        this.u1 = zzVar;
        zzVar.setViewType(14);
        zzVar.setVisibility(0);
        frameLayout.addView(zzVar, w7.b6.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        frameLayout.addView(tk0Var, w7.b6.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        View view = new View(getContext());
        this.y1 = view;
        int L3 = org.telegram.messenger.i0.L(6.0f);
        int w03 = org.telegram.ui.ActionBar.t6.w0(i12, this.I0);
        int i14 = org.telegram.ui.ActionBar.t6.Ei;
        int w04 = org.telegram.ui.ActionBar.t6.w0(i14, this.I0);
        Drawable k02 = org.telegram.ui.ActionBar.t6.k0(L3, L3, L3, L3, w03, w04, w04);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i12);
        org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i14);
        org.telegram.ui.ActionBar.p6 p6Var = this.I0;
        view.setBackground(k02);
        org.telegram.ui.ActionBar.a7.k(view, k02, N, N2, p6Var);
        view.setOnClickListener(new no(this, i13));
        frameLayout.addView(view, w7.b6.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(getContext());
        this.B1 = textView2;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(17);
        textView2.setLines(1);
        textView2.setSingleLine(true);
        if (this.m1 == null) {
            textView2.setText(org.telegram.messenger.cd.L0(2131752138, null));
        } else {
            textView2.setText(org.telegram.messenger.cd.L0(2131752140, null));
        }
        textView2.setTextSize(1, 15.0f);
        textView2.setOnClickListener(new androidx.mediarouter.app.w(this, 9));
        frameLayout.addView(textView2, w7.b6.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        f6 f6Var = new f6(getContext(), true, true, true);
        this.z1 = f6Var;
        f6Var.getDrawable().q(true);
        f6Var.n = false;
        f6Var.setGravity(17);
        int i15 = org.telegram.ui.ActionBar.t6.Gi;
        org.telegram.ui.ActionBar.a7.Z(f6Var, i15, this.I0);
        f6Var.setTextSize(org.telegram.messenger.i0.L(15.0f));
        f6Var.setTypeface(org.telegram.messenger.i0.o());
        frameLayout.addView(f6Var, w7.b6.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        f6 f6Var2 = new f6(getContext(), true, true, true);
        this.A1 = f6Var2;
        f6Var2.getDrawable().q(true);
        f6Var2.n = false;
        f6Var2.setGravity(17);
        org.telegram.ui.ActionBar.a7.Z(f6Var2, i15, this.I0);
        f6Var2.setTextSize(org.telegram.messenger.i0.L(12.0f));
        f6Var2.setAlpha(0.0f);
        f6Var2.setTranslationY(org.telegram.messenger.i0.L(11.0f));
        frameLayout.addView(f6Var2, w7.b6.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        if (this.m1 != null) {
            TextView textView3 = new TextView(getContext());
            this.k1 = textView3;
            textView3.setEllipsize(truncateAt);
            textView3.setGravity(17);
            textView3.setLines(1);
            textView3.setSingleLine(true);
            textView3.setText(org.telegram.messenger.cd.L0(2131746102, null));
            textView3.setTextSize(1, 15.0f);
            textView3.setOnClickListener(new org.telegram.ui.ud(26, this, unVar));
            frameLayout.addView(textView3, w7.b6.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
            TextView textView4 = new TextView(getContext());
            this.l1 = textView4;
            textView4.setEllipsize(truncateAt);
            textView4.setGravity(17);
            textView4.setLines(1);
            textView4.setSingleLine(true);
            if (unVar.j() != null) {
                str = org.telegram.messenger.h20.j(unVar.j(), true);
            } else {
                TLRPC.Chat chat = unVar.e;
                str = chat != null ? chat.title : "";
            }
            textView4.setText(org.telegram.messenger.cd.a0("ChatThemeApplyHint", null, 2131752206, str));
            textView4.setTextSize(1, 15.0f);
            frameLayout.addView(textView4, w7.b6.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
        }
        Y0();
        Z0(false);
    }

    public static void I0(dp dpVar, m91 m91Var) {
        org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2();
        i2Var.a = true;
        org.telegram.ui.un unVar = dpVar.r1;
        m91Var.a.a = unVar.getResourceProvider();
        m91Var.q1 = new xo(dpVar);
        i2Var.c = new org.telegram.messenger.rz(18);
        i2Var.d = new mo(dpVar, 5);
        i2Var.b = new mo(dpVar, 6);
        i2Var.e = true;
        dpVar.N1 = m91Var;
        unVar.showAsSheet(m91Var, i2Var);
    }

    public static org.telegram.ui.ActionBar.s6 J0(boolean z10) {
        SharedPreferences sharedPreferences = org.telegram.messenger.w0.b.getSharedPreferences("themeconfig", 0);
        String str = "Blue";
        String string = sharedPreferences.getString("lastDayTheme", "Blue");
        if (org.telegram.ui.ActionBar.t6.Q0(string) != null && !org.telegram.ui.ActionBar.t6.Q0(string).q()) {
            str = string;
        }
        String str2 = "Dark Blue";
        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
        if (org.telegram.ui.ActionBar.t6.Q0(string2) != null && org.telegram.ui.ActionBar.t6.Q0(string2).q()) {
            str2 = string2;
        }
        return z10 ? org.telegram.ui.ActionBar.t6.Q0(str2) : org.telegram.ui.ActionBar.t6.Q0(str);
    }

    public static void W0(b11 b11Var) {
        if (b11Var == null) {
            return;
        }
        float width = b11Var.getWidth() / 2.0f;
        float width2 = b11Var.getWidth();
        float height = b11Var.getHeight();
        float max = Math.max(width, width2 - width);
        float max2 = Math.max(0.0f, height - 0.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(b11Var, b11.x, 0.0f, ((float) Math.sqrt((max2 * max2) + (max * max))) / 0.6f);
        ofFloat.setDuration(450L);
        ofFloat.setInterpolator(vs.e);
        ofFloat.addListener(new w5(b11Var, 17));
        ofFloat.start();
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void F(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.i5));
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
        long j10;
        TLRPC.ChatTheme chatTheme;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        char c10;
        TLRPC.User j11;
        boolean z11;
        if (this.T1) {
            return;
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.V1;
        int i10 = 1;
        org.telegram.ui.un unVar = this.r1;
        if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < unVar.getMessagesController().u5) {
            unVar.getMessagesController().G0().b(unVar.a(), this.V1, new oo(this, i10));
            return;
        }
        org.telegram.ui.ActionBar.y3 y3Var = this.C1.a;
        wb wbVar = null;
        if (y3Var != this.M1) {
            TLRPC.ChatTheme chatTheme2 = !y3Var.a ? y3Var.d : null;
            if (y3Var.d instanceof TLRPC.TL_chatThemeUniqueGift) {
                Long l4 = (Long) org.telegram.messenger.g4.f(y3Var.g).r.get(((TLRPC.TL_chatThemeUniqueGift) y3Var.d).gift.slug);
                if (l4 != null) {
                    j10 = l4.longValue();
                    chatTheme = y3Var.d;
                    if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                        TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                        if (starGift instanceof TL_stars.TL_starGiftUnique) {
                            tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                            if (j10 == 0 && tL_starGiftUnique != null && !z10) {
                                s4.m0(getContext(), this.I0, this.a, tL_starGiftUnique, j10, new mo(this, i10));
                                return;
                            }
                            org.telegram.messenger.g4.f(this.a).a(unVar.a(), false, false);
                            org.telegram.messenger.g4.f(this.a).s(unVar.a(), yf.b.c(chatTheme2), chatTheme2, true);
                            TLRPC.WallPaper wallPaper = P0() ? null : this.o1.g;
                            boolean z12 = this.D1;
                            boolean z13 = this.q1;
                            b11 L0 = z12 != z13 ? L0() : null;
                            if (y3Var.a) {
                                c10 = 0;
                                this.o1.r(null, wallPaper, L0 == null, Boolean.valueOf(z13), false);
                            } else {
                                c10 = 0;
                                this.o1.r(y3Var, wallPaper, L0 == null, Boolean.valueOf(z13), false);
                            }
                            W0(L0);
                            this.E1 = true;
                            j11 = unVar.j();
                            if (j11 != null && !j11.self) {
                                z11 = y3Var.a;
                                fw0 fw0Var = new fw0(getContext(), null, 1, -1, y3Var.e(), unVar.getResourceProvider());
                                fw0Var.c.setVisibility(8);
                                TextView textView = fw0Var.b;
                                if (z11) {
                                    Object[] objArr = new Object[1];
                                    objArr[c10] = j11.first_name;
                                    org.telegram.messenger.m5.q("ThemeAlsoAppliedForHint", null, 2131744214, objArr, textView);
                                } else {
                                    Object[] objArr2 = new Object[1];
                                    objArr2[c10] = j11.first_name;
                                    org.telegram.messenger.m5.q("ThemeAlsoDisabledForHint", null, 2131744213, objArr2, textView);
                                }
                                textView.setTypeface(null);
                                wbVar = wb.g(unVar, fw0Var, 2750);
                            }
                        }
                    }
                    tL_starGiftUnique = null;
                    if (j10 == 0) {
                    }
                    org.telegram.messenger.g4.f(this.a).a(unVar.a(), false, false);
                    org.telegram.messenger.g4.f(this.a).s(unVar.a(), yf.b.c(chatTheme2), chatTheme2, true);
                    if (P0()) {
                    }
                    boolean z122 = this.D1;
                    boolean z132 = this.q1;
                    if (z122 != z132) {
                    }
                    if (y3Var.a) {
                    }
                    W0(L0);
                    this.E1 = true;
                    j11 = unVar.j();
                    if (j11 != null) {
                        z11 = y3Var.a;
                        fw0 fw0Var2 = new fw0(getContext(), null, 1, -1, y3Var.e(), unVar.getResourceProvider());
                        fw0Var2.c.setVisibility(8);
                        TextView textView2 = fw0Var2.b;
                        if (z11) {
                        }
                        textView2.setTypeface(null);
                        wbVar = wb.g(unVar, fw0Var2, 2750);
                    }
                }
            }
            j10 = 0;
            chatTheme = y3Var.d;
            if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
            }
            tL_starGiftUnique = null;
            if (j10 == 0) {
            }
            org.telegram.messenger.g4.f(this.a).a(unVar.a(), false, false);
            org.telegram.messenger.g4.f(this.a).s(unVar.a(), yf.b.c(chatTheme2), chatTheme2, true);
            if (P0()) {
            }
            boolean z1222 = this.D1;
            boolean z1322 = this.q1;
            if (z1222 != z1322) {
            }
            if (y3Var.a) {
            }
            W0(L0);
            this.E1 = true;
            j11 = unVar.j();
            if (j11 != null) {
            }
        }
        dismiss();
        if (wbVar != null) {
            wbVar.j();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b11 L0() {
        Bitmap bitmap;
        Bitmap bitmap2;
        org.telegram.ui.un unVar = this.r1;
        Activity parentActivity = unVar != null ? unVar.getParentActivity() : null;
        if (parentActivity == null || parentActivity.getWindow() == null || !(parentActivity.getWindow().getDecorView() instanceof FrameLayout)) {
            return null;
        }
        FrameLayout frameLayout = (FrameLayout) parentActivity.getWindow().getDecorView();
        if (frameLayout.getWidth() <= 0 || frameLayout.getHeight() <= 0) {
            return null;
        }
        try {
            bitmap2 = Build.VERSION.SDK_INT >= 26 ? org.telegram.messenger.i0.B0(parentActivity.getWindow()) : null;
            if (bitmap2 == null) {
                try {
                    bitmap2 = org.telegram.messenger.i0.M3(frameLayout);
                } catch (Throwable th2) {
                    bitmap = bitmap2;
                    th = th2;
                    org.telegram.messenger.f8.g(th, true);
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
        b11 b11Var = new b11(parentActivity);
        b11Var.setScaleType(ImageView.ScaleType.MATRIX);
        b11Var.setImageBitmap(bitmap2);
        b11Var.b(frameLayout.getWidth() / 2.0f, 0.0f, true);
        b11Var.setRadius(0.0f);
        frameLayout.addView(b11Var, new FrameLayout.LayoutParams(-1, -1));
        return b11Var;
    }

    public final void M0() {
        if (!P0()) {
            dismiss();
            return;
        }
        final int i10 = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.I0);
        String L0 = org.telegram.messenger.cd.L0(2131752196, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = L0;
        x1Var.T = org.telegram.messenger.cd.L0(2131752197, null);
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131752199, null), new org.telegram.ui.ActionBar.u1(this) { // from class: org.telegram.ui.Components.po
            public final /* synthetic */ dp b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.u1
            public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i11) {
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
        final int i11 = 1;
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752198, null), new org.telegram.ui.ActionBar.u1(this) { // from class: org.telegram.ui.Components.po
            public final /* synthetic */ dp b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.u1
            public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i112) {
                switch (i11) {
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
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, this.I0);
            bi0 bi0Var = this.v1;
            if (bi0Var != null && w02 != this.a2) {
                this.a2 = w02;
                bi0Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
            }
            org.telegram.ui.ActionBar.c2 c2Var = this.j1;
            if (c2Var != null) {
                int i10 = org.telegram.ui.ActionBar.t6.j5;
                c2Var.a(org.telegram.ui.ActionBar.t6.w0(i10, this.I0));
                c2Var.b(org.telegram.ui.ActionBar.t6.w0(i10, this.I0));
                ImageView imageView = this.i1;
                if (imageView != null) {
                    imageView.invalidate();
                }
            }
            int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h5, this.I0);
            if (w03 != this.b2) {
                this.b2 = w03;
                v0(w03);
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void O0() {
        if (this.I || this.E1) {
            return;
        }
        org.telegram.ui.ActionBar.t6.b = false;
        TLRPC.WallPaper wallPaper = P0() ? null : this.o1.g;
        org.telegram.ui.ActionBar.y3 y3Var = this.C1.a;
        if (y3Var.a) {
            this.o1.r(null, wallPaper, false, Boolean.valueOf(this.D1), true);
        } else {
            this.o1.r(y3Var, wallPaper, false, Boolean.valueOf(this.D1), true);
        }
        bi biVar = this.O1;
        if (biVar != null) {
            qi qiVar = biVar.i2;
            if (qiVar != null) {
                boolean z10 = this.D1;
                fa faVar = qiVar.w;
                ((ArrayList) faVar.e).clear();
                WallpapersListActivity.D0((ArrayList) faVar.e, z10);
                faVar.f();
            }
            this.O1.P0();
        }
        bp bpVar = this.n1;
        if (bpVar == null || bpVar.d == null) {
            return;
        }
        for (int i10 = 0; i10 < bpVar.d.size(); i10++) {
            ((cp) bpVar.d.get(i10)).c = this.D1 ? 1 : 0;
        }
        bpVar.f();
    }

    public final boolean P0() {
        if (this.C1 == null) {
            return false;
        }
        org.telegram.ui.ActionBar.y3 y3Var = this.M1;
        yf.b bVar = y3Var != null ? y3Var.c : null;
        if (bVar == null) {
            bVar = yf.b.d("❌");
        }
        org.telegram.ui.ActionBar.y3 y3Var2 = this.C1.a;
        yf.b bVar2 = y3Var2 != null ? y3Var2.c : null;
        if (bVar2 == null) {
            bVar2 = yf.b.d("❌");
        }
        return !yf.b.a(bVar, bVar2);
    }

    public final void Q0() {
        ArrayList arrayList;
        if (this.R1) {
            return;
        }
        org.telegram.messenger.g4 f7 = org.telegram.messenger.g4.f(this.a);
        if (!f7.f.c || (arrayList = f7.b) == null || arrayList.isEmpty()) {
            this.R1 = true;
            if (f7.f.c) {
                f7.q(new zo(this, f7), false);
                return;
            }
            ap apVar = new ap(this, f7);
            long currentTimeMillis = System.currentTimeMillis();
            i2.w1 w1Var = f7.f;
            boolean z10 = currentTimeMillis - w1Var.b > 7200000;
            if (((ArrayList) w1Var.d) == null || !w1Var.c || z10) {
                TL_account.Tl_getUniqueGiftChatThemes tl_getUniqueGiftChatThemes = new TL_account.Tl_getUniqueGiftChatThemes();
                i2.w1 w1Var2 = f7.f;
                tl_getUniqueGiftChatThemes.offset = (String) w1Var2.e;
                tl_getUniqueGiftChatThemes.hash = w1Var2.a;
                tl_getUniqueGiftChatThemes.limit = 50;
                ConnectionsManager connectionsManager = f7.getConnectionsManager();
                org.telegram.messenger.r5 r5Var = org.telegram.messenger.g4.s;
                Objects.requireNonNull(r5Var);
                connectionsManager.sendRequestTyped(tl_getUniqueGiftChatThemes, new org.telegram.messenger.y3(r5Var), new org.telegram.messenger.a4(0, f7, apVar));
            }
        }
    }

    public final void R0(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        cp cpVar = new cp((org.telegram.ui.ActionBar.y3) arrayList.get(0));
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        if (!this.L1) {
            org.telegram.ui.ActionBar.y3 y3Var = this.o1.f;
            this.M1 = y3Var;
            if (y3Var != null) {
                y3Var.k();
            }
        }
        arrayList2.add(0, cpVar);
        if (!this.L1) {
            this.C1 = cpVar;
        }
        org.telegram.ui.ActionBar.y3 y3Var2 = this.M1;
        yf.b bVar = y3Var2 != null ? y3Var2.c : null;
        boolean z10 = false;
        int i10 = 1;
        while (i10 < arrayList.size()) {
            org.telegram.ui.ActionBar.y3 y3Var3 = (org.telegram.ui.ActionBar.y3) arrayList.get(i10);
            cp cpVar2 = new cp(y3Var3);
            y3Var3.m(this.a);
            cpVar2.c = this.D1 ? 1 : 0;
            if (yf.b.a(y3Var3.c, bVar)) {
                arrayList2.add(1, cpVar2);
                z10 = true;
            } else {
                arrayList2.add(cpVar2);
            }
            i10++;
            z10 = z10;
        }
        org.telegram.ui.ActionBar.y3 y3Var4 = this.M1;
        if (y3Var4 != null && !z10) {
            cp cpVar3 = new cp(y3Var4);
            y3Var4.m(this.a);
            cpVar3.c = this.D1 ? 1 : 0;
            arrayList2.add(1, cpVar3);
        }
        bp bpVar = this.n1;
        bpVar.d = arrayList2;
        bpVar.f();
        this.w1.setVisibility(0);
        if (!this.L1) {
            T0(false);
            this.s1.animate().alpha(1.0f).setDuration(150L).start();
        }
        this.L1 = true;
        Z0(true);
    }

    public final void S0() {
        if (this.I || this.E1) {
            return;
        }
        this.F1 = false;
        this.r1.getClass();
        TLRPC.WallPaper wallPaper = P0() ? null : this.m1;
        org.telegram.ui.ActionBar.y3 y3Var = this.C1.a;
        if (y3Var.a) {
            this.o1.r(null, wallPaper, true, Boolean.valueOf(this.D1), false);
        } else {
            this.o1.r(y3Var, wallPaper, true, Boolean.valueOf(this.D1), false);
        }
    }

    public final void T0(boolean z10) {
        bp bpVar = this.n1;
        ArrayList arrayList = bpVar.d;
        org.telegram.ui.ActionBar.y3 y3Var = this.M1;
        s4.a0 a0Var = this.t1;
        tk0 tk0Var = this.s1;
        if (y3Var != null) {
            int i10 = 0;
            while (true) {
                if (i10 == arrayList.size()) {
                    i10 = -1;
                    break;
                } else {
                    if (yf.b.a(((cp) arrayList.get(i10)).a.c, this.M1.c)) {
                        this.C1 = (cp) arrayList.get(i10);
                        break;
                    }
                    i10++;
                }
            }
            if (i10 != -1) {
                this.G1 = i10;
                bpVar.E(i10);
                if (i10 > 0 && i10 < arrayList.size() / 2) {
                    i10--;
                }
                int min = Math.min(i10, bpVar.d.size() - 1);
                if (z10) {
                    tk0Var.y0(min);
                } else {
                    a0Var.h1(min, 0);
                }
            }
        } else {
            this.C1 = (cp) arrayList.get(0);
            bpVar.E(0);
            if (z10) {
                tk0Var.y0(0);
            } else {
                a0Var.h1(0, 0);
            }
        }
        S0();
    }

    public final void U0(boolean z10, boolean z11) {
        if (this.D1 == z10) {
            return;
        }
        this.D1 = z10;
        org.telegram.ui.hd hdVar = this.w1;
        bi0 bi0Var = this.v1;
        if (z11) {
            bi0Var.P(z10 ? bi0Var.e[0] : 0);
            if (hdVar != null) {
                hdVar.d();
                return;
            }
            return;
        }
        int i10 = z10 ? bi0Var.e[0] - 1 : 0;
        bi0Var.N(i10, false, true);
        bi0Var.P(i10);
        if (hdVar != null) {
            hdVar.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final ArrayList V() {
        qo qoVar = new qo(this);
        ArrayList arrayList = new ArrayList();
        if (this.r1.u7) {
            org.telegram.ui.ActionBar.k2 k2Var = this.N1;
            if (k2Var instanceof m91) {
                arrayList.addAll(((m91) k2Var).W0());
                return arrayList;
            }
        }
        bi biVar = this.O1;
        if (biVar != null) {
            arrayList.addAll(biVar.V());
        }
        int i10 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 32, (Class[]) null, (Paint) null, new Drawable[]{this.r0}, qoVar, org.telegram.ui.ActionBar.t6.h5));
        int i11 = org.telegram.ui.ActionBar.t6.Ci;
        View view = this.y1;
        arrayList.add(new org.telegram.ui.ActionBar.c7(view, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.c7(view, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Ei));
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((org.telegram.ui.ActionBar.c7) obj).n = this.o1;
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
        if (this.I || this.Y1) {
            return;
        }
        ValueAnimator valueAnimator = this.J1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        org.telegram.ui.un unVar = this.r1;
        FrameLayout frameLayout = (FrameLayout) unVar.getParentActivity().getWindow().getDecorView();
        FrameLayout frameLayout2 = (FrameLayout) getWindow().getDecorView();
        Window window = unVar.getParentActivity().getWindow();
        Window window2 = getWindow();
        if (Build.VERSION.SDK_INT >= 26 && frameLayout2.getWidth() > 0 && frameLayout2.getHeight() > 0) {
            Bitmap B0 = org.telegram.messenger.i0.B0(window);
            Bitmap B02 = B0 != null ? org.telegram.messenger.i0.B0(window2) : null;
            if (B0 != null && B02 != null) {
                frameLayout.getLocationOnScreen(new int[2]);
                frameLayout2.getLocationOnScreen(new int[2]);
                bitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmap);
                canvas.drawBitmap(B0, r6[0] - r7[0], r6[1] - r7[1], (Paint) null);
                canvas.drawBitmap(B02, 0.0f, 0.0f, (Paint) null);
                B0.recycle();
                B02.recycle();
                org.telegram.ui.hd hdVar = this.w1;
                if (bitmap == null) {
                    b11.a(bitmap, null, hdVar);
                } else {
                    bitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmap);
                    hdVar.setAlpha(0.0f);
                    frameLayout.draw(canvas2);
                    frameLayout2.draw(canvas2);
                    hdVar.setAlpha(1.0f);
                }
                hdVar.getLocationInWindow(new int[2]);
                float measuredWidth = (hdVar.getMeasuredWidth() / 2.0f) + r3[0];
                float measuredHeight = (hdVar.getMeasuredHeight() / 2.0f) + r3[1];
                float width = bitmap.getWidth();
                float height = bitmap.getHeight();
                org.telegram.ui.Cells.g1 g1Var = b11.x;
                float max = Math.max(measuredWidth, width - measuredWidth);
                float max2 = Math.max(measuredHeight, height - measuredHeight);
                float sqrt = ((float) Math.sqrt((max2 * max2) + (max * max))) / 0.6f;
                b11 b11Var = new b11(getContext());
                b11Var.setScaleType(ImageView.ScaleType.MATRIX);
                b11Var.setImageBitmap(bitmap);
                b11Var.b(measuredWidth, measuredHeight, z10);
                ColorFilter colorFilter = this.v1.getColorFilter();
                b11Var.n = hdVar;
                b11Var.r = colorFilter;
                b11Var.setRadius(!z10 ? 0.0f : sqrt);
                this.H1 = b11Var;
                b11Var.setOnTouchListener(new org.telegram.ui.ActionBar.n2(15));
                this.I1 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.J1 = ofFloat;
                ofFloat.addUpdateListener(new ro(this, b11Var, sqrt, z10));
                this.J1.addListener(new w5(this, 16));
                this.J1.setDuration(400L);
                this.J1.setInterpolator(vs.e);
                this.J1.start();
                frameLayout2.addView(this.H1, new ViewGroup.LayoutParams(-1, -1));
                org.telegram.messenger.i0.g3(new k2.v(12, this, z10));
            }
            if (B0 != null) {
                B0.recycle();
            }
        }
        bitmap = null;
        org.telegram.ui.hd hdVar2 = this.w1;
        if (bitmap == null) {
        }
        hdVar2.getLocationInWindow(new int[2]);
        float measuredWidth2 = (hdVar2.getMeasuredWidth() / 2.0f) + r3[0];
        float measuredHeight2 = (hdVar2.getMeasuredHeight() / 2.0f) + r3[1];
        float width2 = bitmap.getWidth();
        float height2 = bitmap.getHeight();
        org.telegram.ui.Cells.g1 g1Var2 = b11.x;
        float max3 = Math.max(measuredWidth2, width2 - measuredWidth2);
        float max22 = Math.max(measuredHeight2, height2 - measuredHeight2);
        float sqrt2 = ((float) Math.sqrt((max22 * max22) + (max3 * max3))) / 0.6f;
        b11 b11Var2 = new b11(getContext());
        b11Var2.setScaleType(ImageView.ScaleType.MATRIX);
        b11Var2.setImageBitmap(bitmap);
        b11Var2.b(measuredWidth2, measuredHeight2, z10);
        ColorFilter colorFilter2 = this.v1.getColorFilter();
        b11Var2.n = hdVar2;
        b11Var2.r = colorFilter2;
        b11Var2.setRadius(!z10 ? 0.0f : sqrt2);
        this.H1 = b11Var2;
        b11Var2.setOnTouchListener(new org.telegram.ui.ActionBar.n2(15));
        this.I1 = 0.0f;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.J1 = ofFloat2;
        ofFloat2.addUpdateListener(new ro(this, b11Var2, sqrt2, z10));
        this.J1.addListener(new w5(this, 16));
        this.J1.setDuration(400L);
        this.J1.setInterpolator(vs.e);
        this.J1.start();
        frameLayout2.addView(this.H1, new ViewGroup.LayoutParams(-1, -1));
        org.telegram.messenger.i0.g3(new k2.v(12, this, z10));
    }

    public final void X0(org.telegram.ui.ActionBar.s6 s6Var) {
        if (s6Var == null || s6Var == org.telegram.ui.ActionBar.t6.I) {
            return;
        }
        this.Y1 = true;
        try {
            org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.t4, s6Var, Boolean.FALSE, null, -1);
        } finally {
            this.Y1 = false;
        }
    }

    public final void Y0() {
        TextView textView = this.l1;
        if (textView != null) {
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.p5, this.I0);
            int L = org.telegram.messenger.i0.L(6.0f);
            int i10 = org.telegram.ui.ActionBar.t6.Ci;
            int o10 = i0.b.o(org.telegram.ui.ActionBar.t6.w0(i10, this.I0), 76);
            org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.t6.k0(L, L, L, L, 0, o10, o10);
            org.telegram.ui.ActionBar.w6 h = org.telegram.ui.ActionBar.a7.h(i10, 76);
            org.telegram.ui.ActionBar.p6 p6Var = this.I0;
            textView.setBackground(k02);
            org.telegram.ui.ActionBar.a7.k(textView, k02, null, h, p6Var);
        }
        TextView textView2 = this.k1;
        if (textView2 != null) {
            int i11 = org.telegram.ui.ActionBar.t6.p7;
            org.telegram.ui.ActionBar.a7.V(textView2, i11, this.I0);
            int L2 = org.telegram.messenger.i0.L(6.0f);
            int o11 = i0.b.o(org.telegram.ui.ActionBar.t6.w0(i11, this.I0), 76);
            org.telegram.ui.Cells.y k03 = org.telegram.ui.ActionBar.t6.k0(L2, L2, L2, L2, 0, o11, o11);
            org.telegram.ui.ActionBar.w6 h10 = org.telegram.ui.ActionBar.a7.h(i11, 76);
            org.telegram.ui.ActionBar.p6 p6Var2 = this.I0;
            textView2.setBackground(k03);
            org.telegram.ui.ActionBar.a7.k(textView2, k03, null, h10, p6Var2);
        }
        int i12 = org.telegram.ui.ActionBar.t6.j5;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(i0.b.o(org.telegram.ui.ActionBar.t6.w0(i12, this.I0), 30), 1, -1);
        org.telegram.ui.ActionBar.w6 h11 = org.telegram.ui.ActionBar.a7.h(i12, 30);
        org.telegram.ui.ActionBar.p6 p6Var3 = this.I0;
        ImageView imageView = this.i1;
        org.telegram.ui.ActionBar.a7.R(imageView, h02, null, h11, p6Var3);
        int w02 = org.telegram.ui.ActionBar.t6.w0(i12, this.I0);
        org.telegram.ui.ActionBar.c2 c2Var = this.j1;
        c2Var.a(w02);
        c2Var.b(org.telegram.ui.ActionBar.t6.w0(i12, this.I0));
        imageView.invalidate();
        int i13 = org.telegram.ui.ActionBar.t6.Ci;
        org.telegram.ui.ActionBar.a7.R(this.w1, org.telegram.ui.ActionBar.t6.h0(i0.b.o(org.telegram.ui.ActionBar.t6.w0(i13, this.I0), 30), 1, -1), null, org.telegram.ui.ActionBar.a7.h(i13, 30), this.I0);
        int i14 = org.telegram.ui.ActionBar.t6.m5;
        org.telegram.ui.ActionBar.p6 p6Var4 = this.I0;
        TextView textView3 = this.B1;
        org.telegram.ui.ActionBar.a7.V(textView3, i14, p6Var4);
        int L3 = org.telegram.messenger.i0.L(6.0f);
        int o12 = i0.b.o(org.telegram.ui.ActionBar.t6.w0(i13, this.I0), 76);
        org.telegram.ui.ActionBar.a7.R(textView3, org.telegram.ui.ActionBar.t6.k0(L3, L3, L3, L3, 0, o12, o12), null, org.telegram.ui.ActionBar.a7.h(i13, 76), this.I0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0137  */
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
        org.telegram.ui.ActionBar.y3 y3Var;
        org.telegram.ui.un unVar = this.r1;
        TLRPC.Chat chat = unVar.e;
        int i10 = 0;
        if (chat != null && !this.T1 && !this.U1 && this.V1 == null) {
            this.T1 = true;
            unVar.getMessagesController().G0().a(unVar.a(), new oo(this, i10));
        }
        boolean z13 = this.L1;
        zz zzVar = this.u1;
        TextView textView = this.l1;
        f6 f6Var = this.A1;
        TextView textView2 = this.k1;
        TextView textView3 = this.B1;
        org.telegram.ui.ActionBar.c2 c2Var = this.j1;
        View view = this.y1;
        f6 f6Var2 = this.z1;
        if (!z13) {
            c2Var.c(z10, 1.0f);
            view.setEnabled(false);
            org.telegram.messenger.i0.Y3(textView3, false, 0.9f, false, z10);
            org.telegram.messenger.i0.Y3(textView2, false, 0.9f, false, z10);
            org.telegram.messenger.i0.Y3(view, false, 1.0f, false, z10);
            org.telegram.messenger.i0.Y3(f6Var2, false, 0.9f, false, z10);
            org.telegram.messenger.i0.Y3(f6Var, false, 0.9f, false, z10);
            org.telegram.messenger.i0.Y3(textView, false, 0.9f, false, z10);
            org.telegram.messenger.i0.Y3(zzVar, true, 1.0f, true, z10);
            return;
        }
        org.telegram.messenger.i0.Y3(zzVar, false, 1.0f, true, z10);
        if (!P0()) {
            c2Var.c(z10, 1.0f);
            view.setEnabled(false);
            org.telegram.messenger.i0.Y3(textView3, true, 0.9f, false, z10);
            org.telegram.messenger.i0.Y3(textView2, true, 0.9f, false, z10);
            org.telegram.messenger.i0.Y3(view, false, 1.0f, false, z10);
            org.telegram.messenger.i0.Y3(f6Var2, false, 0.9f, false, z10);
            org.telegram.messenger.i0.Y3(f6Var, false, 0.9f, false, z10);
            org.telegram.messenger.i0.Y3(textView, false, 0.9f, false, z10);
            return;
        }
        c2Var.c(z10, 0.0f);
        view.setEnabled(true);
        cp cpVar = this.C1;
        if (cpVar == null || (y3Var = cpVar.a) == null || !y3Var.a) {
            f6Var2.setText(org.telegram.messenger.cd.L0(2131752247, null));
            if (chat != null && (tL_premium_boostsStatus = this.V1) != null && tL_premium_boostsStatus.level < unVar.getMessagesController().u5) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
                if (this.S1 == null) {
                    dq dqVar = new dq(R.drawable.mini_switch_lock, 0);
                    this.S1 = dqVar;
                    dqVar.n = 1;
                }
                spannableStringBuilder.setSpan(this.S1, 0, 1, 33);
                r17 = 1;
                spannableStringBuilder.append((CharSequence) " ").append((CharSequence) org.telegram.messenger.cd.G(unVar.getMessagesController().u5, "ReactionLevelRequiredBtn", new Object[0]));
                f6Var.setText(spannableStringBuilder);
                z11 = true;
                z12 = (z10 || f6Var2.getAlpha() <= 0.8f) ? false : r17;
                valueAnimator = this.X1;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.X1 = null;
                }
                if (z12) {
                    this.W1 = z11 ? 1.0f : 0.0f;
                    f6Var2.setTranslationY((-org.telegram.messenger.i0.L(7.0f)) * this.W1);
                } else {
                    float f7 = this.W1;
                    float f10 = z11 ? 1.0f : 0.0f;
                    float[] fArr = new float[2];
                    fArr[0] = f7;
                    fArr[r17] = f10;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                    this.X1 = ofFloat;
                    ofFloat.addUpdateListener(new a6(this, 14));
                    this.X1.addListener(new eg.m(21, this, z11));
                    this.X1.start();
                }
                org.telegram.messenger.i0.Y3(textView3, false, 0.9f, false, z10);
                org.telegram.messenger.i0.Y3(textView2, false, 0.9f, false, z10);
                boolean z14 = r17;
                org.telegram.messenger.i0.Y3(view, z14, 1.0f, false, z10);
                org.telegram.messenger.i0.Y3(f6Var2, z14, 0.9f, false, z10);
                org.telegram.messenger.i0.X3(f6Var, z11, 0.9f, false, 0.7f, z10, null);
                org.telegram.messenger.i0.Y3(textView, z14, 0.9f, false, z10);
            }
        } else {
            f6Var2.setText(org.telegram.messenger.cd.L0(2131752214, null));
        }
        r17 = 1;
        z11 = false;
        if (z10) {
        }
        valueAnimator = this.X1;
        if (valueAnimator != null) {
        }
        if (z12) {
        }
        org.telegram.messenger.i0.Y3(textView3, false, 0.9f, false, z10);
        org.telegram.messenger.i0.Y3(textView2, false, 0.9f, false, z10);
        boolean z142 = r17;
        org.telegram.messenger.i0.Y3(view, z142, 1.0f, false, z10);
        org.telegram.messenger.i0.Y3(f6Var2, z142, 0.9f, false, z10);
        org.telegram.messenger.i0.X3(f6Var, z11, 0.9f, false, 0.7f, z10, null);
        org.telegram.messenger.i0.Y3(textView, z142, 0.9f, false, z10);
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.i4) {
            org.telegram.messenger.zs.f(this.a).d(new mo(this, 0));
        }
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.g2
    public final void dismiss() {
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.i4);
        super.dismiss();
        this.r1.getClass();
        boolean z10 = this.E1;
        boolean z11 = this.q1;
        b11 L0 = (z10 || this.D1 == z11) ? null : L0();
        if (!this.E1) {
            org.telegram.ui.sn snVar = this.o1;
            TLRPC.WallPaper wallPaper = snVar.g;
            if (wallPaper == null) {
                wallPaper = this.m1;
            }
            snVar.r(this.p1, wallPaper, L0 == null, Boolean.valueOf(z11), false);
        }
        if (this.D1 != z11) {
            org.telegram.ui.ActionBar.s6 J0 = org.telegram.ui.ActionBar.t6.I.q() == z11 ? org.telegram.ui.ActionBar.t6.I : J0(z11);
            if (this.Z1) {
                X0(J0);
            } else {
                org.telegram.ui.ActionBar.t6.u(J0, false, z11);
            }
        }
        this.Z1 = false;
        W0(L0);
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final boolean f0(MotionEvent motionEvent) {
        if (motionEvent == null || !P0()) {
            return false;
        }
        int x10 = (int) motionEvent.getX();
        if (((int) motionEvent.getY()) >= this.b.getTop() && x10 >= this.b.getLeft() && x10 <= this.b.getRight()) {
            return false;
        }
        this.r1.getFragmentView().dispatchTouchEvent(motionEvent);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void g0(float f7) {
        q30 q30Var = this.K1;
        if (q30Var != null) {
            q30Var.b(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog
    public final void onBackPressed() {
        M0();
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        ArrayList arrayList;
        super.onCreate(bundle);
        org.telegram.messenger.g4 f7 = org.telegram.messenger.g4.f(this.a);
        f7.m(true);
        f7.m(false);
        f7.l(true);
        f7.l(false);
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.i4);
        this.E1 = false;
        int i10 = 7;
        if (!f7.f.c || (arrayList = f7.b) == null || arrayList.isEmpty()) {
            Q0();
        } else {
            R0(f7.e(7));
        }
        if (this.r1.j() == null || org.telegram.messenger.tz.e1 <= 0 || this.r1.j().self) {
            return;
        }
        org.telegram.messenger.tz.e1--;
        org.telegram.messenger.w0.b.getSharedPreferences("mainconfig", 0).edit().putInt("dayNightThemeSwitchHintCount", org.telegram.messenger.tz.e1).apply();
        q30 q30Var = new q30(9, getContext(), this.r1.getResourceProvider(), false);
        this.K1 = q30Var;
        q30Var.setVisibility(4);
        this.K1.setShowingDuration(5000L);
        this.K1.setBottomOffset(-org.telegram.messenger.i0.L(8.0f));
        if (this.D1) {
            this.K1.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("ChatThemeDaySwitchTooltip", null, 2131752203, new Object[0])));
        } else {
            this.K1.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("ChatThemeNightSwitchTooltip", null, 2131752200, new Object[0])));
        }
        org.telegram.messenger.i0.h3(new mo(this, i10), 1500L);
        this.c.addView(this.K1, w7.b6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void s0() {
        int w02;
        super.s0();
        N0();
        try {
            if (Build.VERSION.SDK_INT < 30 || this.F0 != -1 || this.G0 == (w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.i5, this.I0))) {
                return;
            }
            this.G0 = w02;
            org.telegram.messenger.i0.t3(this, w02, false, null);
            org.telegram.messenger.i0.m3(this, ((double) org.telegram.messenger.i0.B(w02)) > 0.721d);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
