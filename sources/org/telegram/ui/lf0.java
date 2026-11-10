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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class lf0 extends FrameLayout implements org.telegram.messenger.ls, org.telegram.ui.ActionBar.c6 {
    public static final org.telegram.ui.Components.oa0 n;
    public static final org.telegram.ui.Components.oa0 r;
    public final int a;
    public final org.telegram.ui.Components.k9 b;
    public final org.telegram.ui.ActionBar.m5 c;
    public final TextView d;
    public final org.telegram.ui.Components.v8 e;
    public final org.telegram.ui.Components.ou0 f;
    public TLObject h;

    static {
        int i7 = org.telegram.ui.ActionBar.m6.y6;
        n = new org.telegram.ui.Components.oa0(R.drawable.msg_mini_checks, i7);
        r = new org.telegram.ui.Components.oa0(R.drawable.mini_checklist_done_outline, i7);
    }

    public lf0(Context context) {
        super(context);
        this.a = org.telegram.messenger.p10.s0;
        this.e = new org.telegram.ui.Components.v8((org.telegram.ui.ActionBar.h6) null);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.b = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(18.0f));
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
        this.c = m5Var;
        m5Var.setTextSize(16);
        m5Var.setEllipsizeByGradient(!org.telegram.messenger.id.a0);
        m5Var.setImportantForAccessibility(2);
        org.telegram.ui.ActionBar.t6.X(m5Var, org.telegram.ui.ActionBar.m6.E8, null);
        m5Var.setGravity(org.telegram.messenger.id.a0 ? 5 : 3);
        this.f = new org.telegram.ui.Components.ou0(this);
        m5Var.setDrawablePadding(org.telegram.messenger.g0.L(3.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 13.0f);
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setImportantForAccessibility(2);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.y6, null);
        textView.setGravity(org.telegram.messenger.id.a0 ? 5 : 3);
        if (org.telegram.messenger.id.a0) {
            addView(k9Var, c8.ha.d(34, 34.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
            addView(m5Var, c8.ha.d(-2, -2.0f, 53, 8.0f, 5.33f, 55.0f, 0.0f));
            addView(textView, c8.ha.d(-2, -2.0f, 53, 13.0f, 19.0f, 55.0f, 0.0f));
        } else {
            addView(k9Var, c8.ha.d(34, 34.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
            addView(m5Var, c8.ha.d(-2, -2.0f, 51, 55.0f, 5.33f, 8.0f, 0.0f));
            addView(textView, c8.ha.d(-2, -2.0f, 51, 55.0f, 19.0f, 13.0f, 0.0f));
        }
    }

    public final void a(TLObject tLObject, int i7, boolean z9) {
        this.h = tLObject;
        org.telegram.ui.Components.f5 a10 = this.f.a(tLObject, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.z9, false), false);
        org.telegram.ui.ActionBar.m5 m5Var = this.c;
        m5Var.i(a10);
        if (tLObject != null) {
            org.telegram.ui.Components.v8 v8Var = this.e;
            v8Var.p(tLObject);
            this.b.j(org.telegram.messenger.hc.m(this.a, 1, tLObject), "50_50", v8Var, tLObject);
            m5Var.l(org.telegram.messenger.g5.o(tLObject), false);
        }
        TextView textView = this.d;
        if (i7 <= 0) {
            textView.setVisibility(8);
            m5Var.setTranslationY(org.telegram.messenger.g0.L(9.0f));
        } else {
            textView.setText(TextUtils.concat((z9 ? r : n).a(getContext(), null), org.telegram.messenger.id.O(i7)));
            textView.setVisibility(0);
            m5Var.setTranslationY(0.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.z9));
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
            this.c.i(this.f.a(user, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.z9, false), true));
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
        String a02 = org.telegram.messenger.id.a0("AccDescrPersonHasSeen", null, 2131754812, this.c.getText());
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

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        org.telegram.ui.Components.ou0 ou0Var = this.f;
        if (ou0Var != null) {
            try {
                org.telegram.ui.Components.f5 f5Var = ou0Var.a;
                if (f5Var != null) {
                    int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.z9, false);
                    Integer num = f5Var.F;
                    if (num == null || num.intValue() == x02) {
                        return;
                    }
                    f5Var.k(Integer.valueOf(x02));
                    org.telegram.ui.ActionBar.m5 m5Var = this.c;
                    if (m5Var != null) {
                        m5Var.invalidate();
                    }
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }
}
