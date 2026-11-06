package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.ThemeEditorView.EditorAlert;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class dz0 extends FrameLayout {
    public static final /* synthetic */ int e = 0;
    public float a;
    public float b;
    public boolean c;
    public final /* synthetic */ ThemeEditorView d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dz0(ThemeEditorView themeEditorView, Activity activity) {
        super(activity);
        this.d = themeEditorView;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x008a, code lost:
    
        if (r15.getFragmentStack().isEmpty() != false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0407 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x01c5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.q4 q4Var;
        ArrayList<org.telegram.ui.ActionBar.t6> arrayList;
        boolean z9;
        ArrayList arrayList2;
        boolean z10;
        boolean z11;
        int i7;
        float f10;
        ThemeEditorView themeEditorView = this.d;
        int i10 = themeEditorView.g;
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        int i11 = 4;
        Property property = View.ALPHA;
        int i12 = 0;
        boolean z12 = true;
        if (action == 0) {
            this.a = rawX;
            this.b = rawY;
        } else if (motionEvent.getAction() != 2 || this.c) {
            if (motionEvent.getAction() == 1 && !this.c && themeEditorView.n == null) {
                LaunchActivity launchActivity = (LaunchActivity) themeEditorView.d;
                if (org.telegram.messenger.g0.Q1()) {
                    q4Var = launchActivity.p0;
                    if (q4Var != null && q4Var.getFragmentStack().isEmpty()) {
                        q4Var = null;
                    }
                    if (q4Var == null) {
                        q4Var = launchActivity.q0;
                        if (q4Var != null) {
                        }
                    }
                    if (q4Var == null) {
                        q4Var = launchActivity.M();
                    }
                    if (q4Var != null) {
                        org.telegram.ui.ActionBar.f2 f2Var = !q4Var.getFragmentStack().isEmpty() ? (org.telegram.ui.ActionBar.f2) q4Var.getFragmentStack().get(q4Var.getFragmentStack().size() - 1) : null;
                        if (f2Var != null) {
                            ArrayList arrayList3 = new ArrayList();
                            HashSet hashSet = new HashSet();
                            try {
                                arrayList = f2Var.getThemeDescriptions();
                            } catch (Exception e10) {
                                org.telegram.messenger.a8.g(e10, true);
                                arrayList = null;
                            }
                            if (arrayList != null) {
                                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                                    org.telegram.ui.ActionBar.t6 t6Var = arrayList.get(i13);
                                    if (t6Var != null) {
                                        arrayList3.add(t6Var);
                                        hashSet.add(Integer.valueOf(t6Var.e));
                                    }
                                }
                            }
                            HashSet<Integer> s5 = org.telegram.ui.ActionBar.r6.s();
                            try {
                                f2Var.addThemeColorKeys(s5);
                            } catch (Exception e11) {
                                org.telegram.messenger.a8.g(e11, true);
                            }
                            ArrayList arrayList4 = new ArrayList(s5);
                            Collections.sort(arrayList4, new org.telegram.ui.oe(18));
                            int i14 = 0;
                            while (i14 < arrayList4.size()) {
                                Integer num = (Integer) arrayList4.get(i14);
                                int intValue = num.intValue();
                                boolean z13 = z12;
                                if (intValue >= 0 && intValue < org.telegram.ui.ActionBar.k6.f5 && hashSet.add(num)) {
                                    arrayList3.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, intValue));
                                }
                                i14++;
                                z12 = z13;
                            }
                            z9 = z12;
                            if (!arrayList3.isEmpty()) {
                                ThemeEditorView.EditorAlert editorAlert = themeEditorView.new EditorAlert(themeEditorView.d, arrayList3);
                                themeEditorView.n = editorAlert;
                                editorAlert.setOnDismissListener(new fi.d1(i11));
                                themeEditorView.n.setOnDismissListener(new p0(this, 10));
                                themeEditorView.n.show();
                                if (themeEditorView.d != null) {
                                    try {
                                        AnimatorSet animatorSet = new AnimatorSet();
                                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(themeEditorView.c, (Property<dz0, Float>) property, 1.0f, 0.0f);
                                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(themeEditorView.c, (Property<dz0, Float>) View.SCALE_X, 1.0f, 0.0f);
                                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(themeEditorView.c, (Property<dz0, Float>) View.SCALE_Y, 1.0f, 0.0f);
                                        Animator[] animatorArr = new Animator[3];
                                        animatorArr[0] = ofFloat;
                                        animatorArr[z9 ? 1 : 0] = ofFloat2;
                                        animatorArr[2] = ofFloat3;
                                        animatorSet.playTogether(animatorArr);
                                        animatorSet.setInterpolator(themeEditorView.k);
                                        animatorSet.setDuration(150L);
                                        animatorSet.addListener(new fz0(themeEditorView, i12));
                                        animatorSet.start();
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                            if (this.c) {
                                float f11 = 1.0f;
                                if (motionEvent.getAction() == 2) {
                                    float f12 = rawX - this.a;
                                    float f13 = rawY - this.b;
                                    WindowManager.LayoutParams layoutParams = themeEditorView.i;
                                    int i15 = (int) (layoutParams.x + f12);
                                    layoutParams.x = i15;
                                    layoutParams.y = (int) (layoutParams.y + f13);
                                    int i16 = i10 / 2;
                                    int i17 = -i16;
                                    if (i15 < i17) {
                                        layoutParams.x = i17;
                                    } else {
                                        int i18 = (org.telegram.messenger.g0.q.x - layoutParams.width) + i16;
                                        if (i15 > i18) {
                                            layoutParams.x = i18;
                                        }
                                    }
                                    int i19 = layoutParams.x;
                                    if (i19 < 0) {
                                        f11 = com.google.android.recaptcha.internal.a.c(i19, i16, 0.5f, 1.0f);
                                    } else {
                                        if (i19 > org.telegram.messenger.g0.q.x - layoutParams.width) {
                                            f11 = org.telegram.messenger.camera.q.v((i19 - r9) + r7, i16, 0.5f, 1.0f);
                                        }
                                    }
                                    if (themeEditorView.c.getAlpha() != f11) {
                                        themeEditorView.c.setAlpha(f11);
                                    }
                                    WindowManager.LayoutParams layoutParams2 = themeEditorView.i;
                                    int i20 = layoutParams2.y;
                                    if (i20 < 0) {
                                        layoutParams2.y = 0;
                                    } else {
                                        int i21 = org.telegram.messenger.g0.q.y - layoutParams2.height;
                                        if (i20 > i21) {
                                            layoutParams2.y = i21;
                                        }
                                    }
                                    themeEditorView.j.updateViewLayout(themeEditorView.c, layoutParams2);
                                    this.a = rawX;
                                    this.b = rawY;
                                } else {
                                    boolean z14 = z9;
                                    if (motionEvent.getAction() != z14) {
                                        return z14;
                                    }
                                    this.c = false;
                                    int c10 = ThemeEditorView.c(0.0f, 0, i10, z14);
                                    int c11 = ThemeEditorView.c(0.0f, z14 ? 1 : 0, i10, z14);
                                    int i22 = themeEditorView.h;
                                    int c12 = ThemeEditorView.c(0.0f, 0, i22, false);
                                    int c13 = ThemeEditorView.c(0.0f, z14 ? 1 : 0, i22, false);
                                    SharedPreferences.Editor edit = themeEditorView.l.edit();
                                    int L = org.telegram.messenger.g0.L(20.0f);
                                    if (Math.abs(c10 - themeEditorView.i.x) <= L || ((i7 = themeEditorView.i.x) < 0 && i7 > (-i10) / 4)) {
                                        arrayList2 = new ArrayList();
                                        edit.putInt("sidex", 0);
                                        if (themeEditorView.c.getAlpha() != 1.0f) {
                                            arrayList2.add(ObjectAnimator.ofFloat(themeEditorView.c, (Property<dz0, Float>) property, 1.0f));
                                        }
                                        arrayList2.add(ObjectAnimator.ofInt(themeEditorView, "x", c10));
                                    } else {
                                        if (Math.abs(c11 - i7) > L) {
                                            int i23 = themeEditorView.i.x;
                                            Point point = org.telegram.messenger.g0.q;
                                            f10 = 1.0f;
                                            int i24 = point.x;
                                            if (i23 <= i24 - i10 || i23 >= i24 - ((i10 / 4) * 3)) {
                                                if (themeEditorView.c.getAlpha() != 1.0f) {
                                                    ArrayList arrayList5 = new ArrayList();
                                                    if (themeEditorView.i.x < 0) {
                                                        arrayList5.add(ObjectAnimator.ofInt(themeEditorView, "x", -i10));
                                                    } else {
                                                        arrayList5.add(ObjectAnimator.ofInt(themeEditorView, "x", point.x));
                                                    }
                                                    arrayList2 = arrayList5;
                                                    z10 = true;
                                                } else {
                                                    edit.putFloat("px", (themeEditorView.i.x - c10) / (c11 - c10));
                                                    edit.putInt("sidex", 2);
                                                    z10 = false;
                                                    arrayList2 = null;
                                                }
                                                if (!z10) {
                                                    if (Math.abs(c12 - themeEditorView.i.y) <= L || themeEditorView.i.y <= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                                                        if (arrayList2 == null) {
                                                            arrayList2 = new ArrayList();
                                                        }
                                                        edit.putInt("sidey", 0);
                                                        arrayList2.add(ObjectAnimator.ofInt(themeEditorView, "y", c12));
                                                    } else if (Math.abs(c13 - themeEditorView.i.y) <= L) {
                                                        if (arrayList2 == null) {
                                                            arrayList2 = new ArrayList();
                                                        }
                                                        edit.putInt("sidey", 1);
                                                        arrayList2.add(ObjectAnimator.ofInt(themeEditorView, "y", c13));
                                                    } else {
                                                        edit.putFloat("py", (themeEditorView.i.y - c12) / (c13 - c12));
                                                        edit.putInt("sidey", 2);
                                                    }
                                                    edit.commit();
                                                }
                                                if (arrayList2 != null) {
                                                    return true;
                                                }
                                                if (themeEditorView.k == null) {
                                                    themeEditorView.k = new DecelerateInterpolator();
                                                }
                                                AnimatorSet animatorSet2 = new AnimatorSet();
                                                animatorSet2.setInterpolator(themeEditorView.k);
                                                animatorSet2.setDuration(150L);
                                                if (z10) {
                                                    z11 = true;
                                                    arrayList2.add(ObjectAnimator.ofFloat(themeEditorView.c, (Property<dz0, Float>) property, 0.0f));
                                                    animatorSet2.addListener(new fz0(themeEditorView, 1 == true ? 1 : 0));
                                                } else {
                                                    z11 = true;
                                                }
                                                animatorSet2.playTogether(arrayList2);
                                                animatorSet2.start();
                                                return z11;
                                            }
                                        } else {
                                            f10 = 1.0f;
                                        }
                                        arrayList2 = new ArrayList();
                                        edit.putInt("sidex", 1);
                                        if (themeEditorView.c.getAlpha() != f10) {
                                            arrayList2.add(ObjectAnimator.ofFloat(themeEditorView.c, (Property<dz0, Float>) property, f10));
                                        }
                                        arrayList2.add(ObjectAnimator.ofInt(themeEditorView, "x", c11));
                                    }
                                    z10 = false;
                                    if (!z10) {
                                    }
                                    if (arrayList2 != null) {
                                    }
                                }
                            }
                            return z9;
                        }
                    }
                }
                q4Var = null;
                if (q4Var == null) {
                }
                if (q4Var != null) {
                }
            }
        } else if (Math.abs(this.a - rawX) >= org.telegram.messenger.g0.a1(true, 0.3f) || Math.abs(this.b - rawY) >= org.telegram.messenger.g0.a1(false, 0.3f)) {
            this.c = true;
            this.a = rawX;
            this.b = rawY;
        }
        z9 = true;
        if (this.c) {
        }
        return z9;
    }
}
