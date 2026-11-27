// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import j$.util.Objects;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public abstract class gv8 extends FrameLayout implements fn7 {
    public final uq0 a;
    public final uic b;
    public final q5b c;
    public final fv8 d;
    public int e;
    public boolean f;
    public ValueAnimator h;
    public float n;
    public boolean r;
    public final Rect s;
    public final uk8 w;

    public gv8(Context context, q5b q5bVar, final ega egaVar) {
        super(context);
        this.s = new Rect();
        this.c = q5bVar;
        Objects.requireNonNull(q5bVar);
        this.w = new uk8(q5bVar, (byte) 16);
        final fga fgaVar = (fga) this;
        uq0 uq0Var = new uq0(fgaVar, context, egaVar, (byte) 2);
        this.a = uq0Var;
        final byte b = 1;
        uq0Var.setAllowDisallowInterceptTouch(true);
        fv8 fv8Var = new fv8(fgaVar);
        this.d = fv8Var;
        fv8Var.a = q5bVar.a();
        uq0Var.setAdapter(fv8Var);
        uq0Var.setTranslationY(hl.L(42.0f));
        uic l = uq0Var.l(10, true);
        this.b = l;
        l.h(aob.xi, aob.G6, aob.vi, aob.yi, aob.s8);
        l.r = 12;
        final byte b2 = 0;
        l.setPreTabClick(new jcc() { // from class: cv8
            @Override // jcc
            public final Object g(Integer num, Object obj) {
                c6b storiesController;
                byte b3 = b2;
                final ega egaVar2 = egaVar;
                fga fgaVar2 = fgaVar;
                switch (b3) {
                    case 0:
                        if (!fgaVar2.f) {
                            if (num.intValue() != -1) {
                                break;
                            } else {
                                jj.P(egaVar2.a, egaVar2.b, egaVar2.c, new ye9(egaVar2, (byte) 29));
                                break;
                            }
                        } else {
                            break;
                        }
                    default:
                        View view = (View) obj;
                        if (num.intValue() != -1 && num.intValue() != 0 && !fgaVar2.f) {
                            final int intValue = num.intValue();
                            eja ejaVar = egaVar2.d;
                            e eVar = ejaVar.y1;
                            storiesController = ejaVar.getStoriesController();
                            if (storiesController.h(ejaVar.m1)) {
                                fu5 I = fu5.I(eVar, view);
                                I.X(new nt8(egaVar2));
                                final byte b4 = 0;
                                I.b(R.drawable.menu_add_stories, ob6.M0(2131744455, null), new Runnable() { // from class: dga
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b5 = b4;
                                        int i = intValue;
                                        ega egaVar3 = egaVar2;
                                        switch (b5) {
                                            case 0:
                                                eja ejaVar2 = egaVar3.d;
                                                ejaVar2.U0(i, ejaVar2.m1, ejaVar2.y1);
                                                break;
                                            case 1:
                                                eja ejaVar3 = egaVar3.d;
                                                ejaVar3.W0(i, ejaVar3.m1, ejaVar3.y1);
                                                break;
                                            case 2:
                                                egaVar3.d.o1(i);
                                                break;
                                            default:
                                                eja ejaVar4 = egaVar3.d;
                                                ejaVar4.V0(i, ejaVar4.m1, ejaVar4.y1);
                                                break;
                                        }
                                    }
                                }, false);
                                ejaVar.g(new ve9(I, (byte) 9), eVar, ejaVar.m1, intValue);
                                final byte b5 = 1;
                                I.b(R.drawable.msg_edit, ob6.M0(2131744450, null), new Runnable() { // from class: dga
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b52 = b5;
                                        int i = intValue;
                                        ega egaVar3 = egaVar2;
                                        switch (b52) {
                                            case 0:
                                                eja ejaVar2 = egaVar3.d;
                                                ejaVar2.U0(i, ejaVar2.m1, ejaVar2.y1);
                                                break;
                                            case 1:
                                                eja ejaVar3 = egaVar3.d;
                                                ejaVar3.W0(i, ejaVar3.m1, ejaVar3.y1);
                                                break;
                                            case 2:
                                                egaVar3.d.o1(i);
                                                break;
                                            default:
                                                eja ejaVar4 = egaVar3.d;
                                                ejaVar4.V0(i, ejaVar4.m1, ejaVar4.y1);
                                                break;
                                        }
                                    }
                                }, false);
                                final byte b6 = 2;
                                I.b(R.drawable.tabs_reorder, ob6.M0(2131744447, null), new Runnable() { // from class: dga
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b52 = b6;
                                        int i = intValue;
                                        ega egaVar3 = egaVar2;
                                        switch (b52) {
                                            case 0:
                                                eja ejaVar2 = egaVar3.d;
                                                ejaVar2.U0(i, ejaVar2.m1, ejaVar2.y1);
                                                break;
                                            case 1:
                                                eja ejaVar3 = egaVar3.d;
                                                ejaVar3.W0(i, ejaVar3.m1, ejaVar3.y1);
                                                break;
                                            case 2:
                                                egaVar3.d.o1(i);
                                                break;
                                            default:
                                                eja ejaVar4 = egaVar3.d;
                                                ejaVar4.V0(i, ejaVar4.m1, ejaVar4.y1);
                                                break;
                                        }
                                    }
                                }, false);
                                final byte b7 = 3;
                                I.b(R.drawable.msg_delete, ob6.M0(2131744453, null), new Runnable() { // from class: dga
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b52 = b7;
                                        int i = intValue;
                                        ega egaVar3 = egaVar2;
                                        switch (b52) {
                                            case 0:
                                                eja ejaVar2 = egaVar3.d;
                                                ejaVar2.U0(i, ejaVar2.m1, ejaVar2.y1);
                                                break;
                                            case 1:
                                                eja ejaVar3 = egaVar3.d;
                                                ejaVar3.W0(i, ejaVar3.m1, ejaVar3.y1);
                                                break;
                                            case 2:
                                                egaVar3.d.o1(i);
                                                break;
                                            default:
                                                eja ejaVar4 = egaVar3.d;
                                                ejaVar4.V0(i, ejaVar4.m1, ejaVar4.y1);
                                                break;
                                        }
                                    }
                                }, true);
                                I.a0();
                            }
                            break;
                        } else {
                            break;
                        }
                        break;
                }
                return Boolean.FALSE;
            }
        });
        l.setOnTabLongClick(new jcc() { // from class: cv8
            @Override // jcc
            public final Object g(Integer num, Object obj) {
                c6b storiesController;
                byte b3 = b;
                final ega egaVar2 = egaVar;
                fga fgaVar2 = fgaVar;
                switch (b3) {
                    case 0:
                        if (!fgaVar2.f) {
                            if (num.intValue() != -1) {
                                break;
                            } else {
                                jj.P(egaVar2.a, egaVar2.b, egaVar2.c, new ye9(egaVar2, (byte) 29));
                                break;
                            }
                        } else {
                            break;
                        }
                    default:
                        View view = (View) obj;
                        if (num.intValue() != -1 && num.intValue() != 0 && !fgaVar2.f) {
                            final int intValue = num.intValue();
                            eja ejaVar = egaVar2.d;
                            e eVar = ejaVar.y1;
                            storiesController = ejaVar.getStoriesController();
                            if (storiesController.h(ejaVar.m1)) {
                                fu5 I = fu5.I(eVar, view);
                                I.X(new nt8(egaVar2));
                                final byte b4 = 0;
                                I.b(R.drawable.menu_add_stories, ob6.M0(2131744455, null), new Runnable() { // from class: dga
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b52 = b4;
                                        int i = intValue;
                                        ega egaVar3 = egaVar2;
                                        switch (b52) {
                                            case 0:
                                                eja ejaVar2 = egaVar3.d;
                                                ejaVar2.U0(i, ejaVar2.m1, ejaVar2.y1);
                                                break;
                                            case 1:
                                                eja ejaVar3 = egaVar3.d;
                                                ejaVar3.W0(i, ejaVar3.m1, ejaVar3.y1);
                                                break;
                                            case 2:
                                                egaVar3.d.o1(i);
                                                break;
                                            default:
                                                eja ejaVar4 = egaVar3.d;
                                                ejaVar4.V0(i, ejaVar4.m1, ejaVar4.y1);
                                                break;
                                        }
                                    }
                                }, false);
                                ejaVar.g(new ve9(I, (byte) 9), eVar, ejaVar.m1, intValue);
                                final byte b5 = 1;
                                I.b(R.drawable.msg_edit, ob6.M0(2131744450, null), new Runnable() { // from class: dga
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b52 = b5;
                                        int i = intValue;
                                        ega egaVar3 = egaVar2;
                                        switch (b52) {
                                            case 0:
                                                eja ejaVar2 = egaVar3.d;
                                                ejaVar2.U0(i, ejaVar2.m1, ejaVar2.y1);
                                                break;
                                            case 1:
                                                eja ejaVar3 = egaVar3.d;
                                                ejaVar3.W0(i, ejaVar3.m1, ejaVar3.y1);
                                                break;
                                            case 2:
                                                egaVar3.d.o1(i);
                                                break;
                                            default:
                                                eja ejaVar4 = egaVar3.d;
                                                ejaVar4.V0(i, ejaVar4.m1, ejaVar4.y1);
                                                break;
                                        }
                                    }
                                }, false);
                                final byte b6 = 2;
                                I.b(R.drawable.tabs_reorder, ob6.M0(2131744447, null), new Runnable() { // from class: dga
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b52 = b6;
                                        int i = intValue;
                                        ega egaVar3 = egaVar2;
                                        switch (b52) {
                                            case 0:
                                                eja ejaVar2 = egaVar3.d;
                                                ejaVar2.U0(i, ejaVar2.m1, ejaVar2.y1);
                                                break;
                                            case 1:
                                                eja ejaVar3 = egaVar3.d;
                                                ejaVar3.W0(i, ejaVar3.m1, ejaVar3.y1);
                                                break;
                                            case 2:
                                                egaVar3.d.o1(i);
                                                break;
                                            default:
                                                eja ejaVar4 = egaVar3.d;
                                                ejaVar4.V0(i, ejaVar4.m1, ejaVar4.y1);
                                                break;
                                        }
                                    }
                                }, false);
                                final byte b7 = 3;
                                I.b(R.drawable.msg_delete, ob6.M0(2131744453, null), new Runnable() { // from class: dga
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b52 = b7;
                                        int i = intValue;
                                        ega egaVar3 = egaVar2;
                                        switch (b52) {
                                            case 0:
                                                eja ejaVar2 = egaVar3.d;
                                                ejaVar2.U0(i, ejaVar2.m1, ejaVar2.y1);
                                                break;
                                            case 1:
                                                eja ejaVar3 = egaVar3.d;
                                                ejaVar3.W0(i, ejaVar3.m1, ejaVar3.y1);
                                                break;
                                            case 2:
                                                egaVar3.d.o1(i);
                                                break;
                                            default:
                                                eja ejaVar4 = egaVar3.d;
                                                ejaVar4.V0(i, ejaVar4.m1, ejaVar4.y1);
                                                break;
                                        }
                                    }
                                }, true);
                                I.a0();
                            }
                            break;
                        } else {
                            break;
                        }
                        break;
                }
                return Boolean.FALSE;
            }
        });
        addView(l, tre.e(-1, 42, 48));
        c(!q5bVar.h.isEmpty(), false, true);
    }

    public final void a() {
        uic uicVar = this.b;
        int currentTabId = uicVar != null ? uicVar.getCurrentTabId() : 0;
        q5b q5bVar = this.c;
        boolean a = q5bVar.a();
        fv8 fv8Var = this.d;
        fv8Var.a = a;
        byte b = 1;
        this.a.m(true);
        c(!q5bVar.h.isEmpty(), true, false);
        int i = this.e;
        if (i > 0) {
            if (fv8Var.i(i) != -1) {
                hl.d3(new dv8(this, this.e, b), 500L);
                this.e = 0;
                return;
            }
            return;
        }
        if (uicVar == null || currentTabId <= 0 || q5bVar.b(currentTabId) != null) {
            return;
        }
        uicVar.e(0, 0);
    }

    public abstract void b();

    public final void c(boolean z, boolean z2, boolean z3) {
        if (this.r != z || z3) {
            this.r = z;
            setEnabled(z);
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.h = null;
            }
            if (!z2) {
                this.n = z ? 1.0f : 0.0f;
                b();
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.n, z ? 1.0f : 0.0f);
            this.h = ofFloat;
            ofFloat.setDuration(480L);
            this.h.setInterpolator(k43.h);
            this.h.addUpdateListener(new pv7(this, (byte) 21));
            this.h.start();
        }
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.l3 && ((Long) objArr[0]).longValue() == this.c.b) {
            a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.r && super.dispatchTouchEvent(motionEvent);
    }

    public int getCurrentAlbumId() {
        return this.d.f(this.b.getCurrentPosition());
    }

    public float getVisibilityFactor() {
        return this.n;
    }

    public float getVisualHeight() {
        return getMeasuredHeight() * this.n;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        q5b q5bVar = this.c;
        jn7.f(q5bVar.a).b(this, jn7.l3);
        if (this.r == q5bVar.h.isEmpty() || this.d.a != q5bVar.a()) {
            a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jn7.f(this.c.a).n(this, jn7.l3);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int measuredWidth = getMeasuredWidth();
        int visualHeight = (int) getVisualHeight();
        Rect rect = this.s;
        rect.set(0, 0, measuredWidth, visualHeight);
        setClipBounds(rect);
    }

    public void setInitialTabId(int i) {
        if (this.d.i(i) != -1) {
            hl.d3(new dv8(this, i, (byte) 0), 500L);
        } else {
            this.e = i;
        }
    }

    public void setReorderingAlbums(boolean z) {
        if (this.f != z) {
            this.f = z;
            uic uicVar = this.b;
            uicVar.setReordering(z);
            boolean z2 = this.f;
            fga fgaVar = (fga) this;
            eja ejaVar = fgaVar.x;
            TextView textView = ejaVar.t0;
            byte b = 0;
            textView.setVisibility(0);
            textView.animate().alpha(z2 ? 1.0f : 0.0f).scaleX(z2 ? 1.0f : 0.4f).scaleY(z2 ? 1.0f : 0.4f).withEndAction(new q38((byte) 14, (Object) fgaVar, z2)).start();
            ejaVar.G1(true);
            ejaVar.Q0();
            if (z) {
                e S = LaunchActivity.S();
                if (S instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) S;
                    profileActivity.k3(false);
                    hl.c3(new ev8(profileActivity, b));
                }
            }
            if (z) {
                return;
            }
            hl.r(this.w);
            q5b q5bVar = this.c;
            q5bVar.e();
            q5bVar.f(false);
            int currentPosition = uicVar.getCurrentPosition();
            fv8 fv8Var = this.d;
            int f = fv8Var.f(currentPosition);
            this.a.m(true);
            int i = fv8Var.i(f);
            uicVar.f(0.0f, i, i);
        }
    }
}
