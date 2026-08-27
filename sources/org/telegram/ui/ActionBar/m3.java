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
import hh.h7;
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
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.pz0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ck;
import org.telegram.ui.rn;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
        er erVar = er.h;
        this.h = new org.telegram.ui.Components.b5(this, 200L, erVar, 0);
        this.r = new org.telegram.ui.Components.b5(this, 200L, erVar, 0);
        this.v = new org.telegram.ui.Components.y5(this, 0L, 200L, erVar);
        this.w = UserConfig.selectedAccount;
        this.A = new RectF();
        this.E = new HashSet();
        this.F = new HashSet();
        this.d = actionBarLayout;
        setNavigationBarColor(g6.w0(null, g6.a7, false));
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
        l3 l3Var = (l3) i0.a.i(1, tabs);
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
        for (int i10 = 0; i10 < tabDrawables.size(); i10++) {
            if (tabDrawables.get(i10).a == l3Var) {
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
        ArrayList<j3> tabDrawables = getTabDrawables();
        if (this.C <= 0.0f) {
            return;
        }
        this.a.setColor(this.h.a(this.f, false));
        super.dispatchDraw(canvas);
        int a2 = this.r.a(this.n, false);
        float e9 = this.v.e(this.s);
        if (this.b) {
            int i10 = 0;
            while (i10 < tabDrawables.size()) {
                j3 j3Var = tabDrawables.get(i10);
                float c10 = j3Var.c();
                float b10 = j3Var.b();
                if (b10 > 0.0f && c10 <= 1.99f) {
                    RectF rectF = this.A;
                    d(rectF, c10);
                    j3Var.v = 0.0f;
                    boolean z10 = e9 > 0.5f;
                    j3Var.l = a2;
                    j3Var.n = z10;
                    canvas2 = canvas;
                    j3Var.a(canvas2, rectF, AndroidUtilities.dp(18.0f), b10, 1.0f);
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
        k3 k3Var;
        if (!this.b || getTabs().isEmpty() || (k3Var = this.e) == null || !k3Var.f(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    public final void e(l3 l3Var) {
        rn rnVar;
        ck ckVar;
        n2 R = LaunchActivity.R();
        if (R == null || R.getParentActivity() == null) {
            return;
        }
        boolean z10 = R instanceof rn;
        if (z10 && (ckVar = (rnVar = (rn) R).U) != null) {
            ckVar.P();
            rnVar.U.n0(true, false, true);
        }
        if (l3Var.H == null) {
            new gh.d1(25, this, l3Var).run(R);
            if (l3Var.A) {
                if (z10 && ((rn) R).a() == l3Var.a.c) {
                    return;
                }
                this.c = true;
                AndroidUtilities.runOnUIThread(new i3((Object) this, (Object) R, (Object) rn.R9(l3Var.a.c), 0), 220L);
                return;
            }
            return;
        }
        n2 sheetFragment = this.d.getSheetFragment();
        org.telegram.ui.m4 m4Var = l3Var.H;
        org.telegram.ui.z3 z3Var = m4Var.G;
        h3.b(z3Var);
        sheetFragment.addSheet(z3Var);
        org.telegram.ui.y3 y3Var = z3Var.c;
        z3Var.h = false;
        z3Var.n = false;
        ValueAnimator valueAnimator = z3Var.y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = z3Var.A;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        z3Var.x = 0.0f;
        z3Var.w = 0.0f;
        z3Var.h();
        z3Var.n();
        y3Var.invalidate();
        y3Var.requestLayout();
        m4Var.Y(sheetFragment.getParentActivity(), sheetFragment);
        z3Var.g(sheetFragment);
        z3Var.f();
        h(this.w, l3Var, false);
    }

    public final void f() {
        ArrayList<l3> tabs = getTabs();
        ArrayList<j3> tabDrawables = getTabDrawables();
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
        b2 b2Var = alertDialog$Builder.a;
        b2Var.N = formatName;
        b2Var.P = LocaleController.getString(R.string.BotWebViewChangesMayNotBeSaved);
        alertDialog$Builder.k(LocaleController.getString(R.string.BotWebViewCloseAnyway), new f1.a(this, zArr, l3Var, callback, r8));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ag.l0(zArr, callback, r8, 15));
        b2[] b2VarArr = {b2Var};
        b2Var.setOnDismissListener(new h7(zArr, callback));
        b2VarArr[0].show();
        ((TextView) b2VarArr[0].d(-1)).setTextColor(g6.w0(null, g6.q7, false));
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
        int i10 = this.w;
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = H;
        ArrayList<j3> arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList != null) {
            return arrayList;
        }
        Integer valueOf2 = Integer.valueOf(i10);
        ArrayList<j3> arrayList2 = new ArrayList<>();
        hashMap.put(valueOf2, arrayList2);
        return arrayList2;
    }

    public ArrayList<l3> getTabs() {
        int i10 = this.w;
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = G;
        ArrayList<l3> arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList != null) {
            return arrayList;
        }
        Integer valueOf2 = Integer.valueOf(i10);
        ArrayList<l3> arrayList2 = new ArrayList<>();
        hashMap.put(valueOf2, arrayList2);
        return arrayList2;
    }

    public final boolean h(int i10, l3 l3Var, boolean z10) {
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = G;
        ArrayList arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(i10);
            ArrayList arrayList2 = new ArrayList();
            hashMap.put(valueOf2, arrayList2);
            arrayList = arrayList2;
        }
        Integer valueOf3 = Integer.valueOf(i10);
        HashMap hashMap2 = H;
        ArrayList arrayList3 = (ArrayList) hashMap2.get(valueOf3);
        if (arrayList3 == null) {
            Integer valueOf4 = Integer.valueOf(i10);
            arrayList3 = new ArrayList();
            hashMap2.put(valueOf4, arrayList3);
        }
        arrayList.remove(l3Var);
        if (z10) {
            l3Var.a();
        }
        for (int i11 = 0; i11 < arrayList3.size(); i11++) {
            j3 j3Var = (j3) arrayList3.get(i11);
            int indexOf = arrayList.indexOf(j3Var.a);
            j3Var.c = indexOf;
            if (indexOf >= 0) {
                j3Var.b = indexOf;
            }
        }
        n();
        AndroidUtilities.runOnUIThread(new i3(this, arrayList3, l3Var, 1), 320L);
        o(true);
        invalidate();
        k3 k3Var = this.e;
        if (k3Var != null) {
            k3Var.i();
        }
        return arrayList.isEmpty();
    }

    public final void i(int i10, boolean z10) {
        if (i10 != this.f) {
            ActionBarLayout actionBarLayout = this.d;
            if (!actionBarLayout.M || actionBarLayout.P) {
                z10 = false;
            }
            this.f = i10;
            int v = g6.v(i10, g6.l1((AndroidUtilities.computePerceivedBrightness(i10) > 0.721f ? 1 : (AndroidUtilities.computePerceivedBrightness(i10) == 0.721f ? 0 : -1)) < 0 ? 0.08f : 0.75f, -1));
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

    public final boolean j(float f10, float f11, int i10) {
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
                if (i10 == 0 || i10 == 2) {
                    boolean contains = zVar.getBounds().contains((int) (f10 - rectF.left), (int) (f11 - rectF.centerY()));
                    this.x = contains;
                    this.y = !contains && rectF.contains(f10, f11);
                    zVar.setState(this.x ? new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled} : new int[0]);
                } else if (i10 == 1 || i10 == 3) {
                    if (this.y && i10 == 1) {
                        b();
                    } else if (this.x && i10 == 1) {
                        g(l3Var, new cg.h(1));
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

    public final l3 k(nh.q4 q4Var) {
        Integer valueOf = Integer.valueOf(this.w);
        HashMap hashMap = G;
        ArrayList arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(this.w);
            ArrayList arrayList2 = new ArrayList();
            hashMap.put(valueOf2, arrayList2);
            arrayList = arrayList2;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            l3 l3Var = (l3) arrayList.get(i10);
            if (q4Var.equals(l3Var.a)) {
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
        for (int i10 = 0; i10 < tabs.size(); i10++) {
            l3 l3Var = tabs.get(i10);
            org.telegram.ui.m4 m4Var = l3Var.H;
            if (m4Var != null && !m4Var.Z.isEmpty()) {
                Object i11 = i0.a.i(1, l3Var.H.Z);
                if ((i11 instanceof TLRPC.WebPage) && ((TLRPC.WebPage) i11).id == webPage.id) {
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
        for (int i10 = 0; i10 < tabDrawables.size(); i10++) {
            j3 j3Var = tabDrawables.get(i10);
            if (tabs.size() <= 1 || j3Var.b != 0) {
                replaceEmoji = Emoji.replaceEmoji(j3Var.a.b(), getTextPaint().getFontMetricsInt(), false);
                j3Var.u = null;
            } else {
                replaceEmoji = Emoji.replaceEmoji(LocaleController.formatPluralString("BotMoreTabs", tabs.size() - 1, j3Var.a.b()), getTextPaint().getFontMetricsInt(), false);
                if (replaceEmoji == null) {
                    j3Var.u = null;
                } else {
                    j3Var.u = new pz0(replaceEmoji, 17.0f, AndroidUtilities.bold());
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
            ofFloat.addUpdateListener(new w0(this, 4));
            this.B.addListener(new h(this, 3));
            this.B.setDuration(250L);
            this.B.setInterpolator(p1.w);
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

    public void setupTab(j3 j3Var) {
        int a2 = this.r.a(this.n, false);
        float e9 = this.v.e(this.s);
        j3Var.v = 0.0f;
        boolean z10 = e9 > 0.5f;
        j3Var.l = a2;
        j3Var.n = z10;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        super.verifyDrawable(drawable);
        return true;
    }
}
