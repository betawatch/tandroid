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
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.wk0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class aa {
    public final ActionMode.Callback A;
    public final Rect B;
    public z9 C;
    public g7.a6 D;
    public wk0 E;
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
    public v9 W;
    public v9 X;
    public ActionMode Y;
    public boolean Z;
    public int a;
    public final q9 a0;
    public int b;
    public int b0;
    public int c;
    public final OvershootInterpolator c0;
    public int d;
    public boolean d0;
    public boolean e;
    public int e0;
    public float f;
    public final m.i3 f0;
    public float g;
    public final h9 g0;
    public final int[] h = new int[2];
    public org.telegram.ui.ActionBar.b6 h0;
    public boolean i;
    public boolean i0;
    public boolean j;
    public boolean j0;
    public boolean k;
    public boolean k0;
    public final int l;
    public org.telegram.ui.t l0;
    public final int m;
    public ValueAnimator m0;
    public final float n;
    public org.telegram.ui.ActionBar.o1 n0;
    public final Paint o;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout o0;
    public final Paint p;
    public TextView p0;
    public final kq q;
    public Rect q0;
    public final Path r;
    public final g r0;
    public int s;
    public final i9 s0;
    public int t;
    public final u9 t0;
    public int u;
    public int v;
    public int w;
    public int x;
    public boolean y;
    public boolean z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v7, types: [org.telegram.ui.Cells.l9] */
    public aa() {
        new s9().a = 0.0f;
        Paint paint = new Paint(1);
        this.o = paint;
        this.p = new Paint(1);
        kq kqVar = new kq();
        this.q = kqVar;
        this.r = new Path();
        new r9().a = kqVar;
        this.u = -1;
        this.v = -1;
        k9 k9Var = new k9(this);
        this.A = Build.VERSION.SDK_INT >= 23 ? new l9(this, k9Var) : k9Var;
        this.B = new Rect();
        this.S = new RectF();
        this.T = new RectF();
        this.a0 = new q9();
        this.c0 = new OvershootInterpolator();
        this.d0 = false;
        this.f0 = new m.i3(this, 9);
        this.g0 = new h9(this);
        this.i0 = true;
        this.l0 = null;
        this.r0 = new g(this, 7);
        this.s0 = new i9(this);
        u9 u9Var = new u9();
        u9Var.a = 0.0f;
        u9Var.b = new ArrayList(1);
        u9Var.c = 0;
        this.t0 = u9Var;
        this.l = ViewConfiguration.getLongPressTimeout();
        this.m = ViewConfiguration.get(ApplicationLoader.applicationContext).getScaledTouchSlop();
        float dp = AndroidUtilities.dp(6.0f);
        this.n = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
        kqVar.d = 1.0f;
    }

    public static void a(aa aaVar, int i9) {
        int lineRight;
        int i10;
        q9 q9Var = aaVar.a0;
        if (Build.VERSION.SDK_INT < 28 || aaVar.W == null || aaVar.k || !aaVar.i || aaVar.C == null) {
            return;
        }
        int i11 = aaVar.j ? aaVar.u : aaVar.v;
        aaVar.j(i11, q9Var, false);
        Layout layout = q9Var.b;
        if (layout == null) {
            return;
        }
        int lineForOffset = layout.getLineForOffset(Utilities.clamp(i11 - q9Var.a, layout.getText().length(), 0));
        int lineBottom = layout.getLineBottom(lineForOffset) - layout.getLineTop(lineForOffset);
        int[] m10 = aaVar.m();
        int lineTop = (int) (((((layout.getLineTop(lineForOffset) + aaVar.b) + m10[1]) - lineBottom) - AndroidUtilities.dp(8.0f)) + q9Var.c);
        Object obj = aaVar.W;
        if (obj instanceof org.telegram.ui.x2) {
            i10 = m10[0];
            lineRight = ((View) obj).getMeasuredWidth() + i10;
        } else {
            int lineLeft = (int) (layout.getLineLeft(lineForOffset) + m10[0] + aaVar.a + q9Var.d);
            lineRight = (int) (layout.getLineRight(lineForOffset) + m10[0] + aaVar.a + q9Var.d);
            i10 = lineLeft;
        }
        if (i9 < i10) {
            i9 = i10;
        } else if (i9 > lineRight) {
            i9 = lineRight;
        }
        float f10 = lineTop;
        if (aaVar.I != f10) {
            aaVar.I = f10;
            aaVar.J = (f10 - aaVar.H) / 200.0f;
        }
        float f11 = i9;
        if (aaVar.L != f11) {
            aaVar.L = f11;
            aaVar.M = (f11 - aaVar.K) / 100.0f;
        }
        if (aaVar.G == null) {
            aaVar.G = new Magnifier(aaVar.C);
            aaVar.H = aaVar.I;
            aaVar.K = aaVar.L;
        }
        float f12 = aaVar.H;
        float f13 = aaVar.I;
        if (f12 != f13) {
            aaVar.H = (aaVar.J * 16.0f) + f12;
        }
        float f14 = aaVar.J;
        if (f14 > 0.0f && aaVar.H > f13) {
            aaVar.H = f13;
        } else if (f14 < 0.0f && aaVar.H < f13) {
            aaVar.H = f13;
        }
        float f15 = aaVar.K;
        float f16 = aaVar.L;
        if (f15 != f16) {
            aaVar.K = (aaVar.M * 16.0f) + f15;
        }
        float f17 = aaVar.M;
        if (f17 > 0.0f && aaVar.K > f16) {
            aaVar.K = f16;
        } else if (f17 < 0.0f && aaVar.K < f16) {
            aaVar.K = f16;
        }
        aaVar.G.show(aaVar.K, (lineBottom * 1.5f) + aaVar.H + AndroidUtilities.dp(8.0f));
        aaVar.G.update();
    }

    public static boolean z(char c10) {
        return Character.isLetter(c10) || Character.isDigit(c10) || c10 == '_';
    }

    public boolean A(MessageObject messageObject) {
        return messageObject != null && this.w == messageObject.getId();
    }

    public void B(int i9, int i10, boolean z10, float f10, float f11, v9 v9Var) {
        int i11;
        int i12;
        if (this.j) {
            this.u = i10;
            if (!z10 && i10 > (i12 = this.v)) {
                this.v = i10;
                this.u = i12;
                this.j = false;
            }
            this.y = true;
            return;
        }
        this.v = i10;
        if (!z10 && (i11 = this.u) > i10) {
            this.v = i11;
            this.u = i10;
            this.j = true;
        }
        this.y = true;
    }

    public final int[] C(int i9) {
        q9 q9Var = this.a0;
        j(i9, q9Var, false);
        Layout layout = q9Var.b;
        int i10 = i9 - q9Var.a;
        int[] iArr = this.h;
        if (layout != null && i10 >= 0 && i10 <= layout.getText().length()) {
            int lineForOffset = layout.getLineForOffset(i10);
            iArr[0] = (int) (layout.getPrimaryHorizontal(i10) + q9Var.d);
            int lineBottom = layout.getLineBottom(lineForOffset);
            iArr[1] = lineBottom;
            iArr[1] = (int) (lineBottom + q9Var.c);
        }
        return iArr;
    }

    public boolean D() {
        return false;
    }

    public final void H() {
        z9 z9Var;
        if (!y() || (z9Var = this.C) == null) {
            return;
        }
        this.Q = true;
        z9Var.invalidate();
        v();
    }

    public boolean K() {
        return false;
    }

    public abstract void M(v9 v9Var, v9 v9Var2);

    public final boolean N(MotionEvent motionEvent) {
        aa aaVar;
        int action = motionEvent.getAction();
        h9 h9Var = this.g0;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    int y10 = (int) motionEvent.getY();
                    int x10 = (int) motionEvent.getX();
                    int i9 = this.t - y10;
                    int i10 = this.s - x10;
                    int i11 = (i10 * i10) + (i9 * i9);
                    int i12 = this.m;
                    if (i11 > i12 * i12) {
                        AndroidUtilities.cancelRunOnUIThread(h9Var);
                        this.z = false;
                    }
                    return this.z;
                }
                if (action != 3) {
                    return false;
                }
            }
            AndroidUtilities.cancelRunOnUIThread(h9Var);
            this.z = false;
            return false;
        }
        this.s = (int) motionEvent.getX();
        this.t = (int) motionEvent.getY();
        this.z = false;
        int i13 = -AndroidUtilities.dp(8.0f);
        int i14 = -AndroidUtilities.dp(8.0f);
        Rect rect = this.B;
        rect.inset(i13, i14);
        if (!rect.contains(this.s, this.t) || this.X == null) {
            aaVar = this;
        } else {
            rect.inset(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            int i15 = this.s;
            int i16 = this.t;
            int i17 = rect.right;
            if (i15 > i17) {
                i15 = i17 - 1;
            }
            int i18 = rect.left;
            if (i15 < i18) {
                i15 = i18 + 1;
            }
            int i19 = i15;
            int i20 = rect.top;
            if (i16 < i20) {
                i16 = i20 + 1;
            }
            int i21 = rect.bottom;
            if (i16 > i21) {
                i16 = i21 - 1;
            }
            aaVar = this;
            int l10 = aaVar.l(i19, i16, this.c, this.d, this.X, true);
            CharSequence t10 = t(aaVar.X, true);
            if (l10 >= t10.length()) {
                q9 q9Var = aaVar.a0;
                j(l10, q9Var, true);
                Layout layout = q9Var.b;
                if (layout == null) {
                    aaVar.z = false;
                    return false;
                }
                int lineCount = layout.getLineCount() - 1;
                float f10 = i19 - aaVar.c;
                if (f10 < q9Var.b.getLineRight(lineCount) + AndroidUtilities.dp(4.0f) && f10 > q9Var.b.getLineLeft(lineCount)) {
                    l10 = t10.length() - 1;
                }
            }
            if (l10 >= 0 && l10 < t10.length() && t10.charAt(l10) != '\n') {
                AndroidUtilities.cancelRunOnUIThread(h9Var);
                AndroidUtilities.runOnUIThread(h9Var, aaVar.l);
                aaVar.z = true;
            }
        }
        return aaVar.z;
    }

    public boolean Q(int i9, int i10) {
        return false;
    }

    public final void R(ih.i2 i2Var) {
        this.D = i2Var;
    }

    public final void S() {
        this.j0 = true;
    }

    public final void T(ViewGroup viewGroup) {
        if (viewGroup instanceof wk0) {
            this.E = (wk0) viewGroup;
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
        int i9;
        if (this.C == null) {
            return;
        }
        int i10 = Build.VERSION.SDK_INT;
        ActionMode.Callback callback = this.A;
        if (i10 >= 23) {
            if (!this.i && y() && d()) {
                if (!this.P) {
                    if (this.Y == null) {
                        org.telegram.ui.ActionBar.g4 g4Var = new org.telegram.ui.ActionBar.g4(this.C.getContext(), mg.b.d(callback), this.C, new org.telegram.ui.ActionBar.v4(this.C.getContext(), this.C, 1, r(), null));
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
                this.o0.setOnTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Cells.f9
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        org.telegram.ui.ActionBar.o1 o1Var;
                        aa aaVar = aa.this;
                        aaVar.getClass();
                        if (motionEvent.getActionMasked() != 0 || (o1Var = aaVar.n0) == null || !o1Var.isShowing()) {
                            return false;
                        }
                        view.getHitRect(aaVar.q0);
                        return false;
                    }
                });
                this.o0.setShownFromBottom(false);
                TextView textView = new TextView(this.C.getContext());
                this.p0 = textView;
                int i11 = org.telegram.ui.ActionBar.f6.i6;
                textView.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.f0(u(i11), 2, -1));
                this.p0.setGravity(16);
                this.p0.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
                this.p0.setTextSize(1, 15.0f);
                this.p0.setTypeface(AndroidUtilities.bold());
                this.p0.setText(this.C.getContext().getString(android.R.string.copy));
                TextView textView2 = this.p0;
                int i12 = org.telegram.ui.ActionBar.f6.E8;
                textView2.setTextColor(u(i12));
                final int i13 = 0;
                this.p0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.g9
                    public final /* synthetic */ aa b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i13) {
                            case 0:
                                this.b.g();
                                break;
                            case 1:
                                aa aaVar = this.b;
                                aaVar.E();
                                aaVar.v();
                                break;
                            default:
                                aa aaVar2 = this.b;
                                aaVar2.I();
                                aaVar2.v();
                                break;
                        }
                    }
                });
                this.o0.addView(this.p0, g7.e6.c(48.0f, -2));
                boolean z10 = this instanceof qh.c3;
                if (z10) {
                    TextView textView3 = new TextView(this.C.getContext());
                    textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.v0(i11, this.h0), 2, -1));
                    textView3.setGravity(16);
                    textView3.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
                    j3.r0.u(15.0f, 1, textView3);
                    textView3.setText(this.C.getContext().getString(android.R.string.cut));
                    textView3.setTextColor(org.telegram.ui.ActionBar.f6.v0(i12, this.h0));
                    final int i14 = 1;
                    textView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.g9
                        public final /* synthetic */ aa b;

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
                                    aa aaVar = this.b;
                                    aaVar.E();
                                    aaVar.v();
                                    break;
                                default:
                                    aa aaVar2 = this.b;
                                    aaVar2.I();
                                    aaVar2.v();
                                    break;
                            }
                        }
                    });
                    this.o0.addView(textView3, g7.e6.c(48.0f, -2));
                }
                if (z10) {
                    TextView textView4 = new TextView(this.C.getContext());
                    textView4.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.v0(i11, this.h0), 2, -1));
                    textView4.setGravity(16);
                    textView4.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
                    j3.r0.u(15.0f, 1, textView4);
                    textView4.setText(this.C.getContext().getString(android.R.string.paste));
                    textView4.setTextColor(org.telegram.ui.ActionBar.f6.v0(i12, this.h0));
                    final int i15 = 2;
                    textView4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.g9
                        public final /* synthetic */ aa b;

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
                                    aa aaVar = this.b;
                                    aaVar.E();
                                    aaVar.v();
                                    break;
                                default:
                                    aa aaVar2 = this.b;
                                    aaVar2.I();
                                    aaVar2.v();
                                    break;
                            }
                        }
                    });
                    this.o0.addView(textView4, g7.e6.c(48.0f, -2));
                }
                org.telegram.ui.ActionBar.o1 o1Var = new org.telegram.ui.ActionBar.o1(this.o0, -2, -2);
                this.n0 = o1Var;
                o1Var.b = false;
                o1Var.setAnimationStyle(R.style.PopupContextAnimation);
                this.n0.setOutsideTouchable(true);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.o0;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.setBackgroundColor(u(org.telegram.ui.ActionBar.f6.G8));
                }
            }
            if (this.W != null) {
                int i16 = -n();
                int i17 = i16 / 2;
                i9 = (i17 + ((C(this.u)[1] + this.b) + m()[1])) - AndroidUtilities.dp(4.0f);
            }
            i9 = 0;
            this.n0.showAtLocation(this.C, 48, 0, i9 - AndroidUtilities.dp(48.0f));
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

    public boolean c(int i9) {
        return (i9 == this.u || i9 == this.v) ? false : true;
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
        z9 z9Var = this.C;
        if (z9Var != null) {
            z9Var.setVisibility(8);
            this.C.c();
        }
        this.V = 0.0f;
        g7.a6 a6Var = this.D;
        if (a6Var != null) {
            a6Var.a(false);
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
            g7.a6 a6Var = this.D;
            if (a6Var != null) {
                a6Var.b();
            }
        }
    }

    public final void h(Layout layout, int i9, int i10, int i11, boolean z10, boolean z11, float f10) {
        float f11;
        float f12;
        int i12;
        kq kqVar;
        float f13;
        u9 u9Var = this.t0;
        u9Var.reset();
        layout.getSelectionPath(i10, i11, u9Var);
        if (u9Var.a < layout.getLineBottom(i9)) {
            int lineTop = layout.getLineTop(i9);
            float lineBottom = layout.getLineBottom(i9) - lineTop;
            f12 = lineTop;
            f11 = lineBottom / (u9Var.a - f12);
        } else {
            f11 = 1.0f;
            f12 = 0.0f;
        }
        int i13 = 0;
        while (true) {
            i12 = u9Var.c;
            kqVar = this.q;
            f13 = this.n;
            if (i13 >= i12) {
                break;
            }
            RectF rectF = (RectF) u9Var.b.get(i13);
            rectF.set((int) (Math.max(f10, rectF.left) - (z10 ? f13 / 2.0f : 0.0f)), (int) e2.c.z(rectF.top, f12, f11, f12), (int) (Math.max(f10, rectF.right) + (z11 ? f13 / 2.0f : 0.0f)), (int) e2.c.z(rectF.bottom, f12, f11, f12));
            kqVar.addRect(rectF, Path.Direction.CW);
            i13++;
        }
        if (i12 != 0 || z11) {
            return;
        }
        try {
            kqVar.addRect(((int) layout.getPrimaryHorizontal(i10)) - (f13 / 2.0f), layout.getLineTop(i9), (f13 / 4.0f) + ((int) layout.getPrimaryHorizontal(i11)), layout.getLineBottom(i9), Path.Direction.CW);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0106 A[LOOP:1: B:68:0x0104->B:69:0x0106, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(Canvas canvas, Layout layout, int i9, int i10, boolean z10, boolean z11, float f10) {
        int i11;
        Rect rect;
        int i12;
        float f11;
        int i13;
        Path path;
        int i14;
        int i15;
        aa aaVar;
        int i16;
        float lineRight;
        kq kqVar;
        if (layout == null || layout.getText() == null) {
            return;
        }
        int clamp = Utilities.clamp(i9, layout.getText().length(), 0);
        int clamp2 = Utilities.clamp(i10, layout.getText().length(), 0);
        kq kqVar2 = this.q;
        kqVar2.reset();
        Path path2 = this.r;
        path2.reset();
        float f12 = this.n;
        float f13 = f12 * 1.65f;
        int i17 = (int) (f12 / 2.0f);
        int lineForOffset = layout.getLineForOffset(clamp);
        int lineForOffset2 = layout.getLineForOffset(clamp2);
        if (lineForOffset == lineForOffset2) {
            h(layout, lineForOffset, clamp, clamp2, !z10, !z11, f10);
            aaVar = this;
            path = path2;
            f11 = f13;
            i14 = lineForOffset;
            i15 = clamp;
            i13 = lineForOffset2;
        } else {
            int lineEnd = layout.getLineEnd(lineForOffset);
            if (layout.getParagraphDirection(lineForOffset) == -1 || lineEnd <= 0) {
                i11 = lineEnd;
            } else {
                i11 = lineEnd - 1;
                CharSequence text = layout.getText();
                int primaryHorizontal = (int) layout.getPrimaryHorizontal(i11);
                if (layout.isRtlCharAt(i11)) {
                    int i18 = i11;
                    while (layout.isRtlCharAt(i18) && i18 != 0) {
                        i18--;
                    }
                    i16 = lineEnd;
                    lineRight = layout.getLineForOffset(i18) == layout.getLineForOffset(i11) ? layout.getPrimaryHorizontal(i18 + 1) : layout.getLineLeft(lineForOffset);
                } else {
                    i16 = lineEnd;
                    lineRight = layout.getLineRight(lineForOffset);
                }
                int i19 = (int) lineRight;
                int min = Math.min(primaryHorizontal, i19);
                int max = Math.max(primaryHorizontal, i19);
                if (i11 > 0 && i11 < text.length() && !Character.isWhitespace(text.charAt(i16 - 2))) {
                    rect = new Rect(((int) Math.max(f10, min)) - i17, layout.getLineTop(lineForOffset), ((int) Math.max(f10, max)) + i17, layout.getLineBottom(lineForOffset));
                    h(layout, lineForOffset, clamp, i11, !z10, true, f10);
                    if (rect != null) {
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(rect);
                        kqVar2.addRect(rectF, Path.Direction.CW);
                    }
                    i12 = lineForOffset + 1;
                    while (i12 < lineForOffset2) {
                        int lineLeft = (int) layout.getLineLeft(i12);
                        int lineRight2 = (int) layout.getLineRight(i12);
                        int min2 = Math.min(lineLeft, lineRight2);
                        int max2 = Math.max(lineLeft, lineRight2);
                        float max3 = Math.max(f10, min2);
                        float f14 = i17;
                        kqVar2.addRect(max3 - f14, layout.getLineTop(i12), Math.max(f10, max2) + f14, layout.getLineBottom(i12) + 1, Path.Direction.CW);
                        i12++;
                        lineForOffset2 = lineForOffset2;
                        i17 = i17;
                        lineForOffset = lineForOffset;
                        path2 = path2;
                        f13 = f13;
                    }
                    int i20 = lineForOffset;
                    f11 = f13;
                    i13 = lineForOffset2;
                    path = path2;
                    i14 = i20;
                    clamp2 = clamp2;
                    i15 = clamp;
                    aaVar = this;
                    aaVar.h(layout, i13, layout.getLineStart(i13), clamp2, true, !z11, f10);
                }
            }
            rect = null;
            h(layout, lineForOffset, clamp, i11, !z10, true, f10);
            if (rect != null) {
            }
            i12 = lineForOffset + 1;
            while (i12 < lineForOffset2) {
            }
            int i202 = lineForOffset;
            f11 = f13;
            i13 = lineForOffset2;
            path = path2;
            i14 = i202;
            clamp2 = clamp2;
            i15 = clamp;
            aaVar = this;
            aaVar.h(layout, i13, layout.getLineStart(i13), clamp2, true, !z11, f10);
        }
        int i21 = Build.VERSION.SDK_INT;
        boolean z12 = i21 >= 26;
        if (z12) {
            canvas.save();
        }
        float primaryHorizontal2 = layout.getPrimaryHorizontal(i15);
        float primaryHorizontal3 = layout.getPrimaryHorizontal(clamp2);
        float lineBottom = layout.getLineBottom(i14);
        float lineBottom2 = layout.getLineBottom(i13);
        if (z10 && z11 && lineBottom == lineBottom2 && Math.abs(primaryHorizontal3 - primaryHorizontal2) < f11) {
            float min3 = Math.min(primaryHorizontal2, primaryHorizontal3);
            float max4 = Math.max(primaryHorizontal2, primaryHorizontal3);
            Rect rect2 = AndroidUtilities.rectTmp2;
            rect2.set((int) min3, (int) (lineBottom - f11), (int) max4, (int) lineBottom);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(rect2);
            path.addRect(rectF2, Path.Direction.CW);
            if (i21 >= 26) {
                canvas.clipOutRect(rect2);
            }
            kqVar = kqVar2;
        } else {
            if (!z10 || layout.isRtlCharAt(i15)) {
                kqVar = kqVar2;
            } else {
                Rect rect3 = AndroidUtilities.rectTmp2;
                kqVar = kqVar2;
                rect3.set((int) primaryHorizontal2, (int) (lineBottom - f11), (int) Math.min(primaryHorizontal2 + f11, layout.getLineRight(i14)), (int) lineBottom);
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(rect3);
                path.addRect(rectF3, Path.Direction.CW);
                if (i21 >= 26) {
                    rect3.set(rect3.left - ((int) f11), rect3.top, rect3.right, rect3.bottom);
                    canvas.clipOutRect(rect3);
                }
            }
            if (z11 && !layout.isRtlCharAt(clamp2)) {
                Rect rect4 = AndroidUtilities.rectTmp2;
                rect4.set((int) Math.max(primaryHorizontal3 - f11, layout.getLineLeft(i13)), (int) (lineBottom2 - f11), (int) primaryHorizontal3, (int) lineBottom2);
                RectF rectF4 = AndroidUtilities.rectTmp;
                rectF4.set(rect4);
                path.addRect(rectF4, Path.Direction.CW);
                if (i21 >= 26) {
                    canvas.clipOutRect(rect4);
                }
            }
        }
        kqVar.a();
        canvas.drawPath(kqVar, aaVar.o);
        if (z12) {
            canvas.restore();
            canvas.drawPath(path, aaVar.p);
        }
    }

    public abstract void j(int i9, q9 q9Var, boolean z10);

    public boolean k() {
        return false;
    }

    public abstract int l(int i9, int i10, int i11, int i12, v9 v9Var, boolean z10);

    public final int[] m() {
        int i9;
        View view = (View) this.W;
        int i10 = 0;
        if (view != null && this.F != null) {
            i9 = 0;
            int i11 = 0;
            while (view != this.F) {
                if (view != null) {
                    i9 = (int) (view.getY() + i9);
                    i11 = (int) (view.getX() + i11);
                    if (view instanceof NestedScrollView) {
                        i9 -= view.getScrollY();
                        i11 -= view.getScrollX();
                    }
                    if (view.getParent() instanceof View) {
                        view = (View) view.getParent();
                    }
                }
            }
            i10 = i11;
            return new int[]{i10, i9};
        }
        i9 = 0;
        return new int[]{i10, i9};
    }

    public abstract int n();

    public final z9 o(Context context) {
        if (this.C == null) {
            this.C = new z9(this, context);
        }
        return this.C;
    }

    public int p() {
        return 0;
    }

    public int q() {
        return 0;
    }

    public org.telegram.ui.ActionBar.b6 r() {
        return this.h0;
    }

    public CharSequence s() {
        CharSequence t10 = t(this.W, false);
        if (t10 != null) {
            return t10.subSequence(this.u, this.v);
        }
        return null;
    }

    public abstract CharSequence t(v9 v9Var, boolean z10);

    public int u(int i9) {
        return org.telegram.ui.ActionBar.f6.v0(i9, this.h0);
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
        v9 v9Var = this.W;
        if (v9Var != null) {
            v9Var.invalidate();
        }
        z9 z9Var = this.C;
        if (z9Var != null) {
            z9Var.invalidate();
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

    public void L(float f10, float f11) {
    }

    public void J(int i9, int i10, MessageObject messageObject) {
    }
}
