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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class r extends FrameLayout {
    public float a;
    public float b;
    public boolean c;
    public final /* synthetic */ ThemeEditorView d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ThemeEditorView themeEditorView, Activity activity) {
        super(activity);
        this.d = themeEditorView;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x0089, code lost:
    
        if (r14.getFragmentStack().isEmpty() != false) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0412 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x01c0  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        tk5 tk5Var;
        ArrayList<cnb> arrayList;
        boolean z;
        float f;
        ArrayList arrayList2;
        boolean z2;
        ArrayList arrayList3;
        boolean z3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        float f2;
        int i;
        ThemeEditorView themeEditorView = this.d;
        int i2 = themeEditorView.g;
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        Property property = View.ALPHA;
        Object[] objArr = 0;
        boolean z4 = true;
        if (action == 0) {
            this.a = rawX;
            this.b = rawY;
        } else if (motionEvent.getAction() != 2 || this.c) {
            if (motionEvent.getAction() == 1 && !this.c && themeEditorView.n == null) {
                LaunchActivity launchActivity = (LaunchActivity) themeEditorView.d;
                if (gm.O1()) {
                    tk5Var = launchActivity.q0;
                    if (tk5Var != null && tk5Var.getFragmentStack().isEmpty()) {
                        tk5Var = null;
                    }
                    if (tk5Var == null) {
                        tk5Var = launchActivity.r0;
                        if (tk5Var != null) {
                        }
                    }
                    if (tk5Var == null) {
                        tk5Var = launchActivity.N();
                    }
                    if (tk5Var != null) {
                        org.telegram.ui.ActionBar.d dVar = !tk5Var.getFragmentStack().isEmpty() ? (org.telegram.ui.ActionBar.d) tk5Var.getFragmentStack().get(tk5Var.getFragmentStack().size() - 1) : null;
                        if (dVar != null) {
                            ArrayList arrayList6 = new ArrayList();
                            HashSet hashSet = new HashSet();
                            try {
                                arrayList = dVar.getThemeDescriptions();
                            } catch (Exception e) {
                                fc4.g(e, true);
                                arrayList = null;
                            }
                            if (arrayList != null) {
                                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                                    cnb cnbVar = arrayList.get(i3);
                                    if (cnbVar != null) {
                                        arrayList6.add(cnbVar);
                                        hashSet.add(Integer.valueOf(cnbVar.e));
                                    }
                                }
                            }
                            HashSet<Integer> r = anb.r();
                            try {
                                dVar.addThemeColorKeys(r);
                            } catch (Exception e2) {
                                fc4.g(e2, true);
                            }
                            ArrayList arrayList7 = new ArrayList(r);
                            byte b = 6;
                            Collections.sort(arrayList7, new zua(b));
                            int i4 = 0;
                            while (i4 < arrayList7.size()) {
                                Integer num = (Integer) arrayList7.get(i4);
                                int intValue = num.intValue();
                                boolean z5 = z4;
                                if (intValue >= 0 && intValue < cmb.e5 && hashSet.add(num)) {
                                    arrayList6.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, intValue));
                                }
                                i4++;
                                z4 = z5;
                            }
                            z = z4;
                            if (!arrayList6.isEmpty()) {
                                ThemeEditorView.EditorAlert editorAlert = themeEditorView.new EditorAlert(themeEditorView.d, arrayList6);
                                themeEditorView.n = editorAlert;
                                editorAlert.setOnDismissListener(new g5(b));
                                themeEditorView.n.setOnDismissListener(new qj8(this, (byte) 12));
                                themeEditorView.n.show();
                                if (themeEditorView.d != null) {
                                    try {
                                        AnimatorSet animatorSet = new AnimatorSet();
                                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(themeEditorView.c, (Property<r, Float>) property, 1.0f, 0.0f);
                                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(themeEditorView.c, (Property<r, Float>) View.SCALE_X, 1.0f, 0.0f);
                                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(themeEditorView.c, (Property<r, Float>) View.SCALE_Y, 1.0f, 0.0f);
                                        Animator[] animatorArr = new Animator[3];
                                        animatorArr[0] = ofFloat;
                                        animatorArr[z ? 1 : 0] = ofFloat2;
                                        animatorArr[2] = ofFloat3;
                                        animatorSet.playTogether(animatorArr);
                                        animatorSet.setInterpolator(themeEditorView.k);
                                        animatorSet.setDuration(150L);
                                        animatorSet.addListener(new dnb(themeEditorView, objArr == true ? 1 : 0));
                                        animatorSet.start();
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                            if (this.c) {
                                float f3 = 1.0f;
                                if (motionEvent.getAction() == 2) {
                                    float f4 = rawX - this.a;
                                    float f5 = rawY - this.b;
                                    WindowManager.LayoutParams layoutParams = themeEditorView.i;
                                    int i5 = (int) (layoutParams.x + f4);
                                    layoutParams.x = i5;
                                    layoutParams.y = (int) (layoutParams.y + f5);
                                    int i6 = i2 / 2;
                                    int i7 = -i6;
                                    if (i5 < i7) {
                                        layoutParams.x = i7;
                                    } else {
                                        i7 = (gm.q.x - layoutParams.width) + i6;
                                        if (i5 > i7) {
                                            layoutParams.x = i7;
                                        }
                                        if (i5 >= 0) {
                                            f3 = b10.A(i5, i6, 0.5f, 1.0f);
                                        } else {
                                            if (i5 > gm.q.x - layoutParams.width) {
                                                f3 = hg9.x((i5 - r9) + r8, i6, 0.5f, 1.0f);
                                            }
                                        }
                                        if (themeEditorView.c.getAlpha() != f3) {
                                            themeEditorView.c.setAlpha(f3);
                                        }
                                        WindowManager.LayoutParams layoutParams2 = themeEditorView.i;
                                        i = layoutParams2.y;
                                        if (i >= 0) {
                                            layoutParams2.y = 0;
                                        } else {
                                            int i8 = gm.q.y - layoutParams2.height;
                                            if (i > i8) {
                                                layoutParams2.y = i8;
                                            }
                                        }
                                        themeEditorView.j.updateViewLayout(themeEditorView.c, layoutParams2);
                                        this.a = rawX;
                                        this.b = rawY;
                                    }
                                    i5 = i7;
                                    if (i5 >= 0) {
                                    }
                                    if (themeEditorView.c.getAlpha() != f3) {
                                    }
                                    WindowManager.LayoutParams layoutParams22 = themeEditorView.i;
                                    i = layoutParams22.y;
                                    if (i >= 0) {
                                    }
                                    themeEditorView.j.updateViewLayout(themeEditorView.c, layoutParams22);
                                    this.a = rawX;
                                    this.b = rawY;
                                } else {
                                    boolean z6 = z;
                                    if (motionEvent.getAction() != z6) {
                                        return z6;
                                    }
                                    this.c = false;
                                    int b2 = ThemeEditorView.b(0.0f, 0, i2, z6);
                                    int b3 = ThemeEditorView.b(0.0f, z6 ? 1 : 0, i2, z6);
                                    int i9 = themeEditorView.h;
                                    int b4 = ThemeEditorView.b(0.0f, 0, i9, false);
                                    int b5 = ThemeEditorView.b(0.0f, z6 ? 1 : 0, i9, false);
                                    SharedPreferences.Editor edit = themeEditorView.l.edit();
                                    int L = gm.L(20.0f);
                                    if (Math.abs(b2 - themeEditorView.i.x) > L) {
                                        int i10 = themeEditorView.i.x;
                                        f = 0.0f;
                                        if (i10 >= 0 || i10 <= (-i2) / 4) {
                                            if (Math.abs(b3 - i10) > L) {
                                                int i11 = themeEditorView.i.x;
                                                Point point = gm.q;
                                                int i12 = point.x;
                                                f2 = 1.0f;
                                                if (i11 <= i12 - i2 || i11 >= i12 - ((i2 / 4) * 3)) {
                                                    if (themeEditorView.c.getAlpha() != 1.0f) {
                                                        ArrayList arrayList8 = new ArrayList();
                                                        if (themeEditorView.i.x < 0) {
                                                            arrayList8.add(ObjectAnimator.ofInt(themeEditorView, "x", -i2));
                                                        } else {
                                                            arrayList8.add(ObjectAnimator.ofInt(themeEditorView, "x", point.x));
                                                        }
                                                        arrayList2 = arrayList8;
                                                        z2 = true;
                                                    } else {
                                                        edit.putFloat("px", (themeEditorView.i.x - b2) / (b3 - b2));
                                                        edit.putInt("sidex", 2);
                                                        z2 = false;
                                                        arrayList2 = null;
                                                    }
                                                    if (!z2) {
                                                        if (Math.abs(b4 - themeEditorView.i.y) <= L || themeEditorView.i.y <= org.telegram.ui.ActionBar.a.getCurrentActionBarHeight()) {
                                                            arrayList4 = arrayList2 == null ? new ArrayList() : arrayList2;
                                                            edit.putInt("sidey", 0);
                                                            arrayList4.add(ObjectAnimator.ofInt(themeEditorView, "y", b4));
                                                        } else if (Math.abs(b5 - themeEditorView.i.y) <= L) {
                                                            arrayList4 = arrayList2 == null ? new ArrayList() : arrayList2;
                                                            edit.putInt("sidey", 1);
                                                            arrayList4.add(ObjectAnimator.ofInt(themeEditorView, "y", b5));
                                                        } else {
                                                            edit.putFloat("py", (themeEditorView.i.y - b4) / (b5 - b4));
                                                            edit.putInt("sidey", 2);
                                                            edit.commit();
                                                        }
                                                        arrayList2 = arrayList4;
                                                        edit.commit();
                                                    }
                                                    arrayList3 = arrayList2;
                                                    if (arrayList3 == null) {
                                                        return true;
                                                    }
                                                    if (themeEditorView.k == null) {
                                                        themeEditorView.k = new DecelerateInterpolator();
                                                    }
                                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                                    animatorSet2.setInterpolator(themeEditorView.k);
                                                    animatorSet2.setDuration(150L);
                                                    if (z2) {
                                                        z3 = true;
                                                        arrayList3.add(ObjectAnimator.ofFloat(themeEditorView.c, (Property<r, Float>) property, f));
                                                        animatorSet2.addListener(new dnb(themeEditorView, 1 == true ? 1 : 0));
                                                    } else {
                                                        z3 = true;
                                                    }
                                                    animatorSet2.playTogether(arrayList3);
                                                    animatorSet2.start();
                                                    return z3;
                                                }
                                            } else {
                                                f2 = 1.0f;
                                            }
                                            arrayList5 = new ArrayList();
                                            edit.putInt("sidex", 1);
                                            if (themeEditorView.c.getAlpha() != f2) {
                                                arrayList5.add(ObjectAnimator.ofFloat(themeEditorView.c, (Property<r, Float>) property, f2));
                                            }
                                            arrayList5.add(ObjectAnimator.ofInt(themeEditorView, "x", b3));
                                            arrayList2 = arrayList5;
                                            z2 = false;
                                            if (!z2) {
                                            }
                                            arrayList3 = arrayList2;
                                            if (arrayList3 == null) {
                                            }
                                        }
                                    } else {
                                        f = 0.0f;
                                    }
                                    arrayList5 = new ArrayList();
                                    edit.putInt("sidex", 0);
                                    if (themeEditorView.c.getAlpha() != 1.0f) {
                                        arrayList5.add(ObjectAnimator.ofFloat(themeEditorView.c, (Property<r, Float>) property, 1.0f));
                                    }
                                    arrayList5.add(ObjectAnimator.ofInt(themeEditorView, "x", b2));
                                    arrayList2 = arrayList5;
                                    z2 = false;
                                    if (!z2) {
                                    }
                                    arrayList3 = arrayList2;
                                    if (arrayList3 == null) {
                                    }
                                }
                            }
                            return z;
                        }
                    }
                }
                tk5Var = null;
                if (tk5Var == null) {
                }
                if (tk5Var != null) {
                }
            }
        } else if (Math.abs(this.a - rawX) >= gm.Z0(true, 0.3f) || Math.abs(this.b - rawY) >= gm.Z0(false, 0.3f)) {
            this.c = true;
            this.a = rawX;
            this.b = rawY;
        }
        z = true;
        if (this.c) {
        }
        return z;
    }
}
