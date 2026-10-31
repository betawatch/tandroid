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
import java.util.WeakHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class t11 extends FrameLayout implements org.telegram.messenger.us {
    public static final /* synthetic */ int a0 = 0;
    public float D;
    public final FrameLayout E;
    public final View F;
    public final View G;
    public int H;
    public ValueAnimator I;
    public long J;
    public String K;
    public boolean L;
    public float M;
    public float N;
    public boolean O;
    public boolean P;
    public float Q;
    public VelocityTracker R;
    public final HashMap S;
    public final TextPaint T;
    public final TextPaint U;
    public final TextPaint V;
    public final TextPaint W;
    public final int a;
    public final long b;
    public final boolean c;
    public final boolean d;
    public final org.telegram.ui.ActionBar.p6 e;
    public final org.telegram.ui.al f;
    public final org.telegram.ui.Cells.a5 h;
    public final FrameLayout n;
    public final ImageView r;
    public final tk0 s;
    public final q11 w;
    public final EditText x;
    public final Paint y;

    /* JADX WARN: Removed duplicated region for block: B:10:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x04a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public t11(Activity activity, int i10, long j10, boolean z10, org.telegram.ui.ActionBar.p6 p6Var, final org.telegram.ui.al alVar) {
        super(activity);
        boolean z11;
        boolean z12;
        String L0;
        String str;
        String H;
        float f7;
        this.y = new Paint();
        this.H = -1;
        this.K = "";
        this.S = new HashMap();
        TextPaint textPaint = new TextPaint(1);
        this.T = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.U = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.V = textPaint3;
        TextPaint textPaint4 = new TextPaint(1);
        this.W = textPaint4;
        textPaint.setTextSize(org.telegram.messenger.i0.L(16.0f));
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        textPaint2.setTextSize(org.telegram.messenger.i0.L(13.0f));
        textPaint3.setTextSize(org.telegram.messenger.i0.L(15.0f));
        textPaint4.setTextSize(org.telegram.messenger.i0.L(12.0f));
        textPaint4.setTypeface(org.telegram.messenger.i0.o());
        this.a = i10;
        this.b = j10;
        this.e = p6Var;
        this.f = alVar;
        TLRPC.Chat L02 = org.telegram.messenger.vp.r1(i10).L0(Long.valueOf(-j10));
        boolean p02 = org.telegram.messenger.w3.p0(L02);
        this.c = p02;
        boolean z13 = j10 == org.telegram.messenger.d20.i(i10).e();
        this.d = z13;
        setWillNotDraw(false);
        org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(activity, 26);
        this.h = a5Var;
        a5Var.setElevation(org.telegram.messenger.i0.L(9.0f));
        a5Var.setOutlineProvider(new bi.d2(16));
        a5Var.setClipToOutline(true);
        a5Var.setOnTouchListener(new org.telegram.ui.ActionBar.n2(24));
        addView(a5Var, w7.b6.e(org.telegram.messenger.zs.L4, -1, 53));
        int i11 = org.telegram.messenger.i0.m;
        org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(i10);
        g9 g9Var = new g9(activity);
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(20.0f));
        String str2 = "";
        r8 r8Var = new r8((org.telegram.ui.ActionBar.p6) null);
        if (z13) {
            r8Var.g(1);
            r8Var.p = 0.75f;
            g9Var.setImageDrawable(r8Var);
            str2 = org.telegram.messenger.cd.L0(2131745918, null);
            z11 = p02;
            H = org.telegram.messenger.cd.G(r12.F1().j.size(), "Chats", new Object[0]);
            z12 = z13;
        } else {
            z11 = p02;
            if (z11) {
                z12 = z13;
                TLRPC.Chat L03 = L02 != null ? r12.L0(Long.valueOf(L02.linked_monoforum_id)) : null;
                L03 = L03 == null ? L02 : L03;
                if (L03 != null) {
                    r8Var.q(L03);
                    g9Var.e(L03, r8Var);
                    str2 = L03.title;
                }
                L0 = org.telegram.messenger.cd.L0(2131744008, null);
            } else {
                z12 = z13;
                if (L02 != null) {
                    r8Var.q(L02);
                    g9Var.e(L02, r8Var);
                    str = L02.title;
                    TLRPC.ChatFull M0 = r12.M0(L02.id);
                    int i12 = (M0 == null || (i12 = M0.participants_count) <= 0) ? L02.participants_count : i12;
                    H = i12 > 0 ? org.telegram.messenger.cd.H(',', "Members", i12) : org.telegram.messenger.cd.L0(2131744019, null);
                    jg.l0 l0Var = new jg.l0(activity, 28);
                    int i13 = org.telegram.ui.ActionBar.t6.G6;
                    boolean z14 = z12;
                    l0Var.setBackground(org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.r1(0.06f, org.telegram.ui.ActionBar.t6.w0(i13, p6Var)), 24, 24));
                    final int i14 = 0;
                    l0Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.m11
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i15 = i14;
                            org.telegram.ui.al alVar2 = alVar;
                            switch (i15) {
                                case 0:
                                    org.telegram.ui.un unVar = alVar2.a;
                                    unVar.m0.b();
                                    if (unVar.N9()) {
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("dialog_id", unVar.getUserConfig().e());
                                        unVar.presentFragment(new n90(bundle, null));
                                        break;
                                    } else if (org.telegram.messenger.w3.p0(unVar.e)) {
                                        unVar.presentFragment(ProfileActivity.z4(-unVar.e.linked_monoforum_id));
                                        break;
                                    } else {
                                        TLRPC.Chat chat = unVar.e;
                                        if (chat != null) {
                                            unVar.presentFragment(ProfileActivity.z4(-chat.id));
                                            break;
                                        } else {
                                            TLRPC.User user = unVar.f;
                                            if (user != null) {
                                                unVar.presentFragment(ProfileActivity.z4(user.id));
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 1:
                                    org.telegram.ui.un unVar2 = alVar2.a;
                                    org.telegram.ui.ActionBar.t0 t0Var = unVar2.i0;
                                    if (t0Var != null && unVar2.m0 != null) {
                                        t0Var.y();
                                        org.telegram.ui.ActionBar.q0 q0Var = t0Var.Q;
                                        if (q0Var != null) {
                                            q0Var.e();
                                        }
                                        ActionBarPopupWindow$ActionBarPopupWindowLayout popupLayout = unVar2.i0.getPopupLayout();
                                        z60 I = z60.I(unVar2, view);
                                        boolean z15 = true;
                                        for (int i16 = 0; i16 < popupLayout.getItemsCount(); i16++) {
                                            View childAt = popupLayout.L.getChildAt(i16);
                                            if (childAt != null && childAt.getVisibility() == 0) {
                                                if (childAt instanceof org.telegram.ui.ActionBar.h1) {
                                                    if (!z15) {
                                                        I.k();
                                                        z15 = true;
                                                    }
                                                } else if (childAt instanceof org.telegram.ui.ActionBar.b1) {
                                                    org.telegram.ui.ActionBar.b1 b1Var = (org.telegram.ui.ActionBar.b1) childAt;
                                                    CharSequence text = b1Var.getTextView().getText();
                                                    Drawable drawable = b1Var.getIconResId() == 0 ? b1Var.getImageView().getDrawable() : null;
                                                    Drawable bi0Var = ((b1Var.getTag() instanceof Integer) && ((Integer) b1Var.getTag()).intValue() == 29) ? new bi0(R.raw.boosts, org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(24.0f)) : (drawable == null || drawable.getConstantState() == null) ? null : drawable.getConstantState().newDrawable().mutate();
                                                    org.telegram.ui.ActionBar.r0 r0Var = unVar2.s1;
                                                    if (r0Var == null || b1Var != r0Var.j) {
                                                        if (b1Var.getTag() instanceof Integer) {
                                                            int intValue = ((Integer) b1Var.getTag()).intValue();
                                                            Drawable drawable2 = bi0Var;
                                                            I.b(b1Var.getIconResId(), drawable2, text, org.telegram.ui.ActionBar.t6.F8, org.telegram.ui.ActionBar.t6.E8, new org.telegram.ui.df(unVar2, intValue, 4));
                                                            if (drawable2 instanceof bi0) {
                                                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) I.A;
                                                                View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
                                                                if (childAt2 instanceof org.telegram.ui.ActionBar.b1) {
                                                                    org.telegram.ui.ActionBar.b1 b1Var2 = (org.telegram.ui.ActionBar.b1) childAt2;
                                                                    if (b1Var2.getImageView() instanceof ei0) {
                                                                        ei0 ei0Var = (ei0) b1Var2.getImageView();
                                                                        ei0Var.setAnimation((bi0) drawable2);
                                                                        ei0Var.d();
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            I.b(b1Var.getIconResId(), bi0Var, text, org.telegram.ui.ActionBar.t6.F8, org.telegram.ui.ActionBar.t6.E8, new org.telegram.ui.rr0(b1Var, 26));
                                                        }
                                                    } else if (unVar2.getMessagesController().q2(unVar2.j6, unVar2.b(), null)) {
                                                        I.c(b1Var.getIconResId(), text, new org.telegram.ui.mf(unVar2, 16), false);
                                                    } else {
                                                        I.c(b1Var.getIconResId(), text, new org.telegram.ui.h0(24, unVar2, I), false);
                                                    }
                                                    z15 = false;
                                                }
                                            }
                                        }
                                        I.V(5);
                                        I.a0(0.0f, -view.getHeight());
                                        I.Z();
                                        break;
                                    }
                                    break;
                                default:
                                    org.telegram.ui.un unVar3 = alVar2.a;
                                    unVar3.m0.b();
                                    o21 o21Var = unVar3.f2;
                                    if (o21Var != null) {
                                        o21Var.setSidebarMode(false);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    a5Var.addView(l0Var, w7.b6.f(48.0f, -1, 51, org.telegram.messenger.i0.L(6.0f), i11 - org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(52.0f), 0));
                    l0Var.addView(g9Var, w7.b6.f(40.0f, 40, 51, org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(4.0f), 0, 0));
                    ImageView imageView = new ImageView(activity);
                    ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
                    imageView.setScaleType(scaleType);
                    imageView.setImageResource(R.drawable.ic_ab_other);
                    int w02 = org.telegram.ui.ActionBar.t6.w0(i13, p6Var);
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
                    final int i15 = 1;
                    imageView.setBackground(org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.r1(0.06f, org.telegram.ui.ActionBar.t6.w0(i13, p6Var)), 1, -1));
                    imageView.setContentDescription(org.telegram.messenger.cd.L0(2131754839, null));
                    imageView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.m11
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i152 = i15;
                            org.telegram.ui.al alVar2 = alVar;
                            switch (i152) {
                                case 0:
                                    org.telegram.ui.un unVar = alVar2.a;
                                    unVar.m0.b();
                                    if (unVar.N9()) {
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("dialog_id", unVar.getUserConfig().e());
                                        unVar.presentFragment(new n90(bundle, null));
                                        break;
                                    } else if (org.telegram.messenger.w3.p0(unVar.e)) {
                                        unVar.presentFragment(ProfileActivity.z4(-unVar.e.linked_monoforum_id));
                                        break;
                                    } else {
                                        TLRPC.Chat chat = unVar.e;
                                        if (chat != null) {
                                            unVar.presentFragment(ProfileActivity.z4(-chat.id));
                                            break;
                                        } else {
                                            TLRPC.User user = unVar.f;
                                            if (user != null) {
                                                unVar.presentFragment(ProfileActivity.z4(user.id));
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 1:
                                    org.telegram.ui.un unVar2 = alVar2.a;
                                    org.telegram.ui.ActionBar.t0 t0Var = unVar2.i0;
                                    if (t0Var != null && unVar2.m0 != null) {
                                        t0Var.y();
                                        org.telegram.ui.ActionBar.q0 q0Var = t0Var.Q;
                                        if (q0Var != null) {
                                            q0Var.e();
                                        }
                                        ActionBarPopupWindow$ActionBarPopupWindowLayout popupLayout = unVar2.i0.getPopupLayout();
                                        z60 I = z60.I(unVar2, view);
                                        boolean z15 = true;
                                        for (int i16 = 0; i16 < popupLayout.getItemsCount(); i16++) {
                                            View childAt = popupLayout.L.getChildAt(i16);
                                            if (childAt != null && childAt.getVisibility() == 0) {
                                                if (childAt instanceof org.telegram.ui.ActionBar.h1) {
                                                    if (!z15) {
                                                        I.k();
                                                        z15 = true;
                                                    }
                                                } else if (childAt instanceof org.telegram.ui.ActionBar.b1) {
                                                    org.telegram.ui.ActionBar.b1 b1Var = (org.telegram.ui.ActionBar.b1) childAt;
                                                    CharSequence text = b1Var.getTextView().getText();
                                                    Drawable drawable = b1Var.getIconResId() == 0 ? b1Var.getImageView().getDrawable() : null;
                                                    Drawable bi0Var = ((b1Var.getTag() instanceof Integer) && ((Integer) b1Var.getTag()).intValue() == 29) ? new bi0(R.raw.boosts, org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(24.0f)) : (drawable == null || drawable.getConstantState() == null) ? null : drawable.getConstantState().newDrawable().mutate();
                                                    org.telegram.ui.ActionBar.r0 r0Var = unVar2.s1;
                                                    if (r0Var == null || b1Var != r0Var.j) {
                                                        if (b1Var.getTag() instanceof Integer) {
                                                            int intValue = ((Integer) b1Var.getTag()).intValue();
                                                            Drawable drawable2 = bi0Var;
                                                            I.b(b1Var.getIconResId(), drawable2, text, org.telegram.ui.ActionBar.t6.F8, org.telegram.ui.ActionBar.t6.E8, new org.telegram.ui.df(unVar2, intValue, 4));
                                                            if (drawable2 instanceof bi0) {
                                                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) I.A;
                                                                View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
                                                                if (childAt2 instanceof org.telegram.ui.ActionBar.b1) {
                                                                    org.telegram.ui.ActionBar.b1 b1Var2 = (org.telegram.ui.ActionBar.b1) childAt2;
                                                                    if (b1Var2.getImageView() instanceof ei0) {
                                                                        ei0 ei0Var = (ei0) b1Var2.getImageView();
                                                                        ei0Var.setAnimation((bi0) drawable2);
                                                                        ei0Var.d();
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            I.b(b1Var.getIconResId(), bi0Var, text, org.telegram.ui.ActionBar.t6.F8, org.telegram.ui.ActionBar.t6.E8, new org.telegram.ui.rr0(b1Var, 26));
                                                        }
                                                    } else if (unVar2.getMessagesController().q2(unVar2.j6, unVar2.b(), null)) {
                                                        I.c(b1Var.getIconResId(), text, new org.telegram.ui.mf(unVar2, 16), false);
                                                    } else {
                                                        I.c(b1Var.getIconResId(), text, new org.telegram.ui.h0(24, unVar2, I), false);
                                                    }
                                                    z15 = false;
                                                }
                                            }
                                        }
                                        I.V(5);
                                        I.a0(0.0f, -view.getHeight());
                                        I.Z();
                                        break;
                                    }
                                    break;
                                default:
                                    org.telegram.ui.un unVar3 = alVar2.a;
                                    unVar3.m0.b();
                                    o21 o21Var = unVar3.f2;
                                    if (o21Var != null) {
                                        o21Var.setSidebarMode(false);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    a5Var.addView(imageView, w7.b6.f(40.0f, 40, 53, 0, org.telegram.messenger.i0.L(3.0f) + i11, org.telegram.messenger.i0.L(8.0f), 0));
                    this.r = imageView;
                    TextView textView = new TextView(activity);
                    textView.setTextSize(1, 16.0f);
                    textView.setTypeface(org.telegram.messenger.i0.o());
                    textView.setSingleLine();
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView.setEllipsize(truncateAt);
                    textView.setTextColor(org.telegram.ui.ActionBar.t6.w0(i13, p6Var));
                    textView.setText(str);
                    textView.setIncludeFontPadding(false);
                    l0Var.addView(textView, w7.b6.f(-2.0f, -1, 51, org.telegram.messenger.i0.L(58.0f), org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(6.0f), 0));
                    TextView textView2 = new TextView(activity);
                    textView2.setTextSize(1, 13.0f);
                    textView2.setSingleLine();
                    textView2.setEllipsize(truncateAt);
                    int i16 = org.telegram.ui.ActionBar.t6.y6;
                    textView2.setTextColor(org.telegram.ui.ActionBar.t6.w0(i16, p6Var));
                    textView2.setText(H);
                    textView2.setIncludeFontPadding(false);
                    l0Var.addView(textView2, w7.b6.f(-2.0f, -1, 51, org.telegram.messenger.i0.L(58.0f), org.telegram.messenger.i0.L(26.0f), org.telegram.messenger.i0.L(6.0f), 0));
                    FrameLayout frameLayout = new FrameLayout(activity);
                    int L = org.telegram.messenger.i0.L(4.0f);
                    frameLayout.setPadding(L, L, L, L);
                    frameLayout.setBackground(new n11(this, L));
                    ImageView imageView2 = new ImageView(activity);
                    imageView2.setScaleType(scaleType);
                    imageView2.setImageResource(R.drawable.outline_header_search);
                    imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.w0(i16, p6Var), mode));
                    frameLayout.addView(imageView2, w7.b6.d(24, 24.0f, 19, 12.0f, 0.0f, 0.0f, 0.0f));
                    EditText editText = new EditText(activity);
                    this.x = editText;
                    editText.setBackground(null);
                    editText.setPadding(0, 0, 0, 0);
                    editText.setTextSize(1, 15.0f);
                    editText.setSingleLine();
                    editText.setImeOptions(268435459);
                    editText.setHint(org.telegram.messenger.cd.L0(2131745853, null));
                    editText.setHintTextColor(org.telegram.ui.ActionBar.t6.w0(i16, p6Var));
                    editText.setTextColor(org.telegram.ui.ActionBar.t6.w0(i13, p6Var));
                    int i17 = 20;
                    editText.addTextChangedListener(new ag.a1(this, i17));
                    frameLayout.addView(editText, w7.b6.d(-1, -1.0f, org.telegram.messenger.zs.E1, 48.0f, 0.0f, 12.0f, 0.0f));
                    a5Var.addView(frameLayout, w7.b6.f(48.0f, -1, 51, org.telegram.messenger.i0.L(12.0f) - L, (org.telegram.messenger.i0.L(56.0f) + i11) - L, org.telegram.messenger.i0.L(8.0f) - L, 0));
                    tk0 tk0Var = new tk0(activity, p6Var);
                    this.s = tk0Var;
                    tk0Var.setLayoutManager(new s4.a0());
                    tk0Var.setPadding(0, org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(8.0f));
                    tk0Var.setClipToPadding(false);
                    tk0Var.setVerticalScrollBarEnabled(false);
                    tk0Var.setSelectorRadius(org.telegram.messenger.i0.L(16.0f));
                    tk0Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.t6.r1(0.06f, org.telegram.ui.ActionBar.t6.w0(i13, p6Var)));
                    q11 q11Var = new q11(this);
                    this.w = q11Var;
                    tk0Var.setAdapter(q11Var);
                    tk0Var.setOnItemClickListener(new mg.q0(13, this, alVar));
                    tk0Var.setOnItemLongClickListener((ik0) new f2(i17, this, alVar));
                    tk0Var.j(new o11(this, i10, j10));
                    a5Var.addView(tk0Var, w7.b6.f(-1.0f, -1, org.telegram.messenger.zs.E1, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(100.0f) + i11, org.telegram.messenger.i0.L(8.0f), 0));
                    int i18 = org.telegram.ui.ActionBar.t6.d6;
                    int w03 = org.telegram.ui.ActionBar.t6.w0(i18, p6Var);
                    View view = new View(activity);
                    view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{w03, i0.b.o(w03, 0)}));
                    a5Var.addView(view, w7.b6.f(org.telegram.messenger.i0.L(16.0f), -1, 51, 0, org.telegram.messenger.i0.L(100.0f) + i11, 0, 0));
                    View view2 = new View(activity);
                    this.G = view2;
                    view2.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{w03, i0.b.o(w03, 0)}));
                    a5Var.addView(view2, w7.b6.e(-1, 24, 87));
                    this.F = view;
                    g();
                    TLRPC.User Z1 = j10 <= 0 ? org.telegram.messenger.vp.r1(i10).Z1(Long.valueOf(j10)) : null;
                    if (!z11 || z14 || ((L02 == null || !org.telegram.messenger.w3.w(15, L02)) && !org.telegram.messenger.h20.v(Z1))) {
                        f7 = 2.0f;
                    } else {
                        FrameLayout frameLayout2 = new FrameLayout(activity);
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setCornerRadius(org.telegram.messenger.i0.L(25.0f));
                        gradientDrawable.setColor(i0.b.o(w03, org.telegram.messenger.zs.B3));
                        frameLayout2.setBackground(gradientDrawable);
                        frameLayout2.setElevation(org.telegram.messenger.i0.L(2.0f));
                        frameLayout2.setPadding(org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f));
                        TextView textView3 = new TextView(activity);
                        textView3.setTextSize(1, 14.0f);
                        textView3.setTypeface(org.telegram.messenger.i0.o());
                        int i19 = org.telegram.ui.ActionBar.t6.Gi;
                        textView3.setTextColor(org.telegram.ui.ActionBar.t6.w0(i19, p6Var));
                        textView3.setText(org.telegram.messenger.cd.L0(2131748268, null));
                        textView3.setGravity(17);
                        f7 = 2.0f;
                        textView3.setPadding(org.telegram.messenger.i0.L(20.0f), 0, org.telegram.messenger.i0.L(22.0f), 0);
                        textView3.setCompoundDrawablePadding(org.telegram.messenger.i0.L(8.0f));
                        Drawable mutate = activity.getDrawable(R.drawable.filled_topic_new_24).mutate();
                        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.w0(i19, p6Var), mode));
                        textView3.setCompoundDrawablesWithIntrinsicBounds(mutate, (Drawable) null, (Drawable) null, (Drawable) null);
                        textView3.setBackground(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(22.0f), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, p6Var)));
                        w7.e6.a(textView3);
                        textView3.setOnClickListener(new sr(18, this, alVar));
                        frameLayout2.addView(textView3, w7.b6.c(44.0f, -2));
                        a5Var.addView(frameLayout2, w7.b6.d(-2, 50.0f, 81, 0.0f, 0.0f, 0.0f, 8.0f));
                        this.E = frameLayout2;
                    }
                    if (z10) {
                        this.n = null;
                    } else {
                        FrameLayout frameLayout3 = new FrameLayout(activity);
                        GradientDrawable gradientDrawable2 = new GradientDrawable();
                        gradientDrawable2.setShape(1);
                        gradientDrawable2.setColor(i0.b.o(org.telegram.ui.ActionBar.t6.w0(i18, p6Var), org.telegram.messenger.zs.B3));
                        frameLayout3.setBackground(gradientDrawable2);
                        frameLayout3.setElevation(org.telegram.messenger.i0.L(f7));
                        ImageView imageView3 = new ImageView(activity);
                        imageView3.setScaleType(scaleType);
                        imageView3.setImageResource(R.drawable.menu_sidebar_right);
                        imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.w0(i13, p6Var), mode));
                        frameLayout3.addView(imageView3, w7.b6.c(-1.0f, -1));
                        frameLayout3.setContentDescription(org.telegram.messenger.cd.L0(2131744019, null));
                        final int i20 = 2;
                        frameLayout3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.m11
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view3) {
                                int i152 = i20;
                                org.telegram.ui.al alVar2 = alVar;
                                switch (i152) {
                                    case 0:
                                        org.telegram.ui.un unVar = alVar2.a;
                                        unVar.m0.b();
                                        if (unVar.N9()) {
                                            Bundle bundle = new Bundle();
                                            bundle.putLong("dialog_id", unVar.getUserConfig().e());
                                            unVar.presentFragment(new n90(bundle, null));
                                            break;
                                        } else if (org.telegram.messenger.w3.p0(unVar.e)) {
                                            unVar.presentFragment(ProfileActivity.z4(-unVar.e.linked_monoforum_id));
                                            break;
                                        } else {
                                            TLRPC.Chat chat = unVar.e;
                                            if (chat != null) {
                                                unVar.presentFragment(ProfileActivity.z4(-chat.id));
                                                break;
                                            } else {
                                                TLRPC.User user = unVar.f;
                                                if (user != null) {
                                                    unVar.presentFragment(ProfileActivity.z4(user.id));
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 1:
                                        org.telegram.ui.un unVar2 = alVar2.a;
                                        org.telegram.ui.ActionBar.t0 t0Var = unVar2.i0;
                                        if (t0Var != null && unVar2.m0 != null) {
                                            t0Var.y();
                                            org.telegram.ui.ActionBar.q0 q0Var = t0Var.Q;
                                            if (q0Var != null) {
                                                q0Var.e();
                                            }
                                            ActionBarPopupWindow$ActionBarPopupWindowLayout popupLayout = unVar2.i0.getPopupLayout();
                                            z60 I = z60.I(unVar2, view3);
                                            boolean z15 = true;
                                            for (int i162 = 0; i162 < popupLayout.getItemsCount(); i162++) {
                                                View childAt = popupLayout.L.getChildAt(i162);
                                                if (childAt != null && childAt.getVisibility() == 0) {
                                                    if (childAt instanceof org.telegram.ui.ActionBar.h1) {
                                                        if (!z15) {
                                                            I.k();
                                                            z15 = true;
                                                        }
                                                    } else if (childAt instanceof org.telegram.ui.ActionBar.b1) {
                                                        org.telegram.ui.ActionBar.b1 b1Var = (org.telegram.ui.ActionBar.b1) childAt;
                                                        CharSequence text = b1Var.getTextView().getText();
                                                        Drawable drawable = b1Var.getIconResId() == 0 ? b1Var.getImageView().getDrawable() : null;
                                                        Drawable bi0Var = ((b1Var.getTag() instanceof Integer) && ((Integer) b1Var.getTag()).intValue() == 29) ? new bi0(R.raw.boosts, org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(24.0f)) : (drawable == null || drawable.getConstantState() == null) ? null : drawable.getConstantState().newDrawable().mutate();
                                                        org.telegram.ui.ActionBar.r0 r0Var = unVar2.s1;
                                                        if (r0Var == null || b1Var != r0Var.j) {
                                                            if (b1Var.getTag() instanceof Integer) {
                                                                int intValue = ((Integer) b1Var.getTag()).intValue();
                                                                Drawable drawable2 = bi0Var;
                                                                I.b(b1Var.getIconResId(), drawable2, text, org.telegram.ui.ActionBar.t6.F8, org.telegram.ui.ActionBar.t6.E8, new org.telegram.ui.df(unVar2, intValue, 4));
                                                                if (drawable2 instanceof bi0) {
                                                                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) I.A;
                                                                    View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
                                                                    if (childAt2 instanceof org.telegram.ui.ActionBar.b1) {
                                                                        org.telegram.ui.ActionBar.b1 b1Var2 = (org.telegram.ui.ActionBar.b1) childAt2;
                                                                        if (b1Var2.getImageView() instanceof ei0) {
                                                                            ei0 ei0Var = (ei0) b1Var2.getImageView();
                                                                            ei0Var.setAnimation((bi0) drawable2);
                                                                            ei0Var.d();
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                I.b(b1Var.getIconResId(), bi0Var, text, org.telegram.ui.ActionBar.t6.F8, org.telegram.ui.ActionBar.t6.E8, new org.telegram.ui.rr0(b1Var, 26));
                                                            }
                                                        } else if (unVar2.getMessagesController().q2(unVar2.j6, unVar2.b(), null)) {
                                                            I.c(b1Var.getIconResId(), text, new org.telegram.ui.mf(unVar2, 16), false);
                                                        } else {
                                                            I.c(b1Var.getIconResId(), text, new org.telegram.ui.h0(24, unVar2, I), false);
                                                        }
                                                        z15 = false;
                                                    }
                                                }
                                            }
                                            I.V(5);
                                            I.a0(0.0f, -view3.getHeight());
                                            I.Z();
                                            break;
                                        }
                                        break;
                                    default:
                                        org.telegram.ui.un unVar3 = alVar2.a;
                                        unVar3.m0.b();
                                        o21 o21Var = unVar3.f2;
                                        if (o21Var != null) {
                                            o21Var.setSidebarMode(false);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        w7.e6.a(frameLayout3);
                        addView(frameLayout3, w7.b6.f(46.0f, 46, 51, org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(3.0f) + i11, 0, 0));
                        this.n = frameLayout3;
                    }
                    a5Var.setBackgroundColor(org.telegram.ui.ActionBar.t6.w0(i18, p6Var));
                    setProgress(0.0f);
                }
                TLRPC.User Z12 = r12.Z1(Long.valueOf(j10));
                if (Z12 != null) {
                    r8Var.r(Z12);
                    g9Var.e(Z12, r8Var);
                    str2 = org.telegram.messenger.h20.p(Z12);
                }
                L0 = org.telegram.messenger.cd.L0(2131744019, null);
            }
            H = L0;
        }
        str = str2;
        jg.l0 l0Var2 = new jg.l0(activity, 28);
        int i132 = org.telegram.ui.ActionBar.t6.G6;
        boolean z142 = z12;
        l0Var2.setBackground(org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.r1(0.06f, org.telegram.ui.ActionBar.t6.w0(i132, p6Var)), 24, 24));
        final int i142 = 0;
        l0Var2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.m11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i152 = i142;
                org.telegram.ui.al alVar2 = alVar;
                switch (i152) {
                    case 0:
                        org.telegram.ui.un unVar = alVar2.a;
                        unVar.m0.b();
                        if (unVar.N9()) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("dialog_id", unVar.getUserConfig().e());
                            unVar.presentFragment(new n90(bundle, null));
                            break;
                        } else if (org.telegram.messenger.w3.p0(unVar.e)) {
                            unVar.presentFragment(ProfileActivity.z4(-unVar.e.linked_monoforum_id));
                            break;
                        } else {
                            TLRPC.Chat chat = unVar.e;
                            if (chat != null) {
                                unVar.presentFragment(ProfileActivity.z4(-chat.id));
                                break;
                            } else {
                                TLRPC.User user = unVar.f;
                                if (user != null) {
                                    unVar.presentFragment(ProfileActivity.z4(user.id));
                                    break;
                                }
                            }
                        }
                        break;
                    case 1:
                        org.telegram.ui.un unVar2 = alVar2.a;
                        org.telegram.ui.ActionBar.t0 t0Var = unVar2.i0;
                        if (t0Var != null && unVar2.m0 != null) {
                            t0Var.y();
                            org.telegram.ui.ActionBar.q0 q0Var = t0Var.Q;
                            if (q0Var != null) {
                                q0Var.e();
                            }
                            ActionBarPopupWindow$ActionBarPopupWindowLayout popupLayout = unVar2.i0.getPopupLayout();
                            z60 I = z60.I(unVar2, view3);
                            boolean z15 = true;
                            for (int i162 = 0; i162 < popupLayout.getItemsCount(); i162++) {
                                View childAt = popupLayout.L.getChildAt(i162);
                                if (childAt != null && childAt.getVisibility() == 0) {
                                    if (childAt instanceof org.telegram.ui.ActionBar.h1) {
                                        if (!z15) {
                                            I.k();
                                            z15 = true;
                                        }
                                    } else if (childAt instanceof org.telegram.ui.ActionBar.b1) {
                                        org.telegram.ui.ActionBar.b1 b1Var = (org.telegram.ui.ActionBar.b1) childAt;
                                        CharSequence text = b1Var.getTextView().getText();
                                        Drawable drawable = b1Var.getIconResId() == 0 ? b1Var.getImageView().getDrawable() : null;
                                        Drawable bi0Var = ((b1Var.getTag() instanceof Integer) && ((Integer) b1Var.getTag()).intValue() == 29) ? new bi0(R.raw.boosts, org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(24.0f)) : (drawable == null || drawable.getConstantState() == null) ? null : drawable.getConstantState().newDrawable().mutate();
                                        org.telegram.ui.ActionBar.r0 r0Var = unVar2.s1;
                                        if (r0Var == null || b1Var != r0Var.j) {
                                            if (b1Var.getTag() instanceof Integer) {
                                                int intValue = ((Integer) b1Var.getTag()).intValue();
                                                Drawable drawable2 = bi0Var;
                                                I.b(b1Var.getIconResId(), drawable2, text, org.telegram.ui.ActionBar.t6.F8, org.telegram.ui.ActionBar.t6.E8, new org.telegram.ui.df(unVar2, intValue, 4));
                                                if (drawable2 instanceof bi0) {
                                                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) I.A;
                                                    View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
                                                    if (childAt2 instanceof org.telegram.ui.ActionBar.b1) {
                                                        org.telegram.ui.ActionBar.b1 b1Var2 = (org.telegram.ui.ActionBar.b1) childAt2;
                                                        if (b1Var2.getImageView() instanceof ei0) {
                                                            ei0 ei0Var = (ei0) b1Var2.getImageView();
                                                            ei0Var.setAnimation((bi0) drawable2);
                                                            ei0Var.d();
                                                        }
                                                    }
                                                }
                                            } else {
                                                I.b(b1Var.getIconResId(), bi0Var, text, org.telegram.ui.ActionBar.t6.F8, org.telegram.ui.ActionBar.t6.E8, new org.telegram.ui.rr0(b1Var, 26));
                                            }
                                        } else if (unVar2.getMessagesController().q2(unVar2.j6, unVar2.b(), null)) {
                                            I.c(b1Var.getIconResId(), text, new org.telegram.ui.mf(unVar2, 16), false);
                                        } else {
                                            I.c(b1Var.getIconResId(), text, new org.telegram.ui.h0(24, unVar2, I), false);
                                        }
                                        z15 = false;
                                    }
                                }
                            }
                            I.V(5);
                            I.a0(0.0f, -view3.getHeight());
                            I.Z();
                            break;
                        }
                        break;
                    default:
                        org.telegram.ui.un unVar3 = alVar2.a;
                        unVar3.m0.b();
                        o21 o21Var = unVar3.f2;
                        if (o21Var != null) {
                            o21Var.setSidebarMode(false);
                            break;
                        }
                        break;
                }
            }
        });
        a5Var.addView(l0Var2, w7.b6.f(48.0f, -1, 51, org.telegram.messenger.i0.L(6.0f), i11 - org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(52.0f), 0));
        l0Var2.addView(g9Var, w7.b6.f(40.0f, 40, 51, org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(4.0f), 0, 0));
        ImageView imageView4 = new ImageView(activity);
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
        imageView4.setScaleType(scaleType2);
        imageView4.setImageResource(R.drawable.ic_ab_other);
        int w022 = org.telegram.ui.ActionBar.t6.w0(i132, p6Var);
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        imageView4.setColorFilter(new PorterDuffColorFilter(w022, mode2));
        final int i152 = 1;
        imageView4.setBackground(org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.r1(0.06f, org.telegram.ui.ActionBar.t6.w0(i132, p6Var)), 1, -1));
        imageView4.setContentDescription(org.telegram.messenger.cd.L0(2131754839, null));
        imageView4.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.m11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i1522 = i152;
                org.telegram.ui.al alVar2 = alVar;
                switch (i1522) {
                    case 0:
                        org.telegram.ui.un unVar = alVar2.a;
                        unVar.m0.b();
                        if (unVar.N9()) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("dialog_id", unVar.getUserConfig().e());
                            unVar.presentFragment(new n90(bundle, null));
                            break;
                        } else if (org.telegram.messenger.w3.p0(unVar.e)) {
                            unVar.presentFragment(ProfileActivity.z4(-unVar.e.linked_monoforum_id));
                            break;
                        } else {
                            TLRPC.Chat chat = unVar.e;
                            if (chat != null) {
                                unVar.presentFragment(ProfileActivity.z4(-chat.id));
                                break;
                            } else {
                                TLRPC.User user = unVar.f;
                                if (user != null) {
                                    unVar.presentFragment(ProfileActivity.z4(user.id));
                                    break;
                                }
                            }
                        }
                        break;
                    case 1:
                        org.telegram.ui.un unVar2 = alVar2.a;
                        org.telegram.ui.ActionBar.t0 t0Var = unVar2.i0;
                        if (t0Var != null && unVar2.m0 != null) {
                            t0Var.y();
                            org.telegram.ui.ActionBar.q0 q0Var = t0Var.Q;
                            if (q0Var != null) {
                                q0Var.e();
                            }
                            ActionBarPopupWindow$ActionBarPopupWindowLayout popupLayout = unVar2.i0.getPopupLayout();
                            z60 I = z60.I(unVar2, view3);
                            boolean z15 = true;
                            for (int i162 = 0; i162 < popupLayout.getItemsCount(); i162++) {
                                View childAt = popupLayout.L.getChildAt(i162);
                                if (childAt != null && childAt.getVisibility() == 0) {
                                    if (childAt instanceof org.telegram.ui.ActionBar.h1) {
                                        if (!z15) {
                                            I.k();
                                            z15 = true;
                                        }
                                    } else if (childAt instanceof org.telegram.ui.ActionBar.b1) {
                                        org.telegram.ui.ActionBar.b1 b1Var = (org.telegram.ui.ActionBar.b1) childAt;
                                        CharSequence text = b1Var.getTextView().getText();
                                        Drawable drawable = b1Var.getIconResId() == 0 ? b1Var.getImageView().getDrawable() : null;
                                        Drawable bi0Var = ((b1Var.getTag() instanceof Integer) && ((Integer) b1Var.getTag()).intValue() == 29) ? new bi0(R.raw.boosts, org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(24.0f)) : (drawable == null || drawable.getConstantState() == null) ? null : drawable.getConstantState().newDrawable().mutate();
                                        org.telegram.ui.ActionBar.r0 r0Var = unVar2.s1;
                                        if (r0Var == null || b1Var != r0Var.j) {
                                            if (b1Var.getTag() instanceof Integer) {
                                                int intValue = ((Integer) b1Var.getTag()).intValue();
                                                Drawable drawable2 = bi0Var;
                                                I.b(b1Var.getIconResId(), drawable2, text, org.telegram.ui.ActionBar.t6.F8, org.telegram.ui.ActionBar.t6.E8, new org.telegram.ui.df(unVar2, intValue, 4));
                                                if (drawable2 instanceof bi0) {
                                                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) I.A;
                                                    View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
                                                    if (childAt2 instanceof org.telegram.ui.ActionBar.b1) {
                                                        org.telegram.ui.ActionBar.b1 b1Var2 = (org.telegram.ui.ActionBar.b1) childAt2;
                                                        if (b1Var2.getImageView() instanceof ei0) {
                                                            ei0 ei0Var = (ei0) b1Var2.getImageView();
                                                            ei0Var.setAnimation((bi0) drawable2);
                                                            ei0Var.d();
                                                        }
                                                    }
                                                }
                                            } else {
                                                I.b(b1Var.getIconResId(), bi0Var, text, org.telegram.ui.ActionBar.t6.F8, org.telegram.ui.ActionBar.t6.E8, new org.telegram.ui.rr0(b1Var, 26));
                                            }
                                        } else if (unVar2.getMessagesController().q2(unVar2.j6, unVar2.b(), null)) {
                                            I.c(b1Var.getIconResId(), text, new org.telegram.ui.mf(unVar2, 16), false);
                                        } else {
                                            I.c(b1Var.getIconResId(), text, new org.telegram.ui.h0(24, unVar2, I), false);
                                        }
                                        z15 = false;
                                    }
                                }
                            }
                            I.V(5);
                            I.a0(0.0f, -view3.getHeight());
                            I.Z();
                            break;
                        }
                        break;
                    default:
                        org.telegram.ui.un unVar3 = alVar2.a;
                        unVar3.m0.b();
                        o21 o21Var = unVar3.f2;
                        if (o21Var != null) {
                            o21Var.setSidebarMode(false);
                            break;
                        }
                        break;
                }
            }
        });
        a5Var.addView(imageView4, w7.b6.f(40.0f, 40, 53, 0, org.telegram.messenger.i0.L(3.0f) + i11, org.telegram.messenger.i0.L(8.0f), 0));
        this.r = imageView4;
        TextView textView4 = new TextView(activity);
        textView4.setTextSize(1, 16.0f);
        textView4.setTypeface(org.telegram.messenger.i0.o());
        textView4.setSingleLine();
        TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
        textView4.setEllipsize(truncateAt2);
        textView4.setTextColor(org.telegram.ui.ActionBar.t6.w0(i132, p6Var));
        textView4.setText(str);
        textView4.setIncludeFontPadding(false);
        l0Var2.addView(textView4, w7.b6.f(-2.0f, -1, 51, org.telegram.messenger.i0.L(58.0f), org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(6.0f), 0));
        TextView textView22 = new TextView(activity);
        textView22.setTextSize(1, 13.0f);
        textView22.setSingleLine();
        textView22.setEllipsize(truncateAt2);
        int i162 = org.telegram.ui.ActionBar.t6.y6;
        textView22.setTextColor(org.telegram.ui.ActionBar.t6.w0(i162, p6Var));
        textView22.setText(H);
        textView22.setIncludeFontPadding(false);
        l0Var2.addView(textView22, w7.b6.f(-2.0f, -1, 51, org.telegram.messenger.i0.L(58.0f), org.telegram.messenger.i0.L(26.0f), org.telegram.messenger.i0.L(6.0f), 0));
        FrameLayout frameLayout4 = new FrameLayout(activity);
        int L2 = org.telegram.messenger.i0.L(4.0f);
        frameLayout4.setPadding(L2, L2, L2, L2);
        frameLayout4.setBackground(new n11(this, L2));
        ImageView imageView22 = new ImageView(activity);
        imageView22.setScaleType(scaleType2);
        imageView22.setImageResource(R.drawable.outline_header_search);
        imageView22.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.w0(i162, p6Var), mode2));
        frameLayout4.addView(imageView22, w7.b6.d(24, 24.0f, 19, 12.0f, 0.0f, 0.0f, 0.0f));
        EditText editText2 = new EditText(activity);
        this.x = editText2;
        editText2.setBackground(null);
        editText2.setPadding(0, 0, 0, 0);
        editText2.setTextSize(1, 15.0f);
        editText2.setSingleLine();
        editText2.setImeOptions(268435459);
        editText2.setHint(org.telegram.messenger.cd.L0(2131745853, null));
        editText2.setHintTextColor(org.telegram.ui.ActionBar.t6.w0(i162, p6Var));
        editText2.setTextColor(org.telegram.ui.ActionBar.t6.w0(i132, p6Var));
        int i172 = 20;
        editText2.addTextChangedListener(new ag.a1(this, i172));
        frameLayout4.addView(editText2, w7.b6.d(-1, -1.0f, org.telegram.messenger.zs.E1, 48.0f, 0.0f, 12.0f, 0.0f));
        a5Var.addView(frameLayout4, w7.b6.f(48.0f, -1, 51, org.telegram.messenger.i0.L(12.0f) - L2, (org.telegram.messenger.i0.L(56.0f) + i11) - L2, org.telegram.messenger.i0.L(8.0f) - L2, 0));
        tk0 tk0Var2 = new tk0(activity, p6Var);
        this.s = tk0Var2;
        tk0Var2.setLayoutManager(new s4.a0());
        tk0Var2.setPadding(0, org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(8.0f));
        tk0Var2.setClipToPadding(false);
        tk0Var2.setVerticalScrollBarEnabled(false);
        tk0Var2.setSelectorRadius(org.telegram.messenger.i0.L(16.0f));
        tk0Var2.setSelectorDrawableColor(org.telegram.ui.ActionBar.t6.r1(0.06f, org.telegram.ui.ActionBar.t6.w0(i132, p6Var)));
        q11 q11Var2 = new q11(this);
        this.w = q11Var2;
        tk0Var2.setAdapter(q11Var2);
        tk0Var2.setOnItemClickListener(new mg.q0(13, this, alVar));
        tk0Var2.setOnItemLongClickListener((ik0) new f2(i172, this, alVar));
        tk0Var2.j(new o11(this, i10, j10));
        a5Var.addView(tk0Var2, w7.b6.f(-1.0f, -1, org.telegram.messenger.zs.E1, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(100.0f) + i11, org.telegram.messenger.i0.L(8.0f), 0));
        int i182 = org.telegram.ui.ActionBar.t6.d6;
        int w032 = org.telegram.ui.ActionBar.t6.w0(i182, p6Var);
        View view3 = new View(activity);
        view3.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{w032, i0.b.o(w032, 0)}));
        a5Var.addView(view3, w7.b6.f(org.telegram.messenger.i0.L(16.0f), -1, 51, 0, org.telegram.messenger.i0.L(100.0f) + i11, 0, 0));
        View view22 = new View(activity);
        this.G = view22;
        view22.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{w032, i0.b.o(w032, 0)}));
        a5Var.addView(view22, w7.b6.e(-1, 24, 87));
        this.F = view3;
        g();
        if (j10 <= 0) {
        }
        if (z11) {
        }
        f7 = 2.0f;
        if (z10) {
        }
        a5Var.setBackgroundColor(org.telegram.ui.ActionBar.t6.w0(i182, p6Var));
        setProgress(0.0f);
    }

    public final void a(float f7, float f10) {
        ValueAnimator valueAnimator = this.I;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.I = null;
        }
        float f11 = this.D;
        if (f11 == f7) {
            setProgress(f7);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f7);
        this.I = ofFloat;
        ofFloat.addUpdateListener(new r60(this, 27));
        this.I.addListener(new p11(this, 0));
        this.I.setDuration(Math.abs(f10) > ((float) org.telegram.messenger.i0.L(300.0f)) ? (long) Math.max(150.0f, Math.min(320.0f, ((Math.abs(f7 - this.D) * org.telegram.messenger.i0.L(288.0f)) / Math.abs(f10)) * 1000.0f * 2.0f)) : 320L);
        this.I.setInterpolator(gr.h);
        this.I.start();
    }

    public final void b() {
        a(0.0f, 0.0f);
        org.telegram.messenger.i0.v1(this.x);
    }

    public final TLObject c(r11 r11Var) {
        long o10;
        org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(this.a);
        org.telegram.messenger.fw fwVar = r11Var.b;
        if (fwVar != null) {
            o10 = fwVar.a;
        } else {
            TLRPC.TL_forumTopic tL_forumTopic = r11Var.a;
            if (tL_forumTopic == null || !this.c) {
                return null;
            }
            o10 = org.telegram.messenger.o5.o(tL_forumTopic.from_id);
        }
        return o10 >= 0 ? r12.Z1(Long.valueOf(o10)) : r12.L0(Long.valueOf(-o10));
    }

    public final String d(long j10) {
        int i10 = this.a;
        org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(i10);
        if (j10 == org.telegram.messenger.d20.i(i10).e()) {
            return org.telegram.messenger.cd.L0(2131748318, null);
        }
        if (j10 == 2666000) {
            return org.telegram.messenger.cd.L0(2131754252, null);
        }
        if (j10 >= 0) {
            return org.telegram.messenger.h20.p(r12.Z1(Long.valueOf(j10)));
        }
        TLRPC.Chat L0 = r12.L0(Long.valueOf(-j10));
        return L0 != null ? L0.title : "";
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.q5) {
            if (((Long) objArr[0]).longValue() == (-this.b)) {
                f();
            }
        } else {
            if (i10 == org.telegram.messenger.zs.r) {
                f();
                return;
            }
            if (i10 == org.telegram.messenger.zs.g3) {
                if (this.d) {
                    f();
                }
            } else if (i10 == org.telegram.messenger.zs.i4) {
                org.telegram.messenger.i0.d0(this.s, new ag.z0(2));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int r12 = org.telegram.ui.ActionBar.t6.r1(this.D, 687865856);
        Paint paint = this.y;
        paint.setColor(r12);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.L = true;
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (actionMasked != 1 && actionMasked != 3) {
            return dispatchTouchEvent;
        }
        this.L = false;
        setVisibility(this.D <= 0.0f ? 8 : 0);
        return dispatchTouchEvent;
    }

    public final boolean e(r11 r11Var) {
        String str;
        org.telegram.messenger.fw fwVar = r11Var.b;
        String str2 = "";
        if (fwVar != null) {
            String d = d(fwVar.a);
            if (d != null) {
                str2 = d.toString();
            }
        } else {
            TLObject c10 = c(r11Var);
            if (c10 instanceof TLRPC.User) {
                str2 = org.telegram.messenger.h20.p((TLRPC.User) c10);
            } else if (c10 instanceof TLRPC.Chat) {
                str2 = ((TLRPC.Chat) c10).title;
            } else {
                TLRPC.TL_forumTopic tL_forumTopic = r11Var.a;
                if (tL_forumTopic != null && (str = tL_forumTopic.title) != null) {
                    str2 = str;
                }
            }
        }
        return str2.toLowerCase().contains(this.K);
    }

    public final void f() {
        int visibility = getVisibility();
        q11 q11Var = this.w;
        if (visibility == 0 || this.D > 0.0f || q11Var.c.size() <= 0) {
            ArrayList arrayList = q11Var.c;
            arrayList.clear();
            t11 t11Var = q11Var.d;
            String str = t11Var.K;
            int i10 = t11Var.a;
            if (TextUtils.isEmpty(str)) {
                arrayList.add(new r11(t11Var));
            }
            if (t11Var.d) {
                ArrayList arrayList2 = org.telegram.messenger.vp.r1(i10).F1().j;
                int size = arrayList2.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList2.get(i11);
                    i11++;
                    r11 r11Var = new r11(t11Var);
                    r11Var.b = (org.telegram.messenger.fw) obj;
                    if (!TextUtils.isEmpty(t11Var.K) && !t11Var.e(r11Var)) {
                        TLObject c10 = t11Var.c(r11Var);
                        String n10 = c10 instanceof TLRPC.User ? org.telegram.messenger.h20.n((TLRPC.User) c10) : c10 instanceof TLRPC.Chat ? org.telegram.messenger.w3.K((TLRPC.Chat) c10, false) : null;
                        if (n10 != null && n10.toLowerCase().contains(t11Var.K)) {
                        }
                    }
                    arrayList.add(r11Var);
                }
                q11Var.f();
                return;
            }
            ArrayList l4 = org.telegram.messenger.vp.r1(i10).r7.l(-t11Var.b);
            if (l4 != null) {
                int size2 = l4.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj2 = l4.get(i12);
                    i12++;
                    r11 r11Var2 = new r11(t11Var);
                    r11Var2.a = (TLRPC.TL_forumTopic) obj2;
                    if (!TextUtils.isEmpty(t11Var.K) && !t11Var.e(r11Var2)) {
                        TLObject c11 = t11Var.c(r11Var2);
                        String n11 = c11 instanceof TLRPC.User ? org.telegram.messenger.h20.n((TLRPC.User) c11) : c11 instanceof TLRPC.Chat ? org.telegram.messenger.w3.K((TLRPC.Chat) c11, false) : null;
                        if (n11 != null && n11.toLowerCase().contains(t11Var.K)) {
                        }
                    }
                    arrayList.add(r11Var2);
                }
            }
            q11Var.f();
        }
    }

    public final void g() {
        View view;
        View view2 = this.F;
        if (view2 == null || (view = this.G) == null) {
            return;
        }
        tk0 tk0Var = this.s;
        view2.setAlpha(Utilities.i(tk0Var.computeVerticalScrollOffset() / org.telegram.messenger.i0.L(16.0f), 1.0f, 0.0f));
        if (this.E != null) {
            view.setAlpha(1.0f);
        } else {
            view.setAlpha(Utilities.i(((tk0Var.computeVerticalScrollRange() - tk0Var.computeVerticalScrollOffset()) - tk0Var.computeVerticalScrollExtent()) / org.telegram.messenger.i0.L(16.0f), 1.0f, 0.0f));
        }
    }

    public float getProgress() {
        return this.D;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.a;
        org.telegram.messenger.zs.f(i10).b(this, org.telegram.messenger.zs.q5);
        org.telegram.messenger.zs.f(i10).b(this, org.telegram.messenger.zs.r);
        org.telegram.messenger.zs.f(i10).b(this, org.telegram.messenger.zs.g3);
        org.telegram.messenger.zs.e().b(this, org.telegram.messenger.zs.i4);
        f();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.a;
        org.telegram.messenger.zs.f(i10).n(this, org.telegram.messenger.zs.q5);
        org.telegram.messenger.zs.f(i10).n(this, org.telegram.messenger.zs.r);
        org.telegram.messenger.zs.f(i10).n(this, org.telegram.messenger.zs.g3);
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.i4);
        ValueAnimator valueAnimator = this.I;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.M = motionEvent.getX();
            this.N = motionEvent.getY();
            this.O = false;
            this.P = true;
            this.Q = this.D;
            VelocityTracker velocityTracker = this.R;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            VelocityTracker obtain = VelocityTracker.obtain();
            this.R = obtain;
            obtain.addMovement(motionEvent);
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && this.P) {
            VelocityTracker velocityTracker2 = this.R;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            float x10 = motionEvent.getX() - this.M;
            float y3 = motionEvent.getY() - this.N;
            if (x10 > ViewConfiguration.get(getContext()).getScaledTouchSlop() && Math.abs(x10) > Math.abs(y3) * 1.5f) {
                this.O = true;
                this.M = motionEvent.getX();
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        WeakHashMap weakHashMap = r0.h0.a;
        r0.j1 a2 = r0.a0.a(this);
        int i14 = a2 != null ? a2.a.f(2).d : 0;
        if (i14 != this.H) {
            this.H = i14;
            tk0 tk0Var = this.s;
            View view = this.G;
            FrameLayout frameLayout = this.E;
            if (frameLayout != null) {
                ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).bottomMargin = org.telegram.messenger.i0.L(8.0f) + i14;
                view.getLayoutParams().height = org.telegram.messenger.i0.L(64.0f) + i14;
                tk0Var.setPadding(0, org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(66.0f) + i14);
            } else {
                view.getLayoutParams().height = org.telegram.messenger.i0.L(24.0f) + i14;
                tk0Var.setPadding(0, org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(8.0f) + i14);
            }
            this.h.requestLayout();
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
    
        if (r0 != 3) goto L28;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.D <= 0.0f) {
            return false;
        }
        if (this.R == null) {
            this.R = VelocityTracker.obtain();
        }
        this.R.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.M = motionEvent.getX();
            this.N = motionEvent.getY();
            this.O = false;
            this.Q = this.D;
            return true;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                float x10 = motionEvent.getX() - this.M;
                if (!this.O && Math.abs(x10) > ViewConfiguration.get(getContext()).getScaledTouchSlop()) {
                    this.O = true;
                    this.M = motionEvent.getX();
                    this.Q = this.D;
                }
                if (this.O) {
                    ValueAnimator valueAnimator = this.I;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.I = null;
                    }
                    setProgress(this.Q - ((motionEvent.getX() - this.M) / org.telegram.messenger.i0.L(288.0f)));
                }
            }
            return true;
        }
        if (this.O) {
            this.R.computeCurrentVelocity(1000);
            settle(this.R.getXVelocity());
        } else if (motionEvent.getActionMasked() == 1 && motionEvent.getX() < getWidth() - (org.telegram.messenger.i0.L(288.0f) * this.D)) {
            b();
        }
        this.O = false;
        this.P = false;
        this.R.recycle();
        this.R = null;
        return true;
    }

    public void setCurrentTopic(long j10) {
        this.J = j10;
        this.w.f();
    }

    public void setMenuAvailable(boolean z10) {
        ImageView imageView = this.r;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    public void setProgress(float f7) {
        this.D = Utilities.l(f7);
        this.h.setTranslationX((1.0f - this.D) * org.telegram.messenger.i0.L(288.0f));
        FrameLayout frameLayout = this.n;
        if (frameLayout != null) {
            frameLayout.setAlpha(this.D);
            frameLayout.setScaleX(org.telegram.messenger.i0.T1(0.6f, 1.0f, this.D));
            frameLayout.setScaleY(org.telegram.messenger.i0.T1(0.6f, 1.0f, this.D));
        }
        setVisibility((this.D > 0.0f || this.L) ? 0 : 8);
        invalidate();
        org.telegram.ui.al alVar = this.f;
        if (alVar != null) {
            alVar.a.l1.invalidate();
        }
    }

    public void settle(float f7) {
        boolean z10 = false;
        if (Math.abs(f7) <= org.telegram.messenger.i0.L(300.0f) ? this.D > 0.5f : f7 < 0.0f) {
            z10 = true;
        }
        if (z10) {
            f();
        }
        a(z10 ? 1.0f : 0.0f, f7);
        if (z10) {
            return;
        }
        org.telegram.messenger.i0.v1(this.x);
    }
}
