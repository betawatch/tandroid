package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.Magnifier;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.oq;
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class x9 {
    public final ActionMode.Callback A;
    public final Rect B;
    public w9 C;
    public i7.b6 D;
    public jl0 E;
    public ViewGroup F;
    public Magnifier G;
    public float H;
    public float I;
    public float J;
    public float K;
    public float L;
    public float M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public final RectF S;
    public final RectF T;
    public float U;
    public float V;
    public s9 W;
    public s9 X;
    public ActionMode Y;
    public boolean Z;
    public int a;
    public final n9 a0;
    public int b;
    public int b0;
    public int c;
    public final OvershootInterpolator c0;
    public int d;
    public boolean d0;
    public boolean e;
    public int e0;
    public float f;
    public final lh.m7 f0;
    public float g;
    public final e9 g0;
    public final int[] h = new int[2];
    public org.telegram.ui.ActionBar.c6 h0;
    public boolean i;
    public boolean i0;
    public boolean j;
    public boolean j0;
    public boolean k;
    public boolean k0;
    public final int l;
    public org.telegram.ui.v l0;
    public final int m;
    public ValueAnimator m0;
    public final float n;
    public org.telegram.ui.ActionBar.o1 n0;
    public final Paint o;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout o0;
    public final Paint p;
    public TextView p0;
    public final oq q;
    public Rect q0;
    public final Path r;
    public final g r0;
    public int s;
    public final f9 s0;
    public int t;
    public final r9 t0;
    public int u;
    public int v;
    public int w;
    public int x;
    public boolean y;
    public boolean z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v7, types: [org.telegram.ui.Cells.i9] */
    public x9() {
        new p9().a = 0.0f;
        Paint paint = new Paint(1);
        this.o = paint;
        this.p = new Paint(1);
        oq oqVar = new oq();
        this.q = oqVar;
        this.r = new Path();
        new o9().a = oqVar;
        this.u = -1;
        this.v = -1;
        h9 h9Var = new h9(this);
        this.A = Build.VERSION.SDK_INT >= 23 ? new i9(this, h9Var) : h9Var;
        this.B = new Rect();
        this.S = new RectF();
        this.T = new RectF();
        this.a0 = new n9();
        this.c0 = new OvershootInterpolator();
        this.d0 = false;
        this.f0 = new lh.m7(this, 12);
        this.g0 = new e9(this);
        this.i0 = true;
        this.l0 = null;
        this.r0 = new g(this, 7);
        this.s0 = new f9(this);
        r9 r9Var = new r9();
        r9Var.a = 0.0f;
        r9Var.b = new ArrayList(1);
        r9Var.c = 0;
        this.t0 = r9Var;
        this.l = ViewConfiguration.getLongPressTimeout();
        this.m = ViewConfiguration.get(ApplicationLoader.applicationContext).getScaledTouchSlop();
        float dp = AndroidUtilities.dp(6.0f);
        this.n = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
        oqVar.d = 1.0f;
    }

    public static void a(x9 x9Var, int i10) {
        int lineRight;
        int i11;
        n9 n9Var = x9Var.a0;
        if (Build.VERSION.SDK_INT < 28 || x9Var.W == null || x9Var.k || !x9Var.i || x9Var.C == null) {
            return;
        }
        int i12 = x9Var.j ? x9Var.u : x9Var.v;
        x9Var.j(i12, n9Var, false);
        Layout layout = n9Var.b;
        if (layout == null) {
            return;
        }
        int lineForOffset = layout.getLineForOffset(Utilities.clamp(i12 - n9Var.a, layout.getText().length(), 0));
        int lineBottom = layout.getLineBottom(lineForOffset) - layout.getLineTop(lineForOffset);
        int[] m10 = x9Var.m();
        int lineTop = (int) (((((layout.getLineTop(lineForOffset) + x9Var.b) + m10[1]) - lineBottom) - AndroidUtilities.dp(8.0f)) + n9Var.c);
        Object obj = x9Var.W;
        if (obj instanceof org.telegram.ui.y2) {
            i11 = m10[0];
            lineRight = ((View) obj).getMeasuredWidth() + i11;
        } else {
            int lineLeft = (int) (layout.getLineLeft(lineForOffset) + m10[0] + x9Var.a + n9Var.d);
            lineRight = (int) (layout.getLineRight(lineForOffset) + m10[0] + x9Var.a + n9Var.d);
            i11 = lineLeft;
        }
        if (i10 < i11) {
            i10 = i11;
        } else if (i10 > lineRight) {
            i10 = lineRight;
        }
        float f9 = lineTop;
        if (x9Var.I != f9) {
            x9Var.I = f9;
            x9Var.J = (f9 - x9Var.H) / 200.0f;
        }
        float f10 = i10;
        if (x9Var.L != f10) {
            x9Var.L = f10;
            x9Var.M = (f10 - x9Var.K) / 100.0f;
        }
        if (x9Var.G == null) {
            x9Var.G = new Magnifier(x9Var.C);
            x9Var.H = x9Var.I;
            x9Var.K = x9Var.L;
        }
        float f11 = x9Var.H;
        float f12 = x9Var.I;
        if (f11 != f12) {
            x9Var.H = (x9Var.J * 16.0f) + f11;
        }
        float f13 = x9Var.J;
        if (f13 > 0.0f && x9Var.H > f12) {
            x9Var.H = f12;
        } else if (f13 < 0.0f && x9Var.H < f12) {
            x9Var.H = f12;
        }
        float f14 = x9Var.K;
        float f15 = x9Var.L;
        if (f14 != f15) {
            x9Var.K = (x9Var.M * 16.0f) + f14;
        }
        float f16 = x9Var.M;
        if (f16 > 0.0f && x9Var.K > f15) {
            x9Var.K = f15;
        } else if (f16 < 0.0f && x9Var.K < f15) {
            x9Var.K = f15;
        }
        x9Var.G.show(x9Var.K, (lineBottom * 1.5f) + x9Var.H + AndroidUtilities.dp(8.0f));
        x9Var.G.update();
    }

    public static boolean z(char c3) {
        return Character.isLetter(c3) || Character.isDigit(c3) || c3 == '_';
    }

    public boolean A(MessageObject messageObject) {
        return messageObject != null && this.w == messageObject.getId();
    }

    public void B(int i10, int i11, boolean z10, float f9, float f10, s9 s9Var) {
        int i12;
        int i13;
        if (this.j) {
            this.u = i11;
            if (!z10 && i11 > (i13 = this.v)) {
                this.v = i11;
                this.u = i13;
                this.j = false;
            }
            this.y = true;
            return;
        }
        this.v = i11;
        if (!z10 && (i12 = this.u) > i11) {
            this.v = i12;
            this.u = i11;
            this.j = true;
        }
        this.y = true;
    }

    public final int[] C(int i10) {
        n9 n9Var = this.a0;
        j(i10, n9Var, false);
        Layout layout = n9Var.b;
        int i11 = i10 - n9Var.a;
        int[] iArr = this.h;
        if (layout != null && i11 >= 0 && i11 <= layout.getText().length()) {
            int lineForOffset = layout.getLineForOffset(i11);
            iArr[0] = (int) (layout.getPrimaryHorizontal(i11) + n9Var.d);
            int lineBottom = layout.getLineBottom(lineForOffset);
            iArr[1] = lineBottom;
            iArr[1] = (int) (lineBottom + n9Var.c);
        }
        return iArr;
    }

    public boolean D() {
        return false;
    }

    public final void H() {
        w9 w9Var;
        if (!y() || (w9Var = this.C) == null) {
            return;
        }
        this.Q = true;
        w9Var.invalidate();
        v();
    }

    public boolean K() {
        return false;
    }

    public abstract void M(s9 s9Var, s9 s9Var2);

    public final boolean N(MotionEvent motionEvent) {
        x9 x9Var;
        int action = motionEvent.getAction();
        e9 e9Var = this.g0;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    int y8 = (int) motionEvent.getY();
                    int x4 = (int) motionEvent.getX();
                    int i10 = this.t - y8;
                    int i11 = this.s - x4;
                    int i12 = (i11 * i11) + (i10 * i10);
                    int i13 = this.m;
                    if (i12 > i13 * i13) {
                        AndroidUtilities.cancelRunOnUIThread(e9Var);
                        this.z = false;
                    }
                    return this.z;
                }
                if (action != 3) {
                    return false;
                }
            }
            AndroidUtilities.cancelRunOnUIThread(e9Var);
            this.z = false;
            return false;
        }
        this.s = (int) motionEvent.getX();
        this.t = (int) motionEvent.getY();
        this.z = false;
        int i14 = -AndroidUtilities.dp(8.0f);
        int i15 = -AndroidUtilities.dp(8.0f);
        Rect rect = this.B;
        rect.inset(i14, i15);
        if (!rect.contains(this.s, this.t) || this.X == null) {
            x9Var = this;
        } else {
            rect.inset(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            int i16 = this.s;
            int i17 = this.t;
            int i18 = rect.right;
            if (i16 > i18) {
                i16 = i18 - 1;
            }
            int i19 = rect.left;
            if (i16 < i19) {
                i16 = i19 + 1;
            }
            int i20 = i16;
            int i21 = rect.top;
            if (i17 < i21) {
                i17 = i21 + 1;
            }
            int i22 = rect.bottom;
            if (i17 > i22) {
                i17 = i22 - 1;
            }
            x9Var = this;
            int l10 = x9Var.l(i20, i17, this.c, this.d, this.X, true);
            CharSequence t10 = t(x9Var.X, true);
            if (l10 >= t10.length()) {
                n9 n9Var = x9Var.a0;
                j(l10, n9Var, true);
                Layout layout = n9Var.b;
                if (layout == null) {
                    x9Var.z = false;
                    return false;
                }
                int lineCount = layout.getLineCount() - 1;
                float f9 = i20 - x9Var.c;
                if (f9 < n9Var.b.getLineRight(lineCount) + AndroidUtilities.dp(4.0f) && f9 > n9Var.b.getLineLeft(lineCount)) {
                    l10 = t10.length() - 1;
                }
            }
            if (l10 >= 0 && l10 < t10.length() && t10.charAt(l10) != '\n') {
                AndroidUtilities.cancelRunOnUIThread(e9Var);
                AndroidUtilities.runOnUIThread(e9Var, x9Var.l);
                x9Var.z = true;
            }
        }
        return x9Var.z;
    }

    public boolean Q(int i10, int i11) {
        return false;
    }

    public final void R(lh.g2 g2Var) {
        this.D = g2Var;
    }

    public final void S() {
        this.j0 = true;
    }

    public final void T(ViewGroup viewGroup) {
        if (viewGroup instanceof jl0) {
            this.E = (jl0) viewGroup;
        }
        this.F = viewGroup;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0255, code lost:
    
        if (r0 < 0) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U() {
        int i10;
        if (this.C == null) {
            return;
        }
        int i11 = Build.VERSION.SDK_INT;
        ActionMode.Callback callback = this.A;
        if (i11 >= 23) {
            if (!this.i && y() && d()) {
                if (!this.P) {
                    if (this.Y == null) {
                        org.telegram.ui.ActionBar.g4 g4Var = new org.telegram.ui.ActionBar.g4(this.C.getContext(), m4.a.i(callback), this.C, new org.telegram.ui.ActionBar.v4(this.C.getContext(), this.C, 1, r(), null));
                        this.Y = g4Var;
                        callback.onCreateActionMode(g4Var, g4Var.c);
                    }
                    ActionMode actionMode = this.Y;
                    callback.onPrepareActionMode(actionMode, actionMode.getMenu());
                    this.Y.hide(1L);
                }
                AndroidUtilities.cancelRunOnUIThread(this.s0);
                this.P = true;
                return;
            }
            return;
        }
        if (!this.d0) {
            if (this.Y == null && y()) {
                this.Y = this.C.startActionMode(callback);
                return;
            }
            return;
        }
        if (!this.i && y() && d()) {
            if (this.o0 == null) {
                this.q0 = new Rect();
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(this.C.getContext(), null);
                this.o0 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
                this.o0.setBackgroundDrawable(this.C.getContext().getResources().getDrawable(R.drawable.menu_copy));
                this.o0.setAnimationEnabled(false);
                this.o0.setOnTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Cells.c9
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        org.telegram.ui.ActionBar.o1 o1Var;
                        x9 x9Var = x9.this;
                        x9Var.getClass();
                        if (motionEvent.getActionMasked() != 0 || (o1Var = x9Var.n0) == null || !o1Var.isShowing()) {
                            return false;
                        }
                        view.getHitRect(x9Var.q0);
                        return false;
                    }
                });
                this.o0.setShownFromBottom(false);
                TextView textView = new TextView(this.C.getContext());
                this.p0 = textView;
                int i12 = org.telegram.ui.ActionBar.g6.i6;
                textView.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(u(i12), 2, -1));
                this.p0.setGravity(16);
                this.p0.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
                this.p0.setTextSize(1, 15.0f);
                this.p0.setTypeface(AndroidUtilities.bold());
                this.p0.setText(this.C.getContext().getString(android.R.string.copy));
                TextView textView2 = this.p0;
                int i13 = org.telegram.ui.ActionBar.g6.E8;
                textView2.setTextColor(u(i13));
                final int i14 = 0;
                this.p0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.d9
                    public final /* synthetic */ x9 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i14) {
                            case 0:
                                this.b.g();
                                break;
                            case 1:
                                x9 x9Var = this.b;
                                x9Var.E();
                                x9Var.v();
                                break;
                            default:
                                x9 x9Var2 = this.b;
                                x9Var2.I();
                                x9Var2.v();
                                break;
                        }
                    }
                });
                this.o0.addView(this.p0, i7.f6.c(48.0f, -2));
                boolean z10 = this instanceof th.d3;
                if (z10) {
                    TextView textView3 = new TextView(this.C.getContext());
                    textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(i12, this.h0), 2, -1));
                    textView3.setGravity(16);
                    textView3.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
                    th.n(15.0f, 1, textView3);
                    textView3.setText(this.C.getContext().getString(android.R.string.cut));
                    textView3.setTextColor(org.telegram.ui.ActionBar.g6.v0(i13, this.h0));
                    final int i15 = 1;
                    textView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.d9
                        public final /* synthetic */ x9 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i15) {
                                case 0:
                                    this.b.g();
                                    break;
                                case 1:
                                    x9 x9Var = this.b;
                                    x9Var.E();
                                    x9Var.v();
                                    break;
                                default:
                                    x9 x9Var2 = this.b;
                                    x9Var2.I();
                                    x9Var2.v();
                                    break;
                            }
                        }
                    });
                    this.o0.addView(textView3, i7.f6.c(48.0f, -2));
                }
                if (z10) {
                    TextView textView4 = new TextView(this.C.getContext());
                    textView4.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(i12, this.h0), 2, -1));
                    textView4.setGravity(16);
                    textView4.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
                    th.n(15.0f, 1, textView4);
                    textView4.setText(this.C.getContext().getString(android.R.string.paste));
                    textView4.setTextColor(org.telegram.ui.ActionBar.g6.v0(i13, this.h0));
                    final int i16 = 2;
                    textView4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.d9
                        public final /* synthetic */ x9 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i16) {
                                case 0:
                                    this.b.g();
                                    break;
                                case 1:
                                    x9 x9Var = this.b;
                                    x9Var.E();
                                    x9Var.v();
                                    break;
                                default:
                                    x9 x9Var2 = this.b;
                                    x9Var2.I();
                                    x9Var2.v();
                                    break;
                            }
                        }
                    });
                    this.o0.addView(textView4, i7.f6.c(48.0f, -2));
                }
                org.telegram.ui.ActionBar.o1 o1Var = new org.telegram.ui.ActionBar.o1(this.o0, -2, -2);
                this.n0 = o1Var;
                o1Var.b = false;
                o1Var.setAnimationStyle(R.style.PopupContextAnimation);
                this.n0.setOutsideTouchable(true);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.o0;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.setBackgroundColor(u(org.telegram.ui.ActionBar.g6.G8));
                }
            }
            if (this.W != null) {
                int i17 = -n();
                int i18 = i17 / 2;
                i10 = (i18 + ((C(this.u)[1] + this.b) + m()[1])) - AndroidUtilities.dp(4.0f);
            }
            i10 = 0;
            this.n0.showAtLocation(this.C, 48, 0, i10 - AndroidUtilities.dp(48.0f));
            this.n0.h();
        }
    }

    public final void V() {
        if (this.V == 1.0f || this.C == null) {
            return;
        }
        ValueAnimator valueAnimator = this.m0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.V, 1.0f);
        this.m0 = ofFloat;
        ofFloat.addUpdateListener(new r(this, 7));
        this.m0.setDuration((long) (Math.abs(1.0f - this.V) * 250.0f));
        this.m0.start();
    }

    public final void W() {
        this.Q = false;
        this.C.invalidate();
        g gVar = this.r0;
        AndroidUtilities.cancelRunOnUIThread(gVar);
        AndroidUtilities.runOnUIThread(gVar);
    }

    public boolean b() {
        return true;
    }

    public boolean c(int i10) {
        return (i10 == this.u || i10 == this.v) ? false : true;
    }

    public boolean d() {
        return this.W != null;
    }

    public boolean e() {
        return false;
    }

    public void f(boolean z10) {
        F(z10);
        this.u = -1;
        this.v = -1;
        w();
        v();
        x();
        this.W = null;
        this.w = 0;
        AndroidUtilities.cancelRunOnUIThread(this.g0);
        this.z = false;
        w9 w9Var = this.C;
        if (w9Var != null) {
            w9Var.setVisibility(8);
            this.C.c();
        }
        this.V = 0.0f;
        i7.b6 b6Var = this.D;
        if (b6Var != null) {
            b6Var.a(false);
        }
        this.s = -1;
        this.t = -1;
        this.c = -1;
        this.d = -1;
        this.f = 0.0f;
        this.g = 0.0f;
        this.i = false;
    }

    public final void g() {
        if (y()) {
            if (!D()) {
                CharSequence s10 = s();
                if (s10 == null) {
                    return;
                } else {
                    AndroidUtilities.addToClipboard(s10);
                }
            }
            v();
            f(true);
            i7.b6 b6Var = this.D;
            if (b6Var != null) {
                b6Var.b();
            }
        }
    }

    public final void h(Layout layout, int i10, int i11, int i12, boolean z10, boolean z11, float f9) {
        float f10;
        float f11;
        int i13;
        oq oqVar;
        float f12;
        r9 r9Var = this.t0;
        r9Var.reset();
        layout.getSelectionPath(i11, i12, r9Var);
        if (r9Var.a < layout.getLineBottom(i10)) {
            int lineTop = layout.getLineTop(i10);
            float lineBottom = layout.getLineBottom(i10) - lineTop;
            f11 = lineTop;
            f10 = lineBottom / (r9Var.a - f11);
        } else {
            f10 = 1.0f;
            f11 = 0.0f;
        }
        int i14 = 0;
        while (true) {
            i13 = r9Var.c;
            oqVar = this.q;
            f12 = this.n;
            if (i14 >= i13) {
                break;
            }
            RectF rectF = (RectF) r9Var.b.get(i14);
            rectF.set((int) (Math.max(f9, rectF.left) - (z10 ? f12 / 2.0f : 0.0f)), (int) com.google.android.recaptcha.internal.a.z(rectF.top, f11, f10, f11), (int) (Math.max(f9, rectF.right) + (z11 ? f12 / 2.0f : 0.0f)), (int) com.google.android.recaptcha.internal.a.z(rectF.bottom, f11, f10, f11));
            oqVar.addRect(rectF, Path.Direction.CW);
            i14++;
        }
        if (i13 != 0 || z11) {
            return;
        }
        try {
            oqVar.addRect(((int) layout.getPrimaryHorizontal(i11)) - (f12 / 2.0f), layout.getLineTop(i10), (f12 / 4.0f) + ((int) layout.getPrimaryHorizontal(i12)), layout.getLineBottom(i10), Path.Direction.CW);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0106 A[LOOP:1: B:68:0x0104->B:69:0x0106, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(Canvas canvas, Layout layout, int i10, int i11, boolean z10, boolean z11, float f9) {
        int i12;
        Rect rect;
        int i13;
        float f10;
        int i14;
        Path path;
        int i15;
        int i16;
        x9 x9Var;
        int i17;
        float lineRight;
        oq oqVar;
        if (layout == null || layout.getText() == null) {
            return;
        }
        int clamp = Utilities.clamp(i10, layout.getText().length(), 0);
        int clamp2 = Utilities.clamp(i11, layout.getText().length(), 0);
        oq oqVar2 = this.q;
        oqVar2.reset();
        Path path2 = this.r;
        path2.reset();
        float f11 = this.n;
        float f12 = f11 * 1.65f;
        int i18 = (int) (f11 / 2.0f);
        int lineForOffset = layout.getLineForOffset(clamp);
        int lineForOffset2 = layout.getLineForOffset(clamp2);
        if (lineForOffset == lineForOffset2) {
            h(layout, lineForOffset, clamp, clamp2, !z10, !z11, f9);
            x9Var = this;
            path = path2;
            f10 = f12;
            i15 = lineForOffset;
            i16 = clamp;
            i14 = lineForOffset2;
        } else {
            int lineEnd = layout.getLineEnd(lineForOffset);
            if (layout.getParagraphDirection(lineForOffset) == -1 || lineEnd <= 0) {
                i12 = lineEnd;
            } else {
                i12 = lineEnd - 1;
                CharSequence text = layout.getText();
                int primaryHorizontal = (int) layout.getPrimaryHorizontal(i12);
                if (layout.isRtlCharAt(i12)) {
                    int i19 = i12;
                    while (layout.isRtlCharAt(i19) && i19 != 0) {
                        i19--;
                    }
                    i17 = lineEnd;
                    lineRight = layout.getLineForOffset(i19) == layout.getLineForOffset(i12) ? layout.getPrimaryHorizontal(i19 + 1) : layout.getLineLeft(lineForOffset);
                } else {
                    i17 = lineEnd;
                    lineRight = layout.getLineRight(lineForOffset);
                }
                int i20 = (int) lineRight;
                int min = Math.min(primaryHorizontal, i20);
                int max = Math.max(primaryHorizontal, i20);
                if (i12 > 0 && i12 < text.length() && !Character.isWhitespace(text.charAt(i17 - 2))) {
                    rect = new Rect(((int) Math.max(f9, min)) - i18, layout.getLineTop(lineForOffset), ((int) Math.max(f9, max)) + i18, layout.getLineBottom(lineForOffset));
                    h(layout, lineForOffset, clamp, i12, !z10, true, f9);
                    if (rect != null) {
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(rect);
                        oqVar2.addRect(rectF, Path.Direction.CW);
                    }
                    i13 = lineForOffset + 1;
                    while (i13 < lineForOffset2) {
                        int lineLeft = (int) layout.getLineLeft(i13);
                        int lineRight2 = (int) layout.getLineRight(i13);
                        int min2 = Math.min(lineLeft, lineRight2);
                        int max2 = Math.max(lineLeft, lineRight2);
                        float max3 = Math.max(f9, min2);
                        float f13 = i18;
                        oqVar2.addRect(max3 - f13, layout.getLineTop(i13), Math.max(f9, max2) + f13, layout.getLineBottom(i13) + 1, Path.Direction.CW);
                        i13++;
                        lineForOffset2 = lineForOffset2;
                        i18 = i18;
                        lineForOffset = lineForOffset;
                        path2 = path2;
                        f12 = f12;
                    }
                    int i21 = lineForOffset;
                    f10 = f12;
                    i14 = lineForOffset2;
                    path = path2;
                    i15 = i21;
                    clamp2 = clamp2;
                    i16 = clamp;
                    x9Var = this;
                    x9Var.h(layout, i14, layout.getLineStart(i14), clamp2, true, !z11, f9);
                }
            }
            rect = null;
            h(layout, lineForOffset, clamp, i12, !z10, true, f9);
            if (rect != null) {
            }
            i13 = lineForOffset + 1;
            while (i13 < lineForOffset2) {
            }
            int i212 = lineForOffset;
            f10 = f12;
            i14 = lineForOffset2;
            path = path2;
            i15 = i212;
            clamp2 = clamp2;
            i16 = clamp;
            x9Var = this;
            x9Var.h(layout, i14, layout.getLineStart(i14), clamp2, true, !z11, f9);
        }
        int i22 = Build.VERSION.SDK_INT;
        boolean z12 = i22 >= 26;
        if (z12) {
            canvas.save();
        }
        float primaryHorizontal2 = layout.getPrimaryHorizontal(i16);
        float primaryHorizontal3 = layout.getPrimaryHorizontal(clamp2);
        float lineBottom = layout.getLineBottom(i15);
        float lineBottom2 = layout.getLineBottom(i14);
        if (z10 && z11 && lineBottom == lineBottom2 && Math.abs(primaryHorizontal3 - primaryHorizontal2) < f10) {
            float min3 = Math.min(primaryHorizontal2, primaryHorizontal3);
            float max4 = Math.max(primaryHorizontal2, primaryHorizontal3);
            Rect rect2 = AndroidUtilities.rectTmp2;
            rect2.set((int) min3, (int) (lineBottom - f10), (int) max4, (int) lineBottom);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(rect2);
            path.addRect(rectF2, Path.Direction.CW);
            if (i22 >= 26) {
                canvas.clipOutRect(rect2);
            }
            oqVar = oqVar2;
        } else {
            if (!z10 || layout.isRtlCharAt(i16)) {
                oqVar = oqVar2;
            } else {
                Rect rect3 = AndroidUtilities.rectTmp2;
                oqVar = oqVar2;
                rect3.set((int) primaryHorizontal2, (int) (lineBottom - f10), (int) Math.min(primaryHorizontal2 + f10, layout.getLineRight(i15)), (int) lineBottom);
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(rect3);
                path.addRect(rectF3, Path.Direction.CW);
                if (i22 >= 26) {
                    rect3.set(rect3.left - ((int) f10), rect3.top, rect3.right, rect3.bottom);
                    canvas.clipOutRect(rect3);
                }
            }
            if (z11 && !layout.isRtlCharAt(clamp2)) {
                Rect rect4 = AndroidUtilities.rectTmp2;
                rect4.set((int) Math.max(primaryHorizontal3 - f10, layout.getLineLeft(i14)), (int) (lineBottom2 - f10), (int) primaryHorizontal3, (int) lineBottom2);
                RectF rectF4 = AndroidUtilities.rectTmp;
                rectF4.set(rect4);
                path.addRect(rectF4, Path.Direction.CW);
                if (i22 >= 26) {
                    canvas.clipOutRect(rect4);
                }
            }
        }
        oqVar.a();
        canvas.drawPath(oqVar, x9Var.o);
        if (z12) {
            canvas.restore();
            canvas.drawPath(path, x9Var.p);
        }
    }

    public abstract void j(int i10, n9 n9Var, boolean z10);

    public boolean k() {
        return false;
    }

    public abstract int l(int i10, int i11, int i12, int i13, s9 s9Var, boolean z10);

    public final int[] m() {
        int i10;
        View view = (View) this.W;
        int i11 = 0;
        if (view != null && this.F != null) {
            i10 = 0;
            int i12 = 0;
            while (view != this.F) {
                if (view != null) {
                    i10 = (int) (view.getY() + i10);
                    i12 = (int) (view.getX() + i12);
                    if (view instanceof NestedScrollView) {
                        i10 -= view.getScrollY();
                        i12 -= view.getScrollX();
                    }
                    if (view.getParent() instanceof View) {
                        view = (View) view.getParent();
                    }
                }
            }
            i11 = i12;
            return new int[]{i11, i10};
        }
        i10 = 0;
        return new int[]{i11, i10};
    }

    public abstract int n();

    public final w9 o(Context context) {
        if (this.C == null) {
            this.C = new w9(this, context);
        }
        return this.C;
    }

    public int p() {
        return 0;
    }

    public int q() {
        return 0;
    }

    public org.telegram.ui.ActionBar.c6 r() {
        return this.h0;
    }

    public CharSequence s() {
        CharSequence t10 = t(this.W, false);
        if (t10 != null) {
            return t10.subSequence(this.u, this.v);
        }
        return null;
    }

    public abstract CharSequence t(s9 s9Var, boolean z10);

    public int u(int i10) {
        return org.telegram.ui.ActionBar.g6.v0(i10, this.h0);
    }

    public final void v() {
        ActionMode actionMode;
        if (Build.VERSION.SDK_INT >= 23) {
            if (this.Y != null && this.P) {
                this.P = false;
                this.s0.run();
            }
            this.P = false;
        }
        if (!y() && (actionMode = this.Y) != null) {
            actionMode.finish();
            this.Y = null;
        }
        org.telegram.ui.ActionBar.o1 o1Var = this.n0;
        if (o1Var != null) {
            o1Var.d(true);
        }
    }

    public final void w() {
        Magnifier magnifier;
        if (Build.VERSION.SDK_INT < 28 || (magnifier = this.G) == null) {
            return;
        }
        magnifier.dismiss();
        this.G = null;
    }

    public void x() {
        s9 s9Var = this.W;
        if (s9Var != null) {
            s9Var.invalidate();
        }
        w9 w9Var = this.C;
        if (w9Var != null) {
            w9Var.invalidate();
        }
    }

    public final boolean y() {
        return this.u >= 0 && this.v >= 0;
    }

    public void E() {
    }

    public void F(boolean z10) {
    }

    public void G() {
    }

    public void I() {
    }

    public void O() {
    }

    public void P() {
    }

    public void L(float f9, float f10) {
    }

    public void J(int i10, int i11, MessageObject messageObject) {
    }
}
