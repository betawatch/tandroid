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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class s20 extends View implements org.telegram.ui.ActionBar.k6 {
    public static final TextPaint M = new TextPaint(1);
    public static final Paint N = new Paint(1);
    public boolean D;
    public long E;
    public final int[] F;
    public final org.telegram.ui.ActionBar.p6 G;
    public final boolean H;
    public final boolean I;
    public final int J;
    public boolean K;
    public int L;
    public final String a;
    public final long b;
    public final String c;
    public final boolean d;
    public final Drawable e;
    public final RectF f;
    public final ImageReceiver h;
    public final StaticLayout n;
    public final r8 r;
    public final org.telegram.messenger.f5 s;
    public final int w;
    public final float x;
    public float y;

    public s20(Context context, Object obj) {
        this(context, obj, null, false, null);
    }

    public final void a() {
        if (this.D) {
            this.D = false;
            this.E = System.currentTimeMillis();
            invalidate();
        }
    }

    public final void b() {
        if (this.D) {
            return;
        }
        this.D = true;
        this.E = System.currentTimeMillis();
        invalidate();
    }

    public final void c() {
        int b10 = this.r.b();
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.p6 p6Var = this.G;
        int r12 = org.telegram.ui.ActionBar.t6.r1(0.05f, org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ri, p6Var);
        int red = Color.red(r12);
        int[] iArr = this.F;
        iArr[0] = red;
        iArr[1] = Color.red(b10);
        iArr[2] = Color.green(r12);
        iArr[3] = Color.green(b10);
        iArr[4] = Color.blue(r12);
        iArr[5] = Color.blue(b10);
        iArr[6] = Color.alpha(r12);
        iArr[7] = Color.alpha(b10);
        if (!this.K || w02 != this.L) {
            this.K = true;
            this.L = w02;
            this.e.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
        }
        N.setColor(r12);
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
        boolean z10 = this.D;
        if ((z10 && this.y != 1.0f) || (!z10 && this.y != 0.0f)) {
            long currentTimeMillis = System.currentTimeMillis() - this.E;
            if (currentTimeMillis < 0 || currentTimeMillis > 17) {
                currentTimeMillis = 17;
            }
            if (this.D) {
                float f7 = (currentTimeMillis / 120.0f) + this.y;
                this.y = f7;
                if (f7 >= 1.0f) {
                    this.y = 1.0f;
                }
            } else {
                float f10 = this.y - (currentTimeMillis / 120.0f);
                this.y = f10;
                if (f10 < 0.0f) {
                    this.y = 0.0f;
                }
            }
            invalidate();
        }
        canvas.save();
        float measuredWidth = getMeasuredWidth();
        boolean z11 = this.H;
        float L = org.telegram.messenger.i0.L(z11 ? 28.0f : 32.0f);
        RectF rectF = this.f;
        rectF.set(0.0f, 0.0f, measuredWidth, L);
        int[] iArr = this.F;
        int i10 = iArr[6];
        float f11 = iArr[7] - i10;
        float f12 = this.y;
        int argb = Color.argb(i10 + ((int) (f11 * f12)), iArr[0] + ((int) ((iArr[1] - r6) * f12)), iArr[2] + ((int) ((iArr[3] - r8) * f12)), iArr[4] + ((int) ((iArr[5] - r9) * f12)));
        Paint paint = N;
        paint.setColor(argb);
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(z11 ? 14.0f : 16.0f), org.telegram.messenger.i0.L(z11 ? 14.0f : 16.0f), paint);
        if (this.y != 1.0f) {
            this.h.h(canvas, null);
        }
        if (this.y != 0.0f) {
            paint.setColor(this.r.b());
            paint.setAlpha((int) (this.y * 255.0f * (Color.alpha(r2) / 255.0f)));
            canvas.drawCircle(org.telegram.messenger.i0.L(z11 ? 14.0f : 16.0f), org.telegram.messenger.i0.L(z11 ? 14.0f : 16.0f), org.telegram.messenger.i0.L(z11 ? 14.0f : 16.0f), paint);
            canvas.save();
            canvas.rotate((1.0f - this.y) * 45.0f, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f));
            int L2 = org.telegram.messenger.i0.L(z11 ? 9.0f : 11.0f);
            int L3 = org.telegram.messenger.i0.L(z11 ? 9.0f : 11.0f);
            int L4 = org.telegram.messenger.i0.L(z11 ? 19.0f : 21.0f);
            int L5 = org.telegram.messenger.i0.L(z11 ? 19.0f : 21.0f);
            Drawable drawable = this.e;
            drawable.setBounds(L2, L3, L4, L5);
            drawable.setAlpha((int) (this.y * 255.0f));
            drawable.draw(canvas);
            canvas.restore();
        }
        canvas.translate(this.x + org.telegram.messenger.i0.L((z11 ? 26 : 32) + 9), org.telegram.messenger.i0.L(z11 ? 6.0f : 8.0f));
        int i11 = org.telegram.ui.ActionBar.t6.Pi;
        org.telegram.ui.ActionBar.p6 p6Var = this.G;
        M.setColor(i0.b.f(this.y, org.telegram.ui.ActionBar.t6.w0(i11, p6Var), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.J7, p6Var)));
        this.n.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.n.getText());
        if (this.D) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK.getId(), org.telegram.messenger.cd.L0(2131751599, null)));
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10 = this.H;
        setMeasuredDimension(org.telegram.messenger.i0.L((z10 ? 20 : 32) + 25) + this.w, org.telegram.messenger.i0.L(z10 ? 28.0f : 32.0f));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        try {
            r8 r8Var = this.r;
            if (r8Var != null) {
                int i10 = this.J;
                org.telegram.ui.ActionBar.p6 p6Var = this.G;
                if (i10 == 1) {
                    r8Var.h(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ek, p6Var));
                } else if (i10 == 2) {
                    r8Var.i(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.T7, p6Var), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.a8, p6Var));
                } else if (i10 == 3) {
                    r8Var.h(org.telegram.ui.ActionBar.t6.r1(0.7f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.p7, p6Var)));
                }
            }
            c();
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public s20(Context context, Object obj, org.telegram.messenger.f5 f5Var, boolean z10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        char c10;
        int i10;
        String str;
        r8 r8Var;
        String str2;
        org.telegram.messenger.ic icVar;
        Object obj2;
        TLRPC.Chat chat;
        org.telegram.messenger.ic m10;
        int y3;
        int i11;
        this.f = new RectF();
        this.F = new int[8];
        this.I = true;
        this.G = p6Var;
        this.H = z10;
        this.d = false;
        this.s = f5Var;
        this.e = getResources().getDrawable(R.drawable.delete);
        float L = org.telegram.messenger.i0.L(z10 ? 13.0f : 14.0f);
        TextPaint textPaint = M;
        textPaint.setTextSize(L);
        r8 r8Var2 = new r8((org.telegram.ui.ActionBar.p6) null);
        this.r = r8Var2;
        r8Var2.u(org.telegram.messenger.i0.L(20.0f));
        boolean z11 = obj instanceof String;
        if (z11) {
            String str3 = (String) obj;
            r8Var2.p = 0.8f;
            switch (str3.hashCode()) {
                case -1716307998:
                    i11 = 2;
                    str3.equals("archived");
                    r8Var2.g(11);
                    this.b = -9223372036854775801L;
                    str2 = org.telegram.messenger.cd.L0(2131750805, null);
                    break;
                case -1359418551:
                    if (str3.equals("miniapps")) {
                        this.d = true;
                        r8Var2.i(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.T7, p6Var), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.a8, p6Var));
                        i11 = 2;
                        this.J = 2;
                        str2 = org.telegram.messenger.cd.L0(2131746821, null);
                        break;
                    }
                    i11 = 2;
                    r8Var2.g(11);
                    this.b = -9223372036854775801L;
                    str2 = org.telegram.messenger.cd.L0(2131750805, null);
                    break;
                case -1237460524:
                    if (str3.equals("groups")) {
                        r8Var2.g(6);
                        this.b = -9223372036854775806L;
                        str2 = org.telegram.messenger.cd.L0(2131750775, null);
                        i11 = 2;
                        break;
                    }
                    i11 = 2;
                    r8Var2.g(11);
                    this.b = -9223372036854775801L;
                    str2 = org.telegram.messenger.cd.L0(2131750805, null);
                    break;
                case -1197490811:
                    if (str3.equals("non_contacts")) {
                        r8Var2.g(5);
                        this.b = -9223372036854775807L;
                        str2 = org.telegram.messenger.cd.L0(2131750721, null);
                        i11 = 2;
                        break;
                    }
                    i11 = 2;
                    r8Var2.g(11);
                    this.b = -9223372036854775801L;
                    str2 = org.telegram.messenger.cd.L0(2131750805, null);
                    break;
                case -567451565:
                    if (str3.equals("contacts")) {
                        r8Var2.g(4);
                        this.b = Long.MIN_VALUE;
                        str2 = org.telegram.messenger.cd.L0(2131750792, null);
                        i11 = 2;
                        break;
                    }
                    i11 = 2;
                    r8Var2.g(11);
                    this.b = -9223372036854775801L;
                    str2 = org.telegram.messenger.cd.L0(2131750805, null);
                    break;
                case -318452137:
                    if (str3.equals("premium")) {
                        this.d = true;
                        r8Var2.h(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ek, p6Var));
                        this.J = 1;
                        str2 = org.telegram.messenger.cd.L0(2131746795, null);
                        i11 = 2;
                        break;
                    }
                    i11 = 2;
                    r8Var2.g(11);
                    this.b = -9223372036854775801L;
                    str2 = org.telegram.messenger.cd.L0(2131750805, null);
                    break;
                case -268161860:
                    if (str3.equals("new_chats")) {
                        r8Var2.g(24);
                        this.b = -9223372036854775799L;
                        str2 = org.telegram.messenger.cd.L0(2131750728, null);
                        i11 = 2;
                        break;
                    }
                    i11 = 2;
                    r8Var2.g(11);
                    this.b = -9223372036854775801L;
                    str2 = org.telegram.messenger.cd.L0(2131750805, null);
                    break;
                case 3029900:
                    if (str3.equals("bots")) {
                        r8Var2.g(8);
                        this.b = -9223372036854775804L;
                        str2 = org.telegram.messenger.cd.L0(2131750802, null);
                        i11 = 2;
                        break;
                    }
                    i11 = 2;
                    r8Var2.g(11);
                    this.b = -9223372036854775801L;
                    str2 = org.telegram.messenger.cd.L0(2131750805, null);
                    break;
                case 3496342:
                    if (str3.equals("read")) {
                        r8Var2.g(10);
                        this.b = -9223372036854775802L;
                        str2 = org.telegram.messenger.cd.L0(2131750720, null);
                        i11 = 2;
                        break;
                    }
                    i11 = 2;
                    r8Var2.g(11);
                    this.b = -9223372036854775801L;
                    str2 = org.telegram.messenger.cd.L0(2131750805, null);
                    break;
                case 104264043:
                    if (str3.equals("muted")) {
                        r8Var2.g(9);
                        this.b = -9223372036854775803L;
                        str2 = org.telegram.messenger.cd.L0(2131750737, null);
                        i11 = 2;
                        break;
                    }
                    i11 = 2;
                    r8Var2.g(11);
                    this.b = -9223372036854775801L;
                    str2 = org.telegram.messenger.cd.L0(2131750805, null);
                    break;
                case 151051367:
                    if (str3.equals("existing_chats")) {
                        r8Var2.g(23);
                        this.b = -9223372036854775800L;
                        str2 = org.telegram.messenger.cd.L0(2131750777, null);
                        i11 = 2;
                        break;
                    }
                    i11 = 2;
                    r8Var2.g(11);
                    this.b = -9223372036854775801L;
                    str2 = org.telegram.messenger.cd.L0(2131750805, null);
                    break;
                case 1432626128:
                    if (str3.equals("channels")) {
                        r8Var2.g(7);
                        this.b = -9223372036854775805L;
                        str2 = org.telegram.messenger.cd.L0(2131750801, null);
                        i11 = 2;
                        break;
                    }
                    i11 = 2;
                    r8Var2.g(11);
                    this.b = -9223372036854775801L;
                    str2 = org.telegram.messenger.cd.L0(2131750805, null);
                    break;
                default:
                    i11 = 2;
                    r8Var2.g(11);
                    this.b = -9223372036854775801L;
                    str2 = org.telegram.messenger.cd.L0(2131750805, null);
                    break;
            }
            i10 = i11;
            icVar = null;
            obj2 = null;
            r8Var = r8Var2;
            str = "premium";
            c10 = ' ';
        } else {
            if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                this.b = user.id;
                if (org.telegram.messenger.h20.z(user)) {
                    str2 = org.telegram.messenger.cd.L0(2131746281, null);
                    r8Var2.p = 0.8f;
                    r8Var2.g(12);
                } else if (org.telegram.messenger.h20.B(user)) {
                    str2 = org.telegram.messenger.cd.L0(2131745918, null);
                    r8Var2.p = 0.8f;
                    r8Var2.g(1);
                } else {
                    r8Var2.r(user);
                    String j10 = org.telegram.messenger.h20.j(user, true);
                    c10 = ' ';
                    int indexOf = j10.indexOf(32);
                    j10 = indexOf >= 0 ? j10.substring(0, indexOf) : j10;
                    m10 = org.telegram.messenger.ic.m(org.telegram.messenger.d20.s0, 1, user);
                    String str4 = j10;
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
                    r8Var2.q(chat);
                    this.b = -chat.id;
                    str2 = chat.title;
                    m10 = org.telegram.messenger.ic.m(org.telegram.messenger.d20.s0, 1, chat);
                } else {
                    if (obj instanceof TLRPC.TL_help_country) {
                        TLRPC.TL_help_country tL_help_country = (TLRPC.TL_help_country) obj;
                        String E0 = org.telegram.messenger.cd.E0(tL_help_country.iso2);
                        String str5 = tL_help_country.default_name;
                        r8Var2.g(17);
                        r8Var2.u(org.telegram.messenger.i0.L(24.0f));
                        i10 = 2;
                        str = "premium";
                        r8Var2.k(0L, E0, null, null);
                        r8Var2.h(org.telegram.ui.ActionBar.t6.r1(0.7f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.p7, p6Var)));
                        this.J = 3;
                        this.I = false;
                        r8Var2.w = false;
                        this.b = tL_help_country.default_name.hashCode();
                        this.a = tL_help_country.iso2;
                        icVar = null;
                        r8Var = r8Var2;
                        str2 = str5;
                    } else {
                        i10 = 2;
                        str = "premium";
                        r8Var2.k(f5Var.a, f5Var.i, f5Var.j, null);
                        r8Var = r8Var2;
                        this.b = f5Var.a;
                        this.c = f5Var.b;
                        str2 = !TextUtils.isEmpty(f5Var.i) ? f5Var.i : f5Var.j;
                        icVar = null;
                    }
                    obj2 = icVar;
                }
            }
            obj2 = chat;
            i10 = 2;
            r8Var = r8Var2;
            str = "premium";
            icVar = m10;
        }
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.h = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.i0.L(16.0f));
        imageReceiver.H0(this);
        imageReceiver.y0(this.I ? 0.0f : org.telegram.messenger.i0.L(4.0f), 0.0f, org.telegram.messenger.i0.L(z10 ? 28.0f : 32.0f), org.telegram.messenger.i0.L(z10 ? 28.0f : 32.0f));
        if (org.telegram.messenger.i0.Q1()) {
            y3 = org.telegram.messenger.i0.L(398 - (z10 ? (char) 28 : c10)) / i10;
        } else {
            Point point = org.telegram.messenger.i0.q;
            y3 = org.telegram.messenger.z20.y((z10 ? (char) 28 : c10) + 132, Math.min(point.x, point.y), i10);
        }
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(org.telegram.messenger.k6.m(str2.replace('\n', c10), textPaint.getFontMetricsInt(), false, null, 0), textPaint, y3, TextUtils.TruncateAt.END), textPaint, 1000, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.n = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            this.w = (int) Math.ceil(staticLayout.getLineWidth(0));
            this.x = -staticLayout.getLineLeft(0);
        }
        if (z11 && str.equals((String) obj)) {
            imageReceiver.w0(org.telegram.ui.Cells.j4.b(getContext(), true));
        } else if (z11 && "miniapps".equals((String) obj)) {
            getContext();
            imageReceiver.w0(org.telegram.ui.Cells.j4.a(true));
        } else {
            imageReceiver.p0(icVar, "50_50", r8Var, 0L, null, obj2, 1);
        }
        c();
        org.telegram.messenger.zs.i(this);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
