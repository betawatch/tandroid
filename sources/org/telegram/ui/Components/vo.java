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
import org.telegram.ui.x71;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class vo extends org.telegram.ui.ActionBar.w2 implements org.telegram.messenger.ls {
    public static final /* synthetic */ int f2 = 0;
    public final po A1;
    public final View B1;
    public final i6 C1;
    public final i6 D1;
    public final TextView E1;
    public uo F1;
    public boolean G1;
    public boolean H1;
    public boolean I1;
    public int J1;
    public xz0 K1;
    public float L1;
    public ValueAnimator M1;
    public y20 N1;
    public boolean O1;
    public org.telegram.ui.ActionBar.s3 P1;
    public org.telegram.ui.ActionBar.f2 Q1;
    public ci R1;
    public bi.x5 S1;
    public i6 T1;
    public boolean U1;
    public wp V1;
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
    public final org.telegram.ui.ActionBar.y1 m1;
    public final TextView n1;
    public final TextView o1;
    public TLRPC.WallPaper p1;
    public final to q1;
    public final org.telegram.ui.an r1;
    public final org.telegram.ui.ActionBar.s3 s1;
    public final boolean t1;
    public final org.telegram.ui.cn u1;
    public final pj0 v1;
    public final v4.b0 w1;
    public final lz x1;
    public final zg0 y1;
    public final org.telegram.ui.yc z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vo(org.telegram.ui.cn cnVar, org.telegram.ui.an anVar) {
        super(1, (Context) cnVar.getParentActivity(), (org.telegram.ui.ActionBar.h6) anVar, true);
        String str;
        int i7 = 1;
        this.J1 = -1;
        this.W1 = false;
        this.X1 = false;
        this.Z1 = 0.0f;
        this.u1 = cnVar;
        this.r1 = anVar;
        this.s1 = anVar.f;
        this.p1 = anVar.g;
        this.t1 = org.telegram.ui.ActionBar.m6.I.q();
        to toVar = new to(this.a, cnVar.a(), anVar, 0);
        this.q1 = toVar;
        this.o0 = false;
        this.b0 = false;
        this.v0 = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.F0 = -1;
            int i10 = org.telegram.ui.ActionBar.m6.i5;
            this.G0 = org.telegram.ui.ActionBar.m6.w0(i10, this.I0);
            org.telegram.messenger.g0.u3(this, org.telegram.ui.ActionBar.m6.w0(i10, this.I0), false, null);
            org.telegram.messenger.g0.n3(this, ((double) org.telegram.messenger.g0.B(this.G0)) > 0.721d);
        } else {
            P(org.telegram.ui.ActionBar.m6.i5);
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.N = frameLayout;
        TextView textView = new TextView(getContext());
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setText(org.telegram.messenger.id.M0(2131745651, null));
        org.telegram.messenger.k5.n(textView, org.telegram.ui.ActionBar.m6.j5, this.I0, 1, 20.0f);
        textView.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f));
        ImageView imageView = new ImageView(getContext());
        this.l1 = imageView;
        int L = org.telegram.messenger.g0.L(10.0f);
        imageView.setPadding(L, L, L, L);
        org.telegram.ui.ActionBar.y1 y1Var = new org.telegram.ui.ActionBar.y1(false);
        this.m1 = y1Var;
        imageView.setImageDrawable(y1Var);
        imageView.setOnClickListener(new eo(this, i7));
        frameLayout.addView(imageView, c8.ha.d(44, 44.0f, 8388659, 4.0f, -2.0f, 62.0f, 12.0f));
        frameLayout.addView(textView, c8.ha.d(-1, -2.0f, 8388659, 44.0f, 0.0f, 62.0f, 0.0f));
        int i11 = org.telegram.ui.ActionBar.m6.Ci;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i11, this.I0);
        int L2 = org.telegram.messenger.g0.L(28.0f);
        zg0 zg0Var = new zg0(R.raw.sun_outline, L2, L2, false, null);
        this.y1 = zg0Var;
        this.G1 = !org.telegram.ui.ActionBar.m6.I.q();
        U0(org.telegram.ui.ActionBar.m6.I.q(), false);
        zg0Var.J(true);
        zg0Var.h = true;
        this.d2 = w02;
        zg0Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.yc ycVar = new org.telegram.ui.yc(1, getContext(), this);
        this.z1 = ycVar;
        ycVar.setAnimation(zg0Var);
        ycVar.setScaleType(ImageView.ScaleType.CENTER);
        ycVar.setOnClickListener(new eo(this, 2));
        frameLayout.addView(ycVar, c8.ha.d(44, 44.0f, 8388661, 0.0f, -2.0f, 7.0f, 0.0f));
        this.A1 = new po(getContext());
        pj0 pj0Var = new pj0(getContext(), null);
        this.v1 = pj0Var;
        pj0Var.setAdapter(toVar);
        pj0Var.setDrawSelection(false);
        pj0Var.setClipChildren(false);
        pj0Var.setClipToPadding(false);
        pj0Var.setHasFixedSize(true);
        pj0Var.setItemAnimator(null);
        pj0Var.setNestedScrollingEnabled(false);
        getContext();
        v4.b0 b0Var = new v4.b0(0, false);
        this.w1 = b0Var;
        pj0Var.setLayoutManager(b0Var);
        pj0Var.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        int i12 = 3;
        pj0Var.setOnItemClickListener(new j(this, i12));
        pj0Var.setOnScrollListener(new ti(this, 5));
        lz lzVar = new lz(getContext(), this.I0);
        this.x1 = lzVar;
        lzVar.setViewType(14);
        lzVar.setVisibility(0);
        frameLayout.addView(lzVar, c8.ha.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        frameLayout.addView(pj0Var, c8.ha.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        View view = new View(getContext());
        this.B1 = view;
        int L3 = org.telegram.messenger.g0.L(6.0f);
        int w03 = org.telegram.ui.ActionBar.m6.w0(i11, this.I0);
        int i13 = org.telegram.ui.ActionBar.m6.Ei;
        int w04 = org.telegram.ui.ActionBar.m6.w0(i13, this.I0);
        Drawable k02 = org.telegram.ui.ActionBar.m6.k0(L3, L3, L3, L3, w03, w04, w04);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i11);
        org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i13);
        org.telegram.ui.ActionBar.h6 h6Var = this.I0;
        view.setBackground(k02);
        org.telegram.ui.ActionBar.t6.j(view, k02, M, M2, h6Var);
        view.setOnClickListener(new eo(this, i12));
        frameLayout.addView(view, c8.ha.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(getContext());
        this.E1 = textView2;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(17);
        textView2.setLines(1);
        textView2.setSingleLine(true);
        if (this.p1 == null) {
            textView2.setText(org.telegram.messenger.id.M0(2131752138, null));
        } else {
            textView2.setText(org.telegram.messenger.id.M0(2131752140, null));
        }
        textView2.setTextSize(1, 15.0f);
        textView2.setOnClickListener(new androidx.mediarouter.app.w(this, 9));
        frameLayout.addView(textView2, c8.ha.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        i6 i6Var = new i6(getContext(), true, true, true);
        this.C1 = i6Var;
        i6Var.getDrawable().q(true);
        i6Var.n = false;
        i6Var.setGravity(17);
        int i14 = org.telegram.ui.ActionBar.m6.Gi;
        org.telegram.ui.ActionBar.t6.Y(i6Var, i14, this.I0);
        i6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        i6Var.setTypeface(org.telegram.messenger.g0.o());
        frameLayout.addView(i6Var, c8.ha.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        i6 i6Var2 = new i6(getContext(), true, true, true);
        this.D1 = i6Var2;
        i6Var2.getDrawable().q(true);
        i6Var2.n = false;
        i6Var2.setGravity(17);
        org.telegram.ui.ActionBar.t6.Y(i6Var2, i14, this.I0);
        i6Var2.setTextSize(org.telegram.messenger.g0.L(12.0f));
        i6Var2.setAlpha(0.0f);
        i6Var2.setTranslationY(org.telegram.messenger.g0.L(11.0f));
        frameLayout.addView(i6Var2, c8.ha.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        if (this.p1 != null) {
            TextView textView3 = new TextView(getContext());
            this.n1 = textView3;
            textView3.setEllipsize(truncateAt);
            textView3.setGravity(17);
            textView3.setLines(1);
            textView3.setSingleLine(true);
            textView3.setText(org.telegram.messenger.id.M0(2131746085, null));
            textView3.setTextSize(1, 15.0f);
            textView3.setOnClickListener(new kk(i12, this, cnVar));
            frameLayout.addView(textView3, c8.ha.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
            TextView textView4 = new TextView(getContext());
            this.o1 = textView4;
            textView4.setEllipsize(truncateAt);
            textView4.setGravity(17);
            textView4.setLines(1);
            textView4.setSingleLine(true);
            if (cnVar.j() != null) {
                str = org.telegram.messenger.t10.j(cnVar.j(), true);
            } else {
                TLRPC.Chat chat = cnVar.e;
                str = chat != null ? chat.title : "";
            }
            textView4.setText(org.telegram.messenger.id.a0("ChatThemeApplyHint", null, 2131752206, str));
            textView4.setTextSize(1, 15.0f);
            frameLayout.addView(textView4, c8.ha.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
        }
        Y0();
        Z0(false);
    }

    public static void I0(vo voVar, x71 x71Var) {
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2();
        d2Var.a = true;
        org.telegram.ui.cn cnVar = voVar.u1;
        x71Var.a.a = cnVar.getResourceProvider();
        x71Var.q1 = new oo(voVar);
        d2Var.c = new org.telegram.messenger.rc(29);
        d2Var.d = new co(voVar, 5);
        d2Var.b = new co(voVar, 6);
        d2Var.e = true;
        voVar.Q1 = x71Var;
        cnVar.showAsSheet(x71Var, d2Var);
    }

    public static org.telegram.ui.ActionBar.l6 J0(boolean z9) {
        SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("themeconfig", 0);
        String str = "Blue";
        String string = sharedPreferences.getString("lastDayTheme", "Blue");
        if (org.telegram.ui.ActionBar.m6.Q0(string) != null && !org.telegram.ui.ActionBar.m6.Q0(string).q()) {
            str = string;
        }
        String str2 = "Dark Blue";
        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
        if (org.telegram.ui.ActionBar.m6.Q0(string2) != null && org.telegram.ui.ActionBar.m6.Q0(string2).q()) {
            str2 = string2;
        }
        return z9 ? org.telegram.ui.ActionBar.m6.Q0(str2) : org.telegram.ui.ActionBar.m6.Q0(str);
    }

    public static void W0(xz0 xz0Var) {
        if (xz0Var == null) {
            return;
        }
        float width = xz0Var.getWidth() / 2.0f;
        float width2 = xz0Var.getWidth();
        float height = xz0Var.getHeight();
        float max = Math.max(width, width2 - width);
        float max2 = Math.max(0.0f, height - 0.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(xz0Var, xz0.x, 0.0f, ((float) Math.sqrt((max2 * max2) + (max * max))) / 0.6f);
        ofFloat.setDuration(450L);
        ofFloat.setInterpolator(js.e);
        ofFloat.addListener(new y5(xz0Var, 17));
        ofFloat.start();
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void D(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.i5));
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
    public final void K0(boolean z9) {
        long j3;
        TLRPC.ChatTheme chatTheme;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        char c10;
        TLRPC.User j10;
        boolean z10;
        if (this.W1) {
            return;
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.Y1;
        int i7 = 1;
        org.telegram.ui.cn cnVar = this.u1;
        if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < cnVar.getMessagesController().t5) {
            cnVar.getMessagesController().G0().b(cnVar.a(), this.Y1, new fo(this, i7));
            return;
        }
        org.telegram.ui.ActionBar.s3 s3Var = this.F1.a;
        bc bcVar = null;
        if (s3Var != this.P1) {
            TLRPC.ChatTheme chatTheme2 = !s3Var.a ? s3Var.d : null;
            if (s3Var.d instanceof TLRPC.TL_chatThemeUniqueGift) {
                Long l10 = (Long) org.telegram.messenger.d4.f(s3Var.g).r.get(((TLRPC.TL_chatThemeUniqueGift) s3Var.d).gift.slug);
                if (l10 != null) {
                    j3 = l10.longValue();
                    chatTheme = s3Var.d;
                    if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                        TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                        if (starGift instanceof TL_stars.TL_starGiftUnique) {
                            tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                            if (j3 == 0 && tL_starGiftUnique != null && !z9) {
                                u4.k0(getContext(), this.I0, this.a, tL_starGiftUnique, j3, new co(this, i7));
                                return;
                            }
                            org.telegram.messenger.d4.f(this.a).a(cnVar.a(), false, false);
                            org.telegram.messenger.d4.f(this.a).s(cnVar.a(), ig.b.c(chatTheme2), chatTheme2, true);
                            TLRPC.WallPaper wallPaper = P0() ? null : this.r1.g;
                            boolean z11 = this.G1;
                            boolean z12 = this.t1;
                            xz0 L0 = z11 != z12 ? L0() : null;
                            if (s3Var.a) {
                                c10 = 0;
                                this.r1.r(null, wallPaper, L0 == null, Boolean.valueOf(z12), false);
                            } else {
                                c10 = 0;
                                this.r1.r(s3Var, wallPaper, L0 == null, Boolean.valueOf(z12), false);
                            }
                            W0(L0);
                            this.H1 = true;
                            j10 = cnVar.j();
                            if (j10 != null && !j10.self) {
                                z10 = s3Var.a;
                                dv0 dv0Var = new dv0(getContext(), null, 1, -1, s3Var.e(), cnVar.getResourceProvider());
                                dv0Var.c.setVisibility(8);
                                TextView textView = dv0Var.b;
                                if (z10) {
                                    Object[] objArr = new Object[1];
                                    objArr[c10] = j10.first_name;
                                    org.telegram.messenger.k5.r("ThemeAlsoAppliedForHint", null, 2131744189, objArr, textView);
                                } else {
                                    Object[] objArr2 = new Object[1];
                                    objArr2[c10] = j10.first_name;
                                    org.telegram.messenger.k5.r("ThemeAlsoDisabledForHint", null, 2131744188, objArr2, textView);
                                }
                                textView.setTypeface(null);
                                bcVar = bc.g(cnVar, dv0Var, 2750);
                            }
                        }
                    }
                    tL_starGiftUnique = null;
                    if (j3 == 0) {
                    }
                    org.telegram.messenger.d4.f(this.a).a(cnVar.a(), false, false);
                    org.telegram.messenger.d4.f(this.a).s(cnVar.a(), ig.b.c(chatTheme2), chatTheme2, true);
                    if (P0()) {
                    }
                    boolean z112 = this.G1;
                    boolean z122 = this.t1;
                    if (z112 != z122) {
                    }
                    if (s3Var.a) {
                    }
                    W0(L0);
                    this.H1 = true;
                    j10 = cnVar.j();
                    if (j10 != null) {
                        z10 = s3Var.a;
                        dv0 dv0Var2 = new dv0(getContext(), null, 1, -1, s3Var.e(), cnVar.getResourceProvider());
                        dv0Var2.c.setVisibility(8);
                        TextView textView2 = dv0Var2.b;
                        if (z10) {
                        }
                        textView2.setTypeface(null);
                        bcVar = bc.g(cnVar, dv0Var2, 2750);
                    }
                }
            }
            j3 = 0;
            chatTheme = s3Var.d;
            if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
            }
            tL_starGiftUnique = null;
            if (j3 == 0) {
            }
            org.telegram.messenger.d4.f(this.a).a(cnVar.a(), false, false);
            org.telegram.messenger.d4.f(this.a).s(cnVar.a(), ig.b.c(chatTheme2), chatTheme2, true);
            if (P0()) {
            }
            boolean z1122 = this.G1;
            boolean z1222 = this.t1;
            if (z1122 != z1222) {
            }
            if (s3Var.a) {
            }
            W0(L0);
            this.H1 = true;
            j10 = cnVar.j();
            if (j10 != null) {
            }
        }
        dismiss();
        if (bcVar != null) {
            bcVar.j();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final xz0 L0() {
        Bitmap bitmap;
        Bitmap bitmap2;
        org.telegram.ui.cn cnVar = this.u1;
        Activity parentActivity = cnVar != null ? cnVar.getParentActivity() : null;
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
        xz0 xz0Var = new xz0(parentActivity);
        xz0Var.setScaleType(ImageView.ScaleType.MATRIX);
        xz0Var.setImageBitmap(bitmap2);
        xz0Var.b(frameLayout.getWidth() / 2.0f, 0.0f, true);
        xz0Var.setRadius(0.0f);
        frameLayout.addView(xz0Var, new FrameLayout.LayoutParams(-1, -1));
        return xz0Var;
    }

    public final void M0() {
        if (!P0()) {
            dismiss();
            return;
        }
        final int i7 = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.I0);
        String M0 = org.telegram.messenger.id.M0(2131752196, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.id.M0(2131752197, null);
        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131752199, null), new org.telegram.ui.ActionBar.r1(this) { // from class: org.telegram.ui.Components.go
            public final /* synthetic */ vo b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.r1
            public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i10) {
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
        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752198, null), new org.telegram.ui.ActionBar.r1(this) { // from class: org.telegram.ui.Components.go
            public final /* synthetic */ vo b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.r1
            public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i102) {
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
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ci, this.I0);
            zg0 zg0Var = this.y1;
            if (zg0Var != null && w02 != this.d2) {
                this.d2 = w02;
                zg0Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
            }
            org.telegram.ui.ActionBar.y1 y1Var = this.m1;
            if (y1Var != null) {
                int i7 = org.telegram.ui.ActionBar.m6.j5;
                y1Var.a(org.telegram.ui.ActionBar.m6.w0(i7, this.I0));
                y1Var.b(org.telegram.ui.ActionBar.m6.w0(i7, this.I0));
                ImageView imageView = this.l1;
                if (imageView != null) {
                    imageView.invalidate();
                }
            }
            int w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h5, this.I0);
            if (w03 != this.e2) {
                this.e2 = w03;
                v0(w03);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void O0() {
        if (this.I || this.H1) {
            return;
        }
        org.telegram.ui.ActionBar.m6.b = false;
        TLRPC.WallPaper wallPaper = P0() ? null : this.r1.g;
        org.telegram.ui.ActionBar.s3 s3Var = this.F1.a;
        if (s3Var.a) {
            this.r1.r(null, wallPaper, false, Boolean.valueOf(this.G1), true);
        } else {
            this.r1.r(s3Var, wallPaper, false, Boolean.valueOf(this.G1), true);
        }
        ci ciVar = this.R1;
        if (ciVar != null) {
            pi piVar = ciVar.l2;
            if (piVar != null) {
                boolean z9 = this.G1;
                ka kaVar = piVar.w;
                ((ArrayList) kaVar.e).clear();
                WallpapersListActivity.E0((ArrayList) kaVar.e, z9);
                kaVar.f();
            }
            this.R1.P0();
        }
        to toVar = this.q1;
        if (toVar == null || toVar.d == null) {
            return;
        }
        for (int i7 = 0; i7 < toVar.d.size(); i7++) {
            ((uo) toVar.d.get(i7)).c = this.G1 ? 1 : 0;
        }
        toVar.f();
    }

    public final boolean P0() {
        if (this.F1 == null) {
            return false;
        }
        org.telegram.ui.ActionBar.s3 s3Var = this.P1;
        ig.b bVar = s3Var != null ? s3Var.c : null;
        if (bVar == null) {
            bVar = ig.b.d("❌");
        }
        org.telegram.ui.ActionBar.s3 s3Var2 = this.F1.a;
        ig.b bVar2 = s3Var2 != null ? s3Var2.c : null;
        if (bVar2 == null) {
            bVar2 = ig.b.d("❌");
        }
        return !ig.b.a(bVar, bVar2);
    }

    public final void Q0() {
        ArrayList arrayList;
        if (this.U1) {
            return;
        }
        org.telegram.messenger.d4 f10 = org.telegram.messenger.d4.f(this.a);
        if (!f10.f.c || (arrayList = f10.b) == null || arrayList.isEmpty()) {
            this.U1 = true;
            if (f10.f.c) {
                f10.q(new qo(this, f10), false);
                return;
            }
            so soVar = new so(this, f10);
            long currentTimeMillis = System.currentTimeMillis();
            l2.u1 u1Var = f10.f;
            boolean z9 = currentTimeMillis - u1Var.b > 7200000;
            if (((ArrayList) u1Var.d) == null || !u1Var.c || z9) {
                TL_account.Tl_getUniqueGiftChatThemes tl_getUniqueGiftChatThemes = new TL_account.Tl_getUniqueGiftChatThemes();
                l2.u1 u1Var2 = f10.f;
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
        uo uoVar = new uo((org.telegram.ui.ActionBar.s3) arrayList.get(0));
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        if (!this.O1) {
            org.telegram.ui.ActionBar.s3 s3Var = this.r1.f;
            this.P1 = s3Var;
            if (s3Var != null) {
                s3Var.k();
            }
        }
        arrayList2.add(0, uoVar);
        if (!this.O1) {
            this.F1 = uoVar;
        }
        org.telegram.ui.ActionBar.s3 s3Var2 = this.P1;
        ig.b bVar = s3Var2 != null ? s3Var2.c : null;
        boolean z9 = false;
        int i7 = 1;
        while (i7 < arrayList.size()) {
            org.telegram.ui.ActionBar.s3 s3Var3 = (org.telegram.ui.ActionBar.s3) arrayList.get(i7);
            uo uoVar2 = new uo(s3Var3);
            s3Var3.m(this.a);
            uoVar2.c = this.G1 ? 1 : 0;
            if (ig.b.a(s3Var3.c, bVar)) {
                arrayList2.add(1, uoVar2);
                z9 = true;
            } else {
                arrayList2.add(uoVar2);
            }
            i7++;
            z9 = z9;
        }
        org.telegram.ui.ActionBar.s3 s3Var4 = this.P1;
        if (s3Var4 != null && !z9) {
            uo uoVar3 = new uo(s3Var4);
            s3Var4.m(this.a);
            uoVar3.c = this.G1 ? 1 : 0;
            arrayList2.add(1, uoVar3);
        }
        to toVar = this.q1;
        toVar.d = arrayList2;
        toVar.f();
        this.z1.setVisibility(0);
        if (!this.O1) {
            T0(false);
            this.v1.animate().alpha(1.0f).setDuration(150L).start();
        }
        this.O1 = true;
        Z0(true);
    }

    public final void S0() {
        if (this.I || this.H1) {
            return;
        }
        this.I1 = false;
        this.u1.getClass();
        TLRPC.WallPaper wallPaper = P0() ? null : this.p1;
        org.telegram.ui.ActionBar.s3 s3Var = this.F1.a;
        if (s3Var.a) {
            this.r1.r(null, wallPaper, true, Boolean.valueOf(this.G1), false);
        } else {
            this.r1.r(s3Var, wallPaper, true, Boolean.valueOf(this.G1), false);
        }
    }

    public final void T0(boolean z9) {
        to toVar = this.q1;
        ArrayList arrayList = toVar.d;
        org.telegram.ui.ActionBar.s3 s3Var = this.P1;
        v4.b0 b0Var = this.w1;
        pj0 pj0Var = this.v1;
        if (s3Var != null) {
            int i7 = 0;
            while (true) {
                if (i7 == arrayList.size()) {
                    i7 = -1;
                    break;
                } else {
                    if (ig.b.a(((uo) arrayList.get(i7)).a.c, this.P1.c)) {
                        this.F1 = (uo) arrayList.get(i7);
                        break;
                    }
                    i7++;
                }
            }
            if (i7 != -1) {
                this.J1 = i7;
                toVar.E(i7);
                if (i7 > 0 && i7 < arrayList.size() / 2) {
                    i7--;
                }
                int min = Math.min(i7, toVar.d.size() - 1);
                if (z9) {
                    pj0Var.y0(min);
                } else {
                    b0Var.h1(min, 0);
                }
            }
        } else {
            this.F1 = (uo) arrayList.get(0);
            toVar.E(0);
            if (z9) {
                pj0Var.y0(0);
            } else {
                b0Var.h1(0, 0);
            }
        }
        S0();
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final ArrayList U() {
        ho hoVar = new ho(this);
        ArrayList arrayList = new ArrayList();
        if (this.u1.u7) {
            org.telegram.ui.ActionBar.f2 f2Var = this.Q1;
            if (f2Var instanceof x71) {
                arrayList.addAll(((x71) f2Var).X0());
                return arrayList;
            }
        }
        ci ciVar = this.R1;
        if (ciVar != null) {
            arrayList.addAll(ciVar.U());
        }
        int i7 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 32, (Class[]) null, (Paint) null, new Drawable[]{this.r0}, hoVar, org.telegram.ui.ActionBar.m6.h5));
        int i10 = org.telegram.ui.ActionBar.m6.Ci;
        View view = this.B1;
        arrayList.add(new org.telegram.ui.ActionBar.v6(view, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.v6(view, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Ei));
        int size = arrayList.size();
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((org.telegram.ui.ActionBar.v6) obj).n = this.r1;
        }
        return arrayList;
    }

    public final void U0(boolean z9, boolean z10) {
        if (this.G1 == z9) {
            return;
        }
        this.G1 = z9;
        org.telegram.ui.yc ycVar = this.z1;
        zg0 zg0Var = this.y1;
        if (z10) {
            zg0Var.P(z9 ? zg0Var.e[0] : 0);
            if (ycVar != null) {
                ycVar.d();
                return;
            }
            return;
        }
        int i7 = z9 ? zg0Var.e[0] - 1 : 0;
        zg0Var.N(i7, false, true);
        zg0Var.P(i7);
        if (ycVar != null) {
            ycVar.invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V0(boolean z9) {
        Bitmap bitmap;
        if (this.I || this.b2) {
            return;
        }
        ValueAnimator valueAnimator = this.M1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        org.telegram.ui.cn cnVar = this.u1;
        FrameLayout frameLayout = (FrameLayout) cnVar.getParentActivity().getWindow().getDecorView();
        FrameLayout frameLayout2 = (FrameLayout) getWindow().getDecorView();
        Window window = cnVar.getParentActivity().getWindow();
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
                org.telegram.ui.yc ycVar = this.z1;
                if (bitmap == null) {
                    xz0.a(bitmap, null, ycVar);
                } else {
                    bitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmap);
                    ycVar.setAlpha(0.0f);
                    frameLayout.draw(canvas2);
                    frameLayout2.draw(canvas2);
                    ycVar.setAlpha(1.0f);
                }
                ycVar.getLocationInWindow(new int[2]);
                float measuredWidth = (ycVar.getMeasuredWidth() / 2.0f) + r3[0];
                float measuredHeight = (ycVar.getMeasuredHeight() / 2.0f) + r3[1];
                float width = bitmap.getWidth();
                float height = bitmap.getHeight();
                org.telegram.ui.Cells.g1 g1Var = xz0.x;
                float max = Math.max(measuredWidth, width - measuredWidth);
                float max2 = Math.max(measuredHeight, height - measuredHeight);
                float sqrt = ((float) Math.sqrt((max2 * max2) + (max * max))) / 0.6f;
                xz0 xz0Var = new xz0(getContext());
                xz0Var.setScaleType(ImageView.ScaleType.MATRIX);
                xz0Var.setImageBitmap(bitmap);
                xz0Var.b(measuredWidth, measuredHeight, z9);
                ColorFilter colorFilter = this.y1.getColorFilter();
                xz0Var.n = ycVar;
                xz0Var.r = colorFilter;
                xz0Var.setRadius(!z9 ? 0.0f : sqrt);
                this.K1 = xz0Var;
                xz0Var.setOnTouchListener(new ei.b(16));
                this.L1 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.M1 = ofFloat;
                ofFloat.addUpdateListener(new io(this, xz0Var, sqrt, z9));
                this.M1.addListener(new y5(this, 16));
                this.M1.setDuration(400L);
                this.M1.setInterpolator(js.e);
                this.M1.start();
                frameLayout2.addView(this.K1, new ViewGroup.LayoutParams(-1, -1));
                org.telegram.messenger.g0.h3(new bi.k1(22, this, z9));
            }
            if (B0 != null) {
                B0.recycle();
            }
        }
        bitmap = null;
        org.telegram.ui.yc ycVar2 = this.z1;
        if (bitmap == null) {
        }
        ycVar2.getLocationInWindow(new int[2]);
        float measuredWidth2 = (ycVar2.getMeasuredWidth() / 2.0f) + r3[0];
        float measuredHeight2 = (ycVar2.getMeasuredHeight() / 2.0f) + r3[1];
        float width2 = bitmap.getWidth();
        float height2 = bitmap.getHeight();
        org.telegram.ui.Cells.g1 g1Var2 = xz0.x;
        float max3 = Math.max(measuredWidth2, width2 - measuredWidth2);
        float max22 = Math.max(measuredHeight2, height2 - measuredHeight2);
        float sqrt2 = ((float) Math.sqrt((max22 * max22) + (max3 * max3))) / 0.6f;
        xz0 xz0Var2 = new xz0(getContext());
        xz0Var2.setScaleType(ImageView.ScaleType.MATRIX);
        xz0Var2.setImageBitmap(bitmap);
        xz0Var2.b(measuredWidth2, measuredHeight2, z9);
        ColorFilter colorFilter2 = this.y1.getColorFilter();
        xz0Var2.n = ycVar2;
        xz0Var2.r = colorFilter2;
        xz0Var2.setRadius(!z9 ? 0.0f : sqrt2);
        this.K1 = xz0Var2;
        xz0Var2.setOnTouchListener(new ei.b(16));
        this.L1 = 0.0f;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.M1 = ofFloat2;
        ofFloat2.addUpdateListener(new io(this, xz0Var2, sqrt2, z9));
        this.M1.addListener(new y5(this, 16));
        this.M1.setDuration(400L);
        this.M1.setInterpolator(js.e);
        this.M1.start();
        frameLayout2.addView(this.K1, new ViewGroup.LayoutParams(-1, -1));
        org.telegram.messenger.g0.h3(new bi.k1(22, this, z9));
    }

    public final void X0(org.telegram.ui.ActionBar.l6 l6Var) {
        if (l6Var == null || l6Var == org.telegram.ui.ActionBar.m6.I) {
            return;
        }
        this.b2 = true;
        try {
            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.t4, l6Var, Boolean.FALSE, null, -1);
        } finally {
            this.b2 = false;
        }
    }

    public final void Y0() {
        TextView textView = this.o1;
        if (textView != null) {
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.p5, this.I0);
            int L = org.telegram.messenger.g0.L(6.0f);
            int i7 = org.telegram.ui.ActionBar.m6.Ci;
            int o4 = i0.a.o(org.telegram.ui.ActionBar.m6.w0(i7, this.I0), 76);
            org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.m6.k0(L, L, L, L, 0, o4, o4);
            org.telegram.ui.ActionBar.p6 g10 = org.telegram.ui.ActionBar.t6.g(i7, 76);
            org.telegram.ui.ActionBar.h6 h6Var = this.I0;
            textView.setBackground(k02);
            org.telegram.ui.ActionBar.t6.j(textView, k02, null, g10, h6Var);
        }
        TextView textView2 = this.n1;
        if (textView2 != null) {
            int i10 = org.telegram.ui.ActionBar.m6.p7;
            org.telegram.ui.ActionBar.t6.U(textView2, i10, this.I0);
            int L2 = org.telegram.messenger.g0.L(6.0f);
            int o10 = i0.a.o(org.telegram.ui.ActionBar.m6.w0(i10, this.I0), 76);
            org.telegram.ui.Cells.y k03 = org.telegram.ui.ActionBar.m6.k0(L2, L2, L2, L2, 0, o10, o10);
            org.telegram.ui.ActionBar.p6 g11 = org.telegram.ui.ActionBar.t6.g(i10, 76);
            org.telegram.ui.ActionBar.h6 h6Var2 = this.I0;
            textView2.setBackground(k03);
            org.telegram.ui.ActionBar.t6.j(textView2, k03, null, g11, h6Var2);
        }
        int i11 = org.telegram.ui.ActionBar.m6.j5;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(i0.a.o(org.telegram.ui.ActionBar.m6.w0(i11, this.I0), 30), 1, -1);
        org.telegram.ui.ActionBar.p6 g12 = org.telegram.ui.ActionBar.t6.g(i11, 30);
        org.telegram.ui.ActionBar.h6 h6Var3 = this.I0;
        ImageView imageView = this.l1;
        org.telegram.ui.ActionBar.t6.Q(imageView, h02, null, g12, h6Var3);
        int w02 = org.telegram.ui.ActionBar.m6.w0(i11, this.I0);
        org.telegram.ui.ActionBar.y1 y1Var = this.m1;
        y1Var.a(w02);
        y1Var.b(org.telegram.ui.ActionBar.m6.w0(i11, this.I0));
        imageView.invalidate();
        int i12 = org.telegram.ui.ActionBar.m6.Ci;
        org.telegram.ui.ActionBar.t6.Q(this.z1, org.telegram.ui.ActionBar.m6.h0(i0.a.o(org.telegram.ui.ActionBar.m6.w0(i12, this.I0), 30), 1, -1), null, org.telegram.ui.ActionBar.t6.g(i12, 30), this.I0);
        int i13 = org.telegram.ui.ActionBar.m6.m5;
        org.telegram.ui.ActionBar.h6 h6Var4 = this.I0;
        TextView textView3 = this.E1;
        org.telegram.ui.ActionBar.t6.U(textView3, i13, h6Var4);
        int L3 = org.telegram.messenger.g0.L(6.0f);
        int o11 = i0.a.o(org.telegram.ui.ActionBar.m6.w0(i12, this.I0), 76);
        org.telegram.ui.ActionBar.t6.Q(textView3, org.telegram.ui.ActionBar.m6.k0(L3, L3, L3, L3, 0, o11, o11), null, org.telegram.ui.ActionBar.t6.g(i12, 76), this.I0);
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
    public final void Z0(boolean z9) {
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus;
        ?? r17;
        boolean z10;
        boolean z11;
        ValueAnimator valueAnimator;
        org.telegram.ui.ActionBar.s3 s3Var;
        org.telegram.ui.cn cnVar = this.u1;
        TLRPC.Chat chat = cnVar.e;
        int i7 = 0;
        if (chat != null && !this.W1 && !this.X1 && this.Y1 == null) {
            this.W1 = true;
            cnVar.getMessagesController().G0().a(cnVar.a(), new fo(this, i7));
        }
        boolean z12 = this.O1;
        lz lzVar = this.x1;
        TextView textView = this.o1;
        i6 i6Var = this.D1;
        TextView textView2 = this.n1;
        TextView textView3 = this.E1;
        org.telegram.ui.ActionBar.y1 y1Var = this.m1;
        View view = this.B1;
        i6 i6Var2 = this.C1;
        if (!z12) {
            y1Var.c(z9, 1.0f);
            view.setEnabled(false);
            org.telegram.messenger.g0.Z3(textView3, false, 0.9f, false, z9);
            org.telegram.messenger.g0.Z3(textView2, false, 0.9f, false, z9);
            org.telegram.messenger.g0.Z3(view, false, 1.0f, false, z9);
            org.telegram.messenger.g0.Z3(i6Var2, false, 0.9f, false, z9);
            org.telegram.messenger.g0.Z3(i6Var, false, 0.9f, false, z9);
            org.telegram.messenger.g0.Z3(textView, false, 0.9f, false, z9);
            org.telegram.messenger.g0.Z3(lzVar, true, 1.0f, true, z9);
            return;
        }
        org.telegram.messenger.g0.Z3(lzVar, false, 1.0f, true, z9);
        if (!P0()) {
            y1Var.c(z9, 1.0f);
            view.setEnabled(false);
            org.telegram.messenger.g0.Z3(textView3, true, 0.9f, false, z9);
            org.telegram.messenger.g0.Z3(textView2, true, 0.9f, false, z9);
            org.telegram.messenger.g0.Z3(view, false, 1.0f, false, z9);
            org.telegram.messenger.g0.Z3(i6Var2, false, 0.9f, false, z9);
            org.telegram.messenger.g0.Z3(i6Var, false, 0.9f, false, z9);
            org.telegram.messenger.g0.Z3(textView, false, 0.9f, false, z9);
            return;
        }
        y1Var.c(z9, 0.0f);
        view.setEnabled(true);
        uo uoVar = this.F1;
        if (uoVar == null || (s3Var = uoVar.a) == null || !s3Var.a) {
            i6Var2.setText(org.telegram.messenger.id.M0(2131752247, null));
            if (chat != null && (tL_premium_boostsStatus = this.Y1) != null && tL_premium_boostsStatus.level < cnVar.getMessagesController().t5) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
                if (this.V1 == null) {
                    wp wpVar = new wp(R.drawable.mini_switch_lock, 0);
                    this.V1 = wpVar;
                    wpVar.n = 1;
                }
                spannableStringBuilder.setSpan(this.V1, 0, 1, 33);
                r17 = 1;
                spannableStringBuilder.append((CharSequence) " ").append((CharSequence) org.telegram.messenger.id.G(cnVar.getMessagesController().t5, "ReactionLevelRequiredBtn", new Object[0]));
                i6Var.setText(spannableStringBuilder);
                z10 = true;
                z11 = (z9 || i6Var2.getAlpha() <= 0.8f) ? false : r17;
                valueAnimator = this.a2;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.a2 = null;
                }
                if (z11) {
                    this.Z1 = z10 ? 1.0f : 0.0f;
                    i6Var2.setTranslationY((-org.telegram.messenger.g0.L(7.0f)) * this.Z1);
                } else {
                    float f10 = this.Z1;
                    float f11 = z10 ? 1.0f : 0.0f;
                    float[] fArr = new float[2];
                    fArr[0] = f10;
                    fArr[r17] = f11;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                    this.a2 = ofFloat;
                    ofFloat.addUpdateListener(new d6(this, 14));
                    this.a2.addListener(new s9(5, this, z10));
                    this.a2.start();
                }
                org.telegram.messenger.g0.Z3(textView3, false, 0.9f, false, z9);
                org.telegram.messenger.g0.Z3(textView2, false, 0.9f, false, z9);
                boolean z13 = r17;
                org.telegram.messenger.g0.Z3(view, z13, 1.0f, false, z9);
                org.telegram.messenger.g0.Z3(i6Var2, z13, 0.9f, false, z9);
                org.telegram.messenger.g0.Y3(i6Var, z10, 0.9f, false, 0.7f, z9, null);
                org.telegram.messenger.g0.Z3(textView, z13, 0.9f, false, z9);
            }
        } else {
            i6Var2.setText(org.telegram.messenger.id.M0(2131752214, null));
        }
        r17 = 1;
        z10 = false;
        if (z9) {
        }
        valueAnimator = this.a2;
        if (valueAnimator != null) {
        }
        if (z11) {
        }
        org.telegram.messenger.g0.Z3(textView3, false, 0.9f, false, z9);
        org.telegram.messenger.g0.Z3(textView2, false, 0.9f, false, z9);
        boolean z132 = r17;
        org.telegram.messenger.g0.Z3(view, z132, 1.0f, false, z9);
        org.telegram.messenger.g0.Z3(i6Var2, z132, 0.9f, false, z9);
        org.telegram.messenger.g0.Y3(i6Var, z10, 0.9f, false, 0.7f, z9, null);
        org.telegram.messenger.g0.Z3(textView, z132, 0.9f, false, z9);
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.i4) {
            org.telegram.messenger.qs.f(this.a).d(new co(this, 0));
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.i4);
        super.dismiss();
        this.u1.getClass();
        boolean z9 = this.H1;
        boolean z10 = this.t1;
        xz0 L0 = (z9 || this.G1 == z10) ? null : L0();
        if (!this.H1) {
            org.telegram.ui.an anVar = this.r1;
            TLRPC.WallPaper wallPaper = anVar.g;
            if (wallPaper == null) {
                wallPaper = this.p1;
            }
            anVar.r(this.s1, wallPaper, L0 == null, Boolean.valueOf(z10), false);
        }
        if (this.G1 != z10) {
            org.telegram.ui.ActionBar.l6 J0 = org.telegram.ui.ActionBar.m6.I.q() == z10 ? org.telegram.ui.ActionBar.m6.I : J0(z10);
            if (this.c2) {
                X0(J0);
            } else {
                org.telegram.ui.ActionBar.m6.u(J0, false, z10);
            }
        }
        this.c2 = false;
        W0(L0);
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean f0(MotionEvent motionEvent) {
        if (motionEvent == null || !P0()) {
            return false;
        }
        int x10 = (int) motionEvent.getX();
        if (((int) motionEvent.getY()) >= this.b.getTop() && x10 >= this.b.getLeft() && x10 <= this.b.getRight()) {
            return false;
        }
        this.u1.getFragmentView().dispatchTouchEvent(motionEvent);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void g0(float f10) {
        y20 y20Var = this.N1;
        if (y20Var != null) {
            y20Var.a();
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void onBackPressed() {
        M0();
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        ArrayList arrayList;
        super.onCreate(bundle);
        org.telegram.messenger.d4 f10 = org.telegram.messenger.d4.f(this.a);
        f10.m(true);
        f10.m(false);
        f10.l(true);
        f10.l(false);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.i4);
        this.H1 = false;
        int i7 = 7;
        if (!f10.f.c || (arrayList = f10.b) == null || arrayList.isEmpty()) {
            Q0();
        } else {
            R0(f10.e(7));
        }
        if (this.u1.j() == null || org.telegram.messenger.iz.e1 <= 0 || this.u1.j().self) {
            return;
        }
        org.telegram.messenger.iz.e1--;
        org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit().putInt("dayNightThemeSwitchHintCount", org.telegram.messenger.iz.e1).apply();
        y20 y20Var = new y20(9, getContext(), this.u1.getResourceProvider(), false);
        this.N1 = y20Var;
        y20Var.setVisibility(4);
        this.N1.setShowingDuration(5000L);
        this.N1.setBottomOffset(-org.telegram.messenger.g0.L(8.0f));
        if (this.G1) {
            this.N1.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("ChatThemeDaySwitchTooltip", null, 2131752203, new Object[0])));
        } else {
            this.N1.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("ChatThemeNightSwitchTooltip", null, 2131752200, new Object[0])));
        }
        org.telegram.messenger.g0.i3(new co(this, i7), 1500L);
        this.c.addView(this.N1, c8.ha.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void s0() {
        int w02;
        super.s0();
        N0();
        try {
            if (Build.VERSION.SDK_INT < 30 || this.F0 != -1 || this.G0 == (w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.i5, this.I0))) {
                return;
            }
            this.G0 = w02;
            org.telegram.messenger.g0.u3(this, w02, false, null);
            org.telegram.messenger.g0.n3(this, ((double) org.telegram.messenger.g0.B(w02)) > 0.721d);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
