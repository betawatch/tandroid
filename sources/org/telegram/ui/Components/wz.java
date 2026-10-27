package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class wz extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.ActionBar.u6 a;
    public int b;
    public final View c;
    public final FrameLayout d;
    public final w4.c e;
    public final h2 f;
    public final int h;
    public float n;
    public float r;
    public float s;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;

    public wz(Context context, s71 s71Var, org.telegram.ui.ActionBar.u6 u6Var, h2 h2Var) {
        super(context);
        int i10;
        this.y = -1;
        this.c = s71Var;
        this.f = h2Var;
        this.h = ViewConfiguration.get(context).getScaledTouchSlop();
        addView(s71Var, kb1.g(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        int dp = AndroidUtilities.dp(20.0f);
        int i11 = org.telegram.ui.ActionBar.y6.d6;
        ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(dp, org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i11);
        frameLayout.setBackground(c02);
        org.telegram.ui.ActionBar.f7.k(frameLayout, c02, N, null, u6Var);
        frameLayout.setElevation(AndroidUtilities.dp(4.0f));
        addView(frameLayout, kb1.i(40, 40, 49));
        w4.c cVar = new w4.c(context);
        this.e = cVar;
        float f7 = cVar.c.getDisplayMetrics().density;
        float f10 = 2.5f * f7;
        w4.b bVar = cVar.a;
        bVar.h = f10;
        bVar.b.setStrokeWidth(f10);
        bVar.q = 7.5f * f7;
        bVar.a(0);
        bVar.r = (int) (10.0f * f7);
        bVar.s = (int) (5.0f * f7);
        cVar.invalidateSelf();
        float dp2 = AndroidUtilities.dp(2.25f);
        bVar.h = dp2;
        bVar.b.setStrokeWidth(dp2);
        cVar.invalidateSelf();
        this.a = u6Var;
        int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, u6Var);
        this.b = w02;
        bVar.i = new int[]{w02};
        bVar.a(0);
        bVar.a(0);
        cVar.invalidateSelf();
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(cVar);
        frameLayout.addView(imageView, kb1.i(32, 32, 17));
        frameLayout.setImportantForAccessibility(2);
        String string = LocaleController.getString(R.string.Refresh);
        p1 p1Var = new p1(21, this, h2Var);
        ArrayList e = r0.i0.e(s71Var);
        int i12 = 0;
        while (true) {
            if (i12 >= e.size()) {
                int i13 = -1;
                int i14 = 0;
                while (true) {
                    int[] iArr = r0.i0.d;
                    if (i14 >= 32 || i13 != -1) {
                        break;
                    }
                    int i15 = iArr[i14];
                    boolean z10 = true;
                    for (int i16 = 0; i16 < e.size(); i16++) {
                        z10 &= ((s0.c) e.get(i16)).a() != i15;
                    }
                    if (z10) {
                        i13 = i15;
                    }
                    i14++;
                }
                i10 = i13;
            } else {
                if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((s0.c) e.get(i12)).a).getLabel())) {
                    i10 = ((s0.c) e.get(i12)).a();
                    break;
                }
                i12++;
            }
        }
        if (i10 != -1) {
            s0.c cVar2 = new s0.c(null, i10, string, p1Var, null);
            View.AccessibilityDelegate d = r0.i0.d(s71Var);
            r0.b bVar2 = d != null ? d instanceof r0.a ? ((r0.a) d).a : new r0.b(d) : null;
            r0.i0.k(s71Var, bVar2 == null ? new r0.b() : bVar2);
            int a2 = cVar2.a();
            ArrayList e10 = r0.i0.e(s71Var);
            int i17 = 0;
            while (true) {
                if (i17 >= e10.size()) {
                    break;
                }
                if (((s0.c) e10.get(i17)).a() == a2) {
                    e10.remove(i17);
                    break;
                }
                i17++;
            }
            r0.i0.e(s71Var).add(cVar2);
            r0.i0.g(0, s71Var);
        }
        b();
    }

    public final void a(boolean z10) {
        this.v = false;
        this.w = false;
        this.y = -1;
        getParent().requestDisallowInterceptTouchEvent(false);
        if (!z10) {
            setRefreshing(false);
        } else {
            setRefreshing(true);
            this.f.run();
        }
    }

    public final void b() {
        FrameLayout frameLayout = this.d;
        frameLayout.setVisibility(4);
        frameLayout.setTranslationY(-AndroidUtilities.dp(48.0f));
        frameLayout.setAlpha(0.0f);
        this.e.stop();
        this.s = 0.0f;
        this.c.setTranslationY(0.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.x) {
            w4.c cVar = this.e;
            if (cVar.d.isRunning()) {
                return;
            }
            cVar.start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.e.stop();
        this.d.animate().cancel();
        this.c.animate().cancel();
        this.v = false;
        this.w = false;
        this.y = -1;
        if (!this.x) {
            b();
        }
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0011, code lost:
    
        if (r0 != 3) goto L36;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        View view = this.c;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.y);
                    if (this.v && findPointerIndex >= 0) {
                        float x9 = motionEvent.getX(findPointerIndex) - this.n;
                        float y3 = motionEvent.getY(findPointerIndex) - this.r;
                        float abs = Math.abs(x9);
                        float f7 = this.h;
                        if ((abs > f7 && Math.abs(x9) > Math.abs(y3)) || y3 < (-r6)) {
                            this.v = false;
                        } else if (y3 > f7 && y3 > Math.abs(x9) && !view.canScrollVertically(-1)) {
                            this.w = true;
                            getParent().requestDisallowInterceptTouchEvent(true);
                            return true;
                        }
                    }
                }
            }
            this.v = false;
            this.y = -1;
        } else {
            this.y = motionEvent.getPointerId(0);
            this.n = motionEvent.getX();
            this.r = motionEvent.getY();
            this.v = (this.x || view.canScrollVertically(-1)) ? false : true;
            this.w = false;
        }
        return this.w;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.w) {
            return super.onTouchEvent(motionEvent);
        }
        int findPointerIndex = motionEvent.findPointerIndex(this.y);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            a(this.s >= ((float) AndroidUtilities.dp(72.0f)));
            return true;
        }
        if (actionMasked != 2) {
            if (actionMasked != 3 && actionMasked != 5 && actionMasked != 6) {
                return true;
            }
            a(false);
            return true;
        }
        if (findPointerIndex < 0) {
            a(false);
            return true;
        }
        this.s = Math.min(AndroidUtilities.dp(112.0f), Math.max(0.0f, ((motionEvent.getY(findPointerIndex) - this.r) - this.h) * 0.5f));
        FrameLayout frameLayout = this.d;
        frameLayout.animate().cancel();
        frameLayout.setVisibility(0);
        frameLayout.setAlpha(Math.min(1.0f, this.s / AndroidUtilities.dp(48.0f)));
        frameLayout.setTranslationY((this.s - AndroidUtilities.dp(40.0f)) / 2.0f);
        View view = this.c;
        view.animate().cancel();
        view.setTranslationY(this.s);
        float max = (Math.max(Math.min(1.0f, this.s / AndroidUtilities.dp(72.0f)) - 0.4f, 0.0f) * 5.0f) / 3.0f;
        w4.c cVar = this.e;
        w4.b bVar = cVar.a;
        w4.b bVar2 = cVar.a;
        if (!bVar.n) {
            bVar.n = true;
        }
        cVar.invalidateSelf();
        if (max != bVar2.p) {
            bVar2.p = max;
        }
        cVar.invalidateSelf();
        bVar2.e = 0.0f;
        bVar2.f = 0.8f * max;
        cVar.invalidateSelf();
        bVar2.g = org.telegram.ui.d3.e(max, 0.4f, -0.25f, 0.5f, Math.max(0.0f, this.s - AndroidUtilities.dp(72.0f)) / AndroidUtilities.dp(80.0f));
        cVar.invalidateSelf();
        return true;
    }

    public void setRefreshing(boolean z10) {
        boolean z11 = this.x;
        this.x = z10;
        FrameLayout frameLayout = this.d;
        frameLayout.animate().cancel();
        View view = this.c;
        view.animate().cancel();
        if (!z10) {
            view.animate().translationY(0.0f).setDuration(180L).start();
            frameLayout.animate().translationY(-AndroidUtilities.dp(20.0f)).alpha(0.0f).setDuration(180L).withEndAction(new cp(this, 19)).start();
            return;
        }
        frameLayout.setVisibility(0);
        if (!z11) {
            this.e.start();
        }
        frameLayout.animate().translationY(AndroidUtilities.dp(16.0f)).alpha(1.0f).setDuration(180L).start();
        view.animate().translationY(AndroidUtilities.dp(72.0f)).setDuration(180L).start();
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        w4.c cVar = this.e;
        if (cVar != null) {
            try {
                int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, this.a);
                if (w02 != this.b) {
                    this.b = w02;
                    w4.b bVar = cVar.a;
                    bVar.i = new int[]{w02};
                    bVar.a(0);
                    bVar.a(0);
                    cVar.invalidateSelf();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
