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
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.fp;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class p8 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public boolean E;
    public Path F;
    public Paint G;
    public final org.telegram.ui.ActionBar.e6 a;
    public final org.telegram.ui.Components.t8 b;
    public final org.telegram.ui.Components.i9 c;
    public final org.telegram.ui.ActionBar.j5 d;
    public final org.telegram.ui.ActionBar.j5 e;
    public final fp f;
    public final RadioButton h;
    public final Paint n;
    public boolean r;
    public boolean s;
    public boolean w;
    public final boolean[] x;
    public long y;

    public p8(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        org.telegram.ui.Components.t8 t8Var = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        this.b = t8Var;
        this.n = new Paint(1);
        this.r = false;
        this.s = true;
        this.w = true;
        this.x = new boolean[1];
        this.a = e6Var;
        t8Var.r = org.telegram.messenger.g0.L(40.0f);
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
        this.c = i9Var;
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
        addView(i9Var);
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.d = j5Var;
        j5Var.setTypeface(org.telegram.messenger.g0.o());
        j5Var.setTextSize(16);
        int i7 = org.telegram.ui.ActionBar.j6.j5;
        org.telegram.ui.ActionBar.q6.X(j5Var, i7, e6Var);
        j5Var.setGravity(hd.a0 ? 5 : 3);
        ns.i(j5Var);
        addView(j5Var);
        org.telegram.ui.ActionBar.j5 j5Var2 = new org.telegram.ui.ActionBar.j5(context);
        this.e = j5Var2;
        j5Var2.setTextSize(14);
        org.telegram.ui.ActionBar.q6.X(j5Var2, i7, e6Var);
        j5Var2.setGravity(hd.a0 ? 5 : 3);
        ns.i(j5Var2);
        addView(j5Var2);
        fp fpVar = new fp(21, context, e6Var);
        this.f = fpVar;
        int i10 = org.telegram.ui.ActionBar.j6.B5;
        int i11 = org.telegram.ui.ActionBar.j6.j7;
        fpVar.b(i10, i11, org.telegram.ui.ActionBar.j6.C5);
        fpVar.setDrawUnchecked(true);
        fpVar.setDrawBackgroundAsArc(10);
        addView(fpVar);
        fpVar.a(false, false);
        fpVar.setVisibility(8);
        RadioButton radioButton = new RadioButton(context);
        this.h = radioButton;
        radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
        org.telegram.ui.ActionBar.q6.O(radioButton, i11, org.telegram.ui.ActionBar.j6.E5, e6Var);
        addView(radioButton);
        radioButton.setVisibility(8);
        f();
    }

    private void setSubtitle(CharSequence charSequence) {
        org.telegram.ui.ActionBar.j5 j5Var = this.d;
        org.telegram.ui.ActionBar.j5 j5Var2 = this.e;
        if (charSequence == null) {
            j5Var.setTranslationY(0.0f);
            j5Var2.setVisibility(8);
        } else {
            j5Var.setTranslationY(org.telegram.messenger.g0.L(-9.0f));
            j5Var2.setTranslationY(org.telegram.messenger.g0.L(12.0f));
            j5Var2.l(charSequence, false);
            j5Var2.setVisibility(0);
        }
    }

    public final void a(int i7, TLRPC.Chat chat) {
        String H;
        this.y = chat == null ? 0L : -chat.id;
        org.telegram.ui.Components.t8 t8Var = this.b;
        t8Var.q(chat);
        int L = org.telegram.messenger.g0.L(org.telegram.messenger.t3.c0(chat) ? 12.0f : 20.0f);
        org.telegram.ui.Components.i9 i9Var = this.c;
        i9Var.setRoundRadius(L);
        i9Var.f(chat, t8Var);
        String str = chat.title;
        org.telegram.ui.ActionBar.j5 j5Var = this.d;
        j5Var.l(org.telegram.messenger.j6.m(str, j5Var.getPaint().getFontMetricsInt(), false, null, 0), false);
        boolean[] zArr = this.x;
        zArr[0] = false;
        if (this.r) {
            if (i7 <= 0) {
                i7 = chat.participants_count;
            }
            boolean V = org.telegram.messenger.t3.V(chat);
            if (i7 >= 1) {
                H = hd.G(i7, V ? "Subscribers" : "Members", new Object[0]);
            } else {
                H = hd.M0(V ? 2131751390 : 2131754876, null);
            }
        } else {
            H = (!org.telegram.messenger.t3.T(chat) || chat.megagroup) ? i7 >= 1 ? hd.H(',', "Members", i7 - 1) : chat.has_geo ? hd.M0(2131748642, null) : !org.telegram.messenger.t3.t0(chat) ? hd.M0(2131748641, null).toLowerCase() : hd.M0(2131748638, null).toLowerCase() : i7 >= 1 ? hd.H(',', "Subscribers", i7 - 1) : !org.telegram.messenger.t3.t0(chat) ? hd.M0(2131752329, null).toLowerCase() : hd.M0(2131752318, null).toLowerCase();
        }
        setSubtitle(H);
        org.telegram.ui.ActionBar.q6.X(this.e, zArr[0] ? org.telegram.ui.ActionBar.j6.n5 : org.telegram.ui.ActionBar.j6.r5, this.a);
        this.f.setVisibility(this.s ? 0 : 8);
        this.h.setVisibility(8);
        b(false, i7 > 200 ? 0.3f : 1.0f);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.G6));
    }

    public final void b(boolean z10, float f10) {
        RadioButton radioButton = this.h;
        fp fpVar = this.f;
        if (!z10) {
            fpVar.animate().cancel();
            fpVar.setAlpha(f10);
            radioButton.animate().cancel();
            radioButton.setAlpha(f10);
            return;
        }
        if (Math.abs(fpVar.getAlpha() - f10) > 0.1d) {
            fpVar.animate().cancel();
            fpVar.animate().alpha(f10).start();
        }
        if (Math.abs(radioButton.getAlpha() - f10) > 0.1d) {
            radioButton.animate().cancel();
            radioButton.animate().alpha(f10).start();
        }
    }

    public final void c(boolean z10, boolean z11) {
        fp fpVar = this.f;
        if (fpVar.getVisibility() == 0) {
            fpVar.a(z10, z11);
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
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        org.telegram.ui.ActionBar.j5 j5Var = this.d;
        org.telegram.ui.ActionBar.j5 j5Var2 = this.e;
        org.telegram.ui.Components.t8 t8Var = this.b;
        if (i7 == 4) {
            j5Var.l(hd.M0(2131744528, null), false);
            if (i10 == 1 && user != null) {
                setSubtitle(g(org.telegram.messenger.j6.m(hd.a0(null, null, 2131744524, q10.p(user)), j5Var2.getPaint().getFontMetricsInt(), false, null, 0)));
            } else if (i10 > 0) {
                setSubtitle(g(hd.G(i10, "StoryPrivacyOptionExcludePeople", new Object[0])));
            } else {
                setSubtitle(g(hd.M0(2131744529, null)));
            }
            org.telegram.ui.ActionBar.q6.X(j5Var2, org.telegram.ui.ActionBar.j6.n5, e6Var);
            t8Var.g(7);
            t8Var.i(-15292942, -15630089);
        } else if (i7 == 2) {
            j5Var.l(hd.M0(2131744530, null), false);
            if (i10 == 1 && user != null) {
                setSubtitle(g(org.telegram.messenger.j6.m(hd.a0(null, null, 2131744524, q10.p(user)), j5Var2.getPaint().getFontMetricsInt(), false, null, 0)));
            } else if (i10 > 0) {
                setSubtitle(g(hd.G(i10, "StoryPrivacyOptionExcludePeople", new Object[0])));
            } else {
                setSubtitle(g(hd.M0(2131744529, null)));
            }
            org.telegram.ui.ActionBar.q6.X(j5Var2, org.telegram.ui.ActionBar.j6.n5, e6Var);
            t8Var.g(4);
            t8Var.i(-3905294, -6923014);
        } else if (i7 == 1) {
            j5Var.l(hd.M0(2131744532, null), false);
            if (i10 == 1 && user != null) {
                setSubtitle(g(org.telegram.messenger.j6.m(q10.p(user), j5Var2.getPaint().getFontMetricsInt(), false, null, 0)));
            } else if (i10 > 0) {
                setSubtitle(g(hd.G(i10, "StoryPrivacyOptionPeople", new Object[0])));
            } else {
                setSubtitle(g(hd.M0(2131744531, null)));
            }
            org.telegram.ui.ActionBar.q6.X(j5Var2, org.telegram.ui.ActionBar.j6.n5, e6Var);
            t8Var.g(15);
            t8Var.i(-7808710, -13781445);
        } else if (i7 == 3) {
            j5Var.l(hd.M0(2131744520, null), false);
            if (i10 == 1 && user != null) {
                setSubtitle(g(org.telegram.messenger.j6.m(q10.p(user), j5Var2.getPaint().getFontMetricsInt(), false, null, 0)));
            } else if (i10 > 0) {
                setSubtitle(g(hd.G(i10, "StoryPrivacyOptionPeople", new Object[0])));
            } else {
                setSubtitle(g(hd.M0(2131744519, null)));
            }
            org.telegram.ui.ActionBar.q6.X(j5Var2, org.telegram.ui.ActionBar.j6.n5, e6Var);
            t8Var.g(6);
            t8Var.i(-18621, -618956);
        }
        this.f.setVisibility(8);
        this.h.setVisibility(this.s ? 0 : 8);
        org.telegram.ui.Components.i9 i9Var = this.c;
        i9Var.setImageDrawable(t8Var);
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
    }

    public final void f() {
        float f10;
        float f11;
        float f12;
        int i7 = (hd.a0 ? 5 : 3) | 16;
        boolean z10 = this.s;
        this.c.setLayoutParams(c8.ja.d(40, 40.0f, i7, z10 ? 53.0f : 16.0f, 0.0f, z10 ? 53.0f : 16.0f, 0.0f));
        boolean z11 = hd.a0;
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
        this.d.setLayoutParams(c8.ja.d(-1, -2.0f, i10, f10, 0.0f, f11, 0.0f));
        boolean z12 = hd.a0;
        int i11 = (z12 ? 5 : 3) | 16;
        if (z12) {
            f12 = 20.0f;
        } else {
            f12 = this.s ? 105 : 68;
        }
        if (z12) {
            f13 = this.s ? 105 : 68;
        }
        this.e.setLayoutParams(c8.ja.d(-1, -2.0f, i11, f12, 0.0f, f13, 0.0f));
        this.f.setLayoutParams(c8.ja.d(24, 24.0f, (hd.a0 ? 5 : 3) | 16, 13.0f, 0.0f, 14.0f, 0.0f));
        this.h.setLayoutParams(c8.ja.d(22, 22.0f, (hd.a0 ? 5 : 3) | 16, 14.0f, 0.0f, 15.0f, 0.0f));
    }

    public final SpannableStringBuilder g(CharSequence charSequence) {
        SpannableString spannableString = new SpannableString(">");
        Drawable drawable = getContext().getResources().getDrawable(R.drawable.attach_arrow_right);
        eq eqVar = new eq(2, drawable);
        drawable.setBounds(0, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(12.0f));
        spannableString.setSpan(eqVar, 0, spannableString.length(), 33);
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
            int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.d7, this.a);
            Paint paint2 = this.n;
            paint2.setColor(w02);
            if (hd.a0) {
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
        fp fpVar = this.f;
        if (fpVar != null) {
            try {
                if (fpVar.getVisibility() == 0) {
                    z10 = true;
                    radioButton = this.h;
                    if (radioButton != null && radioButton.getVisibility() == 0) {
                        z11 = true;
                    }
                    if (!z10 || z11) {
                        accessibilityNodeInfo.setCheckable(true);
                        accessibilityNodeInfo.setChecked(!z10 ? fpVar.a.q : radioButton.f);
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
        accessibilityNodeInfo.setChecked(!z10 ? fpVar.a.q : radioButton.f);
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
        float L = hd.a0 ? org.telegram.messenger.g0.L(31.0f) : getMeasuredWidth() - org.telegram.messenger.g0.L(31.0f);
        float measuredHeight = getMeasuredHeight() / 2.0f;
        float f10 = hd.a0 ? -1.0f : 1.0f;
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
        this.G.setColor(org.telegram.ui.ActionBar.j6.r1(0.3f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G6, this.a)));
    }

    public void set(Object obj) {
        boolean z10 = obj instanceof TLRPC.User;
        org.telegram.ui.ActionBar.j5 j5Var = this.d;
        if (z10) {
            j5Var.setTypeface(org.telegram.messenger.g0.o());
            j5Var.setTranslationX(0.0f);
            setUser((TLRPC.User) obj);
        } else if (obj instanceof TLRPC.Chat) {
            j5Var.setTypeface(org.telegram.messenger.g0.o());
            j5Var.setTranslationX(0.0f);
            a(0, (TLRPC.Chat) obj);
        } else if (obj instanceof String) {
            j5Var.setTypeface(null);
            j5Var.setTranslationX((-org.telegram.messenger.g0.L(52.0f)) * (hd.a0 ? -1 : 1));
            j5Var.l((String) obj, false);
        }
    }

    public void setDivider(boolean z10) {
        this.E = z10;
        setWillNotDraw(!z10 && (this.s || !this.r));
    }

    public void setRedCheckbox(boolean z10) {
        this.f.b(z10 ? org.telegram.ui.ActionBar.j6.nk : org.telegram.ui.ActionBar.j6.B5, org.telegram.ui.ActionBar.j6.j7, org.telegram.ui.ActionBar.j6.C5);
    }

    public void setUser(TLRPC.User user) {
        this.y = user == null ? 0L : user.id;
        org.telegram.ui.Components.t8 t8Var = this.b;
        t8Var.r(user);
        int L = org.telegram.messenger.g0.L(20.0f);
        org.telegram.ui.Components.i9 i9Var = this.c;
        i9Var.setRoundRadius(L);
        i9Var.f(user, t8Var);
        String p10 = q10.p(user);
        org.telegram.ui.ActionBar.j5 j5Var = this.d;
        j5Var.l(org.telegram.messenger.j6.m(p10, j5Var.getPaint().getFontMetricsInt(), false, null, 0), false);
        boolean[] zArr = this.x;
        zArr[0] = false;
        boolean z10 = this.r;
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        org.telegram.ui.ActionBar.j5 j5Var2 = this.e;
        if (z10) {
            setSubtitle(hd.M0(2131743349, null));
            org.telegram.ui.ActionBar.q6.X(j5Var2, org.telegram.ui.ActionBar.j6.r5, e6Var);
        } else {
            setSubtitle(hd.d0(m10.t0, user, zArr, null));
            org.telegram.ui.ActionBar.q6.X(j5Var2, zArr[0] ? org.telegram.ui.ActionBar.j6.n5 : org.telegram.ui.ActionBar.j6.r5, e6Var);
        }
        int i7 = this.s ? 0 : 8;
        fp fpVar = this.f;
        fpVar.setVisibility(i7);
        fpVar.setAlpha(1.0f);
        this.h.setVisibility(8);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            Paint paint = this.G;
            if (paint != null) {
                paint.setColor(org.telegram.ui.ActionBar.j6.r1(0.3f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G6, this.a)));
                invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
