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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class y10 extends View implements org.telegram.ui.ActionBar.z5 {
    public static final TextPaint N = new TextPaint(1);
    public static final Paint O = new Paint(1);
    public boolean E;
    public long F;
    public final int[] G;
    public final org.telegram.ui.ActionBar.e6 H;
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
    public final u8 r;
    public final org.telegram.messenger.d5 s;
    public final int w;
    public final float x;
    public float y;

    public y10(Context context, Object obj) {
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
        int i3 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = this.H;
        int r12 = org.telegram.ui.ActionBar.k6.r1(0.05f, org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ri, e6Var);
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

    public org.telegram.messenger.d5 getContact() {
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
        int i3 = iArr[6];
        float f12 = iArr[7] - i3;
        float f13 = this.y;
        int argb = Color.argb(i3 + ((int) (f12 * f13)), iArr[0] + ((int) ((iArr[1] - r6) * f13)), iArr[2] + ((int) ((iArr[3] - r8) * f13)), iArr[4] + ((int) ((iArr[5] - r9) * f13)));
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
        int i10 = org.telegram.ui.ActionBar.k6.Pi;
        org.telegram.ui.ActionBar.e6 e6Var = this.H;
        N.setColor(i0.a.f(this.y, org.telegram.ui.ActionBar.k6.w0(i10, e6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.J7, e6Var)));
        this.n.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.n.getText());
        if (this.E) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK.getId(), org.telegram.messenger.bd.M0(2131751599, null)));
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        boolean z10 = this.I;
        setMeasuredDimension(org.telegram.messenger.g0.L((z10 ? 20 : 32) + 25) + this.w, org.telegram.messenger.g0.L(z10 ? 28.0f : 32.0f));
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            u8 u8Var = this.r;
            if (u8Var != null) {
                int i3 = this.K;
                org.telegram.ui.ActionBar.e6 e6Var = this.H;
                if (i3 == 1) {
                    u8Var.h(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ek, e6Var));
                } else if (i3 == 2) {
                    u8Var.i(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.T7, e6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a8, e6Var));
                } else if (i3 == 3) {
                    u8Var.h(org.telegram.ui.ActionBar.k6.r1(0.7f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.p7, e6Var)));
                }
            }
            c();
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public y10(Context context, Object obj, org.telegram.messenger.d5 d5Var, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        char c2;
        int i3;
        String str;
        u8 u8Var;
        String str2;
        org.telegram.messenger.ac acVar;
        Object obj2;
        TLRPC.Chat chat;
        org.telegram.messenger.ac m10;
        int y9;
        int i10;
        this.f = new RectF();
        this.G = new int[8];
        this.J = true;
        this.H = e6Var;
        this.I = z10;
        this.d = false;
        this.s = d5Var;
        this.e = getResources().getDrawable(R.drawable.delete);
        float L = org.telegram.messenger.g0.L(z10 ? 13.0f : 14.0f);
        TextPaint textPaint = N;
        textPaint.setTextSize(L);
        u8 u8Var2 = new u8((org.telegram.ui.ActionBar.e6) null);
        this.r = u8Var2;
        u8Var2.u(org.telegram.messenger.g0.L(20.0f));
        boolean z11 = obj instanceof String;
        if (z11) {
            String str3 = (String) obj;
            u8Var2.p = 0.8f;
            switch (str3.hashCode()) {
                case -1716307998:
                    i10 = 2;
                    str3.equals("archived");
                    u8Var2.g(11);
                    this.b = -9223372036854775801L;
                    str2 = org.telegram.messenger.bd.M0(2131750805, null);
                    break;
                case -1359418551:
                    if (str3.equals("miniapps")) {
                        this.d = true;
                        u8Var2.i(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.T7, e6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a8, e6Var));
                        i10 = 2;
                        this.K = 2;
                        str2 = org.telegram.messenger.bd.M0(2131746814, null);
                        break;
                    }
                    i10 = 2;
                    u8Var2.g(11);
                    this.b = -9223372036854775801L;
                    str2 = org.telegram.messenger.bd.M0(2131750805, null);
                    break;
                case -1237460524:
                    if (str3.equals("groups")) {
                        u8Var2.g(6);
                        this.b = -9223372036854775806L;
                        str2 = org.telegram.messenger.bd.M0(2131750775, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    u8Var2.g(11);
                    this.b = -9223372036854775801L;
                    str2 = org.telegram.messenger.bd.M0(2131750805, null);
                    break;
                case -1197490811:
                    if (str3.equals("non_contacts")) {
                        u8Var2.g(5);
                        this.b = -9223372036854775807L;
                        str2 = org.telegram.messenger.bd.M0(2131750721, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    u8Var2.g(11);
                    this.b = -9223372036854775801L;
                    str2 = org.telegram.messenger.bd.M0(2131750805, null);
                    break;
                case -567451565:
                    if (str3.equals("contacts")) {
                        u8Var2.g(4);
                        this.b = Long.MIN_VALUE;
                        str2 = org.telegram.messenger.bd.M0(2131750792, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    u8Var2.g(11);
                    this.b = -9223372036854775801L;
                    str2 = org.telegram.messenger.bd.M0(2131750805, null);
                    break;
                case -318452137:
                    if (str3.equals("premium")) {
                        this.d = true;
                        u8Var2.h(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ek, e6Var));
                        this.K = 1;
                        str2 = org.telegram.messenger.bd.M0(2131746788, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    u8Var2.g(11);
                    this.b = -9223372036854775801L;
                    str2 = org.telegram.messenger.bd.M0(2131750805, null);
                    break;
                case -268161860:
                    if (str3.equals("new_chats")) {
                        u8Var2.g(24);
                        this.b = -9223372036854775799L;
                        str2 = org.telegram.messenger.bd.M0(2131750728, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    u8Var2.g(11);
                    this.b = -9223372036854775801L;
                    str2 = org.telegram.messenger.bd.M0(2131750805, null);
                    break;
                case 3029900:
                    if (str3.equals("bots")) {
                        u8Var2.g(8);
                        this.b = -9223372036854775804L;
                        str2 = org.telegram.messenger.bd.M0(2131750802, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    u8Var2.g(11);
                    this.b = -9223372036854775801L;
                    str2 = org.telegram.messenger.bd.M0(2131750805, null);
                    break;
                case 3496342:
                    if (str3.equals("read")) {
                        u8Var2.g(10);
                        this.b = -9223372036854775802L;
                        str2 = org.telegram.messenger.bd.M0(2131750720, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    u8Var2.g(11);
                    this.b = -9223372036854775801L;
                    str2 = org.telegram.messenger.bd.M0(2131750805, null);
                    break;
                case 104264043:
                    if (str3.equals("muted")) {
                        u8Var2.g(9);
                        this.b = -9223372036854775803L;
                        str2 = org.telegram.messenger.bd.M0(2131750737, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    u8Var2.g(11);
                    this.b = -9223372036854775801L;
                    str2 = org.telegram.messenger.bd.M0(2131750805, null);
                    break;
                case 151051367:
                    if (str3.equals("existing_chats")) {
                        u8Var2.g(23);
                        this.b = -9223372036854775800L;
                        str2 = org.telegram.messenger.bd.M0(2131750777, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    u8Var2.g(11);
                    this.b = -9223372036854775801L;
                    str2 = org.telegram.messenger.bd.M0(2131750805, null);
                    break;
                case 1432626128:
                    if (str3.equals("channels")) {
                        u8Var2.g(7);
                        this.b = -9223372036854775805L;
                        str2 = org.telegram.messenger.bd.M0(2131750801, null);
                        i10 = 2;
                        break;
                    }
                    i10 = 2;
                    u8Var2.g(11);
                    this.b = -9223372036854775801L;
                    str2 = org.telegram.messenger.bd.M0(2131750805, null);
                    break;
                default:
                    i10 = 2;
                    u8Var2.g(11);
                    this.b = -9223372036854775801L;
                    str2 = org.telegram.messenger.bd.M0(2131750805, null);
                    break;
            }
            i3 = i10;
            acVar = null;
            obj2 = null;
            u8Var = u8Var2;
            str = "premium";
            c2 = ' ';
        } else {
            if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                this.b = user.id;
                if (org.telegram.messenger.l10.z(user)) {
                    str2 = org.telegram.messenger.bd.M0(2131746274, null);
                    u8Var2.p = 0.8f;
                    u8Var2.g(12);
                } else if (org.telegram.messenger.l10.B(user)) {
                    str2 = org.telegram.messenger.bd.M0(2131745911, null);
                    u8Var2.p = 0.8f;
                    u8Var2.g(1);
                } else {
                    u8Var2.r(user);
                    String j10 = org.telegram.messenger.l10.j(user, true);
                    c2 = ' ';
                    int indexOf = j10.indexOf(32);
                    j10 = indexOf >= 0 ? j10.substring(0, indexOf) : j10;
                    m10 = org.telegram.messenger.ac.m(org.telegram.messenger.h10.t0, 1, user);
                    String str4 = j10;
                    chat = user;
                    str2 = str4;
                }
                chat = null;
                m10 = null;
                c2 = ' ';
            } else {
                c2 = ' ';
                if (obj instanceof TLRPC.Chat) {
                    chat = (TLRPC.Chat) obj;
                    u8Var2.q(chat);
                    this.b = -chat.id;
                    str2 = chat.title;
                    m10 = org.telegram.messenger.ac.m(org.telegram.messenger.h10.t0, 1, chat);
                } else {
                    if (obj instanceof TLRPC.TL_help_country) {
                        TLRPC.TL_help_country tL_help_country = (TLRPC.TL_help_country) obj;
                        String F0 = org.telegram.messenger.bd.F0(tL_help_country.iso2);
                        String str5 = tL_help_country.default_name;
                        u8Var2.g(17);
                        u8Var2.u(org.telegram.messenger.g0.L(24.0f));
                        i3 = 2;
                        str = "premium";
                        u8Var2.k(0L, F0, null, null);
                        u8Var2.h(org.telegram.ui.ActionBar.k6.r1(0.7f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.p7, e6Var)));
                        this.K = 3;
                        this.J = false;
                        u8Var2.w = false;
                        this.b = tL_help_country.default_name.hashCode();
                        this.a = tL_help_country.iso2;
                        acVar = null;
                        u8Var = u8Var2;
                        str2 = str5;
                    } else {
                        i3 = 2;
                        str = "premium";
                        u8Var2.k(d5Var.a, d5Var.i, d5Var.j, null);
                        u8Var = u8Var2;
                        this.b = d5Var.a;
                        this.c = d5Var.b;
                        str2 = !TextUtils.isEmpty(d5Var.i) ? d5Var.i : d5Var.j;
                        acVar = null;
                    }
                    obj2 = acVar;
                }
            }
            obj2 = chat;
            i3 = 2;
            u8Var = u8Var2;
            str = "premium";
            acVar = m10;
        }
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.h = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.g0.L(16.0f));
        imageReceiver.H0(this);
        imageReceiver.y0(this.J ? 0.0f : org.telegram.messenger.g0.L(4.0f), 0.0f, org.telegram.messenger.g0.L(z10 ? 28.0f : 32.0f), org.telegram.messenger.g0.L(z10 ? 28.0f : 32.0f));
        if (org.telegram.messenger.g0.Q1()) {
            y9 = org.telegram.messenger.g0.L(398 - (z10 ? (char) 28 : c2)) / i3;
        } else {
            Point point = org.telegram.messenger.g0.q;
            y9 = org.telegram.messenger.camera.q.y((z10 ? (char) 28 : c2) + 132, Math.min(point.x, point.y), i3);
        }
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(org.telegram.messenger.i6.m(str2.replace('\n', c2), textPaint.getFontMetricsInt(), false, null, 0), textPaint, y9, TextUtils.TruncateAt.END), textPaint, 1000, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.n = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            this.w = (int) Math.ceil(staticLayout.getLineWidth(0));
            this.x = -staticLayout.getLineLeft(0);
        }
        if (z11 && str.equals((String) obj)) {
            imageReceiver.w0(org.telegram.ui.Cells.h4.b(getContext(), true));
        } else if (z11 && "miniapps".equals((String) obj)) {
            getContext();
            imageReceiver.w0(org.telegram.ui.Cells.h4.a(true));
        } else {
            imageReceiver.p0(acVar, "50_50", u8Var, 0L, null, obj2, 1);
        }
        c();
        org.telegram.messenger.hs.i(this);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
