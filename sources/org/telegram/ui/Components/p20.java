package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class p20 extends View implements org.telegram.ui.ActionBar.b6 {
    public static final TextPaint N = new TextPaint(1);
    public static final Paint O = new Paint(1);
    public boolean E;
    public long F;
    public final int[] G;
    public final org.telegram.ui.ActionBar.h6 H;
    public final boolean I;
    public final boolean J;
    public final int K;
    public boolean L;
    public int M;
    public final String a;
    public final long b;
    public final String c;
    public final boolean d;
    public final Drawable e;
    public final RectF f;
    public final ImageReceiver h;
    public final StaticLayout n;
    public final b9 r;
    public final org.telegram.messenger.f5 s;
    public final int w;
    public final float x;
    public float y;

    public p20(Context context, Object obj) {
        this(context, obj, null, false, null);
    }

    public final void a() {
        if (this.E) {
            this.E = false;
            this.F = System.currentTimeMillis();
            invalidate();
        }
    }

    public final void b() {
        if (this.E) {
            return;
        }
        this.E = true;
        this.F = System.currentTimeMillis();
        invalidate();
    }

    public final void c() {
        int b10 = this.r.b();
        int i7 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.h6 h6Var = this.H;
        int r12 = org.telegram.ui.ActionBar.m6.r1(0.05f, org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ui, h6Var);
        int red = Color.red(r12);
        int[] iArr = this.G;
        iArr[0] = red;
        iArr[1] = Color.red(b10);
        iArr[2] = Color.green(r12);
        iArr[3] = Color.green(b10);
        iArr[4] = Color.blue(r12);
        iArr[5] = Color.blue(b10);
        iArr[6] = Color.alpha(r12);
        iArr[7] = Color.alpha(b10);
        if (!this.L || w02 != this.M) {
            this.L = true;
            this.M = w02;
            this.e.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
        }
        O.setColor(r12);
    }

    public org.telegram.messenger.f5 getContact() {
        return this.s;
    }

    public String getCountryIso2() {
        return this.a;
    }

    public String getKey() {
        return this.c;
    }

    public long getUid() {
        return this.b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z10 = this.E;
        if ((z10 && this.y != 1.0f) || (!z10 && this.y != 0.0f)) {
            long currentTimeMillis = System.currentTimeMillis() - this.F;
            if (currentTimeMillis < 0 || currentTimeMillis > 17) {
                currentTimeMillis = 17;
            }
            if (this.E) {
                float f10 = (currentTimeMillis / 120.0f) + this.y;
                this.y = f10;
                if (f10 >= 1.0f) {
                    this.y = 1.0f;
                }
            } else {
                float f11 = this.y - (currentTimeMillis / 120.0f);
                this.y = f11;
                if (f11 < 0.0f) {
                    this.y = 0.0f;
                }
            }
            invalidate();
        }
        canvas.save();
        float measuredWidth = getMeasuredWidth();
        boolean z11 = this.I;
        float L = org.telegram.messenger.g0.L(z11 ? 28.0f : 32.0f);
        RectF rectF = this.f;
        rectF.set(0.0f, 0.0f, measuredWidth, L);
        int[] iArr = this.G;
        int i7 = iArr[6];
        float f12 = iArr[7] - i7;
        float f13 = this.y;
        int argb = Color.argb(i7 + ((int) (f12 * f13)), iArr[0] + ((int) ((iArr[1] - r6) * f13)), iArr[2] + ((int) ((iArr[3] - r8) * f13)), iArr[4] + ((int) ((iArr[5] - r9) * f13)));
        Paint paint = O;
        paint.setColor(argb);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(z11 ? 14.0f : 16.0f), org.telegram.messenger.g0.L(z11 ? 14.0f : 16.0f), paint);
        if (this.y != 1.0f) {
            this.h.h(canvas, null);
        }
        if (this.y != 0.0f) {
            paint.setColor(this.r.b());
            paint.setAlpha((int) (this.y * 255.0f * (Color.alpha(r2) / 255.0f)));
            canvas.drawCircle(org.telegram.messenger.g0.L(z11 ? 14.0f : 16.0f), org.telegram.messenger.g0.L(z11 ? 14.0f : 16.0f), org.telegram.messenger.g0.L(z11 ? 14.0f : 16.0f), paint);
            canvas.save();
            canvas.rotate((1.0f - this.y) * 45.0f, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
            int L2 = org.telegram.messenger.g0.L(z11 ? 9.0f : 11.0f);
            int L3 = org.telegram.messenger.g0.L(z11 ? 9.0f : 11.0f);
            int L4 = org.telegram.messenger.g0.L(z11 ? 19.0f : 21.0f);
            int L5 = org.telegram.messenger.g0.L(z11 ? 19.0f : 21.0f);
            Drawable drawable = this.e;
            drawable.setBounds(L2, L3, L4, L5);
            drawable.setAlpha((int) (this.y * 255.0f));
            drawable.draw(canvas);
            canvas.restore();
        }
        canvas.translate(this.x + org.telegram.messenger.g0.L((z11 ? 26 : 32) + 9), org.telegram.messenger.g0.L(z11 ? 6.0f : 8.0f));
        int i10 = org.telegram.ui.ActionBar.m6.Si;
        org.telegram.ui.ActionBar.h6 h6Var = this.H;
        N.setColor(i0.a.f(this.y, org.telegram.ui.ActionBar.m6.w0(i10, h6Var), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.J7, h6Var)));
        this.n.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.n.getText());
        if (this.E) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK.getId(), org.telegram.messenger.hd.N0(2131751586, null)));
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        boolean z10 = this.I;
        setMeasuredDimension(org.telegram.messenger.g0.L((z10 ? 20 : 32) + 25) + this.w, org.telegram.messenger.g0.L(z10 ? 28.0f : 32.0f));
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            b9 b9Var = this.r;
            if (b9Var != null) {
                int i7 = this.K;
                org.telegram.ui.ActionBar.h6 h6Var = this.H;
                if (i7 == 1) {
                    b9Var.h(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Hk, h6Var));
                } else if (i7 == 2) {
                    b9Var.i(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.T7, h6Var), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.a8, h6Var));
                } else if (i7 == 3) {
                    b9Var.h(org.telegram.ui.ActionBar.m6.r1(0.7f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.p7, h6Var)));
                }
            }
            c();
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public p20(Context context, Object obj, org.telegram.messenger.f5 f5Var, boolean z10, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        char c10;
        int i7;
        String str;
        b9 b9Var;
        String str2;
        org.telegram.messenger.gc gcVar;
        Object obj2;
        TLRPC.Chat chat;
        org.telegram.messenger.gc m10;
        int z11;
        int i10;
        this.f = new RectF();
        this.G = new int[8];
        this.J = true;
        this.H = h6Var;
        this.I = z10;
        this.d = false;
        this.s = f5Var;
        this.e = getResources().getDrawable(R.drawable.delete);
        float L = org.telegram.messenger.g0.L(z10 ? 13.0f : 14.0f);
        TextPaint textPaint = N;
        textPaint.setTextSize(L);
        b9 b9Var2 = new b9((org.telegram.ui.ActionBar.h6) null);
        this.r = b9Var2;
        b9Var2.u(org.telegram.messenger.g0.L(20.0f));
        boolean z12 = obj instanceof String;
        if (z12) {
            String str3 = (String) obj;
            b9Var2.p = 0.8f;
            switch (str3.hashCode()) {
                case -1716307998:
                    i10 = 2;
                    str3.equals("archived");
                    b9Var2.g(11);
                    this.b = -9223372036854775801L;
                    str2 = org.telegram.messenger.hd.N0(2131750792, null);
                    break;
                case -1359418551:
                    if (str3.equals("miniapps")) {
                        this.d = true;
                        b9Var2.i(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.T7, h6Var), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.a8, h6Var));
                        i10 = 2;
                        this.K = 2;
                        str2 = org.telegram.messenger.hd.N0(2131746612, null);
                        break;
                    }
                    i10 = 2;
                    b9Var2.g(11);
                    this.b = -9223372036854775801L;
                    str2 = org.telegram.messenger.hd.N0(2131750792, null);
                    break;
                case -1237460524:
                    if (str3.equals("groups")) {
                        b9Var2.g(6);
                        this.b = -9223372036854775806L;
                        str2 = org.telegram.messenger.hd.N0(2131750762, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    b9Var2.g(11);
                    this.b = -9223372036854775801L;
                    str2 = org.telegram.messenger.hd.N0(2131750792, null);
                    break;
                case -1197490811:
                    if (str3.equals("non_contacts")) {
                        b9Var2.g(5);
                        this.b = -9223372036854775807L;
                        str2 = org.telegram.messenger.hd.N0(2131750706, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    b9Var2.g(11);
                    this.b = -9223372036854775801L;
                    str2 = org.telegram.messenger.hd.N0(2131750792, null);
                    break;
                case -567451565:
                    if (str3.equals("contacts")) {
                        b9Var2.g(4);
                        this.b = Long.MIN_VALUE;
                        str2 = org.telegram.messenger.hd.N0(2131750779, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    b9Var2.g(11);
                    this.b = -9223372036854775801L;
                    str2 = org.telegram.messenger.hd.N0(2131750792, null);
                    break;
                case -318452137:
                    if (str3.equals("premium")) {
                        this.d = true;
                        b9Var2.h(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Hk, h6Var));
                        this.K = 1;
                        str2 = org.telegram.messenger.hd.N0(2131746586, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    b9Var2.g(11);
                    this.b = -9223372036854775801L;
                    str2 = org.telegram.messenger.hd.N0(2131750792, null);
                    break;
                case -268161860:
                    if (str3.equals("new_chats")) {
                        b9Var2.g(24);
                        this.b = -9223372036854775799L;
                        str2 = org.telegram.messenger.hd.N0(2131750715, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    b9Var2.g(11);
                    this.b = -9223372036854775801L;
                    str2 = org.telegram.messenger.hd.N0(2131750792, null);
                    break;
                case 3029900:
                    if (str3.equals("bots")) {
                        b9Var2.g(8);
                        this.b = -9223372036854775804L;
                        str2 = org.telegram.messenger.hd.N0(2131750789, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    b9Var2.g(11);
                    this.b = -9223372036854775801L;
                    str2 = org.telegram.messenger.hd.N0(2131750792, null);
                    break;
                case 3496342:
                    if (str3.equals("read")) {
                        b9Var2.g(10);
                        this.b = -9223372036854775802L;
                        str2 = org.telegram.messenger.hd.N0(2131750705, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    b9Var2.g(11);
                    this.b = -9223372036854775801L;
                    str2 = org.telegram.messenger.hd.N0(2131750792, null);
                    break;
                case 104264043:
                    if (str3.equals("muted")) {
                        b9Var2.g(9);
                        this.b = -9223372036854775803L;
                        str2 = org.telegram.messenger.hd.N0(2131750724, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    b9Var2.g(11);
                    this.b = -9223372036854775801L;
                    str2 = org.telegram.messenger.hd.N0(2131750792, null);
                    break;
                case 151051367:
                    if (str3.equals("existing_chats")) {
                        b9Var2.g(23);
                        this.b = -9223372036854775800L;
                        str2 = org.telegram.messenger.hd.N0(2131750764, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    b9Var2.g(11);
                    this.b = -9223372036854775801L;
                    str2 = org.telegram.messenger.hd.N0(2131750792, null);
                    break;
                case 1432626128:
                    if (str3.equals("channels")) {
                        b9Var2.g(7);
                        this.b = -9223372036854775805L;
                        str2 = org.telegram.messenger.hd.N0(2131750788, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    b9Var2.g(11);
                    this.b = -9223372036854775801L;
                    str2 = org.telegram.messenger.hd.N0(2131750792, null);
                    break;
                default:
                    i10 = 2;
                    b9Var2.g(11);
                    this.b = -9223372036854775801L;
                    str2 = org.telegram.messenger.hd.N0(2131750792, null);
                    break;
            }
            i7 = i10;
            gcVar = null;
            obj2 = null;
            b9Var = b9Var2;
            str = "premium";
            c10 = ' ';
        } else {
            if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                this.b = user.id;
                if (org.telegram.messenger.p10.A(user)) {
                    str2 = org.telegram.messenger.hd.N0(2131746070, null);
                    b9Var2.p = 0.8f;
                    b9Var2.g(12);
                } else if (org.telegram.messenger.p10.C(user)) {
                    str2 = org.telegram.messenger.hd.N0(2131745705, null);
                    b9Var2.p = 0.8f;
                    b9Var2.g(1);
                } else {
                    b9Var2.r(user);
                    String k10 = org.telegram.messenger.p10.k(user, true);
                    c10 = ' ';
                    int indexOf = k10.indexOf(32);
                    k10 = indexOf >= 0 ? k10.substring(0, indexOf) : k10;
                    m10 = org.telegram.messenger.gc.m(org.telegram.messenger.k10.t0, 1, user);
                    String str4 = k10;
                    chat = user;
                    str2 = str4;
                }
                chat = null;
                m10 = null;
                c10 = ' ';
            } else {
                c10 = ' ';
                if (obj instanceof TLRPC.Chat) {
                    chat = (TLRPC.Chat) obj;
                    b9Var2.q(chat);
                    this.b = -chat.id;
                    str2 = chat.title;
                    m10 = org.telegram.messenger.gc.m(org.telegram.messenger.k10.t0, 1, chat);
                } else {
                    if (obj instanceof TLRPC.TL_help_country) {
                        TLRPC.TL_help_country tL_help_country = (TLRPC.TL_help_country) obj;
                        String F0 = org.telegram.messenger.hd.F0(tL_help_country.iso2);
                        String str5 = tL_help_country.default_name;
                        b9Var2.g(17);
                        b9Var2.u(org.telegram.messenger.g0.L(24.0f));
                        i7 = 2;
                        str = "premium";
                        b9Var2.k(0L, F0, null, null);
                        b9Var2.h(org.telegram.ui.ActionBar.m6.r1(0.7f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.p7, h6Var)));
                        this.K = 3;
                        this.J = false;
                        b9Var2.w = false;
                        this.b = tL_help_country.default_name.hashCode();
                        this.a = tL_help_country.iso2;
                        gcVar = null;
                        b9Var = b9Var2;
                        str2 = str5;
                    } else {
                        i7 = 2;
                        str = "premium";
                        b9Var2.k(f5Var.a, f5Var.i, f5Var.j, null);
                        b9Var = b9Var2;
                        this.b = f5Var.a;
                        this.c = f5Var.b;
                        str2 = !TextUtils.isEmpty(f5Var.i) ? f5Var.i : f5Var.j;
                        gcVar = null;
                    }
                    obj2 = gcVar;
                }
            }
            obj2 = chat;
            i7 = 2;
            b9Var = b9Var2;
            str = "premium";
            gcVar = m10;
        }
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.h = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.g0.L(16.0f));
        imageReceiver.H0(this);
        imageReceiver.y0(this.J ? 0.0f : org.telegram.messenger.g0.L(4.0f), 0.0f, org.telegram.messenger.g0.L(z10 ? 28.0f : 32.0f), org.telegram.messenger.g0.L(z10 ? 28.0f : 32.0f));
        if (org.telegram.messenger.g0.Q1()) {
            z11 = org.telegram.messenger.g0.L(398 - (z10 ? (char) 28 : c10)) / i7;
        } else {
            Point point = org.telegram.messenger.g0.q;
            z11 = org.telegram.messenger.o10.z((z10 ? (char) 28 : c10) + 132, Math.min(point.x, point.y), i7);
        }
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(org.telegram.messenger.j6.m(str2.replace('\n', c10), textPaint.getFontMetricsInt(), false, null, 0), textPaint, z11, TextUtils.TruncateAt.END), textPaint, 1000, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.n = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            this.w = (int) Math.ceil(staticLayout.getLineWidth(0));
            this.x = -staticLayout.getLineLeft(0);
        }
        if (z12 && str.equals((String) obj)) {
            imageReceiver.w0(org.telegram.ui.Cells.i4.b(getContext(), true));
        } else if (z12 && "miniapps".equals((String) obj)) {
            getContext();
            imageReceiver.w0(org.telegram.ui.Cells.i4.a(true));
        } else {
            imageReceiver.p0(gcVar, "50_50", b9Var, 0L, null, obj2, 1);
        }
        c();
        org.telegram.messenger.ls.i(this);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
