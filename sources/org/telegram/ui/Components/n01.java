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

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class n01 extends FrameLayout implements org.telegram.messenger.ls {
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
    public v80 O;
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
    public final org.telegram.ui.ActionBar.f6 e;
    public final org.telegram.ui.dk f;
    public final di.a4 h;
    public final ImageView n;
    public final pj0 r;
    public final k01 s;
    public final EditText w;
    public final Paint x;
    public float y;

    /* JADX WARN: Removed duplicated region for block: B:10:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x04ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n01(Activity activity, int i7, long j3, org.telegram.ui.ActionBar.f6 f6Var, final org.telegram.ui.dk dkVar) {
        super(activity);
        boolean z9;
        boolean z10;
        String M0;
        String str;
        String H;
        PorterDuff.Mode mode;
        int w02;
        this.x = new Paint();
        this.G = -1;
        this.I = org.telegram.messenger.g0.L(288.0f);
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
        textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint3.setTextSize(org.telegram.messenger.g0.L(15.0f));
        textPaint4.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint4.setTypeface(org.telegram.messenger.g0.o());
        this.a = i7;
        this.b = j3;
        this.e = f6Var;
        this.f = dkVar;
        TLRPC.Chat M02 = org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(-j3));
        boolean p02 = org.telegram.messenger.t3.p0(M02);
        this.c = p02;
        boolean z11 = j3 == org.telegram.messenger.p10.i(i7).e();
        this.d = z11;
        setWillNotDraw(false);
        di.a4 a4Var = new di.a4(activity, 22);
        this.h = a4Var;
        a4Var.setElevation(org.telegram.messenger.g0.L(9.0f));
        a4Var.setOutlineProvider(new bg.q0(16));
        a4Var.setClipToOutline(true);
        a4Var.setOnTouchListener(new ei.b(25));
        addView(a4Var, c8.ha.e(org.telegram.messenger.qs.L4, -1, 53));
        int i10 = org.telegram.messenger.g0.m;
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
        l9 l9Var = new l9(activity);
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
        String str2 = "";
        w8 w8Var = new w8((org.telegram.ui.ActionBar.f6) null);
        if (z11) {
            w8Var.g(1);
            w8Var.p = 0.75f;
            l9Var.setImageDrawable(w8Var);
            str2 = org.telegram.messenger.hd.M0(2131745902, null);
            z9 = p02;
            H = org.telegram.messenger.hd.G(s12.G1().j.size(), "Chats", new Object[0]);
            z10 = z11;
        } else {
            z9 = p02;
            if (z9) {
                z10 = z11;
                TLRPC.Chat M03 = M02 != null ? s12.M0(Long.valueOf(M02.linked_monoforum_id)) : null;
                M03 = M03 == null ? M02 : M03;
                if (M03 != null) {
                    w8Var.q(M03);
                    l9Var.e(M03, w8Var);
                    str2 = M03.title;
                }
                M0 = org.telegram.messenger.hd.M0(2131743984, null);
            } else {
                z10 = z11;
                if (M02 != null) {
                    w8Var.q(M02);
                    l9Var.e(M02, w8Var);
                    str = M02.title;
                    TLRPC.ChatFull N0 = s12.N0(M02.id);
                    int i11 = (N0 == null || (i11 = N0.participants_count) <= 0) ? M02.participants_count : i11;
                    H = i11 > 0 ? org.telegram.messenger.hd.H(',', "Members", i11) : org.telegram.messenger.hd.M0(2131743995, null);
                    bi.e5 e5Var = new bi.e5(activity, 29);
                    int i12 = org.telegram.ui.ActionBar.k6.G6;
                    boolean z12 = z10;
                    e5Var.setBackground(org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(i12, f6Var)), 24, 24));
                    final int i13 = 0;
                    e5Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.g01
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i14 = i13;
                            org.telegram.ui.dk dkVar2 = dkVar;
                            switch (i14) {
                                case 0:
                                    org.telegram.ui.an anVar = dkVar2.a;
                                    anVar.m0.c();
                                    if (anVar.X9()) {
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("dialog_id", anVar.getUserConfig().e());
                                        anVar.presentFragment(new u80(bundle, null));
                                        break;
                                    } else if (org.telegram.messenger.t3.p0(anVar.e)) {
                                        anVar.presentFragment(ProfileActivity.A4(-anVar.e.linked_monoforum_id));
                                        break;
                                    } else {
                                        TLRPC.Chat chat = anVar.e;
                                        if (chat != null) {
                                            anVar.presentFragment(ProfileActivity.A4(-chat.id));
                                            break;
                                        } else {
                                            TLRPC.User user = anVar.f;
                                            if (user != null) {
                                                anVar.presentFragment(ProfileActivity.A4(user.id));
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                default:
                                    org.telegram.ui.an anVar2 = dkVar2.a;
                                    org.telegram.ui.ActionBar.r0 r0Var = anVar2.i0;
                                    if (r0Var != null && anVar2.m0 != null) {
                                        r0Var.y();
                                        org.telegram.ui.ActionBar.o0 o0Var = r0Var.Q;
                                        if (o0Var != null) {
                                            o0Var.n();
                                        }
                                        ActionBarPopupWindow$ActionBarPopupWindowLayout popupLayout = anVar2.i0.getPopupLayout();
                                        k60 I = k60.I(anVar2, view);
                                        int i15 = 0;
                                        boolean z13 = true;
                                        for (int i16 = 0; i16 < popupLayout.getItemsCount(); i16++) {
                                            View childAt = popupLayout.L.getChildAt(i16);
                                            if (childAt != null && childAt.getVisibility() == 0) {
                                                if (childAt instanceof org.telegram.ui.ActionBar.d1) {
                                                    if (!z13) {
                                                        I.k();
                                                        z13 = true;
                                                    }
                                                } else if (childAt instanceof org.telegram.ui.ActionBar.z0) {
                                                    org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) childAt;
                                                    CharSequence text = z0Var.getTextView().getText();
                                                    Drawable drawable = z0Var.getIconResId() == 0 ? z0Var.getImageView().getDrawable() : null;
                                                    Drawable zg0Var = ((z0Var.getTag() instanceof Integer) && ((Integer) z0Var.getTag()).intValue() == 29) ? new zg0(R.raw.boosts, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f)) : (drawable == null || drawable.getConstantState() == null) ? null : drawable.getConstantState().newDrawable().mutate();
                                                    org.telegram.ui.ActionBar.p0 p0Var = anVar2.s1;
                                                    if (p0Var == null || z0Var != p0Var.j) {
                                                        if (z0Var.getTag() instanceof Integer) {
                                                            int intValue = ((Integer) z0Var.getTag()).intValue();
                                                            Drawable drawable2 = zg0Var;
                                                            I.b(z0Var.getIconResId(), drawable2, text, org.telegram.ui.ActionBar.k6.F8, org.telegram.ui.ActionBar.k6.E8, new org.telegram.ui.qe(anVar2, intValue, 4));
                                                            if (drawable2 instanceof zg0) {
                                                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) I.A;
                                                                View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
                                                                if (childAt2 instanceof org.telegram.ui.ActionBar.z0) {
                                                                    org.telegram.ui.ActionBar.z0 z0Var2 = (org.telegram.ui.ActionBar.z0) childAt2;
                                                                    if (z0Var2.getImageView() instanceof ch0) {
                                                                        ch0 ch0Var = (ch0) z0Var2.getImageView();
                                                                        ch0Var.setAnimation((zg0) drawable2);
                                                                        ch0Var.d();
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            I.b(z0Var.getIconResId(), zg0Var, text, org.telegram.ui.ActionBar.k6.F8, org.telegram.ui.ActionBar.k6.E8, new org.telegram.ui.fq0(z0Var, 26));
                                                        }
                                                    } else if (anVar2.getMessagesController().r2(anVar2.j6, anVar2.b(), null)) {
                                                        I.c(z0Var.getIconResId(), text, new org.telegram.ui.af(anVar2, 16), false);
                                                    } else {
                                                        I.c(z0Var.getIconResId(), text, new org.telegram.ui.qf(i15, anVar2, I), false);
                                                    }
                                                    z13 = false;
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
                    a4Var.addView(e5Var, c8.ha.f(48.0f, -1, 51, org.telegram.messenger.g0.L(6.0f), i10 - org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(52.0f), 0));
                    e5Var.addView(l9Var, c8.ha.f(40.0f, 40, 51, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(4.0f), 0, 0));
                    ImageView imageView = new ImageView(activity);
                    ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
                    imageView.setScaleType(scaleType);
                    imageView.setImageResource(R.drawable.ic_ab_other);
                    int w03 = org.telegram.ui.ActionBar.k6.w0(i12, f6Var);
                    mode = PorterDuff.Mode.SRC_IN;
                    imageView.setColorFilter(new PorterDuffColorFilter(w03, mode));
                    final int i14 = 1;
                    imageView.setBackground(org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(i12, f6Var)), 1, -1));
                    imageView.setContentDescription(org.telegram.messenger.hd.M0(2131754839, null));
                    imageView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.g01
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i142 = i14;
                            org.telegram.ui.dk dkVar2 = dkVar;
                            switch (i142) {
                                case 0:
                                    org.telegram.ui.an anVar = dkVar2.a;
                                    anVar.m0.c();
                                    if (anVar.X9()) {
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("dialog_id", anVar.getUserConfig().e());
                                        anVar.presentFragment(new u80(bundle, null));
                                        break;
                                    } else if (org.telegram.messenger.t3.p0(anVar.e)) {
                                        anVar.presentFragment(ProfileActivity.A4(-anVar.e.linked_monoforum_id));
                                        break;
                                    } else {
                                        TLRPC.Chat chat = anVar.e;
                                        if (chat != null) {
                                            anVar.presentFragment(ProfileActivity.A4(-chat.id));
                                            break;
                                        } else {
                                            TLRPC.User user = anVar.f;
                                            if (user != null) {
                                                anVar.presentFragment(ProfileActivity.A4(user.id));
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                default:
                                    org.telegram.ui.an anVar2 = dkVar2.a;
                                    org.telegram.ui.ActionBar.r0 r0Var = anVar2.i0;
                                    if (r0Var != null && anVar2.m0 != null) {
                                        r0Var.y();
                                        org.telegram.ui.ActionBar.o0 o0Var = r0Var.Q;
                                        if (o0Var != null) {
                                            o0Var.n();
                                        }
                                        ActionBarPopupWindow$ActionBarPopupWindowLayout popupLayout = anVar2.i0.getPopupLayout();
                                        k60 I = k60.I(anVar2, view);
                                        int i15 = 0;
                                        boolean z13 = true;
                                        for (int i16 = 0; i16 < popupLayout.getItemsCount(); i16++) {
                                            View childAt = popupLayout.L.getChildAt(i16);
                                            if (childAt != null && childAt.getVisibility() == 0) {
                                                if (childAt instanceof org.telegram.ui.ActionBar.d1) {
                                                    if (!z13) {
                                                        I.k();
                                                        z13 = true;
                                                    }
                                                } else if (childAt instanceof org.telegram.ui.ActionBar.z0) {
                                                    org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) childAt;
                                                    CharSequence text = z0Var.getTextView().getText();
                                                    Drawable drawable = z0Var.getIconResId() == 0 ? z0Var.getImageView().getDrawable() : null;
                                                    Drawable zg0Var = ((z0Var.getTag() instanceof Integer) && ((Integer) z0Var.getTag()).intValue() == 29) ? new zg0(R.raw.boosts, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f)) : (drawable == null || drawable.getConstantState() == null) ? null : drawable.getConstantState().newDrawable().mutate();
                                                    org.telegram.ui.ActionBar.p0 p0Var = anVar2.s1;
                                                    if (p0Var == null || z0Var != p0Var.j) {
                                                        if (z0Var.getTag() instanceof Integer) {
                                                            int intValue = ((Integer) z0Var.getTag()).intValue();
                                                            Drawable drawable2 = zg0Var;
                                                            I.b(z0Var.getIconResId(), drawable2, text, org.telegram.ui.ActionBar.k6.F8, org.telegram.ui.ActionBar.k6.E8, new org.telegram.ui.qe(anVar2, intValue, 4));
                                                            if (drawable2 instanceof zg0) {
                                                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) I.A;
                                                                View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
                                                                if (childAt2 instanceof org.telegram.ui.ActionBar.z0) {
                                                                    org.telegram.ui.ActionBar.z0 z0Var2 = (org.telegram.ui.ActionBar.z0) childAt2;
                                                                    if (z0Var2.getImageView() instanceof ch0) {
                                                                        ch0 ch0Var = (ch0) z0Var2.getImageView();
                                                                        ch0Var.setAnimation((zg0) drawable2);
                                                                        ch0Var.d();
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            I.b(z0Var.getIconResId(), zg0Var, text, org.telegram.ui.ActionBar.k6.F8, org.telegram.ui.ActionBar.k6.E8, new org.telegram.ui.fq0(z0Var, 26));
                                                        }
                                                    } else if (anVar2.getMessagesController().r2(anVar2.j6, anVar2.b(), null)) {
                                                        I.c(z0Var.getIconResId(), text, new org.telegram.ui.af(anVar2, 16), false);
                                                    } else {
                                                        I.c(z0Var.getIconResId(), text, new org.telegram.ui.qf(i15, anVar2, I), false);
                                                    }
                                                    z13 = false;
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
                    a4Var.addView(imageView, c8.ha.f(40.0f, 40, 53, 0, org.telegram.messenger.g0.L(3.0f) + i10, org.telegram.messenger.g0.L(8.0f), 0));
                    this.n = imageView;
                    TextView textView = new TextView(activity);
                    textView.setTextSize(1, 16.0f);
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    textView.setSingleLine();
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView.setEllipsize(truncateAt);
                    textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(i12, f6Var));
                    textView.setText(str);
                    textView.setIncludeFontPadding(false);
                    e5Var.addView(textView, c8.ha.f(-2.0f, -1, 51, org.telegram.messenger.g0.L(58.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(6.0f), 0));
                    TextView textView2 = new TextView(activity);
                    textView2.setTextSize(1, 13.0f);
                    textView2.setSingleLine();
                    textView2.setEllipsize(truncateAt);
                    int i15 = org.telegram.ui.ActionBar.k6.y6;
                    textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(i15, f6Var));
                    textView2.setText(H);
                    textView2.setIncludeFontPadding(false);
                    e5Var.addView(textView2, c8.ha.f(-2.0f, -1, 51, org.telegram.messenger.g0.L(58.0f), org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(6.0f), 0));
                    FrameLayout frameLayout = new FrameLayout(activity);
                    int L = org.telegram.messenger.g0.L(4.0f);
                    frameLayout.setPadding(L, L, L, L);
                    frameLayout.setBackground(new h01(this, L));
                    ImageView imageView2 = new ImageView(activity);
                    imageView2.setScaleType(scaleType);
                    imageView2.setImageResource(R.drawable.outline_header_search);
                    imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(i15, f6Var), mode));
                    frameLayout.addView(imageView2, c8.ha.d(24, 24.0f, 19, 12.0f, 0.0f, 0.0f, 0.0f));
                    EditText editText = new EditText(activity);
                    this.w = editText;
                    editText.setBackground(null);
                    editText.setPadding(0, 0, 0, 0);
                    editText.setTextSize(1, 15.0f);
                    editText.setSingleLine();
                    editText.setImeOptions(268435459);
                    editText.setHint(org.telegram.messenger.hd.M0(2131745837, null));
                    editText.setHintTextColor(org.telegram.ui.ActionBar.k6.w0(i15, f6Var));
                    editText.setTextColor(org.telegram.ui.ActionBar.k6.w0(i12, f6Var));
                    editText.addTextChangedListener(new ah.j(this, 25));
                    frameLayout.addView(editText, c8.ha.d(-1, -1.0f, org.telegram.messenger.qs.E1, 48.0f, 0.0f, 12.0f, 0.0f));
                    a4Var.addView(frameLayout, c8.ha.f(48.0f, -1, 51, org.telegram.messenger.g0.L(12.0f) - L, (org.telegram.messenger.g0.L(56.0f) + i10) - L, org.telegram.messenger.g0.L(8.0f) - L, 0));
                    pj0 pj0Var = new pj0(activity, f6Var);
                    this.r = pj0Var;
                    pj0Var.setLayoutManager(new v4.b0());
                    pj0Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(8.0f));
                    pj0Var.setClipToPadding(false);
                    pj0Var.setVerticalScrollBarEnabled(false);
                    v4.k kVar = new v4.k();
                    kVar.m = false;
                    kVar.C = false;
                    kVar.i = xq.h;
                    kVar.n(350L);
                    pj0Var.setItemAnimator(kVar);
                    pj0Var.setSelectorRadius(org.telegram.messenger.g0.L(16.0f));
                    pj0Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(i12, f6Var)));
                    k01 k01Var = new k01(this);
                    this.s = k01Var;
                    pj0Var.setAdapter(k01Var);
                    pj0Var.setOnItemClickListener(new di.p4(14, this, dkVar));
                    pj0Var.setOnItemLongClickListener((dj0) new f2(19, this, dkVar));
                    pj0Var.j(new i01(this, i7, j3));
                    a4Var.addView(pj0Var, c8.ha.f(-1.0f, -1, org.telegram.messenger.qs.E1, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(100.0f) + i10, org.telegram.messenger.g0.L(8.0f), 0));
                    int i16 = org.telegram.ui.ActionBar.k6.d6;
                    w02 = org.telegram.ui.ActionBar.k6.w0(i16, f6Var);
                    View view = new View(activity);
                    view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{w02, i0.a.o(w02, 0)}));
                    a4Var.addView(view, c8.ha.f(org.telegram.messenger.g0.L(16.0f), -1, 51, 0, org.telegram.messenger.g0.L(100.0f) + i10, 0, 0));
                    View view2 = new View(activity);
                    this.F = view2;
                    view2.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{w02, i0.a.o(w02, 0)}));
                    a4Var.addView(view2, c8.ha.e(-1, 24, 87));
                    this.E = view;
                    h();
                    TLRPC.User a22 = j3 <= 0 ? org.telegram.messenger.qp.s1(i7).a2(Long.valueOf(j3)) : null;
                    if (!z9 && !z12 && ((M02 != null && org.telegram.messenger.t3.w(15, M02)) || org.telegram.messenger.t10.v(a22))) {
                        FrameLayout frameLayout2 = new FrameLayout(activity);
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setCornerRadius(org.telegram.messenger.g0.L(25.0f));
                        gradientDrawable.setColor(i0.a.o(w02, org.telegram.messenger.qs.B3));
                        frameLayout2.setBackground(gradientDrawable);
                        frameLayout2.setElevation(org.telegram.messenger.g0.L(2.0f));
                        frameLayout2.setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
                        TextView textView3 = new TextView(activity);
                        textView3.setTextSize(1, 14.0f);
                        textView3.setTypeface(org.telegram.messenger.g0.o());
                        int i17 = org.telegram.ui.ActionBar.k6.Gi;
                        textView3.setTextColor(org.telegram.ui.ActionBar.k6.w0(i17, f6Var));
                        textView3.setText(org.telegram.messenger.hd.M0(2131748250, null));
                        textView3.setGravity(17);
                        textView3.setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
                        textView3.setCompoundDrawablePadding(org.telegram.messenger.g0.L(8.0f));
                        Drawable mutate = activity.getDrawable(R.drawable.filled_topic_new_24).mutate();
                        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(i17, f6Var), mode));
                        textView3.setCompoundDrawablesWithIntrinsicBounds(mutate, (Drawable) null, (Drawable) null, (Drawable) null);
                        textView3.setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(22.0f), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, f6Var)));
                        c8.ka.a(textView3);
                        textView3.setOnClickListener(new lk(25, this, dkVar));
                        frameLayout2.addView(textView3, c8.ha.c(44.0f, -2));
                        a4Var.addView(frameLayout2, c8.ha.d(-2, 50.0f, 81, 0.0f, 0.0f, 0.0f, 8.0f));
                        this.D = frameLayout2;
                    }
                    a4Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(i16, f6Var));
                    setProgress(0.0f);
                }
                TLRPC.User a23 = s12.a2(Long.valueOf(j3));
                if (a23 != null) {
                    w8Var.r(a23);
                    l9Var.e(a23, w8Var);
                    str2 = org.telegram.messenger.t10.p(a23);
                }
                M0 = org.telegram.messenger.hd.M0(2131743995, null);
            }
            H = M0;
        }
        str = str2;
        bi.e5 e5Var2 = new bi.e5(activity, 29);
        int i122 = org.telegram.ui.ActionBar.k6.G6;
        boolean z122 = z10;
        e5Var2.setBackground(org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(i122, f6Var)), 24, 24));
        final int i132 = 0;
        e5Var2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.g01
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i142 = i132;
                org.telegram.ui.dk dkVar2 = dkVar;
                switch (i142) {
                    case 0:
                        org.telegram.ui.an anVar = dkVar2.a;
                        anVar.m0.c();
                        if (anVar.X9()) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("dialog_id", anVar.getUserConfig().e());
                            anVar.presentFragment(new u80(bundle, null));
                            break;
                        } else if (org.telegram.messenger.t3.p0(anVar.e)) {
                            anVar.presentFragment(ProfileActivity.A4(-anVar.e.linked_monoforum_id));
                            break;
                        } else {
                            TLRPC.Chat chat = anVar.e;
                            if (chat != null) {
                                anVar.presentFragment(ProfileActivity.A4(-chat.id));
                                break;
                            } else {
                                TLRPC.User user = anVar.f;
                                if (user != null) {
                                    anVar.presentFragment(ProfileActivity.A4(user.id));
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        org.telegram.ui.an anVar2 = dkVar2.a;
                        org.telegram.ui.ActionBar.r0 r0Var = anVar2.i0;
                        if (r0Var != null && anVar2.m0 != null) {
                            r0Var.y();
                            org.telegram.ui.ActionBar.o0 o0Var = r0Var.Q;
                            if (o0Var != null) {
                                o0Var.n();
                            }
                            ActionBarPopupWindow$ActionBarPopupWindowLayout popupLayout = anVar2.i0.getPopupLayout();
                            k60 I = k60.I(anVar2, view3);
                            int i152 = 0;
                            boolean z13 = true;
                            for (int i162 = 0; i162 < popupLayout.getItemsCount(); i162++) {
                                View childAt = popupLayout.L.getChildAt(i162);
                                if (childAt != null && childAt.getVisibility() == 0) {
                                    if (childAt instanceof org.telegram.ui.ActionBar.d1) {
                                        if (!z13) {
                                            I.k();
                                            z13 = true;
                                        }
                                    } else if (childAt instanceof org.telegram.ui.ActionBar.z0) {
                                        org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) childAt;
                                        CharSequence text = z0Var.getTextView().getText();
                                        Drawable drawable = z0Var.getIconResId() == 0 ? z0Var.getImageView().getDrawable() : null;
                                        Drawable zg0Var = ((z0Var.getTag() instanceof Integer) && ((Integer) z0Var.getTag()).intValue() == 29) ? new zg0(R.raw.boosts, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f)) : (drawable == null || drawable.getConstantState() == null) ? null : drawable.getConstantState().newDrawable().mutate();
                                        org.telegram.ui.ActionBar.p0 p0Var = anVar2.s1;
                                        if (p0Var == null || z0Var != p0Var.j) {
                                            if (z0Var.getTag() instanceof Integer) {
                                                int intValue = ((Integer) z0Var.getTag()).intValue();
                                                Drawable drawable2 = zg0Var;
                                                I.b(z0Var.getIconResId(), drawable2, text, org.telegram.ui.ActionBar.k6.F8, org.telegram.ui.ActionBar.k6.E8, new org.telegram.ui.qe(anVar2, intValue, 4));
                                                if (drawable2 instanceof zg0) {
                                                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) I.A;
                                                    View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
                                                    if (childAt2 instanceof org.telegram.ui.ActionBar.z0) {
                                                        org.telegram.ui.ActionBar.z0 z0Var2 = (org.telegram.ui.ActionBar.z0) childAt2;
                                                        if (z0Var2.getImageView() instanceof ch0) {
                                                            ch0 ch0Var = (ch0) z0Var2.getImageView();
                                                            ch0Var.setAnimation((zg0) drawable2);
                                                            ch0Var.d();
                                                        }
                                                    }
                                                }
                                            } else {
                                                I.b(z0Var.getIconResId(), zg0Var, text, org.telegram.ui.ActionBar.k6.F8, org.telegram.ui.ActionBar.k6.E8, new org.telegram.ui.fq0(z0Var, 26));
                                            }
                                        } else if (anVar2.getMessagesController().r2(anVar2.j6, anVar2.b(), null)) {
                                            I.c(z0Var.getIconResId(), text, new org.telegram.ui.af(anVar2, 16), false);
                                        } else {
                                            I.c(z0Var.getIconResId(), text, new org.telegram.ui.qf(i152, anVar2, I), false);
                                        }
                                        z13 = false;
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
        a4Var.addView(e5Var2, c8.ha.f(48.0f, -1, 51, org.telegram.messenger.g0.L(6.0f), i10 - org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(52.0f), 0));
        e5Var2.addView(l9Var, c8.ha.f(40.0f, 40, 51, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(4.0f), 0, 0));
        ImageView imageView3 = new ImageView(activity);
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType2);
        imageView3.setImageResource(R.drawable.ic_ab_other);
        int w032 = org.telegram.ui.ActionBar.k6.w0(i122, f6Var);
        mode = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(w032, mode));
        final int i142 = 1;
        imageView3.setBackground(org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(i122, f6Var)), 1, -1));
        imageView3.setContentDescription(org.telegram.messenger.hd.M0(2131754839, null));
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.g01
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i1422 = i142;
                org.telegram.ui.dk dkVar2 = dkVar;
                switch (i1422) {
                    case 0:
                        org.telegram.ui.an anVar = dkVar2.a;
                        anVar.m0.c();
                        if (anVar.X9()) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("dialog_id", anVar.getUserConfig().e());
                            anVar.presentFragment(new u80(bundle, null));
                            break;
                        } else if (org.telegram.messenger.t3.p0(anVar.e)) {
                            anVar.presentFragment(ProfileActivity.A4(-anVar.e.linked_monoforum_id));
                            break;
                        } else {
                            TLRPC.Chat chat = anVar.e;
                            if (chat != null) {
                                anVar.presentFragment(ProfileActivity.A4(-chat.id));
                                break;
                            } else {
                                TLRPC.User user = anVar.f;
                                if (user != null) {
                                    anVar.presentFragment(ProfileActivity.A4(user.id));
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        org.telegram.ui.an anVar2 = dkVar2.a;
                        org.telegram.ui.ActionBar.r0 r0Var = anVar2.i0;
                        if (r0Var != null && anVar2.m0 != null) {
                            r0Var.y();
                            org.telegram.ui.ActionBar.o0 o0Var = r0Var.Q;
                            if (o0Var != null) {
                                o0Var.n();
                            }
                            ActionBarPopupWindow$ActionBarPopupWindowLayout popupLayout = anVar2.i0.getPopupLayout();
                            k60 I = k60.I(anVar2, view3);
                            int i152 = 0;
                            boolean z13 = true;
                            for (int i162 = 0; i162 < popupLayout.getItemsCount(); i162++) {
                                View childAt = popupLayout.L.getChildAt(i162);
                                if (childAt != null && childAt.getVisibility() == 0) {
                                    if (childAt instanceof org.telegram.ui.ActionBar.d1) {
                                        if (!z13) {
                                            I.k();
                                            z13 = true;
                                        }
                                    } else if (childAt instanceof org.telegram.ui.ActionBar.z0) {
                                        org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) childAt;
                                        CharSequence text = z0Var.getTextView().getText();
                                        Drawable drawable = z0Var.getIconResId() == 0 ? z0Var.getImageView().getDrawable() : null;
                                        Drawable zg0Var = ((z0Var.getTag() instanceof Integer) && ((Integer) z0Var.getTag()).intValue() == 29) ? new zg0(R.raw.boosts, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f)) : (drawable == null || drawable.getConstantState() == null) ? null : drawable.getConstantState().newDrawable().mutate();
                                        org.telegram.ui.ActionBar.p0 p0Var = anVar2.s1;
                                        if (p0Var == null || z0Var != p0Var.j) {
                                            if (z0Var.getTag() instanceof Integer) {
                                                int intValue = ((Integer) z0Var.getTag()).intValue();
                                                Drawable drawable2 = zg0Var;
                                                I.b(z0Var.getIconResId(), drawable2, text, org.telegram.ui.ActionBar.k6.F8, org.telegram.ui.ActionBar.k6.E8, new org.telegram.ui.qe(anVar2, intValue, 4));
                                                if (drawable2 instanceof zg0) {
                                                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) I.A;
                                                    View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
                                                    if (childAt2 instanceof org.telegram.ui.ActionBar.z0) {
                                                        org.telegram.ui.ActionBar.z0 z0Var2 = (org.telegram.ui.ActionBar.z0) childAt2;
                                                        if (z0Var2.getImageView() instanceof ch0) {
                                                            ch0 ch0Var = (ch0) z0Var2.getImageView();
                                                            ch0Var.setAnimation((zg0) drawable2);
                                                            ch0Var.d();
                                                        }
                                                    }
                                                }
                                            } else {
                                                I.b(z0Var.getIconResId(), zg0Var, text, org.telegram.ui.ActionBar.k6.F8, org.telegram.ui.ActionBar.k6.E8, new org.telegram.ui.fq0(z0Var, 26));
                                            }
                                        } else if (anVar2.getMessagesController().r2(anVar2.j6, anVar2.b(), null)) {
                                            I.c(z0Var.getIconResId(), text, new org.telegram.ui.af(anVar2, 16), false);
                                        } else {
                                            I.c(z0Var.getIconResId(), text, new org.telegram.ui.qf(i152, anVar2, I), false);
                                        }
                                        z13 = false;
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
        a4Var.addView(imageView3, c8.ha.f(40.0f, 40, 53, 0, org.telegram.messenger.g0.L(3.0f) + i10, org.telegram.messenger.g0.L(8.0f), 0));
        this.n = imageView3;
        TextView textView4 = new TextView(activity);
        textView4.setTextSize(1, 16.0f);
        textView4.setTypeface(org.telegram.messenger.g0.o());
        textView4.setSingleLine();
        TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
        textView4.setEllipsize(truncateAt2);
        textView4.setTextColor(org.telegram.ui.ActionBar.k6.w0(i122, f6Var));
        textView4.setText(str);
        textView4.setIncludeFontPadding(false);
        e5Var2.addView(textView4, c8.ha.f(-2.0f, -1, 51, org.telegram.messenger.g0.L(58.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(6.0f), 0));
        TextView textView22 = new TextView(activity);
        textView22.setTextSize(1, 13.0f);
        textView22.setSingleLine();
        textView22.setEllipsize(truncateAt2);
        int i152 = org.telegram.ui.ActionBar.k6.y6;
        textView22.setTextColor(org.telegram.ui.ActionBar.k6.w0(i152, f6Var));
        textView22.setText(H);
        textView22.setIncludeFontPadding(false);
        e5Var2.addView(textView22, c8.ha.f(-2.0f, -1, 51, org.telegram.messenger.g0.L(58.0f), org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(6.0f), 0));
        FrameLayout frameLayout3 = new FrameLayout(activity);
        int L2 = org.telegram.messenger.g0.L(4.0f);
        frameLayout3.setPadding(L2, L2, L2, L2);
        frameLayout3.setBackground(new h01(this, L2));
        ImageView imageView22 = new ImageView(activity);
        imageView22.setScaleType(scaleType2);
        imageView22.setImageResource(R.drawable.outline_header_search);
        imageView22.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(i152, f6Var), mode));
        frameLayout3.addView(imageView22, c8.ha.d(24, 24.0f, 19, 12.0f, 0.0f, 0.0f, 0.0f));
        EditText editText2 = new EditText(activity);
        this.w = editText2;
        editText2.setBackground(null);
        editText2.setPadding(0, 0, 0, 0);
        editText2.setTextSize(1, 15.0f);
        editText2.setSingleLine();
        editText2.setImeOptions(268435459);
        editText2.setHint(org.telegram.messenger.hd.M0(2131745837, null));
        editText2.setHintTextColor(org.telegram.ui.ActionBar.k6.w0(i152, f6Var));
        editText2.setTextColor(org.telegram.ui.ActionBar.k6.w0(i122, f6Var));
        editText2.addTextChangedListener(new ah.j(this, 25));
        frameLayout3.addView(editText2, c8.ha.d(-1, -1.0f, org.telegram.messenger.qs.E1, 48.0f, 0.0f, 12.0f, 0.0f));
        a4Var.addView(frameLayout3, c8.ha.f(48.0f, -1, 51, org.telegram.messenger.g0.L(12.0f) - L2, (org.telegram.messenger.g0.L(56.0f) + i10) - L2, org.telegram.messenger.g0.L(8.0f) - L2, 0));
        pj0 pj0Var2 = new pj0(activity, f6Var);
        this.r = pj0Var2;
        pj0Var2.setLayoutManager(new v4.b0());
        pj0Var2.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(8.0f));
        pj0Var2.setClipToPadding(false);
        pj0Var2.setVerticalScrollBarEnabled(false);
        v4.k kVar2 = new v4.k();
        kVar2.m = false;
        kVar2.C = false;
        kVar2.i = xq.h;
        kVar2.n(350L);
        pj0Var2.setItemAnimator(kVar2);
        pj0Var2.setSelectorRadius(org.telegram.messenger.g0.L(16.0f));
        pj0Var2.setSelectorDrawableColor(org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(i122, f6Var)));
        k01 k01Var2 = new k01(this);
        this.s = k01Var2;
        pj0Var2.setAdapter(k01Var2);
        pj0Var2.setOnItemClickListener(new di.p4(14, this, dkVar));
        pj0Var2.setOnItemLongClickListener((dj0) new f2(19, this, dkVar));
        pj0Var2.j(new i01(this, i7, j3));
        a4Var.addView(pj0Var2, c8.ha.f(-1.0f, -1, org.telegram.messenger.qs.E1, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(100.0f) + i10, org.telegram.messenger.g0.L(8.0f), 0));
        int i162 = org.telegram.ui.ActionBar.k6.d6;
        w02 = org.telegram.ui.ActionBar.k6.w0(i162, f6Var);
        View view3 = new View(activity);
        view3.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{w02, i0.a.o(w02, 0)}));
        a4Var.addView(view3, c8.ha.f(org.telegram.messenger.g0.L(16.0f), -1, 51, 0, org.telegram.messenger.g0.L(100.0f) + i10, 0, 0));
        View view22 = new View(activity);
        this.F = view22;
        view22.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{w02, i0.a.o(w02, 0)}));
        a4Var.addView(view22, c8.ha.e(-1, 24, 87));
        this.E = view3;
        h();
        if (j3 <= 0) {
        }
        if (!z9) {
            FrameLayout frameLayout22 = new FrameLayout(activity);
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setCornerRadius(org.telegram.messenger.g0.L(25.0f));
            gradientDrawable2.setColor(i0.a.o(w02, org.telegram.messenger.qs.B3));
            frameLayout22.setBackground(gradientDrawable2);
            frameLayout22.setElevation(org.telegram.messenger.g0.L(2.0f));
            frameLayout22.setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
            TextView textView32 = new TextView(activity);
            textView32.setTextSize(1, 14.0f);
            textView32.setTypeface(org.telegram.messenger.g0.o());
            int i172 = org.telegram.ui.ActionBar.k6.Gi;
            textView32.setTextColor(org.telegram.ui.ActionBar.k6.w0(i172, f6Var));
            textView32.setText(org.telegram.messenger.hd.M0(2131748250, null));
            textView32.setGravity(17);
            textView32.setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
            textView32.setCompoundDrawablePadding(org.telegram.messenger.g0.L(8.0f));
            Drawable mutate2 = activity.getDrawable(R.drawable.filled_topic_new_24).mutate();
            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(i172, f6Var), mode));
            textView32.setCompoundDrawablesWithIntrinsicBounds(mutate2, (Drawable) null, (Drawable) null, (Drawable) null);
            textView32.setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(22.0f), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, f6Var)));
            c8.ka.a(textView32);
            textView32.setOnClickListener(new lk(25, this, dkVar));
            frameLayout22.addView(textView32, c8.ha.c(44.0f, -2));
            a4Var.addView(frameLayout22, c8.ha.d(-2, 50.0f, 81, 0.0f, 0.0f, 0.0f, 8.0f));
            this.D = frameLayout22;
        }
        a4Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(i162, f6Var));
        setProgress(0.0f);
    }

    private int getPanelWidth() {
        return this.I + this.H;
    }

    public final void a(float f10, float f11) {
        ValueAnimator valueAnimator = this.J;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.J = null;
        }
        float f12 = this.y;
        if (f12 == f10) {
            setProgress(f10);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f10);
        this.J = ofFloat;
        ofFloat.addUpdateListener(new c60(this, 26));
        this.J.addListener(new j01(this, 0));
        this.J.setDuration(Math.abs(f11) > ((float) org.telegram.messenger.g0.L(300.0f)) ? (long) Math.max(150.0f, Math.min(320.0f, ((Math.abs(f10 - this.y) * getPanelWidth()) / Math.abs(f11)) * 1000.0f * 2.0f)) : 320L);
        this.J.setInterpolator(xq.h);
        this.J.start();
    }

    public final void b() {
        v80 v80Var = this.O;
        if (v80Var != null) {
            org.telegram.messenger.g0.r(v80Var);
            this.O = null;
        }
        if (this.N != 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.N, true);
            this.N = 0;
        }
    }

    public final void c() {
        a(0.0f, 0.0f);
        org.telegram.messenger.g0.v1(this.w);
    }

    public final TLObject d(l01 l01Var) {
        long o4;
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(this.a);
        org.telegram.messenger.uv uvVar = l01Var.b;
        if (uvVar != null) {
            o4 = uvVar.a;
        } else {
            TLRPC.TL_forumTopic tL_forumTopic = l01Var.a;
            if (tL_forumTopic == null || !this.c) {
                return null;
            }
            o4 = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
        }
        return o4 >= 0 ? s12.a2(Long.valueOf(o4)) : s12.M0(Long.valueOf(-o4));
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.q5) {
            if (((Long) objArr[0]).longValue() == (-this.b)) {
                g();
            }
        } else {
            if (i7 == org.telegram.messenger.qs.r) {
                g();
                return;
            }
            if (i7 == org.telegram.messenger.qs.g3) {
                if (this.d) {
                    g();
                }
            } else if (i7 == org.telegram.messenger.qs.i4) {
                org.telegram.messenger.g0.d0(this.r, new pg.c(0));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int r12 = org.telegram.ui.ActionBar.k6.r1(this.y, 687865856);
        Paint paint = this.x;
        paint.setColor(r12);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        org.telegram.ui.dk dkVar = this.f;
        if (dkVar != null && this.y > 0.0f) {
            org.telegram.ui.an.M2(dkVar.a, canvas);
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

    public final String e(long j3) {
        int i7 = this.a;
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
        if (j3 == org.telegram.messenger.p10.i(i7).e()) {
            return org.telegram.messenger.hd.M0(2131748302, null);
        }
        if (j3 == 2666000) {
            return org.telegram.messenger.hd.M0(2131754252, null);
        }
        if (j3 >= 0) {
            return org.telegram.messenger.t10.p(s12.a2(Long.valueOf(j3)));
        }
        TLRPC.Chat M0 = s12.M0(Long.valueOf(-j3));
        return M0 != null ? M0.title : "";
    }

    public final boolean f(l01 l01Var) {
        String str;
        org.telegram.messenger.uv uvVar = l01Var.b;
        String str2 = "";
        if (uvVar != null) {
            String e10 = e(uvVar.a);
            if (e10 != null) {
                str2 = e10.toString();
            }
        } else {
            TLObject d = d(l01Var);
            if (d instanceof TLRPC.User) {
                str2 = org.telegram.messenger.t10.p((TLRPC.User) d);
            } else if (d instanceof TLRPC.Chat) {
                str2 = ((TLRPC.Chat) d).title;
            } else {
                TLRPC.TL_forumTopic tL_forumTopic = l01Var.a;
                if (tL_forumTopic != null && (str = tL_forumTopic.title) != null) {
                    str2 = str;
                }
            }
        }
        return str2.toLowerCase().contains(this.L);
    }

    public final void g() {
        int visibility = getVisibility();
        k01 k01Var = this.s;
        if (visibility == 0 || this.y > 0.0f || k01Var.c.size() <= 0) {
            ArrayList arrayList = k01Var.c;
            String str = k01Var.d;
            n01 n01Var = k01Var.e;
            String str2 = n01Var.L;
            int i7 = n01Var.a;
            int i10 = 0;
            boolean z9 = TextUtils.equals(str, str2) && n01Var.y > 0.0f && !arrayList.isEmpty();
            k01Var.d = n01Var.L;
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            if (TextUtils.isEmpty(n01Var.L)) {
                arrayList.add(new l01(n01Var));
            }
            if (n01Var.d) {
                ArrayList arrayList3 = org.telegram.messenger.qp.s1(i7).G1().j;
                int size = arrayList3.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList3.get(i11);
                    i11++;
                    l01 l01Var = new l01(n01Var);
                    l01Var.b = (org.telegram.messenger.uv) obj;
                    if (!TextUtils.isEmpty(n01Var.L) && !n01Var.f(l01Var)) {
                        TLObject d = n01Var.d(l01Var);
                        String n10 = d instanceof TLRPC.User ? org.telegram.messenger.t10.n((TLRPC.User) d) : d instanceof TLRPC.Chat ? org.telegram.messenger.t3.K((TLRPC.Chat) d, false) : null;
                        if (n10 != null && n10.toLowerCase().contains(n01Var.L)) {
                        }
                    }
                    arrayList.add(l01Var);
                }
                if (z9) {
                    v4.o.c(new jg.h(k01Var, arrayList2, 3), true).c(k01Var);
                    return;
                } else {
                    k01Var.f();
                    return;
                }
            }
            HashSet hashSet = new HashSet();
            ArrayList l10 = org.telegram.messenger.qp.s1(i7).q7.l(-n01Var.b);
            if (l10 != null) {
                int size2 = l10.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj2 = l10.get(i12);
                    i12++;
                    l01 l01Var2 = new l01(n01Var);
                    l01Var2.a = (TLRPC.TL_forumTopic) obj2;
                    if (!TextUtils.isEmpty(n01Var.L) && !n01Var.f(l01Var2)) {
                        TLObject d2 = n01Var.d(l01Var2);
                        String n11 = d2 instanceof TLRPC.User ? org.telegram.messenger.t10.n((TLRPC.User) d2) : d2 instanceof TLRPC.Chat ? org.telegram.messenger.t3.K((TLRPC.Chat) d2, false) : null;
                        if (n11 != null && n11.toLowerCase().contains(n01Var.L)) {
                        }
                    }
                    arrayList.add(l01Var2);
                    hashSet.add(Long.valueOf(l01Var2.a()));
                }
            }
            if (!TextUtils.isEmpty(n01Var.L)) {
                ArrayList arrayList4 = n01Var.M;
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
            if (z9) {
                v4.o.c(new jg.h(k01Var, arrayList2, 3), true).c(k01Var);
            } else {
                k01Var.f();
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
        pj0 pj0Var = this.r;
        view2.setAlpha(Utilities.i(pj0Var.computeVerticalScrollOffset() / org.telegram.messenger.g0.L(16.0f), 1.0f, 0.0f));
        if (this.D != null) {
            view.setAlpha(1.0f);
        } else {
            view.setAlpha(Utilities.i(((pj0Var.computeVerticalScrollRange() - pj0Var.computeVerticalScrollOffset()) - pj0Var.computeVerticalScrollExtent()) / org.telegram.messenger.g0.L(16.0f), 1.0f, 0.0f));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = this.a;
        org.telegram.messenger.qs.f(i7).b(this, org.telegram.messenger.qs.q5);
        org.telegram.messenger.qs.f(i7).b(this, org.telegram.messenger.qs.r);
        org.telegram.messenger.qs.f(i7).b(this, org.telegram.messenger.qs.g3);
        org.telegram.messenger.qs.e().b(this, org.telegram.messenger.qs.i4);
        g();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = this.a;
        org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.q5);
        org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.r);
        org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.g3);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.i4);
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
            float y10 = motionEvent.getY() - this.R;
            if (x10 > ViewConfiguration.get(getContext()).getScaledTouchSlop() && Math.abs(x10) > Math.abs(y10) * 1.5f) {
                this.S = true;
                this.Q = motionEvent.getX();
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        WeakHashMap weakHashMap = r0.i0.a;
        r0.k1 a10 = r0.b0.a(this);
        int i13 = a10 != null ? a10.a.f(2).d : 0;
        if (i13 != this.G) {
            this.G = i13;
            pj0 pj0Var = this.r;
            View view = this.F;
            FrameLayout frameLayout = this.D;
            if (frameLayout != null) {
                ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(8.0f) + i13;
                view.getLayoutParams().height = org.telegram.messenger.g0.L(64.0f) + i13;
                pj0Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(66.0f) + i13);
            } else {
                view.getLayoutParams().height = org.telegram.messenger.g0.L(24.0f) + i13;
                pj0Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(8.0f) + i13);
            }
            this.h.requestLayout();
        }
        super.onLayout(z9, i7, i10, i11, i12);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        org.telegram.ui.an anVar;
        org.telegram.ui.ActionBar.r0 m92;
        org.telegram.ui.ActionBar.k kVar;
        WeakHashMap weakHashMap = r0.i0.a;
        r0.k1 a10 = r0.b0.a(this);
        int i11 = 0;
        int i12 = a10 != null ? org.telegram.messenger.g0.I0(a10, false).c : 0;
        int i13 = this.H;
        di.a4 a4Var = this.h;
        if (i12 != i13) {
            this.H = i12;
            a4Var.getLayoutParams().width = getPanelWidth();
            a4Var.setPadding(0, 0, i12, 0);
            a4Var.setTranslationX((1.0f - this.y) * getPanelWidth());
        }
        int size = View.MeasureSpec.getSize(i7);
        org.telegram.ui.dk dkVar = this.f;
        if (dkVar != null && (m92 = (anVar = dkVar.a).m9()) != null) {
            View view = (View) m92.getParent();
            kVar = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
            i11 = (int) ((kVar.getWidth() - ((m92.getWidth() / 2.0f) + (m92.getX() + view.getX()))) + org.telegram.messenger.g0.L(31.0f));
        }
        int max = Math.max(org.telegram.messenger.g0.L(200.0f), Math.min(org.telegram.messenger.g0.L(288.0f), (size - this.H) - i11));
        if (max != this.I) {
            this.I = max;
            a4Var.getLayoutParams().width = getPanelWidth();
            a4Var.setTranslationX((1.0f - this.y) * getPanelWidth());
            this.s.f();
        }
        super.onMeasure(i7, i10);
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

    public void setCurrentTopic(long j3) {
        this.K = j3;
        this.s.f();
    }

    public void setMenuAvailable(boolean z9) {
        ImageView imageView = this.n;
        if (imageView != null) {
            imageView.setVisibility(z9 ? 0 : 8);
        }
    }

    public void setProgress(float f10) {
        this.y = Utilities.l(f10);
        this.h.setTranslationX((1.0f - this.y) * getPanelWidth());
        setVisibility((this.y > 0.0f || this.P) ? 0 : 8);
        invalidate();
        org.telegram.ui.dk dkVar = this.f;
        if (dkVar != null) {
            dkVar.a.l1.invalidate();
        }
    }

    public void settle(float f10) {
        boolean z9 = false;
        if (Math.abs(f10) <= org.telegram.messenger.g0.L(300.0f) ? this.y > 0.5f : f10 < 0.0f) {
            z9 = true;
        }
        if (z9) {
            g();
        }
        a(z9 ? 1.0f : 0.0f, f10);
        if (z9) {
            return;
        }
        org.telegram.messenger.g0.v1(this.w);
    }
}
