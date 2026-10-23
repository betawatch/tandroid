package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Paint;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.ThemeEditorView.EditorAlert;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class z11 extends FrameLayout {
    public static final /* synthetic */ int e = 0;
    public float a;
    public float b;
    public boolean c;
    public final /* synthetic */ ThemeEditorView d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z11(ThemeEditorView themeEditorView, Activity activity) {
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
    /* JADX WARN: Removed duplicated region for block: B:51:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0401 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x01bf  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.h5 h5Var;
        boolean z10;
        ArrayList<org.telegram.ui.ActionBar.t6> arrayList;
        ArrayList arrayList2;
        boolean z11;
        boolean z12;
        int i10;
        float f7;
        ThemeEditorView themeEditorView = this.d;
        int i11 = themeEditorView.g;
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        int i12 = 4;
        Property property = View.ALPHA;
        int i13 = 0;
        if (action == 0) {
            this.a = rawX;
            this.b = rawY;
        } else if (motionEvent.getAction() != 2 || this.c) {
            if (motionEvent.getAction() == 1 && !this.c && themeEditorView.n == null) {
                LaunchActivity launchActivity = (LaunchActivity) themeEditorView.d;
                if (AndroidUtilities.isTablet()) {
                    h5Var = launchActivity.r0;
                    if (h5Var != null && h5Var.getFragmentStack().isEmpty()) {
                        h5Var = null;
                    }
                    if (h5Var == null) {
                        h5Var = launchActivity.s0;
                        if (h5Var != null) {
                        }
                    }
                    if (h5Var == null) {
                        h5Var = launchActivity.O();
                    }
                    if (h5Var != null) {
                        org.telegram.ui.ActionBar.o2 o2Var = !h5Var.getFragmentStack().isEmpty() ? (org.telegram.ui.ActionBar.o2) h5Var.getFragmentStack().get(h5Var.getFragmentStack().size() - 1) : null;
                        if (o2Var != null) {
                            ArrayList arrayList3 = new ArrayList();
                            z10 = true;
                            HashSet hashSet = new HashSet();
                            try {
                                arrayList = o2Var.getThemeDescriptions();
                            } catch (Exception e7) {
                                FileLog.e(e7);
                                arrayList = null;
                            }
                            if (arrayList != null) {
                                while (i13 < arrayList.size()) {
                                    org.telegram.ui.ActionBar.t6 t6Var = arrayList.get(i13);
                                    if (t6Var != null) {
                                        arrayList3.add(t6Var);
                                        hashSet.add(Integer.valueOf(t6Var.e));
                                    }
                                    i13++;
                                }
                            }
                            HashSet<Integer> s10 = org.telegram.ui.ActionBar.r6.s();
                            try {
                                o2Var.addThemeColorKeys(s10);
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                            ArrayList arrayList4 = new ArrayList(s10);
                            Collections.sort(arrayList4, new org.telegram.ui.ActionBar.l4(25));
                            for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                                Integer num = (Integer) arrayList4.get(i14);
                                int intValue = num.intValue();
                                if (intValue >= 0 && intValue < org.telegram.ui.ActionBar.k6.f5 && hashSet.add(num)) {
                                    arrayList3.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, intValue));
                                }
                            }
                            if (!arrayList3.isEmpty()) {
                                ThemeEditorView.EditorAlert editorAlert = themeEditorView.new EditorAlert(themeEditorView.d, arrayList3);
                                themeEditorView.n = editorAlert;
                                editorAlert.setOnDismissListener(new ei.e1(i12));
                                themeEditorView.n.setOnDismissListener(new a1(this, 10));
                                themeEditorView.n.show();
                                if (themeEditorView.d != null) {
                                    try {
                                        AnimatorSet animatorSet = new AnimatorSet();
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(themeEditorView.c, (Property<z11, Float>) property, 1.0f, 0.0f), ObjectAnimator.ofFloat(themeEditorView.c, (Property<z11, Float>) View.SCALE_X, 1.0f, 0.0f), ObjectAnimator.ofFloat(themeEditorView.c, (Property<z11, Float>) View.SCALE_Y, 1.0f, 0.0f));
                                        animatorSet.setInterpolator(themeEditorView.k);
                                        animatorSet.setDuration(150L);
                                        animatorSet.addListener(new b21(themeEditorView, i13));
                                        animatorSet.start();
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                            if (this.c) {
                                float f10 = 1.0f;
                                if (motionEvent.getAction() == 2) {
                                    float f11 = rawX - this.a;
                                    float f12 = rawY - this.b;
                                    WindowManager.LayoutParams layoutParams = themeEditorView.i;
                                    int i15 = (int) (layoutParams.x + f11);
                                    layoutParams.x = i15;
                                    layoutParams.y = (int) (layoutParams.y + f12);
                                    int i16 = i11 / 2;
                                    int i17 = -i16;
                                    if (i15 < i17) {
                                        layoutParams.x = i17;
                                    } else {
                                        int i18 = (AndroidUtilities.displaySize.x - layoutParams.width) + i16;
                                        if (i15 > i18) {
                                            layoutParams.x = i18;
                                        }
                                    }
                                    int i19 = layoutParams.x;
                                    if (i19 < 0) {
                                        f10 = a1.g.d(i19, i16, 0.5f, 1.0f);
                                    } else {
                                        if (i19 > AndroidUtilities.displaySize.x - layoutParams.width) {
                                            f10 = org.telegram.messenger.sl.x((i19 - r9) + r7, i16, 0.5f, 1.0f);
                                        }
                                    }
                                    if (themeEditorView.c.getAlpha() != f10) {
                                        themeEditorView.c.setAlpha(f10);
                                    }
                                    WindowManager.LayoutParams layoutParams2 = themeEditorView.i;
                                    int i20 = layoutParams2.y;
                                    if (i20 < 0) {
                                        layoutParams2.y = 0;
                                    } else {
                                        int i21 = AndroidUtilities.displaySize.y - layoutParams2.height;
                                        if (i20 > i21) {
                                            layoutParams2.y = i21;
                                        }
                                    }
                                    themeEditorView.j.updateViewLayout(themeEditorView.c, layoutParams2);
                                    this.a = rawX;
                                    this.b = rawY;
                                } else {
                                    boolean z13 = z10;
                                    if (motionEvent.getAction() != z13) {
                                        return z13;
                                    }
                                    this.c = false;
                                    int c10 = ThemeEditorView.c(0.0f, 0, i11, z13);
                                    int c11 = ThemeEditorView.c(0.0f, z13 ? 1 : 0, i11, z13);
                                    int i22 = themeEditorView.h;
                                    int c12 = ThemeEditorView.c(0.0f, 0, i22, false);
                                    int c13 = ThemeEditorView.c(0.0f, z13 ? 1 : 0, i22, false);
                                    SharedPreferences.Editor edit = themeEditorView.l.edit();
                                    int dp = AndroidUtilities.dp(20.0f);
                                    if (Math.abs(c10 - themeEditorView.i.x) <= dp || ((i10 = themeEditorView.i.x) < 0 && i10 > (-i11) / 4)) {
                                        arrayList2 = new ArrayList();
                                        edit.putInt("sidex", 0);
                                        if (themeEditorView.c.getAlpha() != 1.0f) {
                                            arrayList2.add(ObjectAnimator.ofFloat(themeEditorView.c, (Property<z11, Float>) property, 1.0f));
                                        }
                                        arrayList2.add(ObjectAnimator.ofInt(themeEditorView, "x", c10));
                                    } else {
                                        if (Math.abs(c11 - i10) > dp) {
                                            int i23 = themeEditorView.i.x;
                                            int i24 = AndroidUtilities.displaySize.x;
                                            f7 = 1.0f;
                                            if (i23 <= i24 - i11 || i23 >= i24 - ((i11 / 4) * 3)) {
                                                if (themeEditorView.c.getAlpha() != 1.0f) {
                                                    ArrayList arrayList5 = new ArrayList();
                                                    if (themeEditorView.i.x < 0) {
                                                        arrayList5.add(ObjectAnimator.ofInt(themeEditorView, "x", -i11));
                                                    } else {
                                                        arrayList5.add(ObjectAnimator.ofInt(themeEditorView, "x", AndroidUtilities.displaySize.x));
                                                    }
                                                    arrayList2 = arrayList5;
                                                    z11 = true;
                                                } else {
                                                    edit.putFloat("px", (themeEditorView.i.x - c10) / (c11 - c10));
                                                    edit.putInt("sidex", 2);
                                                    z11 = false;
                                                    arrayList2 = null;
                                                }
                                                if (!z11) {
                                                    if (Math.abs(c12 - themeEditorView.i.y) <= dp || themeEditorView.i.y <= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                                                        if (arrayList2 == null) {
                                                            arrayList2 = new ArrayList();
                                                        }
                                                        edit.putInt("sidey", 0);
                                                        arrayList2.add(ObjectAnimator.ofInt(themeEditorView, "y", c12));
                                                    } else if (Math.abs(c13 - themeEditorView.i.y) <= dp) {
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
                                                if (z11) {
                                                    z12 = true;
                                                    arrayList2.add(ObjectAnimator.ofFloat(themeEditorView.c, (Property<z11, Float>) property, 0.0f));
                                                    animatorSet2.addListener(new b21(themeEditorView, 1 == true ? 1 : 0));
                                                } else {
                                                    z12 = true;
                                                }
                                                animatorSet2.playTogether(arrayList2);
                                                animatorSet2.start();
                                                return z12;
                                            }
                                        } else {
                                            f7 = 1.0f;
                                        }
                                        arrayList2 = new ArrayList();
                                        edit.putInt("sidex", 1);
                                        if (themeEditorView.c.getAlpha() != f7) {
                                            arrayList2.add(ObjectAnimator.ofFloat(themeEditorView.c, (Property<z11, Float>) property, f7));
                                        }
                                        arrayList2.add(ObjectAnimator.ofInt(themeEditorView, "x", c11));
                                    }
                                    z11 = false;
                                    if (!z11) {
                                    }
                                    if (arrayList2 != null) {
                                    }
                                }
                            }
                            return z10;
                        }
                    }
                }
                h5Var = null;
                if (h5Var == null) {
                }
                if (h5Var != null) {
                }
            }
        } else if (Math.abs(this.a - rawX) >= AndroidUtilities.getPixelsInCM(0.3f, true) || Math.abs(this.b - rawY) >= AndroidUtilities.getPixelsInCM(0.3f, false)) {
            this.c = true;
            this.a = rawX;
            this.b = rawY;
        }
        z10 = true;
        if (this.c) {
        }
        return z10;
    }
}
