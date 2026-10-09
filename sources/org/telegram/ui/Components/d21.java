package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.SharedPreferences;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.ThemeEditorView.EditorAlert;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class d21 extends FrameLayout {
    public static final /* synthetic */ int e = 0;
    public float a;
    public float b;
    public boolean c;
    public final /* synthetic */ ThemeEditorView d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d21(ThemeEditorView themeEditorView, Activity activity) {
        super(activity);
        this.d = themeEditorView;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x008e, code lost:
    
        if (r15.getFragmentStack().isEmpty() != false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0378 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x013c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.d5 d5Var;
        ArrayList<org.telegram.ui.ActionBar.k6> themeDescriptions;
        boolean z10;
        ArrayList arrayList;
        boolean z11;
        boolean z12;
        int i10;
        ThemeEditorView themeEditorView = this.d;
        int i11 = themeEditorView.e;
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
            if (motionEvent.getAction() == 1 && !this.c && themeEditorView.l == null) {
                LaunchActivity launchActivity = (LaunchActivity) themeEditorView.b;
                if (AndroidUtilities.isTablet()) {
                    d5Var = launchActivity.r0;
                    if (d5Var != null && d5Var.getFragmentStack().isEmpty()) {
                        d5Var = null;
                    }
                    if (d5Var == null) {
                        d5Var = launchActivity.s0;
                        if (d5Var != null) {
                        }
                    }
                    if (d5Var == null) {
                        d5Var = launchActivity.O();
                    }
                    if (d5Var != null) {
                        org.telegram.ui.ActionBar.n2 n2Var = !d5Var.getFragmentStack().isEmpty() ? (org.telegram.ui.ActionBar.n2) d5Var.getFragmentStack().get(d5Var.getFragmentStack().size() - 1) : null;
                        if (n2Var != null && (themeDescriptions = n2Var.getThemeDescriptions()) != null) {
                            ThemeEditorView.EditorAlert editorAlert = themeEditorView.new EditorAlert(themeEditorView.b, themeDescriptions);
                            themeEditorView.l = editorAlert;
                            editorAlert.setOnDismissListener(new ci.e1(i12));
                            themeEditorView.l.setOnDismissListener(new b1(this, 10));
                            themeEditorView.l.show();
                            if (themeEditorView.b != null) {
                                try {
                                    AnimatorSet animatorSet = new AnimatorSet();
                                    try {
                                        z10 = true;
                                        try {
                                            animatorSet.playTogether(ObjectAnimator.ofFloat(themeEditorView.a, (Property<d21, Float>) property, 1.0f, 0.0f), ObjectAnimator.ofFloat(themeEditorView.a, (Property<d21, Float>) View.SCALE_X, 1.0f, 0.0f), ObjectAnimator.ofFloat(themeEditorView.a, (Property<d21, Float>) View.SCALE_Y, 1.0f, 0.0f));
                                            animatorSet.setInterpolator(themeEditorView.i);
                                            animatorSet.setDuration(150L);
                                            animatorSet.addListener(new f21(themeEditorView, i13));
                                            animatorSet.start();
                                        } catch (Exception unused) {
                                        }
                                    } catch (Exception unused2) {
                                    }
                                } catch (Exception unused3) {
                                }
                                if (this.c) {
                                    float f7 = 1.0f;
                                    if (motionEvent.getAction() == 2) {
                                        float f10 = rawX - this.a;
                                        float f11 = rawY - this.b;
                                        WindowManager.LayoutParams layoutParams = themeEditorView.g;
                                        int i14 = (int) (layoutParams.x + f10);
                                        layoutParams.x = i14;
                                        layoutParams.y = (int) (layoutParams.y + f11);
                                        int i15 = i11 / 2;
                                        int i16 = -i15;
                                        if (i14 < i16) {
                                            layoutParams.x = i16;
                                        } else {
                                            int i17 = (AndroidUtilities.displaySize.x - layoutParams.width) + i15;
                                            if (i14 > i17) {
                                                layoutParams.x = i17;
                                            }
                                        }
                                        int i18 = layoutParams.x;
                                        if (i18 < 0) {
                                            f7 = a1.g.e(i18, i15, 0.5f, 1.0f);
                                        } else {
                                            if (i18 > AndroidUtilities.displaySize.x - layoutParams.width) {
                                                f7 = org.telegram.messenger.bi.b((i18 - r9) + r8, i15, 0.5f, 1.0f);
                                            }
                                        }
                                        if (themeEditorView.a.getAlpha() != f7) {
                                            themeEditorView.a.setAlpha(f7);
                                        }
                                        WindowManager.LayoutParams layoutParams2 = themeEditorView.g;
                                        int i19 = layoutParams2.y;
                                        if (i19 < 0) {
                                            layoutParams2.y = 0;
                                        } else {
                                            int i20 = AndroidUtilities.displaySize.y - layoutParams2.height;
                                            if (i19 > i20) {
                                                layoutParams2.y = i20;
                                            }
                                        }
                                        themeEditorView.h.updateViewLayout(themeEditorView.a, layoutParams2);
                                        this.a = rawX;
                                        this.b = rawY;
                                    } else {
                                        boolean z13 = z10;
                                        if (motionEvent.getAction() != z13) {
                                            return z13;
                                        }
                                        this.c = false;
                                        int b10 = ThemeEditorView.b(z13, 0, 0.0f, i11);
                                        int b11 = ThemeEditorView.b(z13, z13 ? 1 : 0, 0.0f, i11);
                                        int i21 = themeEditorView.f;
                                        int b12 = ThemeEditorView.b(false, 0, 0.0f, i21);
                                        int b13 = ThemeEditorView.b(false, z13 ? 1 : 0, 0.0f, i21);
                                        SharedPreferences.Editor edit = themeEditorView.j.edit();
                                        int dp = AndroidUtilities.dp(20.0f);
                                        if (Math.abs(b10 - themeEditorView.g.x) <= dp || ((i10 = themeEditorView.g.x) < 0 && i10 > (-i11) / 4)) {
                                            arrayList = new ArrayList();
                                            edit.putInt("sidex", 0);
                                            if (themeEditorView.a.getAlpha() != 1.0f) {
                                                arrayList.add(ObjectAnimator.ofFloat(themeEditorView.a, (Property<d21, Float>) property, 1.0f));
                                            }
                                            arrayList.add(ObjectAnimator.ofInt(themeEditorView, "x", b10));
                                        } else {
                                            if (Math.abs(b11 - i10) > dp) {
                                                int i22 = themeEditorView.g.x;
                                                int i23 = AndroidUtilities.displaySize.x;
                                                if (i22 <= i23 - i11 || i22 >= i23 - ((i11 / 4) * 3)) {
                                                    if (themeEditorView.a.getAlpha() != 1.0f) {
                                                        arrayList = new ArrayList();
                                                        if (themeEditorView.g.x < 0) {
                                                            arrayList.add(ObjectAnimator.ofInt(themeEditorView, "x", -i11));
                                                        } else {
                                                            arrayList.add(ObjectAnimator.ofInt(themeEditorView, "x", AndroidUtilities.displaySize.x));
                                                        }
                                                        z11 = true;
                                                    } else {
                                                        edit.putFloat("px", (themeEditorView.g.x - b10) / (b11 - b10));
                                                        edit.putInt("sidex", 2);
                                                        z11 = false;
                                                        arrayList = null;
                                                    }
                                                    if (!z11) {
                                                        if (Math.abs(b12 - themeEditorView.g.y) <= dp || themeEditorView.g.y <= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                                                            if (arrayList == null) {
                                                                arrayList = new ArrayList();
                                                            }
                                                            edit.putInt("sidey", 0);
                                                            arrayList.add(ObjectAnimator.ofInt(themeEditorView, "y", b12));
                                                        } else if (Math.abs(b13 - themeEditorView.g.y) <= dp) {
                                                            if (arrayList == null) {
                                                                arrayList = new ArrayList();
                                                            }
                                                            edit.putInt("sidey", 1);
                                                            arrayList.add(ObjectAnimator.ofInt(themeEditorView, "y", b13));
                                                        } else {
                                                            edit.putFloat("py", (themeEditorView.g.y - b12) / (b13 - b12));
                                                            edit.putInt("sidey", 2);
                                                        }
                                                        edit.commit();
                                                    }
                                                    if (arrayList != null) {
                                                        return true;
                                                    }
                                                    if (themeEditorView.i == null) {
                                                        themeEditorView.i = new DecelerateInterpolator();
                                                    }
                                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                                    animatorSet2.setInterpolator(themeEditorView.i);
                                                    animatorSet2.setDuration(150L);
                                                    if (z11) {
                                                        z12 = true;
                                                        arrayList.add(ObjectAnimator.ofFloat(themeEditorView.a, (Property<d21, Float>) property, 0.0f));
                                                        animatorSet2.addListener(new f21(themeEditorView, 1 == true ? 1 : 0));
                                                    } else {
                                                        z12 = true;
                                                    }
                                                    animatorSet2.playTogether(arrayList);
                                                    animatorSet2.start();
                                                    return z12;
                                                }
                                            }
                                            ArrayList arrayList2 = new ArrayList();
                                            edit.putInt("sidex", 1);
                                            if (themeEditorView.a.getAlpha() != 1.0f) {
                                                arrayList2.add(ObjectAnimator.ofFloat(themeEditorView.a, (Property<d21, Float>) property, 1.0f));
                                            }
                                            arrayList2.add(ObjectAnimator.ofInt(themeEditorView, "x", b11));
                                            arrayList = arrayList2;
                                        }
                                        z11 = false;
                                        if (!z11) {
                                        }
                                        if (arrayList != null) {
                                        }
                                    }
                                }
                                return z10;
                            }
                        }
                    }
                }
                d5Var = null;
                if (d5Var == null) {
                }
                if (d5Var != null) {
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
