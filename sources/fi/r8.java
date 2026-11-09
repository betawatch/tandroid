package fi;

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
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.wp;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class r8 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public boolean D;
    public Path E;
    public Paint F;
    public final org.telegram.ui.ActionBar.g6 a;
    public final org.telegram.ui.Components.w8 b;
    public final org.telegram.ui.Components.l9 c;
    public final org.telegram.ui.ActionBar.l5 d;
    public final org.telegram.ui.ActionBar.l5 e;
    public final wo f;
    public final RadioButton h;
    public final Paint n;
    public boolean r;
    public boolean s;
    public boolean w;
    public final boolean[] x;
    public long y;

    public r8(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.g6) null);
        this.b = w8Var;
        this.n = new Paint(1);
        this.r = false;
        this.s = true;
        this.w = true;
        this.x = new boolean[1];
        this.a = g6Var;
        w8Var.r = org.telegram.messenger.g0.L(40.0f);
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.c = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
        addView(l9Var);
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.d = l5Var;
        l5Var.setTypeface(org.telegram.messenger.g0.o());
        l5Var.setTextSize(16);
        int i7 = org.telegram.ui.ActionBar.l6.j5;
        org.telegram.ui.ActionBar.s6.X(l5Var, i7, g6Var);
        l5Var.setGravity(id.a0 ? 5 : 3);
        qs.i(l5Var);
        addView(l5Var);
        org.telegram.ui.ActionBar.l5 l5Var2 = new org.telegram.ui.ActionBar.l5(context);
        this.e = l5Var2;
        l5Var2.setTextSize(14);
        org.telegram.ui.ActionBar.s6.X(l5Var2, i7, g6Var);
        l5Var2.setGravity(id.a0 ? 5 : 3);
        qs.i(l5Var2);
        addView(l5Var2);
        wo woVar = new wo(21, context, g6Var);
        this.f = woVar;
        int i10 = org.telegram.ui.ActionBar.l6.B5;
        int i11 = org.telegram.ui.ActionBar.l6.j7;
        woVar.b(i10, i11, org.telegram.ui.ActionBar.l6.C5);
        woVar.setDrawUnchecked(true);
        woVar.setDrawBackgroundAsArc(10);
        addView(woVar);
        woVar.a(false, false);
        woVar.setVisibility(8);
        RadioButton radioButton = new RadioButton(context);
        this.h = radioButton;
        radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
        org.telegram.ui.ActionBar.s6.O(radioButton, i11, org.telegram.ui.ActionBar.l6.E5, g6Var);
        addView(radioButton);
        radioButton.setVisibility(8);
        f();
    }

    private void setSubtitle(CharSequence charSequence) {
        org.telegram.ui.ActionBar.l5 l5Var = this.d;
        org.telegram.ui.ActionBar.l5 l5Var2 = this.e;
        if (charSequence == null) {
            l5Var.setTranslationY(0.0f);
            l5Var2.setVisibility(8);
        } else {
            l5Var.setTranslationY(org.telegram.messenger.g0.L(-9.0f));
            l5Var2.setTranslationY(org.telegram.messenger.g0.L(12.0f));
            l5Var2.l(charSequence, false);
            l5Var2.setVisibility(0);
        }
    }

    public final void a(int i7, TLRPC.Chat chat) {
        String H;
        this.y = chat == null ? 0L : -chat.id;
        org.telegram.ui.Components.w8 w8Var = this.b;
        w8Var.q(chat);
        int L = org.telegram.messenger.g0.L(org.telegram.messenger.t3.c0(chat) ? 12.0f : 20.0f);
        org.telegram.ui.Components.l9 l9Var = this.c;
        l9Var.setRoundRadius(L);
        l9Var.e(chat, w8Var);
        String str = chat.title;
        org.telegram.ui.ActionBar.l5 l5Var = this.d;
        l5Var.l(org.telegram.messenger.i6.m(str, l5Var.getPaint().getFontMetricsInt(), false, null, 0), false);
        boolean[] zArr = this.x;
        zArr[0] = false;
        if (this.r) {
            if (i7 <= 0) {
                i7 = chat.participants_count;
            }
            boolean V = org.telegram.messenger.t3.V(chat);
            if (i7 >= 1) {
                H = id.G(i7, V ? "Subscribers" : "Members", new Object[0]);
            } else {
                H = id.M0(V ? 2131751390 : 2131754876, null);
            }
        } else {
            H = (!org.telegram.messenger.t3.T(chat) || chat.megagroup) ? i7 >= 1 ? id.H(',', "Members", i7 - 1) : chat.has_geo ? id.M0(2131748642, null) : !org.telegram.messenger.t3.t0(chat) ? id.M0(2131748641, null).toLowerCase() : id.M0(2131748638, null).toLowerCase() : i7 >= 1 ? id.H(',', "Subscribers", i7 - 1) : !org.telegram.messenger.t3.t0(chat) ? id.M0(2131752329, null).toLowerCase() : id.M0(2131752318, null).toLowerCase();
        }
        setSubtitle(H);
        org.telegram.ui.ActionBar.s6.X(this.e, zArr[0] ? org.telegram.ui.ActionBar.l6.n5 : org.telegram.ui.ActionBar.l6.r5, this.a);
        this.f.setVisibility(this.s ? 0 : 8);
        this.h.setVisibility(8);
        b(false, i7 > 200 ? 0.3f : 1.0f);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.G6));
    }

    public final void b(boolean z9, float f10) {
        RadioButton radioButton = this.h;
        wo woVar = this.f;
        if (!z9) {
            woVar.animate().cancel();
            woVar.setAlpha(f10);
            radioButton.animate().cancel();
            radioButton.setAlpha(f10);
            return;
        }
        if (Math.abs(woVar.getAlpha() - f10) > 0.1d) {
            woVar.animate().cancel();
            woVar.animate().alpha(f10).start();
        }
        if (Math.abs(radioButton.getAlpha() - f10) > 0.1d) {
            radioButton.animate().cancel();
            radioButton.animate().alpha(f10).start();
        }
    }

    public final void c(boolean z9, boolean z10) {
        wo woVar = this.f;
        if (woVar.getVisibility() == 0) {
            woVar.a(z9, z10);
        }
        RadioButton radioButton = this.h;
        if (radioButton.getVisibility() == 0) {
            radioButton.a(z9, z10);
        }
    }

    public final void d(boolean z9, boolean z10) {
        this.r = z9;
        if (z10 != this.s) {
            this.s = z10;
            f();
        }
        if (!this.s) {
            this.h.setVisibility(8);
            this.f.setVisibility(8);
        }
        setWillNotDraw(!this.D && (this.s || !this.r));
    }

    public final void e(int i7, int i10, TLRPC.User user) {
        org.telegram.ui.ActionBar.g6 g6Var = this.a;
        org.telegram.ui.ActionBar.l5 l5Var = this.d;
        org.telegram.ui.ActionBar.l5 l5Var2 = this.e;
        org.telegram.ui.Components.w8 w8Var = this.b;
        if (i7 == 4) {
            l5Var.l(id.M0(2131744528, null), false);
            if (i10 == 1 && user != null) {
                setSubtitle(g(org.telegram.messenger.i6.m(id.a0(null, null, 2131744524, t10.p(user)), l5Var2.getPaint().getFontMetricsInt(), false, null, 0)));
            } else if (i10 > 0) {
                setSubtitle(g(id.G(i10, "StoryPrivacyOptionExcludePeople", new Object[0])));
            } else {
                setSubtitle(g(id.M0(2131744529, null)));
            }
            org.telegram.ui.ActionBar.s6.X(l5Var2, org.telegram.ui.ActionBar.l6.n5, g6Var);
            w8Var.g(7);
            w8Var.i(-15292942, -15630089);
        } else if (i7 == 2) {
            l5Var.l(id.M0(2131744530, null), false);
            if (i10 == 1 && user != null) {
                setSubtitle(g(org.telegram.messenger.i6.m(id.a0(null, null, 2131744524, t10.p(user)), l5Var2.getPaint().getFontMetricsInt(), false, null, 0)));
            } else if (i10 > 0) {
                setSubtitle(g(id.G(i10, "StoryPrivacyOptionExcludePeople", new Object[0])));
            } else {
                setSubtitle(g(id.M0(2131744529, null)));
            }
            org.telegram.ui.ActionBar.s6.X(l5Var2, org.telegram.ui.ActionBar.l6.n5, g6Var);
            w8Var.g(4);
            w8Var.i(-3905294, -6923014);
        } else if (i7 == 1) {
            l5Var.l(id.M0(2131744532, null), false);
            if (i10 == 1 && user != null) {
                setSubtitle(g(org.telegram.messenger.i6.m(t10.p(user), l5Var2.getPaint().getFontMetricsInt(), false, null, 0)));
            } else if (i10 > 0) {
                setSubtitle(g(id.G(i10, "StoryPrivacyOptionPeople", new Object[0])));
            } else {
                setSubtitle(g(id.M0(2131744531, null)));
            }
            org.telegram.ui.ActionBar.s6.X(l5Var2, org.telegram.ui.ActionBar.l6.n5, g6Var);
            w8Var.g(15);
            w8Var.i(-7808710, -13781445);
        } else if (i7 == 3) {
            l5Var.l(id.M0(2131744520, null), false);
            if (i10 == 1 && user != null) {
                setSubtitle(g(org.telegram.messenger.i6.m(t10.p(user), l5Var2.getPaint().getFontMetricsInt(), false, null, 0)));
            } else if (i10 > 0) {
                setSubtitle(g(id.G(i10, "StoryPrivacyOptionPeople", new Object[0])));
            } else {
                setSubtitle(g(id.M0(2131744519, null)));
            }
            org.telegram.ui.ActionBar.s6.X(l5Var2, org.telegram.ui.ActionBar.l6.n5, g6Var);
            w8Var.g(6);
            w8Var.i(-18621, -618956);
        }
        this.f.setVisibility(8);
        this.h.setVisibility(this.s ? 0 : 8);
        org.telegram.ui.Components.l9 l9Var = this.c;
        l9Var.setImageDrawable(w8Var);
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
    }

    public final void f() {
        float f10;
        float f11;
        float f12;
        int i7 = (id.a0 ? 5 : 3) | 16;
        boolean z9 = this.s;
        this.c.setLayoutParams(c8.ha.d(40, 40.0f, i7, z9 ? 53.0f : 16.0f, 0.0f, z9 ? 53.0f : 16.0f, 0.0f));
        boolean z10 = id.a0;
        int i10 = (z10 ? 5 : 3) | 16;
        float f13 = 20.0f;
        if (z10) {
            f10 = 20.0f;
        } else {
            f10 = this.s ? 105 : 68;
        }
        if (z10) {
            f11 = this.s ? 105 : 68;
        } else {
            f11 = 20.0f;
        }
        this.d.setLayoutParams(c8.ha.d(-1, -2.0f, i10, f10, 0.0f, f11, 0.0f));
        boolean z11 = id.a0;
        int i11 = (z11 ? 5 : 3) | 16;
        if (z11) {
            f12 = 20.0f;
        } else {
            f12 = this.s ? 105 : 68;
        }
        if (z11) {
            f13 = this.s ? 105 : 68;
        }
        this.e.setLayoutParams(c8.ha.d(-1, -2.0f, i11, f12, 0.0f, f13, 0.0f));
        this.f.setLayoutParams(c8.ha.d(24, 24.0f, (id.a0 ? 5 : 3) | 16, 13.0f, 0.0f, 14.0f, 0.0f));
        this.h.setLayoutParams(c8.ha.d(22, 22.0f, (id.a0 ? 5 : 3) | 16, 14.0f, 0.0f, 15.0f, 0.0f));
    }

    public final SpannableStringBuilder g(CharSequence charSequence) {
        SpannableString spannableString = new SpannableString(">");
        Drawable drawable = getContext().getResources().getDrawable(R.drawable.attach_arrow_right);
        wp wpVar = new wp(2, drawable);
        drawable.setBounds(0, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(12.0f));
        spannableString.setSpan(wpVar, 0, spannableString.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(charSequence).append((CharSequence) " ").append((CharSequence) spannableString);
        return spannableStringBuilder;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        Paint paint;
        super.onDraw(canvas);
        if (this.D) {
            int w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.d7, this.a);
            Paint paint2 = this.n;
            paint2.setColor(w02);
            if (id.a0) {
                canvas2 = canvas;
                canvas2.drawRect(0.0f, getHeight() - 1, getWidth() - org.telegram.messenger.g0.L(105.0f), getHeight(), paint2);
            } else {
                canvas2 = canvas;
                canvas2.drawRect(org.telegram.messenger.g0.L(105.0f), getHeight() - 1, getWidth(), getHeight(), paint2);
            }
        } else {
            canvas2 = canvas;
        }
        Path path = this.E;
        if (path == null || (paint = this.F) == null || this.s || !this.r || !this.w) {
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
        boolean z9;
        RadioButton radioButton;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        boolean z10 = false;
        wo woVar = this.f;
        if (woVar != null) {
            try {
                if (woVar.getVisibility() == 0) {
                    z9 = true;
                    radioButton = this.h;
                    if (radioButton != null && radioButton.getVisibility() == 0) {
                        z10 = true;
                    }
                    if (!z9 || z10) {
                        accessibilityNodeInfo.setCheckable(true);
                        accessibilityNodeInfo.setChecked(!z9 ? woVar.a.q : radioButton.f);
                        accessibilityNodeInfo.setClassName(!z9 ? "android.widget.CheckBox" : "android.widget.RadioButton");
                    }
                    return;
                }
            } catch (Exception unused) {
                return;
            }
        }
        z9 = false;
        radioButton = this.h;
        if (radioButton != null) {
            z10 = true;
        }
        if (z9) {
        }
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(!z9 ? woVar.a.q : radioButton.f);
        accessibilityNodeInfo.setClassName(!z9 ? "android.widget.CheckBox" : "android.widget.RadioButton");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L((!this.r || this.s) ? 56.0f : 62.0f), TLObject.FLAG_30));
        if (this.s || !this.r) {
            return;
        }
        Path path = this.E;
        if (path == null) {
            this.E = new Path();
        } else {
            path.rewind();
        }
        float L = id.a0 ? org.telegram.messenger.g0.L(31.0f) : getMeasuredWidth() - org.telegram.messenger.g0.L(31.0f);
        float measuredHeight = getMeasuredHeight() / 2.0f;
        float f10 = id.a0 ? -1.0f : 1.0f;
        this.E.moveTo(L, measuredHeight - org.telegram.messenger.g0.L(6.0f));
        this.E.lineTo((f10 * org.telegram.messenger.g0.L(6.0f)) + L, measuredHeight);
        this.E.lineTo(L, measuredHeight + org.telegram.messenger.g0.L(6.0f));
        if (this.F == null) {
            Paint paint = new Paint(1);
            this.F = paint;
            paint.setStyle(Paint.Style.STROKE);
            this.F.setStrokeCap(Paint.Cap.ROUND);
        }
        this.F.setStrokeWidth(org.telegram.messenger.g0.N(1.86f));
        this.F.setColor(org.telegram.ui.ActionBar.l6.r1(0.3f, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.G6, this.a)));
    }

    public void set(Object obj) {
        boolean z9 = obj instanceof TLRPC.User;
        org.telegram.ui.ActionBar.l5 l5Var = this.d;
        if (z9) {
            l5Var.setTypeface(org.telegram.messenger.g0.o());
            l5Var.setTranslationX(0.0f);
            setUser((TLRPC.User) obj);
        } else if (obj instanceof TLRPC.Chat) {
            l5Var.setTypeface(org.telegram.messenger.g0.o());
            l5Var.setTranslationX(0.0f);
            a(0, (TLRPC.Chat) obj);
        } else if (obj instanceof String) {
            l5Var.setTypeface(null);
            l5Var.setTranslationX((-org.telegram.messenger.g0.L(52.0f)) * (id.a0 ? -1 : 1));
            l5Var.l((String) obj, false);
        }
    }

    public void setDivider(boolean z9) {
        this.D = z9;
        setWillNotDraw(!z9 && (this.s || !this.r));
    }

    public void setRedCheckbox(boolean z9) {
        this.f.b(z9 ? org.telegram.ui.ActionBar.l6.kk : org.telegram.ui.ActionBar.l6.B5, org.telegram.ui.ActionBar.l6.j7, org.telegram.ui.ActionBar.l6.C5);
    }

    public void setUser(TLRPC.User user) {
        this.y = user == null ? 0L : user.id;
        org.telegram.ui.Components.w8 w8Var = this.b;
        w8Var.r(user);
        int L = org.telegram.messenger.g0.L(20.0f);
        org.telegram.ui.Components.l9 l9Var = this.c;
        l9Var.setRoundRadius(L);
        l9Var.e(user, w8Var);
        String p10 = t10.p(user);
        org.telegram.ui.ActionBar.l5 l5Var = this.d;
        l5Var.l(org.telegram.messenger.i6.m(p10, l5Var.getPaint().getFontMetricsInt(), false, null, 0), false);
        boolean[] zArr = this.x;
        zArr[0] = false;
        boolean z9 = this.r;
        org.telegram.ui.ActionBar.g6 g6Var = this.a;
        org.telegram.ui.ActionBar.l5 l5Var2 = this.e;
        if (z9) {
            setSubtitle(id.M0(2131743349, null));
            org.telegram.ui.ActionBar.s6.X(l5Var2, org.telegram.ui.ActionBar.l6.r5, g6Var);
        } else {
            setSubtitle(id.d0(p10.s0, user, zArr, null));
            org.telegram.ui.ActionBar.s6.X(l5Var2, zArr[0] ? org.telegram.ui.ActionBar.l6.n5 : org.telegram.ui.ActionBar.l6.r5, g6Var);
        }
        int i7 = this.s ? 0 : 8;
        wo woVar = this.f;
        woVar.setVisibility(i7);
        woVar.setAlpha(1.0f);
        this.h.setVisibility(8);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            Paint paint = this.F;
            if (paint != null) {
                paint.setColor(org.telegram.ui.ActionBar.l6.r1(0.3f, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.G6, this.a)));
                invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
