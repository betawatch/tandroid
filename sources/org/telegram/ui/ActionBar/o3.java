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
import mh.g7;
import mh.p6;
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
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.pr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.jk;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class o3 extends FrameLayout {
    public static final HashMap H = new HashMap();
    public static final HashMap I = new HashMap();
    public static TextPaint J;
    public final RectF B;
    public ValueAnimator C;
    public float D;
    public int E;
    public final HashSet F;
    public final HashSet G;
    public final Paint a;
    public boolean b;
    public boolean c;
    public final ActionBarLayout d;
    public final m3 e;
    public int f;
    public final org.telegram.ui.Components.c5 h;
    public int n;
    public final org.telegram.ui.Components.c5 r;
    public boolean s;
    public final org.telegram.ui.Components.z5 v;
    public int w;
    public boolean x;
    public boolean y;

    public o3(Context context, ActionBarLayout actionBarLayout) {
        super(context);
        this.a = new Paint(1);
        this.b = true;
        this.c = false;
        pr prVar = pr.h;
        this.h = new org.telegram.ui.Components.c5(this, 200L, prVar, 0);
        this.r = new org.telegram.ui.Components.c5(this, 200L, prVar, 0);
        this.v = new org.telegram.ui.Components.z5(this, 0L, 200L, prVar);
        this.w = UserConfig.selectedAccount;
        this.B = new RectF();
        this.F = new HashSet();
        this.G = new HashSet();
        this.d = actionBarLayout;
        setNavigationBarColor(k6.w0(null, k6.a7, false));
        m3 m3Var = new m3(this, this);
        this.e = m3Var;
        r0.j0.k(this, m3Var);
        n();
        o(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static TextPaint getTextPaint() {
        if (J == null) {
            TextPaint textPaint = new TextPaint(1);
            J = textPaint;
            textPaint.setTypeface(AndroidUtilities.bold());
            J.setTextSize(AndroidUtilities.dp(17.0f));
        }
        return J;
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
        ArrayList<n3> tabs = getTabs();
        int size = tabs.size();
        if (size == 0) {
            return;
        }
        n3 n3Var = (n3) l.d.i(1, tabs);
        LaunchActivity launchActivity = LaunchActivity.D1;
        x3 x3Var = launchActivity == null ? null : launchActivity.v0;
        if (x3Var != null && (valueAnimator = x3Var.d) != null) {
            valueAnimator.cancel();
            x3Var.d = null;
        }
        if (size == 1 || x3Var == null) {
            e(n3Var);
        } else {
            x3Var.f();
        }
    }

    public final l3 c(n3 n3Var) {
        ArrayList<l3> tabDrawables = getTabDrawables();
        for (int i10 = 0; i10 < tabDrawables.size(); i10++) {
            if (tabDrawables.get(i10).a == n3Var) {
                return tabDrawables.get(i10);
            }
        }
        return null;
    }

    public final void d(RectF rectF, float f10) {
        rectF.set(AndroidUtilities.dp(4.0f), (getHeight() - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(50.0f), getWidth() - AndroidUtilities.dp(4.0f), getHeight() - AndroidUtilities.dp(4.0f));
        rectF.offset(0.0f, (-AndroidUtilities.dp(8.0f)) * f10);
        float lerp = AndroidUtilities.lerp(1.0f, 0.95f, Math.abs(f10));
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        float width = rectF.width();
        float height = rectF.height();
        float f11 = (width / 2.0f) * lerp;
        rectF.left = centerX - f11;
        rectF.right = centerX + f11;
        float f12 = (height / 2.0f) * lerp;
        rectF.top = centerY - f12;
        rectF.bottom = centerY + f12;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        getTabs();
        ArrayList<l3> tabDrawables = getTabDrawables();
        if (this.D <= 0.0f) {
            return;
        }
        this.a.setColor(this.h.a(this.f, false));
        super.dispatchDraw(canvas);
        int a2 = this.r.a(this.n, false);
        float e6 = this.v.e(this.s);
        if (this.b) {
            int i10 = 0;
            while (i10 < tabDrawables.size()) {
                l3 l3Var = tabDrawables.get(i10);
                float c3 = l3Var.c();
                float b10 = l3Var.b();
                if (b10 > 0.0f && c3 <= 1.99f) {
                    RectF rectF = this.B;
                    d(rectF, c3);
                    l3Var.v = 0.0f;
                    boolean z4 = e6 > 0.5f;
                    l3Var.l = a2;
                    l3Var.n = z4;
                    canvas2 = canvas;
                    l3Var.a(canvas2, rectF, AndroidUtilities.dp(18.0f), b10, 1.0f);
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
        m3 m3Var;
        if (!this.b || getTabs().isEmpty() || (m3Var = this.e) == null || !m3Var.f(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    public final void e(n3 n3Var) {
        xn xnVar;
        jk jkVar;
        p2 R = LaunchActivity.R();
        if (R == null || R.getParentActivity() == null) {
            return;
        }
        boolean z4 = R instanceof xn;
        if (z4 && (jkVar = (xnVar = (xn) R).V) != null) {
            jkVar.P();
            xnVar.V.n0(true, false, true);
        }
        if (n3Var.H == null) {
            new lh.a1(10, this, n3Var).run(R);
            if (n3Var.A) {
                if (z4 && ((xn) R).a() == n3Var.a.c) {
                    return;
                }
                this.c = true;
                AndroidUtilities.runOnUIThread(new p6(this, R, xn.R9(n3Var.a.c), 18), 220L);
                return;
            }
            return;
        }
        p2 sheetFragment = this.d.getSheetFragment();
        org.telegram.ui.l4 l4Var = n3Var.H;
        org.telegram.ui.y3 y3Var = l4Var.H;
        k3.b(y3Var);
        sheetFragment.addSheet(y3Var);
        org.telegram.ui.x3 x3Var = y3Var.c;
        y3Var.h = false;
        y3Var.n = false;
        ValueAnimator valueAnimator = y3Var.y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = y3Var.B;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        y3Var.x = 0.0f;
        y3Var.w = 0.0f;
        y3Var.h();
        y3Var.n();
        x3Var.invalidate();
        x3Var.requestLayout();
        l4Var.Y(sheetFragment.getParentActivity(), sheetFragment);
        y3Var.g(sheetFragment);
        y3Var.f();
        h(this.w, n3Var, false);
    }

    public final void f() {
        ArrayList<n3> tabs = getTabs();
        ArrayList<l3> tabDrawables = getTabDrawables();
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

    public final void g(n3 n3Var, Utilities.Callback callback) {
        if (n3Var == null) {
            callback.run(Boolean.TRUE);
            return;
        }
        if (!n3Var.w) {
            h(this.w, n3Var, true);
            callback.run(Boolean.TRUE);
            return;
        }
        TLRPC.User user = MessagesController.getInstance(n3Var.a.a).getUser(Long.valueOf(n3Var.a.c));
        String formatName = user != null ? ContactsController.formatName(user.first_name, user.last_name) : null;
        boolean[] zArr = {false};
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        d2 d2Var = alertDialog$Builder.a;
        d2Var.O = formatName;
        d2Var.Q = LocaleController.getString(R.string.BotWebViewChangesMayNotBeSaved);
        alertDialog$Builder.k(LocaleController.getString(R.string.BotWebViewCloseAnyway), new f1.a(this, zArr, n3Var, callback, r8));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new androidx.car.app.utils.a(zArr, callback, r8, 11));
        d2[] d2VarArr = {d2Var};
        d2Var.setOnDismissListener(new g7(zArr, callback));
        d2VarArr[0].show();
        ((TextView) d2VarArr[0].d(-1)).setTextColor(k6.w0(null, k6.q7, false));
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

    public ArrayList<l3> getTabDrawables() {
        int i10 = this.w;
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = I;
        ArrayList<l3> arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList != null) {
            return arrayList;
        }
        Integer valueOf2 = Integer.valueOf(i10);
        ArrayList<l3> arrayList2 = new ArrayList<>();
        hashMap.put(valueOf2, arrayList2);
        return arrayList2;
    }

    public ArrayList<n3> getTabs() {
        int i10 = this.w;
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = H;
        ArrayList<n3> arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList != null) {
            return arrayList;
        }
        Integer valueOf2 = Integer.valueOf(i10);
        ArrayList<n3> arrayList2 = new ArrayList<>();
        hashMap.put(valueOf2, arrayList2);
        return arrayList2;
    }

    public final boolean h(int i10, n3 n3Var, boolean z4) {
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = H;
        ArrayList arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(i10);
            ArrayList arrayList2 = new ArrayList();
            hashMap.put(valueOf2, arrayList2);
            arrayList = arrayList2;
        }
        Integer valueOf3 = Integer.valueOf(i10);
        HashMap hashMap2 = I;
        ArrayList arrayList3 = (ArrayList) hashMap2.get(valueOf3);
        if (arrayList3 == null) {
            Integer valueOf4 = Integer.valueOf(i10);
            arrayList3 = new ArrayList();
            hashMap2.put(valueOf4, arrayList3);
        }
        arrayList.remove(n3Var);
        if (z4) {
            n3Var.a();
        }
        for (int i11 = 0; i11 < arrayList3.size(); i11++) {
            l3 l3Var = (l3) arrayList3.get(i11);
            int indexOf = arrayList.indexOf(l3Var.a);
            l3Var.c = indexOf;
            if (indexOf >= 0) {
                l3Var.b = indexOf;
            }
        }
        n();
        AndroidUtilities.runOnUIThread(new p6(this, arrayList3, n3Var, 19), 320L);
        o(true);
        invalidate();
        m3 m3Var = this.e;
        if (m3Var != null) {
            m3Var.i();
        }
        return arrayList.isEmpty();
    }

    public final void i(int i10, boolean z4) {
        if (i10 != this.f) {
            ActionBarLayout actionBarLayout = this.d;
            if (!actionBarLayout.N || actionBarLayout.Q) {
                z4 = false;
            }
            this.f = i10;
            int v = k6.v(i10, k6.l1((AndroidUtilities.computePerceivedBrightness(i10) > 0.721f ? 1 : (AndroidUtilities.computePerceivedBrightness(i10) == 0.721f ? 0 : -1)) < 0 ? 0.08f : 0.75f, -1));
            this.n = v;
            this.s = AndroidUtilities.computePerceivedBrightness(v) < 0.721f;
            if (!z4) {
                this.h.a(this.f, true);
                this.r.a(this.n, true);
                this.v.f(this.s, true);
            }
            invalidate();
        }
    }

    public final boolean j(float f10, float f11, int i10) {
        ArrayList<n3> tabs = getTabs();
        ArrayList<l3> tabDrawables = getTabDrawables();
        if (this.b) {
            n3 n3Var = tabs.isEmpty() ? null : tabs.get(0);
            l3 c3 = c(n3Var);
            if (c3 != null) {
                org.telegram.ui.Cells.z zVar = c3.k;
                float c10 = c3.c();
                RectF rectF = this.B;
                d(rectF, c10);
                if (i10 == 0 || i10 == 2) {
                    boolean contains = zVar.getBounds().contains((int) (f10 - rectF.left), (int) (f11 - rectF.centerY()));
                    this.x = contains;
                    this.y = !contains && rectF.contains(f10, f11);
                    zVar.setState(this.x ? new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled} : new int[0]);
                } else if (i10 == 1 || i10 == 3) {
                    if (this.y && i10 == 1) {
                        b();
                    } else if (this.x && i10 == 1) {
                        g(n3Var, new hg.h(1));
                    }
                    this.x = false;
                    this.y = false;
                    zVar.setState(new int[0]);
                }
                for (int i11 = 0; i11 < tabDrawables.size(); i11++) {
                    if (tabDrawables.get(i11) != c3) {
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

    public final n3 k(MessageObject messageObject) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        if (messageObject == null || (message = messageObject.messageOwner) == null || (messageMedia = message.media) == null || (webPage = messageMedia.webpage) == null) {
            return null;
        }
        return l(webPage);
    }

    public final n3 l(TLRPC.WebPage webPage) {
        if (webPage == null) {
            return null;
        }
        ArrayList<n3> tabs = getTabs();
        for (int i10 = 0; i10 < tabs.size(); i10++) {
            n3 n3Var = tabs.get(i10);
            org.telegram.ui.l4 l4Var = n3Var.H;
            if (l4Var != null && !l4Var.a0.isEmpty()) {
                Object i11 = l.d.i(1, n3Var.H.a0);
                if ((i11 instanceof TLRPC.WebPage) && ((TLRPC.WebPage) i11).id == webPage.id) {
                    e(n3Var);
                    return n3Var;
                }
            }
        }
        return null;
    }

    public final n3 m(sh.y3 y3Var) {
        Integer valueOf = Integer.valueOf(this.w);
        HashMap hashMap = H;
        ArrayList arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(this.w);
            ArrayList arrayList2 = new ArrayList();
            hashMap.put(valueOf2, arrayList2);
            arrayList = arrayList2;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            n3 n3Var = (n3) arrayList.get(i10);
            if (y3Var.equals(n3Var.a)) {
                e(n3Var);
                return n3Var;
            }
        }
        return null;
    }

    public final void n() {
        CharSequence replaceEmoji;
        ArrayList<n3> tabs = getTabs();
        ArrayList<l3> tabDrawables = getTabDrawables();
        CharSequence charSequence = null;
        for (int i10 = 0; i10 < tabDrawables.size(); i10++) {
            l3 l3Var = tabDrawables.get(i10);
            if (tabs.size() <= 1 || l3Var.b != 0) {
                replaceEmoji = Emoji.replaceEmoji(l3Var.a.b(), getTextPaint().getFontMetricsInt(), false);
                l3Var.u = null;
            } else {
                replaceEmoji = Emoji.replaceEmoji(LocaleController.formatPluralString("BotMoreTabs", tabs.size() - 1, l3Var.a.b()), getTextPaint().getFontMetricsInt(), false);
                if (replaceEmoji == null) {
                    l3Var.u = null;
                } else {
                    l3Var.u = new k01(replaceEmoji, 17.0f, AndroidUtilities.bold());
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

    public final void o(boolean z4) {
        if (this.E == getExpandedHeight()) {
            return;
        }
        ValueAnimator valueAnimator = this.C;
        if (valueAnimator != null) {
            this.C = null;
            valueAnimator.cancel();
        }
        this.E = getExpandedHeight();
        Iterator it = this.G.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        if (z4) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.D, this.E);
            this.C = ofFloat;
            ofFloat.addUpdateListener(new x0(this, 4));
            this.C.addListener(new h(this, 3));
            this.C.setDuration(250L);
            this.C.setInterpolator(r1.w);
            this.C.start();
        } else {
            this.D = this.E;
            invalidate();
        }
        Object parent = getParent();
        if (parent instanceof View) {
            WeakHashMap weakHashMap = r0.j0.a;
            r0.z.c((View) parent);
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

    public void setupTab(l3 l3Var) {
        int a2 = this.r.a(this.n, false);
        float e6 = this.v.e(this.s);
        l3Var.v = 0.0f;
        boolean z4 = e6 > 0.5f;
        l3Var.l = a2;
        l3Var.n = z4;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        super.verifyDrawable(drawable);
        return true;
    }
}
