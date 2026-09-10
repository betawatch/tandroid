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
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.vl0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public abstract class fa {
    public final ActionMode.Callback A;
    public final Rect B;
    public ea C;
    public w7.w5 D;
    public vl0 E;
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
    public aa W;
    public aa X;
    public ActionMode Y;
    public boolean Z;
    public int a;
    public final v9 a0;
    public int b;
    public int b0;
    public int c;
    public final OvershootInterpolator c0;
    public int d;
    public boolean d0;
    public boolean e;
    public int e0;
    public float f;
    public final l9 f0;
    public float g;
    public final m9 g0;
    public final int[] h = new int[2];
    public org.telegram.ui.ActionBar.f6 h0;
    public boolean i;
    public boolean i0;
    public boolean j;
    public boolean j0;
    public boolean k;
    public boolean k0;
    public final int l;
    public org.telegram.ui.u l0;
    public final int m;
    public ValueAnimator m0;
    public final float n;
    public org.telegram.ui.ActionBar.p1 n0;
    public final Paint o;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout o0;
    public final Paint p;
    public TextView p0;
    public final ar q;
    public Rect q0;
    public final Path r;
    public final g r0;
    public int s;
    public final n9 s0;
    public int t;
    public final z9 t0;
    public int u;
    public int v;
    public int w;
    public int x;
    public boolean y;
    public boolean z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v7, types: [org.telegram.ui.Cells.q9] */
    public fa() {
        new x9().a = 0.0f;
        Paint paint = new Paint(1);
        this.o = paint;
        this.p = new Paint(1);
        ar arVar = new ar();
        this.q = arVar;
        this.r = new Path();
        new w9().a = arVar;
        this.u = -1;
        this.v = -1;
        p9 p9Var = new p9(this);
        this.A = Build.VERSION.SDK_INT >= 23 ? new q9(this, p9Var) : p9Var;
        this.B = new Rect();
        this.S = new RectF();
        this.T = new RectF();
        this.a0 = new v9();
        this.c0 = new OvershootInterpolator();
        this.d0 = false;
        this.f0 = new l9(this, 0);
        this.g0 = new m9(this);
        this.i0 = true;
        this.l0 = null;
        this.r0 = new g(this, 7);
        this.s0 = new n9(this);
        z9 z9Var = new z9();
        z9Var.a = 0.0f;
        z9Var.b = new ArrayList(1);
        z9Var.c = 0;
        this.t0 = z9Var;
        this.l = ViewConfiguration.getLongPressTimeout();
        this.m = ViewConfiguration.get(ApplicationLoader.applicationContext).getScaledTouchSlop();
        float dp = AndroidUtilities.dp(6.0f);
        this.n = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
        arVar.d = 1.0f;
    }

    public static void a(fa faVar, int i10) {
        int lineRight;
        int i11;
        v9 v9Var = faVar.a0;
        if (Build.VERSION.SDK_INT < 28 || faVar.W == null || faVar.k || !faVar.i || faVar.C == null) {
            return;
        }
        int i12 = faVar.j ? faVar.u : faVar.v;
        faVar.j(i12, v9Var, false);
        Layout layout = v9Var.b;
        if (layout == null) {
            return;
        }
        int lineForOffset = layout.getLineForOffset(Utilities.clamp(i12 - v9Var.a, layout.getText().length(), 0));
        int lineBottom = layout.getLineBottom(lineForOffset) - layout.getLineTop(lineForOffset);
        int[] m10 = faVar.m();
        int lineTop = (int) (((((layout.getLineTop(lineForOffset) + faVar.b) + m10[1]) - lineBottom) - AndroidUtilities.dp(8.0f)) + v9Var.c);
        Object obj = faVar.W;
        if (obj instanceof org.telegram.ui.v2) {
            i11 = m10[0];
            lineRight = ((View) obj).getMeasuredWidth() + i11;
        } else {
            int lineLeft = (int) (layout.getLineLeft(lineForOffset) + m10[0] + faVar.a + v9Var.d);
            lineRight = (int) (layout.getLineRight(lineForOffset) + m10[0] + faVar.a + v9Var.d);
            i11 = lineLeft;
        }
        if (i10 < i11) {
            i10 = i11;
        } else if (i10 > lineRight) {
            i10 = lineRight;
        }
        float f7 = lineTop;
        if (faVar.I != f7) {
            faVar.I = f7;
            faVar.J = (f7 - faVar.H) / 200.0f;
        }
        float f10 = i10;
        if (faVar.L != f10) {
            faVar.L = f10;
            faVar.M = (f10 - faVar.K) / 100.0f;
        }
        if (faVar.G == null) {
            faVar.G = new Magnifier(faVar.C);
            faVar.H = faVar.I;
            faVar.K = faVar.L;
        }
        float f11 = faVar.H;
        float f12 = faVar.I;
        if (f11 != f12) {
            faVar.H = (faVar.J * 16.0f) + f11;
        }
        float f13 = faVar.J;
        if (f13 > 0.0f && faVar.H > f12) {
            faVar.H = f12;
        } else if (f13 < 0.0f && faVar.H < f12) {
            faVar.H = f12;
        }
        float f14 = faVar.K;
        float f15 = faVar.L;
        if (f14 != f15) {
            faVar.K = (faVar.M * 16.0f) + f14;
        }
        float f16 = faVar.M;
        if (f16 > 0.0f && faVar.K > f15) {
            faVar.K = f15;
        } else if (f16 < 0.0f && faVar.K < f15) {
            faVar.K = f15;
        }
        faVar.G.show(faVar.K, (lineBottom * 1.5f) + faVar.H + AndroidUtilities.dp(8.0f));
        faVar.G.update();
    }

    public static boolean z(char c10) {
        return Character.isLetter(c10) || Character.isDigit(c10) || c10 == '_';
    }

    public boolean A(MessageObject messageObject) {
        return messageObject != null && this.w == messageObject.getId();
    }

    public void B(int i10, int i11, boolean z10, float f7, float f10, aa aaVar) {
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
        v9 v9Var = this.a0;
        j(i10, v9Var, false);
        Layout layout = v9Var.b;
        int i11 = i10 - v9Var.a;
        int[] iArr = this.h;
        if (layout != null && i11 >= 0 && i11 <= layout.getText().length()) {
            int lineForOffset = layout.getLineForOffset(i11);
            iArr[0] = (int) (layout.getPrimaryHorizontal(i11) + v9Var.d);
            int lineBottom = layout.getLineBottom(lineForOffset);
            iArr[1] = lineBottom;
            iArr[1] = (int) (lineBottom + v9Var.c);
        }
        return iArr;
    }

    public boolean D() {
        return false;
    }

    public final void H() {
        ea eaVar;
        if (!y() || (eaVar = this.C) == null) {
            return;
        }
        this.Q = true;
        eaVar.invalidate();
        v();
    }

    public boolean K() {
        return false;
    }

    public abstract void M(aa aaVar, aa aaVar2);

    public final boolean N(MotionEvent motionEvent) {
        fa faVar;
        int action = motionEvent.getAction();
        m9 m9Var = this.g0;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    int y3 = (int) motionEvent.getY();
                    int x10 = (int) motionEvent.getX();
                    int i10 = this.t - y3;
                    int i11 = this.s - x10;
                    int i12 = (i11 * i11) + (i10 * i10);
                    int i13 = this.m;
                    if (i12 > i13 * i13) {
                        AndroidUtilities.cancelRunOnUIThread(m9Var);
                        this.z = false;
                    }
                    return this.z;
                }
                if (action != 3) {
                    return false;
                }
            }
            AndroidUtilities.cancelRunOnUIThread(m9Var);
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
            faVar = this;
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
            faVar = this;
            int l4 = faVar.l(i20, i17, this.c, this.d, this.X, true);
            CharSequence t10 = t(faVar.X, true);
            if (l4 >= t10.length()) {
                v9 v9Var = faVar.a0;
                j(l4, v9Var, true);
                Layout layout = v9Var.b;
                if (layout == null) {
                    faVar.z = false;
                    return false;
                }
                int lineCount = layout.getLineCount() - 1;
                float f7 = i20 - faVar.c;
                if (f7 < v9Var.b.getLineRight(lineCount) + AndroidUtilities.dp(4.0f) && f7 > v9Var.b.getLineLeft(lineCount)) {
                    l4 = t10.length() - 1;
                }
            }
            if (l4 >= 0 && l4 < t10.length() && t10.charAt(l4) != '\n') {
                AndroidUtilities.cancelRunOnUIThread(m9Var);
                AndroidUtilities.runOnUIThread(m9Var, faVar.l);
                faVar.z = true;
            }
        }
        return faVar.z;
    }

    public boolean Q(int i10, int i11) {
        return false;
    }

    public final void R(org.telegram.ui.z0 z0Var) {
        this.D = z0Var;
    }

    public final void S() {
        this.j0 = true;
    }

    public final void T(ViewGroup viewGroup) {
        if (viewGroup instanceof vl0) {
            this.E = (vl0) viewGroup;
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
                        org.telegram.ui.ActionBar.k4 k4Var = new org.telegram.ui.ActionBar.k4(this.C.getContext(), n2.l.g(callback), this.C, new org.telegram.ui.ActionBar.z4(this.C.getContext(), this.C, 1, r(), null));
                        this.Y = k4Var;
                        callback.onCreateActionMode(k4Var, k4Var.c);
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
                this.o0.setOnTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Cells.j9
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        org.telegram.ui.ActionBar.p1 p1Var;
                        fa faVar = fa.this;
                        faVar.getClass();
                        if (motionEvent.getActionMasked() != 0 || (p1Var = faVar.n0) == null || !p1Var.isShowing()) {
                            return false;
                        }
                        view.getHitRect(faVar.q0);
                        return false;
                    }
                });
                this.o0.setShownFromBottom(false);
                TextView textView = new TextView(this.C.getContext());
                this.p0 = textView;
                int i12 = org.telegram.ui.ActionBar.j6.i6;
                textView.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(u(i12), 2, -1));
                this.p0.setGravity(16);
                this.p0.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
                this.p0.setTextSize(1, 15.0f);
                this.p0.setTypeface(AndroidUtilities.bold());
                this.p0.setText(this.C.getContext().getString(android.R.string.copy));
                TextView textView2 = this.p0;
                int i13 = org.telegram.ui.ActionBar.j6.E8;
                textView2.setTextColor(u(i13));
                final int i14 = 0;
                this.p0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.k9
                    public final /* synthetic */ fa b;

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
                                fa faVar = this.b;
                                faVar.E();
                                faVar.v();
                                break;
                            default:
                                fa faVar2 = this.b;
                                faVar2.I();
                                faVar2.v();
                                break;
                        }
                    }
                });
                this.o0.addView(this.p0, w7.a6.c(48.0f, -2));
                boolean z10 = this instanceof hi.m3;
                if (z10) {
                    TextView textView3 = new TextView(this.C.getContext());
                    textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(i12, this.h0), 2, -1));
                    textView3.setGravity(16);
                    textView3.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
                    com.google.android.gms.internal.vision.e2.k(15.0f, 1, textView3);
                    textView3.setText(this.C.getContext().getString(android.R.string.cut));
                    textView3.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, this.h0));
                    final int i15 = 1;
                    textView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.k9
                        public final /* synthetic */ fa b;

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
                                    fa faVar = this.b;
                                    faVar.E();
                                    faVar.v();
                                    break;
                                default:
                                    fa faVar2 = this.b;
                                    faVar2.I();
                                    faVar2.v();
                                    break;
                            }
                        }
                    });
                    this.o0.addView(textView3, w7.a6.c(48.0f, -2));
                }
                if (z10) {
                    TextView textView4 = new TextView(this.C.getContext());
                    textView4.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(i12, this.h0), 2, -1));
                    textView4.setGravity(16);
                    textView4.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
                    com.google.android.gms.internal.vision.e2.k(15.0f, 1, textView4);
                    textView4.setText(this.C.getContext().getString(android.R.string.paste));
                    textView4.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, this.h0));
                    final int i16 = 2;
                    textView4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.k9
                        public final /* synthetic */ fa b;

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
                                    fa faVar = this.b;
                                    faVar.E();
                                    faVar.v();
                                    break;
                                default:
                                    fa faVar2 = this.b;
                                    faVar2.I();
                                    faVar2.v();
                                    break;
                            }
                        }
                    });
                    this.o0.addView(textView4, w7.a6.c(48.0f, -2));
                }
                org.telegram.ui.ActionBar.p1 p1Var = new org.telegram.ui.ActionBar.p1(this.o0, -2, -2);
                this.n0 = p1Var;
                p1Var.b = false;
                p1Var.setAnimationStyle(R.style.PopupContextAnimation);
                this.n0.setOutsideTouchable(true);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.o0;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.setBackgroundColor(u(org.telegram.ui.ActionBar.j6.G8));
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
        ea eaVar = this.C;
        if (eaVar != null) {
            eaVar.setVisibility(8);
            this.C.c();
        }
        this.V = 0.0f;
        w7.w5 w5Var = this.D;
        if (w5Var != null) {
            w5Var.a(false);
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
            w7.w5 w5Var = this.D;
            if (w5Var != null) {
                w5Var.b();
            }
        }
    }

    public final void h(Layout layout, int i10, int i11, int i12, boolean z10, boolean z11, float f7) {
        float f10;
        float f11;
        int i13;
        ar arVar;
        float f12;
        z9 z9Var = this.t0;
        z9Var.reset();
        layout.getSelectionPath(i11, i12, z9Var);
        if (z9Var.a < layout.getLineBottom(i10)) {
            int lineTop = layout.getLineTop(i10);
            float lineBottom = layout.getLineBottom(i10) - lineTop;
            f11 = lineTop;
            f10 = lineBottom / (z9Var.a - f11);
        } else {
            f10 = 1.0f;
            f11 = 0.0f;
        }
        int i14 = 0;
        while (true) {
            i13 = z9Var.c;
            arVar = this.q;
            f12 = this.n;
            if (i14 >= i13) {
                break;
            }
            RectF rectF = (RectF) z9Var.b.get(i14);
            rectF.set((int) (Math.max(f7, rectF.left) - (z10 ? f12 / 2.0f : 0.0f)), (int) com.google.android.gms.internal.vision.e2.z(rectF.top, f11, f10, f11), (int) (Math.max(f7, rectF.right) + (z11 ? f12 / 2.0f : 0.0f)), (int) com.google.android.gms.internal.vision.e2.z(rectF.bottom, f11, f10, f11));
            arVar.addRect(rectF, Path.Direction.CW);
            i14++;
        }
        if (i13 != 0 || z11) {
            return;
        }
        try {
            arVar.addRect(((int) layout.getPrimaryHorizontal(i11)) - (f12 / 2.0f), layout.getLineTop(i10), (f12 / 4.0f) + ((int) layout.getPrimaryHorizontal(i12)), layout.getLineBottom(i10), Path.Direction.CW);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0106 A[LOOP:1: B:68:0x0104->B:69:0x0106, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(Canvas canvas, Layout layout, int i10, int i11, boolean z10, boolean z11, float f7) {
        int i12;
        Rect rect;
        int i13;
        float f10;
        int i14;
        Path path;
        int i15;
        int i16;
        fa faVar;
        int i17;
        float lineRight;
        ar arVar;
        if (layout == null || layout.getText() == null) {
            return;
        }
        int clamp = Utilities.clamp(i10, layout.getText().length(), 0);
        int clamp2 = Utilities.clamp(i11, layout.getText().length(), 0);
        ar arVar2 = this.q;
        arVar2.reset();
        Path path2 = this.r;
        path2.reset();
        float f11 = this.n;
        float f12 = f11 * 1.65f;
        int i18 = (int) (f11 / 2.0f);
        int lineForOffset = layout.getLineForOffset(clamp);
        int lineForOffset2 = layout.getLineForOffset(clamp2);
        if (lineForOffset == lineForOffset2) {
            h(layout, lineForOffset, clamp, clamp2, !z10, !z11, f7);
            faVar = this;
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
                    rect = new Rect(((int) Math.max(f7, min)) - i18, layout.getLineTop(lineForOffset), ((int) Math.max(f7, max)) + i18, layout.getLineBottom(lineForOffset));
                    h(layout, lineForOffset, clamp, i12, !z10, true, f7);
                    if (rect != null) {
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(rect);
                        arVar2.addRect(rectF, Path.Direction.CW);
                    }
                    i13 = lineForOffset + 1;
                    while (i13 < lineForOffset2) {
                        int lineLeft = (int) layout.getLineLeft(i13);
                        int lineRight2 = (int) layout.getLineRight(i13);
                        int min2 = Math.min(lineLeft, lineRight2);
                        int max2 = Math.max(lineLeft, lineRight2);
                        float max3 = Math.max(f7, min2);
                        float f13 = i18;
                        arVar2.addRect(max3 - f13, layout.getLineTop(i13), Math.max(f7, max2) + f13, layout.getLineBottom(i13) + 1, Path.Direction.CW);
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
                    faVar = this;
                    faVar.h(layout, i14, layout.getLineStart(i14), clamp2, true, !z11, f7);
                }
            }
            rect = null;
            h(layout, lineForOffset, clamp, i12, !z10, true, f7);
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
            faVar = this;
            faVar.h(layout, i14, layout.getLineStart(i14), clamp2, true, !z11, f7);
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
            arVar = arVar2;
        } else {
            if (!z10 || layout.isRtlCharAt(i16)) {
                arVar = arVar2;
            } else {
                Rect rect3 = AndroidUtilities.rectTmp2;
                arVar = arVar2;
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
        arVar.a();
        canvas.drawPath(arVar, faVar.o);
        if (z12) {
            canvas.restore();
            canvas.drawPath(path, faVar.p);
        }
    }

    public abstract void j(int i10, v9 v9Var, boolean z10);

    public boolean k() {
        return false;
    }

    public abstract int l(int i10, int i11, int i12, int i13, aa aaVar, boolean z10);

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

    public final ea o(Context context) {
        if (this.C == null) {
            this.C = new ea(this, context);
        }
        return this.C;
    }

    public int p() {
        return 0;
    }

    public int q() {
        return 0;
    }

    public org.telegram.ui.ActionBar.f6 r() {
        return this.h0;
    }

    public CharSequence s() {
        CharSequence t10 = t(this.W, false);
        if (t10 != null) {
            return t10.subSequence(this.u, this.v);
        }
        return null;
    }

    public abstract CharSequence t(aa aaVar, boolean z10);

    public int u(int i10) {
        return org.telegram.ui.ActionBar.j6.v0(i10, this.h0);
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
        org.telegram.ui.ActionBar.p1 p1Var = this.n0;
        if (p1Var != null) {
            p1Var.d(true);
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
        aa aaVar = this.W;
        if (aaVar != null) {
            aaVar.invalidate();
        }
        ea eaVar = this.C;
        if (eaVar != null) {
            eaVar.invalidate();
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

    public void L(float f7, float f10) {
    }

    public void J(int i10, int i11, MessageObject messageObject) {
    }
}
