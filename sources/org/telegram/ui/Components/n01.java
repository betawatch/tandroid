package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class n01 extends FrameLayout implements org.telegram.messenger.cs {
    public static final /* synthetic */ int f0 = 0;
    public final FrameLayout E;
    public final View F;
    public final View G;
    public int H;
    public int I;
    public int J;
    public ValueAnimator K;
    public long L;
    public String M;
    public final ArrayList N;
    public int O;
    public j50 P;
    public boolean Q;
    public float R;
    public float S;
    public boolean T;
    public boolean U;
    public float V;
    public VelocityTracker W;
    public final int a;
    public final HashMap a0;
    public final long b;
    public final TextPaint b0;
    public final boolean c;
    public final TextPaint c0;
    public final boolean d;
    public final TextPaint d0;
    public final org.telegram.ui.ActionBar.e6 e;
    public final TextPaint e0;
    public final org.telegram.ui.zj f;
    public final ai.d2 h;
    public final ImageView n;
    public final tj0 r;
    public final k01 s;
    public final EditText w;
    public final Paint x;
    public float y;

    public n01(Activity activity, int i3, long j10, org.telegram.ui.ActionBar.e6 e6Var, final org.telegram.ui.zj zjVar) {
        super(activity);
        boolean z10;
        boolean z11;
        String str;
        String M0;
        this.x = new Paint();
        this.H = -1;
        this.J = org.telegram.messenger.g0.L(288.0f);
        this.M = "";
        this.N = new ArrayList();
        this.a0 = new HashMap();
        TextPaint textPaint = new TextPaint(1);
        this.b0 = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.c0 = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.d0 = textPaint3;
        TextPaint textPaint4 = new TextPaint(1);
        this.e0 = textPaint4;
        textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint3.setTextSize(org.telegram.messenger.g0.L(15.0f));
        textPaint4.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint4.setTypeface(org.telegram.messenger.g0.o());
        this.a = i3;
        this.b = j10;
        this.e = e6Var;
        this.f = zjVar;
        TLRPC.Chat M02 = org.telegram.messenger.hp.s1(i3).M0(Long.valueOf(-j10));
        boolean p02 = org.telegram.messenger.t3.p0(M02);
        this.c = p02;
        boolean z12 = j10 == org.telegram.messenger.h10.i(i3).e();
        this.d = z12;
        setWillNotDraw(false);
        ai.d2 d2Var = new ai.d2(activity, 24);
        this.h = d2Var;
        d2Var.setElevation(org.telegram.messenger.g0.L(9.0f));
        d2Var.setOutlineProvider(new cg.p0(19));
        d2Var.setClipToOutline(true);
        d2Var.setOnTouchListener(new fi.a(25));
        addView(d2Var, b8.mf.e(org.telegram.messenger.hs.L4, -1, 53));
        int i10 = org.telegram.messenger.g0.m;
        org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i3);
        k9 k9Var = new k9(activity);
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
        u8 u8Var = new u8((org.telegram.ui.ActionBar.e6) null);
        if (z12) {
            u8Var.g(1);
            u8Var.p = 0.75f;
            k9Var.setImageDrawable(u8Var);
            String M03 = org.telegram.messenger.bd.M0(2131745911, null);
            z10 = p02;
            M0 = org.telegram.messenger.bd.G(s12.G1().j.size(), "Chats", new Object[0]);
            z11 = z12;
            str = M03;
        } else {
            z10 = p02;
            if (z10) {
                z11 = z12;
                TLRPC.Chat M04 = M02 != null ? s12.M0(Long.valueOf(M02.linked_monoforum_id)) : null;
                M04 = M04 == null ? M02 : M04;
                if (M04 != null) {
                    u8Var.q(M04);
                    k9Var.e(M04, u8Var);
                    str = M04.title;
                } else {
                    str = "";
                }
                M0 = org.telegram.messenger.bd.M0(2131743993, null);
            } else {
                z11 = z12;
                if (M02 != null) {
                    u8Var.q(M02);
                    k9Var.e(M02, u8Var);
                    str = M02.title;
                    TLRPC.ChatFull N0 = s12.N0(M02.id);
                    int i11 = (N0 == null || (i11 = N0.participants_count) <= 0) ? M02.participants_count : i11;
                    M0 = i11 > 0 ? org.telegram.messenger.bd.H(',', "Members", i11) : org.telegram.messenger.bd.M0(2131744004, null);
                } else {
                    TLRPC.User a22 = s12.a2(Long.valueOf(j10));
                    if (a22 != null) {
                        u8Var.r(a22);
                        k9Var.e(a22, u8Var);
                        str = org.telegram.messenger.l10.p(a22);
                    } else {
                        str = "";
                    }
                    M0 = org.telegram.messenger.bd.M0(2131744004, null);
                }
            }
        }
        kw0 kw0Var = new kw0(activity);
        int i12 = org.telegram.ui.ActionBar.k6.G6;
        boolean z13 = z11;
        kw0Var.setBackground(org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(i12, e6Var)), 24, 24));
        final int i13 = 0;
        kw0Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.g01
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i14 = i13;
                org.telegram.ui.zj zjVar2 = zjVar;
                switch (i14) {
                    case 0:
                        org.telegram.ui.wm wmVar = zjVar2.a;
                        wmVar.n0.c();
                        if (!wmVar.X9()) {
                            if (!org.telegram.messenger.t3.p0(wmVar.e)) {
                                TLRPC.Chat chat = wmVar.e;
                                if (chat == null) {
                                    TLRPC.User user = wmVar.f;
                                    if (user != null) {
                                        wmVar.presentFragment(ProfileActivity.A4(user.id));
                                        break;
                                    }
                                } else {
                                    wmVar.presentFragment(ProfileActivity.A4(-chat.id));
                                    break;
                                }
                            } else {
                                wmVar.presentFragment(ProfileActivity.A4(-wmVar.e.linked_monoforum_id));
                                break;
                            }
                        } else {
                            Bundle bundle = new Bundle();
                            bundle.putLong("dialog_id", wmVar.getUserConfig().e());
                            wmVar.presentFragment(new r80(bundle, null));
                            break;
                        }
                        break;
                    default:
                        org.telegram.ui.wm wmVar2 = zjVar2.a;
                        org.telegram.ui.ActionBar.q0 q0Var = wmVar2.j0;
                        if (q0Var != null && wmVar2.n0 != null) {
                            q0Var.y();
                            org.telegram.ui.ActionBar.n0 n0Var = q0Var.R;
                            if (n0Var != null) {
                                n0Var.g();
                            }
                            ActionBarPopupWindow$ActionBarPopupWindowLayout popupLayout = wmVar2.j0.getPopupLayout();
                            f60 I = f60.I(wmVar2, view);
                            int i15 = 0;
                            boolean z14 = true;
                            while (true) {
                                int i16 = 5;
                                if (i15 >= popupLayout.getItemsCount()) {
                                    I.V(5);
                                    I.a0(0.0f, -view.getHeight());
                                    I.Z();
                                    break;
                                } else {
                                    View childAt = popupLayout.M.getChildAt(i15);
                                    if (childAt != null && childAt.getVisibility() == 0) {
                                        if (childAt instanceof org.telegram.ui.ActionBar.c1) {
                                            if (!z14) {
                                                I.k();
                                                z14 = true;
                                            }
                                        } else if (childAt instanceof org.telegram.ui.ActionBar.y0) {
                                            org.telegram.ui.ActionBar.y0 y0Var = (org.telegram.ui.ActionBar.y0) childAt;
                                            CharSequence text = y0Var.getTextView().getText();
                                            Drawable drawable = y0Var.getIconResId() == 0 ? y0Var.getImageView().getDrawable() : null;
                                            Drawable ch0Var = ((y0Var.getTag() instanceof Integer) && ((Integer) y0Var.getTag()).intValue() == 29) ? new ch0(R.raw.boosts, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f)) : (drawable == null || drawable.getConstantState() == null) ? null : drawable.getConstantState().newDrawable().mutate();
                                            org.telegram.ui.ActionBar.o0 o0Var = wmVar2.t1;
                                            if (o0Var == null || y0Var != o0Var.j) {
                                                if (y0Var.getTag() instanceof Integer) {
                                                    int intValue = ((Integer) y0Var.getTag()).intValue();
                                                    Drawable drawable2 = ch0Var;
                                                    I.b(y0Var.getIconResId(), drawable2, text, org.telegram.ui.ActionBar.k6.F8, org.telegram.ui.ActionBar.k6.E8, new org.telegram.ui.ne(wmVar2, intValue, 4));
                                                    if (drawable2 instanceof ch0) {
                                                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) I.A;
                                                        View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
                                                        if (childAt2 instanceof org.telegram.ui.ActionBar.y0) {
                                                            org.telegram.ui.ActionBar.y0 y0Var2 = (org.telegram.ui.ActionBar.y0) childAt2;
                                                            if (y0Var2.getImageView() instanceof fh0) {
                                                                fh0 fh0Var = (fh0) y0Var2.getImageView();
                                                                fh0Var.setAnimation((ch0) drawable2);
                                                                fh0Var.d();
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    I.b(y0Var.getIconResId(), ch0Var, text, org.telegram.ui.ActionBar.k6.F8, org.telegram.ui.ActionBar.k6.E8, new org.telegram.ui.xp0(y0Var, 26));
                                                }
                                            } else if (wmVar2.getMessagesController().r2(wmVar2.k6, wmVar2.b(), null)) {
                                                I.c(y0Var.getIconResId(), text, new org.telegram.ui.xe(wmVar2, 16), false);
                                            } else {
                                                I.c(y0Var.getIconResId(), text, new org.telegram.ui.sc(i16, wmVar2, I), false);
                                            }
                                            z14 = false;
                                        }
                                    }
                                    i15++;
                                }
                            }
                        }
                        break;
                }
            }
        });
        d2Var.addView(kw0Var, b8.mf.f(48.0f, -1, 51, org.telegram.messenger.g0.L(6.0f), i10 - org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(52.0f), 0));
        kw0Var.addView(k9Var, b8.mf.f(40.0f, 40, 51, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(4.0f), 0, 0));
        ImageView imageView = new ImageView(activity);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.ic_ab_other);
        int w02 = org.telegram.ui.ActionBar.k6.w0(i12, e6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        final int i14 = 1;
        imageView.setBackground(org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(i12, e6Var)), 1, -1));
        imageView.setContentDescription(org.telegram.messenger.bd.M0(2131754839, null));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.g01
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i142 = i14;
                org.telegram.ui.zj zjVar2 = zjVar;
                switch (i142) {
                    case 0:
                        org.telegram.ui.wm wmVar = zjVar2.a;
                        wmVar.n0.c();
                        if (!wmVar.X9()) {
                            if (!org.telegram.messenger.t3.p0(wmVar.e)) {
                                TLRPC.Chat chat = wmVar.e;
                                if (chat == null) {
                                    TLRPC.User user = wmVar.f;
                                    if (user != null) {
                                        wmVar.presentFragment(ProfileActivity.A4(user.id));
                                        break;
                                    }
                                } else {
                                    wmVar.presentFragment(ProfileActivity.A4(-chat.id));
                                    break;
                                }
                            } else {
                                wmVar.presentFragment(ProfileActivity.A4(-wmVar.e.linked_monoforum_id));
                                break;
                            }
                        } else {
                            Bundle bundle = new Bundle();
                            bundle.putLong("dialog_id", wmVar.getUserConfig().e());
                            wmVar.presentFragment(new r80(bundle, null));
                            break;
                        }
                        break;
                    default:
                        org.telegram.ui.wm wmVar2 = zjVar2.a;
                        org.telegram.ui.ActionBar.q0 q0Var = wmVar2.j0;
                        if (q0Var != null && wmVar2.n0 != null) {
                            q0Var.y();
                            org.telegram.ui.ActionBar.n0 n0Var = q0Var.R;
                            if (n0Var != null) {
                                n0Var.g();
                            }
                            ActionBarPopupWindow$ActionBarPopupWindowLayout popupLayout = wmVar2.j0.getPopupLayout();
                            f60 I = f60.I(wmVar2, view);
                            int i15 = 0;
                            boolean z14 = true;
                            while (true) {
                                int i16 = 5;
                                if (i15 >= popupLayout.getItemsCount()) {
                                    I.V(5);
                                    I.a0(0.0f, -view.getHeight());
                                    I.Z();
                                    break;
                                } else {
                                    View childAt = popupLayout.M.getChildAt(i15);
                                    if (childAt != null && childAt.getVisibility() == 0) {
                                        if (childAt instanceof org.telegram.ui.ActionBar.c1) {
                                            if (!z14) {
                                                I.k();
                                                z14 = true;
                                            }
                                        } else if (childAt instanceof org.telegram.ui.ActionBar.y0) {
                                            org.telegram.ui.ActionBar.y0 y0Var = (org.telegram.ui.ActionBar.y0) childAt;
                                            CharSequence text = y0Var.getTextView().getText();
                                            Drawable drawable = y0Var.getIconResId() == 0 ? y0Var.getImageView().getDrawable() : null;
                                            Drawable ch0Var = ((y0Var.getTag() instanceof Integer) && ((Integer) y0Var.getTag()).intValue() == 29) ? new ch0(R.raw.boosts, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f)) : (drawable == null || drawable.getConstantState() == null) ? null : drawable.getConstantState().newDrawable().mutate();
                                            org.telegram.ui.ActionBar.o0 o0Var = wmVar2.t1;
                                            if (o0Var == null || y0Var != o0Var.j) {
                                                if (y0Var.getTag() instanceof Integer) {
                                                    int intValue = ((Integer) y0Var.getTag()).intValue();
                                                    Drawable drawable2 = ch0Var;
                                                    I.b(y0Var.getIconResId(), drawable2, text, org.telegram.ui.ActionBar.k6.F8, org.telegram.ui.ActionBar.k6.E8, new org.telegram.ui.ne(wmVar2, intValue, 4));
                                                    if (drawable2 instanceof ch0) {
                                                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) I.A;
                                                        View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
                                                        if (childAt2 instanceof org.telegram.ui.ActionBar.y0) {
                                                            org.telegram.ui.ActionBar.y0 y0Var2 = (org.telegram.ui.ActionBar.y0) childAt2;
                                                            if (y0Var2.getImageView() instanceof fh0) {
                                                                fh0 fh0Var = (fh0) y0Var2.getImageView();
                                                                fh0Var.setAnimation((ch0) drawable2);
                                                                fh0Var.d();
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    I.b(y0Var.getIconResId(), ch0Var, text, org.telegram.ui.ActionBar.k6.F8, org.telegram.ui.ActionBar.k6.E8, new org.telegram.ui.xp0(y0Var, 26));
                                                }
                                            } else if (wmVar2.getMessagesController().r2(wmVar2.k6, wmVar2.b(), null)) {
                                                I.c(y0Var.getIconResId(), text, new org.telegram.ui.xe(wmVar2, 16), false);
                                            } else {
                                                I.c(y0Var.getIconResId(), text, new org.telegram.ui.sc(i16, wmVar2, I), false);
                                            }
                                            z14 = false;
                                        }
                                    }
                                    i15++;
                                }
                            }
                        }
                        break;
                }
            }
        });
        d2Var.addView(imageView, b8.mf.f(40.0f, 40, 53, 0, org.telegram.messenger.g0.L(3.0f) + i10, org.telegram.messenger.g0.L(8.0f), 0));
        this.n = imageView;
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(i12, e6Var));
        textView.setText(str);
        textView.setIncludeFontPadding(false);
        kw0Var.addView(textView, b8.mf.f(-2.0f, -1, 51, org.telegram.messenger.g0.L(58.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(6.0f), 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 13.0f);
        textView2.setSingleLine();
        textView2.setEllipsize(truncateAt);
        int i15 = org.telegram.ui.ActionBar.k6.y6;
        textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(i15, e6Var));
        textView2.setText(M0);
        textView2.setIncludeFontPadding(false);
        kw0Var.addView(textView2, b8.mf.f(-2.0f, -1, 51, org.telegram.messenger.g0.L(58.0f), org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(6.0f), 0));
        FrameLayout frameLayout = new FrameLayout(activity);
        int L = org.telegram.messenger.g0.L(4.0f);
        frameLayout.setPadding(L, L, L, L);
        frameLayout.setBackground(new h01(this, L));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.outline_header_search);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(i15, e6Var), mode));
        frameLayout.addView(imageView2, b8.mf.d(24, 24.0f, 19, 12.0f, 0.0f, 0.0f, 0.0f));
        EditText editText = new EditText(activity);
        this.w = editText;
        editText.setBackground(null);
        editText.setPadding(0, 0, 0, 0);
        editText.setTextSize(1, 15.0f);
        editText.setSingleLine();
        editText.setImeOptions(268435459);
        editText.setHint(org.telegram.messenger.bd.M0(2131745846, null));
        editText.setHintTextColor(org.telegram.ui.ActionBar.k6.w0(i15, e6Var));
        editText.setTextColor(org.telegram.ui.ActionBar.k6.w0(i12, e6Var));
        editText.addTextChangedListener(new bh.h(this, 25));
        frameLayout.addView(editText, b8.mf.d(-1, -1.0f, org.telegram.messenger.hs.E1, 48.0f, 0.0f, 12.0f, 0.0f));
        d2Var.addView(frameLayout, b8.mf.f(48.0f, -1, 51, org.telegram.messenger.g0.L(12.0f) - L, (org.telegram.messenger.g0.L(56.0f) + i10) - L, org.telegram.messenger.g0.L(8.0f) - L, 0));
        tj0 tj0Var = new tj0(activity, e6Var);
        this.r = tj0Var;
        tj0Var.setLayoutManager(new u4.b0());
        tj0Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(8.0f));
        tj0Var.setClipToPadding(false);
        tj0Var.setVerticalScrollBarEnabled(false);
        u4.k kVar = new u4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.i = xq.h;
        kVar.n(350L);
        tj0Var.setItemAnimator(kVar);
        tj0Var.setSelectorRadius(org.telegram.messenger.g0.L(16.0f));
        tj0Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(i12, e6Var)));
        k01 k01Var = new k01(this);
        this.s = k01Var;
        tj0Var.setAdapter(k01Var);
        tj0Var.setOnItemClickListener(new ei.q4(14, this, zjVar));
        tj0Var.setOnItemLongClickListener(new org.telegram.ui.jo(29, this, zjVar));
        tj0Var.j(new i01(this, i3, j10));
        d2Var.addView(tj0Var, b8.mf.f(-1.0f, -1, org.telegram.messenger.hs.E1, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(100.0f) + i10, org.telegram.messenger.g0.L(8.0f), 0));
        int i16 = org.telegram.ui.ActionBar.k6.d6;
        int w03 = org.telegram.ui.ActionBar.k6.w0(i16, e6Var);
        View view = new View(activity);
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{w03, i0.a.o(w03, 0)}));
        d2Var.addView(view, b8.mf.f(org.telegram.messenger.g0.L(16.0f), -1, 51, 0, org.telegram.messenger.g0.L(100.0f) + i10, 0, 0));
        View view2 = new View(activity);
        this.G = view2;
        view2.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{w03, i0.a.o(w03, 0)}));
        d2Var.addView(view2, b8.mf.e(-1, 24, 87));
        this.F = view;
        h();
        TLRPC.User a23 = j10 > 0 ? org.telegram.messenger.hp.s1(i3).a2(Long.valueOf(j10)) : null;
        if (!z10 && !z13 && ((M02 != null && org.telegram.messenger.t3.w(15, M02)) || org.telegram.messenger.l10.v(a23))) {
            FrameLayout frameLayout2 = new FrameLayout(activity);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(org.telegram.messenger.g0.L(25.0f));
            gradientDrawable.setColor(i0.a.o(w03, org.telegram.messenger.hs.B3));
            frameLayout2.setBackground(gradientDrawable);
            frameLayout2.setElevation(org.telegram.messenger.g0.L(2.0f));
            frameLayout2.setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
            TextView textView3 = new TextView(activity);
            textView3.setTextSize(1, 14.0f);
            textView3.setTypeface(org.telegram.messenger.g0.o());
            int i17 = org.telegram.ui.ActionBar.k6.Gi;
            textView3.setTextColor(org.telegram.ui.ActionBar.k6.w0(i17, e6Var));
            textView3.setText(org.telegram.messenger.bd.M0(2131748259, null));
            textView3.setGravity(17);
            textView3.setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
            textView3.setCompoundDrawablePadding(org.telegram.messenger.g0.L(8.0f));
            Drawable mutate = activity.getDrawable(R.drawable.filled_topic_new_24).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(i17, e6Var), mode));
            textView3.setCompoundDrawablesWithIntrinsicBounds(mutate, (Drawable) null, (Drawable) null, (Drawable) null);
            textView3.setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(22.0f), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, e6Var)));
            b8.pf.a(textView3);
            textView3.setOnClickListener(new ux0(1, (Object) this, (Object) zjVar));
            frameLayout2.addView(textView3, b8.mf.c(44.0f, -2));
            d2Var.addView(frameLayout2, b8.mf.d(-2, 50.0f, 81, 0.0f, 0.0f, 0.0f, 8.0f));
            this.E = frameLayout2;
        }
        d2Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(i16, e6Var));
        setProgress(0.0f);
    }

    private int getPanelWidth() {
        return this.J + this.I;
    }

    public final void a(float f10, float f11) {
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.K = null;
        }
        float f12 = this.y;
        if (f12 == f10) {
            setProgress(f10);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f10);
        this.K = ofFloat;
        ofFloat.addUpdateListener(new y50(this, 27));
        this.K.addListener(new j01(this, 0));
        this.K.setDuration(Math.abs(f11) > ((float) org.telegram.messenger.g0.L(300.0f)) ? (long) Math.max(150.0f, Math.min(320.0f, ((Math.abs(f10 - this.y) * getPanelWidth()) / Math.abs(f11)) * 1000.0f * 2.0f)) : 320L);
        this.K.setInterpolator(xq.h);
        this.K.start();
    }

    public final void b() {
        j50 j50Var = this.P;
        if (j50Var != null) {
            org.telegram.messenger.g0.r(j50Var);
            this.P = null;
        }
        if (this.O != 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.O, true);
            this.O = 0;
        }
    }

    public final void c() {
        a(0.0f, 0.0f);
        org.telegram.messenger.g0.v1(this.w);
    }

    public final TLObject d(l01 l01Var) {
        long o10;
        org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(this.a);
        org.telegram.messenger.mv mvVar = l01Var.b;
        if (mvVar != null) {
            o10 = mvVar.a;
        } else {
            TLRPC.TL_forumTopic tL_forumTopic = l01Var.a;
            if (tL_forumTopic == null || !this.c) {
                return null;
            }
            o10 = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
        }
        return o10 >= 0 ? s12.a2(Long.valueOf(o10)) : s12.M0(Long.valueOf(-o10));
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.q5) {
            if (((Long) objArr[0]).longValue() == (-this.b)) {
                g();
            }
        } else {
            if (i3 == org.telegram.messenger.hs.r) {
                g();
                return;
            }
            if (i3 == org.telegram.messenger.hs.g3) {
                if (this.d) {
                    g();
                }
            } else if (i3 == org.telegram.messenger.hs.i4) {
                org.telegram.messenger.g0.d0(this.r, new ei.e(27));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int r12 = org.telegram.ui.ActionBar.k6.r1(this.y, 687865856);
        Paint paint = this.x;
        paint.setColor(r12);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        org.telegram.ui.zj zjVar = this.f;
        if (zjVar != null && this.y > 0.0f) {
            org.telegram.ui.wm.M2(zjVar.a, canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.Q = true;
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (actionMasked != 1 && actionMasked != 3) {
            return dispatchTouchEvent;
        }
        this.Q = false;
        setVisibility(this.y <= 0.0f ? 8 : 0);
        return dispatchTouchEvent;
    }

    public final String e(long j10) {
        int i3 = this.a;
        org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i3);
        if (j10 == org.telegram.messenger.h10.i(i3).e()) {
            return org.telegram.messenger.bd.M0(2131748311, null);
        }
        if (j10 == 2666000) {
            return org.telegram.messenger.bd.M0(2131754252, null);
        }
        if (j10 >= 0) {
            return org.telegram.messenger.l10.p(s12.a2(Long.valueOf(j10)));
        }
        TLRPC.Chat M0 = s12.M0(Long.valueOf(-j10));
        return M0 != null ? M0.title : "";
    }

    public final boolean f(l01 l01Var) {
        String str;
        org.telegram.messenger.mv mvVar = l01Var.b;
        String str2 = "";
        if (mvVar != null) {
            String e10 = e(mvVar.a);
            if (e10 != null) {
                str2 = e10.toString();
            }
        } else {
            TLObject d = d(l01Var);
            if (d instanceof TLRPC.User) {
                str2 = org.telegram.messenger.l10.p((TLRPC.User) d);
            } else if (d instanceof TLRPC.Chat) {
                str2 = ((TLRPC.Chat) d).title;
            } else {
                TLRPC.TL_forumTopic tL_forumTopic = l01Var.a;
                if (tL_forumTopic != null && (str = tL_forumTopic.title) != null) {
                    str2 = str;
                }
            }
        }
        return str2.toLowerCase().contains(this.M);
    }

    public final void g() {
        int visibility = getVisibility();
        k01 k01Var = this.s;
        if (visibility == 0 || this.y > 0.0f || k01Var.c.size() <= 0) {
            ArrayList arrayList = k01Var.c;
            String str = k01Var.d;
            n01 n01Var = k01Var.e;
            String str2 = n01Var.M;
            int i3 = n01Var.a;
            int i10 = 0;
            boolean z10 = TextUtils.equals(str, str2) && n01Var.y > 0.0f && !arrayList.isEmpty();
            k01Var.d = n01Var.M;
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            if (TextUtils.isEmpty(n01Var.M)) {
                arrayList.add(new l01(n01Var));
            }
            if (n01Var.d) {
                ArrayList arrayList3 = org.telegram.messenger.hp.s1(i3).G1().j;
                int size = arrayList3.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList3.get(i11);
                    i11++;
                    l01 l01Var = new l01(n01Var);
                    l01Var.b = (org.telegram.messenger.mv) obj;
                    if (!TextUtils.isEmpty(n01Var.M) && !n01Var.f(l01Var)) {
                        TLObject d = n01Var.d(l01Var);
                        String n4 = d instanceof TLRPC.User ? org.telegram.messenger.l10.n((TLRPC.User) d) : d instanceof TLRPC.Chat ? org.telegram.messenger.t3.K((TLRPC.Chat) d, false) : null;
                        if (n4 != null && n4.toLowerCase().contains(n01Var.M)) {
                        }
                    }
                    arrayList.add(l01Var);
                }
                if (z10) {
                    u4.o.c(new kg.g(k01Var, arrayList2, 3), true).c(k01Var);
                    return;
                } else {
                    k01Var.f();
                    return;
                }
            }
            HashSet hashSet = new HashSet();
            ArrayList l10 = org.telegram.messenger.hp.s1(i3).q7.l(-n01Var.b);
            if (l10 != null) {
                int size2 = l10.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj2 = l10.get(i12);
                    i12++;
                    l01 l01Var2 = new l01(n01Var);
                    l01Var2.a = (TLRPC.TL_forumTopic) obj2;
                    if (!TextUtils.isEmpty(n01Var.M) && !n01Var.f(l01Var2)) {
                        TLObject d10 = n01Var.d(l01Var2);
                        String n10 = d10 instanceof TLRPC.User ? org.telegram.messenger.l10.n((TLRPC.User) d10) : d10 instanceof TLRPC.Chat ? org.telegram.messenger.t3.K((TLRPC.Chat) d10, false) : null;
                        if (n10 != null && n10.toLowerCase().contains(n01Var.M)) {
                        }
                    }
                    arrayList.add(l01Var2);
                    hashSet.add(Long.valueOf(l01Var2.a()));
                }
            }
            if (!TextUtils.isEmpty(n01Var.M)) {
                ArrayList arrayList4 = n01Var.N;
                int size3 = arrayList4.size();
                while (i10 < size3) {
                    Object obj3 = arrayList4.get(i10);
                    i10++;
                    l01 l01Var3 = new l01(n01Var);
                    l01Var3.a = (TLRPC.TL_forumTopic) obj3;
                    if (hashSet.add(Long.valueOf(l01Var3.a()))) {
                        arrayList.add(l01Var3);
                    }
                }
            }
            if (z10) {
                u4.o.c(new kg.g(k01Var, arrayList2, 3), true).c(k01Var);
            } else {
                k01Var.f();
            }
        }
    }

    public int getContentWidth() {
        return this.J;
    }

    public float getProgress() {
        return this.y;
    }

    public final void h() {
        View view;
        View view2 = this.F;
        if (view2 == null || (view = this.G) == null) {
            return;
        }
        tj0 tj0Var = this.r;
        view2.setAlpha(Utilities.i(tj0Var.computeVerticalScrollOffset() / org.telegram.messenger.g0.L(16.0f), 1.0f, 0.0f));
        if (this.E != null) {
            view.setAlpha(1.0f);
        } else {
            view.setAlpha(Utilities.i(((tj0Var.computeVerticalScrollRange() - tj0Var.computeVerticalScrollOffset()) - tj0Var.computeVerticalScrollExtent()) / org.telegram.messenger.g0.L(16.0f), 1.0f, 0.0f));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i3 = this.a;
        org.telegram.messenger.hs.f(i3).b(this, org.telegram.messenger.hs.q5);
        org.telegram.messenger.hs.f(i3).b(this, org.telegram.messenger.hs.r);
        org.telegram.messenger.hs.f(i3).b(this, org.telegram.messenger.hs.g3);
        org.telegram.messenger.hs.e().b(this, org.telegram.messenger.hs.i4);
        g();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i3 = this.a;
        org.telegram.messenger.hs.f(i3).n(this, org.telegram.messenger.hs.q5);
        org.telegram.messenger.hs.f(i3).n(this, org.telegram.messenger.hs.r);
        org.telegram.messenger.hs.f(i3).n(this, org.telegram.messenger.hs.g3);
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.i4);
        b();
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.R = motionEvent.getX();
            this.S = motionEvent.getY();
            this.T = false;
            this.U = true;
            this.V = this.y;
            VelocityTracker velocityTracker = this.W;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            VelocityTracker obtain = VelocityTracker.obtain();
            this.W = obtain;
            obtain.addMovement(motionEvent);
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && this.U) {
            VelocityTracker velocityTracker2 = this.W;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            float x10 = motionEvent.getX() - this.R;
            float y9 = motionEvent.getY() - this.S;
            if (x10 > ViewConfiguration.get(getContext()).getScaledTouchSlop() && Math.abs(x10) > Math.abs(y9) * 1.5f) {
                this.T = true;
                this.R = motionEvent.getX();
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        WeakHashMap weakHashMap = r0.i0.a;
        r0.k1 a10 = r0.b0.a(this);
        int i13 = a10 != null ? a10.a.f(2).d : 0;
        if (i13 != this.H) {
            this.H = i13;
            tj0 tj0Var = this.r;
            View view = this.G;
            FrameLayout frameLayout = this.E;
            if (frameLayout != null) {
                ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(8.0f) + i13;
                view.getLayoutParams().height = org.telegram.messenger.g0.L(64.0f) + i13;
                tj0Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(66.0f) + i13);
            } else {
                view.getLayoutParams().height = org.telegram.messenger.g0.L(24.0f) + i13;
                tj0Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(8.0f) + i13);
            }
            this.h.requestLayout();
        }
        super.onLayout(z10, i3, i10, i11, i12);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        org.telegram.ui.wm wmVar;
        org.telegram.ui.ActionBar.q0 m92;
        org.telegram.ui.ActionBar.k kVar;
        WeakHashMap weakHashMap = r0.i0.a;
        r0.k1 a10 = r0.b0.a(this);
        int i11 = 0;
        int i12 = a10 != null ? org.telegram.messenger.g0.I0(a10, false).c : 0;
        int i13 = this.I;
        ai.d2 d2Var = this.h;
        if (i12 != i13) {
            this.I = i12;
            d2Var.getLayoutParams().width = getPanelWidth();
            d2Var.setPadding(0, 0, i12, 0);
            d2Var.setTranslationX((1.0f - this.y) * getPanelWidth());
        }
        int size = View.MeasureSpec.getSize(i3);
        org.telegram.ui.zj zjVar = this.f;
        if (zjVar != null && (m92 = (wmVar = zjVar.a).m9()) != null) {
            View view = (View) m92.getParent();
            kVar = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
            i11 = (int) ((kVar.getWidth() - ((m92.getWidth() / 2.0f) + (m92.getX() + view.getX()))) + org.telegram.messenger.g0.L(31.0f));
        }
        int max = Math.max(org.telegram.messenger.g0.L(200.0f), Math.min(org.telegram.messenger.g0.L(288.0f), (size - this.I) - i11));
        if (max != this.J) {
            this.J = max;
            d2Var.getLayoutParams().width = getPanelWidth();
            d2Var.setTranslationX((1.0f - this.y) * getPanelWidth());
            this.s.f();
        }
        super.onMeasure(i3, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0026, code lost:
    
        if (r0 != 3) goto L28;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.y <= 0.0f) {
            return false;
        }
        if (this.W == null) {
            this.W = VelocityTracker.obtain();
        }
        this.W.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.R = motionEvent.getX();
            this.S = motionEvent.getY();
            this.T = false;
            this.V = this.y;
            return true;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                float x10 = motionEvent.getX() - this.R;
                if (!this.T && Math.abs(x10) > ViewConfiguration.get(getContext()).getScaledTouchSlop()) {
                    this.T = true;
                    this.R = motionEvent.getX();
                    this.V = this.y;
                }
                if (this.T) {
                    ValueAnimator valueAnimator = this.K;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.K = null;
                    }
                    setProgress(this.V - ((motionEvent.getX() - this.R) / this.J));
                }
            }
            return true;
        }
        if (this.T) {
            this.W.computeCurrentVelocity(1000);
            settle(this.W.getXVelocity());
        } else if (motionEvent.getActionMasked() == 1 && motionEvent.getX() < getWidth() - (getPanelWidth() * this.y)) {
            c();
        }
        this.T = false;
        this.U = false;
        this.W.recycle();
        this.W = null;
        return true;
    }

    public void setCurrentTopic(long j10) {
        this.L = j10;
        this.s.f();
    }

    public void setMenuAvailable(boolean z10) {
        ImageView imageView = this.n;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    public void setProgress(float f10) {
        this.y = Utilities.l(f10);
        this.h.setTranslationX((1.0f - this.y) * getPanelWidth());
        setVisibility((this.y > 0.0f || this.Q) ? 0 : 8);
        invalidate();
        org.telegram.ui.zj zjVar = this.f;
        if (zjVar != null) {
            zjVar.a.m1.invalidate();
        }
    }

    public void settle(float f10) {
        boolean z10 = false;
        if (Math.abs(f10) <= org.telegram.messenger.g0.L(300.0f) ? this.y > 0.5f : f10 < 0.0f) {
            z10 = true;
        }
        if (z10) {
            g();
        }
        a(z10 ? 1.0f : 0.0f, f10);
        if (z10) {
            return;
        }
        org.telegram.messenger.g0.v1(this.w);
    }
}
