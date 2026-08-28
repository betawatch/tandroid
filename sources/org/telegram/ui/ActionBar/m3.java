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
import gh.i7;
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
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.nz0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ak;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class m3 extends FrameLayout {
    public static final HashMap G = new HashMap();
    public static final HashMap H = new HashMap();
    public static TextPaint I;
    public final RectF A;
    public ValueAnimator B;
    public float C;
    public int D;
    public final HashSet E;
    public final HashSet F;
    public final Paint a;
    public boolean b;
    public boolean c;
    public final ActionBarLayout d;
    public final k3 e;
    public int f;
    public final org.telegram.ui.Components.b5 h;
    public int n;
    public final org.telegram.ui.Components.b5 r;
    public boolean s;
    public final org.telegram.ui.Components.y5 v;
    public int w;
    public boolean x;
    public boolean y;

    public m3(Context context, ActionBarLayout actionBarLayout) {
        super(context);
        this.a = new Paint(1);
        this.b = true;
        this.c = false;
        gr grVar = gr.h;
        this.h = new org.telegram.ui.Components.b5(this, 200L, grVar, 0);
        this.r = new org.telegram.ui.Components.b5(this, 200L, grVar, 0);
        this.v = new org.telegram.ui.Components.y5(this, 0L, 200L, grVar);
        this.w = UserConfig.selectedAccount;
        this.A = new RectF();
        this.E = new HashSet();
        this.F = new HashSet();
        this.d = actionBarLayout;
        setNavigationBarColor(f6.w0(null, f6.a7, false));
        k3 k3Var = new k3(this, this);
        this.e = k3Var;
        r0.j0.k(this, k3Var);
        n();
        o(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static TextPaint getTextPaint() {
        if (I == null) {
            TextPaint textPaint = new TextPaint(1);
            I = textPaint;
            textPaint.setTypeface(AndroidUtilities.bold());
            I.setTextSize(AndroidUtilities.dp(17.0f));
        }
        return I;
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
        ArrayList<l3> tabs = getTabs();
        int size = tabs.size();
        if (size == 0) {
            return;
        }
        l3 l3Var = (l3) j3.r0.j(1, tabs);
        LaunchActivity launchActivity = LaunchActivity.C1;
        v3 v3Var = launchActivity == null ? null : launchActivity.u0;
        if (v3Var != null && (valueAnimator = v3Var.d) != null) {
            valueAnimator.cancel();
            v3Var.d = null;
        }
        if (size == 1 || v3Var == null) {
            e(l3Var);
        } else {
            v3Var.f();
        }
    }

    public final j3 c(l3 l3Var) {
        ArrayList<j3> tabDrawables = getTabDrawables();
        for (int i9 = 0; i9 < tabDrawables.size(); i9++) {
            if (tabDrawables.get(i9).a == l3Var) {
                return tabDrawables.get(i9);
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
        ArrayList<j3> tabDrawables = getTabDrawables();
        if (this.C <= 0.0f) {
            return;
        }
        this.a.setColor(this.h.a(this.f, false));
        super.dispatchDraw(canvas);
        int a2 = this.r.a(this.n, false);
        float e10 = this.v.e(this.s);
        if (this.b) {
            int i9 = 0;
            while (i9 < tabDrawables.size()) {
                j3 j3Var = tabDrawables.get(i9);
                float c10 = j3Var.c();
                float b10 = j3Var.b();
                if (b10 > 0.0f && c10 <= 1.99f) {
                    RectF rectF = this.A;
                    d(rectF, c10);
                    j3Var.v = 0.0f;
                    boolean z10 = e10 > 0.5f;
                    j3Var.l = a2;
                    j3Var.n = z10;
                    canvas2 = canvas;
                    j3Var.a(canvas2, rectF, AndroidUtilities.dp(18.0f), b10, 1.0f);
                } else {
                    canvas2 = canvas;
                }
                i9++;
                canvas = canvas2;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        k3 k3Var;
        if (!this.b || getTabs().isEmpty() || (k3Var = this.e) == null || !k3Var.f(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    public final void e(l3 l3Var) {
        qn qnVar;
        ak akVar;
        o2 R = LaunchActivity.R();
        if (R == null || R.getParentActivity() == null) {
            return;
        }
        boolean z10 = R instanceof qn;
        if (z10 && (akVar = (qnVar = (qn) R).U) != null) {
            akVar.O();
            qnVar.U.m0(true, false, true);
        }
        if (l3Var.H == null) {
            new fh.f1(25, this, l3Var).run(R);
            if (l3Var.A) {
                if (z10 && ((qn) R).a() == l3Var.a.c) {
                    return;
                }
                this.c = true;
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.e(this, R, qn.R9(l3Var.a.c), 6), 220L);
                return;
            }
            return;
        }
        o2 sheetFragment = this.d.getSheetFragment();
        org.telegram.ui.l4 l4Var = l3Var.H;
        org.telegram.ui.y3 y3Var = l4Var.G;
        i3.b(y3Var);
        sheetFragment.addSheet(y3Var);
        org.telegram.ui.x3 x3Var = y3Var.c;
        y3Var.h = false;
        y3Var.n = false;
        ValueAnimator valueAnimator = y3Var.y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = y3Var.A;
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
        h(this.w, l3Var, false);
    }

    public final void f() {
        ArrayList<l3> tabs = getTabs();
        ArrayList<j3> tabDrawables = getTabDrawables();
        for (int i9 = 0; i9 < tabs.size(); i9++) {
            tabs.get(i9).a();
        }
        tabs.clear();
        for (int i10 = 0; i10 < tabDrawables.size(); i10++) {
            tabDrawables.get(i10).c = -1;
        }
        n();
        o(true);
        invalidate();
        tabs.isEmpty();
    }

    public final void g(l3 l3Var, Utilities.Callback callback) {
        if (l3Var == null) {
            callback.run(Boolean.TRUE);
            return;
        }
        if (!l3Var.w) {
            h(this.w, l3Var, true);
            callback.run(Boolean.TRUE);
            return;
        }
        TLRPC.User user = MessagesController.getInstance(l3Var.a.a).getUser(Long.valueOf(l3Var.a.c));
        String formatName = user != null ? ContactsController.formatName(user.first_name, user.last_name) : null;
        boolean[] zArr = {false};
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        c2 c2Var = alertDialog$Builder.a;
        c2Var.N = formatName;
        c2Var.P = LocaleController.getString(R.string.BotWebViewChangesMayNotBeSaved);
        alertDialog$Builder.k(LocaleController.getString(R.string.BotWebViewCloseAnyway), new f1.a(this, zArr, l3Var, callback, r8));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new androidx.car.app.utils.a(zArr, callback, r8, 15));
        c2[] c2VarArr = {c2Var};
        c2Var.setOnDismissListener(new i7(zArr, callback));
        c2VarArr[0].show();
        ((TextView) c2VarArr[0].d(-1)).setTextColor(f6.w0(null, f6.q7, false));
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

    public ArrayList<j3> getTabDrawables() {
        int i9 = this.w;
        Integer valueOf = Integer.valueOf(i9);
        HashMap hashMap = H;
        ArrayList<j3> arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList != null) {
            return arrayList;
        }
        Integer valueOf2 = Integer.valueOf(i9);
        ArrayList<j3> arrayList2 = new ArrayList<>();
        hashMap.put(valueOf2, arrayList2);
        return arrayList2;
    }

    public ArrayList<l3> getTabs() {
        int i9 = this.w;
        Integer valueOf = Integer.valueOf(i9);
        HashMap hashMap = G;
        ArrayList<l3> arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList != null) {
            return arrayList;
        }
        Integer valueOf2 = Integer.valueOf(i9);
        ArrayList<l3> arrayList2 = new ArrayList<>();
        hashMap.put(valueOf2, arrayList2);
        return arrayList2;
    }

    public final boolean h(int i9, l3 l3Var, boolean z10) {
        Integer valueOf = Integer.valueOf(i9);
        HashMap hashMap = G;
        ArrayList arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(i9);
            ArrayList arrayList2 = new ArrayList();
            hashMap.put(valueOf2, arrayList2);
            arrayList = arrayList2;
        }
        Integer valueOf3 = Integer.valueOf(i9);
        HashMap hashMap2 = H;
        ArrayList arrayList3 = (ArrayList) hashMap2.get(valueOf3);
        if (arrayList3 == null) {
            Integer valueOf4 = Integer.valueOf(i9);
            arrayList3 = new ArrayList();
            hashMap2.put(valueOf4, arrayList3);
        }
        arrayList.remove(l3Var);
        if (z10) {
            l3Var.a();
        }
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            j3 j3Var = (j3) arrayList3.get(i10);
            int indexOf = arrayList.indexOf(j3Var.a);
            j3Var.c = indexOf;
            if (indexOf >= 0) {
                j3Var.b = indexOf;
            }
        }
        n();
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.e(this, arrayList3, l3Var, 7), 320L);
        o(true);
        invalidate();
        k3 k3Var = this.e;
        if (k3Var != null) {
            k3Var.i();
        }
        return arrayList.isEmpty();
    }

    public final void i(int i9, boolean z10) {
        if (i9 != this.f) {
            ActionBarLayout actionBarLayout = this.d;
            if (!actionBarLayout.M || actionBarLayout.P) {
                z10 = false;
            }
            this.f = i9;
            int v = f6.v(i9, f6.l1((AndroidUtilities.computePerceivedBrightness(i9) > 0.721f ? 1 : (AndroidUtilities.computePerceivedBrightness(i9) == 0.721f ? 0 : -1)) < 0 ? 0.08f : 0.75f, -1));
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

    public final boolean j(float f10, float f11, int i9) {
        ArrayList<l3> tabs = getTabs();
        ArrayList<j3> tabDrawables = getTabDrawables();
        if (this.b) {
            l3 l3Var = tabs.isEmpty() ? null : tabs.get(0);
            j3 c10 = c(l3Var);
            if (c10 != null) {
                org.telegram.ui.Cells.z zVar = c10.k;
                float c11 = c10.c();
                RectF rectF = this.A;
                d(rectF, c11);
                if (i9 == 0 || i9 == 2) {
                    boolean contains = zVar.getBounds().contains((int) (f10 - rectF.left), (int) (f11 - rectF.centerY()));
                    this.x = contains;
                    this.y = !contains && rectF.contains(f10, f11);
                    zVar.setState(this.x ? new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled} : new int[0]);
                } else if (i9 == 1 || i9 == 3) {
                    if (this.y && i9 == 1) {
                        b();
                    } else if (this.x && i9 == 1) {
                        g(l3Var, new bg.k(1));
                    }
                    this.x = false;
                    this.y = false;
                    zVar.setState(new int[0]);
                }
                for (int i10 = 0; i10 < tabDrawables.size(); i10++) {
                    if (tabDrawables.get(i10) != c10) {
                        tabDrawables.get(i10).k.setState(new int[0]);
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

    public final l3 k(mh.s4 s4Var) {
        Integer valueOf = Integer.valueOf(this.w);
        HashMap hashMap = G;
        ArrayList arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(this.w);
            ArrayList arrayList2 = new ArrayList();
            hashMap.put(valueOf2, arrayList2);
            arrayList = arrayList2;
        }
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            l3 l3Var = (l3) arrayList.get(i9);
            if (s4Var.equals(l3Var.a)) {
                e(l3Var);
                return l3Var;
            }
        }
        return null;
    }

    public final l3 l(MessageObject messageObject) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        if (messageObject == null || (message = messageObject.messageOwner) == null || (messageMedia = message.media) == null || (webPage = messageMedia.webpage) == null) {
            return null;
        }
        return m(webPage);
    }

    public final l3 m(TLRPC.WebPage webPage) {
        if (webPage == null) {
            return null;
        }
        ArrayList<l3> tabs = getTabs();
        for (int i9 = 0; i9 < tabs.size(); i9++) {
            l3 l3Var = tabs.get(i9);
            org.telegram.ui.l4 l4Var = l3Var.H;
            if (l4Var != null && !l4Var.Z.isEmpty()) {
                Object j10 = j3.r0.j(1, l3Var.H.Z);
                if ((j10 instanceof TLRPC.WebPage) && ((TLRPC.WebPage) j10).id == webPage.id) {
                    e(l3Var);
                    return l3Var;
                }
            }
        }
        return null;
    }

    public final void n() {
        CharSequence replaceEmoji;
        ArrayList<l3> tabs = getTabs();
        ArrayList<j3> tabDrawables = getTabDrawables();
        CharSequence charSequence = null;
        for (int i9 = 0; i9 < tabDrawables.size(); i9++) {
            j3 j3Var = tabDrawables.get(i9);
            if (tabs.size() <= 1 || j3Var.b != 0) {
                replaceEmoji = Emoji.replaceEmoji(j3Var.a.b(), getTextPaint().getFontMetricsInt(), false);
                j3Var.u = null;
            } else {
                replaceEmoji = Emoji.replaceEmoji(LocaleController.formatPluralString("BotMoreTabs", tabs.size() - 1, j3Var.a.b()), getTextPaint().getFontMetricsInt(), false);
                if (replaceEmoji == null) {
                    j3Var.u = null;
                } else {
                    j3Var.u = new nz0(replaceEmoji, 17.0f, AndroidUtilities.bold());
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
        int i10 = R.string.AccDescrTabs;
        if (charSequence == null) {
            charSequence = "";
        }
        setContentDescription(LocaleController.formatString(i10, charSequence));
    }

    public final void o(boolean z10) {
        if (this.D == getExpandedHeight()) {
            return;
        }
        ValueAnimator valueAnimator = this.B;
        if (valueAnimator != null) {
            this.B = null;
            valueAnimator.cancel();
        }
        this.D = getExpandedHeight();
        Iterator it = this.F.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        if (z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.C, this.D);
            this.B = ofFloat;
            ofFloat.addUpdateListener(new x0(this, 4));
            this.B.addListener(new h(this, 3));
            this.B.setDuration(250L);
            this.B.setInterpolator(q1.w);
            this.B.start();
        } else {
            this.C = this.D;
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

    public void setCurrentAccount(int i9) {
        if (this.w != i9) {
            this.w = i9;
            o(false);
            invalidate();
        }
    }

    public void setNavigationBarColor(int i9) {
        i(i9, true);
    }

    public void setupTab(j3 j3Var) {
        int a2 = this.r.a(this.n, false);
        float e10 = this.v.e(this.s);
        j3Var.v = 0.0f;
        boolean z10 = e10 > 0.5f;
        j3Var.l = a2;
        j3Var.n = z10;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        super.verifyDrawable(drawable);
        return true;
    }
}
