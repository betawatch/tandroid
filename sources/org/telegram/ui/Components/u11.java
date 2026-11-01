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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class u11 extends FrameLayout implements org.telegram.messenger.vs {
    public static final /* synthetic */ int e0 = 0;
    public final FrameLayout D;
    public final View E;
    public final View F;
    public int G;
    public int H;
    public int I;
    public ValueAnimator J;
    public long K;
    public String L;
    public final ArrayList M;
    public int N;
    public hi0 O;
    public boolean P;
    public float Q;
    public float R;
    public boolean S;
    public boolean T;
    public float U;
    public VelocityTracker V;
    public final HashMap W;
    public final int a;
    public final TextPaint a0;
    public final long b;
    public final TextPaint b0;
    public final boolean c;
    public final TextPaint c0;
    public final boolean d;
    public final TextPaint d0;
    public final org.telegram.ui.ActionBar.p6 e;
    public final org.telegram.ui.al f;
    public final org.telegram.ui.Cells.a5 h;
    public final ImageView n;
    public final uk0 r;
    public final r11 s;
    public final EditText w;
    public final Paint x;
    public float y;

    /* JADX WARN: Removed duplicated region for block: B:10:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x04c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public u11(Activity activity, int i10, long j10, org.telegram.ui.ActionBar.p6 p6Var, final org.telegram.ui.al alVar) {
        super(activity);
        boolean z10;
        boolean z11;
        String L0;
        String str;
        String H;
        PorterDuff.Mode mode;
        int w02;
        this.x = new Paint();
        this.G = -1;
        this.I = org.telegram.messenger.i0.L(288.0f);
        this.L = "";
        this.M = new ArrayList();
        this.W = new HashMap();
        TextPaint textPaint = new TextPaint(1);
        this.a0 = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.b0 = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.c0 = textPaint3;
        TextPaint textPaint4 = new TextPaint(1);
        this.d0 = textPaint4;
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
        TLRPC.Chat L02 = org.telegram.messenger.wp.r1(i10).L0(Long.valueOf(-j10));
        boolean p02 = org.telegram.messenger.w3.p0(L02);
        this.c = p02;
        boolean z12 = j10 == org.telegram.messenger.e20.i(i10).e();
        this.d = z12;
        setWillNotDraw(false);
        org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(activity, 26);
        this.h = a5Var;
        a5Var.setElevation(org.telegram.messenger.i0.L(9.0f));
        a5Var.setOutlineProvider(new bi.d2(16));
        a5Var.setClipToOutline(true);
        a5Var.setOnTouchListener(new org.telegram.ui.ActionBar.n2(24));
        addView(a5Var, w7.b6.e(org.telegram.messenger.at.L4, -1, 53));
        int i11 = org.telegram.messenger.i0.m;
        org.telegram.messenger.wp r12 = org.telegram.messenger.wp.r1(i10);
        g9 g9Var = new g9(activity);
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(20.0f));
        String str2 = "";
        r8 r8Var = new r8((org.telegram.ui.ActionBar.p6) null);
        if (z12) {
            r8Var.g(1);
            r8Var.p = 0.75f;
            g9Var.setImageDrawable(r8Var);
            str2 = org.telegram.messenger.dd.L0(2131745918, null);
            z10 = p02;
            H = org.telegram.messenger.dd.G(r12.F1().j.size(), "Chats", new Object[0]);
            z11 = z12;
        } else {
            z10 = p02;
            if (z10) {
                z11 = z12;
                TLRPC.Chat L03 = L02 != null ? r12.L0(Long.valueOf(L02.linked_monoforum_id)) : null;
                L03 = L03 == null ? L02 : L03;
                if (L03 != null) {
                    r8Var.q(L03);
                    g9Var.e(L03, r8Var);
                    str2 = L03.title;
                }
                L0 = org.telegram.messenger.dd.L0(2131744008, null);
            } else {
                z11 = z12;
                if (L02 != null) {
                    r8Var.q(L02);
                    g9Var.e(L02, r8Var);
                    str = L02.title;
                    TLRPC.ChatFull M0 = r12.M0(L02.id);
                    int i12 = (M0 == null || (i12 = M0.participants_count) <= 0) ? L02.participants_count : i12;
                    H = i12 > 0 ? org.telegram.messenger.dd.H(',', "Members", i12) : org.telegram.messenger.dd.L0(2131744019, null);
                    jg.l0 l0Var = new jg.l0(activity, 28);
                    int i13 = org.telegram.ui.ActionBar.t6.G6;
                    boolean z13 = z11;
                    l0Var.setBackground(org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.r1(0.06f, org.telegram.ui.ActionBar.t6.w0(i13, p6Var)), 24, 24));
                    final int i14 = 0;
                    l0Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.n11
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i15 = i14;
                            org.telegram.ui.al alVar2 = alVar;
                            switch (i15) {
                                case 0:
                                    org.telegram.ui.un unVar = alVar2.a;
                                    unVar.m0.c();
                                    if (unVar.S9()) {
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("dialog_id", unVar.getUserConfig().e());
                                        unVar.presentFragment(new n90(bundle, null));
                                        break;
                                    } else if (org.telegram.messenger.w3.p0(unVar.e)) {
                                        unVar.presentFragment(ProfileActivity.A4(-unVar.e.linked_monoforum_id));
                                        break;
                                    } else {
                                        TLRPC.Chat chat = unVar.e;
                                        if (chat != null) {
                                            unVar.presentFragment(ProfileActivity.A4(-chat.id));
                                            break;
                                        } else {
                                            TLRPC.User user = unVar.f;
                                            if (user != null) {
                                                unVar.presentFragment(ProfileActivity.A4(user.id));
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                default:
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
                                        boolean z14 = true;
                                        for (int i16 = 0; i16 < popupLayout.getItemsCount(); i16++) {
                                            View childAt = popupLayout.L.getChildAt(i16);
                                            if (childAt != null && childAt.getVisibility() == 0) {
                                                if (childAt instanceof org.telegram.ui.ActionBar.h1) {
                                                    if (!z14) {
                                                        I.k();
                                                        z14 = true;
                                                    }
                                                } else if (childAt instanceof org.telegram.ui.ActionBar.b1) {
                                                    org.telegram.ui.ActionBar.b1 b1Var = (org.telegram.ui.ActionBar.b1) childAt;
                                                    CharSequence text = b1Var.getTextView().getText();
                                                    Drawable drawable = b1Var.getIconResId() == 0 ? b1Var.getImageView().getDrawable() : null;
                                                    Drawable ci0Var = ((b1Var.getTag() instanceof Integer) && ((Integer) b1Var.getTag()).intValue() == 29) ? new ci0(R.raw.boosts, org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(24.0f)) : (drawable == null || drawable.getConstantState() == null) ? null : drawable.getConstantState().newDrawable().mutate();
                                                    org.telegram.ui.ActionBar.r0 r0Var = unVar2.s1;
                                                    if (r0Var == null || b1Var != r0Var.j) {
                                                        if (b1Var.getTag() instanceof Integer) {
                                                            int intValue = ((Integer) b1Var.getTag()).intValue();
                                                            Drawable drawable2 = ci0Var;
                                                            I.b(b1Var.getIconResId(), drawable2, text, org.telegram.ui.ActionBar.t6.F8, org.telegram.ui.ActionBar.t6.E8, new org.telegram.ui.cf(unVar2, intValue, 4));
                                                            if (drawable2 instanceof ci0) {
                                                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) I.A;
                                                                View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
                                                                if (childAt2 instanceof org.telegram.ui.ActionBar.b1) {
                                                                    org.telegram.ui.ActionBar.b1 b1Var2 = (org.telegram.ui.ActionBar.b1) childAt2;
                                                                    if (b1Var2.getImageView() instanceof fi0) {
                                                                        fi0 fi0Var = (fi0) b1Var2.getImageView();
                                                                        fi0Var.setAnimation((ci0) drawable2);
                                                                        fi0Var.d();
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            I.b(b1Var.getIconResId(), ci0Var, text, org.telegram.ui.ActionBar.t6.F8, org.telegram.ui.ActionBar.t6.E8, new org.telegram.ui.qr0(b1Var, 26));
                                                        }
                                                    } else if (unVar2.getMessagesController().q2(unVar2.j6, unVar2.b(), null)) {
                                                        I.c(b1Var.getIconResId(), text, new org.telegram.ui.nf(unVar2, 15), false);
                                                    } else {
                                                        I.c(b1Var.getIconResId(), text, new org.telegram.ui.h0(24, unVar2, I), false);
                                                    }
                                                    z14 = false;
                                                }
                                            }
                                        }
                                        I.V(5);
                                        I.a0(0.0f, -view.getHeight());
                                        I.Z();
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
                    int w03 = org.telegram.ui.ActionBar.t6.w0(i13, p6Var);
                    mode = PorterDuff.Mode.SRC_IN;
                    imageView.setColorFilter(new PorterDuffColorFilter(w03, mode));
                    final int i15 = 1;
                    imageView.setBackground(org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.r1(0.06f, org.telegram.ui.ActionBar.t6.w0(i13, p6Var)), 1, -1));
                    imageView.setContentDescription(org.telegram.messenger.dd.L0(2131754839, null));
                    imageView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.n11
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i152 = i15;
                            org.telegram.ui.al alVar2 = alVar;
                            switch (i152) {
                                case 0:
                                    org.telegram.ui.un unVar = alVar2.a;
                                    unVar.m0.c();
                                    if (unVar.S9()) {
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("dialog_id", unVar.getUserConfig().e());
                                        unVar.presentFragment(new n90(bundle, null));
                                        break;
                                    } else if (org.telegram.messenger.w3.p0(unVar.e)) {
                                        unVar.presentFragment(ProfileActivity.A4(-unVar.e.linked_monoforum_id));
                                        break;
                                    } else {
                                        TLRPC.Chat chat = unVar.e;
                                        if (chat != null) {
                                            unVar.presentFragment(ProfileActivity.A4(-chat.id));
                                            break;
                                        } else {
                                            TLRPC.User user = unVar.f;
                                            if (user != null) {
                                                unVar.presentFragment(ProfileActivity.A4(user.id));
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                default:
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
                                        boolean z14 = true;
                                        for (int i16 = 0; i16 < popupLayout.getItemsCount(); i16++) {
                                            View childAt = popupLayout.L.getChildAt(i16);
                                            if (childAt != null && childAt.getVisibility() == 0) {
                                                if (childAt instanceof org.telegram.ui.ActionBar.h1) {
                                                    if (!z14) {
                                                        I.k();
                                                        z14 = true;
                                                    }
                                                } else if (childAt instanceof org.telegram.ui.ActionBar.b1) {
                                                    org.telegram.ui.ActionBar.b1 b1Var = (org.telegram.ui.ActionBar.b1) childAt;
                                                    CharSequence text = b1Var.getTextView().getText();
                                                    Drawable drawable = b1Var.getIconResId() == 0 ? b1Var.getImageView().getDrawable() : null;
                                                    Drawable ci0Var = ((b1Var.getTag() instanceof Integer) && ((Integer) b1Var.getTag()).intValue() == 29) ? new ci0(R.raw.boosts, org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(24.0f)) : (drawable == null || drawable.getConstantState() == null) ? null : drawable.getConstantState().newDrawable().mutate();
                                                    org.telegram.ui.ActionBar.r0 r0Var = unVar2.s1;
                                                    if (r0Var == null || b1Var != r0Var.j) {
                                                        if (b1Var.getTag() instanceof Integer) {
                                                            int intValue = ((Integer) b1Var.getTag()).intValue();
                                                            Drawable drawable2 = ci0Var;
                                                            I.b(b1Var.getIconResId(), drawable2, text, org.telegram.ui.ActionBar.t6.F8, org.telegram.ui.ActionBar.t6.E8, new org.telegram.ui.cf(unVar2, intValue, 4));
                                                            if (drawable2 instanceof ci0) {
                                                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) I.A;
                                                                View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
                                                                if (childAt2 instanceof org.telegram.ui.ActionBar.b1) {
                                                                    org.telegram.ui.ActionBar.b1 b1Var2 = (org.telegram.ui.ActionBar.b1) childAt2;
                                                                    if (b1Var2.getImageView() instanceof fi0) {
                                                                        fi0 fi0Var = (fi0) b1Var2.getImageView();
                                                                        fi0Var.setAnimation((ci0) drawable2);
                                                                        fi0Var.d();
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            I.b(b1Var.getIconResId(), ci0Var, text, org.telegram.ui.ActionBar.t6.F8, org.telegram.ui.ActionBar.t6.E8, new org.telegram.ui.qr0(b1Var, 26));
                                                        }
                                                    } else if (unVar2.getMessagesController().q2(unVar2.j6, unVar2.b(), null)) {
                                                        I.c(b1Var.getIconResId(), text, new org.telegram.ui.nf(unVar2, 15), false);
                                                    } else {
                                                        I.c(b1Var.getIconResId(), text, new org.telegram.ui.h0(24, unVar2, I), false);
                                                    }
                                                    z14 = false;
                                                }
                                            }
                                        }
                                        I.V(5);
                                        I.a0(0.0f, -view.getHeight());
                                        I.Z();
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    a5Var.addView(imageView, w7.b6.f(40.0f, 40, 53, 0, org.telegram.messenger.i0.L(3.0f) + i11, org.telegram.messenger.i0.L(8.0f), 0));
                    this.n = imageView;
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
                    frameLayout.setBackground(new o11(this, L));
                    ImageView imageView2 = new ImageView(activity);
                    imageView2.setScaleType(scaleType);
                    imageView2.setImageResource(R.drawable.outline_header_search);
                    imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.w0(i16, p6Var), mode));
                    frameLayout.addView(imageView2, w7.b6.d(24, 24.0f, 19, 12.0f, 0.0f, 0.0f, 0.0f));
                    EditText editText = new EditText(activity);
                    this.w = editText;
                    editText.setBackground(null);
                    editText.setPadding(0, 0, 0, 0);
                    editText.setTextSize(1, 15.0f);
                    editText.setSingleLine();
                    editText.setImeOptions(268435459);
                    editText.setHint(org.telegram.messenger.dd.L0(2131745853, null));
                    editText.setHintTextColor(org.telegram.ui.ActionBar.t6.w0(i16, p6Var));
                    editText.setTextColor(org.telegram.ui.ActionBar.t6.w0(i13, p6Var));
                    int i17 = 20;
                    editText.addTextChangedListener(new ag.a1(this, i17));
                    frameLayout.addView(editText, w7.b6.d(-1, -1.0f, org.telegram.messenger.at.E1, 48.0f, 0.0f, 12.0f, 0.0f));
                    a5Var.addView(frameLayout, w7.b6.f(48.0f, -1, 51, org.telegram.messenger.i0.L(12.0f) - L, (org.telegram.messenger.i0.L(56.0f) + i11) - L, org.telegram.messenger.i0.L(8.0f) - L, 0));
                    uk0 uk0Var = new uk0(activity, p6Var);
                    this.r = uk0Var;
                    uk0Var.setLayoutManager(new s4.a0());
                    uk0Var.setPadding(0, org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(8.0f));
                    uk0Var.setClipToPadding(false);
                    uk0Var.setVerticalScrollBarEnabled(false);
                    s4.j jVar = new s4.j();
                    jVar.m = false;
                    jVar.C = false;
                    jVar.i = gr.h;
                    jVar.n(350L);
                    uk0Var.setItemAnimator(jVar);
                    uk0Var.setSelectorRadius(org.telegram.messenger.i0.L(16.0f));
                    uk0Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.t6.r1(0.06f, org.telegram.ui.ActionBar.t6.w0(i13, p6Var)));
                    r11 r11Var = new r11(this);
                    this.s = r11Var;
                    uk0Var.setAdapter(r11Var);
                    uk0Var.setOnItemClickListener(new mg.q0(13, this, alVar));
                    uk0Var.setOnItemLongClickListener((jk0) new f2(i17, this, alVar));
                    uk0Var.j(new p11(this, i10, j10));
                    a5Var.addView(uk0Var, w7.b6.f(-1.0f, -1, org.telegram.messenger.at.E1, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(100.0f) + i11, org.telegram.messenger.i0.L(8.0f), 0));
                    int i18 = org.telegram.ui.ActionBar.t6.d6;
                    w02 = org.telegram.ui.ActionBar.t6.w0(i18, p6Var);
                    View view = new View(activity);
                    view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{w02, i0.b.o(w02, 0)}));
                    a5Var.addView(view, w7.b6.f(org.telegram.messenger.i0.L(16.0f), -1, 51, 0, org.telegram.messenger.i0.L(100.0f) + i11, 0, 0));
                    View view2 = new View(activity);
                    this.F = view2;
                    view2.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{w02, i0.b.o(w02, 0)}));
                    a5Var.addView(view2, w7.b6.e(-1, 24, 87));
                    this.E = view;
                    h();
                    TLRPC.User Z1 = j10 <= 0 ? org.telegram.messenger.wp.r1(i10).Z1(Long.valueOf(j10)) : null;
                    if (!z10 && !z13 && ((L02 != null && org.telegram.messenger.w3.w(15, L02)) || org.telegram.messenger.i20.v(Z1))) {
                        FrameLayout frameLayout2 = new FrameLayout(activity);
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setCornerRadius(org.telegram.messenger.i0.L(25.0f));
                        gradientDrawable.setColor(i0.b.o(w02, org.telegram.messenger.at.B3));
                        frameLayout2.setBackground(gradientDrawable);
                        frameLayout2.setElevation(org.telegram.messenger.i0.L(2.0f));
                        frameLayout2.setPadding(org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f));
                        TextView textView3 = new TextView(activity);
                        textView3.setTextSize(1, 14.0f);
                        textView3.setTypeface(org.telegram.messenger.i0.o());
                        int i19 = org.telegram.ui.ActionBar.t6.Gi;
                        textView3.setTextColor(org.telegram.ui.ActionBar.t6.w0(i19, p6Var));
                        textView3.setText(org.telegram.messenger.dd.L0(2131748268, null));
                        textView3.setGravity(17);
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
                        this.D = frameLayout2;
                    }
                    a5Var.setBackgroundColor(org.telegram.ui.ActionBar.t6.w0(i18, p6Var));
                    setProgress(0.0f);
                }
                TLRPC.User Z12 = r12.Z1(Long.valueOf(j10));
                if (Z12 != null) {
                    r8Var.r(Z12);
                    g9Var.e(Z12, r8Var);
                    str2 = org.telegram.messenger.i20.p(Z12);
                }
                L0 = org.telegram.messenger.dd.L0(2131744019, null);
            }
            H = L0;
        }
        str = str2;
        jg.l0 l0Var2 = new jg.l0(activity, 28);
        int i132 = org.telegram.ui.ActionBar.t6.G6;
        boolean z132 = z11;
        l0Var2.setBackground(org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.r1(0.06f, org.telegram.ui.ActionBar.t6.w0(i132, p6Var)), 24, 24));
        final int i142 = 0;
        l0Var2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.n11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i152 = i142;
                org.telegram.ui.al alVar2 = alVar;
                switch (i152) {
                    case 0:
                        org.telegram.ui.un unVar = alVar2.a;
                        unVar.m0.c();
                        if (unVar.S9()) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("dialog_id", unVar.getUserConfig().e());
                            unVar.presentFragment(new n90(bundle, null));
                            break;
                        } else if (org.telegram.messenger.w3.p0(unVar.e)) {
                            unVar.presentFragment(ProfileActivity.A4(-unVar.e.linked_monoforum_id));
                            break;
                        } else {
                            TLRPC.Chat chat = unVar.e;
                            if (chat != null) {
                                unVar.presentFragment(ProfileActivity.A4(-chat.id));
                                break;
                            } else {
                                TLRPC.User user = unVar.f;
                                if (user != null) {
                                    unVar.presentFragment(ProfileActivity.A4(user.id));
                                    break;
                                }
                            }
                        }
                        break;
                    default:
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
                            boolean z14 = true;
                            for (int i162 = 0; i162 < popupLayout.getItemsCount(); i162++) {
                                View childAt = popupLayout.L.getChildAt(i162);
                                if (childAt != null && childAt.getVisibility() == 0) {
                                    if (childAt instanceof org.telegram.ui.ActionBar.h1) {
                                        if (!z14) {
                                            I.k();
                                            z14 = true;
                                        }
                                    } else if (childAt instanceof org.telegram.ui.ActionBar.b1) {
                                        org.telegram.ui.ActionBar.b1 b1Var = (org.telegram.ui.ActionBar.b1) childAt;
                                        CharSequence text = b1Var.getTextView().getText();
                                        Drawable drawable = b1Var.getIconResId() == 0 ? b1Var.getImageView().getDrawable() : null;
                                        Drawable ci0Var = ((b1Var.getTag() instanceof Integer) && ((Integer) b1Var.getTag()).intValue() == 29) ? new ci0(R.raw.boosts, org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(24.0f)) : (drawable == null || drawable.getConstantState() == null) ? null : drawable.getConstantState().newDrawable().mutate();
                                        org.telegram.ui.ActionBar.r0 r0Var = unVar2.s1;
                                        if (r0Var == null || b1Var != r0Var.j) {
                                            if (b1Var.getTag() instanceof Integer) {
                                                int intValue = ((Integer) b1Var.getTag()).intValue();
                                                Drawable drawable2 = ci0Var;
                                                I.b(b1Var.getIconResId(), drawable2, text, org.telegram.ui.ActionBar.t6.F8, org.telegram.ui.ActionBar.t6.E8, new org.telegram.ui.cf(unVar2, intValue, 4));
                                                if (drawable2 instanceof ci0) {
                                                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) I.A;
                                                    View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
                                                    if (childAt2 instanceof org.telegram.ui.ActionBar.b1) {
                                                        org.telegram.ui.ActionBar.b1 b1Var2 = (org.telegram.ui.ActionBar.b1) childAt2;
                                                        if (b1Var2.getImageView() instanceof fi0) {
                                                            fi0 fi0Var = (fi0) b1Var2.getImageView();
                                                            fi0Var.setAnimation((ci0) drawable2);
                                                            fi0Var.d();
                                                        }
                                                    }
                                                }
                                            } else {
                                                I.b(b1Var.getIconResId(), ci0Var, text, org.telegram.ui.ActionBar.t6.F8, org.telegram.ui.ActionBar.t6.E8, new org.telegram.ui.qr0(b1Var, 26));
                                            }
                                        } else if (unVar2.getMessagesController().q2(unVar2.j6, unVar2.b(), null)) {
                                            I.c(b1Var.getIconResId(), text, new org.telegram.ui.nf(unVar2, 15), false);
                                        } else {
                                            I.c(b1Var.getIconResId(), text, new org.telegram.ui.h0(24, unVar2, I), false);
                                        }
                                        z14 = false;
                                    }
                                }
                            }
                            I.V(5);
                            I.a0(0.0f, -view3.getHeight());
                            I.Z();
                            break;
                        }
                        break;
                }
            }
        });
        a5Var.addView(l0Var2, w7.b6.f(48.0f, -1, 51, org.telegram.messenger.i0.L(6.0f), i11 - org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(52.0f), 0));
        l0Var2.addView(g9Var, w7.b6.f(40.0f, 40, 51, org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(4.0f), 0, 0));
        ImageView imageView3 = new ImageView(activity);
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType2);
        imageView3.setImageResource(R.drawable.ic_ab_other);
        int w032 = org.telegram.ui.ActionBar.t6.w0(i132, p6Var);
        mode = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(w032, mode));
        final int i152 = 1;
        imageView3.setBackground(org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.r1(0.06f, org.telegram.ui.ActionBar.t6.w0(i132, p6Var)), 1, -1));
        imageView3.setContentDescription(org.telegram.messenger.dd.L0(2131754839, null));
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.n11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i1522 = i152;
                org.telegram.ui.al alVar2 = alVar;
                switch (i1522) {
                    case 0:
                        org.telegram.ui.un unVar = alVar2.a;
                        unVar.m0.c();
                        if (unVar.S9()) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("dialog_id", unVar.getUserConfig().e());
                            unVar.presentFragment(new n90(bundle, null));
                            break;
                        } else if (org.telegram.messenger.w3.p0(unVar.e)) {
                            unVar.presentFragment(ProfileActivity.A4(-unVar.e.linked_monoforum_id));
                            break;
                        } else {
                            TLRPC.Chat chat = unVar.e;
                            if (chat != null) {
                                unVar.presentFragment(ProfileActivity.A4(-chat.id));
                                break;
                            } else {
                                TLRPC.User user = unVar.f;
                                if (user != null) {
                                    unVar.presentFragment(ProfileActivity.A4(user.id));
                                    break;
                                }
                            }
                        }
                        break;
                    default:
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
                            boolean z14 = true;
                            for (int i162 = 0; i162 < popupLayout.getItemsCount(); i162++) {
                                View childAt = popupLayout.L.getChildAt(i162);
                                if (childAt != null && childAt.getVisibility() == 0) {
                                    if (childAt instanceof org.telegram.ui.ActionBar.h1) {
                                        if (!z14) {
                                            I.k();
                                            z14 = true;
                                        }
                                    } else if (childAt instanceof org.telegram.ui.ActionBar.b1) {
                                        org.telegram.ui.ActionBar.b1 b1Var = (org.telegram.ui.ActionBar.b1) childAt;
                                        CharSequence text = b1Var.getTextView().getText();
                                        Drawable drawable = b1Var.getIconResId() == 0 ? b1Var.getImageView().getDrawable() : null;
                                        Drawable ci0Var = ((b1Var.getTag() instanceof Integer) && ((Integer) b1Var.getTag()).intValue() == 29) ? new ci0(R.raw.boosts, org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(24.0f)) : (drawable == null || drawable.getConstantState() == null) ? null : drawable.getConstantState().newDrawable().mutate();
                                        org.telegram.ui.ActionBar.r0 r0Var = unVar2.s1;
                                        if (r0Var == null || b1Var != r0Var.j) {
                                            if (b1Var.getTag() instanceof Integer) {
                                                int intValue = ((Integer) b1Var.getTag()).intValue();
                                                Drawable drawable2 = ci0Var;
                                                I.b(b1Var.getIconResId(), drawable2, text, org.telegram.ui.ActionBar.t6.F8, org.telegram.ui.ActionBar.t6.E8, new org.telegram.ui.cf(unVar2, intValue, 4));
                                                if (drawable2 instanceof ci0) {
                                                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) I.A;
                                                    View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
                                                    if (childAt2 instanceof org.telegram.ui.ActionBar.b1) {
                                                        org.telegram.ui.ActionBar.b1 b1Var2 = (org.telegram.ui.ActionBar.b1) childAt2;
                                                        if (b1Var2.getImageView() instanceof fi0) {
                                                            fi0 fi0Var = (fi0) b1Var2.getImageView();
                                                            fi0Var.setAnimation((ci0) drawable2);
                                                            fi0Var.d();
                                                        }
                                                    }
                                                }
                                            } else {
                                                I.b(b1Var.getIconResId(), ci0Var, text, org.telegram.ui.ActionBar.t6.F8, org.telegram.ui.ActionBar.t6.E8, new org.telegram.ui.qr0(b1Var, 26));
                                            }
                                        } else if (unVar2.getMessagesController().q2(unVar2.j6, unVar2.b(), null)) {
                                            I.c(b1Var.getIconResId(), text, new org.telegram.ui.nf(unVar2, 15), false);
                                        } else {
                                            I.c(b1Var.getIconResId(), text, new org.telegram.ui.h0(24, unVar2, I), false);
                                        }
                                        z14 = false;
                                    }
                                }
                            }
                            I.V(5);
                            I.a0(0.0f, -view3.getHeight());
                            I.Z();
                            break;
                        }
                        break;
                }
            }
        });
        a5Var.addView(imageView3, w7.b6.f(40.0f, 40, 53, 0, org.telegram.messenger.i0.L(3.0f) + i11, org.telegram.messenger.i0.L(8.0f), 0));
        this.n = imageView3;
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
        FrameLayout frameLayout3 = new FrameLayout(activity);
        int L2 = org.telegram.messenger.i0.L(4.0f);
        frameLayout3.setPadding(L2, L2, L2, L2);
        frameLayout3.setBackground(new o11(this, L2));
        ImageView imageView22 = new ImageView(activity);
        imageView22.setScaleType(scaleType2);
        imageView22.setImageResource(R.drawable.outline_header_search);
        imageView22.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.w0(i162, p6Var), mode));
        frameLayout3.addView(imageView22, w7.b6.d(24, 24.0f, 19, 12.0f, 0.0f, 0.0f, 0.0f));
        EditText editText2 = new EditText(activity);
        this.w = editText2;
        editText2.setBackground(null);
        editText2.setPadding(0, 0, 0, 0);
        editText2.setTextSize(1, 15.0f);
        editText2.setSingleLine();
        editText2.setImeOptions(268435459);
        editText2.setHint(org.telegram.messenger.dd.L0(2131745853, null));
        editText2.setHintTextColor(org.telegram.ui.ActionBar.t6.w0(i162, p6Var));
        editText2.setTextColor(org.telegram.ui.ActionBar.t6.w0(i132, p6Var));
        int i172 = 20;
        editText2.addTextChangedListener(new ag.a1(this, i172));
        frameLayout3.addView(editText2, w7.b6.d(-1, -1.0f, org.telegram.messenger.at.E1, 48.0f, 0.0f, 12.0f, 0.0f));
        a5Var.addView(frameLayout3, w7.b6.f(48.0f, -1, 51, org.telegram.messenger.i0.L(12.0f) - L2, (org.telegram.messenger.i0.L(56.0f) + i11) - L2, org.telegram.messenger.i0.L(8.0f) - L2, 0));
        uk0 uk0Var2 = new uk0(activity, p6Var);
        this.r = uk0Var2;
        uk0Var2.setLayoutManager(new s4.a0());
        uk0Var2.setPadding(0, org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(8.0f));
        uk0Var2.setClipToPadding(false);
        uk0Var2.setVerticalScrollBarEnabled(false);
        s4.j jVar2 = new s4.j();
        jVar2.m = false;
        jVar2.C = false;
        jVar2.i = gr.h;
        jVar2.n(350L);
        uk0Var2.setItemAnimator(jVar2);
        uk0Var2.setSelectorRadius(org.telegram.messenger.i0.L(16.0f));
        uk0Var2.setSelectorDrawableColor(org.telegram.ui.ActionBar.t6.r1(0.06f, org.telegram.ui.ActionBar.t6.w0(i132, p6Var)));
        r11 r11Var2 = new r11(this);
        this.s = r11Var2;
        uk0Var2.setAdapter(r11Var2);
        uk0Var2.setOnItemClickListener(new mg.q0(13, this, alVar));
        uk0Var2.setOnItemLongClickListener((jk0) new f2(i172, this, alVar));
        uk0Var2.j(new p11(this, i10, j10));
        a5Var.addView(uk0Var2, w7.b6.f(-1.0f, -1, org.telegram.messenger.at.E1, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(100.0f) + i11, org.telegram.messenger.i0.L(8.0f), 0));
        int i182 = org.telegram.ui.ActionBar.t6.d6;
        w02 = org.telegram.ui.ActionBar.t6.w0(i182, p6Var);
        View view3 = new View(activity);
        view3.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{w02, i0.b.o(w02, 0)}));
        a5Var.addView(view3, w7.b6.f(org.telegram.messenger.i0.L(16.0f), -1, 51, 0, org.telegram.messenger.i0.L(100.0f) + i11, 0, 0));
        View view22 = new View(activity);
        this.F = view22;
        view22.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{w02, i0.b.o(w02, 0)}));
        a5Var.addView(view22, w7.b6.e(-1, 24, 87));
        this.E = view3;
        h();
        if (j10 <= 0) {
        }
        if (!z10) {
            FrameLayout frameLayout22 = new FrameLayout(activity);
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setCornerRadius(org.telegram.messenger.i0.L(25.0f));
            gradientDrawable2.setColor(i0.b.o(w02, org.telegram.messenger.at.B3));
            frameLayout22.setBackground(gradientDrawable2);
            frameLayout22.setElevation(org.telegram.messenger.i0.L(2.0f));
            frameLayout22.setPadding(org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f));
            TextView textView32 = new TextView(activity);
            textView32.setTextSize(1, 14.0f);
            textView32.setTypeface(org.telegram.messenger.i0.o());
            int i192 = org.telegram.ui.ActionBar.t6.Gi;
            textView32.setTextColor(org.telegram.ui.ActionBar.t6.w0(i192, p6Var));
            textView32.setText(org.telegram.messenger.dd.L0(2131748268, null));
            textView32.setGravity(17);
            textView32.setPadding(org.telegram.messenger.i0.L(20.0f), 0, org.telegram.messenger.i0.L(22.0f), 0);
            textView32.setCompoundDrawablePadding(org.telegram.messenger.i0.L(8.0f));
            Drawable mutate2 = activity.getDrawable(R.drawable.filled_topic_new_24).mutate();
            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.w0(i192, p6Var), mode));
            textView32.setCompoundDrawablesWithIntrinsicBounds(mutate2, (Drawable) null, (Drawable) null, (Drawable) null);
            textView32.setBackground(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(22.0f), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, p6Var)));
            w7.e6.a(textView32);
            textView32.setOnClickListener(new sr(18, this, alVar));
            frameLayout22.addView(textView32, w7.b6.c(44.0f, -2));
            a5Var.addView(frameLayout22, w7.b6.d(-2, 50.0f, 81, 0.0f, 0.0f, 0.0f, 8.0f));
            this.D = frameLayout22;
        }
        a5Var.setBackgroundColor(org.telegram.ui.ActionBar.t6.w0(i182, p6Var));
        setProgress(0.0f);
    }

    private int getPanelWidth() {
        return this.I + this.H;
    }

    public final void a(float f7, float f10) {
        ValueAnimator valueAnimator = this.J;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.J = null;
        }
        float f11 = this.y;
        if (f11 == f7) {
            setProgress(f7);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f7);
        this.J = ofFloat;
        ofFloat.addUpdateListener(new r60(this, 27));
        this.J.addListener(new q11(this, 0));
        this.J.setDuration(Math.abs(f10) > ((float) org.telegram.messenger.i0.L(300.0f)) ? (long) Math.max(150.0f, Math.min(320.0f, ((Math.abs(f7 - this.y) * getPanelWidth()) / Math.abs(f10)) * 1000.0f * 2.0f)) : 320L);
        this.J.setInterpolator(gr.h);
        this.J.start();
    }

    public final void b() {
        hi0 hi0Var = this.O;
        if (hi0Var != null) {
            org.telegram.messenger.i0.r(hi0Var);
            this.O = null;
        }
        if (this.N != 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.N, true);
            this.N = 0;
        }
    }

    public final void c() {
        a(0.0f, 0.0f);
        org.telegram.messenger.i0.v1(this.w);
    }

    public final TLObject d(s11 s11Var) {
        long o10;
        org.telegram.messenger.wp r12 = org.telegram.messenger.wp.r1(this.a);
        org.telegram.messenger.gw gwVar = s11Var.b;
        if (gwVar != null) {
            o10 = gwVar.a;
        } else {
            TLRPC.TL_forumTopic tL_forumTopic = s11Var.a;
            if (tL_forumTopic == null || !this.c) {
                return null;
            }
            o10 = org.telegram.messenger.o5.o(tL_forumTopic.from_id);
        }
        return o10 >= 0 ? r12.Z1(Long.valueOf(o10)) : r12.L0(Long.valueOf(-o10));
    }

    @Override // org.telegram.messenger.vs
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.at.q5) {
            if (((Long) objArr[0]).longValue() == (-this.b)) {
                g();
            }
        } else {
            if (i10 == org.telegram.messenger.at.r) {
                g();
                return;
            }
            if (i10 == org.telegram.messenger.at.g3) {
                if (this.d) {
                    g();
                }
            } else if (i10 == org.telegram.messenger.at.i4) {
                org.telegram.messenger.i0.d0(this.r, new ag.z0(2));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int r12 = org.telegram.ui.ActionBar.t6.r1(this.y, 687865856);
        Paint paint = this.x;
        paint.setColor(r12);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        org.telegram.ui.al alVar = this.f;
        if (alVar != null && this.y > 0.0f) {
            org.telegram.ui.un.L2(alVar.a, canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.P = true;
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (actionMasked != 1 && actionMasked != 3) {
            return dispatchTouchEvent;
        }
        this.P = false;
        setVisibility(this.y <= 0.0f ? 8 : 0);
        return dispatchTouchEvent;
    }

    public final String e(long j10) {
        int i10 = this.a;
        org.telegram.messenger.wp r12 = org.telegram.messenger.wp.r1(i10);
        if (j10 == org.telegram.messenger.e20.i(i10).e()) {
            return org.telegram.messenger.dd.L0(2131748318, null);
        }
        if (j10 == 2666000) {
            return org.telegram.messenger.dd.L0(2131754252, null);
        }
        if (j10 >= 0) {
            return org.telegram.messenger.i20.p(r12.Z1(Long.valueOf(j10)));
        }
        TLRPC.Chat L0 = r12.L0(Long.valueOf(-j10));
        return L0 != null ? L0.title : "";
    }

    public final boolean f(s11 s11Var) {
        String str;
        org.telegram.messenger.gw gwVar = s11Var.b;
        String str2 = "";
        if (gwVar != null) {
            String e = e(gwVar.a);
            if (e != null) {
                str2 = e.toString();
            }
        } else {
            TLObject d = d(s11Var);
            if (d instanceof TLRPC.User) {
                str2 = org.telegram.messenger.i20.p((TLRPC.User) d);
            } else if (d instanceof TLRPC.Chat) {
                str2 = ((TLRPC.Chat) d).title;
            } else {
                TLRPC.TL_forumTopic tL_forumTopic = s11Var.a;
                if (tL_forumTopic != null && (str = tL_forumTopic.title) != null) {
                    str2 = str;
                }
            }
        }
        return str2.toLowerCase().contains(this.L);
    }

    public final void g() {
        int visibility = getVisibility();
        r11 r11Var = this.s;
        if (visibility == 0 || this.y > 0.0f || r11Var.c.size() <= 0) {
            ArrayList arrayList = r11Var.c;
            String str = r11Var.d;
            u11 u11Var = r11Var.e;
            String str2 = u11Var.L;
            int i10 = u11Var.a;
            int i11 = 0;
            boolean z10 = TextUtils.equals(str, str2) && u11Var.y > 0.0f && !arrayList.isEmpty();
            r11Var.d = u11Var.L;
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            if (TextUtils.isEmpty(u11Var.L)) {
                arrayList.add(new s11(u11Var));
            }
            if (u11Var.d) {
                ArrayList arrayList3 = org.telegram.messenger.wp.r1(i10).F1().j;
                int size = arrayList3.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList3.get(i12);
                    i12++;
                    s11 s11Var = new s11(u11Var);
                    s11Var.b = (org.telegram.messenger.gw) obj;
                    if (!TextUtils.isEmpty(u11Var.L) && !u11Var.f(s11Var)) {
                        TLObject d = u11Var.d(s11Var);
                        String n10 = d instanceof TLRPC.User ? org.telegram.messenger.i20.n((TLRPC.User) d) : d instanceof TLRPC.Chat ? org.telegram.messenger.w3.K((TLRPC.Chat) d, false) : null;
                        if (n10 != null && n10.toLowerCase().contains(u11Var.L)) {
                        }
                    }
                    arrayList.add(s11Var);
                }
                if (z10) {
                    s4.n.c(new hg.a(r11Var, arrayList2, 3), true).c(r11Var);
                    return;
                } else {
                    r11Var.f();
                    return;
                }
            }
            HashSet hashSet = new HashSet();
            ArrayList l4 = org.telegram.messenger.wp.r1(i10).r7.l(-u11Var.b);
            if (l4 != null) {
                int size2 = l4.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj2 = l4.get(i13);
                    i13++;
                    s11 s11Var2 = new s11(u11Var);
                    s11Var2.a = (TLRPC.TL_forumTopic) obj2;
                    if (!TextUtils.isEmpty(u11Var.L) && !u11Var.f(s11Var2)) {
                        TLObject d10 = u11Var.d(s11Var2);
                        String n11 = d10 instanceof TLRPC.User ? org.telegram.messenger.i20.n((TLRPC.User) d10) : d10 instanceof TLRPC.Chat ? org.telegram.messenger.w3.K((TLRPC.Chat) d10, false) : null;
                        if (n11 != null && n11.toLowerCase().contains(u11Var.L)) {
                        }
                    }
                    arrayList.add(s11Var2);
                    hashSet.add(Long.valueOf(s11Var2.a()));
                }
            }
            if (!TextUtils.isEmpty(u11Var.L)) {
                ArrayList arrayList4 = u11Var.M;
                int size3 = arrayList4.size();
                while (i11 < size3) {
                    Object obj3 = arrayList4.get(i11);
                    i11++;
                    s11 s11Var3 = new s11(u11Var);
                    s11Var3.a = (TLRPC.TL_forumTopic) obj3;
                    if (hashSet.add(Long.valueOf(s11Var3.a()))) {
                        arrayList.add(s11Var3);
                    }
                }
            }
            if (z10) {
                s4.n.c(new hg.a(r11Var, arrayList2, 3), true).c(r11Var);
            } else {
                r11Var.f();
            }
        }
    }

    public int getContentWidth() {
        return this.I;
    }

    public float getProgress() {
        return this.y;
    }

    public final void h() {
        View view;
        View view2 = this.E;
        if (view2 == null || (view = this.F) == null) {
            return;
        }
        uk0 uk0Var = this.r;
        view2.setAlpha(Utilities.i(uk0Var.computeVerticalScrollOffset() / org.telegram.messenger.i0.L(16.0f), 1.0f, 0.0f));
        if (this.D != null) {
            view.setAlpha(1.0f);
        } else {
            view.setAlpha(Utilities.i(((uk0Var.computeVerticalScrollRange() - uk0Var.computeVerticalScrollOffset()) - uk0Var.computeVerticalScrollExtent()) / org.telegram.messenger.i0.L(16.0f), 1.0f, 0.0f));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.a;
        org.telegram.messenger.at.f(i10).b(this, org.telegram.messenger.at.q5);
        org.telegram.messenger.at.f(i10).b(this, org.telegram.messenger.at.r);
        org.telegram.messenger.at.f(i10).b(this, org.telegram.messenger.at.g3);
        org.telegram.messenger.at.e().b(this, org.telegram.messenger.at.i4);
        g();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.a;
        org.telegram.messenger.at.f(i10).n(this, org.telegram.messenger.at.q5);
        org.telegram.messenger.at.f(i10).n(this, org.telegram.messenger.at.r);
        org.telegram.messenger.at.f(i10).n(this, org.telegram.messenger.at.g3);
        org.telegram.messenger.at.e().n(this, org.telegram.messenger.at.i4);
        b();
        ValueAnimator valueAnimator = this.J;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.Q = motionEvent.getX();
            this.R = motionEvent.getY();
            this.S = false;
            this.T = true;
            this.U = this.y;
            VelocityTracker velocityTracker = this.V;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            VelocityTracker obtain = VelocityTracker.obtain();
            this.V = obtain;
            obtain.addMovement(motionEvent);
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && this.T) {
            VelocityTracker velocityTracker2 = this.V;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            float x10 = motionEvent.getX() - this.Q;
            float y3 = motionEvent.getY() - this.R;
            if (x10 > ViewConfiguration.get(getContext()).getScaledTouchSlop() && Math.abs(x10) > Math.abs(y3) * 1.5f) {
                this.S = true;
                this.Q = motionEvent.getX();
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
        if (i14 != this.G) {
            this.G = i14;
            uk0 uk0Var = this.r;
            View view = this.F;
            FrameLayout frameLayout = this.D;
            if (frameLayout != null) {
                ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).bottomMargin = org.telegram.messenger.i0.L(8.0f) + i14;
                view.getLayoutParams().height = org.telegram.messenger.i0.L(64.0f) + i14;
                uk0Var.setPadding(0, org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(66.0f) + i14);
            } else {
                view.getLayoutParams().height = org.telegram.messenger.i0.L(24.0f) + i14;
                uk0Var.setPadding(0, org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(8.0f) + i14);
            }
            this.h.requestLayout();
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.un unVar;
        org.telegram.ui.ActionBar.t0 j92;
        org.telegram.ui.ActionBar.l lVar;
        WeakHashMap weakHashMap = r0.h0.a;
        r0.j1 a2 = r0.a0.a(this);
        int i12 = 0;
        int i13 = a2 != null ? org.telegram.messenger.i0.I0(a2, false).c : 0;
        int i14 = this.H;
        org.telegram.ui.Cells.a5 a5Var = this.h;
        if (i13 != i14) {
            this.H = i13;
            a5Var.getLayoutParams().width = getPanelWidth();
            a5Var.setPadding(0, 0, i13, 0);
            a5Var.setTranslationX((1.0f - this.y) * getPanelWidth());
        }
        int size = View.MeasureSpec.getSize(i10);
        org.telegram.ui.al alVar = this.f;
        if (alVar != null && (j92 = (unVar = alVar.a).j9()) != null) {
            View view = (View) j92.getParent();
            lVar = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
            i12 = (int) ((lVar.getWidth() - ((j92.getWidth() / 2.0f) + (j92.getX() + view.getX()))) + org.telegram.messenger.i0.L(31.0f));
        }
        int max = Math.max(org.telegram.messenger.i0.L(200.0f), Math.min(org.telegram.messenger.i0.L(288.0f), (size - this.H) - i12));
        if (max != this.I) {
            this.I = max;
            a5Var.getLayoutParams().width = getPanelWidth();
            a5Var.setTranslationX((1.0f - this.y) * getPanelWidth());
            this.s.f();
        }
        super.onMeasure(i10, i11);
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
        if (this.V == null) {
            this.V = VelocityTracker.obtain();
        }
        this.V.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.Q = motionEvent.getX();
            this.R = motionEvent.getY();
            this.S = false;
            this.U = this.y;
            return true;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                float x10 = motionEvent.getX() - this.Q;
                if (!this.S && Math.abs(x10) > ViewConfiguration.get(getContext()).getScaledTouchSlop()) {
                    this.S = true;
                    this.Q = motionEvent.getX();
                    this.U = this.y;
                }
                if (this.S) {
                    ValueAnimator valueAnimator = this.J;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.J = null;
                    }
                    setProgress(this.U - ((motionEvent.getX() - this.Q) / this.I));
                }
            }
            return true;
        }
        if (this.S) {
            this.V.computeCurrentVelocity(1000);
            settle(this.V.getXVelocity());
        } else if (motionEvent.getActionMasked() == 1 && motionEvent.getX() < getWidth() - (getPanelWidth() * this.y)) {
            c();
        }
        this.S = false;
        this.T = false;
        this.V.recycle();
        this.V = null;
        return true;
    }

    public void setCurrentTopic(long j10) {
        this.K = j10;
        this.s.f();
    }

    public void setMenuAvailable(boolean z10) {
        ImageView imageView = this.n;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    public void setProgress(float f7) {
        this.y = Utilities.l(f7);
        this.h.setTranslationX((1.0f - this.y) * getPanelWidth());
        setVisibility((this.y > 0.0f || this.P) ? 0 : 8);
        invalidate();
        org.telegram.ui.al alVar = this.f;
        if (alVar != null) {
            alVar.a.l1.invalidate();
        }
    }

    public void settle(float f7) {
        boolean z10 = false;
        if (Math.abs(f7) <= org.telegram.messenger.i0.L(300.0f) ? this.y > 0.5f : f7 < 0.0f) {
            z10 = true;
        }
        if (z10) {
            g();
        }
        a(z10 ? 1.0f : 0.0f, f7);
        if (z10) {
            return;
        }
        org.telegram.messenger.i0.v1(this.w);
    }
}
