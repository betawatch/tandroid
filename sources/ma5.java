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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ma5 extends FrameLayout {
    public float a;
    public float b;
    public boolean c;
    public AnimatorSet d;
    public final la5 e;
    public final bn3 f;
    public final /* synthetic */ float h;
    public final /* synthetic */ oa5 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ma5(oa5 oa5Var, Context context, float f) {
        super(context);
        this.n = oa5Var;
        this.h = f;
        this.e = new la5(this);
        this.f = new bn3((byte) 13);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Point point = gm.q;
        int i3 = point.x;
        oa5 oa5Var = this.n;
        if (i3 == oa5Var.K && oa5Var.L == point.y) {
            return;
        }
        oa5Var.K = i3;
        oa5Var.L = point.y;
        if (oa5Var.M < 0.0f) {
            SharedPreferences sharedPreferences = a.b.getSharedPreferences("groupcallpipconfig", 0);
            this.n.M = sharedPreferences.getFloat("relativeX", 1.0f);
            this.n.N = sharedPreferences.getFloat("relativeY", 0.4f);
        }
        oa5 oa5Var2 = oa5.f0;
        if (oa5Var2 != null) {
            oa5 oa5Var3 = this.n;
            float f = oa5Var3.M;
            float f2 = oa5Var3.N;
            float f3 = -gm.L(36.0f);
            oa5Var2.s.x = (int) td4.A(point.x - (2.0f * f3), gm.L(105.0f), f, f3);
            oa5Var2.s.y = (int) ((point.y - gm.L(105.0f)) * f2);
            oa5Var2.i();
            ma5 ma5Var = oa5Var2.a;
            if (ma5Var.getParent() != null) {
                oa5Var2.n.updateViewLayout(ma5Var, oa5Var2.s);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if (r5 != 3) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0196  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float f;
        boolean z;
        boolean z2;
        oa5 oa5Var;
        oa5 oa5Var2;
        ta5 ta5Var;
        ValueAnimator valueAnimator;
        boolean z3 = false;
        if (oa5.f0 == null) {
            return false;
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        ViewParent parent = getParent();
        int action = motionEvent.getAction();
        if (action == 0) {
            getLocationOnScreen(this.n.I);
            oa5 oa5Var3 = this.n;
            int i = oa5Var3.I[0];
            WindowManager.LayoutParams layoutParams = oa5Var3.s;
            oa5Var3.S = i - layoutParams.x;
            oa5Var3.T = r5[1] - layoutParams.y;
            this.a = rawX;
            this.b = rawY;
            System.currentTimeMillis();
            gm.d3(this.e, 300L);
            oa5 oa5Var4 = this.n;
            WindowManager.LayoutParams layoutParams2 = oa5Var4.s;
            oa5Var4.Q = layoutParams2.x;
            oa5Var4.R = layoutParams2.y;
            oa5Var4.Z = true;
            oa5Var4.a();
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
                        gm.r(this.e);
                        oa5 oa5Var5 = this.n;
                        oa5Var5.Y = true;
                        oa5Var5.g(true);
                        this.n.f(false);
                        this.a = rawX;
                        this.b = rawY;
                        f2 = 0.0f;
                        f3 = 0.0f;
                    }
                }
                oa5 oa5Var6 = this.n;
                if (oa5Var6.Y) {
                    oa5Var6.Q += f2;
                    oa5Var6.R += f3;
                    this.a = rawX;
                    this.b = rawY;
                    oa5Var6.j();
                    float measuredWidth = (getMeasuredWidth() / 2.0f) + this.n.Q;
                    float measuredHeight = (getMeasuredHeight() / 2.0f) + this.n.R;
                    float measuredWidth2 = (r1.b.getMeasuredWidth() / 2.0f) + (r1.P - this.n.S);
                    float measuredHeight2 = (r5.b.getMeasuredHeight() / 2.0f) + (r5.O - this.n.T);
                    float f6 = measuredWidth - measuredWidth2;
                    float f7 = measuredHeight - measuredHeight2;
                    float f8 = (f7 * f7) + (f6 * f6);
                    if (f8 < gm.L(80.0f) * gm.L(80.0f)) {
                        f = 0.0f;
                        this.n.W.setRemoveAngle((((measuredWidth <= measuredWidth2 || measuredHeight >= measuredHeight2) && (measuredWidth >= measuredWidth2 || measuredHeight >= measuredHeight2)) ? 90.0d : 270.0d) - Math.toDegrees(Math.atan(f6 / f7)));
                        if (f8 < gm.L(50.0f) * gm.L(50.0f)) {
                            z = true;
                        } else {
                            z = false;
                            z2 = true;
                            oa5Var = this.n;
                            if (!oa5Var.H && oa5Var.c0 != z) {
                                oa5Var.c0 = z;
                                valueAnimator = oa5Var.e0;
                                if (valueAnimator != null) {
                                    valueAnimator.removeAllListeners();
                                    oa5Var.e0.cancel();
                                }
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(oa5Var.d0, !z ? 1.0f : f);
                                oa5Var.e0 = ofFloat;
                                ofFloat.addUpdateListener(new fh4(oa5Var, (byte) 8));
                                oa5Var.e0.addListener(new jf4((byte) 5, oa5Var, z));
                                oa5Var.e0.setDuration(250L);
                                oa5Var.e0.setInterpolator(d53.f);
                                oa5Var.e0.start();
                            }
                            oa5Var2 = this.n;
                            ta5Var = oa5Var2.W;
                            if (oa5Var2.F != z2) {
                                oa5Var2.F = z2;
                                oa5Var2.c.invalidate();
                                if (!oa5Var2.H) {
                                    oa5Var2.x.K(z2 ? 33 : 0);
                                    oa5Var2.X.d();
                                }
                                if (z2) {
                                    try {
                                        ta5Var.performHapticFeedback(3, 2);
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                            if (ta5Var.s != z2) {
                                ta5Var.invalidate();
                            }
                            ta5Var.s = z2;
                        }
                    } else {
                        f = 0.0f;
                        z = false;
                    }
                    z2 = z;
                    oa5Var = this.n;
                    if (!oa5Var.H) {
                        oa5Var.c0 = z;
                        valueAnimator = oa5Var.e0;
                        if (valueAnimator != null) {
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(oa5Var.d0, !z ? 1.0f : f);
                        oa5Var.e0 = ofFloat2;
                        ofFloat2.addUpdateListener(new fh4(oa5Var, (byte) 8));
                        oa5Var.e0.addListener(new jf4((byte) 5, oa5Var, z));
                        oa5Var.e0.setDuration(250L);
                        oa5Var.e0.setInterpolator(d53.f);
                        oa5Var.e0.start();
                    }
                    oa5Var2 = this.n;
                    ta5Var = oa5Var2.W;
                    if (oa5Var2.F != z2) {
                    }
                    if (ta5Var.s != z2) {
                    }
                    ta5Var.s = z2;
                }
            }
            return true;
        }
        gm.r(this.f);
        gm.r(this.e);
        oa5 oa5Var7 = this.n;
        if (!oa5Var7.F) {
            oa5Var7.Z = false;
            oa5Var7.a();
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
                Point point = gm.q;
                int i2 = point.x;
                int i3 = point.y;
                float f9 = this.n.s.x;
                float measuredWidth3 = getMeasuredWidth() + f9;
                float f10 = this.n.s.y;
                float measuredHeight3 = getMeasuredHeight() + f10;
                this.d = new AnimatorSet();
                float f11 = -gm.L(36.0f);
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
                int L = gm.L(36.0f) + i3;
                if (f10 < gm.m - gm.L(36.0f)) {
                    float f12 = this.n.s.y;
                    f10 = gm.m - gm.L(36.0f);
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
                this.d.setDuration(150L).setInterpolator(d53.f);
                this.d.start();
                oa5 oa5Var8 = this.n;
                if (oa5Var8.M >= 0.0f) {
                    float[] fArr = oa5Var8.J;
                    float f14 = point.x;
                    float f15 = point.y;
                    float f16 = -gm.L(36.0f);
                    fArr[0] = (f9 - f16) / ((f14 - (f16 * 2.0f)) - gm.L(105.0f));
                    fArr[1] = f10 / (f15 - gm.L(105.0f));
                    fArr[0] = Math.min(1.0f, Math.max(0.0f, fArr[0]));
                    fArr[1] = Math.min(1.0f, Math.max(0.0f, fArr[1]));
                    SharedPreferences.Editor edit = a.b.getSharedPreferences("groupcallpipconfig", 0).edit();
                    oa5 oa5Var9 = this.n;
                    float f17 = oa5Var9.J[0];
                    oa5Var9.M = f17;
                    SharedPreferences.Editor putFloat = edit.putFloat("relativeX", f17);
                    oa5 oa5Var10 = this.n;
                    float f18 = oa5Var10.J[1];
                    oa5Var10.N = f18;
                    putFloat.putFloat("relativeY", f18).apply();
                }
            }
            oa5 oa5Var11 = this.n;
            oa5Var11.Y = false;
            oa5Var11.g(false);
            return true;
        }
        if (this.c && VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().setMicMute(true, false, false);
        }
        this.c = false;
        oa5 oa5Var12 = this.n;
        s09 s09Var = oa5Var12.X;
        p09 p09Var = oa5Var12.x;
        yd ydVar = oa5Var12.b;
        ma5 ma5Var = oa5Var12.a;
        a91 a91Var = oa5Var12.c;
        oa5 oa5Var13 = oa5.f0;
        if (oa5Var13 == null) {
            return false;
        }
        oa5Var12.H = true;
        oa5.g0 = true;
        oa5Var12.W.I = true;
        oa5Var13.f(false);
        float measuredWidth5 = (ma5Var.getMeasuredWidth() / 2.0f) + oa5Var12.s.x;
        float measuredWidth6 = ((ydVar.getMeasuredWidth() / 2.0f) + (oa5Var12.P - oa5Var12.S)) - measuredWidth5;
        float measuredHeight4 = ((ydVar.getMeasuredHeight() / 2.0f) + (oa5Var12.O - oa5Var12.T)) - ((ma5Var.getMeasuredHeight() / 2.0f) + oa5Var12.s.y);
        oa5 oa5Var14 = oa5.f0;
        WindowManager windowManager = oa5Var14.n;
        ma5 ma5Var2 = oa5Var14.a;
        yd ydVar2 = oa5Var14.b;
        FrameLayout frameLayout = oa5Var14.d;
        z81 z81Var = oa5Var14.e;
        oa5Var12.e();
        oa5.f0 = null;
        AnimatorSet animatorSet = new AnimatorSet();
        int i4 = p09Var.b0;
        long m = i4 < 33 ? (long) (((1.0f - (i4 / 33.0f)) * p09Var.m()) / 2.0f) : 0L;
        float f19 = oa5Var12.s.x;
        ValueAnimator ofFloat7 = ValueAnimator.ofFloat(f19, measuredWidth6 + f19);
        ofFloat7.addUpdateListener(oa5Var12.U);
        ValueAnimator duration = ofFloat7.setDuration(250L);
        d53 d53Var = d53.f;
        duration.setInterpolator(d53Var);
        animatorSet.playTogether(ofFloat7);
        float f20 = oa5Var12.s.y;
        ValueAnimator ofFloat8 = ValueAnimator.ofFloat(f20, (f20 + measuredHeight4) - gm.L(30.0f), oa5Var12.s.y + measuredHeight4);
        ofFloat8.addUpdateListener(oa5Var12.V);
        ofFloat8.setDuration(250L).setInterpolator(d53Var);
        animatorSet.playTogether(ofFloat8);
        float[] fArr2 = {ma5Var2.getScaleX(), 0.1f};
        Property property = View.SCALE_X;
        animatorSet.playTogether(ObjectAnimator.ofFloat(ma5Var2, (Property<ma5, Float>) property, fArr2).setDuration(180L));
        float[] fArr3 = {ma5Var2.getScaleY(), 0.1f};
        Property property2 = View.SCALE_Y;
        animatorSet.playTogether(ObjectAnimator.ofFloat(ma5Var2, (Property<ma5, Float>) property2, fArr3).setDuration(180L));
        Property property3 = View.ALPHA;
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(ma5Var2, (Property<ma5, Float>) property3, 1.0f, 0.0f);
        ofFloat9.setStartDelay(245L);
        ofFloat9.setDuration(105L);
        animatorSet.playTogether(ofFloat9);
        gm.d3(new bn3((byte) 12), 370L);
        long j = m + 530;
        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(a91Var, (Property<a91, Float>) property, 1.0f, 1.05f);
        ofFloat10.setDuration(j);
        d53 d53Var2 = d53.j;
        ofFloat10.setInterpolator(d53Var2);
        animatorSet.playTogether(ofFloat10);
        ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(a91Var, (Property<a91, Float>) property2, 1.0f, 1.05f);
        ofFloat11.setDuration(j);
        ofFloat11.setInterpolator(d53Var2);
        animatorSet.playTogether(ofFloat11);
        ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(a91Var, (Property<a91, Float>) property, 1.0f, 0.3f);
        ofFloat12.setStartDelay(j);
        ofFloat12.setDuration(350L);
        d53 d53Var3 = d53.h;
        ofFloat12.setInterpolator(d53Var3);
        animatorSet.playTogether(ofFloat12);
        ObjectAnimator ofFloat13 = ObjectAnimator.ofFloat(a91Var, (Property<a91, Float>) property2, 1.0f, 0.3f);
        ofFloat13.setStartDelay(j);
        ofFloat13.setDuration(350L);
        ofFloat13.setInterpolator(d53Var3);
        animatorSet.playTogether(ofFloat13);
        ObjectAnimator ofFloat14 = ObjectAnimator.ofFloat(a91Var, (Property<a91, Float>) View.TRANSLATION_Y, 0.0f, gm.L(60.0f));
        ofFloat14.setStartDelay(j);
        ofFloat14.setDuration(350L);
        ofFloat14.setInterpolator(d53Var3);
        animatorSet.playTogether(ofFloat14);
        ObjectAnimator ofFloat15 = ObjectAnimator.ofFloat(a91Var, (Property<a91, Float>) property3, 1.0f, 0.0f);
        ofFloat15.setStartDelay(j);
        ofFloat15.setDuration(350L);
        ofFloat15.setInterpolator(d53Var3);
        animatorSet.playTogether(ofFloat15);
        animatorSet.addListener(new na5(oa5Var12, ma5Var2, ydVar2, windowManager, frameLayout, z81Var));
        animatorSet.start();
        p09Var.K(66);
        s09Var.i();
        s09Var.d();
        return false;
    }
}
