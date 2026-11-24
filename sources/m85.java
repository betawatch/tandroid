// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.a;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class m85 extends FrameLayout {
    public float a;
    public float b;
    public boolean c;
    public AnimatorSet d;
    public final l85 e;
    public final ql3 f;
    public final /* synthetic */ float h;
    public final /* synthetic */ o85 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m85(o85 o85Var, Context context, float f) {
        super(context);
        this.n = o85Var;
        this.h = f;
        this.e = new l85(this);
        this.f = new ql3((byte) 13);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Point point = gl.q;
        int i3 = point.x;
        o85 o85Var = this.n;
        if (i3 == o85Var.K && o85Var.L == point.y) {
            return;
        }
        o85Var.K = i3;
        o85Var.L = point.y;
        if (o85Var.M < 0.0f) {
            SharedPreferences sharedPreferences = a.b.getSharedPreferences("groupcallpipconfig", 0);
            this.n.M = sharedPreferences.getFloat("relativeX", 1.0f);
            this.n.N = sharedPreferences.getFloat("relativeY", 0.4f);
        }
        o85 o85Var2 = o85.f0;
        if (o85Var2 != null) {
            o85 o85Var3 = this.n;
            float f = o85Var3.M;
            float f2 = o85Var3.N;
            float f3 = -gl.L(36.0f);
            o85Var2.s.x = (int) tb4.A(point.x - (2.0f * f3), gl.L(105.0f), f, f3);
            o85Var2.s.y = (int) ((point.y - gl.L(105.0f)) * f2);
            o85Var2.i();
            m85 m85Var = o85Var2.a;
            if (m85Var.getParent() != null) {
                o85Var2.n.updateViewLayout(m85Var, o85Var2.s);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if (r5 != 3) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0195  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float f;
        boolean z;
        boolean z2;
        o85 o85Var;
        o85 o85Var2;
        t85 t85Var;
        ValueAnimator valueAnimator;
        boolean z3 = false;
        if (o85.f0 == null) {
            return false;
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        ViewParent parent = getParent();
        int action = motionEvent.getAction();
        if (action == 0) {
            getLocationOnScreen(this.n.I);
            o85 o85Var3 = this.n;
            int i = o85Var3.I[0];
            WindowManager.LayoutParams layoutParams = o85Var3.s;
            o85Var3.S = i - layoutParams.x;
            o85Var3.T = r5[1] - layoutParams.y;
            this.a = rawX;
            this.b = rawY;
            System.currentTimeMillis();
            gl.d3(this.e, 300L);
            o85 o85Var4 = this.n;
            WindowManager.LayoutParams layoutParams2 = o85Var4.s;
            o85Var4.Q = layoutParams2.x;
            o85Var4.R = layoutParams2.y;
            o85Var4.Z = true;
            o85Var4.a();
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                float f2 = rawX - this.a;
                float f3 = rawY - this.b;
                if (!this.n.Y) {
                    float f4 = (f3 * f3) + (f2 * f2);
                    float f5 = this.h;
                    if (f4 > f5 * f5) {
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                        gl.r(this.e);
                        o85 o85Var5 = this.n;
                        o85Var5.Y = true;
                        o85Var5.g(true);
                        this.n.f(false);
                        this.a = rawX;
                        this.b = rawY;
                        f2 = 0.0f;
                        f3 = 0.0f;
                    }
                }
                o85 o85Var6 = this.n;
                if (o85Var6.Y) {
                    o85Var6.Q += f2;
                    o85Var6.R += f3;
                    this.a = rawX;
                    this.b = rawY;
                    o85Var6.j();
                    float measuredWidth = (getMeasuredWidth() / 2.0f) + this.n.Q;
                    float measuredHeight = (getMeasuredHeight() / 2.0f) + this.n.R;
                    float measuredWidth2 = (r1.b.getMeasuredWidth() / 2.0f) + (r1.P - this.n.S);
                    float measuredHeight2 = (r5.b.getMeasuredHeight() / 2.0f) + (r5.O - this.n.T);
                    float f6 = measuredWidth - measuredWidth2;
                    float f7 = measuredHeight - measuredHeight2;
                    float f8 = (f7 * f7) + (f6 * f6);
                    if (f8 < gl.L(80.0f) * gl.L(80.0f)) {
                        f = 0.0f;
                        this.n.W.setRemoveAngle((((measuredWidth <= measuredWidth2 || measuredHeight >= measuredHeight2) && (measuredWidth >= measuredWidth2 || measuredHeight >= measuredHeight2)) ? 90.0d : 270.0d) - Math.toDegrees(Math.atan(f6 / f7)));
                        if (f8 < gl.L(50.0f) * gl.L(50.0f)) {
                            z = true;
                        } else {
                            z = false;
                            z2 = true;
                            o85Var = this.n;
                            if (!o85Var.H && o85Var.c0 != z) {
                                o85Var.c0 = z;
                                valueAnimator = o85Var.e0;
                                if (valueAnimator != null) {
                                    valueAnimator.removeAllListeners();
                                    o85Var.e0.cancel();
                                }
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(o85Var.d0, !z ? 1.0f : f);
                                o85Var.e0 = ofFloat;
                                ofFloat.addUpdateListener(new ni4(o85Var, (byte) 6));
                                o85Var.e0.addListener(new id4((byte) 5, o85Var, z));
                                o85Var.e0.setDuration(250L);
                                o85Var.e0.setInterpolator(s33.f);
                                o85Var.e0.start();
                            }
                            o85Var2 = this.n;
                            t85Var = o85Var2.W;
                            if (o85Var2.F != z2) {
                                o85Var2.F = z2;
                                o85Var2.c.invalidate();
                                if (!o85Var2.H) {
                                    o85Var2.x.K(z2 ? 33 : 0);
                                    o85Var2.X.d();
                                }
                                if (z2) {
                                    try {
                                        t85Var.performHapticFeedback(3, 2);
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                            if (t85Var.s != z2) {
                                t85Var.invalidate();
                            }
                            t85Var.s = z2;
                        }
                    } else {
                        f = 0.0f;
                        z = false;
                    }
                    z2 = z;
                    o85Var = this.n;
                    if (!o85Var.H) {
                        o85Var.c0 = z;
                        valueAnimator = o85Var.e0;
                        if (valueAnimator != null) {
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(o85Var.d0, !z ? 1.0f : f);
                        o85Var.e0 = ofFloat2;
                        ofFloat2.addUpdateListener(new ni4(o85Var, (byte) 6));
                        o85Var.e0.addListener(new id4((byte) 5, o85Var, z));
                        o85Var.e0.setDuration(250L);
                        o85Var.e0.setInterpolator(s33.f);
                        o85Var.e0.start();
                    }
                    o85Var2 = this.n;
                    t85Var = o85Var2.W;
                    if (o85Var2.F != z2) {
                    }
                    if (t85Var.s != z2) {
                    }
                    t85Var.s = z2;
                }
            }
            return true;
        }
        gl.r(this.f);
        gl.r(this.e);
        o85 o85Var7 = this.n;
        if (!o85Var7.F) {
            o85Var7.Z = false;
            o85Var7.a();
            if (this.c) {
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, false, false);
                    try {
                        performHapticFeedback(3, 2);
                    } catch (Exception unused2) {
                    }
                }
                this.c = false;
            } else {
                if (motionEvent.getAction() == 1 && !this.n.Y) {
                    if (VoIPService.getSharedInstance() == null) {
                        return false;
                    }
                    this.n.f(!r0.y);
                    return false;
                }
                z3 = false;
            }
            if (parent != null && this.n.Y) {
                parent.requestDisallowInterceptTouchEvent(z3);
                Point point = gl.q;
                int i2 = point.x;
                int i3 = point.y;
                float f9 = this.n.s.x;
                float measuredWidth3 = getMeasuredWidth() + f9;
                float f10 = this.n.s.y;
                float measuredHeight3 = getMeasuredHeight() + f10;
                this.d = new AnimatorSet();
                float f11 = -gl.L(36.0f);
                if (f9 < f11) {
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(this.n.s.x, f11);
                    ofFloat3.addUpdateListener(this.n.U);
                    this.d.playTogether(ofFloat3);
                    f9 = f11;
                } else if (measuredWidth3 > i2 - f11) {
                    float measuredWidth4 = (i2 - getMeasuredWidth()) - f11;
                    ValueAnimator ofFloat4 = ValueAnimator.ofFloat(this.n.s.x, measuredWidth4);
                    ofFloat4.addUpdateListener(this.n.U);
                    this.d.playTogether(ofFloat4);
                    f9 = measuredWidth4;
                }
                int L = gl.L(36.0f) + i3;
                if (f10 < gl.m - gl.L(36.0f)) {
                    float f12 = this.n.s.y;
                    f10 = gl.m - gl.L(36.0f);
                    ValueAnimator ofFloat5 = ValueAnimator.ofFloat(f12, f10);
                    ofFloat5.addUpdateListener(this.n.V);
                    this.d.playTogether(ofFloat5);
                } else if (measuredHeight3 > L) {
                    float f13 = this.n.s.y;
                    f10 = L - getMeasuredHeight();
                    ValueAnimator ofFloat6 = ValueAnimator.ofFloat(f13, f10);
                    ofFloat6.addUpdateListener(this.n.V);
                    this.d.playTogether(ofFloat6);
                }
                this.d.setDuration(150L).setInterpolator(s33.f);
                this.d.start();
                o85 o85Var8 = this.n;
                if (o85Var8.M >= 0.0f) {
                    float[] fArr = o85Var8.J;
                    float f14 = point.x;
                    float f15 = point.y;
                    float f16 = -gl.L(36.0f);
                    fArr[0] = (f9 - f16) / ((f14 - (f16 * 2.0f)) - gl.L(105.0f));
                    fArr[1] = f10 / (f15 - gl.L(105.0f));
                    fArr[0] = Math.min(1.0f, Math.max(0.0f, fArr[0]));
                    fArr[1] = Math.min(1.0f, Math.max(0.0f, fArr[1]));
                    SharedPreferences.Editor edit = a.b.getSharedPreferences("groupcallpipconfig", 0).edit();
                    o85 o85Var9 = this.n;
                    float f17 = o85Var9.J[0];
                    o85Var9.M = f17;
                    SharedPreferences.Editor putFloat = edit.putFloat("relativeX", f17);
                    o85 o85Var10 = this.n;
                    float f18 = o85Var10.J[1];
                    o85Var10.N = f18;
                    putFloat.putFloat("relativeY", f18).apply();
                }
            }
            o85 o85Var11 = this.n;
            o85Var11.Y = false;
            o85Var11.g(false);
            return true;
        }
        if (this.c && VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().setMicMute(true, false, false);
        }
        this.c = false;
        o85 o85Var12 = this.n;
        ry8 ry8Var = o85Var12.X;
        oy8 oy8Var = o85Var12.x;
        yc ycVar = o85Var12.b;
        m85 m85Var = o85Var12.a;
        s71 s71Var = o85Var12.c;
        o85 o85Var13 = o85.f0;
        if (o85Var13 == null) {
            return false;
        }
        o85Var12.H = true;
        o85.g0 = true;
        o85Var12.W.I = true;
        o85Var13.f(false);
        float measuredWidth5 = (m85Var.getMeasuredWidth() / 2.0f) + o85Var12.s.x;
        float measuredWidth6 = ((ycVar.getMeasuredWidth() / 2.0f) + (o85Var12.P - o85Var12.S)) - measuredWidth5;
        float measuredHeight4 = ((ycVar.getMeasuredHeight() / 2.0f) + (o85Var12.O - o85Var12.T)) - ((m85Var.getMeasuredHeight() / 2.0f) + o85Var12.s.y);
        o85 o85Var14 = o85.f0;
        WindowManager windowManager = o85Var14.n;
        m85 m85Var2 = o85Var14.a;
        yc ycVar2 = o85Var14.b;
        FrameLayout frameLayout = o85Var14.d;
        r71 r71Var = o85Var14.e;
        o85Var12.e();
        o85.f0 = null;
        AnimatorSet animatorSet = new AnimatorSet();
        int i4 = oy8Var.b0;
        long m = i4 < 33 ? (long) (((1.0f - (i4 / 33.0f)) * oy8Var.m()) / 2.0f) : 0L;
        float f19 = o85Var12.s.x;
        ValueAnimator ofFloat7 = ValueAnimator.ofFloat(f19, measuredWidth6 + f19);
        ofFloat7.addUpdateListener(o85Var12.U);
        ValueAnimator duration = ofFloat7.setDuration(250L);
        s33 s33Var = s33.f;
        duration.setInterpolator(s33Var);
        animatorSet.playTogether(ofFloat7);
        float f20 = o85Var12.s.y;
        ValueAnimator ofFloat8 = ValueAnimator.ofFloat(f20, (f20 + measuredHeight4) - gl.L(30.0f), o85Var12.s.y + measuredHeight4);
        ofFloat8.addUpdateListener(o85Var12.V);
        ofFloat8.setDuration(250L).setInterpolator(s33Var);
        animatorSet.playTogether(ofFloat8);
        float[] fArr2 = {m85Var2.getScaleX(), 0.1f};
        Property property = View.SCALE_X;
        animatorSet.playTogether(ObjectAnimator.ofFloat(m85Var2, (Property<m85, Float>) property, fArr2).setDuration(180L));
        float[] fArr3 = {m85Var2.getScaleY(), 0.1f};
        Property property2 = View.SCALE_Y;
        animatorSet.playTogether(ObjectAnimator.ofFloat(m85Var2, (Property<m85, Float>) property2, fArr3).setDuration(180L));
        Property property3 = View.ALPHA;
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(m85Var2, (Property<m85, Float>) property3, 1.0f, 0.0f);
        ofFloat9.setStartDelay(245L);
        ofFloat9.setDuration(105L);
        animatorSet.playTogether(ofFloat9);
        gl.d3(new ql3((byte) 12), 370L);
        long j = m + 530;
        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(s71Var, (Property<s71, Float>) property, 1.0f, 1.05f);
        ofFloat10.setDuration(j);
        s33 s33Var2 = s33.j;
        ofFloat10.setInterpolator(s33Var2);
        animatorSet.playTogether(ofFloat10);
        ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(s71Var, (Property<s71, Float>) property2, 1.0f, 1.05f);
        ofFloat11.setDuration(j);
        ofFloat11.setInterpolator(s33Var2);
        animatorSet.playTogether(ofFloat11);
        ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(s71Var, (Property<s71, Float>) property, 1.0f, 0.3f);
        ofFloat12.setStartDelay(j);
        ofFloat12.setDuration(350L);
        s33 s33Var3 = s33.h;
        ofFloat12.setInterpolator(s33Var3);
        animatorSet.playTogether(ofFloat12);
        ObjectAnimator ofFloat13 = ObjectAnimator.ofFloat(s71Var, (Property<s71, Float>) property2, 1.0f, 0.3f);
        ofFloat13.setStartDelay(j);
        ofFloat13.setDuration(350L);
        ofFloat13.setInterpolator(s33Var3);
        animatorSet.playTogether(ofFloat13);
        ObjectAnimator ofFloat14 = ObjectAnimator.ofFloat(s71Var, (Property<s71, Float>) View.TRANSLATION_Y, 0.0f, gl.L(60.0f));
        ofFloat14.setStartDelay(j);
        ofFloat14.setDuration(350L);
        ofFloat14.setInterpolator(s33Var3);
        animatorSet.playTogether(ofFloat14);
        ObjectAnimator ofFloat15 = ObjectAnimator.ofFloat(s71Var, (Property<s71, Float>) property3, 1.0f, 0.0f);
        ofFloat15.setStartDelay(j);
        ofFloat15.setDuration(350L);
        ofFloat15.setInterpolator(s33Var3);
        animatorSet.playTogether(ofFloat15);
        animatorSet.addListener(new n85(o85Var12, m85Var2, ycVar2, windowManager, frameLayout, r71Var));
        animatorSet.start();
        oy8Var.K(66);
        ry8Var.i();
        ry8Var.d();
        return false;
    }
}
