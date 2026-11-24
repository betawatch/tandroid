// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.DialogInterface;
import android.os.SystemClock;
import android.text.Editable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Random;
import java.util.WeakHashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraView;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.UsersSelectActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class o1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        boolean z2;
        boolean z3;
        nn3[] nn3VarArr;
        int i;
        byte b;
        int i2;
        Layout layout;
        boolean z4;
        int i3;
        int i4;
        boolean z5 = true;
        byte b2 = 0;
        switch (this.a) {
            case 0:
                s1 s1Var = (s1) this.b;
                m46 m46Var = s1Var.x;
                if (m46Var != null) {
                    CharacterStyle characterStyle = m46Var.i;
                    final String url = characterStyle instanceof g4c ? ((g4c) characterStyle).getURL() : characterStyle instanceof URLSpan ? ((URLSpan) characterStyle).getURL() : characterStyle.toString();
                    try {
                        s1Var.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    final StaticLayout staticLayout = s1Var.E;
                    final float f = s1Var.y;
                    if (s1Var.getContext() != null) {
                        final ClickableSpan clickableSpan = (ClickableSpan) s1Var.x.i;
                        fx0 h = de9.h(1, null, s1Var.getContext(), false);
                        h.P = url;
                        h.Q = false;
                        CharSequence[] charSequenceArr = {k96.M0(2131747624, null), k96.M0(2131751755, null)};
                        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: m1
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i5) {
                                s1 s1Var2 = (s1) o1.this.b;
                                d dVar = s1Var2.I;
                                if (i5 == 0) {
                                    s1Var2.d(clickableSpan, staticLayout, f);
                                    return;
                                }
                                if (i5 == 1) {
                                    String str = url;
                                    gl.g(str);
                                    if (gl.C3()) {
                                        if (str.startsWith("@")) {
                                            ir2.v(null, 2131743426, u21.b0(dVar), R.raw.copy, 36);
                                        } else if (str.startsWith("#") || str.startsWith("$")) {
                                            ir2.v(null, 2131749170, u21.b0(dVar), R.raw.copy, 36);
                                        } else {
                                            ir2.v(null, 2131748729, u21.b0(dVar), R.raw.copy, 36);
                                        }
                                    }
                                }
                            }
                        };
                        h.M = charSequenceArr;
                        h.L = onClickListener;
                        h.I0 = new n1(this, (byte) 0);
                        h.show();
                    }
                    s1Var.x = null;
                    return;
                }
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.b;
                if (actionBarLayout.d == this) {
                    actionBarLayout.d = null;
                    actionBarLayout.g0(false, true, false);
                    return;
                }
                return;
            case 2:
                gb gbVar = (gb) this.b;
                ValueAnimator valueAnimator = gbVar.m;
                if (valueAnimator == null || valueAnimator.isRunning()) {
                    return;
                }
                gbVar.m.start();
                return;
            case 3:
                n10 n10Var = (n10) this.b;
                i20 i20Var = n10Var.E;
                if (MediaController.w().v0 != null) {
                    int i5 = i20Var.C2 + 1;
                    i20Var.C2 = i5;
                    if (i5 != 1) {
                        if (i5 != 2) {
                            MediaController.w().l0(true, 13.0f);
                            return;
                        } else {
                            MediaController.w().l0(true, 7.0f);
                            gl.d3(this, 2000L);
                            return;
                        }
                    }
                    n10Var.w = true;
                    i20Var.A2 = 1;
                    if (MediaController.w().C()) {
                        i20Var.S0();
                    } else if (i20Var.A2 == 1) {
                        gl.r(i20Var.H2);
                        i20Var.E2 = 0L;
                    }
                    MediaController.w().l0(true, 4.0f);
                    gl.d3(this, 2000L);
                    return;
                }
                return;
            case 4:
                i20 i20Var2 = (i20) this.b;
                lbc lbcVar = MediaController.w().j0;
                long U = lbcVar == null ? 0L : lbcVar.U();
                if (U == 0 || U == -9223372036854775807L) {
                    i20Var2.D2 = System.currentTimeMillis();
                    return;
                }
                float f2 = i20Var2.B2;
                long currentTimeMillis = System.currentTimeMillis();
                long j = currentTimeMillis - i20Var2.D2;
                i20Var2.D2 = currentTimeMillis;
                long j2 = currentTimeMillis - i20Var2.E2;
                int i6 = i20Var2.C2;
                float f3 = ((long) ((f2 * r1) + (((i6 == 1 ? 3L : i6 == 2 ? 6L : 12L) * j) - j))) / U;
                if (f3 < 0.0f) {
                    f3 = 0.0f;
                }
                i20Var2.B2 = f3;
                k27 k27Var = MediaController.w().v0;
                if (k27Var != null && k27Var.I3()) {
                    if (!MediaController.w().C()) {
                        MediaController.w().v0.b0 = i20Var2.B2;
                    }
                    i20Var2.W0(k27Var, false);
                }
                if (i20Var2.A2 == 1 && i20Var2.C2 > 0 && MediaController.w().C()) {
                    if (j2 > 200 || i20Var2.B2 == 0.0f) {
                        i20Var2.E2 = currentTimeMillis;
                        MediaController.w().h0(MediaController.w().v0, f3);
                    }
                    if (i20Var2.C2 <= 0 || i20Var2.B2 <= 0.0f) {
                        return;
                    }
                    gl.d3(i20Var2.H2, 16L);
                    return;
                }
                return;
            case 5:
                UsersSelectActivity usersSelectActivity = new UsersSelectActivity(null);
                usersSelectActivity.P = new vf6();
                usersSelectActivity.Q = new ArrayList();
                usersSelectActivity.y = (byte) 1;
                usersSelectActivity.H = false;
                v60 v60Var = (v60) this.b;
                usersSelectActivity.T = v60Var.Y();
                usersSelectActivity.n = new l0(this, (byte) 24);
                v60Var.presentFragment(usersSelectActivity);
                return;
            case 6:
                s56 s56Var = (s56) this.b;
                er3 er3Var = s56Var.c;
                n70 n70Var = s56Var.a;
                if (s56Var.E) {
                    if (s56Var.x) {
                        s56Var.x = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        n70Var.d = currentAnimationTimeMillis;
                        n70Var.f = -1L;
                        n70Var.e = currentAnimationTimeMillis;
                        n70Var.g = 0.5f;
                    }
                    if ((n70Var.f > 0 && AnimationUtils.currentAnimationTimeMillis() > n70Var.f + n70Var.h) || !s56Var.e()) {
                        s56Var.E = false;
                        return;
                    }
                    if (s56Var.y) {
                        s56Var.y = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        er3Var.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (n70Var.e == 0) {
                        wn4.j("Cannot compute scroll delta before calling start()");
                        return;
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a = n70Var.a(currentAnimationTimeMillis2);
                    long j3 = currentAnimationTimeMillis2 - n70Var.e;
                    n70Var.e = currentAnimationTimeMillis2;
                    s56Var.G.scrollListBy((int) (j3 * ((a * 4.0f) + ((-4.0f) * a * a)) * n70Var.c));
                    WeakHashMap weakHashMap = jdc.a;
                    er3Var.postOnAnimation(this);
                    return;
                }
                return;
            case 7:
                hf0 hf0Var = (hf0) this.b;
                ef0 ef0Var = hf0Var.b;
                if (ef0Var == null) {
                    ef0Var = new ef0(hf0Var, b2);
                    hf0Var.b = ef0Var;
                }
                int i7 = hf0Var.c + 1;
                hf0Var.c = i7;
                ef0Var.b = i7;
                hf0Var.postDelayed(ef0Var, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                return;
            case 8:
                for (Thread thread : dk0.w.keySet()) {
                    if (!thread.isAlive()) {
                        dk0.w.remove(thread);
                    }
                }
                if (dk0.w.isEmpty()) {
                    dk0.x = false;
                    return;
                } else {
                    gl.d3(((dk0) this.b).p, 5000L);
                    return;
                }
            case 9:
                fx0 fx0Var = (fx0) this.b;
                if (fx0Var.H != this || (z = fx0Var.J)) {
                    return;
                }
                fx0Var.H = null;
                if (z) {
                    return;
                }
                fx0Var.b.setVisibility(0);
                if (fx0Var.j0()) {
                    return;
                }
                if (fx0Var.K) {
                    fx0Var.c.setLayerType(2, null);
                }
                boolean z6 = fx0Var.V0;
                ViewGroup viewGroup = fx0Var.b;
                if (z6) {
                    viewGroup.setTranslationX(gl.L(48.0f));
                    fx0Var.b.setAlpha(0.0f);
                    fx0Var.b.setTranslationY(0.0f);
                } else {
                    viewGroup.setTranslationY(Math.max(0, Math.min(gl.n, fx0Var.P())) + gl.L(10.0f) + fx0Var.Q() + fx0Var.f);
                }
                fx0Var.e0();
                fx0Var.B0 = (byte) 1;
                ValueAnimator valueAnimator2 = fx0Var.C0;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(fx0Var.D0, 1.0f);
                fx0Var.C0 = ofFloat;
                ofFloat.addUpdateListener(new sw0(fx0Var, (byte) 0));
                fx0Var.A0 = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                arrayList.add(ObjectAnimator.ofFloat(fx0Var.b, (Property<ViewGroup, Float>) View.TRANSLATION_X, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(fx0Var.b, (Property<ViewGroup, Float>) View.ALPHA, 1.0f));
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(fx0Var.b, (Property<ViewGroup, Float>) View.TRANSLATION_Y, 0.0f);
                ofFloat2.addUpdateListener(new sw0(fx0Var, (byte) 1));
                arrayList.add(ofFloat2);
                arrayList.add(ObjectAnimator.ofInt(fx0Var.Z, rn.d, fx0Var.p0 ? fx0Var.q0 : 0));
                arrayList.add(fx0Var.C0);
                fx0Var.C(arrayList, true);
                fx0Var.A0.playTogether(arrayList);
                boolean z7 = fx0Var.V0;
                AnimatorSet animatorSet = fx0Var.A0;
                if (z7) {
                    animatorSet.setDuration(250L);
                    fx0Var.A0.setInterpolator(s33.f);
                } else {
                    animatorSet.setDuration(fx0Var.k0);
                    fx0Var.A0.setInterpolator(fx0Var.l0);
                }
                fx0Var.A0.setStartDelay(fx0Var.E ? 0L : 20L);
                fx0Var.A0.setInterpolator(fx0Var.l0);
                fx0Var.M0.d();
                fx0Var.A0.addListener(new yw0(fx0Var, (byte) 0));
                if (fx0Var.L0) {
                    kk7.e().k(98, 512);
                }
                fx0Var.A0.start();
                return;
            case 10:
                BubbleActivity bubbleActivity = (BubbleActivity) this.b;
                if (bubbleActivity.Z == this) {
                    if (gl.n2(true)) {
                        if (w01.a) {
                            fa4.b("lock app");
                        }
                        bubbleActivity.A();
                    } else if (w01.a) {
                        fa4.b("didn't pass lock check");
                    }
                    bubbleActivity.Z = null;
                    return;
                }
                return;
            case 11:
                da1 da1Var = (da1) this.b;
                CameraView cameraView = da1Var.d;
                if (cameraView == null || da1Var.O || cameraView.getCameraSession() == null) {
                    return;
                }
                da1Var.f.post(new nv0(this, (byte) 13));
                return;
            case 12:
                ra1 ra1Var = (ra1) this.b;
                ra1Var.b(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                ra1Var.f.performHapticFeedback(0);
                Runnable runnable = ra1Var.j;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 13:
                yb1 yb1Var = (yb1) this.b;
                cc1 cc1Var = yb1Var.f;
                if (cc1Var == null || yb1Var.e == null) {
                    return;
                }
                float[] fArr = yb1Var.h;
                float[] fArr2 = yb1Var.g;
                float width = cc1Var.getWidth();
                float height = cc1Var.getHeight();
                float f4 = Float.MAX_VALUE;
                float f5 = -3.4028235E38f;
                int i8 = 0;
                while (i8 < 4) {
                    yb1Var.d(cc1Var, i8 % 2 == 0 ? 0.0f : width, i8 < 2 ? 0.0f : height);
                    f4 = Math.min(f4, fArr2[1]);
                    f5 = Math.max(f5, fArr2[1]);
                    i8++;
                }
                float f6 = width / 2.0f;
                float f7 = height / 2.0f;
                float d = yb1Var.d(cc1Var, f6, f7);
                float f8 = fArr2[1];
                float d2 = yb1Var.d(cc1Var, width, f7) - d;
                float f9 = fArr2[1] - f8;
                float hypot = width <= 0.0f ? 1.0f : ((float) Math.hypot(d2, f9)) / f6;
                yb1.g(cc1Var, fArr);
                yb1Var.e.d(d, f8, f4, f5, (float) Math.toDegrees(Math.atan2(f9, d2)), hypot, cc1Var.getEditText().getPaint(), cc1Var.getEditText().getCurrentTextColor(), fArr[0], fArr[1], fArr[2], cc1Var.getEditText().getLayout() != null ? cc1Var.getEditText().getLayout().getAlignment() : null);
                ViewParent parent = cc1Var.getParent();
                tb1 tb1Var = yb1Var.e;
                if (parent == null) {
                    tb1Var.e(null, null);
                } else {
                    tb1Var.e(cc1Var.x(-1), cc1Var.x(1));
                }
                yb1Var.e.postOnAnimation(this);
                return;
            case 14:
                cc1 cc1Var2 = (cc1) this.b;
                if (cc1Var2.isAttachedToWindow()) {
                    cc1Var2.z();
                    cc1Var2.postOnAnimation(this);
                    return;
                }
                return;
            case 15:
                c32 c32Var = (c32) this.b;
                if (c32Var.T) {
                    c32Var.O.clear();
                    c32Var.Q.clear();
                    c32Var.R.clear();
                    c32Var.f();
                    return;
                }
                return;
            case 16:
                l52 l52Var = (l52) this.b;
                m52 m52Var = l52Var.Q;
                if (m52Var.K == null || m52Var.L) {
                    return;
                }
                int computeVerticalScrollOffset = m52Var.r.computeVerticalScrollOffset();
                boolean z8 = m52Var.r.computeVerticalScrollExtent() + computeVerticalScrollOffset >= (l52Var.e() - l52Var.r) + l52Var.n;
                float max = Math.max(0.0f, (m52Var.F - Math.max(0, computeVerticalScrollOffset - m52Var.getListTopPadding())) - gl.L(52.0f));
                float max2 = Math.max(0.0f, ((m52Var.r.getMeasuredHeight() - (m52Var.F - computeVerticalScrollOffset)) - m52Var.getListTopPadding()) - gl.L(84.0f));
                float L = gl.L(32.0f);
                float L2 = (max >= L || computeVerticalScrollOffset <= m52Var.getListTopPadding()) ? max2 < L ? gl.L(6.0f) * (1.0f - (max2 / L)) : 0.0f : (-(1.0f - (max / L))) * gl.L(6.0f);
                int i9 = (int) L2;
                if (Math.abs(i9) > 0 && m52Var.r.canScrollVertically(i9) && (L2 <= 0.0f || !z8)) {
                    m52Var.F += L2;
                    m52Var.r.scrollBy(0, i9);
                    l52Var.invalidate();
                }
                l52Var.M = true;
                l52Var.postDelayed(this, 15L);
                return;
            case 17:
                k62 k62Var = (k62) this.b;
                o1 o1Var = k62Var.V0;
                le8 le8Var = k62Var.h1;
                if (le8Var != null) {
                    EditTextBoldCursor editField = le8Var.getEditField();
                    if (k62Var.I || editField == null || !k62Var.H || k62Var.f1 || gl.D || gl.E || !gl.O1()) {
                        return;
                    }
                    editField.requestFocus();
                    gl.E3(editField);
                    gl.r(o1Var);
                    gl.d3(o1Var, 100L);
                    return;
                }
                return;
            case 18:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e) {
                    if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e;
                    }
                    return;
                } catch (NullPointerException e2) {
                    if (!TextUtils.equals(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e2;
                    }
                    return;
                }
            case 19:
                ContactsActivity contactsActivity = (ContactsActivity) this.b;
                contactsActivity.b.Z();
                contactsActivity.g0 = false;
                return;
            case 20:
                ze3 ze3Var = (ze3) this.b;
                ze3Var.o0.onDismiss(ze3Var.w0);
                return;
            case 21:
                gl.r(this);
                jm3 jm3Var = (jm3) this.b;
                if (jm3Var.r != 1 || jm3Var.s == null) {
                    return;
                }
                Editable text = jm3Var.f.a.F0.getText();
                boolean z9 = text != null && text.toString().trim().length() > 0;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                boolean z10 = jm3Var.s.getRightMode() == 2;
                long j4 = jm3Var.r0;
                if (uptimeMillis2 - j4 >= 300) {
                    if (z10) {
                        if (!z9 || jm3Var.U > j4) {
                            jm3Var.s.setRightMode(0);
                            jm3Var.r0 = uptimeMillis2;
                        }
                    } else if (z9 && uptimeMillis2 - jm3Var.U > 1200 && uptimeMillis2 - jm3Var.q0 > 1200) {
                        jm3Var.s.setRightMode(2);
                        jm3Var.r0 = uptimeMillis2;
                    }
                }
                gl.d3(this, 50L);
                return;
            case 22:
                mm3 mm3Var = (mm3) this.b;
                mm3Var.j1 = false;
                if (mm3Var.isAttachedToWindow() && mm3Var.getVisibility() == 0) {
                    mm3Var.invalidate();
                    mm3Var.j1 = true;
                    mm3Var.postOnAnimation(this);
                    return;
                }
                return;
            case 23:
                qn3 qn3Var = (qn3) this.b;
                TextView textView = qn3Var.a;
                Editable editableText = textView.getEditableText();
                if (editableText == null) {
                    qn3Var.g = false;
                    return;
                }
                long uptimeMillis3 = SystemClock.uptimeMillis();
                on3[] on3VarArr = (on3[]) editableText.getSpans(0, editableText.length(), on3.class);
                int length = on3VarArr.length;
                int i10 = 0;
                boolean z11 = false;
                while (true) {
                    int i11 = 33;
                    if (i10 >= length) {
                        boolean z12 = z5;
                        float f10 = 0.5f;
                        nn3[] nn3VarArr2 = (nn3[]) editableText.getSpans(0, editableText.length(), nn3.class);
                        int length2 = nn3VarArr2.length;
                        int i12 = 0;
                        while (i12 < length2) {
                            nn3 nn3Var = nn3VarArr2[i12];
                            int spanStart = editableText.getSpanStart(nn3Var);
                            int spanEnd = editableText.getSpanEnd(nn3Var);
                            if (spanStart < 0 || spanEnd <= spanStart) {
                                nn3VarArr = nn3VarArr2;
                                i = length2;
                                b = b2;
                                editableText.removeSpan(nn3Var);
                            } else {
                                b = b2;
                                if (ls6.w(uptimeMillis3 - nn3Var.a, 750.0f, 1.0f, 0.0f) >= 1.0f) {
                                    editableText.removeSpan(nn3Var);
                                    nn3VarArr = nn3VarArr2;
                                    i = length2;
                                } else {
                                    long j5 = nn3Var.b;
                                    if (j5 <= 0) {
                                        j5 = nn3Var.a;
                                    }
                                    if (uptimeMillis3 >= j5 - 16) {
                                        if (!nn3Var.e) {
                                            nn3Var.e = z12;
                                            bm3 bm3Var = qn3Var.h;
                                            if (bm3Var != null) {
                                                jm3 jm3Var2 = bm3Var.b;
                                                float[] fArr3 = jm3Var2.D0;
                                                lm lmVar = jm3Var2.Y;
                                                if (lmVar == null || lmVar.c < 0.2f || !jm3Var2.s(fArr3) || (layout = jm3Var2.f.a.F0.getLayout()) == null || spanEnd > layout.getText().length()) {
                                                    nn3VarArr = nn3VarArr2;
                                                    i = length2;
                                                } else {
                                                    int lineForOffset = layout.getLineForOffset(spanStart);
                                                    float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
                                                    float primaryHorizontal2 = layout.getLineForOffset(spanEnd) == lineForOffset ? layout.getPrimaryHorizontal(spanEnd) : layout.getLineRight(lineForOffset);
                                                    nn3VarArr = nn3VarArr2;
                                                    om3 om3Var = jm3Var2.x;
                                                    float f11 = primaryHorizontal + fArr3[b];
                                                    i = length2;
                                                    float lineTop = layout.getLineTop(lineForOffset) + fArr3[1];
                                                    float max3 = Math.max(primaryHorizontal, primaryHorizontal2) + fArr3[b];
                                                    float lineBottom = layout.getLineBottom(lineForOffset) + fArr3[1];
                                                    int i13 = ((int) (jm3Var2.Q * 2.5f)) + 2;
                                                    Random random = om3Var.t;
                                                    int i14 = i13 + (random.nextFloat() < f10 ? (byte) 1 : b);
                                                    int i15 = b;
                                                    while (i15 < i14) {
                                                        om3 om3Var2 = om3Var;
                                                        float max4 = (Math.max(1.0f, max3 - f11) * random.nextFloat()) + f11;
                                                        float A = tb4.A(lineBottom, lineTop, ug8.e(random, 0.85f, 0.15f), lineTop);
                                                        float L3 = gl.L((random.nextFloat() * 7.0f) + 3.0f);
                                                        double nextFloat = ((random.nextFloat() - f10) * 2.2f) - 1.5707963267948966d;
                                                        om3Var2.j(max4, A, ((float) Math.cos(nextFloat)) * L3, ((float) Math.sin(nextFloat)) * L3, ug8.e(random, 0.55f, 0.45f), ug8.e(random, f10, 0.55f));
                                                        i15++;
                                                        lineTop = lineTop;
                                                        om3Var = om3Var2;
                                                        i14 = i14;
                                                        f10 = 0.5f;
                                                    }
                                                }
                                                i2 = 33;
                                                editableText.setSpan(nn3Var, spanStart, spanEnd, i2);
                                            }
                                        }
                                        nn3VarArr = nn3VarArr2;
                                        i = length2;
                                        i2 = i11;
                                        editableText.setSpan(nn3Var, spanStart, spanEnd, i2);
                                    } else {
                                        nn3VarArr = nn3VarArr2;
                                        i = length2;
                                    }
                                    z11 = true;
                                }
                            }
                            i12++;
                            b2 = b;
                            nn3VarArr2 = nn3VarArr;
                            length2 = i;
                            i11 = 33;
                            f10 = 0.5f;
                            z12 = true;
                        }
                        mn3[] mn3VarArr = (mn3[]) editableText.getSpans(b2, editableText.length(), mn3.class);
                        for (mn3 mn3Var : mn3VarArr) {
                            if (mn3Var.a != 0) {
                                int spanStart2 = editableText.getSpanStart(mn3Var);
                                int spanEnd2 = editableText.getSpanEnd(mn3Var);
                                if (spanStart2 >= 0 && spanEnd2 > spanStart2) {
                                    long j6 = mn3Var.a;
                                    if (j6 == 0 || uptimeMillis3 < j6 + 300) {
                                        editableText.setSpan(mn3Var, spanStart2, spanEnd2, 33);
                                        z11 = true;
                                    }
                                }
                                editableText.removeSpan(mn3Var);
                            }
                        }
                        pn3 pn3Var = qn3Var.j;
                        if (pn3Var == null || qn3Var.m <= 0.0f || editableText.getSpanStart(pn3Var) < 0) {
                            z2 = false;
                            z3 = z11;
                        } else {
                            z2 = false;
                            editableText.setSpan(qn3Var.j, 0, editableText.length(), 18);
                            z3 = true;
                        }
                        if (z3) {
                            textView.postOnAnimation(this);
                            return;
                        } else {
                            qn3Var.g = z2;
                            return;
                        }
                    }
                    on3 on3Var = on3VarArr[i10];
                    int spanStart3 = editableText.getSpanStart(on3Var);
                    int spanEnd3 = editableText.getSpanEnd(on3Var);
                    if (spanStart3 < 0 || spanEnd3 <= spanStart3) {
                        z4 = z5;
                        i3 = i10;
                        i4 = length;
                    } else {
                        i3 = i10;
                        z4 = z5;
                        i4 = length;
                        if (uptimeMillis3 < (Math.max(0, on3Var.c - 1) * 22) + on3Var.a + 320) {
                            editableText.setSpan(on3Var, spanStart3, spanEnd3, 33);
                            z11 = z4;
                            i10 = i3 + 1;
                            z5 = z4;
                            length = i4;
                        }
                    }
                    editableText.removeSpan(on3Var);
                    i10 = i3 + 1;
                    z5 = z4;
                    length = i4;
                }
                break;
            case 24:
                if (!((eo3) this.b).a.isEmpty()) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    int i16 = 0;
                    while (i16 < ((eo3) this.b).a.size()) {
                        do3 do3Var = (do3) ((eo3) this.b).a.get(i16);
                        if (do3Var.getLastTaskTime() < elapsedRealtime - 30000) {
                            do3Var.recycle();
                            ((eo3) this.b).a.remove(i16);
                            ((eo3) this.b).e--;
                            i16--;
                        }
                        i16++;
                    }
                }
                if (((eo3) this.b).a.isEmpty() && ((eo3) this.b).c.isEmpty()) {
                    ((eo3) this.b).h = false;
                    return;
                } else {
                    Utilities.e.d(this, 30000L);
                    ((eo3) this.b).h = true;
                    return;
                }
            case 25:
                up3 up3Var = (up3) this.b;
                up3Var.J.clear();
                up3Var.getNotificationCenter().k(kk7.d5, new Object[0]);
                return;
            case 26:
                xm xmVar = (xm) this.b;
                xmVar.a(true);
                xmVar.invalidateSelf();
                return;
            case 27:
                er3 er3Var2 = (er3) this.b;
                er3Var2.x = null;
                er3Var2.drawableStateChanged();
                return;
            case 28:
                rt3 rt3Var = (rt3) this.b;
                o1 o1Var2 = rt3Var.Q;
                mt3 mt3Var = rt3Var.a;
                if (rt3Var.E || mt3Var == null || !rt3Var.O || rt3Var.w || gl.D || gl.E || !gl.O1()) {
                    return;
                }
                mt3Var.requestFocus();
                gl.E3(mt3Var);
                gl.r(o1Var2);
                gl.d3(o1Var2, 100L);
                return;
            default:
                xf4 xf4Var = (xf4) ((i8) this.b).d;
                if (!xf4Var.a || ((ArrayList) xf4Var.c).isEmpty() || ((AnimatorSet) xf4Var.d).isRunning()) {
                    return;
                }
                try {
                    ((AnimatorSet) xf4Var.d).start();
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
