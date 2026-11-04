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
import org.telegram.ui.l71;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class vo extends org.telegram.ui.ActionBar.t2 implements org.telegram.messenger.cs {
    public static final /* synthetic */ int d2 = 0;
    public final h6 A1;
    public final h6 B1;
    public final TextView C1;
    public uo D1;
    public boolean E1;
    public boolean F1;
    public boolean G1;
    public int H1;
    public wz0 I1;
    public float J1;
    public ValueAnimator K1;
    public u20 L1;
    public boolean M1;
    public org.telegram.ui.ActionBar.p3 N1;
    public org.telegram.ui.ActionBar.d2 O1;
    public bi P1;
    public ai.c0 Q1;
    public h6 R1;
    public boolean S1;
    public wp T1;
    public boolean U1;
    public boolean V1;
    public TL_stories.TL_premium_boostsStatus W1;
    public float X1;
    public ValueAnimator Y1;
    public boolean Z1;
    public boolean a2;
    public int b2;
    public int c2;
    public final ImageView j1;
    public final org.telegram.ui.ActionBar.w1 k1;
    public final TextView l1;
    public final TextView m1;
    public TLRPC.WallPaper n1;
    public final to o1;
    public final org.telegram.ui.um p1;
    public final org.telegram.ui.ActionBar.p3 q1;
    public final boolean r1;
    public final org.telegram.ui.wm s1;
    public final tj0 t1;
    public final u4.b0 u1;
    public final iz v1;
    public final ch0 w1;
    public final org.telegram.ui.xc x1;
    public final qo y1;
    public final View z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vo(org.telegram.ui.wm wmVar, org.telegram.ui.um umVar) {
        super(1, (Context) wmVar.getParentActivity(), (org.telegram.ui.ActionBar.e6) umVar, true);
        String str;
        int i3 = 1;
        this.H1 = -1;
        this.U1 = false;
        this.V1 = false;
        this.X1 = 0.0f;
        this.s1 = wmVar;
        this.p1 = umVar;
        this.q1 = umVar.f;
        this.n1 = umVar.g;
        this.r1 = org.telegram.ui.ActionBar.k6.I.q();
        to toVar = new to(this.a, wmVar.a(), umVar, 0);
        this.o1 = toVar;
        this.p0 = false;
        this.c0 = false;
        this.w0 = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.G0 = -1;
            int i10 = org.telegram.ui.ActionBar.k6.i5;
            this.H0 = org.telegram.ui.ActionBar.k6.w0(i10, this.J0);
            org.telegram.messenger.g0.u3(this, org.telegram.ui.ActionBar.k6.w0(i10, this.J0), false, null);
            org.telegram.messenger.g0.n3(this, ((double) org.telegram.messenger.g0.B(this.H0)) > 0.721d);
        } else {
            P(org.telegram.ui.ActionBar.k6.i5);
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.O = frameLayout;
        TextView textView = new TextView(getContext());
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setText(org.telegram.messenger.bd.M0(2131745661, null));
        org.telegram.messenger.k5.n(textView, org.telegram.ui.ActionBar.k6.j5, this.J0, 1, 20.0f);
        textView.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f));
        ImageView imageView = new ImageView(getContext());
        this.j1 = imageView;
        int L = org.telegram.messenger.g0.L(10.0f);
        imageView.setPadding(L, L, L, L);
        org.telegram.ui.ActionBar.w1 w1Var = new org.telegram.ui.ActionBar.w1(false);
        this.k1 = w1Var;
        imageView.setImageDrawable(w1Var);
        imageView.setOnClickListener(new eo(this, i3));
        frameLayout.addView(imageView, b8.mf.d(44, 44.0f, 8388659, 4.0f, -2.0f, 62.0f, 12.0f));
        frameLayout.addView(textView, b8.mf.d(-1, -2.0f, 8388659, 44.0f, 0.0f, 62.0f, 0.0f));
        int i11 = org.telegram.ui.ActionBar.k6.Ci;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i11, this.J0);
        int L2 = org.telegram.messenger.g0.L(28.0f);
        ch0 ch0Var = new ch0(R.raw.sun_outline, L2, L2, false, null);
        this.w1 = ch0Var;
        this.E1 = !org.telegram.ui.ActionBar.k6.I.q();
        U0(org.telegram.ui.ActionBar.k6.I.q(), false);
        ch0Var.J(true);
        ch0Var.h = true;
        this.b2 = w02;
        ch0Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.xc xcVar = new org.telegram.ui.xc(1, getContext(), this);
        this.x1 = xcVar;
        xcVar.setAnimation(ch0Var);
        xcVar.setScaleType(ImageView.ScaleType.CENTER);
        xcVar.setOnClickListener(new eo(this, 2));
        frameLayout.addView(xcVar, b8.mf.d(44, 44.0f, 8388661, 0.0f, -2.0f, 7.0f, 0.0f));
        this.y1 = new qo(getContext());
        tj0 tj0Var = new tj0(getContext(), null);
        this.t1 = tj0Var;
        tj0Var.setAdapter(toVar);
        tj0Var.setDrawSelection(false);
        tj0Var.setClipChildren(false);
        tj0Var.setClipToPadding(false);
        tj0Var.setHasFixedSize(true);
        tj0Var.setItemAnimator(null);
        tj0Var.setNestedScrollingEnabled(false);
        getContext();
        u4.b0 b0Var = new u4.b0(0, false);
        this.u1 = b0Var;
        tj0Var.setLayoutManager(b0Var);
        tj0Var.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        int i12 = 3;
        tj0Var.setOnItemClickListener(new k(this, i12));
        tj0Var.setOnScrollListener(new ji(this, 7));
        iz izVar = new iz(getContext(), this.J0);
        this.v1 = izVar;
        izVar.setViewType(14);
        izVar.setVisibility(0);
        frameLayout.addView(izVar, b8.mf.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        frameLayout.addView(tj0Var, b8.mf.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        View view = new View(getContext());
        this.z1 = view;
        int L3 = org.telegram.messenger.g0.L(6.0f);
        int w03 = org.telegram.ui.ActionBar.k6.w0(i11, this.J0);
        int i13 = org.telegram.ui.ActionBar.k6.Ei;
        int w04 = org.telegram.ui.ActionBar.k6.w0(i13, this.J0);
        Drawable k02 = org.telegram.ui.ActionBar.k6.k0(L3, L3, L3, L3, w03, w04, w04);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i13);
        org.telegram.ui.ActionBar.e6 e6Var = this.J0;
        view.setBackground(k02);
        org.telegram.ui.ActionBar.r6.k(view, k02, N, N2, e6Var);
        view.setOnClickListener(new eo(this, i12));
        frameLayout.addView(view, b8.mf.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(getContext());
        this.C1 = textView2;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(17);
        textView2.setLines(1);
        textView2.setSingleLine(true);
        if (this.n1 == null) {
            textView2.setText(org.telegram.messenger.bd.M0(2131752138, null));
        } else {
            textView2.setText(org.telegram.messenger.bd.M0(2131752140, null));
        }
        textView2.setTextSize(1, 15.0f);
        int i14 = 9;
        textView2.setOnClickListener(new androidx.mediarouter.app.w(this, i14));
        frameLayout.addView(textView2, b8.mf.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        h6 h6Var = new h6(getContext(), true, true, true);
        this.A1 = h6Var;
        h6Var.getDrawable().q(true);
        h6Var.n = false;
        h6Var.setGravity(17);
        int i15 = org.telegram.ui.ActionBar.k6.Gi;
        org.telegram.ui.ActionBar.r6.Z(h6Var, i15, this.J0);
        h6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        frameLayout.addView(h6Var, b8.mf.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        h6 h6Var2 = new h6(getContext(), true, true, true);
        this.B1 = h6Var2;
        h6Var2.getDrawable().q(true);
        h6Var2.n = false;
        h6Var2.setGravity(17);
        org.telegram.ui.ActionBar.r6.Z(h6Var2, i15, this.J0);
        h6Var2.setTextSize(org.telegram.messenger.g0.L(12.0f));
        h6Var2.setAlpha(0.0f);
        h6Var2.setTranslationY(org.telegram.messenger.g0.L(11.0f));
        frameLayout.addView(h6Var2, b8.mf.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        if (this.n1 != null) {
            TextView textView3 = new TextView(getContext());
            this.l1 = textView3;
            textView3.setEllipsize(truncateAt);
            textView3.setGravity(17);
            textView3.setLines(1);
            textView3.setSingleLine(true);
            textView3.setText(org.telegram.messenger.bd.M0(2131746095, null));
            textView3.setTextSize(1, 15.0f);
            textView3.setOnClickListener(new q2(i14, this, wmVar));
            frameLayout.addView(textView3, b8.mf.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
            TextView textView4 = new TextView(getContext());
            this.m1 = textView4;
            textView4.setEllipsize(truncateAt);
            textView4.setGravity(17);
            textView4.setLines(1);
            textView4.setSingleLine(true);
            if (wmVar.j() != null) {
                str = org.telegram.messenger.l10.j(wmVar.j(), true);
            } else {
                TLRPC.Chat chat = wmVar.e;
                str = chat != null ? chat.title : "";
            }
            textView4.setText(org.telegram.messenger.bd.a0("ChatThemeApplyHint", null, 2131752206, str));
            textView4.setTextSize(1, 15.0f);
            frameLayout.addView(textView4, b8.mf.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
        }
        Y0();
        Z0(false);
    }

    public static void I0(vo voVar, l71 l71Var) {
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2();
        b2Var.a = true;
        org.telegram.ui.wm wmVar = voVar.s1;
        l71Var.a.a = wmVar.getResourceProvider();
        l71Var.r1 = new po(voVar);
        b2Var.c = new go(1);
        b2Var.d = new co(voVar, 5);
        b2Var.b = new co(voVar, 6);
        b2Var.e = true;
        voVar.O1 = l71Var;
        wmVar.showAsSheet(l71Var, b2Var);
    }

    public static org.telegram.ui.ActionBar.j6 J0(boolean z10) {
        SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("themeconfig", 0);
        String str = "Blue";
        String string = sharedPreferences.getString("lastDayTheme", "Blue");
        if (org.telegram.ui.ActionBar.k6.Q0(string) != null && !org.telegram.ui.ActionBar.k6.Q0(string).q()) {
            str = string;
        }
        String str2 = "Dark Blue";
        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
        if (org.telegram.ui.ActionBar.k6.Q0(string2) != null && org.telegram.ui.ActionBar.k6.Q0(string2).q()) {
            str2 = string2;
        }
        return z10 ? org.telegram.ui.ActionBar.k6.Q0(str2) : org.telegram.ui.ActionBar.k6.Q0(str);
    }

    public static void W0(wz0 wz0Var) {
        if (wz0Var == null) {
            return;
        }
        float width = wz0Var.getWidth() / 2.0f;
        float width2 = wz0Var.getWidth();
        float height = wz0Var.getHeight();
        float max = Math.max(width, width2 - width);
        float max2 = Math.max(0.0f, height - 0.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(wz0Var, wz0.x, 0.0f, ((float) Math.sqrt((max2 * max2) + (max * max))) / 0.6f);
        ofFloat.setDuration(450L);
        ofFloat.setInterpolator(ks.e);
        ofFloat.addListener(new x5(wz0Var, 17));
        ofFloat.start();
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void D(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.i5));
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
        char c2;
        TLRPC.User j11;
        boolean z11;
        if (this.U1) {
            return;
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.W1;
        int i3 = 1;
        org.telegram.ui.wm wmVar = this.s1;
        if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < wmVar.getMessagesController().t5) {
            wmVar.getMessagesController().G0().b(wmVar.a(), this.W1, new fo(this, i3));
            return;
        }
        org.telegram.ui.ActionBar.p3 p3Var = this.D1.a;
        ac acVar = null;
        if (p3Var != this.N1) {
            TLRPC.ChatTheme chatTheme2 = !p3Var.a ? p3Var.d : null;
            if (p3Var.d instanceof TLRPC.TL_chatThemeUniqueGift) {
                Long l10 = (Long) org.telegram.messenger.d4.f(p3Var.g).r.get(((TLRPC.TL_chatThemeUniqueGift) p3Var.d).gift.slug);
                if (l10 != null) {
                    j10 = l10.longValue();
                    chatTheme = p3Var.d;
                    if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                        TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                        if (starGift instanceof TL_stars.TL_starGiftUnique) {
                            tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                            if (j10 == 0 && tL_starGiftUnique != null && !z10) {
                                t4.m0(getContext(), this.J0, this.a, tL_starGiftUnique, j10, new co(this, i3));
                                return;
                            }
                            org.telegram.messenger.d4.f(this.a).a(wmVar.a(), false, false);
                            org.telegram.messenger.d4.f(this.a).s(wmVar.a(), jg.b.c(chatTheme2), chatTheme2, true);
                            TLRPC.WallPaper wallPaper = P0() ? null : this.p1.g;
                            boolean z12 = this.E1;
                            boolean z13 = this.r1;
                            wz0 L0 = z12 != z13 ? L0() : null;
                            if (p3Var.a) {
                                c2 = 0;
                                this.p1.r(null, wallPaper, L0 == null, Boolean.valueOf(z13), false);
                            } else {
                                c2 = 0;
                                this.p1.r(p3Var, wallPaper, L0 == null, Boolean.valueOf(z13), false);
                            }
                            W0(L0);
                            this.F1 = true;
                            j11 = wmVar.j();
                            if (j11 != null && !j11.self) {
                                z11 = p3Var.a;
                                bv0 bv0Var = new bv0(getContext(), null, 1, -1, p3Var.e(), wmVar.getResourceProvider());
                                bv0Var.c.setVisibility(8);
                                TextView textView = bv0Var.b;
                                if (z11) {
                                    Object[] objArr = new Object[1];
                                    objArr[c2] = j11.first_name;
                                    org.telegram.messenger.k5.r("ThemeAlsoAppliedForHint", null, 2131744199, objArr, textView);
                                } else {
                                    Object[] objArr2 = new Object[1];
                                    objArr2[c2] = j11.first_name;
                                    org.telegram.messenger.k5.r("ThemeAlsoDisabledForHint", null, 2131744198, objArr2, textView);
                                }
                                textView.setTypeface(null);
                                acVar = ac.g(wmVar, bv0Var, 2750);
                            }
                        }
                    }
                    tL_starGiftUnique = null;
                    if (j10 == 0) {
                    }
                    org.telegram.messenger.d4.f(this.a).a(wmVar.a(), false, false);
                    org.telegram.messenger.d4.f(this.a).s(wmVar.a(), jg.b.c(chatTheme2), chatTheme2, true);
                    if (P0()) {
                    }
                    boolean z122 = this.E1;
                    boolean z132 = this.r1;
                    if (z122 != z132) {
                    }
                    if (p3Var.a) {
                    }
                    W0(L0);
                    this.F1 = true;
                    j11 = wmVar.j();
                    if (j11 != null) {
                        z11 = p3Var.a;
                        bv0 bv0Var2 = new bv0(getContext(), null, 1, -1, p3Var.e(), wmVar.getResourceProvider());
                        bv0Var2.c.setVisibility(8);
                        TextView textView2 = bv0Var2.b;
                        if (z11) {
                        }
                        textView2.setTypeface(null);
                        acVar = ac.g(wmVar, bv0Var2, 2750);
                    }
                }
            }
            j10 = 0;
            chatTheme = p3Var.d;
            if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
            }
            tL_starGiftUnique = null;
            if (j10 == 0) {
            }
            org.telegram.messenger.d4.f(this.a).a(wmVar.a(), false, false);
            org.telegram.messenger.d4.f(this.a).s(wmVar.a(), jg.b.c(chatTheme2), chatTheme2, true);
            if (P0()) {
            }
            boolean z1222 = this.E1;
            boolean z1322 = this.r1;
            if (z1222 != z1322) {
            }
            if (p3Var.a) {
            }
            W0(L0);
            this.F1 = true;
            j11 = wmVar.j();
            if (j11 != null) {
            }
        }
        dismiss();
        if (acVar != null) {
            acVar.j();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final wz0 L0() {
        Bitmap bitmap;
        Bitmap bitmap2;
        org.telegram.ui.wm wmVar = this.s1;
        Activity parentActivity = wmVar != null ? wmVar.getParentActivity() : null;
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
                    bitmap2 = org.telegram.messenger.g0.N3(frameLayout);
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
        wz0 wz0Var = new wz0(parentActivity);
        wz0Var.setScaleType(ImageView.ScaleType.MATRIX);
        wz0Var.setImageBitmap(bitmap2);
        wz0Var.b(frameLayout.getWidth() / 2.0f, 0.0f, true);
        wz0Var.setRadius(0.0f);
        frameLayout.addView(wz0Var, new FrameLayout.LayoutParams(-1, -1));
        return wz0Var;
    }

    public final void M0() {
        if (!P0()) {
            dismiss();
            return;
        }
        final int i3 = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.J0);
        String M0 = org.telegram.messenger.bd.M0(2131752196, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = M0;
        s1Var.U = org.telegram.messenger.bd.M0(2131752197, null);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131752199, null), new org.telegram.ui.ActionBar.p1(this) { // from class: org.telegram.ui.Components.ho
            public final /* synthetic */ vo b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.p1
            public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i10) {
                switch (i3) {
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
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752198, null), new org.telegram.ui.ActionBar.p1(this) { // from class: org.telegram.ui.Components.ho
            public final /* synthetic */ vo b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.p1
            public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i102) {
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
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, this.J0);
            ch0 ch0Var = this.w1;
            if (ch0Var != null && w02 != this.b2) {
                this.b2 = w02;
                ch0Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
            }
            org.telegram.ui.ActionBar.w1 w1Var = this.k1;
            if (w1Var != null) {
                int i3 = org.telegram.ui.ActionBar.k6.j5;
                w1Var.a(org.telegram.ui.ActionBar.k6.w0(i3, this.J0));
                w1Var.b(org.telegram.ui.ActionBar.k6.w0(i3, this.J0));
                ImageView imageView = this.j1;
                if (imageView != null) {
                    imageView.invalidate();
                }
            }
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, this.J0);
            if (w03 != this.c2) {
                this.c2 = w03;
                v0(w03);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void O0() {
        if (this.J || this.F1) {
            return;
        }
        org.telegram.ui.ActionBar.k6.b = false;
        TLRPC.WallPaper wallPaper = P0() ? null : this.p1.g;
        org.telegram.ui.ActionBar.p3 p3Var = this.D1.a;
        if (p3Var.a) {
            this.p1.r(null, wallPaper, false, Boolean.valueOf(this.E1), true);
        } else {
            this.p1.r(p3Var, wallPaper, false, Boolean.valueOf(this.E1), true);
        }
        bi biVar = this.P1;
        if (biVar != null) {
            qi qiVar = biVar.j2;
            if (qiVar != null) {
                boolean z10 = this.E1;
                ka kaVar = qiVar.w;
                ((ArrayList) kaVar.e).clear();
                WallpapersListActivity.E0((ArrayList) kaVar.e, z10);
                kaVar.f();
            }
            this.P1.P0();
        }
        to toVar = this.o1;
        if (toVar == null || toVar.d == null) {
            return;
        }
        for (int i3 = 0; i3 < toVar.d.size(); i3++) {
            ((uo) toVar.d.get(i3)).c = this.E1 ? 1 : 0;
        }
        toVar.f();
    }

    public final boolean P0() {
        if (this.D1 == null) {
            return false;
        }
        org.telegram.ui.ActionBar.p3 p3Var = this.N1;
        jg.b bVar = p3Var != null ? p3Var.c : null;
        if (bVar == null) {
            bVar = jg.b.d("❌");
        }
        org.telegram.ui.ActionBar.p3 p3Var2 = this.D1.a;
        jg.b bVar2 = p3Var2 != null ? p3Var2.c : null;
        if (bVar2 == null) {
            bVar2 = jg.b.d("❌");
        }
        return !jg.b.a(bVar, bVar2);
    }

    public final void Q0() {
        ArrayList arrayList;
        if (this.S1) {
            return;
        }
        org.telegram.messenger.d4 f10 = org.telegram.messenger.d4.f(this.a);
        if (!f10.f.c || (arrayList = f10.b) == null || arrayList.isEmpty()) {
            this.S1 = true;
            if (f10.f.c) {
                f10.q(new ro(this, f10), false);
                return;
            }
            so soVar = new so(this, f10);
            long currentTimeMillis = System.currentTimeMillis();
            k2.u1 u1Var = f10.f;
            boolean z10 = currentTimeMillis - u1Var.b > 7200000;
            if (((ArrayList) u1Var.d) == null || !u1Var.c || z10) {
                TL_account.Tl_getUniqueGiftChatThemes tl_getUniqueGiftChatThemes = new TL_account.Tl_getUniqueGiftChatThemes();
                k2.u1 u1Var2 = f10.f;
                tl_getUniqueGiftChatThemes.offset = (String) u1Var2.e;
                tl_getUniqueGiftChatThemes.hash = u1Var2.a;
                tl_getUniqueGiftChatThemes.limit = 50;
                ConnectionsManager connectionsManager = f10.getConnectionsManager();
                org.telegram.messenger.p5 p5Var = org.telegram.messenger.d4.s;
                Objects.requireNonNull(p5Var);
                connectionsManager.sendRequestTyped(tl_getUniqueGiftChatThemes, new org.telegram.messenger.v3(p5Var), new org.telegram.messenger.x3(0, f10, soVar));
            }
        }
    }

    public final void R0(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        uo uoVar = new uo((org.telegram.ui.ActionBar.p3) arrayList.get(0));
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        if (!this.M1) {
            org.telegram.ui.ActionBar.p3 p3Var = this.p1.f;
            this.N1 = p3Var;
            if (p3Var != null) {
                p3Var.k();
            }
        }
        arrayList2.add(0, uoVar);
        if (!this.M1) {
            this.D1 = uoVar;
        }
        org.telegram.ui.ActionBar.p3 p3Var2 = this.N1;
        jg.b bVar = p3Var2 != null ? p3Var2.c : null;
        boolean z10 = false;
        int i3 = 1;
        while (i3 < arrayList.size()) {
            org.telegram.ui.ActionBar.p3 p3Var3 = (org.telegram.ui.ActionBar.p3) arrayList.get(i3);
            uo uoVar2 = new uo(p3Var3);
            p3Var3.m(this.a);
            uoVar2.c = this.E1 ? 1 : 0;
            if (jg.b.a(p3Var3.c, bVar)) {
                arrayList2.add(1, uoVar2);
                z10 = true;
            } else {
                arrayList2.add(uoVar2);
            }
            i3++;
            z10 = z10;
        }
        org.telegram.ui.ActionBar.p3 p3Var4 = this.N1;
        if (p3Var4 != null && !z10) {
            uo uoVar3 = new uo(p3Var4);
            p3Var4.m(this.a);
            uoVar3.c = this.E1 ? 1 : 0;
            arrayList2.add(1, uoVar3);
        }
        to toVar = this.o1;
        toVar.d = arrayList2;
        toVar.f();
        this.x1.setVisibility(0);
        if (!this.M1) {
            T0(false);
            this.t1.animate().alpha(1.0f).setDuration(150L).start();
        }
        this.M1 = true;
        Z0(true);
    }

    public final void S0() {
        if (this.J || this.F1) {
            return;
        }
        this.G1 = false;
        this.s1.getClass();
        TLRPC.WallPaper wallPaper = P0() ? null : this.n1;
        org.telegram.ui.ActionBar.p3 p3Var = this.D1.a;
        if (p3Var.a) {
            this.p1.r(null, wallPaper, true, Boolean.valueOf(this.E1), false);
        } else {
            this.p1.r(p3Var, wallPaper, true, Boolean.valueOf(this.E1), false);
        }
    }

    public final void T0(boolean z10) {
        to toVar = this.o1;
        ArrayList arrayList = toVar.d;
        org.telegram.ui.ActionBar.p3 p3Var = this.N1;
        u4.b0 b0Var = this.u1;
        tj0 tj0Var = this.t1;
        if (p3Var != null) {
            int i3 = 0;
            while (true) {
                if (i3 == arrayList.size()) {
                    i3 = -1;
                    break;
                } else {
                    if (jg.b.a(((uo) arrayList.get(i3)).a.c, this.N1.c)) {
                        this.D1 = (uo) arrayList.get(i3);
                        break;
                    }
                    i3++;
                }
            }
            if (i3 != -1) {
                this.H1 = i3;
                toVar.E(i3);
                if (i3 > 0 && i3 < arrayList.size() / 2) {
                    i3--;
                }
                int min = Math.min(i3, toVar.d.size() - 1);
                if (z10) {
                    tj0Var.y0(min);
                } else {
                    b0Var.h1(min, 0);
                }
            }
        } else {
            this.D1 = (uo) arrayList.get(0);
            toVar.E(0);
            if (z10) {
                tj0Var.y0(0);
            } else {
                b0Var.h1(0, 0);
            }
        }
        S0();
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final ArrayList U() {
        io ioVar = new io(this);
        ArrayList arrayList = new ArrayList();
        if (this.s1.v7) {
            org.telegram.ui.ActionBar.d2 d2Var = this.O1;
            if (d2Var instanceof l71) {
                arrayList.addAll(((l71) d2Var).X0());
                return arrayList;
            }
        }
        bi biVar = this.P1;
        if (biVar != null) {
            arrayList.addAll(biVar.U());
        }
        int i3 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 32, (Class[]) null, (Paint) null, new Drawable[]{this.s0}, ioVar, org.telegram.ui.ActionBar.k6.h5));
        int i10 = org.telegram.ui.ActionBar.k6.Ci;
        View view = this.z1;
        arrayList.add(new org.telegram.ui.ActionBar.t6(view, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(view, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ei));
        int size = arrayList.size();
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((org.telegram.ui.ActionBar.t6) obj).n = this.p1;
        }
        return arrayList;
    }

    public final void U0(boolean z10, boolean z11) {
        if (this.E1 == z10) {
            return;
        }
        this.E1 = z10;
        org.telegram.ui.xc xcVar = this.x1;
        ch0 ch0Var = this.w1;
        if (z11) {
            ch0Var.P(z10 ? ch0Var.e[0] : 0);
            if (xcVar != null) {
                xcVar.d();
                return;
            }
            return;
        }
        int i3 = z10 ? ch0Var.e[0] - 1 : 0;
        ch0Var.N(i3, false, true);
        ch0Var.P(i3);
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
    public final void V0(boolean z10) {
        Bitmap bitmap;
        if (this.J || this.Z1) {
            return;
        }
        ValueAnimator valueAnimator = this.K1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        org.telegram.ui.wm wmVar = this.s1;
        FrameLayout frameLayout = (FrameLayout) wmVar.getParentActivity().getWindow().getDecorView();
        FrameLayout frameLayout2 = (FrameLayout) getWindow().getDecorView();
        Window window = wmVar.getParentActivity().getWindow();
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
                org.telegram.ui.xc xcVar = this.x1;
                if (bitmap == null) {
                    wz0.a(bitmap, null, xcVar);
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
                org.telegram.ui.Cells.g1 g1Var = wz0.x;
                float max = Math.max(measuredWidth, width - measuredWidth);
                float max2 = Math.max(measuredHeight, height - measuredHeight);
                float sqrt = ((float) Math.sqrt((max2 * max2) + (max * max))) / 0.6f;
                wz0 wz0Var = new wz0(getContext());
                wz0Var.setScaleType(ImageView.ScaleType.MATRIX);
                wz0Var.setImageBitmap(bitmap);
                wz0Var.b(measuredWidth, measuredHeight, z10);
                ColorFilter colorFilter = this.w1.getColorFilter();
                wz0Var.n = xcVar;
                wz0Var.r = colorFilter;
                wz0Var.setRadius(!z10 ? 0.0f : sqrt);
                this.I1 = wz0Var;
                wz0Var.setOnTouchListener(new fi.a(16));
                this.J1 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.K1 = ofFloat;
                ofFloat.addUpdateListener(new jo(this, wz0Var, sqrt, z10));
                this.K1.addListener(new x5(this, 16));
                this.K1.setDuration(400L);
                this.K1.setInterpolator(ks.e);
                this.K1.start();
                frameLayout2.addView(this.I1, new ViewGroup.LayoutParams(-1, -1));
                org.telegram.messenger.g0.h3(new ci.e1(22, this, z10));
            }
            if (B0 != null) {
                B0.recycle();
            }
        }
        bitmap = null;
        org.telegram.ui.xc xcVar2 = this.x1;
        if (bitmap == null) {
        }
        xcVar2.getLocationInWindow(new int[2]);
        float measuredWidth2 = (xcVar2.getMeasuredWidth() / 2.0f) + r3[0];
        float measuredHeight2 = (xcVar2.getMeasuredHeight() / 2.0f) + r3[1];
        float width2 = bitmap.getWidth();
        float height2 = bitmap.getHeight();
        org.telegram.ui.Cells.g1 g1Var2 = wz0.x;
        float max3 = Math.max(measuredWidth2, width2 - measuredWidth2);
        float max22 = Math.max(measuredHeight2, height2 - measuredHeight2);
        float sqrt2 = ((float) Math.sqrt((max22 * max22) + (max3 * max3))) / 0.6f;
        wz0 wz0Var2 = new wz0(getContext());
        wz0Var2.setScaleType(ImageView.ScaleType.MATRIX);
        wz0Var2.setImageBitmap(bitmap);
        wz0Var2.b(measuredWidth2, measuredHeight2, z10);
        ColorFilter colorFilter2 = this.w1.getColorFilter();
        wz0Var2.n = xcVar2;
        wz0Var2.r = colorFilter2;
        wz0Var2.setRadius(!z10 ? 0.0f : sqrt2);
        this.I1 = wz0Var2;
        wz0Var2.setOnTouchListener(new fi.a(16));
        this.J1 = 0.0f;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.K1 = ofFloat2;
        ofFloat2.addUpdateListener(new jo(this, wz0Var2, sqrt2, z10));
        this.K1.addListener(new x5(this, 16));
        this.K1.setDuration(400L);
        this.K1.setInterpolator(ks.e);
        this.K1.start();
        frameLayout2.addView(this.I1, new ViewGroup.LayoutParams(-1, -1));
        org.telegram.messenger.g0.h3(new ci.e1(22, this, z10));
    }

    public final void X0(org.telegram.ui.ActionBar.j6 j6Var) {
        if (j6Var == null || j6Var == org.telegram.ui.ActionBar.k6.I) {
            return;
        }
        this.Z1 = true;
        try {
            org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.t4, j6Var, Boolean.FALSE, null, -1);
        } finally {
            this.Z1 = false;
        }
    }

    public final void Y0() {
        TextView textView = this.m1;
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.p5, this.J0);
            int L = org.telegram.messenger.g0.L(6.0f);
            int i3 = org.telegram.ui.ActionBar.k6.Ci;
            int o10 = i0.a.o(org.telegram.ui.ActionBar.k6.w0(i3, this.J0), 76);
            org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.k6.k0(L, L, L, L, 0, o10, o10);
            org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i3, 76);
            org.telegram.ui.ActionBar.e6 e6Var = this.J0;
            textView.setBackground(k02);
            org.telegram.ui.ActionBar.r6.k(textView, k02, null, h, e6Var);
        }
        TextView textView2 = this.l1;
        if (textView2 != null) {
            int i10 = org.telegram.ui.ActionBar.k6.p7;
            org.telegram.ui.ActionBar.r6.V(textView2, i10, this.J0);
            int L2 = org.telegram.messenger.g0.L(6.0f);
            int o11 = i0.a.o(org.telegram.ui.ActionBar.k6.w0(i10, this.J0), 76);
            org.telegram.ui.Cells.y k03 = org.telegram.ui.ActionBar.k6.k0(L2, L2, L2, L2, 0, o11, o11);
            org.telegram.ui.ActionBar.n6 h7 = org.telegram.ui.ActionBar.r6.h(i10, 76);
            org.telegram.ui.ActionBar.e6 e6Var2 = this.J0;
            textView2.setBackground(k03);
            org.telegram.ui.ActionBar.r6.k(textView2, k03, null, h7, e6Var2);
        }
        int i11 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(i0.a.o(org.telegram.ui.ActionBar.k6.w0(i11, this.J0), 30), 1, -1);
        org.telegram.ui.ActionBar.n6 h10 = org.telegram.ui.ActionBar.r6.h(i11, 30);
        org.telegram.ui.ActionBar.e6 e6Var3 = this.J0;
        ImageView imageView = this.j1;
        org.telegram.ui.ActionBar.r6.R(imageView, h02, null, h10, e6Var3);
        int w02 = org.telegram.ui.ActionBar.k6.w0(i11, this.J0);
        org.telegram.ui.ActionBar.w1 w1Var = this.k1;
        w1Var.a(w02);
        w1Var.b(org.telegram.ui.ActionBar.k6.w0(i11, this.J0));
        imageView.invalidate();
        int i12 = org.telegram.ui.ActionBar.k6.Ci;
        org.telegram.ui.ActionBar.r6.R(this.x1, org.telegram.ui.ActionBar.k6.h0(i0.a.o(org.telegram.ui.ActionBar.k6.w0(i12, this.J0), 30), 1, -1), null, org.telegram.ui.ActionBar.r6.h(i12, 30), this.J0);
        int i13 = org.telegram.ui.ActionBar.k6.m5;
        org.telegram.ui.ActionBar.e6 e6Var4 = this.J0;
        TextView textView3 = this.C1;
        org.telegram.ui.ActionBar.r6.V(textView3, i13, e6Var4);
        int L3 = org.telegram.messenger.g0.L(6.0f);
        int o12 = i0.a.o(org.telegram.ui.ActionBar.k6.w0(i12, this.J0), 76);
        org.telegram.ui.ActionBar.r6.R(textView3, org.telegram.ui.ActionBar.k6.k0(L3, L3, L3, L3, 0, o12, o12), null, org.telegram.ui.ActionBar.r6.h(i12, 76), this.J0);
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
        org.telegram.ui.wm wmVar = this.s1;
        TLRPC.Chat chat = wmVar.e;
        int i3 = 0;
        if (chat != null && !this.U1 && !this.V1 && this.W1 == null) {
            this.U1 = true;
            wmVar.getMessagesController().G0().a(wmVar.a(), new fo(this, i3));
        }
        boolean z13 = this.M1;
        iz izVar = this.v1;
        TextView textView = this.m1;
        h6 h6Var = this.B1;
        TextView textView2 = this.l1;
        TextView textView3 = this.C1;
        org.telegram.ui.ActionBar.w1 w1Var = this.k1;
        View view = this.z1;
        h6 h6Var2 = this.A1;
        if (!z13) {
            w1Var.c(z10, 1.0f);
            view.setEnabled(false);
            org.telegram.messenger.g0.Z3(textView3, false, 0.9f, false, z10);
            org.telegram.messenger.g0.Z3(textView2, false, 0.9f, false, z10);
            org.telegram.messenger.g0.Z3(view, false, 1.0f, false, z10);
            org.telegram.messenger.g0.Z3(h6Var2, false, 0.9f, false, z10);
            org.telegram.messenger.g0.Z3(h6Var, false, 0.9f, false, z10);
            org.telegram.messenger.g0.Z3(textView, false, 0.9f, false, z10);
            org.telegram.messenger.g0.Z3(izVar, true, 1.0f, true, z10);
            return;
        }
        org.telegram.messenger.g0.Z3(izVar, false, 1.0f, true, z10);
        if (!P0()) {
            w1Var.c(z10, 1.0f);
            view.setEnabled(false);
            org.telegram.messenger.g0.Z3(textView3, true, 0.9f, false, z10);
            org.telegram.messenger.g0.Z3(textView2, true, 0.9f, false, z10);
            org.telegram.messenger.g0.Z3(view, false, 1.0f, false, z10);
            org.telegram.messenger.g0.Z3(h6Var2, false, 0.9f, false, z10);
            org.telegram.messenger.g0.Z3(h6Var, false, 0.9f, false, z10);
            org.telegram.messenger.g0.Z3(textView, false, 0.9f, false, z10);
            return;
        }
        w1Var.c(z10, 0.0f);
        view.setEnabled(true);
        uo uoVar = this.D1;
        if (uoVar == null || (p3Var = uoVar.a) == null || !p3Var.a) {
            h6Var2.setText(org.telegram.messenger.bd.M0(2131752247, null));
            if (chat != null && (tL_premium_boostsStatus = this.W1) != null && tL_premium_boostsStatus.level < wmVar.getMessagesController().t5) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
                if (this.T1 == null) {
                    wp wpVar = new wp(R.drawable.mini_switch_lock, 0);
                    this.T1 = wpVar;
                    wpVar.n = 1;
                }
                spannableStringBuilder.setSpan(this.T1, 0, 1, 33);
                r17 = 1;
                spannableStringBuilder.append((CharSequence) " ").append((CharSequence) org.telegram.messenger.bd.G(wmVar.getMessagesController().t5, "ReactionLevelRequiredBtn", new Object[0]));
                h6Var.setText(spannableStringBuilder);
                z11 = true;
                z12 = (z10 || h6Var2.getAlpha() <= 0.8f) ? false : r17;
                valueAnimator = this.Y1;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.Y1 = null;
                }
                if (z12) {
                    this.X1 = z11 ? 1.0f : 0.0f;
                    h6Var2.setTranslationY((-org.telegram.messenger.g0.L(7.0f)) * this.X1);
                } else {
                    float f10 = this.X1;
                    float f11 = z11 ? 1.0f : 0.0f;
                    float[] fArr = new float[2];
                    fArr[0] = f10;
                    fArr[r17] = f11;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                    this.Y1 = ofFloat;
                    ofFloat.addUpdateListener(new c6(this, 14));
                    this.Y1.addListener(new s9(5, this, z11));
                    this.Y1.start();
                }
                org.telegram.messenger.g0.Z3(textView3, false, 0.9f, false, z10);
                org.telegram.messenger.g0.Z3(textView2, false, 0.9f, false, z10);
                boolean z14 = r17;
                org.telegram.messenger.g0.Z3(view, z14, 1.0f, false, z10);
                org.telegram.messenger.g0.Z3(h6Var2, z14, 0.9f, false, z10);
                org.telegram.messenger.g0.Y3(h6Var, z11, 0.9f, false, 0.7f, z10, null);
                org.telegram.messenger.g0.Z3(textView, z14, 0.9f, false, z10);
            }
        } else {
            h6Var2.setText(org.telegram.messenger.bd.M0(2131752214, null));
        }
        r17 = 1;
        z11 = false;
        if (z10) {
        }
        valueAnimator = this.Y1;
        if (valueAnimator != null) {
        }
        if (z12) {
        }
        org.telegram.messenger.g0.Z3(textView3, false, 0.9f, false, z10);
        org.telegram.messenger.g0.Z3(textView2, false, 0.9f, false, z10);
        boolean z142 = r17;
        org.telegram.messenger.g0.Z3(view, z142, 1.0f, false, z10);
        org.telegram.messenger.g0.Z3(h6Var2, z142, 0.9f, false, z10);
        org.telegram.messenger.g0.Y3(h6Var, z11, 0.9f, false, 0.7f, z10, null);
        org.telegram.messenger.g0.Z3(textView, z142, 0.9f, false, z10);
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.i4) {
            org.telegram.messenger.hs.f(this.a).d(new co(this, 0));
        }
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.z1
    public final void dismiss() {
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.i4);
        super.dismiss();
        this.s1.getClass();
        boolean z10 = this.F1;
        boolean z11 = this.r1;
        wz0 L0 = (z10 || this.E1 == z11) ? null : L0();
        if (!this.F1) {
            org.telegram.ui.um umVar = this.p1;
            TLRPC.WallPaper wallPaper = umVar.g;
            if (wallPaper == null) {
                wallPaper = this.n1;
            }
            umVar.r(this.q1, wallPaper, L0 == null, Boolean.valueOf(z11), false);
        }
        if (this.E1 != z11) {
            org.telegram.ui.ActionBar.j6 J0 = org.telegram.ui.ActionBar.k6.I.q() == z11 ? org.telegram.ui.ActionBar.k6.I : J0(z11);
            if (this.a2) {
                X0(J0);
            } else {
                org.telegram.ui.ActionBar.k6.u(J0, false, z11);
            }
        }
        this.a2 = false;
        W0(L0);
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final boolean f0(MotionEvent motionEvent) {
        if (motionEvent == null || !P0()) {
            return false;
        }
        int x10 = (int) motionEvent.getX();
        if (((int) motionEvent.getY()) >= this.b.getTop() && x10 >= this.b.getLeft() && x10 <= this.b.getRight()) {
            return false;
        }
        this.s1.getFragmentView().dispatchTouchEvent(motionEvent);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void g0(float f10) {
        u20 u20Var = this.L1;
        if (u20Var != null) {
            u20Var.a();
        }
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog
    public final void onBackPressed() {
        M0();
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        ArrayList arrayList;
        super.onCreate(bundle);
        org.telegram.messenger.d4 f10 = org.telegram.messenger.d4.f(this.a);
        f10.m(true);
        f10.m(false);
        f10.l(true);
        f10.l(false);
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.i4);
        this.F1 = false;
        int i3 = 7;
        if (!f10.f.c || (arrayList = f10.b) == null || arrayList.isEmpty()) {
            Q0();
        } else {
            R0(f10.e(7));
        }
        if (this.s1.j() == null || org.telegram.messenger.az.e1 <= 0 || this.s1.j().self) {
            return;
        }
        org.telegram.messenger.az.e1--;
        org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit().putInt("dayNightThemeSwitchHintCount", org.telegram.messenger.az.e1).apply();
        u20 u20Var = new u20(9, getContext(), this.s1.getResourceProvider(), false);
        this.L1 = u20Var;
        u20Var.setVisibility(4);
        this.L1.setShowingDuration(5000L);
        this.L1.setBottomOffset(-org.telegram.messenger.g0.L(8.0f));
        if (this.E1) {
            this.L1.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("ChatThemeDaySwitchTooltip", null, 2131752203, new Object[0])));
        } else {
            this.L1.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("ChatThemeNightSwitchTooltip", null, 2131752200, new Object[0])));
        }
        org.telegram.messenger.g0.i3(new co(this, i3), 1500L);
        this.c.addView(this.L1, b8.mf.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void s0() {
        int w02;
        super.s0();
        N0();
        try {
            if (Build.VERSION.SDK_INT < 30 || this.G0 != -1 || this.H0 == (w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i5, this.J0))) {
                return;
            }
            this.H0 = w02;
            org.telegram.messenger.g0.u3(this, w02, false, null);
            org.telegram.messenger.g0.n3(this, ((double) org.telegram.messenger.g0.B(w02)) > 0.721d);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
