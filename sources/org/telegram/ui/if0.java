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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class if0 extends FrameLayout implements org.telegram.messenger.is, org.telegram.ui.ActionBar.z5 {
    public static final org.telegram.ui.Components.pa0 n;
    public static final org.telegram.ui.Components.pa0 r;
    public final int a;
    public final org.telegram.ui.Components.i9 b;
    public final org.telegram.ui.ActionBar.j5 c;
    public final TextView d;
    public final org.telegram.ui.Components.t8 e;
    public final org.telegram.ui.Components.pu0 f;
    public TLObject h;

    static {
        int i7 = org.telegram.ui.ActionBar.j6.y6;
        n = new org.telegram.ui.Components.pa0(R.drawable.msg_mini_checks, i7);
        r = new org.telegram.ui.Components.pa0(R.drawable.mini_checklist_done_outline, i7);
    }

    public if0(Context context) {
        super(context);
        this.a = org.telegram.messenger.m10.t0;
        this.e = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
        this.b = i9Var;
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(18.0f));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.c = j5Var;
        j5Var.setTextSize(16);
        j5Var.setEllipsizeByGradient(!org.telegram.messenger.hd.a0);
        j5Var.setImportantForAccessibility(2);
        org.telegram.ui.ActionBar.q6.X(j5Var, org.telegram.ui.ActionBar.j6.E8, null);
        j5Var.setGravity(org.telegram.messenger.hd.a0 ? 5 : 3);
        this.f = new org.telegram.ui.Components.pu0(this);
        j5Var.setDrawablePadding(org.telegram.messenger.g0.L(3.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 13.0f);
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setImportantForAccessibility(2);
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.y6, null);
        textView.setGravity(org.telegram.messenger.hd.a0 ? 5 : 3);
        if (org.telegram.messenger.hd.a0) {
            addView(i9Var, c8.ja.d(34, 34.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
            addView(j5Var, c8.ja.d(-2, -2.0f, 53, 8.0f, 5.33f, 55.0f, 0.0f));
            addView(textView, c8.ja.d(-2, -2.0f, 53, 13.0f, 19.0f, 55.0f, 0.0f));
        } else {
            addView(i9Var, c8.ja.d(34, 34.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
            addView(j5Var, c8.ja.d(-2, -2.0f, 51, 55.0f, 5.33f, 8.0f, 0.0f));
            addView(textView, c8.ja.d(-2, -2.0f, 51, 55.0f, 19.0f, 13.0f, 0.0f));
        }
    }

    public final void a(TLObject tLObject, int i7, boolean z10) {
        this.h = tLObject;
        org.telegram.ui.Components.e5 a10 = this.f.a(tLObject, org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.z9, false), false);
        org.telegram.ui.ActionBar.j5 j5Var = this.c;
        j5Var.i(a10);
        if (tLObject != null) {
            org.telegram.ui.Components.t8 t8Var = this.e;
            t8Var.p(tLObject);
            this.b.j(org.telegram.messenger.gc.m(this.a, 1, tLObject), "50_50", t8Var, tLObject);
            j5Var.l(org.telegram.messenger.g5.o(tLObject), false);
        }
        TextView textView = this.d;
        if (i7 <= 0) {
            textView.setVisibility(8);
            j5Var.setTranslationY(org.telegram.messenger.g0.L(9.0f));
        } else {
            textView.setText(TextUtils.concat((z10 ? r : n).a(getContext(), null), org.telegram.messenger.hd.O(i7)));
            textView.setVisibility(0);
            j5Var.setTranslationY(0.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.z9));
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.m5) {
            TLRPC.User user = (TLRPC.User) objArr[0];
            TLObject tLObject = this.h;
            TLRPC.User user2 = tLObject instanceof TLRPC.User ? (TLRPC.User) tLObject : null;
            if (user2 == null || user == null || user2.id != user.id) {
                return;
            }
            this.h = user;
            this.c.i(this.f.a(user, org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.z9, false), true));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f.a.a();
        org.telegram.messenger.ns.f(this.a).c(this, org.telegram.messenger.ns.m5);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f.a.b();
        org.telegram.messenger.ns.f(this.a).n(this, org.telegram.messenger.ns.m5);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String a02 = org.telegram.messenger.hd.a0("AccDescrPersonHasSeen", null, 2131754812, this.c.getText());
        TextView textView = this.d;
        if (textView.getVisibility() == 0) {
            StringBuilder m10 = r.b.m(a02, " ");
            m10.append((Object) textView.getText());
            a02 = m10.toString();
        }
        accessibilityNodeInfo.setText(a02);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        org.telegram.ui.Components.pu0 pu0Var = this.f;
        if (pu0Var != null) {
            try {
                org.telegram.ui.Components.e5 e5Var = pu0Var.a;
                if (e5Var != null) {
                    int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.z9, false);
                    Integer num = e5Var.G;
                    if (num == null || num.intValue() == x02) {
                        return;
                    }
                    e5Var.k(Integer.valueOf(x02));
                    org.telegram.ui.ActionBar.j5 j5Var = this.c;
                    if (j5Var != null) {
                        j5Var.invalidate();
                    }
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }
}
