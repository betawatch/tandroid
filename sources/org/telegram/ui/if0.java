package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class if0 extends FrameLayout implements org.telegram.messenger.ls, org.telegram.ui.ActionBar.a6 {
    public static final org.telegram.ui.Components.oa0 n;
    public static final org.telegram.ui.Components.oa0 r;
    public final int a;
    public final org.telegram.ui.Components.l9 b;
    public final org.telegram.ui.ActionBar.k5 c;
    public final TextView d;
    public final org.telegram.ui.Components.w8 e;
    public final org.telegram.ui.Components.nu0 f;
    public TLObject h;

    static {
        int i7 = org.telegram.ui.ActionBar.k6.y6;
        n = new org.telegram.ui.Components.oa0(R.drawable.msg_mini_checks, i7);
        r = new org.telegram.ui.Components.oa0(R.drawable.mini_checklist_done_outline, i7);
    }

    public if0(Context context) {
        super(context);
        this.a = org.telegram.messenger.p10.s0;
        this.e = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.b = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(18.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.c = k5Var;
        k5Var.setTextSize(16);
        k5Var.setEllipsizeByGradient(!org.telegram.messenger.hd.a0);
        k5Var.setImportantForAccessibility(2);
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.E8, null);
        k5Var.setGravity(org.telegram.messenger.hd.a0 ? 5 : 3);
        this.f = new org.telegram.ui.Components.nu0(this);
        k5Var.setDrawablePadding(org.telegram.messenger.g0.L(3.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 13.0f);
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setImportantForAccessibility(2);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.y6, null);
        textView.setGravity(org.telegram.messenger.hd.a0 ? 5 : 3);
        if (org.telegram.messenger.hd.a0) {
            addView(l9Var, c8.ha.d(34, 34.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
            addView(k5Var, c8.ha.d(-2, -2.0f, 53, 8.0f, 5.33f, 55.0f, 0.0f));
            addView(textView, c8.ha.d(-2, -2.0f, 53, 13.0f, 19.0f, 55.0f, 0.0f));
        } else {
            addView(l9Var, c8.ha.d(34, 34.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
            addView(k5Var, c8.ha.d(-2, -2.0f, 51, 55.0f, 5.33f, 8.0f, 0.0f));
            addView(textView, c8.ha.d(-2, -2.0f, 51, 55.0f, 19.0f, 13.0f, 0.0f));
        }
    }

    public final void a(TLObject tLObject, int i7, boolean z9) {
        this.h = tLObject;
        org.telegram.ui.Components.g5 a10 = this.f.a(tLObject, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.z9, false), false);
        org.telegram.ui.ActionBar.k5 k5Var = this.c;
        k5Var.i(a10);
        if (tLObject != null) {
            org.telegram.ui.Components.w8 w8Var = this.e;
            w8Var.p(tLObject);
            this.b.j(org.telegram.messenger.hc.m(this.a, 1, tLObject), "50_50", w8Var, tLObject);
            k5Var.l(org.telegram.messenger.g5.o(tLObject), false);
        }
        TextView textView = this.d;
        if (i7 <= 0) {
            textView.setVisibility(8);
            k5Var.setTranslationY(org.telegram.messenger.g0.L(9.0f));
        } else {
            textView.setText(TextUtils.concat((z9 ? r : n).a(getContext(), null), org.telegram.messenger.hd.O(i7)));
            textView.setVisibility(0);
            k5Var.setTranslationY(0.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z9));
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.m5) {
            TLRPC.User user = (TLRPC.User) objArr[0];
            TLObject tLObject = this.h;
            TLRPC.User user2 = tLObject instanceof TLRPC.User ? (TLRPC.User) tLObject : null;
            if (user2 == null || user == null || user2.id != user.id) {
                return;
            }
            this.h = user;
            this.c.i(this.f.a(user, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.z9, false), true));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f.a.a();
        org.telegram.messenger.qs.f(this.a).c(this, org.telegram.messenger.qs.m5);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f.a.b();
        org.telegram.messenger.qs.f(this.a).n(this, org.telegram.messenger.qs.m5);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String a02 = org.telegram.messenger.hd.a0("AccDescrPersonHasSeen", null, 2131754812, this.c.getText());
        TextView textView = this.d;
        if (textView.getVisibility() == 0) {
            StringBuilder j3 = rf.b.j(a02, " ");
            j3.append((Object) textView.getText());
            a02 = j3.toString();
        }
        accessibilityNodeInfo.setText(a02);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        org.telegram.ui.Components.nu0 nu0Var = this.f;
        if (nu0Var != null) {
            try {
                org.telegram.ui.Components.g5 g5Var = nu0Var.a;
                if (g5Var != null) {
                    int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.z9, false);
                    Integer num = g5Var.F;
                    if (num == null || num.intValue() == x02) {
                        return;
                    }
                    g5Var.k(Integer.valueOf(x02));
                    org.telegram.ui.ActionBar.k5 k5Var = this.c;
                    if (k5Var != null) {
                        k5Var.invalidate();
                    }
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }
}
