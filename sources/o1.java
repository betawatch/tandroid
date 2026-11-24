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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
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
        xo3[] xo3VarArr;
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
                m66 m66Var = s1Var.x;
                if (m66Var != null) {
                    CharacterStyle characterStyle = m66Var.i;
                    final String url = characterStyle instanceof g6c ? ((g6c) characterStyle).getURL() : characterStyle instanceof URLSpan ? ((URLSpan) characterStyle).getURL() : characterStyle.toString();
                    try {
                        s1Var.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    final StaticLayout staticLayout = s1Var.E;
                    final float f = s1Var.y;
                    if (s1Var.getContext() != null) {
                        final ClickableSpan clickableSpan = (ClickableSpan) s1Var.x.i;
                        my0 h = hg9.h(1, null, s1Var.getContext(), false);
                        h.P = url;
                        h.Q = false;
                        CharSequence[] charSequenceArr = {jb6.M0(2131747550, null), jb6.M0(2131751704, null)};
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
                                    gm.g(str);
                                    if (gm.C3()) {
                                        if (str.startsWith("@")) {
                                            ts2.u(null, 2131743352, c41.b0(dVar), R.raw.copy, 36);
                                        } else if (str.startsWith("#") || str.startsWith("$")) {
                                            ts2.u(null, 2131749119, c41.b0(dVar), R.raw.copy, 36);
                                        } else {
                                            ts2.u(null, 2131748678, c41.b0(dVar), R.raw.copy, 36);
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
                n20 n20Var = (n20) this.b;
                i30 i30Var = n20Var.E;
                if (MediaController.w().v0 != null) {
                    int i5 = i30Var.C2 + 1;
                    i30Var.C2 = i5;
                    if (i5 != 1) {
                        if (i5 != 2) {
                            MediaController.w().l0(true, 13.0f);
                            return;
                        } else {
                            MediaController.w().l0(true, 7.0f);
                            gm.d3(this, 2000L);
                            return;
                        }
                    }
                    n20Var.w = true;
                    i30Var.A2 = 1;
                    if (MediaController.w().C()) {
                        i30Var.S0();
                    } else if (i30Var.A2 == 1) {
                        gm.r(i30Var.H2);
                        i30Var.E2 = 0L;
                    }
                    MediaController.w().l0(true, 4.0f);
                    gm.d3(this, 2000L);
                    return;
                }
                return;
            case 4:
                i30 i30Var2 = (i30) this.b;
                ndc ndcVar = MediaController.w().j0;
                long U = ndcVar == null ? 0L : ndcVar.U();
                if (U == 0 || U == -9223372036854775807L) {
                    i30Var2.D2 = System.currentTimeMillis();
                    return;
                }
                float f2 = i30Var2.B2;
                long currentTimeMillis = System.currentTimeMillis();
                long j = currentTimeMillis - i30Var2.D2;
                i30Var2.D2 = currentTimeMillis;
                long j2 = currentTimeMillis - i30Var2.E2;
                int i6 = i30Var2.C2;
                float f3 = ((long) ((f2 * r1) + (((i6 == 1 ? 3L : i6 == 2 ? 6L : 12L) * j) - j))) / U;
                if (f3 < 0.0f) {
                    f3 = 0.0f;
                }
                i30Var2.B2 = f3;
                k47 k47Var = MediaController.w().v0;
                if (k47Var != null && k47Var.I3()) {
                    if (!MediaController.w().C()) {
                        MediaController.w().v0.b0 = i30Var2.B2;
                    }
                    i30Var2.W0(k47Var, false);
                }
                if (i30Var2.A2 == 1 && i30Var2.C2 > 0 && MediaController.w().C()) {
                    if (j2 > 200 || i30Var2.B2 == 0.0f) {
                        i30Var2.E2 = currentTimeMillis;
                        MediaController.w().h0(MediaController.w().v0, f3);
                    }
                    if (i30Var2.C2 <= 0 || i30Var2.B2 <= 0.0f) {
                        return;
                    }
                    gm.d3(i30Var2.H2, 16L);
                    return;
                }
                return;
            case 5:
                UsersSelectActivity usersSelectActivity = new UsersSelectActivity(null);
                usersSelectActivity.P = new vh6();
                usersSelectActivity.Q = new ArrayList();
                usersSelectActivity.y = (byte) 1;
                usersSelectActivity.H = false;
                v70 v70Var = (v70) this.b;
                usersSelectActivity.T = v70Var.Z();
                usersSelectActivity.n = new l0(this, (byte) 26);
                v70Var.presentFragment(usersSelectActivity);
                return;
            case 6:
                s76 s76Var = (s76) this.b;
                os3 os3Var = s76Var.c;
                n80 n80Var = s76Var.a;
                if (s76Var.E) {
                    if (s76Var.x) {
                        s76Var.x = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        n80Var.d = currentAnimationTimeMillis;
                        n80Var.f = -1L;
                        n80Var.e = currentAnimationTimeMillis;
                        n80Var.g = 0.5f;
                    }
                    if ((n80Var.f > 0 && AnimationUtils.currentAnimationTimeMillis() > n80Var.f + n80Var.h) || !s76Var.e()) {
                        s76Var.E = false;
                        return;
                    }
                    if (s76Var.y) {
                        s76Var.y = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        os3Var.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (n80Var.e == 0) {
                        zo4.k("Cannot compute scroll delta before calling start()");
                        return;
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a = n80Var.a(currentAnimationTimeMillis2);
                    long j3 = currentAnimationTimeMillis2 - n80Var.e;
                    n80Var.e = currentAnimationTimeMillis2;
                    s76Var.G.scrollListBy((int) (j3 * ((a * 4.0f) + ((-4.0f) * a * a)) * n80Var.c));
                    WeakHashMap weakHashMap = kfc.a;
                    os3Var.postOnAnimation(this);
                    return;
                }
                return;
            case 7:
                hg0 hg0Var = (hg0) this.b;
                eg0 eg0Var = hg0Var.b;
                if (eg0Var == null) {
                    eg0Var = new eg0(hg0Var, b2);
                    hg0Var.b = eg0Var;
                }
                int i7 = hg0Var.c + 1;
                hg0Var.c = i7;
                eg0Var.b = i7;
                hg0Var.postDelayed(eg0Var, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                return;
            case 8:
                for (Thread thread : dl0.w.keySet()) {
                    if (!thread.isAlive()) {
                        dl0.w.remove(thread);
                    }
                }
                if (dl0.w.isEmpty()) {
                    dl0.x = false;
                    return;
                } else {
                    gm.d3(((dl0) this.b).p, 5000L);
                    return;
                }
            case 9:
                my0 my0Var = (my0) this.b;
                if (my0Var.H != this || (z = my0Var.J)) {
                    return;
                }
                my0Var.H = null;
                if (z) {
                    return;
                }
                my0Var.b.setVisibility(0);
                if (my0Var.j0()) {
                    return;
                }
                if (my0Var.K) {
                    my0Var.c.setLayerType(2, null);
                }
                boolean z6 = my0Var.V0;
                ViewGroup viewGroup = my0Var.b;
                if (z6) {
                    viewGroup.setTranslationX(gm.L(48.0f));
                    my0Var.b.setAlpha(0.0f);
                    my0Var.b.setTranslationY(0.0f);
                } else {
                    viewGroup.setTranslationY(Math.max(0, Math.min(gm.n, my0Var.O())) + gm.L(10.0f) + my0Var.P() + my0Var.f);
                }
                my0Var.e0();
                my0Var.B0 = (byte) 1;
                ValueAnimator valueAnimator2 = my0Var.C0;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(my0Var.D0, 1.0f);
                my0Var.C0 = ofFloat;
                ofFloat.addUpdateListener(new ay0(my0Var, (byte) 0));
                my0Var.A0 = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                arrayList.add(ObjectAnimator.ofFloat(my0Var.b, (Property<ViewGroup, Float>) View.TRANSLATION_X, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(my0Var.b, (Property<ViewGroup, Float>) View.ALPHA, 1.0f));
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(my0Var.b, (Property<ViewGroup, Float>) View.TRANSLATION_Y, 0.0f);
                ofFloat2.addUpdateListener(new ay0(my0Var, (byte) 1));
                arrayList.add(ofFloat2);
                arrayList.add(ObjectAnimator.ofInt(my0Var.Z, so.d, my0Var.p0 ? my0Var.q0 : 0));
                arrayList.add(my0Var.C0);
                my0Var.B(arrayList, true);
                my0Var.A0.playTogether(arrayList);
                boolean z7 = my0Var.V0;
                AnimatorSet animatorSet = my0Var.A0;
                if (z7) {
                    animatorSet.setDuration(250L);
                    my0Var.A0.setInterpolator(d53.f);
                } else {
                    animatorSet.setDuration(my0Var.k0);
                    my0Var.A0.setInterpolator(my0Var.l0);
                }
                my0Var.A0.setStartDelay(my0Var.E ? 0L : 20L);
                my0Var.A0.setInterpolator(my0Var.l0);
                my0Var.M0.d();
                my0Var.A0.addListener(new fy0(my0Var, (byte) 0));
                if (my0Var.L0) {
                    nm7.e().k(99, 512);
                }
                my0Var.A0.start();
                return;
            case 10:
                BubbleActivity bubbleActivity = (BubbleActivity) this.b;
                if (bubbleActivity.Z == this) {
                    if (gm.n2(true)) {
                        if (e21.a) {
                            fc4.b("lock app");
                        }
                        bubbleActivity.A();
                    } else if (e21.a) {
                        fc4.b("didn't pass lock check");
                    }
                    bubbleActivity.Z = null;
                    return;
                }
                return;
            case 11:
                lb1 lb1Var = (lb1) this.b;
                CameraView cameraView = lb1Var.d;
                if (cameraView == null || lb1Var.O || cameraView.getCameraSession() == null) {
                    return;
                }
                lb1Var.f.post(new yt0(this, (byte) 16));
                return;
            case 12:
                zb1 zb1Var = (zb1) this.b;
                zb1Var.b(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                zb1Var.f.performHapticFeedback(0);
                Runnable runnable = zb1Var.j;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 13:
                gd1 gd1Var = (gd1) this.b;
                kd1 kd1Var = gd1Var.f;
                if (kd1Var == null || gd1Var.e == null) {
                    return;
                }
                float[] fArr = gd1Var.h;
                float[] fArr2 = gd1Var.g;
                float width = kd1Var.getWidth();
                float height = kd1Var.getHeight();
                float f4 = Float.MAX_VALUE;
                float f5 = -3.4028235E38f;
                int i8 = 0;
                while (i8 < 4) {
                    gd1Var.d(kd1Var, i8 % 2 == 0 ? 0.0f : width, i8 < 2 ? 0.0f : height);
                    f4 = Math.min(f4, fArr2[1]);
                    f5 = Math.max(f5, fArr2[1]);
                    i8++;
                }
                float f6 = width / 2.0f;
                float f7 = height / 2.0f;
                float d = gd1Var.d(kd1Var, f6, f7);
                float f8 = fArr2[1];
                float d2 = gd1Var.d(kd1Var, width, f7) - d;
                float f9 = fArr2[1] - f8;
                float hypot = width <= 0.0f ? 1.0f : ((float) Math.hypot(d2, f9)) / f6;
                gd1.g(kd1Var, fArr);
                gd1Var.e.d(d, f8, f4, f5, (float) Math.toDegrees(Math.atan2(f9, d2)), hypot, kd1Var.getEditText().getPaint(), kd1Var.getEditText().getCurrentTextColor(), fArr[0], fArr[1], fArr[2], kd1Var.getEditText().getLayout() != null ? kd1Var.getEditText().getLayout().getAlignment() : null);
                ViewParent parent = kd1Var.getParent();
                ad1 ad1Var = gd1Var.e;
                if (parent == null) {
                    ad1Var.e(null, null);
                } else {
                    ad1Var.e(kd1Var.x(-1), kd1Var.x(1));
                }
                gd1Var.e.postOnAnimation(this);
                return;
            case 14:
                kd1 kd1Var2 = (kd1) this.b;
                if (kd1Var2.isAttachedToWindow()) {
                    kd1Var2.z();
                    kd1Var2.postOnAnimation(this);
                    return;
                }
                return;
            case 15:
                o42 o42Var = (o42) this.b;
                if (o42Var.T) {
                    o42Var.O.clear();
                    o42Var.Q.clear();
                    o42Var.R.clear();
                    o42Var.f();
                    return;
                }
                return;
            case 16:
                w62 w62Var = (w62) this.b;
                x62 x62Var = w62Var.Q;
                if (x62Var.K == null || x62Var.L) {
                    return;
                }
                int computeVerticalScrollOffset = x62Var.r.computeVerticalScrollOffset();
                boolean z8 = x62Var.r.computeVerticalScrollExtent() + computeVerticalScrollOffset >= (w62Var.e() - w62Var.r) + w62Var.n;
                float max = Math.max(0.0f, (x62Var.F - Math.max(0, computeVerticalScrollOffset - x62Var.getListTopPadding())) - gm.L(52.0f));
                float max2 = Math.max(0.0f, ((x62Var.r.getMeasuredHeight() - (x62Var.F - computeVerticalScrollOffset)) - x62Var.getListTopPadding()) - gm.L(84.0f));
                float L = gm.L(32.0f);
                float L2 = (max >= L || computeVerticalScrollOffset <= x62Var.getListTopPadding()) ? max2 < L ? gm.L(6.0f) * (1.0f - (max2 / L)) : 0.0f : (-(1.0f - (max / L))) * gm.L(6.0f);
                int i9 = (int) L2;
                if (Math.abs(i9) > 0 && x62Var.r.canScrollVertically(i9) && (L2 <= 0.0f || !z8)) {
                    x62Var.F += L2;
                    x62Var.r.scrollBy(0, i9);
                    w62Var.invalidate();
                }
                w62Var.M = true;
                w62Var.postDelayed(this, 15L);
                return;
            case 17:
                v72 v72Var = (v72) this.b;
                o1 o1Var = v72Var.V0;
                ng8 ng8Var = v72Var.h1;
                if (ng8Var != null) {
                    EditTextBoldCursor editField = ng8Var.getEditField();
                    if (v72Var.I || editField == null || !v72Var.H || v72Var.f1 || gm.D || gm.E || !gm.O1()) {
                        return;
                    }
                    editField.requestFocus();
                    gm.E3(editField);
                    gm.r(o1Var);
                    gm.d3(o1Var, 100L);
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
                mg3 mg3Var = (mg3) this.b;
                mg3Var.o0.onDismiss(mg3Var.w0);
                return;
            case 21:
                gm.r(this);
                un3 un3Var = (un3) this.b;
                if (un3Var.r != 1 || un3Var.s == null) {
                    return;
                }
                Editable text = un3Var.f.a.F0.getText();
                boolean z9 = text != null && text.toString().trim().length() > 0;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                boolean z10 = un3Var.s.getRightMode() == 2;
                long j4 = un3Var.r0;
                if (uptimeMillis2 - j4 >= 300) {
                    if (z10) {
                        if (!z9 || un3Var.U > j4) {
                            un3Var.s.setRightMode(0);
                            un3Var.r0 = uptimeMillis2;
                        }
                    } else if (z9 && uptimeMillis2 - un3Var.U > 1200 && uptimeMillis2 - un3Var.q0 > 1200) {
                        un3Var.s.setRightMode(2);
                        un3Var.r0 = uptimeMillis2;
                    }
                }
                gm.d3(this, 50L);
                return;
            case 22:
                xn3 xn3Var = (xn3) this.b;
                xn3Var.j1 = false;
                if (xn3Var.isAttachedToWindow() && xn3Var.getVisibility() == 0) {
                    xn3Var.invalidate();
                    xn3Var.j1 = true;
                    xn3Var.postOnAnimation(this);
                    return;
                }
                return;
            case 23:
                ap3 ap3Var = (ap3) this.b;
                TextView textView = ap3Var.a;
                Editable editableText = textView.getEditableText();
                if (editableText == null) {
                    ap3Var.g = false;
                    return;
                }
                long uptimeMillis3 = SystemClock.uptimeMillis();
                yo3[] yo3VarArr = (yo3[]) editableText.getSpans(0, editableText.length(), yo3.class);
                int length = yo3VarArr.length;
                int i10 = 0;
                boolean z11 = false;
                while (true) {
                    int i11 = 33;
                    if (i10 >= length) {
                        boolean z12 = z5;
                        float f10 = 0.5f;
                        xo3[] xo3VarArr2 = (xo3[]) editableText.getSpans(0, editableText.length(), xo3.class);
                        int length2 = xo3VarArr2.length;
                        int i12 = 0;
                        while (i12 < length2) {
                            xo3 xo3Var = xo3VarArr2[i12];
                            int spanStart = editableText.getSpanStart(xo3Var);
                            int spanEnd = editableText.getSpanEnd(xo3Var);
                            if (spanStart < 0 || spanEnd <= spanStart) {
                                xo3VarArr = xo3VarArr2;
                                i = length2;
                                b = b2;
                                editableText.removeSpan(xo3Var);
                            } else {
                                b = b2;
                                if (kt6.x(uptimeMillis3 - xo3Var.a, 750.0f, 1.0f, 0.0f) >= 1.0f) {
                                    editableText.removeSpan(xo3Var);
                                    xo3VarArr = xo3VarArr2;
                                    i = length2;
                                } else {
                                    long j5 = xo3Var.b;
                                    if (j5 <= 0) {
                                        j5 = xo3Var.a;
                                    }
                                    if (uptimeMillis3 >= j5 - 16) {
                                        if (!xo3Var.e) {
                                            xo3Var.e = z12;
                                            mn3 mn3Var = ap3Var.h;
                                            if (mn3Var != null) {
                                                un3 un3Var2 = mn3Var.b;
                                                float[] fArr3 = un3Var2.D0;
                                                ln lnVar = un3Var2.Y;
                                                if (lnVar == null || lnVar.c < 0.2f || !un3Var2.s(fArr3) || (layout = un3Var2.f.a.F0.getLayout()) == null || spanEnd > layout.getText().length()) {
                                                    xo3VarArr = xo3VarArr2;
                                                    i = length2;
                                                } else {
                                                    int lineForOffset = layout.getLineForOffset(spanStart);
                                                    float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
                                                    float primaryHorizontal2 = layout.getLineForOffset(spanEnd) == lineForOffset ? layout.getPrimaryHorizontal(spanEnd) : layout.getLineRight(lineForOffset);
                                                    xo3VarArr = xo3VarArr2;
                                                    zn3 zn3Var = un3Var2.x;
                                                    float f11 = primaryHorizontal + fArr3[b];
                                                    i = length2;
                                                    float lineTop = layout.getLineTop(lineForOffset) + fArr3[1];
                                                    float max3 = Math.max(primaryHorizontal, primaryHorizontal2) + fArr3[b];
                                                    float lineBottom = layout.getLineBottom(lineForOffset) + fArr3[1];
                                                    int i13 = ((int) (un3Var2.Q * 2.5f)) + 2;
                                                    Random random = zn3Var.t;
                                                    int i14 = i13 + (random.nextFloat() < f10 ? (byte) 1 : b);
                                                    int i15 = b;
                                                    while (i15 < i14) {
                                                        zn3 zn3Var2 = zn3Var;
                                                        float max4 = (Math.max(1.0f, max3 - f11) * random.nextFloat()) + f11;
                                                        float A = td4.A(lineBottom, lineTop, wi8.e(random, 0.85f, 0.15f), lineTop);
                                                        float L3 = gm.L((random.nextFloat() * 7.0f) + 3.0f);
                                                        double nextFloat = ((random.nextFloat() - f10) * 2.2f) - 1.5707963267948966d;
                                                        zn3Var2.j(max4, A, ((float) Math.cos(nextFloat)) * L3, ((float) Math.sin(nextFloat)) * L3, wi8.e(random, 0.55f, 0.45f), wi8.e(random, f10, 0.55f));
                                                        i15++;
                                                        lineTop = lineTop;
                                                        zn3Var = zn3Var2;
                                                        i14 = i14;
                                                        f10 = 0.5f;
                                                    }
                                                }
                                                i2 = 33;
                                                editableText.setSpan(xo3Var, spanStart, spanEnd, i2);
                                            }
                                        }
                                        xo3VarArr = xo3VarArr2;
                                        i = length2;
                                        i2 = i11;
                                        editableText.setSpan(xo3Var, spanStart, spanEnd, i2);
                                    } else {
                                        xo3VarArr = xo3VarArr2;
                                        i = length2;
                                    }
                                    z11 = true;
                                }
                            }
                            i12++;
                            b2 = b;
                            xo3VarArr2 = xo3VarArr;
                            length2 = i;
                            i11 = 33;
                            f10 = 0.5f;
                            z12 = true;
                        }
                        wo3[] wo3VarArr = (wo3[]) editableText.getSpans(b2, editableText.length(), wo3.class);
                        for (wo3 wo3Var : wo3VarArr) {
                            if (wo3Var.a != 0) {
                                int spanStart2 = editableText.getSpanStart(wo3Var);
                                int spanEnd2 = editableText.getSpanEnd(wo3Var);
                                if (spanStart2 >= 0 && spanEnd2 > spanStart2) {
                                    long j6 = wo3Var.a;
                                    if (j6 == 0 || uptimeMillis3 < j6 + 300) {
                                        editableText.setSpan(wo3Var, spanStart2, spanEnd2, 33);
                                        z11 = true;
                                    }
                                }
                                editableText.removeSpan(wo3Var);
                            }
                        }
                        zo3 zo3Var = ap3Var.j;
                        if (zo3Var == null || ap3Var.m <= 0.0f || editableText.getSpanStart(zo3Var) < 0) {
                            z2 = false;
                            z3 = z11;
                        } else {
                            z2 = false;
                            editableText.setSpan(ap3Var.j, 0, editableText.length(), 18);
                            z3 = true;
                        }
                        if (z3) {
                            textView.postOnAnimation(this);
                            return;
                        } else {
                            ap3Var.g = z2;
                            return;
                        }
                    }
                    yo3 yo3Var = yo3VarArr[i10];
                    int spanStart3 = editableText.getSpanStart(yo3Var);
                    int spanEnd3 = editableText.getSpanEnd(yo3Var);
                    if (spanStart3 < 0 || spanEnd3 <= spanStart3) {
                        z4 = z5;
                        i3 = i10;
                        i4 = length;
                    } else {
                        i3 = i10;
                        z4 = z5;
                        i4 = length;
                        if (uptimeMillis3 < (Math.max(0, yo3Var.c - 1) * 22) + yo3Var.a + 320) {
                            editableText.setSpan(yo3Var, spanStart3, spanEnd3, 33);
                            z11 = z4;
                            i10 = i3 + 1;
                            z5 = z4;
                            length = i4;
                        }
                    }
                    editableText.removeSpan(yo3Var);
                    i10 = i3 + 1;
                    z5 = z4;
                    length = i4;
                }
                break;
            case 24:
                if (!((op3) this.b).a.isEmpty()) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    int i16 = 0;
                    while (i16 < ((op3) this.b).a.size()) {
                        np3 np3Var = (np3) ((op3) this.b).a.get(i16);
                        if (np3Var.getLastTaskTime() < elapsedRealtime - 30000) {
                            np3Var.recycle();
                            ((op3) this.b).a.remove(i16);
                            ((op3) this.b).e--;
                            i16--;
                        }
                        i16++;
                    }
                }
                if (((op3) this.b).a.isEmpty() && ((op3) this.b).c.isEmpty()) {
                    ((op3) this.b).h = false;
                    return;
                } else {
                    Utilities.e.d(this, 30000L);
                    ((op3) this.b).h = true;
                    return;
                }
            case 25:
                er3 er3Var = (er3) this.b;
                er3Var.J.clear();
                er3Var.getNotificationCenter().k(nm7.f5, new Object[0]);
                return;
            case 26:
                xn xnVar = (xn) this.b;
                xnVar.a(true);
                xnVar.invalidateSelf();
                return;
            case 27:
                os3 os3Var2 = (os3) this.b;
                os3Var2.x = null;
                os3Var2.drawableStateChanged();
                return;
            case 28:
                cv3 cv3Var = (cv3) this.b;
                o1 o1Var2 = cv3Var.Q;
                wu3 wu3Var = cv3Var.a;
                if (cv3Var.E || wu3Var == null || !cv3Var.O || cv3Var.w || gm.D || gm.E || !gm.O1()) {
                    return;
                }
                wu3Var.requestFocus();
                gm.E3(wu3Var);
                gm.r(o1Var2);
                gm.d3(o1Var2, 100L);
                return;
            default:
                yh4 yh4Var = (yh4) ((i8) this.b).d;
                if (!yh4Var.a || ((ArrayList) yh4Var.c).isEmpty() || ((AnimatorSet) yh4Var.d).isRunning()) {
                    return;
                }
                try {
                    ((AnimatorSet) yh4Var.d).start();
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
