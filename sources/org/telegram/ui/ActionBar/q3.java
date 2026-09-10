package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.wr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eo;
import org.telegram.ui.ok;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class q3 extends FrameLayout {
    public static final HashMap K = new HashMap();
    public static final HashMap L = new HashMap();
    public static TextPaint M;
    public final RectF E;
    public ValueAnimator F;
    public float G;
    public int H;
    public final HashSet I;
    public final HashSet J;
    public final Paint a;
    public boolean b;
    public boolean c;
    public final ActionBarLayout d;
    public final o3 e;
    public int f;
    public final org.telegram.ui.Components.g5 h;
    public int n;
    public final org.telegram.ui.Components.g5 r;
    public boolean s;
    public final org.telegram.ui.Components.d6 v;
    public int w;
    public boolean x;
    public boolean y;

    public q3(Context context, ActionBarLayout actionBarLayout) {
        super(context);
        this.a = new Paint(1);
        this.b = true;
        this.c = false;
        wr wrVar = wr.h;
        this.h = new org.telegram.ui.Components.g5(this, 200L, wrVar, 0);
        this.r = new org.telegram.ui.Components.g5(this, 200L, wrVar, 0);
        this.v = new org.telegram.ui.Components.d6(this, 0L, 200L, wrVar);
        this.w = UserConfig.selectedAccount;
        this.E = new RectF();
        this.I = new HashSet();
        this.J = new HashSet();
        this.d = actionBarLayout;
        setNavigationBarColor(j6.w0(null, j6.a7, false));
        o3 o3Var = new o3(this, this);
        this.e = o3Var;
        r0.i0.k(this, o3Var);
        n();
        o(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static TextPaint getTextPaint() {
        if (M == null) {
            TextPaint textPaint = new TextPaint(1);
            M = textPaint;
            textPaint.setTypeface(AndroidUtilities.bold());
            M.setTextSize(AndroidUtilities.dp(17.0f));
        }
        return M;
    }

    public static String p(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(35);
        return indexOf >= 0 ? str.substring(0, indexOf + 1) : str;
    }

    public final void b() {
        ValueAnimator valueAnimator;
        ArrayList<p3> tabs = getTabs();
        int size = tabs.size();
        if (size == 0) {
            return;
        }
        p3 p3Var = (p3) hc.b.i(1, tabs);
        LaunchActivity launchActivity = LaunchActivity.G1;
        z3 z3Var = launchActivity == null ? null : launchActivity.y0;
        if (z3Var != null && (valueAnimator = z3Var.d) != null) {
            valueAnimator.cancel();
            z3Var.d = null;
        }
        if (size == 1 || z3Var == null) {
            e(p3Var);
        } else {
            z3Var.f();
        }
    }

    public final n3 c(p3 p3Var) {
        ArrayList<n3> tabDrawables = getTabDrawables();
        for (int i10 = 0; i10 < tabDrawables.size(); i10++) {
            if (tabDrawables.get(i10).a == p3Var) {
                return tabDrawables.get(i10);
            }
        }
        return null;
    }

    public final void d(RectF rectF, float f7) {
        rectF.set(AndroidUtilities.dp(4.0f), (getHeight() - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(50.0f), getWidth() - AndroidUtilities.dp(4.0f), getHeight() - AndroidUtilities.dp(4.0f));
        rectF.offset(0.0f, (-AndroidUtilities.dp(8.0f)) * f7);
        float lerp = AndroidUtilities.lerp(1.0f, 0.95f, Math.abs(f7));
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        float width = rectF.width();
        float height = rectF.height();
        float f10 = (width / 2.0f) * lerp;
        rectF.left = centerX - f10;
        rectF.right = centerX + f10;
        float f11 = (height / 2.0f) * lerp;
        rectF.top = centerY - f11;
        rectF.bottom = centerY + f11;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        getTabs();
        ArrayList<n3> tabDrawables = getTabDrawables();
        if (this.G <= 0.0f) {
            return;
        }
        this.a.setColor(this.h.a(this.f, false));
        super.dispatchDraw(canvas);
        int a2 = this.r.a(this.n, false);
        float e = this.v.e(this.s);
        if (this.b) {
            int i10 = 0;
            while (i10 < tabDrawables.size()) {
                n3 n3Var = tabDrawables.get(i10);
                float c10 = n3Var.c();
                float b10 = n3Var.b();
                if (b10 > 0.0f && c10 <= 1.99f) {
                    RectF rectF = this.E;
                    d(rectF, c10);
                    n3Var.v = 0.0f;
                    boolean z10 = e > 0.5f;
                    n3Var.l = a2;
                    n3Var.n = z10;
                    canvas2 = canvas;
                    n3Var.a(canvas2, rectF, AndroidUtilities.dp(18.0f), b10, 1.0f);
                } else {
                    canvas2 = canvas;
                }
                i10++;
                canvas = canvas2;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        o3 o3Var;
        if (!this.b || getTabs().isEmpty() || (o3Var = this.e) == null || !o3Var.f(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    public final void e(p3 p3Var) {
        eo eoVar;
        ok okVar;
        p2 R = LaunchActivity.R();
        if (R == null || R.getParentActivity() == null) {
            return;
        }
        boolean z10 = R instanceof eo;
        if (z10 && (okVar = (eoVar = (eo) R).Y) != null) {
            okVar.P();
            eoVar.Y.n0(true, false, true);
        }
        if (p3Var.J == null) {
            new bi.y2(23, this, p3Var).run(R);
            if (p3Var.C) {
                if (z10 && ((eo) R).a() == p3Var.a.c) {
                    return;
                }
                this.c = true;
                AndroidUtilities.runOnUIThread(new gg.a0(this, R, eo.R9(p3Var.a.c), 23), 220L);
                return;
            }
            return;
        }
        p2 sheetFragment = this.d.getSheetFragment();
        org.telegram.ui.j4 j4Var = p3Var.J;
        org.telegram.ui.w3 w3Var = j4Var.K;
        k3.b(w3Var);
        sheetFragment.addSheet(w3Var);
        org.telegram.ui.v3 v3Var = w3Var.c;
        w3Var.h = false;
        w3Var.n = false;
        ValueAnimator valueAnimator = w3Var.y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = w3Var.E;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        w3Var.x = 0.0f;
        w3Var.w = 0.0f;
        w3Var.h();
        w3Var.n();
        v3Var.invalidate();
        v3Var.requestLayout();
        j4Var.Y(sheetFragment.getParentActivity(), sheetFragment);
        w3Var.g(sheetFragment);
        w3Var.f();
        h(this.w, p3Var, false);
    }

    public final void f() {
        ArrayList<p3> tabs = getTabs();
        ArrayList<n3> tabDrawables = getTabDrawables();
        for (int i10 = 0; i10 < tabs.size(); i10++) {
            tabs.get(i10).a();
        }
        tabs.clear();
        for (int i11 = 0; i11 < tabDrawables.size(); i11++) {
            tabDrawables.get(i11).c = -1;
        }
        n();
        o(true);
        invalidate();
        tabs.isEmpty();
    }

    public final void g(p3 p3Var, Utilities.Callback callback) {
        if (p3Var == null) {
            callback.run(Boolean.TRUE);
            return;
        }
        if (!p3Var.y) {
            h(this.w, p3Var, true);
            callback.run(Boolean.TRUE);
            return;
        }
        TLRPC.User user = MessagesController.getInstance(p3Var.a.a).getUser(Long.valueOf(p3Var.a.c));
        String formatName = user != null ? ContactsController.formatName(user.first_name, user.last_name) : null;
        boolean[] zArr = {false};
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        d2 d2Var = alertDialog$Builder.a;
        d2Var.R = formatName;
        d2Var.T = LocaleController.getString(R.string.BotWebViewChangesMayNotBeSaved);
        alertDialog$Builder.k(LocaleController.getString(R.string.BotWebViewCloseAnyway), new f1.a(this, zArr, p3Var, callback, r8));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new androidx.car.app.utils.a(zArr, callback, r8, 14));
        d2[] d2VarArr = {d2Var};
        d2Var.setOnDismissListener(new m3(zArr, callback));
        d2VarArr[0].show();
        ((TextView) d2VarArr[0].d(-1)).setTextColor(j6.w0(null, j6.q7, false));
    }

    public Paint getBackgroundPaint() {
        return this.a;
    }

    public int getExpandedHeight() {
        int size = getTabs().size();
        if (size == 0) {
            return 0;
        }
        return size == 1 ? AndroidUtilities.dp(60.0f) : AndroidUtilities.dp(68.0f);
    }

    public ArrayList<n3> getTabDrawables() {
        int i10 = this.w;
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = L;
        ArrayList<n3> arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList != null) {
            return arrayList;
        }
        Integer valueOf2 = Integer.valueOf(i10);
        ArrayList<n3> arrayList2 = new ArrayList<>();
        hashMap.put(valueOf2, arrayList2);
        return arrayList2;
    }

    public ArrayList<p3> getTabs() {
        int i10 = this.w;
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = K;
        ArrayList<p3> arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList != null) {
            return arrayList;
        }
        Integer valueOf2 = Integer.valueOf(i10);
        ArrayList<p3> arrayList2 = new ArrayList<>();
        hashMap.put(valueOf2, arrayList2);
        return arrayList2;
    }

    public final boolean h(int i10, p3 p3Var, boolean z10) {
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = K;
        ArrayList arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(i10);
            ArrayList arrayList2 = new ArrayList();
            hashMap.put(valueOf2, arrayList2);
            arrayList = arrayList2;
        }
        Integer valueOf3 = Integer.valueOf(i10);
        HashMap hashMap2 = L;
        ArrayList arrayList3 = (ArrayList) hashMap2.get(valueOf3);
        if (arrayList3 == null) {
            Integer valueOf4 = Integer.valueOf(i10);
            arrayList3 = new ArrayList();
            hashMap2.put(valueOf4, arrayList3);
        }
        arrayList.remove(p3Var);
        if (z10) {
            p3Var.a();
        }
        for (int i11 = 0; i11 < arrayList3.size(); i11++) {
            n3 n3Var = (n3) arrayList3.get(i11);
            int indexOf = arrayList.indexOf(n3Var.a);
            n3Var.c = indexOf;
            if (indexOf >= 0) {
                n3Var.b = indexOf;
            }
        }
        n();
        AndroidUtilities.runOnUIThread(new gg.a0(this, arrayList3, p3Var, 24), 320L);
        o(true);
        invalidate();
        o3 o3Var = this.e;
        if (o3Var != null) {
            o3Var.i();
        }
        return arrayList.isEmpty();
    }

    public final void i(int i10, boolean z10) {
        if (i10 != this.f) {
            ActionBarLayout actionBarLayout = this.d;
            if (!actionBarLayout.Q || actionBarLayout.T) {
                z10 = false;
            }
            this.f = i10;
            int v = j6.v(i10, j6.l1((AndroidUtilities.computePerceivedBrightness(i10) > 0.721f ? 1 : (AndroidUtilities.computePerceivedBrightness(i10) == 0.721f ? 0 : -1)) < 0 ? 0.08f : 0.75f, -1));
            this.n = v;
            this.s = AndroidUtilities.computePerceivedBrightness(v) < 0.721f;
            if (!z10) {
                this.h.a(this.f, true);
                this.r.a(this.n, true);
                this.v.f(this.s, true);
            }
            invalidate();
        }
    }

    public final boolean j(float f7, float f10, int i10) {
        ArrayList<p3> tabs = getTabs();
        ArrayList<n3> tabDrawables = getTabDrawables();
        if (this.b) {
            p3 p3Var = tabs.isEmpty() ? null : tabs.get(0);
            n3 c10 = c(p3Var);
            if (c10 != null) {
                org.telegram.ui.Cells.z zVar = c10.k;
                float c11 = c10.c();
                RectF rectF = this.E;
                d(rectF, c11);
                if (i10 == 0 || i10 == 2) {
                    boolean contains = zVar.getBounds().contains((int) (f7 - rectF.left), (int) (f10 - rectF.centerY()));
                    this.x = contains;
                    this.y = !contains && rectF.contains(f7, f10);
                    zVar.setState(this.x ? new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled} : new int[0]);
                } else if (i10 == 1 || i10 == 3) {
                    if (this.y && i10 == 1) {
                        b();
                    } else if (this.x && i10 == 1) {
                        g(p3Var, new l3(0));
                    }
                    this.x = false;
                    this.y = false;
                    zVar.setState(new int[0]);
                }
                for (int i11 = 0; i11 < tabDrawables.size(); i11++) {
                    if (tabDrawables.get(i11) != c10) {
                        tabDrawables.get(i11).k.setState(new int[0]);
                    }
                }
            } else {
                this.y = false;
                this.x = false;
            }
        } else {
            this.y = false;
            this.x = false;
        }
        return this.y || this.x;
    }

    public final p3 k(di.j5 j5Var) {
        Integer valueOf = Integer.valueOf(this.w);
        HashMap hashMap = K;
        ArrayList arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(this.w);
            ArrayList arrayList2 = new ArrayList();
            hashMap.put(valueOf2, arrayList2);
            arrayList = arrayList2;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            p3 p3Var = (p3) arrayList.get(i10);
            if (j5Var.equals(p3Var.a)) {
                e(p3Var);
                return p3Var;
            }
        }
        return null;
    }

    public final p3 l(MessageObject messageObject) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        if (messageObject == null || (message = messageObject.messageOwner) == null || (messageMedia = message.media) == null || (webPage = messageMedia.webpage) == null) {
            return null;
        }
        return m(webPage);
    }

    public final p3 m(TLRPC.WebPage webPage) {
        if (webPage == null) {
            return null;
        }
        ArrayList<p3> tabs = getTabs();
        for (int i10 = 0; i10 < tabs.size(); i10++) {
            p3 p3Var = tabs.get(i10);
            org.telegram.ui.j4 j4Var = p3Var.J;
            if (j4Var != null && !j4Var.d0.isEmpty()) {
                Object i11 = hc.b.i(1, p3Var.J.d0);
                if ((i11 instanceof TLRPC.WebPage) && ((TLRPC.WebPage) i11).id == webPage.id) {
                    e(p3Var);
                    return p3Var;
                }
            }
        }
        return null;
    }

    public final void n() {
        CharSequence replaceEmoji;
        ArrayList<p3> tabs = getTabs();
        ArrayList<n3> tabDrawables = getTabDrawables();
        CharSequence charSequence = null;
        for (int i10 = 0; i10 < tabDrawables.size(); i10++) {
            n3 n3Var = tabDrawables.get(i10);
            if (tabs.size() <= 1 || n3Var.b != 0) {
                replaceEmoji = Emoji.replaceEmoji(n3Var.a.b(), getTextPaint().getFontMetricsInt(), false);
                n3Var.u = null;
            } else {
                replaceEmoji = Emoji.replaceEmoji(LocaleController.formatPluralString("BotMoreTabs", tabs.size() - 1, n3Var.a.b()), getTextPaint().getFontMetricsInt(), false);
                if (replaceEmoji == null) {
                    n3Var.u = null;
                } else {
                    n3Var.u = new t01(replaceEmoji, 17.0f, AndroidUtilities.bold());
                }
            }
            charSequence = replaceEmoji;
        }
        if (tabs.isEmpty()) {
            setImportantForAccessibility(2);
            setContentDescription(LocaleController.formatString(R.string.AccDescrTabs, ""));
            return;
        }
        setImportantForAccessibility(1);
        int i11 = R.string.AccDescrTabs;
        if (charSequence == null) {
            charSequence = "";
        }
        setContentDescription(LocaleController.formatString(i11, charSequence));
    }

    public final void o(boolean z10) {
        if (this.H == getExpandedHeight()) {
            return;
        }
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            this.F = null;
            valueAnimator.cancel();
        }
        this.H = getExpandedHeight();
        Iterator it = this.J.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        if (z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.G, this.H);
            this.F = ofFloat;
            ofFloat.addUpdateListener(new x0(this, 4));
            this.F.addListener(new h(this, 3));
            this.F.setDuration(250L);
            this.F.setInterpolator(r1.w);
            this.F.start();
        } else {
            this.G = this.H;
            invalidate();
        }
        Object parent = getParent();
        if (parent instanceof View) {
            WeakHashMap weakHashMap = r0.i0.a;
            r0.y.c((View) parent);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return j(motionEvent.getX(), motionEvent.getY(), motionEvent.getAction()) || super.onTouchEvent(motionEvent);
    }

    public void setCurrentAccount(int i10) {
        if (this.w != i10) {
            this.w = i10;
            o(false);
            invalidate();
        }
    }

    public void setNavigationBarColor(int i10) {
        i(i10, true);
    }

    public void setupTab(n3 n3Var) {
        int a2 = this.r.a(this.n, false);
        float e = this.v.e(this.s);
        n3Var.v = 0.0f;
        boolean z10 = e > 0.5f;
        n3Var.l = a2;
        n3Var.n = z10;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        super.verifyDrawable(drawable);
        return true;
    }
}
