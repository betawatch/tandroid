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
import bi.m9;
import bi.p7;
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
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.q11;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.hk;
import org.telegram.ui.un;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class s3 extends FrameLayout {
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
    public final q3 e;
    public int f;
    public final org.telegram.ui.Components.j5 h;
    public int n;
    public final org.telegram.ui.Components.j5 r;
    public boolean s;
    public final org.telegram.ui.Components.h6 v;
    public int w;
    public boolean x;
    public boolean y;

    public s3(Context context, ActionBarLayout actionBarLayout) {
        super(context);
        this.a = new Paint(1);
        this.b = true;
        this.c = false;
        ds dsVar = ds.h;
        this.h = new org.telegram.ui.Components.j5(this, 200L, dsVar, 0);
        this.r = new org.telegram.ui.Components.j5(this, 200L, dsVar, 0);
        this.v = new org.telegram.ui.Components.h6(this, 0L, 200L, dsVar);
        this.w = UserConfig.selectedAccount;
        this.E = new RectF();
        this.I = new HashSet();
        this.J = new HashSet();
        this.d = actionBarLayout;
        setNavigationBarColor(y6.x0(null, y6.a7, false));
        q3 q3Var = new q3(this, this);
        this.e = q3Var;
        r0.i0.k(this, q3Var);
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
        ArrayList<r3> tabs = getTabs();
        int size = tabs.size();
        if (size == 0) {
            return;
        }
        r3 r3Var = (r3) ic.a.g(1, tabs);
        LaunchActivity launchActivity = LaunchActivity.I1;
        b4 b4Var = launchActivity == null ? null : launchActivity.y0;
        if (b4Var != null && (valueAnimator = b4Var.d) != null) {
            valueAnimator.cancel();
            b4Var.d = null;
        }
        if (size == 1 || b4Var == null) {
            e(r3Var);
        } else {
            b4Var.f();
        }
    }

    public final p3 c(r3 r3Var) {
        ArrayList<p3> tabDrawables = getTabDrawables();
        for (int i10 = 0; i10 < tabDrawables.size(); i10++) {
            if (tabDrawables.get(i10).a == r3Var) {
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
        ArrayList<p3> tabDrawables = getTabDrawables();
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
                p3 p3Var = tabDrawables.get(i10);
                float c10 = p3Var.c();
                float b10 = p3Var.b();
                if (b10 > 0.0f && c10 <= 1.99f) {
                    RectF rectF = this.E;
                    d(rectF, c10);
                    p3Var.w = 0.0f;
                    boolean z10 = e > 0.5f;
                    p3Var.m = a2;
                    p3Var.o = z10;
                    canvas2 = canvas;
                    p3Var.a(canvas2, rectF, AndroidUtilities.dp(18.0f), b10, 1.0f);
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
        q3 q3Var;
        if (!this.b || getTabs().isEmpty() || (q3Var = this.e) == null || !q3Var.f(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    public final void e(r3 r3Var) {
        un unVar;
        hk hkVar;
        r2 R = LaunchActivity.R();
        if (R == null || R.getParentActivity() == null) {
            return;
        }
        boolean z10 = R instanceof un;
        if (z10 && (hkVar = (unVar = (un) R).Y) != null) {
            hkVar.M();
            unVar.Y.k0(true, false, true);
        }
        if (r3Var.J == null) {
            new li.s2(2, this, r3Var).run(R);
            if (r3Var.C) {
                if (z10 && ((un) R).a() == r3Var.a.c) {
                    return;
                }
                this.c = true;
                AndroidUtilities.runOnUIThread(new jg.f1(this, R, un.ba(r3Var.a.c), 21), 220L);
                return;
            }
            return;
        }
        r2 sheetFragment = this.d.getSheetFragment();
        org.telegram.ui.j4 j4Var = r3Var.J;
        org.telegram.ui.v3 v3Var = j4Var.K;
        o3.b(v3Var);
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
        j4Var.Y(sheetFragment.getParentActivity(), sheetFragment);
        v3Var.g(sheetFragment);
        v3Var.f();
        h(this.w, r3Var, false);
    }

    public final void f() {
        ArrayList<r3> tabs = getTabs();
        ArrayList<p3> tabDrawables = getTabDrawables();
        for (int i10 = 0; i10 < tabs.size(); i10++) {
            tabs.get(i10).a();
        }
        tabs.clear();
        for (int i11 = 0; i11 < tabDrawables.size(); i11++) {
            tabDrawables.get(i11).d = -1;
        }
        n();
        o(true);
        invalidate();
        tabs.isEmpty();
    }

    public final void g(r3 r3Var, Utilities.Callback callback) {
        String str;
        if (r3Var == null) {
            callback.run(Boolean.TRUE);
            return;
        }
        if (!r3Var.y) {
            h(this.w, r3Var, true);
            callback.run(Boolean.TRUE);
            return;
        }
        TLRPC.User user = MessagesController.getInstance(r3Var.a.a).getUser(Long.valueOf(r3Var.a.c));
        if (user != null) {
            str = ContactsController.formatName(user.first_name, user.last_name);
        } else {
            hi.c5 c5Var = r3Var.a;
            str = c5Var.g == 6 ? c5Var.e : null;
        }
        boolean[] zArr = {false};
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        e2 e2Var = alertDialog$Builder.a;
        e2Var.R = str;
        e2Var.T = LocaleController.getString(R.string.BotWebViewChangesMayNotBeSaved);
        alertDialog$Builder.k(LocaleController.getString(R.string.BotWebViewCloseAnyway), new p7(this, zArr, r3Var, callback, r8));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new androidx.car.app.utils.a(zArr, callback, r8, 17));
        e2[] e2VarArr = {e2Var};
        e2Var.setOnDismissListener(new m9(zArr, callback));
        e2VarArr[0].show();
        f7.V((TextView) e2VarArr[0].d(-1), y6.q7, null);
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

    public ArrayList<p3> getTabDrawables() {
        int i10 = this.w;
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = L;
        ArrayList<p3> arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList != null) {
            return arrayList;
        }
        Integer valueOf2 = Integer.valueOf(i10);
        ArrayList<p3> arrayList2 = new ArrayList<>();
        hashMap.put(valueOf2, arrayList2);
        return arrayList2;
    }

    public ArrayList<r3> getTabs() {
        int i10 = this.w;
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = K;
        ArrayList<r3> arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList != null) {
            return arrayList;
        }
        Integer valueOf2 = Integer.valueOf(i10);
        ArrayList<r3> arrayList2 = new ArrayList<>();
        hashMap.put(valueOf2, arrayList2);
        return arrayList2;
    }

    public final boolean h(int i10, r3 r3Var, boolean z10) {
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
        arrayList.remove(r3Var);
        if (z10) {
            r3Var.a();
        }
        for (int i11 = 0; i11 < arrayList3.size(); i11++) {
            p3 p3Var = (p3) arrayList3.get(i11);
            int indexOf = arrayList.indexOf(p3Var.a);
            p3Var.d = indexOf;
            if (indexOf >= 0) {
                p3Var.c = indexOf;
            }
        }
        n();
        AndroidUtilities.runOnUIThread(new jg.f1(this, arrayList3, r3Var, 22), 320L);
        o(true);
        invalidate();
        q3 q3Var = this.e;
        if (q3Var != null) {
            q3Var.i();
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
            int v = y6.v(i10, y6.o1((AndroidUtilities.computePerceivedBrightness(i10) > 0.721f ? 1 : (AndroidUtilities.computePerceivedBrightness(i10) == 0.721f ? 0 : -1)) < 0 ? 0.08f : 0.75f, -1));
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
        ArrayList<r3> tabs = getTabs();
        ArrayList<p3> tabDrawables = getTabDrawables();
        if (this.b) {
            r3 r3Var = tabs.isEmpty() ? null : tabs.get(0);
            p3 c10 = c(r3Var);
            if (c10 != null) {
                org.telegram.ui.Cells.y yVar = c10.l;
                float c11 = c10.c();
                RectF rectF = this.E;
                d(rectF, c11);
                if (i10 == 0 || i10 == 2) {
                    boolean contains = yVar.getBounds().contains((int) (f7 - rectF.left), (int) (f10 - rectF.centerY()));
                    this.x = contains;
                    this.y = !contains && rectF.contains(f7, f10);
                    yVar.setState(this.x ? new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled} : new int[0]);
                } else if (i10 == 1 || i10 == 3) {
                    if (this.y && i10 == 1) {
                        b();
                    } else if (this.x && i10 == 1) {
                        g(r3Var, new di.e(6));
                    }
                    this.x = false;
                    this.y = false;
                    yVar.setState(new int[0]);
                }
                for (int i11 = 0; i11 < tabDrawables.size(); i11++) {
                    if (tabDrawables.get(i11) != c10) {
                        tabDrawables.get(i11).l.setState(new int[0]);
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

    public final r3 k(hi.c5 c5Var) {
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
            r3 r3Var = (r3) arrayList.get(i10);
            if (c5Var.equals(r3Var.a)) {
                e(r3Var);
                return r3Var;
            }
        }
        return null;
    }

    public final r3 l(MessageObject messageObject) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        if (messageObject == null || (message = messageObject.messageOwner) == null || (messageMedia = message.media) == null || (webPage = messageMedia.webpage) == null) {
            return null;
        }
        return m(webPage);
    }

    public final r3 m(TLRPC.WebPage webPage) {
        if (webPage == null) {
            return null;
        }
        ArrayList<r3> tabs = getTabs();
        for (int i10 = 0; i10 < tabs.size(); i10++) {
            r3 r3Var = tabs.get(i10);
            org.telegram.ui.j4 j4Var = r3Var.J;
            if (j4Var != null && !j4Var.d0.isEmpty()) {
                Object g7 = ic.a.g(1, r3Var.J.d0);
                if ((g7 instanceof TLRPC.WebPage) && ((TLRPC.WebPage) g7).id == webPage.id) {
                    e(r3Var);
                    return r3Var;
                }
            }
        }
        return null;
    }

    public final void n() {
        CharSequence replaceEmoji;
        ArrayList<r3> tabs = getTabs();
        ArrayList<p3> tabDrawables = getTabDrawables();
        CharSequence charSequence = null;
        for (int i10 = 0; i10 < tabDrawables.size(); i10++) {
            p3 p3Var = tabDrawables.get(i10);
            if (tabs.size() <= 1 || p3Var.c != 0) {
                replaceEmoji = Emoji.replaceEmoji(p3Var.a.b(), getTextPaint().getFontMetricsInt(), false);
                p3Var.v = null;
            } else {
                replaceEmoji = Emoji.replaceEmoji(LocaleController.formatPluralString("BotMoreTabs", tabs.size() - 1, p3Var.a.b()), getTextPaint().getFontMetricsInt(), false);
                if (replaceEmoji == null) {
                    p3Var.v = null;
                } else {
                    p3Var.v = new q11(replaceEmoji, 17.0f, AndroidUtilities.bold());
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
            this.F.setInterpolator(q1.w);
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

    public void setupTab(p3 p3Var) {
        int a2 = this.r.a(this.n, false);
        float e = this.v.e(this.s);
        p3Var.w = 0.0f;
        boolean z10 = e > 0.5f;
        p3Var.m = a2;
        p3Var.o = z10;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        super.verifyDrawable(drawable);
        return true;
    }
}
