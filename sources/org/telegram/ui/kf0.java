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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class kf0 extends FrameLayout implements org.telegram.messenger.fs, org.telegram.ui.ActionBar.c6 {
    public static final org.telegram.ui.Components.xa0 n;
    public static final org.telegram.ui.Components.xa0 r;
    public final int a;
    public final org.telegram.ui.Components.p9 b;
    public final org.telegram.ui.ActionBar.n5 c;
    public final TextView d;
    public final org.telegram.ui.Components.a9 e;
    public final org.telegram.ui.Components.zu0 f;
    public TLObject h;

    static {
        int i7 = org.telegram.ui.ActionBar.n6.y6;
        n = new org.telegram.ui.Components.xa0(R.drawable.msg_mini_checks, i7);
        r = new org.telegram.ui.Components.xa0(R.drawable.mini_checklist_done_outline, i7);
    }

    public kf0(Context context) {
        super(context);
        this.a = org.telegram.messenger.i10.t0;
        this.e = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.b = p9Var;
        p9Var.setRoundRadius(org.telegram.messenger.g0.L(18.0f));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.c = n5Var;
        n5Var.setTextSize(16);
        n5Var.setEllipsizeByGradient(!org.telegram.messenger.gd.a0);
        n5Var.setImportantForAccessibility(2);
        org.telegram.ui.ActionBar.u6.X(n5Var, org.telegram.ui.ActionBar.n6.E8, null);
        n5Var.setGravity(org.telegram.messenger.gd.a0 ? 5 : 3);
        this.f = new org.telegram.ui.Components.zu0(this);
        n5Var.setDrawablePadding(org.telegram.messenger.g0.L(3.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 13.0f);
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setImportantForAccessibility(2);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.y6, null);
        textView.setGravity(org.telegram.messenger.gd.a0 ? 5 : 3);
        if (org.telegram.messenger.gd.a0) {
            addView(p9Var, c8.na.d(34, 34.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
            addView(n5Var, c8.na.d(-2, -2.0f, 53, 8.0f, 5.33f, 55.0f, 0.0f));
            addView(textView, c8.na.d(-2, -2.0f, 53, 13.0f, 19.0f, 55.0f, 0.0f));
        } else {
            addView(p9Var, c8.na.d(34, 34.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
            addView(n5Var, c8.na.d(-2, -2.0f, 51, 55.0f, 5.33f, 8.0f, 0.0f));
            addView(textView, c8.na.d(-2, -2.0f, 51, 55.0f, 19.0f, 13.0f, 0.0f));
        }
    }

    public final void a(TLObject tLObject, int i7, boolean z10) {
        this.h = tLObject;
        org.telegram.ui.Components.m5 a10 = this.f.a(tLObject, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.z9, false), false);
        org.telegram.ui.ActionBar.n5 n5Var = this.c;
        n5Var.i(a10);
        if (tLObject != null) {
            org.telegram.ui.Components.a9 a9Var = this.e;
            a9Var.p(tLObject);
            this.b.j(org.telegram.messenger.fc.m(this.a, 1, tLObject), "50_50", a9Var, tLObject);
            n5Var.l(org.telegram.messenger.i5.o(tLObject), false);
        }
        TextView textView = this.d;
        if (i7 <= 0) {
            textView.setVisibility(8);
            n5Var.setTranslationY(org.telegram.messenger.g0.L(9.0f));
        } else {
            textView.setText(TextUtils.concat((z10 ? r : n).a(getContext(), null), org.telegram.messenger.gd.O(i7)));
            textView.setVisibility(0);
            n5Var.setTranslationY(0.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.z9));
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.p5) {
            TLRPC.User user = (TLRPC.User) objArr[0];
            TLObject tLObject = this.h;
            TLRPC.User user2 = tLObject instanceof TLRPC.User ? (TLRPC.User) tLObject : null;
            if (user2 == null || user == null || user2.id != user.id) {
                return;
            }
            this.h = user;
            this.c.i(this.f.a(user, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.z9, false), true));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f.a.a();
        org.telegram.messenger.ks.f(this.a).c(this, org.telegram.messenger.ks.p5);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f.a.b();
        org.telegram.messenger.ks.f(this.a).n(this, org.telegram.messenger.ks.p5);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String a02 = org.telegram.messenger.gd.a0("AccDescrPersonHasSeen", null, 2131754811, this.c.getText());
        TextView textView = this.d;
        if (textView.getVisibility() == 0) {
            StringBuilder n10 = p5.c.n(a02, " ");
            n10.append((Object) textView.getText());
            a02 = n10.toString();
        }
        accessibilityNodeInfo.setText(a02);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        org.telegram.ui.Components.zu0 zu0Var = this.f;
        if (zu0Var != null) {
            try {
                org.telegram.ui.Components.m5 m5Var = zu0Var.a;
                if (m5Var != null) {
                    int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.z9, false);
                    Integer num = m5Var.G;
                    if (num == null || num.intValue() == x02) {
                        return;
                    }
                    m5Var.k(Integer.valueOf(x02));
                    org.telegram.ui.ActionBar.n5 n5Var = this.c;
                    if (n5Var != null) {
                        n5Var.invalidate();
                    }
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }
}
