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
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.t01;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.jk;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class m3 extends FrameLayout {
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
    public final k3 e;
    public int f;
    public final org.telegram.ui.Components.h5 h;
    public int n;
    public final org.telegram.ui.Components.h5 r;
    public boolean s;
    public final org.telegram.ui.Components.e6 v;
    public int w;
    public boolean x;
    public boolean y;

    public m3(Context context, ActionBarLayout actionBarLayout) {
        super(context);
        this.a = new Paint(1);
        this.b = true;
        this.c = false;
        rr rrVar = rr.h;
        this.h = new org.telegram.ui.Components.h5(this, 200L, rrVar, 0);
        this.r = new org.telegram.ui.Components.h5(this, 200L, rrVar, 0);
        this.v = new org.telegram.ui.Components.e6(this, 0L, 200L, rrVar);
        this.w = UserConfig.selectedAccount;
        this.E = new RectF();
        this.I = new HashSet();
        this.J = new HashSet();
        this.d = actionBarLayout;
        setNavigationBarColor(h6.w0(null, h6.a7, false));
        k3 k3Var = new k3(this, this);
        this.e = k3Var;
        r0.i0.k(this, k3Var);
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
        ArrayList<l3> tabs = getTabs();
        int size = tabs.size();
        if (size == 0) {
            return;
        }
        l3 l3Var = (l3) hg.c.g(1, tabs);
        LaunchActivity launchActivity = LaunchActivity.G1;
        v3 v3Var = launchActivity == null ? null : launchActivity.y0;
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
        ArrayList<j3> tabDrawables = getTabDrawables();
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
                j3 j3Var = tabDrawables.get(i10);
                float c10 = j3Var.c();
                float b10 = j3Var.b();
                if (b10 > 0.0f && c10 <= 1.99f) {
                    RectF rectF = this.E;
                    d(rectF, c10);
                    j3Var.v = 0.0f;
                    boolean z10 = e > 0.5f;
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
        wn wnVar;
        jk jkVar;
        m2 R = LaunchActivity.R();
        if (R == null || R.getParentActivity() == null) {
            return;
        }
        boolean z10 = R instanceof wn;
        if (z10 && (jkVar = (wnVar = (wn) R).Y) != null) {
            jkVar.P();
            wnVar.Y.n0(true, false, true);
        }
        if (l3Var.J == null) {
            new ai.g3(24, this, l3Var).run(R);
            if (l3Var.C) {
                if (z10 && ((wn) R).a() == l3Var.a.c) {
                    return;
                }
                this.c = true;
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o(this, R, wn.R9(l3Var.a.c), 4), 220L);
                return;
            }
            return;
        }
        m2 sheetFragment = this.d.getSheetFragment();
        org.telegram.ui.i4 i4Var = l3Var.J;
        org.telegram.ui.v3 v3Var = i4Var.K;
        h3.b(v3Var);
        sheetFragment.addSheet(v3Var);
        org.telegram.ui.u3 u3Var = v3Var.c;
        v3Var.h = false;
        v3Var.n = false;
        ValueAnimator valueAnimator = v3Var.y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = v3Var.E;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        v3Var.x = 0.0f;
        v3Var.w = 0.0f;
        v3Var.h();
        v3Var.n();
        u3Var.invalidate();
        u3Var.requestLayout();
        i4Var.Y(sheetFragment.getParentActivity(), sheetFragment);
        v3Var.g(sheetFragment);
        v3Var.f();
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
        if (!l3Var.y) {
            h(this.w, l3Var, true);
            callback.run(Boolean.TRUE);
            return;
        }
        TLRPC.User user = MessagesController.getInstance(l3Var.a.a).getUser(Long.valueOf(l3Var.a.c));
        String formatName = user != null ? ContactsController.formatName(user.first_name, user.last_name) : null;
        boolean[] zArr = {false};
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        a2 a2Var = alertDialog$Builder.a;
        a2Var.R = formatName;
        a2Var.T = LocaleController.getString(R.string.BotWebViewChangesMayNotBeSaved);
        alertDialog$Builder.k(LocaleController.getString(R.string.BotWebViewCloseAnyway), new ai.g6(this, zArr, l3Var, callback, r8));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ai.q5(zArr, callback, r8, 16));
        a2[] a2VarArr = {a2Var};
        a2Var.setOnDismissListener(new i3(zArr, callback));
        a2VarArr[0].show();
        ((TextView) a2VarArr[0].d(-1)).setTextColor(h6.w0(null, h6.q7, false));
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
        HashMap hashMap = L;
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
        HashMap hashMap = K;
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
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o(this, arrayList3, l3Var, 5), 320L);
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
            if (!actionBarLayout.Q || actionBarLayout.T) {
                z10 = false;
            }
            this.f = i10;
            int v = h6.v(i10, h6.l1((AndroidUtilities.computePerceivedBrightness(i10) > 0.721f ? 1 : (AndroidUtilities.computePerceivedBrightness(i10) == 0.721f ? 0 : -1)) < 0 ? 0.08f : 0.75f, -1));
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
        ArrayList<l3> tabs = getTabs();
        ArrayList<j3> tabDrawables = getTabDrawables();
        if (this.b) {
            l3 l3Var = tabs.isEmpty() ? null : tabs.get(0);
            j3 c10 = c(l3Var);
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
                        g(l3Var, new ai.i(6));
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

    public final l3 k(ei.f5 f5Var) {
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
            l3 l3Var = (l3) arrayList.get(i10);
            if (f5Var.equals(l3Var.a)) {
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
            org.telegram.ui.i4 i4Var = l3Var.J;
            if (i4Var != null && !i4Var.d0.isEmpty()) {
                Object g10 = hg.c.g(1, l3Var.J.d0);
                if ((g10 instanceof TLRPC.WebPage) && ((TLRPC.WebPage) g10).id == webPage.id) {
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
                    j3Var.u = new t01(replaceEmoji, 17.0f, AndroidUtilities.bold());
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
            ofFloat.addUpdateListener(new v0(this, 4));
            this.F.addListener(new h(this, 3));
            this.F.setDuration(250L);
            this.F.setInterpolator(o1.w);
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

    public void setupTab(j3 j3Var) {
        int a2 = this.r.a(this.n, false);
        float e = this.v.e(this.s);
        j3Var.v = 0.0f;
        boolean z10 = e > 0.5f;
        j3Var.l = a2;
        j3Var.n = z10;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        super.verifyDrawable(drawable);
        return true;
    }
}
