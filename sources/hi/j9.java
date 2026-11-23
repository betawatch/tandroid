package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.lp;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class j9 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public boolean E;
    public Path F;
    public Paint G;
    public final org.telegram.ui.ActionBar.i6 a;
    public final org.telegram.ui.Components.a9 b;
    public final org.telegram.ui.Components.p9 c;
    public final org.telegram.ui.ActionBar.n5 d;
    public final org.telegram.ui.ActionBar.n5 e;
    public final lp f;
    public final RadioButton h;
    public final Paint n;
    public boolean r;
    public boolean s;
    public boolean w;
    public final boolean[] x;
    public long y;

    public j9(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        org.telegram.ui.Components.a9 a9Var = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
        this.b = a9Var;
        this.n = new Paint(1);
        this.r = false;
        this.s = true;
        this.w = true;
        this.x = new boolean[1];
        this.a = i6Var;
        a9Var.r = org.telegram.messenger.g0.L(40.0f);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.c = p9Var;
        p9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
        addView(p9Var);
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.d = n5Var;
        n5Var.setTypeface(org.telegram.messenger.g0.o());
        n5Var.setTextSize(16);
        int i7 = org.telegram.ui.ActionBar.n6.j5;
        org.telegram.ui.ActionBar.u6.X(n5Var, i7, i6Var);
        n5Var.setGravity(gd.a0 ? 5 : 3);
        ks.i(n5Var);
        addView(n5Var);
        org.telegram.ui.ActionBar.n5 n5Var2 = new org.telegram.ui.ActionBar.n5(context);
        this.e = n5Var2;
        n5Var2.setTextSize(14);
        org.telegram.ui.ActionBar.u6.X(n5Var2, i7, i6Var);
        n5Var2.setGravity(gd.a0 ? 5 : 3);
        ks.i(n5Var2);
        addView(n5Var2);
        lp lpVar = new lp(21, context, i6Var);
        this.f = lpVar;
        int i10 = org.telegram.ui.ActionBar.n6.B5;
        int i11 = org.telegram.ui.ActionBar.n6.j7;
        lpVar.b(i10, i11, org.telegram.ui.ActionBar.n6.C5);
        lpVar.setDrawUnchecked(true);
        lpVar.setDrawBackgroundAsArc(10);
        addView(lpVar);
        lpVar.a(false, false);
        lpVar.setVisibility(8);
        RadioButton radioButton = new RadioButton(context);
        this.h = radioButton;
        radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
        org.telegram.ui.ActionBar.u6.O(radioButton, i11, org.telegram.ui.ActionBar.n6.E5, i6Var);
        addView(radioButton);
        radioButton.setVisibility(8);
        f();
    }

    private void setSubtitle(CharSequence charSequence) {
        org.telegram.ui.ActionBar.n5 n5Var = this.d;
        org.telegram.ui.ActionBar.n5 n5Var2 = this.e;
        if (charSequence == null) {
            n5Var.setTranslationY(0.0f);
            n5Var2.setVisibility(8);
        } else {
            n5Var.setTranslationY(org.telegram.messenger.g0.L(-9.0f));
            n5Var2.setTranslationY(org.telegram.messenger.g0.L(12.0f));
            n5Var2.l(charSequence, false);
            n5Var2.setVisibility(0);
        }
    }

    public final void a(int i7, TLRPC.Chat chat) {
        String H;
        this.y = chat == null ? 0L : -chat.id;
        org.telegram.ui.Components.a9 a9Var = this.b;
        a9Var.q(chat);
        int L = org.telegram.messenger.g0.L(org.telegram.messenger.v3.c0(chat) ? 12.0f : 20.0f);
        org.telegram.ui.Components.p9 p9Var = this.c;
        p9Var.setRoundRadius(L);
        p9Var.f(chat, a9Var);
        String str = chat.title;
        org.telegram.ui.ActionBar.n5 n5Var = this.d;
        n5Var.l(org.telegram.messenger.j6.m(str, n5Var.getPaint().getFontMetricsInt(), false, null, 0), false);
        boolean[] zArr = this.x;
        zArr[0] = false;
        if (this.r) {
            if (i7 <= 0) {
                i7 = chat.participants_count;
            }
            boolean V = org.telegram.messenger.v3.V(chat);
            if (i7 >= 1) {
                H = gd.G(i7, V ? "Subscribers" : "Members", new Object[0]);
            } else {
                H = gd.N0(V ? 2131751378 : 2131754876, null);
            }
        } else {
            H = (!org.telegram.messenger.v3.T(chat) || chat.megagroup) ? i7 >= 1 ? gd.H(',', "Members", i7 - 1) : chat.has_geo ? gd.N0(2131748449, null) : !org.telegram.messenger.v3.t0(chat) ? gd.N0(2131748448, null).toLowerCase() : gd.N0(2131748445, null).toLowerCase() : i7 >= 1 ? gd.H(',', "Subscribers", i7 - 1) : !org.telegram.messenger.v3.t0(chat) ? gd.N0(2131752317, null).toLowerCase() : gd.N0(2131752306, null).toLowerCase();
        }
        setSubtitle(H);
        org.telegram.ui.ActionBar.u6.X(this.e, zArr[0] ? org.telegram.ui.ActionBar.n6.n5 : org.telegram.ui.ActionBar.n6.r5, this.a);
        this.f.setVisibility(this.s ? 0 : 8);
        this.h.setVisibility(8);
        b(false, i7 > 200 ? 0.3f : 1.0f);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
    }

    public final void b(boolean z10, float f10) {
        RadioButton radioButton = this.h;
        lp lpVar = this.f;
        if (!z10) {
            lpVar.animate().cancel();
            lpVar.setAlpha(f10);
            radioButton.animate().cancel();
            radioButton.setAlpha(f10);
            return;
        }
        if (Math.abs(lpVar.getAlpha() - f10) > 0.1d) {
            lpVar.animate().cancel();
            lpVar.animate().alpha(f10).start();
        }
        if (Math.abs(radioButton.getAlpha() - f10) > 0.1d) {
            radioButton.animate().cancel();
            radioButton.animate().alpha(f10).start();
        }
    }

    public final void c(boolean z10, boolean z11) {
        lp lpVar = this.f;
        if (lpVar.getVisibility() == 0) {
            lpVar.a(z10, z11);
        }
        RadioButton radioButton = this.h;
        if (radioButton.getVisibility() == 0) {
            radioButton.a(z10, z11);
        }
    }

    public final void d(boolean z10, boolean z11) {
        this.r = z10;
        if (z11 != this.s) {
            this.s = z11;
            f();
        }
        if (!this.s) {
            this.h.setVisibility(8);
            this.f.setVisibility(8);
        }
        setWillNotDraw(!this.E && (this.s || !this.r));
    }

    public final void e(int i7, int i10, TLRPC.User user) {
        org.telegram.ui.ActionBar.i6 i6Var = this.a;
        org.telegram.ui.ActionBar.n5 n5Var = this.d;
        org.telegram.ui.ActionBar.n5 n5Var2 = this.e;
        org.telegram.ui.Components.a9 a9Var = this.b;
        if (i7 == 4) {
            n5Var.l(gd.N0(2131744284, null), false);
            if (i10 == 1 && user != null) {
                setSubtitle(g(org.telegram.messenger.j6.m(gd.a0(null, null, 2131744280, n10.q(user)), n5Var2.getPaint().getFontMetricsInt(), false, null, 0)));
            } else if (i10 > 0) {
                setSubtitle(g(gd.G(i10, "StoryPrivacyOptionExcludePeople", new Object[0])));
            } else {
                setSubtitle(g(gd.N0(2131744285, null)));
            }
            org.telegram.ui.ActionBar.u6.X(n5Var2, org.telegram.ui.ActionBar.n6.n5, i6Var);
            a9Var.g(7);
            a9Var.i(-15292942, -15630089);
        } else if (i7 == 2) {
            n5Var.l(gd.N0(2131744286, null), false);
            if (i10 == 1 && user != null) {
                setSubtitle(g(org.telegram.messenger.j6.m(gd.a0(null, null, 2131744280, n10.q(user)), n5Var2.getPaint().getFontMetricsInt(), false, null, 0)));
            } else if (i10 > 0) {
                setSubtitle(g(gd.G(i10, "StoryPrivacyOptionExcludePeople", new Object[0])));
            } else {
                setSubtitle(g(gd.N0(2131744285, null)));
            }
            org.telegram.ui.ActionBar.u6.X(n5Var2, org.telegram.ui.ActionBar.n6.n5, i6Var);
            a9Var.g(4);
            a9Var.i(-3905294, -6923014);
        } else if (i7 == 1) {
            n5Var.l(gd.N0(2131744288, null), false);
            if (i10 == 1 && user != null) {
                setSubtitle(g(org.telegram.messenger.j6.m(n10.q(user), n5Var2.getPaint().getFontMetricsInt(), false, null, 0)));
            } else if (i10 > 0) {
                setSubtitle(g(gd.G(i10, "StoryPrivacyOptionPeople", new Object[0])));
            } else {
                setSubtitle(g(gd.N0(2131744287, null)));
            }
            org.telegram.ui.ActionBar.u6.X(n5Var2, org.telegram.ui.ActionBar.n6.n5, i6Var);
            a9Var.g(15);
            a9Var.i(-7808710, -13781445);
        } else if (i7 == 3) {
            n5Var.l(gd.N0(2131744276, null), false);
            if (i10 == 1 && user != null) {
                setSubtitle(g(org.telegram.messenger.j6.m(n10.q(user), n5Var2.getPaint().getFontMetricsInt(), false, null, 0)));
            } else if (i10 > 0) {
                setSubtitle(g(gd.G(i10, "StoryPrivacyOptionPeople", new Object[0])));
            } else {
                setSubtitle(g(gd.N0(2131744275, null)));
            }
            org.telegram.ui.ActionBar.u6.X(n5Var2, org.telegram.ui.ActionBar.n6.n5, i6Var);
            a9Var.g(6);
            a9Var.i(-18621, -618956);
        }
        this.f.setVisibility(8);
        this.h.setVisibility(this.s ? 0 : 8);
        org.telegram.ui.Components.p9 p9Var = this.c;
        p9Var.setImageDrawable(a9Var);
        p9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
    }

    public final void f() {
        float f10;
        float f11;
        float f12;
        int i7 = (gd.a0 ? 5 : 3) | 16;
        boolean z10 = this.s;
        this.c.setLayoutParams(c8.na.d(40, 40.0f, i7, z10 ? 53.0f : 16.0f, 0.0f, z10 ? 53.0f : 16.0f, 0.0f));
        boolean z11 = gd.a0;
        int i10 = (z11 ? 5 : 3) | 16;
        float f13 = 20.0f;
        if (z11) {
            f10 = 20.0f;
        } else {
            f10 = this.s ? 105 : 68;
        }
        if (z11) {
            f11 = this.s ? 105 : 68;
        } else {
            f11 = 20.0f;
        }
        this.d.setLayoutParams(c8.na.d(-1, -2.0f, i10, f10, 0.0f, f11, 0.0f));
        boolean z12 = gd.a0;
        int i11 = (z12 ? 5 : 3) | 16;
        if (z12) {
            f12 = 20.0f;
        } else {
            f12 = this.s ? 105 : 68;
        }
        if (z12) {
            f13 = this.s ? 105 : 68;
        }
        this.e.setLayoutParams(c8.na.d(-1, -2.0f, i11, f12, 0.0f, f13, 0.0f));
        this.f.setLayoutParams(c8.na.d(24, 24.0f, (gd.a0 ? 5 : 3) | 16, 13.0f, 0.0f, 14.0f, 0.0f));
        this.h.setLayoutParams(c8.na.d(22, 22.0f, (gd.a0 ? 5 : 3) | 16, 14.0f, 0.0f, 15.0f, 0.0f));
    }

    public final SpannableStringBuilder g(CharSequence charSequence) {
        SpannableString spannableString = new SpannableString(">");
        Drawable drawable = getContext().getResources().getDrawable(R.drawable.attach_arrow_right);
        kq kqVar = new kq(2, drawable);
        drawable.setBounds(0, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(12.0f));
        spannableString.setSpan(kqVar, 0, spannableString.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(charSequence).append((CharSequence) " ").append((CharSequence) spannableString);
        return spannableStringBuilder;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        Paint paint;
        super.onDraw(canvas);
        if (this.E) {
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.d7, this.a);
            Paint paint2 = this.n;
            paint2.setColor(w02);
            if (gd.a0) {
                canvas2 = canvas;
                canvas2.drawRect(0.0f, getHeight() - 1, getWidth() - org.telegram.messenger.g0.L(105.0f), getHeight(), paint2);
            } else {
                canvas2 = canvas;
                canvas2.drawRect(org.telegram.messenger.g0.L(105.0f), getHeight() - 1, getWidth(), getHeight(), paint2);
            }
        } else {
            canvas2 = canvas;
        }
        Path path = this.F;
        if (path == null || (paint = this.G) == null || this.s || !this.r || !this.w) {
            return;
        }
        canvas2.drawPath(path, paint);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0026 A[Catch: Exception -> 0x003a, TryCatch #0 {Exception -> 0x003a, blocks: (B:27:0x0009, B:6:0x0016, B:13:0x0021, B:15:0x0026, B:16:0x002d, B:19:0x0037, B:25:0x002b), top: B:26:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x002b A[Catch: Exception -> 0x003a, TryCatch #0 {Exception -> 0x003a, blocks: (B:27:0x0009, B:6:0x0016, B:13:0x0021, B:15:0x0026, B:16:0x002d, B:19:0x0037, B:25:0x002b), top: B:26:0x0009 }] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        RadioButton radioButton;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        boolean z11 = false;
        lp lpVar = this.f;
        if (lpVar != null) {
            try {
                if (lpVar.getVisibility() == 0) {
                    z10 = true;
                    radioButton = this.h;
                    if (radioButton != null && radioButton.getVisibility() == 0) {
                        z11 = true;
                    }
                    if (!z10 || z11) {
                        accessibilityNodeInfo.setCheckable(true);
                        accessibilityNodeInfo.setChecked(!z10 ? lpVar.a.q : radioButton.f);
                        accessibilityNodeInfo.setClassName(!z10 ? "android.widget.CheckBox" : "android.widget.RadioButton");
                    }
                    return;
                }
            } catch (Exception unused) {
                return;
            }
        }
        z10 = false;
        radioButton = this.h;
        if (radioButton != null) {
            z11 = true;
        }
        if (z10) {
        }
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(!z10 ? lpVar.a.q : radioButton.f);
        accessibilityNodeInfo.setClassName(!z10 ? "android.widget.CheckBox" : "android.widget.RadioButton");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L((!this.r || this.s) ? 56.0f : 62.0f), TLObject.FLAG_30));
        if (this.s || !this.r) {
            return;
        }
        Path path = this.F;
        if (path == null) {
            this.F = new Path();
        } else {
            path.rewind();
        }
        float L = gd.a0 ? org.telegram.messenger.g0.L(31.0f) : getMeasuredWidth() - org.telegram.messenger.g0.L(31.0f);
        float measuredHeight = getMeasuredHeight() / 2.0f;
        float f10 = gd.a0 ? -1.0f : 1.0f;
        this.F.moveTo(L, measuredHeight - org.telegram.messenger.g0.L(6.0f));
        this.F.lineTo((f10 * org.telegram.messenger.g0.L(6.0f)) + L, measuredHeight);
        this.F.lineTo(L, measuredHeight + org.telegram.messenger.g0.L(6.0f));
        if (this.G == null) {
            Paint paint = new Paint(1);
            this.G = paint;
            paint.setStyle(Paint.Style.STROKE);
            this.G.setStrokeCap(Paint.Cap.ROUND);
        }
        this.G.setStrokeWidth(org.telegram.messenger.g0.N(1.86f));
        this.G.setColor(org.telegram.ui.ActionBar.n6.r1(0.3f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G6, this.a)));
    }

    public void set(Object obj) {
        boolean z10 = obj instanceof TLRPC.User;
        org.telegram.ui.ActionBar.n5 n5Var = this.d;
        if (z10) {
            n5Var.setTypeface(org.telegram.messenger.g0.o());
            n5Var.setTranslationX(0.0f);
            setUser((TLRPC.User) obj);
        } else if (obj instanceof TLRPC.Chat) {
            n5Var.setTypeface(org.telegram.messenger.g0.o());
            n5Var.setTranslationX(0.0f);
            a(0, (TLRPC.Chat) obj);
        } else if (obj instanceof String) {
            n5Var.setTypeface(null);
            n5Var.setTranslationX((-org.telegram.messenger.g0.L(52.0f)) * (gd.a0 ? -1 : 1));
            n5Var.l((String) obj, false);
        }
    }

    public void setDivider(boolean z10) {
        this.E = z10;
        setWillNotDraw(!z10 && (this.s || !this.r));
    }

    public void setRedCheckbox(boolean z10) {
        this.f.b(z10 ? org.telegram.ui.ActionBar.n6.nk : org.telegram.ui.ActionBar.n6.B5, org.telegram.ui.ActionBar.n6.j7, org.telegram.ui.ActionBar.n6.C5);
    }

    public void setUser(TLRPC.User user) {
        this.y = user == null ? 0L : user.id;
        org.telegram.ui.Components.a9 a9Var = this.b;
        a9Var.r(user);
        int L = org.telegram.messenger.g0.L(20.0f);
        org.telegram.ui.Components.p9 p9Var = this.c;
        p9Var.setRoundRadius(L);
        p9Var.f(user, a9Var);
        String q10 = n10.q(user);
        org.telegram.ui.ActionBar.n5 n5Var = this.d;
        n5Var.l(org.telegram.messenger.j6.m(q10, n5Var.getPaint().getFontMetricsInt(), false, null, 0), false);
        boolean[] zArr = this.x;
        zArr[0] = false;
        boolean z10 = this.r;
        org.telegram.ui.ActionBar.i6 i6Var = this.a;
        org.telegram.ui.ActionBar.n5 n5Var2 = this.e;
        if (z10) {
            setSubtitle(gd.N0(2131743099, null));
            org.telegram.ui.ActionBar.u6.X(n5Var2, org.telegram.ui.ActionBar.n6.r5, i6Var);
        } else {
            setSubtitle(gd.d0(i10.t0, user, zArr, null));
            org.telegram.ui.ActionBar.u6.X(n5Var2, zArr[0] ? org.telegram.ui.ActionBar.n6.n5 : org.telegram.ui.ActionBar.n6.r5, i6Var);
        }
        int i7 = this.s ? 0 : 8;
        lp lpVar = this.f;
        lpVar.setVisibility(i7);
        lpVar.setAlpha(1.0f);
        this.h.setVisibility(8);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        try {
            Paint paint = this.G;
            if (paint != null) {
                paint.setColor(org.telegram.ui.ActionBar.n6.r1(0.3f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G6, this.a)));
                invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
